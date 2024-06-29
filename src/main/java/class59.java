import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 extends class63 {

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Z")
    private boolean field1395;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[B[IIIIIIIIIILic;II)I")
    private static final int method474(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1393 -= arg13.field1397 * arg5;
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
        arg13.field1393 += arg13.field1397 * var22;
        arg13.field1400 = arg6;
        arg13.field1386 = arg7;
        arg13.field1391 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()Lja;")
    public final class63 method4() {
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method475(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1400 -= arg11.field1396 * arg5;
        arg11.field1386 -= arg11.field1399 * arg5;
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
        arg11.field1400 += arg11.field1396 * arg5;
        arg11.field1386 += arg11.field1399 * arg5;
        arg11.field1393 = arg6;
        arg11.field1391 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V")
    public final synchronized void method12(int[] arg0, int arg1, int arg2) {
        if (this.field1388 == 0 && this.field1389 == 0) {
            this.method6(arg2);
        } else {
            class146 var4 = (class146) super.field1406;
            int var5 = this.field1398 << 8;
            int var6 = this.field1392 << 8;
            int var7 = var4.field3441.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1390 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1391 < 0) {
                if (this.field1387 <= 0) {
                    this.method509();
                    this.method1124((byte) 62);
                    return;
                }
                this.field1391 = 0;
            }
            if (this.field1391 >= var7) {
                if (this.field1387 >= 0) {
                    this.method509();
                    this.method1124((byte) 62);
                    return;
                }
                this.field1391 = var7 - 1;
            }
            if (this.field1390 < 0) {
                if (this.field1395) {
                    if (this.field1387 < 0) {
                        var9 = this.method485(arg0, arg1, var5, var10, var4.field3441[this.field1398]);
                        if (this.field1391 >= var5) {
                            return;
                        }
                        this.field1391 = var5 + var5 - 1 - this.field1391;
                        this.field1387 = -this.field1387;
                    }
                    while (true) {
                        int var11 = this.method505(arg0, var9, var6, var10, var4.field3441[this.field1392 - 1]);
                        if (this.field1391 < var6) {
                            return;
                        }
                        this.field1391 = var6 + var6 - 1 - this.field1391;
                        this.field1387 = -this.field1387;
                        var9 = this.method485(arg0, var11, var5, var10, var4.field3441[this.field1398]);
                        if (this.field1391 >= var5) {
                            return;
                        }
                        this.field1391 = var5 + var5 - 1 - this.field1391;
                        this.field1387 = -this.field1387;
                    }
                } else if (this.field1387 < 0) {
                    while (true) {
                        var9 = this.method485(arg0, var9, var5, var10, var4.field3441[this.field1392 - 1]);
                        if (this.field1391 >= var5) {
                            return;
                        }
                        this.field1391 = var6 - 1 - (var6 - 1 - this.field1391) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method505(arg0, var9, var6, var10, var4.field3441[this.field1398]);
                        if (this.field1391 < var6) {
                            return;
                        }
                        this.field1391 = (this.field1391 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1390 > 0) {
                    if (this.field1395) {
                        label130: {
                            if (this.field1387 < 0) {
                                var9 = this.method485(arg0, arg1, var5, var10, var4.field3441[this.field1398]);
                                if (this.field1391 >= var5) {
                                    return;
                                }
                                this.field1391 = var5 + var5 - 1 - this.field1391;
                                this.field1387 = -this.field1387;
                                if (--this.field1390 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method505(arg0, var9, var6, var10, var4.field3441[this.field1392 - 1]);
                                if (this.field1391 < var6) {
                                    return;
                                }
                                this.field1391 = var6 + var6 - 1 - this.field1391;
                                this.field1387 = -this.field1387;
                                if (--this.field1390 == 0) {
                                    break;
                                }
                                var9 = this.method485(arg0, var9, var5, var10, var4.field3441[this.field1398]);
                                if (this.field1391 >= var5) {
                                    return;
                                }
                                this.field1391 = var5 + var5 - 1 - this.field1391;
                                this.field1387 = -this.field1387;
                            } while (--this.field1390 != 0);
                        }
                    } else if (this.field1387 < 0) {
                        while (true) {
                            var9 = this.method485(arg0, var9, var5, var10, var4.field3441[this.field1392 - 1]);
                            if (this.field1391 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1391) / var8;
                            if (var12 >= this.field1390) {
                                this.field1391 += this.field1390 * var8;
                                this.field1390 = 0;
                                break;
                            }
                            this.field1391 += var8 * var12;
                            this.field1390 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method505(arg0, var9, var6, var10, var4.field3441[this.field1398]);
                            if (this.field1391 < var6) {
                                return;
                            }
                            int var13 = (this.field1391 - var5) / var8;
                            if (var13 >= this.field1390) {
                                this.field1391 -= this.field1390 * var8;
                                this.field1390 = 0;
                                break;
                            }
                            this.field1391 -= var8 * var13;
                            this.field1390 -= var13;
                        }
                    }
                }
                if (this.field1387 < 0) {
                    this.method485(arg0, var9, 0, var10, 0);
                    if (this.field1391 < 0) {
                        this.field1391 = -1;
                        this.method509();
                        this.method1124((byte) 62);
                        return;
                    }
                } else {
                    this.method505(arg0, var9, var7, var10, 0);
                    if (this.field1391 >= var7) {
                        this.field1391 = var7;
                        this.method509();
                        this.method1124((byte) 62);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()I")
    public final synchronized int method476() {
        return this.field1388 == Integer.MIN_VALUE ? 0 : this.field1388;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    private final synchronized void method477(int arg0, int arg1) {
        this.field1388 = arg0;
        this.field1394 = arg1;
        this.field1389 = 0;
        this.method493();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[IIIIIIILic;)I")
    private static final int method478(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1391 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([B[IIIIIIILic;)I")
    private static final int method479(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1391 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()I")
    public final int method480() {
        int var1 = this.field1393 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1390 == 0) {
            var2 -= this.field1391 * var2 / (((class146) super.field1406).field3441.length << 8);
        } else if (this.field1390 >= 0) {
            var2 -= this.field1398 * var2 / ((class146) super.field1406).field3441.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)I")
    private static final int method481(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()Lja;")
    public final class63 method7() {
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([B[IIIIIIIILic;)I")
    private static final int method482(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1400 += (var14 - arg3) * arg9.field1396;
        arg9.field1386 += (var14 - arg3) * arg9.field1399;
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
        arg9.field1393 = var12 >> 2;
        arg9.field1391 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "()Z")
    private final boolean method483() {
        int var1 = this.field1388;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method503(var1, this.field1394);
            var2 = method481(var1, this.field1394);
        }
        if (this.field1393 == var1 && this.field1400 == var3 && this.field1386 == var2) {
            if (this.field1388 == Integer.MIN_VALUE) {
                this.field1388 = 0;
                this.field1393 = this.field1400 = this.field1386 = 0;
                this.method1124((byte) 62);
                return true;
            } else {
                this.method493();
                return false;
            }
        } else {
            if (this.field1393 < var1) {
                this.field1397 = 1;
                this.field1389 = var1 - this.field1393;
            } else if (this.field1393 > var1) {
                this.field1397 = -1;
                this.field1389 = this.field1393 - var1;
            } else {
                this.field1397 = 0;
            }
            if (this.field1400 < var3) {
                this.field1396 = 1;
                if (this.field1389 == 0 || this.field1389 > var3 - this.field1400) {
                    this.field1389 = var3 - this.field1400;
                }
            } else if (this.field1400 > var3) {
                this.field1396 = -1;
                if (this.field1389 == 0 || this.field1389 > this.field1400 - var3) {
                    this.field1389 = this.field1400 - var3;
                }
            } else {
                this.field1396 = 0;
            }
            if (this.field1386 < var2) {
                this.field1399 = 1;
                if (this.field1389 == 0 || this.field1389 > var2 - this.field1386) {
                    this.field1389 = var2 - this.field1386;
                }
            } else if (this.field1386 > var2) {
                this.field1399 = -1;
                if (this.field1389 == 0 || this.field1389 > this.field1386 - var2) {
                    this.field1389 = this.field1386 - var2;
                }
            } else {
                this.field1399 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B[IIIIIIIILic;)I")
    private static final int method484(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1391 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIIII)I")
    private final int method485(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1389 <= 0) {
                if (this.field1387 == -256 && (this.field1391 & 255) == 0) {
                    if (class78.field1824) {
                        return method489(0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, 0, arg3, arg2, this);
                    }
                    return method478(((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, 0, arg3, arg2, this);
                }
                if (class78.field1824) {
                    return method506(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, 0, arg3, arg2, this, this.field1387, arg4);
                }
                return method514(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, 0, arg3, arg2, this, this.field1387, arg4);
            }
            int var6 = this.field1389 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1389 += arg1;
            if (this.field1387 == -256 && (this.field1391 & 255) == 0) {
                if (class78.field1824) {
                    arg1 = method492(0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, this.field1396, this.field1399, 0, var6, arg2, this);
                } else {
                    arg1 = method499(((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, this.field1397, 0, var6, arg2, this);
                }
            } else if (class78.field1824) {
                arg1 = method474(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, this.field1396, this.field1399, 0, var6, arg2, this, this.field1387, arg4);
            } else {
                arg1 = method494(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, this.field1397, 0, var6, arg2, this, this.field1387, arg4);
            }
            this.field1389 -= arg1;
            if (this.field1389 != 0) {
                return arg1;
            }
        } while (!this.method483());
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "()I")
    public final synchronized int method486() {
        return this.field1394 < 0 ? -1 : this.field1394;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final synchronized void method487(int arg0) {
        this.method477(arg0 << 6, this.method486());
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "()Z")
    public final boolean method488() {
        return this.field1389 != 0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I[B[IIIIIIIILic;)I")
    private static final int method489(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1391 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public final synchronized void method490(int arg0) {
        this.field1390 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)V")
    public final synchronized void method491(int arg0, int arg1) {
        this.method513(arg0, arg1, this.method486());
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final synchronized void method6(int arg0) {
        if (this.field1389 > 0) {
            if (arg0 >= this.field1389) {
                if (this.field1388 == Integer.MIN_VALUE) {
                    this.field1388 = 0;
                    this.field1393 = this.field1400 = this.field1386 = 0;
                    this.method1124((byte) 62);
                    arg0 = this.field1389;
                }
                this.field1389 = 0;
                this.method493();
            } else {
                this.field1393 += this.field1397 * arg0;
                this.field1400 += this.field1396 * arg0;
                this.field1386 += this.field1399 * arg0;
                this.field1389 -= arg0;
            }
        }
        class146 var2 = (class146) super.field1406;
        int var3 = this.field1398 << 8;
        int var4 = this.field1392 << 8;
        int var5 = var2.field3441.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1390 = 0;
        }
        if (this.field1391 < 0) {
            if (this.field1387 <= 0) {
                this.method509();
                this.method1124((byte) 62);
                return;
            }
            this.field1391 = 0;
        }
        if (this.field1391 >= var5) {
            if (this.field1387 >= 0) {
                this.method509();
                this.method1124((byte) 62);
                return;
            }
            this.field1391 = var5 - 1;
        }
        this.field1391 += this.field1387 * arg0;
        if (this.field1390 < 0) {
            if (!this.field1395) {
                if (this.field1387 < 0) {
                    if (this.field1391 < var3) {
                        this.field1391 = var4 - 1 - (var4 - 1 - this.field1391) % var6;
                    }
                } else if (this.field1391 >= var4) {
                    this.field1391 = (this.field1391 - var3) % var6 + var3;
                }
            } else {
                if (this.field1387 < 0) {
                    if (this.field1391 >= var3) {
                        return;
                    }
                    this.field1391 = var3 + var3 - 1 - this.field1391;
                    this.field1387 = -this.field1387;
                }
                while (this.field1391 >= var4) {
                    this.field1391 = var4 + var4 - 1 - this.field1391;
                    this.field1387 = -this.field1387;
                    if (this.field1391 >= var3) {
                        return;
                    }
                    this.field1391 = var3 + var3 - 1 - this.field1391;
                    this.field1387 = -this.field1387;
                }
            }
        } else {
            if (this.field1390 > 0) {
                if (this.field1395) {
                    label125: {
                        if (this.field1387 < 0) {
                            if (this.field1391 >= var3) {
                                return;
                            }
                            this.field1391 = var3 + var3 - 1 - this.field1391;
                            this.field1387 = -this.field1387;
                            if (--this.field1390 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1391 < var4) {
                                return;
                            }
                            this.field1391 = var4 + var4 - 1 - this.field1391;
                            this.field1387 = -this.field1387;
                            if (--this.field1390 == 0) {
                                break;
                            }
                            if (this.field1391 >= var3) {
                                return;
                            }
                            this.field1391 = var3 + var3 - 1 - this.field1391;
                            this.field1387 = -this.field1387;
                        } while (--this.field1390 != 0);
                    }
                } else if (this.field1387 < 0) {
                    if (this.field1391 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1391) / var6;
                    if (var7 < this.field1390) {
                        this.field1391 += var6 * var7;
                        this.field1390 -= var7;
                        return;
                    }
                    this.field1391 += this.field1390 * var6;
                    this.field1390 = 0;
                } else {
                    if (this.field1391 < var4) {
                        return;
                    }
                    int var8 = (this.field1391 - var3) / var6;
                    if (var8 < this.field1390) {
                        this.field1391 -= var6 * var8;
                        this.field1390 -= var8;
                        return;
                    }
                    this.field1391 -= this.field1390 * var6;
                    this.field1390 = 0;
                }
            }
            if (this.field1387 < 0) {
                if (this.field1391 < 0) {
                    this.field1391 = -1;
                    this.method509();
                    this.method1124((byte) 62);
                    return;
                }
            } else if (this.field1391 >= var5) {
                this.field1391 = var5;
                this.method509();
                this.method1124((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B[IIIIIIIIIILic;)I")
    private static final int method492(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1393 += (var19 - arg4) * arg12.field1397;
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
        arg12.field1400 = var15 >> 2;
        arg12.field1386 = var16 >> 2;
        arg12.field1391 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "()V")
    private final void method493() {
        this.field1393 = this.field1388;
        this.field1400 = method503(this.field1388, this.field1394);
        this.field1386 = method481(this.field1388, this.field1394);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method494(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1400 -= arg11.field1396 * arg5;
        arg11.field1386 -= arg11.field1399 * arg5;
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
        arg11.field1400 += arg11.field1396 * arg5;
        arg11.field1386 += arg11.field1399 * arg5;
        arg11.field1393 = arg6;
        arg11.field1391 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public final synchronized void method495(int arg0) {
        if (arg0 == 0) {
            this.method497(0);
            this.method1124((byte) 62);
        } else if (this.field1400 == 0 && this.field1386 == 0) {
            this.field1389 = 0;
            this.field1388 = 0;
            this.field1393 = 0;
            this.method1124((byte) 62);
        } else {
            int var2 = -this.field1393;
            if (this.field1393 > var2) {
                var2 = this.field1393;
            }
            if (-this.field1400 > var2) {
                var2 = -this.field1400;
            }
            if (this.field1400 > var2) {
                var2 = this.field1400;
            }
            if (-this.field1386 > var2) {
                var2 = -this.field1386;
            }
            if (this.field1386 > var2) {
                var2 = this.field1386;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1389 = arg0;
            this.field1388 = Integer.MIN_VALUE;
            this.field1397 = -this.field1393 / arg0;
            this.field1396 = -this.field1400 / arg0;
            this.field1399 = -this.field1386 / arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lvb;III)Lic;")
    public static final class59 method496(class146 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3441 != null && arg0.field3441.length != 0 ? new class59(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    private final synchronized void method497(int arg0) {
        this.method477(arg0, this.method486());
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
    public final int method5() {
        return this.field1388 == 0 && this.field1389 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lvb;II)Lic;")
    public static final class59 method498(class146 arg0, int arg1, int arg2) {
        return arg0.field3441 != null && arg0.field3441.length != 0 ? new class59(arg0, (int) ((long) arg0.field3440 * 256L * (long) arg1 / (long) (class48.field1164 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([B[IIIIIIIILic;)I")
    private static final int method499(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1400 += (var14 - arg3) * arg9.field1396;
        arg9.field1386 += (var14 - arg3) * arg9.field1399;
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
        arg9.field1393 = var12 >> 2;
        arg9.field1391 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "()I")
    public final synchronized int method500() {
        return this.field1387 < 0 ? -this.field1387 : this.field1387;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I[B[IIIIIIIIIILic;)I")
    private static final int method501(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1393 += (var19 - arg4) * arg12.field1397;
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
        arg12.field1400 = var15 >> 2;
        arg12.field1386 = var16 >> 2;
        arg12.field1391 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[B[IIIIIIILic;II)I")
    private static final int method502(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1391 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)I")
    private static final int method503(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "()Z")
    public final boolean method504() {
        return this.field1391 < 0 || this.field1391 >= ((class146) super.field1406).field3441.length << 8;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([IIIII)I")
    private final int method505(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1389 <= 0) {
                if (this.field1387 == 256 && (this.field1391 & 255) == 0) {
                    if (class78.field1824) {
                        return method484(0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, 0, arg3, arg2, this);
                    }
                    return method479(((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, 0, arg3, arg2, this);
                }
                if (class78.field1824) {
                    return method508(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, 0, arg3, arg2, this, this.field1387, arg4);
                }
                return method502(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, 0, arg3, arg2, this, this.field1387, arg4);
            }
            int var6 = this.field1389 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1389 += arg1;
            if (this.field1387 == 256 && (this.field1391 & 255) == 0) {
                if (class78.field1824) {
                    arg1 = method501(0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, this.field1396, this.field1399, 0, var6, arg2, this);
                } else {
                    arg1 = method482(((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, this.field1397, 0, var6, arg2, this);
                }
            } else if (class78.field1824) {
                arg1 = method507(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1400, this.field1386, this.field1396, this.field1399, 0, var6, arg2, this, this.field1387, arg4);
            } else {
                arg1 = method475(0, 0, ((class146) super.field1406).field3441, arg0, this.field1391, arg1, this.field1393, this.field1397, 0, var6, arg2, this, this.field1387, arg4);
            }
            this.field1389 -= arg1;
            if (this.field1389 != 0) {
                return arg1;
            }
        } while (!this.method483());
        return arg3;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method506(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1391 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II[B[IIIIIIIIIILic;II)I")
    private static final int method507(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1393 -= arg13.field1397 * arg5;
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
        arg13.field1393 += arg13.field1397 * var22;
        arg13.field1400 = arg6;
        arg13.field1386 = arg7;
        arg13.field1391 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II[B[IIIIIIIILic;II)I")
    private static final int method508(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1391 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "()V")
    private final void method509() {
        if (this.field1389 != 0) {
            if (this.field1388 == Integer.MIN_VALUE) {
                this.field1388 = 0;
            }
            this.field1389 = 0;
            this.method493();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public final synchronized void method510(boolean arg0) {
        this.field1387 = (this.field1387 >>> 31) + (this.field1387 ^ this.field1387 >> 31);
        if (arg0) {
            this.field1387 = -this.field1387;
        }
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
    public final synchronized void method511(int arg0) {
        int var2 = ((class146) super.field1406).field3441.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1391 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
    public final synchronized void method512(int arg0) {
        if (this.field1387 < 0) {
            this.field1387 = -arg0;
        } else {
            this.field1387 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final synchronized void method513(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method477(arg1, arg2);
        } else {
            int var4 = method503(arg1, arg2);
            int var5 = method481(arg1, arg2);
            if (this.field1400 == var4 && this.field1386 == var5) {
                this.field1389 = 0;
            } else {
                int var6 = arg1 - this.field1393;
                if (this.field1393 - arg1 > var6) {
                    var6 = this.field1393 - arg1;
                }
                if (var4 - this.field1400 > var6) {
                    var6 = var4 - this.field1400;
                }
                if (this.field1400 - var4 > var6) {
                    var6 = this.field1400 - var4;
                }
                if (var5 - this.field1386 > var6) {
                    var6 = var5 - this.field1386;
                }
                if (this.field1386 - var5 > var6) {
                    var6 = this.field1386 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1389 = arg0;
                this.field1388 = arg1;
                this.field1394 = arg2;
                this.field1397 = (arg1 - this.field1393) / arg0;
                this.field1396 = (var4 - this.field1400) / arg0;
                this.field1399 = (var5 - this.field1386) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lvb;II)V")
    private class59(class146 arg0, int arg1, int arg2) {
        super.field1406 = arg0;
        this.field1398 = arg0.field3444;
        this.field1392 = arg0.field3442;
        this.field1395 = arg0.field3443;
        this.field1387 = arg1;
        this.field1388 = arg2;
        this.field1394 = 8192;
        this.field1391 = 0;
        this.method493();
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lvb;III)V")
    private class59(class146 arg0, int arg1, int arg2, int arg3) {
        super.field1406 = arg0;
        this.field1398 = arg0.field3444;
        this.field1392 = arg0.field3442;
        this.field1395 = arg0.field3443;
        this.field1387 = arg1;
        this.field1388 = arg2;
        this.field1394 = arg3;
        this.field1391 = 0;
        this.method493();
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II[B[IIIIIIILic;II)I")
    private static final int method514(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1391 = arg4;
        return arg5;
    }
}
