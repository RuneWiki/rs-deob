import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class115 extends class24 {

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    private int field1882;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Z")
    private boolean field1880;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    private int field1891;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    private int field1893;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[B[IIIIIIILke;II)I", line = 4)
    private static final int method829(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10, int arg11, int arg12) {
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
        arg10.field1879 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()Lu;", line = 30)
    public final class24 method156() {
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V", line = 33)
    public final synchronized void method830(int arg0) {
        if (arg0 == 0) {
            this.method861(0);
            this.method2000(125);
        } else if (this.field1886 == 0 && this.field1890 == 0) {
            this.field1885 = 0;
            this.field1887 = 0;
            this.field1891 = 0;
            this.method2000(126);
        } else {
            int var2 = -this.field1891;
            if (this.field1891 > var2) {
                var2 = this.field1891;
            }
            if (-this.field1886 > var2) {
                var2 = -this.field1886;
            }
            if (this.field1886 > var2) {
                var2 = this.field1886;
            }
            if (-this.field1890 > var2) {
                var2 = -this.field1890;
            }
            if (this.field1890 > var2) {
                var2 = this.field1890;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1885 = arg0;
            this.field1887 = Integer.MIN_VALUE;
            this.field1884 = -this.field1891 / arg0;
            this.field1892 = -this.field1886 / arg0;
            this.field1888 = -this.field1890 / arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([B[IIIIIIILke;)I", line = 78)
    private static final int method831(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class115 arg8) {
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
        arg8.field1879 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()Lu;", line = 104)
    public final class24 method158() {
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()I", line = 108)
    public final synchronized int method832() {
        return this.field1883 < 0 ? -this.field1883 : this.field1883;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([B[IIIIIIIILke;)I", line = 111)
    private static final int method833(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class115 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1886 += (var14 - arg3) * arg9.field1892;
        arg9.field1890 += (var14 - arg3) * arg9.field1888;
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
        arg9.field1891 = var12 >> 2;
        arg9.field1879 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Luc;II)Lke;", line = 147)
    public static final class115 method834(class107 arg0, int arg1, int arg2) {
        return arg0.field1796 == null || arg0.field1796.length == 0 ? null : new class115(arg0, (int) ((long) arg0.field1794 * 256L * (long) arg1 / (long) (class84.field1322 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[B[IIIIIIIILke;II)I", line = 154)
    private static final int method835(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
        arg11.field1886 -= arg11.field1892 * arg5;
        arg11.field1890 -= arg11.field1888 * arg5;
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
        arg11.field1886 += arg11.field1892 * arg5;
        arg11.field1890 += arg11.field1888 * arg5;
        arg11.field1891 = arg6;
        arg11.field1879 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()I", line = 187)
    public final synchronized int method836() {
        return this.field1887 == Integer.MIN_VALUE ? 0 : this.field1887;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([B[IIIIIIILke;)I", line = 190)
    private static final int method837(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class115 arg8) {
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
        arg8.field1879 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II[B[IIIIIIIILke;II)I", line = 215)
    private static final int method838(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
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
        arg11.field1879 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I", line = 248)
    private static final int method839(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I", line = 251)
    private static final int method840(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()I", line = 255)
    public final int method153() {
        int var1 = this.field1891 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1893 == 0) {
            var2 -= this.field1879 * var2 / (((class107) this.field316).field1796.length << 8);
        } else if (this.field1893 >= 0) {
            var2 -= this.field1882 * var2 / ((class107) this.field316).field1796.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II[B[IIIIIIIILke;II)I", line = 269)
    private static final int method841(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
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
        arg11.field1879 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([B[IIIIIIIILke;)I", line = 301)
    private static final int method842(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class115 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1886 += (var14 - arg3) * arg9.field1892;
        arg9.field1890 += (var14 - arg3) * arg9.field1888;
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
        arg9.field1891 = var12 >> 2;
        arg9.field1879 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B[IIIIIIIIIILke;)I", line = 335)
    private static final int method843(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class115 arg12) {
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
        arg12.field1891 += (var19 - arg4) * arg12.field1884;
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
        arg12.field1886 = var15 >> 2;
        arg12.field1890 = var16 >> 2;
        arg12.field1879 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()I", line = 388)
    public final int method159() {
        return this.field1887 == 0 && this.field1885 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V", line = 397)
    public final synchronized void method844(int arg0) {
        this.method857(arg0 << 6, this.method858());
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[B[IIIIIIIIIILke;II)I", line = 400)
    private static final int method845(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class115 arg13, int arg14, int arg15) {
        arg13.field1891 -= arg13.field1884 * arg5;
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
        arg13.field1891 += arg13.field1884 * var26;
        arg13.field1886 = arg6;
        arg13.field1890 = arg7;
        arg13.field1879 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 441)
    public final synchronized void method154(int arg0) {
        if (this.field1885 > 0) {
            if (arg0 >= this.field1885) {
                if (this.field1887 == Integer.MIN_VALUE) {
                    this.field1887 = 0;
                    this.field1891 = this.field1886 = this.field1890 = 0;
                    this.method2000(126);
                    arg0 = this.field1885;
                }
                this.field1885 = 0;
                this.method866();
            } else {
                this.field1891 += this.field1884 * arg0;
                this.field1886 += this.field1892 * arg0;
                this.field1890 += this.field1888 * arg0;
                this.field1885 -= arg0;
            }
        }
        class107 var2 = (class107) this.field316;
        int var3 = this.field1882 << 8;
        int var4 = this.field1881 << 8;
        int var5 = var2.field1796.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1893 = 0;
        }
        if (this.field1879 < 0) {
            if (this.field1883 <= 0) {
                this.method854();
                this.method2000(51);
                return;
            }
            this.field1879 = 0;
        }
        if (this.field1879 >= var5) {
            if (this.field1883 >= 0) {
                this.method854();
                this.method2000(-61);
                return;
            }
            this.field1879 = var5 - 1;
        }
        this.field1879 += this.field1883 * arg0;
        if (this.field1893 >= 0) {
            if (this.field1893 > 0) {
                if (this.field1880) {
                    label121: {
                        if (this.field1883 < 0) {
                            if (this.field1879 >= var3) {
                                return;
                            }
                            this.field1879 = var3 + var3 - this.field1879 - 1;
                            this.field1883 = -this.field1883;
                            if (--this.field1893 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1879 < var4) {
                                return;
                            }
                            this.field1879 = var4 + var4 - this.field1879 - 1;
                            this.field1883 = -this.field1883;
                            if (--this.field1893 == 0) {
                                break;
                            }
                            if (this.field1879 >= var3) {
                                return;
                            }
                            this.field1879 = var3 + var3 - this.field1879 - 1;
                            this.field1883 = -this.field1883;
                        } while (--this.field1893 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1883 < 0) {
                            if (this.field1879 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1879 - 1) / var6;
                            if (var7 >= this.field1893) {
                                this.field1879 += this.field1893 * var6;
                                this.field1893 = 0;
                                break label153;
                            }
                            this.field1879 += var6 * var7;
                            this.field1893 -= var7;
                        } else if (this.field1879 >= var4) {
                            int var8 = (this.field1879 - var3) / var6;
                            if (var8 >= this.field1893) {
                                this.field1879 -= this.field1893 * var6;
                                this.field1893 = 0;
                                break label153;
                            }
                            this.field1879 -= var6 * var8;
                            this.field1893 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1883 < 0) {
                if (this.field1879 < 0) {
                    this.field1879 = -1;
                    this.method854();
                    this.method2000(127);
                }
            } else if (this.field1879 >= var5) {
                this.field1879 = var5;
                this.method854();
                this.method2000(127);
            }
        } else if (this.field1880) {
            if (this.field1883 < 0) {
                if (this.field1879 >= var3) {
                    return;
                }
                this.field1879 = var3 + var3 - this.field1879 - 1;
                this.field1883 = -this.field1883;
            }
            while (this.field1879 >= var4) {
                this.field1879 = var4 + var4 - this.field1879 - 1;
                this.field1883 = -this.field1883;
                if (this.field1879 >= var3) {
                    return;
                }
                this.field1879 = var3 + var3 - this.field1879 - 1;
                this.field1883 = -this.field1883;
            }
        } else if (this.field1883 < 0) {
            if (this.field1879 >= var3) {
                return;
            }
            this.field1879 = var4 - (var4 - 1 - this.field1879) % var6 - 1;
        } else if (this.field1879 >= var4) {
            this.field1879 = (this.field1879 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)V", line = 661)
    public final synchronized void method846(int arg0) {
        int var2 = ((class107) this.field316).field1796.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1879 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "()Z", line = 673)
    private final boolean method847() {
        int var1 = this.field1887;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method839(var1, this.field1889);
            var2 = method840(var1, this.field1889);
        }
        if (this.field1891 != var1 || this.field1886 != var3 || this.field1890 != var2) {
            if (this.field1891 < var1) {
                this.field1884 = 1;
                this.field1885 = var1 - this.field1891;
            } else if (this.field1891 > var1) {
                this.field1884 = -1;
                this.field1885 = this.field1891 - var1;
            } else {
                this.field1884 = 0;
            }
            if (this.field1886 < var3) {
                this.field1892 = 1;
                if (this.field1885 == 0 || this.field1885 > var3 - this.field1886) {
                    this.field1885 = var3 - this.field1886;
                }
            } else if (this.field1886 > var3) {
                this.field1892 = -1;
                if (this.field1885 == 0 || this.field1885 > this.field1886 - var3) {
                    this.field1885 = this.field1886 - var3;
                }
            } else {
                this.field1892 = 0;
            }
            if (this.field1890 < var2) {
                this.field1888 = 1;
                if (this.field1885 == 0 || this.field1885 > var2 - this.field1890) {
                    this.field1885 = var2 - this.field1890;
                }
            } else if (this.field1890 > var2) {
                this.field1888 = -1;
                if (this.field1885 == 0 || this.field1885 > this.field1890 - var2) {
                    this.field1885 = this.field1890 - var2;
                }
            } else {
                this.field1888 = 0;
            }
            return false;
        } else if (this.field1887 == Integer.MIN_VALUE) {
            this.field1887 = 0;
            this.field1891 = this.field1886 = this.field1890 = 0;
            this.method2000(-22);
            return true;
        } else {
            this.method866();
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "()Z", line = 758)
    public final boolean method848() {
        return this.field1879 < 0 || this.field1879 >= ((class107) this.field316).field1796.length << 8;
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 763)
    public final synchronized void method849(int arg0) {
        if (this.field1883 < 0) {
            this.field1883 = -arg0;
        } else {
            this.field1883 = arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II[B[IIIIIIIILke;II)I", line = 770)
    private static final int method850(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
        arg11.field1886 -= arg11.field1892 * arg5;
        arg11.field1890 -= arg11.field1888 * arg5;
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
        arg11.field1886 += arg11.field1892 * arg5;
        arg11.field1890 += arg11.field1888 * arg5;
        arg11.field1891 = arg6;
        arg11.field1879 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II[B[IIIIIIILke;II)I", line = 803)
    private static final int method851(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10, int arg11, int arg12) {
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
        arg10.field1879 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)V", line = 834)
    public final synchronized void method852(int arg0) {
        this.field1893 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 837)
    public final synchronized void method853(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method857(arg1, arg2);
            return;
        }
        int var4 = method839(arg1, arg2);
        int var5 = method840(arg1, arg2);
        if (this.field1886 == var4 && this.field1890 == var5) {
            this.field1885 = 0;
            return;
        }
        int var6 = arg1 - this.field1891;
        if (this.field1891 - arg1 > var6) {
            var6 = this.field1891 - arg1;
        }
        if (var4 - this.field1886 > var6) {
            var6 = var4 - this.field1886;
        }
        if (this.field1886 - var4 > var6) {
            var6 = this.field1886 - var4;
        }
        if (var5 - this.field1890 > var6) {
            var6 = var5 - this.field1890;
        }
        if (this.field1890 - var5 > var6) {
            var6 = this.field1890 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1885 = arg0;
        this.field1887 = arg1;
        this.field1889 = arg2;
        this.field1884 = (arg1 - this.field1891) / arg0;
        this.field1892 = (var4 - this.field1886) / arg0;
        this.field1888 = (var5 - this.field1890) / arg0;
    }

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "()V", line = 883)
    private final void method854() {
        if (this.field1885 == 0) {
            return;
        }
        if (this.field1887 == Integer.MIN_VALUE) {
            this.field1887 = 0;
        }
        this.field1885 = 0;
        this.method866();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I[B[IIIIIIIIIILke;)I", line = 894)
    private static final int method855(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class115 arg12) {
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
        arg12.field1891 += (var19 - arg4) * arg12.field1884;
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
        arg12.field1886 = var15 >> 2;
        arg12.field1890 = var16 >> 2;
        arg12.field1879 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B[IIIIIIIILke;)I", line = 949)
    private static final int method856(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10) {
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
        arg10.field1879 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V", line = 987)
    private final synchronized void method857(int arg0, int arg1) {
        this.field1887 = arg0;
        this.field1889 = arg1;
        this.field1885 = 0;
        this.method866();
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "()I", line = 994)
    public final synchronized int method858() {
        return this.field1889 < 0 ? -1 : this.field1889;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([IIIII)I", line = 998)
    private final int method859(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1885 > 0) {
                int var6 = this.field1885 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1885 += arg1;
                if (this.field1883 == -256 && (this.field1879 & 0xFF) == 0) {
                    if (class274.field4723) {
                        arg1 = method855(0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, this.field1892, this.field1888, 0, var6, arg2, this);
                    } else {
                        arg1 = method833(((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, this.field1884, 0, var6, arg2, this);
                    }
                } else if (class274.field4723) {
                    arg1 = method845(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, this.field1892, this.field1888, 0, var6, arg2, this, this.field1883, arg4);
                } else {
                    arg1 = method835(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, this.field1884, 0, var6, arg2, this, this.field1883, arg4);
                }
                this.field1885 -= arg1;
                if (this.field1885 != 0) {
                    return arg1;
                }
                if (!this.method847()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1883 == -256 && (this.field1879 & 0xFF) == 0) {
                if (class274.field4723) {
                    return method856(0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, 0, arg3, arg2, this);
                }
                return method831(((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, 0, arg3, arg2, this);
            }
            if (class274.field4723) {
                return method841(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, 0, arg3, arg2, this, this.field1883, arg4);
            }
            return method829(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, 0, arg3, arg2, this, this.field1883, arg4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)V", line = 1053)
    public final synchronized void method860(int arg0, int arg1) {
        this.method853(arg0, arg1, this.method858());
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([III)V", line = 1056)
    public final synchronized void method157(int[] arg0, int arg1, int arg2) {
        if (this.field1887 == 0 && this.field1885 == 0) {
            this.method154(arg2);
            return;
        }
        class107 var4 = (class107) this.field316;
        int var5 = this.field1882 << 8;
        int var6 = this.field1881 << 8;
        int var7 = var4.field1796.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1893 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1879 < 0) {
            if (this.field1883 <= 0) {
                this.method854();
                this.method2000(-115);
                return;
            }
            this.field1879 = 0;
        }
        if (this.field1879 >= var7) {
            if (this.field1883 >= 0) {
                this.method854();
                this.method2000(-44);
                return;
            }
            this.field1879 = var7 - 1;
        }
        if (this.field1893 >= 0) {
            if (this.field1893 > 0) {
                if (this.field1880) {
                    label131: {
                        if (this.field1883 < 0) {
                            var9 = this.method859(arg0, arg1, var5, var10, var4.field1796[this.field1882]);
                            if (this.field1879 >= var5) {
                                return;
                            }
                            this.field1879 = var5 + var5 - this.field1879 - 1;
                            this.field1883 = -this.field1883;
                            if (--this.field1893 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method865(arg0, var9, var6, var10, var4.field1796[this.field1881 - 1]);
                            if (this.field1879 < var6) {
                                return;
                            }
                            this.field1879 = var6 + var6 - this.field1879 - 1;
                            this.field1883 = -this.field1883;
                            if (--this.field1893 == 0) {
                                break;
                            }
                            var9 = this.method859(arg0, var9, var5, var10, var4.field1796[this.field1882]);
                            if (this.field1879 >= var5) {
                                return;
                            }
                            this.field1879 = var5 + var5 - this.field1879 - 1;
                            this.field1883 = -this.field1883;
                        } while (--this.field1893 != 0);
                    }
                } else if (this.field1883 < 0) {
                    while (true) {
                        var9 = this.method859(arg0, var9, var5, var10, var4.field1796[this.field1881 - 1]);
                        if (this.field1879 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1879 - 1) / var8;
                        if (var12 >= this.field1893) {
                            this.field1879 += this.field1893 * var8;
                            this.field1893 = 0;
                            break;
                        }
                        this.field1879 += var8 * var12;
                        this.field1893 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method865(arg0, var9, var6, var10, var4.field1796[this.field1882]);
                        if (this.field1879 < var6) {
                            return;
                        }
                        int var13 = (this.field1879 - var5) / var8;
                        if (var13 >= this.field1893) {
                            this.field1879 -= this.field1893 * var8;
                            this.field1893 = 0;
                            break;
                        }
                        this.field1879 -= var8 * var13;
                        this.field1893 -= var13;
                    }
                }
            }
            if (this.field1883 < 0) {
                this.method859(arg0, var9, 0, var10, 0);
                if (this.field1879 < 0) {
                    this.field1879 = -1;
                    this.method854();
                    this.method2000(34);
                }
            } else {
                this.method865(arg0, var9, var7, var10, 0);
                if (this.field1879 >= var7) {
                    this.field1879 = var7;
                    this.method854();
                    this.method2000(121);
                }
            }
        } else if (this.field1880) {
            if (this.field1883 < 0) {
                var9 = this.method859(arg0, arg1, var5, var10, var4.field1796[this.field1882]);
                if (this.field1879 >= var5) {
                    return;
                }
                this.field1879 = var5 + var5 - this.field1879 - 1;
                this.field1883 = -this.field1883;
            }
            while (true) {
                int var11 = this.method865(arg0, var9, var6, var10, var4.field1796[this.field1881 - 1]);
                if (this.field1879 < var6) {
                    return;
                }
                this.field1879 = var6 + var6 - this.field1879 - 1;
                this.field1883 = -this.field1883;
                var9 = this.method859(arg0, var11, var5, var10, var4.field1796[this.field1882]);
                if (this.field1879 >= var5) {
                    return;
                }
                this.field1879 = var5 + var5 - this.field1879 - 1;
                this.field1883 = -this.field1883;
            }
        } else if (this.field1883 < 0) {
            while (true) {
                var9 = this.method859(arg0, var9, var5, var10, var4.field1796[this.field1881 - 1]);
                if (this.field1879 >= var5) {
                    return;
                }
                this.field1879 = var6 - (var6 - 1 - this.field1879) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method865(arg0, var9, var6, var10, var4.field1796[this.field1882]);
                if (this.field1879 < var6) {
                    return;
                }
                this.field1879 = (this.field1879 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V", line = 1291)
    private final synchronized void method861(int arg0) {
        this.method857(arg0, this.method858());
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 1297)
    public final synchronized void method862(boolean arg0) {
        this.field1883 = (this.field1883 >>> 31) + (this.field1883 ^ this.field1883 >> 31);
        if (arg0) {
            this.field1883 = -this.field1883;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I[B[IIIIIIIILke;)I", line = 1304)
    private static final int method863(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10) {
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
        arg10.field1879 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Luc;III)Lke;", line = 1342)
    public static final class115 method864(class107 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1796 == null || arg0.field1796.length == 0 ? null : new class115(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "([IIIII)I", line = 1348)
    private final int method865(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1885 > 0) {
                int var6 = this.field1885 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1885 += arg1;
                if (this.field1883 == 256 && (this.field1879 & 0xFF) == 0) {
                    if (class274.field4723) {
                        arg1 = method843(0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, this.field1892, this.field1888, 0, var6, arg2, this);
                    } else {
                        arg1 = method842(((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, this.field1884, 0, var6, arg2, this);
                    }
                } else if (class274.field4723) {
                    arg1 = method867(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, this.field1892, this.field1888, 0, var6, arg2, this, this.field1883, arg4);
                } else {
                    arg1 = method850(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, this.field1884, 0, var6, arg2, this, this.field1883, arg4);
                }
                this.field1885 -= arg1;
                if (this.field1885 != 0) {
                    return arg1;
                }
                if (!this.method847()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1883 == 256 && (this.field1879 & 0xFF) == 0) {
                if (class274.field4723) {
                    return method863(0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, 0, arg3, arg2, this);
                }
                return method837(((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, 0, arg3, arg2, this);
            }
            if (class274.field4723) {
                return method838(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1886, this.field1890, 0, arg3, arg2, this, this.field1883, arg4);
            }
            return method851(0, 0, ((class107) this.field316).field1796, arg0, this.field1879, arg1, this.field1891, 0, arg3, arg2, this, this.field1883, arg4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "()V", line = 1404)
    private final void method866() {
        this.field1891 = this.field1887;
        this.field1886 = method839(this.field1887, this.field1889);
        this.field1890 = method840(this.field1887, this.field1889);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II[B[IIIIIIIIIILke;II)I", line = 1410)
    private static final int method867(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class115 arg13, int arg14, int arg15) {
        arg13.field1891 -= arg13.field1884 * arg5;
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
        arg13.field1891 += arg13.field1884 * var27;
        arg13.field1886 = arg6;
        arg13.field1890 = arg7;
        arg13.field1879 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "()Z", line = 1453)
    public final boolean method868() {
        return this.field1885 != 0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Luc;II)V", line = 1458)
    private class115(class107 arg0, int arg1, int arg2) {
        this.field316 = arg0;
        this.field1882 = arg0.field1797;
        this.field1881 = arg0.field1798;
        this.field1880 = arg0.field1795;
        this.field1883 = arg1;
        this.field1887 = arg2;
        this.field1889 = 8192;
        this.field1879 = 0;
        this.method866();
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Luc;III)V", line = 1469)
    private class115(class107 arg0, int arg1, int arg2, int arg3) {
        this.field316 = arg0;
        this.field1882 = arg0.field1797;
        this.field1881 = arg0.field1798;
        this.field1880 = arg0.field1795;
        this.field1883 = arg1;
        this.field1887 = arg2;
        this.field1889 = arg3;
        this.field1879 = 0;
        this.method866();
    }
}
