import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class29 {

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Z")
    private boolean field311;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()I")
    public final int method127() {
        return this.field318 == 0 && this.field312 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()Lch;")
    public final class29 method128() {
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
    public final synchronized void method129(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method132(arg1, arg2);
        } else {
            int var4 = method158(arg1, arg2);
            int var5 = method165(arg1, arg2);
            if (this.field314 == var4 && this.field320 == var5) {
                this.field312 = 0;
            } else {
                int var6 = arg1 - this.field310;
                if (this.field310 - arg1 > var6) {
                    var6 = this.field310 - arg1;
                }
                if (var4 - this.field314 > var6) {
                    var6 = var4 - this.field314;
                }
                if (this.field314 - var4 > var6) {
                    var6 = this.field314 - var4;
                }
                if (var5 - this.field320 > var6) {
                    var6 = var5 - this.field320;
                }
                if (this.field320 - var5 > var6) {
                    var6 = this.field320 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field312 = arg0;
                this.field318 = arg1;
                this.field315 = arg2;
                this.field319 = (arg1 - this.field310) / arg0;
                this.field317 = (var4 - this.field314) / arg0;
                this.field316 = (var5 - this.field320) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lle;II)Lbd;")
    public static final class15 method130(class104 arg0, int arg1, int arg2) {
        return arg0.field2176 != null && arg0.field2176.length != 0 ? new class15(arg0, (int) ((long) arg0.field2177 * 256L * (long) arg1 / (long) (class110.field2276 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public final synchronized void method131(int arg0) {
        this.method132(arg0 << 6, this.method160());
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    private final synchronized void method132(int arg0, int arg1) {
        this.field318 = arg0;
        this.field315 = arg1;
        this.field312 = 0;
        this.method146();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([B[IIIIIIILbd;)I")
    private static final int method133(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class15 arg8) {
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
        arg8.field306 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([B[IIIIIIIILbd;)I")
    private static final int method134(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class15 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field314 += (var14 - arg3) * arg9.field317;
        arg9.field320 += (var14 - arg3) * arg9.field316;
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
        arg9.field310 = var12 >> 2;
        arg9.field306 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()I")
    public final synchronized int method135() {
        return this.field318 == Integer.MIN_VALUE ? 0 : this.field318;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final synchronized void method136(int arg0) {
        if (this.field312 > 0) {
            if (arg0 >= this.field312) {
                if (this.field318 == Integer.MIN_VALUE) {
                    this.field318 = 0;
                    this.field310 = this.field314 = this.field320 = 0;
                    this.method885(3);
                    arg0 = this.field312;
                }
                this.field312 = 0;
                this.method146();
            } else {
                this.field310 += this.field319 * arg0;
                this.field314 += this.field317 * arg0;
                this.field320 += this.field316 * arg0;
                this.field312 -= arg0;
            }
        }
        class104 var2 = (class104) super.field531;
        int var3 = this.field307 << 8;
        int var4 = this.field313 << 8;
        int var5 = var2.field2176.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field308 = 0;
        }
        if (this.field306 < 0) {
            if (this.field309 <= 0) {
                this.method156();
                this.method885(3);
                return;
            }
            this.field306 = 0;
        }
        if (this.field306 >= var5) {
            if (this.field309 >= 0) {
                this.method156();
                this.method885(3);
                return;
            }
            this.field306 = var5 - 1;
        }
        this.field306 += this.field309 * arg0;
        if (this.field308 < 0) {
            if (!this.field311) {
                if (this.field309 < 0) {
                    if (this.field306 < var3) {
                        this.field306 = var4 - 1 - (var4 - 1 - this.field306) % var6;
                    }
                } else if (this.field306 >= var4) {
                    this.field306 = (this.field306 - var3) % var6 + var3;
                }
            } else {
                if (this.field309 < 0) {
                    if (this.field306 >= var3) {
                        return;
                    }
                    this.field306 = var3 + var3 - 1 - this.field306;
                    this.field309 = -this.field309;
                }
                while (this.field306 >= var4) {
                    this.field306 = var4 + var4 - 1 - this.field306;
                    this.field309 = -this.field309;
                    if (this.field306 >= var3) {
                        return;
                    }
                    this.field306 = var3 + var3 - 1 - this.field306;
                    this.field309 = -this.field309;
                }
            }
        } else {
            if (this.field308 > 0) {
                if (this.field311) {
                    label125: {
                        if (this.field309 < 0) {
                            if (this.field306 >= var3) {
                                return;
                            }
                            this.field306 = var3 + var3 - 1 - this.field306;
                            this.field309 = -this.field309;
                            if (--this.field308 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field306 < var4) {
                                return;
                            }
                            this.field306 = var4 + var4 - 1 - this.field306;
                            this.field309 = -this.field309;
                            if (--this.field308 == 0) {
                                break;
                            }
                            if (this.field306 >= var3) {
                                return;
                            }
                            this.field306 = var3 + var3 - 1 - this.field306;
                            this.field309 = -this.field309;
                        } while (--this.field308 != 0);
                    }
                } else if (this.field309 < 0) {
                    if (this.field306 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field306) / var6;
                    if (var7 < this.field308) {
                        this.field306 += var6 * var7;
                        this.field308 -= var7;
                        return;
                    }
                    this.field306 += this.field308 * var6;
                    this.field308 = 0;
                } else {
                    if (this.field306 < var4) {
                        return;
                    }
                    int var8 = (this.field306 - var3) / var6;
                    if (var8 < this.field308) {
                        this.field306 -= var6 * var8;
                        this.field308 -= var8;
                        return;
                    }
                    this.field306 -= this.field308 * var6;
                    this.field308 = 0;
                }
            }
            if (this.field309 < 0) {
                if (this.field306 < 0) {
                    this.field306 = -1;
                    this.method156();
                    this.method885(3);
                    return;
                }
            } else if (this.field306 >= var5) {
                this.field306 = var5;
                this.method156();
                this.method885(3);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "()I")
    public final synchronized int method137() {
        return this.field309 < 0 ? -this.field309 : this.field309;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIII)I")
    private final int method138(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field312 <= 0) {
                if (this.field309 == -256 && (this.field306 & 255) == 0) {
                    if (class36.field697) {
                        return method150(0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, 0, arg3, arg2, this);
                    }
                    return method142(((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, 0, arg3, arg2, this);
                }
                if (class36.field697) {
                    return method155(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, 0, arg3, arg2, this, this.field309, arg4);
                }
                return method161(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, 0, arg3, arg2, this, this.field309, arg4);
            }
            int var6 = this.field312 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field312 += arg1;
            if (this.field309 == -256 && (this.field306 & 255) == 0) {
                if (class36.field697) {
                    arg1 = method152(0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, this.field317, this.field316, 0, var6, arg2, this);
                } else {
                    arg1 = method134(((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, this.field319, 0, var6, arg2, this);
                }
            } else if (class36.field697) {
                arg1 = method170(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, this.field317, this.field316, 0, var6, arg2, this, this.field309, arg4);
            } else {
                arg1 = method139(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, this.field319, 0, var6, arg2, this, this.field309, arg4);
            }
            this.field312 -= arg1;
            if (this.field312 != 0) {
                return arg1;
            }
        } while (!this.method163());
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[B[IIIIIIIILbd;II)I")
    private static final int method139(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class15 arg11, int arg12, int arg13) {
        arg11.field314 -= arg11.field317 * arg5;
        arg11.field320 -= arg11.field316 * arg5;
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
        arg11.field314 += arg11.field317 * arg5;
        arg11.field320 += arg11.field316 * arg5;
        arg11.field310 = arg6;
        arg11.field306 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "()Z")
    public final boolean method140() {
        return this.field306 < 0 || this.field306 >= ((class104) super.field531).field2176.length << 8;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([B[IIIIIIIILbd;)I")
    private static final int method141(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class15 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field314 += (var14 - arg3) * arg9.field317;
        arg9.field320 += (var14 - arg3) * arg9.field316;
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
        arg9.field310 = var12 >> 2;
        arg9.field306 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([B[IIIIIIILbd;)I")
    private static final int method142(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class15 arg8) {
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
        arg8.field306 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II[B[IIIIIIIILbd;II)I")
    private static final int method143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class15 arg11, int arg12, int arg13) {
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
        arg11.field306 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public final synchronized void method144(int arg0) {
        if (this.field309 < 0) {
            this.field309 = -arg0;
        } else {
            this.field309 = arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[B[IIIIIIIIIILbd;II)I")
    private static final int method145(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class15 arg13, int arg14, int arg15) {
        arg13.field310 -= arg13.field319 * arg5;
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
        arg13.field310 += arg13.field319 * var22;
        arg13.field314 = arg6;
        arg13.field320 = arg7;
        arg13.field306 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "()V")
    private final void method146() {
        this.field310 = this.field318;
        this.field314 = method158(this.field318, this.field315);
        this.field320 = method165(this.field318, this.field315);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
    public final synchronized void method147(int arg0, int arg1) {
        this.method129(arg0, arg1, this.method160());
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lle;III)Lbd;")
    public static final class15 method148(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2176 != null && arg0.field2176.length != 0 ? new class15(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[B[IIIIIIILbd;II)I")
    private static final int method149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10, int arg11, int arg12) {
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
        arg10.field306 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B[IIIIIIIILbd;)I")
    private static final int method150(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10) {
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
        arg10.field306 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([III)V")
    public final synchronized void method151(int[] arg0, int arg1, int arg2) {
        if (this.field318 == 0 && this.field312 == 0) {
            this.method136(arg2);
        } else {
            class104 var4 = (class104) super.field531;
            int var5 = this.field307 << 8;
            int var6 = this.field313 << 8;
            int var7 = var4.field2176.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field308 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field306 < 0) {
                if (this.field309 <= 0) {
                    this.method156();
                    this.method885(3);
                    return;
                }
                this.field306 = 0;
            }
            if (this.field306 >= var7) {
                if (this.field309 >= 0) {
                    this.method156();
                    this.method885(3);
                    return;
                }
                this.field306 = var7 - 1;
            }
            if (this.field308 < 0) {
                if (this.field311) {
                    if (this.field309 < 0) {
                        var9 = this.method138(arg0, arg1, var5, var10, var4.field2176[this.field307]);
                        if (this.field306 >= var5) {
                            return;
                        }
                        this.field306 = var5 + var5 - 1 - this.field306;
                        this.field309 = -this.field309;
                    }
                    while (true) {
                        int var11 = this.method154(arg0, var9, var6, var10, var4.field2176[this.field313 - 1]);
                        if (this.field306 < var6) {
                            return;
                        }
                        this.field306 = var6 + var6 - 1 - this.field306;
                        this.field309 = -this.field309;
                        var9 = this.method138(arg0, var11, var5, var10, var4.field2176[this.field307]);
                        if (this.field306 >= var5) {
                            return;
                        }
                        this.field306 = var5 + var5 - 1 - this.field306;
                        this.field309 = -this.field309;
                    }
                } else if (this.field309 < 0) {
                    while (true) {
                        var9 = this.method138(arg0, var9, var5, var10, var4.field2176[this.field313 - 1]);
                        if (this.field306 >= var5) {
                            return;
                        }
                        this.field306 = var6 - 1 - (var6 - 1 - this.field306) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method154(arg0, var9, var6, var10, var4.field2176[this.field307]);
                        if (this.field306 < var6) {
                            return;
                        }
                        this.field306 = (this.field306 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field308 > 0) {
                    if (this.field311) {
                        label130: {
                            if (this.field309 < 0) {
                                var9 = this.method138(arg0, arg1, var5, var10, var4.field2176[this.field307]);
                                if (this.field306 >= var5) {
                                    return;
                                }
                                this.field306 = var5 + var5 - 1 - this.field306;
                                this.field309 = -this.field309;
                                if (--this.field308 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method154(arg0, var9, var6, var10, var4.field2176[this.field313 - 1]);
                                if (this.field306 < var6) {
                                    return;
                                }
                                this.field306 = var6 + var6 - 1 - this.field306;
                                this.field309 = -this.field309;
                                if (--this.field308 == 0) {
                                    break;
                                }
                                var9 = this.method138(arg0, var9, var5, var10, var4.field2176[this.field307]);
                                if (this.field306 >= var5) {
                                    return;
                                }
                                this.field306 = var5 + var5 - 1 - this.field306;
                                this.field309 = -this.field309;
                            } while (--this.field308 != 0);
                        }
                    } else if (this.field309 < 0) {
                        while (true) {
                            var9 = this.method138(arg0, var9, var5, var10, var4.field2176[this.field313 - 1]);
                            if (this.field306 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field306) / var8;
                            if (var12 >= this.field308) {
                                this.field306 += this.field308 * var8;
                                this.field308 = 0;
                                break;
                            }
                            this.field306 += var8 * var12;
                            this.field308 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method154(arg0, var9, var6, var10, var4.field2176[this.field307]);
                            if (this.field306 < var6) {
                                return;
                            }
                            int var13 = (this.field306 - var5) / var8;
                            if (var13 >= this.field308) {
                                this.field306 -= this.field308 * var8;
                                this.field308 = 0;
                                break;
                            }
                            this.field306 -= var8 * var13;
                            this.field308 -= var13;
                        }
                    }
                }
                if (this.field309 < 0) {
                    this.method138(arg0, var9, 0, var10, 0);
                    if (this.field306 < 0) {
                        this.field306 = -1;
                        this.method156();
                        this.method885(3);
                        return;
                    }
                } else {
                    this.method154(arg0, var9, var7, var10, 0);
                    if (this.field306 >= var7) {
                        this.field306 = var7;
                        this.method156();
                        this.method885(3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B[IIIIIIIIIILbd;)I")
    private static final int method152(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class15 arg12) {
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
        arg12.field310 += (var19 - arg4) * arg12.field319;
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
        arg12.field314 = var15 >> 2;
        arg12.field320 = var16 >> 2;
        arg12.field306 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()Lch;")
    public final class29 method153() {
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "([IIIII)I")
    private final int method154(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field312 <= 0) {
                if (this.field309 == 256 && (this.field306 & 255) == 0) {
                    if (class36.field697) {
                        return method169(0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, 0, arg3, arg2, this);
                    }
                    return method133(((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, 0, arg3, arg2, this);
                }
                if (class36.field697) {
                    return method143(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, 0, arg3, arg2, this, this.field309, arg4);
                }
                return method149(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, 0, arg3, arg2, this, this.field309, arg4);
            }
            int var6 = this.field312 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field312 += arg1;
            if (this.field309 == 256 && (this.field306 & 255) == 0) {
                if (class36.field697) {
                    arg1 = method171(0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, this.field317, this.field316, 0, var6, arg2, this);
                } else {
                    arg1 = method141(((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, this.field319, 0, var6, arg2, this);
                }
            } else if (class36.field697) {
                arg1 = method145(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field314, this.field320, this.field317, this.field316, 0, var6, arg2, this, this.field309, arg4);
            } else {
                arg1 = method157(0, 0, ((class104) super.field531).field2176, arg0, this.field306, arg1, this.field310, this.field319, 0, var6, arg2, this, this.field309, arg4);
            }
            this.field312 -= arg1;
            if (this.field312 != 0) {
                return arg1;
            }
        } while (!this.method163());
        return arg3;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(II[B[IIIIIIIILbd;II)I")
    private static final int method155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class15 arg11, int arg12, int arg13) {
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
        arg11.field306 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "()V")
    private final void method156() {
        if (this.field312 != 0) {
            if (this.field318 == Integer.MIN_VALUE) {
                this.field318 = 0;
            }
            this.field312 = 0;
            this.method146();
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(II[B[IIIIIIIILbd;II)I")
    private static final int method157(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class15 arg11, int arg12, int arg13) {
        arg11.field314 -= arg11.field317 * arg5;
        arg11.field320 -= arg11.field316 * arg5;
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
        arg11.field314 += arg11.field317 * arg5;
        arg11.field320 += arg11.field316 * arg5;
        arg11.field310 = arg6;
        arg11.field306 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(II)I")
    private static final int method158(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public final synchronized void method159(int arg0) {
        this.field308 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "()I")
    public final synchronized int method160() {
        return this.field315 < 0 ? -1 : this.field315;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II[B[IIIIIIILbd;II)I")
    private static final int method161(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10, int arg11, int arg12) {
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
        arg10.field306 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
    public final synchronized void method162(boolean arg0) {
        this.field309 = (this.field309 >>> 31) + (this.field309 ^ this.field309 >> 31);
        if (arg0) {
            this.field309 = -this.field309;
        }
    }

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "()Z")
    private final boolean method163() {
        int var1 = this.field318;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method158(var1, this.field315);
            var2 = method165(var1, this.field315);
        }
        if (this.field310 == var1 && this.field314 == var3 && this.field320 == var2) {
            if (this.field318 == Integer.MIN_VALUE) {
                this.field318 = 0;
                this.field310 = this.field314 = this.field320 = 0;
                this.method885(3);
                return true;
            } else {
                this.method146();
                return false;
            }
        } else {
            if (this.field310 < var1) {
                this.field319 = 1;
                this.field312 = var1 - this.field310;
            } else if (this.field310 > var1) {
                this.field319 = -1;
                this.field312 = this.field310 - var1;
            } else {
                this.field319 = 0;
            }
            if (this.field314 < var3) {
                this.field317 = 1;
                if (this.field312 == 0 || this.field312 > var3 - this.field314) {
                    this.field312 = var3 - this.field314;
                }
            } else if (this.field314 > var3) {
                this.field317 = -1;
                if (this.field312 == 0 || this.field312 > this.field314 - var3) {
                    this.field312 = this.field314 - var3;
                }
            } else {
                this.field317 = 0;
            }
            if (this.field320 < var2) {
                this.field316 = 1;
                if (this.field312 == 0 || this.field312 > var2 - this.field320) {
                    this.field312 = var2 - this.field320;
                }
            } else if (this.field320 > var2) {
                this.field316 = -1;
                if (this.field312 == 0 || this.field312 > this.field320 - var2) {
                    this.field312 = this.field320 - var2;
                }
            } else {
                this.field316 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    public final synchronized void method164(int arg0) {
        if (arg0 == 0) {
            this.method172(0);
            this.method885(3);
        } else if (this.field314 == 0 && this.field320 == 0) {
            this.field312 = 0;
            this.field318 = 0;
            this.field310 = 0;
            this.method885(3);
        } else {
            int var2 = -this.field310;
            if (this.field310 > var2) {
                var2 = this.field310;
            }
            if (-this.field314 > var2) {
                var2 = -this.field314;
            }
            if (this.field314 > var2) {
                var2 = this.field314;
            }
            if (-this.field320 > var2) {
                var2 = -this.field320;
            }
            if (this.field320 > var2) {
                var2 = this.field320;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field312 = arg0;
            this.field318 = Integer.MIN_VALUE;
            this.field319 = -this.field310 / arg0;
            this.field317 = -this.field314 / arg0;
            this.field316 = -this.field320 / arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(II)I")
    private static final int method165(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "()Z")
    public final boolean method166() {
        return this.field312 != 0;
    }

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V")
    public final synchronized void method167(int arg0) {
        int var2 = ((class104) super.field531).field2176.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field306 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method168() {
        int var1 = this.field310 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field308 == 0) {
            var2 -= this.field306 * var2 / (((class104) super.field531).field2176.length << 8);
        } else if (this.field308 >= 0) {
            var2 -= this.field307 * var2 / ((class104) super.field531).field2176.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I[B[IIIIIIIILbd;)I")
    private static final int method169(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class15 arg10) {
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
        arg10.field306 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II[B[IIIIIIIIIILbd;II)I")
    private static final int method170(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class15 arg13, int arg14, int arg15) {
        arg13.field310 -= arg13.field319 * arg5;
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
        arg13.field310 += arg13.field319 * var22;
        arg13.field314 = arg6;
        arg13.field320 = arg7;
        arg13.field306 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I[B[IIIIIIIIIILbd;)I")
    private static final int method171(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class15 arg12) {
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
        arg12.field310 += (var19 - arg4) * arg12.field319;
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
        arg12.field314 = var15 >> 2;
        arg12.field320 = var16 >> 2;
        arg12.field306 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V")
    private final synchronized void method172(int arg0) {
        this.method132(arg0, this.method160());
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lle;II)V")
    private class15(class104 arg0, int arg1, int arg2) {
        super.field531 = arg0;
        this.field307 = arg0.field2174;
        this.field313 = arg0.field2175;
        this.field311 = arg0.field2178;
        this.field309 = arg1;
        this.field318 = arg2;
        this.field315 = 8192;
        this.field306 = 0;
        this.method146();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lle;III)V")
    private class15(class104 arg0, int arg1, int arg2, int arg3) {
        super.field531 = arg0;
        this.field307 = arg0.field2174;
        this.field313 = arg0.field2175;
        this.field311 = arg0.field2178;
        this.field309 = arg1;
        this.field318 = arg2;
        this.field315 = arg3;
        this.field306 = 0;
        this.method146();
    }
}
