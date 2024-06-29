import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class466 extends class417 {

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    private int field6449;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    private int field6450;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Z")
    private boolean field6453;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    private int field6454;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    private int field6461;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    private int field6455;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    private int field6459;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    private int field6448;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    private int field6451;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    private int field6456;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    private int field6457;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    private int field6458;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    private int field6460;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    private int field6462;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II[B[IIIIIIIILwi;II)I", line = 3)
    private static final int method2592(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class466 arg11, int arg12, int arg13) {
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
        arg11.field6459 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIII)I", line = 36)
    private final int method2593(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6462 <= 0) {
                if (this.field6454 == -256 && (this.field6459 & 255) == 0) {
                    if (class460.field6375) {
                        return method2628(0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, 0, arg3, arg2, this);
                    }
                    return method2613(((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, 0, arg3, arg2, this);
                }
                if (class460.field6375) {
                    return method2605(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, 0, arg3, arg2, this, this.field6454, arg4);
                }
                return method2603(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, 0, arg3, arg2, this, this.field6454, arg4);
            }
            int var6 = this.field6462 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6462 += arg1;
            if (this.field6454 == -256 && (this.field6459 & 255) == 0) {
                if (class460.field6375) {
                    arg1 = method2619(0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, this.field6451, this.field6448, 0, var6, arg2, this);
                } else {
                    arg1 = method2617(((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, this.field6458, 0, var6, arg2, this);
                }
            } else if (class460.field6375) {
                arg1 = method2608(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, this.field6451, this.field6448, 0, var6, arg2, this, this.field6454, arg4);
            } else {
                arg1 = method2594(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, this.field6458, 0, var6, arg2, this, this.field6454, arg4);
            }
            this.field6462 -= arg1;
            if (this.field6462 != 0) {
                return arg1;
            }
        } while (!this.method2597());
        return arg3;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II[B[IIIIIIIILwi;II)I", line = 93)
    private static final int method2594(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class466 arg11, int arg12, int arg13) {
        arg11.field6456 -= arg11.field6451 * arg5;
        arg11.field6460 -= arg11.field6448 * arg5;
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
        arg11.field6456 += arg11.field6451 * arg5;
        arg11.field6460 += arg11.field6448 * arg5;
        arg11.field6457 = arg6;
        arg11.field6459 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lmha;", line = 126)
    public final class417 method1989() {
        return null;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([III)V", line = 133)
    public final synchronized void method1985(int[] arg0, int arg1, int arg2) {
        if (this.field6461 == 0 && this.field6462 == 0) {
            this.method1974(arg2);
        } else {
            class155 var4 = (class155) super.field5876;
            int var5 = this.field6449 << 8;
            int var6 = this.field6450 << 8;
            int var7 = var4.field1995.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6452 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6459 < 0) {
                if (this.field6454 <= 0) {
                    this.method2612();
                    this.method315(68);
                    return;
                }
                this.field6459 = 0;
            }
            if (this.field6459 >= var7) {
                if (this.field6454 >= 0) {
                    this.method2612();
                    this.method315(60);
                    return;
                }
                this.field6459 = var7 - 1;
            }
            if (this.field6452 < 0) {
                if (this.field6453) {
                    if (this.field6454 < 0) {
                        var9 = this.method2593(arg0, arg1, var5, var10, var4.field1995[this.field6449]);
                        if (this.field6459 >= var5) {
                            return;
                        }
                        this.field6459 = var5 + var5 - 1 - this.field6459;
                        this.field6454 = -this.field6454;
                    }
                    while (true) {
                        int var11 = this.method2627(arg0, var9, var6, var10, var4.field1995[this.field6450 - 1]);
                        if (this.field6459 < var6) {
                            return;
                        }
                        this.field6459 = var6 + var6 - 1 - this.field6459;
                        this.field6454 = -this.field6454;
                        var9 = this.method2593(arg0, var11, var5, var10, var4.field1995[this.field6449]);
                        if (this.field6459 >= var5) {
                            return;
                        }
                        this.field6459 = var5 + var5 - 1 - this.field6459;
                        this.field6454 = -this.field6454;
                    }
                } else if (this.field6454 < 0) {
                    while (true) {
                        var9 = this.method2593(arg0, var9, var5, var10, var4.field1995[this.field6450 - 1]);
                        if (this.field6459 >= var5) {
                            return;
                        }
                        this.field6459 = var6 - 1 - (var6 - 1 - this.field6459) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2627(arg0, var9, var6, var10, var4.field1995[this.field6449]);
                        if (this.field6459 < var6) {
                            return;
                        }
                        this.field6459 = (this.field6459 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6452 > 0) {
                    if (this.field6453) {
                        label130: {
                            if (this.field6454 < 0) {
                                var9 = this.method2593(arg0, arg1, var5, var10, var4.field1995[this.field6449]);
                                if (this.field6459 >= var5) {
                                    return;
                                }
                                this.field6459 = var5 + var5 - 1 - this.field6459;
                                this.field6454 = -this.field6454;
                                if (--this.field6452 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2627(arg0, var9, var6, var10, var4.field1995[this.field6450 - 1]);
                                if (this.field6459 < var6) {
                                    return;
                                }
                                this.field6459 = var6 + var6 - 1 - this.field6459;
                                this.field6454 = -this.field6454;
                                if (--this.field6452 == 0) {
                                    break;
                                }
                                var9 = this.method2593(arg0, var9, var5, var10, var4.field1995[this.field6449]);
                                if (this.field6459 >= var5) {
                                    return;
                                }
                                this.field6459 = var5 + var5 - 1 - this.field6459;
                                this.field6454 = -this.field6454;
                            } while (--this.field6452 != 0);
                        }
                    } else if (this.field6454 < 0) {
                        while (true) {
                            var9 = this.method2593(arg0, var9, var5, var10, var4.field1995[this.field6450 - 1]);
                            if (this.field6459 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6459) / var8;
                            if (var12 >= this.field6452) {
                                this.field6459 += this.field6452 * var8;
                                this.field6452 = 0;
                                break;
                            }
                            this.field6459 += var8 * var12;
                            this.field6452 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2627(arg0, var9, var6, var10, var4.field1995[this.field6449]);
                            if (this.field6459 < var6) {
                                return;
                            }
                            int var13 = (this.field6459 - var5) / var8;
                            if (var13 >= this.field6452) {
                                this.field6459 -= this.field6452 * var8;
                                this.field6452 = 0;
                                break;
                            }
                            this.field6459 -= var8 * var13;
                            this.field6452 -= var13;
                        }
                    }
                }
                if (this.field6454 < 0) {
                    this.method2593(arg0, var9, 0, var10, 0);
                    if (this.field6459 < 0) {
                        this.field6459 = -1;
                        this.method2612();
                        this.method315(124);
                        return;
                    }
                } else {
                    this.method2627(arg0, var9, var7, var10, 0);
                    if (this.field6459 >= var7) {
                        this.field6459 = var7;
                        this.method2612();
                        this.method315(50);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()Lmha;", line = 368)
    public final class417 method1991() {
        return null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([B[IIIIIIILwi;)I", line = 371)
    private static final int method2595(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class466 arg8) {
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
        arg8.field6459 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V", line = 396)
    public final synchronized void method2596(int arg0, int arg1) {
        this.method2611(arg0, arg1, this.method2625());
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "()Z", line = 400)
    private final boolean method2597() {
        int var1 = this.field6461;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2604(var1, this.field6455);
            var2 = method2620(var1, this.field6455);
        }
        if (this.field6457 == var1 && this.field6456 == var3 && this.field6460 == var2) {
            if (this.field6461 == Integer.MIN_VALUE) {
                this.field6461 = 0;
                this.field6457 = this.field6456 = this.field6460 = 0;
                this.method315(64);
                return true;
            } else {
                this.method2607();
                return false;
            }
        } else {
            if (this.field6457 < var1) {
                this.field6458 = 1;
                this.field6462 = var1 - this.field6457;
            } else if (this.field6457 > var1) {
                this.field6458 = -1;
                this.field6462 = this.field6457 - var1;
            } else {
                this.field6458 = 0;
            }
            if (this.field6456 < var3) {
                this.field6451 = 1;
                if (this.field6462 == 0 || this.field6462 > var3 - this.field6456) {
                    this.field6462 = var3 - this.field6456;
                }
            } else if (this.field6456 > var3) {
                this.field6451 = -1;
                if (this.field6462 == 0 || this.field6462 > this.field6456 - var3) {
                    this.field6462 = this.field6456 - var3;
                }
            } else {
                this.field6451 = 0;
            }
            if (this.field6460 < var2) {
                this.field6448 = 1;
                if (this.field6462 == 0 || this.field6462 > var2 - this.field6460) {
                    this.field6462 = var2 - this.field6460;
                }
            } else if (this.field6460 > var2) {
                this.field6448 = -1;
                if (this.field6462 == 0 || this.field6462 > this.field6460 - var2) {
                    this.field6462 = this.field6460 - var2;
                }
            } else {
                this.field6448 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 486)
    public final synchronized void method2598(int arg0) {
        int var2 = ((class155) super.field5876).field1995.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6459 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "()I", line = 496)
    public final synchronized int method2599() {
        return this.field6461 == Integer.MIN_VALUE ? 0 : this.field6461;
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "()Z", line = 499)
    public final boolean method2600() {
        return this.field6459 < 0 || this.field6459 >= ((class155) super.field5876).field1995.length << 8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lib;III)Lwi;", line = 503)
    public static final class466 method2601(class155 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1995 != null && arg0.field1995.length != 0 ? new class466(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B[IIIIIIIILwi;)I", line = 509)
    private static final int method2602(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class466 arg10) {
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
        arg10.field6459 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 547)
    public final synchronized void method1974(int arg0) {
        if (this.field6462 > 0) {
            if (arg0 >= this.field6462) {
                if (this.field6461 == Integer.MIN_VALUE) {
                    this.field6461 = 0;
                    this.field6457 = this.field6456 = this.field6460 = 0;
                    this.method315(98);
                    arg0 = this.field6462;
                }
                this.field6462 = 0;
                this.method2607();
            } else {
                this.field6457 += this.field6458 * arg0;
                this.field6456 += this.field6451 * arg0;
                this.field6460 += this.field6448 * arg0;
                this.field6462 -= arg0;
            }
        }
        class155 var2 = (class155) super.field5876;
        int var3 = this.field6449 << 8;
        int var4 = this.field6450 << 8;
        int var5 = var2.field1995.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6452 = 0;
        }
        if (this.field6459 < 0) {
            if (this.field6454 <= 0) {
                this.method2612();
                this.method315(90);
                return;
            }
            this.field6459 = 0;
        }
        if (this.field6459 >= var5) {
            if (this.field6454 >= 0) {
                this.method2612();
                this.method315(84);
                return;
            }
            this.field6459 = var5 - 1;
        }
        this.field6459 += this.field6454 * arg0;
        if (this.field6452 < 0) {
            if (!this.field6453) {
                if (this.field6454 < 0) {
                    if (this.field6459 < var3) {
                        this.field6459 = var4 - 1 - (var4 - 1 - this.field6459) % var6;
                    }
                } else if (this.field6459 >= var4) {
                    this.field6459 = (this.field6459 - var3) % var6 + var3;
                }
            } else {
                if (this.field6454 < 0) {
                    if (this.field6459 >= var3) {
                        return;
                    }
                    this.field6459 = var3 + var3 - 1 - this.field6459;
                    this.field6454 = -this.field6454;
                }
                while (this.field6459 >= var4) {
                    this.field6459 = var4 + var4 - 1 - this.field6459;
                    this.field6454 = -this.field6454;
                    if (this.field6459 >= var3) {
                        return;
                    }
                    this.field6459 = var3 + var3 - 1 - this.field6459;
                    this.field6454 = -this.field6454;
                }
            }
        } else {
            if (this.field6452 > 0) {
                if (this.field6453) {
                    label125: {
                        if (this.field6454 < 0) {
                            if (this.field6459 >= var3) {
                                return;
                            }
                            this.field6459 = var3 + var3 - 1 - this.field6459;
                            this.field6454 = -this.field6454;
                            if (--this.field6452 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6459 < var4) {
                                return;
                            }
                            this.field6459 = var4 + var4 - 1 - this.field6459;
                            this.field6454 = -this.field6454;
                            if (--this.field6452 == 0) {
                                break;
                            }
                            if (this.field6459 >= var3) {
                                return;
                            }
                            this.field6459 = var3 + var3 - 1 - this.field6459;
                            this.field6454 = -this.field6454;
                        } while (--this.field6452 != 0);
                    }
                } else if (this.field6454 < 0) {
                    if (this.field6459 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6459) / var6;
                    if (var7 < this.field6452) {
                        this.field6459 += var6 * var7;
                        this.field6452 -= var7;
                        return;
                    }
                    this.field6459 += this.field6452 * var6;
                    this.field6452 = 0;
                } else {
                    if (this.field6459 < var4) {
                        return;
                    }
                    int var8 = (this.field6459 - var3) / var6;
                    if (var8 < this.field6452) {
                        this.field6459 -= var6 * var8;
                        this.field6452 -= var8;
                        return;
                    }
                    this.field6459 -= this.field6452 * var6;
                    this.field6452 = 0;
                }
            }
            if (this.field6454 < 0) {
                if (this.field6459 < 0) {
                    this.field6459 = -1;
                    this.method2612();
                    this.method315(82);
                    return;
                }
            } else if (this.field6459 >= var5) {
                this.field6459 = var5;
                this.method2612();
                this.method315(87);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II[B[IIIIIIILwi;II)I", line = 765)
    private static final int method2603(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class466 arg10, int arg11, int arg12) {
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
        arg10.field6459 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)I", line = 792)
    private static final int method2604(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II[B[IIIIIIIILwi;II)I", line = 795)
    private static final int method2605(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class466 arg11, int arg12, int arg13) {
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
        arg11.field6459 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 827)
    public final synchronized void method2606(int arg0) {
        if (this.field6454 < 0) {
            this.field6454 = -arg0;
        } else {
            this.field6454 = arg0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "()V", line = 835)
    private final void method2607() {
        this.field6457 = this.field6461;
        this.field6456 = method2604(this.field6461, this.field6455);
        this.field6460 = method2620(this.field6461, this.field6455);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II[B[IIIIIIIIIILwi;II)I", line = 841)
    private static final int method2608(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class466 arg13, int arg14, int arg15) {
        arg13.field6457 -= arg13.field6458 * arg5;
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
        arg13.field6457 += arg13.field6458 * var22;
        arg13.field6456 = arg6;
        arg13.field6460 = arg7;
        arg13.field6459 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)V", line = 884)
    private final synchronized void method2609(int arg0, int arg1) {
        this.field6461 = arg0;
        this.field6455 = arg1;
        this.field6462 = 0;
        this.method2607();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 893)
    public final synchronized void method2610(boolean arg0) {
        this.field6454 = (this.field6454 >>> 31) + (this.field6454 ^ this.field6454 >> 31);
        if (arg0) {
            this.field6454 = -this.field6454;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V", line = 899)
    public final synchronized void method2611(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2609(arg1, arg2);
        } else {
            int var4 = method2604(arg1, arg2);
            int var5 = method2620(arg1, arg2);
            if (this.field6456 == var4 && this.field6460 == var5) {
                this.field6462 = 0;
            } else {
                int var6 = arg1 - this.field6457;
                if (this.field6457 - arg1 > var6) {
                    var6 = this.field6457 - arg1;
                }
                if (var4 - this.field6456 > var6) {
                    var6 = var4 - this.field6456;
                }
                if (this.field6456 - var4 > var6) {
                    var6 = this.field6456 - var4;
                }
                if (var5 - this.field6460 > var6) {
                    var6 = var5 - this.field6460;
                }
                if (this.field6460 - var5 > var6) {
                    var6 = this.field6460 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6462 = arg0;
                this.field6461 = arg1;
                this.field6455 = arg2;
                this.field6458 = (arg1 - this.field6457) / arg0;
                this.field6451 = (var4 - this.field6456) / arg0;
                this.field6448 = (var5 - this.field6460) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "()V", line = 946)
    private final void method2612() {
        if (this.field6462 != 0) {
            if (this.field6461 == Integer.MIN_VALUE) {
                this.field6461 = 0;
            }
            this.field6462 = 0;
            this.method2607();
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([B[IIIIIIILwi;)I", line = 958)
    private static final int method2613(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class466 arg8) {
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
        arg8.field6459 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II[B[IIIIIIIIIILwi;II)I", line = 983)
    private static final int method2614(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class466 arg13, int arg14, int arg15) {
        arg13.field6457 -= arg13.field6458 * arg5;
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
        arg13.field6457 += arg13.field6458 * var22;
        arg13.field6456 = arg6;
        arg13.field6460 = arg7;
        arg13.field6459 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([B[IIIIIIIILwi;)I", line = 1026)
    private static final int method2615(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class466 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6456 += (var14 - arg3) * arg9.field6451;
        arg9.field6460 += (var14 - arg3) * arg9.field6448;
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
        arg9.field6457 = var12 >> 2;
        arg9.field6459 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B[IIIIIIIIIILwi;)I", line = 1061)
    private static final int method2616(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class466 arg12) {
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
        arg12.field6457 += (var19 - arg4) * arg12.field6458;
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
        arg12.field6456 = var15 >> 2;
        arg12.field6460 = var16 >> 2;
        arg12.field6459 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([B[IIIIIIIILwi;)I", line = 1114)
    private static final int method2617(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class466 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6456 += (var14 - arg3) * arg9.field6451;
        arg9.field6460 += (var14 - arg3) * arg9.field6448;
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
        arg9.field6457 = var12 >> 2;
        arg9.field6459 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V", line = 1150)
    private final synchronized void method2618(int arg0) {
        this.method2609(arg0, this.method2625());
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I[B[IIIIIIIIIILwi;)I", line = 1155)
    private static final int method2619(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class466 arg12) {
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
        arg12.field6457 += (var19 - arg4) * arg12.field6458;
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
        arg12.field6456 = var15 >> 2;
        arg12.field6460 = var16 >> 2;
        arg12.field6459 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(II)I", line = 1208)
    private static final int method2620(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)V", line = 1212)
    public final synchronized void method2621(int arg0) {
        this.field6452 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V", line = 1215)
    public final synchronized void method2622(int arg0) {
        if (arg0 == 0) {
            this.method2618(0);
            this.method315(87);
        } else if (this.field6456 == 0 && this.field6460 == 0) {
            this.field6462 = 0;
            this.field6461 = 0;
            this.field6457 = 0;
            this.method315(75);
        } else {
            int var2 = -this.field6457;
            if (this.field6457 > var2) {
                var2 = this.field6457;
            }
            if (-this.field6456 > var2) {
                var2 = -this.field6456;
            }
            if (this.field6456 > var2) {
                var2 = this.field6456;
            }
            if (-this.field6460 > var2) {
                var2 = -this.field6460;
            }
            if (this.field6460 > var2) {
                var2 = this.field6460;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6462 = arg0;
            this.field6461 = Integer.MIN_VALUE;
            this.field6458 = -this.field6457 / arg0;
            this.field6451 = -this.field6456 / arg0;
            this.field6448 = -this.field6460 / arg0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(II[B[IIIIIIIILwi;II)I", line = 1260)
    private static final int method2623(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class466 arg11, int arg12, int arg13) {
        arg11.field6456 -= arg11.field6451 * arg5;
        arg11.field6460 -= arg11.field6448 * arg5;
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
        arg11.field6456 += arg11.field6451 * arg5;
        arg11.field6460 += arg11.field6448 * arg5;
        arg11.field6457 = arg6;
        arg11.field6459 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "()Z", line = 1294)
    public final boolean method2624() {
        return this.field6462 != 0;
    }

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "()I", line = 1297)
    public final synchronized int method2625() {
        return this.field6455 < 0 ? -1 : this.field6455;
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V", line = 1303)
    public final synchronized void method2626(int arg0) {
        this.method2609(arg0 << 6, this.method2625());
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()I", line = 1306)
    public final int method1979() {
        return this.field6461 == 0 && this.field6462 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([IIIII)I", line = 1313)
    private final int method2627(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6462 <= 0) {
                if (this.field6454 == 256 && (this.field6459 & 255) == 0) {
                    if (class460.field6375) {
                        return method2602(0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, 0, arg3, arg2, this);
                    }
                    return method2595(((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, 0, arg3, arg2, this);
                }
                if (class460.field6375) {
                    return method2592(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, 0, arg3, arg2, this, this.field6454, arg4);
                }
                return method2631(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, 0, arg3, arg2, this, this.field6454, arg4);
            }
            int var6 = this.field6462 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6462 += arg1;
            if (this.field6454 == 256 && (this.field6459 & 255) == 0) {
                if (class460.field6375) {
                    arg1 = method2616(0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, this.field6451, this.field6448, 0, var6, arg2, this);
                } else {
                    arg1 = method2615(((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, this.field6458, 0, var6, arg2, this);
                }
            } else if (class460.field6375) {
                arg1 = method2614(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6456, this.field6460, this.field6451, this.field6448, 0, var6, arg2, this, this.field6454, arg4);
            } else {
                arg1 = method2623(0, 0, ((class155) super.field5876).field1995, arg0, this.field6459, arg1, this.field6457, this.field6458, 0, var6, arg2, this, this.field6454, arg4);
            }
            this.field6462 -= arg1;
            if (this.field6462 != 0) {
                return arg1;
            }
        } while (!this.method2597());
        return arg3;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I[B[IIIIIIIILwi;)I", line = 1372)
    private static final int method2628(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class466 arg10) {
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
        arg10.field6459 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "()I", line = 1410)
    public final synchronized int method2629() {
        return this.field6454 < 0 ? -this.field6454 : this.field6454;
    }

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "(I)V", line = 1415)
    public final synchronized void method2630(int arg0) {
        this.method2609(this.method2599(), arg0);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II[B[IIIIIIILwi;II)I", line = 1418)
    private static final int method2631(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class466 arg10, int arg11, int arg12) {
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
        arg10.field6459 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lib;III)V", line = 1443)
    private class466(class155 arg0, int arg1, int arg2, int arg3) {
        super.field5876 = arg0;
        this.field6449 = arg0.field1994;
        this.field6450 = arg0.field1992;
        this.field6453 = arg0.field1993;
        this.field6454 = arg1;
        this.field6461 = arg2;
        this.field6455 = arg3;
        this.field6459 = 0;
        this.method2607();
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()I", line = 1456)
    public final int method2397() {
        int var1 = this.field6457 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6452 == 0) {
            var2 -= this.field6459 * var2 / (((class155) super.field5876).field1995.length << 8);
        } else if (this.field6452 >= 0) {
            var2 -= this.field6449 * var2 / ((class155) super.field5876).field1995.length;
        }
        return var2 > 255 ? 255 : var2;
    }
}
