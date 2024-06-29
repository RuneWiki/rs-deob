import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class178 extends class266 {

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    private int field3086;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "Z")
    private boolean field3090;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    private int field3082;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    private int field3078;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    private int field3079;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    private int field3084;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    private int field3089;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    private int field3092;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "()V", line = 4)
    private final void method1197() {
        this.field3084 = this.field3082;
        this.field3079 = method1202(this.field3082, this.field3091);
        this.field3078 = method1214(this.field3082, this.field3091);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 10)
    private final synchronized void method1198(int arg0) {
        this.method1232(arg0, this.method1206());
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "()Z", line = 13)
    public final boolean method1199() {
        return this.field3080 < 0 || this.field3080 >= ((class316) this.field4570).field5353.length << 8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B[IIIIIIIIIILkj;)I", line = 16)
    private static final int method1200(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class178 arg12) {
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
        arg12.field3084 += (var19 - arg4) * arg12.field3087;
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
        arg12.field3079 = var15 >> 2;
        arg12.field3078 = var16 >> 2;
        arg12.field3080 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([B[IIIIIIILkj;)I", line = 69)
    private static final int method1201(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class178 arg8) {
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
        arg8.field3080 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I", line = 95)
    private static final int method1202(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltg;III)Lkj;", line = 98)
    public static final class178 method1203(class316 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5353 == null || arg0.field5353.length == 0 ? null : new class178(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V", line = 104)
    public final synchronized void method1204(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1232(arg1, arg2);
            return;
        }
        int var4 = method1202(arg1, arg2);
        int var5 = method1214(arg1, arg2);
        if (this.field3079 == var4 && this.field3078 == var5) {
            this.field3085 = 0;
            return;
        }
        int var6 = arg1 - this.field3084;
        if (this.field3084 - arg1 > var6) {
            var6 = this.field3084 - arg1;
        }
        if (var4 - this.field3079 > var6) {
            var6 = var4 - this.field3079;
        }
        if (this.field3079 - var4 > var6) {
            var6 = this.field3079 - var4;
        }
        if (var5 - this.field3078 > var6) {
            var6 = var5 - this.field3078;
        }
        if (this.field3078 - var5 > var6) {
            var6 = this.field3078 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3085 = arg0;
        this.field3082 = arg1;
        this.field3091 = arg2;
        this.field3087 = (arg1 - this.field3084) / arg0;
        this.field3092 = (var4 - this.field3079) / arg0;
        this.field3081 = (var5 - this.field3078) / arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B[IIIIIIIILkj;)I", line = 152)
    private static final int method1205(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class178 arg10) {
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
        arg10.field3080 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "()I", line = 190)
    public final synchronized int method1206() {
        return this.field3091 < 0 ? -1 : this.field3091;
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "()Z", line = 195)
    private final boolean method1207() {
        int var1 = this.field3082;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1202(var1, this.field3091);
            var2 = method1214(var1, this.field3091);
        }
        if (this.field3084 != var1 || this.field3079 != var3 || this.field3078 != var2) {
            if (this.field3084 < var1) {
                this.field3087 = 1;
                this.field3085 = var1 - this.field3084;
            } else if (this.field3084 > var1) {
                this.field3087 = -1;
                this.field3085 = this.field3084 - var1;
            } else {
                this.field3087 = 0;
            }
            if (this.field3079 < var3) {
                this.field3092 = 1;
                if (this.field3085 == 0 || this.field3085 > var3 - this.field3079) {
                    this.field3085 = var3 - this.field3079;
                }
            } else if (this.field3079 > var3) {
                this.field3092 = -1;
                if (this.field3085 == 0 || this.field3085 > this.field3079 - var3) {
                    this.field3085 = this.field3079 - var3;
                }
            } else {
                this.field3092 = 0;
            }
            if (this.field3078 < var2) {
                this.field3081 = 1;
                if (this.field3085 == 0 || this.field3085 > var2 - this.field3078) {
                    this.field3085 = var2 - this.field3078;
                }
            } else if (this.field3078 > var2) {
                this.field3081 = -1;
                if (this.field3085 == 0 || this.field3085 > this.field3078 - var2) {
                    this.field3085 = this.field3078 - var2;
                }
            } else {
                this.field3081 = 0;
            }
            return false;
        } else if (this.field3082 == Integer.MIN_VALUE) {
            this.field3082 = 0;
            this.field3084 = this.field3079 = this.field3078 = 0;
            this.method1747((byte) -102);
            return true;
        } else {
            this.method1197();
            return false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I[B[IIIIIIIILkj;)I", line = 282)
    private static final int method1208(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class178 arg10) {
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
        arg10.field3080 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "([B[IIIIIIILkj;)I", line = 320)
    private static final int method1209(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class178 arg8) {
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
        arg8.field3080 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 347)
    public final synchronized void method1210(int arg0) {
        this.method1232(arg0 << 6, this.method1206());
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([III)V", line = 350)
    public final synchronized void method622(int[] arg0, int arg1, int arg2) {
        if (this.field3082 == 0 && this.field3085 == 0) {
            this.method618(arg2);
            return;
        }
        class316 var4 = (class316) this.field4570;
        int var5 = this.field3083 << 8;
        int var6 = this.field3086 << 8;
        int var7 = var4.field5353.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3089 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3080 < 0) {
            if (this.field3088 <= 0) {
                this.method1236();
                this.method1747((byte) -97);
                return;
            }
            this.field3080 = 0;
        }
        if (this.field3080 >= var7) {
            if (this.field3088 >= 0) {
                this.method1236();
                this.method1747((byte) -120);
                return;
            }
            this.field3080 = var7 - 1;
        }
        if (this.field3089 >= 0) {
            if (this.field3089 > 0) {
                if (this.field3090) {
                    label131: {
                        if (this.field3088 < 0) {
                            var9 = this.method1235(arg0, arg1, var5, var10, var4.field5353[this.field3083]);
                            if (this.field3080 >= var5) {
                                return;
                            }
                            this.field3080 = var5 + var5 - this.field3080 - 1;
                            this.field3088 = -this.field3088;
                            if (--this.field3089 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1228(arg0, var9, var6, var10, var4.field5353[this.field3086 - 1]);
                            if (this.field3080 < var6) {
                                return;
                            }
                            this.field3080 = var6 + var6 - this.field3080 - 1;
                            this.field3088 = -this.field3088;
                            if (--this.field3089 == 0) {
                                break;
                            }
                            var9 = this.method1235(arg0, var9, var5, var10, var4.field5353[this.field3083]);
                            if (this.field3080 >= var5) {
                                return;
                            }
                            this.field3080 = var5 + var5 - this.field3080 - 1;
                            this.field3088 = -this.field3088;
                        } while (--this.field3089 != 0);
                    }
                } else if (this.field3088 < 0) {
                    while (true) {
                        var9 = this.method1235(arg0, var9, var5, var10, var4.field5353[this.field3086 - 1]);
                        if (this.field3080 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3080 - 1) / var8;
                        if (var12 >= this.field3089) {
                            this.field3080 += this.field3089 * var8;
                            this.field3089 = 0;
                            break;
                        }
                        this.field3080 += var8 * var12;
                        this.field3089 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1228(arg0, var9, var6, var10, var4.field5353[this.field3083]);
                        if (this.field3080 < var6) {
                            return;
                        }
                        int var13 = (this.field3080 - var5) / var8;
                        if (var13 >= this.field3089) {
                            this.field3080 -= this.field3089 * var8;
                            this.field3089 = 0;
                            break;
                        }
                        this.field3080 -= var8 * var13;
                        this.field3089 -= var13;
                    }
                }
            }
            if (this.field3088 < 0) {
                this.method1235(arg0, var9, 0, var10, 0);
                if (this.field3080 < 0) {
                    this.field3080 = -1;
                    this.method1236();
                    this.method1747((byte) -63);
                }
            } else {
                this.method1228(arg0, var9, var7, var10, 0);
                if (this.field3080 >= var7) {
                    this.field3080 = var7;
                    this.method1236();
                    this.method1747((byte) -112);
                }
            }
        } else if (this.field3090) {
            if (this.field3088 < 0) {
                var9 = this.method1235(arg0, arg1, var5, var10, var4.field5353[this.field3083]);
                if (this.field3080 >= var5) {
                    return;
                }
                this.field3080 = var5 + var5 - this.field3080 - 1;
                this.field3088 = -this.field3088;
            }
            while (true) {
                int var11 = this.method1228(arg0, var9, var6, var10, var4.field5353[this.field3086 - 1]);
                if (this.field3080 < var6) {
                    return;
                }
                this.field3080 = var6 + var6 - this.field3080 - 1;
                this.field3088 = -this.field3088;
                var9 = this.method1235(arg0, var11, var5, var10, var4.field5353[this.field3083]);
                if (this.field3080 >= var5) {
                    return;
                }
                this.field3080 = var5 + var5 - this.field3080 - 1;
                this.field3088 = -this.field3088;
            }
        } else if (this.field3088 < 0) {
            while (true) {
                var9 = this.method1235(arg0, var9, var5, var10, var4.field5353[this.field3086 - 1]);
                if (this.field3080 >= var5) {
                    return;
                }
                this.field3080 = var6 - (var6 - 1 - this.field3080) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1228(arg0, var9, var6, var10, var4.field5353[this.field3083]);
                if (this.field3080 < var6) {
                    return;
                }
                this.field3080 = (this.field3080 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()Lvg;", line = 590)
    public final class266 method611() {
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[B[IIIIIIIIIILkj;II)I", line = 593)
    private static final int method1211(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class178 arg13, int arg14, int arg15) {
        arg13.field3084 -= arg13.field3087 * arg5;
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
        arg13.field3084 += arg13.field3087 * var26;
        arg13.field3079 = arg6;
        arg13.field3078 = arg7;
        arg13.field3080 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "()I", line = 634)
    public final synchronized int method1212() {
        return this.field3082 == Integer.MIN_VALUE ? 0 : this.field3082;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I[B[IIIIIIIIIILkj;)I", line = 637)
    private static final int method1213(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class178 arg12) {
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
        arg12.field3084 += (var19 - arg4) * arg12.field3087;
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
        arg12.field3079 = var15 >> 2;
        arg12.field3078 = var16 >> 2;
        arg12.field3080 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)I", line = 690)
    private static final int method1214(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 694)
    private static final int method1215(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class178 arg11, int arg12, int arg13) {
        arg11.field3079 -= arg11.field3092 * arg5;
        arg11.field3078 -= arg11.field3081 * arg5;
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
        arg11.field3079 += arg11.field3092 * arg5;
        arg11.field3078 += arg11.field3081 * arg5;
        arg11.field3084 = arg6;
        arg11.field3080 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 727)
    private static final int method1216(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class178 arg11, int arg12, int arg13) {
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
        arg11.field3080 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 762)
    private static final int method1217(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class178 arg11, int arg12, int arg13) {
        arg11.field3079 -= arg11.field3092 * arg5;
        arg11.field3078 -= arg11.field3081 * arg5;
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
        arg11.field3079 += arg11.field3092 * arg5;
        arg11.field3078 += arg11.field3081 * arg5;
        arg11.field3084 = arg6;
        arg11.field3080 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "()I", line = 795)
    public final synchronized int method1218() {
        return this.field3088 < 0 ? -this.field3088 : this.field3088;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()I", line = 799)
    public final int method1219() {
        int var1 = this.field3084 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3089 == 0) {
            var2 -= this.field3080 * var2 / (((class316) this.field4570).field5353.length << 8);
        } else if (this.field3089 >= 0) {
            var2 -= this.field3083 * var2 / ((class316) this.field4570).field5353.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltg;II)Lkj;", line = 811)
    public static final class178 method1220(class316 arg0, int arg1, int arg2) {
        return arg0.field5353 == null || arg0.field5353.length == 0 ? null : new class178(arg0, (int) ((long) arg0.field5352 * 256L * (long) arg1 / (long) (class22.field363 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V", line = 820)
    public final synchronized void method1221(int arg0) {
        int var2 = ((class316) this.field4570).field5353.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3080 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([B[IIIIIIIILkj;)I", line = 830)
    private static final int method1222(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class178 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3079 += (var14 - arg3) * arg9.field3092;
        arg9.field3078 += (var14 - arg3) * arg9.field3081;
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
        arg9.field3084 = var12 >> 2;
        arg9.field3080 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)V", line = 869)
    public final synchronized void method1223(int arg0, int arg1) {
        this.method1204(arg0, arg1, this.method1206());
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 872)
    public final synchronized void method1224(int arg0) {
        this.field3089 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()Lvg;", line = 875)
    public final class266 method620() {
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V", line = 878)
    public final synchronized void method1225(int arg0) {
        if (arg0 == 0) {
            this.method1198(0);
            this.method1747((byte) -65);
        } else if (this.field3079 == 0 && this.field3078 == 0) {
            this.field3085 = 0;
            this.field3082 = 0;
            this.field3084 = 0;
            this.method1747((byte) -90);
        } else {
            int var2 = -this.field3084;
            if (this.field3084 > var2) {
                var2 = this.field3084;
            }
            if (-this.field3079 > var2) {
                var2 = -this.field3079;
            }
            if (this.field3079 > var2) {
                var2 = this.field3079;
            }
            if (-this.field3078 > var2) {
                var2 = -this.field3078;
            }
            if (this.field3078 > var2) {
                var2 = this.field3078;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3085 = arg0;
            this.field3082 = Integer.MIN_VALUE;
            this.field3087 = -this.field3084 / arg0;
            this.field3092 = -this.field3079 / arg0;
            this.field3081 = -this.field3078 / arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "([B[IIIIIIIILkj;)I", line = 923)
    private static final int method1226(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class178 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3079 += (var14 - arg3) * arg9.field3092;
        arg9.field3078 += (var14 - arg3) * arg9.field3081;
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
        arg9.field3084 = var12 >> 2;
        arg9.field3080 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[B[IIIIIIILkj;II)I", line = 957)
    private static final int method1227(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class178 arg10, int arg11, int arg12) {
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
        arg10.field3080 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIII)I", line = 985)
    private final int method1228(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3085 > 0) {
                int var6 = this.field3085 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3085 += arg1;
                if (this.field3088 == 256 && (this.field3080 & 0xFF) == 0) {
                    if (class128.field2292) {
                        arg1 = method1213(0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, this.field3092, this.field3081, 0, var6, arg2, this);
                    } else {
                        arg1 = method1226(((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, this.field3087, 0, var6, arg2, this);
                    }
                } else if (class128.field2292) {
                    arg1 = method1230(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, this.field3092, this.field3081, 0, var6, arg2, this, this.field3088, arg4);
                } else {
                    arg1 = method1217(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, this.field3087, 0, var6, arg2, this, this.field3088, arg4);
                }
                this.field3085 -= arg1;
                if (this.field3085 != 0) {
                    return arg1;
                }
                if (!this.method1207()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3088 == 256 && (this.field3080 & 0xFF) == 0) {
                if (class128.field2292) {
                    return method1205(0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, 0, arg3, arg2, this);
                }
                return method1209(((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, 0, arg3, arg2, this);
            }
            if (class128.field2292) {
                return method1216(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, 0, arg3, arg2, this, this.field3088, arg4);
            }
            return method1227(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, 0, arg3, arg2, this, this.field3088, arg4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II[B[IIIIIIILkj;II)I", line = 1040)
    private static final int method1229(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class178 arg10, int arg11, int arg12) {
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
        arg10.field3080 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II[B[IIIIIIIIIILkj;II)I", line = 1066)
    private static final int method1230(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class178 arg13, int arg14, int arg15) {
        arg13.field3084 -= arg13.field3087 * arg5;
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
        arg13.field3084 += arg13.field3087 * var27;
        arg13.field3079 = arg6;
        arg13.field3078 = arg7;
        arg13.field3080 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()I", line = 1109)
    public final int method612() {
        return this.field3082 == 0 && this.field3085 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V", line = 1115)
    public final synchronized void method1231(int arg0) {
        if (this.field3088 < 0) {
            this.field3088 = -arg0;
        } else {
            this.field3088 = arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 1122)
    public final synchronized void method618(int arg0) {
        if (this.field3085 > 0) {
            if (arg0 >= this.field3085) {
                if (this.field3082 == Integer.MIN_VALUE) {
                    this.field3082 = 0;
                    this.field3084 = this.field3079 = this.field3078 = 0;
                    this.method1747((byte) -46);
                    arg0 = this.field3085;
                }
                this.field3085 = 0;
                this.method1197();
            } else {
                this.field3084 += this.field3087 * arg0;
                this.field3079 += this.field3092 * arg0;
                this.field3078 += this.field3081 * arg0;
                this.field3085 -= arg0;
            }
        }
        class316 var2 = (class316) this.field4570;
        int var3 = this.field3083 << 8;
        int var4 = this.field3086 << 8;
        int var5 = var2.field5353.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3089 = 0;
        }
        if (this.field3080 < 0) {
            if (this.field3088 <= 0) {
                this.method1236();
                this.method1747((byte) -99);
                return;
            }
            this.field3080 = 0;
        }
        if (this.field3080 >= var5) {
            if (this.field3088 >= 0) {
                this.method1236();
                this.method1747((byte) -63);
                return;
            }
            this.field3080 = var5 - 1;
        }
        this.field3080 += this.field3088 * arg0;
        if (this.field3089 >= 0) {
            if (this.field3089 > 0) {
                if (this.field3090) {
                    label121: {
                        if (this.field3088 < 0) {
                            if (this.field3080 >= var3) {
                                return;
                            }
                            this.field3080 = var3 + var3 - this.field3080 - 1;
                            this.field3088 = -this.field3088;
                            if (--this.field3089 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3080 < var4) {
                                return;
                            }
                            this.field3080 = var4 + var4 - this.field3080 - 1;
                            this.field3088 = -this.field3088;
                            if (--this.field3089 == 0) {
                                break;
                            }
                            if (this.field3080 >= var3) {
                                return;
                            }
                            this.field3080 = var3 + var3 - this.field3080 - 1;
                            this.field3088 = -this.field3088;
                        } while (--this.field3089 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3088 < 0) {
                            if (this.field3080 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3080 - 1) / var6;
                            if (var7 >= this.field3089) {
                                this.field3080 += this.field3089 * var6;
                                this.field3089 = 0;
                                break label153;
                            }
                            this.field3080 += var6 * var7;
                            this.field3089 -= var7;
                        } else if (this.field3080 >= var4) {
                            int var8 = (this.field3080 - var3) / var6;
                            if (var8 >= this.field3089) {
                                this.field3080 -= this.field3089 * var6;
                                this.field3089 = 0;
                                break label153;
                            }
                            this.field3080 -= var6 * var8;
                            this.field3089 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3088 < 0) {
                if (this.field3080 < 0) {
                    this.field3080 = -1;
                    this.method1236();
                    this.method1747((byte) -111);
                }
            } else if (this.field3080 >= var5) {
                this.field3080 = var5;
                this.method1236();
                this.method1747((byte) -48);
            }
        } else if (this.field3090) {
            if (this.field3088 < 0) {
                if (this.field3080 >= var3) {
                    return;
                }
                this.field3080 = var3 + var3 - this.field3080 - 1;
                this.field3088 = -this.field3088;
            }
            while (this.field3080 >= var4) {
                this.field3080 = var4 + var4 - this.field3080 - 1;
                this.field3088 = -this.field3088;
                if (this.field3080 >= var3) {
                    return;
                }
                this.field3080 = var3 + var3 - this.field3080 - 1;
                this.field3088 = -this.field3088;
            }
        } else if (this.field3088 < 0) {
            if (this.field3080 >= var3) {
                return;
            }
            this.field3080 = var4 - (var4 - 1 - this.field3080) % var6 - 1;
        } else if (this.field3080 >= var4) {
            this.field3080 = (this.field3080 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II)V", line = 1341)
    private final synchronized void method1232(int arg0, int arg1) {
        this.field3082 = arg0;
        this.field3091 = arg1;
        this.field3085 = 0;
        this.method1197();
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 1347)
    private static final int method1233(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class178 arg11, int arg12, int arg13) {
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
        arg11.field3080 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "()Z", line = 1379)
    public final boolean method1234() {
        return this.field3085 != 0;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "([IIIII)I", line = 1385)
    private final int method1235(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3085 > 0) {
                int var6 = this.field3085 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3085 += arg1;
                if (this.field3088 == -256 && (this.field3080 & 0xFF) == 0) {
                    if (class128.field2292) {
                        arg1 = method1200(0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, this.field3092, this.field3081, 0, var6, arg2, this);
                    } else {
                        arg1 = method1222(((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, this.field3087, 0, var6, arg2, this);
                    }
                } else if (class128.field2292) {
                    arg1 = method1211(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, this.field3092, this.field3081, 0, var6, arg2, this, this.field3088, arg4);
                } else {
                    arg1 = method1215(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, this.field3087, 0, var6, arg2, this, this.field3088, arg4);
                }
                this.field3085 -= arg1;
                if (this.field3085 != 0) {
                    return arg1;
                }
                if (!this.method1207()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3088 == -256 && (this.field3080 & 0xFF) == 0) {
                if (class128.field2292) {
                    return method1208(0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, 0, arg3, arg2, this);
                }
                return method1201(((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, 0, arg3, arg2, this);
            }
            if (class128.field2292) {
                return method1233(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3079, this.field3078, 0, arg3, arg2, this, this.field3088, arg4);
            }
            return method1229(0, 0, ((class316) this.field4570).field5353, arg0, this.field3080, arg1, this.field3084, 0, arg3, arg2, this, this.field3088, arg4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "()V", line = 1441)
    private final void method1236() {
        if (this.field3085 == 0) {
            return;
        }
        if (this.field3082 == Integer.MIN_VALUE) {
            this.field3082 = 0;
        }
        this.field3085 = 0;
        this.method1197();
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(Z)V", line = 1452)
    public final synchronized void method1237(boolean arg0) {
        this.field3088 = (this.field3088 >>> 31) + (this.field3088 ^ this.field3088 >> 31);
        if (arg0) {
            this.field3088 = -this.field3088;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ltg;II)V", line = 1458)
    private class178(class316 arg0, int arg1, int arg2) {
        this.field4570 = arg0;
        this.field3083 = arg0.field5351;
        this.field3086 = arg0.field5350;
        this.field3090 = arg0.field5354;
        this.field3088 = arg1;
        this.field3082 = arg2;
        this.field3091 = 8192;
        this.field3080 = 0;
        this.method1197();
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ltg;III)V", line = 1469)
    private class178(class316 arg0, int arg1, int arg2, int arg3) {
        this.field4570 = arg0;
        this.field3083 = arg0.field5351;
        this.field3086 = arg0.field5350;
        this.field3090 = arg0.field5354;
        this.field3088 = arg1;
        this.field3082 = arg2;
        this.field3091 = arg3;
        this.field3080 = 0;
        this.method1197();
    }
}
