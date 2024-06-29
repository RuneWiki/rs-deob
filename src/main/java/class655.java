import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class655 extends class48 {

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "I")
    private int field9310;

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
    private int field9317;

    @OriginalMember(owner = "client!bga", name = "A", descriptor = "Z")
    private boolean field9324;

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    private int field9318;

    @OriginalMember(owner = "client!bga", name = "x", descriptor = "I")
    private int field9321;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
    private int field9315;

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
    private int field9313;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "I")
    private int field9311;

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "I")
    private int field9312;

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
    private int field9314;

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
    private int field9316;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    private int field9319;

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
    private int field9320;

    @OriginalMember(owner = "client!bga", name = "y", descriptor = "I")
    private int field9322;

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "I")
    private int field9323;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II[B[IIIIIIIIIILbga;II)I")
    private static final int method3698(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class655 arg13, int arg14, int arg15) {
        arg13.field9320 -= arg13.field9312 * arg5;
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
        arg13.field9320 += arg13.field9312 * var22;
        arg13.field9323 = arg6;
        arg13.field9311 = arg7;
        arg13.field9313 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II[B[IIIIIIILbga;II)I")
    private static final int method3699(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class655 arg10, int arg11, int arg12) {
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
        arg10.field9313 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II[B[IIIIIIIILbga;II)I")
    private static final int method3700(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class655 arg11, int arg12, int arg13) {
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
        arg11.field9313 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[B[IIIIIIIILbga;)I")
    private static final int method3701(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class655 arg10) {
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
        arg10.field9313 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "()I")
    public final int method252() {
        return this.field9321 == 0 && this.field9316 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I[B[IIIIIIIILbga;)I")
    private static final int method3702(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class655 arg10) {
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
        arg10.field9313 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "()Leg;")
    public final class48 method254() {
        return null;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
    public final synchronized void method3703(int arg0) {
        if (arg0 == 0) {
            this.method3733(0);
            this.method242(true);
        } else if (this.field9323 == 0 && this.field9311 == 0) {
            this.field9316 = 0;
            this.field9321 = 0;
            this.field9320 = 0;
            this.method242(true);
        } else {
            int var2 = -this.field9320;
            if (this.field9320 > var2) {
                var2 = this.field9320;
            }
            if (-this.field9323 > var2) {
                var2 = -this.field9323;
            }
            if (this.field9323 > var2) {
                var2 = this.field9323;
            }
            if (-this.field9311 > var2) {
                var2 = -this.field9311;
            }
            if (this.field9311 > var2) {
                var2 = this.field9311;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field9316 = arg0;
            this.field9321 = Integer.MIN_VALUE;
            this.field9312 = -this.field9320 / arg0;
            this.field9322 = -this.field9323 / arg0;
            this.field9319 = -this.field9311 / arg0;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public final synchronized void method255(int arg0) {
        if (this.field9316 > 0) {
            if (arg0 >= this.field9316) {
                if (this.field9321 == Integer.MIN_VALUE) {
                    this.field9321 = 0;
                    this.field9320 = this.field9323 = this.field9311 = 0;
                    this.method242(true);
                    arg0 = this.field9316;
                }
                this.field9316 = 0;
                this.method3709();
            } else {
                this.field9320 += this.field9312 * arg0;
                this.field9323 += this.field9322 * arg0;
                this.field9311 += this.field9319 * arg0;
                this.field9316 -= arg0;
            }
        }
        class161 var2 = (class161) super.field564;
        int var3 = this.field9310 << 8;
        int var4 = this.field9317 << 8;
        int var5 = var2.field2314.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field9314 = 0;
        }
        if (this.field9313 < 0) {
            if (this.field9318 <= 0) {
                this.method3717();
                this.method242(true);
                return;
            }
            this.field9313 = 0;
        }
        if (this.field9313 >= var5) {
            if (this.field9318 >= 0) {
                this.method3717();
                this.method242(true);
                return;
            }
            this.field9313 = var5 - 1;
        }
        this.field9313 += this.field9318 * arg0;
        if (this.field9314 < 0) {
            if (!this.field9324) {
                if (this.field9318 < 0) {
                    if (this.field9313 < var3) {
                        this.field9313 = var4 - 1 - (var4 - 1 - this.field9313) % var6;
                    }
                } else if (this.field9313 >= var4) {
                    this.field9313 = (this.field9313 - var3) % var6 + var3;
                }
            } else {
                if (this.field9318 < 0) {
                    if (this.field9313 >= var3) {
                        return;
                    }
                    this.field9313 = var3 + var3 - 1 - this.field9313;
                    this.field9318 = -this.field9318;
                }
                while (this.field9313 >= var4) {
                    this.field9313 = var4 + var4 - 1 - this.field9313;
                    this.field9318 = -this.field9318;
                    if (this.field9313 >= var3) {
                        return;
                    }
                    this.field9313 = var3 + var3 - 1 - this.field9313;
                    this.field9318 = -this.field9318;
                }
            }
        } else {
            if (this.field9314 > 0) {
                if (this.field9324) {
                    label125: {
                        if (this.field9318 < 0) {
                            if (this.field9313 >= var3) {
                                return;
                            }
                            this.field9313 = var3 + var3 - 1 - this.field9313;
                            this.field9318 = -this.field9318;
                            if (--this.field9314 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field9313 < var4) {
                                return;
                            }
                            this.field9313 = var4 + var4 - 1 - this.field9313;
                            this.field9318 = -this.field9318;
                            if (--this.field9314 == 0) {
                                break;
                            }
                            if (this.field9313 >= var3) {
                                return;
                            }
                            this.field9313 = var3 + var3 - 1 - this.field9313;
                            this.field9318 = -this.field9318;
                        } while (--this.field9314 != 0);
                    }
                } else if (this.field9318 < 0) {
                    if (this.field9313 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field9313) / var6;
                    if (var7 < this.field9314) {
                        this.field9313 += var6 * var7;
                        this.field9314 -= var7;
                        return;
                    }
                    this.field9313 += this.field9314 * var6;
                    this.field9314 = 0;
                } else {
                    if (this.field9313 < var4) {
                        return;
                    }
                    int var8 = (this.field9313 - var3) / var6;
                    if (var8 < this.field9314) {
                        this.field9313 -= var6 * var8;
                        this.field9314 -= var8;
                        return;
                    }
                    this.field9313 -= this.field9314 * var6;
                    this.field9314 = 0;
                }
            }
            if (this.field9318 < 0) {
                if (this.field9313 < 0) {
                    this.field9313 = -1;
                    this.method3717();
                    this.method242(true);
                    return;
                }
            } else if (this.field9313 >= var5) {
                this.field9313 = var5;
                this.method3717();
                this.method242(true);
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([B[IIIIIIILbga;)I")
    private static final int method3704(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class655 arg8) {
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
        arg8.field9313 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "([B[IIIIIIILbga;)I")
    private static final int method3705(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class655 arg8) {
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
        arg8.field9313 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([IIIII)I")
    private final int method3706(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9316 <= 0) {
                if (this.field9318 == 256 && (this.field9313 & 255) == 0) {
                    if (class59.field747) {
                        return method3702(0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, 0, arg3, arg2, this);
                    }
                    return method3704(((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, 0, arg3, arg2, this);
                }
                if (class59.field747) {
                    return method3728(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, 0, arg3, arg2, this, this.field9318, arg4);
                }
                return method3699(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, 0, arg3, arg2, this, this.field9318, arg4);
            }
            int var6 = this.field9316 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9316 += arg1;
            if (this.field9318 == 256 && (this.field9313 & 255) == 0) {
                if (class59.field747) {
                    arg1 = method3712(0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, this.field9322, this.field9319, 0, var6, arg2, this);
                } else {
                    arg1 = method3724(((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, this.field9312, 0, var6, arg2, this);
                }
            } else if (class59.field747) {
                arg1 = method3731(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, this.field9322, this.field9319, 0, var6, arg2, this, this.field9318, arg4);
            } else {
                arg1 = method3714(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, this.field9312, 0, var6, arg2, this, this.field9318, arg4);
            }
            this.field9316 -= arg1;
            if (this.field9316 != 0) {
                return arg1;
            }
        } while (!this.method3711());
        return arg3;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "([IIIII)I")
    private final int method3707(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9316 <= 0) {
                if (this.field9318 == -256 && (this.field9313 & 255) == 0) {
                    if (class59.field747) {
                        return method3701(0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, 0, arg3, arg2, this);
                    }
                    return method3705(((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, 0, arg3, arg2, this);
                }
                if (class59.field747) {
                    return method3700(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, 0, arg3, arg2, this, this.field9318, arg4);
                }
                return method3736(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, 0, arg3, arg2, this, this.field9318, arg4);
            }
            int var6 = this.field9316 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9316 += arg1;
            if (this.field9318 == -256 && (this.field9313 & 255) == 0) {
                if (class59.field747) {
                    arg1 = method3725(0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, this.field9322, this.field9319, 0, var6, arg2, this);
                } else {
                    arg1 = method3737(((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, this.field9312, 0, var6, arg2, this);
                }
            } else if (class59.field747) {
                arg1 = method3698(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9323, this.field9311, this.field9322, this.field9319, 0, var6, arg2, this, this.field9318, arg4);
            } else {
                arg1 = method3720(0, 0, ((class161) super.field564).field2314, arg0, this.field9313, arg1, this.field9320, this.field9312, 0, var6, arg2, this, this.field9318, arg4);
            }
            this.field9316 -= arg1;
            if (this.field9316 != 0) {
                return arg1;
            }
        } while (!this.method3711());
        return arg3;
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)V")
    public final synchronized void method3708(int arg0) {
        if (this.field9318 < 0) {
            this.field9318 = -arg0;
        } else {
            this.field9318 = arg0;
        }
    }

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "()V")
    private final void method3709() {
        this.field9320 = this.field9321;
        this.field9323 = method3726(this.field9321, this.field9315);
        this.field9311 = method3718(this.field9321, this.field9315);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)V")
    private final synchronized void method3710(int arg0, int arg1) {
        this.field9321 = arg0;
        this.field9315 = arg1;
        this.field9316 = 0;
        this.method3709();
    }

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "()Z")
    private final boolean method3711() {
        int var1 = this.field9321;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3726(var1, this.field9315);
            var2 = method3718(var1, this.field9315);
        }
        if (this.field9320 == var1 && this.field9323 == var3 && this.field9311 == var2) {
            if (this.field9321 == Integer.MIN_VALUE) {
                this.field9321 = 0;
                this.field9320 = this.field9323 = this.field9311 = 0;
                this.method242(true);
                return true;
            } else {
                this.method3709();
                return false;
            }
        } else {
            if (this.field9320 < var1) {
                this.field9312 = 1;
                this.field9316 = var1 - this.field9320;
            } else if (this.field9320 > var1) {
                this.field9312 = -1;
                this.field9316 = this.field9320 - var1;
            } else {
                this.field9312 = 0;
            }
            if (this.field9323 < var3) {
                this.field9322 = 1;
                if (this.field9316 == 0 || this.field9316 > var3 - this.field9323) {
                    this.field9316 = var3 - this.field9323;
                }
            } else if (this.field9323 > var3) {
                this.field9322 = -1;
                if (this.field9316 == 0 || this.field9316 > this.field9323 - var3) {
                    this.field9316 = this.field9323 - var3;
                }
            } else {
                this.field9322 = 0;
            }
            if (this.field9311 < var2) {
                this.field9319 = 1;
                if (this.field9316 == 0 || this.field9316 > var2 - this.field9311) {
                    this.field9316 = var2 - this.field9311;
                }
            } else if (this.field9311 > var2) {
                this.field9319 = -1;
                if (this.field9316 == 0 || this.field9316 > this.field9311 - var2) {
                    this.field9316 = this.field9311 - var2;
                }
            } else {
                this.field9319 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[B[IIIIIIIIIILbga;)I")
    private static final int method3712(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class655 arg12) {
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
        arg12.field9320 += (var19 - arg4) * arg12.field9312;
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
        arg12.field9323 = var15 >> 2;
        arg12.field9311 = var16 >> 2;
        arg12.field9313 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "()Leg;")
    public final class48 method257() {
        return null;
    }

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "()I")
    public final synchronized int method3713() {
        return this.field9321 == Integer.MIN_VALUE ? 0 : this.field9321;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II[B[IIIIIIIILbga;II)I")
    private static final int method3714(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class655 arg11, int arg12, int arg13) {
        arg11.field9323 -= arg11.field9322 * arg5;
        arg11.field9311 -= arg11.field9319 * arg5;
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
        arg11.field9323 += arg11.field9322 * arg5;
        arg11.field9311 += arg11.field9319 * arg5;
        arg11.field9320 = arg6;
        arg11.field9313 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "()Z")
    public final boolean method3715() {
        return this.field9316 != 0;
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "()I")
    public final int method256() {
        int var1 = this.field9320 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field9314 == 0) {
            var2 -= this.field9313 * var2 / (((class161) super.field564).field2314.length << 8);
        } else if (this.field9314 >= 0) {
            var2 -= this.field9310 * var2 / ((class161) super.field564).field2314.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
    public final synchronized void method3716(boolean arg0) {
        this.field9318 = (this.field9318 >>> 31) + (this.field9318 ^ this.field9318 >> 31);
        if (arg0) {
            this.field9318 = -this.field9318;
        }
    }

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "()V")
    private final void method3717() {
        if (this.field9316 != 0) {
            if (this.field9321 == Integer.MIN_VALUE) {
                this.field9321 = 0;
            }
            this.field9316 = 0;
            this.method3709();
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)I")
    private static final int method3718(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(II)V")
    public final synchronized void method3719(int arg0, int arg1) {
        this.method3729(arg0, arg1, this.method3721());
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(II[B[IIIIIIIILbga;II)I")
    private static final int method3720(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class655 arg11, int arg12, int arg13) {
        arg11.field9323 -= arg11.field9322 * arg5;
        arg11.field9311 -= arg11.field9319 * arg5;
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
        arg11.field9323 += arg11.field9322 * arg5;
        arg11.field9311 += arg11.field9319 * arg5;
        arg11.field9320 = arg6;
        arg11.field9313 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "()I")
    public final synchronized int method3721() {
        return this.field9315 < 0 ? -1 : this.field9315;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lql;II)Lbga;")
    public static final class655 method3722(class161 arg0, int arg1, int arg2) {
        return arg0.field2314 != null && arg0.field2314.length != 0 ? new class655(arg0, (int) ((long) arg0.field2312 * 256L * (long) arg1 / (long) (class169.field2422 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
    public final synchronized void method3723(int arg0) {
        int var2 = ((class161) super.field564).field2314.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field9313 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([B[IIIIIIIILbga;)I")
    private static final int method3724(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class655 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field9323 += (var14 - arg3) * arg9.field9322;
        arg9.field9311 += (var14 - arg3) * arg9.field9319;
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
        arg9.field9320 = var12 >> 2;
        arg9.field9313 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I[B[IIIIIIIIIILbga;)I")
    private static final int method3725(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class655 arg12) {
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
        arg12.field9320 += (var19 - arg4) * arg12.field9312;
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
        arg12.field9323 = var15 >> 2;
        arg12.field9311 = var16 >> 2;
        arg12.field9313 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(II)I")
    private static final int method3726(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "(I)V")
    public final synchronized void method3727(int arg0) {
        this.field9314 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(II[B[IIIIIIIILbga;II)I")
    private static final int method3728(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class655 arg11, int arg12, int arg13) {
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
        arg11.field9313 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V")
    public final synchronized void method3729(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3710(arg1, arg2);
        } else {
            int var4 = method3726(arg1, arg2);
            int var5 = method3718(arg1, arg2);
            if (this.field9323 == var4 && this.field9311 == var5) {
                this.field9316 = 0;
            } else {
                int var6 = arg1 - this.field9320;
                if (this.field9320 - arg1 > var6) {
                    var6 = this.field9320 - arg1;
                }
                if (var4 - this.field9323 > var6) {
                    var6 = var4 - this.field9323;
                }
                if (this.field9323 - var4 > var6) {
                    var6 = this.field9323 - var4;
                }
                if (var5 - this.field9311 > var6) {
                    var6 = var5 - this.field9311;
                }
                if (this.field9311 - var5 > var6) {
                    var6 = this.field9311 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field9316 = arg0;
                this.field9321 = arg1;
                this.field9315 = arg2;
                this.field9312 = (arg1 - this.field9320) / arg0;
                this.field9322 = (var4 - this.field9323) / arg0;
                this.field9319 = (var5 - this.field9311) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lql;III)Lbga;")
    public static final class655 method3730(class161 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2314 != null && arg0.field2314.length != 0 ? new class655(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II[B[IIIIIIIIIILbga;II)I")
    private static final int method3731(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class655 arg13, int arg14, int arg15) {
        arg13.field9320 -= arg13.field9312 * arg5;
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
        arg13.field9320 += arg13.field9312 * var22;
        arg13.field9323 = arg6;
        arg13.field9311 = arg7;
        arg13.field9313 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "()I")
    public final synchronized int method3732() {
        return this.field9318 < 0 ? -this.field9318 : this.field9318;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([III)V")
    public final synchronized void method253(int[] arg0, int arg1, int arg2) {
        if (this.field9321 == 0 && this.field9316 == 0) {
            this.method255(arg2);
        } else {
            class161 var4 = (class161) super.field564;
            int var5 = this.field9310 << 8;
            int var6 = this.field9317 << 8;
            int var7 = var4.field2314.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field9314 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field9313 < 0) {
                if (this.field9318 <= 0) {
                    this.method3717();
                    this.method242(true);
                    return;
                }
                this.field9313 = 0;
            }
            if (this.field9313 >= var7) {
                if (this.field9318 >= 0) {
                    this.method3717();
                    this.method242(true);
                    return;
                }
                this.field9313 = var7 - 1;
            }
            if (this.field9314 < 0) {
                if (this.field9324) {
                    if (this.field9318 < 0) {
                        var9 = this.method3707(arg0, arg1, var5, var10, var4.field2314[this.field9310]);
                        if (this.field9313 >= var5) {
                            return;
                        }
                        this.field9313 = var5 + var5 - 1 - this.field9313;
                        this.field9318 = -this.field9318;
                    }
                    while (true) {
                        int var11 = this.method3706(arg0, var9, var6, var10, var4.field2314[this.field9317 - 1]);
                        if (this.field9313 < var6) {
                            return;
                        }
                        this.field9313 = var6 + var6 - 1 - this.field9313;
                        this.field9318 = -this.field9318;
                        var9 = this.method3707(arg0, var11, var5, var10, var4.field2314[this.field9310]);
                        if (this.field9313 >= var5) {
                            return;
                        }
                        this.field9313 = var5 + var5 - 1 - this.field9313;
                        this.field9318 = -this.field9318;
                    }
                } else if (this.field9318 < 0) {
                    while (true) {
                        var9 = this.method3707(arg0, var9, var5, var10, var4.field2314[this.field9317 - 1]);
                        if (this.field9313 >= var5) {
                            return;
                        }
                        this.field9313 = var6 - 1 - (var6 - 1 - this.field9313) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3706(arg0, var9, var6, var10, var4.field2314[this.field9310]);
                        if (this.field9313 < var6) {
                            return;
                        }
                        this.field9313 = (this.field9313 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field9314 > 0) {
                    if (this.field9324) {
                        label130: {
                            if (this.field9318 < 0) {
                                var9 = this.method3707(arg0, arg1, var5, var10, var4.field2314[this.field9310]);
                                if (this.field9313 >= var5) {
                                    return;
                                }
                                this.field9313 = var5 + var5 - 1 - this.field9313;
                                this.field9318 = -this.field9318;
                                if (--this.field9314 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3706(arg0, var9, var6, var10, var4.field2314[this.field9317 - 1]);
                                if (this.field9313 < var6) {
                                    return;
                                }
                                this.field9313 = var6 + var6 - 1 - this.field9313;
                                this.field9318 = -this.field9318;
                                if (--this.field9314 == 0) {
                                    break;
                                }
                                var9 = this.method3707(arg0, var9, var5, var10, var4.field2314[this.field9310]);
                                if (this.field9313 >= var5) {
                                    return;
                                }
                                this.field9313 = var5 + var5 - 1 - this.field9313;
                                this.field9318 = -this.field9318;
                            } while (--this.field9314 != 0);
                        }
                    } else if (this.field9318 < 0) {
                        while (true) {
                            var9 = this.method3707(arg0, var9, var5, var10, var4.field2314[this.field9317 - 1]);
                            if (this.field9313 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field9313) / var8;
                            if (var12 >= this.field9314) {
                                this.field9313 += this.field9314 * var8;
                                this.field9314 = 0;
                                break;
                            }
                            this.field9313 += var8 * var12;
                            this.field9314 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3706(arg0, var9, var6, var10, var4.field2314[this.field9310]);
                            if (this.field9313 < var6) {
                                return;
                            }
                            int var13 = (this.field9313 - var5) / var8;
                            if (var13 >= this.field9314) {
                                this.field9313 -= this.field9314 * var8;
                                this.field9314 = 0;
                                break;
                            }
                            this.field9313 -= var8 * var13;
                            this.field9314 -= var13;
                        }
                    }
                }
                if (this.field9318 < 0) {
                    this.method3707(arg0, var9, 0, var10, 0);
                    if (this.field9313 < 0) {
                        this.field9313 = -1;
                        this.method3717();
                        this.method242(true);
                        return;
                    }
                } else {
                    this.method3706(arg0, var9, var7, var10, 0);
                    if (this.field9313 >= var7) {
                        this.field9313 = var7;
                        this.method3717();
                        this.method242(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "(I)V")
    private final synchronized void method3733(int arg0) {
        this.method3710(arg0, this.method3721());
    }

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "(I)V")
    public final synchronized void method3734(int arg0) {
        this.method3710(arg0 << 6, this.method3721());
    }

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "()Z")
    public final boolean method3735() {
        return this.field9313 < 0 || this.field9313 >= ((class161) super.field564).field2314.length << 8;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lql;II)V")
    private class655(class161 arg0, int arg1, int arg2) {
        super.field564 = arg0;
        this.field9310 = arg0.field2311;
        this.field9317 = arg0.field2315;
        this.field9324 = arg0.field2313;
        this.field9318 = arg1;
        this.field9321 = arg2;
        this.field9315 = 8192;
        this.field9313 = 0;
        this.method3709();
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II[B[IIIIIIILbga;II)I")
    private static final int method3736(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class655 arg10, int arg11, int arg12) {
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
        arg10.field9313 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "([B[IIIIIIIILbga;)I")
    private static final int method3737(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class655 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field9323 += (var14 - arg3) * arg9.field9322;
        arg9.field9311 += (var14 - arg3) * arg9.field9319;
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
        arg9.field9320 = var12 >> 2;
        arg9.field9313 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lql;III)V")
    private class655(class161 arg0, int arg1, int arg2, int arg3) {
        super.field564 = arg0;
        this.field9310 = arg0.field2311;
        this.field9317 = arg0.field2315;
        this.field9324 = arg0.field2313;
        this.field9318 = arg1;
        this.field9321 = arg2;
        this.field9315 = arg3;
        this.field9313 = 0;
        this.method3709();
    }
}
