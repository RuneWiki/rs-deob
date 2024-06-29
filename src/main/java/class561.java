import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class561 {

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lnj;")
    private static class436 field7644 = new class436(16);

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field7654 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "[B")
    private static byte[] field7652 = new byte[1];

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "[S")
    private static short[] field7653 = new short[1];

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field7655 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "Lrh;")
    public static class59 field7658 = new class59();

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "F")
    public static float field7650;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "F")
    public static float field7651;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lpg;")
    public static class150 field7646;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "Lpq;")
    public static class159 field7648;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Lum;")
    private static class169 field7641;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "Ldd;")
    public static class212 field7645;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "Lhe;")
    public static class250 field7647;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lfe;")
    public static class294 field7643;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "Lrj;")
    public static class37 field7649;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "Lvb;")
    private static class411 field7642;

    @OriginalMember(owner = "client!oaa", name = "K", descriptor = "Lnj;")
    private static class436 field7677;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "Lps;")
    public static class610 field7656;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "[B")
    private static byte[] field7668;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "[B")
    private static byte[] field7669;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "[B")
    private static byte[] field7672;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "[B")
    private static byte[] field7673;

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "[B")
    private static byte[] field7680;

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "[I")
    private static int[] field7679;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "[S")
    private static short[] field7671;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "[S")
    private static short[] field7674;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "[[[B")
    public static byte[][][] field7657;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "[[[Lpn;")
    private static class361[][][] field7681;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;IIII[S[B)V")
    private static final void method3145(class689 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class252 var8 = field7643.method1746(arg5[var7] & 0xFFFF, (byte) 119);
            int var9 = var8.field3398;
            if (var9 != -1) {
                class677 var10 = field7646.method1013(var9, (byte) -78);
                class424 var11 = var10.method3742((byte) -127, var8.field3466 ? var8.field3399 : false, arg0, var8.field3426 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1160() >> 2;
                    int var13 = arg4 * var11.method1157() >> 2;
                    if (var10.field9602) {
                        int var14 = var8.field3450;
                        int var15 = var8.field3431;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field9605 == 0) {
                            var11.method2446(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method65(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field9605 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)Lhe;")
    public static final class250 method3146(int arg0, int arg1) {
        for (class250 var2 = (class250) field7644.method2499(-9); var2 != null; var2 = (class250) field7644.method2503(0)) {
            if (var2.field3371 && var2.method1557(-1, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "()V")
    public static final void method3147() {
        field7672 = null;
        field7668 = null;
        field7674 = null;
        field7669 = null;
        field7680 = null;
        field7671 = null;
        field7673 = null;
        field7677 = null;
        field7681 = null;
        field7679 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lpq;Lvb;Lum;Lfe;Lrj;Lpg;Ldd;)V")
    public static final void method3148(class159 arg0, class411 arg1, class169 arg2, class294 arg3, class37 arg4, class150 arg5, class212 arg6) {
        field7648 = arg0;
        field7642 = arg1;
        field7641 = arg2;
        field7643 = arg3;
        field7649 = arg4;
        field7646 = arg5;
        field7645 = arg6;
        field7644.method2510(-1);
        int var7 = field7648.method1090("details", (byte) -108);
        int[] var8 = field7648.method1084((byte) 99, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class250 var10 = class186.method1195(field7648, (byte) -38, var8[var9], var7);
                field7644.method2504((long) var10.field3377, -126, var10);
            }
        }
        class397.method2352(false, 114, true);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)Lifa;")
    public static final class487 method3149(int arg0, int arg1) {
        class487 var2 = new class487();
        for (class250 var3 = (class250) field7644.method2499(-8); var3 != null; var3 = (class250) field7644.method2503(0)) {
            if (var3.field3371 && var3.method1557(-1, arg1, arg0)) {
                var2.method2713(-82, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;)Lrh;")
    public static final class59 method3150(class689 arg0) {
        int var1 = field7666 - field7665;
        int var2 = field7662 - field7678;
        int var3 = (field7664 - field7663 << 16) / var1;
        int var4 = (field7660 - field7670 << 16) / var2;
        return method3164(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;II)V")
    public static final void method3151(class689 arg0, int arg1, int arg2) {
        class138 var3 = new class138(field7648.method1063(field7647.field3375, "area", -83));
        int var4 = var3.method957((byte) -94);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method957((byte) -112);
        }
        int var7 = var3.method957((byte) -72);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method957((byte) -77);
        }
        while (true) {
            while (var3.field1745 < var3.field1712.length) {
                if (var3.method957((byte) -119) == 0) {
                    int var22 = var3.method957((byte) -111);
                    int var23 = var3.method957((byte) -113);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7661;
                            int var27 = var23 * 64 + var25 - field7675;
                            method3160(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method957((byte) -77);
                    int var29 = var3.method957((byte) -65);
                    int var30 = var3.method957((byte) -126);
                    int var31 = var3.method957((byte) -65);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7661;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7675;
                            method3160(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7668 = new byte[field7676 * field7667];
            field7674 = new short[field7676 * field7667];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7676 * field7667];
                for (int var13 = 0; var13 < field7681[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7681[var11][0].length; var19++) {
                        class361 var20 = field7681[var11][var13][var19];
                        if (var20 != null) {
                            for (class408 var21 = (class408) var20.method2224((byte) -112); var21 != null; var21 = (class408) var20.method2222((byte) -76)) {
                                var12[(var19 * 64 + var21.field5741) * field7676 + var13 * 64 + var21.field5740] = (byte) var21.field5744;
                            }
                        }
                    }
                }
                method3154(var12, field7668, field7674, arg1, arg2);
                for (int var14 = 0; var14 < field7681[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7681[var11][0].length; var15++) {
                        class361 var16 = field7681[var11][var14][var15];
                        if (var16 != null) {
                            for (class408 var17 = (class408) var16.method2224((byte) -112); var17 != null; var17 = (class408) var16.method2222((byte) -38)) {
                                int var18 = (var15 * 64 + var17.field5741) * field7676 + var14 * 64 + var17.field5740;
                                var17.field5744 = (field7668[var18] & 0xFF) << 16 | field7674[var18] & 0xFFFF;
                                if (var17.field5744 != 0) {
                                    var17.field5744 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method3154(field7672, field7668, field7674, arg1, arg2);
            field7672 = null;
            method3156();
            return;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7665 = arg0 - field7661;
        field7662 = arg1 - field7675;
        field7666 = arg2 - field7661;
        field7678 = arg3 - field7675;
        field7663 = arg4;
        field7670 = arg5;
        field7664 = arg6;
        field7660 = arg7;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;Lmaa;IIII)V")
    private static final void method3153(class689 arg0, class588 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field8077 = ((arg1.field8075 - field7665) * arg2 + arg4 >> 16) + field7663;
        arg1.field8081 = field7660 - ((arg1.field8074 - field7678) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([B[B[SII)V")
    private static final void method3154(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7667];
        int[] var6 = new int[field7667];
        int[] var7 = new int[field7667];
        int[] var8 = new int[field7667];
        int[] var9 = new int[field7667];
        for (int var10 = -5; var10 < field7676; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7667; var13++) {
                int var10002;
                if (var11 < field7676) {
                    int var28 = arg0[field7676 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class235 var29 = field7641.method1127(var28 - 1, 1);
                        var5[var13] += var29.field3066;
                        var6[var13] += var29.field3072;
                        var7[var13] += var29.field3068;
                        var8[var13] += var29.field3069;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7676 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class235 var31 = field7641.method1127(var30 - 1, 1);
                        var5[var13] -= var31.field3066;
                        var6[var13] -= var31.field3072;
                        var7[var13] -= var31.field3068;
                        var8[var13] -= var31.field3069;
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
                for (int var19 = -5; var19 < field7667; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7667) {
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
                        if ((arg0[field7676 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7676 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class609.method3361(var14 * 256 / var17, (byte) 38, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7676 * var19 + var10;
                            int var27 = class554.field7586[class306.method1836(127, class511.method2894(96, false, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;IIII)V")
    private static final void method3155(class689 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7666 - field7665;
        int var6 = field7662 - field7678;
        if (field7666 < field7676) {
            var5++;
        }
        if (field7662 < field7667) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field7663;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field7663;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field7665 + var7;
                if (var52 >= 0 && var52 < field7676) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7660 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7660 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field7678 + var53;
                            int var58 = field7676 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7667) {
                                var59 = (field7668[var58] & 0xFF) << 16 | field7674[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7669[var58] & 0xFF;
                                var61 = field7671[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field7647.field3362 != -1) {
                                    var62 = field7647.field3362 | 0xFF000000;
                                } else if ((field7665 + var7 & 0x4) == (field7662 + var53 & 0x4)) {
                                    var62 = field7679[field7642.field5771 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1926(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method3163(arg0, var49, var54, var51, var56, var59, var60, field7680[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class590 var63 = (class590) field7677.method2506(79, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method3163(arg0, var49, var54, var51, var56, var59, var60, field7680[var58], var63.field8094, var63.field8093, true);
                                }
                            } else {
                                field7653[0] = (short) (var61 - 1);
                                field7652[0] = field7673[var58];
                                method3163(arg0, var49, var54, var51, var56, var59, var60, field7680[var58], field7653, field7652, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7660 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7660 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field7647.field3362 != -1) {
                            var68 = field7647.field3362 | 0xFF000000;
                        } else if ((field7665 + var7 & 0x4) == (field7662 + var64 & 0x4)) {
                            var68 = field7679[field7642.field5771 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1926(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field7663;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field7663;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field7665 + var8;
                if (var41 >= 0 && var41 < field7676) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7660 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7660 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field7678 + var42;
                            if (var46 >= 0 && var46 < field7667) {
                                int var47 = field7671[field7676 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method3145(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class590 var48 = (class590) field7677.method2506(121, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method3145(arg0, var38, var43, var40, var45, var48.field8094, var48.field8093);
                                    }
                                } else {
                                    field7653[0] = (short) (var47 - 1);
                                    field7652[0] = field7673[field7676 * var46 + var41];
                                    method3145(arg0, var38, var43, var40, var45, field7653, field7652);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field7665 >> 6;
        int var10 = field7678 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7666 >> 6;
        int var12 = field7662 >> 6;
        if (var11 >= field7681[0].length) {
            var11 = field7681[0].length - 1;
        }
        if (var12 >= field7681[0][0].length) {
            var12 = field7681[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class361 var28 = field7681[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7661 >> 6) + var14) * 64;
                        int var30 = ((field7675 >> 6) + var27) * 64;
                        for (class408 var31 = (class408) var28.method2224((byte) -112); var31 != null; var31 = (class408) var28.method2222((byte) -78)) {
                            int var32 = var31.field5740 + var29 - field7661 - field7665;
                            int var33 = var31.field5741 + var30 - field7675 - field7678;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field7663;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field7663;
                            int var36 = field7660 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7660 - (arg2 * var33 + arg4 >> 16);
                            method3163(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5744, var31.field5742 & 0xFF, var31.field5743, var31.field5746, var31.field5745, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class361 var17 = field7681[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7661 >> 6) + var15) * 64;
                        int var19 = ((field7675 >> 6) + var16) * 64;
                        for (class408 var20 = (class408) var17.method2224((byte) -112); var20 != null; var20 = (class408) var17.method2222((byte) -35)) {
                            int var21 = var20.field5740 + var18 - field7661 - field7665;
                            int var22 = var20.field5741 + var19 - field7675 - field7678;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field7663;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field7663;
                            int var25 = field7660 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7660 - (arg2 * var22 + arg4 >> 16);
                            method3145(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5746, var20.field5745);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "()V")
    private static final void method3156() {
        for (int var0 = 0; var0 < field7676; var0++) {
            for (int var11 = 0; var11 < field7667; var11++) {
                int var12 = field7671[field7676 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class590 var13 = (class590) field7677.method2506(30, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field8094.length; var14++) {
                                class252 var15 = field7643.method1746(var13.field8094[var14] & 0xFFFF, (byte) 86);
                                int var16 = var15.field3411;
                                if (var15.field3391 != null) {
                                    class252 var17 = var15.method1568(-1, field7645);
                                    if (var17 != null) {
                                        var16 = var17.field3411;
                                    }
                                }
                                if (var16 != -1) {
                                    class588 var18 = new class588(var16);
                                    var18.field8075 = var0;
                                    var18.field8074 = var11;
                                    field7658.method378(var18, 31316);
                                }
                            }
                        }
                    } else {
                        class252 var19 = field7643.method1746(var12 - 1, (byte) 99);
                        int var20 = var19.field3411;
                        if (var19.field3391 != null) {
                            class252 var21 = var19.method1568(-1, field7645);
                            if (var21 != null) {
                                var20 = var21.field3411;
                            }
                        }
                        if (var20 != -1) {
                            class588 var22 = new class588(var20);
                            var22.field8075 = var0;
                            var22.field8074 = var11;
                            field7658.method378(var22, 31316);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7681[0].length; var2++) {
                for (int var3 = 0; var3 < field7681[0][0].length; var3++) {
                    class361 var4 = field7681[var1][var2][var3];
                    if (var4 != null) {
                        for (class408 var5 = (class408) var4.method2224((byte) -112); var5 != null; var5 = (class408) var4.method2222((byte) -95)) {
                            if (var5.field5746 != null) {
                                for (int var6 = 0; var6 < var5.field5746.length; var6++) {
                                    class252 var7 = field7643.method1746(var5.field5746[var6] & 0xFFFF, (byte) 87);
                                    int var8 = var7.field3411;
                                    if (var7.field3391 != null) {
                                        class252 var9 = var7.method1568(-1, field7645);
                                        if (var9 != null) {
                                            var8 = var9.field3411;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class588 var10 = new class588(var8);
                                        var10.field8075 = ((field7661 >> 6) + var2) * 64 + var5.field5740 - field7661;
                                        var10.field8074 = ((field7675 >> 6) + var3) * 64 + var5.field5741 - field7675;
                                        field7658.method378(var10, 31316);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Le;III)I")
    private static final int method3157(class479 arg0, int arg1, int arg2, int arg3) {
        class283 var4 = field7642.method2412(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3824;
        if (var5 >= 0 && arg0.method1728(-108, var5).field7857) {
            var5 = -1;
        }
        int var9;
        if (var4.field3816 >= 0) {
            int var6 = var4.field3816;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class554.field7586[class306.method1836(127, class549.method3085(-1, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class554.field7586[class306.method1836(127, class549.method3085(-1, 96, arg0.method1728(-128, var5).field7858)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3820 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3820;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class554.field7586[class306.method1836(127, class549.method3085(-1, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "()V")
    public static void method3158() {
        field7642 = null;
        field7641 = null;
        field7643 = null;
        field7649 = null;
        field7646 = null;
        field7645 = null;
        field7647 = null;
        field7648 = null;
        field7644 = null;
        field7657 = null;
        field7653 = null;
        field7652 = null;
        field7656 = null;
        field7658 = null;
        field7679 = null;
        field7672 = null;
        field7668 = null;
        field7674 = null;
        field7669 = null;
        field7680 = null;
        field7671 = null;
        field7673 = null;
        field7677 = null;
        field7681 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "()V")
    public static final void method3159() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field7656.field8319; var1++) {
            boolean var2 = field7647.method1559(field7656.field8318[var1] >> 14 & 0x3FFF, 0, field7656.field8318[var1] >> 28 & 0x3, field7656.field8318[var1] & 0x3FFF, var0);
            if (var2) {
                class588 var3 = new class588(field7656.field8320[var1]);
                var3.field8075 = var0[1] - field7661;
                var3.field8074 = var0[2] - field7675;
                field7658.method378(var3, 31316);
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;Ldga;IIII[I[I)V")
    private static final void method3160(class689 arg0, class138 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method957((byte) -75);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method957((byte) -77);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7672[field7676 * arg5 + arg4] = (byte) var11;
                    field7669[field7676 * arg5 + arg4] = 0;
                } else {
                    field7669[field7676 * arg5 + arg4] = (byte) var11;
                    field7680[field7676 * arg5 + arg4] = 0;
                    field7672[field7676 * arg5 + arg4] = arg1.method950(false);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method957((byte) -76);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method957((byte) -92);
                var18 = arg1.method957((byte) -96);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method957((byte) -94);
            }
            if (var15 == 0) {
                field7672[field7676 * arg5 + arg4] = (byte) var16;
                field7669[field7676 * arg5 + arg4] = (byte) var17;
                field7680[field7676 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7671[field7676 * arg5 + arg4] = (short) (arg1.method922((byte) -116) + 1);
                    field7673[field7676 * arg5 + arg4] = arg1.method950(false);
                } else if (var19 > 1) {
                    field7671[field7676 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method922((byte) -116);
                        var21[var22] = arg1.method950(false);
                    }
                    field7677.method2504((long) (arg4 << 16 | arg5), -10, new class590(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method922((byte) -119);
                        var24[var25] = arg1.method950(false);
                    }
                }
                if (field7681[var15 - 1][arg2 - (field7661 >> 6)][arg3 - (field7675 >> 6)] == null) {
                    field7681[var15 - 1][arg2 - (field7661 >> 6)][arg3 - (field7675 >> 6)] = new class361();
                }
                class408 var26 = new class408(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7681[var15 - 1][arg2 - (field7661 >> 6)][arg3 - (field7675 >> 6)].method2216(4, var26);
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Lhe;")
    public static final class250 method3161(int arg0) {
        return (class250) field7644.method2506(55, (long) arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Loa;)V")
    public static final void method3162(class689 arg0) {
        int var1 = field7666 - field7665;
        int var2 = field7662 - field7678;
        int var3 = (field7664 - field7663 << 16) / var1;
        int var4 = (field7660 - field7670 << 16) / var2;
        method3155(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loa;IIIIIII[S[BZ)V")
    private static final void method3163(class689 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1926(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7679[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1926(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class319.method2066(field7679[arg6], var11, arg5, arg4, field7659, var12, (byte) -50, arg2, arg0, arg3, arg7 >> 6 & 0x3, arg1, field7657);
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
                class252 var18 = field7643.method1746(arg8[var16] & 0xFFFF, (byte) 98);
                if (var18.field3398 == -1) {
                    int var19 = -3355444;
                    if (var18.field3453 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1876(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1879(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1876(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1879(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1876(arg1, arg2, arg4, -1, 0);
                            arg0.method1879(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1876(var14, arg2, arg4, -1, 0);
                            arg0.method1879(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1876(var14, arg2, arg4, -1, 0);
                            arg0.method1879(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1876(arg1, arg2, arg4, -1, 0);
                            arg0.method1879(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1879(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1879(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1879(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1879(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1879(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1879(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Loa;IIII)Lrh;")
    private static final class59 method3164(class689 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class588 var5 = (class588) field7658.method374((byte) 112); var5 != null; var5 = (class588) field7658.method372(-20740)) {
            method3153(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field7658;
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "()V")
    public static final void method3165() {
        field7672 = new byte[field7676 * field7667];
        field7669 = new byte[field7676 * field7667];
        field7680 = new byte[field7676 * field7667];
        field7671 = new short[field7676 * field7667];
        field7673 = new byte[field7676 * field7667];
        field7677 = new class436(1024);
        field7681 = new class361[3][field7676 >> 6][field7667 >> 6];
        field7679 = new int[field7642.field5770 + 1];
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Le;II)V")
    public static final void method3166(class479 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field7642.field5770; var3++) {
            field7679[var3 + 1] = method3157(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
    public static final void method3167(int arg0) {
        field7647 = (class250) field7644.method2506(95, (long) arg0);
    }
}
