import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class226 extends class69 {

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    private int field3402;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Z")
    private boolean field3406;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    private int field3412;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    private int field3400;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    private int field3403;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V", line = 3)
    public final synchronized void method1650(int arg0) {
        this.field3400 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V", line = 6)
    public final synchronized void method1651(int arg0) {
        this.method1654(arg0 << 6, this.method1671());
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I", line = 10)
    public final int method558() {
        return this.field3405 == 0 && this.field3398 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[B[IIIIIIIILbd;II)I", line = 16)
    private static final int method1652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class226 arg11, int arg12, int arg13) {
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
        arg11.field3412 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()I", line = 51)
    public final synchronized int method1653() {
        return this.field3409 < 0 ? -this.field3409 : this.field3409;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 55)
    private final synchronized void method1654(int arg0, int arg1) {
        this.field3405 = arg0;
        this.field3401 = arg1;
        this.field3398 = 0;
        this.method1682();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[B[IIIIIIIIIILbd;II)I", line = 61)
    private static final int method1655(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class226 arg13, int arg14, int arg15) {
        arg13.field3403 -= arg13.field3404 * arg5;
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
        arg13.field3403 += arg13.field3404 * var27;
        arg13.field3410 = arg6;
        arg13.field3407 = arg7;
        arg13.field3412 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V", line = 105)
    public final synchronized void method1656(int arg0) {
        int var2 = ((class43) this.field997).field614.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3412 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIII)I", line = 116)
    private final int method1657(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3398 > 0) {
                int var6 = this.field3398 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3398 += arg1;
                if (this.field3409 == -256 && (this.field3412 & 0xFF) == 0) {
                    if (class193.field2808) {
                        arg1 = method1670(0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, this.field3411, this.field3399, 0, var6, arg2, this);
                    } else {
                        arg1 = method1685(((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, this.field3404, 0, var6, arg2, this);
                    }
                } else if (class193.field2808) {
                    arg1 = method1675(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, this.field3411, this.field3399, 0, var6, arg2, this, this.field3409, arg4);
                } else {
                    arg1 = method1669(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, this.field3404, 0, var6, arg2, this, this.field3409, arg4);
                }
                this.field3398 -= arg1;
                if (this.field3398 != 0) {
                    return arg1;
                }
                if (!this.method1687()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3409 == -256 && (this.field3412 & 0xFF) == 0) {
                if (class193.field2808) {
                    return method1666(0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, 0, arg3, arg2, this);
                }
                return method1677(((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, 0, arg3, arg2, this);
            }
            if (class193.field2808) {
                return method1652(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, 0, arg3, arg2, this, this.field3409, arg4);
            }
            return method1686(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, 0, arg3, arg2, this, this.field3409, arg4);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([B[IIIIIIIILbd;)I", line = 171)
    private static final int method1658(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class226 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3410 += (var14 - arg3) * arg9.field3411;
        arg9.field3407 += (var14 - arg3) * arg9.field3399;
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
        arg9.field3403 = var12 >> 2;
        arg9.field3412 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "()Z", line = 205)
    public final boolean method1659() {
        return this.field3398 != 0;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "()I", line = 208)
    public final synchronized int method1660() {
        return this.field3405 == Integer.MIN_VALUE ? 0 : this.field3405;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ld;II)Lbd;", line = 211)
    public static final class226 method1661(class43 arg0, int arg1, int arg2) {
        return arg0.field614 == null || arg0.field614.length == 0 ? null : new class226(arg0, (int) ((long) arg0.field611 * 256L * (long) arg1 / (long) (class56.field812 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([B[IIIIIIILbd;)I", line = 217)
    private static final int method1662(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class226 arg8) {
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
        arg8.field3412 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V", line = 242)
    public final synchronized void method1663(int arg0, int arg1) {
        this.method1676(arg0, arg1, this.method1671());
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "()V", line = 245)
    private final void method1664() {
        if (this.field3398 == 0) {
            return;
        }
        if (this.field3405 == Integer.MIN_VALUE) {
            this.field3405 = 0;
        }
        this.field3398 = 0;
        this.method1682();
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()I", line = 257)
    public final int method561() {
        int var1 = this.field3403 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3400 == 0) {
            var2 -= this.field3412 * var2 / (((class43) this.field997).field614.length << 8);
        } else if (this.field3400 >= 0) {
            var2 -= this.field3402 * var2 / ((class43) this.field997).field614.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V", line = 269)
    private final synchronized void method1665(int arg0) {
        this.method1654(arg0, this.method1671());
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B[IIIIIIIILbd;)I", line = 272)
    private static final int method1666(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class226 arg10) {
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
        arg10.field3412 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "()Z", line = 311)
    public final boolean method1667() {
        return this.field3412 < 0 || this.field3412 >= ((class43) this.field997).field614.length << 8;
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V", line = 314)
    public final synchronized void method1668(int arg0) {
        if (arg0 == 0) {
            this.method1665(0);
            this.method876(8);
        } else if (this.field3410 == 0 && this.field3407 == 0) {
            this.field3398 = 0;
            this.field3405 = 0;
            this.field3403 = 0;
            this.method876(8);
        } else {
            int var2 = -this.field3403;
            if (this.field3403 > var2) {
                var2 = this.field3403;
            }
            if (-this.field3410 > var2) {
                var2 = -this.field3410;
            }
            if (this.field3410 > var2) {
                var2 = this.field3410;
            }
            if (-this.field3407 > var2) {
                var2 = -this.field3407;
            }
            if (this.field3407 > var2) {
                var2 = this.field3407;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3398 = arg0;
            this.field3405 = Integer.MIN_VALUE;
            this.field3404 = -this.field3403 / arg0;
            this.field3411 = -this.field3410 / arg0;
            this.field3399 = -this.field3407 / arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II[B[IIIIIIIILbd;II)I", line = 362)
    private static final int method1669(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class226 arg11, int arg12, int arg13) {
        arg11.field3410 -= arg11.field3411 * arg5;
        arg11.field3407 -= arg11.field3399 * arg5;
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
        arg11.field3410 += arg11.field3411 * arg5;
        arg11.field3407 += arg11.field3399 * arg5;
        arg11.field3403 = arg6;
        arg11.field3412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B[IIIIIIIIIILbd;)I", line = 395)
    private static final int method1670(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class226 arg12) {
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
        arg12.field3403 += (var19 - arg4) * arg12.field3404;
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
        arg12.field3410 = var15 >> 2;
        arg12.field3407 = var16 >> 2;
        arg12.field3412 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "()I", line = 449)
    public final synchronized int method1671() {
        return this.field3401 < 0 ? -1 : this.field3401;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ld;III)Lbd;", line = 453)
    public static final class226 method1672(class43 arg0, int arg1, int arg2, int arg3) {
        return arg0.field614 == null || arg0.field614.length == 0 ? null : new class226(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([IIIII)I", line = 459)
    private final int method1673(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3398 > 0) {
                int var6 = this.field3398 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3398 += arg1;
                if (this.field3409 == 256 && (this.field3412 & 0xFF) == 0) {
                    if (class193.field2808) {
                        arg1 = method1683(0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, this.field3411, this.field3399, 0, var6, arg2, this);
                    } else {
                        arg1 = method1658(((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, this.field3404, 0, var6, arg2, this);
                    }
                } else if (class193.field2808) {
                    arg1 = method1655(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, this.field3411, this.field3399, 0, var6, arg2, this, this.field3409, arg4);
                } else {
                    arg1 = method1681(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, this.field3404, 0, var6, arg2, this, this.field3409, arg4);
                }
                this.field3398 -= arg1;
                if (this.field3398 != 0) {
                    return arg1;
                }
                if (!this.method1687()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3409 == 256 && (this.field3412 & 0xFF) == 0) {
                if (class193.field2808) {
                    return method1688(0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, 0, arg3, arg2, this);
                }
                return method1662(((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, 0, arg3, arg2, this);
            }
            if (class193.field2808) {
                return method1689(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3410, this.field3407, 0, arg3, arg2, this, this.field3409, arg4);
            }
            return method1679(0, 0, ((class43) this.field997).field614, arg0, this.field3412, arg1, this.field3403, 0, arg3, arg2, this, this.field3409, arg4);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(II)I", line = 514)
    private static final int method1674(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()Lvc;", line = 520)
    public final class69 method559() {
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([III)V", line = 523)
    public final synchronized void method560(int[] arg0, int arg1, int arg2) {
        if (this.field3405 == 0 && this.field3398 == 0) {
            this.method562(arg2);
            return;
        }
        class43 var4 = (class43) this.field997;
        int var5 = this.field3402 << 8;
        int var6 = this.field3408 << 8;
        int var7 = var4.field614.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3400 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3412 < 0) {
            if (this.field3409 <= 0) {
                this.method1664();
                this.method876(8);
                return;
            }
            this.field3412 = 0;
        }
        if (this.field3412 >= var7) {
            if (this.field3409 >= 0) {
                this.method1664();
                this.method876(8);
                return;
            }
            this.field3412 = var7 - 1;
        }
        if (this.field3400 >= 0) {
            if (this.field3400 > 0) {
                if (this.field3406) {
                    label131: {
                        if (this.field3409 < 0) {
                            var9 = this.method1657(arg0, arg1, var5, var10, var4.field614[this.field3402]);
                            if (this.field3412 >= var5) {
                                return;
                            }
                            this.field3412 = var5 + var5 - this.field3412 - 1;
                            this.field3409 = -this.field3409;
                            if (--this.field3400 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1673(arg0, var9, var6, var10, var4.field614[this.field3408 - 1]);
                            if (this.field3412 < var6) {
                                return;
                            }
                            this.field3412 = var6 + var6 - this.field3412 - 1;
                            this.field3409 = -this.field3409;
                            if (--this.field3400 == 0) {
                                break;
                            }
                            var9 = this.method1657(arg0, var9, var5, var10, var4.field614[this.field3402]);
                            if (this.field3412 >= var5) {
                                return;
                            }
                            this.field3412 = var5 + var5 - this.field3412 - 1;
                            this.field3409 = -this.field3409;
                        } while (--this.field3400 != 0);
                    }
                } else if (this.field3409 < 0) {
                    while (true) {
                        var9 = this.method1657(arg0, var9, var5, var10, var4.field614[this.field3408 - 1]);
                        if (this.field3412 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3412 - 1) / var8;
                        if (var12 >= this.field3400) {
                            this.field3412 += this.field3400 * var8;
                            this.field3400 = 0;
                            break;
                        }
                        this.field3412 += var8 * var12;
                        this.field3400 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1673(arg0, var9, var6, var10, var4.field614[this.field3402]);
                        if (this.field3412 < var6) {
                            return;
                        }
                        int var13 = (this.field3412 - var5) / var8;
                        if (var13 >= this.field3400) {
                            this.field3412 -= this.field3400 * var8;
                            this.field3400 = 0;
                            break;
                        }
                        this.field3412 -= var8 * var13;
                        this.field3400 -= var13;
                    }
                }
            }
            if (this.field3409 < 0) {
                this.method1657(arg0, var9, 0, var10, 0);
                if (this.field3412 < 0) {
                    this.field3412 = -1;
                    this.method1664();
                    this.method876(8);
                }
            } else {
                this.method1673(arg0, var9, var7, var10, 0);
                if (this.field3412 >= var7) {
                    this.field3412 = var7;
                    this.method1664();
                    this.method876(8);
                }
            }
        } else if (this.field3406) {
            if (this.field3409 < 0) {
                var9 = this.method1657(arg0, arg1, var5, var10, var4.field614[this.field3402]);
                if (this.field3412 >= var5) {
                    return;
                }
                this.field3412 = var5 + var5 - this.field3412 - 1;
                this.field3409 = -this.field3409;
            }
            while (true) {
                int var11 = this.method1673(arg0, var9, var6, var10, var4.field614[this.field3408 - 1]);
                if (this.field3412 < var6) {
                    return;
                }
                this.field3412 = var6 + var6 - this.field3412 - 1;
                this.field3409 = -this.field3409;
                var9 = this.method1657(arg0, var11, var5, var10, var4.field614[this.field3402]);
                if (this.field3412 >= var5) {
                    return;
                }
                this.field3412 = var5 + var5 - this.field3412 - 1;
                this.field3409 = -this.field3409;
            }
        } else if (this.field3409 < 0) {
            while (true) {
                var9 = this.method1657(arg0, var9, var5, var10, var4.field614[this.field3408 - 1]);
                if (this.field3412 >= var5) {
                    return;
                }
                this.field3412 = var6 - (var6 - 1 - this.field3412) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1673(arg0, var9, var6, var10, var4.field614[this.field3402]);
                if (this.field3412 < var6) {
                    return;
                }
                this.field3412 = (this.field3412 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II[B[IIIIIIIIIILbd;II)I", line = 758)
    private static final int method1675(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class226 arg13, int arg14, int arg15) {
        arg13.field3403 -= arg13.field3404 * arg5;
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
        arg13.field3403 += arg13.field3404 * var26;
        arg13.field3410 = arg6;
        arg13.field3407 = arg7;
        arg13.field3412 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V", line = 799)
    public final synchronized void method1676(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1654(arg1, arg2);
            return;
        }
        int var4 = method1684(arg1, arg2);
        int var5 = method1674(arg1, arg2);
        if (this.field3410 == var4 && this.field3407 == var5) {
            this.field3398 = 0;
            return;
        }
        int var6 = arg1 - this.field3403;
        if (this.field3403 - arg1 > var6) {
            var6 = this.field3403 - arg1;
        }
        if (var4 - this.field3410 > var6) {
            var6 = var4 - this.field3410;
        }
        if (this.field3410 - var4 > var6) {
            var6 = this.field3410 - var4;
        }
        if (var5 - this.field3407 > var6) {
            var6 = var5 - this.field3407;
        }
        if (this.field3407 - var5 > var6) {
            var6 = this.field3407 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3398 = arg0;
        this.field3405 = arg1;
        this.field3401 = arg2;
        this.field3404 = (arg1 - this.field3403) / arg0;
        this.field3411 = (var4 - this.field3410) / arg0;
        this.field3399 = (var5 - this.field3407) / arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lvc;", line = 845)
    public final class69 method556() {
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([B[IIIIIIILbd;)I", line = 850)
    private static final int method1677(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class226 arg8) {
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
        arg8.field3412 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 876)
    public final synchronized void method562(int arg0) {
        if (this.field3398 > 0) {
            if (arg0 >= this.field3398) {
                if (this.field3405 == Integer.MIN_VALUE) {
                    this.field3405 = 0;
                    this.field3403 = this.field3410 = this.field3407 = 0;
                    this.method876(8);
                    arg0 = this.field3398;
                }
                this.field3398 = 0;
                this.method1682();
            } else {
                this.field3403 += this.field3404 * arg0;
                this.field3410 += this.field3411 * arg0;
                this.field3407 += this.field3399 * arg0;
                this.field3398 -= arg0;
            }
        }
        class43 var2 = (class43) this.field997;
        int var3 = this.field3402 << 8;
        int var4 = this.field3408 << 8;
        int var5 = var2.field614.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3400 = 0;
        }
        if (this.field3412 < 0) {
            if (this.field3409 <= 0) {
                this.method1664();
                this.method876(8);
                return;
            }
            this.field3412 = 0;
        }
        if (this.field3412 >= var5) {
            if (this.field3409 >= 0) {
                this.method1664();
                this.method876(8);
                return;
            }
            this.field3412 = var5 - 1;
        }
        this.field3412 += this.field3409 * arg0;
        if (this.field3400 >= 0) {
            if (this.field3400 > 0) {
                if (this.field3406) {
                    label121: {
                        if (this.field3409 < 0) {
                            if (this.field3412 >= var3) {
                                return;
                            }
                            this.field3412 = var3 + var3 - this.field3412 - 1;
                            this.field3409 = -this.field3409;
                            if (--this.field3400 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3412 < var4) {
                                return;
                            }
                            this.field3412 = var4 + var4 - this.field3412 - 1;
                            this.field3409 = -this.field3409;
                            if (--this.field3400 == 0) {
                                break;
                            }
                            if (this.field3412 >= var3) {
                                return;
                            }
                            this.field3412 = var3 + var3 - this.field3412 - 1;
                            this.field3409 = -this.field3409;
                        } while (--this.field3400 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3409 < 0) {
                            if (this.field3412 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3412 - 1) / var6;
                            if (var7 >= this.field3400) {
                                this.field3412 += this.field3400 * var6;
                                this.field3400 = 0;
                                break label153;
                            }
                            this.field3412 += var6 * var7;
                            this.field3400 -= var7;
                        } else if (this.field3412 >= var4) {
                            int var8 = (this.field3412 - var3) / var6;
                            if (var8 >= this.field3400) {
                                this.field3412 -= this.field3400 * var6;
                                this.field3400 = 0;
                                break label153;
                            }
                            this.field3412 -= var6 * var8;
                            this.field3400 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3409 < 0) {
                if (this.field3412 < 0) {
                    this.field3412 = -1;
                    this.method1664();
                    this.method876(8);
                }
            } else if (this.field3412 >= var5) {
                this.field3412 = var5;
                this.method1664();
                this.method876(8);
            }
        } else if (this.field3406) {
            if (this.field3409 < 0) {
                if (this.field3412 >= var3) {
                    return;
                }
                this.field3412 = var3 + var3 - this.field3412 - 1;
                this.field3409 = -this.field3409;
            }
            while (this.field3412 >= var4) {
                this.field3412 = var4 + var4 - this.field3412 - 1;
                this.field3409 = -this.field3409;
                if (this.field3412 >= var3) {
                    return;
                }
                this.field3412 = var3 + var3 - this.field3412 - 1;
                this.field3409 = -this.field3409;
            }
        } else if (this.field3409 < 0) {
            if (this.field3412 >= var3) {
                return;
            }
            this.field3412 = var4 - (var4 - 1 - this.field3412) % var6 - 1;
        } else if (this.field3412 >= var4) {
            this.field3412 = (this.field3412 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 1095)
    public final synchronized void method1678(boolean arg0) {
        this.field3409 = (this.field3409 >>> 31) + (this.field3409 ^ this.field3409 >> 31);
        if (arg0) {
            this.field3409 = -this.field3409;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[B[IIIIIIILbd;II)I", line = 1101)
    private static final int method1679(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class226 arg10, int arg11, int arg12) {
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
        arg10.field3412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "(I)V", line = 1135)
    public final synchronized void method1680(int arg0) {
        if (this.field3409 < 0) {
            this.field3409 = -arg0;
        } else {
            this.field3409 = arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(II[B[IIIIIIIILbd;II)I", line = 1142)
    private static final int method1681(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class226 arg11, int arg12, int arg13) {
        arg11.field3410 -= arg11.field3411 * arg5;
        arg11.field3407 -= arg11.field3399 * arg5;
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
        arg11.field3410 += arg11.field3411 * arg5;
        arg11.field3407 += arg11.field3399 * arg5;
        arg11.field3403 = arg6;
        arg11.field3412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "()V", line = 1176)
    private final void method1682() {
        this.field3403 = this.field3405;
        this.field3410 = method1684(this.field3405, this.field3401);
        this.field3407 = method1674(this.field3405, this.field3401);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I[B[IIIIIIIIIILbd;)I", line = 1181)
    private static final int method1683(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class226 arg12) {
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
        arg12.field3403 += (var19 - arg4) * arg12.field3404;
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
        arg12.field3410 = var15 >> 2;
        arg12.field3407 = var16 >> 2;
        arg12.field3412 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(II)I", line = 1234)
    private static final int method1684(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([B[IIIIIIIILbd;)I", line = 1238)
    private static final int method1685(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class226 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3410 += (var14 - arg3) * arg9.field3411;
        arg9.field3407 += (var14 - arg3) * arg9.field3399;
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
        arg9.field3403 = var12 >> 2;
        arg9.field3412 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II[B[IIIIIIILbd;II)I", line = 1272)
    private static final int method1686(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class226 arg10, int arg11, int arg12) {
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
        arg10.field3412 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "()Z", line = 1300)
    private final boolean method1687() {
        int var1 = this.field3405;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1684(var1, this.field3401);
            var2 = method1674(var1, this.field3401);
        }
        if (this.field3403 != var1 || this.field3410 != var3 || this.field3407 != var2) {
            if (this.field3403 < var1) {
                this.field3404 = 1;
                this.field3398 = var1 - this.field3403;
            } else if (this.field3403 > var1) {
                this.field3404 = -1;
                this.field3398 = this.field3403 - var1;
            } else {
                this.field3404 = 0;
            }
            if (this.field3410 < var3) {
                this.field3411 = 1;
                if (this.field3398 == 0 || this.field3398 > var3 - this.field3410) {
                    this.field3398 = var3 - this.field3410;
                }
            } else if (this.field3410 > var3) {
                this.field3411 = -1;
                if (this.field3398 == 0 || this.field3398 > this.field3410 - var3) {
                    this.field3398 = this.field3410 - var3;
                }
            } else {
                this.field3411 = 0;
            }
            if (this.field3407 < var2) {
                this.field3399 = 1;
                if (this.field3398 == 0 || this.field3398 > var2 - this.field3407) {
                    this.field3398 = var2 - this.field3407;
                }
            } else if (this.field3407 > var2) {
                this.field3399 = -1;
                if (this.field3398 == 0 || this.field3398 > this.field3407 - var2) {
                    this.field3398 = this.field3407 - var2;
                }
            } else {
                this.field3399 = 0;
            }
            return false;
        } else if (this.field3405 == Integer.MIN_VALUE) {
            this.field3405 = 0;
            this.field3403 = this.field3410 = this.field3407 = 0;
            this.method876(8);
            return true;
        } else {
            this.method1682();
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I[B[IIIIIIIILbd;)I", line = 1386)
    private static final int method1688(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class226 arg10) {
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
        arg10.field3412 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(II[B[IIIIIIIILbd;II)I", line = 1424)
    private static final int method1689(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class226 arg11, int arg12, int arg13) {
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
        arg11.field3412 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ld;II)V", line = 1458)
    private class226(class43 arg0, int arg1, int arg2) {
        this.field997 = arg0;
        this.field3402 = arg0.field613;
        this.field3408 = arg0.field612;
        this.field3406 = arg0.field615;
        this.field3409 = arg1;
        this.field3405 = arg2;
        this.field3401 = 8192;
        this.field3412 = 0;
        this.method1682();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ld;III)V", line = 1469)
    private class226(class43 arg0, int arg1, int arg2, int arg3) {
        this.field997 = arg0;
        this.field3402 = arg0.field613;
        this.field3408 = arg0.field612;
        this.field3406 = arg0.field615;
        this.field3409 = arg1;
        this.field3405 = arg2;
        this.field3401 = arg3;
        this.field3412 = 0;
        this.method1682();
    }
}
