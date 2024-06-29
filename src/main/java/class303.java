import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class303 extends class213 {

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    private int field4739;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    private int field4751;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "Z")
    private boolean field4737;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    private int field4738;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    private int field4750;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    private int field4743;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    private int field4740;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    private int field4741;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    private int field4742;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    private int field4745;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    private int field4746;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    private int field4748;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    private int field4749;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "()I", line = 5)
    public final int method1870() {
        int var1 = this.field4740 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4744 == 0) {
            var2 -= this.field4743 * var2 / (((class105) super.field3261).field1217.length << 8);
        } else if (this.field4744 >= 0) {
            var2 -= this.field4739 * var2 / ((class105) super.field3261).field1217.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)V", line = 18)
    public final synchronized void method2541(int arg0, int arg1) {
        this.method2572(arg0, arg1, this.method2568());
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([III)V", line = 21)
    public final synchronized void method1156(int[] arg0, int arg1, int arg2) {
        if (this.field4738 == 0 && this.field4748 == 0) {
            this.method1160(arg2);
        } else {
            class105 var4 = (class105) super.field3261;
            int var5 = this.field4739 << 8;
            int var6 = this.field4751 << 8;
            int var7 = var4.field1217.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4744 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4743 < 0) {
                if (this.field4747 <= 0) {
                    this.method2577();
                    this.method1824(1);
                    return;
                }
                this.field4743 = 0;
            }
            if (this.field4743 >= var7) {
                if (this.field4747 >= 0) {
                    this.method2577();
                    this.method1824(1);
                    return;
                }
                this.field4743 = var7 - 1;
            }
            if (this.field4744 < 0) {
                if (this.field4737) {
                    if (this.field4747 < 0) {
                        var9 = this.method2559(arg0, arg1, var5, var10, var4.field1217[this.field4739]);
                        if (this.field4743 >= var5) {
                            return;
                        }
                        this.field4743 = var5 + var5 - 1 - this.field4743;
                        this.field4747 = -this.field4747;
                    }
                    while (true) {
                        int var11 = this.method2566(arg0, var9, var6, var10, var4.field1217[this.field4751 - 1]);
                        if (this.field4743 < var6) {
                            return;
                        }
                        this.field4743 = var6 + var6 - 1 - this.field4743;
                        this.field4747 = -this.field4747;
                        var9 = this.method2559(arg0, var11, var5, var10, var4.field1217[this.field4739]);
                        if (this.field4743 >= var5) {
                            return;
                        }
                        this.field4743 = var5 + var5 - 1 - this.field4743;
                        this.field4747 = -this.field4747;
                    }
                } else if (this.field4747 < 0) {
                    while (true) {
                        var9 = this.method2559(arg0, var9, var5, var10, var4.field1217[this.field4751 - 1]);
                        if (this.field4743 >= var5) {
                            return;
                        }
                        this.field4743 = var6 - 1 - (var6 - 1 - this.field4743) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2566(arg0, var9, var6, var10, var4.field1217[this.field4739]);
                        if (this.field4743 < var6) {
                            return;
                        }
                        this.field4743 = (this.field4743 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4744 > 0) {
                    if (this.field4737) {
                        label130: {
                            if (this.field4747 < 0) {
                                var9 = this.method2559(arg0, arg1, var5, var10, var4.field1217[this.field4739]);
                                if (this.field4743 >= var5) {
                                    return;
                                }
                                this.field4743 = var5 + var5 - 1 - this.field4743;
                                this.field4747 = -this.field4747;
                                if (--this.field4744 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2566(arg0, var9, var6, var10, var4.field1217[this.field4751 - 1]);
                                if (this.field4743 < var6) {
                                    return;
                                }
                                this.field4743 = var6 + var6 - 1 - this.field4743;
                                this.field4747 = -this.field4747;
                                if (--this.field4744 == 0) {
                                    break;
                                }
                                var9 = this.method2559(arg0, var9, var5, var10, var4.field1217[this.field4739]);
                                if (this.field4743 >= var5) {
                                    return;
                                }
                                this.field4743 = var5 + var5 - 1 - this.field4743;
                                this.field4747 = -this.field4747;
                            } while (--this.field4744 != 0);
                        }
                    } else if (this.field4747 < 0) {
                        while (true) {
                            var9 = this.method2559(arg0, var9, var5, var10, var4.field1217[this.field4751 - 1]);
                            if (this.field4743 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4743) / var8;
                            if (var12 >= this.field4744) {
                                this.field4743 += this.field4744 * var8;
                                this.field4744 = 0;
                                break;
                            }
                            this.field4743 += var8 * var12;
                            this.field4744 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2566(arg0, var9, var6, var10, var4.field1217[this.field4739]);
                            if (this.field4743 < var6) {
                                return;
                            }
                            int var13 = (this.field4743 - var5) / var8;
                            if (var13 >= this.field4744) {
                                this.field4743 -= this.field4744 * var8;
                                this.field4744 = 0;
                                break;
                            }
                            this.field4743 -= var8 * var13;
                            this.field4744 -= var13;
                        }
                    }
                }
                if (this.field4747 < 0) {
                    this.method2559(arg0, var9, 0, var10, 0);
                    if (this.field4743 < 0) {
                        this.field4743 = -1;
                        this.method2577();
                        this.method1824(1);
                        return;
                    }
                } else {
                    this.method2566(arg0, var9, var7, var10, 0);
                    if (this.field4743 >= var7) {
                        this.field4743 = var7;
                        this.method2577();
                        this.method1824(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II[B[IIIIIIIILoaa;II)I", line = 256)
    private static final int method2542(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class303 arg11, int arg12, int arg13) {
        arg11.field4742 -= arg11.field4745 * arg5;
        arg11.field4741 -= arg11.field4749 * arg5;
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
        arg11.field4742 += arg11.field4745 * arg5;
        arg11.field4741 += arg11.field4749 * arg5;
        arg11.field4740 = arg6;
        arg11.field4743 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "()Lfq;", line = 289)
    public final class213 method1151() {
        return null;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V", line = 294)
    public final synchronized void method2543(int arg0) {
        int var2 = ((class105) super.field3261).field1217.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4743 = arg0;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)I", line = 304)
    private static final int method2544(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II[B[IIIIIIILoaa;II)I", line = 308)
    private static final int method2545(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class303 arg10, int arg11, int arg12) {
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
        arg10.field4743 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([B[IIIIIIIILoaa;)I", line = 336)
    private static final int method2546(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class303 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4742 += (var14 - arg3) * arg9.field4745;
        arg9.field4741 += (var14 - arg3) * arg9.field4749;
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
        arg9.field4740 = var12 >> 2;
        arg9.field4743 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II[B[IIIIIIIILoaa;II)I", line = 370)
    private static final int method2547(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class303 arg11, int arg12, int arg13) {
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
        arg11.field4743 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V", line = 403)
    public final synchronized void method2548(boolean arg0) {
        this.field4747 = (this.field4747 >>> 31) + (this.field4747 ^ this.field4747 >> 31);
        if (arg0) {
            this.field4747 = -this.field4747;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V", line = 410)
    public final synchronized void method2549(int arg0) {
        this.method2561(arg0 << 6, this.method2568());
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "()I", line = 413)
    public final synchronized int method2550() {
        return this.field4738 == Integer.MIN_VALUE ? 0 : this.field4738;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "()Lfq;", line = 416)
    public final class213 method1158() {
        return null;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I[B[IIIIIIIIIILoaa;)I", line = 419)
    private static final int method2551(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class303 arg12) {
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
        arg12.field4740 += (var19 - arg4) * arg12.field4746;
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
        arg12.field4742 = var15 >> 2;
        arg12.field4741 = var16 >> 2;
        arg12.field4743 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "([B[IIIIIIILoaa;)I", line = 472)
    private static final int method2552(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class303 arg8) {
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
        arg8.field4743 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[B[IIIIIIIILoaa;)I", line = 500)
    private static final int method2553(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class303 arg10) {
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
        arg10.field4743 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([B[IIIIIIILoaa;)I", line = 539)
    private static final int method2554(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class303 arg8) {
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
        arg8.field4743 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)V", line = 564)
    public final synchronized void method2555(int arg0) {
        this.field4744 = arg0;
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "()V", line = 567)
    private final void method2556() {
        this.field4740 = this.field4738;
        this.field4742 = method2544(this.field4738, this.field4750);
        this.field4741 = method2573(this.field4738, this.field4750);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II[B[IIIIIIIIIILoaa;II)I", line = 572)
    private static final int method2557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class303 arg13, int arg14, int arg15) {
        arg13.field4740 -= arg13.field4746 * arg5;
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
        arg13.field4740 += arg13.field4746 * var22;
        arg13.field4742 = arg6;
        arg13.field4741 = arg7;
        arg13.field4743 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I[B[IIIIIIIIIILoaa;)I", line = 614)
    private static final int method2558(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class303 arg12) {
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
        arg12.field4740 += (var19 - arg4) * arg12.field4746;
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
        arg12.field4742 = var15 >> 2;
        arg12.field4741 = var16 >> 2;
        arg12.field4743 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([IIIII)I", line = 669)
    private final int method2559(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4748 <= 0) {
                if (this.field4747 == -256 && (this.field4743 & 255) == 0) {
                    if (class247.field3844) {
                        return method2553(0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, 0, arg3, arg2, this);
                    }
                    return method2554(((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, 0, arg3, arg2, this);
                }
                if (class247.field3844) {
                    return method2574(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, 0, arg3, arg2, this, this.field4747, arg4);
                }
                return method2545(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, 0, arg3, arg2, this, this.field4747, arg4);
            }
            int var6 = this.field4748 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4748 += arg1;
            if (this.field4747 == -256 && (this.field4743 & 255) == 0) {
                if (class247.field3844) {
                    arg1 = method2558(0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, this.field4745, this.field4749, 0, var6, arg2, this);
                } else {
                    arg1 = method2563(((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, this.field4746, 0, var6, arg2, this);
                }
            } else if (class247.field3844) {
                arg1 = method2576(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, this.field4745, this.field4749, 0, var6, arg2, this, this.field4747, arg4);
            } else {
                arg1 = method2542(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, this.field4746, 0, var6, arg2, this, this.field4747, arg4);
            }
            this.field4748 -= arg1;
            if (this.field4748 != 0) {
                return arg1;
            }
        } while (!this.method2567());
        return arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I[B[IIIIIIIILoaa;)I", line = 727)
    private static final int method2560(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class303 arg10) {
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
        arg10.field4743 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II)V", line = 766)
    private final synchronized void method2561(int arg0, int arg1) {
        this.field4738 = arg0;
        this.field4750 = arg1;
        this.field4748 = 0;
        this.method2556();
    }

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "()Z", line = 772)
    public final boolean method2562() {
        return this.field4748 != 0;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "([B[IIIIIIIILoaa;)I", line = 777)
    private static final int method2563(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class303 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4742 += (var14 - arg3) * arg9.field4745;
        arg9.field4741 += (var14 - arg3) * arg9.field4749;
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
        arg9.field4740 = var12 >> 2;
        arg9.field4743 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "()I", line = 811)
    public final synchronized int method2564() {
        return this.field4747 < 0 ? -this.field4747 : this.field4747;
    }

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "(I)V", line = 815)
    public final synchronized void method2565(int arg0) {
        if (arg0 == 0) {
            this.method2571(0);
            this.method1824(1);
        } else if (this.field4742 == 0 && this.field4741 == 0) {
            this.field4748 = 0;
            this.field4738 = 0;
            this.field4740 = 0;
            this.method1824(1);
        } else {
            int var2 = -this.field4740;
            if (this.field4740 > var2) {
                var2 = this.field4740;
            }
            if (-this.field4742 > var2) {
                var2 = -this.field4742;
            }
            if (this.field4742 > var2) {
                var2 = this.field4742;
            }
            if (-this.field4741 > var2) {
                var2 = -this.field4741;
            }
            if (this.field4741 > var2) {
                var2 = this.field4741;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4748 = arg0;
            this.field4738 = Integer.MIN_VALUE;
            this.field4746 = -this.field4740 / arg0;
            this.field4745 = -this.field4742 / arg0;
            this.field4749 = -this.field4741 / arg0;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "([IIIII)I", line = 860)
    private final int method2566(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4748 <= 0) {
                if (this.field4747 == 256 && (this.field4743 & 255) == 0) {
                    if (class247.field3844) {
                        return method2560(0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, 0, arg3, arg2, this);
                    }
                    return method2552(((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, 0, arg3, arg2, this);
                }
                if (class247.field3844) {
                    return method2547(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, 0, arg3, arg2, this, this.field4747, arg4);
                }
                return method2580(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, 0, arg3, arg2, this, this.field4747, arg4);
            }
            int var6 = this.field4748 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4748 += arg1;
            if (this.field4747 == 256 && (this.field4743 & 255) == 0) {
                if (class247.field3844) {
                    arg1 = method2551(0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, this.field4745, this.field4749, 0, var6, arg2, this);
                } else {
                    arg1 = method2546(((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, this.field4746, 0, var6, arg2, this);
                }
            } else if (class247.field3844) {
                arg1 = method2557(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4742, this.field4741, this.field4745, this.field4749, 0, var6, arg2, this, this.field4747, arg4);
            } else {
                arg1 = method2575(0, 0, ((class105) super.field3261).field1217, arg0, this.field4743, arg1, this.field4740, this.field4746, 0, var6, arg2, this, this.field4747, arg4);
            }
            this.field4748 -= arg1;
            if (this.field4748 != 0) {
                return arg1;
            }
        } while (!this.method2567());
        return arg3;
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "()Z", line = 919)
    private final boolean method2567() {
        int var1 = this.field4738;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2544(var1, this.field4750);
            var2 = method2573(var1, this.field4750);
        }
        if (this.field4740 == var1 && this.field4742 == var3 && this.field4741 == var2) {
            if (this.field4738 == Integer.MIN_VALUE) {
                this.field4738 = 0;
                this.field4740 = this.field4742 = this.field4741 = 0;
                this.method1824(1);
                return true;
            } else {
                this.method2556();
                return false;
            }
        } else {
            if (this.field4740 < var1) {
                this.field4746 = 1;
                this.field4748 = var1 - this.field4740;
            } else if (this.field4740 > var1) {
                this.field4746 = -1;
                this.field4748 = this.field4740 - var1;
            } else {
                this.field4746 = 0;
            }
            if (this.field4742 < var3) {
                this.field4745 = 1;
                if (this.field4748 == 0 || this.field4748 > var3 - this.field4742) {
                    this.field4748 = var3 - this.field4742;
                }
            } else if (this.field4742 > var3) {
                this.field4745 = -1;
                if (this.field4748 == 0 || this.field4748 > this.field4742 - var3) {
                    this.field4748 = this.field4742 - var3;
                }
            } else {
                this.field4745 = 0;
            }
            if (this.field4741 < var2) {
                this.field4749 = 1;
                if (this.field4748 == 0 || this.field4748 > var2 - this.field4741) {
                    this.field4748 = var2 - this.field4741;
                }
            } else if (this.field4741 > var2) {
                this.field4749 = -1;
                if (this.field4748 == 0 || this.field4748 > this.field4741 - var2) {
                    this.field4748 = this.field4741 - var2;
                }
            } else {
                this.field4749 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "()I", line = 1004)
    public final synchronized int method2568() {
        return this.field4750 < 0 ? -1 : this.field4750;
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)V", line = 1007)
    public final synchronized void method2569(int arg0) {
        if (this.field4747 < 0) {
            this.field4747 = -arg0;
        } else {
            this.field4747 = arg0;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "()Z", line = 1014)
    public final boolean method2570() {
        return this.field4743 < 0 || this.field4743 >= ((class105) super.field3261).field1217.length << 8;
    }

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "(I)V", line = 1017)
    private final synchronized void method2571(int arg0) {
        this.method2561(arg0, this.method2568());
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V", line = 1020)
    public final synchronized void method1160(int arg0) {
        if (this.field4748 > 0) {
            if (arg0 >= this.field4748) {
                if (this.field4738 == Integer.MIN_VALUE) {
                    this.field4738 = 0;
                    this.field4740 = this.field4742 = this.field4741 = 0;
                    this.method1824(1);
                    arg0 = this.field4748;
                }
                this.field4748 = 0;
                this.method2556();
            } else {
                this.field4740 += this.field4746 * arg0;
                this.field4742 += this.field4745 * arg0;
                this.field4741 += this.field4749 * arg0;
                this.field4748 -= arg0;
            }
        }
        class105 var2 = (class105) super.field3261;
        int var3 = this.field4739 << 8;
        int var4 = this.field4751 << 8;
        int var5 = var2.field1217.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4744 = 0;
        }
        if (this.field4743 < 0) {
            if (this.field4747 <= 0) {
                this.method2577();
                this.method1824(1);
                return;
            }
            this.field4743 = 0;
        }
        if (this.field4743 >= var5) {
            if (this.field4747 >= 0) {
                this.method2577();
                this.method1824(1);
                return;
            }
            this.field4743 = var5 - 1;
        }
        this.field4743 += this.field4747 * arg0;
        if (this.field4744 < 0) {
            if (!this.field4737) {
                if (this.field4747 < 0) {
                    if (this.field4743 < var3) {
                        this.field4743 = var4 - 1 - (var4 - 1 - this.field4743) % var6;
                    }
                } else if (this.field4743 >= var4) {
                    this.field4743 = (this.field4743 - var3) % var6 + var3;
                }
            } else {
                if (this.field4747 < 0) {
                    if (this.field4743 >= var3) {
                        return;
                    }
                    this.field4743 = var3 + var3 - 1 - this.field4743;
                    this.field4747 = -this.field4747;
                }
                while (this.field4743 >= var4) {
                    this.field4743 = var4 + var4 - 1 - this.field4743;
                    this.field4747 = -this.field4747;
                    if (this.field4743 >= var3) {
                        return;
                    }
                    this.field4743 = var3 + var3 - 1 - this.field4743;
                    this.field4747 = -this.field4747;
                }
            }
        } else {
            if (this.field4744 > 0) {
                if (this.field4737) {
                    label125: {
                        if (this.field4747 < 0) {
                            if (this.field4743 >= var3) {
                                return;
                            }
                            this.field4743 = var3 + var3 - 1 - this.field4743;
                            this.field4747 = -this.field4747;
                            if (--this.field4744 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4743 < var4) {
                                return;
                            }
                            this.field4743 = var4 + var4 - 1 - this.field4743;
                            this.field4747 = -this.field4747;
                            if (--this.field4744 == 0) {
                                break;
                            }
                            if (this.field4743 >= var3) {
                                return;
                            }
                            this.field4743 = var3 + var3 - 1 - this.field4743;
                            this.field4747 = -this.field4747;
                        } while (--this.field4744 != 0);
                    }
                } else if (this.field4747 < 0) {
                    if (this.field4743 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4743) / var6;
                    if (var7 < this.field4744) {
                        this.field4743 += var6 * var7;
                        this.field4744 -= var7;
                        return;
                    }
                    this.field4743 += this.field4744 * var6;
                    this.field4744 = 0;
                } else {
                    if (this.field4743 < var4) {
                        return;
                    }
                    int var8 = (this.field4743 - var3) / var6;
                    if (var8 < this.field4744) {
                        this.field4743 -= var6 * var8;
                        this.field4744 -= var8;
                        return;
                    }
                    this.field4743 -= this.field4744 * var6;
                    this.field4744 = 0;
                }
            }
            if (this.field4747 < 0) {
                if (this.field4743 < 0) {
                    this.field4743 = -1;
                    this.method2577();
                    this.method1824(1);
                    return;
                }
            } else if (this.field4743 >= var5) {
                this.field4743 = var5;
                this.method2577();
                this.method1824(1);
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)V", line = 1242)
    public final synchronized void method2572(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2561(arg1, arg2);
        } else {
            int var4 = method2544(arg1, arg2);
            int var5 = method2573(arg1, arg2);
            if (this.field4742 == var4 && this.field4741 == var5) {
                this.field4748 = 0;
            } else {
                int var6 = arg1 - this.field4740;
                if (this.field4740 - arg1 > var6) {
                    var6 = this.field4740 - arg1;
                }
                if (var4 - this.field4742 > var6) {
                    var6 = var4 - this.field4742;
                }
                if (this.field4742 - var4 > var6) {
                    var6 = this.field4742 - var4;
                }
                if (var5 - this.field4741 > var6) {
                    var6 = var5 - this.field4741;
                }
                if (this.field4741 - var5 > var6) {
                    var6 = this.field4741 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4748 = arg0;
                this.field4738 = arg1;
                this.field4750 = arg2;
                this.field4746 = (arg1 - this.field4740) / arg0;
                this.field4745 = (var4 - this.field4742) / arg0;
                this.field4749 = (var5 - this.field4741) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)I", line = 1290)
    private static final int method2573(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(II[B[IIIIIIIILoaa;II)I", line = 1294)
    private static final int method2574(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class303 arg11, int arg12, int arg13) {
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
        arg11.field4743 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II[B[IIIIIIIILoaa;II)I", line = 1327)
    private static final int method2575(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class303 arg11, int arg12, int arg13) {
        arg11.field4742 -= arg11.field4745 * arg5;
        arg11.field4741 -= arg11.field4749 * arg5;
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
        arg11.field4742 += arg11.field4745 * arg5;
        arg11.field4741 += arg11.field4749 * arg5;
        arg11.field4740 = arg6;
        arg11.field4743 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II[B[IIIIIIIIIILoaa;II)I", line = 1360)
    private static final int method2576(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class303 arg13, int arg14, int arg15) {
        arg13.field4740 -= arg13.field4746 * arg5;
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
        arg13.field4740 += arg13.field4746 * var22;
        arg13.field4742 = arg6;
        arg13.field4741 = arg7;
        arg13.field4743 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "()V", line = 1401)
    private final void method2577() {
        if (this.field4748 != 0) {
            if (this.field4738 == Integer.MIN_VALUE) {
                this.field4738 = 0;
            }
            this.field4748 = 0;
            this.method2556();
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lps;III)Loaa;", line = 1412)
    public static final class303 method2578(class105 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1217 != null && arg0.field1217.length != 0 ? new class303(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "(I)V", line = 1418)
    public final synchronized void method2579(int arg0) {
        this.method2561(this.method2550(), arg0);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II[B[IIIIIIILoaa;II)I", line = 1421)
    private static final int method2580(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class303 arg10, int arg11, int arg12) {
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
        arg10.field4743 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "()I", line = 1449)
    public final int method1152() {
        return this.field4738 == 0 && this.field4748 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lps;III)V", line = 1456)
    private class303(class105 arg0, int arg1, int arg2, int arg3) {
        super.field3261 = arg0;
        this.field4739 = arg0.field1214;
        this.field4751 = arg0.field1215;
        this.field4737 = arg0.field1216;
        this.field4747 = arg1;
        this.field4738 = arg2;
        this.field4750 = arg3;
        this.field4743 = 0;
        this.method2556();
    }
}
