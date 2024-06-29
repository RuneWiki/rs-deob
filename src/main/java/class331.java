import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class331 extends class176 {

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    private int field5120;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    private int field5119;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Z")
    private boolean field5123;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    private int field5118;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    private int field5130;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    private int field5121;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    private int field5127;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    private int field5124;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    private int field5125;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    private int field5126;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    private int field5128;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    private int field5129;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    private int field5132;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[B[IIIIIIIIIILmh;)I", line = 4)
    private static final int method2235(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class331 arg12) {
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
        arg12.field5122 += (var19 - arg4) * arg12.field5124;
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
        arg12.field5131 = var15 >> 2;
        arg12.field5129 = var16 >> 2;
        arg12.field5127 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B[IIIIIIILmh;II)I", line = 57)
    private static final int method2236(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class331 arg10, int arg11, int arg12) {
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
        arg10.field5127 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 83)
    private final synchronized void method2237(int arg0) {
        this.method2267(arg0, this.method2264());
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()I", line = 87)
    public final int method1191() {
        int var1 = this.field5122 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5126 == 0) {
            var2 -= this.field5127 * var2 / (((class73) this.field2687).field1091.length << 8);
        } else if (this.field5126 >= 0) {
            var2 -= this.field5120 * var2 / ((class73) this.field2687).field1091.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[B[IIIIIIIILmh;)I", line = 99)
    private static final int method2238(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class331 arg10) {
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
        arg10.field5127 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I[B[IIIIIIIILmh;)I", line = 141)
    private static final int method2239(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class331 arg10) {
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
        arg10.field5127 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "()V", line = 179)
    private final void method2240() {
        if (this.field5125 == 0) {
            return;
        }
        if (this.field5130 == Integer.MIN_VALUE) {
            this.field5130 = 0;
        }
        this.field5125 = 0;
        this.method2250();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B[IIIIIIIILmh;II)I", line = 192)
    private static final int method2241(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class331 arg11, int arg12, int arg13) {
        arg11.field5131 -= arg11.field5128 * arg5;
        arg11.field5129 -= arg11.field5132 * arg5;
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
        arg11.field5131 += arg11.field5128 * arg5;
        arg11.field5129 += arg11.field5132 * arg5;
        arg11.field5122 = arg6;
        arg11.field5127 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "()Z", line = 227)
    private final boolean method2242() {
        int var1 = this.field5130;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2252(var1, this.field5121);
            var2 = method2251(var1, this.field5121);
        }
        if (this.field5122 != var1 || this.field5131 != var3 || this.field5129 != var2) {
            if (this.field5122 < var1) {
                this.field5124 = 1;
                this.field5125 = var1 - this.field5122;
            } else if (this.field5122 > var1) {
                this.field5124 = -1;
                this.field5125 = this.field5122 - var1;
            } else {
                this.field5124 = 0;
            }
            if (this.field5131 < var3) {
                this.field5128 = 1;
                if (this.field5125 == 0 || this.field5125 > var3 - this.field5131) {
                    this.field5125 = var3 - this.field5131;
                }
            } else if (this.field5131 > var3) {
                this.field5128 = -1;
                if (this.field5125 == 0 || this.field5125 > this.field5131 - var3) {
                    this.field5125 = this.field5131 - var3;
                }
            } else {
                this.field5128 = 0;
            }
            if (this.field5129 < var2) {
                this.field5132 = 1;
                if (this.field5125 == 0 || this.field5125 > var2 - this.field5129) {
                    this.field5125 = var2 - this.field5129;
                }
            } else if (this.field5129 > var2) {
                this.field5132 = -1;
                if (this.field5125 == 0 || this.field5125 > this.field5129 - var2) {
                    this.field5125 = this.field5129 - var2;
                }
            } else {
                this.field5132 = 0;
            }
            return false;
        } else if (this.field5130 == Integer.MIN_VALUE) {
            this.field5130 = 0;
            this.field5122 = this.field5131 = this.field5129 = 0;
            this.method1284(0);
            return true;
        } else {
            this.method2250();
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B[IIIIIIIIIILmh;II)I", line = 312)
    private static final int method2243(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class331 arg13, int arg14, int arg15) {
        arg13.field5122 -= arg13.field5124 * arg5;
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
        arg13.field5122 += arg13.field5124 * var27;
        arg13.field5131 = arg6;
        arg13.field5129 = arg7;
        arg13.field5127 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 354)
    public final synchronized void method2244(int arg0) {
        this.method2267(arg0 << 6, this.method2264());
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([B[IIIIIIILmh;)I", line = 358)
    private static final int method2245(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class331 arg8) {
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
        arg8.field5127 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II[B[IIIIIIIILmh;II)I", line = 383)
    private static final int method2246(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class331 arg11, int arg12, int arg13) {
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
        arg11.field5127 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V", line = 416)
    public final synchronized void method2247(int arg0) {
        int var2 = ((class73) this.field2687).field1091.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5127 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "()I", line = 426)
    public final synchronized int method2248() {
        return this.field5130 == Integer.MIN_VALUE ? 0 : this.field5130;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()Lic;", line = 430)
    public final class176 method220() {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "()I", line = 433)
    public final synchronized int method2249() {
        return this.field5118 < 0 ? -this.field5118 : this.field5118;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "()V", line = 436)
    private final void method2250() {
        this.field5122 = this.field5130;
        this.field5131 = method2252(this.field5130, this.field5121);
        this.field5129 = method2251(this.field5130, this.field5121);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I", line = 441)
    private static final int method2251(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I", line = 446)
    private static final int method2252(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 449)
    public final synchronized void method211(int arg0) {
        if (this.field5125 > 0) {
            if (arg0 >= this.field5125) {
                if (this.field5130 == Integer.MIN_VALUE) {
                    this.field5130 = 0;
                    this.field5122 = this.field5131 = this.field5129 = 0;
                    this.method1284(0);
                    arg0 = this.field5125;
                }
                this.field5125 = 0;
                this.method2250();
            } else {
                this.field5122 += this.field5124 * arg0;
                this.field5131 += this.field5128 * arg0;
                this.field5129 += this.field5132 * arg0;
                this.field5125 -= arg0;
            }
        }
        class73 var2 = (class73) this.field2687;
        int var3 = this.field5120 << 8;
        int var4 = this.field5119 << 8;
        int var5 = var2.field1091.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5126 = 0;
        }
        if (this.field5127 < 0) {
            if (this.field5118 <= 0) {
                this.method2240();
                this.method1284(0);
                return;
            }
            this.field5127 = 0;
        }
        if (this.field5127 >= var5) {
            if (this.field5118 >= 0) {
                this.method2240();
                this.method1284(0);
                return;
            }
            this.field5127 = var5 - 1;
        }
        this.field5127 += this.field5118 * arg0;
        if (this.field5126 >= 0) {
            if (this.field5126 > 0) {
                if (this.field5123) {
                    label121: {
                        if (this.field5118 < 0) {
                            if (this.field5127 >= var3) {
                                return;
                            }
                            this.field5127 = var3 + var3 - this.field5127 - 1;
                            this.field5118 = -this.field5118;
                            if (--this.field5126 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field5127 < var4) {
                                return;
                            }
                            this.field5127 = var4 + var4 - this.field5127 - 1;
                            this.field5118 = -this.field5118;
                            if (--this.field5126 == 0) {
                                break;
                            }
                            if (this.field5127 >= var3) {
                                return;
                            }
                            this.field5127 = var3 + var3 - this.field5127 - 1;
                            this.field5118 = -this.field5118;
                        } while (--this.field5126 != 0);
                    }
                } else {
                    label153: {
                        if (this.field5118 < 0) {
                            if (this.field5127 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field5127 - 1) / var6;
                            if (var7 >= this.field5126) {
                                this.field5127 += this.field5126 * var6;
                                this.field5126 = 0;
                                break label153;
                            }
                            this.field5127 += var6 * var7;
                            this.field5126 -= var7;
                        } else if (this.field5127 >= var4) {
                            int var8 = (this.field5127 - var3) / var6;
                            if (var8 >= this.field5126) {
                                this.field5127 -= this.field5126 * var6;
                                this.field5126 = 0;
                                break label153;
                            }
                            this.field5127 -= var6 * var8;
                            this.field5126 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field5118 < 0) {
                if (this.field5127 < 0) {
                    this.field5127 = -1;
                    this.method2240();
                    this.method1284(0);
                }
            } else if (this.field5127 >= var5) {
                this.field5127 = var5;
                this.method2240();
                this.method1284(0);
            }
        } else if (this.field5123) {
            if (this.field5118 < 0) {
                if (this.field5127 >= var3) {
                    return;
                }
                this.field5127 = var3 + var3 - this.field5127 - 1;
                this.field5118 = -this.field5118;
            }
            while (this.field5127 >= var4) {
                this.field5127 = var4 + var4 - this.field5127 - 1;
                this.field5118 = -this.field5118;
                if (this.field5127 >= var3) {
                    return;
                }
                this.field5127 = var3 + var3 - this.field5127 - 1;
                this.field5118 = -this.field5118;
            }
        } else if (this.field5118 < 0) {
            if (this.field5127 >= var3) {
                return;
            }
            this.field5127 = var4 - (var4 - 1 - this.field5127) % var6 - 1;
        } else if (this.field5127 >= var4) {
            this.field5127 = (this.field5127 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II[B[IIIIIIIILmh;II)I", line = 667)
    private static final int method2253(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class331 arg11, int arg12, int arg13) {
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
        arg11.field5127 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V", line = 700)
    public final synchronized void method2254(boolean arg0) {
        this.field5118 = (this.field5118 >>> 31) + (this.field5118 ^ this.field5118 >> 31);
        if (arg0) {
            this.field5118 = -this.field5118;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII)I", line = 706)
    private final int method2255(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5125 > 0) {
                int var6 = this.field5125 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5125 += arg1;
                if (this.field5118 == 256 && (this.field5127 & 0xFF) == 0) {
                    if (class162.field2508) {
                        arg1 = method2269(0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, this.field5128, this.field5132, 0, var6, arg2, this);
                    } else {
                        arg1 = method2270(((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, this.field5124, 0, var6, arg2, this);
                    }
                } else if (class162.field2508) {
                    arg1 = method2243(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, this.field5128, this.field5132, 0, var6, arg2, this, this.field5118, arg4);
                } else {
                    arg1 = method2261(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, this.field5124, 0, var6, arg2, this, this.field5118, arg4);
                }
                this.field5125 -= arg1;
                if (this.field5125 != 0) {
                    return arg1;
                }
                if (!this.method2242()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5118 == 256 && (this.field5127 & 0xFF) == 0) {
                if (class162.field2508) {
                    return method2238(0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, 0, arg3, arg2, this);
                }
                return method2273(((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, 0, arg3, arg2, this);
            }
            if (class162.field2508) {
                return method2253(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, 0, arg3, arg2, this, this.field5118, arg4);
            }
            return method2236(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, 0, arg3, arg2, this, this.field5118, arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()Lic;", line = 764)
    public final class176 method213() {
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "()Z", line = 767)
    public final boolean method2256() {
        return this.field5127 < 0 || this.field5127 >= ((class73) this.field2687).field1091.length << 8;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([III)V", line = 771)
    public final synchronized void method217(int[] arg0, int arg1, int arg2) {
        if (this.field5130 == 0 && this.field5125 == 0) {
            this.method211(arg2);
            return;
        }
        class73 var4 = (class73) this.field2687;
        int var5 = this.field5120 << 8;
        int var6 = this.field5119 << 8;
        int var7 = var4.field1091.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field5126 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field5127 < 0) {
            if (this.field5118 <= 0) {
                this.method2240();
                this.method1284(0);
                return;
            }
            this.field5127 = 0;
        }
        if (this.field5127 >= var7) {
            if (this.field5118 >= 0) {
                this.method2240();
                this.method1284(0);
                return;
            }
            this.field5127 = var7 - 1;
        }
        if (this.field5126 >= 0) {
            if (this.field5126 > 0) {
                if (this.field5123) {
                    label131: {
                        if (this.field5118 < 0) {
                            var9 = this.method2274(arg0, arg1, var5, var10, var4.field1091[this.field5120]);
                            if (this.field5127 >= var5) {
                                return;
                            }
                            this.field5127 = var5 + var5 - this.field5127 - 1;
                            this.field5118 = -this.field5118;
                            if (--this.field5126 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2255(arg0, var9, var6, var10, var4.field1091[this.field5119 - 1]);
                            if (this.field5127 < var6) {
                                return;
                            }
                            this.field5127 = var6 + var6 - this.field5127 - 1;
                            this.field5118 = -this.field5118;
                            if (--this.field5126 == 0) {
                                break;
                            }
                            var9 = this.method2274(arg0, var9, var5, var10, var4.field1091[this.field5120]);
                            if (this.field5127 >= var5) {
                                return;
                            }
                            this.field5127 = var5 + var5 - this.field5127 - 1;
                            this.field5118 = -this.field5118;
                        } while (--this.field5126 != 0);
                    }
                } else if (this.field5118 < 0) {
                    while (true) {
                        var9 = this.method2274(arg0, var9, var5, var10, var4.field1091[this.field5119 - 1]);
                        if (this.field5127 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field5127 - 1) / var8;
                        if (var12 >= this.field5126) {
                            this.field5127 += this.field5126 * var8;
                            this.field5126 = 0;
                            break;
                        }
                        this.field5127 += var8 * var12;
                        this.field5126 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2255(arg0, var9, var6, var10, var4.field1091[this.field5120]);
                        if (this.field5127 < var6) {
                            return;
                        }
                        int var13 = (this.field5127 - var5) / var8;
                        if (var13 >= this.field5126) {
                            this.field5127 -= this.field5126 * var8;
                            this.field5126 = 0;
                            break;
                        }
                        this.field5127 -= var8 * var13;
                        this.field5126 -= var13;
                    }
                }
            }
            if (this.field5118 < 0) {
                this.method2274(arg0, var9, 0, var10, 0);
                if (this.field5127 < 0) {
                    this.field5127 = -1;
                    this.method2240();
                    this.method1284(0);
                }
            } else {
                this.method2255(arg0, var9, var7, var10, 0);
                if (this.field5127 >= var7) {
                    this.field5127 = var7;
                    this.method2240();
                    this.method1284(0);
                }
            }
        } else if (this.field5123) {
            if (this.field5118 < 0) {
                var9 = this.method2274(arg0, arg1, var5, var10, var4.field1091[this.field5120]);
                if (this.field5127 >= var5) {
                    return;
                }
                this.field5127 = var5 + var5 - this.field5127 - 1;
                this.field5118 = -this.field5118;
            }
            while (true) {
                int var11 = this.method2255(arg0, var9, var6, var10, var4.field1091[this.field5119 - 1]);
                if (this.field5127 < var6) {
                    return;
                }
                this.field5127 = var6 + var6 - this.field5127 - 1;
                this.field5118 = -this.field5118;
                var9 = this.method2274(arg0, var11, var5, var10, var4.field1091[this.field5120]);
                if (this.field5127 >= var5) {
                    return;
                }
                this.field5127 = var5 + var5 - this.field5127 - 1;
                this.field5118 = -this.field5118;
            }
        } else if (this.field5118 < 0) {
            while (true) {
                var9 = this.method2274(arg0, var9, var5, var10, var4.field1091[this.field5119 - 1]);
                if (this.field5127 >= var5) {
                    return;
                }
                this.field5127 = var6 - (var6 - 1 - this.field5127) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2255(arg0, var9, var6, var10, var4.field1091[this.field5120]);
                if (this.field5127 < var6) {
                    return;
                }
                this.field5127 = (this.field5127 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V", line = 1006)
    public final synchronized void method2257(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2267(arg1, arg2);
            return;
        }
        int var4 = method2252(arg1, arg2);
        int var5 = method2251(arg1, arg2);
        if (this.field5131 == var4 && this.field5129 == var5) {
            this.field5125 = 0;
            return;
        }
        int var6 = arg1 - this.field5122;
        if (this.field5122 - arg1 > var6) {
            var6 = this.field5122 - arg1;
        }
        if (var4 - this.field5131 > var6) {
            var6 = var4 - this.field5131;
        }
        if (this.field5131 - var4 > var6) {
            var6 = this.field5131 - var4;
        }
        if (var5 - this.field5129 > var6) {
            var6 = var5 - this.field5129;
        }
        if (this.field5129 - var5 > var6) {
            var6 = this.field5129 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field5125 = arg0;
        this.field5130 = arg1;
        this.field5121 = arg2;
        this.field5124 = (arg1 - this.field5122) / arg0;
        this.field5128 = (var4 - this.field5131) / arg0;
        this.field5132 = (var5 - this.field5129) / arg0;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V", line = 1053)
    public final synchronized void method2258(int arg0) {
        if (this.field5118 < 0) {
            this.field5118 = -arg0;
        } else {
            this.field5118 = arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V", line = 1060)
    public final synchronized void method2259(int arg0) {
        if (arg0 == 0) {
            this.method2237(0);
            this.method1284(0);
        } else if (this.field5131 == 0 && this.field5129 == 0) {
            this.field5125 = 0;
            this.field5130 = 0;
            this.field5122 = 0;
            this.method1284(0);
        } else {
            int var2 = -this.field5122;
            if (this.field5122 > var2) {
                var2 = this.field5122;
            }
            if (-this.field5131 > var2) {
                var2 = -this.field5131;
            }
            if (this.field5131 > var2) {
                var2 = this.field5131;
            }
            if (-this.field5129 > var2) {
                var2 = -this.field5129;
            }
            if (this.field5129 > var2) {
                var2 = this.field5129;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5125 = arg0;
            this.field5130 = Integer.MIN_VALUE;
            this.field5124 = -this.field5122 / arg0;
            this.field5128 = -this.field5131 / arg0;
            this.field5132 = -this.field5129 / arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II[B[IIIIIIIIIILmh;II)I", line = 1105)
    private static final int method2260(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class331 arg13, int arg14, int arg15) {
        arg13.field5122 -= arg13.field5124 * arg5;
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
        arg13.field5122 += arg13.field5124 * var26;
        arg13.field5131 = arg6;
        arg13.field5129 = arg7;
        arg13.field5127 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(II[B[IIIIIIIILmh;II)I", line = 1147)
    private static final int method2261(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class331 arg11, int arg12, int arg13) {
        arg11.field5131 -= arg11.field5128 * arg5;
        arg11.field5129 -= arg11.field5132 * arg5;
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
        arg11.field5131 += arg11.field5128 * arg5;
        arg11.field5129 += arg11.field5132 * arg5;
        arg11.field5122 = arg6;
        arg11.field5127 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V", line = 1183)
    public final synchronized void method2262(int arg0) {
        this.field5126 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lb;III)Lmh;", line = 1187)
    public static final class331 method2263(class73 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1091 == null || arg0.field1091.length == 0 ? null : new class331(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "()I", line = 1194)
    public final synchronized int method2264() {
        return this.field5121 < 0 ? -1 : this.field5121;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lb;II)Lmh;", line = 1197)
    public static final class331 method2265(class73 arg0, int arg1, int arg2) {
        return arg0.field1091 == null || arg0.field1091.length == 0 ? null : new class331(arg0, (int) ((long) arg0.field1094 * 256L * (long) arg1 / (long) (class282.field4337 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V", line = 1203)
    public final synchronized void method2266(int arg0, int arg1) {
        this.method2257(arg0, arg1, this.method2264());
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()I", line = 1206)
    public final int method216() {
        return this.field5130 == 0 && this.field5125 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)V", line = 1214)
    private final synchronized void method2267(int arg0, int arg1) {
        this.field5130 = arg0;
        this.field5121 = arg1;
        this.field5125 = 0;
        this.method2250();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([B[IIIIIIIILmh;)I", line = 1220)
    private static final int method2268(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class331 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5131 += (var14 - arg3) * arg9.field5128;
        arg9.field5129 += (var14 - arg3) * arg9.field5132;
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
        arg9.field5122 = var12 >> 2;
        arg9.field5127 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I[B[IIIIIIIIIILmh;)I", line = 1254)
    private static final int method2269(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class331 arg12) {
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
        arg12.field5122 += (var19 - arg4) * arg12.field5124;
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
        arg12.field5131 = var15 >> 2;
        arg12.field5129 = var16 >> 2;
        arg12.field5127 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([B[IIIIIIIILmh;)I", line = 1310)
    private static final int method2270(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class331 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5131 += (var14 - arg3) * arg9.field5128;
        arg9.field5129 += (var14 - arg3) * arg9.field5132;
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
        arg9.field5122 = var12 >> 2;
        arg9.field5127 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "()Z", line = 1345)
    public final boolean method2271() {
        return this.field5125 != 0;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II[B[IIIIIIILmh;II)I", line = 1351)
    private static final int method2272(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class331 arg10, int arg11, int arg12) {
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
        arg10.field5127 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([B[IIIIIIILmh;)I", line = 1377)
    private static final int method2273(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class331 arg8) {
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
        arg8.field5127 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "([IIIII)I", line = 1404)
    private final int method2274(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5125 > 0) {
                int var6 = this.field5125 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5125 += arg1;
                if (this.field5118 == -256 && (this.field5127 & 0xFF) == 0) {
                    if (class162.field2508) {
                        arg1 = method2235(0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, this.field5128, this.field5132, 0, var6, arg2, this);
                    } else {
                        arg1 = method2268(((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, this.field5124, 0, var6, arg2, this);
                    }
                } else if (class162.field2508) {
                    arg1 = method2260(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, this.field5128, this.field5132, 0, var6, arg2, this, this.field5118, arg4);
                } else {
                    arg1 = method2241(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, this.field5124, 0, var6, arg2, this, this.field5118, arg4);
                }
                this.field5125 -= arg1;
                if (this.field5125 != 0) {
                    return arg1;
                }
                if (!this.method2242()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5118 == -256 && (this.field5127 & 0xFF) == 0) {
                if (class162.field2508) {
                    return method2239(0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, 0, arg3, arg2, this);
                }
                return method2245(((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, 0, arg3, arg2, this);
            }
            if (class162.field2508) {
                return method2246(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5131, this.field5129, 0, arg3, arg2, this, this.field5118, arg4);
            }
            return method2272(0, 0, ((class73) this.field2687).field1091, arg0, this.field5127, arg1, this.field5122, 0, arg3, arg2, this, this.field5118, arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lb;II)V", line = 1458)
    private class331(class73 arg0, int arg1, int arg2) {
        this.field2687 = arg0;
        this.field5120 = arg0.field1095;
        this.field5119 = arg0.field1093;
        this.field5123 = arg0.field1092;
        this.field5118 = arg1;
        this.field5130 = arg2;
        this.field5121 = 8192;
        this.field5127 = 0;
        this.method2250();
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lb;III)V", line = 1469)
    private class331(class73 arg0, int arg1, int arg2, int arg3) {
        this.field2687 = arg0;
        this.field5120 = arg0.field1095;
        this.field5119 = arg0.field1093;
        this.field5123 = arg0.field1092;
        this.field5118 = arg1;
        this.field5130 = arg2;
        this.field5121 = arg3;
        this.field5127 = 0;
        this.method2250();
    }
}
