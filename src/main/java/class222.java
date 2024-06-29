import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class222 extends class418 {

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "Lv;")
    private class165 field3050 = new class165();

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "Lpq;")
    public class194 field3044;

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "[[[I")
    public int[][][] field3049;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!bda", name = "Q", descriptor = "[[F")
    private float[][] field3066;

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "[[[I")
    private int[][][] field3059;

    @OriginalMember(owner = "client!bda", name = "W", descriptor = "[[F")
    private float[][] field3072;

    @OriginalMember(owner = "client!bda", name = "gb", descriptor = "[[B")
    private byte[][] field3082;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "[[[I")
    public int[][][] field3037;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "[[[Llw;")
    private class213[][][] field3038;

    @OriginalMember(owner = "client!bda", name = "V", descriptor = "[[F")
    private float[][] field3071;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "[[B")
    private byte[][] field3040;

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "[[S")
    public short[][] field3064;

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "[[[I")
    public int[][][] field3061;

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
    private int field3062;

    @OriginalMember(owner = "client!bda", name = "H", descriptor = "[[[I")
    private int[][][] field3057;

    @OriginalMember(owner = "client!bda", name = "ab", descriptor = "Llk;")
    private class638 field3076;

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "Lf;")
    private class285 field3065;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field3036 = class550.method3249(1600, 6520);

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!bda", name = "R", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bda", name = "S", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!bda", name = "Y", descriptor = "I")
    private int field3074;

    @OriginalMember(owner = "client!bda", name = "Z", descriptor = "I")
    private int field3075;

    @OriginalMember(owner = "client!bda", name = "fb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!bda", name = "T", descriptor = "Lls;")
    public class166 field3069;

    @OriginalMember(owner = "client!bda", name = "X", descriptor = "Lls;")
    public class166 field3073;

    @OriginalMember(owner = "client!bda", name = "cb", descriptor = "Lls;")
    public class166 field3078;

    @OriginalMember(owner = "client!bda", name = "eb", descriptor = "Lls;")
    private class166 field3080;

    @OriginalMember(owner = "client!bda", name = "db", descriptor = "Lvn;")
    private class211 field3079;

    @OriginalMember(owner = "client!bda", name = "bb", descriptor = "[Llw;")
    private class213[] field3077;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "[[[I")
    private int[][][] field3045;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lsca;[I)V", line = 3)
    public final void method1362(class251 arg0, int[] arg1) {
        this.field3050.method1039(new class603(this.field3044, this, arg0, arg1), 0);
        ++field3051;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 13)
    public final void method1363(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3063;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1371(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!bda", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 98)
    public final void method1364(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3056;
        if (this.field3065 != null && arg0 != null) {
            int var7 = arg1 - (this.field3044.field2669 * arg2 >> 8) >> this.field3044.field2610;
            int var8 = -(this.field3044.field2746 * arg2 >> 8) + arg3 >> this.field3044.field2610;
            this.field3065.method1875(var8, var7, -60, arg0);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 121)
    public final boolean method1365(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3068;
        if (this.field3065 != null && arg0 != null) {
            int var7 = arg1 - (this.field3044.field2669 * arg2 >> 8) >> this.field3044.field2610;
            int var8 = -(this.field3044.field2746 * arg2 >> 8) + arg3 >> this.field3044.field2610;
            return this.field3065.method1883(arg0, 77303792, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lpq;IIII[[I[[II)V", line = 146)
    public class222(class194 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field3044 = arg0;
        this.field3060 = super.field5825 + -2;
        this.field3049 = new int[arg3][arg4][];
        this.field3039 = arg2;
        this.field3066 = new float[super.field5827 - -1][super.field5826 + 1];
        this.field3059 = new int[arg3][arg4][];
        this.field3072 = new float[super.field5827 - -1][super.field5826 + 1];
        this.field3082 = new byte[arg3 + 1][arg4 + 1];
        this.field3037 = new int[arg3][arg4][];
        this.field3038 = new class213[arg3][arg4][];
        this.field3071 = new float[super.field5827 + 1][super.field5826 - -1];
        this.field3040 = new byte[arg3][arg4];
        this.field3064 = new short[arg3 * arg4][];
        this.field3061 = new int[arg3][arg4][];
        this.field3062 = 1 << this.field3060;
        this.field3057 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field5826 < ~var9; ++var9) {
            for (int var10 = 1; super.field5827 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field3071[var10][var9] = (float) var11 * var13;
                this.field3072[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3066[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3076 = new class638(128);
        if ((16 & this.field3039) != 0) {
            this.field3065 = new class285(this.field3044, this);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILgea;I)V", line = 203)
    private final void method1366(int arg0, int arg1, class65 arg2, int arg3) {
        ++field3058;
        int[] var5 = this.field3049[arg0][arg3];
        int[] var6 = this.field3037[arg0][arg3];
        int var7 = var5.length;
        if (~var7 < ~this.field3044.field2759.length) {
            this.field3044.field2759 = new int[var7];
            this.field3044.field2762 = new int[var7];
        }
        int[] var8 = this.field3044.field2759;
        int[] var9 = this.field3044.field2762;
        for (int var10 = arg1; var10 < var7; ++var10) {
            var8[var10] = var5[var10] >> this.field3044.field2610;
            var9[var10] = var6[var10] >> this.field3044.field2610;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) + -((var15 - var13) * (-var14 + var16))) < -1) {
                arg2.method505(var17, var14, var15, var12, var13, arg1 ^ -75201936, var16);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "fa", descriptor = "(IILr;)Lr;", line = 266)
    public final class113 method1367(int arg0, int arg1, class113 arg2) {
        ++field3046;
        if (~(this.field3040[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field5818 >> this.field3044.field2610;
            class65 var5 = (class65) arg2;
            class65 var6;
            if (var5 != null && var5.method504((byte) 24, var4, var4)) {
                var6 = var5;
                var5.method503(-4667);
            } else {
                var6 = new class65(this.field3044, var4, var4);
            }
            var6.method507(var4, 0, var4, -42716912, 0);
            this.method1366(arg0, 0, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V", line = 294)
    public final void method1368(int arg0, int arg1) {
        ++field3048;
    }

    @OriginalMember(owner = "client!bda", name = "YA", descriptor = "()V", line = 308)
    public final void method1369() {
        ++field3054;
        if (this.field3075 <= 0) {
            this.field3065 = null;
        } else {
            byte[][] var1 = new byte[super.field5827 - -1][super.field5826 + 1];
            for (int var2 = 1; ~var2 > ~super.field5827; ++var2) {
                for (int var103 = 1; ~super.field5826 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3082[var2][var103 + -1] >> 2) + (this.field3082[var2][var103] >> 1) + (this.field3082[var2][var103 + 1] >> 3) + (this.field3082[var2 + 1][var103] >> 3) + (this.field3082[var2 + -1][var103] >> 2));
                }
            }
            this.field3077 = new class213[this.field3076.method3664(0)];
            this.field3076.method3663(this.field3077, false);
            for (int var3 = 0; ~var3 > ~this.field3077.length; ++var3) {
                this.field3077[var3].method1333(10, this.field3075);
            }
            int var4 = 24;
            if (this.field3045 != null) {
                var4 += 4;
            }
            if (~(this.field3039 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3044.field2612.method2333(this.field3075 * var4, false);
            Stream var6 = new Stream(var5);
            class213[] var7 = new class213[this.field3075];
            int var8 = class47.method385(this.field3075 / 4, -116);
            if (~var8 > -2) {
                var8 = 1;
            }
            class638 var9 = new class638(var8);
            class213[] var10 = new class213[this.field3074];
            for (int var11 = 0; ~super.field5827 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field5826; ++var30) {
                    if (this.field3061[var11][var30] != null) {
                        class213[] var31 = this.field3038[var11][var30];
                        int[] var32 = this.field3049[var11][var30];
                        int[] var33 = this.field3037[var11][var30];
                        int[] var34 = this.field3057[var11][var30];
                        int[] var35 = this.field3061[var11][var30];
                        int[] var36 = this.field3059 == null ? null : this.field3059[var11][var30];
                        int[] var37 = this.field3045 == null ? null : this.field3045[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field3071[var11][var30];
                        float var39 = this.field3072[var11][var30];
                        float var40 = this.field3066[var11][var30];
                        float var41 = this.field3071[var11][var30 - -1];
                        float var42 = this.field3072[var11][var30 - -1];
                        float var43 = this.field3066[var11][var30 + 1];
                        float var44 = this.field3071[var11 + 1][var30 + 1];
                        float var45 = this.field3072[var11 + 1][var30 + 1];
                        float var46 = this.field3066[var11 + 1][var30 + 1];
                        float var47 = this.field3071[var11 - -1][var30];
                        float var48 = this.field3072[var11 + 1][var30];
                        float var49 = this.field3066[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label340: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class213 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3064[super.field5827 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field5825) - -var32[var57];
                            int var59 = (var30 << super.field5825) - -var33[var57];
                            int var60 = var58 >> this.field3060;
                            int var61 = var59 >> this.field3060;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var38;
                                var73 = var39;
                                var74 = var69 - var50;
                                var75 = var40;
                            } else if (var67 == 0 && super.field5818 == var68) {
                                var73 = var42;
                                var72 = var41;
                                var75 = var43;
                                var74 = var69 - var51;
                            } else if (~super.field5818 == ~var67 && ~super.field5818 == ~var68) {
                                var72 = var44;
                                var73 = var45;
                                var75 = var46;
                                var74 = var69 - var52;
                            } else if (super.field5818 == var67 && ~var68 == -1) {
                                var73 = var48;
                                var72 = var47;
                                var74 = var69 - var53;
                                var75 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field5818;
                                float var77 = (float) var68 / (float) super.field5818;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var73 = (-var79 + var82) * var77 + var79;
                                var72 = (var81 - var78) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field5825) + var50;
                                int var85 = var51 - -((-var51 + var52) * var67 >> super.field5825);
                                var74 = var69 - (((-var84 + var85) * var68 >> super.field5825) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(this.field3039 & 7) == -1) {
                                    float var87 = this.field3044.field2745[2] * var75 + this.field3044.field2745[1] * var73 + this.field3044.field2745[0] * var72;
                                    var71 = var87 * (!(var87 > 0.0F) ? this.field3044.field2744 : this.field3044.field2689) + this.field3044.field2726;
                                }
                                var70 = class109.field1323[var86 | var62 & 65408];
                            }
                            class69 var88 = null;
                            if ((this.field3062 + -1 & var58) == 0 && (this.field3062 + -1 & var59) == 0) {
                                var88 = var9.method3669(false, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var74 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var89 = class109.field1323[var90 | 65408 & var63];
                                    if ((this.field3039 & 7) == 0) {
                                        float var91 = this.field3044.field2745[2] * var75 + this.field3044.field2745[1] * var73 + this.field3044.field2745[0] * var72;
                                        float var92 = var71 * (var71 > 0.0F ? this.field3044.field2689 : this.field3044.field2744) + this.field3044.field2726;
                                        int var93 = (var89 & 16738030) >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var89 = var96 << 16 | var97 << 8 | var98;
                                    }
                                }
                                if (this.field3044.field2748) {
                                    var6.method2340((float) var58);
                                    var6.method2340((float) (this.method2529(var59, var58, (byte) -128) - -var64));
                                    var6.method2340((float) var59);
                                    var6.method2345((byte) (var89 >> 16));
                                    var6.method2345((byte) (var89 >> 8));
                                    var6.method2345((byte) var89);
                                    var6.method2345(-1);
                                    var6.method2340((float) var58);
                                    var6.method2340((float) var59);
                                    if (this.field3045 != null) {
                                        var6.method2340((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field3039 & 7) != -1) {
                                        var6.method2340(var72);
                                        var6.method2340(var73);
                                        var6.method2340(var75);
                                    }
                                } else {
                                    var6.method2350((float) var58);
                                    var6.method2350((float) (var64 + this.method2529(var59, var58, (byte) -128)));
                                    var6.method2350((float) var59);
                                    var6.method2345((byte) (var89 >> 16));
                                    var6.method2345((byte) (var89 >> 8));
                                    var6.method2345((byte) var89);
                                    var6.method2345(-1);
                                    var6.method2350((float) var58);
                                    var6.method2350((float) var59);
                                    if (this.field3045 != null) {
                                        var6.method2350((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field3039 & 7) != 0) {
                                        var6.method2350(var72);
                                        var6.method2350(var73);
                                        var6.method2350(var75);
                                    }
                                }
                                var99 = this.field3053++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method3666((byte) 65, var65, new class463(var56[var57]));
                            } else {
                                var56[var57] = ((class463) var88).field6465;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var31[var57].field762 > ~var7[var99].field762) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1339(-122, var99, var74, var70, var71);
                            }
                            ++this.field3055;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3053; ++var12) {
                class213 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1340(var12, (byte) -1);
                }
            }
            for (int var13 = 0; super.field5827 > var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field5826; ++var18) {
                    short[] var19 = this.field3064[super.field5827 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class213 var25 = var7[var22];
                            class213 var26 = var7[var23];
                            class213 var27 = var7[var24];
                            class213 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1336(var18, var20, 1, var13);
                            }
                            if (var26 != null) {
                                var26.method1336(var18, var20, 1, var13);
                                if (var28 == null || ~var26.field762 > ~var28.field762) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1336(var18, var20, 1, var13);
                                if (var28 == null || ~var28.field762 < ~var27.field762) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1340(var22, (byte) -1);
                                }
                                if (var26 != null) {
                                    var28.method1340(var23, (byte) -1);
                                }
                                if (var27 != null) {
                                    var28.method1340(var24, (byte) -1);
                                }
                                var28.method1336(var18, var20, 1, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2351();
            this.field3079 = this.field3044.method1235((byte) -31, var5, false, var4, var6.method2341());
            this.field3073 = new class166(this.field3079, 5126, 3, 0);
            this.field3080 = new class166(this.field3079, 5121, 4, 12);
            byte var14;
            if (this.field3045 == null) {
                var14 = 24;
                this.field3078 = new class166(this.field3079, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field3078 = new class166(this.field3079, 5126, 3, 16);
            }
            if ((7 & this.field3039) != 0) {
                this.field3069 = new class166(this.field3079, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3077.length];
            for (int var16 = 0; ~var16 > ~this.field3077.length; ++var16) {
                class213 var17 = this.field3077[var16];
                var15[var16] = var17.field762;
                var17.method1335(false, this.field3053);
            }
            class678.method3857((byte) -58, var15, this.field3077);
            if (this.field3065 != null) {
                this.field3065.method1879((byte) 121);
            }
        }
        this.field3057 = null;
        this.field3038 = null;
        this.field3059 = null;
        this.field3071 = this.field3072 = this.field3066 = null;
        this.field3082 = null;
        this.field3049 = this.field3037 = null;
        this.field3076 = null;
        this.field3045 = null;
        this.field3061 = null;
    }

    @OriginalMember(owner = "client!bda", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 884)
    public final void method1370(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3043;
        if (this.field3065 != null && arg0 != null) {
            int var7 = -(this.field3044.field2669 * arg2 >> 8) + arg1 >> this.field3044.field2610;
            int var8 = -(this.field3044.field2746 * arg2 >> 8) + arg3 >> this.field3044.field2610;
            this.field3065.method1878(arg0, var7, -47, var8);
        }
    }

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 901)
    public final void method1371(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3047;
        if (arg3 != null && this.field3059 == null) {
            this.field3059 = new int[super.field5827][super.field5826][];
        }
        class101 var15 = this.field3044.field6556;
        if (arg5 != null && this.field3045 == null) {
            this.field3045 = new int[super.field5827][super.field5826][];
        }
        this.field3049[arg0][arg1] = arg2;
        this.field3037[arg0][arg1] = arg4;
        this.field3061[arg0][arg1] = arg6;
        this.field3057[arg0][arg1] = arg7;
        if (this.field3045 != null) {
            this.field3045[arg0][arg1] = arg5;
        }
        if (this.field3059 != null) {
            this.field3059[arg0][arg1] = arg3;
        }
        class213[] var16 = this.field3038[arg0][arg1] = new class213[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field3039) != 0 && var18 != -1 && var15.method581(-21732, var18).field10264) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) var18;
            class69 var22;
            for (var22 = this.field3076.method3669(false, var20); var22 != null; var22 = this.field3076.method3673(-117)) {
                class213 var23 = (class213) var22;
                if (~var23.field2944 == ~var18 && (float) var19 == var23.field2946 && var23.field2933 == arg10 && var23.field2952 == arg11 && ~var23.field2950 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class213) var22;
            } else {
                var16[var17] = new class213(this, var18, var19, arg10, arg11, arg12);
                this.field3076.method3666((byte) 65, var20, var16[var17]);
            }
        }
        if (arg13) {
            this.field3040[arg0][arg1] = (byte) class613.method3544(this.field3040[arg0][arg1], 1);
        }
        if (~this.field3074 > ~arg6.length) {
            this.field3074 = arg6.length;
        }
        this.field3075 += arg6.length;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIZI[[Z)V", line = 984)
    private final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean[][] arg7) {
        if (this.field3077 != null) {
            int var9 = arg3 + arg3 + 1;
            int var10 = var9 * var9;
            if (var10 > this.field3044.field2758.length) {
                this.field3044.field2758 = new int[var10];
            }
            if (this.field3044.field2686.field6979.length < this.field3055 * 2) {
                this.field3044.field2686 = new class296(this.field3055 * 2);
            }
            int var11 = -arg3 + arg6;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg3 + arg4;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg3 + arg6;
            if (~var15 < ~(super.field5827 + -1)) {
                var15 = super.field5827 - 1;
            }
            int var16 = arg3 + arg4;
            if (var16 > super.field5826 + -1) {
                var16 = super.field5826 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field3044.field2758;
            for (int var19 = var11; var19 <= var15; ++var19) {
                boolean[] var25 = arg7[-var12 + var19];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[var26 - var14]) {
                        var18[var17++] = super.field5827 * var26 - -var19;
                    }
                }
            }
            if (~arg1 == 0) {
                this.field3044.method1237(true);
            } else {
                this.field3044.method1196((float) arg1, 3);
                this.field3044.method1209(99);
            }
            this.field3044.method1202(-107, (7 & this.field3039) != 0);
            for (int var20 = 0; ~var20 > ~this.field3077.length; ++var20) {
                this.field3077[var20].method1337(var17, var18, (byte) 66);
            }
            if (!this.field3050.method1044(21972)) {
                int var21 = this.field3044.field2685;
                int var22 = this.field3044.field2651;
                this.field3044.method255(0, var22, this.field3044.field2655);
                this.field3044.method1202(122, false);
                this.field3044.method1247(false, (byte) 80);
                this.field3044.method1241(128, (byte) 125);
                this.field3044.method1232(-2, 1);
                this.field3044.method1219((byte) 105, this.field3044.field2733);
                this.field3044.method1230(7681, 8448, false);
                this.field3044.method1223(0, 35, 770, 34166);
                this.field3044.method1220(34167, 770, 34200, 0);
                for (class69 var23 = this.field3050.method1041(1048832); var23 != null; var23 = this.field3050.method1033(-1)) {
                    class603 var24 = (class603) var23;
                    var24.method3487(arg6, 26984, arg4, arg7, arg3);
                }
                this.field3044.method1223(0, 115, 768, 5890);
                this.field3044.method1220(5890, 770, 34200, 0);
                this.field3044.method1219((byte) 88, (class539) null);
                this.field3044.method255(var21, var22, this.field3044.field2655);
            }
            if (this.field3065 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field3044.method1248(this.field3073, this.field3078, (class166) null, (byte) 114, (class166) null);
                this.field3065.method1881(arg4, arg6, arg3, -46, arg5, arg7);
                OpenGL.glPopMatrix();
            }
        }
        int var27 = 56 % ((arg0 - -81) / 41);
        ++field3052;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[[ZZII)V", line = 1138)
    public final void method1373(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field3041;
        this.method1372(94, arg5, arg6, arg2, arg1, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[[ZZI)V", line = 1162)
    public final void method1374(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method1372(-127, -1, arg5, arg2, arg1, arg4, arg0, arg3);
        ++field3081;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1173)
    public final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3070;
        if (this.field3075 > 0) {
            this.field3044.method1225((byte) 120);
            this.field3044.method1234(false, -109);
            this.field3044.method1202(-74, false);
            this.field3044.method1224(2929, false);
            this.field3044.method1247(false, (byte) 102);
            this.field3044.method1241(0, (byte) 124);
            this.field3044.method1232(-2, 1);
            this.field3044.method1219((byte) 103, (class539) null);
            class244.field3617[9] = 0.0F;
            class244.field3617[7] = 0.0F;
            class244.field3617[11] = 0.0F;
            class244.field3617[6] = 0.0F;
            class244.field3617[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3044.field2423;
            class244.field3617[2] = 0.0F;
            class244.field3617[1] = 0.0F;
            class244.field3617[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3044.field2454) + -1.0F;
            class244.field3617[10] = 0.0F;
            class244.field3617[8] = 0.0F;
            class244.field3617[0] = (float) arg2 / ((float) super.field5818 * 128.0F * (float) this.field3044.field2454);
            class244.field3617[14] = 0.0F;
            class244.field3617[4] = 0.0F;
            class244.field3617[5] = (float) arg2 / ((float) super.field5818 * 128.0F * (float) this.field3044.field2423);
            class244.field3617[3] = 0.0F;
            class244.field3617[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class244.field3617, 0);
            class244.field3617[6] = 1.0F;
            class244.field3617[12] = 0.0F;
            class244.field3617[5] = 0.0F;
            class244.field3617[7] = 0.0F;
            class244.field3617[1] = 0.0F;
            class244.field3617[11] = 0.0F;
            class244.field3617[8] = 0.0F;
            class244.field3617[10] = 0.0F;
            class244.field3617[9] = 1.0F;
            class244.field3617[14] = 0.0F;
            class244.field3617[4] = 0.0F;
            class244.field3617[3] = 0.0F;
            class244.field3617[0] = 1.0F;
            class244.field3617[15] = 1.0F;
            class244.field3617[13] = 0.0F;
            class244.field3617[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class244.field3617, 0);
            if (~(this.field3039 & 7) != -1) {
                this.field3044.method1202(-80, true);
                this.field3044.method1273(5888);
            } else {
                this.field3044.method1202(-82, false);
            }
            this.field3044.method1248(this.field3073, this.field3078, this.field3080, (byte) -16, this.field3069);
            if (this.field3055 * 2 <= this.field3044.field2686.field6979.length) {
                this.field3044.field2686.field6962 = 0;
            } else {
                this.field3044.field2686 = new class296(this.field3055 * 2);
            }
            int var9 = 0;
            class296 var10 = this.field3044.field2686;
            if (!this.field3044.field2748) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field5827 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field3064[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method2974(65535 & var14[var15], (byte) 116);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field5827 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[var19 - arg3][var16 - arg4]) {
                            short[] var20 = this.field3064[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    ++var9;
                                    var10.method2986(var20[var21] & 65535, -87);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class416 var17 = new class416(this.field3044, 5123, var10.field6979, var10.field6962);
                this.field3044.method1211((byte) -120, var9, var17, 4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "ka", descriptor = "(III)V", line = 1347)
    public final void method1376(int arg0, int arg1, int arg2) {
        ++field3067;
        if ((this.field3082[arg0][arg1] & 255) < arg2) {
            this.field3082[arg0][arg1] = (byte) arg2;
        }
    }
}
