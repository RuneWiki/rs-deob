import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class263 extends class348 {

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    private int field3663;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Z")
    private boolean field3676;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field3667;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    private int field3669;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private int field3674;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    private int field3665;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    private int field3666;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field3670;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    private int field3671;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public final synchronized void method1627(int arg0) {
        if (arg0 == 0) {
            this.method1636(0);
            this.method1182(28818);
        } else if (this.field3670 == 0 && this.field3672 == 0) {
            this.field3665 = 0;
            this.field3667 = 0;
            this.field3673 = 0;
            this.method1182(28818);
        } else {
            int var2 = -this.field3673;
            if (this.field3673 > var2) {
                var2 = this.field3673;
            }
            if (-this.field3670 > var2) {
                var2 = -this.field3670;
            }
            if (this.field3670 > var2) {
                var2 = this.field3670;
            }
            if (-this.field3672 > var2) {
                var2 = -this.field3672;
            }
            if (this.field3672 > var2) {
                var2 = this.field3672;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3665 = arg0;
            this.field3667 = Integer.MIN_VALUE;
            this.field3671 = -this.field3673 / arg0;
            this.field3664 = -this.field3670 / arg0;
            this.field3666 = -this.field3672 / arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()Lgh;")
    public final class348 method270() {
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()V")
    private final void method1628() {
        if (this.field3665 != 0) {
            if (this.field3667 == Integer.MIN_VALUE) {
                this.field3667 = 0;
            }
            this.field3665 = 0;
            this.method1662();
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()I")
    public final synchronized int method1629() {
        return this.field3667 == Integer.MIN_VALUE ? 0 : this.field3667;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    private static final int method1630(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lcu;II)Llc;")
    public static final class263 method1631(class144 arg0, int arg1, int arg2) {
        return arg0.field2013 != null && arg0.field2013.length != 0 ? new class263(arg0, (int) ((long) arg0.field2012 * 256L * (long) arg1 / (long) (class245.field3463 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()I")
    public final synchronized int method1632() {
        return this.field3669 < 0 ? -1 : this.field3669;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B[IIIIIIIILlc;)I")
    private static final int method1633(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class263 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3670 += (var14 - arg3) * arg9.field3664;
        arg9.field3672 += (var14 - arg3) * arg9.field3666;
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
        arg9.field3673 = var12 >> 2;
        arg9.field3674 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "()Z")
    public final boolean method1634() {
        return this.field3665 != 0;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public final synchronized void method1635(int arg0) {
        this.method1645(arg0 << 6, this.method1632());
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    private final synchronized void method1636(int arg0) {
        this.method1645(arg0, this.method1632());
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIIIIILlc;II)I")
    private static final int method1637(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class263 arg13, int arg14, int arg15) {
        arg13.field3673 -= arg13.field3671 * arg5;
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
        arg13.field3673 += arg13.field3671 * var22;
        arg13.field3670 = arg6;
        arg13.field3672 = arg7;
        arg13.field3674 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)I")
    private final int method1638(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3665 <= 0) {
                if (this.field3677 == 256 && (this.field3674 & 255) == 0) {
                    if (class55.field899) {
                        return method1661(0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, 0, arg3, arg2, this);
                    }
                    return method1647(((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, 0, arg3, arg2, this);
                }
                if (class55.field899) {
                    return method1650(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, 0, arg3, arg2, this, this.field3677, arg4);
                }
                return method1652(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, 0, arg3, arg2, this, this.field3677, arg4);
            }
            int var6 = this.field3665 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3665 += arg1;
            if (this.field3677 == 256 && (this.field3674 & 255) == 0) {
                if (class55.field899) {
                    arg1 = method1663(0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, this.field3664, this.field3666, 0, var6, arg2, this);
                } else {
                    arg1 = method1633(((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, this.field3671, 0, var6, arg2, this);
                }
            } else if (class55.field899) {
                arg1 = method1666(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, this.field3664, this.field3666, 0, var6, arg2, this, this.field3677, arg4);
            } else {
                arg1 = method1639(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, this.field3671, 0, var6, arg2, this, this.field3677, arg4);
            }
            this.field3665 -= arg1;
            if (this.field3665 != 0) {
                return arg1;
            }
        } while (!this.method1649());
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method1639(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class263 arg11, int arg12, int arg13) {
        arg11.field3670 -= arg11.field3664 * arg5;
        arg11.field3672 -= arg11.field3666 * arg5;
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
        arg11.field3670 += arg11.field3664 * arg5;
        arg11.field3672 += arg11.field3666 * arg5;
        arg11.field3673 = arg6;
        arg11.field3674 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public final synchronized void method1640(int arg0) {
        this.field3668 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final synchronized void method1641(boolean arg0) {
        this.field3677 = (this.field3677 >>> 31) + (this.field3677 ^ this.field3677 >> 31);
        if (arg0) {
            this.field3677 = -this.field3677;
        }
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "()I")
    public final synchronized int method1642() {
        return this.field3677 < 0 ? -this.field3677 : this.field3677;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIILlc;II)I")
    private static final int method1643(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class263 arg10, int arg11, int arg12) {
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
        arg10.field3674 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B[IIIIIIILlc;)I")
    private static final int method1644(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class263 arg8) {
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
        arg8.field3674 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    private final synchronized void method1645(int arg0, int arg1) {
        this.field3667 = arg0;
        this.field3669 = arg1;
        this.field3665 = 0;
        this.method1662();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    public final synchronized void method1646(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1645(arg1, arg2);
        } else {
            int var4 = method1630(arg1, arg2);
            int var5 = method1656(arg1, arg2);
            if (this.field3670 == var4 && this.field3672 == var5) {
                this.field3665 = 0;
            } else {
                int var6 = arg1 - this.field3673;
                if (this.field3673 - arg1 > var6) {
                    var6 = this.field3673 - arg1;
                }
                if (var4 - this.field3670 > var6) {
                    var6 = var4 - this.field3670;
                }
                if (this.field3670 - var4 > var6) {
                    var6 = this.field3670 - var4;
                }
                if (var5 - this.field3672 > var6) {
                    var6 = var5 - this.field3672;
                }
                if (this.field3672 - var5 > var6) {
                    var6 = this.field3672 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3665 = arg0;
                this.field3667 = arg1;
                this.field3669 = arg2;
                this.field3671 = (arg1 - this.field3673) / arg0;
                this.field3664 = (var4 - this.field3670) / arg0;
                this.field3666 = (var5 - this.field3672) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B[IIIIIIILlc;)I")
    private static final int method1647(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class263 arg8) {
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
        arg8.field3674 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
    public final synchronized void method1648(int arg0) {
        if (this.field3677 < 0) {
            this.field3677 = -arg0;
        } else {
            this.field3677 = arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "()Z")
    private final boolean method1649() {
        int var1 = this.field3667;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1630(var1, this.field3669);
            var2 = method1656(var1, this.field3669);
        }
        if (this.field3673 == var1 && this.field3670 == var3 && this.field3672 == var2) {
            if (this.field3667 == Integer.MIN_VALUE) {
                this.field3667 = 0;
                this.field3673 = this.field3670 = this.field3672 = 0;
                this.method1182(28818);
                return true;
            } else {
                this.method1662();
                return false;
            }
        } else {
            if (this.field3673 < var1) {
                this.field3671 = 1;
                this.field3665 = var1 - this.field3673;
            } else if (this.field3673 > var1) {
                this.field3671 = -1;
                this.field3665 = this.field3673 - var1;
            } else {
                this.field3671 = 0;
            }
            if (this.field3670 < var3) {
                this.field3664 = 1;
                if (this.field3665 == 0 || this.field3665 > var3 - this.field3670) {
                    this.field3665 = var3 - this.field3670;
                }
            } else if (this.field3670 > var3) {
                this.field3664 = -1;
                if (this.field3665 == 0 || this.field3665 > this.field3670 - var3) {
                    this.field3665 = this.field3670 - var3;
                }
            } else {
                this.field3664 = 0;
            }
            if (this.field3672 < var2) {
                this.field3666 = 1;
                if (this.field3665 == 0 || this.field3665 > var2 - this.field3672) {
                    this.field3665 = var2 - this.field3672;
                }
            } else if (this.field3672 > var2) {
                this.field3666 = -1;
                if (this.field3665 == 0 || this.field3665 > this.field3672 - var2) {
                    this.field3665 = this.field3672 - var2;
                }
            } else {
                this.field3666 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method1650(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class263 arg11, int arg12, int arg13) {
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
        arg11.field3674 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B[IIIIIIIIIILlc;)I")
    private static final int method1651(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class263 arg12) {
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
        arg12.field3673 += (var19 - arg4) * arg12.field3671;
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
        arg12.field3670 = var15 >> 2;
        arg12.field3672 = var16 >> 2;
        arg12.field3674 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIILlc;II)I")
    private static final int method1652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class263 arg10, int arg11, int arg12) {
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
        arg10.field3674 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public final synchronized void method294(int arg0) {
        if (this.field3665 > 0) {
            if (arg0 >= this.field3665) {
                if (this.field3667 == Integer.MIN_VALUE) {
                    this.field3667 = 0;
                    this.field3673 = this.field3670 = this.field3672 = 0;
                    this.method1182(28818);
                    arg0 = this.field3665;
                }
                this.field3665 = 0;
                this.method1662();
            } else {
                this.field3673 += this.field3671 * arg0;
                this.field3670 += this.field3664 * arg0;
                this.field3672 += this.field3666 * arg0;
                this.field3665 -= arg0;
            }
        }
        class144 var2 = (class144) super.field4761;
        int var3 = this.field3663 << 8;
        int var4 = this.field3675 << 8;
        int var5 = var2.field2013.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3668 = 0;
        }
        if (this.field3674 < 0) {
            if (this.field3677 <= 0) {
                this.method1628();
                this.method1182(28818);
                return;
            }
            this.field3674 = 0;
        }
        if (this.field3674 >= var5) {
            if (this.field3677 >= 0) {
                this.method1628();
                this.method1182(28818);
                return;
            }
            this.field3674 = var5 - 1;
        }
        this.field3674 += this.field3677 * arg0;
        if (this.field3668 < 0) {
            if (!this.field3676) {
                if (this.field3677 < 0) {
                    if (this.field3674 < var3) {
                        this.field3674 = var4 - 1 - (var4 - 1 - this.field3674) % var6;
                    }
                } else if (this.field3674 >= var4) {
                    this.field3674 = (this.field3674 - var3) % var6 + var3;
                }
            } else {
                if (this.field3677 < 0) {
                    if (this.field3674 >= var3) {
                        return;
                    }
                    this.field3674 = var3 + var3 - 1 - this.field3674;
                    this.field3677 = -this.field3677;
                }
                while (this.field3674 >= var4) {
                    this.field3674 = var4 + var4 - 1 - this.field3674;
                    this.field3677 = -this.field3677;
                    if (this.field3674 >= var3) {
                        return;
                    }
                    this.field3674 = var3 + var3 - 1 - this.field3674;
                    this.field3677 = -this.field3677;
                }
            }
        } else {
            if (this.field3668 > 0) {
                if (this.field3676) {
                    label125: {
                        if (this.field3677 < 0) {
                            if (this.field3674 >= var3) {
                                return;
                            }
                            this.field3674 = var3 + var3 - 1 - this.field3674;
                            this.field3677 = -this.field3677;
                            if (--this.field3668 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3674 < var4) {
                                return;
                            }
                            this.field3674 = var4 + var4 - 1 - this.field3674;
                            this.field3677 = -this.field3677;
                            if (--this.field3668 == 0) {
                                break;
                            }
                            if (this.field3674 >= var3) {
                                return;
                            }
                            this.field3674 = var3 + var3 - 1 - this.field3674;
                            this.field3677 = -this.field3677;
                        } while (--this.field3668 != 0);
                    }
                } else if (this.field3677 < 0) {
                    if (this.field3674 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3674) / var6;
                    if (var7 < this.field3668) {
                        this.field3674 += var6 * var7;
                        this.field3668 -= var7;
                        return;
                    }
                    this.field3674 += this.field3668 * var6;
                    this.field3668 = 0;
                } else {
                    if (this.field3674 < var4) {
                        return;
                    }
                    int var8 = (this.field3674 - var3) / var6;
                    if (var8 < this.field3668) {
                        this.field3674 -= var6 * var8;
                        this.field3668 -= var8;
                        return;
                    }
                    this.field3674 -= this.field3668 * var6;
                    this.field3668 = 0;
                }
            }
            if (this.field3677 < 0) {
                if (this.field3674 < 0) {
                    this.field3674 = -1;
                    this.method1628();
                    this.method1182(28818);
                    return;
                }
            } else if (this.field3674 >= var5) {
                this.field3674 = var5;
                this.method1628();
                this.method1182(28818);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()Lgh;")
    public final class348 method278() {
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()I")
    public final int method1653() {
        int var1 = this.field3673 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3668 == 0) {
            var2 -= this.field3674 * var2 / (((class144) super.field4761).field2013.length << 8);
        } else if (this.field3668 >= 0) {
            var2 -= this.field3663 * var2 / ((class144) super.field4761).field2013.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "()Z")
    public final boolean method1654() {
        return this.field3674 < 0 || this.field3674 >= ((class144) super.field4761).field2013.length << 8;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B[IIIIIIIILlc;)I")
    private static final int method1655(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class263 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3670 += (var14 - arg3) * arg9.field3664;
        arg9.field3672 += (var14 - arg3) * arg9.field3666;
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
        arg9.field3673 = var12 >> 2;
        arg9.field3674 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)I")
    private static final int method1656(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V")
    public final synchronized void method267(int[] arg0, int arg1, int arg2) {
        if (this.field3667 == 0 && this.field3665 == 0) {
            this.method294(arg2);
        } else {
            class144 var4 = (class144) super.field4761;
            int var5 = this.field3663 << 8;
            int var6 = this.field3675 << 8;
            int var7 = var4.field2013.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3668 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3674 < 0) {
                if (this.field3677 <= 0) {
                    this.method1628();
                    this.method1182(28818);
                    return;
                }
                this.field3674 = 0;
            }
            if (this.field3674 >= var7) {
                if (this.field3677 >= 0) {
                    this.method1628();
                    this.method1182(28818);
                    return;
                }
                this.field3674 = var7 - 1;
            }
            if (this.field3668 < 0) {
                if (this.field3676) {
                    if (this.field3677 < 0) {
                        var9 = this.method1664(arg0, arg1, var5, var10, var4.field2013[this.field3663]);
                        if (this.field3674 >= var5) {
                            return;
                        }
                        this.field3674 = var5 + var5 - 1 - this.field3674;
                        this.field3677 = -this.field3677;
                    }
                    while (true) {
                        int var11 = this.method1638(arg0, var9, var6, var10, var4.field2013[this.field3675 - 1]);
                        if (this.field3674 < var6) {
                            return;
                        }
                        this.field3674 = var6 + var6 - 1 - this.field3674;
                        this.field3677 = -this.field3677;
                        var9 = this.method1664(arg0, var11, var5, var10, var4.field2013[this.field3663]);
                        if (this.field3674 >= var5) {
                            return;
                        }
                        this.field3674 = var5 + var5 - 1 - this.field3674;
                        this.field3677 = -this.field3677;
                    }
                } else if (this.field3677 < 0) {
                    while (true) {
                        var9 = this.method1664(arg0, var9, var5, var10, var4.field2013[this.field3675 - 1]);
                        if (this.field3674 >= var5) {
                            return;
                        }
                        this.field3674 = var6 - 1 - (var6 - 1 - this.field3674) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1638(arg0, var9, var6, var10, var4.field2013[this.field3663]);
                        if (this.field3674 < var6) {
                            return;
                        }
                        this.field3674 = (this.field3674 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3668 > 0) {
                    if (this.field3676) {
                        label130: {
                            if (this.field3677 < 0) {
                                var9 = this.method1664(arg0, arg1, var5, var10, var4.field2013[this.field3663]);
                                if (this.field3674 >= var5) {
                                    return;
                                }
                                this.field3674 = var5 + var5 - 1 - this.field3674;
                                this.field3677 = -this.field3677;
                                if (--this.field3668 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1638(arg0, var9, var6, var10, var4.field2013[this.field3675 - 1]);
                                if (this.field3674 < var6) {
                                    return;
                                }
                                this.field3674 = var6 + var6 - 1 - this.field3674;
                                this.field3677 = -this.field3677;
                                if (--this.field3668 == 0) {
                                    break;
                                }
                                var9 = this.method1664(arg0, var9, var5, var10, var4.field2013[this.field3663]);
                                if (this.field3674 >= var5) {
                                    return;
                                }
                                this.field3674 = var5 + var5 - 1 - this.field3674;
                                this.field3677 = -this.field3677;
                            } while (--this.field3668 != 0);
                        }
                    } else if (this.field3677 < 0) {
                        while (true) {
                            var9 = this.method1664(arg0, var9, var5, var10, var4.field2013[this.field3675 - 1]);
                            if (this.field3674 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3674) / var8;
                            if (var12 >= this.field3668) {
                                this.field3674 += this.field3668 * var8;
                                this.field3668 = 0;
                                break;
                            }
                            this.field3674 += var8 * var12;
                            this.field3668 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1638(arg0, var9, var6, var10, var4.field2013[this.field3663]);
                            if (this.field3674 < var6) {
                                return;
                            }
                            int var13 = (this.field3674 - var5) / var8;
                            if (var13 >= this.field3668) {
                                this.field3674 -= this.field3668 * var8;
                                this.field3668 = 0;
                                break;
                            }
                            this.field3674 -= var8 * var13;
                            this.field3668 -= var13;
                        }
                    }
                }
                if (this.field3677 < 0) {
                    this.method1664(arg0, var9, 0, var10, 0);
                    if (this.field3674 < 0) {
                        this.field3674 = -1;
                        this.method1628();
                        this.method1182(28818);
                        return;
                    }
                } else {
                    this.method1638(arg0, var9, var7, var10, 0);
                    if (this.field3674 >= var7) {
                        this.field3674 = var7;
                        this.method1628();
                        this.method1182(28818);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method1657(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class263 arg11, int arg12, int arg13) {
        arg11.field3670 -= arg11.field3664 * arg5;
        arg11.field3672 -= arg11.field3666 * arg5;
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
        arg11.field3670 += arg11.field3664 * arg5;
        arg11.field3672 += arg11.field3666 * arg5;
        arg11.field3673 = arg6;
        arg11.field3674 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
    public final synchronized void method1658(int arg0, int arg1) {
        this.method1646(arg0, arg1, this.method1632());
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B[IIIIIIIILlc;)I")
    private static final int method1659(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class263 arg10) {
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
        arg10.field3674 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lcu;III)Llc;")
    public static final class263 method1660(class144 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2013 != null && arg0.field2013.length != 0 ? new class263(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I[B[IIIIIIIILlc;)I")
    private static final int method1661(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class263 arg10) {
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
        arg10.field3674 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "()V")
    private final void method1662() {
        this.field3673 = this.field3667;
        this.field3670 = method1630(this.field3667, this.field3669);
        this.field3672 = method1656(this.field3667, this.field3669);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I[B[IIIIIIIIIILlc;)I")
    private static final int method1663(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class263 arg12) {
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
        arg12.field3673 += (var19 - arg4) * arg12.field3671;
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
        arg12.field3670 = var15 >> 2;
        arg12.field3672 = var16 >> 2;
        arg12.field3674 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lcu;II)V")
    private class263(class144 arg0, int arg1, int arg2) {
        super.field4761 = arg0;
        this.field3663 = arg0.field2014;
        this.field3675 = arg0.field2015;
        this.field3676 = arg0.field2011;
        this.field3677 = arg1;
        this.field3667 = arg2;
        this.field3669 = 8192;
        this.field3674 = 0;
        this.method1662();
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()I")
    public final int method286() {
        return this.field3667 == 0 && this.field3665 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([IIIII)I")
    private final int method1664(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3665 <= 0) {
                if (this.field3677 == -256 && (this.field3674 & 255) == 0) {
                    if (class55.field899) {
                        return method1659(0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, 0, arg3, arg2, this);
                    }
                    return method1644(((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, 0, arg3, arg2, this);
                }
                if (class55.field899) {
                    return method1667(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, 0, arg3, arg2, this, this.field3677, arg4);
                }
                return method1643(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, 0, arg3, arg2, this, this.field3677, arg4);
            }
            int var6 = this.field3665 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3665 += arg1;
            if (this.field3677 == -256 && (this.field3674 & 255) == 0) {
                if (class55.field899) {
                    arg1 = method1651(0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, this.field3664, this.field3666, 0, var6, arg2, this);
                } else {
                    arg1 = method1655(((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, this.field3671, 0, var6, arg2, this);
                }
            } else if (class55.field899) {
                arg1 = method1637(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3670, this.field3672, this.field3664, this.field3666, 0, var6, arg2, this, this.field3677, arg4);
            } else {
                arg1 = method1657(0, 0, ((class144) super.field4761).field2013, arg0, this.field3674, arg1, this.field3673, this.field3671, 0, var6, arg2, this, this.field3677, arg4);
            }
            this.field3665 -= arg1;
            if (this.field3665 != 0) {
                return arg1;
            }
        } while (!this.method1649());
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V")
    public final synchronized void method1665(int arg0) {
        int var2 = ((class144) super.field4761).field2013.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3674 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIIIIILlc;II)I")
    private static final int method1666(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class263 arg13, int arg14, int arg15) {
        arg13.field3673 -= arg13.field3671 * arg5;
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
        arg13.field3673 += arg13.field3671 * var22;
        arg13.field3670 = arg6;
        arg13.field3672 = arg7;
        arg13.field3674 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lcu;III)V")
    private class263(class144 arg0, int arg1, int arg2, int arg3) {
        super.field4761 = arg0;
        this.field3663 = arg0.field2014;
        this.field3675 = arg0.field2015;
        this.field3676 = arg0.field2011;
        this.field3677 = arg1;
        this.field3667 = arg2;
        this.field3669 = arg3;
        this.field3674 = 0;
        this.method1662();
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II[B[IIIIIIIILlc;II)I")
    private static final int method1667(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class263 arg11, int arg12, int arg13) {
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
        arg11.field3674 = arg4;
        return var15 >> 1;
    }
}
