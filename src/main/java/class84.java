import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class80 {

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Z")
    private boolean field2027;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    private int field2037;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    private int field2040;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    private int field2032;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    private int field2033;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    private int field2034;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    private int field2038;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    private int field2039;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIII)I")
    private final int method633(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2030 <= 0) {
                if (this.field2037 == -256 && (this.field2028 & 255) == 0) {
                    if (class87.field2075) {
                        return method664(0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, 0, arg3, arg2, this);
                    }
                    return method646(((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, 0, arg3, arg2, this);
                }
                if (class87.field2075) {
                    return method652(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, 0, arg3, arg2, this, this.field2037, arg4);
                }
                return method637(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, 0, arg3, arg2, this, this.field2037, arg4);
            }
            int var6 = this.field2030 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2030 += arg1;
            if (this.field2037 == -256 && (this.field2028 & 255) == 0) {
                if (class87.field2075) {
                    arg1 = method665(0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, this.field2033, this.field2029, 0, var6, arg2, this);
                } else {
                    arg1 = method642(((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, this.field2038, 0, var6, arg2, this);
                }
            } else if (class87.field2075) {
                arg1 = method666(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, this.field2033, this.field2029, 0, var6, arg2, this, this.field2037, arg4);
            } else {
                arg1 = method650(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, this.field2038, 0, var6, arg2, this, this.field2037, arg4);
            }
            this.field2030 -= arg1;
            if (this.field2030 != 0) {
                return arg1;
            }
        } while (!this.method669());
        return arg3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([B[IIIIIIIILma;)I")
    private static final int method634(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class84 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2039 += (var14 - arg3) * arg9.field2033;
        arg9.field2034 += (var14 - arg3) * arg9.field2029;
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
        arg9.field2032 = var12 >> 2;
        arg9.field2028 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    private final synchronized void method635(int arg0, int arg1) {
        this.field2036 = arg0;
        this.field2040 = arg1;
        this.field2030 = 0;
        this.method638();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I")
    private static final int method636(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[B[IIIIIIILma;II)I")
    private static final int method637(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class84 arg10, int arg11, int arg12) {
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
        arg10.field2028 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()V")
    private final void method638() {
        this.field2032 = this.field2036;
        this.field2039 = method636(this.field2036, this.field2040);
        this.field2034 = method641(this.field2036, this.field2040);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public final synchronized void method323(int arg0) {
        if (this.field2030 > 0) {
            if (arg0 >= this.field2030) {
                if (this.field2036 == Integer.MIN_VALUE) {
                    this.field2036 = 0;
                    this.field2032 = this.field2039 = this.field2034 = 0;
                    this.method217(-1264);
                    arg0 = this.field2030;
                }
                this.field2030 = 0;
                this.method638();
            } else {
                this.field2032 += this.field2038 * arg0;
                this.field2039 += this.field2033 * arg0;
                this.field2034 += this.field2029 * arg0;
                this.field2030 -= arg0;
            }
        }
        class109 var2 = (class109) super.field1960;
        int var3 = this.field2035 << 8;
        int var4 = this.field2031 << 8;
        int var5 = var2.field2588.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2041 = 0;
        }
        if (this.field2028 < 0) {
            if (this.field2037 <= 0) {
                this.method663();
                this.method217(-1264);
                return;
            }
            this.field2028 = 0;
        }
        if (this.field2028 >= var5) {
            if (this.field2037 >= 0) {
                this.method663();
                this.method217(-1264);
                return;
            }
            this.field2028 = var5 - 1;
        }
        this.field2028 += this.field2037 * arg0;
        if (this.field2041 < 0) {
            if (!this.field2027) {
                if (this.field2037 < 0) {
                    if (this.field2028 < var3) {
                        this.field2028 = var4 - 1 - (var4 - 1 - this.field2028) % var6;
                    }
                } else if (this.field2028 >= var4) {
                    this.field2028 = (this.field2028 - var3) % var6 + var3;
                }
            } else {
                if (this.field2037 < 0) {
                    if (this.field2028 >= var3) {
                        return;
                    }
                    this.field2028 = var3 + var3 - 1 - this.field2028;
                    this.field2037 = -this.field2037;
                }
                while (this.field2028 >= var4) {
                    this.field2028 = var4 + var4 - 1 - this.field2028;
                    this.field2037 = -this.field2037;
                    if (this.field2028 >= var3) {
                        return;
                    }
                    this.field2028 = var3 + var3 - 1 - this.field2028;
                    this.field2037 = -this.field2037;
                }
            }
        } else {
            if (this.field2041 > 0) {
                if (this.field2027) {
                    label125: {
                        if (this.field2037 < 0) {
                            if (this.field2028 >= var3) {
                                return;
                            }
                            this.field2028 = var3 + var3 - 1 - this.field2028;
                            this.field2037 = -this.field2037;
                            if (--this.field2041 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2028 < var4) {
                                return;
                            }
                            this.field2028 = var4 + var4 - 1 - this.field2028;
                            this.field2037 = -this.field2037;
                            if (--this.field2041 == 0) {
                                break;
                            }
                            if (this.field2028 >= var3) {
                                return;
                            }
                            this.field2028 = var3 + var3 - 1 - this.field2028;
                            this.field2037 = -this.field2037;
                        } while (--this.field2041 != 0);
                    }
                } else if (this.field2037 < 0) {
                    if (this.field2028 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2028) / var6;
                    if (var7 < this.field2041) {
                        this.field2028 += var6 * var7;
                        this.field2041 -= var7;
                        return;
                    }
                    this.field2028 += this.field2041 * var6;
                    this.field2041 = 0;
                } else {
                    if (this.field2028 < var4) {
                        return;
                    }
                    int var8 = (this.field2028 - var3) / var6;
                    if (var8 < this.field2041) {
                        this.field2028 -= var6 * var8;
                        this.field2041 -= var8;
                        return;
                    }
                    this.field2028 -= this.field2041 * var6;
                    this.field2041 = 0;
                }
            }
            if (this.field2037 < 0) {
                if (this.field2028 < 0) {
                    this.field2028 = -1;
                    this.method663();
                    this.method217(-1264);
                    return;
                }
            } else if (this.field2028 >= var5) {
                this.field2028 = var5;
                this.method663();
                this.method217(-1264);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()Lld;")
    public final class80 method324() {
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([B[IIIIIIILma;)I")
    private static final int method639(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class84 arg8) {
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
        arg8.field2028 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
    public final synchronized void method640(int arg0, int arg1) {
        this.method651(arg0, arg1, this.method660());
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)I")
    private static final int method641(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "([B[IIIIIIIILma;)I")
    private static final int method642(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class84 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2039 += (var14 - arg3) * arg9.field2033;
        arg9.field2034 += (var14 - arg3) * arg9.field2029;
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
        arg9.field2032 = var12 >> 2;
        arg9.field2028 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "()I")
    public final synchronized int method643() {
        return this.field2036 == Integer.MIN_VALUE ? 0 : this.field2036;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()I")
    public final int method616() {
        int var1 = this.field2032 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2041 == 0) {
            var2 -= this.field2028 * var2 / (((class109) super.field1960).field2588.length << 8);
        } else if (this.field2041 >= 0) {
            var2 -= this.field2035 * var2 / ((class109) super.field1960).field2588.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()I")
    public final int method325() {
        return this.field2036 == 0 && this.field2030 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public final synchronized void method644(int arg0) {
        this.field2041 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final synchronized void method645(int arg0) {
        if (arg0 == 0) {
            this.method655(0);
            this.method217(-1264);
        } else if (this.field2039 == 0 && this.field2034 == 0) {
            this.field2030 = 0;
            this.field2036 = 0;
            this.field2032 = 0;
            this.method217(-1264);
        } else {
            int var2 = -this.field2032;
            if (this.field2032 > var2) {
                var2 = this.field2032;
            }
            if (-this.field2039 > var2) {
                var2 = -this.field2039;
            }
            if (this.field2039 > var2) {
                var2 = this.field2039;
            }
            if (-this.field2034 > var2) {
                var2 = -this.field2034;
            }
            if (this.field2034 > var2) {
                var2 = this.field2034;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2030 = arg0;
            this.field2036 = Integer.MIN_VALUE;
            this.field2038 = -this.field2032 / arg0;
            this.field2033 = -this.field2039 / arg0;
            this.field2029 = -this.field2034 / arg0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "([B[IIIIIIILma;)I")
    private static final int method646(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class84 arg8) {
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
        arg8.field2028 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public final synchronized void method647(boolean arg0) {
        this.field2037 = (this.field2037 >>> 31) + (this.field2037 ^ this.field2037 >> 31);
        if (arg0) {
            this.field2037 = -this.field2037;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "([IIIII)I")
    private final int method648(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2030 <= 0) {
                if (this.field2037 == 256 && (this.field2028 & 255) == 0) {
                    if (class87.field2075) {
                        return method671(0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, 0, arg3, arg2, this);
                    }
                    return method639(((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, 0, arg3, arg2, this);
                }
                if (class87.field2075) {
                    return method661(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, 0, arg3, arg2, this, this.field2037, arg4);
                }
                return method649(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, 0, arg3, arg2, this, this.field2037, arg4);
            }
            int var6 = this.field2030 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2030 += arg1;
            if (this.field2037 == 256 && (this.field2028 & 255) == 0) {
                if (class87.field2075) {
                    arg1 = method653(0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, this.field2033, this.field2029, 0, var6, arg2, this);
                } else {
                    arg1 = method634(((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, this.field2038, 0, var6, arg2, this);
                }
            } else if (class87.field2075) {
                arg1 = method657(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2039, this.field2034, this.field2033, this.field2029, 0, var6, arg2, this, this.field2037, arg4);
            } else {
                arg1 = method672(0, 0, ((class109) super.field1960).field2588, arg0, this.field2028, arg1, this.field2032, this.field2038, 0, var6, arg2, this, this.field2037, arg4);
            }
            this.field2030 -= arg1;
            if (this.field2030 != 0) {
                return arg1;
            }
        } while (!this.method669());
        return arg3;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II[B[IIIIIIILma;II)I")
    private static final int method649(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class84 arg10, int arg11, int arg12) {
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
        arg10.field2028 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[B[IIIIIIIILma;II)I")
    private static final int method650(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class84 arg11, int arg12, int arg13) {
        arg11.field2039 -= arg11.field2033 * arg5;
        arg11.field2034 -= arg11.field2029 * arg5;
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
        arg11.field2039 += arg11.field2033 * arg5;
        arg11.field2034 += arg11.field2029 * arg5;
        arg11.field2032 = arg6;
        arg11.field2028 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public final synchronized void method651(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method635(arg1, arg2);
        } else {
            int var4 = method636(arg1, arg2);
            int var5 = method641(arg1, arg2);
            if (this.field2039 == var4 && this.field2034 == var5) {
                this.field2030 = 0;
            } else {
                int var6 = arg1 - this.field2032;
                if (this.field2032 - arg1 > var6) {
                    var6 = this.field2032 - arg1;
                }
                if (var4 - this.field2039 > var6) {
                    var6 = var4 - this.field2039;
                }
                if (this.field2039 - var4 > var6) {
                    var6 = this.field2039 - var4;
                }
                if (var5 - this.field2034 > var6) {
                    var6 = var5 - this.field2034;
                }
                if (this.field2034 - var5 > var6) {
                    var6 = this.field2034 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2030 = arg0;
                this.field2036 = arg1;
                this.field2040 = arg2;
                this.field2038 = (arg1 - this.field2032) / arg0;
                this.field2033 = (var4 - this.field2039) / arg0;
                this.field2029 = (var5 - this.field2034) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II[B[IIIIIIIILma;II)I")
    private static final int method652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class84 arg11, int arg12, int arg13) {
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
        arg11.field2028 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[B[IIIIIIIIIILma;)I")
    private static final int method653(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class84 arg12) {
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
        arg12.field2032 += (var19 - arg4) * arg12.field2038;
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
        arg12.field2039 = var15 >> 2;
        arg12.field2034 = var16 >> 2;
        arg12.field2028 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lpe;III)Lma;")
    public static final class84 method654(class109 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2588 != null && arg0.field2588.length != 0 ? new class84(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V")
    private final synchronized void method655(int arg0) {
        this.method635(arg0, this.method660());
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "()I")
    public final synchronized int method656() {
        return this.field2037 < 0 ? -this.field2037 : this.field2037;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[B[IIIIIIIIIILma;II)I")
    private static final int method657(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class84 arg13, int arg14, int arg15) {
        arg13.field2032 -= arg13.field2038 * arg5;
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
        arg13.field2032 += arg13.field2038 * var22;
        arg13.field2039 = arg6;
        arg13.field2034 = arg7;
        arg13.field2028 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "()Z")
    public final boolean method658() {
        return this.field2030 != 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()Lld;")
    public final class80 method329() {
        return null;
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)V")
    public final synchronized void method659(int arg0) {
        int var2 = ((class109) super.field1960).field2588.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2028 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "()I")
    public final synchronized int method660() {
        return this.field2040 < 0 ? -1 : this.field2040;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II[B[IIIIIIIILma;II)I")
    private static final int method661(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class84 arg11, int arg12, int arg13) {
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
        arg11.field2028 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "([III)V")
    public final synchronized void method326(int[] arg0, int arg1, int arg2) {
        if (this.field2036 == 0 && this.field2030 == 0) {
            this.method323(arg2);
        } else {
            class109 var4 = (class109) super.field1960;
            int var5 = this.field2035 << 8;
            int var6 = this.field2031 << 8;
            int var7 = var4.field2588.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2041 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2028 < 0) {
                if (this.field2037 <= 0) {
                    this.method663();
                    this.method217(-1264);
                    return;
                }
                this.field2028 = 0;
            }
            if (this.field2028 >= var7) {
                if (this.field2037 >= 0) {
                    this.method663();
                    this.method217(-1264);
                    return;
                }
                this.field2028 = var7 - 1;
            }
            if (this.field2041 < 0) {
                if (this.field2027) {
                    if (this.field2037 < 0) {
                        var9 = this.method633(arg0, arg1, var5, var10, var4.field2588[this.field2035]);
                        if (this.field2028 >= var5) {
                            return;
                        }
                        this.field2028 = var5 + var5 - 1 - this.field2028;
                        this.field2037 = -this.field2037;
                    }
                    while (true) {
                        int var11 = this.method648(arg0, var9, var6, var10, var4.field2588[this.field2031 - 1]);
                        if (this.field2028 < var6) {
                            return;
                        }
                        this.field2028 = var6 + var6 - 1 - this.field2028;
                        this.field2037 = -this.field2037;
                        var9 = this.method633(arg0, var11, var5, var10, var4.field2588[this.field2035]);
                        if (this.field2028 >= var5) {
                            return;
                        }
                        this.field2028 = var5 + var5 - 1 - this.field2028;
                        this.field2037 = -this.field2037;
                    }
                } else if (this.field2037 < 0) {
                    while (true) {
                        var9 = this.method633(arg0, var9, var5, var10, var4.field2588[this.field2031 - 1]);
                        if (this.field2028 >= var5) {
                            return;
                        }
                        this.field2028 = var6 - 1 - (var6 - 1 - this.field2028) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method648(arg0, var9, var6, var10, var4.field2588[this.field2035]);
                        if (this.field2028 < var6) {
                            return;
                        }
                        this.field2028 = (this.field2028 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2041 > 0) {
                    if (this.field2027) {
                        label130: {
                            if (this.field2037 < 0) {
                                var9 = this.method633(arg0, arg1, var5, var10, var4.field2588[this.field2035]);
                                if (this.field2028 >= var5) {
                                    return;
                                }
                                this.field2028 = var5 + var5 - 1 - this.field2028;
                                this.field2037 = -this.field2037;
                                if (--this.field2041 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method648(arg0, var9, var6, var10, var4.field2588[this.field2031 - 1]);
                                if (this.field2028 < var6) {
                                    return;
                                }
                                this.field2028 = var6 + var6 - 1 - this.field2028;
                                this.field2037 = -this.field2037;
                                if (--this.field2041 == 0) {
                                    break;
                                }
                                var9 = this.method633(arg0, var9, var5, var10, var4.field2588[this.field2035]);
                                if (this.field2028 >= var5) {
                                    return;
                                }
                                this.field2028 = var5 + var5 - 1 - this.field2028;
                                this.field2037 = -this.field2037;
                            } while (--this.field2041 != 0);
                        }
                    } else if (this.field2037 < 0) {
                        while (true) {
                            var9 = this.method633(arg0, var9, var5, var10, var4.field2588[this.field2031 - 1]);
                            if (this.field2028 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2028) / var8;
                            if (var12 >= this.field2041) {
                                this.field2028 += this.field2041 * var8;
                                this.field2041 = 0;
                                break;
                            }
                            this.field2028 += var8 * var12;
                            this.field2041 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method648(arg0, var9, var6, var10, var4.field2588[this.field2035]);
                            if (this.field2028 < var6) {
                                return;
                            }
                            int var13 = (this.field2028 - var5) / var8;
                            if (var13 >= this.field2041) {
                                this.field2028 -= this.field2041 * var8;
                                this.field2041 = 0;
                                break;
                            }
                            this.field2028 -= var8 * var13;
                            this.field2041 -= var13;
                        }
                    }
                }
                if (this.field2037 < 0) {
                    this.method633(arg0, var9, 0, var10, 0);
                    if (this.field2028 < 0) {
                        this.field2028 = -1;
                        this.method663();
                        this.method217(-1264);
                        return;
                    }
                } else {
                    this.method648(arg0, var9, var7, var10, 0);
                    if (this.field2028 >= var7) {
                        this.field2028 = var7;
                        this.method663();
                        this.method217(-1264);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lpe;II)Lma;")
    public static final class84 method662(class109 arg0, int arg1, int arg2) {
        return arg0.field2588 != null && arg0.field2588.length != 0 ? new class84(arg0, (int) ((long) arg0.field2586 * 256L * (long) arg1 / (long) (class126.field2922 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "()V")
    private final void method663() {
        if (this.field2030 != 0) {
            if (this.field2036 == Integer.MIN_VALUE) {
                this.field2036 = 0;
            }
            this.field2030 = 0;
            this.method638();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[B[IIIIIIIILma;)I")
    private static final int method664(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class84 arg10) {
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
        arg10.field2028 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I[B[IIIIIIIIIILma;)I")
    private static final int method665(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class84 arg12) {
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
        arg12.field2032 += (var19 - arg4) * arg12.field2038;
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
        arg12.field2039 = var15 >> 2;
        arg12.field2034 = var16 >> 2;
        arg12.field2028 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II[B[IIIIIIIIIILma;II)I")
    private static final int method666(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class84 arg13, int arg14, int arg15) {
        arg13.field2032 -= arg13.field2038 * arg5;
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
        arg13.field2032 += arg13.field2038 * var22;
        arg13.field2039 = arg6;
        arg13.field2034 = arg7;
        arg13.field2028 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)V")
    public final synchronized void method667(int arg0) {
        if (this.field2037 < 0) {
            this.field2037 = -arg0;
        } else {
            this.field2037 = arg0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "(I)V")
    public final synchronized void method668(int arg0) {
        this.method635(arg0 << 6, this.method660());
    }

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "()Z")
    private final boolean method669() {
        int var1 = this.field2036;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method636(var1, this.field2040);
            var2 = method641(var1, this.field2040);
        }
        if (this.field2032 == var1 && this.field2039 == var3 && this.field2034 == var2) {
            if (this.field2036 == Integer.MIN_VALUE) {
                this.field2036 = 0;
                this.field2032 = this.field2039 = this.field2034 = 0;
                this.method217(-1264);
                return true;
            } else {
                this.method638();
                return false;
            }
        } else {
            if (this.field2032 < var1) {
                this.field2038 = 1;
                this.field2030 = var1 - this.field2032;
            } else if (this.field2032 > var1) {
                this.field2038 = -1;
                this.field2030 = this.field2032 - var1;
            } else {
                this.field2038 = 0;
            }
            if (this.field2039 < var3) {
                this.field2033 = 1;
                if (this.field2030 == 0 || this.field2030 > var3 - this.field2039) {
                    this.field2030 = var3 - this.field2039;
                }
            } else if (this.field2039 > var3) {
                this.field2033 = -1;
                if (this.field2030 == 0 || this.field2030 > this.field2039 - var3) {
                    this.field2030 = this.field2039 - var3;
                }
            } else {
                this.field2033 = 0;
            }
            if (this.field2034 < var2) {
                this.field2029 = 1;
                if (this.field2030 == 0 || this.field2030 > var2 - this.field2034) {
                    this.field2030 = var2 - this.field2034;
                }
            } else if (this.field2034 > var2) {
                this.field2029 = -1;
                if (this.field2030 == 0 || this.field2030 > this.field2034 - var2) {
                    this.field2030 = this.field2034 - var2;
                }
            } else {
                this.field2029 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "()Z")
    public final boolean method670() {
        return this.field2028 < 0 || this.field2028 >= ((class109) super.field1960).field2588.length << 8;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I[B[IIIIIIIILma;)I")
    private static final int method671(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class84 arg10) {
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
        arg10.field2028 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II[B[IIIIIIIILma;II)I")
    private static final int method672(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class84 arg11, int arg12, int arg13) {
        arg11.field2039 -= arg11.field2033 * arg5;
        arg11.field2034 -= arg11.field2029 * arg5;
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
        arg11.field2039 += arg11.field2033 * arg5;
        arg11.field2034 += arg11.field2029 * arg5;
        arg11.field2032 = arg6;
        arg11.field2028 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lpe;II)V")
    private class84(class109 arg0, int arg1, int arg2) {
        super.field1960 = arg0;
        this.field2035 = arg0.field2585;
        this.field2031 = arg0.field2589;
        this.field2027 = arg0.field2587;
        this.field2037 = arg1;
        this.field2036 = arg2;
        this.field2040 = 8192;
        this.field2028 = 0;
        this.method638();
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lpe;III)V")
    private class84(class109 arg0, int arg1, int arg2, int arg3) {
        super.field1960 = arg0;
        this.field2035 = arg0.field2585;
        this.field2031 = arg0.field2589;
        this.field2027 = arg0.field2587;
        this.field2037 = arg1;
        this.field2036 = arg2;
        this.field2040 = arg3;
        this.field2028 = 0;
        this.method638();
    }
}
