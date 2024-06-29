import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class421 extends class55 {

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    private int field5971;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    private int field5970;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Z")
    private boolean field5979;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    private int field5966;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private int field5973;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    private int field5968;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    private int field5969;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    private int field5965;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    private int field5967;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    private int field5972;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private int field5975;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    private int field5976;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    private int field5977;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    private int field5978;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V", line = 3)
    private final void method2640() {
        this.field5976 = this.field5973;
        this.field5967 = method2653(this.field5973, this.field5968);
        this.field5975 = method2652(this.field5973, this.field5968);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[B[IIIIIIIIIILdd;)I", line = 9)
    private static final int method2641(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class421 arg12) {
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
        arg12.field5976 += (var19 - arg4) * arg12.field5972;
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
        arg12.field5967 = var15 >> 2;
        arg12.field5975 = var16 >> 2;
        arg12.field5969 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 62)
    public final synchronized void method2642(int arg0) {
        this.method2656(arg0 << 6, this.method2651());
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[B[IIIIIIIILdd;II)I", line = 66)
    private static final int method2643(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class421 arg11, int arg12, int arg13) {
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
        arg11.field5969 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II[B[IIIIIIIILdd;II)I", line = 98)
    private static final int method2644(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class421 arg11, int arg12, int arg13) {
        arg11.field5967 -= arg11.field5977 * arg5;
        arg11.field5975 -= arg11.field5974 * arg5;
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
        arg11.field5967 += arg11.field5977 * arg5;
        arg11.field5975 += arg11.field5974 * arg5;
        arg11.field5976 = arg6;
        arg11.field5969 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "()Z", line = 132)
    private final boolean method2645() {
        int var1 = this.field5973;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2653(var1, this.field5968);
            var2 = method2652(var1, this.field5968);
        }
        if (this.field5976 == var1 && this.field5967 == var3 && this.field5975 == var2) {
            if (this.field5973 == Integer.MIN_VALUE) {
                this.field5973 = 0;
                this.field5976 = this.field5967 = this.field5975 = 0;
                this.method2467((byte) -87);
                return true;
            } else {
                this.method2640();
                return false;
            }
        } else {
            if (this.field5976 < var1) {
                this.field5972 = 1;
                this.field5965 = var1 - this.field5976;
            } else if (this.field5976 > var1) {
                this.field5972 = -1;
                this.field5965 = this.field5976 - var1;
            } else {
                this.field5972 = 0;
            }
            if (this.field5967 < var3) {
                this.field5977 = 1;
                if (this.field5965 == 0 || this.field5965 > var3 - this.field5967) {
                    this.field5965 = var3 - this.field5967;
                }
            } else if (this.field5967 > var3) {
                this.field5977 = -1;
                if (this.field5965 == 0 || this.field5965 > this.field5967 - var3) {
                    this.field5965 = this.field5967 - var3;
                }
            } else {
                this.field5977 = 0;
            }
            if (this.field5975 < var2) {
                this.field5974 = 1;
                if (this.field5965 == 0 || this.field5965 > var2 - this.field5975) {
                    this.field5965 = var2 - this.field5975;
                }
            } else if (this.field5975 > var2) {
                this.field5974 = -1;
                if (this.field5965 == 0 || this.field5965 > this.field5975 - var2) {
                    this.field5965 = this.field5975 - var2;
                }
            } else {
                this.field5974 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([B[IIIIIIILdd;)I", line = 217)
    private static final int method2646(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class421 arg8) {
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
        arg8.field5969 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([B[IIIIIIIILdd;)I", line = 245)
    private static final int method2647(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class421 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5967 += (var14 - arg3) * arg9.field5977;
        arg9.field5975 += (var14 - arg3) * arg9.field5974;
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
        arg9.field5976 = var12 >> 2;
        arg9.field5969 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II[B[IIIIIIIILdd;II)I", line = 283)
    private static final int method2648(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class421 arg11, int arg12, int arg13) {
        arg11.field5967 -= arg11.field5977 * arg5;
        arg11.field5975 -= arg11.field5974 * arg5;
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
        arg11.field5967 += arg11.field5977 * arg5;
        arg11.field5975 += arg11.field5974 * arg5;
        arg11.field5976 = arg6;
        arg11.field5969 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[B[IIIIIIILdd;II)I", line = 316)
    private static final int method2649(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class421 arg10, int arg11, int arg12) {
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
        arg10.field5969 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([B[IIIIIIILdd;)I", line = 343)
    private static final int method2650(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class421 arg8) {
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
        arg8.field5969 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "()I", line = 368)
    public final synchronized int method2651() {
        return this.field5968 < 0 ? -1 : this.field5968;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 371)
    private static final int method2652(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([III)V", line = 374)
    public final synchronized void method452(int[] arg0, int arg1, int arg2) {
        if (this.field5973 == 0 && this.field5965 == 0) {
            this.method455(arg2);
        } else {
            class256 var4 = (class256) super.field757;
            int var5 = this.field5971 << 8;
            int var6 = this.field5970 << 8;
            int var7 = var4.field3590.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5978 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5969 < 0) {
                if (this.field5966 <= 0) {
                    this.method2676();
                    this.method2467((byte) 66);
                    return;
                }
                this.field5969 = 0;
            }
            if (this.field5969 >= var7) {
                if (this.field5966 >= 0) {
                    this.method2676();
                    this.method2467((byte) 116);
                    return;
                }
                this.field5969 = var7 - 1;
            }
            if (this.field5978 < 0) {
                if (this.field5979) {
                    if (this.field5966 < 0) {
                        var9 = this.method2659(arg0, arg1, var5, var10, var4.field3590[this.field5971]);
                        if (this.field5969 >= var5) {
                            return;
                        }
                        this.field5969 = var5 + var5 - 1 - this.field5969;
                        this.field5966 = -this.field5966;
                    }
                    while (true) {
                        int var11 = this.method2654(arg0, var9, var6, var10, var4.field3590[this.field5970 - 1]);
                        if (this.field5969 < var6) {
                            return;
                        }
                        this.field5969 = var6 + var6 - 1 - this.field5969;
                        this.field5966 = -this.field5966;
                        var9 = this.method2659(arg0, var11, var5, var10, var4.field3590[this.field5971]);
                        if (this.field5969 >= var5) {
                            return;
                        }
                        this.field5969 = var5 + var5 - 1 - this.field5969;
                        this.field5966 = -this.field5966;
                    }
                } else if (this.field5966 < 0) {
                    while (true) {
                        var9 = this.method2659(arg0, var9, var5, var10, var4.field3590[this.field5970 - 1]);
                        if (this.field5969 >= var5) {
                            return;
                        }
                        this.field5969 = var6 - 1 - (var6 - 1 - this.field5969) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2654(arg0, var9, var6, var10, var4.field3590[this.field5971]);
                        if (this.field5969 < var6) {
                            return;
                        }
                        this.field5969 = (this.field5969 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5978 > 0) {
                    if (this.field5979) {
                        label130: {
                            if (this.field5966 < 0) {
                                var9 = this.method2659(arg0, arg1, var5, var10, var4.field3590[this.field5971]);
                                if (this.field5969 >= var5) {
                                    return;
                                }
                                this.field5969 = var5 + var5 - 1 - this.field5969;
                                this.field5966 = -this.field5966;
                                if (--this.field5978 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2654(arg0, var9, var6, var10, var4.field3590[this.field5970 - 1]);
                                if (this.field5969 < var6) {
                                    return;
                                }
                                this.field5969 = var6 + var6 - 1 - this.field5969;
                                this.field5966 = -this.field5966;
                                if (--this.field5978 == 0) {
                                    break;
                                }
                                var9 = this.method2659(arg0, var9, var5, var10, var4.field3590[this.field5971]);
                                if (this.field5969 >= var5) {
                                    return;
                                }
                                this.field5969 = var5 + var5 - 1 - this.field5969;
                                this.field5966 = -this.field5966;
                            } while (--this.field5978 != 0);
                        }
                    } else if (this.field5966 < 0) {
                        while (true) {
                            var9 = this.method2659(arg0, var9, var5, var10, var4.field3590[this.field5970 - 1]);
                            if (this.field5969 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5969) / var8;
                            if (var12 >= this.field5978) {
                                this.field5969 += this.field5978 * var8;
                                this.field5978 = 0;
                                break;
                            }
                            this.field5969 += var8 * var12;
                            this.field5978 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2654(arg0, var9, var6, var10, var4.field3590[this.field5971]);
                            if (this.field5969 < var6) {
                                return;
                            }
                            int var13 = (this.field5969 - var5) / var8;
                            if (var13 >= this.field5978) {
                                this.field5969 -= this.field5978 * var8;
                                this.field5978 = 0;
                                break;
                            }
                            this.field5969 -= var8 * var13;
                            this.field5978 -= var13;
                        }
                    }
                }
                if (this.field5966 < 0) {
                    this.method2659(arg0, var9, 0, var10, 0);
                    if (this.field5969 < 0) {
                        this.field5969 = -1;
                        this.method2676();
                        this.method2467((byte) -68);
                        return;
                    }
                } else {
                    this.method2654(arg0, var9, var7, var10, 0);
                    if (this.field5969 >= var7) {
                        this.field5969 = var7;
                        this.method2676();
                        this.method2467((byte) -114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I", line = 609)
    private static final int method2653(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIIII)I", line = 612)
    private final int method2654(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5965 <= 0) {
                if (this.field5966 == 256 && (this.field5969 & 255) == 0) {
                    if (class247.field3492) {
                        return method2671(0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, 0, arg3, arg2, this);
                    }
                    return method2650(((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, 0, arg3, arg2, this);
                }
                if (class247.field3492) {
                    return method2661(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, 0, arg3, arg2, this, this.field5966, arg4);
                }
                return method2649(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, 0, arg3, arg2, this, this.field5966, arg4);
            }
            int var6 = this.field5965 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5965 += arg1;
            if (this.field5966 == 256 && (this.field5969 & 255) == 0) {
                if (class247.field3492) {
                    arg1 = method2641(0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, this.field5977, this.field5974, 0, var6, arg2, this);
                } else {
                    arg1 = method2677(((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, this.field5972, 0, var6, arg2, this);
                }
            } else if (class247.field3492) {
                arg1 = method2665(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, this.field5977, this.field5974, 0, var6, arg2, this, this.field5966, arg4);
            } else {
                arg1 = method2648(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, this.field5972, 0, var6, arg2, this, this.field5966, arg4);
            }
            this.field5965 -= arg1;
            if (this.field5965 != 0) {
                return arg1;
            }
        } while (!this.method2645());
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lvj;II)Ldd;", line = 667)
    public static final class421 method2655(class256 arg0, int arg1, int arg2) {
        return arg0.field3590 != null && arg0.field3590.length != 0 ? new class421(arg0, (int) ((long) arg0.field3594 * 256L * (long) arg1 / (long) (class76.field1094 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)V", line = 673)
    private final synchronized void method2656(int arg0, int arg1) {
        this.field5973 = arg0;
        this.field5968 = arg1;
        this.field5965 = 0;
        this.method2640();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[B[IIIIIIIIIILdd;II)I", line = 679)
    private static final int method2657(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class421 arg13, int arg14, int arg15) {
        arg13.field5976 -= arg13.field5972 * arg5;
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
        arg13.field5976 += arg13.field5972 * var22;
        arg13.field5967 = arg6;
        arg13.field5975 = arg7;
        arg13.field5969 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 720)
    public final synchronized void method2658(int arg0) {
        if (this.field5966 < 0) {
            this.field5966 = -arg0;
        } else {
            this.field5966 = arg0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([IIIII)I", line = 727)
    private final int method2659(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5965 <= 0) {
                if (this.field5966 == -256 && (this.field5969 & 255) == 0) {
                    if (class247.field3492) {
                        return method2660(0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, 0, arg3, arg2, this);
                    }
                    return method2646(((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, 0, arg3, arg2, this);
                }
                if (class247.field3492) {
                    return method2643(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, 0, arg3, arg2, this, this.field5966, arg4);
                }
                return method2664(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, 0, arg3, arg2, this, this.field5966, arg4);
            }
            int var6 = this.field5965 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5965 += arg1;
            if (this.field5966 == -256 && (this.field5969 & 255) == 0) {
                if (class247.field3492) {
                    arg1 = method2662(0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, this.field5977, this.field5974, 0, var6, arg2, this);
                } else {
                    arg1 = method2647(((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, this.field5972, 0, var6, arg2, this);
                }
            } else if (class247.field3492) {
                arg1 = method2657(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5967, this.field5975, this.field5977, this.field5974, 0, var6, arg2, this, this.field5966, arg4);
            } else {
                arg1 = method2644(0, 0, ((class256) super.field757).field3590, arg0, this.field5969, arg1, this.field5976, this.field5972, 0, var6, arg2, this, this.field5966, arg4);
            }
            this.field5965 -= arg1;
            if (this.field5965 != 0) {
                return arg1;
            }
        } while (!this.method2645());
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[B[IIIIIIIILdd;)I", line = 782)
    private static final int method2660(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class421 arg10) {
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
        arg10.field5969 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 820)
    public final synchronized void method455(int arg0) {
        if (this.field5965 > 0) {
            if (arg0 >= this.field5965) {
                if (this.field5973 == Integer.MIN_VALUE) {
                    this.field5973 = 0;
                    this.field5976 = this.field5967 = this.field5975 = 0;
                    this.method2467((byte) 74);
                    arg0 = this.field5965;
                }
                this.field5965 = 0;
                this.method2640();
            } else {
                this.field5976 += this.field5972 * arg0;
                this.field5967 += this.field5977 * arg0;
                this.field5975 += this.field5974 * arg0;
                this.field5965 -= arg0;
            }
        }
        class256 var2 = (class256) super.field757;
        int var3 = this.field5971 << 8;
        int var4 = this.field5970 << 8;
        int var5 = var2.field3590.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5978 = 0;
        }
        if (this.field5969 < 0) {
            if (this.field5966 <= 0) {
                this.method2676();
                this.method2467((byte) 112);
                return;
            }
            this.field5969 = 0;
        }
        if (this.field5969 >= var5) {
            if (this.field5966 >= 0) {
                this.method2676();
                this.method2467((byte) -60);
                return;
            }
            this.field5969 = var5 - 1;
        }
        this.field5969 += this.field5966 * arg0;
        if (this.field5978 < 0) {
            if (!this.field5979) {
                if (this.field5966 < 0) {
                    if (this.field5969 < var3) {
                        this.field5969 = var4 - 1 - (var4 - 1 - this.field5969) % var6;
                    }
                } else if (this.field5969 >= var4) {
                    this.field5969 = (this.field5969 - var3) % var6 + var3;
                }
            } else {
                if (this.field5966 < 0) {
                    if (this.field5969 >= var3) {
                        return;
                    }
                    this.field5969 = var3 + var3 - 1 - this.field5969;
                    this.field5966 = -this.field5966;
                }
                while (this.field5969 >= var4) {
                    this.field5969 = var4 + var4 - 1 - this.field5969;
                    this.field5966 = -this.field5966;
                    if (this.field5969 >= var3) {
                        return;
                    }
                    this.field5969 = var3 + var3 - 1 - this.field5969;
                    this.field5966 = -this.field5966;
                }
            }
        } else {
            if (this.field5978 > 0) {
                if (this.field5979) {
                    label125: {
                        if (this.field5966 < 0) {
                            if (this.field5969 >= var3) {
                                return;
                            }
                            this.field5969 = var3 + var3 - 1 - this.field5969;
                            this.field5966 = -this.field5966;
                            if (--this.field5978 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5969 < var4) {
                                return;
                            }
                            this.field5969 = var4 + var4 - 1 - this.field5969;
                            this.field5966 = -this.field5966;
                            if (--this.field5978 == 0) {
                                break;
                            }
                            if (this.field5969 >= var3) {
                                return;
                            }
                            this.field5969 = var3 + var3 - 1 - this.field5969;
                            this.field5966 = -this.field5966;
                        } while (--this.field5978 != 0);
                    }
                } else if (this.field5966 < 0) {
                    if (this.field5969 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5969) / var6;
                    if (var7 < this.field5978) {
                        this.field5969 += var6 * var7;
                        this.field5978 -= var7;
                        return;
                    }
                    this.field5969 += this.field5978 * var6;
                    this.field5978 = 0;
                } else {
                    if (this.field5969 < var4) {
                        return;
                    }
                    int var8 = (this.field5969 - var3) / var6;
                    if (var8 < this.field5978) {
                        this.field5969 -= var6 * var8;
                        this.field5978 -= var8;
                        return;
                    }
                    this.field5969 -= this.field5978 * var6;
                    this.field5978 = 0;
                }
            }
            if (this.field5966 < 0) {
                if (this.field5969 < 0) {
                    this.field5969 = -1;
                    this.method2676();
                    this.method2467((byte) -75);
                    return;
                }
            } else if (this.field5969 >= var5) {
                this.field5969 = var5;
                this.method2676();
                this.method2467((byte) 69);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II[B[IIIIIIIILdd;II)I", line = 1041)
    private static final int method2661(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class421 arg11, int arg12, int arg13) {
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
        arg11.field5969 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I[B[IIIIIIIIIILdd;)I", line = 1074)
    private static final int method2662(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class421 arg12) {
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
        arg12.field5976 += (var19 - arg4) * arg12.field5972;
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
        arg12.field5967 = var15 >> 2;
        arg12.field5975 = var16 >> 2;
        arg12.field5969 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V", line = 1127)
    public final synchronized void method2663(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2656(arg1, arg2);
        } else {
            int var4 = method2653(arg1, arg2);
            int var5 = method2652(arg1, arg2);
            if (this.field5967 == var4 && this.field5975 == var5) {
                this.field5965 = 0;
            } else {
                int var6 = arg1 - this.field5976;
                if (this.field5976 - arg1 > var6) {
                    var6 = this.field5976 - arg1;
                }
                if (var4 - this.field5967 > var6) {
                    var6 = var4 - this.field5967;
                }
                if (this.field5967 - var4 > var6) {
                    var6 = this.field5967 - var4;
                }
                if (var5 - this.field5975 > var6) {
                    var6 = var5 - this.field5975;
                }
                if (this.field5975 - var5 > var6) {
                    var6 = this.field5975 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5965 = arg0;
                this.field5973 = arg1;
                this.field5968 = arg2;
                this.field5972 = (arg1 - this.field5976) / arg0;
                this.field5977 = (var4 - this.field5967) / arg0;
                this.field5974 = (var5 - this.field5975) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()Ler;", line = 1173)
    public final class55 method454() {
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II[B[IIIIIIILdd;II)I", line = 1178)
    private static final int method2664(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class421 arg10, int arg11, int arg12) {
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
        arg10.field5969 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II[B[IIIIIIIIIILdd;II)I", line = 1204)
    private static final int method2665(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class421 arg13, int arg14, int arg15) {
        arg13.field5976 -= arg13.field5972 * arg5;
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
        arg13.field5976 += arg13.field5972 * var22;
        arg13.field5967 = arg6;
        arg13.field5975 = arg7;
        arg13.field5969 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()I", line = 1246)
    public final int method451() {
        return this.field5973 == 0 && this.field5965 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 1255)
    public final synchronized void method2666(int arg0) {
        int var2 = ((class256) super.field757).field3590.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5969 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 1269)
    private final synchronized void method2667(int arg0) {
        this.method2656(arg0, this.method2651());
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I", line = 1273)
    public final int method449() {
        int var1 = this.field5976 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5978 == 0) {
            var2 -= this.field5969 * var2 / (((class256) super.field757).field3590.length << 8);
        } else if (this.field5978 >= 0) {
            var2 -= this.field5971 * var2 / ((class256) super.field757).field3590.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 1288)
    public final synchronized void method2668(int arg0) {
        if (arg0 == 0) {
            this.method2667(0);
            this.method2467((byte) 87);
        } else if (this.field5967 == 0 && this.field5975 == 0) {
            this.field5965 = 0;
            this.field5973 = 0;
            this.field5976 = 0;
            this.method2467((byte) -91);
        } else {
            int var2 = -this.field5976;
            if (this.field5976 > var2) {
                var2 = this.field5976;
            }
            if (-this.field5967 > var2) {
                var2 = -this.field5967;
            }
            if (this.field5967 > var2) {
                var2 = this.field5967;
            }
            if (-this.field5975 > var2) {
                var2 = -this.field5975;
            }
            if (this.field5975 > var2) {
                var2 = this.field5975;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5965 = arg0;
            this.field5973 = Integer.MIN_VALUE;
            this.field5972 = -this.field5976 / arg0;
            this.field5977 = -this.field5967 / arg0;
            this.field5974 = -this.field5975 / arg0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 1334)
    public final synchronized void method2669(boolean arg0) {
        this.field5966 = (this.field5966 >>> 31) + (this.field5966 ^ this.field5966 >> 31);
        if (arg0) {
            this.field5966 = -this.field5966;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)V", line = 1341)
    public final synchronized void method2670(int arg0, int arg1) {
        this.method2663(arg0, arg1, this.method2651());
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I[B[IIIIIIIILdd;)I", line = 1345)
    private static final int method2671(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class421 arg10) {
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
        arg10.field5969 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "()Z", line = 1383)
    public final boolean method2672() {
        return this.field5965 != 0;
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "()Z", line = 1386)
    public final boolean method2673() {
        return this.field5969 < 0 || this.field5969 >= ((class256) super.field757).field3590.length << 8;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lvj;III)Ldd;", line = 1389)
    public static final class421 method2674(class256 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3590 != null && arg0.field3590.length != 0 ? new class421(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()Ler;", line = 1395)
    public final class55 method453() {
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "()I", line = 1398)
    public final synchronized int method2675() {
        return this.field5966 < 0 ? -this.field5966 : this.field5966;
    }

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "()V", line = 1401)
    private final void method2676() {
        if (this.field5965 != 0) {
            if (this.field5973 == Integer.MIN_VALUE) {
                this.field5973 = 0;
            }
            this.field5965 = 0;
            this.method2640();
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([B[IIIIIIIILdd;)I", line = 1415)
    private static final int method2677(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class421 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5967 += (var14 - arg3) * arg9.field5977;
        arg9.field5975 += (var14 - arg3) * arg9.field5974;
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
        arg9.field5976 = var12 >> 2;
        arg9.field5969 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lvj;II)V", line = 1449)
    private class421(class256 arg0, int arg1, int arg2) {
        super.field757 = arg0;
        this.field5971 = arg0.field3591;
        this.field5970 = arg0.field3593;
        this.field5979 = arg0.field3592;
        this.field5966 = arg1;
        this.field5973 = arg2;
        this.field5968 = 8192;
        this.field5969 = 0;
        this.method2640();
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lvj;III)V", line = 1460)
    private class421(class256 arg0, int arg1, int arg2, int arg3) {
        super.field757 = arg0;
        this.field5971 = arg0.field3591;
        this.field5970 = arg0.field3593;
        this.field5979 = arg0.field3592;
        this.field5966 = arg1;
        this.field5973 = arg2;
        this.field5968 = arg3;
        this.field5969 = 0;
        this.method2640();
    }

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "()I", line = 1472)
    public final synchronized int method2678() {
        return this.field5973 == Integer.MIN_VALUE ? 0 : this.field5973;
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V", line = 1475)
    public final synchronized void method2679(int arg0) {
        this.field5978 = arg0;
    }
}
