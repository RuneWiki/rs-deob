import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class380 extends class345 {

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    private int field5589;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    private int field5584;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Z")
    private boolean field5593;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    private int field5591;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    private int field5590;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    private int field5596;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    private int field5597;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    private int field5585;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    private int field5586;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    private int field5587;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    private int field5588;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    private int field5592;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    private int field5594;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    private int field5595;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    private int field5598;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([B[IIIIIIILgj;)I")
    private static final int method2413(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class380 arg8) {
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
        arg8.field5597 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public final synchronized void method2414(int arg0) {
        if (arg0 == 0) {
            this.method2415(0);
            this.method2290((byte) 98);
        } else if (this.field5594 == 0 && this.field5586 == 0) {
            this.field5595 = 0;
            this.field5590 = 0;
            this.field5585 = 0;
            this.method2290((byte) 98);
        } else {
            int var2 = -this.field5585;
            if (this.field5585 > var2) {
                var2 = this.field5585;
            }
            if (-this.field5594 > var2) {
                var2 = -this.field5594;
            }
            if (this.field5594 > var2) {
                var2 = this.field5594;
            }
            if (-this.field5586 > var2) {
                var2 = -this.field5586;
            }
            if (this.field5586 > var2) {
                var2 = this.field5586;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5595 = arg0;
            this.field5590 = Integer.MIN_VALUE;
            this.field5588 = -this.field5585 / arg0;
            this.field5587 = -this.field5594 / arg0;
            this.field5598 = -this.field5586 / arg0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Lnf;")
    public final class345 method268() {
        return null;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    private final synchronized void method2415(int arg0) {
        this.method2428(arg0, this.method2432());
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
    private final void method2416() {
        this.field5585 = this.field5590;
        this.field5594 = method2425(this.field5590, this.field5596);
        this.field5586 = method2422(this.field5590, this.field5596);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[B[IIIIIIIILgj;II)I")
    private static final int method2417(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
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
        arg11.field5597 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
    public final synchronized void method270(int[] arg0, int arg1, int arg2) {
        if (this.field5590 == 0 && this.field5595 == 0) {
            this.method265(arg2);
        } else {
            class177 var4 = (class177) super.field5072;
            int var5 = this.field5589 << 8;
            int var6 = this.field5584 << 8;
            int var7 = var4.field2456.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5592 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5597 < 0) {
                if (this.field5591 <= 0) {
                    this.method2440();
                    this.method2290((byte) 98);
                    return;
                }
                this.field5597 = 0;
            }
            if (this.field5597 >= var7) {
                if (this.field5591 >= 0) {
                    this.method2440();
                    this.method2290((byte) 98);
                    return;
                }
                this.field5597 = var7 - 1;
            }
            if (this.field5592 < 0) {
                if (this.field5593) {
                    if (this.field5591 < 0) {
                        var9 = this.method2445(arg0, arg1, var5, var10, var4.field2456[this.field5589]);
                        if (this.field5597 >= var5) {
                            return;
                        }
                        this.field5597 = var5 + var5 - 1 - this.field5597;
                        this.field5591 = -this.field5591;
                    }
                    while (true) {
                        int var11 = this.method2447(arg0, var9, var6, var10, var4.field2456[this.field5584 - 1]);
                        if (this.field5597 < var6) {
                            return;
                        }
                        this.field5597 = var6 + var6 - 1 - this.field5597;
                        this.field5591 = -this.field5591;
                        var9 = this.method2445(arg0, var11, var5, var10, var4.field2456[this.field5589]);
                        if (this.field5597 >= var5) {
                            return;
                        }
                        this.field5597 = var5 + var5 - 1 - this.field5597;
                        this.field5591 = -this.field5591;
                    }
                } else if (this.field5591 < 0) {
                    while (true) {
                        var9 = this.method2445(arg0, var9, var5, var10, var4.field2456[this.field5584 - 1]);
                        if (this.field5597 >= var5) {
                            return;
                        }
                        this.field5597 = var6 - 1 - (var6 - 1 - this.field5597) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2447(arg0, var9, var6, var10, var4.field2456[this.field5589]);
                        if (this.field5597 < var6) {
                            return;
                        }
                        this.field5597 = (this.field5597 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5592 > 0) {
                    if (this.field5593) {
                        label130: {
                            if (this.field5591 < 0) {
                                var9 = this.method2445(arg0, arg1, var5, var10, var4.field2456[this.field5589]);
                                if (this.field5597 >= var5) {
                                    return;
                                }
                                this.field5597 = var5 + var5 - 1 - this.field5597;
                                this.field5591 = -this.field5591;
                                if (--this.field5592 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2447(arg0, var9, var6, var10, var4.field2456[this.field5584 - 1]);
                                if (this.field5597 < var6) {
                                    return;
                                }
                                this.field5597 = var6 + var6 - 1 - this.field5597;
                                this.field5591 = -this.field5591;
                                if (--this.field5592 == 0) {
                                    break;
                                }
                                var9 = this.method2445(arg0, var9, var5, var10, var4.field2456[this.field5589]);
                                if (this.field5597 >= var5) {
                                    return;
                                }
                                this.field5597 = var5 + var5 - 1 - this.field5597;
                                this.field5591 = -this.field5591;
                            } while (--this.field5592 != 0);
                        }
                    } else if (this.field5591 < 0) {
                        while (true) {
                            var9 = this.method2445(arg0, var9, var5, var10, var4.field2456[this.field5584 - 1]);
                            if (this.field5597 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5597) / var8;
                            if (var12 >= this.field5592) {
                                this.field5597 += this.field5592 * var8;
                                this.field5592 = 0;
                                break;
                            }
                            this.field5597 += var8 * var12;
                            this.field5592 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2447(arg0, var9, var6, var10, var4.field2456[this.field5589]);
                            if (this.field5597 < var6) {
                                return;
                            }
                            int var13 = (this.field5597 - var5) / var8;
                            if (var13 >= this.field5592) {
                                this.field5597 -= this.field5592 * var8;
                                this.field5592 = 0;
                                break;
                            }
                            this.field5597 -= var8 * var13;
                            this.field5592 -= var13;
                        }
                    }
                }
                if (this.field5591 < 0) {
                    this.method2445(arg0, var9, 0, var10, 0);
                    if (this.field5597 < 0) {
                        this.field5597 = -1;
                        this.method2440();
                        this.method2290((byte) 98);
                        return;
                    }
                } else {
                    this.method2447(arg0, var9, var7, var10, 0);
                    if (this.field5597 >= var7) {
                        this.field5597 = var7;
                        this.method2440();
                        this.method2290((byte) 98);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([B[IIIIIIILgj;)I")
    private static final int method2418(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class380 arg8) {
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
        arg8.field5597 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "()Z")
    public final boolean method2419() {
        return this.field5597 < 0 || this.field5597 >= ((class177) super.field5072).field2456.length << 8;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([B[IIIIIIIILgj;)I")
    private static final int method2420(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class380 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5594 += (var14 - arg3) * arg9.field5587;
        arg9.field5586 += (var14 - arg3) * arg9.field5598;
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
        arg9.field5585 = var12 >> 2;
        arg9.field5597 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    public final synchronized void method2421(int arg0, int arg1) {
        this.method2450(arg0, arg1, this.method2432());
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)I")
    private static final int method2422(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
    public final synchronized void method2423(int arg0) {
        int var2 = ((class177) super.field5072).field2456.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5597 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II[B[IIIIIIIILgj;II)I")
    private static final int method2424(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
        arg11.field5594 -= arg11.field5587 * arg5;
        arg11.field5586 -= arg11.field5598 * arg5;
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
        arg11.field5594 += arg11.field5587 * arg5;
        arg11.field5586 += arg11.field5598 * arg5;
        arg11.field5585 = arg6;
        arg11.field5597 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)I")
    private static final int method2425(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[B[IIIIIIIILgj;)I")
    private static final int method2426(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10) {
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
        arg10.field5597 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I[B[IIIIIIIILgj;)I")
    private static final int method2427(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10) {
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
        arg10.field5597 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)V")
    private final synchronized void method2428(int arg0, int arg1) {
        this.field5590 = arg0;
        this.field5596 = arg1;
        this.field5595 = 0;
        this.method2416();
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II[B[IIIIIIIILgj;II)I")
    private static final int method2429(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
        arg11.field5594 -= arg11.field5587 * arg5;
        arg11.field5586 -= arg11.field5598 * arg5;
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
        arg11.field5594 += arg11.field5587 * arg5;
        arg11.field5586 += arg11.field5598 * arg5;
        arg11.field5585 = arg6;
        arg11.field5597 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfp;III)Lgj;")
    public static final class380 method2430(class177 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2456 != null && arg0.field2456.length != 0 ? new class380(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[B[IIIIIIIIIILgj;II)I")
    private static final int method2431(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class380 arg13, int arg14, int arg15) {
        arg13.field5585 -= arg13.field5588 * arg5;
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
        arg13.field5585 += arg13.field5588 * var22;
        arg13.field5594 = arg6;
        arg13.field5586 = arg7;
        arg13.field5597 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()Lnf;")
    public final class345 method273() {
        return null;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "()I")
    public final synchronized int method2432() {
        return this.field5596 < 0 ? -1 : this.field5596;
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "()I")
    public final synchronized int method2433() {
        return this.field5590 == Integer.MIN_VALUE ? 0 : this.field5590;
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "()Z")
    private final boolean method2434() {
        int var1 = this.field5590;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2425(var1, this.field5596);
            var2 = method2422(var1, this.field5596);
        }
        if (this.field5585 == var1 && this.field5594 == var3 && this.field5586 == var2) {
            if (this.field5590 == Integer.MIN_VALUE) {
                this.field5590 = 0;
                this.field5585 = this.field5594 = this.field5586 = 0;
                this.method2290((byte) 98);
                return true;
            } else {
                this.method2416();
                return false;
            }
        } else {
            if (this.field5585 < var1) {
                this.field5588 = 1;
                this.field5595 = var1 - this.field5585;
            } else if (this.field5585 > var1) {
                this.field5588 = -1;
                this.field5595 = this.field5585 - var1;
            } else {
                this.field5588 = 0;
            }
            if (this.field5594 < var3) {
                this.field5587 = 1;
                if (this.field5595 == 0 || this.field5595 > var3 - this.field5594) {
                    this.field5595 = var3 - this.field5594;
                }
            } else if (this.field5594 > var3) {
                this.field5587 = -1;
                if (this.field5595 == 0 || this.field5595 > this.field5594 - var3) {
                    this.field5595 = this.field5594 - var3;
                }
            } else {
                this.field5587 = 0;
            }
            if (this.field5586 < var2) {
                this.field5598 = 1;
                if (this.field5595 == 0 || this.field5595 > var2 - this.field5586) {
                    this.field5595 = var2 - this.field5586;
                }
            } else if (this.field5586 > var2) {
                this.field5598 = -1;
                if (this.field5595 == 0 || this.field5595 > this.field5586 - var2) {
                    this.field5595 = this.field5586 - var2;
                }
            } else {
                this.field5598 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[B[IIIIIIIIIILgj;)I")
    private static final int method2435(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class380 arg12) {
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
        arg12.field5585 += (var19 - arg4) * arg12.field5588;
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
        arg12.field5594 = var15 >> 2;
        arg12.field5586 = var16 >> 2;
        arg12.field5597 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfp;II)Lgj;")
    public static final class380 method2436(class177 arg0, int arg1, int arg2) {
        return arg0.field2456 != null && arg0.field2456.length != 0 ? new class380(arg0, (int) ((long) arg0.field2455 * 256L * (long) arg1 / (long) (class233.field3158 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public final synchronized void method2437(int arg0) {
        if (this.field5591 < 0) {
            this.field5591 = -arg0;
        } else {
            this.field5591 = arg0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public final synchronized void method2438(boolean arg0) {
        this.field5591 = (this.field5591 >>> 31) + (this.field5591 ^ this.field5591 >> 31);
        if (arg0) {
            this.field5591 = -this.field5591;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I[B[IIIIIIIIIILgj;)I")
    private static final int method2439(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class380 arg12) {
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
        arg12.field5585 += (var19 - arg4) * arg12.field5588;
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
        arg12.field5594 = var15 >> 2;
        arg12.field5586 = var16 >> 2;
        arg12.field5597 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "()V")
    private final void method2440() {
        if (this.field5595 != 0) {
            if (this.field5590 == Integer.MIN_VALUE) {
                this.field5590 = 0;
            }
            this.field5595 = 0;
            this.method2416();
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
    public final int method2208() {
        int var1 = this.field5585 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5592 == 0) {
            var2 -= this.field5597 * var2 / (((class177) super.field5072).field2456.length << 8);
        } else if (this.field5592 >= 0) {
            var2 -= this.field5589 * var2 / ((class177) super.field5072).field2456.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public final int method274() {
        return this.field5590 == 0 && this.field5595 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "()Z")
    public final boolean method2441() {
        return this.field5595 != 0;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public final synchronized void method2442(int arg0) {
        this.field5592 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[B[IIIIIIILgj;II)I")
    private static final int method2443(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10, int arg11, int arg12) {
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
        arg10.field5597 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II[B[IIIIIIILgj;II)I")
    private static final int method2444(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10, int arg11, int arg12) {
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
        arg10.field5597 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IIIII)I")
    private final int method2445(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5595 <= 0) {
                if (this.field5591 == -256 && (this.field5597 & 255) == 0) {
                    if (class134.field1882) {
                        return method2427(0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, 0, arg3, arg2, this);
                    }
                    return method2413(((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, 0, arg3, arg2, this);
                }
                if (class134.field1882) {
                    return method2417(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, 0, arg3, arg2, this, this.field5591, arg4);
                }
                return method2444(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, 0, arg3, arg2, this, this.field5591, arg4);
            }
            int var6 = this.field5595 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5595 += arg1;
            if (this.field5591 == -256 && (this.field5597 & 255) == 0) {
                if (class134.field1882) {
                    arg1 = method2439(0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, this.field5587, this.field5598, 0, var6, arg2, this);
                } else {
                    arg1 = method2420(((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, this.field5588, 0, var6, arg2, this);
                }
            } else if (class134.field1882) {
                arg1 = method2446(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, this.field5587, this.field5598, 0, var6, arg2, this, this.field5591, arg4);
            } else {
                arg1 = method2424(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, this.field5588, 0, var6, arg2, this, this.field5591, arg4);
            }
            this.field5595 -= arg1;
            if (this.field5595 != 0) {
                return arg1;
            }
        } while (!this.method2434());
        return arg3;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final synchronized void method265(int arg0) {
        if (this.field5595 > 0) {
            if (arg0 >= this.field5595) {
                if (this.field5590 == Integer.MIN_VALUE) {
                    this.field5590 = 0;
                    this.field5585 = this.field5594 = this.field5586 = 0;
                    this.method2290((byte) 98);
                    arg0 = this.field5595;
                }
                this.field5595 = 0;
                this.method2416();
            } else {
                this.field5585 += this.field5588 * arg0;
                this.field5594 += this.field5587 * arg0;
                this.field5586 += this.field5598 * arg0;
                this.field5595 -= arg0;
            }
        }
        class177 var2 = (class177) super.field5072;
        int var3 = this.field5589 << 8;
        int var4 = this.field5584 << 8;
        int var5 = var2.field2456.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5592 = 0;
        }
        if (this.field5597 < 0) {
            if (this.field5591 <= 0) {
                this.method2440();
                this.method2290((byte) 98);
                return;
            }
            this.field5597 = 0;
        }
        if (this.field5597 >= var5) {
            if (this.field5591 >= 0) {
                this.method2440();
                this.method2290((byte) 98);
                return;
            }
            this.field5597 = var5 - 1;
        }
        this.field5597 += this.field5591 * arg0;
        if (this.field5592 < 0) {
            if (!this.field5593) {
                if (this.field5591 < 0) {
                    if (this.field5597 < var3) {
                        this.field5597 = var4 - 1 - (var4 - 1 - this.field5597) % var6;
                    }
                } else if (this.field5597 >= var4) {
                    this.field5597 = (this.field5597 - var3) % var6 + var3;
                }
            } else {
                if (this.field5591 < 0) {
                    if (this.field5597 >= var3) {
                        return;
                    }
                    this.field5597 = var3 + var3 - 1 - this.field5597;
                    this.field5591 = -this.field5591;
                }
                while (this.field5597 >= var4) {
                    this.field5597 = var4 + var4 - 1 - this.field5597;
                    this.field5591 = -this.field5591;
                    if (this.field5597 >= var3) {
                        return;
                    }
                    this.field5597 = var3 + var3 - 1 - this.field5597;
                    this.field5591 = -this.field5591;
                }
            }
        } else {
            if (this.field5592 > 0) {
                if (this.field5593) {
                    label125: {
                        if (this.field5591 < 0) {
                            if (this.field5597 >= var3) {
                                return;
                            }
                            this.field5597 = var3 + var3 - 1 - this.field5597;
                            this.field5591 = -this.field5591;
                            if (--this.field5592 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5597 < var4) {
                                return;
                            }
                            this.field5597 = var4 + var4 - 1 - this.field5597;
                            this.field5591 = -this.field5591;
                            if (--this.field5592 == 0) {
                                break;
                            }
                            if (this.field5597 >= var3) {
                                return;
                            }
                            this.field5597 = var3 + var3 - 1 - this.field5597;
                            this.field5591 = -this.field5591;
                        } while (--this.field5592 != 0);
                    }
                } else if (this.field5591 < 0) {
                    if (this.field5597 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5597) / var6;
                    if (var7 < this.field5592) {
                        this.field5597 += var6 * var7;
                        this.field5592 -= var7;
                        return;
                    }
                    this.field5597 += this.field5592 * var6;
                    this.field5592 = 0;
                } else {
                    if (this.field5597 < var4) {
                        return;
                    }
                    int var8 = (this.field5597 - var3) / var6;
                    if (var8 < this.field5592) {
                        this.field5597 -= var6 * var8;
                        this.field5592 -= var8;
                        return;
                    }
                    this.field5597 -= this.field5592 * var6;
                    this.field5592 = 0;
                }
            }
            if (this.field5591 < 0) {
                if (this.field5597 < 0) {
                    this.field5597 = -1;
                    this.method2440();
                    this.method2290((byte) 98);
                    return;
                }
            } else if (this.field5597 >= var5) {
                this.field5597 = var5;
                this.method2440();
                this.method2290((byte) 98);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II[B[IIIIIIIIIILgj;II)I")
    private static final int method2446(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class380 arg13, int arg14, int arg15) {
        arg13.field5585 -= arg13.field5588 * arg5;
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
        arg13.field5585 += arg13.field5588 * var22;
        arg13.field5594 = arg6;
        arg13.field5586 = arg7;
        arg13.field5597 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([IIIII)I")
    private final int method2447(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5595 <= 0) {
                if (this.field5591 == 256 && (this.field5597 & 255) == 0) {
                    if (class134.field1882) {
                        return method2426(0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, 0, arg3, arg2, this);
                    }
                    return method2418(((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, 0, arg3, arg2, this);
                }
                if (class134.field1882) {
                    return method2452(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, 0, arg3, arg2, this, this.field5591, arg4);
                }
                return method2443(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, 0, arg3, arg2, this, this.field5591, arg4);
            }
            int var6 = this.field5595 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5595 += arg1;
            if (this.field5591 == 256 && (this.field5597 & 255) == 0) {
                if (class134.field1882) {
                    arg1 = method2435(0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, this.field5587, this.field5598, 0, var6, arg2, this);
                } else {
                    arg1 = method2448(((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, this.field5588, 0, var6, arg2, this);
                }
            } else if (class134.field1882) {
                arg1 = method2431(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5594, this.field5586, this.field5587, this.field5598, 0, var6, arg2, this, this.field5591, arg4);
            } else {
                arg1 = method2429(0, 0, ((class177) super.field5072).field2456, arg0, this.field5597, arg1, this.field5585, this.field5588, 0, var6, arg2, this, this.field5591, arg4);
            }
            this.field5595 -= arg1;
            if (this.field5595 != 0) {
                return arg1;
            }
        } while (!this.method2434());
        return arg3;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([B[IIIIIIIILgj;)I")
    private static final int method2448(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class380 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5594 += (var14 - arg3) * arg9.field5587;
        arg9.field5586 += (var14 - arg3) * arg9.field5598;
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
        arg9.field5585 = var12 >> 2;
        arg9.field5597 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "()I")
    public final synchronized int method2449() {
        return this.field5591 < 0 ? -this.field5591 : this.field5591;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public final synchronized void method2450(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2428(arg1, arg2);
        } else {
            int var4 = method2425(arg1, arg2);
            int var5 = method2422(arg1, arg2);
            if (this.field5594 == var4 && this.field5586 == var5) {
                this.field5595 = 0;
            } else {
                int var6 = arg1 - this.field5585;
                if (this.field5585 - arg1 > var6) {
                    var6 = this.field5585 - arg1;
                }
                if (var4 - this.field5594 > var6) {
                    var6 = var4 - this.field5594;
                }
                if (this.field5594 - var4 > var6) {
                    var6 = this.field5594 - var4;
                }
                if (var5 - this.field5586 > var6) {
                    var6 = var5 - this.field5586;
                }
                if (this.field5586 - var5 > var6) {
                    var6 = this.field5586 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5595 = arg0;
                this.field5590 = arg1;
                this.field5596 = arg2;
                this.field5588 = (arg1 - this.field5585) / arg0;
                this.field5587 = (var4 - this.field5594) / arg0;
                this.field5598 = (var5 - this.field5586) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V")
    public final synchronized void method2451(int arg0) {
        this.method2428(arg0 << 6, this.method2432());
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lfp;II)V")
    private class380(class177 arg0, int arg1, int arg2) {
        super.field5072 = arg0;
        this.field5589 = arg0.field2454;
        this.field5584 = arg0.field2453;
        this.field5593 = arg0.field2452;
        this.field5591 = arg1;
        this.field5590 = arg2;
        this.field5596 = 8192;
        this.field5597 = 0;
        this.method2416();
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lfp;III)V")
    private class380(class177 arg0, int arg1, int arg2, int arg3) {
        super.field5072 = arg0;
        this.field5589 = arg0.field2454;
        this.field5584 = arg0.field2453;
        this.field5593 = arg0.field2452;
        this.field5591 = arg1;
        this.field5590 = arg2;
        this.field5596 = arg3;
        this.field5597 = 0;
        this.method2416();
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(II[B[IIIIIIIILgj;II)I")
    private static final int method2452(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
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
        arg11.field5597 = arg4;
        return var15 >> 1;
    }
}
