import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class94 extends class202 {

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    private int field2080;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Z")
    private boolean field2075;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    private int field2081;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    private int field2083;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public final synchronized void method681(int arg0, int arg1) {
        this.method691(arg0, arg1, this.method720());
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()Lve;")
    public final class202 method682() {
        return null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[B[IIIIIIIILje;II)I")
    private static final int method683(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([B[IIIIIIIILje;)I")
    private static final int method684(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class94 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2083 += (var14 - arg3) * arg9.field2082;
        arg9.field2073 += (var14 - arg3) * arg9.field2077;
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
        arg9.field2071 = var12 >> 2;
        arg9.field2074 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([IIIII)I")
    private final int method685(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2084 <= 0) {
                if (this.field2081 == -256 && (this.field2074 & 255) == 0) {
                    if (class109.field2419) {
                        return method698(0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, 0, arg3, arg2, this);
                    }
                    return method688(((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, 0, arg3, arg2, this);
                }
                if (class109.field2419) {
                    return method683(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, 0, arg3, arg2, this, this.field2081, arg4);
                }
                return method721(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, 0, arg3, arg2, this, this.field2081, arg4);
            }
            int var6 = this.field2084 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2084 += arg1;
            if (this.field2081 == -256 && (this.field2074 & 255) == 0) {
                if (class109.field2419) {
                    arg1 = method725(0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, this.field2082, this.field2077, 0, var6, arg2, this);
                } else {
                    arg1 = method684(((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, this.field2070, 0, var6, arg2, this);
                }
            } else if (class109.field2419) {
                arg1 = method687(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, this.field2082, this.field2077, 0, var6, arg2, this, this.field2081, arg4);
            } else {
                arg1 = method693(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, this.field2070, 0, var6, arg2, this, this.field2081, arg4);
            }
            this.field2084 -= arg1;
            if (this.field2084 != 0) {
                return arg1;
            }
        } while (!this.method708());
        return arg3;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()I")
    public final int method686() {
        int var1 = this.field2071 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2072 == 0) {
            var2 -= this.field2074 * var2 / (((class10) super.field4033).field193.length << 8);
        } else if (this.field2072 >= 0) {
            var2 -= this.field2080 * var2 / ((class10) super.field4033).field193.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[B[IIIIIIIIIILje;II)I")
    private static final int method687(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        arg13.field2071 -= arg13.field2070 * arg5;
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
        arg13.field2071 += arg13.field2070 * var22;
        arg13.field2083 = arg6;
        arg13.field2073 = arg7;
        arg13.field2074 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([B[IIIIIIILje;)I")
    private static final int method688(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8) {
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

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II[B[IIIIIIIILje;II)I")
    private static final int method689(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
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

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public final synchronized void method690(int arg0) {
        if (arg0 == 0) {
            this.method710(0);
            this.method799(-24265);
        } else if (this.field2083 == 0 && this.field2073 == 0) {
            this.field2084 = 0;
            this.field2078 = 0;
            this.field2071 = 0;
            this.method799(-24265);
        } else {
            int var2 = -this.field2071;
            if (this.field2071 > var2) {
                var2 = this.field2071;
            }
            if (-this.field2083 > var2) {
                var2 = -this.field2083;
            }
            if (this.field2083 > var2) {
                var2 = this.field2083;
            }
            if (-this.field2073 > var2) {
                var2 = -this.field2073;
            }
            if (this.field2073 > var2) {
                var2 = this.field2073;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2084 = arg0;
            this.field2078 = Integer.MIN_VALUE;
            this.field2070 = -this.field2071 / arg0;
            this.field2082 = -this.field2083 / arg0;
            this.field2077 = -this.field2073 / arg0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final synchronized void method691(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method709(arg1, arg2);
        } else {
            int var4 = method692(arg1, arg2);
            int var5 = method724(arg1, arg2);
            if (this.field2083 == var4 && this.field2073 == var5) {
                this.field2084 = 0;
            } else {
                int var6 = arg1 - this.field2071;
                if (this.field2071 - arg1 > var6) {
                    var6 = this.field2071 - arg1;
                }
                if (var4 - this.field2083 > var6) {
                    var6 = var4 - this.field2083;
                }
                if (this.field2083 - var4 > var6) {
                    var6 = this.field2083 - var4;
                }
                if (var5 - this.field2073 > var6) {
                    var6 = var5 - this.field2073;
                }
                if (this.field2073 - var5 > var6) {
                    var6 = this.field2073 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2084 = arg0;
                this.field2078 = arg1;
                this.field2079 = arg2;
                this.field2070 = (arg1 - this.field2071) / arg0;
                this.field2082 = (var4 - this.field2083) / arg0;
                this.field2077 = (var5 - this.field2073) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    private static final int method692(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II[B[IIIIIIIILje;II)I")
    private static final int method693(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
        arg11.field2083 -= arg11.field2082 * arg5;
        arg11.field2073 -= arg11.field2077 * arg5;
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
        arg11.field2083 += arg11.field2082 * arg5;
        arg11.field2073 += arg11.field2077 * arg5;
        arg11.field2071 = arg6;
        arg11.field2074 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public final synchronized void method694(int arg0) {
        if (this.field2084 > 0) {
            if (arg0 >= this.field2084) {
                if (this.field2078 == Integer.MIN_VALUE) {
                    this.field2078 = 0;
                    this.field2071 = this.field2083 = this.field2073 = 0;
                    this.method799(-24265);
                    arg0 = this.field2084;
                }
                this.field2084 = 0;
                this.method717();
            } else {
                this.field2071 += this.field2070 * arg0;
                this.field2083 += this.field2082 * arg0;
                this.field2073 += this.field2077 * arg0;
                this.field2084 -= arg0;
            }
        }
        class10 var2 = (class10) super.field4033;
        int var3 = this.field2080 << 8;
        int var4 = this.field2076 << 8;
        int var5 = var2.field193.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2072 = 0;
        }
        if (this.field2074 < 0) {
            if (this.field2081 <= 0) {
                this.method696();
                this.method799(-24265);
                return;
            }
            this.field2074 = 0;
        }
        if (this.field2074 >= var5) {
            if (this.field2081 >= 0) {
                this.method696();
                this.method799(-24265);
                return;
            }
            this.field2074 = var5 - 1;
        }
        this.field2074 += this.field2081 * arg0;
        if (this.field2072 < 0) {
            if (!this.field2075) {
                if (this.field2081 < 0) {
                    if (this.field2074 < var3) {
                        this.field2074 = var4 - 1 - (var4 - 1 - this.field2074) % var6;
                    }
                } else if (this.field2074 >= var4) {
                    this.field2074 = (this.field2074 - var3) % var6 + var3;
                }
            } else {
                if (this.field2081 < 0) {
                    if (this.field2074 >= var3) {
                        return;
                    }
                    this.field2074 = var3 + var3 - 1 - this.field2074;
                    this.field2081 = -this.field2081;
                }
                while (this.field2074 >= var4) {
                    this.field2074 = var4 + var4 - 1 - this.field2074;
                    this.field2081 = -this.field2081;
                    if (this.field2074 >= var3) {
                        return;
                    }
                    this.field2074 = var3 + var3 - 1 - this.field2074;
                    this.field2081 = -this.field2081;
                }
            }
        } else {
            if (this.field2072 > 0) {
                if (this.field2075) {
                    label125: {
                        if (this.field2081 < 0) {
                            if (this.field2074 >= var3) {
                                return;
                            }
                            this.field2074 = var3 + var3 - 1 - this.field2074;
                            this.field2081 = -this.field2081;
                            if (--this.field2072 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2074 < var4) {
                                return;
                            }
                            this.field2074 = var4 + var4 - 1 - this.field2074;
                            this.field2081 = -this.field2081;
                            if (--this.field2072 == 0) {
                                break;
                            }
                            if (this.field2074 >= var3) {
                                return;
                            }
                            this.field2074 = var3 + var3 - 1 - this.field2074;
                            this.field2081 = -this.field2081;
                        } while (--this.field2072 != 0);
                    }
                } else if (this.field2081 < 0) {
                    if (this.field2074 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2074) / var6;
                    if (var7 < this.field2072) {
                        this.field2074 += var6 * var7;
                        this.field2072 -= var7;
                        return;
                    }
                    this.field2074 += this.field2072 * var6;
                    this.field2072 = 0;
                } else {
                    if (this.field2074 < var4) {
                        return;
                    }
                    int var8 = (this.field2074 - var3) / var6;
                    if (var8 < this.field2072) {
                        this.field2074 -= var6 * var8;
                        this.field2072 -= var8;
                        return;
                    }
                    this.field2074 -= this.field2072 * var6;
                    this.field2072 = 0;
                }
            }
            if (this.field2081 < 0) {
                if (this.field2074 < 0) {
                    this.field2074 = -1;
                    this.method696();
                    this.method799(-24265);
                    return;
                }
            } else if (this.field2074 >= var5) {
                this.field2074 = var5;
                this.method696();
                this.method799(-24265);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lai;III)Lje;")
    public static final class94 method695(class10 arg0, int arg1, int arg2, int arg3) {
        return arg0.field193 != null && arg0.field193.length != 0 ? new class94(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
    private final void method696() {
        if (this.field2084 != 0) {
            if (this.field2078 == Integer.MIN_VALUE) {
                this.field2078 = 0;
            }
            this.field2084 = 0;
            this.method717();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[B[IIIIIIIILje;)I")
    private static final int method697(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10) {
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

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I[B[IIIIIIIILje;)I")
    private static final int method698(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10) {
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

    @OriginalMember(owner = "client!je", name = "b", descriptor = "([IIIII)I")
    private final int method699(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2084 <= 0) {
                if (this.field2081 == 256 && (this.field2074 & 255) == 0) {
                    if (class109.field2419) {
                        return method697(0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, 0, arg3, arg2, this);
                    }
                    return method726(((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, 0, arg3, arg2, this);
                }
                if (class109.field2419) {
                    return method689(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, 0, arg3, arg2, this, this.field2081, arg4);
                }
                return method701(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, 0, arg3, arg2, this, this.field2081, arg4);
            }
            int var6 = this.field2084 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2084 += arg1;
            if (this.field2081 == 256 && (this.field2074 & 255) == 0) {
                if (class109.field2419) {
                    arg1 = method722(0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, this.field2082, this.field2077, 0, var6, arg2, this);
                } else {
                    arg1 = method714(((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, this.field2070, 0, var6, arg2, this);
                }
            } else if (class109.field2419) {
                arg1 = method715(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2083, this.field2073, this.field2082, this.field2077, 0, var6, arg2, this, this.field2081, arg4);
            } else {
                arg1 = method723(0, 0, ((class10) super.field4033).field193, arg0, this.field2074, arg1, this.field2071, this.field2070, 0, var6, arg2, this, this.field2081, arg4);
            }
            this.field2084 -= arg1;
            if (this.field2084 != 0) {
                return arg1;
            }
        } while (!this.method708());
        return arg3;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()Z")
    public final boolean method700() {
        return this.field2074 < 0 || this.field2074 >= ((class10) super.field4033).field193.length << 8;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[B[IIIIIIILje;II)I")
    private static final int method701(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lai;II)Lje;")
    public static final class94 method702(class10 arg0, int arg1, int arg2) {
        return arg0.field193 != null && arg0.field193.length != 0 ? new class94(arg0, (int) ((long) arg0.field196 * 256L * (long) arg1 / (long) (class150.field3136 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "()I")
    public final synchronized int method703() {
        return this.field2081 < 0 ? -this.field2081 : this.field2081;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()Lve;")
    public final class202 method704() {
        return null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([III)V")
    public final synchronized void method705(int[] arg0, int arg1, int arg2) {
        if (this.field2078 == 0 && this.field2084 == 0) {
            this.method694(arg2);
        } else {
            class10 var4 = (class10) super.field4033;
            int var5 = this.field2080 << 8;
            int var6 = this.field2076 << 8;
            int var7 = var4.field193.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2072 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2074 < 0) {
                if (this.field2081 <= 0) {
                    this.method696();
                    this.method799(-24265);
                    return;
                }
                this.field2074 = 0;
            }
            if (this.field2074 >= var7) {
                if (this.field2081 >= 0) {
                    this.method696();
                    this.method799(-24265);
                    return;
                }
                this.field2074 = var7 - 1;
            }
            if (this.field2072 < 0) {
                if (this.field2075) {
                    if (this.field2081 < 0) {
                        var9 = this.method685(arg0, arg1, var5, var10, var4.field193[this.field2080]);
                        if (this.field2074 >= var5) {
                            return;
                        }
                        this.field2074 = var5 + var5 - 1 - this.field2074;
                        this.field2081 = -this.field2081;
                    }
                    while (true) {
                        int var11 = this.method699(arg0, var9, var6, var10, var4.field193[this.field2076 - 1]);
                        if (this.field2074 < var6) {
                            return;
                        }
                        this.field2074 = var6 + var6 - 1 - this.field2074;
                        this.field2081 = -this.field2081;
                        var9 = this.method685(arg0, var11, var5, var10, var4.field193[this.field2080]);
                        if (this.field2074 >= var5) {
                            return;
                        }
                        this.field2074 = var5 + var5 - 1 - this.field2074;
                        this.field2081 = -this.field2081;
                    }
                } else if (this.field2081 < 0) {
                    while (true) {
                        var9 = this.method685(arg0, var9, var5, var10, var4.field193[this.field2076 - 1]);
                        if (this.field2074 >= var5) {
                            return;
                        }
                        this.field2074 = var6 - 1 - (var6 - 1 - this.field2074) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method699(arg0, var9, var6, var10, var4.field193[this.field2080]);
                        if (this.field2074 < var6) {
                            return;
                        }
                        this.field2074 = (this.field2074 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2072 > 0) {
                    if (this.field2075) {
                        label130: {
                            if (this.field2081 < 0) {
                                var9 = this.method685(arg0, arg1, var5, var10, var4.field193[this.field2080]);
                                if (this.field2074 >= var5) {
                                    return;
                                }
                                this.field2074 = var5 + var5 - 1 - this.field2074;
                                this.field2081 = -this.field2081;
                                if (--this.field2072 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method699(arg0, var9, var6, var10, var4.field193[this.field2076 - 1]);
                                if (this.field2074 < var6) {
                                    return;
                                }
                                this.field2074 = var6 + var6 - 1 - this.field2074;
                                this.field2081 = -this.field2081;
                                if (--this.field2072 == 0) {
                                    break;
                                }
                                var9 = this.method685(arg0, var9, var5, var10, var4.field193[this.field2080]);
                                if (this.field2074 >= var5) {
                                    return;
                                }
                                this.field2074 = var5 + var5 - 1 - this.field2074;
                                this.field2081 = -this.field2081;
                            } while (--this.field2072 != 0);
                        }
                    } else if (this.field2081 < 0) {
                        while (true) {
                            var9 = this.method685(arg0, var9, var5, var10, var4.field193[this.field2076 - 1]);
                            if (this.field2074 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2074) / var8;
                            if (var12 >= this.field2072) {
                                this.field2074 += this.field2072 * var8;
                                this.field2072 = 0;
                                break;
                            }
                            this.field2074 += var8 * var12;
                            this.field2072 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method699(arg0, var9, var6, var10, var4.field193[this.field2080]);
                            if (this.field2074 < var6) {
                                return;
                            }
                            int var13 = (this.field2074 - var5) / var8;
                            if (var13 >= this.field2072) {
                                this.field2074 -= this.field2072 * var8;
                                this.field2072 = 0;
                                break;
                            }
                            this.field2074 -= var8 * var13;
                            this.field2072 -= var13;
                        }
                    }
                }
                if (this.field2081 < 0) {
                    this.method685(arg0, var9, 0, var10, 0);
                    if (this.field2074 < 0) {
                        this.field2074 = -1;
                        this.method696();
                        this.method799(-24265);
                        return;
                    }
                } else {
                    this.method699(arg0, var9, var7, var10, 0);
                    if (this.field2074 >= var7) {
                        this.field2074 = var7;
                        this.method696();
                        this.method799(-24265);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public final synchronized void method706(int arg0) {
        this.method709(arg0 << 6, this.method720());
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()I")
    public final int method707() {
        return this.field2078 == 0 && this.field2084 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "()Z")
    private final boolean method708() {
        int var1 = this.field2078;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method692(var1, this.field2079);
            var2 = method724(var1, this.field2079);
        }
        if (this.field2071 == var1 && this.field2083 == var3 && this.field2073 == var2) {
            if (this.field2078 == Integer.MIN_VALUE) {
                this.field2078 = 0;
                this.field2071 = this.field2083 = this.field2073 = 0;
                this.method799(-24265);
                return true;
            } else {
                this.method717();
                return false;
            }
        } else {
            if (this.field2071 < var1) {
                this.field2070 = 1;
                this.field2084 = var1 - this.field2071;
            } else if (this.field2071 > var1) {
                this.field2070 = -1;
                this.field2084 = this.field2071 - var1;
            } else {
                this.field2070 = 0;
            }
            if (this.field2083 < var3) {
                this.field2082 = 1;
                if (this.field2084 == 0 || this.field2084 > var3 - this.field2083) {
                    this.field2084 = var3 - this.field2083;
                }
            } else if (this.field2083 > var3) {
                this.field2082 = -1;
                if (this.field2084 == 0 || this.field2084 > this.field2083 - var3) {
                    this.field2084 = this.field2083 - var3;
                }
            } else {
                this.field2082 = 0;
            }
            if (this.field2073 < var2) {
                this.field2077 = 1;
                if (this.field2084 == 0 || this.field2084 > var2 - this.field2073) {
                    this.field2084 = var2 - this.field2073;
                }
            } else if (this.field2073 > var2) {
                this.field2077 = -1;
                if (this.field2084 == 0 || this.field2084 > this.field2073 - var2) {
                    this.field2084 = this.field2073 - var2;
                }
            } else {
                this.field2077 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)V")
    private final synchronized void method709(int arg0, int arg1) {
        this.field2078 = arg0;
        this.field2079 = arg1;
        this.field2084 = 0;
        this.method717();
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    private final synchronized void method710(int arg0) {
        this.method709(arg0, this.method720());
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public final synchronized void method711(int arg0) {
        this.field2072 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "()Z")
    public final boolean method712() {
        return this.field2084 != 0;
    }

    @OriginalMember(owner = "client!je", name = "j", descriptor = "()I")
    public final synchronized int method713() {
        return this.field2078 == Integer.MIN_VALUE ? 0 : this.field2078;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "([B[IIIIIIIILje;)I")
    private static final int method714(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class94 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2083 += (var14 - arg3) * arg9.field2082;
        arg9.field2073 += (var14 - arg3) * arg9.field2077;
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
        arg9.field2071 = var12 >> 2;
        arg9.field2074 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II[B[IIIIIIIIIILje;II)I")
    private static final int method715(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        arg13.field2071 -= arg13.field2070 * arg5;
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
        arg13.field2071 += arg13.field2070 * var22;
        arg13.field2083 = arg6;
        arg13.field2073 = arg7;
        arg13.field2074 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public final synchronized void method716(boolean arg0) {
        this.field2081 = (this.field2081 >>> 31) + (this.field2081 ^ this.field2081 >> 31);
        if (arg0) {
            this.field2081 = -this.field2081;
        }
    }

    @OriginalMember(owner = "client!je", name = "k", descriptor = "()V")
    private final void method717() {
        this.field2071 = this.field2078;
        this.field2083 = method692(this.field2078, this.field2079);
        this.field2073 = method724(this.field2078, this.field2079);
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
    public final synchronized void method718(int arg0) {
        int var2 = ((class10) super.field4033).field193.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2074 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(I)V")
    public final synchronized void method719(int arg0) {
        if (this.field2081 < 0) {
            this.field2081 = -arg0;
        } else {
            this.field2081 = arg0;
        }
    }

    @OriginalMember(owner = "client!je", name = "l", descriptor = "()I")
    public final synchronized int method720() {
        return this.field2079 < 0 ? -1 : this.field2079;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II[B[IIIIIIILje;II)I")
    private static final int method721(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, int arg11, int arg12) {
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

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[B[IIIIIIIIIILje;)I")
    private static final int method722(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class94 arg12) {
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
        arg12.field2071 += (var19 - arg4) * arg12.field2070;
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
        arg12.field2083 = var15 >> 2;
        arg12.field2073 = var16 >> 2;
        arg12.field2074 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II[B[IIIIIIIILje;II)I")
    private static final int method723(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
        arg11.field2083 -= arg11.field2082 * arg5;
        arg11.field2073 -= arg11.field2077 * arg5;
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
        arg11.field2083 += arg11.field2082 * arg5;
        arg11.field2073 += arg11.field2077 * arg5;
        arg11.field2071 = arg6;
        arg11.field2074 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)I")
    private static final int method724(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I[B[IIIIIIIIIILje;)I")
    private static final int method725(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class94 arg12) {
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
        arg12.field2071 += (var19 - arg4) * arg12.field2070;
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
        arg12.field2083 = var15 >> 2;
        arg12.field2073 = var16 >> 2;
        arg12.field2074 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "([B[IIIIIIILje;)I")
    private static final int method726(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8) {
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

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lai;II)V")
    private class94(class10 arg0, int arg1, int arg2) {
        super.field4033 = arg0;
        this.field2080 = arg0.field194;
        this.field2076 = arg0.field195;
        this.field2075 = arg0.field192;
        this.field2081 = arg1;
        this.field2078 = arg2;
        this.field2079 = 8192;
        this.field2074 = 0;
        this.method717();
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lai;III)V")
    private class94(class10 arg0, int arg1, int arg2, int arg3) {
        super.field4033 = arg0;
        this.field2080 = arg0.field194;
        this.field2076 = arg0.field195;
        this.field2075 = arg0.field192;
        this.field2081 = arg1;
        this.field2078 = arg2;
        this.field2079 = arg3;
        this.field2074 = 0;
        this.method717();
    }
}
