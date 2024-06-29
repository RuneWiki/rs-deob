import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class500 extends class176 {

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public int field7095 = -1;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Law;")
    public class67 field7090;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    private int field7102;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "[[I")
    public int[][] field7087;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[[B")
    private byte[][] field7088;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[[B")
    private byte[][] field7094;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public int field7083;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public int field7086;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field7089;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field7091;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public int field7092;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public int field7097;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field7099;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field7101;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public int field7104;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[[Lju;")
    public class108[][] field7085;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[[Lcl;")
    public class225[][] field7103;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[[Lle;")
    public class258[][] field7093;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[[Lft;")
    public class4[][] field7084;

    @OriginalMember(owner = "client!pf", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1241(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pf", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1234(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field7103 == null) {
            this.field7103 = new class225[super.field2697][super.field2693];
            this.field7085 = new class108[super.field2697][super.field2693];
        } else if (this.field7084 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class111.field1583[class417.method2456(arg6[var15], 32) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class111.field1583[class417.method2456(arg7[var16], 4) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field2694 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2694 && arg4[var22] == super.field2694) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2694) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2694 != arg2[var24] && arg2[0] - super.field2694 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2694 != arg4[var24] && arg4[0] - super.field2694 != arg4[var24]) {
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
                class225 var25 = new class225();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field3251 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field3250 = (byte) (var25.field3250 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field7087[arg0 + 1][arg1] == this.field7087[arg0][arg1] && this.field7087[arg0 + 1][arg1 + 1] == this.field7087[arg0][arg1] && this.field7087[arg0][arg1 + 1] == this.field7087[arg0][arg1]) {
                    var25.field3250 = (byte) (var25.field3250 | 1);
                }
                if (var27 != -1 && (var25.field3250 & 2) == 0 && !this.field7090.field3092.method110(var27, (byte) 104).field6653) {
                    var25.field3249 = this.field7088[arg0][arg1] - this.field7094[arg0][arg1];
                    var25.field3247 = this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1];
                    var25.field3253 = this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1];
                    var25.field3252 = this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1];
                    var25.field3255 = (short) var27;
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
                    var25.field3249 = class428.method2506(method2984(arg6[var18] >> 8, this.field7088[arg0][arg1] - this.field7094[arg0][arg1]), (byte) -103, arg10, var28);
                    if (var25.field3251 != 0) {
                        var25.field3249 |= 255 - (this.field7088[arg0][arg1] - this.field7094[arg0][arg1]) << 25;
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
                    var25.field3247 = class428.method2506(method2984(arg6[var19] >> 8, this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1]), (byte) -116, arg10, var29);
                    if (var25.field3251 != 0) {
                        var25.field3247 |= 255 - (this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1]) << 25;
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
                    var25.field3253 = class428.method2506(method2984(arg6[var20] >> 8, this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1]), (byte) -82, arg10, var30);
                    if (var25.field3251 != 0) {
                        var25.field3253 |= 255 - (this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field3252 = class428.method2506(method2984(arg6[var21] >> 8, this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1]), (byte) -81, arg10, var31);
                    if (var25.field3251 != 0) {
                        var25.field3252 |= 255 - (this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1]) << 25;
                    }
                    var25.field3255 = -1;
                }
                if (arg5 != null) {
                    var25.field3248 = (short) arg5[var20];
                    var25.field3256 = (short) arg5[var21];
                    var25.field3257 = (short) arg5[var19];
                    var25.field3254 = (short) arg5[var18];
                }
                this.field7103[arg0][arg1] = var25;
            } else {
                class108 var32 = new class108();
                var32.field1550 = (short) arg2.length;
                var32.field1547 = (short) (arg2.length / 3);
                var32.field1549 = new short[var32.field1550];
                var32.field1551 = new short[var32.field1550];
                var32.field1546 = new short[var32.field1550];
                var32.field1548 = new int[var32.field1550];
                if (arg5 != null) {
                    var32.field1545 = new short[var32.field1550];
                }
                for (int var33 = 0; var33 < var32.field1550; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field7088[arg0][arg1] - this.field7094[arg0][arg1];
                    } else if (var48 == 0 && super.field2694 == var49) {
                        var51 = this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1];
                    } else if (super.field2694 == var48 && super.field2694 == var49) {
                        var51 = this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1];
                    } else if (super.field2694 == var48 && var49 == 0) {
                        var51 = this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1]) * var48 + (this.field7088[arg0][arg1] - this.field7094[arg0][arg1]) * (super.field2694 - var48);
                        int var53 = (this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1]) * var48 + (this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1]) * (super.field2694 - var48);
                        var51 = (super.field2694 - var49) * var52 + var49 * var53 >> super.field2695 * 2;
                    }
                    int var54 = (arg0 << super.field2695) + var48;
                    int var55 = (arg1 << super.field2695) + var49;
                    var32.field1549[var33] = (short) var48;
                    var32.field1546[var33] = (short) var49;
                    var32.field1551[var33] = (short) (this.method1233(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field7090.field3092.method110(arg8[var33], (byte) 101).field6653) {
                        var32.field1548[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1548[var33] = var51 << 25;
                        } else {
                            var32.field1548[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1545[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1548[var33] = class428.method2506(method2984(arg6[var33] >> 8, var51), (byte) -69, arg10, var56);
                        if (arg7 != null) {
                            var32.field1548[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1547; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field7090.field3092.method110(arg8[var35 * 3], (byte) 123).field6653) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1544 = new int[var32.field1547];
                }
                if (var34) {
                    var32.field1553 = new short[var32.field1547];
                    var32.field1552 = new short[var32.field1547];
                }
                for (int var36 = 0; var36 < var32.field1547; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1544[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field7090.field3092.method110(var42, (byte) 111).field6653) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field7090.field3092.method110(var43, (byte) 121).field6653) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field7090.field3092.method110(var44, (byte) 107).field6653) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1553[var36] = (short) var44;
                            var32.field1552[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field7090.field3092.method110(var45, (byte) 98).field6653) {
                                    var32.field1548[var37] = class111.field1583[class417.method2456(this.field7090.field3092.method110(var45, (byte) 100).field6642 & 65535, -116) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field7090.field3092.method110(var46, (byte) 127).field6653) {
                                    var32.field1548[var38] = class111.field1583[class417.method2456(this.field7090.field3092.method110(var46, (byte) 102).field6642 & 65535, 125) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field7090.field3092.method110(var47, (byte) 101).field6653) {
                                    var32.field1548[var39] = class111.field1583[class417.method2456(this.field7090.field3092.method110(var47, (byte) 113).field6642 & 65535, -114) & 65535];
                                }
                            }
                            var32.field1553[var36] = -1;
                        }
                    }
                }
                this.field7085[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1232(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1235(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7084 == null) {
            this.field7084 = new class4[super.field2697][super.field2693];
            this.field7093 = new class258[super.field2697][super.field2693];
        } else if (this.field7103 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2694 != var20 || var21 != 0 && super.field2694 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class258 var22 = new class258();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3695 = var23;
            var22.field3685 = new short[var23];
            var22.field3684 = new short[var23];
            var22.field3694 = new short[var23];
            var22.field3691 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3685[var25] = (short) (this.field7088[arg0][arg1] - this.field7094[arg0][arg1]);
                } else if (var30 == 0 && super.field2694 == var31) {
                    var22.field3685[var25] = (short) (this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1]);
                } else if (super.field2694 == var30 && super.field2694 == var31) {
                    var22.field3685[var25] = (short) (this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1]);
                } else if (super.field2694 == var30 && var31 == 0) {
                    var22.field3685[var25] = (short) (this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1]) * var30 + (this.field7088[arg0][arg1] - this.field7094[arg0][arg1]) * (super.field2694 - var30);
                    int var33 = (this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1]) * var30 + (this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1]) * (super.field2694 - var30);
                    var22.field3685[var25] = (short) ((super.field2694 - var31) * var32 + var31 * var33 >> super.field2695 * 2);
                }
                int var34 = (arg0 << super.field2695) + var30;
                int var35 = (arg1 << super.field2695) + var31;
                var22.field3684[var25] = (short) var30;
                var22.field3691[var25] = (short) var31;
                var22.field3694[var25] = (short) (this.method1233(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3685[var25] < 2) {
                    var22.field3685[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field7090.field3092.method110(arg11[var28], (byte) 117).field6653) {
                    var26 = true;
                }
            }
            var22.field3688 = new int[var27];
            if (arg10 != null) {
                var22.field3689 = new int[var27];
            }
            var22.field3690 = new short[var27];
            var22.field3686 = new short[var27];
            var22.field3692 = new short[var27];
            if (var26) {
                var22.field3683 = new short[var27];
                var22.field3687 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3688[var22.field3693] = class417.method2456(arg9[var29], 119);
                    } else {
                        var22.field3688[var22.field3693] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3689[var22.field3693] = class417.method2456(arg10[var29], -113);
                        } else {
                            var22.field3689[var22.field3693] = -1;
                        }
                    }
                    var22.field3690[var22.field3693] = (short) arg6[var29];
                    var22.field3686[var22.field3693] = (short) arg7[var29];
                    var22.field3692[var22.field3693] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7090.field3092.method110(arg11[var29], (byte) 119).field6653) {
                            var22.field3683[var22.field3693] = (short) arg11[var29];
                            var22.field3687[var22.field3693] = (short) arg12[var29];
                        } else {
                            var22.field3683[var22.field3693] = -1;
                        }
                    }
                    ++var22.field3693;
                }
            }
            this.field7093[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class4 var36 = new class4();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field33 = class588.method3495(class417.method2456(arg10[0], -20), this.field7088[arg0][arg1] - this.field7094[arg0][arg1], (byte) 32);
                    if (var37 == -1) {
                        var36.field34 = (byte) (var36.field34 | 2);
                    }
                }
                if (this.field7087[arg0 + 1][arg1] == this.field7087[arg0][arg1] && this.field7087[arg0 + 1][arg1 + 1] == this.field7087[arg0][arg1] && this.field7087[arg0][arg1 + 1] == this.field7087[arg0][arg1]) {
                    var36.field34 = (byte) (var36.field34 | 1);
                }
                if (var38 != -1 && (var36.field34 & 2) == 0 && !this.field7090.field3092.method110(var38, (byte) 112).field6653) {
                    var36.field37 = (short) (this.field7088[arg0][arg1] - this.field7094[arg0][arg1]);
                    var36.field32 = (short) (this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1]);
                    var36.field36 = (short) (this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1]);
                    var36.field35 = (short) (this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1]);
                    var36.field31 = (short) var38;
                } else {
                    short var39 = class417.method2456(var37, 48);
                    var36.field37 = (short) class588.method3495(var39, this.field7088[arg0][arg1] - this.field7094[arg0][arg1], (byte) -105);
                    var36.field32 = (short) class588.method3495(var39, this.field7088[arg0 + 1][arg1] - this.field7094[arg0 + 1][arg1], (byte) -96);
                    var36.field36 = (short) class588.method3495(var39, this.field7088[arg0 + 1][arg1 + 1] - this.field7094[arg0 + 1][arg1 + 1], (byte) 76);
                    var36.field35 = (short) class588.method3495(var39, this.field7088[arg0][arg1 + 1] - this.field7094[arg0][arg1 + 1], (byte) 105);
                    var36.field31 = -1;
                }
                this.field7084[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lnm;[I)V")
    public final void method1236(class405 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public abstract void method583(int arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "(IILk;)Lk;")
    public final class485 method1231(int arg0, int arg1, class485 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Law;IIII[[I[[II)V")
    public class500(class67 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7090 = arg0;
        this.field7102 = arg2;
        this.field7087 = arg5;
        this.field7088 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7090.field829 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7090.field822 * var18 + this.field7090.field834 * var16 + this.field7090.field818 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7088[var11][var10] = (byte) var20;
            }
        }
        this.field7094 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!pf", name = "aa", descriptor = "(II)I")
    public final int method1233(int arg0, int arg1) {
        int var3 = arg0 >> super.field2695;
        int var4 = arg1 >> super.field2695;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2697 - 1 && var4 <= super.field2693 - 1) {
            int var5 = arg0 & super.field2694 - 1;
            int var6 = arg1 & super.field2694 - 1;
            int var7 = (super.field2694 - var5) * this.field7087[var3][var4] + this.field7087[var3 + 1][var4] * var5 >> super.field2695;
            int var8 = (super.field2694 - var5) * this.field7087[var3][var4 + 1] + this.field7087[var3 + 1][var4 + 1] * var5 >> super.field2695;
            return (super.field2694 - var6) * var7 + var6 * var8 >> super.field2695;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1240(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "(III)V")
    public final void method1238(int arg0, int arg1, int arg2) {
        if (this.field7094[arg0][arg1] < arg2) {
            this.field7094[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
    private static final int method2984(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!pf", name = "ba", descriptor = "(II)I")
    public final int method1239(int arg0, int arg1) {
        return this.field7087[arg0][arg1];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
    public final boolean method2985(int arg0) {
        if ((this.field7102 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "()V")
    public final void method1237() {
        this.field7088 = null;
        this.field7094 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1230(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class326 var6 = this.field7090.field819;
        this.field7095 = -1;
        this.field7100 = var6.field4493;
        this.field7083 = var6.field4498;
        this.field7089 = var6.field4492;
        this.field7098 = var6.field4490;
        this.field7101 = var6.field4495;
        this.field7086 = var6.field4491;
        this.field7099 = var6.field4494;
        this.field7096 = var6.field4497;
        this.field7097 = var6.field4488;
        this.field7091 = var6.field4487;
        this.field7092 = var6.field4496;
        this.field7104 = var6.field4489;
    }
}
