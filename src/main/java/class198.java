import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class198 extends class100 {

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Z")
    private boolean field3620;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    private int field3606;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    private int field3611;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    private int field3612;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    private int field3613;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method1217(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class198 arg11, int arg12, int arg13) {
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
        arg11.field3608 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B[IIIIIIIILt;)I")
    private static final int method1218(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class198 arg10) {
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
        arg10.field3608 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIIIIILt;II)I")
    private static final int method1219(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class198 arg13, int arg14, int arg15) {
        arg13.field3617 -= arg13.field3619 * arg5;
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
        arg13.field3617 += arg13.field3619 * var22;
        arg13.field3613 = arg6;
        arg13.field3606 = arg7;
        arg13.field3608 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lqc;II)Lt;")
    public static final class198 method1220(class171 arg0, int arg1, int arg2) {
        return arg0.field3220 != null && arg0.field3220.length != 0 ? new class198(arg0, (int) ((long) arg0.field3222 * 256L * (long) arg1 / (long) (class106.field1956 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method1221(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class198 arg11, int arg12, int arg13) {
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
        arg11.field3608 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
    private static final int method1222(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public final synchronized void method1223(int arg0) {
        int var2 = ((class171) super.field1871).field3220.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3608 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B[IIIIIIIILt;)I")
    private static final int method1224(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class198 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3613 += (var14 - arg3) * arg9.field3611;
        arg9.field3606 += (var14 - arg3) * arg9.field3618;
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
        arg9.field3617 = var12 >> 2;
        arg9.field3608 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "()I")
    public final synchronized int method1225() {
        return this.field3616 < 0 ? -this.field3616 : this.field3616;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
    public final synchronized void method1226(int arg0) {
        this.method1236(arg0 << 6, this.method1251());
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[B[IIIIIIILt;II)I")
    private static final int method1227(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class198 arg10, int arg11, int arg12) {
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
        arg10.field3608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "()I")
    public final synchronized int method1228() {
        return this.field3615 == Integer.MIN_VALUE ? 0 : this.field3615;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)I")
    private static final int method1229(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)V")
    public final synchronized void method1230(int arg0) {
        this.field3612 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([IIIII)I")
    private final int method1231(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3609 <= 0) {
                if (this.field3616 == -256 && (this.field3608 & 255) == 0) {
                    if (class168.field3201) {
                        return method1218(0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, 0, arg3, arg2, this);
                    }
                    return method1232(((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, 0, arg3, arg2, this);
                }
                if (class168.field3201) {
                    return method1221(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, 0, arg3, arg2, this, this.field3616, arg4);
                }
                return method1242(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, 0, arg3, arg2, this, this.field3616, arg4);
            }
            int var6 = this.field3609 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3609 += arg1;
            if (this.field3616 == -256 && (this.field3608 & 255) == 0) {
                if (class168.field3201) {
                    arg1 = method1253(0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, this.field3611, this.field3618, 0, var6, arg2, this);
                } else {
                    arg1 = method1224(((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, this.field3619, 0, var6, arg2, this);
                }
            } else if (class168.field3201) {
                arg1 = method1246(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, this.field3611, this.field3618, 0, var6, arg2, this, this.field3616, arg4);
            } else {
                arg1 = method1234(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, this.field3619, 0, var6, arg2, this, this.field3616, arg4);
            }
            this.field3609 -= arg1;
            if (this.field3609 != 0) {
                return arg1;
            }
        } while (!this.method1255());
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([B[IIIIIIILt;)I")
    private static final int method1232(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class198 arg8) {
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
        arg8.field3608 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([B[IIIIIIILt;)I")
    private static final int method1233(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class198 arg8) {
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
        arg8.field3608 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method1234(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class198 arg11, int arg12, int arg13) {
        arg11.field3613 -= arg11.field3611 * arg5;
        arg11.field3606 -= arg11.field3618 * arg5;
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
        arg11.field3613 += arg11.field3611 * arg5;
        arg11.field3606 += arg11.field3618 * arg5;
        arg11.field3617 = arg6;
        arg11.field3608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lqc;III)Lt;")
    public static final class198 method1235(class171 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3220 != null && arg0.field3220.length != 0 ? new class198(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
    private final synchronized void method1236(int arg0, int arg1) {
        this.field3615 = arg0;
        this.field3610 = arg1;
        this.field3609 = 0;
        this.method1256();
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "()Z")
    public final boolean method1237() {
        return this.field3609 != 0;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([IIIII)I")
    private final int method1238(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3609 <= 0) {
                if (this.field3616 == 256 && (this.field3608 & 255) == 0) {
                    if (class168.field3201) {
                        return method1249(0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, 0, arg3, arg2, this);
                    }
                    return method1233(((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, 0, arg3, arg2, this);
                }
                if (class168.field3201) {
                    return method1217(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, 0, arg3, arg2, this, this.field3616, arg4);
                }
                return method1227(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, 0, arg3, arg2, this, this.field3616, arg4);
            }
            int var6 = this.field3609 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3609 += arg1;
            if (this.field3616 == 256 && (this.field3608 & 255) == 0) {
                if (class168.field3201) {
                    arg1 = method1247(0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, this.field3611, this.field3618, 0, var6, arg2, this);
                } else {
                    arg1 = method1254(((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, this.field3619, 0, var6, arg2, this);
                }
            } else if (class168.field3201) {
                arg1 = method1219(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3613, this.field3606, this.field3611, this.field3618, 0, var6, arg2, this, this.field3616, arg4);
            } else {
                arg1 = method1244(0, 0, ((class171) super.field1871).field3220, arg0, this.field3608, arg1, this.field3617, this.field3619, 0, var6, arg2, this, this.field3616, arg4);
            }
            this.field3609 -= arg1;
            if (this.field3609 != 0) {
                return arg1;
            }
        } while (!this.method1255());
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "()V")
    private final void method1239() {
        if (this.field3609 != 0) {
            if (this.field3615 == Integer.MIN_VALUE) {
                this.field3615 = 0;
            }
            this.field3609 = 0;
            this.method1256();
        }
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
    public final synchronized void method1240(int arg0) {
        if (arg0 == 0) {
            this.method1245(0);
            this.method826(-22101);
        } else if (this.field3613 == 0 && this.field3606 == 0) {
            this.field3609 = 0;
            this.field3615 = 0;
            this.field3617 = 0;
            this.method826(-22101);
        } else {
            int var2 = -this.field3617;
            if (this.field3617 > var2) {
                var2 = this.field3617;
            }
            if (-this.field3613 > var2) {
                var2 = -this.field3613;
            }
            if (this.field3613 > var2) {
                var2 = this.field3613;
            }
            if (-this.field3606 > var2) {
                var2 = -this.field3606;
            }
            if (this.field3606 > var2) {
                var2 = this.field3606;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3609 = arg0;
            this.field3615 = Integer.MIN_VALUE;
            this.field3619 = -this.field3617 / arg0;
            this.field3611 = -this.field3613 / arg0;
            this.field3618 = -this.field3606 / arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II)V")
    public final synchronized void method1241(int arg0, int arg1) {
        this.method1243(arg0, arg1, this.method1251());
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIILt;II)I")
    private static final int method1242(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class198 arg10, int arg11, int arg12) {
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
        arg10.field3608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public final synchronized void method1243(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1236(arg1, arg2);
        } else {
            int var4 = method1229(arg1, arg2);
            int var5 = method1222(arg1, arg2);
            if (this.field3613 == var4 && this.field3606 == var5) {
                this.field3609 = 0;
            } else {
                int var6 = arg1 - this.field3617;
                if (this.field3617 - arg1 > var6) {
                    var6 = this.field3617 - arg1;
                }
                if (var4 - this.field3613 > var6) {
                    var6 = var4 - this.field3613;
                }
                if (this.field3613 - var4 > var6) {
                    var6 = this.field3613 - var4;
                }
                if (var5 - this.field3606 > var6) {
                    var6 = var5 - this.field3606;
                }
                if (this.field3606 - var5 > var6) {
                    var6 = this.field3606 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3609 = arg0;
                this.field3615 = arg1;
                this.field3610 = arg2;
                this.field3619 = (arg1 - this.field3617) / arg0;
                this.field3611 = (var4 - this.field3613) / arg0;
                this.field3618 = (var5 - this.field3606) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II[B[IIIIIIIILt;II)I")
    private static final int method1244(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class198 arg11, int arg12, int arg13) {
        arg11.field3613 -= arg11.field3611 * arg5;
        arg11.field3606 -= arg11.field3618 * arg5;
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
        arg11.field3613 += arg11.field3611 * arg5;
        arg11.field3606 += arg11.field3618 * arg5;
        arg11.field3617 = arg6;
        arg11.field3608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(I)V")
    private final synchronized void method1245(int arg0) {
        this.method1236(arg0, this.method1251());
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Ljc;")
    public final class100 method568() {
        return null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II[B[IIIIIIIIIILt;II)I")
    private static final int method1246(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class198 arg13, int arg14, int arg15) {
        arg13.field3617 -= arg13.field3619 * arg5;
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
        arg13.field3617 += arg13.field3619 * var22;
        arg13.field3613 = arg6;
        arg13.field3606 = arg7;
        arg13.field3608 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[B[IIIIIIIIIILt;)I")
    private static final int method1247(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class198 arg12) {
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
        arg12.field3617 += (var19 - arg4) * arg12.field3619;
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
        arg12.field3613 = var15 >> 2;
        arg12.field3606 = var16 >> 2;
        arg12.field3608 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()Ljc;")
    public final class100 method572() {
        return null;
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "(I)V")
    public final synchronized void method1248(int arg0) {
        if (this.field3616 < 0) {
            this.field3616 = -arg0;
        } else {
            this.field3616 = arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()I")
    public final int method622() {
        int var1 = this.field3617 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3612 == 0) {
            var2 -= this.field3608 * var2 / (((class171) super.field1871).field3220.length << 8);
        } else if (this.field3612 >= 0) {
            var2 -= this.field3614 * var2 / ((class171) super.field1871).field3220.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I[B[IIIIIIIILt;)I")
    private static final int method1249(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class198 arg10) {
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
        arg10.field3608 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final int method564() {
        return this.field3615 == 0 && this.field3609 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final synchronized void method1250(boolean arg0) {
        this.field3616 = (this.field3616 >>> 31) + (this.field3616 ^ this.field3616 >> 31);
        if (arg0) {
            this.field3616 = -this.field3616;
        }
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "()I")
    public final synchronized int method1251() {
        return this.field3610 < 0 ? -1 : this.field3610;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public final synchronized void method570(int arg0) {
        if (this.field3609 > 0) {
            if (arg0 >= this.field3609) {
                if (this.field3615 == Integer.MIN_VALUE) {
                    this.field3615 = 0;
                    this.field3617 = this.field3613 = this.field3606 = 0;
                    this.method826(-22101);
                    arg0 = this.field3609;
                }
                this.field3609 = 0;
                this.method1256();
            } else {
                this.field3617 += this.field3619 * arg0;
                this.field3613 += this.field3611 * arg0;
                this.field3606 += this.field3618 * arg0;
                this.field3609 -= arg0;
            }
        }
        class171 var2 = (class171) super.field1871;
        int var3 = this.field3614 << 8;
        int var4 = this.field3607 << 8;
        int var5 = var2.field3220.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3612 = 0;
        }
        if (this.field3608 < 0) {
            if (this.field3616 <= 0) {
                this.method1239();
                this.method826(-22101);
                return;
            }
            this.field3608 = 0;
        }
        if (this.field3608 >= var5) {
            if (this.field3616 >= 0) {
                this.method1239();
                this.method826(-22101);
                return;
            }
            this.field3608 = var5 - 1;
        }
        this.field3608 += this.field3616 * arg0;
        if (this.field3612 < 0) {
            if (!this.field3620) {
                if (this.field3616 < 0) {
                    if (this.field3608 < var3) {
                        this.field3608 = var4 - 1 - (var4 - 1 - this.field3608) % var6;
                    }
                } else if (this.field3608 >= var4) {
                    this.field3608 = (this.field3608 - var3) % var6 + var3;
                }
            } else {
                if (this.field3616 < 0) {
                    if (this.field3608 >= var3) {
                        return;
                    }
                    this.field3608 = var3 + var3 - 1 - this.field3608;
                    this.field3616 = -this.field3616;
                }
                while (this.field3608 >= var4) {
                    this.field3608 = var4 + var4 - 1 - this.field3608;
                    this.field3616 = -this.field3616;
                    if (this.field3608 >= var3) {
                        return;
                    }
                    this.field3608 = var3 + var3 - 1 - this.field3608;
                    this.field3616 = -this.field3616;
                }
            }
        } else {
            if (this.field3612 > 0) {
                if (this.field3620) {
                    label125: {
                        if (this.field3616 < 0) {
                            if (this.field3608 >= var3) {
                                return;
                            }
                            this.field3608 = var3 + var3 - 1 - this.field3608;
                            this.field3616 = -this.field3616;
                            if (--this.field3612 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3608 < var4) {
                                return;
                            }
                            this.field3608 = var4 + var4 - 1 - this.field3608;
                            this.field3616 = -this.field3616;
                            if (--this.field3612 == 0) {
                                break;
                            }
                            if (this.field3608 >= var3) {
                                return;
                            }
                            this.field3608 = var3 + var3 - 1 - this.field3608;
                            this.field3616 = -this.field3616;
                        } while (--this.field3612 != 0);
                    }
                } else if (this.field3616 < 0) {
                    if (this.field3608 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3608) / var6;
                    if (var7 < this.field3612) {
                        this.field3608 += var6 * var7;
                        this.field3612 -= var7;
                        return;
                    }
                    this.field3608 += this.field3612 * var6;
                    this.field3612 = 0;
                } else {
                    if (this.field3608 < var4) {
                        return;
                    }
                    int var8 = (this.field3608 - var3) / var6;
                    if (var8 < this.field3612) {
                        this.field3608 -= var6 * var8;
                        this.field3612 -= var8;
                        return;
                    }
                    this.field3608 -= this.field3612 * var6;
                    this.field3612 = 0;
                }
            }
            if (this.field3616 < 0) {
                if (this.field3608 < 0) {
                    this.field3608 = -1;
                    this.method1239();
                    this.method826(-22101);
                    return;
                }
            } else if (this.field3608 >= var5) {
                this.field3608 = var5;
                this.method1239();
                this.method826(-22101);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "()Z")
    public final boolean method1252() {
        return this.field3608 < 0 || this.field3608 >= ((class171) super.field1871).field3220.length << 8;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I[B[IIIIIIIIIILt;)I")
    private static final int method1253(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class198 arg12) {
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
        arg12.field3617 += (var19 - arg4) * arg12.field3619;
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
        arg12.field3613 = var15 >> 2;
        arg12.field3606 = var16 >> 2;
        arg12.field3608 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([B[IIIIIIIILt;)I")
    private static final int method1254(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class198 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3613 += (var14 - arg3) * arg9.field3611;
        arg9.field3606 += (var14 - arg3) * arg9.field3618;
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
        arg9.field3617 = var12 >> 2;
        arg9.field3608 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!t", name = "k", descriptor = "()Z")
    private final boolean method1255() {
        int var1 = this.field3615;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1229(var1, this.field3610);
            var2 = method1222(var1, this.field3610);
        }
        if (this.field3617 == var1 && this.field3613 == var3 && this.field3606 == var2) {
            if (this.field3615 == Integer.MIN_VALUE) {
                this.field3615 = 0;
                this.field3617 = this.field3613 = this.field3606 = 0;
                this.method826(-22101);
                return true;
            } else {
                this.method1256();
                return false;
            }
        } else {
            if (this.field3617 < var1) {
                this.field3619 = 1;
                this.field3609 = var1 - this.field3617;
            } else if (this.field3617 > var1) {
                this.field3619 = -1;
                this.field3609 = this.field3617 - var1;
            } else {
                this.field3619 = 0;
            }
            if (this.field3613 < var3) {
                this.field3611 = 1;
                if (this.field3609 == 0 || this.field3609 > var3 - this.field3613) {
                    this.field3609 = var3 - this.field3613;
                }
            } else if (this.field3613 > var3) {
                this.field3611 = -1;
                if (this.field3609 == 0 || this.field3609 > this.field3613 - var3) {
                    this.field3609 = this.field3613 - var3;
                }
            } else {
                this.field3611 = 0;
            }
            if (this.field3606 < var2) {
                this.field3618 = 1;
                if (this.field3609 == 0 || this.field3609 > var2 - this.field3606) {
                    this.field3609 = var2 - this.field3606;
                }
            } else if (this.field3606 > var2) {
                this.field3618 = -1;
                if (this.field3609 == 0 || this.field3609 > this.field3606 - var2) {
                    this.field3609 = this.field3606 - var2;
                }
            } else {
                this.field3618 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!t", name = "l", descriptor = "()V")
    private final void method1256() {
        this.field3617 = this.field3615;
        this.field3613 = method1229(this.field3615, this.field3610);
        this.field3606 = method1222(this.field3615, this.field3610);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([III)V")
    public final synchronized void method567(int[] arg0, int arg1, int arg2) {
        if (this.field3615 == 0 && this.field3609 == 0) {
            this.method570(arg2);
        } else {
            class171 var4 = (class171) super.field1871;
            int var5 = this.field3614 << 8;
            int var6 = this.field3607 << 8;
            int var7 = var4.field3220.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3612 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3608 < 0) {
                if (this.field3616 <= 0) {
                    this.method1239();
                    this.method826(-22101);
                    return;
                }
                this.field3608 = 0;
            }
            if (this.field3608 >= var7) {
                if (this.field3616 >= 0) {
                    this.method1239();
                    this.method826(-22101);
                    return;
                }
                this.field3608 = var7 - 1;
            }
            if (this.field3612 < 0) {
                if (this.field3620) {
                    if (this.field3616 < 0) {
                        var9 = this.method1231(arg0, arg1, var5, var10, var4.field3220[this.field3614]);
                        if (this.field3608 >= var5) {
                            return;
                        }
                        this.field3608 = var5 + var5 - 1 - this.field3608;
                        this.field3616 = -this.field3616;
                    }
                    while (true) {
                        int var11 = this.method1238(arg0, var9, var6, var10, var4.field3220[this.field3607 - 1]);
                        if (this.field3608 < var6) {
                            return;
                        }
                        this.field3608 = var6 + var6 - 1 - this.field3608;
                        this.field3616 = -this.field3616;
                        var9 = this.method1231(arg0, var11, var5, var10, var4.field3220[this.field3614]);
                        if (this.field3608 >= var5) {
                            return;
                        }
                        this.field3608 = var5 + var5 - 1 - this.field3608;
                        this.field3616 = -this.field3616;
                    }
                } else if (this.field3616 < 0) {
                    while (true) {
                        var9 = this.method1231(arg0, var9, var5, var10, var4.field3220[this.field3607 - 1]);
                        if (this.field3608 >= var5) {
                            return;
                        }
                        this.field3608 = var6 - 1 - (var6 - 1 - this.field3608) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1238(arg0, var9, var6, var10, var4.field3220[this.field3614]);
                        if (this.field3608 < var6) {
                            return;
                        }
                        this.field3608 = (this.field3608 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3612 > 0) {
                    if (this.field3620) {
                        label130: {
                            if (this.field3616 < 0) {
                                var9 = this.method1231(arg0, arg1, var5, var10, var4.field3220[this.field3614]);
                                if (this.field3608 >= var5) {
                                    return;
                                }
                                this.field3608 = var5 + var5 - 1 - this.field3608;
                                this.field3616 = -this.field3616;
                                if (--this.field3612 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1238(arg0, var9, var6, var10, var4.field3220[this.field3607 - 1]);
                                if (this.field3608 < var6) {
                                    return;
                                }
                                this.field3608 = var6 + var6 - 1 - this.field3608;
                                this.field3616 = -this.field3616;
                                if (--this.field3612 == 0) {
                                    break;
                                }
                                var9 = this.method1231(arg0, var9, var5, var10, var4.field3220[this.field3614]);
                                if (this.field3608 >= var5) {
                                    return;
                                }
                                this.field3608 = var5 + var5 - 1 - this.field3608;
                                this.field3616 = -this.field3616;
                            } while (--this.field3612 != 0);
                        }
                    } else if (this.field3616 < 0) {
                        while (true) {
                            var9 = this.method1231(arg0, var9, var5, var10, var4.field3220[this.field3607 - 1]);
                            if (this.field3608 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3608) / var8;
                            if (var12 >= this.field3612) {
                                this.field3608 += this.field3612 * var8;
                                this.field3612 = 0;
                                break;
                            }
                            this.field3608 += var8 * var12;
                            this.field3612 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1238(arg0, var9, var6, var10, var4.field3220[this.field3614]);
                            if (this.field3608 < var6) {
                                return;
                            }
                            int var13 = (this.field3608 - var5) / var8;
                            if (var13 >= this.field3612) {
                                this.field3608 -= this.field3612 * var8;
                                this.field3612 = 0;
                                break;
                            }
                            this.field3608 -= var8 * var13;
                            this.field3612 -= var13;
                        }
                    }
                }
                if (this.field3616 < 0) {
                    this.method1231(arg0, var9, 0, var10, 0);
                    if (this.field3608 < 0) {
                        this.field3608 = -1;
                        this.method1239();
                        this.method826(-22101);
                        return;
                    }
                } else {
                    this.method1238(arg0, var9, var7, var10, 0);
                    if (this.field3608 >= var7) {
                        this.field3608 = var7;
                        this.method1239();
                        this.method826(-22101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lqc;II)V")
    private class198(class171 arg0, int arg1, int arg2) {
        super.field1871 = arg0;
        this.field3614 = arg0.field3223;
        this.field3607 = arg0.field3221;
        this.field3620 = arg0.field3224;
        this.field3616 = arg1;
        this.field3615 = arg2;
        this.field3610 = 8192;
        this.field3608 = 0;
        this.method1256();
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lqc;III)V")
    private class198(class171 arg0, int arg1, int arg2, int arg3) {
        super.field1871 = arg0;
        this.field3614 = arg0.field3223;
        this.field3607 = arg0.field3221;
        this.field3620 = arg0.field3224;
        this.field3616 = arg1;
        this.field3615 = arg2;
        this.field3610 = arg3;
        this.field3608 = 0;
        this.method1256();
    }
}
