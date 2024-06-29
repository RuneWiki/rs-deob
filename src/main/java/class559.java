import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class559 extends class276 {

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    private int field7564;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    private int field7567;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Z")
    private boolean field7560;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    private int field7553;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    private int field7562;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    private int field7558;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    private int field7555;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    private int field7554;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    private int field7556;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    private int field7557;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    private int field7559;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    private int field7561;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    private int field7563;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    private int field7565;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    private int field7566;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([B[IIIIIIIILji;)I", line = 3)
    private static final int method3065(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class559 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7563 += (var14 - arg3) * arg9.field7557;
        arg9.field7559 += (var14 - arg3) * arg9.field7556;
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
        arg9.field7565 = var12 >> 2;
        arg9.field7555 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V", line = 37)
    private final void method3066() {
        if (this.field7561 != 0) {
            if (this.field7562 == Integer.MIN_VALUE) {
                this.field7562 = 0;
            }
            this.field7561 = 0;
            this.method3088();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 49)
    private final synchronized void method3067(int arg0, int arg1) {
        this.field7562 = arg0;
        this.field7558 = arg1;
        this.field7561 = 0;
        this.method3088();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 55)
    private final synchronized void method3068(int arg0) {
        this.method3067(arg0, this.method3090());
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "()Z", line = 58)
    public final boolean method3069() {
        return this.field7555 < 0 || this.field7555 >= ((class59) super.field3875).field808.length << 8;
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V", line = 64)
    public final synchronized void method3070(int arg0) {
        if (arg0 == 0) {
            this.method3068(0);
            this.method2971(1);
        } else if (this.field7563 == 0 && this.field7559 == 0) {
            this.field7561 = 0;
            this.field7562 = 0;
            this.field7565 = 0;
            this.method2971(1);
        } else {
            int var2 = -this.field7565;
            if (this.field7565 > var2) {
                var2 = this.field7565;
            }
            if (-this.field7563 > var2) {
                var2 = -this.field7563;
            }
            if (this.field7563 > var2) {
                var2 = this.field7563;
            }
            if (-this.field7559 > var2) {
                var2 = -this.field7559;
            }
            if (this.field7559 > var2) {
                var2 = this.field7559;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7561 = arg0;
            this.field7562 = Integer.MIN_VALUE;
            this.field7566 = -this.field7565 / arg0;
            this.field7557 = -this.field7563 / arg0;
            this.field7556 = -this.field7559 / arg0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()Lvw;", line = 109)
    public final class276 method1676() {
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "([B[IIIIIIIILji;)I", line = 112)
    private static final int method3071(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class559 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7563 += (var14 - arg3) * arg9.field7557;
        arg9.field7559 += (var14 - arg3) * arg9.field7556;
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
        arg9.field7565 = var12 >> 2;
        arg9.field7555 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I", line = 148)
    private static final int method3072(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[B[IIIIIIIILji;II)I", line = 151)
    private static final int method3073(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class559 arg11, int arg12, int arg13) {
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
        arg11.field7555 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()I", line = 185)
    public final int method1677() {
        int var1 = this.field7565 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7554 == 0) {
            var2 -= this.field7555 * var2 / (((class59) super.field3875).field808.length << 8);
        } else if (this.field7554 >= 0) {
            var2 -= this.field7564 * var2 / ((class59) super.field3875).field808.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II[B[IIIIIIIILji;II)I", line = 197)
    private static final int method3074(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class559 arg11, int arg12, int arg13) {
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
        arg11.field7555 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[B[IIIIIIIIIILji;II)I", line = 231)
    private static final int method3075(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class559 arg13, int arg14, int arg15) {
        arg13.field7565 -= arg13.field7566 * arg5;
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
        arg13.field7565 += arg13.field7566 * var22;
        arg13.field7563 = arg6;
        arg13.field7559 = arg7;
        arg13.field7555 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V", line = 275)
    public final synchronized void method3076(int arg0) {
        if (this.field7553 < 0) {
            this.field7553 = -arg0;
        } else {
            this.field7553 = arg0;
        }
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "()I", line = 283)
    public final synchronized int method3077() {
        return this.field7553 < 0 ? -this.field7553 : this.field7553;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqr;II)Lji;", line = 286)
    public static final class559 method3078(class59 arg0, int arg1, int arg2) {
        return arg0.field808 != null && arg0.field808.length != 0 ? new class559(arg0, (int) ((long) arg0.field809 * 256L * (long) arg1 / (long) (class29.field359 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "()Z", line = 293)
    public final boolean method3079() {
        return this.field7561 != 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqr;III)Lji;", line = 297)
    public static final class559 method3080(class59 arg0, int arg1, int arg2, int arg3) {
        return arg0.field808 != null && arg0.field808.length != 0 ? new class559(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V", line = 303)
    public final synchronized void method3081(boolean arg0) {
        this.field7553 = (this.field7553 >>> 31) + (this.field7553 ^ this.field7553 >> 31);
        if (arg0) {
            this.field7553 = -this.field7553;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([B[IIIIIIILji;)I", line = 309)
    private static final int method3082(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class559 arg8) {
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
        arg8.field7555 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V", line = 334)
    public final synchronized void method1672(int[] arg0, int arg1, int arg2) {
        if (this.field7562 == 0 && this.field7561 == 0) {
            this.method1678(arg2);
        } else {
            class59 var4 = (class59) super.field3875;
            int var5 = this.field7564 << 8;
            int var6 = this.field7567 << 8;
            int var7 = var4.field808.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7554 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7555 < 0) {
                if (this.field7553 <= 0) {
                    this.method3066();
                    this.method2971(1);
                    return;
                }
                this.field7555 = 0;
            }
            if (this.field7555 >= var7) {
                if (this.field7553 >= 0) {
                    this.method3066();
                    this.method2971(1);
                    return;
                }
                this.field7555 = var7 - 1;
            }
            if (this.field7554 < 0) {
                if (this.field7560) {
                    if (this.field7553 < 0) {
                        var9 = this.method3097(arg0, arg1, var5, var10, var4.field808[this.field7564]);
                        if (this.field7555 >= var5) {
                            return;
                        }
                        this.field7555 = var5 + var5 - 1 - this.field7555;
                        this.field7553 = -this.field7553;
                    }
                    while (true) {
                        int var11 = this.method3104(arg0, var9, var6, var10, var4.field808[this.field7567 - 1]);
                        if (this.field7555 < var6) {
                            return;
                        }
                        this.field7555 = var6 + var6 - 1 - this.field7555;
                        this.field7553 = -this.field7553;
                        var9 = this.method3097(arg0, var11, var5, var10, var4.field808[this.field7564]);
                        if (this.field7555 >= var5) {
                            return;
                        }
                        this.field7555 = var5 + var5 - 1 - this.field7555;
                        this.field7553 = -this.field7553;
                    }
                } else if (this.field7553 < 0) {
                    while (true) {
                        var9 = this.method3097(arg0, var9, var5, var10, var4.field808[this.field7567 - 1]);
                        if (this.field7555 >= var5) {
                            return;
                        }
                        this.field7555 = var6 - 1 - (var6 - 1 - this.field7555) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3104(arg0, var9, var6, var10, var4.field808[this.field7564]);
                        if (this.field7555 < var6) {
                            return;
                        }
                        this.field7555 = (this.field7555 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7554 > 0) {
                    if (this.field7560) {
                        label130: {
                            if (this.field7553 < 0) {
                                var9 = this.method3097(arg0, arg1, var5, var10, var4.field808[this.field7564]);
                                if (this.field7555 >= var5) {
                                    return;
                                }
                                this.field7555 = var5 + var5 - 1 - this.field7555;
                                this.field7553 = -this.field7553;
                                if (--this.field7554 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3104(arg0, var9, var6, var10, var4.field808[this.field7567 - 1]);
                                if (this.field7555 < var6) {
                                    return;
                                }
                                this.field7555 = var6 + var6 - 1 - this.field7555;
                                this.field7553 = -this.field7553;
                                if (--this.field7554 == 0) {
                                    break;
                                }
                                var9 = this.method3097(arg0, var9, var5, var10, var4.field808[this.field7564]);
                                if (this.field7555 >= var5) {
                                    return;
                                }
                                this.field7555 = var5 + var5 - 1 - this.field7555;
                                this.field7553 = -this.field7553;
                            } while (--this.field7554 != 0);
                        }
                    } else if (this.field7553 < 0) {
                        while (true) {
                            var9 = this.method3097(arg0, var9, var5, var10, var4.field808[this.field7567 - 1]);
                            if (this.field7555 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7555) / var8;
                            if (var12 >= this.field7554) {
                                this.field7555 += this.field7554 * var8;
                                this.field7554 = 0;
                                break;
                            }
                            this.field7555 += var8 * var12;
                            this.field7554 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3104(arg0, var9, var6, var10, var4.field808[this.field7564]);
                            if (this.field7555 < var6) {
                                return;
                            }
                            int var13 = (this.field7555 - var5) / var8;
                            if (var13 >= this.field7554) {
                                this.field7555 -= this.field7554 * var8;
                                this.field7554 = 0;
                                break;
                            }
                            this.field7555 -= var8 * var13;
                            this.field7554 -= var13;
                        }
                    }
                }
                if (this.field7553 < 0) {
                    this.method3097(arg0, var9, 0, var10, 0);
                    if (this.field7555 < 0) {
                        this.field7555 = -1;
                        this.method3066();
                        this.method2971(1);
                        return;
                    }
                } else {
                    this.method3104(arg0, var9, var7, var10, 0);
                    if (this.field7555 >= var7) {
                        this.field7555 = var7;
                        this.method3066();
                        this.method2971(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)I", line = 569)
    private static final int method3083(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 572)
    public final synchronized void method1678(int arg0) {
        if (this.field7561 > 0) {
            if (arg0 >= this.field7561) {
                if (this.field7562 == Integer.MIN_VALUE) {
                    this.field7562 = 0;
                    this.field7565 = this.field7563 = this.field7559 = 0;
                    this.method2971(1);
                    arg0 = this.field7561;
                }
                this.field7561 = 0;
                this.method3088();
            } else {
                this.field7565 += this.field7566 * arg0;
                this.field7563 += this.field7557 * arg0;
                this.field7559 += this.field7556 * arg0;
                this.field7561 -= arg0;
            }
        }
        class59 var2 = (class59) super.field3875;
        int var3 = this.field7564 << 8;
        int var4 = this.field7567 << 8;
        int var5 = var2.field808.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7554 = 0;
        }
        if (this.field7555 < 0) {
            if (this.field7553 <= 0) {
                this.method3066();
                this.method2971(1);
                return;
            }
            this.field7555 = 0;
        }
        if (this.field7555 >= var5) {
            if (this.field7553 >= 0) {
                this.method3066();
                this.method2971(1);
                return;
            }
            this.field7555 = var5 - 1;
        }
        this.field7555 += this.field7553 * arg0;
        if (this.field7554 < 0) {
            if (!this.field7560) {
                if (this.field7553 < 0) {
                    if (this.field7555 < var3) {
                        this.field7555 = var4 - 1 - (var4 - 1 - this.field7555) % var6;
                    }
                } else if (this.field7555 >= var4) {
                    this.field7555 = (this.field7555 - var3) % var6 + var3;
                }
            } else {
                if (this.field7553 < 0) {
                    if (this.field7555 >= var3) {
                        return;
                    }
                    this.field7555 = var3 + var3 - 1 - this.field7555;
                    this.field7553 = -this.field7553;
                }
                while (this.field7555 >= var4) {
                    this.field7555 = var4 + var4 - 1 - this.field7555;
                    this.field7553 = -this.field7553;
                    if (this.field7555 >= var3) {
                        return;
                    }
                    this.field7555 = var3 + var3 - 1 - this.field7555;
                    this.field7553 = -this.field7553;
                }
            }
        } else {
            if (this.field7554 > 0) {
                if (this.field7560) {
                    label125: {
                        if (this.field7553 < 0) {
                            if (this.field7555 >= var3) {
                                return;
                            }
                            this.field7555 = var3 + var3 - 1 - this.field7555;
                            this.field7553 = -this.field7553;
                            if (--this.field7554 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7555 < var4) {
                                return;
                            }
                            this.field7555 = var4 + var4 - 1 - this.field7555;
                            this.field7553 = -this.field7553;
                            if (--this.field7554 == 0) {
                                break;
                            }
                            if (this.field7555 >= var3) {
                                return;
                            }
                            this.field7555 = var3 + var3 - 1 - this.field7555;
                            this.field7553 = -this.field7553;
                        } while (--this.field7554 != 0);
                    }
                } else if (this.field7553 < 0) {
                    if (this.field7555 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7555) / var6;
                    if (var7 < this.field7554) {
                        this.field7555 += var6 * var7;
                        this.field7554 -= var7;
                        return;
                    }
                    this.field7555 += this.field7554 * var6;
                    this.field7554 = 0;
                } else {
                    if (this.field7555 < var4) {
                        return;
                    }
                    int var8 = (this.field7555 - var3) / var6;
                    if (var8 < this.field7554) {
                        this.field7555 -= var6 * var8;
                        this.field7554 -= var8;
                        return;
                    }
                    this.field7555 -= this.field7554 * var6;
                    this.field7554 = 0;
                }
            }
            if (this.field7553 < 0) {
                if (this.field7555 < 0) {
                    this.field7555 = -1;
                    this.method3066();
                    this.method2971(1);
                    return;
                }
            } else if (this.field7555 >= var5) {
                this.field7555 = var5;
                this.method3066();
                this.method2971(1);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V", line = 795)
    public final synchronized void method3084(int arg0) {
        int var2 = ((class59) super.field3875).field808.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7555 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V", line = 806)
    public final synchronized void method3085(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3067(arg1, arg2);
        } else {
            int var4 = method3083(arg1, arg2);
            int var5 = method3072(arg1, arg2);
            if (this.field7563 == var4 && this.field7559 == var5) {
                this.field7561 = 0;
            } else {
                int var6 = arg1 - this.field7565;
                if (this.field7565 - arg1 > var6) {
                    var6 = this.field7565 - arg1;
                }
                if (var4 - this.field7563 > var6) {
                    var6 = var4 - this.field7563;
                }
                if (this.field7563 - var4 > var6) {
                    var6 = this.field7563 - var4;
                }
                if (var5 - this.field7559 > var6) {
                    var6 = var5 - this.field7559;
                }
                if (this.field7559 - var5 > var6) {
                    var6 = this.field7559 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7561 = arg0;
                this.field7562 = arg1;
                this.field7558 = arg2;
                this.field7566 = (arg1 - this.field7565) / arg0;
                this.field7557 = (var4 - this.field7563) / arg0;
                this.field7556 = (var5 - this.field7559) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[B[IIIIIIILji;II)I", line = 852)
    private static final int method3086(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class559 arg10, int arg11, int arg12) {
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
        arg10.field7555 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II[B[IIIIIIILji;II)I", line = 879)
    private static final int method3087(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class559 arg10, int arg11, int arg12) {
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
        arg10.field7555 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "()V", line = 905)
    private final void method3088() {
        this.field7565 = this.field7562;
        this.field7563 = method3083(this.field7562, this.field7558);
        this.field7559 = method3072(this.field7562, this.field7558);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[B[IIIIIIIIIILji;)I", line = 910)
    private static final int method3089(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class559 arg12) {
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
        arg12.field7565 += (var19 - arg4) * arg12.field7566;
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
        arg12.field7563 = var15 >> 2;
        arg12.field7559 = var16 >> 2;
        arg12.field7555 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "()I", line = 963)
    public final synchronized int method3090() {
        return this.field7558 < 0 ? -1 : this.field7558;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[B[IIIIIIIILji;)I", line = 966)
    private static final int method3091(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class559 arg10) {
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
        arg10.field7555 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "()I", line = 1004)
    public final synchronized int method3092() {
        return this.field7562 == Integer.MIN_VALUE ? 0 : this.field7562;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)V", line = 1009)
    public final synchronized void method3093(int arg0, int arg1) {
        this.method3085(arg0, arg1, this.method3090());
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I[B[IIIIIIIILji;)I", line = 1013)
    private static final int method3094(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class559 arg10) {
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
        arg10.field7555 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "([B[IIIIIIILji;)I", line = 1052)
    private static final int method3095(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class559 arg8) {
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
        arg8.field7555 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "()Z", line = 1078)
    private final boolean method3096() {
        int var1 = this.field7562;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3083(var1, this.field7558);
            var2 = method3072(var1, this.field7558);
        }
        if (this.field7565 == var1 && this.field7563 == var3 && this.field7559 == var2) {
            if (this.field7562 == Integer.MIN_VALUE) {
                this.field7562 = 0;
                this.field7565 = this.field7563 = this.field7559 = 0;
                this.method2971(1);
                return true;
            } else {
                this.method3088();
                return false;
            }
        } else {
            if (this.field7565 < var1) {
                this.field7566 = 1;
                this.field7561 = var1 - this.field7565;
            } else if (this.field7565 > var1) {
                this.field7566 = -1;
                this.field7561 = this.field7565 - var1;
            } else {
                this.field7566 = 0;
            }
            if (this.field7563 < var3) {
                this.field7557 = 1;
                if (this.field7561 == 0 || this.field7561 > var3 - this.field7563) {
                    this.field7561 = var3 - this.field7563;
                }
            } else if (this.field7563 > var3) {
                this.field7557 = -1;
                if (this.field7561 == 0 || this.field7561 > this.field7563 - var3) {
                    this.field7561 = this.field7563 - var3;
                }
            } else {
                this.field7557 = 0;
            }
            if (this.field7559 < var2) {
                this.field7556 = 1;
                if (this.field7561 == 0 || this.field7561 > var2 - this.field7559) {
                    this.field7561 = var2 - this.field7559;
                }
            } else if (this.field7559 > var2) {
                this.field7556 = -1;
                if (this.field7561 == 0 || this.field7561 > this.field7559 - var2) {
                    this.field7561 = this.field7559 - var2;
                }
            } else {
                this.field7556 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()Lvw;", line = 1163)
    public final class276 method1673() {
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()I", line = 1167)
    public final int method1674() {
        return this.field7562 == 0 && this.field7561 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)I", line = 1175)
    private final int method3097(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7561 <= 0) {
                if (this.field7553 == -256 && (this.field7555 & 255) == 0) {
                    if (class581.field8101) {
                        return method3091(0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, 0, arg3, arg2, this);
                    }
                    return method3095(((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, 0, arg3, arg2, this);
                }
                if (class581.field8101) {
                    return method3074(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, 0, arg3, arg2, this, this.field7553, arg4);
                }
                return method3086(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, 0, arg3, arg2, this, this.field7553, arg4);
            }
            int var6 = this.field7561 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7561 += arg1;
            if (this.field7553 == -256 && (this.field7555 & 255) == 0) {
                if (class581.field8101) {
                    arg1 = method3098(0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, this.field7557, this.field7556, 0, var6, arg2, this);
                } else {
                    arg1 = method3065(((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, this.field7566, 0, var6, arg2, this);
                }
            } else if (class581.field8101) {
                arg1 = method3103(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, this.field7557, this.field7556, 0, var6, arg2, this, this.field7553, arg4);
            } else {
                arg1 = method3102(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, this.field7566, 0, var6, arg2, this, this.field7553, arg4);
            }
            this.field7561 -= arg1;
            if (this.field7561 != 0) {
                return arg1;
            }
        } while (!this.method3096());
        return arg3;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I[B[IIIIIIIIIILji;)I", line = 1231)
    private static final int method3098(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class559 arg12) {
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
        arg12.field7565 += (var19 - arg4) * arg12.field7566;
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
        arg12.field7563 = var15 >> 2;
        arg12.field7559 = var16 >> 2;
        arg12.field7555 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V", line = 1285)
    public final synchronized void method3099(int arg0) {
        this.method3067(arg0 << 6, this.method3090());
    }

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "(I)V", line = 1289)
    public final synchronized void method3100(int arg0) {
        this.field7554 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II[B[IIIIIIIILji;II)I", line = 1293)
    private static final int method3101(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class559 arg11, int arg12, int arg13) {
        arg11.field7563 -= arg11.field7557 * arg5;
        arg11.field7559 -= arg11.field7556 * arg5;
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
        arg11.field7563 += arg11.field7557 * arg5;
        arg11.field7559 += arg11.field7556 * arg5;
        arg11.field7565 = arg6;
        arg11.field7555 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(II[B[IIIIIIIILji;II)I", line = 1329)
    private static final int method3102(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class559 arg11, int arg12, int arg13) {
        arg11.field7563 -= arg11.field7557 * arg5;
        arg11.field7559 -= arg11.field7556 * arg5;
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
        arg11.field7563 += arg11.field7557 * arg5;
        arg11.field7559 += arg11.field7556 * arg5;
        arg11.field7565 = arg6;
        arg11.field7555 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II[B[IIIIIIIIIILji;II)I", line = 1362)
    private static final int method3103(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class559 arg13, int arg14, int arg15) {
        arg13.field7565 -= arg13.field7566 * arg5;
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
        arg13.field7565 += arg13.field7566 * var22;
        arg13.field7563 = arg6;
        arg13.field7559 = arg7;
        arg13.field7555 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "([IIIII)I", line = 1403)
    private final int method3104(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7561 <= 0) {
                if (this.field7553 == 256 && (this.field7555 & 255) == 0) {
                    if (class581.field8101) {
                        return method3094(0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, 0, arg3, arg2, this);
                    }
                    return method3082(((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, 0, arg3, arg2, this);
                }
                if (class581.field8101) {
                    return method3073(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, 0, arg3, arg2, this, this.field7553, arg4);
                }
                return method3087(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, 0, arg3, arg2, this, this.field7553, arg4);
            }
            int var6 = this.field7561 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7561 += arg1;
            if (this.field7553 == 256 && (this.field7555 & 255) == 0) {
                if (class581.field8101) {
                    arg1 = method3089(0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, this.field7557, this.field7556, 0, var6, arg2, this);
                } else {
                    arg1 = method3071(((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, this.field7566, 0, var6, arg2, this);
                }
            } else if (class581.field8101) {
                arg1 = method3075(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7563, this.field7559, this.field7557, this.field7556, 0, var6, arg2, this, this.field7553, arg4);
            } else {
                arg1 = method3101(0, 0, ((class59) super.field3875).field808, arg0, this.field7555, arg1, this.field7565, this.field7566, 0, var6, arg2, this, this.field7553, arg4);
            }
            this.field7561 -= arg1;
            if (this.field7561 != 0) {
                return arg1;
            }
        } while (!this.method3096());
        return arg3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lqr;II)V", line = 1458)
    private class559(class59 arg0, int arg1, int arg2) {
        super.field3875 = arg0;
        this.field7564 = arg0.field812;
        this.field7567 = arg0.field810;
        this.field7560 = arg0.field811;
        this.field7553 = arg1;
        this.field7562 = arg2;
        this.field7558 = 8192;
        this.field7555 = 0;
        this.method3088();
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lqr;III)V", line = 1469)
    private class559(class59 arg0, int arg1, int arg2, int arg3) {
        super.field3875 = arg0;
        this.field7564 = arg0.field812;
        this.field7567 = arg0.field810;
        this.field7560 = arg0.field811;
        this.field7553 = arg1;
        this.field7562 = arg2;
        this.field7558 = arg3;
        this.field7555 = 0;
        this.method3088();
    }
}
