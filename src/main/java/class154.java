import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class154 extends class56 {

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "Z")
    private boolean field2556;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    private int field2561;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    private int field2551;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    private int field2552;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    private int field2553;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final synchronized void method411(int arg0) {
        if (this.field2555 > 0) {
            if (arg0 >= this.field2555) {
                if (this.field2560 == Integer.MIN_VALUE) {
                    this.field2560 = 0;
                    this.field2557 = this.field2553 = this.field2559 = 0;
                    this.method290((byte) -48);
                    arg0 = this.field2555;
                }
                this.field2555 = 0;
                this.method1025();
            } else {
                this.field2557 += this.field2552 * arg0;
                this.field2553 += this.field2565 * arg0;
                this.field2559 += this.field2554 * arg0;
                this.field2555 -= arg0;
            }
        }
        class150 var2 = (class150) super.field858;
        int var3 = this.field2564 << 8;
        int var4 = this.field2563 << 8;
        int var5 = var2.field2510.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2558 = 0;
        }
        if (this.field2551 < 0) {
            if (this.field2561 <= 0) {
                this.method1028();
                this.method290((byte) -48);
                return;
            }
            this.field2551 = 0;
        }
        if (this.field2551 >= var5) {
            if (this.field2561 >= 0) {
                this.method1028();
                this.method290((byte) -48);
                return;
            }
            this.field2551 = var5 - 1;
        }
        this.field2551 += this.field2561 * arg0;
        if (this.field2558 < 0) {
            if (!this.field2556) {
                if (this.field2561 < 0) {
                    if (this.field2551 < var3) {
                        this.field2551 = var4 - 1 - (var4 - 1 - this.field2551) % var6;
                    }
                } else if (this.field2551 >= var4) {
                    this.field2551 = (this.field2551 - var3) % var6 + var3;
                }
            } else {
                if (this.field2561 < 0) {
                    if (this.field2551 >= var3) {
                        return;
                    }
                    this.field2551 = var3 + var3 - 1 - this.field2551;
                    this.field2561 = -this.field2561;
                }
                while (this.field2551 >= var4) {
                    this.field2551 = var4 + var4 - 1 - this.field2551;
                    this.field2561 = -this.field2561;
                    if (this.field2551 >= var3) {
                        return;
                    }
                    this.field2551 = var3 + var3 - 1 - this.field2551;
                    this.field2561 = -this.field2561;
                }
            }
        } else {
            if (this.field2558 > 0) {
                if (this.field2556) {
                    label125: {
                        if (this.field2561 < 0) {
                            if (this.field2551 >= var3) {
                                return;
                            }
                            this.field2551 = var3 + var3 - 1 - this.field2551;
                            this.field2561 = -this.field2561;
                            if (--this.field2558 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2551 < var4) {
                                return;
                            }
                            this.field2551 = var4 + var4 - 1 - this.field2551;
                            this.field2561 = -this.field2561;
                            if (--this.field2558 == 0) {
                                break;
                            }
                            if (this.field2551 >= var3) {
                                return;
                            }
                            this.field2551 = var3 + var3 - 1 - this.field2551;
                            this.field2561 = -this.field2561;
                        } while (--this.field2558 != 0);
                    }
                } else if (this.field2561 < 0) {
                    if (this.field2551 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2551) / var6;
                    if (var7 < this.field2558) {
                        this.field2551 += var6 * var7;
                        this.field2558 -= var7;
                        return;
                    }
                    this.field2551 += this.field2558 * var6;
                    this.field2558 = 0;
                } else {
                    if (this.field2551 < var4) {
                        return;
                    }
                    int var8 = (this.field2551 - var3) / var6;
                    if (var8 < this.field2558) {
                        this.field2551 -= var6 * var8;
                        this.field2558 -= var8;
                        return;
                    }
                    this.field2551 -= this.field2558 * var6;
                    this.field2558 = 0;
                }
            }
            if (this.field2561 < 0) {
                if (this.field2551 < 0) {
                    this.field2551 = -1;
                    this.method1028();
                    this.method290((byte) -48);
                    return;
                }
            } else if (this.field2551 >= var5) {
                this.field2551 = var5;
                this.method1028();
                this.method290((byte) -48);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public final synchronized void method993(int arg0) {
        if (this.field2561 < 0) {
            this.field2561 = -arg0;
        } else {
            this.field2561 = arg0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()Lpf;")
    public final class56 method409() {
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "()Z")
    public final boolean method994() {
        return this.field2551 < 0 || this.field2551 >= ((class150) super.field858).field2510.length << 8;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    private static final int method995(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lee;III)Ljj;")
    public static final class154 method996(class150 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2510 != null && arg0.field2510.length != 0 ? new class154(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V")
    public final synchronized void method997(int arg0, int arg1) {
        this.method1021(arg0, arg1, this.method1004());
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[B[IIIIIIIILjj;II)I")
    private static final int method998(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
        arg11.field2553 -= arg11.field2565 * arg5;
        arg11.field2559 -= arg11.field2554 * arg5;
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
        arg11.field2553 += arg11.field2565 * arg5;
        arg11.field2559 += arg11.field2554 * arg5;
        arg11.field2557 = arg6;
        arg11.field2551 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
    public final synchronized void method999(boolean arg0) {
        this.field2561 = (this.field2561 >>> 31) + (this.field2561 ^ this.field2561 >> 31);
        if (arg0) {
            this.field2561 = -this.field2561;
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "()Z")
    public final boolean method1000() {
        return this.field2555 != 0;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([B[IIIIIIIILjj;)I")
    private static final int method1001(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class154 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2553 += (var14 - arg3) * arg9.field2565;
        arg9.field2559 += (var14 - arg3) * arg9.field2554;
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
        arg9.field2557 = var12 >> 2;
        arg9.field2551 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "()Z")
    private final boolean method1002() {
        int var1 = this.field2560;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method995(var1, this.field2562);
            var2 = method1006(var1, this.field2562);
        }
        if (this.field2557 == var1 && this.field2553 == var3 && this.field2559 == var2) {
            if (this.field2560 == Integer.MIN_VALUE) {
                this.field2560 = 0;
                this.field2557 = this.field2553 = this.field2559 = 0;
                this.method290((byte) -48);
                return true;
            } else {
                this.method1025();
                return false;
            }
        } else {
            if (this.field2557 < var1) {
                this.field2552 = 1;
                this.field2555 = var1 - this.field2557;
            } else if (this.field2557 > var1) {
                this.field2552 = -1;
                this.field2555 = this.field2557 - var1;
            } else {
                this.field2552 = 0;
            }
            if (this.field2553 < var3) {
                this.field2565 = 1;
                if (this.field2555 == 0 || this.field2555 > var3 - this.field2553) {
                    this.field2555 = var3 - this.field2553;
                }
            } else if (this.field2553 > var3) {
                this.field2565 = -1;
                if (this.field2555 == 0 || this.field2555 > this.field2553 - var3) {
                    this.field2555 = this.field2553 - var3;
                }
            } else {
                this.field2565 = 0;
            }
            if (this.field2559 < var2) {
                this.field2554 = 1;
                if (this.field2555 == 0 || this.field2555 > var2 - this.field2559) {
                    this.field2555 = var2 - this.field2559;
                }
            } else if (this.field2559 > var2) {
                this.field2554 = -1;
                if (this.field2555 == 0 || this.field2555 > this.field2559 - var2) {
                    this.field2555 = this.field2559 - var2;
                }
            } else {
                this.field2554 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V")
    private final synchronized void method1003(int arg0) {
        this.method1027(arg0, this.method1004());
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()Lpf;")
    public final class56 method406() {
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "()I")
    public final synchronized int method1004() {
        return this.field2562 < 0 ? -1 : this.field2562;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[B[IIIIIIIILjj;)I")
    private static final int method1005(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10) {
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
        arg10.field2551 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V")
    public final synchronized void method407(int[] arg0, int arg1, int arg2) {
        if (this.field2560 == 0 && this.field2555 == 0) {
            this.method411(arg2);
        } else {
            class150 var4 = (class150) super.field858;
            int var5 = this.field2564 << 8;
            int var6 = this.field2563 << 8;
            int var7 = var4.field2510.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2558 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2551 < 0) {
                if (this.field2561 <= 0) {
                    this.method1028();
                    this.method290((byte) -48);
                    return;
                }
                this.field2551 = 0;
            }
            if (this.field2551 >= var7) {
                if (this.field2561 >= 0) {
                    this.method1028();
                    this.method290((byte) -48);
                    return;
                }
                this.field2551 = var7 - 1;
            }
            if (this.field2558 < 0) {
                if (this.field2556) {
                    if (this.field2561 < 0) {
                        var9 = this.method1030(arg0, arg1, var5, var10, var4.field2510[this.field2564]);
                        if (this.field2551 >= var5) {
                            return;
                        }
                        this.field2551 = var5 + var5 - 1 - this.field2551;
                        this.field2561 = -this.field2561;
                    }
                    while (true) {
                        int var11 = this.method1031(arg0, var9, var6, var10, var4.field2510[this.field2563 - 1]);
                        if (this.field2551 < var6) {
                            return;
                        }
                        this.field2551 = var6 + var6 - 1 - this.field2551;
                        this.field2561 = -this.field2561;
                        var9 = this.method1030(arg0, var11, var5, var10, var4.field2510[this.field2564]);
                        if (this.field2551 >= var5) {
                            return;
                        }
                        this.field2551 = var5 + var5 - 1 - this.field2551;
                        this.field2561 = -this.field2561;
                    }
                } else if (this.field2561 < 0) {
                    while (true) {
                        var9 = this.method1030(arg0, var9, var5, var10, var4.field2510[this.field2563 - 1]);
                        if (this.field2551 >= var5) {
                            return;
                        }
                        this.field2551 = var6 - 1 - (var6 - 1 - this.field2551) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1031(arg0, var9, var6, var10, var4.field2510[this.field2564]);
                        if (this.field2551 < var6) {
                            return;
                        }
                        this.field2551 = (this.field2551 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2558 > 0) {
                    if (this.field2556) {
                        label130: {
                            if (this.field2561 < 0) {
                                var9 = this.method1030(arg0, arg1, var5, var10, var4.field2510[this.field2564]);
                                if (this.field2551 >= var5) {
                                    return;
                                }
                                this.field2551 = var5 + var5 - 1 - this.field2551;
                                this.field2561 = -this.field2561;
                                if (--this.field2558 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1031(arg0, var9, var6, var10, var4.field2510[this.field2563 - 1]);
                                if (this.field2551 < var6) {
                                    return;
                                }
                                this.field2551 = var6 + var6 - 1 - this.field2551;
                                this.field2561 = -this.field2561;
                                if (--this.field2558 == 0) {
                                    break;
                                }
                                var9 = this.method1030(arg0, var9, var5, var10, var4.field2510[this.field2564]);
                                if (this.field2551 >= var5) {
                                    return;
                                }
                                this.field2551 = var5 + var5 - 1 - this.field2551;
                                this.field2561 = -this.field2561;
                            } while (--this.field2558 != 0);
                        }
                    } else if (this.field2561 < 0) {
                        while (true) {
                            var9 = this.method1030(arg0, var9, var5, var10, var4.field2510[this.field2563 - 1]);
                            if (this.field2551 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2551) / var8;
                            if (var12 >= this.field2558) {
                                this.field2551 += this.field2558 * var8;
                                this.field2558 = 0;
                                break;
                            }
                            this.field2551 += var8 * var12;
                            this.field2558 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1031(arg0, var9, var6, var10, var4.field2510[this.field2564]);
                            if (this.field2551 < var6) {
                                return;
                            }
                            int var13 = (this.field2551 - var5) / var8;
                            if (var13 >= this.field2558) {
                                this.field2551 -= this.field2558 * var8;
                                this.field2558 = 0;
                                break;
                            }
                            this.field2551 -= var8 * var13;
                            this.field2558 -= var13;
                        }
                    }
                }
                if (this.field2561 < 0) {
                    this.method1030(arg0, var9, 0, var10, 0);
                    if (this.field2551 < 0) {
                        this.field2551 = -1;
                        this.method1028();
                        this.method290((byte) -48);
                        return;
                    }
                } else {
                    this.method1031(arg0, var9, var7, var10, 0);
                    if (this.field2551 >= var7) {
                        this.field2551 = var7;
                        this.method1028();
                        this.method290((byte) -48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)I")
    private static final int method1006(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
    public final synchronized void method1007(int arg0) {
        this.method1027(arg0 << 6, this.method1004());
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[B[IIIIIIILjj;II)I")
    private static final int method1008(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10, int arg11, int arg12) {
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
        arg10.field2551 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II[B[IIIIIIIILjj;II)I")
    private static final int method1009(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
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
        arg11.field2551 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([B[IIIIIIILjj;)I")
    private static final int method1010(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class154 arg8) {
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
        arg8.field2551 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[B[IIIIIIIIIILjj;II)I")
    private static final int method1011(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class154 arg13, int arg14, int arg15) {
        arg13.field2557 -= arg13.field2552 * arg5;
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
        arg13.field2557 += arg13.field2552 * var22;
        arg13.field2553 = arg6;
        arg13.field2559 = arg7;
        arg13.field2551 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lee;II)Ljj;")
    public static final class154 method1012(class150 arg0, int arg1, int arg2) {
        return arg0.field2510 != null && arg0.field2510.length != 0 ? new class154(arg0, (int) ((long) arg0.field2509 * 256L * (long) arg1 / (long) (class207.field3554 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I[B[IIIIIIIILjj;)I")
    private static final int method1013(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10) {
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
        arg10.field2551 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "()I")
    public final synchronized int method1014() {
        return this.field2560 == Integer.MIN_VALUE ? 0 : this.field2560;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "([B[IIIIIIIILjj;)I")
    private static final int method1015(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class154 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2553 += (var14 - arg3) * arg9.field2565;
        arg9.field2559 += (var14 - arg3) * arg9.field2554;
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
        arg9.field2557 = var12 >> 2;
        arg9.field2551 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
    public final int method405() {
        int var1 = this.field2557 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2558 == 0) {
            var2 -= this.field2551 * var2 / (((class150) super.field858).field2510.length << 8);
        } else if (this.field2558 >= 0) {
            var2 -= this.field2564 * var2 / ((class150) super.field858).field2510.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II[B[IIIIIIIILjj;II)I")
    private static final int method1016(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
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
        arg11.field2551 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[B[IIIIIIIIIILjj;)I")
    private static final int method1017(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class154 arg12) {
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
        arg12.field2557 += (var19 - arg4) * arg12.field2552;
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
        arg12.field2553 = var15 >> 2;
        arg12.field2559 = var16 >> 2;
        arg12.field2551 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
    public final synchronized void method1018(int arg0) {
        this.field2558 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "()I")
    public final synchronized int method1019() {
        return this.field2561 < 0 ? -this.field2561 : this.field2561;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "([B[IIIIIIILjj;)I")
    private static final int method1020(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class154 arg8) {
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
        arg8.field2551 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public final synchronized void method1021(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1027(arg1, arg2);
        } else {
            int var4 = method995(arg1, arg2);
            int var5 = method1006(arg1, arg2);
            if (this.field2553 == var4 && this.field2559 == var5) {
                this.field2555 = 0;
            } else {
                int var6 = arg1 - this.field2557;
                if (this.field2557 - arg1 > var6) {
                    var6 = this.field2557 - arg1;
                }
                if (var4 - this.field2553 > var6) {
                    var6 = var4 - this.field2553;
                }
                if (this.field2553 - var4 > var6) {
                    var6 = this.field2553 - var4;
                }
                if (var5 - this.field2559 > var6) {
                    var6 = var5 - this.field2559;
                }
                if (this.field2559 - var5 > var6) {
                    var6 = this.field2559 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2555 = arg0;
                this.field2560 = arg1;
                this.field2562 = arg2;
                this.field2552 = (arg1 - this.field2557) / arg0;
                this.field2565 = (var4 - this.field2553) / arg0;
                this.field2554 = (var5 - this.field2559) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II[B[IIIIIIIIIILjj;II)I")
    private static final int method1022(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class154 arg13, int arg14, int arg15) {
        arg13.field2557 -= arg13.field2552 * arg5;
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
        arg13.field2557 += arg13.field2552 * var22;
        arg13.field2553 = arg6;
        arg13.field2559 = arg7;
        arg13.field2551 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V")
    public final synchronized void method1023(int arg0) {
        int var2 = ((class150) super.field858).field2510.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2551 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I[B[IIIIIIIIIILjj;)I")
    private static final int method1024(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class154 arg12) {
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
        arg12.field2557 += (var19 - arg4) * arg12.field2552;
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
        arg12.field2553 = var15 >> 2;
        arg12.field2559 = var16 >> 2;
        arg12.field2551 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "()V")
    private final void method1025() {
        this.field2557 = this.field2560;
        this.field2553 = method995(this.field2560, this.field2562);
        this.field2559 = method1006(this.field2560, this.field2562);
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(I)V")
    public final synchronized void method1026(int arg0) {
        if (arg0 == 0) {
            this.method1003(0);
            this.method290((byte) -48);
        } else if (this.field2553 == 0 && this.field2559 == 0) {
            this.field2555 = 0;
            this.field2560 = 0;
            this.field2557 = 0;
            this.method290((byte) -48);
        } else {
            int var2 = -this.field2557;
            if (this.field2557 > var2) {
                var2 = this.field2557;
            }
            if (-this.field2553 > var2) {
                var2 = -this.field2553;
            }
            if (this.field2553 > var2) {
                var2 = this.field2553;
            }
            if (-this.field2559 > var2) {
                var2 = -this.field2559;
            }
            if (this.field2559 > var2) {
                var2 = this.field2559;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2555 = arg0;
            this.field2560 = Integer.MIN_VALUE;
            this.field2552 = -this.field2557 / arg0;
            this.field2565 = -this.field2553 / arg0;
            this.field2554 = -this.field2559 / arg0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
    private final synchronized void method1027(int arg0, int arg1) {
        this.field2560 = arg0;
        this.field2562 = arg1;
        this.field2555 = 0;
        this.method1025();
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "()V")
    private final void method1028() {
        if (this.field2555 != 0) {
            if (this.field2560 == Integer.MIN_VALUE) {
                this.field2560 = 0;
            }
            this.field2555 = 0;
            this.method1025();
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II[B[IIIIIIILjj;II)I")
    private static final int method1029(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class154 arg10, int arg11, int arg12) {
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
        arg10.field2551 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIIII)I")
    private final int method1030(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2555 <= 0) {
                if (this.field2561 == -256 && (this.field2551 & 255) == 0) {
                    if (class145.field2372) {
                        return method1005(0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, 0, arg3, arg2, this);
                    }
                    return method1020(((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, 0, arg3, arg2, this);
                }
                if (class145.field2372) {
                    return method1016(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, 0, arg3, arg2, this, this.field2561, arg4);
                }
                return method1029(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, 0, arg3, arg2, this, this.field2561, arg4);
            }
            int var6 = this.field2555 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2555 += arg1;
            if (this.field2561 == -256 && (this.field2551 & 255) == 0) {
                if (class145.field2372) {
                    arg1 = method1017(0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, this.field2565, this.field2554, 0, var6, arg2, this);
                } else {
                    arg1 = method1015(((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, this.field2552, 0, var6, arg2, this);
                }
            } else if (class145.field2372) {
                arg1 = method1011(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, this.field2565, this.field2554, 0, var6, arg2, this, this.field2561, arg4);
            } else {
                arg1 = method1032(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, this.field2552, 0, var6, arg2, this, this.field2561, arg4);
            }
            this.field2555 -= arg1;
            if (this.field2555 != 0) {
                return arg1;
            }
        } while (!this.method1002());
        return arg3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "([IIIII)I")
    private final int method1031(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2555 <= 0) {
                if (this.field2561 == 256 && (this.field2551 & 255) == 0) {
                    if (class145.field2372) {
                        return method1013(0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, 0, arg3, arg2, this);
                    }
                    return method1010(((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, 0, arg3, arg2, this);
                }
                if (class145.field2372) {
                    return method1009(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, 0, arg3, arg2, this, this.field2561, arg4);
                }
                return method1008(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, 0, arg3, arg2, this, this.field2561, arg4);
            }
            int var6 = this.field2555 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2555 += arg1;
            if (this.field2561 == 256 && (this.field2551 & 255) == 0) {
                if (class145.field2372) {
                    arg1 = method1024(0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, this.field2565, this.field2554, 0, var6, arg2, this);
                } else {
                    arg1 = method1001(((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, this.field2552, 0, var6, arg2, this);
                }
            } else if (class145.field2372) {
                arg1 = method1022(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2553, this.field2559, this.field2565, this.field2554, 0, var6, arg2, this, this.field2561, arg4);
            } else {
                arg1 = method998(0, 0, ((class150) super.field858).field2510, arg0, this.field2551, arg1, this.field2557, this.field2552, 0, var6, arg2, this, this.field2561, arg4);
            }
            this.field2555 -= arg1;
            if (this.field2555 != 0) {
                return arg1;
            }
        } while (!this.method1002());
        return arg3;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
    public final int method408() {
        return this.field2560 == 0 && this.field2555 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II[B[IIIIIIIILjj;II)I")
    private static final int method1032(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class154 arg11, int arg12, int arg13) {
        arg11.field2553 -= arg11.field2565 * arg5;
        arg11.field2559 -= arg11.field2554 * arg5;
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
        arg11.field2553 += arg11.field2565 * arg5;
        arg11.field2559 += arg11.field2554 * arg5;
        arg11.field2557 = arg6;
        arg11.field2551 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lee;II)V")
    private class154(class150 arg0, int arg1, int arg2) {
        super.field858 = arg0;
        this.field2564 = arg0.field2508;
        this.field2563 = arg0.field2512;
        this.field2556 = arg0.field2511;
        this.field2561 = arg1;
        this.field2560 = arg2;
        this.field2562 = 8192;
        this.field2551 = 0;
        this.method1025();
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lee;III)V")
    private class154(class150 arg0, int arg1, int arg2, int arg3) {
        super.field858 = arg0;
        this.field2564 = arg0.field2508;
        this.field2563 = arg0.field2512;
        this.field2556 = arg0.field2511;
        this.field2561 = arg1;
        this.field2560 = arg2;
        this.field2562 = arg3;
        this.field2551 = 0;
        this.method1025();
    }
}
