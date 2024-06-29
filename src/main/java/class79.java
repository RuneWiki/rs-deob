import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 extends class71 {

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field1929;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Z")
    private boolean field1932;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    private int field1937;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field1935;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    private int field1938;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    private int field1939;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B[IIIIIIILlc;)I")
    private static final int method638(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8) {
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
        arg8.field1940 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIILlc;II)I")
    private static final int method639(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10, int arg11, int arg12) {
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
        arg10.field1940 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()Z")
    private final boolean method640() {
        int var1 = this.field1930;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method658(var1, this.field1934);
            var2 = method661(var1, this.field1934);
        }
        if (this.field1938 == var1 && this.field1939 == var3 && this.field1941 == var2) {
            if (this.field1930 == Integer.MIN_VALUE) {
                this.field1930 = 0;
                this.field1938 = this.field1939 = this.field1941 = 0;
                this.method1009((byte) 102);
                return true;
            } else {
                this.method674();
                return false;
            }
        } else {
            if (this.field1938 < var1) {
                this.field1936 = 1;
                this.field1933 = var1 - this.field1938;
            } else if (this.field1938 > var1) {
                this.field1936 = -1;
                this.field1933 = this.field1938 - var1;
            } else {
                this.field1936 = 0;
            }
            if (this.field1939 < var3) {
                this.field1942 = 1;
                if (this.field1933 == 0 || this.field1933 > var3 - this.field1939) {
                    this.field1933 = var3 - this.field1939;
                }
            } else if (this.field1939 > var3) {
                this.field1942 = -1;
                if (this.field1933 == 0 || this.field1933 > this.field1939 - var3) {
                    this.field1933 = this.field1939 - var3;
                }
            } else {
                this.field1942 = 0;
            }
            if (this.field1941 < var2) {
                this.field1935 = 1;
                if (this.field1933 == 0 || this.field1933 > var2 - this.field1941) {
                    this.field1933 = var2 - this.field1941;
                }
            } else if (this.field1941 > var2) {
                this.field1935 = -1;
                if (this.field1933 == 0 || this.field1933 > this.field1941 - var2) {
                    this.field1933 = this.field1941 - var2;
                }
            } else {
                this.field1935 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public final synchronized void method641(int arg0) {
        if (this.field1937 < 0) {
            this.field1937 = -arg0;
        } else {
            this.field1937 = arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public final synchronized void method642(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method666(arg1, arg2);
        } else {
            int var4 = method658(arg1, arg2);
            int var5 = method661(arg1, arg2);
            if (this.field1939 == var4 && this.field1941 == var5) {
                this.field1933 = 0;
            } else {
                int var6 = arg1 - this.field1938;
                if (this.field1938 - arg1 > var6) {
                    var6 = this.field1938 - arg1;
                }
                if (var4 - this.field1939 > var6) {
                    var6 = var4 - this.field1939;
                }
                if (this.field1939 - var4 > var6) {
                    var6 = this.field1939 - var4;
                }
                if (var5 - this.field1941 > var6) {
                    var6 = var5 - this.field1941;
                }
                if (this.field1941 - var5 > var6) {
                    var6 = this.field1941 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1933 = arg0;
                this.field1930 = arg1;
                this.field1934 = arg2;
                this.field1936 = (arg1 - this.field1938) / arg0;
                this.field1942 = (var4 - this.field1939) / arg0;
                this.field1935 = (var5 - this.field1941) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
    private final void method643() {
        if (this.field1933 != 0) {
            if (this.field1930 == Integer.MIN_VALUE) {
                this.field1930 = 0;
            }
            this.field1933 = 0;
            this.method674();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B[IIIIIIIILlc;)I")
    private static final int method644(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class79 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1939 += (var14 - arg3) * arg9.field1942;
        arg9.field1941 += (var14 - arg3) * arg9.field1935;
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
        arg9.field1938 = var12 >> 2;
        arg9.field1940 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lkb;")
    public final class71 method109() {
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final synchronized void method645(boolean arg0) {
        this.field1937 = (this.field1937 >>> 31) + (this.field1937 ^ this.field1937 >> 31);
        if (arg0) {
            this.field1937 = -this.field1937;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method646(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
        arg11.field1939 -= arg11.field1942 * arg5;
        arg11.field1941 -= arg11.field1935 * arg5;
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
        arg11.field1939 += arg11.field1942 * arg5;
        arg11.field1941 += arg11.field1935 * arg5;
        arg11.field1938 = arg6;
        arg11.field1940 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIIIIILlc;II)I")
    private static final int method647(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class79 arg13, int arg14, int arg15) {
        arg13.field1938 -= arg13.field1936 * arg5;
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
        arg13.field1938 += arg13.field1936 * var22;
        arg13.field1939 = arg6;
        arg13.field1941 = arg7;
        arg13.field1940 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method648(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
        arg11.field1939 -= arg11.field1942 * arg5;
        arg11.field1941 -= arg11.field1935 * arg5;
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
        arg11.field1939 += arg11.field1942 * arg5;
        arg11.field1941 += arg11.field1935 * arg5;
        arg11.field1938 = arg6;
        arg11.field1940 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lm;III)Llc;")
    public static final class79 method649(class83 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2071 != null && arg0.field2071.length != 0 ? new class79(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public final synchronized void method650(int arg0, int arg1) {
        this.method642(arg0, arg1, this.method662());
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B[IIIIIIIILlc;)I")
    private static final int method651(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10) {
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
        arg10.field1940 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
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
        arg11.field1940 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()I")
    public final synchronized int method653() {
        return this.field1930 == Integer.MIN_VALUE ? 0 : this.field1930;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "()I")
    public final synchronized int method654() {
        return this.field1937 < 0 ? -this.field1937 : this.field1937;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public final synchronized void method104(int arg0) {
        if (this.field1933 > 0) {
            if (arg0 >= this.field1933) {
                if (this.field1930 == Integer.MIN_VALUE) {
                    this.field1930 = 0;
                    this.field1938 = this.field1939 = this.field1941 = 0;
                    this.method1009((byte) 54);
                    arg0 = this.field1933;
                }
                this.field1933 = 0;
                this.method674();
            } else {
                this.field1938 += this.field1936 * arg0;
                this.field1939 += this.field1942 * arg0;
                this.field1941 += this.field1935 * arg0;
                this.field1933 -= arg0;
            }
        }
        class83 var2 = (class83) super.field1724;
        int var3 = this.field1929 << 8;
        int var4 = this.field1928 << 8;
        int var5 = var2.field2071.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1931 = 0;
        }
        if (this.field1940 < 0) {
            if (this.field1937 <= 0) {
                this.method643();
                this.method1009((byte) 62);
                return;
            }
            this.field1940 = 0;
        }
        if (this.field1940 >= var5) {
            if (this.field1937 >= 0) {
                this.method643();
                this.method1009((byte) 96);
                return;
            }
            this.field1940 = var5 - 1;
        }
        this.field1940 += this.field1937 * arg0;
        if (this.field1931 < 0) {
            if (!this.field1932) {
                if (this.field1937 < 0) {
                    if (this.field1940 < var3) {
                        this.field1940 = var4 - 1 - (var4 - 1 - this.field1940) % var6;
                    }
                } else if (this.field1940 >= var4) {
                    this.field1940 = (this.field1940 - var3) % var6 + var3;
                }
            } else {
                if (this.field1937 < 0) {
                    if (this.field1940 >= var3) {
                        return;
                    }
                    this.field1940 = var3 + var3 - 1 - this.field1940;
                    this.field1937 = -this.field1937;
                }
                while (this.field1940 >= var4) {
                    this.field1940 = var4 + var4 - 1 - this.field1940;
                    this.field1937 = -this.field1937;
                    if (this.field1940 >= var3) {
                        return;
                    }
                    this.field1940 = var3 + var3 - 1 - this.field1940;
                    this.field1937 = -this.field1937;
                }
            }
        } else {
            if (this.field1931 > 0) {
                if (this.field1932) {
                    label125: {
                        if (this.field1937 < 0) {
                            if (this.field1940 >= var3) {
                                return;
                            }
                            this.field1940 = var3 + var3 - 1 - this.field1940;
                            this.field1937 = -this.field1937;
                            if (--this.field1931 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1940 < var4) {
                                return;
                            }
                            this.field1940 = var4 + var4 - 1 - this.field1940;
                            this.field1937 = -this.field1937;
                            if (--this.field1931 == 0) {
                                break;
                            }
                            if (this.field1940 >= var3) {
                                return;
                            }
                            this.field1940 = var3 + var3 - 1 - this.field1940;
                            this.field1937 = -this.field1937;
                        } while (--this.field1931 != 0);
                    }
                } else if (this.field1937 < 0) {
                    if (this.field1940 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1940) / var6;
                    if (var7 < this.field1931) {
                        this.field1940 += var6 * var7;
                        this.field1931 -= var7;
                        return;
                    }
                    this.field1940 += this.field1931 * var6;
                    this.field1931 = 0;
                } else {
                    if (this.field1940 < var4) {
                        return;
                    }
                    int var8 = (this.field1940 - var3) / var6;
                    if (var8 < this.field1931) {
                        this.field1940 -= var6 * var8;
                        this.field1931 -= var8;
                        return;
                    }
                    this.field1940 -= this.field1931 * var6;
                    this.field1931 = 0;
                }
            }
            if (this.field1937 < 0) {
                if (this.field1940 < 0) {
                    this.field1940 = -1;
                    this.method643();
                    this.method1009((byte) 64);
                    return;
                }
            } else if (this.field1940 >= var5) {
                this.field1940 = var5;
                this.method643();
                this.method1009((byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public final synchronized void method655(int arg0) {
        this.method666(arg0 << 6, this.method662());
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([III)V")
    public final synchronized void method120(int[] arg0, int arg1, int arg2) {
        if (this.field1930 == 0 && this.field1933 == 0) {
            this.method104(arg2);
        } else {
            class83 var4 = (class83) super.field1724;
            int var5 = this.field1929 << 8;
            int var6 = this.field1928 << 8;
            int var7 = var4.field2071.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1931 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1940 < 0) {
                if (this.field1937 <= 0) {
                    this.method643();
                    this.method1009((byte) 74);
                    return;
                }
                this.field1940 = 0;
            }
            if (this.field1940 >= var7) {
                if (this.field1937 >= 0) {
                    this.method643();
                    this.method1009((byte) 83);
                    return;
                }
                this.field1940 = var7 - 1;
            }
            if (this.field1931 < 0) {
                if (this.field1932) {
                    if (this.field1937 < 0) {
                        var9 = this.method672(arg0, arg1, var5, var10, var4.field2071[this.field1929]);
                        if (this.field1940 >= var5) {
                            return;
                        }
                        this.field1940 = var5 + var5 - 1 - this.field1940;
                        this.field1937 = -this.field1937;
                    }
                    while (true) {
                        int var11 = this.method668(arg0, var9, var6, var10, var4.field2071[this.field1928 - 1]);
                        if (this.field1940 < var6) {
                            return;
                        }
                        this.field1940 = var6 + var6 - 1 - this.field1940;
                        this.field1937 = -this.field1937;
                        var9 = this.method672(arg0, var11, var5, var10, var4.field2071[this.field1929]);
                        if (this.field1940 >= var5) {
                            return;
                        }
                        this.field1940 = var5 + var5 - 1 - this.field1940;
                        this.field1937 = -this.field1937;
                    }
                } else if (this.field1937 < 0) {
                    while (true) {
                        var9 = this.method672(arg0, var9, var5, var10, var4.field2071[this.field1928 - 1]);
                        if (this.field1940 >= var5) {
                            return;
                        }
                        this.field1940 = var6 - 1 - (var6 - 1 - this.field1940) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method668(arg0, var9, var6, var10, var4.field2071[this.field1929]);
                        if (this.field1940 < var6) {
                            return;
                        }
                        this.field1940 = (this.field1940 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1931 > 0) {
                    if (this.field1932) {
                        label130: {
                            if (this.field1937 < 0) {
                                var9 = this.method672(arg0, arg1, var5, var10, var4.field2071[this.field1929]);
                                if (this.field1940 >= var5) {
                                    return;
                                }
                                this.field1940 = var5 + var5 - 1 - this.field1940;
                                this.field1937 = -this.field1937;
                                if (--this.field1931 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method668(arg0, var9, var6, var10, var4.field2071[this.field1928 - 1]);
                                if (this.field1940 < var6) {
                                    return;
                                }
                                this.field1940 = var6 + var6 - 1 - this.field1940;
                                this.field1937 = -this.field1937;
                                if (--this.field1931 == 0) {
                                    break;
                                }
                                var9 = this.method672(arg0, var9, var5, var10, var4.field2071[this.field1929]);
                                if (this.field1940 >= var5) {
                                    return;
                                }
                                this.field1940 = var5 + var5 - 1 - this.field1940;
                                this.field1937 = -this.field1937;
                            } while (--this.field1931 != 0);
                        }
                    } else if (this.field1937 < 0) {
                        while (true) {
                            var9 = this.method672(arg0, var9, var5, var10, var4.field2071[this.field1928 - 1]);
                            if (this.field1940 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1940) / var8;
                            if (var12 >= this.field1931) {
                                this.field1940 += this.field1931 * var8;
                                this.field1931 = 0;
                                break;
                            }
                            this.field1940 += var8 * var12;
                            this.field1931 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method668(arg0, var9, var6, var10, var4.field2071[this.field1929]);
                            if (this.field1940 < var6) {
                                return;
                            }
                            int var13 = (this.field1940 - var5) / var8;
                            if (var13 >= this.field1931) {
                                this.field1940 -= this.field1931 * var8;
                                this.field1931 = 0;
                                break;
                            }
                            this.field1940 -= var8 * var13;
                            this.field1931 -= var13;
                        }
                    }
                }
                if (this.field1937 < 0) {
                    this.method672(arg0, var9, 0, var10, 0);
                    if (this.field1940 < 0) {
                        this.field1940 = -1;
                        this.method643();
                        this.method1009((byte) 62);
                        return;
                    }
                } else {
                    this.method668(arg0, var9, var7, var10, 0);
                    if (this.field1940 >= var7) {
                        this.field1940 = var7;
                        this.method643();
                        this.method1009((byte) 54);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method656(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
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
        arg11.field1940 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()I")
    public final int method546() {
        int var1 = this.field1938 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1931 == 0) {
            var2 -= this.field1940 * var2 / (((class83) super.field1724).field2071.length << 8);
        } else if (this.field1931 >= 0) {
            var2 -= this.field1929 * var2 / ((class83) super.field1724).field2071.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIIIIILlc;II)I")
    private static final int method657(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class79 arg13, int arg14, int arg15) {
        arg13.field1938 -= arg13.field1936 * arg5;
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
        arg13.field1938 += arg13.field1936 * var22;
        arg13.field1939 = arg6;
        arg13.field1941 = arg7;
        arg13.field1940 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
    private static final int method658(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()I")
    public final int method113() {
        return this.field1930 == 0 && this.field1933 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lm;II)Llc;")
    public static final class79 method659(class83 arg0, int arg1, int arg2) {
        return arg0.field2071 != null && arg0.field2071.length != 0 ? new class79(arg0, (int) ((long) arg0.field2073 * 256L * (long) arg1 / (long) (class14.field318 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIILlc;II)I")
    private static final int method660(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10, int arg11, int arg12) {
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
        arg10.field1940 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)I")
    private static final int method661(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "()I")
    public final synchronized int method662() {
        return this.field1934 < 0 ? -1 : this.field1934;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public final synchronized void method663(int arg0) {
        this.field1931 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()Lkb;")
    public final class71 method87() {
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I[B[IIIIIIIILlc;)I")
    private static final int method664(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10) {
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
        arg10.field1940 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "()Z")
    public final boolean method665() {
        return this.field1933 != 0;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
    private final synchronized void method666(int arg0, int arg1) {
        this.field1930 = arg0;
        this.field1934 = arg1;
        this.field1933 = 0;
        this.method674();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B[IIIIIIIIIILlc;)I")
    private static final int method667(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class79 arg12) {
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
        arg12.field1938 += (var19 - arg4) * arg12.field1936;
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
        arg12.field1939 = var15 >> 2;
        arg12.field1941 = var16 >> 2;
        arg12.field1940 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)I")
    private final int method668(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1933 <= 0) {
                if (this.field1937 == 256 && (this.field1940 & 255) == 0) {
                    if (class144.field3258) {
                        return method651(0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, 0, arg3, arg2, this);
                    }
                    return method638(((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, 0, arg3, arg2, this);
                }
                if (class144.field3258) {
                    return method652(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, 0, arg3, arg2, this, this.field1937, arg4);
                }
                return method639(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, 0, arg3, arg2, this, this.field1937, arg4);
            }
            int var6 = this.field1933 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1933 += arg1;
            if (this.field1937 == 256 && (this.field1940 & 255) == 0) {
                if (class144.field3258) {
                    arg1 = method667(0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, this.field1942, this.field1935, 0, var6, arg2, this);
                } else {
                    arg1 = method673(((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, this.field1936, 0, var6, arg2, this);
                }
            } else if (class144.field3258) {
                arg1 = method647(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, this.field1942, this.field1935, 0, var6, arg2, this, this.field1937, arg4);
            } else {
                arg1 = method648(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, this.field1936, 0, var6, arg2, this, this.field1937, arg4);
            }
            this.field1933 -= arg1;
            if (this.field1933 != 0) {
                return arg1;
            }
        } while (!this.method640());
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I[B[IIIIIIIIIILlc;)I")
    private static final int method669(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class79 arg12) {
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
        arg12.field1938 += (var19 - arg4) * arg12.field1936;
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
        arg12.field1939 = var15 >> 2;
        arg12.field1941 = var16 >> 2;
        arg12.field1940 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "()Z")
    public final boolean method670() {
        return this.field1940 < 0 || this.field1940 >= ((class83) super.field1724).field2071.length << 8;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public final synchronized void method671(int arg0) {
        int var2 = ((class83) super.field1724).field2071.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1940 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([IIIII)I")
    private final int method672(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1933 <= 0) {
                if (this.field1937 == -256 && (this.field1940 & 255) == 0) {
                    if (class144.field3258) {
                        return method664(0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, 0, arg3, arg2, this);
                    }
                    return method676(((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, 0, arg3, arg2, this);
                }
                if (class144.field3258) {
                    return method656(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, 0, arg3, arg2, this, this.field1937, arg4);
                }
                return method660(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, 0, arg3, arg2, this, this.field1937, arg4);
            }
            int var6 = this.field1933 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1933 += arg1;
            if (this.field1937 == -256 && (this.field1940 & 255) == 0) {
                if (class144.field3258) {
                    arg1 = method669(0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, this.field1942, this.field1935, 0, var6, arg2, this);
                } else {
                    arg1 = method644(((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, this.field1936, 0, var6, arg2, this);
                }
            } else if (class144.field3258) {
                arg1 = method657(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1939, this.field1941, this.field1942, this.field1935, 0, var6, arg2, this, this.field1937, arg4);
            } else {
                arg1 = method646(0, 0, ((class83) super.field1724).field2071, arg0, this.field1940, arg1, this.field1938, this.field1936, 0, var6, arg2, this, this.field1937, arg4);
            }
            this.field1933 -= arg1;
            if (this.field1933 != 0) {
                return arg1;
            }
        } while (!this.method640());
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B[IIIIIIIILlc;)I")
    private static final int method673(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class79 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1939 += (var14 - arg3) * arg9.field1942;
        arg9.field1941 += (var14 - arg3) * arg9.field1935;
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
        arg9.field1938 = var12 >> 2;
        arg9.field1940 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "()V")
    private final void method674() {
        this.field1938 = this.field1930;
        this.field1939 = method658(this.field1930, this.field1934);
        this.field1941 = method661(this.field1930, this.field1934);
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
    private final synchronized void method675(int arg0) {
        this.method666(arg0, this.method662());
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B[IIIIIIILlc;)I")
    private static final int method676(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8) {
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
        arg8.field1940 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V")
    public final synchronized void method677(int arg0) {
        if (arg0 == 0) {
            this.method675(0);
            this.method1009((byte) 62);
        } else if (this.field1939 == 0 && this.field1941 == 0) {
            this.field1933 = 0;
            this.field1930 = 0;
            this.field1938 = 0;
            this.method1009((byte) 60);
        } else {
            int var2 = -this.field1938;
            if (this.field1938 > var2) {
                var2 = this.field1938;
            }
            if (-this.field1939 > var2) {
                var2 = -this.field1939;
            }
            if (this.field1939 > var2) {
                var2 = this.field1939;
            }
            if (-this.field1941 > var2) {
                var2 = -this.field1941;
            }
            if (this.field1941 > var2) {
                var2 = this.field1941;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1933 = arg0;
            this.field1930 = Integer.MIN_VALUE;
            this.field1936 = -this.field1938 / arg0;
            this.field1942 = -this.field1939 / arg0;
            this.field1935 = -this.field1941 / arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lm;II)V")
    private class79(class83 arg0, int arg1, int arg2) {
        super.field1724 = arg0;
        this.field1929 = arg0.field2074;
        this.field1928 = arg0.field2072;
        this.field1932 = arg0.field2070;
        this.field1937 = arg1;
        this.field1930 = arg2;
        this.field1934 = 8192;
        this.field1940 = 0;
        this.method674();
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lm;III)V")
    private class79(class83 arg0, int arg1, int arg2, int arg3) {
        super.field1724 = arg0;
        this.field1929 = arg0.field2074;
        this.field1928 = arg0.field2072;
        this.field1932 = arg0.field2070;
        this.field1937 = arg1;
        this.field1930 = arg2;
        this.field1934 = arg3;
        this.field1940 = 0;
        this.method674();
    }
}
