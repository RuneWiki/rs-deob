import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class369 extends class38 {

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    private int field5412 = -1;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Lsr;")
    private class167 field5407;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    private int field5399;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "[[I")
    public int[][] field5415;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[[B")
    private byte[][] field5406;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "[[B")
    private byte[][] field5410;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    private int field5396;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    private int field5398;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    private int field5400;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    private int field5401;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    private int field5405;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    private int field5411;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    private int field5413;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    private int field5414;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    private int field5416;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[[Lrt;")
    private class153[][] field5397;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "[[Lgu;")
    private class413[][] field5395;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "[[Lth;")
    private class426[][] field5404;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[[Law;")
    private class55[][] field5403;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lsr;IIII[[I[[II)V")
    public class369(class167 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5407 = arg0;
        this.field5399 = arg2;
        this.field5415 = arg5;
        this.field5406 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5407.field2708 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5407.field2716 * var18 + this.field5407.field2717 * var17 + this.field5407.field2715 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5406[var11][var10] = (byte) var20;
            }
        }
        this.field5410 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII[[ZLmr;[I[I)V")
    private final void method2259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class98 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1909 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5397[var16][var17] != null) {
                        class153 var18 = this.field5397[var16][var17];
                        if (var18.field2504 != -1 && (var18.field2500 & 2) == 0 && var18.field2501 == -1) {
                            int var19 = this.field5407.method1172(var18.field2504);
                            arg8.method876(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class284.method1776(var18.field2506 & 65535, var19, 126), class284.method1776(var18.field2503 & 65535, var19, 126), class284.method1776(var18.field2505 & 65535, var19, 126));
                            arg8.method876(var15, var15, var15 - var13, var14, var13 + var14, var14, class284.method1776(var18.field2502 & 65535, var19, 126), class284.method1776(var18.field2505 & 65535, var19, 126), class284.method1776(var18.field2503 & 65535, var19, 126));
                        } else if (var18.field2501 == -1) {
                            arg8.method876(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2506 & 65535, var18.field2503 & 65535, var18.field2505 & 65535);
                            arg8.method876(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2502 & 65535, var18.field2505 & 65535, var18.field2503 & 65535);
                        } else {
                            int var20 = var18.field2501;
                            arg8.method876(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method876(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field5403[var16][var17] != null) {
                        class55 var21 = this.field5403[var16][var17];
                        for (int var22 = 0; var22 < var21.field1175; ++var22) {
                            arg9[var22] = var21.field1178[var22] * var13 / super.field552 + var14;
                            arg10[var22] = var15 - var21.field1179[var22] * var13 / super.field552;
                        }
                        for (int var23 = 0; var23 < var21.field1182; ++var23) {
                            short var24 = var21.field1180[var23];
                            short var25 = var21.field1177[var23];
                            short var26 = var21.field1176[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1183 != null && var21.field1183[var23] != -1) {
                                int var33 = var21.field1183[var23];
                                arg8.method876(var30, var31, var32, var27, var28, var29, class284.method1776(var21.field1174[var24], var33, 126), class284.method1776(var21.field1174[var25], var33, 126), class284.method1776(var21.field1174[var26], var33, 126));
                            } else if (var21.field1181 != null && var21.field1181[var23] != -1) {
                                int var34 = this.field5407.method1172(var21.field1181[var23]);
                                arg8.method876(var30, var31, var32, var27, var28, var29, class284.method1776(var21.field1174[var24], var34, 126), class284.method1776(var21.field1174[var25], var34, 126), class284.method1776(var21.field1174[var26], var34, 126));
                            } else {
                                int var35 = var21.field1186[var23];
                                arg8.method876(var30, var31, var32, var27, var28, var29, class284.method1776(var21.field1174[var24], var35, 126), class284.method1776(var21.field1174[var25], var35, 126), class284.method1776(var21.field1174[var26], var35, 126));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1909 = true;
    }

    @OriginalMember(owner = "client!lh", name = "ca", descriptor = "(II)I")
    public final int method186(int arg0, int arg1) {
        int var3 = arg0 >> super.field558;
        int var4 = arg1 >> super.field558;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field551 - 1 && var4 <= super.field554 - 1) {
            int var5 = arg0 & super.field552 - 1;
            int var6 = arg1 & super.field552 - 1;
            int var7 = (super.field552 - var5) * this.field5415[var3][var4] + this.field5415[var3 + 1][var4] * var5 >> super.field558;
            int var8 = (super.field552 - var5) * this.field5415[var3][var4 + 1] + this.field5415[var3 + 1][var4 + 1] * var5 >> super.field558;
            return (super.field552 - var6) * var7 + var6 * var8 >> super.field558;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method191(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5397 == null) {
            this.field5397 = new class153[super.field551][super.field554];
            this.field5403 = new class55[super.field551][super.field554];
        } else if (this.field5395 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field552 != var20 || var21 != 0 && super.field552 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class55 var22 = new class55();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1175 = var23;
            var22.field1174 = new short[var23];
            var22.field1178 = new short[var23];
            var22.field1185 = new short[var23];
            var22.field1179 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1174[var25] = (short) (this.field5406[arg0][arg1] - this.field5410[arg0][arg1]);
                } else if (var30 == 0 && super.field552 == var31) {
                    var22.field1174[var25] = (short) (this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1]);
                } else if (super.field552 == var30 && super.field552 == var31) {
                    var22.field1174[var25] = (short) (this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1]);
                } else if (super.field552 == var30 && var31 == 0) {
                    var22.field1174[var25] = (short) (this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1]) * var30 + (this.field5406[arg0][arg1] - this.field5410[arg0][arg1]) * (super.field552 - var30);
                    int var33 = (this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1]) * var30 + (this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1]) * (super.field552 - var30);
                    var22.field1174[var25] = (short) ((super.field552 - var31) * var32 + var31 * var33 >> super.field558 * 2);
                }
                int var34 = (arg0 << super.field558) + var30;
                int var35 = (arg1 << super.field558) + var31;
                var22.field1178[var25] = (short) var30;
                var22.field1179[var25] = (short) var31;
                var22.field1185[var25] = (short) (this.method186(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1174[var25] < 2) {
                    var22.field1174[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5407.field4358.method105(-125, arg11[var28]).field7149) {
                    var26 = true;
                }
            }
            var22.field1186 = new int[var27];
            if (arg10 != null) {
                var22.field1183 = new int[var27];
            }
            var22.field1180 = new short[var27];
            var22.field1177 = new short[var27];
            var22.field1176 = new short[var27];
            if (var26) {
                var22.field1181 = new short[var27];
                var22.field1184 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1186[var22.field1182] = class127.method1000(arg9[var29], (byte) -78);
                    } else {
                        var22.field1186[var22.field1182] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1183[var22.field1182] = class127.method1000(arg10[var29], (byte) -93);
                        } else {
                            var22.field1183[var22.field1182] = -1;
                        }
                    }
                    var22.field1180[var22.field1182] = (short) arg6[var29];
                    var22.field1177[var22.field1182] = (short) arg7[var29];
                    var22.field1176[var22.field1182] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5407.field4358.method105(-128, arg11[var29]).field7149) {
                            var22.field1181[var22.field1182] = (short) arg11[var29];
                            var22.field1184[var22.field1182] = (short) arg12[var29];
                        } else {
                            var22.field1181[var22.field1182] = -1;
                        }
                    }
                    ++var22.field1182;
                }
            }
            this.field5403[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class153 var36 = new class153();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2501 = class284.method1776(this.field5406[arg0][arg1] - this.field5410[arg0][arg1], class127.method1000(arg10[0], (byte) -35), 126);
                    if (var37 == -1) {
                        var36.field2500 = (byte) (var36.field2500 | 2);
                    }
                }
                if (this.field5415[arg0 + 1][arg1] == this.field5415[arg0][arg1] && this.field5415[arg0 + 1][arg1 + 1] == this.field5415[arg0][arg1] && this.field5415[arg0][arg1 + 1] == this.field5415[arg0][arg1]) {
                    var36.field2500 = (byte) (var36.field2500 | 1);
                }
                if (var38 != -1 && (var36.field2500 & 2) == 0 && !this.field5407.field4358.method105(-123, var38).field7149) {
                    var36.field2502 = (short) (this.field5406[arg0][arg1] - this.field5410[arg0][arg1]);
                    var36.field2505 = (short) (this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1]);
                    var36.field2506 = (short) (this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1]);
                    var36.field2503 = (short) (this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1]);
                    var36.field2504 = (short) var38;
                } else {
                    short var39 = class127.method1000(var37, (byte) -107);
                    var36.field2502 = (short) class284.method1776(this.field5406[arg0][arg1] - this.field5410[arg0][arg1], var39, 126);
                    var36.field2505 = (short) class284.method1776(this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1], var39, 126);
                    var36.field2506 = (short) class284.method1776(this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1], var39, 126);
                    var36.field2503 = (short) class284.method1776(this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1], var39, 126);
                    var36.field2504 = -1;
                }
                this.field5397[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method182(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "aa", descriptor = "()V")
    public final void method187() {
        this.field5406 = null;
        this.field5410 = null;
    }

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method180(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lh", name = "qa", descriptor = "(III)V")
    public final void method179(int arg0, int arg1, int arg2) {
        if (this.field5410[arg0][arg1] < arg2) {
            this.field5410[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method176(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class92 var6 = this.field5407.field2731;
        this.field5412 = -1;
        this.field5413 = var6.field1827;
        this.field5402 = var6.field1823;
        this.field5400 = var6.field1824;
        this.field5405 = var6.field1828;
        this.field5408 = var6.field1833;
        this.field5411 = var6.field1822;
        this.field5401 = var6.field1826;
        this.field5396 = var6.field1832;
        this.field5409 = var6.field1829;
        this.field5398 = var6.field1825;
        this.field5414 = var6.field1830;
        this.field5416 = var6.field1831;
    }

    @OriginalMember(owner = "client!lh", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method188(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5395 == null) {
            this.field5395 = new class413[super.field551][super.field554];
            this.field5404 = new class426[super.field551][super.field554];
        } else if (this.field5397 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class198.field3177[class127.method1000(arg6[var15], (byte) -95) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class198.field3177[class127.method1000(arg7[var16], (byte) -128) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field552 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field552 && arg4[var22] == super.field552) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field552) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field552 != arg2[var24] && arg2[0] - super.field552 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field552 != arg4[var24] && arg4[0] - super.field552 != arg4[var24]) {
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
                class413 var25 = new class413();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6250 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6253 = (byte) (var25.field6253 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field5415[arg0 + 1][arg1] == this.field5415[arg0][arg1] && this.field5415[arg0 + 1][arg1 + 1] == this.field5415[arg0][arg1] && this.field5415[arg0][arg1 + 1] == this.field5415[arg0][arg1]) {
                    var25.field6253 = (byte) (var25.field6253 | 1);
                }
                if (var27 != -1 && (var25.field6253 & 2) == 0 && !this.field5407.field4358.method105(-128, var27).field7149) {
                    var25.field6257 = this.field5406[arg0][arg1] - this.field5410[arg0][arg1];
                    var25.field6251 = this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1];
                    var25.field6247 = this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1];
                    var25.field6249 = this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1];
                    var25.field6256 = (short) var27;
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
                    var25.field6257 = class485.method2908((byte) -79, arg10, method2262(arg6[var18] >> 8, this.field5406[arg0][arg1] - this.field5410[arg0][arg1]), var28);
                    if (var25.field6250 != 0) {
                        var25.field6257 |= 255 - (this.field5406[arg0][arg1] - this.field5410[arg0][arg1]) << 25;
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
                    var25.field6251 = class485.method2908((byte) -126, arg10, method2262(arg6[var19] >> 8, this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1]), var29);
                    if (var25.field6250 != 0) {
                        var25.field6251 |= 255 - (this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1]) << 25;
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
                    var25.field6247 = class485.method2908((byte) -55, arg10, method2262(arg6[var20] >> 8, this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1]), var30);
                    if (var25.field6250 != 0) {
                        var25.field6247 |= 255 - (this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field6249 = class485.method2908((byte) -88, arg10, method2262(arg6[var21] >> 8, this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1]), var31);
                    if (var25.field6250 != 0) {
                        var25.field6249 |= 255 - (this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6256 = -1;
                }
                if (arg5 != null) {
                    var25.field6255 = (short) arg5[var20];
                    var25.field6252 = (short) arg5[var21];
                    var25.field6254 = (short) arg5[var19];
                    var25.field6248 = (short) arg5[var18];
                }
                this.field5395[arg0][arg1] = var25;
            } else {
                class426 var32 = new class426();
                var32.field6380 = (short) arg2.length;
                var32.field6381 = (short) (arg2.length / 3);
                var32.field6388 = new short[var32.field6380];
                var32.field6383 = new short[var32.field6380];
                var32.field6385 = new short[var32.field6380];
                var32.field6389 = new int[var32.field6380];
                if (arg5 != null) {
                    var32.field6384 = new short[var32.field6380];
                }
                for (int var33 = 0; var33 < var32.field6380; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5406[arg0][arg1] - this.field5410[arg0][arg1];
                    } else if (var48 == 0 && super.field552 == var49) {
                        var51 = this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1];
                    } else if (super.field552 == var48 && super.field552 == var49) {
                        var51 = this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1];
                    } else if (super.field552 == var48 && var49 == 0) {
                        var51 = this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5406[arg0 + 1][arg1] - this.field5410[arg0 + 1][arg1]) * var48 + (this.field5406[arg0][arg1] - this.field5410[arg0][arg1]) * (super.field552 - var48);
                        int var53 = (this.field5406[arg0 + 1][arg1 + 1] - this.field5410[arg0 + 1][arg1 + 1]) * var48 + (this.field5406[arg0][arg1 + 1] - this.field5410[arg0][arg1 + 1]) * (super.field552 - var48);
                        var51 = (super.field552 - var49) * var52 + var49 * var53 >> super.field558 * 2;
                    }
                    int var54 = (arg0 << super.field558) + var48;
                    int var55 = (arg1 << super.field558) + var49;
                    var32.field6388[var33] = (short) var48;
                    var32.field6385[var33] = (short) var49;
                    var32.field6383[var33] = (short) (this.method186(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5407.field4358.method105(-125, arg8[var33]).field7149) {
                        var32.field6389[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field6389[var33] = var51 << 25;
                        } else {
                            var32.field6389[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field6384[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field6389[var33] = class485.method2908((byte) -106, arg10, method2262(arg6[var33] >> 8, var51), var56);
                        if (arg7 != null) {
                            var32.field6389[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field6381; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5407.field4358.method105(-127, arg8[var35 * 3]).field7149) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field6386 = new int[var32.field6381];
                }
                if (var34) {
                    var32.field6382 = new short[var32.field6381];
                    var32.field6387 = new short[var32.field6381];
                }
                for (int var36 = 0; var36 < var32.field6381; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field6386[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5407.field4358.method105(-124, var42).field7149) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5407.field4358.method105(-125, var43).field7149) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5407.field4358.method105(-128, var44).field7149) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field6382[var36] = (short) var44;
                            var32.field6387[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5407.field4358.method105(-126, var45).field7149) {
                                    var32.field6389[var37] = class198.field3177[class127.method1000(this.field5407.field4358.method105(-126, var45).field7152 & 65535, (byte) -27) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5407.field4358.method105(-128, var46).field7149) {
                                    var32.field6389[var38] = class198.field3177[class127.method1000(this.field5407.field4358.method105(-128, var46).field7152 & 65535, (byte) -44) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5407.field4358.method105(-125, var47).field7149) {
                                    var32.field6389[var39] = class198.field3177[class127.method1000(this.field5407.field4358.method105(-123, var47).field7152 & 65535, (byte) -63) & 65535];
                                }
                            }
                            var32.field6382[var36] = -1;
                        }
                    }
                }
                this.field5404[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "ua", descriptor = "(II)I")
    public final int method177(int arg0, int arg1) {
        return this.field5415[arg0][arg1];
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIIIIII[[ZLmr;[I[I)V")
    private final void method2260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class98 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field1909 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field5395[var16][var17] != null) {
                        class413 var18 = this.field5395[var16][var17];
                        if (var18.field6256 != -1 && (var18.field6253 & 2) == 0 && var18.field6250 == 0) {
                            int var19 = this.field5407.method1172(var18.field6256);
                            arg8.method876(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class284.method1776(var18.field6247, var19, 126), class284.method1776(var18.field6249, var19, 126), class284.method1776(var18.field6251, var19, 126));
                            arg8.method876(var15, var15, var15 - var13, var14, var13 + var14, var14, class284.method1776(var18.field6257, var19, 126), class284.method1776(var18.field6251, var19, 126), class284.method1776(var18.field6249, var19, 126));
                        } else if (var18.field6250 == 0) {
                            arg8.method878(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6247, var18.field6249, var18.field6251);
                            arg8.method878(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6257, var18.field6251, var18.field6249);
                        } else {
                            int var20 = var18.field6250;
                            arg8.method878(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class474.method2839(-10679, var18.field6247 & -16777216, var20), class474.method2839(-10679, var18.field6249 & -16777216, var20), class474.method2839(-10679, var18.field6251 & -16777216, var20));
                            arg8.method878(var15, var15, var15 - var13, var14, var13 + var14, var14, class474.method2839(-10679, var18.field6257 & -16777216, var20), class474.method2839(-10679, var18.field6251 & -16777216, var20), class474.method2839(-10679, var18.field6249 & -16777216, var20));
                        }
                    } else if (this.field5404[var16][var17] != null) {
                        class426 var21 = this.field5404[var16][var17];
                        for (int var22 = 0; var22 < var21.field6380; ++var22) {
                            arg9[var22] = var21.field6388[var22] * var13 / super.field552 + var14;
                            arg10[var22] = var15 - var21.field6385[var22] * var13 / super.field552;
                        }
                        for (int var23 = 0; var23 < var21.field6381; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field6386 != null && var21.field6386[var23] != 0 && (var21.field6382 == null || var21.field6382 != null && var21.field6382[var23] == -1)) {
                                int var33 = var21.field6386[var23];
                                arg8.method878(var30, var31, var32, var27, var28, var29, class474.method2839(-10679, -16777216 - (var21.field6389[var24] & -16777216), var33), class474.method2839(-10679, -16777216 - (var21.field6389[var25] & -16777216), var33), class474.method2839(-10679, -16777216 - (var21.field6389[var26] & -16777216), var33));
                            } else if (var21.field6382 != null && var21.field6382[var23] != -1) {
                                int var34 = this.field5407.method1172(var21.field6382[var23]);
                                arg8.method876(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method878(var30, var31, var32, var27, var28, var29, var21.field6389[var24], var21.field6389[var25], var21.field6389[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field1909 = true;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public final void method190(int arg0, int arg1) {
        class406 var3 = this.field5407.method1175(Thread.currentThread());
        var3.field6109.field1904 = 0;
        if (this.field5395 != null) {
            this.method2261(arg0, arg1, this.field5407.field2706, var3.field6109, var3.field6155, var3.field6125, var3.field6152);
        } else {
            if (this.field5397 != null) {
                this.method2264(arg0, arg1, var3.field6109, var3.field6155, var3.field6125, var3.field6152);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZLmr;[I[I[I)V")
    private final void method2261(int arg0, int arg1, boolean arg2, class98 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class413 var8 = this.field5395[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6253 & 2) == 0) {
                int var9 = super.field552 * arg0;
                int var10 = super.field552 + var9;
                int var11 = super.field552 * arg1;
                int var12 = super.field552 + var11;
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
                if ((var8.field6253 & 1) != 0 && !arg2) {
                    int var17 = this.field5415[arg0][arg1];
                    if (this.field5412 == -1) {
                        int var18 = this.field5398 * var17;
                        var19 = (this.field5414 * var11 + this.field5409 * var9 + var18 >> 15) + this.field5416;
                        if (var19 <= this.field5407.field2713) {
                            return;
                        }
                        var20 = (this.field5414 * var11 + this.field5409 * var10 + var18 >> 15) + this.field5416;
                        if (var20 <= this.field5407.field2713) {
                            return;
                        }
                        var21 = (this.field5414 * var12 + this.field5409 * var10 + var18 >> 15) + this.field5416;
                        if (var21 <= this.field5407.field2713) {
                            return;
                        }
                        var22 = (this.field5414 * var12 + this.field5409 * var9 + var18 >> 15) + this.field5416;
                        if (var22 <= this.field5407.field2713) {
                            return;
                        }
                    } else {
                        var22 = this.field5412;
                        var21 = this.field5412;
                        var20 = this.field5412;
                        var19 = this.field5412;
                    }
                    if (this.field5407.field2728) {
                        int var23 = var19 - this.field5407.field2701;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field5407.field2701;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field5407.field2701;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field5407.field2701;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field5402 * var17;
                    int var28 = this.field5411 * var17;
                    var29 = (this.field5400 * var11 + this.field5413 * var9 + var27 >> 15) + this.field5405;
                    var30 = this.field5407.field2714 * var29 / var19 + arg3.field1910;
                    var31 = (this.field5401 * var11 + this.field5408 * var9 + var28 >> 15) + this.field5396;
                    var32 = this.field5407.field2723 * var31 / var19 + arg3.field1898;
                    var33 = (this.field5400 * var11 + this.field5413 * var10 + var27 >> 15) + this.field5405;
                    var34 = this.field5407.field2714 * var33 / var20 + arg3.field1910;
                    var35 = (this.field5401 * var11 + this.field5408 * var10 + var28 >> 15) + this.field5396;
                    var36 = this.field5407.field2723 * var35 / var20 + arg3.field1898;
                    var37 = (this.field5400 * var12 + this.field5413 * var10 + var27 >> 15) + this.field5405;
                    var38 = this.field5407.field2714 * var37 / var21 + arg3.field1910;
                    var39 = (this.field5401 * var12 + this.field5408 * var10 + var28 >> 15) + this.field5396;
                    var40 = this.field5407.field2723 * var39 / var21 + arg3.field1898;
                    var41 = (this.field5400 * var12 + this.field5413 * var9 + var27 >> 15) + this.field5405;
                    var42 = this.field5407.field2714 * var41 / var22 + arg3.field1910;
                    var43 = (this.field5401 * var12 + this.field5408 * var9 + var28 >> 15) + this.field5396;
                    var44 = this.field5407.field2723 * var43 / var22 + arg3.field1898;
                } else {
                    int var45 = this.field5415[arg0][arg1];
                    int var46 = this.field5415[arg0 + 1][arg1];
                    int var47 = this.field5415[arg0 + 1][arg1 + 1];
                    int var48 = this.field5415[arg0][arg1 + 1];
                    if (this.field5412 == -1) {
                        var19 = (this.field5414 * var11 + this.field5409 * var9 + this.field5398 * var45 >> 15) + this.field5416;
                        if (var19 <= this.field5407.field2713) {
                            return;
                        }
                        var20 = (this.field5414 * var11 + this.field5409 * var10 + this.field5398 * var46 >> 15) + this.field5416;
                        if (var20 <= this.field5407.field2713) {
                            return;
                        }
                        var21 = (this.field5414 * var12 + this.field5409 * var10 + this.field5398 * var47 >> 15) + this.field5416;
                        if (var21 <= this.field5407.field2713) {
                            return;
                        }
                        var22 = (this.field5414 * var12 + this.field5409 * var9 + this.field5398 * var48 >> 15) + this.field5416;
                        if (var22 <= this.field5407.field2713) {
                            return;
                        }
                    } else {
                        var22 = this.field5412;
                        var21 = this.field5412;
                        var20 = this.field5412;
                        var19 = this.field5412;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field5407.field2701;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6248 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field5407.field2701;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6254 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field5407.field2701;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6255 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field5407.field2701;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6252 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field5407.field2728) {
                        int var57 = var19 - this.field5407.field2701;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field5407.field2701;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field5407.field2701;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field5407.field2701;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field5400 * var11 + this.field5413 * var9 + this.field5402 * var45 >> 15) + this.field5405;
                    var30 = this.field5407.field2714 * var29 / var19 + arg3.field1910;
                    var31 = (this.field5401 * var11 + this.field5411 * var45 + this.field5408 * var9 >> 15) + this.field5396;
                    var32 = this.field5407.field2723 * var31 / var19 + arg3.field1898;
                    var33 = (this.field5400 * var11 + this.field5413 * var10 + this.field5402 * var46 >> 15) + this.field5405;
                    var34 = this.field5407.field2714 * var33 / var20 + arg3.field1910;
                    var35 = (this.field5401 * var11 + this.field5411 * var46 + this.field5408 * var10 >> 15) + this.field5396;
                    var36 = this.field5407.field2723 * var35 / var20 + arg3.field1898;
                    var37 = (this.field5400 * var12 + this.field5413 * var10 + this.field5402 * var47 >> 15) + this.field5405;
                    var38 = this.field5407.field2714 * var37 / var21 + arg3.field1910;
                    var39 = (this.field5401 * var12 + this.field5411 * var47 + this.field5408 * var10 >> 15) + this.field5396;
                    var40 = this.field5407.field2723 * var39 / var21 + arg3.field1898;
                    var41 = (this.field5400 * var12 + this.field5413 * var9 + this.field5402 * var48 >> 15) + this.field5405;
                    var42 = this.field5407.field2714 * var41 / var22 + arg3.field1910;
                    var43 = (this.field5401 * var12 + this.field5411 * var48 + this.field5408 * var9 >> 15) + this.field5396;
                    var44 = this.field5407.field2723 * var43 / var22 + arg3.field1898;
                }
                boolean var61 = var8.field6256 != -1 && this.method2263(this.field5407.field4358.method105(-127, var8.field6256).field7141);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field1901 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field1907 || var42 > arg3.field1907 || var34 > arg3.field1907;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field1904 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6256 >= 0) {
                                arg3.method870(var40, var44, var36, var38, var42, var34, this.field5407.field2721, var15, var16, var14, var8.field6247, var8.field6249, var8.field6251, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6256);
                            } else {
                                arg3.method878(var40, var44, var36, var38, var42, var34, class474.method2839(-10679, var15 << 24 | this.field5407.field2721, var8.field6247), class474.method2839(-10679, var16 << 24 | this.field5407.field2721, var8.field6249), class474.method2839(-10679, var14 << 24 | this.field5407.field2721, var8.field6251));
                            }
                        } else if (var8.field6256 >= 0) {
                            arg3.method868(var40, var44, var36, var38, var42, var34, var8.field6247, var8.field6249, var8.field6251, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6256);
                        } else {
                            arg3.method878(var40, var44, var36, var38, var42, var34, var8.field6247, var8.field6249, var8.field6251);
                        }
                        arg3.field1904 = 0;
                    } else {
                        arg3.method877(var40, var44, var36, var38, var42, var34, this.field5407.field2721);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field1901 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field1907 || var34 > arg3.field1907 || var42 > arg3.field1907;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field1904 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6256 >= 0) {
                                arg3.method870(var32, var36, var44, var30, var34, var42, this.field5407.field2721, var13, var14, var16, var8.field6257, var8.field6251, var8.field6249, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6256);
                            } else {
                                arg3.method878(var32, var36, var44, var30, var34, var42, class474.method2839(-10679, var13 << 24 | this.field5407.field2721, var8.field6257), class474.method2839(-10679, var14 << 24 | this.field5407.field2721, var8.field6251), class474.method2839(-10679, var16 << 24 | this.field5407.field2721, var8.field6249));
                            }
                        } else if (var8.field6256 >= 0) {
                            arg3.method868(var32, var36, var44, var30, var34, var42, var8.field6257, var8.field6251, var8.field6249, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6256);
                        } else {
                            arg3.method878(var32, var36, var44, var30, var34, var42, var8.field6257, var8.field6251, var8.field6249);
                        }
                        arg3.field1904 = 0;
                        return;
                    }
                    arg3.method877(var32, var36, var44, var30, var34, var42, this.field5407.field2721);
                }
            }
        } else {
            class426 var64 = this.field5404[arg0][arg1];
            if (var64 != null) {
                if (this.field5412 == -1) {
                    for (int var65 = 0; var65 < var64.field6380; ++var65) {
                        int var66 = (arg0 << super.field558) + var64.field6388[var65];
                        int var67 = var64.field6383[var65];
                        int var68 = (arg1 << super.field558) + var64.field6385[var65];
                        int var69 = (this.field5414 * var68 + this.field5409 * var66 + this.field5398 * var67 >> 15) + this.field5416;
                        if (var69 <= this.field5407.field2713) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field5407.field2701;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field6384[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field5407.field2728) {
                            int var72 = var69 - this.field5407.field2701;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field5400 * var68 + this.field5413 * var66 + this.field5402 * var67 >> 15) + this.field5405;
                        int var74 = (this.field5401 * var68 + this.field5411 * var67 + this.field5408 * var66 >> 15) + this.field5396;
                        arg4[var65] = this.field5407.field2714 * var73 / var69 + arg3.field1910;
                        arg5[var65] = this.field5407.field2723 * var74 / var69 + arg3.field1898;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field6380; ++var75) {
                        int var115 = (arg0 << super.field558) + var64.field6388[var75];
                        int var116 = var64.field6383[var75];
                        int var117 = (arg1 << super.field558) + var64.field6385[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field5412 - this.field5407.field2701;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field6384[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field5407.field2728) {
                            int var120 = this.field5412 - this.field5407.field2701;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field5400 * var117 + this.field5413 * var115 + this.field5402 * var116 >> 15) + this.field5405;
                        int var122 = (this.field5401 * var117 + this.field5411 * var116 + this.field5408 * var115 >> 15) + this.field5396;
                        arg4[var75] = this.field5407.field2714 * var121 / this.field5412 + arg3.field1910;
                        arg5[var75] = this.field5407.field2723 * var122 / this.field5412 + arg3.field1898;
                    }
                }
                if (var64.field6382 != null) {
                    int var76 = this.field5415[arg0][arg1];
                    int var77 = this.field5415[arg0 + 1][arg1];
                    int var78 = this.field5415[arg0][arg1 + 1];
                    int var79 = super.field552 * arg0;
                    int var80 = super.field552 + var79;
                    int var81 = super.field552 * arg1;
                    int var82 = super.field552 + var81;
                    int var83 = (this.field5400 * var81 + this.field5413 * var79 + this.field5402 * var76 >> 15) + this.field5405;
                    int var84 = (this.field5401 * var81 + this.field5411 * var76 + this.field5408 * var79 >> 15) + this.field5396;
                    int var85 = (this.field5414 * var81 + this.field5409 * var79 + this.field5398 * var76 >> 15) + this.field5416;
                    int var86 = (this.field5400 * var81 + this.field5413 * var80 + this.field5402 * var77 >> 15) + this.field5405;
                    int var87 = (this.field5401 * var81 + this.field5411 * var77 + this.field5408 * var80 >> 15) + this.field5396;
                    int var88 = (this.field5414 * var81 + this.field5409 * var80 + this.field5398 * var77 >> 15) + this.field5416;
                    int var89 = (this.field5400 * var82 + this.field5413 * var79 + this.field5402 * var78 >> 15) + this.field5405;
                    int var90 = (this.field5401 * var82 + this.field5411 * var78 + this.field5408 * var79 >> 15) + this.field5396;
                    int var91 = (this.field5414 * var82 + this.field5409 * var79 + this.field5398 * var78 >> 15) + this.field5416;
                    for (int var92 = 0; var92 < var64.field6381; ++var92) {
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
                            arg3.field1901 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field1907 || var97 > arg3.field1907 || var98 > arg3.field1907;
                            short var103 = var64.field6382[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2263(this.field5407.field4358.method105(-123, var103).field7141)) {
                                    arg3.field1904 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method870(var99, var100, var101, var96, var97, var98, this.field5407.field2721, arg6[var93], arg6[var94], arg6[var95], var64.field6389[var93], var64.field6389[var94], var64.field6389[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field6389[var93] & 16777215) != 0) {
                                        arg3.method878(var99, var100, var101, var96, var97, var98, class474.method2839(-10679, arg6[var93] << 24 | this.field5407.field2721, var64.field6389[var93]), class474.method2839(-10679, arg6[var94] << 24 | this.field5407.field2721, var64.field6389[var94]), class474.method2839(-10679, arg6[var95] << 24 | this.field5407.field2721, var64.field6389[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method868(var99, var100, var101, var96, var97, var98, var64.field6389[var93], var64.field6389[var94], var64.field6389[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field6389[var93] & 16777215) != 0) {
                                    arg3.method878(var99, var100, var101, var96, var97, var98, var64.field6389[var93], var64.field6389[var94], var64.field6389[var95]);
                                }
                                arg3.field1904 = 0;
                            } else {
                                arg3.method877(var99, var100, var101, var96, var97, var98, this.field5407.field2721);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field6381; ++var104) {
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
                        arg3.field1901 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field1907 || var109 > arg3.field1907 || var110 > arg3.field1907;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field6389[var105] & 16777215) != 0) {
                                    arg3.method878(var111, var112, var113, var108, var109, var110, class485.method2908((byte) -71, this.field5407.field2721, var64.field6389[var105], arg6[var105]), class485.method2908((byte) -55, this.field5407.field2721, var64.field6389[var106], arg6[var106]), class485.method2908((byte) -86, this.field5407.field2721, var64.field6389[var107], arg6[var107]));
                                }
                            } else if ((var64.field6389[var105] & 16777215) != 0) {
                                arg3.method878(var111, var112, var113, var108, var109, var110, var64.field6389[var105], var64.field6389[var106], var64.field6389[var107]);
                            }
                        } else {
                            arg3.method877(var111, var112, var113, var108, var109, var110, this.field5407.field2721);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "OA", descriptor = "(IILi;)Li;")
    public final class31 method189(int arg0, int arg1, class31 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)I")
    private static final int method2262(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lbk;[I)V")
    public final void method178(class256 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class406 var9 = this.field5407.method1175(Thread.currentThread());
        class98 var10 = var9.field6109;
        var10.field1904 = 0;
        var10.field1901 = false;
        if (this.field5395 != null) {
            this.method2260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field6155, var9.field6125);
        } else {
            if (this.field5397 != null) {
                this.method2259(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field6155, var9.field6125);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method185(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Z")
    private final boolean method2263(int arg0) {
        if ((this.field5399 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILmr;[I[I[I)V")
    private final void method2264(int arg0, int arg1, class98 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class153 var7 = this.field5397[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2500 & 2) == 0) {
                int var8 = super.field552 * arg0;
                int var9 = super.field552 + var8;
                int var10 = super.field552 * arg1;
                int var11 = super.field552 + var10;
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
                if ((var7.field2500 & 1) != 0) {
                    int var12 = this.field5415[arg0][arg1];
                    int var16;
                    if (this.field5412 == -1) {
                        int var13 = this.field5398 * var12;
                        var14 = (this.field5414 * var10 + this.field5409 * var8 + var13 >> 15) + this.field5416;
                        if (var14 <= this.field5407.field2713) {
                            return;
                        }
                        var15 = (this.field5414 * var10 + this.field5409 * var9 + var13 >> 15) + this.field5416;
                        if (var15 <= this.field5407.field2713) {
                            return;
                        }
                        var16 = (this.field5414 * var11 + this.field5409 * var9 + var13 >> 15) + this.field5416;
                        if (var16 <= this.field5407.field2713) {
                            return;
                        }
                        var17 = (this.field5414 * var11 + this.field5409 * var8 + var13 >> 15) + this.field5416;
                        if (var17 <= this.field5407.field2713) {
                            return;
                        }
                    } else {
                        var17 = this.field5412;
                        var16 = this.field5412;
                        var15 = this.field5412;
                        var14 = this.field5412;
                    }
                    int var18 = this.field5402 * var12;
                    int var19 = this.field5411 * var12;
                    var20 = (this.field5400 * var10 + this.field5413 * var8 + var18 >> 15) + this.field5405;
                    var21 = this.field5407.field2714 * var20 / var14 + arg2.field1910;
                    var22 = (this.field5401 * var10 + this.field5408 * var8 + var19 >> 15) + this.field5396;
                    var23 = this.field5407.field2723 * var22 / var14 + arg2.field1898;
                    var24 = (this.field5400 * var10 + this.field5413 * var9 + var18 >> 15) + this.field5405;
                    var25 = this.field5407.field2714 * var24 / var15 + arg2.field1910;
                    var26 = (this.field5401 * var10 + this.field5408 * var9 + var19 >> 15) + this.field5396;
                    var27 = this.field5407.field2723 * var26 / var15 + arg2.field1898;
                    int var28 = (this.field5400 * var11 + this.field5413 * var9 + var18 >> 15) + this.field5405;
                    var29 = this.field5407.field2714 * var28 / var16 + arg2.field1910;
                    int var30 = (this.field5401 * var11 + this.field5408 * var9 + var19 >> 15) + this.field5396;
                    var31 = this.field5407.field2723 * var30 / var16 + arg2.field1898;
                    var32 = (this.field5400 * var11 + this.field5413 * var8 + var18 >> 15) + this.field5405;
                    var33 = this.field5407.field2714 * var32 / var17 + arg2.field1910;
                    var34 = (this.field5401 * var11 + this.field5408 * var8 + var19 >> 15) + this.field5396;
                    var35 = this.field5407.field2723 * var34 / var17 + arg2.field1898;
                } else {
                    int var36 = this.field5415[arg0][arg1];
                    int var37 = this.field5415[arg0 + 1][arg1];
                    int var38 = this.field5415[arg0 + 1][arg1 + 1];
                    int var39 = this.field5415[arg0][arg1 + 1];
                    int var40;
                    if (this.field5412 == -1) {
                        var14 = (this.field5414 * var10 + this.field5409 * var8 + this.field5398 * var36 >> 15) + this.field5416;
                        if (var14 <= this.field5407.field2713) {
                            return;
                        }
                        var15 = (this.field5414 * var10 + this.field5409 * var9 + this.field5398 * var37 >> 15) + this.field5416;
                        if (var15 <= this.field5407.field2713) {
                            return;
                        }
                        var40 = (this.field5414 * var11 + this.field5409 * var9 + this.field5398 * var38 >> 15) + this.field5416;
                        if (var40 <= this.field5407.field2713) {
                            return;
                        }
                        var17 = (this.field5414 * var11 + this.field5409 * var8 + this.field5398 * var39 >> 15) + this.field5416;
                        if (var17 <= this.field5407.field2713) {
                            return;
                        }
                    } else {
                        var17 = this.field5412;
                        var40 = this.field5412;
                        var15 = this.field5412;
                        var14 = this.field5412;
                    }
                    var20 = (this.field5400 * var10 + this.field5413 * var8 + this.field5402 * var36 >> 15) + this.field5405;
                    var21 = this.field5407.field2714 * var20 / var14 + arg2.field1910;
                    var22 = (this.field5401 * var10 + this.field5411 * var36 + this.field5408 * var8 >> 15) + this.field5396;
                    var23 = this.field5407.field2723 * var22 / var14 + arg2.field1898;
                    var24 = (this.field5400 * var10 + this.field5413 * var9 + this.field5402 * var37 >> 15) + this.field5405;
                    var25 = this.field5407.field2714 * var24 / var15 + arg2.field1910;
                    var26 = (this.field5401 * var10 + this.field5411 * var37 + this.field5408 * var9 >> 15) + this.field5396;
                    var27 = this.field5407.field2723 * var26 / var15 + arg2.field1898;
                    int var41 = (this.field5400 * var11 + this.field5413 * var9 + this.field5402 * var38 >> 15) + this.field5405;
                    var29 = this.field5407.field2714 * var41 / var40 + arg2.field1910;
                    int var42 = (this.field5401 * var11 + this.field5411 * var38 + this.field5408 * var9 >> 15) + this.field5396;
                    var31 = this.field5407.field2723 * var42 / var40 + arg2.field1898;
                    var32 = (this.field5400 * var11 + this.field5413 * var8 + this.field5402 * var39 >> 15) + this.field5405;
                    var33 = this.field5407.field2714 * var32 / var17 + arg2.field1910;
                    var34 = (this.field5401 * var11 + this.field5411 * var39 + this.field5408 * var8 >> 15) + this.field5396;
                    var35 = this.field5407.field2723 * var34 / var17 + arg2.field1898;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field1901 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field1907 || var33 > arg2.field1907 || var25 > arg2.field1907;
                    if (var7.field2504 >= 0) {
                        if (this.method2263(this.field5407.field4358.method105(-123, var7.field2504).field7141)) {
                            arg2.field1904 = 100;
                        }
                        arg2.method868(var31, var35, var27, var29, var33, var25, var7.field2506 & 65535, var7.field2503 & 65535, var7.field2505 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2504);
                        arg2.field1904 = 0;
                    } else {
                        arg2.method876(var31, var35, var27, var29, var33, var25, var7.field2506 & 65535, var7.field2503 & 65535, var7.field2505 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field1901 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field1907 || var25 > arg2.field1907 || var33 > arg2.field1907;
                    if (var7.field2504 >= 0) {
                        if (this.method2263(this.field5407.field4358.method105(-125, var7.field2504).field7141)) {
                            arg2.field1904 = 100;
                        }
                        arg2.method868(var23, var27, var35, var21, var25, var33, var7.field2502 & 65535, var7.field2505 & 65535, var7.field2503 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2504);
                        arg2.field1904 = 0;
                        return;
                    }
                    arg2.method876(var23, var27, var35, var21, var25, var33, var7.field2502 & 65535, var7.field2505 & 65535, var7.field2503 & 65535);
                }
            }
        } else {
            class55 var43 = this.field5403[arg0][arg1];
            if (var43 != null) {
                if (this.field5412 == -1) {
                    for (int var44 = 0; var44 < var43.field1175; ++var44) {
                        int var45 = (arg0 << super.field558) + var43.field1178[var44];
                        short var46 = var43.field1185[var44];
                        int var47 = (arg1 << super.field558) + var43.field1179[var44];
                        int var48 = (this.field5414 * var47 + this.field5409 * var45 + this.field5398 * var46 >> 15) + this.field5416;
                        if (var48 <= this.field5407.field2713) {
                            return;
                        }
                        int var49 = (this.field5400 * var47 + this.field5413 * var45 + this.field5402 * var46 >> 15) + this.field5405;
                        int var50 = (this.field5401 * var47 + this.field5411 * var46 + this.field5408 * var45 >> 15) + this.field5396;
                        arg3[var44] = this.field5407.field2714 * var49 / var48 + arg2.field1910;
                        arg4[var44] = this.field5407.field2723 * var50 / var48 + arg2.field1898;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field1175; ++var51) {
                        int var91 = (arg0 << super.field558) + var43.field1178[var51];
                        short var92 = var43.field1185[var51];
                        int var93 = (arg1 << super.field558) + var43.field1179[var51];
                        int var94 = (this.field5400 * var93 + this.field5413 * var91 + this.field5402 * var92 >> 15) + this.field5405;
                        int var95 = (this.field5401 * var93 + this.field5411 * var92 + this.field5408 * var91 >> 15) + this.field5396;
                        arg3[var51] = this.field5407.field2714 * var94 / this.field5412 + arg2.field1910;
                        arg4[var51] = this.field5407.field2723 * var95 / this.field5412 + arg2.field1898;
                    }
                }
                if (var43.field1181 != null) {
                    int var52 = this.field5415[arg0][arg1];
                    int var53 = this.field5415[arg0 + 1][arg1];
                    int var54 = this.field5415[arg0][arg1 + 1];
                    int var55 = super.field552 * arg0;
                    int var56 = super.field552 + var55;
                    int var57 = super.field552 * arg1;
                    int var58 = super.field552 + var57;
                    int var59 = (this.field5400 * var57 + this.field5413 * var55 + this.field5402 * var52 >> 15) + this.field5405;
                    int var60 = (this.field5401 * var57 + this.field5411 * var52 + this.field5408 * var55 >> 15) + this.field5396;
                    int var61 = (this.field5414 * var57 + this.field5409 * var55 + this.field5398 * var52 >> 15) + this.field5416;
                    int var62 = (this.field5400 * var57 + this.field5413 * var56 + this.field5402 * var53 >> 15) + this.field5405;
                    int var63 = (this.field5401 * var57 + this.field5411 * var53 + this.field5408 * var56 >> 15) + this.field5396;
                    int var64 = (this.field5414 * var57 + this.field5409 * var56 + this.field5398 * var53 >> 15) + this.field5416;
                    int var65 = (this.field5400 * var58 + this.field5413 * var55 + this.field5402 * var54 >> 15) + this.field5405;
                    int var66 = (this.field5401 * var58 + this.field5411 * var54 + this.field5408 * var55 >> 15) + this.field5396;
                    int var67 = (this.field5414 * var58 + this.field5409 * var55 + this.field5398 * var54 >> 15) + this.field5416;
                    for (int var68 = 0; var68 < var43.field1182; ++var68) {
                        short var69 = var43.field1180[var68];
                        short var70 = var43.field1177[var68];
                        short var71 = var43.field1176[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field1901 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field1907 || var73 > arg2.field1907 || var74 > arg2.field1907;
                            short var78 = var43.field1181[var68];
                            if (var78 != -1) {
                                if (this.method2263(this.field5407.field4358.method105(-123, var78).field7141)) {
                                    arg2.field1904 = 100;
                                }
                                arg2.method868(var75, var76, var77, var72, var73, var74, var43.field1174[var69], var43.field1174[var70], var43.field1174[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field1904 = 0;
                            } else {
                                int var79 = var43.field1186[var68];
                                if (var79 != -1) {
                                    arg2.method876(var75, var76, var77, var72, var73, var74, class284.method1776(var43.field1174[var69], var79, 126), class284.method1776(var43.field1174[var70], var79, 126), class284.method1776(var43.field1174[var71], var79, 126));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field1182; ++var80) {
                    short var81 = var43.field1180[var80];
                    short var82 = var43.field1177[var80];
                    short var83 = var43.field1176[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field1186[var80];
                        if (var90 != -1) {
                            arg2.field1901 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field1907 || var85 > arg2.field1907 || var86 > arg2.field1907;
                            arg2.method876(var87, var88, var89, var84, var85, var86, class284.method1776(var43.field1174[var81], var90, 126), class284.method1776(var43.field1174[var82], var90, 126), class284.method1776(var43.field1174[var83], var90, 126));
                        }
                    }
                }
            }
        }
    }
}
