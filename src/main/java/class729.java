import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class729 extends class648 {

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    private int field10207;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    private int field10199;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Z")
    private boolean field10210;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    private int field10200;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    private int field10203;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    private int field10196;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private int field10202;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    private int field10197;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    private int field10198;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    private int field10201;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    private int field10204;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field10205;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    private int field10206;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    private int field10208;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    private int field10209;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public final synchronized void method4036(int arg0, int arg1) {
        this.method4068(arg0, arg1, this.method4052());
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public final synchronized void method4037(boolean arg0) {
        this.field10200 = (this.field10200 >>> 31) + (this.field10200 ^ this.field10200 >> 31);
        if (arg0) {
            this.field10200 = -this.field10200;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[B[IIIIIIILbf;II)I")
    private static final int method4038(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class729 arg10, int arg11, int arg12) {
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
        arg10.field10202 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "()Z")
    private final boolean method4039() {
        int var1 = this.field10203;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method4042(var1, this.field10196);
            var2 = method4072(var1, this.field10196);
        }
        if (this.field10198 == var1 && this.field10205 == var3 && this.field10197 == var2) {
            if (this.field10203 == Integer.MIN_VALUE) {
                this.field10203 = 0;
                this.field10198 = this.field10205 = this.field10197 = 0;
                this.method3426((byte) -119);
                return true;
            } else {
                this.method4041();
                return false;
            }
        } else {
            if (this.field10198 < var1) {
                this.field10201 = 1;
                this.field10206 = var1 - this.field10198;
            } else if (this.field10198 > var1) {
                this.field10201 = -1;
                this.field10206 = this.field10198 - var1;
            } else {
                this.field10201 = 0;
            }
            if (this.field10205 < var3) {
                this.field10208 = 1;
                if (this.field10206 == 0 || this.field10206 > var3 - this.field10205) {
                    this.field10206 = var3 - this.field10205;
                }
            } else if (this.field10205 > var3) {
                this.field10208 = -1;
                if (this.field10206 == 0 || this.field10206 > this.field10205 - var3) {
                    this.field10206 = this.field10205 - var3;
                }
            } else {
                this.field10208 = 0;
            }
            if (this.field10197 < var2) {
                this.field10204 = 1;
                if (this.field10206 == 0 || this.field10206 > var2 - this.field10197) {
                    this.field10206 = var2 - this.field10197;
                }
            } else if (this.field10197 > var2) {
                this.field10204 = -1;
                if (this.field10206 == 0 || this.field10206 > this.field10197 - var2) {
                    this.field10206 = this.field10197 - var2;
                }
            } else {
                this.field10204 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public final synchronized void method4040(int arg0) {
        this.field10209 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "()V")
    private final void method4041() {
        this.field10198 = this.field10203;
        this.field10205 = method4042(this.field10203, this.field10196);
        this.field10197 = method4072(this.field10203, this.field10196);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()Lrn;")
    public final class648 method673() {
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
    private static final int method4042(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[B[IIIIIIIIIILbf;II)I")
    private static final int method4043(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class729 arg13, int arg14, int arg15) {
        arg13.field10198 -= arg13.field10201 * arg5;
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
        arg13.field10198 += arg13.field10201 * var22;
        arg13.field10205 = arg6;
        arg13.field10197 = arg7;
        arg13.field10202 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B[IIIIIIIIIILbf;)I")
    private static final int method4044(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class729 arg12) {
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
        arg12.field10198 += (var19 - arg4) * arg12.field10201;
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
        arg12.field10205 = var15 >> 2;
        arg12.field10197 = var16 >> 2;
        arg12.field10202 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
    public final int method3505() {
        int var1 = this.field10198 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field10209 == 0) {
            var2 -= this.field10202 * var2 / (((class639) super.field8910).field8849.length << 8);
        } else if (this.field10209 >= 0) {
            var2 -= this.field10207 * var2 / ((class639) super.field8910).field8849.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final int method671() {
        return this.field10203 == 0 && this.field10206 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "()Z")
    public final boolean method4045() {
        return this.field10202 < 0 || this.field10202 >= ((class639) super.field8910).field8849.length << 8;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final synchronized void method4046(int arg0) {
        this.method4048(arg0 << 6, this.method4052());
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([B[IIIIIIILbf;)I")
    private static final int method4047(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class729 arg8) {
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
        arg8.field10202 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
    private final synchronized void method4048(int arg0, int arg1) {
        this.field10203 = arg0;
        this.field10196 = arg1;
        this.field10206 = 0;
        this.method4041();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[B[IIIIIIIILbf;II)I")
    private static final int method4049(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class729 arg11, int arg12, int arg13) {
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
        arg11.field10202 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II[B[IIIIIIIIIILbf;II)I")
    private static final int method4050(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class729 arg13, int arg14, int arg15) {
        arg13.field10198 -= arg13.field10201 * arg5;
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
        arg13.field10198 += arg13.field10201 * var22;
        arg13.field10205 = arg6;
        arg13.field10197 = arg7;
        arg13.field10202 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([B[IIIIIIILbf;)I")
    private static final int method4051(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class729 arg8) {
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
        arg8.field10202 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "()I")
    public final synchronized int method4052() {
        return this.field10196 < 0 ? -1 : this.field10196;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II[B[IIIIIIILbf;II)I")
    private static final int method4053(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class729 arg10, int arg11, int arg12) {
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
        arg10.field10202 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "()I")
    public final synchronized int method4054() {
        return this.field10200 < 0 ? -this.field10200 : this.field10200;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I[B[IIIIIIIIIILbf;)I")
    private static final int method4055(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class729 arg12) {
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
        arg12.field10198 += (var19 - arg4) * arg12.field10201;
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
        arg12.field10205 = var15 >> 2;
        arg12.field10197 = var16 >> 2;
        arg12.field10202 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II[B[IIIIIIIILbf;II)I")
    private static final int method4056(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class729 arg11, int arg12, int arg13) {
        arg11.field10205 -= arg11.field10208 * arg5;
        arg11.field10197 -= arg11.field10204 * arg5;
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
        arg11.field10205 += arg11.field10208 * arg5;
        arg11.field10197 += arg11.field10204 * arg5;
        arg11.field10198 = arg6;
        arg11.field10202 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    private final synchronized void method4057(int arg0) {
        this.method4048(arg0, this.method4052());
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public final synchronized void method4058(int arg0) {
        this.method4048(this.method4074(), arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([B[IIIIIIIILbf;)I")
    private static final int method4059(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class729 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field10205 += (var14 - arg3) * arg9.field10208;
        arg9.field10197 += (var14 - arg3) * arg9.field10204;
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
        arg9.field10198 = var12 >> 2;
        arg9.field10202 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([IIIII)I")
    private final int method4060(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field10206 <= 0) {
                if (this.field10200 == -256 && (this.field10202 & 255) == 0) {
                    if (class48.field709) {
                        return method4071(0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, 0, arg3, arg2, this);
                    }
                    return method4051(((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, 0, arg3, arg2, this);
                }
                if (class48.field709) {
                    return method4065(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, 0, arg3, arg2, this, this.field10200, arg4);
                }
                return method4053(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, 0, arg3, arg2, this, this.field10200, arg4);
            }
            int var6 = this.field10206 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field10206 += arg1;
            if (this.field10200 == -256 && (this.field10202 & 255) == 0) {
                if (class48.field709) {
                    arg1 = method4055(0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, this.field10208, this.field10204, 0, var6, arg2, this);
                } else {
                    arg1 = method4059(((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, this.field10201, 0, var6, arg2, this);
                }
            } else if (class48.field709) {
                arg1 = method4043(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, this.field10208, this.field10204, 0, var6, arg2, this, this.field10200, arg4);
            } else {
                arg1 = method4056(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, this.field10201, 0, var6, arg2, this, this.field10200, arg4);
            }
            this.field10206 -= arg1;
            if (this.field10206 != 0) {
                return arg1;
            }
        } while (!this.method4039());
        return arg3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B[IIIIIIIILbf;)I")
    private static final int method4061(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class729 arg10) {
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
        arg10.field10202 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
    public final synchronized void method4062(int arg0) {
        int var2 = ((class639) super.field8910).field8849.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field10202 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "()Z")
    public final boolean method4063() {
        return this.field10206 != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final synchronized void method661(int arg0) {
        if (this.field10206 > 0) {
            if (arg0 >= this.field10206) {
                if (this.field10203 == Integer.MIN_VALUE) {
                    this.field10203 = 0;
                    this.field10198 = this.field10205 = this.field10197 = 0;
                    this.method3426((byte) -77);
                    arg0 = this.field10206;
                }
                this.field10206 = 0;
                this.method4041();
            } else {
                this.field10198 += this.field10201 * arg0;
                this.field10205 += this.field10208 * arg0;
                this.field10197 += this.field10204 * arg0;
                this.field10206 -= arg0;
            }
        }
        class639 var2 = (class639) super.field8910;
        int var3 = this.field10207 << 8;
        int var4 = this.field10199 << 8;
        int var5 = var2.field8849.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field10209 = 0;
        }
        if (this.field10202 < 0) {
            if (this.field10200 <= 0) {
                this.method4069();
                this.method3426((byte) -23);
                return;
            }
            this.field10202 = 0;
        }
        if (this.field10202 >= var5) {
            if (this.field10200 >= 0) {
                this.method4069();
                this.method3426((byte) -68);
                return;
            }
            this.field10202 = var5 - 1;
        }
        this.field10202 += this.field10200 * arg0;
        if (this.field10209 < 0) {
            if (!this.field10210) {
                if (this.field10200 < 0) {
                    if (this.field10202 < var3) {
                        this.field10202 = var4 - 1 - (var4 - 1 - this.field10202) % var6;
                    }
                } else if (this.field10202 >= var4) {
                    this.field10202 = (this.field10202 - var3) % var6 + var3;
                }
            } else {
                if (this.field10200 < 0) {
                    if (this.field10202 >= var3) {
                        return;
                    }
                    this.field10202 = var3 + var3 - 1 - this.field10202;
                    this.field10200 = -this.field10200;
                }
                while (this.field10202 >= var4) {
                    this.field10202 = var4 + var4 - 1 - this.field10202;
                    this.field10200 = -this.field10200;
                    if (this.field10202 >= var3) {
                        return;
                    }
                    this.field10202 = var3 + var3 - 1 - this.field10202;
                    this.field10200 = -this.field10200;
                }
            }
        } else {
            if (this.field10209 > 0) {
                if (this.field10210) {
                    label125: {
                        if (this.field10200 < 0) {
                            if (this.field10202 >= var3) {
                                return;
                            }
                            this.field10202 = var3 + var3 - 1 - this.field10202;
                            this.field10200 = -this.field10200;
                            if (--this.field10209 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field10202 < var4) {
                                return;
                            }
                            this.field10202 = var4 + var4 - 1 - this.field10202;
                            this.field10200 = -this.field10200;
                            if (--this.field10209 == 0) {
                                break;
                            }
                            if (this.field10202 >= var3) {
                                return;
                            }
                            this.field10202 = var3 + var3 - 1 - this.field10202;
                            this.field10200 = -this.field10200;
                        } while (--this.field10209 != 0);
                    }
                } else if (this.field10200 < 0) {
                    if (this.field10202 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field10202) / var6;
                    if (var7 < this.field10209) {
                        this.field10202 += var6 * var7;
                        this.field10209 -= var7;
                        return;
                    }
                    this.field10202 += this.field10209 * var6;
                    this.field10209 = 0;
                } else {
                    if (this.field10202 < var4) {
                        return;
                    }
                    int var8 = (this.field10202 - var3) / var6;
                    if (var8 < this.field10209) {
                        this.field10202 -= var6 * var8;
                        this.field10209 -= var8;
                        return;
                    }
                    this.field10202 -= this.field10209 * var6;
                    this.field10209 = 0;
                }
            }
            if (this.field10200 < 0) {
                if (this.field10202 < 0) {
                    this.field10202 = -1;
                    this.method4069();
                    this.method3426((byte) -121);
                    return;
                }
            } else if (this.field10202 >= var5) {
                this.field10202 = var5;
                this.method4069();
                this.method3426((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([IIIII)I")
    private final int method4064(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field10206 <= 0) {
                if (this.field10200 == 256 && (this.field10202 & 255) == 0) {
                    if (class48.field709) {
                        return method4061(0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, 0, arg3, arg2, this);
                    }
                    return method4047(((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, 0, arg3, arg2, this);
                }
                if (class48.field709) {
                    return method4049(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, 0, arg3, arg2, this, this.field10200, arg4);
                }
                return method4038(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, 0, arg3, arg2, this, this.field10200, arg4);
            }
            int var6 = this.field10206 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field10206 += arg1;
            if (this.field10200 == 256 && (this.field10202 & 255) == 0) {
                if (class48.field709) {
                    arg1 = method4044(0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, this.field10208, this.field10204, 0, var6, arg2, this);
                } else {
                    arg1 = method4073(((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, this.field10201, 0, var6, arg2, this);
                }
            } else if (class48.field709) {
                arg1 = method4050(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10205, this.field10197, this.field10208, this.field10204, 0, var6, arg2, this, this.field10200, arg4);
            } else {
                arg1 = method4066(0, 0, ((class639) super.field8910).field8849, arg0, this.field10202, arg1, this.field10198, this.field10201, 0, var6, arg2, this, this.field10200, arg4);
            }
            this.field10206 -= arg1;
            if (this.field10206 != 0) {
                return arg1;
            }
        } while (!this.method4039());
        return arg3;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([III)V")
    public final synchronized void method670(int[] arg0, int arg1, int arg2) {
        if (this.field10203 == 0 && this.field10206 == 0) {
            this.method661(arg2);
        } else {
            class639 var4 = (class639) super.field8910;
            int var5 = this.field10207 << 8;
            int var6 = this.field10199 << 8;
            int var7 = var4.field8849.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field10209 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field10202 < 0) {
                if (this.field10200 <= 0) {
                    this.method4069();
                    this.method3426((byte) -20);
                    return;
                }
                this.field10202 = 0;
            }
            if (this.field10202 >= var7) {
                if (this.field10200 >= 0) {
                    this.method4069();
                    this.method3426((byte) -88);
                    return;
                }
                this.field10202 = var7 - 1;
            }
            if (this.field10209 < 0) {
                if (this.field10210) {
                    if (this.field10200 < 0) {
                        var9 = this.method4060(arg0, arg1, var5, var10, var4.field8849[this.field10207]);
                        if (this.field10202 >= var5) {
                            return;
                        }
                        this.field10202 = var5 + var5 - 1 - this.field10202;
                        this.field10200 = -this.field10200;
                    }
                    while (true) {
                        int var11 = this.method4064(arg0, var9, var6, var10, var4.field8849[this.field10199 - 1]);
                        if (this.field10202 < var6) {
                            return;
                        }
                        this.field10202 = var6 + var6 - 1 - this.field10202;
                        this.field10200 = -this.field10200;
                        var9 = this.method4060(arg0, var11, var5, var10, var4.field8849[this.field10207]);
                        if (this.field10202 >= var5) {
                            return;
                        }
                        this.field10202 = var5 + var5 - 1 - this.field10202;
                        this.field10200 = -this.field10200;
                    }
                } else if (this.field10200 < 0) {
                    while (true) {
                        var9 = this.method4060(arg0, var9, var5, var10, var4.field8849[this.field10199 - 1]);
                        if (this.field10202 >= var5) {
                            return;
                        }
                        this.field10202 = var6 - 1 - (var6 - 1 - this.field10202) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method4064(arg0, var9, var6, var10, var4.field8849[this.field10207]);
                        if (this.field10202 < var6) {
                            return;
                        }
                        this.field10202 = (this.field10202 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field10209 > 0) {
                    if (this.field10210) {
                        label130: {
                            if (this.field10200 < 0) {
                                var9 = this.method4060(arg0, arg1, var5, var10, var4.field8849[this.field10207]);
                                if (this.field10202 >= var5) {
                                    return;
                                }
                                this.field10202 = var5 + var5 - 1 - this.field10202;
                                this.field10200 = -this.field10200;
                                if (--this.field10209 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method4064(arg0, var9, var6, var10, var4.field8849[this.field10199 - 1]);
                                if (this.field10202 < var6) {
                                    return;
                                }
                                this.field10202 = var6 + var6 - 1 - this.field10202;
                                this.field10200 = -this.field10200;
                                if (--this.field10209 == 0) {
                                    break;
                                }
                                var9 = this.method4060(arg0, var9, var5, var10, var4.field8849[this.field10207]);
                                if (this.field10202 >= var5) {
                                    return;
                                }
                                this.field10202 = var5 + var5 - 1 - this.field10202;
                                this.field10200 = -this.field10200;
                            } while (--this.field10209 != 0);
                        }
                    } else if (this.field10200 < 0) {
                        while (true) {
                            var9 = this.method4060(arg0, var9, var5, var10, var4.field8849[this.field10199 - 1]);
                            if (this.field10202 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field10202) / var8;
                            if (var12 >= this.field10209) {
                                this.field10202 += this.field10209 * var8;
                                this.field10209 = 0;
                                break;
                            }
                            this.field10202 += var8 * var12;
                            this.field10209 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method4064(arg0, var9, var6, var10, var4.field8849[this.field10207]);
                            if (this.field10202 < var6) {
                                return;
                            }
                            int var13 = (this.field10202 - var5) / var8;
                            if (var13 >= this.field10209) {
                                this.field10202 -= this.field10209 * var8;
                                this.field10209 = 0;
                                break;
                            }
                            this.field10202 -= var8 * var13;
                            this.field10209 -= var13;
                        }
                    }
                }
                if (this.field10200 < 0) {
                    this.method4060(arg0, var9, 0, var10, 0);
                    if (this.field10202 < 0) {
                        this.field10202 = -1;
                        this.method4069();
                        this.method3426((byte) -89);
                        return;
                    }
                } else {
                    this.method4064(arg0, var9, var7, var10, 0);
                    if (this.field10202 >= var7) {
                        this.field10202 = var7;
                        this.method4069();
                        this.method3426((byte) -101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lrn;")
    public final class648 method662() {
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II[B[IIIIIIIILbf;II)I")
    private static final int method4065(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class729 arg11, int arg12, int arg13) {
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
        arg11.field10202 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II[B[IIIIIIIILbf;II)I")
    private static final int method4066(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class729 arg11, int arg12, int arg13) {
        arg11.field10205 -= arg11.field10208 * arg5;
        arg11.field10197 -= arg11.field10204 * arg5;
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
        arg11.field10205 += arg11.field10208 * arg5;
        arg11.field10197 += arg11.field10204 * arg5;
        arg11.field10198 = arg6;
        arg11.field10202 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
    public final synchronized void method4067(int arg0) {
        if (arg0 == 0) {
            this.method4057(0);
            this.method3426((byte) -66);
        } else if (this.field10205 == 0 && this.field10197 == 0) {
            this.field10206 = 0;
            this.field10203 = 0;
            this.field10198 = 0;
            this.method3426((byte) -11);
        } else {
            int var2 = -this.field10198;
            if (this.field10198 > var2) {
                var2 = this.field10198;
            }
            if (-this.field10205 > var2) {
                var2 = -this.field10205;
            }
            if (this.field10205 > var2) {
                var2 = this.field10205;
            }
            if (-this.field10197 > var2) {
                var2 = -this.field10197;
            }
            if (this.field10197 > var2) {
                var2 = this.field10197;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field10206 = arg0;
            this.field10203 = Integer.MIN_VALUE;
            this.field10201 = -this.field10198 / arg0;
            this.field10208 = -this.field10205 / arg0;
            this.field10204 = -this.field10197 / arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public final synchronized void method4068(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method4048(arg1, arg2);
        } else {
            int var4 = method4042(arg1, arg2);
            int var5 = method4072(arg1, arg2);
            if (this.field10205 == var4 && this.field10197 == var5) {
                this.field10206 = 0;
            } else {
                int var6 = arg1 - this.field10198;
                if (this.field10198 - arg1 > var6) {
                    var6 = this.field10198 - arg1;
                }
                if (var4 - this.field10205 > var6) {
                    var6 = var4 - this.field10205;
                }
                if (this.field10205 - var4 > var6) {
                    var6 = this.field10205 - var4;
                }
                if (var5 - this.field10197 > var6) {
                    var6 = var5 - this.field10197;
                }
                if (this.field10197 - var5 > var6) {
                    var6 = this.field10197 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field10206 = arg0;
                this.field10203 = arg1;
                this.field10196 = arg2;
                this.field10201 = (arg1 - this.field10198) / arg0;
                this.field10208 = (var4 - this.field10205) / arg0;
                this.field10204 = (var5 - this.field10197) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "()V")
    private final void method4069() {
        if (this.field10206 != 0) {
            if (this.field10203 == Integer.MIN_VALUE) {
                this.field10203 = 0;
            }
            this.field10206 = 0;
            this.method4041();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lma;III)Lbf;")
    public static final class729 method4070(class639 arg0, int arg1, int arg2, int arg3) {
        return arg0.field8849 != null && arg0.field8849.length != 0 ? new class729(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I[B[IIIIIIIILbf;)I")
    private static final int method4071(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class729 arg10) {
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
        arg10.field10202 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)I")
    private static final int method4072(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([B[IIIIIIIILbf;)I")
    private static final int method4073(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class729 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field10205 += (var14 - arg3) * arg9.field10208;
        arg9.field10197 += (var14 - arg3) * arg9.field10204;
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
        arg9.field10198 = var12 >> 2;
        arg9.field10202 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "()I")
    public final synchronized int method4074() {
        return this.field10203 == Integer.MIN_VALUE ? 0 : this.field10203;
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
    public final synchronized void method4075(int arg0) {
        if (this.field10200 < 0) {
            this.field10200 = -arg0;
        } else {
            this.field10200 = arg0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lma;III)V")
    private class729(class639 arg0, int arg1, int arg2, int arg3) {
        super.field8910 = arg0;
        this.field10207 = arg0.field8846;
        this.field10199 = arg0.field8847;
        this.field10210 = arg0.field8850;
        this.field10200 = arg1;
        this.field10203 = arg2;
        this.field10196 = arg3;
        this.field10202 = 0;
        this.method4041();
    }
}
