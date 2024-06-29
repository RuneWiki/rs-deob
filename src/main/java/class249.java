import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class249 extends class62 {

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[I")
    public static int[] field3552 = new int[99];

    @OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
    public static int[] field3555;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3556;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "[I")
    public static int[] field3560;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
    public static final void method1692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 2) {
            return;
        }
        field3559++;
        if (class81.field946 <= arg3 && class235.field3295 >= arg4 && arg0 >= class388.field5464 && arg1 <= class219.field3080) {
            class49.method281(arg3, arg0, arg5, arg4, false, arg1);
        } else {
            class202.method1345(true, arg0, arg1, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
    public static final void method1693(int arg0, int arg1, int arg2, int arg3) {
        field3553++;
        if (arg3 < 36) {
            method1692(-52, -92, 66, -11, -83, 37);
        }
        if (arg0 == 1007) {
            class201.method1335(10, arg1, arg2);
        } else if (arg0 == 1004) {
            class201.method1335(11, arg1, arg2);
        } else if (arg0 == 1011) {
            class201.method1335(12, arg1, arg2);
        } else if (arg0 == 1012) {
            class201.method1335(13, arg1, arg2);
        } else if (arg0 == 1002) {
            class201.method1335(14, arg1, arg2);
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
    public static final boolean method1694(byte arg0) {
        int var1 = -100 % ((53 - arg0) / 43);
        field3557++;
        return class237.field3389 != 0 || class135.field1685 >= 2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)I")
    public static final int method1695(int arg0, byte arg1) {
        if (arg1 != 15) {
            field3552 = null;
        }
        field3551++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILae;IILbk;IIIIIZLkb;III)Lbk;")
    public static final class210 method1696(int arg0, class134 arg1, int arg2, int arg3, class210 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, class412 arg11, int arg12, int arg13, int arg14) {
        field3554++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg11 != null) {
            int var16 = var15 | arg11.method2625(-1, arg6, arg8 + 110, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg7 << 32) + (long) ((arg9 << 16) + (arg3 << 24) + arg14) + ((long) arg0 << 48);
        class237 var19 = class334.field4723;
        class210 var20;
        synchronized (class334.field4723) {
            var20 = (class210) class334.field4723.method1625(var17, 0);
        }
        if (var20 == null || arg1.method689(var20.method1410(), var15) != 0) {
            if (var20 != null) {
                var15 = arg1.method625(var15, var20.method1410());
            }
            byte var21;
            if (arg14 == 1) {
                var21 = 9;
            } else if (arg14 == 2) {
                var21 = 12;
            } else if (arg14 == 3) {
                var21 = 15;
            } else if (arg14 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class160 var24 = new class160((var21 * var22) + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method1021(0, 0, 1, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class158.field2055[var31] * var28 >> 15;
                    int var33 = class158.field2059[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1021(0, var32, 1, var33);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg3 * var35 + arg9 * var36 >> 8);
                short var38 = (short) (((arg0 & 0x7F) * var35 + (arg7 & 0x7F) * var36 & 0x7F00) + ((arg0 & 0xFC00) * var35 + (arg7 & 0xFC00) * var36 & 0xFC0000) + ((arg0 & 0x380) * var35 + (arg7 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1025(var25, var38, (byte) -1, var37, var26[0][(var39 + 1) % var21], (short) -1, var26[0][var39], (byte) 1, true);
                    } else {
                        var24.method1025(var26[var34 - 1][var39], var38, (byte) -1, var37, var26[var34 - 1][(var39 + 1) % var21], (short) -1, var26[var34][(var39 + 1) % var21], (byte) 1, true);
                        var24.method1025(var26[var34 - 1][var39], var38, (byte) -1, var37, var26[var34][(var39 + 1) % var21], (short) -1, var26[var34][var39], (byte) 1, true);
                    }
                }
            }
            var20 = arg1.method605(var24, var15, class360.field5134, 64, 768);
            class237 var40 = class334.field4723;
            synchronized (class334.field4723) {
                class334.field4723.method1622((byte) 13, var20, var17);
            }
        }
        int var41 = arg14 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg10) {
            if (arg2 > 1024 && arg2 < 7168) {
                var42 -= 128;
            }
            if (arg2 > 13312 || arg2 < 3072) {
                var43 -= 128;
            }
            if (arg2 > 5120 && arg2 < 11264) {
                var45 = var41 + 128;
            }
            if (arg2 > 9216 && arg2 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg4.method1422();
        int var47 = arg4.method1415();
        int var48 = arg4.method1395();
        int var49 = arg4.method1377();
        if (arg8 != 0) {
            return null;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class64 var50 = null;
        if (arg11 != null) {
            int var51 = arg11.field5925[arg6];
            var50 = class229.method1526(var51 >> 16, -16026);
            arg6 = var51 & 0xFFFF;
        }
        class210 var52;
        if (var50 == null) {
            var52 = var20.method1411((byte) 3, var15, true);
            var52.method1420((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1388((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1411((byte) 3, var15, true);
            var52.method1420((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1388((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method1396(arg6, var50, -28);
        }
        if (arg12 != 0) {
            var52.method1403(arg12);
        }
        if (arg5 != 0) {
            var52.method1407(arg5);
        }
        if (arg13 != 0) {
            var52.method1388(0, arg13, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method1697(byte arg0) {
        field3556 = null;
        field3560 = null;
        int var1 = -49 / ((55 - arg0) / 50);
        field3552 = null;
        field3555 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3552[var1] = var0 / 4;
        }
        field3555 = new int[5];
        field3556 = new String[5];
        field3558 = 2;
    }
}
