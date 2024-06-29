import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class79 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lmo;")
    private class447 field1219 = new class447();

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lad;")
    private class244 field1233 = new class244();

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Lbr;")
    private class223 field1231;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field1230 = -1;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Z")
    public static volatile boolean field1232 = false;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1220 = 0;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lvk;")
    public static class207 field1228;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;ZII)I", line = 8)
    public static final int method562(String arg0, boolean arg1, int arg2, int arg3) {
        field1229++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        int var5 = 6 % ((arg3 - 44) / 58);
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg1) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var12) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var7 + var12;
            if (var11 / arg2 != var7) {
                throw new NumberFormatException();
            }
            var7 = var11;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V", line = 86)
    public final void method563(boolean arg0) {
        field1225++;
        this.field1233.method1529(-124);
        this.field1231.method1418((byte) -98);
        this.field1219 = new class447();
        if (arg0) {
            field1220 = 108;
        }
        this.field1226 = this.field1227;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 221)
    public class79(int arg0) {
        this.field1227 = arg0;
        this.field1226 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1231 = new class223(var2);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILqj;Z)Ldi;", line = 114)
    public static final class65 method564(int arg0, class296 arg1, boolean arg2) {
        field1224++;
        if (!arg2) {
            method566((byte) 87);
        }
        byte[] var3 = arg1.method1904(arg0, 255);
        return var3 == null ? null : new class65(var3);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILmo;J)V", line = 132)
    public final void method565(int arg0, class447 arg1, long arg2) {
        field1221++;
        if (~this.field1226 == arg0) {
            class447 var5 = this.field1233.method1533(-4174);
            var5.method2459(198);
            var5.method2788((byte) -91);
            if (this.field1219 == var5) {
                class447 var6 = this.field1233.method1533(-4174);
                var6.method2459(198);
                var6.method2788((byte) -94);
            }
        } else {
            this.field1226--;
        }
        this.field1231.method1419(arg2, 77, arg1);
        this.field1233.method1530(arg1, true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 168)
    public static void method566(byte arg0) {
        if (arg0 == 57) {
            field1228 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BJ)Lmo;", line = 179)
    public final class447 method567(byte arg0, long arg1) {
        field1223++;
        if (arg0 < 53) {
            field1222 = 31;
        }
        class447 var4 = (class447) this.field1231.method1412((byte) -54, arg1);
        if (var4 != null) {
            this.field1233.method1530(var4, true);
        }
        return var4;
    }
}
