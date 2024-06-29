import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class461 {

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lbaa;")
    private static class130 field6386 = new class130(16);

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "[S")
    private static short[] field6395 = new short[1];

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field6391 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[B")
    private static byte[] field6389 = new byte[1];

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field6397 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Lmba;")
    public static class646 field6394 = new class646();

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "F")
    public static float field6388;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "F")
    public static float field6392;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lql;")
    public static class109 field6383;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lbaa;")
    private static class130 field6406;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lib;")
    public static class1 field6385;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Luu;")
    public static class237 field6381;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lpg;")
    private static class289 field6382;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Ldp;")
    public static class375 field6396;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lnc;")
    public static class496 field6379;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lmm;")
    public static class536 field6380;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lbj;")
    private static class547 field6387;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lde;")
    public static class604 field6384;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "[B")
    private static byte[] field6402;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "[B")
    private static byte[] field6405;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "[B")
    private static byte[] field6412;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "[B")
    private static byte[] field6414;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "[B")
    private static byte[] field6419;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "[I")
    private static int[] field6401;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "[S")
    private static short[] field6409;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "[S")
    private static short[] field6415;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "[[[B")
    public static byte[][][] field6393;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "[[[Lhca;")
    private static class244[][][] field6407;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V", line = 6)
    public static final void method2804() {
        field6402 = new byte[field6413 * field6404];
        field6419 = new byte[field6413 * field6404];
        field6414 = new byte[field6413 * field6404];
        field6409 = new short[field6413 * field6404];
        field6412 = new byte[field6413 * field6404];
        field6406 = new class130(1024);
        field6407 = new class244[3][field6404 >> 6][field6413 >> 6];
        field6401 = new int[field6387.field7595 + 1];
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V", line = 17)
    public static final void method2805() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6396.field5276; var1++) {
            boolean var2 = field6384.method3441(field6396.field5275[var1] >> 14 & 0x3FFF, field6396.field5275[var1] >> 28 & 0x3, field6396.field5275[var1] & 0x3FFF, var0, (byte) 1);
            if (var2) {
                class717 var3 = new class717(field6396.field5274[var1]);
                var3.field9989 = var0[1] - field6400;
                var3.field9985 = var0[2] - field6408;
                field6394.method3610(9289, var3);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;Lto;Ljo;)V", line = 39)
    public static final void method2806(class548 arg0, class717 arg1, class21 arg2) {
        if (arg2.field222 == null) {
            return;
        }
        int[] var3 = new int[arg2.field222.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field222[var4 * 2] + arg1.field9989;
            int var22 = arg2.field222[var4 * 2 + 1] + arg1.field9985;
            var3[var4 * 2] = (var21 - field6418) * (field6410 - field6416) / (field6403 - field6418) + field6416;
            var3[var4 * 2 + 1] = field6399 - (field6399 - field6417) * (var22 - field6398) / (field6411 - field6398);
        }
        class403.method2524(arg0, var3, arg2.field203);
        if (arg2.field232 > 0) {
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
                arg0.method1462(var13, var14, var15, var16, arg2.field242[arg2.field240[var5] & 0xFF], 1, arg2.field232, arg2.field237, arg2.field207);
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
            arg0.method1462(var6, var7, var8, var9, arg2.field242[arg2.field240[arg2.field240.length - 1] & 0xFF], 1, arg2.field232, arg2.field237, arg2.field207);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method3242(var3[(var20 + 1) * 2 + 1], (byte) -85, var3[(var20 + 1) * 2], var3[var20 * 2 + 1], var3[var20 * 2], arg2.field242[arg2.field240[var20] & 0xFF]);
        }
        arg0.method3242(var3[1], (byte) -114, var3[0], var3[var3.length - 1], var3[var3.length - 2], arg2.field242[arg2.field240[arg2.field240.length - 1] & 0xFF]);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lvu;", line = 149)
    public static final class680 method2807(int arg0, int arg1) {
        class680 var2 = new class680();
        for (class604 var3 = (class604) field6386.method821((byte) 120); var3 != null; var3 = (class604) field6386.method818(119)) {
            if (var3.field8160 && var3.method3436(12800, arg1, arg0)) {
                var2.method3827(-125, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Luu;Lbj;Lpg;Lql;Lib;Lnc;Lmm;)V", line = 165)
    public static final void method2808(class237 arg0, class547 arg1, class289 arg2, class109 arg3, class1 arg4, class496 arg5, class536 arg6) {
        field6381 = arg0;
        field6387 = arg1;
        field6382 = arg2;
        field6383 = arg3;
        field6385 = arg4;
        field6379 = arg5;
        field6380 = arg6;
        field6386.method819(23738);
        int var7 = field6381.method1598("details", false);
        int[] var8 = field6381.method1585(var7, false);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class604 var10 = class534.method3168(var8[var9], var7, -16604, field6381);
                field6386.method820((long) var10.field8166, (byte) -42, var10);
            }
        }
        class612.method3470(false, true, (byte) -82);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()V", line = 197)
    private static final void method2809() {
        for (int var0 = 0; var0 < field6404; var0++) {
            for (int var11 = 0; var11 < field6413; var11++) {
                int var12 = field6409[field6404 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class738 var13 = (class738) field6406.method812(114, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field10202.length; var14++) {
                                class220 var15 = field6383.method716(6, var13.field10202[var14] & 0xFFFF);
                                int var16 = var15.field2901;
                                if (var15.field2966 != null) {
                                    class220 var17 = var15.method1297(field6380, 21559);
                                    if (var17 != null) {
                                        var16 = var17.field2901;
                                    }
                                }
                                if (var16 != -1) {
                                    class717 var18 = new class717(var16);
                                    var18.field9989 = var0;
                                    var18.field9985 = var11;
                                    field6394.method3610(9289, var18);
                                }
                            }
                        }
                    } else {
                        class220 var19 = field6383.method716(6, var12 - 1);
                        int var20 = var19.field2901;
                        if (var19.field2966 != null) {
                            class220 var21 = var19.method1297(field6380, 21559);
                            if (var21 != null) {
                                var20 = var21.field2901;
                            }
                        }
                        if (var20 != -1) {
                            class717 var22 = new class717(var20);
                            var22.field9989 = var0;
                            var22.field9985 = var11;
                            field6394.method3610(9289, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6407[0].length; var2++) {
                for (int var3 = 0; var3 < field6407[0][0].length; var3++) {
                    class244 var4 = field6407[var1][var2][var3];
                    if (var4 != null) {
                        for (class377 var5 = (class377) var4.method1638(false); var5 != null; var5 = (class377) var4.method1645(0)) {
                            if (var5.field5297 != null) {
                                for (int var6 = 0; var6 < var5.field5297.length; var6++) {
                                    class220 var7 = field6383.method716(6, var5.field5297[var6] & 0xFFFF);
                                    int var8 = var7.field2901;
                                    if (var7.field2966 != null) {
                                        class220 var9 = var7.method1297(field6380, 21559);
                                        if (var9 != null) {
                                            var8 = var9.field2901;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class717 var10 = new class717(var8);
                                        var10.field9989 = ((field6400 >> 6) + var2) * 64 + var5.field5293 - field6400;
                                        var10.field9985 = ((field6408 >> 6) + var3) * 64 + var5.field5295 - field6408;
                                        field6394.method3610(9289, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;IIII)Lmba;", line = 355)
    private static final class646 method2810(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class717 var5 = (class717) field6394.method3618(-68); var5 != null; var5 = (class717) field6394.method3619(0)) {
            method2816(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6394;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 365)
    private static final void method2811(class548 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class220 var8 = field6383.method716(6, arg5[var7] & 0xFFFF);
            int var9 = var8.field2897;
            if (var9 != -1) {
                class7 var10 = field6379.method3008(16030, var9);
                class298 var11 = var10.method31(var8.field2880 ? var8.field2971 : false, var8.field2911 ? arg6[var7] >> 6 & 0x3 : 0, arg0, (byte) 105);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1963() >> 2;
                    int var13 = arg4 * var11.method1961() >> 2;
                    if (var10.field69) {
                        int var14 = var8.field2938;
                        int var15 = var8.field2887;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field67 == 0) {
                            var11.method1959(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1969(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field67 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;)V", line = 425)
    public static final void method2812(class548 arg0) {
        int var1 = field6403 - field6418;
        int var2 = field6411 - field6398;
        int var3 = (field6410 - field6416 << 16) / var1;
        int var4 = (field6399 - field6417 << 16) / var2;
        method2815(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()V", line = 435)
    public static void method2813() {
        field6387 = null;
        field6382 = null;
        field6383 = null;
        field6385 = null;
        field6379 = null;
        field6380 = null;
        field6384 = null;
        field6381 = null;
        field6386 = null;
        field6393 = null;
        field6395 = null;
        field6389 = null;
        field6396 = null;
        field6394 = null;
        field6401 = null;
        field6402 = null;
        field6405 = null;
        field6415 = null;
        field6419 = null;
        field6414 = null;
        field6409 = null;
        field6412 = null;
        field6406 = null;
        field6407 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)Lde;", line = 463)
    public static final class604 method2814(int arg0, int arg1) {
        for (class604 var2 = (class604) field6386.method821((byte) 121); var2 != null; var2 = (class604) field6386.method818(50)) {
            if (var2.field8160 && var2.method3436(12800, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lha;IIII)V", line = 476)
    private static final void method2815(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6403 - field6418;
        int var6 = field6411 - field6398;
        if (field6403 < field6404) {
            var5++;
        }
        if (field6411 < field6413) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6416;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6416;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6418 + var7;
                if (var52 >= 0 && var52 < field6404) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6399 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6399 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6398 + var53;
                            int var58 = field6404 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6413) {
                                var59 = (field6405[var58] & 0xFF) << 16 | field6415[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6419[var58] & 0xFF;
                                var61 = field6409[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6384.field8151 != -1) {
                                    var62 = field6384.field8151 | 0xFF000000;
                                } else if ((field6418 + var7 & 0x4) == (field6411 + var53 & 0x4)) {
                                    var62 = field6401[field6387.field7605 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1412(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2817(arg0, var49, var54, var51, var56, var59, var60, field6414[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class738 var63 = (class738) field6406.method812(125, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2817(arg0, var49, var54, var51, var56, var59, var60, field6414[var58], var63.field10202, var63.field10201, true);
                                }
                            } else {
                                field6395[0] = (short) (var61 - 1);
                                field6389[0] = field6412[var58];
                                method2817(arg0, var49, var54, var51, var56, var59, var60, field6414[var58], field6395, field6389, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6399 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6399 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6384.field8151 != -1) {
                            var68 = field6384.field8151 | 0xFF000000;
                        } else if ((field6418 + var7 & 0x4) == (field6411 + var64 & 0x4)) {
                            var68 = field6401[field6387.field7605 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1412(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6416;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6416;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6418 + var8;
                if (var41 >= 0 && var41 < field6404) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6399 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6399 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6398 + var42;
                            if (var46 >= 0 && var46 < field6413) {
                                int var47 = field6409[field6404 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2811(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class738 var48 = (class738) field6406.method812(107, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2811(arg0, var38, var43, var40, var45, var48.field10202, var48.field10201);
                                    }
                                } else {
                                    field6395[0] = (short) (var47 - 1);
                                    field6389[0] = field6412[field6404 * var46 + var41];
                                    method2811(arg0, var38, var43, var40, var45, field6395, field6389);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6418 >> 6;
        int var10 = field6398 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6403 >> 6;
        int var12 = field6411 >> 6;
        if (var11 >= field6407[0].length) {
            var11 = field6407[0].length - 1;
        }
        if (var12 >= field6407[0][0].length) {
            var12 = field6407[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class244 var28 = field6407[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6400 >> 6) + var14) * 64;
                        int var30 = ((field6408 >> 6) + var27) * 64;
                        for (class377 var31 = (class377) var28.method1638(false); var31 != null; var31 = (class377) var28.method1645(0)) {
                            int var32 = var31.field5293 + var29 - field6400 - field6418;
                            int var33 = var31.field5295 + var30 - field6408 - field6398;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6416;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6416;
                            int var36 = field6399 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6399 - (arg2 * var33 + arg4 >> 16);
                            method2817(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5292, var31.field5291 & 0xFF, var31.field5294, var31.field5297, var31.field5296, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class244 var17 = field6407[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6400 >> 6) + var15) * 64;
                        int var19 = ((field6408 >> 6) + var16) * 64;
                        for (class377 var20 = (class377) var17.method1638(false); var20 != null; var20 = (class377) var17.method1645(0)) {
                            int var21 = var20.field5293 + var18 - field6400 - field6418;
                            int var22 = var20.field5295 + var19 - field6408 - field6398;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6416;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6416;
                            int var25 = field6399 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6399 - (arg2 * var22 + arg4 >> 16);
                            method2811(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5297, var20.field5296);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;Lto;IIII)V", line = 820)
    private static final void method2816(class548 arg0, class717 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field9987 = ((arg1.field9989 - field6418) * arg2 + arg4 >> 16) + field6416;
        arg1.field9988 = field6399 - ((arg1.field9985 - field6398) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 824)
    private static final void method2817(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1412(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6401[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1412(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class144.method939(arg1, field6401[arg6], arg4, arg5, arg2, field6390, arg7 >> 6 & 0x3, arg0, arg3, var11, 122, var12, field6393);
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
                class220 var18 = field6383.method716(6, arg8[var16] & 0xFFFF);
                if (var18.field2897 == -1) {
                    int var19 = -3355444;
                    if (var18.field2948 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1427(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1487(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1427(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1487(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1427(arg1, arg2, arg4, -1, 0);
                            arg0.method1487(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1427(var14, arg2, arg4, -1, 0);
                            arg0.method1487(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1427(var14, arg2, arg4, -1, 0);
                            arg0.method1487(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1427(arg1, arg2, arg4, -1, 0);
                            arg0.method1487(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1487(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1487(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1487(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1487(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1487(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1487(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;Ldc;IIII[I[I)V", line = 989)
    private static final void method2818(class548 arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method505((byte) -119);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method505((byte) -119);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6402[field6404 * arg5 + arg4] = (byte) var11;
                    field6419[field6404 * arg5 + arg4] = 0;
                } else {
                    field6419[field6404 * arg5 + arg4] = (byte) var11;
                    field6414[field6404 * arg5 + arg4] = 0;
                    field6402[field6404 * arg5 + arg4] = arg1.method491(false);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method505((byte) -119);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method505((byte) -119);
                var18 = arg1.method505((byte) -119);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method505((byte) -119);
            }
            if (var15 == 0) {
                field6402[field6404 * arg5 + arg4] = (byte) var16;
                field6419[field6404 * arg5 + arg4] = (byte) var17;
                field6414[field6404 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6409[field6404 * arg5 + arg4] = (short) (arg1.method482(-772591672) + 1);
                    field6412[field6404 * arg5 + arg4] = arg1.method491(false);
                } else if (var19 > 1) {
                    field6409[field6404 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method482(-772591672);
                        var21[var22] = arg1.method491(false);
                    }
                    field6406.method820((long) (arg4 << 16 | arg5), (byte) -42, new class738(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method482(-772591672);
                        var24[var25] = arg1.method491(false);
                    }
                }
                if (field6407[var15 - 1][arg2 - (field6400 >> 6)][arg3 - (field6408 >> 6)] == null) {
                    field6407[var15 - 1][arg2 - (field6400 >> 6)][arg3 - (field6408 >> 6)] = new class244();
                }
                class377 var26 = new class377(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6407[var15 - 1][arg2 - (field6400 >> 6)][arg3 - (field6408 >> 6)].method1643(var26, -110);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;II)V", line = 1126)
    public static final void method2819(class548 arg0, int arg1, int arg2) {
        class63 var3 = new class63(field6381.method1582("area", false, field6384.field8163));
        int var4 = var3.method505((byte) -119);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method505((byte) -119);
        }
        int var7 = var3.method505((byte) -119);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method505((byte) -119);
        }
        while (true) {
            while (var3.field956 < var3.field954.length) {
                if (var3.method505((byte) -119) == 0) {
                    int var22 = var3.method505((byte) -119);
                    int var23 = var3.method505((byte) -119);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6400;
                            int var27 = var23 * 64 + var25 - field6408;
                            method2818(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method505((byte) -119);
                    int var29 = var3.method505((byte) -119);
                    int var30 = var3.method505((byte) -119);
                    int var31 = var3.method505((byte) -119);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6400;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6408;
                            method2818(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6405 = new byte[field6413 * field6404];
            field6415 = new short[field6413 * field6404];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6413 * field6404];
                for (int var13 = 0; var13 < field6407[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6407[var11][0].length; var19++) {
                        class244 var20 = field6407[var11][var13][var19];
                        if (var20 != null) {
                            for (class377 var21 = (class377) var20.method1638(false); var21 != null; var21 = (class377) var20.method1645(0)) {
                                var12[(var19 * 64 + var21.field5295) * field6404 + var13 * 64 + var21.field5293] = (byte) var21.field5292;
                            }
                        }
                    }
                }
                method2827(var12, field6405, field6415, arg1, arg2);
                for (int var14 = 0; var14 < field6407[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6407[var11][0].length; var15++) {
                        class244 var16 = field6407[var11][var14][var15];
                        if (var16 != null) {
                            for (class377 var17 = (class377) var16.method1638(false); var17 != null; var17 = (class377) var16.method1645(0)) {
                                int var18 = (var15 * 64 + var17.field5295) * field6404 + var14 * 64 + var17.field5293;
                                var17.field5292 = (field6405[var18] & 0xFF) << 16 | field6415[var18] & 0xFFFF;
                                if (var17.field5292 != 0) {
                                    var17.field5292 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2827(field6402, field6405, field6415, arg1, arg2);
            field6402 = null;
            method2809();
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lha;)Lmba;", line = 1306)
    public static final class646 method2820(class548 arg0) {
        int var1 = field6403 - field6418;
        int var2 = field6411 - field6398;
        int var3 = (field6410 - field6416 << 16) / var1;
        int var4 = (field6399 - field6417 << 16) / var2;
        return method2810(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()V", line = 1316)
    public static final void method2821() {
        field6402 = null;
        field6405 = null;
        field6415 = null;
        field6419 = null;
        field6414 = null;
        field6409 = null;
        field6412 = null;
        field6406 = null;
        field6407 = null;
        field6401 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 1328)
    public static final void method2822(int arg0) {
        field6384 = (class604) field6386.method812(124, (long) arg0);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lde;", line = 1331)
    public static final class604 method2823(int arg0) {
        return (class604) field6386.method812(110, (long) arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ld;II)V", line = 1336)
    public static final void method2824(class270 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field6387.field7595; var3++) {
            field6401[var3 + 1] = method2826(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)V", line = 1345)
    public static final void method2825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6418 = arg0 - field6400;
        field6411 = arg1 - field6408;
        field6403 = arg2 - field6400;
        field6398 = arg3 - field6408;
        field6416 = arg4;
        field6417 = arg5;
        field6410 = arg6;
        field6399 = arg7;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ld;III)I", line = 1356)
    private static final int method2826(class270 arg0, int arg1, int arg2, int arg3) {
        class230 var4 = field6387.method3240(arg1, -87);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3125;
        if (var5 >= 0 && arg0.method521(var5, 108).field3562) {
            var5 = -1;
        }
        int var9;
        if (var4.field3113 >= 0) {
            int var6 = var4.field3113;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class320.field4444[class454.method2781(10295, class718.method4022(96, -24115, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class320.field4444[class454.method2781(10295, class718.method4022(96, -24115, arg0.method521(var5, 117).field3566)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3114 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3114;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class320.field4444[class454.method2781(10295, class718.method4022(96, -24115, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([B[B[SII)V", line = 1414)
    private static final void method2827(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6413];
        int[] var6 = new int[field6413];
        int[] var7 = new int[field6413];
        int[] var8 = new int[field6413];
        int[] var9 = new int[field6413];
        for (int var10 = -5; var10 < field6404; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6413; var13++) {
                int var10002;
                if (var11 < field6404) {
                    int var28 = arg0[field6404 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class634 var29 = field6382.method1911(var28 - 1, 123);
                        var5[var13] += var29.field8528;
                        var6[var13] += var29.field8535;
                        var7[var13] += var29.field8526;
                        var8[var13] += var29.field8536;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6404 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class634 var31 = field6382.method1911(var30 - 1, 112);
                        var5[var13] -= var31.field8528;
                        var6[var13] -= var31.field8535;
                        var7[var13] -= var31.field8526;
                        var8[var13] -= var31.field8536;
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
                for (int var19 = -5; var19 < field6413; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6413) {
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
                        if ((arg0[field6404 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6404 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class258.method1742((byte) -124, var14 * 256 / var17, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6404 * var19 + var10;
                            int var27 = class320.field4444[class454.method2781(10295, class563.method3307(var25, 21834, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }
}
