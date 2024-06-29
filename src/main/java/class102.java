import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class102 extends class194 {

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "Z")
    private boolean field1656;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "()Z")
    private final boolean method695() {
        int var1 = this.field1647;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method735(var1, this.field1644);
            var2 = method711(var1, this.field1644);
        }
        if (this.field1642 == var1 && this.field1651 == var3 && this.field1648 == var2) {
            if (this.field1647 == Integer.MIN_VALUE) {
                this.field1647 = 0;
                this.field1642 = this.field1651 = this.field1648 = 0;
                this.method913(-3542);
                return true;
            } else {
                this.method733();
                return false;
            }
        } else {
            if (this.field1642 < var1) {
                this.field1652 = 1;
                this.field1645 = var1 - this.field1642;
            } else if (this.field1642 > var1) {
                this.field1652 = -1;
                this.field1645 = this.field1642 - var1;
            } else {
                this.field1652 = 0;
            }
            if (this.field1651 < var3) {
                this.field1646 = 1;
                if (this.field1645 == 0 || this.field1645 > var3 - this.field1651) {
                    this.field1645 = var3 - this.field1651;
                }
            } else if (this.field1651 > var3) {
                this.field1646 = -1;
                if (this.field1645 == 0 || this.field1645 > this.field1651 - var3) {
                    this.field1645 = this.field1651 - var3;
                }
            } else {
                this.field1646 = 0;
            }
            if (this.field1648 < var2) {
                this.field1655 = 1;
                if (this.field1645 == 0 || this.field1645 > var2 - this.field1648) {
                    this.field1645 = var2 - this.field1648;
                }
            } else if (this.field1648 > var2) {
                this.field1655 = -1;
                if (this.field1645 == 0 || this.field1645 > this.field1648 - var2) {
                    this.field1645 = this.field1648 - var2;
                }
            } else {
                this.field1655 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B[IIIIIIIIIILoi;)I")
    private static final int method696(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class102 arg12) {
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
        arg12.field1642 += (var19 - arg4) * arg12.field1652;
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
        arg12.field1651 = var15 >> 2;
        arg12.field1648 = var16 >> 2;
        arg12.field1649 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "()I")
    public final synchronized int method697() {
        return this.field1644 < 0 ? -1 : this.field1644;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    private final synchronized void method698(int arg0, int arg1) {
        this.field1647 = arg0;
        this.field1644 = arg1;
        this.field1645 = 0;
        this.method733();
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
    private final synchronized void method699(int arg0) {
        this.method698(arg0, this.method697());
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([IIIII)I")
    private final int method700(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1645 <= 0) {
                if (this.field1653 == 256 && (this.field1649 & 255) == 0) {
                    if (class262.field4214) {
                        return method713(0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, 0, arg3, arg2, this);
                    }
                    return method738(((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, 0, arg3, arg2, this);
                }
                if (class262.field4214) {
                    return method736(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, 0, arg3, arg2, this, this.field1653, arg4);
                }
                return method701(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, 0, arg3, arg2, this, this.field1653, arg4);
            }
            int var6 = this.field1645 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1645 += arg1;
            if (this.field1653 == 256 && (this.field1649 & 255) == 0) {
                if (class262.field4214) {
                    arg1 = method696(0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, this.field1646, this.field1655, 0, var6, arg2, this);
                } else {
                    arg1 = method718(((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, this.field1652, 0, var6, arg2, this);
                }
            } else if (class262.field4214) {
                arg1 = method712(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, this.field1646, this.field1655, 0, var6, arg2, this, this.field1653, arg4);
            } else {
                arg1 = method705(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, this.field1652, 0, var6, arg2, this, this.field1653, arg4);
            }
            this.field1645 -= arg1;
            if (this.field1645 != 0) {
                return arg1;
            }
        } while (!this.method695());
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[B[IIIIIIILoi;II)I")
    private static final int method701(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10, int arg11, int arg12) {
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
        arg10.field1649 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)V")
    public final synchronized void method702(int arg0) {
        this.field1650 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "()I")
    public final synchronized int method703() {
        return this.field1647 == Integer.MIN_VALUE ? 0 : this.field1647;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([B[IIIIIIILoi;)I")
    private static final int method704(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class102 arg8) {
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
        arg8.field1649 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method705(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
        arg11.field1651 -= arg11.field1646 * arg5;
        arg11.field1648 -= arg11.field1655 * arg5;
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
        arg11.field1651 += arg11.field1646 * arg5;
        arg11.field1648 += arg11.field1655 * arg5;
        arg11.field1642 = arg6;
        arg11.field1649 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([IIIII)I")
    private final int method706(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1645 <= 0) {
                if (this.field1653 == -256 && (this.field1649 & 255) == 0) {
                    if (class262.field4214) {
                        return method731(0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, 0, arg3, arg2, this);
                    }
                    return method704(((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, 0, arg3, arg2, this);
                }
                if (class262.field4214) {
                    return method720(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, 0, arg3, arg2, this, this.field1653, arg4);
                }
                return method707(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, 0, arg3, arg2, this, this.field1653, arg4);
            }
            int var6 = this.field1645 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1645 += arg1;
            if (this.field1653 == -256 && (this.field1649 & 255) == 0) {
                if (class262.field4214) {
                    arg1 = method732(0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, this.field1646, this.field1655, 0, var6, arg2, this);
                } else {
                    arg1 = method708(((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, this.field1652, 0, var6, arg2, this);
                }
            } else if (class262.field4214) {
                arg1 = method719(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1651, this.field1648, this.field1646, this.field1655, 0, var6, arg2, this, this.field1653, arg4);
            } else {
                arg1 = method726(0, 0, ((class248) super.field3147).field3941, arg0, this.field1649, arg1, this.field1642, this.field1652, 0, var6, arg2, this, this.field1653, arg4);
            }
            this.field1645 -= arg1;
            if (this.field1645 != 0) {
                return arg1;
            }
        } while (!this.method695());
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II[B[IIIIIIILoi;II)I")
    private static final int method707(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10, int arg11, int arg12) {
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
        arg10.field1649 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([B[IIIIIIIILoi;)I")
    private static final int method708(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class102 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1651 += (var14 - arg3) * arg9.field1646;
        arg9.field1648 += (var14 - arg3) * arg9.field1655;
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
        arg9.field1642 = var12 >> 2;
        arg9.field1649 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "(I)V")
    public final synchronized void method709(int arg0) {
        int var2 = ((class248) super.field3147).field3941.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1649 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqj;III)Loi;")
    public static final class102 method710(class248 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3941 != null && arg0.field3941.length != 0 ? new class102(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I")
    private static final int method711(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[B[IIIIIIIIIILoi;II)I")
    private static final int method712(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class102 arg13, int arg14, int arg15) {
        arg13.field1642 -= arg13.field1652 * arg5;
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
        arg13.field1642 += arg13.field1652 * var22;
        arg13.field1651 = arg6;
        arg13.field1648 = arg7;
        arg13.field1649 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[B[IIIIIIIILoi;)I")
    private static final int method713(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10) {
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
        arg10.field1649 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "()Lpd;")
    public final class194 method714() {
        return null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lqj;II)Loi;")
    public static final class102 method715(class248 arg0, int arg1, int arg2) {
        return arg0.field3941 != null && arg0.field3941.length != 0 ? new class102(arg0, (int) ((long) arg0.field3940 * 256L * (long) arg1 / (long) (class133.field2103 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public final synchronized void method716(boolean arg0) {
        this.field1653 = (this.field1653 >>> 31) + (this.field1653 ^ this.field1653 >> 31);
        if (arg0) {
            this.field1653 = -this.field1653;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)V")
    public final synchronized void method717(int arg0, int arg1) {
        this.method725(arg0, arg1, this.method697());
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([B[IIIIIIIILoi;)I")
    private static final int method718(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class102 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1651 += (var14 - arg3) * arg9.field1646;
        arg9.field1648 += (var14 - arg3) * arg9.field1655;
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
        arg9.field1642 = var12 >> 2;
        arg9.field1649 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II[B[IIIIIIIIIILoi;II)I")
    private static final int method719(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class102 arg13, int arg14, int arg15) {
        arg13.field1642 -= arg13.field1652 * arg5;
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
        arg13.field1642 += arg13.field1652 * var22;
        arg13.field1651 = arg6;
        arg13.field1648 = arg7;
        arg13.field1649 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method720(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
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
        arg11.field1649 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "(I)V")
    public final synchronized void method721(int arg0) {
        this.method698(arg0 << 6, this.method697());
    }

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "()V")
    private final void method722() {
        if (this.field1645 != 0) {
            if (this.field1647 == Integer.MIN_VALUE) {
                this.field1647 = 0;
            }
            this.field1645 = 0;
            this.method733();
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public final synchronized void method723(int arg0) {
        if (this.field1645 > 0) {
            if (arg0 >= this.field1645) {
                if (this.field1647 == Integer.MIN_VALUE) {
                    this.field1647 = 0;
                    this.field1642 = this.field1651 = this.field1648 = 0;
                    this.method913(-3542);
                    arg0 = this.field1645;
                }
                this.field1645 = 0;
                this.method733();
            } else {
                this.field1642 += this.field1652 * arg0;
                this.field1651 += this.field1646 * arg0;
                this.field1648 += this.field1655 * arg0;
                this.field1645 -= arg0;
            }
        }
        class248 var2 = (class248) super.field3147;
        int var3 = this.field1654 << 8;
        int var4 = this.field1643 << 8;
        int var5 = var2.field3941.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1650 = 0;
        }
        if (this.field1649 < 0) {
            if (this.field1653 <= 0) {
                this.method722();
                this.method913(-3542);
                return;
            }
            this.field1649 = 0;
        }
        if (this.field1649 >= var5) {
            if (this.field1653 >= 0) {
                this.method722();
                this.method913(-3542);
                return;
            }
            this.field1649 = var5 - 1;
        }
        this.field1649 += this.field1653 * arg0;
        if (this.field1650 < 0) {
            if (!this.field1656) {
                if (this.field1653 < 0) {
                    if (this.field1649 < var3) {
                        this.field1649 = var4 - 1 - (var4 - 1 - this.field1649) % var6;
                    }
                } else if (this.field1649 >= var4) {
                    this.field1649 = (this.field1649 - var3) % var6 + var3;
                }
            } else {
                if (this.field1653 < 0) {
                    if (this.field1649 >= var3) {
                        return;
                    }
                    this.field1649 = var3 + var3 - 1 - this.field1649;
                    this.field1653 = -this.field1653;
                }
                while (this.field1649 >= var4) {
                    this.field1649 = var4 + var4 - 1 - this.field1649;
                    this.field1653 = -this.field1653;
                    if (this.field1649 >= var3) {
                        return;
                    }
                    this.field1649 = var3 + var3 - 1 - this.field1649;
                    this.field1653 = -this.field1653;
                }
            }
        } else {
            if (this.field1650 > 0) {
                if (this.field1656) {
                    label125: {
                        if (this.field1653 < 0) {
                            if (this.field1649 >= var3) {
                                return;
                            }
                            this.field1649 = var3 + var3 - 1 - this.field1649;
                            this.field1653 = -this.field1653;
                            if (--this.field1650 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1649 < var4) {
                                return;
                            }
                            this.field1649 = var4 + var4 - 1 - this.field1649;
                            this.field1653 = -this.field1653;
                            if (--this.field1650 == 0) {
                                break;
                            }
                            if (this.field1649 >= var3) {
                                return;
                            }
                            this.field1649 = var3 + var3 - 1 - this.field1649;
                            this.field1653 = -this.field1653;
                        } while (--this.field1650 != 0);
                    }
                } else if (this.field1653 < 0) {
                    if (this.field1649 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1649) / var6;
                    if (var7 < this.field1650) {
                        this.field1649 += var6 * var7;
                        this.field1650 -= var7;
                        return;
                    }
                    this.field1649 += this.field1650 * var6;
                    this.field1650 = 0;
                } else {
                    if (this.field1649 < var4) {
                        return;
                    }
                    int var8 = (this.field1649 - var3) / var6;
                    if (var8 < this.field1650) {
                        this.field1649 -= var6 * var8;
                        this.field1650 -= var8;
                        return;
                    }
                    this.field1649 -= this.field1650 * var6;
                    this.field1650 = 0;
                }
            }
            if (this.field1653 < 0) {
                if (this.field1649 < 0) {
                    this.field1649 = -1;
                    this.method722();
                    this.method913(-3542);
                    return;
                }
            } else if (this.field1649 >= var5) {
                this.field1649 = var5;
                this.method722();
                this.method913(-3542);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()I")
    public final int method724() {
        int var1 = this.field1642 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1650 == 0) {
            var2 -= this.field1649 * var2 / (((class248) super.field3147).field3941.length << 8);
        } else if (this.field1650 >= 0) {
            var2 -= this.field1654 * var2 / ((class248) super.field3147).field3941.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
    public final synchronized void method725(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method698(arg1, arg2);
        } else {
            int var4 = method735(arg1, arg2);
            int var5 = method711(arg1, arg2);
            if (this.field1651 == var4 && this.field1648 == var5) {
                this.field1645 = 0;
            } else {
                int var6 = arg1 - this.field1642;
                if (this.field1642 - arg1 > var6) {
                    var6 = this.field1642 - arg1;
                }
                if (var4 - this.field1651 > var6) {
                    var6 = var4 - this.field1651;
                }
                if (this.field1651 - var4 > var6) {
                    var6 = this.field1651 - var4;
                }
                if (var5 - this.field1648 > var6) {
                    var6 = var5 - this.field1648;
                }
                if (this.field1648 - var5 > var6) {
                    var6 = this.field1648 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1645 = arg0;
                this.field1647 = arg1;
                this.field1644 = arg2;
                this.field1652 = (arg1 - this.field1642) / arg0;
                this.field1646 = (var4 - this.field1651) / arg0;
                this.field1655 = (var5 - this.field1648) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method726(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
        arg11.field1651 -= arg11.field1646 * arg5;
        arg11.field1648 -= arg11.field1655 * arg5;
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
        arg11.field1651 += arg11.field1646 * arg5;
        arg11.field1648 += arg11.field1655 * arg5;
        arg11.field1642 = arg6;
        arg11.field1649 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "()I")
    public final synchronized int method727() {
        return this.field1653 < 0 ? -this.field1653 : this.field1653;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()Lpd;")
    public final class194 method728() {
        return null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()I")
    public final int method729() {
        return this.field1647 == 0 && this.field1645 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "(I)V")
    public final synchronized void method730(int arg0) {
        if (this.field1653 < 0) {
            this.field1653 = -arg0;
        } else {
            this.field1653 = arg0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I[B[IIIIIIIILoi;)I")
    private static final int method731(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10) {
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
        arg10.field1649 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I[B[IIIIIIIIIILoi;)I")
    private static final int method732(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class102 arg12) {
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
        arg12.field1642 += (var19 - arg4) * arg12.field1652;
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
        arg12.field1651 = var15 >> 2;
        arg12.field1648 = var16 >> 2;
        arg12.field1649 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "()V")
    private final void method733() {
        this.field1642 = this.field1647;
        this.field1651 = method735(this.field1647, this.field1644);
        this.field1648 = method711(this.field1647, this.field1644);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([III)V")
    public final synchronized void method734(int[] arg0, int arg1, int arg2) {
        if (this.field1647 == 0 && this.field1645 == 0) {
            this.method723(arg2);
        } else {
            class248 var4 = (class248) super.field3147;
            int var5 = this.field1654 << 8;
            int var6 = this.field1643 << 8;
            int var7 = var4.field3941.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1650 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1649 < 0) {
                if (this.field1653 <= 0) {
                    this.method722();
                    this.method913(-3542);
                    return;
                }
                this.field1649 = 0;
            }
            if (this.field1649 >= var7) {
                if (this.field1653 >= 0) {
                    this.method722();
                    this.method913(-3542);
                    return;
                }
                this.field1649 = var7 - 1;
            }
            if (this.field1650 < 0) {
                if (this.field1656) {
                    if (this.field1653 < 0) {
                        var9 = this.method706(arg0, arg1, var5, var10, var4.field3941[this.field1654]);
                        if (this.field1649 >= var5) {
                            return;
                        }
                        this.field1649 = var5 + var5 - 1 - this.field1649;
                        this.field1653 = -this.field1653;
                    }
                    while (true) {
                        int var11 = this.method700(arg0, var9, var6, var10, var4.field3941[this.field1643 - 1]);
                        if (this.field1649 < var6) {
                            return;
                        }
                        this.field1649 = var6 + var6 - 1 - this.field1649;
                        this.field1653 = -this.field1653;
                        var9 = this.method706(arg0, var11, var5, var10, var4.field3941[this.field1654]);
                        if (this.field1649 >= var5) {
                            return;
                        }
                        this.field1649 = var5 + var5 - 1 - this.field1649;
                        this.field1653 = -this.field1653;
                    }
                } else if (this.field1653 < 0) {
                    while (true) {
                        var9 = this.method706(arg0, var9, var5, var10, var4.field3941[this.field1643 - 1]);
                        if (this.field1649 >= var5) {
                            return;
                        }
                        this.field1649 = var6 - 1 - (var6 - 1 - this.field1649) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method700(arg0, var9, var6, var10, var4.field3941[this.field1654]);
                        if (this.field1649 < var6) {
                            return;
                        }
                        this.field1649 = (this.field1649 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1650 > 0) {
                    if (this.field1656) {
                        label130: {
                            if (this.field1653 < 0) {
                                var9 = this.method706(arg0, arg1, var5, var10, var4.field3941[this.field1654]);
                                if (this.field1649 >= var5) {
                                    return;
                                }
                                this.field1649 = var5 + var5 - 1 - this.field1649;
                                this.field1653 = -this.field1653;
                                if (--this.field1650 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method700(arg0, var9, var6, var10, var4.field3941[this.field1643 - 1]);
                                if (this.field1649 < var6) {
                                    return;
                                }
                                this.field1649 = var6 + var6 - 1 - this.field1649;
                                this.field1653 = -this.field1653;
                                if (--this.field1650 == 0) {
                                    break;
                                }
                                var9 = this.method706(arg0, var9, var5, var10, var4.field3941[this.field1654]);
                                if (this.field1649 >= var5) {
                                    return;
                                }
                                this.field1649 = var5 + var5 - 1 - this.field1649;
                                this.field1653 = -this.field1653;
                            } while (--this.field1650 != 0);
                        }
                    } else if (this.field1653 < 0) {
                        while (true) {
                            var9 = this.method706(arg0, var9, var5, var10, var4.field3941[this.field1643 - 1]);
                            if (this.field1649 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1649) / var8;
                            if (var12 >= this.field1650) {
                                this.field1649 += this.field1650 * var8;
                                this.field1650 = 0;
                                break;
                            }
                            this.field1649 += var8 * var12;
                            this.field1650 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method700(arg0, var9, var6, var10, var4.field3941[this.field1654]);
                            if (this.field1649 < var6) {
                                return;
                            }
                            int var13 = (this.field1649 - var5) / var8;
                            if (var13 >= this.field1650) {
                                this.field1649 -= this.field1650 * var8;
                                this.field1650 = 0;
                                break;
                            }
                            this.field1649 -= var8 * var13;
                            this.field1650 -= var13;
                        }
                    }
                }
                if (this.field1653 < 0) {
                    this.method706(arg0, var9, 0, var10, 0);
                    if (this.field1649 < 0) {
                        this.field1649 = -1;
                        this.method722();
                        this.method913(-3542);
                        return;
                    }
                } else {
                    this.method700(arg0, var9, var7, var10, 0);
                    if (this.field1649 >= var7) {
                        this.field1649 = var7;
                        this.method722();
                        this.method913(-3542);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(II)I")
    private static final int method735(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(II[B[IIIIIIIILoi;II)I")
    private static final int method736(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
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
        arg11.field1649 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "(I)V")
    public final synchronized void method737(int arg0) {
        if (arg0 == 0) {
            this.method699(0);
            this.method913(-3542);
        } else if (this.field1651 == 0 && this.field1648 == 0) {
            this.field1645 = 0;
            this.field1647 = 0;
            this.field1642 = 0;
            this.method913(-3542);
        } else {
            int var2 = -this.field1642;
            if (this.field1642 > var2) {
                var2 = this.field1642;
            }
            if (-this.field1651 > var2) {
                var2 = -this.field1651;
            }
            if (this.field1651 > var2) {
                var2 = this.field1651;
            }
            if (-this.field1648 > var2) {
                var2 = -this.field1648;
            }
            if (this.field1648 > var2) {
                var2 = this.field1648;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1645 = arg0;
            this.field1647 = Integer.MIN_VALUE;
            this.field1652 = -this.field1642 / arg0;
            this.field1646 = -this.field1651 / arg0;
            this.field1655 = -this.field1648 / arg0;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "([B[IIIIIIILoi;)I")
    private static final int method738(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class102 arg8) {
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
        arg8.field1649 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "()Z")
    public final boolean method739() {
        return this.field1645 != 0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lqj;II)V")
    private class102(class248 arg0, int arg1, int arg2) {
        super.field3147 = arg0;
        this.field1654 = arg0.field3944;
        this.field1643 = arg0.field3942;
        this.field1656 = arg0.field3943;
        this.field1653 = arg1;
        this.field1647 = arg2;
        this.field1644 = 8192;
        this.field1649 = 0;
        this.method733();
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lqj;III)V")
    private class102(class248 arg0, int arg1, int arg2, int arg3) {
        super.field3147 = arg0;
        this.field1654 = arg0.field3944;
        this.field1643 = arg0.field3942;
        this.field1656 = arg0.field3943;
        this.field1653 = arg1;
        this.field1647 = arg2;
        this.field1644 = arg3;
        this.field1649 = 0;
        this.method733();
    }

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "()Z")
    public final boolean method740() {
        return this.field1649 < 0 || this.field1649 >= ((class248) super.field3147).field3941.length << 8;
    }
}
