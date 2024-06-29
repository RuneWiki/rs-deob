import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class157 extends class292 {

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "F")
    private float field2309 = -3.4028235E38F;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "F")
    private float field2337 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "Lga;")
    private class420 field2339 = new class420();

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Lwk;")
    public class151 field2323;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "[[[I")
    public int[][][] field2326;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "[[[I")
    private int[][][] field2340;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "[[[I")
    private int[][][] field2338;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "[[F")
    private float[][] field2346;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "[[F")
    private float[][] field2351;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "[[F")
    private float[][] field2352;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "[[B")
    private byte[][] field2347;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "[[S")
    public short[][] field2334;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "[[B")
    private byte[][] field2330;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "[[[I")
    public int[][][] field2325;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "[[[Leaa;")
    private class524[][][] field2335;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[[[I")
    public int[][][] field2320;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "Ltga;")
    private class64 field2354;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "Lht;")
    private class605 field2321;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2308 = 2;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field2327 = -1;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "Lga;")
    public static class420 field2329 = new class420();

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    private int field2353;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "Lkf;")
    public static class263 field2343;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "Lbw;")
    public class715 field2349;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "Lfka;")
    private class741 field2350;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lfka;")
    private class741 field2356;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "[Leaa;")
    private class524[] field2355;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "[[[I")
    private int[][][] field2319;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lwk;IIII[[I[[II)V")
    public class157(class151 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2323 = arg0;
        this.field2345 = super.field4428 - 2;
        this.field2312 = arg2;
        this.field2326 = new int[arg3][arg4][];
        this.field2340 = new int[arg3][arg4][];
        this.field2338 = new int[arg3][arg4][];
        this.field2346 = new float[super.field4420 + 1][super.field4425 - -1];
        this.field2313 = 1 << this.field2345;
        this.field2351 = new float[super.field4420 + 1][super.field4425 + 1];
        this.field2352 = new float[super.field4420 + 1][super.field4425 + 1];
        this.field2347 = new byte[arg3 + 1][arg4 - -1];
        this.field2334 = new short[arg3 * arg4][];
        this.field2330 = new byte[arg3][arg4];
        this.field2325 = new int[arg3][arg4][];
        this.field2335 = new class524[arg3][arg4][];
        this.field2320 = new int[arg3][arg4][];
        for (int var9 = 0; ~var9 >= ~super.field4425; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field4420; ++var10) {
                int var11 = super.field4424[var10][var9];
                if (this.field2337 > (float) var11) {
                    this.field2337 = (float) var11;
                }
                if ((float) var11 > this.field2309) {
                    this.field2309 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && super.field4420 > var10 && ~var9 > ~super.field4425) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
                    this.field2352[var10][var9] = (float) var12 * var14;
                    this.field2351[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field2346[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field2337;
        ++this.field2309;
        this.field2354 = new class64(128);
        if (~(this.field2312 & 16) != -1) {
            this.field2321 = new class605(this.field2323, this);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static void method1236(int arg0) {
        if (arg0 != -16490) {
            field2327 = -77;
        }
        field2343 = null;
        field2329 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    public final void method1237(int arg0, int arg1) {
        ++field2331;
    }

    @OriginalMember(owner = "client!mg", name = "YA", descriptor = "()V")
    public final void method1238() {
        if (~this.field2353 < -1) {
            byte[][] var1 = new byte[super.field4420 + 1][super.field4425 + 1];
            for (int var2 = 1; var2 < super.field4420; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field4425; ++var107) {
                    var1[var2][var107] = (byte) ((this.field2347[var2][var107 - -1] >> 3) + (this.field2347[var2][var107 - 1] >> 2) + (this.field2347[var2 + 1][var107] >> 3) + (this.field2347[var2 + -1][var107] >> 2) + (this.field2347[var2][var107] >> 1));
                }
            }
            class524[] var3 = new class524[this.field2354.method381(65)];
            this.field2354.method385(0, var3);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method3049(-41, this.field2353);
            }
            int var5 = 20;
            if (this.field2319 != null) {
                var5 += 4;
            }
            if (~(7 & this.field2312) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field2323.field2040.method3946(this.field2353 * 4, false);
            NativeHeapBuffer var7 = this.field2323.field2040.method3946(this.field2353 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class524[] var10 = new class524[this.field2353];
            int var11 = class377.method2330((byte) 48, this.field2353 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class64 var12 = new class64(var11);
            class524[] var13 = new class524[this.field2348];
            for (int var14 = 0; ~var14 > ~super.field4420; ++var14) {
                for (int var34 = 0; super.field4425 > var34; ++var34) {
                    if (this.field2320[var14][var34] != null) {
                        class524[] var35 = this.field2335[var14][var34];
                        int[] var36 = this.field2325[var14][var34];
                        int[] var37 = this.field2326[var14][var34];
                        int[] var38 = this.field2340[var14][var34];
                        int[] var39 = this.field2320[var14][var34];
                        int[] var40 = this.field2338 != null ? this.field2338[var14][var34] : null;
                        int[] var41 = this.field2319 != null ? this.field2319[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field2352[var14][var34];
                        float var43 = this.field2351[var14][var34];
                        float var44 = this.field2346[var14][var34];
                        float var45 = this.field2352[var14][var34 + 1];
                        float var46 = this.field2351[var14][var34 + 1];
                        float var47 = this.field2346[var14][var34 + 1];
                        float var48 = this.field2352[var14 + 1][var34 + 1];
                        float var49 = this.field2351[var14 - -1][var34 - -1];
                        float var50 = this.field2346[var14 - -1][var34 + 1];
                        float var51 = this.field2352[var14 + 1][var34];
                        float var52 = this.field2351[var14 - -1][var34];
                        float var53 = this.field2346[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 - -1][var34 + 1];
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label362: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class524 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label362;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field2334[super.field4420 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field4428) - -var36[var61];
                            int var63 = (var34 << super.field4428) + var37[var61];
                            int var64 = var62 >> this.field2345;
                            int var65 = var63 >> this.field2345;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32 | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (var71 == 0 && ~var72 == -1) {
                                var76 = var42;
                                var77 = var73 - var54;
                                var78 = var44;
                                var79 = var43;
                            } else if (~var71 == -1 && ~super.field4419 == ~var72) {
                                var79 = var46;
                                var77 = var73 - var55;
                                var76 = var45;
                                var78 = var47;
                            } else if (~super.field4419 == ~var71 && ~super.field4419 == ~var72) {
                                var78 = var50;
                                var77 = var73 - var56;
                                var79 = var49;
                                var76 = var48;
                            } else if (~super.field4419 == ~var71 && ~var72 == -1) {
                                var78 = var53;
                                var77 = var73 - var57;
                                var79 = var52;
                                var76 = var51;
                            } else {
                                float var80 = (float) var71 / (float) super.field4419;
                                float var81 = (float) var72 / (float) super.field4419;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (var53 - var44) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var76 = (var85 - var82) * var81 + var82;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var79 = (-var83 + var86) * var81 + var83;
                                var78 = (var87 - var84) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field4428) + var54;
                                int var89 = var55 - -((-var55 + var56) * var71 >> super.field4428);
                                var77 = var73 - (((-var88 + var89) * var72 >> super.field4428) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var77 >> 7;
                                if (var90 >= 2) {
                                    if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if (~(this.field2312 & 7) == -1) {
                                    float var91 = this.field2323.field2172[2] * var78 + this.field2323.field2172[1] * var79 + this.field2323.field2172[0] * var76;
                                    var75 = this.field2323.field2191 + var91 * (!(var91 > 0.0F) ? this.field2323.field2188 : this.field2323.field2217);
                                }
                                var74 = class444.field6323[var90 | var66 & 65408];
                            }
                            class540 var92 = null;
                            if (~(this.field2313 + -1 & var62) == -1 && ~(this.field2313 - 1 & var63) == -1) {
                                var92 = var12.method380((byte) -3, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class13) var92).field253;
                                var93 = 65535 & var60[var61];
                                if (~var66 != 0 && ~var35[var61].field7577 > ~var10[var93].field7577) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (~var66 != ~var67) {
                                    int var94 = (var67 & 127) * var77 >> 7;
                                    if (var94 >= 2) {
                                        if (var94 > 126) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var95 = class444.field6323[var94 | 65408 & var67];
                                    if (~(this.field2312 & 7) == -1) {
                                        float var96 = this.field2323.field2172[2] * var78 + this.field2323.field2172[1] * var79 + this.field2323.field2172[0] * var76;
                                        float var97 = this.field2323.field2191 + var75 * (var75 > 0.0F ? this.field2323.field2217 : this.field2323.field2188);
                                        int var98 = var95 >> 16 & 255;
                                        int var99 = (65481 & var95) >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = var95 & 255;
                                        if (var100 >= 0) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        int var103 = (int) ((float) var101 * var97);
                                        if (var102 >= 0) {
                                            if (~var102 < -256) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var95 = var103 | var100 << 16 | var102 << 8;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method3956()) {
                                    var8.method3949((float) var62);
                                    var8.method3949((float) (this.method1977((byte) -11, var62, var63) - -var68));
                                    var8.method3949((float) var63);
                                    var8.method3949((float) var62);
                                    var8.method3949((float) var63);
                                    if (this.field2319 != null) {
                                        var8.method3949((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((this.field2312 & 7) != 0) {
                                        var8.method3949(var76);
                                        var8.method3949(var79);
                                        var8.method3949(var78);
                                    }
                                } else {
                                    var8.method3955((float) var62);
                                    var8.method3955((float) (var68 + this.method1977((byte) 114, var62, var63)));
                                    var8.method3955((float) var63);
                                    var8.method3955((float) var62);
                                    var8.method3955((float) var63);
                                    if (this.field2319 != null) {
                                        var8.method3955((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((7 & this.field2312) != 0) {
                                        var8.method3955(var76);
                                        var8.method3955(var79);
                                        var8.method3955(var78);
                                    }
                                }
                                if (this.field2323.field2134 == 0) {
                                    var9.method3948(-16777216 | var95);
                                } else {
                                    var9.method3957(var95 | -16777216);
                                }
                                var93 = this.field2311++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method384(var69, new class13(var60[var61]), false);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method3046(var93, (byte) -51, var77, var74, var75);
                            }
                            ++this.field2316;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field2311; ++var15) {
                class524 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3050(var15, 3);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field4420; ++var16) {
                for (int var22 = 0; super.field4425 > var22; ++var22) {
                    short[] var23 = this.field2334[super.field4420 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class524 var29 = var10[var26];
                            class524 var30 = var10[var27];
                            class524 var31 = var10[var28];
                            class524 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method3051(var24, false, var22, var16);
                            }
                            if (var30 != null) {
                                var30.method3051(var24, false, var22, var16);
                                if (var32 == null || ~var32.field7577 < ~var30.field7577) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3051(var24, false, var22, var16);
                                if (var32 == null || var32.field7577 > var31.field7577) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3050(var26, 3);
                                }
                                if (var30 != null) {
                                    var32.method3050(var27, 3);
                                }
                                if (var31 != null) {
                                    var32.method3050(var28, 3);
                                }
                                var32.method3051(var24, false, var22, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3959();
            var9.method3959();
            this.field2356 = this.field2323.method1139(6, false);
            this.field2356.method3455(4, 6838, this.field2311 * 4, var6);
            this.field2350 = this.field2323.method1139(6, false);
            this.field2350.method3455(var5, 6838, this.field2311 * var5, var7);
            if (~(this.field2312 & 7) != -1) {
                if (this.field2319 == null) {
                    this.field2349 = this.field2323.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9194, class652.field9191 }), new class491(class652.field9192) });
                } else {
                    this.field2349 = this.field2323.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9194, class652.field9193, class652.field9191 }), new class491(class652.field9192) });
                }
            } else if (this.field2319 != null) {
                this.field2349 = this.field2323.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9194, class652.field9193 }), new class491(class652.field9192) });
            } else {
                this.field2349 = this.field2323.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9194 }), new class491(class652.field9192) });
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field7478 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field2355 = new class524[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class524 var21 = var3[var20];
                var19[var20] = var21.field7577;
                this.field2355[var20] = var21;
                var21.method3055(this.field2311, true);
            }
            class739.method4142(this.field2355, var19, -1);
            if (this.field2321 != null) {
                this.field2321.method3490(false);
            }
        } else {
            this.field2321 = null;
        }
        ++field2322;
        this.field2340 = null;
        this.field2354 = null;
        this.field2347 = null;
        this.field2325 = this.field2326 = null;
        this.field2352 = this.field2351 = this.field2346 = null;
        this.field2335 = null;
        this.field2319 = null;
        this.field2338 = null;
        this.field2320 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1239(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2310;
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1241(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1240(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2314;
        if (this.field2321 != null && arg0 != null) {
            int var7 = arg1 - (this.field2323.field2140 * arg2 >> 8) >> this.field2323.field2162;
            int var8 = -(this.field2323.field2151 * arg2 >> 8) + arg3 >> this.field2323.field2162;
            return this.field2321.method3492(var7, (byte) 78, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1241(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2344;
        class159 var15 = this.field2323.field883;
        if (arg5 != null && this.field2319 == null) {
            this.field2319 = new int[super.field4420][super.field4425][];
        }
        if (arg3 != null && this.field2338 == null) {
            this.field2338 = new int[super.field4420][super.field4425][];
        }
        this.field2325[arg0][arg1] = arg2;
        this.field2326[arg0][arg1] = arg4;
        this.field2320[arg0][arg1] = arg6;
        this.field2340[arg0][arg1] = arg7;
        if (this.field2319 != null) {
            this.field2319[arg0][arg1] = arg5;
        }
        if (this.field2338 != null) {
            this.field2338[arg0][arg1] = arg3;
        }
        class524[] var16 = this.field2335[arg0][arg1] = new class524[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field2312 & 32) != 0 && ~var18 != 0 && var15.method1263(var18, (byte) 116).field2744) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) var18;
            class540 var22;
            for (var22 = this.field2354.method380((byte) -3, var20); var22 != null; var22 = this.field2354.method383(-1)) {
                class524 var23 = (class524) var22;
                if (~var23.field7469 == ~var18 && (float) var19 == var23.field7472 && var23.field7474 == arg10 && var23.field7460 == arg11 && var23.field7471 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class524) var22;
            } else {
                var16[var17] = new class524(this, var18, var19, arg10, arg11, arg12);
                this.field2354.method384(var20, var16[var17], false);
            }
        }
        if (arg13) {
            this.field2330[arg0][arg1] = (byte) class281.method1904(this.field2330[arg0][arg1], 1);
        }
        if (~this.field2348 > ~arg6.length) {
            this.field2348 = arg6.length;
        }
        this.field2353 += arg6.length;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILgg;II)V")
    private final void method1242(int arg0, class184 arg1, int arg2, int arg3) {
        ++field2333;
        int[] var5 = this.field2325[arg2][arg0];
        int[] var6 = this.field2326[arg2][arg0];
        int var7 = var5.length;
        if (var7 > class140.field1810.length) {
            class182.field2766 = new int[var7];
            class140.field1810 = new int[var7];
        }
        if (arg3 > 28) {
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                class140.field1810[var8] = var5[var8] >> this.field2323.field2162;
                class182.field2766[var8] = var6[var8] >> this.field2323.field2162;
            }
            int var9 = 0;
            while (~var9 > ~var7) {
                int var10 = class140.field1810[var9];
                int var11 = class182.field2766[var9++];
                int var12 = class140.field1810[var9];
                int var13 = class182.field2766[var9++];
                int var14 = class140.field1810[var9];
                int var15 = class182.field2766[var9++];
                if ((var10 - var12) * (-var15 + var13) + -((var13 - var11) * (-var12 + var14)) > 0) {
                    arg1.method1374(var15, 49, var12, var13, var11, var14, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1243(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1246(arg3, -1, arg5, arg2, arg0, (byte) -125, arg4, arg1);
        ++field2341;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2342;
        if (~this.field2353 < -1) {
            class532 var9 = this.field2323.method1153(this.field2316, 2);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method48((byte) -31, true);
                if (var14 != null) {
                    Stream var15 = this.field2323.method1127(-117, var14);
                    if (Stream.method3956()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field4420 * var16 + arg3;
                            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field2334[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            var15.method3950(var21);
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field4420 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field2334[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            var15.method3962(var29);
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3959();
                    if (var9.method49(-11488)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field2323.method1121(-1);
                this.field2323.method1146(false, 4);
                this.field2323.method1054(false, -8);
                this.field2323.method1128(true, false);
                this.field2323.method1171((byte) -128, false);
                this.field2323.method1087((byte) -110, 0);
                this.field2323.method1078(false, false, true, -2);
                this.field2323.method1104(true, (class749) null);
                class468 var23 = this.field2323.method1115((byte) -99);
                float[] var24 = this.field2323.method1101((byte) -122);
                var24[6] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field4419 * 128.0F * (float) this.field2323.field1956);
                var24[3] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2323.field1956;
                var24[5] = (float) arg2 / ((float) super.field4419 * 128.0F * (float) this.field2323.field1995);
                var24[10] = 1.0F / (-this.field2337 + this.field2309);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2323.field1995;
                var24[11] = 0.0F;
                var24[4] = 0.0F;
                var24[2] = 0.0F;
                var24[9] = 0.0F;
                var24[14] = -this.field2337 / (this.field2309 - this.field2337);
                var24[7] = 0.0F;
                var24[8] = 0.0F;
                var24[15] = 1.0F;
                var24[1] = 0.0F;
                var23.method2780(1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 124, 0.0F);
                this.field2323.method1123(7);
                this.field2323.method1122((byte) 103);
                if ((7 & this.field2312) == 0) {
                    this.field2323.method1054(false, -8);
                } else {
                    this.field2323.method1054(true, -8);
                    this.field2323.method1092(83);
                }
                this.field2323.method1089((byte) 95, false);
                this.field2323.method1091((byte) 125, 0, this.field2350);
                this.field2323.method1091((byte) 73, 1, this.field2356);
                this.field2323.method1099(66, this.field2349);
                this.field2323.method1133(class415.field5856, var11, var9, 0, -var11 + var12 - -1, var10 / 3, 6);
                this.field2323.method1089((byte) 95, true);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "ka", descriptor = "(III)V")
    public final void method1245(int arg0, int arg1, int arg2) {
        ++field2324;
        if (~(255 & this.field2347[arg0][arg1]) > ~arg2) {
            this.field2347[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([[ZIIIIBZI)V")
    private final void method1246(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7) {
        ++field2328;
        if (this.field2355 != null) {
            int var9 = arg3 - -arg3 + 1;
            int var10 = var9 * var9;
            if (~var10 < ~class770.field10621.length) {
                class770.field10621 = new int[var10];
            }
            int var11 = arg4 - arg3;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg3 + arg7;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg3 + arg4;
            if (super.field4420 + -1 < var15) {
                var15 = super.field4420 - 1;
            }
            int var16 = arg7 - -arg3;
            class351.field5118 = 0;
            if (super.field4425 + -1 < var16) {
                var16 = super.field4425 + -1;
            }
            for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                boolean[] var24 = arg0[-var12 + var17];
                for (int var25 = var13; var25 <= var16; ++var25) {
                    if (var24[-var14 + var25]) {
                        class770.field10621[class351.field5118++] = super.field4420 * var25 + var17;
                    }
                }
            }
            if (arg1 != -1) {
                this.field2323.method1120(16, (float) arg1);
                this.field2323.method1113(16);
            } else {
                this.field2323.method1131((byte) 38);
            }
            this.field2323.method1079(0);
            this.field2323.method1054((this.field2312 & 7) != 0, -8);
            this.field2323.method1078(false, false, true, -1);
            this.field2323.method1091((byte) 123, 0, this.field2350);
            for (int var18 = 0; var18 < this.field2355.length; ++var18) {
                this.field2355[var18].method3047(class351.field5118, (byte) 55, class770.field10621);
            }
            class468 var19 = this.field2323.method1115((byte) -99);
            var19.method1959(0, -1, 0);
            this.field2323.method1122((byte) -15);
            if (!this.field2339.method2513((byte) 88)) {
                int var20 = this.field2323.field2180;
                int var21 = this.field2323.field2201;
                this.field2323.method435(0, var21, this.field2323.field2157);
                this.field2323.method1054(false, -8);
                this.field2323.method1171((byte) -100, false);
                this.field2323.method1087((byte) -103, 128);
                this.field2323.method1078(false, false, true, -2);
                this.field2323.method1104(true, this.field2323.field2200);
                this.field2323.method1136((byte) -93, class174.field2460, class438.field6278);
                this.field2323.method1056(32, class490.field6966, 0);
                this.field2323.method1157(1, 0, class492.field6991);
                for (class540 var22 = this.field2339.method2508((byte) -85); var22 != null; var22 = this.field2339.method2505((byte) -55)) {
                    class568 var23 = (class568) var22;
                    var23.method3302(arg4, arg0, arg7, (byte) 113, arg3);
                }
                this.field2323.method1056(32, class412.field5814, 0);
                this.field2323.method1157(1, 0, class412.field5814);
                this.field2323.method1104(true, (class749) null);
                this.field2323.method435(var20, var21, this.field2323.field2157);
            }
            if (this.field2321 != null) {
                this.field2323.method1091((byte) 68, 0, this.field2350);
                this.field2323.method1091((byte) 112, 1, this.field2356);
                this.field2323.method1099(103, this.field2349);
                this.field2321.method3489(arg6, arg7, arg4, arg0, false, arg3);
            }
        }
        if (arg5 > -124) {
            this.field2312 = 97;
        }
    }

    @OriginalMember(owner = "client!mg", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1247(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2332;
        if (this.field2321 != null && arg0 != null) {
            int var7 = -(this.field2323.field2140 * arg2 >> 8) + arg1 >> this.field2323.field2162;
            int var8 = arg3 - (this.field2323.field2151 * arg2 >> 8) >> this.field2323.field2162;
            this.field2321.method3493((byte) -70, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljw;[I)V")
    public final void method1248(class578 arg0, int[] arg1) {
        ++field2336;
        this.field2339.method2510(new class568(this.field2323, this, arg0, arg1), false);
    }

    @OriginalMember(owner = "client!mg", name = "fa", descriptor = "(IILr;)Lr;")
    public final class192 method1249(int arg0, int arg1, class192 arg2) {
        ++field2317;
        if (~(this.field2330[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4419 >> this.field2323.field2162;
            class184 var5 = (class184) arg2;
            class184 var6;
            if (var5 != null && var5.method1373((byte) 124, var4, var4)) {
                var6 = var5;
                var5.method1369((byte) 121);
            } else {
                var6 = new class184(this.field2323, var4, var4);
            }
            var6.method1372(0, var4, 120, var4, 0);
            this.method1242(arg1, var6, arg0, 82);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1250(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field2315;
        this.method1246(arg3, arg5, arg6, arg2, arg0, (byte) -125, arg4, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1251(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2318;
        if (this.field2321 != null && arg0 != null) {
            int var7 = arg1 - (this.field2323.field2140 * arg2 >> 8) >> this.field2323.field2162;
            int var8 = -(this.field2323.field2151 * arg2 >> 8) + arg3 >> this.field2323.field2162;
            this.field2321.method3491(var7, 1, var8, arg0);
        }
    }
}
