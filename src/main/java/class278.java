import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class278 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lrp;")
    private class288 field4223 = new class288(64);

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Llt;")
    private class458 field4231;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Loe;")
    public static class127 field4229 = new class127(103, 28);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        int var1 = 7 / ((-arg0 - 31) / 58);
        field4229 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public final void method1699(boolean arg0) {
        class288 var2 = this.field4223;
        synchronized (this.field4223) {
            this.field4223.method1761(-113);
        }
        field4226++;
        if (!arg0) {
            method1698((byte) -83);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;BIZ)I")
    public static final int method1700(String arg0, byte arg1, int arg2, boolean arg3) {
        field4228++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        if (arg1 <= 0) {
            field4229 = null;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)Lm;")
    public final class120 method1701(int arg0, byte arg1) {
        field4227++;
        class288 var3 = this.field4223;
        class120 var4;
        synchronized (this.field4223) {
            var4 = (class120) this.field4223.method1752(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4231.method2715(arg0, 35, false);
        class120 var6 = new class120();
        int var7 = -44 / ((-arg1 - 41) / 53);
        if (var5 != null) {
            var6.method835(new class40(var5), 11784);
        }
        var6.method836(true);
        class288 var8 = this.field4223;
        synchronized (this.field4223) {
            this.field4223.method1758(1, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method1702(String arg0, int arg1, byte arg2) {
        field4224++;
        class64 var3 = class230.method1387(arg1, (byte) 40, 3);
        if (arg2 < -117) {
            var3.method441((byte) 58);
            var3.field1057 = arg0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lia;II)V")
    public static final void method1703(class399 arg0, int arg1, int arg2) {
        field4232++;
        class287.field4352 = 0;
        class498.field7560 = false;
        if (arg2 != -14695) {
            field4229 = null;
        }
        class498.method2996(arg0, (byte) -101);
        class330.method2049(arg0, arg2 - 6871);
        if (class498.field7560) {
            System.out.println("---endgpp---");
        }
        if (arg0.field585 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field585 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method1704(int arg0) {
        class288 var2 = this.field4223;
        synchronized (this.field4223) {
            if (arg0 < 63) {
                field4229 = null;
            }
            this.field4223.method1749((byte) -64);
        }
        field4230++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public final void method1705(int arg0, int arg1) {
        field4225++;
        if (arg1 != 55) {
            method1702(null, -4, (byte) -10);
        }
        class288 var3 = this.field4223;
        synchronized (this.field4223) {
            this.field4223.method1760(arg0, 30398);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class278(class491 arg0, int arg1, class458 arg2) {
        this.field4231 = arg2;
        if (this.field4231 != null) {
            this.field4231.method2726((byte) 113, 35);
        }
    }
}
