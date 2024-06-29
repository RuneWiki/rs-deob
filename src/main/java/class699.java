import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class699 extends class766 {

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    private int field9803;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field9800;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Z")
    private boolean field9797;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private int field9796;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    private int field9801;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    private int field9807;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    private int field9799;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field9793;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    private int field9794;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    private int field9795;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field9798;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    private int field9802;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    private int field9804;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    private int field9805;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    private int field9806;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lks;III)Lab;", line = 4)
    public static final class699 method3855(class465 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6457 != null && arg0.field6457.length != 0 ? new class699(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()Z", line = 10)
    public final boolean method3856() {
        return this.field9799 < 0 || this.field9799 >= ((class465) super.field10576).field6457.length << 8;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B[IIIIIIIIIILab;)I", line = 13)
    private static final int method3857(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class699 arg12) {
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
        arg12.field9798 += (var19 - arg4) * arg12.field9802;
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
        arg12.field9794 = var15 >> 2;
        arg12.field9805 = var16 >> 2;
        arg12.field9799 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 66)
    private final void method3858() {
        this.field9798 = this.field9801;
        this.field9794 = method3866(this.field9801, this.field9807);
        this.field9805 = method3869(this.field9801, this.field9807);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I[B[IIIIIIIIIILab;)I", line = 72)
    private static final int method3859(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class699 arg12) {
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
        arg12.field9798 += (var19 - arg4) * arg12.field9802;
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
        arg12.field9794 = var15 >> 2;
        arg12.field9805 = var16 >> 2;
        arg12.field9799 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B[IIIIIIIILab;)I", line = 127)
    private static final int method3860(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class699 arg10) {
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
        arg10.field9799 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([B[IIIIIIILab;)I", line = 166)
    private static final int method3861(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class699 arg8) {
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
        arg8.field9799 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 195)
    public final synchronized void method3862(int arg0) {
        int var2 = ((class465) super.field10576).field6457.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field9799 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([B[IIIIIIIILab;)I", line = 205)
    private static final int method3863(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class699 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field9794 += (var14 - arg3) * arg9.field9795;
        arg9.field9805 += (var14 - arg3) * arg9.field9804;
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
        arg9.field9798 = var12 >> 2;
        arg9.field9799 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I[B[IIIIIIIILab;)I", line = 240)
    private static final int method3864(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class699 arg10) {
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
        arg10.field9799 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[B[IIIIIIIILab;II)I", line = 279)
    private static final int method3865(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class699 arg11, int arg12, int arg13) {
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
        arg11.field9799 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V", line = 311)
    public final synchronized void method593(int[] arg0, int arg1, int arg2) {
        if (this.field9801 == 0 && this.field9793 == 0) {
            this.method596(arg2);
        } else {
            class465 var4 = (class465) super.field10576;
            int var5 = this.field9803 << 8;
            int var6 = this.field9800 << 8;
            int var7 = var4.field6457.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field9806 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field9799 < 0) {
                if (this.field9796 <= 0) {
                    this.method3876();
                    this.method792((byte) -89);
                    return;
                }
                this.field9799 = 0;
            }
            if (this.field9799 >= var7) {
                if (this.field9796 >= 0) {
                    this.method3876();
                    this.method792((byte) -128);
                    return;
                }
                this.field9799 = var7 - 1;
            }
            if (this.field9806 < 0) {
                if (this.field9797) {
                    if (this.field9796 < 0) {
                        var9 = this.method3890(arg0, arg1, var5, var10, var4.field6457[this.field9803]);
                        if (this.field9799 >= var5) {
                            return;
                        }
                        this.field9799 = var5 + var5 - 1 - this.field9799;
                        this.field9796 = -this.field9796;
                    }
                    while (true) {
                        int var11 = this.method3880(arg0, var9, var6, var10, var4.field6457[this.field9800 - 1]);
                        if (this.field9799 < var6) {
                            return;
                        }
                        this.field9799 = var6 + var6 - 1 - this.field9799;
                        this.field9796 = -this.field9796;
                        var9 = this.method3890(arg0, var11, var5, var10, var4.field6457[this.field9803]);
                        if (this.field9799 >= var5) {
                            return;
                        }
                        this.field9799 = var5 + var5 - 1 - this.field9799;
                        this.field9796 = -this.field9796;
                    }
                } else if (this.field9796 < 0) {
                    while (true) {
                        var9 = this.method3890(arg0, var9, var5, var10, var4.field6457[this.field9800 - 1]);
                        if (this.field9799 >= var5) {
                            return;
                        }
                        this.field9799 = var6 - 1 - (var6 - 1 - this.field9799) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3880(arg0, var9, var6, var10, var4.field6457[this.field9803]);
                        if (this.field9799 < var6) {
                            return;
                        }
                        this.field9799 = (this.field9799 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field9806 > 0) {
                    if (this.field9797) {
                        label130: {
                            if (this.field9796 < 0) {
                                var9 = this.method3890(arg0, arg1, var5, var10, var4.field6457[this.field9803]);
                                if (this.field9799 >= var5) {
                                    return;
                                }
                                this.field9799 = var5 + var5 - 1 - this.field9799;
                                this.field9796 = -this.field9796;
                                if (--this.field9806 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3880(arg0, var9, var6, var10, var4.field6457[this.field9800 - 1]);
                                if (this.field9799 < var6) {
                                    return;
                                }
                                this.field9799 = var6 + var6 - 1 - this.field9799;
                                this.field9796 = -this.field9796;
                                if (--this.field9806 == 0) {
                                    break;
                                }
                                var9 = this.method3890(arg0, var9, var5, var10, var4.field6457[this.field9803]);
                                if (this.field9799 >= var5) {
                                    return;
                                }
                                this.field9799 = var5 + var5 - 1 - this.field9799;
                                this.field9796 = -this.field9796;
                            } while (--this.field9806 != 0);
                        }
                    } else if (this.field9796 < 0) {
                        while (true) {
                            var9 = this.method3890(arg0, var9, var5, var10, var4.field6457[this.field9800 - 1]);
                            if (this.field9799 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field9799) / var8;
                            if (var12 >= this.field9806) {
                                this.field9799 += this.field9806 * var8;
                                this.field9806 = 0;
                                break;
                            }
                            this.field9799 += var8 * var12;
                            this.field9806 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3880(arg0, var9, var6, var10, var4.field6457[this.field9803]);
                            if (this.field9799 < var6) {
                                return;
                            }
                            int var13 = (this.field9799 - var5) / var8;
                            if (var13 >= this.field9806) {
                                this.field9799 -= this.field9806 * var8;
                                this.field9806 = 0;
                                break;
                            }
                            this.field9799 -= var8 * var13;
                            this.field9806 -= var13;
                        }
                    }
                }
                if (this.field9796 < 0) {
                    this.method3890(arg0, var9, 0, var10, 0);
                    if (this.field9799 < 0) {
                        this.field9799 = -1;
                        this.method3876();
                        this.method792((byte) -125);
                        return;
                    }
                } else {
                    this.method3880(arg0, var9, var7, var10, 0);
                    if (this.field9799 >= var7) {
                        this.field9799 = var7;
                        this.method3876();
                        this.method792((byte) -103);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I", line = 548)
    private static final int method3866(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V", line = 552)
    public final synchronized void method3867(int arg0, int arg1) {
        this.method3874(arg0, arg1, this.method3886());
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()I", line = 555)
    public final synchronized int method3868() {
        return this.field9801 == Integer.MIN_VALUE ? 0 : this.field9801;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)I", line = 558)
    private static final int method3869(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I", line = 561)
    public final int method591() {
        return this.field9801 == 0 && this.field9793 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[B[IIIIIIILab;II)I", line = 567)
    private static final int method3870(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class699 arg10, int arg11, int arg12) {
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
        arg10.field9799 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([B[IIIIIIILab;)I", line = 593)
    private static final int method3871(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class699 arg8) {
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
        arg8.field9799 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[B[IIIIIIIIIILab;II)I", line = 618)
    private static final int method3872(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class699 arg13, int arg14, int arg15) {
        arg13.field9798 -= arg13.field9802 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24 - 1];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
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
            int var23 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field9798 += arg13.field9802 * var22;
        arg13.field9794 = arg6;
        arg13.field9805 = arg7;
        arg13.field9799 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()Z", line = 660)
    private final boolean method3873() {
        int var1 = this.field9801;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3866(var1, this.field9807);
            var2 = method3869(var1, this.field9807);
        }
        if (this.field9798 == var1 && this.field9794 == var3 && this.field9805 == var2) {
            if (this.field9801 == Integer.MIN_VALUE) {
                this.field9801 = 0;
                this.field9798 = this.field9794 = this.field9805 = 0;
                this.method792((byte) -113);
                return true;
            } else {
                this.method3858();
                return false;
            }
        } else {
            if (this.field9798 < var1) {
                this.field9802 = 1;
                this.field9793 = var1 - this.field9798;
            } else if (this.field9798 > var1) {
                this.field9802 = -1;
                this.field9793 = this.field9798 - var1;
            } else {
                this.field9802 = 0;
            }
            if (this.field9794 < var3) {
                this.field9795 = 1;
                if (this.field9793 == 0 || this.field9793 > var3 - this.field9794) {
                    this.field9793 = var3 - this.field9794;
                }
            } else if (this.field9794 > var3) {
                this.field9795 = -1;
                if (this.field9793 == 0 || this.field9793 > this.field9794 - var3) {
                    this.field9793 = this.field9794 - var3;
                }
            } else {
                this.field9795 = 0;
            }
            if (this.field9805 < var2) {
                this.field9804 = 1;
                if (this.field9793 == 0 || this.field9793 > var2 - this.field9805) {
                    this.field9793 = var2 - this.field9805;
                }
            } else if (this.field9805 > var2) {
                this.field9804 = -1;
                if (this.field9793 == 0 || this.field9793 > this.field9805 - var2) {
                    this.field9793 = this.field9805 - var2;
                }
            } else {
                this.field9804 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V", line = 745)
    public final synchronized void method3874(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3887(arg1, arg2);
        } else {
            int var4 = method3866(arg1, arg2);
            int var5 = method3869(arg1, arg2);
            if (this.field9794 == var4 && this.field9805 == var5) {
                this.field9793 = 0;
            } else {
                int var6 = arg1 - this.field9798;
                if (this.field9798 - arg1 > var6) {
                    var6 = this.field9798 - arg1;
                }
                if (var4 - this.field9794 > var6) {
                    var6 = var4 - this.field9794;
                }
                if (this.field9794 - var4 > var6) {
                    var6 = this.field9794 - var4;
                }
                if (var5 - this.field9805 > var6) {
                    var6 = var5 - this.field9805;
                }
                if (this.field9805 - var5 > var6) {
                    var6 = this.field9805 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field9793 = arg0;
                this.field9801 = arg1;
                this.field9807 = arg2;
                this.field9802 = (arg1 - this.field9798) / arg0;
                this.field9795 = (var4 - this.field9794) / arg0;
                this.field9804 = (var5 - this.field9805) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 791)
    public final synchronized void method3875(boolean arg0) {
        this.field9796 = (this.field9796 >>> 31) + (this.field9796 ^ this.field9796 >> 31);
        if (arg0) {
            this.field9796 = -this.field9796;
        }
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "()V", line = 797)
    private final void method3876() {
        if (this.field9793 != 0) {
            if (this.field9801 == Integer.MIN_VALUE) {
                this.field9801 = 0;
            }
            this.field9793 = 0;
            this.method3858();
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()Lsia;", line = 808)
    public final class766 method592() {
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II[B[IIIIIIIIIILab;II)I", line = 811)
    private static final int method3877(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class699 arg13, int arg14, int arg15) {
        arg13.field9798 -= arg13.field9802 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var25 = arg4 >> 8;
            byte var26 = arg2[var25];
            int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
            var10001 = var17++;
            arg3[var10001] += arg6 * var27 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var27 >> 6;
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
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 255) * (var21 - var23);
            var10001 = var17++;
            arg3[var10001] += arg6 * var24 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22 = var17 >> 1;
        arg13.field9798 += arg13.field9802 * var22;
        arg13.field9794 = arg6;
        arg13.field9805 = arg7;
        arg13.field9799 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 855)
    public final synchronized void method3878(int arg0) {
        if (this.field9796 < 0) {
            this.field9796 = -arg0;
        } else {
            this.field9796 = arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([B[IIIIIIIILab;)I", line = 863)
    private static final int method3879(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class699 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field9794 += (var14 - arg3) * arg9.field9795;
        arg9.field9805 += (var14 - arg3) * arg9.field9804;
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
        arg9.field9798 = var12 >> 2;
        arg9.field9799 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIIII)I", line = 899)
    private final int method3880(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9793 <= 0) {
                if (this.field9796 == 256 && (this.field9799 & 255) == 0) {
                    if (class418.field6010) {
                        return method3864(0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, 0, arg3, arg2, this);
                    }
                    return method3871(((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, 0, arg3, arg2, this);
                }
                if (class418.field6010) {
                    return method3881(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, 0, arg3, arg2, this, this.field9796, arg4);
                }
                return method3870(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, 0, arg3, arg2, this, this.field9796, arg4);
            }
            int var6 = this.field9793 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9793 += arg1;
            if (this.field9796 == 256 && (this.field9799 & 255) == 0) {
                if (class418.field6010) {
                    arg1 = method3857(0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, this.field9795, this.field9804, 0, var6, arg2, this);
                } else {
                    arg1 = method3863(((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, this.field9802, 0, var6, arg2, this);
                }
            } else if (class418.field6010) {
                arg1 = method3877(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, this.field9795, this.field9804, 0, var6, arg2, this, this.field9796, arg4);
            } else {
                arg1 = method3882(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, this.field9802, 0, var6, arg2, this, this.field9796, arg4);
            }
            this.field9793 -= arg1;
            if (this.field9793 != 0) {
                return arg1;
            }
        } while (!this.method3873());
        return arg3;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II[B[IIIIIIIILab;II)I", line = 954)
    private static final int method3881(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class699 arg11, int arg12, int arg13) {
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
        arg11.field9799 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II[B[IIIIIIIILab;II)I", line = 989)
    private static final int method3882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class699 arg11, int arg12, int arg13) {
        arg11.field9794 -= arg11.field9795 * arg5;
        arg11.field9805 -= arg11.field9804 * arg5;
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
        arg11.field9794 += arg11.field9795 * arg5;
        arg11.field9805 += arg11.field9804 * arg5;
        arg11.field9798 = arg6;
        arg11.field9799 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 1024)
    public final synchronized void method596(int arg0) {
        if (this.field9793 > 0) {
            if (arg0 >= this.field9793) {
                if (this.field9801 == Integer.MIN_VALUE) {
                    this.field9801 = 0;
                    this.field9798 = this.field9794 = this.field9805 = 0;
                    this.method792((byte) -97);
                    arg0 = this.field9793;
                }
                this.field9793 = 0;
                this.method3858();
            } else {
                this.field9798 += this.field9802 * arg0;
                this.field9794 += this.field9795 * arg0;
                this.field9805 += this.field9804 * arg0;
                this.field9793 -= arg0;
            }
        }
        class465 var2 = (class465) super.field10576;
        int var3 = this.field9803 << 8;
        int var4 = this.field9800 << 8;
        int var5 = var2.field6457.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field9806 = 0;
        }
        if (this.field9799 < 0) {
            if (this.field9796 <= 0) {
                this.method3876();
                this.method792((byte) -98);
                return;
            }
            this.field9799 = 0;
        }
        if (this.field9799 >= var5) {
            if (this.field9796 >= 0) {
                this.method3876();
                this.method792((byte) -100);
                return;
            }
            this.field9799 = var5 - 1;
        }
        this.field9799 += this.field9796 * arg0;
        if (this.field9806 < 0) {
            if (!this.field9797) {
                if (this.field9796 < 0) {
                    if (this.field9799 < var3) {
                        this.field9799 = var4 - 1 - (var4 - 1 - this.field9799) % var6;
                    }
                } else if (this.field9799 >= var4) {
                    this.field9799 = (this.field9799 - var3) % var6 + var3;
                }
            } else {
                if (this.field9796 < 0) {
                    if (this.field9799 >= var3) {
                        return;
                    }
                    this.field9799 = var3 + var3 - 1 - this.field9799;
                    this.field9796 = -this.field9796;
                }
                while (this.field9799 >= var4) {
                    this.field9799 = var4 + var4 - 1 - this.field9799;
                    this.field9796 = -this.field9796;
                    if (this.field9799 >= var3) {
                        return;
                    }
                    this.field9799 = var3 + var3 - 1 - this.field9799;
                    this.field9796 = -this.field9796;
                }
            }
        } else {
            if (this.field9806 > 0) {
                if (this.field9797) {
                    label125: {
                        if (this.field9796 < 0) {
                            if (this.field9799 >= var3) {
                                return;
                            }
                            this.field9799 = var3 + var3 - 1 - this.field9799;
                            this.field9796 = -this.field9796;
                            if (--this.field9806 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field9799 < var4) {
                                return;
                            }
                            this.field9799 = var4 + var4 - 1 - this.field9799;
                            this.field9796 = -this.field9796;
                            if (--this.field9806 == 0) {
                                break;
                            }
                            if (this.field9799 >= var3) {
                                return;
                            }
                            this.field9799 = var3 + var3 - 1 - this.field9799;
                            this.field9796 = -this.field9796;
                        } while (--this.field9806 != 0);
                    }
                } else if (this.field9796 < 0) {
                    if (this.field9799 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field9799) / var6;
                    if (var7 < this.field9806) {
                        this.field9799 += var6 * var7;
                        this.field9806 -= var7;
                        return;
                    }
                    this.field9799 += this.field9806 * var6;
                    this.field9806 = 0;
                } else {
                    if (this.field9799 < var4) {
                        return;
                    }
                    int var8 = (this.field9799 - var3) / var6;
                    if (var8 < this.field9806) {
                        this.field9799 -= var6 * var8;
                        this.field9806 -= var8;
                        return;
                    }
                    this.field9799 -= this.field9806 * var6;
                    this.field9806 = 0;
                }
            }
            if (this.field9796 < 0) {
                if (this.field9799 < 0) {
                    this.field9799 = -1;
                    this.method3876();
                    this.method792((byte) -115);
                    return;
                }
            } else if (this.field9799 >= var5) {
                this.field9799 = var5;
                this.method3876();
                this.method792((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "()I", line = 1242)
    public final synchronized int method3883() {
        return this.field9796 < 0 ? -this.field9796 : this.field9796;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 1245)
    public final synchronized void method3884(int arg0) {
        this.method3887(arg0 << 6, this.method3886());
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II[B[IIIIIIILab;II)I", line = 1250)
    private static final int method3885(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class699 arg10, int arg11, int arg12) {
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
        arg10.field9799 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "()I", line = 1276)
    public final synchronized int method3886() {
        return this.field9807 < 0 ? -1 : this.field9807;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)V", line = 1279)
    private final synchronized void method3887(int arg0, int arg1) {
        this.field9801 = arg0;
        this.field9807 = arg1;
        this.field9793 = 0;
        this.method3858();
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V", line = 1287)
    public final synchronized void method3888(int arg0) {
        this.field9806 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()Lsia;", line = 1290)
    public final class766 method595() {
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V", line = 1293)
    public final synchronized void method3889(int arg0) {
        this.method3887(this.method3868(), arg0);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([IIIII)I", line = 1296)
    private final int method3890(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9793 <= 0) {
                if (this.field9796 == -256 && (this.field9799 & 255) == 0) {
                    if (class418.field6010) {
                        return method3860(0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, 0, arg3, arg2, this);
                    }
                    return method3861(((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, 0, arg3, arg2, this);
                }
                if (class418.field6010) {
                    return method3865(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, 0, arg3, arg2, this, this.field9796, arg4);
                }
                return method3885(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, 0, arg3, arg2, this, this.field9796, arg4);
            }
            int var6 = this.field9793 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9793 += arg1;
            if (this.field9796 == -256 && (this.field9799 & 255) == 0) {
                if (class418.field6010) {
                    arg1 = method3859(0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, this.field9795, this.field9804, 0, var6, arg2, this);
                } else {
                    arg1 = method3879(((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, this.field9802, 0, var6, arg2, this);
                }
            } else if (class418.field6010) {
                arg1 = method3872(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9794, this.field9805, this.field9795, this.field9804, 0, var6, arg2, this, this.field9796, arg4);
            } else {
                arg1 = method3894(0, 0, ((class465) super.field10576).field6457, arg0, this.field9799, arg1, this.field9798, this.field9802, 0, var6, arg2, this, this.field9796, arg4);
            }
            this.field9793 -= arg1;
            if (this.field9793 != 0) {
                return arg1;
            }
        } while (!this.method3873());
        return arg3;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V", line = 1352)
    private final synchronized void method3891(int arg0) {
        this.method3887(arg0, this.method3886());
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V", line = 1356)
    public final synchronized void method3892(int arg0) {
        if (arg0 == 0) {
            this.method3891(0);
            this.method792((byte) -112);
        } else if (this.field9794 == 0 && this.field9805 == 0) {
            this.field9793 = 0;
            this.field9801 = 0;
            this.field9798 = 0;
            this.method792((byte) -112);
        } else {
            int var2 = -this.field9798;
            if (this.field9798 > var2) {
                var2 = this.field9798;
            }
            if (-this.field9794 > var2) {
                var2 = -this.field9794;
            }
            if (this.field9794 > var2) {
                var2 = this.field9794;
            }
            if (-this.field9805 > var2) {
                var2 = -this.field9805;
            }
            if (this.field9805 > var2) {
                var2 = this.field9805;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field9793 = arg0;
            this.field9801 = Integer.MIN_VALUE;
            this.field9802 = -this.field9798 / arg0;
            this.field9795 = -this.field9794 / arg0;
            this.field9804 = -this.field9805 / arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "()Z", line = 1401)
    public final boolean method3893() {
        return this.field9793 != 0;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(II[B[IIIIIIIILab;II)I", line = 1406)
    private static final int method3894(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class699 arg11, int arg12, int arg13) {
        arg11.field9794 -= arg11.field9795 * arg5;
        arg11.field9805 -= arg11.field9804 * arg5;
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
        arg11.field9794 += arg11.field9795 * arg5;
        arg11.field9805 += arg11.field9804 * arg5;
        arg11.field9798 = arg6;
        arg11.field9799 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I", line = 1440)
    public final int method3895() {
        int var1 = this.field9798 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field9806 == 0) {
            var2 -= this.field9799 * var2 / (((class465) super.field10576).field6457.length << 8);
        } else if (this.field9806 >= 0) {
            var2 -= this.field9803 * var2 / ((class465) super.field10576).field6457.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lks;III)V", line = 1456)
    private class699(class465 arg0, int arg1, int arg2, int arg3) {
        super.field10576 = arg0;
        this.field9803 = arg0.field6459;
        this.field9800 = arg0.field6458;
        this.field9797 = arg0.field6456;
        this.field9796 = arg1;
        this.field9801 = arg2;
        this.field9807 = arg3;
        this.field9799 = 0;
        this.method3858();
    }
}
