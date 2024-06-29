import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class137 extends class184 {

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    private int field1802;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
    private int field1800;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "Z")
    private boolean field1799;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
    private int field1804;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    private int field1793;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    private int field1794;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "I")
    private int field1803;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!pda", name = "F", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([B[IIIIIIIILpda;)I")
    private static final int method992(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class137 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1807 += (var14 - arg3) * arg9.field1806;
        arg9.field1803 += (var14 - arg3) * arg9.field1798;
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
        arg9.field1796 = var12 >> 2;
        arg9.field1795 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "()Z")
    public final boolean method993() {
        return this.field1795 < 0 || this.field1795 >= ((class430) super.field2361).field5570.length << 8;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lbp;II)Lpda;")
    public static final class137 method994(class430 arg0, int arg1, int arg2) {
        return arg0.field5570 != null && arg0.field5570.length != 0 ? new class137(arg0, (int) ((long) arg0.field5569 * 256L * (long) arg1 / (long) (class66.field901 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lbp;III)Lpda;")
    public static final class137 method995(class430 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5570 != null && arg0.field5570.length != 0 ? new class137(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)V")
    public final synchronized void method996(int arg0, int arg1) {
        this.method1016(arg0, arg1, this.method1009());
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "()Lega;")
    public final class184 method997() {
        return null;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V")
    public final synchronized void method998(int arg0) {
        int var2 = ((class430) super.field2361).field5570.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1795 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(II)I")
    private static final int method999(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I[B[IIIIIIIILpda;)I")
    private static final int method1000(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10) {
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
        arg10.field1795 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I[B[IIIIIIIILpda;)I")
    private static final int method1001(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10) {
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
        arg10.field1795 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II[B[IIIIIIIIIILpda;II)I")
    private static final int method1002(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class137 arg13, int arg14, int arg15) {
        arg13.field1796 -= arg13.field1794 * arg5;
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
        arg13.field1796 += arg13.field1794 * var22;
        arg13.field1807 = arg6;
        arg13.field1803 = arg7;
        arg13.field1795 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)I")
    private static final int method1003(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II[B[IIIIIIILpda;II)I")
    private static final int method1004(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10, int arg11, int arg12) {
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
        arg10.field1795 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "()Lega;")
    public final class184 method1005() {
        return null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II[B[IIIIIIIILpda;II)I")
    private static final int method1006(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
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
        arg11.field1795 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "([B[IIIIIIIILpda;)I")
    private static final int method1007(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class137 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1807 += (var14 - arg3) * arg9.field1806;
        arg9.field1803 += (var14 - arg3) * arg9.field1798;
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
        arg9.field1796 = var12 >> 2;
        arg9.field1795 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(II[B[IIIIIIIILpda;II)I")
    private static final int method1008(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
        arg11.field1807 -= arg11.field1806 * arg5;
        arg11.field1803 -= arg11.field1798 * arg5;
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
        arg11.field1807 += arg11.field1806 * arg5;
        arg11.field1803 += arg11.field1798 * arg5;
        arg11.field1796 = arg6;
        arg11.field1795 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "()I")
    public final synchronized int method1009() {
        return this.field1804 < 0 ? -1 : this.field1804;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([III)V")
    public final synchronized void method1010(int[] arg0, int arg1, int arg2) {
        if (this.field1797 == 0 && this.field1793 == 0) {
            this.method1020(arg2);
        } else {
            class430 var4 = (class430) super.field2361;
            int var5 = this.field1802 << 8;
            int var6 = this.field1800 << 8;
            int var7 = var4.field5570.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1805 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1795 < 0) {
                if (this.field1801 <= 0) {
                    this.method1035();
                    this.method2438((byte) 118);
                    return;
                }
                this.field1795 = 0;
            }
            if (this.field1795 >= var7) {
                if (this.field1801 >= 0) {
                    this.method1035();
                    this.method2438((byte) 117);
                    return;
                }
                this.field1795 = var7 - 1;
            }
            if (this.field1805 < 0) {
                if (this.field1799) {
                    if (this.field1801 < 0) {
                        var9 = this.method1031(arg0, arg1, var5, var10, var4.field5570[this.field1802]);
                        if (this.field1795 >= var5) {
                            return;
                        }
                        this.field1795 = var5 + var5 - 1 - this.field1795;
                        this.field1801 = -this.field1801;
                    }
                    while (true) {
                        int var11 = this.method1030(arg0, var9, var6, var10, var4.field5570[this.field1800 - 1]);
                        if (this.field1795 < var6) {
                            return;
                        }
                        this.field1795 = var6 + var6 - 1 - this.field1795;
                        this.field1801 = -this.field1801;
                        var9 = this.method1031(arg0, var11, var5, var10, var4.field5570[this.field1802]);
                        if (this.field1795 >= var5) {
                            return;
                        }
                        this.field1795 = var5 + var5 - 1 - this.field1795;
                        this.field1801 = -this.field1801;
                    }
                } else if (this.field1801 < 0) {
                    while (true) {
                        var9 = this.method1031(arg0, var9, var5, var10, var4.field5570[this.field1800 - 1]);
                        if (this.field1795 >= var5) {
                            return;
                        }
                        this.field1795 = var6 - 1 - (var6 - 1 - this.field1795) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1030(arg0, var9, var6, var10, var4.field5570[this.field1802]);
                        if (this.field1795 < var6) {
                            return;
                        }
                        this.field1795 = (this.field1795 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1805 > 0) {
                    if (this.field1799) {
                        label130: {
                            if (this.field1801 < 0) {
                                var9 = this.method1031(arg0, arg1, var5, var10, var4.field5570[this.field1802]);
                                if (this.field1795 >= var5) {
                                    return;
                                }
                                this.field1795 = var5 + var5 - 1 - this.field1795;
                                this.field1801 = -this.field1801;
                                if (--this.field1805 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1030(arg0, var9, var6, var10, var4.field5570[this.field1800 - 1]);
                                if (this.field1795 < var6) {
                                    return;
                                }
                                this.field1795 = var6 + var6 - 1 - this.field1795;
                                this.field1801 = -this.field1801;
                                if (--this.field1805 == 0) {
                                    break;
                                }
                                var9 = this.method1031(arg0, var9, var5, var10, var4.field5570[this.field1802]);
                                if (this.field1795 >= var5) {
                                    return;
                                }
                                this.field1795 = var5 + var5 - 1 - this.field1795;
                                this.field1801 = -this.field1801;
                            } while (--this.field1805 != 0);
                        }
                    } else if (this.field1801 < 0) {
                        while (true) {
                            var9 = this.method1031(arg0, var9, var5, var10, var4.field5570[this.field1800 - 1]);
                            if (this.field1795 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1795) / var8;
                            if (var12 >= this.field1805) {
                                this.field1795 += this.field1805 * var8;
                                this.field1805 = 0;
                                break;
                            }
                            this.field1795 += var8 * var12;
                            this.field1805 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1030(arg0, var9, var6, var10, var4.field5570[this.field1802]);
                            if (this.field1795 < var6) {
                                return;
                            }
                            int var13 = (this.field1795 - var5) / var8;
                            if (var13 >= this.field1805) {
                                this.field1795 -= this.field1805 * var8;
                                this.field1805 = 0;
                                break;
                            }
                            this.field1795 -= var8 * var13;
                            this.field1805 -= var13;
                        }
                    }
                }
                if (this.field1801 < 0) {
                    this.method1031(arg0, var9, 0, var10, 0);
                    if (this.field1795 < 0) {
                        this.field1795 = -1;
                        this.method1035();
                        this.method2438((byte) -114);
                        return;
                    }
                } else {
                    this.method1030(arg0, var9, var7, var10, 0);
                    if (this.field1795 >= var7) {
                        this.field1795 = var7;
                        this.method1035();
                        this.method2438((byte) -82);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
    public final synchronized void method1011(boolean arg0) {
        this.field1801 = (this.field1801 >>> 31) + (this.field1801 ^ this.field1801 >> 31);
        if (arg0) {
            this.field1801 = -this.field1801;
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
    public final synchronized void method1012(int arg0) {
        this.field1805 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([B[IIIIIIILpda;)I")
    private static final int method1013(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
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
        arg8.field1795 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I[B[IIIIIIIIIILpda;)I")
    private static final int method1014(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class137 arg12) {
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
        arg12.field1796 += (var19 - arg4) * arg12.field1794;
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
        arg12.field1807 = var15 >> 2;
        arg12.field1803 = var16 >> 2;
        arg12.field1795 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(II[B[IIIIIIILpda;II)I")
    private static final int method1015(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10, int arg11, int arg12) {
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
        arg10.field1795 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
    public final synchronized void method1016(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1028(arg1, arg2);
        } else {
            int var4 = method1003(arg1, arg2);
            int var5 = method999(arg1, arg2);
            if (this.field1807 == var4 && this.field1803 == var5) {
                this.field1793 = 0;
            } else {
                int var6 = arg1 - this.field1796;
                if (this.field1796 - arg1 > var6) {
                    var6 = this.field1796 - arg1;
                }
                if (var4 - this.field1807 > var6) {
                    var6 = var4 - this.field1807;
                }
                if (this.field1807 - var4 > var6) {
                    var6 = this.field1807 - var4;
                }
                if (var5 - this.field1803 > var6) {
                    var6 = var5 - this.field1803;
                }
                if (this.field1803 - var5 > var6) {
                    var6 = this.field1803 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1793 = arg0;
                this.field1797 = arg1;
                this.field1804 = arg2;
                this.field1794 = (arg1 - this.field1796) / arg0;
                this.field1806 = (var4 - this.field1807) / arg0;
                this.field1798 = (var5 - this.field1803) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I[B[IIIIIIIIIILpda;)I")
    private static final int method1017(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class137 arg12) {
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
        arg12.field1796 += (var19 - arg4) * arg12.field1794;
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
        arg12.field1807 = var15 >> 2;
        arg12.field1803 = var16 >> 2;
        arg12.field1795 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "()Z")
    public final boolean method1018() {
        return this.field1793 != 0;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(II[B[IIIIIIIILpda;II)I")
    private static final int method1019(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
        arg11.field1807 -= arg11.field1806 * arg5;
        arg11.field1803 -= arg11.field1798 * arg5;
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
        arg11.field1807 += arg11.field1806 * arg5;
        arg11.field1803 += arg11.field1798 * arg5;
        arg11.field1796 = arg6;
        arg11.field1795 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public final synchronized void method1020(int arg0) {
        if (this.field1793 > 0) {
            if (arg0 >= this.field1793) {
                if (this.field1797 == Integer.MIN_VALUE) {
                    this.field1797 = 0;
                    this.field1796 = this.field1807 = this.field1803 = 0;
                    this.method2438((byte) -19);
                    arg0 = this.field1793;
                }
                this.field1793 = 0;
                this.method1025();
            } else {
                this.field1796 += this.field1794 * arg0;
                this.field1807 += this.field1806 * arg0;
                this.field1803 += this.field1798 * arg0;
                this.field1793 -= arg0;
            }
        }
        class430 var2 = (class430) super.field2361;
        int var3 = this.field1802 << 8;
        int var4 = this.field1800 << 8;
        int var5 = var2.field5570.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1805 = 0;
        }
        if (this.field1795 < 0) {
            if (this.field1801 <= 0) {
                this.method1035();
                this.method2438((byte) -79);
                return;
            }
            this.field1795 = 0;
        }
        if (this.field1795 >= var5) {
            if (this.field1801 >= 0) {
                this.method1035();
                this.method2438((byte) -16);
                return;
            }
            this.field1795 = var5 - 1;
        }
        this.field1795 += this.field1801 * arg0;
        if (this.field1805 < 0) {
            if (!this.field1799) {
                if (this.field1801 < 0) {
                    if (this.field1795 < var3) {
                        this.field1795 = var4 - 1 - (var4 - 1 - this.field1795) % var6;
                    }
                } else if (this.field1795 >= var4) {
                    this.field1795 = (this.field1795 - var3) % var6 + var3;
                }
            } else {
                if (this.field1801 < 0) {
                    if (this.field1795 >= var3) {
                        return;
                    }
                    this.field1795 = var3 + var3 - 1 - this.field1795;
                    this.field1801 = -this.field1801;
                }
                while (this.field1795 >= var4) {
                    this.field1795 = var4 + var4 - 1 - this.field1795;
                    this.field1801 = -this.field1801;
                    if (this.field1795 >= var3) {
                        return;
                    }
                    this.field1795 = var3 + var3 - 1 - this.field1795;
                    this.field1801 = -this.field1801;
                }
            }
        } else {
            if (this.field1805 > 0) {
                if (this.field1799) {
                    label125: {
                        if (this.field1801 < 0) {
                            if (this.field1795 >= var3) {
                                return;
                            }
                            this.field1795 = var3 + var3 - 1 - this.field1795;
                            this.field1801 = -this.field1801;
                            if (--this.field1805 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1795 < var4) {
                                return;
                            }
                            this.field1795 = var4 + var4 - 1 - this.field1795;
                            this.field1801 = -this.field1801;
                            if (--this.field1805 == 0) {
                                break;
                            }
                            if (this.field1795 >= var3) {
                                return;
                            }
                            this.field1795 = var3 + var3 - 1 - this.field1795;
                            this.field1801 = -this.field1801;
                        } while (--this.field1805 != 0);
                    }
                } else if (this.field1801 < 0) {
                    if (this.field1795 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1795) / var6;
                    if (var7 < this.field1805) {
                        this.field1795 += var6 * var7;
                        this.field1805 -= var7;
                        return;
                    }
                    this.field1795 += this.field1805 * var6;
                    this.field1805 = 0;
                } else {
                    if (this.field1795 < var4) {
                        return;
                    }
                    int var8 = (this.field1795 - var3) / var6;
                    if (var8 < this.field1805) {
                        this.field1795 -= var6 * var8;
                        this.field1805 -= var8;
                        return;
                    }
                    this.field1795 -= this.field1805 * var6;
                    this.field1805 = 0;
                }
            }
            if (this.field1801 < 0) {
                if (this.field1795 < 0) {
                    this.field1795 = -1;
                    this.method1035();
                    this.method2438((byte) -103);
                    return;
                }
            } else if (this.field1795 >= var5) {
                this.field1795 = var5;
                this.method1035();
                this.method2438((byte) -84);
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "()I")
    public final synchronized int method1021() {
        return this.field1801 < 0 ? -this.field1801 : this.field1801;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "()I")
    public final int method1022() {
        return this.field1797 == 0 && this.field1793 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "()I")
    public final int method1023() {
        int var1 = this.field1796 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1805 == 0) {
            var2 -= this.field1795 * var2 / (((class430) super.field2361).field5570.length << 8);
        } else if (this.field1805 >= 0) {
            var2 -= this.field1802 * var2 / ((class430) super.field2361).field5570.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "(I)V")
    public final synchronized void method1024(int arg0) {
        this.method1028(arg0 << 6, this.method1009());
    }

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "()V")
    private final void method1025() {
        this.field1796 = this.field1797;
        this.field1807 = method1003(this.field1797, this.field1804);
        this.field1803 = method999(this.field1797, this.field1804);
    }

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "()Z")
    private final boolean method1026() {
        int var1 = this.field1797;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1003(var1, this.field1804);
            var2 = method999(var1, this.field1804);
        }
        if (this.field1796 == var1 && this.field1807 == var3 && this.field1803 == var2) {
            if (this.field1797 == Integer.MIN_VALUE) {
                this.field1797 = 0;
                this.field1796 = this.field1807 = this.field1803 = 0;
                this.method2438((byte) -29);
                return true;
            } else {
                this.method1025();
                return false;
            }
        } else {
            if (this.field1796 < var1) {
                this.field1794 = 1;
                this.field1793 = var1 - this.field1796;
            } else if (this.field1796 > var1) {
                this.field1794 = -1;
                this.field1793 = this.field1796 - var1;
            } else {
                this.field1794 = 0;
            }
            if (this.field1807 < var3) {
                this.field1806 = 1;
                if (this.field1793 == 0 || this.field1793 > var3 - this.field1807) {
                    this.field1793 = var3 - this.field1807;
                }
            } else if (this.field1807 > var3) {
                this.field1806 = -1;
                if (this.field1793 == 0 || this.field1793 > this.field1807 - var3) {
                    this.field1793 = this.field1807 - var3;
                }
            } else {
                this.field1806 = 0;
            }
            if (this.field1803 < var2) {
                this.field1798 = 1;
                if (this.field1793 == 0 || this.field1793 > var2 - this.field1803) {
                    this.field1793 = var2 - this.field1803;
                }
            } else if (this.field1803 > var2) {
                this.field1798 = -1;
                if (this.field1793 == 0 || this.field1793 > this.field1803 - var2) {
                    this.field1793 = this.field1803 - var2;
                }
            } else {
                this.field1798 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "(I)V")
    public final synchronized void method1027(int arg0) {
        if (arg0 == 0) {
            this.method1032(0);
            this.method2438((byte) 111);
        } else if (this.field1807 == 0 && this.field1803 == 0) {
            this.field1793 = 0;
            this.field1797 = 0;
            this.field1796 = 0;
            this.method2438((byte) -7);
        } else {
            int var2 = -this.field1796;
            if (this.field1796 > var2) {
                var2 = this.field1796;
            }
            if (-this.field1807 > var2) {
                var2 = -this.field1807;
            }
            if (this.field1807 > var2) {
                var2 = this.field1807;
            }
            if (-this.field1803 > var2) {
                var2 = -this.field1803;
            }
            if (this.field1803 > var2) {
                var2 = this.field1803;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1793 = arg0;
            this.field1797 = Integer.MIN_VALUE;
            this.field1794 = -this.field1796 / arg0;
            this.field1806 = -this.field1807 / arg0;
            this.field1798 = -this.field1803 / arg0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(II)V")
    private final synchronized void method1028(int arg0, int arg1) {
        this.field1797 = arg0;
        this.field1804 = arg1;
        this.field1793 = 0;
        this.method1025();
    }

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "()I")
    public final synchronized int method1029() {
        return this.field1797 == Integer.MIN_VALUE ? 0 : this.field1797;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "([IIIII)I")
    private final int method1030(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1793 <= 0) {
                if (this.field1801 == 256 && (this.field1795 & 255) == 0) {
                    if (class669.field9289) {
                        return method1000(0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, 0, arg3, arg2, this);
                    }
                    return method1013(((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, 0, arg3, arg2, this);
                }
                if (class669.field9289) {
                    return method1036(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, 0, arg3, arg2, this, this.field1801, arg4);
                }
                return method1015(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, 0, arg3, arg2, this, this.field1801, arg4);
            }
            int var6 = this.field1793 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1793 += arg1;
            if (this.field1801 == 256 && (this.field1795 & 255) == 0) {
                if (class669.field9289) {
                    arg1 = method1017(0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, this.field1806, this.field1798, 0, var6, arg2, this);
                } else {
                    arg1 = method992(((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, this.field1794, 0, var6, arg2, this);
                }
            } else if (class669.field9289) {
                arg1 = method1002(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, this.field1806, this.field1798, 0, var6, arg2, this, this.field1801, arg4);
            } else {
                arg1 = method1008(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, this.field1794, 0, var6, arg2, this, this.field1801, arg4);
            }
            this.field1793 -= arg1;
            if (this.field1793 != 0) {
                return arg1;
            }
        } while (!this.method1026());
        return arg3;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "([IIIII)I")
    private final int method1031(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1793 <= 0) {
                if (this.field1801 == -256 && (this.field1795 & 255) == 0) {
                    if (class669.field9289) {
                        return method1001(0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, 0, arg3, arg2, this);
                    }
                    return method1033(((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, 0, arg3, arg2, this);
                }
                if (class669.field9289) {
                    return method1006(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, 0, arg3, arg2, this, this.field1801, arg4);
                }
                return method1004(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, 0, arg3, arg2, this, this.field1801, arg4);
            }
            int var6 = this.field1793 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1793 += arg1;
            if (this.field1801 == -256 && (this.field1795 & 255) == 0) {
                if (class669.field9289) {
                    arg1 = method1014(0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, this.field1806, this.field1798, 0, var6, arg2, this);
                } else {
                    arg1 = method1007(((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, this.field1794, 0, var6, arg2, this);
                }
            } else if (class669.field9289) {
                arg1 = method1037(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1807, this.field1803, this.field1806, this.field1798, 0, var6, arg2, this, this.field1801, arg4);
            } else {
                arg1 = method1019(0, 0, ((class430) super.field2361).field5570, arg0, this.field1795, arg1, this.field1796, this.field1794, 0, var6, arg2, this, this.field1801, arg4);
            }
            this.field1793 -= arg1;
            if (this.field1793 != 0) {
                return arg1;
            }
        } while (!this.method1026());
        return arg3;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lbp;II)V")
    private class137(class430 arg0, int arg1, int arg2) {
        super.field2361 = arg0;
        this.field1802 = arg0.field5566;
        this.field1800 = arg0.field5567;
        this.field1799 = arg0.field5568;
        this.field1801 = arg1;
        this.field1797 = arg2;
        this.field1804 = 8192;
        this.field1795 = 0;
        this.method1025();
    }

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "(I)V")
    private final synchronized void method1032(int arg0) {
        this.method1028(arg0, this.method1009());
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "([B[IIIIIIILpda;)I")
    private static final int method1033(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
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
        arg8.field1795 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lbp;III)V")
    private class137(class430 arg0, int arg1, int arg2, int arg3) {
        super.field2361 = arg0;
        this.field1802 = arg0.field5566;
        this.field1800 = arg0.field5567;
        this.field1799 = arg0.field5568;
        this.field1801 = arg1;
        this.field1797 = arg2;
        this.field1804 = arg3;
        this.field1795 = 0;
        this.method1025();
    }

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "(I)V")
    public final synchronized void method1034(int arg0) {
        if (this.field1801 < 0) {
            this.field1801 = -arg0;
        } else {
            this.field1801 = arg0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "()V")
    private final void method1035() {
        if (this.field1793 != 0) {
            if (this.field1797 == Integer.MIN_VALUE) {
                this.field1797 = 0;
            }
            this.field1793 = 0;
            this.method1025();
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(II[B[IIIIIIIILpda;II)I")
    private static final int method1036(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
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
        arg11.field1795 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(II[B[IIIIIIIIIILpda;II)I")
    private static final int method1037(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class137 arg13, int arg14, int arg15) {
        arg13.field1796 -= arg13.field1794 * arg5;
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
        arg13.field1796 += arg13.field1794 * var22;
        arg13.field1807 = arg6;
        arg13.field1803 = arg7;
        arg13.field1795 = arg4;
        return var22;
    }
}
