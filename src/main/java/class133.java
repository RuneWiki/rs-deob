import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class133 extends class219 {

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Z")
    private boolean field2327;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    private int field2323;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V", line = 4)
    public final synchronized void method909(int arg0) {
        int var2 = ((class268) this.field3860).field4576.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2321 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([IIIII)I", line = 17)
    private final int method910(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2328 > 0) {
                int var6 = this.field2328 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2328 += arg1;
                if (this.field2326 == -256 && (this.field2321 & 0xFF) == 0) {
                    if (class305.field5277) {
                        arg1 = method921(0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, this.field2315, this.field2320, 0, var6, arg2, this);
                    } else {
                        arg1 = method937(((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, this.field2324, 0, var6, arg2, this);
                    }
                } else if (class305.field5277) {
                    arg1 = method938(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, this.field2315, this.field2320, 0, var6, arg2, this, this.field2326, arg4);
                } else {
                    arg1 = method919(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, this.field2324, 0, var6, arg2, this, this.field2326, arg4);
                }
                this.field2328 -= arg1;
                if (this.field2328 != 0) {
                    return arg1;
                }
                if (!this.method943()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2326 == -256 && (this.field2321 & 0xFF) == 0) {
                if (class305.field5277) {
                    return method932(0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, 0, arg3, arg2, this);
                }
                return method911(((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, 0, arg3, arg2, this);
            }
            if (class305.field5277) {
                return method935(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, 0, arg3, arg2, this, this.field2326, arg4);
            }
            return method949(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, 0, arg3, arg2, this, this.field2326, arg4);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B[IIIIIIILbb;)I", line = 73)
    private static final int method911(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class133 arg8) {
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
        arg8.field2321 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 98)
    public final synchronized void method912(int arg0) {
        if (this.field2328 > 0) {
            if (arg0 >= this.field2328) {
                if (this.field2323 == Integer.MIN_VALUE) {
                    this.field2323 = 0;
                    this.field2322 = this.field2317 = this.field2314 = 0;
                    this.method1199(21966);
                    arg0 = this.field2328;
                }
                this.field2328 = 0;
                this.method927();
            } else {
                this.field2322 += this.field2324 * arg0;
                this.field2317 += this.field2315 * arg0;
                this.field2314 += this.field2320 * arg0;
                this.field2328 -= arg0;
            }
        }
        class268 var2 = (class268) this.field3860;
        int var3 = this.field2318 << 8;
        int var4 = this.field2316 << 8;
        int var5 = var2.field4576.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2325 = 0;
        }
        if (this.field2321 < 0) {
            if (this.field2326 <= 0) {
                this.method923();
                this.method1199(21966);
                return;
            }
            this.field2321 = 0;
        }
        if (this.field2321 >= var5) {
            if (this.field2326 >= 0) {
                this.method923();
                this.method1199(21966);
                return;
            }
            this.field2321 = var5 - 1;
        }
        this.field2321 += this.field2326 * arg0;
        if (this.field2325 >= 0) {
            if (this.field2325 > 0) {
                if (this.field2327) {
                    label121: {
                        if (this.field2326 < 0) {
                            if (this.field2321 >= var3) {
                                return;
                            }
                            this.field2321 = var3 + var3 - this.field2321 - 1;
                            this.field2326 = -this.field2326;
                            if (--this.field2325 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2321 < var4) {
                                return;
                            }
                            this.field2321 = var4 + var4 - this.field2321 - 1;
                            this.field2326 = -this.field2326;
                            if (--this.field2325 == 0) {
                                break;
                            }
                            if (this.field2321 >= var3) {
                                return;
                            }
                            this.field2321 = var3 + var3 - this.field2321 - 1;
                            this.field2326 = -this.field2326;
                        } while (--this.field2325 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2326 < 0) {
                            if (this.field2321 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2321 - 1) / var6;
                            if (var7 >= this.field2325) {
                                this.field2321 += this.field2325 * var6;
                                this.field2325 = 0;
                                break label153;
                            }
                            this.field2321 += var6 * var7;
                            this.field2325 -= var7;
                        } else if (this.field2321 >= var4) {
                            int var8 = (this.field2321 - var3) / var6;
                            if (var8 >= this.field2325) {
                                this.field2321 -= this.field2325 * var6;
                                this.field2325 = 0;
                                break label153;
                            }
                            this.field2321 -= var6 * var8;
                            this.field2325 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2326 < 0) {
                if (this.field2321 < 0) {
                    this.field2321 = -1;
                    this.method923();
                    this.method1199(21966);
                }
            } else if (this.field2321 >= var5) {
                this.field2321 = var5;
                this.method923();
                this.method1199(21966);
            }
        } else if (this.field2327) {
            if (this.field2326 < 0) {
                if (this.field2321 >= var3) {
                    return;
                }
                this.field2321 = var3 + var3 - this.field2321 - 1;
                this.field2326 = -this.field2326;
            }
            while (this.field2321 >= var4) {
                this.field2321 = var4 + var4 - this.field2321 - 1;
                this.field2326 = -this.field2326;
                if (this.field2321 >= var3) {
                    return;
                }
                this.field2321 = var3 + var3 - this.field2321 - 1;
                this.field2326 = -this.field2326;
            }
        } else if (this.field2326 < 0) {
            if (this.field2321 >= var3) {
                return;
            }
            this.field2321 = var4 - (var4 - 1 - this.field2321) % var6 - 1;
        } else if (this.field2321 >= var4) {
            this.field2321 = (this.field2321 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()Lfd;", line = 317)
    public final class219 method913() {
        return null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[B[IIIIIIIIIILbb;II)I", line = 320)
    private static final int method914(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class133 arg13, int arg14, int arg15) {
        arg13.field2322 -= arg13.field2324 * arg5;
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
        arg13.field2322 += arg13.field2324 * var27;
        arg13.field2317 = arg6;
        arg13.field2314 = arg7;
        arg13.field2321 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()I", line = 365)
    public final int method915() {
        return this.field2323 == 0 && this.field2328 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V", line = 371)
    public final synchronized void method916(int arg0) {
        if (this.field2326 < 0) {
            this.field2326 = -arg0;
        } else {
            this.field2326 = arg0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([B[IIIIIIILbb;)I", line = 378)
    private static final int method917(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class133 arg8) {
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
        arg8.field2321 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I", line = 405)
    public final int method918() {
        int var1 = this.field2322 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2325 == 0) {
            var2 -= this.field2321 * var2 / (((class268) this.field3860).field4576.length << 8);
        } else if (this.field2325 >= 0) {
            var2 -= this.field2318 * var2 / ((class268) this.field3860).field4576.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[B[IIIIIIIILbb;II)I", line = 417)
    private static final int method919(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class133 arg11, int arg12, int arg13) {
        arg11.field2317 -= arg11.field2315 * arg5;
        arg11.field2314 -= arg11.field2320 * arg5;
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
        arg11.field2317 += arg11.field2315 * arg5;
        arg11.field2314 += arg11.field2320 * arg5;
        arg11.field2322 = arg6;
        arg11.field2321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 450)
    public final synchronized void method920(int arg0) {
        if (arg0 == 0) {
            this.method922(0);
            this.method1199(21966);
        } else if (this.field2317 == 0 && this.field2314 == 0) {
            this.field2328 = 0;
            this.field2323 = 0;
            this.field2322 = 0;
            this.method1199(21966);
        } else {
            int var2 = -this.field2322;
            if (this.field2322 > var2) {
                var2 = this.field2322;
            }
            if (-this.field2317 > var2) {
                var2 = -this.field2317;
            }
            if (this.field2317 > var2) {
                var2 = this.field2317;
            }
            if (-this.field2314 > var2) {
                var2 = -this.field2314;
            }
            if (this.field2314 > var2) {
                var2 = this.field2314;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2328 = arg0;
            this.field2323 = Integer.MIN_VALUE;
            this.field2324 = -this.field2322 / arg0;
            this.field2315 = -this.field2317 / arg0;
            this.field2320 = -this.field2314 / arg0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B[IIIIIIIIIILbb;)I", line = 497)
    private static final int method921(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class133 arg12) {
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
        arg12.field2322 += (var19 - arg4) * arg12.field2324;
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
        arg12.field2317 = var15 >> 2;
        arg12.field2314 = var16 >> 2;
        arg12.field2321 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V", line = 551)
    private final synchronized void method922(int arg0) {
        this.method952(arg0, this.method924());
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V", line = 555)
    private final void method923() {
        if (this.field2328 == 0) {
            return;
        }
        if (this.field2323 == Integer.MIN_VALUE) {
            this.field2323 = 0;
        }
        this.field2328 = 0;
        this.method927();
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "()I", line = 566)
    public final synchronized int method924() {
        return this.field2319 < 0 ? -1 : this.field2319;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B[IIIIIIIILbb;)I", line = 572)
    private static final int method925(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class133 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2317 += (var14 - arg3) * arg9.field2315;
        arg9.field2314 += (var14 - arg3) * arg9.field2320;
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
        arg9.field2322 = var12 >> 2;
        arg9.field2321 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)V", line = 606)
    public final synchronized void method926(int arg0) {
        this.field2325 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "()V", line = 611)
    private final void method927() {
        this.field2322 = this.field2323;
        this.field2317 = method947(this.field2323, this.field2319);
        this.field2314 = method954(this.field2323, this.field2319);
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "()I", line = 617)
    public final synchronized int method928() {
        return this.field2323 == Integer.MIN_VALUE ? 0 : this.field2323;
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)V", line = 620)
    public final synchronized void method929(int arg0) {
        this.method952(arg0 << 6, this.method924());
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B[IIIIIIIILbb;)I", line = 626)
    private static final int method930(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class133 arg10) {
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
        arg10.field2321 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II[B[IIIIIIIILbb;II)I", line = 665)
    private static final int method931(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class133 arg11, int arg12, int arg13) {
        arg11.field2317 -= arg11.field2315 * arg5;
        arg11.field2314 -= arg11.field2320 * arg5;
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
        arg11.field2317 += arg11.field2315 * arg5;
        arg11.field2314 += arg11.field2320 * arg5;
        arg11.field2322 = arg6;
        arg11.field2321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I[B[IIIIIIIILbb;)I", line = 699)
    private static final int method932(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class133 arg10) {
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
        arg10.field2321 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 737)
    public final synchronized void method933(boolean arg0) {
        this.field2326 = (this.field2326 >>> 31) + (this.field2326 ^ this.field2326 >> 31);
        if (arg0) {
            this.field2326 = -this.field2326;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lfd;", line = 744)
    public final class219 method934() {
        return null;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II[B[IIIIIIIILbb;II)I", line = 748)
    private static final int method935(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class133 arg11, int arg12, int arg13) {
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
        arg11.field2321 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "()Z", line = 781)
    public final boolean method936() {
        return this.field2328 != 0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([B[IIIIIIIILbb;)I", line = 785)
    private static final int method937(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class133 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2317 += (var14 - arg3) * arg9.field2315;
        arg9.field2314 += (var14 - arg3) * arg9.field2320;
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
        arg9.field2322 = var12 >> 2;
        arg9.field2321 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II[B[IIIIIIIIIILbb;II)I", line = 819)
    private static final int method938(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class133 arg13, int arg14, int arg15) {
        arg13.field2322 -= arg13.field2324 * arg5;
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
        arg13.field2322 += arg13.field2324 * var26;
        arg13.field2317 = arg6;
        arg13.field2314 = arg7;
        arg13.field2321 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)V", line = 860)
    public final synchronized void method939(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method952(arg1, arg2);
            return;
        }
        int var4 = method947(arg1, arg2);
        int var5 = method954(arg1, arg2);
        if (this.field2317 == var4 && this.field2314 == var5) {
            this.field2328 = 0;
            return;
        }
        int var6 = arg1 - this.field2322;
        if (this.field2322 - arg1 > var6) {
            var6 = this.field2322 - arg1;
        }
        if (var4 - this.field2317 > var6) {
            var6 = var4 - this.field2317;
        }
        if (this.field2317 - var4 > var6) {
            var6 = this.field2317 - var4;
        }
        if (var5 - this.field2314 > var6) {
            var6 = var5 - this.field2314;
        }
        if (this.field2314 - var5 > var6) {
            var6 = this.field2314 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2328 = arg0;
        this.field2323 = arg1;
        this.field2319 = arg2;
        this.field2324 = (arg1 - this.field2322) / arg0;
        this.field2315 = (var4 - this.field2317) / arg0;
        this.field2320 = (var5 - this.field2314) / arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 906)
    public final synchronized void method940(int arg0, int arg1) {
        this.method939(arg0, arg1, this.method924());
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([III)V", line = 909)
    public final synchronized void method941(int[] arg0, int arg1, int arg2) {
        if (this.field2323 == 0 && this.field2328 == 0) {
            this.method912(arg2);
            return;
        }
        class268 var4 = (class268) this.field3860;
        int var5 = this.field2318 << 8;
        int var6 = this.field2316 << 8;
        int var7 = var4.field4576.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2325 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2321 < 0) {
            if (this.field2326 <= 0) {
                this.method923();
                this.method1199(21966);
                return;
            }
            this.field2321 = 0;
        }
        if (this.field2321 >= var7) {
            if (this.field2326 >= 0) {
                this.method923();
                this.method1199(21966);
                return;
            }
            this.field2321 = var7 - 1;
        }
        if (this.field2325 >= 0) {
            if (this.field2325 > 0) {
                if (this.field2327) {
                    label131: {
                        if (this.field2326 < 0) {
                            var9 = this.method910(arg0, arg1, var5, var10, var4.field4576[this.field2318]);
                            if (this.field2321 >= var5) {
                                return;
                            }
                            this.field2321 = var5 + var5 - this.field2321 - 1;
                            this.field2326 = -this.field2326;
                            if (--this.field2325 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method945(arg0, var9, var6, var10, var4.field4576[this.field2316 - 1]);
                            if (this.field2321 < var6) {
                                return;
                            }
                            this.field2321 = var6 + var6 - this.field2321 - 1;
                            this.field2326 = -this.field2326;
                            if (--this.field2325 == 0) {
                                break;
                            }
                            var9 = this.method910(arg0, var9, var5, var10, var4.field4576[this.field2318]);
                            if (this.field2321 >= var5) {
                                return;
                            }
                            this.field2321 = var5 + var5 - this.field2321 - 1;
                            this.field2326 = -this.field2326;
                        } while (--this.field2325 != 0);
                    }
                } else if (this.field2326 < 0) {
                    while (true) {
                        var9 = this.method910(arg0, var9, var5, var10, var4.field4576[this.field2316 - 1]);
                        if (this.field2321 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2321 - 1) / var8;
                        if (var12 >= this.field2325) {
                            this.field2321 += this.field2325 * var8;
                            this.field2325 = 0;
                            break;
                        }
                        this.field2321 += var8 * var12;
                        this.field2325 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method945(arg0, var9, var6, var10, var4.field4576[this.field2318]);
                        if (this.field2321 < var6) {
                            return;
                        }
                        int var13 = (this.field2321 - var5) / var8;
                        if (var13 >= this.field2325) {
                            this.field2321 -= this.field2325 * var8;
                            this.field2325 = 0;
                            break;
                        }
                        this.field2321 -= var8 * var13;
                        this.field2325 -= var13;
                    }
                }
            }
            if (this.field2326 < 0) {
                this.method910(arg0, var9, 0, var10, 0);
                if (this.field2321 < 0) {
                    this.field2321 = -1;
                    this.method923();
                    this.method1199(21966);
                }
            } else {
                this.method945(arg0, var9, var7, var10, 0);
                if (this.field2321 >= var7) {
                    this.field2321 = var7;
                    this.method923();
                    this.method1199(21966);
                }
            }
        } else if (this.field2327) {
            if (this.field2326 < 0) {
                var9 = this.method910(arg0, arg1, var5, var10, var4.field4576[this.field2318]);
                if (this.field2321 >= var5) {
                    return;
                }
                this.field2321 = var5 + var5 - this.field2321 - 1;
                this.field2326 = -this.field2326;
            }
            while (true) {
                int var11 = this.method945(arg0, var9, var6, var10, var4.field4576[this.field2316 - 1]);
                if (this.field2321 < var6) {
                    return;
                }
                this.field2321 = var6 + var6 - this.field2321 - 1;
                this.field2326 = -this.field2326;
                var9 = this.method910(arg0, var11, var5, var10, var4.field4576[this.field2318]);
                if (this.field2321 >= var5) {
                    return;
                }
                this.field2321 = var5 + var5 - this.field2321 - 1;
                this.field2326 = -this.field2326;
            }
        } else if (this.field2326 < 0) {
            while (true) {
                var9 = this.method910(arg0, var9, var5, var10, var4.field4576[this.field2316 - 1]);
                if (this.field2321 >= var5) {
                    return;
                }
                this.field2321 = var6 - (var6 - 1 - this.field2321) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method945(arg0, var9, var6, var10, var4.field4576[this.field2318]);
                if (this.field2321 < var6) {
                    return;
                }
                this.field2321 = (this.field2321 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "()I", line = 1147)
    public final synchronized int method942() {
        return this.field2326 < 0 ? -this.field2326 : this.field2326;
    }

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "()Z", line = 1151)
    private final boolean method943() {
        int var1 = this.field2323;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method947(var1, this.field2319);
            var2 = method954(var1, this.field2319);
        }
        if (this.field2322 != var1 || this.field2317 != var3 || this.field2314 != var2) {
            if (this.field2322 < var1) {
                this.field2324 = 1;
                this.field2328 = var1 - this.field2322;
            } else if (this.field2322 > var1) {
                this.field2324 = -1;
                this.field2328 = this.field2322 - var1;
            } else {
                this.field2324 = 0;
            }
            if (this.field2317 < var3) {
                this.field2315 = 1;
                if (this.field2328 == 0 || this.field2328 > var3 - this.field2317) {
                    this.field2328 = var3 - this.field2317;
                }
            } else if (this.field2317 > var3) {
                this.field2315 = -1;
                if (this.field2328 == 0 || this.field2328 > this.field2317 - var3) {
                    this.field2328 = this.field2317 - var3;
                }
            } else {
                this.field2315 = 0;
            }
            if (this.field2314 < var2) {
                this.field2320 = 1;
                if (this.field2328 == 0 || this.field2328 > var2 - this.field2314) {
                    this.field2328 = var2 - this.field2314;
                }
            } else if (this.field2314 > var2) {
                this.field2320 = -1;
                if (this.field2328 == 0 || this.field2328 > this.field2314 - var2) {
                    this.field2328 = this.field2314 - var2;
                }
            } else {
                this.field2320 = 0;
            }
            return false;
        } else if (this.field2323 == Integer.MIN_VALUE) {
            this.field2323 = 0;
            this.field2322 = this.field2317 = this.field2314 = 0;
            this.method1199(21966);
            return true;
        } else {
            this.method927();
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[B[IIIIIIILbb;II)I", line = 1237)
    private static final int method944(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class133 arg10, int arg11, int arg12) {
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
        arg10.field2321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([IIIII)I", line = 1263)
    private final int method945(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2328 > 0) {
                int var6 = this.field2328 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2328 += arg1;
                if (this.field2326 == 256 && (this.field2321 & 0xFF) == 0) {
                    if (class305.field5277) {
                        arg1 = method946(0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, this.field2315, this.field2320, 0, var6, arg2, this);
                    } else {
                        arg1 = method925(((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, this.field2324, 0, var6, arg2, this);
                    }
                } else if (class305.field5277) {
                    arg1 = method914(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, this.field2315, this.field2320, 0, var6, arg2, this, this.field2326, arg4);
                } else {
                    arg1 = method931(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, this.field2324, 0, var6, arg2, this, this.field2326, arg4);
                }
                this.field2328 -= arg1;
                if (this.field2328 != 0) {
                    return arg1;
                }
                if (!this.method943()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2326 == 256 && (this.field2321 & 0xFF) == 0) {
                if (class305.field5277) {
                    return method930(0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, 0, arg3, arg2, this);
                }
                return method917(((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, 0, arg3, arg2, this);
            }
            if (class305.field5277) {
                return method950(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2317, this.field2314, 0, arg3, arg2, this, this.field2326, arg4);
            }
            return method944(0, 0, ((class268) this.field3860).field4576, arg0, this.field2321, arg1, this.field2322, 0, arg3, arg2, this, this.field2326, arg4);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I[B[IIIIIIIIIILbb;)I", line = 1318)
    private static final int method946(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class133 arg12) {
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
        arg12.field2322 += (var19 - arg4) * arg12.field2324;
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
        arg12.field2317 = var15 >> 2;
        arg12.field2314 = var16 >> 2;
        arg12.field2321 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I", line = 1371)
    private static final int method947(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lof;III)Lbb;", line = 1375)
    public static final class133 method948(class268 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4576 == null || arg0.field4576.length == 0 ? null : new class133(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II[B[IIIIIIILbb;II)I", line = 1382)
    private static final int method949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class133 arg10, int arg11, int arg12) {
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
        arg10.field2321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II[B[IIIIIIIILbb;II)I", line = 1408)
    private static final int method950(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class133 arg11, int arg12, int arg13) {
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
        arg11.field2321 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lof;II)Lbb;", line = 1441)
    public static final class133 method951(class268 arg0, int arg1, int arg2) {
        return arg0.field4576 == null || arg0.field4576.length == 0 ? null : new class133(arg0, (int) ((long) arg0.field4577 * 256L * (long) arg1 / (long) (class175.field3109 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V", line = 1447)
    private final synchronized void method952(int arg0, int arg1) {
        this.field2323 = arg0;
        this.field2319 = arg1;
        this.field2328 = 0;
        this.method927();
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lof;II)V", line = 1452)
    private class133(class268 arg0, int arg1, int arg2) {
        this.field3860 = arg0;
        this.field2318 = arg0.field4578;
        this.field2316 = arg0.field4579;
        this.field2327 = arg0.field4575;
        this.field2326 = arg1;
        this.field2323 = arg2;
        this.field2319 = 8192;
        this.field2321 = 0;
        this.method927();
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lof;III)V", line = 1463)
    private class133(class268 arg0, int arg1, int arg2, int arg3) {
        this.field3860 = arg0;
        this.field2318 = arg0.field4578;
        this.field2316 = arg0.field4579;
        this.field2327 = arg0.field4575;
        this.field2326 = arg1;
        this.field2323 = arg2;
        this.field2319 = arg3;
        this.field2321 = 0;
        this.method927();
    }

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "()Z", line = 1475)
    public final boolean method953() {
        return this.field2321 < 0 || this.field2321 >= ((class268) this.field3860).field4576.length << 8;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)I", line = 1478)
    private static final int method954(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }
}
