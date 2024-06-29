import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class315 extends class198 {

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    private int field4776;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "Z")
    private boolean field4783;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    private int field4786;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    private int field4774;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    private int field4779;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    private int field4782;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    private int field4784;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    private int field4785;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Llj;II)Ljl;", line = 3)
    public static final class315 method2139(class5 arg0, int arg1, int arg2) {
        return arg0.field113 == null || arg0.field113.length == 0 ? null : new class315(arg0, (int) ((long) arg0.field112 * 256L * (long) arg1 / (long) (class303.field4596 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 9)
    public final synchronized void method2140(int arg0) {
        if (arg0 == 0) {
            this.method2173(0);
            this.method278((byte) -105);
        } else if (this.field4785 == 0 && this.field4777 == 0) {
            this.field4774 = 0;
            this.field4778 = 0;
            this.field4784 = 0;
            this.method278((byte) -105);
        } else {
            int var2 = -this.field4784;
            if (this.field4784 > var2) {
                var2 = this.field4784;
            }
            if (-this.field4785 > var2) {
                var2 = -this.field4785;
            }
            if (this.field4785 > var2) {
                var2 = this.field4785;
            }
            if (-this.field4777 > var2) {
                var2 = -this.field4777;
            }
            if (this.field4777 > var2) {
                var2 = this.field4777;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4774 = arg0;
            this.field4778 = Integer.MIN_VALUE;
            this.field4779 = -this.field4784 / arg0;
            this.field4782 = -this.field4785 / arg0;
            this.field4775 = -this.field4777 / arg0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([IIIII)I", line = 55)
    private final int method2141(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4774 > 0) {
                int var6 = this.field4774 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4774 += arg1;
                if (this.field4781 == -256 && (this.field4786 & 0xFF) == 0) {
                    if (class119.field2071) {
                        arg1 = method2142(0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, this.field4782, this.field4775, 0, var6, arg2, this);
                    } else {
                        arg1 = method2159(((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, this.field4779, 0, var6, arg2, this);
                    }
                } else if (class119.field2071) {
                    arg1 = method2175(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, this.field4782, this.field4775, 0, var6, arg2, this, this.field4781, arg4);
                } else {
                    arg1 = method2170(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, this.field4779, 0, var6, arg2, this, this.field4781, arg4);
                }
                this.field4774 -= arg1;
                if (this.field4774 != 0) {
                    return arg1;
                }
                if (!this.method2145()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4781 == -256 && (this.field4786 & 0xFF) == 0) {
                if (class119.field2071) {
                    return method2154(0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, 0, arg3, arg2, this);
                }
                return method2169(((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, 0, arg3, arg2, this);
            }
            if (class119.field2071) {
                return method2149(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, 0, arg3, arg2, this, this.field4781, arg4);
            }
            return method2166(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, 0, arg3, arg2, this, this.field4781, arg4);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[B[IIIIIIIIIILjl;)I", line = 111)
    private static final int method2142(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class315 arg12) {
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
        arg12.field4784 += (var19 - arg4) * arg12.field4779;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field4785 = var15 >> 2;
        arg12.field4777 = var16 >> 2;
        arg12.field4786 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([B[IIIIIIIILjl;)I", line = 164)
    private static final int method2143(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class315 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4785 += (var14 - arg3) * arg9.field4782;
        arg9.field4777 += (var14 - arg3) * arg9.field4775;
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
        arg9.field4784 = var12 >> 2;
        arg9.field4786 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 200)
    private final synchronized void method2144(int arg0, int arg1) {
        this.field4778 = arg0;
        this.field4773 = arg1;
        this.field4774 = 0;
        this.method2163();
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "()Z", line = 208)
    private final boolean method2145() {
        int var1 = this.field4778;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2171(var1, this.field4773);
            var2 = method2177(var1, this.field4773);
        }
        if (this.field4784 != var1 || this.field4785 != var3 || this.field4777 != var2) {
            if (this.field4784 < var1) {
                this.field4779 = 1;
                this.field4774 = var1 - this.field4784;
            } else if (this.field4784 > var1) {
                this.field4779 = -1;
                this.field4774 = this.field4784 - var1;
            } else {
                this.field4779 = 0;
            }
            if (this.field4785 < var3) {
                this.field4782 = 1;
                if (this.field4774 == 0 || this.field4774 > var3 - this.field4785) {
                    this.field4774 = var3 - this.field4785;
                }
            } else if (this.field4785 > var3) {
                this.field4782 = -1;
                if (this.field4774 == 0 || this.field4774 > this.field4785 - var3) {
                    this.field4774 = this.field4785 - var3;
                }
            } else {
                this.field4782 = 0;
            }
            if (this.field4777 < var2) {
                this.field4775 = 1;
                if (this.field4774 == 0 || this.field4774 > var2 - this.field4777) {
                    this.field4774 = var2 - this.field4777;
                }
            } else if (this.field4777 > var2) {
                this.field4775 = -1;
                if (this.field4774 == 0 || this.field4774 > this.field4777 - var2) {
                    this.field4774 = this.field4777 - var2;
                }
            } else {
                this.field4775 = 0;
            }
            return false;
        } else if (this.field4778 == Integer.MIN_VALUE) {
            this.field4778 = 0;
            this.field4784 = this.field4785 = this.field4777 = 0;
            this.method278((byte) -105);
            return true;
        } else {
            this.method2163();
            return false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "()I", line = 295)
    public final int method1233() {
        return this.field4778 == 0 && this.field4774 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "()V", line = 303)
    private final void method2146() {
        if (this.field4774 == 0) {
            return;
        }
        if (this.field4778 == Integer.MIN_VALUE) {
            this.field4778 = 0;
        }
        this.field4774 = 0;
        this.method2163();
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "()I", line = 314)
    public final synchronized int method2147() {
        return this.field4778 == Integer.MIN_VALUE ? 0 : this.field4778;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[B[IIIIIIILjl;II)I", line = 317)
    private static final int method2148(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class315 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field4786 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[B[IIIIIIIILjl;II)I", line = 343)
    private static final int method2149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class315 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field4786 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([III)V", line = 378)
    public final synchronized void method1227(int[] arg0, int arg1, int arg2) {
        if (this.field4778 == 0 && this.field4774 == 0) {
            this.method1228(arg2);
            return;
        }
        class5 var4 = (class5) this.field3177;
        int var5 = this.field4780 << 8;
        int var6 = this.field4776 << 8;
        int var7 = var4.field113.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4772 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4786 < 0) {
            if (this.field4781 <= 0) {
                this.method2146();
                this.method278((byte) -105);
                return;
            }
            this.field4786 = 0;
        }
        if (this.field4786 >= var7) {
            if (this.field4781 >= 0) {
                this.method2146();
                this.method278((byte) -105);
                return;
            }
            this.field4786 = var7 - 1;
        }
        if (this.field4772 >= 0) {
            if (this.field4772 > 0) {
                if (this.field4783) {
                    label131: {
                        if (this.field4781 < 0) {
                            var9 = this.method2141(arg0, arg1, var5, var10, var4.field113[this.field4780]);
                            if (this.field4786 >= var5) {
                                return;
                            }
                            this.field4786 = var5 + var5 - this.field4786 - 1;
                            this.field4781 = -this.field4781;
                            if (--this.field4772 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2153(arg0, var9, var6, var10, var4.field113[this.field4776 - 1]);
                            if (this.field4786 < var6) {
                                return;
                            }
                            this.field4786 = var6 + var6 - this.field4786 - 1;
                            this.field4781 = -this.field4781;
                            if (--this.field4772 == 0) {
                                break;
                            }
                            var9 = this.method2141(arg0, var9, var5, var10, var4.field113[this.field4780]);
                            if (this.field4786 >= var5) {
                                return;
                            }
                            this.field4786 = var5 + var5 - this.field4786 - 1;
                            this.field4781 = -this.field4781;
                        } while (--this.field4772 != 0);
                    }
                } else if (this.field4781 < 0) {
                    while (true) {
                        var9 = this.method2141(arg0, var9, var5, var10, var4.field113[this.field4776 - 1]);
                        if (this.field4786 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4786 - 1) / var8;
                        if (var12 >= this.field4772) {
                            this.field4786 += this.field4772 * var8;
                            this.field4772 = 0;
                            break;
                        }
                        this.field4786 += var8 * var12;
                        this.field4772 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2153(arg0, var9, var6, var10, var4.field113[this.field4780]);
                        if (this.field4786 < var6) {
                            return;
                        }
                        int var13 = (this.field4786 - var5) / var8;
                        if (var13 >= this.field4772) {
                            this.field4786 -= this.field4772 * var8;
                            this.field4772 = 0;
                            break;
                        }
                        this.field4786 -= var8 * var13;
                        this.field4772 -= var13;
                    }
                }
            }
            if (this.field4781 < 0) {
                this.method2141(arg0, var9, 0, var10, 0);
                if (this.field4786 < 0) {
                    this.field4786 = -1;
                    this.method2146();
                    this.method278((byte) -105);
                }
            } else {
                this.method2153(arg0, var9, var7, var10, 0);
                if (this.field4786 >= var7) {
                    this.field4786 = var7;
                    this.method2146();
                    this.method278((byte) -105);
                }
            }
        } else if (this.field4783) {
            if (this.field4781 < 0) {
                var9 = this.method2141(arg0, arg1, var5, var10, var4.field113[this.field4780]);
                if (this.field4786 >= var5) {
                    return;
                }
                this.field4786 = var5 + var5 - this.field4786 - 1;
                this.field4781 = -this.field4781;
            }
            while (true) {
                int var11 = this.method2153(arg0, var9, var6, var10, var4.field113[this.field4776 - 1]);
                if (this.field4786 < var6) {
                    return;
                }
                this.field4786 = var6 + var6 - this.field4786 - 1;
                this.field4781 = -this.field4781;
                var9 = this.method2141(arg0, var11, var5, var10, var4.field113[this.field4780]);
                if (this.field4786 >= var5) {
                    return;
                }
                this.field4786 = var5 + var5 - this.field4786 - 1;
                this.field4781 = -this.field4781;
            }
        } else if (this.field4781 < 0) {
            while (true) {
                var9 = this.method2141(arg0, var9, var5, var10, var4.field113[this.field4776 - 1]);
                if (this.field4786 >= var5) {
                    return;
                }
                this.field4786 = var6 - (var6 - 1 - this.field4786) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2153(arg0, var9, var6, var10, var4.field113[this.field4780]);
                if (this.field4786 < var6) {
                    return;
                }
                this.field4786 = (this.field4786 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "()Z", line = 615)
    public final boolean method2150() {
        return this.field4774 != 0;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()Laj;", line = 619)
    public final class198 method1234() {
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[B[IIIIIIIIIILjl;II)I", line = 622)
    private static final int method2151(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class315 arg13, int arg14, int arg15) {
        arg13.field4784 -= arg13.field4779 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field4784 += arg13.field4779 * var27;
        arg13.field4785 = arg6;
        arg13.field4777 = arg7;
        arg13.field4786 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Llj;III)Ljl;", line = 664)
    public static final class315 method2152(class5 arg0, int arg1, int arg2, int arg3) {
        return arg0.field113 == null || arg0.field113.length == 0 ? null : new class315(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "([IIIII)I", line = 671)
    private final int method2153(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4774 > 0) {
                int var6 = this.field4774 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4774 += arg1;
                if (this.field4781 == 256 && (this.field4786 & 0xFF) == 0) {
                    if (class119.field2071) {
                        arg1 = method2167(0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, this.field4782, this.field4775, 0, var6, arg2, this);
                    } else {
                        arg1 = method2143(((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, this.field4779, 0, var6, arg2, this);
                    }
                } else if (class119.field2071) {
                    arg1 = method2151(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, this.field4782, this.field4775, 0, var6, arg2, this, this.field4781, arg4);
                } else {
                    arg1 = method2168(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, this.field4779, 0, var6, arg2, this, this.field4781, arg4);
                }
                this.field4774 -= arg1;
                if (this.field4774 != 0) {
                    return arg1;
                }
                if (!this.method2145()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4781 == 256 && (this.field4786 & 0xFF) == 0) {
                if (class119.field2071) {
                    return method2160(0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, 0, arg3, arg2, this);
                }
                return method2157(((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, 0, arg3, arg2, this);
            }
            if (class119.field2071) {
                return method2156(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4785, this.field4777, 0, arg3, arg2, this, this.field4781, arg4);
            }
            return method2148(0, 0, ((class5) this.field3177).field113, arg0, this.field4786, arg1, this.field4784, 0, arg3, arg2, this, this.field4781, arg4);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 726)
    public final synchronized void method1228(int arg0) {
        if (this.field4774 > 0) {
            if (arg0 >= this.field4774) {
                if (this.field4778 == Integer.MIN_VALUE) {
                    this.field4778 = 0;
                    this.field4784 = this.field4785 = this.field4777 = 0;
                    this.method278((byte) -105);
                    arg0 = this.field4774;
                }
                this.field4774 = 0;
                this.method2163();
            } else {
                this.field4784 += this.field4779 * arg0;
                this.field4785 += this.field4782 * arg0;
                this.field4777 += this.field4775 * arg0;
                this.field4774 -= arg0;
            }
        }
        class5 var2 = (class5) this.field3177;
        int var3 = this.field4780 << 8;
        int var4 = this.field4776 << 8;
        int var5 = var2.field113.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4772 = 0;
        }
        if (this.field4786 < 0) {
            if (this.field4781 <= 0) {
                this.method2146();
                this.method278((byte) -105);
                return;
            }
            this.field4786 = 0;
        }
        if (this.field4786 >= var5) {
            if (this.field4781 >= 0) {
                this.method2146();
                this.method278((byte) -105);
                return;
            }
            this.field4786 = var5 - 1;
        }
        this.field4786 += this.field4781 * arg0;
        if (this.field4772 >= 0) {
            if (this.field4772 > 0) {
                if (this.field4783) {
                    label121: {
                        if (this.field4781 < 0) {
                            if (this.field4786 >= var3) {
                                return;
                            }
                            this.field4786 = var3 + var3 - this.field4786 - 1;
                            this.field4781 = -this.field4781;
                            if (--this.field4772 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4786 < var4) {
                                return;
                            }
                            this.field4786 = var4 + var4 - this.field4786 - 1;
                            this.field4781 = -this.field4781;
                            if (--this.field4772 == 0) {
                                break;
                            }
                            if (this.field4786 >= var3) {
                                return;
                            }
                            this.field4786 = var3 + var3 - this.field4786 - 1;
                            this.field4781 = -this.field4781;
                        } while (--this.field4772 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4781 < 0) {
                            if (this.field4786 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4786 - 1) / var6;
                            if (var7 >= this.field4772) {
                                this.field4786 += this.field4772 * var6;
                                this.field4772 = 0;
                                break label153;
                            }
                            this.field4786 += var6 * var7;
                            this.field4772 -= var7;
                        } else if (this.field4786 >= var4) {
                            int var8 = (this.field4786 - var3) / var6;
                            if (var8 >= this.field4772) {
                                this.field4786 -= this.field4772 * var6;
                                this.field4772 = 0;
                                break label153;
                            }
                            this.field4786 -= var6 * var8;
                            this.field4772 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4781 < 0) {
                if (this.field4786 < 0) {
                    this.field4786 = -1;
                    this.method2146();
                    this.method278((byte) -105);
                }
            } else if (this.field4786 >= var5) {
                this.field4786 = var5;
                this.method2146();
                this.method278((byte) -105);
            }
        } else if (this.field4783) {
            if (this.field4781 < 0) {
                if (this.field4786 >= var3) {
                    return;
                }
                this.field4786 = var3 + var3 - this.field4786 - 1;
                this.field4781 = -this.field4781;
            }
            while (this.field4786 >= var4) {
                this.field4786 = var4 + var4 - this.field4786 - 1;
                this.field4781 = -this.field4781;
                if (this.field4786 >= var3) {
                    return;
                }
                this.field4786 = var3 + var3 - this.field4786 - 1;
                this.field4781 = -this.field4781;
            }
        } else if (this.field4781 < 0) {
            if (this.field4786 >= var3) {
                return;
            }
            this.field4786 = var4 - (var4 - 1 - this.field4786) % var6 - 1;
        } else if (this.field4786 >= var4) {
            this.field4786 = (this.field4786 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[B[IIIIIIIILjl;)I", line = 944)
    private static final int method2154(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class315 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field4786 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 983)
    public final synchronized void method2155(int arg0) {
        int var2 = ((class5) this.field3177).field113.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4786 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II[B[IIIIIIIILjl;II)I", line = 994)
    private static final int method2156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class315 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field4786 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([B[IIIIIIILjl;)I", line = 1027)
    private static final int method2157(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class315 arg8) {
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
        arg8.field4786 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V", line = 1053)
    public final synchronized void method2158(boolean arg0) {
        this.field4781 = (this.field4781 >>> 31) + (this.field4781 ^ this.field4781 >> 31);
        if (arg0) {
            this.field4781 = -this.field4781;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "([B[IIIIIIIILjl;)I", line = 1059)
    private static final int method2159(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class315 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4785 += (var14 - arg3) * arg9.field4782;
        arg9.field4777 += (var14 - arg3) * arg9.field4775;
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
        arg9.field4784 = var12 >> 2;
        arg9.field4786 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I[B[IIIIIIIILjl;)I", line = 1095)
    private static final int method2160(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class315 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field4786 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "()I", line = 1134)
    public final int method1266() {
        int var1 = this.field4784 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4772 == 0) {
            var2 -= this.field4786 * var2 / (((class5) this.field3177).field113.length << 8);
        } else if (this.field4772 >= 0) {
            var2 -= this.field4780 * var2 / ((class5) this.field3177).field113.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V", line = 1147)
    public final synchronized void method2161(int arg0) {
        this.method2144(arg0 << 6, this.method2174());
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V", line = 1151)
    public final synchronized void method2162(int arg0) {
        this.field4772 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "()V", line = 1154)
    private final void method2163() {
        this.field4784 = this.field4778;
        this.field4785 = method2171(this.field4778, this.field4773);
        this.field4777 = method2177(this.field4778, this.field4773);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V", line = 1159)
    public final synchronized void method2164(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2144(arg1, arg2);
            return;
        }
        int var4 = method2171(arg1, arg2);
        int var5 = method2177(arg1, arg2);
        if (this.field4785 == var4 && this.field4777 == var5) {
            this.field4774 = 0;
            return;
        }
        int var6 = arg1 - this.field4784;
        if (this.field4784 - arg1 > var6) {
            var6 = this.field4784 - arg1;
        }
        if (var4 - this.field4785 > var6) {
            var6 = var4 - this.field4785;
        }
        if (this.field4785 - var4 > var6) {
            var6 = this.field4785 - var4;
        }
        if (var5 - this.field4777 > var6) {
            var6 = var5 - this.field4777;
        }
        if (this.field4777 - var5 > var6) {
            var6 = this.field4777 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4774 = arg0;
        this.field4778 = arg1;
        this.field4773 = arg2;
        this.field4779 = (arg1 - this.field4784) / arg0;
        this.field4782 = (var4 - this.field4785) / arg0;
        this.field4775 = (var5 - this.field4777) / arg0;
    }

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "()Z", line = 1206)
    public final boolean method2165() {
        return this.field4786 < 0 || this.field4786 >= ((class5) this.field3177).field113.length << 8;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II[B[IIIIIIILjl;II)I", line = 1209)
    private static final int method2166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class315 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field4786 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I[B[IIIIIIIIIILjl;)I", line = 1238)
    private static final int method2167(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class315 arg12) {
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
        arg12.field4784 += (var19 - arg4) * arg12.field4779;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field4785 = var15 >> 2;
        arg12.field4777 = var16 >> 2;
        arg12.field4786 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(II[B[IIIIIIIILjl;II)I", line = 1291)
    private static final int method2168(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class315 arg11, int arg12, int arg13) {
        arg11.field4785 -= arg11.field4782 * arg5;
        arg11.field4777 -= arg11.field4775 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field4785 += arg11.field4782 * arg5;
        arg11.field4777 += arg11.field4775 * arg5;
        arg11.field4784 = arg6;
        arg11.field4786 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "([B[IIIIIIILjl;)I", line = 1324)
    private static final int method2169(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class315 arg8) {
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
        arg8.field4786 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(II[B[IIIIIIIILjl;II)I", line = 1349)
    private static final int method2170(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class315 arg11, int arg12, int arg13) {
        arg11.field4785 -= arg11.field4782 * arg5;
        arg11.field4777 -= arg11.field4775 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field4785 += arg11.field4782 * arg5;
        arg11.field4777 += arg11.field4775 * arg5;
        arg11.field4784 = arg6;
        arg11.field4786 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)I", line = 1383)
    private static final int method2171(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "()I", line = 1386)
    public final synchronized int method2172() {
        return this.field4781 < 0 ? -this.field4781 : this.field4781;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V", line = 1389)
    private final synchronized void method2173(int arg0) {
        this.method2144(arg0, this.method2174());
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()Laj;", line = 1392)
    public final class198 method1235() {
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "()I", line = 1397)
    public final synchronized int method2174() {
        return this.field4773 < 0 ? -1 : this.field4773;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II[B[IIIIIIIIIILjl;II)I", line = 1400)
    private static final int method2175(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class315 arg13, int arg14, int arg15) {
        arg13.field4784 -= arg13.field4779 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field4784 += arg13.field4779 * var26;
        arg13.field4785 = arg6;
        arg13.field4777 = arg7;
        arg13.field4786 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(II)V", line = 1443)
    public final synchronized void method2176(int arg0, int arg1) {
        this.method2164(arg0, arg1, this.method2174());
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(II)I", line = 1447)
    private static final int method2177(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Llj;II)V", line = 1451)
    private class315(class5 arg0, int arg1, int arg2) {
        this.field3177 = arg0;
        this.field4780 = arg0.field116;
        this.field4776 = arg0.field114;
        this.field4783 = arg0.field115;
        this.field4781 = arg1;
        this.field4778 = arg2;
        this.field4773 = 8192;
        this.field4786 = 0;
        this.method2163();
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)V", line = 1463)
    public final synchronized void method2178(int arg0) {
        if (this.field4781 < 0) {
            this.field4781 = -arg0;
        } else {
            this.field4781 = arg0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Llj;III)V", line = 1469)
    private class315(class5 arg0, int arg1, int arg2, int arg3) {
        this.field3177 = arg0;
        this.field4780 = arg0.field116;
        this.field4776 = arg0.field114;
        this.field4783 = arg0.field115;
        this.field4781 = arg1;
        this.field4778 = arg2;
        this.field4773 = arg3;
        this.field4786 = 0;
        this.method2163();
    }
}
