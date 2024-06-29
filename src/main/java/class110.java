import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class110 extends class121 {

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Z")
    private boolean field2065;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    private int field2067;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "()V")
    private final void method862() {
        if (this.field2075 != 0) {
            if (this.field2079 == Integer.MIN_VALUE) {
                this.field2079 = 0;
            }
            this.field2075 = 0;
            this.method870();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[B[IIIIIIIILkf;II)I")
    private static final int method863(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class110 arg11, int arg12, int arg13) {
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
        arg11.field2074 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([B[IIIIIIILkf;)I")
    private static final int method864(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class110 arg8) {
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
        arg8.field2074 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()I")
    public final int method865() {
        int var1 = this.field2066 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2071 == 0) {
            var2 -= this.field2074 * var2 / (((class224) super.field2264).field3920.length << 8);
        } else if (this.field2071 >= 0) {
            var2 -= this.field2068 * var2 / ((class224) super.field2264).field3920.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([IIIII)I")
    private final int method866(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2075 <= 0) {
                if (this.field2069 == -256 && (this.field2074 & 255) == 0) {
                    if (class60.field997) {
                        return method892(0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, 0, arg3, arg2, this);
                    }
                    return method864(((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, 0, arg3, arg2, this);
                }
                if (class60.field997) {
                    return method863(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, 0, arg3, arg2, this, this.field2069, arg4);
                }
                return method897(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, 0, arg3, arg2, this, this.field2069, arg4);
            }
            int var6 = this.field2075 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2075 += arg1;
            if (this.field2069 == -256 && (this.field2074 & 255) == 0) {
                if (class60.field997) {
                    arg1 = method874(0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, this.field2078, this.field2077, 0, var6, arg2, this);
                } else {
                    arg1 = method902(((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, this.field2067, 0, var6, arg2, this);
                }
            } else if (class60.field997) {
                arg1 = method888(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, this.field2078, this.field2077, 0, var6, arg2, this, this.field2069, arg4);
            } else {
                arg1 = method869(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, this.field2067, 0, var6, arg2, this, this.field2069, arg4);
            }
            this.field2075 -= arg1;
            if (this.field2075 != 0) {
                return arg1;
            }
        } while (!this.method873());
        return arg3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
    public final synchronized void method867(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method894(arg1, arg2);
        } else {
            int var4 = method880(arg1, arg2);
            int var5 = method896(arg1, arg2);
            if (this.field2072 == var4 && this.field2070 == var5) {
                this.field2075 = 0;
            } else {
                int var6 = arg1 - this.field2066;
                if (this.field2066 - arg1 > var6) {
                    var6 = this.field2066 - arg1;
                }
                if (var4 - this.field2072 > var6) {
                    var6 = var4 - this.field2072;
                }
                if (this.field2072 - var4 > var6) {
                    var6 = this.field2072 - var4;
                }
                if (var5 - this.field2070 > var6) {
                    var6 = var5 - this.field2070;
                }
                if (this.field2070 - var5 > var6) {
                    var6 = this.field2070 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2075 = arg0;
                this.field2079 = arg1;
                this.field2076 = arg2;
                this.field2067 = (arg1 - this.field2066) / arg0;
                this.field2078 = (var4 - this.field2072) / arg0;
                this.field2077 = (var5 - this.field2070) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()I")
    public final int method655() {
        return this.field2079 == 0 && this.field2075 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[B[IIIIIIILkf;II)I")
    private static final int method868(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class110 arg10, int arg11, int arg12) {
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
        arg10.field2074 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II[B[IIIIIIIILkf;II)I")
    private static final int method869(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class110 arg11, int arg12, int arg13) {
        arg11.field2072 -= arg11.field2078 * arg5;
        arg11.field2070 -= arg11.field2077 * arg5;
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
        arg11.field2072 += arg11.field2078 * arg5;
        arg11.field2070 += arg11.field2077 * arg5;
        arg11.field2066 = arg6;
        arg11.field2074 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()Lwj;")
    public final class121 method656() {
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "()V")
    private final void method870() {
        this.field2066 = this.field2079;
        this.field2072 = method880(this.field2079, this.field2076);
        this.field2070 = method896(this.field2079, this.field2076);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public final synchronized void method652(int arg0) {
        if (this.field2075 > 0) {
            if (arg0 >= this.field2075) {
                if (this.field2079 == Integer.MIN_VALUE) {
                    this.field2079 = 0;
                    this.field2066 = this.field2072 = this.field2070 = 0;
                    this.method501(0);
                    arg0 = this.field2075;
                }
                this.field2075 = 0;
                this.method870();
            } else {
                this.field2066 += this.field2067 * arg0;
                this.field2072 += this.field2078 * arg0;
                this.field2070 += this.field2077 * arg0;
                this.field2075 -= arg0;
            }
        }
        class224 var2 = (class224) super.field2264;
        int var3 = this.field2068 << 8;
        int var4 = this.field2073 << 8;
        int var5 = var2.field3920.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2071 = 0;
        }
        if (this.field2074 < 0) {
            if (this.field2069 <= 0) {
                this.method862();
                this.method501(0);
                return;
            }
            this.field2074 = 0;
        }
        if (this.field2074 >= var5) {
            if (this.field2069 >= 0) {
                this.method862();
                this.method501(0);
                return;
            }
            this.field2074 = var5 - 1;
        }
        this.field2074 += this.field2069 * arg0;
        if (this.field2071 < 0) {
            if (!this.field2065) {
                if (this.field2069 < 0) {
                    if (this.field2074 < var3) {
                        this.field2074 = var4 - 1 - (var4 - 1 - this.field2074) % var6;
                    }
                } else if (this.field2074 >= var4) {
                    this.field2074 = (this.field2074 - var3) % var6 + var3;
                }
            } else {
                if (this.field2069 < 0) {
                    if (this.field2074 >= var3) {
                        return;
                    }
                    this.field2074 = var3 + var3 - 1 - this.field2074;
                    this.field2069 = -this.field2069;
                }
                while (this.field2074 >= var4) {
                    this.field2074 = var4 + var4 - 1 - this.field2074;
                    this.field2069 = -this.field2069;
                    if (this.field2074 >= var3) {
                        return;
                    }
                    this.field2074 = var3 + var3 - 1 - this.field2074;
                    this.field2069 = -this.field2069;
                }
            }
        } else {
            if (this.field2071 > 0) {
                if (this.field2065) {
                    label125: {
                        if (this.field2069 < 0) {
                            if (this.field2074 >= var3) {
                                return;
                            }
                            this.field2074 = var3 + var3 - 1 - this.field2074;
                            this.field2069 = -this.field2069;
                            if (--this.field2071 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2074 < var4) {
                                return;
                            }
                            this.field2074 = var4 + var4 - 1 - this.field2074;
                            this.field2069 = -this.field2069;
                            if (--this.field2071 == 0) {
                                break;
                            }
                            if (this.field2074 >= var3) {
                                return;
                            }
                            this.field2074 = var3 + var3 - 1 - this.field2074;
                            this.field2069 = -this.field2069;
                        } while (--this.field2071 != 0);
                    }
                } else if (this.field2069 < 0) {
                    if (this.field2074 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2074) / var6;
                    if (var7 < this.field2071) {
                        this.field2074 += var6 * var7;
                        this.field2071 -= var7;
                        return;
                    }
                    this.field2074 += this.field2071 * var6;
                    this.field2071 = 0;
                } else {
                    if (this.field2074 < var4) {
                        return;
                    }
                    int var8 = (this.field2074 - var3) / var6;
                    if (var8 < this.field2071) {
                        this.field2074 -= var6 * var8;
                        this.field2071 -= var8;
                        return;
                    }
                    this.field2074 -= this.field2071 * var6;
                    this.field2071 = 0;
                }
            }
            if (this.field2069 < 0) {
                if (this.field2074 < 0) {
                    this.field2074 = -1;
                    this.method862();
                    this.method501(0);
                    return;
                }
            } else if (this.field2074 >= var5) {
                this.field2074 = var5;
                this.method862();
                this.method501(0);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([B[IIIIIIIILkf;)I")
    private static final int method871(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class110 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2072 += (var14 - arg3) * arg9.field2078;
        arg9.field2070 += (var14 - arg3) * arg9.field2077;
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
        arg9.field2066 = var12 >> 2;
        arg9.field2074 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public final synchronized void method872(int arg0) {
        this.method894(arg0 << 6, this.method886());
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "()Z")
    private final boolean method873() {
        int var1 = this.field2079;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method880(var1, this.field2076);
            var2 = method896(var1, this.field2076);
        }
        if (this.field2066 == var1 && this.field2072 == var3 && this.field2070 == var2) {
            if (this.field2079 == Integer.MIN_VALUE) {
                this.field2079 = 0;
                this.field2066 = this.field2072 = this.field2070 = 0;
                this.method501(0);
                return true;
            } else {
                this.method870();
                return false;
            }
        } else {
            if (this.field2066 < var1) {
                this.field2067 = 1;
                this.field2075 = var1 - this.field2066;
            } else if (this.field2066 > var1) {
                this.field2067 = -1;
                this.field2075 = this.field2066 - var1;
            } else {
                this.field2067 = 0;
            }
            if (this.field2072 < var3) {
                this.field2078 = 1;
                if (this.field2075 == 0 || this.field2075 > var3 - this.field2072) {
                    this.field2075 = var3 - this.field2072;
                }
            } else if (this.field2072 > var3) {
                this.field2078 = -1;
                if (this.field2075 == 0 || this.field2075 > this.field2072 - var3) {
                    this.field2075 = this.field2072 - var3;
                }
            } else {
                this.field2078 = 0;
            }
            if (this.field2070 < var2) {
                this.field2077 = 1;
                if (this.field2075 == 0 || this.field2075 > var2 - this.field2070) {
                    this.field2075 = var2 - this.field2070;
                }
            } else if (this.field2070 > var2) {
                this.field2077 = -1;
                if (this.field2075 == 0 || this.field2075 > this.field2070 - var2) {
                    this.field2075 = this.field2070 - var2;
                }
            } else {
                this.field2077 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B[IIIIIIIIIILkf;)I")
    private static final int method874(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class110 arg12) {
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
        arg12.field2066 += (var19 - arg4) * arg12.field2067;
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
        arg12.field2072 = var15 >> 2;
        arg12.field2070 = var16 >> 2;
        arg12.field2074 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "()I")
    public final synchronized int method875() {
        return this.field2079 == Integer.MIN_VALUE ? 0 : this.field2079;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[B[IIIIIIIILkf;)I")
    private static final int method876(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class110 arg10) {
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
        arg10.field2074 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public final synchronized void method877(boolean arg0) {
        this.field2069 = (this.field2069 >>> 31) + (this.field2069 ^ this.field2069 >> 31);
        if (arg0) {
            this.field2069 = -this.field2069;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ldk;III)Lkf;")
    public static final class110 method878(class224 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3920 != null && arg0.field3920.length != 0 ? new class110(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "()Z")
    public final boolean method879() {
        return this.field2075 != 0;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()Lwj;")
    public final class121 method651() {
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
    private static final int method880(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "([IIIII)I")
    private final int method881(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2075 <= 0) {
                if (this.field2069 == 256 && (this.field2074 & 255) == 0) {
                    if (class60.field997) {
                        return method876(0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, 0, arg3, arg2, this);
                    }
                    return method883(((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, 0, arg3, arg2, this);
                }
                if (class60.field997) {
                    return method891(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, 0, arg3, arg2, this, this.field2069, arg4);
                }
                return method868(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, 0, arg3, arg2, this, this.field2069, arg4);
            }
            int var6 = this.field2075 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2075 += arg1;
            if (this.field2069 == 256 && (this.field2074 & 255) == 0) {
                if (class60.field997) {
                    arg1 = method882(0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, this.field2078, this.field2077, 0, var6, arg2, this);
                } else {
                    arg1 = method871(((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, this.field2067, 0, var6, arg2, this);
                }
            } else if (class60.field997) {
                arg1 = method898(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2072, this.field2070, this.field2078, this.field2077, 0, var6, arg2, this, this.field2069, arg4);
            } else {
                arg1 = method901(0, 0, ((class224) super.field2264).field3920, arg0, this.field2074, arg1, this.field2066, this.field2067, 0, var6, arg2, this, this.field2069, arg4);
            }
            this.field2075 -= arg1;
            if (this.field2075 != 0) {
                return arg1;
            }
        } while (!this.method873());
        return arg3;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I[B[IIIIIIIIIILkf;)I")
    private static final int method882(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class110 arg12) {
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
        arg12.field2066 += (var19 - arg4) * arg12.field2067;
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
        arg12.field2072 = var15 >> 2;
        arg12.field2070 = var16 >> 2;
        arg12.field2074 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "([B[IIIIIIILkf;)I")
    private static final int method883(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class110 arg8) {
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
        arg8.field2074 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public final synchronized void method884(int arg0) {
        this.field2071 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "()Z")
    public final boolean method885() {
        return this.field2074 < 0 || this.field2074 >= ((class224) super.field2264).field3920.length << 8;
    }

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "()I")
    public final synchronized int method886() {
        return this.field2076 < 0 ? -1 : this.field2076;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
    public final synchronized void method887(int arg0, int arg1) {
        this.method867(arg0, arg1, this.method886());
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[B[IIIIIIIIIILkf;II)I")
    private static final int method888(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class110 arg13, int arg14, int arg15) {
        arg13.field2066 -= arg13.field2067 * arg5;
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
        arg13.field2066 += arg13.field2067 * var22;
        arg13.field2072 = arg6;
        arg13.field2070 = arg7;
        arg13.field2074 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public final synchronized void method889(int arg0) {
        int var2 = ((class224) super.field2264).field3920.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2074 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    private final synchronized void method890(int arg0) {
        this.method894(arg0, this.method886());
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II[B[IIIIIIIILkf;II)I")
    private static final int method891(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class110 arg11, int arg12, int arg13) {
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
        arg11.field2074 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I[B[IIIIIIIILkf;)I")
    private static final int method892(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class110 arg10) {
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
        arg10.field2074 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public final synchronized void method893(int arg0) {
        if (arg0 == 0) {
            this.method890(0);
            this.method501(0);
        } else if (this.field2072 == 0 && this.field2070 == 0) {
            this.field2075 = 0;
            this.field2079 = 0;
            this.field2066 = 0;
            this.method501(0);
        } else {
            int var2 = -this.field2066;
            if (this.field2066 > var2) {
                var2 = this.field2066;
            }
            if (-this.field2072 > var2) {
                var2 = -this.field2072;
            }
            if (this.field2072 > var2) {
                var2 = this.field2072;
            }
            if (-this.field2070 > var2) {
                var2 = -this.field2070;
            }
            if (this.field2070 > var2) {
                var2 = this.field2070;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2075 = arg0;
            this.field2079 = Integer.MIN_VALUE;
            this.field2067 = -this.field2066 / arg0;
            this.field2078 = -this.field2072 / arg0;
            this.field2077 = -this.field2070 / arg0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)V")
    private final synchronized void method894(int arg0, int arg1) {
        this.field2079 = arg0;
        this.field2076 = arg1;
        this.field2075 = 0;
        this.method870();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ldk;II)Lkf;")
    public static final class110 method895(class224 arg0, int arg1, int arg2) {
        return arg0.field3920 != null && arg0.field3920.length != 0 ? new class110(arg0, (int) ((long) arg0.field3921 * 256L * (long) arg1 / (long) (class265.field4606 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(II)I")
    private static final int method896(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II[B[IIIIIIILkf;II)I")
    private static final int method897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class110 arg10, int arg11, int arg12) {
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
        arg10.field2074 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II[B[IIIIIIIIIILkf;II)I")
    private static final int method898(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class110 arg13, int arg14, int arg15) {
        arg13.field2066 -= arg13.field2067 * arg5;
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
        arg13.field2066 += arg13.field2067 * var22;
        arg13.field2072 = arg6;
        arg13.field2070 = arg7;
        arg13.field2074 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)V")
    public final synchronized void method899(int arg0) {
        if (this.field2069 < 0) {
            this.field2069 = -arg0;
        } else {
            this.field2069 = arg0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "()I")
    public final synchronized int method900() {
        return this.field2069 < 0 ? -this.field2069 : this.field2069;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(II[B[IIIIIIIILkf;II)I")
    private static final int method901(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class110 arg11, int arg12, int arg13) {
        arg11.field2072 -= arg11.field2078 * arg5;
        arg11.field2070 -= arg11.field2077 * arg5;
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
        arg11.field2072 += arg11.field2078 * arg5;
        arg11.field2070 += arg11.field2077 * arg5;
        arg11.field2066 = arg6;
        arg11.field2074 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ldk;II)V")
    private class110(class224 arg0, int arg1, int arg2) {
        super.field2264 = arg0;
        this.field2068 = arg0.field3918;
        this.field2073 = arg0.field3919;
        this.field2065 = arg0.field3917;
        this.field2069 = arg1;
        this.field2079 = arg2;
        this.field2076 = 8192;
        this.field2074 = 0;
        this.method870();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([III)V")
    public final synchronized void method649(int[] arg0, int arg1, int arg2) {
        if (this.field2079 == 0 && this.field2075 == 0) {
            this.method652(arg2);
        } else {
            class224 var4 = (class224) super.field2264;
            int var5 = this.field2068 << 8;
            int var6 = this.field2073 << 8;
            int var7 = var4.field3920.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2071 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2074 < 0) {
                if (this.field2069 <= 0) {
                    this.method862();
                    this.method501(0);
                    return;
                }
                this.field2074 = 0;
            }
            if (this.field2074 >= var7) {
                if (this.field2069 >= 0) {
                    this.method862();
                    this.method501(0);
                    return;
                }
                this.field2074 = var7 - 1;
            }
            if (this.field2071 < 0) {
                if (this.field2065) {
                    if (this.field2069 < 0) {
                        var9 = this.method866(arg0, arg1, var5, var10, var4.field3920[this.field2068]);
                        if (this.field2074 >= var5) {
                            return;
                        }
                        this.field2074 = var5 + var5 - 1 - this.field2074;
                        this.field2069 = -this.field2069;
                    }
                    while (true) {
                        int var11 = this.method881(arg0, var9, var6, var10, var4.field3920[this.field2073 - 1]);
                        if (this.field2074 < var6) {
                            return;
                        }
                        this.field2074 = var6 + var6 - 1 - this.field2074;
                        this.field2069 = -this.field2069;
                        var9 = this.method866(arg0, var11, var5, var10, var4.field3920[this.field2068]);
                        if (this.field2074 >= var5) {
                            return;
                        }
                        this.field2074 = var5 + var5 - 1 - this.field2074;
                        this.field2069 = -this.field2069;
                    }
                } else if (this.field2069 < 0) {
                    while (true) {
                        var9 = this.method866(arg0, var9, var5, var10, var4.field3920[this.field2073 - 1]);
                        if (this.field2074 >= var5) {
                            return;
                        }
                        this.field2074 = var6 - 1 - (var6 - 1 - this.field2074) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method881(arg0, var9, var6, var10, var4.field3920[this.field2068]);
                        if (this.field2074 < var6) {
                            return;
                        }
                        this.field2074 = (this.field2074 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2071 > 0) {
                    if (this.field2065) {
                        label130: {
                            if (this.field2069 < 0) {
                                var9 = this.method866(arg0, arg1, var5, var10, var4.field3920[this.field2068]);
                                if (this.field2074 >= var5) {
                                    return;
                                }
                                this.field2074 = var5 + var5 - 1 - this.field2074;
                                this.field2069 = -this.field2069;
                                if (--this.field2071 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method881(arg0, var9, var6, var10, var4.field3920[this.field2073 - 1]);
                                if (this.field2074 < var6) {
                                    return;
                                }
                                this.field2074 = var6 + var6 - 1 - this.field2074;
                                this.field2069 = -this.field2069;
                                if (--this.field2071 == 0) {
                                    break;
                                }
                                var9 = this.method866(arg0, var9, var5, var10, var4.field3920[this.field2068]);
                                if (this.field2074 >= var5) {
                                    return;
                                }
                                this.field2074 = var5 + var5 - 1 - this.field2074;
                                this.field2069 = -this.field2069;
                            } while (--this.field2071 != 0);
                        }
                    } else if (this.field2069 < 0) {
                        while (true) {
                            var9 = this.method866(arg0, var9, var5, var10, var4.field3920[this.field2073 - 1]);
                            if (this.field2074 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2074) / var8;
                            if (var12 >= this.field2071) {
                                this.field2074 += this.field2071 * var8;
                                this.field2071 = 0;
                                break;
                            }
                            this.field2074 += var8 * var12;
                            this.field2071 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method881(arg0, var9, var6, var10, var4.field3920[this.field2068]);
                            if (this.field2074 < var6) {
                                return;
                            }
                            int var13 = (this.field2074 - var5) / var8;
                            if (var13 >= this.field2071) {
                                this.field2074 -= this.field2071 * var8;
                                this.field2071 = 0;
                                break;
                            }
                            this.field2074 -= var8 * var13;
                            this.field2071 -= var13;
                        }
                    }
                }
                if (this.field2069 < 0) {
                    this.method866(arg0, var9, 0, var10, 0);
                    if (this.field2074 < 0) {
                        this.field2074 = -1;
                        this.method862();
                        this.method501(0);
                        return;
                    }
                } else {
                    this.method881(arg0, var9, var7, var10, 0);
                    if (this.field2074 >= var7) {
                        this.field2074 = var7;
                        this.method862();
                        this.method501(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ldk;III)V")
    private class110(class224 arg0, int arg1, int arg2, int arg3) {
        super.field2264 = arg0;
        this.field2068 = arg0.field3918;
        this.field2073 = arg0.field3919;
        this.field2065 = arg0.field3917;
        this.field2069 = arg1;
        this.field2079 = arg2;
        this.field2076 = arg3;
        this.field2074 = 0;
        this.method870();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "([B[IIIIIIIILkf;)I")
    private static final int method902(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class110 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2072 += (var14 - arg3) * arg9.field2078;
        arg9.field2070 += (var14 - arg3) * arg9.field2077;
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
        arg9.field2066 = var12 >> 2;
        arg9.field2074 = var10 << 8;
        return arg3;
    }
}
