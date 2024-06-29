import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class484 extends class404 {

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    private int field6653;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    private int field6658;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
    private boolean field6646;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    private int field6649;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    private int field6656;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    private int field6647;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    private int field6657;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    private int field6645;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    private int field6648;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    private int field6650;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    private int field6651;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    private int field6652;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    private int field6654;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    private int field6655;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    private int field6659;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[B[IIIIIIIILsf;II)I", line = 3)
    private static final int method2716(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class484 arg11, int arg12, int arg13) {
        arg11.field6654 -= arg11.field6651 * arg5;
        arg11.field6648 -= arg11.field6650 * arg5;
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
        arg11.field6654 += arg11.field6651 * arg5;
        arg11.field6648 += arg11.field6650 * arg5;
        arg11.field6659 = arg6;
        arg11.field6657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B[IIIIIIILsf;)I", line = 36)
    private static final int method2717(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class484 arg8) {
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
        arg8.field6657 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "()Z", line = 63)
    public final boolean method2718() {
        return this.field6655 != 0;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "()I", line = 67)
    public final synchronized int method2719() {
        return this.field6656 == Integer.MIN_VALUE ? 0 : this.field6656;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[B[IIIIIIILsf;II)I", line = 71)
    private static final int method2720(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class484 arg10, int arg11, int arg12) {
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
        arg10.field6657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()Ljc;", line = 97)
    public final class404 method1466() {
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[B[IIIIIIIIIILsf;)I", line = 101)
    private static final int method2721(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class484 arg12) {
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
        arg12.field6659 += (var19 - arg4) * arg12.field6645;
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
        arg12.field6654 = var15 >> 2;
        arg12.field6648 = var16 >> 2;
        arg12.field6657 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 156)
    public final synchronized void method2722(int arg0) {
        int var2 = ((class19) super.field5672).field205.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6657 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 166)
    private final synchronized void method2723(int arg0, int arg1) {
        this.field6656 = arg0;
        this.field6647 = arg1;
        this.field6655 = 0;
        this.method2755();
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "()I", line = 172)
    public final synchronized int method2724() {
        return this.field6647 < 0 ? -1 : this.field6647;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "([B[IIIIIIILsf;)I", line = 176)
    private static final int method2725(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class484 arg8) {
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
        arg8.field6657 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I[B[IIIIIIIIIILsf;)I", line = 201)
    private static final int method2726(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class484 arg12) {
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
        arg12.field6659 += (var19 - arg4) * arg12.field6645;
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
        arg12.field6654 = var15 >> 2;
        arg12.field6648 = var16 >> 2;
        arg12.field6657 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)I", line = 256)
    private static final int method2727(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II[B[IIIIIIIILsf;II)I", line = 260)
    private static final int method2728(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class484 arg11, int arg12, int arg13) {
        arg11.field6654 -= arg11.field6651 * arg5;
        arg11.field6648 -= arg11.field6650 * arg5;
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
        arg11.field6654 += arg11.field6651 * arg5;
        arg11.field6648 += arg11.field6650 * arg5;
        arg11.field6659 = arg6;
        arg11.field6657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II[B[IIIIIIIIIILsf;II)I", line = 294)
    private static final int method2729(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class484 arg13, int arg14, int arg15) {
        arg13.field6659 -= arg13.field6645 * arg5;
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
        arg13.field6659 += arg13.field6645 * var22;
        arg13.field6654 = arg6;
        arg13.field6648 = arg7;
        arg13.field6657 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V", line = 336)
    public final synchronized void method2730(boolean arg0) {
        this.field6649 = (this.field6649 >>> 31) + (this.field6649 ^ this.field6649 >> 31);
        if (arg0) {
            this.field6649 = -this.field6649;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 342)
    public final synchronized void method2731(int arg0) {
        if (this.field6649 < 0) {
            this.field6649 = -arg0;
        } else {
            this.field6649 = arg0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 350)
    public final synchronized void method1460(int arg0) {
        if (this.field6655 > 0) {
            if (arg0 >= this.field6655) {
                if (this.field6656 == Integer.MIN_VALUE) {
                    this.field6656 = 0;
                    this.field6659 = this.field6654 = this.field6648 = 0;
                    this.method2340(-51);
                    arg0 = this.field6655;
                }
                this.field6655 = 0;
                this.method2755();
            } else {
                this.field6659 += this.field6645 * arg0;
                this.field6654 += this.field6651 * arg0;
                this.field6648 += this.field6650 * arg0;
                this.field6655 -= arg0;
            }
        }
        class19 var2 = (class19) super.field5672;
        int var3 = this.field6653 << 8;
        int var4 = this.field6658 << 8;
        int var5 = var2.field205.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6652 = 0;
        }
        if (this.field6657 < 0) {
            if (this.field6649 <= 0) {
                this.method2752();
                this.method2340(-108);
                return;
            }
            this.field6657 = 0;
        }
        if (this.field6657 >= var5) {
            if (this.field6649 >= 0) {
                this.method2752();
                this.method2340(-73);
                return;
            }
            this.field6657 = var5 - 1;
        }
        this.field6657 += this.field6649 * arg0;
        if (this.field6652 < 0) {
            if (!this.field6646) {
                if (this.field6649 < 0) {
                    if (this.field6657 < var3) {
                        this.field6657 = var4 - 1 - (var4 - 1 - this.field6657) % var6;
                    }
                } else if (this.field6657 >= var4) {
                    this.field6657 = (this.field6657 - var3) % var6 + var3;
                }
            } else {
                if (this.field6649 < 0) {
                    if (this.field6657 >= var3) {
                        return;
                    }
                    this.field6657 = var3 + var3 - 1 - this.field6657;
                    this.field6649 = -this.field6649;
                }
                while (this.field6657 >= var4) {
                    this.field6657 = var4 + var4 - 1 - this.field6657;
                    this.field6649 = -this.field6649;
                    if (this.field6657 >= var3) {
                        return;
                    }
                    this.field6657 = var3 + var3 - 1 - this.field6657;
                    this.field6649 = -this.field6649;
                }
            }
        } else {
            if (this.field6652 > 0) {
                if (this.field6646) {
                    label125: {
                        if (this.field6649 < 0) {
                            if (this.field6657 >= var3) {
                                return;
                            }
                            this.field6657 = var3 + var3 - 1 - this.field6657;
                            this.field6649 = -this.field6649;
                            if (--this.field6652 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6657 < var4) {
                                return;
                            }
                            this.field6657 = var4 + var4 - 1 - this.field6657;
                            this.field6649 = -this.field6649;
                            if (--this.field6652 == 0) {
                                break;
                            }
                            if (this.field6657 >= var3) {
                                return;
                            }
                            this.field6657 = var3 + var3 - 1 - this.field6657;
                            this.field6649 = -this.field6649;
                        } while (--this.field6652 != 0);
                    }
                } else if (this.field6649 < 0) {
                    if (this.field6657 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6657) / var6;
                    if (var7 < this.field6652) {
                        this.field6657 += var6 * var7;
                        this.field6652 -= var7;
                        return;
                    }
                    this.field6657 += this.field6652 * var6;
                    this.field6652 = 0;
                } else {
                    if (this.field6657 < var4) {
                        return;
                    }
                    int var8 = (this.field6657 - var3) / var6;
                    if (var8 < this.field6652) {
                        this.field6657 -= var6 * var8;
                        this.field6652 -= var8;
                        return;
                    }
                    this.field6657 -= this.field6652 * var6;
                    this.field6652 = 0;
                }
            }
            if (this.field6649 < 0) {
                if (this.field6657 < 0) {
                    this.field6657 = -1;
                    this.method2752();
                    this.method2340(-127);
                    return;
                }
            } else if (this.field6657 >= var5) {
                this.field6657 = var5;
                this.method2752();
                this.method2340(124);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V", line = 568)
    public final synchronized void method2732(int arg0, int arg1) {
        this.method2733(arg0, arg1, this.method2724());
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V", line = 571)
    public final synchronized void method2733(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2723(arg1, arg2);
        } else {
            int var4 = method2727(arg1, arg2);
            int var5 = method2747(arg1, arg2);
            if (this.field6654 == var4 && this.field6648 == var5) {
                this.field6655 = 0;
            } else {
                int var6 = arg1 - this.field6659;
                if (this.field6659 - arg1 > var6) {
                    var6 = this.field6659 - arg1;
                }
                if (var4 - this.field6654 > var6) {
                    var6 = var4 - this.field6654;
                }
                if (this.field6654 - var4 > var6) {
                    var6 = this.field6654 - var4;
                }
                if (var5 - this.field6648 > var6) {
                    var6 = var5 - this.field6648;
                }
                if (this.field6648 - var5 > var6) {
                    var6 = this.field6648 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6655 = arg0;
                this.field6656 = arg1;
                this.field6647 = arg2;
                this.field6645 = (arg1 - this.field6659) / arg0;
                this.field6651 = (var4 - this.field6654) / arg0;
                this.field6650 = (var5 - this.field6648) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II[B[IIIIIIIILsf;II)I", line = 617)
    private static final int method2734(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class484 arg11, int arg12, int arg13) {
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
        arg11.field6657 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([B[IIIIIIIILsf;)I", line = 651)
    private static final int method2735(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class484 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6654 += (var14 - arg3) * arg9.field6651;
        arg9.field6648 += (var14 - arg3) * arg9.field6650;
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
        arg9.field6659 = var12 >> 2;
        arg9.field6657 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V", line = 685)
    private final synchronized void method2736(int arg0) {
        this.method2723(arg0, this.method2724());
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II[B[IIIIIIILsf;II)I", line = 688)
    private static final int method2737(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class484 arg10, int arg11, int arg12) {
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
        arg10.field6657 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "()Z", line = 716)
    private final boolean method2738() {
        int var1 = this.field6656;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2727(var1, this.field6647);
            var2 = method2747(var1, this.field6647);
        }
        if (this.field6659 == var1 && this.field6654 == var3 && this.field6648 == var2) {
            if (this.field6656 == Integer.MIN_VALUE) {
                this.field6656 = 0;
                this.field6659 = this.field6654 = this.field6648 = 0;
                this.method2340(104);
                return true;
            } else {
                this.method2755();
                return false;
            }
        } else {
            if (this.field6659 < var1) {
                this.field6645 = 1;
                this.field6655 = var1 - this.field6659;
            } else if (this.field6659 > var1) {
                this.field6645 = -1;
                this.field6655 = this.field6659 - var1;
            } else {
                this.field6645 = 0;
            }
            if (this.field6654 < var3) {
                this.field6651 = 1;
                if (this.field6655 == 0 || this.field6655 > var3 - this.field6654) {
                    this.field6655 = var3 - this.field6654;
                }
            } else if (this.field6654 > var3) {
                this.field6651 = -1;
                if (this.field6655 == 0 || this.field6655 > this.field6654 - var3) {
                    this.field6655 = this.field6654 - var3;
                }
            } else {
                this.field6651 = 0;
            }
            if (this.field6648 < var2) {
                this.field6650 = 1;
                if (this.field6655 == 0 || this.field6655 > var2 - this.field6648) {
                    this.field6655 = var2 - this.field6648;
                }
            } else if (this.field6648 > var2) {
                this.field6650 = -1;
                if (this.field6655 == 0 || this.field6655 > this.field6648 - var2) {
                    this.field6655 = this.field6648 - var2;
                }
            } else {
                this.field6650 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(II[B[IIIIIIIILsf;II)I", line = 802)
    private static final int method2739(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class484 arg11, int arg12, int arg13) {
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
        arg11.field6657 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[B[IIIIIIIILsf;)I", line = 834)
    private static final int method2740(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class484 arg10) {
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
        arg10.field6657 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()I", line = 874)
    public final int method1465() {
        return this.field6656 == 0 && this.field6655 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I", line = 881)
    public final int method2357() {
        int var1 = this.field6659 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6652 == 0) {
            var2 -= this.field6657 * var2 / (((class19) super.field5672).field205.length << 8);
        } else if (this.field6652 >= 0) {
            var2 -= this.field6653 * var2 / ((class19) super.field5672).field205.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()Ljc;", line = 895)
    public final class404 method1457() {
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([IIIII)I", line = 898)
    private final int method2741(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6655 <= 0) {
                if (this.field6649 == 256 && (this.field6657 & 255) == 0) {
                    if (class506.field6945) {
                        return method2743(0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, 0, arg3, arg2, this);
                    }
                    return method2725(((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, 0, arg3, arg2, this);
                }
                if (class506.field6945) {
                    return method2734(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, 0, arg3, arg2, this, this.field6649, arg4);
                }
                return method2737(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, 0, arg3, arg2, this, this.field6649, arg4);
            }
            int var6 = this.field6655 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6655 += arg1;
            if (this.field6649 == 256 && (this.field6657 & 255) == 0) {
                if (class506.field6945) {
                    arg1 = method2726(0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, this.field6651, this.field6650, 0, var6, arg2, this);
                } else {
                    arg1 = method2735(((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, this.field6645, 0, var6, arg2, this);
                }
            } else if (class506.field6945) {
                arg1 = method2744(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, this.field6651, this.field6650, 0, var6, arg2, this, this.field6649, arg4);
            } else {
                arg1 = method2728(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, this.field6645, 0, var6, arg2, this, this.field6649, arg4);
            }
            this.field6655 -= arg1;
            if (this.field6655 != 0) {
                return arg1;
            }
        } while (!this.method2738());
        return arg3;
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "()Z", line = 953)
    public final boolean method2742() {
        return this.field6657 < 0 || this.field6657 >= ((class19) super.field5672).field205.length << 8;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([III)V", line = 956)
    public final synchronized void method1469(int[] arg0, int arg1, int arg2) {
        if (this.field6656 == 0 && this.field6655 == 0) {
            this.method1460(arg2);
        } else {
            class19 var4 = (class19) super.field5672;
            int var5 = this.field6653 << 8;
            int var6 = this.field6658 << 8;
            int var7 = var4.field205.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6652 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6657 < 0) {
                if (this.field6649 <= 0) {
                    this.method2752();
                    this.method2340(116);
                    return;
                }
                this.field6657 = 0;
            }
            if (this.field6657 >= var7) {
                if (this.field6649 >= 0) {
                    this.method2752();
                    this.method2340(98);
                    return;
                }
                this.field6657 = var7 - 1;
            }
            if (this.field6652 < 0) {
                if (this.field6646) {
                    if (this.field6649 < 0) {
                        var9 = this.method2750(arg0, arg1, var5, var10, var4.field205[this.field6653]);
                        if (this.field6657 >= var5) {
                            return;
                        }
                        this.field6657 = var5 + var5 - 1 - this.field6657;
                        this.field6649 = -this.field6649;
                    }
                    while (true) {
                        int var11 = this.method2741(arg0, var9, var6, var10, var4.field205[this.field6658 - 1]);
                        if (this.field6657 < var6) {
                            return;
                        }
                        this.field6657 = var6 + var6 - 1 - this.field6657;
                        this.field6649 = -this.field6649;
                        var9 = this.method2750(arg0, var11, var5, var10, var4.field205[this.field6653]);
                        if (this.field6657 >= var5) {
                            return;
                        }
                        this.field6657 = var5 + var5 - 1 - this.field6657;
                        this.field6649 = -this.field6649;
                    }
                } else if (this.field6649 < 0) {
                    while (true) {
                        var9 = this.method2750(arg0, var9, var5, var10, var4.field205[this.field6658 - 1]);
                        if (this.field6657 >= var5) {
                            return;
                        }
                        this.field6657 = var6 - 1 - (var6 - 1 - this.field6657) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2741(arg0, var9, var6, var10, var4.field205[this.field6653]);
                        if (this.field6657 < var6) {
                            return;
                        }
                        this.field6657 = (this.field6657 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6652 > 0) {
                    if (this.field6646) {
                        label130: {
                            if (this.field6649 < 0) {
                                var9 = this.method2750(arg0, arg1, var5, var10, var4.field205[this.field6653]);
                                if (this.field6657 >= var5) {
                                    return;
                                }
                                this.field6657 = var5 + var5 - 1 - this.field6657;
                                this.field6649 = -this.field6649;
                                if (--this.field6652 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2741(arg0, var9, var6, var10, var4.field205[this.field6658 - 1]);
                                if (this.field6657 < var6) {
                                    return;
                                }
                                this.field6657 = var6 + var6 - 1 - this.field6657;
                                this.field6649 = -this.field6649;
                                if (--this.field6652 == 0) {
                                    break;
                                }
                                var9 = this.method2750(arg0, var9, var5, var10, var4.field205[this.field6653]);
                                if (this.field6657 >= var5) {
                                    return;
                                }
                                this.field6657 = var5 + var5 - 1 - this.field6657;
                                this.field6649 = -this.field6649;
                            } while (--this.field6652 != 0);
                        }
                    } else if (this.field6649 < 0) {
                        while (true) {
                            var9 = this.method2750(arg0, var9, var5, var10, var4.field205[this.field6658 - 1]);
                            if (this.field6657 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6657) / var8;
                            if (var12 >= this.field6652) {
                                this.field6657 += this.field6652 * var8;
                                this.field6652 = 0;
                                break;
                            }
                            this.field6657 += var8 * var12;
                            this.field6652 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2741(arg0, var9, var6, var10, var4.field205[this.field6653]);
                            if (this.field6657 < var6) {
                                return;
                            }
                            int var13 = (this.field6657 - var5) / var8;
                            if (var13 >= this.field6652) {
                                this.field6657 -= this.field6652 * var8;
                                this.field6652 = 0;
                                break;
                            }
                            this.field6657 -= var8 * var13;
                            this.field6652 -= var13;
                        }
                    }
                }
                if (this.field6649 < 0) {
                    this.method2750(arg0, var9, 0, var10, 0);
                    if (this.field6657 < 0) {
                        this.field6657 = -1;
                        this.method2752();
                        this.method2340(105);
                        return;
                    }
                } else {
                    this.method2741(arg0, var9, var7, var10, 0);
                    if (this.field6657 >= var7) {
                        this.field6657 = var7;
                        this.method2752();
                        this.method2340(108);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I[B[IIIIIIIILsf;)I", line = 1192)
    private static final int method2743(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class484 arg10) {
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
        arg10.field6657 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II[B[IIIIIIIIIILsf;II)I", line = 1230)
    private static final int method2744(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class484 arg13, int arg14, int arg15) {
        arg13.field6659 -= arg13.field6645 * arg5;
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
        arg13.field6659 += arg13.field6645 * var22;
        arg13.field6654 = arg6;
        arg13.field6648 = arg7;
        arg13.field6657 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V", line = 1272)
    public final synchronized void method2745(int arg0) {
        if (arg0 == 0) {
            this.method2736(0);
            this.method2340(-45);
        } else if (this.field6654 == 0 && this.field6648 == 0) {
            this.field6655 = 0;
            this.field6656 = 0;
            this.field6659 = 0;
            this.method2340(-48);
        } else {
            int var2 = -this.field6659;
            if (this.field6659 > var2) {
                var2 = this.field6659;
            }
            if (-this.field6654 > var2) {
                var2 = -this.field6654;
            }
            if (this.field6654 > var2) {
                var2 = this.field6654;
            }
            if (-this.field6648 > var2) {
                var2 = -this.field6648;
            }
            if (this.field6648 > var2) {
                var2 = this.field6648;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6655 = arg0;
            this.field6656 = Integer.MIN_VALUE;
            this.field6645 = -this.field6659 / arg0;
            this.field6651 = -this.field6654 / arg0;
            this.field6650 = -this.field6648 / arg0;
        }
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V", line = 1317)
    public final synchronized void method2746(int arg0) {
        this.method2723(this.method2719(), arg0);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(II)I", line = 1321)
    private static final int method2747(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "()I", line = 1330)
    public final synchronized int method2748() {
        return this.field6649 < 0 ? -this.field6649 : this.field6649;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "([B[IIIIIIIILsf;)I", line = 1334)
    private static final int method2749(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class484 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6654 += (var14 - arg3) * arg9.field6651;
        arg9.field6648 += (var14 - arg3) * arg9.field6650;
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
        arg9.field6659 = var12 >> 2;
        arg9.field6657 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "([IIIII)I", line = 1369)
    private final int method2750(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6655 <= 0) {
                if (this.field6649 == -256 && (this.field6657 & 255) == 0) {
                    if (class506.field6945) {
                        return method2740(0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, 0, arg3, arg2, this);
                    }
                    return method2717(((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, 0, arg3, arg2, this);
                }
                if (class506.field6945) {
                    return method2739(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, 0, arg3, arg2, this, this.field6649, arg4);
                }
                return method2720(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, 0, arg3, arg2, this, this.field6649, arg4);
            }
            int var6 = this.field6655 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6655 += arg1;
            if (this.field6649 == -256 && (this.field6657 & 255) == 0) {
                if (class506.field6945) {
                    arg1 = method2721(0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, this.field6651, this.field6650, 0, var6, arg2, this);
                } else {
                    arg1 = method2749(((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, this.field6645, 0, var6, arg2, this);
                }
            } else if (class506.field6945) {
                arg1 = method2729(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6654, this.field6648, this.field6651, this.field6650, 0, var6, arg2, this, this.field6649, arg4);
            } else {
                arg1 = method2716(0, 0, ((class19) super.field5672).field205, arg0, this.field6657, arg1, this.field6659, this.field6645, 0, var6, arg2, this, this.field6649, arg4);
            }
            this.field6655 -= arg1;
            if (this.field6655 != 0) {
                return arg1;
            }
        } while (!this.method2738());
        return arg3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lbu;III)Lsf;", line = 1424)
    public static final class484 method2751(class19 arg0, int arg1, int arg2, int arg3) {
        return arg0.field205 != null && arg0.field205.length != 0 ? new class484(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "()V", line = 1430)
    private final void method2752() {
        if (this.field6655 != 0) {
            if (this.field6656 == Integer.MIN_VALUE) {
                this.field6656 = 0;
            }
            this.field6655 = 0;
            this.method2755();
        }
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V", line = 1442)
    public final synchronized void method2753(int arg0) {
        this.method2723(arg0 << 6, this.method2724());
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "(I)V", line = 1446)
    public final synchronized void method2754(int arg0) {
        this.field6652 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "()V", line = 1452)
    private final void method2755() {
        this.field6659 = this.field6656;
        this.field6654 = method2727(this.field6656, this.field6647);
        this.field6648 = method2747(this.field6656, this.field6647);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lbu;III)V", line = 1456)
    private class484(class19 arg0, int arg1, int arg2, int arg3) {
        super.field5672 = arg0;
        this.field6653 = arg0.field201;
        this.field6658 = arg0.field204;
        this.field6646 = arg0.field203;
        this.field6649 = arg1;
        this.field6656 = arg2;
        this.field6647 = arg3;
        this.field6657 = 0;
        this.method2755();
    }
}
