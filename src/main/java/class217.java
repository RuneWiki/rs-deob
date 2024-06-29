import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class217 extends class514 {

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Z")
    private boolean field3211;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    private int field3218;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    private int field3205;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    private int field3207;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    private int field3210;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    private int field3214;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    private int field3216;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    private int field3217;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    private int field3219;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "()Lft;", line = 5)
    public final class514 method1397() {
        return null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V", line = 9)
    public final synchronized void method1398(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1433(arg1, arg2);
        } else {
            int var4 = method1424(arg1, arg2);
            int var5 = method1440(arg1, arg2);
            if (this.field3208 == var4 && this.field3219 == var5) {
                this.field3210 = 0;
            } else {
                int var6 = arg1 - this.field3217;
                if (this.field3217 - arg1 > var6) {
                    var6 = this.field3217 - arg1;
                }
                if (var4 - this.field3208 > var6) {
                    var6 = var4 - this.field3208;
                }
                if (this.field3208 - var4 > var6) {
                    var6 = this.field3208 - var4;
                }
                if (var5 - this.field3219 > var6) {
                    var6 = var5 - this.field3219;
                }
                if (this.field3219 - var5 > var6) {
                    var6 = this.field3219 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3210 = arg0;
                this.field3205 = arg1;
                this.field3213 = arg2;
                this.field3214 = (arg1 - this.field3217) / arg0;
                this.field3215 = (var4 - this.field3208) / arg0;
                this.field3216 = (var5 - this.field3219) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II[B[IIIIIIIIIILor;II)I", line = 55)
    private static final int method1399(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class217 arg13, int arg14, int arg15) {
        arg13.field3217 -= arg13.field3214 * arg5;
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
        arg13.field3217 += arg13.field3214 * var22;
        arg13.field3208 = arg6;
        arg13.field3219 = arg7;
        arg13.field3207 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II[B[IIIIIIIILor;II)I", line = 99)
    private static final int method1400(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class217 arg11, int arg12, int arg13) {
        arg11.field3208 -= arg11.field3215 * arg5;
        arg11.field3219 -= arg11.field3216 * arg5;
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
        arg11.field3208 += arg11.field3215 * arg5;
        arg11.field3219 += arg11.field3216 * arg5;
        arg11.field3217 = arg6;
        arg11.field3207 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "()I", line = 134)
    public final synchronized int method1401() {
        return this.field3213 < 0 ? -1 : this.field3213;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([B[IIIIIIIILor;)I", line = 137)
    private static final int method1402(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class217 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3208 += (var14 - arg3) * arg9.field3215;
        arg9.field3219 += (var14 - arg3) * arg9.field3216;
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
        arg9.field3217 = var12 >> 2;
        arg9.field3207 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 171)
    public final synchronized void method1403(int arg0) {
        if (this.field3218 < 0) {
            this.field3218 = -arg0;
        } else {
            this.field3218 = arg0;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I[B[IIIIIIIILor;)I", line = 178)
    private static final int method1404(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class217 arg10) {
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
        arg10.field3207 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "()I", line = 218)
    public final synchronized int method1405() {
        return this.field3218 < 0 ? -this.field3218 : this.field3218;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([IIIII)I", line = 222)
    private final int method1406(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3210 <= 0) {
                if (this.field3218 == -256 && (this.field3207 & 255) == 0) {
                    if (class614.field9002) {
                        return method1404(0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, 0, arg3, arg2, this);
                    }
                    return method1436(((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, 0, arg3, arg2, this);
                }
                if (class614.field9002) {
                    return method1416(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, 0, arg3, arg2, this, this.field3218, arg4);
                }
                return method1414(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, 0, arg3, arg2, this, this.field3218, arg4);
            }
            int var6 = this.field3210 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3210 += arg1;
            if (this.field3218 == -256 && (this.field3207 & 255) == 0) {
                if (class614.field9002) {
                    arg1 = method1429(0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, this.field3215, this.field3216, 0, var6, arg2, this);
                } else {
                    arg1 = method1402(((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, this.field3214, 0, var6, arg2, this);
                }
            } else if (class614.field9002) {
                arg1 = method1415(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, this.field3215, this.field3216, 0, var6, arg2, this, this.field3218, arg4);
            } else {
                arg1 = method1426(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, this.field3214, 0, var6, arg2, this, this.field3218, arg4);
            }
            this.field3210 -= arg1;
            if (this.field3210 != 0) {
                return arg1;
            }
        } while (!this.method1422());
        return arg3;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 277)
    public final synchronized void method1407(boolean arg0) {
        this.field3218 = (this.field3218 >>> 31) + (this.field3218 ^ this.field3218 >> 31);
        if (arg0) {
            this.field3218 = -this.field3218;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lmca;II)Lor;", line = 285)
    public static final class217 method1408(class5 arg0, int arg1, int arg2) {
        return arg0.field45 != null && arg0.field45.length != 0 ? new class217(arg0, (int) ((long) arg0.field46 * 256L * (long) arg1 / (long) (class36.field419 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([B[IIIIIIILor;)I", line = 292)
    private static final int method1409(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class217 arg8) {
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
        arg8.field3207 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 317)
    private final synchronized void method1410(int arg0) {
        this.method1433(arg0, this.method1401());
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 320)
    public final synchronized void method1411(int arg0, int arg1) {
        this.method1398(arg0, arg1, this.method1401());
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "(I)V", line = 325)
    public final synchronized void method1412(int arg0) {
        this.method1433(arg0 << 6, this.method1401());
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "()Z", line = 328)
    public final boolean method1413() {
        return this.field3210 != 0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II[B[IIIIIIILor;II)I", line = 331)
    private static final int method1414(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class217 arg10, int arg11, int arg12) {
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
        arg10.field3207 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II[B[IIIIIIIIIILor;II)I", line = 360)
    private static final int method1415(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class217 arg13, int arg14, int arg15) {
        arg13.field3217 -= arg13.field3214 * arg5;
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
        arg13.field3217 += arg13.field3214 * var22;
        arg13.field3208 = arg6;
        arg13.field3219 = arg7;
        arg13.field3207 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II[B[IIIIIIIILor;II)I", line = 402)
    private static final int method1416(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class217 arg11, int arg12, int arg13) {
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
        arg11.field3207 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!or", name = "h", descriptor = "(I)V", line = 435)
    public final synchronized void method1417(int arg0) {
        this.field3212 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "()I", line = 441)
    public final int method1418() {
        int var1 = this.field3217 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3212 == 0) {
            var2 -= this.field3207 * var2 / (((class5) super.field7616).field45.length << 8);
        } else if (this.field3212 >= 0) {
            var2 -= this.field3206 * var2 / ((class5) super.field7616).field45.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "()I", line = 453)
    public final int method1419() {
        return this.field3205 == 0 && this.field3210 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lmca;III)Lor;", line = 459)
    public static final class217 method1420(class5 arg0, int arg1, int arg2, int arg3) {
        return arg0.field45 != null && arg0.field45.length != 0 ? new class217(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!or", name = "i", descriptor = "(I)V", line = 467)
    public final synchronized void method1421(int arg0) {
        int var2 = ((class5) super.field7616).field45.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3207 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "h", descriptor = "()Z", line = 478)
    private final boolean method1422() {
        int var1 = this.field3205;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1424(var1, this.field3213);
            var2 = method1440(var1, this.field3213);
        }
        if (this.field3217 == var1 && this.field3208 == var3 && this.field3219 == var2) {
            if (this.field3205 == Integer.MIN_VALUE) {
                this.field3205 = 0;
                this.field3217 = this.field3208 = this.field3219 = 0;
                this.method2997(1);
                return true;
            } else {
                this.method1435();
                return false;
            }
        } else {
            if (this.field3217 < var1) {
                this.field3214 = 1;
                this.field3210 = var1 - this.field3217;
            } else if (this.field3217 > var1) {
                this.field3214 = -1;
                this.field3210 = this.field3217 - var1;
            } else {
                this.field3214 = 0;
            }
            if (this.field3208 < var3) {
                this.field3215 = 1;
                if (this.field3210 == 0 || this.field3210 > var3 - this.field3208) {
                    this.field3210 = var3 - this.field3208;
                }
            } else if (this.field3208 > var3) {
                this.field3215 = -1;
                if (this.field3210 == 0 || this.field3210 > this.field3208 - var3) {
                    this.field3210 = this.field3208 - var3;
                }
            } else {
                this.field3215 = 0;
            }
            if (this.field3219 < var2) {
                this.field3216 = 1;
                if (this.field3210 == 0 || this.field3210 > var2 - this.field3219) {
                    this.field3210 = var2 - this.field3219;
                }
            } else if (this.field3219 > var2) {
                this.field3216 = -1;
                if (this.field3210 == 0 || this.field3210 > this.field3219 - var2) {
                    this.field3210 = this.field3219 - var2;
                }
            } else {
                this.field3216 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "i", descriptor = "()V", line = 563)
    private final void method1423() {
        if (this.field3210 != 0) {
            if (this.field3205 == Integer.MIN_VALUE) {
                this.field3205 = 0;
            }
            this.field3210 = 0;
            this.method1435();
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I", line = 575)
    private static final int method1424(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([III)V", line = 578)
    public final synchronized void method1425(int[] arg0, int arg1, int arg2) {
        if (this.field3205 == 0 && this.field3210 == 0) {
            this.method1434(arg2);
        } else {
            class5 var4 = (class5) super.field7616;
            int var5 = this.field3206 << 8;
            int var6 = this.field3209 << 8;
            int var7 = var4.field45.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3212 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3207 < 0) {
                if (this.field3218 <= 0) {
                    this.method1423();
                    this.method2997(1);
                    return;
                }
                this.field3207 = 0;
            }
            if (this.field3207 >= var7) {
                if (this.field3218 >= 0) {
                    this.method1423();
                    this.method2997(1);
                    return;
                }
                this.field3207 = var7 - 1;
            }
            if (this.field3212 < 0) {
                if (this.field3211) {
                    if (this.field3218 < 0) {
                        var9 = this.method1406(arg0, arg1, var5, var10, var4.field45[this.field3206]);
                        if (this.field3207 >= var5) {
                            return;
                        }
                        this.field3207 = var5 + var5 - 1 - this.field3207;
                        this.field3218 = -this.field3218;
                    }
                    while (true) {
                        int var11 = this.method1430(arg0, var9, var6, var10, var4.field45[this.field3209 - 1]);
                        if (this.field3207 < var6) {
                            return;
                        }
                        this.field3207 = var6 + var6 - 1 - this.field3207;
                        this.field3218 = -this.field3218;
                        var9 = this.method1406(arg0, var11, var5, var10, var4.field45[this.field3206]);
                        if (this.field3207 >= var5) {
                            return;
                        }
                        this.field3207 = var5 + var5 - 1 - this.field3207;
                        this.field3218 = -this.field3218;
                    }
                } else if (this.field3218 < 0) {
                    while (true) {
                        var9 = this.method1406(arg0, var9, var5, var10, var4.field45[this.field3209 - 1]);
                        if (this.field3207 >= var5) {
                            return;
                        }
                        this.field3207 = var6 - 1 - (var6 - 1 - this.field3207) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1430(arg0, var9, var6, var10, var4.field45[this.field3206]);
                        if (this.field3207 < var6) {
                            return;
                        }
                        this.field3207 = (this.field3207 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3212 > 0) {
                    if (this.field3211) {
                        label130: {
                            if (this.field3218 < 0) {
                                var9 = this.method1406(arg0, arg1, var5, var10, var4.field45[this.field3206]);
                                if (this.field3207 >= var5) {
                                    return;
                                }
                                this.field3207 = var5 + var5 - 1 - this.field3207;
                                this.field3218 = -this.field3218;
                                if (--this.field3212 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1430(arg0, var9, var6, var10, var4.field45[this.field3209 - 1]);
                                if (this.field3207 < var6) {
                                    return;
                                }
                                this.field3207 = var6 + var6 - 1 - this.field3207;
                                this.field3218 = -this.field3218;
                                if (--this.field3212 == 0) {
                                    break;
                                }
                                var9 = this.method1406(arg0, var9, var5, var10, var4.field45[this.field3206]);
                                if (this.field3207 >= var5) {
                                    return;
                                }
                                this.field3207 = var5 + var5 - 1 - this.field3207;
                                this.field3218 = -this.field3218;
                            } while (--this.field3212 != 0);
                        }
                    } else if (this.field3218 < 0) {
                        while (true) {
                            var9 = this.method1406(arg0, var9, var5, var10, var4.field45[this.field3209 - 1]);
                            if (this.field3207 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3207) / var8;
                            if (var12 >= this.field3212) {
                                this.field3207 += this.field3212 * var8;
                                this.field3212 = 0;
                                break;
                            }
                            this.field3207 += var8 * var12;
                            this.field3212 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1430(arg0, var9, var6, var10, var4.field45[this.field3206]);
                            if (this.field3207 < var6) {
                                return;
                            }
                            int var13 = (this.field3207 - var5) / var8;
                            if (var13 >= this.field3212) {
                                this.field3207 -= this.field3212 * var8;
                                this.field3212 = 0;
                                break;
                            }
                            this.field3207 -= var8 * var13;
                            this.field3212 -= var13;
                        }
                    }
                }
                if (this.field3218 < 0) {
                    this.method1406(arg0, var9, 0, var10, 0);
                    if (this.field3207 < 0) {
                        this.field3207 = -1;
                        this.method1423();
                        this.method2997(1);
                        return;
                    }
                } else {
                    this.method1430(arg0, var9, var7, var10, 0);
                    if (this.field3207 >= var7) {
                        this.field3207 = var7;
                        this.method1423();
                        this.method2997(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(II[B[IIIIIIIILor;II)I", line = 814)
    private static final int method1426(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class217 arg11, int arg12, int arg13) {
        arg11.field3208 -= arg11.field3215 * arg5;
        arg11.field3219 -= arg11.field3216 * arg5;
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
        arg11.field3208 += arg11.field3215 * arg5;
        arg11.field3219 += arg11.field3216 * arg5;
        arg11.field3217 = arg6;
        arg11.field3207 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I[B[IIIIIIIIIILor;)I", line = 847)
    private static final int method1427(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class217 arg12) {
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
        arg12.field3217 += (var19 - arg4) * arg12.field3214;
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
        arg12.field3208 = var15 >> 2;
        arg12.field3219 = var16 >> 2;
        arg12.field3207 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!or", name = "j", descriptor = "()I", line = 900)
    public final synchronized int method1428() {
        return this.field3205 == Integer.MIN_VALUE ? 0 : this.field3205;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I[B[IIIIIIIIIILor;)I", line = 903)
    private static final int method1429(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class217 arg12) {
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
        arg12.field3217 += (var19 - arg4) * arg12.field3214;
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
        arg12.field3208 = var15 >> 2;
        arg12.field3219 = var16 >> 2;
        arg12.field3207 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "([IIIII)I", line = 957)
    private final int method1430(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3210 <= 0) {
                if (this.field3218 == 256 && (this.field3207 & 255) == 0) {
                    if (class614.field9002) {
                        return method1431(0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, 0, arg3, arg2, this);
                    }
                    return method1409(((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, 0, arg3, arg2, this);
                }
                if (class614.field9002) {
                    return method1442(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, 0, arg3, arg2, this, this.field3218, arg4);
                }
                return method1441(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, 0, arg3, arg2, this, this.field3218, arg4);
            }
            int var6 = this.field3210 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3210 += arg1;
            if (this.field3218 == 256 && (this.field3207 & 255) == 0) {
                if (class614.field9002) {
                    arg1 = method1427(0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, this.field3215, this.field3216, 0, var6, arg2, this);
                } else {
                    arg1 = method1432(((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, this.field3214, 0, var6, arg2, this);
                }
            } else if (class614.field9002) {
                arg1 = method1399(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3208, this.field3219, this.field3215, this.field3216, 0, var6, arg2, this, this.field3218, arg4);
            } else {
                arg1 = method1400(0, 0, ((class5) super.field7616).field45, arg0, this.field3207, arg1, this.field3217, this.field3214, 0, var6, arg2, this, this.field3218, arg4);
            }
            this.field3210 -= arg1;
            if (this.field3210 != 0) {
                return arg1;
            }
        } while (!this.method1422());
        return arg3;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I[B[IIIIIIIILor;)I", line = 1015)
    private static final int method1431(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class217 arg10) {
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
        arg10.field3207 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "([B[IIIIIIIILor;)I", line = 1053)
    private static final int method1432(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class217 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3208 += (var14 - arg3) * arg9.field3215;
        arg9.field3219 += (var14 - arg3) * arg9.field3216;
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
        arg9.field3217 = var12 >> 2;
        arg9.field3207 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V", line = 1089)
    private final synchronized void method1433(int arg0, int arg1) {
        this.field3205 = arg0;
        this.field3213 = arg1;
        this.field3210 = 0;
        this.method1435();
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 1096)
    public final synchronized void method1434(int arg0) {
        if (this.field3210 > 0) {
            if (arg0 >= this.field3210) {
                if (this.field3205 == Integer.MIN_VALUE) {
                    this.field3205 = 0;
                    this.field3217 = this.field3208 = this.field3219 = 0;
                    this.method2997(1);
                    arg0 = this.field3210;
                }
                this.field3210 = 0;
                this.method1435();
            } else {
                this.field3217 += this.field3214 * arg0;
                this.field3208 += this.field3215 * arg0;
                this.field3219 += this.field3216 * arg0;
                this.field3210 -= arg0;
            }
        }
        class5 var2 = (class5) super.field7616;
        int var3 = this.field3206 << 8;
        int var4 = this.field3209 << 8;
        int var5 = var2.field45.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3212 = 0;
        }
        if (this.field3207 < 0) {
            if (this.field3218 <= 0) {
                this.method1423();
                this.method2997(1);
                return;
            }
            this.field3207 = 0;
        }
        if (this.field3207 >= var5) {
            if (this.field3218 >= 0) {
                this.method1423();
                this.method2997(1);
                return;
            }
            this.field3207 = var5 - 1;
        }
        this.field3207 += this.field3218 * arg0;
        if (this.field3212 < 0) {
            if (!this.field3211) {
                if (this.field3218 < 0) {
                    if (this.field3207 < var3) {
                        this.field3207 = var4 - 1 - (var4 - 1 - this.field3207) % var6;
                    }
                } else if (this.field3207 >= var4) {
                    this.field3207 = (this.field3207 - var3) % var6 + var3;
                }
            } else {
                if (this.field3218 < 0) {
                    if (this.field3207 >= var3) {
                        return;
                    }
                    this.field3207 = var3 + var3 - 1 - this.field3207;
                    this.field3218 = -this.field3218;
                }
                while (this.field3207 >= var4) {
                    this.field3207 = var4 + var4 - 1 - this.field3207;
                    this.field3218 = -this.field3218;
                    if (this.field3207 >= var3) {
                        return;
                    }
                    this.field3207 = var3 + var3 - 1 - this.field3207;
                    this.field3218 = -this.field3218;
                }
            }
        } else {
            if (this.field3212 > 0) {
                if (this.field3211) {
                    label125: {
                        if (this.field3218 < 0) {
                            if (this.field3207 >= var3) {
                                return;
                            }
                            this.field3207 = var3 + var3 - 1 - this.field3207;
                            this.field3218 = -this.field3218;
                            if (--this.field3212 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3207 < var4) {
                                return;
                            }
                            this.field3207 = var4 + var4 - 1 - this.field3207;
                            this.field3218 = -this.field3218;
                            if (--this.field3212 == 0) {
                                break;
                            }
                            if (this.field3207 >= var3) {
                                return;
                            }
                            this.field3207 = var3 + var3 - 1 - this.field3207;
                            this.field3218 = -this.field3218;
                        } while (--this.field3212 != 0);
                    }
                } else if (this.field3218 < 0) {
                    if (this.field3207 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3207) / var6;
                    if (var7 < this.field3212) {
                        this.field3207 += var6 * var7;
                        this.field3212 -= var7;
                        return;
                    }
                    this.field3207 += this.field3212 * var6;
                    this.field3212 = 0;
                } else {
                    if (this.field3207 < var4) {
                        return;
                    }
                    int var8 = (this.field3207 - var3) / var6;
                    if (var8 < this.field3212) {
                        this.field3207 -= var6 * var8;
                        this.field3212 -= var8;
                        return;
                    }
                    this.field3207 -= this.field3212 * var6;
                    this.field3212 = 0;
                }
            }
            if (this.field3218 < 0) {
                if (this.field3207 < 0) {
                    this.field3207 = -1;
                    this.method1423();
                    this.method2997(1);
                    return;
                }
            } else if (this.field3207 >= var5) {
                this.field3207 = var5;
                this.method1423();
                this.method2997(1);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "k", descriptor = "()V", line = 1314)
    private final void method1435() {
        this.field3217 = this.field3205;
        this.field3208 = method1424(this.field3205, this.field3213);
        this.field3219 = method1440(this.field3205, this.field3213);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "([B[IIIIIIILor;)I", line = 1320)
    private static final int method1436(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class217 arg8) {
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
        arg8.field3207 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "()Lft;", line = 1345)
    public final class514 method1437() {
        return null;
    }

    @OriginalMember(owner = "client!or", name = "j", descriptor = "(I)V", line = 1348)
    public final synchronized void method1438(int arg0) {
        if (arg0 == 0) {
            this.method1410(0);
            this.method2997(1);
        } else if (this.field3208 == 0 && this.field3219 == 0) {
            this.field3210 = 0;
            this.field3205 = 0;
            this.field3217 = 0;
            this.method2997(1);
        } else {
            int var2 = -this.field3217;
            if (this.field3217 > var2) {
                var2 = this.field3217;
            }
            if (-this.field3208 > var2) {
                var2 = -this.field3208;
            }
            if (this.field3208 > var2) {
                var2 = this.field3208;
            }
            if (-this.field3219 > var2) {
                var2 = -this.field3219;
            }
            if (this.field3219 > var2) {
                var2 = this.field3219;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3210 = arg0;
            this.field3205 = Integer.MIN_VALUE;
            this.field3214 = -this.field3217 / arg0;
            this.field3215 = -this.field3208 / arg0;
            this.field3216 = -this.field3219 / arg0;
        }
    }

    @OriginalMember(owner = "client!or", name = "l", descriptor = "()Z", line = 1393)
    public final boolean method1439() {
        return this.field3207 < 0 || this.field3207 >= ((class5) super.field7616).field45.length << 8;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(II)I", line = 1396)
    private static final int method1440(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(II[B[IIIIIIILor;II)I", line = 1399)
    private static final int method1441(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class217 arg10, int arg11, int arg12) {
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
        arg10.field3207 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(II[B[IIIIIIIILor;II)I", line = 1425)
    private static final int method1442(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class217 arg11, int arg12, int arg13) {
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
        arg11.field3207 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lmca;II)V", line = 1458)
    private class217(class5 arg0, int arg1, int arg2) {
        super.field7616 = arg0;
        this.field3206 = arg0.field48;
        this.field3209 = arg0.field47;
        this.field3211 = arg0.field49;
        this.field3218 = arg1;
        this.field3205 = arg2;
        this.field3213 = 8192;
        this.field3207 = 0;
        this.method1435();
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lmca;III)V", line = 1469)
    private class217(class5 arg0, int arg1, int arg2, int arg3) {
        super.field7616 = arg0;
        this.field3206 = arg0.field48;
        this.field3209 = arg0.field47;
        this.field3211 = arg0.field49;
        this.field3218 = arg1;
        this.field3205 = arg2;
        this.field3213 = arg3;
        this.field3207 = 0;
        this.method1435();
    }
}
