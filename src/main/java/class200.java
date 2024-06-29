import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class200 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lbo;")
    private static class453 field2757 = new class453(16);

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[B")
    private static byte[] field2761 = new byte[1];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2764 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[S")
    private static short[] field2767 = new short[1];

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field2768 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lm;")
    public static class242 field2763 = new class242();

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "F")
    public static float field2765;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "F")
    public static float field2769;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lir;")
    public static class185 field2759;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lnr;")
    public static class269 field2766;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lka;")
    public static class379 field2758;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lbo;")
    private static class453 field2771;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "[B")
    private static byte[] field2774;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "[B")
    private static byte[] field2775;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[B")
    private static byte[] field2777;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[B")
    private static byte[] field2778;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "[B")
    private static byte[] field2781;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[I")
    private static int[] field2776;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[S")
    private static short[] field2773;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[S")
    private static short[] field2783;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "[[[B")
    public static byte[][][] field2760;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "[[[Lfi;")
    private static class8[][][] field2788;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V", line = 3)
    public static void method1319() {
        field2758 = null;
        field2759 = null;
        field2757 = null;
        field2760 = null;
        field2767 = null;
        field2761 = null;
        field2766 = null;
        field2763 = null;
        field2776 = null;
        field2778 = null;
        field2774 = null;
        field2773 = null;
        field2781 = null;
        field2775 = null;
        field2783 = null;
        field2777 = null;
        field2771 = null;
        field2788 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()V", line = 28)
    public static final void method1320() {
        field2778 = null;
        field2774 = null;
        field2773 = null;
        field2781 = null;
        field2775 = null;
        field2783 = null;
        field2777 = null;
        field2771 = null;
        field2788 = null;
        field2776 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 40)
    public static final void method1321(int arg0) {
        field2758 = (class379) field2757.method2826(false, (long) arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;Lfb;IIII[I[I)V", line = 45)
    private static final void method1322(class298 arg0, class341 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2233((byte) 104);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2233((byte) 104);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2778[field2779 * arg5 + arg4] = (byte) var11;
                    field2781[field2779 * arg5 + arg4] = 0;
                } else {
                    field2781[field2779 * arg5 + arg4] = (byte) var11;
                    field2775[field2779 * arg5 + arg4] = 0;
                    field2778[field2779 * arg5 + arg4] = arg1.method2211(255);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2233((byte) 104);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2233((byte) 104);
                var18 = arg1.method2233((byte) 104);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2233((byte) 104);
            }
            if (var15 == 0) {
                field2778[field2779 * arg5 + arg4] = (byte) var16;
                field2781[field2779 * arg5 + arg4] = (byte) var17;
                field2775[field2779 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2783[field2779 * arg5 + arg4] = (short) (arg1.method2239(-1076227960) + 1);
                    field2777[field2779 * arg5 + arg4] = arg1.method2211(255);
                } else if (var19 > 1) {
                    field2783[field2779 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2239(-1076227960);
                        var21[var22] = arg1.method2211(255);
                    }
                    field2771.method2815(-1, (long) (arg4 << 16 | arg5), new class306(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2239(-1076227960);
                        var24[var25] = arg1.method2211(255);
                    }
                }
                if (field2788[var15 - 1][arg2 - (field2782 >> 6)][arg3 - (field2789 >> 6)] == null) {
                    field2788[var15 - 1][arg2 - (field2782 >> 6)][arg3 - (field2789 >> 6)] = new class8();
                }
                class156 var26 = new class156(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2788[var15 - 1][arg2 - (field2782 >> 6)][arg3 - (field2789 >> 6)].method50(var26, (byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;Lbd;IIII)V", line = 179)
    private static final void method1323(class298 arg0, class27 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field459 = ((arg1.field464 - field2772) * arg2 + arg4 >> 16) + field2784;
        arg1.field470 = field2787 - ((arg1.field467 - field2785) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lka;", line = 185)
    public static final class379 method1324(int arg0, int arg1) {
        for (class379 var2 = (class379) field2757.method2812(15710); var2 != null; var2 = (class379) field2757.method2819((byte) 83)) {
            if (var2.field5539 && var2.method2472(arg0, arg1, -79)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([B[B[SII)V", line = 198)
    private static final void method1325(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2770];
        int[] var6 = new int[field2770];
        int[] var7 = new int[field2770];
        int[] var8 = new int[field2770];
        int[] var9 = new int[field2770];
        for (int var10 = -5; var10 < field2779; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2770; var13++) {
                int var10002;
                if (var11 < field2779) {
                    int var28 = arg0[field2779 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class149 var29 = class15.method115(var28 - 1, (byte) -98);
                        var5[var13] += var29.field1899;
                        var6[var13] += var29.field1901;
                        var7[var13] += var29.field1900;
                        var8[var13] += var29.field1888;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2779 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class149 var31 = class15.method115(var30 - 1, (byte) -98);
                        var5[var13] -= var31.field1899;
                        var6[var13] -= var31.field1901;
                        var7[var13] -= var31.field1900;
                        var8[var13] -= var31.field1888;
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
                for (int var19 = -5; var19 < field2770; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2770) {
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
                        if ((arg0[field2779 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2779 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class399.method2565(31826, var14 * 256 / var17, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2779 * var19 + var10;
                            int var27 = class72.field1019[class357.method2347((byte) 87, class90.method716(98, 96, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;IIII[S[B)V", line = 341)
    private static final void method1326(class298 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class212 var8 = class372.method2447(arg5[var7] & 0xFFFF, (byte) -97);
            int var9 = var8.field2978;
            if (var9 != -1) {
                class237 var10 = class90.method717((byte) -60, var9);
                class315 var11 = var10.method1543(arg0, var8.field2957 ? arg6[var7] >> 6 & 0x3 : 0, 3, var8.field2908 ? var8.field2929 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method199() >> 2;
                    int var13 = arg4 * var11.method207() >> 2;
                    if (var10.field3308) {
                        int var14 = var8.field2946;
                        int var15 = var8.field2970;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field3314 == 0) {
                            var11.method2065(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method200(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field3314 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;IIII)V", line = 400)
    private static final void method1327(class298 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2780 - field2772;
        int var6 = field2786 - field2785;
        if (field2780 < field2779) {
            var5++;
        }
        if (field2786 < field2770) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2784;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2784;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2772 + var7;
                if (var52 >= 0 && var52 < field2779) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2787 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2787 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2785 + var53;
                            int var58 = field2779 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2770) {
                                var59 = (field2774[var58] & 0xFF) << 16 | field2773[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2781[var58] & 0xFF;
                                var61 = field2783[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2758.field5536 != -1) {
                                    var62 = field2758.field5536 | 0xFF000000;
                                } else if ((field2786 + var53 & 0x4) == (field2772 + var7 & 0x4)) {
                                    var62 = field2776[class298.field4506 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method435(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1333(arg0, var49, var54, var51, var56, var59, var60, field2775[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class306 var63 = (class306) field2771.method2826(false, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1333(arg0, var49, var54, var51, var56, var59, var60, field2775[var58], var63.field4570, var63.field4569, true);
                                }
                            } else {
                                field2767[0] = (short) (var61 - 1);
                                field2761[0] = field2777[var58];
                                method1333(arg0, var49, var54, var51, var56, var59, var60, field2775[var58], field2767, field2761, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2787 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2787 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2758.field5536 != -1) {
                            var68 = field2758.field5536 | 0xFF000000;
                        } else if ((field2786 + var64 & 0x4) == (field2772 + var7 & 0x4)) {
                            var68 = field2776[class298.field4506 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method435(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2784;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2784;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2772 + var8;
                if (var41 >= 0 && var41 < field2779) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2787 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2787 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2785 + var42;
                            if (var46 >= 0 && var46 < field2770) {
                                int var47 = field2783[field2779 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1326(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class306 var48 = (class306) field2771.method2826(false, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method1326(arg0, var38, var43, var40, var45, var48.field4570, var48.field4569);
                                    }
                                } else {
                                    field2767[0] = (short) (var47 - 1);
                                    field2761[0] = field2777[field2779 * var46 + var41];
                                    method1326(arg0, var38, var43, var40, var45, field2767, field2761);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2772 >> 6;
        int var10 = field2785 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2780 >> 6;
        int var12 = field2786 >> 6;
        if (var11 >= field2788[0].length) {
            var11 = field2788[0].length - 1;
        }
        if (var12 >= field2788[0][0].length) {
            var12 = field2788[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class8 var28 = field2788[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2782 >> 6) + var14) * 64;
                        int var30 = ((field2789 >> 6) + var27) * 64;
                        for (class156 var31 = (class156) var28.method54((byte) 18); var31 != null; var31 = (class156) var28.method53((byte) 124)) {
                            int var32 = var31.field1974 + var29 - field2782 - field2772;
                            int var33 = var31.field1975 + var30 - field2789 - field2785;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2784;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2784;
                            int var36 = field2787 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2787 - (arg2 * var33 + arg4 >> 16);
                            method1333(arg0, var34, var36, var35 - var34, var37 - var36, var31.field1973, var31.field1979 & 0xFF, var31.field1977, var31.field1978, var31.field1976, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class8 var17 = field2788[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2782 >> 6) + var15) * 64;
                        int var19 = ((field2789 >> 6) + var16) * 64;
                        for (class156 var20 = (class156) var17.method54((byte) 18); var20 != null; var20 = (class156) var17.method53((byte) 121)) {
                            int var21 = var20.field1974 + var18 - field2782 - field2772;
                            int var22 = var20.field1975 + var19 - field2789 - field2785;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2784;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2784;
                            int var25 = field2787 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2787 - (arg2 * var22 + arg4 >> 16);
                            method1326(arg0, var23, var25, var24 - var23, var26 - var25, var20.field1978, var20.field1976);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;)V", line = 744)
    public static final void method1328(class298 arg0) {
        int var1 = field2780 - field2772;
        int var2 = field2786 - field2785;
        int var3 = (field2790 - field2784 << 16) / var1;
        int var4 = (field2787 - field2791 << 16) / var2;
        method1327(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lwh;II)V", line = 756)
    public static final void method1329(class288 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class74.field1038; var3++) {
            field2776[var3 + 1] = method1337(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lka;", line = 765)
    public static final class379 method1330(int arg0) {
        return (class379) field2757.method2826(false, (long) arg0);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V", line = 768)
    public static final void method1331() {
        field2778 = new byte[field2779 * field2770];
        field2781 = new byte[field2779 * field2770];
        field2775 = new byte[field2779 * field2770];
        field2783 = new short[field2779 * field2770];
        field2777 = new byte[field2779 * field2770];
        field2771 = new class453(1024);
        field2788 = new class8[3][field2779 >> 6][field2770 >> 6];
        field2776 = new int[class74.field1038 + 1];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lir;)V", line = 778)
    public static final void method1332(class185 arg0) {
        field2759 = arg0;
        field2757.method2825(43);
        int var1 = field2759.method1220("details", 0);
        int[] var2 = field2759.method1208(var1, (byte) 58);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class379 var4 = class108.method815(field2759, var1, var2[var3], (byte) -122);
            field2757.method2815(-1, (long) var4.field5547, var4);
        }
        class427.method2673(-80, false, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;IIIIIII[S[BZ)V", line = 798)
    private static final void method1333(class298 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method435(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2776[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method435(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class241.method1559(field2760, arg0, arg2, field2776[arg6], -2658, var11, arg5, arg1, field2762, arg7 >> 6 & 0x3, var12, arg3, arg4);
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
                class212 var18 = class372.method2447(arg8[var16] & 0xFFFF, (byte) 39);
                if (var18.field2978 == -1) {
                    int var19 = -3355444;
                    if (var18.field2932 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method440(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method510(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method440(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method510(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method440(arg1, arg2, arg4, -1, 0);
                            arg0.method510(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method440(var14, arg2, arg4, -1, 0);
                            arg0.method510(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method440(var14, arg2, arg4, -1, 0);
                            arg0.method510(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method440(arg1, arg2, arg4, -1, 0);
                            arg0.method510(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method510(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method510(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method510(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method510(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method510(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method510(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltj;II)V", line = 960)
    public static final void method1334(class298 arg0, int arg1, int arg2) {
        class341 var3 = new class341(field2759.method1206("area", 0, field2758.field5535));
        int var4 = var3.method2233((byte) 104);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2233((byte) 104);
        }
        int var7 = var3.method2233((byte) 104);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2233((byte) 104);
        }
        while (true) {
            while (var3.field5049 < var3.field5042.length) {
                if (var3.method2233((byte) 104) == 0) {
                    int var22 = var3.method2233((byte) 104);
                    int var23 = var3.method2233((byte) 104);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2782;
                            int var27 = var23 * 64 + var25 - field2789;
                            method1322(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2233((byte) 104);
                    int var29 = var3.method2233((byte) 104);
                    int var30 = var3.method2233((byte) 104);
                    int var31 = var3.method2233((byte) 104);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2782;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2789;
                            method1322(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2774 = new byte[field2779 * field2770];
            field2773 = new short[field2779 * field2770];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2779 * field2770];
                for (int var13 = 0; var13 < field2788[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2788[var11][0].length; var19++) {
                        class8 var20 = field2788[var11][var13][var19];
                        if (var20 != null) {
                            for (class156 var21 = (class156) var20.method54((byte) 18); var21 != null; var21 = (class156) var20.method53((byte) 121)) {
                                var12[(var19 * 64 + var21.field1975) * field2779 + var13 * 64 + var21.field1974] = (byte) var21.field1973;
                            }
                        }
                    }
                }
                method1325(var12, field2774, field2773, arg1, arg2);
                for (int var14 = 0; var14 < field2788[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2788[var11][0].length; var15++) {
                        class8 var16 = field2788[var11][var14][var15];
                        if (var16 != null) {
                            for (class156 var17 = (class156) var16.method54((byte) 18); var17 != null; var17 = (class156) var16.method53((byte) 124)) {
                                int var18 = (var15 * 64 + var17.field1975) * field2779 + var14 * 64 + var17.field1974;
                                var17.field1973 = (field2774[var18] & 0xFF) << 16 | field2773[var18] & 0xFFFF;
                                if (var17.field1973 != 0) {
                                    var17.field1973 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1325(field2778, field2774, field2773, arg1, arg2);
            field2778 = null;
            method1335();
            return;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V", line = 1140)
    private static final void method1335() {
        for (int var0 = 0; var0 < field2779; var0++) {
            for (int var9 = 0; var9 < field2770; var9++) {
                int var10 = field2783[field2779 * var9 + var0] & 0xFFFF;
                if (var10 != 0) {
                    if (var10 == 65535) {
                        class306 var11 = (class306) field2771.method2826(false, (long) (var0 << 16 | var9));
                        if (var11 != null) {
                            for (int var12 = 0; var12 < var11.field4570.length; var12++) {
                                class212 var13 = class372.method2447(var11.field4570[var12] & 0xFFFF, (byte) -87);
                                if (var13.field2940 != -1) {
                                    class27 var14 = new class27(var13.field2940);
                                    var14.field464 = var0;
                                    var14.field467 = var9;
                                    field2763.method1560(-111, var14);
                                }
                            }
                        }
                    } else {
                        class212 var15 = class372.method2447(var10 - 1, (byte) 67);
                        if (var15.field2940 != -1) {
                            class27 var16 = new class27(var15.field2940);
                            var16.field464 = var0;
                            var16.field467 = var9;
                            field2763.method1560(-122, var16);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2788[0].length; var2++) {
                for (int var3 = 0; var3 < field2788[0][0].length; var3++) {
                    class8 var4 = field2788[var1][var2][var3];
                    if (var4 != null) {
                        for (class156 var5 = (class156) var4.method54((byte) 18); var5 != null; var5 = (class156) var4.method53((byte) 121)) {
                            if (var5.field1978 != null) {
                                for (int var6 = 0; var6 < var5.field1978.length; var6++) {
                                    class212 var7 = class372.method2447(var5.field1978[var6] & 0xFFFF, (byte) 108);
                                    if (var7.field2940 != -1) {
                                        class27 var8 = new class27(var7.field2940);
                                        var8.field464 = ((field2782 >> 6) + var2) * 64 + var5.field1974 - field2782;
                                        var8.field467 = ((field2789 >> 6) + var3) * 64 + var5.field1975 - field2789;
                                        field2763.method1560(-114, var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Ltr;", line = 1267)
    public static final class173 method1336(int arg0, int arg1) {
        class173 var2 = new class173();
        for (class379 var3 = (class379) field2757.method2812(15710); var3 != null; var3 = (class379) field2757.method2819((byte) 108)) {
            if (var3.field5539 && var3.method2472(arg0, arg1, -106)) {
                var2.method1154(var3, 0);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lwh;III)I", line = 1285)
    private static final int method1337(class288 arg0, int arg1, int arg2, int arg3) {
        class21 var4 = class269.method1794(-18176, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field391;
        if (var5 >= 0 && arg0.method1962(var5, -11999).field26) {
            var5 = -1;
        }
        int var9;
        if (var4.field390 >= 0) {
            int var6 = var4.field390;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class72.field1019[class357.method2347((byte) 87, class425.method2669(var8, (byte) 124, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class72.field1019[class357.method2347((byte) 87, class425.method2669(arg0.method1962(var5, -11999).field37, (byte) 116, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field387 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field387;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class72.field1019[class357.method2347((byte) 87, class425.method2669(var12, (byte) 92, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Ltj;)Lm;", line = 1342)
    public static final class242 method1338(class298 arg0) {
        int var1 = field2780 - field2772;
        int var2 = field2786 - field2785;
        int var3 = (field2790 - field2784 << 16) / var1;
        int var4 = (field2787 - field2791 << 16) / var2;
        return method1339(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Ltj;IIII)Lm;", line = 1354)
    private static final class242 method1339(class298 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class27 var5 = (class27) field2763.method1575(0); var5 != null; var5 = (class27) field2763.method1573((byte) -128)) {
            method1323(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2763;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V", line = 1365)
    public static final void method1340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2772 = arg0 - field2782;
        field2786 = arg1 - field2789;
        field2780 = arg2 - field2782;
        field2785 = arg3 - field2789;
        field2784 = arg4;
        field2791 = arg5;
        field2790 = arg6;
        field2787 = arg7;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "()V", line = 1376)
    public static final void method1341() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2766.field3983; var1++) {
            boolean var2 = field2758.method2471(field2766.field3984[var1] >> 14 & 0x3FFF, field2766.field3984[var1] & 0x3FFF, var0, field2766.field3984[var1] >> 28 & 0x3, 0);
            if (var2) {
                class27 var3 = new class27(field2766.field3979[var1]);
                var3.field464 = var0[1] - field2782;
                var3.field467 = var0[2] - field2789;
                field2763.method1560(-124, var3);
            }
        }
    }
}
