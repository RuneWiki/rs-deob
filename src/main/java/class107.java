import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 extends class83 {

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    private int field2432;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "Z")
    private boolean field2444;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    private int field2439;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    private int field2440;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    private int field2442;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    private int field2434;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    private int field2435;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    private int field2436;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    private int field2437;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    private int field2443;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    private int field2445;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public final synchronized void method794(int arg0, int arg1) {
        this.method815(arg0, arg1, this.method800());
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIII)I")
    private final int method795(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2436 <= 0) {
                if (this.field2439 == 256 && (this.field2442 & 255) == 0) {
                    if (class73.field1624) {
                        return method799(0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, 0, arg3, arg2, this);
                    }
                    return method817(((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, 0, arg3, arg2, this);
                }
                if (class73.field1624) {
                    return method825(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, 0, arg3, arg2, this, this.field2439, arg4);
                }
                return method820(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, 0, arg3, arg2, this, this.field2439, arg4);
            }
            int var6 = this.field2436 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2436 += arg1;
            if (this.field2439 == 256 && (this.field2442 & 255) == 0) {
                if (class73.field1624) {
                    arg1 = method819(0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, this.field2435, this.field2434, 0, var6, arg2, this);
                } else {
                    arg1 = method821(((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, this.field2441, 0, var6, arg2, this);
                }
            } else if (class73.field1624) {
                arg1 = method798(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, this.field2435, this.field2434, 0, var6, arg2, this, this.field2439, arg4);
            } else {
                arg1 = method804(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, this.field2441, 0, var6, arg2, this, this.field2439, arg4);
            }
            this.field2436 -= arg1;
            if (this.field2436 != 0) {
                return arg1;
            }
        } while (!this.method831());
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIILpc;II)I")
    private static final int method796(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class107 arg11, int arg12, int arg13) {
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
        arg11.field2442 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public final synchronized void method797(int arg0) {
        if (arg0 == 0) {
            this.method802(0);
            this.method172(-2658);
        } else if (this.field2437 == 0 && this.field2445 == 0) {
            this.field2436 = 0;
            this.field2440 = 0;
            this.field2438 = 0;
            this.method172(-2658);
        } else {
            int var2 = -this.field2438;
            if (this.field2438 > var2) {
                var2 = this.field2438;
            }
            if (-this.field2437 > var2) {
                var2 = -this.field2437;
            }
            if (this.field2437 > var2) {
                var2 = this.field2437;
            }
            if (-this.field2445 > var2) {
                var2 = -this.field2445;
            }
            if (this.field2445 > var2) {
                var2 = this.field2445;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2436 = arg0;
            this.field2440 = Integer.MIN_VALUE;
            this.field2441 = -this.field2438 / arg0;
            this.field2435 = -this.field2437 / arg0;
            this.field2434 = -this.field2445 / arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIIIILpc;II)I")
    private static final int method798(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class107 arg13, int arg14, int arg15) {
        arg13.field2438 -= arg13.field2441 * arg5;
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
        arg13.field2438 += arg13.field2441 * var22;
        arg13.field2437 = arg6;
        arg13.field2445 = arg7;
        arg13.field2442 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIILpc;)I")
    private static final int method799(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class107 arg10) {
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
        arg10.field2442 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "()I")
    public final synchronized int method800() {
        return this.field2431 < 0 ? -1 : this.field2431;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final synchronized void method360(int arg0) {
        if (this.field2436 > 0) {
            if (arg0 >= this.field2436) {
                if (this.field2440 == Integer.MIN_VALUE) {
                    this.field2440 = 0;
                    this.field2438 = this.field2437 = this.field2445 = 0;
                    this.method172(-2658);
                    arg0 = this.field2436;
                }
                this.field2436 = 0;
                this.method809();
            } else {
                this.field2438 += this.field2441 * arg0;
                this.field2437 += this.field2435 * arg0;
                this.field2445 += this.field2434 * arg0;
                this.field2436 -= arg0;
            }
        }
        class139 var2 = (class139) super.field1849;
        int var3 = this.field2432 << 8;
        int var4 = this.field2433 << 8;
        int var5 = var2.field3257.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2443 = 0;
        }
        if (this.field2442 < 0) {
            if (this.field2439 <= 0) {
                this.method826();
                this.method172(-2658);
                return;
            }
            this.field2442 = 0;
        }
        if (this.field2442 >= var5) {
            if (this.field2439 >= 0) {
                this.method826();
                this.method172(-2658);
                return;
            }
            this.field2442 = var5 - 1;
        }
        this.field2442 += this.field2439 * arg0;
        if (this.field2443 < 0) {
            if (!this.field2444) {
                if (this.field2439 < 0) {
                    if (this.field2442 < var3) {
                        this.field2442 = var4 - 1 - (var4 - 1 - this.field2442) % var6;
                    }
                } else if (this.field2442 >= var4) {
                    this.field2442 = (this.field2442 - var3) % var6 + var3;
                }
            } else {
                if (this.field2439 < 0) {
                    if (this.field2442 >= var3) {
                        return;
                    }
                    this.field2442 = var3 + var3 - 1 - this.field2442;
                    this.field2439 = -this.field2439;
                }
                while (this.field2442 >= var4) {
                    this.field2442 = var4 + var4 - 1 - this.field2442;
                    this.field2439 = -this.field2439;
                    if (this.field2442 >= var3) {
                        return;
                    }
                    this.field2442 = var3 + var3 - 1 - this.field2442;
                    this.field2439 = -this.field2439;
                }
            }
        } else {
            if (this.field2443 > 0) {
                if (this.field2444) {
                    label125: {
                        if (this.field2439 < 0) {
                            if (this.field2442 >= var3) {
                                return;
                            }
                            this.field2442 = var3 + var3 - 1 - this.field2442;
                            this.field2439 = -this.field2439;
                            if (--this.field2443 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2442 < var4) {
                                return;
                            }
                            this.field2442 = var4 + var4 - 1 - this.field2442;
                            this.field2439 = -this.field2439;
                            if (--this.field2443 == 0) {
                                break;
                            }
                            if (this.field2442 >= var3) {
                                return;
                            }
                            this.field2442 = var3 + var3 - 1 - this.field2442;
                            this.field2439 = -this.field2439;
                        } while (--this.field2443 != 0);
                    }
                } else if (this.field2439 < 0) {
                    if (this.field2442 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2442) / var6;
                    if (var7 < this.field2443) {
                        this.field2442 += var6 * var7;
                        this.field2443 -= var7;
                        return;
                    }
                    this.field2442 += this.field2443 * var6;
                    this.field2443 = 0;
                } else {
                    if (this.field2442 < var4) {
                        return;
                    }
                    int var8 = (this.field2442 - var3) / var6;
                    if (var8 < this.field2443) {
                        this.field2442 -= var6 * var8;
                        this.field2443 -= var8;
                        return;
                    }
                    this.field2442 -= this.field2443 * var6;
                    this.field2443 = 0;
                }
            }
            if (this.field2439 < 0) {
                if (this.field2442 < 0) {
                    this.field2442 = -1;
                    this.method826();
                    this.method172(-2658);
                    return;
                }
            } else if (this.field2442 >= var5) {
                this.field2442 = var5;
                this.method826();
                this.method172(-2658);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public final synchronized void method801(int arg0) {
        this.method813(arg0 << 6, this.method800());
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    private final synchronized void method802(int arg0) {
        this.method813(arg0, this.method800());
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()I")
    public final int method609() {
        int var1 = this.field2438 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2443 == 0) {
            var2 -= this.field2442 * var2 / (((class139) super.field1849).field3257.length << 8);
        } else if (this.field2443 >= 0) {
            var2 -= this.field2432 * var2 / ((class139) super.field1849).field3257.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "()I")
    public final synchronized int method803() {
        return this.field2439 < 0 ? -this.field2439 : this.field2439;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIILpc;II)I")
    private static final int method804(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class107 arg11, int arg12, int arg13) {
        arg11.field2437 -= arg11.field2435 * arg5;
        arg11.field2445 -= arg11.field2434 * arg5;
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
        arg11.field2437 += arg11.field2435 * arg5;
        arg11.field2445 += arg11.field2434 * arg5;
        arg11.field2438 = arg6;
        arg11.field2442 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public final synchronized void method805(int arg0) {
        if (this.field2439 < 0) {
            this.field2439 = -arg0;
        } else {
            this.field2439 = arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    public final synchronized void method806(int arg0) {
        int var2 = ((class139) super.field1849).field3257.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2442 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lu;II)Lpc;")
    public static final class107 method807(class139 arg0, int arg1, int arg2) {
        return arg0.field3257 != null && arg0.field3257.length != 0 ? new class107(arg0, (int) ((long) arg0.field3259 * 256L * (long) arg1 / (long) (class49.field920 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I")
    private static final int method808(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "()V")
    private final void method809() {
        this.field2438 = this.field2440;
        this.field2437 = method808(this.field2440, this.field2431);
        this.field2445 = method828(this.field2440, this.field2431);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIILpc;)I")
    private static final int method810(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class107 arg10) {
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
        arg10.field2442 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIILpc;)I")
    private static final int method811(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class107 arg8) {
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
        arg8.field2442 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
    public final int method357() {
        return this.field2440 == 0 && this.field2436 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIIIILpc;II)I")
    private static final int method812(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class107 arg13, int arg14, int arg15) {
        arg13.field2438 -= arg13.field2441 * arg5;
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
        arg13.field2438 += arg13.field2441 * var22;
        arg13.field2437 = arg6;
        arg13.field2445 = arg7;
        arg13.field2442 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
    private final synchronized void method813(int arg0, int arg1) {
        this.field2440 = arg0;
        this.field2431 = arg1;
        this.field2436 = 0;
        this.method809();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lm;")
    public final class83 method353() {
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
    public final synchronized void method814(int arg0) {
        this.field2443 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public final synchronized void method815(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method813(arg1, arg2);
        } else {
            int var4 = method808(arg1, arg2);
            int var5 = method828(arg1, arg2);
            if (this.field2437 == var4 && this.field2445 == var5) {
                this.field2436 = 0;
            } else {
                int var6 = arg1 - this.field2438;
                if (this.field2438 - arg1 > var6) {
                    var6 = this.field2438 - arg1;
                }
                if (var4 - this.field2437 > var6) {
                    var6 = var4 - this.field2437;
                }
                if (this.field2437 - var4 > var6) {
                    var6 = this.field2437 - var4;
                }
                if (var5 - this.field2445 > var6) {
                    var6 = var5 - this.field2445;
                }
                if (this.field2445 - var5 > var6) {
                    var6 = this.field2445 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2436 = arg0;
                this.field2440 = arg1;
                this.field2431 = arg2;
                this.field2441 = (arg1 - this.field2438) / arg0;
                this.field2435 = (var4 - this.field2437) / arg0;
                this.field2434 = (var5 - this.field2445) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lu;III)Lpc;")
    public static final class107 method816(class139 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3257 != null && arg0.field3257.length != 0 ? new class107(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIILpc;)I")
    private static final int method817(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class107 arg8) {
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
        arg8.field2442 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "()Z")
    public final boolean method818() {
        return this.field2436 != 0;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()Lm;")
    public final class83 method377() {
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIIIILpc;)I")
    private static final int method819(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class107 arg12) {
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
        arg12.field2438 += (var19 - arg4) * arg12.field2441;
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
        arg12.field2437 = var15 >> 2;
        arg12.field2445 = var16 >> 2;
        arg12.field2442 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIILpc;II)I")
    private static final int method820(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class107 arg10, int arg11, int arg12) {
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
        arg10.field2442 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIIILpc;)I")
    private static final int method821(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class107 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2437 += (var14 - arg3) * arg9.field2435;
        arg9.field2445 += (var14 - arg3) * arg9.field2434;
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
        arg9.field2438 = var12 >> 2;
        arg9.field2442 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public final synchronized void method822(boolean arg0) {
        this.field2439 = (this.field2439 >>> 31) + (this.field2439 ^ this.field2439 >> 31);
        if (arg0) {
            this.field2439 = -this.field2439;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([IIIII)I")
    private final int method823(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2436 <= 0) {
                if (this.field2439 == -256 && (this.field2442 & 255) == 0) {
                    if (class73.field1624) {
                        return method810(0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, 0, arg3, arg2, this);
                    }
                    return method811(((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, 0, arg3, arg2, this);
                }
                if (class73.field1624) {
                    return method796(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, 0, arg3, arg2, this, this.field2439, arg4);
                }
                return method829(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, 0, arg3, arg2, this, this.field2439, arg4);
            }
            int var6 = this.field2436 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2436 += arg1;
            if (this.field2439 == -256 && (this.field2442 & 255) == 0) {
                if (class73.field1624) {
                    arg1 = method824(0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, this.field2435, this.field2434, 0, var6, arg2, this);
                } else {
                    arg1 = method827(((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, this.field2441, 0, var6, arg2, this);
                }
            } else if (class73.field1624) {
                arg1 = method812(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2437, this.field2445, this.field2435, this.field2434, 0, var6, arg2, this, this.field2439, arg4);
            } else {
                arg1 = method830(0, 0, ((class139) super.field1849).field3257, arg0, this.field2442, arg1, this.field2438, this.field2441, 0, var6, arg2, this, this.field2439, arg4);
            }
            this.field2436 -= arg1;
            if (this.field2436 != 0) {
                return arg1;
            }
        } while (!this.method831());
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIIIILpc;)I")
    private static final int method824(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class107 arg12) {
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
        arg12.field2438 += (var19 - arg4) * arg12.field2441;
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
        arg12.field2437 = var15 >> 2;
        arg12.field2445 = var16 >> 2;
        arg12.field2442 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II[B[IIIIIIIILpc;II)I")
    private static final int method825(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class107 arg11, int arg12, int arg13) {
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
        arg11.field2442 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([III)V")
    public final synchronized void method372(int[] arg0, int arg1, int arg2) {
        if (this.field2440 == 0 && this.field2436 == 0) {
            this.method360(arg2);
        } else {
            class139 var4 = (class139) super.field1849;
            int var5 = this.field2432 << 8;
            int var6 = this.field2433 << 8;
            int var7 = var4.field3257.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2443 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2442 < 0) {
                if (this.field2439 <= 0) {
                    this.method826();
                    this.method172(-2658);
                    return;
                }
                this.field2442 = 0;
            }
            if (this.field2442 >= var7) {
                if (this.field2439 >= 0) {
                    this.method826();
                    this.method172(-2658);
                    return;
                }
                this.field2442 = var7 - 1;
            }
            if (this.field2443 < 0) {
                if (this.field2444) {
                    if (this.field2439 < 0) {
                        var9 = this.method823(arg0, arg1, var5, var10, var4.field3257[this.field2432]);
                        if (this.field2442 >= var5) {
                            return;
                        }
                        this.field2442 = var5 + var5 - 1 - this.field2442;
                        this.field2439 = -this.field2439;
                    }
                    while (true) {
                        int var11 = this.method795(arg0, var9, var6, var10, var4.field3257[this.field2433 - 1]);
                        if (this.field2442 < var6) {
                            return;
                        }
                        this.field2442 = var6 + var6 - 1 - this.field2442;
                        this.field2439 = -this.field2439;
                        var9 = this.method823(arg0, var11, var5, var10, var4.field3257[this.field2432]);
                        if (this.field2442 >= var5) {
                            return;
                        }
                        this.field2442 = var5 + var5 - 1 - this.field2442;
                        this.field2439 = -this.field2439;
                    }
                } else if (this.field2439 < 0) {
                    while (true) {
                        var9 = this.method823(arg0, var9, var5, var10, var4.field3257[this.field2433 - 1]);
                        if (this.field2442 >= var5) {
                            return;
                        }
                        this.field2442 = var6 - 1 - (var6 - 1 - this.field2442) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method795(arg0, var9, var6, var10, var4.field3257[this.field2432]);
                        if (this.field2442 < var6) {
                            return;
                        }
                        this.field2442 = (this.field2442 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2443 > 0) {
                    if (this.field2444) {
                        label130: {
                            if (this.field2439 < 0) {
                                var9 = this.method823(arg0, arg1, var5, var10, var4.field3257[this.field2432]);
                                if (this.field2442 >= var5) {
                                    return;
                                }
                                this.field2442 = var5 + var5 - 1 - this.field2442;
                                this.field2439 = -this.field2439;
                                if (--this.field2443 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method795(arg0, var9, var6, var10, var4.field3257[this.field2433 - 1]);
                                if (this.field2442 < var6) {
                                    return;
                                }
                                this.field2442 = var6 + var6 - 1 - this.field2442;
                                this.field2439 = -this.field2439;
                                if (--this.field2443 == 0) {
                                    break;
                                }
                                var9 = this.method823(arg0, var9, var5, var10, var4.field3257[this.field2432]);
                                if (this.field2442 >= var5) {
                                    return;
                                }
                                this.field2442 = var5 + var5 - 1 - this.field2442;
                                this.field2439 = -this.field2439;
                            } while (--this.field2443 != 0);
                        }
                    } else if (this.field2439 < 0) {
                        while (true) {
                            var9 = this.method823(arg0, var9, var5, var10, var4.field3257[this.field2433 - 1]);
                            if (this.field2442 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2442) / var8;
                            if (var12 >= this.field2443) {
                                this.field2442 += this.field2443 * var8;
                                this.field2443 = 0;
                                break;
                            }
                            this.field2442 += var8 * var12;
                            this.field2443 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method795(arg0, var9, var6, var10, var4.field3257[this.field2432]);
                            if (this.field2442 < var6) {
                                return;
                            }
                            int var13 = (this.field2442 - var5) / var8;
                            if (var13 >= this.field2443) {
                                this.field2442 -= this.field2443 * var8;
                                this.field2443 = 0;
                                break;
                            }
                            this.field2442 -= var8 * var13;
                            this.field2443 -= var13;
                        }
                    }
                }
                if (this.field2439 < 0) {
                    this.method823(arg0, var9, 0, var10, 0);
                    if (this.field2442 < 0) {
                        this.field2442 = -1;
                        this.method826();
                        this.method172(-2658);
                        return;
                    }
                } else {
                    this.method795(arg0, var9, var7, var10, 0);
                    if (this.field2442 >= var7) {
                        this.field2442 = var7;
                        this.method826();
                        this.method172(-2658);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "()V")
    private final void method826() {
        if (this.field2436 != 0) {
            if (this.field2440 == Integer.MIN_VALUE) {
                this.field2440 = 0;
            }
            this.field2436 = 0;
            this.method809();
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIIILpc;)I")
    private static final int method827(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class107 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2437 += (var14 - arg3) * arg9.field2435;
        arg9.field2445 += (var14 - arg3) * arg9.field2434;
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
        arg9.field2438 = var12 >> 2;
        arg9.field2442 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)I")
    private static final int method828(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIILpc;II)I")
    private static final int method829(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class107 arg10, int arg11, int arg12) {
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
        arg10.field2442 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lu;II)V")
    private class107(class139 arg0, int arg1, int arg2) {
        super.field1849 = arg0;
        this.field2432 = arg0.field3255;
        this.field2433 = arg0.field3258;
        this.field2444 = arg0.field3256;
        this.field2439 = arg1;
        this.field2440 = arg2;
        this.field2431 = 8192;
        this.field2442 = 0;
        this.method809();
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II[B[IIIIIIIILpc;II)I")
    private static final int method830(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class107 arg11, int arg12, int arg13) {
        arg11.field2437 -= arg11.field2435 * arg5;
        arg11.field2445 -= arg11.field2434 * arg5;
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
        arg11.field2437 += arg11.field2435 * arg5;
        arg11.field2445 += arg11.field2434 * arg5;
        arg11.field2438 = arg6;
        arg11.field2442 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z")
    private final boolean method831() {
        int var1 = this.field2440;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method808(var1, this.field2431);
            var2 = method828(var1, this.field2431);
        }
        if (this.field2438 == var1 && this.field2437 == var3 && this.field2445 == var2) {
            if (this.field2440 == Integer.MIN_VALUE) {
                this.field2440 = 0;
                this.field2438 = this.field2437 = this.field2445 = 0;
                this.method172(-2658);
                return true;
            } else {
                this.method809();
                return false;
            }
        } else {
            if (this.field2438 < var1) {
                this.field2441 = 1;
                this.field2436 = var1 - this.field2438;
            } else if (this.field2438 > var1) {
                this.field2441 = -1;
                this.field2436 = this.field2438 - var1;
            } else {
                this.field2441 = 0;
            }
            if (this.field2437 < var3) {
                this.field2435 = 1;
                if (this.field2436 == 0 || this.field2436 > var3 - this.field2437) {
                    this.field2436 = var3 - this.field2437;
                }
            } else if (this.field2437 > var3) {
                this.field2435 = -1;
                if (this.field2436 == 0 || this.field2436 > this.field2437 - var3) {
                    this.field2436 = this.field2437 - var3;
                }
            } else {
                this.field2435 = 0;
            }
            if (this.field2445 < var2) {
                this.field2434 = 1;
                if (this.field2436 == 0 || this.field2436 > var2 - this.field2445) {
                    this.field2436 = var2 - this.field2445;
                }
            } else if (this.field2445 > var2) {
                this.field2434 = -1;
                if (this.field2436 == 0 || this.field2436 > this.field2445 - var2) {
                    this.field2436 = this.field2445 - var2;
                }
            } else {
                this.field2434 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "()I")
    public final synchronized int method832() {
        return this.field2440 == Integer.MIN_VALUE ? 0 : this.field2440;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lu;III)V")
    private class107(class139 arg0, int arg1, int arg2, int arg3) {
        super.field1849 = arg0;
        this.field2432 = arg0.field3255;
        this.field2433 = arg0.field3258;
        this.field2444 = arg0.field3256;
        this.field2439 = arg1;
        this.field2440 = arg2;
        this.field2431 = arg3;
        this.field2442 = 0;
        this.method809();
    }

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "()Z")
    public final boolean method833() {
        return this.field2442 < 0 || this.field2442 >= ((class139) super.field1849).field3257.length << 8;
    }
}
