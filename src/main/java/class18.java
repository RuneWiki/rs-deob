import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class251 {

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
    private boolean field315;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method141(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
        arg11.field303 -= arg11.field307 * arg5;
        arg11.field316 -= arg11.field313 * arg5;
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
        arg11.field303 += arg11.field307 * arg5;
        arg11.field316 += arg11.field313 * arg5;
        arg11.field305 = arg6;
        arg11.field314 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[B[IIIIIIILff;II)I")
    private static final int method142(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10, int arg11, int arg12) {
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
        arg10.field314 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([IIIII)I")
    private final int method143(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field306 <= 0) {
                if (this.field304 == 256 && (this.field314 & 255) == 0) {
                    if (class133.field2128) {
                        return method158(0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, 0, arg3, arg2, this);
                    }
                    return method163(((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, 0, arg3, arg2, this);
                }
                if (class133.field2128) {
                    return method152(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, 0, arg3, arg2, this, this.field304, arg4);
                }
                return method149(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, 0, arg3, arg2, this, this.field304, arg4);
            }
            int var6 = this.field306 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field306 += arg1;
            if (this.field304 == 256 && (this.field314 & 255) == 0) {
                if (class133.field2128) {
                    arg1 = method162(0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, this.field307, this.field313, 0, var6, arg2, this);
                } else {
                    arg1 = method182(((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, this.field302, 0, var6, arg2, this);
                }
            } else if (class133.field2128) {
                arg1 = method172(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, this.field307, this.field313, 0, var6, arg2, this, this.field304, arg4);
            } else {
                arg1 = method155(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, this.field302, 0, var6, arg2, this, this.field304, arg4);
            }
            this.field306 -= arg1;
            if (this.field306 != 0) {
                return arg1;
            }
        } while (!this.method177());
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B[IIIIIIIILff;)I")
    private static final int method144(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10) {
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
        arg10.field314 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[IIIIIIIILff;)I")
    private static final int method145(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class18 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field303 += (var14 - arg3) * arg9.field307;
        arg9.field316 += (var14 - arg3) * arg9.field313;
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
        arg9.field305 = var12 >> 2;
        arg9.field314 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "()V")
    private final void method146() {
        if (this.field306 != 0) {
            if (this.field312 == Integer.MIN_VALUE) {
                this.field312 = 0;
            }
            this.field306 = 0;
            this.method169();
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public final synchronized void method147(int arg0) {
        int var2 = ((class93) super.field3987).field1530.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field314 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "()I")
    public final synchronized int method148() {
        return this.field309 < 0 ? -1 : this.field309;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II[B[IIIIIIILff;II)I")
    private static final int method149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10, int arg11, int arg12) {
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
        arg10.field314 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V")
    public final synchronized void method150(int[] arg0, int arg1, int arg2) {
        if (this.field312 == 0 && this.field306 == 0) {
            this.method168(arg2);
        } else {
            class93 var4 = (class93) super.field3987;
            int var5 = this.field311 << 8;
            int var6 = this.field310 << 8;
            int var7 = var4.field1530.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field308 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field314 < 0) {
                if (this.field304 <= 0) {
                    this.method146();
                    this.method1388(56);
                    return;
                }
                this.field314 = 0;
            }
            if (this.field314 >= var7) {
                if (this.field304 >= 0) {
                    this.method146();
                    this.method1388(105);
                    return;
                }
                this.field314 = var7 - 1;
            }
            if (this.field308 < 0) {
                if (this.field315) {
                    if (this.field304 < 0) {
                        var9 = this.method181(arg0, arg1, var5, var10, var4.field1530[this.field311]);
                        if (this.field314 >= var5) {
                            return;
                        }
                        this.field314 = var5 + var5 - 1 - this.field314;
                        this.field304 = -this.field304;
                    }
                    while (true) {
                        int var11 = this.method143(arg0, var9, var6, var10, var4.field1530[this.field310 - 1]);
                        if (this.field314 < var6) {
                            return;
                        }
                        this.field314 = var6 + var6 - 1 - this.field314;
                        this.field304 = -this.field304;
                        var9 = this.method181(arg0, var11, var5, var10, var4.field1530[this.field311]);
                        if (this.field314 >= var5) {
                            return;
                        }
                        this.field314 = var5 + var5 - 1 - this.field314;
                        this.field304 = -this.field304;
                    }
                } else if (this.field304 < 0) {
                    while (true) {
                        var9 = this.method181(arg0, var9, var5, var10, var4.field1530[this.field310 - 1]);
                        if (this.field314 >= var5) {
                            return;
                        }
                        this.field314 = var6 - 1 - (var6 - 1 - this.field314) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method143(arg0, var9, var6, var10, var4.field1530[this.field311]);
                        if (this.field314 < var6) {
                            return;
                        }
                        this.field314 = (this.field314 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field308 > 0) {
                    if (this.field315) {
                        label130: {
                            if (this.field304 < 0) {
                                var9 = this.method181(arg0, arg1, var5, var10, var4.field1530[this.field311]);
                                if (this.field314 >= var5) {
                                    return;
                                }
                                this.field314 = var5 + var5 - 1 - this.field314;
                                this.field304 = -this.field304;
                                if (--this.field308 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method143(arg0, var9, var6, var10, var4.field1530[this.field310 - 1]);
                                if (this.field314 < var6) {
                                    return;
                                }
                                this.field314 = var6 + var6 - 1 - this.field314;
                                this.field304 = -this.field304;
                                if (--this.field308 == 0) {
                                    break;
                                }
                                var9 = this.method181(arg0, var9, var5, var10, var4.field1530[this.field311]);
                                if (this.field314 >= var5) {
                                    return;
                                }
                                this.field314 = var5 + var5 - 1 - this.field314;
                                this.field304 = -this.field304;
                            } while (--this.field308 != 0);
                        }
                    } else if (this.field304 < 0) {
                        while (true) {
                            var9 = this.method181(arg0, var9, var5, var10, var4.field1530[this.field310 - 1]);
                            if (this.field314 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field314) / var8;
                            if (var12 >= this.field308) {
                                this.field314 += this.field308 * var8;
                                this.field308 = 0;
                                break;
                            }
                            this.field314 += var8 * var12;
                            this.field308 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method143(arg0, var9, var6, var10, var4.field1530[this.field311]);
                            if (this.field314 < var6) {
                                return;
                            }
                            int var13 = (this.field314 - var5) / var8;
                            if (var13 >= this.field308) {
                                this.field314 -= this.field308 * var8;
                                this.field308 = 0;
                                break;
                            }
                            this.field314 -= var8 * var13;
                            this.field308 -= var13;
                        }
                    }
                }
                if (this.field304 < 0) {
                    this.method181(arg0, var9, 0, var10, 0);
                    if (this.field314 < 0) {
                        this.field314 = -1;
                        this.method146();
                        this.method1388(85);
                        return;
                    }
                } else {
                    this.method143(arg0, var9, var7, var10, 0);
                    if (this.field314 >= var7) {
                        this.field314 = var7;
                        this.method146();
                        this.method1388(68);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "()Z")
    public final boolean method151() {
        return this.field306 != 0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
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
        arg11.field314 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()Lfa;")
    public final class251 method153() {
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()Lfa;")
    public final class251 method154() {
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
        arg11.field303 -= arg11.field307 * arg5;
        arg11.field316 -= arg11.field313 * arg5;
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
        arg11.field303 += arg11.field307 * arg5;
        arg11.field316 += arg11.field313 * arg5;
        arg11.field305 = arg6;
        arg11.field314 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lcf;III)Lff;")
    public static final class18 method156(class93 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1530 != null && arg0.field1530.length != 0 ? new class18(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lcf;II)Lff;")
    public static final class18 method157(class93 arg0, int arg1, int arg2) {
        return arg0.field1530 != null && arg0.field1530.length != 0 ? new class18(arg0, (int) ((long) arg0.field1532 * 256L * (long) arg1 / (long) (class99.field1621 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I[B[IIIIIIIILff;)I")
    private static final int method158(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10) {
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
        arg10.field314 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "()Z")
    public final boolean method159() {
        return this.field314 < 0 || this.field314 >= ((class93) super.field3987).field1530.length << 8;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[B[IIIIIIIIIILff;II)I")
    private static final int method160(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class18 arg13, int arg14, int arg15) {
        arg13.field305 -= arg13.field302 * arg5;
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
        arg13.field305 += arg13.field302 * var22;
        arg13.field303 = arg6;
        arg13.field316 = arg7;
        arg13.field314 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public final synchronized void method161(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method184(arg1, arg2);
        } else {
            int var4 = method176(arg1, arg2);
            int var5 = method166(arg1, arg2);
            if (this.field303 == var4 && this.field316 == var5) {
                this.field306 = 0;
            } else {
                int var6 = arg1 - this.field305;
                if (this.field305 - arg1 > var6) {
                    var6 = this.field305 - arg1;
                }
                if (var4 - this.field303 > var6) {
                    var6 = var4 - this.field303;
                }
                if (this.field303 - var4 > var6) {
                    var6 = this.field303 - var4;
                }
                if (var5 - this.field316 > var6) {
                    var6 = var5 - this.field316;
                }
                if (this.field316 - var5 > var6) {
                    var6 = this.field316 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field306 = arg0;
                this.field312 = arg1;
                this.field309 = arg2;
                this.field302 = (arg1 - this.field305) / arg0;
                this.field307 = (var4 - this.field303) / arg0;
                this.field313 = (var5 - this.field316) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B[IIIIIIIIIILff;)I")
    private static final int method162(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class18 arg12) {
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
        arg12.field305 += (var19 - arg4) * arg12.field302;
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
        arg12.field303 = var15 >> 2;
        arg12.field316 = var16 >> 2;
        arg12.field314 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[IIIIIIILff;)I")
    private static final int method163(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class18 arg8) {
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
        arg8.field314 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "()I")
    public final synchronized int method164() {
        return this.field304 < 0 ? -this.field304 : this.field304;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
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
        arg11.field314 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
    private static final int method166(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
    private final synchronized void method167(int arg0) {
        this.method184(arg0, this.method148());
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public final synchronized void method168(int arg0) {
        if (this.field306 > 0) {
            if (arg0 >= this.field306) {
                if (this.field312 == Integer.MIN_VALUE) {
                    this.field312 = 0;
                    this.field305 = this.field303 = this.field316 = 0;
                    this.method1388(113);
                    arg0 = this.field306;
                }
                this.field306 = 0;
                this.method169();
            } else {
                this.field305 += this.field302 * arg0;
                this.field303 += this.field307 * arg0;
                this.field316 += this.field313 * arg0;
                this.field306 -= arg0;
            }
        }
        class93 var2 = (class93) super.field3987;
        int var3 = this.field311 << 8;
        int var4 = this.field310 << 8;
        int var5 = var2.field1530.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field308 = 0;
        }
        if (this.field314 < 0) {
            if (this.field304 <= 0) {
                this.method146();
                this.method1388(34);
                return;
            }
            this.field314 = 0;
        }
        if (this.field314 >= var5) {
            if (this.field304 >= 0) {
                this.method146();
                this.method1388(-111);
                return;
            }
            this.field314 = var5 - 1;
        }
        this.field314 += this.field304 * arg0;
        if (this.field308 < 0) {
            if (!this.field315) {
                if (this.field304 < 0) {
                    if (this.field314 < var3) {
                        this.field314 = var4 - 1 - (var4 - 1 - this.field314) % var6;
                    }
                } else if (this.field314 >= var4) {
                    this.field314 = (this.field314 - var3) % var6 + var3;
                }
            } else {
                if (this.field304 < 0) {
                    if (this.field314 >= var3) {
                        return;
                    }
                    this.field314 = var3 + var3 - 1 - this.field314;
                    this.field304 = -this.field304;
                }
                while (this.field314 >= var4) {
                    this.field314 = var4 + var4 - 1 - this.field314;
                    this.field304 = -this.field304;
                    if (this.field314 >= var3) {
                        return;
                    }
                    this.field314 = var3 + var3 - 1 - this.field314;
                    this.field304 = -this.field304;
                }
            }
        } else {
            if (this.field308 > 0) {
                if (this.field315) {
                    label125: {
                        if (this.field304 < 0) {
                            if (this.field314 >= var3) {
                                return;
                            }
                            this.field314 = var3 + var3 - 1 - this.field314;
                            this.field304 = -this.field304;
                            if (--this.field308 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field314 < var4) {
                                return;
                            }
                            this.field314 = var4 + var4 - 1 - this.field314;
                            this.field304 = -this.field304;
                            if (--this.field308 == 0) {
                                break;
                            }
                            if (this.field314 >= var3) {
                                return;
                            }
                            this.field314 = var3 + var3 - 1 - this.field314;
                            this.field304 = -this.field304;
                        } while (--this.field308 != 0);
                    }
                } else if (this.field304 < 0) {
                    if (this.field314 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field314) / var6;
                    if (var7 < this.field308) {
                        this.field314 += var6 * var7;
                        this.field308 -= var7;
                        return;
                    }
                    this.field314 += this.field308 * var6;
                    this.field308 = 0;
                } else {
                    if (this.field314 < var4) {
                        return;
                    }
                    int var8 = (this.field314 - var3) / var6;
                    if (var8 < this.field308) {
                        this.field314 -= var6 * var8;
                        this.field308 -= var8;
                        return;
                    }
                    this.field314 -= this.field308 * var6;
                    this.field308 = 0;
                }
            }
            if (this.field304 < 0) {
                if (this.field314 < 0) {
                    this.field314 = -1;
                    this.method146();
                    this.method1388(-117);
                    return;
                }
            } else if (this.field314 >= var5) {
                this.field314 = var5;
                this.method146();
                this.method1388(20);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "()V")
    private final void method169() {
        this.field305 = this.field312;
        this.field303 = method176(this.field312, this.field309);
        this.field316 = method166(this.field312, this.field309);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I[B[IIIIIIIIIILff;)I")
    private static final int method170(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class18 arg12) {
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
        arg12.field305 += (var19 - arg4) * arg12.field302;
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
        arg12.field303 = var15 >> 2;
        arg12.field316 = var16 >> 2;
        arg12.field314 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B[IIIIIIILff;)I")
    private static final int method171(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class18 arg8) {
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
        arg8.field314 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II[B[IIIIIIIIIILff;II)I")
    private static final int method172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class18 arg13, int arg14, int arg15) {
        arg13.field305 -= arg13.field302 * arg5;
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
        arg13.field305 += arg13.field302 * var22;
        arg13.field303 = arg6;
        arg13.field316 = arg7;
        arg13.field314 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
    public final synchronized void method173(int arg0, int arg1) {
        this.method161(arg0, arg1, this.method148());
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public final synchronized void method174(int arg0) {
        this.field308 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)V")
    public final synchronized void method175(int arg0) {
        this.method184(arg0 << 6, this.method148());
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)I")
    private static final int method176(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "()Z")
    private final boolean method177() {
        int var1 = this.field312;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method176(var1, this.field309);
            var2 = method166(var1, this.field309);
        }
        if (this.field305 == var1 && this.field303 == var3 && this.field316 == var2) {
            if (this.field312 == Integer.MIN_VALUE) {
                this.field312 = 0;
                this.field305 = this.field303 = this.field316 = 0;
                this.method1388(-107);
                return true;
            } else {
                this.method169();
                return false;
            }
        } else {
            if (this.field305 < var1) {
                this.field302 = 1;
                this.field306 = var1 - this.field305;
            } else if (this.field305 > var1) {
                this.field302 = -1;
                this.field306 = this.field305 - var1;
            } else {
                this.field302 = 0;
            }
            if (this.field303 < var3) {
                this.field307 = 1;
                if (this.field306 == 0 || this.field306 > var3 - this.field303) {
                    this.field306 = var3 - this.field303;
                }
            } else if (this.field303 > var3) {
                this.field307 = -1;
                if (this.field306 == 0 || this.field306 > this.field303 - var3) {
                    this.field306 = this.field303 - var3;
                }
            } else {
                this.field307 = 0;
            }
            if (this.field316 < var2) {
                this.field313 = 1;
                if (this.field306 == 0 || this.field306 > var2 - this.field316) {
                    this.field306 = var2 - this.field316;
                }
            } else if (this.field316 > var2) {
                this.field313 = -1;
                if (this.field306 == 0 || this.field306 > this.field316 - var2) {
                    this.field306 = this.field316 - var2;
                }
            } else {
                this.field313 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()I")
    public final int method178() {
        return this.field312 == 0 && this.field306 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
    public final synchronized void method179(boolean arg0) {
        this.field304 = (this.field304 >>> 31) + (this.field304 ^ this.field304 >> 31);
        if (arg0) {
            this.field304 = -this.field304;
        }
    }

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "()I")
    public final synchronized int method180() {
        return this.field312 == Integer.MIN_VALUE ? 0 : this.field312;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([IIIII)I")
    private final int method181(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field306 <= 0) {
                if (this.field304 == -256 && (this.field314 & 255) == 0) {
                    if (class133.field2128) {
                        return method144(0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, 0, arg3, arg2, this);
                    }
                    return method171(((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, 0, arg3, arg2, this);
                }
                if (class133.field2128) {
                    return method165(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, 0, arg3, arg2, this, this.field304, arg4);
                }
                return method142(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, 0, arg3, arg2, this, this.field304, arg4);
            }
            int var6 = this.field306 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field306 += arg1;
            if (this.field304 == -256 && (this.field314 & 255) == 0) {
                if (class133.field2128) {
                    arg1 = method170(0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, this.field307, this.field313, 0, var6, arg2, this);
                } else {
                    arg1 = method145(((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, this.field302, 0, var6, arg2, this);
                }
            } else if (class133.field2128) {
                arg1 = method160(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field303, this.field316, this.field307, this.field313, 0, var6, arg2, this, this.field304, arg4);
            } else {
                arg1 = method141(0, 0, ((class93) super.field3987).field1530, arg0, this.field314, arg1, this.field305, this.field302, 0, var6, arg2, this, this.field304, arg4);
            }
            this.field306 -= arg1;
            if (this.field306 != 0) {
                return arg1;
            }
        } while (!this.method177());
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B[IIIIIIIILff;)I")
    private static final int method182(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class18 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field303 += (var14 - arg3) * arg9.field307;
        arg9.field316 += (var14 - arg3) * arg9.field313;
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
        arg9.field305 = var12 >> 2;
        arg9.field314 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()I")
    public final int method183() {
        int var1 = this.field305 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field308 == 0) {
            var2 -= this.field314 * var2 / (((class93) super.field3987).field1530.length << 8);
        } else if (this.field308 >= 0) {
            var2 -= this.field311 * var2 / ((class93) super.field3987).field1530.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(II)V")
    private final synchronized void method184(int arg0, int arg1) {
        this.field312 = arg0;
        this.field309 = arg1;
        this.field306 = 0;
        this.method169();
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)V")
    public final synchronized void method185(int arg0) {
        if (arg0 == 0) {
            this.method167(0);
            this.method1388(-103);
        } else if (this.field303 == 0 && this.field316 == 0) {
            this.field306 = 0;
            this.field312 = 0;
            this.field305 = 0;
            this.method1388(-122);
        } else {
            int var2 = -this.field305;
            if (this.field305 > var2) {
                var2 = this.field305;
            }
            if (-this.field303 > var2) {
                var2 = -this.field303;
            }
            if (this.field303 > var2) {
                var2 = this.field303;
            }
            if (-this.field316 > var2) {
                var2 = -this.field316;
            }
            if (this.field316 > var2) {
                var2 = this.field316;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field306 = arg0;
            this.field312 = Integer.MIN_VALUE;
            this.field302 = -this.field305 / arg0;
            this.field307 = -this.field303 / arg0;
            this.field313 = -this.field316 / arg0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lcf;II)V")
    private class18(class93 arg0, int arg1, int arg2) {
        super.field3987 = arg0;
        this.field311 = arg0.field1533;
        this.field310 = arg0.field1531;
        this.field315 = arg0.field1534;
        this.field304 = arg1;
        this.field312 = arg2;
        this.field309 = 8192;
        this.field314 = 0;
        this.method169();
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)V")
    public final synchronized void method186(int arg0) {
        if (this.field304 < 0) {
            this.field304 = -arg0;
        } else {
            this.field304 = arg0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lcf;III)V")
    private class18(class93 arg0, int arg1, int arg2, int arg3) {
        super.field3987 = arg0;
        this.field311 = arg0.field1533;
        this.field310 = arg0.field1531;
        this.field315 = arg0.field1534;
        this.field304 = arg1;
        this.field312 = arg2;
        this.field309 = arg3;
        this.field314 = 0;
        this.method169();
    }
}
