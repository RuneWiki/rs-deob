import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class316 extends class244 {

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    private int field4895;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "Z")
    private boolean field4900;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    private int field4905;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    private int field4896;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    private int field4898;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    private int field4901;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    private int field4904;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    private int field4906;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    private int field4907;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIIILhg;II)I", line = 3)
    private static final int method2165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class316 arg11, int arg12, int arg13) {
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
        arg11.field4896 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()Lmd;", line = 37)
    public final class244 method142() {
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B[IIIIIIIILhg;)I", line = 40)
    private static final int method2166(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class316 arg10) {
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
        arg10.field4896 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIILhg;II)I", line = 82)
    private static final int method2167(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class316 arg10, int arg11, int arg12) {
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
        arg10.field4896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIIILhg;II)I", line = 108)
    private static final int method2168(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class316 arg11, int arg12, int arg13) {
        arg11.field4907 -= arg11.field4901 * arg5;
        arg11.field4894 -= arg11.field4898 * arg5;
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
        arg11.field4907 += arg11.field4901 * arg5;
        arg11.field4894 += arg11.field4898 * arg5;
        arg11.field4897 = arg6;
        arg11.field4896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII)I", line = 142)
    private final int method2169(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4906 > 0) {
                int var6 = this.field4906 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4906 += arg1;
                if (this.field4905 == -256 && (this.field4896 & 0xFF) == 0) {
                    if (class325.field5020) {
                        arg1 = method2189(0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, this.field4901, this.field4898, 0, var6, arg2, this);
                    } else {
                        arg1 = method2171(((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, this.field4904, 0, var6, arg2, this);
                    }
                } else if (class325.field5020) {
                    arg1 = method2185(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, this.field4901, this.field4898, 0, var6, arg2, this, this.field4905, arg4);
                } else {
                    arg1 = method2168(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, this.field4904, 0, var6, arg2, this, this.field4905, arg4);
                }
                this.field4906 -= arg1;
                if (this.field4906 != 0) {
                    return arg1;
                }
                if (!this.method2174()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4905 == -256 && (this.field4896 & 0xFF) == 0) {
                if (class325.field5020) {
                    return method2166(0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, 0, arg3, arg2, this);
                }
                return method2178(((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, 0, arg3, arg2, this);
            }
            if (class325.field5020) {
                return method2165(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, 0, arg3, arg2, this, this.field4905, arg4);
            }
            return method2176(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, 0, arg3, arg2, this, this.field4905, arg4);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 197)
    public final synchronized void method2170(int arg0, int arg1) {
        this.method2188(arg0, arg1, this.method2184());
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([B[IIIIIIIILhg;)I", line = 201)
    private static final int method2171(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class316 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4907 += (var14 - arg3) * arg9.field4901;
        arg9.field4894 += (var14 - arg3) * arg9.field4898;
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
        arg9.field4897 = var12 >> 2;
        arg9.field4896 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()I", line = 236)
    public final int method1681() {
        int var1 = this.field4897 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4893 == 0) {
            var2 -= this.field4896 * var2 / (((class266) this.field3701).field4145.length << 8);
        } else if (this.field4893 >= 0) {
            var2 -= this.field4903 * var2 / ((class266) this.field3701).field4145.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I[B[IIIIIIIILhg;)I", line = 248)
    private static final int method2172(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class316 arg10) {
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
        arg10.field4896 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V", line = 287)
    public final synchronized void method2173(int arg0) {
        this.method2186(arg0 << 6, this.method2184());
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "()Z", line = 293)
    private final boolean method2174() {
        int var1 = this.field4902;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2197(var1, this.field4899);
            var2 = method2191(var1, this.field4899);
        }
        if (this.field4897 != var1 || this.field4907 != var3 || this.field4894 != var2) {
            if (this.field4897 < var1) {
                this.field4904 = 1;
                this.field4906 = var1 - this.field4897;
            } else if (this.field4897 > var1) {
                this.field4904 = -1;
                this.field4906 = this.field4897 - var1;
            } else {
                this.field4904 = 0;
            }
            if (this.field4907 < var3) {
                this.field4901 = 1;
                if (this.field4906 == 0 || this.field4906 > var3 - this.field4907) {
                    this.field4906 = var3 - this.field4907;
                }
            } else if (this.field4907 > var3) {
                this.field4901 = -1;
                if (this.field4906 == 0 || this.field4906 > this.field4907 - var3) {
                    this.field4906 = this.field4907 - var3;
                }
            } else {
                this.field4901 = 0;
            }
            if (this.field4894 < var2) {
                this.field4898 = 1;
                if (this.field4906 == 0 || this.field4906 > var2 - this.field4894) {
                    this.field4906 = var2 - this.field4894;
                }
            } else if (this.field4894 > var2) {
                this.field4898 = -1;
                if (this.field4906 == 0 || this.field4906 > this.field4894 - var2) {
                    this.field4906 = this.field4894 - var2;
                }
            } else {
                this.field4898 = 0;
            }
            return false;
        } else if (this.field4902 == Integer.MIN_VALUE) {
            this.field4902 = 0;
            this.field4897 = this.field4907 = this.field4894 = 0;
            this.method39(10717);
            return true;
        } else {
            this.method2195();
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 381)
    public final synchronized void method2175(int arg0) {
        int var2 = ((class266) this.field3701).field4145.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4896 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIILhg;II)I", line = 391)
    private static final int method2176(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class316 arg10, int arg11, int arg12) {
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
        arg10.field4896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II[B[IIIIIIIILhg;II)I", line = 417)
    private static final int method2177(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class316 arg11, int arg12, int arg13) {
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
        arg11.field4896 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([B[IIIIIIILhg;)I", line = 450)
    private static final int method2178(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class316 arg8) {
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
        arg8.field4896 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B[IIIIIIIIIILhg;)I", line = 476)
    private static final int method2179(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class316 arg12) {
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
        arg12.field4897 += (var19 - arg4) * arg12.field4904;
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
        arg12.field4907 = var15 >> 2;
        arg12.field4894 = var16 >> 2;
        arg12.field4896 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V", line = 529)
    public final synchronized void method2180(int arg0) {
        this.field4893 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lid;II)Lhg;", line = 534)
    public static final class316 method2181(class266 arg0, int arg1, int arg2) {
        return arg0.field4145 == null || arg0.field4145.length == 0 ? null : new class316(arg0, (int) ((long) arg0.field4143 * 256L * (long) arg1 / (long) (class260.field4009 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([B[IIIIIIILhg;)I", line = 540)
    private static final int method2182(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class316 arg8) {
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
        arg8.field4896 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V", line = 566)
    private final synchronized void method2183(int arg0) {
        this.method2186(arg0, this.method2184());
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()I", line = 570)
    public final synchronized int method2184() {
        return this.field4899 < 0 ? -1 : this.field4899;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIIIIILhg;II)I", line = 574)
    private static final int method2185(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class316 arg13, int arg14, int arg15) {
        arg13.field4897 -= arg13.field4904 * arg5;
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
        arg13.field4897 += arg13.field4904 * var26;
        arg13.field4907 = arg6;
        arg13.field4894 = arg7;
        arg13.field4896 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()Lmd;", line = 615)
    public final class244 method145() {
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V", line = 618)
    private final synchronized void method2186(int arg0, int arg1) {
        this.field4902 = arg0;
        this.field4899 = arg1;
        this.field4906 = 0;
        this.method2195();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 625)
    public final synchronized void method2187(boolean arg0) {
        this.field4905 = (this.field4905 >>> 31) + (this.field4905 ^ this.field4905 >> 31);
        if (arg0) {
            this.field4905 = -this.field4905;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V", line = 632)
    public final synchronized void method2188(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2186(arg1, arg2);
            return;
        }
        int var4 = method2197(arg1, arg2);
        int var5 = method2191(arg1, arg2);
        if (this.field4907 == var4 && this.field4894 == var5) {
            this.field4906 = 0;
            return;
        }
        int var6 = arg1 - this.field4897;
        if (this.field4897 - arg1 > var6) {
            var6 = this.field4897 - arg1;
        }
        if (var4 - this.field4907 > var6) {
            var6 = var4 - this.field4907;
        }
        if (this.field4907 - var4 > var6) {
            var6 = this.field4907 - var4;
        }
        if (var5 - this.field4894 > var6) {
            var6 = var5 - this.field4894;
        }
        if (this.field4894 - var5 > var6) {
            var6 = this.field4894 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4906 = arg0;
        this.field4902 = arg1;
        this.field4899 = arg2;
        this.field4904 = (arg1 - this.field4897) / arg0;
        this.field4901 = (var4 - this.field4907) / arg0;
        this.field4898 = (var5 - this.field4894) / arg0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([III)V", line = 678)
    public final synchronized void method140(int[] arg0, int arg1, int arg2) {
        if (this.field4902 == 0 && this.field4906 == 0) {
            this.method149(arg2);
            return;
        }
        class266 var4 = (class266) this.field3701;
        int var5 = this.field4903 << 8;
        int var6 = this.field4895 << 8;
        int var7 = var4.field4145.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4893 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4896 < 0) {
            if (this.field4905 <= 0) {
                this.method2199();
                this.method39(10717);
                return;
            }
            this.field4896 = 0;
        }
        if (this.field4896 >= var7) {
            if (this.field4905 >= 0) {
                this.method2199();
                this.method39(10717);
                return;
            }
            this.field4896 = var7 - 1;
        }
        if (this.field4893 >= 0) {
            if (this.field4893 > 0) {
                if (this.field4900) {
                    label131: {
                        if (this.field4905 < 0) {
                            var9 = this.method2169(arg0, arg1, var5, var10, var4.field4145[this.field4903]);
                            if (this.field4896 >= var5) {
                                return;
                            }
                            this.field4896 = var5 + var5 - this.field4896 - 1;
                            this.field4905 = -this.field4905;
                            if (--this.field4893 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2200(arg0, var9, var6, var10, var4.field4145[this.field4895 - 1]);
                            if (this.field4896 < var6) {
                                return;
                            }
                            this.field4896 = var6 + var6 - this.field4896 - 1;
                            this.field4905 = -this.field4905;
                            if (--this.field4893 == 0) {
                                break;
                            }
                            var9 = this.method2169(arg0, var9, var5, var10, var4.field4145[this.field4903]);
                            if (this.field4896 >= var5) {
                                return;
                            }
                            this.field4896 = var5 + var5 - this.field4896 - 1;
                            this.field4905 = -this.field4905;
                        } while (--this.field4893 != 0);
                    }
                } else if (this.field4905 < 0) {
                    while (true) {
                        var9 = this.method2169(arg0, var9, var5, var10, var4.field4145[this.field4895 - 1]);
                        if (this.field4896 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4896 - 1) / var8;
                        if (var12 >= this.field4893) {
                            this.field4896 += this.field4893 * var8;
                            this.field4893 = 0;
                            break;
                        }
                        this.field4896 += var8 * var12;
                        this.field4893 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2200(arg0, var9, var6, var10, var4.field4145[this.field4903]);
                        if (this.field4896 < var6) {
                            return;
                        }
                        int var13 = (this.field4896 - var5) / var8;
                        if (var13 >= this.field4893) {
                            this.field4896 -= this.field4893 * var8;
                            this.field4893 = 0;
                            break;
                        }
                        this.field4896 -= var8 * var13;
                        this.field4893 -= var13;
                    }
                }
            }
            if (this.field4905 < 0) {
                this.method2169(arg0, var9, 0, var10, 0);
                if (this.field4896 < 0) {
                    this.field4896 = -1;
                    this.method2199();
                    this.method39(10717);
                }
            } else {
                this.method2200(arg0, var9, var7, var10, 0);
                if (this.field4896 >= var7) {
                    this.field4896 = var7;
                    this.method2199();
                    this.method39(10717);
                }
            }
        } else if (this.field4900) {
            if (this.field4905 < 0) {
                var9 = this.method2169(arg0, arg1, var5, var10, var4.field4145[this.field4903]);
                if (this.field4896 >= var5) {
                    return;
                }
                this.field4896 = var5 + var5 - this.field4896 - 1;
                this.field4905 = -this.field4905;
            }
            while (true) {
                int var11 = this.method2200(arg0, var9, var6, var10, var4.field4145[this.field4895 - 1]);
                if (this.field4896 < var6) {
                    return;
                }
                this.field4896 = var6 + var6 - this.field4896 - 1;
                this.field4905 = -this.field4905;
                var9 = this.method2169(arg0, var11, var5, var10, var4.field4145[this.field4903]);
                if (this.field4896 >= var5) {
                    return;
                }
                this.field4896 = var5 + var5 - this.field4896 - 1;
                this.field4905 = -this.field4905;
            }
        } else if (this.field4905 < 0) {
            while (true) {
                var9 = this.method2169(arg0, var9, var5, var10, var4.field4145[this.field4895 - 1]);
                if (this.field4896 >= var5) {
                    return;
                }
                this.field4896 = var6 - (var6 - 1 - this.field4896) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2200(arg0, var9, var6, var10, var4.field4145[this.field4903]);
                if (this.field4896 < var6) {
                    return;
                }
                this.field4896 = (this.field4896 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I[B[IIIIIIIIIILhg;)I", line = 915)
    private static final int method2189(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class316 arg12) {
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
        arg12.field4897 += (var19 - arg4) * arg12.field4904;
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
        arg12.field4907 = var15 >> 2;
        arg12.field4894 = var16 >> 2;
        arg12.field4896 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "()I", line = 970)
    public final synchronized int method2190() {
        return this.field4905 < 0 ? -this.field4905 : this.field4905;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)I", line = 973)
    private static final int method2191(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(I)V", line = 978)
    public final synchronized void method2192(int arg0) {
        if (this.field4905 < 0) {
            this.field4905 = -arg0;
        } else {
            this.field4905 = arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIIIIILhg;II)I", line = 986)
    private static final int method2193(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class316 arg13, int arg14, int arg15) {
        arg13.field4897 -= arg13.field4904 * arg5;
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
        arg13.field4897 += arg13.field4904 * var27;
        arg13.field4907 = arg6;
        arg13.field4894 = arg7;
        arg13.field4896 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V", line = 1028)
    public final synchronized void method149(int arg0) {
        if (this.field4906 > 0) {
            if (arg0 >= this.field4906) {
                if (this.field4902 == Integer.MIN_VALUE) {
                    this.field4902 = 0;
                    this.field4897 = this.field4907 = this.field4894 = 0;
                    this.method39(10717);
                    arg0 = this.field4906;
                }
                this.field4906 = 0;
                this.method2195();
            } else {
                this.field4897 += this.field4904 * arg0;
                this.field4907 += this.field4901 * arg0;
                this.field4894 += this.field4898 * arg0;
                this.field4906 -= arg0;
            }
        }
        class266 var2 = (class266) this.field3701;
        int var3 = this.field4903 << 8;
        int var4 = this.field4895 << 8;
        int var5 = var2.field4145.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4893 = 0;
        }
        if (this.field4896 < 0) {
            if (this.field4905 <= 0) {
                this.method2199();
                this.method39(10717);
                return;
            }
            this.field4896 = 0;
        }
        if (this.field4896 >= var5) {
            if (this.field4905 >= 0) {
                this.method2199();
                this.method39(10717);
                return;
            }
            this.field4896 = var5 - 1;
        }
        this.field4896 += this.field4905 * arg0;
        if (this.field4893 >= 0) {
            if (this.field4893 > 0) {
                if (this.field4900) {
                    label121: {
                        if (this.field4905 < 0) {
                            if (this.field4896 >= var3) {
                                return;
                            }
                            this.field4896 = var3 + var3 - this.field4896 - 1;
                            this.field4905 = -this.field4905;
                            if (--this.field4893 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4896 < var4) {
                                return;
                            }
                            this.field4896 = var4 + var4 - this.field4896 - 1;
                            this.field4905 = -this.field4905;
                            if (--this.field4893 == 0) {
                                break;
                            }
                            if (this.field4896 >= var3) {
                                return;
                            }
                            this.field4896 = var3 + var3 - this.field4896 - 1;
                            this.field4905 = -this.field4905;
                        } while (--this.field4893 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4905 < 0) {
                            if (this.field4896 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4896 - 1) / var6;
                            if (var7 >= this.field4893) {
                                this.field4896 += this.field4893 * var6;
                                this.field4893 = 0;
                                break label153;
                            }
                            this.field4896 += var6 * var7;
                            this.field4893 -= var7;
                        } else if (this.field4896 >= var4) {
                            int var8 = (this.field4896 - var3) / var6;
                            if (var8 >= this.field4893) {
                                this.field4896 -= this.field4893 * var6;
                                this.field4893 = 0;
                                break label153;
                            }
                            this.field4896 -= var6 * var8;
                            this.field4893 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4905 < 0) {
                if (this.field4896 < 0) {
                    this.field4896 = -1;
                    this.method2199();
                    this.method39(10717);
                }
            } else if (this.field4896 >= var5) {
                this.field4896 = var5;
                this.method2199();
                this.method39(10717);
            }
        } else if (this.field4900) {
            if (this.field4905 < 0) {
                if (this.field4896 >= var3) {
                    return;
                }
                this.field4896 = var3 + var3 - this.field4896 - 1;
                this.field4905 = -this.field4905;
            }
            while (this.field4896 >= var4) {
                this.field4896 = var4 + var4 - this.field4896 - 1;
                this.field4905 = -this.field4905;
                if (this.field4896 >= var3) {
                    return;
                }
                this.field4896 = var3 + var3 - this.field4896 - 1;
                this.field4905 = -this.field4905;
            }
        } else if (this.field4905 < 0) {
            if (this.field4896 >= var3) {
                return;
            }
            this.field4896 = var4 - (var4 - 1 - this.field4896) % var6 - 1;
        } else if (this.field4896 >= var4) {
            this.field4896 = (this.field4896 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()I", line = 1247)
    public final int method146() {
        return this.field4902 == 0 && this.field4906 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)V", line = 1253)
    public final synchronized void method2194(int arg0) {
        if (arg0 == 0) {
            this.method2183(0);
            this.method39(10717);
        } else if (this.field4907 == 0 && this.field4894 == 0) {
            this.field4906 = 0;
            this.field4902 = 0;
            this.field4897 = 0;
            this.method39(10717);
        } else {
            int var2 = -this.field4897;
            if (this.field4897 > var2) {
                var2 = this.field4897;
            }
            if (-this.field4907 > var2) {
                var2 = -this.field4907;
            }
            if (this.field4907 > var2) {
                var2 = this.field4907;
            }
            if (-this.field4894 > var2) {
                var2 = -this.field4894;
            }
            if (this.field4894 > var2) {
                var2 = this.field4894;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4906 = arg0;
            this.field4902 = Integer.MIN_VALUE;
            this.field4904 = -this.field4897 / arg0;
            this.field4901 = -this.field4907 / arg0;
            this.field4898 = -this.field4894 / arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "()V", line = 1300)
    private final void method2195() {
        this.field4897 = this.field4902;
        this.field4907 = method2197(this.field4902, this.field4899);
        this.field4894 = method2191(this.field4902, this.field4899);
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "()Z", line = 1305)
    public final boolean method2196() {
        return this.field4906 != 0;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)I", line = 1308)
    private static final int method2197(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([B[IIIIIIIILhg;)I", line = 1311)
    private static final int method2198(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class316 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4907 += (var14 - arg3) * arg9.field4901;
        arg9.field4894 += (var14 - arg3) * arg9.field4898;
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
        arg9.field4897 = var12 >> 2;
        arg9.field4896 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "()V", line = 1345)
    private final void method2199() {
        if (this.field4906 == 0) {
            return;
        }
        if (this.field4902 == Integer.MIN_VALUE) {
            this.field4902 = 0;
        }
        this.field4906 = 0;
        this.method2195();
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([IIIII)I", line = 1356)
    private final int method2200(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4906 > 0) {
                int var6 = this.field4906 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4906 += arg1;
                if (this.field4905 == 256 && (this.field4896 & 0xFF) == 0) {
                    if (class325.field5020) {
                        arg1 = method2179(0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, this.field4901, this.field4898, 0, var6, arg2, this);
                    } else {
                        arg1 = method2198(((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, this.field4904, 0, var6, arg2, this);
                    }
                } else if (class325.field5020) {
                    arg1 = method2193(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, this.field4901, this.field4898, 0, var6, arg2, this, this.field4905, arg4);
                } else {
                    arg1 = method2203(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, this.field4904, 0, var6, arg2, this, this.field4905, arg4);
                }
                this.field4906 -= arg1;
                if (this.field4906 != 0) {
                    return arg1;
                }
                if (!this.method2174()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4905 == 256 && (this.field4896 & 0xFF) == 0) {
                if (class325.field5020) {
                    return method2172(0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, 0, arg3, arg2, this);
                }
                return method2182(((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, 0, arg3, arg2, this);
            }
            if (class325.field5020) {
                return method2177(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4907, this.field4894, 0, arg3, arg2, this, this.field4905, arg4);
            }
            return method2167(0, 0, ((class266) this.field3701).field4145, arg0, this.field4896, arg1, this.field4897, 0, arg3, arg2, this, this.field4905, arg4);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lid;III)Lhg;", line = 1411)
    public static final class316 method2201(class266 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4145 == null || arg0.field4145.length == 0 ? null : new class316(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "()Z", line = 1418)
    public final boolean method2202() {
        return this.field4896 < 0 || this.field4896 >= ((class266) this.field3701).field4145.length << 8;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II[B[IIIIIIIILhg;II)I", line = 1421)
    private static final int method2203(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class316 arg11, int arg12, int arg13) {
        arg11.field4907 -= arg11.field4901 * arg5;
        arg11.field4894 -= arg11.field4898 * arg5;
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
        arg11.field4907 += arg11.field4901 * arg5;
        arg11.field4894 += arg11.field4898 * arg5;
        arg11.field4897 = arg6;
        arg11.field4896 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lid;II)V", line = 1455)
    private class316(class266 arg0, int arg1, int arg2) {
        this.field3701 = arg0;
        this.field4903 = arg0.field4147;
        this.field4895 = arg0.field4146;
        this.field4900 = arg0.field4144;
        this.field4905 = arg1;
        this.field4902 = arg2;
        this.field4899 = 8192;
        this.field4896 = 0;
        this.method2195();
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lid;III)V", line = 1466)
    private class316(class266 arg0, int arg1, int arg2, int arg3) {
        this.field3701 = arg0;
        this.field4903 = arg0.field4147;
        this.field4895 = arg0.field4146;
        this.field4900 = arg0.field4144;
        this.field4905 = arg1;
        this.field4902 = arg2;
        this.field4899 = arg3;
        this.field4896 = 0;
        this.method2195();
    }

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "()I", line = 1478)
    public final synchronized int method2204() {
        return this.field4902 == Integer.MIN_VALUE ? 0 : this.field4902;
    }
}
