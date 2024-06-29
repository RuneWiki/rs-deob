import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class405 extends class143 {

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "Lub;")
    private class18 field5785 = new class18();

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    private int field5765 = this.field1840 + -2;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lug;")
    public class395 field5758;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "[[I")
    private int[][] field5793;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "[[[I")
    private int[][][] field5775;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "[[[I")
    private int[][][] field5787;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "[[[I")
    private int[][][] field5790;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "[[B")
    private byte[][] field5800;

    @OriginalMember(owner = "client!ul", name = "ib", descriptor = "[[F")
    private float[][] field5808;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "[[B")
    private byte[][] field5788;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "[[[I")
    public int[][][] field5771;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[[[Lwd;")
    private class180[][][] field5761;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "[[F")
    private float[][] field5798;

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "[[F")
    private float[][] field5805;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    private int field5774;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "[[[I")
    public int[][][] field5777;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "[[S")
    public short[][] field5783;

    @OriginalMember(owner = "client!ul", name = "gb", descriptor = "Lek;")
    private class352 field5806;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Lfu;")
    private class267 field5770;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "Ldq;")
    public static class493 field5792 = new class493(53, -2);

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
    public static int field5799 = -1;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    private int field5759;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    private int field5786;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
    private int field5803;

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
    private int field5804;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "Llc;")
    private class459 field5802;

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "Log;")
    private class460 field5801;

    @OriginalMember(owner = "client!ul", name = "hb", descriptor = "Log;")
    public class460 field5807;

    @OriginalMember(owner = "client!ul", name = "jb", descriptor = "Log;")
    public class460 field5809;

    @OriginalMember(owner = "client!ul", name = "kb", descriptor = "Log;")
    public class460 field5810;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "[I")
    public static int[] field5796;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "[Lwd;")
    private class180[] field5797;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[[[I")
    private int[][][] field5773;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 7)
    public final void method395(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field5773 == null) {
            this.field5773 = new int[super.field1842][super.field1844][];
        }
        if (arg3 != null && this.field5775 == null) {
            this.field5775 = new int[super.field1842][super.field1844][];
        }
        ++field5763;
        this.field5771[arg0][arg1] = arg2;
        this.field5777[arg0][arg1] = arg4;
        this.field5790[arg0][arg1] = arg6;
        this.field5787[arg0][arg1] = arg7;
        if (this.field5773 != null) {
            this.field5773[arg0][arg1] = arg5;
        }
        if (this.field5775 != null) {
            this.field5775[arg0][arg1] = arg3;
        }
        class180[] var15 = this.field5761[arg0][arg1] = new class180[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14);
            class383 var19;
            for (var19 = this.field5806.method2022(-1, var17); var19 != null; var19 = this.field5806.method2020((byte) -71)) {
                class180 var20 = (class180) var19;
                if (arg8[var16] == var20.field2381 && (float) arg9[var16] == var20.field2374 && var20.field2370 == arg10 && ~var20.field2376 == ~arg11 && var20.field2373 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class180(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5806.method2019((byte) -37, var15[var16], var17);
            } else {
                var15[var16] = (class180) var19;
            }
        }
        if (arg13) {
            this.field5788[arg0][arg1] = (byte) class215.method1323(this.field5788[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field5803) {
            this.field5803 = arg6.length;
        }
        this.field5804 += arg6.length;
    }

    @OriginalMember(owner = "client!ul", name = "ca", descriptor = "()V", line = 75)
    public final void method401() {
        ++field5762;
        if (~this.field5804 >= -1) {
            this.field5770 = null;
        } else {
            byte[][] var1 = new byte[super.field1842 + 1][super.field1844 + 1];
            for (int var2 = 1; super.field1842 > var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field1844; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5800[var2 + 1][var103] >> 3) + (this.field5800[var2 + -1][var103] >> 2) + (this.field5800[var2][var103] >> 1) + (this.field5800[var2][var103 + -1] >> 2) + (this.field5800[var2][var103 + 1] >> 3));
                }
            }
            this.field5797 = new class180[this.field5806.method2025(-30075)];
            this.field5806.method2016(-1, this.field5797);
            for (int var3 = 0; ~this.field5797.length < ~var3; ++var3) {
                this.field5797[var3].method1146(this.field5804, (byte) -92);
            }
            int var4 = 24;
            if (this.field5773 != null) {
                var4 += 4;
            }
            if (~(this.field5757 & 7) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field5758.field5499.method2602(this.field5804 * var4);
            NativeStream var6 = new NativeStream(var5);
            class180[] var7 = new class180[this.field5804];
            int var8 = class231.method1404(this.field5804 / 4, 1);
            if (~var8 > -2) {
                var8 = 1;
            }
            class352 var9 = new class352(var8);
            class180[] var10 = new class180[this.field5803];
            for (int var11 = 0; super.field1842 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field1844; ++var30) {
                    if (this.field5790[var11][var30] != null) {
                        class180[] var31 = this.field5761[var11][var30];
                        int[] var32 = this.field5771[var11][var30];
                        int[] var33 = this.field5777[var11][var30];
                        int[] var34 = this.field5787[var11][var30];
                        int[] var35 = this.field5790[var11][var30];
                        int[] var36 = this.field5775 == null ? null : this.field5775[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field5773 == null ? null : this.field5773[var11][var30];
                        float var38 = this.field5805[var11][var30];
                        float var39 = this.field5808[var11][var30];
                        float var40 = this.field5798[var11][var30];
                        float var41 = this.field5805[var11][var30 + 1];
                        float var42 = this.field5808[var11][var30 + 1];
                        float var43 = this.field5798[var11][var30 + 1];
                        float var44 = this.field5805[var11 + 1][var30 + 1];
                        float var45 = this.field5808[var11 + 1][var30 + 1];
                        float var46 = this.field5798[var11 + 1][var30 + 1];
                        float var47 = this.field5805[var11 + 1][var30];
                        float var48 = this.field5808[var11 + 1][var30];
                        float var49 = this.field5798[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label338: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class180 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5783[super.field1842 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field1840) - -var32[var57];
                            int var59 = (var30 << super.field1840) - -var33[var57];
                            int var60 = var58 >> this.field5765;
                            int var61 = var59 >> this.field5765;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
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
                                var72 = var40;
                                var73 = var38;
                                var74 = var69 - var50;
                                var75 = var39;
                            } else if (var67 == 0 && ~super.field1836 == ~var68) {
                                var75 = var42;
                                var73 = var41;
                                var72 = var43;
                                var74 = var69 - var51;
                            } else if (~super.field1836 == ~var67 && ~super.field1836 == ~var68) {
                                var74 = var69 - var52;
                                var73 = var44;
                                var75 = var45;
                                var72 = var46;
                            } else if (~super.field1836 == ~var67 && var68 == 0) {
                                var73 = var47;
                                var75 = var48;
                                var72 = var49;
                                var74 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field1836;
                                float var77 = (float) var68 / (float) super.field1836;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var73 = (-var78 + var81) * var77 + var78;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var75 = (var82 - var79) * var77 + var79;
                                var72 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field1840) + var50;
                                int var85 = var51 - -((-var51 + var52) * var67 >> super.field1840);
                                var74 = var69 - (((-var84 + var85) * var68 >> super.field1840) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var74 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class441.field6318[65408 & var62 | var86];
                                if ((this.field5757 & 7) == 0) {
                                    float var87 = this.field5758.field5595[2] * var72 + this.field5758.field5595[1] * var75 + this.field5758.field5595[0] * var73;
                                    var71 = this.field5758.field5608 + (!(var87 > 0.0F) ? this.field5758.field5560 : this.field5758.field5636) * var87;
                                }
                            }
                            class383 var88 = null;
                            if ((this.field5774 + -1 & var58) == 0 && ~(var59 & this.field5774 + -1) == -1) {
                                var88 = var9.method2022(-1, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class349) var88).field4496;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && ~var31[var57].field5043 > ~var7[var89].field5043) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (127 & var63) * var74 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class441.field6318[var90 | var63 & 65408];
                                    if ((7 & this.field5757) == 0) {
                                        float var92 = this.field5758.field5595[2] * var72 + this.field5758.field5595[1] * var75 + this.field5758.field5595[0] * var73;
                                        float var93 = var71 * (!(var71 > 0.0F) ? this.field5758.field5560 : this.field5758.field5636) + this.field5758.field5608;
                                        int var94 = (var91 & 16740549) >> 16;
                                        int var95 = var91 >> 8 & 255;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var91;
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        var91 = var96 << 16 | var98 << 8 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field5758.field5593) {
                                    var6.method2596((float) var58);
                                    var6.method2596((float) (this.method396(var58, var59) - -var64));
                                    var6.method2596((float) var59);
                                    var6.method2598((byte) (var91 >> 16));
                                    var6.method2598((byte) (var91 >> 8));
                                    var6.method2598((byte) var91);
                                    var6.method2598(-1);
                                    var6.method2596((float) var58);
                                    var6.method2596((float) var59);
                                    if (this.field5773 != null) {
                                        var6.method2596((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field5757) != 0) {
                                        var6.method2596(var73);
                                        var6.method2596(var75);
                                        var6.method2596(var72);
                                    }
                                } else {
                                    var6.method2600((float) var58);
                                    var6.method2600((float) (var64 + this.method396(var58, var59)));
                                    var6.method2600((float) var59);
                                    var6.method2598((byte) (var91 >> 16));
                                    var6.method2598((byte) (var91 >> 8));
                                    var6.method2598((byte) var91);
                                    var6.method2598(-1);
                                    var6.method2600((float) var58);
                                    var6.method2600((float) var59);
                                    if (this.field5773 != null) {
                                        var6.method2600((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field5757) != 0) {
                                        var6.method2600(var73);
                                        var6.method2600(var75);
                                        var6.method2600(var72);
                                    }
                                }
                                var89 = this.field5786++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method2019((byte) -33, new class349(var56[var57]), var65);
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1152(var70, (byte) 107, var71, var89, var74);
                            }
                            ++this.field5759;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field5786; ++var12) {
                class180 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1153(var12, true);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field1842; ++var13) {
                for (int var18 = 0; ~super.field1844 < ~var18; ++var18) {
                    short[] var19 = this.field5783[super.field1842 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class180 var25 = var7[var22];
                            class180 var26 = var7[var23];
                            class180 var27 = var7[var24];
                            class180 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1151(var18, 22322, var13, var20);
                            }
                            if (var26 != null) {
                                var26.method1151(var18, 22322, var13, var20);
                                if (var28 == null || var26.field5043 < var28.field5043) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1151(var18, 22322, var13, var20);
                                if (var28 == null || ~var27.field5043 > ~var28.field5043) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1153(var22, true);
                                }
                                if (var26 != null) {
                                    var28.method1153(var23, true);
                                }
                                if (var27 != null) {
                                    var28.method1153(var24, true);
                                }
                                var28.method1151(var18, 22322, var13, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2595();
            this.field5802 = this.field5758.method2350(false, var5, -1, var4, var6.method2599());
            this.field5807 = new class460(this.field5802, 5126, 3, 0);
            this.field5801 = new class460(this.field5802, 5121, 4, 12);
            byte var14;
            if (this.field5773 != null) {
                var14 = 28;
                this.field5810 = new class460(this.field5802, 5126, 3, 16);
            } else {
                this.field5810 = new class460(this.field5802, 5126, 2, 16);
                var14 = 24;
            }
            if ((this.field5757 & 7) != 0) {
                this.field5809 = new class460(this.field5802, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5797.length];
            for (int var16 = 0; this.field5797.length > var16; ++var16) {
                class180 var17 = this.field5797[var16];
                var15[var16] = var17.field5043;
                var17.method1150(this.field5786, (byte) 42);
            }
            class222.method1350(var15, false, this.field5797);
            if (this.field5770 != null) {
                this.field5770.method1589(-1106);
            }
        }
        this.field5775 = null;
        this.field5773 = null;
        this.field5805 = this.field5808 = this.field5798 = null;
        this.field5771 = this.field5777 = null;
        this.field5800 = null;
        this.field5787 = null;
        this.field5806 = null;
        this.field5761 = null;
        this.field5790 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III[[ZZ)V", line = 652)
    public final void method386(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field5795;
        this.method2397(arg0, -1, arg4, arg2, arg1, 114, arg3);
    }

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "(IILba;)Lba;", line = 661)
    public final class264 method398(int arg0, int arg1, class264 arg2) {
        ++field5794;
        if ((1 & this.field5788[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field1836 >> this.field5758.field5504;
            class473 var5 = (class473) arg2;
            class473 var6;
            if (var5 != null && var5.method2849(var4, (byte) 0, var4)) {
                var6 = var5;
                var5.method2852((byte) 40);
            } else {
                var6 = new class473(this.field5758, var4, var4);
            }
            var6.method2851(1171950256, 0, 0, var4, var4);
            this.method2395(arg1, 65, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lku;[I)V", line = 693)
    public final void method385(class256 arg0, int[] arg1) {
        this.field5785.method163(new class280(this.field5758, this, arg0, arg1), 0);
        ++field5768;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 706)
    public static final void method2394(int arg0, boolean arg1) {
        ++field5766;
        class153 var2 = class75.method656(16, 255, arg0);
        if (!arg1) {
            var2.method997((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 721)
    public final boolean method391(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5772;
        if (this.field5770 != null && arg0 != null) {
            int var7 = -(this.field5758.field5599 * arg2 >> 8) + arg1 >> this.field5758.field5504;
            int var8 = -(this.field5758.field5535 * arg2 >> 8) + arg3 >> this.field5758.field5504;
            return this.field5770.method1593(var7, var8, -125, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILua;I)V", line = 740)
    private final void method2395(int arg0, int arg1, class473 arg2, int arg3) {
        ++field5791;
        int[] var5 = this.field5771[arg3][arg0];
        int[] var6 = this.field5777[arg3][arg0];
        int var7 = var5.length;
        if (~var7 < ~this.field5758.field5642.length) {
            this.field5758.field5643 = new int[var7];
            this.field5758.field5642 = new int[var7];
        }
        int[] var8 = this.field5758.field5642;
        int[] var9 = this.field5758.field5643;
        if (arg1 < 46) {
            this.field5798 = null;
        }
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = class378.method2145(255, var5[var10]) >> this.field5758.field5504;
            var9[var10] = class378.method2145(var6[var10], 255) >> this.field5758.field5504;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var16 - var14) * (-var13 + var15)) > 0) {
                arg2.method2850(var14, -1, var16, var13, var15, var12, var17);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lug;IIII[[I[[II)V", line = 801)
    public class405(class395 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5758 = arg0;
        this.field5793 = arg5;
        this.field5775 = new int[arg3][arg4][];
        this.field5787 = new int[arg3][arg4][];
        this.field5790 = new int[arg3][arg4][];
        this.field5757 = arg2;
        this.field5800 = new byte[arg3 + 1][arg4 - -1];
        this.field5808 = new float[super.field1842 + 1][super.field1844 + 1];
        this.field5788 = new byte[arg3][arg4];
        this.field5771 = new int[arg3][arg4][];
        this.field5761 = new class180[arg3][arg4][];
        this.field5798 = new float[super.field1842 + 1][super.field1844 - -1];
        this.field5805 = new float[super.field1842 + 1][super.field1844 + 1];
        this.field5774 = 1 << this.field5765;
        this.field5777 = new int[arg3][arg4][];
        this.field5783 = new short[arg3 * arg4][];
        for (int var9 = 1; ~super.field1844 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field1842 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field5805[var10][var9] = (float) var11 * var13;
                this.field5808[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5798[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5806 = new class352(128);
        if ((this.field5757 & 16) != 0) {
            this.field5770 = new class267(this.field5758, this);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 858)
    public static void method2396(byte arg0) {
        field5796 = null;
        field5792 = null;
        if (arg0 != -68) {
            method2398('m', (byte) 17);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIZIII[[Z)V", line = 870)
    private final void method2397(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean[][] arg6) {
        ++field5782;
        if (arg5 > 110) {
            if (this.field5797 != null) {
                float var8 = this.field5758.field5573;
                float var9 = this.field5758.field5580;
                int var10 = arg3 + arg3 + 1;
                int var11 = var10 * var10;
                if (var11 > this.field5758.field5641.length) {
                    this.field5758.field5641 = new int[var11];
                }
                if (this.field5759 * 2 > this.field5758.field5536.field6618.length) {
                    this.field5758.field5536 = new class498(this.field5759 * 2);
                }
                int var12 = -arg3 + arg0;
                int var13 = var12;
                if (var12 < 0) {
                    var12 = 0;
                }
                int var14 = -arg3 + arg4;
                int var15 = var14;
                if (var14 < 0) {
                    var14 = 0;
                }
                int var16 = arg0 + arg3;
                if (super.field1842 + -1 < var16) {
                    var16 = super.field1842 + -1;
                }
                int var17 = arg3 + arg4;
                if (var17 > super.field1844 + -1) {
                    var17 = super.field1844 - 1;
                }
                int var18 = 0;
                int[] var19 = this.field5758.field5641;
                for (int var20 = var12; ~var16 <= ~var20; ++var20) {
                    boolean[] var26 = arg6[-var13 + var20];
                    for (int var27 = var14; var27 <= var17; ++var27) {
                        if (var26[-var15 + var27]) {
                            var19[var18++] = super.field1842 * var27 + var20;
                        }
                    }
                }
                if (~arg1 == 0) {
                    this.field5758.method2334(113);
                } else {
                    this.field5758.method2342(109, (float) arg1);
                    this.field5758.method2304((byte) 65);
                }
                this.field5758.method2325((byte) 102, ~(7 & this.field5757) != -1);
                for (int var21 = 0; var21 < this.field5797.length; ++var21) {
                    this.field5797[var21].method1149(20324, var18, var19);
                }
                if (!this.field5785.method162((byte) 41)) {
                    int var22 = this.field5758.field5564;
                    int var23 = this.field5758.field5588;
                    this.field5758.method343(0, var23, this.field5758.field5613);
                    this.field5758.method338(var9, var8 - 4.0F);
                    this.field5758.method2325((byte) 103, false);
                    this.field5758.method2337(false, -124);
                    this.field5758.method2290(true, 128);
                    this.field5758.method2349((byte) -101, -2);
                    this.field5758.method2322(this.field5758.field5611, 14);
                    this.field5758.method2271(-122, 8448, 7681);
                    this.field5758.method2338(34166, 0, false, 770);
                    this.field5758.method2289(770, -114, 0, 34167);
                    for (class383 var24 = this.field5785.method153(0); var24 != null; var24 = this.field5785.method161(-80)) {
                        class280 var25 = (class280) var24;
                        var25.method1662(arg4, arg0, arg6, 255, arg3);
                    }
                    this.field5758.method2338(5890, 0, false, 768);
                    this.field5758.method2289(770, 16, 0, 5890);
                    this.field5758.method2322((class119) null, 14);
                    this.field5758.method343(var22, var23, this.field5758.field5613);
                }
                if (this.field5770 != null) {
                    this.field5758.method338(var9, var8 - 8.0F);
                    this.field5758.method2334(108);
                    this.field5758.method2295(this.field5810, this.field5807, (class460) null, false, (class460) null);
                    this.field5770.method1586(arg2, arg3, arg0, 2, arg4, arg6);
                }
                this.field5758.method338(var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(CB)Z", line = 1017)
    public static final boolean method2398(char arg0, byte arg1) {
        ++field5778;
        int var2 = 79 / ((arg1 - -77) / 47);
        if ((arg0 <= 0 || arg0 >= 128) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 0) {
                char[] var3 = client.field2575;
                for (int var4 = 0; var4 < var3.length; ++var4) {
                    char var5 = var3[var4];
                    if (arg0 == var5) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V", line = 1057)
    public static final void method2399(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5780;
        int var5 = arg2;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        class184.method1160(class387.field5088[arg1], -7, arg4, arg0 + arg3, -arg0 + arg3);
        while (var5 < var6) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class387.field5088[arg1 + var6];
                int[] var10 = class387.field5088[-var6 + arg1];
                int var11 = arg3 - -var5;
                int var12 = -var5 + arg3;
                class184.method1160(var9, -7, arg4, var11, var12);
                class184.method1160(var10, -7, arg4, var11, var12);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class387.field5088[arg1 + var5];
            int[] var16 = class387.field5088[arg1 - var5];
            class184.method1160(var15, arg2 ^ -7, arg4, var13, var14);
            class184.method1160(var16, -7, arg4, var13, var14);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V", line = 1107)
    public final void method393(int arg0, int arg1) {
        ++field5776;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1114)
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5779;
        if (this.field5804 > 0) {
            this.field5758.method2333((byte) 72);
            this.field5758.method2344(-120, false);
            this.field5758.method2325((byte) 127, false);
            this.field5758.method2311(false, (byte) 102);
            this.field5758.method2337(false, -124);
            this.field5758.method2290(true, 0);
            this.field5758.method2349((byte) 118, -2);
            this.field5758.method2322((class119) null, 14);
            class175.field2274[0] = (float) arg2 / ((float) super.field1836 * 128.0F * (float) this.field5758.field5363);
            class175.field2274[4] = 0.0F;
            class175.field2274[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5758.field5363;
            class175.field2274[6] = 0.0F;
            class175.field2274[8] = 0.0F;
            class175.field2274[10] = 0.0F;
            class175.field2274[3] = 0.0F;
            class175.field2274[7] = 0.0F;
            class175.field2274[11] = 0.0F;
            class175.field2274[15] = 1.0F;
            class175.field2274[1] = 0.0F;
            class175.field2274[2] = 0.0F;
            class175.field2274[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5758.field5352;
            class175.field2274[5] = (float) arg2 / ((float) super.field1836 * 128.0F * (float) this.field5758.field5352);
            class175.field2274[14] = 0.0F;
            class175.field2274[9] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class175.field2274, 0);
            class175.field2274[13] = 0.0F;
            class175.field2274[5] = 0.0F;
            class175.field2274[4] = 0.0F;
            class175.field2274[3] = 0.0F;
            class175.field2274[14] = 0.0F;
            class175.field2274[12] = 0.0F;
            class175.field2274[2] = 0.0F;
            class175.field2274[6] = 1.0F;
            class175.field2274[7] = 0.0F;
            class175.field2274[15] = 1.0F;
            class175.field2274[9] = 1.0F;
            class175.field2274[8] = 0.0F;
            class175.field2274[0] = 1.0F;
            class175.field2274[1] = 0.0F;
            class175.field2274[10] = 0.0F;
            class175.field2274[11] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class175.field2274, 0);
            if (~(7 & this.field5757) == -1) {
                this.field5758.method2325((byte) 121, false);
            } else {
                this.field5758.method2325((byte) 113, true);
                this.field5758.method2301(128);
            }
            this.field5758.method2295(this.field5810, this.field5807, this.field5801, false, this.field5809);
            if (~(this.field5759 * 2) < ~this.field5758.field5536.field6618.length) {
                this.field5758.field5536 = new class498(this.field5759 * 2);
            } else {
                this.field5758.field5536.field6631 = 0;
            }
            int var9 = 0;
            class498 var10 = this.field5758.field5536;
            if (!this.field5758.field5593) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field1842 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5783[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    ++var9;
                                    var10.method2790(-951330584, var14[var15] & 65535);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field1842 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field5783[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    ++var9;
                                    var10.method2759((byte) -73, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class454 var17 = new class454(this.field5758, 5123, var10.field6618, var10.field6631);
                this.field5758.method2343(-117, var17, 0, var9, 4);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)I", line = 1288)
    public static final int method2400(byte arg0, int arg1, int arg2) {
        ++field5784;
        int var3 = arg1 * 57 + arg2;
        if (arg0 != 64) {
            return -90;
        } else {
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (134069157 & var5) >> 19;
        }
    }

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "(III)V", line = 1309)
    public final void method394(int arg0, int arg1, int arg2) {
        ++field5769;
        if (~(this.field5800[arg0][arg1] & 255) > ~arg2) {
            this.field5800[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Lba;IIIIZ)V", line = 1320)
    public final void method390(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5764;
        if (this.field5770 != null && arg0 != null) {
            int var7 = -(this.field5758.field5599 * arg2 >> 8) + arg1 >> this.field5758.field5504;
            int var8 = -(this.field5758.field5535 * arg2 >> 8) + arg3 >> this.field5758.field5504;
            this.field5770.method1592(arg0, var7, -27038, var8);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I", line = 1338)
    public final int method396(int arg0, int arg1) {
        ++field5789;
        int var3 = arg0 >> super.field1840;
        int var4 = arg1 >> super.field1840;
        if (var3 >= 0 && ~var4 <= -1 && ~(super.field1842 + -1) <= ~var3 && ~(super.field1844 + -1) <= ~var4) {
            int var5 = super.field1836 - 1 & arg0;
            int var6 = super.field1836 + -1 & arg1;
            int var7 = (-var5 + super.field1836) * this.field5793[var3][var4] - -(this.field5793[var3 + 1][var4] * var5) >> super.field1840;
            int var8 = (super.field1836 - var5) * this.field5793[var3][var4 + 1] - -(this.field5793[var3 + 1][var4 + 1] * var5) >> super.field1840;
            return (-var6 + super.field1836) * var7 + var6 * var8 >> super.field1840;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1364)
    public final void method392(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5781;
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
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method395(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "(Lba;IIIIZ)V", line = 1462)
    public final void method387(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5767;
        if (this.field5770 != null && arg0 != null) {
            int var7 = -(this.field5758.field5599 * arg2 >> 8) + arg1 >> this.field5758.field5504;
            int var8 = -(this.field5758.field5535 * arg2 >> 8) + arg3 >> this.field5758.field5504;
            this.field5770.method1587(var8, arg0, (byte) -93, var7);
        }
    }

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "(II)I", line = 1479)
    public final int method399(int arg0, int arg1) {
        ++field5760;
        return this.field5793[arg0][arg1];
    }
}
