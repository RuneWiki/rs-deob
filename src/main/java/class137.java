import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class137 extends class446 {

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "Z")
    private boolean field1899;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    private int field1900;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    private int field1897;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    private int field1891;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    private int field1893;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    private int field1894;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public final synchronized void method852(int arg0, int arg1) {
        this.method861(arg0, arg1, this.method885());
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public final synchronized void method853(int arg0) {
        if (arg0 == 0) {
            this.method859(0);
            this.method322(11);
        } else if (this.field1888 == 0 && this.field1894 == 0) {
            this.field1891 = 0;
            this.field1897 = 0;
            this.field1893 = 0;
            this.method322(11);
        } else {
            int var2 = -this.field1893;
            if (this.field1893 > var2) {
                var2 = this.field1893;
            }
            if (-this.field1888 > var2) {
                var2 = -this.field1888;
            }
            if (this.field1888 > var2) {
                var2 = this.field1888;
            }
            if (-this.field1894 > var2) {
                var2 = -this.field1894;
            }
            if (this.field1894 > var2) {
                var2 = this.field1894;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1891 = arg0;
            this.field1897 = Integer.MIN_VALUE;
            this.field1890 = -this.field1893 / arg0;
            this.field1887 = -this.field1888 / arg0;
            this.field1886 = -this.field1894 / arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([B[IIIIIIILod;)I")
    private static final int method854(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
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
        arg8.field1896 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()Z")
    private final boolean method855() {
        int var1 = this.field1897;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method862(var1, this.field1889);
            var2 = method892(var1, this.field1889);
        }
        if (this.field1893 == var1 && this.field1888 == var3 && this.field1894 == var2) {
            if (this.field1897 == Integer.MIN_VALUE) {
                this.field1897 = 0;
                this.field1893 = this.field1888 = this.field1894 = 0;
                this.method322(11);
                return true;
            } else {
                this.method888();
                return false;
            }
        } else {
            if (this.field1893 < var1) {
                this.field1890 = 1;
                this.field1891 = var1 - this.field1893;
            } else if (this.field1893 > var1) {
                this.field1890 = -1;
                this.field1891 = this.field1893 - var1;
            } else {
                this.field1890 = 0;
            }
            if (this.field1888 < var3) {
                this.field1887 = 1;
                if (this.field1891 == 0 || this.field1891 > var3 - this.field1888) {
                    this.field1891 = var3 - this.field1888;
                }
            } else if (this.field1888 > var3) {
                this.field1887 = -1;
                if (this.field1891 == 0 || this.field1891 > this.field1888 - var3) {
                    this.field1891 = this.field1888 - var3;
                }
            } else {
                this.field1887 = 0;
            }
            if (this.field1894 < var2) {
                this.field1886 = 1;
                if (this.field1891 == 0 || this.field1891 > var2 - this.field1894) {
                    this.field1891 = var2 - this.field1894;
                }
            } else if (this.field1894 > var2) {
                this.field1886 = -1;
                if (this.field1891 == 0 || this.field1891 > this.field1894 - var2) {
                    this.field1891 = this.field1894 - var2;
                }
            } else {
                this.field1886 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lig;II)Lod;")
    public static final class137 method856(class13 arg0, int arg1, int arg2) {
        return arg0.field209 != null && arg0.field209.length != 0 ? new class137(arg0, (int) ((long) arg0.field207 * 256L * (long) arg1 / (long) (class9.field153 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "()Z")
    public final boolean method857() {
        return this.field1891 != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[B[IIIIIIIIIILod;)I")
    private static final int method858(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class137 arg12) {
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
        arg12.field1893 += (var19 - arg4) * arg12.field1890;
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
        arg12.field1888 = var15 >> 2;
        arg12.field1894 = var16 >> 2;
        arg12.field1896 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
    private final synchronized void method859(int arg0) {
        this.method872(arg0, this.method885());
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([B[IIIIIIILod;)I")
    private static final int method860(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
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
        arg8.field1896 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
    public final synchronized void method861(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method872(arg1, arg2);
        } else {
            int var4 = method862(arg1, arg2);
            int var5 = method892(arg1, arg2);
            if (this.field1888 == var4 && this.field1894 == var5) {
                this.field1891 = 0;
            } else {
                int var6 = arg1 - this.field1893;
                if (this.field1893 - arg1 > var6) {
                    var6 = this.field1893 - arg1;
                }
                if (var4 - this.field1888 > var6) {
                    var6 = var4 - this.field1888;
                }
                if (this.field1888 - var4 > var6) {
                    var6 = this.field1888 - var4;
                }
                if (var5 - this.field1894 > var6) {
                    var6 = var5 - this.field1894;
                }
                if (this.field1894 - var5 > var6) {
                    var6 = this.field1894 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1891 = arg0;
                this.field1897 = arg1;
                this.field1889 = arg2;
                this.field1890 = (arg1 - this.field1893) / arg0;
                this.field1887 = (var4 - this.field1888) / arg0;
                this.field1886 = (var5 - this.field1894) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
    private static final int method862(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public final synchronized void method863(int arg0) {
        this.method872(arg0 << 6, this.method885());
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I[B[IIIIIIIIIILod;)I")
    private static final int method864(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class137 arg12) {
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
        arg12.field1893 += (var19 - arg4) * arg12.field1890;
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
        arg12.field1888 = var15 >> 2;
        arg12.field1894 = var16 >> 2;
        arg12.field1896 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public final synchronized void method865(boolean arg0) {
        this.field1900 = (this.field1900 >>> 31) + (this.field1900 ^ this.field1900 >> 31);
        if (arg0) {
            this.field1900 = -this.field1900;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()I")
    public final int method490() {
        return this.field1897 == 0 && this.field1891 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "()I")
    public final synchronized int method866() {
        return this.field1897 == Integer.MIN_VALUE ? 0 : this.field1897;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[B[IIIIIIIIIILod;II)I")
    private static final int method867(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class137 arg13, int arg14, int arg15) {
        arg13.field1893 -= arg13.field1890 * arg5;
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
        arg13.field1893 += arg13.field1890 * var22;
        arg13.field1888 = arg6;
        arg13.field1894 = arg7;
        arg13.field1896 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([B[IIIIIIIILod;)I")
    private static final int method868(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class137 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1888 += (var14 - arg3) * arg9.field1887;
        arg9.field1894 += (var14 - arg3) * arg9.field1886;
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
        arg9.field1893 = var12 >> 2;
        arg9.field1896 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
    public final synchronized void method869(int arg0) {
        int var2 = ((class13) super.field6542).field209.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1896 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[B[IIIIIIIILod;II)I")
    private static final int method870(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
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
        arg11.field1896 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[B[IIIIIIILod;II)I")
    private static final int method871(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10, int arg11, int arg12) {
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
        arg10.field1896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
    private final synchronized void method872(int arg0, int arg1) {
        this.field1897 = arg0;
        this.field1889 = arg1;
        this.field1891 = 0;
        this.method888();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([IIIII)I")
    private final int method873(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1891 <= 0) {
                if (this.field1900 == 256 && (this.field1896 & 255) == 0) {
                    if (class407.field6043) {
                        return method891(0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, 0, arg3, arg2, this);
                    }
                    return method854(((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, 0, arg3, arg2, this);
                }
                if (class407.field6043) {
                    return method870(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, 0, arg3, arg2, this, this.field1900, arg4);
                }
                return method882(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, 0, arg3, arg2, this, this.field1900, arg4);
            }
            int var6 = this.field1891 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1891 += arg1;
            if (this.field1900 == 256 && (this.field1896 & 255) == 0) {
                if (class407.field6043) {
                    arg1 = method864(0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, this.field1887, this.field1886, 0, var6, arg2, this);
                } else {
                    arg1 = method868(((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, this.field1890, 0, var6, arg2, this);
                }
            } else if (class407.field6043) {
                arg1 = method867(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, this.field1887, this.field1886, 0, var6, arg2, this, this.field1900, arg4);
            } else {
                arg1 = method890(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, this.field1890, 0, var6, arg2, this, this.field1900, arg4);
            }
            this.field1891 -= arg1;
            if (this.field1891 != 0) {
                return arg1;
            }
        } while (!this.method855());
        return arg3;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "()V")
    private final void method874() {
        if (this.field1891 != 0) {
            if (this.field1897 == Integer.MIN_VALUE) {
                this.field1897 = 0;
            }
            this.field1891 = 0;
            this.method888();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
    public final int method875() {
        int var1 = this.field1893 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1898 == 0) {
            var2 -= this.field1896 * var2 / (((class13) super.field6542).field209.length << 8);
        } else if (this.field1898 >= 0) {
            var2 -= this.field1895 * var2 / ((class13) super.field6542).field209.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "()Z")
    public final boolean method876() {
        return this.field1896 < 0 || this.field1896 >= ((class13) super.field6542).field209.length << 8;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()Lpl;")
    public final class446 method501() {
        return null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[B[IIIIIIIILod;)I")
    private static final int method877(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10) {
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
        arg10.field1896 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([III)V")
    public final synchronized void method495(int[] arg0, int arg1, int arg2) {
        if (this.field1897 == 0 && this.field1891 == 0) {
            this.method470(arg2);
        } else {
            class13 var4 = (class13) super.field6542;
            int var5 = this.field1895 << 8;
            int var6 = this.field1892 << 8;
            int var7 = var4.field209.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1898 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1896 < 0) {
                if (this.field1900 <= 0) {
                    this.method874();
                    this.method322(11);
                    return;
                }
                this.field1896 = 0;
            }
            if (this.field1896 >= var7) {
                if (this.field1900 >= 0) {
                    this.method874();
                    this.method322(11);
                    return;
                }
                this.field1896 = var7 - 1;
            }
            if (this.field1898 < 0) {
                if (this.field1899) {
                    if (this.field1900 < 0) {
                        var9 = this.method878(arg0, arg1, var5, var10, var4.field209[this.field1895]);
                        if (this.field1896 >= var5) {
                            return;
                        }
                        this.field1896 = var5 + var5 - 1 - this.field1896;
                        this.field1900 = -this.field1900;
                    }
                    while (true) {
                        int var11 = this.method873(arg0, var9, var6, var10, var4.field209[this.field1892 - 1]);
                        if (this.field1896 < var6) {
                            return;
                        }
                        this.field1896 = var6 + var6 - 1 - this.field1896;
                        this.field1900 = -this.field1900;
                        var9 = this.method878(arg0, var11, var5, var10, var4.field209[this.field1895]);
                        if (this.field1896 >= var5) {
                            return;
                        }
                        this.field1896 = var5 + var5 - 1 - this.field1896;
                        this.field1900 = -this.field1900;
                    }
                } else if (this.field1900 < 0) {
                    while (true) {
                        var9 = this.method878(arg0, var9, var5, var10, var4.field209[this.field1892 - 1]);
                        if (this.field1896 >= var5) {
                            return;
                        }
                        this.field1896 = var6 - 1 - (var6 - 1 - this.field1896) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method873(arg0, var9, var6, var10, var4.field209[this.field1895]);
                        if (this.field1896 < var6) {
                            return;
                        }
                        this.field1896 = (this.field1896 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1898 > 0) {
                    if (this.field1899) {
                        label130: {
                            if (this.field1900 < 0) {
                                var9 = this.method878(arg0, arg1, var5, var10, var4.field209[this.field1895]);
                                if (this.field1896 >= var5) {
                                    return;
                                }
                                this.field1896 = var5 + var5 - 1 - this.field1896;
                                this.field1900 = -this.field1900;
                                if (--this.field1898 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method873(arg0, var9, var6, var10, var4.field209[this.field1892 - 1]);
                                if (this.field1896 < var6) {
                                    return;
                                }
                                this.field1896 = var6 + var6 - 1 - this.field1896;
                                this.field1900 = -this.field1900;
                                if (--this.field1898 == 0) {
                                    break;
                                }
                                var9 = this.method878(arg0, var9, var5, var10, var4.field209[this.field1895]);
                                if (this.field1896 >= var5) {
                                    return;
                                }
                                this.field1896 = var5 + var5 - 1 - this.field1896;
                                this.field1900 = -this.field1900;
                            } while (--this.field1898 != 0);
                        }
                    } else if (this.field1900 < 0) {
                        while (true) {
                            var9 = this.method878(arg0, var9, var5, var10, var4.field209[this.field1892 - 1]);
                            if (this.field1896 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1896) / var8;
                            if (var12 >= this.field1898) {
                                this.field1896 += this.field1898 * var8;
                                this.field1898 = 0;
                                break;
                            }
                            this.field1896 += var8 * var12;
                            this.field1898 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method873(arg0, var9, var6, var10, var4.field209[this.field1895]);
                            if (this.field1896 < var6) {
                                return;
                            }
                            int var13 = (this.field1896 - var5) / var8;
                            if (var13 >= this.field1898) {
                                this.field1896 -= this.field1898 * var8;
                                this.field1898 = 0;
                                break;
                            }
                            this.field1896 -= var8 * var13;
                            this.field1898 -= var13;
                        }
                    }
                }
                if (this.field1900 < 0) {
                    this.method878(arg0, var9, 0, var10, 0);
                    if (this.field1896 < 0) {
                        this.field1896 = -1;
                        this.method874();
                        this.method322(11);
                        return;
                    }
                } else {
                    this.method873(arg0, var9, var7, var10, 0);
                    if (this.field1896 >= var7) {
                        this.field1896 = var7;
                        this.method874();
                        this.method322(11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([IIIII)I")
    private final int method878(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1891 <= 0) {
                if (this.field1900 == -256 && (this.field1896 & 255) == 0) {
                    if (class407.field6043) {
                        return method877(0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, 0, arg3, arg2, this);
                    }
                    return method860(((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, 0, arg3, arg2, this);
                }
                if (class407.field6043) {
                    return method884(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, 0, arg3, arg2, this, this.field1900, arg4);
                }
                return method871(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, 0, arg3, arg2, this, this.field1900, arg4);
            }
            int var6 = this.field1891 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1891 += arg1;
            if (this.field1900 == -256 && (this.field1896 & 255) == 0) {
                if (class407.field6043) {
                    arg1 = method858(0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, this.field1887, this.field1886, 0, var6, arg2, this);
                } else {
                    arg1 = method883(((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, this.field1890, 0, var6, arg2, this);
                }
            } else if (class407.field6043) {
                arg1 = method886(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1888, this.field1894, this.field1887, this.field1886, 0, var6, arg2, this, this.field1900, arg4);
            } else {
                arg1 = method880(0, 0, ((class13) super.field6542).field209, arg0, this.field1896, arg1, this.field1893, this.field1890, 0, var6, arg2, this, this.field1900, arg4);
            }
            this.field1891 -= arg1;
            if (this.field1891 != 0) {
                return arg1;
            }
        } while (!this.method855());
        return arg3;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V")
    public final synchronized void method879(int arg0) {
        if (this.field1900 < 0) {
            this.field1900 = -arg0;
        } else {
            this.field1900 = arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II[B[IIIIIIIILod;II)I")
    private static final int method880(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
        arg11.field1888 -= arg11.field1887 * arg5;
        arg11.field1894 -= arg11.field1886 * arg5;
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
        arg11.field1888 += arg11.field1887 * arg5;
        arg11.field1894 += arg11.field1886 * arg5;
        arg11.field1893 = arg6;
        arg11.field1896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "()I")
    public final synchronized int method881() {
        return this.field1900 < 0 ? -this.field1900 : this.field1900;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public final synchronized void method470(int arg0) {
        if (this.field1891 > 0) {
            if (arg0 >= this.field1891) {
                if (this.field1897 == Integer.MIN_VALUE) {
                    this.field1897 = 0;
                    this.field1893 = this.field1888 = this.field1894 = 0;
                    this.method322(11);
                    arg0 = this.field1891;
                }
                this.field1891 = 0;
                this.method888();
            } else {
                this.field1893 += this.field1890 * arg0;
                this.field1888 += this.field1887 * arg0;
                this.field1894 += this.field1886 * arg0;
                this.field1891 -= arg0;
            }
        }
        class13 var2 = (class13) super.field6542;
        int var3 = this.field1895 << 8;
        int var4 = this.field1892 << 8;
        int var5 = var2.field209.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1898 = 0;
        }
        if (this.field1896 < 0) {
            if (this.field1900 <= 0) {
                this.method874();
                this.method322(11);
                return;
            }
            this.field1896 = 0;
        }
        if (this.field1896 >= var5) {
            if (this.field1900 >= 0) {
                this.method874();
                this.method322(11);
                return;
            }
            this.field1896 = var5 - 1;
        }
        this.field1896 += this.field1900 * arg0;
        if (this.field1898 < 0) {
            if (!this.field1899) {
                if (this.field1900 < 0) {
                    if (this.field1896 < var3) {
                        this.field1896 = var4 - 1 - (var4 - 1 - this.field1896) % var6;
                    }
                } else if (this.field1896 >= var4) {
                    this.field1896 = (this.field1896 - var3) % var6 + var3;
                }
            } else {
                if (this.field1900 < 0) {
                    if (this.field1896 >= var3) {
                        return;
                    }
                    this.field1896 = var3 + var3 - 1 - this.field1896;
                    this.field1900 = -this.field1900;
                }
                while (this.field1896 >= var4) {
                    this.field1896 = var4 + var4 - 1 - this.field1896;
                    this.field1900 = -this.field1900;
                    if (this.field1896 >= var3) {
                        return;
                    }
                    this.field1896 = var3 + var3 - 1 - this.field1896;
                    this.field1900 = -this.field1900;
                }
            }
        } else {
            if (this.field1898 > 0) {
                if (this.field1899) {
                    label125: {
                        if (this.field1900 < 0) {
                            if (this.field1896 >= var3) {
                                return;
                            }
                            this.field1896 = var3 + var3 - 1 - this.field1896;
                            this.field1900 = -this.field1900;
                            if (--this.field1898 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1896 < var4) {
                                return;
                            }
                            this.field1896 = var4 + var4 - 1 - this.field1896;
                            this.field1900 = -this.field1900;
                            if (--this.field1898 == 0) {
                                break;
                            }
                            if (this.field1896 >= var3) {
                                return;
                            }
                            this.field1896 = var3 + var3 - 1 - this.field1896;
                            this.field1900 = -this.field1900;
                        } while (--this.field1898 != 0);
                    }
                } else if (this.field1900 < 0) {
                    if (this.field1896 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1896) / var6;
                    if (var7 < this.field1898) {
                        this.field1896 += var6 * var7;
                        this.field1898 -= var7;
                        return;
                    }
                    this.field1896 += this.field1898 * var6;
                    this.field1898 = 0;
                } else {
                    if (this.field1896 < var4) {
                        return;
                    }
                    int var8 = (this.field1896 - var3) / var6;
                    if (var8 < this.field1898) {
                        this.field1896 -= var6 * var8;
                        this.field1898 -= var8;
                        return;
                    }
                    this.field1896 -= this.field1898 * var6;
                    this.field1898 = 0;
                }
            }
            if (this.field1900 < 0) {
                if (this.field1896 < 0) {
                    this.field1896 = -1;
                    this.method874();
                    this.method322(11);
                    return;
                }
            } else if (this.field1896 >= var5) {
                this.field1896 = var5;
                this.method874();
                this.method322(11);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II[B[IIIIIIILod;II)I")
    private static final int method882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10, int arg11, int arg12) {
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
        arg10.field1896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([B[IIIIIIIILod;)I")
    private static final int method883(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class137 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1888 += (var14 - arg3) * arg9.field1887;
        arg9.field1894 += (var14 - arg3) * arg9.field1886;
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
        arg9.field1893 = var12 >> 2;
        arg9.field1896 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II[B[IIIIIIIILod;II)I")
    private static final int method884(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
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
        arg11.field1896 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "()I")
    public final synchronized int method885() {
        return this.field1889 < 0 ? -1 : this.field1889;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II[B[IIIIIIIIIILod;II)I")
    private static final int method886(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class137 arg13, int arg14, int arg15) {
        arg13.field1893 -= arg13.field1890 * arg5;
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
        arg13.field1893 += arg13.field1890 * var22;
        arg13.field1888 = arg6;
        arg13.field1894 = arg7;
        arg13.field1896 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(I)V")
    public final synchronized void method887(int arg0) {
        this.field1898 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "l", descriptor = "()V")
    private final void method888() {
        this.field1893 = this.field1897;
        this.field1888 = method862(this.field1897, this.field1889);
        this.field1894 = method892(this.field1897, this.field1889);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lig;III)Lod;")
    public static final class137 method889(class13 arg0, int arg1, int arg2, int arg3) {
        return arg0.field209 != null && arg0.field209.length != 0 ? new class137(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()Lpl;")
    public final class446 method469() {
        return null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lig;II)V")
    private class137(class13 arg0, int arg1, int arg2) {
        super.field6542 = arg0;
        this.field1895 = arg0.field206;
        this.field1892 = arg0.field208;
        this.field1899 = arg0.field210;
        this.field1900 = arg1;
        this.field1897 = arg2;
        this.field1889 = 8192;
        this.field1896 = 0;
        this.method888();
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(II[B[IIIIIIIILod;II)I")
    private static final int method890(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
        arg11.field1888 -= arg11.field1887 * arg5;
        arg11.field1894 -= arg11.field1886 * arg5;
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
        arg11.field1888 += arg11.field1887 * arg5;
        arg11.field1894 += arg11.field1886 * arg5;
        arg11.field1893 = arg6;
        arg11.field1896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I[B[IIIIIIIILod;)I")
    private static final int method891(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10) {
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
        arg10.field1896 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lig;III)V")
    private class137(class13 arg0, int arg1, int arg2, int arg3) {
        super.field6542 = arg0;
        this.field1895 = arg0.field206;
        this.field1892 = arg0.field208;
        this.field1899 = arg0.field210;
        this.field1900 = arg1;
        this.field1897 = arg2;
        this.field1889 = arg3;
        this.field1896 = 0;
        this.method888();
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(II)I")
    private static final int method892(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }
}
