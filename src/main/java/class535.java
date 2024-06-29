import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class535 extends class38 {

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    private int field7864 = -1;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "Lcd;")
    private class208 field7863;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "I")
    private int field7865;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "[[I")
    public int[][] field7870;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "[[B")
    private byte[][] field7860;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "[[B")
    private byte[][] field7868;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    private int field7857;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    private int field7858;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
    private int field7859;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    private int field7861;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "I")
    private int field7862;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    private int field7871;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
    private int field7872;

    @OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
    private int field7873;

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
    private int field7875;

    @OriginalMember(owner = "client!mp", name = "F", descriptor = "I")
    private int field7876;

    @OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
    private int field7877;

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
    private int field7878;

    @OriginalMember(owner = "client!mp", name = "D", descriptor = "[[Llf;")
    private class160[][] field7874;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "[[Lwb;")
    private class218[][] field7867;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "[[Lbs;")
    private class486[][] field7869;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "[[Ldi;")
    private class84[][] field7866;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7867 == null) {
            this.field7867 = new class218[super.field391][super.field394];
            this.field7866 = new class84[super.field391][super.field394];
        } else if (this.field7869 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field392 != var20 || var21 != 0 && super.field392 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class84 var22 = new class84();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1001 = var23;
            var22.field1002 = new short[var23];
            var22.field1008 = new short[var23];
            var22.field1003 = new short[var23];
            var22.field1009 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1002[var25] = (short) (this.field7860[arg0][arg1] - this.field7868[arg0][arg1]);
                } else if (var30 == 0 && super.field392 == var31) {
                    var22.field1002[var25] = (short) (this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]);
                } else if (super.field392 == var30 && super.field392 == var31) {
                    var22.field1002[var25] = (short) (this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]);
                } else if (super.field392 == var30 && var31 == 0) {
                    var22.field1002[var25] = (short) (this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]) * var30 + (this.field7860[arg0][arg1] - this.field7868[arg0][arg1]) * (super.field392 - var30);
                    int var33 = (this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]) * var30 + (this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]) * (super.field392 - var30);
                    var22.field1002[var25] = (short) ((super.field392 - var31) * var32 + var31 * var33 >> super.field387 * 2);
                }
                int var34 = (arg0 << super.field387) + var30;
                int var35 = (arg1 << super.field387) + var31;
                var22.field1008[var25] = (short) var30;
                var22.field1009[var25] = (short) var31;
                var22.field1003[var25] = (short) (this.method216(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1002[var25] < 2) {
                    var22.field1002[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field7863.field3772.method94(arg11[var28], (byte) -72).field6305) {
                    var26 = true;
                }
            }
            var22.field1010 = new int[var27];
            if (arg10 != null) {
                var22.field1000 = new int[var27];
            }
            var22.field998 = new short[var27];
            var22.field1005 = new short[var27];
            var22.field1007 = new short[var27];
            if (var26) {
                var22.field1004 = new short[var27];
                var22.field999 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1010[var22.field1006] = class412.method2517(-126, arg9[var29]);
                    } else {
                        var22.field1010[var22.field1006] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1000[var22.field1006] = class412.method2517(-119, arg10[var29]);
                        } else {
                            var22.field1000[var22.field1006] = -1;
                        }
                    }
                    var22.field998[var22.field1006] = (short) arg6[var29];
                    var22.field1005[var22.field1006] = (short) arg7[var29];
                    var22.field1007[var22.field1006] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7863.field3772.method94(arg11[var29], (byte) -72).field6305) {
                            var22.field1004[var22.field1006] = (short) arg11[var29];
                            var22.field999[var22.field1006] = (short) arg12[var29];
                        } else {
                            var22.field1004[var22.field1006] = -1;
                        }
                    }
                    ++var22.field1006;
                }
            }
            this.field7866[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class218 var36 = new class218();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2964 = class317.method1887(4, class412.method2517(-123, arg10[0]), this.field7860[arg0][arg1] - this.field7868[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field2959 = (byte) (var36.field2959 | 2);
                    }
                }
                if (this.field7870[arg0 + 1][arg1] == this.field7870[arg0][arg1] && this.field7870[arg0 + 1][arg1 + 1] == this.field7870[arg0][arg1] && this.field7870[arg0][arg1 + 1] == this.field7870[arg0][arg1]) {
                    var36.field2959 = (byte) (var36.field2959 | 1);
                }
                if (var38 != -1 && (var36.field2959 & 2) == 0 && !this.field7863.field3772.method94(var38, (byte) -72).field6305) {
                    var36.field2963 = (short) (this.field7860[arg0][arg1] - this.field7868[arg0][arg1]);
                    var36.field2961 = (short) (this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]);
                    var36.field2958 = (short) (this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]);
                    var36.field2960 = (short) (this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]);
                    var36.field2962 = (short) var38;
                } else {
                    short var39 = class412.method2517(-109, var37);
                    var36.field2963 = (short) class317.method1887(4, var39, this.field7860[arg0][arg1] - this.field7868[arg0][arg1]);
                    var36.field2961 = (short) class317.method1887(4, var39, this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]);
                    var36.field2958 = (short) class317.method1887(4, var39, this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]);
                    var36.field2960 = (short) class317.method1887(4, var39, this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]);
                    var36.field2962 = -1;
                }
                this.field7867[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method212(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!mp", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method209(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mp", name = "ua", descriptor = "(II)I")
    public final int method217(int arg0, int arg1) {
        return this.field7870[arg0][arg1];
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class382 var9 = this.field7863.method1323(Thread.currentThread());
        class441 var10 = var9.field5531;
        var10.field6394 = 0;
        var10.field6392 = false;
        if (this.field7869 != null) {
            this.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5533, var9.field5565);
        } else {
            if (this.field7867 != null) {
                this.method3174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field5533, var9.field5565);
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z")
    private final boolean method3169(int arg0) {
        if ((this.field7865 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III[[ZZ)V")
    public final void method208(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class359 var6 = this.field7863.field2742;
        this.field7864 = -1;
        this.field7862 = var6.field4885;
        this.field7872 = var6.field4878;
        this.field7875 = var6.field4884;
        this.field7861 = var6.field4883;
        this.field7876 = var6.field4879;
        this.field7878 = var6.field4875;
        this.field7871 = var6.field4880;
        this.field7858 = var6.field4877;
        this.field7857 = var6.field4876;
        this.field7877 = var6.field4882;
        this.field7859 = var6.field4881;
        this.field7873 = var6.field4874;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IILof;[I[I[I)V")
    private final void method3170(int arg0, int arg1, class441 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class218 var7 = this.field7867[arg0][arg1];
        if (var7 != null) {
            if ((var7.field2959 & 2) == 0) {
                int var8 = super.field392 * arg0;
                int var9 = super.field392 + var8;
                int var10 = super.field392 * arg1;
                int var11 = super.field392 + var10;
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
                if ((var7.field2959 & 1) != 0) {
                    int var12 = this.field7870[arg0][arg1];
                    int var16;
                    if (this.field7864 == -1) {
                        int var13 = this.field7877 * var12;
                        var14 = (this.field7859 * var10 + this.field7857 * var8 + var13 >> 15) + this.field7873;
                        if (var14 <= this.field7863.field2762) {
                            return;
                        }
                        var15 = (this.field7859 * var10 + this.field7857 * var9 + var13 >> 15) + this.field7873;
                        if (var15 <= this.field7863.field2762) {
                            return;
                        }
                        var16 = (this.field7859 * var11 + this.field7857 * var9 + var13 >> 15) + this.field7873;
                        if (var16 <= this.field7863.field2762) {
                            return;
                        }
                        var17 = (this.field7859 * var11 + this.field7857 * var8 + var13 >> 15) + this.field7873;
                        if (var17 <= this.field7863.field2762) {
                            return;
                        }
                    } else {
                        var17 = this.field7864;
                        var16 = this.field7864;
                        var15 = this.field7864;
                        var14 = this.field7864;
                    }
                    int var18 = this.field7872 * var12;
                    int var19 = this.field7878 * var12;
                    var20 = (this.field7875 * var10 + this.field7862 * var8 + var18 >> 15) + this.field7861;
                    var21 = this.field7863.field2782 * var20 / var14 + arg2.field6403;
                    var22 = (this.field7871 * var10 + this.field7876 * var8 + var19 >> 15) + this.field7858;
                    var23 = this.field7863.field2754 * var22 / var14 + arg2.field6395;
                    var24 = (this.field7875 * var10 + this.field7862 * var9 + var18 >> 15) + this.field7861;
                    var25 = this.field7863.field2782 * var24 / var15 + arg2.field6403;
                    var26 = (this.field7871 * var10 + this.field7876 * var9 + var19 >> 15) + this.field7858;
                    var27 = this.field7863.field2754 * var26 / var15 + arg2.field6395;
                    int var28 = (this.field7875 * var11 + this.field7862 * var9 + var18 >> 15) + this.field7861;
                    var29 = this.field7863.field2782 * var28 / var16 + arg2.field6403;
                    int var30 = (this.field7871 * var11 + this.field7876 * var9 + var19 >> 15) + this.field7858;
                    var31 = this.field7863.field2754 * var30 / var16 + arg2.field6395;
                    var32 = (this.field7875 * var11 + this.field7862 * var8 + var18 >> 15) + this.field7861;
                    var33 = this.field7863.field2782 * var32 / var17 + arg2.field6403;
                    var34 = (this.field7871 * var11 + this.field7876 * var8 + var19 >> 15) + this.field7858;
                    var35 = this.field7863.field2754 * var34 / var17 + arg2.field6395;
                } else {
                    int var36 = this.field7870[arg0][arg1];
                    int var37 = this.field7870[arg0 + 1][arg1];
                    int var38 = this.field7870[arg0 + 1][arg1 + 1];
                    int var39 = this.field7870[arg0][arg1 + 1];
                    int var40;
                    if (this.field7864 == -1) {
                        var14 = (this.field7859 * var10 + this.field7877 * var36 + this.field7857 * var8 >> 15) + this.field7873;
                        if (var14 <= this.field7863.field2762) {
                            return;
                        }
                        var15 = (this.field7859 * var10 + this.field7877 * var37 + this.field7857 * var9 >> 15) + this.field7873;
                        if (var15 <= this.field7863.field2762) {
                            return;
                        }
                        var40 = (this.field7859 * var11 + this.field7877 * var38 + this.field7857 * var9 >> 15) + this.field7873;
                        if (var40 <= this.field7863.field2762) {
                            return;
                        }
                        var17 = (this.field7859 * var11 + this.field7877 * var39 + this.field7857 * var8 >> 15) + this.field7873;
                        if (var17 <= this.field7863.field2762) {
                            return;
                        }
                    } else {
                        var17 = this.field7864;
                        var40 = this.field7864;
                        var15 = this.field7864;
                        var14 = this.field7864;
                    }
                    var20 = (this.field7875 * var10 + this.field7872 * var36 + this.field7862 * var8 >> 15) + this.field7861;
                    var21 = this.field7863.field2782 * var20 / var14 + arg2.field6403;
                    var22 = (this.field7871 * var10 + this.field7878 * var36 + this.field7876 * var8 >> 15) + this.field7858;
                    var23 = this.field7863.field2754 * var22 / var14 + arg2.field6395;
                    var24 = (this.field7875 * var10 + this.field7872 * var37 + this.field7862 * var9 >> 15) + this.field7861;
                    var25 = this.field7863.field2782 * var24 / var15 + arg2.field6403;
                    var26 = (this.field7871 * var10 + this.field7878 * var37 + this.field7876 * var9 >> 15) + this.field7858;
                    var27 = this.field7863.field2754 * var26 / var15 + arg2.field6395;
                    int var41 = (this.field7875 * var11 + this.field7872 * var38 + this.field7862 * var9 >> 15) + this.field7861;
                    var29 = this.field7863.field2782 * var41 / var40 + arg2.field6403;
                    int var42 = (this.field7871 * var11 + this.field7878 * var38 + this.field7876 * var9 >> 15) + this.field7858;
                    var31 = this.field7863.field2754 * var42 / var40 + arg2.field6395;
                    var32 = (this.field7875 * var11 + this.field7872 * var39 + this.field7862 * var8 >> 15) + this.field7861;
                    var33 = this.field7863.field2782 * var32 / var17 + arg2.field6403;
                    var34 = (this.field7871 * var11 + this.field7878 * var39 + this.field7876 * var8 >> 15) + this.field7858;
                    var35 = this.field7863.field2754 * var34 / var17 + arg2.field6395;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6392 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6401 || var33 > arg2.field6401 || var25 > arg2.field6401;
                    if (var7.field2962 >= 0) {
                        if (this.method3169(this.field7863.field3772.method94(var7.field2962, (byte) -72).field6320)) {
                            arg2.field6394 = 100;
                        }
                        arg2.method2711(var31, var35, var27, var29, var33, var25, var7.field2958 & 65535, var7.field2960 & 65535, var7.field2961 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2962);
                        arg2.field6394 = 0;
                    } else {
                        arg2.method2702(var31, var35, var27, var29, var33, var25, var7.field2958 & 65535, var7.field2960 & 65535, var7.field2961 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6392 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6401 || var25 > arg2.field6401 || var33 > arg2.field6401;
                    if (var7.field2962 >= 0) {
                        if (this.method3169(this.field7863.field3772.method94(var7.field2962, (byte) -72).field6320)) {
                            arg2.field6394 = 100;
                        }
                        arg2.method2711(var23, var27, var35, var21, var25, var33, var7.field2963 & 65535, var7.field2961 & 65535, var7.field2960 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field2962);
                        arg2.field6394 = 0;
                        return;
                    }
                    arg2.method2702(var23, var27, var35, var21, var25, var33, var7.field2963 & 65535, var7.field2961 & 65535, var7.field2960 & 65535);
                }
            }
        } else {
            class84 var43 = this.field7866[arg0][arg1];
            if (var43 != null) {
                if (this.field7864 == -1) {
                    for (int var44 = 0; var44 < var43.field1001; ++var44) {
                        int var45 = (arg0 << super.field387) + var43.field1008[var44];
                        short var46 = var43.field1003[var44];
                        int var47 = (arg1 << super.field387) + var43.field1009[var44];
                        int var48 = (this.field7859 * var47 + this.field7877 * var46 + this.field7857 * var45 >> 15) + this.field7873;
                        if (var48 <= this.field7863.field2762) {
                            return;
                        }
                        int var49 = (this.field7875 * var47 + this.field7872 * var46 + this.field7862 * var45 >> 15) + this.field7861;
                        int var50 = (this.field7871 * var47 + this.field7878 * var46 + this.field7876 * var45 >> 15) + this.field7858;
                        arg3[var44] = this.field7863.field2782 * var49 / var48 + arg2.field6403;
                        arg4[var44] = this.field7863.field2754 * var50 / var48 + arg2.field6395;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field1001; ++var51) {
                        int var91 = (arg0 << super.field387) + var43.field1008[var51];
                        short var92 = var43.field1003[var51];
                        int var93 = (arg1 << super.field387) + var43.field1009[var51];
                        int var94 = (this.field7875 * var93 + this.field7872 * var92 + this.field7862 * var91 >> 15) + this.field7861;
                        int var95 = (this.field7871 * var93 + this.field7878 * var92 + this.field7876 * var91 >> 15) + this.field7858;
                        arg3[var51] = this.field7863.field2782 * var94 / this.field7864 + arg2.field6403;
                        arg4[var51] = this.field7863.field2754 * var95 / this.field7864 + arg2.field6395;
                    }
                }
                if (var43.field1004 != null) {
                    int var52 = this.field7870[arg0][arg1];
                    int var53 = this.field7870[arg0 + 1][arg1];
                    int var54 = this.field7870[arg0][arg1 + 1];
                    int var55 = super.field392 * arg0;
                    int var56 = super.field392 + var55;
                    int var57 = super.field392 * arg1;
                    int var58 = super.field392 + var57;
                    int var59 = (this.field7875 * var57 + this.field7872 * var52 + this.field7862 * var55 >> 15) + this.field7861;
                    int var60 = (this.field7871 * var57 + this.field7878 * var52 + this.field7876 * var55 >> 15) + this.field7858;
                    int var61 = (this.field7859 * var57 + this.field7877 * var52 + this.field7857 * var55 >> 15) + this.field7873;
                    int var62 = (this.field7875 * var57 + this.field7872 * var53 + this.field7862 * var56 >> 15) + this.field7861;
                    int var63 = (this.field7871 * var57 + this.field7878 * var53 + this.field7876 * var56 >> 15) + this.field7858;
                    int var64 = (this.field7859 * var57 + this.field7877 * var53 + this.field7857 * var56 >> 15) + this.field7873;
                    int var65 = (this.field7875 * var58 + this.field7872 * var54 + this.field7862 * var55 >> 15) + this.field7861;
                    int var66 = (this.field7871 * var58 + this.field7878 * var54 + this.field7876 * var55 >> 15) + this.field7858;
                    int var67 = (this.field7859 * var58 + this.field7877 * var54 + this.field7857 * var55 >> 15) + this.field7873;
                    for (int var68 = 0; var68 < var43.field1006; ++var68) {
                        short var69 = var43.field998[var68];
                        short var70 = var43.field1005[var68];
                        short var71 = var43.field1007[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field6392 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field6401 || var73 > arg2.field6401 || var74 > arg2.field6401;
                            short var78 = var43.field1004[var68];
                            if (var78 != -1) {
                                if (this.method3169(this.field7863.field3772.method94(var78, (byte) -72).field6320)) {
                                    arg2.field6394 = 100;
                                }
                                arg2.method2711(var75, var76, var77, var72, var73, var74, var43.field1002[var69], var43.field1002[var70], var43.field1002[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field6394 = 0;
                            } else {
                                int var79 = var43.field1010[var68];
                                if (var79 != -1) {
                                    arg2.method2702(var75, var76, var77, var72, var73, var74, class317.method1887(4, var79, var43.field1002[var69]), class317.method1887(4, var79, var43.field1002[var70]), class317.method1887(4, var79, var43.field1002[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field1006; ++var80) {
                    short var81 = var43.field998[var80];
                    short var82 = var43.field1005[var80];
                    short var83 = var43.field1007[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field1010[var80];
                        if (var90 != -1) {
                            arg2.field6392 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field6401 || var85 > arg2.field6401 || var86 > arg2.field6401;
                            arg2.method2702(var87, var88, var89, var84, var85, var86, class317.method1887(4, var90, var43.field1002[var81]), class317.method1887(4, var90, var43.field1002[var82]), class317.method1887(4, var90, var43.field1002[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "ca", descriptor = "(II)I")
    public final int method216(int arg0, int arg1) {
        int var3 = arg0 >> super.field387;
        int var4 = arg1 >> super.field387;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field391 - 1 && var4 <= super.field394 - 1) {
            int var5 = arg0 & super.field392 - 1;
            int var6 = arg1 & super.field392 - 1;
            int var7 = (super.field392 - var5) * this.field7870[var3][var4] + this.field7870[var3 + 1][var4] * var5 >> super.field387;
            int var8 = (super.field392 - var5) * this.field7870[var3][var4 + 1] + this.field7870[var3 + 1][var4 + 1] * var5 >> super.field387;
            return (super.field392 - var6) * var7 + var6 * var8 >> super.field387;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method214(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!mp", name = "aa", descriptor = "()V")
    public final void method206() {
        this.field7860 = null;
        this.field7868 = null;
    }

    @OriginalMember(owner = "client!mp", name = "OA", descriptor = "(IILi;)Li;")
    public final class31 method221(int arg0, int arg1, class31 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lbn;[I)V")
    public final void method215(class309 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!mp", name = "qa", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        if (this.field7868[arg0][arg1] < arg2) {
            this.field7868[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)I")
    private static final int method3171(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIZLof;[I[I[I)V")
    private final void method3172(int arg0, int arg1, boolean arg2, class441 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class486 var8 = this.field7869[arg0][arg1];
        if (var8 != null) {
            if ((var8.field7153 & 2) == 0) {
                int var9 = super.field392 * arg0;
                int var10 = super.field392 + var9;
                int var11 = super.field392 * arg1;
                int var12 = super.field392 + var11;
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
                if ((var8.field7153 & 1) != 0 && !arg2) {
                    int var17 = this.field7870[arg0][arg1];
                    if (this.field7864 == -1) {
                        int var18 = this.field7877 * var17;
                        var19 = (this.field7859 * var11 + this.field7857 * var9 + var18 >> 15) + this.field7873;
                        if (var19 <= this.field7863.field2762) {
                            return;
                        }
                        var20 = (this.field7859 * var11 + this.field7857 * var10 + var18 >> 15) + this.field7873;
                        if (var20 <= this.field7863.field2762) {
                            return;
                        }
                        var21 = (this.field7859 * var12 + this.field7857 * var10 + var18 >> 15) + this.field7873;
                        if (var21 <= this.field7863.field2762) {
                            return;
                        }
                        var22 = (this.field7859 * var12 + this.field7857 * var9 + var18 >> 15) + this.field7873;
                        if (var22 <= this.field7863.field2762) {
                            return;
                        }
                    } else {
                        var22 = this.field7864;
                        var21 = this.field7864;
                        var20 = this.field7864;
                        var19 = this.field7864;
                    }
                    if (this.field7863.field2751) {
                        int var23 = var19 - this.field7863.field2774;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field7863.field2774;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field7863.field2774;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field7863.field2774;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field7872 * var17;
                    int var28 = this.field7878 * var17;
                    var29 = (this.field7875 * var11 + this.field7862 * var9 + var27 >> 15) + this.field7861;
                    var30 = this.field7863.field2782 * var29 / var19 + arg3.field6403;
                    var31 = (this.field7871 * var11 + this.field7876 * var9 + var28 >> 15) + this.field7858;
                    var32 = this.field7863.field2754 * var31 / var19 + arg3.field6395;
                    var33 = (this.field7875 * var11 + this.field7862 * var10 + var27 >> 15) + this.field7861;
                    var34 = this.field7863.field2782 * var33 / var20 + arg3.field6403;
                    var35 = (this.field7871 * var11 + this.field7876 * var10 + var28 >> 15) + this.field7858;
                    var36 = this.field7863.field2754 * var35 / var20 + arg3.field6395;
                    var37 = (this.field7875 * var12 + this.field7862 * var10 + var27 >> 15) + this.field7861;
                    var38 = this.field7863.field2782 * var37 / var21 + arg3.field6403;
                    var39 = (this.field7871 * var12 + this.field7876 * var10 + var28 >> 15) + this.field7858;
                    var40 = this.field7863.field2754 * var39 / var21 + arg3.field6395;
                    var41 = (this.field7875 * var12 + this.field7862 * var9 + var27 >> 15) + this.field7861;
                    var42 = this.field7863.field2782 * var41 / var22 + arg3.field6403;
                    var43 = (this.field7871 * var12 + this.field7876 * var9 + var28 >> 15) + this.field7858;
                    var44 = this.field7863.field2754 * var43 / var22 + arg3.field6395;
                } else {
                    int var45 = this.field7870[arg0][arg1];
                    int var46 = this.field7870[arg0 + 1][arg1];
                    int var47 = this.field7870[arg0 + 1][arg1 + 1];
                    int var48 = this.field7870[arg0][arg1 + 1];
                    if (this.field7864 == -1) {
                        var19 = (this.field7859 * var11 + this.field7877 * var45 + this.field7857 * var9 >> 15) + this.field7873;
                        if (var19 <= this.field7863.field2762) {
                            return;
                        }
                        var20 = (this.field7859 * var11 + this.field7877 * var46 + this.field7857 * var10 >> 15) + this.field7873;
                        if (var20 <= this.field7863.field2762) {
                            return;
                        }
                        var21 = (this.field7859 * var12 + this.field7877 * var47 + this.field7857 * var10 >> 15) + this.field7873;
                        if (var21 <= this.field7863.field2762) {
                            return;
                        }
                        var22 = (this.field7859 * var12 + this.field7877 * var48 + this.field7857 * var9 >> 15) + this.field7873;
                        if (var22 <= this.field7863.field2762) {
                            return;
                        }
                    } else {
                        var22 = this.field7864;
                        var21 = this.field7864;
                        var20 = this.field7864;
                        var19 = this.field7864;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field7863.field2774;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field7146 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field7863.field2774;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field7147 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field7863.field2774;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field7145 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field7863.field2774;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field7144 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field7863.field2751) {
                        int var57 = var19 - this.field7863.field2774;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field7863.field2774;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field7863.field2774;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field7863.field2774;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field7875 * var11 + this.field7872 * var45 + this.field7862 * var9 >> 15) + this.field7861;
                    var30 = this.field7863.field2782 * var29 / var19 + arg3.field6403;
                    var31 = (this.field7871 * var11 + this.field7878 * var45 + this.field7876 * var9 >> 15) + this.field7858;
                    var32 = this.field7863.field2754 * var31 / var19 + arg3.field6395;
                    var33 = (this.field7875 * var11 + this.field7872 * var46 + this.field7862 * var10 >> 15) + this.field7861;
                    var34 = this.field7863.field2782 * var33 / var20 + arg3.field6403;
                    var35 = (this.field7871 * var11 + this.field7878 * var46 + this.field7876 * var10 >> 15) + this.field7858;
                    var36 = this.field7863.field2754 * var35 / var20 + arg3.field6395;
                    var37 = (this.field7875 * var12 + this.field7872 * var47 + this.field7862 * var10 >> 15) + this.field7861;
                    var38 = this.field7863.field2782 * var37 / var21 + arg3.field6403;
                    var39 = (this.field7871 * var12 + this.field7878 * var47 + this.field7876 * var10 >> 15) + this.field7858;
                    var40 = this.field7863.field2754 * var39 / var21 + arg3.field6395;
                    var41 = (this.field7875 * var12 + this.field7872 * var48 + this.field7862 * var9 >> 15) + this.field7861;
                    var42 = this.field7863.field2782 * var41 / var22 + arg3.field6403;
                    var43 = (this.field7871 * var12 + this.field7878 * var48 + this.field7876 * var9 >> 15) + this.field7858;
                    var44 = this.field7863.field2754 * var43 / var22 + arg3.field6395;
                }
                boolean var61 = var8.field7151 != -1 && this.method3169(this.field7863.field3772.method94(var8.field7151, (byte) -72).field6320);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6392 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6401 || var42 > arg3.field6401 || var34 > arg3.field6401;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6394 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field7151 >= 0) {
                                arg3.method2705(var40, var44, var36, var38, var42, var34, this.field7863.field2763, var15, var16, var14, var8.field7150, var8.field7154, var8.field7149, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field7151);
                            } else {
                                arg3.method2703(var40, var44, var36, var38, var42, var34, class34.method190(var8.field7150, (byte) -112, var15 << 24 | this.field7863.field2763), class34.method190(var8.field7154, (byte) -123, var16 << 24 | this.field7863.field2763), class34.method190(var8.field7149, (byte) -115, var14 << 24 | this.field7863.field2763));
                            }
                        } else if (var8.field7151 >= 0) {
                            arg3.method2711(var40, var44, var36, var38, var42, var34, var8.field7150, var8.field7154, var8.field7149, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field7151);
                        } else {
                            arg3.method2703(var40, var44, var36, var38, var42, var34, var8.field7150, var8.field7154, var8.field7149);
                        }
                        arg3.field6394 = 0;
                    } else {
                        arg3.method2706(var40, var44, var36, var38, var42, var34, this.field7863.field2763);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6392 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6401 || var34 > arg3.field6401 || var42 > arg3.field6401;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6394 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field7151 >= 0) {
                                arg3.method2705(var32, var36, var44, var30, var34, var42, this.field7863.field2763, var13, var14, var16, var8.field7152, var8.field7149, var8.field7154, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field7151);
                            } else {
                                arg3.method2703(var32, var36, var44, var30, var34, var42, class34.method190(var8.field7152, (byte) -111, var13 << 24 | this.field7863.field2763), class34.method190(var8.field7149, (byte) -114, var14 << 24 | this.field7863.field2763), class34.method190(var8.field7154, (byte) -89, var16 << 24 | this.field7863.field2763));
                            }
                        } else if (var8.field7151 >= 0) {
                            arg3.method2711(var32, var36, var44, var30, var34, var42, var8.field7152, var8.field7149, var8.field7154, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field7151);
                        } else {
                            arg3.method2703(var32, var36, var44, var30, var34, var42, var8.field7152, var8.field7149, var8.field7154);
                        }
                        arg3.field6394 = 0;
                        return;
                    }
                    arg3.method2706(var32, var36, var44, var30, var34, var42, this.field7863.field2763);
                }
            }
        } else {
            class160 var64 = this.field7874[arg0][arg1];
            if (var64 != null) {
                if (this.field7864 == -1) {
                    for (int var65 = 0; var65 < var64.field2082; ++var65) {
                        int var66 = (arg0 << super.field387) + var64.field2078[var65];
                        int var67 = var64.field2085[var65];
                        int var68 = (arg1 << super.field387) + var64.field2081[var65];
                        int var69 = (this.field7859 * var68 + this.field7877 * var67 + this.field7857 * var66 >> 15) + this.field7873;
                        if (var69 <= this.field7863.field2762) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field7863.field2774;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field2080[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field7863.field2751) {
                            int var72 = var69 - this.field7863.field2774;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field7875 * var68 + this.field7872 * var67 + this.field7862 * var66 >> 15) + this.field7861;
                        int var74 = (this.field7871 * var68 + this.field7878 * var67 + this.field7876 * var66 >> 15) + this.field7858;
                        arg4[var65] = this.field7863.field2782 * var73 / var69 + arg3.field6403;
                        arg5[var65] = this.field7863.field2754 * var74 / var69 + arg3.field6395;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field2082; ++var75) {
                        int var115 = (arg0 << super.field387) + var64.field2078[var75];
                        int var116 = var64.field2085[var75];
                        int var117 = (arg1 << super.field387) + var64.field2081[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field7864 - this.field7863.field2774;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field2080[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field7863.field2751) {
                            int var120 = this.field7864 - this.field7863.field2774;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field7875 * var117 + this.field7872 * var116 + this.field7862 * var115 >> 15) + this.field7861;
                        int var122 = (this.field7871 * var117 + this.field7878 * var116 + this.field7876 * var115 >> 15) + this.field7858;
                        arg4[var75] = this.field7863.field2782 * var121 / this.field7864 + arg3.field6403;
                        arg5[var75] = this.field7863.field2754 * var122 / this.field7864 + arg3.field6395;
                    }
                }
                if (var64.field2086 != null) {
                    int var76 = this.field7870[arg0][arg1];
                    int var77 = this.field7870[arg0 + 1][arg1];
                    int var78 = this.field7870[arg0][arg1 + 1];
                    int var79 = super.field392 * arg0;
                    int var80 = super.field392 + var79;
                    int var81 = super.field392 * arg1;
                    int var82 = super.field392 + var81;
                    int var83 = (this.field7875 * var81 + this.field7872 * var76 + this.field7862 * var79 >> 15) + this.field7861;
                    int var84 = (this.field7871 * var81 + this.field7878 * var76 + this.field7876 * var79 >> 15) + this.field7858;
                    int var85 = (this.field7859 * var81 + this.field7877 * var76 + this.field7857 * var79 >> 15) + this.field7873;
                    int var86 = (this.field7875 * var81 + this.field7872 * var77 + this.field7862 * var80 >> 15) + this.field7861;
                    int var87 = (this.field7871 * var81 + this.field7878 * var77 + this.field7876 * var80 >> 15) + this.field7858;
                    int var88 = (this.field7859 * var81 + this.field7877 * var77 + this.field7857 * var80 >> 15) + this.field7873;
                    int var89 = (this.field7875 * var82 + this.field7872 * var78 + this.field7862 * var79 >> 15) + this.field7861;
                    int var90 = (this.field7871 * var82 + this.field7878 * var78 + this.field7876 * var79 >> 15) + this.field7858;
                    int var91 = (this.field7859 * var82 + this.field7877 * var78 + this.field7857 * var79 >> 15) + this.field7873;
                    for (int var92 = 0; var92 < var64.field2084; ++var92) {
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
                            arg3.field6392 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field6401 || var97 > arg3.field6401 || var98 > arg3.field6401;
                            short var103 = var64.field2086[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method3169(this.field7863.field3772.method94(var103, (byte) -72).field6320)) {
                                    arg3.field6394 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2705(var99, var100, var101, var96, var97, var98, this.field7863.field2763, arg6[var93], arg6[var94], arg6[var95], var64.field2083[var93], var64.field2083[var94], var64.field2083[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field2083[var93] & 16777215) != 0) {
                                        arg3.method2703(var99, var100, var101, var96, var97, var98, class34.method190(var64.field2083[var93], (byte) -122, arg6[var93] << 24 | this.field7863.field2763), class34.method190(var64.field2083[var94], (byte) -120, arg6[var94] << 24 | this.field7863.field2763), class34.method190(var64.field2083[var95], (byte) -97, arg6[var95] << 24 | this.field7863.field2763));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2711(var99, var100, var101, var96, var97, var98, var64.field2083[var93], var64.field2083[var94], var64.field2083[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field2083[var93] & 16777215) != 0) {
                                    arg3.method2703(var99, var100, var101, var96, var97, var98, var64.field2083[var93], var64.field2083[var94], var64.field2083[var95]);
                                }
                                arg3.field6394 = 0;
                            } else {
                                arg3.method2706(var99, var100, var101, var96, var97, var98, this.field7863.field2763);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field2084; ++var104) {
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
                        arg3.field6392 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field6401 || var109 > arg3.field6401 || var110 > arg3.field6401;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field2083[var105] & 16777215) != 0) {
                                    arg3.method2703(var111, var112, var113, var108, var109, var110, class96.method543(var64.field2083[var105], this.field7863.field2763, arg6[var105], -9499), class96.method543(var64.field2083[var106], this.field7863.field2763, arg6[var106], -9499), class96.method543(var64.field2083[var107], this.field7863.field2763, arg6[var107], -9499));
                                }
                            } else if ((var64.field2083[var105] & 16777215) != 0) {
                                arg3.method2703(var111, var112, var113, var108, var109, var110, var64.field2083[var105], var64.field2083[var106], var64.field2083[var107]);
                            }
                        } else {
                            arg3.method2706(var111, var112, var113, var108, var109, var110, this.field7863.field2763);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method207(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field7869 == null) {
            this.field7869 = new class486[super.field391][super.field394];
            this.field7874 = new class160[super.field391][super.field394];
        } else if (this.field7867 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class445.field6483[class412.method2517(-109, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class445.field6483[class412.method2517(-120, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field392 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field392 && arg4[var22] == super.field392) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field392) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field392 != arg2[var24] && arg2[0] - super.field392 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field392 != arg4[var24] && arg4[0] - super.field392 != arg4[var24]) {
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
                class486 var25 = new class486();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field7148 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field7153 = (byte) (var25.field7153 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field7870[arg0 + 1][arg1] == this.field7870[arg0][arg1] && this.field7870[arg0 + 1][arg1 + 1] == this.field7870[arg0][arg1] && this.field7870[arg0][arg1 + 1] == this.field7870[arg0][arg1]) {
                    var25.field7153 = (byte) (var25.field7153 | 1);
                }
                if (var27 != -1 && (var25.field7153 & 2) == 0 && !this.field7863.field3772.method94(var27, (byte) -72).field6305) {
                    var25.field7152 = this.field7860[arg0][arg1] - this.field7868[arg0][arg1];
                    var25.field7149 = this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1];
                    var25.field7150 = this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1];
                    var25.field7154 = this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1];
                    var25.field7151 = (short) var27;
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
                    var25.field7152 = class96.method543(method3171(arg6[var18] >> 8, this.field7860[arg0][arg1] - this.field7868[arg0][arg1]), arg10, var28, -9499);
                    if (var25.field7148 != 0) {
                        var25.field7152 |= 255 - (this.field7860[arg0][arg1] - this.field7868[arg0][arg1]) << 25;
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
                    var25.field7149 = class96.method543(method3171(arg6[var19] >> 8, this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]), arg10, var29, -9499);
                    if (var25.field7148 != 0) {
                        var25.field7149 |= 255 - (this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]) << 25;
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
                    var25.field7150 = class96.method543(method3171(arg6[var20] >> 8, this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]), arg10, var30, -9499);
                    if (var25.field7148 != 0) {
                        var25.field7150 |= 255 - (this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field7154 = class96.method543(method3171(arg6[var21] >> 8, this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]), arg10, var31, -9499);
                    if (var25.field7148 != 0) {
                        var25.field7154 |= 255 - (this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]) << 25;
                    }
                    var25.field7151 = -1;
                }
                if (arg5 != null) {
                    var25.field7145 = (short) arg5[var20];
                    var25.field7144 = (short) arg5[var21];
                    var25.field7147 = (short) arg5[var19];
                    var25.field7146 = (short) arg5[var18];
                }
                this.field7869[arg0][arg1] = var25;
            } else {
                class160 var32 = new class160();
                var32.field2082 = (short) arg2.length;
                var32.field2084 = (short) (arg2.length / 3);
                var32.field2078 = new short[var32.field2082];
                var32.field2085 = new short[var32.field2082];
                var32.field2081 = new short[var32.field2082];
                var32.field2083 = new int[var32.field2082];
                if (arg5 != null) {
                    var32.field2080 = new short[var32.field2082];
                }
                for (int var33 = 0; var33 < var32.field2082; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field7860[arg0][arg1] - this.field7868[arg0][arg1];
                    } else if (var48 == 0 && super.field392 == var49) {
                        var51 = this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1];
                    } else if (super.field392 == var48 && super.field392 == var49) {
                        var51 = this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1];
                    } else if (super.field392 == var48 && var49 == 0) {
                        var51 = this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field7860[arg0 + 1][arg1] - this.field7868[arg0 + 1][arg1]) * var48 + (this.field7860[arg0][arg1] - this.field7868[arg0][arg1]) * (super.field392 - var48);
                        int var53 = (this.field7860[arg0 + 1][arg1 + 1] - this.field7868[arg0 + 1][arg1 + 1]) * var48 + (this.field7860[arg0][arg1 + 1] - this.field7868[arg0][arg1 + 1]) * (super.field392 - var48);
                        var51 = (super.field392 - var49) * var52 + var49 * var53 >> super.field387 * 2;
                    }
                    int var54 = (arg0 << super.field387) + var48;
                    int var55 = (arg1 << super.field387) + var49;
                    var32.field2078[var33] = (short) var48;
                    var32.field2081[var33] = (short) var49;
                    var32.field2085[var33] = (short) (this.method216(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field7863.field3772.method94(arg8[var33], (byte) -72).field6305) {
                        var32.field2083[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field2083[var33] = var51 << 25;
                        } else {
                            var32.field2083[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field2080[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field2083[var33] = class96.method543(method3171(arg6[var33] >> 8, var51), arg10, var56, -9499);
                        if (arg7 != null) {
                            var32.field2083[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field2084; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field7863.field3772.method94(arg8[var35 * 3], (byte) -72).field6305) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field2077 = new int[var32.field2084];
                }
                if (var34) {
                    var32.field2086 = new short[var32.field2084];
                    var32.field2079 = new short[var32.field2084];
                }
                for (int var36 = 0; var36 < var32.field2084; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field2077[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field7863.field3772.method94(var42, (byte) -72).field6305) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field7863.field3772.method94(var43, (byte) -72).field6305) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field7863.field3772.method94(var44, (byte) -72).field6305) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field2086[var36] = (short) var44;
                            var32.field2079[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field7863.field3772.method94(var45, (byte) -72).field6305) {
                                    var32.field2083[var37] = class445.field6483[class412.method2517(-117, this.field7863.field3772.method94(var45, (byte) -72).field6309 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field7863.field3772.method94(var46, (byte) -72).field6305) {
                                    var32.field2083[var38] = class445.field6483[class412.method2517(-121, this.field7863.field3772.method94(var46, (byte) -72).field6309 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field7863.field3772.method94(var47, (byte) -72).field6305) {
                                    var32.field2083[var39] = class445.field6483[class412.method2517(-128, this.field7863.field3772.method94(var47, (byte) -72).field6309 & 65535) & 65535];
                                }
                            }
                            var32.field2086[var36] = -1;
                        }
                    }
                }
                this.field7874[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lcd;IIII[[I[[II)V")
    public class535(class208 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7863 = arg0;
        this.field7865 = arg2;
        this.field7870 = arg5;
        this.field7860 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7863.field2769 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7863.field2748 * var18 + this.field7863.field2775 * var16 + this.field7863.field2765 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7860[var11][var10] = (byte) var20;
            }
        }
        this.field7868 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIII[[ZLof;[I[I)V")
    private final void method3173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class441 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6400 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field7869[var16][var17] != null) {
                        class486 var18 = this.field7869[var16][var17];
                        if (var18.field7151 != -1 && (var18.field7153 & 2) == 0 && var18.field7148 == 0) {
                            int var19 = this.field7863.method1324(var18.field7151);
                            arg8.method2702(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class317.method1887(4, var19, var18.field7150), class317.method1887(4, var19, var18.field7154), class317.method1887(4, var19, var18.field7149));
                            arg8.method2702(var15, var15, var15 - var13, var14, var13 + var14, var14, class317.method1887(4, var19, var18.field7152), class317.method1887(4, var19, var18.field7149), class317.method1887(4, var19, var18.field7154));
                        } else if (var18.field7148 == 0) {
                            arg8.method2703(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field7150, var18.field7154, var18.field7149);
                            arg8.method2703(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field7152, var18.field7149, var18.field7154);
                        } else {
                            int var20 = var18.field7148;
                            arg8.method2703(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class34.method190(var20, (byte) -108, var18.field7150 & -16777216), class34.method190(var20, (byte) -114, var18.field7154 & -16777216), class34.method190(var20, (byte) -90, var18.field7149 & -16777216));
                            arg8.method2703(var15, var15, var15 - var13, var14, var13 + var14, var14, class34.method190(var20, (byte) -111, var18.field7152 & -16777216), class34.method190(var20, (byte) -123, var18.field7149 & -16777216), class34.method190(var20, (byte) -105, var18.field7154 & -16777216));
                        }
                    } else if (this.field7874[var16][var17] != null) {
                        class160 var21 = this.field7874[var16][var17];
                        for (int var22 = 0; var22 < var21.field2082; ++var22) {
                            arg9[var22] = var21.field2078[var22] * var13 / super.field392 + var14;
                            arg10[var22] = var15 - var21.field2081[var22] * var13 / super.field392;
                        }
                        for (int var23 = 0; var23 < var21.field2084; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2077 == null || var21.field2077[var23] == 0 || var21.field2086 != null && (var21.field2086 == null || var21.field2086[var23] != -1)) {
                                if (var21.field2086 != null && var21.field2086[var23] != -1) {
                                    int var34 = this.field7863.method1324(var21.field2086[var23]);
                                    arg8.method2702(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2703(var30, var31, var32, var27, var28, var29, var21.field2083[var24], var21.field2083[var25], var21.field2083[var26]);
                                }
                            } else {
                                int var33 = var21.field2077[var23];
                                arg8.method2703(var30, var31, var32, var27, var28, var29, class34.method190(var33, (byte) -99, -16777216 - (var21.field2083[var24] & -16777216)), class34.method190(var33, (byte) -82, -16777216 - (var21.field2083[var25] & -16777216)), class34.method190(var33, (byte) -110, -16777216 - (var21.field2083[var26] & -16777216)));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6400 = true;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(IIIIIII[[ZLof;[I[I)V")
    private final void method3174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class441 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6400 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field7867[var16][var17] != null) {
                        class218 var18 = this.field7867[var16][var17];
                        if (var18.field2962 != -1 && (var18.field2959 & 2) == 0 && var18.field2964 == -1) {
                            int var19 = this.field7863.method1324(var18.field2962);
                            arg8.method2702(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class317.method1887(4, var19, var18.field2958 & 65535), class317.method1887(4, var19, var18.field2960 & 65535), class317.method1887(4, var19, var18.field2961 & 65535));
                            arg8.method2702(var15, var15, var15 - var13, var14, var13 + var14, var14, class317.method1887(4, var19, var18.field2963 & 65535), class317.method1887(4, var19, var18.field2961 & 65535), class317.method1887(4, var19, var18.field2960 & 65535));
                        } else if (var18.field2964 == -1) {
                            arg8.method2702(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field2958 & 65535, var18.field2960 & 65535, var18.field2961 & 65535);
                            arg8.method2702(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field2963 & 65535, var18.field2961 & 65535, var18.field2960 & 65535);
                        } else {
                            int var20 = var18.field2964;
                            arg8.method2702(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2702(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field7866[var16][var17] != null) {
                        class84 var21 = this.field7866[var16][var17];
                        for (int var22 = 0; var22 < var21.field1001; ++var22) {
                            arg9[var22] = var21.field1008[var22] * var13 / super.field392 + var14;
                            arg10[var22] = var15 - var21.field1009[var22] * var13 / super.field392;
                        }
                        for (int var23 = 0; var23 < var21.field1006; ++var23) {
                            short var24 = var21.field998[var23];
                            short var25 = var21.field1005[var23];
                            short var26 = var21.field1007[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1000 != null && var21.field1000[var23] != -1) {
                                int var33 = var21.field1000[var23];
                                arg8.method2702(var30, var31, var32, var27, var28, var29, class317.method1887(4, var33, var21.field1002[var24]), class317.method1887(4, var33, var21.field1002[var25]), class317.method1887(4, var33, var21.field1002[var26]));
                            } else if (var21.field1004 != null && var21.field1004[var23] != -1) {
                                int var34 = this.field7863.method1324(var21.field1004[var23]);
                                arg8.method2702(var30, var31, var32, var27, var28, var29, class317.method1887(4, var34, var21.field1002[var24]), class317.method1887(4, var34, var21.field1002[var25]), class317.method1887(4, var34, var21.field1002[var26]));
                            } else {
                                int var35 = var21.field1010[var23];
                                arg8.method2702(var30, var31, var32, var27, var28, var29, class317.method1887(4, var35, var21.field1002[var24]), class317.method1887(4, var35, var21.field1002[var25]), class317.method1887(4, var35, var21.field1002[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6400 = true;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
    public final void method211(int arg0, int arg1) {
        class382 var3 = this.field7863.method1323(Thread.currentThread());
        var3.field5531.field6394 = 0;
        if (this.field7869 != null) {
            this.method3172(arg0, arg1, this.field7863.field2779, var3.field5531, var3.field5533, var3.field5565, var3.field5562);
        } else {
            if (this.field7867 != null) {
                this.method3170(arg0, arg1, var3.field5531, var3.field5533, var3.field5565, var3.field5562);
            }
        }
    }
}
