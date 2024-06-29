import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 extends class13 {

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Z")
    private boolean field2381;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    private int field2378;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    private int field2370;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    private int field2376;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    private int field2382;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[B[IIIIIIILp;II)I")
    private static final int method845(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
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
        arg10.field2370 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([B[IIIIIIIILp;)I")
    private static final int method846(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
        arg9.field2375 += (arg7 - arg3) * arg9.field2368;
        arg9.field2372 += (arg7 - arg3) * arg9.field2369;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
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
        arg9.field2382 = var12 >> 2;
        arg9.field2370 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()I")
    public final int method145() {
        int var1 = this.field2382 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2373 == 0) {
            var2 -= this.field2370 * var2 / (((class116) super.field285).field2602.length << 8);
        } else if (this.field2373 >= 0) {
            var2 -= this.field2371 * var2 / ((class116) super.field285).field2602.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[B[IIIIIIIILp;)I")
    private static final int method847(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
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
        arg10.field2370 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()I")
    public final synchronized int method848() {
        return this.field2377 == Integer.MIN_VALUE ? 0 : this.field2377;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public final synchronized void method849(int arg0) {
        this.method853(arg0 << 6, this.method860());
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([IIIII)I")
    private final int method850(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2376 > 0) {
            int var6 = this.field2376 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2376 += arg1;
            if (this.field2378 == 256 && (this.field2370 & 255) == 0) {
                if (class32.field782) {
                    arg1 = method874(0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, this.field2368, this.field2369, 0, var6, arg2, this);
                } else {
                    arg1 = method846(((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, this.field2379, 0, var6, arg2, this);
                }
            } else if (class32.field782) {
                arg1 = method871(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, this.field2368, this.field2369, 0, var6, arg2, this, this.field2378, arg4);
            } else {
                arg1 = method867(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, this.field2379, 0, var6, arg2, this, this.field2378, arg4);
            }
            this.field2376 -= arg1;
            if (this.field2376 != 0) {
                return arg1;
            }
            if (this.field2377 == Integer.MIN_VALUE) {
                this.field2377 = 0;
                this.field2382 = this.field2375 = this.field2372 = 0;
                this.method975(-119);
                return arg3;
            }
            this.method854();
        }
        if (this.field2378 == 256 && (this.field2370 & 255) == 0) {
            return class32.field782 ? method869(0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, 0, arg3, arg2, this) : method882(((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, 0, arg3, arg2, this);
        } else {
            return class32.field782 ? method857(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, 0, arg3, arg2, this, this.field2378, arg4) : method883(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, 0, arg3, arg2, this, this.field2378, arg4);
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public final synchronized void method851(int arg0) {
        this.field2373 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
    private static final int method852(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final synchronized void method112(int arg0) {
        if (this.field2376 > 0) {
            if (arg0 >= this.field2376) {
                if (this.field2377 == Integer.MIN_VALUE) {
                    this.field2377 = 0;
                    this.field2382 = this.field2375 = this.field2372 = 0;
                    this.method975(-125);
                    arg0 = this.field2376;
                }
                this.field2376 = 0;
                this.method854();
            } else {
                this.field2382 += this.field2379 * arg0;
                this.field2375 += this.field2368 * arg0;
                this.field2372 += this.field2369 * arg0;
                this.field2376 -= arg0;
            }
        }
        class116 var2 = (class116) super.field285;
        int var3 = this.field2371 << 8;
        int var4 = this.field2374 << 8;
        int var5 = var2.field2602.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2373 = 0;
        }
        if (this.field2370 < 0) {
            if (this.field2378 <= 0) {
                this.method866();
                this.method975(-9);
                return;
            }
            this.field2370 = 0;
        }
        if (this.field2370 >= var5) {
            if (this.field2378 >= 0) {
                this.method866();
                this.method975(108);
                return;
            }
            this.field2370 = var5 - 1;
        }
        this.field2370 += this.field2378 * arg0;
        if (this.field2373 < 0) {
            if (!this.field2381) {
                if (this.field2378 < 0) {
                    if (this.field2370 < var3) {
                        this.field2370 = var4 - 1 - (var4 - 1 - this.field2370) % var6;
                    }
                } else if (this.field2370 >= var4) {
                    this.field2370 = (this.field2370 - var3) % var6 + var3;
                }
            } else {
                if (this.field2378 < 0) {
                    if (this.field2370 >= var3) {
                        return;
                    }
                    this.field2370 = var3 + var3 - 1 - this.field2370;
                    this.field2378 = -this.field2378;
                }
                while (this.field2370 >= var4) {
                    this.field2370 = var4 + var4 - 1 - this.field2370;
                    this.field2378 = -this.field2378;
                    if (this.field2370 >= var3) {
                        return;
                    }
                    this.field2370 = var3 + var3 - 1 - this.field2370;
                    this.field2378 = -this.field2378;
                }
            }
        } else {
            if (this.field2373 > 0) {
                if (this.field2381) {
                    label125: {
                        if (this.field2378 < 0) {
                            if (this.field2370 >= var3) {
                                return;
                            }
                            this.field2370 = var3 + var3 - 1 - this.field2370;
                            this.field2378 = -this.field2378;
                            if (--this.field2373 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2370 < var4) {
                                return;
                            }
                            this.field2370 = var4 + var4 - 1 - this.field2370;
                            this.field2378 = -this.field2378;
                            if (--this.field2373 == 0) {
                                break;
                            }
                            if (this.field2370 >= var3) {
                                return;
                            }
                            this.field2370 = var3 + var3 - 1 - this.field2370;
                            this.field2378 = -this.field2378;
                        } while (--this.field2373 != 0);
                    }
                } else if (this.field2378 < 0) {
                    if (this.field2370 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2370) / var6;
                    if (var7 < this.field2373) {
                        this.field2370 += var6 * var7;
                        this.field2373 -= var7;
                        return;
                    }
                    this.field2370 += this.field2373 * var6;
                    this.field2373 = 0;
                } else {
                    if (this.field2370 < var4) {
                        return;
                    }
                    int var8 = (this.field2370 - var3) / var6;
                    if (var8 < this.field2373) {
                        this.field2370 -= var6 * var8;
                        this.field2373 -= var8;
                        return;
                    }
                    this.field2370 -= this.field2373 * var6;
                    this.field2373 = 0;
                }
            }
            if (this.field2378 < 0) {
                if (this.field2370 < 0) {
                    this.field2370 = -1;
                    this.method866();
                    this.method975(-113);
                    return;
                }
            } else if (this.field2370 >= var5) {
                this.field2370 = var5;
                this.method866();
                this.method975(35);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    private final synchronized void method853(int arg0, int arg1) {
        this.field2377 = arg0;
        this.field2380 = arg1;
        this.field2376 = 0;
        this.method854();
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "()V")
    private final void method854() {
        this.field2382 = this.field2377;
        this.field2375 = method872(this.field2377, this.field2380);
        this.field2372 = method852(this.field2377, this.field2380);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public final synchronized void method855(boolean arg0) {
        this.field2378 = (this.field2378 >>> 31) + (this.field2378 ^ this.field2378 >> 31);
        if (arg0) {
            this.field2378 = -this.field2378;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    public final synchronized void method856(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method853(arg1, arg2);
        } else {
            int var4 = method872(arg1, arg2);
            int var5 = method852(arg1, arg2);
            if (this.field2375 == var4 && this.field2372 == var5) {
                this.field2376 = 0;
            } else {
                this.field2376 = arg0;
                this.field2377 = arg1;
                this.field2380 = arg2;
                this.field2379 = (arg1 - this.field2382) / arg0;
                this.field2368 = (var4 - this.field2375) / arg0;
                this.field2369 = (var5 - this.field2372) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method857(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
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
        arg11.field2370 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()Lbe;")
    public final class13 method113() {
        return null;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public final synchronized void method858(int arg0) {
        if (arg0 == 0) {
            this.method859(0);
            this.method975(57);
        } else if (this.field2375 == 0 && this.field2372 == 0) {
            this.field2376 = 0;
            this.field2377 = 0;
            this.field2382 = 0;
            this.method975(-114);
        } else {
            this.field2376 = arg0;
            this.field2377 = Integer.MIN_VALUE;
            this.field2379 = -this.field2382 / arg0;
            this.field2368 = -this.field2375 / arg0;
            this.field2369 = -this.field2372 / arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
    private final synchronized void method859(int arg0) {
        this.method853(arg0, this.method860());
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "()I")
    public final synchronized int method860() {
        return this.field2380 < 0 ? -1 : this.field2380;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[B[IIIIIIIIIILp;)I")
    private static final int method861(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
        arg12.field2382 += (arg10 - arg4) * arg12.field2379;
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
        arg12.field2375 = var15 >> 2;
        arg12.field2372 = var16 >> 2;
        arg12.field2370 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "()I")
    public final synchronized int method862() {
        return this.field2378 < 0 ? -this.field2378 : this.field2378;
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "()Z")
    public final boolean method863() {
        return this.field2370 < 0 || this.field2370 >= ((class116) super.field285).field2602.length << 8;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lr;III)Lp;")
    public static final class104 method864(class116 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2602 != null && arg0.field2602.length != 0 ? new class104(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method865(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
        arg11.field2375 += (arg9 - arg5) * arg11.field2368;
        arg11.field2372 += (arg9 - arg5) * arg11.field2369;
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
        arg11.field2382 = arg6;
        arg11.field2370 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "j", descriptor = "()V")
    private final void method866() {
        if (this.field2376 != 0) {
            if (this.field2377 == Integer.MIN_VALUE) {
                this.field2377 = 0;
            }
            this.field2376 = 0;
            this.method854();
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method867(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
        arg11.field2375 += (arg9 - arg5) * arg11.field2368;
        arg11.field2372 += (arg9 - arg5) * arg11.field2369;
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
        arg11.field2382 = arg6;
        arg11.field2370 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([IIIII)I")
    private final int method868(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2376 > 0) {
            int var6 = this.field2376 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2376 += arg1;
            if (this.field2378 == -256 && (this.field2370 & 255) == 0) {
                if (class32.field782) {
                    arg1 = method861(0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, this.field2368, this.field2369, 0, var6, arg2, this);
                } else {
                    arg1 = method876(((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, this.field2379, 0, var6, arg2, this);
                }
            } else if (class32.field782) {
                arg1 = method875(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, this.field2368, this.field2369, 0, var6, arg2, this, this.field2378, arg4);
            } else {
                arg1 = method865(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, this.field2379, 0, var6, arg2, this, this.field2378, arg4);
            }
            this.field2376 -= arg1;
            if (this.field2376 != 0) {
                return arg1;
            }
            if (this.field2377 == Integer.MIN_VALUE) {
                this.field2377 = 0;
                this.field2382 = this.field2375 = this.field2372 = 0;
                this.method975(-125);
                return arg3;
            }
            this.method854();
        }
        if (this.field2378 == -256 && (this.field2370 & 255) == 0) {
            return class32.field782 ? method847(0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, 0, arg3, arg2, this) : method873(((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, 0, arg3, arg2, this);
        } else {
            return class32.field782 ? method878(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2375, this.field2372, 0, arg3, arg2, this, this.field2378, arg4) : method845(0, 0, ((class116) super.field285).field2602, arg0, this.field2370, arg1, this.field2382, 0, arg3, arg2, this, this.field2378, arg4);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I[B[IIIIIIIILp;)I")
    private static final int method869(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
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
        arg10.field2370 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lr;II)Lp;")
    public static final class104 method870(class116 arg0, int arg1, int arg2) {
        return arg0.field2602 != null && arg0.field2602.length != 0 ? new class104(arg0, (int) ((long) arg0.field2603 * 256L * (long) arg1 / (long) (class8.field194 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()I")
    public final int method109() {
        return this.field2377 == 0 && this.field2376 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[B[IIIIIIIIIILp;II)I")
    private static final int method871(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
        arg13.field2382 += (arg11 - arg5) * arg13.field2379;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var24 = arg4 >> 8;
            byte var25 = arg2[var24];
            int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24 + 1] - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var26 >> 6;
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
            byte var22 = arg2[arg4 >> 8];
            int var23 = (var22 << 8) + (arg4 & 255) * (var21 - var22);
            var10001 = var17++;
            arg3[var10001] += arg6 * var23 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field2375 = arg6;
        arg13.field2372 = arg7;
        arg13.field2370 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)I")
    private static final int method872(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([B[IIIIIIILp;)I")
    private static final int method873(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
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
        arg8.field2370 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([III)V")
    public final synchronized void method119(int[] arg0, int arg1, int arg2) {
        if (this.field2377 == 0 && this.field2376 == 0) {
            this.method112(arg2);
        } else {
            class116 var4 = (class116) super.field285;
            int var5 = this.field2371 << 8;
            int var6 = this.field2374 << 8;
            int var7 = var4.field2602.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2373 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2370 < 0) {
                if (this.field2378 <= 0) {
                    this.method866();
                    this.method975(113);
                    return;
                }
                this.field2370 = 0;
            }
            if (this.field2370 >= var7) {
                if (this.field2378 >= 0) {
                    this.method866();
                    this.method975(98);
                    return;
                }
                this.field2370 = var7 - 1;
            }
            if (this.field2373 < 0) {
                if (this.field2381) {
                    if (this.field2378 < 0) {
                        var9 = this.method868(arg0, arg1, var5, var10, var4.field2602[this.field2371]);
                        if (this.field2370 >= var5) {
                            return;
                        }
                        this.field2370 = var5 + var5 - 1 - this.field2370;
                        this.field2378 = -this.field2378;
                    }
                    while (true) {
                        int var11 = this.method850(arg0, var9, var6, var10, var4.field2602[this.field2374 - 1]);
                        if (this.field2370 < var6) {
                            return;
                        }
                        this.field2370 = var6 + var6 - 1 - this.field2370;
                        this.field2378 = -this.field2378;
                        var9 = this.method868(arg0, var11, var5, var10, var4.field2602[this.field2371]);
                        if (this.field2370 >= var5) {
                            return;
                        }
                        this.field2370 = var5 + var5 - 1 - this.field2370;
                        this.field2378 = -this.field2378;
                    }
                } else if (this.field2378 < 0) {
                    while (true) {
                        var9 = this.method868(arg0, var9, var5, var10, var4.field2602[this.field2374 - 1]);
                        if (this.field2370 >= var5) {
                            return;
                        }
                        this.field2370 = var6 - 1 - (var6 - 1 - this.field2370) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method850(arg0, var9, var6, var10, var4.field2602[this.field2371]);
                        if (this.field2370 < var6) {
                            return;
                        }
                        this.field2370 = (this.field2370 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2373 > 0) {
                    if (this.field2381) {
                        label130: {
                            if (this.field2378 < 0) {
                                var9 = this.method868(arg0, arg1, var5, var10, var4.field2602[this.field2371]);
                                if (this.field2370 >= var5) {
                                    return;
                                }
                                this.field2370 = var5 + var5 - 1 - this.field2370;
                                this.field2378 = -this.field2378;
                                if (--this.field2373 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method850(arg0, var9, var6, var10, var4.field2602[this.field2374 - 1]);
                                if (this.field2370 < var6) {
                                    return;
                                }
                                this.field2370 = var6 + var6 - 1 - this.field2370;
                                this.field2378 = -this.field2378;
                                if (--this.field2373 == 0) {
                                    break;
                                }
                                var9 = this.method868(arg0, var9, var5, var10, var4.field2602[this.field2371]);
                                if (this.field2370 >= var5) {
                                    return;
                                }
                                this.field2370 = var5 + var5 - 1 - this.field2370;
                                this.field2378 = -this.field2378;
                            } while (--this.field2373 != 0);
                        }
                    } else if (this.field2378 < 0) {
                        while (true) {
                            var9 = this.method868(arg0, var9, var5, var10, var4.field2602[this.field2374 - 1]);
                            if (this.field2370 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2370) / var8;
                            if (var12 >= this.field2373) {
                                this.field2370 += this.field2373 * var8;
                                this.field2373 = 0;
                                break;
                            }
                            this.field2370 += var8 * var12;
                            this.field2373 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method850(arg0, var9, var6, var10, var4.field2602[this.field2371]);
                            if (this.field2370 < var6) {
                                return;
                            }
                            int var13 = (this.field2370 - var5) / var8;
                            if (var13 >= this.field2373) {
                                this.field2370 -= this.field2373 * var8;
                                this.field2373 = 0;
                                break;
                            }
                            this.field2370 -= var8 * var13;
                            this.field2373 -= var13;
                        }
                    }
                }
                if (this.field2378 < 0) {
                    this.method868(arg0, var9, 0, var10, 0);
                    if (this.field2370 < 0) {
                        this.field2370 = -1;
                        this.method866();
                        this.method975(28);
                        return;
                    }
                } else {
                    this.method850(arg0, var9, var7, var10, 0);
                    if (this.field2370 >= var7) {
                        this.field2370 = var7;
                        this.method866();
                        this.method975(-118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I[B[IIIIIIIIIILp;)I")
    private static final int method874(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
        arg12.field2382 += (arg10 - arg4) * arg12.field2379;
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
        arg12.field2375 = var15 >> 2;
        arg12.field2372 = var16 >> 2;
        arg12.field2370 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II[B[IIIIIIIIIILp;II)I")
    private static final int method875(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
        arg13.field2382 += (arg11 - arg5) * arg13.field2379;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var23 = arg4 >> 8;
            byte var24 = arg2[var23 - 1];
            int var25 = (var24 << 8) + (arg4 & 255) * (arg2[var23] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            int var26 = var17++;
            arg3[var26] += arg7 * var25 >> 6;
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
            int var22 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
            var10001 = var17++;
            arg3[var10001] += arg6 * var22 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var22 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        arg13.field2375 = arg6;
        arg13.field2372 = arg7;
        arg13.field2370 = arg4;
        return var17 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()Lbe;")
    public final class13 method110() {
        return null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([B[IIIIIIIILp;)I")
    private static final int method876(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
        arg9.field2375 += (arg7 - arg3) * arg9.field2368;
        arg9.field2372 += (arg7 - arg3) * arg9.field2369;
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
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
        arg9.field2382 = var12 >> 2;
        arg9.field2370 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
    public final synchronized void method877(int arg0) {
        int var2 = ((class116) super.field285).field2602.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2370 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II[B[IIIIIIIILp;II)I")
    private static final int method878(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
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
        arg11.field2370 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)V")
    public final synchronized void method879(int arg0, int arg1) {
        this.method856(arg0, arg1, this.method860());
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "(I)V")
    public final synchronized void method880(int arg0) {
        if (this.field2378 < 0) {
            this.field2378 = -arg0;
        } else {
            this.field2378 = arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "k", descriptor = "()Z")
    public final boolean method881() {
        return this.field2376 != 0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([B[IIIIIIILp;)I")
    private static final int method882(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
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
        arg8.field2370 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II[B[IIIIIIILp;II)I")
    private static final int method883(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
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
        arg10.field2370 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lr;II)V")
    private class104(class116 arg0, int arg1, int arg2) {
        super.field285 = arg0;
        this.field2371 = arg0.field2604;
        this.field2374 = arg0.field2605;
        this.field2381 = arg0.field2606;
        this.field2378 = arg1;
        this.field2377 = arg2;
        this.field2380 = 8192;
        this.field2370 = 0;
        this.method854();
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lr;III)V")
    private class104(class116 arg0, int arg1, int arg2, int arg3) {
        super.field285 = arg0;
        this.field2371 = arg0.field2604;
        this.field2374 = arg0.field2605;
        this.field2381 = arg0.field2606;
        this.field2378 = arg1;
        this.field2377 = arg2;
        this.field2380 = arg3;
        this.field2370 = 0;
        this.method854();
    }
}
