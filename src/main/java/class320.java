import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class320 extends class427 {

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    private int field4647;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
    private boolean field4639;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    private int field4645;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    private int field4637;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    private int field4649;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    private int field4635;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    private int field4636;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    private int field4638;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    private int field4640;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    private int field4641;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    private int field4643;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    private int field4644;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "()V")
    private final void method1959() {
        this.field4635 = this.field4637;
        this.field4643 = method1976(this.field4637, this.field4649);
        this.field4636 = method1968(this.field4637, this.field4649);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[B[IIIIIIIILfc;II)I")
    private static final int method1960(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class320 arg11, int arg12, int arg13) {
        arg11.field4643 -= arg11.field4640 * arg5;
        arg11.field4636 -= arg11.field4642 * arg5;
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
        arg11.field4643 += arg11.field4640 * arg5;
        arg11.field4636 += arg11.field4642 * arg5;
        arg11.field4635 = arg6;
        arg11.field4646 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[B[IIIIIIIILfc;)I")
    private static final int method1961(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class320 arg10) {
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
        arg10.field4646 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final synchronized void method1962(int arg0) {
        if (arg0 == 0) {
            this.method1984(0);
            this.method911(-52);
        } else if (this.field4643 == 0 && this.field4636 == 0) {
            this.field4638 = 0;
            this.field4637 = 0;
            this.field4635 = 0;
            this.method911(-52);
        } else {
            int var2 = -this.field4635;
            if (this.field4635 > var2) {
                var2 = this.field4635;
            }
            if (-this.field4643 > var2) {
                var2 = -this.field4643;
            }
            if (this.field4643 > var2) {
                var2 = this.field4643;
            }
            if (-this.field4636 > var2) {
                var2 = -this.field4636;
            }
            if (this.field4636 > var2) {
                var2 = this.field4636;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4638 = arg0;
            this.field4637 = Integer.MIN_VALUE;
            this.field4644 = -this.field4635 / arg0;
            this.field4640 = -this.field4643 / arg0;
            this.field4642 = -this.field4636 / arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "()I")
    public final synchronized int method1963() {
        return this.field4645 < 0 ? -this.field4645 : this.field4645;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[B[IIIIIIIIIILfc;)I")
    private static final int method1964(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class320 arg12) {
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
        arg12.field4635 += (var19 - arg4) * arg12.field4644;
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
        arg12.field4643 = var15 >> 2;
        arg12.field4636 = var16 >> 2;
        arg12.field4646 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([B[IIIIIIIILfc;)I")
    private static final int method1965(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class320 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4643 += (var14 - arg3) * arg9.field4640;
        arg9.field4636 += (var14 - arg3) * arg9.field4642;
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
        arg9.field4635 = var12 >> 2;
        arg9.field4646 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIII)I")
    private final int method1966(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4638 <= 0) {
                if (this.field4645 == 256 && (this.field4646 & 255) == 0) {
                    if (class641.field9295) {
                        return method1961(0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, 0, arg3, arg2, this);
                    }
                    return method1988(((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, 0, arg3, arg2, this);
                }
                if (class641.field9295) {
                    return method1982(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, 0, arg3, arg2, this, this.field4645, arg4);
                }
                return method1977(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, 0, arg3, arg2, this, this.field4645, arg4);
            }
            int var6 = this.field4638 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4638 += arg1;
            if (this.field4645 == 256 && (this.field4646 & 255) == 0) {
                if (class641.field9295) {
                    arg1 = method1964(0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, this.field4640, this.field4642, 0, var6, arg2, this);
                } else {
                    arg1 = method1965(((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, this.field4644, 0, var6, arg2, this);
                }
            } else if (class641.field9295) {
                arg1 = method1992(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, this.field4640, this.field4642, 0, var6, arg2, this, this.field4645, arg4);
            } else {
                arg1 = method1998(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, this.field4644, 0, var6, arg2, this, this.field4645, arg4);
            }
            this.field4638 -= arg1;
            if (this.field4638 != 0) {
                return arg1;
            }
        } while (!this.method1996());
        return arg3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()Lps;")
    public final class427 method45() {
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([B[IIIIIIILfc;)I")
    private static final int method1967(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class320 arg8) {
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
        arg8.field4646 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    private static final int method1968(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lar;III)Lfc;")
    public static final class320 method1969(class4 arg0, int arg1, int arg2, int arg3) {
        return arg0.field34 != null && arg0.field34.length != 0 ? new class320(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "()Z")
    public final boolean method1970() {
        return this.field4638 != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public final synchronized void method48(int arg0) {
        if (this.field4638 > 0) {
            if (arg0 >= this.field4638) {
                if (this.field4637 == Integer.MIN_VALUE) {
                    this.field4637 = 0;
                    this.field4635 = this.field4643 = this.field4636 = 0;
                    this.method911(-52);
                    arg0 = this.field4638;
                }
                this.field4638 = 0;
                this.method1959();
            } else {
                this.field4635 += this.field4644 * arg0;
                this.field4643 += this.field4640 * arg0;
                this.field4636 += this.field4642 * arg0;
                this.field4638 -= arg0;
            }
        }
        class4 var2 = (class4) super.field6236;
        int var3 = this.field4648 << 8;
        int var4 = this.field4647 << 8;
        int var5 = var2.field34.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4641 = 0;
        }
        if (this.field4646 < 0) {
            if (this.field4645 <= 0) {
                this.method1995();
                this.method911(-52);
                return;
            }
            this.field4646 = 0;
        }
        if (this.field4646 >= var5) {
            if (this.field4645 >= 0) {
                this.method1995();
                this.method911(-52);
                return;
            }
            this.field4646 = var5 - 1;
        }
        this.field4646 += this.field4645 * arg0;
        if (this.field4641 < 0) {
            if (!this.field4639) {
                if (this.field4645 < 0) {
                    if (this.field4646 < var3) {
                        this.field4646 = var4 - 1 - (var4 - 1 - this.field4646) % var6;
                    }
                } else if (this.field4646 >= var4) {
                    this.field4646 = (this.field4646 - var3) % var6 + var3;
                }
            } else {
                if (this.field4645 < 0) {
                    if (this.field4646 >= var3) {
                        return;
                    }
                    this.field4646 = var3 + var3 - 1 - this.field4646;
                    this.field4645 = -this.field4645;
                }
                while (this.field4646 >= var4) {
                    this.field4646 = var4 + var4 - 1 - this.field4646;
                    this.field4645 = -this.field4645;
                    if (this.field4646 >= var3) {
                        return;
                    }
                    this.field4646 = var3 + var3 - 1 - this.field4646;
                    this.field4645 = -this.field4645;
                }
            }
        } else {
            if (this.field4641 > 0) {
                if (this.field4639) {
                    label125: {
                        if (this.field4645 < 0) {
                            if (this.field4646 >= var3) {
                                return;
                            }
                            this.field4646 = var3 + var3 - 1 - this.field4646;
                            this.field4645 = -this.field4645;
                            if (--this.field4641 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4646 < var4) {
                                return;
                            }
                            this.field4646 = var4 + var4 - 1 - this.field4646;
                            this.field4645 = -this.field4645;
                            if (--this.field4641 == 0) {
                                break;
                            }
                            if (this.field4646 >= var3) {
                                return;
                            }
                            this.field4646 = var3 + var3 - 1 - this.field4646;
                            this.field4645 = -this.field4645;
                        } while (--this.field4641 != 0);
                    }
                } else if (this.field4645 < 0) {
                    if (this.field4646 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4646) / var6;
                    if (var7 < this.field4641) {
                        this.field4646 += var6 * var7;
                        this.field4641 -= var7;
                        return;
                    }
                    this.field4646 += this.field4641 * var6;
                    this.field4641 = 0;
                } else {
                    if (this.field4646 < var4) {
                        return;
                    }
                    int var8 = (this.field4646 - var3) / var6;
                    if (var8 < this.field4641) {
                        this.field4646 -= var6 * var8;
                        this.field4641 -= var8;
                        return;
                    }
                    this.field4646 -= this.field4641 * var6;
                    this.field4641 = 0;
                }
            }
            if (this.field4645 < 0) {
                if (this.field4646 < 0) {
                    this.field4646 = -1;
                    this.method1995();
                    this.method911(-52);
                    return;
                }
            } else if (this.field4646 >= var5) {
                this.field4646 = var5;
                this.method1995();
                this.method911(-52);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "([B[IIIIIIIILfc;)I")
    private static final int method1971(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class320 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4643 += (var14 - arg3) * arg9.field4640;
        arg9.field4636 += (var14 - arg3) * arg9.field4642;
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
        arg9.field4635 = var12 >> 2;
        arg9.field4646 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public final synchronized void method1972(boolean arg0) {
        this.field4645 = (this.field4645 >>> 31) + (this.field4645 ^ this.field4645 >> 31);
        if (arg0) {
            this.field4645 = -this.field4645;
        }
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "()Z")
    public final boolean method1973() {
        return this.field4646 < 0 || this.field4646 >= ((class4) super.field6236).field34.length << 8;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I[B[IIIIIIIIIILfc;)I")
    private static final int method1974(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class320 arg12) {
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
        arg12.field4635 += (var19 - arg4) * arg12.field4644;
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
        arg12.field4643 = var15 >> 2;
        arg12.field4636 = var16 >> 2;
        arg12.field4646 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public final synchronized void method1975(int arg0) {
        this.field4641 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()Lps;")
    public final class427 method36() {
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "([III)V")
    public final synchronized void method38(int[] arg0, int arg1, int arg2) {
        if (this.field4637 == 0 && this.field4638 == 0) {
            this.method48(arg2);
        } else {
            class4 var4 = (class4) super.field6236;
            int var5 = this.field4648 << 8;
            int var6 = this.field4647 << 8;
            int var7 = var4.field34.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4641 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4646 < 0) {
                if (this.field4645 <= 0) {
                    this.method1995();
                    this.method911(-52);
                    return;
                }
                this.field4646 = 0;
            }
            if (this.field4646 >= var7) {
                if (this.field4645 >= 0) {
                    this.method1995();
                    this.method911(-52);
                    return;
                }
                this.field4646 = var7 - 1;
            }
            if (this.field4641 < 0) {
                if (this.field4639) {
                    if (this.field4645 < 0) {
                        var9 = this.method1983(arg0, arg1, var5, var10, var4.field34[this.field4648]);
                        if (this.field4646 >= var5) {
                            return;
                        }
                        this.field4646 = var5 + var5 - 1 - this.field4646;
                        this.field4645 = -this.field4645;
                    }
                    while (true) {
                        int var11 = this.method1966(arg0, var9, var6, var10, var4.field34[this.field4647 - 1]);
                        if (this.field4646 < var6) {
                            return;
                        }
                        this.field4646 = var6 + var6 - 1 - this.field4646;
                        this.field4645 = -this.field4645;
                        var9 = this.method1983(arg0, var11, var5, var10, var4.field34[this.field4648]);
                        if (this.field4646 >= var5) {
                            return;
                        }
                        this.field4646 = var5 + var5 - 1 - this.field4646;
                        this.field4645 = -this.field4645;
                    }
                } else if (this.field4645 < 0) {
                    while (true) {
                        var9 = this.method1983(arg0, var9, var5, var10, var4.field34[this.field4647 - 1]);
                        if (this.field4646 >= var5) {
                            return;
                        }
                        this.field4646 = var6 - 1 - (var6 - 1 - this.field4646) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1966(arg0, var9, var6, var10, var4.field34[this.field4648]);
                        if (this.field4646 < var6) {
                            return;
                        }
                        this.field4646 = (this.field4646 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4641 > 0) {
                    if (this.field4639) {
                        label130: {
                            if (this.field4645 < 0) {
                                var9 = this.method1983(arg0, arg1, var5, var10, var4.field34[this.field4648]);
                                if (this.field4646 >= var5) {
                                    return;
                                }
                                this.field4646 = var5 + var5 - 1 - this.field4646;
                                this.field4645 = -this.field4645;
                                if (--this.field4641 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1966(arg0, var9, var6, var10, var4.field34[this.field4647 - 1]);
                                if (this.field4646 < var6) {
                                    return;
                                }
                                this.field4646 = var6 + var6 - 1 - this.field4646;
                                this.field4645 = -this.field4645;
                                if (--this.field4641 == 0) {
                                    break;
                                }
                                var9 = this.method1983(arg0, var9, var5, var10, var4.field34[this.field4648]);
                                if (this.field4646 >= var5) {
                                    return;
                                }
                                this.field4646 = var5 + var5 - 1 - this.field4646;
                                this.field4645 = -this.field4645;
                            } while (--this.field4641 != 0);
                        }
                    } else if (this.field4645 < 0) {
                        while (true) {
                            var9 = this.method1983(arg0, var9, var5, var10, var4.field34[this.field4647 - 1]);
                            if (this.field4646 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4646) / var8;
                            if (var12 >= this.field4641) {
                                this.field4646 += this.field4641 * var8;
                                this.field4641 = 0;
                                break;
                            }
                            this.field4646 += var8 * var12;
                            this.field4641 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1966(arg0, var9, var6, var10, var4.field34[this.field4648]);
                            if (this.field4646 < var6) {
                                return;
                            }
                            int var13 = (this.field4646 - var5) / var8;
                            if (var13 >= this.field4641) {
                                this.field4646 -= this.field4641 * var8;
                                this.field4641 = 0;
                                break;
                            }
                            this.field4646 -= var8 * var13;
                            this.field4641 -= var13;
                        }
                    }
                }
                if (this.field4645 < 0) {
                    this.method1983(arg0, var9, 0, var10, 0);
                    if (this.field4646 < 0) {
                        this.field4646 = -1;
                        this.method1995();
                        this.method911(-52);
                        return;
                    }
                } else {
                    this.method1966(arg0, var9, var7, var10, 0);
                    if (this.field4646 >= var7) {
                        this.field4646 = var7;
                        this.method1995();
                        this.method911(-52);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)I")
    private static final int method1976(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[B[IIIIIIILfc;II)I")
    private static final int method1977(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class320 arg10, int arg11, int arg12) {
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
        arg10.field4646 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II[B[IIIIIIIILfc;II)I")
    private static final int method1978(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class320 arg11, int arg12, int arg13) {
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
        arg11.field4646 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lar;II)Lfc;")
    public static final class320 method1979(class4 arg0, int arg1, int arg2) {
        return arg0.field34 != null && arg0.field34.length != 0 ? new class320(arg0, (int) ((long) arg0.field35 * 256L * (long) arg1 / (long) (class604.field8591 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public final synchronized void method1980(int arg0) {
        if (this.field4645 < 0) {
            this.field4645 = -arg0;
        } else {
            this.field4645 = arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "()I")
    public final synchronized int method1981() {
        return this.field4637 == Integer.MIN_VALUE ? 0 : this.field4637;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II[B[IIIIIIIILfc;II)I")
    private static final int method1982(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class320 arg11, int arg12, int arg13) {
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
        arg11.field4646 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "([IIIII)I")
    private final int method1983(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4638 <= 0) {
                if (this.field4645 == -256 && (this.field4646 & 255) == 0) {
                    if (class641.field9295) {
                        return method1986(0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, 0, arg3, arg2, this);
                    }
                    return method1967(((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, 0, arg3, arg2, this);
                }
                if (class641.field9295) {
                    return method1978(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, 0, arg3, arg2, this, this.field4645, arg4);
                }
                return method1997(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, 0, arg3, arg2, this, this.field4645, arg4);
            }
            int var6 = this.field4638 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4638 += arg1;
            if (this.field4645 == -256 && (this.field4646 & 255) == 0) {
                if (class641.field9295) {
                    arg1 = method1974(0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, this.field4640, this.field4642, 0, var6, arg2, this);
                } else {
                    arg1 = method1971(((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, this.field4644, 0, var6, arg2, this);
                }
            } else if (class641.field9295) {
                arg1 = method1985(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4643, this.field4636, this.field4640, this.field4642, 0, var6, arg2, this, this.field4645, arg4);
            } else {
                arg1 = method1960(0, 0, ((class4) super.field6236).field34, arg0, this.field4646, arg1, this.field4635, this.field4644, 0, var6, arg2, this, this.field4645, arg4);
            }
            this.field4638 -= arg1;
            if (this.field4638 != 0) {
                return arg1;
            }
        } while (!this.method1996());
        return arg3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
    public final int method39() {
        return this.field4637 == 0 && this.field4638 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    private final synchronized void method1984(int arg0) {
        this.method1990(arg0, this.method1994());
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[B[IIIIIIIIIILfc;II)I")
    private static final int method1985(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class320 arg13, int arg14, int arg15) {
        arg13.field4635 -= arg13.field4644 * arg5;
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
        arg13.field4635 += arg13.field4644 * var22;
        arg13.field4643 = arg6;
        arg13.field4636 = arg7;
        arg13.field4646 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I[B[IIIIIIIILfc;)I")
    private static final int method1986(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class320 arg10) {
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
        arg10.field4646 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public final synchronized void method1987(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1990(arg1, arg2);
        } else {
            int var4 = method1976(arg1, arg2);
            int var5 = method1968(arg1, arg2);
            if (this.field4643 == var4 && this.field4636 == var5) {
                this.field4638 = 0;
            } else {
                int var6 = arg1 - this.field4635;
                if (this.field4635 - arg1 > var6) {
                    var6 = this.field4635 - arg1;
                }
                if (var4 - this.field4643 > var6) {
                    var6 = var4 - this.field4643;
                }
                if (this.field4643 - var4 > var6) {
                    var6 = this.field4643 - var4;
                }
                if (var5 - this.field4636 > var6) {
                    var6 = var5 - this.field4636;
                }
                if (this.field4636 - var5 > var6) {
                    var6 = this.field4636 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4638 = arg0;
                this.field4637 = arg1;
                this.field4649 = arg2;
                this.field4644 = (arg1 - this.field4635) / arg0;
                this.field4640 = (var4 - this.field4643) / arg0;
                this.field4642 = (var5 - this.field4636) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "([B[IIIIIIILfc;)I")
    private static final int method1988(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class320 arg8) {
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
        arg8.field4646 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()I")
    public final int method1989() {
        int var1 = this.field4635 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4641 == 0) {
            var2 -= this.field4646 * var2 / (((class4) super.field6236).field34.length << 8);
        } else if (this.field4641 >= 0) {
            var2 -= this.field4648 * var2 / ((class4) super.field6236).field34.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)V")
    private final synchronized void method1990(int arg0, int arg1) {
        this.field4637 = arg0;
        this.field4649 = arg1;
        this.field4638 = 0;
        this.method1959();
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
    public final synchronized void method1991(int arg0) {
        int var2 = ((class4) super.field6236).field34.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4646 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II[B[IIIIIIIIIILfc;II)I")
    private static final int method1992(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class320 arg13, int arg14, int arg15) {
        arg13.field4635 -= arg13.field4644 * arg5;
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
        arg13.field4635 += arg13.field4644 * var22;
        arg13.field4643 = arg6;
        arg13.field4636 = arg7;
        arg13.field4646 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)V")
    public final synchronized void method1993(int arg0, int arg1) {
        this.method1987(arg0, arg1, this.method1994());
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "()I")
    public final synchronized int method1994() {
        return this.field4649 < 0 ? -1 : this.field4649;
    }

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "()V")
    private final void method1995() {
        if (this.field4638 != 0) {
            if (this.field4637 == Integer.MIN_VALUE) {
                this.field4637 = 0;
            }
            this.field4638 = 0;
            this.method1959();
        }
    }

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "()Z")
    private final boolean method1996() {
        int var1 = this.field4637;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1976(var1, this.field4649);
            var2 = method1968(var1, this.field4649);
        }
        if (this.field4635 == var1 && this.field4643 == var3 && this.field4636 == var2) {
            if (this.field4637 == Integer.MIN_VALUE) {
                this.field4637 = 0;
                this.field4635 = this.field4643 = this.field4636 = 0;
                this.method911(-52);
                return true;
            } else {
                this.method1959();
                return false;
            }
        } else {
            if (this.field4635 < var1) {
                this.field4644 = 1;
                this.field4638 = var1 - this.field4635;
            } else if (this.field4635 > var1) {
                this.field4644 = -1;
                this.field4638 = this.field4635 - var1;
            } else {
                this.field4644 = 0;
            }
            if (this.field4643 < var3) {
                this.field4640 = 1;
                if (this.field4638 == 0 || this.field4638 > var3 - this.field4643) {
                    this.field4638 = var3 - this.field4643;
                }
            } else if (this.field4643 > var3) {
                this.field4640 = -1;
                if (this.field4638 == 0 || this.field4638 > this.field4643 - var3) {
                    this.field4638 = this.field4643 - var3;
                }
            } else {
                this.field4640 = 0;
            }
            if (this.field4636 < var2) {
                this.field4642 = 1;
                if (this.field4638 == 0 || this.field4638 > var2 - this.field4636) {
                    this.field4638 = var2 - this.field4636;
                }
            } else if (this.field4636 > var2) {
                this.field4642 = -1;
                if (this.field4638 == 0 || this.field4638 > this.field4636 - var2) {
                    this.field4638 = this.field4636 - var2;
                }
            } else {
                this.field4642 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II[B[IIIIIIILfc;II)I")
    private static final int method1997(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class320 arg10, int arg11, int arg12) {
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
        arg10.field4646 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(II[B[IIIIIIIILfc;II)I")
    private static final int method1998(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class320 arg11, int arg12, int arg13) {
        arg11.field4643 -= arg11.field4640 * arg5;
        arg11.field4636 -= arg11.field4642 * arg5;
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
        arg11.field4643 += arg11.field4640 * arg5;
        arg11.field4636 += arg11.field4642 * arg5;
        arg11.field4635 = arg6;
        arg11.field4646 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)V")
    public final synchronized void method1999(int arg0) {
        this.method1990(arg0 << 6, this.method1994());
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lar;II)V")
    private class320(class4 arg0, int arg1, int arg2) {
        super.field6236 = arg0;
        this.field4648 = arg0.field32;
        this.field4647 = arg0.field31;
        this.field4639 = arg0.field33;
        this.field4645 = arg1;
        this.field4637 = arg2;
        this.field4649 = 8192;
        this.field4646 = 0;
        this.method1959();
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lar;III)V")
    private class320(class4 arg0, int arg1, int arg2, int arg3) {
        super.field6236 = arg0;
        this.field4648 = arg0.field32;
        this.field4647 = arg0.field31;
        this.field4639 = arg0.field33;
        this.field4645 = arg1;
        this.field4637 = arg2;
        this.field4649 = arg3;
        this.field4646 = 0;
        this.method1959();
    }
}
