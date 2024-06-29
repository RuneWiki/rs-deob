import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class221 extends class88 {

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    private int field3544;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
    private boolean field3539;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    private int field3540;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    private int field3532;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    private int field3536;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    private int field3542;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "()Z")
    public final boolean method1455() {
        return this.field3542 != 0;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "()I")
    public final synchronized int method1456() {
        return this.field3533 < 0 ? -this.field3533 : this.field3533;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public final synchronized void method1457(int arg0, int arg1) {
        this.method1467(arg0, arg1, this.method1481());
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B[IIIIIIIIIILff;)I")
    private static final int method1458(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class221 arg12) {
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
        arg12.field3535 += (var19 - arg4) * arg12.field3541;
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
        arg12.field3532 = var15 >> 2;
        arg12.field3534 = var16 >> 2;
        arg12.field3545 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[B[IIIIIIILff;II)I")
    private static final int method1459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class221 arg10, int arg11, int arg12) {
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
        arg10.field3545 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
    private static final int method1460(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II[B[IIIIIIILff;II)I")
    private static final int method1461(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class221 arg10, int arg11, int arg12) {
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
        arg10.field3545 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
    public final int method208() {
        return this.field3540 == 0 && this.field3542 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "()V")
    private final void method1462() {
        this.field3535 = this.field3540;
        this.field3532 = method1464(this.field3540, this.field3543);
        this.field3534 = method1460(this.field3540, this.field3543);
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "()I")
    public final synchronized int method1463() {
        return this.field3540 == Integer.MIN_VALUE ? 0 : this.field3540;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)I")
    private static final int method1464(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[B[IIIIIIIIIILff;II)I")
    private static final int method1465(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class221 arg13, int arg14, int arg15) {
        arg13.field3535 -= arg13.field3541 * arg5;
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
        arg13.field3535 += arg13.field3541 * var22;
        arg13.field3532 = arg6;
        arg13.field3534 = arg7;
        arg13.field3545 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final synchronized void method1466(int arg0) {
        if (arg0 == 0) {
            this.method1470(0);
            this.method1074((byte) -116);
        } else if (this.field3532 == 0 && this.field3534 == 0) {
            this.field3542 = 0;
            this.field3540 = 0;
            this.field3535 = 0;
            this.method1074((byte) -124);
        } else {
            int var2 = -this.field3535;
            if (this.field3535 > var2) {
                var2 = this.field3535;
            }
            if (-this.field3532 > var2) {
                var2 = -this.field3532;
            }
            if (this.field3532 > var2) {
                var2 = this.field3532;
            }
            if (-this.field3534 > var2) {
                var2 = -this.field3534;
            }
            if (this.field3534 > var2) {
                var2 = this.field3534;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3542 = arg0;
            this.field3540 = Integer.MIN_VALUE;
            this.field3541 = -this.field3535 / arg0;
            this.field3536 = -this.field3532 / arg0;
            this.field3538 = -this.field3534 / arg0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public final synchronized void method1467(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1492(arg1, arg2);
        } else {
            int var4 = method1464(arg1, arg2);
            int var5 = method1460(arg1, arg2);
            if (this.field3532 == var4 && this.field3534 == var5) {
                this.field3542 = 0;
            } else {
                int var6 = arg1 - this.field3535;
                if (this.field3535 - arg1 > var6) {
                    var6 = this.field3535 - arg1;
                }
                if (var4 - this.field3532 > var6) {
                    var6 = var4 - this.field3532;
                }
                if (this.field3532 - var4 > var6) {
                    var6 = this.field3532 - var4;
                }
                if (var5 - this.field3534 > var6) {
                    var6 = var5 - this.field3534;
                }
                if (this.field3534 - var5 > var6) {
                    var6 = this.field3534 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3542 = arg0;
                this.field3540 = arg1;
                this.field3543 = arg2;
                this.field3541 = (arg1 - this.field3535) / arg0;
                this.field3536 = (var4 - this.field3532) / arg0;
                this.field3538 = (var5 - this.field3534) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([IIIII)I")
    private final int method1468(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3542 <= 0) {
                if (this.field3533 == 256 && (this.field3545 & 255) == 0) {
                    if (class116.field1955) {
                        return method1484(0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, 0, arg3, arg2, this);
                    }
                    return method1486(((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, 0, arg3, arg2, this);
                }
                if (class116.field1955) {
                    return method1488(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, 0, arg3, arg2, this, this.field3533, arg4);
                }
                return method1459(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, 0, arg3, arg2, this, this.field3533, arg4);
            }
            int var6 = this.field3542 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3542 += arg1;
            if (this.field3533 == 256 && (this.field3545 & 255) == 0) {
                if (class116.field1955) {
                    arg1 = method1458(0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, this.field3536, this.field3538, 0, var6, arg2, this);
                } else {
                    arg1 = method1489(((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, this.field3541, 0, var6, arg2, this);
                }
            } else if (class116.field1955) {
                arg1 = method1465(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, this.field3536, this.field3538, 0, var6, arg2, this, this.field3533, arg4);
            } else {
                arg1 = method1469(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, this.field3541, 0, var6, arg2, this, this.field3533, arg4);
            }
            this.field3542 -= arg1;
            if (this.field3542 != 0) {
                return arg1;
            }
        } while (!this.method1478());
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method1469(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class221 arg11, int arg12, int arg13) {
        arg11.field3532 -= arg11.field3536 * arg5;
        arg11.field3534 -= arg11.field3538 * arg5;
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
        arg11.field3532 += arg11.field3536 * arg5;
        arg11.field3534 += arg11.field3538 * arg5;
        arg11.field3535 = arg6;
        arg11.field3545 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    private final synchronized void method1470(int arg0) {
        this.method1492(arg0, this.method1481());
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()Lmi;")
    public final class88 method215() {
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public final synchronized void method1471(int arg0) {
        int var2 = ((class86) super.field1413).field1402.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3545 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B[IIIIIIIILff;)I")
    private static final int method1472(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class221 arg10) {
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
        arg10.field3545 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[IIIIIIIILff;)I")
    private static final int method1473(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class221 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3532 += (var14 - arg3) * arg9.field3536;
        arg9.field3534 += (var14 - arg3) * arg9.field3538;
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
        arg9.field3535 = var12 >> 2;
        arg9.field3545 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public final synchronized void method1474(int arg0) {
        this.method1492(arg0 << 6, this.method1481());
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
    public final synchronized void method1475(boolean arg0) {
        this.field3533 = (this.field3533 >>> 31) + (this.field3533 ^ this.field3533 >> 31);
        if (arg0) {
            this.field3533 = -this.field3533;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I[B[IIIIIIIIIILff;)I")
    private static final int method1476(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class221 arg12) {
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
        arg12.field3535 += (var19 - arg4) * arg12.field3541;
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
        arg12.field3532 = var15 >> 2;
        arg12.field3534 = var16 >> 2;
        arg12.field3545 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lbe;III)Lff;")
    public static final class221 method1477(class86 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1402 != null && arg0.field1402.length != 0 ? new class221(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "()Z")
    private final boolean method1478() {
        int var1 = this.field3540;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1464(var1, this.field3543);
            var2 = method1460(var1, this.field3543);
        }
        if (this.field3535 == var1 && this.field3532 == var3 && this.field3534 == var2) {
            if (this.field3540 == Integer.MIN_VALUE) {
                this.field3540 = 0;
                this.field3535 = this.field3532 = this.field3534 = 0;
                this.method1074((byte) 120);
                return true;
            } else {
                this.method1462();
                return false;
            }
        } else {
            if (this.field3535 < var1) {
                this.field3541 = 1;
                this.field3542 = var1 - this.field3535;
            } else if (this.field3535 > var1) {
                this.field3541 = -1;
                this.field3542 = this.field3535 - var1;
            } else {
                this.field3541 = 0;
            }
            if (this.field3532 < var3) {
                this.field3536 = 1;
                if (this.field3542 == 0 || this.field3542 > var3 - this.field3532) {
                    this.field3542 = var3 - this.field3532;
                }
            } else if (this.field3532 > var3) {
                this.field3536 = -1;
                if (this.field3542 == 0 || this.field3542 > this.field3532 - var3) {
                    this.field3542 = this.field3532 - var3;
                }
            } else {
                this.field3536 = 0;
            }
            if (this.field3534 < var2) {
                this.field3538 = 1;
                if (this.field3542 == 0 || this.field3542 > var2 - this.field3534) {
                    this.field3542 = var2 - this.field3534;
                }
            } else if (this.field3534 > var2) {
                this.field3538 = -1;
                if (this.field3542 == 0 || this.field3542 > this.field3534 - var2) {
                    this.field3542 = this.field3534 - var2;
                }
            } else {
                this.field3538 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lbe;II)Lff;")
    public static final class221 method1479(class86 arg0, int arg1, int arg2) {
        return arg0.field1402 != null && arg0.field1402.length != 0 ? new class221(arg0, (int) ((long) arg0.field1401 * 256L * (long) arg1 / (long) (class23.field359 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([IIIII)I")
    private final int method1480(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3542 <= 0) {
                if (this.field3533 == -256 && (this.field3545 & 255) == 0) {
                    if (class116.field1955) {
                        return method1472(0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, 0, arg3, arg2, this);
                    }
                    return method1487(((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, 0, arg3, arg2, this);
                }
                if (class116.field1955) {
                    return method1490(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, 0, arg3, arg2, this, this.field3533, arg4);
                }
                return method1461(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, 0, arg3, arg2, this, this.field3533, arg4);
            }
            int var6 = this.field3542 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3542 += arg1;
            if (this.field3533 == -256 && (this.field3545 & 255) == 0) {
                if (class116.field1955) {
                    arg1 = method1476(0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, this.field3536, this.field3538, 0, var6, arg2, this);
                } else {
                    arg1 = method1473(((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, this.field3541, 0, var6, arg2, this);
                }
            } else if (class116.field1955) {
                arg1 = method1493(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3532, this.field3534, this.field3536, this.field3538, 0, var6, arg2, this, this.field3533, arg4);
            } else {
                arg1 = method1483(0, 0, ((class86) super.field1413).field1402, arg0, this.field3545, arg1, this.field3535, this.field3541, 0, var6, arg2, this, this.field3533, arg4);
            }
            this.field3542 -= arg1;
            if (this.field3542 != 0) {
                return arg1;
            }
        } while (!this.method1478());
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "()I")
    public final synchronized int method1481() {
        return this.field3543 < 0 ? -1 : this.field3543;
    }

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "()Z")
    public final boolean method1482() {
        return this.field3545 < 0 || this.field3545 >= ((class86) super.field1413).field1402.length << 8;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method1483(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class221 arg11, int arg12, int arg13) {
        arg11.field3532 -= arg11.field3536 * arg5;
        arg11.field3534 -= arg11.field3538 * arg5;
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
        arg11.field3532 += arg11.field3536 * arg5;
        arg11.field3534 += arg11.field3538 * arg5;
        arg11.field3535 = arg6;
        arg11.field3545 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I[B[IIIIIIIILff;)I")
    private static final int method1484(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class221 arg10) {
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
        arg10.field3545 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
    public final synchronized void method1485(int arg0) {
        this.field3531 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[IIIIIIILff;)I")
    private static final int method1486(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class221 arg8) {
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
        arg8.field3545 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B[IIIIIIILff;)I")
    private static final int method1487(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class221 arg8) {
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
        arg8.field3545 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final synchronized void method211(int arg0) {
        if (this.field3542 > 0) {
            if (arg0 >= this.field3542) {
                if (this.field3540 == Integer.MIN_VALUE) {
                    this.field3540 = 0;
                    this.field3535 = this.field3532 = this.field3534 = 0;
                    this.method1074((byte) 121);
                    arg0 = this.field3542;
                }
                this.field3542 = 0;
                this.method1462();
            } else {
                this.field3535 += this.field3541 * arg0;
                this.field3532 += this.field3536 * arg0;
                this.field3534 += this.field3538 * arg0;
                this.field3542 -= arg0;
            }
        }
        class86 var2 = (class86) super.field1413;
        int var3 = this.field3537 << 8;
        int var4 = this.field3544 << 8;
        int var5 = var2.field1402.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3531 = 0;
        }
        if (this.field3545 < 0) {
            if (this.field3533 <= 0) {
                this.method1494();
                this.method1074((byte) 76);
                return;
            }
            this.field3545 = 0;
        }
        if (this.field3545 >= var5) {
            if (this.field3533 >= 0) {
                this.method1494();
                this.method1074((byte) -121);
                return;
            }
            this.field3545 = var5 - 1;
        }
        this.field3545 += this.field3533 * arg0;
        if (this.field3531 < 0) {
            if (!this.field3539) {
                if (this.field3533 < 0) {
                    if (this.field3545 < var3) {
                        this.field3545 = var4 - 1 - (var4 - 1 - this.field3545) % var6;
                    }
                } else if (this.field3545 >= var4) {
                    this.field3545 = (this.field3545 - var3) % var6 + var3;
                }
            } else {
                if (this.field3533 < 0) {
                    if (this.field3545 >= var3) {
                        return;
                    }
                    this.field3545 = var3 + var3 - 1 - this.field3545;
                    this.field3533 = -this.field3533;
                }
                while (this.field3545 >= var4) {
                    this.field3545 = var4 + var4 - 1 - this.field3545;
                    this.field3533 = -this.field3533;
                    if (this.field3545 >= var3) {
                        return;
                    }
                    this.field3545 = var3 + var3 - 1 - this.field3545;
                    this.field3533 = -this.field3533;
                }
            }
        } else {
            if (this.field3531 > 0) {
                if (this.field3539) {
                    label125: {
                        if (this.field3533 < 0) {
                            if (this.field3545 >= var3) {
                                return;
                            }
                            this.field3545 = var3 + var3 - 1 - this.field3545;
                            this.field3533 = -this.field3533;
                            if (--this.field3531 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3545 < var4) {
                                return;
                            }
                            this.field3545 = var4 + var4 - 1 - this.field3545;
                            this.field3533 = -this.field3533;
                            if (--this.field3531 == 0) {
                                break;
                            }
                            if (this.field3545 >= var3) {
                                return;
                            }
                            this.field3545 = var3 + var3 - 1 - this.field3545;
                            this.field3533 = -this.field3533;
                        } while (--this.field3531 != 0);
                    }
                } else if (this.field3533 < 0) {
                    if (this.field3545 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3545) / var6;
                    if (var7 < this.field3531) {
                        this.field3545 += var6 * var7;
                        this.field3531 -= var7;
                        return;
                    }
                    this.field3545 += this.field3531 * var6;
                    this.field3531 = 0;
                } else {
                    if (this.field3545 < var4) {
                        return;
                    }
                    int var8 = (this.field3545 - var3) / var6;
                    if (var8 < this.field3531) {
                        this.field3545 -= var6 * var8;
                        this.field3531 -= var8;
                        return;
                    }
                    this.field3545 -= this.field3531 * var6;
                    this.field3531 = 0;
                }
            }
            if (this.field3533 < 0) {
                if (this.field3545 < 0) {
                    this.field3545 = -1;
                    this.method1494();
                    this.method1074((byte) 49);
                    return;
                }
            } else if (this.field3545 >= var5) {
                this.field3545 = var5;
                this.method1494();
                this.method1074((byte) 43);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method1488(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class221 arg11, int arg12, int arg13) {
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
        arg11.field3545 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B[IIIIIIIILff;)I")
    private static final int method1489(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class221 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3532 += (var14 - arg3) * arg9.field3536;
        arg9.field3534 += (var14 - arg3) * arg9.field3538;
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
        arg9.field3535 = var12 >> 2;
        arg9.field3545 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II[B[IIIIIIIILff;II)I")
    private static final int method1490(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class221 arg11, int arg12, int arg13) {
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
        arg11.field3545 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public final synchronized void method1491(int arg0) {
        if (this.field3533 < 0) {
            this.field3533 = -arg0;
        } else {
            this.field3533 = arg0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([III)V")
    public final synchronized void method205(int[] arg0, int arg1, int arg2) {
        if (this.field3540 == 0 && this.field3542 == 0) {
            this.method211(arg2);
        } else {
            class86 var4 = (class86) super.field1413;
            int var5 = this.field3537 << 8;
            int var6 = this.field3544 << 8;
            int var7 = var4.field1402.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3531 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3545 < 0) {
                if (this.field3533 <= 0) {
                    this.method1494();
                    this.method1074((byte) -128);
                    return;
                }
                this.field3545 = 0;
            }
            if (this.field3545 >= var7) {
                if (this.field3533 >= 0) {
                    this.method1494();
                    this.method1074((byte) 6);
                    return;
                }
                this.field3545 = var7 - 1;
            }
            if (this.field3531 < 0) {
                if (this.field3539) {
                    if (this.field3533 < 0) {
                        var9 = this.method1480(arg0, arg1, var5, var10, var4.field1402[this.field3537]);
                        if (this.field3545 >= var5) {
                            return;
                        }
                        this.field3545 = var5 + var5 - 1 - this.field3545;
                        this.field3533 = -this.field3533;
                    }
                    while (true) {
                        int var11 = this.method1468(arg0, var9, var6, var10, var4.field1402[this.field3544 - 1]);
                        if (this.field3545 < var6) {
                            return;
                        }
                        this.field3545 = var6 + var6 - 1 - this.field3545;
                        this.field3533 = -this.field3533;
                        var9 = this.method1480(arg0, var11, var5, var10, var4.field1402[this.field3537]);
                        if (this.field3545 >= var5) {
                            return;
                        }
                        this.field3545 = var5 + var5 - 1 - this.field3545;
                        this.field3533 = -this.field3533;
                    }
                } else if (this.field3533 < 0) {
                    while (true) {
                        var9 = this.method1480(arg0, var9, var5, var10, var4.field1402[this.field3544 - 1]);
                        if (this.field3545 >= var5) {
                            return;
                        }
                        this.field3545 = var6 - 1 - (var6 - 1 - this.field3545) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1468(arg0, var9, var6, var10, var4.field1402[this.field3537]);
                        if (this.field3545 < var6) {
                            return;
                        }
                        this.field3545 = (this.field3545 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3531 > 0) {
                    if (this.field3539) {
                        label130: {
                            if (this.field3533 < 0) {
                                var9 = this.method1480(arg0, arg1, var5, var10, var4.field1402[this.field3537]);
                                if (this.field3545 >= var5) {
                                    return;
                                }
                                this.field3545 = var5 + var5 - 1 - this.field3545;
                                this.field3533 = -this.field3533;
                                if (--this.field3531 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1468(arg0, var9, var6, var10, var4.field1402[this.field3544 - 1]);
                                if (this.field3545 < var6) {
                                    return;
                                }
                                this.field3545 = var6 + var6 - 1 - this.field3545;
                                this.field3533 = -this.field3533;
                                if (--this.field3531 == 0) {
                                    break;
                                }
                                var9 = this.method1480(arg0, var9, var5, var10, var4.field1402[this.field3537]);
                                if (this.field3545 >= var5) {
                                    return;
                                }
                                this.field3545 = var5 + var5 - 1 - this.field3545;
                                this.field3533 = -this.field3533;
                            } while (--this.field3531 != 0);
                        }
                    } else if (this.field3533 < 0) {
                        while (true) {
                            var9 = this.method1480(arg0, var9, var5, var10, var4.field1402[this.field3544 - 1]);
                            if (this.field3545 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3545) / var8;
                            if (var12 >= this.field3531) {
                                this.field3545 += this.field3531 * var8;
                                this.field3531 = 0;
                                break;
                            }
                            this.field3545 += var8 * var12;
                            this.field3531 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1468(arg0, var9, var6, var10, var4.field1402[this.field3537]);
                            if (this.field3545 < var6) {
                                return;
                            }
                            int var13 = (this.field3545 - var5) / var8;
                            if (var13 >= this.field3531) {
                                this.field3545 -= this.field3531 * var8;
                                this.field3531 = 0;
                                break;
                            }
                            this.field3545 -= var8 * var13;
                            this.field3531 -= var13;
                        }
                    }
                }
                if (this.field3533 < 0) {
                    this.method1480(arg0, var9, 0, var10, 0);
                    if (this.field3545 < 0) {
                        this.field3545 = -1;
                        this.method1494();
                        this.method1074((byte) -123);
                        return;
                    }
                } else {
                    this.method1468(arg0, var9, var7, var10, 0);
                    if (this.field3545 >= var7) {
                        this.field3545 = var7;
                        this.method1494();
                        this.method1074((byte) 43);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)V")
    private final synchronized void method1492(int arg0, int arg1) {
        this.field3540 = arg0;
        this.field3543 = arg1;
        this.field3542 = 0;
        this.method1462();
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II[B[IIIIIIIIIILff;II)I")
    private static final int method1493(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class221 arg13, int arg14, int arg15) {
        arg13.field3535 -= arg13.field3541 * arg5;
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
        arg13.field3535 += arg13.field3541 * var22;
        arg13.field3532 = arg6;
        arg13.field3534 = arg7;
        arg13.field3545 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lmi;")
    public final class88 method193() {
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "()V")
    private final void method1494() {
        if (this.field3542 != 0) {
            if (this.field3540 == Integer.MIN_VALUE) {
                this.field3540 = 0;
            }
            this.field3542 = 0;
            this.method1462();
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lbe;II)V")
    private class221(class86 arg0, int arg1, int arg2) {
        super.field1413 = arg0;
        this.field3537 = arg0.field1400;
        this.field3544 = arg0.field1403;
        this.field3539 = arg0.field1399;
        this.field3533 = arg1;
        this.field3540 = arg2;
        this.field3543 = 8192;
        this.field3545 = 0;
        this.method1462();
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lbe;III)V")
    private class221(class86 arg0, int arg1, int arg2, int arg3) {
        super.field1413 = arg0;
        this.field3537 = arg0.field1400;
        this.field3544 = arg0.field1403;
        this.field3539 = arg0.field1399;
        this.field3533 = arg1;
        this.field3540 = arg2;
        this.field3543 = arg3;
        this.field3545 = 0;
        this.method1462();
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()I")
    public final int method687() {
        int var1 = this.field3535 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3531 == 0) {
            var2 -= this.field3545 * var2 / (((class86) super.field1413).field1402.length << 8);
        } else if (this.field3531 >= 0) {
            var2 -= this.field3537 * var2 / ((class86) super.field1413).field1402.length;
        }
        return var2 > 255 ? 255 : var2;
    }
}
