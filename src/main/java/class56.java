import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class117 {

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Z")
    private boolean field1507;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([IIIII)I")
    private final int method444(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1500 <= 0) {
                if (this.field1501 == 256 && (this.field1499 & 255) == 0) {
                    if (class20.field568) {
                        return method445(0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, 0, arg3, arg2, this);
                    }
                    return method467(((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, 0, arg3, arg2, this);
                }
                if (class20.field568) {
                    return method478(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, 0, arg3, arg2, this, this.field1501, arg4);
                }
                return method450(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, 0, arg3, arg2, this, this.field1501, arg4);
            }
            int var6 = this.field1500 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1500 += arg1;
            if (this.field1501 == 256 && (this.field1499 & 255) == 0) {
                if (class20.field568) {
                    arg1 = method469(0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, this.field1508, this.field1496, 0, var6, arg2, this);
                } else {
                    arg1 = method482(((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, this.field1503, 0, var6, arg2, this);
                }
            } else if (class20.field568) {
                arg1 = method459(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, this.field1508, this.field1496, 0, var6, arg2, this, this.field1501, arg4);
            } else {
                arg1 = method449(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, this.field1503, 0, var6, arg2, this, this.field1501, arg4);
            }
            this.field1500 -= arg1;
            if (this.field1500 != 0) {
                return arg1;
            }
        } while (!this.method473());
        return arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[B[IIIIIIIILi;)I")
    private static final int method445(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class56 arg10) {
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
        arg10.field1499 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([B[IIIIIIILi;)I")
    private static final int method446(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class56 arg8) {
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
        arg8.field1499 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
    public final int method447() {
        return this.field1506 == 0 && this.field1500 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[B[IIIIIIIIIILi;II)I")
    private static final int method448(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class56 arg13, int arg14, int arg15) {
        arg13.field1498 -= arg13.field1503 * arg5;
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
        arg13.field1498 += arg13.field1503 * var22;
        arg13.field1494 = arg6;
        arg13.field1502 = arg7;
        arg13.field1499 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[B[IIIIIIIILi;II)I")
    private static final int method449(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class56 arg11, int arg12, int arg13) {
        arg11.field1494 -= arg11.field1508 * arg5;
        arg11.field1502 -= arg11.field1496 * arg5;
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
        arg11.field1494 += arg11.field1508 * arg5;
        arg11.field1502 += arg11.field1496 * arg5;
        arg11.field1498 = arg6;
        arg11.field1499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[B[IIIIIIILi;II)I")
    private static final int method450(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class56 arg10, int arg11, int arg12) {
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
        arg10.field1499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpd;III)Li;")
    public static final class56 method451(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2659 != null && arg0.field2659.length != 0 ? new class56(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public final synchronized void method452(int arg0) {
        int var2 = ((class108) super.field2989).field2659.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1499 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([IIIII)I")
    private final int method453(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1500 <= 0) {
                if (this.field1501 == -256 && (this.field1499 & 255) == 0) {
                    if (class20.field568) {
                        return method479(0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, 0, arg3, arg2, this);
                    }
                    return method446(((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, 0, arg3, arg2, this);
                }
                if (class20.field568) {
                    return method476(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, 0, arg3, arg2, this, this.field1501, arg4);
                }
                return method458(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, 0, arg3, arg2, this, this.field1501, arg4);
            }
            int var6 = this.field1500 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1500 += arg1;
            if (this.field1501 == -256 && (this.field1499 & 255) == 0) {
                if (class20.field568) {
                    arg1 = method472(0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, this.field1508, this.field1496, 0, var6, arg2, this);
                } else {
                    arg1 = method462(((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, this.field1503, 0, var6, arg2, this);
                }
            } else if (class20.field568) {
                arg1 = method448(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1494, this.field1502, this.field1508, this.field1496, 0, var6, arg2, this, this.field1501, arg4);
            } else {
                arg1 = method460(0, 0, ((class108) super.field2989).field2659, arg0, this.field1499, arg1, this.field1498, this.field1503, 0, var6, arg2, this, this.field1501, arg4);
            }
            this.field1500 -= arg1;
            if (this.field1500 != 0) {
                return arg1;
            }
        } while (!this.method473());
        return arg3;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()Lqf;")
    public final class117 method454() {
        return null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    public final synchronized void method455(int arg0) {
        this.field1505 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I")
    private static final int method456(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)V")
    public final synchronized void method457(int arg0, int arg1) {
        this.method480(arg0, arg1, this.method461());
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II[B[IIIIIIILi;II)I")
    private static final int method458(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class56 arg10, int arg11, int arg12) {
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
        arg10.field1499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II[B[IIIIIIIIIILi;II)I")
    private static final int method459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class56 arg13, int arg14, int arg15) {
        arg13.field1498 -= arg13.field1503 * arg5;
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
        arg13.field1498 += arg13.field1503 * var22;
        arg13.field1494 = arg6;
        arg13.field1502 = arg7;
        arg13.field1499 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II[B[IIIIIIIILi;II)I")
    private static final int method460(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class56 arg11, int arg12, int arg13) {
        arg11.field1494 -= arg11.field1508 * arg5;
        arg11.field1502 -= arg11.field1496 * arg5;
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
        arg11.field1494 += arg11.field1508 * arg5;
        arg11.field1502 += arg11.field1496 * arg5;
        arg11.field1498 = arg6;
        arg11.field1499 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()I")
    public final synchronized int method461() {
        return this.field1504 < 0 ? -1 : this.field1504;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([B[IIIIIIIILi;)I")
    private static final int method462(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class56 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1494 += (var14 - arg3) * arg9.field1508;
        arg9.field1502 += (var14 - arg3) * arg9.field1496;
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
        arg9.field1498 = var12 >> 2;
        arg9.field1499 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([III)V")
    public final synchronized void method463(int[] arg0, int arg1, int arg2) {
        if (this.field1506 == 0 && this.field1500 == 0) {
            this.method470(arg2);
        } else {
            class108 var4 = (class108) super.field2989;
            int var5 = this.field1497 << 8;
            int var6 = this.field1495 << 8;
            int var7 = var4.field2659.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1505 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1499 < 0) {
                if (this.field1501 <= 0) {
                    this.method471();
                    this.method1147((byte) -77);
                    return;
                }
                this.field1499 = 0;
            }
            if (this.field1499 >= var7) {
                if (this.field1501 >= 0) {
                    this.method471();
                    this.method1147((byte) -117);
                    return;
                }
                this.field1499 = var7 - 1;
            }
            if (this.field1505 < 0) {
                if (this.field1507) {
                    if (this.field1501 < 0) {
                        var9 = this.method453(arg0, arg1, var5, var10, var4.field2659[this.field1497]);
                        if (this.field1499 >= var5) {
                            return;
                        }
                        this.field1499 = var5 + var5 - 1 - this.field1499;
                        this.field1501 = -this.field1501;
                    }
                    while (true) {
                        int var11 = this.method444(arg0, var9, var6, var10, var4.field2659[this.field1495 - 1]);
                        if (this.field1499 < var6) {
                            return;
                        }
                        this.field1499 = var6 + var6 - 1 - this.field1499;
                        this.field1501 = -this.field1501;
                        var9 = this.method453(arg0, var11, var5, var10, var4.field2659[this.field1497]);
                        if (this.field1499 >= var5) {
                            return;
                        }
                        this.field1499 = var5 + var5 - 1 - this.field1499;
                        this.field1501 = -this.field1501;
                    }
                } else if (this.field1501 < 0) {
                    while (true) {
                        var9 = this.method453(arg0, var9, var5, var10, var4.field2659[this.field1495 - 1]);
                        if (this.field1499 >= var5) {
                            return;
                        }
                        this.field1499 = var6 - 1 - (var6 - 1 - this.field1499) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method444(arg0, var9, var6, var10, var4.field2659[this.field1497]);
                        if (this.field1499 < var6) {
                            return;
                        }
                        this.field1499 = (this.field1499 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1505 > 0) {
                    if (this.field1507) {
                        label130: {
                            if (this.field1501 < 0) {
                                var9 = this.method453(arg0, arg1, var5, var10, var4.field2659[this.field1497]);
                                if (this.field1499 >= var5) {
                                    return;
                                }
                                this.field1499 = var5 + var5 - 1 - this.field1499;
                                this.field1501 = -this.field1501;
                                if (--this.field1505 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method444(arg0, var9, var6, var10, var4.field2659[this.field1495 - 1]);
                                if (this.field1499 < var6) {
                                    return;
                                }
                                this.field1499 = var6 + var6 - 1 - this.field1499;
                                this.field1501 = -this.field1501;
                                if (--this.field1505 == 0) {
                                    break;
                                }
                                var9 = this.method453(arg0, var9, var5, var10, var4.field2659[this.field1497]);
                                if (this.field1499 >= var5) {
                                    return;
                                }
                                this.field1499 = var5 + var5 - 1 - this.field1499;
                                this.field1501 = -this.field1501;
                            } while (--this.field1505 != 0);
                        }
                    } else if (this.field1501 < 0) {
                        while (true) {
                            var9 = this.method453(arg0, var9, var5, var10, var4.field2659[this.field1495 - 1]);
                            if (this.field1499 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1499) / var8;
                            if (var12 >= this.field1505) {
                                this.field1499 += this.field1505 * var8;
                                this.field1505 = 0;
                                break;
                            }
                            this.field1499 += var8 * var12;
                            this.field1505 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method444(arg0, var9, var6, var10, var4.field2659[this.field1497]);
                            if (this.field1499 < var6) {
                                return;
                            }
                            int var13 = (this.field1499 - var5) / var8;
                            if (var13 >= this.field1505) {
                                this.field1499 -= this.field1505 * var8;
                                this.field1505 = 0;
                                break;
                            }
                            this.field1499 -= var8 * var13;
                            this.field1505 -= var13;
                        }
                    }
                }
                if (this.field1501 < 0) {
                    this.method453(arg0, var9, 0, var10, 0);
                    if (this.field1499 < 0) {
                        this.field1499 = -1;
                        this.method471();
                        this.method1147((byte) -83);
                        return;
                    }
                } else {
                    this.method444(arg0, var9, var7, var10, 0);
                    if (this.field1499 >= var7) {
                        this.field1499 = var7;
                        this.method471();
                        this.method1147((byte) -79);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(II)I")
    private static final int method464(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public final synchronized void method465(int arg0) {
        if (this.field1501 < 0) {
            this.field1501 = -arg0;
        } else {
            this.field1501 = arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
    private final void method466() {
        this.field1498 = this.field1506;
        this.field1494 = method464(this.field1506, this.field1504);
        this.field1502 = method456(this.field1506, this.field1504);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([B[IIIIIIILi;)I")
    private static final int method467(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class56 arg8) {
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
        arg8.field1499 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Lqf;")
    public final class117 method468() {
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[B[IIIIIIIIIILi;)I")
    private static final int method469(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class56 arg12) {
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
        arg12.field1498 += (var19 - arg4) * arg12.field1503;
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
        arg12.field1494 = var15 >> 2;
        arg12.field1502 = var16 >> 2;
        arg12.field1499 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final synchronized void method470(int arg0) {
        if (this.field1500 > 0) {
            if (arg0 >= this.field1500) {
                if (this.field1506 == Integer.MIN_VALUE) {
                    this.field1506 = 0;
                    this.field1498 = this.field1494 = this.field1502 = 0;
                    this.method1147((byte) -57);
                    arg0 = this.field1500;
                }
                this.field1500 = 0;
                this.method466();
            } else {
                this.field1498 += this.field1503 * arg0;
                this.field1494 += this.field1508 * arg0;
                this.field1502 += this.field1496 * arg0;
                this.field1500 -= arg0;
            }
        }
        class108 var2 = (class108) super.field2989;
        int var3 = this.field1497 << 8;
        int var4 = this.field1495 << 8;
        int var5 = var2.field2659.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1505 = 0;
        }
        if (this.field1499 < 0) {
            if (this.field1501 <= 0) {
                this.method471();
                this.method1147((byte) -97);
                return;
            }
            this.field1499 = 0;
        }
        if (this.field1499 >= var5) {
            if (this.field1501 >= 0) {
                this.method471();
                this.method1147((byte) -59);
                return;
            }
            this.field1499 = var5 - 1;
        }
        this.field1499 += this.field1501 * arg0;
        if (this.field1505 < 0) {
            if (!this.field1507) {
                if (this.field1501 < 0) {
                    if (this.field1499 < var3) {
                        this.field1499 = var4 - 1 - (var4 - 1 - this.field1499) % var6;
                    }
                } else if (this.field1499 >= var4) {
                    this.field1499 = (this.field1499 - var3) % var6 + var3;
                }
            } else {
                if (this.field1501 < 0) {
                    if (this.field1499 >= var3) {
                        return;
                    }
                    this.field1499 = var3 + var3 - 1 - this.field1499;
                    this.field1501 = -this.field1501;
                }
                while (this.field1499 >= var4) {
                    this.field1499 = var4 + var4 - 1 - this.field1499;
                    this.field1501 = -this.field1501;
                    if (this.field1499 >= var3) {
                        return;
                    }
                    this.field1499 = var3 + var3 - 1 - this.field1499;
                    this.field1501 = -this.field1501;
                }
            }
        } else {
            if (this.field1505 > 0) {
                if (this.field1507) {
                    label125: {
                        if (this.field1501 < 0) {
                            if (this.field1499 >= var3) {
                                return;
                            }
                            this.field1499 = var3 + var3 - 1 - this.field1499;
                            this.field1501 = -this.field1501;
                            if (--this.field1505 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1499 < var4) {
                                return;
                            }
                            this.field1499 = var4 + var4 - 1 - this.field1499;
                            this.field1501 = -this.field1501;
                            if (--this.field1505 == 0) {
                                break;
                            }
                            if (this.field1499 >= var3) {
                                return;
                            }
                            this.field1499 = var3 + var3 - 1 - this.field1499;
                            this.field1501 = -this.field1501;
                        } while (--this.field1505 != 0);
                    }
                } else if (this.field1501 < 0) {
                    if (this.field1499 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1499) / var6;
                    if (var7 < this.field1505) {
                        this.field1499 += var6 * var7;
                        this.field1505 -= var7;
                        return;
                    }
                    this.field1499 += this.field1505 * var6;
                    this.field1505 = 0;
                } else {
                    if (this.field1499 < var4) {
                        return;
                    }
                    int var8 = (this.field1499 - var3) / var6;
                    if (var8 < this.field1505) {
                        this.field1499 -= var6 * var8;
                        this.field1505 -= var8;
                        return;
                    }
                    this.field1499 -= this.field1505 * var6;
                    this.field1505 = 0;
                }
            }
            if (this.field1501 < 0) {
                if (this.field1499 < 0) {
                    this.field1499 = -1;
                    this.method471();
                    this.method1147((byte) -63);
                    return;
                }
            } else if (this.field1499 >= var5) {
                this.field1499 = var5;
                this.method471();
                this.method1147((byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
    private final void method471() {
        if (this.field1500 != 0) {
            if (this.field1506 == Integer.MIN_VALUE) {
                this.field1506 = 0;
            }
            this.field1500 = 0;
            this.method466();
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I[B[IIIIIIIIIILi;)I")
    private static final int method472(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class56 arg12) {
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
        arg12.field1498 += (var19 - arg4) * arg12.field1503;
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
        arg12.field1494 = var15 >> 2;
        arg12.field1502 = var16 >> 2;
        arg12.field1499 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "()Z")
    private final boolean method473() {
        int var1 = this.field1506;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method464(var1, this.field1504);
            var2 = method456(var1, this.field1504);
        }
        if (this.field1498 == var1 && this.field1494 == var3 && this.field1502 == var2) {
            if (this.field1506 == Integer.MIN_VALUE) {
                this.field1506 = 0;
                this.field1498 = this.field1494 = this.field1502 = 0;
                this.method1147((byte) -40);
                return true;
            } else {
                this.method466();
                return false;
            }
        } else {
            if (this.field1498 < var1) {
                this.field1503 = 1;
                this.field1500 = var1 - this.field1498;
            } else if (this.field1498 > var1) {
                this.field1503 = -1;
                this.field1500 = this.field1498 - var1;
            } else {
                this.field1503 = 0;
            }
            if (this.field1494 < var3) {
                this.field1508 = 1;
                if (this.field1500 == 0 || this.field1500 > var3 - this.field1494) {
                    this.field1500 = var3 - this.field1494;
                }
            } else if (this.field1494 > var3) {
                this.field1508 = -1;
                if (this.field1500 == 0 || this.field1500 > this.field1494 - var3) {
                    this.field1500 = this.field1494 - var3;
                }
            } else {
                this.field1508 = 0;
            }
            if (this.field1502 < var2) {
                this.field1496 = 1;
                if (this.field1500 == 0 || this.field1500 > var2 - this.field1502) {
                    this.field1500 = var2 - this.field1502;
                }
            } else if (this.field1502 > var2) {
                this.field1496 = -1;
                if (this.field1500 == 0 || this.field1500 > this.field1502 - var2) {
                    this.field1500 = this.field1502 - var2;
                }
            } else {
                this.field1496 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "()I")
    public final synchronized int method474() {
        return this.field1506 == Integer.MIN_VALUE ? 0 : this.field1506;
    }

    @OriginalMember(owner = "client!i", name = "j", descriptor = "()Z")
    public final boolean method475() {
        return this.field1499 < 0 || this.field1499 >= ((class108) super.field2989).field2659.length << 8;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II[B[IIIIIIIILi;II)I")
    private static final int method476(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class56 arg11, int arg12, int arg13) {
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
        arg11.field1499 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    private final synchronized void method477(int arg0) {
        this.method481(arg0, this.method461());
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(II[B[IIIIIIIILi;II)I")
    private static final int method478(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class56 arg11, int arg12, int arg13) {
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
        arg11.field1499 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I[B[IIIIIIIILi;)I")
    private static final int method479(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class56 arg10) {
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
        arg10.field1499 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public final synchronized void method480(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method481(arg1, arg2);
        } else {
            int var4 = method464(arg1, arg2);
            int var5 = method456(arg1, arg2);
            if (this.field1494 == var4 && this.field1502 == var5) {
                this.field1500 = 0;
            } else {
                int var6 = arg1 - this.field1498;
                if (this.field1498 - arg1 > var6) {
                    var6 = this.field1498 - arg1;
                }
                if (var4 - this.field1494 > var6) {
                    var6 = var4 - this.field1494;
                }
                if (this.field1494 - var4 > var6) {
                    var6 = this.field1494 - var4;
                }
                if (var5 - this.field1502 > var6) {
                    var6 = var5 - this.field1502;
                }
                if (this.field1502 - var5 > var6) {
                    var6 = this.field1502 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1500 = arg0;
                this.field1506 = arg1;
                this.field1504 = arg2;
                this.field1503 = (arg1 - this.field1498) / arg0;
                this.field1508 = (var4 - this.field1494) / arg0;
                this.field1496 = (var5 - this.field1502) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(II)V")
    private final synchronized void method481(int arg0, int arg1) {
        this.field1506 = arg0;
        this.field1504 = arg1;
        this.field1500 = 0;
        this.method466();
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([B[IIIIIIIILi;)I")
    private static final int method482(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class56 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1494 += (var14 - arg3) * arg9.field1508;
        arg9.field1502 += (var14 - arg3) * arg9.field1496;
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
        arg9.field1498 = var12 >> 2;
        arg9.field1499 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpd;II)Li;")
    public static final class56 method483(class108 arg0, int arg1, int arg2) {
        return arg0.field2659 != null && arg0.field2659.length != 0 ? new class56(arg0, (int) ((long) arg0.field2660 * 256L * (long) arg1 / (long) (class48.field1282 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lpd;II)V")
    private class56(class108 arg0, int arg1, int arg2) {
        super.field2989 = arg0;
        this.field1497 = arg0.field2658;
        this.field1495 = arg0.field2661;
        this.field1507 = arg0.field2662;
        this.field1501 = arg1;
        this.field1506 = arg2;
        this.field1504 = 8192;
        this.field1499 = 0;
        this.method466();
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()I")
    public final int method484() {
        int var1 = this.field1498 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1505 == 0) {
            var2 -= this.field1499 * var2 / (((class108) super.field2989).field2659.length << 8);
        } else if (this.field1505 >= 0) {
            var2 -= this.field1497 * var2 / ((class108) super.field2989).field2659.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
    public final synchronized void method485(boolean arg0) {
        this.field1501 = (this.field1501 >>> 31) + (this.field1501 ^ this.field1501 >> 31);
        if (arg0) {
            this.field1501 = -this.field1501;
        }
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "()I")
    public final synchronized int method486() {
        return this.field1501 < 0 ? -this.field1501 : this.field1501;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public final synchronized void method487(int arg0) {
        if (arg0 == 0) {
            this.method477(0);
            this.method1147((byte) -48);
        } else if (this.field1494 == 0 && this.field1502 == 0) {
            this.field1500 = 0;
            this.field1506 = 0;
            this.field1498 = 0;
            this.method1147((byte) -80);
        } else {
            int var2 = -this.field1498;
            if (this.field1498 > var2) {
                var2 = this.field1498;
            }
            if (-this.field1494 > var2) {
                var2 = -this.field1494;
            }
            if (this.field1494 > var2) {
                var2 = this.field1494;
            }
            if (-this.field1502 > var2) {
                var2 = -this.field1502;
            }
            if (this.field1502 > var2) {
                var2 = this.field1502;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1500 = arg0;
            this.field1506 = Integer.MIN_VALUE;
            this.field1503 = -this.field1498 / arg0;
            this.field1508 = -this.field1494 / arg0;
            this.field1496 = -this.field1502 / arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "()Z")
    public final boolean method488() {
        return this.field1500 != 0;
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
    public final synchronized void method489(int arg0) {
        this.method481(arg0 << 6, this.method461());
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lpd;III)V")
    private class56(class108 arg0, int arg1, int arg2, int arg3) {
        super.field2989 = arg0;
        this.field1497 = arg0.field2658;
        this.field1495 = arg0.field2661;
        this.field1507 = arg0.field2662;
        this.field1501 = arg1;
        this.field1506 = arg2;
        this.field1504 = arg3;
        this.field1499 = 0;
        this.method466();
    }
}
