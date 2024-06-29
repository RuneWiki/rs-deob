import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class117 extends class71 {

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Z")
    private boolean field2684;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    private int field2672;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    private int field2673;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIIII)I")
    private final int method812(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2682 > 0) {
            int var6 = this.field2682 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2682 += arg1;
            if (this.field2679 == -256 && (this.field2675 & 255) == 0) {
                if (class38.field1048) {
                    arg1 = method813(0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, this.field2674, this.field2673, 0, var6, arg2, this);
                } else {
                    arg1 = method835(((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, this.field2685, 0, var6, arg2, this);
                }
            } else if (class38.field1048) {
                arg1 = method842(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, this.field2674, this.field2673, 0, var6, arg2, this, this.field2679, arg4);
            } else {
                arg1 = method828(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, this.field2685, 0, var6, arg2, this, this.field2679, arg4);
            }
            this.field2682 -= arg1;
            if (this.field2682 != 0) {
                return arg1;
            }
            if (this.field2683 == Integer.MIN_VALUE) {
                this.field2683 = 0;
                this.field2678 = this.field2686 = this.field2676 = 0;
                this.method678((byte) -26);
                return arg3;
            }
            this.method824();
        }
        if (this.field2679 == -256 && (this.field2675 & 255) == 0) {
            return class38.field1048 ? method849(0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, 0, arg3, arg2, this) : method850(((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, 0, arg3, arg2, this);
        } else {
            return class38.field1048 ? method832(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, 0, arg3, arg2, this, this.field2679, arg4) : method816(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, 0, arg3, arg2, this, this.field2679, arg4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[B[IIIIIIIIIILra;)I")
    private static final int method813(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
        arg12.field2678 += (arg10 - arg4) * arg12.field2685;
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field2686 = var15 >> 2;
        arg12.field2676 = var16 >> 2;
        arg12.field2675 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([B[IIIIIIILra;)I")
    private static final int method814(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field2675 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()Lkb;")
    public final class71 method23() {
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[B[IIIIIIILra;II)I")
    private static final int method815(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        while (arg5 < var14) {
            byte var16 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field2675 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II[B[IIIIIIILra;II)I")
    private static final int method816(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var15 = arg12;
        int var16 = arg11;
        while (arg5 < var14) {
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6 >> 6;
            arg4 += var16;
        }
        arg10.field2675 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
    public final synchronized void method817(int arg0, int arg1) {
        this.method823(arg0, arg1, this.method840());
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()Z")
    public final boolean method818() {
        return this.field2675 < 0 || this.field2675 >= ((class115) super.field1790).field2659.length << 8;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[B[IIIIIIIIIILra;II)I")
    private static final int method819(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field2678 += (arg11 - arg5) * arg13.field2685;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24 + 1] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            byte var22 = arg2[arg4 >> 8];
            int var23 = (var22 << 8) + (arg4 & 255) * (var21 - var22);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field2686 = arg6;
        arg13.field2676 = arg7;
        arg13.field2675 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public final synchronized void method820(int arg0) {
        if (arg0 == 0) {
            this.method834(0);
            this.method678((byte) -26);
        } else if (this.field2686 == 0 && this.field2676 == 0) {
            this.field2682 = 0;
            this.field2683 = 0;
            this.field2678 = 0;
            this.method678((byte) -26);
        } else {
            this.field2682 = arg0;
            this.field2683 = Integer.MIN_VALUE;
            this.field2685 = -this.field2678 / arg0;
            this.field2674 = -this.field2686 / arg0;
            this.field2673 = -this.field2676 / arg0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "([III)V")
    public final synchronized void method19(int[] arg0, int arg1, int arg2) {
        if (this.field2683 == 0 && this.field2682 == 0) {
            this.method20(arg2);
        } else {
            class115 var4 = (class115) super.field1790;
            int var5 = this.field2677 << 8;
            int var6 = this.field2681 << 8;
            int var7 = var4.field2659.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2680 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2675 < 0) {
                if (this.field2679 <= 0) {
                    this.method843();
                    this.method678((byte) -26);
                    return;
                }
                this.field2675 = 0;
            }
            if (this.field2675 >= var7) {
                if (this.field2679 >= 0) {
                    this.method843();
                    this.method678((byte) -26);
                    return;
                }
                this.field2675 = var7 - 1;
            }
            if (this.field2680 < 0) {
                if (this.field2684) {
                    if (this.field2679 < 0) {
                        var9 = this.method812(arg0, arg1, var5, var10, var4.field2659[this.field2677]);
                        if (this.field2675 >= var5) {
                            return;
                        }
                        this.field2675 = var5 + var5 - 1 - this.field2675;
                        this.field2679 = -this.field2679;
                    }
                    while (true) {
                        int var11 = this.method846(arg0, var9, var6, var10, var4.field2659[this.field2681 - 1]);
                        if (this.field2675 < var6) {
                            return;
                        }
                        this.field2675 = var6 + var6 - 1 - this.field2675;
                        this.field2679 = -this.field2679;
                        var9 = this.method812(arg0, var11, var5, var10, var4.field2659[this.field2677]);
                        if (this.field2675 >= var5) {
                            return;
                        }
                        this.field2675 = var5 + var5 - 1 - this.field2675;
                        this.field2679 = -this.field2679;
                    }
                } else if (this.field2679 < 0) {
                    while (true) {
                        var9 = this.method812(arg0, var9, var5, var10, var4.field2659[this.field2681 - 1]);
                        if (this.field2675 >= var5) {
                            return;
                        }
                        this.field2675 = var6 - 1 - (var6 - 1 - this.field2675) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method846(arg0, var9, var6, var10, var4.field2659[this.field2677]);
                        if (this.field2675 < var6) {
                            return;
                        }
                        this.field2675 = (this.field2675 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2680 > 0) {
                    if (this.field2684) {
                        label130: {
                            if (this.field2679 < 0) {
                                var9 = this.method812(arg0, arg1, var5, var10, var4.field2659[this.field2677]);
                                if (this.field2675 >= var5) {
                                    return;
                                }
                                this.field2675 = var5 + var5 - 1 - this.field2675;
                                this.field2679 = -this.field2679;
                                if (--this.field2680 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method846(arg0, var9, var6, var10, var4.field2659[this.field2681 - 1]);
                                if (this.field2675 < var6) {
                                    return;
                                }
                                this.field2675 = var6 + var6 - 1 - this.field2675;
                                this.field2679 = -this.field2679;
                                if (--this.field2680 == 0) {
                                    break;
                                }
                                var9 = this.method812(arg0, var9, var5, var10, var4.field2659[this.field2677]);
                                if (this.field2675 >= var5) {
                                    return;
                                }
                                this.field2675 = var5 + var5 - 1 - this.field2675;
                                this.field2679 = -this.field2679;
                            } while (--this.field2680 != 0);
                        }
                    } else if (this.field2679 < 0) {
                        while (true) {
                            var9 = this.method812(arg0, var9, var5, var10, var4.field2659[this.field2681 - 1]);
                            if (this.field2675 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2675) / var8;
                            if (var12 >= this.field2680) {
                                this.field2675 += this.field2680 * var8;
                                this.field2680 = 0;
                                break;
                            }
                            this.field2675 += var8 * var12;
                            this.field2680 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method846(arg0, var9, var6, var10, var4.field2659[this.field2677]);
                            if (this.field2675 < var6) {
                                return;
                            }
                            int var13 = (this.field2675 - var5) / var8;
                            if (var13 >= this.field2680) {
                                this.field2675 -= this.field2680 * var8;
                                this.field2680 = 0;
                                break;
                            }
                            this.field2675 -= var8 * var13;
                            this.field2680 -= var13;
                        }
                    }
                }
                if (this.field2679 < 0) {
                    this.method812(arg0, var9, 0, var10, 0);
                    if (this.field2675 < 0) {
                        this.field2675 = -1;
                        this.method843();
                        this.method678((byte) -26);
                        return;
                    }
                } else {
                    this.method846(arg0, var9, var7, var10, 0);
                    if (this.field2675 >= var7) {
                        this.field2675 = var7;
                        this.method843();
                        this.method678((byte) -26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I")
    private static final int method821(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[B[IIIIIIIILra;)I")
    private static final int method822(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field2675 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
    public final synchronized void method823(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method848(arg1, arg2);
        } else {
            int var4 = method821(arg1, arg2);
            int var5 = method829(arg1, arg2);
            if (this.field2686 == var4 && this.field2676 == var5) {
                this.field2682 = 0;
            } else {
                this.field2682 = arg0;
                this.field2683 = arg1;
                this.field2672 = arg2;
                this.field2685 = (arg1 - this.field2678) / arg0;
                this.field2674 = (var4 - this.field2686) / arg0;
                this.field2673 = (var5 - this.field2676) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()V")
    private final void method824() {
        this.field2678 = this.field2683;
        this.field2686 = method821(this.field2683, this.field2672);
        this.field2676 = method829(this.field2683, this.field2672);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public final synchronized void method825(int arg0) {
        this.method848(arg0 << 6, this.method840());
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final synchronized void method20(int arg0) {
        if (this.field2682 > 0) {
            if (arg0 >= this.field2682) {
                if (this.field2683 == Integer.MIN_VALUE) {
                    this.field2683 = 0;
                    this.field2678 = this.field2686 = this.field2676 = 0;
                    this.method678((byte) -26);
                    arg0 = this.field2682;
                }
                this.field2682 = 0;
                this.method824();
            } else {
                this.field2678 += this.field2685 * arg0;
                this.field2686 += this.field2674 * arg0;
                this.field2676 += this.field2673 * arg0;
                this.field2682 -= arg0;
            }
        }
        class115 var2 = (class115) super.field1790;
        int var3 = this.field2677 << 8;
        int var4 = this.field2681 << 8;
        int var5 = var2.field2659.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2680 = 0;
        }
        if (this.field2675 < 0) {
            if (this.field2679 <= 0) {
                this.method843();
                this.method678((byte) -26);
                return;
            }
            this.field2675 = 0;
        }
        if (this.field2675 >= var5) {
            if (this.field2679 >= 0) {
                this.method843();
                this.method678((byte) -26);
                return;
            }
            this.field2675 = var5 - 1;
        }
        this.field2675 += this.field2679 * arg0;
        if (this.field2680 < 0) {
            if (!this.field2684) {
                if (this.field2679 < 0) {
                    if (this.field2675 < var3) {
                        this.field2675 = var4 - 1 - (var4 - 1 - this.field2675) % var6;
                    }
                } else if (this.field2675 >= var4) {
                    this.field2675 = (this.field2675 - var3) % var6 + var3;
                }
            } else {
                if (this.field2679 < 0) {
                    if (this.field2675 >= var3) {
                        return;
                    }
                    this.field2675 = var3 + var3 - 1 - this.field2675;
                    this.field2679 = -this.field2679;
                }
                while (this.field2675 >= var4) {
                    this.field2675 = var4 + var4 - 1 - this.field2675;
                    this.field2679 = -this.field2679;
                    if (this.field2675 >= var3) {
                        return;
                    }
                    this.field2675 = var3 + var3 - 1 - this.field2675;
                    this.field2679 = -this.field2679;
                }
            }
        } else {
            if (this.field2680 > 0) {
                if (this.field2684) {
                    label125: {
                        if (this.field2679 < 0) {
                            if (this.field2675 >= var3) {
                                return;
                            }
                            this.field2675 = var3 + var3 - 1 - this.field2675;
                            this.field2679 = -this.field2679;
                            if (--this.field2680 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2675 < var4) {
                                return;
                            }
                            this.field2675 = var4 + var4 - 1 - this.field2675;
                            this.field2679 = -this.field2679;
                            if (--this.field2680 == 0) {
                                break;
                            }
                            if (this.field2675 >= var3) {
                                return;
                            }
                            this.field2675 = var3 + var3 - 1 - this.field2675;
                            this.field2679 = -this.field2679;
                        } while (--this.field2680 != 0);
                    }
                } else if (this.field2679 < 0) {
                    if (this.field2675 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2675) / var6;
                    if (var7 < this.field2680) {
                        this.field2675 += var6 * var7;
                        this.field2680 -= var7;
                        return;
                    }
                    this.field2675 += this.field2680 * var6;
                    this.field2680 = 0;
                } else {
                    if (this.field2675 < var4) {
                        return;
                    }
                    int var8 = (this.field2675 - var3) / var6;
                    if (var8 < this.field2680) {
                        this.field2675 -= var6 * var8;
                        this.field2680 -= var8;
                        return;
                    }
                    this.field2675 -= this.field2680 * var6;
                    this.field2680 = 0;
                }
            }
            if (this.field2679 < 0) {
                if (this.field2675 < 0) {
                    this.field2675 = -1;
                    this.method843();
                    this.method678((byte) -26);
                    return;
                }
            } else if (this.field2675 >= var5) {
                this.field2675 = var5;
                this.method843();
                this.method678((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "()I")
    public final synchronized int method826() {
        return this.field2683 == Integer.MIN_VALUE ? 0 : this.field2683;
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "()Z")
    public final boolean method827() {
        return this.field2682 != 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[B[IIIIIIIILra;II)I")
    private static final int method828(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field2686 += (arg9 - arg5) * arg11.field2674;
        arg11.field2676 += (arg9 - arg5) * arg11.field2673;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        int var17 = arg12;
        while (arg5 < var15) {
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var17;
        }
        arg11.field2678 = arg6;
        arg11.field2675 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)I")
    private static final int method829(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public final synchronized void method830(boolean arg0) {
        this.field2679 = (this.field2679 >>> 31) + (this.field2679 ^ this.field2679 >> 31);
        if (arg0) {
            this.field2679 = -this.field2679;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public final synchronized void method831(int arg0) {
        int var2 = ((class115) super.field1790).field2659.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2675 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II[B[IIIIIIIILra;II)I")
    private static final int method832(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var21 = arg4 >> 8;
            byte var22 = arg2[var21 - 1];
            int var23 = (var22 << 8) + (arg4 & 255) * (arg2[var21] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            int var20 = (var19 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var19);
            var10001 = var15++;
            arg3[var10001] += arg6 * var20 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var20 >> 6;
            arg4 += arg12;
        }
        arg11.field2675 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II[B[IIIIIIIILra;II)I")
    private static final int method833(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var22 = arg4 >> 8;
            byte var23 = arg2[var22];
            int var24 = (var23 << 8) + (arg4 & 255) * (arg2[var22 + 1] - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var17 = arg9;
        }
        int var18 = var17 << 1;
        int var19 = arg13;
        while (var15 < var18) {
            byte var20 = arg2[arg4 >> 8];
            int var21 = (var20 << 8) + (arg4 & 255) * (var19 - var20);
            var10001 = var15++;
            arg3[var10001] += arg6 * var21 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var21 >> 6;
            arg4 += arg12;
        }
        arg11.field2675 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    private final synchronized void method834(int arg0) {
        this.method848(arg0, this.method840());
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([B[IIIIIIIILra;)I")
    private static final int method835(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        arg9.field2686 += (arg7 - arg3) * arg9.field2674;
        arg9.field2676 += (arg7 - arg3) * arg9.field2673;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field2678 = var12 >> 2;
        arg9.field2675 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I[B[IIIIIIIIIILra;)I")
    private static final int method836(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
        arg12.field2678 += (arg10 - arg4) * arg12.field2685;
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var23 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var23;
            int var24 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var23;
            int var25 = var16 + var18;
            byte var26 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var24 * var26;
            int var27 = var17 + var24;
            int var37 = var20++;
            arg2[var37] += var25 * var26;
            int var28 = var18 + var25;
            byte var29 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var27 * var29;
            int var30 = var17 + var27;
            int var40 = var20++;
            arg2[var40] += var28 * var29;
            int var31 = var18 + var28;
            byte var32 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var30 * var32;
            var15 = var17 + var30;
            int var43 = var20++;
            arg2[var43] += var31 * var32;
            var16 = var18 + var31;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var22 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var22;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var22;
            var16 += var18;
        }
        arg12.field2686 = var15 >> 2;
        arg12.field2676 = var16 >> 2;
        arg12.field2675 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()I")
    public final int method21() {
        return this.field2683 == 0 && this.field2682 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public final synchronized void method837(int arg0) {
        if (this.field2679 < 0) {
            this.field2679 = -arg0;
        } else {
            this.field2679 = arg0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
    public final synchronized void method838(int arg0) {
        this.field2680 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()I")
    public final int method543() {
        int var1 = this.field2678 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2680 == 0) {
            var2 -= this.field2675 * var2 / (((class115) super.field1790).field2659.length << 8);
        } else if (this.field2680 >= 0) {
            var2 -= this.field2677 * var2 / ((class115) super.field1790).field2659.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "()I")
    public final synchronized int method839() {
        return this.field2679 < 0 ? -this.field2679 : this.field2679;
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
    public final synchronized int method840() {
        return this.field2672 < 0 ? -1 : this.field2672;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lkb;")
    public final class71 method29() {
        return null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "([B[IIIIIIIILra;)I")
    private static final int method841(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        arg9.field2686 += (arg7 - arg3) * arg9.field2674;
        arg9.field2676 += (arg7 - arg3) * arg9.field2673;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field2678 = var12 >> 2;
        arg9.field2675 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II[B[IIIIIIIIIILra;II)I")
    private static final int method842(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field2678 += (arg11 - arg5) * arg13.field2685;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var23 = arg4 >> 8;
            byte var24 = arg2[var23 - 1];
            int var25 = (var24 << 8) + (arg4 & 255) * (arg2[var23] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            int var26 = var17++;
            arg3[var26] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var19;
        if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var19 = arg11;
        }
        int var20 = var19 << 1;
        int var21 = arg15;
        while (var17 < var20) {
            int var22 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var22 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var22 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field2686 = arg6;
        arg13.field2676 = arg7;
        arg13.field2675 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "()V")
    private final void method843() {
        if (this.field2682 != 0) {
            if (this.field2683 == Integer.MIN_VALUE) {
                this.field2683 = 0;
            }
            this.field2682 = 0;
            this.method824();
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(II[B[IIIIIIIILra;II)I")
    private static final int method844(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field2686 += (arg9 - arg5) * arg11.field2674;
        arg11.field2676 += (arg9 - arg5) * arg11.field2673;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var18 = arg4 >> 8;
            byte var19 = arg2[var18];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18 + 1] - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var15;
        if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var15 = arg9;
        }
        int var16 = arg13;
        while (arg5 < var15) {
            byte var17 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (var16 - var17)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field2678 = arg6;
        arg11.field2675 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqe;II)Lra;")
    public static final class117 method845(class115 arg0, int arg1, int arg2) {
        return arg0.field2659 != null && arg0.field2659.length != 0 ? new class117(arg0, (int) ((long) arg0.field2656 * 256L * (long) arg1 / (long) (class37.field1007 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "([IIIII)I")
    private final int method846(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2682 > 0) {
            int var6 = this.field2682 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2682 += arg1;
            if (this.field2679 == 256 && (this.field2675 & 255) == 0) {
                if (class38.field1048) {
                    arg1 = method836(0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, this.field2674, this.field2673, 0, var6, arg2, this);
                } else {
                    arg1 = method841(((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, this.field2685, 0, var6, arg2, this);
                }
            } else if (class38.field1048) {
                arg1 = method819(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, this.field2674, this.field2673, 0, var6, arg2, this, this.field2679, arg4);
            } else {
                arg1 = method844(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, this.field2685, 0, var6, arg2, this, this.field2679, arg4);
            }
            this.field2682 -= arg1;
            if (this.field2682 != 0) {
                return arg1;
            }
            if (this.field2683 == Integer.MIN_VALUE) {
                this.field2683 = 0;
                this.field2678 = this.field2686 = this.field2676 = 0;
                this.method678((byte) -26);
                return arg3;
            }
            this.method824();
        }
        if (this.field2679 == 256 && (this.field2675 & 255) == 0) {
            return class38.field1048 ? method822(0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, 0, arg3, arg2, this) : method814(((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, 0, arg3, arg2, this);
        } else {
            return class38.field1048 ? method833(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2686, this.field2676, 0, arg3, arg2, this, this.field2679, arg4) : method815(0, 0, ((class115) super.field1790).field2659, arg0, this.field2675, arg1, this.field2678, 0, arg3, arg2, this, this.field2679, arg4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqe;III)Lra;")
    public static final class117 method847(class115 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2659 != null && arg0.field2659.length != 0 ? new class117(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)V")
    private final synchronized void method848(int arg0, int arg1) {
        this.field2683 = arg0;
        this.field2672 = arg1;
        this.field2682 = 0;
        this.method824();
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqe;II)V")
    private class117(class115 arg0, int arg1, int arg2) {
        super.field1790 = arg0;
        this.field2677 = arg0.field2657;
        this.field2681 = arg0.field2658;
        this.field2684 = arg0.field2655;
        this.field2679 = arg1;
        this.field2683 = arg2;
        this.field2672 = 8192;
        this.field2675 = 0;
        this.method824();
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I[B[IIIIIIIILra;)I")
    private static final int method849(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var19 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var19;
            int var25 = var16++;
            arg2[var25] += var14 * var19;
            byte var20 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var20;
            int var28 = var16++;
            arg2[var28] += var14 * var20;
            byte var21 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var21;
            int var31 = var16++;
            arg2[var31] += var14 * var21;
            byte var22 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var22;
            int var34 = var16++;
            arg2[var34] += var14 * var22;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var18 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var18;
            int var35 = var16++;
            arg2[var35] += var14 * var18;
        }
        arg10.field2675 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "([B[IIIIIIILra;)I")
    private static final int method850(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field2675 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqe;III)V")
    private class117(class115 arg0, int arg1, int arg2, int arg3) {
        super.field1790 = arg0;
        this.field2677 = arg0.field2657;
        this.field2681 = arg0.field2658;
        this.field2684 = arg0.field2655;
        this.field2679 = arg1;
        this.field2683 = arg2;
        this.field2672 = arg3;
        this.field2675 = 0;
        this.method824();
    }
}
