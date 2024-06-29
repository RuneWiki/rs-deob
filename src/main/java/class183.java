import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class183 extends class307 {

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "Z")
    private boolean field3054;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    private int field3057;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    private int field3048;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    private int field3051;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "()Z", line = 3)
    public final boolean method1348() {
        return this.field3053 < 0 || this.field3053 >= ((class227) this.field5239).field3818.length << 8;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([B[IIIIIIIILrl;)I", line = 6)
    private static final int method1349(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class183 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3048 += (var14 - arg3) * arg9.field3059;
        arg9.field3058 += (var14 - arg3) * arg9.field3051;
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
        arg9.field3047 = var12 >> 2;
        arg9.field3053 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "()V", line = 41)
    private final void method1350() {
        if (this.field3049 == 0) {
            return;
        }
        if (this.field3057 == Integer.MIN_VALUE) {
            this.field3057 = 0;
        }
        this.field3049 = 0;
        this.method1354();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[B[IIIIIIIILrl;II)I", line = 52)
    private static final int method1351(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class183 arg11, int arg12, int arg13) {
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
        arg11.field3053 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "([B[IIIIIIIILrl;)I", line = 84)
    private static final int method1352(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class183 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3048 += (var14 - arg3) * arg9.field3059;
        arg9.field3058 += (var14 - arg3) * arg9.field3051;
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
        arg9.field3047 = var12 >> 2;
        arg9.field3053 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 118)
    public final synchronized void method977(int arg0) {
        if (this.field3049 > 0) {
            if (arg0 >= this.field3049) {
                if (this.field3057 == Integer.MIN_VALUE) {
                    this.field3057 = 0;
                    this.field3047 = this.field3048 = this.field3058 = 0;
                    this.method1527(82);
                    arg0 = this.field3049;
                }
                this.field3049 = 0;
                this.method1354();
            } else {
                this.field3047 += this.field3056 * arg0;
                this.field3048 += this.field3059 * arg0;
                this.field3058 += this.field3051 * arg0;
                this.field3049 -= arg0;
            }
        }
        class227 var2 = (class227) this.field5239;
        int var3 = this.field3052 << 8;
        int var4 = this.field3055 << 8;
        int var5 = var2.field3818.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3050 = 0;
        }
        if (this.field3053 < 0) {
            if (this.field3060 <= 0) {
                this.method1350();
                this.method1527(-128);
                return;
            }
            this.field3053 = 0;
        }
        if (this.field3053 >= var5) {
            if (this.field3060 >= 0) {
                this.method1350();
                this.method1527(64);
                return;
            }
            this.field3053 = var5 - 1;
        }
        this.field3053 += this.field3060 * arg0;
        if (this.field3050 >= 0) {
            if (this.field3050 > 0) {
                if (this.field3054) {
                    label121: {
                        if (this.field3060 < 0) {
                            if (this.field3053 >= var3) {
                                return;
                            }
                            this.field3053 = var3 + var3 - this.field3053 - 1;
                            this.field3060 = -this.field3060;
                            if (--this.field3050 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3053 < var4) {
                                return;
                            }
                            this.field3053 = var4 + var4 - this.field3053 - 1;
                            this.field3060 = -this.field3060;
                            if (--this.field3050 == 0) {
                                break;
                            }
                            if (this.field3053 >= var3) {
                                return;
                            }
                            this.field3053 = var3 + var3 - this.field3053 - 1;
                            this.field3060 = -this.field3060;
                        } while (--this.field3050 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3060 < 0) {
                            if (this.field3053 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3053 - 1) / var6;
                            if (var7 >= this.field3050) {
                                this.field3053 += this.field3050 * var6;
                                this.field3050 = 0;
                                break label153;
                            }
                            this.field3053 += var6 * var7;
                            this.field3050 -= var7;
                        } else if (this.field3053 >= var4) {
                            int var8 = (this.field3053 - var3) / var6;
                            if (var8 >= this.field3050) {
                                this.field3053 -= this.field3050 * var6;
                                this.field3050 = 0;
                                break label153;
                            }
                            this.field3053 -= var6 * var8;
                            this.field3050 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3060 < 0) {
                if (this.field3053 < 0) {
                    this.field3053 = -1;
                    this.method1350();
                    this.method1527(98);
                }
            } else if (this.field3053 >= var5) {
                this.field3053 = var5;
                this.method1350();
                this.method1527(-102);
            }
        } else if (this.field3054) {
            if (this.field3060 < 0) {
                if (this.field3053 >= var3) {
                    return;
                }
                this.field3053 = var3 + var3 - this.field3053 - 1;
                this.field3060 = -this.field3060;
            }
            while (this.field3053 >= var4) {
                this.field3053 = var4 + var4 - this.field3053 - 1;
                this.field3060 = -this.field3060;
                if (this.field3053 >= var3) {
                    return;
                }
                this.field3053 = var3 + var3 - this.field3053 - 1;
                this.field3060 = -this.field3060;
            }
        } else if (this.field3060 < 0) {
            if (this.field3053 >= var3) {
                return;
            }
            this.field3053 = var4 - (var4 - 1 - this.field3053) % var6 - 1;
        } else if (this.field3053 >= var4) {
            this.field3053 = (this.field3053 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V", line = 336)
    public final synchronized void method1353(int arg0, int arg1) {
        this.method1386(arg0, arg1, this.method1358());
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "()V", line = 341)
    private final void method1354() {
        this.field3047 = this.field3057;
        this.field3048 = method1387(this.field3057, this.field3046);
        this.field3058 = method1384(this.field3057, this.field3046);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[B[IIIIIIILrl;II)I", line = 346)
    private static final int method1355(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class183 arg10, int arg11, int arg12) {
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
        arg10.field3053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIII)I", line = 375)
    private final int method1356(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3049 > 0) {
                int var6 = this.field3049 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3049 += arg1;
                if (this.field3060 == 256 && (this.field3053 & 0xFF) == 0) {
                    if (class26.field348) {
                        arg1 = method1360(0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, this.field3059, this.field3051, 0, var6, arg2, this);
                    } else {
                        arg1 = method1352(((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, this.field3056, 0, var6, arg2, this);
                    }
                } else if (class26.field348) {
                    arg1 = method1388(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, this.field3059, this.field3051, 0, var6, arg2, this, this.field3060, arg4);
                } else {
                    arg1 = method1365(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, this.field3056, 0, var6, arg2, this, this.field3060, arg4);
                }
                this.field3049 -= arg1;
                if (this.field3049 != 0) {
                    return arg1;
                }
                if (!this.method1359()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3060 == 256 && (this.field3053 & 0xFF) == 0) {
                if (class26.field348) {
                    return method1383(0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, 0, arg3, arg2, this);
                }
                return method1372(((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, 0, arg3, arg2, this);
            }
            if (class26.field348) {
                return method1374(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, 0, arg3, arg2, this, this.field3060, arg4);
            }
            return method1355(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, 0, arg3, arg2, this, this.field3060, arg4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 431)
    public final synchronized void method1357(int arg0) {
        int var2 = ((class227) this.field5239).field3818.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3053 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "()I", line = 441)
    public final synchronized int method1358() {
        return this.field3046 < 0 ? -1 : this.field3046;
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "()Z", line = 445)
    private final boolean method1359() {
        int var1 = this.field3057;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1387(var1, this.field3046);
            var2 = method1384(var1, this.field3046);
        }
        if (this.field3047 != var1 || this.field3048 != var3 || this.field3058 != var2) {
            if (this.field3047 < var1) {
                this.field3056 = 1;
                this.field3049 = var1 - this.field3047;
            } else if (this.field3047 > var1) {
                this.field3056 = -1;
                this.field3049 = this.field3047 - var1;
            } else {
                this.field3056 = 0;
            }
            if (this.field3048 < var3) {
                this.field3059 = 1;
                if (this.field3049 == 0 || this.field3049 > var3 - this.field3048) {
                    this.field3049 = var3 - this.field3048;
                }
            } else if (this.field3048 > var3) {
                this.field3059 = -1;
                if (this.field3049 == 0 || this.field3049 > this.field3048 - var3) {
                    this.field3049 = this.field3048 - var3;
                }
            } else {
                this.field3059 = 0;
            }
            if (this.field3058 < var2) {
                this.field3051 = 1;
                if (this.field3049 == 0 || this.field3049 > var2 - this.field3058) {
                    this.field3049 = var2 - this.field3058;
                }
            } else if (this.field3058 > var2) {
                this.field3051 = -1;
                if (this.field3049 == 0 || this.field3049 > this.field3058 - var2) {
                    this.field3049 = this.field3058 - var2;
                }
            } else {
                this.field3051 = 0;
            }
            return false;
        } else if (this.field3057 == Integer.MIN_VALUE) {
            this.field3057 = 0;
            this.field3047 = this.field3048 = this.field3058 = 0;
            this.method1527(-112);
            return true;
        } else {
            this.method1354();
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[B[IIIIIIIIIILrl;)I", line = 530)
    private static final int method1360(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class183 arg12) {
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
        arg12.field3047 += (var19 - arg4) * arg12.field3056;
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
        arg12.field3048 = var15 >> 2;
        arg12.field3058 = var16 >> 2;
        arg12.field3053 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()Loj;", line = 583)
    public final class307 method972() {
        return null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[B[IIIIIIIIIILrl;II)I", line = 586)
    private static final int method1361(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class183 arg13, int arg14, int arg15) {
        arg13.field3047 -= arg13.field3056 * arg5;
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
        arg13.field3047 += arg13.field3056 * var26;
        arg13.field3048 = arg6;
        arg13.field3058 = arg7;
        arg13.field3053 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([B[IIIIIIILrl;)I", line = 627)
    private static final int method1362(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class183 arg8) {
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
        arg8.field3053 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[B[IIIIIIIILrl;)I", line = 652)
    private static final int method1363(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class183 arg10) {
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
        arg10.field3053 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "([IIIII)I", line = 694)
    private final int method1364(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3049 > 0) {
                int var6 = this.field3049 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3049 += arg1;
                if (this.field3060 == -256 && (this.field3053 & 0xFF) == 0) {
                    if (class26.field348) {
                        arg1 = method1378(0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, this.field3059, this.field3051, 0, var6, arg2, this);
                    } else {
                        arg1 = method1349(((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, this.field3056, 0, var6, arg2, this);
                    }
                } else if (class26.field348) {
                    arg1 = method1361(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, this.field3059, this.field3051, 0, var6, arg2, this, this.field3060, arg4);
                } else {
                    arg1 = method1381(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, this.field3056, 0, var6, arg2, this, this.field3060, arg4);
                }
                this.field3049 -= arg1;
                if (this.field3049 != 0) {
                    return arg1;
                }
                if (!this.method1359()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3060 == -256 && (this.field3053 & 0xFF) == 0) {
                if (class26.field348) {
                    return method1363(0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, 0, arg3, arg2, this);
                }
                return method1362(((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, 0, arg3, arg2, this);
            }
            if (class26.field348) {
                return method1351(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3048, this.field3058, 0, arg3, arg2, this, this.field3060, arg4);
            }
            return method1379(0, 0, ((class227) this.field5239).field3818, arg0, this.field3053, arg1, this.field3047, 0, arg3, arg2, this, this.field3060, arg4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II[B[IIIIIIIILrl;II)I", line = 751)
    private static final int method1365(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class183 arg11, int arg12, int arg13) {
        arg11.field3048 -= arg11.field3059 * arg5;
        arg11.field3058 -= arg11.field3051 * arg5;
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
        arg11.field3048 += arg11.field3059 * arg5;
        arg11.field3058 += arg11.field3051 * arg5;
        arg11.field3047 = arg6;
        arg11.field3053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "()I", line = 784)
    public final synchronized int method1366() {
        return this.field3057 == Integer.MIN_VALUE ? 0 : this.field3057;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V", line = 790)
    private final synchronized void method1367(int arg0) {
        this.method1380(arg0, this.method1358());
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "()I", line = 795)
    public final synchronized int method1368() {
        return this.field3060 < 0 ? -this.field3060 : this.field3060;
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "()Z", line = 798)
    public final boolean method1369() {
        return this.field3049 != 0;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()I", line = 804)
    public final int method1370() {
        int var1 = this.field3047 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3050 == 0) {
            var2 -= this.field3053 * var2 / (((class227) this.field5239).field3818.length << 8);
        } else if (this.field3050 >= 0) {
            var2 -= this.field3052 * var2 / ((class227) this.field5239).field3818.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V", line = 816)
    public final synchronized void method1371(int arg0) {
        this.method1380(arg0 << 6, this.method1358());
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "([B[IIIIIIILrl;)I", line = 819)
    private static final int method1372(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class183 arg8) {
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
        arg8.field3053 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()Loj;", line = 844)
    public final class307 method967() {
        return null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ltd;III)Lrl;", line = 847)
    public static final class183 method1373(class227 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3818 == null || arg0.field3818.length == 0 ? null : new class183(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II[B[IIIIIIIILrl;II)I", line = 854)
    private static final int method1374(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class183 arg11, int arg12, int arg13) {
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
        arg11.field3053 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V", line = 887)
    public final synchronized void method1375(int arg0) {
        if (this.field3060 < 0) {
            this.field3060 = -arg0;
        } else {
            this.field3060 = arg0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(I)V", line = 894)
    public final synchronized void method1376(int arg0) {
        if (arg0 == 0) {
            this.method1367(0);
            this.method1527(56);
        } else if (this.field3048 == 0 && this.field3058 == 0) {
            this.field3049 = 0;
            this.field3057 = 0;
            this.field3047 = 0;
            this.method1527(-128);
        } else {
            int var2 = -this.field3047;
            if (this.field3047 > var2) {
                var2 = this.field3047;
            }
            if (-this.field3048 > var2) {
                var2 = -this.field3048;
            }
            if (this.field3048 > var2) {
                var2 = this.field3048;
            }
            if (-this.field3058 > var2) {
                var2 = -this.field3058;
            }
            if (this.field3058 > var2) {
                var2 = this.field3058;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3049 = arg0;
            this.field3057 = Integer.MIN_VALUE;
            this.field3056 = -this.field3047 / arg0;
            this.field3059 = -this.field3048 / arg0;
            this.field3051 = -this.field3058 / arg0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ltd;II)Lrl;", line = 939)
    public static final class183 method1377(class227 arg0, int arg1, int arg2) {
        return arg0.field3818 == null || arg0.field3818.length == 0 ? null : new class183(arg0, (int) ((long) arg0.field3819 * 256L * (long) arg1 / (long) (class99.field1644 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I[B[IIIIIIIIIILrl;)I", line = 945)
    private static final int method1378(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class183 arg12) {
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
        arg12.field3047 += (var19 - arg4) * arg12.field3056;
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
        arg12.field3048 = var15 >> 2;
        arg12.field3058 = var16 >> 2;
        arg12.field3053 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II[B[IIIIIIILrl;II)I", line = 998)
    private static final int method1379(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class183 arg10, int arg11, int arg12) {
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
        arg10.field3053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V", line = 1024)
    private final synchronized void method1380(int arg0, int arg1) {
        this.field3057 = arg0;
        this.field3046 = arg1;
        this.field3049 = 0;
        this.method1354();
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(II[B[IIIIIIIILrl;II)I", line = 1030)
    private static final int method1381(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class183 arg11, int arg12, int arg13) {
        arg11.field3048 -= arg11.field3059 * arg5;
        arg11.field3058 -= arg11.field3051 * arg5;
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
        arg11.field3048 += arg11.field3059 * arg5;
        arg11.field3058 += arg11.field3051 * arg5;
        arg11.field3047 = arg6;
        arg11.field3053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 1067)
    public final synchronized void method1382(boolean arg0) {
        this.field3060 = (this.field3060 >>> 31) + (this.field3060 ^ this.field3060 >> 31);
        if (arg0) {
            this.field3060 = -this.field3060;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I[B[IIIIIIIILrl;)I", line = 1075)
    private static final int method1383(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class183 arg10) {
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
        arg10.field3053 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I", line = 1114)
    private static final int method1384(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(I)V", line = 1119)
    public final synchronized void method1385(int arg0) {
        this.field3050 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([III)V", line = 1123)
    public final synchronized void method998(int[] arg0, int arg1, int arg2) {
        if (this.field3057 == 0 && this.field3049 == 0) {
            this.method977(arg2);
            return;
        }
        class227 var4 = (class227) this.field5239;
        int var5 = this.field3052 << 8;
        int var6 = this.field3055 << 8;
        int var7 = var4.field3818.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3050 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3053 < 0) {
            if (this.field3060 <= 0) {
                this.method1350();
                this.method1527(-54);
                return;
            }
            this.field3053 = 0;
        }
        if (this.field3053 >= var7) {
            if (this.field3060 >= 0) {
                this.method1350();
                this.method1527(46);
                return;
            }
            this.field3053 = var7 - 1;
        }
        if (this.field3050 >= 0) {
            if (this.field3050 > 0) {
                if (this.field3054) {
                    label131: {
                        if (this.field3060 < 0) {
                            var9 = this.method1364(arg0, arg1, var5, var10, var4.field3818[this.field3052]);
                            if (this.field3053 >= var5) {
                                return;
                            }
                            this.field3053 = var5 + var5 - this.field3053 - 1;
                            this.field3060 = -this.field3060;
                            if (--this.field3050 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1356(arg0, var9, var6, var10, var4.field3818[this.field3055 - 1]);
                            if (this.field3053 < var6) {
                                return;
                            }
                            this.field3053 = var6 + var6 - this.field3053 - 1;
                            this.field3060 = -this.field3060;
                            if (--this.field3050 == 0) {
                                break;
                            }
                            var9 = this.method1364(arg0, var9, var5, var10, var4.field3818[this.field3052]);
                            if (this.field3053 >= var5) {
                                return;
                            }
                            this.field3053 = var5 + var5 - this.field3053 - 1;
                            this.field3060 = -this.field3060;
                        } while (--this.field3050 != 0);
                    }
                } else if (this.field3060 < 0) {
                    while (true) {
                        var9 = this.method1364(arg0, var9, var5, var10, var4.field3818[this.field3055 - 1]);
                        if (this.field3053 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3053 - 1) / var8;
                        if (var12 >= this.field3050) {
                            this.field3053 += this.field3050 * var8;
                            this.field3050 = 0;
                            break;
                        }
                        this.field3053 += var8 * var12;
                        this.field3050 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1356(arg0, var9, var6, var10, var4.field3818[this.field3052]);
                        if (this.field3053 < var6) {
                            return;
                        }
                        int var13 = (this.field3053 - var5) / var8;
                        if (var13 >= this.field3050) {
                            this.field3053 -= this.field3050 * var8;
                            this.field3050 = 0;
                            break;
                        }
                        this.field3053 -= var8 * var13;
                        this.field3050 -= var13;
                    }
                }
            }
            if (this.field3060 < 0) {
                this.method1364(arg0, var9, 0, var10, 0);
                if (this.field3053 < 0) {
                    this.field3053 = -1;
                    this.method1350();
                    this.method1527(-92);
                }
            } else {
                this.method1356(arg0, var9, var7, var10, 0);
                if (this.field3053 >= var7) {
                    this.field3053 = var7;
                    this.method1350();
                    this.method1527(-82);
                }
            }
        } else if (this.field3054) {
            if (this.field3060 < 0) {
                var9 = this.method1364(arg0, arg1, var5, var10, var4.field3818[this.field3052]);
                if (this.field3053 >= var5) {
                    return;
                }
                this.field3053 = var5 + var5 - this.field3053 - 1;
                this.field3060 = -this.field3060;
            }
            while (true) {
                int var11 = this.method1356(arg0, var9, var6, var10, var4.field3818[this.field3055 - 1]);
                if (this.field3053 < var6) {
                    return;
                }
                this.field3053 = var6 + var6 - this.field3053 - 1;
                this.field3060 = -this.field3060;
                var9 = this.method1364(arg0, var11, var5, var10, var4.field3818[this.field3052]);
                if (this.field3053 >= var5) {
                    return;
                }
                this.field3053 = var5 + var5 - this.field3053 - 1;
                this.field3060 = -this.field3060;
            }
        } else if (this.field3060 < 0) {
            while (true) {
                var9 = this.method1364(arg0, var9, var5, var10, var4.field3818[this.field3055 - 1]);
                if (this.field3053 >= var5) {
                    return;
                }
                this.field3053 = var6 - (var6 - 1 - this.field3053) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1356(arg0, var9, var6, var10, var4.field3818[this.field3052]);
                if (this.field3053 < var6) {
                    return;
                }
                this.field3053 = (this.field3053 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()I", line = 1358)
    public final int method971() {
        return this.field3057 == 0 && this.field3049 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V", line = 1367)
    public final synchronized void method1386(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1380(arg1, arg2);
            return;
        }
        int var4 = method1387(arg1, arg2);
        int var5 = method1384(arg1, arg2);
        if (this.field3048 == var4 && this.field3058 == var5) {
            this.field3049 = 0;
            return;
        }
        int var6 = arg1 - this.field3047;
        if (this.field3047 - arg1 > var6) {
            var6 = this.field3047 - arg1;
        }
        if (var4 - this.field3048 > var6) {
            var6 = var4 - this.field3048;
        }
        if (this.field3048 - var4 > var6) {
            var6 = this.field3048 - var4;
        }
        if (var5 - this.field3058 > var6) {
            var6 = var5 - this.field3058;
        }
        if (this.field3058 - var5 > var6) {
            var6 = this.field3058 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3049 = arg0;
        this.field3057 = arg1;
        this.field3046 = arg2;
        this.field3056 = (arg1 - this.field3047) / arg0;
        this.field3059 = (var4 - this.field3048) / arg0;
        this.field3051 = (var5 - this.field3058) / arg0;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)I", line = 1413)
    private static final int method1387(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ltd;II)V", line = 1415)
    private class183(class227 arg0, int arg1, int arg2) {
        this.field5239 = arg0;
        this.field3052 = arg0.field3821;
        this.field3055 = arg0.field3820;
        this.field3054 = arg0.field3822;
        this.field3060 = arg1;
        this.field3057 = arg2;
        this.field3046 = 8192;
        this.field3053 = 0;
        this.method1354();
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ltd;III)V", line = 1426)
    private class183(class227 arg0, int arg1, int arg2, int arg3) {
        this.field5239 = arg0;
        this.field3052 = arg0.field3821;
        this.field3055 = arg0.field3820;
        this.field3054 = arg0.field3822;
        this.field3060 = arg1;
        this.field3057 = arg2;
        this.field3046 = arg3;
        this.field3053 = 0;
        this.method1354();
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II[B[IIIIIIIIIILrl;II)I", line = 1438)
    private static final int method1388(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class183 arg13, int arg14, int arg15) {
        arg13.field3047 -= arg13.field3056 * arg5;
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
        arg13.field3047 += arg13.field3056 * var27;
        arg13.field3048 = arg6;
        arg13.field3058 = arg7;
        arg13.field3053 = arg4;
        return var27;
    }
}
