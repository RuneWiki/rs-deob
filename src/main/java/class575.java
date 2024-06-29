import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class575 extends class137 {

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "Lmfa;")
    private class562 field8180 = new class562();

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "[[I")
    private int[][] field8175;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "Lap;")
    public class435 field8179;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    private int field8192;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "[[[I")
    private int[][][] field8166;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "[[S")
    public short[][] field8193;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "[[[I")
    public int[][][] field8169;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public int field8158;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "[[B")
    private byte[][] field8162;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "[[[I")
    private int[][][] field8186;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "[[F")
    private float[][] field8206;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "[[B")
    private byte[][] field8203;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "[[F")
    private float[][] field8199;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "[[F")
    private float[][] field8197;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    private int field8165;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[[[I")
    public int[][][] field8187;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "[[[I")
    public int[][][] field8189;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "[[[Lwl;")
    private class372[][][] field8194;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "Ltq;")
    private class572 field8204;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "Lmw;")
    private class449 field8173;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "[Lro;")
    public static class2[] field8181 = new class2[14];

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    private int field8167;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    private int field8184;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    private int field8195;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
    private int field8200;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Ljl;")
    public class245 field8196;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "Ljl;")
    public class245 field8201;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "Ljl;")
    public class245 field8202;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "Ljl;")
    private class245 field8207;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lrl;")
    private class659 field8205;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "[I")
    public static int[] field8177;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "[Lwl;")
    private class372[] field8198;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "[[[I")
    private int[][][] field8176;

    @OriginalMember(owner = "client!mh", name = "sa", descriptor = "(II)I")
    public final int method242(int arg0, int arg1) {
        ++field8159;
        int var3 = arg0 >> super.field1560;
        int var4 = arg1 >> super.field1560;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1558 + -1 && ~var4 >= ~(super.field1562 + -1)) {
            int var5 = super.field1561 - 1 & arg0;
            int var6 = super.field1561 - 1 & arg1;
            int var7 = (super.field1561 - var5) * this.field8175[var3][var4] + this.field8175[var3 + 1][var4] * var5 >> super.field1560;
            int var8 = (super.field1561 - var5) * this.field8175[var3][var4 + 1] - -(this.field8175[var3 + 1][var4 + 1] * var5) >> super.field1560;
            return (-var6 + super.field1561) * var7 + var6 * var8 >> super.field1560;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "ba", descriptor = "()V")
    public final void method248() {
        ++field8171;
        if (this.field8200 <= 0) {
            this.field8173 = null;
        } else {
            byte[][] var1 = new byte[super.field1558 - -1][super.field1562 - -1];
            for (int var2 = 1; super.field1558 > var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field1562; ++var103) {
                    var1[var2][var103] = (byte) ((this.field8203[var2][var103] >> 1) + (this.field8203[var2][var103 - 1] >> 2) + (this.field8203[var2 + -1][var103] >> 2) + (this.field8203[var2][var103 - -1] >> 3) + (this.field8203[var2 - -1][var103] >> 3));
                }
            }
            this.field8198 = new class372[this.field8204.method3230(false)];
            this.field8204.method3229(this.field8198, 20028);
            for (int var3 = 0; ~this.field8198.length < ~var3; ++var3) {
                this.field8198[var3].method2035(this.field8200, (byte) -121);
            }
            int var4 = 24;
            if (this.field8176 != null) {
                var4 += 4;
            }
            if (~(this.field8158 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field8179.field5925.method3431(this.field8200 * var4, false);
            Stream var6 = new Stream(var5);
            class372[] var7 = new class372[this.field8200];
            int var8 = class687.method3819(this.field8200 / 4, (byte) -113);
            if (var8 < 1) {
                var8 = 1;
            }
            class572 var9 = new class572(var8);
            class372[] var10 = new class372[this.field8195];
            for (int var11 = 0; super.field1558 > var11; ++var11) {
                for (int var30 = 0; var30 < super.field1562; ++var30) {
                    if (this.field8189[var11][var30] != null) {
                        class372[] var31 = this.field8194[var11][var30];
                        int[] var32 = this.field8169[var11][var30];
                        int[] var33 = this.field8187[var11][var30];
                        int[] var34 = this.field8166[var11][var30];
                        int[] var35 = this.field8189[var11][var30];
                        int[] var36 = this.field8186 == null ? null : this.field8186[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field8176 != null ? this.field8176[var11][var30] : null;
                        float var38 = this.field8197[var11][var30];
                        float var39 = this.field8199[var11][var30];
                        float var40 = this.field8206[var11][var30];
                        float var41 = this.field8197[var11][var30 - -1];
                        float var42 = this.field8199[var11][var30 - -1];
                        float var43 = this.field8206[var11][var30 + 1];
                        float var44 = this.field8197[var11 + 1][var30 + 1];
                        float var45 = this.field8199[var11 + 1][var30 + 1];
                        float var46 = this.field8206[var11 + 1][var30 + 1];
                        float var47 = this.field8197[var11 + 1][var30];
                        float var48 = this.field8199[var11 + 1][var30];
                        float var49 = this.field8206[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = 255 & var1[var11 - -1][var30];
                        int var54 = 0;
                        label340: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class372 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field8193[super.field1558 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field1560) - -var32[var57];
                            int var59 = (var30 << super.field1560) - -var33[var57];
                            int var60 = var58 >> this.field8192;
                            int var61 = var59 >> this.field8192;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var39;
                                var73 = var69 - var50;
                                var74 = var38;
                                var75 = var40;
                            } else if (var67 == 0 && ~super.field1561 == ~var68) {
                                var72 = var42;
                                var74 = var41;
                                var75 = var43;
                                var73 = var69 - var51;
                            } else if (super.field1561 == var67 && ~super.field1561 == ~var68) {
                                var75 = var46;
                                var72 = var45;
                                var73 = var69 - var52;
                                var74 = var44;
                            } else if (super.field1561 == var67 && ~var68 == -1) {
                                var75 = var49;
                                var73 = var69 - var53;
                                var72 = var48;
                                var74 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field1561;
                                float var77 = (float) var68 / (float) super.field1561;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var72 = (-var79 + var82) * var77 + var79;
                                var74 = (var81 - var78) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = var50 - -((var53 - var50) * var67 >> super.field1560);
                                int var85 = ((var52 - var51) * var67 >> super.field1560) + var51;
                                var73 = var69 - (((-var84 + var85) * var68 >> super.field1560) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class505.field7285[var62 & 65408 | var86];
                                if (~(7 & this.field8158) == -1) {
                                    float var87 = this.field8179.field6020[2] * var75 + this.field8179.field6020[0] * var74 + this.field8179.field6020[1] * var72;
                                    var71 = var87 * (!(var87 > 0.0F) ? this.field8179.field5964 : this.field8179.field6066) + this.field8179.field6055;
                                }
                            }
                            class270 var88 = null;
                            if (~(this.field8165 - 1 & var58) == -1 && (this.field8165 + -1 & var59) == 0) {
                                var88 = var9.method3234((byte) -63, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class498) var88).field7187;
                                var89 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var31[var57].field3405 > ~var7[var89].field3405) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (var63 & 127) * var73 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class505.field7285[var90 | 65408 & var63];
                                    if (~(7 & this.field8158) == -1) {
                                        float var92 = this.field8179.field6020[2] * var75 + this.field8179.field6020[1] * var72 + this.field8179.field6020[0] * var74;
                                        float var93 = var71 * (var71 > 0.0F ? this.field8179.field6066 : this.field8179.field5964) + this.field8179.field6055;
                                        int var94 = (16776549 & var91) >> 16;
                                        int var95 = 255 & var91 >> 8;
                                        int var96 = var91 & 255;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var98 <= -1) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var99 | var97 << 16 | var98 << 8;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field8179.field6030) {
                                    var6.method3438((float) var58);
                                    var6.method3438((float) (var64 + this.method242(var58, var59)));
                                    var6.method3438((float) var59);
                                    var6.method3445((byte) (var91 >> 16));
                                    var6.method3445((byte) (var91 >> 8));
                                    var6.method3445((byte) var91);
                                    var6.method3445(-1);
                                    var6.method3438((float) var58);
                                    var6.method3438((float) var59);
                                    if (this.field8176 != null) {
                                        var6.method3438((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field8158) != -1) {
                                        var6.method3438(var74);
                                        var6.method3438(var72);
                                        var6.method3438(var75);
                                    }
                                } else {
                                    var6.method3444((float) var58);
                                    var6.method3444((float) (var64 + this.method242(var58, var59)));
                                    var6.method3444((float) var59);
                                    var6.method3445((byte) (var91 >> 16));
                                    var6.method3445((byte) (var91 >> 8));
                                    var6.method3445((byte) var91);
                                    var6.method3445(-1);
                                    var6.method3444((float) var58);
                                    var6.method3444((float) var59);
                                    if (this.field8176 != null) {
                                        var6.method3444((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((7 & this.field8158) != 0) {
                                        var6.method3444(var74);
                                        var6.method3444(var72);
                                        var6.method3444(var75);
                                    }
                                }
                                var89 = this.field8167++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method3235(var65, -1, new class498(var56[var57]));
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method2036(4, var71, var73, var89, var70);
                            }
                            ++this.field8184;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field8167; ++var12) {
                class372 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2039(var12, (byte) 102);
                }
            }
            for (int var13 = 0; ~super.field1558 < ~var13; ++var13) {
                for (int var18 = 0; super.field1562 > var18; ++var18) {
                    short[] var19 = this.field8193[super.field1558 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class372 var25 = var7[var22];
                            class372 var26 = var7[var23];
                            class372 var27 = var7[var24];
                            class372 var28 = null;
                            if (var25 != null) {
                                var25.method2044(var18, var13, var20, 7);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method2044(var18, var13, var20, 7);
                                if (var28 == null || ~var26.field3405 > ~var28.field3405) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2044(var18, var13, var20, 7);
                                if (var28 == null || ~var28.field3405 < ~var27.field3405) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2039(var22, (byte) -70);
                                }
                                if (var26 != null) {
                                    var28.method2039(var23, (byte) 109);
                                }
                                if (var27 != null) {
                                    var28.method2039(var24, (byte) -115);
                                }
                                var28.method2044(var18, var13, var20, 7);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3434();
            this.field8205 = this.field8179.method2347(var5, var4, true, false, var6.method3436());
            this.field8202 = new class245(this.field8205, 5126, 3, 0);
            this.field8207 = new class245(this.field8205, 5121, 4, 12);
            byte var14;
            if (this.field8176 == null) {
                var14 = 24;
                this.field8201 = new class245(this.field8205, 5126, 2, 16);
            } else {
                this.field8201 = new class245(this.field8205, 5126, 3, 16);
                var14 = 28;
            }
            if ((this.field8158 & 7) != 0) {
                this.field8196 = new class245(this.field8205, 5126, 3, var14);
            }
            long[] var15 = new long[this.field8198.length];
            for (int var16 = 0; var16 < this.field8198.length; ++var16) {
                class372 var17 = this.field8198[var16];
                var15[var16] = var17.field3405;
                var17.method2038((byte) -61, this.field8167);
            }
            class538.method3068(-104, this.field8198, var15);
            if (this.field8173 != null) {
                this.field8173.method2492(-20766);
            }
        }
        this.field8169 = this.field8187 = null;
        this.field8166 = null;
        this.field8176 = null;
        this.field8197 = this.field8199 = this.field8206 = null;
        this.field8203 = null;
        this.field8186 = null;
        this.field8204 = null;
        this.field8194 = null;
        this.field8189 = null;
    }

    @OriginalMember(owner = "client!mh", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method249(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field8170;
        if (arg5 != null && this.field8176 == null) {
            this.field8176 = new int[super.field1558][super.field1562][];
        }
        if (arg3 != null && this.field8186 == null) {
            this.field8186 = new int[super.field1558][super.field1562][];
        }
        this.field8169[arg0][arg1] = arg2;
        this.field8187[arg0][arg1] = arg4;
        this.field8189[arg0][arg1] = arg6;
        this.field8166[arg0][arg1] = arg7;
        if (this.field8176 != null) {
            this.field8176[arg0][arg1] = arg5;
        }
        if (this.field8186 != null) {
            this.field8186[arg0][arg1] = arg3;
        }
        class372[] var15 = this.field8194[arg0][arg1] = new class372[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg8[var16];
            class270 var19;
            for (var19 = this.field8204.method3234((byte) -34, var17); var19 != null; var19 = this.field8204.method3233(124)) {
                class372 var20 = (class372) var19;
                if (~arg8[var16] == ~var20.field4824 && (float) arg9[var16] == var20.field4825 && var20.field4818 == arg10 && ~var20.field4832 == ~arg11 && var20.field4822 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class372) var19;
            } else {
                var15[var16] = new class372(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field8204.method3235(var17, -1, var15[var16]);
            }
        }
        if (arg13) {
            this.field8162[arg0][arg1] = (byte) class139.method776(this.field8162[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field8195) {
            this.field8195 = arg6.length;
        }
        this.field8200 += arg6.length;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILcaa;IB)V")
    private final void method3250(int arg0, class272 arg1, int arg2, byte arg3) {
        ++field8188;
        int[] var5 = this.field8169[arg2][arg0];
        int[] var6 = this.field8187[arg2][arg0];
        int var7 = var5.length;
        if (this.field8179.field6074.length < var7) {
            this.field8179.field6074 = new int[var7];
            this.field8179.field6069 = new int[var7];
        }
        int[] var8 = this.field8179.field6074;
        int[] var9 = this.field8179.field6069;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field8179.field5927;
            var9[var10] = var6[var10] >> this.field8179.field5927;
        }
        if (arg3 == -8) {
            int var11 = 0;
            while (var11 < var7) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16))) < -1) {
                    arg1.method1551(-124, var15, var14, var12, var13, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lod;[I)V")
    public final void method254(class463 arg0, int[] arg1) {
        ++field8172;
        this.field8180.method3164(new class417(this.field8179, this, arg0, arg1), 256);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8174;
        if (this.field8200 > 0) {
            this.field8179.method2375(-32);
            this.field8179.method2377(false, false);
            this.field8179.method2400((byte) 108, false);
            this.field8179.method2386(false, -74);
            this.field8179.method2382(false, -32);
            this.field8179.method2378(true, 0);
            this.field8179.method2321(-2, (byte) 95);
            this.field8179.method2388((byte) 103, (class412) null);
            class428.field5683[0] = (float) arg2 / ((float) super.field1561 * 128.0F * (float) this.field8179.field5805);
            class428.field5683[6] = 0.0F;
            class428.field5683[8] = 0.0F;
            class428.field5683[3] = 0.0F;
            class428.field5683[15] = 1.0F;
            class428.field5683[14] = 0.0F;
            class428.field5683[4] = 0.0F;
            class428.field5683[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8179.field5907;
            class428.field5683[1] = 0.0F;
            class428.field5683[7] = 0.0F;
            class428.field5683[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field8179.field5805) + -1.0F;
            class428.field5683[11] = 0.0F;
            class428.field5683[10] = 0.0F;
            class428.field5683[5] = (float) arg2 / ((float) super.field1561 * 128.0F * (float) this.field8179.field5907);
            class428.field5683[9] = 0.0F;
            class428.field5683[2] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class428.field5683, 0);
            class428.field5683[1] = 0.0F;
            class428.field5683[3] = 0.0F;
            class428.field5683[13] = 0.0F;
            class428.field5683[4] = 0.0F;
            class428.field5683[15] = 1.0F;
            class428.field5683[10] = 0.0F;
            class428.field5683[8] = 0.0F;
            class428.field5683[14] = 0.0F;
            class428.field5683[12] = 0.0F;
            class428.field5683[6] = 1.0F;
            class428.field5683[7] = 0.0F;
            class428.field5683[9] = 1.0F;
            class428.field5683[2] = 0.0F;
            class428.field5683[5] = 0.0F;
            class428.field5683[11] = 0.0F;
            class428.field5683[0] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class428.field5683, 0);
            if ((this.field8158 & 7) != 0) {
                this.field8179.method2400((byte) 106, true);
                this.field8179.method2399(-123);
            } else {
                this.field8179.method2400((byte) 116, false);
            }
            this.field8179.method2379(this.field8202, 15132, this.field8201, this.field8207, this.field8196);
            if (this.field8179.field6033.field6209.length >= this.field8184 * 2) {
                this.field8179.field6033.field6215 = 0;
            } else {
                this.field8179.field6033 = new class146(this.field8184 * 2);
            }
            int var9 = 0;
            class146 var10 = this.field8179.field6033;
            if (!this.field8179.field6030) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field1558 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field8193[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method2568((byte) -31, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field1558 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field8193[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    var10.method2537(18244, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class1 var17 = new class1(this.field8179, 5123, var10.field6209, var10.field6215);
                this.field8179.method2364(var9, 0, 4, (byte) 82, var17);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Lgs;")
    public static final class41 method3251(int arg0, int arg1) {
        ++field8168;
        if (arg0 >= -51) {
            field8177 = null;
        }
        class41[] var2 = class345.method1921(18570);
        for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
            class41 var4 = var2[var3];
            if (~var4.field436 == ~arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method250(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8161;
        if (this.field8173 != null && arg0 != null) {
            int var7 = -(this.field8179.field6058 * arg2 >> 8) + arg1 >> this.field8179.field5927;
            int var8 = -(this.field8179.field6040 * arg2 >> 8) + arg3 >> this.field8179.field5927;
            return this.field8173.method2493(arg0, var7, 0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method247(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8178;
        if (this.field8173 != null && arg0 != null) {
            int var7 = -(this.field8179.field6058 * arg2 >> 8) + arg1 >> this.field8179.field5927;
            int var8 = -(this.field8179.field6040 * arg2 >> 8) + arg3 >> this.field8179.field5927;
            this.field8173.method2494(var8, var7, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!mh", name = "EA", descriptor = "(III)V")
    public final void method243(int arg0, int arg1, int arg2) {
        if ((this.field8203[arg0][arg1] & 255) < arg2) {
            this.field8203[arg0][arg1] = (byte) arg2;
        }
        ++field8183;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public static void method3252(int arg0) {
        field8181 = null;
        if (arg0 > 14) {
            field8177 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lap;IIII[[I[[II)V")
    public class575(class435 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field8175 = arg5;
        this.field8179 = arg0;
        this.field8192 = super.field1560 + -2;
        this.field8166 = new int[arg3][arg4][];
        this.field8193 = new short[arg3 * arg4][];
        this.field8169 = new int[arg3][arg4][];
        this.field8158 = arg2;
        this.field8162 = new byte[arg3][arg4];
        this.field8186 = new int[arg3][arg4][];
        this.field8206 = new float[super.field1558 + 1][super.field1562 + 1];
        this.field8203 = new byte[arg3 - -1][arg4 + 1];
        this.field8199 = new float[super.field1558 + 1][super.field1562 + 1];
        this.field8197 = new float[super.field1558 + 1][super.field1562 - -1];
        this.field8165 = 1 << this.field8192;
        this.field8187 = new int[arg3][arg4][];
        this.field8189 = new int[arg3][arg4][];
        this.field8194 = new class372[arg3][arg4][];
        for (int var9 = 1; ~super.field1562 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field1558 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field8197[var10][var9] = (float) var11 * var13;
                this.field8199[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field8206[var10][var9] = (float) var12 * var13;
            }
        }
        this.field8204 = new class572(128);
        if (~(this.field8158 & 16) != -1) {
            this.field8173 = new class449(this.field8179, this);
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IILw;)Lw;")
    public final class269 method240(int arg0, int arg1, class269 arg2) {
        ++field8164;
        if (~(1 & this.field8162[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field1561 >> this.field8179.field5927;
            class272 var5 = (class272) arg2;
            class272 var6;
            if (var5 != null && var5.method1553(false, var4, var4)) {
                var6 = var5;
                var5.method1556((byte) 36);
            } else {
                var6 = new class272(this.field8179, var4, var4);
            }
            var6.method1550(0, var4, 643436272, var4, 0);
            this.method3250(arg1, var6, arg0, (byte) -8);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mh", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method251(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8190;
        if (this.field8173 != null && arg0 != null) {
            int var7 = -(this.field8179.field6058 * arg2 >> 8) + arg1 >> this.field8179.field5927;
            int var8 = arg3 - (this.field8179.field6040 * arg2 >> 8) >> this.field8179.field5927;
            this.field8173.method2495(var7, -21, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public final void method252(int arg0, int arg1) {
        ++field8185;
    }

    @OriginalMember(owner = "client!mh", name = "JA", descriptor = "(II)I")
    public final int method253(int arg0, int arg1) {
        ++field8191;
        return this.field8175[arg0][arg1];
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method245(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field8182;
        this.method3253(arg1, -1, arg4, arg3, arg0, arg2, -50);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method244(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field8163;
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
        this.method249(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ[[ZIII)V")
    private final void method3253(int arg0, int arg1, boolean arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (this.field8198 != null) {
            int var8 = arg5 - -1 + arg5;
            int var9 = var8 * var8;
            if (var9 > this.field8179.field6070.length) {
                this.field8179.field6070 = new int[var9];
            }
            if (~this.field8179.field6033.field6209.length > ~(this.field8184 * 2)) {
                this.field8179.field6033 = new class146(this.field8184 * 2);
            }
            int var10 = arg4 - arg5;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg5 + arg0;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg4 + arg5;
            if (~var14 < ~(super.field1558 + -1)) {
                var14 = super.field1558 + -1;
            }
            int var15 = arg0 + arg5;
            if (~var15 < ~(super.field1562 + -1)) {
                var15 = super.field1562 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field8179.field6070;
            for (int var18 = var10; var18 <= var14; ++var18) {
                boolean[] var24 = arg3[-var11 + var18];
                for (int var25 = var12; ~var15 <= ~var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field1558 * var25 + var18;
                    }
                }
            }
            if (arg1 != -1) {
                this.field8179.method2350((byte) 26, (float) arg1);
                this.field8179.method2393((byte) -107);
            } else {
                this.field8179.method2365(84);
            }
            this.field8179.method2400((byte) 105, ~(7 & this.field8158) != -1);
            for (int var19 = 0; ~this.field8198.length < ~var19; ++var19) {
                this.field8198[var19].method2040(var17, -20871, var16);
            }
            if (!this.field8180.method3161((byte) 116)) {
                int var20 = this.field8179.field6013;
                int var21 = this.field8179.field5991;
                this.field8179.method363(0, var21, this.field8179.field6009);
                this.field8179.method2400((byte) 113, false);
                this.field8179.method2382(false, -32);
                this.field8179.method2378(true, 128);
                this.field8179.method2321(-2, (byte) 95);
                this.field8179.method2388((byte) 81, this.field8179.field6044);
                this.field8179.method2371(8448, 7681, -88);
                this.field8179.method2372(0, false, 770, 34166);
                this.field8179.method2390(34167, true, 0, 770);
                for (class270 var22 = this.field8180.method3174((byte) 49); var22 != null; var22 = this.field8180.method3168(false)) {
                    class417 var23 = (class417) var22;
                    var23.method2256((byte) 60, arg3, arg5, arg4, arg0);
                }
                this.field8179.method2372(0, false, 768, 5890);
                this.field8179.method2390(5890, true, 0, 770);
                this.field8179.method2388((byte) 122, (class412) null);
                this.field8179.method363(var20, var21, this.field8179.field6009);
            }
            if (this.field8173 != null) {
                this.field8179.method2379(this.field8202, 15132, this.field8201, (class245) null, (class245) null);
                this.field8173.method2498(16067, arg4, arg2, arg0, arg5, arg3);
            }
        }
        ++field8160;
        if (arg6 >= -42) {
            this.field8199 = null;
        }
    }
}
