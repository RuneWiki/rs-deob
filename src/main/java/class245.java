import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class245 extends class428 {

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field3796 = new String[] { method2113(method2112("\u00112}~'")), method2113(method2112("\u00112}z'")), method2113(method2112("\u00112}|'")), method2113(method2112("\u00112}{'")), method2113(method2112("\u00112}x'")), method2113(method2112("\u00112}w'")), method2113(method2112("\u00112}}'")), method2113(method2112("\u00112}v'")), method2113(method2112("\u000f\u007f}\u0011r")), method2113(method2112("\u001a$?S")), method2113(method2112("\u00112}y'")) };

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Lhm;")
    public static class230 field3774 = new class230(14, 0);

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Lhm;")
    public static class230 field3778 = new class230(15, 4);

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lhm;")
    public static class230 field3780 = new class230(16, -2);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lhm;")
    public static class230 field3782 = new class230(17, 0);

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Lhm;")
    public static class230 field3783 = new class230(19, -2);

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lhm;")
    public static class230 field3784 = new class230(22, -2);

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lhm;")
    public static class230 field3785 = new class230(23, 4);

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lhm;")
    public static class230 field3786 = new class230(24, -1);

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lhm;")
    public static class230 field3787 = new class230(26, 0);

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lhm;")
    public static class230 field3788 = new class230(27, 0);

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lhm;")
    public static class230 field3789 = new class230(28, -2);

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "Lhm;")
    public static class230 field3790 = new class230(29, -2);

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Lhm;")
    public static class230 field3791 = new class230(30, -2);

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "[Lhm;")
    private static class230[] field3792 = new class230[32];

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "[[[Z")
    public static boolean[][][] field3795;

    static {
        class230[] var0 = class747.method5435((byte) -97);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field3792[var0[var1].field3568] = var0[var1];
        }
        field3794 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V", line = 4)
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 100) {
                this.method1219(-101, 47, -118);
            }
            ++field3771;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3796[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z", line = 14)
    public static final boolean method2109(int arg0, int arg1) {
        try {
            ++field3779;
            int var2 = -79 % ((-17 - arg1) / 62);
            return arg0 == 4 || arg0 == 8 || ~arg0 == -13 || arg0 == 10;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3796[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lln;BI)V", line = 24)
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            ++field3773;
            super.field6741.method2233((byte) -98, arg0);
            super.field6741.method2258(arg2, (byte) -125);
            if (arg1 <= 7) {
                field3778 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3796[10] + (arg0 != null ? field3796[8] : field3796[9]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)V", line = 39)
    public final void method1225(boolean arg0, int arg1) {
        try {
            ++field3776;
            if (arg1 != 29145) {
                this.method1224(false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3796[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V", line = 50)
    public final void method1221(int arg0, boolean arg1) {
        try {
            if (arg0 != 6056) {
                field3782 = null;
            }
            ++field3775;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3796[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)V", line = 62)
    public static void method2110(int arg0) {
        try {
            field3792 = null;
            field3785 = null;
            field3778 = null;
            field3784 = null;
            field3787 = null;
            field3790 = null;
            if (arg0 != 0) {
                method2110(52);
            }
            field3774 = null;
            field3791 = null;
            field3786 = null;
            field3789 = null;
            field3783 = null;
            field3788 = null;
            field3795 = null;
            field3782 = null;
            field3780 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3796[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lgca;)V", line = 87)
    public class245(class261 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 90)
    public final void method1224(boolean arg0) {
        try {
            ++field3772;
            if (!arg0) {
                field3793 = -42;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3796[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)Z", line = 100)
    public final boolean method1226(int arg0) {
        try {
            ++field3781;
            return arg0 >= -111;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3796[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I", line = 112)
    public static final int method2111(int arg0, int arg1) {
        try {
            ++field3777;
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 + -61440;
            if (arg1 != 26762) {
                method2109(-44, 118);
            }
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3796[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2112(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2113(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
