import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class636 extends class682 {

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "Lau;")
    private class692 field8997 = new class692();

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "Lkfa;")
    public class382 field9004;

    @OriginalMember(owner = "client!fw", name = "P", descriptor = "I")
    private int field9024;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "[[B")
    private byte[][] field9005;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "[[[I")
    public int[][][] field9003;

    @OriginalMember(owner = "client!fw", name = "O", descriptor = "[[[I")
    public int[][][] field9023;

    @OriginalMember(owner = "client!fw", name = "fb", descriptor = "[[B")
    private byte[][] field9040;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "[[[I")
    public int[][][] field8998;

    @OriginalMember(owner = "client!fw", name = "lb", descriptor = "[[F")
    private float[][] field9046;

    @OriginalMember(owner = "client!fw", name = "S", descriptor = "I")
    private int field9027;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "[[[Ldd;")
    private class629[][][] field8996;

    @OriginalMember(owner = "client!fw", name = "Q", descriptor = "[[[I")
    private int[][][] field9025;

    @OriginalMember(owner = "client!fw", name = "R", descriptor = "[[S")
    public short[][] field9026;

    @OriginalMember(owner = "client!fw", name = "ib", descriptor = "[[F")
    private float[][] field9043;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public int field9012;

    @OriginalMember(owner = "client!fw", name = "cb", descriptor = "[[F")
    private float[][] field9037;

    @OriginalMember(owner = "client!fw", name = "M", descriptor = "[[[I")
    private int[][][] field9021;

    @OriginalMember(owner = "client!fw", name = "eb", descriptor = "Lmo;")
    private class482 field9039;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "Loi;")
    private class57 field9013;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "Leda;")
    public static class116 field9016 = new class116(67, 6);

    @OriginalMember(owner = "client!fw", name = "W", descriptor = "F")
    public static float field9031 = 1024.0F;

    @OriginalMember(owner = "client!fw", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field9029 = new String[100];

    @OriginalMember(owner = "client!fw", name = "V", descriptor = "[Z")
    public static boolean[] field9030 = new boolean[100];

    @OriginalMember(owner = "client!fw", name = "X", descriptor = "F")
    public static float field9032;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
    private int field9008;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "I")
    private int field9020;

    @OriginalMember(owner = "client!fw", name = "N", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!fw", name = "T", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!fw", name = "Z", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!fw", name = "bb", descriptor = "I")
    private int field9036;

    @OriginalMember(owner = "client!fw", name = "gb", descriptor = "I")
    private int field9041;

    @OriginalMember(owner = "client!fw", name = "kb", descriptor = "Lnu;")
    private class411 field9045;

    @OriginalMember(owner = "client!fw", name = "ab", descriptor = "Lmba;")
    public class70 field9035;

    @OriginalMember(owner = "client!fw", name = "db", descriptor = "Lmba;")
    private class70 field9038;

    @OriginalMember(owner = "client!fw", name = "hb", descriptor = "Lmba;")
    public class70 field9042;

    @OriginalMember(owner = "client!fw", name = "jb", descriptor = "Lmba;")
    public class70 field9044;

    @OriginalMember(owner = "client!fw", name = "Y", descriptor = "[Ldd;")
    private class629[] field9033;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "[[[I")
    private int[][][] field9002;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 6)
    public final void method1364(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9028;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method1365(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!fw", name = "BA", descriptor = "()V", line = 91)
    public final void method1371() {
        if (this.field9041 <= 0) {
            this.field9013 = null;
        } else {
            byte[][] var1 = new byte[super.field9706 + 1][super.field9703 + 1];
            for (int var2 = 1; ~var2 > ~super.field9706; ++var2) {
                for (int var103 = 1; super.field9703 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field9040[var2 + 1][var103] >> 3) + (this.field9040[var2][var103] >> 1) + (this.field9040[var2 + -1][var103] >> 2) + (this.field9040[var2][var103 + -1] >> 2) + (this.field9040[var2][var103 + 1] >> 3));
                }
            }
            this.field9033 = new class629[this.field9039.method2813((byte) -56)];
            this.field9039.method2817((byte) 118, this.field9033);
            for (int var3 = 0; ~var3 > ~this.field9033.length; ++var3) {
                this.field9033[var3].method3551(this.field9041, (byte) -82);
            }
            int var4 = 24;
            if (this.field9002 != null) {
                var4 += 4;
            }
            if (~(this.field9012 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field9004.field5455.method2026(this.field9041 * var4, false);
            Stream var6 = new Stream(var5);
            class629[] var7 = new class629[this.field9041];
            int var8 = class270.method1702(this.field9041 / 4, (byte) -58);
            if (var8 < 1) {
                var8 = 1;
            }
            class482 var9 = new class482(var8);
            class629[] var10 = new class629[this.field9036];
            for (int var11 = 0; super.field9706 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field9703; ++var30) {
                    if (this.field9003[var11][var30] != null) {
                        class629[] var31 = this.field8996[var11][var30];
                        int[] var32 = this.field8998[var11][var30];
                        int[] var33 = this.field9023[var11][var30];
                        int[] var34 = this.field9025[var11][var30];
                        int[] var35 = this.field9003[var11][var30];
                        int[] var36 = this.field9021 != null ? this.field9021[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field9002 == null ? null : this.field9002[var11][var30];
                        float var38 = this.field9046[var11][var30];
                        float var39 = this.field9037[var11][var30];
                        float var40 = this.field9043[var11][var30];
                        float var41 = this.field9046[var11][var30 + 1];
                        float var42 = this.field9037[var11][var30 - -1];
                        float var43 = this.field9043[var11][var30 + 1];
                        float var44 = this.field9046[var11 - -1][var30 + 1];
                        float var45 = this.field9037[var11 + 1][var30 + 1];
                        float var46 = this.field9043[var11 + 1][var30 - -1];
                        float var47 = this.field9046[var11 + 1][var30];
                        float var48 = this.field9037[var11 + 1][var30];
                        float var49 = this.field9043[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label341: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class629 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field9026[super.field9706 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field9707) + var32[var57];
                            int var59 = (var30 << super.field9707) + var33[var57];
                            int var60 = var58 >> this.field9024;
                            int var61 = var59 >> this.field9024;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (~var67 == -1 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                            } else if (var67 == 0 && super.field9709 == var68) {
                                var73 = var41;
                                var74 = var43;
                                var71 = var42;
                                var72 = var69 - var51;
                            } else if (super.field9709 == var67 && ~super.field9709 == ~var68) {
                                var74 = var46;
                                var72 = var69 - var52;
                                var71 = var45;
                                var73 = var44;
                            } else if (~super.field9709 == ~var67 && var68 == 0) {
                                var74 = var49;
                                var73 = var47;
                                var71 = var48;
                                var72 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field9709;
                                float var76 = (float) var68 / (float) super.field9709;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var71 = (var81 - var78) * var76 + var78;
                                float var82 = (var46 - var43) * var75 + var43;
                                var73 = (var80 - var77) * var76 + var77;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field9707) + var50;
                                int var84 = ((var52 - var51) * var67 >> super.field9707) + var51;
                                var72 = var69 - (((-var83 + var84) * var68 >> super.field9707) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(this.field9012 & 7) == -1) {
                                    float var87 = this.field9004.field5596[2] * var74 + this.field9004.field5596[0] * var73 + this.field9004.field5596[1] * var71;
                                    var85 = var87 * (!(var87 > 0.0F) ? this.field9004.field5566 : this.field9004.field5580) + this.field9004.field5499;
                                }
                                var70 = class531.field7839[var86 | var62 & 65408];
                            }
                            class435 var88 = null;
                            if (~(var58 & this.field9027 + -1) == -1 && (this.field9027 + -1 & var59) == 0) {
                                var88 = var9.method2818(-22803, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class497) var88).field7404;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var31[var57].field6265 > ~var7[var89].field6265) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (~var62 == ~var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (var63 & 127) * var72 >> 7;
                                    if (~var91 > -3) {
                                        var91 = 2;
                                    } else if (var91 > 126) {
                                        var91 = 126;
                                    }
                                    var90 = class531.field7839[var63 & 65408 | var91];
                                    if ((7 & this.field9012) == 0) {
                                        float var92 = this.field9004.field5596[2] * var74 + this.field9004.field5596[0] * var73 + this.field9004.field5596[1] * var71;
                                        float var93 = var85 * (var85 > 0.0F ? this.field9004.field5580 : this.field9004.field5566) + this.field9004.field5499;
                                        int var94 = var90 >> 16 & 255;
                                        int var95 = (var90 & 65522) >> 8;
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (~var99 <= -1) {
                                            if (var99 > 255) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var99 | var98 << 8 | var97 << 16;
                                    }
                                }
                                if (this.field9004.field5558) {
                                    var6.method2037((float) var58);
                                    var6.method2037((float) (this.method3861((byte) 126, var58, var59) - -var64));
                                    var6.method2037((float) var59);
                                    var6.method2029((byte) (var90 >> 16));
                                    var6.method2029((byte) (var90 >> 8));
                                    var6.method2029((byte) var90);
                                    var6.method2029(-1);
                                    var6.method2037((float) var58);
                                    var6.method2037((float) var59);
                                    if (this.field9002 != null) {
                                        var6.method2037((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((7 & this.field9012) != 0) {
                                        var6.method2037(var73);
                                        var6.method2037(var71);
                                        var6.method2037(var74);
                                    }
                                } else {
                                    var6.method2035((float) var58);
                                    var6.method2035((float) (var64 + this.method3861((byte) -52, var58, var59)));
                                    var6.method2035((float) var59);
                                    var6.method2029((byte) (var90 >> 16));
                                    var6.method2029((byte) (var90 >> 8));
                                    var6.method2029((byte) var90);
                                    var6.method2029(-1);
                                    var6.method2035((float) var58);
                                    var6.method2035((float) var59);
                                    if (this.field9002 != null) {
                                        var6.method2035((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field9012) != 0) {
                                        var6.method2035(var73);
                                        var6.method2035(var71);
                                        var6.method2035(var74);
                                    }
                                }
                                var89 = this.field9008++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2816(new class497(var56[var57]), var65, false);
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method3558(var70, var89, (byte) 0, var85, var72);
                            }
                            ++this.field9020;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field9008; ++var12) {
                class629 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3559(var12, 65535);
                }
            }
            for (int var13 = 0; var13 < super.field9706; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field9703; ++var18) {
                    short[] var19 = this.field9026[super.field9706 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class629 var25 = var7[var22];
                            class629 var26 = var7[var23];
                            class629 var27 = var7[var24];
                            class629 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method3555(var18, var20, var13, -46);
                            }
                            if (var26 != null) {
                                var26.method3555(var18, var20, var13, -46);
                                if (var28 == null || var28.field6265 > var26.field6265) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3555(var18, var20, var13, -46);
                                if (var28 == null || var28.field6265 > var27.field6265) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3559(var22, 65535);
                                }
                                if (var26 != null) {
                                    var28.method3559(var23, 65535);
                                }
                                if (var27 != null) {
                                    var28.method3559(var24, 65535);
                                }
                                var28.method3555(var18, var20, var13, -46);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2034();
            this.field9045 = this.field9004.method2294(var4, var6.method2040(), false, var5, 1);
            this.field9035 = new class70(this.field9045, 5126, 3, 0);
            this.field9038 = new class70(this.field9045, 5121, 4, 12);
            byte var14;
            if (this.field9002 != null) {
                var14 = 28;
                this.field9044 = new class70(this.field9045, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field9044 = new class70(this.field9045, 5126, 2, 16);
            }
            if (~(this.field9012 & 7) != -1) {
                this.field9042 = new class70(this.field9045, 5126, 3, var14);
            }
            long[] var15 = new long[this.field9033.length];
            for (int var16 = 0; var16 < this.field9033.length; ++var16) {
                class629 var17 = this.field9033[var16];
                var15[var16] = var17.field6265;
                var17.method3553(this.field9008, -77);
            }
            class89.method667(this.field9033, 119, var15);
            if (this.field9013 != null) {
                this.field9013.method493(true);
            }
        }
        ++field9009;
        this.field8996 = null;
        this.field9040 = null;
        this.field9046 = this.field9037 = this.field9043 = null;
        this.field9003 = null;
        this.field9025 = null;
        this.field8998 = this.field9023 = null;
        this.field9002 = null;
        this.field9021 = null;
        this.field9039 = null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[[ZZ)V", line = 668)
    public final void method1377(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method3589(arg0, arg4, arg3, arg1, arg2, -1, true);
        ++field9001;
    }

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "(Lha;IIIIZ)V", line = 681)
    public final void method1363(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9007;
        if (this.field9013 != null && arg0 != null) {
            int var7 = -(this.field9004.field5578 * arg2 >> 8) + arg1 >> this.field9004.field5457;
            int var8 = -(this.field9004.field5594 * arg2 >> 8) + arg3 >> this.field9004.field5457;
            this.field9013.method496(var8, (byte) 123, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ[[ZIIIZ)V", line = 702)
    private final void method3589(int arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field9019;
        if (arg6) {
            if (this.field9033 != null) {
                int var8 = arg4 - -1 + arg4;
                int var9 = var8 * var8;
                if (~var9 < ~this.field9004.field5610.length) {
                    this.field9004.field5610 = new int[var9];
                }
                if (this.field9020 * 2 > this.field9004.field5537.field6719.length) {
                    this.field9004.field5537 = new class351(this.field9020 * 2);
                }
                int var10 = -arg4 + arg0;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = -arg4 + arg3;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg0 + arg4;
                if (~(super.field9706 + -1) > ~var14) {
                    var14 = super.field9706 + -1;
                }
                int var15 = arg3 - -arg4;
                if (~(super.field9703 + -1) > ~var15) {
                    var15 = super.field9703 - 1;
                }
                int var16 = 0;
                int[] var17 = this.field9004.field5610;
                for (int var18 = var10; ~var14 <= ~var18; ++var18) {
                    boolean[] var24 = arg2[-var11 + var18];
                    for (int var25 = var12; ~var15 <= ~var25; ++var25) {
                        if (var24[-var13 + var25]) {
                            var17[var16++] = super.field9706 * var25 - -var18;
                        }
                    }
                }
                if (~arg5 != 0) {
                    this.field9004.method2259(9801, (float) arg5);
                    this.field9004.method2269(16);
                } else {
                    this.field9004.method2311(true);
                }
                this.field9004.method2272(~(this.field9012 & 7) != -1, (byte) -9);
                for (int var19 = 0; this.field9033.length > var19; ++var19) {
                    this.field9033[var19].method3552(var16, var17, false);
                }
                if (!this.field8997.method3903(2)) {
                    int var20 = this.field9004.field5520;
                    int var21 = this.field9004.field5510;
                    this.field9004.method763(0, var21, this.field9004.field5559);
                    this.field9004.method2272(false, (byte) -9);
                    this.field9004.method2275(false, 107);
                    this.field9004.method2325(128, (byte) 45);
                    this.field9004.method2321(-1111, -2);
                    this.field9004.method2295((byte) 119, this.field9004.field5523);
                    this.field9004.method2328(8448, -115, 7681);
                    this.field9004.method2262(34166, 0, 34176, 770);
                    this.field9004.method2258(-89, 34167, 770, 0);
                    for (class435 var22 = this.field8997.method3905(-110); var22 != null; var22 = this.field8997.method3899(0)) {
                        class130 var23 = (class130) var22;
                        var23.method1021(15926, arg4, arg3, arg0, arg2);
                    }
                    this.field9004.method2262(5890, 0, 34176, 768);
                    this.field9004.method2258(-105, 5890, 770, 0);
                    this.field9004.method2295((byte) 111, (class337) null);
                    this.field9004.method763(var20, var21, this.field9004.field5559);
                }
                if (this.field9013 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field9004.method2336((byte) -127, (class70) null, this.field9035, (class70) null, this.field9044);
                    this.field9013.method490(-89, arg1, arg4, arg3, arg0, arg2);
                    OpenGL.glPopMatrix();
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[[ZZI)V", line = 852)
    public final void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3589(arg0, arg4, arg3, arg1, arg2, arg5, true);
        ++field8999;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIII[[Z)V", line = 864)
    public final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9011;
        if (this.field9041 > 0) {
            this.field9004.method2284((byte) -64);
            this.field9004.method2303(false, -32);
            this.field9004.method2272(false, (byte) -9);
            this.field9004.method2282(false, true);
            this.field9004.method2275(false, 95);
            this.field9004.method2325(0, (byte) 45);
            this.field9004.method2321(-1111, -2);
            this.field9004.method2295((byte) 86, (class337) null);
            class290.field4074[7] = 0.0F;
            class290.field4074[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field9004.field5253;
            class290.field4074[10] = 0.0F;
            class290.field4074[0] = (float) arg2 / ((float) super.field9709 * 128.0F * (float) this.field9004.field5253);
            class290.field4074[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9004.field5289;
            class290.field4074[4] = 0.0F;
            class290.field4074[3] = 0.0F;
            class290.field4074[8] = 0.0F;
            class290.field4074[9] = 0.0F;
            class290.field4074[15] = 1.0F;
            class290.field4074[14] = 0.0F;
            class290.field4074[6] = 0.0F;
            class290.field4074[5] = (float) arg2 / ((float) super.field9709 * 128.0F * (float) this.field9004.field5289);
            class290.field4074[1] = 0.0F;
            class290.field4074[2] = 0.0F;
            class290.field4074[11] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class290.field4074, 0);
            class290.field4074[15] = 1.0F;
            class290.field4074[2] = 0.0F;
            class290.field4074[7] = 0.0F;
            class290.field4074[5] = 0.0F;
            class290.field4074[6] = 1.0F;
            class290.field4074[8] = 0.0F;
            class290.field4074[0] = 1.0F;
            class290.field4074[12] = 0.0F;
            class290.field4074[4] = 0.0F;
            class290.field4074[3] = 0.0F;
            class290.field4074[9] = 1.0F;
            class290.field4074[10] = 0.0F;
            class290.field4074[1] = 0.0F;
            class290.field4074[11] = 0.0F;
            class290.field4074[14] = 0.0F;
            class290.field4074[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class290.field4074, 0);
            if ((this.field9012 & 7) != 0) {
                this.field9004.method2272(true, (byte) -9);
                this.field9004.method2312(-20899);
            } else {
                this.field9004.method2272(false, (byte) -9);
            }
            this.field9004.method2336((byte) -122, this.field9042, this.field9035, this.field9038, this.field9044);
            if (this.field9004.field5537.field6719.length >= this.field9020 * 2) {
                this.field9004.field5537.field6710 = 0;
            } else {
                this.field9004.field5537 = new class351(this.field9020 * 2);
            }
            int var9 = 0;
            class351 var10 = this.field9004.field5537;
            if (!this.field9004.field5558) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field9706 * var11 + arg3;
                    for (int var13 = arg3; ~arg5 < ~var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field9026[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method2742(65535 & var14[var15], -1557853240);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field9706 * var16 - -arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field9026[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method2739((byte) -86, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class372 var17 = new class372(this.field9004, 5123, var10.field6719, var10.field6710);
                this.field9004.method2320(4, false, 0, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lkfa;IIII[[I[[II)V", line = 1034)
    public class636(class382 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9004 = arg0;
        this.field9024 = super.field9707 + -2;
        this.field9005 = new byte[arg3][arg4];
        this.field9003 = new int[arg3][arg4][];
        this.field9023 = new int[arg3][arg4][];
        this.field9040 = new byte[arg3 - -1][arg4 + 1];
        this.field8998 = new int[arg3][arg4][];
        this.field9046 = new float[super.field9706 - -1][super.field9703 + 1];
        this.field9027 = 1 << this.field9024;
        this.field8996 = new class629[arg3][arg4][];
        this.field9025 = new int[arg3][arg4][];
        this.field9026 = new short[arg3 * arg4][];
        this.field9043 = new float[super.field9706 + 1][super.field9703 + 1];
        this.field9012 = arg2;
        this.field9037 = new float[super.field9706 + 1][super.field9703 + 1];
        this.field9021 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field9703; ++var9) {
            for (int var10 = 1; var10 < super.field9706; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field9046[var10][var9] = (float) var11 * var13;
                this.field9037[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field9043[var10][var9] = (float) var12 * var13;
            }
        }
        this.field9039 = new class482(128);
        if ((this.field9012 & 16) != 0) {
            this.field9013 = new class57(this.field9004, this);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 1097)
    public static void method3590(int arg0) {
        field9016 = null;
        field9029 = null;
        if (arg0 != 140) {
            method3590(-111);
        }
        field9030 = null;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(III)Z", line = 1115)
    public static final boolean method3591(int arg0, int arg1, int arg2) {
        ++field9014;
        return arg0 != -9676 ? false : false;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V", line = 1129)
    public final void method1368(int arg0, int arg1, int arg2) {
        ++field9022;
        if ((255 & this.field9040[arg0][arg1]) < arg2) {
            this.field9040[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILhk;I)V", line = 1140)
    private final void method3592(int arg0, int arg1, class134 arg2, int arg3) {
        ++field9034;
        int[] var5 = this.field8998[arg1][arg0];
        int[] var6 = this.field9023[arg1][arg0];
        int var7 = var5.length;
        if (~var7 < ~this.field9004.field5608.length) {
            this.field9004.field5608 = new int[var7];
            this.field9004.field5606 = new int[var7];
        }
        int[] var8 = this.field9004.field5608;
        int[] var9 = this.field9004.field5606;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field9004.field5457;
            var9[var10] = var6[var10] >> this.field9004.field5457;
        }
        int var11 = 0;
        if (arg3 != 1) {
            field9016 = null;
        }
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var12 - var14) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                arg2.method1030(var15, var17, var12, 1832564272, var13, var16, var14);
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 1211)
    public final boolean method1370(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9018;
        if (this.field9013 != null && arg0 != null) {
            int var7 = arg1 - (this.field9004.field5578 * arg2 >> 8) >> this.field9004.field5457;
            int var8 = -(this.field9004.field5594 * arg2 >> 8) + arg3 >> this.field9004.field5457;
            return this.field9013.method498(1, var8, arg0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "(IILha;)Lha;", line = 1232)
    public final class427 method1369(int arg0, int arg1, class427 arg2) {
        ++field9015;
        if (~(this.field9005[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field9709 >> this.field9004.field5457;
            class134 var5 = (class134) arg2;
            class134 var6;
            if (var5 != null && var5.method1029(-128, var4, var4)) {
                var6 = var5;
                var5.method1032(false);
            } else {
                var6 = new class134(this.field9004, var4, var4);
            }
            var6.method1033(var4, 0, 0, 120, var4);
            this.method3592(arg1, arg0, var6, 1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fw", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 1264)
    public final void method1376(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9010;
        if (this.field9013 != null && arg0 != null) {
            int var7 = -(this.field9004.field5578 * arg2 >> 8) + arg1 >> this.field9004.field5457;
            int var8 = -(this.field9004.field5594 * arg2 >> 8) + arg3 >> this.field9004.field5457;
            this.field9013.method492(arg0, var8, 23958, var7);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lam;[I)V", line = 1288)
    public final void method1367(class289 arg0, int[] arg1) {
        this.field8997.method3904(new class130(this.field9004, this, arg0, arg1), 0);
        ++field9000;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)V", line = 1308)
    public final void method1374(int arg0, int arg1) {
        ++field9017;
    }

    @OriginalMember(owner = "client!fw", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1320)
    public final void method1365(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field9021 == null) {
            this.field9021 = new int[super.field9706][super.field9703][];
        }
        ++field9006;
        if (arg5 != null && this.field9002 == null) {
            this.field9002 = new int[super.field9706][super.field9703][];
        }
        this.field8998[arg0][arg1] = arg2;
        this.field9023[arg0][arg1] = arg4;
        this.field9003[arg0][arg1] = arg6;
        this.field9025[arg0][arg1] = arg7;
        if (this.field9002 != null) {
            this.field9002[arg0][arg1] = arg5;
        }
        if (this.field9021 != null) {
            this.field9021[arg0][arg1] = arg3;
        }
        class629[] var15 = this.field8996[arg0][arg1] = new class629[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[var16];
            class435 var19;
            for (var19 = this.field9039.method2818(-22803, var17); var19 != null; var19 = this.field9039.method2810((byte) -45)) {
                class629 var20 = (class629) var19;
                if (arg8[var16] == var20.field8951 && (float) arg9[var16] == var20.field8962 && ~var20.field8960 == ~arg10 && var20.field8961 == arg11 && ~var20.field8956 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class629(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field9039.method2816(var15[var16], var17, false);
            } else {
                var15[var16] = (class629) var19;
            }
        }
        if (arg13) {
            this.field9005[arg0][arg1] = (byte) class460.method2676(this.field9005[arg0][arg1], 1);
        }
        if (~this.field9036 > ~arg6.length) {
            this.field9036 = arg6.length;
        }
        this.field9041 += arg6.length;
    }
}
