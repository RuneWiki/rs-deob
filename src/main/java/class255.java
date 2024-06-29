import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class255 extends class267 {

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    private int field4122;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field4123;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Z")
    private boolean field4134;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    private int field4129;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    private int field4135;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    private int field4127;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    private int field4126;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field4124;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    private int field4125;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    private int field4128;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    private int field4130;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    private int field4131;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    private int field4132;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private int field4133;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[B[IIIIIIIILta;II)I")
    private static final int method1717(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class255 arg11, int arg12, int arg13) {
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
        arg11.field4126 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()Z")
    public final boolean method1718() {
        return this.field4126 < 0 || this.field4126 >= ((class119) super.field4278).field1745.length << 8;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIII)I")
    private final int method1719(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4132 <= 0) {
                if (this.field4129 == 256 && (this.field4126 & 255) == 0) {
                    if (class72.field1013) {
                        return method1740(0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, 0, arg3, arg2, this);
                    }
                    return method1741(((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, 0, arg3, arg2, this);
                }
                if (class72.field1013) {
                    return method1754(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, 0, arg3, arg2, this, this.field4129, arg4);
                }
                return method1724(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, 0, arg3, arg2, this, this.field4129, arg4);
            }
            int var6 = this.field4132 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4132 += arg1;
            if (this.field4129 == 256 && (this.field4126 & 255) == 0) {
                if (class72.field1013) {
                    arg1 = method1737(0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, this.field4131, this.field4136, 0, var6, arg2, this);
                } else {
                    arg1 = method1745(((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, this.field4128, 0, var6, arg2, this);
                }
            } else if (class72.field1013) {
                arg1 = method1738(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, this.field4131, this.field4136, 0, var6, arg2, this, this.field4129, arg4);
            } else {
                arg1 = method1728(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, this.field4128, 0, var6, arg2, this, this.field4129, arg4);
            }
            this.field4132 -= arg1;
            if (this.field4132 != 0) {
                return arg1;
            }
        } while (!this.method1732());
        return arg3;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "()I")
    public final synchronized int method1720() {
        return this.field4135 == Integer.MIN_VALUE ? 0 : this.field4135;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public final synchronized void method1721(int arg0) {
        int var2 = ((class119) super.field4278).field1745.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4126 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
    public final int method710() {
        return this.field4135 == 0 && this.field4132 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II[B[IIIIIIIILta;II)I")
    private static final int method1722(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class255 arg11, int arg12, int arg13) {
        arg11.field4124 -= arg11.field4131 * arg5;
        arg11.field4130 -= arg11.field4136 * arg5;
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
        arg11.field4124 += arg11.field4131 * arg5;
        arg11.field4130 += arg11.field4136 * arg5;
        arg11.field4133 = arg6;
        arg11.field4126 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[B[IIIIIIIIIILta;II)I")
    private static final int method1723(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class255 arg13, int arg14, int arg15) {
        arg13.field4133 -= arg13.field4128 * arg5;
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
        arg13.field4133 += arg13.field4128 * var22;
        arg13.field4124 = arg6;
        arg13.field4130 = arg7;
        arg13.field4126 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[B[IIIIIIILta;II)I")
    private static final int method1724(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class255 arg10, int arg11, int arg12) {
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
        arg10.field4126 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lu;III)Lta;")
    public static final class255 method1725(class119 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1745 != null && arg0.field1745.length != 0 ? new class255(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[B[IIIIIIIIIILta;)I")
    private static final int method1726(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class255 arg12) {
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
        arg12.field4133 += (var19 - arg4) * arg12.field4128;
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
        arg12.field4124 = var15 >> 2;
        arg12.field4130 = var16 >> 2;
        arg12.field4126 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "()I")
    public final synchronized int method1727() {
        return this.field4127 < 0 ? -1 : this.field4127;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(II[B[IIIIIIIILta;II)I")
    private static final int method1728(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class255 arg11, int arg12, int arg13) {
        arg11.field4124 -= arg11.field4131 * arg5;
        arg11.field4130 -= arg11.field4136 * arg5;
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
        arg11.field4124 += arg11.field4131 * arg5;
        arg11.field4130 += arg11.field4136 * arg5;
        arg11.field4133 = arg6;
        arg11.field4126 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    public final synchronized void method1729(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1752(arg1, arg2);
        } else {
            int var4 = method1735(arg1, arg2);
            int var5 = method1757(arg1, arg2);
            if (this.field4124 == var4 && this.field4130 == var5) {
                this.field4132 = 0;
            } else {
                int var6 = arg1 - this.field4133;
                if (this.field4133 - arg1 > var6) {
                    var6 = this.field4133 - arg1;
                }
                if (var4 - this.field4124 > var6) {
                    var6 = var4 - this.field4124;
                }
                if (this.field4124 - var4 > var6) {
                    var6 = this.field4124 - var4;
                }
                if (var5 - this.field4130 > var6) {
                    var6 = var5 - this.field4130;
                }
                if (this.field4130 - var5 > var6) {
                    var6 = this.field4130 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4132 = arg0;
                this.field4135 = arg1;
                this.field4127 = arg2;
                this.field4128 = (arg1 - this.field4133) / arg0;
                this.field4131 = (var4 - this.field4124) / arg0;
                this.field4136 = (var5 - this.field4130) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public final synchronized void method1730(boolean arg0) {
        this.field4129 = (this.field4129 >>> 31) + (this.field4129 ^ this.field4129 >> 31);
        if (arg0) {
            this.field4129 = -this.field4129;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public final synchronized void method1731(int arg0) {
        if (arg0 == 0) {
            this.method1743(0);
            this.method784(false);
        } else if (this.field4124 == 0 && this.field4130 == 0) {
            this.field4132 = 0;
            this.field4135 = 0;
            this.field4133 = 0;
            this.method784(false);
        } else {
            int var2 = -this.field4133;
            if (this.field4133 > var2) {
                var2 = this.field4133;
            }
            if (-this.field4124 > var2) {
                var2 = -this.field4124;
            }
            if (this.field4124 > var2) {
                var2 = this.field4124;
            }
            if (-this.field4130 > var2) {
                var2 = -this.field4130;
            }
            if (this.field4130 > var2) {
                var2 = this.field4130;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4132 = arg0;
            this.field4135 = Integer.MIN_VALUE;
            this.field4128 = -this.field4133 / arg0;
            this.field4131 = -this.field4124 / arg0;
            this.field4136 = -this.field4130 / arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "()Z")
    private final boolean method1732() {
        int var1 = this.field4135;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1735(var1, this.field4127);
            var2 = method1757(var1, this.field4127);
        }
        if (this.field4133 == var1 && this.field4124 == var3 && this.field4130 == var2) {
            if (this.field4135 == Integer.MIN_VALUE) {
                this.field4135 = 0;
                this.field4133 = this.field4124 = this.field4130 = 0;
                this.method784(false);
                return true;
            } else {
                this.method1739();
                return false;
            }
        } else {
            if (this.field4133 < var1) {
                this.field4128 = 1;
                this.field4132 = var1 - this.field4133;
            } else if (this.field4133 > var1) {
                this.field4128 = -1;
                this.field4132 = this.field4133 - var1;
            } else {
                this.field4128 = 0;
            }
            if (this.field4124 < var3) {
                this.field4131 = 1;
                if (this.field4132 == 0 || this.field4132 > var3 - this.field4124) {
                    this.field4132 = var3 - this.field4124;
                }
            } else if (this.field4124 > var3) {
                this.field4131 = -1;
                if (this.field4132 == 0 || this.field4132 > this.field4124 - var3) {
                    this.field4132 = this.field4124 - var3;
                }
            } else {
                this.field4131 = 0;
            }
            if (this.field4130 < var2) {
                this.field4136 = 1;
                if (this.field4132 == 0 || this.field4132 > var2 - this.field4130) {
                    this.field4132 = var2 - this.field4130;
                }
            } else if (this.field4130 > var2) {
                this.field4136 = -1;
                if (this.field4132 == 0 || this.field4132 > this.field4130 - var2) {
                    this.field4132 = this.field4130 - var2;
                }
            } else {
                this.field4136 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public final synchronized void method1733(int arg0) {
        this.method1752(arg0 << 6, this.method1727());
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()Lof;")
    public final class267 method717() {
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public final synchronized void method1734(int arg0, int arg1) {
        this.method1729(arg0, arg1, this.method1727());
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)I")
    private static final int method1735(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    public final synchronized void method1736(int arg0) {
        if (this.field4129 < 0) {
            this.field4129 = -arg0;
        } else {
            this.field4129 = arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()Lof;")
    public final class267 method713() {
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I[B[IIIIIIIIIILta;)I")
    private static final int method1737(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class255 arg12) {
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
        arg12.field4133 += (var19 - arg4) * arg12.field4128;
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
        arg12.field4124 = var15 >> 2;
        arg12.field4130 = var16 >> 2;
        arg12.field4126 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II[B[IIIIIIIIIILta;II)I")
    private static final int method1738(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class255 arg13, int arg14, int arg15) {
        arg13.field4133 -= arg13.field4128 * arg5;
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
        arg13.field4133 += arg13.field4128 * var22;
        arg13.field4124 = arg6;
        arg13.field4130 = arg7;
        arg13.field4126 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "()V")
    private final void method1739() {
        this.field4133 = this.field4135;
        this.field4124 = method1735(this.field4135, this.field4127);
        this.field4130 = method1757(this.field4135, this.field4127);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[B[IIIIIIIILta;)I")
    private static final int method1740(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class255 arg10) {
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
        arg10.field4126 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B[IIIIIIILta;)I")
    private static final int method1741(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class255 arg8) {
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
        arg8.field4126 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II[B[IIIIIIILta;II)I")
    private static final int method1742(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class255 arg10, int arg11, int arg12) {
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
        arg10.field4126 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)V")
    public final synchronized void method712(int[] arg0, int arg1, int arg2) {
        if (this.field4135 == 0 && this.field4132 == 0) {
            this.method707(arg2);
        } else {
            class119 var4 = (class119) super.field4278;
            int var5 = this.field4122 << 8;
            int var6 = this.field4123 << 8;
            int var7 = var4.field1745.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4125 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4126 < 0) {
                if (this.field4129 <= 0) {
                    this.method1746();
                    this.method784(false);
                    return;
                }
                this.field4126 = 0;
            }
            if (this.field4126 >= var7) {
                if (this.field4129 >= 0) {
                    this.method1746();
                    this.method784(false);
                    return;
                }
                this.field4126 = var7 - 1;
            }
            if (this.field4125 < 0) {
                if (this.field4134) {
                    if (this.field4129 < 0) {
                        var9 = this.method1756(arg0, arg1, var5, var10, var4.field1745[this.field4122]);
                        if (this.field4126 >= var5) {
                            return;
                        }
                        this.field4126 = var5 + var5 - 1 - this.field4126;
                        this.field4129 = -this.field4129;
                    }
                    while (true) {
                        int var11 = this.method1719(arg0, var9, var6, var10, var4.field1745[this.field4123 - 1]);
                        if (this.field4126 < var6) {
                            return;
                        }
                        this.field4126 = var6 + var6 - 1 - this.field4126;
                        this.field4129 = -this.field4129;
                        var9 = this.method1756(arg0, var11, var5, var10, var4.field1745[this.field4122]);
                        if (this.field4126 >= var5) {
                            return;
                        }
                        this.field4126 = var5 + var5 - 1 - this.field4126;
                        this.field4129 = -this.field4129;
                    }
                } else if (this.field4129 < 0) {
                    while (true) {
                        var9 = this.method1756(arg0, var9, var5, var10, var4.field1745[this.field4123 - 1]);
                        if (this.field4126 >= var5) {
                            return;
                        }
                        this.field4126 = var6 - 1 - (var6 - 1 - this.field4126) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1719(arg0, var9, var6, var10, var4.field1745[this.field4122]);
                        if (this.field4126 < var6) {
                            return;
                        }
                        this.field4126 = (this.field4126 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4125 > 0) {
                    if (this.field4134) {
                        label130: {
                            if (this.field4129 < 0) {
                                var9 = this.method1756(arg0, arg1, var5, var10, var4.field1745[this.field4122]);
                                if (this.field4126 >= var5) {
                                    return;
                                }
                                this.field4126 = var5 + var5 - 1 - this.field4126;
                                this.field4129 = -this.field4129;
                                if (--this.field4125 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1719(arg0, var9, var6, var10, var4.field1745[this.field4123 - 1]);
                                if (this.field4126 < var6) {
                                    return;
                                }
                                this.field4126 = var6 + var6 - 1 - this.field4126;
                                this.field4129 = -this.field4129;
                                if (--this.field4125 == 0) {
                                    break;
                                }
                                var9 = this.method1756(arg0, var9, var5, var10, var4.field1745[this.field4122]);
                                if (this.field4126 >= var5) {
                                    return;
                                }
                                this.field4126 = var5 + var5 - 1 - this.field4126;
                                this.field4129 = -this.field4129;
                            } while (--this.field4125 != 0);
                        }
                    } else if (this.field4129 < 0) {
                        while (true) {
                            var9 = this.method1756(arg0, var9, var5, var10, var4.field1745[this.field4123 - 1]);
                            if (this.field4126 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4126) / var8;
                            if (var12 >= this.field4125) {
                                this.field4126 += this.field4125 * var8;
                                this.field4125 = 0;
                                break;
                            }
                            this.field4126 += var8 * var12;
                            this.field4125 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1719(arg0, var9, var6, var10, var4.field1745[this.field4122]);
                            if (this.field4126 < var6) {
                                return;
                            }
                            int var13 = (this.field4126 - var5) / var8;
                            if (var13 >= this.field4125) {
                                this.field4126 -= this.field4125 * var8;
                                this.field4125 = 0;
                                break;
                            }
                            this.field4126 -= var8 * var13;
                            this.field4125 -= var13;
                        }
                    }
                }
                if (this.field4129 < 0) {
                    this.method1756(arg0, var9, 0, var10, 0);
                    if (this.field4126 < 0) {
                        this.field4126 = -1;
                        this.method1746();
                        this.method784(false);
                        return;
                    }
                } else {
                    this.method1719(arg0, var9, var7, var10, 0);
                    if (this.field4126 >= var7) {
                        this.field4126 = var7;
                        this.method1746();
                        this.method784(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)V")
    private final synchronized void method1743(int arg0) {
        this.method1752(arg0, this.method1727());
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
    public final synchronized void method1744(int arg0) {
        this.field4125 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B[IIIIIIIILta;)I")
    private static final int method1745(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class255 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4124 += (var14 - arg3) * arg9.field4131;
        arg9.field4130 += (var14 - arg3) * arg9.field4136;
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
        arg9.field4133 = var12 >> 2;
        arg9.field4126 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "()V")
    private final void method1746() {
        if (this.field4132 != 0) {
            if (this.field4135 == Integer.MIN_VALUE) {
                this.field4135 = 0;
            }
            this.field4132 = 0;
            this.method1739();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lu;II)Lta;")
    public static final class255 method1747(class119 arg0, int arg1, int arg2) {
        return arg0.field1745 != null && arg0.field1745.length != 0 ? new class255(arg0, (int) ((long) arg0.field1744 * 256L * (long) arg1 / (long) (class290.field4582 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
    public final int method1748() {
        int var1 = this.field4133 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4125 == 0) {
            var2 -= this.field4126 * var2 / (((class119) super.field4278).field1745.length << 8);
        } else if (this.field4125 >= 0) {
            var2 -= this.field4122 * var2 / ((class119) super.field4278).field1745.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([B[IIIIIIIILta;)I")
    private static final int method1749(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class255 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4124 += (var14 - arg3) * arg9.field4131;
        arg9.field4130 += (var14 - arg3) * arg9.field4136;
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
        arg9.field4133 = var12 >> 2;
        arg9.field4126 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "()I")
    public final synchronized int method1750() {
        return this.field4129 < 0 ? -this.field4129 : this.field4129;
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "()Z")
    public final boolean method1751() {
        return this.field4132 != 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final synchronized void method707(int arg0) {
        if (this.field4132 > 0) {
            if (arg0 >= this.field4132) {
                if (this.field4135 == Integer.MIN_VALUE) {
                    this.field4135 = 0;
                    this.field4133 = this.field4124 = this.field4130 = 0;
                    this.method784(false);
                    arg0 = this.field4132;
                }
                this.field4132 = 0;
                this.method1739();
            } else {
                this.field4133 += this.field4128 * arg0;
                this.field4124 += this.field4131 * arg0;
                this.field4130 += this.field4136 * arg0;
                this.field4132 -= arg0;
            }
        }
        class119 var2 = (class119) super.field4278;
        int var3 = this.field4122 << 8;
        int var4 = this.field4123 << 8;
        int var5 = var2.field1745.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4125 = 0;
        }
        if (this.field4126 < 0) {
            if (this.field4129 <= 0) {
                this.method1746();
                this.method784(false);
                return;
            }
            this.field4126 = 0;
        }
        if (this.field4126 >= var5) {
            if (this.field4129 >= 0) {
                this.method1746();
                this.method784(false);
                return;
            }
            this.field4126 = var5 - 1;
        }
        this.field4126 += this.field4129 * arg0;
        if (this.field4125 < 0) {
            if (!this.field4134) {
                if (this.field4129 < 0) {
                    if (this.field4126 < var3) {
                        this.field4126 = var4 - 1 - (var4 - 1 - this.field4126) % var6;
                    }
                } else if (this.field4126 >= var4) {
                    this.field4126 = (this.field4126 - var3) % var6 + var3;
                }
            } else {
                if (this.field4129 < 0) {
                    if (this.field4126 >= var3) {
                        return;
                    }
                    this.field4126 = var3 + var3 - 1 - this.field4126;
                    this.field4129 = -this.field4129;
                }
                while (this.field4126 >= var4) {
                    this.field4126 = var4 + var4 - 1 - this.field4126;
                    this.field4129 = -this.field4129;
                    if (this.field4126 >= var3) {
                        return;
                    }
                    this.field4126 = var3 + var3 - 1 - this.field4126;
                    this.field4129 = -this.field4129;
                }
            }
        } else {
            if (this.field4125 > 0) {
                if (this.field4134) {
                    label125: {
                        if (this.field4129 < 0) {
                            if (this.field4126 >= var3) {
                                return;
                            }
                            this.field4126 = var3 + var3 - 1 - this.field4126;
                            this.field4129 = -this.field4129;
                            if (--this.field4125 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4126 < var4) {
                                return;
                            }
                            this.field4126 = var4 + var4 - 1 - this.field4126;
                            this.field4129 = -this.field4129;
                            if (--this.field4125 == 0) {
                                break;
                            }
                            if (this.field4126 >= var3) {
                                return;
                            }
                            this.field4126 = var3 + var3 - 1 - this.field4126;
                            this.field4129 = -this.field4129;
                        } while (--this.field4125 != 0);
                    }
                } else if (this.field4129 < 0) {
                    if (this.field4126 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4126) / var6;
                    if (var7 < this.field4125) {
                        this.field4126 += var6 * var7;
                        this.field4125 -= var7;
                        return;
                    }
                    this.field4126 += this.field4125 * var6;
                    this.field4125 = 0;
                } else {
                    if (this.field4126 < var4) {
                        return;
                    }
                    int var8 = (this.field4126 - var3) / var6;
                    if (var8 < this.field4125) {
                        this.field4126 -= var6 * var8;
                        this.field4125 -= var8;
                        return;
                    }
                    this.field4126 -= this.field4125 * var6;
                    this.field4125 = 0;
                }
            }
            if (this.field4129 < 0) {
                if (this.field4126 < 0) {
                    this.field4126 = -1;
                    this.method1746();
                    this.method784(false);
                    return;
                }
            } else if (this.field4126 >= var5) {
                this.field4126 = var5;
                this.method1746();
                this.method784(false);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)V")
    private final synchronized void method1752(int arg0, int arg1) {
        this.field4135 = arg0;
        this.field4127 = arg1;
        this.field4132 = 0;
        this.method1739();
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I[B[IIIIIIIILta;)I")
    private static final int method1753(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class255 arg10) {
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
        arg10.field4126 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(II[B[IIIIIIIILta;II)I")
    private static final int method1754(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class255 arg11, int arg12, int arg13) {
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
        arg11.field4126 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lu;II)V")
    private class255(class119 arg0, int arg1, int arg2) {
        super.field4278 = arg0;
        this.field4122 = arg0.field1743;
        this.field4123 = arg0.field1742;
        this.field4134 = arg0.field1746;
        this.field4129 = arg1;
        this.field4135 = arg2;
        this.field4127 = 8192;
        this.field4126 = 0;
        this.method1739();
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([B[IIIIIIILta;)I")
    private static final int method1755(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class255 arg8) {
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
        arg8.field4126 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([IIIII)I")
    private final int method1756(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4132 <= 0) {
                if (this.field4129 == -256 && (this.field4126 & 255) == 0) {
                    if (class72.field1013) {
                        return method1753(0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, 0, arg3, arg2, this);
                    }
                    return method1755(((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, 0, arg3, arg2, this);
                }
                if (class72.field1013) {
                    return method1717(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, 0, arg3, arg2, this, this.field4129, arg4);
                }
                return method1742(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, 0, arg3, arg2, this, this.field4129, arg4);
            }
            int var6 = this.field4132 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4132 += arg1;
            if (this.field4129 == -256 && (this.field4126 & 255) == 0) {
                if (class72.field1013) {
                    arg1 = method1726(0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, this.field4131, this.field4136, 0, var6, arg2, this);
                } else {
                    arg1 = method1749(((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, this.field4128, 0, var6, arg2, this);
                }
            } else if (class72.field1013) {
                arg1 = method1723(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4124, this.field4130, this.field4131, this.field4136, 0, var6, arg2, this, this.field4129, arg4);
            } else {
                arg1 = method1722(0, 0, ((class119) super.field4278).field1745, arg0, this.field4126, arg1, this.field4133, this.field4128, 0, var6, arg2, this, this.field4129, arg4);
            }
            this.field4132 -= arg1;
            if (this.field4132 != 0) {
                return arg1;
            }
        } while (!this.method1732());
        return arg3;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(II)I")
    private static final int method1757(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lu;III)V")
    private class255(class119 arg0, int arg1, int arg2, int arg3) {
        super.field4278 = arg0;
        this.field4122 = arg0.field1743;
        this.field4123 = arg0.field1742;
        this.field4134 = arg0.field1746;
        this.field4129 = arg1;
        this.field4135 = arg2;
        this.field4127 = arg3;
        this.field4126 = 0;
        this.method1739();
    }
}
