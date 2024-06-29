import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class137 extends class7 {

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Z")
    private boolean field2571;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    private int field2569;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    private int field2561;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    private int field2567;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    private int field2570;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([III)V")
    public final synchronized void method32(int[] arg0, int arg1, int arg2) {
        if (this.field2569 == 0 && this.field2564 == 0) {
            this.method31(arg2);
        } else {
            class174 var4 = (class174) super.field51;
            int var5 = this.field2559 << 8;
            int var6 = this.field2562 << 8;
            int var7 = var4.field3180.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2561 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2563 < 0) {
                if (this.field2558 <= 0) {
                    this.method1030();
                    this.method632(-8296);
                    return;
                }
                this.field2563 = 0;
            }
            if (this.field2563 >= var7) {
                if (this.field2558 >= 0) {
                    this.method1030();
                    this.method632(-8296);
                    return;
                }
                this.field2563 = var7 - 1;
            }
            if (this.field2561 < 0) {
                if (this.field2571) {
                    if (this.field2558 < 0) {
                        var9 = this.method1060(arg0, arg1, var5, var10, var4.field3180[this.field2559]);
                        if (this.field2563 >= var5) {
                            return;
                        }
                        this.field2563 = var5 + var5 - 1 - this.field2563;
                        this.field2558 = -this.field2558;
                    }
                    while (true) {
                        int var11 = this.method1045(arg0, var9, var6, var10, var4.field3180[this.field2562 - 1]);
                        if (this.field2563 < var6) {
                            return;
                        }
                        this.field2563 = var6 + var6 - 1 - this.field2563;
                        this.field2558 = -this.field2558;
                        var9 = this.method1060(arg0, var11, var5, var10, var4.field3180[this.field2559]);
                        if (this.field2563 >= var5) {
                            return;
                        }
                        this.field2563 = var5 + var5 - 1 - this.field2563;
                        this.field2558 = -this.field2558;
                    }
                } else if (this.field2558 < 0) {
                    while (true) {
                        var9 = this.method1060(arg0, var9, var5, var10, var4.field3180[this.field2562 - 1]);
                        if (this.field2563 >= var5) {
                            return;
                        }
                        this.field2563 = var6 - 1 - (var6 - 1 - this.field2563) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1045(arg0, var9, var6, var10, var4.field3180[this.field2559]);
                        if (this.field2563 < var6) {
                            return;
                        }
                        this.field2563 = (this.field2563 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2561 > 0) {
                    if (this.field2571) {
                        label130: {
                            if (this.field2558 < 0) {
                                var9 = this.method1060(arg0, arg1, var5, var10, var4.field3180[this.field2559]);
                                if (this.field2563 >= var5) {
                                    return;
                                }
                                this.field2563 = var5 + var5 - 1 - this.field2563;
                                this.field2558 = -this.field2558;
                                if (--this.field2561 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1045(arg0, var9, var6, var10, var4.field3180[this.field2562 - 1]);
                                if (this.field2563 < var6) {
                                    return;
                                }
                                this.field2563 = var6 + var6 - 1 - this.field2563;
                                this.field2558 = -this.field2558;
                                if (--this.field2561 == 0) {
                                    break;
                                }
                                var9 = this.method1060(arg0, var9, var5, var10, var4.field3180[this.field2559]);
                                if (this.field2563 >= var5) {
                                    return;
                                }
                                this.field2563 = var5 + var5 - 1 - this.field2563;
                                this.field2558 = -this.field2558;
                            } while (--this.field2561 != 0);
                        }
                    } else if (this.field2558 < 0) {
                        while (true) {
                            var9 = this.method1060(arg0, var9, var5, var10, var4.field3180[this.field2562 - 1]);
                            if (this.field2563 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2563) / var8;
                            if (var12 >= this.field2561) {
                                this.field2563 += this.field2561 * var8;
                                this.field2561 = 0;
                                break;
                            }
                            this.field2563 += var8 * var12;
                            this.field2561 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1045(arg0, var9, var6, var10, var4.field3180[this.field2559]);
                            if (this.field2563 < var6) {
                                return;
                            }
                            int var13 = (this.field2563 - var5) / var8;
                            if (var13 >= this.field2561) {
                                this.field2563 -= this.field2561 * var8;
                                this.field2561 = 0;
                                break;
                            }
                            this.field2563 -= var8 * var13;
                            this.field2561 -= var13;
                        }
                    }
                }
                if (this.field2558 < 0) {
                    this.method1060(arg0, var9, 0, var10, 0);
                    if (this.field2563 < 0) {
                        this.field2563 = -1;
                        this.method1030();
                        this.method632(-8296);
                        return;
                    }
                } else {
                    this.method1045(arg0, var9, var7, var10, 0);
                    if (this.field2563 >= var7) {
                        this.field2563 = var7;
                        this.method1030();
                        this.method632(-8296);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()I")
    public final int method29() {
        int var1 = this.field2566 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2561 == 0) {
            var2 -= this.field2563 * var2 / (((class174) super.field51).field3180.length << 8);
        } else if (this.field2561 >= 0) {
            var2 -= this.field2559 * var2 / ((class174) super.field51).field3180.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[B[IIIIIIIIIILic;II)I")
    private static final int method1023(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class137 arg13, int arg14, int arg15) {
        arg13.field2566 -= arg13.field2565 * arg5;
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
        arg13.field2566 += arg13.field2565 * var22;
        arg13.field2560 = arg6;
        arg13.field2572 = arg7;
        arg13.field2563 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[IIIIIIILic;)I")
    private static final int method1024(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
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
        arg8.field2563 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final synchronized void method1025(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1052(arg1, arg2);
        } else {
            int var4 = method1058(arg1, arg2);
            int var5 = method1054(arg1, arg2);
            if (this.field2560 == var4 && this.field2572 == var5) {
                this.field2564 = 0;
            } else {
                int var6 = arg1 - this.field2566;
                if (this.field2566 - arg1 > var6) {
                    var6 = this.field2566 - arg1;
                }
                if (var4 - this.field2560 > var6) {
                    var6 = var4 - this.field2560;
                }
                if (this.field2560 - var4 > var6) {
                    var6 = this.field2560 - var4;
                }
                if (var5 - this.field2572 > var6) {
                    var6 = var5 - this.field2572;
                }
                if (this.field2572 - var5 > var6) {
                    var6 = this.field2572 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2564 = arg0;
                this.field2569 = arg1;
                this.field2568 = arg2;
                this.field2565 = (arg1 - this.field2566) / arg0;
                this.field2570 = (var4 - this.field2560) / arg0;
                this.field2567 = (var5 - this.field2572) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final synchronized void method31(int arg0) {
        if (this.field2564 > 0) {
            if (arg0 >= this.field2564) {
                if (this.field2569 == Integer.MIN_VALUE) {
                    this.field2569 = 0;
                    this.field2566 = this.field2560 = this.field2572 = 0;
                    this.method632(-8296);
                    arg0 = this.field2564;
                }
                this.field2564 = 0;
                this.method1028();
            } else {
                this.field2566 += this.field2565 * arg0;
                this.field2560 += this.field2570 * arg0;
                this.field2572 += this.field2567 * arg0;
                this.field2564 -= arg0;
            }
        }
        class174 var2 = (class174) super.field51;
        int var3 = this.field2559 << 8;
        int var4 = this.field2562 << 8;
        int var5 = var2.field3180.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2561 = 0;
        }
        if (this.field2563 < 0) {
            if (this.field2558 <= 0) {
                this.method1030();
                this.method632(-8296);
                return;
            }
            this.field2563 = 0;
        }
        if (this.field2563 >= var5) {
            if (this.field2558 >= 0) {
                this.method1030();
                this.method632(-8296);
                return;
            }
            this.field2563 = var5 - 1;
        }
        this.field2563 += this.field2558 * arg0;
        if (this.field2561 < 0) {
            if (!this.field2571) {
                if (this.field2558 < 0) {
                    if (this.field2563 < var3) {
                        this.field2563 = var4 - 1 - (var4 - 1 - this.field2563) % var6;
                    }
                } else if (this.field2563 >= var4) {
                    this.field2563 = (this.field2563 - var3) % var6 + var3;
                }
            } else {
                if (this.field2558 < 0) {
                    if (this.field2563 >= var3) {
                        return;
                    }
                    this.field2563 = var3 + var3 - 1 - this.field2563;
                    this.field2558 = -this.field2558;
                }
                while (this.field2563 >= var4) {
                    this.field2563 = var4 + var4 - 1 - this.field2563;
                    this.field2558 = -this.field2558;
                    if (this.field2563 >= var3) {
                        return;
                    }
                    this.field2563 = var3 + var3 - 1 - this.field2563;
                    this.field2558 = -this.field2558;
                }
            }
        } else {
            if (this.field2561 > 0) {
                if (this.field2571) {
                    label125: {
                        if (this.field2558 < 0) {
                            if (this.field2563 >= var3) {
                                return;
                            }
                            this.field2563 = var3 + var3 - 1 - this.field2563;
                            this.field2558 = -this.field2558;
                            if (--this.field2561 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2563 < var4) {
                                return;
                            }
                            this.field2563 = var4 + var4 - 1 - this.field2563;
                            this.field2558 = -this.field2558;
                            if (--this.field2561 == 0) {
                                break;
                            }
                            if (this.field2563 >= var3) {
                                return;
                            }
                            this.field2563 = var3 + var3 - 1 - this.field2563;
                            this.field2558 = -this.field2558;
                        } while (--this.field2561 != 0);
                    }
                } else if (this.field2558 < 0) {
                    if (this.field2563 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2563) / var6;
                    if (var7 < this.field2561) {
                        this.field2563 += var6 * var7;
                        this.field2561 -= var7;
                        return;
                    }
                    this.field2563 += this.field2561 * var6;
                    this.field2561 = 0;
                } else {
                    if (this.field2563 < var4) {
                        return;
                    }
                    int var8 = (this.field2563 - var3) / var6;
                    if (var8 < this.field2561) {
                        this.field2563 -= var6 * var8;
                        this.field2561 -= var8;
                        return;
                    }
                    this.field2563 -= this.field2561 * var6;
                    this.field2561 = 0;
                }
            }
            if (this.field2558 < 0) {
                if (this.field2563 < 0) {
                    this.field2563 = -1;
                    this.method1030();
                    this.method632(-8296);
                    return;
                }
            } else if (this.field2563 >= var5) {
                this.field2563 = var5;
                this.method1030();
                this.method632(-8296);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()I")
    public final int method35() {
        return this.field2569 == 0 && this.field2564 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([B[IIIIIIILic;)I")
    private static final int method1026(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8) {
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
        arg8.field2563 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()I")
    public final synchronized int method1027() {
        return this.field2568 < 0 ? -1 : this.field2568;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "()V")
    private final void method1028() {
        this.field2566 = this.field2569;
        this.field2560 = method1058(this.field2569, this.field2568);
        this.field2572 = method1054(this.field2569, this.field2568);
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "()I")
    public final synchronized int method1029() {
        return this.field2569 == Integer.MIN_VALUE ? 0 : this.field2569;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "()V")
    private final void method1030() {
        if (this.field2564 != 0) {
            if (this.field2569 == Integer.MIN_VALUE) {
                this.field2569 = 0;
            }
            this.field2564 = 0;
            this.method1028();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[B[IIIIIIILic;II)I")
    private static final int method1031(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10, int arg11, int arg12) {
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
        arg10.field2563 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II[B[IIIIIIILic;II)I")
    private static final int method1032(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10, int arg11, int arg12) {
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
        arg10.field2563 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B[IIIIIIIIIILic;)I")
    private static final int method1033(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class137 arg12) {
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
        arg12.field2566 += (var19 - arg4) * arg12.field2565;
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
        arg12.field2560 = var15 >> 2;
        arg12.field2572 = var16 >> 2;
        arg12.field2563 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method1034(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
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
        arg11.field2563 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public final synchronized void method1035(int arg0, int arg1) {
        this.method1025(arg0, arg1, this.method1027());
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public final synchronized void method1036(boolean arg0) {
        this.field2558 = (this.field2558 >>> 31) + (this.field2558 ^ this.field2558 >> 31);
        if (arg0) {
            this.field2558 = -this.field2558;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public final synchronized void method1037(int arg0) {
        if (arg0 == 0) {
            this.method1050(0);
            this.method632(-8296);
        } else if (this.field2560 == 0 && this.field2572 == 0) {
            this.field2564 = 0;
            this.field2569 = 0;
            this.field2566 = 0;
            this.method632(-8296);
        } else {
            int var2 = -this.field2566;
            if (this.field2566 > var2) {
                var2 = this.field2566;
            }
            if (-this.field2560 > var2) {
                var2 = -this.field2560;
            }
            if (this.field2560 > var2) {
                var2 = this.field2560;
            }
            if (-this.field2572 > var2) {
                var2 = -this.field2572;
            }
            if (this.field2572 > var2) {
                var2 = this.field2572;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2564 = arg0;
            this.field2569 = Integer.MIN_VALUE;
            this.field2565 = -this.field2566 / arg0;
            this.field2570 = -this.field2560 / arg0;
            this.field2567 = -this.field2572 / arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lk;II)Lic;")
    public static final class137 method1038(class174 arg0, int arg1, int arg2) {
        return arg0.field3180 != null && arg0.field3180.length != 0 ? new class137(arg0, (int) ((long) arg0.field3178 * 256L * (long) arg1 / (long) (class133.field2473 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I[B[IIIIIIIIIILic;)I")
    private static final int method1039(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class137 arg12) {
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
        arg12.field2566 += (var19 - arg4) * arg12.field2565;
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
        arg12.field2560 = var15 >> 2;
        arg12.field2572 = var16 >> 2;
        arg12.field2563 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method1040(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
        arg11.field2560 -= arg11.field2570 * arg5;
        arg11.field2572 -= arg11.field2567 * arg5;
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
        arg11.field2560 += arg11.field2570 * arg5;
        arg11.field2572 += arg11.field2567 * arg5;
        arg11.field2566 = arg6;
        arg11.field2563 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()Lbh;")
    public final class7 method34() {
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B[IIIIIIIILic;)I")
    private static final int method1041(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10) {
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
        arg10.field2563 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public final synchronized void method1042(int arg0) {
        int var2 = ((class174) super.field51).field3180.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2563 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I[B[IIIIIIIILic;)I")
    private static final int method1043(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class137 arg10) {
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
        arg10.field2563 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()Lbh;")
    public final class7 method33() {
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II[B[IIIIIIIIIILic;II)I")
    private static final int method1044(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class137 arg13, int arg14, int arg15) {
        arg13.field2566 -= arg13.field2565 * arg5;
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
        arg13.field2566 += arg13.field2565 * var22;
        arg13.field2560 = arg6;
        arg13.field2572 = arg7;
        arg13.field2563 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIIII)I")
    private final int method1045(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2564 <= 0) {
                if (this.field2558 == 256 && (this.field2563 & 255) == 0) {
                    if (class256.field4597) {
                        return method1041(0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, 0, arg3, arg2, this);
                    }
                    return method1024(((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, 0, arg3, arg2, this);
                }
                if (class256.field4597) {
                    return method1046(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, 0, arg3, arg2, this, this.field2558, arg4);
                }
                return method1032(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, 0, arg3, arg2, this, this.field2558, arg4);
            }
            int var6 = this.field2564 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2564 += arg1;
            if (this.field2558 == 256 && (this.field2563 & 255) == 0) {
                if (class256.field4597) {
                    arg1 = method1033(0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, this.field2570, this.field2567, 0, var6, arg2, this);
                } else {
                    arg1 = method1049(((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, this.field2565, 0, var6, arg2, this);
                }
            } else if (class256.field4597) {
                arg1 = method1044(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, this.field2570, this.field2567, 0, var6, arg2, this, this.field2558, arg4);
            } else {
                arg1 = method1057(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, this.field2565, 0, var6, arg2, this, this.field2558, arg4);
            }
            this.field2564 -= arg1;
            if (this.field2564 != 0) {
                return arg1;
            }
        } while (!this.method1056());
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method1046(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
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
        arg11.field2563 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public final synchronized void method1047(int arg0) {
        if (this.field2558 < 0) {
            this.field2558 = -arg0;
        } else {
            this.field2558 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[IIIIIIIILic;)I")
    private static final int method1048(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class137 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2560 += (var14 - arg3) * arg9.field2570;
        arg9.field2572 += (var14 - arg3) * arg9.field2567;
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
        arg9.field2566 = var12 >> 2;
        arg9.field2563 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([B[IIIIIIIILic;)I")
    private static final int method1049(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class137 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2560 += (var14 - arg3) * arg9.field2570;
        arg9.field2572 += (var14 - arg3) * arg9.field2567;
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
        arg9.field2566 = var12 >> 2;
        arg9.field2563 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
    private final synchronized void method1050(int arg0) {
        this.method1052(arg0, this.method1027());
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "()Z")
    public final boolean method1051() {
        return this.field2563 < 0 || this.field2563 >= ((class174) super.field51).field3180.length << 8;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    private final synchronized void method1052(int arg0, int arg1) {
        this.field2569 = arg0;
        this.field2568 = arg1;
        this.field2564 = 0;
        this.method1028();
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
    public final synchronized void method1053(int arg0) {
        this.method1052(arg0 << 6, this.method1027());
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)I")
    private static final int method1054(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lk;III)Lic;")
    public static final class137 method1055(class174 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3180 != null && arg0.field3180.length != 0 ? new class137(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "()Z")
    private final boolean method1056() {
        int var1 = this.field2569;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1058(var1, this.field2568);
            var2 = method1054(var1, this.field2568);
        }
        if (this.field2566 == var1 && this.field2560 == var3 && this.field2572 == var2) {
            if (this.field2569 == Integer.MIN_VALUE) {
                this.field2569 = 0;
                this.field2566 = this.field2560 = this.field2572 = 0;
                this.method632(-8296);
                return true;
            } else {
                this.method1028();
                return false;
            }
        } else {
            if (this.field2566 < var1) {
                this.field2565 = 1;
                this.field2564 = var1 - this.field2566;
            } else if (this.field2566 > var1) {
                this.field2565 = -1;
                this.field2564 = this.field2566 - var1;
            } else {
                this.field2565 = 0;
            }
            if (this.field2560 < var3) {
                this.field2570 = 1;
                if (this.field2564 == 0 || this.field2564 > var3 - this.field2560) {
                    this.field2564 = var3 - this.field2560;
                }
            } else if (this.field2560 > var3) {
                this.field2570 = -1;
                if (this.field2564 == 0 || this.field2564 > this.field2560 - var3) {
                    this.field2564 = this.field2560 - var3;
                }
            } else {
                this.field2570 = 0;
            }
            if (this.field2572 < var2) {
                this.field2567 = 1;
                if (this.field2564 == 0 || this.field2564 > var2 - this.field2572) {
                    this.field2564 = var2 - this.field2572;
                }
            } else if (this.field2572 > var2) {
                this.field2567 = -1;
                if (this.field2564 == 0 || this.field2564 > this.field2572 - var2) {
                    this.field2564 = this.field2572 - var2;
                }
            } else {
                this.field2567 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method1057(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class137 arg11, int arg12, int arg13) {
        arg11.field2560 -= arg11.field2570 * arg5;
        arg11.field2572 -= arg11.field2567 * arg5;
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
        arg11.field2560 += arg11.field2570 * arg5;
        arg11.field2572 += arg11.field2567 * arg5;
        arg11.field2566 = arg6;
        arg11.field2563 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)I")
    private static final int method1058(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "()Z")
    public final boolean method1059() {
        return this.field2564 != 0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([IIIII)I")
    private final int method1060(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2564 <= 0) {
                if (this.field2558 == -256 && (this.field2563 & 255) == 0) {
                    if (class256.field4597) {
                        return method1043(0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, 0, arg3, arg2, this);
                    }
                    return method1026(((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, 0, arg3, arg2, this);
                }
                if (class256.field4597) {
                    return method1034(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, 0, arg3, arg2, this, this.field2558, arg4);
                }
                return method1031(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, 0, arg3, arg2, this, this.field2558, arg4);
            }
            int var6 = this.field2564 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2564 += arg1;
            if (this.field2558 == -256 && (this.field2563 & 255) == 0) {
                if (class256.field4597) {
                    arg1 = method1039(0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, this.field2570, this.field2567, 0, var6, arg2, this);
                } else {
                    arg1 = method1048(((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, this.field2565, 0, var6, arg2, this);
                }
            } else if (class256.field4597) {
                arg1 = method1023(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2560, this.field2572, this.field2570, this.field2567, 0, var6, arg2, this, this.field2558, arg4);
            } else {
                arg1 = method1040(0, 0, ((class174) super.field51).field3180, arg0, this.field2563, arg1, this.field2566, this.field2565, 0, var6, arg2, this, this.field2558, arg4);
            }
            this.field2564 -= arg1;
            if (this.field2564 != 0) {
                return arg1;
            }
        } while (!this.method1056());
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "()I")
    public final synchronized int method1061() {
        return this.field2558 < 0 ? -this.field2558 : this.field2558;
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
    public final synchronized void method1062(int arg0) {
        this.field2561 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lk;II)V")
    private class137(class174 arg0, int arg1, int arg2) {
        super.field51 = arg0;
        this.field2559 = arg0.field3176;
        this.field2562 = arg0.field3177;
        this.field2571 = arg0.field3179;
        this.field2558 = arg1;
        this.field2569 = arg2;
        this.field2568 = 8192;
        this.field2563 = 0;
        this.method1028();
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lk;III)V")
    private class137(class174 arg0, int arg1, int arg2, int arg3) {
        super.field51 = arg0;
        this.field2559 = arg0.field3176;
        this.field2562 = arg0.field3177;
        this.field2571 = arg0.field3179;
        this.field2558 = arg1;
        this.field2569 = arg2;
        this.field2568 = arg3;
        this.field2563 = 0;
        this.method1028();
    }
}
