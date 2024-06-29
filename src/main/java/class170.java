import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class170 extends class294 {

    @OriginalMember(owner = "client!aq", name = "db", descriptor = "Lef;")
    private class513 field2349 = new class513();

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "Lffa;")
    public class197 field2334;

    @OriginalMember(owner = "client!aq", name = "Z", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "[[F")
    private float[][] field2357;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "[[[I")
    private int[][][] field2325;

    @OriginalMember(owner = "client!aq", name = "hb", descriptor = "[[B")
    private byte[][] field2324;

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "[[[I")
    private int[][][] field2342;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "[[[I")
    public int[][][] field2355;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "[[F")
    private float[][] field2366;

    @OriginalMember(owner = "client!aq", name = "eb", descriptor = "[[S")
    public short[][] field2328;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "[[B")
    private byte[][] field2364;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "[[[I")
    public int[][][] field2331;

    @OriginalMember(owner = "client!aq", name = "bb", descriptor = "[[[I")
    public int[][][] field2319;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "[[F")
    private float[][] field2360;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "[[[Ljm;")
    private class716[][][] field2336;

    @OriginalMember(owner = "client!aq", name = "Y", descriptor = "Lqha;")
    private class112 field2361;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "Lpc;")
    private class698 field2343;

    @OriginalMember(owner = "client!aq", name = "ib", descriptor = "[Ljava/lang/String;")
    private static final String[] field2369 = new String[] { method1518(method1517("O:\u0000U2")), method1518(method1517("Ue\u00002g")), method1518(method1517("ZaB\u0017")), method1518(method1517("Ue\u0000.g")), method1518(method1517("Ue\u0000=g")), method1518(method1517("Ue\u0000\f.\u001c")), method1518(method1517("Ue\u00001g")), method1518(method1517("Ue\u0000:g")), method1518(method1517("Ue\u00003g")), method1518(method1517("Ue\u00000g")), method1518(method1517("Ue\u0000?g")), method1518(method1517("Ue\u0000<g")), method1518(method1517("Ue\u00009g")), method1518(method1517("Ue\u00007g")), method1518(method1517("Ue\u00008\u000e\u001c")), method1518(method1517("Ue\u00008g")), method1518(method1517("Ue\u0000>g")), method1518(method1517("Ue\u0000\u0010.\u001c")), method1518(method1517("Ue\u0000\u001d.\u001c")), method1518(method1517("Ue\u0000\"\u000e\u001c")), method1518(method1517("Ue\u0000G&Z}ZEg")) };

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "Ljava/lang/Object;")
    public static volatile Object field2335 = null;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "[I")
    public static int[] field2327 = new int[4096];

    @OriginalMember(owner = "client!aq", name = "X", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!aq", name = "U", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!aq", name = "cb", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!aq", name = "V", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!aq", name = "ab", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!aq", name = "W", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!aq", name = "gb", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    private int field2359;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!aq", name = "fb", descriptor = "Lml;")
    private class407 field2367;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Luo;")
    public class602 field2356;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "Luo;")
    private class602 field2358;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "Luo;")
    public class602 field2363;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "Luo;")
    public class602 field2368;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "[Ljm;")
    private class716[] field2365;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "[[[I")
    private int[][][] field2326;

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field2327[var0] = class759.method5500(32, var0);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Luf;[I)V", line = 3)
    public final void method1499(class471 arg0, int[] arg1) {
        try {
            ++field2347;
            this.field2349.method3868(-117, new class775(this.field2334, this, arg0, arg1));
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2369[11] + (arg0 != null ? field2369[0] : field2369[2]) + ',' + (arg1 != null ? field2369[0] : field2369[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "YA", descriptor = "()V", line = 16)
    public final void method1500() {
        try {
            ++field2321;
            if (~this.field2359 < -1) {
                byte[][] var1 = new byte[super.field4337 + 1][super.field4336 + 1];
                for (int var2 = 1; super.field4337 > var2; ++var2) {
                    for (int var3 = 1; var3 < super.field4336; ++var3) {
                        var1[var2][var3] = (byte) ((this.field2364[var2][var3 + -1] >> 2) + (this.field2364[var2][var3 + 1] >> 3) + (this.field2364[var2][var3] >> 1) + (this.field2364[var2 + 1][var3] >> 3) + (this.field2364[var2 + -1][var3] >> 2));
                    }
                }
                this.field2365 = new class716[this.field2361.method979(false)];
                this.field2361.method974(0, this.field2365);
                for (int var4 = 0; this.field2365.length > var4; ++var4) {
                    this.field2365[var4].method5212(121, this.field2359);
                }
                int var5 = 24;
                if (this.field2326 != null) {
                    var5 += 4;
                }
                if ((7 & this.field2323) != 0) {
                    var5 += 12;
                }
                NativeHeapBuffer var6 = this.field2334.field2848.method5097(this.field2359 * var5, false);
                Stream var7 = new Stream(var6);
                class716[] var8 = new class716[this.field2359];
                int var9 = class554.method4172(this.field2359 / 4, 24500);
                if (~var9 > -2) {
                    var9 = 1;
                }
                class112 var10 = new class112(var9);
                class716[] var11 = new class716[this.field2362];
                for (int var12 = 0; super.field4337 > var12; ++var12) {
                    for (int var13 = 0; super.field4336 > var13; ++var13) {
                        if (this.field2319[var12][var13] != null) {
                            class716[] var14 = this.field2336[var12][var13];
                            int[] var15 = this.field2331[var12][var13];
                            int[] var16 = this.field2355[var12][var13];
                            int[] var17 = this.field2325[var12][var13];
                            int[] var18 = this.field2319[var12][var13];
                            int[] var19 = this.field2342 != null ? this.field2342[var12][var13] : null;
                            int[] var20 = this.field2326 != null ? this.field2326[var12][var13] : null;
                            if (var17 == null) {
                                var17 = var18;
                            }
                            float var21 = this.field2360[var12][var13];
                            float var22 = this.field2366[var12][var13];
                            float var23 = this.field2357[var12][var13];
                            float var24 = this.field2360[var12][var13 - -1];
                            float var25 = this.field2366[var12][var13 + 1];
                            float var26 = this.field2357[var12][var13 + 1];
                            float var27 = this.field2360[var12 + 1][var13 + 1];
                            float var28 = this.field2366[var12 + 1][var13 + 1];
                            float var29 = this.field2357[var12 + 1][var13 + 1];
                            float var30 = this.field2360[var12 + 1][var13];
                            float var31 = this.field2366[var12 + 1][var13];
                            float var32 = this.field2357[var12 + 1][var13];
                            int var33 = 255 & var1[var12][var13];
                            int var34 = var1[var12][var13 - -1] & 255;
                            int var35 = 255 & var1[var12 - -1][var13 - -1];
                            int var36 = 255 & var1[var12 + 1][var13];
                            int var37 = 0;
                            label381: for (int var38 = 0; var18.length > var38; ++var38) {
                                class716 var39 = var14[var38];
                                for (int var40 = 0; ~var40 > ~var37; ++var40) {
                                    if (var11[var40] == var39) {
                                        continue label381;
                                    }
                                }
                                var11[var37++] = var39;
                            }
                            short[] var41 = this.field2328[super.field4337 * var13 - -var12] = new short[var18.length];
                            for (int var42 = 0; var18.length > var42; ++var42) {
                                int var43 = (var12 << super.field4341) - -var15[var42];
                                int var44 = (var13 << super.field4341) - -var16[var42];
                                int var45 = var43 >> this.field2320;
                                int var46 = var44 >> this.field2320;
                                int var47 = var18[var42];
                                int var48 = var17[var42];
                                int var49 = var19 != null ? var19[var42] : 0;
                                long var50 = (long) (var45 << 16) | (long) var48 << 48 | (long) var47 << 32 | (long) var46;
                                int var52 = var15[var42];
                                int var53 = var16[var42];
                                byte var54 = 74;
                                int var55 = 0;
                                float var56;
                                float var57;
                                int var58;
                                float var59;
                                if (var52 == 0 && ~var53 == -1) {
                                    var59 = var23;
                                    var56 = var22;
                                    var57 = var21;
                                    var58 = var54 - var33;
                                } else if (var52 == 0 && super.field4340 == var53) {
                                    var56 = var25;
                                    var57 = var24;
                                    var58 = var54 - var34;
                                    var59 = var26;
                                } else if (~super.field4340 == ~var52 && super.field4340 == var53) {
                                    var57 = var27;
                                    var58 = var54 - var35;
                                    var59 = var29;
                                    var56 = var28;
                                } else if (super.field4340 == var52 && var53 == 0) {
                                    var58 = var54 - var36;
                                    var57 = var30;
                                    var56 = var31;
                                    var59 = var32;
                                } else {
                                    float var60 = (float) var52 / (float) super.field4340;
                                    float var61 = (float) var53 / (float) super.field4340;
                                    float var62 = (var30 - var21) * var60 + var21;
                                    float var63 = (-var22 + var31) * var60 + var22;
                                    float var64 = (var32 - var23) * var60 + var23;
                                    float var65 = (var27 - var24) * var60 + var24;
                                    float var66 = (var28 - var25) * var60 + var25;
                                    var56 = (var66 - var63) * var61 + var63;
                                    var57 = (var65 - var62) * var61 + var62;
                                    float var67 = (var29 - var26) * var60 + var26;
                                    var59 = (var67 - var64) * var61 + var64;
                                    int var68 = ((-var33 + var36) * var52 >> super.field4341) + var33;
                                    int var69 = var34 - -((-var34 + var35) * var52 >> super.field4341);
                                    var58 = var54 - (((-var68 + var69) * var53 >> super.field4341) + var68);
                                }
                                float var70 = 1.0F;
                                if (~var47 != 0) {
                                    int var71 = (127 & var47) * var58 >> 7;
                                    if (var71 < 2) {
                                        var71 = 2;
                                    } else if (~var71 < -127) {
                                        var71 = 126;
                                    }
                                    if (~(7 & this.field2323) == -1) {
                                        float var72 = this.field2334.field2888[2] * var59 + this.field2334.field2888[0] * var57 + this.field2334.field2888[1] * var56;
                                        var70 = this.field2334.field2965 + var72 * (var72 > 0.0F ? this.field2334.field2955 : this.field2334.field2921);
                                    }
                                    var55 = class172.field2403[var71 | 65408 & var47];
                                }
                                class206 var73 = null;
                                if ((this.field2329 + -1 & var43) == 0 && (var44 & this.field2329 + -1) == 0) {
                                    var73 = var10.method977(var50, 1);
                                }
                                int var74;
                                if (var73 != null) {
                                    var41[var42] = ((class695) var73).field10142;
                                    var74 = 65535 & var41[var42];
                                    if (~var47 != 0 && ~var8[var74].field3177 < ~var14[var42].field3177) {
                                        var8[var74] = var14[var42];
                                    }
                                } else {
                                    int var75;
                                    if (var47 == var48) {
                                        var75 = var55;
                                    } else {
                                        int var76 = (127 & var48) * var58 >> 7;
                                        if (~var76 > -3) {
                                            var76 = 2;
                                        } else if (var76 > 126) {
                                            var76 = 126;
                                        }
                                        var75 = class172.field2403[var76 | 65408 & var48];
                                        if (~(this.field2323 & 7) == -1) {
                                            float var77 = this.field2334.field2888[2] * var59 + this.field2334.field2888[1] * var56 + this.field2334.field2888[0] * var57;
                                            float var78 = this.field2334.field2965 + (!(var70 > 0.0F) ? this.field2334.field2921 : this.field2334.field2955) * var70;
                                            int var79 = 255 & var75 >> 16;
                                            int var80 = (var75 & 65356) >> 8;
                                            int var81 = var75 & 255;
                                            int var82 = (int) ((float) var79 * var78);
                                            if (var82 >= 0) {
                                                if (~var82 < -256) {
                                                    var82 = 255;
                                                }
                                            } else {
                                                var82 = 0;
                                            }
                                            int var83 = (int) ((float) var80 * var78);
                                            int var84 = (int) ((float) var81 * var78);
                                            if (var83 < 0) {
                                                var83 = 0;
                                            } else if (~var83 < -256) {
                                                var83 = 255;
                                            }
                                            if (~var84 <= -1) {
                                                if (var84 > 255) {
                                                    var84 = 255;
                                                }
                                            } else {
                                                var84 = 0;
                                            }
                                            var75 = var83 << 8 | var82 << 16 | var84;
                                        }
                                    }
                                    if (!this.field2334.field2922) {
                                        var7.method5105((float) var43);
                                        var7.method5105((float) (var49 + this.method2404((byte) 103, var43, var44)));
                                        var7.method5105((float) var44);
                                        var7.method5106((byte) (var75 >> 16));
                                        var7.method5106((byte) (var75 >> 8));
                                        var7.method5106((byte) var75);
                                        var7.method5106(-1);
                                        var7.method5105((float) var43);
                                        var7.method5105((float) var44);
                                        if (this.field2326 != null) {
                                            var7.method5105((float) (var20 != null ? var20[var42] + -1 : 0));
                                        }
                                        if (~(7 & this.field2323) != -1) {
                                            var7.method5105(var57);
                                            var7.method5105(var56);
                                            var7.method5105(var59);
                                        }
                                    } else {
                                        var7.method5112((float) var43);
                                        var7.method5112((float) (var49 + this.method2404((byte) 105, var43, var44)));
                                        var7.method5112((float) var44);
                                        var7.method5106((byte) (var75 >> 16));
                                        var7.method5106((byte) (var75 >> 8));
                                        var7.method5106((byte) var75);
                                        var7.method5106(-1);
                                        var7.method5112((float) var43);
                                        var7.method5112((float) var44);
                                        if (this.field2326 != null) {
                                            var7.method5112((float) (var20 == null ? 0 : var20[var42] + -1));
                                        }
                                        if (~(7 & this.field2323) != -1) {
                                            var7.method5112(var57);
                                            var7.method5112(var56);
                                            var7.method5112(var59);
                                        }
                                    }
                                    var74 = this.field2337++;
                                    var41[var42] = (short) var74;
                                    if (~var47 != 0) {
                                        var8[var74] = var14[var42];
                                    }
                                    var10.method968((byte) -111, var50, new class695(var41[var42]));
                                }
                                for (int var85 = 0; ~var37 < ~var85; ++var85) {
                                    var11[var85].method5209(var74, -91, var55, var70, var58);
                                }
                                ++this.field2348;
                            }
                        }
                    }
                }
                for (int var86 = 0; var86 < this.field2337; ++var86) {
                    class716 var87 = var8[var86];
                    if (var87 != null) {
                        var87.method5213(476834768, var86);
                    }
                }
                for (int var88 = 0; ~super.field4337 < ~var88; ++var88) {
                    for (int var89 = 0; super.field4336 > var89; ++var89) {
                        short[] var90 = this.field2328[super.field4337 * var89 + var88];
                        if (var90 != null) {
                            int var91 = 0;
                            int var92 = 0;
                            while (var90.length > var92) {
                                int var93 = var90[var92++] & 65535;
                                int var94 = var90[var92++] & 65535;
                                int var95 = var90[var92++] & 65535;
                                class716 var96 = var8[var93];
                                class716 var97 = var8[var94];
                                class716 var98 = var8[var95];
                                class716 var99 = null;
                                if (var96 != null) {
                                    var96.method5208(106, var89, var88, var91);
                                    var99 = var96;
                                }
                                if (var97 != null) {
                                    var97.method5208(96, var89, var88, var91);
                                    if (var99 == null || ~var97.field3177 > ~var99.field3177) {
                                        var99 = var97;
                                    }
                                }
                                if (var98 != null) {
                                    var98.method5208(112, var89, var88, var91);
                                    if (var99 == null || ~var99.field3177 < ~var98.field3177) {
                                        var99 = var98;
                                    }
                                }
                                if (var99 != null) {
                                    if (var96 != null) {
                                        var99.method5213(476834768, var93);
                                    }
                                    if (var97 != null) {
                                        var99.method5213(476834768, var94);
                                    }
                                    if (var98 != null) {
                                        var99.method5213(476834768, var95);
                                    }
                                    var99.method5208(85, var89, var88, var91);
                                }
                                ++var91;
                            }
                        }
                    }
                }
                var7.method5103();
                this.field2367 = this.field2334.method1715(var6, var7.method5104(), false, 9, var5);
                this.field2356 = new class602(this.field2367, 5126, 3, 0);
                this.field2358 = new class602(this.field2367, 5121, 4, 12);
                byte var100;
                if (this.field2326 != null) {
                    var100 = 28;
                    this.field2363 = new class602(this.field2367, 5126, 3, 16);
                } else {
                    var100 = 24;
                    this.field2363 = new class602(this.field2367, 5126, 2, 16);
                }
                if (~(7 & this.field2323) != -1) {
                    this.field2368 = new class602(this.field2367, 5126, 3, var100);
                }
                long[] var101 = new long[this.field2365.length];
                for (int var102 = 0; var102 < this.field2365.length; ++var102) {
                    class716 var103 = this.field2365[var102];
                    var101[var102] = var103.field3177;
                    var103.method5211((byte) 107, this.field2337);
                }
                class122.method1059(var101, this.field2365, (byte) 75);
                if (this.field2343 != null) {
                    this.field2343.method5089((byte) -95);
                }
            } else {
                this.field2343 = null;
            }
            this.field2325 = null;
            this.field2331 = this.field2355 = null;
            this.field2336 = null;
            this.field2319 = null;
            this.field2326 = null;
            this.field2360 = this.field2366 = this.field2357 = null;
            this.field2364 = null;
            this.field2361 = null;
            this.field2342 = null;
        } catch (RuntimeException var105) {
            throw class759.method5498(var105, field2369[19] + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 598)
    public final boolean method1501(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field2322;
            if (this.field2343 != null && arg0 != null) {
                int var7 = -(this.field2334.field2913 * arg2 >> 8) + arg1 >> this.field2334.field2852;
                int var8 = -(this.field2334.field2995 * arg2 >> 8) + arg3 >> this.field2334.field2852;
                return this.field2343.method5088(var8, (byte) 75, arg0, var7);
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2369[16] + (arg0 != null ? field2369[0] : field2369[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILfi;I)V", line = 618)
    private final void method1502(int arg0, int arg1, class582 arg2, int arg3) {
        try {
            ++field2353;
            int[] var5 = this.field2331[arg0][arg3];
            int[] var6 = this.field2355[arg0][arg3];
            int var7 = var5.length;
            if (~this.field2334.field2998.length > ~var7) {
                this.field2334.field2998 = new int[var7];
                this.field2334.field3000 = new int[var7];
            }
            int[] var8 = this.field2334.field2998;
            int[] var9 = this.field2334.field3000;
            for (int var10 = 0; var7 > var10; ++var10) {
                var8[var10] = var5[var10] >> this.field2334.field2852;
                var9[var10] = var6[var10] >> this.field2334.field2852;
            }
            int var11 = arg1;
            while (~var7 < ~var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) - (var16 - var14) * (-var13 + var15) > 0) {
                    arg2.method4354(var15, var16, var17, var13, (byte) -66, var12, var14);
                }
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field2369[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2369[0] : field2369[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lffa;IIII[[I[[II)V", line = 681)
    public class170(class197 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        try {
            this.field2334 = arg0;
            this.field2320 = super.field4341 + -2;
            this.field2357 = new float[super.field4337 - -1][super.field4336 + 1];
            this.field2323 = arg2;
            this.field2325 = new int[arg3][arg4][];
            this.field2324 = new byte[arg3][arg4];
            this.field2342 = new int[arg3][arg4][];
            this.field2329 = 1 << this.field2320;
            this.field2355 = new int[arg3][arg4][];
            this.field2366 = new float[super.field4337 + 1][super.field4336 + 1];
            this.field2328 = new short[arg3 * arg4][];
            this.field2364 = new byte[arg3 + 1][arg4 + 1];
            this.field2331 = new int[arg3][arg4][];
            this.field2319 = new int[arg3][arg4][];
            this.field2360 = new float[super.field4337 + 1][super.field4336 + 1];
            this.field2336 = new class716[arg3][arg4][];
            for (int var9 = 1; ~var9 > ~super.field4336; ++var9) {
                for (int var10 = 1; ~super.field4337 < ~var10; ++var10) {
                    int var11 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                    int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + (var11 * var11 - -(var12 * var12)))));
                    this.field2360[var10][var9] = (float) var11 * var13;
                    this.field2366[var10][var9] = (float) (-arg7 * 2) * var13;
                    this.field2357[var10][var9] = (float) var12 * var13;
                }
            }
            this.field2361 = new class112(128);
            if ((16 & this.field2323) != 0) {
                this.field2343 = new class698(this.field2334, this);
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field2369[20] + (arg0 != null ? field2369[0] : field2369[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2369[0] : field2369[2]) + ',' + (arg6 != null ? field2369[0] : field2369[2]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 737)
    public final void method1503(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        try {
            ++field2345;
            if (arg3 != null && this.field2342 == null) {
                this.field2342 = new int[super.field4337][super.field4336][];
            }
            class160 var15 = this.field2334.field679;
            if (arg5 != null && this.field2326 == null) {
                this.field2326 = new int[super.field4337][super.field4336][];
            }
            this.field2331[arg0][arg1] = arg2;
            this.field2355[arg0][arg1] = arg4;
            this.field2319[arg0][arg1] = arg6;
            this.field2325[arg0][arg1] = arg7;
            if (this.field2326 != null) {
                this.field2326[arg0][arg1] = arg5;
            }
            if (this.field2342 != null) {
                this.field2342[arg0][arg1] = arg3;
            }
            class716[] var16 = this.field2336[arg0][arg1] = new class716[arg6.length];
            for (int var17 = 0; var17 < arg6.length; ++var17) {
                int var18 = arg8[var17];
                int var19 = arg9[var17];
                if ((this.field2323 & 32) != 0 && ~var18 != 0 && var15.method1366((byte) -84, var18).field6474) {
                    var18 = -1;
                    var19 = 128;
                }
                long var20 = (long) var18 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (var19 << 14);
                class206 var22;
                for (var22 = this.field2361.method977(var20, 1); var22 != null; var22 = this.field2361.method969(-77)) {
                    class716 var23 = (class716) var22;
                    if (~var23.field10364 == ~var18 && (float) var19 == var23.field10358 && ~var23.field10357 == ~arg10 && ~var23.field10354 == ~arg11 && var23.field10353 == arg12) {
                        break;
                    }
                }
                if (var22 != null) {
                    var16[var17] = (class716) var22;
                } else {
                    var16[var17] = new class716(this, var18, var19, arg10, arg11, arg12);
                    this.field2361.method968((byte) -111, var20, var16[var17]);
                }
            }
            if (arg13) {
                this.field2324[arg0][arg1] = (byte) class544.method4107(this.field2324[arg0][arg1], 1);
            }
            if (this.field2362 < arg6.length) {
                this.field2362 = arg6.length;
            }
            this.field2359 += arg6.length;
        } catch (RuntimeException var25) {
            throw class759.method5498(var25, field2369[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2369[0] : field2369[2]) + ',' + (arg3 != null ? field2369[0] : field2369[2]) + ',' + (arg4 != null ? field2369[0] : field2369[2]) + ',' + (arg5 != null ? field2369[0] : field2369[2]) + ',' + (arg6 != null ? field2369[0] : field2369[2]) + ',' + (arg7 != null ? field2369[0] : field2369[2]) + ',' + (arg8 != null ? field2369[0] : field2369[2]) + ',' + (arg9 != null ? field2369[0] : field2369[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "fa", descriptor = "(IILr;)Lr;", line = 821)
    public final class194 method1504(int arg0, int arg1, class194 arg2) {
        try {
            ++field2338;
            if ((1 & this.field2324[arg0][arg1]) == 0) {
                return null;
            } else {
                int var4 = super.field4340 >> this.field2334.field2852;
                class582 var5 = (class582) arg2;
                class582 var6;
                if (var5 != null && var5.method4358((byte) 26, var4, var4)) {
                    var6 = var5;
                    var5.method4356((byte) 124);
                } else {
                    var6 = new class582(this.field2334, var4, var4);
                }
                var6.method4353(var4, 0, var4, 126, 0);
                this.method1502(arg0, 0, var6, arg1);
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2369[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2369[0] : field2369[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V", line = 851)
    public final void method1505(int arg0, int arg1) {
        try {
            ++field2346;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2369[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 858)
    public final void method1506(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        try {
            ++field2344;
            int var18 = arg9.length;
            int[] var19 = new int[var18 * 3];
            int[] var20 = new int[var18 * 3];
            int[] var21 = new int[var18 * 3];
            int[] var22 = new int[var18 * 3];
            int[] var23 = new int[var18 * 3];
            int[] var24 = new int[var18 * 3];
            int[] var25 = arg3 == null ? null : new int[var18 * 3];
            int[] var26 = arg5 != null ? new int[var18 * 3] : null;
            int var27 = 0;
            for (int var28 = 0; ~var28 > ~var18; ++var28) {
                int var29 = arg6[var28];
                int var30 = arg7[var28];
                int var31 = arg8[var28];
                var19[var27] = arg2[var29];
                var20[var27] = arg4[var29];
                var21[var27] = arg9[var28];
                var23[var27] = arg11[var28];
                var24[var27] = arg12[var28];
                var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
                if (arg3 != null) {
                    var25[var27] = arg3[var29];
                }
                if (arg5 != null) {
                    var26[var27] = arg5[var29];
                }
                ++var27;
                var19[var27] = arg2[var30];
                var20[var27] = arg4[var30];
                var21[var27] = arg9[var28];
                var23[var27] = arg11[var28];
                var24[var27] = arg12[var28];
                var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
                if (arg3 != null) {
                    var25[var27] = arg3[var30];
                }
                if (arg5 != null) {
                    var26[var27] = arg5[var30];
                }
                ++var27;
                var19[var27] = arg2[var31];
                var20[var27] = arg4[var31];
                var21[var27] = arg9[var28];
                var23[var27] = arg11[var28];
                var24[var27] = arg12[var28];
                var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
                if (arg3 != null) {
                    var25[var27] = arg3[var31];
                }
                if (arg5 != null) {
                    var26[var27] = arg5[var31];
                }
                ++var27;
            }
            this.method1503(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field2369[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2369[0] : field2369[2]) + ',' + (arg3 != null ? field2369[0] : field2369[2]) + ',' + (arg4 != null ? field2369[0] : field2369[2]) + ',' + (arg5 != null ? field2369[0] : field2369[2]) + ',' + (arg6 != null ? field2369[0] : field2369[2]) + ',' + (arg7 != null ? field2369[0] : field2369[2]) + ',' + (arg8 != null ? field2369[0] : field2369[2]) + ',' + (arg9 != null ? field2369[0] : field2369[2]) + ',' + (arg10 != null ? field2369[0] : field2369[2]) + ',' + (arg11 != null ? field2369[0] : field2369[2]) + ',' + (arg12 != null ? field2369[0] : field2369[2]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 942)
    public final void method1507(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field2332;
            if (this.field2343 != null && arg0 != null) {
                int var7 = -(this.field2334.field2913 * arg2 >> 8) + arg1 >> this.field2334.field2852;
                int var8 = -(this.field2334.field2995 * arg2 >> 8) + arg3 >> this.field2334.field2852;
                this.field2343.method5083(var7, var8, arg0, 77);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2369[14] + (arg0 != null ? field2369[0] : field2369[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZIIIII[[Z)V", line = 967)
    private final void method1508(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            if (this.field2365 != null) {
                int var9 = arg3 + arg3 - -1;
                int var10 = var9 * var9;
                if (~var10 < ~this.field2334.field3002.length) {
                    this.field2334.field3002 = new int[var10];
                }
                if (this.field2348 * 2 > this.field2334.field2994.field2209.length) {
                    this.field2334.field2994 = new class353(this.field2348 * 2);
                }
                int var11 = -arg3 + arg4;
                int var12 = var11;
                if (var11 < 0) {
                    var11 = 0;
                }
                int var13 = -arg3 + arg0;
                int var14 = var13;
                if (~var13 > -1) {
                    var13 = 0;
                }
                int var15 = arg3 + arg4;
                if (~(super.field4337 + -1) > ~var15) {
                    var15 = super.field4337 + -1;
                }
                int var16 = arg0 - -arg3;
                if (super.field4336 - 1 < var16) {
                    var16 = super.field4336 + -1;
                }
                int var17 = 0;
                int[] var18 = this.field2334.field3002;
                for (int var19 = var11; var15 >= var19; ++var19) {
                    boolean[] var20 = arg7[-var12 + var19];
                    for (int var21 = var13; var21 <= var16; ++var21) {
                        if (var20[-var14 + var21]) {
                            var18[var17++] = super.field4337 * var21 + var19;
                        }
                    }
                }
                if (~arg6 != 0) {
                    this.field2334.method1754((byte) -66, (float) arg6);
                    this.field2334.method1697(false);
                } else {
                    this.field2334.method1704((byte) -106);
                }
                this.field2334.method1706(70, ~(7 & this.field2323) != -1);
                for (int var22 = 0; ~var22 > ~this.field2365.length; ++var22) {
                    this.field2365[var22].method5210((byte) -68, var18, var17);
                }
                if (!this.field2349.method3873(49)) {
                    int var23 = this.field2334.field2971;
                    int var24 = this.field2334.field2905;
                    this.field2334.method584(0, var24, this.field2334.field2903);
                    this.field2334.method1706(-116, false);
                    this.field2334.method1680(false, -32);
                    this.field2334.method1743(-117, 128);
                    this.field2334.method1729((byte) -101, -2);
                    this.field2334.method1733(this.field2334.field2954, 17237);
                    this.field2334.method1684((byte) -61, 7681, 8448);
                    this.field2334.method1739(34166, 0, (byte) 19, 770);
                    this.field2334.method1683(770, 32888, 34167, 0);
                    for (class206 var25 = this.field2349.method3863((byte) 64); var25 != null; var25 = this.field2349.method3862(-353)) {
                        class775 var26 = (class775) var25;
                        var26.method5614(arg4, arg0, arg3, arg7, 119);
                    }
                    this.field2334.method1739(5890, 0, (byte) 19, 768);
                    this.field2334.method1683(770, 32888, 5890, 0);
                    this.field2334.method1733((class517) null, 17237);
                    this.field2334.method584(var23, var24, this.field2334.field2903);
                }
                if (this.field2343 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field2334.method1724((class602) null, this.field2356, 2916, (class602) null, this.field2363);
                    this.field2343.method5085(arg7, (byte) 20, arg1, arg4, arg3, arg0);
                    OpenGL.glPopMatrix();
                }
            }
            ++field2330;
            if (arg5 >= -63) {
                this.field2337 = -59;
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field2369[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2369[0] : field2369[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "ka", descriptor = "(III)V", line = 1113)
    public final void method1509(int arg0, int arg1, int arg2) {
        try {
            if (~arg2 < ~(255 & this.field2364[arg0][arg1])) {
                this.field2364[arg0][arg1] = (byte) arg2;
            }
            ++field2341;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2369[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)Z", line = 1123)
    public static final boolean method1510(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 <= 72) {
                method1510(-43, -10, (byte) 74);
            }
            ++field2340;
            return class91.method776(arg0, arg1, 8) & (class65.method464((byte) -96, arg1, arg0) | (arg0 & 8192) != 0 | class67.method609(arg0, 94, arg1));
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2369[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V", line = 1138)
    public static void method1511(int arg0) {
        try {
            field2327 = null;
            if (arg0 != 1492747011) {
                method1510(76, -48, (byte) 121);
            }
            field2335 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2369[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1155)
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            ++field2333;
            if (this.field2359 > 0) {
                this.field2334.method1685(-99);
                this.field2334.method1698(-108, false);
                this.field2334.method1706(38, false);
                this.field2334.method1681(false, true);
                this.field2334.method1680(false, -32);
                this.field2334.method1743(-83, 0);
                this.field2334.method1729((byte) -101, -2);
                this.field2334.method1733((class517) null, 17237);
                class243.field3728[11] = 0.0F;
                class243.field3728[15] = 1.0F;
                class243.field3728[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2334.field2742) + -1.0F;
                class243.field3728[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2334.field2687) + 1.0F;
                class243.field3728[9] = 0.0F;
                class243.field3728[1] = 0.0F;
                class243.field3728[10] = 0.0F;
                class243.field3728[6] = 0.0F;
                class243.field3728[2] = 0.0F;
                class243.field3728[5] = (float) arg2 / ((float) super.field4340 * 128.0F * (float) this.field2334.field2687);
                class243.field3728[7] = 0.0F;
                class243.field3728[14] = 0.0F;
                class243.field3728[4] = 0.0F;
                class243.field3728[8] = 0.0F;
                class243.field3728[3] = 0.0F;
                class243.field3728[0] = (float) arg2 / ((float) super.field4340 * 128.0F * (float) this.field2334.field2742);
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadMatrixf(class243.field3728, 0);
                class243.field3728[5] = 0.0F;
                class243.field3728[12] = 0.0F;
                class243.field3728[11] = 0.0F;
                class243.field3728[4] = 0.0F;
                class243.field3728[6] = 1.0F;
                class243.field3728[2] = 0.0F;
                class243.field3728[15] = 1.0F;
                class243.field3728[14] = 0.0F;
                class243.field3728[9] = 1.0F;
                class243.field3728[10] = 0.0F;
                class243.field3728[1] = 0.0F;
                class243.field3728[0] = 1.0F;
                class243.field3728[3] = 0.0F;
                class243.field3728[8] = 0.0F;
                class243.field3728[7] = 0.0F;
                class243.field3728[13] = 0.0F;
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadMatrixf(class243.field3728, 0);
                if (~(7 & this.field2323) != -1) {
                    this.field2334.method1706(-108, true);
                    this.field2334.method1738(false);
                } else {
                    this.field2334.method1706(109, false);
                }
                this.field2334.method1724(this.field2368, this.field2356, 2916, this.field2358, this.field2363);
                if (~(this.field2348 * 2) >= ~this.field2334.field2994.field2209.length) {
                    this.field2334.field2994.field2201 = 0;
                } else {
                    this.field2334.field2994 = new class353(this.field2348 * 2);
                }
                int var9 = 0;
                class353 var10 = this.field2334.field2994;
                if (!this.field2334.field2922) {
                    for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                        int var12 = super.field4337 * var11 + arg3;
                        for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                            if (arg7[var13 - arg3][-arg4 + var11]) {
                                short[] var14 = this.field2328[var12];
                                if (var14 != null) {
                                    for (int var15 = 0; var14.length > var15; ++var15) {
                                        var10.method1465(65535 & var14[var15], (byte) -114);
                                        ++var9;
                                    }
                                }
                            }
                            ++var12;
                        }
                    }
                } else {
                    for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                        int var17 = super.field4337 * var16 + arg3;
                        for (int var18 = arg3; arg5 > var18; ++var18) {
                            if (arg7[-arg3 + var18][-arg4 + var16]) {
                                short[] var19 = this.field2328[var17];
                                if (var19 != null) {
                                    for (int var20 = 0; var20 < var19.length; ++var20) {
                                        var10.method1406(65535 & var19[var20], 380332136);
                                        ++var9;
                                    }
                                }
                            }
                            ++var17;
                        }
                    }
                }
                if (var9 > 0) {
                    class628 var21 = new class628(this.field2334, 5123, var10.field2209, var10.field2201);
                    this.field2334.method1694(var21, 4, var9, 6056, 0);
                }
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field2369[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2369[0] : field2369[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZZI)V", line = 1324)
    public final void method1513(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        try {
            ++field2339;
            this.method1508(arg1, arg4, arg5, arg2, arg0, -124, -1, arg3);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2369[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2369[0] : field2369[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1332)
    public final void method1514(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field2350;
            if (this.field2343 != null && arg0 != null) {
                int var7 = -(this.field2334.field2913 * arg2 >> 8) + arg1 >> this.field2334.field2852;
                int var8 = -(this.field2334.field2995 * arg2 >> 8) + arg3 >> this.field2334.field2852;
                this.field2343.method5084(var7, arg0, 1, var8);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2369[5] + (arg0 != null ? field2369[0] : field2369[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZZII)V", line = 1350)
    public final void method1515(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        try {
            this.method1508(arg1, arg4, arg6, arg2, arg0, -69, arg5, arg3);
            ++field2352;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2369[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2369[0] : field2369[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)Z", line = 1365)
    public static final boolean method1516(int arg0, byte arg1, int arg2) {
        try {
            ++field2354;
            if (arg1 >= -31) {
                return true;
            } else {
                return ~(arg2 & 384) != -1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2369[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1517(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1518(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
