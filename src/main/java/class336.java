import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class336 extends class64 {

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    private int field4473;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    private int field4479;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
    private boolean field4478;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    private int field4475;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    private int field4483;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    private int field4485;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    private int field4472;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    private int field4474;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    private int field4481;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    private int field4482;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    private int field4484;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    private int field4486;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[B[IIIIIIIILgm;)I")
    private static final int method1920(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class336 arg10) {
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
        arg10.field4472 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "()Z")
    public final boolean method1921() {
        return this.field4480 != 0;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "()V")
    private final void method1922() {
        if (this.field4480 != 0) {
            if (this.field4483 == Integer.MIN_VALUE) {
                this.field4483 = 0;
            }
            this.field4480 = 0;
            this.method1956();
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
    public final synchronized void method1923(int arg0, int arg1) {
        this.method1934(arg0, arg1, this.method1929());
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[B[IIIIIIIILgm;II)I")
    private static final int method1924(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class336 arg11, int arg12, int arg13) {
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
        arg11.field4472 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "()I")
    public final synchronized int method1925() {
        return this.field4483 == Integer.MIN_VALUE ? 0 : this.field4483;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I[B[IIIIIIIILgm;)I")
    private static final int method1926(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class336 arg10) {
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
        arg10.field4472 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([IIIII)I")
    private final int method1927(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4480 <= 0) {
                if (this.field4475 == -256 && (this.field4472 & 255) == 0) {
                    if (class67.field689) {
                        return method1926(0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, 0, arg3, arg2, this);
                    }
                    return method1950(((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, 0, arg3, arg2, this);
                }
                if (class67.field689) {
                    return method1924(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, 0, arg3, arg2, this, this.field4475, arg4);
                }
                return method1952(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, 0, arg3, arg2, this, this.field4475, arg4);
            }
            int var6 = this.field4480 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4480 += arg1;
            if (this.field4475 == -256 && (this.field4472 & 255) == 0) {
                if (class67.field689) {
                    arg1 = method1957(0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, this.field4476, this.field4477, 0, var6, arg2, this);
                } else {
                    arg1 = method1946(((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, this.field4474, 0, var6, arg2, this);
                }
            } else if (class67.field689) {
                arg1 = method1939(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, this.field4476, this.field4477, 0, var6, arg2, this, this.field4475, arg4);
            } else {
                arg1 = method1955(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, this.field4474, 0, var6, arg2, this, this.field4475, arg4);
            }
            this.field4480 -= arg1;
            if (this.field4480 != 0) {
                return arg1;
            }
        } while (!this.method1958());
        return arg3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()Lle;")
    public final class64 method361() {
        return null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([III)V")
    public final synchronized void method359(int[] arg0, int arg1, int arg2) {
        if (this.field4483 == 0 && this.field4480 == 0) {
            this.method360(arg2);
        } else {
            class52 var4 = (class52) super.field667;
            int var5 = this.field4473 << 8;
            int var6 = this.field4479 << 8;
            int var7 = var4.field504.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4482 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4472 < 0) {
                if (this.field4475 <= 0) {
                    this.method1922();
                    this.method1967(-1);
                    return;
                }
                this.field4472 = 0;
            }
            if (this.field4472 >= var7) {
                if (this.field4475 >= 0) {
                    this.method1922();
                    this.method1967(-1);
                    return;
                }
                this.field4472 = var7 - 1;
            }
            if (this.field4482 < 0) {
                if (this.field4478) {
                    if (this.field4475 < 0) {
                        var9 = this.method1927(arg0, arg1, var5, var10, var4.field504[this.field4473]);
                        if (this.field4472 >= var5) {
                            return;
                        }
                        this.field4472 = var5 + var5 - 1 - this.field4472;
                        this.field4475 = -this.field4475;
                    }
                    while (true) {
                        int var11 = this.method1931(arg0, var9, var6, var10, var4.field504[this.field4479 - 1]);
                        if (this.field4472 < var6) {
                            return;
                        }
                        this.field4472 = var6 + var6 - 1 - this.field4472;
                        this.field4475 = -this.field4475;
                        var9 = this.method1927(arg0, var11, var5, var10, var4.field504[this.field4473]);
                        if (this.field4472 >= var5) {
                            return;
                        }
                        this.field4472 = var5 + var5 - 1 - this.field4472;
                        this.field4475 = -this.field4475;
                    }
                } else if (this.field4475 < 0) {
                    while (true) {
                        var9 = this.method1927(arg0, var9, var5, var10, var4.field504[this.field4479 - 1]);
                        if (this.field4472 >= var5) {
                            return;
                        }
                        this.field4472 = var6 - 1 - (var6 - 1 - this.field4472) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1931(arg0, var9, var6, var10, var4.field504[this.field4473]);
                        if (this.field4472 < var6) {
                            return;
                        }
                        this.field4472 = (this.field4472 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4482 > 0) {
                    if (this.field4478) {
                        label130: {
                            if (this.field4475 < 0) {
                                var9 = this.method1927(arg0, arg1, var5, var10, var4.field504[this.field4473]);
                                if (this.field4472 >= var5) {
                                    return;
                                }
                                this.field4472 = var5 + var5 - 1 - this.field4472;
                                this.field4475 = -this.field4475;
                                if (--this.field4482 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1931(arg0, var9, var6, var10, var4.field504[this.field4479 - 1]);
                                if (this.field4472 < var6) {
                                    return;
                                }
                                this.field4472 = var6 + var6 - 1 - this.field4472;
                                this.field4475 = -this.field4475;
                                if (--this.field4482 == 0) {
                                    break;
                                }
                                var9 = this.method1927(arg0, var9, var5, var10, var4.field504[this.field4473]);
                                if (this.field4472 >= var5) {
                                    return;
                                }
                                this.field4472 = var5 + var5 - 1 - this.field4472;
                                this.field4475 = -this.field4475;
                            } while (--this.field4482 != 0);
                        }
                    } else if (this.field4475 < 0) {
                        while (true) {
                            var9 = this.method1927(arg0, var9, var5, var10, var4.field504[this.field4479 - 1]);
                            if (this.field4472 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4472) / var8;
                            if (var12 >= this.field4482) {
                                this.field4472 += this.field4482 * var8;
                                this.field4482 = 0;
                                break;
                            }
                            this.field4472 += var8 * var12;
                            this.field4482 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1931(arg0, var9, var6, var10, var4.field504[this.field4473]);
                            if (this.field4472 < var6) {
                                return;
                            }
                            int var13 = (this.field4472 - var5) / var8;
                            if (var13 >= this.field4482) {
                                this.field4472 -= this.field4482 * var8;
                                this.field4482 = 0;
                                break;
                            }
                            this.field4472 -= var8 * var13;
                            this.field4482 -= var13;
                        }
                    }
                }
                if (this.field4475 < 0) {
                    this.method1927(arg0, var9, 0, var10, 0);
                    if (this.field4472 < 0) {
                        this.field4472 = -1;
                        this.method1922();
                        this.method1967(-1);
                        return;
                    }
                } else {
                    this.method1931(arg0, var9, var7, var10, 0);
                    if (this.field4472 >= var7) {
                        this.field4472 = var7;
                        this.method1922();
                        this.method1967(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lwo;III)Lgm;")
    public static final class336 method1928(class52 arg0, int arg1, int arg2, int arg3) {
        return arg0.field504 != null && arg0.field504.length != 0 ? new class336(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "()I")
    public final synchronized int method1929() {
        return this.field4485 < 0 ? -1 : this.field4485;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V")
    private final synchronized void method1930(int arg0) {
        this.method1953(arg0, this.method1929());
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "([IIIII)I")
    private final int method1931(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4480 <= 0) {
                if (this.field4475 == 256 && (this.field4472 & 255) == 0) {
                    if (class67.field689) {
                        return method1920(0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, 0, arg3, arg2, this);
                    }
                    return method1935(((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, 0, arg3, arg2, this);
                }
                if (class67.field689) {
                    return method1949(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, 0, arg3, arg2, this, this.field4475, arg4);
                }
                return method1944(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, 0, arg3, arg2, this, this.field4475, arg4);
            }
            int var6 = this.field4480 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4480 += arg1;
            if (this.field4475 == 256 && (this.field4472 & 255) == 0) {
                if (class67.field689) {
                    arg1 = method1945(0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, this.field4476, this.field4477, 0, var6, arg2, this);
                } else {
                    arg1 = method1940(((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, this.field4474, 0, var6, arg2, this);
                }
            } else if (class67.field689) {
                arg1 = method1932(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4486, this.field4481, this.field4476, this.field4477, 0, var6, arg2, this, this.field4475, arg4);
            } else {
                arg1 = method1936(0, 0, ((class52) super.field667).field504, arg0, this.field4472, arg1, this.field4484, this.field4474, 0, var6, arg2, this, this.field4475, arg4);
            }
            this.field4480 -= arg1;
            if (this.field4480 != 0) {
                return arg1;
            }
        } while (!this.method1958());
        return arg3;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()I")
    public final int method365() {
        return this.field4483 == 0 && this.field4480 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[B[IIIIIIIIIILgm;II)I")
    private static final int method1932(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class336 arg13, int arg14, int arg15) {
        arg13.field4484 -= arg13.field4474 * arg5;
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
        arg13.field4484 += arg13.field4474 * var22;
        arg13.field4486 = arg6;
        arg13.field4481 = arg7;
        arg13.field4472 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
    private static final int method1933(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
    public final synchronized void method1934(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1953(arg1, arg2);
        } else {
            int var4 = method1948(arg1, arg2);
            int var5 = method1933(arg1, arg2);
            if (this.field4486 == var4 && this.field4481 == var5) {
                this.field4480 = 0;
            } else {
                int var6 = arg1 - this.field4484;
                if (this.field4484 - arg1 > var6) {
                    var6 = this.field4484 - arg1;
                }
                if (var4 - this.field4486 > var6) {
                    var6 = var4 - this.field4486;
                }
                if (this.field4486 - var4 > var6) {
                    var6 = this.field4486 - var4;
                }
                if (var5 - this.field4481 > var6) {
                    var6 = var5 - this.field4481;
                }
                if (this.field4481 - var5 > var6) {
                    var6 = this.field4481 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4480 = arg0;
                this.field4483 = arg1;
                this.field4485 = arg2;
                this.field4474 = (arg1 - this.field4484) / arg0;
                this.field4476 = (var4 - this.field4486) / arg0;
                this.field4477 = (var5 - this.field4481) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([B[IIIIIIILgm;)I")
    private static final int method1935(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class336 arg8) {
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
        arg8.field4472 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II[B[IIIIIIIILgm;II)I")
    private static final int method1936(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class336 arg11, int arg12, int arg13) {
        arg11.field4486 -= arg11.field4476 * arg5;
        arg11.field4481 -= arg11.field4477 * arg5;
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
        arg11.field4486 += arg11.field4476 * arg5;
        arg11.field4481 += arg11.field4477 * arg5;
        arg11.field4484 = arg6;
        arg11.field4472 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V")
    public final synchronized void method1937(int arg0) {
        if (this.field4475 < 0) {
            this.field4475 = -arg0;
        } else {
            this.field4475 = arg0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lwo;II)Lgm;")
    public static final class336 method1938(class52 arg0, int arg1, int arg2) {
        return arg0.field504 != null && arg0.field504.length != 0 ? new class336(arg0, (int) ((long) arg0.field508 * 256L * (long) arg1 / (long) (class432.field6338 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II[B[IIIIIIIIIILgm;II)I")
    private static final int method1939(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class336 arg13, int arg14, int arg15) {
        arg13.field4484 -= arg13.field4474 * arg5;
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
        arg13.field4484 += arg13.field4474 * var22;
        arg13.field4486 = arg6;
        arg13.field4481 = arg7;
        arg13.field4472 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([B[IIIIIIIILgm;)I")
    private static final int method1940(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class336 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4486 += (var14 - arg3) * arg9.field4476;
        arg9.field4481 += (var14 - arg3) * arg9.field4477;
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
        arg9.field4484 = var12 >> 2;
        arg9.field4472 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)V")
    public final synchronized void method1941(int arg0) {
        int var2 = ((class52) super.field667).field504.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4472 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V")
    public final synchronized void method1942(int arg0) {
        if (arg0 == 0) {
            this.method1930(0);
            this.method1967(-1);
        } else if (this.field4486 == 0 && this.field4481 == 0) {
            this.field4480 = 0;
            this.field4483 = 0;
            this.field4484 = 0;
            this.method1967(-1);
        } else {
            int var2 = -this.field4484;
            if (this.field4484 > var2) {
                var2 = this.field4484;
            }
            if (-this.field4486 > var2) {
                var2 = -this.field4486;
            }
            if (this.field4486 > var2) {
                var2 = this.field4486;
            }
            if (-this.field4481 > var2) {
                var2 = -this.field4481;
            }
            if (this.field4481 > var2) {
                var2 = this.field4481;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4480 = arg0;
            this.field4483 = Integer.MIN_VALUE;
            this.field4474 = -this.field4484 / arg0;
            this.field4476 = -this.field4486 / arg0;
            this.field4477 = -this.field4481 / arg0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "(I)V")
    public final synchronized void method1943(int arg0) {
        this.field4482 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()I")
    public final int method362() {
        int var1 = this.field4484 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4482 == 0) {
            var2 -= this.field4472 * var2 / (((class52) super.field667).field504.length << 8);
        } else if (this.field4482 >= 0) {
            var2 -= this.field4473 * var2 / ((class52) super.field667).field504.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[B[IIIIIIILgm;II)I")
    private static final int method1944(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class336 arg10, int arg11, int arg12) {
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
        arg10.field4472 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[B[IIIIIIIIIILgm;)I")
    private static final int method1945(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class336 arg12) {
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
        arg12.field4484 += (var19 - arg4) * arg12.field4474;
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
        arg12.field4486 = var15 >> 2;
        arg12.field4481 = var16 >> 2;
        arg12.field4472 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "([B[IIIIIIIILgm;)I")
    private static final int method1946(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class336 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4486 += (var14 - arg3) * arg9.field4476;
        arg9.field4481 += (var14 - arg3) * arg9.field4477;
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
        arg9.field4484 = var12 >> 2;
        arg9.field4472 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
    public final synchronized void method1947(boolean arg0) {
        this.field4475 = (this.field4475 >>> 31) + (this.field4475 ^ this.field4475 >> 31);
        if (arg0) {
            this.field4475 = -this.field4475;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)I")
    private static final int method1948(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II[B[IIIIIIIILgm;II)I")
    private static final int method1949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class336 arg11, int arg12, int arg13) {
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
        arg11.field4472 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "([B[IIIIIIILgm;)I")
    private static final int method1950(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class336 arg8) {
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
        arg8.field4472 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "()I")
    public final synchronized int method1951() {
        return this.field4475 < 0 ? -this.field4475 : this.field4475;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II[B[IIIIIIILgm;II)I")
    private static final int method1952(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class336 arg10, int arg11, int arg12) {
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
        arg10.field4472 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(II)V")
    private final synchronized void method1953(int arg0, int arg1) {
        this.field4483 = arg0;
        this.field4485 = arg1;
        this.field4480 = 0;
        this.method1956();
    }

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "()Z")
    public final boolean method1954() {
        return this.field4472 < 0 || this.field4472 >= ((class52) super.field667).field504.length << 8;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(II[B[IIIIIIIILgm;II)I")
    private static final int method1955(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class336 arg11, int arg12, int arg13) {
        arg11.field4486 -= arg11.field4476 * arg5;
        arg11.field4481 -= arg11.field4477 * arg5;
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
        arg11.field4486 += arg11.field4476 * arg5;
        arg11.field4481 += arg11.field4477 * arg5;
        arg11.field4484 = arg6;
        arg11.field4472 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "()V")
    private final void method1956() {
        this.field4484 = this.field4483;
        this.field4486 = method1948(this.field4483, this.field4485);
        this.field4481 = method1933(this.field4483, this.field4485);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()Lle;")
    public final class64 method363() {
        return null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I[B[IIIIIIIIIILgm;)I")
    private static final int method1957(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class336 arg12) {
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
        arg12.field4484 += (var19 - arg4) * arg12.field4474;
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
        arg12.field4486 = var15 >> 2;
        arg12.field4481 = var16 >> 2;
        arg12.field4472 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "()Z")
    private final boolean method1958() {
        int var1 = this.field4483;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1948(var1, this.field4485);
            var2 = method1933(var1, this.field4485);
        }
        if (this.field4484 == var1 && this.field4486 == var3 && this.field4481 == var2) {
            if (this.field4483 == Integer.MIN_VALUE) {
                this.field4483 = 0;
                this.field4484 = this.field4486 = this.field4481 = 0;
                this.method1967(-1);
                return true;
            } else {
                this.method1956();
                return false;
            }
        } else {
            if (this.field4484 < var1) {
                this.field4474 = 1;
                this.field4480 = var1 - this.field4484;
            } else if (this.field4484 > var1) {
                this.field4474 = -1;
                this.field4480 = this.field4484 - var1;
            } else {
                this.field4474 = 0;
            }
            if (this.field4486 < var3) {
                this.field4476 = 1;
                if (this.field4480 == 0 || this.field4480 > var3 - this.field4486) {
                    this.field4480 = var3 - this.field4486;
                }
            } else if (this.field4486 > var3) {
                this.field4476 = -1;
                if (this.field4480 == 0 || this.field4480 > this.field4486 - var3) {
                    this.field4480 = this.field4486 - var3;
                }
            } else {
                this.field4476 = 0;
            }
            if (this.field4481 < var2) {
                this.field4477 = 1;
                if (this.field4480 == 0 || this.field4480 > var2 - this.field4481) {
                    this.field4480 = var2 - this.field4481;
                }
            } else if (this.field4481 > var2) {
                this.field4477 = -1;
                if (this.field4480 == 0 || this.field4480 > this.field4481 - var2) {
                    this.field4480 = this.field4481 - var2;
                }
            } else {
                this.field4477 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lwo;II)V")
    private class336(class52 arg0, int arg1, int arg2) {
        super.field667 = arg0;
        this.field4473 = arg0.field507;
        this.field4479 = arg0.field505;
        this.field4478 = arg0.field506;
        this.field4475 = arg1;
        this.field4483 = arg2;
        this.field4485 = 8192;
        this.field4472 = 0;
        this.method1956();
    }

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "(I)V")
    public final synchronized void method1959(int arg0) {
        this.method1953(arg0 << 6, this.method1929());
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lwo;III)V")
    private class336(class52 arg0, int arg1, int arg2, int arg3) {
        super.field667 = arg0;
        this.field4473 = arg0.field507;
        this.field4479 = arg0.field505;
        this.field4478 = arg0.field506;
        this.field4475 = arg1;
        this.field4483 = arg2;
        this.field4485 = arg3;
        this.field4472 = 0;
        this.method1956();
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
    public final synchronized void method360(int arg0) {
        if (this.field4480 > 0) {
            if (arg0 >= this.field4480) {
                if (this.field4483 == Integer.MIN_VALUE) {
                    this.field4483 = 0;
                    this.field4484 = this.field4486 = this.field4481 = 0;
                    this.method1967(-1);
                    arg0 = this.field4480;
                }
                this.field4480 = 0;
                this.method1956();
            } else {
                this.field4484 += this.field4474 * arg0;
                this.field4486 += this.field4476 * arg0;
                this.field4481 += this.field4477 * arg0;
                this.field4480 -= arg0;
            }
        }
        class52 var2 = (class52) super.field667;
        int var3 = this.field4473 << 8;
        int var4 = this.field4479 << 8;
        int var5 = var2.field504.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4482 = 0;
        }
        if (this.field4472 < 0) {
            if (this.field4475 <= 0) {
                this.method1922();
                this.method1967(-1);
                return;
            }
            this.field4472 = 0;
        }
        if (this.field4472 >= var5) {
            if (this.field4475 >= 0) {
                this.method1922();
                this.method1967(-1);
                return;
            }
            this.field4472 = var5 - 1;
        }
        this.field4472 += this.field4475 * arg0;
        if (this.field4482 < 0) {
            if (!this.field4478) {
                if (this.field4475 < 0) {
                    if (this.field4472 < var3) {
                        this.field4472 = var4 - 1 - (var4 - 1 - this.field4472) % var6;
                    }
                } else if (this.field4472 >= var4) {
                    this.field4472 = (this.field4472 - var3) % var6 + var3;
                }
            } else {
                if (this.field4475 < 0) {
                    if (this.field4472 >= var3) {
                        return;
                    }
                    this.field4472 = var3 + var3 - 1 - this.field4472;
                    this.field4475 = -this.field4475;
                }
                while (this.field4472 >= var4) {
                    this.field4472 = var4 + var4 - 1 - this.field4472;
                    this.field4475 = -this.field4475;
                    if (this.field4472 >= var3) {
                        return;
                    }
                    this.field4472 = var3 + var3 - 1 - this.field4472;
                    this.field4475 = -this.field4475;
                }
            }
        } else {
            if (this.field4482 > 0) {
                if (this.field4478) {
                    label125: {
                        if (this.field4475 < 0) {
                            if (this.field4472 >= var3) {
                                return;
                            }
                            this.field4472 = var3 + var3 - 1 - this.field4472;
                            this.field4475 = -this.field4475;
                            if (--this.field4482 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4472 < var4) {
                                return;
                            }
                            this.field4472 = var4 + var4 - 1 - this.field4472;
                            this.field4475 = -this.field4475;
                            if (--this.field4482 == 0) {
                                break;
                            }
                            if (this.field4472 >= var3) {
                                return;
                            }
                            this.field4472 = var3 + var3 - 1 - this.field4472;
                            this.field4475 = -this.field4475;
                        } while (--this.field4482 != 0);
                    }
                } else if (this.field4475 < 0) {
                    if (this.field4472 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4472) / var6;
                    if (var7 < this.field4482) {
                        this.field4472 += var6 * var7;
                        this.field4482 -= var7;
                        return;
                    }
                    this.field4472 += this.field4482 * var6;
                    this.field4482 = 0;
                } else {
                    if (this.field4472 < var4) {
                        return;
                    }
                    int var8 = (this.field4472 - var3) / var6;
                    if (var8 < this.field4482) {
                        this.field4472 -= var6 * var8;
                        this.field4482 -= var8;
                        return;
                    }
                    this.field4472 -= this.field4482 * var6;
                    this.field4482 = 0;
                }
            }
            if (this.field4475 < 0) {
                if (this.field4472 < 0) {
                    this.field4472 = -1;
                    this.method1922();
                    this.method1967(-1);
                    return;
                }
            } else if (this.field4472 >= var5) {
                this.field4472 = var5;
                this.method1922();
                this.method1967(-1);
            }
        }
    }
}
