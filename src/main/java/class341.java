import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class341 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lpja;")
    private class43 field4594 = new class43(64);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lgj;")
    private class662 field4598;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lgj;")
    private class662 field4597;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "[Lfca;")
    public static class93[] field4601 = new class93[2048];

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Lfja;")
    public static class783 field4599 = new class783(16, 4);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Lgj;")
    public static class662 field4600;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Lgj;")
    public static class662 field4603;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 4)
    public static void method2122(byte arg0) {
        field4601 = null;
        if (arg0 > 8) {
            field4599 = null;
            field4600 = null;
            field4603 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;IZI)I", line = 30)
    public static final int method2123(String arg0, int arg1, boolean arg2, int arg3) {
        field4595++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 != -9105) {
            method2122((byte) -75);
        }
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
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

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Ltj;", line = 118)
    public final class210 method2124(int arg0, int arg1) {
        field4596++;
        class210 var3 = (class210) this.field4594.method266((byte) -128, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        int var4 = -84 / ((-arg0 - 55) / 44);
        byte[] var5;
        if (arg1 < 32768) {
            var5 = this.field4598.method3732(arg1, 8906, 0);
        } else {
            var5 = this.field4597.method3732(arg1 & 0x7FFF, 8906, 0);
        }
        class210 var6 = new class210();
        if (var5 != null) {
            var6.method1480(-1, new class93(var5));
        }
        if (arg1 >= 32768) {
            var6.method1472((byte) -120);
        }
        this.field4594.method270(var6, (long) arg1, -126);
        return var6;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(ILgj;Lgj;)V", line = 163)
    public class341(int arg0, class662 arg1, class662 arg2) {
        this.field4598 = arg1;
        this.field4597 = arg2;
        if (this.field4598 != null) {
            this.field4598.method3730((byte) -120, 0);
        }
        if (this.field4597 != null) {
            this.field4597.method3730((byte) 30, 0);
        }
    }
}
