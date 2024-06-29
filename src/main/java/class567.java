import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class567 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Ljw;")
    private static class520 field7491 = new class520(16);

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "[S")
    private static short[] field7505 = new short[1];

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "[B")
    private static byte[] field7503 = new byte[1];

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field7507 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field7509 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "Lgj;")
    public static class593 field7508 = new class593();

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "F")
    public static float field7502;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "F")
    public static float field7506;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "Laba;")
    public static class163 field7495;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "Ldca;")
    public static class164 field7500;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "Lrea;")
    public static class195 field7499;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Lik;")
    private static class197 field7496;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Luk;")
    public static class242 field7498;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Lkd;")
    public static class261 field7493;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lo;")
    public static class28 field7494;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "Lbi;")
    public static class449 field7497;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "Ljw;")
    private static class520 field7519;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "Lrg;")
    private static class601 field7492;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "[B")
    private static byte[] field7512;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "[B")
    private static byte[] field7520;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "[B")
    private static byte[] field7522;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "[B")
    private static byte[] field7523;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "[B")
    private static byte[] field7524;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "[I")
    private static int[] field7516;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "[S")
    private static short[] field7530;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "[S")
    private static short[] field7531;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "[[[B")
    public static byte[][][] field7501;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "[[[Laea;")
    private static class47[][][] field7526;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()V", line = 5)
    private static final void method3102() {
        for (int var0 = 0; var0 < field7513; var0++) {
            for (int var11 = 0; var11 < field7528; var11++) {
                int var12 = field7531[field7513 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class694 var13 = (class694) field7519.method2918((long) (var0 << 16 | var11), (byte) 67);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field9752.length; var14++) {
                                class58 var15 = field7499.method1258(var13.field9752[var14] & 0xFFFF, (byte) -93);
                                int var16 = var15.field845;
                                if (var15.field888 != null) {
                                    class58 var17 = var15.method486((byte) -113, field7495);
                                    if (var17 != null) {
                                        var16 = var17.field845;
                                    }
                                }
                                if (var16 != -1) {
                                    class20 var18 = new class20(var16);
                                    var18.field319 = var0;
                                    var18.field324 = var11;
                                    field7508.method3265(var18, (byte) -95);
                                }
                            }
                        }
                    } else {
                        class58 var19 = field7499.method1258(var12 - 1, (byte) -84);
                        int var20 = var19.field845;
                        if (var19.field888 != null) {
                            class58 var21 = var19.method486((byte) -113, field7495);
                            if (var21 != null) {
                                var20 = var21.field845;
                            }
                        }
                        if (var20 != -1) {
                            class20 var22 = new class20(var20);
                            var22.field319 = var0;
                            var22.field324 = var11;
                            field7508.method3265(var22, (byte) -83);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7526[0].length; var2++) {
                for (int var3 = 0; var3 < field7526[0][0].length; var3++) {
                    class47 var4 = field7526[var1][var2][var3];
                    if (var4 != null) {
                        for (class114 var5 = (class114) var4.method328(0); var5 != null; var5 = (class114) var4.method331((byte) -33)) {
                            if (var5.field1964 != null) {
                                for (int var6 = 0; var6 < var5.field1964.length; var6++) {
                                    class58 var7 = field7499.method1258(var5.field1964[var6] & 0xFFFF, (byte) -126);
                                    int var8 = var7.field845;
                                    if (var7.field888 != null) {
                                        class58 var9 = var7.method486((byte) -113, field7495);
                                        if (var9 != null) {
                                            var8 = var9.field845;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class20 var10 = new class20(var8);
                                        var10.field319 = ((field7515 >> 6) + var2) * 64 + var5.field1969 - field7515;
                                        var10.field324 = ((field7529 >> 6) + var3) * 64 + var5.field1966 - field7529;
                                        field7508.method3265(var10, (byte) -103);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;Lub;IIII)V", line = 161)
    private static final void method3103(class651 arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field322 = ((arg1.field319 - field7517) * arg2 + arg4 >> 16) + field7527;
        arg1.field323 = field7514 - ((arg1.field324 - field7525) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;Leh;IIII[I[I)V", line = 166)
    private static final void method3104(class651 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2034(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2034(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7524[field7513 * arg5 + arg4] = (byte) var11;
                    field7522[field7513 * arg5 + arg4] = 0;
                } else {
                    field7522[field7513 * arg5 + arg4] = (byte) var11;
                    field7520[field7513 * arg5 + arg4] = 0;
                    field7524[field7513 * arg5 + arg4] = arg1.method2040(-69);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2034(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2034(255);
                var18 = arg1.method2034(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2034(255);
            }
            if (var15 == 0) {
                field7524[field7513 * arg5 + arg4] = (byte) var16;
                field7522[field7513 * arg5 + arg4] = (byte) var17;
                field7520[field7513 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7531[field7513 * arg5 + arg4] = (short) (arg1.method2001((byte) -83) + 1);
                    field7512[field7513 * arg5 + arg4] = arg1.method2040(-83);
                } else if (var19 > 1) {
                    field7531[field7513 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2001((byte) -83);
                        var21[var22] = arg1.method2040(-101);
                    }
                    field7519.method2911((long) (arg4 << 16 | arg5), new class694(var20, var21), (byte) -28);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2001((byte) -83);
                        var24[var25] = arg1.method2040(-48);
                    }
                }
                if (field7526[var15 - 1][arg2 - (field7515 >> 6)][arg3 - (field7529 >> 6)] == null) {
                    field7526[var15 - 1][arg2 - (field7515 >> 6)][arg3 - (field7529 >> 6)] = new class47();
                }
                class114 var26 = new class114(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7526[var15 - 1][arg2 - (field7515 >> 6)][arg3 - (field7529 >> 6)].method327(var26, true);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;IIII)Lgj;", line = 303)
    private static final class593 method3105(class651 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class20 var5 = (class20) field7508.method3257(-28); var5 != null; var5 = (class20) field7508.method3263((byte) -105)) {
            method3103(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field7508;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(Loa;IIII)V", line = 318)
    private static final void method3106(class651 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7511 - field7517;
        int var6 = field7518 - field7525;
        if (field7511 < field7513) {
            var5++;
        }
        if (field7518 < field7528) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field7527;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field7527;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field7517 + var7;
                if (var52 >= 0 && var52 < field7513) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7514 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7514 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field7525 + var53;
                            int var58 = field7513 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7528) {
                                var59 = (field7523[var58] & 0xFF) << 16 | field7530[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7522[var58] & 0xFF;
                                var61 = field7531[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field7494.field464 != -1) {
                                    var62 = field7494.field464 | 0xFF000000;
                                } else if ((field7518 + var53 & 0x4) == (field7517 + var7 & 0x4)) {
                                    var62 = field7516[field7492.field7986 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method415(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3121(arg0, var49, var54, var51, var56, var59, var60, field7520[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class694 var63 = (class694) field7519.method2918((long) (var52 << 16 | var57), (byte) -125);
                                if (var63 != null) {
                                    method3121(arg0, var49, var54, var51, var56, var59, var60, field7520[var58], var63.field9752, var63.field9753, true);
                                }
                            } else {
                                field7505[0] = (short) (var61 - 1);
                                field7503[0] = field7512[var58];
                                method3121(arg0, var49, var54, var51, var56, var59, var60, field7520[var58], field7505, field7503, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7514 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7514 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field7494.field464 != -1) {
                            var68 = field7494.field464 | 0xFF000000;
                        } else if ((field7518 + var64 & 0x4) == (field7517 + var7 & 0x4)) {
                            var68 = field7516[field7492.field7986 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method415(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field7527;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field7527;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field7517 + var8;
                if (var41 >= 0 && var41 < field7513) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7514 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7514 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field7525 + var42;
                            if (var46 >= 0 && var46 < field7528) {
                                int var47 = field7531[field7513 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3108(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class694 var48 = (class694) field7519.method2918((long) (var41 << 16 | var46), (byte) -125);
                                    if (var48 != null) {
                                        method3108(arg0, var38, var43, var40, var45, var48.field9752, var48.field9753);
                                    }
                                } else {
                                    field7505[0] = (short) (var47 - 1);
                                    field7503[0] = field7512[field7513 * var46 + var41];
                                    method3108(arg0, var38, var43, var40, var45, field7505, field7503);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field7517 >> 6;
        int var10 = field7525 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7511 >> 6;
        int var12 = field7518 >> 6;
        if (var11 >= field7526[0].length) {
            var11 = field7526[0].length - 1;
        }
        if (var12 >= field7526[0][0].length) {
            var12 = field7526[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class47 var28 = field7526[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7515 >> 6) + var14) * 64;
                        int var30 = ((field7529 >> 6) + var27) * 64;
                        for (class114 var31 = (class114) var28.method328(0); var31 != null; var31 = (class114) var28.method331((byte) 114)) {
                            int var32 = var31.field1969 + var29 - field7515 - field7517;
                            int var33 = var31.field1966 + var30 - field7529 - field7525;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field7527;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field7527;
                            int var36 = field7514 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7514 - (arg2 * var33 + arg4 >> 16);
                            method3121(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1965, var31.field1967 & 0xFF, var31.field1963, var31.field1964, var31.field1968, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class47 var17 = field7526[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7515 >> 6) + var15) * 64;
                        int var19 = ((field7529 >> 6) + var16) * 64;
                        for (class114 var20 = (class114) var17.method328(0); var20 != null; var20 = (class114) var17.method331((byte) -75)) {
                            int var21 = var20.field1969 + var18 - field7515 - field7517;
                            int var22 = var20.field1966 + var19 - field7529 - field7525;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field7527;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field7527;
                            int var25 = field7514 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7514 - (arg2 * var22 + arg4 >> 16);
                            method3108(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1964, var20.field1968);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()V", line = 663)
    public static final void method3107() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field7500.field2570; var1++) {
            boolean var2 = field7494.method245(-87, field7500.field2565[var1] >> 28 & 0x3, field7500.field2565[var1] >> 14 & 0x3FFF, var0, field7500.field2565[var1] & 0x3FFF);
            if (var2) {
                class20 var3 = new class20(field7500.field2559[var1]);
                var3.field319 = var0[1] - field7515;
                var3.field324 = var0[2] - field7529;
                field7508.method3265(var3, (byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;IIII[S[B)V", line = 685)
    private static final void method3108(class651 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class58 var8 = field7499.method1258(arg5[var7] & 0xFFFF, (byte) -92);
            int var9 = var8.field809;
            if (var9 != -1) {
                class413 var10 = field7493.method1600(var9, (byte) 73);
                class468 var11 = var10.method2370(var8.field880 ? arg6[var7] >> 6 & 0x3 : 0, (byte) 115, var8.field817 ? var8.field851 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1025() >> 2;
                    int var13 = arg4 * var11.method1030() >> 2;
                    if (var10.field5669) {
                        int var14 = var8.field838;
                        int var15 = var8.field885;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field5662 == 0) {
                            var11.method2641(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method274(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field5662 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIIII)V", line = 743)
    public static final void method3109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7517 = arg0 - field7515;
        field7518 = arg1 - field7529;
        field7511 = arg2 - field7515;
        field7525 = arg3 - field7529;
        field7527 = arg4;
        field7510 = arg5;
        field7521 = arg6;
        field7514 = arg7;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "()V", line = 753)
    public static void method3110() {
        field7492 = null;
        field7496 = null;
        field7499 = null;
        field7498 = null;
        field7493 = null;
        field7495 = null;
        field7494 = null;
        field7497 = null;
        field7491 = null;
        field7501 = null;
        field7505 = null;
        field7503 = null;
        field7500 = null;
        field7508 = null;
        field7516 = null;
        field7524 = null;
        field7523 = null;
        field7530 = null;
        field7522 = null;
        field7520 = null;
        field7531 = null;
        field7512 = null;
        field7519 = null;
        field7526 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;)V", line = 780)
    public static final void method3111(class651 arg0) {
        int var1 = field7511 - field7517;
        int var2 = field7518 - field7525;
        int var3 = (field7521 - field7527 << 16) / var1;
        int var4 = (field7514 - field7510 << 16) / var2;
        method3106(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Le;III)I", line = 792)
    private static final int method3112(class498 arg0, int arg1, int arg2, int arg3) {
        class647 var4 = field7492.method3317(arg1, false);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field8677;
        if (var5 >= 0 && arg0.method2760(var5, 21351).field4930) {
            var5 = -1;
        }
        int var9;
        if (var4.field8665 >= 0) {
            int var6 = var4.field8665;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class446.field6101[class120.method937(class517.method2884(var8, 96, 0), 26708) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class446.field6101[class120.method937(class517.method2884(arg0.method2760(var5, 21351).field4920, 96, 0), 26708) & 0xFFFF] | 0xFF000000;
        } else if (var4.field8675 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field8675;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class446.field6101[class120.method937(class517.method2884(var12, 96, 0), 26708) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "()V", line = 850)
    public static final void method3113() {
        field7524 = new byte[field7528 * field7513];
        field7522 = new byte[field7528 * field7513];
        field7520 = new byte[field7528 * field7513];
        field7531 = new short[field7528 * field7513];
        field7512 = new byte[field7528 * field7513];
        field7519 = new class520(1024);
        field7526 = new class47[3][field7513 >> 6][field7528 >> 6];
        field7516 = new int[field7492.field7976 + 1];
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(Loa;)Lgj;", line = 861)
    public static final class593 method3114(class651 arg0) {
        int var1 = field7511 - field7517;
        int var2 = field7518 - field7525;
        int var3 = (field7521 - field7527 << 16) / var1;
        int var4 = (field7514 - field7510 << 16) / var2;
        return method3105(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;II)V", line = 875)
    public static final void method3115(class651 arg0, int arg1, int arg2) {
        class335 var3 = new class335(field7497.method2532(field7494.field460, "area", -24518));
        int var4 = var3.method2034(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2034(255);
        }
        int var7 = var3.method2034(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2034(255);
        }
        while (true) {
            while (var3.field4619 < var3.field4600.length) {
                if (var3.method2034(255) == 0) {
                    int var22 = var3.method2034(255);
                    int var23 = var3.method2034(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7515;
                            int var27 = var23 * 64 + var25 - field7529;
                            method3104(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2034(255);
                    int var29 = var3.method2034(255);
                    int var30 = var3.method2034(255);
                    int var31 = var3.method2034(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7515;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7529;
                            method3104(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7523 = new byte[field7528 * field7513];
            field7530 = new short[field7528 * field7513];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7528 * field7513];
                for (int var13 = 0; var13 < field7526[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7526[var11][0].length; var19++) {
                        class47 var20 = field7526[var11][var13][var19];
                        if (var20 != null) {
                            for (class114 var21 = (class114) var20.method328(0); var21 != null; var21 = (class114) var20.method331((byte) 123)) {
                                var12[(var19 * 64 + var21.field1966) * field7513 + var13 * 64 + var21.field1969] = (byte) var21.field1965;
                            }
                        }
                    }
                }
                method3118(var12, field7523, field7530, arg1, arg2);
                for (int var14 = 0; var14 < field7526[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7526[var11][0].length; var15++) {
                        class47 var16 = field7526[var11][var14][var15];
                        if (var16 != null) {
                            for (class114 var17 = (class114) var16.method328(0); var17 != null; var17 = (class114) var16.method331((byte) 125)) {
                                int var18 = (var15 * 64 + var17.field1966) * field7513 + var14 * 64 + var17.field1969;
                                var17.field1965 = (field7523[var18] & 0xFF) << 16 | field7530[var18] & 0xFFFF;
                                if (var17.field1965 != 0) {
                                    var17.field1965 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3118(field7524, field7523, field7530, arg1, arg2);
            field7524 = null;
            method3102();
            return;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lbi;Lrg;Lik;Lrea;Luk;Lkd;Laba;)V", line = 1054)
    public static final void method3116(class449 arg0, class601 arg1, class197 arg2, class195 arg3, class242 arg4, class261 arg5, class163 arg6) {
        field7497 = arg0;
        field7492 = arg1;
        field7496 = arg2;
        field7499 = arg3;
        field7498 = arg4;
        field7493 = arg5;
        field7495 = arg6;
        field7491.method2916((byte) 101);
        int var7 = field7497.method2523("details", (byte) 125);
        int[] var8 = field7497.method2534(var7, 13758);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class28 var10 = class491.method2739(field7497, var8[var9], var7, 37);
                field7491.method2911((long) var10.field466, var10, (byte) -28);
            }
        }
        class312.method1865(true, false, (byte) -128);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 1084)
    public static final void method3117(int arg0) {
        field7494 = (class28) field7491.method2918((long) arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([B[B[SII)V", line = 1088)
    private static final void method3118(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7528];
        int[] var6 = new int[field7528];
        int[] var7 = new int[field7528];
        int[] var8 = new int[field7528];
        int[] var9 = new int[field7528];
        for (int var10 = -5; var10 < field7513; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7528; var13++) {
                int var10002;
                if (var11 < field7513) {
                    int var28 = arg0[field7513 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class491 var29 = field7496.method1277(false, var28 - 1);
                        var5[var13] += var29.field6621;
                        var6[var13] += var29.field6628;
                        var7[var13] += var29.field6625;
                        var8[var13] += var29.field6623;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7513 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class491 var31 = field7496.method1277(false, var30 - 1);
                        var5[var13] -= var31.field6621;
                        var6[var13] -= var31.field6628;
                        var7[var13] -= var31.field6625;
                        var8[var13] -= var31.field6623;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field7528; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7528) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field7513 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7513 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class433.method2456((byte) -14, var15 / var18, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7513 * var19 + var10;
                            int var27 = class446.field6101[class120.method937(class79.method614(2, 96, var25), 26708) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "()V", line = 1231)
    public static final void method3119() {
        field7524 = null;
        field7523 = null;
        field7530 = null;
        field7522 = null;
        field7520 = null;
        field7531 = null;
        field7512 = null;
        field7519 = null;
        field7526 = null;
        field7516 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lrda;", line = 1244)
    public static final class620 method3120(int arg0, int arg1) {
        class620 var2 = new class620();
        for (class28 var3 = (class28) field7491.method2915(119); var3 != null; var3 = (class28) field7491.method2912((byte) 124)) {
            if (var3.field458 && var3.method239(12800, arg0, arg1)) {
                var2.method3396(var3, -1);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;IIIIIII[S[BZ)V", line = 1260)
    private static final void method3121(class651 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method415(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7516[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method415(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class276.method1674(var12, arg2, arg5, field7504, arg0, arg7 >> 6 & 0x3, arg3, field7501, arg4, arg1, field7516[arg6], (byte) -95, var11);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class58 var18 = field7499.method1258(arg8[var16] & 0xFFFF, (byte) -53);
                if (var18.field809 == -1) {
                    int var19 = -3355444;
                    if (var18.field816 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method446(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method379(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method446(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method379(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method446(arg1, arg2, arg4, -1, 0);
                            arg0.method379(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method446(var14, arg2, arg4, -1, 0);
                            arg0.method379(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method446(var14, arg2, arg4, -1, 0);
                            arg0.method379(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method446(arg1, arg2, arg4, -1, 0);
                            arg0.method379(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method379(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method379(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method379(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method379(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method379(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method379(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Le;II)V", line = 1427)
    public static final void method3122(class498 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field7492.field7976; var3++) {
            field7516[var3 + 1] = method3112(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Lo;", line = 1436)
    public static final class28 method3123(int arg0) {
        return (class28) field7491.method2918((long) arg0, (byte) -11);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)Lo;", line = 1447)
    public static final class28 method3124(int arg0, int arg1) {
        for (class28 var2 = (class28) field7491.method2915(105); var2 != null; var2 = (class28) field7491.method2912((byte) 106)) {
            if (var2.field458 && var2.method239(12800, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }
}
