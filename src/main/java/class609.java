import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class609 extends class463 {

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    private int field8292;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    private int field8296;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Z")
    private boolean field8295;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field8298;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    private int field8291;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field8297;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    private int field8300;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    private int field8290;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    private int field8293;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    private int field8294;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field8299;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private int field8301;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    private int field8302;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    private int field8303;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    private int field8304;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[B[IIIIIIIIIILfh;II)I")
    private static final int method3383(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class609 arg13, int arg14, int arg15) {
        arg13.field8304 -= arg13.field8299 * arg5;
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
        arg13.field8304 += arg13.field8299 * var22;
        arg13.field8290 = arg6;
        arg13.field8293 = arg7;
        arg13.field8300 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([B[IIIIIIILfh;)I")
    private static final int method3384(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class609 arg8) {
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
        arg8.field8300 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II[B[IIIIIIIIIILfh;II)I")
    private static final int method3385(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class609 arg13, int arg14, int arg15) {
        arg13.field8304 -= arg13.field8299 * arg5;
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
        arg13.field8304 += arg13.field8299 * var22;
        arg13.field8290 = arg6;
        arg13.field8293 = arg7;
        arg13.field8300 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lft;III)Lfh;")
    public static final class609 method3386(class4 arg0, int arg1, int arg2, int arg3) {
        return arg0.field30 != null && arg0.field30.length != 0 ? new class609(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[B[IIIIIIIILfh;II)I")
    private static final int method3387(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class609 arg11, int arg12, int arg13) {
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
        arg11.field8300 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "()I")
    public final synchronized int method3388() {
        return this.field8297 < 0 ? -1 : this.field8297;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II[B[IIIIIIIILfh;II)I")
    private static final int method3389(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class609 arg11, int arg12, int arg13) {
        arg11.field8290 -= arg11.field8303 * arg5;
        arg11.field8293 -= arg11.field8294 * arg5;
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
        arg11.field8290 += arg11.field8303 * arg5;
        arg11.field8293 += arg11.field8294 * arg5;
        arg11.field8304 = arg6;
        arg11.field8300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()Lmi;")
    public final class463 method1487() {
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "()V")
    private final void method3390() {
        if (this.field8301 != 0) {
            if (this.field8291 == Integer.MIN_VALUE) {
                this.field8291 = 0;
            }
            this.field8301 = 0;
            this.method3417();
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[B[IIIIIIIILfh;)I")
    private static final int method3391(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class609 arg10) {
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
        arg10.field8300 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[B[IIIIIIILfh;II)I")
    private static final int method3392(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class609 arg10, int arg11, int arg12) {
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
        arg10.field8300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
    private static final int method3393(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public final synchronized void method3394(int arg0) {
        this.field8302 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public final synchronized void method3395(int arg0) {
        int var2 = ((class4) super.field5758).field30.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field8300 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()Lmi;")
    public final class463 method1496() {
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lft;II)Lfh;")
    public static final class609 method3396(class4 arg0, int arg1, int arg2) {
        return arg0.field30 != null && arg0.field30.length != 0 ? new class609(arg0, (int) ((long) arg0.field32 * 256L * (long) arg1 / (long) (class278.field3535 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "()Z")
    public final boolean method3397() {
        return this.field8301 != 0;
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "()I")
    public final synchronized int method3398() {
        return this.field8291 == Integer.MIN_VALUE ? 0 : this.field8291;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([IIIII)I")
    private final int method3399(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field8301 <= 0) {
                if (this.field8298 == 256 && (this.field8300 & 255) == 0) {
                    if (class487.field6095) {
                        return method3407(0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, 0, arg3, arg2, this);
                    }
                    return method3384(((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, 0, arg3, arg2, this);
                }
                if (class487.field6095) {
                    return method3419(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, 0, arg3, arg2, this, this.field8298, arg4);
                }
                return method3392(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, 0, arg3, arg2, this, this.field8298, arg4);
            }
            int var6 = this.field8301 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field8301 += arg1;
            if (this.field8298 == 256 && (this.field8300 & 255) == 0) {
                if (class487.field6095) {
                    arg1 = method3420(0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, this.field8303, this.field8294, 0, var6, arg2, this);
                } else {
                    arg1 = method3404(((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, this.field8299, 0, var6, arg2, this);
                }
            } else if (class487.field6095) {
                arg1 = method3385(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, this.field8303, this.field8294, 0, var6, arg2, this, this.field8298, arg4);
            } else {
                arg1 = method3412(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, this.field8299, 0, var6, arg2, this, this.field8298, arg4);
            }
            this.field8301 -= arg1;
            if (this.field8301 != 0) {
                return arg1;
            }
        } while (!this.method3414());
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II[B[IIIIIIILfh;II)I")
    private static final int method3400(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class609 arg10, int arg11, int arg12) {
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
        arg10.field8300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
    public final synchronized void method3401(int arg0, int arg1) {
        this.method3403(arg0, arg1, this.method3388());
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final synchronized void method1486(int arg0) {
        if (this.field8301 > 0) {
            if (arg0 >= this.field8301) {
                if (this.field8291 == Integer.MIN_VALUE) {
                    this.field8291 = 0;
                    this.field8304 = this.field8290 = this.field8293 = 0;
                    this.method1566(-51);
                    arg0 = this.field8301;
                }
                this.field8301 = 0;
                this.method3417();
            } else {
                this.field8304 += this.field8299 * arg0;
                this.field8290 += this.field8303 * arg0;
                this.field8293 += this.field8294 * arg0;
                this.field8301 -= arg0;
            }
        }
        class4 var2 = (class4) super.field5758;
        int var3 = this.field8292 << 8;
        int var4 = this.field8296 << 8;
        int var5 = var2.field30.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field8302 = 0;
        }
        if (this.field8300 < 0) {
            if (this.field8298 <= 0) {
                this.method3390();
                this.method1566(-52);
                return;
            }
            this.field8300 = 0;
        }
        if (this.field8300 >= var5) {
            if (this.field8298 >= 0) {
                this.method3390();
                this.method1566(-124);
                return;
            }
            this.field8300 = var5 - 1;
        }
        this.field8300 += this.field8298 * arg0;
        if (this.field8302 < 0) {
            if (!this.field8295) {
                if (this.field8298 < 0) {
                    if (this.field8300 < var3) {
                        this.field8300 = var4 - 1 - (var4 - 1 - this.field8300) % var6;
                    }
                } else if (this.field8300 >= var4) {
                    this.field8300 = (this.field8300 - var3) % var6 + var3;
                }
            } else {
                if (this.field8298 < 0) {
                    if (this.field8300 >= var3) {
                        return;
                    }
                    this.field8300 = var3 + var3 - 1 - this.field8300;
                    this.field8298 = -this.field8298;
                }
                while (this.field8300 >= var4) {
                    this.field8300 = var4 + var4 - 1 - this.field8300;
                    this.field8298 = -this.field8298;
                    if (this.field8300 >= var3) {
                        return;
                    }
                    this.field8300 = var3 + var3 - 1 - this.field8300;
                    this.field8298 = -this.field8298;
                }
            }
        } else {
            if (this.field8302 > 0) {
                if (this.field8295) {
                    label125: {
                        if (this.field8298 < 0) {
                            if (this.field8300 >= var3) {
                                return;
                            }
                            this.field8300 = var3 + var3 - 1 - this.field8300;
                            this.field8298 = -this.field8298;
                            if (--this.field8302 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field8300 < var4) {
                                return;
                            }
                            this.field8300 = var4 + var4 - 1 - this.field8300;
                            this.field8298 = -this.field8298;
                            if (--this.field8302 == 0) {
                                break;
                            }
                            if (this.field8300 >= var3) {
                                return;
                            }
                            this.field8300 = var3 + var3 - 1 - this.field8300;
                            this.field8298 = -this.field8298;
                        } while (--this.field8302 != 0);
                    }
                } else if (this.field8298 < 0) {
                    if (this.field8300 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field8300) / var6;
                    if (var7 < this.field8302) {
                        this.field8300 += var6 * var7;
                        this.field8302 -= var7;
                        return;
                    }
                    this.field8300 += this.field8302 * var6;
                    this.field8302 = 0;
                } else {
                    if (this.field8300 < var4) {
                        return;
                    }
                    int var8 = (this.field8300 - var3) / var6;
                    if (var8 < this.field8302) {
                        this.field8300 -= var6 * var8;
                        this.field8302 -= var8;
                        return;
                    }
                    this.field8300 -= this.field8302 * var6;
                    this.field8302 = 0;
                }
            }
            if (this.field8298 < 0) {
                if (this.field8300 < 0) {
                    this.field8300 = -1;
                    this.method3390();
                    this.method1566(-116);
                    return;
                }
            } else if (this.field8300 >= var5) {
                this.field8300 = var5;
                this.method3390();
                this.method1566(-117);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "()Z")
    public final boolean method3402() {
        return this.field8300 < 0 || this.field8300 >= ((class4) super.field5758).field30.length << 8;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final synchronized void method3403(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3422(arg1, arg2);
        } else {
            int var4 = method3393(arg1, arg2);
            int var5 = method3411(arg1, arg2);
            if (this.field8290 == var4 && this.field8293 == var5) {
                this.field8301 = 0;
            } else {
                int var6 = arg1 - this.field8304;
                if (this.field8304 - arg1 > var6) {
                    var6 = this.field8304 - arg1;
                }
                if (var4 - this.field8290 > var6) {
                    var6 = var4 - this.field8290;
                }
                if (this.field8290 - var4 > var6) {
                    var6 = this.field8290 - var4;
                }
                if (var5 - this.field8293 > var6) {
                    var6 = var5 - this.field8293;
                }
                if (this.field8293 - var5 > var6) {
                    var6 = this.field8293 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field8301 = arg0;
                this.field8291 = arg1;
                this.field8297 = arg2;
                this.field8299 = (arg1 - this.field8304) / arg0;
                this.field8303 = (var4 - this.field8290) / arg0;
                this.field8294 = (var5 - this.field8293) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([B[IIIIIIIILfh;)I")
    private static final int method3404(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class609 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field8290 += (var14 - arg3) * arg9.field8303;
        arg9.field8293 += (var14 - arg3) * arg9.field8294;
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
        arg9.field8304 = var12 >> 2;
        arg9.field8300 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
    public final synchronized void method3405(int arg0) {
        if (this.field8298 < 0) {
            this.field8298 = -arg0;
        } else {
            this.field8298 = arg0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V")
    public final synchronized void method3406(int arg0) {
        this.method3422(arg0 << 6, this.method3388());
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I[B[IIIIIIIILfh;)I")
    private static final int method3407(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class609 arg10) {
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
        arg10.field8300 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
    public final synchronized void method3408(int arg0) {
        if (arg0 == 0) {
            this.method3410(0);
            this.method1566(-81);
        } else if (this.field8290 == 0 && this.field8293 == 0) {
            this.field8301 = 0;
            this.field8291 = 0;
            this.field8304 = 0;
            this.method1566(-63);
        } else {
            int var2 = -this.field8304;
            if (this.field8304 > var2) {
                var2 = this.field8304;
            }
            if (-this.field8290 > var2) {
                var2 = -this.field8290;
            }
            if (this.field8290 > var2) {
                var2 = this.field8290;
            }
            if (-this.field8293 > var2) {
                var2 = -this.field8293;
            }
            if (this.field8293 > var2) {
                var2 = this.field8293;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field8301 = arg0;
            this.field8291 = Integer.MIN_VALUE;
            this.field8299 = -this.field8304 / arg0;
            this.field8303 = -this.field8290 / arg0;
            this.field8294 = -this.field8293 / arg0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "([B[IIIIIIIILfh;)I")
    private static final int method3409(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class609 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field8290 += (var14 - arg3) * arg9.field8303;
        arg9.field8293 += (var14 - arg3) * arg9.field8294;
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
        arg9.field8304 = var12 >> 2;
        arg9.field8300 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
    private final synchronized void method3410(int arg0) {
        this.method3422(arg0, this.method3388());
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)I")
    private static final int method3411(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II[B[IIIIIIIILfh;II)I")
    private static final int method3412(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class609 arg11, int arg12, int arg13) {
        arg11.field8290 -= arg11.field8303 * arg5;
        arg11.field8293 -= arg11.field8294 * arg5;
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
        arg11.field8290 += arg11.field8303 * arg5;
        arg11.field8293 += arg11.field8294 * arg5;
        arg11.field8304 = arg6;
        arg11.field8300 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[B[IIIIIIIIIILfh;)I")
    private static final int method3413(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class609 arg12) {
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
        arg12.field8304 += (var19 - arg4) * arg12.field8299;
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
        arg12.field8290 = var15 >> 2;
        arg12.field8293 = var16 >> 2;
        arg12.field8300 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "()Z")
    private final boolean method3414() {
        int var1 = this.field8291;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3393(var1, this.field8297);
            var2 = method3411(var1, this.field8297);
        }
        if (this.field8304 == var1 && this.field8290 == var3 && this.field8293 == var2) {
            if (this.field8291 == Integer.MIN_VALUE) {
                this.field8291 = 0;
                this.field8304 = this.field8290 = this.field8293 = 0;
                this.method1566(-56);
                return true;
            } else {
                this.method3417();
                return false;
            }
        } else {
            if (this.field8304 < var1) {
                this.field8299 = 1;
                this.field8301 = var1 - this.field8304;
            } else if (this.field8304 > var1) {
                this.field8299 = -1;
                this.field8301 = this.field8304 - var1;
            } else {
                this.field8299 = 0;
            }
            if (this.field8290 < var3) {
                this.field8303 = 1;
                if (this.field8301 == 0 || this.field8301 > var3 - this.field8290) {
                    this.field8301 = var3 - this.field8290;
                }
            } else if (this.field8290 > var3) {
                this.field8303 = -1;
                if (this.field8301 == 0 || this.field8301 > this.field8290 - var3) {
                    this.field8301 = this.field8290 - var3;
                }
            } else {
                this.field8303 = 0;
            }
            if (this.field8293 < var2) {
                this.field8294 = 1;
                if (this.field8301 == 0 || this.field8301 > var2 - this.field8293) {
                    this.field8301 = var2 - this.field8293;
                }
            } else if (this.field8293 > var2) {
                this.field8294 = -1;
                if (this.field8301 == 0 || this.field8301 > this.field8293 - var2) {
                    this.field8301 = this.field8293 - var2;
                }
            } else {
                this.field8294 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "()I")
    public final synchronized int method3415() {
        return this.field8298 < 0 ? -this.field8298 : this.field8298;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
    public final int method2534() {
        int var1 = this.field8304 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field8302 == 0) {
            var2 -= this.field8300 * var2 / (((class4) super.field5758).field30.length << 8);
        } else if (this.field8302 >= 0) {
            var2 -= this.field8292 * var2 / ((class4) super.field5758).field30.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "([B[IIIIIIILfh;)I")
    private static final int method3416(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class609 arg8) {
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
        arg8.field8300 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "()V")
    private final void method3417() {
        this.field8304 = this.field8291;
        this.field8290 = method3393(this.field8291, this.field8297);
        this.field8293 = method3411(this.field8291, this.field8297);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final synchronized void method3418(boolean arg0) {
        this.field8298 = (this.field8298 >>> 31) + (this.field8298 ^ this.field8298 >> 31);
        if (arg0) {
            this.field8298 = -this.field8298;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([III)V")
    public final synchronized void method1493(int[] arg0, int arg1, int arg2) {
        if (this.field8291 == 0 && this.field8301 == 0) {
            this.method1486(arg2);
        } else {
            class4 var4 = (class4) super.field5758;
            int var5 = this.field8292 << 8;
            int var6 = this.field8296 << 8;
            int var7 = var4.field30.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field8302 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field8300 < 0) {
                if (this.field8298 <= 0) {
                    this.method3390();
                    this.method1566(-127);
                    return;
                }
                this.field8300 = 0;
            }
            if (this.field8300 >= var7) {
                if (this.field8298 >= 0) {
                    this.method3390();
                    this.method1566(-94);
                    return;
                }
                this.field8300 = var7 - 1;
            }
            if (this.field8302 < 0) {
                if (this.field8295) {
                    if (this.field8298 < 0) {
                        var9 = this.method3421(arg0, arg1, var5, var10, var4.field30[this.field8292]);
                        if (this.field8300 >= var5) {
                            return;
                        }
                        this.field8300 = var5 + var5 - 1 - this.field8300;
                        this.field8298 = -this.field8298;
                    }
                    while (true) {
                        int var11 = this.method3399(arg0, var9, var6, var10, var4.field30[this.field8296 - 1]);
                        if (this.field8300 < var6) {
                            return;
                        }
                        this.field8300 = var6 + var6 - 1 - this.field8300;
                        this.field8298 = -this.field8298;
                        var9 = this.method3421(arg0, var11, var5, var10, var4.field30[this.field8292]);
                        if (this.field8300 >= var5) {
                            return;
                        }
                        this.field8300 = var5 + var5 - 1 - this.field8300;
                        this.field8298 = -this.field8298;
                    }
                } else if (this.field8298 < 0) {
                    while (true) {
                        var9 = this.method3421(arg0, var9, var5, var10, var4.field30[this.field8296 - 1]);
                        if (this.field8300 >= var5) {
                            return;
                        }
                        this.field8300 = var6 - 1 - (var6 - 1 - this.field8300) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3399(arg0, var9, var6, var10, var4.field30[this.field8292]);
                        if (this.field8300 < var6) {
                            return;
                        }
                        this.field8300 = (this.field8300 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field8302 > 0) {
                    if (this.field8295) {
                        label130: {
                            if (this.field8298 < 0) {
                                var9 = this.method3421(arg0, arg1, var5, var10, var4.field30[this.field8292]);
                                if (this.field8300 >= var5) {
                                    return;
                                }
                                this.field8300 = var5 + var5 - 1 - this.field8300;
                                this.field8298 = -this.field8298;
                                if (--this.field8302 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3399(arg0, var9, var6, var10, var4.field30[this.field8296 - 1]);
                                if (this.field8300 < var6) {
                                    return;
                                }
                                this.field8300 = var6 + var6 - 1 - this.field8300;
                                this.field8298 = -this.field8298;
                                if (--this.field8302 == 0) {
                                    break;
                                }
                                var9 = this.method3421(arg0, var9, var5, var10, var4.field30[this.field8292]);
                                if (this.field8300 >= var5) {
                                    return;
                                }
                                this.field8300 = var5 + var5 - 1 - this.field8300;
                                this.field8298 = -this.field8298;
                            } while (--this.field8302 != 0);
                        }
                    } else if (this.field8298 < 0) {
                        while (true) {
                            var9 = this.method3421(arg0, var9, var5, var10, var4.field30[this.field8296 - 1]);
                            if (this.field8300 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field8300) / var8;
                            if (var12 >= this.field8302) {
                                this.field8300 += this.field8302 * var8;
                                this.field8302 = 0;
                                break;
                            }
                            this.field8300 += var8 * var12;
                            this.field8302 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3399(arg0, var9, var6, var10, var4.field30[this.field8292]);
                            if (this.field8300 < var6) {
                                return;
                            }
                            int var13 = (this.field8300 - var5) / var8;
                            if (var13 >= this.field8302) {
                                this.field8300 -= this.field8302 * var8;
                                this.field8302 = 0;
                                break;
                            }
                            this.field8300 -= var8 * var13;
                            this.field8302 -= var13;
                        }
                    }
                }
                if (this.field8298 < 0) {
                    this.method3421(arg0, var9, 0, var10, 0);
                    if (this.field8300 < 0) {
                        this.field8300 = -1;
                        this.method3390();
                        this.method1566(-47);
                        return;
                    }
                } else {
                    this.method3399(arg0, var9, var7, var10, 0);
                    if (this.field8300 >= var7) {
                        this.field8300 = var7;
                        this.method3390();
                        this.method1566(-90);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II[B[IIIIIIIILfh;II)I")
    private static final int method3419(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class609 arg11, int arg12, int arg13) {
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
        arg11.field8300 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I[B[IIIIIIIIIILfh;)I")
    private static final int method3420(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class609 arg12) {
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
        arg12.field8304 += (var19 - arg4) * arg12.field8299;
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
        arg12.field8290 = var15 >> 2;
        arg12.field8293 = var16 >> 2;
        arg12.field8300 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()I")
    public final int method1495() {
        return this.field8291 == 0 && this.field8301 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "([IIIII)I")
    private final int method3421(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field8301 <= 0) {
                if (this.field8298 == -256 && (this.field8300 & 255) == 0) {
                    if (class487.field6095) {
                        return method3391(0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, 0, arg3, arg2, this);
                    }
                    return method3416(((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, 0, arg3, arg2, this);
                }
                if (class487.field6095) {
                    return method3387(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, 0, arg3, arg2, this, this.field8298, arg4);
                }
                return method3400(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, 0, arg3, arg2, this, this.field8298, arg4);
            }
            int var6 = this.field8301 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field8301 += arg1;
            if (this.field8298 == -256 && (this.field8300 & 255) == 0) {
                if (class487.field6095) {
                    arg1 = method3413(0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, this.field8303, this.field8294, 0, var6, arg2, this);
                } else {
                    arg1 = method3409(((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, this.field8299, 0, var6, arg2, this);
                }
            } else if (class487.field6095) {
                arg1 = method3383(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8290, this.field8293, this.field8303, this.field8294, 0, var6, arg2, this, this.field8298, arg4);
            } else {
                arg1 = method3389(0, 0, ((class4) super.field5758).field30, arg0, this.field8300, arg1, this.field8304, this.field8299, 0, var6, arg2, this, this.field8298, arg4);
            }
            this.field8301 -= arg1;
            if (this.field8301 != 0) {
                return arg1;
            }
        } while (!this.method3414());
        return arg3;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)V")
    private final synchronized void method3422(int arg0, int arg1) {
        this.field8291 = arg0;
        this.field8297 = arg1;
        this.field8301 = 0;
        this.method3417();
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lft;II)V")
    private class609(class4 arg0, int arg1, int arg2) {
        super.field5758 = arg0;
        this.field8292 = arg0.field31;
        this.field8296 = arg0.field33;
        this.field8295 = arg0.field29;
        this.field8298 = arg1;
        this.field8291 = arg2;
        this.field8297 = 8192;
        this.field8300 = 0;
        this.method3417();
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lft;III)V")
    private class609(class4 arg0, int arg1, int arg2, int arg3) {
        super.field5758 = arg0;
        this.field8292 = arg0.field31;
        this.field8296 = arg0.field33;
        this.field8295 = arg0.field29;
        this.field8298 = arg1;
        this.field8291 = arg2;
        this.field8297 = arg3;
        this.field8300 = 0;
        this.method3417();
    }
}
