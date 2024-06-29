import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class117 extends class54 {

    @OriginalMember(owner = "client!er", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1401 = new String[] { method1036(method1035("P\u0001c.")), method1036(method1035("[\u0006!\u0003<")), method1036(method1035("EZ!li")), method1036(method1035("[\u0006!\u0004<")), method1036(method1035("[\u0006!\u0007<")), method1036(method1035("[\u0006!\u0000<")), method1036(method1035("[\u0006!\u0006<")), method1036(method1035("[\u0006!\u000b<")), method1036(method1035("[\u0006!\b<")), method1036(method1035("[\u0006!\u0005<")), method1036(method1035("[\u0006!\t<")), method1036(method1035("[\u0006!\u0001<")), method1036(method1035("[\u0006!\n<")) };

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field1395 = 0;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Lwia;")
    public static class790 field1388 = new class790(48, 4);

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            if (arg0 != 0) {
                this.method1028(true);
            }
            ++field1396;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1401[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(Z)I")
    public final int method1028(boolean arg0) {
        try {
            ++field1391;
            if (arg0) {
                this.method111(false);
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1401[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
    public static void method1029(int arg0) {
        try {
            if (arg0 < 11) {
                method1031(-0.19293441F, 117, -0.043154012F, 61, 0.45770112F, -0.6961755F, 47, -0.53019017F, 106, (class227) null, 25);
            }
            field1388 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1401[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field1398;
            if (arg2 != 1) {
                field1388 = null;
            }
            class360.method2928(0, arg0, arg5, arg3, arg4, arg6, arg7, 512, arg8, arg1);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1401[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FIFIFFIFILjf;I)[B")
    public static final byte[] method1031(float arg0, int arg1, float arg2, int arg3, float arg4, float arg5, int arg6, float arg7, int arg8, class227 arg9, int arg10) {
        try {
            ++field1390;
            byte[] var11 = new byte[arg8 * arg10 * arg3];
            class239.method2048((byte) -127, arg2, arg7, arg10, arg4, arg6, var11, arg3, arg5, arg8, arg9, arg1, arg0);
            return var11;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field1401[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field1401[2] : field1401[0]) + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lla;IZIZII)V")
    public static final void method1032(class476 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        try {
            if (arg3 > 0) {
                class336.field5242 = arg2;
                class494.field7093 = null;
                class84.field940 = 1;
                class573.field8466 = arg6;
                class550.field8199 = arg1;
                class166.field2289 = arg0;
                class252.field3914 = arg5;
                class515.field7438 = class396.field5927.method4588((byte) -87) / arg3;
                if (class515.field7438 < 1) {
                    class515.field7438 = 1;
                }
            } else {
                class638.method4683(arg1, arg0, 0, arg2, arg6, arg5);
            }
            if (arg4) {
                ++field1397;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1401[1] + (arg0 != null ? field1401[2] : field1401[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                field1395 = 33;
            }
            ++field1389;
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1401[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1033(int arg0, int arg1, byte arg2) {
        try {
            ++field1393;
            if (arg2 > -34) {
                return true;
            } else {
                return class58.method429(arg0, arg1, 824) | ~(arg0 & 458752) != -1 || class531.method4018(3, arg1, arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1401[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([JI[I)V")
    public static final void method1034(long[] arg0, int arg1, int[] arg2) {
        try {
            if (arg1 >= -112) {
                method1029(89);
            }
            ++field1399;
            class171.method1519(arg0, arg0.length + -1, (byte) -85, arg2, 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1401[10] + (arg0 != null ? field1401[2] : field1401[0]) + ',' + arg1 + ',' + (arg2 != null ? field1401[2] : field1401[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(ILhia;)V")
    public class117(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (!arg0) {
                this.method115(true);
            }
            ++field1394;
            if (super.field593 != 1 && ~super.field593 != -1) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1401[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                field1388 = null;
            }
            ++field1400;
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1401[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lhia;)V")
    public class117(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1035(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1036(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
