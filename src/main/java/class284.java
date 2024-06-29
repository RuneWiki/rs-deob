import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class284 extends class40 {

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    private int field4499;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Z")
    private boolean field4503;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    private int field4494;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    private int field4506;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    private int field4504;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    private int field4493;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    private int field4495;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    private int field4496;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    private int field4497;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    private int field4498;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lph;III)Lc;")
    public static final class284 method1861(class202 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3316 != null && arg0.field3316.length != 0 ? new class284(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
    public final boolean method1862() {
        return this.field4504 < 0 || this.field4504 >= ((class202) super.field597).field3316.length << 8;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIILc;II)I")
    private static final int method1863(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class284 arg11, int arg12, int arg13) {
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
        arg11.field4504 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    private static final int method1864(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIIIILc;II)I")
    private static final int method1865(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class284 arg13, int arg14, int arg15) {
        arg13.field4505 -= arg13.field4498 * arg5;
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
        arg13.field4505 += arg13.field4498 * var22;
        arg13.field4493 = arg6;
        arg13.field4500 = arg7;
        arg13.field4504 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
    public final synchronized void method1866(int arg0) {
        int var2 = ((class202) super.field597).field3316.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4504 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()Lok;")
    public final class40 method251() {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIIIILc;II)I")
    private static final int method1867(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class284 arg13, int arg14, int arg15) {
        arg13.field4505 -= arg13.field4498 * arg5;
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
        arg13.field4505 += arg13.field4498 * var22;
        arg13.field4493 = arg6;
        arg13.field4500 = arg7;
        arg13.field4504 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public final synchronized void method1868(boolean arg0) {
        this.field4502 = (this.field4502 >>> 31) + (this.field4502 ^ this.field4502 >> 31);
        if (arg0) {
            this.field4502 = -this.field4502;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([B[IIIIIIIILc;)I")
    private static final int method1869(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class284 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4493 += (var14 - arg3) * arg9.field4495;
        arg9.field4500 += (var14 - arg3) * arg9.field4501;
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
        arg9.field4505 = var12 >> 2;
        arg9.field4504 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B[IIIIIIIILc;)I")
    private static final int method1870(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class284 arg10) {
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
        arg10.field4504 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([IIIII)I")
    private final int method1871(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4496 <= 0) {
                if (this.field4502 == 256 && (this.field4504 & 255) == 0) {
                    if (class74.field1215) {
                        return method1886(0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, 0, arg3, arg2, this);
                    }
                    return method1898(((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, 0, arg3, arg2, this);
                }
                if (class74.field1215) {
                    return method1863(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, 0, arg3, arg2, this, this.field4502, arg4);
                }
                return method1878(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, 0, arg3, arg2, this, this.field4502, arg4);
            }
            int var6 = this.field4496 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4496 += arg1;
            if (this.field4502 == 256 && (this.field4504 & 255) == 0) {
                if (class74.field1215) {
                    arg1 = method1875(0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, this.field4495, this.field4501, 0, var6, arg2, this);
                } else {
                    arg1 = method1894(((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, this.field4498, 0, var6, arg2, this);
                }
            } else if (class74.field1215) {
                arg1 = method1867(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, this.field4495, this.field4501, 0, var6, arg2, this, this.field4502, arg4);
            } else {
                arg1 = method1888(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, this.field4498, 0, var6, arg2, this, this.field4502, arg4);
            }
            this.field4496 -= arg1;
            if (this.field4496 != 0) {
                return arg1;
            }
        } while (!this.method1892());
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()I")
    public final synchronized int method1872() {
        return this.field4494 == Integer.MIN_VALUE ? 0 : this.field4494;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
    public final synchronized void method1873(int arg0, int arg1) {
        this.method1876(arg0, arg1, this.method1896());
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIILc;II)I")
    private static final int method1874(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class284 arg10, int arg11, int arg12) {
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
        arg10.field4504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B[IIIIIIIIIILc;)I")
    private static final int method1875(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class284 arg12) {
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
        arg12.field4505 += (var19 - arg4) * arg12.field4498;
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
        arg12.field4493 = var15 >> 2;
        arg12.field4500 = var16 >> 2;
        arg12.field4504 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public final synchronized void method1876(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1897(arg1, arg2);
        } else {
            int var4 = method1882(arg1, arg2);
            int var5 = method1864(arg1, arg2);
            if (this.field4493 == var4 && this.field4500 == var5) {
                this.field4496 = 0;
            } else {
                int var6 = arg1 - this.field4505;
                if (this.field4505 - arg1 > var6) {
                    var6 = this.field4505 - arg1;
                }
                if (var4 - this.field4493 > var6) {
                    var6 = var4 - this.field4493;
                }
                if (this.field4493 - var4 > var6) {
                    var6 = this.field4493 - var4;
                }
                if (var5 - this.field4500 > var6) {
                    var6 = var5 - this.field4500;
                }
                if (this.field4500 - var5 > var6) {
                    var6 = this.field4500 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4496 = arg0;
                this.field4494 = arg1;
                this.field4506 = arg2;
                this.field4498 = (arg1 - this.field4505) / arg0;
                this.field4495 = (var4 - this.field4493) / arg0;
                this.field4501 = (var5 - this.field4500) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lph;II)Lc;")
    public static final class284 method1877(class202 arg0, int arg1, int arg2) {
        return arg0.field3316 != null && arg0.field3316.length != 0 ? new class284(arg0, (int) ((long) arg0.field3317 * 256L * (long) arg1 / (long) (class81.field1478 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIILc;II)I")
    private static final int method1878(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class284 arg10, int arg11, int arg12) {
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
        arg10.field4504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIILc;II)I")
    private static final int method1879(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class284 arg11, int arg12, int arg13) {
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
        arg11.field4504 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([IIIII)I")
    private final int method1880(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4496 <= 0) {
                if (this.field4502 == -256 && (this.field4504 & 255) == 0) {
                    if (class74.field1215) {
                        return method1870(0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, 0, arg3, arg2, this);
                    }
                    return method1885(((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, 0, arg3, arg2, this);
                }
                if (class74.field1215) {
                    return method1879(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, 0, arg3, arg2, this, this.field4502, arg4);
                }
                return method1874(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, 0, arg3, arg2, this, this.field4502, arg4);
            }
            int var6 = this.field4496 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4496 += arg1;
            if (this.field4502 == -256 && (this.field4504 & 255) == 0) {
                if (class74.field1215) {
                    arg1 = method1883(0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, this.field4495, this.field4501, 0, var6, arg2, this);
                } else {
                    arg1 = method1869(((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, this.field4498, 0, var6, arg2, this);
                }
            } else if (class74.field1215) {
                arg1 = method1865(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4493, this.field4500, this.field4495, this.field4501, 0, var6, arg2, this, this.field4502, arg4);
            } else {
                arg1 = method1889(0, 0, ((class202) super.field597).field3316, arg0, this.field4504, arg1, this.field4505, this.field4498, 0, var6, arg2, this, this.field4502, arg4);
            }
            this.field4496 -= arg1;
            if (this.field4496 != 0) {
                return arg1;
            }
        } while (!this.method1892());
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([III)V")
    public final synchronized void method257(int[] arg0, int arg1, int arg2) {
        if (this.field4494 == 0 && this.field4496 == 0) {
            this.method253(arg2);
        } else {
            class202 var4 = (class202) super.field597;
            int var5 = this.field4507 << 8;
            int var6 = this.field4499 << 8;
            int var7 = var4.field3316.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4497 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4504 < 0) {
                if (this.field4502 <= 0) {
                    this.method1890();
                    this.method547(10026);
                    return;
                }
                this.field4504 = 0;
            }
            if (this.field4504 >= var7) {
                if (this.field4502 >= 0) {
                    this.method1890();
                    this.method547(10026);
                    return;
                }
                this.field4504 = var7 - 1;
            }
            if (this.field4497 < 0) {
                if (this.field4503) {
                    if (this.field4502 < 0) {
                        var9 = this.method1880(arg0, arg1, var5, var10, var4.field3316[this.field4507]);
                        if (this.field4504 >= var5) {
                            return;
                        }
                        this.field4504 = var5 + var5 - 1 - this.field4504;
                        this.field4502 = -this.field4502;
                    }
                    while (true) {
                        int var11 = this.method1871(arg0, var9, var6, var10, var4.field3316[this.field4499 - 1]);
                        if (this.field4504 < var6) {
                            return;
                        }
                        this.field4504 = var6 + var6 - 1 - this.field4504;
                        this.field4502 = -this.field4502;
                        var9 = this.method1880(arg0, var11, var5, var10, var4.field3316[this.field4507]);
                        if (this.field4504 >= var5) {
                            return;
                        }
                        this.field4504 = var5 + var5 - 1 - this.field4504;
                        this.field4502 = -this.field4502;
                    }
                } else if (this.field4502 < 0) {
                    while (true) {
                        var9 = this.method1880(arg0, var9, var5, var10, var4.field3316[this.field4499 - 1]);
                        if (this.field4504 >= var5) {
                            return;
                        }
                        this.field4504 = var6 - 1 - (var6 - 1 - this.field4504) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1871(arg0, var9, var6, var10, var4.field3316[this.field4507]);
                        if (this.field4504 < var6) {
                            return;
                        }
                        this.field4504 = (this.field4504 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4497 > 0) {
                    if (this.field4503) {
                        label130: {
                            if (this.field4502 < 0) {
                                var9 = this.method1880(arg0, arg1, var5, var10, var4.field3316[this.field4507]);
                                if (this.field4504 >= var5) {
                                    return;
                                }
                                this.field4504 = var5 + var5 - 1 - this.field4504;
                                this.field4502 = -this.field4502;
                                if (--this.field4497 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1871(arg0, var9, var6, var10, var4.field3316[this.field4499 - 1]);
                                if (this.field4504 < var6) {
                                    return;
                                }
                                this.field4504 = var6 + var6 - 1 - this.field4504;
                                this.field4502 = -this.field4502;
                                if (--this.field4497 == 0) {
                                    break;
                                }
                                var9 = this.method1880(arg0, var9, var5, var10, var4.field3316[this.field4507]);
                                if (this.field4504 >= var5) {
                                    return;
                                }
                                this.field4504 = var5 + var5 - 1 - this.field4504;
                                this.field4502 = -this.field4502;
                            } while (--this.field4497 != 0);
                        }
                    } else if (this.field4502 < 0) {
                        while (true) {
                            var9 = this.method1880(arg0, var9, var5, var10, var4.field3316[this.field4499 - 1]);
                            if (this.field4504 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4504) / var8;
                            if (var12 >= this.field4497) {
                                this.field4504 += this.field4497 * var8;
                                this.field4497 = 0;
                                break;
                            }
                            this.field4504 += var8 * var12;
                            this.field4497 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1871(arg0, var9, var6, var10, var4.field3316[this.field4507]);
                            if (this.field4504 < var6) {
                                return;
                            }
                            int var13 = (this.field4504 - var5) / var8;
                            if (var13 >= this.field4497) {
                                this.field4504 -= this.field4497 * var8;
                                this.field4497 = 0;
                                break;
                            }
                            this.field4504 -= var8 * var13;
                            this.field4497 -= var13;
                        }
                    }
                }
                if (this.field4502 < 0) {
                    this.method1880(arg0, var9, 0, var10, 0);
                    if (this.field4504 < 0) {
                        this.field4504 = -1;
                        this.method1890();
                        this.method547(10026);
                        return;
                    }
                } else {
                    this.method1871(arg0, var9, var7, var10, 0);
                    if (this.field4504 >= var7) {
                        this.field4504 = var7;
                        this.method1890();
                        this.method547(10026);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
    private final synchronized void method1881(int arg0) {
        this.method1897(arg0, this.method1896());
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II)I")
    private static final int method1882(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I[B[IIIIIIIIIILc;)I")
    private static final int method1883(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class284 arg12) {
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
        arg12.field4505 += (var19 - arg4) * arg12.field4498;
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
        arg12.field4493 = var15 >> 2;
        arg12.field4500 = var16 >> 2;
        arg12.field4504 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "()Z")
    public final boolean method1884() {
        return this.field4496 != 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([B[IIIIIIILc;)I")
    private static final int method1885(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class284 arg8) {
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
        arg8.field4504 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I[B[IIIIIIIILc;)I")
    private static final int method1886(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class284 arg10) {
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
        arg10.field4504 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()I")
    public final int method268() {
        int var1 = this.field4505 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4497 == 0) {
            var2 -= this.field4504 * var2 / (((class202) super.field597).field3316.length << 8);
        } else if (this.field4497 >= 0) {
            var2 -= this.field4507 * var2 / ((class202) super.field597).field3316.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "()I")
    public final synchronized int method1887() {
        return this.field4502 < 0 ? -this.field4502 : this.field4502;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(II[B[IIIIIIIILc;II)I")
    private static final int method1888(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class284 arg11, int arg12, int arg13) {
        arg11.field4493 -= arg11.field4495 * arg5;
        arg11.field4500 -= arg11.field4501 * arg5;
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
        arg11.field4493 += arg11.field4495 * arg5;
        arg11.field4500 += arg11.field4501 * arg5;
        arg11.field4505 = arg6;
        arg11.field4504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(II[B[IIIIIIIILc;II)I")
    private static final int method1889(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class284 arg11, int arg12, int arg13) {
        arg11.field4493 -= arg11.field4495 * arg5;
        arg11.field4500 -= arg11.field4501 * arg5;
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
        arg11.field4493 += arg11.field4495 * arg5;
        arg11.field4500 += arg11.field4501 * arg5;
        arg11.field4505 = arg6;
        arg11.field4504 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()Lok;")
    public final class40 method252() {
        return null;
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "()V")
    private final void method1890() {
        if (this.field4496 != 0) {
            if (this.field4494 == Integer.MIN_VALUE) {
                this.field4494 = 0;
            }
            this.field4496 = 0;
            this.method1899();
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public final synchronized void method1891(int arg0) {
        if (arg0 == 0) {
            this.method1881(0);
            this.method547(10026);
        } else if (this.field4493 == 0 && this.field4500 == 0) {
            this.field4496 = 0;
            this.field4494 = 0;
            this.field4505 = 0;
            this.method547(10026);
        } else {
            int var2 = -this.field4505;
            if (this.field4505 > var2) {
                var2 = this.field4505;
            }
            if (-this.field4493 > var2) {
                var2 = -this.field4493;
            }
            if (this.field4493 > var2) {
                var2 = this.field4493;
            }
            if (-this.field4500 > var2) {
                var2 = -this.field4500;
            }
            if (this.field4500 > var2) {
                var2 = this.field4500;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4496 = arg0;
            this.field4494 = Integer.MIN_VALUE;
            this.field4498 = -this.field4505 / arg0;
            this.field4495 = -this.field4493 / arg0;
            this.field4501 = -this.field4500 / arg0;
        }
    }

    @OriginalMember(owner = "client!c", name = "j", descriptor = "()Z")
    private final boolean method1892() {
        int var1 = this.field4494;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1882(var1, this.field4506);
            var2 = method1864(var1, this.field4506);
        }
        if (this.field4505 == var1 && this.field4493 == var3 && this.field4500 == var2) {
            if (this.field4494 == Integer.MIN_VALUE) {
                this.field4494 = 0;
                this.field4505 = this.field4493 = this.field4500 = 0;
                this.method547(10026);
                return true;
            } else {
                this.method1899();
                return false;
            }
        } else {
            if (this.field4505 < var1) {
                this.field4498 = 1;
                this.field4496 = var1 - this.field4505;
            } else if (this.field4505 > var1) {
                this.field4498 = -1;
                this.field4496 = this.field4505 - var1;
            } else {
                this.field4498 = 0;
            }
            if (this.field4493 < var3) {
                this.field4495 = 1;
                if (this.field4496 == 0 || this.field4496 > var3 - this.field4493) {
                    this.field4496 = var3 - this.field4493;
                }
            } else if (this.field4493 > var3) {
                this.field4495 = -1;
                if (this.field4496 == 0 || this.field4496 > this.field4493 - var3) {
                    this.field4496 = this.field4493 - var3;
                }
            } else {
                this.field4495 = 0;
            }
            if (this.field4500 < var2) {
                this.field4501 = 1;
                if (this.field4496 == 0 || this.field4496 > var2 - this.field4500) {
                    this.field4496 = var2 - this.field4500;
                }
            } else if (this.field4500 > var2) {
                this.field4501 = -1;
                if (this.field4496 == 0 || this.field4496 > this.field4500 - var2) {
                    this.field4496 = this.field4500 - var2;
                }
            } else {
                this.field4501 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public final synchronized void method1893(int arg0) {
        this.method1897(arg0 << 6, this.method1896());
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([B[IIIIIIIILc;)I")
    private static final int method1894(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class284 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4493 += (var14 - arg3) * arg9.field4495;
        arg9.field4500 += (var14 - arg3) * arg9.field4501;
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
        arg9.field4505 = var12 >> 2;
        arg9.field4504 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V")
    public final synchronized void method1895(int arg0) {
        if (this.field4502 < 0) {
            this.field4502 = -arg0;
        } else {
            this.field4502 = arg0;
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "()I")
    public final synchronized int method1896() {
        return this.field4506 < 0 ? -1 : this.field4506;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public final synchronized void method253(int arg0) {
        if (this.field4496 > 0) {
            if (arg0 >= this.field4496) {
                if (this.field4494 == Integer.MIN_VALUE) {
                    this.field4494 = 0;
                    this.field4505 = this.field4493 = this.field4500 = 0;
                    this.method547(10026);
                    arg0 = this.field4496;
                }
                this.field4496 = 0;
                this.method1899();
            } else {
                this.field4505 += this.field4498 * arg0;
                this.field4493 += this.field4495 * arg0;
                this.field4500 += this.field4501 * arg0;
                this.field4496 -= arg0;
            }
        }
        class202 var2 = (class202) super.field597;
        int var3 = this.field4507 << 8;
        int var4 = this.field4499 << 8;
        int var5 = var2.field3316.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4497 = 0;
        }
        if (this.field4504 < 0) {
            if (this.field4502 <= 0) {
                this.method1890();
                this.method547(10026);
                return;
            }
            this.field4504 = 0;
        }
        if (this.field4504 >= var5) {
            if (this.field4502 >= 0) {
                this.method1890();
                this.method547(10026);
                return;
            }
            this.field4504 = var5 - 1;
        }
        this.field4504 += this.field4502 * arg0;
        if (this.field4497 < 0) {
            if (!this.field4503) {
                if (this.field4502 < 0) {
                    if (this.field4504 < var3) {
                        this.field4504 = var4 - 1 - (var4 - 1 - this.field4504) % var6;
                    }
                } else if (this.field4504 >= var4) {
                    this.field4504 = (this.field4504 - var3) % var6 + var3;
                }
            } else {
                if (this.field4502 < 0) {
                    if (this.field4504 >= var3) {
                        return;
                    }
                    this.field4504 = var3 + var3 - 1 - this.field4504;
                    this.field4502 = -this.field4502;
                }
                while (this.field4504 >= var4) {
                    this.field4504 = var4 + var4 - 1 - this.field4504;
                    this.field4502 = -this.field4502;
                    if (this.field4504 >= var3) {
                        return;
                    }
                    this.field4504 = var3 + var3 - 1 - this.field4504;
                    this.field4502 = -this.field4502;
                }
            }
        } else {
            if (this.field4497 > 0) {
                if (this.field4503) {
                    label125: {
                        if (this.field4502 < 0) {
                            if (this.field4504 >= var3) {
                                return;
                            }
                            this.field4504 = var3 + var3 - 1 - this.field4504;
                            this.field4502 = -this.field4502;
                            if (--this.field4497 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4504 < var4) {
                                return;
                            }
                            this.field4504 = var4 + var4 - 1 - this.field4504;
                            this.field4502 = -this.field4502;
                            if (--this.field4497 == 0) {
                                break;
                            }
                            if (this.field4504 >= var3) {
                                return;
                            }
                            this.field4504 = var3 + var3 - 1 - this.field4504;
                            this.field4502 = -this.field4502;
                        } while (--this.field4497 != 0);
                    }
                } else if (this.field4502 < 0) {
                    if (this.field4504 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4504) / var6;
                    if (var7 < this.field4497) {
                        this.field4504 += var6 * var7;
                        this.field4497 -= var7;
                        return;
                    }
                    this.field4504 += this.field4497 * var6;
                    this.field4497 = 0;
                } else {
                    if (this.field4504 < var4) {
                        return;
                    }
                    int var8 = (this.field4504 - var3) / var6;
                    if (var8 < this.field4497) {
                        this.field4504 -= var6 * var8;
                        this.field4497 -= var8;
                        return;
                    }
                    this.field4504 -= this.field4497 * var6;
                    this.field4497 = 0;
                }
            }
            if (this.field4502 < 0) {
                if (this.field4504 < 0) {
                    this.field4504 = -1;
                    this.method1890();
                    this.method547(10026);
                    return;
                }
            } else if (this.field4504 >= var5) {
                this.field4504 = var5;
                this.method1890();
                this.method547(10026);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(II)V")
    private final synchronized void method1897(int arg0, int arg1) {
        this.field4494 = arg0;
        this.field4506 = arg1;
        this.field4496 = 0;
        this.method1899();
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([B[IIIIIIILc;)I")
    private static final int method1898(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class284 arg8) {
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
        arg8.field4504 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!c", name = "l", descriptor = "()V")
    private final void method1899() {
        this.field4505 = this.field4494;
        this.field4493 = method1882(this.field4494, this.field4506);
        this.field4500 = method1864(this.field4494, this.field4506);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lph;II)V")
    private class284(class202 arg0, int arg1, int arg2) {
        super.field597 = arg0;
        this.field4507 = arg0.field3315;
        this.field4499 = arg0.field3314;
        this.field4503 = arg0.field3313;
        this.field4502 = arg1;
        this.field4494 = arg2;
        this.field4506 = 8192;
        this.field4504 = 0;
        this.method1899();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
    public final int method256() {
        return this.field4494 == 0 && this.field4496 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "(I)V")
    public final synchronized void method1900(int arg0) {
        this.field4497 = arg0;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lph;III)V")
    private class284(class202 arg0, int arg1, int arg2, int arg3) {
        super.field597 = arg0;
        this.field4507 = arg0.field3315;
        this.field4499 = arg0.field3314;
        this.field4503 = arg0.field3313;
        this.field4502 = arg1;
        this.field4494 = arg2;
        this.field4506 = arg3;
        this.field4504 = 0;
        this.method1899();
    }
}
