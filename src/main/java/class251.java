import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class251 extends class149 {

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "Z")
    private boolean field4341;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    private int field4338;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    private int field4350;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    private int field4351;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIIILfi;II)I", line = 4)
    private static final int method1751(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class251 arg11, int arg12, int arg13) {
        arg11.field4349 -= arg11.field4351 * arg5;
        arg11.field4337 -= arg11.field4347 * arg5;
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
        arg11.field4349 += arg11.field4351 * arg5;
        arg11.field4337 += arg11.field4347 * arg5;
        arg11.field4342 = arg6;
        arg11.field4340 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V", line = 37)
    private final synchronized void method1752(int arg0, int arg1) {
        this.field4345 = arg0;
        this.field4348 = arg1;
        this.field4350 = 0;
        this.method1764();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V", line = 43)
    public final synchronized void method392(int[] arg0, int arg1, int arg2) {
        if (this.field4345 == 0 && this.field4350 == 0) {
            this.method388(arg2);
            return;
        }
        class227 var4 = (class227) this.field2559;
        int var5 = this.field4343 << 8;
        int var6 = this.field4344 << 8;
        int var7 = var4.field3960.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4346 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4340 < 0) {
            if (this.field4339 <= 0) {
                this.method1765();
                this.method1978((byte) -109);
                return;
            }
            this.field4340 = 0;
        }
        if (this.field4340 >= var7) {
            if (this.field4339 >= 0) {
                this.method1765();
                this.method1978((byte) -116);
                return;
            }
            this.field4340 = var7 - 1;
        }
        if (this.field4346 >= 0) {
            if (this.field4346 > 0) {
                if (this.field4341) {
                    label131: {
                        if (this.field4339 < 0) {
                            var9 = this.method1770(arg0, arg1, var5, var10, var4.field3960[this.field4343]);
                            if (this.field4340 >= var5) {
                                return;
                            }
                            this.field4340 = var5 + var5 - this.field4340 - 1;
                            this.field4339 = -this.field4339;
                            if (--this.field4346 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1783(arg0, var9, var6, var10, var4.field3960[this.field4344 - 1]);
                            if (this.field4340 < var6) {
                                return;
                            }
                            this.field4340 = var6 + var6 - this.field4340 - 1;
                            this.field4339 = -this.field4339;
                            if (--this.field4346 == 0) {
                                break;
                            }
                            var9 = this.method1770(arg0, var9, var5, var10, var4.field3960[this.field4343]);
                            if (this.field4340 >= var5) {
                                return;
                            }
                            this.field4340 = var5 + var5 - this.field4340 - 1;
                            this.field4339 = -this.field4339;
                        } while (--this.field4346 != 0);
                    }
                } else if (this.field4339 < 0) {
                    while (true) {
                        var9 = this.method1770(arg0, var9, var5, var10, var4.field3960[this.field4344 - 1]);
                        if (this.field4340 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4340 - 1) / var8;
                        if (var12 >= this.field4346) {
                            this.field4340 += this.field4346 * var8;
                            this.field4346 = 0;
                            break;
                        }
                        this.field4340 += var8 * var12;
                        this.field4346 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1783(arg0, var9, var6, var10, var4.field3960[this.field4343]);
                        if (this.field4340 < var6) {
                            return;
                        }
                        int var13 = (this.field4340 - var5) / var8;
                        if (var13 >= this.field4346) {
                            this.field4340 -= this.field4346 * var8;
                            this.field4346 = 0;
                            break;
                        }
                        this.field4340 -= var8 * var13;
                        this.field4346 -= var13;
                    }
                }
            }
            if (this.field4339 < 0) {
                this.method1770(arg0, var9, 0, var10, 0);
                if (this.field4340 < 0) {
                    this.field4340 = -1;
                    this.method1765();
                    this.method1978((byte) -113);
                }
            } else {
                this.method1783(arg0, var9, var7, var10, 0);
                if (this.field4340 >= var7) {
                    this.field4340 = var7;
                    this.method1765();
                    this.method1978((byte) -120);
                }
            }
        } else if (this.field4341) {
            if (this.field4339 < 0) {
                var9 = this.method1770(arg0, arg1, var5, var10, var4.field3960[this.field4343]);
                if (this.field4340 >= var5) {
                    return;
                }
                this.field4340 = var5 + var5 - this.field4340 - 1;
                this.field4339 = -this.field4339;
            }
            while (true) {
                int var11 = this.method1783(arg0, var9, var6, var10, var4.field3960[this.field4344 - 1]);
                if (this.field4340 < var6) {
                    return;
                }
                this.field4340 = var6 + var6 - this.field4340 - 1;
                this.field4339 = -this.field4339;
                var9 = this.method1770(arg0, var11, var5, var10, var4.field3960[this.field4343]);
                if (this.field4340 >= var5) {
                    return;
                }
                this.field4340 = var5 + var5 - this.field4340 - 1;
                this.field4339 = -this.field4339;
            }
        } else if (this.field4339 < 0) {
            while (true) {
                var9 = this.method1770(arg0, var9, var5, var10, var4.field3960[this.field4344 - 1]);
                if (this.field4340 >= var5) {
                    return;
                }
                this.field4340 = var6 - (var6 - 1 - this.field4340) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1783(arg0, var9, var6, var10, var4.field3960[this.field4343]);
                if (this.field4340 < var6) {
                    return;
                }
                this.field4340 = (this.field4340 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 279)
    private final synchronized void method1753(int arg0) {
        this.method1752(arg0, this.method1754());
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "()I", line = 282)
    public final synchronized int method1754() {
        return this.field4348 < 0 ? -1 : this.field4348;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B[IIIIIIILfi;)I", line = 286)
    private static final int method1755(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class251 arg8) {
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
        arg8.field4340 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lej;", line = 311)
    public final class149 method387() {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 315)
    public final synchronized void method1756(int arg0) {
        this.field4346 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "()Z", line = 319)
    public final boolean method1757() {
        return this.field4350 != 0;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V", line = 323)
    public final synchronized void method1758(boolean arg0) {
        this.field4339 = (this.field4339 >>> 31) + (this.field4339 ^ this.field4339 >> 31);
        if (arg0) {
            this.field4339 = -this.field4339;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIILfi;II)I", line = 329)
    private static final int method1759(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class251 arg10, int arg11, int arg12) {
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
        arg10.field4340 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIILfi;II)I", line = 356)
    private static final int method1760(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class251 arg10, int arg11, int arg12) {
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
        arg10.field4340 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "()Z", line = 383)
    public final boolean method1761() {
        return this.field4340 < 0 || this.field4340 >= ((class227) this.field2559).field3960.length << 8;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([B[IIIIIIILfi;)I", line = 387)
    private static final int method1762(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class251 arg8) {
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
        arg8.field4340 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "()Z", line = 413)
    private final boolean method1763() {
        int var1 = this.field4345;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1781(var1, this.field4348);
            var2 = method1772(var1, this.field4348);
        }
        if (this.field4342 != var1 || this.field4349 != var3 || this.field4337 != var2) {
            if (this.field4342 < var1) {
                this.field4338 = 1;
                this.field4350 = var1 - this.field4342;
            } else if (this.field4342 > var1) {
                this.field4338 = -1;
                this.field4350 = this.field4342 - var1;
            } else {
                this.field4338 = 0;
            }
            if (this.field4349 < var3) {
                this.field4351 = 1;
                if (this.field4350 == 0 || this.field4350 > var3 - this.field4349) {
                    this.field4350 = var3 - this.field4349;
                }
            } else if (this.field4349 > var3) {
                this.field4351 = -1;
                if (this.field4350 == 0 || this.field4350 > this.field4349 - var3) {
                    this.field4350 = this.field4349 - var3;
                }
            } else {
                this.field4351 = 0;
            }
            if (this.field4337 < var2) {
                this.field4347 = 1;
                if (this.field4350 == 0 || this.field4350 > var2 - this.field4337) {
                    this.field4350 = var2 - this.field4337;
                }
            } else if (this.field4337 > var2) {
                this.field4347 = -1;
                if (this.field4350 == 0 || this.field4350 > this.field4337 - var2) {
                    this.field4350 = this.field4337 - var2;
                }
            } else {
                this.field4347 = 0;
            }
            return false;
        } else if (this.field4345 == Integer.MIN_VALUE) {
            this.field4345 = 0;
            this.field4342 = this.field4349 = this.field4337 = 0;
            this.method1978((byte) 51);
            return true;
        } else {
            this.method1764();
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "()V", line = 499)
    private final void method1764() {
        this.field4342 = this.field4345;
        this.field4349 = method1781(this.field4345, this.field4348);
        this.field4337 = method1772(this.field4345, this.field4348);
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "()V", line = 505)
    private final void method1765() {
        if (this.field4350 == 0) {
            return;
        }
        if (this.field4345 == Integer.MIN_VALUE) {
            this.field4345 = 0;
        }
        this.field4350 = 0;
        this.method1764();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIIIIILfi;II)I", line = 516)
    private static final int method1766(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class251 arg13, int arg14, int arg15) {
        arg13.field4342 -= arg13.field4338 * arg5;
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
        arg13.field4342 += arg13.field4338 * var27;
        arg13.field4349 = arg6;
        arg13.field4337 = arg7;
        arg13.field4340 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 561)
    public final synchronized void method1767(int arg0) {
        this.method1752(arg0 << 6, this.method1754());
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIIILfi;II)I", line = 565)
    private static final int method1768(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class251 arg11, int arg12, int arg13) {
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
        arg11.field4340 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V", line = 598)
    public final synchronized void method1769(int arg0) {
        if (arg0 == 0) {
            this.method1753(0);
            this.method1978((byte) -106);
        } else if (this.field4349 == 0 && this.field4337 == 0) {
            this.field4350 = 0;
            this.field4345 = 0;
            this.field4342 = 0;
            this.method1978((byte) 33);
        } else {
            int var2 = -this.field4342;
            if (this.field4342 > var2) {
                var2 = this.field4342;
            }
            if (-this.field4349 > var2) {
                var2 = -this.field4349;
            }
            if (this.field4349 > var2) {
                var2 = this.field4349;
            }
            if (-this.field4337 > var2) {
                var2 = -this.field4337;
            }
            if (this.field4337 > var2) {
                var2 = this.field4337;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4350 = arg0;
            this.field4345 = Integer.MIN_VALUE;
            this.field4338 = -this.field4342 / arg0;
            this.field4351 = -this.field4349 / arg0;
            this.field4347 = -this.field4337 / arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIIII)I", line = 645)
    private final int method1770(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4350 > 0) {
                int var6 = this.field4350 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4350 += arg1;
                if (this.field4339 == -256 && (this.field4340 & 0xFF) == 0) {
                    if (class195.field3424) {
                        arg1 = method1774(0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, this.field4351, this.field4347, 0, var6, arg2, this);
                    } else {
                        arg1 = method1775(((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, this.field4338, 0, var6, arg2, this);
                    }
                } else if (class195.field3424) {
                    arg1 = method1788(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, this.field4351, this.field4347, 0, var6, arg2, this, this.field4339, arg4);
                } else {
                    arg1 = method1785(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, this.field4338, 0, var6, arg2, this, this.field4339, arg4);
                }
                this.field4350 -= arg1;
                if (this.field4350 != 0) {
                    return arg1;
                }
                if (!this.method1763()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4339 == -256 && (this.field4340 & 0xFF) == 0) {
                if (class195.field3424) {
                    return method1790(0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, 0, arg3, arg2, this);
                }
                return method1762(((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, 0, arg3, arg2, this);
            }
            if (class195.field3424) {
                return method1768(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, 0, arg3, arg2, this, this.field4339, arg4);
            }
            return method1760(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, 0, arg3, arg2, this, this.field4339, arg4);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lck;II)Lfi;", line = 700)
    public static final class251 method1771(class227 arg0, int arg1, int arg2) {
        return arg0.field3960 == null || arg0.field3960.length == 0 ? null : new class251(arg0, (int) ((long) arg0.field3961 * 256L * (long) arg1 / (long) (class10.field356 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I", line = 707)
    private static final int method1772(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V", line = 712)
    public final synchronized void method1773(int arg0) {
        int var2 = ((class227) this.field2559).field3960.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4340 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()I", line = 724)
    public final int method1001() {
        int var1 = this.field4342 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4346 == 0) {
            var2 -= this.field4340 * var2 / (((class227) this.field2559).field3960.length << 8);
        } else if (this.field4346 >= 0) {
            var2 -= this.field4343 * var2 / ((class227) this.field2559).field3960.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[B[IIIIIIIIIILfi;)I", line = 737)
    private static final int method1774(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class251 arg12) {
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
        arg12.field4342 += (var19 - arg4) * arg12.field4338;
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
        arg12.field4349 = var15 >> 2;
        arg12.field4337 = var16 >> 2;
        arg12.field4340 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B[IIIIIIIILfi;)I", line = 790)
    private static final int method1775(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class251 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4349 += (var14 - arg3) * arg9.field4351;
        arg9.field4337 += (var14 - arg3) * arg9.field4347;
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
        arg9.field4342 = var12 >> 2;
        arg9.field4340 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V", line = 824)
    public final synchronized void method1776(int arg0, int arg1) {
        this.method1786(arg0, arg1, this.method1754());
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()I", line = 831)
    public final int method398() {
        return this.field4345 == 0 && this.field4350 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()Lej;", line = 838)
    public final class149 method397() {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 841)
    public final synchronized void method388(int arg0) {
        if (this.field4350 > 0) {
            if (arg0 >= this.field4350) {
                if (this.field4345 == Integer.MIN_VALUE) {
                    this.field4345 = 0;
                    this.field4342 = this.field4349 = this.field4337 = 0;
                    this.method1978((byte) -104);
                    arg0 = this.field4350;
                }
                this.field4350 = 0;
                this.method1764();
            } else {
                this.field4342 += this.field4338 * arg0;
                this.field4349 += this.field4351 * arg0;
                this.field4337 += this.field4347 * arg0;
                this.field4350 -= arg0;
            }
        }
        class227 var2 = (class227) this.field2559;
        int var3 = this.field4343 << 8;
        int var4 = this.field4344 << 8;
        int var5 = var2.field3960.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4346 = 0;
        }
        if (this.field4340 < 0) {
            if (this.field4339 <= 0) {
                this.method1765();
                this.method1978((byte) -104);
                return;
            }
            this.field4340 = 0;
        }
        if (this.field4340 >= var5) {
            if (this.field4339 >= 0) {
                this.method1765();
                this.method1978((byte) 108);
                return;
            }
            this.field4340 = var5 - 1;
        }
        this.field4340 += this.field4339 * arg0;
        if (this.field4346 >= 0) {
            if (this.field4346 > 0) {
                if (this.field4341) {
                    label121: {
                        if (this.field4339 < 0) {
                            if (this.field4340 >= var3) {
                                return;
                            }
                            this.field4340 = var3 + var3 - this.field4340 - 1;
                            this.field4339 = -this.field4339;
                            if (--this.field4346 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4340 < var4) {
                                return;
                            }
                            this.field4340 = var4 + var4 - this.field4340 - 1;
                            this.field4339 = -this.field4339;
                            if (--this.field4346 == 0) {
                                break;
                            }
                            if (this.field4340 >= var3) {
                                return;
                            }
                            this.field4340 = var3 + var3 - this.field4340 - 1;
                            this.field4339 = -this.field4339;
                        } while (--this.field4346 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4339 < 0) {
                            if (this.field4340 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4340 - 1) / var6;
                            if (var7 >= this.field4346) {
                                this.field4340 += this.field4346 * var6;
                                this.field4346 = 0;
                                break label153;
                            }
                            this.field4340 += var6 * var7;
                            this.field4346 -= var7;
                        } else if (this.field4340 >= var4) {
                            int var8 = (this.field4340 - var3) / var6;
                            if (var8 >= this.field4346) {
                                this.field4340 -= this.field4346 * var6;
                                this.field4346 = 0;
                                break label153;
                            }
                            this.field4340 -= var6 * var8;
                            this.field4346 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4339 < 0) {
                if (this.field4340 < 0) {
                    this.field4340 = -1;
                    this.method1765();
                    this.method1978((byte) -110);
                }
            } else if (this.field4340 >= var5) {
                this.field4340 = var5;
                this.method1765();
                this.method1978((byte) -108);
            }
        } else if (this.field4341) {
            if (this.field4339 < 0) {
                if (this.field4340 >= var3) {
                    return;
                }
                this.field4340 = var3 + var3 - this.field4340 - 1;
                this.field4339 = -this.field4339;
            }
            while (this.field4340 >= var4) {
                this.field4340 = var4 + var4 - this.field4340 - 1;
                this.field4339 = -this.field4339;
                if (this.field4340 >= var3) {
                    return;
                }
                this.field4340 = var3 + var3 - this.field4340 - 1;
                this.field4339 = -this.field4339;
            }
        } else if (this.field4339 < 0) {
            if (this.field4340 >= var3) {
                return;
            }
            this.field4340 = var4 - (var4 - 1 - this.field4340) % var6 - 1;
        } else if (this.field4340 >= var4) {
            this.field4340 = (this.field4340 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[B[IIIIIIIIIILfi;)I", line = 1059)
    private static final int method1777(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class251 arg12) {
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
        arg12.field4342 += (var19 - arg4) * arg12.field4338;
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
        arg12.field4349 = var15 >> 2;
        arg12.field4337 = var16 >> 2;
        arg12.field4340 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II[B[IIIIIIIILfi;II)I", line = 1112)
    private static final int method1778(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class251 arg11, int arg12, int arg13) {
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
        arg11.field4340 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "()I", line = 1145)
    public final synchronized int method1779() {
        return this.field4345 == Integer.MIN_VALUE ? 0 : this.field4345;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lck;III)Lfi;", line = 1149)
    public static final class251 method1780(class227 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3960 == null || arg0.field3960.length == 0 ? null : new class251(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)I", line = 1155)
    private static final int method1781(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "()I", line = 1158)
    public final synchronized int method1782() {
        return this.field4339 < 0 ? -this.field4339 : this.field4339;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([IIIII)I", line = 1161)
    private final int method1783(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4350 > 0) {
                int var6 = this.field4350 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4350 += arg1;
                if (this.field4339 == 256 && (this.field4340 & 0xFF) == 0) {
                    if (class195.field3424) {
                        arg1 = method1777(0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, this.field4351, this.field4347, 0, var6, arg2, this);
                    } else {
                        arg1 = method1787(((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, this.field4338, 0, var6, arg2, this);
                    }
                } else if (class195.field3424) {
                    arg1 = method1766(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, this.field4351, this.field4347, 0, var6, arg2, this, this.field4339, arg4);
                } else {
                    arg1 = method1751(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, this.field4338, 0, var6, arg2, this, this.field4339, arg4);
                }
                this.field4350 -= arg1;
                if (this.field4350 != 0) {
                    return arg1;
                }
                if (!this.method1763()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4339 == 256 && (this.field4340 & 0xFF) == 0) {
                if (class195.field3424) {
                    return method1789(0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, 0, arg3, arg2, this);
                }
                return method1755(((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, 0, arg3, arg2, this);
            }
            if (class195.field3424) {
                return method1778(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4349, this.field4337, 0, arg3, arg2, this, this.field4339, arg4);
            }
            return method1759(0, 0, ((class227) this.field2559).field3960, arg0, this.field4340, arg1, this.field4342, 0, arg3, arg2, this, this.field4339, arg4);
        }
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V", line = 1216)
    public final synchronized void method1784(int arg0) {
        if (this.field4339 < 0) {
            this.field4339 = -arg0;
        } else {
            this.field4339 = arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II[B[IIIIIIIILfi;II)I", line = 1223)
    private static final int method1785(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class251 arg11, int arg12, int arg13) {
        arg11.field4349 -= arg11.field4351 * arg5;
        arg11.field4337 -= arg11.field4347 * arg5;
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
        arg11.field4349 += arg11.field4351 * arg5;
        arg11.field4337 += arg11.field4347 * arg5;
        arg11.field4342 = arg6;
        arg11.field4340 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V", line = 1256)
    public final synchronized void method1786(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1752(arg1, arg2);
            return;
        }
        int var4 = method1781(arg1, arg2);
        int var5 = method1772(arg1, arg2);
        if (this.field4349 == var4 && this.field4337 == var5) {
            this.field4350 = 0;
            return;
        }
        int var6 = arg1 - this.field4342;
        if (this.field4342 - arg1 > var6) {
            var6 = this.field4342 - arg1;
        }
        if (var4 - this.field4349 > var6) {
            var6 = var4 - this.field4349;
        }
        if (this.field4349 - var4 > var6) {
            var6 = this.field4349 - var4;
        }
        if (var5 - this.field4337 > var6) {
            var6 = var5 - this.field4337;
        }
        if (this.field4337 - var5 > var6) {
            var6 = this.field4337 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4350 = arg0;
        this.field4345 = arg1;
        this.field4348 = arg2;
        this.field4338 = (arg1 - this.field4342) / arg0;
        this.field4351 = (var4 - this.field4349) / arg0;
        this.field4347 = (var5 - this.field4337) / arg0;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([B[IIIIIIIILfi;)I", line = 1302)
    private static final int method1787(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class251 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4349 += (var14 - arg3) * arg9.field4351;
        arg9.field4337 += (var14 - arg3) * arg9.field4347;
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
        arg9.field4342 = var12 >> 2;
        arg9.field4340 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIIIIILfi;II)I", line = 1338)
    private static final int method1788(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class251 arg13, int arg14, int arg15) {
        arg13.field4342 -= arg13.field4338 * arg5;
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
        arg13.field4342 += arg13.field4338 * var26;
        arg13.field4349 = arg6;
        arg13.field4337 = arg7;
        arg13.field4340 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[B[IIIIIIIILfi;)I", line = 1380)
    private static final int method1789(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class251 arg10) {
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
        arg10.field4340 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lck;II)V", line = 1420)
    private class251(class227 arg0, int arg1, int arg2) {
        this.field2559 = arg0;
        this.field4343 = arg0.field3963;
        this.field4344 = arg0.field3964;
        this.field4341 = arg0.field3962;
        this.field4339 = arg1;
        this.field4345 = arg2;
        this.field4348 = 8192;
        this.field4340 = 0;
        this.method1764();
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lck;III)V", line = 1431)
    private class251(class227 arg0, int arg1, int arg2, int arg3) {
        this.field2559 = arg0;
        this.field4343 = arg0.field3963;
        this.field4344 = arg0.field3964;
        this.field4341 = arg0.field3962;
        this.field4339 = arg1;
        this.field4345 = arg2;
        this.field4348 = arg3;
        this.field4340 = 0;
        this.method1764();
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[B[IIIIIIIILfi;)I", line = 1443)
    private static final int method1790(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class251 arg10) {
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
        arg10.field4340 = var11 << 8;
        return var16 >> 1;
    }
}
