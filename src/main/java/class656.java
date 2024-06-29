import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class656 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "Lpfa;")
    private static class295 field9352 = new class295(16);

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "[S")
    private static short[] field9362 = new short[1];

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public static int field9367 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "[B")
    private static byte[] field9369 = new byte[1];

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field9365 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "Lbq;")
    public static class289 field9361 = new class289();

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "F")
    public static float field9363;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "F")
    public static float field9370;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "I")
    public static int field9384;

    @OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "Lwea;")
    private static class156 field9353;

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "Lpfa;")
    private static class295 field9379;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Lafa;")
    public static class344 field9360;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "Ldda;")
    public static class381 field9356;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Loh;")
    public static class404 field9359;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Lfs;")
    private static class553 field9354;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Lnf;")
    public static class575 field9358;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "Laga;")
    public static class664 field9364;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Llu;")
    public static class711 field9355;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Ldba;")
    public static class92 field9357;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "[B")
    private static byte[] field9371;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "[B")
    private static byte[] field9380;

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "[B")
    private static byte[] field9382;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "[B")
    private static byte[] field9383;

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "[B")
    private static byte[] field9391;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "[I")
    private static int[] field9378;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "[S")
    private static short[] field9376;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[S")
    private static short[] field9377;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "[[[B")
    public static byte[][][] field9368;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "[[[Lgt;")
    private static class454[][][] field9390;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;Lig;IIII[I[I)V")
    private static final void method3722(class58 arg0, class244 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1423(-125);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1423(-17);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field9391[field9373 * arg5 + arg4] = (byte) var11;
                    field9382[field9373 * arg5 + arg4] = 0;
                } else {
                    field9382[field9373 * arg5 + arg4] = (byte) var11;
                    field9371[field9373 * arg5 + arg4] = 0;
                    field9391[field9373 * arg5 + arg4] = arg1.method1448((byte) -117);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1423(-112);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1423(-15);
                var18 = arg1.method1423(-44);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1423(-90);
            }
            if (var15 == 0) {
                field9391[field9373 * arg5 + arg4] = (byte) var16;
                field9382[field9373 * arg5 + arg4] = (byte) var17;
                field9371[field9373 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field9377[field9373 * arg5 + arg4] = (short) (arg1.method1476(84) + 1);
                    field9380[field9373 * arg5 + arg4] = arg1.method1448((byte) -102);
                } else if (var19 > 1) {
                    field9377[field9373 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1476(105);
                        var21[var22] = arg1.method1448((byte) -104);
                    }
                    field9379.method1751(new class318(var20, var21), 3970, (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1476(103);
                        var24[var25] = arg1.method1448((byte) -128);
                    }
                }
                if (field9390[var15 - 1][arg2 - (field9386 >> 6)][arg3 - (field9374 >> 6)] == null) {
                    field9390[var15 - 1][arg2 - (field9386 >> 6)][arg3 - (field9374 >> 6)] = new class454();
                }
                class363 var26 = new class363(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field9390[var15 - 1][arg2 - (field9386 >> 6)][arg3 - (field9374 >> 6)].method2792((byte) -13, var26);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;IIII)V")
    private static final void method3723(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field9388 - field9381;
        int var6 = field9392 - field9375;
        if (field9388 < field9373) {
            var5++;
        }
        if (field9392 < field9372) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field9387;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field9387;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field9381 + var7;
                if (var52 >= 0 && var52 < field9373) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field9385 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field9385 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field9375 + var53;
                            int var58 = field9373 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field9372) {
                                var59 = (field9383[var58] & 0xFF) << 16 | field9376[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field9382[var58] & 0xFF;
                                var61 = field9377[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field9357.field956 != -1) {
                                    var62 = field9357.field956 | 0xFF000000;
                                } else if ((field9392 + var53 & 0x4) == (field9381 + var7 & 0x4)) {
                                    var62 = field9378[field9353.field1722 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method370(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3727(arg0, var49, var54, var51, var56, var59, var60, field9371[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class318 var63 = (class318) field9379.method1754(false, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3727(arg0, var49, var54, var51, var56, var59, var60, field9371[var58], var63.field4066, var63.field4067, true);
                                }
                            } else {
                                field9362[0] = (short) (var61 - 1);
                                field9369[0] = field9380[var58];
                                method3727(arg0, var49, var54, var51, var56, var59, var60, field9371[var58], field9362, field9369, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field9385 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field9385 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field9357.field956 != -1) {
                            var68 = field9357.field956 | 0xFF000000;
                        } else if ((field9392 + var64 & 0x4) == (field9381 + var7 & 0x4)) {
                            var68 = field9378[field9353.field1722 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method370(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field9387;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field9387;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field9381 + var8;
                if (var41 >= 0 && var41 < field9373) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field9385 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field9385 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field9375 + var42;
                            if (var46 >= 0 && var46 < field9372) {
                                int var47 = field9377[field9373 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3745(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class318 var48 = (class318) field9379.method1754(false, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3745(arg0, var38, var43, var40, var45, var48.field4066, var48.field4067);
                                    }
                                } else {
                                    field9362[0] = (short) (var47 - 1);
                                    field9369[0] = field9380[field9373 * var46 + var41];
                                    method3745(arg0, var38, var43, var40, var45, field9362, field9369);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field9381 >> 6;
        int var10 = field9375 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field9388 >> 6;
        int var12 = field9392 >> 6;
        if (var11 >= field9390[0].length) {
            var11 = field9390[0].length - 1;
        }
        if (var12 >= field9390[0][0].length) {
            var12 = field9390[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class454 var28 = field9390[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field9386 >> 6) + var14) * 64;
                        int var30 = ((field9374 >> 6) + var27) * 64;
                        for (class363 var31 = (class363) var28.method2790(110); var31 != null; var31 = (class363) var28.method2794(49)) {
                            int var32 = var31.field4653 + var29 - field9386 - field9381;
                            int var33 = var31.field4649 + var30 - field9374 - field9375;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field9387;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field9387;
                            int var36 = field9385 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field9385 - (arg2 * var33 + arg4 >> 16);
                            method3727(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4651, var31.field4647 & 0xFF, var31.field4652, var31.field4648, var31.field4650, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class454 var17 = field9390[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field9386 >> 6) + var15) * 64;
                        int var19 = ((field9374 >> 6) + var16) * 64;
                        for (class363 var20 = (class363) var17.method2790(115); var20 != null; var20 = (class363) var17.method2794(123)) {
                            int var21 = var20.field4653 + var18 - field9386 - field9381;
                            int var22 = var20.field4649 + var19 - field9374 - field9375;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field9387;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field9387;
                            int var25 = field9385 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field9385 - (arg2 * var22 + arg4 >> 16);
                            method3745(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4648, var20.field4650);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "()V")
    public static final void method3724() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field9364.field9447; var1++) {
            boolean var2 = field9357.method624(field9364.field9449[var1] >> 28 & 0x3, 8, field9364.field9449[var1] >> 14 & 0x3FFF, field9364.field9449[var1] & 0x3FFF, var0);
            if (var2) {
                class191 var3 = new class191(field9364.field9446[var1]);
                var3.field2251 = var0[1] - field9386;
                var3.field2256 = var0[2] - field9374;
                field9361.method1721((byte) -84, var3);
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "()V")
    public static final void method3725() {
        field9391 = new byte[field9373 * field9372];
        field9382 = new byte[field9373 * field9372];
        field9371 = new byte[field9373 * field9372];
        field9377 = new short[field9373 * field9372];
        field9380 = new byte[field9373 * field9372];
        field9379 = new class295(1024);
        field9390 = new class454[3][field9373 >> 6][field9372 >> 6];
        field9378 = new int[field9353.field1719 + 1];
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;Lm;IIII)V")
    private static final void method3726(class58 arg0, class191 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2250 = ((arg1.field2251 - field9381) * arg2 + arg4 >> 16) + field9387;
        arg1.field2253 = field9385 - ((arg1.field2256 - field9375) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V")
    private static final void method3727(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method370(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field9378[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method370(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class695.method3918(arg4, arg3, arg0, arg5, var12, arg1, arg2, 255478, field9366, arg7 >> 6 & 0x3, field9368, var11, field9378[arg6]);
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
                class316 var18 = field9355.method3972((byte) 102, arg8[var16] & 0xFFFF);
                if (var18.field3990 == -1) {
                    int var19 = -3355444;
                    if (var18.field4001 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method377(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method340(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method377(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method340(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method377(arg1, arg2, arg4, -1, 0);
                            arg0.method340(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method377(var14, arg2, arg4, -1, 0);
                            arg0.method340(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method377(var14, arg2, arg4, -1, 0);
                            arg0.method340(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method377(arg1, arg2, arg4, -1, 0);
                            arg0.method340(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method340(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method340(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method340(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method340(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method340(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method340(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([B[B[SII)V")
    private static final void method3728(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field9372];
        int[] var6 = new int[field9372];
        int[] var7 = new int[field9372];
        int[] var8 = new int[field9372];
        int[] var9 = new int[field9372];
        for (int var10 = -5; var10 < field9373; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field9372; var13++) {
                int var10002;
                if (var11 < field9373) {
                    int var28 = arg0[field9373 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class350 var29 = field9354.method3244(var28 - 1, (byte) -68);
                        var5[var13] += var29.field4515;
                        var6[var13] += var29.field4502;
                        var7[var13] += var29.field4513;
                        var8[var13] += var29.field4507;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field9373 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class350 var31 = field9354.method3244(var30 - 1, (byte) -68);
                        var5[var13] -= var31.field4515;
                        var6[var13] -= var31.field4502;
                        var7[var13] -= var31.field4513;
                        var8[var13] -= var31.field4507;
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
                for (int var19 = -5; var19 < field9372; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field9372) {
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
                        if ((arg0[field9373 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field9373 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class394.method2419(-1575722079, var15 / var18, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field9373 * var19 + var10;
                            int var27 = class32.field361[class660.method3759((byte) -2, class746.method4149(var25, 2, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9381 = arg0 - field9386;
        field9392 = arg1 - field9374;
        field9388 = arg2 - field9386;
        field9375 = arg3 - field9374;
        field9387 = arg4;
        field9384 = arg5;
        field9389 = arg6;
        field9385 = arg7;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Lsc;")
    public static final class347 method3730(int arg0, int arg1) {
        class347 var2 = new class347();
        for (class92 var3 = (class92) field9352.method1753(0); var3 != null; var3 = (class92) field9352.method1755(-88)) {
            if (var3.field965 && var3.method622(arg1, arg0, (byte) 38)) {
                var2.method2068(-127, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ld;II)V")
    public static final void method3731(class150 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field9353.field1719; var3++) {
            field9378[var3 + 1] = method3744(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Ldba;")
    public static final class92 method3732(int arg0) {
        return (class92) field9352.method1754(false, (long) arg0);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Loh;Lwea;Lfs;Llu;Lafa;Ldda;Lnf;)V")
    public static final void method3733(class404 arg0, class156 arg1, class553 arg2, class711 arg3, class344 arg4, class381 arg5, class575 arg6) {
        field9359 = arg0;
        field9353 = arg1;
        field9354 = arg2;
        field9355 = arg3;
        field9360 = arg4;
        field9356 = arg5;
        field9358 = arg6;
        field9352.method1758(-115);
        int var7 = field9359.method2474(-125, "details");
        int[] var8 = field9359.method2470((byte) 51, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class92 var10 = class54.method302(var7, var8[var9], field9359, (byte) -18);
                field9352.method1751(var10, 3970, (long) var10.field957);
            }
        }
        class246.method1492(true, false, (byte) -6);
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "()V")
    private static final void method3734() {
        for (int var0 = 0; var0 < field9373; var0++) {
            for (int var11 = 0; var11 < field9372; var11++) {
                int var12 = field9377[field9373 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class318 var13 = (class318) field9379.method1754(false, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4066.length; var14++) {
                                class316 var15 = field9355.method3972((byte) 123, var13.field4066[var14] & 0xFFFF);
                                int var16 = var15.field4000;
                                if (var15.field4045 != null) {
                                    class316 var17 = var15.method1886(field9358, 107);
                                    if (var17 != null) {
                                        var16 = var17.field4000;
                                    }
                                }
                                if (var16 != -1) {
                                    class191 var18 = new class191(var16);
                                    var18.field2251 = var0;
                                    var18.field2256 = var11;
                                    field9361.method1721((byte) -25, var18);
                                }
                            }
                        }
                    } else {
                        class316 var19 = field9355.method3972((byte) 106, var12 - 1);
                        int var20 = var19.field4000;
                        if (var19.field4045 != null) {
                            class316 var21 = var19.method1886(field9358, 80);
                            if (var21 != null) {
                                var20 = var21.field4000;
                            }
                        }
                        if (var20 != -1) {
                            class191 var22 = new class191(var20);
                            var22.field2251 = var0;
                            var22.field2256 = var11;
                            field9361.method1721((byte) 99, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field9390[0].length; var2++) {
                for (int var3 = 0; var3 < field9390[0][0].length; var3++) {
                    class454 var4 = field9390[var1][var2][var3];
                    if (var4 != null) {
                        for (class363 var5 = (class363) var4.method2790(123); var5 != null; var5 = (class363) var4.method2794(82)) {
                            if (var5.field4648 != null) {
                                for (int var6 = 0; var6 < var5.field4648.length; var6++) {
                                    class316 var7 = field9355.method3972((byte) 117, var5.field4648[var6] & 0xFFFF);
                                    int var8 = var7.field4000;
                                    if (var7.field4045 != null) {
                                        class316 var9 = var7.method1886(field9358, 90);
                                        if (var9 != null) {
                                            var8 = var9.field4000;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class191 var10 = new class191(var8);
                                        var10.field2251 = ((field9386 >> 6) + var2) * 64 + var5.field4653 - field9386;
                                        var10.field2256 = ((field9374 >> 6) + var3) * 64 + var5.field4649 - field9374;
                                        field9361.method1721((byte) 93, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;)V")
    public static final void method3735(class58 arg0) {
        int var1 = field9388 - field9381;
        int var2 = field9392 - field9375;
        int var3 = (field9389 - field9387 << 16) / var1;
        int var4 = (field9385 - field9384 << 16) / var2;
        method3723(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static final void method3736(int arg0) {
        field9357 = (class92) field9352.method1754(false, (long) arg0);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(Lha;)Lbq;")
    public static final class289 method3737(class58 arg0) {
        int var1 = field9388 - field9381;
        int var2 = field9392 - field9375;
        int var3 = (field9389 - field9387 << 16) / var1;
        int var4 = (field9385 - field9384 << 16) / var2;
        return method3742(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "()V")
    public static void method3738() {
        field9353 = null;
        field9354 = null;
        field9355 = null;
        field9360 = null;
        field9356 = null;
        field9358 = null;
        field9357 = null;
        field9359 = null;
        field9352 = null;
        field9368 = null;
        field9362 = null;
        field9369 = null;
        field9364 = null;
        field9361 = null;
        field9378 = null;
        field9391 = null;
        field9383 = null;
        field9376 = null;
        field9382 = null;
        field9371 = null;
        field9377 = null;
        field9380 = null;
        field9379 = null;
        field9390 = null;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)Ldba;")
    public static final class92 method3739(int arg0, int arg1) {
        for (class92 var2 = (class92) field9352.method1753(0); var2 != null; var2 = (class92) field9352.method1755(-121)) {
            if (var2.field965 && var2.method622(arg1, arg0, (byte) 38)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;Lm;Laia;)V")
    public static final void method3740(class58 arg0, class191 arg1, class228 arg2) {
        if (arg2.field2641 == null) {
            return;
        }
        int[] var3 = new int[arg2.field2641.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field2641[var4 * 2] + arg1.field2251;
            int var22 = arg2.field2641[var4 * 2 + 1] + arg1.field2256;
            var3[var4 * 2] = (field9389 - field9387) * (var21 - field9381) / (field9388 - field9381) + field9387;
            var3[var4 * 2 + 1] = field9385 - (field9385 - field9384) * (var22 - field9375) / (field9392 - field9375);
        }
        class63.method481(arg0, var3, arg2.field2607);
        if (arg2.field2632 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method405(var13, var14, var15, var16, arg2.field2650[arg2.field2647[var5] & 0xFF], 1, arg2.field2632, arg2.field2602, arg2.field2609);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method405(var6, var7, var8, var9, arg2.field2650[arg2.field2647[arg2.field2647.length - 1] & 0xFF], 1, arg2.field2632, arg2.field2602, arg2.field2609);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method397(var3[var20 * 2], (byte) -124, var3[(var20 + 1) * 2 + 1], var3[var20 * 2 + 1], arg2.field2650[arg2.field2647[var20] & 0xFF], var3[(var20 + 1) * 2]);
        }
        arg0.method397(var3[var3.length - 2], (byte) -35, var3[1], var3[var3.length - 1], arg2.field2650[arg2.field2647[arg2.field2647.length - 1] & 0xFF], var3[0]);
    }

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "()V")
    public static final void method3741() {
        field9391 = null;
        field9383 = null;
        field9376 = null;
        field9382 = null;
        field9371 = null;
        field9377 = null;
        field9380 = null;
        field9379 = null;
        field9390 = null;
        field9378 = null;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(Lha;IIII)Lbq;")
    private static final class289 method3742(class58 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class191 var5 = (class191) field9361.method1719(65280); var5 != null; var5 = (class191) field9361.method1723(-20665)) {
            method3726(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field9361;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;II)V")
    public static final void method3743(class58 arg0, int arg1, int arg2) {
        class244 var3 = new class244(field9359.method2471((byte) -54, field9357.field962, "area"));
        int var4 = var3.method1423(-60);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1423(-37);
        }
        int var7 = var3.method1423(-67);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1423(-120);
        }
        while (true) {
            while (var3.field2903 < var3.field2912.length) {
                if (var3.method1423(-38) == 0) {
                    int var22 = var3.method1423(-125);
                    int var23 = var3.method1423(-99);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field9386;
                            int var27 = var23 * 64 + var25 - field9374;
                            method3722(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1423(-122);
                    int var29 = var3.method1423(-18);
                    int var30 = var3.method1423(-79);
                    int var31 = var3.method1423(-116);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field9386;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field9374;
                            method3722(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field9383 = new byte[field9373 * field9372];
            field9376 = new short[field9373 * field9372];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field9373 * field9372];
                for (int var13 = 0; var13 < field9390[var11].length; var13++) {
                    for (int var19 = 0; var19 < field9390[var11][0].length; var19++) {
                        class454 var20 = field9390[var11][var13][var19];
                        if (var20 != null) {
                            for (class363 var21 = (class363) var20.method2790(102); var21 != null; var21 = (class363) var20.method2794(46)) {
                                var12[(var19 * 64 + var21.field4649) * field9373 + var13 * 64 + var21.field4653] = (byte) var21.field4651;
                            }
                        }
                    }
                }
                method3728(var12, field9383, field9376, arg1, arg2);
                for (int var14 = 0; var14 < field9390[var11].length; var14++) {
                    for (int var15 = 0; var15 < field9390[var11][0].length; var15++) {
                        class454 var16 = field9390[var11][var14][var15];
                        if (var16 != null) {
                            for (class363 var17 = (class363) var16.method2790(120); var17 != null; var17 = (class363) var16.method2794(106)) {
                                int var18 = (var15 * 64 + var17.field4649) * field9373 + var14 * 64 + var17.field4653;
                                var17.field4651 = (field9383[var18] & 0xFF) << 16 | field9376[var18] & 0xFFFF;
                                if (var17.field4651 != 0) {
                                    var17.field4651 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3728(field9391, field9383, field9376, arg1, arg2);
            field9391 = null;
            method3734();
            return;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ld;III)I")
    private static final int method3744(class150 arg0, int arg1, int arg2, int arg3) {
        class287 var4 = field9353.method965(arg1, (byte) 116);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3530;
        if (var5 >= 0 && arg0.method931(var5, true).field3694) {
            var5 = -1;
        }
        int var9;
        if (var4.field3537 >= 0) {
            int var6 = var4.field3537;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class32.field361[class660.method3759((byte) -2, class440.method2743(96, (byte) -100, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class32.field361[class660.method3759((byte) -2, class440.method2743(96, (byte) 84, arg0.method931(var5, true).field3706)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3529 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3529;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class32.field361[class660.method3759((byte) -2, class440.method2743(96, (byte) -68, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lha;IIII[S[B)V")
    private static final void method3745(class58 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class316 var8 = field9355.method3972((byte) 99, arg5[var7] & 0xFFFF);
            int var9 = var8.field3990;
            if (var9 != -1) {
                class645 var10 = field9356.method2338(var9, (byte) -34);
                class131 var11 = var10.method3671(arg0, var8.field4017 ? var8.field4027 : false, var8.field3969 ? arg6[var7] >> 6 & 0x3 : 0, false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method501() >> 2;
                    int var13 = arg4 * var11.method510() >> 2;
                    if (var10.field9223) {
                        int var14 = var8.field4020;
                        int var15 = var8.field4050;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field9217 == 0) {
                            var11.method814(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method818(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field9217 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }
}
