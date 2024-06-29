import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class304 extends class154 {

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    private int field4942;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Z")
    private boolean field4940;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    private int field4947;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    private int field4943;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    private int field4944;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    private int field4948;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    private int field4946;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    private int field4950;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    private int field4951;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    private int field4952;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field4953;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    private int field4954;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I", line = 3)
    private static final int method2170(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)I", line = 7)
    private static final int method2171(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B[IIIIIIIIIILbh;)I", line = 10)
    private static final int method2172(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class304 arg12) {
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
        arg12.field4946 += (var19 - arg4) * arg12.field4941;
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
        arg12.field4950 = var15 >> 2;
        arg12.field4951 = var16 >> 2;
        arg12.field4948 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Llb;II)Lbh;", line = 65)
    public static final class304 method2173(class236 arg0, int arg1, int arg2) {
        return arg0.field3857 == null || arg0.field3857.length == 0 ? null : new class304(arg0, (int) ((long) arg0.field3860 * 256L * (long) arg1 / (long) (class194.field3261 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V", line = 71)
    public final synchronized void method2174(int arg0) {
        if (arg0 == 0) {
            this.method2176(0);
            this.method535(-2801);
        } else if (this.field4950 == 0 && this.field4951 == 0) {
            this.field4945 = 0;
            this.field4943 = 0;
            this.field4946 = 0;
            this.method535(-2801);
        } else {
            int var2 = -this.field4946;
            if (this.field4946 > var2) {
                var2 = this.field4946;
            }
            if (-this.field4950 > var2) {
                var2 = -this.field4950;
            }
            if (this.field4950 > var2) {
                var2 = this.field4950;
            }
            if (-this.field4951 > var2) {
                var2 = -this.field4951;
            }
            if (this.field4951 > var2) {
                var2 = this.field4951;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4945 = arg0;
            this.field4943 = Integer.MIN_VALUE;
            this.field4941 = -this.field4946 / arg0;
            this.field4953 = -this.field4950 / arg0;
            this.field4954 = -this.field4951 / arg0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([B[IIIIIIIILbh;)I", line = 116)
    private static final int method2175(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class304 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4950 += (var14 - arg3) * arg9.field4953;
        arg9.field4951 += (var14 - arg3) * arg9.field4954;
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
        arg9.field4946 = var12 >> 2;
        arg9.field4948 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 150)
    private final synchronized void method2176(int arg0) {
        this.method2183(arg0, this.method2190());
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()I", line = 157)
    public final int method1100() {
        int var1 = this.field4946 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4952 == 0) {
            var2 -= this.field4948 * var2 / (((class236) this.field2627).field3857.length << 8);
        } else if (this.field4952 >= 0) {
            var2 -= this.field4949 * var2 / ((class236) this.field2627).field3857.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V", line = 169)
    public final synchronized void method2177(int arg0) {
        this.field4952 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "()Z", line = 173)
    public final boolean method2178() {
        return this.field4948 < 0 || this.field4948 >= ((class236) this.field2627).field3857.length << 8;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "()I", line = 176)
    public final synchronized int method2179() {
        return this.field4943 == Integer.MIN_VALUE ? 0 : this.field4943;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B[IIIIIIIILbh;)I", line = 179)
    private static final int method2180(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class304 arg10) {
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
        arg10.field4948 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 217)
    private static final int method2181(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class304 arg11, int arg12, int arg13) {
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
        arg11.field4948 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([B[IIIIIIIILbh;)I", line = 250)
    private static final int method2182(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class304 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4950 += (var14 - arg3) * arg9.field4953;
        arg9.field4951 += (var14 - arg3) * arg9.field4954;
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
        arg9.field4946 = var12 >> 2;
        arg9.field4948 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)V", line = 285)
    private final synchronized void method2183(int arg0, int arg1) {
        this.field4943 = arg0;
        this.field4944 = arg1;
        this.field4945 = 0;
        this.method2188();
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "()Z", line = 292)
    private final boolean method2184() {
        int var1 = this.field4943;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2170(var1, this.field4944);
            var2 = method2171(var1, this.field4944);
        }
        if (this.field4946 != var1 || this.field4950 != var3 || this.field4951 != var2) {
            if (this.field4946 < var1) {
                this.field4941 = 1;
                this.field4945 = var1 - this.field4946;
            } else if (this.field4946 > var1) {
                this.field4941 = -1;
                this.field4945 = this.field4946 - var1;
            } else {
                this.field4941 = 0;
            }
            if (this.field4950 < var3) {
                this.field4953 = 1;
                if (this.field4945 == 0 || this.field4945 > var3 - this.field4950) {
                    this.field4945 = var3 - this.field4950;
                }
            } else if (this.field4950 > var3) {
                this.field4953 = -1;
                if (this.field4945 == 0 || this.field4945 > this.field4950 - var3) {
                    this.field4945 = this.field4950 - var3;
                }
            } else {
                this.field4953 = 0;
            }
            if (this.field4951 < var2) {
                this.field4954 = 1;
                if (this.field4945 == 0 || this.field4945 > var2 - this.field4951) {
                    this.field4945 = var2 - this.field4951;
                }
            } else if (this.field4951 > var2) {
                this.field4954 = -1;
                if (this.field4945 == 0 || this.field4945 > this.field4951 - var2) {
                    this.field4945 = this.field4951 - var2;
                }
            } else {
                this.field4954 = 0;
            }
            return false;
        } else if (this.field4943 == Integer.MIN_VALUE) {
            this.field4943 = 0;
            this.field4946 = this.field4950 = this.field4951 = 0;
            this.method535(-2801);
            return true;
        } else {
            this.method2188();
            return false;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()Lmh;", line = 378)
    public final class154 method829() {
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 382)
    public final synchronized void method2185(int arg0) {
        if (this.field4947 < 0) {
            this.field4947 = -arg0;
        } else {
            this.field4947 = arg0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V", line = 390)
    public final synchronized void method2186(int arg0, int arg1) {
        this.method2205(arg0, arg1, this.method2190());
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Llb;III)Lbh;", line = 394)
    public static final class304 method2187(class236 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3857 == null || arg0.field3857.length == 0 ? null : new class304(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "()V", line = 400)
    private final void method2188() {
        this.field4946 = this.field4943;
        this.field4950 = method2170(this.field4943, this.field4944);
        this.field4951 = method2171(this.field4943, this.field4944);
    }

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "()Z", line = 406)
    public final boolean method2189() {
        return this.field4945 != 0;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V", line = 409)
    public final synchronized void method827(int[] arg0, int arg1, int arg2) {
        if (this.field4943 == 0 && this.field4945 == 0) {
            this.method828(arg2);
            return;
        }
        class236 var4 = (class236) this.field2627;
        int var5 = this.field4949 << 8;
        int var6 = this.field4942 << 8;
        int var7 = var4.field3857.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4952 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4948 < 0) {
            if (this.field4947 <= 0) {
                this.method2192();
                this.method535(-2801);
                return;
            }
            this.field4948 = 0;
        }
        if (this.field4948 >= var7) {
            if (this.field4947 >= 0) {
                this.method2192();
                this.method535(-2801);
                return;
            }
            this.field4948 = var7 - 1;
        }
        if (this.field4952 >= 0) {
            if (this.field4952 > 0) {
                if (this.field4940) {
                    label131: {
                        if (this.field4947 < 0) {
                            var9 = this.method2209(arg0, arg1, var5, var10, var4.field3857[this.field4949]);
                            if (this.field4948 >= var5) {
                                return;
                            }
                            this.field4948 = var5 + var5 - this.field4948 - 1;
                            this.field4947 = -this.field4947;
                            if (--this.field4952 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2196(arg0, var9, var6, var10, var4.field3857[this.field4942 - 1]);
                            if (this.field4948 < var6) {
                                return;
                            }
                            this.field4948 = var6 + var6 - this.field4948 - 1;
                            this.field4947 = -this.field4947;
                            if (--this.field4952 == 0) {
                                break;
                            }
                            var9 = this.method2209(arg0, var9, var5, var10, var4.field3857[this.field4949]);
                            if (this.field4948 >= var5) {
                                return;
                            }
                            this.field4948 = var5 + var5 - this.field4948 - 1;
                            this.field4947 = -this.field4947;
                        } while (--this.field4952 != 0);
                    }
                } else if (this.field4947 < 0) {
                    while (true) {
                        var9 = this.method2209(arg0, var9, var5, var10, var4.field3857[this.field4942 - 1]);
                        if (this.field4948 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4948 - 1) / var8;
                        if (var12 >= this.field4952) {
                            this.field4948 += this.field4952 * var8;
                            this.field4952 = 0;
                            break;
                        }
                        this.field4948 += var8 * var12;
                        this.field4952 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2196(arg0, var9, var6, var10, var4.field3857[this.field4949]);
                        if (this.field4948 < var6) {
                            return;
                        }
                        int var13 = (this.field4948 - var5) / var8;
                        if (var13 >= this.field4952) {
                            this.field4948 -= this.field4952 * var8;
                            this.field4952 = 0;
                            break;
                        }
                        this.field4948 -= var8 * var13;
                        this.field4952 -= var13;
                    }
                }
            }
            if (this.field4947 < 0) {
                this.method2209(arg0, var9, 0, var10, 0);
                if (this.field4948 < 0) {
                    this.field4948 = -1;
                    this.method2192();
                    this.method535(-2801);
                }
            } else {
                this.method2196(arg0, var9, var7, var10, 0);
                if (this.field4948 >= var7) {
                    this.field4948 = var7;
                    this.method2192();
                    this.method535(-2801);
                }
            }
        } else if (this.field4940) {
            if (this.field4947 < 0) {
                var9 = this.method2209(arg0, arg1, var5, var10, var4.field3857[this.field4949]);
                if (this.field4948 >= var5) {
                    return;
                }
                this.field4948 = var5 + var5 - this.field4948 - 1;
                this.field4947 = -this.field4947;
            }
            while (true) {
                int var11 = this.method2196(arg0, var9, var6, var10, var4.field3857[this.field4942 - 1]);
                if (this.field4948 < var6) {
                    return;
                }
                this.field4948 = var6 + var6 - this.field4948 - 1;
                this.field4947 = -this.field4947;
                var9 = this.method2209(arg0, var11, var5, var10, var4.field3857[this.field4949]);
                if (this.field4948 >= var5) {
                    return;
                }
                this.field4948 = var5 + var5 - this.field4948 - 1;
                this.field4947 = -this.field4947;
            }
        } else if (this.field4947 < 0) {
            while (true) {
                var9 = this.method2209(arg0, var9, var5, var10, var4.field3857[this.field4942 - 1]);
                if (this.field4948 >= var5) {
                    return;
                }
                this.field4948 = var6 - (var6 - 1 - this.field4948) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2196(arg0, var9, var6, var10, var4.field3857[this.field4949]);
                if (this.field4948 < var6) {
                    return;
                }
                this.field4948 = (this.field4948 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "()I", line = 646)
    public final synchronized int method2190() {
        return this.field4944 < 0 ? -1 : this.field4944;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 649)
    public final synchronized void method828(int arg0) {
        if (this.field4945 > 0) {
            if (arg0 >= this.field4945) {
                if (this.field4943 == Integer.MIN_VALUE) {
                    this.field4943 = 0;
                    this.field4946 = this.field4950 = this.field4951 = 0;
                    this.method535(-2801);
                    arg0 = this.field4945;
                }
                this.field4945 = 0;
                this.method2188();
            } else {
                this.field4946 += this.field4941 * arg0;
                this.field4950 += this.field4953 * arg0;
                this.field4951 += this.field4954 * arg0;
                this.field4945 -= arg0;
            }
        }
        class236 var2 = (class236) this.field2627;
        int var3 = this.field4949 << 8;
        int var4 = this.field4942 << 8;
        int var5 = var2.field3857.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4952 = 0;
        }
        if (this.field4948 < 0) {
            if (this.field4947 <= 0) {
                this.method2192();
                this.method535(-2801);
                return;
            }
            this.field4948 = 0;
        }
        if (this.field4948 >= var5) {
            if (this.field4947 >= 0) {
                this.method2192();
                this.method535(-2801);
                return;
            }
            this.field4948 = var5 - 1;
        }
        this.field4948 += this.field4947 * arg0;
        if (this.field4952 >= 0) {
            if (this.field4952 > 0) {
                if (this.field4940) {
                    label121: {
                        if (this.field4947 < 0) {
                            if (this.field4948 >= var3) {
                                return;
                            }
                            this.field4948 = var3 + var3 - this.field4948 - 1;
                            this.field4947 = -this.field4947;
                            if (--this.field4952 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4948 < var4) {
                                return;
                            }
                            this.field4948 = var4 + var4 - this.field4948 - 1;
                            this.field4947 = -this.field4947;
                            if (--this.field4952 == 0) {
                                break;
                            }
                            if (this.field4948 >= var3) {
                                return;
                            }
                            this.field4948 = var3 + var3 - this.field4948 - 1;
                            this.field4947 = -this.field4947;
                        } while (--this.field4952 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4947 < 0) {
                            if (this.field4948 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4948 - 1) / var6;
                            if (var7 >= this.field4952) {
                                this.field4948 += this.field4952 * var6;
                                this.field4952 = 0;
                                break label153;
                            }
                            this.field4948 += var6 * var7;
                            this.field4952 -= var7;
                        } else if (this.field4948 >= var4) {
                            int var8 = (this.field4948 - var3) / var6;
                            if (var8 >= this.field4952) {
                                this.field4948 -= this.field4952 * var6;
                                this.field4952 = 0;
                                break label153;
                            }
                            this.field4948 -= var6 * var8;
                            this.field4952 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4947 < 0) {
                if (this.field4948 < 0) {
                    this.field4948 = -1;
                    this.method2192();
                    this.method535(-2801);
                }
            } else if (this.field4948 >= var5) {
                this.field4948 = var5;
                this.method2192();
                this.method535(-2801);
            }
        } else if (this.field4940) {
            if (this.field4947 < 0) {
                if (this.field4948 >= var3) {
                    return;
                }
                this.field4948 = var3 + var3 - this.field4948 - 1;
                this.field4947 = -this.field4947;
            }
            while (this.field4948 >= var4) {
                this.field4948 = var4 + var4 - this.field4948 - 1;
                this.field4947 = -this.field4947;
                if (this.field4948 >= var3) {
                    return;
                }
                this.field4948 = var3 + var3 - this.field4948 - 1;
                this.field4947 = -this.field4947;
            }
        } else if (this.field4947 < 0) {
            if (this.field4948 >= var3) {
                return;
            }
            this.field4948 = var4 - (var4 - 1 - this.field4948) % var6 - 1;
        } else if (this.field4948 >= var4) {
            this.field4948 = (this.field4948 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([B[IIIIIIILbh;)I", line = 870)
    private static final int method2191(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class304 arg8) {
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
        arg8.field4948 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "()V", line = 897)
    private final void method2192() {
        if (this.field4945 == 0) {
            return;
        }
        if (this.field4943 == Integer.MIN_VALUE) {
            this.field4943 = 0;
        }
        this.field4945 = 0;
        this.method2188();
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V", line = 912)
    public final synchronized void method2193(int arg0) {
        int var2 = ((class236) this.field2627).field3857.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4948 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B[IIIIIIIIIILbh;II)I", line = 922)
    private static final int method2194(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class304 arg13, int arg14, int arg15) {
        arg13.field4946 -= arg13.field4941 * arg5;
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
        arg13.field4946 += arg13.field4941 * var27;
        arg13.field4950 = arg6;
        arg13.field4951 = arg7;
        arg13.field4948 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[B[IIIIIIILbh;II)I", line = 964)
    private static final int method2195(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class304 arg10, int arg11, int arg12) {
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
        arg10.field4948 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([IIIII)I", line = 991)
    private final int method2196(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4945 > 0) {
                int var6 = this.field4945 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4945 += arg1;
                if (this.field4947 == 256 && (this.field4948 & 0xFF) == 0) {
                    if (class277.field4510) {
                        arg1 = method2200(0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, this.field4953, this.field4954, 0, var6, arg2, this);
                    } else {
                        arg1 = method2182(((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, this.field4941, 0, var6, arg2, this);
                    }
                } else if (class277.field4510) {
                    arg1 = method2194(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, this.field4953, this.field4954, 0, var6, arg2, this, this.field4947, arg4);
                } else {
                    arg1 = method2203(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, this.field4941, 0, var6, arg2, this, this.field4947, arg4);
                }
                this.field4945 -= arg1;
                if (this.field4945 != 0) {
                    return arg1;
                }
                if (!this.method2184()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4947 == 256 && (this.field4948 & 0xFF) == 0) {
                if (class277.field4510) {
                    return method2207(0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, 0, arg3, arg2, this);
                }
                return method2202(((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, 0, arg3, arg2, this);
            }
            if (class277.field4510) {
                return method2181(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, 0, arg3, arg2, this, this.field4947, arg4);
            }
            return method2199(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, 0, arg3, arg2, this, this.field4947, arg4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 1047)
    private static final int method2197(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class304 arg11, int arg12, int arg13) {
        arg11.field4950 -= arg11.field4953 * arg5;
        arg11.field4951 -= arg11.field4954 * arg5;
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
        arg11.field4950 += arg11.field4953 * arg5;
        arg11.field4951 += arg11.field4954 * arg5;
        arg11.field4946 = arg6;
        arg11.field4948 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V", line = 1080)
    public final synchronized void method2198(int arg0) {
        this.method2183(arg0 << 6, this.method2190());
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[B[IIIIIIILbh;II)I", line = 1083)
    private static final int method2199(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class304 arg10, int arg11, int arg12) {
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
        arg10.field4948 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I[B[IIIIIIIIIILbh;)I", line = 1109)
    private static final int method2200(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class304 arg12) {
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
        arg12.field4946 += (var19 - arg4) * arg12.field4941;
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
        arg12.field4950 = var15 >> 2;
        arg12.field4951 = var16 >> 2;
        arg12.field4948 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lmh;", line = 1162)
    public final class154 method825() {
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II[B[IIIIIIIIIILbh;II)I", line = 1166)
    private static final int method2201(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class304 arg13, int arg14, int arg15) {
        arg13.field4946 -= arg13.field4941 * arg5;
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
        arg13.field4946 += arg13.field4941 * var26;
        arg13.field4950 = arg6;
        arg13.field4951 = arg7;
        arg13.field4948 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()I", line = 1209)
    public final int method820() {
        return this.field4943 == 0 && this.field4945 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([B[IIIIIIILbh;)I", line = 1215)
    private static final int method2202(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class304 arg8) {
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
        arg8.field4948 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 1240)
    private static final int method2203(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class304 arg11, int arg12, int arg13) {
        arg11.field4950 -= arg11.field4953 * arg5;
        arg11.field4951 -= arg11.field4954 * arg5;
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
        arg11.field4950 += arg11.field4953 * arg5;
        arg11.field4951 += arg11.field4954 * arg5;
        arg11.field4946 = arg6;
        arg11.field4948 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II[B[IIIIIIIILbh;II)I", line = 1273)
    private static final int method2204(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class304 arg11, int arg12, int arg13) {
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
        arg11.field4948 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V", line = 1307)
    public final synchronized void method2205(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2183(arg1, arg2);
            return;
        }
        int var4 = method2170(arg1, arg2);
        int var5 = method2171(arg1, arg2);
        if (this.field4950 == var4 && this.field4951 == var5) {
            this.field4945 = 0;
            return;
        }
        int var6 = arg1 - this.field4946;
        if (this.field4946 - arg1 > var6) {
            var6 = this.field4946 - arg1;
        }
        if (var4 - this.field4950 > var6) {
            var6 = var4 - this.field4950;
        }
        if (this.field4950 - var4 > var6) {
            var6 = this.field4950 - var4;
        }
        if (var5 - this.field4951 > var6) {
            var6 = var5 - this.field4951;
        }
        if (this.field4951 - var5 > var6) {
            var6 = this.field4951 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4945 = arg0;
        this.field4943 = arg1;
        this.field4944 = arg2;
        this.field4941 = (arg1 - this.field4946) / arg0;
        this.field4953 = (var4 - this.field4950) / arg0;
        this.field4954 = (var5 - this.field4951) / arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 1353)
    public final synchronized void method2206(boolean arg0) {
        this.field4947 = (this.field4947 >>> 31) + (this.field4947 ^ this.field4947 >> 31);
        if (arg0) {
            this.field4947 = -this.field4947;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I[B[IIIIIIIILbh;)I", line = 1359)
    private static final int method2207(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class304 arg10) {
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
        arg10.field4948 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "()I", line = 1400)
    public final synchronized int method2208() {
        return this.field4947 < 0 ? -this.field4947 : this.field4947;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Llb;II)V", line = 1403)
    private class304(class236 arg0, int arg1, int arg2) {
        this.field2627 = arg0;
        this.field4949 = arg0.field3856;
        this.field4942 = arg0.field3858;
        this.field4940 = arg0.field3859;
        this.field4947 = arg1;
        this.field4943 = arg2;
        this.field4944 = 8192;
        this.field4948 = 0;
        this.method2188();
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([IIIII)I", line = 1415)
    private final int method2209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4945 > 0) {
                int var6 = this.field4945 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4945 += arg1;
                if (this.field4947 == -256 && (this.field4948 & 0xFF) == 0) {
                    if (class277.field4510) {
                        arg1 = method2172(0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, this.field4953, this.field4954, 0, var6, arg2, this);
                    } else {
                        arg1 = method2175(((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, this.field4941, 0, var6, arg2, this);
                    }
                } else if (class277.field4510) {
                    arg1 = method2201(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, this.field4953, this.field4954, 0, var6, arg2, this, this.field4947, arg4);
                } else {
                    arg1 = method2197(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, this.field4941, 0, var6, arg2, this, this.field4947, arg4);
                }
                this.field4945 -= arg1;
                if (this.field4945 != 0) {
                    return arg1;
                }
                if (!this.method2184()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4947 == -256 && (this.field4948 & 0xFF) == 0) {
                if (class277.field4510) {
                    return method2180(0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, 0, arg3, arg2, this);
                }
                return method2191(((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, 0, arg3, arg2, this);
            }
            if (class277.field4510) {
                return method2204(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4950, this.field4951, 0, arg3, arg2, this, this.field4947, arg4);
            }
            return method2195(0, 0, ((class236) this.field2627).field3857, arg0, this.field4948, arg1, this.field4946, 0, arg3, arg2, this, this.field4947, arg4);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Llb;III)V", line = 1469)
    private class304(class236 arg0, int arg1, int arg2, int arg3) {
        this.field2627 = arg0;
        this.field4949 = arg0.field3856;
        this.field4942 = arg0.field3858;
        this.field4940 = arg0.field3859;
        this.field4947 = arg1;
        this.field4943 = arg2;
        this.field4944 = arg3;
        this.field4948 = 0;
        this.method2188();
    }
}
