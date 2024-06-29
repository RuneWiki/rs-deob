import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class480 extends class292 {

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Lga;")
    private class420 field6790 = new class420();

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "Lkv;")
    public class280 field6816;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    private int field6794;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "[[S")
    public short[][] field6825;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "[[[I")
    private int[][][] field6824;

    @OriginalMember(owner = "client!wr", name = "hb", descriptor = "[[F")
    private float[][] field6836;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "[[B")
    private byte[][] field6812;

    @OriginalMember(owner = "client!wr", name = "cb", descriptor = "[[F")
    private float[][] field6831;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "[[[Lcfa;")
    private class177[][][] field6813;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "[[[I")
    private int[][][] field6792;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
    public int field6822;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "[[[I")
    public int[][][] field6805;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "[[[I")
    public int[][][] field6798;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "[[[I")
    public int[][][] field6797;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    private int field6789;

    @OriginalMember(owner = "client!wr", name = "ab", descriptor = "[[F")
    private float[][] field6829;

    @OriginalMember(owner = "client!wr", name = "eb", descriptor = "[[B")
    private byte[][] field6833;

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "Ltga;")
    private class64 field6827;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "Lat;")
    private class395 field6795;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "Lcr;")
    public static class597 field6804 = new class597();

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "[I")
    public static int[] field6815 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "Lke;")
    public static class622 field6819 = new class622(19, -2);

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
    private int field6791;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    private int field6796;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
    private int field6828;

    @OriginalMember(owner = "client!wr", name = "gb", descriptor = "I")
    private int field6835;

    @OriginalMember(owner = "client!wr", name = "bb", descriptor = "Lkb;")
    private class717 field6830;

    @OriginalMember(owner = "client!wr", name = "db", descriptor = "Lkb;")
    public class717 field6832;

    @OriginalMember(owner = "client!wr", name = "fb", descriptor = "Lkb;")
    public class717 field6834;

    @OriginalMember(owner = "client!wr", name = "ib", descriptor = "Lkb;")
    public class717 field6837;

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "Lic;")
    private class726 field6826;

    @OriginalMember(owner = "client!wr", name = "jb", descriptor = "[Lcfa;")
    private class177[] field6838;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "[[[I")
    private int[][][] field6821;

    @OriginalMember(owner = "client!wr", name = "YA", descriptor = "()V")
    public final void method1238() {
        if (this.field6828 <= 0) {
            this.field6795 = null;
        } else {
            byte[][] var1 = new byte[super.field4420 + 1][super.field4425 + 1];
            for (int var2 = 1; super.field4420 > var2; ++var2) {
                for (int var103 = 1; super.field4425 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6833[var2][var103 + 1] >> 3) + (this.field6833[var2 + 1][var103] >> 3) + (this.field6833[var2 + -1][var103] >> 2) + (this.field6833[var2][var103 - 1] >> 2) + (this.field6833[var2][var103] >> 1));
                }
            }
            this.field6838 = new class177[this.field6827.method381(65)];
            this.field6827.method385(0, this.field6838);
            for (int var3 = 0; ~this.field6838.length < ~var3; ++var3) {
                this.field6838[var3].method1342(this.field6828, false);
            }
            int var4 = 24;
            if (this.field6821 != null) {
                var4 += 4;
            }
            if (~(this.field6822 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field6816.field4163.method3946(this.field6828 * var4, false);
            Stream var6 = new Stream(var5);
            class177[] var7 = new class177[this.field6828];
            int var8 = class377.method2330((byte) 48, this.field6828 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class64 var9 = new class64(var8);
            class177[] var10 = new class177[this.field6835];
            for (int var11 = 0; ~super.field4420 < ~var11; ++var11) {
                for (int var30 = 0; ~super.field4425 < ~var30; ++var30) {
                    if (this.field6797[var11][var30] != null) {
                        class177[] var31 = this.field6813[var11][var30];
                        int[] var32 = this.field6805[var11][var30];
                        int[] var33 = this.field6798[var11][var30];
                        int[] var34 = this.field6824[var11][var30];
                        int[] var35 = this.field6797[var11][var30];
                        int[] var36 = this.field6792 == null ? null : this.field6792[var11][var30];
                        int[] var37 = this.field6821 != null ? this.field6821[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field6836[var11][var30];
                        float var39 = this.field6831[var11][var30];
                        float var40 = this.field6829[var11][var30];
                        float var41 = this.field6836[var11][var30 + 1];
                        float var42 = this.field6831[var11][var30 + 1];
                        float var43 = this.field6829[var11][var30 + 1];
                        float var44 = this.field6836[var11 + 1][var30 + 1];
                        float var45 = this.field6831[var11 + 1][var30 + 1];
                        float var46 = this.field6829[var11 - -1][var30 - -1];
                        float var47 = this.field6836[var11 + 1][var30];
                        float var48 = this.field6831[var11 - -1][var30];
                        float var49 = this.field6829[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class177 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6825[super.field4420 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field4428) - -var32[var57];
                            int var59 = (var30 << super.field4428) + var33[var57];
                            int var60 = var58 >> this.field6794;
                            int var61 = var59 >> this.field6794;
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
                            int var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var39;
                                var75 = var38;
                            } else if (var67 == 0 && super.field4419 == var68) {
                                var75 = var41;
                                var73 = var69 - var51;
                                var72 = var43;
                                var74 = var42;
                            } else if (super.field4419 == var67 && super.field4419 == var68) {
                                var72 = var46;
                                var75 = var44;
                                var74 = var45;
                                var73 = var69 - var52;
                            } else if (super.field4419 == var67 && var68 == 0) {
                                var75 = var47;
                                var73 = var69 - var53;
                                var74 = var48;
                                var72 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field4419;
                                float var77 = (float) var68 / (float) super.field4419;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var75 = (var81 - var78) * var77 + var78;
                                var74 = (-var79 + var82) * var77 + var79;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field4428) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field4428) + var51;
                                var73 = var69 - (((-var84 + var85) * var68 >> super.field4428) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if ((7 & this.field6822) == 0) {
                                    float var87 = this.field6816.field4260[2] * var72 + this.field6816.field4260[1] * var74 + this.field6816.field4260[0] * var75;
                                    var71 = var87 * (var87 > 0.0F ? this.field6816.field4209 : this.field6816.field4253) + this.field6816.field4248;
                                }
                                var70 = class444.field6323[65408 & var62 | var86];
                            }
                            class540 var88 = null;
                            if ((this.field6789 + -1 & var58) == 0 && (this.field6789 + -1 & var59) == 0) {
                                var88 = var9.method380((byte) -3, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var73 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class444.field6323[65408 & var63 | var90];
                                    if ((this.field6822 & 7) == 0) {
                                        float var91 = this.field6816.field4260[2] * var72 + this.field6816.field4260[1] * var74 + this.field6816.field4260[0] * var75;
                                        float var92 = this.field6816.field4248 + var71 * (var71 > 0.0F ? this.field6816.field4209 : this.field6816.field4253);
                                        int var93 = (16734742 & var89) >> 16;
                                        int var94 = (65497 & var89) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (~var98 <= -1) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var97 << 8 | var95 << 16 | var98;
                                    }
                                }
                                if (this.field6816.field4230) {
                                    var6.method3955((float) var58);
                                    var6.method3955((float) (var64 + this.method1977((byte) 1, var58, var59)));
                                    var6.method3955((float) var59);
                                    var6.method3951((byte) (var89 >> 16));
                                    var6.method3951((byte) (var89 >> 8));
                                    var6.method3951((byte) var89);
                                    var6.method3951(-1);
                                    var6.method3955((float) var58);
                                    var6.method3955((float) var59);
                                    if (this.field6821 != null) {
                                        var6.method3955((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((7 & this.field6822) != 0) {
                                        var6.method3955(var75);
                                        var6.method3955(var74);
                                        var6.method3955(var72);
                                    }
                                } else {
                                    var6.method3949((float) var58);
                                    var6.method3949((float) (this.method1977((byte) -80, var58, var59) + var64));
                                    var6.method3949((float) var59);
                                    var6.method3951((byte) (var89 >> 16));
                                    var6.method3951((byte) (var89 >> 8));
                                    var6.method3951((byte) var89);
                                    var6.method3951(-1);
                                    var6.method3949((float) var58);
                                    var6.method3949((float) var59);
                                    if (this.field6821 != null) {
                                        var6.method3949((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((this.field6822 & 7) != 0) {
                                        var6.method3949(var75);
                                        var6.method3949(var74);
                                        var6.method3949(var72);
                                    }
                                }
                                var99 = this.field6796++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method384(var65, new class13(var56[var57]), false);
                            } else {
                                var56[var57] = ((class13) var88).field253;
                                var99 = 65535 & var56[var57];
                                if (var62 != -1 && var7[var99].field7577 > var31[var57].field7577) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method1340((byte) -128, var70, var73, var99, var71);
                            }
                            ++this.field6791;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field6796; ++var12) {
                class177 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1339(var12, -122);
                }
            }
            for (int var13 = 0; super.field4420 > var13; ++var13) {
                for (int var18 = 0; super.field4425 > var18; ++var18) {
                    short[] var19 = this.field6825[super.field4420 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class177 var25 = var7[var22];
                            class177 var26 = var7[var23];
                            class177 var27 = var7[var24];
                            class177 var28 = null;
                            if (var25 != null) {
                                var25.method1338(var18, var13, var20, -41);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1338(var18, var13, var20, -95);
                                if (var28 == null || var26.field7577 < var28.field7577) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1338(var18, var13, var20, -45);
                                if (var28 == null || var28.field7577 > var27.field7577) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1339(var22, -104);
                                }
                                if (var26 != null) {
                                    var28.method1339(var23, -124);
                                }
                                if (var27 != null) {
                                    var28.method1339(var24, -119);
                                }
                                var28.method1338(var18, var13, var20, -103);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3959();
            this.field6826 = this.field6816.method1822(false, var6.method3958(), 127, var4, var5);
            this.field6832 = new class717(this.field6826, 5126, 3, 0);
            this.field6830 = new class717(this.field6826, 5121, 4, 12);
            byte var14;
            if (this.field6821 != null) {
                var14 = 28;
                this.field6837 = new class717(this.field6826, 5126, 3, 16);
            } else {
                this.field6837 = new class717(this.field6826, 5126, 2, 16);
                var14 = 24;
            }
            if (~(7 & this.field6822) != -1) {
                this.field6834 = new class717(this.field6826, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6838.length];
            for (int var16 = 0; ~this.field6838.length < ~var16; ++var16) {
                class177 var17 = this.field6838[var16];
                var15[var16] = var17.field7577;
                var17.method1344((byte) -120, this.field6796);
            }
            class739.method4142(this.field6838, var15, -1);
            if (this.field6795 != null) {
                this.field6795.method2403((byte) -115);
            }
        }
        ++field6820;
        this.field6821 = null;
        this.field6833 = null;
        this.field6797 = null;
        this.field6827 = null;
        this.field6836 = this.field6831 = this.field6829 = null;
        this.field6813 = null;
        this.field6792 = null;
        this.field6805 = this.field6798 = null;
        this.field6824 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1239(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6823;
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
        this.method1241(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!wr", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1251(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6817;
        if (this.field6795 != null && arg0 != null) {
            int var7 = arg1 - (this.field6816.field4299 * arg2 >> 8) >> this.field6816.field4165;
            int var8 = -(this.field6816.field4229 * arg2 >> 8) + arg3 >> this.field6816.field4165;
            this.field6795.method2412(var7, var8, 34, arg0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6808;
        if (this.field6828 > 0) {
            this.field6816.method1887(93);
            this.field6816.method1871(93, false);
            this.field6816.method1888(false, (byte) 103);
            this.field6816.method1892(false, 65);
            this.field6816.method1826(false, -112);
            this.field6816.method1817(0, 2);
            this.field6816.method1873((byte) 23, -2);
            this.field6816.method1840((class599) null, 2205);
            class411.field5799[10] = 0.0F;
            class411.field5799[0] = (float) arg2 / ((float) super.field4419 * 128.0F * (float) this.field6816.field4129);
            class411.field5799[11] = 0.0F;
            class411.field5799[15] = 1.0F;
            class411.field5799[2] = 0.0F;
            class411.field5799[5] = (float) arg2 / ((float) super.field4419 * 128.0F * (float) this.field6816.field4070);
            class411.field5799[9] = 0.0F;
            class411.field5799[4] = 0.0F;
            class411.field5799[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6816.field4129) + -1.0F;
            class411.field5799[7] = 0.0F;
            class411.field5799[14] = 0.0F;
            class411.field5799[3] = 0.0F;
            class411.field5799[8] = 0.0F;
            class411.field5799[6] = 0.0F;
            class411.field5799[1] = 0.0F;
            class411.field5799[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6816.field4070) + 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class411.field5799, 0);
            class411.field5799[8] = 0.0F;
            class411.field5799[7] = 0.0F;
            class411.field5799[2] = 0.0F;
            class411.field5799[3] = 0.0F;
            class411.field5799[9] = 1.0F;
            class411.field5799[0] = 1.0F;
            class411.field5799[11] = 0.0F;
            class411.field5799[5] = 0.0F;
            class411.field5799[13] = 0.0F;
            class411.field5799[4] = 0.0F;
            class411.field5799[10] = 0.0F;
            class411.field5799[12] = 0.0F;
            class411.field5799[6] = 1.0F;
            class411.field5799[1] = 0.0F;
            class411.field5799[14] = 0.0F;
            class411.field5799[15] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class411.field5799, 0);
            if ((7 & this.field6822) != 0) {
                this.field6816.method1888(true, (byte) -125);
                this.field6816.method1819(false);
            } else {
                this.field6816.method1888(false, (byte) -114);
            }
            this.field6816.method1865(this.field6832, 32888, this.field6837, this.field6830, this.field6834);
            if (~this.field6816.field4231.field1556.length <= ~(this.field6791 * 2)) {
                this.field6816.field4231.field1521 = 0;
            } else {
                this.field6816.field4231 = new class186(this.field6791 * 2);
            }
            int var9 = 0;
            class186 var10 = this.field6816.field4231;
            if (!this.field6816.field4230) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field4420 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6825[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method868(var14[var15] & 65535, 849257384);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field4420 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field6825[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method860(65535 & var20[var21], (byte) 123);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class341 var17 = new class341(this.field6816, 5123, var10.field1556, var10.field1521);
                this.field6816.method1899(var17, 123, 4, var9, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1247(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6806;
        if (this.field6795 != null && arg0 != null) {
            int var7 = -(this.field6816.field4299 * arg2 >> 8) + arg1 >> this.field6816.field4165;
            int var8 = -(this.field6816.field4229 * arg2 >> 8) + arg3 >> this.field6816.field4165;
            this.field6795.method2413(var7, var8, arg0, -18962);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V")
    public static void method2816(boolean arg0) {
        field6819 = null;
        field6804 = null;
        if (!arg0) {
            method2817((byte[]) null, -32, 33, -3, 1, (byte) -105);
        }
        field6815 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([BIIIIB)V")
    public static final void method2817(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field6799;
        if (arg2 < arg3) {
            int var6 = arg3 - arg2 >> 2;
            int var7 = 53 / ((arg5 - 21) / 57);
            int var8 = arg2 + arg4;
            while (true) {
                --var6;
                if (var6 < 0) {
                    int var9 = 3 & -arg2 + arg3;
                    while (true) {
                        --var9;
                        if (~var9 > -1) {
                            return;
                        }
                        arg0[var8++] = 1;
                    }
                }
                arg0[var8++] = 1;
                arg0[var8++] = 1;
                arg0[var8++] = 1;
                arg0[var8++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILmi;II)V")
    private final void method2818(int arg0, class519 arg1, int arg2, int arg3) {
        ++field6807;
        int[] var5 = this.field6805[arg2][arg0];
        int[] var6 = this.field6798[arg2][arg0];
        int var7 = var5.length;
        if (~var7 < ~this.field6816.field4315.length) {
            this.field6816.field4315 = new int[var7];
            this.field6816.field4317 = new int[var7];
        }
        int[] var8 = this.field6816.field4315;
        int[] var9 = this.field6816.field4317;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field6816.field4165;
            var9[var10] = var6[var10] >> this.field6816.field4165;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg1.method3018(var12, 0, var17, var16, var13, var14, var15);
            }
        }
        if (arg3 <= 88) {
            this.field6789 = -116;
        }
    }

    @OriginalMember(owner = "client!wr", name = "ka", descriptor = "(III)V")
    public final void method1245(int arg0, int arg1, int arg2) {
        if (~(this.field6833[arg0][arg1] & 255) > ~arg2) {
            this.field6833[arg0][arg1] = (byte) arg2;
        }
        ++field6802;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljw;[I)V")
    public final void method1248(class578 arg0, int[] arg1) {
        this.field6790.method2510(new class767(this.field6816, this, arg0, arg1), false);
        ++field6793;
    }

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1241(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6803;
        if (arg5 != null && this.field6821 == null) {
            this.field6821 = new int[super.field4420][super.field4425][];
        }
        class159 var15 = this.field6816.field883;
        if (arg3 != null && this.field6792 == null) {
            this.field6792 = new int[super.field4420][super.field4425][];
        }
        this.field6805[arg0][arg1] = arg2;
        this.field6798[arg0][arg1] = arg4;
        this.field6797[arg0][arg1] = arg6;
        this.field6824[arg0][arg1] = arg7;
        if (this.field6821 != null) {
            this.field6821[arg0][arg1] = arg5;
        }
        if (this.field6792 != null) {
            this.field6792[arg0][arg1] = arg3;
        }
        class177[] var16 = this.field6813[arg0][arg1] = new class177[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field6822) != 0 && var18 != -1 && var15.method1263(var18, (byte) 123).field2744) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (var19 << 14) | (long) var18;
            class540 var22;
            for (var22 = this.field6827.method380((byte) -3, var20); var22 != null; var22 = this.field6827.method383(-1)) {
                class177 var23 = (class177) var22;
                if (~var23.field2683 == ~var18 && (float) var19 == var23.field2694 && var23.field2696 == arg10 && var23.field2681 == arg11 && ~var23.field2700 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class177) var22;
            } else {
                var16[var17] = new class177(this, var18, var19, arg10, arg11, arg12);
                this.field6827.method384(var20, var16[var17], false);
            }
        }
        if (arg13) {
            this.field6812[arg0][arg1] = (byte) class281.method1904(this.field6812[arg0][arg1], 1);
        }
        if (arg6.length > this.field6835) {
            this.field6835 = arg6.length;
        }
        this.field6828 += arg6.length;
    }

    @OriginalMember(owner = "client!wr", name = "fa", descriptor = "(IILr;)Lr;")
    public final class192 method1249(int arg0, int arg1, class192 arg2) {
        ++field6800;
        if (~(1 & this.field6812[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4419 >> this.field6816.field4165;
            class519 var5 = (class519) arg2;
            class519 var6;
            if (var5 != null && var5.method3020(var4, 0, var4)) {
                var6 = var5;
                var5.method3021(105);
            } else {
                var6 = new class519(this.field6816, var4, var4);
            }
            var6.method3024((byte) -89, var4, var4, 0, 0);
            this.method2818(arg1, var6, arg0, 125);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1243(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2819((byte) 66, arg5, arg4, -1, arg3, arg1, arg2, arg0);
        ++field6814;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lkv;IIII[[I[[II)V")
    public class480(class280 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6816 = arg0;
        this.field6794 = super.field4428 + -2;
        this.field6825 = new short[arg3 * arg4][];
        this.field6824 = new int[arg3][arg4][];
        this.field6836 = new float[super.field4420 - -1][super.field4425 - -1];
        this.field6812 = new byte[arg3][arg4];
        this.field6831 = new float[super.field4420 + 1][super.field4425 - -1];
        this.field6813 = new class177[arg3][arg4][];
        this.field6792 = new int[arg3][arg4][];
        this.field6822 = arg2;
        this.field6805 = new int[arg3][arg4][];
        this.field6798 = new int[arg3][arg4][];
        this.field6797 = new int[arg3][arg4][];
        this.field6789 = 1 << this.field6794;
        this.field6829 = new float[super.field4420 + 1][super.field4425 + 1];
        this.field6833 = new byte[arg3 + 1][arg4 + 1];
        for (int var9 = 1; ~var9 > ~super.field4425; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field4420; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * arg7 * 4)))));
                this.field6836[var10][var9] = (float) var11 * var13;
                this.field6831[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6829[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6827 = new class64(128);
        if (~(this.field6822 & 16) != -1) {
            this.field6795 = new class395(this.field6816, this);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1250(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method2819((byte) 66, arg6, arg4, arg5, arg3, arg1, arg2, arg0);
        ++field6818;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZI[[ZIII)V")
    private final void method2819(byte arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 66) {
            this.method1237(-120, -125);
        }
        ++field6801;
        if (this.field6838 != null) {
            int var9 = arg6 + arg6 - -1;
            int var10 = var9 * var9;
            if (var10 > this.field6816.field4314.length) {
                this.field6816.field4314 = new int[var10];
            }
            if (this.field6791 * 2 > this.field6816.field4231.field1556.length) {
                this.field6816.field4231 = new class186(this.field6791 * 2);
            }
            int var11 = -arg6 + arg7;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg6 + arg5;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg6 + arg7;
            if (~(super.field4420 + -1) > ~var15) {
                var15 = super.field4420 + -1;
            }
            int var16 = arg5 - -arg6;
            if (var16 > super.field4425 + -1) {
                var16 = super.field4425 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field6816.field4314;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg4[var19 - var12];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4420 * var26 + var19;
                    }
                }
            }
            if (arg3 == -1) {
                this.field6816.method1827((byte) 28);
            } else {
                this.field6816.method1895((float) arg3, (byte) -98);
                this.field6816.method1900(-1);
            }
            this.field6816.method1888(~(this.field6822 & 7) != -1, (byte) 81);
            for (int var20 = 0; this.field6838.length > var20; ++var20) {
                this.field6838[var20].method1336(var17, var18, (byte) 71);
            }
            if (!this.field6790.method2513((byte) 88)) {
                int var21 = this.field6816.field4244;
                int var22 = this.field6816.field4221;
                this.field6816.method435(0, var22, this.field6816.field4254);
                this.field6816.method1888(false, (byte) -112);
                this.field6816.method1826(false, -122);
                this.field6816.method1817(128, 2);
                this.field6816.method1873((byte) 23, -2);
                this.field6816.method1840(this.field6816.field4235, 2205);
                this.field6816.method1835(false, 8448, 7681);
                this.field6816.method1842(770, ~arg0, 0, 34166);
                this.field6816.method1828((byte) -128, 34167, 770, 0);
                for (class540 var23 = this.field6790.method2508((byte) 124); var23 != null; var23 = this.field6790.method2505((byte) -55)) {
                    class767 var24 = (class767) var23;
                    var24.method4232(arg4, arg5, -10962, arg6, arg7);
                }
                this.field6816.method1842(768, 123, 0, 5890);
                this.field6816.method1828((byte) -61, 5890, 770, 0);
                this.field6816.method1840((class599) null, 2205);
                this.field6816.method435(var21, var22, this.field6816.field4254);
            }
            if (this.field6795 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field6816.method1865(this.field6832, 32888, this.field6837, (class717) null, (class717) null);
                this.field6795.method2410(arg2, arg0 ^ 8519, arg5, arg6, arg7, arg4);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
    public final void method1237(int arg0, int arg1) {
        ++field6810;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1240(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6809;
        if (this.field6795 != null && arg0 != null) {
            int var7 = arg1 - (this.field6816.field4299 * arg2 >> 8) >> this.field6816.field4165;
            int var8 = -(this.field6816.field4229 * arg2 >> 8) + arg3 >> this.field6816.field4165;
            return this.field6795.method2404(var8, arg0, var7, -12089);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(Z)V")
    public static final void method2820(boolean arg0) {
        class558.field7926.method2364(1);
        ++field6811;
        class118.field1471.method2364(1);
        class770.field10619.method2364(1);
        class588.field8318.method2364(1);
        if (!arg0) {
            field6815 = null;
        }
    }
}
