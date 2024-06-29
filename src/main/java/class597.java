import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class597 extends class294 {

    @OriginalMember(owner = "client!im", name = "o", descriptor = "F")
    private float field8755 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "F")
    private float field8767 = -3.4028235E38F;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "Lef;")
    private class513 field8754 = new class513();

    @OriginalMember(owner = "client!im", name = "C", descriptor = "Lkd;")
    public class296 field8761;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    private int field8776;

    @OriginalMember(owner = "client!im", name = "hb", descriptor = "[[F")
    private float[][] field8795;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[[S")
    public short[][] field8756;

    @OriginalMember(owner = "client!im", name = "eb", descriptor = "I")
    private int field8750;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[[F")
    private float[][] field8793;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "[[F")
    private float[][] field8799;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "[[[I")
    public int[][][] field8765;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "[[[Lkja;")
    private class684[][][] field8753;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "[[B")
    private byte[][] field8797;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public int field8785;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "[[[I")
    public int[][][] field8751;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "[[[I")
    private int[][][] field8762;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "[[[I")
    public int[][][] field8771;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "[[B")
    private byte[][] field8770;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "[[[I")
    private int[][][] field8786;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "Lqha;")
    private class112 field8790;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "Lwaa;")
    private class730 field8783;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field8801 = new String[] { method4448(method4447("m6g,")), method4448(method4447("j.%\u0007P")), method4448(method4447("xm%n\u0005")), method4448(method4447("j.%&\u0019+")), method4448(method4447("j.%+\u0019+")), method4448(method4447("j.%\u000bP")), method4448(method4447("j.%\nP")), method4448(method4447("j.%\tP")), method4448(method4447("j.%\u00199+")), method4448(method4447("j.%\u0002P")), method4448(method4447("j.%\bP")), method4448(method4447("j.%\u00039+")), method4448(method4447("j.%\u0006P")), method4448(method4447("j.%\u0001P")), method4448(method4447("j.%\u0005P")), method4448(method4447("j.%7\u0019+")), method4448(method4447("j.%\u0015P")), method4448(method4447("j.%\u0003P")), method4448(method4447("j.%|\u0011m*\u007f~P")), method4448(method4447("j.%\u0004P")) };

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field8757 = 0;

    @OriginalMember(owner = "client!im", name = "fb", descriptor = "Z")
    public static boolean field8773 = true;

    @OriginalMember(owner = "client!im", name = "ib", descriptor = "I")
    public static int field8779 = 0;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Lwia;")
    public static class790 field8782 = new class790(2, 3);

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!im", name = "kb", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!im", name = "jb", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    private int field8775;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    private int field8778;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    private int field8789;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    private int field8794;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "Lhv;")
    public static class544 field8749;

    @OriginalMember(owner = "client!im", name = "db", descriptor = "Lsfa;")
    private class723 field8792;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "Lsfa;")
    private class723 field8796;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "Lgn;")
    public class728 field8791;

    @OriginalMember(owner = "client!im", name = "gb", descriptor = "[Lkja;")
    private class684[] field8788;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "[[[I")
    private int[][][] field8784;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 8)
    public final void method1503(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        try {
            ++field8768;
            if (arg3 != null && this.field8786 == null) {
                this.field8786 = new int[super.field4337][super.field4336][];
            }
            if (arg5 != null && this.field8784 == null) {
                this.field8784 = new int[super.field4337][super.field4336][];
            }
            class160 var15 = this.field8761.field679;
            this.field8765[arg0][arg1] = arg2;
            this.field8771[arg0][arg1] = arg4;
            this.field8751[arg0][arg1] = arg6;
            this.field8762[arg0][arg1] = arg7;
            if (this.field8784 != null) {
                this.field8784[arg0][arg1] = arg5;
            }
            if (this.field8786 != null) {
                this.field8786[arg0][arg1] = arg3;
            }
            class684[] var16 = this.field8753[arg0][arg1] = new class684[arg6.length];
            for (int var17 = 0; arg6.length > var17; ++var17) {
                int var18 = arg8[var17];
                int var19 = arg9[var17];
                if ((32 & this.field8785) != 0 && var18 != -1 && var15.method1366((byte) -118, var18).field6474) {
                    var18 = -1;
                    var19 = 128;
                }
                long var20 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (var19 << 14) | (long) var18;
                class206 var22;
                for (var22 = this.field8790.method977(var20, 1); var22 != null; var22 = this.field8790.method969(-107)) {
                    class684 var23 = (class684) var22;
                    if (~var23.field9908 == ~var18 && (float) var19 == var23.field9910 && var23.field9921 == arg10 && ~var23.field9927 == ~arg11 && var23.field9930 == arg12) {
                        break;
                    }
                }
                if (var22 != null) {
                    var16[var17] = (class684) var22;
                } else {
                    var16[var17] = new class684(this, var18, var19, arg10, arg11, arg12);
                    this.field8790.method968((byte) -111, var20, var16[var17]);
                }
            }
            if (arg13) {
                this.field8770[arg0][arg1] = (byte) class544.method4107(this.field8770[arg0][arg1], 1);
            }
            if (~arg6.length < ~this.field8794) {
                this.field8794 = arg6.length;
            }
            this.field8789 += arg6.length;
        } catch (RuntimeException var25) {
            throw class759.method5498(var25, field8801[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8801[2] : field8801[0]) + ',' + (arg3 != null ? field8801[2] : field8801[0]) + ',' + (arg4 != null ? field8801[2] : field8801[0]) + ',' + (arg5 != null ? field8801[2] : field8801[0]) + ',' + (arg6 != null ? field8801[2] : field8801[0]) + ',' + (arg7 != null ? field8801[2] : field8801[0]) + ',' + (arg8 != null ? field8801[2] : field8801[0]) + ',' + (arg9 != null ? field8801[2] : field8801[0]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "YA", descriptor = "()V", line = 85)
    public final void method1500() {
        try {
            ++field8798;
            if (~this.field8789 < -1) {
                byte[][] var1 = new byte[super.field4337 + 1][super.field4336 + 1];
                for (int var2 = 1; var2 < super.field4337; ++var2) {
                    for (int var3 = 1; ~super.field4336 < ~var3; ++var3) {
                        var1[var2][var3] = (byte) ((this.field8797[var2][var3] >> 1) + (this.field8797[var2][var3 + -1] >> 2) + (this.field8797[var2][var3 + 1] >> 3) + (this.field8797[var2 - 1][var3] >> 2) + (this.field8797[var2 - -1][var3] >> 3));
                    }
                }
                class684[] var4 = new class684[this.field8790.method979(false)];
                this.field8790.method974(0, var4);
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    var4[var5].method5013(this.field8789, (byte) -80);
                }
                int var6 = 20;
                if (this.field8784 != null) {
                    var6 += 4;
                }
                if (~(7 & this.field8785) != -1) {
                    var6 += 12;
                }
                NativeHeapBuffer var7 = this.field8761.field4439.method5097(this.field8789 * 4, false);
                NativeHeapBuffer var8 = this.field8761.field4439.method5097(this.field8789 * var6, false);
                Stream var9 = new Stream(var8);
                Stream var10 = new Stream(var7);
                class684[] var11 = new class684[this.field8789];
                int var12 = class554.method4172(this.field8789 / 4, 24500);
                if (~var12 > -2) {
                    var12 = 1;
                }
                class112 var13 = new class112(var12);
                class684[] var14 = new class684[this.field8794];
                for (int var15 = 0; super.field4337 > var15; ++var15) {
                    for (int var16 = 0; ~super.field4336 < ~var16; ++var16) {
                        if (this.field8751[var15][var16] != null) {
                            class684[] var17 = this.field8753[var15][var16];
                            int[] var18 = this.field8765[var15][var16];
                            int[] var19 = this.field8771[var15][var16];
                            int[] var20 = this.field8762[var15][var16];
                            int[] var21 = this.field8751[var15][var16];
                            int[] var22 = this.field8786 == null ? null : this.field8786[var15][var16];
                            if (var20 == null) {
                                var20 = var21;
                            }
                            int[] var23 = this.field8784 == null ? null : this.field8784[var15][var16];
                            float var24 = this.field8793[var15][var16];
                            float var25 = this.field8795[var15][var16];
                            float var26 = this.field8799[var15][var16];
                            float var27 = this.field8793[var15][var16 + 1];
                            float var28 = this.field8795[var15][var16 + 1];
                            float var29 = this.field8799[var15][var16 + 1];
                            float var30 = this.field8793[var15 - -1][var16 + 1];
                            float var31 = this.field8795[var15 + 1][var16 - -1];
                            float var32 = this.field8799[var15 + 1][var16 + 1];
                            float var33 = this.field8793[var15 + 1][var16];
                            float var34 = this.field8795[var15 - -1][var16];
                            float var35 = this.field8799[var15 + 1][var16];
                            int var36 = var1[var15][var16] & 255;
                            int var37 = var1[var15][var16 + 1] & 255;
                            int var38 = var1[var15 + 1][var16 + 1] & 255;
                            int var39 = 255 & var1[var15 + 1][var16];
                            int var40 = 0;
                            label406: for (int var41 = 0; ~var21.length < ~var41; ++var41) {
                                class684 var42 = var17[var41];
                                for (int var43 = 0; ~var43 > ~var40; ++var43) {
                                    if (var14[var43] == var42) {
                                        continue label406;
                                    }
                                }
                                var14[var40++] = var42;
                            }
                            short[] var44 = this.field8756[super.field4337 * var16 + var15] = new short[var21.length];
                            for (int var45 = 0; ~var21.length < ~var45; ++var45) {
                                int var46 = (var15 << super.field4341) - -var18[var45];
                                int var47 = (var16 << super.field4341) - -var19[var45];
                                int var48 = var46 >> this.field8776;
                                int var49 = var47 >> this.field8776;
                                int var50 = var21[var45];
                                int var51 = var20[var45];
                                int var52 = var22 == null ? 0 : var22[var45];
                                long var53 = (long) var49 | (long) var50 << 32 | (long) var51 << 48 | (long) (var48 << 16);
                                int var55 = var18[var45];
                                int var56 = var19[var45];
                                byte var57 = 74;
                                int var58 = 0;
                                float var59 = 1.0F;
                                float var60;
                                float var61;
                                int var62;
                                float var63;
                                if (~var55 == -1 && var56 == 0) {
                                    var60 = var26;
                                    var61 = var25;
                                    var62 = var57 - var36;
                                    var63 = var24;
                                } else if (~var55 == -1 && super.field4340 == var56) {
                                    var60 = var29;
                                    var62 = var57 - var37;
                                    var63 = var27;
                                    var61 = var28;
                                } else if (super.field4340 == var55 && super.field4340 == var56) {
                                    var61 = var31;
                                    var63 = var30;
                                    var60 = var32;
                                    var62 = var57 - var38;
                                } else if (~super.field4340 == ~var55 && var56 == 0) {
                                    var63 = var33;
                                    var60 = var35;
                                    var62 = var57 - var39;
                                    var61 = var34;
                                } else {
                                    float var64 = (float) var55 / (float) super.field4340;
                                    float var65 = (float) var56 / (float) super.field4340;
                                    float var66 = (-var24 + var33) * var64 + var24;
                                    float var67 = (-var25 + var34) * var64 + var25;
                                    float var68 = (var35 - var26) * var64 + var26;
                                    float var69 = (var30 - var27) * var64 + var27;
                                    float var70 = (-var28 + var31) * var64 + var28;
                                    var63 = (var69 - var66) * var65 + var66;
                                    float var71 = (var32 - var29) * var64 + var29;
                                    var61 = (var70 - var67) * var65 + var67;
                                    var60 = (-var68 + var71) * var65 + var68;
                                    int var72 = var36 - -((-var36 + var39) * var55 >> super.field4341);
                                    int var73 = ((-var37 + var38) * var55 >> super.field4341) + var37;
                                    var62 = var57 - (((-var72 + var73) * var56 >> super.field4341) + var72);
                                }
                                if (var50 != -1) {
                                    int var74 = (127 & var50) * var62 >> 7;
                                    if (~var74 <= -3) {
                                        if (var74 > 126) {
                                            var74 = 126;
                                        }
                                    } else {
                                        var74 = 2;
                                    }
                                    var58 = class172.field2403[65408 & var50 | var74];
                                    if (~(this.field8785 & 7) == -1) {
                                        float var75 = this.field8761.field4577[2] * var60 + this.field8761.field4577[0] * var63 + this.field8761.field4577[1] * var61;
                                        var59 = this.field8761.field4601 + var75 * (var75 > 0.0F ? this.field8761.field4611 : this.field8761.field4559);
                                    }
                                }
                                class206 var76 = null;
                                if ((this.field8750 - 1 & var46) == 0 && (var47 & this.field8750 + -1) == 0) {
                                    var76 = var13.method977(var53, 1);
                                }
                                int var87;
                                if (var76 == null) {
                                    int var77;
                                    if (~var50 == ~var51) {
                                        var77 = var58;
                                    } else {
                                        int var78 = (127 & var51) * var62 >> 7;
                                        if (var78 >= 2) {
                                            if (var78 > 126) {
                                                var78 = 126;
                                            }
                                        } else {
                                            var78 = 2;
                                        }
                                        var77 = class172.field2403[var78 | var51 & 65408];
                                        if (~(this.field8785 & 7) == -1) {
                                            float var79 = this.field8761.field4577[2] * var60 + this.field8761.field4577[1] * var61 + this.field8761.field4577[0] * var63;
                                            float var80 = this.field8761.field4601 + (!(var59 > 0.0F) ? this.field8761.field4559 : this.field8761.field4611) * var59;
                                            int var81 = var77 >> 16 & 255;
                                            int var82 = (var77 & 65402) >> 8;
                                            int var83 = 255 & var77;
                                            int var84 = (int) ((float) var81 * var80);
                                            if (var84 < 0) {
                                                var84 = 0;
                                            } else if (~var84 < -256) {
                                                var84 = 255;
                                            }
                                            int var85 = (int) ((float) var82 * var80);
                                            if (var85 >= 0) {
                                                if (~var85 < -256) {
                                                    var85 = 255;
                                                }
                                            } else {
                                                var85 = 0;
                                            }
                                            int var86 = (int) ((float) var83 * var80);
                                            if (~var86 > -1) {
                                                var86 = 0;
                                            } else if (~var86 < -256) {
                                                var86 = 255;
                                            }
                                            var77 = var84 << 16 | var85 << 8 | var86;
                                        }
                                    }
                                    if (Stream.method5102()) {
                                        var9.method5112((float) var46);
                                        var9.method5112((float) (var52 + this.method2404((byte) 118, var46, var47)));
                                        var9.method5112((float) var47);
                                        var9.method5112((float) var46);
                                        var9.method5112((float) var47);
                                        if (this.field8784 != null) {
                                            var9.method5112((float) (var23 == null ? 0 : var23[var45] + -1));
                                        }
                                        if (~(this.field8785 & 7) != -1) {
                                            var9.method5112(var63);
                                            var9.method5112(var61);
                                            var9.method5112(var60);
                                        }
                                    } else {
                                        var9.method5105((float) var46);
                                        var9.method5105((float) (this.method2404((byte) 120, var46, var47) - -var52));
                                        var9.method5105((float) var47);
                                        var9.method5105((float) var46);
                                        var9.method5105((float) var47);
                                        if (this.field8784 != null) {
                                            var9.method5105((float) (var23 != null ? var23[var45] + -1 : 0));
                                        }
                                        if (~(7 & this.field8785) != -1) {
                                            var9.method5105(var63);
                                            var9.method5105(var61);
                                            var9.method5105(var60);
                                        }
                                    }
                                    if (~this.field8761.field4595 != -1) {
                                        var10.method5099(-16777216 | var77);
                                    } else {
                                        var10.method5101(var77 | -16777216);
                                    }
                                    var87 = this.field8778++;
                                    var44[var45] = (short) var87;
                                    if (~var50 != 0) {
                                        var11[var87] = var17[var45];
                                    }
                                    var13.method968((byte) -111, var53, new class695(var44[var45]));
                                } else {
                                    var44[var45] = ((class695) var76).field10142;
                                    var87 = var44[var45] & 65535;
                                    if (var50 != -1 && ~var11[var87].field3177 < ~var17[var45].field3177) {
                                        var11[var87] = var17[var45];
                                    }
                                }
                                for (int var88 = 0; var40 > var88; ++var88) {
                                    var14[var88].method5018(var87, var62, var58, var59, (byte) 49);
                                }
                                ++this.field8775;
                            }
                        }
                    }
                }
                for (int var89 = 0; var89 < this.field8778; ++var89) {
                    class684 var90 = var11[var89];
                    if (var90 != null) {
                        var90.method5017(var89, (byte) -1);
                    }
                }
                for (int var91 = 0; super.field4337 > var91; ++var91) {
                    for (int var92 = 0; ~super.field4336 < ~var92; ++var92) {
                        short[] var93 = this.field8756[super.field4337 * var92 + var91];
                        if (var93 != null) {
                            int var94 = 0;
                            int var95 = 0;
                            while (var93.length > var95) {
                                int var96 = 65535 & var93[var95++];
                                int var97 = var93[var95++] & 65535;
                                int var98 = 65535 & var93[var95++];
                                class684 var99 = var11[var96];
                                class684 var100 = var11[var97];
                                class684 var101 = var11[var98];
                                class684 var102 = null;
                                if (var99 != null) {
                                    var99.method5016(var91, var94, (byte) -89, var92);
                                    var102 = var99;
                                }
                                if (var100 != null) {
                                    var100.method5016(var91, var94, (byte) -89, var92);
                                    if (var102 == null || var100.field3177 < var102.field3177) {
                                        var102 = var100;
                                    }
                                }
                                if (var101 != null) {
                                    var101.method5016(var91, var94, (byte) -89, var92);
                                    if (var102 == null || var101.field3177 < var102.field3177) {
                                        var102 = var101;
                                    }
                                }
                                if (var102 != null) {
                                    if (var99 != null) {
                                        var102.method5017(var96, (byte) -1);
                                    }
                                    if (var100 != null) {
                                        var102.method5017(var97, (byte) -1);
                                    }
                                    if (var101 != null) {
                                        var102.method5017(var98, (byte) -1);
                                    }
                                    var102.method5016(var91, var94, (byte) -89, var92);
                                }
                                ++var94;
                            }
                        }
                    }
                }
                var9.method5103();
                var10.method5103();
                this.field8792 = this.field8761.method850(false, 0);
                this.field8792.method169(4, this.field8778 * 4, var7, 94);
                this.field8796 = this.field8761.method850(false, 0);
                this.field8796.method169(var6, this.field8778 * var6, var8, 114);
                if (~(7 & this.field8785) == -1) {
                    if (this.field8784 == null) {
                        this.field8791 = this.field8761.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11304 }), new class240(class778.field11302) }, (byte) 97);
                    } else {
                        this.field8791 = this.field8761.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11304, class778.field11303 }), new class240(class778.field11302) }, (byte) 127);
                    }
                } else if (this.field8784 == null) {
                    this.field8791 = this.field8761.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11304, class778.field11300 }), new class240(class778.field11302) }, (byte) 54);
                } else {
                    this.field8791 = this.field8761.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11304, class778.field11303, class778.field11300 }), new class240(class778.field11302) }, (byte) 86);
                }
                int var103 = 0;
                for (int var104 = 0; var4.length > var104; ++var104) {
                    if (var4[var104].field9928 > 0) {
                        var4[var103++] = var4[var104];
                    }
                }
                this.field8788 = new class684[var103];
                long[] var105 = new long[var103];
                for (int var106 = 0; var103 > var106; ++var106) {
                    class684 var107 = var4[var106];
                    var105[var106] = var107.field3177;
                    this.field8788[var106] = var107;
                    var107.method5014(this.field8778, 4);
                }
                class122.method1059(var105, this.field8788, (byte) 48);
                if (this.field8783 != null) {
                    this.field8783.method5330(112);
                }
            } else {
                this.field8783 = null;
            }
            this.field8797 = null;
            this.field8753 = null;
            this.field8762 = null;
            this.field8784 = null;
            this.field8786 = null;
            this.field8765 = this.field8771 = null;
            this.field8793 = this.field8795 = this.field8799 = null;
            this.field8751 = null;
            this.field8790 = null;
        } catch (RuntimeException var109) {
            throw class759.method5498(var109, field8801[8] + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III[[ZZII)V", line = 691)
    public final void method1515(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        try {
            ++field8763;
            this.method4444(0, arg1, arg3, arg2, arg5, arg6, arg0, arg4);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8801[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8801[2] : field8801[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Luf;[I)V", line = 703)
    public final void method1499(class471 arg0, int[] arg1) {
        try {
            this.field8754.method3868(-71, new class371(this.field8761, this, arg0, arg1));
            ++field8760;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8801[1] + (arg0 != null ? field8801[2] : field8801[0]) + ',' + (arg1 != null ? field8801[2] : field8801[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 713)
    public static void method4443(int arg0) {
        try {
            field8782 = null;
            if (arg0 < 67) {
                method4443(-111);
            }
            field8749 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8801[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 731)
    public final boolean method1501(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field8759;
            if (this.field8783 != null && arg0 != null) {
                int var7 = arg1 - (this.field8761.field4649 * arg2 >> 8) >> this.field8761.field4606;
                int var8 = -(this.field8761.field4579 * arg2 >> 8) + arg3 >> this.field8761.field4606;
                return this.field8783.method5322(var8, (byte) -70, var7, arg0);
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8801[14] + (arg0 != null ? field8801[2] : field8801[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II[[ZIIIIZ)V", line = 747)
    private final void method4444(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            if (arg0 != 0) {
                this.field8751 = null;
            }
            ++field8752;
            if (this.field8788 != null) {
                int var9 = arg3 + arg3 + 1;
                int var10 = var9 * var9;
                if (var10 > class233.field3515.length) {
                    class233.field3515 = new int[var10];
                }
                int var11 = -arg3 + arg6;
                int var12 = var11;
                if (~var11 > -1) {
                    var11 = 0;
                }
                int var13 = -arg3 + arg1;
                int var14 = var13;
                if (var13 < 0) {
                    var13 = 0;
                }
                int var15 = arg3 + arg6;
                if (~(super.field4337 - 1) > ~var15) {
                    var15 = super.field4337 + -1;
                }
                int var16 = arg1 + arg3;
                class272.field4127 = 0;
                if (var16 > super.field4336 - 1) {
                    var16 = super.field4336 + -1;
                }
                for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                    boolean[] var18 = arg2[-var12 + var17];
                    for (int var19 = var13; var19 <= var16; ++var19) {
                        if (var18[-var14 + var19]) {
                            class233.field3515[class272.field4127++] = super.field4337 * var19 + var17;
                        }
                    }
                }
                if (arg4 == -1) {
                    this.field8761.method2486(-8573);
                } else {
                    this.field8761.method2469((float) arg4, (byte) 111);
                    this.field8761.method2458((byte) 20);
                }
                this.field8761.method2495(arg0 ^ 4);
                this.field8761.method2472((byte) 24, ~(7 & this.field8785) != -1);
                this.field8761.method2477(arg0, false, -1, false);
                this.field8761.method856(0, this.field8796, true);
                for (int var20 = 0; ~var20 > ~this.field8788.length; ++var20) {
                    this.field8788[var20].method5020(class272.field4127, (byte) 101, class233.field3515);
                }
                class770 var21 = this.field8761.method2468((byte) -123);
                var21.method2389(0, -1, 0);
                this.field8761.method2418(arg0 ^ 17654);
                if (!this.field8754.method3873(88)) {
                    int var22 = this.field8761.field4590;
                    int var23 = this.field8761.field4608;
                    this.field8761.method584(0, var23, this.field8761.field4567);
                    this.field8761.method2472((byte) 24, false);
                    this.field8761.method2473((byte) -99, false);
                    this.field8761.method2457(128, (byte) -25);
                    this.field8761.method2477(0, false, -2, false);
                    this.field8761.method2467(12, this.field8761.field4553);
                    this.field8761.method2417(-79, class206.field3175, class684.field9909);
                    this.field8761.method2498(0, class114.field1352, (byte) 84);
                    this.field8761.method2443(0, class335.field5233, false);
                    for (class206 var24 = this.field8754.method3863((byte) 64); var24 != null; var24 = this.field8754.method3862(arg0 + -353)) {
                        class371 var25 = (class371) var24;
                        var25.method2995(arg6, arg1, false, arg3, arg2);
                    }
                    this.field8761.method2498(0, class48.field546, (byte) 65);
                    this.field8761.method2443(0, class48.field546, false);
                    this.field8761.method2467(12, (class479) null);
                    this.field8761.method584(var22, var23, this.field8761.field4567);
                }
                if (this.field8783 != null) {
                    this.field8761.method856(0, this.field8796, true);
                    this.field8761.method856(1, this.field8792, true);
                    this.field8761.method868(false, this.field8791);
                    this.field8783.method5323(arg7, arg2, arg0 + 1, arg1, arg6, arg3);
                    return;
                }
            }
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field8801[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8801[2] : field8801[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "fa", descriptor = "(IILr;)Lr;", line = 892)
    public final class194 method1504(int arg0, int arg1, class194 arg2) {
        try {
            ++field8777;
            if ((this.field8770[arg0][arg1] & 1) == 0) {
                return null;
            } else {
                int var4 = super.field4340 >> this.field8761.field4606;
                class355 var5 = (class355) arg2;
                class355 var6;
                if (var5 != null && var5.method2909(-810, var4, var4)) {
                    var6 = var5;
                    var5.method2911(-75);
                } else {
                    var6 = new class355(this.field8761, var4, var4);
                }
                var6.method2912(var4, 0, 0, var4, -8823);
                this.method4446(0, var6, arg1, arg0);
                return var6;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8801[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8801[2] : field8801[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III[[ZZI)V", line = 918)
    public final void method1513(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        try {
            this.method4444(0, arg1, arg3, arg2, -1, arg5, arg0, arg4);
            ++field8766;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field8801[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8801[2] : field8801[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lkd;IIII[[I[[II)V", line = 1394)
    public class597(class296 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        try {
            this.field8761 = arg0;
            this.field8776 = super.field4341 + -2;
            this.field8795 = new float[super.field4337 - -1][super.field4336 + 1];
            this.field8756 = new short[arg3 * arg4][];
            this.field8750 = 1 << this.field8776;
            this.field8793 = new float[super.field4337 + 1][super.field4336 - -1];
            this.field8799 = new float[super.field4337 + 1][super.field4336 + 1];
            this.field8765 = new int[arg3][arg4][];
            this.field8753 = new class684[arg3][arg4][];
            this.field8797 = new byte[arg3 + 1][arg4 + 1];
            this.field8785 = arg2;
            this.field8751 = new int[arg3][arg4][];
            this.field8762 = new int[arg3][arg4][];
            this.field8771 = new int[arg3][arg4][];
            this.field8770 = new byte[arg3][arg4];
            this.field8786 = new int[arg3][arg4][];
            for (int var9 = 0; var9 <= super.field4336; ++var9) {
                for (int var10 = 0; ~super.field4337 <= ~var10; ++var10) {
                    int var11 = super.field4338[var10][var9];
                    if ((float) var11 > this.field8767) {
                        this.field8767 = (float) var11;
                    }
                    if ((float) var11 < this.field8755) {
                        this.field8755 = (float) var11;
                    }
                    if (var10 > 0 && ~var9 < -1 && ~super.field4337 < ~var10 && var9 < super.field4336) {
                        int var12 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                        int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                        this.field8793[var10][var9] = (float) var12 * var14;
                        this.field8795[var10][var9] = (float) (-arg7 * 2) * var14;
                        this.field8799[var10][var9] = (float) var13 * var14;
                    }
                }
            }
            ++this.field8767;
            --this.field8755;
            this.field8790 = new class112(128);
            if (~(this.field8785 & 16) != -1) {
                this.field8783 = new class730(this.field8761, this);
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field8801[18] + (arg0 != null ? field8801[2] : field8801[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8801[2] : field8801[0]) + ',' + (arg6 != null ? field8801[2] : field8801[0]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIBII)V", line = 936)
    public static final void method4445(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        try {
            ++field8769;
            int var8 = arg3 + -334;
            if (arg5 != 1) {
                method4445(53, 123, 43, 22, -26, (byte) 34, -115, 68);
            }
            if (~var8 <= -1) {
                if (var8 > 100) {
                    var8 = 100;
                }
            } else {
                var8 = 0;
            }
            int var9 = (-class685.field9939 + class106.field1225) * var8 / 100 + class685.field9939;
            int var17 = arg7 * var9 >> 8;
            class726.field10487 = class726.field10489 * var9 >> 8;
            int var10 = 16383 & -arg0 + 16384;
            int var11 = 16383 & 16384 - arg4;
            int var12 = 0;
            int var13 = 0;
            int var14 = var17;
            if (~var10 != -1) {
                var13 = class298.field4704[var10] * -var17 >> 14;
                var14 = class298.field4703[var10] * var17 >> 14;
            }
            if (var11 != 0) {
                var12 = class298.field4704[var11] * var14 >> 14;
                var14 = class298.field4703[var11] * var14 >> 14;
            }
            class144.field1749 = -var13 + arg1;
            class271.field4116 = -var12 + arg2;
            class683.field9899 = -var14 + arg6;
            class93.field1052 = arg4;
            class320.field5061 = arg0;
            class684.field9916 = 0;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field8801[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 988)
    public final void method1514(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field8780;
            if (this.field8783 != null && arg0 != null) {
                int var7 = arg1 - (this.field8761.field4649 * arg2 >> 8) >> this.field8761.field4606;
                int var8 = -(this.field8761.field4579 * arg2 >> 8) + arg3 >> this.field8761.field4606;
                this.field8783.method5327(arg0, var8, (byte) 15, var7);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8801[15] + (arg0 != null ? field8801[2] : field8801[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILvu;II)V", line = 1004)
    private final void method4446(int arg0, class355 arg1, int arg2, int arg3) {
        try {
            ++field8772;
            int[] var5 = this.field8765[arg3][arg2];
            int[] var6 = this.field8771[arg3][arg2];
            int var7 = var5.length;
            if (var7 > class759.field11006.length) {
                class86.field962 = new int[var7];
                class759.field11006 = new int[var7];
            }
            for (int var8 = arg0; var7 > var8; ++var8) {
                class759.field11006[var8] = var5[var8] >> this.field8761.field4606;
                class86.field962[var8] = var6[var8] >> this.field8761.field4606;
            }
            int var9 = 0;
            while (var9 < var7) {
                int var10 = class759.field11006[var9];
                int var11 = class86.field962[var9++];
                int var12 = class759.field11006[var9];
                int var13 = class86.field962[var9++];
                int var14 = class759.field11006[var9];
                int var15 = class86.field962[var9++];
                if ((var10 - var12) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13)) > 0) {
                    arg1.method2906(var14, var15, var10, var13, var11, 124, var12);
                }
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field8801[6] + arg0 + ',' + (arg1 != null ? field8801[2] : field8801[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V", line = 1071)
    public final void method1505(int arg0, int arg1) {
        try {
            ++field8758;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8801[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "ka", descriptor = "(III)V", line = 1081)
    public final void method1509(int arg0, int arg1, int arg2) {
        try {
            ++field8781;
            if (~arg2 < ~(this.field8797[arg0][arg1] & 255)) {
                this.field8797[arg0][arg1] = (byte) arg2;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8801[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1091)
    public final void method1506(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        try {
            ++field8774;
            int var18 = arg9.length;
            int[] var19 = new int[var18 * 3];
            int[] var20 = new int[var18 * 3];
            int[] var21 = new int[var18 * 3];
            int[] var22 = new int[var18 * 3];
            int[] var23 = new int[var18 * 3];
            int[] var24 = new int[var18 * 3];
            int[] var25 = arg3 != null ? new int[var18 * 3] : null;
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
            throw class759.method5498(var33, field8801[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8801[2] : field8801[0]) + ',' + (arg3 != null ? field8801[2] : field8801[0]) + ',' + (arg4 != null ? field8801[2] : field8801[0]) + ',' + (arg5 != null ? field8801[2] : field8801[0]) + ',' + (arg6 != null ? field8801[2] : field8801[0]) + ',' + (arg7 != null ? field8801[2] : field8801[0]) + ',' + (arg8 != null ? field8801[2] : field8801[0]) + ',' + (arg9 != null ? field8801[2] : field8801[0]) + ',' + (arg10 != null ? field8801[2] : field8801[0]) + ',' + (arg11 != null ? field8801[2] : field8801[0]) + ',' + (arg12 != null ? field8801[2] : field8801[0]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1177)
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        try {
            ++field8787;
            if (~this.field8789 < -1) {
                class421 var9 = this.field8761.method2439(true, this.field8775);
                int var10 = 0;
                int var11 = 32767;
                int var12 = -32768;
                for (int var13 = 0; ~var13 > -5; ++var13) {
                    var10 = 0;
                    Buffer var14 = var9.method3256(true, (byte) -119);
                    if (var14 != null) {
                        Stream var15 = this.field8761.method2476(var14, (byte) -3);
                        if (Stream.method5102()) {
                            for (int var16 = arg4; arg6 > var16; ++var16) {
                                int var17 = super.field4337 * var16 + arg3;
                                for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                    if (arg7[-arg3 + var18][-arg4 + var16]) {
                                        short[] var19 = this.field8756[var17];
                                        if (var19 != null) {
                                            for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                                int var21 = 65535 & var19[var20];
                                                if (var11 > var21) {
                                                    var11 = var21;
                                                }
                                                var15.method5100(var21);
                                                if (~var12 > ~var21) {
                                                    var12 = var21;
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
                                int var23 = super.field4337 * var22 + arg3;
                                for (int var24 = arg3; ~arg5 < ~var24; ++var24) {
                                    if (arg7[-arg3 + var24][-arg4 + var22]) {
                                        short[] var25 = this.field8756[var23];
                                        if (var25 != null) {
                                            for (int var26 = 0; var26 < var25.length; ++var26) {
                                                int var27 = var25[var26] & 65535;
                                                if (~var11 < ~var27) {
                                                    var11 = var27;
                                                }
                                                var15.method5108(var27);
                                                if (~var27 < ~var12) {
                                                    var12 = var27;
                                                }
                                                ++var10;
                                            }
                                        }
                                    }
                                    ++var23;
                                }
                            }
                        }
                        var15.method5103();
                        if (var9.method3257(-3841)) {
                            break;
                        }
                    }
                }
                if (~var10 < -1) {
                    this.field8761.method2438((byte) 25);
                    this.field8761.method2445(8, false);
                    this.field8761.method2472((byte) 24, false);
                    this.field8761.method2449(false, true);
                    this.field8761.method2473((byte) -127, false);
                    this.field8761.method2457(0, (byte) -89);
                    this.field8761.method2477(0, false, -2, false);
                    this.field8761.method2467(12, (class479) null);
                    class770 var28 = this.field8761.method2468((byte) -110);
                    float[] var29 = this.field8761.method2484(0);
                    var29[1] = 0.0F;
                    var29[3] = 0.0F;
                    var29[11] = 0.0F;
                    var29[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field8761.field4492;
                    var29[5] = (float) arg2 / ((float) super.field4340 * 128.0F * (float) this.field8761.field4416);
                    var29[4] = 0.0F;
                    var29[9] = 0.0F;
                    var29[14] = -this.field8755 / (this.field8767 - this.field8755);
                    var29[6] = 0.0F;
                    var29[8] = 0.0F;
                    var29[7] = 0.0F;
                    var29[15] = 1.0F;
                    var29[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8761.field4416;
                    var29[10] = 1.0F / (this.field8767 - this.field8755);
                    var29[0] = (float) arg2 / ((float) super.field4340 * 128.0F * (float) this.field8761.field4492);
                    var29[2] = 0.0F;
                    var28.method5568(true, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                    this.field8761.method2470((byte) -124);
                    this.field8761.method2418(17654);
                    if (~(this.field8785 & 7) != -1) {
                        this.field8761.method2472((byte) 24, true);
                        this.field8761.method845((byte) -71);
                    } else {
                        this.field8761.method2472((byte) 24, false);
                    }
                    this.field8761.method869(false, (byte) -95);
                    this.field8761.method856(0, this.field8796, true);
                    this.field8761.method856(1, this.field8792, true);
                    this.field8761.method868(false, this.field8791);
                    this.field8761.method877(var12 + 1 + -var11, var9, var11, 0, class769.field11134, var10 / 3, (byte) -102);
                    this.field8761.method869(true, (byte) -81);
                }
            }
        } catch (RuntimeException var31) {
            throw class759.method5498(var31, field8801[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8801[2] : field8801[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1371)
    public final void method1507(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field8800;
            if (this.field8783 != null && arg0 != null) {
                int var7 = -(this.field8761.field4649 * arg2 >> 8) + arg1 >> this.field8761.field4606;
                int var8 = -(this.field8761.field4579 * arg2 >> 8) + arg3 >> this.field8761.field4606;
                this.field8783.method5325(var7, 1, arg0, var8);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8801[11] + (arg0 != null ? field8801[2] : field8801[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4447(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 120);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!im", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4448(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
