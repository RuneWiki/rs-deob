import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class202 extends class283 {

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "Z")
    private boolean field3234;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    private int field3235;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    private int field3238;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    private int field3239;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    private int field3242;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    private int field3244;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "()I", line = 3)
    public final synchronized int method1401() {
        return this.field3241 < 0 ? -this.field3241 : this.field3241;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[B[IIIIIIIILrr;II)I", line = 6)
    private static final int method1402(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class202 arg11, int arg12, int arg13) {
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
        arg11.field3243 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "()V", line = 38)
    private final void method1403() {
        if (this.field3235 != 0) {
            if (this.field3236 == Integer.MIN_VALUE) {
                this.field3236 = 0;
            }
            this.field3235 = 0;
            this.method1439();
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V", line = 51)
    public final synchronized void method1404(boolean arg0) {
        this.field3241 = (this.field3241 >>> 31) + (this.field3241 ^ this.field3241 >> 31);
        if (arg0) {
            this.field3241 = -this.field3241;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[B[IIIIIIILrr;II)I", line = 61)
    private static final int method1405(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class202 arg10, int arg11, int arg12) {
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
        arg10.field3243 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[B[IIIIIIIIIILrr;II)I", line = 87)
    private static final int method1406(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class202 arg13, int arg14, int arg15) {
        arg13.field3247 -= arg13.field3244 * arg5;
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
        arg13.field3247 += arg13.field3244 * var22;
        arg13.field3238 = arg6;
        arg13.field3239 = arg7;
        arg13.field3243 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "()I", line = 130)
    public final int method1067() {
        return this.field3236 == 0 && this.field3235 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II[B[IIIIIIIILrr;II)I", line = 136)
    private static final int method1407(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class202 arg11, int arg12, int arg13) {
        arg11.field3238 -= arg11.field3246 * arg5;
        arg11.field3239 -= arg11.field3242 * arg5;
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
        arg11.field3238 += arg11.field3246 * arg5;
        arg11.field3239 += arg11.field3242 * arg5;
        arg11.field3247 = arg6;
        arg11.field3243 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V", line = 170)
    public final synchronized void method1408(int arg0) {
        if (arg0 == 0) {
            this.method1409(0);
            this.method1120(-92);
        } else if (this.field3238 == 0 && this.field3239 == 0) {
            this.field3235 = 0;
            this.field3236 = 0;
            this.field3247 = 0;
            this.method1120(-92);
        } else {
            int var2 = -this.field3247;
            if (this.field3247 > var2) {
                var2 = this.field3247;
            }
            if (-this.field3238 > var2) {
                var2 = -this.field3238;
            }
            if (this.field3238 > var2) {
                var2 = this.field3238;
            }
            if (-this.field3239 > var2) {
                var2 = -this.field3239;
            }
            if (this.field3239 > var2) {
                var2 = this.field3239;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3235 = arg0;
            this.field3236 = Integer.MIN_VALUE;
            this.field3244 = -this.field3247 / arg0;
            this.field3246 = -this.field3238 / arg0;
            this.field3242 = -this.field3239 / arg0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)V", line = 218)
    private final synchronized void method1409(int arg0) {
        this.method1437(arg0, this.method1434());
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)V", line = 222)
    public final synchronized void method1410(int arg0) {
        if (this.field3241 < 0) {
            this.field3241 = -arg0;
        } else {
            this.field3241 = arg0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "()Z", line = 229)
    public final boolean method1411() {
        return this.field3243 < 0 || this.field3243 >= ((class445) super.field4542).field6483.length << 8;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[B[IIIIIIIIIILrr;)I", line = 233)
    private static final int method1412(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class202 arg12) {
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
        arg12.field3247 += (var19 - arg4) * arg12.field3244;
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
        arg12.field3238 = var15 >> 2;
        arg12.field3239 = var16 >> 2;
        arg12.field3243 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V", line = 286)
    public final synchronized void method1413(int arg0, int arg1) {
        this.method1431(arg0, arg1, this.method1434());
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "()I", line = 291)
    public final int method1414() {
        int var1 = this.field3247 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3237 == 0) {
            var2 -= this.field3243 * var2 / (((class445) super.field4542).field6483.length << 8);
        } else if (this.field3237 >= 0) {
            var2 -= this.field3240 * var2 / ((class445) super.field4542).field6483.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([B[IIIIIIIILrr;)I", line = 303)
    private static final int method1415(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class202 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3238 += (var14 - arg3) * arg9.field3246;
        arg9.field3239 += (var14 - arg3) * arg9.field3242;
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
        arg9.field3247 = var12 >> 2;
        arg9.field3243 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lkr;III)Lrr;", line = 337)
    public static final class202 method1416(class445 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6483 != null && arg0.field6483.length != 0 ? new class202(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[B[IIIIIIIILrr;)I", line = 345)
    private static final int method1417(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class202 arg10) {
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
        arg10.field3243 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(II[B[IIIIIIIILrr;II)I", line = 383)
    private static final int method1418(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class202 arg11, int arg12, int arg13) {
        arg11.field3238 -= arg11.field3246 * arg5;
        arg11.field3239 -= arg11.field3242 * arg5;
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
        arg11.field3238 += arg11.field3246 * arg5;
        arg11.field3239 += arg11.field3242 * arg5;
        arg11.field3247 = arg6;
        arg11.field3243 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "()Z", line = 417)
    private final boolean method1419() {
        int var1 = this.field3236;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1436(var1, this.field3248);
            var2 = method1427(var1, this.field3248);
        }
        if (this.field3247 == var1 && this.field3238 == var3 && this.field3239 == var2) {
            if (this.field3236 == Integer.MIN_VALUE) {
                this.field3236 = 0;
                this.field3247 = this.field3238 = this.field3239 = 0;
                this.method1120(75);
                return true;
            } else {
                this.method1439();
                return false;
            }
        } else {
            if (this.field3247 < var1) {
                this.field3244 = 1;
                this.field3235 = var1 - this.field3247;
            } else if (this.field3247 > var1) {
                this.field3244 = -1;
                this.field3235 = this.field3247 - var1;
            } else {
                this.field3244 = 0;
            }
            if (this.field3238 < var3) {
                this.field3246 = 1;
                if (this.field3235 == 0 || this.field3235 > var3 - this.field3238) {
                    this.field3235 = var3 - this.field3238;
                }
            } else if (this.field3238 > var3) {
                this.field3246 = -1;
                if (this.field3235 == 0 || this.field3235 > this.field3238 - var3) {
                    this.field3235 = this.field3238 - var3;
                }
            } else {
                this.field3246 = 0;
            }
            if (this.field3239 < var2) {
                this.field3242 = 1;
                if (this.field3235 == 0 || this.field3235 > var2 - this.field3239) {
                    this.field3235 = var2 - this.field3239;
                }
            } else if (this.field3239 > var2) {
                this.field3242 = -1;
                if (this.field3235 == 0 || this.field3235 > this.field3239 - var2) {
                    this.field3235 = this.field3239 - var2;
                }
            } else {
                this.field3242 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "()I", line = 502)
    public final synchronized int method1420() {
        return this.field3236 == Integer.MIN_VALUE ? 0 : this.field3236;
    }

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "(I)V", line = 506)
    public final synchronized void method1421(int arg0) {
        this.field3237 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "(I)V", line = 510)
    public final synchronized void method1422(int arg0) {
        int var2 = ((class445) super.field4542).field6483.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3243 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()Lkp;", line = 520)
    public final class283 method1066() {
        return null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lkr;II)Lrr;", line = 523)
    public static final class202 method1423(class445 arg0, int arg1, int arg2) {
        return arg0.field6483 != null && arg0.field6483.length != 0 ? new class202(arg0, (int) ((long) arg0.field6485 * 256L * (long) arg1 / (long) (class413.field6106 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIIII)I", line = 529)
    private final int method1424(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3235 <= 0) {
                if (this.field3241 == -256 && (this.field3243 & 255) == 0) {
                    if (class29.field339) {
                        return method1417(0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, 0, arg3, arg2, this);
                    }
                    return method1440(((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, 0, arg3, arg2, this);
                }
                if (class29.field339) {
                    return method1402(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, 0, arg3, arg2, this, this.field3241, arg4);
                }
                return method1428(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, 0, arg3, arg2, this, this.field3241, arg4);
            }
            int var6 = this.field3235 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3235 += arg1;
            if (this.field3241 == -256 && (this.field3243 & 255) == 0) {
                if (class29.field339) {
                    arg1 = method1430(0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, this.field3246, this.field3242, 0, var6, arg2, this);
                } else {
                    arg1 = method1433(((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, this.field3244, 0, var6, arg2, this);
                }
            } else if (class29.field339) {
                arg1 = method1432(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, this.field3246, this.field3242, 0, var6, arg2, this, this.field3241, arg4);
            } else {
                arg1 = method1418(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, this.field3244, 0, var6, arg2, this, this.field3241, arg4);
            }
            this.field3235 -= arg1;
            if (this.field3235 != 0) {
                return arg1;
            }
        } while (!this.method1419());
        return arg3;
    }

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "(I)V", line = 586)
    public final synchronized void method1425(int arg0) {
        this.method1437(arg0 << 6, this.method1434());
    }

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "()Z", line = 589)
    public final boolean method1426() {
        return this.field3235 != 0;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I", line = 592)
    private static final int method1427(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II[B[IIIIIIILrr;II)I", line = 596)
    private static final int method1428(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class202 arg10, int arg11, int arg12) {
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
        arg10.field3243 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([B[IIIIIIILrr;)I", line = 622)
    private static final int method1429(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class202 arg8) {
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
        arg8.field3243 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([III)V", line = 647)
    public final synchronized void method1072(int[] arg0, int arg1, int arg2) {
        if (this.field3236 == 0 && this.field3235 == 0) {
            this.method1065(arg2);
        } else {
            class445 var4 = (class445) super.field4542;
            int var5 = this.field3240 << 8;
            int var6 = this.field3245 << 8;
            int var7 = var4.field6483.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3237 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3243 < 0) {
                if (this.field3241 <= 0) {
                    this.method1403();
                    this.method1120(-110);
                    return;
                }
                this.field3243 = 0;
            }
            if (this.field3243 >= var7) {
                if (this.field3241 >= 0) {
                    this.method1403();
                    this.method1120(-112);
                    return;
                }
                this.field3243 = var7 - 1;
            }
            if (this.field3237 < 0) {
                if (this.field3234) {
                    if (this.field3241 < 0) {
                        var9 = this.method1424(arg0, arg1, var5, var10, var4.field6483[this.field3240]);
                        if (this.field3243 >= var5) {
                            return;
                        }
                        this.field3243 = var5 + var5 - 1 - this.field3243;
                        this.field3241 = -this.field3241;
                    }
                    while (true) {
                        int var11 = this.method1438(arg0, var9, var6, var10, var4.field6483[this.field3245 - 1]);
                        if (this.field3243 < var6) {
                            return;
                        }
                        this.field3243 = var6 + var6 - 1 - this.field3243;
                        this.field3241 = -this.field3241;
                        var9 = this.method1424(arg0, var11, var5, var10, var4.field6483[this.field3240]);
                        if (this.field3243 >= var5) {
                            return;
                        }
                        this.field3243 = var5 + var5 - 1 - this.field3243;
                        this.field3241 = -this.field3241;
                    }
                } else if (this.field3241 < 0) {
                    while (true) {
                        var9 = this.method1424(arg0, var9, var5, var10, var4.field6483[this.field3245 - 1]);
                        if (this.field3243 >= var5) {
                            return;
                        }
                        this.field3243 = var6 - 1 - (var6 - 1 - this.field3243) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1438(arg0, var9, var6, var10, var4.field6483[this.field3240]);
                        if (this.field3243 < var6) {
                            return;
                        }
                        this.field3243 = (this.field3243 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3237 > 0) {
                    if (this.field3234) {
                        label130: {
                            if (this.field3241 < 0) {
                                var9 = this.method1424(arg0, arg1, var5, var10, var4.field6483[this.field3240]);
                                if (this.field3243 >= var5) {
                                    return;
                                }
                                this.field3243 = var5 + var5 - 1 - this.field3243;
                                this.field3241 = -this.field3241;
                                if (--this.field3237 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1438(arg0, var9, var6, var10, var4.field6483[this.field3245 - 1]);
                                if (this.field3243 < var6) {
                                    return;
                                }
                                this.field3243 = var6 + var6 - 1 - this.field3243;
                                this.field3241 = -this.field3241;
                                if (--this.field3237 == 0) {
                                    break;
                                }
                                var9 = this.method1424(arg0, var9, var5, var10, var4.field6483[this.field3240]);
                                if (this.field3243 >= var5) {
                                    return;
                                }
                                this.field3243 = var5 + var5 - 1 - this.field3243;
                                this.field3241 = -this.field3241;
                            } while (--this.field3237 != 0);
                        }
                    } else if (this.field3241 < 0) {
                        while (true) {
                            var9 = this.method1424(arg0, var9, var5, var10, var4.field6483[this.field3245 - 1]);
                            if (this.field3243 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3243) / var8;
                            if (var12 >= this.field3237) {
                                this.field3243 += this.field3237 * var8;
                                this.field3237 = 0;
                                break;
                            }
                            this.field3243 += var8 * var12;
                            this.field3237 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1438(arg0, var9, var6, var10, var4.field6483[this.field3240]);
                            if (this.field3243 < var6) {
                                return;
                            }
                            int var13 = (this.field3243 - var5) / var8;
                            if (var13 >= this.field3237) {
                                this.field3243 -= this.field3237 * var8;
                                this.field3237 = 0;
                                break;
                            }
                            this.field3243 -= var8 * var13;
                            this.field3237 -= var13;
                        }
                    }
                }
                if (this.field3241 < 0) {
                    this.method1424(arg0, var9, 0, var10, 0);
                    if (this.field3243 < 0) {
                        this.field3243 = -1;
                        this.method1403();
                        this.method1120(-127);
                        return;
                    }
                } else {
                    this.method1438(arg0, var9, var7, var10, 0);
                    if (this.field3243 >= var7) {
                        this.field3243 = var7;
                        this.method1403();
                        this.method1120(-99);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I[B[IIIIIIIIIILrr;)I", line = 883)
    private static final int method1430(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class202 arg12) {
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
        arg12.field3247 += (var19 - arg4) * arg12.field3244;
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
        arg12.field3238 = var15 >> 2;
        arg12.field3239 = var16 >> 2;
        arg12.field3243 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V", line = 938)
    public final synchronized void method1431(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1437(arg1, arg2);
        } else {
            int var4 = method1436(arg1, arg2);
            int var5 = method1427(arg1, arg2);
            if (this.field3238 == var4 && this.field3239 == var5) {
                this.field3235 = 0;
            } else {
                int var6 = arg1 - this.field3247;
                if (this.field3247 - arg1 > var6) {
                    var6 = this.field3247 - arg1;
                }
                if (var4 - this.field3238 > var6) {
                    var6 = var4 - this.field3238;
                }
                if (this.field3238 - var4 > var6) {
                    var6 = this.field3238 - var4;
                }
                if (var5 - this.field3239 > var6) {
                    var6 = var5 - this.field3239;
                }
                if (this.field3239 - var5 > var6) {
                    var6 = this.field3239 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3235 = arg0;
                this.field3236 = arg1;
                this.field3248 = arg2;
                this.field3244 = (arg1 - this.field3247) / arg0;
                this.field3246 = (var4 - this.field3238) / arg0;
                this.field3242 = (var5 - this.field3239) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II[B[IIIIIIIIIILrr;II)I", line = 990)
    private static final int method1432(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class202 arg13, int arg14, int arg15) {
        arg13.field3247 -= arg13.field3244 * arg5;
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
        arg13.field3247 += arg13.field3244 * var22;
        arg13.field3238 = arg6;
        arg13.field3239 = arg7;
        arg13.field3243 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "([B[IIIIIIIILrr;)I", line = 1032)
    private static final int method1433(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class202 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3238 += (var14 - arg3) * arg9.field3246;
        arg9.field3239 += (var14 - arg3) * arg9.field3242;
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
        arg9.field3247 = var12 >> 2;
        arg9.field3243 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "()Lkp;", line = 1067)
    public final class283 method1064() {
        return null;
    }

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "()I", line = 1070)
    public final synchronized int method1434() {
        return this.field3248 < 0 ? -1 : this.field3248;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I[B[IIIIIIIILrr;)I", line = 1073)
    private static final int method1435(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class202 arg10) {
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
        arg10.field3243 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(II)I", line = 1111)
    private static final int method1436(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(II)V", line = 1114)
    private final synchronized void method1437(int arg0, int arg1) {
        this.field3236 = arg0;
        this.field3248 = arg1;
        this.field3235 = 0;
        this.method1439();
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "([IIIII)I", line = 1120)
    private final int method1438(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3235 <= 0) {
                if (this.field3241 == 256 && (this.field3243 & 255) == 0) {
                    if (class29.field339) {
                        return method1435(0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, 0, arg3, arg2, this);
                    }
                    return method1429(((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, 0, arg3, arg2, this);
                }
                if (class29.field339) {
                    return method1441(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, 0, arg3, arg2, this, this.field3241, arg4);
                }
                return method1405(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, 0, arg3, arg2, this, this.field3241, arg4);
            }
            int var6 = this.field3235 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3235 += arg1;
            if (this.field3241 == 256 && (this.field3243 & 255) == 0) {
                if (class29.field339) {
                    arg1 = method1412(0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, this.field3246, this.field3242, 0, var6, arg2, this);
                } else {
                    arg1 = method1415(((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, this.field3244, 0, var6, arg2, this);
                }
            } else if (class29.field339) {
                arg1 = method1406(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3238, this.field3239, this.field3246, this.field3242, 0, var6, arg2, this, this.field3241, arg4);
            } else {
                arg1 = method1407(0, 0, ((class445) super.field4542).field6483, arg0, this.field3243, arg1, this.field3247, this.field3244, 0, var6, arg2, this, this.field3241, arg4);
            }
            this.field3235 -= arg1;
            if (this.field3235 != 0) {
                return arg1;
            }
        } while (!this.method1419());
        return arg3;
    }

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "()V", line = 1175)
    private final void method1439() {
        this.field3247 = this.field3236;
        this.field3238 = method1436(this.field3236, this.field3248);
        this.field3239 = method1427(this.field3236, this.field3248);
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V", line = 1181)
    public final synchronized void method1065(int arg0) {
        if (this.field3235 > 0) {
            if (arg0 >= this.field3235) {
                if (this.field3236 == Integer.MIN_VALUE) {
                    this.field3236 = 0;
                    this.field3247 = this.field3238 = this.field3239 = 0;
                    this.method1120(84);
                    arg0 = this.field3235;
                }
                this.field3235 = 0;
                this.method1439();
            } else {
                this.field3247 += this.field3244 * arg0;
                this.field3238 += this.field3246 * arg0;
                this.field3239 += this.field3242 * arg0;
                this.field3235 -= arg0;
            }
        }
        class445 var2 = (class445) super.field4542;
        int var3 = this.field3240 << 8;
        int var4 = this.field3245 << 8;
        int var5 = var2.field6483.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3237 = 0;
        }
        if (this.field3243 < 0) {
            if (this.field3241 <= 0) {
                this.method1403();
                this.method1120(59);
                return;
            }
            this.field3243 = 0;
        }
        if (this.field3243 >= var5) {
            if (this.field3241 >= 0) {
                this.method1403();
                this.method1120(-97);
                return;
            }
            this.field3243 = var5 - 1;
        }
        this.field3243 += this.field3241 * arg0;
        if (this.field3237 < 0) {
            if (!this.field3234) {
                if (this.field3241 < 0) {
                    if (this.field3243 < var3) {
                        this.field3243 = var4 - 1 - (var4 - 1 - this.field3243) % var6;
                    }
                } else if (this.field3243 >= var4) {
                    this.field3243 = (this.field3243 - var3) % var6 + var3;
                }
            } else {
                if (this.field3241 < 0) {
                    if (this.field3243 >= var3) {
                        return;
                    }
                    this.field3243 = var3 + var3 - 1 - this.field3243;
                    this.field3241 = -this.field3241;
                }
                while (this.field3243 >= var4) {
                    this.field3243 = var4 + var4 - 1 - this.field3243;
                    this.field3241 = -this.field3241;
                    if (this.field3243 >= var3) {
                        return;
                    }
                    this.field3243 = var3 + var3 - 1 - this.field3243;
                    this.field3241 = -this.field3241;
                }
            }
        } else {
            if (this.field3237 > 0) {
                if (this.field3234) {
                    label125: {
                        if (this.field3241 < 0) {
                            if (this.field3243 >= var3) {
                                return;
                            }
                            this.field3243 = var3 + var3 - 1 - this.field3243;
                            this.field3241 = -this.field3241;
                            if (--this.field3237 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3243 < var4) {
                                return;
                            }
                            this.field3243 = var4 + var4 - 1 - this.field3243;
                            this.field3241 = -this.field3241;
                            if (--this.field3237 == 0) {
                                break;
                            }
                            if (this.field3243 >= var3) {
                                return;
                            }
                            this.field3243 = var3 + var3 - 1 - this.field3243;
                            this.field3241 = -this.field3241;
                        } while (--this.field3237 != 0);
                    }
                } else if (this.field3241 < 0) {
                    if (this.field3243 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3243) / var6;
                    if (var7 < this.field3237) {
                        this.field3243 += var6 * var7;
                        this.field3237 -= var7;
                        return;
                    }
                    this.field3243 += this.field3237 * var6;
                    this.field3237 = 0;
                } else {
                    if (this.field3243 < var4) {
                        return;
                    }
                    int var8 = (this.field3243 - var3) / var6;
                    if (var8 < this.field3237) {
                        this.field3243 -= var6 * var8;
                        this.field3237 -= var8;
                        return;
                    }
                    this.field3243 -= this.field3237 * var6;
                    this.field3237 = 0;
                }
            }
            if (this.field3241 < 0) {
                if (this.field3243 < 0) {
                    this.field3243 = -1;
                    this.method1403();
                    this.method1120(-127);
                    return;
                }
            } else if (this.field3243 >= var5) {
                this.field3243 = var5;
                this.method1403();
                this.method1120(84);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "([B[IIIIIIILrr;)I", line = 1399)
    private static final int method1440(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class202 arg8) {
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
        arg8.field3243 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(II[B[IIIIIIIILrr;II)I", line = 1424)
    private static final int method1441(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class202 arg11, int arg12, int arg13) {
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
        arg11.field3243 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lkr;II)V", line = 1458)
    private class202(class445 arg0, int arg1, int arg2) {
        super.field4542 = arg0;
        this.field3240 = arg0.field6486;
        this.field3245 = arg0.field6482;
        this.field3234 = arg0.field6484;
        this.field3241 = arg1;
        this.field3236 = arg2;
        this.field3248 = 8192;
        this.field3243 = 0;
        this.method1439();
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lkr;III)V", line = 1469)
    private class202(class445 arg0, int arg1, int arg2, int arg3) {
        super.field4542 = arg0;
        this.field3240 = arg0.field6486;
        this.field3245 = arg0.field6482;
        this.field3234 = arg0.field6484;
        this.field3241 = arg1;
        this.field3236 = arg2;
        this.field3248 = arg3;
        this.field3243 = 0;
        this.method1439();
    }
}
