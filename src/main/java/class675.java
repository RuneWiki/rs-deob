import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class675 extends class515 {

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    private int field9583;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "I")
    private int field9572;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "Z")
    private boolean field9584;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    private int field9578;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    private int field9573;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    private int field9577;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    private int field9571;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    private int field9570;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    private int field9574;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    private int field9575;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    private int field9576;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    private int field9579;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    private int field9580;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    private int field9581;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    private int field9582;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II[B[IIIIIIIILit;II)I")
    private static final int method4881(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class675 arg11, int arg12, int arg13) {
        arg11.field9579 -= arg11.field9580 * arg5;
        arg11.field9576 -= arg11.field9581 * arg5;
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
        arg11.field9579 += arg11.field9580 * arg5;
        arg11.field9576 += arg11.field9581 * arg5;
        arg11.field9575 = arg6;
        arg11.field9571 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()I")
    public final int method3862() {
        int var1 = this.field9575 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field9570 == 0) {
            var2 -= this.field9571 * var2 / (((class357) super.field7605).field5739.length << 8);
        } else if (this.field9570 >= 0) {
            var2 -= this.field9583 * var2 / ((class357) super.field7605).field5739.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(II[B[IIIIIIIILit;II)I")
    private static final int method4882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class675 arg11, int arg12, int arg13) {
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
        arg11.field9571 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(II)V")
    public final synchronized void method4883(int arg0, int arg1) {
        this.method4905(arg0, arg1, this.method4895());
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II)I")
    private static final int method4884(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(II)V")
    private final synchronized void method4885(int arg0, int arg1) {
        this.field9573 = arg0;
        this.field9577 = arg1;
        this.field9574 = 0;
        this.method4912();
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I[B[IIIIIIIIIILit;)I")
    private static final int method4886(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class675 arg12) {
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
        arg12.field9575 += (var19 - arg4) * arg12.field9582;
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
        arg12.field9579 = var15 >> 2;
        arg12.field9576 = var16 >> 2;
        arg12.field9571 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II[B[IIIIIIILit;II)I")
    private static final int method4887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class675 arg10, int arg11, int arg12) {
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
        arg10.field9571 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I[B[IIIIIIIILit;)I")
    private static final int method4888(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class675 arg10) {
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
        arg10.field9571 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II[B[IIIIIIIIIILit;II)I")
    private static final int method4889(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class675 arg13, int arg14, int arg15) {
        arg13.field9575 -= arg13.field9582 * arg5;
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
        arg13.field9575 += arg13.field9582 * var22;
        arg13.field9579 = arg6;
        arg13.field9576 = arg7;
        arg13.field9571 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!it", name = "j", descriptor = "()Z")
    public final boolean method4890() {
        return this.field9574 != 0;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(II)I")
    private static final int method4891(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "([III)V")
    public final synchronized void method1097(int[] arg0, int arg1, int arg2) {
        if (this.field9573 == 0 && this.field9574 == 0) {
            this.method1116(arg2);
        } else {
            class357 var4 = (class357) super.field7605;
            int var5 = this.field9583 << 8;
            int var6 = this.field9572 << 8;
            int var7 = var4.field5739.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field9570 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field9571 < 0) {
                if (this.field9578 <= 0) {
                    this.method4903();
                    this.method4173(-1);
                    return;
                }
                this.field9571 = 0;
            }
            if (this.field9571 >= var7) {
                if (this.field9578 >= 0) {
                    this.method4903();
                    this.method4173(-1);
                    return;
                }
                this.field9571 = var7 - 1;
            }
            if (this.field9570 < 0) {
                if (this.field9584) {
                    if (this.field9578 < 0) {
                        var9 = this.method4911(arg0, arg1, var5, var10, var4.field5739[this.field9583]);
                        if (this.field9571 >= var5) {
                            return;
                        }
                        this.field9571 = var5 + var5 - 1 - this.field9571;
                        this.field9578 = -this.field9578;
                    }
                    while (true) {
                        int var11 = this.method4907(arg0, var9, var6, var10, var4.field5739[this.field9572 - 1]);
                        if (this.field9571 < var6) {
                            return;
                        }
                        this.field9571 = var6 + var6 - 1 - this.field9571;
                        this.field9578 = -this.field9578;
                        var9 = this.method4911(arg0, var11, var5, var10, var4.field5739[this.field9583]);
                        if (this.field9571 >= var5) {
                            return;
                        }
                        this.field9571 = var5 + var5 - 1 - this.field9571;
                        this.field9578 = -this.field9578;
                    }
                } else if (this.field9578 < 0) {
                    while (true) {
                        var9 = this.method4911(arg0, var9, var5, var10, var4.field5739[this.field9572 - 1]);
                        if (this.field9571 >= var5) {
                            return;
                        }
                        this.field9571 = var6 - 1 - (var6 - 1 - this.field9571) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method4907(arg0, var9, var6, var10, var4.field5739[this.field9583]);
                        if (this.field9571 < var6) {
                            return;
                        }
                        this.field9571 = (this.field9571 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field9570 > 0) {
                    if (this.field9584) {
                        label130: {
                            if (this.field9578 < 0) {
                                var9 = this.method4911(arg0, arg1, var5, var10, var4.field5739[this.field9583]);
                                if (this.field9571 >= var5) {
                                    return;
                                }
                                this.field9571 = var5 + var5 - 1 - this.field9571;
                                this.field9578 = -this.field9578;
                                if (--this.field9570 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method4907(arg0, var9, var6, var10, var4.field5739[this.field9572 - 1]);
                                if (this.field9571 < var6) {
                                    return;
                                }
                                this.field9571 = var6 + var6 - 1 - this.field9571;
                                this.field9578 = -this.field9578;
                                if (--this.field9570 == 0) {
                                    break;
                                }
                                var9 = this.method4911(arg0, var9, var5, var10, var4.field5739[this.field9583]);
                                if (this.field9571 >= var5) {
                                    return;
                                }
                                this.field9571 = var5 + var5 - 1 - this.field9571;
                                this.field9578 = -this.field9578;
                            } while (--this.field9570 != 0);
                        }
                    } else if (this.field9578 < 0) {
                        while (true) {
                            var9 = this.method4911(arg0, var9, var5, var10, var4.field5739[this.field9572 - 1]);
                            if (this.field9571 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field9571) / var8;
                            if (var12 >= this.field9570) {
                                this.field9571 += this.field9570 * var8;
                                this.field9570 = 0;
                                break;
                            }
                            this.field9571 += var8 * var12;
                            this.field9570 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method4907(arg0, var9, var6, var10, var4.field5739[this.field9583]);
                            if (this.field9571 < var6) {
                                return;
                            }
                            int var13 = (this.field9571 - var5) / var8;
                            if (var13 >= this.field9570) {
                                this.field9571 -= this.field9570 * var8;
                                this.field9570 = 0;
                                break;
                            }
                            this.field9571 -= var8 * var13;
                            this.field9570 -= var13;
                        }
                    }
                }
                if (this.field9578 < 0) {
                    this.method4911(arg0, var9, 0, var10, 0);
                    if (this.field9571 < 0) {
                        this.field9571 = -1;
                        this.method4903();
                        this.method4173(-1);
                        return;
                    }
                } else {
                    this.method4907(arg0, var9, var7, var10, 0);
                    if (this.field9571 >= var7) {
                        this.field9571 = var7;
                        this.method4903();
                        this.method4173(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I[B[IIIIIIIILit;)I")
    private static final int method4892(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class675 arg10) {
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
        arg10.field9571 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "([B[IIIIIIILit;)I")
    private static final int method4893(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class675 arg8) {
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
        arg8.field9571 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!it", name = "k", descriptor = "()I")
    public final synchronized int method4894() {
        return this.field9578 < 0 ? -this.field9578 : this.field9578;
    }

    @OriginalMember(owner = "client!it", name = "i", descriptor = "()I")
    public final synchronized int method4895() {
        return this.field9577 < 0 ? -1 : this.field9577;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
    public final synchronized void method4896(int arg0) {
        if (arg0 == 0) {
            this.method4917(0);
            this.method4173(-1);
        } else if (this.field9579 == 0 && this.field9576 == 0) {
            this.field9574 = 0;
            this.field9573 = 0;
            this.field9575 = 0;
            this.method4173(-1);
        } else {
            int var2 = -this.field9575;
            if (this.field9575 > var2) {
                var2 = this.field9575;
            }
            if (-this.field9579 > var2) {
                var2 = -this.field9579;
            }
            if (this.field9579 > var2) {
                var2 = this.field9579;
            }
            if (-this.field9576 > var2) {
                var2 = -this.field9576;
            }
            if (this.field9576 > var2) {
                var2 = this.field9576;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field9574 = arg0;
            this.field9573 = Integer.MIN_VALUE;
            this.field9582 = -this.field9575 / arg0;
            this.field9580 = -this.field9579 / arg0;
            this.field9581 = -this.field9576 / arg0;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II[B[IIIIIIIIIILit;II)I")
    private static final int method4897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class675 arg13, int arg14, int arg15) {
        arg13.field9575 -= arg13.field9582 * arg5;
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
        arg13.field9575 += arg13.field9582 * var22;
        arg13.field9579 = arg6;
        arg13.field9576 = arg7;
        arg13.field9571 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "()Lef;")
    public final class515 method1134() {
        return null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public final synchronized void method4898(boolean arg0) {
        this.field9578 = (this.field9578 >>> 31) + (this.field9578 ^ this.field9578 >> 31);
        if (arg0) {
            this.field9578 = -this.field9578;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final synchronized void method4899(int arg0) {
        this.method4885(arg0 << 6, this.method4895());
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "()Z")
    private final boolean method4900() {
        int var1 = this.field9573;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method4891(var1, this.field9577);
            var2 = method4884(var1, this.field9577);
        }
        if (this.field9575 == var1 && this.field9579 == var3 && this.field9576 == var2) {
            if (this.field9573 == Integer.MIN_VALUE) {
                this.field9573 = 0;
                this.field9575 = this.field9579 = this.field9576 = 0;
                this.method4173(-1);
                return true;
            } else {
                this.method4912();
                return false;
            }
        } else {
            if (this.field9575 < var1) {
                this.field9582 = 1;
                this.field9574 = var1 - this.field9575;
            } else if (this.field9575 > var1) {
                this.field9582 = -1;
                this.field9574 = this.field9575 - var1;
            } else {
                this.field9582 = 0;
            }
            if (this.field9579 < var3) {
                this.field9580 = 1;
                if (this.field9574 == 0 || this.field9574 > var3 - this.field9579) {
                    this.field9574 = var3 - this.field9579;
                }
            } else if (this.field9579 > var3) {
                this.field9580 = -1;
                if (this.field9574 == 0 || this.field9574 > this.field9579 - var3) {
                    this.field9574 = this.field9579 - var3;
                }
            } else {
                this.field9580 = 0;
            }
            if (this.field9576 < var2) {
                this.field9581 = 1;
                if (this.field9574 == 0 || this.field9574 > var2 - this.field9576) {
                    this.field9574 = var2 - this.field9576;
                }
            } else if (this.field9576 > var2) {
                this.field9581 = -1;
                if (this.field9574 == 0 || this.field9574 > this.field9576 - var2) {
                    this.field9574 = this.field9576 - var2;
                }
            } else {
                this.field9581 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([B[IIIIIIIILit;)I")
    private static final int method4901(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class675 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field9579 += (var14 - arg3) * arg9.field9580;
        arg9.field9576 += (var14 - arg3) * arg9.field9581;
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
        arg9.field9575 = var12 >> 2;
        arg9.field9571 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()Lef;")
    public final class515 method1136() {
        return null;
    }

    @OriginalMember(owner = "client!it", name = "h", descriptor = "()Z")
    public final boolean method4902() {
        return this.field9571 < 0 || this.field9571 >= ((class357) super.field7605).field5739.length << 8;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "()V")
    private final void method4903() {
        if (this.field9574 != 0) {
            if (this.field9573 == Integer.MIN_VALUE) {
                this.field9573 = 0;
            }
            this.field9574 = 0;
            this.method4912();
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([B[IIIIIIILit;)I")
    private static final int method4904(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class675 arg8) {
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
        arg8.field9571 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public final synchronized void method4905(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method4885(arg1, arg2);
        } else {
            int var4 = method4891(arg1, arg2);
            int var5 = method4884(arg1, arg2);
            if (this.field9579 == var4 && this.field9576 == var5) {
                this.field9574 = 0;
            } else {
                int var6 = arg1 - this.field9575;
                if (this.field9575 - arg1 > var6) {
                    var6 = this.field9575 - arg1;
                }
                if (var4 - this.field9579 > var6) {
                    var6 = var4 - this.field9579;
                }
                if (this.field9579 - var4 > var6) {
                    var6 = this.field9579 - var4;
                }
                if (var5 - this.field9576 > var6) {
                    var6 = var5 - this.field9576;
                }
                if (this.field9576 - var5 > var6) {
                    var6 = this.field9576 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field9574 = arg0;
                this.field9573 = arg1;
                this.field9577 = arg2;
                this.field9582 = (arg1 - this.field9575) / arg0;
                this.field9580 = (var4 - this.field9579) / arg0;
                this.field9581 = (var5 - this.field9576) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "l", descriptor = "(I)V")
    public final synchronized void method4906(int arg0) {
        int var2 = ((class357) super.field7605).field5739.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field9571 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([IIIII)I")
    private final int method4907(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9574 <= 0) {
                if (this.field9578 == 256 && (this.field9571 & 255) == 0) {
                    if (class426.field6729) {
                        return method4892(0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, 0, arg3, arg2, this);
                    }
                    return method4893(((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, 0, arg3, arg2, this);
                }
                if (class426.field6729) {
                    return method4920(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, 0, arg3, arg2, this, this.field9578, arg4);
                }
                return method4918(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, 0, arg3, arg2, this, this.field9578, arg4);
            }
            int var6 = this.field9574 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9574 += arg1;
            if (this.field9578 == 256 && (this.field9571 & 255) == 0) {
                if (class426.field6729) {
                    arg1 = method4919(0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, this.field9580, this.field9581, 0, var6, arg2, this);
                } else {
                    arg1 = method4914(((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, this.field9582, 0, var6, arg2, this);
                }
            } else if (class426.field6729) {
                arg1 = method4897(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, this.field9580, this.field9581, 0, var6, arg2, this, this.field9578, arg4);
            } else {
                arg1 = method4881(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, this.field9582, 0, var6, arg2, this, this.field9578, arg4);
            }
            this.field9574 -= arg1;
            if (this.field9574 != 0) {
                return arg1;
            }
        } while (!this.method4900());
        return arg3;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II[B[IIIIIIIILit;II)I")
    private static final int method4908(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class675 arg11, int arg12, int arg13) {
        arg11.field9579 -= arg11.field9580 * arg5;
        arg11.field9576 -= arg11.field9581 * arg5;
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
        arg11.field9579 += arg11.field9580 * arg5;
        arg11.field9576 += arg11.field9581 * arg5;
        arg11.field9575 = arg6;
        arg11.field9571 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!it", name = "k", descriptor = "(I)V")
    public final synchronized void method4909(int arg0) {
        this.field9570 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
    public final synchronized void method4910(int arg0) {
        if (this.field9578 < 0) {
            this.field9578 = -arg0;
        } else {
            this.field9578 = arg0;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public final synchronized void method1116(int arg0) {
        if (this.field9574 > 0) {
            if (arg0 >= this.field9574) {
                if (this.field9573 == Integer.MIN_VALUE) {
                    this.field9573 = 0;
                    this.field9575 = this.field9579 = this.field9576 = 0;
                    this.method4173(-1);
                    arg0 = this.field9574;
                }
                this.field9574 = 0;
                this.method4912();
            } else {
                this.field9575 += this.field9582 * arg0;
                this.field9579 += this.field9580 * arg0;
                this.field9576 += this.field9581 * arg0;
                this.field9574 -= arg0;
            }
        }
        class357 var2 = (class357) super.field7605;
        int var3 = this.field9583 << 8;
        int var4 = this.field9572 << 8;
        int var5 = var2.field5739.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field9570 = 0;
        }
        if (this.field9571 < 0) {
            if (this.field9578 <= 0) {
                this.method4903();
                this.method4173(-1);
                return;
            }
            this.field9571 = 0;
        }
        if (this.field9571 >= var5) {
            if (this.field9578 >= 0) {
                this.method4903();
                this.method4173(-1);
                return;
            }
            this.field9571 = var5 - 1;
        }
        this.field9571 += this.field9578 * arg0;
        if (this.field9570 < 0) {
            if (!this.field9584) {
                if (this.field9578 < 0) {
                    if (this.field9571 < var3) {
                        this.field9571 = var4 - 1 - (var4 - 1 - this.field9571) % var6;
                    }
                } else if (this.field9571 >= var4) {
                    this.field9571 = (this.field9571 - var3) % var6 + var3;
                }
            } else {
                if (this.field9578 < 0) {
                    if (this.field9571 >= var3) {
                        return;
                    }
                    this.field9571 = var3 + var3 - 1 - this.field9571;
                    this.field9578 = -this.field9578;
                }
                while (this.field9571 >= var4) {
                    this.field9571 = var4 + var4 - 1 - this.field9571;
                    this.field9578 = -this.field9578;
                    if (this.field9571 >= var3) {
                        return;
                    }
                    this.field9571 = var3 + var3 - 1 - this.field9571;
                    this.field9578 = -this.field9578;
                }
            }
        } else {
            if (this.field9570 > 0) {
                if (this.field9584) {
                    label125: {
                        if (this.field9578 < 0) {
                            if (this.field9571 >= var3) {
                                return;
                            }
                            this.field9571 = var3 + var3 - 1 - this.field9571;
                            this.field9578 = -this.field9578;
                            if (--this.field9570 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field9571 < var4) {
                                return;
                            }
                            this.field9571 = var4 + var4 - 1 - this.field9571;
                            this.field9578 = -this.field9578;
                            if (--this.field9570 == 0) {
                                break;
                            }
                            if (this.field9571 >= var3) {
                                return;
                            }
                            this.field9571 = var3 + var3 - 1 - this.field9571;
                            this.field9578 = -this.field9578;
                        } while (--this.field9570 != 0);
                    }
                } else if (this.field9578 < 0) {
                    if (this.field9571 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field9571) / var6;
                    if (var7 < this.field9570) {
                        this.field9571 += var6 * var7;
                        this.field9570 -= var7;
                        return;
                    }
                    this.field9571 += this.field9570 * var6;
                    this.field9570 = 0;
                } else {
                    if (this.field9571 < var4) {
                        return;
                    }
                    int var8 = (this.field9571 - var3) / var6;
                    if (var8 < this.field9570) {
                        this.field9571 -= var6 * var8;
                        this.field9570 -= var8;
                        return;
                    }
                    this.field9571 -= this.field9570 * var6;
                    this.field9570 = 0;
                }
            }
            if (this.field9578 < 0) {
                if (this.field9571 < 0) {
                    this.field9571 = -1;
                    this.method4903();
                    this.method4173(-1);
                    return;
                }
            } else if (this.field9571 >= var5) {
                this.field9571 = var5;
                this.method4903();
                this.method4173(-1);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "([IIIII)I")
    private final int method4911(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9574 <= 0) {
                if (this.field9578 == -256 && (this.field9571 & 255) == 0) {
                    if (class426.field6729) {
                        return method4888(0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, 0, arg3, arg2, this);
                    }
                    return method4904(((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, 0, arg3, arg2, this);
                }
                if (class426.field6729) {
                    return method4882(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, 0, arg3, arg2, this, this.field9578, arg4);
                }
                return method4887(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, 0, arg3, arg2, this, this.field9578, arg4);
            }
            int var6 = this.field9574 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9574 += arg1;
            if (this.field9578 == -256 && (this.field9571 & 255) == 0) {
                if (class426.field6729) {
                    arg1 = method4886(0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, this.field9580, this.field9581, 0, var6, arg2, this);
                } else {
                    arg1 = method4901(((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, this.field9582, 0, var6, arg2, this);
                }
            } else if (class426.field6729) {
                arg1 = method4889(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9579, this.field9576, this.field9580, this.field9581, 0, var6, arg2, this, this.field9578, arg4);
            } else {
                arg1 = method4908(0, 0, ((class357) super.field7605).field5739, arg0, this.field9571, arg1, this.field9575, this.field9582, 0, var6, arg2, this, this.field9578, arg4);
            }
            this.field9574 -= arg1;
            if (this.field9574 != 0) {
                return arg1;
            }
        } while (!this.method4900());
        return arg3;
    }

    @OriginalMember(owner = "client!it", name = "l", descriptor = "()V")
    private final void method4912() {
        this.field9575 = this.field9573;
        this.field9579 = method4891(this.field9573, this.field9577);
        this.field9576 = method4884(this.field9573, this.field9577);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljg;III)Lit;")
    public static final class675 method4913(class357 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5739 != null && arg0.field5739.length != 0 ? new class675(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "([B[IIIIIIIILit;)I")
    private static final int method4914(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class675 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field9579 += (var14 - arg3) * arg9.field9580;
        arg9.field9576 += (var14 - arg3) * arg9.field9581;
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
        arg9.field9575 = var12 >> 2;
        arg9.field9571 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "()I")
    public final synchronized int method4915() {
        return this.field9573 == Integer.MIN_VALUE ? 0 : this.field9573;
    }

    @OriginalMember(owner = "client!it", name = "j", descriptor = "(I)V")
    public final synchronized void method4916(int arg0) {
        this.method4885(this.method4915(), arg0);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    private final synchronized void method4917(int arg0) {
        this.method4885(arg0, this.method4895());
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "()I")
    public final int method1108() {
        return this.field9573 == 0 && this.field9574 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Ljg;III)V")
    private class675(class357 arg0, int arg1, int arg2, int arg3) {
        super.field7605 = arg0;
        this.field9583 = arg0.field5737;
        this.field9572 = arg0.field5741;
        this.field9584 = arg0.field5740;
        this.field9578 = arg1;
        this.field9573 = arg2;
        this.field9577 = arg3;
        this.field9571 = 0;
        this.method4912();
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II[B[IIIIIIILit;II)I")
    private static final int method4918(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class675 arg10, int arg11, int arg12) {
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
        arg10.field9571 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I[B[IIIIIIIIIILit;)I")
    private static final int method4919(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class675 arg12) {
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
        arg12.field9575 += (var19 - arg4) * arg12.field9582;
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
        arg12.field9579 = var15 >> 2;
        arg12.field9576 = var16 >> 2;
        arg12.field9571 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(II[B[IIIIIIIILit;II)I")
    private static final int method4920(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class675 arg11, int arg12, int arg13) {
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
        arg11.field9571 = arg4;
        return var15 >> 1;
    }
}
