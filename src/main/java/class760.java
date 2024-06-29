import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class760 extends class725 {

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "I")
    private int field10593;

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "I")
    private int field10589;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "Z")
    private boolean field10588;

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
    private int field10585;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    private int field10583;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    private int field10580;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "I")
    private int field10591;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    private int field10579;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    private int field10581;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    private int field10582;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    private int field10584;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
    private int field10586;

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
    private int field10587;

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
    private int field10590;

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "I")
    private int field10592;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
    public final synchronized void method4210(int arg0) {
        this.method4248(arg0 << 6, this.method4237());
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V")
    public final synchronized void method4211(boolean arg0) {
        this.field10585 = (this.field10585 >>> 31) + (this.field10585 ^ this.field10585 >> 31);
        if (arg0) {
            this.field10585 = -this.field10585;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lwo;III)Lkca;")
    public static final class760 method4212(class695 arg0, int arg1, int arg2, int arg3) {
        return arg0.field9688 != null && arg0.field9688.length != 0 ? new class760(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "()I")
    public final synchronized int method4213() {
        return this.field10583 == Integer.MIN_VALUE ? 0 : this.field10583;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
    public final synchronized void method4214(int arg0) {
        this.method4248(this.method4213(), arg0);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II[B[IIIIIIIIIILkca;II)I")
    private static final int method4215(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class760 arg13, int arg14, int arg15) {
        arg13.field10579 -= arg13.field10587 * arg5;
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
        arg13.field10579 += arg13.field10587 * var22;
        arg13.field10590 = arg6;
        arg13.field10582 = arg7;
        arg13.field10591 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II[B[IIIIIIIIIILkca;II)I")
    private static final int method4216(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class760 arg13, int arg14, int arg15) {
        arg13.field10579 -= arg13.field10587 * arg5;
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
        arg13.field10579 += arg13.field10587 * var22;
        arg13.field10590 = arg6;
        arg13.field10582 = arg7;
        arg13.field10591 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "()I")
    public final int method4049() {
        int var1 = this.field10579 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field10592 == 0) {
            var2 -= this.field10591 * var2 / (((class695) super.field10053).field9688.length << 8);
        } else if (this.field10592 >= 0) {
            var2 -= this.field10593 * var2 / ((class695) super.field10053).field9688.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I[B[IIIIIIIILkca;)I")
    private static final int method4217(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class760 arg10) {
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
        arg10.field10591 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II[B[IIIIIIILkca;II)I")
    private static final int method4218(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class760 arg10, int arg11, int arg12) {
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
        arg10.field10591 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
    public final synchronized void method4219(int arg0) {
        if (arg0 == 0) {
            this.method4228(0);
            this.method549(6410);
        } else if (this.field10590 == 0 && this.field10582 == 0) {
            this.field10584 = 0;
            this.field10583 = 0;
            this.field10579 = 0;
            this.method549(6410);
        } else {
            int var2 = -this.field10579;
            if (this.field10579 > var2) {
                var2 = this.field10579;
            }
            if (-this.field10590 > var2) {
                var2 = -this.field10590;
            }
            if (this.field10590 > var2) {
                var2 = this.field10590;
            }
            if (-this.field10582 > var2) {
                var2 = -this.field10582;
            }
            if (this.field10582 > var2) {
                var2 = this.field10582;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field10584 = arg0;
            this.field10583 = Integer.MIN_VALUE;
            this.field10587 = -this.field10579 / arg0;
            this.field10586 = -this.field10590 / arg0;
            this.field10581 = -this.field10582 / arg0;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([IIIII)I")
    private final int method4220(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field10584 <= 0) {
                if (this.field10585 == 256 && (this.field10591 & 255) == 0) {
                    if (class644.field8627) {
                        return method4247(0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, 0, arg3, arg2, this);
                    }
                    return method4241(((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, 0, arg3, arg2, this);
                }
                if (class644.field8627) {
                    return method4227(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, 0, arg3, arg2, this, this.field10585, arg4);
                }
                return method4239(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, 0, arg3, arg2, this, this.field10585, arg4);
            }
            int var6 = this.field10584 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field10584 += arg1;
            if (this.field10585 == 256 && (this.field10591 & 255) == 0) {
                if (class644.field8627) {
                    arg1 = method4235(0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, this.field10586, this.field10581, 0, var6, arg2, this);
                } else {
                    arg1 = method4225(((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, this.field10587, 0, var6, arg2, this);
                }
            } else if (class644.field8627) {
                arg1 = method4216(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, this.field10586, this.field10581, 0, var6, arg2, this, this.field10585, arg4);
            } else {
                arg1 = method4243(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, this.field10587, 0, var6, arg2, this, this.field10585, arg4);
            }
            this.field10584 -= arg1;
            if (this.field10584 != 0) {
                return arg1;
            }
        } while (!this.method4240());
        return arg3;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "()Lco;")
    public final class725 method357() {
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([B[IIIIIIIILkca;)I")
    private static final int method4221(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class760 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field10590 += (var14 - arg3) * arg9.field10586;
        arg9.field10582 += (var14 - arg3) * arg9.field10581;
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
        arg9.field10579 = var12 >> 2;
        arg9.field10591 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "([IIIII)I")
    private final int method4222(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field10584 <= 0) {
                if (this.field10585 == -256 && (this.field10591 & 255) == 0) {
                    if (class644.field8627) {
                        return method4217(0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, 0, arg3, arg2, this);
                    }
                    return method4245(((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, 0, arg3, arg2, this);
                }
                if (class644.field8627) {
                    return method4244(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, 0, arg3, arg2, this, this.field10585, arg4);
                }
                return method4218(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, 0, arg3, arg2, this, this.field10585, arg4);
            }
            int var6 = this.field10584 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field10584 += arg1;
            if (this.field10585 == -256 && (this.field10591 & 255) == 0) {
                if (class644.field8627) {
                    arg1 = method4223(0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, this.field10586, this.field10581, 0, var6, arg2, this);
                } else {
                    arg1 = method4221(((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, this.field10587, 0, var6, arg2, this);
                }
            } else if (class644.field8627) {
                arg1 = method4215(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10590, this.field10582, this.field10586, this.field10581, 0, var6, arg2, this, this.field10585, arg4);
            } else {
                arg1 = method4226(0, 0, ((class695) super.field10053).field9688, arg0, this.field10591, arg1, this.field10579, this.field10587, 0, var6, arg2, this, this.field10585, arg4);
            }
            this.field10584 -= arg1;
            if (this.field10584 != 0) {
                return arg1;
            }
        } while (!this.method4240());
        return arg3;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I[B[IIIIIIIIIILkca;)I")
    private static final int method4223(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class760 arg12) {
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
        arg12.field10579 += (var19 - arg4) * arg12.field10587;
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
        arg12.field10590 = var15 >> 2;
        arg12.field10582 = var16 >> 2;
        arg12.field10591 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([III)V")
    public final synchronized void method360(int[] arg0, int arg1, int arg2) {
        if (this.field10583 == 0 && this.field10584 == 0) {
            this.method366(arg2);
        } else {
            class695 var4 = (class695) super.field10053;
            int var5 = this.field10593 << 8;
            int var6 = this.field10589 << 8;
            int var7 = var4.field9688.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field10592 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field10591 < 0) {
                if (this.field10585 <= 0) {
                    this.method4234();
                    this.method549(6410);
                    return;
                }
                this.field10591 = 0;
            }
            if (this.field10591 >= var7) {
                if (this.field10585 >= 0) {
                    this.method4234();
                    this.method549(6410);
                    return;
                }
                this.field10591 = var7 - 1;
            }
            if (this.field10592 < 0) {
                if (this.field10588) {
                    if (this.field10585 < 0) {
                        var9 = this.method4222(arg0, arg1, var5, var10, var4.field9688[this.field10593]);
                        if (this.field10591 >= var5) {
                            return;
                        }
                        this.field10591 = var5 + var5 - 1 - this.field10591;
                        this.field10585 = -this.field10585;
                    }
                    while (true) {
                        int var11 = this.method4220(arg0, var9, var6, var10, var4.field9688[this.field10589 - 1]);
                        if (this.field10591 < var6) {
                            return;
                        }
                        this.field10591 = var6 + var6 - 1 - this.field10591;
                        this.field10585 = -this.field10585;
                        var9 = this.method4222(arg0, var11, var5, var10, var4.field9688[this.field10593]);
                        if (this.field10591 >= var5) {
                            return;
                        }
                        this.field10591 = var5 + var5 - 1 - this.field10591;
                        this.field10585 = -this.field10585;
                    }
                } else if (this.field10585 < 0) {
                    while (true) {
                        var9 = this.method4222(arg0, var9, var5, var10, var4.field9688[this.field10589 - 1]);
                        if (this.field10591 >= var5) {
                            return;
                        }
                        this.field10591 = var6 - 1 - (var6 - 1 - this.field10591) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method4220(arg0, var9, var6, var10, var4.field9688[this.field10593]);
                        if (this.field10591 < var6) {
                            return;
                        }
                        this.field10591 = (this.field10591 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field10592 > 0) {
                    if (this.field10588) {
                        label130: {
                            if (this.field10585 < 0) {
                                var9 = this.method4222(arg0, arg1, var5, var10, var4.field9688[this.field10593]);
                                if (this.field10591 >= var5) {
                                    return;
                                }
                                this.field10591 = var5 + var5 - 1 - this.field10591;
                                this.field10585 = -this.field10585;
                                if (--this.field10592 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method4220(arg0, var9, var6, var10, var4.field9688[this.field10589 - 1]);
                                if (this.field10591 < var6) {
                                    return;
                                }
                                this.field10591 = var6 + var6 - 1 - this.field10591;
                                this.field10585 = -this.field10585;
                                if (--this.field10592 == 0) {
                                    break;
                                }
                                var9 = this.method4222(arg0, var9, var5, var10, var4.field9688[this.field10593]);
                                if (this.field10591 >= var5) {
                                    return;
                                }
                                this.field10591 = var5 + var5 - 1 - this.field10591;
                                this.field10585 = -this.field10585;
                            } while (--this.field10592 != 0);
                        }
                    } else if (this.field10585 < 0) {
                        while (true) {
                            var9 = this.method4222(arg0, var9, var5, var10, var4.field9688[this.field10589 - 1]);
                            if (this.field10591 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field10591) / var8;
                            if (var12 >= this.field10592) {
                                this.field10591 += this.field10592 * var8;
                                this.field10592 = 0;
                                break;
                            }
                            this.field10591 += var8 * var12;
                            this.field10592 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method4220(arg0, var9, var6, var10, var4.field9688[this.field10593]);
                            if (this.field10591 < var6) {
                                return;
                            }
                            int var13 = (this.field10591 - var5) / var8;
                            if (var13 >= this.field10592) {
                                this.field10591 -= this.field10592 * var8;
                                this.field10592 = 0;
                                break;
                            }
                            this.field10591 -= var8 * var13;
                            this.field10592 -= var13;
                        }
                    }
                }
                if (this.field10585 < 0) {
                    this.method4222(arg0, var9, 0, var10, 0);
                    if (this.field10591 < 0) {
                        this.field10591 = -1;
                        this.method4234();
                        this.method549(6410);
                        return;
                    }
                } else {
                    this.method4220(arg0, var9, var7, var10, 0);
                    if (this.field10591 >= var7) {
                        this.field10591 = var7;
                        this.method4234();
                        this.method549(6410);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public final synchronized void method366(int arg0) {
        if (this.field10584 > 0) {
            if (arg0 >= this.field10584) {
                if (this.field10583 == Integer.MIN_VALUE) {
                    this.field10583 = 0;
                    this.field10579 = this.field10590 = this.field10582 = 0;
                    this.method549(6410);
                    arg0 = this.field10584;
                }
                this.field10584 = 0;
                this.method4236();
            } else {
                this.field10579 += this.field10587 * arg0;
                this.field10590 += this.field10586 * arg0;
                this.field10582 += this.field10581 * arg0;
                this.field10584 -= arg0;
            }
        }
        class695 var2 = (class695) super.field10053;
        int var3 = this.field10593 << 8;
        int var4 = this.field10589 << 8;
        int var5 = var2.field9688.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field10592 = 0;
        }
        if (this.field10591 < 0) {
            if (this.field10585 <= 0) {
                this.method4234();
                this.method549(6410);
                return;
            }
            this.field10591 = 0;
        }
        if (this.field10591 >= var5) {
            if (this.field10585 >= 0) {
                this.method4234();
                this.method549(6410);
                return;
            }
            this.field10591 = var5 - 1;
        }
        this.field10591 += this.field10585 * arg0;
        if (this.field10592 < 0) {
            if (!this.field10588) {
                if (this.field10585 < 0) {
                    if (this.field10591 < var3) {
                        this.field10591 = var4 - 1 - (var4 - 1 - this.field10591) % var6;
                    }
                } else if (this.field10591 >= var4) {
                    this.field10591 = (this.field10591 - var3) % var6 + var3;
                }
            } else {
                if (this.field10585 < 0) {
                    if (this.field10591 >= var3) {
                        return;
                    }
                    this.field10591 = var3 + var3 - 1 - this.field10591;
                    this.field10585 = -this.field10585;
                }
                while (this.field10591 >= var4) {
                    this.field10591 = var4 + var4 - 1 - this.field10591;
                    this.field10585 = -this.field10585;
                    if (this.field10591 >= var3) {
                        return;
                    }
                    this.field10591 = var3 + var3 - 1 - this.field10591;
                    this.field10585 = -this.field10585;
                }
            }
        } else {
            if (this.field10592 > 0) {
                if (this.field10588) {
                    label125: {
                        if (this.field10585 < 0) {
                            if (this.field10591 >= var3) {
                                return;
                            }
                            this.field10591 = var3 + var3 - 1 - this.field10591;
                            this.field10585 = -this.field10585;
                            if (--this.field10592 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field10591 < var4) {
                                return;
                            }
                            this.field10591 = var4 + var4 - 1 - this.field10591;
                            this.field10585 = -this.field10585;
                            if (--this.field10592 == 0) {
                                break;
                            }
                            if (this.field10591 >= var3) {
                                return;
                            }
                            this.field10591 = var3 + var3 - 1 - this.field10591;
                            this.field10585 = -this.field10585;
                        } while (--this.field10592 != 0);
                    }
                } else if (this.field10585 < 0) {
                    if (this.field10591 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field10591) / var6;
                    if (var7 < this.field10592) {
                        this.field10591 += var6 * var7;
                        this.field10592 -= var7;
                        return;
                    }
                    this.field10591 += this.field10592 * var6;
                    this.field10592 = 0;
                } else {
                    if (this.field10591 < var4) {
                        return;
                    }
                    int var8 = (this.field10591 - var3) / var6;
                    if (var8 < this.field10592) {
                        this.field10591 -= var6 * var8;
                        this.field10592 -= var8;
                        return;
                    }
                    this.field10591 -= this.field10592 * var6;
                    this.field10592 = 0;
                }
            }
            if (this.field10585 < 0) {
                if (this.field10591 < 0) {
                    this.field10591 = -1;
                    this.method4234();
                    this.method549(6410);
                    return;
                }
            } else if (this.field10591 >= var5) {
                this.field10591 = var5;
                this.method4234();
                this.method549(6410);
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)V")
    public final synchronized void method4224(int arg0, int arg1) {
        this.method4229(arg0, arg1, this.method4237());
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "([B[IIIIIIIILkca;)I")
    private static final int method4225(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class760 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field10590 += (var14 - arg3) * arg9.field10586;
        arg9.field10582 += (var14 - arg3) * arg9.field10581;
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
        arg9.field10579 = var12 >> 2;
        arg9.field10591 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(II[B[IIIIIIIILkca;II)I")
    private static final int method4226(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class760 arg11, int arg12, int arg13) {
        arg11.field10590 -= arg11.field10586 * arg5;
        arg11.field10582 -= arg11.field10581 * arg5;
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
        arg11.field10590 += arg11.field10586 * arg5;
        arg11.field10582 += arg11.field10581 * arg5;
        arg11.field10579 = arg6;
        arg11.field10591 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II[B[IIIIIIIILkca;II)I")
    private static final int method4227(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class760 arg11, int arg12, int arg13) {
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
        arg11.field10591 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "(I)V")
    private final synchronized void method4228(int arg0) {
        this.method4248(arg0, this.method4237());
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)V")
    public final synchronized void method4229(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method4248(arg1, arg2);
        } else {
            int var4 = method4233(arg1, arg2);
            int var5 = method4246(arg1, arg2);
            if (this.field10590 == var4 && this.field10582 == var5) {
                this.field10584 = 0;
            } else {
                int var6 = arg1 - this.field10579;
                if (this.field10579 - arg1 > var6) {
                    var6 = this.field10579 - arg1;
                }
                if (var4 - this.field10590 > var6) {
                    var6 = var4 - this.field10590;
                }
                if (this.field10590 - var4 > var6) {
                    var6 = this.field10590 - var4;
                }
                if (var5 - this.field10582 > var6) {
                    var6 = var5 - this.field10582;
                }
                if (this.field10582 - var5 > var6) {
                    var6 = this.field10582 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field10584 = arg0;
                this.field10583 = arg1;
                this.field10580 = arg2;
                this.field10587 = (arg1 - this.field10579) / arg0;
                this.field10586 = (var4 - this.field10590) / arg0;
                this.field10581 = (var5 - this.field10582) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "()I")
    public final synchronized int method4230() {
        return this.field10585 < 0 ? -this.field10585 : this.field10585;
    }

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "(I)V")
    public final synchronized void method4231(int arg0) {
        if (this.field10585 < 0) {
            this.field10585 = -arg0;
        } else {
            this.field10585 = arg0;
        }
    }

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "()Z")
    public final boolean method4232() {
        return this.field10584 != 0;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)I")
    private static final int method4233(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "()V")
    private final void method4234() {
        if (this.field10584 != 0) {
            if (this.field10583 == Integer.MIN_VALUE) {
                this.field10583 = 0;
            }
            this.field10584 = 0;
            this.method4236();
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I[B[IIIIIIIIIILkca;)I")
    private static final int method4235(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class760 arg12) {
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
        arg12.field10579 += (var19 - arg4) * arg12.field10587;
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
        arg12.field10590 = var15 >> 2;
        arg12.field10582 = var16 >> 2;
        arg12.field10591 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "()V")
    private final void method4236() {
        this.field10579 = this.field10583;
        this.field10590 = method4233(this.field10583, this.field10580);
        this.field10582 = method4246(this.field10583, this.field10580);
    }

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "()I")
    public final synchronized int method4237() {
        return this.field10580 < 0 ? -1 : this.field10580;
    }

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "(I)V")
    public final synchronized void method4238(int arg0) {
        int var2 = ((class695) super.field10053).field9688.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field10591 = arg0;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II[B[IIIIIIILkca;II)I")
    private static final int method4239(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class760 arg10, int arg11, int arg12) {
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
        arg10.field10591 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "()Z")
    private final boolean method4240() {
        int var1 = this.field10583;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method4233(var1, this.field10580);
            var2 = method4246(var1, this.field10580);
        }
        if (this.field10579 == var1 && this.field10590 == var3 && this.field10582 == var2) {
            if (this.field10583 == Integer.MIN_VALUE) {
                this.field10583 = 0;
                this.field10579 = this.field10590 = this.field10582 = 0;
                this.method549(6410);
                return true;
            } else {
                this.method4236();
                return false;
            }
        } else {
            if (this.field10579 < var1) {
                this.field10587 = 1;
                this.field10584 = var1 - this.field10579;
            } else if (this.field10579 > var1) {
                this.field10587 = -1;
                this.field10584 = this.field10579 - var1;
            } else {
                this.field10587 = 0;
            }
            if (this.field10590 < var3) {
                this.field10586 = 1;
                if (this.field10584 == 0 || this.field10584 > var3 - this.field10590) {
                    this.field10584 = var3 - this.field10590;
                }
            } else if (this.field10590 > var3) {
                this.field10586 = -1;
                if (this.field10584 == 0 || this.field10584 > this.field10590 - var3) {
                    this.field10584 = this.field10590 - var3;
                }
            } else {
                this.field10586 = 0;
            }
            if (this.field10582 < var2) {
                this.field10581 = 1;
                if (this.field10584 == 0 || this.field10584 > var2 - this.field10582) {
                    this.field10584 = var2 - this.field10582;
                }
            } else if (this.field10582 > var2) {
                this.field10581 = -1;
                if (this.field10584 == 0 || this.field10584 > this.field10582 - var2) {
                    this.field10584 = this.field10582 - var2;
                }
            } else {
                this.field10581 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([B[IIIIIIILkca;)I")
    private static final int method4241(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class760 arg8) {
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
        arg8.field10591 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "(I)V")
    public final synchronized void method4242(int arg0) {
        this.field10592 = arg0;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(II[B[IIIIIIIILkca;II)I")
    private static final int method4243(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class760 arg11, int arg12, int arg13) {
        arg11.field10590 -= arg11.field10586 * arg5;
        arg11.field10582 -= arg11.field10581 * arg5;
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
        arg11.field10590 += arg11.field10586 * arg5;
        arg11.field10582 += arg11.field10581 * arg5;
        arg11.field10579 = arg6;
        arg11.field10591 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "()I")
    public final int method355() {
        return this.field10583 == 0 && this.field10584 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "()Lco;")
    public final class725 method358() {
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(II[B[IIIIIIIILkca;II)I")
    private static final int method4244(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class760 arg11, int arg12, int arg13) {
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
        arg11.field10591 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "([B[IIIIIIILkca;)I")
    private static final int method4245(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class760 arg8) {
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
        arg8.field10591 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(II)I")
    private static final int method4246(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I[B[IIIIIIIILkca;)I")
    private static final int method4247(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class760 arg10) {
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
        arg10.field10591 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(II)V")
    private final synchronized void method4248(int arg0, int arg1) {
        this.field10583 = arg0;
        this.field10580 = arg1;
        this.field10584 = 0;
        this.method4236();
    }

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "()Z")
    public final boolean method4249() {
        return this.field10591 < 0 || this.field10591 >= ((class695) super.field10053).field9688.length << 8;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lwo;III)V")
    private class760(class695 arg0, int arg1, int arg2, int arg3) {
        super.field10053 = arg0;
        this.field10593 = arg0.field9687;
        this.field10589 = arg0.field9684;
        this.field10588 = arg0.field9685;
        this.field10585 = arg1;
        this.field10583 = arg2;
        this.field10580 = arg3;
        this.field10591 = 0;
        this.method4236();
    }
}
