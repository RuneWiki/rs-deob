import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class148 {

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "Loj;")
    private static class346 field2177 = new class346(16);

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "[S")
    private static short[] field2192 = new short[1];

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field2191 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "[B")
    private static byte[] field2186 = new byte[1];

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public static int field2189 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "Lsu;")
    public static class192 field2193 = new class192();

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "F")
    public static float field2194;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "F")
    public static float field2195;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!tba", name = "v", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!tba", name = "B", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!tba", name = "D", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!tba", name = "F", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!tba", name = "G", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!tba", name = "I", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!tba", name = "J", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!tba", name = "K", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!tba", name = "O", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "Lpj;")
    public static class132 field2181;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "Lada;")
    private static class149 field2182;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "Lc;")
    private static class169 field2183;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "Lec;")
    public static class213 field2178;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "Lkea;")
    public static class216 field2188;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "Lbc;")
    public static class333 field2185;

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "Loj;")
    private static class346 field2197;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Lug;")
    public static class516 field2180;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "Lqh;")
    public static class61 field2179;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "Lrf;")
    public static class75 field2184;

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "[B")
    private static byte[] field2196;

    @OriginalMember(owner = "client!tba", name = "E", descriptor = "[B")
    private static byte[] field2207;

    @OriginalMember(owner = "client!tba", name = "L", descriptor = "[B")
    private static byte[] field2214;

    @OriginalMember(owner = "client!tba", name = "M", descriptor = "[B")
    private static byte[] field2215;

    @OriginalMember(owner = "client!tba", name = "N", descriptor = "[B")
    private static byte[] field2216;

    @OriginalMember(owner = "client!tba", name = "H", descriptor = "[I")
    private static int[] field2210;

    @OriginalMember(owner = "client!tba", name = "y", descriptor = "[S")
    private static short[] field2201;

    @OriginalMember(owner = "client!tba", name = "A", descriptor = "[S")
    private static short[] field2203;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "[[[B")
    public static byte[][][] field2190;

    @OriginalMember(owner = "client!tba", name = "C", descriptor = "[[[Lwn;")
    private static class663[][][] field2205;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2202 = arg0 - field2208;
        field2199 = arg1 - field2206;
        field2200 = arg2 - field2208;
        field2217 = arg3 - field2206;
        field2198 = arg4;
        field2204 = arg5;
        field2212 = arg6;
        field2211 = arg7;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;IIII)V")
    private static final void method1024(class638 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2200 - field2202;
        int var6 = field2199 - field2217;
        if (field2200 < field2209) {
            var5++;
        }
        if (field2199 < field2213) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2198;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2198;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2202 + var7;
                if (var52 >= 0 && var52 < field2209) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2211 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2211 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2217 + var53;
                            int var58 = field2209 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2213) {
                                var59 = (field2216[var58] & 0xFF) << 16 | field2201[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2215[var58] & 0xFF;
                                var61 = field2203[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2178.field3112 != -1) {
                                    var62 = field2178.field3112 | 0xFF000000;
                                } else if ((field2202 + var7 & 0x4) == (field2199 + var53 & 0x4)) {
                                    var62 = field2210[field2182.field2227 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method472(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1037(arg0, var49, var54, var51, var56, var59, var60, field2207[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class343 var63 = (class343) field2197.method2061(-17305, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1037(arg0, var49, var54, var51, var56, var59, var60, field2207[var58], var63.field4968, var63.field4969, true);
                                }
                            } else {
                                field2192[0] = (short) (var61 - 1);
                                field2186[0] = field2214[var58];
                                method1037(arg0, var49, var54, var51, var56, var59, var60, field2207[var58], field2192, field2186, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2211 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2211 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2178.field3112 != -1) {
                            var68 = field2178.field3112 | 0xFF000000;
                        } else if ((field2202 + var7 & 0x4) == (field2199 + var64 & 0x4)) {
                            var68 = field2210[field2182.field2227 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method472(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2198;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2198;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2202 + var8;
                if (var41 >= 0 && var41 < field2209) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2211 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2211 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2217 + var42;
                            if (var46 >= 0 && var46 < field2213) {
                                int var47 = field2203[field2209 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1035(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class343 var48 = (class343) field2197.method2061(-17305, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method1035(arg0, var38, var43, var40, var45, var48.field4968, var48.field4969);
                                    }
                                } else {
                                    field2192[0] = (short) (var47 - 1);
                                    field2186[0] = field2214[field2209 * var46 + var41];
                                    method1035(arg0, var38, var43, var40, var45, field2192, field2186);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2202 >> 6;
        int var10 = field2217 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2200 >> 6;
        int var12 = field2199 >> 6;
        if (var11 >= field2205[0].length) {
            var11 = field2205[0].length - 1;
        }
        if (var12 >= field2205[0][0].length) {
            var12 = field2205[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class663 var28 = field2205[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2208 >> 6) + var14) * 64;
                        int var30 = ((field2206 >> 6) + var27) * 64;
                        for (class8 var31 = (class8) var28.method3676((byte) 97); var31 != null; var31 = (class8) var28.method3682(-18176)) {
                            int var32 = var31.field79 + var29 - field2208 - field2202;
                            int var33 = var31.field77 + var30 - field2206 - field2217;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2198;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2198;
                            int var36 = field2211 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2211 - (arg2 * var33 + arg4 >> 16);
                            method1037(arg0, var34, var36, var35 - var34, var37 - var36, var31.field81, var31.field80 & 0xFF, var31.field82, var31.field83, var31.field78, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class663 var17 = field2205[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2208 >> 6) + var15) * 64;
                        int var19 = ((field2206 >> 6) + var16) * 64;
                        for (class8 var20 = (class8) var17.method3676((byte) -71); var20 != null; var20 = (class8) var17.method3682(-18176)) {
                            int var21 = var20.field79 + var18 - field2208 - field2202;
                            int var22 = var20.field77 + var19 - field2206 - field2217;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2198;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2198;
                            int var25 = field2211 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2211 - (arg2 * var22 + arg4 >> 16);
                            method1035(arg0, var23, var25, var24 - var23, var26 - var25, var20.field83, var20.field78);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "()V")
    public static final void method1025() {
        field2196 = new byte[field2213 * field2209];
        field2215 = new byte[field2213 * field2209];
        field2207 = new byte[field2213 * field2209];
        field2203 = new short[field2213 * field2209];
        field2214 = new byte[field2213 * field2209];
        field2197 = new class346(1024);
        field2205 = new class663[3][field2209 >> 6][field2213 >> 6];
        field2210 = new int[field2182.field2223 + 1];
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Loa;IIII)Lsu;")
    private static final class192 method1026(class638 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class209 var5 = (class209) field2193.method1270((byte) -25); var5 != null; var5 = (class209) field2193.method1282(0)) {
            method1031(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2193;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)Lec;")
    public static final class213 method1027(int arg0, int arg1) {
        for (class213 var2 = (class213) field2177.method2066(false); var2 != null; var2 = (class213) field2177.method2062(-19704)) {
            if (var2.field3114 && var2.method1394(116, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;)V")
    public static final void method1028(class638 arg0) {
        int var1 = field2200 - field2202;
        int var2 = field2199 - field2217;
        int var3 = (field2212 - field2198 << 16) / var1;
        int var4 = (field2211 - field2204 << 16) / var2;
        method1024(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Loa;)Lsu;")
    public static final class192 method1029(class638 arg0) {
        int var1 = field2200 - field2202;
        int var2 = field2199 - field2217;
        int var3 = (field2212 - field2198 << 16) / var1;
        int var4 = (field2211 - field2204 << 16) / var2;
        return method1026(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)Lec;")
    public static final class213 method1030(int arg0) {
        return (class213) field2177.method2061(-17305, (long) arg0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;Ljd;IIII)V")
    private static final void method1031(class638 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3084 = ((arg1.field3081 - field2202) * arg2 + arg4 >> 16) + field2198;
        arg1.field3079 = field2211 - ((arg1.field3085 - field2217) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "()V")
    public static final void method1032() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2188.field3141; var1++) {
            boolean var2 = field2178.method1396(field2188.field3140[var1] & 0x3FFF, (byte) 96, field2188.field3140[var1] >> 28 & 0x3, var0, field2188.field3140[var1] >> 14 & 0x3FFF);
            if (var2) {
                class209 var3 = new class209(field2188.field3135[var1]);
                var3.field3081 = var0[1] - field2208;
                var3.field3085 = var0[2] - field2206;
                field2193.method1273(var3, (byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lpj;Lada;Lc;Lbc;Lug;Lrf;Lqh;)V")
    public static final void method1033(class132 arg0, class149 arg1, class169 arg2, class333 arg3, class516 arg4, class75 arg5, class61 arg6) {
        field2181 = arg0;
        field2182 = arg1;
        field2183 = arg2;
        field2185 = arg3;
        field2180 = arg4;
        field2184 = arg5;
        field2179 = arg6;
        field2177.method2060(0);
        int var7 = field2181.method920(2, "details");
        int[] var8 = field2181.method939((byte) 23, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class213 var10 = class522.method2887(var7, var8[var9], Integer.MAX_VALUE, field2181);
                field2177.method2063((long) var10.field3110, 1, var10);
            }
        }
        class256.method1570(false, true, -111);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Le;III)I")
    private static final int method1034(class489 arg0, int arg1, int arg2, int arg3) {
        class323 var4 = field2182.method1046(-38, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4775;
        if (var5 >= 0 && arg0.method588(-26679, var5).field3821) {
            var5 = -1;
        }
        int var9;
        if (var4.field4780 >= 0) {
            int var6 = var4.field4780;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class145.field2153[class99.method766(32217, class475.method2701(96, var8, (byte) 85)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class145.field2153[class99.method766(32217, class475.method2701(96, arg0.method588(-26679, var5).field3817, (byte) 42)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4767 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4767;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class145.field2153[class99.method766(32217, class475.method2701(96, var12, (byte) 61)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;IIII[S[B)V")
    private static final void method1035(class638 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class620 var8 = field2185.method2013(arg5[var7] & 0xFFFF, false);
            int var9 = var8.field8573;
            if (var9 != -1) {
                class633 var10 = field2184.method600(var9, true);
                class461 var11 = var10.method3515(false, arg0, var8.field8565 ? var8.field8651 : false, var8.field8614 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method33() >> 2;
                    int var13 = arg4 * var11.method29() >> 2;
                    if (var10.field8861) {
                        int var14 = var8.field8582;
                        int var15 = var8.field8566;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field8862 == 0) {
                            var11.method2659(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method35(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field8862 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "()V")
    public static void method1036() {
        field2182 = null;
        field2183 = null;
        field2185 = null;
        field2180 = null;
        field2184 = null;
        field2179 = null;
        field2178 = null;
        field2181 = null;
        field2177 = null;
        field2190 = null;
        field2192 = null;
        field2186 = null;
        field2188 = null;
        field2193 = null;
        field2210 = null;
        field2196 = null;
        field2216 = null;
        field2201 = null;
        field2215 = null;
        field2207 = null;
        field2203 = null;
        field2214 = null;
        field2197 = null;
        field2205 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;IIIIIII[S[BZ)V")
    private static final void method1037(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method472(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2210[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method472(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class399.method2265(arg3, var12, (byte) -108, arg1, arg4, field2187, field2210[arg6], var11, arg7 >> 6 & 0x3, field2190, arg0, arg5, arg2);
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
                class620 var18 = field2185.method2013(arg8[var16] & 0xFFFF, false);
                if (var18.field8573 == -1) {
                    int var19 = -3355444;
                    if (var18.field8592 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method414(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method445(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method414(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method445(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method414(arg1, arg2, arg4, -1, 0);
                            arg0.method445(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method414(var14, arg2, arg4, -1, 0);
                            arg0.method445(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method414(var14, arg2, arg4, -1, 0);
                            arg0.method445(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method414(arg1, arg2, arg4, -1, 0);
                            arg0.method445(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method445(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method445(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method445(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method445(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method445(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method445(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "()V")
    private static final void method1038() {
        for (int var0 = 0; var0 < field2209; var0++) {
            for (int var11 = 0; var11 < field2213; var11++) {
                int var12 = field2203[field2209 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class343 var13 = (class343) field2197.method2061(-17305, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4968.length; var14++) {
                                class620 var15 = field2185.method2013(var13.field4968[var14] & 0xFFFF, false);
                                int var16 = var15.field8618;
                                if (var15.field8623 != null) {
                                    class620 var17 = var15.method3450(-123, field2179);
                                    if (var17 != null) {
                                        var16 = var17.field8618;
                                    }
                                }
                                if (var16 != -1) {
                                    class209 var18 = new class209(var16);
                                    var18.field3081 = var0;
                                    var18.field3085 = var11;
                                    field2193.method1273(var18, (byte) 122);
                                }
                            }
                        }
                    } else {
                        class620 var19 = field2185.method2013(var12 - 1, false);
                        int var20 = var19.field8618;
                        if (var19.field8623 != null) {
                            class620 var21 = var19.method3450(-107, field2179);
                            if (var21 != null) {
                                var20 = var21.field8618;
                            }
                        }
                        if (var20 != -1) {
                            class209 var22 = new class209(var20);
                            var22.field3081 = var0;
                            var22.field3085 = var11;
                            field2193.method1273(var22, (byte) 122);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2205[0].length; var2++) {
                for (int var3 = 0; var3 < field2205[0][0].length; var3++) {
                    class663 var4 = field2205[var1][var2][var3];
                    if (var4 != null) {
                        for (class8 var5 = (class8) var4.method3676((byte) 113); var5 != null; var5 = (class8) var4.method3682(-18176)) {
                            if (var5.field83 != null) {
                                for (int var6 = 0; var6 < var5.field83.length; var6++) {
                                    class620 var7 = field2185.method2013(var5.field83[var6] & 0xFFFF, false);
                                    int var8 = var7.field8618;
                                    if (var7.field8623 != null) {
                                        class620 var9 = var7.method3450(-126, field2179);
                                        if (var9 != null) {
                                            var8 = var9.field8618;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class209 var10 = new class209(var8);
                                        var10.field3081 = ((field2208 >> 6) + var2) * 64 + var5.field79 - field2208;
                                        var10.field3085 = ((field2206 >> 6) + var3) * 64 + var5.field77 - field2206;
                                        field2193.method1273(var10, (byte) 122);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Le;II)V")
    public static final void method1039(class489 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field2182.field2223; var3++) {
            field2210[var3 + 1] = method1034(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(II)Lpw;")
    public static final class649 method1040(int arg0, int arg1) {
        class649 var2 = new class649();
        for (class213 var3 = (class213) field2177.method2066(false); var3 != null; var3 = (class213) field2177.method2062(-19704)) {
            if (var3.field3114 && var3.method1394(124, arg0, arg1)) {
                var2.method3615(-31531, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;II)V")
    public static final void method1041(class638 arg0, int arg1, int arg2) {
        class96 var3 = new class96(field2181.method937("area", field2178.field3126, 0));
        int var4 = var3.method718(123);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method718(80);
        }
        int var7 = var3.method718(-93);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method718(79);
        }
        while (true) {
            while (var3.field1301 < var3.field1316.length) {
                if (var3.method718(104) == 0) {
                    int var22 = var3.method718(-118);
                    int var23 = var3.method718(96);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2208;
                            int var27 = var23 * 64 + var25 - field2206;
                            method1044(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method718(74);
                    int var29 = var3.method718(108);
                    int var30 = var3.method718(126);
                    int var31 = var3.method718(-66);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2208;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2206;
                            method1044(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2216 = new byte[field2213 * field2209];
            field2201 = new short[field2213 * field2209];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2213 * field2209];
                for (int var13 = 0; var13 < field2205[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2205[var11][0].length; var19++) {
                        class663 var20 = field2205[var11][var13][var19];
                        if (var20 != null) {
                            for (class8 var21 = (class8) var20.method3676((byte) 99); var21 != null; var21 = (class8) var20.method3682(-18176)) {
                                var12[(var19 * 64 + var21.field77) * field2209 + var13 * 64 + var21.field79] = (byte) var21.field81;
                            }
                        }
                    }
                }
                method1042(var12, field2216, field2201, arg1, arg2);
                for (int var14 = 0; var14 < field2205[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2205[var11][0].length; var15++) {
                        class663 var16 = field2205[var11][var14][var15];
                        if (var16 != null) {
                            for (class8 var17 = (class8) var16.method3676((byte) 99); var17 != null; var17 = (class8) var16.method3682(-18176)) {
                                int var18 = (var15 * 64 + var17.field77) * field2209 + var14 * 64 + var17.field79;
                                var17.field81 = (field2216[var18] & 0xFF) << 16 | field2201[var18] & 0xFFFF;
                                if (var17.field81 != 0) {
                                    var17.field81 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1042(field2196, field2216, field2201, arg1, arg2);
            field2196 = null;
            method1038();
            return;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1042(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2213];
        int[] var6 = new int[field2213];
        int[] var7 = new int[field2213];
        int[] var8 = new int[field2213];
        int[] var9 = new int[field2213];
        for (int var10 = -5; var10 < field2209; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2213; var13++) {
                int var10002;
                if (var11 < field2209) {
                    int var28 = arg0[field2209 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class305 var29 = field2183.method1162(1, var28 - 1);
                        var5[var13] += var29.field4486;
                        var6[var13] += var29.field4491;
                        var7[var13] += var29.field4495;
                        var8[var13] += var29.field4489;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2209 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class305 var31 = field2183.method1162(1, var30 - 1);
                        var5[var13] -= var31.field4486;
                        var6[var13] -= var31.field4491;
                        var7[var13] -= var31.field4495;
                        var8[var13] -= var31.field4489;
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
                for (int var19 = -5; var19 < field2213; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2213) {
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
                        if ((arg0[field2209 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2209 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class228.method1457(var15 / var18, var16 / var18, (byte) 53, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2209 * var19 + var10;
                            int var27 = class145.field2153[class99.method766(32217, class208.method1378(96, var25, 1)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "()V")
    public static final void method1043() {
        field2196 = null;
        field2216 = null;
        field2201 = null;
        field2215 = null;
        field2207 = null;
        field2203 = null;
        field2214 = null;
        field2197 = null;
        field2205 = null;
        field2210 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Loa;Ljr;IIII[I[I)V")
    private static final void method1044(class638 arg0, class96 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method718(-125);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method718(91);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2196[field2209 * arg5 + arg4] = (byte) var11;
                    field2215[field2209 * arg5 + arg4] = 0;
                } else {
                    field2215[field2209 * arg5 + arg4] = (byte) var11;
                    field2207[field2209 * arg5 + arg4] = 0;
                    field2196[field2209 * arg5 + arg4] = arg1.method748(-813976688);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method718(80);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method718(-123);
                var18 = arg1.method718(-125);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method718(90);
            }
            if (var15 == 0) {
                field2196[field2209 * arg5 + arg4] = (byte) var16;
                field2215[field2209 * arg5 + arg4] = (byte) var17;
                field2207[field2209 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2203[field2209 * arg5 + arg4] = (short) (arg1.method743((byte) -114) + 1);
                    field2214[field2209 * arg5 + arg4] = arg1.method748(-813976688);
                } else if (var19 > 1) {
                    field2203[field2209 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method743((byte) -69);
                        var21[var22] = arg1.method748(-813976688);
                    }
                    field2197.method2063((long) (arg4 << 16 | arg5), 1, new class343(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method743((byte) -118);
                        var24[var25] = arg1.method748(-813976688);
                    }
                }
                if (field2205[var15 - 1][arg2 - (field2208 >> 6)][arg3 - (field2206 >> 6)] == null) {
                    field2205[var15 - 1][arg2 - (field2208 >> 6)][arg3 - (field2206 >> 6)] = new class663();
                }
                class8 var26 = new class8(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2205[var15 - 1][arg2 - (field2208 >> 6)][arg3 - (field2206 >> 6)].method3679(var26, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public static final void method1045(int arg0) {
        field2178 = (class213) field2177.method2061(-17305, (long) arg0);
    }
}
