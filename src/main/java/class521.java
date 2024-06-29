import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class521 extends class402 {

    @OriginalMember(owner = "client!up", name = "l", descriptor = "F")
    private float field7333 = -3.4028235E38F;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "F")
    private float field7351 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "Lqia;")
    private class547 field7359 = new class547();

    @OriginalMember(owner = "client!up", name = "X", descriptor = "Lbm;")
    public class684 field7371;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    private int field7346;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    private int field7341;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "[[B")
    private byte[][] field7352;

    @OriginalMember(owner = "client!up", name = "db", descriptor = "[[F")
    private float[][] field7377;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!up", name = "ab", descriptor = "[[B")
    private byte[][] field7374;

    @OriginalMember(owner = "client!up", name = "V", descriptor = "[[[I")
    private int[][][] field7369;

    @OriginalMember(owner = "client!up", name = "fb", descriptor = "[[F")
    private float[][] field7379;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "[[[I")
    private int[][][] field7357;

    @OriginalMember(owner = "client!up", name = "gb", descriptor = "[[F")
    private float[][] field7380;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "[[[Lok;")
    private class243[][][] field7335;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "[[S")
    public short[][] field7338;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "[[[I")
    public int[][][] field7354;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "[[[I")
    public int[][][] field7334;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "[[[I")
    public int[][][] field7353;

    @OriginalMember(owner = "client!up", name = "bb", descriptor = "Lsga;")
    private class583 field7375;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "Ljga;")
    private class154 field7358;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public static int field7350 = -1;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field7342 = -1;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    private int field7361;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "I")
    private int field7367;

    @OriginalMember(owner = "client!up", name = "U", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!up", name = "W", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!up", name = "cb", descriptor = "I")
    private int field7376;

    @OriginalMember(owner = "client!up", name = "eb", descriptor = "I")
    private int field7378;

    @OriginalMember(owner = "client!up", name = "Z", descriptor = "Lu;")
    private class60 field7373;

    @OriginalMember(owner = "client!up", name = "hb", descriptor = "Lu;")
    private class60 field7381;

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "Lmia;")
    public class657 field7372;

    @OriginalMember(owner = "client!up", name = "ib", descriptor = "[Lok;")
    private class243[] field7382;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "[[[I")
    private int[][][] field7337;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III[[ZIIIZ)V")
    private final void method2992(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (this.field7382 != null) {
            int var9 = arg0 + 1 - -arg0;
            int var10 = var9 * var9;
            if (~var10 < ~class641.field8855.length) {
                class641.field8855 = new int[var10];
            }
            int var11 = -arg0 + arg6;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg0 + arg4;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg0 + arg6;
            if (~(super.field5569 + -1) > ~var15) {
                var15 = super.field5569 + -1;
            }
            int var16 = arg4 - -arg0;
            class576.field8041 = 0;
            if (var16 > super.field5562 + -1) {
                var16 = super.field5562 + -1;
            }
            for (int var17 = var11; var17 <= var15; ++var17) {
                boolean[] var24 = arg3[-var12 + var17];
                for (int var25 = var13; ~var25 >= ~var16; ++var25) {
                    if (var24[-var14 + var25]) {
                        class641.field8855[class576.field8041++] = super.field5569 * var25 + var17;
                    }
                }
            }
            if (arg5 == -1) {
                this.field7371.method3736((byte) 127);
            } else {
                this.field7371.method3724((float) arg5, 120);
                this.field7371.method3721(16);
            }
            this.field7371.method3726((byte) 101);
            this.field7371.method3745(~(this.field7349 & 7) != -1, 77);
            this.field7371.method3725(false, 71, -1, false);
            this.field7371.method1407(this.field7381, (byte) -89, 0);
            for (int var18 = 0; ~this.field7382.length < ~var18; ++var18) {
                this.field7382[var18].method1507((byte) 49, class641.field8855, class576.field8041);
            }
            class462 var19 = this.field7371.method3750((byte) 121);
            var19.method1963(0, -1, 0);
            this.field7371.method3744(false);
            if (!this.field7359.method3112(-4)) {
                int var20 = this.field7371.field9573;
                int var21 = this.field7371.field9586;
                this.field7371.method130(0, var21, this.field7371.field9653);
                this.field7371.method3745(false, 85);
                this.field7371.method3765(false, -32);
                this.field7371.method3737(3793, 128);
                this.field7371.method3725(false, 39, -2, false);
                this.field7371.method3711(false, this.field7371.field9593);
                this.field7371.method3708(88, class409.field5765, class155.field1901);
                this.field7371.method3777(false, 0, class663.field9083);
                this.field7371.method3713(class222.field2913, 0, (byte) 115);
                for (class627 var22 = this.field7359.method3111(101); var22 != null; var22 = this.field7359.method3116(arg2 + -142)) {
                    class345 var23 = (class345) var22;
                    var23.method2023((byte) 120, arg4, arg6, arg3, arg0);
                }
                this.field7371.method3777(false, 0, class632.field8774);
                this.field7371.method3713(class632.field8774, 0, (byte) -89);
                this.field7371.method3711(false, (class329) null);
                this.field7371.method130(var20, var21, this.field7371.field9653);
            }
            if (this.field7358 != null) {
                this.field7371.method1407(this.field7381, (byte) -87, 0);
                this.field7371.method1407(this.field7373, (byte) -121, 1);
                this.field7371.method1436(arg2 + 14490, this.field7372);
                this.field7358.method953(true, arg4, arg6, arg0, arg7, arg3);
            }
        }
        if (arg2 == 32) {
            ++field7360;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method552(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7365;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
        this.method545(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!up", name = "YA", descriptor = "()V")
    public final void method547() {
        ++field7368;
        if (this.field7376 <= 0) {
            this.field7358 = null;
        } else {
            byte[][] var1 = new byte[super.field5569 + 1][super.field5562 + 1];
            for (int var2 = 1; ~super.field5569 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field5562; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7374[var2][var107] >> 1) + (this.field7374[var2][var107 - -1] >> 3) + (this.field7374[var2][var107 + -1] >> 2) + (this.field7374[var2 + 1][var107] >> 3) + (this.field7374[var2 + -1][var107] >> 2));
                }
            }
            class243[] var3 = new class243[this.field7375.method3244((byte) 126)];
            this.field7375.method3250(var3, 0);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method1510(this.field7376, (byte) 122);
            }
            int var5 = 20;
            if (this.field7337 != null) {
                var5 += 4;
            }
            if (~(this.field7349 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7371.field9485.method2221(this.field7376 * 4, false);
            NativeHeapBuffer var7 = this.field7371.field9485.method2221(this.field7376 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class243[] var10 = new class243[this.field7376];
            int var11 = class568.method3199(false, this.field7376 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class583 var12 = new class583(var11);
            class243[] var13 = new class243[this.field7378];
            for (int var14 = 0; var14 < super.field5569; ++var14) {
                for (int var34 = 0; var34 < super.field5562; ++var34) {
                    if (this.field7354[var14][var34] != null) {
                        class243[] var35 = this.field7335[var14][var34];
                        int[] var36 = this.field7353[var14][var34];
                        int[] var37 = this.field7334[var14][var34];
                        int[] var38 = this.field7369[var14][var34];
                        int[] var39 = this.field7354[var14][var34];
                        int[] var40 = this.field7357 == null ? null : this.field7357[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7337 != null ? this.field7337[var14][var34] : null;
                        float var42 = this.field7380[var14][var34];
                        float var43 = this.field7377[var14][var34];
                        float var44 = this.field7379[var14][var34];
                        float var45 = this.field7380[var14][var34 + 1];
                        float var46 = this.field7377[var14][var34 + 1];
                        float var47 = this.field7379[var14][var34 - -1];
                        float var48 = this.field7380[var14 + 1][var34 + 1];
                        float var49 = this.field7377[var14 + 1][var34 + 1];
                        float var50 = this.field7379[var14 + 1][var34 + 1];
                        float var51 = this.field7380[var14 + 1][var34];
                        float var52 = this.field7377[var14 - -1][var34];
                        float var53 = this.field7379[var14 - -1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 - -1] & 255;
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label360: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class243 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7338[super.field5569 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field5570) - -var36[var61];
                            int var63 = (var34 << super.field5570) - -var37[var61];
                            int var64 = var62 >> this.field7346;
                            int var65 = var63 >> this.field7346;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            float var77;
                            int var78;
                            if (~var71 == -1 && var72 == 0) {
                                var75 = var42;
                                var76 = var43;
                                var77 = var44;
                                var78 = var73 - var54;
                            } else if (var71 == 0 && super.field5561 == var72) {
                                var77 = var47;
                                var75 = var45;
                                var78 = var73 - var55;
                                var76 = var46;
                            } else if (~super.field5561 == ~var71 && super.field5561 == var72) {
                                var78 = var73 - var56;
                                var75 = var48;
                                var77 = var50;
                                var76 = var49;
                            } else if (~super.field5561 == ~var71 && ~var72 == -1) {
                                var77 = var53;
                                var76 = var52;
                                var78 = var73 - var57;
                                var75 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field5561;
                                float var80 = (float) var72 / (float) super.field5561;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                var76 = (var85 - var82) * var80 + var82;
                                var75 = (-var81 + var84) * var80 + var81;
                                float var86 = (var50 - var47) * var79 + var47;
                                var77 = (var86 - var83) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field5570) + var54;
                                int var88 = var55 - -((-var55 + var56) * var71 >> super.field5570);
                                var78 = var73 - (((-var87 + var88) * var72 >> super.field5570) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if (~(this.field7349 & 7) == -1) {
                                    float var91 = this.field7371.field9585[2] * var77 + this.field7371.field9585[0] * var75 + this.field7371.field9585[1] * var76;
                                    var89 = this.field7371.field9651 + (var91 > 0.0F ? this.field7371.field9650 : this.field7371.field9628) * var91;
                                }
                                var74 = class198.field2542[var66 & 65408 | var90];
                            }
                            class627 var92 = null;
                            if (~(this.field7341 - 1 & var62) == -1 && ~(this.field7341 + -1 & var63) == -1) {
                                var92 = var12.method3248(var69, 0);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class397) var92).field5516;
                                var93 = var60[var61] & 65535;
                                if (var66 != -1 && ~var35[var61].field8746 > ~var10[var93].field8746) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (~var66 != ~var67) {
                                    int var94 = (127 & var67) * var78 >> 7;
                                    if (var94 < 2) {
                                        var94 = 2;
                                    } else if (var94 > 126) {
                                        var94 = 126;
                                    }
                                    var95 = class198.field2542[65408 & var67 | var94];
                                    if (~(this.field7349 & 7) == -1) {
                                        float var96 = this.field7371.field9585[2] * var77 + this.field7371.field9585[1] * var76 + this.field7371.field9585[0] * var75;
                                        float var97 = (!(var89 > 0.0F) ? this.field7371.field9628 : this.field7371.field9650) * var89 + this.field7371.field9651;
                                        int var98 = var95 >> 16 & 255;
                                        int var99 = var95 >> 8 & 255;
                                        int var100 = var95 & 255;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (var101 >= 0) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var95 = var101 << 16 | var102 << 8 | var103;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method2226()) {
                                    var8.method2237((float) var62);
                                    var8.method2237((float) (this.method2382((byte) 19, var63, var62) - -var68));
                                    var8.method2237((float) var63);
                                    var8.method2237((float) var62);
                                    var8.method2237((float) var63);
                                    if (this.field7337 != null) {
                                        var8.method2237((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field7349 & 7) != -1) {
                                        var8.method2237(var75);
                                        var8.method2237(var76);
                                        var8.method2237(var77);
                                    }
                                } else {
                                    var8.method2229((float) var62);
                                    var8.method2229((float) (this.method2382((byte) 19, var63, var62) - -var68));
                                    var8.method2229((float) var63);
                                    var8.method2229((float) var62);
                                    var8.method2229((float) var63);
                                    if (this.field7337 != null) {
                                        var8.method2229((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((this.field7349 & 7) != 0) {
                                        var8.method2229(var75);
                                        var8.method2229(var76);
                                        var8.method2229(var77);
                                    }
                                }
                                if (this.field7371.field9608 != 0) {
                                    var9.method2225(-16777216 | var95);
                                } else {
                                    var9.method2232(var95 | -16777216);
                                }
                                var93 = this.field7361++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method3249(var69, new class397(var60[var61]), (byte) -114);
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method1509(var93, var74, var78, 255, var89);
                            }
                            ++this.field7367;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field7361; ++var15) {
                class243 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1511(1, var15);
                }
            }
            for (int var16 = 0; super.field5569 > var16; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field5562; ++var22) {
                    short[] var23 = this.field7338[super.field5569 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = var23[var25++] & 65535;
                            class243 var29 = var10[var26];
                            class243 var30 = var10[var27];
                            class243 var31 = var10[var28];
                            class243 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1506(var16, var22, 131586, var24);
                            }
                            if (var30 != null) {
                                var30.method1506(var16, var22, 131586, var24);
                                if (var32 == null || ~var32.field8746 < ~var30.field8746) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1506(var16, var22, 131586, var24);
                                if (var32 == null || ~var32.field8746 < ~var31.field8746) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1511(1, var26);
                                }
                                if (var30 != null) {
                                    var32.method1511(1, var27);
                                }
                                if (var31 != null) {
                                    var32.method1511(1, var28);
                                }
                                var32.method1506(var16, var22, 131586, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2223();
            var9.method2223();
            this.field7373 = this.field7371.method1423(118, false);
            this.field7373.method473(8660, this.field7361 * 4, 4, var6);
            this.field7381 = this.field7371.method1423(107, false);
            this.field7381.method473(8660, this.field7361 * var5, var5, var7);
            if (~(7 & this.field7349) != -1) {
                if (this.field7337 != null) {
                    this.field7372 = this.field7371.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6353, class453.field6352, class453.field6349 }), new class734(class453.field6351) });
                } else {
                    this.field7372 = this.field7371.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6353, class453.field6349 }), new class734(class453.field6351) });
                }
            } else if (this.field7337 != null) {
                this.field7372 = this.field7371.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6353, class453.field6352 }), new class734(class453.field6351) });
            } else {
                this.field7372 = this.field7371.method1434(true, new class734[] { new class734(new class453[] { class453.field6343, class453.field6353 }), new class734(class453.field6351) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field3134 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7382 = new class243[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class243 var21 = var3[var20];
                var19[var20] = var21.field8746;
                this.field7382[var20] = var21;
                var21.method1512(this.field7361, 16129);
            }
            class250.method1523(this.field7382, var19, 1);
            if (this.field7358 != null) {
                this.field7358.method957(false);
            }
        }
        this.field7354 = null;
        this.field7375 = null;
        this.field7374 = null;
        this.field7380 = this.field7377 = this.field7379 = null;
        this.field7357 = null;
        this.field7337 = null;
        this.field7335 = null;
        this.field7353 = this.field7334 = null;
        this.field7369 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III[[ZZI)V")
    public final void method544(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2992(arg2, arg5, 32, arg3, arg1, -1, arg0, arg4);
        ++field7336;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;")
    public static final String method2993(String arg0, char arg1, String arg2, int arg3) {
        ++field7348;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = var5 + -1;
        if (~var7 != -1) {
            int var8 = 0;
            while (true) {
                var8 = arg2.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var6 += var7;
                ++var8;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = arg3;
        while (true) {
            int var11 = arg2.indexOf(arg1, var10);
            if (~var11 > -1) {
                var9.append(arg2.substring(var10));
                return var9.toString();
            }
            var9.append(arg2.substring(var10, var11));
            var9.append(arg0);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!up", name = "fa", descriptor = "(IILr;)Lr;")
    public final class108 method553(int arg0, int arg1, class108 arg2) {
        ++field7347;
        if ((this.field7352[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field5561 >> this.field7371.field9570;
            class162 var5 = (class162) arg2;
            class162 var6;
            if (var5 != null && var5.method1003(var4, var4, 0)) {
                var6 = var5;
                var5.method1005(27474);
            } else {
                var6 = new class162(this.field7371, var4, var4);
            }
            var6.method998(0, var4, 0, 0, var4);
            this.method2995(arg1, arg0, (byte) -72, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
    public final void method549(int arg0, int arg1) {
        ++field7363;
    }

    @OriginalMember(owner = "client!up", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method545(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7345;
        class96 var15 = this.field7371.field6364;
        if (arg5 != null && this.field7337 == null) {
            this.field7337 = new int[super.field5569][super.field5562][];
        }
        if (arg3 != null && this.field7357 == null) {
            this.field7357 = new int[super.field5569][super.field5562][];
        }
        this.field7353[arg0][arg1] = arg2;
        this.field7334[arg0][arg1] = arg4;
        this.field7354[arg0][arg1] = arg6;
        this.field7369[arg0][arg1] = arg7;
        if (this.field7337 != null) {
            this.field7337[arg0][arg1] = arg5;
        }
        if (this.field7357 != null) {
            this.field7357[arg0][arg1] = arg3;
        }
        class243[] var16 = this.field7335[arg0][arg1] = new class243[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field7349 & 32) != 0 && ~var18 != 0 && var15.method389(9559, var18).field1167) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class627 var22;
            for (var22 = this.field7375.method3248(var20, 0); var22 != null; var22 = this.field7375.method3246((byte) 60)) {
                class243 var23 = (class243) var22;
                if (~var23.field3127 == ~var18 && (float) var19 == var23.field3130 && var23.field3118 == arg10 && ~var23.field3132 == ~arg11 && var23.field3116 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class243) var22;
            } else {
                var16[var17] = new class243(this, var18, var19, arg10, arg11, arg12);
                this.field7375.method3249(var20, var16[var17], (byte) -90);
            }
        }
        if (arg13) {
            this.field7352[arg0][arg1] = (byte) class216.method1308(this.field7352[arg0][arg1], 1);
        }
        if (arg6.length > this.field7378) {
            this.field7378 = arg6.length;
        }
        this.field7376 += arg6.length;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lbm;IIII[[I[[II)V")
    public class521(class684 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7371 = arg0;
        this.field7346 = super.field5570 + -2;
        this.field7341 = 1 << this.field7346;
        this.field7352 = new byte[arg3][arg4];
        this.field7377 = new float[super.field5569 + 1][super.field5562 - -1];
        this.field7349 = arg2;
        this.field7374 = new byte[arg3 - -1][arg4 + 1];
        this.field7369 = new int[arg3][arg4][];
        this.field7379 = new float[super.field5569 + 1][super.field5562 + 1];
        this.field7357 = new int[arg3][arg4][];
        this.field7380 = new float[super.field5569 - -1][super.field5562 - -1];
        this.field7335 = new class243[arg3][arg4][];
        this.field7338 = new short[arg3 * arg4][];
        this.field7354 = new int[arg3][arg4][];
        this.field7334 = new int[arg3][arg4][];
        this.field7353 = new int[arg3][arg4][];
        for (int var9 = 0; super.field5562 >= var9; ++var9) {
            for (int var10 = 0; super.field5569 >= var10; ++var10) {
                int var11 = super.field5565[var10][var9];
                if (this.field7333 < (float) var11) {
                    this.field7333 = (float) var11;
                }
                if (this.field7351 > (float) var11) {
                    this.field7351 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && super.field5569 > var10 && ~super.field5562 < ~var9) {
                    int var12 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
                    this.field7380[var10][var9] = (float) var12 * var14;
                    this.field7377[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7379[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field7351;
        ++this.field7333;
        this.field7375 = new class583(128);
        if (~(this.field7349 & 16) != -1) {
            this.field7358 = new class154(this.field7371, this);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method546(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7356;
        if (this.field7358 != null && arg0 != null) {
            int var7 = -(this.field7371.field9601 * arg2 >> 8) + arg1 >> this.field7371.field9570;
            int var8 = -(this.field7371.field9556 * arg2 >> 8) + arg3 >> this.field7371.field9570;
            return this.field7358.method961(arg0, var8, -20, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static final void method2994(int arg0) {
        ++field7355;
        if (class691.field9807 != null) {
            class691.field9807 = null;
            int var1 = -88 % ((63 - arg0) / 54);
            class266.method1600(class713.field10038, class475.field6798, class200.field2558, class471.field6767, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7343;
        if (this.field7376 > 0) {
            class246 var9 = this.field7371.method3712(this.field7367, (byte) 119);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1518((byte) 108, true);
                if (var14 != null) {
                    Stream var15 = this.field7371.method3772(var14, 4);
                    if (!Stream.method2226()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field5569 * var16 - -arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field7338[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            var15.method2224(var21);
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field5569 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7338[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            var15.method2233(var29);
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            if (var11 > var29) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2223();
                    if (var9.method1517((byte) 117)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field7371.method3759((byte) 66);
                this.field7371.method3730((byte) -25, false);
                this.field7371.method3745(false, 125);
                this.field7371.method3720(0, false);
                this.field7371.method3765(false, -32);
                this.field7371.method3737(3793, 0);
                this.field7371.method3725(false, 59, -2, false);
                this.field7371.method3711(false, (class329) null);
                class462 var23 = this.field7371.method3750((byte) -45);
                float[] var24 = this.field7371.method3732((byte) -124);
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7371.field9502) + -1.0F;
                var24[14] = -this.field7351 / (this.field7333 - this.field7351);
                var24[6] = 0.0F;
                var24[7] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7371.field9506) + 1.0F;
                var24[10] = 1.0F / (this.field7333 - this.field7351);
                var24[9] = 0.0F;
                var24[15] = 1.0F;
                var24[5] = (float) arg2 / ((float) super.field5561 * 128.0F * (float) this.field7371.field9506);
                var24[8] = 0.0F;
                var24[4] = 0.0F;
                var24[11] = 0.0F;
                var24[1] = 0.0F;
                var24[3] = 0.0F;
                var24[2] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field5561 * 128.0F * (float) this.field7371.field9502);
                var23.method2741(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
                this.field7371.method3757(true);
                this.field7371.method3744(false);
                if ((this.field7349 & 7) != 0) {
                    this.field7371.method3745(true, 111);
                    this.field7371.method1392(256);
                } else {
                    this.field7371.method3745(false, 116);
                }
                this.field7371.method1397((byte) 123, false);
                this.field7371.method1407(this.field7381, (byte) 88, 0);
                this.field7371.method1407(this.field7373, (byte) -106, 1);
                this.field7371.method1436(14522, this.field7372);
                this.field7371.method1415(var11, class260.field3301, (byte) -77, 0, var10 / 3, var9, -var11 + var12 + 1);
                this.field7371.method1397((byte) 126, true);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(III[[ZZII)V")
    public final void method550(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method2992(arg2, arg6, 32, arg3, arg1, arg5, arg0, arg4);
        ++field7339;
    }

    @OriginalMember(owner = "client!up", name = "ka", descriptor = "(III)V")
    public final void method540(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field7374[arg0][arg1] & 255)) {
            this.field7374[arg0][arg1] = (byte) arg2;
        }
        ++field7344;
    }

    @OriginalMember(owner = "client!up", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method551(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7362;
        if (this.field7358 != null && arg0 != null) {
            int var7 = -(this.field7371.field9601 * arg2 >> 8) + arg1 >> this.field7371.field9570;
            int var8 = -(this.field7371.field9556 * arg2 >> 8) + arg3 >> this.field7371.field9570;
            this.field7358.method958(var8, (byte) 106, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lpk;[I)V")
    public final void method539(class621 arg0, int[] arg1) {
        this.field7359.method3110(new class345(this.field7371, this, arg0, arg1), 1);
        ++field7366;
    }

    @OriginalMember(owner = "client!up", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method548(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7370;
        if (this.field7358 != null && arg0 != null) {
            int var7 = -(this.field7371.field9601 * arg2 >> 8) + arg1 >> this.field7371.field9570;
            int var8 = -(this.field7371.field9556 * arg2 >> 8) + arg3 >> this.field7371.field9570;
            this.field7358.method956(false, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBLhj;)V")
    private final void method2995(int arg0, int arg1, byte arg2, class162 arg3) {
        ++field7364;
        int[] var5 = this.field7353[arg1][arg0];
        int[] var6 = this.field7334[arg1][arg0];
        int var7 = var5.length;
        if (~class183.field2392.length > ~var7) {
            class553.field7771 = new int[var7];
            class183.field2392 = new int[var7];
        }
        int var8 = 0;
        if (arg2 != -72) {
            this.method548((class108) null, -123, -36, -35, -52, true);
        }
        while (var8 < var7) {
            class183.field2392[var8] = var5[var8] >> this.field7371.field9570;
            class553.field7771[var8] = var6[var8] >> this.field7371.field9570;
            ++var8;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class183.field2392[var9];
            int var11 = class553.field7771[var9++];
            int var12 = class183.field2392[var9];
            int var13 = class553.field7771[var9++];
            int var14 = class183.field2392[var9];
            int var15 = class553.field7771[var9++];
            if ((var13 - var15) * (-var12 + var10) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                arg3.method999(var14, var11, var12, var13, var15, false, var10);
            }
        }
    }
}
