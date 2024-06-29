import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class296 extends class413 {

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    private int field4194;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "Z")
    private boolean field4195;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    private int field4186;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    private int field4182;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    private int field4185;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "([B[IIIIIIILvca;)I")
    private static final int method1899(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class296 arg8) {
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
        arg8.field4187 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[B[IIIIIIIILvca;)I")
    private static final int method1900(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class296 arg10) {
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
        arg10.field4187 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[B[IIIIIIILvca;II)I")
    private static final int method1901(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class296 arg10, int arg11, int arg12) {
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
        arg10.field4187 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public final synchronized void method17(int arg0) {
        if (this.field4196 > 0) {
            if (arg0 >= this.field4196) {
                if (this.field4186 == Integer.MIN_VALUE) {
                    this.field4186 = 0;
                    this.field4190 = this.field4189 = this.field4185 = 0;
                    this.method1102((byte) 63);
                    arg0 = this.field4196;
                }
                this.field4196 = 0;
                this.method1924();
            } else {
                this.field4190 += this.field4188 * arg0;
                this.field4189 += this.field4184 * arg0;
                this.field4185 += this.field4183 * arg0;
                this.field4196 -= arg0;
            }
        }
        class78 var2 = (class78) super.field5941;
        int var3 = this.field4194 << 8;
        int var4 = this.field4191 << 8;
        int var5 = var2.field1084.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4182 = 0;
        }
        if (this.field4187 < 0) {
            if (this.field4193 <= 0) {
                this.method1920();
                this.method1102((byte) 116);
                return;
            }
            this.field4187 = 0;
        }
        if (this.field4187 >= var5) {
            if (this.field4193 >= 0) {
                this.method1920();
                this.method1102((byte) 60);
                return;
            }
            this.field4187 = var5 - 1;
        }
        this.field4187 += this.field4193 * arg0;
        if (this.field4182 < 0) {
            if (!this.field4195) {
                if (this.field4193 < 0) {
                    if (this.field4187 < var3) {
                        this.field4187 = var4 - 1 - (var4 - 1 - this.field4187) % var6;
                    }
                } else if (this.field4187 >= var4) {
                    this.field4187 = (this.field4187 - var3) % var6 + var3;
                }
            } else {
                if (this.field4193 < 0) {
                    if (this.field4187 >= var3) {
                        return;
                    }
                    this.field4187 = var3 + var3 - 1 - this.field4187;
                    this.field4193 = -this.field4193;
                }
                while (this.field4187 >= var4) {
                    this.field4187 = var4 + var4 - 1 - this.field4187;
                    this.field4193 = -this.field4193;
                    if (this.field4187 >= var3) {
                        return;
                    }
                    this.field4187 = var3 + var3 - 1 - this.field4187;
                    this.field4193 = -this.field4193;
                }
            }
        } else {
            if (this.field4182 > 0) {
                if (this.field4195) {
                    label125: {
                        if (this.field4193 < 0) {
                            if (this.field4187 >= var3) {
                                return;
                            }
                            this.field4187 = var3 + var3 - 1 - this.field4187;
                            this.field4193 = -this.field4193;
                            if (--this.field4182 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4187 < var4) {
                                return;
                            }
                            this.field4187 = var4 + var4 - 1 - this.field4187;
                            this.field4193 = -this.field4193;
                            if (--this.field4182 == 0) {
                                break;
                            }
                            if (this.field4187 >= var3) {
                                return;
                            }
                            this.field4187 = var3 + var3 - 1 - this.field4187;
                            this.field4193 = -this.field4193;
                        } while (--this.field4182 != 0);
                    }
                } else if (this.field4193 < 0) {
                    if (this.field4187 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4187) / var6;
                    if (var7 < this.field4182) {
                        this.field4187 += var6 * var7;
                        this.field4182 -= var7;
                        return;
                    }
                    this.field4187 += this.field4182 * var6;
                    this.field4182 = 0;
                } else {
                    if (this.field4187 < var4) {
                        return;
                    }
                    int var8 = (this.field4187 - var3) / var6;
                    if (var8 < this.field4182) {
                        this.field4187 -= var6 * var8;
                        this.field4182 -= var8;
                        return;
                    }
                    this.field4187 -= this.field4182 * var6;
                    this.field4182 = 0;
                }
            }
            if (this.field4193 < 0) {
                if (this.field4187 < 0) {
                    this.field4187 = -1;
                    this.method1920();
                    this.method1102((byte) 70);
                    return;
                }
            } else if (this.field4187 >= var5) {
                this.field4187 = var5;
                this.method1920();
                this.method1102((byte) 75);
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[B[IIIIIIIILvca;II)I")
    private static final int method1902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class296 arg11, int arg12, int arg13) {
        arg11.field4189 -= arg11.field4184 * arg5;
        arg11.field4185 -= arg11.field4183 * arg5;
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
        arg11.field4189 += arg11.field4184 * arg5;
        arg11.field4185 += arg11.field4183 * arg5;
        arg11.field4190 = arg6;
        arg11.field4187 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
    public final synchronized void method1903(int arg0) {
        if (this.field4193 < 0) {
            this.field4193 = -arg0;
        } else {
            this.field4193 = arg0;
        }
    }

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "()Z")
    public final boolean method1904() {
        return this.field4187 < 0 || this.field4187 >= ((class78) super.field5941).field1084.length << 8;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "([IIIII)I")
    private final int method1905(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4196 <= 0) {
                if (this.field4193 == -256 && (this.field4187 & 255) == 0) {
                    if (class177.field2341) {
                        return method1918(0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, 0, arg3, arg2, this);
                    }
                    return method1916(((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, 0, arg3, arg2, this);
                }
                if (class177.field2341) {
                    return method1926(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, 0, arg3, arg2, this, this.field4193, arg4);
                }
                return method1931(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, 0, arg3, arg2, this, this.field4193, arg4);
            }
            int var6 = this.field4196 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4196 += arg1;
            if (this.field4193 == -256 && (this.field4187 & 255) == 0) {
                if (class177.field2341) {
                    arg1 = method1934(0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, this.field4184, this.field4183, 0, var6, arg2, this);
                } else {
                    arg1 = method1908(((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, this.field4188, 0, var6, arg2, this);
                }
            } else if (class177.field2341) {
                arg1 = method1917(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, this.field4184, this.field4183, 0, var6, arg2, this, this.field4193, arg4);
            } else {
                arg1 = method1932(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, this.field4188, 0, var6, arg2, this, this.field4193, arg4);
            }
            this.field4196 -= arg1;
            if (this.field4196 != 0) {
                return arg1;
            }
        } while (!this.method1938());
        return arg3;
    }

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "()I")
    public final synchronized int method1906() {
        return this.field4186 == Integer.MIN_VALUE ? 0 : this.field4186;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
    public final synchronized void method1907(int arg0) {
        this.field4182 = arg0;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "([B[IIIIIIIILvca;)I")
    private static final int method1908(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class296 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4189 += (var14 - arg3) * arg9.field4184;
        arg9.field4185 += (var14 - arg3) * arg9.field4183;
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
        arg9.field4190 = var12 >> 2;
        arg9.field4187 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[B[IIIIIIIIIILvca;II)I")
    private static final int method1909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class296 arg13, int arg14, int arg15) {
        arg13.field4190 -= arg13.field4188 * arg5;
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
        arg13.field4190 += arg13.field4188 * var22;
        arg13.field4189 = arg6;
        arg13.field4185 = arg7;
        arg13.field4187 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "()I")
    public final synchronized int method1910() {
        return this.field4193 < 0 ? -this.field4193 : this.field4193;
    }

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)V")
    public final synchronized void method1911(int arg0) {
        if (arg0 == 0) {
            this.method1921(0);
            this.method1102((byte) 77);
        } else if (this.field4189 == 0 && this.field4185 == 0) {
            this.field4196 = 0;
            this.field4186 = 0;
            this.field4190 = 0;
            this.method1102((byte) 70);
        } else {
            int var2 = -this.field4190;
            if (this.field4190 > var2) {
                var2 = this.field4190;
            }
            if (-this.field4189 > var2) {
                var2 = -this.field4189;
            }
            if (this.field4189 > var2) {
                var2 = this.field4189;
            }
            if (-this.field4185 > var2) {
                var2 = -this.field4185;
            }
            if (this.field4185 > var2) {
                var2 = this.field4185;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4196 = arg0;
            this.field4186 = Integer.MIN_VALUE;
            this.field4188 = -this.field4190 / arg0;
            this.field4184 = -this.field4189 / arg0;
            this.field4183 = -this.field4185 / arg0;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[B[IIIIIIIIIILvca;)I")
    private static final int method1912(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class296 arg12) {
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
        arg12.field4190 += (var19 - arg4) * arg12.field4188;
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
        arg12.field4189 = var15 >> 2;
        arg12.field4185 = var16 >> 2;
        arg12.field4187 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)I")
    private static final int method1913(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "(I)V")
    public final synchronized void method1914(int arg0) {
        this.method1915(arg0 << 6, this.method1939());
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(II)V")
    private final synchronized void method1915(int arg0, int arg1) {
        this.field4186 = arg0;
        this.field4192 = arg1;
        this.field4196 = 0;
        this.method1924();
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "([B[IIIIIIILvca;)I")
    private static final int method1916(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class296 arg8) {
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
        arg8.field4187 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(II[B[IIIIIIIIIILvca;II)I")
    private static final int method1917(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class296 arg13, int arg14, int arg15) {
        arg13.field4190 -= arg13.field4188 * arg5;
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
        arg13.field4190 += arg13.field4188 * var22;
        arg13.field4189 = arg6;
        arg13.field4185 = arg7;
        arg13.field4187 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I[B[IIIIIIIILvca;)I")
    private static final int method1918(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class296 arg10) {
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
        arg10.field4187 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "(I)V")
    public final synchronized void method1919(int arg0) {
        this.method1915(this.method1906(), arg0);
    }

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "()V")
    private final void method1920() {
        if (this.field4196 != 0) {
            if (this.field4186 == Integer.MIN_VALUE) {
                this.field4186 = 0;
            }
            this.field4196 = 0;
            this.method1924();
        }
    }

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "(I)V")
    private final synchronized void method1921(int arg0) {
        this.method1915(arg0, this.method1939());
    }

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "()Z")
    public final boolean method1922() {
        return this.field4196 != 0;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)V")
    public final synchronized void method1923(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1915(arg1, arg2);
        } else {
            int var4 = method1913(arg1, arg2);
            int var5 = method1927(arg1, arg2);
            if (this.field4189 == var4 && this.field4185 == var5) {
                this.field4196 = 0;
            } else {
                int var6 = arg1 - this.field4190;
                if (this.field4190 - arg1 > var6) {
                    var6 = this.field4190 - arg1;
                }
                if (var4 - this.field4189 > var6) {
                    var6 = var4 - this.field4189;
                }
                if (this.field4189 - var4 > var6) {
                    var6 = this.field4189 - var4;
                }
                if (var5 - this.field4185 > var6) {
                    var6 = var5 - this.field4185;
                }
                if (this.field4185 - var5 > var6) {
                    var6 = this.field4185 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4196 = arg0;
                this.field4186 = arg1;
                this.field4192 = arg2;
                this.field4188 = (arg1 - this.field4190) / arg0;
                this.field4184 = (var4 - this.field4189) / arg0;
                this.field4183 = (var5 - this.field4185) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "()V")
    private final void method1924() {
        this.field4190 = this.field4186;
        this.field4189 = method1913(this.field4186, this.field4192);
        this.field4185 = method1927(this.field4186, this.field4192);
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "()Lpp;")
    public final class413 method13() {
        return null;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lpv;III)Lvca;")
    public static final class296 method1925(class78 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1084 != null && arg0.field1084.length != 0 ? new class296(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "()I")
    public final int method24() {
        return this.field4186 == 0 && this.field4196 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(II[B[IIIIIIIILvca;II)I")
    private static final int method1926(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class296 arg11, int arg12, int arg13) {
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
        arg11.field4187 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(II)I")
    private static final int method1927(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(II[B[IIIIIIIILvca;II)I")
    private static final int method1928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class296 arg11, int arg12, int arg13) {
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
        arg11.field4187 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
    public final synchronized void method1929(boolean arg0) {
        this.field4193 = (this.field4193 >>> 31) + (this.field4193 ^ this.field4193 >> 31);
        if (arg0) {
            this.field4193 = -this.field4193;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "([IIIII)I")
    private final int method1930(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4196 <= 0) {
                if (this.field4193 == 256 && (this.field4187 & 255) == 0) {
                    if (class177.field2341) {
                        return method1900(0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, 0, arg3, arg2, this);
                    }
                    return method1899(((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, 0, arg3, arg2, this);
                }
                if (class177.field2341) {
                    return method1928(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, 0, arg3, arg2, this, this.field4193, arg4);
                }
                return method1901(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, 0, arg3, arg2, this, this.field4193, arg4);
            }
            int var6 = this.field4196 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4196 += arg1;
            if (this.field4193 == 256 && (this.field4187 & 255) == 0) {
                if (class177.field2341) {
                    arg1 = method1912(0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, this.field4184, this.field4183, 0, var6, arg2, this);
                } else {
                    arg1 = method1935(((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, this.field4188, 0, var6, arg2, this);
                }
            } else if (class177.field2341) {
                arg1 = method1909(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4189, this.field4185, this.field4184, this.field4183, 0, var6, arg2, this, this.field4193, arg4);
            } else {
                arg1 = method1902(0, 0, ((class78) super.field5941).field1084, arg0, this.field4187, arg1, this.field4190, this.field4188, 0, var6, arg2, this, this.field4193, arg4);
            }
            this.field4196 -= arg1;
            if (this.field4196 != 0) {
                return arg1;
            }
        } while (!this.method1938());
        return arg3;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(II[B[IIIIIIILvca;II)I")
    private static final int method1931(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class296 arg10, int arg11, int arg12) {
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
        arg10.field4187 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "([III)V")
    public final synchronized void method18(int[] arg0, int arg1, int arg2) {
        if (this.field4186 == 0 && this.field4196 == 0) {
            this.method17(arg2);
        } else {
            class78 var4 = (class78) super.field5941;
            int var5 = this.field4194 << 8;
            int var6 = this.field4191 << 8;
            int var7 = var4.field1084.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4182 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4187 < 0) {
                if (this.field4193 <= 0) {
                    this.method1920();
                    this.method1102((byte) 77);
                    return;
                }
                this.field4187 = 0;
            }
            if (this.field4187 >= var7) {
                if (this.field4193 >= 0) {
                    this.method1920();
                    this.method1102((byte) 78);
                    return;
                }
                this.field4187 = var7 - 1;
            }
            if (this.field4182 < 0) {
                if (this.field4195) {
                    if (this.field4193 < 0) {
                        var9 = this.method1905(arg0, arg1, var5, var10, var4.field1084[this.field4194]);
                        if (this.field4187 >= var5) {
                            return;
                        }
                        this.field4187 = var5 + var5 - 1 - this.field4187;
                        this.field4193 = -this.field4193;
                    }
                    while (true) {
                        int var11 = this.method1930(arg0, var9, var6, var10, var4.field1084[this.field4191 - 1]);
                        if (this.field4187 < var6) {
                            return;
                        }
                        this.field4187 = var6 + var6 - 1 - this.field4187;
                        this.field4193 = -this.field4193;
                        var9 = this.method1905(arg0, var11, var5, var10, var4.field1084[this.field4194]);
                        if (this.field4187 >= var5) {
                            return;
                        }
                        this.field4187 = var5 + var5 - 1 - this.field4187;
                        this.field4193 = -this.field4193;
                    }
                } else if (this.field4193 < 0) {
                    while (true) {
                        var9 = this.method1905(arg0, var9, var5, var10, var4.field1084[this.field4191 - 1]);
                        if (this.field4187 >= var5) {
                            return;
                        }
                        this.field4187 = var6 - 1 - (var6 - 1 - this.field4187) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1930(arg0, var9, var6, var10, var4.field1084[this.field4194]);
                        if (this.field4187 < var6) {
                            return;
                        }
                        this.field4187 = (this.field4187 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4182 > 0) {
                    if (this.field4195) {
                        label130: {
                            if (this.field4193 < 0) {
                                var9 = this.method1905(arg0, arg1, var5, var10, var4.field1084[this.field4194]);
                                if (this.field4187 >= var5) {
                                    return;
                                }
                                this.field4187 = var5 + var5 - 1 - this.field4187;
                                this.field4193 = -this.field4193;
                                if (--this.field4182 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1930(arg0, var9, var6, var10, var4.field1084[this.field4191 - 1]);
                                if (this.field4187 < var6) {
                                    return;
                                }
                                this.field4187 = var6 + var6 - 1 - this.field4187;
                                this.field4193 = -this.field4193;
                                if (--this.field4182 == 0) {
                                    break;
                                }
                                var9 = this.method1905(arg0, var9, var5, var10, var4.field1084[this.field4194]);
                                if (this.field4187 >= var5) {
                                    return;
                                }
                                this.field4187 = var5 + var5 - 1 - this.field4187;
                                this.field4193 = -this.field4193;
                            } while (--this.field4182 != 0);
                        }
                    } else if (this.field4193 < 0) {
                        while (true) {
                            var9 = this.method1905(arg0, var9, var5, var10, var4.field1084[this.field4191 - 1]);
                            if (this.field4187 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4187) / var8;
                            if (var12 >= this.field4182) {
                                this.field4187 += this.field4182 * var8;
                                this.field4182 = 0;
                                break;
                            }
                            this.field4187 += var8 * var12;
                            this.field4182 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1930(arg0, var9, var6, var10, var4.field1084[this.field4194]);
                            if (this.field4187 < var6) {
                                return;
                            }
                            int var13 = (this.field4187 - var5) / var8;
                            if (var13 >= this.field4182) {
                                this.field4187 -= this.field4182 * var8;
                                this.field4182 = 0;
                                break;
                            }
                            this.field4187 -= var8 * var13;
                            this.field4182 -= var13;
                        }
                    }
                }
                if (this.field4193 < 0) {
                    this.method1905(arg0, var9, 0, var10, 0);
                    if (this.field4187 < 0) {
                        this.field4187 = -1;
                        this.method1920();
                        this.method1102((byte) 108);
                        return;
                    }
                } else {
                    this.method1930(arg0, var9, var7, var10, 0);
                    if (this.field4187 >= var7) {
                        this.field4187 = var7;
                        this.method1920();
                        this.method1102((byte) 69);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(II[B[IIIIIIIILvca;II)I")
    private static final int method1932(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class296 arg11, int arg12, int arg13) {
        arg11.field4189 -= arg11.field4184 * arg5;
        arg11.field4185 -= arg11.field4183 * arg5;
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
        arg11.field4189 += arg11.field4184 * arg5;
        arg11.field4185 += arg11.field4183 * arg5;
        arg11.field4190 = arg6;
        arg11.field4187 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "(I)V")
    public final synchronized void method1933(int arg0) {
        int var2 = ((class78) super.field5941).field1084.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4187 = arg0;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I[B[IIIIIIIIIILvca;)I")
    private static final int method1934(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class296 arg12) {
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
        arg12.field4190 += (var19 - arg4) * arg12.field4188;
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
        arg12.field4189 = var15 >> 2;
        arg12.field4185 = var16 >> 2;
        arg12.field4187 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "([B[IIIIIIIILvca;)I")
    private static final int method1935(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class296 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4189 += (var14 - arg3) * arg9.field4184;
        arg9.field4185 += (var14 - arg3) * arg9.field4183;
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
        arg9.field4190 = var12 >> 2;
        arg9.field4187 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "()I")
    public final int method1936() {
        int var1 = this.field4190 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4182 == 0) {
            var2 -= this.field4187 * var2 / (((class78) super.field5941).field1084.length << 8);
        } else if (this.field4182 >= 0) {
            var2 -= this.field4194 * var2 / ((class78) super.field5941).field1084.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(II)V")
    public final synchronized void method1937(int arg0, int arg1) {
        this.method1923(arg0, arg1, this.method1939());
    }

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "()Z")
    private final boolean method1938() {
        int var1 = this.field4186;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1913(var1, this.field4192);
            var2 = method1927(var1, this.field4192);
        }
        if (this.field4190 == var1 && this.field4189 == var3 && this.field4185 == var2) {
            if (this.field4186 == Integer.MIN_VALUE) {
                this.field4186 = 0;
                this.field4190 = this.field4189 = this.field4185 = 0;
                this.method1102((byte) 113);
                return true;
            } else {
                this.method1924();
                return false;
            }
        } else {
            if (this.field4190 < var1) {
                this.field4188 = 1;
                this.field4196 = var1 - this.field4190;
            } else if (this.field4190 > var1) {
                this.field4188 = -1;
                this.field4196 = this.field4190 - var1;
            } else {
                this.field4188 = 0;
            }
            if (this.field4189 < var3) {
                this.field4184 = 1;
                if (this.field4196 == 0 || this.field4196 > var3 - this.field4189) {
                    this.field4196 = var3 - this.field4189;
                }
            } else if (this.field4189 > var3) {
                this.field4184 = -1;
                if (this.field4196 == 0 || this.field4196 > this.field4189 - var3) {
                    this.field4196 = this.field4189 - var3;
                }
            } else {
                this.field4184 = 0;
            }
            if (this.field4185 < var2) {
                this.field4183 = 1;
                if (this.field4196 == 0 || this.field4196 > var2 - this.field4185) {
                    this.field4196 = var2 - this.field4185;
                }
            } else if (this.field4185 > var2) {
                this.field4183 = -1;
                if (this.field4196 == 0 || this.field4196 > this.field4185 - var2) {
                    this.field4196 = this.field4185 - var2;
                }
            } else {
                this.field4183 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "()I")
    public final synchronized int method1939() {
        return this.field4192 < 0 ? -1 : this.field4192;
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "()Lpp;")
    public final class413 method15() {
        return null;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lpv;III)V")
    private class296(class78 arg0, int arg1, int arg2, int arg3) {
        super.field5941 = arg0;
        this.field4194 = arg0.field1083;
        this.field4191 = arg0.field1080;
        this.field4195 = arg0.field1081;
        this.field4193 = arg1;
        this.field4186 = arg2;
        this.field4192 = arg3;
        this.field4187 = 0;
        this.method1924();
    }
}
