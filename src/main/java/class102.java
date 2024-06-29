import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class49 {

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    private int field2570;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    private int field2567;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Z")
    private boolean field2569;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    private int field2561;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B[IIIIIIIILoe;)I", line = 3)
    private static final int method876(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class102 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2568 += (var14 - arg3) * arg9.field2558;
        arg9.field2571 += (var14 - arg3) * arg9.field2559;
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
        arg9.field2565 = var12 >> 2;
        arg9.field2564 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V", line = 40)
    public final synchronized void method877(int arg0) {
        this.field2560 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B[IIIIIIIILoe;)I", line = 43)
    private static final int method878(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10) {
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
        arg10.field2564 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()Lh;", line = 83)
    public final class49 method159() {
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[IIIIIIIIIILoe;II)I", line = 87)
    private static final int method879(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class102 arg13, int arg14, int arg15) {
        arg13.field2565 -= arg13.field2562 * arg5;
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
        arg13.field2565 += arg13.field2562 * var22;
        arg13.field2568 = arg6;
        arg13.field2571 = arg7;
        arg13.field2564 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 130)
    private static final int method880(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
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
        arg11.field2564 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()Lh;", line = 163)
    public final class49 method171() {
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()I", line = 166)
    public final synchronized int method881() {
        return this.field2566 < 0 ? -this.field2566 : this.field2566;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 170)
    public final synchronized void method882(int arg0) {
        int var2 = ((class105) super.field1247).field2642.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2564 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()I", line = 182)
    public final synchronized int method883() {
        return this.field2561 < 0 ? -1 : this.field2561;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I", line = 186)
    private static final int method884(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpa;III)Loe;", line = 190)
    public static final class102 method885(class105 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2642 != null && arg0.field2642.length != 0 ? new class102(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 196)
    public final synchronized void method886(int arg0) {
        if (arg0 == 0) {
            this.method890(0);
            this.method1170(8);
        } else if (this.field2568 == 0 && this.field2571 == 0) {
            this.field2563 = 0;
            this.field2557 = 0;
            this.field2565 = 0;
            this.method1170(82);
        } else {
            int var2 = -this.field2565;
            if (this.field2565 > var2) {
                var2 = this.field2565;
            }
            if (-this.field2568 > var2) {
                var2 = -this.field2568;
            }
            if (this.field2568 > var2) {
                var2 = this.field2568;
            }
            if (-this.field2571 > var2) {
                var2 = -this.field2571;
            }
            if (this.field2571 > var2) {
                var2 = this.field2571;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2563 = arg0;
            this.field2557 = Integer.MIN_VALUE;
            this.field2562 = -this.field2565 / arg0;
            this.field2558 = -this.field2568 / arg0;
            this.field2559 = -this.field2571 / arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II[B[IIIIIIIIIILoe;II)I", line = 244)
    private static final int method887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class102 arg13, int arg14, int arg15) {
        arg13.field2565 -= arg13.field2562 * arg5;
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
        arg13.field2565 += arg13.field2562 * var22;
        arg13.field2568 = arg6;
        arg13.field2571 = arg7;
        arg13.field2564 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V", line = 286)
    public final synchronized void method888(int arg0, int arg1) {
        this.method897(arg0, arg1, this.method883());
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V", line = 289)
    public final synchronized void method889(int arg0) {
        this.method891(arg0 << 6, this.method883());
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V", line = 292)
    private final synchronized void method890(int arg0) {
        this.method891(arg0, this.method883());
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)V", line = 295)
    public final synchronized void method193(int[] arg0, int arg1, int arg2) {
        if (this.field2557 == 0 && this.field2563 == 0) {
            this.method163(arg2);
        } else {
            class105 var4 = (class105) super.field1247;
            int var5 = this.field2570 << 8;
            int var6 = this.field2567 << 8;
            int var7 = var4.field2642.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2560 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2564 < 0) {
                if (this.field2566 <= 0) {
                    this.method914();
                    this.method1170(61);
                    return;
                }
                this.field2564 = 0;
            }
            if (this.field2564 >= var7) {
                if (this.field2566 >= 0) {
                    this.method914();
                    this.method1170(113);
                    return;
                }
                this.field2564 = var7 - 1;
            }
            if (this.field2560 < 0) {
                if (this.field2569) {
                    if (this.field2566 < 0) {
                        var9 = this.method903(arg0, arg1, var5, var10, var4.field2642[this.field2570]);
                        if (this.field2564 >= var5) {
                            return;
                        }
                        this.field2564 = var5 + var5 - 1 - this.field2564;
                        this.field2566 = -this.field2566;
                    }
                    while (true) {
                        int var11 = this.method913(arg0, var9, var6, var10, var4.field2642[this.field2567 - 1]);
                        if (this.field2564 < var6) {
                            return;
                        }
                        this.field2564 = var6 + var6 - 1 - this.field2564;
                        this.field2566 = -this.field2566;
                        var9 = this.method903(arg0, var11, var5, var10, var4.field2642[this.field2570]);
                        if (this.field2564 >= var5) {
                            return;
                        }
                        this.field2564 = var5 + var5 - 1 - this.field2564;
                        this.field2566 = -this.field2566;
                    }
                } else if (this.field2566 < 0) {
                    while (true) {
                        var9 = this.method903(arg0, var9, var5, var10, var4.field2642[this.field2567 - 1]);
                        if (this.field2564 >= var5) {
                            return;
                        }
                        this.field2564 = var6 - 1 - (var6 - 1 - this.field2564) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method913(arg0, var9, var6, var10, var4.field2642[this.field2570]);
                        if (this.field2564 < var6) {
                            return;
                        }
                        this.field2564 = (this.field2564 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2560 > 0) {
                    if (this.field2569) {
                        label130: {
                            if (this.field2566 < 0) {
                                var9 = this.method903(arg0, arg1, var5, var10, var4.field2642[this.field2570]);
                                if (this.field2564 >= var5) {
                                    return;
                                }
                                this.field2564 = var5 + var5 - 1 - this.field2564;
                                this.field2566 = -this.field2566;
                                if (--this.field2560 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method913(arg0, var9, var6, var10, var4.field2642[this.field2567 - 1]);
                                if (this.field2564 < var6) {
                                    return;
                                }
                                this.field2564 = var6 + var6 - 1 - this.field2564;
                                this.field2566 = -this.field2566;
                                if (--this.field2560 == 0) {
                                    break;
                                }
                                var9 = this.method903(arg0, var9, var5, var10, var4.field2642[this.field2570]);
                                if (this.field2564 >= var5) {
                                    return;
                                }
                                this.field2564 = var5 + var5 - 1 - this.field2564;
                                this.field2566 = -this.field2566;
                            } while (--this.field2560 != 0);
                        }
                    } else if (this.field2566 < 0) {
                        while (true) {
                            var9 = this.method903(arg0, var9, var5, var10, var4.field2642[this.field2567 - 1]);
                            if (this.field2564 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2564) / var8;
                            if (var12 >= this.field2560) {
                                this.field2564 += this.field2560 * var8;
                                this.field2560 = 0;
                                break;
                            }
                            this.field2564 += var8 * var12;
                            this.field2560 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method913(arg0, var9, var6, var10, var4.field2642[this.field2570]);
                            if (this.field2564 < var6) {
                                return;
                            }
                            int var13 = (this.field2564 - var5) / var8;
                            if (var13 >= this.field2560) {
                                this.field2564 -= this.field2560 * var8;
                                this.field2560 = 0;
                                break;
                            }
                            this.field2564 -= var8 * var13;
                            this.field2560 -= var13;
                        }
                    }
                }
                if (this.field2566 < 0) {
                    this.method903(arg0, var9, 0, var10, 0);
                    if (this.field2564 < 0) {
                        this.field2564 = -1;
                        this.method914();
                        this.method1170(26);
                        return;
                    }
                } else {
                    this.method913(arg0, var9, var7, var10, 0);
                    if (this.field2564 >= var7) {
                        this.field2564 = var7;
                        this.method914();
                        this.method1170(68);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()I", line = 530)
    public final int method164() {
        return this.field2557 == 0 && this.field2563 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V", line = 536)
    private final synchronized void method891(int arg0, int arg1) {
        this.field2557 = arg0;
        this.field2561 = arg1;
        this.field2563 = 0;
        this.method915();
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B[IIIIIIIILoe;)I", line = 544)
    private static final int method892(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class102 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2568 += (var14 - arg3) * arg9.field2558;
        arg9.field2571 += (var14 - arg3) * arg9.field2559;
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
        arg9.field2565 = var12 >> 2;
        arg9.field2564 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B[IIIIIIIIIILoe;)I", line = 579)
    private static final int method893(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class102 arg12) {
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
        arg12.field2565 += (var19 - arg4) * arg12.field2562;
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
        arg12.field2568 = var15 >> 2;
        arg12.field2571 = var16 >> 2;
        arg12.field2564 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "()I", line = 632)
    public final synchronized int method894() {
        return this.field2557 == Integer.MIN_VALUE ? 0 : this.field2557;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 635)
    private static final int method895(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
        arg11.field2568 -= arg11.field2558 * arg5;
        arg11.field2571 -= arg11.field2559 * arg5;
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
        arg11.field2568 += arg11.field2558 * arg5;
        arg11.field2571 += arg11.field2559 * arg5;
        arg11.field2565 = arg6;
        arg11.field2564 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 671)
    private static final int method896(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
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
        arg11.field2564 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 703)
    public final synchronized void method897(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method891(arg1, arg2);
        } else {
            int var4 = method884(arg1, arg2);
            int var5 = method904(arg1, arg2);
            if (this.field2568 == var4 && this.field2571 == var5) {
                this.field2563 = 0;
            } else {
                int var6 = arg1 - this.field2565;
                if (this.field2565 - arg1 > var6) {
                    var6 = this.field2565 - arg1;
                }
                if (var4 - this.field2568 > var6) {
                    var6 = var4 - this.field2568;
                }
                if (this.field2568 - var4 > var6) {
                    var6 = this.field2568 - var4;
                }
                if (var5 - this.field2571 > var6) {
                    var6 = var5 - this.field2571;
                }
                if (this.field2571 - var5 > var6) {
                    var6 = this.field2571 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2563 = arg0;
                this.field2557 = arg1;
                this.field2561 = arg2;
                this.field2562 = (arg1 - this.field2565) / arg0;
                this.field2558 = (var4 - this.field2568) / arg0;
                this.field2559 = (var5 - this.field2571) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[IIIIIIILoe;II)I", line = 750)
    private static final int method898(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10, int arg11, int arg12) {
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
        arg10.field2564 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "()Z", line = 777)
    public final boolean method899() {
        return this.field2564 < 0 || this.field2564 >= ((class105) super.field1247).field2642.length << 8;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 782)
    private static final int method900(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class102 arg11, int arg12, int arg13) {
        arg11.field2568 -= arg11.field2558 * arg5;
        arg11.field2571 -= arg11.field2559 * arg5;
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
        arg11.field2568 += arg11.field2558 * arg5;
        arg11.field2571 += arg11.field2559 * arg5;
        arg11.field2565 = arg6;
        arg11.field2564 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "()Z", line = 815)
    public final boolean method901() {
        return this.field2563 != 0;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I[B[IIIIIIIIIILoe;)I", line = 818)
    private static final int method902(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class102 arg12) {
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
        arg12.field2565 += (var19 - arg4) * arg12.field2562;
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
        arg12.field2568 = var15 >> 2;
        arg12.field2571 = var16 >> 2;
        arg12.field2564 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([IIIII)I", line = 871)
    private final int method903(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2563 <= 0) {
                if (this.field2566 == -256 && (this.field2564 & 255) == 0) {
                    if (class12.field319) {
                        return method911(0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, 0, arg3, arg2, this);
                    }
                    return method908(((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, 0, arg3, arg2, this);
                }
                if (class12.field319) {
                    return method896(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, 0, arg3, arg2, this, this.field2566, arg4);
                }
                return method898(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, 0, arg3, arg2, this, this.field2566, arg4);
            }
            int var6 = this.field2563 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2563 += arg1;
            if (this.field2566 == -256 && (this.field2564 & 255) == 0) {
                if (class12.field319) {
                    arg1 = method893(0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, this.field2558, this.field2559, 0, var6, arg2, this);
                } else {
                    arg1 = method876(((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, this.field2562, 0, var6, arg2, this);
                }
            } else if (class12.field319) {
                arg1 = method879(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, this.field2558, this.field2559, 0, var6, arg2, this, this.field2566, arg4);
            } else {
                arg1 = method900(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, this.field2562, 0, var6, arg2, this, this.field2566, arg4);
            }
            this.field2563 -= arg1;
            if (this.field2563 != 0) {
                return arg1;
            }
        } while (!this.method909());
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 927)
    public final synchronized void method163(int arg0) {
        if (this.field2563 > 0) {
            if (arg0 >= this.field2563) {
                if (this.field2557 == Integer.MIN_VALUE) {
                    this.field2557 = 0;
                    this.field2565 = this.field2568 = this.field2571 = 0;
                    this.method1170(26);
                    arg0 = this.field2563;
                }
                this.field2563 = 0;
                this.method915();
            } else {
                this.field2565 += this.field2562 * arg0;
                this.field2568 += this.field2558 * arg0;
                this.field2571 += this.field2559 * arg0;
                this.field2563 -= arg0;
            }
        }
        class105 var2 = (class105) super.field1247;
        int var3 = this.field2570 << 8;
        int var4 = this.field2567 << 8;
        int var5 = var2.field2642.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2560 = 0;
        }
        if (this.field2564 < 0) {
            if (this.field2566 <= 0) {
                this.method914();
                this.method1170(50);
                return;
            }
            this.field2564 = 0;
        }
        if (this.field2564 >= var5) {
            if (this.field2566 >= 0) {
                this.method914();
                this.method1170(55);
                return;
            }
            this.field2564 = var5 - 1;
        }
        this.field2564 += this.field2566 * arg0;
        if (this.field2560 < 0) {
            if (!this.field2569) {
                if (this.field2566 < 0) {
                    if (this.field2564 < var3) {
                        this.field2564 = var4 - 1 - (var4 - 1 - this.field2564) % var6;
                    }
                } else if (this.field2564 >= var4) {
                    this.field2564 = (this.field2564 - var3) % var6 + var3;
                }
            } else {
                if (this.field2566 < 0) {
                    if (this.field2564 >= var3) {
                        return;
                    }
                    this.field2564 = var3 + var3 - 1 - this.field2564;
                    this.field2566 = -this.field2566;
                }
                while (this.field2564 >= var4) {
                    this.field2564 = var4 + var4 - 1 - this.field2564;
                    this.field2566 = -this.field2566;
                    if (this.field2564 >= var3) {
                        return;
                    }
                    this.field2564 = var3 + var3 - 1 - this.field2564;
                    this.field2566 = -this.field2566;
                }
            }
        } else {
            if (this.field2560 > 0) {
                if (this.field2569) {
                    label125: {
                        if (this.field2566 < 0) {
                            if (this.field2564 >= var3) {
                                return;
                            }
                            this.field2564 = var3 + var3 - 1 - this.field2564;
                            this.field2566 = -this.field2566;
                            if (--this.field2560 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2564 < var4) {
                                return;
                            }
                            this.field2564 = var4 + var4 - 1 - this.field2564;
                            this.field2566 = -this.field2566;
                            if (--this.field2560 == 0) {
                                break;
                            }
                            if (this.field2564 >= var3) {
                                return;
                            }
                            this.field2564 = var3 + var3 - 1 - this.field2564;
                            this.field2566 = -this.field2566;
                        } while (--this.field2560 != 0);
                    }
                } else if (this.field2566 < 0) {
                    if (this.field2564 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2564) / var6;
                    if (var7 < this.field2560) {
                        this.field2564 += var6 * var7;
                        this.field2560 -= var7;
                        return;
                    }
                    this.field2564 += this.field2560 * var6;
                    this.field2560 = 0;
                } else {
                    if (this.field2564 < var4) {
                        return;
                    }
                    int var8 = (this.field2564 - var3) / var6;
                    if (var8 < this.field2560) {
                        this.field2564 -= var6 * var8;
                        this.field2560 -= var8;
                        return;
                    }
                    this.field2564 -= this.field2560 * var6;
                    this.field2560 = 0;
                }
            }
            if (this.field2566 < 0) {
                if (this.field2564 < 0) {
                    this.field2564 = -1;
                    this.method914();
                    this.method1170(127);
                    return;
                }
            } else if (this.field2564 >= var5) {
                this.field2564 = var5;
                this.method914();
                this.method1170(33);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(II)I", line = 1145)
    private static final int method904(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()I", line = 1150)
    public final int method547() {
        int var1 = this.field2565 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2560 == 0) {
            var2 -= this.field2564 * var2 / (((class105) super.field1247).field2642.length << 8);
        } else if (this.field2560 >= 0) {
            var2 -= this.field2570 * var2 / ((class105) super.field1247).field2642.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B[IIIIIIILoe;)I", line = 1162)
    private static final int method905(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class102 arg8) {
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
        arg8.field2564 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 1187)
    public final synchronized void method906(boolean arg0) {
        this.field2566 = (this.field2566 >>> 31) + (this.field2566 ^ this.field2566 >> 31);
        if (arg0) {
            this.field2566 = -this.field2566;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpa;II)Loe;", line = 1193)
    public static final class102 method907(class105 arg0, int arg1, int arg2) {
        return arg0.field2642 != null && arg0.field2642.length != 0 ? new class102(arg0, (int) ((long) arg0.field2643 * 256L * (long) arg1 / (long) (class93.field2181 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B[IIIIIIILoe;)I", line = 1200)
    private static final int method908(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class102 arg8) {
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
        arg8.field2564 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "()Z", line = 1227)
    private final boolean method909() {
        int var1 = this.field2557;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method884(var1, this.field2561);
            var2 = method904(var1, this.field2561);
        }
        if (this.field2565 == var1 && this.field2568 == var3 && this.field2571 == var2) {
            if (this.field2557 == Integer.MIN_VALUE) {
                this.field2557 = 0;
                this.field2565 = this.field2568 = this.field2571 = 0;
                this.method1170(69);
                return true;
            } else {
                this.method915();
                return false;
            }
        } else {
            if (this.field2565 < var1) {
                this.field2562 = 1;
                this.field2563 = var1 - this.field2565;
            } else if (this.field2565 > var1) {
                this.field2562 = -1;
                this.field2563 = this.field2565 - var1;
            } else {
                this.field2562 = 0;
            }
            if (this.field2568 < var3) {
                this.field2558 = 1;
                if (this.field2563 == 0 || this.field2563 > var3 - this.field2568) {
                    this.field2563 = var3 - this.field2568;
                }
            } else if (this.field2568 > var3) {
                this.field2558 = -1;
                if (this.field2563 == 0 || this.field2563 > this.field2568 - var3) {
                    this.field2563 = this.field2568 - var3;
                }
            } else {
                this.field2558 = 0;
            }
            if (this.field2571 < var2) {
                this.field2559 = 1;
                if (this.field2563 == 0 || this.field2563 > var2 - this.field2571) {
                    this.field2563 = var2 - this.field2571;
                }
            } else if (this.field2571 > var2) {
                this.field2559 = -1;
                if (this.field2563 == 0 || this.field2563 > this.field2571 - var2) {
                    this.field2563 = this.field2571 - var2;
                }
            } else {
                this.field2559 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)V", line = 1312)
    public final synchronized void method910(int arg0) {
        if (this.field2566 < 0) {
            this.field2566 = -arg0;
        } else {
            this.field2566 = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I[B[IIIIIIIILoe;)I", line = 1319)
    private static final int method911(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10) {
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
        arg10.field2564 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II[B[IIIIIIILoe;II)I", line = 1357)
    private static final int method912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class102 arg10, int arg11, int arg12) {
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
        arg10.field2564 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([IIIII)I", line = 1384)
    private final int method913(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2563 <= 0) {
                if (this.field2566 == 256 && (this.field2564 & 255) == 0) {
                    if (class12.field319) {
                        return method878(0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, 0, arg3, arg2, this);
                    }
                    return method905(((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, 0, arg3, arg2, this);
                }
                if (class12.field319) {
                    return method880(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, 0, arg3, arg2, this, this.field2566, arg4);
                }
                return method912(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, 0, arg3, arg2, this, this.field2566, arg4);
            }
            int var6 = this.field2563 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2563 += arg1;
            if (this.field2566 == 256 && (this.field2564 & 255) == 0) {
                if (class12.field319) {
                    arg1 = method902(0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, this.field2558, this.field2559, 0, var6, arg2, this);
                } else {
                    arg1 = method892(((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, this.field2562, 0, var6, arg2, this);
                }
            } else if (class12.field319) {
                arg1 = method887(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2568, this.field2571, this.field2558, this.field2559, 0, var6, arg2, this, this.field2566, arg4);
            } else {
                arg1 = method895(0, 0, ((class105) super.field1247).field2642, arg0, this.field2564, arg1, this.field2565, this.field2562, 0, var6, arg2, this, this.field2566, arg4);
            }
            this.field2563 -= arg1;
            if (this.field2563 != 0) {
                return arg1;
            }
        } while (!this.method909());
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "()V", line = 1439)
    private final void method914() {
        if (this.field2563 != 0) {
            if (this.field2557 == Integer.MIN_VALUE) {
                this.field2557 = 0;
            }
            this.field2563 = 0;
            this.method915();
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lpa;II)V", line = 1452)
    private class102(class105 arg0, int arg1, int arg2) {
        super.field1247 = arg0;
        this.field2570 = arg0.field2644;
        this.field2567 = arg0.field2641;
        this.field2569 = arg0.field2640;
        this.field2566 = arg1;
        this.field2557 = arg2;
        this.field2561 = 8192;
        this.field2564 = 0;
        this.method915();
    }

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "()V", line = 1464)
    private final void method915() {
        this.field2565 = this.field2557;
        this.field2568 = method884(this.field2557, this.field2561);
        this.field2571 = method904(this.field2557, this.field2561);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lpa;III)V", line = 1468)
    private class102(class105 arg0, int arg1, int arg2, int arg3) {
        super.field1247 = arg0;
        this.field2570 = arg0.field2644;
        this.field2567 = arg0.field2641;
        this.field2569 = arg0.field2640;
        this.field2566 = arg1;
        this.field2557 = arg2;
        this.field2561 = arg3;
        this.field2564 = 0;
        this.method915();
    }
}
