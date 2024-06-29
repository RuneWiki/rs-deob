import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class219 extends class319 {

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Z")
    private boolean field3344;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    private int field3332;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    private int field3336;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    private int field3334;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field3338;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    private int field3339;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    private int field3342;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    private int field3345;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    private int field3346;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 3)
    public final synchronized void method1501(boolean arg0) {
        this.field3337 = (this.field3337 >>> 31) + (this.field3337 ^ this.field3337 >> 31);
        if (arg0) {
            this.field3337 = -this.field3337;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([III)V", line = 9)
    public final synchronized void method1502(int[] arg0, int arg1, int arg2) {
        if (this.field3332 == 0 && this.field3334 == 0) {
            this.method1532(arg2);
            return;
        }
        class220 var4 = (class220) this.field4810;
        int var5 = this.field3343 << 8;
        int var6 = this.field3333 << 8;
        int var7 = var4.field3351.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3345 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3336 < 0) {
            if (this.field3337 <= 0) {
                this.method1505();
                this.method714(120);
                return;
            }
            this.field3336 = 0;
        }
        if (this.field3336 >= var7) {
            if (this.field3337 >= 0) {
                this.method1505();
                this.method714(-58);
                return;
            }
            this.field3336 = var7 - 1;
        }
        if (this.field3345 >= 0) {
            if (this.field3345 > 0) {
                if (this.field3344) {
                    label131: {
                        if (this.field3337 < 0) {
                            var9 = this.method1541(arg0, arg1, var5, var10, var4.field3351[this.field3343]);
                            if (this.field3336 >= var5) {
                                return;
                            }
                            this.field3336 = var5 + var5 - this.field3336 - 1;
                            this.field3337 = -this.field3337;
                            if (--this.field3345 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1524(arg0, var9, var6, var10, var4.field3351[this.field3333 - 1]);
                            if (this.field3336 < var6) {
                                return;
                            }
                            this.field3336 = var6 + var6 - this.field3336 - 1;
                            this.field3337 = -this.field3337;
                            if (--this.field3345 == 0) {
                                break;
                            }
                            var9 = this.method1541(arg0, var9, var5, var10, var4.field3351[this.field3343]);
                            if (this.field3336 >= var5) {
                                return;
                            }
                            this.field3336 = var5 + var5 - this.field3336 - 1;
                            this.field3337 = -this.field3337;
                        } while (--this.field3345 != 0);
                    }
                } else if (this.field3337 < 0) {
                    while (true) {
                        var9 = this.method1541(arg0, var9, var5, var10, var4.field3351[this.field3333 - 1]);
                        if (this.field3336 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3336 - 1) / var8;
                        if (var12 >= this.field3345) {
                            this.field3336 += this.field3345 * var8;
                            this.field3345 = 0;
                            break;
                        }
                        this.field3336 += var8 * var12;
                        this.field3345 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1524(arg0, var9, var6, var10, var4.field3351[this.field3343]);
                        if (this.field3336 < var6) {
                            return;
                        }
                        int var13 = (this.field3336 - var5) / var8;
                        if (var13 >= this.field3345) {
                            this.field3336 -= this.field3345 * var8;
                            this.field3345 = 0;
                            break;
                        }
                        this.field3336 -= var8 * var13;
                        this.field3345 -= var13;
                    }
                }
            }
            if (this.field3337 < 0) {
                this.method1541(arg0, var9, 0, var10, 0);
                if (this.field3336 < 0) {
                    this.field3336 = -1;
                    this.method1505();
                    this.method714(-75);
                }
            } else {
                this.method1524(arg0, var9, var7, var10, 0);
                if (this.field3336 >= var7) {
                    this.field3336 = var7;
                    this.method1505();
                    this.method714(-98);
                }
            }
        } else if (this.field3344) {
            if (this.field3337 < 0) {
                var9 = this.method1541(arg0, arg1, var5, var10, var4.field3351[this.field3343]);
                if (this.field3336 >= var5) {
                    return;
                }
                this.field3336 = var5 + var5 - this.field3336 - 1;
                this.field3337 = -this.field3337;
            }
            while (true) {
                int var11 = this.method1524(arg0, var9, var6, var10, var4.field3351[this.field3333 - 1]);
                if (this.field3336 < var6) {
                    return;
                }
                this.field3336 = var6 + var6 - this.field3336 - 1;
                this.field3337 = -this.field3337;
                var9 = this.method1541(arg0, var11, var5, var10, var4.field3351[this.field3343]);
                if (this.field3336 >= var5) {
                    return;
                }
                this.field3336 = var5 + var5 - this.field3336 - 1;
                this.field3337 = -this.field3337;
            }
        } else if (this.field3337 < 0) {
            while (true) {
                var9 = this.method1541(arg0, var9, var5, var10, var4.field3351[this.field3333 - 1]);
                if (this.field3336 >= var5) {
                    return;
                }
                this.field3336 = var6 - (var6 - 1 - this.field3336) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1524(arg0, var9, var6, var10, var4.field3351[this.field3343]);
                if (this.field3336 < var6) {
                    return;
                }
                this.field3336 = (this.field3336 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsf;III)Lni;", line = 244)
    public static final class219 method1503(class220 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3351 == null || arg0.field3351.length == 0 ? null : new class219(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()I", line = 252)
    public final int method1504() {
        int var1 = this.field3341 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3345 == 0) {
            var2 -= this.field3336 * var2 / (((class220) this.field4810).field3351.length << 8);
        } else if (this.field3345 >= 0) {
            var2 -= this.field3343 * var2 / ((class220) this.field4810).field3351.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()V", line = 264)
    private final void method1505() {
        if (this.field3334 == 0) {
            return;
        }
        if (this.field3332 == Integer.MIN_VALUE) {
            this.field3332 = 0;
        }
        this.field3334 = 0;
        this.method1523();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[B[IIIIIIILni;II)I", line = 276)
    private static final int method1506(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class219 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field3336 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I", line = 303)
    private static final int method1507(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[B[IIIIIIIILni;II)I", line = 306)
    private static final int method1508(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class219 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field3336 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[B[IIIIIIIIIILni;)I", line = 339)
    private static final int method1509(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class219 arg12) {
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
        arg12.field3341 += (var19 - arg4) * arg12.field3346;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field3342 = var15 >> 2;
        arg12.field3335 = var16 >> 2;
        arg12.field3336 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II[B[IIIIIIIILni;II)I", line = 392)
    private static final int method1510(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class219 arg11, int arg12, int arg13) {
        arg11.field3342 -= arg11.field3338 * arg5;
        arg11.field3335 -= arg11.field3339 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field3342 += arg11.field3338 * arg5;
        arg11.field3335 += arg11.field3339 * arg5;
        arg11.field3341 = arg6;
        arg11.field3336 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[B[IIIIIIIIIILni;II)I", line = 425)
    private static final int method1511(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class219 arg13, int arg14, int arg15) {
        arg13.field3341 -= arg13.field3346 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field3341 += arg13.field3346 * var27;
        arg13.field3342 = arg6;
        arg13.field3335 = arg7;
        arg13.field3336 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[B[IIIIIIIILni;)I", line = 467)
    private static final int method1512(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class219 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field3336 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()I", line = 505)
    public final synchronized int method1513() {
        return this.field3337 < 0 ? -this.field3337 : this.field3337;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(II[B[IIIIIIIILni;II)I", line = 509)
    private static final int method1514(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class219 arg11, int arg12, int arg13) {
        arg11.field3342 -= arg11.field3338 * arg5;
        arg11.field3335 -= arg11.field3339 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field3342 += arg11.field3338 * arg5;
        arg11.field3335 += arg11.field3339 * arg5;
        arg11.field3341 = arg6;
        arg11.field3336 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsf;II)Lni;", line = 544)
    public static final class219 method1515(class220 arg0, int arg1, int arg2) {
        return arg0.field3351 == null || arg0.field3351.length == 0 ? null : new class219(arg0, (int) ((long) arg0.field3348 * 256L * (long) arg1 / (long) (class248.field3696 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)V", line = 550)
    private final synchronized void method1516(int arg0, int arg1) {
        this.field3332 = arg0;
        this.field3340 = arg1;
        this.field3334 = 0;
        this.method1523();
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V", line = 557)
    public final synchronized void method1517(int arg0) {
        this.method1516(arg0 << 6, this.method1530());
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()Z", line = 560)
    public final boolean method1518() {
        return this.field3336 < 0 || this.field3336 >= ((class220) this.field4810).field3351.length << 8;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V", line = 563)
    public final synchronized void method1519(int arg0) {
        if (this.field3337 < 0) {
            this.field3337 = -arg0;
        } else {
            this.field3337 = arg0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)V", line = 570)
    public final synchronized void method1520(int arg0, int arg1) {
        this.method1544(arg0, arg1, this.method1530());
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Lcm;", line = 574)
    public final class319 method1521() {
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II[B[IIIIIIILni;II)I", line = 578)
    private static final int method1522(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class219 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field3336 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "()V", line = 604)
    private final void method1523() {
        this.field3341 = this.field3332;
        this.field3342 = method1531(this.field3332, this.field3340);
        this.field3335 = method1507(this.field3332, this.field3340);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([IIIII)I", line = 609)
    private final int method1524(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3334 > 0) {
                int var6 = this.field3334 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3334 += arg1;
                if (this.field3337 == 256 && (this.field3336 & 0xFF) == 0) {
                    if (class242.field3627) {
                        arg1 = method1534(0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, this.field3338, this.field3339, 0, var6, arg2, this);
                    } else {
                        arg1 = method1527(((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, this.field3346, 0, var6, arg2, this);
                    }
                } else if (class242.field3627) {
                    arg1 = method1511(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, this.field3338, this.field3339, 0, var6, arg2, this, this.field3337, arg4);
                } else {
                    arg1 = method1514(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, this.field3346, 0, var6, arg2, this, this.field3337, arg4);
                }
                this.field3334 -= arg1;
                if (this.field3334 != 0) {
                    return arg1;
                }
                if (!this.method1529()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3337 == 256 && (this.field3336 & 0xFF) == 0) {
                if (class242.field3627) {
                    return method1512(0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, 0, arg3, arg2, this);
                }
                return method1545(((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, 0, arg3, arg2, this);
            }
            if (class242.field3627) {
                return method1508(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, 0, arg3, arg2, this, this.field3337, arg4);
            }
            return method1522(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, 0, arg3, arg2, this, this.field3337, arg4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(II[B[IIIIIIIILni;II)I", line = 664)
    private static final int method1525(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class219 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field3336 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([B[IIIIIIIILni;)I", line = 698)
    private static final int method1526(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class219 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3342 += (var14 - arg3) * arg9.field3338;
        arg9.field3335 += (var14 - arg3) * arg9.field3339;
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
        arg9.field3341 = var12 >> 2;
        arg9.field3336 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([B[IIIIIIIILni;)I", line = 732)
    private static final int method1527(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class219 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3342 += (var14 - arg3) * arg9.field3338;
        arg9.field3335 += (var14 - arg3) * arg9.field3339;
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
        arg9.field3341 = var12 >> 2;
        arg9.field3336 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II[B[IIIIIIIIIILni;II)I", line = 766)
    private static final int method1528(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class219 arg13, int arg14, int arg15) {
        arg13.field3341 -= arg13.field3346 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field3341 += arg13.field3346 * var26;
        arg13.field3342 = arg6;
        arg13.field3335 = arg7;
        arg13.field3336 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "()Z", line = 808)
    private final boolean method1529() {
        int var1 = this.field3332;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1531(var1, this.field3340);
            var2 = method1507(var1, this.field3340);
        }
        if (this.field3341 != var1 || this.field3342 != var3 || this.field3335 != var2) {
            if (this.field3341 < var1) {
                this.field3346 = 1;
                this.field3334 = var1 - this.field3341;
            } else if (this.field3341 > var1) {
                this.field3346 = -1;
                this.field3334 = this.field3341 - var1;
            } else {
                this.field3346 = 0;
            }
            if (this.field3342 < var3) {
                this.field3338 = 1;
                if (this.field3334 == 0 || this.field3334 > var3 - this.field3342) {
                    this.field3334 = var3 - this.field3342;
                }
            } else if (this.field3342 > var3) {
                this.field3338 = -1;
                if (this.field3334 == 0 || this.field3334 > this.field3342 - var3) {
                    this.field3334 = this.field3342 - var3;
                }
            } else {
                this.field3338 = 0;
            }
            if (this.field3335 < var2) {
                this.field3339 = 1;
                if (this.field3334 == 0 || this.field3334 > var2 - this.field3335) {
                    this.field3334 = var2 - this.field3335;
                }
            } else if (this.field3335 > var2) {
                this.field3339 = -1;
                if (this.field3334 == 0 || this.field3334 > this.field3335 - var2) {
                    this.field3334 = this.field3335 - var2;
                }
            } else {
                this.field3339 = 0;
            }
            return false;
        } else if (this.field3332 == Integer.MIN_VALUE) {
            this.field3332 = 0;
            this.field3341 = this.field3342 = this.field3335 = 0;
            this.method714(111);
            return true;
        } else {
            this.method1523();
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "()I", line = 894)
    public final synchronized int method1530() {
        return this.field3340 < 0 ? -1 : this.field3340;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(II)I", line = 897)
    private static final int method1531(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 900)
    public final synchronized void method1532(int arg0) {
        if (this.field3334 > 0) {
            if (arg0 >= this.field3334) {
                if (this.field3332 == Integer.MIN_VALUE) {
                    this.field3332 = 0;
                    this.field3341 = this.field3342 = this.field3335 = 0;
                    this.method714(117);
                    arg0 = this.field3334;
                }
                this.field3334 = 0;
                this.method1523();
            } else {
                this.field3341 += this.field3346 * arg0;
                this.field3342 += this.field3338 * arg0;
                this.field3335 += this.field3339 * arg0;
                this.field3334 -= arg0;
            }
        }
        class220 var2 = (class220) this.field4810;
        int var3 = this.field3343 << 8;
        int var4 = this.field3333 << 8;
        int var5 = var2.field3351.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3345 = 0;
        }
        if (this.field3336 < 0) {
            if (this.field3337 <= 0) {
                this.method1505();
                this.method714(-67);
                return;
            }
            this.field3336 = 0;
        }
        if (this.field3336 >= var5) {
            if (this.field3337 >= 0) {
                this.method1505();
                this.method714(-95);
                return;
            }
            this.field3336 = var5 - 1;
        }
        this.field3336 += this.field3337 * arg0;
        if (this.field3345 >= 0) {
            if (this.field3345 > 0) {
                if (this.field3344) {
                    label121: {
                        if (this.field3337 < 0) {
                            if (this.field3336 >= var3) {
                                return;
                            }
                            this.field3336 = var3 + var3 - this.field3336 - 1;
                            this.field3337 = -this.field3337;
                            if (--this.field3345 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3336 < var4) {
                                return;
                            }
                            this.field3336 = var4 + var4 - this.field3336 - 1;
                            this.field3337 = -this.field3337;
                            if (--this.field3345 == 0) {
                                break;
                            }
                            if (this.field3336 >= var3) {
                                return;
                            }
                            this.field3336 = var3 + var3 - this.field3336 - 1;
                            this.field3337 = -this.field3337;
                        } while (--this.field3345 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3337 < 0) {
                            if (this.field3336 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3336 - 1) / var6;
                            if (var7 >= this.field3345) {
                                this.field3336 += this.field3345 * var6;
                                this.field3345 = 0;
                                break label153;
                            }
                            this.field3336 += var6 * var7;
                            this.field3345 -= var7;
                        } else if (this.field3336 >= var4) {
                            int var8 = (this.field3336 - var3) / var6;
                            if (var8 >= this.field3345) {
                                this.field3336 -= this.field3345 * var6;
                                this.field3345 = 0;
                                break label153;
                            }
                            this.field3336 -= var6 * var8;
                            this.field3345 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3337 < 0) {
                if (this.field3336 < 0) {
                    this.field3336 = -1;
                    this.method1505();
                    this.method714(-95);
                }
            } else if (this.field3336 >= var5) {
                this.field3336 = var5;
                this.method1505();
                this.method714(111);
            }
        } else if (this.field3344) {
            if (this.field3337 < 0) {
                if (this.field3336 >= var3) {
                    return;
                }
                this.field3336 = var3 + var3 - this.field3336 - 1;
                this.field3337 = -this.field3337;
            }
            while (this.field3336 >= var4) {
                this.field3336 = var4 + var4 - this.field3336 - 1;
                this.field3337 = -this.field3337;
                if (this.field3336 >= var3) {
                    return;
                }
                this.field3336 = var3 + var3 - this.field3336 - 1;
                this.field3337 = -this.field3337;
            }
        } else if (this.field3337 < 0) {
            if (this.field3336 >= var3) {
                return;
            }
            this.field3336 = var4 - (var4 - 1 - this.field3336) % var6 - 1;
        } else if (this.field3336 >= var4) {
            this.field3336 = (this.field3336 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V", line = 1118)
    public final synchronized void method1533(int arg0) {
        this.field3345 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I[B[IIIIIIIIIILni;)I", line = 1121)
    private static final int method1534(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class219 arg12) {
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
        arg12.field3341 += (var19 - arg4) * arg12.field3346;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field3342 = var15 >> 2;
        arg12.field3335 = var16 >> 2;
        arg12.field3336 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I[B[IIIIIIIILni;)I", line = 1174)
    private static final int method1535(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class219 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field3336 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([B[IIIIIIILni;)I", line = 1216)
    private static final int method1536(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class219 arg8) {
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
        arg8.field3336 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "()I", line = 1241)
    public final synchronized int method1537() {
        return this.field3332 == Integer.MIN_VALUE ? 0 : this.field3332;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V", line = 1245)
    private final synchronized void method1538(int arg0) {
        this.method1516(arg0, this.method1530());
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V", line = 1252)
    public final synchronized void method1539(int arg0) {
        if (arg0 == 0) {
            this.method1538(0);
            this.method714(-64);
        } else if (this.field3342 == 0 && this.field3335 == 0) {
            this.field3334 = 0;
            this.field3332 = 0;
            this.field3341 = 0;
            this.method714(-55);
        } else {
            int var2 = -this.field3341;
            if (this.field3341 > var2) {
                var2 = this.field3341;
            }
            if (-this.field3342 > var2) {
                var2 = -this.field3342;
            }
            if (this.field3342 > var2) {
                var2 = this.field3342;
            }
            if (-this.field3335 > var2) {
                var2 = -this.field3335;
            }
            if (this.field3335 > var2) {
                var2 = this.field3335;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3334 = arg0;
            this.field3332 = Integer.MIN_VALUE;
            this.field3346 = -this.field3341 / arg0;
            this.field3338 = -this.field3342 / arg0;
            this.field3339 = -this.field3335 / arg0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I", line = 1298)
    public final int method1540() {
        return this.field3332 == 0 && this.field3334 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([IIIII)I", line = 1310)
    private final int method1541(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3334 > 0) {
                int var6 = this.field3334 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3334 += arg1;
                if (this.field3337 == -256 && (this.field3336 & 0xFF) == 0) {
                    if (class242.field3627) {
                        arg1 = method1509(0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, this.field3338, this.field3339, 0, var6, arg2, this);
                    } else {
                        arg1 = method1526(((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, this.field3346, 0, var6, arg2, this);
                    }
                } else if (class242.field3627) {
                    arg1 = method1528(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, this.field3338, this.field3339, 0, var6, arg2, this, this.field3337, arg4);
                } else {
                    arg1 = method1510(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, this.field3346, 0, var6, arg2, this, this.field3337, arg4);
                }
                this.field3334 -= arg1;
                if (this.field3334 != 0) {
                    return arg1;
                }
                if (!this.method1529()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3337 == -256 && (this.field3336 & 0xFF) == 0) {
                if (class242.field3627) {
                    return method1535(0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, 0, arg3, arg2, this);
                }
                return method1536(((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, 0, arg3, arg2, this);
            }
            if (class242.field3627) {
                return method1525(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3342, this.field3335, 0, arg3, arg2, this, this.field3337, arg4);
            }
            return method1506(0, 0, ((class220) this.field4810).field3351, arg0, this.field3336, arg1, this.field3341, 0, arg3, arg2, this, this.field3337, arg4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(I)V", line = 1366)
    public final synchronized void method1542(int arg0) {
        int var2 = ((class220) this.field4810).field3351.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3336 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()Lcm;", line = 1379)
    public final class319 method1543() {
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lsf;II)V", line = 1383)
    private class219(class220 arg0, int arg1, int arg2) {
        this.field4810 = arg0;
        this.field3343 = arg0.field3349;
        this.field3333 = arg0.field3347;
        this.field3344 = arg0.field3350;
        this.field3337 = arg1;
        this.field3332 = arg2;
        this.field3340 = 8192;
        this.field3336 = 0;
        this.method1523();
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lsf;III)V", line = 1394)
    private class219(class220 arg0, int arg1, int arg2, int arg3) {
        this.field4810 = arg0;
        this.field3343 = arg0.field3349;
        this.field3333 = arg0.field3347;
        this.field3344 = arg0.field3350;
        this.field3337 = arg1;
        this.field3332 = arg2;
        this.field3340 = arg3;
        this.field3336 = 0;
        this.method1523();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)V", line = 1406)
    public final synchronized void method1544(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1516(arg1, arg2);
            return;
        }
        int var4 = method1531(arg1, arg2);
        int var5 = method1507(arg1, arg2);
        if (this.field3342 == var4 && this.field3335 == var5) {
            this.field3334 = 0;
            return;
        }
        int var6 = arg1 - this.field3341;
        if (this.field3341 - arg1 > var6) {
            var6 = this.field3341 - arg1;
        }
        if (var4 - this.field3342 > var6) {
            var6 = var4 - this.field3342;
        }
        if (this.field3342 - var4 > var6) {
            var6 = this.field3342 - var4;
        }
        if (var5 - this.field3335 > var6) {
            var6 = var5 - this.field3335;
        }
        if (this.field3335 - var5 > var6) {
            var6 = this.field3335 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3334 = arg0;
        this.field3332 = arg1;
        this.field3340 = arg2;
        this.field3346 = (arg1 - this.field3341) / arg0;
        this.field3338 = (var4 - this.field3342) / arg0;
        this.field3339 = (var5 - this.field3335) / arg0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([B[IIIIIIILni;)I", line = 1452)
    private static final int method1545(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class219 arg8) {
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
        arg8.field3336 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "()Z", line = 1478)
    public final boolean method1546() {
        return this.field3334 != 0;
    }
}
