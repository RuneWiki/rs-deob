import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class379 extends class629 {

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field5428;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field5420;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Z")
    private boolean field5431;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field5432;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    private int field5427;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    private int field5429;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    private int field5419;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    private int field5421;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field5422;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    private int field5423;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    private int field5424;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    private int field5425;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    private int field5426;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field5430;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([IIIII)I", line = 3)
    private final int method2377(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5423 <= 0) {
                if (this.field5432 == 256 && (this.field5433 & 255) == 0) {
                    if (class673.field9127) {
                        return method2404(0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, 0, arg3, arg2, this);
                    }
                    return method2398(((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, 0, arg3, arg2, this);
                }
                if (class673.field9127) {
                    return method2408(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, 0, arg3, arg2, this, this.field5432, arg4);
                }
                return method2393(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, 0, arg3, arg2, this, this.field5432, arg4);
            }
            int var6 = this.field5423 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5423 += arg1;
            if (this.field5432 == 256 && (this.field5433 & 255) == 0) {
                if (class673.field9127) {
                    arg1 = method2390(0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, this.field5430, this.field5419, 0, var6, arg2, this);
                } else {
                    arg1 = method2409(((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, this.field5421, 0, var6, arg2, this);
                }
            } else if (class673.field9127) {
                arg1 = method2381(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, this.field5430, this.field5419, 0, var6, arg2, this, this.field5432, arg4);
            } else {
                arg1 = method2405(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, this.field5421, 0, var6, arg2, this, this.field5432, arg4);
            }
            this.field5423 -= arg1;
            if (this.field5423 != 0) {
                return arg1;
            }
        } while (!this.method2382());
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "()Z", line = 60)
    public final boolean method2378() {
        return this.field5423 != 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 64)
    public final synchronized void method2379(int arg0) {
        int var2 = ((class490) super.field8718).field6918.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5433 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()I", line = 74)
    public final int method1382() {
        return this.field5427 == 0 && this.field5423 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)V", line = 80)
    public final synchronized void method2380(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2416(arg1, arg2);
        } else {
            int var4 = method2400(arg1, arg2);
            int var5 = method2386(arg1, arg2);
            if (this.field5424 == var4 && this.field5425 == var5) {
                this.field5423 = 0;
            } else {
                int var6 = arg1 - this.field5422;
                if (this.field5422 - arg1 > var6) {
                    var6 = this.field5422 - arg1;
                }
                if (var4 - this.field5424 > var6) {
                    var6 = var4 - this.field5424;
                }
                if (this.field5424 - var4 > var6) {
                    var6 = this.field5424 - var4;
                }
                if (var5 - this.field5425 > var6) {
                    var6 = var5 - this.field5425;
                }
                if (this.field5425 - var5 > var6) {
                    var6 = this.field5425 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5423 = arg0;
                this.field5427 = arg1;
                this.field5429 = arg2;
                this.field5421 = (arg1 - this.field5422) / arg0;
                this.field5430 = (var4 - this.field5424) / arg0;
                this.field5419 = (var5 - this.field5425) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)V", line = 130)
    public final synchronized void method1378(int[] arg0, int arg1, int arg2) {
        if (this.field5427 == 0 && this.field5423 == 0) {
            this.method1401(arg2);
        } else {
            class490 var4 = (class490) super.field8718;
            int var5 = this.field5428 << 8;
            int var6 = this.field5420 << 8;
            int var7 = var4.field6918.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5426 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5433 < 0) {
                if (this.field5432 <= 0) {
                    this.method2384();
                    this.method1185(-99);
                    return;
                }
                this.field5433 = 0;
            }
            if (this.field5433 >= var7) {
                if (this.field5432 >= 0) {
                    this.method2384();
                    this.method1185(-61);
                    return;
                }
                this.field5433 = var7 - 1;
            }
            if (this.field5426 < 0) {
                if (this.field5431) {
                    if (this.field5432 < 0) {
                        var9 = this.method2414(arg0, arg1, var5, var10, var4.field6918[this.field5428]);
                        if (this.field5433 >= var5) {
                            return;
                        }
                        this.field5433 = var5 + var5 - 1 - this.field5433;
                        this.field5432 = -this.field5432;
                    }
                    while (true) {
                        int var11 = this.method2377(arg0, var9, var6, var10, var4.field6918[this.field5420 - 1]);
                        if (this.field5433 < var6) {
                            return;
                        }
                        this.field5433 = var6 + var6 - 1 - this.field5433;
                        this.field5432 = -this.field5432;
                        var9 = this.method2414(arg0, var11, var5, var10, var4.field6918[this.field5428]);
                        if (this.field5433 >= var5) {
                            return;
                        }
                        this.field5433 = var5 + var5 - 1 - this.field5433;
                        this.field5432 = -this.field5432;
                    }
                } else if (this.field5432 < 0) {
                    while (true) {
                        var9 = this.method2414(arg0, var9, var5, var10, var4.field6918[this.field5420 - 1]);
                        if (this.field5433 >= var5) {
                            return;
                        }
                        this.field5433 = var6 - 1 - (var6 - 1 - this.field5433) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2377(arg0, var9, var6, var10, var4.field6918[this.field5428]);
                        if (this.field5433 < var6) {
                            return;
                        }
                        this.field5433 = (this.field5433 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5426 > 0) {
                    if (this.field5431) {
                        label130: {
                            if (this.field5432 < 0) {
                                var9 = this.method2414(arg0, arg1, var5, var10, var4.field6918[this.field5428]);
                                if (this.field5433 >= var5) {
                                    return;
                                }
                                this.field5433 = var5 + var5 - 1 - this.field5433;
                                this.field5432 = -this.field5432;
                                if (--this.field5426 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2377(arg0, var9, var6, var10, var4.field6918[this.field5420 - 1]);
                                if (this.field5433 < var6) {
                                    return;
                                }
                                this.field5433 = var6 + var6 - 1 - this.field5433;
                                this.field5432 = -this.field5432;
                                if (--this.field5426 == 0) {
                                    break;
                                }
                                var9 = this.method2414(arg0, var9, var5, var10, var4.field6918[this.field5428]);
                                if (this.field5433 >= var5) {
                                    return;
                                }
                                this.field5433 = var5 + var5 - 1 - this.field5433;
                                this.field5432 = -this.field5432;
                            } while (--this.field5426 != 0);
                        }
                    } else if (this.field5432 < 0) {
                        while (true) {
                            var9 = this.method2414(arg0, var9, var5, var10, var4.field6918[this.field5420 - 1]);
                            if (this.field5433 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5433) / var8;
                            if (var12 >= this.field5426) {
                                this.field5433 += this.field5426 * var8;
                                this.field5426 = 0;
                                break;
                            }
                            this.field5433 += var8 * var12;
                            this.field5426 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2377(arg0, var9, var6, var10, var4.field6918[this.field5428]);
                            if (this.field5433 < var6) {
                                return;
                            }
                            int var13 = (this.field5433 - var5) / var8;
                            if (var13 >= this.field5426) {
                                this.field5433 -= this.field5426 * var8;
                                this.field5426 = 0;
                                break;
                            }
                            this.field5433 -= var8 * var13;
                            this.field5426 -= var13;
                        }
                    }
                }
                if (this.field5432 < 0) {
                    this.method2414(arg0, var9, 0, var10, 0);
                    if (this.field5433 < 0) {
                        this.field5433 = -1;
                        this.method2384();
                        this.method1185(-61);
                        return;
                    }
                } else {
                    this.method2377(arg0, var9, var7, var10, 0);
                    if (this.field5433 >= var7) {
                        this.field5433 = var7;
                        this.method2384();
                        this.method1185(-72);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[B[IIIIIIIIIILoj;II)I", line = 365)
    private static final int method2381(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class379 arg13, int arg14, int arg15) {
        arg13.field5422 -= arg13.field5421 * arg5;
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
        arg13.field5422 += arg13.field5421 * var22;
        arg13.field5424 = arg6;
        arg13.field5425 = arg7;
        arg13.field5433 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()Lpda;", line = 411)
    public final class629 method1400() {
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "()Z", line = 415)
    private final boolean method2382() {
        int var1 = this.field5427;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2400(var1, this.field5429);
            var2 = method2386(var1, this.field5429);
        }
        if (this.field5422 == var1 && this.field5424 == var3 && this.field5425 == var2) {
            if (this.field5427 == Integer.MIN_VALUE) {
                this.field5427 = 0;
                this.field5422 = this.field5424 = this.field5425 = 0;
                this.method1185(-74);
                return true;
            } else {
                this.method2387();
                return false;
            }
        } else {
            if (this.field5422 < var1) {
                this.field5421 = 1;
                this.field5423 = var1 - this.field5422;
            } else if (this.field5422 > var1) {
                this.field5421 = -1;
                this.field5423 = this.field5422 - var1;
            } else {
                this.field5421 = 0;
            }
            if (this.field5424 < var3) {
                this.field5430 = 1;
                if (this.field5423 == 0 || this.field5423 > var3 - this.field5424) {
                    this.field5423 = var3 - this.field5424;
                }
            } else if (this.field5424 > var3) {
                this.field5430 = -1;
                if (this.field5423 == 0 || this.field5423 > this.field5424 - var3) {
                    this.field5423 = this.field5424 - var3;
                }
            } else {
                this.field5430 = 0;
            }
            if (this.field5425 < var2) {
                this.field5419 = 1;
                if (this.field5423 == 0 || this.field5423 > var2 - this.field5425) {
                    this.field5423 = var2 - this.field5425;
                }
            } else if (this.field5425 > var2) {
                this.field5419 = -1;
                if (this.field5423 == 0 || this.field5423 > this.field5425 - var2) {
                    this.field5423 = this.field5425 - var2;
                }
            } else {
                this.field5419 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 500)
    public final synchronized void method2383(int arg0) {
        this.field5426 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "()V", line = 503)
    private final void method2384() {
        if (this.field5423 != 0) {
            if (this.field5427 == Integer.MIN_VALUE) {
                this.field5427 = 0;
            }
            this.field5423 = 0;
            this.method2387();
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B[IIIIIIIIIILoj;)I", line = 514)
    private static final int method2385(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class379 arg12) {
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
        arg12.field5422 += (var19 - arg4) * arg12.field5421;
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
        arg12.field5424 = var15 >> 2;
        arg12.field5425 = var16 >> 2;
        arg12.field5433 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I", line = 571)
    private static final int method2386(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "()V", line = 575)
    private final void method2387() {
        this.field5422 = this.field5427;
        this.field5424 = method2400(this.field5427, this.field5429);
        this.field5425 = method2386(this.field5427, this.field5429);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V", line = 580)
    public final synchronized void method2388(int arg0) {
        if (arg0 == 0) {
            this.method2403(0);
            this.method1185(-117);
        } else if (this.field5424 == 0 && this.field5425 == 0) {
            this.field5423 = 0;
            this.field5427 = 0;
            this.field5422 = 0;
            this.method1185(-83);
        } else {
            int var2 = -this.field5422;
            if (this.field5422 > var2) {
                var2 = this.field5422;
            }
            if (-this.field5424 > var2) {
                var2 = -this.field5424;
            }
            if (this.field5424 > var2) {
                var2 = this.field5424;
            }
            if (-this.field5425 > var2) {
                var2 = -this.field5425;
            }
            if (this.field5425 > var2) {
                var2 = this.field5425;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5423 = arg0;
            this.field5427 = Integer.MIN_VALUE;
            this.field5421 = -this.field5422 / arg0;
            this.field5430 = -this.field5424 / arg0;
            this.field5419 = -this.field5425 / arg0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lnp;III)Loj;", line = 628)
    public static final class379 method2389(class490 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6918 != null && arg0.field6918.length != 0 ? new class379(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I[B[IIIIIIIIIILoj;)I", line = 635)
    private static final int method2390(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class379 arg12) {
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
        arg12.field5422 += (var19 - arg4) * arg12.field5421;
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
        arg12.field5424 = var15 >> 2;
        arg12.field5425 = var16 >> 2;
        arg12.field5433 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 688)
    public final synchronized void method2391(boolean arg0) {
        this.field5432 = (this.field5432 >>> 31) + (this.field5432 ^ this.field5432 >> 31);
        if (arg0) {
            this.field5432 = -this.field5432;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()Lpda;", line = 694)
    public final class629 method1361() {
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 698)
    public final synchronized void method2392(int arg0) {
        this.method2416(arg0 << 6, this.method2415());
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[B[IIIIIIILoj;II)I", line = 701)
    private static final int method2393(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class379 arg10, int arg11, int arg12) {
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
        arg10.field5433 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V", line = 728)
    public final synchronized void method2394(int arg0) {
        this.method2416(this.method2410(), arg0);
    }

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "()I", line = 731)
    public final synchronized int method2395() {
        return this.field5432 < 0 ? -this.field5432 : this.field5432;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V", line = 734)
    public final synchronized void method2396(int arg0, int arg1) {
        this.method2380(arg0, arg1, this.method2415());
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([B[IIIIIIIILoj;)I", line = 737)
    private static final int method2397(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class379 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5424 += (var14 - arg3) * arg9.field5430;
        arg9.field5425 += (var14 - arg3) * arg9.field5419;
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
        arg9.field5422 = var12 >> 2;
        arg9.field5433 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([B[IIIIIIILoj;)I", line = 772)
    private static final int method2398(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class379 arg8) {
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
        arg8.field5433 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "()Z", line = 797)
    public final boolean method2399() {
        return this.field5433 < 0 || this.field5433 >= ((class490) super.field8718).field6918.length << 8;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)I", line = 801)
    private static final int method2400(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[B[IIIIIIIILoj;II)I", line = 804)
    private static final int method2401(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class379 arg11, int arg12, int arg13) {
        arg11.field5424 -= arg11.field5430 * arg5;
        arg11.field5425 -= arg11.field5419 * arg5;
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
        arg11.field5424 += arg11.field5430 * arg5;
        arg11.field5425 += arg11.field5419 * arg5;
        arg11.field5422 = arg6;
        arg11.field5433 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([B[IIIIIIILoj;)I", line = 837)
    private static final int method2402(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class379 arg8) {
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
        arg8.field5433 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "(I)V", line = 865)
    private final synchronized void method2403(int arg0) {
        this.method2416(arg0, this.method2415());
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B[IIIIIIIILoj;)I", line = 870)
    private static final int method2404(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class379 arg10) {
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
        arg10.field5433 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II[B[IIIIIIIILoj;II)I", line = 908)
    private static final int method2405(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class379 arg11, int arg12, int arg13) {
        arg11.field5424 -= arg11.field5430 * arg5;
        arg11.field5425 -= arg11.field5419 * arg5;
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
        arg11.field5424 += arg11.field5430 * arg5;
        arg11.field5425 += arg11.field5419 * arg5;
        arg11.field5422 = arg6;
        arg11.field5433 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 941)
    public final synchronized void method1401(int arg0) {
        if (this.field5423 > 0) {
            if (arg0 >= this.field5423) {
                if (this.field5427 == Integer.MIN_VALUE) {
                    this.field5427 = 0;
                    this.field5422 = this.field5424 = this.field5425 = 0;
                    this.method1185(-36);
                    arg0 = this.field5423;
                }
                this.field5423 = 0;
                this.method2387();
            } else {
                this.field5422 += this.field5421 * arg0;
                this.field5424 += this.field5430 * arg0;
                this.field5425 += this.field5419 * arg0;
                this.field5423 -= arg0;
            }
        }
        class490 var2 = (class490) super.field8718;
        int var3 = this.field5428 << 8;
        int var4 = this.field5420 << 8;
        int var5 = var2.field6918.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5426 = 0;
        }
        if (this.field5433 < 0) {
            if (this.field5432 <= 0) {
                this.method2384();
                this.method1185(-92);
                return;
            }
            this.field5433 = 0;
        }
        if (this.field5433 >= var5) {
            if (this.field5432 >= 0) {
                this.method2384();
                this.method1185(-122);
                return;
            }
            this.field5433 = var5 - 1;
        }
        this.field5433 += this.field5432 * arg0;
        if (this.field5426 < 0) {
            if (!this.field5431) {
                if (this.field5432 < 0) {
                    if (this.field5433 < var3) {
                        this.field5433 = var4 - 1 - (var4 - 1 - this.field5433) % var6;
                    }
                } else if (this.field5433 >= var4) {
                    this.field5433 = (this.field5433 - var3) % var6 + var3;
                }
            } else {
                if (this.field5432 < 0) {
                    if (this.field5433 >= var3) {
                        return;
                    }
                    this.field5433 = var3 + var3 - 1 - this.field5433;
                    this.field5432 = -this.field5432;
                }
                while (this.field5433 >= var4) {
                    this.field5433 = var4 + var4 - 1 - this.field5433;
                    this.field5432 = -this.field5432;
                    if (this.field5433 >= var3) {
                        return;
                    }
                    this.field5433 = var3 + var3 - 1 - this.field5433;
                    this.field5432 = -this.field5432;
                }
            }
        } else {
            if (this.field5426 > 0) {
                if (this.field5431) {
                    label125: {
                        if (this.field5432 < 0) {
                            if (this.field5433 >= var3) {
                                return;
                            }
                            this.field5433 = var3 + var3 - 1 - this.field5433;
                            this.field5432 = -this.field5432;
                            if (--this.field5426 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5433 < var4) {
                                return;
                            }
                            this.field5433 = var4 + var4 - 1 - this.field5433;
                            this.field5432 = -this.field5432;
                            if (--this.field5426 == 0) {
                                break;
                            }
                            if (this.field5433 >= var3) {
                                return;
                            }
                            this.field5433 = var3 + var3 - 1 - this.field5433;
                            this.field5432 = -this.field5432;
                        } while (--this.field5426 != 0);
                    }
                } else if (this.field5432 < 0) {
                    if (this.field5433 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5433) / var6;
                    if (var7 < this.field5426) {
                        this.field5433 += var6 * var7;
                        this.field5426 -= var7;
                        return;
                    }
                    this.field5433 += this.field5426 * var6;
                    this.field5426 = 0;
                } else {
                    if (this.field5433 < var4) {
                        return;
                    }
                    int var8 = (this.field5433 - var3) / var6;
                    if (var8 < this.field5426) {
                        this.field5433 -= var6 * var8;
                        this.field5426 -= var8;
                        return;
                    }
                    this.field5433 -= this.field5426 * var6;
                    this.field5426 = 0;
                }
            }
            if (this.field5432 < 0) {
                if (this.field5433 < 0) {
                    this.field5433 = -1;
                    this.method2384();
                    this.method1185(-68);
                    return;
                }
            } else if (this.field5433 >= var5) {
                this.field5433 = var5;
                this.method2384();
                this.method1185(-42);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II[B[IIIIIIIIIILoj;II)I", line = 1159)
    private static final int method2406(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class379 arg13, int arg14, int arg15) {
        arg13.field5422 -= arg13.field5421 * arg5;
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
        arg13.field5422 += arg13.field5421 * var22;
        arg13.field5424 = arg6;
        arg13.field5425 = arg7;
        arg13.field5433 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()I", line = 1201)
    public final int method2407() {
        int var1 = this.field5422 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5426 == 0) {
            var2 -= this.field5433 * var2 / (((class490) super.field8718).field6918.length << 8);
        } else if (this.field5426 >= 0) {
            var2 -= this.field5428 * var2 / ((class490) super.field8718).field6918.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II[B[IIIIIIIILoj;II)I", line = 1215)
    private static final int method2408(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class379 arg11, int arg12, int arg13) {
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
        arg11.field5433 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([B[IIIIIIIILoj;)I", line = 1248)
    private static final int method2409(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class379 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5424 += (var14 - arg3) * arg9.field5430;
        arg9.field5425 += (var14 - arg3) * arg9.field5419;
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
        arg9.field5422 = var12 >> 2;
        arg9.field5433 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "()I", line = 1283)
    public final synchronized int method2410() {
        return this.field5427 == Integer.MIN_VALUE ? 0 : this.field5427;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(II[B[IIIIIIIILoj;II)I", line = 1286)
    private static final int method2411(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class379 arg11, int arg12, int arg13) {
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
        arg11.field5433 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II[B[IIIIIIILoj;II)I", line = 1318)
    private static final int method2412(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class379 arg10, int arg11, int arg12) {
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
        arg10.field5433 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I[B[IIIIIIIILoj;)I", line = 1344)
    private static final int method2413(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class379 arg10) {
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
        arg10.field5433 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([IIIII)I", line = 1382)
    private final int method2414(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5423 <= 0) {
                if (this.field5432 == -256 && (this.field5433 & 255) == 0) {
                    if (class673.field9127) {
                        return method2413(0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, 0, arg3, arg2, this);
                    }
                    return method2402(((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, 0, arg3, arg2, this);
                }
                if (class673.field9127) {
                    return method2411(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, 0, arg3, arg2, this, this.field5432, arg4);
                }
                return method2412(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, 0, arg3, arg2, this, this.field5432, arg4);
            }
            int var6 = this.field5423 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5423 += arg1;
            if (this.field5432 == -256 && (this.field5433 & 255) == 0) {
                if (class673.field9127) {
                    arg1 = method2385(0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, this.field5430, this.field5419, 0, var6, arg2, this);
                } else {
                    arg1 = method2397(((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, this.field5421, 0, var6, arg2, this);
                }
            } else if (class673.field9127) {
                arg1 = method2406(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5424, this.field5425, this.field5430, this.field5419, 0, var6, arg2, this, this.field5432, arg4);
            } else {
                arg1 = method2401(0, 0, ((class490) super.field8718).field6918, arg0, this.field5433, arg1, this.field5422, this.field5421, 0, var6, arg2, this, this.field5432, arg4);
            }
            this.field5423 -= arg1;
            if (this.field5423 != 0) {
                return arg1;
            }
        } while (!this.method2382());
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "()I", line = 1439)
    public final synchronized int method2415() {
        return this.field5429 < 0 ? -1 : this.field5429;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(II)V", line = 1443)
    private final synchronized void method2416(int arg0, int arg1) {
        this.field5427 = arg0;
        this.field5429 = arg1;
        this.field5423 = 0;
        this.method2387();
    }

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "(I)V", line = 1450)
    public final synchronized void method2417(int arg0) {
        if (this.field5432 < 0) {
            this.field5432 = -arg0;
        } else {
            this.field5432 = arg0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lnp;III)V", line = 1456)
    private class379(class490 arg0, int arg1, int arg2, int arg3) {
        super.field8718 = arg0;
        this.field5428 = arg0.field6917;
        this.field5420 = arg0.field6916;
        this.field5431 = arg0.field6919;
        this.field5432 = arg1;
        this.field5427 = arg2;
        this.field5429 = arg3;
        this.field5433 = 0;
        this.method2387();
    }
}
