import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class295 extends class204 {

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    private int field4918;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Z")
    private boolean field4922;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    private int field4915;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    private int field4916;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    private int field4913;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    private int field4914;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    private int field4910;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    private int field4911;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    private int field4912;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    private int field4917;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    private int field4919;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    private int field4921;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    private int field4923;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    private int field4924;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()I", line = 3)
    public final synchronized int method1959() {
        return this.field4913 < 0 ? -1 : this.field4913;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[B[IIIIIIIILqf;II)I", line = 6)
    private static final int method1960(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class295 arg11, int arg12, int arg13) {
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
        arg11.field4914 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([B[IIIIIIIILqf;)I", line = 40)
    private static final int method1961(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class295 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4923 += (var14 - arg3) * arg9.field4911;
        arg9.field4910 += (var14 - arg3) * arg9.field4924;
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
        arg9.field4912 = var12 >> 2;
        arg9.field4914 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "()I", line = 74)
    public final synchronized int method1962() {
        return this.field4916 == Integer.MIN_VALUE ? 0 : this.field4916;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Loj;III)Lqf;", line = 77)
    public static final class295 method1963(class156 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2813 == null || arg0.field2813.length == 0 ? null : new class295(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 83)
    public final synchronized void method1964(int arg0) {
        this.method1971(arg0 << 6, this.method1959());
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "()Z", line = 86)
    public final boolean method1965() {
        return this.field4914 < 0 || this.field4914 >= ((class156) this.field3487).field2813.length << 8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([B[IIIIIIILqf;)I", line = 91)
    private static final int method1966(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class295 arg8) {
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
        arg8.field4914 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([III)V", line = 116)
    public final synchronized void method564(int[] arg0, int arg1, int arg2) {
        if (this.field4916 == 0 && this.field4919 == 0) {
            this.method568(arg2);
            return;
        }
        class156 var4 = (class156) this.field3487;
        int var5 = this.field4918 << 8;
        int var6 = this.field4920 << 8;
        int var7 = var4.field2813.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4921 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4914 < 0) {
            if (this.field4915 <= 0) {
                this.method1976();
                this.method499((byte) 64);
                return;
            }
            this.field4914 = 0;
        }
        if (this.field4914 >= var7) {
            if (this.field4915 >= 0) {
                this.method1976();
                this.method499((byte) 64);
                return;
            }
            this.field4914 = var7 - 1;
        }
        if (this.field4921 >= 0) {
            if (this.field4921 > 0) {
                if (this.field4922) {
                    label131: {
                        if (this.field4915 < 0) {
                            var9 = this.method1983(arg0, arg1, var5, var10, var4.field2813[this.field4918]);
                            if (this.field4914 >= var5) {
                                return;
                            }
                            this.field4914 = var5 + var5 - this.field4914 - 1;
                            this.field4915 = -this.field4915;
                            if (--this.field4921 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1997(arg0, var9, var6, var10, var4.field2813[this.field4920 - 1]);
                            if (this.field4914 < var6) {
                                return;
                            }
                            this.field4914 = var6 + var6 - this.field4914 - 1;
                            this.field4915 = -this.field4915;
                            if (--this.field4921 == 0) {
                                break;
                            }
                            var9 = this.method1983(arg0, var9, var5, var10, var4.field2813[this.field4918]);
                            if (this.field4914 >= var5) {
                                return;
                            }
                            this.field4914 = var5 + var5 - this.field4914 - 1;
                            this.field4915 = -this.field4915;
                        } while (--this.field4921 != 0);
                    }
                } else if (this.field4915 < 0) {
                    while (true) {
                        var9 = this.method1983(arg0, var9, var5, var10, var4.field2813[this.field4920 - 1]);
                        if (this.field4914 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4914 - 1) / var8;
                        if (var12 >= this.field4921) {
                            this.field4914 += this.field4921 * var8;
                            this.field4921 = 0;
                            break;
                        }
                        this.field4914 += var8 * var12;
                        this.field4921 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1997(arg0, var9, var6, var10, var4.field2813[this.field4918]);
                        if (this.field4914 < var6) {
                            return;
                        }
                        int var13 = (this.field4914 - var5) / var8;
                        if (var13 >= this.field4921) {
                            this.field4914 -= this.field4921 * var8;
                            this.field4921 = 0;
                            break;
                        }
                        this.field4914 -= var8 * var13;
                        this.field4921 -= var13;
                    }
                }
            }
            if (this.field4915 < 0) {
                this.method1983(arg0, var9, 0, var10, 0);
                if (this.field4914 < 0) {
                    this.field4914 = -1;
                    this.method1976();
                    this.method499((byte) 64);
                }
            } else {
                this.method1997(arg0, var9, var7, var10, 0);
                if (this.field4914 >= var7) {
                    this.field4914 = var7;
                    this.method1976();
                    this.method499((byte) 64);
                }
            }
        } else if (this.field4922) {
            if (this.field4915 < 0) {
                var9 = this.method1983(arg0, arg1, var5, var10, var4.field2813[this.field4918]);
                if (this.field4914 >= var5) {
                    return;
                }
                this.field4914 = var5 + var5 - this.field4914 - 1;
                this.field4915 = -this.field4915;
            }
            while (true) {
                int var11 = this.method1997(arg0, var9, var6, var10, var4.field2813[this.field4920 - 1]);
                if (this.field4914 < var6) {
                    return;
                }
                this.field4914 = var6 + var6 - this.field4914 - 1;
                this.field4915 = -this.field4915;
                var9 = this.method1983(arg0, var11, var5, var10, var4.field2813[this.field4918]);
                if (this.field4914 >= var5) {
                    return;
                }
                this.field4914 = var5 + var5 - this.field4914 - 1;
                this.field4915 = -this.field4915;
            }
        } else if (this.field4915 < 0) {
            while (true) {
                var9 = this.method1983(arg0, var9, var5, var10, var4.field2813[this.field4920 - 1]);
                if (this.field4914 >= var5) {
                    return;
                }
                this.field4914 = var6 - (var6 - 1 - this.field4914) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1997(arg0, var9, var6, var10, var4.field2813[this.field4918]);
                if (this.field4914 < var6) {
                    return;
                }
                this.field4914 = (this.field4914 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "()Z", line = 352)
    private final boolean method1967() {
        int var1 = this.field4916;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1995(var1, this.field4913);
            var2 = method1978(var1, this.field4913);
        }
        if (this.field4912 != var1 || this.field4923 != var3 || this.field4910 != var2) {
            if (this.field4912 < var1) {
                this.field4917 = 1;
                this.field4919 = var1 - this.field4912;
            } else if (this.field4912 > var1) {
                this.field4917 = -1;
                this.field4919 = this.field4912 - var1;
            } else {
                this.field4917 = 0;
            }
            if (this.field4923 < var3) {
                this.field4911 = 1;
                if (this.field4919 == 0 || this.field4919 > var3 - this.field4923) {
                    this.field4919 = var3 - this.field4923;
                }
            } else if (this.field4923 > var3) {
                this.field4911 = -1;
                if (this.field4919 == 0 || this.field4919 > this.field4923 - var3) {
                    this.field4919 = this.field4923 - var3;
                }
            } else {
                this.field4911 = 0;
            }
            if (this.field4910 < var2) {
                this.field4924 = 1;
                if (this.field4919 == 0 || this.field4919 > var2 - this.field4910) {
                    this.field4919 = var2 - this.field4910;
                }
            } else if (this.field4910 > var2) {
                this.field4924 = -1;
                if (this.field4919 == 0 || this.field4919 > this.field4910 - var2) {
                    this.field4919 = this.field4910 - var2;
                }
            } else {
                this.field4924 = 0;
            }
            return false;
        } else if (this.field4916 == Integer.MIN_VALUE) {
            this.field4916 = 0;
            this.field4912 = this.field4923 = this.field4910 = 0;
            this.method499((byte) 64);
            return true;
        } else {
            this.method1984();
            return false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 438)
    public final synchronized void method1968(int arg0) {
        int var2 = ((class156) this.field3487).field2813.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4914 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[B[IIIIIIILqf;II)I", line = 448)
    private static final int method1969(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class295 arg10, int arg11, int arg12) {
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
        arg10.field4914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()Lmi;", line = 474)
    public final class204 method571() {
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II[B[IIIIIIIILqf;II)I", line = 478)
    private static final int method1970(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class295 arg11, int arg12, int arg13) {
        arg11.field4923 -= arg11.field4911 * arg5;
        arg11.field4910 -= arg11.field4924 * arg5;
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
        arg11.field4923 += arg11.field4911 * arg5;
        arg11.field4910 += arg11.field4924 * arg5;
        arg11.field4912 = arg6;
        arg11.field4914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V", line = 512)
    private final synchronized void method1971(int arg0, int arg1) {
        this.field4916 = arg0;
        this.field4913 = arg1;
        this.field4919 = 0;
        this.method1984();
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 519)
    public final synchronized void method1972(int arg0) {
        this.field4921 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[B[IIIIIIIIIILqf;II)I", line = 522)
    private static final int method1973(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class295 arg13, int arg14, int arg15) {
        arg13.field4912 -= arg13.field4917 * arg5;
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
        arg13.field4912 += arg13.field4917 * var27;
        arg13.field4923 = arg6;
        arg13.field4910 = arg7;
        arg13.field4914 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Loj;II)Lqf;", line = 564)
    public static final class295 method1974(class156 arg0, int arg1, int arg2) {
        return arg0.field2813 == null || arg0.field2813.length == 0 ? null : new class295(arg0, (int) ((long) arg0.field2812 * 256L * (long) arg1 / (long) (class102.field1633 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[B[IIIIIIIIIILqf;)I", line = 570)
    private static final int method1975(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class295 arg12) {
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
        arg12.field4912 += (var19 - arg4) * arg12.field4917;
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
        arg12.field4923 = var15 >> 2;
        arg12.field4910 = var16 >> 2;
        arg12.field4914 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "()V", line = 624)
    private final void method1976() {
        if (this.field4919 == 0) {
            return;
        }
        if (this.field4916 == Integer.MIN_VALUE) {
            this.field4916 = 0;
        }
        this.field4919 = 0;
        this.method1984();
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "([B[IIIIIIILqf;)I", line = 635)
    private static final int method1977(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class295 arg8) {
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
        arg8.field4914 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)I", line = 663)
    private static final int method1978(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V", line = 667)
    public final synchronized void method1979(int arg0) {
        if (arg0 == 0) {
            this.method1996(0);
            this.method499((byte) 64);
        } else if (this.field4923 == 0 && this.field4910 == 0) {
            this.field4919 = 0;
            this.field4916 = 0;
            this.field4912 = 0;
            this.method499((byte) 64);
        } else {
            int var2 = -this.field4912;
            if (this.field4912 > var2) {
                var2 = this.field4912;
            }
            if (-this.field4923 > var2) {
                var2 = -this.field4923;
            }
            if (this.field4923 > var2) {
                var2 = this.field4923;
            }
            if (-this.field4910 > var2) {
                var2 = -this.field4910;
            }
            if (this.field4910 > var2) {
                var2 = this.field4910;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4919 = arg0;
            this.field4916 = Integer.MIN_VALUE;
            this.field4917 = -this.field4912 / arg0;
            this.field4911 = -this.field4923 / arg0;
            this.field4924 = -this.field4910 / arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()I", line = 712)
    public final int method573() {
        return this.field4916 == 0 && this.field4919 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II[B[IIIIIIILqf;II)I", line = 719)
    private static final int method1980(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class295 arg10, int arg11, int arg12) {
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
        arg10.field4914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "([B[IIIIIIIILqf;)I", line = 745)
    private static final int method1981(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class295 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4923 += (var14 - arg3) * arg9.field4911;
        arg9.field4910 += (var14 - arg3) * arg9.field4924;
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
        arg9.field4912 = var12 >> 2;
        arg9.field4914 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[B[IIIIIIIILqf;)I", line = 779)
    private static final int method1982(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class295 arg10) {
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
        arg10.field4914 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([IIIII)I", line = 817)
    private final int method1983(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4919 > 0) {
                int var6 = this.field4919 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4919 += arg1;
                if (this.field4915 == -256 && (this.field4914 & 0xFF) == 0) {
                    if (class142.field2572) {
                        arg1 = method1975(0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, this.field4911, this.field4924, 0, var6, arg2, this);
                    } else {
                        arg1 = method1961(((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, this.field4917, 0, var6, arg2, this);
                    }
                } else if (class142.field2572) {
                    arg1 = method1985(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, this.field4911, this.field4924, 0, var6, arg2, this, this.field4915, arg4);
                } else {
                    arg1 = method1970(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, this.field4917, 0, var6, arg2, this, this.field4915, arg4);
                }
                this.field4919 -= arg1;
                if (this.field4919 != 0) {
                    return arg1;
                }
                if (!this.method1967()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4915 == -256 && (this.field4914 & 0xFF) == 0) {
                if (class142.field2572) {
                    return method1982(0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, 0, arg3, arg2, this);
                }
                return method1966(((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, 0, arg3, arg2, this);
            }
            if (class142.field2572) {
                return method1986(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, 0, arg3, arg2, this, this.field4915, arg4);
            }
            return method1980(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, 0, arg3, arg2, this, this.field4915, arg4);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()I", line = 875)
    public final int method1435() {
        int var1 = this.field4912 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4921 == 0) {
            var2 -= this.field4914 * var2 / (((class156) this.field3487).field2813.length << 8);
        } else if (this.field4921 >= 0) {
            var2 -= this.field4918 * var2 / ((class156) this.field3487).field2813.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "()V", line = 888)
    private final void method1984() {
        this.field4912 = this.field4916;
        this.field4923 = method1995(this.field4916, this.field4913);
        this.field4910 = method1978(this.field4916, this.field4913);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II[B[IIIIIIIIIILqf;II)I", line = 893)
    private static final int method1985(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class295 arg13, int arg14, int arg15) {
        arg13.field4912 -= arg13.field4917 * arg5;
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
        arg13.field4912 += arg13.field4917 * var26;
        arg13.field4923 = arg6;
        arg13.field4910 = arg7;
        arg13.field4914 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()Lmi;", line = 938)
    public final class204 method569() {
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II[B[IIIIIIIILqf;II)I", line = 944)
    private static final int method1986(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class295 arg11, int arg12, int arg13) {
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
        arg11.field4914 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II[B[IIIIIIIILqf;II)I", line = 976)
    private static final int method1987(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class295 arg11, int arg12, int arg13) {
        arg11.field4923 -= arg11.field4911 * arg5;
        arg11.field4910 -= arg11.field4924 * arg5;
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
        arg11.field4923 += arg11.field4911 * arg5;
        arg11.field4910 += arg11.field4924 * arg5;
        arg11.field4912 = arg6;
        arg11.field4914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 1009)
    public final synchronized void method568(int arg0) {
        if (this.field4919 > 0) {
            if (arg0 >= this.field4919) {
                if (this.field4916 == Integer.MIN_VALUE) {
                    this.field4916 = 0;
                    this.field4912 = this.field4923 = this.field4910 = 0;
                    this.method499((byte) 64);
                    arg0 = this.field4919;
                }
                this.field4919 = 0;
                this.method1984();
            } else {
                this.field4912 += this.field4917 * arg0;
                this.field4923 += this.field4911 * arg0;
                this.field4910 += this.field4924 * arg0;
                this.field4919 -= arg0;
            }
        }
        class156 var2 = (class156) this.field3487;
        int var3 = this.field4918 << 8;
        int var4 = this.field4920 << 8;
        int var5 = var2.field2813.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4921 = 0;
        }
        if (this.field4914 < 0) {
            if (this.field4915 <= 0) {
                this.method1976();
                this.method499((byte) 64);
                return;
            }
            this.field4914 = 0;
        }
        if (this.field4914 >= var5) {
            if (this.field4915 >= 0) {
                this.method1976();
                this.method499((byte) 64);
                return;
            }
            this.field4914 = var5 - 1;
        }
        this.field4914 += this.field4915 * arg0;
        if (this.field4921 >= 0) {
            if (this.field4921 > 0) {
                if (this.field4922) {
                    label121: {
                        if (this.field4915 < 0) {
                            if (this.field4914 >= var3) {
                                return;
                            }
                            this.field4914 = var3 + var3 - this.field4914 - 1;
                            this.field4915 = -this.field4915;
                            if (--this.field4921 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4914 < var4) {
                                return;
                            }
                            this.field4914 = var4 + var4 - this.field4914 - 1;
                            this.field4915 = -this.field4915;
                            if (--this.field4921 == 0) {
                                break;
                            }
                            if (this.field4914 >= var3) {
                                return;
                            }
                            this.field4914 = var3 + var3 - this.field4914 - 1;
                            this.field4915 = -this.field4915;
                        } while (--this.field4921 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4915 < 0) {
                            if (this.field4914 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4914 - 1) / var6;
                            if (var7 >= this.field4921) {
                                this.field4914 += this.field4921 * var6;
                                this.field4921 = 0;
                                break label153;
                            }
                            this.field4914 += var6 * var7;
                            this.field4921 -= var7;
                        } else if (this.field4914 >= var4) {
                            int var8 = (this.field4914 - var3) / var6;
                            if (var8 >= this.field4921) {
                                this.field4914 -= this.field4921 * var6;
                                this.field4921 = 0;
                                break label153;
                            }
                            this.field4914 -= var6 * var8;
                            this.field4921 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4915 < 0) {
                if (this.field4914 < 0) {
                    this.field4914 = -1;
                    this.method1976();
                    this.method499((byte) 64);
                }
            } else if (this.field4914 >= var5) {
                this.field4914 = var5;
                this.method1976();
                this.method499((byte) 64);
            }
        } else if (this.field4922) {
            if (this.field4915 < 0) {
                if (this.field4914 >= var3) {
                    return;
                }
                this.field4914 = var3 + var3 - this.field4914 - 1;
                this.field4915 = -this.field4915;
            }
            while (this.field4914 >= var4) {
                this.field4914 = var4 + var4 - this.field4914 - 1;
                this.field4915 = -this.field4915;
                if (this.field4914 >= var3) {
                    return;
                }
                this.field4914 = var3 + var3 - this.field4914 - 1;
                this.field4915 = -this.field4915;
            }
        } else if (this.field4915 < 0) {
            if (this.field4914 >= var3) {
                return;
            }
            this.field4914 = var4 - (var4 - 1 - this.field4914) % var6 - 1;
        } else if (this.field4914 >= var4) {
            this.field4914 = (this.field4914 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(II)V", line = 1229)
    public final synchronized void method1988(int arg0, int arg1) {
        this.method1990(arg0, arg1, this.method1959());
    }

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "()Z", line = 1234)
    public final boolean method1989() {
        return this.field4919 != 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V", line = 1237)
    public final synchronized void method1990(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1971(arg1, arg2);
            return;
        }
        int var4 = method1995(arg1, arg2);
        int var5 = method1978(arg1, arg2);
        if (this.field4923 == var4 && this.field4910 == var5) {
            this.field4919 = 0;
            return;
        }
        int var6 = arg1 - this.field4912;
        if (this.field4912 - arg1 > var6) {
            var6 = this.field4912 - arg1;
        }
        if (var4 - this.field4923 > var6) {
            var6 = var4 - this.field4923;
        }
        if (this.field4923 - var4 > var6) {
            var6 = this.field4923 - var4;
        }
        if (var5 - this.field4910 > var6) {
            var6 = var5 - this.field4910;
        }
        if (this.field4910 - var5 > var6) {
            var6 = this.field4910 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4919 = arg0;
        this.field4916 = arg1;
        this.field4913 = arg2;
        this.field4917 = (arg1 - this.field4912) / arg0;
        this.field4911 = (var4 - this.field4923) / arg0;
        this.field4924 = (var5 - this.field4910) / arg0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I[B[IIIIIIIILqf;)I", line = 1283)
    private static final int method1991(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class295 arg10) {
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
        arg10.field4914 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I[B[IIIIIIIIIILqf;)I", line = 1321)
    private static final int method1992(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class295 arg12) {
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
        arg12.field4912 += (var19 - arg4) * arg12.field4917;
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
        arg12.field4923 = var15 >> 2;
        arg12.field4910 = var16 >> 2;
        arg12.field4914 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V", line = 1375)
    public final synchronized void method1993(int arg0) {
        if (this.field4915 < 0) {
            this.field4915 = -arg0;
        } else {
            this.field4915 = arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "()I", line = 1384)
    public final synchronized int method1994() {
        return this.field4915 < 0 ? -this.field4915 : this.field4915;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(II)I", line = 1390)
    private static final int method1995(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V", line = 1393)
    private final synchronized void method1996(int arg0) {
        this.method1971(arg0, this.method1959());
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "([IIIII)I", line = 1397)
    private final int method1997(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4919 > 0) {
                int var6 = this.field4919 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4919 += arg1;
                if (this.field4915 == 256 && (this.field4914 & 0xFF) == 0) {
                    if (class142.field2572) {
                        arg1 = method1992(0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, this.field4911, this.field4924, 0, var6, arg2, this);
                    } else {
                        arg1 = method1981(((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, this.field4917, 0, var6, arg2, this);
                    }
                } else if (class142.field2572) {
                    arg1 = method1973(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, this.field4911, this.field4924, 0, var6, arg2, this, this.field4915, arg4);
                } else {
                    arg1 = method1987(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, this.field4917, 0, var6, arg2, this, this.field4915, arg4);
                }
                this.field4919 -= arg1;
                if (this.field4919 != 0) {
                    return arg1;
                }
                if (!this.method1967()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4915 == 256 && (this.field4914 & 0xFF) == 0) {
                if (class142.field2572) {
                    return method1991(0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, 0, arg3, arg2, this);
                }
                return method1977(((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, 0, arg3, arg2, this);
            }
            if (class142.field2572) {
                return method1960(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4923, this.field4910, 0, arg3, arg2, this, this.field4915, arg4);
            }
            return method1969(0, 0, ((class156) this.field3487).field2813, arg0, this.field4914, arg1, this.field4912, 0, arg3, arg2, this, this.field4915, arg4);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 1452)
    public final synchronized void method1998(boolean arg0) {
        this.field4915 = (this.field4915 >>> 31) + (this.field4915 ^ this.field4915 >> 31);
        if (arg0) {
            this.field4915 = -this.field4915;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Loj;II)V", line = 1457)
    private class295(class156 arg0, int arg1, int arg2) {
        this.field3487 = arg0;
        this.field4918 = arg0.field2815;
        this.field4920 = arg0.field2816;
        this.field4922 = arg0.field2814;
        this.field4915 = arg1;
        this.field4916 = arg2;
        this.field4913 = 8192;
        this.field4914 = 0;
        this.method1984();
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Loj;III)V", line = 1468)
    private class295(class156 arg0, int arg1, int arg2, int arg3) {
        this.field3487 = arg0;
        this.field4918 = arg0.field2815;
        this.field4920 = arg0.field2816;
        this.field4922 = arg0.field2814;
        this.field4915 = arg1;
        this.field4916 = arg2;
        this.field4913 = arg3;
        this.field4914 = 0;
        this.method1984();
    }
}
