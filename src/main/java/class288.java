import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class288 extends class156 {

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    private int field5057;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    private int field5051;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Z")
    private boolean field5049;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    private int field5048;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field5047;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    private int field5053;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    private int field5046;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    private int field5050;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    private int field5052;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    private int field5054;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    private int field5056;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    private int field5060;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public final synchronized void method1882(int arg0) {
        if (this.field5058 < 0) {
            this.field5058 = -arg0;
        } else {
            this.field5058 = arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public final synchronized void method1883(int arg0) {
        this.field5059 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public final synchronized void method1884(int arg0) {
        if (arg0 == 0) {
            this.method1900(0);
            this.method349(0);
        } else if (this.field5056 == 0 && this.field5055 == 0) {
            this.field5052 = 0;
            this.field5048 = 0;
            this.field5060 = 0;
            this.method349(0);
        } else {
            int var2 = -this.field5060;
            if (this.field5060 > var2) {
                var2 = this.field5060;
            }
            if (-this.field5056 > var2) {
                var2 = -this.field5056;
            }
            if (this.field5056 > var2) {
                var2 = this.field5056;
            }
            if (-this.field5055 > var2) {
                var2 = -this.field5055;
            }
            if (this.field5055 > var2) {
                var2 = this.field5055;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5052 = arg0;
            this.field5048 = Integer.MIN_VALUE;
            this.field5046 = -this.field5060 / arg0;
            this.field5050 = -this.field5056 / arg0;
            this.field5054 = -this.field5055 / arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([III)V")
    public final synchronized void method995(int[] arg0, int arg1, int arg2) {
        if (this.field5048 == 0 && this.field5052 == 0) {
            this.method996(arg2);
        } else {
            class216 var4 = (class216) super.field2803;
            int var5 = this.field5057 << 8;
            int var6 = this.field5051 << 8;
            int var7 = var4.field3963.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5059 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5053 < 0) {
                if (this.field5058 <= 0) {
                    this.method1891();
                    this.method349(0);
                    return;
                }
                this.field5053 = 0;
            }
            if (this.field5053 >= var7) {
                if (this.field5058 >= 0) {
                    this.method1891();
                    this.method349(0);
                    return;
                }
                this.field5053 = var7 - 1;
            }
            if (this.field5059 < 0) {
                if (this.field5049) {
                    if (this.field5058 < 0) {
                        var9 = this.method1888(arg0, arg1, var5, var10, var4.field3963[this.field5057]);
                        if (this.field5053 >= var5) {
                            return;
                        }
                        this.field5053 = var5 + var5 - 1 - this.field5053;
                        this.field5058 = -this.field5058;
                    }
                    while (true) {
                        int var11 = this.method1914(arg0, var9, var6, var10, var4.field3963[this.field5051 - 1]);
                        if (this.field5053 < var6) {
                            return;
                        }
                        this.field5053 = var6 + var6 - 1 - this.field5053;
                        this.field5058 = -this.field5058;
                        var9 = this.method1888(arg0, var11, var5, var10, var4.field3963[this.field5057]);
                        if (this.field5053 >= var5) {
                            return;
                        }
                        this.field5053 = var5 + var5 - 1 - this.field5053;
                        this.field5058 = -this.field5058;
                    }
                } else if (this.field5058 < 0) {
                    while (true) {
                        var9 = this.method1888(arg0, var9, var5, var10, var4.field3963[this.field5051 - 1]);
                        if (this.field5053 >= var5) {
                            return;
                        }
                        this.field5053 = var6 - 1 - (var6 - 1 - this.field5053) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1914(arg0, var9, var6, var10, var4.field3963[this.field5057]);
                        if (this.field5053 < var6) {
                            return;
                        }
                        this.field5053 = (this.field5053 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5059 > 0) {
                    if (this.field5049) {
                        label130: {
                            if (this.field5058 < 0) {
                                var9 = this.method1888(arg0, arg1, var5, var10, var4.field3963[this.field5057]);
                                if (this.field5053 >= var5) {
                                    return;
                                }
                                this.field5053 = var5 + var5 - 1 - this.field5053;
                                this.field5058 = -this.field5058;
                                if (--this.field5059 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1914(arg0, var9, var6, var10, var4.field3963[this.field5051 - 1]);
                                if (this.field5053 < var6) {
                                    return;
                                }
                                this.field5053 = var6 + var6 - 1 - this.field5053;
                                this.field5058 = -this.field5058;
                                if (--this.field5059 == 0) {
                                    break;
                                }
                                var9 = this.method1888(arg0, var9, var5, var10, var4.field3963[this.field5057]);
                                if (this.field5053 >= var5) {
                                    return;
                                }
                                this.field5053 = var5 + var5 - 1 - this.field5053;
                                this.field5058 = -this.field5058;
                            } while (--this.field5059 != 0);
                        }
                    } else if (this.field5058 < 0) {
                        while (true) {
                            var9 = this.method1888(arg0, var9, var5, var10, var4.field3963[this.field5051 - 1]);
                            if (this.field5053 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5053) / var8;
                            if (var12 >= this.field5059) {
                                this.field5053 += this.field5059 * var8;
                                this.field5059 = 0;
                                break;
                            }
                            this.field5053 += var8 * var12;
                            this.field5059 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1914(arg0, var9, var6, var10, var4.field3963[this.field5057]);
                            if (this.field5053 < var6) {
                                return;
                            }
                            int var13 = (this.field5053 - var5) / var8;
                            if (var13 >= this.field5059) {
                                this.field5053 -= this.field5059 * var8;
                                this.field5059 = 0;
                                break;
                            }
                            this.field5053 -= var8 * var13;
                            this.field5059 -= var13;
                        }
                    }
                }
                if (this.field5058 < 0) {
                    this.method1888(arg0, var9, 0, var10, 0);
                    if (this.field5053 < 0) {
                        this.field5053 = -1;
                        this.method1891();
                        this.method349(0);
                        return;
                    }
                } else {
                    this.method1914(arg0, var9, var7, var10, 0);
                    if (this.field5053 >= var7) {
                        this.field5053 = var7;
                        this.method1891();
                        this.method349(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([B[IIIIIIILrc;)I")
    private static final int method1885(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class288 arg8) {
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
        arg8.field5053 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lce;III)Lrc;")
    public static final class288 method1886(class216 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3963 != null && arg0.field3963.length != 0 ? new class288(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([B[IIIIIIILrc;)I")
    private static final int method1887(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class288 arg8) {
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
        arg8.field5053 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIII)I")
    private final int method1888(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5052 <= 0) {
                if (this.field5058 == -256 && (this.field5053 & 255) == 0) {
                    if (class83.field1509) {
                        return method1921(0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, 0, arg3, arg2, this);
                    }
                    return method1887(((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, 0, arg3, arg2, this);
                }
                if (class83.field1509) {
                    return method1917(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, 0, arg3, arg2, this, this.field5058, arg4);
                }
                return method1910(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, 0, arg3, arg2, this, this.field5058, arg4);
            }
            int var6 = this.field5052 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5052 += arg1;
            if (this.field5058 == -256 && (this.field5053 & 255) == 0) {
                if (class83.field1509) {
                    arg1 = method1909(0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, this.field5050, this.field5054, 0, var6, arg2, this);
                } else {
                    arg1 = method1906(((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, this.field5046, 0, var6, arg2, this);
                }
            } else if (class83.field1509) {
                arg1 = method1919(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, this.field5050, this.field5054, 0, var6, arg2, this, this.field5058, arg4);
            } else {
                arg1 = method1893(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, this.field5046, 0, var6, arg2, this, this.field5058, arg4);
            }
            this.field5052 -= arg1;
            if (this.field5052 != 0) {
                return arg1;
            }
        } while (!this.method1896());
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[B[IIIIIIIIIILrc;)I")
    private static final int method1889(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class288 arg12) {
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
        arg12.field5060 += (var19 - arg4) * arg12.field5046;
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
        arg12.field5056 = var15 >> 2;
        arg12.field5055 = var16 >> 2;
        arg12.field5053 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([B[IIIIIIIILrc;)I")
    private static final int method1890(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class288 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5056 += (var14 - arg3) * arg9.field5050;
        arg9.field5055 += (var14 - arg3) * arg9.field5054;
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
        arg9.field5060 = var12 >> 2;
        arg9.field5053 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "()V")
    private final void method1891() {
        if (this.field5052 != 0) {
            if (this.field5048 == Integer.MIN_VALUE) {
                this.field5048 = 0;
            }
            this.field5052 = 0;
            this.method1912();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
    public final int method1024() {
        int var1 = this.field5060 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5059 == 0) {
            var2 -= this.field5053 * var2 / (((class216) super.field2803).field3963.length << 8);
        } else if (this.field5059 >= 0) {
            var2 -= this.field5057 * var2 / ((class216) super.field2803).field3963.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public final synchronized void method1892(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1915(arg1, arg2);
        } else {
            int var4 = method1898(arg1, arg2);
            int var5 = method1908(arg1, arg2);
            if (this.field5056 == var4 && this.field5055 == var5) {
                this.field5052 = 0;
            } else {
                int var6 = arg1 - this.field5060;
                if (this.field5060 - arg1 > var6) {
                    var6 = this.field5060 - arg1;
                }
                if (var4 - this.field5056 > var6) {
                    var6 = var4 - this.field5056;
                }
                if (this.field5056 - var4 > var6) {
                    var6 = this.field5056 - var4;
                }
                if (var5 - this.field5055 > var6) {
                    var6 = var5 - this.field5055;
                }
                if (this.field5055 - var5 > var6) {
                    var6 = this.field5055 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5052 = arg0;
                this.field5048 = arg1;
                this.field5047 = arg2;
                this.field5046 = (arg1 - this.field5060) / arg0;
                this.field5050 = (var4 - this.field5056) / arg0;
                this.field5054 = (var5 - this.field5055) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()Laf;")
    public final class156 method1004() {
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[B[IIIIIIIILrc;II)I")
    private static final int method1893(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class288 arg11, int arg12, int arg13) {
        arg11.field5056 -= arg11.field5050 * arg5;
        arg11.field5055 -= arg11.field5054 * arg5;
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
        arg11.field5056 += arg11.field5050 * arg5;
        arg11.field5055 += arg11.field5054 * arg5;
        arg11.field5060 = arg6;
        arg11.field5053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public final synchronized void method1894(int arg0, int arg1) {
        this.method1892(arg0, arg1, this.method1913());
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "()I")
    public final synchronized int method1895() {
        return this.field5048 == Integer.MIN_VALUE ? 0 : this.field5048;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "()Z")
    private final boolean method1896() {
        int var1 = this.field5048;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1898(var1, this.field5047);
            var2 = method1908(var1, this.field5047);
        }
        if (this.field5060 == var1 && this.field5056 == var3 && this.field5055 == var2) {
            if (this.field5048 == Integer.MIN_VALUE) {
                this.field5048 = 0;
                this.field5060 = this.field5056 = this.field5055 = 0;
                this.method349(0);
                return true;
            } else {
                this.method1912();
                return false;
            }
        } else {
            if (this.field5060 < var1) {
                this.field5046 = 1;
                this.field5052 = var1 - this.field5060;
            } else if (this.field5060 > var1) {
                this.field5046 = -1;
                this.field5052 = this.field5060 - var1;
            } else {
                this.field5046 = 0;
            }
            if (this.field5056 < var3) {
                this.field5050 = 1;
                if (this.field5052 == 0 || this.field5052 > var3 - this.field5056) {
                    this.field5052 = var3 - this.field5056;
                }
            } else if (this.field5056 > var3) {
                this.field5050 = -1;
                if (this.field5052 == 0 || this.field5052 > this.field5056 - var3) {
                    this.field5052 = this.field5056 - var3;
                }
            } else {
                this.field5050 = 0;
            }
            if (this.field5055 < var2) {
                this.field5054 = 1;
                if (this.field5052 == 0 || this.field5052 > var2 - this.field5055) {
                    this.field5052 = var2 - this.field5055;
                }
            } else if (this.field5055 > var2) {
                this.field5054 = -1;
                if (this.field5052 == 0 || this.field5052 > this.field5055 - var2) {
                    this.field5052 = this.field5055 - var2;
                }
            } else {
                this.field5054 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lce;II)Lrc;")
    public static final class288 method1897(class216 arg0, int arg1, int arg2) {
        return arg0.field3963 != null && arg0.field3963.length != 0 ? new class288(arg0, (int) ((long) arg0.field3964 * 256L * (long) arg1 / (long) (class190.field3494 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
    private static final int method1898(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "()Z")
    public final boolean method1899() {
        return this.field5052 != 0;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    private final synchronized void method1900(int arg0) {
        this.method1915(arg0, this.method1913());
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
    public final synchronized void method1901(int arg0) {
        int var2 = ((class216) super.field2803).field3963.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5053 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II[B[IIIIIIIILrc;II)I")
    private static final int method1902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class288 arg11, int arg12, int arg13) {
        arg11.field5056 -= arg11.field5050 * arg5;
        arg11.field5055 -= arg11.field5054 * arg5;
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
        arg11.field5056 += arg11.field5050 * arg5;
        arg11.field5055 += arg11.field5054 * arg5;
        arg11.field5060 = arg6;
        arg11.field5053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "()Laf;")
    public final class156 method994() {
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public final synchronized void method1903(boolean arg0) {
        this.field5058 = (this.field5058 >>> 31) + (this.field5058 ^ this.field5058 >> 31);
        if (arg0) {
            this.field5058 = -this.field5058;
        }
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V")
    public final synchronized void method1904(int arg0) {
        this.method1915(arg0 << 6, this.method1913());
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "()Z")
    public final boolean method1905() {
        return this.field5053 < 0 || this.field5053 >= ((class216) super.field2803).field3963.length << 8;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([B[IIIIIIIILrc;)I")
    private static final int method1906(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class288 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5056 += (var14 - arg3) * arg9.field5050;
        arg9.field5055 += (var14 - arg3) * arg9.field5054;
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
        arg9.field5060 = var12 >> 2;
        arg9.field5053 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II[B[IIIIIIIILrc;II)I")
    private static final int method1907(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class288 arg11, int arg12, int arg13) {
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
        arg11.field5053 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)I")
    private static final int method1908(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public final synchronized void method996(int arg0) {
        if (this.field5052 > 0) {
            if (arg0 >= this.field5052) {
                if (this.field5048 == Integer.MIN_VALUE) {
                    this.field5048 = 0;
                    this.field5060 = this.field5056 = this.field5055 = 0;
                    this.method349(0);
                    arg0 = this.field5052;
                }
                this.field5052 = 0;
                this.method1912();
            } else {
                this.field5060 += this.field5046 * arg0;
                this.field5056 += this.field5050 * arg0;
                this.field5055 += this.field5054 * arg0;
                this.field5052 -= arg0;
            }
        }
        class216 var2 = (class216) super.field2803;
        int var3 = this.field5057 << 8;
        int var4 = this.field5051 << 8;
        int var5 = var2.field3963.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5059 = 0;
        }
        if (this.field5053 < 0) {
            if (this.field5058 <= 0) {
                this.method1891();
                this.method349(0);
                return;
            }
            this.field5053 = 0;
        }
        if (this.field5053 >= var5) {
            if (this.field5058 >= 0) {
                this.method1891();
                this.method349(0);
                return;
            }
            this.field5053 = var5 - 1;
        }
        this.field5053 += this.field5058 * arg0;
        if (this.field5059 < 0) {
            if (!this.field5049) {
                if (this.field5058 < 0) {
                    if (this.field5053 < var3) {
                        this.field5053 = var4 - 1 - (var4 - 1 - this.field5053) % var6;
                    }
                } else if (this.field5053 >= var4) {
                    this.field5053 = (this.field5053 - var3) % var6 + var3;
                }
            } else {
                if (this.field5058 < 0) {
                    if (this.field5053 >= var3) {
                        return;
                    }
                    this.field5053 = var3 + var3 - 1 - this.field5053;
                    this.field5058 = -this.field5058;
                }
                while (this.field5053 >= var4) {
                    this.field5053 = var4 + var4 - 1 - this.field5053;
                    this.field5058 = -this.field5058;
                    if (this.field5053 >= var3) {
                        return;
                    }
                    this.field5053 = var3 + var3 - 1 - this.field5053;
                    this.field5058 = -this.field5058;
                }
            }
        } else {
            if (this.field5059 > 0) {
                if (this.field5049) {
                    label125: {
                        if (this.field5058 < 0) {
                            if (this.field5053 >= var3) {
                                return;
                            }
                            this.field5053 = var3 + var3 - 1 - this.field5053;
                            this.field5058 = -this.field5058;
                            if (--this.field5059 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5053 < var4) {
                                return;
                            }
                            this.field5053 = var4 + var4 - 1 - this.field5053;
                            this.field5058 = -this.field5058;
                            if (--this.field5059 == 0) {
                                break;
                            }
                            if (this.field5053 >= var3) {
                                return;
                            }
                            this.field5053 = var3 + var3 - 1 - this.field5053;
                            this.field5058 = -this.field5058;
                        } while (--this.field5059 != 0);
                    }
                } else if (this.field5058 < 0) {
                    if (this.field5053 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5053) / var6;
                    if (var7 < this.field5059) {
                        this.field5053 += var6 * var7;
                        this.field5059 -= var7;
                        return;
                    }
                    this.field5053 += this.field5059 * var6;
                    this.field5059 = 0;
                } else {
                    if (this.field5053 < var4) {
                        return;
                    }
                    int var8 = (this.field5053 - var3) / var6;
                    if (var8 < this.field5059) {
                        this.field5053 -= var6 * var8;
                        this.field5059 -= var8;
                        return;
                    }
                    this.field5053 -= this.field5059 * var6;
                    this.field5059 = 0;
                }
            }
            if (this.field5058 < 0) {
                if (this.field5053 < 0) {
                    this.field5053 = -1;
                    this.method1891();
                    this.method349(0);
                    return;
                }
            } else if (this.field5053 >= var5) {
                this.field5053 = var5;
                this.method1891();
                this.method349(0);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I[B[IIIIIIIIIILrc;)I")
    private static final int method1909(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class288 arg12) {
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
        arg12.field5060 += (var19 - arg4) * arg12.field5046;
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
        arg12.field5056 = var15 >> 2;
        arg12.field5055 = var16 >> 2;
        arg12.field5053 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[B[IIIIIIILrc;II)I")
    private static final int method1910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class288 arg10, int arg11, int arg12) {
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
        arg10.field5053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II[B[IIIIIIILrc;II)I")
    private static final int method1911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class288 arg10, int arg11, int arg12) {
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
        arg10.field5053 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "()V")
    private final void method1912() {
        this.field5060 = this.field5048;
        this.field5056 = method1898(this.field5048, this.field5047);
        this.field5055 = method1908(this.field5048, this.field5047);
    }

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "()I")
    public final synchronized int method1913() {
        return this.field5047 < 0 ? -1 : this.field5047;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([IIIII)I")
    private final int method1914(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5052 <= 0) {
                if (this.field5058 == 256 && (this.field5053 & 255) == 0) {
                    if (class83.field1509) {
                        return method1916(0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, 0, arg3, arg2, this);
                    }
                    return method1885(((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, 0, arg3, arg2, this);
                }
                if (class83.field1509) {
                    return method1907(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, 0, arg3, arg2, this, this.field5058, arg4);
                }
                return method1911(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, 0, arg3, arg2, this, this.field5058, arg4);
            }
            int var6 = this.field5052 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5052 += arg1;
            if (this.field5058 == 256 && (this.field5053 & 255) == 0) {
                if (class83.field1509) {
                    arg1 = method1889(0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, this.field5050, this.field5054, 0, var6, arg2, this);
                } else {
                    arg1 = method1890(((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, this.field5046, 0, var6, arg2, this);
                }
            } else if (class83.field1509) {
                arg1 = method1920(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5056, this.field5055, this.field5050, this.field5054, 0, var6, arg2, this, this.field5058, arg4);
            } else {
                arg1 = method1902(0, 0, ((class216) super.field2803).field3963, arg0, this.field5053, arg1, this.field5060, this.field5046, 0, var6, arg2, this, this.field5058, arg4);
            }
            this.field5052 -= arg1;
            if (this.field5052 != 0) {
                return arg1;
            }
        } while (!this.method1896());
        return arg3;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V")
    private final synchronized void method1915(int arg0, int arg1) {
        this.field5048 = arg0;
        this.field5047 = arg1;
        this.field5052 = 0;
        this.method1912();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[B[IIIIIIIILrc;)I")
    private static final int method1916(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class288 arg10) {
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
        arg10.field5053 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II[B[IIIIIIIILrc;II)I")
    private static final int method1917(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class288 arg11, int arg12, int arg13) {
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
        arg11.field5053 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "()I")
    public final synchronized int method1918() {
        return this.field5058 < 0 ? -this.field5058 : this.field5058;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[B[IIIIIIIIIILrc;II)I")
    private static final int method1919(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class288 arg13, int arg14, int arg15) {
        arg13.field5060 -= arg13.field5046 * arg5;
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
        arg13.field5060 += arg13.field5046 * var22;
        arg13.field5056 = arg6;
        arg13.field5055 = arg7;
        arg13.field5053 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "()I")
    public final int method993() {
        return this.field5048 == 0 && this.field5052 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II[B[IIIIIIIIIILrc;II)I")
    private static final int method1920(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class288 arg13, int arg14, int arg15) {
        arg13.field5060 -= arg13.field5046 * arg5;
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
        arg13.field5060 += arg13.field5046 * var22;
        arg13.field5056 = arg6;
        arg13.field5055 = arg7;
        arg13.field5053 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I[B[IIIIIIIILrc;)I")
    private static final int method1921(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class288 arg10) {
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
        arg10.field5053 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lce;II)V")
    private class288(class216 arg0, int arg1, int arg2) {
        super.field2803 = arg0;
        this.field5057 = arg0.field3962;
        this.field5051 = arg0.field3960;
        this.field5049 = arg0.field3961;
        this.field5058 = arg1;
        this.field5048 = arg2;
        this.field5047 = 8192;
        this.field5053 = 0;
        this.method1912();
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lce;III)V")
    private class288(class216 arg0, int arg1, int arg2, int arg3) {
        super.field2803 = arg0;
        this.field5057 = arg0.field3962;
        this.field5051 = arg0.field3960;
        this.field5049 = arg0.field3961;
        this.field5058 = arg1;
        this.field5048 = arg2;
        this.field5047 = arg3;
        this.field5053 = 0;
        this.method1912();
    }
}
