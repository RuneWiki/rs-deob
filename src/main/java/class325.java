import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class325 extends class174 {

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lui;")
    private class193 field4129 = new class193();

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lbda;")
    public class428 field4114;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "[[I")
    private int[][] field4136;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[[S")
    public short[][] field4124;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[[[I")
    public int[][][] field4113;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "[[F")
    private float[][] field4154;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    private int field4132;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "[[F")
    private float[][] field4152;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "[[[Luh;")
    private class143[][][] field4140;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "[[[I")
    private int[][][] field4112;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "[[F")
    private float[][] field4153;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[[[I")
    public int[][][] field4111;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "[[B")
    private byte[][] field4133;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[[[I")
    private int[][][] field4121;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "[[B")
    private byte[][] field4151;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[[[I")
    private int[][][] field4137;

    @OriginalMember(owner = "client!ml", name = "eb", descriptor = "Lpt;")
    private class451 field4160;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Lrt;")
    private class192 field4149;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lsw;")
    public static class641 field4116 = new class641(5);

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field4147 = -1;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "F")
    public static float field4146;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    private int field4119;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
    private int field4158;

    @OriginalMember(owner = "client!ml", name = "db", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "Lvr;")
    public class116 field4155;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "Lvr;")
    private class116 field4156;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "Lrq;")
    private class293 field4150;

    @OriginalMember(owner = "client!ml", name = "fb", descriptor = "[Luh;")
    private class143[] field4161;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "[[[I")
    private int[][][] field4145;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method851(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4138;
        if (this.field4149 != null && arg0 != null) {
            int var7 = arg1 - (this.field4114.field5727 * arg2 >> 8) >> this.field4114.field5699;
            int var8 = -(this.field4114.field5760 * arg2 >> 8) + arg3 >> this.field4114.field5699;
            return this.field4149.method1038(var8, 36, var7, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "ba", descriptor = "(II)I")
    public final int method855(int arg0, int arg1) {
        ++field4143;
        return this.field4136[arg0][arg1];
    }

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "()V")
    public final void method842() {
        ++field4118;
        if (~this.field4159 >= -1) {
            this.field4149 = null;
        } else {
            byte[][] var1 = new byte[super.field2116 + 1][super.field2114 - -1];
            for (int var2 = 1; ~var2 > ~super.field2116; ++var2) {
                for (int var105 = 1; var105 < super.field2114; ++var105) {
                    var1[var2][var105] = (byte) ((this.field4151[var2][var105 + -1] >> 2) + (this.field4151[var2][var105] >> 1) + (this.field4151[var2 - -1][var105] >> 3) + (this.field4151[var2][var105 - -1] >> 3) + (this.field4151[var2 - 1][var105] >> 2));
                }
            }
            class143[] var3 = new class143[this.field4160.method2639(121)];
            this.field4160.method2644(var3, 4923);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method792(this.field4159, -16011);
            }
            int var5 = 24;
            if (this.field4145 != null) {
                var5 += 4;
            }
            if ((this.field4126 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field4114.field5558.method3336(this.field4159 * var5, false);
            Stream var7 = new Stream(var6);
            class143[] var8 = new class143[this.field4159];
            int var9 = class308.method1711((byte) -66, this.field4159 / 4);
            if (var9 < 1) {
                var9 = 1;
            }
            class451 var10 = new class451(var9);
            class143[] var11 = new class143[this.field4158];
            for (int var12 = 0; super.field2116 > var12; ++var12) {
                for (int var32 = 0; super.field2114 > var32; ++var32) {
                    if (this.field4121[var12][var32] != null) {
                        class143[] var33 = this.field4140[var12][var32];
                        int[] var34 = this.field4113[var12][var32];
                        int[] var35 = this.field4111[var12][var32];
                        int[] var36 = this.field4137[var12][var32];
                        int[] var37 = this.field4121[var12][var32];
                        int[] var38 = this.field4112 != null ? this.field4112[var12][var32] : null;
                        int[] var39 = this.field4145 != null ? this.field4145[var12][var32] : null;
                        if (var36 == null) {
                            var36 = var37;
                        }
                        float var40 = this.field4153[var12][var32];
                        float var41 = this.field4152[var12][var32];
                        float var42 = this.field4154[var12][var32];
                        float var43 = this.field4153[var12][var32 - -1];
                        float var44 = this.field4152[var12][var32 + 1];
                        float var45 = this.field4154[var12][var32 + 1];
                        float var46 = this.field4153[var12 + 1][var32 + 1];
                        float var47 = this.field4152[var12 + 1][var32 - -1];
                        float var48 = this.field4154[var12 - -1][var32 + 1];
                        float var49 = this.field4153[var12 + 1][var32];
                        float var50 = this.field4152[var12 + 1][var32];
                        float var51 = this.field4154[var12 + 1][var32];
                        int var52 = 255 & var1[var12][var32];
                        int var53 = var1[var12][var32 + 1] & 255;
                        int var54 = 255 & var1[var12 + 1][var32 + 1];
                        int var55 = var1[var12 + 1][var32] & 255;
                        int var56 = 0;
                        label360: for (int var57 = 0; ~var37.length < ~var57; ++var57) {
                            class143 var103 = var33[var57];
                            for (int var104 = 0; var56 > var104; ++var104) {
                                if (var11[var104] == var103) {
                                    continue label360;
                                }
                            }
                            var11[var56++] = var103;
                        }
                        short[] var58 = this.field4124[super.field2116 * var32 + var12] = new short[var37.length];
                        for (int var59 = 0; ~var37.length < ~var59; ++var59) {
                            int var60 = (var12 << super.field2111) - -var34[var59];
                            int var61 = (var32 << super.field2111) + var35[var59];
                            int var62 = var60 >> this.field4148;
                            int var63 = var61 >> this.field4148;
                            int var64 = var37[var59];
                            int var65 = var36[var59];
                            int var66 = var38 != null ? var38[var59] : 0;
                            long var67 = (long) var63 | (long) (var62 << 16) | (long) var65 << 48 | (long) var64 << 32;
                            int var69 = var34[var59];
                            int var70 = var35[var59];
                            byte var71 = 74;
                            int var72 = 0;
                            float var73 = 1.0F;
                            float var74;
                            float var75;
                            int var76;
                            float var77;
                            if (~var69 == -1 && ~var70 == -1) {
                                var74 = var40;
                                var75 = var42;
                                var76 = var71 - var52;
                                var77 = var41;
                            } else if (~var69 == -1 && ~super.field2115 == ~var70) {
                                var77 = var44;
                                var75 = var45;
                                var76 = var71 - var53;
                                var74 = var43;
                            } else if (~super.field2115 == ~var69 && super.field2115 == var70) {
                                var75 = var48;
                                var76 = var71 - var54;
                                var77 = var47;
                                var74 = var46;
                            } else if (~super.field2115 == ~var69 && var70 == 0) {
                                var76 = var71 - var55;
                                var75 = var51;
                                var77 = var50;
                                var74 = var49;
                            } else {
                                float var78 = (float) var69 / (float) super.field2115;
                                float var79 = (float) var70 / (float) super.field2115;
                                float var80 = (var49 - var40) * var78 + var40;
                                float var81 = (var50 - var41) * var78 + var41;
                                float var82 = (-var42 + var51) * var78 + var42;
                                float var83 = (var46 - var43) * var78 + var43;
                                float var84 = (var47 - var44) * var78 + var44;
                                var74 = (var83 - var80) * var79 + var80;
                                var77 = (-var81 + var84) * var79 + var81;
                                float var85 = (-var45 + var48) * var78 + var45;
                                var75 = (var85 - var82) * var79 + var82;
                                int var86 = ((-var52 + var55) * var69 >> super.field2111) + var52;
                                int var87 = ((-var53 + var54) * var69 >> super.field2111) + var53;
                                var76 = var71 - (((var87 - var86) * var70 >> super.field2111) + var86);
                            }
                            if (var64 != -1) {
                                int var88 = (var64 & 127) * var76 >> 7;
                                if (~var88 <= -3) {
                                    if (var88 > 126) {
                                        var88 = 126;
                                    }
                                } else {
                                    var88 = 2;
                                }
                                if ((7 & this.field4126) == 0) {
                                    float var89 = this.field4114.field5745[2] * var75 + this.field4114.field5745[1] * var77 + this.field4114.field5745[0] * var74;
                                    var73 = this.field4114.field5774 + var89 * (!(var89 > 0.0F) ? this.field4114.field5702 : this.field4114.field5746);
                                }
                                var72 = class103.field1259[var64 & 65408 | var88];
                            }
                            class544 var90 = null;
                            if (~(var60 & this.field4132 + -1) == -1 && ~(var61 & this.field4132 - 1) == -1) {
                                var90 = var10.method2645(var67, (byte) -83);
                            }
                            int var101;
                            if (var90 == null) {
                                int var92;
                                if (var64 != var65) {
                                    int var91 = (var65 & 127) * var76 >> 7;
                                    if (var91 >= 2) {
                                        if (~var91 < -127) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var92 = class103.field1259[65408 & var65 | var91];
                                    if ((this.field4126 & 7) == 0) {
                                        float var93 = this.field4114.field5745[2] * var75 + this.field4114.field5745[0] * var74 + this.field4114.field5745[1] * var77;
                                        float var94 = (var73 > 0.0F ? this.field4114.field5746 : this.field4114.field5702) * var73 + this.field4114.field5774;
                                        int var95 = (16733523 & var92) >> 16;
                                        int var96 = (var92 & 65302) >> 8;
                                        int var97 = (int) ((float) var95 * var94);
                                        int var98 = var92 & 255;
                                        int var99 = (int) ((float) var96 * var94);
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        int var100 = (int) ((float) var98 * var94);
                                        if (~var99 <= -1) {
                                            if (var99 > 255) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        if (~var100 > -1) {
                                            var100 = 0;
                                        } else if (var100 > 255) {
                                            var100 = 255;
                                        }
                                        var92 = var100 | var97 << 16 | var99 << 8;
                                    }
                                } else {
                                    var92 = var72;
                                }
                                if (!Stream.method3340()) {
                                    var7.method3344((float) var60);
                                    var7.method3344((float) (this.method847(var60, var61) - -var66));
                                    var7.method3344((float) var61);
                                    var7.method3344((float) var60);
                                    var7.method3344((float) var61);
                                    if (this.field4145 != null) {
                                        var7.method3344((float) (var39 != null ? var39[var59] + -1 : 0));
                                    }
                                    if (~(7 & this.field4126) != -1) {
                                        var7.method3344(var74);
                                        var7.method3344(var77);
                                        var7.method3344(var75);
                                    }
                                } else {
                                    var7.method3348((float) var60);
                                    var7.method3348((float) (this.method847(var60, var61) - -var66));
                                    var7.method3348((float) var61);
                                    var7.method3348((float) var60);
                                    var7.method3348((float) var61);
                                    if (this.field4145 != null) {
                                        var7.method3348((float) (var39 == null ? 0 : var39[var59] + -1));
                                    }
                                    if (~(this.field4126 & 7) != -1) {
                                        var7.method3348(var74);
                                        var7.method3348(var77);
                                        var7.method3348(var75);
                                    }
                                }
                                if (~this.field4114.field5766 == -1) {
                                    var7.method3345(var92 | -16777216);
                                } else {
                                    var7.method3349(var92 | -16777216);
                                }
                                var101 = this.field4141++;
                                var58[var59] = (short) var101;
                                if (var64 != -1) {
                                    var8[var101] = var33[var59];
                                }
                                var10.method2640(1, var67, new class492(var58[var59]));
                            } else {
                                var58[var59] = ((class492) var90).field6867;
                                var101 = var58[var59] & 65535;
                                if (var64 != -1 && ~var33[var59].field7967 > ~var8[var101].field7967) {
                                    var8[var101] = var33[var59];
                                }
                            }
                            for (int var102 = 0; var102 < var56; ++var102) {
                                var11[var102].method784(var76, var101, var73, var72, 0);
                            }
                            ++this.field4119;
                        }
                    }
                }
            }
            for (int var13 = 0; ~this.field4141 < ~var13; ++var13) {
                class143 var31 = var8[var13];
                if (var31 != null) {
                    var31.method786((byte) 32, var13);
                }
            }
            for (int var14 = 0; ~super.field2116 < ~var14; ++var14) {
                for (int var20 = 0; var20 < super.field2114; ++var20) {
                    short[] var21 = this.field4124[super.field2116 * var20 + var14];
                    if (var21 != null) {
                        int var22 = 0;
                        int var23 = 0;
                        while (~var21.length < ~var23) {
                            int var24 = var21[var23++] & 65535;
                            int var25 = var21[var23++] & 65535;
                            int var26 = var21[var23++] & 65535;
                            class143 var27 = var8[var24];
                            class143 var28 = var8[var25];
                            class143 var29 = var8[var26];
                            class143 var30 = null;
                            if (var27 != null) {
                                var30 = var27;
                                var27.method787((byte) 117, var14, var20, var22);
                            }
                            if (var28 != null) {
                                var28.method787((byte) 117, var14, var20, var22);
                                if (var30 == null || var30.field7967 > var28.field7967) {
                                    var30 = var28;
                                }
                            }
                            if (var29 != null) {
                                var29.method787((byte) 117, var14, var20, var22);
                                if (var30 == null || var29.field7967 < var30.field7967) {
                                    var30 = var29;
                                }
                            }
                            if (var30 != null) {
                                if (var27 != null) {
                                    var30.method786((byte) 52, var24);
                                }
                                if (var28 != null) {
                                    var30.method786((byte) 63, var25);
                                }
                                if (var29 != null) {
                                    var30.method786((byte) 55, var26);
                                }
                                var30.method787((byte) 116, var14, var20, var22);
                            }
                            ++var22;
                        }
                    }
                }
            }
            var7.method3342();
            this.field4150 = this.field4114.method1823(124, false);
            this.field4150.method439(this.field4141 * var5, var6, 26190, var5);
            if (~(this.field4126 & 7) != -1) {
                if (this.field4145 == null) {
                    this.field4156 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field364, class44.field365 }) }, 0);
                    this.field4155 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field364 }), new class297(class44.field365) }, 0);
                } else {
                    this.field4156 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field366, class44.field364, class44.field365 }) }, 0);
                    this.field4155 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field366, class44.field364 }), new class297(class44.field365) }, 0);
                }
            } else if (this.field4145 != null) {
                this.field4156 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field366, class44.field365 }) }, 0);
                this.field4155 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field366 }), new class297(class44.field365) }, 0);
            } else {
                this.field4156 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field365 }) }, 0);
                this.field4155 = this.field4114.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367 }), new class297(class44.field365) }, 0);
            }
            int var15 = 0;
            for (int var16 = 0; ~var3.length < ~var16; ++var16) {
                if (~var3[var16].field1721 < -1) {
                    var3[var15++] = var3[var16];
                }
            }
            this.field4161 = new class143[var15];
            long[] var17 = new long[var15];
            for (int var18 = 0; var15 > var18; ++var18) {
                class143 var19 = var3[var18];
                var17[var18] = var19.field7967;
                this.field4161[var18] = var19;
                var19.method789(-71, this.field4141);
            }
            class639.method3663(this.field4161, var17, true);
            if (this.field4149 != null) {
                this.field4149.method1034(false);
            }
        }
        this.field4151 = null;
        this.field4153 = this.field4152 = this.field4154 = null;
        this.field4140 = null;
        this.field4121 = null;
        this.field4145 = null;
        this.field4137 = null;
        this.field4113 = this.field4111 = null;
        this.field4112 = null;
        this.field4160 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4131;
        if (this.field4159 > 0) {
            class419 var9 = this.field4114.method2425(this.field4119, -22571);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method440(-115, true);
                if (var14 != null) {
                    Stream var15 = this.field4114.method2426(var14, (byte) 11);
                    if (!Stream.method3340()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field2116 * var16 + arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[var18 - arg3][-arg4 + var16]) {
                                    short[] var19 = this.field4124[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            var15.method3341(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field2116 * var22 + arg3;
                            for (int var26 = arg3; ~var26 > ~arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field4124[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            var15.method3339(var29);
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
                    var15.method3342();
                    if (var9.method442(125)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field4114.method2483(9588);
                this.field4114.method2424(0, false);
                this.field4114.method2452(false, (byte) -94);
                this.field4114.method2441(false, 128);
                this.field4114.method2478((byte) 54, false);
                this.field4114.method2405(0, -18001);
                this.field4114.method2439(-2, false, false, (byte) 118);
                this.field4114.method2459(127, (class440) null);
                class335 var23 = this.field4114.method2471((byte) 123);
                float[] var24 = this.field4114.method2422(0);
                var24[9] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4114.field5564;
                var24[3] = 0.0F;
                var24[10] = 0.0F;
                var24[1] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field2115 * 128.0F * (float) this.field4114.field5512);
                var24[8] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field2115 * 128.0F * (float) this.field4114.field5564);
                var24[2] = 0.0F;
                var24[15] = 1.0F;
                var24[4] = 0.0F;
                var24[11] = 0.0F;
                var24[6] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field4114.field5512) + -1.0F;
                var24[7] = 0.0F;
                var24[14] = 0.0F;
                var23.method1887(1.0F, 0.0F, (byte) 8, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                this.field4114.method2461((byte) 106);
                this.field4114.method2457((byte) 109);
                if ((7 & this.field4126) != 0) {
                    this.field4114.method2452(true, (byte) -94);
                    this.field4114.method1841(-88);
                } else {
                    this.field4114.method2452(false, (byte) -94);
                }
                this.field4114.method1834(false, 21492);
                this.field4114.method1837(this.field4156, 9);
                this.field4114.method1792(this.field4150, 0, (byte) 89);
                this.field4114.method1801(var11, -var11 + var12 + 1, 1440, class384.field5077, var9, var10 / 3, 0);
                this.field4114.method1834(true, 21492);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lcba;[I)V")
    public final void method850(class469 arg0, int[] arg1) {
        this.field4129.method1040(new class161(this.field4114, this, arg0, arg1), -91);
        ++field4120;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public static void method1780(int arg0) {
        if (arg0 < 32) {
            field4147 = 35;
        }
        field4116 = null;
    }

    @OriginalMember(owner = "client!ml", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method848(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4142;
        if (this.field4149 != null && arg0 != null) {
            int var7 = -(this.field4114.field5727 * arg2 >> 8) + arg1 >> this.field4114.field5699;
            int var8 = -(this.field4114.field5760 * arg2 >> 8) + arg3 >> this.field4114.field5699;
            this.field4149.method1037(var8, arg0, var7, -23716);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public final void method844(int arg0, int arg1) {
        ++field4123;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILbe;)V")
    private final void method1781(int arg0, int arg1, int arg2, class34 arg3) {
        ++field4115;
        int[] var5 = this.field4113[arg0][arg2];
        int[] var6 = this.field4111[arg0][arg2];
        int var7 = var5.length;
        if (~var7 < ~class456.field6284.length) {
            class456.field6284 = new int[var7];
            class639.field9195 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class456.field6284[var8] = var5[var8] >> this.field4114.field5699;
            class639.field9195[var8] = var6[var8] >> this.field4114.field5699;
        }
        if (arg1 != -1592558777) {
            this.method853(-37, -79, (class483) null);
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class456.field6284[var9];
            int var11 = class639.field9195[var9++];
            int var12 = class456.field6284[var9];
            int var13 = class639.field9195[var9++];
            int var14 = class456.field6284[var9];
            int var15 = class639.field9195[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((var13 - var11) * (-var12 + var14)) > 0) {
                arg3.method195(var11, var12, var15, var14, var13, 410484688, var10);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "aa", descriptor = "(II)I")
    public final int method847(int arg0, int arg1) {
        ++field4128;
        int var3 = arg0 >> super.field2111;
        int var4 = arg1 >> super.field2111;
        if (~var3 <= -1 && ~var4 <= -1 && super.field2116 + -1 >= var3 && ~var4 >= ~(super.field2114 + -1)) {
            int var5 = super.field2115 + -1 & arg0;
            int var6 = arg1 & super.field2115 - 1;
            int var7 = (-var5 + super.field2115) * this.field4136[var3][var4] + this.field4136[var3 + 1][var4] * var5 >> super.field2111;
            int var8 = (-var5 + super.field2115) * this.field4136[var3][var4 + 1] + this.field4136[var3 - -1][var4 + 1] * var5 >> super.field2111;
            return (super.field2115 - var6) * var7 - -(var6 * var8) >> super.field2111;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method845(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4135;
        if (this.field4149 != null && arg0 != null) {
            int var7 = -(this.field4114.field5727 * arg2 >> 8) + arg1 >> this.field4114.field5699;
            int var8 = arg3 - (this.field4114.field5760 * arg2 >> 8) >> this.field4114.field5699;
            this.field4149.method1036(var8, arg0, -46, var7);
        }
    }

    @OriginalMember(owner = "client!ml", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method849(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4127;
        if (arg3 != null && this.field4112 == null) {
            this.field4112 = new int[super.field2116][super.field2114][];
        }
        if (arg5 != null && this.field4145 == null) {
            this.field4145 = new int[super.field2116][super.field2114][];
        }
        this.field4113[arg0][arg1] = arg2;
        this.field4111[arg0][arg1] = arg4;
        this.field4121[arg0][arg1] = arg6;
        this.field4137[arg0][arg1] = arg7;
        if (this.field4145 != null) {
            this.field4145[arg0][arg1] = arg5;
        }
        if (this.field4112 != null) {
            this.field4112[arg0][arg1] = arg3;
        }
        class143[] var15 = this.field4140[arg0][arg1] = new class143[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class544 var19;
            for (var19 = this.field4160.method2645(var17, (byte) -115); var19 != null; var19 = this.field4160.method2646((byte) -97)) {
                class143 var20 = (class143) var19;
                if (~arg8[var16] == ~var20.field1729 && (float) arg9[var16] == var20.field1726 && var20.field1713 == arg10 && var20.field1719 == arg11 && ~var20.field1724 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class143(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field4160.method2640(1, var17, var15[var16]);
            } else {
                var15[var16] = (class143) var19;
            }
        }
        if (arg13) {
            this.field4133[arg0][arg1] = (byte) class42.method223(this.field4133[arg0][arg1], 1);
        }
        if (~this.field4158 > ~arg6.length) {
            this.field4158 = arg6.length;
        }
        this.field4159 += arg6.length;
    }

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "(III)V")
    public final void method841(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field4151[arg0][arg1] & 255)) {
            this.field4151[arg0][arg1] = (byte) arg2;
        }
        ++field4130;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method846(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4139;
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
        this.method849(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "(IILk;)Lk;")
    public final class483 method853(int arg0, int arg1, class483 arg2) {
        ++field4117;
        if ((1 & this.field4133[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field2115 >> this.field4114.field5699;
            class34 var5 = (class34) arg2;
            class34 var6;
            if (var5 != null && var5.method192(var4, var4, (byte) -98)) {
                var6 = var5;
                var5.method196(-3071);
            } else {
                var6 = new class34(this.field4114, var4, var4);
            }
            var6.method194(0, var4, 0, var4, (byte) 25);
            this.method1781(arg0, -1592558777, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Los;IILpq;)V")
    public static final void method1782(class374 arg0, int arg1, int arg2, class165 arg3) {
        ++field4144;
        if (arg2 <= -100) {
            class578 var4 = new class578();
            var4.field8428 = arg0.method2129(-82);
            var4.field8433 = arg0.method2123(false);
            var4.field8429 = new class506[var4.field8428];
            var4.field8432 = new int[var4.field8428];
            var4.field8438 = new int[var4.field8428];
            var4.field8431 = new class506[var4.field8428];
            var4.field8439 = new int[var4.field8428];
            var4.field8437 = new byte[var4.field8428][][];
            for (int var5 = 0; ~var4.field8428 < ~var5; ++var5) {
                try {
                    int var6 = arg0.method2129(-123);
                    if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                        if (var6 == 3 || ~var6 == -5) {
                            String var7 = arg0.method2133(false);
                            String var8 = arg0.method2133(false);
                            int var9 = arg0.method2129(-110);
                            String[] var10 = new String[var9];
                            for (int var11 = 0; var9 > var11; ++var11) {
                                var10[var11] = arg0.method2133(false);
                            }
                            byte[][] var12 = new byte[var9][];
                            if (var6 == 3) {
                                for (int var13 = 0; var9 > var13; ++var13) {
                                    int var14 = arg0.method2123(false);
                                    var12[var13] = new byte[var14];
                                    arg0.method2147(var12[var13], (byte) 127, 0, var14);
                                }
                            }
                            var4.field8439[var5] = var6;
                            Class[] var15 = new Class[var9];
                            for (int var16 = 0; var9 > var16; ++var16) {
                                var15[var16] = class19.method132(0, var10[var16]);
                            }
                            var4.field8431[var5] = arg3.method902(var15, (byte) -71, var8, class19.method132(0, var7));
                            var4.field8437[var5] = var12;
                        }
                    } else {
                        String var17 = arg0.method2133(false);
                        String var18 = arg0.method2133(false);
                        int var19 = 0;
                        if (var6 == 1) {
                            var19 = arg0.method2123(false);
                        }
                        var4.field8439[var5] = var6;
                        var4.field8438[var5] = var19;
                        var4.field8429[var5] = arg3.method914(var18, class19.method132(0, var17), (byte) -110);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field8432[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field8432[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field8432[var5] = -3;
                } catch (Exception var23) {
                    var4.field8432[var5] = -4;
                } catch (Throwable var24) {
                    var4.field8432[var5] = -5;
                }
            }
            class486.field6798.method1040(var4, -121);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1783(int arg0, byte arg1, int arg2) {
        if (arg1 != 11) {
            method1780(-56);
        }
        ++field4134;
        return (384 & arg0) != 0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lbda;IIII[[I[[II)V")
    public class325(class428 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4114 = arg0;
        this.field4136 = arg5;
        this.field4148 = super.field2111 + -2;
        this.field4124 = new short[arg3 * arg4][];
        this.field4113 = new int[arg3][arg4][];
        this.field4154 = new float[super.field2116 + 1][super.field2114 + 1];
        this.field4132 = 1 << this.field4148;
        this.field4152 = new float[super.field2116 + 1][super.field2114 + 1];
        this.field4126 = arg2;
        this.field4140 = new class143[arg3][arg4][];
        this.field4112 = new int[arg3][arg4][];
        this.field4153 = new float[super.field2116 - -1][super.field2114 + 1];
        this.field4111 = new int[arg3][arg4][];
        this.field4133 = new byte[arg3][arg4];
        this.field4121 = new int[arg3][arg4][];
        this.field4151 = new byte[arg3 + 1][arg4 + 1];
        this.field4137 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field2114; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field2116; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field4153[var10][var9] = (float) var11 * var13;
                this.field4152[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field4154[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4160 = new class451(128);
        if ((this.field4126 & 16) != 0) {
            this.field4149 = new class192(this.field4114, this);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZII[[ZIII)V")
    private final void method1784(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (this.field4161 != null) {
            int var8 = arg6 + arg6 - -1;
            int var9 = var8 * var8;
            if (~class433.field5857.length > ~var9) {
                class433.field5857 = new int[var9];
            }
            int var10 = arg2 - arg6;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg6 + arg1;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg2 - -arg6;
            if (~(super.field2116 - 1) > ~var14) {
                var14 = super.field2116 + -1;
            }
            int var15 = arg1 + arg6;
            if (var15 > super.field2114 + -1) {
                var15 = super.field2114 + -1;
            }
            class414.field5384 = 0;
            for (int var16 = var10; ~var16 >= ~var14; ++var16) {
                boolean[] var23 = arg3[-var11 + var16];
                for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                    if (var23[-var13 + var24]) {
                        class433.field5857[class414.field5384++] = super.field2116 * var24 - -var16;
                    }
                }
            }
            if (arg5 != -1) {
                this.field4114.method2474((byte) 116, (float) arg5);
                this.field4114.method2436(-76);
            } else {
                this.field4114.method2411(-121);
            }
            this.field4114.method2433(22880);
            this.field4114.method2452((7 & this.field4126) != 0, (byte) -94);
            this.field4114.method2439(-1, false, false, (byte) 118);
            this.field4114.method1792(this.field4150, 0, (byte) 89);
            for (int var17 = 0; ~this.field4161.length < ~var17; ++var17) {
                this.field4161[var17].method791(true, class414.field5384, class433.field5857);
            }
            class335 var18 = this.field4114.method2471((byte) 125);
            var18.method661(0, -1, 0);
            this.field4114.method2457((byte) -73);
            if (!this.field4129.method1043(true)) {
                int var19 = this.field4114.field5751;
                int var20 = this.field4114.field5697;
                this.field4114.method1120(0, var20, this.field4114.field5796);
                this.field4114.method2452(false, (byte) -94);
                this.field4114.method2478((byte) -102, false);
                this.field4114.method2405(128, -18001);
                this.field4114.method2439(-2, false, false, (byte) 125);
                this.field4114.method2459(78, this.field4114.field5794);
                this.field4114.method2429(class2.field7, class564.field8287, arg4 ^ 50);
                this.field4114.method2435(0, 32, class264.field3445);
                this.field4114.method2465(class167.field2044, -14787, 0);
                for (class544 var21 = this.field4129.method1050((byte) 73); var21 != null; var21 = this.field4129.method1047(-7962)) {
                    class161 var22 = (class161) var21;
                    var22.method881(arg6, arg1, arg2, (byte) 126, arg3);
                }
                this.field4114.method2435(0, 124, class289.field3751);
                this.field4114.method2465(class289.field3751, -14787, 0);
                this.field4114.method2459(70, (class440) null);
                this.field4114.method1120(var19, var20, this.field4114.field5796);
            }
            if (this.field4149 != null) {
                this.field4114.method1792(this.field4150, 0, (byte) 89);
                this.field4114.method1837(this.field4156, 9);
                this.field4149.method1039((byte) 51, arg0, arg2, arg1, arg3, arg6);
            }
        }
        ++field4125;
        if (arg4 != 0) {
            this.field4156 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[[ZZ)V")
    public final void method854(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1784(arg4, arg1, arg0, arg3, 0, -1, arg2);
        ++field4122;
    }
}
