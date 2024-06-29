import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class244 extends class412 {

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Z")
    private boolean field3613;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    private int field3605;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    private int field3606;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    private int field3611;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    private int field3612;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 3)
    public final synchronized void method1660(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1685(arg1, arg2);
        } else {
            int var4 = method1670(arg1, arg2);
            int var5 = method1700(arg1, arg2);
            if (this.field3606 == var4 && this.field3612 == var5) {
                this.field3616 = 0;
            } else {
                int var6 = arg1 - this.field3607;
                if (this.field3607 - arg1 > var6) {
                    var6 = this.field3607 - arg1;
                }
                if (var4 - this.field3606 > var6) {
                    var6 = var4 - this.field3606;
                }
                if (this.field3606 - var4 > var6) {
                    var6 = this.field3606 - var4;
                }
                if (var5 - this.field3612 > var6) {
                    var6 = var5 - this.field3612;
                }
                if (this.field3612 - var5 > var6) {
                    var6 = this.field3612 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3616 = arg0;
                this.field3605 = arg1;
                this.field3609 = arg2;
                this.field3608 = (arg1 - this.field3607) / arg0;
                this.field3619 = (var4 - this.field3606) / arg0;
                this.field3615 = (var5 - this.field3612) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()I", line = 49)
    public final int method720() {
        return this.field3605 == 0 && this.field3616 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 57)
    public final synchronized void method1661(int arg0) {
        if (arg0 == 0) {
            this.method1673(0);
            this.method2660((byte) 121);
        } else if (this.field3606 == 0 && this.field3612 == 0) {
            this.field3616 = 0;
            this.field3605 = 0;
            this.field3607 = 0;
            this.method2660((byte) 122);
        } else {
            int var2 = -this.field3607;
            if (this.field3607 > var2) {
                var2 = this.field3607;
            }
            if (-this.field3606 > var2) {
                var2 = -this.field3606;
            }
            if (this.field3606 > var2) {
                var2 = this.field3606;
            }
            if (-this.field3612 > var2) {
                var2 = -this.field3612;
            }
            if (this.field3612 > var2) {
                var2 = this.field3612;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3616 = arg0;
            this.field3605 = Integer.MIN_VALUE;
            this.field3608 = -this.field3607 / arg0;
            this.field3619 = -this.field3606 / arg0;
            this.field3615 = -this.field3612 / arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[B[IIIIIIIILad;)I", line = 102)
    private static final int method1662(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class244 arg10) {
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
        arg10.field3614 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()Z", line = 142)
    public final boolean method1663() {
        return this.field3614 < 0 || this.field3614 >= ((class272) super.field5900).field3957.length << 8;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[B[IIIIIIIILad;II)I", line = 145)
    private static final int method1664(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class244 arg11, int arg12, int arg13) {
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
        arg11.field3614 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[B[IIIIIIIIIILad;II)I", line = 178)
    private static final int method1665(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class244 arg13, int arg14, int arg15) {
        arg13.field3607 -= arg13.field3608 * arg5;
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
        arg13.field3607 += arg13.field3608 * var22;
        arg13.field3606 = arg6;
        arg13.field3612 = arg7;
        arg13.field3614 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([B[IIIIIIILad;)I", line = 220)
    private static final int method1666(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class244 arg8) {
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
        arg8.field3614 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II[B[IIIIIIIIIILad;II)I", line = 245)
    private static final int method1667(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class244 arg13, int arg14, int arg15) {
        arg13.field3607 -= arg13.field3608 * arg5;
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
        arg13.field3607 += arg13.field3608 * var22;
        arg13.field3606 = arg6;
        arg13.field3612 = arg7;
        arg13.field3614 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([B[IIIIIIILad;)I", line = 288)
    private static final int method1668(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class244 arg8) {
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
        arg8.field3614 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([B[IIIIIIIILad;)I", line = 314)
    private static final int method1669(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class244 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3606 += (var14 - arg3) * arg9.field3619;
        arg9.field3612 += (var14 - arg3) * arg9.field3615;
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
        arg9.field3607 = var12 >> 2;
        arg9.field3614 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I", line = 348)
    private static final int method1670(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[B[IIIIIIIIIILad;)I", line = 351)
    private static final int method1671(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class244 arg12) {
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
        arg12.field3607 += (var19 - arg4) * arg12.field3608;
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
        arg12.field3606 = var15 >> 2;
        arg12.field3612 = var16 >> 2;
        arg12.field3614 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "()I", line = 404)
    public final synchronized int method1672() {
        return this.field3605 == Integer.MIN_VALUE ? 0 : this.field3605;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lkb;", line = 409)
    public final class412 method725() {
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 413)
    private final synchronized void method1673(int arg0) {
        this.method1685(arg0, this.method1699());
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([IIIII)I", line = 417)
    private final int method1674(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3616 <= 0) {
                if (this.field3617 == 256 && (this.field3614 & 255) == 0) {
                    if (class46.field615) {
                        return method1696(0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, 0, arg3, arg2, this);
                    }
                    return method1666(((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, 0, arg3, arg2, this);
                }
                if (class46.field615) {
                    return method1664(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, 0, arg3, arg2, this, this.field3617, arg4);
                }
                return method1694(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, 0, arg3, arg2, this, this.field3617, arg4);
            }
            int var6 = this.field3616 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3616 += arg1;
            if (this.field3617 == 256 && (this.field3614 & 255) == 0) {
                if (class46.field615) {
                    arg1 = method1677(0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, this.field3619, this.field3615, 0, var6, arg2, this);
                } else {
                    arg1 = method1669(((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, this.field3608, 0, var6, arg2, this);
                }
            } else if (class46.field615) {
                arg1 = method1665(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, this.field3619, this.field3615, 0, var6, arg2, this, this.field3617, arg4);
            } else {
                arg1 = method1684(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, this.field3608, 0, var6, arg2, this, this.field3617, arg4);
            }
            this.field3616 -= arg1;
            if (this.field3616 != 0) {
                return arg1;
            }
        } while (!this.method1683());
        return arg3;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 472)
    public final synchronized void method1675(int arg0) {
        this.method1685(arg0 << 6, this.method1699());
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "()V", line = 475)
    private final void method1676() {
        this.field3607 = this.field3605;
        this.field3606 = method1670(this.field3605, this.field3609);
        this.field3612 = method1700(this.field3605, this.field3609);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I[B[IIIIIIIIIILad;)I", line = 481)
    private static final int method1677(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class244 arg12) {
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
        arg12.field3607 += (var19 - arg4) * arg12.field3608;
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
        arg12.field3606 = var15 >> 2;
        arg12.field3612 = var16 >> 2;
        arg12.field3614 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([IIIII)I", line = 535)
    private final int method1678(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3616 <= 0) {
                if (this.field3617 == -256 && (this.field3614 & 255) == 0) {
                    if (class46.field615) {
                        return method1662(0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, 0, arg3, arg2, this);
                    }
                    return method1668(((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, 0, arg3, arg2, this);
                }
                if (class46.field615) {
                    return method1697(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, 0, arg3, arg2, this, this.field3617, arg4);
                }
                return method1681(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, 0, arg3, arg2, this, this.field3617, arg4);
            }
            int var6 = this.field3616 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3616 += arg1;
            if (this.field3617 == -256 && (this.field3614 & 255) == 0) {
                if (class46.field615) {
                    arg1 = method1671(0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, this.field3619, this.field3615, 0, var6, arg2, this);
                } else {
                    arg1 = method1688(((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, this.field3608, 0, var6, arg2, this);
                }
            } else if (class46.field615) {
                arg1 = method1667(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3606, this.field3612, this.field3619, this.field3615, 0, var6, arg2, this, this.field3617, arg4);
            } else {
                arg1 = method1686(0, 0, ((class272) super.field5900).field3957, arg0, this.field3614, arg1, this.field3607, this.field3608, 0, var6, arg2, this, this.field3617, arg4);
            }
            this.field3616 -= arg1;
            if (this.field3616 != 0) {
                return arg1;
            }
        } while (!this.method1683());
        return arg3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 592)
    public final synchronized void method722(int arg0) {
        if (this.field3616 > 0) {
            if (arg0 >= this.field3616) {
                if (this.field3605 == Integer.MIN_VALUE) {
                    this.field3605 = 0;
                    this.field3607 = this.field3606 = this.field3612 = 0;
                    this.method2660((byte) 119);
                    arg0 = this.field3616;
                }
                this.field3616 = 0;
                this.method1676();
            } else {
                this.field3607 += this.field3608 * arg0;
                this.field3606 += this.field3619 * arg0;
                this.field3612 += this.field3615 * arg0;
                this.field3616 -= arg0;
            }
        }
        class272 var2 = (class272) super.field5900;
        int var3 = this.field3610 << 8;
        int var4 = this.field3618 << 8;
        int var5 = var2.field3957.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3611 = 0;
        }
        if (this.field3614 < 0) {
            if (this.field3617 <= 0) {
                this.method1679();
                this.method2660((byte) 126);
                return;
            }
            this.field3614 = 0;
        }
        if (this.field3614 >= var5) {
            if (this.field3617 >= 0) {
                this.method1679();
                this.method2660((byte) 120);
                return;
            }
            this.field3614 = var5 - 1;
        }
        this.field3614 += this.field3617 * arg0;
        if (this.field3611 < 0) {
            if (!this.field3613) {
                if (this.field3617 < 0) {
                    if (this.field3614 < var3) {
                        this.field3614 = var4 - 1 - (var4 - 1 - this.field3614) % var6;
                    }
                } else if (this.field3614 >= var4) {
                    this.field3614 = (this.field3614 - var3) % var6 + var3;
                }
            } else {
                if (this.field3617 < 0) {
                    if (this.field3614 >= var3) {
                        return;
                    }
                    this.field3614 = var3 + var3 - 1 - this.field3614;
                    this.field3617 = -this.field3617;
                }
                while (this.field3614 >= var4) {
                    this.field3614 = var4 + var4 - 1 - this.field3614;
                    this.field3617 = -this.field3617;
                    if (this.field3614 >= var3) {
                        return;
                    }
                    this.field3614 = var3 + var3 - 1 - this.field3614;
                    this.field3617 = -this.field3617;
                }
            }
        } else {
            if (this.field3611 > 0) {
                if (this.field3613) {
                    label125: {
                        if (this.field3617 < 0) {
                            if (this.field3614 >= var3) {
                                return;
                            }
                            this.field3614 = var3 + var3 - 1 - this.field3614;
                            this.field3617 = -this.field3617;
                            if (--this.field3611 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3614 < var4) {
                                return;
                            }
                            this.field3614 = var4 + var4 - 1 - this.field3614;
                            this.field3617 = -this.field3617;
                            if (--this.field3611 == 0) {
                                break;
                            }
                            if (this.field3614 >= var3) {
                                return;
                            }
                            this.field3614 = var3 + var3 - 1 - this.field3614;
                            this.field3617 = -this.field3617;
                        } while (--this.field3611 != 0);
                    }
                } else if (this.field3617 < 0) {
                    if (this.field3614 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3614) / var6;
                    if (var7 < this.field3611) {
                        this.field3614 += var6 * var7;
                        this.field3611 -= var7;
                        return;
                    }
                    this.field3614 += this.field3611 * var6;
                    this.field3611 = 0;
                } else {
                    if (this.field3614 < var4) {
                        return;
                    }
                    int var8 = (this.field3614 - var3) / var6;
                    if (var8 < this.field3611) {
                        this.field3614 -= var6 * var8;
                        this.field3611 -= var8;
                        return;
                    }
                    this.field3614 -= this.field3611 * var6;
                    this.field3611 = 0;
                }
            }
            if (this.field3617 < 0) {
                if (this.field3614 < 0) {
                    this.field3614 = -1;
                    this.method1679();
                    this.method2660((byte) 122);
                    return;
                }
            } else if (this.field3614 >= var5) {
                this.field3614 = var5;
                this.method1679();
                this.method2660((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "()V", line = 810)
    private final void method1679() {
        if (this.field3616 != 0) {
            if (this.field3605 == Integer.MIN_VALUE) {
                this.field3605 = 0;
            }
            this.field3616 = 0;
            this.method1676();
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lkb;", line = 821)
    public final class412 method727() {
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbg;III)Lad;", line = 827)
    public static final class244 method1680(class272 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3957 != null && arg0.field3957.length != 0 ? new class244(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[B[IIIIIIILad;II)I", line = 834)
    private static final int method1681(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class244 arg10, int arg11, int arg12) {
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
        arg10.field3614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V", line = 861)
    public final synchronized void method724(int[] arg0, int arg1, int arg2) {
        if (this.field3605 == 0 && this.field3616 == 0) {
            this.method722(arg2);
        } else {
            class272 var4 = (class272) super.field5900;
            int var5 = this.field3610 << 8;
            int var6 = this.field3618 << 8;
            int var7 = var4.field3957.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3611 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3614 < 0) {
                if (this.field3617 <= 0) {
                    this.method1679();
                    this.method2660((byte) 112);
                    return;
                }
                this.field3614 = 0;
            }
            if (this.field3614 >= var7) {
                if (this.field3617 >= 0) {
                    this.method1679();
                    this.method2660((byte) 126);
                    return;
                }
                this.field3614 = var7 - 1;
            }
            if (this.field3611 < 0) {
                if (this.field3613) {
                    if (this.field3617 < 0) {
                        var9 = this.method1678(arg0, arg1, var5, var10, var4.field3957[this.field3610]);
                        if (this.field3614 >= var5) {
                            return;
                        }
                        this.field3614 = var5 + var5 - 1 - this.field3614;
                        this.field3617 = -this.field3617;
                    }
                    while (true) {
                        int var11 = this.method1674(arg0, var9, var6, var10, var4.field3957[this.field3618 - 1]);
                        if (this.field3614 < var6) {
                            return;
                        }
                        this.field3614 = var6 + var6 - 1 - this.field3614;
                        this.field3617 = -this.field3617;
                        var9 = this.method1678(arg0, var11, var5, var10, var4.field3957[this.field3610]);
                        if (this.field3614 >= var5) {
                            return;
                        }
                        this.field3614 = var5 + var5 - 1 - this.field3614;
                        this.field3617 = -this.field3617;
                    }
                } else if (this.field3617 < 0) {
                    while (true) {
                        var9 = this.method1678(arg0, var9, var5, var10, var4.field3957[this.field3618 - 1]);
                        if (this.field3614 >= var5) {
                            return;
                        }
                        this.field3614 = var6 - 1 - (var6 - 1 - this.field3614) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1674(arg0, var9, var6, var10, var4.field3957[this.field3610]);
                        if (this.field3614 < var6) {
                            return;
                        }
                        this.field3614 = (this.field3614 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3611 > 0) {
                    if (this.field3613) {
                        label130: {
                            if (this.field3617 < 0) {
                                var9 = this.method1678(arg0, arg1, var5, var10, var4.field3957[this.field3610]);
                                if (this.field3614 >= var5) {
                                    return;
                                }
                                this.field3614 = var5 + var5 - 1 - this.field3614;
                                this.field3617 = -this.field3617;
                                if (--this.field3611 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1674(arg0, var9, var6, var10, var4.field3957[this.field3618 - 1]);
                                if (this.field3614 < var6) {
                                    return;
                                }
                                this.field3614 = var6 + var6 - 1 - this.field3614;
                                this.field3617 = -this.field3617;
                                if (--this.field3611 == 0) {
                                    break;
                                }
                                var9 = this.method1678(arg0, var9, var5, var10, var4.field3957[this.field3610]);
                                if (this.field3614 >= var5) {
                                    return;
                                }
                                this.field3614 = var5 + var5 - 1 - this.field3614;
                                this.field3617 = -this.field3617;
                            } while (--this.field3611 != 0);
                        }
                    } else if (this.field3617 < 0) {
                        while (true) {
                            var9 = this.method1678(arg0, var9, var5, var10, var4.field3957[this.field3618 - 1]);
                            if (this.field3614 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3614) / var8;
                            if (var12 >= this.field3611) {
                                this.field3614 += this.field3611 * var8;
                                this.field3611 = 0;
                                break;
                            }
                            this.field3614 += var8 * var12;
                            this.field3611 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1674(arg0, var9, var6, var10, var4.field3957[this.field3610]);
                            if (this.field3614 < var6) {
                                return;
                            }
                            int var13 = (this.field3614 - var5) / var8;
                            if (var13 >= this.field3611) {
                                this.field3614 -= this.field3611 * var8;
                                this.field3611 = 0;
                                break;
                            }
                            this.field3614 -= var8 * var13;
                            this.field3611 -= var13;
                        }
                    }
                }
                if (this.field3617 < 0) {
                    this.method1678(arg0, var9, 0, var10, 0);
                    if (this.field3614 < 0) {
                        this.field3614 = -1;
                        this.method1679();
                        this.method2660((byte) 121);
                        return;
                    }
                } else {
                    this.method1674(arg0, var9, var7, var10, 0);
                    if (this.field3614 >= var7) {
                        this.field3614 = var7;
                        this.method1679();
                        this.method2660((byte) 120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 1096)
    public final synchronized void method1682(int arg0) {
        if (this.field3617 < 0) {
            this.field3617 = -arg0;
        } else {
            this.field3617 = arg0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "()Z", line = 1105)
    private final boolean method1683() {
        int var1 = this.field3605;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1670(var1, this.field3609);
            var2 = method1700(var1, this.field3609);
        }
        if (this.field3607 == var1 && this.field3606 == var3 && this.field3612 == var2) {
            if (this.field3605 == Integer.MIN_VALUE) {
                this.field3605 = 0;
                this.field3607 = this.field3606 = this.field3612 = 0;
                this.method2660((byte) 117);
                return true;
            } else {
                this.method1676();
                return false;
            }
        } else {
            if (this.field3607 < var1) {
                this.field3608 = 1;
                this.field3616 = var1 - this.field3607;
            } else if (this.field3607 > var1) {
                this.field3608 = -1;
                this.field3616 = this.field3607 - var1;
            } else {
                this.field3608 = 0;
            }
            if (this.field3606 < var3) {
                this.field3619 = 1;
                if (this.field3616 == 0 || this.field3616 > var3 - this.field3606) {
                    this.field3616 = var3 - this.field3606;
                }
            } else if (this.field3606 > var3) {
                this.field3619 = -1;
                if (this.field3616 == 0 || this.field3616 > this.field3606 - var3) {
                    this.field3616 = this.field3606 - var3;
                }
            } else {
                this.field3619 = 0;
            }
            if (this.field3612 < var2) {
                this.field3615 = 1;
                if (this.field3616 == 0 || this.field3616 > var2 - this.field3612) {
                    this.field3616 = var2 - this.field3612;
                }
            } else if (this.field3612 > var2) {
                this.field3615 = -1;
                if (this.field3616 == 0 || this.field3616 > this.field3612 - var2) {
                    this.field3616 = this.field3612 - var2;
                }
            } else {
                this.field3615 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II[B[IIIIIIIILad;II)I", line = 1191)
    private static final int method1684(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class244 arg11, int arg12, int arg13) {
        arg11.field3606 -= arg11.field3619 * arg5;
        arg11.field3612 -= arg11.field3615 * arg5;
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
        arg11.field3606 += arg11.field3619 * arg5;
        arg11.field3612 += arg11.field3615 * arg5;
        arg11.field3607 = arg6;
        arg11.field3614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V", line = 1225)
    private final synchronized void method1685(int arg0, int arg1) {
        this.field3605 = arg0;
        this.field3609 = arg1;
        this.field3616 = 0;
        this.method1676();
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II[B[IIIIIIIILad;II)I", line = 1234)
    private static final int method1686(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class244 arg11, int arg12, int arg13) {
        arg11.field3606 -= arg11.field3619 * arg5;
        arg11.field3612 -= arg11.field3615 * arg5;
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
        arg11.field3606 += arg11.field3619 * arg5;
        arg11.field3612 += arg11.field3615 * arg5;
        arg11.field3607 = arg6;
        arg11.field3614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 1267)
    public final synchronized void method1687(boolean arg0) {
        this.field3617 = (this.field3617 >>> 31) + (this.field3617 ^ this.field3617 >> 31);
        if (arg0) {
            this.field3617 = -this.field3617;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([B[IIIIIIIILad;)I", line = 1273)
    private static final int method1688(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class244 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3606 += (var14 - arg3) * arg9.field3619;
        arg9.field3612 += (var14 - arg3) * arg9.field3615;
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
        arg9.field3607 = var12 >> 2;
        arg9.field3614 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 1308)
    public final synchronized void method1689(int arg0) {
        int var2 = ((class272) super.field5900).field3957.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3614 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "()Z", line = 1321)
    public final boolean method1690() {
        return this.field3616 != 0;
    }

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "()I", line = 1324)
    public final synchronized int method1691() {
        return this.field3617 < 0 ? -this.field3617 : this.field3617;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()I", line = 1328)
    public final int method1692() {
        int var1 = this.field3607 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3611 == 0) {
            var2 -= this.field3614 * var2 / (((class272) super.field5900).field3957.length << 8);
        } else if (this.field3611 >= 0) {
            var2 -= this.field3610 * var2 / ((class272) super.field5900).field3957.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V", line = 1340)
    public final synchronized void method1693(int arg0) {
        this.field3611 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II[B[IIIIIIILad;II)I", line = 1343)
    private static final int method1694(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class244 arg10, int arg11, int arg12) {
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
        arg10.field3614 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbg;II)Lad;", line = 1370)
    public static final class244 method1695(class272 arg0, int arg1, int arg2) {
        return arg0.field3957 != null && arg0.field3957.length != 0 ? new class244(arg0, (int) ((long) arg0.field3959 * 256L * (long) arg1 / (long) (class246.field3671 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I[B[IIIIIIIILad;)I", line = 1377)
    private static final int method1696(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class244 arg10) {
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
        arg10.field3614 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II[B[IIIIIIIILad;II)I", line = 1416)
    private static final int method1697(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class244 arg11, int arg12, int arg13) {
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
        arg11.field3614 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)V", line = 1448)
    public final synchronized void method1698(int arg0, int arg1) {
        this.method1660(arg0, arg1, this.method1699());
    }

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "()I", line = 1451)
    public final synchronized int method1699() {
        return this.field3609 < 0 ? -1 : this.field3609;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)I", line = 1456)
    private static final int method1700(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lbg;II)V", line = 1458)
    private class244(class272 arg0, int arg1, int arg2) {
        super.field5900 = arg0;
        this.field3610 = arg0.field3960;
        this.field3618 = arg0.field3956;
        this.field3613 = arg0.field3958;
        this.field3617 = arg1;
        this.field3605 = arg2;
        this.field3609 = 8192;
        this.field3614 = 0;
        this.method1676();
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lbg;III)V", line = 1469)
    private class244(class272 arg0, int arg1, int arg2, int arg3) {
        super.field5900 = arg0;
        this.field3610 = arg0.field3960;
        this.field3618 = arg0.field3956;
        this.field3613 = arg0.field3958;
        this.field3617 = arg1;
        this.field3605 = arg2;
        this.field3609 = arg3;
        this.field3614 = 0;
        this.method1676();
    }
}
