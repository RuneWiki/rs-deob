import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class257 extends class88 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    private int field3922;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private int field3931;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
    private boolean field3919;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    private int field3924;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    private int field3918;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    private int field3928;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    private int field3920;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    private int field3923;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    private int field3925;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    private int field3926;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    private int field3927;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    private int field3929;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    private static final int method1695(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    public final synchronized void method1696(int arg0) {
        if (this.field3924 < 0) {
            this.field3924 = -arg0;
        } else {
            this.field3924 = arg0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()I")
    public final int method273() {
        return this.field3917 == 0 && this.field3921 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[B[IIIIIIIIIILfa;)I")
    private static final int method1697(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class257 arg12) {
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
        arg12.field3929 += (var19 - arg4) * arg12.field3920;
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
        arg12.field3925 = var15 >> 2;
        arg12.field3923 = var16 >> 2;
        arg12.field3928 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public final synchronized void method1698(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1702(arg1, arg2);
        } else {
            int var4 = method1728(arg1, arg2);
            int var5 = method1695(arg1, arg2);
            if (this.field3925 == var4 && this.field3923 == var5) {
                this.field3921 = 0;
            } else {
                int var6 = arg1 - this.field3929;
                if (this.field3929 - arg1 > var6) {
                    var6 = this.field3929 - arg1;
                }
                if (var4 - this.field3925 > var6) {
                    var6 = var4 - this.field3925;
                }
                if (this.field3925 - var4 > var6) {
                    var6 = this.field3925 - var4;
                }
                if (var5 - this.field3923 > var6) {
                    var6 = var5 - this.field3923;
                }
                if (this.field3923 - var5 > var6) {
                    var6 = this.field3923 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3921 = arg0;
                this.field3917 = arg1;
                this.field3918 = arg2;
                this.field3920 = (arg1 - this.field3929) / arg0;
                this.field3930 = (var4 - this.field3925) / arg0;
                this.field3926 = (var5 - this.field3923) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[B[IIIIIIILfa;II)I")
    private static final int method1699(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class257 arg10, int arg11, int arg12) {
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
        arg10.field3928 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljk;III)Lfa;")
    public static final class257 method1700(class260 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3956 != null && arg0.field3956.length != 0 ? new class257(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([IIIII)I")
    private final int method1701(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3921 <= 0) {
                if (this.field3924 == 256 && (this.field3928 & 255) == 0) {
                    if (class275.field4153) {
                        return method1720(0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, 0, arg3, arg2, this);
                    }
                    return method1724(((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, 0, arg3, arg2, this);
                }
                if (class275.field4153) {
                    return method1703(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, 0, arg3, arg2, this, this.field3924, arg4);
                }
                return method1732(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, 0, arg3, arg2, this, this.field3924, arg4);
            }
            int var6 = this.field3921 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3921 += arg1;
            if (this.field3924 == 256 && (this.field3928 & 255) == 0) {
                if (class275.field4153) {
                    arg1 = method1697(0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, this.field3930, this.field3926, 0, var6, arg2, this);
                } else {
                    arg1 = method1727(((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, this.field3920, 0, var6, arg2, this);
                }
            } else if (class275.field4153) {
                arg1 = method1708(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, this.field3930, this.field3926, 0, var6, arg2, this, this.field3924, arg4);
            } else {
                arg1 = method1712(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, this.field3920, 0, var6, arg2, this, this.field3924, arg4);
            }
            this.field3921 -= arg1;
            if (this.field3921 != 0) {
                return arg1;
            }
        } while (!this.method1707());
        return arg3;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
    private final synchronized void method1702(int arg0, int arg1) {
        this.field3917 = arg0;
        this.field3918 = arg1;
        this.field3921 = 0;
        this.method1705();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[B[IIIIIIIILfa;II)I")
    private static final int method1703(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class257 arg11, int arg12, int arg13) {
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
        arg11.field3928 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()I")
    public final synchronized int method1704() {
        return this.field3917 == Integer.MIN_VALUE ? 0 : this.field3917;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "()V")
    private final void method1705() {
        this.field3929 = this.field3917;
        this.field3925 = method1728(this.field3917, this.field3918);
        this.field3923 = method1695(this.field3917, this.field3918);
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "()Z")
    public final boolean method1706() {
        return this.field3921 != 0;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()I")
    public final int method572() {
        int var1 = this.field3929 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3927 == 0) {
            var2 -= this.field3928 * var2 / (((class260) super.field1398).field3956.length << 8);
        } else if (this.field3927 >= 0) {
            var2 -= this.field3922 * var2 / ((class260) super.field1398).field3956.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "()Z")
    private final boolean method1707() {
        int var1 = this.field3917;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1728(var1, this.field3918);
            var2 = method1695(var1, this.field3918);
        }
        if (this.field3929 == var1 && this.field3925 == var3 && this.field3923 == var2) {
            if (this.field3917 == Integer.MIN_VALUE) {
                this.field3917 = 0;
                this.field3929 = this.field3925 = this.field3923 = 0;
                this.method538(85);
                return true;
            } else {
                this.method1705();
                return false;
            }
        } else {
            if (this.field3929 < var1) {
                this.field3920 = 1;
                this.field3921 = var1 - this.field3929;
            } else if (this.field3929 > var1) {
                this.field3920 = -1;
                this.field3921 = this.field3929 - var1;
            } else {
                this.field3920 = 0;
            }
            if (this.field3925 < var3) {
                this.field3930 = 1;
                if (this.field3921 == 0 || this.field3921 > var3 - this.field3925) {
                    this.field3921 = var3 - this.field3925;
                }
            } else if (this.field3925 > var3) {
                this.field3930 = -1;
                if (this.field3921 == 0 || this.field3921 > this.field3925 - var3) {
                    this.field3921 = this.field3925 - var3;
                }
            } else {
                this.field3930 = 0;
            }
            if (this.field3923 < var2) {
                this.field3926 = 1;
                if (this.field3921 == 0 || this.field3921 > var2 - this.field3923) {
                    this.field3921 = var2 - this.field3923;
                }
            } else if (this.field3923 > var2) {
                this.field3926 = -1;
                if (this.field3921 == 0 || this.field3921 > this.field3923 - var2) {
                    this.field3921 = this.field3923 - var2;
                }
            } else {
                this.field3926 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[B[IIIIIIIIIILfa;II)I")
    private static final int method1708(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class257 arg13, int arg14, int arg15) {
        arg13.field3929 -= arg13.field3920 * arg5;
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
        arg13.field3929 += arg13.field3920 * var22;
        arg13.field3925 = arg6;
        arg13.field3923 = arg7;
        arg13.field3928 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[B[IIIIIIIILfa;)I")
    private static final int method1709(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class257 arg10) {
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
        arg10.field3928 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II[B[IIIIIIIILfa;II)I")
    private static final int method1710(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class257 arg11, int arg12, int arg13) {
        arg11.field3925 -= arg11.field3930 * arg5;
        arg11.field3923 -= arg11.field3926 * arg5;
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
        arg11.field3925 += arg11.field3930 * arg5;
        arg11.field3923 += arg11.field3926 * arg5;
        arg11.field3929 = arg6;
        arg11.field3928 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V")
    public final synchronized void method1711(int arg0) {
        this.field3927 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II[B[IIIIIIIILfa;II)I")
    private static final int method1712(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class257 arg11, int arg12, int arg13) {
        arg11.field3925 -= arg11.field3930 * arg5;
        arg11.field3923 -= arg11.field3926 * arg5;
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
        arg11.field3925 += arg11.field3930 * arg5;
        arg11.field3923 += arg11.field3926 * arg5;
        arg11.field3929 = arg6;
        arg11.field3928 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()Lai;")
    public final class88 method270() {
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public final synchronized void method1713(boolean arg0) {
        this.field3924 = (this.field3924 >>> 31) + (this.field3924 ^ this.field3924 >> 31);
        if (arg0) {
            this.field3924 = -this.field3924;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II[B[IIIIIIIILfa;II)I")
    private static final int method1714(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class257 arg11, int arg12, int arg13) {
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
        arg11.field3928 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([B[IIIIIIILfa;)I")
    private static final int method1715(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class257 arg8) {
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
        arg8.field3928 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "()I")
    public final synchronized int method1716() {
        return this.field3918 < 0 ? -1 : this.field3918;
    }

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
    private final synchronized void method1717(int arg0) {
        this.method1702(arg0, this.method1716());
    }

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "()I")
    public final synchronized int method1718() {
        return this.field3924 < 0 ? -this.field3924 : this.field3924;
    }

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "(I)V")
    public final synchronized void method1719(int arg0) {
        if (arg0 == 0) {
            this.method1717(0);
            this.method538(111);
        } else if (this.field3925 == 0 && this.field3923 == 0) {
            this.field3921 = 0;
            this.field3917 = 0;
            this.field3929 = 0;
            this.method538(104);
        } else {
            int var2 = -this.field3929;
            if (this.field3929 > var2) {
                var2 = this.field3929;
            }
            if (-this.field3925 > var2) {
                var2 = -this.field3925;
            }
            if (this.field3925 > var2) {
                var2 = this.field3925;
            }
            if (-this.field3923 > var2) {
                var2 = -this.field3923;
            }
            if (this.field3923 > var2) {
                var2 = this.field3923;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3921 = arg0;
            this.field3917 = Integer.MIN_VALUE;
            this.field3920 = -this.field3929 / arg0;
            this.field3930 = -this.field3925 / arg0;
            this.field3926 = -this.field3923 / arg0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I[B[IIIIIIIILfa;)I")
    private static final int method1720(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class257 arg10) {
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
        arg10.field3928 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljk;II)Lfa;")
    public static final class257 method1721(class260 arg0, int arg1, int arg2) {
        return arg0.field3956 != null && arg0.field3956.length != 0 ? new class257(arg0, (int) ((long) arg0.field3954 * 256L * (long) arg1 / (long) (class248.field3764 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "(I)V")
    public final synchronized void method1722(int arg0) {
        this.method1702(arg0 << 6, this.method1716());
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V")
    public final synchronized void method1723(int arg0, int arg1) {
        this.method1698(arg0, arg1, this.method1716());
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "([III)V")
    public final synchronized void method265(int[] arg0, int arg1, int arg2) {
        if (this.field3917 == 0 && this.field3921 == 0) {
            this.method249(arg2);
        } else {
            class260 var4 = (class260) super.field1398;
            int var5 = this.field3922 << 8;
            int var6 = this.field3931 << 8;
            int var7 = var4.field3956.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3927 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3928 < 0) {
                if (this.field3924 <= 0) {
                    this.method1725();
                    this.method538(117);
                    return;
                }
                this.field3928 = 0;
            }
            if (this.field3928 >= var7) {
                if (this.field3924 >= 0) {
                    this.method1725();
                    this.method538(77);
                    return;
                }
                this.field3928 = var7 - 1;
            }
            if (this.field3927 < 0) {
                if (this.field3919) {
                    if (this.field3924 < 0) {
                        var9 = this.method1731(arg0, arg1, var5, var10, var4.field3956[this.field3922]);
                        if (this.field3928 >= var5) {
                            return;
                        }
                        this.field3928 = var5 + var5 - 1 - this.field3928;
                        this.field3924 = -this.field3924;
                    }
                    while (true) {
                        int var11 = this.method1701(arg0, var9, var6, var10, var4.field3956[this.field3931 - 1]);
                        if (this.field3928 < var6) {
                            return;
                        }
                        this.field3928 = var6 + var6 - 1 - this.field3928;
                        this.field3924 = -this.field3924;
                        var9 = this.method1731(arg0, var11, var5, var10, var4.field3956[this.field3922]);
                        if (this.field3928 >= var5) {
                            return;
                        }
                        this.field3928 = var5 + var5 - 1 - this.field3928;
                        this.field3924 = -this.field3924;
                    }
                } else if (this.field3924 < 0) {
                    while (true) {
                        var9 = this.method1731(arg0, var9, var5, var10, var4.field3956[this.field3931 - 1]);
                        if (this.field3928 >= var5) {
                            return;
                        }
                        this.field3928 = var6 - 1 - (var6 - 1 - this.field3928) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1701(arg0, var9, var6, var10, var4.field3956[this.field3922]);
                        if (this.field3928 < var6) {
                            return;
                        }
                        this.field3928 = (this.field3928 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3927 > 0) {
                    if (this.field3919) {
                        label130: {
                            if (this.field3924 < 0) {
                                var9 = this.method1731(arg0, arg1, var5, var10, var4.field3956[this.field3922]);
                                if (this.field3928 >= var5) {
                                    return;
                                }
                                this.field3928 = var5 + var5 - 1 - this.field3928;
                                this.field3924 = -this.field3924;
                                if (--this.field3927 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1701(arg0, var9, var6, var10, var4.field3956[this.field3931 - 1]);
                                if (this.field3928 < var6) {
                                    return;
                                }
                                this.field3928 = var6 + var6 - 1 - this.field3928;
                                this.field3924 = -this.field3924;
                                if (--this.field3927 == 0) {
                                    break;
                                }
                                var9 = this.method1731(arg0, var9, var5, var10, var4.field3956[this.field3922]);
                                if (this.field3928 >= var5) {
                                    return;
                                }
                                this.field3928 = var5 + var5 - 1 - this.field3928;
                                this.field3924 = -this.field3924;
                            } while (--this.field3927 != 0);
                        }
                    } else if (this.field3924 < 0) {
                        while (true) {
                            var9 = this.method1731(arg0, var9, var5, var10, var4.field3956[this.field3931 - 1]);
                            if (this.field3928 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3928) / var8;
                            if (var12 >= this.field3927) {
                                this.field3928 += this.field3927 * var8;
                                this.field3927 = 0;
                                break;
                            }
                            this.field3928 += var8 * var12;
                            this.field3927 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1701(arg0, var9, var6, var10, var4.field3956[this.field3922]);
                            if (this.field3928 < var6) {
                                return;
                            }
                            int var13 = (this.field3928 - var5) / var8;
                            if (var13 >= this.field3927) {
                                this.field3928 -= this.field3927 * var8;
                                this.field3927 = 0;
                                break;
                            }
                            this.field3928 -= var8 * var13;
                            this.field3927 -= var13;
                        }
                    }
                }
                if (this.field3924 < 0) {
                    this.method1731(arg0, var9, 0, var10, 0);
                    if (this.field3928 < 0) {
                        this.field3928 = -1;
                        this.method1725();
                        this.method538(127);
                        return;
                    }
                } else {
                    this.method1701(arg0, var9, var7, var10, 0);
                    if (this.field3928 >= var7) {
                        this.field3928 = var7;
                        this.method1725();
                        this.method538(89);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "([B[IIIIIIILfa;)I")
    private static final int method1724(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class257 arg8) {
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
        arg8.field3928 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "()V")
    private final void method1725() {
        if (this.field3921 != 0) {
            if (this.field3917 == Integer.MIN_VALUE) {
                this.field3917 = 0;
            }
            this.field3921 = 0;
            this.method1705();
        }
    }

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)V")
    public final synchronized void method1726(int arg0) {
        int var2 = ((class260) super.field1398).field3956.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3928 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([B[IIIIIIIILfa;)I")
    private static final int method1727(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class257 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3925 += (var14 - arg3) * arg9.field3930;
        arg9.field3923 += (var14 - arg3) * arg9.field3926;
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
        arg9.field3929 = var12 >> 2;
        arg9.field3928 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)I")
    private static final int method1728(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "([B[IIIIIIIILfa;)I")
    private static final int method1729(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class257 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3925 += (var14 - arg3) * arg9.field3930;
        arg9.field3923 += (var14 - arg3) * arg9.field3926;
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
        arg9.field3929 = var12 >> 2;
        arg9.field3928 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II[B[IIIIIIIIIILfa;II)I")
    private static final int method1730(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class257 arg13, int arg14, int arg15) {
        arg13.field3929 -= arg13.field3920 * arg5;
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
        arg13.field3929 += arg13.field3920 * var22;
        arg13.field3925 = arg6;
        arg13.field3923 = arg7;
        arg13.field3928 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "([IIIII)I")
    private final int method1731(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3921 <= 0) {
                if (this.field3924 == -256 && (this.field3928 & 255) == 0) {
                    if (class275.field4153) {
                        return method1709(0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, 0, arg3, arg2, this);
                    }
                    return method1715(((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, 0, arg3, arg2, this);
                }
                if (class275.field4153) {
                    return method1714(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, 0, arg3, arg2, this, this.field3924, arg4);
                }
                return method1699(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, 0, arg3, arg2, this, this.field3924, arg4);
            }
            int var6 = this.field3921 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3921 += arg1;
            if (this.field3924 == -256 && (this.field3928 & 255) == 0) {
                if (class275.field4153) {
                    arg1 = method1734(0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, this.field3930, this.field3926, 0, var6, arg2, this);
                } else {
                    arg1 = method1729(((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, this.field3920, 0, var6, arg2, this);
                }
            } else if (class275.field4153) {
                arg1 = method1730(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3925, this.field3923, this.field3930, this.field3926, 0, var6, arg2, this, this.field3924, arg4);
            } else {
                arg1 = method1710(0, 0, ((class260) super.field1398).field3956, arg0, this.field3928, arg1, this.field3929, this.field3920, 0, var6, arg2, this, this.field3924, arg4);
            }
            this.field3921 -= arg1;
            if (this.field3921 != 0) {
                return arg1;
            }
        } while (!this.method1707());
        return arg3;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II[B[IIIIIIILfa;II)I")
    private static final int method1732(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class257 arg10, int arg11, int arg12) {
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
        arg10.field3928 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "()Z")
    public final boolean method1733() {
        return this.field3928 < 0 || this.field3928 >= ((class260) super.field1398).field3956.length << 8;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I[B[IIIIIIIIIILfa;)I")
    private static final int method1734(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class257 arg12) {
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
        arg12.field3929 += (var19 - arg4) * arg12.field3920;
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
        arg12.field3925 = var15 >> 2;
        arg12.field3923 = var16 >> 2;
        arg12.field3928 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()Lai;")
    public final class88 method257() {
        return null;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
    public final synchronized void method249(int arg0) {
        if (this.field3921 > 0) {
            if (arg0 >= this.field3921) {
                if (this.field3917 == Integer.MIN_VALUE) {
                    this.field3917 = 0;
                    this.field3929 = this.field3925 = this.field3923 = 0;
                    this.method538(67);
                    arg0 = this.field3921;
                }
                this.field3921 = 0;
                this.method1705();
            } else {
                this.field3929 += this.field3920 * arg0;
                this.field3925 += this.field3930 * arg0;
                this.field3923 += this.field3926 * arg0;
                this.field3921 -= arg0;
            }
        }
        class260 var2 = (class260) super.field1398;
        int var3 = this.field3922 << 8;
        int var4 = this.field3931 << 8;
        int var5 = var2.field3956.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3927 = 0;
        }
        if (this.field3928 < 0) {
            if (this.field3924 <= 0) {
                this.method1725();
                this.method538(64);
                return;
            }
            this.field3928 = 0;
        }
        if (this.field3928 >= var5) {
            if (this.field3924 >= 0) {
                this.method1725();
                this.method538(102);
                return;
            }
            this.field3928 = var5 - 1;
        }
        this.field3928 += this.field3924 * arg0;
        if (this.field3927 < 0) {
            if (!this.field3919) {
                if (this.field3924 < 0) {
                    if (this.field3928 < var3) {
                        this.field3928 = var4 - 1 - (var4 - 1 - this.field3928) % var6;
                    }
                } else if (this.field3928 >= var4) {
                    this.field3928 = (this.field3928 - var3) % var6 + var3;
                }
            } else {
                if (this.field3924 < 0) {
                    if (this.field3928 >= var3) {
                        return;
                    }
                    this.field3928 = var3 + var3 - 1 - this.field3928;
                    this.field3924 = -this.field3924;
                }
                while (this.field3928 >= var4) {
                    this.field3928 = var4 + var4 - 1 - this.field3928;
                    this.field3924 = -this.field3924;
                    if (this.field3928 >= var3) {
                        return;
                    }
                    this.field3928 = var3 + var3 - 1 - this.field3928;
                    this.field3924 = -this.field3924;
                }
            }
        } else {
            if (this.field3927 > 0) {
                if (this.field3919) {
                    label125: {
                        if (this.field3924 < 0) {
                            if (this.field3928 >= var3) {
                                return;
                            }
                            this.field3928 = var3 + var3 - 1 - this.field3928;
                            this.field3924 = -this.field3924;
                            if (--this.field3927 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3928 < var4) {
                                return;
                            }
                            this.field3928 = var4 + var4 - 1 - this.field3928;
                            this.field3924 = -this.field3924;
                            if (--this.field3927 == 0) {
                                break;
                            }
                            if (this.field3928 >= var3) {
                                return;
                            }
                            this.field3928 = var3 + var3 - 1 - this.field3928;
                            this.field3924 = -this.field3924;
                        } while (--this.field3927 != 0);
                    }
                } else if (this.field3924 < 0) {
                    if (this.field3928 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3928) / var6;
                    if (var7 < this.field3927) {
                        this.field3928 += var6 * var7;
                        this.field3927 -= var7;
                        return;
                    }
                    this.field3928 += this.field3927 * var6;
                    this.field3927 = 0;
                } else {
                    if (this.field3928 < var4) {
                        return;
                    }
                    int var8 = (this.field3928 - var3) / var6;
                    if (var8 < this.field3927) {
                        this.field3928 -= var6 * var8;
                        this.field3927 -= var8;
                        return;
                    }
                    this.field3928 -= this.field3927 * var6;
                    this.field3927 = 0;
                }
            }
            if (this.field3924 < 0) {
                if (this.field3928 < 0) {
                    this.field3928 = -1;
                    this.method1725();
                    this.method538(68);
                    return;
                }
            } else if (this.field3928 >= var5) {
                this.field3928 = var5;
                this.method1725();
                this.method538(117);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljk;II)V")
    private class257(class260 arg0, int arg1, int arg2) {
        super.field1398 = arg0;
        this.field3922 = arg0.field3955;
        this.field3931 = arg0.field3957;
        this.field3919 = arg0.field3958;
        this.field3924 = arg1;
        this.field3917 = arg2;
        this.field3918 = 8192;
        this.field3928 = 0;
        this.method1705();
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljk;III)V")
    private class257(class260 arg0, int arg1, int arg2, int arg3) {
        super.field1398 = arg0;
        this.field3922 = arg0.field3955;
        this.field3931 = arg0.field3957;
        this.field3919 = arg0.field3958;
        this.field3924 = arg1;
        this.field3917 = arg2;
        this.field3918 = arg3;
        this.field3928 = 0;
        this.method1705();
    }
}
