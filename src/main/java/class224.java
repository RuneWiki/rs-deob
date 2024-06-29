import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class224 extends class133 {

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    private int field3024;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Z")
    private boolean field3021;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    private int field3011;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    private int field3015;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 4)
    public final synchronized void method1406(int arg0) {
        int var2 = ((class77) super.field1755).field962.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3014 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 15)
    public final synchronized void method1407(int arg0) {
        this.field3012 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([B[IIIIIIILrd;)I", line = 18)
    private static final int method1408(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class224 arg8) {
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
        arg8.field3014 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljj;III)Lrd;", line = 43)
    public static final class224 method1409(class77 arg0, int arg1, int arg2, int arg3) {
        return arg0.field962 != null && arg0.field962.length != 0 ? new class224(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()V", line = 49)
    private final void method1410() {
        this.field3020 = this.field3017;
        this.field3023 = method1437(this.field3017, this.field3011);
        this.field3016 = method1428(this.field3017, this.field3011);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V", line = 54)
    public final synchronized void method1411(boolean arg0) {
        this.field3018 = (this.field3018 >>> 31) + (this.field3018 ^ this.field3018 >> 31);
        if (arg0) {
            this.field3018 = -this.field3018;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([IIIII)I", line = 61)
    private final int method1412(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3022 <= 0) {
                if (this.field3018 == 256 && (this.field3014 & 255) == 0) {
                    if (class495.field7227) {
                        return method1431(0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, 0, arg3, arg2, this);
                    }
                    return method1408(((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, 0, arg3, arg2, this);
                }
                if (class495.field7227) {
                    return method1432(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, 0, arg3, arg2, this, this.field3018, arg4);
                }
                return method1445(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, 0, arg3, arg2, this, this.field3018, arg4);
            }
            int var6 = this.field3022 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3022 += arg1;
            if (this.field3018 == 256 && (this.field3014 & 255) == 0) {
                if (class495.field7227) {
                    arg1 = method1425(0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, this.field3015, this.field3019, 0, var6, arg2, this);
                } else {
                    arg1 = method1439(((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, this.field3013, 0, var6, arg2, this);
                }
            } else if (class495.field7227) {
                arg1 = method1421(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, this.field3015, this.field3019, 0, var6, arg2, this, this.field3018, arg4);
            } else {
                arg1 = method1441(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, this.field3013, 0, var6, arg2, this, this.field3018, arg4);
            }
            this.field3022 -= arg1;
            if (this.field3022 != 0) {
                return arg1;
            }
        } while (!this.method1426());
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()Z", line = 118)
    public final boolean method1413() {
        return this.field3014 < 0 || this.field3014 >= ((class77) super.field1755).field962.length << 8;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 121)
    public final synchronized void method1414(int arg0, int arg1) {
        this.method1429(arg0, arg1, this.method1442());
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[B[IIIIIIIILrd;II)I", line = 124)
    private static final int method1415(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class224 arg11, int arg12, int arg13) {
        arg11.field3023 -= arg11.field3015 * arg5;
        arg11.field3016 -= arg11.field3019 * arg5;
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
        arg11.field3023 += arg11.field3015 * arg5;
        arg11.field3016 += arg11.field3019 * arg5;
        arg11.field3020 = arg6;
        arg11.field3014 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([B[IIIIIIILrd;)I", line = 157)
    private static final int method1416(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class224 arg8) {
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
        arg8.field3014 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B[IIIIIIIILrd;)I", line = 182)
    private static final int method1417(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class224 arg10) {
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
        arg10.field3014 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([IIIII)I", line = 223)
    private final int method1418(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3022 <= 0) {
                if (this.field3018 == -256 && (this.field3014 & 255) == 0) {
                    if (class495.field7227) {
                        return method1417(0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, 0, arg3, arg2, this);
                    }
                    return method1416(((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, 0, arg3, arg2, this);
                }
                if (class495.field7227) {
                    return method1424(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, 0, arg3, arg2, this, this.field3018, arg4);
                }
                return method1434(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, 0, arg3, arg2, this, this.field3018, arg4);
            }
            int var6 = this.field3022 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3022 += arg1;
            if (this.field3018 == -256 && (this.field3014 & 255) == 0) {
                if (class495.field7227) {
                    arg1 = method1440(0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, this.field3015, this.field3019, 0, var6, arg2, this);
                } else {
                    arg1 = method1427(((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, this.field3013, 0, var6, arg2, this);
                }
            } else if (class495.field7227) {
                arg1 = method1420(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3023, this.field3016, this.field3015, this.field3019, 0, var6, arg2, this, this.field3018, arg4);
            } else {
                arg1 = method1415(0, 0, ((class77) super.field1755).field962, arg0, this.field3014, arg1, this.field3020, this.field3013, 0, var6, arg2, this, this.field3018, arg4);
            }
            this.field3022 -= arg1;
            if (this.field3022 != 0) {
                return arg1;
            }
        } while (!this.method1426());
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V", line = 280)
    private final synchronized void method1419(int arg0, int arg1) {
        this.field3017 = arg0;
        this.field3011 = arg1;
        this.field3022 = 0;
        this.method1410();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[B[IIIIIIIIIILrd;II)I", line = 288)
    private static final int method1420(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class224 arg13, int arg14, int arg15) {
        arg13.field3020 -= arg13.field3013 * arg5;
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
        arg13.field3020 += arg13.field3013 * var22;
        arg13.field3023 = arg6;
        arg13.field3016 = arg7;
        arg13.field3014 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II[B[IIIIIIIIIILrd;II)I", line = 329)
    private static final int method1421(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class224 arg13, int arg14, int arg15) {
        arg13.field3020 -= arg13.field3013 * arg5;
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
        arg13.field3020 += arg13.field3013 * var22;
        arg13.field3023 = arg6;
        arg13.field3016 = arg7;
        arg13.field3014 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()Lvb;", line = 372)
    public final class133 method602() {
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V", line = 375)
    public final synchronized void method1422(int arg0) {
        if (arg0 == 0) {
            this.method1435(0);
            this.method2674(true);
        } else if (this.field3023 == 0 && this.field3016 == 0) {
            this.field3022 = 0;
            this.field3017 = 0;
            this.field3020 = 0;
            this.method2674(true);
        } else {
            int var2 = -this.field3020;
            if (this.field3020 > var2) {
                var2 = this.field3020;
            }
            if (-this.field3023 > var2) {
                var2 = -this.field3023;
            }
            if (this.field3023 > var2) {
                var2 = this.field3023;
            }
            if (-this.field3016 > var2) {
                var2 = -this.field3016;
            }
            if (this.field3016 > var2) {
                var2 = this.field3016;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3022 = arg0;
            this.field3017 = Integer.MIN_VALUE;
            this.field3013 = -this.field3020 / arg0;
            this.field3015 = -this.field3023 / arg0;
            this.field3019 = -this.field3016 / arg0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "()I", line = 420)
    public final synchronized int method1423() {
        return this.field3018 < 0 ? -this.field3018 : this.field3018;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II[B[IIIIIIIILrd;II)I", line = 424)
    private static final int method1424(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class224 arg11, int arg12, int arg13) {
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
        arg11.field3014 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B[IIIIIIIIIILrd;)I", line = 460)
    private static final int method1425(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class224 arg12) {
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
        arg12.field3020 += (var19 - arg4) * arg12.field3013;
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
        arg12.field3023 = var15 >> 2;
        arg12.field3016 = var16 >> 2;
        arg12.field3014 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()I", line = 514)
    public final int method805() {
        int var1 = this.field3020 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3012 == 0) {
            var2 -= this.field3014 * var2 / (((class77) super.field1755).field962.length << 8);
        } else if (this.field3012 >= 0) {
            var2 -= this.field3024 * var2 / ((class77) super.field1755).field962.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "()Z", line = 528)
    private final boolean method1426() {
        int var1 = this.field3017;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1437(var1, this.field3011);
            var2 = method1428(var1, this.field3011);
        }
        if (this.field3020 == var1 && this.field3023 == var3 && this.field3016 == var2) {
            if (this.field3017 == Integer.MIN_VALUE) {
                this.field3017 = 0;
                this.field3020 = this.field3023 = this.field3016 = 0;
                this.method2674(true);
                return true;
            } else {
                this.method1410();
                return false;
            }
        } else {
            if (this.field3020 < var1) {
                this.field3013 = 1;
                this.field3022 = var1 - this.field3020;
            } else if (this.field3020 > var1) {
                this.field3013 = -1;
                this.field3022 = this.field3020 - var1;
            } else {
                this.field3013 = 0;
            }
            if (this.field3023 < var3) {
                this.field3015 = 1;
                if (this.field3022 == 0 || this.field3022 > var3 - this.field3023) {
                    this.field3022 = var3 - this.field3023;
                }
            } else if (this.field3023 > var3) {
                this.field3015 = -1;
                if (this.field3022 == 0 || this.field3022 > this.field3023 - var3) {
                    this.field3022 = this.field3023 - var3;
                }
            } else {
                this.field3015 = 0;
            }
            if (this.field3016 < var2) {
                this.field3019 = 1;
                if (this.field3022 == 0 || this.field3022 > var2 - this.field3016) {
                    this.field3022 = var2 - this.field3016;
                }
            } else if (this.field3016 > var2) {
                this.field3019 = -1;
                if (this.field3022 == 0 || this.field3022 > this.field3016 - var2) {
                    this.field3022 = this.field3016 - var2;
                }
            } else {
                this.field3019 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([B[IIIIIIIILrd;)I", line = 613)
    private static final int method1427(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class224 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3023 += (var14 - arg3) * arg9.field3015;
        arg9.field3016 += (var14 - arg3) * arg9.field3019;
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
        arg9.field3020 = var12 >> 2;
        arg9.field3014 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()I", line = 648)
    public final int method594() {
        return this.field3017 == 0 && this.field3022 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I", line = 654)
    private static final int method1428(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V", line = 658)
    public final synchronized void method1429(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1419(arg1, arg2);
        } else {
            int var4 = method1437(arg1, arg2);
            int var5 = method1428(arg1, arg2);
            if (this.field3023 == var4 && this.field3016 == var5) {
                this.field3022 = 0;
            } else {
                int var6 = arg1 - this.field3020;
                if (this.field3020 - arg1 > var6) {
                    var6 = this.field3020 - arg1;
                }
                if (var4 - this.field3023 > var6) {
                    var6 = var4 - this.field3023;
                }
                if (this.field3023 - var4 > var6) {
                    var6 = this.field3023 - var4;
                }
                if (var5 - this.field3016 > var6) {
                    var6 = var5 - this.field3016;
                }
                if (this.field3016 - var5 > var6) {
                    var6 = this.field3016 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3022 = arg0;
                this.field3017 = arg1;
                this.field3011 = arg2;
                this.field3013 = (arg1 - this.field3020) / arg0;
                this.field3015 = (var4 - this.field3023) / arg0;
                this.field3019 = (var5 - this.field3016) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljj;II)Lrd;", line = 705)
    public static final class224 method1430(class77 arg0, int arg1, int arg2) {
        return arg0.field962 != null && arg0.field962.length != 0 ? new class224(arg0, (int) ((long) arg0.field961 * 256L * (long) arg1 / (long) (class286.field3762 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I[B[IIIIIIIILrd;)I", line = 711)
    private static final int method1431(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class224 arg10) {
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
        arg10.field3014 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II[B[IIIIIIIILrd;II)I", line = 752)
    private static final int method1432(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class224 arg11, int arg12, int arg13) {
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
        arg11.field3014 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "()V", line = 787)
    private final void method1433() {
        if (this.field3022 != 0) {
            if (this.field3017 == Integer.MIN_VALUE) {
                this.field3017 = 0;
            }
            this.field3022 = 0;
            this.method1410();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[B[IIIIIIILrd;II)I", line = 798)
    private static final int method1434(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class224 arg10, int arg11, int arg12) {
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
        arg10.field3014 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V", line = 824)
    private final synchronized void method1435(int arg0) {
        this.method1419(arg0, this.method1442());
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V", line = 828)
    public final synchronized void method1436(int arg0) {
        this.method1419(arg0 << 6, this.method1442());
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)I", line = 832)
    private static final int method1437(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "()I", line = 836)
    public final synchronized int method1438() {
        return this.field3017 == Integer.MIN_VALUE ? 0 : this.field3017;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([B[IIIIIIIILrd;)I", line = 839)
    private static final int method1439(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class224 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3023 += (var14 - arg3) * arg9.field3015;
        arg9.field3016 += (var14 - arg3) * arg9.field3019;
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
        arg9.field3020 = var12 >> 2;
        arg9.field3014 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I[B[IIIIIIIIIILrd;)I", line = 874)
    private static final int method1440(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class224 arg12) {
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
        arg12.field3020 += (var19 - arg4) * arg12.field3013;
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
        arg12.field3023 = var15 >> 2;
        arg12.field3016 = var16 >> 2;
        arg12.field3014 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()Lvb;", line = 927)
    public final class133 method596() {
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(II[B[IIIIIIIILrd;II)I", line = 931)
    private static final int method1441(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class224 arg11, int arg12, int arg13) {
        arg11.field3023 -= arg11.field3015 * arg5;
        arg11.field3016 -= arg11.field3019 * arg5;
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
        arg11.field3023 += arg11.field3015 * arg5;
        arg11.field3016 += arg11.field3019 * arg5;
        arg11.field3020 = arg6;
        arg11.field3014 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "()I", line = 964)
    public final synchronized int method1442() {
        return this.field3011 < 0 ? -1 : this.field3011;
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)V", line = 970)
    public final synchronized void method1443(int arg0) {
        if (this.field3018 < 0) {
            this.field3018 = -arg0;
        } else {
            this.field3018 = arg0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljj;II)V", line = 976)
    private class224(class77 arg0, int arg1, int arg2) {
        super.field1755 = arg0;
        this.field3024 = arg0.field964;
        this.field3025 = arg0.field963;
        this.field3021 = arg0.field960;
        this.field3018 = arg1;
        this.field3017 = arg2;
        this.field3011 = 8192;
        this.field3014 = 0;
        this.method1410();
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 988)
    public final synchronized void method580(int arg0) {
        if (this.field3022 > 0) {
            if (arg0 >= this.field3022) {
                if (this.field3017 == Integer.MIN_VALUE) {
                    this.field3017 = 0;
                    this.field3020 = this.field3023 = this.field3016 = 0;
                    this.method2674(true);
                    arg0 = this.field3022;
                }
                this.field3022 = 0;
                this.method1410();
            } else {
                this.field3020 += this.field3013 * arg0;
                this.field3023 += this.field3015 * arg0;
                this.field3016 += this.field3019 * arg0;
                this.field3022 -= arg0;
            }
        }
        class77 var2 = (class77) super.field1755;
        int var3 = this.field3024 << 8;
        int var4 = this.field3025 << 8;
        int var5 = var2.field962.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3012 = 0;
        }
        if (this.field3014 < 0) {
            if (this.field3018 <= 0) {
                this.method1433();
                this.method2674(true);
                return;
            }
            this.field3014 = 0;
        }
        if (this.field3014 >= var5) {
            if (this.field3018 >= 0) {
                this.method1433();
                this.method2674(true);
                return;
            }
            this.field3014 = var5 - 1;
        }
        this.field3014 += this.field3018 * arg0;
        if (this.field3012 < 0) {
            if (!this.field3021) {
                if (this.field3018 < 0) {
                    if (this.field3014 < var3) {
                        this.field3014 = var4 - 1 - (var4 - 1 - this.field3014) % var6;
                    }
                } else if (this.field3014 >= var4) {
                    this.field3014 = (this.field3014 - var3) % var6 + var3;
                }
            } else {
                if (this.field3018 < 0) {
                    if (this.field3014 >= var3) {
                        return;
                    }
                    this.field3014 = var3 + var3 - 1 - this.field3014;
                    this.field3018 = -this.field3018;
                }
                while (this.field3014 >= var4) {
                    this.field3014 = var4 + var4 - 1 - this.field3014;
                    this.field3018 = -this.field3018;
                    if (this.field3014 >= var3) {
                        return;
                    }
                    this.field3014 = var3 + var3 - 1 - this.field3014;
                    this.field3018 = -this.field3018;
                }
            }
        } else {
            if (this.field3012 > 0) {
                if (this.field3021) {
                    label125: {
                        if (this.field3018 < 0) {
                            if (this.field3014 >= var3) {
                                return;
                            }
                            this.field3014 = var3 + var3 - 1 - this.field3014;
                            this.field3018 = -this.field3018;
                            if (--this.field3012 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3014 < var4) {
                                return;
                            }
                            this.field3014 = var4 + var4 - 1 - this.field3014;
                            this.field3018 = -this.field3018;
                            if (--this.field3012 == 0) {
                                break;
                            }
                            if (this.field3014 >= var3) {
                                return;
                            }
                            this.field3014 = var3 + var3 - 1 - this.field3014;
                            this.field3018 = -this.field3018;
                        } while (--this.field3012 != 0);
                    }
                } else if (this.field3018 < 0) {
                    if (this.field3014 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3014) / var6;
                    if (var7 < this.field3012) {
                        this.field3014 += var6 * var7;
                        this.field3012 -= var7;
                        return;
                    }
                    this.field3014 += this.field3012 * var6;
                    this.field3012 = 0;
                } else {
                    if (this.field3014 < var4) {
                        return;
                    }
                    int var8 = (this.field3014 - var3) / var6;
                    if (var8 < this.field3012) {
                        this.field3014 -= var6 * var8;
                        this.field3012 -= var8;
                        return;
                    }
                    this.field3014 -= this.field3012 * var6;
                    this.field3012 = 0;
                }
            }
            if (this.field3018 < 0) {
                if (this.field3014 < 0) {
                    this.field3014 = -1;
                    this.method1433();
                    this.method2674(true);
                    return;
                }
            } else if (this.field3014 >= var5) {
                this.field3014 = var5;
                this.method1433();
                this.method2674(true);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "()Z", line = 1206)
    public final boolean method1444() {
        return this.field3022 != 0;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljj;III)V", line = 1208)
    private class224(class77 arg0, int arg1, int arg2, int arg3) {
        super.field1755 = arg0;
        this.field3024 = arg0.field964;
        this.field3025 = arg0.field963;
        this.field3021 = arg0.field960;
        this.field3018 = arg1;
        this.field3017 = arg2;
        this.field3011 = arg3;
        this.field3014 = 0;
        this.method1410();
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([III)V", line = 1220)
    public final synchronized void method572(int[] arg0, int arg1, int arg2) {
        if (this.field3017 == 0 && this.field3022 == 0) {
            this.method580(arg2);
        } else {
            class77 var4 = (class77) super.field1755;
            int var5 = this.field3024 << 8;
            int var6 = this.field3025 << 8;
            int var7 = var4.field962.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3012 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3014 < 0) {
                if (this.field3018 <= 0) {
                    this.method1433();
                    this.method2674(true);
                    return;
                }
                this.field3014 = 0;
            }
            if (this.field3014 >= var7) {
                if (this.field3018 >= 0) {
                    this.method1433();
                    this.method2674(true);
                    return;
                }
                this.field3014 = var7 - 1;
            }
            if (this.field3012 < 0) {
                if (this.field3021) {
                    if (this.field3018 < 0) {
                        var9 = this.method1418(arg0, arg1, var5, var10, var4.field962[this.field3024]);
                        if (this.field3014 >= var5) {
                            return;
                        }
                        this.field3014 = var5 + var5 - 1 - this.field3014;
                        this.field3018 = -this.field3018;
                    }
                    while (true) {
                        int var11 = this.method1412(arg0, var9, var6, var10, var4.field962[this.field3025 - 1]);
                        if (this.field3014 < var6) {
                            return;
                        }
                        this.field3014 = var6 + var6 - 1 - this.field3014;
                        this.field3018 = -this.field3018;
                        var9 = this.method1418(arg0, var11, var5, var10, var4.field962[this.field3024]);
                        if (this.field3014 >= var5) {
                            return;
                        }
                        this.field3014 = var5 + var5 - 1 - this.field3014;
                        this.field3018 = -this.field3018;
                    }
                } else if (this.field3018 < 0) {
                    while (true) {
                        var9 = this.method1418(arg0, var9, var5, var10, var4.field962[this.field3025 - 1]);
                        if (this.field3014 >= var5) {
                            return;
                        }
                        this.field3014 = var6 - 1 - (var6 - 1 - this.field3014) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1412(arg0, var9, var6, var10, var4.field962[this.field3024]);
                        if (this.field3014 < var6) {
                            return;
                        }
                        this.field3014 = (this.field3014 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3012 > 0) {
                    if (this.field3021) {
                        label130: {
                            if (this.field3018 < 0) {
                                var9 = this.method1418(arg0, arg1, var5, var10, var4.field962[this.field3024]);
                                if (this.field3014 >= var5) {
                                    return;
                                }
                                this.field3014 = var5 + var5 - 1 - this.field3014;
                                this.field3018 = -this.field3018;
                                if (--this.field3012 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1412(arg0, var9, var6, var10, var4.field962[this.field3025 - 1]);
                                if (this.field3014 < var6) {
                                    return;
                                }
                                this.field3014 = var6 + var6 - 1 - this.field3014;
                                this.field3018 = -this.field3018;
                                if (--this.field3012 == 0) {
                                    break;
                                }
                                var9 = this.method1418(arg0, var9, var5, var10, var4.field962[this.field3024]);
                                if (this.field3014 >= var5) {
                                    return;
                                }
                                this.field3014 = var5 + var5 - 1 - this.field3014;
                                this.field3018 = -this.field3018;
                            } while (--this.field3012 != 0);
                        }
                    } else if (this.field3018 < 0) {
                        while (true) {
                            var9 = this.method1418(arg0, var9, var5, var10, var4.field962[this.field3025 - 1]);
                            if (this.field3014 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3014) / var8;
                            if (var12 >= this.field3012) {
                                this.field3014 += this.field3012 * var8;
                                this.field3012 = 0;
                                break;
                            }
                            this.field3014 += var8 * var12;
                            this.field3012 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1412(arg0, var9, var6, var10, var4.field962[this.field3024]);
                            if (this.field3014 < var6) {
                                return;
                            }
                            int var13 = (this.field3014 - var5) / var8;
                            if (var13 >= this.field3012) {
                                this.field3014 -= this.field3012 * var8;
                                this.field3012 = 0;
                                break;
                            }
                            this.field3014 -= var8 * var13;
                            this.field3012 -= var13;
                        }
                    }
                }
                if (this.field3018 < 0) {
                    this.method1418(arg0, var9, 0, var10, 0);
                    if (this.field3014 < 0) {
                        this.field3014 = -1;
                        this.method1433();
                        this.method2674(true);
                        return;
                    }
                } else {
                    this.method1412(arg0, var9, var7, var10, 0);
                    if (this.field3014 >= var7) {
                        this.field3014 = var7;
                        this.method1433();
                        this.method2674(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II[B[IIIIIIILrd;II)I", line = 1455)
    private static final int method1445(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class224 arg10, int arg11, int arg12) {
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
        arg10.field3014 = arg4;
        return arg5;
    }
}
