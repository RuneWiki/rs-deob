import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class303 extends class270 {

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Lwo;")
    private class445 field4009 = new class445();

    @OriginalMember(owner = "client!al", name = "R", descriptor = "Lag;")
    public class469 field4031;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    private int field4006;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "[[F")
    private float[][] field4040;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "[[[I")
    private int[][][] field4016;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "[[B")
    private byte[][] field4037;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    private int field4005;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[[S")
    public short[][] field4004;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "[[[I")
    private int[][][] field4010;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "[[[I")
    public int[][][] field4018;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "[[[Lar;")
    private class4[][][] field4013;

    @OriginalMember(owner = "client!al", name = "eb", descriptor = "[[F")
    private float[][] field4044;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "[[[I")
    public int[][][] field4003;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "[[[I")
    public int[][][] field4028;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "[[F")
    private float[][] field4033;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[[B")
    private byte[][] field4000;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "Lwh;")
    private class546 field4036;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "Lsn;")
    private class281 field4032;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Z")
    public static boolean field4023 = false;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field4026 = 0;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!al", name = "db", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!al", name = "fb", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "Lfe;")
    public class199 field4035;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "Lfe;")
    public class199 field4038;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "Lfe;")
    private class199 field4039;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "Lfe;")
    public class199 field4042;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "Lcw;")
    private class511 field4041;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "[Lar;")
    private class4[] field4034;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "[[[I")
    private int[][][] field4027;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lbd;IIZ)V", line = 3)
    private final void method1780(class187 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method1781(109, false, 49, (boolean[][]) null, -35, 35, 93);
        }
        ++field3999;
        int[] var5 = this.field4018[arg2][arg1];
        int[] var6 = this.field4028[arg2][arg1];
        int var7 = var5.length;
        if (~this.field4031.field6543.length > ~var7) {
            this.field4031.field6543 = new int[var7];
            this.field4031.field6545 = new int[var7];
        }
        int[] var8 = this.field4031.field6543;
        int[] var9 = this.field4031.field6545;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = var5[var10] >> this.field4031.field6396;
            var9[var10] = var6[var10] >> this.field4031.field6396;
        }
        int var11 = 0;
        while (var11 < var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16)) < -1) {
                arg0.method1239(var15, var13, var14, var12, var17, (byte) -116, var16);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "BA", descriptor = "()V", line = 66)
    public final void method1349() {
        ++field4029;
        if (this.field4043 <= 0) {
            this.field4032 = null;
        } else {
            byte[][] var1 = new byte[super.field3524 + 1][super.field3525 - -1];
            for (int var2 = 1; ~var2 > ~super.field3524; ++var2) {
                for (int var103 = 1; ~super.field3525 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field4037[var2][var103 - -1] >> 3) + (this.field4037[var2][var103] >> 1) + (this.field4037[var2 - 1][var103] >> 2) + (this.field4037[var2][var103 + -1] >> 2) + (this.field4037[var2 - -1][var103] >> 3));
                }
            }
            this.field4034 = new class4[this.field4036.method3060(0)];
            this.field4036.method3052(13534, this.field4034);
            for (int var3 = 0; ~this.field4034.length < ~var3; ++var3) {
                this.field4034[var3].method26(127, this.field4043);
            }
            int var4 = 24;
            if (this.field4027 != null) {
                var4 += 4;
            }
            if ((7 & this.field4019) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field4031.field6398.method3428(this.field4043 * var4, false);
            Stream var6 = new Stream(var5);
            class4[] var7 = new class4[this.field4043];
            int var8 = class245.method1497(this.field4043 / 4, (byte) -124);
            if (~var8 > -2) {
                var8 = 1;
            }
            class546 var9 = new class546(var8);
            class4[] var10 = new class4[this.field4045];
            for (int var11 = 0; var11 < super.field3524; ++var11) {
                for (int var30 = 0; ~super.field3525 < ~var30; ++var30) {
                    if (this.field4003[var11][var30] != null) {
                        class4[] var31 = this.field4013[var11][var30];
                        int[] var32 = this.field4018[var11][var30];
                        int[] var33 = this.field4028[var11][var30];
                        int[] var34 = this.field4016[var11][var30];
                        int[] var35 = this.field4003[var11][var30];
                        int[] var36 = this.field4010 != null ? this.field4010[var11][var30] : null;
                        int[] var37 = this.field4027 != null ? this.field4027[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field4044[var11][var30];
                        float var39 = this.field4033[var11][var30];
                        float var40 = this.field4040[var11][var30];
                        float var41 = this.field4044[var11][var30 + 1];
                        float var42 = this.field4033[var11][var30 + 1];
                        float var43 = this.field4040[var11][var30 - -1];
                        float var44 = this.field4044[var11 - -1][var30 + 1];
                        float var45 = this.field4033[var11 - -1][var30 + 1];
                        float var46 = this.field4040[var11 + 1][var30 + 1];
                        float var47 = this.field4044[var11 + 1][var30];
                        float var48 = this.field4033[var11 + 1][var30];
                        float var49 = this.field4040[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label337: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class4 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label337;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field4004[super.field3524 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field3530) + var32[var57];
                            int var59 = (var30 << super.field3530) - -var33[var57];
                            int var60 = var58 >> this.field4006;
                            int var61 = var59 >> this.field4006;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var40;
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var39;
                            } else if (~var67 == -1 && super.field3527 == var68) {
                                var71 = var43;
                                var74 = var42;
                                var73 = var69 - var51;
                                var72 = var41;
                            } else if (super.field3527 == var67 && super.field3527 == var68) {
                                var73 = var69 - var52;
                                var71 = var46;
                                var74 = var45;
                                var72 = var44;
                            } else if (~super.field3527 == ~var67 && ~var68 == -1) {
                                var72 = var47;
                                var71 = var49;
                                var73 = var69 - var53;
                                var74 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field3527;
                                float var76 = (float) var68 / (float) super.field3527;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                float var82 = (var46 - var43) * var75 + var43;
                                var74 = (var81 - var78) * var76 + var78;
                                var72 = (-var77 + var80) * var76 + var77;
                                var71 = (var82 - var79) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field3530) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field3530) + var51;
                                var73 = var69 - (((-var83 + var84) * var68 >> super.field3530) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var73 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                var70 = class104.field1240[var86 | 65408 & var62];
                                if (~(this.field4019 & 7) == -1) {
                                    float var87 = this.field4031.field6448[2] * var71 + this.field4031.field6448[1] * var74 + this.field4031.field6448[0] * var72;
                                    var85 = this.field4031.field6497 + var87 * (!(var87 > 0.0F) ? this.field4031.field6504 : this.field4031.field6510);
                                }
                            }
                            class45 var88 = null;
                            if ((var58 & this.field4005 + -1) == 0 && (var59 & this.field4005 + -1) == 0) {
                                var88 = var9.method3057(1, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class401) var88).field5317;
                                var89 = 65535 & var56[var57];
                                if (var62 != -1 && ~var31[var57].field545 > ~var7[var89].field545) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (~var62 == ~var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (127 & var63) * var73 >> 7;
                                    if (~var91 <= -3) {
                                        if (var91 > 126) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class104.field1240[var91 | var63 & 65408];
                                    if ((7 & this.field4019) == 0) {
                                        float var92 = this.field4031.field6448[2] * var71 + this.field4031.field6448[1] * var74 + this.field4031.field6448[0] * var72;
                                        float var93 = var85 * (var85 > 0.0F ? this.field4031.field6510 : this.field4031.field6504) + this.field4031.field6497;
                                        int var94 = var90 >> 16 & 255;
                                        int var95 = var90 >> 8 & 255;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = var90 & 255;
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var96 >= 0) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var96 << 16 | var98 << 8 | var99;
                                    }
                                }
                                if (!this.field4031.field6466) {
                                    var6.method3438((float) var58);
                                    var6.method3438((float) (var64 + this.method1609(var58, var59, 127)));
                                    var6.method3438((float) var59);
                                    var6.method3437((byte) (var90 >> 16));
                                    var6.method3437((byte) (var90 >> 8));
                                    var6.method3437((byte) var90);
                                    var6.method3437(-1);
                                    var6.method3438((float) var58);
                                    var6.method3438((float) var59);
                                    if (this.field4027 != null) {
                                        var6.method3438((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field4019) != -1) {
                                        var6.method3438(var72);
                                        var6.method3438(var74);
                                        var6.method3438(var71);
                                    }
                                } else {
                                    var6.method3439((float) var58);
                                    var6.method3439((float) (this.method1609(var58, var59, -123) + var64));
                                    var6.method3439((float) var59);
                                    var6.method3437((byte) (var90 >> 16));
                                    var6.method3437((byte) (var90 >> 8));
                                    var6.method3437((byte) var90);
                                    var6.method3437(-1);
                                    var6.method3439((float) var58);
                                    var6.method3439((float) var59);
                                    if (this.field4027 != null) {
                                        var6.method3439((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field4019 & 7) != -1) {
                                        var6.method3439(var72);
                                        var6.method3439(var74);
                                        var6.method3439(var71);
                                    }
                                }
                                var89 = this.field4014++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method3061(124, var65, new class401(var56[var57]));
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method21(true, var85, var73, var70, var89);
                            }
                            ++this.field4020;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field4014; ++var12) {
                class4 var29 = var7[var12];
                if (var29 != null) {
                    var29.method23(-48, var12);
                }
            }
            for (int var13 = 0; super.field3524 > var13; ++var13) {
                for (int var18 = 0; ~super.field3525 < ~var18; ++var18) {
                    short[] var19 = this.field4004[super.field3524 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class4 var25 = var7[var22];
                            class4 var26 = var7[var23];
                            class4 var27 = var7[var24];
                            class4 var28 = null;
                            if (var25 != null) {
                                var25.method20((byte) 86, var18, var20, var13);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method20((byte) 124, var18, var20, var13);
                                if (var28 == null || ~var28.field545 < ~var26.field545) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method20((byte) 73, var18, var20, var13);
                                if (var28 == null || var28.field545 > var27.field545) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method23(-67, var22);
                                }
                                if (var26 != null) {
                                    var28.method23(-48, var23);
                                }
                                if (var27 != null) {
                                    var28.method23(-85, var24);
                                }
                                var28.method20((byte) 99, var18, var20, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3440();
            this.field4041 = this.field4031.method2670(false, var6.method3442(), var4, var5, -113);
            this.field4038 = new class199(this.field4041, 5126, 3, 0);
            this.field4039 = new class199(this.field4041, 5121, 4, 12);
            byte var14;
            if (this.field4027 != null) {
                var14 = 28;
                this.field4042 = new class199(this.field4041, 5126, 3, 16);
            } else {
                this.field4042 = new class199(this.field4041, 5126, 2, 16);
                var14 = 24;
            }
            if (~(this.field4019 & 7) != -1) {
                this.field4035 = new class199(this.field4041, 5126, 3, var14);
            }
            long[] var15 = new long[this.field4034.length];
            for (int var16 = 0; ~this.field4034.length < ~var16; ++var16) {
                class4 var17 = this.field4034[var16];
                var15[var16] = var17.field545;
                var17.method24(this.field4014, 0);
            }
            class585.method3241((byte) 39, this.field4034, var15);
            if (this.field4032 != null) {
                this.field4032.method1668(5123);
            }
        }
        this.field4044 = this.field4033 = this.field4040 = null;
        this.field4036 = null;
        this.field4016 = null;
        this.field4037 = null;
        this.field4003 = null;
        this.field4018 = this.field4028 = null;
        this.field4010 = null;
        this.field4013 = null;
        this.field4027 = null;
    }

    @OriginalMember(owner = "client!al", name = "v", descriptor = "(IILha;)Lha;", line = 643)
    public final class117 method1361(int arg0, int arg1, class117 arg2) {
        ++field4007;
        if (~(1 & this.field4000[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field3527 >> this.field4031.field6396;
            class187 var5 = (class187) arg2;
            class187 var6;
            if (var5 != null && var5.method1238(false, var4, var4)) {
                var6 = var5;
                var5.method1240((byte) -100);
            } else {
                var6 = new class187(this.field4031, var4, var4);
            }
            var6.method1237(0, (byte) -103, var4, 0, var4);
            this.method1780(var6, arg1, arg0, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI[[ZIII)V", line = 672)
    private final void method1781(int arg0, boolean arg1, int arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 17432) {
            field4023 = false;
        }
        ++field4017;
        if (this.field4034 != null) {
            int var8 = arg6 - -1 + arg6;
            int var9 = var8 * var8;
            if (~this.field4031.field6548.length > ~var9) {
                this.field4031.field6548 = new int[var9];
            }
            if (~this.field4031.field6523.field2199.length > ~(this.field4020 * 2)) {
                this.field4031.field6523 = new class210(this.field4020 * 2);
            }
            int var10 = -arg6 + arg2;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg6 + arg5;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg2 + arg6;
            if (~var14 < ~(super.field3524 - 1)) {
                var14 = super.field3524 + -1;
            }
            int var15 = arg5 - -arg6;
            if (~(super.field3525 + -1) > ~var15) {
                var15 = super.field3525 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field4031.field6548;
            for (int var18 = var10; ~var18 >= ~var14; ++var18) {
                boolean[] var24 = arg3[-var11 + var18];
                for (int var25 = var12; ~var15 <= ~var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field3524 * var25 + var18;
                    }
                }
            }
            if (~arg4 != 0) {
                this.field4031.method2628((float) arg4, 4);
                this.field4031.method2660(16);
            } else {
                this.field4031.method2665(102);
            }
            this.field4031.method2703((this.field4019 & 7) != 0, 46);
            for (int var19 = 0; var19 < this.field4034.length; ++var19) {
                this.field4034[var19].method27(var17, 61, var16);
            }
            if (!this.field4009.method2499((byte) -63)) {
                int var20 = this.field4031.field6436;
                int var21 = this.field4031.field6509;
                this.field4031.method1073(0, var21, this.field4031.field6437);
                this.field4031.method2703(false, 51);
                this.field4031.method2653(-82, false);
                this.field4031.method2644(128, (byte) 79);
                this.field4031.method2693(-2, arg0 ^ 32626);
                this.field4031.method2627(66, this.field4031.field6480);
                this.field4031.method2669(7681, -111, 8448);
                this.field4031.method2636(0, 770, 34166, -96);
                this.field4031.method2637(770, -513, 0, 34167);
                for (class45 var22 = this.field4009.method2506(68); var22 != null; var22 = this.field4009.method2505(-110)) {
                    class249 var23 = (class249) var22;
                    var23.method1508((byte) 62, arg2, arg6, arg3, arg5);
                }
                this.field4031.method2636(0, 768, 5890, -118);
                this.field4031.method2637(770, -513, 0, 5890);
                this.field4031.method2627(37, (class262) null);
                this.field4031.method1073(var20, var21, this.field4031.field6437);
            }
            if (this.field4032 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field4031.method2677(this.field4038, (class199) null, 17560, (class199) null, this.field4042);
                this.field4032.method1671(arg3, arg5, arg2, arg1, (byte) -91, arg6);
                OpenGL.glPopMatrix();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 812)
    public final void method1357(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4022;
        if (this.field4032 != null && arg0 != null) {
            int var7 = arg1 - (this.field4031.field6526 * arg2 >> 8) >> this.field4031.field6396;
            int var8 = -(this.field4031.field6513 * arg2 >> 8) + arg3 >> this.field4031.field6396;
            this.field4032.method1672(var8, var7, arg0, -20128);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 830)
    public final boolean method1355(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4021;
        if (this.field4032 != null && arg0 != null) {
            int var7 = -(this.field4031.field6526 * arg2 >> 8) + arg1 >> this.field4031.field6396;
            int var8 = -(this.field4031.field6513 * arg2 >> 8) + arg3 >> this.field4031.field6396;
            return this.field4032.method1675(11937, var8, arg0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "E", descriptor = "(Lha;IIIIZ)V", line = 851)
    public final void method1352(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4024;
        if (this.field4032 != null && arg0 != null) {
            int var7 = -(this.field4031.field6526 * arg2 >> 8) + arg1 >> this.field4031.field6396;
            int var8 = -(this.field4031.field6513 * arg2 >> 8) + arg3 >> this.field4031.field6396;
            this.field4032.method1669((byte) 68, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZ)V", line = 868)
    public final void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1781(17432, arg4, arg0, arg3, -1, arg1, arg2);
        ++field4025;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 880)
    public final void method1350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4001;
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
        for (int var28 = 0; var18 > var28; ++var28) {
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
        this.method1353(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqea;[I)V", line = 966)
    public final void method1351(class392 arg0, int[] arg1) {
        this.field4009.method2507(new class249(this.field4031, this, arg0, arg1), (byte) -125);
        ++field4011;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V", line = 976)
    public final void method1358(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(255 & this.field4037[arg0][arg1])) {
            this.field4037[arg0][arg1] = (byte) arg2;
        }
        ++field4030;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 991)
    public final void method1364(int arg0, int arg1) {
        ++field4015;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1002)
    public final void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4002;
        if (~this.field4043 < -1) {
            this.field4031.method2678((byte) 3);
            this.field4031.method2630(false, (byte) -66);
            this.field4031.method2703(false, 71);
            this.field4031.method2639(105, false);
            this.field4031.method2653(-125, false);
            this.field4031.method2644(0, (byte) 79);
            this.field4031.method2693(-2, 15210);
            this.field4031.method2627(26, (class262) null);
            class630.field8723[15] = 1.0F;
            class630.field8723[10] = 0.0F;
            class630.field8723[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4031.field6337;
            class630.field8723[1] = 0.0F;
            class630.field8723[0] = (float) arg2 / ((float) super.field3527 * 128.0F * (float) this.field4031.field6213);
            class630.field8723[3] = 0.0F;
            class630.field8723[11] = 0.0F;
            class630.field8723[2] = 0.0F;
            class630.field8723[4] = 0.0F;
            class630.field8723[5] = (float) arg2 / ((float) super.field3527 * 128.0F * (float) this.field4031.field6337);
            class630.field8723[6] = 0.0F;
            class630.field8723[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4031.field6213;
            class630.field8723[7] = 0.0F;
            class630.field8723[9] = 0.0F;
            class630.field8723[14] = 0.0F;
            class630.field8723[8] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class630.field8723, 0);
            class630.field8723[8] = 0.0F;
            class630.field8723[3] = 0.0F;
            class630.field8723[2] = 0.0F;
            class630.field8723[4] = 0.0F;
            class630.field8723[0] = 1.0F;
            class630.field8723[7] = 0.0F;
            class630.field8723[10] = 0.0F;
            class630.field8723[11] = 0.0F;
            class630.field8723[14] = 0.0F;
            class630.field8723[6] = 1.0F;
            class630.field8723[13] = 0.0F;
            class630.field8723[1] = 0.0F;
            class630.field8723[12] = 0.0F;
            class630.field8723[15] = 1.0F;
            class630.field8723[5] = 0.0F;
            class630.field8723[9] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class630.field8723, 0);
            if ((this.field4019 & 7) == 0) {
                this.field4031.method2703(false, 112);
            } else {
                this.field4031.method2703(true, 103);
                this.field4031.method2634((byte) -121);
            }
            this.field4031.method2677(this.field4038, this.field4035, 17560, this.field4039, this.field4042);
            if (~this.field4031.field6523.field2199.length <= ~(this.field4020 * 2)) {
                this.field4031.field6523.field2219 = 0;
            } else {
                this.field4031.field6523 = new class210(this.field4020 * 2);
            }
            int var9 = 0;
            class210 var10 = this.field4031.field6523;
            if (this.field4031.field6466) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field3524 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field4004[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method918(24551, var14[var15] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field3524 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field4004[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    var10.method913(65535 & var20[var21], true);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class290 var17 = new class290(this.field4031, 5123, var10.field2199, var10.field2219);
                this.field4031.method2674(0, 4, var17, 8704, var9);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZI)V", line = 1169)
    public final void method1363(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field4008;
        this.method1781(17432, arg4, arg0, arg3, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lag;IIII[[I[[II)V", line = 1184)
    public class303(class469 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4031 = arg0;
        this.field4006 = super.field3530 + -2;
        this.field4040 = new float[super.field3524 + 1][super.field3525 + 1];
        this.field4016 = new int[arg3][arg4][];
        this.field4037 = new byte[arg3 + 1][arg4 + 1];
        this.field4019 = arg2;
        this.field4005 = 1 << this.field4006;
        this.field4004 = new short[arg3 * arg4][];
        this.field4010 = new int[arg3][arg4][];
        this.field4018 = new int[arg3][arg4][];
        this.field4013 = new class4[arg3][arg4][];
        this.field4044 = new float[super.field3524 - -1][super.field3525 + 1];
        this.field4003 = new int[arg3][arg4][];
        this.field4028 = new int[arg3][arg4][];
        this.field4033 = new float[super.field3524 + 1][super.field3525 + 1];
        this.field4000 = new byte[arg3][arg4];
        for (int var9 = 1; ~var9 > ~super.field3525; ++var9) {
            for (int var10 = 1; ~super.field3524 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field4044[var10][var9] = (float) var11 * var13;
                this.field4033[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field4040[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4036 = new class546(128);
        if (~(this.field4019 & 16) != -1) {
            this.field4032 = new class281(this.field4031, this);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIILjava/lang/Class;)Lrc;", line = 1255)
    public static final class29 method1782(int arg0, int arg1, int arg2, Class arg3) {
        class207 var4 = class153.field2168[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class634 var5 = var4.field2774; var5 != null; var5 = var5.field8764) {
                class29 var6 = var5.field8767;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field423 == arg1 && var6.field419 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1286)
    public final void method1353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4012;
        if (arg5 != null && this.field4027 == null) {
            this.field4027 = new int[super.field3524][super.field3525][];
        }
        if (arg3 != null && this.field4010 == null) {
            this.field4010 = new int[super.field3524][super.field3525][];
        }
        this.field4018[arg0][arg1] = arg2;
        this.field4028[arg0][arg1] = arg4;
        this.field4003[arg0][arg1] = arg6;
        this.field4016[arg0][arg1] = arg7;
        if (this.field4027 != null) {
            this.field4027[arg0][arg1] = arg5;
        }
        if (this.field4010 != null) {
            this.field4010[arg0][arg1] = arg3;
        }
        class4[] var15 = this.field4013[arg0][arg1] = new class4[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[var16];
            class45 var19;
            for (var19 = this.field4036.method3057(1, var17); var19 != null; var19 = this.field4036.method3062(-124)) {
                class4 var20 = (class4) var19;
                if (arg8[var16] == var20.field37 && (float) arg9[var16] == var20.field31 && var20.field25 == arg10 && ~var20.field24 == ~arg11 && var20.field42 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class4(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field4036.method3061(123, var17, var15[var16]);
            } else {
                var15[var16] = (class4) var19;
            }
        }
        if (arg13) {
            this.field4000[arg0][arg1] = (byte) class665.method3789(this.field4000[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field4045) {
            this.field4045 = arg6.length;
        }
        this.field4043 += arg6.length;
    }
}
