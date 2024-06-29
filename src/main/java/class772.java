import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class772 extends class593 {

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "Z")
    private boolean field10998 = false;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11008 = new String[] { method5564(method5563(" \u000b\u000e,<{")), method5564(method5563("(@A,\u0000")), method5564(method5563(" \u000b\u000e,?{")), method5564(method5563("=\u001b\u0003n")), method5564(method5563(" \u000b\u000e,:{")), method5564(method5563(" \u000b\u000e,>{")), method5564(method5563(" \u000b\u000e,4{")), method5564(method5563(" \u000b\u000e,5{")), method5564(method5563(" \u000b\u000e,8{")), method5564(method5563(" \u000b\u000e,9{")), method5564(method5563(" \u000b\u000e,;{")) };

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field11000 = 0;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "[[I")
    public static int[][] field11003 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field10997;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field10999;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
    public static int field11001;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field11002;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public static int field11004;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field11005;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
    public static int field11006;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field11007;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "Lwh;")
    public static class350 field10996;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        try {
            if (!this.field10998) {
                super.field8530.method2670(-128, 0, class784.field11325);
            } else {
                super.field8530.method2661(121, 1);
                super.field8530.method2062(-5138, class289.field4086);
                super.field8530.method2624(class539.field7920, (byte) 119, class539.field7920);
                super.field8530.method2655(arg0 ^ -15225, 2, class659.field9335);
                super.field8530.method2670(arg0 + 15098, 0, class784.field11325);
                super.field8530.method2625(Integer.MAX_VALUE);
                super.field8530.method2668(24, (class764) null);
                super.field8530.method2661(93, 0);
                this.field10998 = false;
            }
            ++field11006;
            if (arg0 != -15226) {
                this.method454(-109, false);
            }
            super.field8530.method2624(class539.field7920, (byte) 119, class539.field7920);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11008[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IBLah;)V")
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            super.field8530.method2668(24, arg2);
            ++field11004;
            if (arg1 != -106) {
                this.field10998 = true;
            }
            super.field8530.method2679(2, arg0);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11008[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11008[1] : field11008[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BZ)V")
    public final void method460(byte arg0, boolean arg1) {
        try {
            super.field8530.method2624(class539.field7920, (byte) 120, class256.field3668);
            ++field10999;
            if (arg0 != -20) {
                field11000 = 37;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11008[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/awt/Component;Z)Lrw;")
    public static final class331 method5560(Component arg0, boolean arg1) {
        try {
            if (!arg1) {
                field11000 = 85;
            }
            ++field11001;
            return new class677(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11008[2] + (arg0 != null ? field11008[1] : field11008[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)Z")
    public final boolean method458(int arg0) {
        try {
            ++field10997;
            if (arg0 <= 70) {
                this.method463(-85, -48, (byte) 113);
            }
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11008[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Ljj;)V")
    public class772(class334 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIB)V")
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            ++field11005;
            if (arg2 > -98) {
                this.method463(-18, -89, (byte) 84);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11008[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
    public final void method454(int arg0, boolean arg1) {
        try {
            ++field11007;
            class361 var3 = super.field8530.method2676(1);
            if (var3 != null && arg1) {
                super.field8530.method2661(95, 1);
                super.field8530.method2668(24, var3);
                super.field8530.method2062(-5138, class650.field9234);
                super.field8530.method2661(99, 1);
                super.field8530.method2624(class795.field11565, (byte) 96, class256.field3668);
                super.field8530.method2096(true, false, (byte) -92, class514.field7551, 2);
                super.field8530.method2670(-128, 0, class801.field11657);
                class639 var4 = super.field8530.method2642(true);
                var4.method4652(super.field8530.method2641(2), -90);
                super.field8530.method2650(class433.field6275, -83);
                super.field8530.method2661(107, 0);
                this.field10998 = true;
            } else {
                super.field8530.method2670(-128, 0, class801.field11657);
            }
            int var5 = 115 / ((arg0 - -51) / 39);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11008[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "(I)V")
    public static void method5561(int arg0) {
        try {
            field11003 = null;
            field10996 = null;
            if (arg0 != -27537) {
                field11000 = -46;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11008[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILlga;IBZ)V")
    public static final void method5562(int arg0, int arg1, class47 arg2, int arg3, byte arg4, boolean arg5) {
        try {
            class224.method1873(arg5, arg1, arg2, 0L, arg0, arg3, -80);
            ++field11002;
            if (arg4 != 55) {
                method5561(12);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11008[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11008[1] : field11008[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5563(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 125);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5564(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
