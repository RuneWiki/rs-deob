import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class604 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lhd;")
    private static class694 field8103 = new class694(16);

    @OriginalMember(owner = "client!it", name = "j", descriptor = "[S")
    private static short[] field8109 = new short[1];

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field8114 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "[B")
    private static byte[] field8116 = new byte[1];

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field8117 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lws;")
    public static class333 field8112 = new class333();

    @OriginalMember(owner = "client!it", name = "l", descriptor = "F")
    public static float field8111;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "F")
    public static float field8113;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!it", name = "F", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!it", name = "I", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!it", name = "M", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!it", name = "O", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!it", name = "P", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Lhba;")
    private static class10 field8106;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "Lada;")
    public static class153 field8100;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Laba;")
    public static class164 field8108;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Ln;")
    public static class17 field8104;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lpfa;")
    public static class275 field8101;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Lsj;")
    public static class428 field8105;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "Lek;")
    public static class474 field8107;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Lsf;")
    public static class489 field8110;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Lmga;")
    private static class665 field8102;

    @OriginalMember(owner = "client!it", name = "L", descriptor = "Lhd;")
    private static class694 field8136;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "[B")
    private static byte[] field8127;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "[B")
    private static byte[] field8129;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "[B")
    private static byte[] field8131;

    @OriginalMember(owner = "client!it", name = "K", descriptor = "[B")
    private static byte[] field8135;

    @OriginalMember(owner = "client!it", name = "N", descriptor = "[B")
    private static byte[] field8138;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "[I")
    private static int[] field8125;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "[S")
    private static short[] field8120;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "[S")
    private static short[] field8134;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "[[[B")
    public static byte[][][] field8118;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "[[[Lca;")
    private static class285[][][] field8124;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([B[B[SII)V")
    private static final void method3332(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field8137];
        int[] var6 = new int[field8137];
        int[] var7 = new int[field8137];
        int[] var8 = new int[field8137];
        int[] var9 = new int[field8137];
        for (int var10 = -5; var10 < field8123; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field8137; var13++) {
                int var10002;
                if (var11 < field8123) {
                    int var28 = arg0[field8123 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class253 var29 = field8106.method44(2, var28 - 1);
                        var5[var13] += var29.field3267;
                        var6[var13] += var29.field3264;
                        var7[var13] += var29.field3261;
                        var8[var13] += var29.field3272;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field8123 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class253 var31 = field8106.method44(2, var30 - 1);
                        var5[var13] -= var31.field3267;
                        var6[var13] -= var31.field3264;
                        var7[var13] -= var31.field3261;
                        var8[var13] -= var31.field3272;
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
                for (int var19 = -5; var19 < field8137; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field8137) {
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
                        if ((arg0[field8123 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field8123 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class672.method3727(var16 / var18, var15 / var18, var14 * 256 / var17, 3935);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field8123 * var19 + var10;
                            int var27 = class644.field8740[class697.method3856(class36.method240(var25, 126, 96), true) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lpfa;Lmga;Lhba;Lsj;Ln;Laba;Lada;)V")
    public static final void method3333(class275 arg0, class665 arg1, class10 arg2, class428 arg3, class17 arg4, class164 arg5, class153 arg6) {
        field8101 = arg0;
        field8102 = arg1;
        field8106 = arg2;
        field8105 = arg3;
        field8104 = arg4;
        field8108 = arg5;
        field8100 = arg6;
        field8103.method3839((byte) -94);
        int var7 = field8101.method1651("details", (byte) 77);
        int[] var8 = field8101.method1639(var7, -2979);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class474 var10 = class168.method1020(field8101, var7, 64, var8[var9]);
                field8103.method3832(var10, (long) var10.field5865, 56);
            }
        }
        class536.method2886(false, (byte) -65, true);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Lkp;")
    public static final class456 method3334(int arg0, int arg1) {
        class456 var2 = new class456();
        for (class474 var3 = (class474) field8103.method3830((byte) 81); var3 != null; var3 = (class474) field8103.method3838((byte) -92)) {
            if (var3.field5852 && var3.method2578(arg1, 103, arg0)) {
                var2.method2504((byte) -104, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Le;III)I")
    private static final int method3335(class498 arg0, int arg1, int arg2, int arg3) {
        class505 var4 = field8102.method3700(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6300;
        if (var5 >= 0 && arg0.method2718(var5, (byte) 72).field1818) {
            var5 = -1;
        }
        int var9;
        if (var4.field6302 >= 0) {
            int var6 = var4.field6302;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class644.field8740[class697.method3856(class348.method2006(96, (byte) -124, var8), true) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class644.field8740[class697.method3856(class348.method2006(96, (byte) -119, arg0.method2718(var5, (byte) 72).field1825), true) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6314 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6314;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class644.field8740[class697.method3856(class348.method2006(96, (byte) -117, var12), true) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
    public static final void method3336() {
        field8135 = null;
        field8129 = null;
        field8120 = null;
        field8131 = null;
        field8138 = null;
        field8134 = null;
        field8127 = null;
        field8136 = null;
        field8124 = null;
        field8125 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;)V")
    public static final void method3337(class650 arg0) {
        int var1 = field8119 - field8122;
        int var2 = field8121 - field8139;
        int var3 = (field8132 - field8130 << 16) / var1;
        int var4 = (field8133 - field8126 << 16) / var2;
        method3339(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II)Lek;")
    public static final class474 method3338(int arg0, int arg1) {
        for (class474 var2 = (class474) field8103.method3830((byte) 85); var2 != null; var2 = (class474) field8103.method3838((byte) -92)) {
            if (var2.field5852 && var2.method2578(arg1, 54, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;IIII)V")
    private static final void method3339(class650 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field8119 - field8122;
        int var6 = field8121 - field8139;
        if (field8119 < field8123) {
            var5++;
        }
        if (field8121 < field8137) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field8130;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field8130;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field8122 + var7;
                if (var52 >= 0 && var52 < field8123) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field8133 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field8133 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field8139 + var53;
                            int var58 = field8123 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field8137) {
                                var59 = (field8129[var58] & 0xFF) << 16 | field8120[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field8131[var58] & 0xFF;
                                var61 = field8134[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field8107.field5862 != -1) {
                                    var62 = field8107.field5862 | 0xFF000000;
                                } else if ((field8122 + var7 & 0x4) == (field8121 + var53 & 0x4)) {
                                    var62 = field8125[field8102.field9035 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method475(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3349(arg0, var49, var54, var51, var56, var59, var60, field8138[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class320 var63 = (class320) field8136.method3828((long) (var52 << 16 | var57), (byte) -91);
                                if (var63 != null) {
                                    method3349(arg0, var49, var54, var51, var56, var59, var60, field8138[var58], var63.field3992, var63.field3993, true);
                                }
                            } else {
                                field8109[0] = (short) (var61 - 1);
                                field8116[0] = field8127[var58];
                                method3349(arg0, var49, var54, var51, var56, var59, var60, field8138[var58], field8109, field8116, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field8133 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field8133 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field8107.field5862 != -1) {
                            var68 = field8107.field5862 | 0xFF000000;
                        } else if ((field8122 + var7 & 0x4) == (field8121 + var64 & 0x4)) {
                            var68 = field8125[field8102.field9035 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method475(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field8130;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field8130;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field8122 + var8;
                if (var41 >= 0 && var41 < field8123) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field8133 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field8133 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field8139 + var42;
                            if (var46 >= 0 && var46 < field8137) {
                                int var47 = field8134[field8123 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3340(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class320 var48 = (class320) field8136.method3828((long) (var41 << 16 | var46), (byte) -91);
                                    if (var48 != null) {
                                        method3340(arg0, var38, var43, var40, var45, var48.field3992, var48.field3993);
                                    }
                                } else {
                                    field8109[0] = (short) (var47 - 1);
                                    field8116[0] = field8127[field8123 * var46 + var41];
                                    method3340(arg0, var38, var43, var40, var45, field8109, field8116);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field8122 >> 6;
        int var10 = field8139 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field8119 >> 6;
        int var12 = field8121 >> 6;
        if (var11 >= field8124[0].length) {
            var11 = field8124[0].length - 1;
        }
        if (var12 >= field8124[0][0].length) {
            var12 = field8124[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class285 var28 = field8124[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field8128 >> 6) + var14) * 64;
                        int var30 = ((field8140 >> 6) + var27) * 64;
                        for (class61 var31 = (class61) var28.method1715((byte) 127); var31 != null; var31 = (class61) var28.method1712((byte) -54)) {
                            int var32 = var31.field765 + var29 - field8128 - field8122;
                            int var33 = var31.field759 + var30 - field8140 - field8139;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field8130;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field8130;
                            int var36 = field8133 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field8133 - (arg2 * var33 + arg4 >> 16);
                            method3349(arg0, var34, var36, var35 - var34, var37 - var36, var31.field763, var31.field760 & 0xFF, var31.field762, var31.field761, var31.field764, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class285 var17 = field8124[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field8128 >> 6) + var15) * 64;
                        int var19 = ((field8140 >> 6) + var16) * 64;
                        for (class61 var20 = (class61) var17.method1715((byte) 123); var20 != null; var20 = (class61) var17.method1712((byte) 127)) {
                            int var21 = var20.field765 + var18 - field8128 - field8122;
                            int var22 = var20.field759 + var19 - field8140 - field8139;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field8130;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field8130;
                            int var25 = field8133 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field8133 - (arg2 * var22 + arg4 >> 16);
                            method3340(arg0, var23, var25, var24 - var23, var26 - var25, var20.field761, var20.field764);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;IIII[S[B)V")
    private static final void method3340(class650 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class687 var8 = field8105.method2358(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field9376;
            if (var9 != -1) {
                class329 var10 = field8108.method1002(var9, (byte) 55);
                class468 var11 = var10.method1885((byte) -53, var8.field9442 ? var8.field9379 : false, arg0, var8.field9386 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1552() >> 2;
                    int var13 = arg4 * var11.method1549() >> 2;
                    if (var10.field4088) {
                        int var14 = var8.field9459;
                        int var15 = var8.field9395;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field4090 == 0) {
                            var11.method2549(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1553(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field4090 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Loa;)Lws;")
    public static final class333 method3341(class650 arg0) {
        int var1 = field8119 - field8122;
        int var2 = field8121 - field8139;
        int var3 = (field8132 - field8130 << 16) / var1;
        int var4 = (field8133 - field8126 << 16) / var2;
        return method3346(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()V")
    private static final void method3342() {
        for (int var0 = 0; var0 < field8123; var0++) {
            for (int var11 = 0; var11 < field8137; var11++) {
                int var12 = field8134[field8123 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class320 var13 = (class320) field8136.method3828((long) (var0 << 16 | var11), (byte) -91);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3992.length; var14++) {
                                class687 var15 = field8105.method2358(0, var13.field3992[var14] & 0xFFFF);
                                int var16 = var15.field9437;
                                if (var15.field9421 != null) {
                                    class687 var17 = var15.method3800(field8100, (byte) -99);
                                    if (var17 != null) {
                                        var16 = var17.field9437;
                                    }
                                }
                                if (var16 != -1) {
                                    class79 var18 = new class79(var16);
                                    var18.field1025 = var0;
                                    var18.field1031 = var11;
                                    field8112.method1904(var18, -110);
                                }
                            }
                        }
                    } else {
                        class687 var19 = field8105.method2358(0, var12 - 1);
                        int var20 = var19.field9437;
                        if (var19.field9421 != null) {
                            class687 var21 = var19.method3800(field8100, (byte) -125);
                            if (var21 != null) {
                                var20 = var21.field9437;
                            }
                        }
                        if (var20 != -1) {
                            class79 var22 = new class79(var20);
                            var22.field1025 = var0;
                            var22.field1031 = var11;
                            field8112.method1904(var22, -44);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field8124[0].length; var2++) {
                for (int var3 = 0; var3 < field8124[0][0].length; var3++) {
                    class285 var4 = field8124[var1][var2][var3];
                    if (var4 != null) {
                        for (class61 var5 = (class61) var4.method1715((byte) 126); var5 != null; var5 = (class61) var4.method1712((byte) 126)) {
                            if (var5.field761 != null) {
                                for (int var6 = 0; var6 < var5.field761.length; var6++) {
                                    class687 var7 = field8105.method2358(0, var5.field761[var6] & 0xFFFF);
                                    int var8 = var7.field9437;
                                    if (var7.field9421 != null) {
                                        class687 var9 = var7.method3800(field8100, (byte) -102);
                                        if (var9 != null) {
                                            var8 = var9.field9437;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class79 var10 = new class79(var8);
                                        var10.field1025 = ((field8128 >> 6) + var2) * 64 + var5.field765 - field8128;
                                        var10.field1031 = ((field8140 >> 6) + var3) * 64 + var5.field759 - field8140;
                                        field8112.method1904(var10, -58);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static final void method3343(int arg0) {
        field8107 = (class474) field8103.method3828((long) arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "()V")
    public static void method3344() {
        field8102 = null;
        field8106 = null;
        field8105 = null;
        field8104 = null;
        field8108 = null;
        field8100 = null;
        field8107 = null;
        field8101 = null;
        field8103 = null;
        field8118 = null;
        field8109 = null;
        field8116 = null;
        field8110 = null;
        field8112 = null;
        field8125 = null;
        field8135 = null;
        field8129 = null;
        field8120 = null;
        field8131 = null;
        field8138 = null;
        field8134 = null;
        field8127 = null;
        field8136 = null;
        field8124 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;Lji;IIII[I[I)V")
    private static final void method3345(class650 arg0, class572 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3097((byte) 12);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3097((byte) 12);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field8135[field8123 * arg5 + arg4] = (byte) var11;
                    field8131[field8123 * arg5 + arg4] = 0;
                } else {
                    field8131[field8123 * arg5 + arg4] = (byte) var11;
                    field8138[field8123 * arg5 + arg4] = 0;
                    field8135[field8123 * arg5 + arg4] = arg1.method3083(255);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3097((byte) 12);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3097((byte) 12);
                var18 = arg1.method3097((byte) 12);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3097((byte) 12);
            }
            if (var15 == 0) {
                field8135[field8123 * arg5 + arg4] = (byte) var16;
                field8131[field8123 * arg5 + arg4] = (byte) var17;
                field8138[field8123 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field8134[field8123 * arg5 + arg4] = (short) (arg1.method3031(-1) + 1);
                    field8127[field8123 * arg5 + arg4] = arg1.method3083(255);
                } else if (var19 > 1) {
                    field8134[field8123 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3031(-1);
                        var21[var22] = arg1.method3083(255);
                    }
                    field8136.method3832(new class320(var20, var21), (long) (arg4 << 16 | arg5), 59);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3031(-1);
                        var24[var25] = arg1.method3083(255);
                    }
                }
                if (field8124[var15 - 1][arg2 - (field8128 >> 6)][arg3 - (field8140 >> 6)] == null) {
                    field8124[var15 - 1][arg2 - (field8128 >> 6)][arg3 - (field8140 >> 6)] = new class285();
                }
                class61 var26 = new class61(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field8124[var15 - 1][arg2 - (field8128 >> 6)][arg3 - (field8140 >> 6)].method1714(var26, (byte) 11);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Loa;IIII)Lws;")
    private static final class333 method3346(class650 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class79 var5 = (class79) field8112.method1909(true); var5 != null; var5 = (class79) field8112.method1916((byte) 122)) {
            method3353(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field8112;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "()V")
    public static final void method3347() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field8110.field6108; var1++) {
            boolean var2 = field8107.method2573(-91, field8110.field6111[var1] >> 28 & 0x3, field8110.field6111[var1] & 0x3FFF, field8110.field6111[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class79 var3 = new class79(field8110.field6113[var1]);
                var3.field1025 = var0[1] - field8128;
                var3.field1031 = var0[2] - field8140;
                field8112.method1904(var3, -80);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Lek;")
    public static final class474 method3348(int arg0) {
        return (class474) field8103.method3828((long) arg0, (byte) -91);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;IIIIIII[S[BZ)V")
    private static final void method3349(class650 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method475(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field8125[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method475(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class449.method2454(arg7 >> 6 & 0x3, var12, field8118, 126, field8115, var11, field8125[arg6], arg3, arg4, arg0, arg5, arg2, arg1);
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
                class687 var18 = field8105.method2358(0, arg8[var16] & 0xFFFF);
                if (var18.field9376 == -1) {
                    int var19 = -3355444;
                    if (var18.field9382 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method437(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method454(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method437(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method454(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method437(arg1, arg2, arg4, -1, 0);
                            arg0.method454(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method437(var14, arg2, arg4, -1, 0);
                            arg0.method454(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method437(var14, arg2, arg4, -1, 0);
                            arg0.method454(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method437(arg1, arg2, arg4, -1, 0);
                            arg0.method454(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method454(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method454(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method454(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method454(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method454(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method454(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "()V")
    public static final void method3350() {
        field8135 = new byte[field8137 * field8123];
        field8131 = new byte[field8137 * field8123];
        field8138 = new byte[field8137 * field8123];
        field8134 = new short[field8137 * field8123];
        field8127 = new byte[field8137 * field8123];
        field8136 = new class694(1024);
        field8124 = new class285[3][field8123 >> 6][field8137 >> 6];
        field8125 = new int[field8102.field9028 + 1];
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;II)V")
    public static final void method3351(class650 arg0, int arg1, int arg2) {
        class572 var3 = new class572(field8101.method1649(-1, "area", field8107.field5857));
        int var4 = var3.method3097((byte) 12);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3097((byte) 12);
        }
        int var7 = var3.method3097((byte) 12);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3097((byte) 12);
        }
        while (true) {
            while (var3.field7313 < var3.field7318.length) {
                if (var3.method3097((byte) 12) == 0) {
                    int var22 = var3.method3097((byte) 12);
                    int var23 = var3.method3097((byte) 12);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field8128;
                            int var27 = var23 * 64 + var25 - field8140;
                            method3345(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3097((byte) 12);
                    int var29 = var3.method3097((byte) 12);
                    int var30 = var3.method3097((byte) 12);
                    int var31 = var3.method3097((byte) 12);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field8128;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field8140;
                            method3345(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field8129 = new byte[field8137 * field8123];
            field8120 = new short[field8137 * field8123];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field8137 * field8123];
                for (int var13 = 0; var13 < field8124[var11].length; var13++) {
                    for (int var19 = 0; var19 < field8124[var11][0].length; var19++) {
                        class285 var20 = field8124[var11][var13][var19];
                        if (var20 != null) {
                            for (class61 var21 = (class61) var20.method1715((byte) 122); var21 != null; var21 = (class61) var20.method1712((byte) 20)) {
                                var12[(var19 * 64 + var21.field759) * field8123 + var13 * 64 + var21.field765] = (byte) var21.field763;
                            }
                        }
                    }
                }
                method3332(var12, field8129, field8120, arg1, arg2);
                for (int var14 = 0; var14 < field8124[var11].length; var14++) {
                    for (int var15 = 0; var15 < field8124[var11][0].length; var15++) {
                        class285 var16 = field8124[var11][var14][var15];
                        if (var16 != null) {
                            for (class61 var17 = (class61) var16.method1715((byte) 122); var17 != null; var17 = (class61) var16.method1712((byte) -54)) {
                                int var18 = (var15 * 64 + var17.field759) * field8123 + var14 * 64 + var17.field765;
                                var17.field763 = (field8129[var18] & 0xFF) << 16 | field8120[var18] & 0xFFFF;
                                if (var17.field763 != 0) {
                                    var17.field763 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3332(field8135, field8129, field8120, arg1, arg2);
            field8135 = null;
            method3342();
            return;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Le;II)V")
    public static final void method3352(class498 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field8102.field9028; var3++) {
            field8125[var3 + 1] = method3335(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Loa;Lfca;IIII)V")
    private static final void method3353(class650 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field1032 = ((arg1.field1025 - field8122) * arg2 + arg4 >> 16) + field8130;
        arg1.field1026 = field8133 - ((arg1.field1031 - field8139) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8122 = arg0 - field8128;
        field8121 = arg1 - field8140;
        field8119 = arg2 - field8128;
        field8139 = arg3 - field8140;
        field8130 = arg4;
        field8126 = arg5;
        field8132 = arg6;
        field8133 = arg7;
    }
}
