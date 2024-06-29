import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class189 {

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lfa;")
    private static class371 field2882 = new class371(16);

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2889 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[B")
    private static byte[] field2893 = new byte[1];

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[S")
    private static short[] field2888 = new short[1];

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2886 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lat;")
    public static class412 field2885 = new class412();

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "F")
    public static float field2890;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "F")
    public static float field2894;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lfo;")
    public static class12 field2880;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lwn;")
    public static class164 field2877;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lmo;")
    private static class251 field2883;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lpo;")
    public static class365 field2878;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lfa;")
    private static class371 field2896;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lg;")
    public static class393 field2876;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lsm;")
    private static class442 field2879;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lui;")
    public static class451 field2881;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lmf;")
    public static class46 field2884;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lgn;")
    public static class486 field2887;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "[B")
    private static byte[] field2895;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "[B")
    private static byte[] field2897;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[B")
    private static byte[] field2906;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[B")
    private static byte[] field2907;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "[B")
    private static byte[] field2913;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "[I")
    private static int[] field2903;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "[S")
    private static short[] field2901;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "[S")
    private static short[] field2905;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[[[B")
    public static byte[][][] field2891;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "[[[Lsc;")
    private static class250[][][] field2916;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lui;Lmo;Lsm;Lmf;Lwn;Lpo;Lg;)V", line = 5)
    public static final void method1302(class451 arg0, class251 arg1, class442 arg2, class46 arg3, class164 arg4, class365 arg5, class393 arg6) {
        field2881 = arg0;
        field2883 = arg1;
        field2879 = arg2;
        field2884 = arg3;
        field2877 = arg4;
        field2878 = arg5;
        field2876 = arg6;
        field2882.method2299((byte) -12);
        int var7 = field2881.method2676("details", (byte) -60);
        int[] var8 = field2881.method2689(var7, 124);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class12 var10 = class164.method1115(var8[var9], field2881, var7, true);
            field2882.method2307((long) var10.field166, var10, (byte) 122);
        }
        class200.method1359(true, 127, false);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V", line = 33)
    public static final void method1303() {
        field2906 = new byte[field2914 * field2899];
        field2907 = new byte[field2914 * field2899];
        field2913 = new byte[field2914 * field2899];
        field2901 = new short[field2914 * field2899];
        field2897 = new byte[field2914 * field2899];
        field2896 = new class371(1024);
        field2916 = new class250[3][field2899 >> 6][field2914 >> 6];
        field2903 = new int[field2883.field3617 + 1];
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Lfo;", line = 43)
    public static final class12 method1304(int arg0) {
        return (class12) field2882.method2305((long) arg0, (byte) 114);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lfo;", line = 49)
    public static final class12 method1305(int arg0, int arg1) {
        for (class12 var2 = (class12) field2882.method2296((byte) 39); var2 != null; var2 = (class12) field2882.method2297(true)) {
            if (var2.field165 && var2.method120(arg0, -24637, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;Lre;IIII[I[I)V", line = 63)
    private static final void method1306(class63 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2628(49152);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2628(49152);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2906[field2899 * arg5 + arg4] = (byte) var11;
                    field2907[field2899 * arg5 + arg4] = 0;
                } else {
                    field2907[field2899 * arg5 + arg4] = (byte) var11;
                    field2913[field2899 * arg5 + arg4] = 0;
                    field2906[field2899 * arg5 + arg4] = arg1.method2642(true);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2628(49152);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2628(49152);
                var18 = arg1.method2628(49152);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2628(49152);
            }
            if (var15 == 0) {
                field2906[field2899 * arg5 + arg4] = (byte) var16;
                field2907[field2899 * arg5 + arg4] = (byte) var17;
                field2913[field2899 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2901[field2899 * arg5 + arg4] = (short) (arg1.method2631(2530) + 1);
                    field2897[field2899 * arg5 + arg4] = arg1.method2642(true);
                } else if (var19 > 1) {
                    field2901[field2899 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2631(2530);
                        var21[var22] = arg1.method2642(true);
                    }
                    field2896.method2307((long) (arg4 << 16 | arg5), new class470(var20, var21), (byte) -109);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2631(2530);
                        var24[var25] = arg1.method2642(true);
                    }
                }
                if (field2916[var15 - 1][arg2 - (field2912 >> 6)][arg3 - (field2902 >> 6)] == null) {
                    field2916[var15 - 1][arg2 - (field2912 >> 6)][arg3 - (field2902 >> 6)] = new class250();
                }
                class213 var26 = new class213(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2916[var15 - 1][arg2 - (field2912 >> 6)][arg3 - (field2902 >> 6)].method1597(var26, (byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V", line = 199)
    private static final void method1307() {
        for (int var0 = 0; var0 < field2899; var0++) {
            for (int var11 = 0; var11 < field2914; var11++) {
                int var12 = field2901[field2899 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class470 var13 = (class470) field2896.method2305((long) (var0 << 16 | var11), (byte) 57);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field6610.length; var14++) {
                                class271 var15 = field2884.method338((byte) 112, var13.field6610[var14] & 0xFFFF);
                                int var16 = var15.field4038;
                                if (var15.field4015 != null) {
                                    class271 var17 = var15.method1759(field2876, true);
                                    if (var17 != null) {
                                        var16 = var17.field4038;
                                    }
                                }
                                if (var16 != -1) {
                                    class290 var18 = new class290(var16);
                                    var18.field4404 = var0;
                                    var18.field4408 = var11;
                                    field2885.method2453((byte) -111, var18);
                                }
                            }
                        }
                    } else {
                        class271 var19 = field2884.method338((byte) 122, var12 - 1);
                        int var20 = var19.field4038;
                        if (var19.field4015 != null) {
                            class271 var21 = var19.method1759(field2876, true);
                            if (var21 != null) {
                                var20 = var21.field4038;
                            }
                        }
                        if (var20 != -1) {
                            class290 var22 = new class290(var20);
                            var22.field4404 = var0;
                            var22.field4408 = var11;
                            field2885.method2453((byte) -112, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2916[0].length; var2++) {
                for (int var3 = 0; var3 < field2916[0][0].length; var3++) {
                    class250 var4 = field2916[var1][var2][var3];
                    if (var4 != null) {
                        for (class213 var5 = (class213) var4.method1594(16); var5 != null; var5 = (class213) var4.method1596(true)) {
                            if (var5.field3206 != null) {
                                for (int var6 = 0; var6 < var5.field3206.length; var6++) {
                                    class271 var7 = field2884.method338((byte) 121, var5.field3206[var6] & 0xFFFF);
                                    int var8 = var7.field4038;
                                    if (var7.field4015 != null) {
                                        class271 var9 = var7.method1759(field2876, true);
                                        if (var9 != null) {
                                            var8 = var9.field4038;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class290 var10 = new class290(var8);
                                        var10.field4404 = ((field2912 >> 6) + var2) * 64 + var5.field3207 - field2912;
                                        var10.field4408 = ((field2902 >> 6) + var3) * 64 + var5.field3209 - field2902;
                                        field2885.method2453((byte) -119, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V", line = 357)
    public static final void method1308() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2887.field6831; var1++) {
            boolean var2 = field2880.method124(-100, field2887.field6827[var1] >> 14 & 0x3FFF, var0, field2887.field6827[var1] & 0x3FFF, field2887.field6827[var1] >> 28 & 0x3);
            if (var2) {
                class290 var3 = new class290(field2887.field6830[var1]);
                var3.field4404 = var0[1] - field2912;
                var3.field4408 = var0[2] - field2902;
                field2885.method2453((byte) -84, var3);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lcp;II)V", line = 381)
    public static final void method1309(class481 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field2883.field3617; var3++) {
            field2903[var3 + 1] = method1311(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;IIII)V", line = 393)
    private static final void method1310(class63 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2908 - field2898;
        int var6 = field2911 - field2900;
        if (field2908 < field2899) {
            var5++;
        }
        if (field2911 < field2914) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2910;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2910;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2898 + var7;
                if (var52 >= 0 && var52 < field2899) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2904 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2904 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2900 + var53;
                            int var58 = field2899 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2914) {
                                var59 = (field2895[var58] & 0xFF) << 16 | field2905[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2907[var58] & 0xFF;
                                var61 = field2901[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2880.field162 != -1) {
                                    var62 = field2880.field162 | 0xFF000000;
                                } else if ((field2911 + var53 & 0x4) == (field2898 + var7 & 0x4)) {
                                    var62 = field2903[field2883.field3619 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method508(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1317(arg0, var49, var54, var51, var56, var59, var60, field2913[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class470 var63 = (class470) field2896.method2305((long) (var52 << 16 | var57), (byte) 117);
                                if (var63 != null) {
                                    method1317(arg0, var49, var54, var51, var56, var59, var60, field2913[var58], var63.field6610, var63.field6611, true);
                                }
                            } else {
                                field2888[0] = (short) (var61 - 1);
                                field2893[0] = field2897[var58];
                                method1317(arg0, var49, var54, var51, var56, var59, var60, field2913[var58], field2888, field2893, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2904 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2904 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2880.field162 != -1) {
                            var68 = field2880.field162 | 0xFF000000;
                        } else if ((field2911 + var64 & 0x4) == (field2898 + var7 & 0x4)) {
                            var68 = field2903[field2883.field3619 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method508(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2910;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2910;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2898 + var8;
                if (var41 >= 0 && var41 < field2899) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2904 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2904 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2900 + var42;
                            if (var46 >= 0 && var46 < field2914) {
                                int var47 = field2901[field2899 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1315(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class470 var48 = (class470) field2896.method2305((long) (var41 << 16 | var46), (byte) 59);
                                    if (var48 != null) {
                                        method1315(arg0, var38, var43, var40, var45, var48.field6610, var48.field6611);
                                    }
                                } else {
                                    field2888[0] = (short) (var47 - 1);
                                    field2893[0] = field2897[field2899 * var46 + var41];
                                    method1315(arg0, var38, var43, var40, var45, field2888, field2893);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2898 >> 6;
        int var10 = field2900 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2908 >> 6;
        int var12 = field2911 >> 6;
        if (var11 >= field2916[0].length) {
            var11 = field2916[0].length - 1;
        }
        if (var12 >= field2916[0][0].length) {
            var12 = field2916[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class250 var28 = field2916[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2912 >> 6) + var14) * 64;
                        int var30 = ((field2902 >> 6) + var27) * 64;
                        for (class213 var31 = (class213) var28.method1594(16); var31 != null; var31 = (class213) var28.method1596(true)) {
                            int var32 = var31.field3207 + var29 - field2912 - field2898;
                            int var33 = var31.field3209 + var30 - field2902 - field2900;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2910;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2910;
                            int var36 = field2904 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2904 - (arg2 * var33 + arg4 >> 16);
                            method1317(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3204, var31.field3208 & 0xFF, var31.field3203, var31.field3206, var31.field3205, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class250 var17 = field2916[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2912 >> 6) + var15) * 64;
                        int var19 = ((field2902 >> 6) + var16) * 64;
                        for (class213 var20 = (class213) var17.method1594(16); var20 != null; var20 = (class213) var17.method1596(true)) {
                            int var21 = var20.field3207 + var18 - field2912 - field2898;
                            int var22 = var20.field3209 + var19 - field2902 - field2900;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2910;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2910;
                            int var25 = field2904 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2904 - (arg2 * var22 + arg4 >> 16);
                            method1315(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3206, var20.field3205);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lcp;III)I", line = 736)
    private static final int method1311(class481 arg0, int arg1, int arg2, int arg3) {
        class172 var4 = field2883.method1599((byte) 110, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2440;
        if (var5 >= 0 && arg0.method1331(9386, var5).field1198) {
            var5 = -1;
        }
        int var9;
        if (var4.field2448 >= 0) {
            int var6 = var4.field2448;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class81.field1140[class316.method1949(class441.method2564((byte) 117, var8, 96), (byte) -56) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class81.field1140[class316.method1949(class441.method2564((byte) 117, arg0.method1331(9386, var5).field1213, 96), (byte) -93) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2454 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2454;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class81.field1140[class316.method1949(class441.method2564((byte) 117, var12, 96), (byte) 36) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V", line = 795)
    public static void method1312() {
        field2883 = null;
        field2879 = null;
        field2884 = null;
        field2877 = null;
        field2878 = null;
        field2876 = null;
        field2880 = null;
        field2881 = null;
        field2882 = null;
        field2891 = null;
        field2888 = null;
        field2893 = null;
        field2887 = null;
        field2885 = null;
        field2903 = null;
        field2906 = null;
        field2895 = null;
        field2905 = null;
        field2907 = null;
        field2913 = null;
        field2901 = null;
        field2897 = null;
        field2896 = null;
        field2916 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;II)V", line = 822)
    public static final void method1313(class63 arg0, int arg1, int arg2) {
        class446 var3 = new class446(field2881.method2687("area", -31157, field2880.field179));
        int var4 = var3.method2628(49152);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2628(49152);
        }
        int var7 = var3.method2628(49152);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2628(49152);
        }
        while (true) {
            while (var3.field6315 < var3.field6316.length) {
                if (var3.method2628(49152) == 0) {
                    int var22 = var3.method2628(49152);
                    int var23 = var3.method2628(49152);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2912;
                            int var27 = var23 * 64 + var25 - field2902;
                            method1306(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2628(49152);
                    int var29 = var3.method2628(49152);
                    int var30 = var3.method2628(49152);
                    int var31 = var3.method2628(49152);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2912;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2902;
                            method1306(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2895 = new byte[field2914 * field2899];
            field2905 = new short[field2914 * field2899];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2914 * field2899];
                for (int var13 = 0; var13 < field2916[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2916[var11][0].length; var19++) {
                        class250 var20 = field2916[var11][var13][var19];
                        if (var20 != null) {
                            for (class213 var21 = (class213) var20.method1594(16); var21 != null; var21 = (class213) var20.method1596(true)) {
                                var12[(var19 * 64 + var21.field3209) * field2899 + var13 * 64 + var21.field3207] = (byte) var21.field3204;
                            }
                        }
                    }
                }
                method1318(var12, field2895, field2905, arg1, arg2);
                for (int var14 = 0; var14 < field2916[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2916[var11][0].length; var15++) {
                        class250 var16 = field2916[var11][var14][var15];
                        if (var16 != null) {
                            for (class213 var17 = (class213) var16.method1594(16); var17 != null; var17 = (class213) var16.method1596(true)) {
                                int var18 = (var15 * 64 + var17.field3209) * field2899 + var14 * 64 + var17.field3207;
                                var17.field3204 = (field2895[var18] & 0xFF) << 16 | field2905[var18] & 0xFFFF;
                                if (var17.field3204 != 0) {
                                    var17.field3204 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1318(field2906, field2895, field2905, arg1, arg2);
            field2906 = null;
            method1307();
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V", line = 1000)
    public static final void method1314() {
        field2906 = null;
        field2895 = null;
        field2905 = null;
        field2907 = null;
        field2913 = null;
        field2901 = null;
        field2897 = null;
        field2896 = null;
        field2916 = null;
        field2903 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;IIII[S[B)V", line = 1013)
    private static final void method1315(class63 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class271 var8 = field2884.method338((byte) 120, arg5[var7] & 0xFFFF);
            int var9 = var8.field4064;
            if (var9 != -1) {
                class150 var10 = field2878.method2243((byte) 104, var9);
                class319 var11 = var10.method1018(0, arg0, var8.field4083 ? var8.field4028 : false, var8.field4059 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method791() >> 2;
                    int var13 = arg4 * var11.method789() >> 2;
                    if (var10.field2104) {
                        int var14 = var8.field4014;
                        int var15 = var8.field4048;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field2107 == 0) {
                            var11.method1962(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method792(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field2107 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;)V", line = 1072)
    public static final void method1316(class63 arg0) {
        int var1 = field2908 - field2898;
        int var2 = field2911 - field2900;
        int var3 = (field2915 - field2910 << 16) / var1;
        int var4 = (field2904 - field2909 << 16) / var2;
        method1310(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;IIIIIII[S[BZ)V", line = 1082)
    private static final void method1317(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method508(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2903[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method508(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class287.method1833(var12, field2891, arg2, arg0, field2892, 3, arg1, arg4, arg7 >> 6 & 0x3, field2903[arg6], arg5, var11, arg3);
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
                class271 var18 = field2884.method338((byte) 108, arg8[var16] & 0xFFFF);
                if (var18.field4064 == -1) {
                    int var19 = -3355444;
                    if (var18.field4053 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method579(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method550(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method579(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method550(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method579(arg1, arg2, arg4, -1, 0);
                            arg0.method550(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method579(var14, arg2, arg4, -1, 0);
                            arg0.method550(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method579(var14, arg2, arg4, -1, 0);
                            arg0.method550(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method579(arg1, arg2, arg4, -1, 0);
                            arg0.method550(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method550(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method550(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method550(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method550(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method550(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method550(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([B[B[SII)V", line = 1244)
    private static final void method1318(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2914];
        int[] var6 = new int[field2914];
        int[] var7 = new int[field2914];
        int[] var8 = new int[field2914];
        int[] var9 = new int[field2914];
        for (int var10 = -5; var10 < field2899; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2914; var13++) {
                int var10002;
                if (var11 < field2899) {
                    int var28 = arg0[field2899 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class489 var29 = field2879.method2566(var28 - 1, (byte) -70);
                        var5[var13] += var29.field6861;
                        var6[var13] += var29.field6865;
                        var7[var13] += var29.field6851;
                        var8[var13] += var29.field6855;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2899 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class489 var31 = field2879.method2566(var30 - 1, (byte) -109);
                        var5[var13] -= var31.field6861;
                        var6[var13] -= var31.field6865;
                        var7[var13] -= var31.field6851;
                        var8[var13] -= var31.field6855;
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
                for (int var19 = -5; var19 < field2914; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2914) {
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
                        if ((arg0[field2899 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2899 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class233.method1525(1391593162, var15 / var18, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2899 * var19 + var10;
                            int var27 = class81.field1140[class316.method1949(class324.method1999(96, 0, var25), (byte) 121) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)V", line = 1387)
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2898 = arg0 - field2912;
        field2911 = arg1 - field2902;
        field2908 = arg2 - field2912;
        field2900 = arg3 - field2902;
        field2910 = arg4;
        field2909 = arg5;
        field2915 = arg6;
        field2904 = arg7;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Ltq;)Lat;", line = 1398)
    public static final class412 method1320(class63 arg0) {
        int var1 = field2908 - field2898;
        int var2 = field2911 - field2900;
        int var3 = (field2915 - field2910 << 16) / var1;
        int var4 = (field2904 - field2909 << 16) / var2;
        return method1323(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 1408)
    public static final void method1321(int arg0) {
        field2880 = (class12) field2882.method2305((long) arg0, (byte) 13);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ltq;Llk;IIII)V", line = 1412)
    private static final void method1322(class63 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field4402 = ((arg1.field4404 - field2898) * arg2 + arg4 >> 16) + field2910;
        arg1.field4400 = field2904 - ((arg1.field4408 - field2900) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Ltq;IIII)Lat;", line = 1418)
    private static final class412 method1323(class63 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class290 var5 = (class290) field2885.method2456(32101); var5 != null; var5 = (class290) field2885.method2461(301)) {
            method1322(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2885;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Loa;", line = 1448)
    public static final class157 method1324(int arg0, int arg1) {
        class157 var2 = new class157();
        for (class12 var3 = (class12) field2882.method2296((byte) 39); var3 != null; var3 = (class12) field2882.method2297(true)) {
            if (var3.field165 && var3.method120(arg0, -24637, arg1)) {
                var2.method1075((byte) -85, var3);
            }
        }
        return var2;
    }
}
