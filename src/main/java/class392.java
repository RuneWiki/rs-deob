import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class392 extends class214 {

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    private int field5865;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    private int field5852;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "Z")
    private boolean field5862;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    private int field5860;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    private int field5863;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    private int field5853;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    private int field5864;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    private int field5854;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    private int field5855;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    private int field5856;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    private int field5857;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    private int field5858;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    private int field5859;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    private int field5861;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    private int field5866;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIIIIILfi;II)I")
    private static final int method2432(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class392 arg13, int arg14, int arg15) {
        arg13.field5855 -= arg13.field5859 * arg5;
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
        arg13.field5855 += arg13.field5859 * var22;
        arg13.field5866 = arg6;
        arg13.field5858 = arg7;
        arg13.field5864 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public final synchronized void method2433(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2438(arg1, arg2);
        } else {
            int var4 = method2461(arg1, arg2);
            int var5 = method2447(arg1, arg2);
            if (this.field5866 == var4 && this.field5858 == var5) {
                this.field5856 = 0;
            } else {
                int var6 = arg1 - this.field5855;
                if (this.field5855 - arg1 > var6) {
                    var6 = this.field5855 - arg1;
                }
                if (var4 - this.field5866 > var6) {
                    var6 = var4 - this.field5866;
                }
                if (this.field5866 - var4 > var6) {
                    var6 = this.field5866 - var4;
                }
                if (var5 - this.field5858 > var6) {
                    var6 = var5 - this.field5858;
                }
                if (this.field5858 - var5 > var6) {
                    var6 = this.field5858 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5856 = arg0;
                this.field5863 = arg1;
                this.field5853 = arg2;
                this.field5859 = (arg1 - this.field5855) / arg0;
                this.field5857 = (var4 - this.field5866) / arg0;
                this.field5861 = (var5 - this.field5858) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([III)V")
    public final synchronized void method387(int[] arg0, int arg1, int arg2) {
        if (this.field5863 == 0 && this.field5856 == 0) {
            this.method389(arg2);
        } else {
            class79 var4 = (class79) super.field3486;
            int var5 = this.field5865 << 8;
            int var6 = this.field5852 << 8;
            int var7 = var4.field1141.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5854 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5864 < 0) {
                if (this.field5860 <= 0) {
                    this.method2471();
                    this.method2677(-22491);
                    return;
                }
                this.field5864 = 0;
            }
            if (this.field5864 >= var7) {
                if (this.field5860 >= 0) {
                    this.method2471();
                    this.method2677(-22491);
                    return;
                }
                this.field5864 = var7 - 1;
            }
            if (this.field5854 < 0) {
                if (this.field5862) {
                    if (this.field5860 < 0) {
                        var9 = this.method2434(arg0, arg1, var5, var10, var4.field1141[this.field5865]);
                        if (this.field5864 >= var5) {
                            return;
                        }
                        this.field5864 = var5 + var5 - 1 - this.field5864;
                        this.field5860 = -this.field5860;
                    }
                    while (true) {
                        int var11 = this.method2450(arg0, var9, var6, var10, var4.field1141[this.field5852 - 1]);
                        if (this.field5864 < var6) {
                            return;
                        }
                        this.field5864 = var6 + var6 - 1 - this.field5864;
                        this.field5860 = -this.field5860;
                        var9 = this.method2434(arg0, var11, var5, var10, var4.field1141[this.field5865]);
                        if (this.field5864 >= var5) {
                            return;
                        }
                        this.field5864 = var5 + var5 - 1 - this.field5864;
                        this.field5860 = -this.field5860;
                    }
                } else if (this.field5860 < 0) {
                    while (true) {
                        var9 = this.method2434(arg0, var9, var5, var10, var4.field1141[this.field5852 - 1]);
                        if (this.field5864 >= var5) {
                            return;
                        }
                        this.field5864 = var6 - 1 - (var6 - 1 - this.field5864) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2450(arg0, var9, var6, var10, var4.field1141[this.field5865]);
                        if (this.field5864 < var6) {
                            return;
                        }
                        this.field5864 = (this.field5864 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5854 > 0) {
                    if (this.field5862) {
                        label130: {
                            if (this.field5860 < 0) {
                                var9 = this.method2434(arg0, arg1, var5, var10, var4.field1141[this.field5865]);
                                if (this.field5864 >= var5) {
                                    return;
                                }
                                this.field5864 = var5 + var5 - 1 - this.field5864;
                                this.field5860 = -this.field5860;
                                if (--this.field5854 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2450(arg0, var9, var6, var10, var4.field1141[this.field5852 - 1]);
                                if (this.field5864 < var6) {
                                    return;
                                }
                                this.field5864 = var6 + var6 - 1 - this.field5864;
                                this.field5860 = -this.field5860;
                                if (--this.field5854 == 0) {
                                    break;
                                }
                                var9 = this.method2434(arg0, var9, var5, var10, var4.field1141[this.field5865]);
                                if (this.field5864 >= var5) {
                                    return;
                                }
                                this.field5864 = var5 + var5 - 1 - this.field5864;
                                this.field5860 = -this.field5860;
                            } while (--this.field5854 != 0);
                        }
                    } else if (this.field5860 < 0) {
                        while (true) {
                            var9 = this.method2434(arg0, var9, var5, var10, var4.field1141[this.field5852 - 1]);
                            if (this.field5864 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5864) / var8;
                            if (var12 >= this.field5854) {
                                this.field5864 += this.field5854 * var8;
                                this.field5854 = 0;
                                break;
                            }
                            this.field5864 += var8 * var12;
                            this.field5854 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2450(arg0, var9, var6, var10, var4.field1141[this.field5865]);
                            if (this.field5864 < var6) {
                                return;
                            }
                            int var13 = (this.field5864 - var5) / var8;
                            if (var13 >= this.field5854) {
                                this.field5864 -= this.field5854 * var8;
                                this.field5854 = 0;
                                break;
                            }
                            this.field5864 -= var8 * var13;
                            this.field5854 -= var13;
                        }
                    }
                }
                if (this.field5860 < 0) {
                    this.method2434(arg0, var9, 0, var10, 0);
                    if (this.field5864 < 0) {
                        this.field5864 = -1;
                        this.method2471();
                        this.method2677(-22491);
                        return;
                    }
                } else {
                    this.method2450(arg0, var9, var7, var10, 0);
                    if (this.field5864 >= var7) {
                        this.field5864 = var7;
                        this.method2471();
                        this.method2677(-22491);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIIII)I")
    private final int method2434(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5856 <= 0) {
                if (this.field5860 == -256 && (this.field5864 & 255) == 0) {
                    if (class368.field5405) {
                        return method2437(0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, 0, arg3, arg2, this);
                    }
                    return method2469(((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, 0, arg3, arg2, this);
                }
                if (class368.field5405) {
                    return method2440(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, 0, arg3, arg2, this, this.field5860, arg4);
                }
                return method2446(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, 0, arg3, arg2, this, this.field5860, arg4);
            }
            int var6 = this.field5856 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5856 += arg1;
            if (this.field5860 == -256 && (this.field5864 & 255) == 0) {
                if (class368.field5405) {
                    arg1 = method2456(0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, this.field5857, this.field5861, 0, var6, arg2, this);
                } else {
                    arg1 = method2444(((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, this.field5859, 0, var6, arg2, this);
                }
            } else if (class368.field5405) {
                arg1 = method2432(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, this.field5857, this.field5861, 0, var6, arg2, this, this.field5860, arg4);
            } else {
                arg1 = method2435(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, this.field5859, 0, var6, arg2, this, this.field5860, arg4);
            }
            this.field5856 -= arg1;
            if (this.field5856 != 0) {
                return arg1;
            }
        } while (!this.method2436());
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method2435(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class392 arg11, int arg12, int arg13) {
        arg11.field5866 -= arg11.field5857 * arg5;
        arg11.field5858 -= arg11.field5861 * arg5;
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
        arg11.field5866 += arg11.field5857 * arg5;
        arg11.field5858 += arg11.field5861 * arg5;
        arg11.field5855 = arg6;
        arg11.field5864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "()Z")
    private final boolean method2436() {
        int var1 = this.field5863;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2461(var1, this.field5853);
            var2 = method2447(var1, this.field5853);
        }
        if (this.field5855 == var1 && this.field5866 == var3 && this.field5858 == var2) {
            if (this.field5863 == Integer.MIN_VALUE) {
                this.field5863 = 0;
                this.field5855 = this.field5866 = this.field5858 = 0;
                this.method2677(-22491);
                return true;
            } else {
                this.method2449();
                return false;
            }
        } else {
            if (this.field5855 < var1) {
                this.field5859 = 1;
                this.field5856 = var1 - this.field5855;
            } else if (this.field5855 > var1) {
                this.field5859 = -1;
                this.field5856 = this.field5855 - var1;
            } else {
                this.field5859 = 0;
            }
            if (this.field5866 < var3) {
                this.field5857 = 1;
                if (this.field5856 == 0 || this.field5856 > var3 - this.field5866) {
                    this.field5856 = var3 - this.field5866;
                }
            } else if (this.field5866 > var3) {
                this.field5857 = -1;
                if (this.field5856 == 0 || this.field5856 > this.field5866 - var3) {
                    this.field5856 = this.field5866 - var3;
                }
            } else {
                this.field5857 = 0;
            }
            if (this.field5858 < var2) {
                this.field5861 = 1;
                if (this.field5856 == 0 || this.field5856 > var2 - this.field5858) {
                    this.field5856 = var2 - this.field5858;
                }
            } else if (this.field5858 > var2) {
                this.field5861 = -1;
                if (this.field5856 == 0 || this.field5856 > this.field5858 - var2) {
                    this.field5856 = this.field5858 - var2;
                }
            } else {
                this.field5861 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[B[IIIIIIIILfi;)I")
    private static final int method2437(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class392 arg10) {
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
        arg10.field5864 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
    private final synchronized void method2438(int arg0, int arg1) {
        this.field5863 = arg0;
        this.field5853 = arg1;
        this.field5856 = 0;
        this.method2449();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[B[IIIIIIIILfi;)I")
    private static final int method2439(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class392 arg10) {
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
        arg10.field5864 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method2440(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class392 arg11, int arg12, int arg13) {
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
        arg11.field5864 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIIIIILfi;II)I")
    private static final int method2441(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class392 arg13, int arg14, int arg15) {
        arg13.field5855 -= arg13.field5859 * arg5;
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
        arg13.field5855 += arg13.field5859 * var22;
        arg13.field5866 = arg6;
        arg13.field5858 = arg7;
        arg13.field5864 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()I")
    public final int method391() {
        return this.field5863 == 0 && this.field5856 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfv;II)Lfi;")
    public static final class392 method2442(class79 arg0, int arg1, int arg2) {
        return arg0.field1141 != null && arg0.field1141.length != 0 ? new class392(arg0, (int) ((long) arg0.field1139 * 256L * (long) arg1 / (long) (class40.field540 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[B[IIIIIIIIIILfi;)I")
    private static final int method2443(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class392 arg12) {
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
        arg12.field5855 += (var19 - arg4) * arg12.field5859;
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
        arg12.field5866 = var15 >> 2;
        arg12.field5858 = var16 >> 2;
        arg12.field5864 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B[IIIIIIIILfi;)I")
    private static final int method2444(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class392 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5866 += (var14 - arg3) * arg9.field5857;
        arg9.field5858 += (var14 - arg3) * arg9.field5861;
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
        arg9.field5855 = var12 >> 2;
        arg9.field5864 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public final synchronized void method2445(int arg0) {
        if (arg0 == 0) {
            this.method2465(0);
            this.method2677(-22491);
        } else if (this.field5866 == 0 && this.field5858 == 0) {
            this.field5856 = 0;
            this.field5863 = 0;
            this.field5855 = 0;
            this.method2677(-22491);
        } else {
            int var2 = -this.field5855;
            if (this.field5855 > var2) {
                var2 = this.field5855;
            }
            if (-this.field5866 > var2) {
                var2 = -this.field5866;
            }
            if (this.field5866 > var2) {
                var2 = this.field5866;
            }
            if (-this.field5858 > var2) {
                var2 = -this.field5858;
            }
            if (this.field5858 > var2) {
                var2 = this.field5858;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5856 = arg0;
            this.field5863 = Integer.MIN_VALUE;
            this.field5859 = -this.field5855 / arg0;
            this.field5857 = -this.field5866 / arg0;
            this.field5861 = -this.field5858 / arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIILfi;II)I")
    private static final int method2446(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class392 arg10, int arg11, int arg12) {
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
        arg10.field5864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
    private static final int method2447(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lfp;")
    public final class214 method394() {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method2448(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class392 arg11, int arg12, int arg13) {
        arg11.field5866 -= arg11.field5857 * arg5;
        arg11.field5858 -= arg11.field5861 * arg5;
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
        arg11.field5866 += arg11.field5857 * arg5;
        arg11.field5858 += arg11.field5861 * arg5;
        arg11.field5855 = arg6;
        arg11.field5864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "()V")
    private final void method2449() {
        this.field5855 = this.field5863;
        this.field5866 = method2461(this.field5863, this.field5853);
        this.field5858 = method2447(this.field5863, this.field5853);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([IIIII)I")
    private final int method2450(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5856 <= 0) {
                if (this.field5860 == 256 && (this.field5864 & 255) == 0) {
                    if (class368.field5405) {
                        return method2439(0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, 0, arg3, arg2, this);
                    }
                    return method2455(((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, 0, arg3, arg2, this);
                }
                if (class368.field5405) {
                    return method2468(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, 0, arg3, arg2, this, this.field5860, arg4);
                }
                return method2459(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, 0, arg3, arg2, this, this.field5860, arg4);
            }
            int var6 = this.field5856 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5856 += arg1;
            if (this.field5860 == 256 && (this.field5864 & 255) == 0) {
                if (class368.field5405) {
                    arg1 = method2443(0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, this.field5857, this.field5861, 0, var6, arg2, this);
                } else {
                    arg1 = method2453(((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, this.field5859, 0, var6, arg2, this);
                }
            } else if (class368.field5405) {
                arg1 = method2441(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5866, this.field5858, this.field5857, this.field5861, 0, var6, arg2, this, this.field5860, arg4);
            } else {
                arg1 = method2448(0, 0, ((class79) super.field3486).field1141, arg0, this.field5864, arg1, this.field5855, this.field5859, 0, var6, arg2, this, this.field5860, arg4);
            }
            this.field5856 -= arg1;
            if (this.field5856 != 0) {
                return arg1;
            }
        } while (!this.method2436());
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()Lfp;")
    public final class214 method386() {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "()I")
    public final synchronized int method2451() {
        return this.field5853 < 0 ? -1 : this.field5853;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    public final synchronized void method2452(int arg0) {
        this.method2438(arg0 << 6, this.method2451());
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([B[IIIIIIIILfi;)I")
    private static final int method2453(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class392 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5866 += (var14 - arg3) * arg9.field5857;
        arg9.field5858 += (var14 - arg3) * arg9.field5861;
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
        arg9.field5855 = var12 >> 2;
        arg9.field5864 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
    public final synchronized void method2454(int arg0) {
        this.field5854 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B[IIIIIIILfi;)I")
    private static final int method2455(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class392 arg8) {
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
        arg8.field5864 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[B[IIIIIIIIIILfi;)I")
    private static final int method2456(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class392 arg12) {
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
        arg12.field5855 += (var19 - arg4) * arg12.field5859;
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
        arg12.field5866 = var15 >> 2;
        arg12.field5858 = var16 >> 2;
        arg12.field5864 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V")
    public final synchronized void method2457(int arg0) {
        int var2 = ((class79) super.field3486).field1141.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5864 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lfv;III)Lfi;")
    public static final class392 method2458(class79 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1141 != null && arg0.field1141.length != 0 ? new class392(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final synchronized void method389(int arg0) {
        if (this.field5856 > 0) {
            if (arg0 >= this.field5856) {
                if (this.field5863 == Integer.MIN_VALUE) {
                    this.field5863 = 0;
                    this.field5855 = this.field5866 = this.field5858 = 0;
                    this.method2677(-22491);
                    arg0 = this.field5856;
                }
                this.field5856 = 0;
                this.method2449();
            } else {
                this.field5855 += this.field5859 * arg0;
                this.field5866 += this.field5857 * arg0;
                this.field5858 += this.field5861 * arg0;
                this.field5856 -= arg0;
            }
        }
        class79 var2 = (class79) super.field3486;
        int var3 = this.field5865 << 8;
        int var4 = this.field5852 << 8;
        int var5 = var2.field1141.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5854 = 0;
        }
        if (this.field5864 < 0) {
            if (this.field5860 <= 0) {
                this.method2471();
                this.method2677(-22491);
                return;
            }
            this.field5864 = 0;
        }
        if (this.field5864 >= var5) {
            if (this.field5860 >= 0) {
                this.method2471();
                this.method2677(-22491);
                return;
            }
            this.field5864 = var5 - 1;
        }
        this.field5864 += this.field5860 * arg0;
        if (this.field5854 < 0) {
            if (!this.field5862) {
                if (this.field5860 < 0) {
                    if (this.field5864 < var3) {
                        this.field5864 = var4 - 1 - (var4 - 1 - this.field5864) % var6;
                    }
                } else if (this.field5864 >= var4) {
                    this.field5864 = (this.field5864 - var3) % var6 + var3;
                }
            } else {
                if (this.field5860 < 0) {
                    if (this.field5864 >= var3) {
                        return;
                    }
                    this.field5864 = var3 + var3 - 1 - this.field5864;
                    this.field5860 = -this.field5860;
                }
                while (this.field5864 >= var4) {
                    this.field5864 = var4 + var4 - 1 - this.field5864;
                    this.field5860 = -this.field5860;
                    if (this.field5864 >= var3) {
                        return;
                    }
                    this.field5864 = var3 + var3 - 1 - this.field5864;
                    this.field5860 = -this.field5860;
                }
            }
        } else {
            if (this.field5854 > 0) {
                if (this.field5862) {
                    label125: {
                        if (this.field5860 < 0) {
                            if (this.field5864 >= var3) {
                                return;
                            }
                            this.field5864 = var3 + var3 - 1 - this.field5864;
                            this.field5860 = -this.field5860;
                            if (--this.field5854 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5864 < var4) {
                                return;
                            }
                            this.field5864 = var4 + var4 - 1 - this.field5864;
                            this.field5860 = -this.field5860;
                            if (--this.field5854 == 0) {
                                break;
                            }
                            if (this.field5864 >= var3) {
                                return;
                            }
                            this.field5864 = var3 + var3 - 1 - this.field5864;
                            this.field5860 = -this.field5860;
                        } while (--this.field5854 != 0);
                    }
                } else if (this.field5860 < 0) {
                    if (this.field5864 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5864) / var6;
                    if (var7 < this.field5854) {
                        this.field5864 += var6 * var7;
                        this.field5854 -= var7;
                        return;
                    }
                    this.field5864 += this.field5854 * var6;
                    this.field5854 = 0;
                } else {
                    if (this.field5864 < var4) {
                        return;
                    }
                    int var8 = (this.field5864 - var3) / var6;
                    if (var8 < this.field5854) {
                        this.field5864 -= var6 * var8;
                        this.field5854 -= var8;
                        return;
                    }
                    this.field5864 -= this.field5854 * var6;
                    this.field5854 = 0;
                }
            }
            if (this.field5860 < 0) {
                if (this.field5864 < 0) {
                    this.field5864 = -1;
                    this.method2471();
                    this.method2677(-22491);
                    return;
                }
            } else if (this.field5864 >= var5) {
                this.field5864 = var5;
                this.method2471();
                this.method2677(-22491);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIILfi;II)I")
    private static final int method2459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class392 arg10, int arg11, int arg12) {
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
        arg10.field5864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "()I")
    public final synchronized int method2460() {
        return this.field5863 == Integer.MIN_VALUE ? 0 : this.field5863;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I")
    private static final int method2461(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
    public final synchronized void method2462(int arg0) {
        if (this.field5860 < 0) {
            this.field5860 = -arg0;
        } else {
            this.field5860 = arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final synchronized void method2463(boolean arg0) {
        this.field5860 = (this.field5860 >>> 31) + (this.field5860 ^ this.field5860 >> 31);
        if (arg0) {
            this.field5860 = -this.field5860;
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "()Z")
    public final boolean method2464() {
        return this.field5856 != 0;
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "(I)V")
    private final synchronized void method2465(int arg0) {
        this.method2438(arg0, this.method2451());
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "()Z")
    public final boolean method2466() {
        return this.field5864 < 0 || this.field5864 >= ((class79) super.field3486).field1141.length << 8;
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "()I")
    public final synchronized int method2467() {
        return this.field5860 < 0 ? -this.field5860 : this.field5860;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
    public final int method1482() {
        int var1 = this.field5855 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5854 == 0) {
            var2 -= this.field5864 * var2 / (((class79) super.field3486).field1141.length << 8);
        } else if (this.field5854 >= 0) {
            var2 -= this.field5865 * var2 / ((class79) super.field3486).field1141.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method2468(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class392 arg11, int arg12, int arg13) {
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
        arg11.field5864 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([B[IIIIIIILfi;)I")
    private static final int method2469(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class392 arg8) {
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
        arg8.field5864 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)V")
    public final synchronized void method2470(int arg0, int arg1) {
        this.method2433(arg0, arg1, this.method2451());
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "()V")
    private final void method2471() {
        if (this.field5856 != 0) {
            if (this.field5863 == Integer.MIN_VALUE) {
                this.field5863 = 0;
            }
            this.field5856 = 0;
            this.method2449();
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfv;II)V")
    private class392(class79 arg0, int arg1, int arg2) {
        super.field3486 = arg0;
        this.field5865 = arg0.field1138;
        this.field5852 = arg0.field1140;
        this.field5862 = arg0.field1137;
        this.field5860 = arg1;
        this.field5863 = arg2;
        this.field5853 = 8192;
        this.field5864 = 0;
        this.method2449();
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lfv;III)V")
    private class392(class79 arg0, int arg1, int arg2, int arg3) {
        super.field3486 = arg0;
        this.field5865 = arg0.field1138;
        this.field5852 = arg0.field1140;
        this.field5862 = arg0.field1137;
        this.field5860 = arg1;
        this.field5863 = arg2;
        this.field5853 = arg3;
        this.field5864 = 0;
        this.method2449();
    }
}
