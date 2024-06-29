import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class704 extends class529 {

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    private int field9895;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    private int field9897;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Z")
    private boolean field9892;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    private int field9894;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    private int field9903;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    private int field9899;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    private int field9901;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    private int field9889;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    private int field9890;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    private int field9891;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    private int field9893;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    private int field9896;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    private int field9898;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    private int field9900;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    private int field9902;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II[B[IIIIIIIIIILam;II)I")
    private static final int method3897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class704 arg13, int arg14, int arg15) {
        arg13.field9902 -= arg13.field9896 * arg5;
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
        arg13.field9902 += arg13.field9896 * var22;
        arg13.field9898 = arg6;
        arg13.field9900 = arg7;
        arg13.field9901 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "()Z")
    public final boolean method3898() {
        return this.field9889 != 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([IIIII)I")
    private final int method3899(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9889 <= 0) {
                if (this.field9894 == -256 && (this.field9901 & 255) == 0) {
                    if (class60.field614) {
                        return method3926(0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, 0, arg3, arg2, this);
                    }
                    return method3924(((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, 0, arg3, arg2, this);
                }
                if (class60.field614) {
                    return method3903(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, 0, arg3, arg2, this, this.field9894, arg4);
                }
                return method3928(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, 0, arg3, arg2, this, this.field9894, arg4);
            }
            int var6 = this.field9889 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9889 += arg1;
            if (this.field9894 == -256 && (this.field9901 & 255) == 0) {
                if (class60.field614) {
                    arg1 = method3919(0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, this.field9893, this.field9890, 0, var6, arg2, this);
                } else {
                    arg1 = method3900(((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, this.field9896, 0, var6, arg2, this);
                }
            } else if (class60.field614) {
                arg1 = method3897(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, this.field9893, this.field9890, 0, var6, arg2, this, this.field9894, arg4);
            } else {
                arg1 = method3934(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, this.field9896, 0, var6, arg2, this, this.field9894, arg4);
            }
            this.field9889 -= arg1;
            if (this.field9889 != 0) {
                return arg1;
            }
        } while (!this.method3920());
        return arg3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([B[IIIIIIIILam;)I")
    private static final int method3900(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class704 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field9898 += (var14 - arg3) * arg9.field9893;
        arg9.field9900 += (var14 - arg3) * arg9.field9890;
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
        arg9.field9902 = var12 >> 2;
        arg9.field9901 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lug;III)Lam;")
    public static final class704 method3901(class450 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6310 != null && arg0.field6310.length != 0 ? new class704(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II[B[IIIIIIILam;II)I")
    private static final int method3902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class704 arg10, int arg11, int arg12) {
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
        arg10.field9901 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II[B[IIIIIIIILam;II)I")
    private static final int method3903(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class704 arg11, int arg12, int arg13) {
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
        arg11.field9901 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
    public final synchronized void method3904(int arg0, int arg1) {
        this.method3925(arg0, arg1, this.method3911());
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()I")
    public final int method497() {
        return this.field9903 == 0 && this.field9889 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public final synchronized void method3905(int arg0) {
        int var2 = ((class450) super.field7449).field6310.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field9901 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "()I")
    public final synchronized int method3906() {
        return this.field9894 < 0 ? -this.field9894 : this.field9894;
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "()V")
    private final void method3907() {
        if (this.field9889 != 0) {
            if (this.field9903 == Integer.MIN_VALUE) {
                this.field9903 = 0;
            }
            this.field9889 = 0;
            this.method3916();
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()Lnj;")
    public final class529 method505() {
        return null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[B[IIIIIIIILam;)I")
    private static final int method3908(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class704 arg10) {
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
        arg10.field9901 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II[B[IIIIIIIILam;II)I")
    private static final int method3909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class704 arg11, int arg12, int arg13) {
        arg11.field9898 -= arg11.field9893 * arg5;
        arg11.field9900 -= arg11.field9890 * arg5;
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
        arg11.field9898 += arg11.field9893 * arg5;
        arg11.field9900 += arg11.field9890 * arg5;
        arg11.field9902 = arg6;
        arg11.field9901 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public final synchronized void method3910(int arg0) {
        this.method3923(arg0 << 6, this.method3911());
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "()I")
    public final synchronized int method3911() {
        return this.field9899 < 0 ? -1 : this.field9899;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V")
    public final synchronized void method3912(int arg0) {
        if (arg0 == 0) {
            this.method3927(0);
            this.method1922(96);
        } else if (this.field9898 == 0 && this.field9900 == 0) {
            this.field9889 = 0;
            this.field9903 = 0;
            this.field9902 = 0;
            this.method1922(97);
        } else {
            int var2 = -this.field9902;
            if (this.field9902 > var2) {
                var2 = this.field9902;
            }
            if (-this.field9898 > var2) {
                var2 = -this.field9898;
            }
            if (this.field9898 > var2) {
                var2 = this.field9898;
            }
            if (-this.field9900 > var2) {
                var2 = -this.field9900;
            }
            if (this.field9900 > var2) {
                var2 = this.field9900;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field9889 = arg0;
            this.field9903 = Integer.MIN_VALUE;
            this.field9896 = -this.field9902 / arg0;
            this.field9893 = -this.field9898 / arg0;
            this.field9890 = -this.field9900 / arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V")
    public final synchronized void method3913(int arg0) {
        this.field9891 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[B[IIIIIIIIIILam;)I")
    private static final int method3914(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class704 arg12) {
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
        arg12.field9902 += (var19 - arg4) * arg12.field9896;
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
        arg12.field9898 = var15 >> 2;
        arg12.field9900 = var16 >> 2;
        arg12.field9901 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!am", name = "i", descriptor = "()I")
    public final synchronized int method3915() {
        return this.field9903 == Integer.MIN_VALUE ? 0 : this.field9903;
    }

    @OriginalMember(owner = "client!am", name = "j", descriptor = "()V")
    private final void method3916() {
        this.field9902 = this.field9903;
        this.field9898 = method3935(this.field9903, this.field9899);
        this.field9900 = method3917(this.field9903, this.field9899);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(II)I")
    private static final int method3917(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "([IIIII)I")
    private final int method3918(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9889 <= 0) {
                if (this.field9894 == 256 && (this.field9901 & 255) == 0) {
                    if (class60.field614) {
                        return method3908(0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, 0, arg3, arg2, this);
                    }
                    return method3929(((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, 0, arg3, arg2, this);
                }
                if (class60.field614) {
                    return method3931(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, 0, arg3, arg2, this, this.field9894, arg4);
                }
                return method3902(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, 0, arg3, arg2, this, this.field9894, arg4);
            }
            int var6 = this.field9889 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9889 += arg1;
            if (this.field9894 == 256 && (this.field9901 & 255) == 0) {
                if (class60.field614) {
                    arg1 = method3914(0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, this.field9893, this.field9890, 0, var6, arg2, this);
                } else {
                    arg1 = method3936(((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, this.field9896, 0, var6, arg2, this);
                }
            } else if (class60.field614) {
                arg1 = method3933(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9898, this.field9900, this.field9893, this.field9890, 0, var6, arg2, this, this.field9894, arg4);
            } else {
                arg1 = method3909(0, 0, ((class450) super.field7449).field6310, arg0, this.field9901, arg1, this.field9902, this.field9896, 0, var6, arg2, this, this.field9894, arg4);
            }
            this.field9889 -= arg1;
            if (this.field9889 != 0) {
                return arg1;
            }
        } while (!this.method3920());
        return arg3;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I[B[IIIIIIIIIILam;)I")
    private static final int method3919(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class704 arg12) {
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
        arg12.field9902 += (var19 - arg4) * arg12.field9896;
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
        arg12.field9898 = var15 >> 2;
        arg12.field9900 = var16 >> 2;
        arg12.field9901 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!am", name = "k", descriptor = "()Z")
    private final boolean method3920() {
        int var1 = this.field9903;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3935(var1, this.field9899);
            var2 = method3917(var1, this.field9899);
        }
        if (this.field9902 == var1 && this.field9898 == var3 && this.field9900 == var2) {
            if (this.field9903 == Integer.MIN_VALUE) {
                this.field9903 = 0;
                this.field9902 = this.field9898 = this.field9900 = 0;
                this.method1922(82);
                return true;
            } else {
                this.method3916();
                return false;
            }
        } else {
            if (this.field9902 < var1) {
                this.field9896 = 1;
                this.field9889 = var1 - this.field9902;
            } else if (this.field9902 > var1) {
                this.field9896 = -1;
                this.field9889 = this.field9902 - var1;
            } else {
                this.field9896 = 0;
            }
            if (this.field9898 < var3) {
                this.field9893 = 1;
                if (this.field9889 == 0 || this.field9889 > var3 - this.field9898) {
                    this.field9889 = var3 - this.field9898;
                }
            } else if (this.field9898 > var3) {
                this.field9893 = -1;
                if (this.field9889 == 0 || this.field9889 > this.field9898 - var3) {
                    this.field9889 = this.field9898 - var3;
                }
            } else {
                this.field9893 = 0;
            }
            if (this.field9900 < var2) {
                this.field9890 = 1;
                if (this.field9889 == 0 || this.field9889 > var2 - this.field9900) {
                    this.field9889 = var2 - this.field9900;
                }
            } else if (this.field9900 > var2) {
                this.field9890 = -1;
                if (this.field9889 == 0 || this.field9889 > this.field9900 - var2) {
                    this.field9889 = this.field9900 - var2;
                }
            } else {
                this.field9890 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public final synchronized void method3921(boolean arg0) {
        this.field9894 = (this.field9894 >>> 31) + (this.field9894 ^ this.field9894 >> 31);
        if (arg0) {
            this.field9894 = -this.field9894;
        }
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V")
    public final synchronized void method3922(int arg0) {
        if (this.field9894 < 0) {
            this.field9894 = -arg0;
        } else {
            this.field9894 = arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public final synchronized void method490(int arg0) {
        if (this.field9889 > 0) {
            if (arg0 >= this.field9889) {
                if (this.field9903 == Integer.MIN_VALUE) {
                    this.field9903 = 0;
                    this.field9902 = this.field9898 = this.field9900 = 0;
                    this.method1922(76);
                    arg0 = this.field9889;
                }
                this.field9889 = 0;
                this.method3916();
            } else {
                this.field9902 += this.field9896 * arg0;
                this.field9898 += this.field9893 * arg0;
                this.field9900 += this.field9890 * arg0;
                this.field9889 -= arg0;
            }
        }
        class450 var2 = (class450) super.field7449;
        int var3 = this.field9895 << 8;
        int var4 = this.field9897 << 8;
        int var5 = var2.field6310.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field9891 = 0;
        }
        if (this.field9901 < 0) {
            if (this.field9894 <= 0) {
                this.method3907();
                this.method1922(82);
                return;
            }
            this.field9901 = 0;
        }
        if (this.field9901 >= var5) {
            if (this.field9894 >= 0) {
                this.method3907();
                this.method1922(78);
                return;
            }
            this.field9901 = var5 - 1;
        }
        this.field9901 += this.field9894 * arg0;
        if (this.field9891 < 0) {
            if (!this.field9892) {
                if (this.field9894 < 0) {
                    if (this.field9901 < var3) {
                        this.field9901 = var4 - 1 - (var4 - 1 - this.field9901) % var6;
                    }
                } else if (this.field9901 >= var4) {
                    this.field9901 = (this.field9901 - var3) % var6 + var3;
                }
            } else {
                if (this.field9894 < 0) {
                    if (this.field9901 >= var3) {
                        return;
                    }
                    this.field9901 = var3 + var3 - 1 - this.field9901;
                    this.field9894 = -this.field9894;
                }
                while (this.field9901 >= var4) {
                    this.field9901 = var4 + var4 - 1 - this.field9901;
                    this.field9894 = -this.field9894;
                    if (this.field9901 >= var3) {
                        return;
                    }
                    this.field9901 = var3 + var3 - 1 - this.field9901;
                    this.field9894 = -this.field9894;
                }
            }
        } else {
            if (this.field9891 > 0) {
                if (this.field9892) {
                    label125: {
                        if (this.field9894 < 0) {
                            if (this.field9901 >= var3) {
                                return;
                            }
                            this.field9901 = var3 + var3 - 1 - this.field9901;
                            this.field9894 = -this.field9894;
                            if (--this.field9891 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field9901 < var4) {
                                return;
                            }
                            this.field9901 = var4 + var4 - 1 - this.field9901;
                            this.field9894 = -this.field9894;
                            if (--this.field9891 == 0) {
                                break;
                            }
                            if (this.field9901 >= var3) {
                                return;
                            }
                            this.field9901 = var3 + var3 - 1 - this.field9901;
                            this.field9894 = -this.field9894;
                        } while (--this.field9891 != 0);
                    }
                } else if (this.field9894 < 0) {
                    if (this.field9901 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field9901) / var6;
                    if (var7 < this.field9891) {
                        this.field9901 += var6 * var7;
                        this.field9891 -= var7;
                        return;
                    }
                    this.field9901 += this.field9891 * var6;
                    this.field9891 = 0;
                } else {
                    if (this.field9901 < var4) {
                        return;
                    }
                    int var8 = (this.field9901 - var3) / var6;
                    if (var8 < this.field9891) {
                        this.field9901 -= var6 * var8;
                        this.field9891 -= var8;
                        return;
                    }
                    this.field9901 -= this.field9891 * var6;
                    this.field9891 = 0;
                }
            }
            if (this.field9894 < 0) {
                if (this.field9901 < 0) {
                    this.field9901 = -1;
                    this.method3907();
                    this.method1922(80);
                    return;
                }
            } else if (this.field9901 >= var5) {
                this.field9901 = var5;
                this.method3907();
                this.method1922(122);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(II)V")
    private final synchronized void method3923(int arg0, int arg1) {
        this.field9903 = arg0;
        this.field9899 = arg1;
        this.field9889 = 0;
        this.method3916();
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([B[IIIIIIILam;)I")
    private static final int method3924(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class704 arg8) {
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
        arg8.field9901 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()I")
    public final int method2973() {
        int var1 = this.field9902 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field9891 == 0) {
            var2 -= this.field9901 * var2 / (((class450) super.field7449).field6310.length << 8);
        } else if (this.field9891 >= 0) {
            var2 -= this.field9895 * var2 / ((class450) super.field7449).field6310.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
    public final synchronized void method3925(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3923(arg1, arg2);
        } else {
            int var4 = method3935(arg1, arg2);
            int var5 = method3917(arg1, arg2);
            if (this.field9898 == var4 && this.field9900 == var5) {
                this.field9889 = 0;
            } else {
                int var6 = arg1 - this.field9902;
                if (this.field9902 - arg1 > var6) {
                    var6 = this.field9902 - arg1;
                }
                if (var4 - this.field9898 > var6) {
                    var6 = var4 - this.field9898;
                }
                if (this.field9898 - var4 > var6) {
                    var6 = this.field9898 - var4;
                }
                if (var5 - this.field9900 > var6) {
                    var6 = var5 - this.field9900;
                }
                if (this.field9900 - var5 > var6) {
                    var6 = this.field9900 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field9889 = arg0;
                this.field9903 = arg1;
                this.field9899 = arg2;
                this.field9896 = (arg1 - this.field9902) / arg0;
                this.field9893 = (var4 - this.field9898) / arg0;
                this.field9890 = (var5 - this.field9900) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I[B[IIIIIIIILam;)I")
    private static final int method3926(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class704 arg10) {
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
        arg10.field9901 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!am", name = "i", descriptor = "(I)V")
    private final synchronized void method3927(int arg0) {
        this.method3923(arg0, this.method3911());
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II[B[IIIIIIILam;II)I")
    private static final int method3928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class704 arg10, int arg11, int arg12) {
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
        arg10.field9901 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "([B[IIIIIIILam;)I")
    private static final int method3929(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class704 arg8) {
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
        arg8.field9901 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!am", name = "l", descriptor = "()Z")
    public final boolean method3930() {
        return this.field9901 < 0 || this.field9901 >= ((class450) super.field7449).field6310.length << 8;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(II[B[IIIIIIIILam;II)I")
    private static final int method3931(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class704 arg11, int arg12, int arg13) {
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
        arg11.field9901 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lug;II)Lam;")
    public static final class704 method3932(class450 arg0, int arg1, int arg2) {
        return arg0.field6310 != null && arg0.field6310.length != 0 ? new class704(arg0, (int) ((long) arg0.field6311 * 256L * (long) arg1 / (long) (class224.field2776 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II[B[IIIIIIIIIILam;II)I")
    private static final int method3933(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class704 arg13, int arg14, int arg15) {
        arg13.field9902 -= arg13.field9896 * arg5;
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
        arg13.field9902 += arg13.field9896 * var22;
        arg13.field9898 = arg6;
        arg13.field9900 = arg7;
        arg13.field9901 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()Lnj;")
    public final class529 method521() {
        return null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([III)V")
    public final synchronized void method495(int[] arg0, int arg1, int arg2) {
        if (this.field9903 == 0 && this.field9889 == 0) {
            this.method490(arg2);
        } else {
            class450 var4 = (class450) super.field7449;
            int var5 = this.field9895 << 8;
            int var6 = this.field9897 << 8;
            int var7 = var4.field6310.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field9891 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field9901 < 0) {
                if (this.field9894 <= 0) {
                    this.method3907();
                    this.method1922(112);
                    return;
                }
                this.field9901 = 0;
            }
            if (this.field9901 >= var7) {
                if (this.field9894 >= 0) {
                    this.method3907();
                    this.method1922(111);
                    return;
                }
                this.field9901 = var7 - 1;
            }
            if (this.field9891 < 0) {
                if (this.field9892) {
                    if (this.field9894 < 0) {
                        var9 = this.method3899(arg0, arg1, var5, var10, var4.field6310[this.field9895]);
                        if (this.field9901 >= var5) {
                            return;
                        }
                        this.field9901 = var5 + var5 - 1 - this.field9901;
                        this.field9894 = -this.field9894;
                    }
                    while (true) {
                        int var11 = this.method3918(arg0, var9, var6, var10, var4.field6310[this.field9897 - 1]);
                        if (this.field9901 < var6) {
                            return;
                        }
                        this.field9901 = var6 + var6 - 1 - this.field9901;
                        this.field9894 = -this.field9894;
                        var9 = this.method3899(arg0, var11, var5, var10, var4.field6310[this.field9895]);
                        if (this.field9901 >= var5) {
                            return;
                        }
                        this.field9901 = var5 + var5 - 1 - this.field9901;
                        this.field9894 = -this.field9894;
                    }
                } else if (this.field9894 < 0) {
                    while (true) {
                        var9 = this.method3899(arg0, var9, var5, var10, var4.field6310[this.field9897 - 1]);
                        if (this.field9901 >= var5) {
                            return;
                        }
                        this.field9901 = var6 - 1 - (var6 - 1 - this.field9901) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3918(arg0, var9, var6, var10, var4.field6310[this.field9895]);
                        if (this.field9901 < var6) {
                            return;
                        }
                        this.field9901 = (this.field9901 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field9891 > 0) {
                    if (this.field9892) {
                        label130: {
                            if (this.field9894 < 0) {
                                var9 = this.method3899(arg0, arg1, var5, var10, var4.field6310[this.field9895]);
                                if (this.field9901 >= var5) {
                                    return;
                                }
                                this.field9901 = var5 + var5 - 1 - this.field9901;
                                this.field9894 = -this.field9894;
                                if (--this.field9891 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3918(arg0, var9, var6, var10, var4.field6310[this.field9897 - 1]);
                                if (this.field9901 < var6) {
                                    return;
                                }
                                this.field9901 = var6 + var6 - 1 - this.field9901;
                                this.field9894 = -this.field9894;
                                if (--this.field9891 == 0) {
                                    break;
                                }
                                var9 = this.method3899(arg0, var9, var5, var10, var4.field6310[this.field9895]);
                                if (this.field9901 >= var5) {
                                    return;
                                }
                                this.field9901 = var5 + var5 - 1 - this.field9901;
                                this.field9894 = -this.field9894;
                            } while (--this.field9891 != 0);
                        }
                    } else if (this.field9894 < 0) {
                        while (true) {
                            var9 = this.method3899(arg0, var9, var5, var10, var4.field6310[this.field9897 - 1]);
                            if (this.field9901 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field9901) / var8;
                            if (var12 >= this.field9891) {
                                this.field9901 += this.field9891 * var8;
                                this.field9891 = 0;
                                break;
                            }
                            this.field9901 += var8 * var12;
                            this.field9891 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3918(arg0, var9, var6, var10, var4.field6310[this.field9895]);
                            if (this.field9901 < var6) {
                                return;
                            }
                            int var13 = (this.field9901 - var5) / var8;
                            if (var13 >= this.field9891) {
                                this.field9901 -= this.field9891 * var8;
                                this.field9891 = 0;
                                break;
                            }
                            this.field9901 -= var8 * var13;
                            this.field9891 -= var13;
                        }
                    }
                }
                if (this.field9894 < 0) {
                    this.method3899(arg0, var9, 0, var10, 0);
                    if (this.field9901 < 0) {
                        this.field9901 = -1;
                        this.method3907();
                        this.method1922(101);
                        return;
                    }
                } else {
                    this.method3918(arg0, var9, var7, var10, 0);
                    if (this.field9901 >= var7) {
                        this.field9901 = var7;
                        this.method3907();
                        this.method1922(107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lug;II)V")
    private class704(class450 arg0, int arg1, int arg2) {
        super.field7449 = arg0;
        this.field9895 = arg0.field6312;
        this.field9897 = arg0.field6313;
        this.field9892 = arg0.field6309;
        this.field9894 = arg1;
        this.field9903 = arg2;
        this.field9899 = 8192;
        this.field9901 = 0;
        this.method3916();
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(II[B[IIIIIIIILam;II)I")
    private static final int method3934(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class704 arg11, int arg12, int arg13) {
        arg11.field9898 -= arg11.field9893 * arg5;
        arg11.field9900 -= arg11.field9890 * arg5;
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
        arg11.field9898 += arg11.field9893 * arg5;
        arg11.field9900 += arg11.field9890 * arg5;
        arg11.field9902 = arg6;
        arg11.field9901 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(II)I")
    private static final int method3935(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lug;III)V")
    private class704(class450 arg0, int arg1, int arg2, int arg3) {
        super.field7449 = arg0;
        this.field9895 = arg0.field6312;
        this.field9897 = arg0.field6313;
        this.field9892 = arg0.field6309;
        this.field9894 = arg1;
        this.field9903 = arg2;
        this.field9899 = arg3;
        this.field9901 = 0;
        this.method3916();
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "([B[IIIIIIIILam;)I")
    private static final int method3936(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class704 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field9898 += (var14 - arg3) * arg9.field9893;
        arg9.field9900 += (var14 - arg3) * arg9.field9890;
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
        arg9.field9902 = var12 >> 2;
        arg9.field9901 = var10 << 8;
        return arg3;
    }
}
