import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class58 {

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "[S")
    public static short[] field916 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Lwr;")
    public static class41 field918;

    static {
        new class112("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field919 = -1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 3)
    public static final void method433(int arg0) {
        field915++;
        if (arg0 < 36) {
            field916 = null;
        }
        class161.field2310 = 0;
        class250.field3514.method1552((byte) 117);
        class351.field4800 = false;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lkm;IIBIIZIILqg;ILab;III)Lab;", line = 20)
    public static final class232 method434(class487 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class372 arg9, int arg10, class232 arg11, int arg12, int arg13, int arg14) {
        field913++;
        if (arg11 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg9 != null) {
            int var16 = var15 | arg9.method2227(arg10, -1, false, 128);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg8 << 32) + ((long) arg14 << 48) + (long) (arg7 - (-(arg1 << 16) + -(arg2 << 24)));
        class104 var19 = class152.field2155;
        class232 var20;
        synchronized (class152.field2155) {
            var20 = (class232) class152.field2155.method659(var17, arg3);
        }
        if (var20 == null || arg0.method1102(var20.method50(), var15) != 0) {
            if (var20 != null) {
                var15 = arg0.method1067(var15, var20.method50());
            }
            byte var21;
            if (arg7 == 1) {
                var21 = 9;
            } else if (arg7 == 2) {
                var21 = 12;
            } else if (arg7 == 3) {
                var21 = 15;
            } else if (arg7 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class85 var24 = new class85(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method586(0, 1, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class432.field5955[var31] * var28 >> 15;
                    int var33 = class432.field5957[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method586(var32, 1, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg1 * var36 + arg2 * var35 >> 8);
                short var38 = (short) (((arg8 & 0xFC00) * var36 + (arg14 & 0xFC00) * var35 & 0xFC0000) + ((arg8 & 0x7F) * var36 + (arg14 & 0x7F) * var35 & 0x7F00) + ((arg8 & 0x380) * var36 + (arg14 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method592(var26[0][var39], var26[0][(var39 + 1) % var21], (short) -1, var38, (byte) 1, var37, (byte) -1, var25, (byte) 15);
                    } else {
                        var24.method592(var26[var34][(var39 + 1) % var21], var26[var34 - 1][(var39 + 1) % var21], (short) -1, var38, (byte) 1, var37, (byte) -1, var26[var34 - 1][var39], (byte) 15);
                        var24.method592(var26[var34][var39], var26[var34][(var39 + 1) % var21], (short) -1, var38, (byte) 1, var37, (byte) -1, var26[var34 - 1][var39], (byte) 15);
                    }
                }
            }
            var20 = arg0.method1088(var24, var15, class165.field2431, 64, 768);
            class104 var40 = class152.field2155;
            synchronized (class152.field2155) {
                class152.field2155.method653(arg3 + 44, var17, var20);
            }
        }
        int var41 = arg7 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg6) {
            if (arg13 > 13312 || arg13 < 3072) {
                var43 -= 128;
            }
            if (arg13 > 9216 && arg13 < 15360) {
                var44 = var41 + 128;
            }
            if (arg13 > 1024 && arg13 < 7168) {
                var42 -= 128;
            }
            if (arg13 > 5120 && arg13 < 11264) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg11.method64();
        int var47 = arg11.method65();
        int var48 = arg11.method52();
        int var49 = arg11.method37();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class13 var50 = null;
        if (arg9 != null) {
            int var51 = arg9.field5278[arg10];
            var50 = class31.field505.method949(var51 >> 16, 83);
            arg10 = var51 & 0xFFFF;
        }
        class232 var52;
        if (var50 == null) {
            var52 = var20.method51((byte) 3, var15, true);
            var52.method26((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method54((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method51((byte) 3, var15, true);
            var52.method26((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method54((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method1463(arg10, -125, var50);
        }
        if (arg5 != 0) {
            var52.method62(arg5);
        }
        if (arg4 != 0) {
            var52.method34(arg4);
        }
        if (arg12 != 0) {
            var52.method54(0, arg12, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)Lwj;", line = 239)
    public static final class334 method435(byte arg0, int arg1) {
        field920++;
        if (class449.field6183 && arg1 >= class189.field2716 && class361.field5041 >= arg1) {
            if (arg0 != 47) {
                field914 = -32;
            }
            return class106.field1527[arg1 - class189.field2716];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 261)
    public static void method436(byte arg0) {
        if (arg0 == 1) {
            field916 = null;
            field918 = null;
        }
    }
}
