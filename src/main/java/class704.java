import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class704 extends class281 {

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Luh;")
    private class168 field9513 = new class168();

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lqo;")
    public class22 field9529;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    private int field9521;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "[[[I")
    private int[][][] field9502;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "[[B")
    private byte[][] field9497;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[[[I")
    public int[][][] field9525;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "[[[I")
    public int[][][] field9510;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "[[F")
    private float[][] field9542;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "[[[Ljn;")
    private class717[][][] field9500;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "[[[I")
    private int[][][] field9515;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "[[F")
    private float[][] field9538;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "[[B")
    private byte[][] field9530;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "[[S")
    public short[][] field9524;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    private int field9517;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[[[I")
    public int[][][] field9491;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "[[F")
    private float[][] field9540;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field9492;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Leq;")
    private class213 field9535;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lmha;")
    private class416 field9523;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lmn;")
    public static class368 field9498 = new class368();

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field9527 = -1;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
    public static int[] field9526 = new int[8];

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field9495;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    private int field9503;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field9511;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field9512;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    private int field9514;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field9516;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field9519;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
    private int field9537;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    private int field9541;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "Lhca;")
    private class490 field9536;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "Lnh;")
    private class744 field9531;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "Lnh;")
    public class744 field9532;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lnh;")
    public class744 field9533;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lnh;")
    public class744 field9534;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Ljava/lang/String;")
    public static String field9522;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "[Ljn;")
    private class717[] field9539;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "[[[I")
    private int[][][] field9509;

    @OriginalMember(owner = "client!ed", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1149(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9508;
        if (this.field9523 != null && arg0 != null) {
            int var7 = arg1 - (this.field9529.field594 * arg2 >> 8) >> this.field9529.field553;
            int var8 = -(this.field9529.field599 * arg2 >> 8) + arg3 >> this.field9529.field553;
            this.field9523.method2562(arg0, var7, var8, 70);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1161(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9506;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1159(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ed", name = "YA", descriptor = "()V")
    public final void method1153() {
        if (~this.field9541 >= -1) {
            this.field9523 = null;
        } else {
            byte[][] var1 = new byte[super.field3937 + 1][super.field3940 + 1];
            for (int var2 = 1; ~super.field3937 < ~var2; ++var2) {
                for (int var103 = 1; var103 < super.field3940; ++var103) {
                    var1[var2][var103] = (byte) ((this.field9530[var2][var103 + 1] >> 3) + (this.field9530[var2][var103 + -1] >> 2) + (this.field9530[var2 + 1][var103] >> 3) + (this.field9530[var2 - 1][var103] >> 2) + (this.field9530[var2][var103] >> 1));
                }
            }
            this.field9539 = new class717[this.field9535.method1459(1)];
            this.field9535.method1462(3, this.field9539);
            for (int var3 = 0; this.field9539.length > var3; ++var3) {
                this.field9539[var3].method3990(Integer.MAX_VALUE, this.field9541);
            }
            int var4 = 24;
            if (this.field9509 != null) {
                var4 += 4;
            }
            if ((7 & this.field9492) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field9529.field552.method3777(this.field9541 * var4, false);
            Stream var6 = new Stream(var5);
            class717[] var7 = new class717[this.field9541];
            int var8 = class230.method1605(this.field9541 / 4, 4096);
            if (~var8 > -2) {
                var8 = 1;
            }
            class213 var9 = new class213(var8);
            class717[] var10 = new class717[this.field9537];
            for (int var11 = 0; ~var11 > ~super.field3937; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field3940; ++var30) {
                    if (this.field9510[var11][var30] != null) {
                        class717[] var31 = this.field9500[var11][var30];
                        int[] var32 = this.field9525[var11][var30];
                        int[] var33 = this.field9491[var11][var30];
                        int[] var34 = this.field9502[var11][var30];
                        int[] var35 = this.field9510[var11][var30];
                        int[] var36 = this.field9515 != null ? this.field9515[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field9509 != null ? this.field9509[var11][var30] : null;
                        float var38 = this.field9542[var11][var30];
                        float var39 = this.field9538[var11][var30];
                        float var40 = this.field9540[var11][var30];
                        float var41 = this.field9542[var11][var30 - -1];
                        float var42 = this.field9538[var11][var30 + 1];
                        float var43 = this.field9540[var11][var30 + 1];
                        float var44 = this.field9542[var11 - -1][var30 + 1];
                        float var45 = this.field9538[var11 + 1][var30 + 1];
                        float var46 = this.field9540[var11 + 1][var30 - -1];
                        float var47 = this.field9542[var11 + 1][var30];
                        float var48 = this.field9538[var11 + 1][var30];
                        float var49 = this.field9540[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label341: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class717 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field9524[super.field3937 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field3938) + var32[var57];
                            int var59 = (var30 << super.field3938) - -var33[var57];
                            int var60 = var58 >> this.field9521;
                            int var61 = var59 >> this.field9521;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (~var67 == -1 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var40;
                            } else if (var67 == 0 && super.field3942 == var68) {
                                var74 = var43;
                                var71 = var42;
                                var73 = var69 - var51;
                                var72 = var41;
                            } else if (~super.field3942 == ~var67 && super.field3942 == var68) {
                                var72 = var44;
                                var71 = var45;
                                var74 = var46;
                                var73 = var69 - var52;
                            } else if (~super.field3942 == ~var67 && ~var68 == -1) {
                                var71 = var48;
                                var74 = var49;
                                var72 = var47;
                                var73 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field3942;
                                float var76 = (float) var68 / (float) super.field3942;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                float var82 = (var46 - var43) * var75 + var43;
                                var71 = (var81 - var78) * var76 + var78;
                                var72 = (-var77 + var80) * var76 + var77;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field3938) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field3938) + var51;
                                var73 = var69 - (var83 - -((-var83 + var84) * var68 >> super.field3938));
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(7 & this.field9492) == -1) {
                                    float var87 = this.field9529.field647[2] * var74 + this.field9529.field647[0] * var72 + this.field9529.field647[1] * var71;
                                    var85 = this.field9529.field590 + (var87 > 0.0F ? this.field9529.field654 : this.field9529.field693) * var87;
                                }
                                var70 = class456.field6424[65408 & var62 | var86];
                            }
                            class362 var88 = null;
                            if ((var58 & this.field9517 + -1) == 0 && (this.field9517 + -1 & var59) == 0) {
                                var88 = var9.method1465(var65, -6008);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class89) var88).field1575;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && var7[var89].field5204 > var31[var57].field5204) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (var63 & 127) * var73 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class456.field6424[65408 & var63 | var90];
                                    if (~(7 & this.field9492) == -1) {
                                        float var92 = this.field9529.field647[2] * var74 + this.field9529.field647[0] * var72 + this.field9529.field647[1] * var71;
                                        float var93 = (var85 > 0.0F ? this.field9529.field654 : this.field9529.field693) * var85 + this.field9529.field590;
                                        int var94 = (var91 & 16763806) >> 16;
                                        int var95 = (65321 & var91) >> 8;
                                        int var96 = 255 & var91;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        var91 = var97 << 16 | var98 << 8 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field9529.field597) {
                                    var6.method3792((float) var58);
                                    var6.method3792((float) (this.method1853(var58, var59, (byte) -101) - -var64));
                                    var6.method3792((float) var59);
                                    var6.method3793((byte) (var91 >> 16));
                                    var6.method3793((byte) (var91 >> 8));
                                    var6.method3793((byte) var91);
                                    var6.method3793(-1);
                                    var6.method3792((float) var58);
                                    var6.method3792((float) var59);
                                    if (this.field9509 != null) {
                                        var6.method3792((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field9492) != -1) {
                                        var6.method3792(var72);
                                        var6.method3792(var71);
                                        var6.method3792(var74);
                                    }
                                } else {
                                    var6.method3780((float) var58);
                                    var6.method3780((float) (this.method1853(var58, var59, (byte) -121) + var64));
                                    var6.method3780((float) var59);
                                    var6.method3793((byte) (var91 >> 16));
                                    var6.method3793((byte) (var91 >> 8));
                                    var6.method3793((byte) var91);
                                    var6.method3793(-1);
                                    var6.method3780((float) var58);
                                    var6.method3780((float) var59);
                                    if (this.field9509 != null) {
                                        var6.method3780((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field9492) != -1) {
                                        var6.method3780(var72);
                                        var6.method3780(var71);
                                        var6.method3780(var74);
                                    }
                                }
                                var89 = this.field9503++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1468((byte) 114, var65, new class89(var56[var57]));
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method3993((byte) 97, var89, var73, var70, var85);
                            }
                            ++this.field9514;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field9503 > var12; ++var12) {
                class717 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3995(3, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field3937; ++var13) {
                for (int var18 = 0; var18 < super.field3940; ++var18) {
                    short[] var19 = this.field9524[super.field3937 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class717 var25 = var7[var22];
                            class717 var26 = var7[var23];
                            class717 var27 = var7[var24];
                            class717 var28 = null;
                            if (var25 != null) {
                                var25.method3989(var13, (byte) 18, var18, var20);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3989(var13, (byte) 18, var18, var20);
                                if (var28 == null || var28.field5204 > var26.field5204) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3989(var13, (byte) 18, var18, var20);
                                if (var28 == null || var27.field5204 < var28.field5204) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3995(3, var22);
                                }
                                if (var26 != null) {
                                    var28.method3995(3, var23);
                                }
                                if (var27 != null) {
                                    var28.method3995(3, var24);
                                }
                                var28.method3989(var13, (byte) 18, var18, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3784();
            this.field9536 = this.field9529.method191(8448, var5, false, var4, var6.method3788());
            this.field9533 = new class744(this.field9536, 5126, 3, 0);
            this.field9531 = new class744(this.field9536, 5121, 4, 12);
            byte var14;
            if (this.field9509 != null) {
                var14 = 28;
                this.field9534 = new class744(this.field9536, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field9534 = new class744(this.field9536, 5126, 2, 16);
            }
            if ((7 & this.field9492) != 0) {
                this.field9532 = new class744(this.field9536, 5126, 3, var14);
            }
            long[] var15 = new long[this.field9539.length];
            for (int var16 = 0; var16 < this.field9539.length; ++var16) {
                class717 var17 = this.field9539[var16];
                var15[var16] = var17.field5204;
                var17.method3996(17795, this.field9503);
            }
            class501.method2955(this.field9539, var15, -21);
            if (this.field9523 != null) {
                this.field9523.method2568(0);
            }
        }
        ++field9504;
        this.field9515 = null;
        this.field9542 = this.field9538 = this.field9540 = null;
        this.field9509 = null;
        this.field9500 = null;
        this.field9510 = null;
        this.field9530 = null;
        this.field9535 = null;
        this.field9502 = null;
        this.field9525 = this.field9491 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIILuc;)V")
    private final void method3924(byte arg0, int arg1, int arg2, class28 arg3) {
        ++field9511;
        int[] var5 = this.field9525[arg1][arg2];
        if (arg0 != -82) {
            this.method1158((class669) null, (int[]) null);
        }
        int[] var6 = this.field9491[arg1][arg2];
        int var7 = var5.length;
        if (this.field9529.field702.length < var7) {
            this.field9529.field705 = new int[var7];
            this.field9529.field702 = new int[var7];
        }
        int[] var8 = this.field9529.field702;
        int[] var9 = this.field9529.field705;
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = var5[var10] >> this.field9529.field553;
            var9[var10] = var6[var10] >> this.field9529.field553;
        }
        int var11 = 0;
        while (var11 < var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) - (var15 - var13) * (var16 - var14) > 0) {
                arg3.method395(var16, var12, var13, 63, var14, var17, var15);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public final void method1150(int arg0, int arg1) {
        ++field9496;
    }

    @OriginalMember(owner = "client!ed", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1151(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9493;
        if (this.field9523 != null && arg0 != null) {
            int var7 = arg1 - (this.field9529.field594 * arg2 >> 8) >> this.field9529.field553;
            int var8 = -(this.field9529.field599 * arg2 >> 8) + arg3 >> this.field9529.field553;
            this.field9523.method2570(var7, var8, (byte) 107, arg0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lqo;IIII[[I[[II)V")
    public class704(class22 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9529 = arg0;
        this.field9521 = super.field3938 + -2;
        this.field9502 = new int[arg3][arg4][];
        this.field9497 = new byte[arg3][arg4];
        this.field9525 = new int[arg3][arg4][];
        this.field9510 = new int[arg3][arg4][];
        this.field9542 = new float[super.field3937 + 1][super.field3940 + 1];
        this.field9500 = new class717[arg3][arg4][];
        this.field9515 = new int[arg3][arg4][];
        this.field9538 = new float[super.field3937 + 1][super.field3940 + 1];
        this.field9530 = new byte[arg3 + 1][arg4 - -1];
        this.field9524 = new short[arg3 * arg4][];
        this.field9517 = 1 << this.field9521;
        this.field9491 = new int[arg3][arg4][];
        this.field9540 = new float[super.field3937 + 1][super.field3940 + 1];
        this.field9492 = arg2;
        for (int var9 = 1; super.field3940 > var9; ++var9) {
            for (int var10 = 1; super.field3937 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * arg7 * 4 + var12 * var12)));
                this.field9542[var10][var9] = (float) var11 * var13;
                this.field9538[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field9540[var10][var9] = (float) var12 * var13;
            }
        }
        this.field9535 = new class213(128);
        if ((16 & this.field9492) != 0) {
            this.field9523 = new class416(this.field9529, this);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1154(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9501;
        if (this.field9523 != null && arg0 != null) {
            int var7 = -(this.field9529.field594 * arg2 >> 8) + arg1 >> this.field9529.field553;
            int var8 = -(this.field9529.field599 * arg2 >> 8) + arg3 >> this.field9529.field553;
            return this.field9523.method2565(var7, (byte) 88, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
    public static final boolean method3925(int arg0, int arg1, int arg2) {
        if (arg2 != 458752) {
            field9494 = -28;
        }
        ++field9495;
        return ~(458752 & arg1) != -1 | class426.method2606(false, arg0, arg1) || class138.method1119(arg1, -121, arg0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1160(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3929(-1, arg2, arg4, -49, arg0, arg5, arg3, arg1);
        ++field9512;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method3926(int arg0) {
        if (arg0 != 8448) {
            field9522 = null;
        }
        field9526 = null;
        field9522 = null;
        field9498 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9519;
        if (~this.field9541 < -1) {
            this.field9529.method224(-32);
            this.field9529.method357(false, 2);
            this.field9529.method173(false, 92);
            this.field9529.method215(117, false);
            this.field9529.method205(0, false);
            this.field9529.method222(0, 1);
            this.field9529.method229(-2, -100);
            this.field9529.method256((byte) -86, (class36) null);
            class192.field2840[0] = (float) arg2 / ((float) super.field3942 * 128.0F * (float) this.field9529.field510);
            class192.field2840[8] = 0.0F;
            class192.field2840[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9529.field463;
            class192.field2840[7] = 0.0F;
            class192.field2840[6] = 0.0F;
            class192.field2840[5] = (float) arg2 / ((float) super.field3942 * 128.0F * (float) this.field9529.field463);
            class192.field2840[1] = 0.0F;
            class192.field2840[4] = 0.0F;
            class192.field2840[14] = 0.0F;
            class192.field2840[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field9529.field510) + -1.0F;
            class192.field2840[10] = 0.0F;
            class192.field2840[15] = 1.0F;
            class192.field2840[3] = 0.0F;
            class192.field2840[2] = 0.0F;
            class192.field2840[9] = 0.0F;
            class192.field2840[11] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class192.field2840, 0);
            class192.field2840[12] = 0.0F;
            class192.field2840[4] = 0.0F;
            class192.field2840[0] = 1.0F;
            class192.field2840[14] = 0.0F;
            class192.field2840[6] = 1.0F;
            class192.field2840[8] = 0.0F;
            class192.field2840[11] = 0.0F;
            class192.field2840[13] = 0.0F;
            class192.field2840[7] = 0.0F;
            class192.field2840[5] = 0.0F;
            class192.field2840[15] = 1.0F;
            class192.field2840[2] = 0.0F;
            class192.field2840[3] = 0.0F;
            class192.field2840[9] = 1.0F;
            class192.field2840[10] = 0.0F;
            class192.field2840[1] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class192.field2840, 0);
            if ((7 & this.field9492) == 0) {
                this.field9529.method173(false, 56);
            } else {
                this.field9529.method173(true, 91);
                this.field9529.method326(16384);
            }
            this.field9529.method317(this.field9533, this.field9531, -26411, this.field9534, this.field9532);
            if (~(this.field9514 * 2) < ~this.field9529.field620.field3066.length) {
                this.field9529.field620 = new class548(this.field9514 * 2);
            } else {
                this.field9529.field620.field3109 = 0;
            }
            int var9 = 0;
            class548 var10 = this.field9529.field620;
            if (this.field9529.field597) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field3937 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field9524[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method1485((byte) 107, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field3937 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field9524[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    var10.method1545(84, 65535 & var20[var21]);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class35 var17 = new class35(this.field9529, 5123, var10.field3066, var10.field3109);
                this.field9529.method232(var9, -128, 4, var17, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lga;)V")
    public static final void method3927(class404 arg0) {
        class44.field982.method289(arg0.field5922, arg0.field5927 + (arg0.method38(true) >> 1), arg0.field5933, class587.field8009);
        arg0.field5931 = class587.field8009[0];
        arg0.field5925 = class587.field8009[1];
        arg0.field5934 = class587.field8009[2];
    }

    @OriginalMember(owner = "client!ed", name = "fa", descriptor = "(IILr;)Lr;")
    public final class184 method1146(int arg0, int arg1, class184 arg2) {
        ++field9516;
        if (~(1 & this.field9497[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3942 >> this.field9529.field553;
            class28 var5 = (class28) arg2;
            class28 var6;
            if (var5 != null && var5.method397((byte) 104, var4, var4)) {
                var6 = var5;
                var5.method394((byte) 0);
            } else {
                var6 = new class28(this.field9529, var4, var4);
            }
            var6.method393(var4, var4, 0, 25053, 0);
            this.method3924((byte) -82, arg0, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lcea;B)V")
    public static final void method3928(class215 arg0, byte arg1) {
        ++field9505;
        byte[] var2 = new byte[24];
        if (arg1 == 55) {
            if (class252.field3638 != null) {
                try {
                    class252.field3638.method139(0L, (byte) -120);
                    class252.field3638.method134(-89, var2);
                    int var3;
                    for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                    }
                    if (~var3 <= -25) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; ~var4 > -25; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg0.method1528(24, 0, var2, arg1 ^ 8);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1156(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field9520;
        this.method3929(arg5, arg2, arg4, -62, arg0, arg6, arg3, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lab;[I)V")
    public final void method1158(class669 arg0, int[] arg1) {
        ++field9528;
        this.field9513.method1273(new class77(this.field9529, this, arg0, arg1), -20180);
    }

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1159(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field9518;
        if (arg3 != null && this.field9515 == null) {
            this.field9515 = new int[super.field3937][super.field3940][];
        }
        class152 var15 = this.field9529.field1170;
        if (arg5 != null && this.field9509 == null) {
            this.field9509 = new int[super.field3937][super.field3940][];
        }
        this.field9525[arg0][arg1] = arg2;
        this.field9491[arg0][arg1] = arg4;
        this.field9510[arg0][arg1] = arg6;
        this.field9502[arg0][arg1] = arg7;
        if (this.field9509 != null) {
            this.field9509[arg0][arg1] = arg5;
        }
        if (this.field9515 != null) {
            this.field9515[arg0][arg1] = arg3;
        }
        class717[] var16 = this.field9500[arg0][arg1] = new class717[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field9492) != -1 && var18 != -1 && var15.method1180(var18, -6662).field9951) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (var19 << 14) | (long) var18;
            class362 var22;
            for (var22 = this.field9535.method1465(var20, -6008); var22 != null; var22 = this.field9535.method1461(true)) {
                class717 var23 = (class717) var22;
                if (var23.field9771 == var18 && (float) var19 == var23.field9762 && var23.field9755 == arg10 && var23.field9763 == arg11 && ~var23.field9756 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class717) var22;
            } else {
                var16[var17] = new class717(this, var18, var19, arg10, arg11, arg12);
                this.field9535.method1468((byte) 99, var20, var16[var17]);
            }
        }
        if (arg13) {
            this.field9497[arg0][arg1] = (byte) class418.method2577(this.field9497[arg0][arg1], 1);
        }
        if (~this.field9537 > ~arg6.length) {
            this.field9537 = arg6.length;
        }
        this.field9541 += arg6.length;
    }

    @OriginalMember(owner = "client!ed", name = "ka", descriptor = "(III)V")
    public final void method1155(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field9530[arg0][arg1])) {
            this.field9530[arg0][arg1] = (byte) arg2;
        }
        ++field9499;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZIII[[ZI)V")
    private final void method3929(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean[][] arg6, int arg7) {
        ++field9507;
        if (arg3 >= -39) {
            this.field9537 = -20;
        }
        if (this.field9539 != null) {
            int var9 = arg1 + arg1 - -1;
            int var10 = var9 * var9;
            if (this.field9529.field704.length < var10) {
                this.field9529.field704 = new int[var10];
            }
            if (~this.field9529.field620.field3066.length > ~(this.field9514 * 2)) {
                this.field9529.field620 = new class548(this.field9514 * 2);
            }
            int var11 = -arg1 + arg4;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = arg7 - arg1;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg1 + arg4;
            if (var15 > super.field3937 - 1) {
                var15 = super.field3937 + -1;
            }
            int var16 = arg1 + arg7;
            if (~var16 < ~(super.field3940 + -1)) {
                var16 = super.field3940 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field9529.field704;
            for (int var19 = var11; ~var19 >= ~var15; ++var19) {
                boolean[] var25 = arg6[-var12 + var19];
                for (int var26 = var13; ~var26 >= ~var16; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field3937 * var26 + var19;
                    }
                }
            }
            if (arg0 != -1) {
                this.field9529.method304((byte) -120, (float) arg0);
                this.field9529.method236(1);
            } else {
                this.field9529.method293((byte) -62);
            }
            this.field9529.method173(~(7 & this.field9492) != -1, 120);
            for (int var20 = 0; this.field9539.length > var20; ++var20) {
                this.field9539[var20].method3992(5123, var17, var18);
            }
            if (!this.field9513.method1276((byte) 18)) {
                int var21 = this.field9529.field678;
                int var22 = this.field9529.field604;
                this.field9529.method172(0, var22, this.field9529.field635);
                this.field9529.method173(false, 97);
                this.field9529.method205(0, false);
                this.field9529.method222(128, 1);
                this.field9529.method229(-2, -88);
                this.field9529.method256((byte) -124, this.field9529.field649);
                this.field9529.method175(8448, (byte) 98, 7681);
                this.field9529.method239(34166, 770, (byte) -87, 0);
                this.field9529.method274(false, 0, 770, 34167);
                for (class362 var23 = this.field9513.method1269(4); var23 != null; var23 = this.field9513.method1264((byte) 92)) {
                    class77 var24 = (class77) var23;
                    var24.method719(arg6, 255, arg4, arg7, arg1);
                }
                this.field9529.method239(5890, 768, (byte) -87, 0);
                this.field9529.method274(false, 0, 770, 5890);
                this.field9529.method256((byte) -96, (class36) null);
                this.field9529.method172(var21, var22, this.field9529.field635);
            }
            if (this.field9523 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field9529.method317(this.field9533, (class744) null, -26411, this.field9534, (class744) null);
                this.field9523.method2567(arg2, 112, arg6, arg1, arg7, arg4);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }
}
