import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class375 extends class270 {

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    private int field4984;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "Z")
    private boolean field4980;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    private int field4977;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    private int field4978;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    private int field4976;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    private int field4981;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    private int field4985;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    private int field4986;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    private int field4987;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[B[IIIIIIIILbn;)I")
    private static final int method2150(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class375 arg10) {
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
        arg10.field4979 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)I")
    private static final int method2151(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    private final synchronized void method2152(int arg0) {
        this.method2171(arg0, this.method2155());
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
    public final synchronized void method2153(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2171(arg1, arg2);
        } else {
            int var4 = method2151(arg1, arg2);
            int var5 = method2161(arg1, arg2);
            if (this.field4990 == var4 && this.field4981 == var5) {
                this.field4985 = 0;
            } else {
                int var6 = arg1 - this.field4987;
                if (this.field4987 - arg1 > var6) {
                    var6 = this.field4987 - arg1;
                }
                if (var4 - this.field4990 > var6) {
                    var6 = var4 - this.field4990;
                }
                if (this.field4990 - var4 > var6) {
                    var6 = this.field4990 - var4;
                }
                if (var5 - this.field4981 > var6) {
                    var6 = var5 - this.field4981;
                }
                if (this.field4981 - var5 > var6) {
                    var6 = this.field4981 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4985 = arg0;
                this.field4978 = arg1;
                this.field4988 = arg2;
                this.field4983 = (arg1 - this.field4987) / arg0;
                this.field4986 = (var4 - this.field4990) / arg0;
                this.field4982 = (var5 - this.field4981) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([B[IIIIIIILbn;)I")
    private static final int method2154(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class375 arg8) {
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
        arg8.field4979 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "()I")
    public final synchronized int method2155() {
        return this.field4988 < 0 ? -1 : this.field4988;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([IIIII)I")
    private final int method2156(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4985 <= 0) {
                if (this.field4977 == -256 && (this.field4979 & 255) == 0) {
                    if (class197.field2383) {
                        return method2185(0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, 0, arg3, arg2, this);
                    }
                    return method2154(((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, 0, arg3, arg2, this);
                }
                if (class197.field2383) {
                    return method2178(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, 0, arg3, arg2, this, this.field4977, arg4);
                }
                return method2186(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, 0, arg3, arg2, this, this.field4977, arg4);
            }
            int var6 = this.field4985 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4985 += arg1;
            if (this.field4977 == -256 && (this.field4979 & 255) == 0) {
                if (class197.field2383) {
                    arg1 = method2188(0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, this.field4986, this.field4982, 0, var6, arg2, this);
                } else {
                    arg1 = method2157(((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, this.field4983, 0, var6, arg2, this);
                }
            } else if (class197.field2383) {
                arg1 = method2160(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, this.field4986, this.field4982, 0, var6, arg2, this, this.field4977, arg4);
            } else {
                arg1 = method2174(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, this.field4983, 0, var6, arg2, this, this.field4977, arg4);
            }
            this.field4985 -= arg1;
            if (this.field4985 != 0) {
                return arg1;
            }
        } while (!this.method2162());
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([B[IIIIIIIILbn;)I")
    private static final int method2157(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class375 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4990 += (var14 - arg3) * arg9.field4986;
        arg9.field4981 += (var14 - arg3) * arg9.field4982;
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
        arg9.field4987 = var12 >> 2;
        arg9.field4979 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "()Z")
    public final boolean method2158() {
        return this.field4979 < 0 || this.field4979 >= ((class123) super.field3505).field1521.length << 8;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V")
    public final synchronized void method2159(int arg0, int arg1) {
        this.method2153(arg0, arg1, this.method2155());
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[B[IIIIIIIIIILbn;II)I")
    private static final int method2160(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class375 arg13, int arg14, int arg15) {
        arg13.field4987 -= arg13.field4983 * arg5;
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
        arg13.field4987 += arg13.field4983 * var22;
        arg13.field4990 = arg6;
        arg13.field4981 = arg7;
        arg13.field4979 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)I")
    private static final int method2161(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "()Z")
    private final boolean method2162() {
        int var1 = this.field4978;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2151(var1, this.field4988);
            var2 = method2161(var1, this.field4988);
        }
        if (this.field4987 == var1 && this.field4990 == var3 && this.field4981 == var2) {
            if (this.field4978 == Integer.MIN_VALUE) {
                this.field4978 = 0;
                this.field4987 = this.field4990 = this.field4981 = 0;
                this.method3187(true);
                return true;
            } else {
                this.method2173();
                return false;
            }
        } else {
            if (this.field4987 < var1) {
                this.field4983 = 1;
                this.field4985 = var1 - this.field4987;
            } else if (this.field4987 > var1) {
                this.field4983 = -1;
                this.field4985 = this.field4987 - var1;
            } else {
                this.field4983 = 0;
            }
            if (this.field4990 < var3) {
                this.field4986 = 1;
                if (this.field4985 == 0 || this.field4985 > var3 - this.field4990) {
                    this.field4985 = var3 - this.field4990;
                }
            } else if (this.field4990 > var3) {
                this.field4986 = -1;
                if (this.field4985 == 0 || this.field4985 > this.field4990 - var3) {
                    this.field4985 = this.field4990 - var3;
                }
            } else {
                this.field4986 = 0;
            }
            if (this.field4981 < var2) {
                this.field4982 = 1;
                if (this.field4985 == 0 || this.field4985 > var2 - this.field4981) {
                    this.field4985 = var2 - this.field4981;
                }
            } else if (this.field4981 > var2) {
                this.field4982 = -1;
                if (this.field4985 == 0 || this.field4985 > this.field4981 - var2) {
                    this.field4985 = this.field4981 - var2;
                }
            } else {
                this.field4982 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "([B[IIIIIIILbn;)I")
    private static final int method2163(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class375 arg8) {
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
        arg8.field4979 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[B[IIIIIIIILbn;II)I")
    private static final int method2164(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class375 arg11, int arg12, int arg13) {
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
        arg11.field4979 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public final synchronized void method2165(int arg0) {
        if (arg0 == 0) {
            this.method2152(0);
            this.method3187(true);
        } else if (this.field4990 == 0 && this.field4981 == 0) {
            this.field4985 = 0;
            this.field4978 = 0;
            this.field4987 = 0;
            this.method3187(true);
        } else {
            int var2 = -this.field4987;
            if (this.field4987 > var2) {
                var2 = this.field4987;
            }
            if (-this.field4990 > var2) {
                var2 = -this.field4990;
            }
            if (this.field4990 > var2) {
                var2 = this.field4990;
            }
            if (-this.field4981 > var2) {
                var2 = -this.field4981;
            }
            if (this.field4981 > var2) {
                var2 = this.field4981;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4985 = arg0;
            this.field4978 = Integer.MIN_VALUE;
            this.field4983 = -this.field4987 / arg0;
            this.field4986 = -this.field4990 / arg0;
            this.field4982 = -this.field4981 / arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "()V")
    private final void method2166() {
        if (this.field4985 != 0) {
            if (this.field4978 == Integer.MIN_VALUE) {
                this.field4978 = 0;
            }
            this.field4985 = 0;
            this.method2173();
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II[B[IIIIIIIILbn;II)I")
    private static final int method2167(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class375 arg11, int arg12, int arg13) {
        arg11.field4990 -= arg11.field4986 * arg5;
        arg11.field4981 -= arg11.field4982 * arg5;
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
        arg11.field4990 += arg11.field4986 * arg5;
        arg11.field4981 += arg11.field4982 * arg5;
        arg11.field4987 = arg6;
        arg11.field4979 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "([B[IIIIIIIILbn;)I")
    private static final int method2168(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class375 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4990 += (var14 - arg3) * arg9.field4986;
        arg9.field4981 += (var14 - arg3) * arg9.field4982;
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
        arg9.field4987 = var12 >> 2;
        arg9.field4979 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "()Z")
    public final boolean method2169() {
        return this.field4985 != 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lmr;III)Lbn;")
    public static final class375 method2170(class123 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1521 != null && arg0.field1521.length != 0 ? new class375(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()Lvv;")
    public final class270 method801() {
        return null;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(II)V")
    private final synchronized void method2171(int arg0, int arg1) {
        this.field4978 = arg0;
        this.field4988 = arg1;
        this.field4985 = 0;
        this.method2173();
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II[B[IIIIIIIIIILbn;II)I")
    private static final int method2172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class375 arg13, int arg14, int arg15) {
        arg13.field4987 -= arg13.field4983 * arg5;
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
        arg13.field4987 += arg13.field4983 * var22;
        arg13.field4990 = arg6;
        arg13.field4981 = arg7;
        arg13.field4979 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final synchronized void method804(int arg0) {
        if (this.field4985 > 0) {
            if (arg0 >= this.field4985) {
                if (this.field4978 == Integer.MIN_VALUE) {
                    this.field4978 = 0;
                    this.field4987 = this.field4990 = this.field4981 = 0;
                    this.method3187(true);
                    arg0 = this.field4985;
                }
                this.field4985 = 0;
                this.method2173();
            } else {
                this.field4987 += this.field4983 * arg0;
                this.field4990 += this.field4986 * arg0;
                this.field4981 += this.field4982 * arg0;
                this.field4985 -= arg0;
            }
        }
        class123 var2 = (class123) super.field3505;
        int var3 = this.field4989 << 8;
        int var4 = this.field4984 << 8;
        int var5 = var2.field1521.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4976 = 0;
        }
        if (this.field4979 < 0) {
            if (this.field4977 <= 0) {
                this.method2166();
                this.method3187(true);
                return;
            }
            this.field4979 = 0;
        }
        if (this.field4979 >= var5) {
            if (this.field4977 >= 0) {
                this.method2166();
                this.method3187(true);
                return;
            }
            this.field4979 = var5 - 1;
        }
        this.field4979 += this.field4977 * arg0;
        if (this.field4976 < 0) {
            if (!this.field4980) {
                if (this.field4977 < 0) {
                    if (this.field4979 < var3) {
                        this.field4979 = var4 - 1 - (var4 - 1 - this.field4979) % var6;
                    }
                } else if (this.field4979 >= var4) {
                    this.field4979 = (this.field4979 - var3) % var6 + var3;
                }
            } else {
                if (this.field4977 < 0) {
                    if (this.field4979 >= var3) {
                        return;
                    }
                    this.field4979 = var3 + var3 - 1 - this.field4979;
                    this.field4977 = -this.field4977;
                }
                while (this.field4979 >= var4) {
                    this.field4979 = var4 + var4 - 1 - this.field4979;
                    this.field4977 = -this.field4977;
                    if (this.field4979 >= var3) {
                        return;
                    }
                    this.field4979 = var3 + var3 - 1 - this.field4979;
                    this.field4977 = -this.field4977;
                }
            }
        } else {
            if (this.field4976 > 0) {
                if (this.field4980) {
                    label125: {
                        if (this.field4977 < 0) {
                            if (this.field4979 >= var3) {
                                return;
                            }
                            this.field4979 = var3 + var3 - 1 - this.field4979;
                            this.field4977 = -this.field4977;
                            if (--this.field4976 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4979 < var4) {
                                return;
                            }
                            this.field4979 = var4 + var4 - 1 - this.field4979;
                            this.field4977 = -this.field4977;
                            if (--this.field4976 == 0) {
                                break;
                            }
                            if (this.field4979 >= var3) {
                                return;
                            }
                            this.field4979 = var3 + var3 - 1 - this.field4979;
                            this.field4977 = -this.field4977;
                        } while (--this.field4976 != 0);
                    }
                } else if (this.field4977 < 0) {
                    if (this.field4979 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4979) / var6;
                    if (var7 < this.field4976) {
                        this.field4979 += var6 * var7;
                        this.field4976 -= var7;
                        return;
                    }
                    this.field4979 += this.field4976 * var6;
                    this.field4976 = 0;
                } else {
                    if (this.field4979 < var4) {
                        return;
                    }
                    int var8 = (this.field4979 - var3) / var6;
                    if (var8 < this.field4976) {
                        this.field4979 -= var6 * var8;
                        this.field4976 -= var8;
                        return;
                    }
                    this.field4979 -= this.field4976 * var6;
                    this.field4976 = 0;
                }
            }
            if (this.field4977 < 0) {
                if (this.field4979 < 0) {
                    this.field4979 = -1;
                    this.method2166();
                    this.method3187(true);
                    return;
                }
            } else if (this.field4979 >= var5) {
                this.field4979 = var5;
                this.method2166();
                this.method3187(true);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "()V")
    private final void method2173() {
        this.field4987 = this.field4978;
        this.field4990 = method2151(this.field4978, this.field4988);
        this.field4981 = method2161(this.field4978, this.field4988);
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II[B[IIIIIIIILbn;II)I")
    private static final int method2174(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class375 arg11, int arg12, int arg13) {
        arg11.field4990 -= arg11.field4986 * arg5;
        arg11.field4981 -= arg11.field4982 * arg5;
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
        arg11.field4990 += arg11.field4986 * arg5;
        arg11.field4981 += arg11.field4982 * arg5;
        arg11.field4987 = arg6;
        arg11.field4979 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(I)V")
    public final synchronized void method2175(int arg0) {
        this.field4976 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "([IIIII)I")
    private final int method2176(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4985 <= 0) {
                if (this.field4977 == 256 && (this.field4979 & 255) == 0) {
                    if (class197.field2383) {
                        return method2150(0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, 0, arg3, arg2, this);
                    }
                    return method2163(((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, 0, arg3, arg2, this);
                }
                if (class197.field2383) {
                    return method2164(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, 0, arg3, arg2, this, this.field4977, arg4);
                }
                return method2177(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, 0, arg3, arg2, this, this.field4977, arg4);
            }
            int var6 = this.field4985 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4985 += arg1;
            if (this.field4977 == 256 && (this.field4979 & 255) == 0) {
                if (class197.field2383) {
                    arg1 = method2184(0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, this.field4986, this.field4982, 0, var6, arg2, this);
                } else {
                    arg1 = method2168(((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, this.field4983, 0, var6, arg2, this);
                }
            } else if (class197.field2383) {
                arg1 = method2172(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4990, this.field4981, this.field4986, this.field4982, 0, var6, arg2, this, this.field4977, arg4);
            } else {
                arg1 = method2167(0, 0, ((class123) super.field3505).field1521, arg0, this.field4979, arg1, this.field4987, this.field4983, 0, var6, arg2, this, this.field4977, arg4);
            }
            this.field4985 -= arg1;
            if (this.field4985 != 0) {
                return arg1;
            }
        } while (!this.method2162());
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[B[IIIIIIILbn;II)I")
    private static final int method2177(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class375 arg10, int arg11, int arg12) {
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
        arg10.field4979 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(II[B[IIIIIIIILbn;II)I")
    private static final int method2178(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class375 arg11, int arg12, int arg13) {
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
        arg11.field4979 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "()I")
    public final synchronized int method2179() {
        return this.field4977 < 0 ? -this.field4977 : this.field4977;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
    public final synchronized void method2180(boolean arg0) {
        this.field4977 = (this.field4977 >>> 31) + (this.field4977 ^ this.field4977 >> 31);
        if (arg0) {
            this.field4977 = -this.field4977;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lmr;II)Lbn;")
    public static final class375 method2181(class123 arg0, int arg1, int arg2) {
        return arg0.field1521 != null && arg0.field1521.length != 0 ? new class375(arg0, (int) ((long) arg0.field1523 * 256L * (long) arg1 / (long) (class90.field1101 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()I")
    public final int method800() {
        return this.field4978 == 0 && this.field4985 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V")
    public final synchronized void method2182(int arg0) {
        this.method2171(arg0 << 6, this.method2155());
    }

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "(I)V")
    public final synchronized void method2183(int arg0) {
        if (this.field4977 < 0) {
            this.field4977 = -arg0;
        } else {
            this.field4977 = arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[B[IIIIIIIIIILbn;)I")
    private static final int method2184(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class375 arg12) {
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
        arg12.field4987 += (var19 - arg4) * arg12.field4983;
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
        arg12.field4990 = var15 >> 2;
        arg12.field4981 = var16 >> 2;
        arg12.field4979 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I[B[IIIIIIIILbn;)I")
    private static final int method2185(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class375 arg10) {
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
        arg10.field4979 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II[B[IIIIIIILbn;II)I")
    private static final int method2186(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class375 arg10, int arg11, int arg12) {
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
        arg10.field4979 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "()I")
    public final synchronized int method2187() {
        return this.field4978 == Integer.MIN_VALUE ? 0 : this.field4978;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I[B[IIIIIIIIIILbn;)I")
    private static final int method2188(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class375 arg12) {
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
        arg12.field4987 += (var19 - arg4) * arg12.field4983;
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
        arg12.field4990 = var15 >> 2;
        arg12.field4981 = var16 >> 2;
        arg12.field4979 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "([III)V")
    public final synchronized void method799(int[] arg0, int arg1, int arg2) {
        if (this.field4978 == 0 && this.field4985 == 0) {
            this.method804(arg2);
        } else {
            class123 var4 = (class123) super.field3505;
            int var5 = this.field4989 << 8;
            int var6 = this.field4984 << 8;
            int var7 = var4.field1521.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4976 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4979 < 0) {
                if (this.field4977 <= 0) {
                    this.method2166();
                    this.method3187(true);
                    return;
                }
                this.field4979 = 0;
            }
            if (this.field4979 >= var7) {
                if (this.field4977 >= 0) {
                    this.method2166();
                    this.method3187(true);
                    return;
                }
                this.field4979 = var7 - 1;
            }
            if (this.field4976 < 0) {
                if (this.field4980) {
                    if (this.field4977 < 0) {
                        var9 = this.method2156(arg0, arg1, var5, var10, var4.field1521[this.field4989]);
                        if (this.field4979 >= var5) {
                            return;
                        }
                        this.field4979 = var5 + var5 - 1 - this.field4979;
                        this.field4977 = -this.field4977;
                    }
                    while (true) {
                        int var11 = this.method2176(arg0, var9, var6, var10, var4.field1521[this.field4984 - 1]);
                        if (this.field4979 < var6) {
                            return;
                        }
                        this.field4979 = var6 + var6 - 1 - this.field4979;
                        this.field4977 = -this.field4977;
                        var9 = this.method2156(arg0, var11, var5, var10, var4.field1521[this.field4989]);
                        if (this.field4979 >= var5) {
                            return;
                        }
                        this.field4979 = var5 + var5 - 1 - this.field4979;
                        this.field4977 = -this.field4977;
                    }
                } else if (this.field4977 < 0) {
                    while (true) {
                        var9 = this.method2156(arg0, var9, var5, var10, var4.field1521[this.field4984 - 1]);
                        if (this.field4979 >= var5) {
                            return;
                        }
                        this.field4979 = var6 - 1 - (var6 - 1 - this.field4979) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2176(arg0, var9, var6, var10, var4.field1521[this.field4989]);
                        if (this.field4979 < var6) {
                            return;
                        }
                        this.field4979 = (this.field4979 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4976 > 0) {
                    if (this.field4980) {
                        label130: {
                            if (this.field4977 < 0) {
                                var9 = this.method2156(arg0, arg1, var5, var10, var4.field1521[this.field4989]);
                                if (this.field4979 >= var5) {
                                    return;
                                }
                                this.field4979 = var5 + var5 - 1 - this.field4979;
                                this.field4977 = -this.field4977;
                                if (--this.field4976 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2176(arg0, var9, var6, var10, var4.field1521[this.field4984 - 1]);
                                if (this.field4979 < var6) {
                                    return;
                                }
                                this.field4979 = var6 + var6 - 1 - this.field4979;
                                this.field4977 = -this.field4977;
                                if (--this.field4976 == 0) {
                                    break;
                                }
                                var9 = this.method2156(arg0, var9, var5, var10, var4.field1521[this.field4989]);
                                if (this.field4979 >= var5) {
                                    return;
                                }
                                this.field4979 = var5 + var5 - 1 - this.field4979;
                                this.field4977 = -this.field4977;
                            } while (--this.field4976 != 0);
                        }
                    } else if (this.field4977 < 0) {
                        while (true) {
                            var9 = this.method2156(arg0, var9, var5, var10, var4.field1521[this.field4984 - 1]);
                            if (this.field4979 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4979) / var8;
                            if (var12 >= this.field4976) {
                                this.field4979 += this.field4976 * var8;
                                this.field4976 = 0;
                                break;
                            }
                            this.field4979 += var8 * var12;
                            this.field4976 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2176(arg0, var9, var6, var10, var4.field1521[this.field4989]);
                            if (this.field4979 < var6) {
                                return;
                            }
                            int var13 = (this.field4979 - var5) / var8;
                            if (var13 >= this.field4976) {
                                this.field4979 -= this.field4976 * var8;
                                this.field4976 = 0;
                                break;
                            }
                            this.field4979 -= var8 * var13;
                            this.field4976 -= var13;
                        }
                    }
                }
                if (this.field4977 < 0) {
                    this.method2156(arg0, var9, 0, var10, 0);
                    if (this.field4979 < 0) {
                        this.field4979 = -1;
                        this.method2166();
                        this.method3187(true);
                        return;
                    }
                } else {
                    this.method2176(arg0, var9, var7, var10, 0);
                    if (this.field4979 >= var7) {
                        this.field4979 = var7;
                        this.method2166();
                        this.method3187(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()I")
    public final int method1509() {
        int var1 = this.field4987 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4976 == 0) {
            var2 -= this.field4979 * var2 / (((class123) super.field3505).field1521.length << 8);
        } else if (this.field4976 >= 0) {
            var2 -= this.field4989 * var2 / ((class123) super.field3505).field1521.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()Lvv;")
    public final class270 method806() {
        return null;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lmr;II)V")
    private class375(class123 arg0, int arg1, int arg2) {
        super.field3505 = arg0;
        this.field4989 = arg0.field1524;
        this.field4984 = arg0.field1525;
        this.field4980 = arg0.field1522;
        this.field4977 = arg1;
        this.field4978 = arg2;
        this.field4988 = 8192;
        this.field4979 = 0;
        this.method2173();
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lmr;III)V")
    private class375(class123 arg0, int arg1, int arg2, int arg3) {
        super.field3505 = arg0;
        this.field4989 = arg0.field1524;
        this.field4984 = arg0.field1525;
        this.field4980 = arg0.field1522;
        this.field4977 = arg1;
        this.field4978 = arg2;
        this.field4988 = arg3;
        this.field4979 = 0;
        this.method2173();
    }

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "(I)V")
    public final synchronized void method2189(int arg0) {
        int var2 = ((class123) super.field3505).field1521.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4979 = arg0;
    }
}
