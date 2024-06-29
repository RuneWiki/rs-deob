import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 extends class40 {

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Z")
    private boolean field2072;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field2067;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    private int field2063;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    private int field2065;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    private int field2068;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[B[IIIIIIIILn;II)I")
    private static final int method679(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class90 arg11, int arg12, int arg13) {
        arg11.field2069 -= arg11.field2071 * arg5;
        arg11.field2074 -= arg11.field2062 * arg5;
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
        arg11.field2069 += arg11.field2071 * arg5;
        arg11.field2074 += arg11.field2062 * arg5;
        arg11.field2068 = arg6;
        arg11.field2076 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
    public final synchronized void method680(int arg0, int arg1) {
        this.method711(arg0, arg1, this.method699());
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public final synchronized void method681(int arg0) {
        if (this.field2067 < 0) {
            this.field2067 = -arg0;
        } else {
            this.field2067 = arg0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[B[IIIIIIIILn;)I")
    private static final int method682(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class90 arg10) {
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
        arg10.field2076 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Lfd;")
    public final class40 method113() {
        return null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lib;III)Ln;")
    public static final class90 method683(class58 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1344 != null && arg0.field1344.length != 0 ? new class90(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public final synchronized void method684(int arg0) {
        if (arg0 == 0) {
            this.method695(0);
            this.method1093(0);
        } else if (this.field2069 == 0 && this.field2074 == 0) {
            this.field2075 = 0;
            this.field2070 = 0;
            this.field2068 = 0;
            this.method1093(0);
        } else {
            int var2 = -this.field2068;
            if (this.field2068 > var2) {
                var2 = this.field2068;
            }
            if (-this.field2069 > var2) {
                var2 = -this.field2069;
            }
            if (this.field2069 > var2) {
                var2 = this.field2069;
            }
            if (-this.field2074 > var2) {
                var2 = -this.field2074;
            }
            if (this.field2074 > var2) {
                var2 = this.field2074;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2075 = arg0;
            this.field2070 = Integer.MIN_VALUE;
            this.field2063 = -this.field2068 / arg0;
            this.field2071 = -this.field2069 / arg0;
            this.field2062 = -this.field2074 / arg0;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I[B[IIIIIIIILn;)I")
    private static final int method685(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class90 arg10) {
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
        arg10.field2076 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()Lfd;")
    public final class40 method106() {
        return null;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public final synchronized void method686(int arg0) {
        this.field2065 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II[B[IIIIIIIILn;II)I")
    private static final int method687(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class90 arg11, int arg12, int arg13) {
        arg11.field2069 -= arg11.field2071 * arg5;
        arg11.field2074 -= arg11.field2062 * arg5;
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
        arg11.field2069 += arg11.field2071 * arg5;
        arg11.field2074 += arg11.field2062 * arg5;
        arg11.field2068 = arg6;
        arg11.field2076 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lib;II)Ln;")
    public static final class90 method688(class58 arg0, int arg1, int arg2) {
        return arg0.field1344 != null && arg0.field1344.length != 0 ? new class90(arg0, (int) ((long) arg0.field1343 * 256L * (long) arg1 / (long) (class139.field3213 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([III)V")
    public final synchronized void method116(int[] arg0, int arg1, int arg2) {
        if (this.field2070 == 0 && this.field2075 == 0) {
            this.method104(arg2);
        } else {
            class58 var4 = (class58) super.field947;
            int var5 = this.field2073 << 8;
            int var6 = this.field2066 << 8;
            int var7 = var4.field1344.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2065 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2076 < 0) {
                if (this.field2067 <= 0) {
                    this.method717();
                    this.method1093(0);
                    return;
                }
                this.field2076 = 0;
            }
            if (this.field2076 >= var7) {
                if (this.field2067 >= 0) {
                    this.method717();
                    this.method1093(0);
                    return;
                }
                this.field2076 = var7 - 1;
            }
            if (this.field2065 < 0) {
                if (this.field2072) {
                    if (this.field2067 < 0) {
                        var9 = this.method690(arg0, arg1, var5, var10, var4.field1344[this.field2073]);
                        if (this.field2076 >= var5) {
                            return;
                        }
                        this.field2076 = var5 + var5 - 1 - this.field2076;
                        this.field2067 = -this.field2067;
                    }
                    while (true) {
                        int var11 = this.method706(arg0, var9, var6, var10, var4.field1344[this.field2066 - 1]);
                        if (this.field2076 < var6) {
                            return;
                        }
                        this.field2076 = var6 + var6 - 1 - this.field2076;
                        this.field2067 = -this.field2067;
                        var9 = this.method690(arg0, var11, var5, var10, var4.field1344[this.field2073]);
                        if (this.field2076 >= var5) {
                            return;
                        }
                        this.field2076 = var5 + var5 - 1 - this.field2076;
                        this.field2067 = -this.field2067;
                    }
                } else if (this.field2067 < 0) {
                    while (true) {
                        var9 = this.method690(arg0, var9, var5, var10, var4.field1344[this.field2066 - 1]);
                        if (this.field2076 >= var5) {
                            return;
                        }
                        this.field2076 = var6 - 1 - (var6 - 1 - this.field2076) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method706(arg0, var9, var6, var10, var4.field1344[this.field2073]);
                        if (this.field2076 < var6) {
                            return;
                        }
                        this.field2076 = (this.field2076 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2065 > 0) {
                    if (this.field2072) {
                        label130: {
                            if (this.field2067 < 0) {
                                var9 = this.method690(arg0, arg1, var5, var10, var4.field1344[this.field2073]);
                                if (this.field2076 >= var5) {
                                    return;
                                }
                                this.field2076 = var5 + var5 - 1 - this.field2076;
                                this.field2067 = -this.field2067;
                                if (--this.field2065 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method706(arg0, var9, var6, var10, var4.field1344[this.field2066 - 1]);
                                if (this.field2076 < var6) {
                                    return;
                                }
                                this.field2076 = var6 + var6 - 1 - this.field2076;
                                this.field2067 = -this.field2067;
                                if (--this.field2065 == 0) {
                                    break;
                                }
                                var9 = this.method690(arg0, var9, var5, var10, var4.field1344[this.field2073]);
                                if (this.field2076 >= var5) {
                                    return;
                                }
                                this.field2076 = var5 + var5 - 1 - this.field2076;
                                this.field2067 = -this.field2067;
                            } while (--this.field2065 != 0);
                        }
                    } else if (this.field2067 < 0) {
                        while (true) {
                            var9 = this.method690(arg0, var9, var5, var10, var4.field1344[this.field2066 - 1]);
                            if (this.field2076 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2076) / var8;
                            if (var12 >= this.field2065) {
                                this.field2076 += this.field2065 * var8;
                                this.field2065 = 0;
                                break;
                            }
                            this.field2076 += var8 * var12;
                            this.field2065 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method706(arg0, var9, var6, var10, var4.field1344[this.field2073]);
                            if (this.field2076 < var6) {
                                return;
                            }
                            int var13 = (this.field2076 - var5) / var8;
                            if (var13 >= this.field2065) {
                                this.field2076 -= this.field2065 * var8;
                                this.field2065 = 0;
                                break;
                            }
                            this.field2076 -= var8 * var13;
                            this.field2065 -= var13;
                        }
                    }
                }
                if (this.field2067 < 0) {
                    this.method690(arg0, var9, 0, var10, 0);
                    if (this.field2076 < 0) {
                        this.field2076 = -1;
                        this.method717();
                        this.method1093(0);
                        return;
                    }
                } else {
                    this.method706(arg0, var9, var7, var10, 0);
                    if (this.field2076 >= var7) {
                        this.field2076 = var7;
                        this.method717();
                        this.method1093(0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II[B[IIIIIIIILn;II)I")
    private static final int method689(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class90 arg11, int arg12, int arg13) {
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
        arg11.field2076 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([IIIII)I")
    private final int method690(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2075 <= 0) {
                if (this.field2067 == -256 && (this.field2076 & 255) == 0) {
                    if (class56.field1311) {
                        return method685(0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, 0, arg3, arg2, this);
                    }
                    return method698(((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, 0, arg3, arg2, this);
                }
                if (class56.field1311) {
                    return method689(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, 0, arg3, arg2, this, this.field2067, arg4);
                }
                return method715(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, 0, arg3, arg2, this, this.field2067, arg4);
            }
            int var6 = this.field2075 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2075 += arg1;
            if (this.field2067 == -256 && (this.field2076 & 255) == 0) {
                if (class56.field1311) {
                    arg1 = method709(0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, this.field2071, this.field2062, 0, var6, arg2, this);
                } else {
                    arg1 = method710(((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, this.field2063, 0, var6, arg2, this);
                }
            } else if (class56.field1311) {
                arg1 = method691(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, this.field2071, this.field2062, 0, var6, arg2, this, this.field2067, arg4);
            } else {
                arg1 = method687(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, this.field2063, 0, var6, arg2, this, this.field2067, arg4);
            }
            this.field2075 -= arg1;
            if (this.field2075 != 0) {
                return arg1;
            }
        } while (!this.method705());
        return arg3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[B[IIIIIIIIIILn;II)I")
    private static final int method691(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class90 arg13, int arg14, int arg15) {
        arg13.field2068 -= arg13.field2063 * arg5;
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
        arg13.field2068 += arg13.field2063 * var22;
        arg13.field2069 = arg6;
        arg13.field2074 = arg7;
        arg13.field2076 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
    public final synchronized void method692(int arg0) {
        this.method693(arg0 << 6, this.method699());
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
    private final synchronized void method693(int arg0, int arg1) {
        this.field2070 = arg0;
        this.field2064 = arg1;
        this.field2075 = 0;
        this.method716();
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
    public final int method322() {
        int var1 = this.field2068 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2065 == 0) {
            var2 -= this.field2076 * var2 / (((class58) super.field947).field1344.length << 8);
        } else if (this.field2065 >= 0) {
            var2 -= this.field2073 * var2 / ((class58) super.field947).field1344.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "()I")
    public final synchronized int method694() {
        return this.field2067 < 0 ? -this.field2067 : this.field2067;
    }

    @OriginalMember(owner = "client!n", name = "i", descriptor = "(I)V")
    private final synchronized void method695(int arg0) {
        this.method693(arg0, this.method699());
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(II[B[IIIIIIIILn;II)I")
    private static final int method696(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class90 arg11, int arg12, int arg13) {
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
        arg11.field2076 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[B[IIIIIIIIIILn;)I")
    private static final int method697(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class90 arg12) {
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
        arg12.field2068 += (var19 - arg4) * arg12.field2063;
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
        arg12.field2069 = var15 >> 2;
        arg12.field2074 = var16 >> 2;
        arg12.field2076 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B[IIIIIIILn;)I")
    private static final int method698(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8) {
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
        arg8.field2076 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "()I")
    public final synchronized int method699() {
        return this.field2064 < 0 ? -1 : this.field2064;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B[IIIIIIIILn;)I")
    private static final int method700(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class90 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2069 += (var14 - arg3) * arg9.field2071;
        arg9.field2074 += (var14 - arg3) * arg9.field2062;
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
        arg9.field2068 = var12 >> 2;
        arg9.field2076 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "()Z")
    public final boolean method701() {
        return this.field2076 < 0 || this.field2076 >= ((class58) super.field947).field1344.length << 8;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(II)I")
    private static final int method702(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!n", name = "h", descriptor = "()I")
    public final synchronized int method703() {
        return this.field2070 == Integer.MIN_VALUE ? 0 : this.field2070;
    }

    @OriginalMember(owner = "client!n", name = "j", descriptor = "(I)V")
    public final synchronized void method704(int arg0) {
        int var2 = ((class58) super.field947).field1344.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2076 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final synchronized void method104(int arg0) {
        if (this.field2075 > 0) {
            if (arg0 >= this.field2075) {
                if (this.field2070 == Integer.MIN_VALUE) {
                    this.field2070 = 0;
                    this.field2068 = this.field2069 = this.field2074 = 0;
                    this.method1093(0);
                    arg0 = this.field2075;
                }
                this.field2075 = 0;
                this.method716();
            } else {
                this.field2068 += this.field2063 * arg0;
                this.field2069 += this.field2071 * arg0;
                this.field2074 += this.field2062 * arg0;
                this.field2075 -= arg0;
            }
        }
        class58 var2 = (class58) super.field947;
        int var3 = this.field2073 << 8;
        int var4 = this.field2066 << 8;
        int var5 = var2.field1344.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2065 = 0;
        }
        if (this.field2076 < 0) {
            if (this.field2067 <= 0) {
                this.method717();
                this.method1093(0);
                return;
            }
            this.field2076 = 0;
        }
        if (this.field2076 >= var5) {
            if (this.field2067 >= 0) {
                this.method717();
                this.method1093(0);
                return;
            }
            this.field2076 = var5 - 1;
        }
        this.field2076 += this.field2067 * arg0;
        if (this.field2065 < 0) {
            if (!this.field2072) {
                if (this.field2067 < 0) {
                    if (this.field2076 < var3) {
                        this.field2076 = var4 - 1 - (var4 - 1 - this.field2076) % var6;
                    }
                } else if (this.field2076 >= var4) {
                    this.field2076 = (this.field2076 - var3) % var6 + var3;
                }
            } else {
                if (this.field2067 < 0) {
                    if (this.field2076 >= var3) {
                        return;
                    }
                    this.field2076 = var3 + var3 - 1 - this.field2076;
                    this.field2067 = -this.field2067;
                }
                while (this.field2076 >= var4) {
                    this.field2076 = var4 + var4 - 1 - this.field2076;
                    this.field2067 = -this.field2067;
                    if (this.field2076 >= var3) {
                        return;
                    }
                    this.field2076 = var3 + var3 - 1 - this.field2076;
                    this.field2067 = -this.field2067;
                }
            }
        } else {
            if (this.field2065 > 0) {
                if (this.field2072) {
                    label125: {
                        if (this.field2067 < 0) {
                            if (this.field2076 >= var3) {
                                return;
                            }
                            this.field2076 = var3 + var3 - 1 - this.field2076;
                            this.field2067 = -this.field2067;
                            if (--this.field2065 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2076 < var4) {
                                return;
                            }
                            this.field2076 = var4 + var4 - 1 - this.field2076;
                            this.field2067 = -this.field2067;
                            if (--this.field2065 == 0) {
                                break;
                            }
                            if (this.field2076 >= var3) {
                                return;
                            }
                            this.field2076 = var3 + var3 - 1 - this.field2076;
                            this.field2067 = -this.field2067;
                        } while (--this.field2065 != 0);
                    }
                } else if (this.field2067 < 0) {
                    if (this.field2076 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2076) / var6;
                    if (var7 < this.field2065) {
                        this.field2076 += var6 * var7;
                        this.field2065 -= var7;
                        return;
                    }
                    this.field2076 += this.field2065 * var6;
                    this.field2065 = 0;
                } else {
                    if (this.field2076 < var4) {
                        return;
                    }
                    int var8 = (this.field2076 - var3) / var6;
                    if (var8 < this.field2065) {
                        this.field2076 -= var6 * var8;
                        this.field2065 -= var8;
                        return;
                    }
                    this.field2076 -= this.field2065 * var6;
                    this.field2065 = 0;
                }
            }
            if (this.field2067 < 0) {
                if (this.field2076 < 0) {
                    this.field2076 = -1;
                    this.method717();
                    this.method1093(0);
                    return;
                }
            } else if (this.field2076 >= var5) {
                this.field2076 = var5;
                this.method717();
                this.method1093(0);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "i", descriptor = "()Z")
    private final boolean method705() {
        int var1 = this.field2070;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method702(var1, this.field2064);
            var2 = method713(var1, this.field2064);
        }
        if (this.field2068 == var1 && this.field2069 == var3 && this.field2074 == var2) {
            if (this.field2070 == Integer.MIN_VALUE) {
                this.field2070 = 0;
                this.field2068 = this.field2069 = this.field2074 = 0;
                this.method1093(0);
                return true;
            } else {
                this.method716();
                return false;
            }
        } else {
            if (this.field2068 < var1) {
                this.field2063 = 1;
                this.field2075 = var1 - this.field2068;
            } else if (this.field2068 > var1) {
                this.field2063 = -1;
                this.field2075 = this.field2068 - var1;
            } else {
                this.field2063 = 0;
            }
            if (this.field2069 < var3) {
                this.field2071 = 1;
                if (this.field2075 == 0 || this.field2075 > var3 - this.field2069) {
                    this.field2075 = var3 - this.field2069;
                }
            } else if (this.field2069 > var3) {
                this.field2071 = -1;
                if (this.field2075 == 0 || this.field2075 > this.field2069 - var3) {
                    this.field2075 = this.field2069 - var3;
                }
            } else {
                this.field2071 = 0;
            }
            if (this.field2074 < var2) {
                this.field2062 = 1;
                if (this.field2075 == 0 || this.field2075 > var2 - this.field2074) {
                    this.field2075 = var2 - this.field2074;
                }
            } else if (this.field2074 > var2) {
                this.field2062 = -1;
                if (this.field2075 == 0 || this.field2075 > this.field2074 - var2) {
                    this.field2075 = this.field2074 - var2;
                }
            } else {
                this.field2062 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([IIIII)I")
    private final int method706(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2075 <= 0) {
                if (this.field2067 == 256 && (this.field2076 & 255) == 0) {
                    if (class56.field1311) {
                        return method682(0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, 0, arg3, arg2, this);
                    }
                    return method708(((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, 0, arg3, arg2, this);
                }
                if (class56.field1311) {
                    return method696(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, 0, arg3, arg2, this, this.field2067, arg4);
                }
                return method712(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, 0, arg3, arg2, this, this.field2067, arg4);
            }
            int var6 = this.field2075 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2075 += arg1;
            if (this.field2067 == 256 && (this.field2076 & 255) == 0) {
                if (class56.field1311) {
                    arg1 = method697(0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, this.field2071, this.field2062, 0, var6, arg2, this);
                } else {
                    arg1 = method700(((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, this.field2063, 0, var6, arg2, this);
                }
            } else if (class56.field1311) {
                arg1 = method707(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2069, this.field2074, this.field2071, this.field2062, 0, var6, arg2, this, this.field2067, arg4);
            } else {
                arg1 = method679(0, 0, ((class58) super.field947).field1344, arg0, this.field2076, arg1, this.field2068, this.field2063, 0, var6, arg2, this, this.field2067, arg4);
            }
            this.field2075 -= arg1;
            if (this.field2075 != 0) {
                return arg1;
            }
        } while (!this.method705());
        return arg3;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II[B[IIIIIIIIIILn;II)I")
    private static final int method707(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class90 arg13, int arg14, int arg15) {
        arg13.field2068 -= arg13.field2063 * arg5;
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
        arg13.field2068 += arg13.field2063 * var22;
        arg13.field2069 = arg6;
        arg13.field2074 = arg7;
        arg13.field2076 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([B[IIIIIIILn;)I")
    private static final int method708(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8) {
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
        arg8.field2076 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()I")
    public final int method87() {
        return this.field2070 == 0 && this.field2075 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I[B[IIIIIIIIIILn;)I")
    private static final int method709(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class90 arg12) {
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
        arg12.field2068 += (var19 - arg4) * arg12.field2063;
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
        arg12.field2069 = var15 >> 2;
        arg12.field2074 = var16 >> 2;
        arg12.field2076 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "([B[IIIIIIIILn;)I")
    private static final int method710(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class90 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2069 += (var14 - arg3) * arg9.field2071;
        arg9.field2074 += (var14 - arg3) * arg9.field2062;
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
        arg9.field2068 = var12 >> 2;
        arg9.field2076 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public final synchronized void method711(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method693(arg1, arg2);
        } else {
            int var4 = method702(arg1, arg2);
            int var5 = method713(arg1, arg2);
            if (this.field2069 == var4 && this.field2074 == var5) {
                this.field2075 = 0;
            } else {
                int var6 = arg1 - this.field2068;
                if (this.field2068 - arg1 > var6) {
                    var6 = this.field2068 - arg1;
                }
                if (var4 - this.field2069 > var6) {
                    var6 = var4 - this.field2069;
                }
                if (this.field2069 - var4 > var6) {
                    var6 = this.field2069 - var4;
                }
                if (var5 - this.field2074 > var6) {
                    var6 = var5 - this.field2074;
                }
                if (this.field2074 - var5 > var6) {
                    var6 = this.field2074 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2075 = arg0;
                this.field2070 = arg1;
                this.field2064 = arg2;
                this.field2063 = (arg1 - this.field2068) / arg0;
                this.field2071 = (var4 - this.field2069) / arg0;
                this.field2062 = (var5 - this.field2074) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[B[IIIIIIILn;II)I")
    private static final int method712(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class90 arg10, int arg11, int arg12) {
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
        arg10.field2076 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(II)I")
    private static final int method713(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public final synchronized void method714(boolean arg0) {
        this.field2067 = (this.field2067 >>> 31) + (this.field2067 ^ this.field2067 >> 31);
        if (arg0) {
            this.field2067 = -this.field2067;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II[B[IIIIIIILn;II)I")
    private static final int method715(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class90 arg10, int arg11, int arg12) {
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
        arg10.field2076 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lib;II)V")
    private class90(class58 arg0, int arg1, int arg2) {
        super.field947 = arg0;
        this.field2073 = arg0.field1341;
        this.field2066 = arg0.field1342;
        this.field2072 = arg0.field1340;
        this.field2067 = arg1;
        this.field2070 = arg2;
        this.field2064 = 8192;
        this.field2076 = 0;
        this.method716();
    }

    @OriginalMember(owner = "client!n", name = "j", descriptor = "()V")
    private final void method716() {
        this.field2068 = this.field2070;
        this.field2069 = method702(this.field2070, this.field2064);
        this.field2074 = method713(this.field2070, this.field2064);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lib;III)V")
    private class90(class58 arg0, int arg1, int arg2, int arg3) {
        super.field947 = arg0;
        this.field2073 = arg0.field1341;
        this.field2066 = arg0.field1342;
        this.field2072 = arg0.field1340;
        this.field2067 = arg1;
        this.field2070 = arg2;
        this.field2064 = arg3;
        this.field2076 = 0;
        this.method716();
    }

    @OriginalMember(owner = "client!n", name = "k", descriptor = "()V")
    private final void method717() {
        if (this.field2075 != 0) {
            if (this.field2070 == Integer.MIN_VALUE) {
                this.field2070 = 0;
            }
            this.field2075 = 0;
            this.method716();
        }
    }

    @OriginalMember(owner = "client!n", name = "l", descriptor = "()Z")
    public final boolean method718() {
        return this.field2075 != 0;
    }
}
