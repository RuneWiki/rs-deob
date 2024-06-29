import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class57 extends class216 {

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "Z")
    private boolean field895;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    private int field893;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    private int field894;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
    public final synchronized void method528(boolean arg0) {
        this.field896 = (this.field896 >>> 31) + (this.field896 ^ this.field896 >> 31);
        if (arg0) {
            this.field896 = -this.field896;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
    public final synchronized void method529(int arg0) {
        if (arg0 == 0) {
            this.method567(0);
            this.method636((byte) 97);
        } else if (this.field893 == 0 && this.field903 == 0) {
            this.field902 = 0;
            this.field904 = 0;
            this.field898 = 0;
            this.method636((byte) 97);
        } else {
            int var2 = -this.field898;
            if (this.field898 > var2) {
                var2 = this.field898;
            }
            if (-this.field893 > var2) {
                var2 = -this.field893;
            }
            if (this.field893 > var2) {
                var2 = this.field893;
            }
            if (-this.field903 > var2) {
                var2 = -this.field903;
            }
            if (this.field903 > var2) {
                var2 = this.field903;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field902 = arg0;
            this.field904 = Integer.MIN_VALUE;
            this.field894 = -this.field898 / arg0;
            this.field907 = -this.field893 / arg0;
            this.field897 = -this.field903 / arg0;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method530(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
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
        arg11.field906 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "()Laca;")
    public final class216 method531() {
        return null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()Laca;")
    public final class216 method532() {
        return null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([B[IIIIIIILsv;)I")
    private static final int method533(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class57 arg8) {
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
        arg8.field906 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[B[IIIIIIIIIILsv;II)I")
    private static final int method534(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class57 arg13, int arg14, int arg15) {
        arg13.field898 -= arg13.field894 * arg5;
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
        arg13.field898 += arg13.field894 * var22;
        arg13.field893 = arg6;
        arg13.field903 = arg7;
        arg13.field906 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V")
    private final synchronized void method535(int arg0, int arg1) {
        this.field904 = arg0;
        this.field899 = arg1;
        this.field902 = 0;
        this.method573();
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V")
    public final synchronized void method536(int arg0) {
        this.field900 = arg0;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V")
    public final synchronized void method537(int arg0) {
        this.method535(arg0 << 6, this.method565());
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(II)I")
    private static final int method538(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "()Z")
    public final boolean method539() {
        return this.field902 != 0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIII)I")
    private final int method540(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field902 <= 0) {
                if (this.field896 == 256 && (this.field906 & 255) == 0) {
                    if (class53.field849) {
                        return method553(0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, 0, arg3, arg2, this);
                    }
                    return method533(((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, 0, arg3, arg2, this);
                }
                if (class53.field849) {
                    return method559(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, 0, arg3, arg2, this, this.field896, arg4);
                }
                return method572(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, 0, arg3, arg2, this, this.field896, arg4);
            }
            int var6 = this.field902 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field902 += arg1;
            if (this.field896 == 256 && (this.field906 & 255) == 0) {
                if (class53.field849) {
                    arg1 = method542(0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, this.field907, this.field897, 0, var6, arg2, this);
                } else {
                    arg1 = method546(((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, this.field894, 0, var6, arg2, this);
                }
            } else if (class53.field849) {
                arg1 = method557(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, this.field907, this.field897, 0, var6, arg2, this, this.field896, arg4);
            } else {
                arg1 = method569(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, this.field894, 0, var6, arg2, this, this.field896, arg4);
            }
            this.field902 -= arg1;
            if (this.field902 != 0) {
                return arg1;
            }
        } while (!this.method554());
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[B[IIIIIIILsv;II)I")
    private static final int method541(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10, int arg11, int arg12) {
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
        arg10.field906 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[B[IIIIIIIIIILsv;)I")
    private static final int method542(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12) {
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
        arg12.field898 += (var19 - arg4) * arg12.field894;
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
        arg12.field893 = var15 >> 2;
        arg12.field903 = var16 >> 2;
        arg12.field906 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([B[IIIIIIIILsv;)I")
    private static final int method543(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class57 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field893 += (var14 - arg3) * arg9.field907;
        arg9.field903 += (var14 - arg3) * arg9.field897;
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
        arg9.field898 = var12 >> 2;
        arg9.field906 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "()V")
    private final void method544() {
        if (this.field902 != 0) {
            if (this.field904 == Integer.MIN_VALUE) {
                this.field904 = 0;
            }
            this.field902 = 0;
            this.method573();
        }
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "()I")
    public final synchronized int method545() {
        return this.field896 < 0 ? -this.field896 : this.field896;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "([B[IIIIIIIILsv;)I")
    private static final int method546(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class57 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field893 += (var14 - arg3) * arg9.field907;
        arg9.field903 += (var14 - arg3) * arg9.field897;
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
        arg9.field898 = var12 >> 2;
        arg9.field906 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "()I")
    public final synchronized int method547() {
        return this.field904 == Integer.MIN_VALUE ? 0 : this.field904;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "([IIIII)I")
    private final int method548(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field902 <= 0) {
                if (this.field896 == -256 && (this.field906 & 255) == 0) {
                    if (class53.field849) {
                        return method564(0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, 0, arg3, arg2, this);
                    }
                    return method562(((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, 0, arg3, arg2, this);
                }
                if (class53.field849) {
                    return method530(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, 0, arg3, arg2, this, this.field896, arg4);
                }
                return method541(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, 0, arg3, arg2, this, this.field896, arg4);
            }
            int var6 = this.field902 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field902 += arg1;
            if (this.field896 == -256 && (this.field906 & 255) == 0) {
                if (class53.field849) {
                    arg1 = method570(0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, this.field907, this.field897, 0, var6, arg2, this);
                } else {
                    arg1 = method543(((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, this.field894, 0, var6, arg2, this);
                }
            } else if (class53.field849) {
                arg1 = method534(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field893, this.field903, this.field907, this.field897, 0, var6, arg2, this, this.field896, arg4);
            } else {
                arg1 = method566(0, 0, ((class538) super.field3561).field7695, arg0, this.field906, arg1, this.field898, this.field894, 0, var6, arg2, this, this.field896, arg4);
            }
            this.field902 -= arg1;
            if (this.field902 != 0) {
                return arg1;
            }
        } while (!this.method554());
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "(II)I")
    private static final int method549(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
    public final synchronized void method550(int arg0) {
        int var2 = ((class538) super.field3561).field7695.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field906 = arg0;
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(II)V")
    public final synchronized void method551(int arg0, int arg1) {
        this.method560(arg0, arg1, this.method565());
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "()I")
    public final int method552() {
        return this.field904 == 0 && this.field902 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[B[IIIIIIIILsv;)I")
    private static final int method553(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
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
        arg10.field906 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "()Z")
    private final boolean method554() {
        int var1 = this.field904;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method549(var1, this.field899);
            var2 = method538(var1, this.field899);
        }
        if (this.field898 == var1 && this.field893 == var3 && this.field903 == var2) {
            if (this.field904 == Integer.MIN_VALUE) {
                this.field904 = 0;
                this.field898 = this.field893 = this.field903 = 0;
                this.method636((byte) 97);
                return true;
            } else {
                this.method573();
                return false;
            }
        } else {
            if (this.field898 < var1) {
                this.field894 = 1;
                this.field902 = var1 - this.field898;
            } else if (this.field898 > var1) {
                this.field894 = -1;
                this.field902 = this.field898 - var1;
            } else {
                this.field894 = 0;
            }
            if (this.field893 < var3) {
                this.field907 = 1;
                if (this.field902 == 0 || this.field902 > var3 - this.field893) {
                    this.field902 = var3 - this.field893;
                }
            } else if (this.field893 > var3) {
                this.field907 = -1;
                if (this.field902 == 0 || this.field902 > this.field893 - var3) {
                    this.field902 = this.field893 - var3;
                }
            } else {
                this.field907 = 0;
            }
            if (this.field903 < var2) {
                this.field897 = 1;
                if (this.field902 == 0 || this.field902 > var2 - this.field903) {
                    this.field902 = var2 - this.field903;
                }
            } else if (this.field903 > var2) {
                this.field897 = -1;
                if (this.field902 == 0 || this.field902 > this.field903 - var2) {
                    this.field902 = this.field903 - var2;
                }
            } else {
                this.field897 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)V")
    public final synchronized void method555(int arg0) {
        this.method535(this.method547(), arg0);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lso;III)Lsv;")
    public static final class57 method556(class538 arg0, int arg1, int arg2, int arg3) {
        return arg0.field7695 != null && arg0.field7695.length != 0 ? new class57(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II[B[IIIIIIIIIILsv;II)I")
    private static final int method557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class57 arg13, int arg14, int arg15) {
        arg13.field898 -= arg13.field894 * arg5;
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
        arg13.field898 += arg13.field894 * var22;
        arg13.field893 = arg6;
        arg13.field903 = arg7;
        arg13.field906 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "()I")
    public final int method558() {
        int var1 = this.field898 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field900 == 0) {
            var2 -= this.field906 * var2 / (((class538) super.field3561).field7695.length << 8);
        } else if (this.field900 >= 0) {
            var2 -= this.field901 * var2 / ((class538) super.field3561).field7695.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method559(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
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
        arg11.field906 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
    public final synchronized void method560(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method535(arg1, arg2);
        } else {
            int var4 = method549(arg1, arg2);
            int var5 = method538(arg1, arg2);
            if (this.field893 == var4 && this.field903 == var5) {
                this.field902 = 0;
            } else {
                int var6 = arg1 - this.field898;
                if (this.field898 - arg1 > var6) {
                    var6 = this.field898 - arg1;
                }
                if (var4 - this.field893 > var6) {
                    var6 = var4 - this.field893;
                }
                if (this.field893 - var4 > var6) {
                    var6 = this.field893 - var4;
                }
                if (var5 - this.field903 > var6) {
                    var6 = var5 - this.field903;
                }
                if (this.field903 - var5 > var6) {
                    var6 = this.field903 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field902 = arg0;
                this.field904 = arg1;
                this.field899 = arg2;
                this.field894 = (arg1 - this.field898) / arg0;
                this.field907 = (var4 - this.field893) / arg0;
                this.field897 = (var5 - this.field903) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
    public final synchronized void method561(int arg0) {
        if (this.field896 < 0) {
            this.field896 = -arg0;
        } else {
            this.field896 = arg0;
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "([B[IIIIIIILsv;)I")
    private static final int method562(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class57 arg8) {
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
        arg8.field906 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([III)V")
    public final synchronized void method563(int[] arg0, int arg1, int arg2) {
        if (this.field904 == 0 && this.field902 == 0) {
            this.method568(arg2);
        } else {
            class538 var4 = (class538) super.field3561;
            int var5 = this.field901 << 8;
            int var6 = this.field905 << 8;
            int var7 = var4.field7695.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field900 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field906 < 0) {
                if (this.field896 <= 0) {
                    this.method544();
                    this.method636((byte) 97);
                    return;
                }
                this.field906 = 0;
            }
            if (this.field906 >= var7) {
                if (this.field896 >= 0) {
                    this.method544();
                    this.method636((byte) 97);
                    return;
                }
                this.field906 = var7 - 1;
            }
            if (this.field900 < 0) {
                if (this.field895) {
                    if (this.field896 < 0) {
                        var9 = this.method548(arg0, arg1, var5, var10, var4.field7695[this.field901]);
                        if (this.field906 >= var5) {
                            return;
                        }
                        this.field906 = var5 + var5 - 1 - this.field906;
                        this.field896 = -this.field896;
                    }
                    while (true) {
                        int var11 = this.method540(arg0, var9, var6, var10, var4.field7695[this.field905 - 1]);
                        if (this.field906 < var6) {
                            return;
                        }
                        this.field906 = var6 + var6 - 1 - this.field906;
                        this.field896 = -this.field896;
                        var9 = this.method548(arg0, var11, var5, var10, var4.field7695[this.field901]);
                        if (this.field906 >= var5) {
                            return;
                        }
                        this.field906 = var5 + var5 - 1 - this.field906;
                        this.field896 = -this.field896;
                    }
                } else if (this.field896 < 0) {
                    while (true) {
                        var9 = this.method548(arg0, var9, var5, var10, var4.field7695[this.field905 - 1]);
                        if (this.field906 >= var5) {
                            return;
                        }
                        this.field906 = var6 - 1 - (var6 - 1 - this.field906) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method540(arg0, var9, var6, var10, var4.field7695[this.field901]);
                        if (this.field906 < var6) {
                            return;
                        }
                        this.field906 = (this.field906 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field900 > 0) {
                    if (this.field895) {
                        label130: {
                            if (this.field896 < 0) {
                                var9 = this.method548(arg0, arg1, var5, var10, var4.field7695[this.field901]);
                                if (this.field906 >= var5) {
                                    return;
                                }
                                this.field906 = var5 + var5 - 1 - this.field906;
                                this.field896 = -this.field896;
                                if (--this.field900 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method540(arg0, var9, var6, var10, var4.field7695[this.field905 - 1]);
                                if (this.field906 < var6) {
                                    return;
                                }
                                this.field906 = var6 + var6 - 1 - this.field906;
                                this.field896 = -this.field896;
                                if (--this.field900 == 0) {
                                    break;
                                }
                                var9 = this.method548(arg0, var9, var5, var10, var4.field7695[this.field901]);
                                if (this.field906 >= var5) {
                                    return;
                                }
                                this.field906 = var5 + var5 - 1 - this.field906;
                                this.field896 = -this.field896;
                            } while (--this.field900 != 0);
                        }
                    } else if (this.field896 < 0) {
                        while (true) {
                            var9 = this.method548(arg0, var9, var5, var10, var4.field7695[this.field905 - 1]);
                            if (this.field906 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field906) / var8;
                            if (var12 >= this.field900) {
                                this.field906 += this.field900 * var8;
                                this.field900 = 0;
                                break;
                            }
                            this.field906 += var8 * var12;
                            this.field900 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method540(arg0, var9, var6, var10, var4.field7695[this.field901]);
                            if (this.field906 < var6) {
                                return;
                            }
                            int var13 = (this.field906 - var5) / var8;
                            if (var13 >= this.field900) {
                                this.field906 -= this.field900 * var8;
                                this.field900 = 0;
                                break;
                            }
                            this.field906 -= var8 * var13;
                            this.field900 -= var13;
                        }
                    }
                }
                if (this.field896 < 0) {
                    this.method548(arg0, var9, 0, var10, 0);
                    if (this.field906 < 0) {
                        this.field906 = -1;
                        this.method544();
                        this.method636((byte) 97);
                        return;
                    }
                } else {
                    this.method540(arg0, var9, var7, var10, 0);
                    if (this.field906 >= var7) {
                        this.field906 = var7;
                        this.method544();
                        this.method636((byte) 97);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I[B[IIIIIIIILsv;)I")
    private static final int method564(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
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
        arg10.field906 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "()I")
    public final synchronized int method565() {
        return this.field899 < 0 ? -1 : this.field899;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method566(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
        arg11.field893 -= arg11.field907 * arg5;
        arg11.field903 -= arg11.field897 * arg5;
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
        arg11.field893 += arg11.field907 * arg5;
        arg11.field903 += arg11.field897 * arg5;
        arg11.field898 = arg6;
        arg11.field906 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "(I)V")
    private final synchronized void method567(int arg0) {
        this.method535(arg0, this.method565());
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public final synchronized void method568(int arg0) {
        if (this.field902 > 0) {
            if (arg0 >= this.field902) {
                if (this.field904 == Integer.MIN_VALUE) {
                    this.field904 = 0;
                    this.field898 = this.field893 = this.field903 = 0;
                    this.method636((byte) 97);
                    arg0 = this.field902;
                }
                this.field902 = 0;
                this.method573();
            } else {
                this.field898 += this.field894 * arg0;
                this.field893 += this.field907 * arg0;
                this.field903 += this.field897 * arg0;
                this.field902 -= arg0;
            }
        }
        class538 var2 = (class538) super.field3561;
        int var3 = this.field901 << 8;
        int var4 = this.field905 << 8;
        int var5 = var2.field7695.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field900 = 0;
        }
        if (this.field906 < 0) {
            if (this.field896 <= 0) {
                this.method544();
                this.method636((byte) 97);
                return;
            }
            this.field906 = 0;
        }
        if (this.field906 >= var5) {
            if (this.field896 >= 0) {
                this.method544();
                this.method636((byte) 97);
                return;
            }
            this.field906 = var5 - 1;
        }
        this.field906 += this.field896 * arg0;
        if (this.field900 < 0) {
            if (!this.field895) {
                if (this.field896 < 0) {
                    if (this.field906 < var3) {
                        this.field906 = var4 - 1 - (var4 - 1 - this.field906) % var6;
                    }
                } else if (this.field906 >= var4) {
                    this.field906 = (this.field906 - var3) % var6 + var3;
                }
            } else {
                if (this.field896 < 0) {
                    if (this.field906 >= var3) {
                        return;
                    }
                    this.field906 = var3 + var3 - 1 - this.field906;
                    this.field896 = -this.field896;
                }
                while (this.field906 >= var4) {
                    this.field906 = var4 + var4 - 1 - this.field906;
                    this.field896 = -this.field896;
                    if (this.field906 >= var3) {
                        return;
                    }
                    this.field906 = var3 + var3 - 1 - this.field906;
                    this.field896 = -this.field896;
                }
            }
        } else {
            if (this.field900 > 0) {
                if (this.field895) {
                    label125: {
                        if (this.field896 < 0) {
                            if (this.field906 >= var3) {
                                return;
                            }
                            this.field906 = var3 + var3 - 1 - this.field906;
                            this.field896 = -this.field896;
                            if (--this.field900 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field906 < var4) {
                                return;
                            }
                            this.field906 = var4 + var4 - 1 - this.field906;
                            this.field896 = -this.field896;
                            if (--this.field900 == 0) {
                                break;
                            }
                            if (this.field906 >= var3) {
                                return;
                            }
                            this.field906 = var3 + var3 - 1 - this.field906;
                            this.field896 = -this.field896;
                        } while (--this.field900 != 0);
                    }
                } else if (this.field896 < 0) {
                    if (this.field906 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field906) / var6;
                    if (var7 < this.field900) {
                        this.field906 += var6 * var7;
                        this.field900 -= var7;
                        return;
                    }
                    this.field906 += this.field900 * var6;
                    this.field900 = 0;
                } else {
                    if (this.field906 < var4) {
                        return;
                    }
                    int var8 = (this.field906 - var3) / var6;
                    if (var8 < this.field900) {
                        this.field906 -= var6 * var8;
                        this.field900 -= var8;
                        return;
                    }
                    this.field906 -= this.field900 * var6;
                    this.field900 = 0;
                }
            }
            if (this.field896 < 0) {
                if (this.field906 < 0) {
                    this.field906 = -1;
                    this.method544();
                    this.method636((byte) 97);
                    return;
                }
            } else if (this.field906 >= var5) {
                this.field906 = var5;
                this.method544();
                this.method636((byte) 97);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "(II[B[IIIIIIIILsv;II)I")
    private static final int method569(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class57 arg11, int arg12, int arg13) {
        arg11.field893 -= arg11.field907 * arg5;
        arg11.field903 -= arg11.field897 * arg5;
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
        arg11.field893 += arg11.field907 * arg5;
        arg11.field903 += arg11.field897 * arg5;
        arg11.field898 = arg6;
        arg11.field906 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I[B[IIIIIIIIIILsv;)I")
    private static final int method570(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12) {
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
        arg12.field898 += (var19 - arg4) * arg12.field894;
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
        arg12.field893 = var15 >> 2;
        arg12.field903 = var16 >> 2;
        arg12.field906 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "()Z")
    public final boolean method571() {
        return this.field906 < 0 || this.field906 >= ((class538) super.field3561).field7695.length << 8;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II[B[IIIIIIILsv;II)I")
    private static final int method572(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10, int arg11, int arg12) {
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
        arg10.field906 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "()V")
    private final void method573() {
        this.field898 = this.field904;
        this.field893 = method549(this.field904, this.field899);
        this.field903 = method538(this.field904, this.field899);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lso;III)V")
    private class57(class538 arg0, int arg1, int arg2, int arg3) {
        super.field3561 = arg0;
        this.field901 = arg0.field7693;
        this.field905 = arg0.field7692;
        this.field895 = arg0.field7696;
        this.field896 = arg1;
        this.field904 = arg2;
        this.field899 = arg3;
        this.field906 = 0;
        this.method573();
    }
}
