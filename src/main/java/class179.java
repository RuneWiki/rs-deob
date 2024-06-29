import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class179 extends class40 {

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Z")
    private boolean field3249;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    private int field3244;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    private int field3242;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    private int field3254;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)V", line = 3)
    public final synchronized void method1263(int arg0, int arg1) {
        this.method1276(arg0, arg1, this.method1269());
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[B[IIIIIIIIIILkj;II)I", line = 6)
    private static final int method1264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class179 arg13, int arg14, int arg15) {
        arg13.field3243 -= arg13.field3246 * arg5;
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
        arg13.field3243 += arg13.field3246 * var27;
        arg13.field3240 = arg6;
        arg13.field3247 = arg7;
        arg13.field3241 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II)V", line = 48)
    private final synchronized void method1265(int arg0, int arg1) {
        this.field3242 = arg0;
        this.field3245 = arg1;
        this.field3250 = 0;
        this.method1280();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[B[IIIIIIILkj;II)I", line = 54)
    private static final int method1266(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class179 arg10, int arg11, int arg12) {
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
        arg10.field3241 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 80)
    private static final int method1267(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class179 arg11, int arg12, int arg13) {
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
        arg11.field3241 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([B[IIIIIIILkj;)I", line = 113)
    private static final int method1268(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class179 arg8) {
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
        arg8.field3241 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([III)V", line = 140)
    public final synchronized void method271(int[] arg0, int arg1, int arg2) {
        if (this.field3242 == 0 && this.field3250 == 0) {
            this.method272(arg2);
            return;
        }
        class244 var4 = (class244) this.field550;
        int var5 = this.field3251 << 8;
        int var6 = this.field3252 << 8;
        int var7 = var4.field4230.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3254 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3241 < 0) {
            if (this.field3244 <= 0) {
                this.method1274();
                this.method1325(0);
                return;
            }
            this.field3241 = 0;
        }
        if (this.field3241 >= var7) {
            if (this.field3244 >= 0) {
                this.method1274();
                this.method1325(0);
                return;
            }
            this.field3241 = var7 - 1;
        }
        if (this.field3254 >= 0) {
            if (this.field3254 > 0) {
                if (this.field3249) {
                    label131: {
                        if (this.field3244 < 0) {
                            var9 = this.method1282(arg0, arg1, var5, var10, var4.field4230[this.field3251]);
                            if (this.field3241 >= var5) {
                                return;
                            }
                            this.field3241 = var5 + var5 - this.field3241 - 1;
                            this.field3244 = -this.field3244;
                            if (--this.field3254 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1295(arg0, var9, var6, var10, var4.field4230[this.field3252 - 1]);
                            if (this.field3241 < var6) {
                                return;
                            }
                            this.field3241 = var6 + var6 - this.field3241 - 1;
                            this.field3244 = -this.field3244;
                            if (--this.field3254 == 0) {
                                break;
                            }
                            var9 = this.method1282(arg0, var9, var5, var10, var4.field4230[this.field3251]);
                            if (this.field3241 >= var5) {
                                return;
                            }
                            this.field3241 = var5 + var5 - this.field3241 - 1;
                            this.field3244 = -this.field3244;
                        } while (--this.field3254 != 0);
                    }
                } else if (this.field3244 < 0) {
                    while (true) {
                        var9 = this.method1282(arg0, var9, var5, var10, var4.field4230[this.field3252 - 1]);
                        if (this.field3241 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3241 - 1) / var8;
                        if (var12 >= this.field3254) {
                            this.field3241 += this.field3254 * var8;
                            this.field3254 = 0;
                            break;
                        }
                        this.field3241 += var8 * var12;
                        this.field3254 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1295(arg0, var9, var6, var10, var4.field4230[this.field3251]);
                        if (this.field3241 < var6) {
                            return;
                        }
                        int var13 = (this.field3241 - var5) / var8;
                        if (var13 >= this.field3254) {
                            this.field3241 -= this.field3254 * var8;
                            this.field3254 = 0;
                            break;
                        }
                        this.field3241 -= var8 * var13;
                        this.field3254 -= var13;
                    }
                }
            }
            if (this.field3244 < 0) {
                this.method1282(arg0, var9, 0, var10, 0);
                if (this.field3241 < 0) {
                    this.field3241 = -1;
                    this.method1274();
                    this.method1325(0);
                }
            } else {
                this.method1295(arg0, var9, var7, var10, 0);
                if (this.field3241 >= var7) {
                    this.field3241 = var7;
                    this.method1274();
                    this.method1325(0);
                }
            }
        } else if (this.field3249) {
            if (this.field3244 < 0) {
                var9 = this.method1282(arg0, arg1, var5, var10, var4.field4230[this.field3251]);
                if (this.field3241 >= var5) {
                    return;
                }
                this.field3241 = var5 + var5 - this.field3241 - 1;
                this.field3244 = -this.field3244;
            }
            while (true) {
                int var11 = this.method1295(arg0, var9, var6, var10, var4.field4230[this.field3252 - 1]);
                if (this.field3241 < var6) {
                    return;
                }
                this.field3241 = var6 + var6 - this.field3241 - 1;
                this.field3244 = -this.field3244;
                var9 = this.method1282(arg0, var11, var5, var10, var4.field4230[this.field3251]);
                if (this.field3241 >= var5) {
                    return;
                }
                this.field3241 = var5 + var5 - this.field3241 - 1;
                this.field3244 = -this.field3244;
            }
        } else if (this.field3244 < 0) {
            while (true) {
                var9 = this.method1282(arg0, var9, var5, var10, var4.field4230[this.field3252 - 1]);
                if (this.field3241 >= var5) {
                    return;
                }
                this.field3241 = var6 - (var6 - 1 - this.field3241) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1295(arg0, var9, var6, var10, var4.field4230[this.field3251]);
                if (this.field3241 < var6) {
                    return;
                }
                this.field3241 = (this.field3241 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "()I", line = 376)
    public final synchronized int method1269() {
        return this.field3245 < 0 ? -1 : this.field3245;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "()I", line = 379)
    public final synchronized int method1270() {
        return this.field3244 < 0 ? -this.field3244 : this.field3244;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 383)
    public final synchronized void method1271(int arg0) {
        if (arg0 == 0) {
            this.method1299(0);
            this.method1325(0);
        } else if (this.field3240 == 0 && this.field3247 == 0) {
            this.field3250 = 0;
            this.field3242 = 0;
            this.field3243 = 0;
            this.method1325(0);
        } else {
            int var2 = -this.field3243;
            if (this.field3243 > var2) {
                var2 = this.field3243;
            }
            if (-this.field3240 > var2) {
                var2 = -this.field3240;
            }
            if (this.field3240 > var2) {
                var2 = this.field3240;
            }
            if (-this.field3247 > var2) {
                var2 = -this.field3247;
            }
            if (this.field3247 > var2) {
                var2 = this.field3247;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3250 = arg0;
            this.field3242 = Integer.MIN_VALUE;
            this.field3246 = -this.field3243 / arg0;
            this.field3253 = -this.field3240 / arg0;
            this.field3248 = -this.field3247 / arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 428)
    private static final int method1272(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class179 arg11, int arg12, int arg13) {
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
        arg11.field3241 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "()I", line = 461)
    public final synchronized int method1273() {
        return this.field3242 == Integer.MIN_VALUE ? 0 : this.field3242;
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "()V", line = 464)
    private final void method1274() {
        if (this.field3250 == 0) {
            return;
        }
        if (this.field3242 == Integer.MIN_VALUE) {
            this.field3242 = 0;
        }
        this.field3250 = 0;
        this.method1280();
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 477)
    public final synchronized void method1275(int arg0) {
        if (this.field3244 < 0) {
            this.field3244 = -arg0;
        } else {
            this.field3244 = arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 484)
    public final synchronized void method272(int arg0) {
        if (this.field3250 > 0) {
            if (arg0 >= this.field3250) {
                if (this.field3242 == Integer.MIN_VALUE) {
                    this.field3242 = 0;
                    this.field3243 = this.field3240 = this.field3247 = 0;
                    this.method1325(0);
                    arg0 = this.field3250;
                }
                this.field3250 = 0;
                this.method1280();
            } else {
                this.field3243 += this.field3246 * arg0;
                this.field3240 += this.field3253 * arg0;
                this.field3247 += this.field3248 * arg0;
                this.field3250 -= arg0;
            }
        }
        class244 var2 = (class244) this.field550;
        int var3 = this.field3251 << 8;
        int var4 = this.field3252 << 8;
        int var5 = var2.field4230.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3254 = 0;
        }
        if (this.field3241 < 0) {
            if (this.field3244 <= 0) {
                this.method1274();
                this.method1325(0);
                return;
            }
            this.field3241 = 0;
        }
        if (this.field3241 >= var5) {
            if (this.field3244 >= 0) {
                this.method1274();
                this.method1325(0);
                return;
            }
            this.field3241 = var5 - 1;
        }
        this.field3241 += this.field3244 * arg0;
        if (this.field3254 >= 0) {
            if (this.field3254 > 0) {
                if (this.field3249) {
                    label121: {
                        if (this.field3244 < 0) {
                            if (this.field3241 >= var3) {
                                return;
                            }
                            this.field3241 = var3 + var3 - this.field3241 - 1;
                            this.field3244 = -this.field3244;
                            if (--this.field3254 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3241 < var4) {
                                return;
                            }
                            this.field3241 = var4 + var4 - this.field3241 - 1;
                            this.field3244 = -this.field3244;
                            if (--this.field3254 == 0) {
                                break;
                            }
                            if (this.field3241 >= var3) {
                                return;
                            }
                            this.field3241 = var3 + var3 - this.field3241 - 1;
                            this.field3244 = -this.field3244;
                        } while (--this.field3254 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3244 < 0) {
                            if (this.field3241 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3241 - 1) / var6;
                            if (var7 >= this.field3254) {
                                this.field3241 += this.field3254 * var6;
                                this.field3254 = 0;
                                break label153;
                            }
                            this.field3241 += var6 * var7;
                            this.field3254 -= var7;
                        } else if (this.field3241 >= var4) {
                            int var8 = (this.field3241 - var3) / var6;
                            if (var8 >= this.field3254) {
                                this.field3241 -= this.field3254 * var6;
                                this.field3254 = 0;
                                break label153;
                            }
                            this.field3241 -= var6 * var8;
                            this.field3254 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3244 < 0) {
                if (this.field3241 < 0) {
                    this.field3241 = -1;
                    this.method1274();
                    this.method1325(0);
                }
            } else if (this.field3241 >= var5) {
                this.field3241 = var5;
                this.method1274();
                this.method1325(0);
            }
        } else if (this.field3249) {
            if (this.field3244 < 0) {
                if (this.field3241 >= var3) {
                    return;
                }
                this.field3241 = var3 + var3 - this.field3241 - 1;
                this.field3244 = -this.field3244;
            }
            while (this.field3241 >= var4) {
                this.field3241 = var4 + var4 - this.field3241 - 1;
                this.field3244 = -this.field3244;
                if (this.field3241 >= var3) {
                    return;
                }
                this.field3241 = var3 + var3 - this.field3241 - 1;
                this.field3244 = -this.field3244;
            }
        } else if (this.field3244 < 0) {
            if (this.field3241 >= var3) {
                return;
            }
            this.field3241 = var4 - (var4 - 1 - this.field3241) % var6 - 1;
        } else if (this.field3241 >= var4) {
            this.field3241 = (this.field3241 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V", line = 702)
    public final synchronized void method1276(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1265(arg1, arg2);
            return;
        }
        int var4 = method1289(arg1, arg2);
        int var5 = method1300(arg1, arg2);
        if (this.field3240 == var4 && this.field3247 == var5) {
            this.field3250 = 0;
            return;
        }
        int var6 = arg1 - this.field3243;
        if (this.field3243 - arg1 > var6) {
            var6 = this.field3243 - arg1;
        }
        if (var4 - this.field3240 > var6) {
            var6 = var4 - this.field3240;
        }
        if (this.field3240 - var4 > var6) {
            var6 = this.field3240 - var4;
        }
        if (var5 - this.field3247 > var6) {
            var6 = var5 - this.field3247;
        }
        if (this.field3247 - var5 > var6) {
            var6 = this.field3247 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3250 = arg0;
        this.field3242 = arg1;
        this.field3245 = arg2;
        this.field3246 = (arg1 - this.field3243) / arg0;
        this.field3253 = (var4 - this.field3240) / arg0;
        this.field3248 = (var5 - this.field3247) / arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B[IIIIIIIIIILkj;)I", line = 748)
    private static final int method1277(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class179 arg12) {
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
        arg12.field3243 += (var19 - arg4) * arg12.field3246;
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
        arg12.field3240 = var15 >> 2;
        arg12.field3247 = var16 >> 2;
        arg12.field3241 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[B[IIIIIIIILkj;)I", line = 801)
    private static final int method1278(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class179 arg10) {
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
        arg10.field3241 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltd;II)Lkj;", line = 840)
    public static final class179 method1279(class244 arg0, int arg1, int arg2) {
        return arg0.field4230 == null || arg0.field4230.length == 0 ? null : new class179(arg0, (int) ((long) arg0.field4229 * 256L * (long) arg1 / (long) (class210.field3755 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "()V", line = 846)
    private final void method1280() {
        this.field3243 = this.field3242;
        this.field3240 = method1289(this.field3242, this.field3245);
        this.field3247 = method1300(this.field3242, this.field3245);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II[B[IIIIIIILkj;II)I", line = 851)
    private static final int method1281(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class179 arg10, int arg11, int arg12) {
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
        arg10.field3241 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIII)I", line = 879)
    private final int method1282(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3250 > 0) {
                int var6 = this.field3250 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3250 += arg1;
                if (this.field3244 == -256 && (this.field3241 & 0xFF) == 0) {
                    if (class10.field126) {
                        arg1 = method1302(0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, this.field3253, this.field3248, 0, var6, arg2, this);
                    } else {
                        arg1 = method1288(((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, this.field3246, 0, var6, arg2, this);
                    }
                } else if (class10.field126) {
                    arg1 = method1293(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, this.field3253, this.field3248, 0, var6, arg2, this, this.field3244, arg4);
                } else {
                    arg1 = method1292(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, this.field3246, 0, var6, arg2, this, this.field3244, arg4);
                }
                this.field3250 -= arg1;
                if (this.field3250 != 0) {
                    return arg1;
                }
                if (!this.method1285()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3244 == -256 && (this.field3241 & 0xFF) == 0) {
                if (class10.field126) {
                    return method1278(0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, 0, arg3, arg2, this);
                }
                return method1268(((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, 0, arg3, arg2, this);
            }
            if (class10.field126) {
                return method1272(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, 0, arg3, arg2, this, this.field3244, arg4);
            }
            return method1266(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, 0, arg3, arg2, this, this.field3244, arg4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()Lec;", line = 935)
    public final class40 method276() {
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()I", line = 938)
    public final int method275() {
        return this.field3242 == 0 && this.field3250 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V", line = 947)
    public final synchronized void method1283(boolean arg0) {
        this.field3244 = (this.field3244 >>> 31) + (this.field3244 ^ this.field3244 >> 31);
        if (arg0) {
            this.field3244 = -this.field3244;
        }
    }

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "()Z", line = 953)
    public final boolean method1284() {
        return this.field3241 < 0 || this.field3241 >= ((class244) this.field550).field4230.length << 8;
    }

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "()Z", line = 957)
    private final boolean method1285() {
        int var1 = this.field3242;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1289(var1, this.field3245);
            var2 = method1300(var1, this.field3245);
        }
        if (this.field3243 != var1 || this.field3240 != var3 || this.field3247 != var2) {
            if (this.field3243 < var1) {
                this.field3246 = 1;
                this.field3250 = var1 - this.field3243;
            } else if (this.field3243 > var1) {
                this.field3246 = -1;
                this.field3250 = this.field3243 - var1;
            } else {
                this.field3246 = 0;
            }
            if (this.field3240 < var3) {
                this.field3253 = 1;
                if (this.field3250 == 0 || this.field3250 > var3 - this.field3240) {
                    this.field3250 = var3 - this.field3240;
                }
            } else if (this.field3240 > var3) {
                this.field3253 = -1;
                if (this.field3250 == 0 || this.field3250 > this.field3240 - var3) {
                    this.field3250 = this.field3240 - var3;
                }
            } else {
                this.field3253 = 0;
            }
            if (this.field3247 < var2) {
                this.field3248 = 1;
                if (this.field3250 == 0 || this.field3250 > var2 - this.field3247) {
                    this.field3250 = var2 - this.field3247;
                }
            } else if (this.field3247 > var2) {
                this.field3248 = -1;
                if (this.field3250 == 0 || this.field3250 > this.field3247 - var2) {
                    this.field3250 = this.field3247 - var2;
                }
            } else {
                this.field3248 = 0;
            }
            return false;
        } else if (this.field3242 == Integer.MIN_VALUE) {
            this.field3242 = 0;
            this.field3243 = this.field3240 = this.field3247 = 0;
            this.method1325(0);
            return true;
        } else {
            this.method1280();
            return false;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 1044)
    private static final int method1286(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class179 arg11, int arg12, int arg13) {
        arg11.field3240 -= arg11.field3253 * arg5;
        arg11.field3247 -= arg11.field3248 * arg5;
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
        arg11.field3240 += arg11.field3253 * arg5;
        arg11.field3247 += arg11.field3248 * arg5;
        arg11.field3243 = arg6;
        arg11.field3241 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()I", line = 1078)
    public final int method274() {
        int var1 = this.field3243 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3254 == 0) {
            var2 -= this.field3241 * var2 / (((class244) this.field550).field4230.length << 8);
        } else if (this.field3254 >= 0) {
            var2 -= this.field3251 * var2 / ((class244) this.field550).field4230.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([B[IIIIIIIILkj;)I", line = 1091)
    private static final int method1287(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class179 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3240 += (var14 - arg3) * arg9.field3253;
        arg9.field3247 += (var14 - arg3) * arg9.field3248;
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
        arg9.field3243 = var12 >> 2;
        arg9.field3241 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "([B[IIIIIIIILkj;)I", line = 1125)
    private static final int method1288(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class179 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3240 += (var14 - arg3) * arg9.field3253;
        arg9.field3247 += (var14 - arg3) * arg9.field3248;
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
        arg9.field3243 = var12 >> 2;
        arg9.field3241 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(II)I", line = 1162)
    private static final int method1289(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V", line = 1165)
    public final synchronized void method1290(int arg0) {
        this.method1265(arg0 << 6, this.method1269());
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "([B[IIIIIIILkj;)I", line = 1171)
    private static final int method1291(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class179 arg8) {
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
        arg8.field3241 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()Lec;", line = 1196)
    public final class40 method270() {
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II[B[IIIIIIIILkj;II)I", line = 1200)
    private static final int method1292(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class179 arg11, int arg12, int arg13) {
        arg11.field3240 -= arg11.field3253 * arg5;
        arg11.field3247 -= arg11.field3248 * arg5;
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
        arg11.field3240 += arg11.field3253 * arg5;
        arg11.field3247 += arg11.field3248 * arg5;
        arg11.field3243 = arg6;
        arg11.field3241 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II[B[IIIIIIIIIILkj;II)I", line = 1239)
    private static final int method1293(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class179 arg13, int arg14, int arg15) {
        arg13.field3243 -= arg13.field3246 * arg5;
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
        arg13.field3243 += arg13.field3246 * var26;
        arg13.field3240 = arg6;
        arg13.field3247 = arg7;
        arg13.field3241 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltd;III)Lkj;", line = 1280)
    public static final class179 method1294(class244 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4230 == null || arg0.field4230.length == 0 ? null : new class179(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "([IIIII)I", line = 1286)
    private final int method1295(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3250 > 0) {
                int var6 = this.field3250 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3250 += arg1;
                if (this.field3244 == 256 && (this.field3241 & 0xFF) == 0) {
                    if (class10.field126) {
                        arg1 = method1277(0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, this.field3253, this.field3248, 0, var6, arg2, this);
                    } else {
                        arg1 = method1287(((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, this.field3246, 0, var6, arg2, this);
                    }
                } else if (class10.field126) {
                    arg1 = method1264(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, this.field3253, this.field3248, 0, var6, arg2, this, this.field3244, arg4);
                } else {
                    arg1 = method1286(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, this.field3246, 0, var6, arg2, this, this.field3244, arg4);
                }
                this.field3250 -= arg1;
                if (this.field3250 != 0) {
                    return arg1;
                }
                if (!this.method1285()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3244 == 256 && (this.field3241 & 0xFF) == 0) {
                if (class10.field126) {
                    return method1301(0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, 0, arg3, arg2, this);
                }
                return method1291(((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, 0, arg3, arg2, this);
            }
            if (class10.field126) {
                return method1267(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3240, this.field3247, 0, arg3, arg2, this, this.field3244, arg4);
            }
            return method1281(0, 0, ((class244) this.field550).field4230, arg0, this.field3241, arg1, this.field3243, 0, arg3, arg2, this, this.field3244, arg4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "()Z", line = 1343)
    public final boolean method1296() {
        return this.field3250 != 0;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 1346)
    public final synchronized void method1297(int arg0) {
        this.field3254 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V", line = 1350)
    public final synchronized void method1298(int arg0) {
        int var2 = ((class244) this.field550).field4230.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3241 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V", line = 1360)
    private final synchronized void method1299(int arg0) {
        this.method1265(arg0, this.method1269());
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(II)I", line = 1363)
    private static final int method1300(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I[B[IIIIIIIILkj;)I", line = 1366)
    private static final int method1301(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class179 arg10) {
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
        arg10.field3241 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I[B[IIIIIIIIIILkj;)I", line = 1404)
    private static final int method1302(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class179 arg12) {
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
        arg12.field3243 += (var19 - arg4) * arg12.field3246;
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
        arg12.field3240 = var15 >> 2;
        arg12.field3247 = var16 >> 2;
        arg12.field3241 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ltd;II)V", line = 1458)
    private class179(class244 arg0, int arg1, int arg2) {
        this.field550 = arg0;
        this.field3251 = arg0.field4231;
        this.field3252 = arg0.field4233;
        this.field3249 = arg0.field4232;
        this.field3244 = arg1;
        this.field3242 = arg2;
        this.field3245 = 8192;
        this.field3241 = 0;
        this.method1280();
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ltd;III)V", line = 1469)
    private class179(class244 arg0, int arg1, int arg2, int arg3) {
        this.field550 = arg0;
        this.field3251 = arg0.field4231;
        this.field3252 = arg0.field4233;
        this.field3249 = arg0.field4232;
        this.field3244 = arg1;
        this.field3242 = arg2;
        this.field3245 = arg3;
        this.field3241 = 0;
        this.method1280();
    }
}
