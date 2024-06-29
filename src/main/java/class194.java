import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class194 extends class3 {

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    private int field2815;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "Z")
    private boolean field2814;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    private int field2813;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    private int field2807;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    private int field2817;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    private int field2804;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    private int field2805;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    private int field2806;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    private int field2808;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    private int field2809;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    private int field2810;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[B[IIIIIIIIIILlu;)I")
    private static final int method1281(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class194 arg12) {
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
        arg12.field2811 += (var19 - arg4) * arg12.field2816;
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
        arg12.field2810 = var15 >> 2;
        arg12.field2805 = var16 >> 2;
        arg12.field2817 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[B[IIIIIIIILlu;II)I")
    private static final int method1282(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class194 arg11, int arg12, int arg13) {
        arg11.field2810 -= arg11.field2808 * arg5;
        arg11.field2805 -= arg11.field2804 * arg5;
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
        arg11.field2810 += arg11.field2808 * arg5;
        arg11.field2805 += arg11.field2804 * arg5;
        arg11.field2811 = arg6;
        arg11.field2817 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[B[IIIIIIIILlu;)I")
    private static final int method1283(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class194 arg10) {
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
        arg10.field2817 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "()Lua;")
    public final class3 method8() {
        return null;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
    public final synchronized void method1284(int arg0) {
        if (this.field2813 < 0) {
            this.field2813 = -arg0;
        } else {
            this.field2813 = arg0;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)I")
    private static final int method1285(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[B[IIIIIIILlu;II)I")
    private static final int method1286(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class194 arg10, int arg11, int arg12) {
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
        arg10.field2817 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I[B[IIIIIIIILlu;)I")
    private static final int method1287(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class194 arg10) {
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
        arg10.field2817 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "()I")
    public final synchronized int method1288() {
        return this.field2812 == Integer.MIN_VALUE ? 0 : this.field2812;
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "()Z")
    public final boolean method1289() {
        return this.field2809 != 0;
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "()Z")
    private final boolean method1290() {
        int var1 = this.field2812;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1298(var1, this.field2807);
            var2 = method1285(var1, this.field2807);
        }
        if (this.field2811 == var1 && this.field2810 == var3 && this.field2805 == var2) {
            if (this.field2812 == Integer.MIN_VALUE) {
                this.field2812 = 0;
                this.field2811 = this.field2810 = this.field2805 = 0;
                this.method3065(-17363);
                return true;
            } else {
                this.method1313();
                return false;
            }
        } else {
            if (this.field2811 < var1) {
                this.field2816 = 1;
                this.field2809 = var1 - this.field2811;
            } else if (this.field2811 > var1) {
                this.field2816 = -1;
                this.field2809 = this.field2811 - var1;
            } else {
                this.field2816 = 0;
            }
            if (this.field2810 < var3) {
                this.field2808 = 1;
                if (this.field2809 == 0 || this.field2809 > var3 - this.field2810) {
                    this.field2809 = var3 - this.field2810;
                }
            } else if (this.field2810 > var3) {
                this.field2808 = -1;
                if (this.field2809 == 0 || this.field2809 > this.field2810 - var3) {
                    this.field2809 = this.field2810 - var3;
                }
            } else {
                this.field2808 = 0;
            }
            if (this.field2805 < var2) {
                this.field2804 = 1;
                if (this.field2809 == 0 || this.field2809 > var2 - this.field2805) {
                    this.field2809 = var2 - this.field2805;
                }
            } else if (this.field2805 > var2) {
                this.field2804 = -1;
                if (this.field2809 == 0 || this.field2809 > this.field2805 - var2) {
                    this.field2809 = this.field2805 - var2;
                }
            } else {
                this.field2804 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([IIIII)I")
    private final int method1291(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2809 <= 0) {
                if (this.field2813 == -256 && (this.field2817 & 255) == 0) {
                    if (class379.field5336) {
                        return method1283(0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, 0, arg3, arg2, this);
                    }
                    return method1307(((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, 0, arg3, arg2, this);
                }
                if (class379.field5336) {
                    return method1308(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, 0, arg3, arg2, this, this.field2813, arg4);
                }
                return method1315(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, 0, arg3, arg2, this, this.field2813, arg4);
            }
            int var6 = this.field2809 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2809 += arg1;
            if (this.field2813 == -256 && (this.field2817 & 255) == 0) {
                if (class379.field5336) {
                    arg1 = method1281(0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, this.field2808, this.field2804, 0, var6, arg2, this);
                } else {
                    arg1 = method1317(((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, this.field2816, 0, var6, arg2, this);
                }
            } else if (class379.field5336) {
                arg1 = method1293(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, this.field2808, this.field2804, 0, var6, arg2, this, this.field2813, arg4);
            } else {
                arg1 = method1282(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, this.field2816, 0, var6, arg2, this, this.field2813, arg4);
            }
            this.field2809 -= arg1;
            if (this.field2809 != 0) {
                return arg1;
            }
        } while (!this.method1290());
        return arg3;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II[B[IIIIIIIILlu;II)I")
    private static final int method1292(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class194 arg11, int arg12, int arg13) {
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
        arg11.field2817 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "([III)V")
    public final synchronized void method10(int[] arg0, int arg1, int arg2) {
        if (this.field2812 == 0 && this.field2809 == 0) {
            this.method6(arg2);
        } else {
            class25 var4 = (class25) super.field8;
            int var5 = this.field2803 << 8;
            int var6 = this.field2815 << 8;
            int var7 = var4.field275.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2806 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2817 < 0) {
                if (this.field2813 <= 0) {
                    this.method1296();
                    this.method3065(-17363);
                    return;
                }
                this.field2817 = 0;
            }
            if (this.field2817 >= var7) {
                if (this.field2813 >= 0) {
                    this.method1296();
                    this.method3065(-17363);
                    return;
                }
                this.field2817 = var7 - 1;
            }
            if (this.field2806 < 0) {
                if (this.field2814) {
                    if (this.field2813 < 0) {
                        var9 = this.method1291(arg0, arg1, var5, var10, var4.field275[this.field2803]);
                        if (this.field2817 >= var5) {
                            return;
                        }
                        this.field2817 = var5 + var5 - 1 - this.field2817;
                        this.field2813 = -this.field2813;
                    }
                    while (true) {
                        int var11 = this.method1320(arg0, var9, var6, var10, var4.field275[this.field2815 - 1]);
                        if (this.field2817 < var6) {
                            return;
                        }
                        this.field2817 = var6 + var6 - 1 - this.field2817;
                        this.field2813 = -this.field2813;
                        var9 = this.method1291(arg0, var11, var5, var10, var4.field275[this.field2803]);
                        if (this.field2817 >= var5) {
                            return;
                        }
                        this.field2817 = var5 + var5 - 1 - this.field2817;
                        this.field2813 = -this.field2813;
                    }
                } else if (this.field2813 < 0) {
                    while (true) {
                        var9 = this.method1291(arg0, var9, var5, var10, var4.field275[this.field2815 - 1]);
                        if (this.field2817 >= var5) {
                            return;
                        }
                        this.field2817 = var6 - 1 - (var6 - 1 - this.field2817) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1320(arg0, var9, var6, var10, var4.field275[this.field2803]);
                        if (this.field2817 < var6) {
                            return;
                        }
                        this.field2817 = (this.field2817 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2806 > 0) {
                    if (this.field2814) {
                        label130: {
                            if (this.field2813 < 0) {
                                var9 = this.method1291(arg0, arg1, var5, var10, var4.field275[this.field2803]);
                                if (this.field2817 >= var5) {
                                    return;
                                }
                                this.field2817 = var5 + var5 - 1 - this.field2817;
                                this.field2813 = -this.field2813;
                                if (--this.field2806 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1320(arg0, var9, var6, var10, var4.field275[this.field2815 - 1]);
                                if (this.field2817 < var6) {
                                    return;
                                }
                                this.field2817 = var6 + var6 - 1 - this.field2817;
                                this.field2813 = -this.field2813;
                                if (--this.field2806 == 0) {
                                    break;
                                }
                                var9 = this.method1291(arg0, var9, var5, var10, var4.field275[this.field2803]);
                                if (this.field2817 >= var5) {
                                    return;
                                }
                                this.field2817 = var5 + var5 - 1 - this.field2817;
                                this.field2813 = -this.field2813;
                            } while (--this.field2806 != 0);
                        }
                    } else if (this.field2813 < 0) {
                        while (true) {
                            var9 = this.method1291(arg0, var9, var5, var10, var4.field275[this.field2815 - 1]);
                            if (this.field2817 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2817) / var8;
                            if (var12 >= this.field2806) {
                                this.field2817 += this.field2806 * var8;
                                this.field2806 = 0;
                                break;
                            }
                            this.field2817 += var8 * var12;
                            this.field2806 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1320(arg0, var9, var6, var10, var4.field275[this.field2803]);
                            if (this.field2817 < var6) {
                                return;
                            }
                            int var13 = (this.field2817 - var5) / var8;
                            if (var13 >= this.field2806) {
                                this.field2817 -= this.field2806 * var8;
                                this.field2806 = 0;
                                break;
                            }
                            this.field2817 -= var8 * var13;
                            this.field2806 -= var13;
                        }
                    }
                }
                if (this.field2813 < 0) {
                    this.method1291(arg0, var9, 0, var10, 0);
                    if (this.field2817 < 0) {
                        this.field2817 = -1;
                        this.method1296();
                        this.method3065(-17363);
                        return;
                    }
                } else {
                    this.method1320(arg0, var9, var7, var10, 0);
                    if (this.field2817 >= var7) {
                        this.field2817 = var7;
                        this.method1296();
                        this.method3065(-17363);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[B[IIIIIIIIIILlu;II)I")
    private static final int method1293(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class194 arg13, int arg14, int arg15) {
        arg13.field2811 -= arg13.field2816 * arg5;
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
        arg13.field2811 += arg13.field2816 * var22;
        arg13.field2810 = arg6;
        arg13.field2805 = arg7;
        arg13.field2817 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()Lua;")
    public final class3 method4() {
        return null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Laaa;III)Llu;")
    public static final class194 method1294(class25 arg0, int arg1, int arg2, int arg3) {
        return arg0.field275 != null && arg0.field275.length != 0 ? new class194(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([B[IIIIIIIILlu;)I")
    private static final int method1295(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class194 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2810 += (var14 - arg3) * arg9.field2808;
        arg9.field2805 += (var14 - arg3) * arg9.field2804;
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
        arg9.field2811 = var12 >> 2;
        arg9.field2817 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "()V")
    private final void method1296() {
        if (this.field2809 != 0) {
            if (this.field2812 == Integer.MIN_VALUE) {
                this.field2812 = 0;
            }
            this.field2809 = 0;
            this.method1313();
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
    private final synchronized void method1297(int arg0, int arg1) {
        this.field2812 = arg0;
        this.field2807 = arg1;
        this.field2809 = 0;
        this.method1313();
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "()I")
    public final int method7() {
        int var1 = this.field2811 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2806 == 0) {
            var2 -= this.field2817 * var2 / (((class25) super.field8).field275.length << 8);
        } else if (this.field2806 >= 0) {
            var2 -= this.field2803 * var2 / ((class25) super.field8).field275.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(II)I")
    private static final int method1298(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I[B[IIIIIIIIIILlu;)I")
    private static final int method1299(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class194 arg12) {
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
        arg12.field2811 += (var19 - arg4) * arg12.field2816;
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
        arg12.field2810 = var15 >> 2;
        arg12.field2805 = var16 >> 2;
        arg12.field2817 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "()I")
    public final synchronized int method1300() {
        return this.field2807 < 0 ? -1 : this.field2807;
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V")
    public final synchronized void method1301(int arg0) {
        this.field2806 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)V")
    public final synchronized void method1302(int arg0) {
        int var2 = ((class25) super.field8).field275.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2817 = arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
    public final synchronized void method1303(boolean arg0) {
        this.field2813 = (this.field2813 >>> 31) + (this.field2813 ^ this.field2813 >> 31);
        if (arg0) {
            this.field2813 = -this.field2813;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II[B[IIIIIIIIIILlu;II)I")
    private static final int method1304(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class194 arg13, int arg14, int arg15) {
        arg13.field2811 -= arg13.field2816 * arg5;
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
        arg13.field2811 += arg13.field2816 * var22;
        arg13.field2810 = arg6;
        arg13.field2805 = arg7;
        arg13.field2817 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "()I")
    public final int method5() {
        return this.field2812 == 0 && this.field2809 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "()Z")
    public final boolean method1305() {
        return this.field2817 < 0 || this.field2817 >= ((class25) super.field8).field275.length << 8;
    }

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "()I")
    public final synchronized int method1306() {
        return this.field2813 < 0 ? -this.field2813 : this.field2813;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([B[IIIIIIILlu;)I")
    private static final int method1307(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class194 arg8) {
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
        arg8.field2817 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(II[B[IIIIIIIILlu;II)I")
    private static final int method1308(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class194 arg11, int arg12, int arg13) {
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
        arg11.field2817 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(II)V")
    public final synchronized void method1309(int arg0, int arg1) {
        this.method1311(arg0, arg1, this.method1300());
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        if (this.field2809 > 0) {
            if (arg0 >= this.field2809) {
                if (this.field2812 == Integer.MIN_VALUE) {
                    this.field2812 = 0;
                    this.field2811 = this.field2810 = this.field2805 = 0;
                    this.method3065(-17363);
                    arg0 = this.field2809;
                }
                this.field2809 = 0;
                this.method1313();
            } else {
                this.field2811 += this.field2816 * arg0;
                this.field2810 += this.field2808 * arg0;
                this.field2805 += this.field2804 * arg0;
                this.field2809 -= arg0;
            }
        }
        class25 var2 = (class25) super.field8;
        int var3 = this.field2803 << 8;
        int var4 = this.field2815 << 8;
        int var5 = var2.field275.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2806 = 0;
        }
        if (this.field2817 < 0) {
            if (this.field2813 <= 0) {
                this.method1296();
                this.method3065(-17363);
                return;
            }
            this.field2817 = 0;
        }
        if (this.field2817 >= var5) {
            if (this.field2813 >= 0) {
                this.method1296();
                this.method3065(-17363);
                return;
            }
            this.field2817 = var5 - 1;
        }
        this.field2817 += this.field2813 * arg0;
        if (this.field2806 < 0) {
            if (!this.field2814) {
                if (this.field2813 < 0) {
                    if (this.field2817 < var3) {
                        this.field2817 = var4 - 1 - (var4 - 1 - this.field2817) % var6;
                    }
                } else if (this.field2817 >= var4) {
                    this.field2817 = (this.field2817 - var3) % var6 + var3;
                }
            } else {
                if (this.field2813 < 0) {
                    if (this.field2817 >= var3) {
                        return;
                    }
                    this.field2817 = var3 + var3 - 1 - this.field2817;
                    this.field2813 = -this.field2813;
                }
                while (this.field2817 >= var4) {
                    this.field2817 = var4 + var4 - 1 - this.field2817;
                    this.field2813 = -this.field2813;
                    if (this.field2817 >= var3) {
                        return;
                    }
                    this.field2817 = var3 + var3 - 1 - this.field2817;
                    this.field2813 = -this.field2813;
                }
            }
        } else {
            if (this.field2806 > 0) {
                if (this.field2814) {
                    label125: {
                        if (this.field2813 < 0) {
                            if (this.field2817 >= var3) {
                                return;
                            }
                            this.field2817 = var3 + var3 - 1 - this.field2817;
                            this.field2813 = -this.field2813;
                            if (--this.field2806 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2817 < var4) {
                                return;
                            }
                            this.field2817 = var4 + var4 - 1 - this.field2817;
                            this.field2813 = -this.field2813;
                            if (--this.field2806 == 0) {
                                break;
                            }
                            if (this.field2817 >= var3) {
                                return;
                            }
                            this.field2817 = var3 + var3 - 1 - this.field2817;
                            this.field2813 = -this.field2813;
                        } while (--this.field2806 != 0);
                    }
                } else if (this.field2813 < 0) {
                    if (this.field2817 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2817) / var6;
                    if (var7 < this.field2806) {
                        this.field2817 += var6 * var7;
                        this.field2806 -= var7;
                        return;
                    }
                    this.field2817 += this.field2806 * var6;
                    this.field2806 = 0;
                } else {
                    if (this.field2817 < var4) {
                        return;
                    }
                    int var8 = (this.field2817 - var3) / var6;
                    if (var8 < this.field2806) {
                        this.field2817 -= var6 * var8;
                        this.field2806 -= var8;
                        return;
                    }
                    this.field2817 -= this.field2806 * var6;
                    this.field2806 = 0;
                }
            }
            if (this.field2813 < 0) {
                if (this.field2817 < 0) {
                    this.field2817 = -1;
                    this.method1296();
                    this.method3065(-17363);
                    return;
                }
            } else if (this.field2817 >= var5) {
                this.field2817 = var5;
                this.method1296();
                this.method3065(-17363);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "([B[IIIIIIILlu;)I")
    private static final int method1310(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class194 arg8) {
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
        arg8.field2817 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
    public final synchronized void method1311(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1297(arg1, arg2);
        } else {
            int var4 = method1298(arg1, arg2);
            int var5 = method1285(arg1, arg2);
            if (this.field2810 == var4 && this.field2805 == var5) {
                this.field2809 = 0;
            } else {
                int var6 = arg1 - this.field2811;
                if (this.field2811 - arg1 > var6) {
                    var6 = this.field2811 - arg1;
                }
                if (var4 - this.field2810 > var6) {
                    var6 = var4 - this.field2810;
                }
                if (this.field2810 - var4 > var6) {
                    var6 = this.field2810 - var4;
                }
                if (var5 - this.field2805 > var6) {
                    var6 = var5 - this.field2805;
                }
                if (this.field2805 - var5 > var6) {
                    var6 = this.field2805 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2809 = arg0;
                this.field2812 = arg1;
                this.field2807 = arg2;
                this.field2816 = (arg1 - this.field2811) / arg0;
                this.field2808 = (var4 - this.field2810) / arg0;
                this.field2804 = (var5 - this.field2805) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V")
    public final synchronized void method1312(int arg0) {
        this.method1297(this.method1288(), arg0);
    }

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "()V")
    private final void method1313() {
        this.field2811 = this.field2812;
        this.field2810 = method1298(this.field2812, this.field2807);
        this.field2805 = method1285(this.field2812, this.field2807);
    }

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "(I)V")
    private final synchronized void method1314(int arg0) {
        this.method1297(arg0, this.method1300());
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(II[B[IIIIIIILlu;II)I")
    private static final int method1315(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class194 arg10, int arg11, int arg12) {
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
        arg10.field2817 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "(I)V")
    public final synchronized void method1316(int arg0) {
        if (arg0 == 0) {
            this.method1314(0);
            this.method3065(-17363);
        } else if (this.field2810 == 0 && this.field2805 == 0) {
            this.field2809 = 0;
            this.field2812 = 0;
            this.field2811 = 0;
            this.method3065(-17363);
        } else {
            int var2 = -this.field2811;
            if (this.field2811 > var2) {
                var2 = this.field2811;
            }
            if (-this.field2810 > var2) {
                var2 = -this.field2810;
            }
            if (this.field2810 > var2) {
                var2 = this.field2810;
            }
            if (-this.field2805 > var2) {
                var2 = -this.field2805;
            }
            if (this.field2805 > var2) {
                var2 = this.field2805;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2809 = arg0;
            this.field2812 = Integer.MIN_VALUE;
            this.field2816 = -this.field2811 / arg0;
            this.field2808 = -this.field2810 / arg0;
            this.field2804 = -this.field2805 / arg0;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "([B[IIIIIIIILlu;)I")
    private static final int method1317(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class194 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2810 += (var14 - arg3) * arg9.field2808;
        arg9.field2805 += (var14 - arg3) * arg9.field2804;
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
        arg9.field2811 = var12 >> 2;
        arg9.field2817 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "(I)V")
    public final synchronized void method1318(int arg0) {
        this.method1297(arg0 << 6, this.method1300());
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(II[B[IIIIIIIILlu;II)I")
    private static final int method1319(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class194 arg11, int arg12, int arg13) {
        arg11.field2810 -= arg11.field2808 * arg5;
        arg11.field2805 -= arg11.field2804 * arg5;
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
        arg11.field2810 += arg11.field2808 * arg5;
        arg11.field2805 += arg11.field2804 * arg5;
        arg11.field2811 = arg6;
        arg11.field2817 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "([IIIII)I")
    private final int method1320(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2809 <= 0) {
                if (this.field2813 == 256 && (this.field2817 & 255) == 0) {
                    if (class379.field5336) {
                        return method1287(0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, 0, arg3, arg2, this);
                    }
                    return method1310(((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, 0, arg3, arg2, this);
                }
                if (class379.field5336) {
                    return method1292(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, 0, arg3, arg2, this, this.field2813, arg4);
                }
                return method1286(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, 0, arg3, arg2, this, this.field2813, arg4);
            }
            int var6 = this.field2809 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2809 += arg1;
            if (this.field2813 == 256 && (this.field2817 & 255) == 0) {
                if (class379.field5336) {
                    arg1 = method1299(0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, this.field2808, this.field2804, 0, var6, arg2, this);
                } else {
                    arg1 = method1295(((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, this.field2816, 0, var6, arg2, this);
                }
            } else if (class379.field5336) {
                arg1 = method1304(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2810, this.field2805, this.field2808, this.field2804, 0, var6, arg2, this, this.field2813, arg4);
            } else {
                arg1 = method1319(0, 0, ((class25) super.field8).field275, arg0, this.field2817, arg1, this.field2811, this.field2816, 0, var6, arg2, this, this.field2813, arg4);
            }
            this.field2809 -= arg1;
            if (this.field2809 != 0) {
                return arg1;
            }
        } while (!this.method1290());
        return arg3;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Laaa;III)V")
    private class194(class25 arg0, int arg1, int arg2, int arg3) {
        super.field8 = arg0;
        this.field2803 = arg0.field273;
        this.field2815 = arg0.field277;
        this.field2814 = arg0.field276;
        this.field2813 = arg1;
        this.field2812 = arg2;
        this.field2807 = arg3;
        this.field2817 = 0;
        this.method1313();
    }
}
