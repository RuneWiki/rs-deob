import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class260 extends class417 {

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "Z")
    private boolean field3833;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    private int field3821;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    private int field3823;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    private int field3829;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[B[IIIIIIIILkk;II)I", line = 3)
    private static final int method1710(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
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
        arg11.field3820 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "()I", line = 35)
    public final synchronized int method1711() {
        return this.field3828 < 0 ? -1 : this.field3828;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 38)
    public final synchronized void method1712(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1738(arg1, arg2);
        } else {
            int var4 = method1746(arg1, arg2);
            int var5 = method1745(arg1, arg2);
            if (this.field3825 == var4 && this.field3821 == var5) {
                this.field3826 = 0;
            } else {
                int var6 = arg1 - this.field3831;
                if (this.field3831 - arg1 > var6) {
                    var6 = this.field3831 - arg1;
                }
                if (var4 - this.field3825 > var6) {
                    var6 = var4 - this.field3825;
                }
                if (this.field3825 - var4 > var6) {
                    var6 = this.field3825 - var4;
                }
                if (var5 - this.field3821 > var6) {
                    var6 = var5 - this.field3821;
                }
                if (this.field3821 - var5 > var6) {
                    var6 = this.field3821 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3826 = arg0;
                this.field3819 = arg1;
                this.field3828 = arg2;
                this.field3823 = (arg1 - this.field3831) / arg0;
                this.field3830 = (var4 - this.field3825) / arg0;
                this.field3827 = (var5 - this.field3821) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II[B[IIIIIIIILkk;II)I", line = 84)
    private static final int method1713(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
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
        arg11.field3820 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "()I", line = 117)
    public final synchronized int method1714() {
        return this.field3832 < 0 ? -this.field3832 : this.field3832;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "()I", line = 120)
    public final int method152() {
        return this.field3819 == 0 && this.field3826 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIIII)I", line = 126)
    private final int method1715(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3826 <= 0) {
                if (this.field3832 == -256 && (this.field3820 & 255) == 0) {
                    if (class25.field449) {
                        return method1719(0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, 0, arg3, arg2, this);
                    }
                    return method1732(((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, 0, arg3, arg2, this);
                }
                if (class25.field449) {
                    return method1710(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, 0, arg3, arg2, this, this.field3832, arg4);
                }
                return method1727(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, 0, arg3, arg2, this, this.field3832, arg4);
            }
            int var6 = this.field3826 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3826 += arg1;
            if (this.field3832 == -256 && (this.field3820 & 255) == 0) {
                if (class25.field449) {
                    arg1 = method1735(0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, this.field3830, this.field3827, 0, var6, arg2, this);
                } else {
                    arg1 = method1728(((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, this.field3823, 0, var6, arg2, this);
                }
            } else if (class25.field449) {
                arg1 = method1717(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, this.field3830, this.field3827, 0, var6, arg2, this, this.field3832, arg4);
            } else {
                arg1 = method1718(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, this.field3823, 0, var6, arg2, this, this.field3832, arg4);
            }
            this.field3826 -= arg1;
            if (this.field3826 != 0) {
                return arg1;
            }
        } while (!this.method1731());
        return arg3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[B[IIIIIIIIIILkk;)I", line = 182)
    private static final int method1716(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class260 arg12) {
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
        arg12.field3831 += (var19 - arg4) * arg12.field3823;
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
        arg12.field3825 = var15 >> 2;
        arg12.field3821 = var16 >> 2;
        arg12.field3820 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[B[IIIIIIIIIILkk;II)I", line = 236)
    private static final int method1717(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class260 arg13, int arg14, int arg15) {
        arg13.field3831 -= arg13.field3823 * arg5;
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
        arg13.field3831 += arg13.field3823 * var22;
        arg13.field3825 = arg6;
        arg13.field3821 = arg7;
        arg13.field3820 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II[B[IIIIIIIILkk;II)I", line = 277)
    private static final int method1718(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
        arg11.field3825 -= arg11.field3830 * arg5;
        arg11.field3821 -= arg11.field3827 * arg5;
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
        arg11.field3825 += arg11.field3830 * arg5;
        arg11.field3821 += arg11.field3827 * arg5;
        arg11.field3831 = arg6;
        arg11.field3820 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[B[IIIIIIIILkk;)I", line = 316)
    private static final int method1719(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10) {
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
        arg10.field3820 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "()Z", line = 354)
    public final boolean method1720() {
        return this.field3826 != 0;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()Lmq;", line = 363)
    public final class417 method156() {
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I[B[IIIIIIIILkk;)I", line = 366)
    private static final int method1721(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10) {
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
        arg10.field3820 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "()I", line = 404)
    public final synchronized int method1722() {
        return this.field3819 == Integer.MIN_VALUE ? 0 : this.field3819;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Z)V", line = 407)
    public final synchronized void method1723(boolean arg0) {
        this.field3832 = (this.field3832 >>> 31) + (this.field3832 ^ this.field3832 >> 31);
        if (arg0) {
            this.field3832 = -this.field3832;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lhh;II)Lkk;", line = 413)
    public static final class260 method1724(class151 arg0, int arg1, int arg2) {
        return arg0.field1907 != null && arg0.field1907.length != 0 ? new class260(arg0, (int) ((long) arg0.field1910 * 256L * (long) arg1 / (long) (class388.field5673 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 419)
    public final synchronized void method187(int arg0) {
        if (this.field3826 > 0) {
            if (arg0 >= this.field3826) {
                if (this.field3819 == Integer.MIN_VALUE) {
                    this.field3819 = 0;
                    this.field3831 = this.field3825 = this.field3821 = 0;
                    this.method2632(true);
                    arg0 = this.field3826;
                }
                this.field3826 = 0;
                this.method1739();
            } else {
                this.field3831 += this.field3823 * arg0;
                this.field3825 += this.field3830 * arg0;
                this.field3821 += this.field3827 * arg0;
                this.field3826 -= arg0;
            }
        }
        class151 var2 = (class151) super.field6087;
        int var3 = this.field3822 << 8;
        int var4 = this.field3824 << 8;
        int var5 = var2.field1907.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3829 = 0;
        }
        if (this.field3820 < 0) {
            if (this.field3832 <= 0) {
                this.method1725();
                this.method2632(true);
                return;
            }
            this.field3820 = 0;
        }
        if (this.field3820 >= var5) {
            if (this.field3832 >= 0) {
                this.method1725();
                this.method2632(true);
                return;
            }
            this.field3820 = var5 - 1;
        }
        this.field3820 += this.field3832 * arg0;
        if (this.field3829 < 0) {
            if (!this.field3833) {
                if (this.field3832 < 0) {
                    if (this.field3820 < var3) {
                        this.field3820 = var4 - 1 - (var4 - 1 - this.field3820) % var6;
                    }
                } else if (this.field3820 >= var4) {
                    this.field3820 = (this.field3820 - var3) % var6 + var3;
                }
            } else {
                if (this.field3832 < 0) {
                    if (this.field3820 >= var3) {
                        return;
                    }
                    this.field3820 = var3 + var3 - 1 - this.field3820;
                    this.field3832 = -this.field3832;
                }
                while (this.field3820 >= var4) {
                    this.field3820 = var4 + var4 - 1 - this.field3820;
                    this.field3832 = -this.field3832;
                    if (this.field3820 >= var3) {
                        return;
                    }
                    this.field3820 = var3 + var3 - 1 - this.field3820;
                    this.field3832 = -this.field3832;
                }
            }
        } else {
            if (this.field3829 > 0) {
                if (this.field3833) {
                    label125: {
                        if (this.field3832 < 0) {
                            if (this.field3820 >= var3) {
                                return;
                            }
                            this.field3820 = var3 + var3 - 1 - this.field3820;
                            this.field3832 = -this.field3832;
                            if (--this.field3829 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3820 < var4) {
                                return;
                            }
                            this.field3820 = var4 + var4 - 1 - this.field3820;
                            this.field3832 = -this.field3832;
                            if (--this.field3829 == 0) {
                                break;
                            }
                            if (this.field3820 >= var3) {
                                return;
                            }
                            this.field3820 = var3 + var3 - 1 - this.field3820;
                            this.field3832 = -this.field3832;
                        } while (--this.field3829 != 0);
                    }
                } else if (this.field3832 < 0) {
                    if (this.field3820 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3820) / var6;
                    if (var7 < this.field3829) {
                        this.field3820 += var6 * var7;
                        this.field3829 -= var7;
                        return;
                    }
                    this.field3820 += this.field3829 * var6;
                    this.field3829 = 0;
                } else {
                    if (this.field3820 < var4) {
                        return;
                    }
                    int var8 = (this.field3820 - var3) / var6;
                    if (var8 < this.field3829) {
                        this.field3820 -= var6 * var8;
                        this.field3829 -= var8;
                        return;
                    }
                    this.field3820 -= this.field3829 * var6;
                    this.field3829 = 0;
                }
            }
            if (this.field3832 < 0) {
                if (this.field3820 < 0) {
                    this.field3820 = -1;
                    this.method1725();
                    this.method2632(true);
                    return;
                }
            } else if (this.field3820 >= var5) {
                this.field3820 = var5;
                this.method1725();
                this.method2632(true);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "()V", line = 637)
    private final void method1725() {
        if (this.field3826 != 0) {
            if (this.field3819 == Integer.MIN_VALUE) {
                this.field3819 = 0;
            }
            this.field3826 = 0;
            this.method1739();
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "([III)V", line = 649)
    public final synchronized void method165(int[] arg0, int arg1, int arg2) {
        if (this.field3819 == 0 && this.field3826 == 0) {
            this.method187(arg2);
        } else {
            class151 var4 = (class151) super.field6087;
            int var5 = this.field3822 << 8;
            int var6 = this.field3824 << 8;
            int var7 = var4.field1907.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3829 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3820 < 0) {
                if (this.field3832 <= 0) {
                    this.method1725();
                    this.method2632(true);
                    return;
                }
                this.field3820 = 0;
            }
            if (this.field3820 >= var7) {
                if (this.field3832 >= 0) {
                    this.method1725();
                    this.method2632(true);
                    return;
                }
                this.field3820 = var7 - 1;
            }
            if (this.field3829 < 0) {
                if (this.field3833) {
                    if (this.field3832 < 0) {
                        var9 = this.method1715(arg0, arg1, var5, var10, var4.field1907[this.field3822]);
                        if (this.field3820 >= var5) {
                            return;
                        }
                        this.field3820 = var5 + var5 - 1 - this.field3820;
                        this.field3832 = -this.field3832;
                    }
                    while (true) {
                        int var11 = this.method1737(arg0, var9, var6, var10, var4.field1907[this.field3824 - 1]);
                        if (this.field3820 < var6) {
                            return;
                        }
                        this.field3820 = var6 + var6 - 1 - this.field3820;
                        this.field3832 = -this.field3832;
                        var9 = this.method1715(arg0, var11, var5, var10, var4.field1907[this.field3822]);
                        if (this.field3820 >= var5) {
                            return;
                        }
                        this.field3820 = var5 + var5 - 1 - this.field3820;
                        this.field3832 = -this.field3832;
                    }
                } else if (this.field3832 < 0) {
                    while (true) {
                        var9 = this.method1715(arg0, var9, var5, var10, var4.field1907[this.field3824 - 1]);
                        if (this.field3820 >= var5) {
                            return;
                        }
                        this.field3820 = var6 - 1 - (var6 - 1 - this.field3820) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1737(arg0, var9, var6, var10, var4.field1907[this.field3822]);
                        if (this.field3820 < var6) {
                            return;
                        }
                        this.field3820 = (this.field3820 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3829 > 0) {
                    if (this.field3833) {
                        label130: {
                            if (this.field3832 < 0) {
                                var9 = this.method1715(arg0, arg1, var5, var10, var4.field1907[this.field3822]);
                                if (this.field3820 >= var5) {
                                    return;
                                }
                                this.field3820 = var5 + var5 - 1 - this.field3820;
                                this.field3832 = -this.field3832;
                                if (--this.field3829 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1737(arg0, var9, var6, var10, var4.field1907[this.field3824 - 1]);
                                if (this.field3820 < var6) {
                                    return;
                                }
                                this.field3820 = var6 + var6 - 1 - this.field3820;
                                this.field3832 = -this.field3832;
                                if (--this.field3829 == 0) {
                                    break;
                                }
                                var9 = this.method1715(arg0, var9, var5, var10, var4.field1907[this.field3822]);
                                if (this.field3820 >= var5) {
                                    return;
                                }
                                this.field3820 = var5 + var5 - 1 - this.field3820;
                                this.field3832 = -this.field3832;
                            } while (--this.field3829 != 0);
                        }
                    } else if (this.field3832 < 0) {
                        while (true) {
                            var9 = this.method1715(arg0, var9, var5, var10, var4.field1907[this.field3824 - 1]);
                            if (this.field3820 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3820) / var8;
                            if (var12 >= this.field3829) {
                                this.field3820 += this.field3829 * var8;
                                this.field3829 = 0;
                                break;
                            }
                            this.field3820 += var8 * var12;
                            this.field3829 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1737(arg0, var9, var6, var10, var4.field1907[this.field3822]);
                            if (this.field3820 < var6) {
                                return;
                            }
                            int var13 = (this.field3820 - var5) / var8;
                            if (var13 >= this.field3829) {
                                this.field3820 -= this.field3829 * var8;
                                this.field3829 = 0;
                                break;
                            }
                            this.field3820 -= var8 * var13;
                            this.field3829 -= var13;
                        }
                    }
                }
                if (this.field3832 < 0) {
                    this.method1715(arg0, var9, 0, var10, 0);
                    if (this.field3820 < 0) {
                        this.field3820 = -1;
                        this.method1725();
                        this.method2632(true);
                        return;
                    }
                } else {
                    this.method1737(arg0, var9, var7, var10, 0);
                    if (this.field3820 >= var7) {
                        this.field3820 = var7;
                        this.method1725();
                        this.method2632(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 884)
    public final synchronized void method1726(int arg0) {
        if (arg0 == 0) {
            this.method1748(0);
            this.method2632(true);
        } else if (this.field3825 == 0 && this.field3821 == 0) {
            this.field3826 = 0;
            this.field3819 = 0;
            this.field3831 = 0;
            this.method2632(true);
        } else {
            int var2 = -this.field3831;
            if (this.field3831 > var2) {
                var2 = this.field3831;
            }
            if (-this.field3825 > var2) {
                var2 = -this.field3825;
            }
            if (this.field3825 > var2) {
                var2 = this.field3825;
            }
            if (-this.field3821 > var2) {
                var2 = -this.field3821;
            }
            if (this.field3821 > var2) {
                var2 = this.field3821;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3826 = arg0;
            this.field3819 = Integer.MIN_VALUE;
            this.field3823 = -this.field3831 / arg0;
            this.field3830 = -this.field3825 / arg0;
            this.field3827 = -this.field3821 / arg0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[B[IIIIIIILkk;II)I", line = 929)
    private static final int method1727(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10, int arg11, int arg12) {
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
        arg10.field3820 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([B[IIIIIIIILkk;)I", line = 955)
    private static final int method1728(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class260 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3825 += (var14 - arg3) * arg9.field3830;
        arg9.field3821 += (var14 - arg3) * arg9.field3827;
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
        arg9.field3831 = var12 >> 2;
        arg9.field3820 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lhh;III)Lkk;", line = 990)
    public static final class260 method1729(class151 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1907 != null && arg0.field1907.length != 0 ? new class260(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 996)
    public final synchronized void method1730(int arg0) {
        if (this.field3832 < 0) {
            this.field3832 = -arg0;
        } else {
            this.field3832 = arg0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "()Z", line = 1006)
    private final boolean method1731() {
        int var1 = this.field3819;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1746(var1, this.field3828);
            var2 = method1745(var1, this.field3828);
        }
        if (this.field3831 == var1 && this.field3825 == var3 && this.field3821 == var2) {
            if (this.field3819 == Integer.MIN_VALUE) {
                this.field3819 = 0;
                this.field3831 = this.field3825 = this.field3821 = 0;
                this.method2632(true);
                return true;
            } else {
                this.method1739();
                return false;
            }
        } else {
            if (this.field3831 < var1) {
                this.field3823 = 1;
                this.field3826 = var1 - this.field3831;
            } else if (this.field3831 > var1) {
                this.field3823 = -1;
                this.field3826 = this.field3831 - var1;
            } else {
                this.field3823 = 0;
            }
            if (this.field3825 < var3) {
                this.field3830 = 1;
                if (this.field3826 == 0 || this.field3826 > var3 - this.field3825) {
                    this.field3826 = var3 - this.field3825;
                }
            } else if (this.field3825 > var3) {
                this.field3830 = -1;
                if (this.field3826 == 0 || this.field3826 > this.field3825 - var3) {
                    this.field3826 = this.field3825 - var3;
                }
            } else {
                this.field3830 = 0;
            }
            if (this.field3821 < var2) {
                this.field3827 = 1;
                if (this.field3826 == 0 || this.field3826 > var2 - this.field3821) {
                    this.field3826 = var2 - this.field3821;
                }
            } else if (this.field3821 > var2) {
                this.field3827 = -1;
                if (this.field3826 == 0 || this.field3826 > this.field3821 - var2) {
                    this.field3826 = this.field3821 - var2;
                }
            } else {
                this.field3827 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([B[IIIIIIILkk;)I", line = 1091)
    private static final int method1732(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class260 arg8) {
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
        arg8.field3820 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V", line = 1119)
    public final synchronized void method1733(int arg0) {
        int var2 = ((class151) super.field6087).field1907.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3820 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V", line = 1129)
    public final synchronized void method1734(int arg0, int arg1) {
        this.method1712(arg0, arg1, this.method1711());
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I[B[IIIIIIIIIILkk;)I", line = 1133)
    private static final int method1735(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class260 arg12) {
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
        arg12.field3831 += (var19 - arg4) * arg12.field3823;
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
        arg12.field3825 = var15 >> 2;
        arg12.field3821 = var16 >> 2;
        arg12.field3820 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "([B[IIIIIIILkk;)I", line = 1186)
    private static final int method1736(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class260 arg8) {
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
        arg8.field3820 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "([IIIII)I", line = 1212)
    private final int method1737(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3826 <= 0) {
                if (this.field3832 == 256 && (this.field3820 & 255) == 0) {
                    if (class25.field449) {
                        return method1721(0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, 0, arg3, arg2, this);
                    }
                    return method1736(((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, 0, arg3, arg2, this);
                }
                if (class25.field449) {
                    return method1713(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, 0, arg3, arg2, this, this.field3832, arg4);
                }
                return method1750(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, 0, arg3, arg2, this, this.field3832, arg4);
            }
            int var6 = this.field3826 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3826 += arg1;
            if (this.field3832 == 256 && (this.field3820 & 255) == 0) {
                if (class25.field449) {
                    arg1 = method1716(0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, this.field3830, this.field3827, 0, var6, arg2, this);
                } else {
                    arg1 = method1747(((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, this.field3823, 0, var6, arg2, this);
                }
            } else if (class25.field449) {
                arg1 = method1744(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3825, this.field3821, this.field3830, this.field3827, 0, var6, arg2, this, this.field3832, arg4);
            } else {
                arg1 = method1742(0, 0, ((class151) super.field6087).field1907, arg0, this.field3820, arg1, this.field3831, this.field3823, 0, var6, arg2, this, this.field3832, arg4);
            }
            this.field3826 -= arg1;
            if (this.field3826 != 0) {
                return arg1;
            }
        } while (!this.method1731());
        return arg3;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V", line = 1267)
    private final synchronized void method1738(int arg0, int arg1) {
        this.field3819 = arg0;
        this.field3828 = arg1;
        this.field3826 = 0;
        this.method1739();
    }

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "()V", line = 1274)
    private final void method1739() {
        this.field3831 = this.field3819;
        this.field3825 = method1746(this.field3819, this.field3828);
        this.field3821 = method1745(this.field3819, this.field3828);
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V", line = 1280)
    public final synchronized void method1740(int arg0) {
        this.field3829 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()I", line = 1284)
    public final int method1741() {
        int var1 = this.field3831 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3829 == 0) {
            var2 -= this.field3820 * var2 / (((class151) super.field6087).field1907.length << 8);
        } else if (this.field3829 >= 0) {
            var2 -= this.field3822 * var2 / ((class151) super.field6087).field1907.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(II[B[IIIIIIIILkk;II)I", line = 1296)
    private static final int method1742(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
        arg11.field3825 -= arg11.field3830 * arg5;
        arg11.field3821 -= arg11.field3827 * arg5;
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
        arg11.field3825 += arg11.field3830 * arg5;
        arg11.field3821 += arg11.field3827 * arg5;
        arg11.field3831 = arg6;
        arg11.field3820 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V", line = 1331)
    public final synchronized void method1743(int arg0) {
        this.method1738(arg0 << 6, this.method1711());
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II[B[IIIIIIIIIILkk;II)I", line = 1334)
    private static final int method1744(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class260 arg13, int arg14, int arg15) {
        arg13.field3831 -= arg13.field3823 * arg5;
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
        arg13.field3831 += arg13.field3823 * var22;
        arg13.field3825 = arg6;
        arg13.field3821 = arg7;
        arg13.field3820 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()Lmq;", line = 1376)
    public final class417 method189() {
        return null;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(II)I", line = 1380)
    private static final int method1745(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(II)I", line = 1384)
    private static final int method1746(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "([B[IIIIIIIILkk;)I", line = 1387)
    private static final int method1747(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class260 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3825 += (var14 - arg3) * arg9.field3830;
        arg9.field3821 += (var14 - arg3) * arg9.field3827;
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
        arg9.field3831 = var12 >> 2;
        arg9.field3820 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V", line = 1421)
    private final synchronized void method1748(int arg0) {
        this.method1738(arg0, this.method1711());
    }

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "()Z", line = 1428)
    public final boolean method1749() {
        return this.field3820 < 0 || this.field3820 >= ((class151) super.field6087).field1907.length << 8;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II[B[IIIIIIILkk;II)I", line = 1432)
    private static final int method1750(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10, int arg11, int arg12) {
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
        arg10.field3820 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lhh;II)V", line = 1458)
    private class260(class151 arg0, int arg1, int arg2) {
        super.field6087 = arg0;
        this.field3822 = arg0.field1908;
        this.field3824 = arg0.field1909;
        this.field3833 = arg0.field1906;
        this.field3832 = arg1;
        this.field3819 = arg2;
        this.field3828 = 8192;
        this.field3820 = 0;
        this.method1739();
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lhh;III)V", line = 1469)
    private class260(class151 arg0, int arg1, int arg2, int arg3) {
        super.field6087 = arg0;
        this.field3822 = arg0.field1908;
        this.field3824 = arg0.field1909;
        this.field3833 = arg0.field1906;
        this.field3832 = arg1;
        this.field3819 = arg2;
        this.field3828 = arg3;
        this.field3820 = 0;
        this.method1739();
    }
}
