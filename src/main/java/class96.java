import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class96 extends class444 {

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Z")
    private boolean field1419;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[B[IIIIIIIIIILei;II)I")
    private static final int method644(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class96 arg13, int arg14, int arg15) {
        arg13.field1421 -= arg13.field1426 * arg5;
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
        arg13.field1421 += arg13.field1426 * var22;
        arg13.field1418 = arg6;
        arg13.field1427 = arg7;
        arg13.field1417 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Leg;II)Lei;")
    public static final class96 method645(class56 arg0, int arg1, int arg2) {
        return arg0.field812 != null && arg0.field812.length != 0 ? new class96(arg0, (int) ((long) arg0.field811 * 256L * (long) arg1 / (long) (class327.field4473 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public final synchronized void method646(int arg0) {
        if (this.field1429 < 0) {
            this.field1429 = -arg0;
        } else {
            this.field1429 = arg0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()I")
    public final synchronized int method647() {
        return this.field1429 < 0 ? -this.field1429 : this.field1429;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "()Z")
    private final boolean method648() {
        int var1 = this.field1428;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method657(var1, this.field1416);
            var2 = method664(var1, this.field1416);
        }
        if (this.field1421 == var1 && this.field1418 == var3 && this.field1427 == var2) {
            if (this.field1428 == Integer.MIN_VALUE) {
                this.field1428 = 0;
                this.field1421 = this.field1418 = this.field1427 = 0;
                this.method2459(198);
                return true;
            } else {
                this.method676();
                return false;
            }
        } else {
            if (this.field1421 < var1) {
                this.field1426 = 1;
                this.field1415 = var1 - this.field1421;
            } else if (this.field1421 > var1) {
                this.field1426 = -1;
                this.field1415 = this.field1421 - var1;
            } else {
                this.field1426 = 0;
            }
            if (this.field1418 < var3) {
                this.field1420 = 1;
                if (this.field1415 == 0 || this.field1415 > var3 - this.field1418) {
                    this.field1415 = var3 - this.field1418;
                }
            } else if (this.field1418 > var3) {
                this.field1420 = -1;
                if (this.field1415 == 0 || this.field1415 > this.field1418 - var3) {
                    this.field1415 = this.field1418 - var3;
                }
            } else {
                this.field1420 = 0;
            }
            if (this.field1427 < var2) {
                this.field1423 = 1;
                if (this.field1415 == 0 || this.field1415 > var2 - this.field1427) {
                    this.field1415 = var2 - this.field1427;
                }
            } else if (this.field1427 > var2) {
                this.field1423 = -1;
                if (this.field1415 == 0 || this.field1415 > this.field1427 - var2) {
                    this.field1415 = this.field1427 - var2;
                }
            } else {
                this.field1423 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[B[IIIIIIIILei;II)I")
    private static final int method649(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class96 arg11, int arg12, int arg13) {
        arg11.field1418 -= arg11.field1420 * arg5;
        arg11.field1427 -= arg11.field1423 * arg5;
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
        arg11.field1418 += arg11.field1420 * arg5;
        arg11.field1427 += arg11.field1423 * arg5;
        arg11.field1421 = arg6;
        arg11.field1417 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public final synchronized void method650(int arg0) {
        if (arg0 == 0) {
            this.method661(0);
            this.method2459(198);
        } else if (this.field1418 == 0 && this.field1427 == 0) {
            this.field1415 = 0;
            this.field1428 = 0;
            this.field1421 = 0;
            this.method2459(198);
        } else {
            int var2 = -this.field1421;
            if (this.field1421 > var2) {
                var2 = this.field1421;
            }
            if (-this.field1418 > var2) {
                var2 = -this.field1418;
            }
            if (this.field1418 > var2) {
                var2 = this.field1418;
            }
            if (-this.field1427 > var2) {
                var2 = -this.field1427;
            }
            if (this.field1427 > var2) {
                var2 = this.field1427;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1415 = arg0;
            this.field1428 = Integer.MIN_VALUE;
            this.field1426 = -this.field1421 / arg0;
            this.field1420 = -this.field1418 / arg0;
            this.field1423 = -this.field1427 / arg0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
    public final int method208() {
        return this.field1428 == 0 && this.field1415 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "()I")
    public final synchronized int method651() {
        return this.field1416 < 0 ? -1 : this.field1416;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
    public final synchronized void method196(int[] arg0, int arg1, int arg2) {
        if (this.field1428 == 0 && this.field1415 == 0) {
            this.method198(arg2);
        } else {
            class56 var4 = (class56) super.field6417;
            int var5 = this.field1422 << 8;
            int var6 = this.field1424 << 8;
            int var7 = var4.field812.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1425 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1417 < 0) {
                if (this.field1429 <= 0) {
                    this.method670();
                    this.method2459(198);
                    return;
                }
                this.field1417 = 0;
            }
            if (this.field1417 >= var7) {
                if (this.field1429 >= 0) {
                    this.method670();
                    this.method2459(198);
                    return;
                }
                this.field1417 = var7 - 1;
            }
            if (this.field1425 < 0) {
                if (this.field1419) {
                    if (this.field1429 < 0) {
                        var9 = this.method671(arg0, arg1, var5, var10, var4.field812[this.field1422]);
                        if (this.field1417 >= var5) {
                            return;
                        }
                        this.field1417 = var5 + var5 - 1 - this.field1417;
                        this.field1429 = -this.field1429;
                    }
                    while (true) {
                        int var11 = this.method683(arg0, var9, var6, var10, var4.field812[this.field1424 - 1]);
                        if (this.field1417 < var6) {
                            return;
                        }
                        this.field1417 = var6 + var6 - 1 - this.field1417;
                        this.field1429 = -this.field1429;
                        var9 = this.method671(arg0, var11, var5, var10, var4.field812[this.field1422]);
                        if (this.field1417 >= var5) {
                            return;
                        }
                        this.field1417 = var5 + var5 - 1 - this.field1417;
                        this.field1429 = -this.field1429;
                    }
                } else if (this.field1429 < 0) {
                    while (true) {
                        var9 = this.method671(arg0, var9, var5, var10, var4.field812[this.field1424 - 1]);
                        if (this.field1417 >= var5) {
                            return;
                        }
                        this.field1417 = var6 - 1 - (var6 - 1 - this.field1417) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method683(arg0, var9, var6, var10, var4.field812[this.field1422]);
                        if (this.field1417 < var6) {
                            return;
                        }
                        this.field1417 = (this.field1417 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1425 > 0) {
                    if (this.field1419) {
                        label130: {
                            if (this.field1429 < 0) {
                                var9 = this.method671(arg0, arg1, var5, var10, var4.field812[this.field1422]);
                                if (this.field1417 >= var5) {
                                    return;
                                }
                                this.field1417 = var5 + var5 - 1 - this.field1417;
                                this.field1429 = -this.field1429;
                                if (--this.field1425 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method683(arg0, var9, var6, var10, var4.field812[this.field1424 - 1]);
                                if (this.field1417 < var6) {
                                    return;
                                }
                                this.field1417 = var6 + var6 - 1 - this.field1417;
                                this.field1429 = -this.field1429;
                                if (--this.field1425 == 0) {
                                    break;
                                }
                                var9 = this.method671(arg0, var9, var5, var10, var4.field812[this.field1422]);
                                if (this.field1417 >= var5) {
                                    return;
                                }
                                this.field1417 = var5 + var5 - 1 - this.field1417;
                                this.field1429 = -this.field1429;
                            } while (--this.field1425 != 0);
                        }
                    } else if (this.field1429 < 0) {
                        while (true) {
                            var9 = this.method671(arg0, var9, var5, var10, var4.field812[this.field1424 - 1]);
                            if (this.field1417 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1417) / var8;
                            if (var12 >= this.field1425) {
                                this.field1417 += this.field1425 * var8;
                                this.field1425 = 0;
                                break;
                            }
                            this.field1417 += var8 * var12;
                            this.field1425 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method683(arg0, var9, var6, var10, var4.field812[this.field1422]);
                            if (this.field1417 < var6) {
                                return;
                            }
                            int var13 = (this.field1417 - var5) / var8;
                            if (var13 >= this.field1425) {
                                this.field1417 -= this.field1425 * var8;
                                this.field1425 = 0;
                                break;
                            }
                            this.field1417 -= var8 * var13;
                            this.field1425 -= var13;
                        }
                    }
                }
                if (this.field1429 < 0) {
                    this.method671(arg0, var9, 0, var10, 0);
                    if (this.field1417 < 0) {
                        this.field1417 = -1;
                        this.method670();
                        this.method2459(198);
                        return;
                    }
                } else {
                    this.method683(arg0, var9, var7, var10, 0);
                    if (this.field1417 >= var7) {
                        this.field1417 = var7;
                        this.method670();
                        this.method2459(198);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    private final synchronized void method652(int arg0, int arg1) {
        this.field1428 = arg0;
        this.field1416 = arg1;
        this.field1415 = 0;
        this.method676();
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II[B[IIIIIIIILei;II)I")
    private static final int method653(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class96 arg11, int arg12, int arg13) {
        arg11.field1418 -= arg11.field1420 * arg5;
        arg11.field1427 -= arg11.field1423 * arg5;
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
        arg11.field1418 += arg11.field1420 * arg5;
        arg11.field1427 += arg11.field1423 * arg5;
        arg11.field1421 = arg6;
        arg11.field1417 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([B[IIIIIIIILei;)I")
    private static final int method654(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class96 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1418 += (var14 - arg3) * arg9.field1420;
        arg9.field1427 += (var14 - arg3) * arg9.field1423;
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
        arg9.field1421 = var12 >> 2;
        arg9.field1417 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[B[IIIIIIIILei;)I")
    private static final int method655(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class96 arg10) {
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
        arg10.field1417 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([B[IIIIIIILei;)I")
    private static final int method656(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class96 arg8) {
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
        arg8.field1417 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()Lpn;")
    public final class444 method180() {
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)I")
    private static final int method657(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[B[IIIIIIIIIILei;)I")
    private static final int method658(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class96 arg12) {
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
        arg12.field1421 += (var19 - arg4) * arg12.field1426;
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
        arg12.field1418 = var15 >> 2;
        arg12.field1427 = var16 >> 2;
        arg12.field1417 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "()Z")
    public final boolean method659() {
        return this.field1415 != 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public final synchronized void method660(boolean arg0) {
        this.field1429 = (this.field1429 >>> 31) + (this.field1429 ^ this.field1429 >> 31);
        if (arg0) {
            this.field1429 = -this.field1429;
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    private final synchronized void method661(int arg0) {
        this.method652(arg0, this.method651());
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lpn;")
    public final class444 method179() {
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[B[IIIIIIILei;II)I")
    private static final int method662(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class96 arg10, int arg11, int arg12) {
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
        arg10.field1417 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public final synchronized void method663(int arg0) {
        int var2 = ((class56) super.field6417).field812.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1417 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)I")
    private static final int method664(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "()Z")
    public final boolean method665() {
        return this.field1417 < 0 || this.field1417 >= ((class56) super.field6417).field812.length << 8;
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V")
    public final synchronized void method666(int arg0) {
        this.method652(arg0 << 6, this.method651());
    }

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "()I")
    public final synchronized int method667() {
        return this.field1428 == Integer.MIN_VALUE ? 0 : this.field1428;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(II)V")
    public final synchronized void method668(int arg0, int arg1) {
        this.method682(arg0, arg1, this.method651());
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(II[B[IIIIIIIILei;II)I")
    private static final int method669(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class96 arg11, int arg12, int arg13) {
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
        arg11.field1417 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "()V")
    private final void method670() {
        if (this.field1415 != 0) {
            if (this.field1428 == Integer.MIN_VALUE) {
                this.field1428 = 0;
            }
            this.field1415 = 0;
            this.method676();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIIII)I")
    private final int method671(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1415 <= 0) {
                if (this.field1429 == -256 && (this.field1417 & 255) == 0) {
                    if (class31.field488) {
                        return method655(0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, 0, arg3, arg2, this);
                    }
                    return method656(((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, 0, arg3, arg2, this);
                }
                if (class31.field488) {
                    return method680(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, 0, arg3, arg2, this, this.field1429, arg4);
                }
                return method677(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, 0, arg3, arg2, this, this.field1429, arg4);
            }
            int var6 = this.field1415 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1415 += arg1;
            if (this.field1429 == -256 && (this.field1417 & 255) == 0) {
                if (class31.field488) {
                    arg1 = method679(0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, this.field1420, this.field1423, 0, var6, arg2, this);
                } else {
                    arg1 = method681(((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, this.field1426, 0, var6, arg2, this);
                }
            } else if (class31.field488) {
                arg1 = method675(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, this.field1420, this.field1423, 0, var6, arg2, this, this.field1429, arg4);
            } else {
                arg1 = method653(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, this.field1426, 0, var6, arg2, this, this.field1429, arg4);
            }
            this.field1415 -= arg1;
            if (this.field1415 != 0) {
                return arg1;
            }
        } while (!this.method648());
        return arg3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([B[IIIIIIILei;)I")
    private static final int method672(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class96 arg8) {
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
        arg8.field1417 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "(I)V")
    public final synchronized void method673(int arg0) {
        this.field1425 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()I")
    public final int method674() {
        int var1 = this.field1421 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1425 == 0) {
            var2 -= this.field1417 * var2 / (((class56) super.field6417).field812.length << 8);
        } else if (this.field1425 >= 0) {
            var2 -= this.field1422 * var2 / ((class56) super.field6417).field812.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II[B[IIIIIIIIIILei;II)I")
    private static final int method675(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class96 arg13, int arg14, int arg15) {
        arg13.field1421 -= arg13.field1426 * arg5;
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
        arg13.field1421 += arg13.field1426 * var22;
        arg13.field1418 = arg6;
        arg13.field1427 = arg7;
        arg13.field1417 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "()V")
    private final void method676() {
        this.field1421 = this.field1428;
        this.field1418 = method657(this.field1428, this.field1416);
        this.field1427 = method664(this.field1428, this.field1416);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II[B[IIIIIIILei;II)I")
    private static final int method677(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class96 arg10, int arg11, int arg12) {
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
        arg10.field1417 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Leg;III)Lei;")
    public static final class96 method678(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field812 != null && arg0.field812.length != 0 ? new class96(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I[B[IIIIIIIIIILei;)I")
    private static final int method679(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class96 arg12) {
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
        arg12.field1421 += (var19 - arg4) * arg12.field1426;
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
        arg12.field1418 = var15 >> 2;
        arg12.field1427 = var16 >> 2;
        arg12.field1417 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(II[B[IIIIIIIILei;II)I")
    private static final int method680(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class96 arg11, int arg12, int arg13) {
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
        arg11.field1417 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([B[IIIIIIIILei;)I")
    private static final int method681(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class96 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1418 += (var14 - arg3) * arg9.field1420;
        arg9.field1427 += (var14 - arg3) * arg9.field1423;
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
        arg9.field1421 = var12 >> 2;
        arg9.field1417 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    public final synchronized void method682(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method652(arg1, arg2);
        } else {
            int var4 = method657(arg1, arg2);
            int var5 = method664(arg1, arg2);
            if (this.field1418 == var4 && this.field1427 == var5) {
                this.field1415 = 0;
            } else {
                int var6 = arg1 - this.field1421;
                if (this.field1421 - arg1 > var6) {
                    var6 = this.field1421 - arg1;
                }
                if (var4 - this.field1418 > var6) {
                    var6 = var4 - this.field1418;
                }
                if (this.field1418 - var4 > var6) {
                    var6 = this.field1418 - var4;
                }
                if (var5 - this.field1427 > var6) {
                    var6 = var5 - this.field1427;
                }
                if (this.field1427 - var5 > var6) {
                    var6 = this.field1427 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1415 = arg0;
                this.field1428 = arg1;
                this.field1416 = arg2;
                this.field1426 = (arg1 - this.field1421) / arg0;
                this.field1420 = (var4 - this.field1418) / arg0;
                this.field1423 = (var5 - this.field1427) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public final synchronized void method198(int arg0) {
        if (this.field1415 > 0) {
            if (arg0 >= this.field1415) {
                if (this.field1428 == Integer.MIN_VALUE) {
                    this.field1428 = 0;
                    this.field1421 = this.field1418 = this.field1427 = 0;
                    this.method2459(198);
                    arg0 = this.field1415;
                }
                this.field1415 = 0;
                this.method676();
            } else {
                this.field1421 += this.field1426 * arg0;
                this.field1418 += this.field1420 * arg0;
                this.field1427 += this.field1423 * arg0;
                this.field1415 -= arg0;
            }
        }
        class56 var2 = (class56) super.field6417;
        int var3 = this.field1422 << 8;
        int var4 = this.field1424 << 8;
        int var5 = var2.field812.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1425 = 0;
        }
        if (this.field1417 < 0) {
            if (this.field1429 <= 0) {
                this.method670();
                this.method2459(198);
                return;
            }
            this.field1417 = 0;
        }
        if (this.field1417 >= var5) {
            if (this.field1429 >= 0) {
                this.method670();
                this.method2459(198);
                return;
            }
            this.field1417 = var5 - 1;
        }
        this.field1417 += this.field1429 * arg0;
        if (this.field1425 < 0) {
            if (!this.field1419) {
                if (this.field1429 < 0) {
                    if (this.field1417 < var3) {
                        this.field1417 = var4 - 1 - (var4 - 1 - this.field1417) % var6;
                    }
                } else if (this.field1417 >= var4) {
                    this.field1417 = (this.field1417 - var3) % var6 + var3;
                }
            } else {
                if (this.field1429 < 0) {
                    if (this.field1417 >= var3) {
                        return;
                    }
                    this.field1417 = var3 + var3 - 1 - this.field1417;
                    this.field1429 = -this.field1429;
                }
                while (this.field1417 >= var4) {
                    this.field1417 = var4 + var4 - 1 - this.field1417;
                    this.field1429 = -this.field1429;
                    if (this.field1417 >= var3) {
                        return;
                    }
                    this.field1417 = var3 + var3 - 1 - this.field1417;
                    this.field1429 = -this.field1429;
                }
            }
        } else {
            if (this.field1425 > 0) {
                if (this.field1419) {
                    label125: {
                        if (this.field1429 < 0) {
                            if (this.field1417 >= var3) {
                                return;
                            }
                            this.field1417 = var3 + var3 - 1 - this.field1417;
                            this.field1429 = -this.field1429;
                            if (--this.field1425 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1417 < var4) {
                                return;
                            }
                            this.field1417 = var4 + var4 - 1 - this.field1417;
                            this.field1429 = -this.field1429;
                            if (--this.field1425 == 0) {
                                break;
                            }
                            if (this.field1417 >= var3) {
                                return;
                            }
                            this.field1417 = var3 + var3 - 1 - this.field1417;
                            this.field1429 = -this.field1429;
                        } while (--this.field1425 != 0);
                    }
                } else if (this.field1429 < 0) {
                    if (this.field1417 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1417) / var6;
                    if (var7 < this.field1425) {
                        this.field1417 += var6 * var7;
                        this.field1425 -= var7;
                        return;
                    }
                    this.field1417 += this.field1425 * var6;
                    this.field1425 = 0;
                } else {
                    if (this.field1417 < var4) {
                        return;
                    }
                    int var8 = (this.field1417 - var3) / var6;
                    if (var8 < this.field1425) {
                        this.field1417 -= var6 * var8;
                        this.field1425 -= var8;
                        return;
                    }
                    this.field1417 -= this.field1425 * var6;
                    this.field1425 = 0;
                }
            }
            if (this.field1429 < 0) {
                if (this.field1417 < 0) {
                    this.field1417 = -1;
                    this.method670();
                    this.method2459(198);
                    return;
                }
            } else if (this.field1417 >= var5) {
                this.field1417 = var5;
                this.method670();
                this.method2459(198);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([IIIII)I")
    private final int method683(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1415 <= 0) {
                if (this.field1429 == 256 && (this.field1417 & 255) == 0) {
                    if (class31.field488) {
                        return method684(0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, 0, arg3, arg2, this);
                    }
                    return method672(((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, 0, arg3, arg2, this);
                }
                if (class31.field488) {
                    return method669(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, 0, arg3, arg2, this, this.field1429, arg4);
                }
                return method662(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, 0, arg3, arg2, this, this.field1429, arg4);
            }
            int var6 = this.field1415 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1415 += arg1;
            if (this.field1429 == 256 && (this.field1417 & 255) == 0) {
                if (class31.field488) {
                    arg1 = method658(0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, this.field1420, this.field1423, 0, var6, arg2, this);
                } else {
                    arg1 = method654(((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, this.field1426, 0, var6, arg2, this);
                }
            } else if (class31.field488) {
                arg1 = method644(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1418, this.field1427, this.field1420, this.field1423, 0, var6, arg2, this, this.field1429, arg4);
            } else {
                arg1 = method649(0, 0, ((class56) super.field6417).field812, arg0, this.field1417, arg1, this.field1421, this.field1426, 0, var6, arg2, this, this.field1429, arg4);
            }
            this.field1415 -= arg1;
            if (this.field1415 != 0) {
                return arg1;
            }
        } while (!this.method648());
        return arg3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I[B[IIIIIIIILei;)I")
    private static final int method684(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class96 arg10) {
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
        arg10.field1417 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Leg;II)V")
    private class96(class56 arg0, int arg1, int arg2) {
        super.field6417 = arg0;
        this.field1422 = arg0.field808;
        this.field1424 = arg0.field809;
        this.field1419 = arg0.field810;
        this.field1429 = arg1;
        this.field1428 = arg2;
        this.field1416 = 8192;
        this.field1417 = 0;
        this.method676();
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Leg;III)V")
    private class96(class56 arg0, int arg1, int arg2, int arg3) {
        super.field6417 = arg0;
        this.field1422 = arg0.field808;
        this.field1424 = arg0.field809;
        this.field1419 = arg0.field810;
        this.field1429 = arg1;
        this.field1428 = arg2;
        this.field1416 = arg3;
        this.field1417 = 0;
        this.method676();
    }
}
