import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class234 extends class220 {

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    private int field4058 = -1;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Lhj;")
    private class113 field4059;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[[I")
    public int[][] field4051;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "[[B")
    private byte[][] field4055;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "[[B")
    private byte[][] field4065;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    private int field4046;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field4047;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    private int field4054;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    private int field4056;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    private int field4057;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    private int field4064;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[[Lml;")
    private class25[][] field4053;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "[[Lbd;")
    private class329[][] field4066;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[[Lao;")
    private class365[][] field4050;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "[[Las;")
    private class410[][] field4063;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class24 var9 = this.field4059.method869(Thread.currentThread());
        class181 var10 = var9.field333;
        var10.field2861 = 0;
        var10.field2860 = false;
        if (this.field4053 != null) {
            this.method1612(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field375, var9.field360);
        } else {
            if (this.field4063 != null) {
                this.method1609(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field375, var9.field360);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1520(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4063 == null) {
            this.field4063 = new class410[super.field3801][super.field3797];
            this.field4050 = new class365[super.field3801][super.field3797];
        } else if (this.field4053 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3802 != var20 || var21 != 0 && super.field3802 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class365 var22 = new class365();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5679 = var23;
            var22.field5684 = new short[var23];
            var22.field5682 = new short[var23];
            var22.field5674 = new short[var23];
            var22.field5676 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5684[var25] = (short) (this.field4055[arg0][arg1] - this.field4065[arg0][arg1]);
                } else if (var30 == 0 && super.field3802 == var31) {
                    var22.field5684[var25] = (short) (this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]);
                } else if (super.field3802 == var30 && super.field3802 == var31) {
                    var22.field5684[var25] = (short) (this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]);
                } else if (super.field3802 == var30 && var31 == 0) {
                    var22.field5684[var25] = (short) (this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]) * var30 + (this.field4055[arg0][arg1] - this.field4065[arg0][arg1]) * (super.field3802 - var30);
                    int var33 = (this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]) * var30 + (this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]) * (super.field3802 - var30);
                    var22.field5684[var25] = (short) ((super.field3802 - var31) * var32 + var31 * var33 >> super.field3803 * 2);
                }
                int var34 = (arg0 << super.field3803) + var30;
                int var35 = (arg1 << super.field3803) + var31;
                var22.field5682[var25] = (short) var30;
                var22.field5676[var25] = (short) var31;
                var22.field5674[var25] = (short) (this.method1517(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field5684[var25] < 2) {
                    var22.field5684[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field4059.field7179.method195(arg11[var28], (byte) -105).field5023) {
                    var26 = true;
                }
            }
            var22.field5680 = new int[var27];
            if (arg10 != null) {
                var22.field5677 = new int[var27];
            }
            var22.field5686 = new short[var27];
            var22.field5685 = new short[var27];
            var22.field5678 = new short[var27];
            if (var26) {
                var22.field5681 = new short[var27];
                var22.field5683 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5680[var22.field5675] = class507.method2982(false, arg9[var29]);
                    } else {
                        var22.field5680[var22.field5675] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5677[var22.field5675] = class507.method2982(false, arg10[var29]);
                        } else {
                            var22.field5677[var22.field5675] = -1;
                        }
                    }
                    var22.field5686[var22.field5675] = (short) arg6[var29];
                    var22.field5685[var22.field5675] = (short) arg7[var29];
                    var22.field5678[var22.field5675] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4059.field7179.method195(arg11[var29], (byte) -105).field5023) {
                            var22.field5681[var22.field5675] = (short) arg11[var29];
                            var22.field5683[var22.field5675] = (short) arg12[var29];
                        } else {
                            var22.field5681[var22.field5675] = -1;
                        }
                    }
                    ++var22.field5675;
                }
            }
            this.field4050[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class410 var36 = new class410();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field6203 = class20.method109(65408, class507.method2982(false, arg10[0]), this.field4055[arg0][arg1] - this.field4065[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field6205 = (byte) (var36.field6205 | 2);
                    }
                }
                if (this.field4051[arg0 + 1][arg1] == this.field4051[arg0][arg1] && this.field4051[arg0 + 1][arg1 + 1] == this.field4051[arg0][arg1] && this.field4051[arg0][arg1 + 1] == this.field4051[arg0][arg1]) {
                    var36.field6205 = (byte) (var36.field6205 | 1);
                }
                if (var38 != -1 && (var36.field6205 & 2) == 0 && !this.field4059.field7179.method195(var38, (byte) -105).field5023) {
                    var36.field6206 = (short) (this.field4055[arg0][arg1] - this.field4065[arg0][arg1]);
                    var36.field6202 = (short) (this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]);
                    var36.field6200 = (short) (this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]);
                    var36.field6204 = (short) (this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]);
                    var36.field6201 = (short) var38;
                } else {
                    short var39 = class507.method2982(false, var37);
                    var36.field6206 = (short) class20.method109(65408, var39, this.field4055[arg0][arg1] - this.field4065[arg0][arg1]);
                    var36.field6202 = (short) class20.method109(65408, var39, this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]);
                    var36.field6200 = (short) class20.method109(65408, var39, this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]);
                    var36.field6204 = (short) class20.method109(65408, var39, this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]);
                    var36.field6201 = -1;
                }
                this.field4063[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Z")
    private final boolean method1607(int arg0) {
        if ((this.field4062 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!pi", name = "qa", descriptor = "(III)V")
    public final void method1511(int arg0, int arg1, int arg2) {
        if (this.field4065[arg0][arg1] < arg2) {
            this.field4065[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZLrm;[I[I[I)V")
    private final void method1608(int arg0, int arg1, boolean arg2, class181 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class25 var8 = this.field4053[arg0][arg1];
        if (var8 != null) {
            if ((var8.field393 & 2) == 0) {
                int var9 = super.field3802 * arg0;
                int var10 = super.field3802 + var9;
                int var11 = super.field3802 * arg1;
                int var12 = super.field3802 + var11;
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
                if ((var8.field393 & 1) != 0 && !arg2) {
                    int var17 = this.field4051[arg0][arg1];
                    if (this.field4058 == -1) {
                        int var18 = this.field4064 * var17;
                        var19 = (this.field4049 * var11 + this.field4046 * var9 + var18 >> 15) + this.field4045;
                        if (var19 <= this.field4059.field2004) {
                            return;
                        }
                        var20 = (this.field4049 * var11 + this.field4046 * var10 + var18 >> 15) + this.field4045;
                        if (var20 <= this.field4059.field2004) {
                            return;
                        }
                        var21 = (this.field4049 * var12 + this.field4046 * var10 + var18 >> 15) + this.field4045;
                        if (var21 <= this.field4059.field2004) {
                            return;
                        }
                        var22 = (this.field4049 * var12 + this.field4046 * var9 + var18 >> 15) + this.field4045;
                        if (var22 <= this.field4059.field2004) {
                            return;
                        }
                    } else {
                        var22 = this.field4058;
                        var21 = this.field4058;
                        var20 = this.field4058;
                        var19 = this.field4058;
                    }
                    if (this.field4059.field2012) {
                        int var23 = var19 - this.field4059.field2015;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field4059.field2015;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field4059.field2015;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field4059.field2015;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field4061 * var17;
                    int var28 = this.field4056 * var17;
                    var29 = (this.field4060 * var11 + this.field4057 * var9 + var27 >> 15) + this.field4048;
                    var30 = this.field4059.field1990 * var29 / var19 + arg3.field2865;
                    var31 = (this.field4052 * var11 + this.field4047 * var9 + var28 >> 15) + this.field4054;
                    var32 = this.field4059.field2019 * var31 / var19 + arg3.field2863;
                    var33 = (this.field4060 * var11 + this.field4057 * var10 + var27 >> 15) + this.field4048;
                    var34 = this.field4059.field1990 * var33 / var20 + arg3.field2865;
                    var35 = (this.field4052 * var11 + this.field4047 * var10 + var28 >> 15) + this.field4054;
                    var36 = this.field4059.field2019 * var35 / var20 + arg3.field2863;
                    var37 = (this.field4060 * var12 + this.field4057 * var10 + var27 >> 15) + this.field4048;
                    var38 = this.field4059.field1990 * var37 / var21 + arg3.field2865;
                    var39 = (this.field4052 * var12 + this.field4047 * var10 + var28 >> 15) + this.field4054;
                    var40 = this.field4059.field2019 * var39 / var21 + arg3.field2863;
                    var41 = (this.field4060 * var12 + this.field4057 * var9 + var27 >> 15) + this.field4048;
                    var42 = this.field4059.field1990 * var41 / var22 + arg3.field2865;
                    var43 = (this.field4052 * var12 + this.field4047 * var9 + var28 >> 15) + this.field4054;
                    var44 = this.field4059.field2019 * var43 / var22 + arg3.field2863;
                } else {
                    int var45 = this.field4051[arg0][arg1];
                    int var46 = this.field4051[arg0 + 1][arg1];
                    int var47 = this.field4051[arg0 + 1][arg1 + 1];
                    int var48 = this.field4051[arg0][arg1 + 1];
                    if (this.field4058 == -1) {
                        var19 = (this.field4049 * var11 + this.field4064 * var45 + this.field4046 * var9 >> 15) + this.field4045;
                        if (var19 <= this.field4059.field2004) {
                            return;
                        }
                        var20 = (this.field4049 * var11 + this.field4064 * var46 + this.field4046 * var10 >> 15) + this.field4045;
                        if (var20 <= this.field4059.field2004) {
                            return;
                        }
                        var21 = (this.field4049 * var12 + this.field4064 * var47 + this.field4046 * var10 >> 15) + this.field4045;
                        if (var21 <= this.field4059.field2004) {
                            return;
                        }
                        var22 = (this.field4049 * var12 + this.field4064 * var48 + this.field4046 * var9 >> 15) + this.field4045;
                        if (var22 <= this.field4059.field2004) {
                            return;
                        }
                    } else {
                        var22 = this.field4058;
                        var21 = this.field4058;
                        var20 = this.field4058;
                        var19 = this.field4058;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field4059.field2015;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field394 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field4059.field2015;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field392 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field4059.field2015;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field396 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field4059.field2015;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field388 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field4059.field2012) {
                        int var57 = var19 - this.field4059.field2015;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field4059.field2015;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field4059.field2015;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field4059.field2015;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field4060 * var11 + this.field4061 * var45 + this.field4057 * var9 >> 15) + this.field4048;
                    var30 = this.field4059.field1990 * var29 / var19 + arg3.field2865;
                    var31 = (this.field4052 * var11 + this.field4056 * var45 + this.field4047 * var9 >> 15) + this.field4054;
                    var32 = this.field4059.field2019 * var31 / var19 + arg3.field2863;
                    var33 = (this.field4060 * var11 + this.field4061 * var46 + this.field4057 * var10 >> 15) + this.field4048;
                    var34 = this.field4059.field1990 * var33 / var20 + arg3.field2865;
                    var35 = (this.field4052 * var11 + this.field4056 * var46 + this.field4047 * var10 >> 15) + this.field4054;
                    var36 = this.field4059.field2019 * var35 / var20 + arg3.field2863;
                    var37 = (this.field4060 * var12 + this.field4061 * var47 + this.field4057 * var10 >> 15) + this.field4048;
                    var38 = this.field4059.field1990 * var37 / var21 + arg3.field2865;
                    var39 = (this.field4052 * var12 + this.field4056 * var47 + this.field4047 * var10 >> 15) + this.field4054;
                    var40 = this.field4059.field2019 * var39 / var21 + arg3.field2863;
                    var41 = (this.field4060 * var12 + this.field4061 * var48 + this.field4057 * var9 >> 15) + this.field4048;
                    var42 = this.field4059.field1990 * var41 / var22 + arg3.field2865;
                    var43 = (this.field4052 * var12 + this.field4056 * var48 + this.field4047 * var9 >> 15) + this.field4054;
                    var44 = this.field4059.field2019 * var43 / var22 + arg3.field2863;
                }
                boolean var61 = var8.field391 != -1 && this.method1607(this.field4059.field7179.method195(var8.field391, (byte) -105).field5026);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field2860 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field2864 || var42 > arg3.field2864 || var34 > arg3.field2864;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field2861 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field391 >= 0) {
                                arg3.method1218(var40, var44, var36, var38, var42, var34, this.field4059.field2001, var15, var16, var14, var8.field390, var8.field389, var8.field387, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field391);
                            } else {
                                arg3.method1219(var40, var44, var36, var38, var42, var34, class517.method3064(64, var15 << 24 | this.field4059.field2001, var8.field390), class517.method3064(54, var16 << 24 | this.field4059.field2001, var8.field389), class517.method3064(107, var14 << 24 | this.field4059.field2001, var8.field387));
                            }
                        } else if (var8.field391 >= 0) {
                            arg3.method1224(var40, var44, var36, var38, var42, var34, var8.field390, var8.field389, var8.field387, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field391);
                        } else {
                            arg3.method1219(var40, var44, var36, var38, var42, var34, var8.field390, var8.field389, var8.field387);
                        }
                        arg3.field2861 = 0;
                    } else {
                        arg3.method1222(var40, var44, var36, var38, var42, var34, this.field4059.field2001);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field2860 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field2864 || var34 > arg3.field2864 || var42 > arg3.field2864;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field2861 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field391 >= 0) {
                                arg3.method1218(var32, var36, var44, var30, var34, var42, this.field4059.field2001, var13, var14, var16, var8.field395, var8.field387, var8.field389, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field391);
                            } else {
                                arg3.method1219(var32, var36, var44, var30, var34, var42, class517.method3064(123, var13 << 24 | this.field4059.field2001, var8.field395), class517.method3064(96, var14 << 24 | this.field4059.field2001, var8.field387), class517.method3064(61, var16 << 24 | this.field4059.field2001, var8.field389));
                            }
                        } else if (var8.field391 >= 0) {
                            arg3.method1224(var32, var36, var44, var30, var34, var42, var8.field395, var8.field387, var8.field389, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field391);
                        } else {
                            arg3.method1219(var32, var36, var44, var30, var34, var42, var8.field395, var8.field387, var8.field389);
                        }
                        arg3.field2861 = 0;
                        return;
                    }
                    arg3.method1222(var32, var36, var44, var30, var34, var42, this.field4059.field2001);
                }
            }
        } else {
            class329 var64 = this.field4066[arg0][arg1];
            if (var64 != null) {
                if (this.field4058 == -1) {
                    for (int var65 = 0; var65 < var64.field5182; ++var65) {
                        int var66 = (arg0 << super.field3803) + var64.field5187[var65];
                        int var67 = var64.field5186[var65];
                        int var68 = (arg1 << super.field3803) + var64.field5191[var65];
                        int var69 = (this.field4049 * var68 + this.field4064 * var67 + this.field4046 * var66 >> 15) + this.field4045;
                        if (var69 <= this.field4059.field2004) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field4059.field2015;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field5188[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field4059.field2012) {
                            int var72 = var69 - this.field4059.field2015;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field4060 * var68 + this.field4061 * var67 + this.field4057 * var66 >> 15) + this.field4048;
                        int var74 = (this.field4052 * var68 + this.field4056 * var67 + this.field4047 * var66 >> 15) + this.field4054;
                        arg4[var65] = this.field4059.field1990 * var73 / var69 + arg3.field2865;
                        arg5[var65] = this.field4059.field2019 * var74 / var69 + arg3.field2863;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field5182; ++var75) {
                        int var115 = (arg0 << super.field3803) + var64.field5187[var75];
                        int var116 = var64.field5186[var75];
                        int var117 = (arg1 << super.field3803) + var64.field5191[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field4058 - this.field4059.field2015;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field5188[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field4059.field2012) {
                            int var120 = this.field4058 - this.field4059.field2015;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field4060 * var117 + this.field4061 * var116 + this.field4057 * var115 >> 15) + this.field4048;
                        int var122 = (this.field4052 * var117 + this.field4056 * var116 + this.field4047 * var115 >> 15) + this.field4054;
                        arg4[var75] = this.field4059.field1990 * var121 / this.field4058 + arg3.field2865;
                        arg5[var75] = this.field4059.field2019 * var122 / this.field4058 + arg3.field2863;
                    }
                }
                if (var64.field5184 != null) {
                    int var76 = this.field4051[arg0][arg1];
                    int var77 = this.field4051[arg0 + 1][arg1];
                    int var78 = this.field4051[arg0][arg1 + 1];
                    int var79 = super.field3802 * arg0;
                    int var80 = super.field3802 + var79;
                    int var81 = super.field3802 * arg1;
                    int var82 = super.field3802 + var81;
                    int var83 = (this.field4060 * var81 + this.field4061 * var76 + this.field4057 * var79 >> 15) + this.field4048;
                    int var84 = (this.field4052 * var81 + this.field4056 * var76 + this.field4047 * var79 >> 15) + this.field4054;
                    int var85 = (this.field4049 * var81 + this.field4064 * var76 + this.field4046 * var79 >> 15) + this.field4045;
                    int var86 = (this.field4060 * var81 + this.field4061 * var77 + this.field4057 * var80 >> 15) + this.field4048;
                    int var87 = (this.field4052 * var81 + this.field4056 * var77 + this.field4047 * var80 >> 15) + this.field4054;
                    int var88 = (this.field4049 * var81 + this.field4064 * var77 + this.field4046 * var80 >> 15) + this.field4045;
                    int var89 = (this.field4060 * var82 + this.field4061 * var78 + this.field4057 * var79 >> 15) + this.field4048;
                    int var90 = (this.field4052 * var82 + this.field4056 * var78 + this.field4047 * var79 >> 15) + this.field4054;
                    int var91 = (this.field4049 * var82 + this.field4064 * var78 + this.field4046 * var79 >> 15) + this.field4045;
                    for (int var92 = 0; var92 < var64.field5183; ++var92) {
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
                            arg3.field2860 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field2864 || var97 > arg3.field2864 || var98 > arg3.field2864;
                            short var103 = var64.field5184[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method1607(this.field4059.field7179.method195(var103, (byte) -105).field5026)) {
                                    arg3.field2861 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method1218(var99, var100, var101, var96, var97, var98, this.field4059.field2001, arg6[var93], arg6[var94], arg6[var95], var64.field5190[var93], var64.field5190[var94], var64.field5190[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field5190[var93] & 16777215) != 0) {
                                        arg3.method1219(var99, var100, var101, var96, var97, var98, class517.method3064(90, arg6[var93] << 24 | this.field4059.field2001, var64.field5190[var93]), class517.method3064(94, arg6[var94] << 24 | this.field4059.field2001, var64.field5190[var94]), class517.method3064(60, arg6[var95] << 24 | this.field4059.field2001, var64.field5190[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method1224(var99, var100, var101, var96, var97, var98, var64.field5190[var93], var64.field5190[var94], var64.field5190[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field5190[var93] & 16777215) != 0) {
                                    arg3.method1219(var99, var100, var101, var96, var97, var98, var64.field5190[var93], var64.field5190[var94], var64.field5190[var95]);
                                }
                                arg3.field2861 = 0;
                            } else {
                                arg3.method1222(var99, var100, var101, var96, var97, var98, this.field4059.field2001);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field5183; ++var104) {
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
                        arg3.field2860 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field2864 || var109 > arg3.field2864 || var110 > arg3.field2864;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field5190[var105] & 16777215) != 0) {
                                    arg3.method1219(var111, var112, var113, var108, var109, var110, class299.method1919(arg6[var105], (byte) -118, this.field4059.field2001, var64.field5190[var105]), class299.method1919(arg6[var106], (byte) -110, this.field4059.field2001, var64.field5190[var106]), class299.method1919(arg6[var107], (byte) -123, this.field4059.field2001, var64.field5190[var107]));
                                }
                            } else if ((var64.field5190[var105] & 16777215) != 0) {
                                arg3.method1219(var111, var112, var113, var108, var109, var110, var64.field5190[var105], var64.field5190[var106], var64.field5190[var107]);
                            }
                        } else {
                            arg3.method1222(var111, var112, var113, var108, var109, var110, this.field4059.field2001);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[ZLrm;[I[I)V")
    private final void method1609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class181 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2868 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4063[var16][var17] != null) {
                        class410 var18 = this.field4063[var16][var17];
                        if (var18.field6201 != -1 && (var18.field6205 & 2) == 0 && var18.field6203 == -1) {
                            int var19 = this.field4059.method893(var18.field6201);
                            arg8.method1230(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class20.method109(65408, var19, var18.field6200 & 65535), class20.method109(65408, var19, var18.field6204 & 65535), class20.method109(65408, var19, var18.field6202 & 65535));
                            arg8.method1230(var15, var15, var15 - var13, var14, var13 + var14, var14, class20.method109(65408, var19, var18.field6206 & 65535), class20.method109(65408, var19, var18.field6202 & 65535), class20.method109(65408, var19, var18.field6204 & 65535));
                        } else if (var18.field6203 == -1) {
                            arg8.method1230(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6200 & 65535, var18.field6204 & 65535, var18.field6202 & 65535);
                            arg8.method1230(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6206 & 65535, var18.field6202 & 65535, var18.field6204 & 65535);
                        } else {
                            int var20 = var18.field6203;
                            arg8.method1230(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1230(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field4050[var16][var17] != null) {
                        class365 var21 = this.field4050[var16][var17];
                        for (int var22 = 0; var22 < var21.field5679; ++var22) {
                            arg9[var22] = var21.field5682[var22] * var13 / super.field3802 + var14;
                            arg10[var22] = var15 - var21.field5676[var22] * var13 / super.field3802;
                        }
                        for (int var23 = 0; var23 < var21.field5675; ++var23) {
                            short var24 = var21.field5686[var23];
                            short var25 = var21.field5685[var23];
                            short var26 = var21.field5678[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5677 != null && var21.field5677[var23] != -1) {
                                int var33 = var21.field5677[var23];
                                arg8.method1230(var30, var31, var32, var27, var28, var29, class20.method109(65408, var33, var21.field5684[var24]), class20.method109(65408, var33, var21.field5684[var25]), class20.method109(65408, var33, var21.field5684[var26]));
                            } else if (var21.field5681 != null && var21.field5681[var23] != -1) {
                                int var34 = this.field4059.method893(var21.field5681[var23]);
                                arg8.method1230(var30, var31, var32, var27, var28, var29, class20.method109(65408, var34, var21.field5684[var24]), class20.method109(65408, var34, var21.field5684[var25]), class20.method109(65408, var34, var21.field5684[var26]));
                            } else {
                                int var35 = var21.field5680[var23];
                                arg8.method1230(var30, var31, var32, var27, var28, var29, class20.method109(65408, var35, var21.field5684[var24]), class20.method109(65408, var35, var21.field5684[var25]), class20.method109(65408, var35, var21.field5684[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2868 = true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method1521(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILrm;[I[I[I)V")
    private final void method1610(int arg0, int arg1, class181 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class410 var7 = this.field4063[arg0][arg1];
        if (var7 != null) {
            if ((var7.field6205 & 2) == 0) {
                int var8 = super.field3802 * arg0;
                int var9 = super.field3802 + var8;
                int var10 = super.field3802 * arg1;
                int var11 = super.field3802 + var10;
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
                if ((var7.field6205 & 1) != 0) {
                    int var12 = this.field4051[arg0][arg1];
                    int var16;
                    if (this.field4058 == -1) {
                        int var13 = this.field4064 * var12;
                        var14 = (this.field4049 * var10 + this.field4046 * var8 + var13 >> 15) + this.field4045;
                        if (var14 <= this.field4059.field2004) {
                            return;
                        }
                        var15 = (this.field4049 * var10 + this.field4046 * var9 + var13 >> 15) + this.field4045;
                        if (var15 <= this.field4059.field2004) {
                            return;
                        }
                        var16 = (this.field4049 * var11 + this.field4046 * var9 + var13 >> 15) + this.field4045;
                        if (var16 <= this.field4059.field2004) {
                            return;
                        }
                        var17 = (this.field4049 * var11 + this.field4046 * var8 + var13 >> 15) + this.field4045;
                        if (var17 <= this.field4059.field2004) {
                            return;
                        }
                    } else {
                        var17 = this.field4058;
                        var16 = this.field4058;
                        var15 = this.field4058;
                        var14 = this.field4058;
                    }
                    int var18 = this.field4061 * var12;
                    int var19 = this.field4056 * var12;
                    var20 = (this.field4060 * var10 + this.field4057 * var8 + var18 >> 15) + this.field4048;
                    var21 = this.field4059.field1990 * var20 / var14 + arg2.field2865;
                    var22 = (this.field4052 * var10 + this.field4047 * var8 + var19 >> 15) + this.field4054;
                    var23 = this.field4059.field2019 * var22 / var14 + arg2.field2863;
                    var24 = (this.field4060 * var10 + this.field4057 * var9 + var18 >> 15) + this.field4048;
                    var25 = this.field4059.field1990 * var24 / var15 + arg2.field2865;
                    var26 = (this.field4052 * var10 + this.field4047 * var9 + var19 >> 15) + this.field4054;
                    var27 = this.field4059.field2019 * var26 / var15 + arg2.field2863;
                    int var28 = (this.field4060 * var11 + this.field4057 * var9 + var18 >> 15) + this.field4048;
                    var29 = this.field4059.field1990 * var28 / var16 + arg2.field2865;
                    int var30 = (this.field4052 * var11 + this.field4047 * var9 + var19 >> 15) + this.field4054;
                    var31 = this.field4059.field2019 * var30 / var16 + arg2.field2863;
                    var32 = (this.field4060 * var11 + this.field4057 * var8 + var18 >> 15) + this.field4048;
                    var33 = this.field4059.field1990 * var32 / var17 + arg2.field2865;
                    var34 = (this.field4052 * var11 + this.field4047 * var8 + var19 >> 15) + this.field4054;
                    var35 = this.field4059.field2019 * var34 / var17 + arg2.field2863;
                } else {
                    int var36 = this.field4051[arg0][arg1];
                    int var37 = this.field4051[arg0 + 1][arg1];
                    int var38 = this.field4051[arg0 + 1][arg1 + 1];
                    int var39 = this.field4051[arg0][arg1 + 1];
                    int var40;
                    if (this.field4058 == -1) {
                        var14 = (this.field4049 * var10 + this.field4064 * var36 + this.field4046 * var8 >> 15) + this.field4045;
                        if (var14 <= this.field4059.field2004) {
                            return;
                        }
                        var15 = (this.field4049 * var10 + this.field4064 * var37 + this.field4046 * var9 >> 15) + this.field4045;
                        if (var15 <= this.field4059.field2004) {
                            return;
                        }
                        var40 = (this.field4049 * var11 + this.field4064 * var38 + this.field4046 * var9 >> 15) + this.field4045;
                        if (var40 <= this.field4059.field2004) {
                            return;
                        }
                        var17 = (this.field4049 * var11 + this.field4064 * var39 + this.field4046 * var8 >> 15) + this.field4045;
                        if (var17 <= this.field4059.field2004) {
                            return;
                        }
                    } else {
                        var17 = this.field4058;
                        var40 = this.field4058;
                        var15 = this.field4058;
                        var14 = this.field4058;
                    }
                    var20 = (this.field4060 * var10 + this.field4061 * var36 + this.field4057 * var8 >> 15) + this.field4048;
                    var21 = this.field4059.field1990 * var20 / var14 + arg2.field2865;
                    var22 = (this.field4052 * var10 + this.field4056 * var36 + this.field4047 * var8 >> 15) + this.field4054;
                    var23 = this.field4059.field2019 * var22 / var14 + arg2.field2863;
                    var24 = (this.field4060 * var10 + this.field4061 * var37 + this.field4057 * var9 >> 15) + this.field4048;
                    var25 = this.field4059.field1990 * var24 / var15 + arg2.field2865;
                    var26 = (this.field4052 * var10 + this.field4056 * var37 + this.field4047 * var9 >> 15) + this.field4054;
                    var27 = this.field4059.field2019 * var26 / var15 + arg2.field2863;
                    int var41 = (this.field4060 * var11 + this.field4061 * var38 + this.field4057 * var9 >> 15) + this.field4048;
                    var29 = this.field4059.field1990 * var41 / var40 + arg2.field2865;
                    int var42 = (this.field4052 * var11 + this.field4056 * var38 + this.field4047 * var9 >> 15) + this.field4054;
                    var31 = this.field4059.field2019 * var42 / var40 + arg2.field2863;
                    var32 = (this.field4060 * var11 + this.field4061 * var39 + this.field4057 * var8 >> 15) + this.field4048;
                    var33 = this.field4059.field1990 * var32 / var17 + arg2.field2865;
                    var34 = (this.field4052 * var11 + this.field4056 * var39 + this.field4047 * var8 >> 15) + this.field4054;
                    var35 = this.field4059.field2019 * var34 / var17 + arg2.field2863;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field2860 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field2864 || var33 > arg2.field2864 || var25 > arg2.field2864;
                    if (var7.field6201 >= 0) {
                        if (this.method1607(this.field4059.field7179.method195(var7.field6201, (byte) -105).field5026)) {
                            arg2.field2861 = 100;
                        }
                        arg2.method1224(var31, var35, var27, var29, var33, var25, var7.field6200 & 65535, var7.field6204 & 65535, var7.field6202 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6201);
                        arg2.field2861 = 0;
                    } else {
                        arg2.method1230(var31, var35, var27, var29, var33, var25, var7.field6200 & 65535, var7.field6204 & 65535, var7.field6202 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field2860 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field2864 || var25 > arg2.field2864 || var33 > arg2.field2864;
                    if (var7.field6201 >= 0) {
                        if (this.method1607(this.field4059.field7179.method195(var7.field6201, (byte) -105).field5026)) {
                            arg2.field2861 = 100;
                        }
                        arg2.method1224(var23, var27, var35, var21, var25, var33, var7.field6206 & 65535, var7.field6202 & 65535, var7.field6204 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6201);
                        arg2.field2861 = 0;
                        return;
                    }
                    arg2.method1230(var23, var27, var35, var21, var25, var33, var7.field6206 & 65535, var7.field6202 & 65535, var7.field6204 & 65535);
                }
            }
        } else {
            class365 var43 = this.field4050[arg0][arg1];
            if (var43 != null) {
                if (this.field4058 == -1) {
                    for (int var44 = 0; var44 < var43.field5679; ++var44) {
                        int var45 = (arg0 << super.field3803) + var43.field5682[var44];
                        short var46 = var43.field5674[var44];
                        int var47 = (arg1 << super.field3803) + var43.field5676[var44];
                        int var48 = (this.field4049 * var47 + this.field4064 * var46 + this.field4046 * var45 >> 15) + this.field4045;
                        if (var48 <= this.field4059.field2004) {
                            return;
                        }
                        int var49 = (this.field4060 * var47 + this.field4061 * var46 + this.field4057 * var45 >> 15) + this.field4048;
                        int var50 = (this.field4052 * var47 + this.field4056 * var46 + this.field4047 * var45 >> 15) + this.field4054;
                        arg3[var44] = this.field4059.field1990 * var49 / var48 + arg2.field2865;
                        arg4[var44] = this.field4059.field2019 * var50 / var48 + arg2.field2863;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field5679; ++var51) {
                        int var91 = (arg0 << super.field3803) + var43.field5682[var51];
                        short var92 = var43.field5674[var51];
                        int var93 = (arg1 << super.field3803) + var43.field5676[var51];
                        int var94 = (this.field4060 * var93 + this.field4061 * var92 + this.field4057 * var91 >> 15) + this.field4048;
                        int var95 = (this.field4052 * var93 + this.field4056 * var92 + this.field4047 * var91 >> 15) + this.field4054;
                        arg3[var51] = this.field4059.field1990 * var94 / this.field4058 + arg2.field2865;
                        arg4[var51] = this.field4059.field2019 * var95 / this.field4058 + arg2.field2863;
                    }
                }
                if (var43.field5681 != null) {
                    int var52 = this.field4051[arg0][arg1];
                    int var53 = this.field4051[arg0 + 1][arg1];
                    int var54 = this.field4051[arg0][arg1 + 1];
                    int var55 = super.field3802 * arg0;
                    int var56 = super.field3802 + var55;
                    int var57 = super.field3802 * arg1;
                    int var58 = super.field3802 + var57;
                    int var59 = (this.field4060 * var57 + this.field4061 * var52 + this.field4057 * var55 >> 15) + this.field4048;
                    int var60 = (this.field4052 * var57 + this.field4056 * var52 + this.field4047 * var55 >> 15) + this.field4054;
                    int var61 = (this.field4049 * var57 + this.field4064 * var52 + this.field4046 * var55 >> 15) + this.field4045;
                    int var62 = (this.field4060 * var57 + this.field4061 * var53 + this.field4057 * var56 >> 15) + this.field4048;
                    int var63 = (this.field4052 * var57 + this.field4056 * var53 + this.field4047 * var56 >> 15) + this.field4054;
                    int var64 = (this.field4049 * var57 + this.field4064 * var53 + this.field4046 * var56 >> 15) + this.field4045;
                    int var65 = (this.field4060 * var58 + this.field4061 * var54 + this.field4057 * var55 >> 15) + this.field4048;
                    int var66 = (this.field4052 * var58 + this.field4056 * var54 + this.field4047 * var55 >> 15) + this.field4054;
                    int var67 = (this.field4049 * var58 + this.field4064 * var54 + this.field4046 * var55 >> 15) + this.field4045;
                    for (int var68 = 0; var68 < var43.field5675; ++var68) {
                        short var69 = var43.field5686[var68];
                        short var70 = var43.field5685[var68];
                        short var71 = var43.field5678[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field2860 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field2864 || var73 > arg2.field2864 || var74 > arg2.field2864;
                            short var78 = var43.field5681[var68];
                            if (var78 != -1) {
                                if (this.method1607(this.field4059.field7179.method195(var78, (byte) -105).field5026)) {
                                    arg2.field2861 = 100;
                                }
                                arg2.method1224(var75, var76, var77, var72, var73, var74, var43.field5684[var69], var43.field5684[var70], var43.field5684[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field2861 = 0;
                            } else {
                                int var79 = var43.field5680[var68];
                                if (var79 != -1) {
                                    arg2.method1230(var75, var76, var77, var72, var73, var74, class20.method109(65408, var79, var43.field5684[var69]), class20.method109(65408, var79, var43.field5684[var70]), class20.method109(65408, var79, var43.field5684[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field5675; ++var80) {
                    short var81 = var43.field5686[var80];
                    short var82 = var43.field5685[var80];
                    short var83 = var43.field5678[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field5680[var80];
                        if (var90 != -1) {
                            arg2.field2860 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field2864 || var85 > arg2.field2864 || var86 > arg2.field2864;
                            arg2.method1230(var87, var88, var89, var84, var85, var86, class20.method109(65408, var90, var43.field5684[var81]), class20.method109(65408, var90, var43.field5684[var82]), class20.method109(65408, var90, var43.field5684[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lja;[I)V")
    public final void method1513(class450 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!pi", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method1518(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pi", name = "ca", descriptor = "(II)I")
    public final int method1517(int arg0, int arg1) {
        int var3 = arg0 >> super.field3803;
        int var4 = arg1 >> super.field3803;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3801 - 1 && var4 <= super.field3797 - 1) {
            int var5 = arg0 & super.field3802 - 1;
            int var6 = arg1 & super.field3802 - 1;
            int var7 = (super.field3802 - var5) * this.field4051[var3][var4] + this.field4051[var3 + 1][var4] * var5 >> super.field3803;
            int var8 = (super.field3802 - var5) * this.field4051[var3][var4 + 1] + this.field4051[var3 + 1][var4 + 1] * var5 >> super.field3803;
            return (super.field3802 - var6) * var7 + var6 * var8 >> super.field3803;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I")
    private static final int method1611(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method1509(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pi", name = "OA", descriptor = "(IILi;)Li;")
    public final class515 method1510(int arg0, int arg1, class515 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "ua", descriptor = "(II)I")
    public final int method1516(int arg0, int arg1) {
        return this.field4051[arg0][arg1];
    }

    @OriginalMember(owner = "client!pi", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1523(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field4053 == null) {
            this.field4053 = new class25[super.field3801][super.field3797];
            this.field4066 = new class329[super.field3801][super.field3797];
        } else if (this.field4063 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class226.field3894[class507.method2982(false, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class226.field3894[class507.method2982(false, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field3802 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field3802 && arg4[var22] == super.field3802) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field3802) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field3802 != arg2[var24] && arg2[0] - super.field3802 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field3802 != arg4[var24] && arg4[0] - super.field3802 != arg4[var24]) {
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
                class25 var25 = new class25();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field397 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field393 = (byte) (var25.field393 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field4051[arg0 + 1][arg1] == this.field4051[arg0][arg1] && this.field4051[arg0 + 1][arg1 + 1] == this.field4051[arg0][arg1] && this.field4051[arg0][arg1 + 1] == this.field4051[arg0][arg1]) {
                    var25.field393 = (byte) (var25.field393 | 1);
                }
                if (var27 != -1 && (var25.field393 & 2) == 0 && !this.field4059.field7179.method195(var27, (byte) -105).field5023) {
                    var25.field395 = this.field4055[arg0][arg1] - this.field4065[arg0][arg1];
                    var25.field387 = this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1];
                    var25.field390 = this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1];
                    var25.field389 = this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1];
                    var25.field391 = (short) var27;
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
                    var25.field395 = class299.method1919(var28, (byte) -112, arg10, method1611(arg6[var18] >> 8, this.field4055[arg0][arg1] - this.field4065[arg0][arg1]));
                    if (var25.field397 != 0) {
                        var25.field395 |= 255 - (this.field4055[arg0][arg1] - this.field4065[arg0][arg1]) << 25;
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
                    var25.field387 = class299.method1919(var29, (byte) -111, arg10, method1611(arg6[var19] >> 8, this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]));
                    if (var25.field397 != 0) {
                        var25.field387 |= 255 - (this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]) << 25;
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
                    var25.field390 = class299.method1919(var30, (byte) -108, arg10, method1611(arg6[var20] >> 8, this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]));
                    if (var25.field397 != 0) {
                        var25.field390 |= 255 - (this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field389 = class299.method1919(var31, (byte) -111, arg10, method1611(arg6[var21] >> 8, this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]));
                    if (var25.field397 != 0) {
                        var25.field389 |= 255 - (this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]) << 25;
                    }
                    var25.field391 = -1;
                }
                if (arg5 != null) {
                    var25.field396 = (short) arg5[var20];
                    var25.field388 = (short) arg5[var21];
                    var25.field392 = (short) arg5[var19];
                    var25.field394 = (short) arg5[var18];
                }
                this.field4053[arg0][arg1] = var25;
            } else {
                class329 var32 = new class329();
                var32.field5182 = (short) arg2.length;
                var32.field5183 = (short) (arg2.length / 3);
                var32.field5187 = new short[var32.field5182];
                var32.field5186 = new short[var32.field5182];
                var32.field5191 = new short[var32.field5182];
                var32.field5190 = new int[var32.field5182];
                if (arg5 != null) {
                    var32.field5188 = new short[var32.field5182];
                }
                for (int var33 = 0; var33 < var32.field5182; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field4055[arg0][arg1] - this.field4065[arg0][arg1];
                    } else if (var48 == 0 && super.field3802 == var49) {
                        var51 = this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1];
                    } else if (super.field3802 == var48 && super.field3802 == var49) {
                        var51 = this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1];
                    } else if (super.field3802 == var48 && var49 == 0) {
                        var51 = this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field4055[arg0 + 1][arg1] - this.field4065[arg0 + 1][arg1]) * var48 + (this.field4055[arg0][arg1] - this.field4065[arg0][arg1]) * (super.field3802 - var48);
                        int var53 = (this.field4055[arg0 + 1][arg1 + 1] - this.field4065[arg0 + 1][arg1 + 1]) * var48 + (this.field4055[arg0][arg1 + 1] - this.field4065[arg0][arg1 + 1]) * (super.field3802 - var48);
                        var51 = (super.field3802 - var49) * var52 + var49 * var53 >> super.field3803 * 2;
                    }
                    int var54 = (arg0 << super.field3803) + var48;
                    int var55 = (arg1 << super.field3803) + var49;
                    var32.field5187[var33] = (short) var48;
                    var32.field5191[var33] = (short) var49;
                    var32.field5186[var33] = (short) (this.method1517(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field4059.field7179.method195(arg8[var33], (byte) -105).field5023) {
                        var32.field5190[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field5190[var33] = var51 << 25;
                        } else {
                            var32.field5190[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field5188[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field5190[var33] = class299.method1919(var56, (byte) -115, arg10, method1611(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field5190[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field5183; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field4059.field7179.method195(arg8[var35 * 3], (byte) -105).field5023) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field5189 = new int[var32.field5183];
                }
                if (var34) {
                    var32.field5184 = new short[var32.field5183];
                    var32.field5185 = new short[var32.field5183];
                }
                for (int var36 = 0; var36 < var32.field5183; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field5189[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field4059.field7179.method195(var42, (byte) -105).field5023) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field4059.field7179.method195(var43, (byte) -105).field5023) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field4059.field7179.method195(var44, (byte) -105).field5023) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field5184[var36] = (short) var44;
                            var32.field5185[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field4059.field7179.method195(var45, (byte) -105).field5023) {
                                    var32.field5190[var37] = class226.field3894[class507.method2982(false, this.field4059.field7179.method195(var45, (byte) -105).field5033 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field4059.field7179.method195(var46, (byte) -105).field5023) {
                                    var32.field5190[var38] = class226.field3894[class507.method2982(false, this.field4059.field7179.method195(var46, (byte) -105).field5033 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field4059.field7179.method195(var47, (byte) -105).field5023) {
                                    var32.field5190[var39] = class226.field3894[class507.method2982(false, this.field4059.field7179.method195(var47, (byte) -105).field5033 & 65535) & 65535];
                                }
                            }
                            var32.field5184[var36] = -1;
                        }
                    }
                }
                this.field4066[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "aa", descriptor = "()V")
    public final void method1524() {
        this.field4055 = null;
        this.field4065 = null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lhj;IIII[[I[[II)V")
    public class234(class113 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4059 = arg0;
        this.field4062 = arg2;
        this.field4051 = arg5;
        this.field4055 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4059.field2024 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4059.field2017 * var18 + this.field4059.field2022 * var16 + this.field4059.field2003 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4055[var11][var10] = (byte) var20;
            }
        }
        this.field4065 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public final void method1515(int arg0, int arg1) {
        class24 var3 = this.field4059.method869(Thread.currentThread());
        var3.field333.field2861 = 0;
        if (this.field4053 != null) {
            this.method1608(arg0, arg1, this.field4059.field1999, var3.field333, var3.field375, var3.field360, var3.field385);
        } else {
            if (this.field4063 != null) {
                this.method1610(arg0, arg1, var3.field333, var3.field375, var3.field360, var3.field385);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1512(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class183 var6 = this.field4059.field1987;
        this.field4058 = -1;
        this.field4057 = var6.field2884;
        this.field4061 = var6.field2889;
        this.field4060 = var6.field2887;
        this.field4048 = var6.field2893;
        this.field4047 = var6.field2892;
        this.field4056 = var6.field2883;
        this.field4052 = var6.field2888;
        this.field4054 = var6.field2886;
        this.field4046 = var6.field2891;
        this.field4064 = var6.field2894;
        this.field4049 = var6.field2885;
        this.field4045 = var6.field2890;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIIII[[ZLrm;[I[I)V")
    private final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class181 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field2868 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4053[var16][var17] != null) {
                        class25 var18 = this.field4053[var16][var17];
                        if (var18.field391 != -1 && (var18.field393 & 2) == 0 && var18.field397 == 0) {
                            int var19 = this.field4059.method893(var18.field391);
                            arg8.method1230(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class20.method109(65408, var19, var18.field390), class20.method109(65408, var19, var18.field389), class20.method109(65408, var19, var18.field387));
                            arg8.method1230(var15, var15, var15 - var13, var14, var13 + var14, var14, class20.method109(65408, var19, var18.field395), class20.method109(65408, var19, var18.field387), class20.method109(65408, var19, var18.field389));
                        } else if (var18.field397 == 0) {
                            arg8.method1219(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field390, var18.field389, var18.field387);
                            arg8.method1219(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field395, var18.field387, var18.field389);
                        } else {
                            int var20 = var18.field397;
                            arg8.method1219(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class517.method3064(108, var18.field390 & -16777216, var20), class517.method3064(66, var18.field389 & -16777216, var20), class517.method3064(54, var18.field387 & -16777216, var20));
                            arg8.method1219(var15, var15, var15 - var13, var14, var13 + var14, var14, class517.method3064(75, var18.field395 & -16777216, var20), class517.method3064(51, var18.field387 & -16777216, var20), class517.method3064(74, var18.field389 & -16777216, var20));
                        }
                    } else if (this.field4066[var16][var17] != null) {
                        class329 var21 = this.field4066[var16][var17];
                        for (int var22 = 0; var22 < var21.field5182; ++var22) {
                            arg9[var22] = var21.field5187[var22] * var13 / super.field3802 + var14;
                            arg10[var22] = var15 - var21.field5191[var22] * var13 / super.field3802;
                        }
                        for (int var23 = 0; var23 < var21.field5183; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5189 != null && var21.field5189[var23] != 0 && (var21.field5184 == null || var21.field5184 != null && var21.field5184[var23] == -1)) {
                                int var33 = var21.field5189[var23];
                                arg8.method1219(var30, var31, var32, var27, var28, var29, class517.method3064(78, -16777216 - (var21.field5190[var24] & -16777216), var33), class517.method3064(123, -16777216 - (var21.field5190[var25] & -16777216), var33), class517.method3064(68, -16777216 - (var21.field5190[var26] & -16777216), var33));
                            } else if (var21.field5184 != null && var21.field5184[var23] != -1) {
                                int var34 = this.field4059.method893(var21.field5184[var23]);
                                arg8.method1230(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1219(var30, var31, var32, var27, var28, var29, var21.field5190[var24], var21.field5190[var25], var21.field5190[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field2868 = true;
    }
}
