import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class38 {

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    private int field166 = -1;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "Lwc;")
    private class49 field173;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[[I")
    public int[][] field179;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "[[B")
    private byte[][] field169;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "[[B")
    private byte[][] field171;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "[[Lmu;")
    private class200[][] field167;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[[Lqq;")
    private class337[][] field170;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "[[Lh;")
    private class480[][] field165;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "[[Lcg;")
    private class93[][] field183;

    @OriginalMember(owner = "client!kh", name = "ba", descriptor = "(Li;IIIIZ)V", line = 2)
    public final void method8(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 7)
    public final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class204 var9 = this.field173.method283(Thread.currentThread());
        class185 var10 = var9.field2907;
        var10.field2673 = 0;
        var10.field2666 = false;
        if (this.field165 != null) {
            this.method73(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2932, var9.field2916);
        } else {
            if (this.field167 != null) {
                this.method72(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2932, var9.field2916);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Li;IIIIZ)Z", line = 21)
    public final boolean method17(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!kh", name = "ca", descriptor = "(II)I", line = 28)
    public final int method11(int arg0, int arg1) {
        int var3 = arg0 >> super.field414;
        int var4 = arg1 >> super.field414;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field411 - 1 && var4 <= super.field413 - 1) {
            int var5 = arg0 & super.field416 - 1;
            int var6 = arg1 & super.field416 - 1;
            int var7 = (super.field416 - var5) * this.field179[var3][var4] + this.field179[var3 + 1][var4] * var5 >> super.field414;
            int var8 = (super.field416 - var5) * this.field179[var3][var4 + 1] + this.field179[var3 + 1][var4 + 1] * var5 >> super.field414;
            return (super.field416 - var6) * var7 + var6 * var8 >> super.field414;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)I", line = 47)
    private static final int method71(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII[[ZLgf;[I[I)V", line = 82)
    private final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class185 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2672 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field167[var16][var17] != null) {
                        class200 var18 = this.field167[var16][var17];
                        if (var18.field2842 != -1 && (var18.field2847 & 2) == 0 && var18.field2848 == -1) {
                            int var19 = this.field173.method350(var18.field2842);
                            arg8.method1168(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class384.method2231(var18.field2843 & 65535, 75, var19), class384.method2231(var18.field2845 & 65535, 48, var19), class384.method2231(var18.field2844 & 65535, 79, var19));
                            arg8.method1168(var15, var15, var15 - var13, var14, var13 + var14, var14, class384.method2231(var18.field2846 & 65535, 90, var19), class384.method2231(var18.field2844 & 65535, 117, var19), class384.method2231(var18.field2845 & 65535, 66, var19));
                        } else if (var18.field2848 == -1) {
                            arg8.method1168(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2843 & 65535, var18.field2845 & 65535, var18.field2844 & 65535);
                            arg8.method1168(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2846 & 65535, var18.field2844 & 65535, var18.field2845 & 65535);
                        } else {
                            int var20 = var18.field2848;
                            arg8.method1168(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1168(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field183[var16][var17] != null) {
                        class93 var21 = this.field183[var16][var17];
                        for (int var22 = 0; var22 < var21.field1192; ++var22) {
                            arg9[var22] = var21.field1182[var22] * var13 / super.field416 + var14;
                            arg10[var22] = var15 - var21.field1187[var22] * var13 / super.field416;
                        }
                        for (int var23 = 0; var23 < var21.field1181; ++var23) {
                            short var24 = var21.field1186[var23];
                            short var25 = var21.field1190[var23];
                            short var26 = var21.field1189[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1180 != null && var21.field1180[var23] != -1) {
                                int var33 = var21.field1180[var23];
                                arg8.method1168(var30, var31, var32, var27, var28, var29, class384.method2231(var21.field1185[var24], 121, var33), class384.method2231(var21.field1185[var25], 51, var33), class384.method2231(var21.field1185[var26], 119, var33));
                            } else if (var21.field1183 != null && var21.field1183[var23] != -1) {
                                int var34 = this.field173.method350(var21.field1183[var23]);
                                arg8.method1168(var30, var31, var32, var27, var28, var29, class384.method2231(var21.field1185[var24], 58, var34), class384.method2231(var21.field1185[var25], 56, var34), class384.method2231(var21.field1185[var26], 76, var34));
                            } else {
                                int var35 = var21.field1188[var23];
                                arg8.method1168(var30, var31, var32, var27, var28, var29, class384.method2231(var21.field1185[var24], 93, var35), class384.method2231(var21.field1185[var25], 55, var35), class384.method2231(var21.field1185[var26], 121, var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2672 = true;
    }

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "(Li;IIIIZ)V", line = 211)
    public final void method3(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!kh", name = "aa", descriptor = "()V", line = 216)
    public final void method4() {
        this.field169 = null;
        this.field171 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIIIIII[[ZLgf;[I[I)V", line = 221)
    private final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class185 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2672 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field165[var16][var17] != null) {
                        class480 var18 = this.field165[var16][var17];
                        if (var18.field6687 != -1 && (var18.field6686 & 2) == 0 && var18.field6684 == 0) {
                            int var19 = this.field173.method350(var18.field6687);
                            arg8.method1168(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class384.method2231(var18.field6685, 127, var19), class384.method2231(var18.field6689, 64, var19), class384.method2231(var18.field6690, 65, var19));
                            arg8.method1168(var15, var15, var15 - var13, var14, var13 + var14, var14, class384.method2231(var18.field6691, 63, var19), class384.method2231(var18.field6690, 125, var19), class384.method2231(var18.field6689, 116, var19));
                        } else if (var18.field6684 == 0) {
                            arg8.method1172(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6685, var18.field6689, var18.field6690);
                            arg8.method1172(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6691, var18.field6690, var18.field6689);
                        } else {
                            int var20 = var18.field6684;
                            arg8.method1172(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class243.method1532(65280, var20, var18.field6685 & -16777216), class243.method1532(65280, var20, var18.field6689 & -16777216), class243.method1532(65280, var20, var18.field6690 & -16777216));
                            arg8.method1172(var15, var15, var15 - var13, var14, var13 + var14, var14, class243.method1532(65280, var20, var18.field6691 & -16777216), class243.method1532(65280, var20, var18.field6690 & -16777216), class243.method1532(65280, var20, var18.field6689 & -16777216));
                        }
                    } else if (this.field170[var16][var17] != null) {
                        class337 var21 = this.field170[var16][var17];
                        for (int var22 = 0; var22 < var21.field4871; ++var22) {
                            arg9[var22] = var21.field4870[var22] * var13 / super.field416 + var14;
                            arg10[var22] = var15 - var21.field4869[var22] * var13 / super.field416;
                        }
                        for (int var23 = 0; var23 < var21.field4867; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4872 != null && var21.field4872[var23] != 0 && (var21.field4874 == null || var21.field4874 != null && var21.field4874[var23] == -1)) {
                                int var33 = var21.field4872[var23];
                                arg8.method1172(var30, var31, var32, var27, var28, var29, class243.method1532(65280, var33, -16777216 - (var21.field4873[var24] & -16777216)), class243.method1532(65280, var33, -16777216 - (var21.field4873[var25] & -16777216)), class243.method1532(65280, var33, -16777216 - (var21.field4873[var26] & -16777216)));
                            } else if (var21.field4874 != null && var21.field4874[var23] != -1) {
                                int var34 = this.field173.method350(var21.field4874[var23]);
                                arg8.method1168(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1172(var30, var31, var32, var27, var28, var29, var21.field4873[var24], var21.field4873[var25], var21.field4873[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2672 = true;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 349)
    public final void method5(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field167 == null) {
            this.field167 = new class200[super.field411][super.field413];
            this.field183 = new class93[super.field411][super.field413];
        } else if (this.field165 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field416 != var20 || var21 != 0 && super.field416 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class93 var22 = new class93();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1192 = var23;
            var22.field1185 = new short[var23];
            var22.field1182 = new short[var23];
            var22.field1191 = new short[var23];
            var22.field1187 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1185[var25] = (short) (this.field169[arg0][arg1] - this.field171[arg0][arg1]);
                } else if (var30 == 0 && super.field416 == var31) {
                    var22.field1185[var25] = (short) (this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1]);
                } else if (super.field416 == var30 && super.field416 == var31) {
                    var22.field1185[var25] = (short) (this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1]);
                } else if (super.field416 == var30 && var31 == 0) {
                    var22.field1185[var25] = (short) (this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1]) * var30 + (this.field169[arg0][arg1] - this.field171[arg0][arg1]) * (super.field416 - var30);
                    int var33 = (this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1]) * var30 + (this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1]) * (super.field416 - var30);
                    var22.field1185[var25] = (short) ((super.field416 - var31) * var32 + var31 * var33 >> super.field414 * 2);
                }
                int var34 = (arg0 << super.field414) + var30;
                int var35 = (arg1 << super.field414) + var31;
                var22.field1182[var25] = (short) var30;
                var22.field1187[var25] = (short) var31;
                var22.field1191[var25] = (short) (this.method11(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1185[var25] < 2) {
                    var22.field1185[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field173.field4246.method83(arg11[var28], 108).field3199) {
                    var26 = true;
                }
            }
            var22.field1188 = new int[var27];
            if (arg10 != null) {
                var22.field1180 = new int[var27];
            }
            var22.field1186 = new short[var27];
            var22.field1190 = new short[var27];
            var22.field1189 = new short[var27];
            if (var26) {
                var22.field1183 = new short[var27];
                var22.field1184 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1188[var22.field1181] = class517.method3068((byte) -4, arg9[var29]);
                    } else {
                        var22.field1188[var22.field1181] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1180[var22.field1181] = class517.method3068((byte) -4, arg10[var29]);
                        } else {
                            var22.field1180[var22.field1181] = -1;
                        }
                    }
                    var22.field1186[var22.field1181] = (short) arg6[var29];
                    var22.field1190[var22.field1181] = (short) arg7[var29];
                    var22.field1189[var22.field1181] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field173.field4246.method83(arg11[var29], 53).field3199) {
                            var22.field1183[var22.field1181] = (short) arg11[var29];
                            var22.field1184[var22.field1181] = (short) arg12[var29];
                        } else {
                            var22.field1183[var22.field1181] = -1;
                        }
                    }
                    ++var22.field1181;
                }
            }
            this.field183[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class200 var36 = new class200();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2848 = class384.method2231(this.field169[arg0][arg1] - this.field171[arg0][arg1], 118, class517.method3068((byte) -4, arg10[0]));
                    if (var37 == -1) {
                        var36.field2847 = (byte) (var36.field2847 | 2);
                    }
                }
                if (this.field179[arg0 + 1][arg1] == this.field179[arg0][arg1] && this.field179[arg0 + 1][arg1 + 1] == this.field179[arg0][arg1] && this.field179[arg0][arg1 + 1] == this.field179[arg0][arg1]) {
                    var36.field2847 = (byte) (var36.field2847 | 1);
                }
                if (var38 != -1 && (var36.field2847 & 2) == 0 && !this.field173.field4246.method83(var38, 110).field3199) {
                    var36.field2846 = (short) (this.field169[arg0][arg1] - this.field171[arg0][arg1]);
                    var36.field2844 = (short) (this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1]);
                    var36.field2843 = (short) (this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1]);
                    var36.field2845 = (short) (this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1]);
                    var36.field2842 = (short) var38;
                } else {
                    short var39 = class517.method3068((byte) -4, var37);
                    var36.field2846 = (short) class384.method2231(this.field169[arg0][arg1] - this.field171[arg0][arg1], 84, var39);
                    var36.field2844 = (short) class384.method2231(this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1], 67, var39);
                    var36.field2843 = (short) class384.method2231(this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1], 90, var39);
                    var36.field2845 = (short) class384.method2231(this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1], 49, var39);
                    var36.field2842 = -1;
                }
                this.field167[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "OA", descriptor = "(IILi;)Li;", line = 580)
    public final class31 method13(int arg0, int arg1, class31 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V", line = 587)
    public final void method15(int arg0, int arg1) {
        class204 var3 = this.field173.method283(Thread.currentThread());
        var3.field2907.field2673 = 0;
        if (this.field165 != null) {
            this.method76(arg0, arg1, this.field173.field568, var3.field2907, var3.field2932, var3.field2916, var3.field2957);
        } else {
            if (this.field167 != null) {
                this.method75(arg0, arg1, var3.field2907, var3.field2932, var3.field2916, var3.field2957);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lwc;IIII[[I[[II)V", line = 598)
    public class13(class49 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field173 = arg0;
        this.field178 = arg2;
        this.field179 = arg5;
        this.field169 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field173.field595 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field173.field565 * var18 + this.field173.field599 * var16 + this.field173.field576 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field169[var11][var10] = (byte) var20;
            }
        }
        this.field171 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!kh", name = "qa", descriptor = "(III)V", line = 648)
    public final void method9(int arg0, int arg1, int arg2) {
        if (this.field171[arg0][arg1] < arg2) {
            this.field171[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Z", line = 657)
    private final boolean method74(int arg0) {
        if ((this.field178 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILgf;[I[I[I)V", line = 678)
    private final void method75(int arg0, int arg1, class185 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class200 var7 = this.field167[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2847 & 2) == 0) {
                int var8 = super.field416 * arg0;
                int var9 = super.field416 + var8;
                int var10 = super.field416 * arg1;
                int var11 = super.field416 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field2847 & 1) != 0) {
                    int var12 = this.field179[arg0][arg1];
                    int var16;
                    if (this.field166 == -1) {
                        int var13 = this.field176 * var12;
                        var14 = (this.field180 * var10 + this.field163 * var8 + var13 >> 15) + this.field168;
                        if (var14 <= this.field173.field581) {
                            return;
                        }
                        var15 = (this.field180 * var10 + this.field163 * var9 + var13 >> 15) + this.field168;
                        if (var15 <= this.field173.field581) {
                            return;
                        }
                        var16 = (this.field180 * var11 + this.field163 * var9 + var13 >> 15) + this.field168;
                        if (var16 <= this.field173.field581) {
                            return;
                        }
                        var17 = (this.field180 * var11 + this.field163 * var8 + var13 >> 15) + this.field168;
                        if (var17 <= this.field173.field581) {
                            return;
                        }
                    } else {
                        var17 = this.field166;
                        var16 = this.field166;
                        var15 = this.field166;
                        var14 = this.field166;
                    }
                    int var18 = this.field175 * var12;
                    int var19 = this.field182 * var12;
                    var20 = (this.field164 * var10 + this.field162 * var8 + var18 >> 15) + this.field172;
                    var21 = this.field173.field592 * var20 / var14 + arg2.field2678;
                    var22 = (this.field181 * var10 + this.field177 * var8 + var19 >> 15) + this.field174;
                    var23 = this.field173.field577 * var22 / var14 + arg2.field2669;
                    var24 = (this.field164 * var10 + this.field162 * var9 + var18 >> 15) + this.field172;
                    var25 = this.field173.field592 * var24 / var15 + arg2.field2678;
                    var26 = (this.field181 * var10 + this.field177 * var9 + var19 >> 15) + this.field174;
                    var27 = this.field173.field577 * var26 / var15 + arg2.field2669;
                    int var28 = (this.field164 * var11 + this.field162 * var9 + var18 >> 15) + this.field172;
                    var29 = this.field173.field592 * var28 / var16 + arg2.field2678;
                    int var30 = (this.field181 * var11 + this.field177 * var9 + var19 >> 15) + this.field174;
                    var31 = this.field173.field577 * var30 / var16 + arg2.field2669;
                    var32 = (this.field164 * var11 + this.field162 * var8 + var18 >> 15) + this.field172;
                    var33 = this.field173.field592 * var32 / var17 + arg2.field2678;
                    var34 = (this.field181 * var11 + this.field177 * var8 + var19 >> 15) + this.field174;
                    var35 = this.field173.field577 * var34 / var17 + arg2.field2669;
                } else {
                    int var36 = this.field179[arg0][arg1];
                    int var37 = this.field179[arg0 + 1][arg1];
                    int var38 = this.field179[arg0 + 1][arg1 + 1];
                    int var39 = this.field179[arg0][arg1 + 1];
                    int var40;
                    if (this.field166 == -1) {
                        var14 = (this.field180 * var10 + this.field176 * var36 + this.field163 * var8 >> 15) + this.field168;
                        if (var14 <= this.field173.field581) {
                            return;
                        }
                        var15 = (this.field180 * var10 + this.field176 * var37 + this.field163 * var9 >> 15) + this.field168;
                        if (var15 <= this.field173.field581) {
                            return;
                        }
                        var40 = (this.field180 * var11 + this.field176 * var38 + this.field163 * var9 >> 15) + this.field168;
                        if (var40 <= this.field173.field581) {
                            return;
                        }
                        var17 = (this.field180 * var11 + this.field176 * var39 + this.field163 * var8 >> 15) + this.field168;
                        if (var17 <= this.field173.field581) {
                            return;
                        }
                    } else {
                        var17 = this.field166;
                        var40 = this.field166;
                        var15 = this.field166;
                        var14 = this.field166;
                    }
                    var20 = (this.field164 * var10 + this.field175 * var36 + this.field162 * var8 >> 15) + this.field172;
                    var21 = this.field173.field592 * var20 / var14 + arg2.field2678;
                    var22 = (this.field181 * var10 + this.field182 * var36 + this.field177 * var8 >> 15) + this.field174;
                    var23 = this.field173.field577 * var22 / var14 + arg2.field2669;
                    var24 = (this.field164 * var10 + this.field175 * var37 + this.field162 * var9 >> 15) + this.field172;
                    var25 = this.field173.field592 * var24 / var15 + arg2.field2678;
                    var26 = (this.field181 * var10 + this.field182 * var37 + this.field177 * var9 >> 15) + this.field174;
                    var27 = this.field173.field577 * var26 / var15 + arg2.field2669;
                    int var41 = (this.field164 * var11 + this.field175 * var38 + this.field162 * var9 >> 15) + this.field172;
                    var29 = this.field173.field592 * var41 / var40 + arg2.field2678;
                    int var42 = (this.field181 * var11 + this.field182 * var38 + this.field177 * var9 >> 15) + this.field174;
                    var31 = this.field173.field577 * var42 / var40 + arg2.field2669;
                    var32 = (this.field164 * var11 + this.field175 * var39 + this.field162 * var8 >> 15) + this.field172;
                    var33 = this.field173.field592 * var32 / var17 + arg2.field2678;
                    var34 = (this.field181 * var11 + this.field182 * var39 + this.field177 * var8 >> 15) + this.field174;
                    var35 = this.field173.field577 * var34 / var17 + arg2.field2669;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field2666 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field2667 || var33 > arg2.field2667 || var25 > arg2.field2667;
                    if (var7.field2842 >= 0) {
                        if (this.method74(this.field173.field4246.method83(var7.field2842, 114).field3197)) {
                            arg2.field2673 = 100;
                        }
                        arg2.method1178(var31, var35, var27, var29, var33, var25, var7.field2843 & 65535, var7.field2845 & 65535, var7.field2844 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2842);
                        arg2.field2673 = 0;
                    } else {
                        arg2.method1168(var31, var35, var27, var29, var33, var25, var7.field2843 & 65535, var7.field2845 & 65535, var7.field2844 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field2666 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field2667 || var25 > arg2.field2667 || var33 > arg2.field2667;
                    if (var7.field2842 >= 0) {
                        if (this.method74(this.field173.field4246.method83(var7.field2842, 99).field3197)) {
                            arg2.field2673 = 100;
                        }
                        arg2.method1178(var23, var27, var35, var21, var25, var33, var7.field2846 & 65535, var7.field2844 & 65535, var7.field2845 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2842);
                        arg2.field2673 = 0;
                        return;
                    }
                    arg2.method1168(var23, var27, var35, var21, var25, var33, var7.field2846 & 65535, var7.field2844 & 65535, var7.field2845 & 65535);
                }
            }
        } else {
            class93 var43 = this.field183[arg0][arg1];
            if (var43 != null) {
                if (this.field166 == -1) {
                    for (int var44 = 0; var44 < var43.field1192; ++var44) {
                        int var45 = (arg0 << super.field414) + var43.field1182[var44];
                        short var46 = var43.field1191[var44];
                        int var47 = (arg1 << super.field414) + var43.field1187[var44];
                        int var48 = (this.field180 * var47 + this.field176 * var46 + this.field163 * var45 >> 15) + this.field168;
                        if (var48 <= this.field173.field581) {
                            return;
                        }
                        int var49 = (this.field164 * var47 + this.field175 * var46 + this.field162 * var45 >> 15) + this.field172;
                        int var50 = (this.field181 * var47 + this.field182 * var46 + this.field177 * var45 >> 15) + this.field174;
                        arg3[var44] = this.field173.field592 * var49 / var48 + arg2.field2678;
                        arg4[var44] = this.field173.field577 * var50 / var48 + arg2.field2669;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field1192; ++var51) {
                        int var91 = (arg0 << super.field414) + var43.field1182[var51];
                        short var92 = var43.field1191[var51];
                        int var93 = (arg1 << super.field414) + var43.field1187[var51];
                        int var94 = (this.field164 * var93 + this.field175 * var92 + this.field162 * var91 >> 15) + this.field172;
                        int var95 = (this.field181 * var93 + this.field182 * var92 + this.field177 * var91 >> 15) + this.field174;
                        arg3[var51] = this.field173.field592 * var94 / this.field166 + arg2.field2678;
                        arg4[var51] = this.field173.field577 * var95 / this.field166 + arg2.field2669;
                    }
                }
                if (var43.field1183 != null) {
                    int var52 = this.field179[arg0][arg1];
                    int var53 = this.field179[arg0 + 1][arg1];
                    int var54 = this.field179[arg0][arg1 + 1];
                    int var55 = super.field416 * arg0;
                    int var56 = super.field416 + var55;
                    int var57 = super.field416 * arg1;
                    int var58 = super.field416 + var57;
                    int var59 = (this.field164 * var57 + this.field175 * var52 + this.field162 * var55 >> 15) + this.field172;
                    int var60 = (this.field181 * var57 + this.field182 * var52 + this.field177 * var55 >> 15) + this.field174;
                    int var61 = (this.field180 * var57 + this.field176 * var52 + this.field163 * var55 >> 15) + this.field168;
                    int var62 = (this.field164 * var57 + this.field175 * var53 + this.field162 * var56 >> 15) + this.field172;
                    int var63 = (this.field181 * var57 + this.field182 * var53 + this.field177 * var56 >> 15) + this.field174;
                    int var64 = (this.field180 * var57 + this.field176 * var53 + this.field163 * var56 >> 15) + this.field168;
                    int var65 = (this.field164 * var58 + this.field175 * var54 + this.field162 * var55 >> 15) + this.field172;
                    int var66 = (this.field181 * var58 + this.field182 * var54 + this.field177 * var55 >> 15) + this.field174;
                    int var67 = (this.field180 * var58 + this.field176 * var54 + this.field163 * var55 >> 15) + this.field168;
                    for (int var68 = 0; var68 < var43.field1181; ++var68) {
                        short var69 = var43.field1186[var68];
                        short var70 = var43.field1190[var68];
                        short var71 = var43.field1189[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field2666 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field2667 || var73 > arg2.field2667 || var74 > arg2.field2667;
                            short var78 = var43.field1183[var68];
                            if (var78 != -1) {
                                if (this.method74(this.field173.field4246.method83(var78, 101).field3197)) {
                                    arg2.field2673 = 100;
                                }
                                arg2.method1178(var75, var76, var77, var72, var73, var74, var43.field1185[var69], var43.field1185[var70], var43.field1185[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field2673 = 0;
                            } else {
                                int var79 = var43.field1188[var68];
                                if (var79 != -1) {
                                    arg2.method1168(var75, var76, var77, var72, var73, var74, class384.method2231(var43.field1185[var69], 114, var79), class384.method2231(var43.field1185[var70], 111, var79), class384.method2231(var43.field1185[var71], 95, var79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field1181; ++var80) {
                    short var81 = var43.field1186[var80];
                    short var82 = var43.field1190[var80];
                    short var83 = var43.field1189[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field1188[var80];
                        if (var90 != -1) {
                            arg2.field2666 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field2667 || var85 > arg2.field2667 || var86 > arg2.field2667;
                            arg2.method1168(var87, var88, var89, var84, var85, var86, class384.method2231(var43.field1185[var81], 63, var90), class384.method2231(var43.field1185[var82], 70, var90), class384.method2231(var43.field1185[var83], 108, var90));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZLgf;[I[I[I)V", line = 1036)
    private final void method76(int arg0, int arg1, boolean arg2, class185 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class480 var8 = this.field165[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6686 & 2) == 0) {
                int var9 = super.field416 * arg0;
                int var10 = super.field416 + var9;
                int var11 = super.field416 * arg1;
                int var12 = super.field416 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field6686 & 1) != 0 && !arg2) {
                    int var17 = this.field179[arg0][arg1];
                    if (this.field166 == -1) {
                        int var18 = this.field176 * var17;
                        var19 = (this.field180 * var11 + this.field163 * var9 + var18 >> 15) + this.field168;
                        if (var19 <= this.field173.field581) {
                            return;
                        }
                        var20 = (this.field180 * var11 + this.field163 * var10 + var18 >> 15) + this.field168;
                        if (var20 <= this.field173.field581) {
                            return;
                        }
                        var21 = (this.field180 * var12 + this.field163 * var10 + var18 >> 15) + this.field168;
                        if (var21 <= this.field173.field581) {
                            return;
                        }
                        var22 = (this.field180 * var12 + this.field163 * var9 + var18 >> 15) + this.field168;
                        if (var22 <= this.field173.field581) {
                            return;
                        }
                    } else {
                        var22 = this.field166;
                        var21 = this.field166;
                        var20 = this.field166;
                        var19 = this.field166;
                    }
                    if (this.field173.field601) {
                        int var23 = var19 - this.field173.field584;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field173.field584;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field173.field584;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field173.field584;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field175 * var17;
                    int var28 = this.field182 * var17;
                    var29 = (this.field164 * var11 + this.field162 * var9 + var27 >> 15) + this.field172;
                    var30 = this.field173.field592 * var29 / var19 + arg3.field2678;
                    var31 = (this.field181 * var11 + this.field177 * var9 + var28 >> 15) + this.field174;
                    var32 = this.field173.field577 * var31 / var19 + arg3.field2669;
                    var33 = (this.field164 * var11 + this.field162 * var10 + var27 >> 15) + this.field172;
                    var34 = this.field173.field592 * var33 / var20 + arg3.field2678;
                    var35 = (this.field181 * var11 + this.field177 * var10 + var28 >> 15) + this.field174;
                    var36 = this.field173.field577 * var35 / var20 + arg3.field2669;
                    var37 = (this.field164 * var12 + this.field162 * var10 + var27 >> 15) + this.field172;
                    var38 = this.field173.field592 * var37 / var21 + arg3.field2678;
                    var39 = (this.field181 * var12 + this.field177 * var10 + var28 >> 15) + this.field174;
                    var40 = this.field173.field577 * var39 / var21 + arg3.field2669;
                    var41 = (this.field164 * var12 + this.field162 * var9 + var27 >> 15) + this.field172;
                    var42 = this.field173.field592 * var41 / var22 + arg3.field2678;
                    var43 = (this.field181 * var12 + this.field177 * var9 + var28 >> 15) + this.field174;
                    var44 = this.field173.field577 * var43 / var22 + arg3.field2669;
                } else {
                    int var45 = this.field179[arg0][arg1];
                    int var46 = this.field179[arg0 + 1][arg1];
                    int var47 = this.field179[arg0 + 1][arg1 + 1];
                    int var48 = this.field179[arg0][arg1 + 1];
                    if (this.field166 == -1) {
                        var19 = (this.field180 * var11 + this.field176 * var45 + this.field163 * var9 >> 15) + this.field168;
                        if (var19 <= this.field173.field581) {
                            return;
                        }
                        var20 = (this.field180 * var11 + this.field176 * var46 + this.field163 * var10 >> 15) + this.field168;
                        if (var20 <= this.field173.field581) {
                            return;
                        }
                        var21 = (this.field180 * var12 + this.field176 * var47 + this.field163 * var10 >> 15) + this.field168;
                        if (var21 <= this.field173.field581) {
                            return;
                        }
                        var22 = (this.field180 * var12 + this.field176 * var48 + this.field163 * var9 >> 15) + this.field168;
                        if (var22 <= this.field173.field581) {
                            return;
                        }
                    } else {
                        var22 = this.field166;
                        var21 = this.field166;
                        var20 = this.field166;
                        var19 = this.field166;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field173.field584;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6693 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field173.field584;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6694 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field173.field584;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6692 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field173.field584;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6688 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field173.field601) {
                        int var57 = var19 - this.field173.field584;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field173.field584;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field173.field584;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field173.field584;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field164 * var11 + this.field175 * var45 + this.field162 * var9 >> 15) + this.field172;
                    var30 = this.field173.field592 * var29 / var19 + arg3.field2678;
                    var31 = (this.field181 * var11 + this.field182 * var45 + this.field177 * var9 >> 15) + this.field174;
                    var32 = this.field173.field577 * var31 / var19 + arg3.field2669;
                    var33 = (this.field164 * var11 + this.field175 * var46 + this.field162 * var10 >> 15) + this.field172;
                    var34 = this.field173.field592 * var33 / var20 + arg3.field2678;
                    var35 = (this.field181 * var11 + this.field182 * var46 + this.field177 * var10 >> 15) + this.field174;
                    var36 = this.field173.field577 * var35 / var20 + arg3.field2669;
                    var37 = (this.field164 * var12 + this.field175 * var47 + this.field162 * var10 >> 15) + this.field172;
                    var38 = this.field173.field592 * var37 / var21 + arg3.field2678;
                    var39 = (this.field181 * var12 + this.field182 * var47 + this.field177 * var10 >> 15) + this.field174;
                    var40 = this.field173.field577 * var39 / var21 + arg3.field2669;
                    var41 = (this.field164 * var12 + this.field175 * var48 + this.field162 * var9 >> 15) + this.field172;
                    var42 = this.field173.field592 * var41 / var22 + arg3.field2678;
                    var43 = (this.field181 * var12 + this.field182 * var48 + this.field177 * var9 >> 15) + this.field174;
                    var44 = this.field173.field577 * var43 / var22 + arg3.field2669;
                }
                boolean var61 = var8.field6687 != -1 && this.method74(this.field173.field4246.method83(var8.field6687, 53).field3197);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field2666 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field2667 || var42 > arg3.field2667 || var34 > arg3.field2667;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field2673 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6687 >= 0) {
                                arg3.method1171(var40, var44, var36, var38, var42, var34, this.field173.field586, var15, var16, var14, var8.field6685, var8.field6689, var8.field6690, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6687);
                            } else {
                                arg3.method1172(var40, var44, var36, var38, var42, var34, class243.method1532(65280, var8.field6685, var15 << 24 | this.field173.field586), class243.method1532(65280, var8.field6689, var16 << 24 | this.field173.field586), class243.method1532(65280, var8.field6690, var14 << 24 | this.field173.field586));
                            }
                        } else if (var8.field6687 >= 0) {
                            arg3.method1178(var40, var44, var36, var38, var42, var34, var8.field6685, var8.field6689, var8.field6690, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6687);
                        } else {
                            arg3.method1172(var40, var44, var36, var38, var42, var34, var8.field6685, var8.field6689, var8.field6690);
                        }
                        arg3.field2673 = 0;
                    } else {
                        arg3.method1175(var40, var44, var36, var38, var42, var34, this.field173.field586);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field2666 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field2667 || var34 > arg3.field2667 || var42 > arg3.field2667;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field2673 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6687 >= 0) {
                                arg3.method1171(var32, var36, var44, var30, var34, var42, this.field173.field586, var13, var14, var16, var8.field6691, var8.field6690, var8.field6689, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6687);
                            } else {
                                arg3.method1172(var32, var36, var44, var30, var34, var42, class243.method1532(65280, var8.field6691, var13 << 24 | this.field173.field586), class243.method1532(65280, var8.field6690, var14 << 24 | this.field173.field586), class243.method1532(65280, var8.field6689, var16 << 24 | this.field173.field586));
                            }
                        } else if (var8.field6687 >= 0) {
                            arg3.method1178(var32, var36, var44, var30, var34, var42, var8.field6691, var8.field6690, var8.field6689, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6687);
                        } else {
                            arg3.method1172(var32, var36, var44, var30, var34, var42, var8.field6691, var8.field6690, var8.field6689);
                        }
                        arg3.field2673 = 0;
                        return;
                    }
                    arg3.method1175(var32, var36, var44, var30, var34, var42, this.field173.field586);
                }
            }
        } else {
            class337 var64 = this.field170[arg0][arg1];
            if (var64 != null) {
                if (this.field166 == -1) {
                    for (int var65 = 0; var65 < var64.field4871; ++var65) {
                        int var66 = (arg0 << super.field414) + var64.field4870[var65];
                        int var67 = var64.field4876[var65];
                        int var68 = (arg1 << super.field414) + var64.field4869[var65];
                        int var69 = (this.field180 * var68 + this.field176 * var67 + this.field163 * var66 >> 15) + this.field168;
                        if (var69 <= this.field173.field581) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field173.field584;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field4868[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field173.field601) {
                            int var72 = var69 - this.field173.field584;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field164 * var68 + this.field175 * var67 + this.field162 * var66 >> 15) + this.field172;
                        int var74 = (this.field181 * var68 + this.field182 * var67 + this.field177 * var66 >> 15) + this.field174;
                        arg4[var65] = this.field173.field592 * var73 / var69 + arg3.field2678;
                        arg5[var65] = this.field173.field577 * var74 / var69 + arg3.field2669;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field4871; ++var75) {
                        int var115 = (arg0 << super.field414) + var64.field4870[var75];
                        int var116 = var64.field4876[var75];
                        int var117 = (arg1 << super.field414) + var64.field4869[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field166 - this.field173.field584;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field4868[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field173.field601) {
                            int var120 = this.field166 - this.field173.field584;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field164 * var117 + this.field175 * var116 + this.field162 * var115 >> 15) + this.field172;
                        int var122 = (this.field181 * var117 + this.field182 * var116 + this.field177 * var115 >> 15) + this.field174;
                        arg4[var75] = this.field173.field592 * var121 / this.field166 + arg3.field2678;
                        arg5[var75] = this.field173.field577 * var122 / this.field166 + arg3.field2669;
                    }
                }
                if (var64.field4874 != null) {
                    int var76 = this.field179[arg0][arg1];
                    int var77 = this.field179[arg0 + 1][arg1];
                    int var78 = this.field179[arg0][arg1 + 1];
                    int var79 = super.field416 * arg0;
                    int var80 = super.field416 + var79;
                    int var81 = super.field416 * arg1;
                    int var82 = super.field416 + var81;
                    int var83 = (this.field164 * var81 + this.field175 * var76 + this.field162 * var79 >> 15) + this.field172;
                    int var84 = (this.field181 * var81 + this.field182 * var76 + this.field177 * var79 >> 15) + this.field174;
                    int var85 = (this.field180 * var81 + this.field176 * var76 + this.field163 * var79 >> 15) + this.field168;
                    int var86 = (this.field164 * var81 + this.field175 * var77 + this.field162 * var80 >> 15) + this.field172;
                    int var87 = (this.field181 * var81 + this.field182 * var77 + this.field177 * var80 >> 15) + this.field174;
                    int var88 = (this.field180 * var81 + this.field176 * var77 + this.field163 * var80 >> 15) + this.field168;
                    int var89 = (this.field164 * var82 + this.field175 * var78 + this.field162 * var79 >> 15) + this.field172;
                    int var90 = (this.field181 * var82 + this.field182 * var78 + this.field177 * var79 >> 15) + this.field174;
                    int var91 = (this.field180 * var82 + this.field176 * var78 + this.field163 * var79 >> 15) + this.field168;
                    for (int var92 = 0; var92 < var64.field4867; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field2666 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field2667 || var97 > arg3.field2667 || var98 > arg3.field2667;
                            short var103 = var64.field4874[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method74(this.field173.field4246.method83(var103, 93).field3197)) {
                                    arg3.field2673 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1171(var99, var100, var101, var96, var97, var98, this.field173.field586, arg6[var93], arg6[var94], arg6[var95], var64.field4873[var93], var64.field4873[var94], var64.field4873[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field4873[var93] & 16777215) != 0) {
                                        arg3.method1172(var99, var100, var101, var96, var97, var98, class243.method1532(65280, var64.field4873[var93], arg6[var93] << 24 | this.field173.field586), class243.method1532(65280, var64.field4873[var94], arg6[var94] << 24 | this.field173.field586), class243.method1532(65280, var64.field4873[var95], arg6[var95] << 24 | this.field173.field586));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1178(var99, var100, var101, var96, var97, var98, var64.field4873[var93], var64.field4873[var94], var64.field4873[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field4873[var93] & 16777215) != 0) {
                                    arg3.method1172(var99, var100, var101, var96, var97, var98, var64.field4873[var93], var64.field4873[var94], var64.field4873[var95]);
                                }
                                arg3.field2673 = 0;
                            } else {
                                arg3.method1175(var99, var100, var101, var96, var97, var98, this.field173.field586);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field4867; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field2666 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field2667 || var109 > arg3.field2667 || var110 > arg3.field2667;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field4873[var105] & 16777215) != 0) {
                                    arg3.method1172(var111, var112, var113, var108, var109, var110, class360.method2123(var64.field4873[var105], this.field173.field586, (byte) 40, arg6[var105]), class360.method2123(var64.field4873[var106], this.field173.field586, (byte) 40, arg6[var106]), class360.method2123(var64.field4873[var107], this.field173.field586, (byte) 40, arg6[var107]));
                                }
                            } else if ((var64.field4873[var105] & 16777215) != 0) {
                                arg3.method1172(var111, var112, var113, var108, var109, var110, var64.field4873[var105], var64.field4873[var106], var64.field4873[var107]);
                            }
                        } else {
                            arg3.method1175(var111, var112, var113, var108, var109, var110, this.field173.field586);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lls;[I)V", line = 1676)
    public final void method6(class95 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!kh", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1679)
    public final void method12(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field165 == null) {
            this.field165 = new class480[super.field411][super.field413];
            this.field170 = new class337[super.field411][super.field413];
        } else if (this.field167 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class538.field7872[class517.method3068((byte) -4, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class538.field7872[class517.method3068((byte) -4, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field416 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field416 && arg4[var22] == super.field416) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field416) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field416 != arg2[var24] && arg2[0] - super.field416 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field416 != arg4[var24] && arg4[0] - super.field416 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class480 var25 = new class480();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6684 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6686 = (byte) (var25.field6686 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field179[arg0 + 1][arg1] == this.field179[arg0][arg1] && this.field179[arg0 + 1][arg1 + 1] == this.field179[arg0][arg1] && this.field179[arg0][arg1 + 1] == this.field179[arg0][arg1]) {
                    var25.field6686 = (byte) (var25.field6686 | 1);
                }
                if (var27 != -1 && (var25.field6686 & 2) == 0 && !this.field173.field4246.method83(var27, 58).field3199) {
                    var25.field6691 = this.field169[arg0][arg1] - this.field171[arg0][arg1];
                    var25.field6690 = this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1];
                    var25.field6685 = this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1];
                    var25.field6689 = this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1];
                    var25.field6687 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field6691 = class360.method2123(method71(arg6[var18] >> 8, this.field169[arg0][arg1] - this.field171[arg0][arg1]), arg10, (byte) 40, var28);
                    if (var25.field6684 != 0) {
                        var25.field6691 |= 255 - (this.field169[arg0][arg1] - this.field171[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field6690 = class360.method2123(method71(arg6[var19] >> 8, this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1]), arg10, (byte) 40, var29);
                    if (var25.field6684 != 0) {
                        var25.field6690 |= 255 - (this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field6685 = class360.method2123(method71(arg6[var20] >> 8, this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1]), arg10, (byte) 40, var30);
                    if (var25.field6684 != 0) {
                        var25.field6685 |= 255 - (this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field6689 = class360.method2123(method71(arg6[var21] >> 8, this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1]), arg10, (byte) 40, var31);
                    if (var25.field6684 != 0) {
                        var25.field6689 |= 255 - (this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6687 = -1;
                }
                if (arg5 != null) {
                    var25.field6692 = (short) arg5[var20];
                    var25.field6688 = (short) arg5[var21];
                    var25.field6694 = (short) arg5[var19];
                    var25.field6693 = (short) arg5[var18];
                }
                this.field165[arg0][arg1] = var25;
            } else {
                class337 var32 = new class337();
                var32.field4871 = (short) arg2.length;
                var32.field4867 = (short) (arg2.length / 3);
                var32.field4870 = new short[var32.field4871];
                var32.field4876 = new short[var32.field4871];
                var32.field4869 = new short[var32.field4871];
                var32.field4873 = new int[var32.field4871];
                if (arg5 != null) {
                    var32.field4868 = new short[var32.field4871];
                }
                for (int var33 = 0; var33 < var32.field4871; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field169[arg0][arg1] - this.field171[arg0][arg1];
                    } else if (var48 == 0 && super.field416 == var49) {
                        var51 = this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1];
                    } else if (super.field416 == var48 && super.field416 == var49) {
                        var51 = this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1];
                    } else if (super.field416 == var48 && var49 == 0) {
                        var51 = this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field169[arg0 + 1][arg1] - this.field171[arg0 + 1][arg1]) * var48 + (this.field169[arg0][arg1] - this.field171[arg0][arg1]) * (super.field416 - var48);
                        int var53 = (this.field169[arg0 + 1][arg1 + 1] - this.field171[arg0 + 1][arg1 + 1]) * var48 + (this.field169[arg0][arg1 + 1] - this.field171[arg0][arg1 + 1]) * (super.field416 - var48);
                        var51 = (super.field416 - var49) * var52 + var49 * var53 >> super.field414 * 2;
                    }
                    int var54 = (arg0 << super.field414) + var48;
                    int var55 = (arg1 << super.field414) + var49;
                    var32.field4870[var33] = (short) var48;
                    var32.field4869[var33] = (short) var49;
                    var32.field4876[var33] = (short) (this.method11(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field173.field4246.method83(arg8[var33], 48).field3199) {
                        var32.field4873[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field4873[var33] = var51 << 25;
                        } else {
                            var32.field4873[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field4868[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field4873[var33] = class360.method2123(method71(arg6[var33] >> 8, var51), arg10, (byte) 40, var56);
                        if (arg7 != null) {
                            var32.field4873[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field4867; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field173.field4246.method83(arg8[var35 * 3], 106).field3199) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field4872 = new int[var32.field4867];
                }
                if (var34) {
                    var32.field4874 = new short[var32.field4867];
                    var32.field4875 = new short[var32.field4867];
                }
                for (int var36 = 0; var36 < var32.field4867; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field4872[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field173.field4246.method83(var42, 81).field3199) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field173.field4246.method83(var43, 105).field3199) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field173.field4246.method83(var44, 104).field3199) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field4874[var36] = (short) var44;
                            var32.field4875[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field173.field4246.method83(var45, 77).field3199) {
                                    var32.field4873[var37] = class538.field7872[class517.method3068((byte) -4, this.field173.field4246.method83(var45, 56).field3204 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field173.field4246.method83(var46, 120).field3199) {
                                    var32.field4873[var38] = class538.field7872[class517.method3068((byte) -4, this.field173.field4246.method83(var46, 102).field3204 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field173.field4246.method83(var47, 52).field3199) {
                                    var32.field4873[var39] = class538.field7872[class517.method3068((byte) -4, this.field173.field4246.method83(var47, 93).field3204 & 65535) & 65535];
                                }
                            }
                            var32.field4874[var36] = -1;
                        }
                    }
                }
                this.field170[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "ua", descriptor = "(II)I", line = 2172)
    public final int method10(int arg0, int arg1) {
        return this.field179[arg0][arg1];
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[[ZZ)V", line = 2176)
    public final void method2(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class457 var6 = this.field173.field572;
        this.field166 = -1;
        this.field162 = var6.field6407;
        this.field175 = var6.field6412;
        this.field164 = var6.field6411;
        this.field172 = var6.field6415;
        this.field177 = var6.field6413;
        this.field182 = var6.field6416;
        this.field181 = var6.field6414;
        this.field174 = var6.field6406;
        this.field163 = var6.field6405;
        this.field176 = var6.field6410;
        this.field180 = var6.field6408;
        this.field168 = var6.field6409;
    }
}
