import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class272 extends class264 {

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    private int field4378;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Z")
    private boolean field4389;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    private int field4381;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    private int field4380;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    private int field4386;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()Z", line = 3)
    public final boolean method1929() {
        return this.field4383 != 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I", line = 6)
    private static final int method1930(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lom;II)Lfe;", line = 12)
    public static final class272 method1931(class125 arg0, int arg1, int arg2) {
        return arg0.field1952 == null || arg0.field1952.length == 0 ? null : new class272(arg0, (int) ((long) arg0.field1956 * 256L * (long) arg1 / (long) (class338.field5275 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([B[IIIIIIILfe;)I", line = 18)
    private static final int method1932(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class272 arg8) {
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
        arg8.field4384 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()Z", line = 45)
    private final boolean method1933() {
        int var1 = this.field4390;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1954(var1, this.field4392);
            var2 = method1930(var1, this.field4392);
        }
        if (this.field4379 != var1 || this.field4391 != var3 || this.field4382 != var2) {
            if (this.field4379 < var1) {
                this.field4385 = 1;
                this.field4383 = var1 - this.field4379;
            } else if (this.field4379 > var1) {
                this.field4385 = -1;
                this.field4383 = this.field4379 - var1;
            } else {
                this.field4385 = 0;
            }
            if (this.field4391 < var3) {
                this.field4388 = 1;
                if (this.field4383 == 0 || this.field4383 > var3 - this.field4391) {
                    this.field4383 = var3 - this.field4391;
                }
            } else if (this.field4391 > var3) {
                this.field4388 = -1;
                if (this.field4383 == 0 || this.field4383 > this.field4391 - var3) {
                    this.field4383 = this.field4391 - var3;
                }
            } else {
                this.field4388 = 0;
            }
            if (this.field4382 < var2) {
                this.field4380 = 1;
                if (this.field4383 == 0 || this.field4383 > var2 - this.field4382) {
                    this.field4383 = var2 - this.field4382;
                }
            } else if (this.field4382 > var2) {
                this.field4380 = -1;
                if (this.field4383 == 0 || this.field4383 > this.field4382 - var2) {
                    this.field4383 = this.field4382 - var2;
                }
            } else {
                this.field4380 = 0;
            }
            return false;
        } else if (this.field4390 == Integer.MIN_VALUE) {
            this.field4390 = 0;
            this.field4379 = this.field4391 = this.field4382 = 0;
            this.method1212((byte) 70);
            return true;
        } else {
            this.method1956();
            return false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([B[IIIIIIIILfe;)I", line = 130)
    private static final int method1934(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class272 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4391 += (var14 - arg3) * arg9.field4388;
        arg9.field4382 += (var14 - arg3) * arg9.field4380;
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
        arg9.field4379 = var12 >> 2;
        arg9.field4384 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 165)
    public final synchronized void method1935(boolean arg0) {
        this.field4381 = (this.field4381 >>> 31) + (this.field4381 ^ this.field4381 >> 31);
        if (arg0) {
            this.field4381 = -this.field4381;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[B[IIIIIIIIIILfe;)I", line = 172)
    private static final int method1936(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class272 arg12) {
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
        arg12.field4379 += (var19 - arg4) * arg12.field4385;
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
        arg12.field4391 = var15 >> 2;
        arg12.field4382 = var16 >> 2;
        arg12.field4384 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[B[IIIIIIILfe;II)I", line = 225)
    private static final int method1937(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class272 arg10, int arg11, int arg12) {
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
        arg10.field4384 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V", line = 252)
    public final synchronized void method1938(int arg0, int arg1) {
        this.method1961(arg0, arg1, this.method1939());
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()I", line = 255)
    public final synchronized int method1939() {
        return this.field4392 < 0 ? -1 : this.field4392;
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "()I", line = 261)
    public final synchronized int method1940() {
        return this.field4381 < 0 ? -this.field4381 : this.field4381;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[B[IIIIIIIIIILfe;II)I", line = 264)
    private static final int method1941(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class272 arg13, int arg14, int arg15) {
        arg13.field4379 -= arg13.field4385 * arg5;
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
        arg13.field4379 += arg13.field4385 * var27;
        arg13.field4391 = arg6;
        arg13.field4382 = arg7;
        arg13.field4384 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([III)V", line = 307)
    public final synchronized void method116(int[] arg0, int arg1, int arg2) {
        if (this.field4390 == 0 && this.field4383 == 0) {
            this.method127(arg2);
            return;
        }
        class125 var4 = (class125) this.field4284;
        int var5 = this.field4387 << 8;
        int var6 = this.field4378 << 8;
        int var7 = var4.field1952.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4386 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4384 < 0) {
            if (this.field4381 <= 0) {
                this.method1958();
                this.method1212((byte) 89);
                return;
            }
            this.field4384 = 0;
        }
        if (this.field4384 >= var7) {
            if (this.field4381 >= 0) {
                this.method1958();
                this.method1212((byte) 76);
                return;
            }
            this.field4384 = var7 - 1;
        }
        if (this.field4386 >= 0) {
            if (this.field4386 > 0) {
                if (this.field4389) {
                    label131: {
                        if (this.field4381 < 0) {
                            var9 = this.method1953(arg0, arg1, var5, var10, var4.field1952[this.field4387]);
                            if (this.field4384 >= var5) {
                                return;
                            }
                            this.field4384 = var5 + var5 - this.field4384 - 1;
                            this.field4381 = -this.field4381;
                            if (--this.field4386 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1944(arg0, var9, var6, var10, var4.field1952[this.field4378 - 1]);
                            if (this.field4384 < var6) {
                                return;
                            }
                            this.field4384 = var6 + var6 - this.field4384 - 1;
                            this.field4381 = -this.field4381;
                            if (--this.field4386 == 0) {
                                break;
                            }
                            var9 = this.method1953(arg0, var9, var5, var10, var4.field1952[this.field4387]);
                            if (this.field4384 >= var5) {
                                return;
                            }
                            this.field4384 = var5 + var5 - this.field4384 - 1;
                            this.field4381 = -this.field4381;
                        } while (--this.field4386 != 0);
                    }
                } else if (this.field4381 < 0) {
                    while (true) {
                        var9 = this.method1953(arg0, var9, var5, var10, var4.field1952[this.field4378 - 1]);
                        if (this.field4384 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4384 - 1) / var8;
                        if (var12 >= this.field4386) {
                            this.field4384 += this.field4386 * var8;
                            this.field4386 = 0;
                            break;
                        }
                        this.field4384 += var8 * var12;
                        this.field4386 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1944(arg0, var9, var6, var10, var4.field1952[this.field4387]);
                        if (this.field4384 < var6) {
                            return;
                        }
                        int var13 = (this.field4384 - var5) / var8;
                        if (var13 >= this.field4386) {
                            this.field4384 -= this.field4386 * var8;
                            this.field4386 = 0;
                            break;
                        }
                        this.field4384 -= var8 * var13;
                        this.field4386 -= var13;
                    }
                }
            }
            if (this.field4381 < 0) {
                this.method1953(arg0, var9, 0, var10, 0);
                if (this.field4384 < 0) {
                    this.field4384 = -1;
                    this.method1958();
                    this.method1212((byte) 102);
                }
            } else {
                this.method1944(arg0, var9, var7, var10, 0);
                if (this.field4384 >= var7) {
                    this.field4384 = var7;
                    this.method1958();
                    this.method1212((byte) 74);
                }
            }
        } else if (this.field4389) {
            if (this.field4381 < 0) {
                var9 = this.method1953(arg0, arg1, var5, var10, var4.field1952[this.field4387]);
                if (this.field4384 >= var5) {
                    return;
                }
                this.field4384 = var5 + var5 - this.field4384 - 1;
                this.field4381 = -this.field4381;
            }
            while (true) {
                int var11 = this.method1944(arg0, var9, var6, var10, var4.field1952[this.field4378 - 1]);
                if (this.field4384 < var6) {
                    return;
                }
                this.field4384 = var6 + var6 - this.field4384 - 1;
                this.field4381 = -this.field4381;
                var9 = this.method1953(arg0, var11, var5, var10, var4.field1952[this.field4387]);
                if (this.field4384 >= var5) {
                    return;
                }
                this.field4384 = var5 + var5 - this.field4384 - 1;
                this.field4381 = -this.field4381;
            }
        } else if (this.field4381 < 0) {
            while (true) {
                var9 = this.method1953(arg0, var9, var5, var10, var4.field1952[this.field4378 - 1]);
                if (this.field4384 >= var5) {
                    return;
                }
                this.field4384 = var6 - (var6 - 1 - this.field4384) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1944(arg0, var9, var6, var10, var4.field1952[this.field4387]);
                if (this.field4384 < var6) {
                    return;
                }
                this.field4384 = (this.field4384 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "()Z", line = 542)
    public final boolean method1942() {
        return this.field4384 < 0 || this.field4384 >= ((class125) this.field4284).field1952.length << 8;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V", line = 549)
    public final synchronized void method127(int arg0) {
        if (this.field4383 > 0) {
            if (arg0 >= this.field4383) {
                if (this.field4390 == Integer.MIN_VALUE) {
                    this.field4390 = 0;
                    this.field4379 = this.field4391 = this.field4382 = 0;
                    this.method1212((byte) 111);
                    arg0 = this.field4383;
                }
                this.field4383 = 0;
                this.method1956();
            } else {
                this.field4379 += this.field4385 * arg0;
                this.field4391 += this.field4388 * arg0;
                this.field4382 += this.field4380 * arg0;
                this.field4383 -= arg0;
            }
        }
        class125 var2 = (class125) this.field4284;
        int var3 = this.field4387 << 8;
        int var4 = this.field4378 << 8;
        int var5 = var2.field1952.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4386 = 0;
        }
        if (this.field4384 < 0) {
            if (this.field4381 <= 0) {
                this.method1958();
                this.method1212((byte) 66);
                return;
            }
            this.field4384 = 0;
        }
        if (this.field4384 >= var5) {
            if (this.field4381 >= 0) {
                this.method1958();
                this.method1212((byte) 104);
                return;
            }
            this.field4384 = var5 - 1;
        }
        this.field4384 += this.field4381 * arg0;
        if (this.field4386 >= 0) {
            if (this.field4386 > 0) {
                if (this.field4389) {
                    label121: {
                        if (this.field4381 < 0) {
                            if (this.field4384 >= var3) {
                                return;
                            }
                            this.field4384 = var3 + var3 - this.field4384 - 1;
                            this.field4381 = -this.field4381;
                            if (--this.field4386 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4384 < var4) {
                                return;
                            }
                            this.field4384 = var4 + var4 - this.field4384 - 1;
                            this.field4381 = -this.field4381;
                            if (--this.field4386 == 0) {
                                break;
                            }
                            if (this.field4384 >= var3) {
                                return;
                            }
                            this.field4384 = var3 + var3 - this.field4384 - 1;
                            this.field4381 = -this.field4381;
                        } while (--this.field4386 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4381 < 0) {
                            if (this.field4384 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4384 - 1) / var6;
                            if (var7 >= this.field4386) {
                                this.field4384 += this.field4386 * var6;
                                this.field4386 = 0;
                                break label153;
                            }
                            this.field4384 += var6 * var7;
                            this.field4386 -= var7;
                        } else if (this.field4384 >= var4) {
                            int var8 = (this.field4384 - var3) / var6;
                            if (var8 >= this.field4386) {
                                this.field4384 -= this.field4386 * var6;
                                this.field4386 = 0;
                                break label153;
                            }
                            this.field4384 -= var6 * var8;
                            this.field4386 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4381 < 0) {
                if (this.field4384 < 0) {
                    this.field4384 = -1;
                    this.method1958();
                    this.method1212((byte) 120);
                }
            } else if (this.field4384 >= var5) {
                this.field4384 = var5;
                this.method1958();
                this.method1212((byte) 89);
            }
        } else if (this.field4389) {
            if (this.field4381 < 0) {
                if (this.field4384 >= var3) {
                    return;
                }
                this.field4384 = var3 + var3 - this.field4384 - 1;
                this.field4381 = -this.field4381;
            }
            while (this.field4384 >= var4) {
                this.field4384 = var4 + var4 - this.field4384 - 1;
                this.field4381 = -this.field4381;
                if (this.field4384 >= var3) {
                    return;
                }
                this.field4384 = var3 + var3 - this.field4384 - 1;
                this.field4381 = -this.field4381;
            }
        } else if (this.field4381 < 0) {
            if (this.field4384 >= var3) {
                return;
            }
            this.field4384 = var4 - (var4 - 1 - this.field4384) % var6 - 1;
        } else if (this.field4384 >= var4) {
            this.field4384 = (this.field4384 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lom;III)Lfe;", line = 768)
    public static final class272 method1943(class125 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1952 == null || arg0.field1952.length == 0 ? null : new class272(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIIII)I", line = 776)
    private final int method1944(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4383 > 0) {
                int var6 = this.field4383 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4383 += arg1;
                if (this.field4381 == 256 && (this.field4384 & 0xFF) == 0) {
                    if (class44.field553) {
                        arg1 = method1965(0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, this.field4388, this.field4380, 0, var6, arg2, this);
                    } else {
                        arg1 = method1963(((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, this.field4385, 0, var6, arg2, this);
                    }
                } else if (class44.field553) {
                    arg1 = method1941(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, this.field4388, this.field4380, 0, var6, arg2, this, this.field4381, arg4);
                } else {
                    arg1 = method1946(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, this.field4385, 0, var6, arg2, this, this.field4381, arg4);
                }
                this.field4383 -= arg1;
                if (this.field4383 != 0) {
                    return arg1;
                }
                if (!this.method1933()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4381 == 256 && (this.field4384 & 0xFF) == 0) {
                if (class44.field553) {
                    return method1952(0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, 0, arg3, arg2, this);
                }
                return method1968(((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, 0, arg3, arg2, this);
            }
            if (class44.field553) {
                return method1960(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, 0, arg3, arg2, this, this.field4381, arg4);
            }
            return method1937(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, 0, arg3, arg2, this, this.field4381, arg4);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 833)
    public final synchronized void method1945(int arg0) {
        int var2 = ((class125) this.field4284).field1952.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4384 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[B[IIIIIIIILfe;II)I", line = 843)
    private static final int method1946(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class272 arg11, int arg12, int arg13) {
        arg11.field4391 -= arg11.field4388 * arg5;
        arg11.field4382 -= arg11.field4380 * arg5;
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
        arg11.field4391 += arg11.field4388 * arg5;
        arg11.field4382 += arg11.field4380 * arg5;
        arg11.field4379 = arg6;
        arg11.field4384 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[B[IIIIIIIILfe;)I", line = 876)
    private static final int method1947(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class272 arg10) {
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
        arg10.field4384 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V", line = 917)
    private final synchronized void method1948(int arg0) {
        this.method1966(arg0, this.method1939());
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()I", line = 921)
    public final int method1886() {
        int var1 = this.field4379 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4386 == 0) {
            var2 -= this.field4384 * var2 / (((class125) this.field4284).field1952.length << 8);
        } else if (this.field4386 >= 0) {
            var2 -= this.field4387 * var2 / ((class125) this.field4284).field1952.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II[B[IIIIIIIILfe;II)I", line = 933)
    private static final int method1949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class272 arg11, int arg12, int arg13) {
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
        arg11.field4384 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II[B[IIIIIIIIIILfe;II)I", line = 965)
    private static final int method1950(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class272 arg13, int arg14, int arg15) {
        arg13.field4379 -= arg13.field4385 * arg5;
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
        arg13.field4379 += arg13.field4385 * var26;
        arg13.field4391 = arg6;
        arg13.field4382 = arg7;
        arg13.field4384 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II[B[IIIIIIIILfe;II)I", line = 1007)
    private static final int method1951(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class272 arg11, int arg12, int arg13) {
        arg11.field4391 -= arg11.field4388 * arg5;
        arg11.field4382 -= arg11.field4380 * arg5;
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
        arg11.field4391 += arg11.field4388 * arg5;
        arg11.field4382 += arg11.field4380 * arg5;
        arg11.field4379 = arg6;
        arg11.field4384 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I[B[IIIIIIIILfe;)I", line = 1040)
    private static final int method1952(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class272 arg10) {
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
        arg10.field4384 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([IIIII)I", line = 1078)
    private final int method1953(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4383 > 0) {
                int var6 = this.field4383 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4383 += arg1;
                if (this.field4381 == -256 && (this.field4384 & 0xFF) == 0) {
                    if (class44.field553) {
                        arg1 = method1936(0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, this.field4388, this.field4380, 0, var6, arg2, this);
                    } else {
                        arg1 = method1934(((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, this.field4385, 0, var6, arg2, this);
                    }
                } else if (class44.field553) {
                    arg1 = method1950(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, this.field4388, this.field4380, 0, var6, arg2, this, this.field4381, arg4);
                } else {
                    arg1 = method1951(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, this.field4385, 0, var6, arg2, this, this.field4381, arg4);
                }
                this.field4383 -= arg1;
                if (this.field4383 != 0) {
                    return arg1;
                }
                if (!this.method1933()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4381 == -256 && (this.field4384 & 0xFF) == 0) {
                if (class44.field553) {
                    return method1947(0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, 0, arg3, arg2, this);
                }
                return method1932(((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, 0, arg3, arg2, this);
            }
            if (class44.field553) {
                return method1949(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4391, this.field4382, 0, arg3, arg2, this, this.field4381, arg4);
            }
            return method1955(0, 0, ((class125) this.field4284).field1952, arg0, this.field4384, arg1, this.field4379, 0, arg3, arg2, this, this.field4381, arg4);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I", line = 1133)
    private static final int method1954(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II[B[IIIIIIILfe;II)I", line = 1137)
    private static final int method1955(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class272 arg10, int arg11, int arg12) {
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
        arg10.field4384 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "()V", line = 1164)
    private final void method1956() {
        this.field4379 = this.field4390;
        this.field4391 = method1954(this.field4390, this.field4392);
        this.field4382 = method1930(this.field4390, this.field4392);
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V", line = 1169)
    public final synchronized void method1957(int arg0) {
        if (this.field4381 < 0) {
            this.field4381 = -arg0;
        } else {
            this.field4381 = arg0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "()V", line = 1176)
    private final void method1958() {
        if (this.field4383 == 0) {
            return;
        }
        if (this.field4390 == Integer.MIN_VALUE) {
            this.field4390 = 0;
        }
        this.field4383 = 0;
        this.method1956();
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()I", line = 1187)
    public final int method126() {
        return this.field4390 == 0 && this.field4383 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V", line = 1194)
    public final synchronized void method1959(int arg0) {
        this.field4386 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(II[B[IIIIIIIILfe;II)I", line = 1197)
    private static final int method1960(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class272 arg11, int arg12, int arg13) {
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
        arg11.field4384 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V", line = 1231)
    public final synchronized void method1961(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1966(arg1, arg2);
            return;
        }
        int var4 = method1954(arg1, arg2);
        int var5 = method1930(arg1, arg2);
        if (this.field4391 == var4 && this.field4382 == var5) {
            this.field4383 = 0;
            return;
        }
        int var6 = arg1 - this.field4379;
        if (this.field4379 - arg1 > var6) {
            var6 = this.field4379 - arg1;
        }
        if (var4 - this.field4391 > var6) {
            var6 = var4 - this.field4391;
        }
        if (this.field4391 - var4 > var6) {
            var6 = this.field4391 - var4;
        }
        if (var5 - this.field4382 > var6) {
            var6 = var5 - this.field4382;
        }
        if (this.field4382 - var5 > var6) {
            var6 = this.field4382 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4383 = arg0;
        this.field4390 = arg1;
        this.field4392 = arg2;
        this.field4385 = (arg1 - this.field4379) / arg0;
        this.field4388 = (var4 - this.field4391) / arg0;
        this.field4380 = (var5 - this.field4382) / arg0;
    }

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "()I", line = 1278)
    public final synchronized int method1962() {
        return this.field4390 == Integer.MIN_VALUE ? 0 : this.field4390;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([B[IIIIIIIILfe;)I", line = 1281)
    private static final int method1963(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class272 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4391 += (var14 - arg3) * arg9.field4388;
        arg9.field4382 += (var14 - arg3) * arg9.field4380;
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
        arg9.field4379 = var12 >> 2;
        arg9.field4384 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()Lsm;", line = 1315)
    public final class264 method119() {
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V", line = 1320)
    public final synchronized void method1964(int arg0) {
        if (arg0 == 0) {
            this.method1948(0);
            this.method1212((byte) 93);
        } else if (this.field4391 == 0 && this.field4382 == 0) {
            this.field4383 = 0;
            this.field4390 = 0;
            this.field4379 = 0;
            this.method1212((byte) 112);
        } else {
            int var2 = -this.field4379;
            if (this.field4379 > var2) {
                var2 = this.field4379;
            }
            if (-this.field4391 > var2) {
                var2 = -this.field4391;
            }
            if (this.field4391 > var2) {
                var2 = this.field4391;
            }
            if (-this.field4382 > var2) {
                var2 = -this.field4382;
            }
            if (this.field4382 > var2) {
                var2 = this.field4382;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4383 = arg0;
            this.field4390 = Integer.MIN_VALUE;
            this.field4385 = -this.field4379 / arg0;
            this.field4388 = -this.field4391 / arg0;
            this.field4380 = -this.field4382 / arg0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I[B[IIIIIIIIIILfe;)I", line = 1366)
    private static final int method1965(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class272 arg12) {
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
        arg12.field4379 += (var19 - arg4) * arg12.field4385;
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
        arg12.field4391 = var15 >> 2;
        arg12.field4382 = var16 >> 2;
        arg12.field4384 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V", line = 1419)
    private final synchronized void method1966(int arg0, int arg1) {
        this.field4390 = arg0;
        this.field4392 = arg1;
        this.field4383 = 0;
        this.method1956();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lsm;", line = 1425)
    public final class264 method125() {
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V", line = 1428)
    public final synchronized void method1967(int arg0) {
        this.method1966(arg0 << 6, this.method1939());
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([B[IIIIIIILfe;)I", line = 1431)
    private static final int method1968(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class272 arg8) {
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
        arg8.field4384 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lom;II)V", line = 1458)
    private class272(class125 arg0, int arg1, int arg2) {
        this.field4284 = arg0;
        this.field4387 = arg0.field1954;
        this.field4378 = arg0.field1953;
        this.field4389 = arg0.field1955;
        this.field4381 = arg1;
        this.field4390 = arg2;
        this.field4392 = 8192;
        this.field4384 = 0;
        this.method1956();
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lom;III)V", line = 1469)
    private class272(class125 arg0, int arg1, int arg2, int arg3) {
        this.field4284 = arg0;
        this.field4387 = arg0.field1954;
        this.field4378 = arg0.field1953;
        this.field4389 = arg0.field1955;
        this.field4381 = arg1;
        this.field4390 = arg2;
        this.field4392 = arg3;
        this.field4384 = 0;
        this.method1956();
    }
}
