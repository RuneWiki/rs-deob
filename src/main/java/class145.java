import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class145 extends class194 {

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
    private boolean field2170;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    private int field2169;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    private int field2163;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    private int field2167;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field2171;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()Log;")
    public final class194 method947() {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
    public final int method948() {
        return this.field2169 == 0 && this.field2164 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIILwb;II)I")
    private static final int method949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10, int arg11, int arg12) {
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
        arg10.field2168 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    private final synchronized void method950(int arg0) {
        this.method992(arg0, this.method983());
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIIIIILwb;II)I")
    private static final int method951(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class145 arg13, int arg14, int arg15) {
        arg13.field2172 -= arg13.field2161 * arg5;
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
        arg13.field2172 += arg13.field2161 * var22;
        arg13.field2167 = arg6;
        arg13.field2165 = arg7;
        arg13.field2168 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final synchronized void method952(int arg0) {
        if (this.field2164 > 0) {
            if (arg0 >= this.field2164) {
                if (this.field2169 == Integer.MIN_VALUE) {
                    this.field2169 = 0;
                    this.field2172 = this.field2167 = this.field2165 = 0;
                    this.method1764(64);
                    arg0 = this.field2164;
                }
                this.field2164 = 0;
                this.method975();
            } else {
                this.field2172 += this.field2161 * arg0;
                this.field2167 += this.field2171 * arg0;
                this.field2165 += this.field2159 * arg0;
                this.field2164 -= arg0;
            }
        }
        class131 var2 = (class131) super.field3074;
        int var3 = this.field2158 << 8;
        int var4 = this.field2166 << 8;
        int var5 = var2.field1873.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2160 = 0;
        }
        if (this.field2168 < 0) {
            if (this.field2162 <= 0) {
                this.method960();
                this.method1764(64);
                return;
            }
            this.field2168 = 0;
        }
        if (this.field2168 >= var5) {
            if (this.field2162 >= 0) {
                this.method960();
                this.method1764(64);
                return;
            }
            this.field2168 = var5 - 1;
        }
        this.field2168 += this.field2162 * arg0;
        if (this.field2160 < 0) {
            if (!this.field2170) {
                if (this.field2162 < 0) {
                    if (this.field2168 < var3) {
                        this.field2168 = var4 - 1 - (var4 - 1 - this.field2168) % var6;
                    }
                } else if (this.field2168 >= var4) {
                    this.field2168 = (this.field2168 - var3) % var6 + var3;
                }
            } else {
                if (this.field2162 < 0) {
                    if (this.field2168 >= var3) {
                        return;
                    }
                    this.field2168 = var3 + var3 - 1 - this.field2168;
                    this.field2162 = -this.field2162;
                }
                while (this.field2168 >= var4) {
                    this.field2168 = var4 + var4 - 1 - this.field2168;
                    this.field2162 = -this.field2162;
                    if (this.field2168 >= var3) {
                        return;
                    }
                    this.field2168 = var3 + var3 - 1 - this.field2168;
                    this.field2162 = -this.field2162;
                }
            }
        } else {
            if (this.field2160 > 0) {
                if (this.field2170) {
                    label125: {
                        if (this.field2162 < 0) {
                            if (this.field2168 >= var3) {
                                return;
                            }
                            this.field2168 = var3 + var3 - 1 - this.field2168;
                            this.field2162 = -this.field2162;
                            if (--this.field2160 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2168 < var4) {
                                return;
                            }
                            this.field2168 = var4 + var4 - 1 - this.field2168;
                            this.field2162 = -this.field2162;
                            if (--this.field2160 == 0) {
                                break;
                            }
                            if (this.field2168 >= var3) {
                                return;
                            }
                            this.field2168 = var3 + var3 - 1 - this.field2168;
                            this.field2162 = -this.field2162;
                        } while (--this.field2160 != 0);
                    }
                } else if (this.field2162 < 0) {
                    if (this.field2168 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2168) / var6;
                    if (var7 < this.field2160) {
                        this.field2168 += var6 * var7;
                        this.field2160 -= var7;
                        return;
                    }
                    this.field2168 += this.field2160 * var6;
                    this.field2160 = 0;
                } else {
                    if (this.field2168 < var4) {
                        return;
                    }
                    int var8 = (this.field2168 - var3) / var6;
                    if (var8 < this.field2160) {
                        this.field2168 -= var6 * var8;
                        this.field2160 -= var8;
                        return;
                    }
                    this.field2168 -= this.field2160 * var6;
                    this.field2160 = 0;
                }
            }
            if (this.field2162 < 0) {
                if (this.field2168 < 0) {
                    this.field2168 = -1;
                    this.method960();
                    this.method1764(64);
                    return;
                }
            } else if (this.field2168 >= var5) {
                this.field2168 = var5;
                this.method960();
                this.method1764(64);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public final synchronized void method953(int arg0) {
        this.field2160 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lla;III)Lwb;")
    public static final class145 method954(class131 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1873 != null && arg0.field1873.length != 0 ? new class145(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method955(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
        arg11.field2167 -= arg11.field2171 * arg5;
        arg11.field2165 -= arg11.field2159 * arg5;
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
        arg11.field2167 += arg11.field2171 * arg5;
        arg11.field2165 += arg11.field2159 * arg5;
        arg11.field2172 = arg6;
        arg11.field2168 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public final synchronized void method956(int arg0) {
        if (arg0 == 0) {
            this.method950(0);
            this.method1764(64);
        } else if (this.field2167 == 0 && this.field2165 == 0) {
            this.field2164 = 0;
            this.field2169 = 0;
            this.field2172 = 0;
            this.method1764(64);
        } else {
            int var2 = -this.field2172;
            if (this.field2172 > var2) {
                var2 = this.field2172;
            }
            if (-this.field2167 > var2) {
                var2 = -this.field2167;
            }
            if (this.field2167 > var2) {
                var2 = this.field2167;
            }
            if (-this.field2165 > var2) {
                var2 = -this.field2165;
            }
            if (this.field2165 > var2) {
                var2 = this.field2165;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2164 = arg0;
            this.field2169 = Integer.MIN_VALUE;
            this.field2161 = -this.field2172 / arg0;
            this.field2171 = -this.field2167 / arg0;
            this.field2159 = -this.field2165 / arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public final synchronized void method957(int arg0) {
        int var2 = ((class131) super.field3074).field1873.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2168 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    private static final int method958(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public final synchronized void method959(int arg0) {
        if (this.field2162 < 0) {
            this.field2162 = -arg0;
        } else {
            this.field2162 = arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
    private final void method960() {
        if (this.field2164 != 0) {
            if (this.field2169 == Integer.MIN_VALUE) {
                this.field2169 = 0;
            }
            this.field2164 = 0;
            this.method975();
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method961(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
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
        arg11.field2168 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B[IIIIIIIILwb;)I")
    private static final int method962(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10) {
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
        arg10.field2168 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final synchronized void method963(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method992(arg1, arg2);
        } else {
            int var4 = method977(arg1, arg2);
            int var5 = method958(arg1, arg2);
            if (this.field2167 == var4 && this.field2165 == var5) {
                this.field2164 = 0;
            } else {
                int var6 = arg1 - this.field2172;
                if (this.field2172 - arg1 > var6) {
                    var6 = this.field2172 - arg1;
                }
                if (var4 - this.field2167 > var6) {
                    var6 = var4 - this.field2167;
                }
                if (this.field2167 - var4 > var6) {
                    var6 = this.field2167 - var4;
                }
                if (var5 - this.field2165 > var6) {
                    var6 = var5 - this.field2165;
                }
                if (this.field2165 - var5 > var6) {
                    var6 = this.field2165 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2164 = arg0;
                this.field2169 = arg1;
                this.field2163 = arg2;
                this.field2161 = (arg1 - this.field2172) / arg0;
                this.field2171 = (var4 - this.field2167) / arg0;
                this.field2159 = (var5 - this.field2165) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B[IIIIIIILwb;)I")
    private static final int method964(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class145 arg8) {
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
        arg8.field2168 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)I")
    private final int method965(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2164 <= 0) {
                if (this.field2162 == -256 && (this.field2168 & 255) == 0) {
                    if (class189.field2953) {
                        return method979(0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, 0, arg3, arg2, this);
                    }
                    return method990(((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, 0, arg3, arg2, this);
                }
                if (class189.field2953) {
                    return method968(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, 0, arg3, arg2, this, this.field2162, arg4);
                }
                return method949(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, 0, arg3, arg2, this, this.field2162, arg4);
            }
            int var6 = this.field2164 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2164 += arg1;
            if (this.field2162 == -256 && (this.field2168 & 255) == 0) {
                if (class189.field2953) {
                    arg1 = method978(0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, this.field2171, this.field2159, 0, var6, arg2, this);
                } else {
                    arg1 = method989(((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, this.field2161, 0, var6, arg2, this);
                }
            } else if (class189.field2953) {
                arg1 = method986(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, this.field2171, this.field2159, 0, var6, arg2, this, this.field2162, arg4);
            } else {
                arg1 = method967(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, this.field2161, 0, var6, arg2, this, this.field2162, arg4);
            }
            this.field2164 -= arg1;
            if (this.field2164 != 0) {
                return arg1;
            }
        } while (!this.method982());
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([IIIII)I")
    private final int method966(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2164 <= 0) {
                if (this.field2162 == 256 && (this.field2168 & 255) == 0) {
                    if (class189.field2953) {
                        return method962(0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, 0, arg3, arg2, this);
                    }
                    return method964(((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, 0, arg3, arg2, this);
                }
                if (class189.field2953) {
                    return method961(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, 0, arg3, arg2, this, this.field2162, arg4);
                }
                return method971(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, 0, arg3, arg2, this, this.field2162, arg4);
            }
            int var6 = this.field2164 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2164 += arg1;
            if (this.field2162 == 256 && (this.field2168 & 255) == 0) {
                if (class189.field2953) {
                    arg1 = method972(0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, this.field2171, this.field2159, 0, var6, arg2, this);
                } else {
                    arg1 = method981(((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, this.field2161, 0, var6, arg2, this);
                }
            } else if (class189.field2953) {
                arg1 = method951(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2167, this.field2165, this.field2171, this.field2159, 0, var6, arg2, this, this.field2162, arg4);
            } else {
                arg1 = method955(0, 0, ((class131) super.field3074).field1873, arg0, this.field2168, arg1, this.field2172, this.field2161, 0, var6, arg2, this, this.field2162, arg4);
            }
            this.field2164 -= arg1;
            if (this.field2164 != 0) {
                return arg1;
            }
        } while (!this.method982());
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method967(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
        arg11.field2167 -= arg11.field2171 * arg5;
        arg11.field2165 -= arg11.field2159 * arg5;
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
        arg11.field2167 += arg11.field2171 * arg5;
        arg11.field2165 += arg11.field2159 * arg5;
        arg11.field2172 = arg6;
        arg11.field2168 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method968(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class145 arg11, int arg12, int arg13) {
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
        arg11.field2168 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V")
    public final synchronized void method969(int[] arg0, int arg1, int arg2) {
        if (this.field2169 == 0 && this.field2164 == 0) {
            this.method952(arg2);
        } else {
            class131 var4 = (class131) super.field3074;
            int var5 = this.field2158 << 8;
            int var6 = this.field2166 << 8;
            int var7 = var4.field1873.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2160 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2168 < 0) {
                if (this.field2162 <= 0) {
                    this.method960();
                    this.method1764(64);
                    return;
                }
                this.field2168 = 0;
            }
            if (this.field2168 >= var7) {
                if (this.field2162 >= 0) {
                    this.method960();
                    this.method1764(64);
                    return;
                }
                this.field2168 = var7 - 1;
            }
            if (this.field2160 < 0) {
                if (this.field2170) {
                    if (this.field2162 < 0) {
                        var9 = this.method965(arg0, arg1, var5, var10, var4.field1873[this.field2158]);
                        if (this.field2168 >= var5) {
                            return;
                        }
                        this.field2168 = var5 + var5 - 1 - this.field2168;
                        this.field2162 = -this.field2162;
                    }
                    while (true) {
                        int var11 = this.method966(arg0, var9, var6, var10, var4.field1873[this.field2166 - 1]);
                        if (this.field2168 < var6) {
                            return;
                        }
                        this.field2168 = var6 + var6 - 1 - this.field2168;
                        this.field2162 = -this.field2162;
                        var9 = this.method965(arg0, var11, var5, var10, var4.field1873[this.field2158]);
                        if (this.field2168 >= var5) {
                            return;
                        }
                        this.field2168 = var5 + var5 - 1 - this.field2168;
                        this.field2162 = -this.field2162;
                    }
                } else if (this.field2162 < 0) {
                    while (true) {
                        var9 = this.method965(arg0, var9, var5, var10, var4.field1873[this.field2166 - 1]);
                        if (this.field2168 >= var5) {
                            return;
                        }
                        this.field2168 = var6 - 1 - (var6 - 1 - this.field2168) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method966(arg0, var9, var6, var10, var4.field1873[this.field2158]);
                        if (this.field2168 < var6) {
                            return;
                        }
                        this.field2168 = (this.field2168 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2160 > 0) {
                    if (this.field2170) {
                        label130: {
                            if (this.field2162 < 0) {
                                var9 = this.method965(arg0, arg1, var5, var10, var4.field1873[this.field2158]);
                                if (this.field2168 >= var5) {
                                    return;
                                }
                                this.field2168 = var5 + var5 - 1 - this.field2168;
                                this.field2162 = -this.field2162;
                                if (--this.field2160 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method966(arg0, var9, var6, var10, var4.field1873[this.field2166 - 1]);
                                if (this.field2168 < var6) {
                                    return;
                                }
                                this.field2168 = var6 + var6 - 1 - this.field2168;
                                this.field2162 = -this.field2162;
                                if (--this.field2160 == 0) {
                                    break;
                                }
                                var9 = this.method965(arg0, var9, var5, var10, var4.field1873[this.field2158]);
                                if (this.field2168 >= var5) {
                                    return;
                                }
                                this.field2168 = var5 + var5 - 1 - this.field2168;
                                this.field2162 = -this.field2162;
                            } while (--this.field2160 != 0);
                        }
                    } else if (this.field2162 < 0) {
                        while (true) {
                            var9 = this.method965(arg0, var9, var5, var10, var4.field1873[this.field2166 - 1]);
                            if (this.field2168 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2168) / var8;
                            if (var12 >= this.field2160) {
                                this.field2168 += this.field2160 * var8;
                                this.field2160 = 0;
                                break;
                            }
                            this.field2168 += var8 * var12;
                            this.field2160 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method966(arg0, var9, var6, var10, var4.field1873[this.field2158]);
                            if (this.field2168 < var6) {
                                return;
                            }
                            int var13 = (this.field2168 - var5) / var8;
                            if (var13 >= this.field2160) {
                                this.field2168 -= this.field2160 * var8;
                                this.field2160 = 0;
                                break;
                            }
                            this.field2168 -= var8 * var13;
                            this.field2160 -= var13;
                        }
                    }
                }
                if (this.field2162 < 0) {
                    this.method965(arg0, var9, 0, var10, 0);
                    if (this.field2168 < 0) {
                        this.field2168 = -1;
                        this.method960();
                        this.method1764(64);
                        return;
                    }
                } else {
                    this.method966(arg0, var9, var7, var10, 0);
                    if (this.field2168 >= var7) {
                        this.field2168 = var7;
                        this.method960();
                        this.method1764(64);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()I")
    public final synchronized int method970() {
        return this.field2162 < 0 ? -this.field2162 : this.field2162;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIILwb;II)I")
    private static final int method971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10, int arg11, int arg12) {
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
        arg10.field2168 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B[IIIIIIIIIILwb;)I")
    private static final int method972(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class145 arg12) {
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
        arg12.field2172 += (var19 - arg4) * arg12.field2161;
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
        arg12.field2167 = var15 >> 2;
        arg12.field2165 = var16 >> 2;
        arg12.field2168 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
    public final int method973() {
        int var1 = this.field2172 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2160 == 0) {
            var2 -= this.field2168 * var2 / (((class131) super.field3074).field1873.length << 8);
        } else if (this.field2160 >= 0) {
            var2 -= this.field2158 * var2 / ((class131) super.field3074).field1873.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public final synchronized void method974(int arg0) {
        this.method992(arg0 << 6, this.method983());
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
    private final void method975() {
        this.field2172 = this.field2169;
        this.field2167 = method977(this.field2169, this.field2163);
        this.field2165 = method958(this.field2169, this.field2163);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
    public final synchronized void method976(int arg0, int arg1) {
        this.method963(arg0, arg1, this.method983());
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
    private static final int method977(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I[B[IIIIIIIIIILwb;)I")
    private static final int method978(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class145 arg12) {
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
        arg12.field2172 += (var19 - arg4) * arg12.field2161;
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
        arg12.field2167 = var15 >> 2;
        arg12.field2165 = var16 >> 2;
        arg12.field2168 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I[B[IIIIIIIILwb;)I")
    private static final int method979(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10) {
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
        arg10.field2168 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "()I")
    public final synchronized int method980() {
        return this.field2169 == Integer.MIN_VALUE ? 0 : this.field2169;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B[IIIIIIIILwb;)I")
    private static final int method981(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class145 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2167 += (var14 - arg3) * arg9.field2171;
        arg9.field2165 += (var14 - arg3) * arg9.field2159;
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
        arg9.field2172 = var12 >> 2;
        arg9.field2168 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "()Z")
    private final boolean method982() {
        int var1 = this.field2169;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method977(var1, this.field2163);
            var2 = method958(var1, this.field2163);
        }
        if (this.field2172 == var1 && this.field2167 == var3 && this.field2165 == var2) {
            if (this.field2169 == Integer.MIN_VALUE) {
                this.field2169 = 0;
                this.field2172 = this.field2167 = this.field2165 = 0;
                this.method1764(64);
                return true;
            } else {
                this.method975();
                return false;
            }
        } else {
            if (this.field2172 < var1) {
                this.field2161 = 1;
                this.field2164 = var1 - this.field2172;
            } else if (this.field2172 > var1) {
                this.field2161 = -1;
                this.field2164 = this.field2172 - var1;
            } else {
                this.field2161 = 0;
            }
            if (this.field2167 < var3) {
                this.field2171 = 1;
                if (this.field2164 == 0 || this.field2164 > var3 - this.field2167) {
                    this.field2164 = var3 - this.field2167;
                }
            } else if (this.field2167 > var3) {
                this.field2171 = -1;
                if (this.field2164 == 0 || this.field2164 > this.field2167 - var3) {
                    this.field2164 = this.field2167 - var3;
                }
            } else {
                this.field2171 = 0;
            }
            if (this.field2165 < var2) {
                this.field2159 = 1;
                if (this.field2164 == 0 || this.field2164 > var2 - this.field2165) {
                    this.field2164 = var2 - this.field2165;
                }
            } else if (this.field2165 > var2) {
                this.field2159 = -1;
                if (this.field2164 == 0 || this.field2164 > this.field2165 - var2) {
                    this.field2164 = this.field2165 - var2;
                }
            } else {
                this.field2159 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "()I")
    public final synchronized int method983() {
        return this.field2163 < 0 ? -1 : this.field2163;
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "()Z")
    public final boolean method984() {
        return this.field2168 < 0 || this.field2168 >= ((class131) super.field3074).field1873.length << 8;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lla;II)Lwb;")
    public static final class145 method985(class131 arg0, int arg1, int arg2) {
        return arg0.field1873 != null && arg0.field1873.length != 0 ? new class145(arg0, (int) ((long) arg0.field1872 * 256L * (long) arg1 / (long) (class197.field3105 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIIIIILwb;II)I")
    private static final int method986(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class145 arg13, int arg14, int arg15) {
        arg13.field2172 -= arg13.field2161 * arg5;
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
        arg13.field2172 += arg13.field2161 * var22;
        arg13.field2167 = arg6;
        arg13.field2165 = arg7;
        arg13.field2168 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "()Z")
    public final boolean method987() {
        return this.field2164 != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Log;")
    public final class194 method988() {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B[IIIIIIIILwb;)I")
    private static final int method989(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class145 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2167 += (var14 - arg3) * arg9.field2171;
        arg9.field2165 += (var14 - arg3) * arg9.field2159;
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
        arg9.field2172 = var12 >> 2;
        arg9.field2168 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B[IIIIIIILwb;)I")
    private static final int method990(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class145 arg8) {
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
        arg8.field2168 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public final synchronized void method991(boolean arg0) {
        this.field2162 = (this.field2162 >>> 31) + (this.field2162 ^ this.field2162 >> 31);
        if (arg0) {
            this.field2162 = -this.field2162;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
    private final synchronized void method992(int arg0, int arg1) {
        this.field2169 = arg0;
        this.field2163 = arg1;
        this.field2164 = 0;
        this.method975();
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lla;II)V")
    private class145(class131 arg0, int arg1, int arg2) {
        super.field3074 = arg0;
        this.field2158 = arg0.field1875;
        this.field2166 = arg0.field1874;
        this.field2170 = arg0.field1876;
        this.field2162 = arg1;
        this.field2169 = arg2;
        this.field2163 = 8192;
        this.field2168 = 0;
        this.method975();
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lla;III)V")
    private class145(class131 arg0, int arg1, int arg2, int arg3) {
        super.field3074 = arg0;
        this.field2158 = arg0.field1875;
        this.field2166 = arg0.field1874;
        this.field2170 = arg0.field1876;
        this.field2162 = arg1;
        this.field2169 = arg2;
        this.field2163 = arg3;
        this.field2168 = 0;
        this.method975();
    }
}
