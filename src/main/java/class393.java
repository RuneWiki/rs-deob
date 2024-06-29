import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class393 extends class86 {

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
    private boolean field5280;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    private int field5272;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    private int field5273;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    private int field5268;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    private int field5270;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    private int field5271;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    private int field5275;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    private int field5281;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([III)V", line = 3)
    public final synchronized void method693(int[] arg0, int arg1, int arg2) {
        if (this.field5273 == 0 && this.field5267 == 0) {
            this.method688(arg2);
        } else {
            class305 var4 = (class305) super.field1077;
            int var5 = this.field5274 << 8;
            int var6 = this.field5269 << 8;
            int var7 = var4.field3899.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5271 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5279 < 0) {
                if (this.field5272 <= 0) {
                    this.method2258();
                    this.method2165(16225);
                    return;
                }
                this.field5279 = 0;
            }
            if (this.field5279 >= var7) {
                if (this.field5272 >= 0) {
                    this.method2258();
                    this.method2165(16225);
                    return;
                }
                this.field5279 = var7 - 1;
            }
            if (this.field5271 < 0) {
                if (this.field5280) {
                    if (this.field5272 < 0) {
                        var9 = this.method2227(arg0, arg1, var5, var10, var4.field3899[this.field5274]);
                        if (this.field5279 >= var5) {
                            return;
                        }
                        this.field5279 = var5 + var5 - 1 - this.field5279;
                        this.field5272 = -this.field5272;
                    }
                    while (true) {
                        int var11 = this.method2243(arg0, var9, var6, var10, var4.field3899[this.field5269 - 1]);
                        if (this.field5279 < var6) {
                            return;
                        }
                        this.field5279 = var6 + var6 - 1 - this.field5279;
                        this.field5272 = -this.field5272;
                        var9 = this.method2227(arg0, var11, var5, var10, var4.field3899[this.field5274]);
                        if (this.field5279 >= var5) {
                            return;
                        }
                        this.field5279 = var5 + var5 - 1 - this.field5279;
                        this.field5272 = -this.field5272;
                    }
                } else if (this.field5272 < 0) {
                    while (true) {
                        var9 = this.method2227(arg0, var9, var5, var10, var4.field3899[this.field5269 - 1]);
                        if (this.field5279 >= var5) {
                            return;
                        }
                        this.field5279 = var6 - 1 - (var6 - 1 - this.field5279) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2243(arg0, var9, var6, var10, var4.field3899[this.field5274]);
                        if (this.field5279 < var6) {
                            return;
                        }
                        this.field5279 = (this.field5279 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5271 > 0) {
                    if (this.field5280) {
                        label130: {
                            if (this.field5272 < 0) {
                                var9 = this.method2227(arg0, arg1, var5, var10, var4.field3899[this.field5274]);
                                if (this.field5279 >= var5) {
                                    return;
                                }
                                this.field5279 = var5 + var5 - 1 - this.field5279;
                                this.field5272 = -this.field5272;
                                if (--this.field5271 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2243(arg0, var9, var6, var10, var4.field3899[this.field5269 - 1]);
                                if (this.field5279 < var6) {
                                    return;
                                }
                                this.field5279 = var6 + var6 - 1 - this.field5279;
                                this.field5272 = -this.field5272;
                                if (--this.field5271 == 0) {
                                    break;
                                }
                                var9 = this.method2227(arg0, var9, var5, var10, var4.field3899[this.field5274]);
                                if (this.field5279 >= var5) {
                                    return;
                                }
                                this.field5279 = var5 + var5 - 1 - this.field5279;
                                this.field5272 = -this.field5272;
                            } while (--this.field5271 != 0);
                        }
                    } else if (this.field5272 < 0) {
                        while (true) {
                            var9 = this.method2227(arg0, var9, var5, var10, var4.field3899[this.field5269 - 1]);
                            if (this.field5279 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5279) / var8;
                            if (var12 >= this.field5271) {
                                this.field5279 += this.field5271 * var8;
                                this.field5271 = 0;
                                break;
                            }
                            this.field5279 += var8 * var12;
                            this.field5271 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2243(arg0, var9, var6, var10, var4.field3899[this.field5274]);
                            if (this.field5279 < var6) {
                                return;
                            }
                            int var13 = (this.field5279 - var5) / var8;
                            if (var13 >= this.field5271) {
                                this.field5279 -= this.field5271 * var8;
                                this.field5271 = 0;
                                break;
                            }
                            this.field5279 -= var8 * var13;
                            this.field5271 -= var13;
                        }
                    }
                }
                if (this.field5272 < 0) {
                    this.method2227(arg0, var9, 0, var10, 0);
                    if (this.field5279 < 0) {
                        this.field5279 = -1;
                        this.method2258();
                        this.method2165(16225);
                        return;
                    }
                } else {
                    this.method2243(arg0, var9, var7, var10, 0);
                    if (this.field5279 >= var7) {
                        this.field5279 = var7;
                        this.method2258();
                        this.method2165(16225);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[B[IIIIIIIILsi;II)I", line = 238)
    private static final int method2224(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class393 arg11, int arg12, int arg13) {
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
        arg11.field5279 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()I", line = 271)
    public final int method690() {
        int var1 = this.field5278 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5271 == 0) {
            var2 -= this.field5279 * var2 / (((class305) super.field1077).field3899.length << 8);
        } else if (this.field5271 >= 0) {
            var2 -= this.field5274 * var2 / ((class305) super.field1077).field3899.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "()Z", line = 284)
    private final boolean method2225() {
        int var1 = this.field5273;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2233(var1, this.field5277);
            var2 = method2242(var1, this.field5277);
        }
        if (this.field5278 == var1 && this.field5276 == var3 && this.field5270 == var2) {
            if (this.field5273 == Integer.MIN_VALUE) {
                this.field5273 = 0;
                this.field5278 = this.field5276 = this.field5270 = 0;
                this.method2165(16225);
                return true;
            } else {
                this.method2252();
                return false;
            }
        } else {
            if (this.field5278 < var1) {
                this.field5275 = 1;
                this.field5267 = var1 - this.field5278;
            } else if (this.field5278 > var1) {
                this.field5275 = -1;
                this.field5267 = this.field5278 - var1;
            } else {
                this.field5275 = 0;
            }
            if (this.field5276 < var3) {
                this.field5268 = 1;
                if (this.field5267 == 0 || this.field5267 > var3 - this.field5276) {
                    this.field5267 = var3 - this.field5276;
                }
            } else if (this.field5276 > var3) {
                this.field5268 = -1;
                if (this.field5267 == 0 || this.field5267 > this.field5276 - var3) {
                    this.field5267 = this.field5276 - var3;
                }
            } else {
                this.field5268 = 0;
            }
            if (this.field5270 < var2) {
                this.field5281 = 1;
                if (this.field5267 == 0 || this.field5267 > var2 - this.field5270) {
                    this.field5267 = var2 - this.field5270;
                }
            } else if (this.field5270 > var2) {
                this.field5281 = -1;
                if (this.field5267 == 0 || this.field5267 > this.field5270 - var2) {
                    this.field5267 = this.field5270 - var2;
                }
            } else {
                this.field5281 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[B[IIIIIIIIIILsi;II)I", line = 369)
    private static final int method2226(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class393 arg13, int arg14, int arg15) {
        arg13.field5278 -= arg13.field5275 * arg5;
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
        arg13.field5278 += arg13.field5275 * var22;
        arg13.field5276 = arg6;
        arg13.field5270 = arg7;
        arg13.field5279 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()I", line = 413)
    public final int method691() {
        return this.field5273 == 0 && this.field5267 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([IIIII)I", line = 420)
    private final int method2227(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5267 <= 0) {
                if (this.field5272 == -256 && (this.field5279 & 255) == 0) {
                    if (class8.field72) {
                        return method2234(0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, 0, arg3, arg2, this);
                    }
                    return method2249(((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, 0, arg3, arg2, this);
                }
                if (class8.field72) {
                    return method2224(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, 0, arg3, arg2, this, this.field5272, arg4);
                }
                return method2237(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, 0, arg3, arg2, this, this.field5272, arg4);
            }
            int var6 = this.field5267 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5267 += arg1;
            if (this.field5272 == -256 && (this.field5279 & 255) == 0) {
                if (class8.field72) {
                    arg1 = method2254(0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, this.field5268, this.field5281, 0, var6, arg2, this);
                } else {
                    arg1 = method2256(((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, this.field5275, 0, var6, arg2, this);
                }
            } else if (class8.field72) {
                arg1 = method2255(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, this.field5268, this.field5281, 0, var6, arg2, this, this.field5272, arg4);
            } else {
                arg1 = method2261(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, this.field5275, 0, var6, arg2, this, this.field5272, arg4);
            }
            this.field5267 -= arg1;
            if (this.field5267 != 0) {
                return arg1;
            }
        } while (!this.method2225());
        return arg3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([B[IIIIIIIILsi;)I", line = 477)
    private static final int method2228(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class393 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5276 += (var14 - arg3) * arg9.field5268;
        arg9.field5270 += (var14 - arg3) * arg9.field5281;
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
        arg9.field5278 = var12 >> 2;
        arg9.field5279 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[B[IIIIIIIILsi;)I", line = 511)
    private static final int method2229(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class393 arg10) {
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
        arg10.field5279 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V", line = 550)
    public final synchronized void method2230(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2240(arg1, arg2);
        } else {
            int var4 = method2233(arg1, arg2);
            int var5 = method2242(arg1, arg2);
            if (this.field5276 == var4 && this.field5270 == var5) {
                this.field5267 = 0;
            } else {
                int var6 = arg1 - this.field5278;
                if (this.field5278 - arg1 > var6) {
                    var6 = this.field5278 - arg1;
                }
                if (var4 - this.field5276 > var6) {
                    var6 = var4 - this.field5276;
                }
                if (this.field5276 - var4 > var6) {
                    var6 = this.field5276 - var4;
                }
                if (var5 - this.field5270 > var6) {
                    var6 = var5 - this.field5270;
                }
                if (this.field5270 - var5 > var6) {
                    var6 = this.field5270 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5267 = arg0;
                this.field5273 = arg1;
                this.field5277 = arg2;
                this.field5275 = (arg1 - this.field5278) / arg0;
                this.field5268 = (var4 - this.field5276) / arg0;
                this.field5281 = (var5 - this.field5270) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V", line = 597)
    public final synchronized void method2231(int arg0) {
        if (this.field5272 < 0) {
            this.field5272 = -arg0;
        } else {
            this.field5272 = arg0;
        }
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "()I", line = 605)
    public final synchronized int method2232() {
        return this.field5273 == Integer.MIN_VALUE ? 0 : this.field5273;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "()Lhu;", line = 608)
    public final class86 method692() {
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I", line = 611)
    private static final int method2233(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I[B[IIIIIIIILsi;)I", line = 614)
    private static final int method2234(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class393 arg10) {
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
        arg10.field5279 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V", line = 653)
    public final synchronized void method2235(int arg0) {
        int var2 = ((class305) super.field1077).field3899.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5279 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "()I", line = 665)
    public final synchronized int method2236() {
        return this.field5272 < 0 ? -this.field5272 : this.field5272;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II[B[IIIIIIILsi;II)I", line = 668)
    private static final int method2237(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class393 arg10, int arg11, int arg12) {
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
        arg10.field5279 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II[B[IIIIIIIILsi;II)I", line = 694)
    private static final int method2238(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class393 arg11, int arg12, int arg13) {
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
        arg11.field5279 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V", line = 727)
    public final synchronized void method2239(int arg0) {
        if (arg0 == 0) {
            this.method2260(0);
            this.method2165(16225);
        } else if (this.field5276 == 0 && this.field5270 == 0) {
            this.field5267 = 0;
            this.field5273 = 0;
            this.field5278 = 0;
            this.method2165(16225);
        } else {
            int var2 = -this.field5278;
            if (this.field5278 > var2) {
                var2 = this.field5278;
            }
            if (-this.field5276 > var2) {
                var2 = -this.field5276;
            }
            if (this.field5276 > var2) {
                var2 = this.field5276;
            }
            if (-this.field5270 > var2) {
                var2 = -this.field5270;
            }
            if (this.field5270 > var2) {
                var2 = this.field5270;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5267 = arg0;
            this.field5273 = Integer.MIN_VALUE;
            this.field5275 = -this.field5278 / arg0;
            this.field5268 = -this.field5276 / arg0;
            this.field5281 = -this.field5270 / arg0;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V", line = 776)
    private final synchronized void method2240(int arg0, int arg1) {
        this.field5273 = arg0;
        this.field5277 = arg1;
        this.field5267 = 0;
        this.method2252();
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II[B[IIIIIIILsi;II)I", line = 782)
    private static final int method2241(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class393 arg10, int arg11, int arg12) {
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
        arg10.field5279 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)I", line = 809)
    private static final int method2242(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()Lhu;", line = 812)
    public final class86 method689() {
        return null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "([IIIII)I", line = 816)
    private final int method2243(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5267 <= 0) {
                if (this.field5272 == 256 && (this.field5279 & 255) == 0) {
                    if (class8.field72) {
                        return method2229(0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, 0, arg3, arg2, this);
                    }
                    return method2259(((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, 0, arg3, arg2, this);
                }
                if (class8.field72) {
                    return method2238(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, 0, arg3, arg2, this, this.field5272, arg4);
                }
                return method2241(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, 0, arg3, arg2, this, this.field5272, arg4);
            }
            int var6 = this.field5267 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5267 += arg1;
            if (this.field5272 == 256 && (this.field5279 & 255) == 0) {
                if (class8.field72) {
                    arg1 = method2263(0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, this.field5268, this.field5281, 0, var6, arg2, this);
                } else {
                    arg1 = method2228(((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, this.field5275, 0, var6, arg2, this);
                }
            } else if (class8.field72) {
                arg1 = method2226(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5276, this.field5270, this.field5268, this.field5281, 0, var6, arg2, this, this.field5272, arg4);
            } else {
                arg1 = method2250(0, 0, ((class305) super.field1077).field3899, arg0, this.field5279, arg1, this.field5278, this.field5275, 0, var6, arg2, this, this.field5272, arg4);
            }
            this.field5267 -= arg1;
            if (this.field5267 != 0) {
                return arg1;
            }
        } while (!this.method2225());
        return arg3;
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "()Z", line = 872)
    public final boolean method2244() {
        return this.field5279 < 0 || this.field5279 >= ((class305) super.field1077).field3899.length << 8;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljc;III)Lsi;", line = 875)
    public static final class393 method2245(class305 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3899 != null && arg0.field3899.length != 0 ? new class393(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V", line = 881)
    public final synchronized void method2246(int arg0) {
        this.field5271 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V", line = 885)
    public final synchronized void method2247(boolean arg0) {
        this.field5272 = (this.field5272 >>> 31) + (this.field5272 ^ this.field5272 >> 31);
        if (arg0) {
            this.field5272 = -this.field5272;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljc;II)Lsi;", line = 891)
    public static final class393 method2248(class305 arg0, int arg1, int arg2) {
        return arg0.field3899 != null && arg0.field3899.length != 0 ? new class393(arg0, (int) ((long) arg0.field3901 * 256L * (long) arg1 / (long) (class94.field1140 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([B[IIIIIIILsi;)I", line = 898)
    private static final int method2249(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class393 arg8) {
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
        arg8.field5279 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II[B[IIIIIIIILsi;II)I", line = 929)
    private static final int method2250(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class393 arg11, int arg12, int arg13) {
        arg11.field5276 -= arg11.field5268 * arg5;
        arg11.field5270 -= arg11.field5281 * arg5;
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
        arg11.field5276 += arg11.field5268 * arg5;
        arg11.field5270 += arg11.field5281 * arg5;
        arg11.field5278 = arg6;
        arg11.field5279 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(II)V", line = 963)
    public final synchronized void method2251(int arg0, int arg1) {
        this.method2230(arg0, arg1, this.method2262());
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "()V", line = 966)
    private final void method2252() {
        this.field5278 = this.field5273;
        this.field5276 = method2233(this.field5273, this.field5277);
        this.field5270 = method2242(this.field5273, this.field5277);
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V", line = 971)
    public final synchronized void method2253(int arg0) {
        this.method2240(arg0 << 6, this.method2262());
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[B[IIIIIIIIIILsi;)I", line = 974)
    private static final int method2254(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class393 arg12) {
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
        arg12.field5278 += (var19 - arg4) * arg12.field5275;
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
        arg12.field5276 = var15 >> 2;
        arg12.field5270 = var16 >> 2;
        arg12.field5279 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II[B[IIIIIIIIIILsi;II)I", line = 1028)
    private static final int method2255(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class393 arg13, int arg14, int arg15) {
        arg13.field5278 -= arg13.field5275 * arg5;
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
        arg13.field5278 += arg13.field5275 * var22;
        arg13.field5276 = arg6;
        arg13.field5270 = arg7;
        arg13.field5279 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "([B[IIIIIIIILsi;)I", line = 1073)
    private static final int method2256(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class393 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5276 += (var14 - arg3) * arg9.field5268;
        arg9.field5270 += (var14 - arg3) * arg9.field5281;
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
        arg9.field5278 = var12 >> 2;
        arg9.field5279 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!si", name = "j", descriptor = "()Z", line = 1108)
    public final boolean method2257() {
        return this.field5267 != 0;
    }

    @OriginalMember(owner = "client!si", name = "k", descriptor = "()V", line = 1111)
    private final void method2258() {
        if (this.field5267 != 0) {
            if (this.field5273 == Integer.MIN_VALUE) {
                this.field5273 = 0;
            }
            this.field5267 = 0;
            this.method2252();
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "([B[IIIIIIILsi;)I", line = 1122)
    private static final int method2259(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class393 arg8) {
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
        arg8.field5279 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!si", name = "j", descriptor = "(I)V", line = 1147)
    private final synchronized void method2260(int arg0) {
        this.method2240(arg0, this.method2262());
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(II[B[IIIIIIIILsi;II)I", line = 1150)
    private static final int method2261(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class393 arg11, int arg12, int arg13) {
        arg11.field5276 -= arg11.field5268 * arg5;
        arg11.field5270 -= arg11.field5281 * arg5;
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
        arg11.field5276 += arg11.field5268 * arg5;
        arg11.field5270 += arg11.field5281 * arg5;
        arg11.field5278 = arg6;
        arg11.field5279 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 1185)
    public final synchronized void method688(int arg0) {
        if (this.field5267 > 0) {
            if (arg0 >= this.field5267) {
                if (this.field5273 == Integer.MIN_VALUE) {
                    this.field5273 = 0;
                    this.field5278 = this.field5276 = this.field5270 = 0;
                    this.method2165(16225);
                    arg0 = this.field5267;
                }
                this.field5267 = 0;
                this.method2252();
            } else {
                this.field5278 += this.field5275 * arg0;
                this.field5276 += this.field5268 * arg0;
                this.field5270 += this.field5281 * arg0;
                this.field5267 -= arg0;
            }
        }
        class305 var2 = (class305) super.field1077;
        int var3 = this.field5274 << 8;
        int var4 = this.field5269 << 8;
        int var5 = var2.field3899.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5271 = 0;
        }
        if (this.field5279 < 0) {
            if (this.field5272 <= 0) {
                this.method2258();
                this.method2165(16225);
                return;
            }
            this.field5279 = 0;
        }
        if (this.field5279 >= var5) {
            if (this.field5272 >= 0) {
                this.method2258();
                this.method2165(16225);
                return;
            }
            this.field5279 = var5 - 1;
        }
        this.field5279 += this.field5272 * arg0;
        if (this.field5271 < 0) {
            if (!this.field5280) {
                if (this.field5272 < 0) {
                    if (this.field5279 < var3) {
                        this.field5279 = var4 - 1 - (var4 - 1 - this.field5279) % var6;
                    }
                } else if (this.field5279 >= var4) {
                    this.field5279 = (this.field5279 - var3) % var6 + var3;
                }
            } else {
                if (this.field5272 < 0) {
                    if (this.field5279 >= var3) {
                        return;
                    }
                    this.field5279 = var3 + var3 - 1 - this.field5279;
                    this.field5272 = -this.field5272;
                }
                while (this.field5279 >= var4) {
                    this.field5279 = var4 + var4 - 1 - this.field5279;
                    this.field5272 = -this.field5272;
                    if (this.field5279 >= var3) {
                        return;
                    }
                    this.field5279 = var3 + var3 - 1 - this.field5279;
                    this.field5272 = -this.field5272;
                }
            }
        } else {
            if (this.field5271 > 0) {
                if (this.field5280) {
                    label125: {
                        if (this.field5272 < 0) {
                            if (this.field5279 >= var3) {
                                return;
                            }
                            this.field5279 = var3 + var3 - 1 - this.field5279;
                            this.field5272 = -this.field5272;
                            if (--this.field5271 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5279 < var4) {
                                return;
                            }
                            this.field5279 = var4 + var4 - 1 - this.field5279;
                            this.field5272 = -this.field5272;
                            if (--this.field5271 == 0) {
                                break;
                            }
                            if (this.field5279 >= var3) {
                                return;
                            }
                            this.field5279 = var3 + var3 - 1 - this.field5279;
                            this.field5272 = -this.field5272;
                        } while (--this.field5271 != 0);
                    }
                } else if (this.field5272 < 0) {
                    if (this.field5279 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5279) / var6;
                    if (var7 < this.field5271) {
                        this.field5279 += var6 * var7;
                        this.field5271 -= var7;
                        return;
                    }
                    this.field5279 += this.field5271 * var6;
                    this.field5271 = 0;
                } else {
                    if (this.field5279 < var4) {
                        return;
                    }
                    int var8 = (this.field5279 - var3) / var6;
                    if (var8 < this.field5271) {
                        this.field5279 -= var6 * var8;
                        this.field5271 -= var8;
                        return;
                    }
                    this.field5279 -= this.field5271 * var6;
                    this.field5271 = 0;
                }
            }
            if (this.field5272 < 0) {
                if (this.field5279 < 0) {
                    this.field5279 = -1;
                    this.method2258();
                    this.method2165(16225);
                    return;
                }
            } else if (this.field5279 >= var5) {
                this.field5279 = var5;
                this.method2258();
                this.method2165(16225);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "l", descriptor = "()I", line = 1403)
    public final synchronized int method2262() {
        return this.field5277 < 0 ? -1 : this.field5277;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I[B[IIIIIIIIIILsi;)I", line = 1406)
    private static final int method2263(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class393 arg12) {
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
        arg12.field5278 += (var19 - arg4) * arg12.field5275;
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
        arg12.field5276 = var15 >> 2;
        arg12.field5270 = var16 >> 2;
        arg12.field5279 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljc;II)V", line = 1458)
    private class393(class305 arg0, int arg1, int arg2) {
        super.field1077 = arg0;
        this.field5274 = arg0.field3898;
        this.field5269 = arg0.field3900;
        this.field5280 = arg0.field3902;
        this.field5272 = arg1;
        this.field5273 = arg2;
        this.field5277 = 8192;
        this.field5279 = 0;
        this.method2252();
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljc;III)V", line = 1469)
    private class393(class305 arg0, int arg1, int arg2, int arg3) {
        super.field1077 = arg0;
        this.field5274 = arg0.field3898;
        this.field5269 = arg0.field3900;
        this.field5280 = arg0.field3902;
        this.field5272 = arg1;
        this.field5273 = arg2;
        this.field5277 = arg3;
        this.field5279 = 0;
        this.method2252();
    }
}
