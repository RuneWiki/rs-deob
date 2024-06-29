import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class1 {

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Z")
    private boolean field6;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private int field14;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[B[IIIIIIIILud;II)I")
    private static final int method8(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class2 arg11, int arg12, int arg13) {
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
        arg11.field15 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([III)V")
    public final synchronized void method7(int[] arg0, int arg1, int arg2) {
        if (this.field11 == 0 && this.field17 == 0) {
            this.method6(arg2);
        } else {
            class266 var4 = (class266) super.field4;
            int var5 = this.field9 << 8;
            int var6 = this.field8 << 8;
            int var7 = var4.field4533.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field14 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field15 < 0) {
                if (this.field16 <= 0) {
                    this.method44();
                    this.method629(0);
                    return;
                }
                this.field15 = 0;
            }
            if (this.field15 >= var7) {
                if (this.field16 >= 0) {
                    this.method44();
                    this.method629(0);
                    return;
                }
                this.field15 = var7 - 1;
            }
            if (this.field14 < 0) {
                if (this.field6) {
                    if (this.field16 < 0) {
                        var9 = this.method46(arg0, arg1, var5, var10, var4.field4533[this.field9]);
                        if (this.field15 >= var5) {
                            return;
                        }
                        this.field15 = var5 + var5 - 1 - this.field15;
                        this.field16 = -this.field16;
                    }
                    while (true) {
                        int var11 = this.method27(arg0, var9, var6, var10, var4.field4533[this.field8 - 1]);
                        if (this.field15 < var6) {
                            return;
                        }
                        this.field15 = var6 + var6 - 1 - this.field15;
                        this.field16 = -this.field16;
                        var9 = this.method46(arg0, var11, var5, var10, var4.field4533[this.field9]);
                        if (this.field15 >= var5) {
                            return;
                        }
                        this.field15 = var5 + var5 - 1 - this.field15;
                        this.field16 = -this.field16;
                    }
                } else if (this.field16 < 0) {
                    while (true) {
                        var9 = this.method46(arg0, var9, var5, var10, var4.field4533[this.field8 - 1]);
                        if (this.field15 >= var5) {
                            return;
                        }
                        this.field15 = var6 - 1 - (var6 - 1 - this.field15) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method27(arg0, var9, var6, var10, var4.field4533[this.field9]);
                        if (this.field15 < var6) {
                            return;
                        }
                        this.field15 = (this.field15 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field14 > 0) {
                    if (this.field6) {
                        label130: {
                            if (this.field16 < 0) {
                                var9 = this.method46(arg0, arg1, var5, var10, var4.field4533[this.field9]);
                                if (this.field15 >= var5) {
                                    return;
                                }
                                this.field15 = var5 + var5 - 1 - this.field15;
                                this.field16 = -this.field16;
                                if (--this.field14 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method27(arg0, var9, var6, var10, var4.field4533[this.field8 - 1]);
                                if (this.field15 < var6) {
                                    return;
                                }
                                this.field15 = var6 + var6 - 1 - this.field15;
                                this.field16 = -this.field16;
                                if (--this.field14 == 0) {
                                    break;
                                }
                                var9 = this.method46(arg0, var9, var5, var10, var4.field4533[this.field9]);
                                if (this.field15 >= var5) {
                                    return;
                                }
                                this.field15 = var5 + var5 - 1 - this.field15;
                                this.field16 = -this.field16;
                            } while (--this.field14 != 0);
                        }
                    } else if (this.field16 < 0) {
                        while (true) {
                            var9 = this.method46(arg0, var9, var5, var10, var4.field4533[this.field8 - 1]);
                            if (this.field15 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field15) / var8;
                            if (var12 >= this.field14) {
                                this.field15 += this.field14 * var8;
                                this.field14 = 0;
                                break;
                            }
                            this.field15 += var8 * var12;
                            this.field14 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method27(arg0, var9, var6, var10, var4.field4533[this.field9]);
                            if (this.field15 < var6) {
                                return;
                            }
                            int var13 = (this.field15 - var5) / var8;
                            if (var13 >= this.field14) {
                                this.field15 -= this.field14 * var8;
                                this.field14 = 0;
                                break;
                            }
                            this.field15 -= var8 * var13;
                            this.field14 -= var13;
                        }
                    }
                }
                if (this.field16 < 0) {
                    this.method46(arg0, var9, 0, var10, 0);
                    if (this.field15 < 0) {
                        this.field15 = -1;
                        this.method44();
                        this.method629(0);
                        return;
                    }
                } else {
                    this.method27(arg0, var9, var7, var10, 0);
                    if (this.field15 >= var7) {
                        this.field15 = var7;
                        this.method44();
                        this.method629(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B[IIIIIIIILud;)I")
    private static final int method9(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class2 arg10) {
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
        arg10.field15 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([B[IIIIIIILud;)I")
    private static final int method10(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class2 arg8) {
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
        arg8.field15 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()I")
    public final int method1() {
        int var1 = this.field19 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field14 == 0) {
            var2 -= this.field15 * var2 / (((class266) super.field4).field4533.length << 8);
        } else if (this.field14 >= 0) {
            var2 -= this.field9 * var2 / ((class266) super.field4).field4533.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    private static final int method11(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([B[IIIIIIIILud;)I")
    private static final int method12(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class2 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7 += (var14 - arg3) * arg9.field10;
        arg9.field18 += (var14 - arg3) * arg9.field13;
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
        arg9.field19 = var12 >> 2;
        arg9.field15 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "()I")
    public final synchronized int method13() {
        return this.field11 == Integer.MIN_VALUE ? 0 : this.field11;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lkc;II)Lud;")
    public static final class2 method14(class266 arg0, int arg1, int arg2) {
        return arg0.field4533 != null && arg0.field4533.length != 0 ? new class2(arg0, (int) ((long) arg0.field4532 * 256L * (long) arg1 / (long) (class255.field4372 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    private final synchronized void method15(int arg0) {
        this.method35(arg0, this.method30());
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "()I")
    public final int method2() {
        return this.field11 == 0 && this.field17 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[B[IIIIIIIIIILud;II)I")
    private static final int method16(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class2 arg13, int arg14, int arg15) {
        arg13.field19 -= arg13.field5 * arg5;
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
        arg13.field19 += arg13.field5 * var22;
        arg13.field7 = arg6;
        arg13.field18 = arg7;
        arg13.field15 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([B[IIIIIIILud;)I")
    private static final int method17(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class2 arg8) {
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
        arg8.field15 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        if (this.field17 > 0) {
            if (arg0 >= this.field17) {
                if (this.field11 == Integer.MIN_VALUE) {
                    this.field11 = 0;
                    this.field19 = this.field7 = this.field18 = 0;
                    this.method629(0);
                    arg0 = this.field17;
                }
                this.field17 = 0;
                this.method31();
            } else {
                this.field19 += this.field5 * arg0;
                this.field7 += this.field10 * arg0;
                this.field18 += this.field13 * arg0;
                this.field17 -= arg0;
            }
        }
        class266 var2 = (class266) super.field4;
        int var3 = this.field9 << 8;
        int var4 = this.field8 << 8;
        int var5 = var2.field4533.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field14 = 0;
        }
        if (this.field15 < 0) {
            if (this.field16 <= 0) {
                this.method44();
                this.method629(0);
                return;
            }
            this.field15 = 0;
        }
        if (this.field15 >= var5) {
            if (this.field16 >= 0) {
                this.method44();
                this.method629(0);
                return;
            }
            this.field15 = var5 - 1;
        }
        this.field15 += this.field16 * arg0;
        if (this.field14 < 0) {
            if (!this.field6) {
                if (this.field16 < 0) {
                    if (this.field15 < var3) {
                        this.field15 = var4 - 1 - (var4 - 1 - this.field15) % var6;
                    }
                } else if (this.field15 >= var4) {
                    this.field15 = (this.field15 - var3) % var6 + var3;
                }
            } else {
                if (this.field16 < 0) {
                    if (this.field15 >= var3) {
                        return;
                    }
                    this.field15 = var3 + var3 - 1 - this.field15;
                    this.field16 = -this.field16;
                }
                while (this.field15 >= var4) {
                    this.field15 = var4 + var4 - 1 - this.field15;
                    this.field16 = -this.field16;
                    if (this.field15 >= var3) {
                        return;
                    }
                    this.field15 = var3 + var3 - 1 - this.field15;
                    this.field16 = -this.field16;
                }
            }
        } else {
            if (this.field14 > 0) {
                if (this.field6) {
                    label125: {
                        if (this.field16 < 0) {
                            if (this.field15 >= var3) {
                                return;
                            }
                            this.field15 = var3 + var3 - 1 - this.field15;
                            this.field16 = -this.field16;
                            if (--this.field14 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field15 < var4) {
                                return;
                            }
                            this.field15 = var4 + var4 - 1 - this.field15;
                            this.field16 = -this.field16;
                            if (--this.field14 == 0) {
                                break;
                            }
                            if (this.field15 >= var3) {
                                return;
                            }
                            this.field15 = var3 + var3 - 1 - this.field15;
                            this.field16 = -this.field16;
                        } while (--this.field14 != 0);
                    }
                } else if (this.field16 < 0) {
                    if (this.field15 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field15) / var6;
                    if (var7 < this.field14) {
                        this.field15 += var6 * var7;
                        this.field14 -= var7;
                        return;
                    }
                    this.field15 += this.field14 * var6;
                    this.field14 = 0;
                } else {
                    if (this.field15 < var4) {
                        return;
                    }
                    int var8 = (this.field15 - var3) / var6;
                    if (var8 < this.field14) {
                        this.field15 -= var6 * var8;
                        this.field14 -= var8;
                        return;
                    }
                    this.field15 -= this.field14 * var6;
                    this.field14 = 0;
                }
            }
            if (this.field16 < 0) {
                if (this.field15 < 0) {
                    this.field15 = -1;
                    this.method44();
                    this.method629(0);
                    return;
                }
            } else if (this.field15 >= var5) {
                this.field15 = var5;
                this.method44();
                this.method629(0);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)I")
    private static final int method18(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II[B[IIIIIIIILud;II)I")
    private static final int method19(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class2 arg11, int arg12, int arg13) {
        arg11.field7 -= arg11.field10 * arg5;
        arg11.field18 -= arg11.field13 * arg5;
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
        arg11.field7 += arg11.field10 * arg5;
        arg11.field18 += arg11.field13 * arg5;
        arg11.field19 = arg6;
        arg11.field15 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public final synchronized void method20(int arg0) {
        if (this.field16 < 0) {
            this.field16 = -arg0;
        } else {
            this.field16 = arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II[B[IIIIIIIIIILud;II)I")
    private static final int method21(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class2 arg13, int arg14, int arg15) {
        arg13.field19 -= arg13.field5 * arg5;
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
        arg13.field19 += arg13.field5 * var22;
        arg13.field7 = arg6;
        arg13.field18 = arg7;
        arg13.field15 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "()I")
    public final synchronized int method22() {
        return this.field16 < 0 ? -this.field16 : this.field16;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I[B[IIIIIIIILud;)I")
    private static final int method23(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class2 arg10) {
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
        arg10.field15 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "()Lwf;")
    public final class1 method5() {
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([B[IIIIIIIILud;)I")
    private static final int method24(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class2 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7 += (var14 - arg3) * arg9.field10;
        arg9.field18 += (var14 - arg3) * arg9.field13;
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
        arg9.field19 = var12 >> 2;
        arg9.field15 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
    public final synchronized void method25(int arg0, int arg1) {
        this.method47(arg0, arg1, this.method30());
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B[IIIIIIIIIILud;)I")
    private static final int method26(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class2 arg12) {
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
        arg12.field19 += (var19 - arg4) * arg12.field5;
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
        arg12.field7 = var15 >> 2;
        arg12.field18 = var16 >> 2;
        arg12.field15 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([IIIII)I")
    private final int method27(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field17 <= 0) {
                if (this.field16 == 256 && (this.field15 & 255) == 0) {
                    if (class268.field4571) {
                        return method23(0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, 0, arg3, arg2, this);
                    }
                    return method17(((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, 0, arg3, arg2, this);
                }
                if (class268.field4571) {
                    return method8(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, 0, arg3, arg2, this, this.field16, arg4);
                }
                return method38(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, 0, arg3, arg2, this, this.field16, arg4);
            }
            int var6 = this.field17 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field17 += arg1;
            if (this.field16 == 256 && (this.field15 & 255) == 0) {
                if (class268.field4571) {
                    arg1 = method26(0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, this.field10, this.field13, 0, var6, arg2, this);
                } else {
                    arg1 = method24(((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, this.field5, 0, var6, arg2, this);
                }
            } else if (class268.field4571) {
                arg1 = method16(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, this.field10, this.field13, 0, var6, arg2, this, this.field16, arg4);
            } else {
                arg1 = method42(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, this.field5, 0, var6, arg2, this, this.field16, arg4);
            }
            this.field17 -= arg1;
            if (this.field17 != 0) {
                return arg1;
            }
        } while (!this.method37());
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Z)V")
    public final synchronized void method28(boolean arg0) {
        this.field16 = (this.field16 >>> 31) + (this.field16 ^ this.field16 >> 31);
        if (arg0) {
            this.field16 = -this.field16;
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
    public final synchronized void method29(int arg0) {
        this.method35(arg0 << 6, this.method30());
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "()I")
    public final synchronized int method30() {
        return this.field12 < 0 ? -1 : this.field12;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "()Lwf;")
    public final class1 method3() {
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "()V")
    private final void method31() {
        this.field19 = this.field11;
        this.field7 = method11(this.field11, this.field12);
        this.field18 = method18(this.field11, this.field12);
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "()Z")
    public final boolean method32() {
        return this.field17 != 0;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "()Z")
    public final boolean method33() {
        return this.field15 < 0 || this.field15 >= ((class266) super.field4).field4533.length << 8;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I[B[IIIIIIIIIILud;)I")
    private static final int method34(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class2 arg12) {
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
        arg12.field19 += (var19 - arg4) * arg12.field5;
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
        arg12.field7 = var15 >> 2;
        arg12.field18 = var16 >> 2;
        arg12.field15 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)V")
    private final synchronized void method35(int arg0, int arg1) {
        this.field11 = arg0;
        this.field12 = arg1;
        this.field17 = 0;
        this.method31();
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II[B[IIIIIIIILud;II)I")
    private static final int method36(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class2 arg11, int arg12, int arg13) {
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
        arg11.field15 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "()Z")
    private final boolean method37() {
        int var1 = this.field11;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method11(var1, this.field12);
            var2 = method18(var1, this.field12);
        }
        if (this.field19 == var1 && this.field7 == var3 && this.field18 == var2) {
            if (this.field11 == Integer.MIN_VALUE) {
                this.field11 = 0;
                this.field19 = this.field7 = this.field18 = 0;
                this.method629(0);
                return true;
            } else {
                this.method31();
                return false;
            }
        } else {
            if (this.field19 < var1) {
                this.field5 = 1;
                this.field17 = var1 - this.field19;
            } else if (this.field19 > var1) {
                this.field5 = -1;
                this.field17 = this.field19 - var1;
            } else {
                this.field5 = 0;
            }
            if (this.field7 < var3) {
                this.field10 = 1;
                if (this.field17 == 0 || this.field17 > var3 - this.field7) {
                    this.field17 = var3 - this.field7;
                }
            } else if (this.field7 > var3) {
                this.field10 = -1;
                if (this.field17 == 0 || this.field17 > this.field7 - var3) {
                    this.field17 = this.field7 - var3;
                }
            } else {
                this.field10 = 0;
            }
            if (this.field18 < var2) {
                this.field13 = 1;
                if (this.field17 == 0 || this.field17 > var2 - this.field18) {
                    this.field17 = var2 - this.field18;
                }
            } else if (this.field18 > var2) {
                this.field13 = -1;
                if (this.field17 == 0 || this.field17 > this.field18 - var2) {
                    this.field17 = this.field18 - var2;
                }
            } else {
                this.field13 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[B[IIIIIIILud;II)I")
    private static final int method38(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class2 arg10, int arg11, int arg12) {
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
        arg10.field15 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    public final synchronized void method39(int arg0) {
        this.field14 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)V")
    public final synchronized void method40(int arg0) {
        int var2 = ((class266) super.field4).field4533.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field15 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)V")
    public final synchronized void method41(int arg0) {
        if (arg0 == 0) {
            this.method15(0);
            this.method629(0);
        } else if (this.field7 == 0 && this.field18 == 0) {
            this.field17 = 0;
            this.field11 = 0;
            this.field19 = 0;
            this.method629(0);
        } else {
            int var2 = -this.field19;
            if (this.field19 > var2) {
                var2 = this.field19;
            }
            if (-this.field7 > var2) {
                var2 = -this.field7;
            }
            if (this.field7 > var2) {
                var2 = this.field7;
            }
            if (-this.field18 > var2) {
                var2 = -this.field18;
            }
            if (this.field18 > var2) {
                var2 = this.field18;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field17 = arg0;
            this.field11 = Integer.MIN_VALUE;
            this.field5 = -this.field19 / arg0;
            this.field10 = -this.field7 / arg0;
            this.field13 = -this.field18 / arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II[B[IIIIIIIILud;II)I")
    private static final int method42(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class2 arg11, int arg12, int arg13) {
        arg11.field7 -= arg11.field10 * arg5;
        arg11.field18 -= arg11.field13 * arg5;
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
        arg11.field7 += arg11.field10 * arg5;
        arg11.field18 += arg11.field13 * arg5;
        arg11.field19 = arg6;
        arg11.field15 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lkc;III)Lud;")
    public static final class2 method43(class266 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4533 != null && arg0.field4533.length != 0 ? new class2(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "()V")
    private final void method44() {
        if (this.field17 != 0) {
            if (this.field11 == Integer.MIN_VALUE) {
                this.field11 = 0;
            }
            this.field17 = 0;
            this.method31();
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II[B[IIIIIIILud;II)I")
    private static final int method45(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class2 arg10, int arg11, int arg12) {
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
        arg10.field15 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "([IIIII)I")
    private final int method46(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field17 <= 0) {
                if (this.field16 == -256 && (this.field15 & 255) == 0) {
                    if (class268.field4571) {
                        return method9(0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, 0, arg3, arg2, this);
                    }
                    return method10(((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, 0, arg3, arg2, this);
                }
                if (class268.field4571) {
                    return method36(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, 0, arg3, arg2, this, this.field16, arg4);
                }
                return method45(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, 0, arg3, arg2, this, this.field16, arg4);
            }
            int var6 = this.field17 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field17 += arg1;
            if (this.field16 == -256 && (this.field15 & 255) == 0) {
                if (class268.field4571) {
                    arg1 = method34(0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, this.field10, this.field13, 0, var6, arg2, this);
                } else {
                    arg1 = method12(((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, this.field5, 0, var6, arg2, this);
                }
            } else if (class268.field4571) {
                arg1 = method21(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field7, this.field18, this.field10, this.field13, 0, var6, arg2, this, this.field16, arg4);
            } else {
                arg1 = method19(0, 0, ((class266) super.field4).field4533, arg0, this.field15, arg1, this.field19, this.field5, 0, var6, arg2, this, this.field16, arg4);
            }
            this.field17 -= arg1;
            if (this.field17 != 0) {
                return arg1;
            }
        } while (!this.method37());
        return arg3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lkc;II)V")
    private class2(class266 arg0, int arg1, int arg2) {
        super.field4 = arg0;
        this.field9 = arg0.field4530;
        this.field8 = arg0.field4531;
        this.field6 = arg0.field4534;
        this.field16 = arg1;
        this.field11 = arg2;
        this.field12 = 8192;
        this.field15 = 0;
        this.method31();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public final synchronized void method47(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method35(arg1, arg2);
        } else {
            int var4 = method11(arg1, arg2);
            int var5 = method18(arg1, arg2);
            if (this.field7 == var4 && this.field18 == var5) {
                this.field17 = 0;
            } else {
                int var6 = arg1 - this.field19;
                if (this.field19 - arg1 > var6) {
                    var6 = this.field19 - arg1;
                }
                if (var4 - this.field7 > var6) {
                    var6 = var4 - this.field7;
                }
                if (this.field7 - var4 > var6) {
                    var6 = this.field7 - var4;
                }
                if (var5 - this.field18 > var6) {
                    var6 = var5 - this.field18;
                }
                if (this.field18 - var5 > var6) {
                    var6 = this.field18 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field17 = arg0;
                this.field11 = arg1;
                this.field12 = arg2;
                this.field5 = (arg1 - this.field19) / arg0;
                this.field10 = (var4 - this.field7) / arg0;
                this.field13 = (var5 - this.field18) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lkc;III)V")
    private class2(class266 arg0, int arg1, int arg2, int arg3) {
        super.field4 = arg0;
        this.field9 = arg0.field4530;
        this.field8 = arg0.field4531;
        this.field6 = arg0.field4534;
        this.field16 = arg1;
        this.field11 = arg2;
        this.field12 = arg3;
        this.field15 = 0;
        this.method31();
    }
}
