import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class224 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Ltm;")
    private static class349 field2803 = new class349(16);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "[B")
    private static byte[] field2810 = new byte[1];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[S")
    private static short[] field2807 = new short[1];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2813 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2812 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lbb;")
    public static class270 field2806 = new class270();

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "F")
    public static float field2811;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "F")
    public static float field2814;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lal;")
    public static class195 field2802;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lwo;")
    public static class285 field2804;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Ltm;")
    private static class349 field2820;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lv;")
    public static class392 field2805;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[B")
    private static byte[] field2822;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "[B")
    private static byte[] field2824;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[B")
    private static byte[] field2826;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[B")
    private static byte[] field2827;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[B")
    private static byte[] field2828;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "[I")
    private static int[] field2823;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "[S")
    private static short[] field2831;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[S")
    private static short[] field2832;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[[[B")
    public static byte[][][] field2808;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[[[Lwp;")
    private static class288[][][] field2817;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;)V", line = 4)
    public static final void method1362(class118 arg0) {
        int var1 = field2821 - field2818;
        int var2 = field2836 - field2834;
        int var3 = (field2830 - field2829 << 16) / var1;
        int var4 = (field2819 - field2835 << 16) / var2;
        method1381(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;IIII)Lbb;", line = 16)
    private static final class270 method1363(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class278 var5 = (class278) field2806.method1690((byte) -124); var5 != null; var5 = (class278) field2806.method1699((byte) 65)) {
            method1367(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2806;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V", line = 26)
    public static final void method1364() {
        field2824 = null;
        field2828 = null;
        field2831 = null;
        field2827 = null;
        field2822 = null;
        field2832 = null;
        field2826 = null;
        field2820 = null;
        field2817 = null;
        field2823 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;IIII[S[B)V", line = 38)
    private static final void method1365(class118 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class446 var8 = class380.method2361(arg5[var7] & 0xFFFF, -29012);
            int var9 = var8.field6224;
            if (var9 != -1) {
                class66 var10 = class236.method1518(var9, 34);
                class436 var11 = var10.method382(var8.field6252 ? arg6[var7] >> 6 & 0x3 : 0, var8.field6228 ? var8.field6198 : false, 118, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method235() >> 2;
                    int var13 = arg4 * var11.method236() >> 2;
                    if (var10.field790) {
                        int var14 = var8.field6244;
                        int var15 = var8.field6170;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field792 == 0) {
                            var11.method2664(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method163(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field792 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()V", line = 98)
    private static final void method1366() {
        for (int var0 = 0; var0 < field2816; var0++) {
            for (int var11 = 0; var11 < field2833; var11++) {
                int var12 = field2832[field2816 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class48 var13 = (class48) field2820.method2218(1, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field564.length; var14++) {
                                class446 var15 = class380.method2361(var13.field564[var14] & 0xFFFF, -29012);
                                int var16 = var15.field6202;
                                if (var15.field6233 != null) {
                                    class446 var17 = var15.method2759(24964);
                                    if (var17 != null) {
                                        var16 = var17.field6202;
                                    }
                                }
                                if (var16 != -1) {
                                    class278 var18 = new class278(var16);
                                    var18.field3601 = var0;
                                    var18.field3593 = var11;
                                    field2806.method1696(false, var18);
                                }
                            }
                        }
                    } else {
                        class446 var19 = class380.method2361(var12 - 1, -29012);
                        int var20 = var19.field6202;
                        if (var19.field6233 != null) {
                            class446 var21 = var19.method2759(24964);
                            if (var21 != null) {
                                var20 = var21.field6202;
                            }
                        }
                        if (var20 != -1) {
                            class278 var22 = new class278(var20);
                            var22.field3601 = var0;
                            var22.field3593 = var11;
                            field2806.method1696(false, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2817[0].length; var2++) {
                for (int var3 = 0; var3 < field2817[0][0].length; var3++) {
                    class288 var4 = field2817[var1][var2][var3];
                    if (var4 != null) {
                        for (class294 var5 = (class294) var4.method1838(-6325); var5 != null; var5 = (class294) var4.method1834((byte) 93)) {
                            if (var5.field3866 != null) {
                                for (int var6 = 0; var6 < var5.field3866.length; var6++) {
                                    class446 var7 = class380.method2361(var5.field3866[var6] & 0xFFFF, -29012);
                                    int var8 = var7.field6202;
                                    if (var7.field6233 != null) {
                                        class446 var9 = var7.method2759(24964);
                                        if (var9 != null) {
                                            var8 = var9.field6202;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class278 var10 = new class278(var8);
                                        var10.field3601 = ((field2825 >> 6) + var2) * 64 + var5.field3865 - field2825;
                                        var10.field3593 = ((field2815 >> 6) + var3) * 64 + var5.field3863 - field2815;
                                        field2806.method1696(false, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;Lpd;IIII)V", line = 254)
    private static final void method1367(class118 arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3603 = ((arg1.field3601 - field2818) * arg2 + arg4 >> 16) + field2829;
        arg1.field3605 = field2819 - ((arg1.field3593 - field2834) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;Lbg;IIII[I[I)V", line = 259)
    private static final void method1368(class118 arg0, class242 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1563(-128);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1563(-128);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2824[field2816 * arg5 + arg4] = (byte) var11;
                    field2827[field2816 * arg5 + arg4] = 0;
                } else {
                    field2827[field2816 * arg5 + arg4] = (byte) var11;
                    field2822[field2816 * arg5 + arg4] = 0;
                    field2824[field2816 * arg5 + arg4] = arg1.method1589(false);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1563(-128);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1563(-128);
                var18 = arg1.method1563(-128);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1563(-128);
            }
            if (var15 == 0) {
                field2824[field2816 * arg5 + arg4] = (byte) var16;
                field2827[field2816 * arg5 + arg4] = (byte) var17;
                field2822[field2816 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2832[field2816 * arg5 + arg4] = (short) (arg1.method1587((byte) -102) + 1);
                    field2826[field2816 * arg5 + arg4] = arg1.method1589(false);
                } else if (var19 > 1) {
                    field2832[field2816 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1587((byte) -102);
                        var21[var22] = arg1.method1589(false);
                    }
                    field2820.method2227(new class48(var20, var21), -8218, (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1587((byte) -102);
                        var24[var25] = arg1.method1589(false);
                    }
                }
                if (field2817[var15 - 1][arg2 - (field2825 >> 6)][arg3 - (field2815 >> 6)] == null) {
                    field2817[var15 - 1][arg2 - (field2825 >> 6)][arg3 - (field2815 >> 6)] = new class288();
                }
                class294 var26 = new class294(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2817[var15 - 1][arg2 - (field2825 >> 6)][arg3 - (field2815 >> 6)].method1833(var26, 10209);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lp;", line = 395)
    public static final class161 method1369(int arg0, int arg1) {
        class161 var2 = new class161();
        for (class195 var3 = (class195) field2803.method2222(0); var3 != null; var3 = (class195) field2803.method2215(false)) {
            if (var3.field2302 && var3.method1214(arg0, arg1, false)) {
                var2.method1028((byte) 33, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([B[B[SII)V", line = 411)
    private static final void method1370(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2833];
        int[] var6 = new int[field2833];
        int[] var7 = new int[field2833];
        int[] var8 = new int[field2833];
        int[] var9 = new int[field2833];
        for (int var10 = -5; var10 < field2816; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2833; var13++) {
                int var10002;
                if (var11 < field2816) {
                    int var28 = arg0[field2816 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class214 var29 = class75.method447(var28 - 1, (byte) 81);
                        var5[var13] += var29.field2649;
                        var6[var13] += var29.field2651;
                        var7[var13] += var29.field2650;
                        var8[var13] += var29.field2640;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2816 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class214 var31 = class75.method447(var30 - 1, (byte) 81);
                        var5[var13] -= var31.field2649;
                        var6[var13] -= var31.field2651;
                        var7[var13] -= var31.field2650;
                        var8[var13] -= var31.field2640;
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
                for (int var19 = -5; var19 < field2833; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2833) {
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
                        if ((arg0[field2816 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2816 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class362.method2276(var14 * 256 / var17, var16 / var18, 28896, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2816 * var19 + var10;
                            int var27 = class212.field2589[class80.method507(-89, class261.method1653(109, var25, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;II)V", line = 557)
    public static final void method1371(class118 arg0, int arg1, int arg2) {
        class242 var3 = new class242(field2804.method1800(field2802.field2301, "area", true));
        int var4 = var3.method1563(-128);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1563(-128);
        }
        int var7 = var3.method1563(-128);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1563(-128);
        }
        while (true) {
            while (var3.field3211 < var3.field3188.length) {
                if (var3.method1563(-128) == 0) {
                    int var22 = var3.method1563(-128);
                    int var23 = var3.method1563(-128);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2825;
                            int var27 = var23 * 64 + var25 - field2815;
                            method1368(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1563(-128);
                    int var29 = var3.method1563(-128);
                    int var30 = var3.method1563(-128);
                    int var31 = var3.method1563(-128);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2825;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2815;
                            method1368(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2828 = new byte[field2833 * field2816];
            field2831 = new short[field2833 * field2816];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2833 * field2816];
                for (int var13 = 0; var13 < field2817[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2817[var11][0].length; var19++) {
                        class288 var20 = field2817[var11][var13][var19];
                        if (var20 != null) {
                            for (class294 var21 = (class294) var20.method1838(-6325); var21 != null; var21 = (class294) var20.method1834((byte) 119)) {
                                var12[(var19 * 64 + var21.field3863) * field2816 + var13 * 64 + var21.field3865] = (byte) var21.field3868;
                            }
                        }
                    }
                }
                method1370(var12, field2828, field2831, arg1, arg2);
                for (int var14 = 0; var14 < field2817[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2817[var11][0].length; var15++) {
                        class288 var16 = field2817[var11][var14][var15];
                        if (var16 != null) {
                            for (class294 var17 = (class294) var16.method1838(-6325); var17 != null; var17 = (class294) var16.method1834((byte) 12)) {
                                int var18 = (var15 * 64 + var17.field3863) * field2816 + var14 * 64 + var17.field3865;
                                var17.field3868 = (field2828[var18] & 0xFF) << 16 | field2831[var18] & 0xFFFF;
                                if (var17.field3868 != 0) {
                                    var17.field3868 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1370(field2824, field2828, field2831, arg1, arg2);
            field2824 = null;
            method1366();
            return;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lgd;II)V", line = 737)
    public static final void method1372(class172 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class288.field3797; var3++) {
            field2823[var3 + 1] = method1382(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lal;", line = 750)
    public static final class195 method1373(int arg0, int arg1) {
        for (class195 var2 = (class195) field2803.method2222(0); var2 != null; var2 = (class195) field2803.method2215(false)) {
            if (var2.field2302 && var2.method1214(arg0, arg1, false)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Luo;)Lbb;", line = 764)
    public static final class270 method1374(class118 arg0) {
        int var1 = field2821 - field2818;
        int var2 = field2836 - field2834;
        int var3 = (field2830 - field2829 << 16) / var1;
        int var4 = (field2819 - field2835 << 16) / var2;
        return method1363(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V", line = 775)
    public static final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2818 = arg0 - field2825;
        field2836 = arg1 - field2815;
        field2821 = arg2 - field2825;
        field2834 = arg3 - field2815;
        field2829 = arg4;
        field2835 = arg5;
        field2830 = arg6;
        field2819 = arg7;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()V", line = 785)
    public static final void method1376() {
        field2824 = new byte[field2833 * field2816];
        field2827 = new byte[field2833 * field2816];
        field2822 = new byte[field2833 * field2816];
        field2832 = new short[field2833 * field2816];
        field2826 = new byte[field2833 * field2816];
        field2820 = new class349(1024);
        field2817 = new class288[3][field2816 >> 6][field2833 >> 6];
        field2823 = new int[class288.field3797 + 1];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwo;)V", line = 795)
    public static final void method1377(class285 arg0) {
        field2804 = arg0;
        field2803.method2216((byte) -96);
        int var1 = field2804.method1806((byte) -105, "details");
        int[] var2 = field2804.method1810(123, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class195 var4 = class169.method1077(field2804, var2[var3], (byte) -18, var1);
            field2803.method2227(var4, -8218, (long) var4.field2313);
        }
        class220.method1339(true, false, 0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Luo;IIIIIII[S[BZ)V", line = 815)
    private static final void method1378(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method789(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2823[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method789(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class223.method1357(var12, field2823[arg6], arg7 >> 6 & 0x3, var11, arg0, arg3, field2809, field2808, arg2, arg5, arg4, arg1, 115);
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
                class446 var18 = class380.method2361(arg8[var16] & 0xFFFF, -29012);
                if (var18.field6224 == -1) {
                    int var19 = -3355444;
                    if (var18.field6235 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method696(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method709(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method696(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method709(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method696(arg1, arg2, arg4, -1, 0);
                            arg0.method709(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method696(var14, arg2, arg4, -1, 0);
                            arg0.method709(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method696(var14, arg2, arg4, -1, 0);
                            arg0.method709(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method696(arg1, arg2, arg4, -1, 0);
                            arg0.method709(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method709(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method709(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method709(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method709(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method709(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method709(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()V", line = 978)
    public static void method1379() {
        field2802 = null;
        field2804 = null;
        field2803 = null;
        field2808 = null;
        field2807 = null;
        field2810 = null;
        field2805 = null;
        field2806 = null;
        field2823 = null;
        field2824 = null;
        field2828 = null;
        field2831 = null;
        field2827 = null;
        field2822 = null;
        field2832 = null;
        field2826 = null;
        field2820 = null;
        field2817 = null;
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "()V", line = 999)
    public static final void method1380() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2805.field5337; var1++) {
            boolean var2 = field2802.method1211(field2805.field5342[var1] >> 14 & 0x3FFF, field2805.field5342[var1] & 0x3FFF, true, var0, field2805.field5342[var1] >> 28 & 0x3);
            if (var2) {
                class278 var3 = new class278(field2805.field5338[var1]);
                var3.field3601 = var0[1] - field2825;
                var3.field3593 = var0[2] - field2815;
                field2806.method1696(false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Luo;IIII)V", line = 1021)
    private static final void method1381(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2821 - field2818;
        int var6 = field2836 - field2834;
        if (field2821 < field2816) {
            var5++;
        }
        if (field2836 < field2833) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2829;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2829;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2818 + var7;
                if (var52 >= 0 && var52 < field2816) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2819 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2819 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2834 + var53;
                            int var58 = field2816 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2833) {
                                var59 = (field2828[var58] & 0xFF) << 16 | field2831[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2827[var58] & 0xFF;
                                var61 = field2832[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2802.field2308 != -1) {
                                    var62 = field2802.field2308 | 0xFF000000;
                                } else if ((field2836 + var53 & 0x4) == (field2818 + var7 & 0x4)) {
                                    var62 = field2823[class153.field1794 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method789(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1378(arg0, var49, var54, var51, var56, var59, var60, field2822[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class48 var63 = (class48) field2820.method2218(1, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1378(arg0, var49, var54, var51, var56, var59, var60, field2822[var58], var63.field564, var63.field565, true);
                                }
                            } else {
                                field2807[0] = (short) (var61 - 1);
                                field2810[0] = field2826[var58];
                                method1378(arg0, var49, var54, var51, var56, var59, var60, field2822[var58], field2807, field2810, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2819 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2819 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2802.field2308 != -1) {
                            var68 = field2802.field2308 | 0xFF000000;
                        } else if ((field2836 + var64 & 0x4) == (field2818 + var7 & 0x4)) {
                            var68 = field2823[class153.field1794 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method789(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2829;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2829;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2818 + var8;
                if (var41 >= 0 && var41 < field2816) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2819 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2819 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2834 + var42;
                            if (var46 >= 0 && var46 < field2833) {
                                int var47 = field2832[field2816 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1365(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class48 var48 = (class48) field2820.method2218(1, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method1365(arg0, var38, var43, var40, var45, var48.field564, var48.field565);
                                    }
                                } else {
                                    field2807[0] = (short) (var47 - 1);
                                    field2810[0] = field2826[field2816 * var46 + var41];
                                    method1365(arg0, var38, var43, var40, var45, field2807, field2810);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2818 >> 6;
        int var10 = field2834 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2821 >> 6;
        int var12 = field2836 >> 6;
        if (var11 >= field2817[0].length) {
            var11 = field2817[0].length - 1;
        }
        if (var12 >= field2817[0][0].length) {
            var12 = field2817[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class288 var28 = field2817[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2825 >> 6) + var14) * 64;
                        int var30 = ((field2815 >> 6) + var27) * 64;
                        for (class294 var31 = (class294) var28.method1838(-6325); var31 != null; var31 = (class294) var28.method1834((byte) 40)) {
                            int var32 = var31.field3865 + var29 - field2825 - field2818;
                            int var33 = var31.field3863 + var30 - field2815 - field2834;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2829;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2829;
                            int var36 = field2819 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2819 - (arg2 * var33 + arg4 >> 16);
                            method1378(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3868, var31.field3869 & 0xFF, var31.field3864, var31.field3866, var31.field3867, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class288 var17 = field2817[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2825 >> 6) + var15) * 64;
                        int var19 = ((field2815 >> 6) + var16) * 64;
                        for (class294 var20 = (class294) var17.method1838(-6325); var20 != null; var20 = (class294) var17.method1834((byte) 92)) {
                            int var21 = var20.field3865 + var18 - field2825 - field2818;
                            int var22 = var20.field3863 + var19 - field2815 - field2834;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2829;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2829;
                            int var25 = field2819 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2819 - (arg2 * var22 + arg4 >> 16);
                            method1365(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3866, var20.field3867);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lgd;III)I", line = 1364)
    private static final int method1382(class172 arg0, int arg1, int arg2, int arg3) {
        class352 var4 = class67.method391(arg1, true);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4780;
        if (var5 >= 0 && arg0.method960(var5, (byte) -40).field4862) {
            var5 = -1;
        }
        int var9;
        if (var4.field4791 >= 0) {
            int var6 = var4.field4791;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class212.field2589[class80.method507(-18, class62.method355((byte) -104, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class212.field2589[class80.method507(-24, class62.method355((byte) -24, 96, arg0.method960(var5, (byte) -40).field4864)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4787 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4787;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class212.field2589[class80.method507(-81, class62.method355((byte) -41, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 1420)
    public static final void method1383(int arg0) {
        field2802 = (class195) field2803.method2218(1, (long) arg0);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lal;", line = 1423)
    public static final class195 method1384(int arg0) {
        return (class195) field2803.method2218(1, (long) arg0);
    }
}
