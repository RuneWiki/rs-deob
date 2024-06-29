import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class121 extends class151 {

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    private int field2390;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Z")
    private boolean field2397;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    private int field2393;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    private int field2387;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    private int field2398;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    private int field2396;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    private int field2384;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    private int field2388;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    private int field2389;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    private int field2391;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    private int field2395;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final synchronized void method851(boolean arg0) {
        this.field2393 = (this.field2393 >>> 31) + (this.field2393 ^ this.field2393 >> 31);
        if (arg0) {
            this.field2393 = -this.field2393;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public final synchronized void method852(int arg0, int arg1) {
        this.method891(arg0, arg1, this.method878());
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()Lmh;")
    public final class151 method148() {
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([III)V")
    public final synchronized void method153(int[] arg0, int arg1, int arg2) {
        if (this.field2387 == 0 && this.field2384 == 0) {
            this.method133(arg2);
        } else {
            class212 var4 = (class212) super.field2751;
            int var5 = this.field2390 << 8;
            int var6 = this.field2386 << 8;
            int var7 = var4.field3843.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2385 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2396 < 0) {
                if (this.field2393 <= 0) {
                    this.method856();
                    this.method269(-214950896);
                    return;
                }
                this.field2396 = 0;
            }
            if (this.field2396 >= var7) {
                if (this.field2393 >= 0) {
                    this.method856();
                    this.method269(-214950896);
                    return;
                }
                this.field2396 = var7 - 1;
            }
            if (this.field2385 < 0) {
                if (this.field2397) {
                    if (this.field2393 < 0) {
                        var9 = this.method859(arg0, arg1, var5, var10, var4.field3843[this.field2390]);
                        if (this.field2396 >= var5) {
                            return;
                        }
                        this.field2396 = var5 + var5 - 1 - this.field2396;
                        this.field2393 = -this.field2393;
                    }
                    while (true) {
                        int var11 = this.method873(arg0, var9, var6, var10, var4.field3843[this.field2386 - 1]);
                        if (this.field2396 < var6) {
                            return;
                        }
                        this.field2396 = var6 + var6 - 1 - this.field2396;
                        this.field2393 = -this.field2393;
                        var9 = this.method859(arg0, var11, var5, var10, var4.field3843[this.field2390]);
                        if (this.field2396 >= var5) {
                            return;
                        }
                        this.field2396 = var5 + var5 - 1 - this.field2396;
                        this.field2393 = -this.field2393;
                    }
                } else if (this.field2393 < 0) {
                    while (true) {
                        var9 = this.method859(arg0, var9, var5, var10, var4.field3843[this.field2386 - 1]);
                        if (this.field2396 >= var5) {
                            return;
                        }
                        this.field2396 = var6 - 1 - (var6 - 1 - this.field2396) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method873(arg0, var9, var6, var10, var4.field3843[this.field2390]);
                        if (this.field2396 < var6) {
                            return;
                        }
                        this.field2396 = (this.field2396 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2385 > 0) {
                    if (this.field2397) {
                        label130: {
                            if (this.field2393 < 0) {
                                var9 = this.method859(arg0, arg1, var5, var10, var4.field3843[this.field2390]);
                                if (this.field2396 >= var5) {
                                    return;
                                }
                                this.field2396 = var5 + var5 - 1 - this.field2396;
                                this.field2393 = -this.field2393;
                                if (--this.field2385 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method873(arg0, var9, var6, var10, var4.field3843[this.field2386 - 1]);
                                if (this.field2396 < var6) {
                                    return;
                                }
                                this.field2396 = var6 + var6 - 1 - this.field2396;
                                this.field2393 = -this.field2393;
                                if (--this.field2385 == 0) {
                                    break;
                                }
                                var9 = this.method859(arg0, var9, var5, var10, var4.field3843[this.field2390]);
                                if (this.field2396 >= var5) {
                                    return;
                                }
                                this.field2396 = var5 + var5 - 1 - this.field2396;
                                this.field2393 = -this.field2393;
                            } while (--this.field2385 != 0);
                        }
                    } else if (this.field2393 < 0) {
                        while (true) {
                            var9 = this.method859(arg0, var9, var5, var10, var4.field3843[this.field2386 - 1]);
                            if (this.field2396 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2396) / var8;
                            if (var12 >= this.field2385) {
                                this.field2396 += this.field2385 * var8;
                                this.field2385 = 0;
                                break;
                            }
                            this.field2396 += var8 * var12;
                            this.field2385 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method873(arg0, var9, var6, var10, var4.field3843[this.field2390]);
                            if (this.field2396 < var6) {
                                return;
                            }
                            int var13 = (this.field2396 - var5) / var8;
                            if (var13 >= this.field2385) {
                                this.field2396 -= this.field2385 * var8;
                                this.field2385 = 0;
                                break;
                            }
                            this.field2396 -= var8 * var13;
                            this.field2385 -= var13;
                        }
                    }
                }
                if (this.field2393 < 0) {
                    this.method859(arg0, var9, 0, var10, 0);
                    if (this.field2396 < 0) {
                        this.field2396 = -1;
                        this.method856();
                        this.method269(-214950896);
                        return;
                    }
                } else {
                    this.method873(arg0, var9, var7, var10, 0);
                    if (this.field2396 >= var7) {
                        this.field2396 = var7;
                        this.method856();
                        this.method269(-214950896);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[B[IIIIIIIILfd;)I")
    private static final int method853(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class121 arg10) {
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
        arg10.field2396 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)I")
    private static final int method854(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I[B[IIIIIIIILfd;)I")
    private static final int method855(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class121 arg10) {
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
        arg10.field2396 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
    private final void method856() {
        if (this.field2384 != 0) {
            if (this.field2387 == Integer.MIN_VALUE) {
                this.field2387 = 0;
            }
            this.field2384 = 0;
            this.method863();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[B[IIIIIIIIIILfd;II)I")
    private static final int method857(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class121 arg13, int arg14, int arg15) {
        arg13.field2391 -= arg13.field2394 * arg5;
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
        arg13.field2391 += arg13.field2394 * var22;
        arg13.field2392 = arg6;
        arg13.field2389 = arg7;
        arg13.field2396 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[B[IIIIIIIILfd;II)I")
    private static final int method858(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class121 arg11, int arg12, int arg13) {
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
        arg11.field2396 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIIII)I")
    private final int method859(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2384 <= 0) {
                if (this.field2393 == -256 && (this.field2396 & 255) == 0) {
                    if (class32.field577) {
                        return method855(0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, 0, arg3, arg2, this);
                    }
                    return method886(((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, 0, arg3, arg2, this);
                }
                if (class32.field577) {
                    return method889(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, 0, arg3, arg2, this, this.field2393, arg4);
                }
                return method881(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, 0, arg3, arg2, this, this.field2393, arg4);
            }
            int var6 = this.field2384 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2384 += arg1;
            if (this.field2393 == -256 && (this.field2396 & 255) == 0) {
                if (class32.field577) {
                    arg1 = method865(0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, this.field2395, this.field2388, 0, var6, arg2, this);
                } else {
                    arg1 = method872(((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, this.field2394, 0, var6, arg2, this);
                }
            } else if (class32.field577) {
                arg1 = method887(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, this.field2395, this.field2388, 0, var6, arg2, this, this.field2393, arg4);
            } else {
                arg1 = method888(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, this.field2394, 0, var6, arg2, this, this.field2393, arg4);
            }
            this.field2384 -= arg1;
            if (this.field2384 != 0) {
                return arg1;
            }
        } while (!this.method880());
        return arg3;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public final synchronized void method860(int arg0) {
        this.method874(arg0 << 6, this.method878());
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lsh;III)Lfd;")
    public static final class121 method861(class212 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3843 != null && arg0.field3843.length != 0 ? new class121(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    private final synchronized void method862(int arg0) {
        this.method874(arg0, this.method878());
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "()V")
    private final void method863() {
        this.field2391 = this.field2387;
        this.field2392 = method854(this.field2387, this.field2398);
        this.field2389 = method876(this.field2387, this.field2398);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "()I")
    public final synchronized int method864() {
        return this.field2393 < 0 ? -this.field2393 : this.field2393;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[B[IIIIIIIIIILfd;)I")
    private static final int method865(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class121 arg12) {
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
        arg12.field2391 += (var19 - arg4) * arg12.field2394;
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
        arg12.field2392 = var15 >> 2;
        arg12.field2389 = var16 >> 2;
        arg12.field2396 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lsh;II)Lfd;")
    public static final class121 method866(class212 arg0, int arg1, int arg2) {
        return arg0.field3843 != null && arg0.field3843.length != 0 ? new class121(arg0, (int) ((long) arg0.field3845 * 256L * (long) arg1 / (long) (class192.field3479 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()I")
    public final int method163() {
        return this.field2387 == 0 && this.field2384 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I[B[IIIIIIIIIILfd;)I")
    private static final int method867(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class121 arg12) {
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
        arg12.field2391 += (var19 - arg4) * arg12.field2394;
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
        arg12.field2392 = var15 >> 2;
        arg12.field2389 = var16 >> 2;
        arg12.field2396 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public final synchronized void method133(int arg0) {
        if (this.field2384 > 0) {
            if (arg0 >= this.field2384) {
                if (this.field2387 == Integer.MIN_VALUE) {
                    this.field2387 = 0;
                    this.field2391 = this.field2392 = this.field2389 = 0;
                    this.method269(-214950896);
                    arg0 = this.field2384;
                }
                this.field2384 = 0;
                this.method863();
            } else {
                this.field2391 += this.field2394 * arg0;
                this.field2392 += this.field2395 * arg0;
                this.field2389 += this.field2388 * arg0;
                this.field2384 -= arg0;
            }
        }
        class212 var2 = (class212) super.field2751;
        int var3 = this.field2390 << 8;
        int var4 = this.field2386 << 8;
        int var5 = var2.field3843.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2385 = 0;
        }
        if (this.field2396 < 0) {
            if (this.field2393 <= 0) {
                this.method856();
                this.method269(-214950896);
                return;
            }
            this.field2396 = 0;
        }
        if (this.field2396 >= var5) {
            if (this.field2393 >= 0) {
                this.method856();
                this.method269(-214950896);
                return;
            }
            this.field2396 = var5 - 1;
        }
        this.field2396 += this.field2393 * arg0;
        if (this.field2385 < 0) {
            if (!this.field2397) {
                if (this.field2393 < 0) {
                    if (this.field2396 < var3) {
                        this.field2396 = var4 - 1 - (var4 - 1 - this.field2396) % var6;
                    }
                } else if (this.field2396 >= var4) {
                    this.field2396 = (this.field2396 - var3) % var6 + var3;
                }
            } else {
                if (this.field2393 < 0) {
                    if (this.field2396 >= var3) {
                        return;
                    }
                    this.field2396 = var3 + var3 - 1 - this.field2396;
                    this.field2393 = -this.field2393;
                }
                while (this.field2396 >= var4) {
                    this.field2396 = var4 + var4 - 1 - this.field2396;
                    this.field2393 = -this.field2393;
                    if (this.field2396 >= var3) {
                        return;
                    }
                    this.field2396 = var3 + var3 - 1 - this.field2396;
                    this.field2393 = -this.field2393;
                }
            }
        } else {
            if (this.field2385 > 0) {
                if (this.field2397) {
                    label125: {
                        if (this.field2393 < 0) {
                            if (this.field2396 >= var3) {
                                return;
                            }
                            this.field2396 = var3 + var3 - 1 - this.field2396;
                            this.field2393 = -this.field2393;
                            if (--this.field2385 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2396 < var4) {
                                return;
                            }
                            this.field2396 = var4 + var4 - 1 - this.field2396;
                            this.field2393 = -this.field2393;
                            if (--this.field2385 == 0) {
                                break;
                            }
                            if (this.field2396 >= var3) {
                                return;
                            }
                            this.field2396 = var3 + var3 - 1 - this.field2396;
                            this.field2393 = -this.field2393;
                        } while (--this.field2385 != 0);
                    }
                } else if (this.field2393 < 0) {
                    if (this.field2396 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2396) / var6;
                    if (var7 < this.field2385) {
                        this.field2396 += var6 * var7;
                        this.field2385 -= var7;
                        return;
                    }
                    this.field2396 += this.field2385 * var6;
                    this.field2385 = 0;
                } else {
                    if (this.field2396 < var4) {
                        return;
                    }
                    int var8 = (this.field2396 - var3) / var6;
                    if (var8 < this.field2385) {
                        this.field2396 -= var6 * var8;
                        this.field2385 -= var8;
                        return;
                    }
                    this.field2396 -= this.field2385 * var6;
                    this.field2385 = 0;
                }
            }
            if (this.field2393 < 0) {
                if (this.field2396 < 0) {
                    this.field2396 = -1;
                    this.method856();
                    this.method269(-214950896);
                    return;
                }
            } else if (this.field2396 >= var5) {
                this.field2396 = var5;
                this.method856();
                this.method269(-214950896);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public final synchronized void method868(int arg0) {
        int var2 = ((class212) super.field2751).field3843.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2396 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()I")
    public final int method869() {
        int var1 = this.field2391 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2385 == 0) {
            var2 -= this.field2396 * var2 / (((class212) super.field2751).field3843.length << 8);
        } else if (this.field2385 >= 0) {
            var2 -= this.field2390 * var2 / ((class212) super.field2751).field3843.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "()Z")
    public final boolean method870() {
        return this.field2396 < 0 || this.field2396 >= ((class212) super.field2751).field3843.length << 8;
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)V")
    public final synchronized void method871(int arg0) {
        if (this.field2393 < 0) {
            this.field2393 = -arg0;
        } else {
            this.field2393 = arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([B[IIIIIIIILfd;)I")
    private static final int method872(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class121 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2392 += (var14 - arg3) * arg9.field2395;
        arg9.field2389 += (var14 - arg3) * arg9.field2388;
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
        arg9.field2391 = var12 >> 2;
        arg9.field2396 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([IIIII)I")
    private final int method873(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2384 <= 0) {
                if (this.field2393 == 256 && (this.field2396 & 255) == 0) {
                    if (class32.field577) {
                        return method853(0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, 0, arg3, arg2, this);
                    }
                    return method885(((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, 0, arg3, arg2, this);
                }
                if (class32.field577) {
                    return method858(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, 0, arg3, arg2, this, this.field2393, arg4);
                }
                return method883(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, 0, arg3, arg2, this, this.field2393, arg4);
            }
            int var6 = this.field2384 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2384 += arg1;
            if (this.field2393 == 256 && (this.field2396 & 255) == 0) {
                if (class32.field577) {
                    arg1 = method867(0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, this.field2395, this.field2388, 0, var6, arg2, this);
                } else {
                    arg1 = method882(((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, this.field2394, 0, var6, arg2, this);
                }
            } else if (class32.field577) {
                arg1 = method857(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2392, this.field2389, this.field2395, this.field2388, 0, var6, arg2, this, this.field2393, arg4);
            } else {
                arg1 = method875(0, 0, ((class212) super.field2751).field3843, arg0, this.field2396, arg1, this.field2391, this.field2394, 0, var6, arg2, this, this.field2393, arg4);
            }
            this.field2384 -= arg1;
            if (this.field2384 != 0) {
                return arg1;
            }
        } while (!this.method880());
        return arg3;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
    private final synchronized void method874(int arg0, int arg1) {
        this.field2387 = arg0;
        this.field2398 = arg1;
        this.field2384 = 0;
        this.method863();
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II[B[IIIIIIIILfd;II)I")
    private static final int method875(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class121 arg11, int arg12, int arg13) {
        arg11.field2392 -= arg11.field2395 * arg5;
        arg11.field2389 -= arg11.field2388 * arg5;
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
        arg11.field2392 += arg11.field2395 * arg5;
        arg11.field2389 += arg11.field2388 * arg5;
        arg11.field2391 = arg6;
        arg11.field2396 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)I")
    private static final int method876(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()Lmh;")
    public final class151 method137() {
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "()I")
    public final synchronized int method877() {
        return this.field2387 == Integer.MIN_VALUE ? 0 : this.field2387;
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "()I")
    public final synchronized int method878() {
        return this.field2398 < 0 ? -1 : this.field2398;
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)V")
    public final synchronized void method879(int arg0) {
        if (arg0 == 0) {
            this.method862(0);
            this.method269(-214950896);
        } else if (this.field2392 == 0 && this.field2389 == 0) {
            this.field2384 = 0;
            this.field2387 = 0;
            this.field2391 = 0;
            this.method269(-214950896);
        } else {
            int var2 = -this.field2391;
            if (this.field2391 > var2) {
                var2 = this.field2391;
            }
            if (-this.field2392 > var2) {
                var2 = -this.field2392;
            }
            if (this.field2392 > var2) {
                var2 = this.field2392;
            }
            if (-this.field2389 > var2) {
                var2 = -this.field2389;
            }
            if (this.field2389 > var2) {
                var2 = this.field2389;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2384 = arg0;
            this.field2387 = Integer.MIN_VALUE;
            this.field2394 = -this.field2391 / arg0;
            this.field2395 = -this.field2392 / arg0;
            this.field2388 = -this.field2389 / arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "()Z")
    private final boolean method880() {
        int var1 = this.field2387;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method854(var1, this.field2398);
            var2 = method876(var1, this.field2398);
        }
        if (this.field2391 == var1 && this.field2392 == var3 && this.field2389 == var2) {
            if (this.field2387 == Integer.MIN_VALUE) {
                this.field2387 = 0;
                this.field2391 = this.field2392 = this.field2389 = 0;
                this.method269(-214950896);
                return true;
            } else {
                this.method863();
                return false;
            }
        } else {
            if (this.field2391 < var1) {
                this.field2394 = 1;
                this.field2384 = var1 - this.field2391;
            } else if (this.field2391 > var1) {
                this.field2394 = -1;
                this.field2384 = this.field2391 - var1;
            } else {
                this.field2394 = 0;
            }
            if (this.field2392 < var3) {
                this.field2395 = 1;
                if (this.field2384 == 0 || this.field2384 > var3 - this.field2392) {
                    this.field2384 = var3 - this.field2392;
                }
            } else if (this.field2392 > var3) {
                this.field2395 = -1;
                if (this.field2384 == 0 || this.field2384 > this.field2392 - var3) {
                    this.field2384 = this.field2392 - var3;
                }
            } else {
                this.field2395 = 0;
            }
            if (this.field2389 < var2) {
                this.field2388 = 1;
                if (this.field2384 == 0 || this.field2384 > var2 - this.field2389) {
                    this.field2384 = var2 - this.field2389;
                }
            } else if (this.field2389 > var2) {
                this.field2388 = -1;
                if (this.field2384 == 0 || this.field2384 > this.field2389 - var2) {
                    this.field2384 = this.field2389 - var2;
                }
            } else {
                this.field2388 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[B[IIIIIIILfd;II)I")
    private static final int method881(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class121 arg10, int arg11, int arg12) {
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
        arg10.field2396 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([B[IIIIIIIILfd;)I")
    private static final int method882(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class121 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2392 += (var14 - arg3) * arg9.field2395;
        arg9.field2389 += (var14 - arg3) * arg9.field2388;
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
        arg9.field2391 = var12 >> 2;
        arg9.field2396 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II[B[IIIIIIILfd;II)I")
    private static final int method883(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class121 arg10, int arg11, int arg12) {
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
        arg10.field2396 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)V")
    public final synchronized void method884(int arg0) {
        this.field2385 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([B[IIIIIIILfd;)I")
    private static final int method885(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class121 arg8) {
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
        arg8.field2396 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([B[IIIIIIILfd;)I")
    private static final int method886(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class121 arg8) {
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
        arg8.field2396 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II[B[IIIIIIIIIILfd;II)I")
    private static final int method887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class121 arg13, int arg14, int arg15) {
        arg13.field2391 -= arg13.field2394 * arg5;
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
        arg13.field2391 += arg13.field2394 * var22;
        arg13.field2392 = arg6;
        arg13.field2389 = arg7;
        arg13.field2396 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II[B[IIIIIIIILfd;II)I")
    private static final int method888(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class121 arg11, int arg12, int arg13) {
        arg11.field2392 -= arg11.field2395 * arg5;
        arg11.field2389 -= arg11.field2388 * arg5;
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
        arg11.field2392 += arg11.field2395 * arg5;
        arg11.field2389 += arg11.field2388 * arg5;
        arg11.field2391 = arg6;
        arg11.field2396 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(II[B[IIIIIIIILfd;II)I")
    private static final int method889(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class121 arg11, int arg12, int arg13) {
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
        arg11.field2396 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "()Z")
    public final boolean method890() {
        return this.field2384 != 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final synchronized void method891(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method874(arg1, arg2);
        } else {
            int var4 = method854(arg1, arg2);
            int var5 = method876(arg1, arg2);
            if (this.field2392 == var4 && this.field2389 == var5) {
                this.field2384 = 0;
            } else {
                int var6 = arg1 - this.field2391;
                if (this.field2391 - arg1 > var6) {
                    var6 = this.field2391 - arg1;
                }
                if (var4 - this.field2392 > var6) {
                    var6 = var4 - this.field2392;
                }
                if (this.field2392 - var4 > var6) {
                    var6 = this.field2392 - var4;
                }
                if (var5 - this.field2389 > var6) {
                    var6 = var5 - this.field2389;
                }
                if (this.field2389 - var5 > var6) {
                    var6 = this.field2389 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2384 = arg0;
                this.field2387 = arg1;
                this.field2398 = arg2;
                this.field2394 = (arg1 - this.field2391) / arg0;
                this.field2395 = (var4 - this.field2392) / arg0;
                this.field2388 = (var5 - this.field2389) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lsh;II)V")
    private class121(class212 arg0, int arg1, int arg2) {
        super.field2751 = arg0;
        this.field2390 = arg0.field3846;
        this.field2386 = arg0.field3847;
        this.field2397 = arg0.field3844;
        this.field2393 = arg1;
        this.field2387 = arg2;
        this.field2398 = 8192;
        this.field2396 = 0;
        this.method863();
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lsh;III)V")
    private class121(class212 arg0, int arg1, int arg2, int arg3) {
        super.field2751 = arg0;
        this.field2390 = arg0.field3846;
        this.field2386 = arg0.field3847;
        this.field2397 = arg0.field3844;
        this.field2393 = arg1;
        this.field2387 = arg2;
        this.field2398 = arg3;
        this.field2396 = 0;
        this.method863();
    }
}
