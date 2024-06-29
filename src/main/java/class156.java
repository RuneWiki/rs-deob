import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class156 extends class296 {

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "Ltm;")
    private class412 field2138 = new class412();

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    private int field2135 = this.field4297 + -2;

    @OriginalMember(owner = "client!ct", name = "W", descriptor = "Ldia;")
    public class246 field2156;

    @OriginalMember(owner = "client!ct", name = "eb", descriptor = "[[F")
    private float[][] field2164;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "[[[I")
    public int[][][] field2125;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!ct", name = "fb", descriptor = "[[F")
    private float[][] field2165;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "[[[Lpd;")
    private class271[][][] field2124;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "[[[I")
    public int[][][] field2131;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "[[[I")
    public int[][][] field2148;

    @OriginalMember(owner = "client!ct", name = "mb", descriptor = "[[B")
    private byte[][] field2172;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "[[B")
    private byte[][] field2136;

    @OriginalMember(owner = "client!ct", name = "ib", descriptor = "[[F")
    private float[][] field2168;

    @OriginalMember(owner = "client!ct", name = "R", descriptor = "[[[I")
    private int[][][] field2151;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "[[S")
    public short[][] field2121;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "[[[I")
    private int[][][] field2137;

    @OriginalMember(owner = "client!ct", name = "Y", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!ct", name = "jb", descriptor = "Lee;")
    private class706 field2169;

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "Lqga;")
    private class197 field2146;

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
    public static int field2147 = -1;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ct", name = "S", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!ct", name = "V", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ct", name = "X", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ct", name = "Z", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ct", name = "cb", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!ct", name = "lb", descriptor = "I")
    private int field2171;

    @OriginalMember(owner = "client!ct", name = "ab", descriptor = "Lfha;")
    private class401 field2160;

    @OriginalMember(owner = "client!ct", name = "bb", descriptor = "Lwe;")
    public class430 field2161;

    @OriginalMember(owner = "client!ct", name = "db", descriptor = "Lwe;")
    private class430 field2163;

    @OriginalMember(owner = "client!ct", name = "gb", descriptor = "Lwe;")
    public class430 field2166;

    @OriginalMember(owner = "client!ct", name = "hb", descriptor = "Lwe;")
    public class430 field2167;

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2149;

    @OriginalMember(owner = "client!ct", name = "kb", descriptor = "[Lpd;")
    private class271[] field2170;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "[[[I")
    private int[][][] field2141;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILqa;I)V")
    private final void method1136(int arg0, int arg1, class262 arg2, int arg3) {
        int var5 = -123 % ((-33 - arg0) / 47);
        ++field2157;
        int[] var6 = this.field2131[arg1][arg3];
        int[] var7 = this.field2125[arg1][arg3];
        int var8 = var6.length;
        if (~this.field2156.field3679.length > ~var8) {
            this.field2156.field3681 = new int[var8];
            this.field2156.field3679 = new int[var8];
        }
        int[] var9 = this.field2156.field3679;
        int[] var10 = this.field2156.field3681;
        for (int var11 = 0; var11 < var8; ++var11) {
            var9[var11] = var6[var11] >> this.field2156.field3529;
            var10[var11] = var7[var11] >> this.field2156.field3529;
        }
        int var12 = 0;
        while (~var8 < ~var12) {
            int var13 = var9[var12];
            int var14 = var10[var12++];
            int var15 = var9[var12];
            int var16 = var10[var12++];
            int var17 = var9[var12];
            int var18 = var10[var12++];
            if ((var13 - var15) * (var16 - var18) + -((var17 - var15) * (-var14 + var16)) > 0) {
                arg2.method1730(false, var16, var15, var17, var18, var13, var14);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1137(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field2132;
        this.method1143(arg3, arg6, arg4, arg1, -93, arg2, arg0, arg5);
    }

    @OriginalMember(owner = "client!ct", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1138(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2133;
        if (this.field2146 != null && arg0 != null) {
            int var7 = -(this.field2156.field3568 * arg2 >> 8) + arg1 >> this.field2156.field3529;
            int var8 = -(this.field2156.field3612 * arg2 >> 8) + arg3 >> this.field2156.field3529;
            this.field2146.method1355(84, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ct", name = "YA", descriptor = "()V")
    public final void method1139() {
        if (~this.field2171 >= -1) {
            this.field2146 = null;
        } else {
            byte[][] var1 = new byte[super.field4301 + 1][super.field4300 + 1];
            for (int var2 = 1; ~super.field4301 < ~var2; ++var2) {
                for (int var103 = 1; ~super.field4300 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2172[var2][var103 + 1] >> 3) + (this.field2172[var2 + 1][var103] >> 3) + (this.field2172[var2 + -1][var103] >> 2) + (this.field2172[var2][var103 + -1] >> 2) + (this.field2172[var2][var103] >> 1));
                }
            }
            this.field2170 = new class271[this.field2169.method3963((byte) 119)];
            this.field2169.method3952(0, this.field2170);
            for (int var3 = 0; var3 < this.field2170.length; ++var3) {
                this.field2170[var3].method1769(this.field2171, -17605);
            }
            int var4 = 24;
            if (this.field2141 != null) {
                var4 += 4;
            }
            if ((7 & this.field2158) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field2156.field3533.method3913(this.field2171 * var4, false);
            Stream var6 = new Stream(var5);
            class271[] var7 = new class271[this.field2171];
            int var8 = class37.method261(this.field2171 / 4, false);
            if (var8 < 1) {
                var8 = 1;
            }
            class706 var9 = new class706(var8);
            class271[] var10 = new class271[this.field2162];
            for (int var11 = 0; ~var11 > ~super.field4301; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field4300; ++var30) {
                    if (this.field2148[var11][var30] != null) {
                        class271[] var31 = this.field2124[var11][var30];
                        int[] var32 = this.field2131[var11][var30];
                        int[] var33 = this.field2125[var11][var30];
                        int[] var34 = this.field2137[var11][var30];
                        int[] var35 = this.field2148[var11][var30];
                        int[] var36 = this.field2151 != null ? this.field2151[var11][var30] : null;
                        int[] var37 = this.field2141 == null ? null : this.field2141[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field2165[var11][var30];
                        float var39 = this.field2164[var11][var30];
                        float var40 = this.field2168[var11][var30];
                        float var41 = this.field2165[var11][var30 + 1];
                        float var42 = this.field2164[var11][var30 + 1];
                        float var43 = this.field2168[var11][var30 + 1];
                        float var44 = this.field2165[var11 - -1][var30 + 1];
                        float var45 = this.field2164[var11 - -1][var30 + 1];
                        float var46 = this.field2168[var11 + 1][var30 + 1];
                        float var47 = this.field2165[var11 + 1][var30];
                        float var48 = this.field2164[var11 + 1][var30];
                        float var49 = this.field2168[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label337: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class271 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label337;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field2121[super.field4301 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field4297) + var32[var57];
                            int var59 = (var30 << super.field4297) + var33[var57];
                            int var60 = var58 >> this.field2135;
                            int var61 = var59 >> this.field2135;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var39;
                                var73 = var38;
                                var74 = var69 - var50;
                                var75 = var40;
                            } else if (var67 == 0 && super.field4295 == var68) {
                                var72 = var42;
                                var74 = var69 - var51;
                                var73 = var41;
                                var75 = var43;
                            } else if (~super.field4295 == ~var67 && super.field4295 == var68) {
                                var73 = var44;
                                var72 = var45;
                                var74 = var69 - var52;
                                var75 = var46;
                            } else if (super.field4295 == var67 && ~var68 == -1) {
                                var73 = var47;
                                var72 = var48;
                                var74 = var69 - var53;
                                var75 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field4295;
                                float var77 = (float) var68 / (float) super.field4295;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var73 = (-var78 + var81) * var77 + var78;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var72 = (var82 - var79) * var77 + var79;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = var50 - -((-var50 + var53) * var67 >> super.field4297);
                                int var85 = var51 - -((var52 - var51) * var67 >> super.field4297);
                                var74 = var69 - (var84 - -((var85 - var84) * var68 >> super.field4297));
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var74 >> 7;
                                if (~var86 <= -3) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class145.field2069[var86 | var62 & 65408];
                                if ((7 & this.field2158) == 0) {
                                    float var87 = this.field2156.field3611[2] * var75 + this.field2156.field3611[0] * var73 + this.field2156.field3611[1] * var72;
                                    var71 = var87 * (var87 > 0.0F ? this.field2156.field3651 : this.field2156.field3586) + this.field2156.field3657;
                                }
                            }
                            class101 var88 = null;
                            if (~(var58 & this.field2139 + -1) == -1 && ~(this.field2139 - 1 & var59) == -1) {
                                var88 = var9.method3953(var65, 14);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class172) var88).field2301;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var31[var57].field1409 > ~var7[var89].field1409) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (~var62 != ~var63) {
                                    int var90 = (127 & var63) * var74 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var91 = class145.field2069[var63 & 65408 | var90];
                                    if (~(7 & this.field2158) == -1) {
                                        float var92 = this.field2156.field3611[2] * var75 + this.field2156.field3611[0] * var73 + this.field2156.field3611[1] * var72;
                                        float var93 = this.field2156.field3657 + (!(var71 > 0.0F) ? this.field2156.field3586 : this.field2156.field3651) * var71;
                                        int var94 = var91 >> 16 & 255;
                                        int var95 = var91 >> 8 & 255;
                                        int var96 = 255 & var91;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var91 = var97 << 16 | var98 << 8 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (!this.field2156.field3588) {
                                    var6.method3929((float) var58);
                                    var6.method3929((float) (this.method1882(var59, 0, var58) + var64));
                                    var6.method3929((float) var59);
                                    var6.method3917((byte) (var91 >> 16));
                                    var6.method3917((byte) (var91 >> 8));
                                    var6.method3917((byte) var91);
                                    var6.method3917(-1);
                                    var6.method3929((float) var58);
                                    var6.method3929((float) var59);
                                    if (this.field2141 != null) {
                                        var6.method3929((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(this.field2158 & 7) != -1) {
                                        var6.method3929(var73);
                                        var6.method3929(var72);
                                        var6.method3929(var75);
                                    }
                                } else {
                                    var6.method3930((float) var58);
                                    var6.method3930((float) (var64 + this.method1882(var59, 0, var58)));
                                    var6.method3930((float) var59);
                                    var6.method3917((byte) (var91 >> 16));
                                    var6.method3917((byte) (var91 >> 8));
                                    var6.method3917((byte) var91);
                                    var6.method3917(-1);
                                    var6.method3930((float) var58);
                                    var6.method3930((float) var59);
                                    if (this.field2141 != null) {
                                        var6.method3930((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field2158) != -1) {
                                        var6.method3930(var73);
                                        var6.method3930(var72);
                                        var6.method3930(var75);
                                    }
                                }
                                var89 = this.field2154++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method3962(var65, new class172(var56[var57]), -118);
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1768(var74, var89, 0, var70, var71);
                            }
                            ++this.field2129;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field2154; ++var12) {
                class271 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1766(var12, (byte) -91);
                }
            }
            for (int var13 = 0; var13 < super.field4301; ++var13) {
                for (int var18 = 0; super.field4300 > var18; ++var18) {
                    short[] var19 = this.field2121[super.field4301 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class271 var25 = var7[var22];
                            class271 var26 = var7[var23];
                            class271 var27 = var7[var24];
                            class271 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1765(var20, var13, var18, 1340270824);
                            }
                            if (var26 != null) {
                                var26.method1765(var20, var13, var18, 1340270824);
                                if (var28 == null || var28.field1409 > var26.field1409) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1765(var20, var13, var18, 1340270824);
                                if (var28 == null || var27.field1409 < var28.field1409) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1766(var22, (byte) -99);
                                }
                                if (var26 != null) {
                                    var28.method1766(var23, (byte) -125);
                                }
                                if (var27 != null) {
                                    var28.method1766(var24, (byte) -64);
                                }
                                var28.method1765(var20, var13, var18, 1340270824);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3922();
            this.field2160 = this.field2156.method1656(var5, false, var6.method3924(), 7, var4);
            this.field2166 = new class430(this.field2160, 5126, 3, 0);
            this.field2163 = new class430(this.field2160, 5121, 4, 12);
            byte var14;
            if (this.field2141 == null) {
                this.field2167 = new class430(this.field2160, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field2167 = new class430(this.field2160, 5126, 3, 16);
                var14 = 28;
            }
            if ((7 & this.field2158) != 0) {
                this.field2161 = new class430(this.field2160, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2170.length];
            for (int var16 = 0; var16 < this.field2170.length; ++var16) {
                class271 var17 = this.field2170[var16];
                var15[var16] = var17.field1409;
                var17.method1770(4, this.field2154);
            }
            class237.method1533(false, this.field2170, var15);
            if (this.field2146 != null) {
                this.field2146.method1356(128);
            }
        }
        ++field2155;
        this.field2141 = null;
        this.field2137 = null;
        this.field2124 = null;
        this.field2172 = null;
        this.field2165 = this.field2164 = this.field2168 = null;
        this.field2148 = null;
        this.field2169 = null;
        this.field2151 = null;
        this.field2131 = this.field2125 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
    public final void method1140(int arg0, int arg1) {
        ++field2122;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Luca;[I)V")
    public final void method1141(class540 arg0, int[] arg1) {
        this.field2138.method2545(-126, new class332(this.field2156, this, arg0, arg1));
        ++field2128;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1142(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2159;
        if (this.field2146 != null && arg0 != null) {
            int var7 = -(this.field2156.field3568 * arg2 >> 8) + arg1 >> this.field2156.field3529;
            int var8 = -(this.field2156.field3612 * arg2 >> 8) + arg3 >> this.field2156.field3529;
            return this.field2146.method1351(arg0, 1, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([[ZIZIIIII)V")
    private final void method1143(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -48) {
            this.field2137 = null;
        }
        if (this.field2170 != null) {
            int var9 = arg5 + arg5 + 1;
            int var10 = var9 * var9;
            if (var10 > this.field2156.field3680.length) {
                this.field2156.field3680 = new int[var10];
            }
            if (~this.field2156.field3639.field5518.length > ~(this.field2129 * 2)) {
                this.field2156.field3639 = new class406(this.field2129 * 2);
            }
            int var11 = -arg5 + arg6;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg5 + arg3;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg5 + arg6;
            if (var15 > super.field4301 + -1) {
                var15 = super.field4301 + -1;
            }
            int var16 = arg3 + arg5;
            if (super.field4300 + -1 < var16) {
                var16 = super.field4300 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field2156.field3680;
            for (int var19 = var11; var15 >= var19; ++var19) {
                boolean[] var25 = arg0[-var12 + var19];
                for (int var26 = var13; ~var26 >= ~var16; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4301 * var26 - -var19;
                    }
                }
            }
            if (~arg7 == 0) {
                this.field2156.method1588((byte) 121);
            } else {
                this.field2156.method1613(20980, (float) arg7);
                this.field2156.method1650((byte) -1);
            }
            this.field2156.method1617(~(7 & this.field2158) != -1, (byte) -83);
            for (int var20 = 0; this.field2170.length > var20; ++var20) {
                this.field2170[var20].method1764(var18, var17, (byte) -91);
            }
            if (!this.field2138.method2540(false)) {
                int var21 = this.field2156.field3593;
                int var22 = this.field2156.field3578;
                this.field2156.method550(0, var22, this.field2156.field3614);
                this.field2156.method1617(false, (byte) 94);
                this.field2156.method1583((byte) -68, false);
                this.field2156.method1648(0, 128);
                this.field2156.method1640(-2, -127);
                this.field2156.method1653((byte) 89, this.field2156.field3637);
                this.field2156.method1622(7681, 8448, (byte) 124);
                this.field2156.method1641(34166, 770, 0, 34192);
                this.field2156.method1657((byte) 90, 770, 0, 34167);
                for (class101 var23 = this.field2138.method2551((byte) -108); var23 != null; var23 = this.field2138.method2542(-99)) {
                    class332 var24 = (class332) var23;
                    var24.method2083(121, arg5, arg0, arg6, arg3);
                }
                this.field2156.method1641(5890, 768, 0, 34192);
                this.field2156.method1657((byte) 90, 770, 0, 5890);
                this.field2156.method1653((byte) 77, (class7) null);
                this.field2156.method550(var21, var22, this.field2156.field3614);
            }
            if (this.field2146 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field2156.method1600((class430) null, (class430) null, this.field2166, (byte) 110, this.field2167);
                this.field2146.method1350(arg6, arg3, arg0, arg5, true, arg2);
                OpenGL.glPopMatrix();
            }
        }
        ++field2145;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIIII)J")
    public static final long method1144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2143;
        if (arg5 != 0) {
            return 44L;
        } else {
            class295.field4283.clear();
            class295.field4283.set(arg4, arg0, arg3, arg2, arg6, arg1);
            return class295.field4283.getTime().getTime();
        }
    }

    @OriginalMember(owner = "client!ct", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1145(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2127;
        if (arg3 != null && this.field2151 == null) {
            this.field2151 = new int[super.field4301][super.field4300][];
        }
        if (arg5 != null && this.field2141 == null) {
            this.field2141 = new int[super.field4301][super.field4300][];
        }
        class161 var15 = this.field2156.field912;
        this.field2131[arg0][arg1] = arg2;
        this.field2125[arg0][arg1] = arg4;
        this.field2148[arg0][arg1] = arg6;
        this.field2137[arg0][arg1] = arg7;
        if (this.field2141 != null) {
            this.field2141[arg0][arg1] = arg5;
        }
        if (this.field2151 != null) {
            this.field2151[arg0][arg1] = arg3;
        }
        class271[] var16 = this.field2124[arg0][arg1] = new class271[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field2158) != 0 && ~var18 != 0 && var15.method1174(var18, true).field9142) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) var18;
            class101 var22;
            for (var22 = this.field2169.method3953(var20, 14); var22 != null; var22 = this.field2169.method3958(-15797)) {
                class271 var23 = (class271) var22;
                if (~var23.field3998 == ~var18 && (float) var19 == var23.field4007 && var23.field3996 == arg10 && ~var23.field3993 == ~arg11 && var23.field3997 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class271(this, var18, var19, arg10, arg11, arg12);
                this.field2169.method3962(var20, var16[var17], -122);
            } else {
                var16[var17] = (class271) var22;
            }
        }
        if (arg13) {
            this.field2136[arg0][arg1] = (byte) class213.method1409(this.field2136[arg0][arg1], 1);
        }
        if (~this.field2162 > ~arg6.length) {
            this.field2162 = arg6.length;
        }
        this.field2171 += arg6.length;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1146(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field2152;
        this.method1143(arg3, arg5, arg4, arg1, -49, arg2, arg0, -1);
    }

    @OriginalMember(owner = "client!ct", name = "fa", descriptor = "(IILr;)Lr;")
    public final class195 method1147(int arg0, int arg1, class195 arg2) {
        ++field2126;
        if (~(1 & this.field2136[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4295 >> this.field2156.field3529;
            class262 var5 = (class262) arg2;
            class262 var6;
            if (var5 != null && var5.method1729(-111, var4, var4)) {
                var6 = var5;
                var5.method1732(0);
            } else {
                var6 = new class262(this.field2156, var4, var4);
            }
            var6.method1733((byte) 57, 0, var4, var4, 0);
            this.method1136(-112, arg0, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
    public static void method1148(int arg0) {
        field2149 = null;
        if (arg0 != 255) {
            field2147 = 8;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Ldia;IIII[[I[[II)V")
    public class156(class246 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2156 = arg0;
        this.field2164 = new float[super.field4301 + 1][super.field4300 + 1];
        this.field2125 = new int[arg3][arg4][];
        this.field2139 = 1 << this.field2135;
        this.field2165 = new float[super.field4301 + 1][super.field4300 + 1];
        this.field2124 = new class271[arg3][arg4][];
        this.field2131 = new int[arg3][arg4][];
        this.field2148 = new int[arg3][arg4][];
        this.field2172 = new byte[arg3 + 1][arg4 + 1];
        this.field2136 = new byte[arg3][arg4];
        this.field2168 = new float[super.field4301 + 1][super.field4300 + 1];
        this.field2151 = new int[arg3][arg4][];
        this.field2121 = new short[arg3 * arg4][];
        this.field2137 = new int[arg3][arg4][];
        this.field2158 = arg2;
        for (int var9 = 1; var9 < super.field4300; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field4301; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var12 * var12 - -(arg7 * 4 * arg7))));
                this.field2165[var10][var9] = (float) var11 * var13;
                this.field2164[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2168[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2169 = new class706(128);
        if ((this.field2158 & 16) != 0) {
            this.field2146 = new class197(this.field2156, this);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1149(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2144;
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
        this.method1145(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ct", name = "ka", descriptor = "(III)V")
    public final void method1150(int arg0, int arg1, int arg2) {
        ++field2153;
        if ((this.field2172[arg0][arg1] & 255) < arg2) {
            this.field2172[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)Ldr;")
    public static final class751 method1151(int arg0) {
        ++field2140;
        return arg0 > -62 ? null : class207.field2705;
    }

    @OriginalMember(owner = "client!ct", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1152(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2142;
        if (this.field2146 != null && arg0 != null) {
            int var7 = -(this.field2156.field3568 * arg2 >> 8) + arg1 >> this.field2156.field3529;
            int var8 = -(this.field2156.field3612 * arg2 >> 8) + arg3 >> this.field2156.field3529;
            this.field2146.method1354(var8, -27552, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2134;
        if (this.field2171 > 0) {
            this.field2156.method1629((byte) -35);
            this.field2156.method1642(3723, false);
            this.field2156.method1617(false, (byte) 95);
            this.field2156.method1587(false, false);
            this.field2156.method1583((byte) -68, false);
            this.field2156.method1648(0, 0);
            this.field2156.method1640(-2, -109);
            this.field2156.method1653((byte) 81, (class7) null);
            class422.field6040[9] = 0.0F;
            class422.field6040[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2156.field3500;
            class422.field6040[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field2156.field3442;
            class422.field6040[2] = 0.0F;
            class422.field6040[4] = 0.0F;
            class422.field6040[0] = (float) arg2 / ((float) super.field4295 * 128.0F * (float) this.field2156.field3442);
            class422.field6040[15] = 1.0F;
            class422.field6040[11] = 0.0F;
            class422.field6040[7] = 0.0F;
            class422.field6040[5] = (float) arg2 / ((float) super.field4295 * 128.0F * (float) this.field2156.field3500);
            class422.field6040[14] = 0.0F;
            class422.field6040[6] = 0.0F;
            class422.field6040[8] = 0.0F;
            class422.field6040[3] = 0.0F;
            class422.field6040[10] = 0.0F;
            class422.field6040[1] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class422.field6040, 0);
            class422.field6040[9] = 1.0F;
            class422.field6040[11] = 0.0F;
            class422.field6040[14] = 0.0F;
            class422.field6040[1] = 0.0F;
            class422.field6040[6] = 1.0F;
            class422.field6040[12] = 0.0F;
            class422.field6040[5] = 0.0F;
            class422.field6040[10] = 0.0F;
            class422.field6040[4] = 0.0F;
            class422.field6040[8] = 0.0F;
            class422.field6040[2] = 0.0F;
            class422.field6040[15] = 1.0F;
            class422.field6040[7] = 0.0F;
            class422.field6040[3] = 0.0F;
            class422.field6040[0] = 1.0F;
            class422.field6040[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class422.field6040, 0);
            if (~(7 & this.field2158) == -1) {
                this.field2156.method1617(false, (byte) 78);
            } else {
                this.field2156.method1617(true, (byte) -118);
                this.field2156.method1602((byte) 126);
            }
            this.field2156.method1600(this.field2161, this.field2163, this.field2166, (byte) 91, this.field2167);
            if (this.field2129 * 2 > this.field2156.field3639.field5518.length) {
                this.field2156.field3639 = new class406(this.field2129 * 2);
            } else {
                this.field2156.field3639.field5459 = 0;
            }
            int var9 = 0;
            class406 var10 = this.field2156.field3639;
            if (this.field2156.field3588) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field4301 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field2121[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method2415(false, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field4301 * var16 - -arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field2121[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method2368(124, 65535 & var20[var21]);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class757 var17 = new class757(this.field2156, 5123, var10.field5518, var10.field5459);
                this.field2156.method1586(var17, var9, 4, true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
    public static final int method1154(byte arg0) {
        ++field2130;
        if (arg0 >= -115) {
            field2147 = 26;
        }
        byte var1;
        if (~class396.field5817 > -97) {
            class261.method1727(true, (byte) -122);
            var1 = 1;
        } else {
            int var2 = class601.method3347(true);
            if (~var2 < -101) {
                if (var2 <= 500) {
                    var1 = 3;
                    class57.method409(0);
                } else if (var2 <= 1000) {
                    class310.method1948(1);
                    var1 = 2;
                } else {
                    class261.method1727(true, (byte) -108);
                    var1 = 1;
                }
            } else {
                var1 = 4;
                class117.method960(-18861);
            }
        }
        if (~class712.field9959.field1270.method4293(104) != -1) {
            class712.field9959.method735(0, class712.field9959.field1299, 100);
            class793.method4365((byte) -41, false, 0);
        }
        class617.method3389(false);
        return var1;
    }
}
