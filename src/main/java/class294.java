import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class294 extends class418 {

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    private int field4123;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    private int field4115;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "Z")
    private boolean field4122;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    private int field4112;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    private int field4114;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    private int field4118;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    private int field4113;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    private int field4119;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    private int field4120;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    private int field4124;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "()V")
    private final void method1881() {
        if (this.field4124 != 0) {
            if (this.field4112 == Integer.MIN_VALUE) {
                this.field4112 = 0;
            }
            this.field4124 = 0;
            this.method1886();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[B[IIIIIIIILtf;II)I")
    private static final int method1882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
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
        arg11.field4118 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([B[IIIIIIILtf;)I")
    private static final int method1883(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8) {
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
        arg8.field4118 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[B[IIIIIIIIIILtf;II)I")
    private static final int method1884(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class294 arg13, int arg14, int arg15) {
        arg13.field4110 -= arg13.field4120 * arg5;
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
        arg13.field4110 += arg13.field4120 * var22;
        arg13.field4116 = arg6;
        arg13.field4113 = arg7;
        arg13.field4118 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([IIIII)I")
    private final int method1885(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4124 <= 0) {
                if (this.field4121 == -256 && (this.field4118 & 255) == 0) {
                    if (class390.field5446) {
                        return method1912(0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, 0, arg3, arg2, this);
                    }
                    return method1883(((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, 0, arg3, arg2, this);
                }
                if (class390.field5446) {
                    return method1903(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, 0, arg3, arg2, this, this.field4121, arg4);
                }
                return method1887(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, 0, arg3, arg2, this, this.field4121, arg4);
            }
            int var6 = this.field4124 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4124 += arg1;
            if (this.field4121 == -256 && (this.field4118 & 255) == 0) {
                if (class390.field5446) {
                    arg1 = method1910(0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, this.field4117, this.field4111, 0, var6, arg2, this);
                } else {
                    arg1 = method1913(((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, this.field4120, 0, var6, arg2, this);
                }
            } else if (class390.field5446) {
                arg1 = method1915(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, this.field4117, this.field4111, 0, var6, arg2, this, this.field4121, arg4);
            } else {
                arg1 = method1909(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, this.field4120, 0, var6, arg2, this, this.field4121, arg4);
            }
            this.field4124 -= arg1;
            if (this.field4124 != 0) {
                return arg1;
            }
        } while (!this.method1893());
        return arg3;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()Lep;")
    public final class418 method1693() {
        return null;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "()V")
    private final void method1886() {
        this.field4110 = this.field4112;
        this.field4116 = method1897(this.field4112, this.field4114);
        this.field4113 = method1900(this.field4112, this.field4114);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[B[IIIIIIILtf;II)I")
    private static final int method1887(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10, int arg11, int arg12) {
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
        arg10.field4118 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public final synchronized void method1888(int arg0) {
        this.field4119 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public final synchronized void method1889(boolean arg0) {
        this.field4121 = (this.field4121 >>> 31) + (this.field4121 ^ this.field4121 >> 31);
        if (arg0) {
            this.field4121 = -this.field4121;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public final synchronized void method1890(int arg0) {
        int var2 = ((class690) super.field5865).field9711.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4118 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([B[IIIIIIIILtf;)I")
    private static final int method1891(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class294 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4116 += (var14 - arg3) * arg9.field4117;
        arg9.field4113 += (var14 - arg3) * arg9.field4111;
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
        arg9.field4110 = var12 >> 2;
        arg9.field4118 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
    public final int method1673() {
        return this.field4112 == 0 && this.field4124 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V")
    private final synchronized void method1892(int arg0) {
        this.method1920(arg0, this.method1894());
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "()Z")
    private final boolean method1893() {
        int var1 = this.field4112;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1897(var1, this.field4114);
            var2 = method1900(var1, this.field4114);
        }
        if (this.field4110 == var1 && this.field4116 == var3 && this.field4113 == var2) {
            if (this.field4112 == Integer.MIN_VALUE) {
                this.field4112 = 0;
                this.field4110 = this.field4116 = this.field4113 = 0;
                this.method3617(1);
                return true;
            } else {
                this.method1886();
                return false;
            }
        } else {
            if (this.field4110 < var1) {
                this.field4120 = 1;
                this.field4124 = var1 - this.field4110;
            } else if (this.field4110 > var1) {
                this.field4120 = -1;
                this.field4124 = this.field4110 - var1;
            } else {
                this.field4120 = 0;
            }
            if (this.field4116 < var3) {
                this.field4117 = 1;
                if (this.field4124 == 0 || this.field4124 > var3 - this.field4116) {
                    this.field4124 = var3 - this.field4116;
                }
            } else if (this.field4116 > var3) {
                this.field4117 = -1;
                if (this.field4124 == 0 || this.field4124 > this.field4116 - var3) {
                    this.field4124 = this.field4116 - var3;
                }
            } else {
                this.field4117 = 0;
            }
            if (this.field4113 < var2) {
                this.field4111 = 1;
                if (this.field4124 == 0 || this.field4124 > var2 - this.field4113) {
                    this.field4124 = var2 - this.field4113;
                }
            } else if (this.field4113 > var2) {
                this.field4111 = -1;
                if (this.field4124 == 0 || this.field4124 > this.field4113 - var2) {
                    this.field4124 = this.field4113 - var2;
                }
            } else {
                this.field4111 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "()I")
    public final synchronized int method1894() {
        return this.field4114 < 0 ? -1 : this.field4114;
    }

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "()I")
    public final synchronized int method1895() {
        return this.field4112 == Integer.MIN_VALUE ? 0 : this.field4112;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lcj;III)Ltf;")
    public static final class294 method1896(class690 arg0, int arg1, int arg2, int arg3) {
        return arg0.field9711 != null && arg0.field9711.length != 0 ? new class294(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
    public final synchronized void method1687(int[] arg0, int arg1, int arg2) {
        if (this.field4112 == 0 && this.field4124 == 0) {
            this.method1663(arg2);
        } else {
            class690 var4 = (class690) super.field5865;
            int var5 = this.field4123 << 8;
            int var6 = this.field4115 << 8;
            int var7 = var4.field9711.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4119 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4118 < 0) {
                if (this.field4121 <= 0) {
                    this.method1881();
                    this.method3617(1);
                    return;
                }
                this.field4118 = 0;
            }
            if (this.field4118 >= var7) {
                if (this.field4121 >= 0) {
                    this.method1881();
                    this.method3617(1);
                    return;
                }
                this.field4118 = var7 - 1;
            }
            if (this.field4119 < 0) {
                if (this.field4122) {
                    if (this.field4121 < 0) {
                        var9 = this.method1885(arg0, arg1, var5, var10, var4.field9711[this.field4123]);
                        if (this.field4118 >= var5) {
                            return;
                        }
                        this.field4118 = var5 + var5 - 1 - this.field4118;
                        this.field4121 = -this.field4121;
                    }
                    while (true) {
                        int var11 = this.method1916(arg0, var9, var6, var10, var4.field9711[this.field4115 - 1]);
                        if (this.field4118 < var6) {
                            return;
                        }
                        this.field4118 = var6 + var6 - 1 - this.field4118;
                        this.field4121 = -this.field4121;
                        var9 = this.method1885(arg0, var11, var5, var10, var4.field9711[this.field4123]);
                        if (this.field4118 >= var5) {
                            return;
                        }
                        this.field4118 = var5 + var5 - 1 - this.field4118;
                        this.field4121 = -this.field4121;
                    }
                } else if (this.field4121 < 0) {
                    while (true) {
                        var9 = this.method1885(arg0, var9, var5, var10, var4.field9711[this.field4115 - 1]);
                        if (this.field4118 >= var5) {
                            return;
                        }
                        this.field4118 = var6 - 1 - (var6 - 1 - this.field4118) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1916(arg0, var9, var6, var10, var4.field9711[this.field4123]);
                        if (this.field4118 < var6) {
                            return;
                        }
                        this.field4118 = (this.field4118 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4119 > 0) {
                    if (this.field4122) {
                        label130: {
                            if (this.field4121 < 0) {
                                var9 = this.method1885(arg0, arg1, var5, var10, var4.field9711[this.field4123]);
                                if (this.field4118 >= var5) {
                                    return;
                                }
                                this.field4118 = var5 + var5 - 1 - this.field4118;
                                this.field4121 = -this.field4121;
                                if (--this.field4119 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1916(arg0, var9, var6, var10, var4.field9711[this.field4115 - 1]);
                                if (this.field4118 < var6) {
                                    return;
                                }
                                this.field4118 = var6 + var6 - 1 - this.field4118;
                                this.field4121 = -this.field4121;
                                if (--this.field4119 == 0) {
                                    break;
                                }
                                var9 = this.method1885(arg0, var9, var5, var10, var4.field9711[this.field4123]);
                                if (this.field4118 >= var5) {
                                    return;
                                }
                                this.field4118 = var5 + var5 - 1 - this.field4118;
                                this.field4121 = -this.field4121;
                            } while (--this.field4119 != 0);
                        }
                    } else if (this.field4121 < 0) {
                        while (true) {
                            var9 = this.method1885(arg0, var9, var5, var10, var4.field9711[this.field4115 - 1]);
                            if (this.field4118 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4118) / var8;
                            if (var12 >= this.field4119) {
                                this.field4118 += this.field4119 * var8;
                                this.field4119 = 0;
                                break;
                            }
                            this.field4118 += var8 * var12;
                            this.field4119 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1916(arg0, var9, var6, var10, var4.field9711[this.field4123]);
                            if (this.field4118 < var6) {
                                return;
                            }
                            int var13 = (this.field4118 - var5) / var8;
                            if (var13 >= this.field4119) {
                                this.field4118 -= this.field4119 * var8;
                                this.field4119 = 0;
                                break;
                            }
                            this.field4118 -= var8 * var13;
                            this.field4119 -= var13;
                        }
                    }
                }
                if (this.field4121 < 0) {
                    this.method1885(arg0, var9, 0, var10, 0);
                    if (this.field4118 < 0) {
                        this.field4118 = -1;
                        this.method1881();
                        this.method3617(1);
                        return;
                    }
                } else {
                    this.method1916(arg0, var9, var7, var10, 0);
                    if (this.field4118 >= var7) {
                        this.field4118 = var7;
                        this.method1881();
                        this.method3617(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    private static final int method1897(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)V")
    public final synchronized void method1898(int arg0) {
        this.method1920(this.method1895(), arg0);
    }

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "()Z")
    public final boolean method1899() {
        return this.field4118 < 0 || this.field4118 >= ((class690) super.field5865).field9711.length << 8;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final synchronized void method1663(int arg0) {
        if (this.field4124 > 0) {
            if (arg0 >= this.field4124) {
                if (this.field4112 == Integer.MIN_VALUE) {
                    this.field4112 = 0;
                    this.field4110 = this.field4116 = this.field4113 = 0;
                    this.method3617(1);
                    arg0 = this.field4124;
                }
                this.field4124 = 0;
                this.method1886();
            } else {
                this.field4110 += this.field4120 * arg0;
                this.field4116 += this.field4117 * arg0;
                this.field4113 += this.field4111 * arg0;
                this.field4124 -= arg0;
            }
        }
        class690 var2 = (class690) super.field5865;
        int var3 = this.field4123 << 8;
        int var4 = this.field4115 << 8;
        int var5 = var2.field9711.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4119 = 0;
        }
        if (this.field4118 < 0) {
            if (this.field4121 <= 0) {
                this.method1881();
                this.method3617(1);
                return;
            }
            this.field4118 = 0;
        }
        if (this.field4118 >= var5) {
            if (this.field4121 >= 0) {
                this.method1881();
                this.method3617(1);
                return;
            }
            this.field4118 = var5 - 1;
        }
        this.field4118 += this.field4121 * arg0;
        if (this.field4119 < 0) {
            if (!this.field4122) {
                if (this.field4121 < 0) {
                    if (this.field4118 < var3) {
                        this.field4118 = var4 - 1 - (var4 - 1 - this.field4118) % var6;
                    }
                } else if (this.field4118 >= var4) {
                    this.field4118 = (this.field4118 - var3) % var6 + var3;
                }
            } else {
                if (this.field4121 < 0) {
                    if (this.field4118 >= var3) {
                        return;
                    }
                    this.field4118 = var3 + var3 - 1 - this.field4118;
                    this.field4121 = -this.field4121;
                }
                while (this.field4118 >= var4) {
                    this.field4118 = var4 + var4 - 1 - this.field4118;
                    this.field4121 = -this.field4121;
                    if (this.field4118 >= var3) {
                        return;
                    }
                    this.field4118 = var3 + var3 - 1 - this.field4118;
                    this.field4121 = -this.field4121;
                }
            }
        } else {
            if (this.field4119 > 0) {
                if (this.field4122) {
                    label125: {
                        if (this.field4121 < 0) {
                            if (this.field4118 >= var3) {
                                return;
                            }
                            this.field4118 = var3 + var3 - 1 - this.field4118;
                            this.field4121 = -this.field4121;
                            if (--this.field4119 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4118 < var4) {
                                return;
                            }
                            this.field4118 = var4 + var4 - 1 - this.field4118;
                            this.field4121 = -this.field4121;
                            if (--this.field4119 == 0) {
                                break;
                            }
                            if (this.field4118 >= var3) {
                                return;
                            }
                            this.field4118 = var3 + var3 - 1 - this.field4118;
                            this.field4121 = -this.field4121;
                        } while (--this.field4119 != 0);
                    }
                } else if (this.field4121 < 0) {
                    if (this.field4118 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4118) / var6;
                    if (var7 < this.field4119) {
                        this.field4118 += var6 * var7;
                        this.field4119 -= var7;
                        return;
                    }
                    this.field4118 += this.field4119 * var6;
                    this.field4119 = 0;
                } else {
                    if (this.field4118 < var4) {
                        return;
                    }
                    int var8 = (this.field4118 - var3) / var6;
                    if (var8 < this.field4119) {
                        this.field4118 -= var6 * var8;
                        this.field4119 -= var8;
                        return;
                    }
                    this.field4118 -= this.field4119 * var6;
                    this.field4119 = 0;
                }
            }
            if (this.field4121 < 0) {
                if (this.field4118 < 0) {
                    this.field4118 = -1;
                    this.method1881();
                    this.method3617(1);
                    return;
                }
            } else if (this.field4118 >= var5) {
                this.field4118 = var5;
                this.method1881();
                this.method3617(1);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I")
    private static final int method1900(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[B[IIIIIIIIIILtf;)I")
    private static final int method1901(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class294 arg12) {
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
        arg12.field4110 += (var19 - arg4) * arg12.field4120;
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
        arg12.field4116 = var15 >> 2;
        arg12.field4113 = var16 >> 2;
        arg12.field4118 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "([B[IIIIIIILtf;)I")
    private static final int method1902(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8) {
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
        arg8.field4118 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II[B[IIIIIIIILtf;II)I")
    private static final int method1903(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
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
        arg11.field4118 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)V")
    public final synchronized void method1904(int arg0) {
        this.method1920(arg0 << 6, this.method1894());
    }

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "(I)V")
    public final synchronized void method1905(int arg0) {
        if (this.field4121 < 0) {
            this.field4121 = -arg0;
        } else {
            this.field4121 = arg0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II[B[IIIIIIIILtf;II)I")
    private static final int method1906(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
        arg11.field4116 -= arg11.field4117 * arg5;
        arg11.field4113 -= arg11.field4111 * arg5;
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
        arg11.field4116 += arg11.field4117 * arg5;
        arg11.field4113 += arg11.field4111 * arg5;
        arg11.field4110 = arg6;
        arg11.field4118 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[B[IIIIIIIILtf;)I")
    private static final int method1907(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
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
        arg10.field4118 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
    public final int method1908() {
        int var1 = this.field4110 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4119 == 0) {
            var2 -= this.field4118 * var2 / (((class690) super.field5865).field9711.length << 8);
        } else if (this.field4119 >= 0) {
            var2 -= this.field4123 * var2 / ((class690) super.field5865).field9711.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II[B[IIIIIIIILtf;II)I")
    private static final int method1909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
        arg11.field4116 -= arg11.field4117 * arg5;
        arg11.field4113 -= arg11.field4111 * arg5;
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
        arg11.field4116 += arg11.field4117 * arg5;
        arg11.field4113 += arg11.field4111 * arg5;
        arg11.field4110 = arg6;
        arg11.field4118 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()Lep;")
    public final class418 method1696() {
        return null;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I[B[IIIIIIIIIILtf;)I")
    private static final int method1910(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class294 arg12) {
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
        arg12.field4110 += (var19 - arg4) * arg12.field4120;
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
        arg12.field4116 = var15 >> 2;
        arg12.field4113 = var16 >> 2;
        arg12.field4118 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V")
    public final synchronized void method1911(int arg0, int arg1) {
        this.method1918(arg0, arg1, this.method1894());
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I[B[IIIIIIIILtf;)I")
    private static final int method1912(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
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
        arg10.field4118 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "([B[IIIIIIIILtf;)I")
    private static final int method1913(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class294 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4116 += (var14 - arg3) * arg9.field4117;
        arg9.field4113 += (var14 - arg3) * arg9.field4111;
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
        arg9.field4110 = var12 >> 2;
        arg9.field4118 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "()I")
    public final synchronized int method1914() {
        return this.field4121 < 0 ? -this.field4121 : this.field4121;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II[B[IIIIIIIIIILtf;II)I")
    private static final int method1915(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class294 arg13, int arg14, int arg15) {
        arg13.field4110 -= arg13.field4120 * arg5;
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
        arg13.field4110 += arg13.field4120 * var22;
        arg13.field4116 = arg6;
        arg13.field4113 = arg7;
        arg13.field4118 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "([IIIII)I")
    private final int method1916(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4124 <= 0) {
                if (this.field4121 == 256 && (this.field4118 & 255) == 0) {
                    if (class390.field5446) {
                        return method1907(0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, 0, arg3, arg2, this);
                    }
                    return method1902(((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, 0, arg3, arg2, this);
                }
                if (class390.field5446) {
                    return method1882(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, 0, arg3, arg2, this, this.field4121, arg4);
                }
                return method1921(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, 0, arg3, arg2, this, this.field4121, arg4);
            }
            int var6 = this.field4124 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4124 += arg1;
            if (this.field4121 == 256 && (this.field4118 & 255) == 0) {
                if (class390.field5446) {
                    arg1 = method1901(0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, this.field4117, this.field4111, 0, var6, arg2, this);
                } else {
                    arg1 = method1891(((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, this.field4120, 0, var6, arg2, this);
                }
            } else if (class390.field5446) {
                arg1 = method1884(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4116, this.field4113, this.field4117, this.field4111, 0, var6, arg2, this, this.field4121, arg4);
            } else {
                arg1 = method1906(0, 0, ((class690) super.field5865).field9711, arg0, this.field4118, arg1, this.field4110, this.field4120, 0, var6, arg2, this, this.field4121, arg4);
            }
            this.field4124 -= arg1;
            if (this.field4124 != 0) {
                return arg1;
            }
        } while (!this.method1893());
        return arg3;
    }

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "()Z")
    public final boolean method1917() {
        return this.field4124 != 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public final synchronized void method1918(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1920(arg1, arg2);
        } else {
            int var4 = method1897(arg1, arg2);
            int var5 = method1900(arg1, arg2);
            if (this.field4116 == var4 && this.field4113 == var5) {
                this.field4124 = 0;
            } else {
                int var6 = arg1 - this.field4110;
                if (this.field4110 - arg1 > var6) {
                    var6 = this.field4110 - arg1;
                }
                if (var4 - this.field4116 > var6) {
                    var6 = var4 - this.field4116;
                }
                if (this.field4116 - var4 > var6) {
                    var6 = this.field4116 - var4;
                }
                if (var5 - this.field4113 > var6) {
                    var6 = var5 - this.field4113;
                }
                if (this.field4113 - var5 > var6) {
                    var6 = this.field4113 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4124 = arg0;
                this.field4112 = arg1;
                this.field4114 = arg2;
                this.field4120 = (arg1 - this.field4110) / arg0;
                this.field4117 = (var4 - this.field4116) / arg0;
                this.field4111 = (var5 - this.field4113) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "(I)V")
    public final synchronized void method1919(int arg0) {
        if (arg0 == 0) {
            this.method1892(0);
            this.method3617(1);
        } else if (this.field4116 == 0 && this.field4113 == 0) {
            this.field4124 = 0;
            this.field4112 = 0;
            this.field4110 = 0;
            this.method3617(1);
        } else {
            int var2 = -this.field4110;
            if (this.field4110 > var2) {
                var2 = this.field4110;
            }
            if (-this.field4116 > var2) {
                var2 = -this.field4116;
            }
            if (this.field4116 > var2) {
                var2 = this.field4116;
            }
            if (-this.field4113 > var2) {
                var2 = -this.field4113;
            }
            if (this.field4113 > var2) {
                var2 = this.field4113;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4124 = arg0;
            this.field4112 = Integer.MIN_VALUE;
            this.field4120 = -this.field4110 / arg0;
            this.field4117 = -this.field4116 / arg0;
            this.field4111 = -this.field4113 / arg0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)V")
    private final synchronized void method1920(int arg0, int arg1) {
        this.field4112 = arg0;
        this.field4114 = arg1;
        this.field4124 = 0;
        this.method1886();
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II[B[IIIIIIILtf;II)I")
    private static final int method1921(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10, int arg11, int arg12) {
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
        arg10.field4118 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lcj;III)V")
    private class294(class690 arg0, int arg1, int arg2, int arg3) {
        super.field5865 = arg0;
        this.field4123 = arg0.field9715;
        this.field4115 = arg0.field9712;
        this.field4122 = arg0.field9714;
        this.field4121 = arg1;
        this.field4112 = arg2;
        this.field4114 = arg3;
        this.field4118 = 0;
        this.method1886();
    }
}
