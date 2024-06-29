import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class557 extends class202 {

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    private int field7731;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    private int field7723;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Z")
    private boolean field7728;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    private int field7724;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    private int field7726;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
    private int field7730;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    private int field7722;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    private int field7725;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    private int field7727;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    private int field7729;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
    private int field7732;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    private int field7733;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    private int field7735;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    private int field7736;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I[B[IIIIIIIILws;)I", line = 4)
    private static final int method3212(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10) {
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
        arg10.field7730 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 42)
    public final synchronized void method3213(int arg0) {
        this.field7733 = arg0;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 47)
    public final synchronized void method3214(boolean arg0) {
        this.field7734 = (this.field7734 >>> 31) + (this.field7734 ^ this.field7734 >> 31);
        if (arg0) {
            this.field7734 = -this.field7734;
        }
    }

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "(I)V", line = 56)
    public final synchronized void method3215(int arg0) {
        if (arg0 == 0) {
            this.method3222(0);
            this.method4237(-1);
        } else if (this.field7735 == 0 && this.field7727 == 0) {
            this.field7729 = 0;
            this.field7724 = 0;
            this.field7736 = 0;
            this.method4237(-1);
        } else {
            int var2 = -this.field7736;
            if (this.field7736 > var2) {
                var2 = this.field7736;
            }
            if (-this.field7735 > var2) {
                var2 = -this.field7735;
            }
            if (this.field7735 > var2) {
                var2 = this.field7735;
            }
            if (-this.field7727 > var2) {
                var2 = -this.field7727;
            }
            if (this.field7727 > var2) {
                var2 = this.field7727;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7729 = arg0;
            this.field7724 = Integer.MIN_VALUE;
            this.field7722 = -this.field7736 / arg0;
            this.field7732 = -this.field7735 / arg0;
            this.field7725 = -this.field7727 / arg0;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II[B[IIIIIIIILws;II)I", line = 101)
    private static final int method3216(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
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
        arg11.field7730 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "()I", line = 134)
    public final synchronized int method3217() {
        return this.field7734 < 0 ? -this.field7734 : this.field7734;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II[B[IIIIIIIIIILws;II)I", line = 137)
    private static final int method3218(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class557 arg13, int arg14, int arg15) {
        arg13.field7736 -= arg13.field7722 * arg5;
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
        arg13.field7736 += arg13.field7722 * var22;
        arg13.field7735 = arg6;
        arg13.field7727 = arg7;
        arg13.field7730 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II[B[IIIIIIIILws;II)I", line = 179)
    private static final int method3219(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
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
        arg11.field7730 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "(I)V", line = 211)
    public final synchronized void method3220(int arg0) {
        this.method3227(this.method3242(), arg0);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I[B[IIIIIIIILws;)I", line = 214)
    private static final int method3221(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10) {
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
        arg10.field7730 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "(I)V", line = 253)
    private final synchronized void method3222(int arg0) {
        this.method3227(arg0, this.method3231());
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II[B[IIIIIIILws;II)I", line = 256)
    private static final int method3223(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10, int arg11, int arg12) {
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
        arg10.field7730 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([B[IIIIIIIILws;)I", line = 282)
    private static final int method3224(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class557 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7735 += (var14 - arg3) * arg9.field7732;
        arg9.field7727 += (var14 - arg3) * arg9.field7725;
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
        arg9.field7736 = var12 >> 2;
        arg9.field7730 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I[B[IIIIIIIIIILws;)I", line = 318)
    private static final int method3225(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class557 arg12) {
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
        arg12.field7736 += (var19 - arg4) * arg12.field7722;
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
        arg12.field7735 = var15 >> 2;
        arg12.field7727 = var16 >> 2;
        arg12.field7730 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "(I)V", line = 371)
    public final synchronized void method3226(int arg0) {
        this.method3227(arg0 << 6, this.method3231());
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V", line = 375)
    private final synchronized void method3227(int arg0, int arg1) {
        this.field7724 = arg0;
        this.field7726 = arg1;
        this.field7729 = 0;
        this.method3243();
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II[B[IIIIIIILws;II)I", line = 381)
    private static final int method3228(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10, int arg11, int arg12) {
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
        arg10.field7730 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(II[B[IIIIIIIILws;II)I", line = 408)
    private static final int method3229(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
        arg11.field7735 -= arg11.field7732 * arg5;
        arg11.field7727 -= arg11.field7725 * arg5;
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
        arg11.field7735 += arg11.field7732 * arg5;
        arg11.field7727 += arg11.field7725 * arg5;
        arg11.field7736 = arg6;
        arg11.field7730 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)I", line = 443)
    private static final int method3230(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "()I", line = 446)
    public final synchronized int method3231() {
        return this.field7726 < 0 ? -1 : this.field7726;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([IIIII)I", line = 451)
    private final int method3232(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7729 <= 0) {
                if (this.field7734 == -256 && (this.field7730 & 255) == 0) {
                    if (class209.field3076) {
                        return method3221(0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, 0, arg3, arg2, this);
                    }
                    return method3250(((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, 0, arg3, arg2, this);
                }
                if (class209.field3076) {
                    return method3219(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, 0, arg3, arg2, this, this.field7734, arg4);
                }
                return method3228(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, 0, arg3, arg2, this, this.field7734, arg4);
            }
            int var6 = this.field7729 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7729 += arg1;
            if (this.field7734 == -256 && (this.field7730 & 255) == 0) {
                if (class209.field3076) {
                    arg1 = method3225(0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, this.field7732, this.field7725, 0, var6, arg2, this);
                } else {
                    arg1 = method3240(((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, this.field7722, 0, var6, arg2, this);
                }
            } else if (class209.field3076) {
                arg1 = method3218(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, this.field7732, this.field7725, 0, var6, arg2, this, this.field7734, arg4);
            } else {
                arg1 = method3235(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, this.field7722, 0, var6, arg2, this, this.field7734, arg4);
            }
            this.field7729 -= arg1;
            if (this.field7729 != 0) {
                return arg1;
            }
        } while (!this.method3251());
        return arg3;
    }

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "(I)V", line = 507)
    public final synchronized void method3233(int arg0) {
        int var2 = ((class101) super.field2996).field1495.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7730 = arg0;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 517)
    public final synchronized void method1421(int arg0) {
        if (this.field7729 > 0) {
            if (arg0 >= this.field7729) {
                if (this.field7724 == Integer.MIN_VALUE) {
                    this.field7724 = 0;
                    this.field7736 = this.field7735 = this.field7727 = 0;
                    this.method4237(-1);
                    arg0 = this.field7729;
                }
                this.field7729 = 0;
                this.method3243();
            } else {
                this.field7736 += this.field7722 * arg0;
                this.field7735 += this.field7732 * arg0;
                this.field7727 += this.field7725 * arg0;
                this.field7729 -= arg0;
            }
        }
        class101 var2 = (class101) super.field2996;
        int var3 = this.field7731 << 8;
        int var4 = this.field7723 << 8;
        int var5 = var2.field1495.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7733 = 0;
        }
        if (this.field7730 < 0) {
            if (this.field7734 <= 0) {
                this.method3246();
                this.method4237(-1);
                return;
            }
            this.field7730 = 0;
        }
        if (this.field7730 >= var5) {
            if (this.field7734 >= 0) {
                this.method3246();
                this.method4237(-1);
                return;
            }
            this.field7730 = var5 - 1;
        }
        this.field7730 += this.field7734 * arg0;
        if (this.field7733 < 0) {
            if (!this.field7728) {
                if (this.field7734 < 0) {
                    if (this.field7730 < var3) {
                        this.field7730 = var4 - 1 - (var4 - 1 - this.field7730) % var6;
                    }
                } else if (this.field7730 >= var4) {
                    this.field7730 = (this.field7730 - var3) % var6 + var3;
                }
            } else {
                if (this.field7734 < 0) {
                    if (this.field7730 >= var3) {
                        return;
                    }
                    this.field7730 = var3 + var3 - 1 - this.field7730;
                    this.field7734 = -this.field7734;
                }
                while (this.field7730 >= var4) {
                    this.field7730 = var4 + var4 - 1 - this.field7730;
                    this.field7734 = -this.field7734;
                    if (this.field7730 >= var3) {
                        return;
                    }
                    this.field7730 = var3 + var3 - 1 - this.field7730;
                    this.field7734 = -this.field7734;
                }
            }
        } else {
            if (this.field7733 > 0) {
                if (this.field7728) {
                    label125: {
                        if (this.field7734 < 0) {
                            if (this.field7730 >= var3) {
                                return;
                            }
                            this.field7730 = var3 + var3 - 1 - this.field7730;
                            this.field7734 = -this.field7734;
                            if (--this.field7733 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7730 < var4) {
                                return;
                            }
                            this.field7730 = var4 + var4 - 1 - this.field7730;
                            this.field7734 = -this.field7734;
                            if (--this.field7733 == 0) {
                                break;
                            }
                            if (this.field7730 >= var3) {
                                return;
                            }
                            this.field7730 = var3 + var3 - 1 - this.field7730;
                            this.field7734 = -this.field7734;
                        } while (--this.field7733 != 0);
                    }
                } else if (this.field7734 < 0) {
                    if (this.field7730 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7730) / var6;
                    if (var7 < this.field7733) {
                        this.field7730 += var6 * var7;
                        this.field7733 -= var7;
                        return;
                    }
                    this.field7730 += this.field7733 * var6;
                    this.field7733 = 0;
                } else {
                    if (this.field7730 < var4) {
                        return;
                    }
                    int var8 = (this.field7730 - var3) / var6;
                    if (var8 < this.field7733) {
                        this.field7730 -= var6 * var8;
                        this.field7733 -= var8;
                        return;
                    }
                    this.field7730 -= this.field7733 * var6;
                    this.field7733 = 0;
                }
            }
            if (this.field7734 < 0) {
                if (this.field7730 < 0) {
                    this.field7730 = -1;
                    this.method3246();
                    this.method4237(-1);
                    return;
                }
            } else if (this.field7730 >= var5) {
                this.field7730 = var5;
                this.method3246();
                this.method4237(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "()Lfja;", line = 737)
    public final class202 method1423() {
        return null;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I[B[IIIIIIIIIILws;)I", line = 741)
    private static final int method3234(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class557 arg12) {
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
        arg12.field7736 += (var19 - arg4) * arg12.field7722;
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
        arg12.field7735 = var15 >> 2;
        arg12.field7727 = var16 >> 2;
        arg12.field7730 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(II[B[IIIIIIIILws;II)I", line = 795)
    private static final int method3235(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
        arg11.field7735 -= arg11.field7732 * arg5;
        arg11.field7727 -= arg11.field7725 * arg5;
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
        arg11.field7735 += arg11.field7732 * arg5;
        arg11.field7727 += arg11.field7725 * arg5;
        arg11.field7736 = arg6;
        arg11.field7730 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "()I", line = 829)
    public final int method1419() {
        int var1 = this.field7736 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7733 == 0) {
            var2 -= this.field7730 * var2 / (((class101) super.field2996).field1495.length << 8);
        } else if (this.field7733 >= 0) {
            var2 -= this.field7731 * var2 / ((class101) super.field2996).field1495.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "()Z", line = 843)
    public final boolean method3236() {
        return this.field7729 != 0;
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(II)V", line = 846)
    public final synchronized void method3237(int arg0, int arg1) {
        this.method3248(arg0, arg1, this.method3231());
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "([IIIII)I", line = 849)
    private final int method3238(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7729 <= 0) {
                if (this.field7734 == 256 && (this.field7730 & 255) == 0) {
                    if (class209.field3076) {
                        return method3212(0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, 0, arg3, arg2, this);
                    }
                    return method3239(((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, 0, arg3, arg2, this);
                }
                if (class209.field3076) {
                    return method3216(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, 0, arg3, arg2, this, this.field7734, arg4);
                }
                return method3223(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, 0, arg3, arg2, this, this.field7734, arg4);
            }
            int var6 = this.field7729 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7729 += arg1;
            if (this.field7734 == 256 && (this.field7730 & 255) == 0) {
                if (class209.field3076) {
                    arg1 = method3234(0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, this.field7732, this.field7725, 0, var6, arg2, this);
                } else {
                    arg1 = method3224(((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, this.field7722, 0, var6, arg2, this);
                }
            } else if (class209.field3076) {
                arg1 = method3244(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7735, this.field7727, this.field7732, this.field7725, 0, var6, arg2, this, this.field7734, arg4);
            } else {
                arg1 = method3229(0, 0, ((class101) super.field2996).field1495, arg0, this.field7730, arg1, this.field7736, this.field7722, 0, var6, arg2, this, this.field7734, arg4);
            }
            this.field7729 -= arg1;
            if (this.field7729 != 0) {
                return arg1;
            }
        } while (!this.method3251());
        return arg3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([B[IIIIIIILws;)I", line = 905)
    private static final int method3239(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class557 arg8) {
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
        arg8.field7730 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "([B[IIIIIIIILws;)I", line = 930)
    private static final int method3240(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class557 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7735 += (var14 - arg3) * arg9.field7732;
        arg9.field7727 += (var14 - arg3) * arg9.field7725;
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
        arg9.field7736 = var12 >> 2;
        arg9.field7730 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "(I)V", line = 965)
    public final synchronized void method3241(int arg0) {
        if (this.field7734 < 0) {
            this.field7734 = -arg0;
        } else {
            this.field7734 = arg0;
        }
    }

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "()I", line = 973)
    public final synchronized int method3242() {
        return this.field7724 == Integer.MIN_VALUE ? 0 : this.field7724;
    }

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "()V", line = 976)
    private final void method3243() {
        this.field7736 = this.field7724;
        this.field7735 = method3230(this.field7724, this.field7726);
        this.field7727 = method3245(this.field7724, this.field7726);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II[B[IIIIIIIIIILws;II)I", line = 982)
    private static final int method3244(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class557 arg13, int arg14, int arg15) {
        arg13.field7736 -= arg13.field7722 * arg5;
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
        arg13.field7736 += arg13.field7722 * var22;
        arg13.field7735 = arg6;
        arg13.field7727 = arg7;
        arg13.field7730 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(II)I", line = 1025)
    private static final int method3245(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "()V", line = 1029)
    private final void method3246() {
        if (this.field7729 != 0) {
            if (this.field7724 == Integer.MIN_VALUE) {
                this.field7724 = 0;
            }
            this.field7729 = 0;
            this.method3243();
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lud;III)Lws;", line = 1042)
    public static final class557 method3247(class101 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1495 != null && arg0.field1495.length != 0 ? new class557(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "([III)V", line = 1048)
    public final synchronized void method1422(int[] arg0, int arg1, int arg2) {
        if (this.field7724 == 0 && this.field7729 == 0) {
            this.method1421(arg2);
        } else {
            class101 var4 = (class101) super.field2996;
            int var5 = this.field7731 << 8;
            int var6 = this.field7723 << 8;
            int var7 = var4.field1495.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7733 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7730 < 0) {
                if (this.field7734 <= 0) {
                    this.method3246();
                    this.method4237(-1);
                    return;
                }
                this.field7730 = 0;
            }
            if (this.field7730 >= var7) {
                if (this.field7734 >= 0) {
                    this.method3246();
                    this.method4237(-1);
                    return;
                }
                this.field7730 = var7 - 1;
            }
            if (this.field7733 < 0) {
                if (this.field7728) {
                    if (this.field7734 < 0) {
                        var9 = this.method3232(arg0, arg1, var5, var10, var4.field1495[this.field7731]);
                        if (this.field7730 >= var5) {
                            return;
                        }
                        this.field7730 = var5 + var5 - 1 - this.field7730;
                        this.field7734 = -this.field7734;
                    }
                    while (true) {
                        int var11 = this.method3238(arg0, var9, var6, var10, var4.field1495[this.field7723 - 1]);
                        if (this.field7730 < var6) {
                            return;
                        }
                        this.field7730 = var6 + var6 - 1 - this.field7730;
                        this.field7734 = -this.field7734;
                        var9 = this.method3232(arg0, var11, var5, var10, var4.field1495[this.field7731]);
                        if (this.field7730 >= var5) {
                            return;
                        }
                        this.field7730 = var5 + var5 - 1 - this.field7730;
                        this.field7734 = -this.field7734;
                    }
                } else if (this.field7734 < 0) {
                    while (true) {
                        var9 = this.method3232(arg0, var9, var5, var10, var4.field1495[this.field7723 - 1]);
                        if (this.field7730 >= var5) {
                            return;
                        }
                        this.field7730 = var6 - 1 - (var6 - 1 - this.field7730) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3238(arg0, var9, var6, var10, var4.field1495[this.field7731]);
                        if (this.field7730 < var6) {
                            return;
                        }
                        this.field7730 = (this.field7730 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7733 > 0) {
                    if (this.field7728) {
                        label130: {
                            if (this.field7734 < 0) {
                                var9 = this.method3232(arg0, arg1, var5, var10, var4.field1495[this.field7731]);
                                if (this.field7730 >= var5) {
                                    return;
                                }
                                this.field7730 = var5 + var5 - 1 - this.field7730;
                                this.field7734 = -this.field7734;
                                if (--this.field7733 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3238(arg0, var9, var6, var10, var4.field1495[this.field7723 - 1]);
                                if (this.field7730 < var6) {
                                    return;
                                }
                                this.field7730 = var6 + var6 - 1 - this.field7730;
                                this.field7734 = -this.field7734;
                                if (--this.field7733 == 0) {
                                    break;
                                }
                                var9 = this.method3232(arg0, var9, var5, var10, var4.field1495[this.field7731]);
                                if (this.field7730 >= var5) {
                                    return;
                                }
                                this.field7730 = var5 + var5 - 1 - this.field7730;
                                this.field7734 = -this.field7734;
                            } while (--this.field7733 != 0);
                        }
                    } else if (this.field7734 < 0) {
                        while (true) {
                            var9 = this.method3232(arg0, var9, var5, var10, var4.field1495[this.field7723 - 1]);
                            if (this.field7730 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7730) / var8;
                            if (var12 >= this.field7733) {
                                this.field7730 += this.field7733 * var8;
                                this.field7733 = 0;
                                break;
                            }
                            this.field7730 += var8 * var12;
                            this.field7733 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3238(arg0, var9, var6, var10, var4.field1495[this.field7731]);
                            if (this.field7730 < var6) {
                                return;
                            }
                            int var13 = (this.field7730 - var5) / var8;
                            if (var13 >= this.field7733) {
                                this.field7730 -= this.field7733 * var8;
                                this.field7733 = 0;
                                break;
                            }
                            this.field7730 -= var8 * var13;
                            this.field7733 -= var13;
                        }
                    }
                }
                if (this.field7734 < 0) {
                    this.method3232(arg0, var9, 0, var10, 0);
                    if (this.field7730 < 0) {
                        this.field7730 = -1;
                        this.method3246();
                        this.method4237(-1);
                        return;
                    }
                } else {
                    this.method3238(arg0, var9, var7, var10, 0);
                    if (this.field7730 >= var7) {
                        this.field7730 = var7;
                        this.method3246();
                        this.method4237(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V", line = 1284)
    public final synchronized void method3248(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3227(arg1, arg2);
        } else {
            int var4 = method3230(arg1, arg2);
            int var5 = method3245(arg1, arg2);
            if (this.field7735 == var4 && this.field7727 == var5) {
                this.field7729 = 0;
            } else {
                int var6 = arg1 - this.field7736;
                if (this.field7736 - arg1 > var6) {
                    var6 = this.field7736 - arg1;
                }
                if (var4 - this.field7735 > var6) {
                    var6 = var4 - this.field7735;
                }
                if (this.field7735 - var4 > var6) {
                    var6 = this.field7735 - var4;
                }
                if (var5 - this.field7727 > var6) {
                    var6 = var5 - this.field7727;
                }
                if (this.field7727 - var5 > var6) {
                    var6 = this.field7727 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7729 = arg0;
                this.field7724 = arg1;
                this.field7726 = arg2;
                this.field7722 = (arg1 - this.field7736) / arg0;
                this.field7732 = (var4 - this.field7735) / arg0;
                this.field7725 = (var5 - this.field7727) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "()Lfja;", line = 1330)
    public final class202 method1420() {
        return null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "()I", line = 1333)
    public final int method1418() {
        return this.field7724 == 0 && this.field7729 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "()Z", line = 1339)
    public final boolean method3249() {
        return this.field7730 < 0 || this.field7730 >= ((class101) super.field2996).field1495.length << 8;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "([B[IIIIIIILws;)I", line = 1342)
    private static final int method3250(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class557 arg8) {
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
        arg8.field7730 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "()Z", line = 1371)
    private final boolean method3251() {
        int var1 = this.field7724;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3230(var1, this.field7726);
            var2 = method3245(var1, this.field7726);
        }
        if (this.field7736 == var1 && this.field7735 == var3 && this.field7727 == var2) {
            if (this.field7724 == Integer.MIN_VALUE) {
                this.field7724 = 0;
                this.field7736 = this.field7735 = this.field7727 = 0;
                this.method4237(-1);
                return true;
            } else {
                this.method3243();
                return false;
            }
        } else {
            if (this.field7736 < var1) {
                this.field7722 = 1;
                this.field7729 = var1 - this.field7736;
            } else if (this.field7736 > var1) {
                this.field7722 = -1;
                this.field7729 = this.field7736 - var1;
            } else {
                this.field7722 = 0;
            }
            if (this.field7735 < var3) {
                this.field7732 = 1;
                if (this.field7729 == 0 || this.field7729 > var3 - this.field7735) {
                    this.field7729 = var3 - this.field7735;
                }
            } else if (this.field7735 > var3) {
                this.field7732 = -1;
                if (this.field7729 == 0 || this.field7729 > this.field7735 - var3) {
                    this.field7729 = this.field7735 - var3;
                }
            } else {
                this.field7732 = 0;
            }
            if (this.field7727 < var2) {
                this.field7725 = 1;
                if (this.field7729 == 0 || this.field7729 > var2 - this.field7727) {
                    this.field7729 = var2 - this.field7727;
                }
            } else if (this.field7727 > var2) {
                this.field7725 = -1;
                if (this.field7729 == 0 || this.field7729 > this.field7727 - var2) {
                    this.field7729 = this.field7727 - var2;
                }
            } else {
                this.field7725 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lud;III)V", line = 1456)
    private class557(class101 arg0, int arg1, int arg2, int arg3) {
        super.field2996 = arg0;
        this.field7731 = arg0.field1493;
        this.field7723 = arg0.field1497;
        this.field7728 = arg0.field1494;
        this.field7734 = arg1;
        this.field7724 = arg2;
        this.field7726 = arg3;
        this.field7730 = 0;
        this.method3243();
    }
}
