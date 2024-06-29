import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class162 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
    public static boolean field2401 = true;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "[I")
    public static int[] field2402 = new int[256];

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field2403;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2402[var0] = var1;
        }
        field2404 = 0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 4)
    public static void method1211(int arg0) {
        if (arg0 != 6767) {
            field2402 = null;
        }
        field2402 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(CB)C", line = 14)
    public static final char method1212(char arg0, byte arg1) {
        if (arg1 >= -59) {
            method1213(-34, 113, (int[]) null, 81, (byte) 108, 113, -44, (class151) null, true, 13, 107, 5, (int[]) null, 20, -102);
        }
        field2399++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[IIBIILoa;ZIII[III)I", line = 413)
    public static final int method1213(int arg0, int arg1, int[] arg2, int arg3, byte arg4, int arg5, int arg6, class151 arg7, boolean arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        field2400++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class161.field2398[var15][var35] = 0;
                class416.field5822[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg10 == 1) {
            var16 = class166.method1241(arg3, arg5, (byte) 86, arg0, arg9, arg14, arg11, arg6, arg1, arg7, arg13);
        } else if (arg10 == 2) {
            var16 = class394.method2425((byte) -124, arg9, arg5, arg0, arg13, arg7, arg3, arg6, arg14, arg11, arg1);
        } else {
            var16 = class204.method1422(arg11, arg7, arg3, arg5, arg14, arg6, arg0, arg9, arg10, arg1, -1, arg13);
        }
        int var17 = arg1 - 64;
        int var18 = arg11 - 64;
        if (arg4 >= -29) {
            field2401 = false;
        }
        int var19 = class286.field3826;
        int var20 = class268.field3612;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg14 - var23; var24 <= arg14 + var23; var24++) {
                for (int var25 = arg6 - var23; var25 <= (arg6 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class416.field5822[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg14 > var24) {
                            var28 = arg14 - var24;
                        } else if ((arg13 + arg14 - 1) < var24) {
                            var28 = var24 + 1 - arg14 - arg13;
                        }
                        int var29 = 0;
                        if (arg6 > var25) {
                            var29 = arg6 - var25;
                        } else if (arg6 + arg9 - 1 < var25) {
                            var29 = var25 - (arg6 + arg9 - 1);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && var22 > class416.field5822[var26][var27]) {
                            var22 = class416.field5822[var26][var27];
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg11 == var20) {
            return 0;
        }
        byte var31 = 0;
        class358.field4854[var31] = var19;
        int var37 = var31 + 1;
        class52.field847[var31] = var20;
        int var32;
        int var33 = var32 = class161.field2398[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg11 != var20) {
            if (var32 != var33) {
                class358.field4854[var37] = var19;
                var32 = var33;
                class52.field847[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class161.field2398[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg12[var34] = class358.field4854[var37];
            arg2[var34++] = class52.field847[var37];
            if (var34 >= arg12.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lap;I)Lip;", line = 592)
    public static final class49 method1214(class289 arg0, int arg1) {
        if (arg1 != 12926) {
            method1212('9', (byte) 86);
        }
        field2403++;
        class49 var2 = new class49();
        var2.field833 = arg0.method1853(-73);
        var2.field834 = class335.method2122(var2.field833, 96);
        return var2;
    }
}
