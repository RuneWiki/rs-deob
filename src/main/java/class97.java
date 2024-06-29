import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class97 extends class270 {

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "Z")
    private boolean field1415;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([B[IIIIIIIILct;)I", line = 3)
    private static final int method556(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class97 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1421 += (var14 - arg3) * arg9.field1418;
        arg9.field1422 += (var14 - arg3) * arg9.field1413;
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
        arg9.field1419 = var12 >> 2;
        arg9.field1416 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[IIIIIIIIIILct;II)I", line = 37)
    private static final int method557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class97 arg13, int arg14, int arg15) {
        arg13.field1419 -= arg13.field1423 * arg5;
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
        arg13.field1419 += arg13.field1423 * var22;
        arg13.field1421 = arg6;
        arg13.field1422 = arg7;
        arg13.field1416 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[B[IIIIIIIIIILct;)I", line = 80)
    private static final int method558(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class97 arg12) {
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
        arg12.field1419 += (var19 - arg4) * arg12.field1423;
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
        arg12.field1421 = var15 >> 2;
        arg12.field1422 = var16 >> 2;
        arg12.field1416 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lnq;III)Lct;", line = 133)
    public static final class97 method559(class319 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4575 != null && arg0.field4575.length != 0 ? new class97(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V", line = 139)
    private final synchronized void method560(int arg0) {
        this.method565(arg0, this.method570());
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V", line = 144)
    public final synchronized void method561(int arg0) {
        int var2 = ((class319) super.field3931).field4575.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1416 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "()Z", line = 154)
    public final boolean method562() {
        return this.field1420 != 0;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "()Lhf;", line = 157)
    public final class270 method563() {
        return null;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I[B[IIIIIIIIIILct;)I", line = 160)
    private static final int method564(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class97 arg12) {
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
        arg12.field1419 += (var19 - arg4) * arg12.field1423;
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
        arg12.field1421 = var15 >> 2;
        arg12.field1422 = var16 >> 2;
        arg12.field1416 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V", line = 213)
    private final synchronized void method565(int arg0, int arg1) {
        this.field1414 = arg0;
        this.field1417 = arg1;
        this.field1420 = 0;
        this.method580();
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 219)
    public final synchronized void method566(int arg0) {
        if (this.field1420 > 0) {
            if (arg0 >= this.field1420) {
                if (this.field1414 == Integer.MIN_VALUE) {
                    this.field1414 = 0;
                    this.field1419 = this.field1421 = this.field1422 = 0;
                    this.method2049(-97);
                    arg0 = this.field1420;
                }
                this.field1420 = 0;
                this.method580();
            } else {
                this.field1419 += this.field1423 * arg0;
                this.field1421 += this.field1418 * arg0;
                this.field1422 += this.field1413 * arg0;
                this.field1420 -= arg0;
            }
        }
        class319 var2 = (class319) super.field3931;
        int var3 = this.field1409 << 8;
        int var4 = this.field1410 << 8;
        int var5 = var2.field4575.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1412 = 0;
        }
        if (this.field1416 < 0) {
            if (this.field1411 <= 0) {
                this.method582();
                this.method2049(-121);
                return;
            }
            this.field1416 = 0;
        }
        if (this.field1416 >= var5) {
            if (this.field1411 >= 0) {
                this.method582();
                this.method2049(-101);
                return;
            }
            this.field1416 = var5 - 1;
        }
        this.field1416 += this.field1411 * arg0;
        if (this.field1412 < 0) {
            if (!this.field1415) {
                if (this.field1411 < 0) {
                    if (this.field1416 < var3) {
                        this.field1416 = var4 - 1 - (var4 - 1 - this.field1416) % var6;
                    }
                } else if (this.field1416 >= var4) {
                    this.field1416 = (this.field1416 - var3) % var6 + var3;
                }
            } else {
                if (this.field1411 < 0) {
                    if (this.field1416 >= var3) {
                        return;
                    }
                    this.field1416 = var3 + var3 - 1 - this.field1416;
                    this.field1411 = -this.field1411;
                }
                while (this.field1416 >= var4) {
                    this.field1416 = var4 + var4 - 1 - this.field1416;
                    this.field1411 = -this.field1411;
                    if (this.field1416 >= var3) {
                        return;
                    }
                    this.field1416 = var3 + var3 - 1 - this.field1416;
                    this.field1411 = -this.field1411;
                }
            }
        } else {
            if (this.field1412 > 0) {
                if (this.field1415) {
                    label125: {
                        if (this.field1411 < 0) {
                            if (this.field1416 >= var3) {
                                return;
                            }
                            this.field1416 = var3 + var3 - 1 - this.field1416;
                            this.field1411 = -this.field1411;
                            if (--this.field1412 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1416 < var4) {
                                return;
                            }
                            this.field1416 = var4 + var4 - 1 - this.field1416;
                            this.field1411 = -this.field1411;
                            if (--this.field1412 == 0) {
                                break;
                            }
                            if (this.field1416 >= var3) {
                                return;
                            }
                            this.field1416 = var3 + var3 - 1 - this.field1416;
                            this.field1411 = -this.field1411;
                        } while (--this.field1412 != 0);
                    }
                } else if (this.field1411 < 0) {
                    if (this.field1416 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1416) / var6;
                    if (var7 < this.field1412) {
                        this.field1416 += var6 * var7;
                        this.field1412 -= var7;
                        return;
                    }
                    this.field1416 += this.field1412 * var6;
                    this.field1412 = 0;
                } else {
                    if (this.field1416 < var4) {
                        return;
                    }
                    int var8 = (this.field1416 - var3) / var6;
                    if (var8 < this.field1412) {
                        this.field1416 -= var6 * var8;
                        this.field1412 -= var8;
                        return;
                    }
                    this.field1416 -= this.field1412 * var6;
                    this.field1412 = 0;
                }
            }
            if (this.field1411 < 0) {
                if (this.field1416 < 0) {
                    this.field1416 = -1;
                    this.method582();
                    this.method2049(-102);
                    return;
                }
            } else if (this.field1416 >= var5) {
                this.field1416 = var5;
                this.method582();
                this.method2049(-119);
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V", line = 437)
    public final synchronized void method567(int arg0, int arg1) {
        this.method601(arg0, arg1, this.method570());
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "()I", line = 441)
    public final int method568() {
        int var1 = this.field1419 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1412 == 0) {
            var2 -= this.field1416 * var2 / (((class319) super.field3931).field4575.length << 8);
        } else if (this.field1412 >= 0) {
            var2 -= this.field1409 * var2 / ((class319) super.field3931).field4575.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([IIIII)I", line = 455)
    private final int method569(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1420 <= 0) {
                if (this.field1411 == 256 && (this.field1416 & 255) == 0) {
                    if (class323.field4619) {
                        return method571(0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, 0, arg3, arg2, this);
                    }
                    return method578(((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, 0, arg3, arg2, this);
                }
                if (class323.field4619) {
                    return method574(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, 0, arg3, arg2, this, this.field1411, arg4);
                }
                return method600(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, 0, arg3, arg2, this, this.field1411, arg4);
            }
            int var6 = this.field1420 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1420 += arg1;
            if (this.field1411 == 256 && (this.field1416 & 255) == 0) {
                if (class323.field4619) {
                    arg1 = method564(0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, this.field1418, this.field1413, 0, var6, arg2, this);
                } else {
                    arg1 = method556(((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, this.field1423, 0, var6, arg2, this);
                }
            } else if (class323.field4619) {
                arg1 = method557(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, this.field1418, this.field1413, 0, var6, arg2, this, this.field1411, arg4);
            } else {
                arg1 = method579(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, this.field1423, 0, var6, arg2, this, this.field1411, arg4);
            }
            this.field1420 -= arg1;
            if (this.field1420 != 0) {
                return arg1;
            }
        } while (!this.method597());
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "()I", line = 511)
    public final synchronized int method570() {
        return this.field1417 < 0 ? -1 : this.field1417;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[B[IIIIIIIILct;)I", line = 514)
    private static final int method571(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10) {
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
        arg10.field1416 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "()I", line = 554)
    public final synchronized int method572() {
        return this.field1411 < 0 ? -this.field1411 : this.field1411;
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "()Z", line = 557)
    public final boolean method573() {
        return this.field1416 < 0 || this.field1416 >= ((class319) super.field3931).field4575.length << 8;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[IIIIIIIILct;II)I", line = 561)
    private static final int method574(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class97 arg11, int arg12, int arg13) {
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
        arg11.field1416 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "(I)V", line = 594)
    public final synchronized void method575(int arg0) {
        if (this.field1411 < 0) {
            this.field1411 = -arg0;
        } else {
            this.field1411 = arg0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "()I", line = 602)
    public final int method576() {
        return this.field1414 == 0 && this.field1420 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II[B[IIIIIIIILct;II)I", line = 608)
    private static final int method577(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class97 arg11, int arg12, int arg13) {
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
        arg11.field1416 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([B[IIIIIIILct;)I", line = 640)
    private static final int method578(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class97 arg8) {
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
        arg8.field1416 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II[B[IIIIIIIILct;II)I", line = 667)
    private static final int method579(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class97 arg11, int arg12, int arg13) {
        arg11.field1421 -= arg11.field1418 * arg5;
        arg11.field1422 -= arg11.field1413 * arg5;
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
        arg11.field1421 += arg11.field1418 * arg5;
        arg11.field1422 += arg11.field1413 * arg5;
        arg11.field1419 = arg6;
        arg11.field1416 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "()V", line = 701)
    private final void method580() {
        this.field1419 = this.field1414;
        this.field1421 = method590(this.field1414, this.field1417);
        this.field1422 = method587(this.field1414, this.field1417);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([IIIII)I", line = 706)
    private final int method581(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1420 <= 0) {
                if (this.field1411 == -256 && (this.field1416 & 255) == 0) {
                    if (class323.field4619) {
                        return method586(0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, 0, arg3, arg2, this);
                    }
                    return method593(((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, 0, arg3, arg2, this);
                }
                if (class323.field4619) {
                    return method577(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, 0, arg3, arg2, this, this.field1411, arg4);
                }
                return method594(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, 0, arg3, arg2, this, this.field1411, arg4);
            }
            int var6 = this.field1420 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1420 += arg1;
            if (this.field1411 == -256 && (this.field1416 & 255) == 0) {
                if (class323.field4619) {
                    arg1 = method558(0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, this.field1418, this.field1413, 0, var6, arg2, this);
                } else {
                    arg1 = method591(((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, this.field1423, 0, var6, arg2, this);
                }
            } else if (class323.field4619) {
                arg1 = method584(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1421, this.field1422, this.field1418, this.field1413, 0, var6, arg2, this, this.field1411, arg4);
            } else {
                arg1 = method599(0, 0, ((class319) super.field3931).field4575, arg0, this.field1416, arg1, this.field1419, this.field1423, 0, var6, arg2, this, this.field1411, arg4);
            }
            this.field1420 -= arg1;
            if (this.field1420 != 0) {
                return arg1;
            }
        } while (!this.method597());
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "()V", line = 763)
    private final void method582() {
        if (this.field1420 != 0) {
            if (this.field1414 == Integer.MIN_VALUE) {
                this.field1414 = 0;
            }
            this.field1420 = 0;
            this.method580();
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([III)V", line = 775)
    public final synchronized void method583(int[] arg0, int arg1, int arg2) {
        if (this.field1414 == 0 && this.field1420 == 0) {
            this.method566(arg2);
        } else {
            class319 var4 = (class319) super.field3931;
            int var5 = this.field1409 << 8;
            int var6 = this.field1410 << 8;
            int var7 = var4.field4575.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1412 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1416 < 0) {
                if (this.field1411 <= 0) {
                    this.method582();
                    this.method2049(-95);
                    return;
                }
                this.field1416 = 0;
            }
            if (this.field1416 >= var7) {
                if (this.field1411 >= 0) {
                    this.method582();
                    this.method2049(-106);
                    return;
                }
                this.field1416 = var7 - 1;
            }
            if (this.field1412 < 0) {
                if (this.field1415) {
                    if (this.field1411 < 0) {
                        var9 = this.method581(arg0, arg1, var5, var10, var4.field4575[this.field1409]);
                        if (this.field1416 >= var5) {
                            return;
                        }
                        this.field1416 = var5 + var5 - 1 - this.field1416;
                        this.field1411 = -this.field1411;
                    }
                    while (true) {
                        int var11 = this.method569(arg0, var9, var6, var10, var4.field4575[this.field1410 - 1]);
                        if (this.field1416 < var6) {
                            return;
                        }
                        this.field1416 = var6 + var6 - 1 - this.field1416;
                        this.field1411 = -this.field1411;
                        var9 = this.method581(arg0, var11, var5, var10, var4.field4575[this.field1409]);
                        if (this.field1416 >= var5) {
                            return;
                        }
                        this.field1416 = var5 + var5 - 1 - this.field1416;
                        this.field1411 = -this.field1411;
                    }
                } else if (this.field1411 < 0) {
                    while (true) {
                        var9 = this.method581(arg0, var9, var5, var10, var4.field4575[this.field1410 - 1]);
                        if (this.field1416 >= var5) {
                            return;
                        }
                        this.field1416 = var6 - 1 - (var6 - 1 - this.field1416) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method569(arg0, var9, var6, var10, var4.field4575[this.field1409]);
                        if (this.field1416 < var6) {
                            return;
                        }
                        this.field1416 = (this.field1416 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1412 > 0) {
                    if (this.field1415) {
                        label130: {
                            if (this.field1411 < 0) {
                                var9 = this.method581(arg0, arg1, var5, var10, var4.field4575[this.field1409]);
                                if (this.field1416 >= var5) {
                                    return;
                                }
                                this.field1416 = var5 + var5 - 1 - this.field1416;
                                this.field1411 = -this.field1411;
                                if (--this.field1412 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method569(arg0, var9, var6, var10, var4.field4575[this.field1410 - 1]);
                                if (this.field1416 < var6) {
                                    return;
                                }
                                this.field1416 = var6 + var6 - 1 - this.field1416;
                                this.field1411 = -this.field1411;
                                if (--this.field1412 == 0) {
                                    break;
                                }
                                var9 = this.method581(arg0, var9, var5, var10, var4.field4575[this.field1409]);
                                if (this.field1416 >= var5) {
                                    return;
                                }
                                this.field1416 = var5 + var5 - 1 - this.field1416;
                                this.field1411 = -this.field1411;
                            } while (--this.field1412 != 0);
                        }
                    } else if (this.field1411 < 0) {
                        while (true) {
                            var9 = this.method581(arg0, var9, var5, var10, var4.field4575[this.field1410 - 1]);
                            if (this.field1416 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1416) / var8;
                            if (var12 >= this.field1412) {
                                this.field1416 += this.field1412 * var8;
                                this.field1412 = 0;
                                break;
                            }
                            this.field1416 += var8 * var12;
                            this.field1412 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method569(arg0, var9, var6, var10, var4.field4575[this.field1409]);
                            if (this.field1416 < var6) {
                                return;
                            }
                            int var13 = (this.field1416 - var5) / var8;
                            if (var13 >= this.field1412) {
                                this.field1416 -= this.field1412 * var8;
                                this.field1412 = 0;
                                break;
                            }
                            this.field1416 -= var8 * var13;
                            this.field1412 -= var13;
                        }
                    }
                }
                if (this.field1411 < 0) {
                    this.method581(arg0, var9, 0, var10, 0);
                    if (this.field1416 < 0) {
                        this.field1416 = -1;
                        this.method582();
                        this.method2049(-120);
                        return;
                    }
                } else {
                    this.method569(arg0, var9, var7, var10, 0);
                    if (this.field1416 >= var7) {
                        this.field1416 = var7;
                        this.method582();
                        this.method2049(-80);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II[B[IIIIIIIIIILct;II)I", line = 1010)
    private static final int method584(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class97 arg13, int arg14, int arg15) {
        arg13.field1419 -= arg13.field1423 * arg5;
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
        arg13.field1419 += arg13.field1423 * var22;
        arg13.field1421 = arg6;
        arg13.field1422 = arg7;
        arg13.field1416 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()Lhf;", line = 1051)
    public final class270 method585() {
        return null;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I[B[IIIIIIIILct;)I", line = 1056)
    private static final int method586(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10) {
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
        arg10.field1416 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)I", line = 1097)
    private static final int method587(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "(I)V", line = 1104)
    public final synchronized void method588(int arg0) {
        this.field1412 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "()I", line = 1107)
    public final synchronized int method589() {
        return this.field1414 == Integer.MIN_VALUE ? 0 : this.field1414;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(II)I", line = 1115)
    private static final int method590(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([B[IIIIIIIILct;)I", line = 1118)
    private static final int method591(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class97 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1421 += (var14 - arg3) * arg9.field1418;
        arg9.field1422 += (var14 - arg3) * arg9.field1413;
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
        arg9.field1419 = var12 >> 2;
        arg9.field1416 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "(I)V", line = 1153)
    public final synchronized void method592(int arg0) {
        this.method565(arg0 << 6, this.method570());
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([B[IIIIIIILct;)I", line = 1156)
    private static final int method593(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class97 arg8) {
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
        arg8.field1416 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[IIIIIIILct;II)I", line = 1181)
    private static final int method594(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10, int arg11, int arg12) {
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
        arg10.field1416 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "(I)V", line = 1208)
    public final synchronized void method595(int arg0) {
        if (arg0 == 0) {
            this.method560(0);
            this.method2049(-123);
        } else if (this.field1421 == 0 && this.field1422 == 0) {
            this.field1420 = 0;
            this.field1414 = 0;
            this.field1419 = 0;
            this.method2049(-93);
        } else {
            int var2 = -this.field1419;
            if (this.field1419 > var2) {
                var2 = this.field1419;
            }
            if (-this.field1421 > var2) {
                var2 = -this.field1421;
            }
            if (this.field1421 > var2) {
                var2 = this.field1421;
            }
            if (-this.field1422 > var2) {
                var2 = -this.field1422;
            }
            if (this.field1422 > var2) {
                var2 = this.field1422;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1420 = arg0;
            this.field1414 = Integer.MIN_VALUE;
            this.field1423 = -this.field1419 / arg0;
            this.field1418 = -this.field1421 / arg0;
            this.field1413 = -this.field1422 / arg0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lnq;II)Lct;", line = 1254)
    public static final class97 method596(class319 arg0, int arg1, int arg2) {
        return arg0.field4575 != null && arg0.field4575.length != 0 ? new class97(arg0, (int) ((long) arg0.field4574 * 256L * (long) arg1 / (long) (class366.field5600 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "()Z", line = 1261)
    private final boolean method597() {
        int var1 = this.field1414;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method590(var1, this.field1417);
            var2 = method587(var1, this.field1417);
        }
        if (this.field1419 == var1 && this.field1421 == var3 && this.field1422 == var2) {
            if (this.field1414 == Integer.MIN_VALUE) {
                this.field1414 = 0;
                this.field1419 = this.field1421 = this.field1422 = 0;
                this.method2049(-114);
                return true;
            } else {
                this.method580();
                return false;
            }
        } else {
            if (this.field1419 < var1) {
                this.field1423 = 1;
                this.field1420 = var1 - this.field1419;
            } else if (this.field1419 > var1) {
                this.field1423 = -1;
                this.field1420 = this.field1419 - var1;
            } else {
                this.field1423 = 0;
            }
            if (this.field1421 < var3) {
                this.field1418 = 1;
                if (this.field1420 == 0 || this.field1420 > var3 - this.field1421) {
                    this.field1420 = var3 - this.field1421;
                }
            } else if (this.field1421 > var3) {
                this.field1418 = -1;
                if (this.field1420 == 0 || this.field1420 > this.field1421 - var3) {
                    this.field1420 = this.field1421 - var3;
                }
            } else {
                this.field1418 = 0;
            }
            if (this.field1422 < var2) {
                this.field1413 = 1;
                if (this.field1420 == 0 || this.field1420 > var2 - this.field1422) {
                    this.field1420 = var2 - this.field1422;
                }
            } else if (this.field1422 > var2) {
                this.field1413 = -1;
                if (this.field1420 == 0 || this.field1420 > this.field1422 - var2) {
                    this.field1420 = this.field1422 - var2;
                }
            } else {
                this.field1413 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V", line = 1347)
    public final synchronized void method598(boolean arg0) {
        this.field1411 = (this.field1411 >>> 31) + (this.field1411 ^ this.field1411 >> 31);
        if (arg0) {
            this.field1411 = -this.field1411;
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(II[B[IIIIIIIILct;II)I", line = 1354)
    private static final int method599(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class97 arg11, int arg12, int arg13) {
        arg11.field1421 -= arg11.field1418 * arg5;
        arg11.field1422 -= arg11.field1413 * arg5;
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
        arg11.field1421 += arg11.field1418 * arg5;
        arg11.field1422 += arg11.field1413 * arg5;
        arg11.field1419 = arg6;
        arg11.field1416 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II[B[IIIIIIILct;II)I", line = 1387)
    private static final int method600(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class97 arg10, int arg11, int arg12) {
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
        arg10.field1416 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)V", line = 1413)
    public final synchronized void method601(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method565(arg1, arg2);
        } else {
            int var4 = method590(arg1, arg2);
            int var5 = method587(arg1, arg2);
            if (this.field1421 == var4 && this.field1422 == var5) {
                this.field1420 = 0;
            } else {
                int var6 = arg1 - this.field1419;
                if (this.field1419 - arg1 > var6) {
                    var6 = this.field1419 - arg1;
                }
                if (var4 - this.field1421 > var6) {
                    var6 = var4 - this.field1421;
                }
                if (this.field1421 - var4 > var6) {
                    var6 = this.field1421 - var4;
                }
                if (var5 - this.field1422 > var6) {
                    var6 = var5 - this.field1422;
                }
                if (this.field1422 - var5 > var6) {
                    var6 = this.field1422 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1420 = arg0;
                this.field1414 = arg1;
                this.field1417 = arg2;
                this.field1423 = (arg1 - this.field1419) / arg0;
                this.field1418 = (var4 - this.field1421) / arg0;
                this.field1413 = (var5 - this.field1422) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lnq;II)V", line = 1458)
    private class97(class319 arg0, int arg1, int arg2) {
        super.field3931 = arg0;
        this.field1409 = arg0.field4576;
        this.field1410 = arg0.field4573;
        this.field1415 = arg0.field4572;
        this.field1411 = arg1;
        this.field1414 = arg2;
        this.field1417 = 8192;
        this.field1416 = 0;
        this.method580();
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lnq;III)V", line = 1469)
    private class97(class319 arg0, int arg1, int arg2, int arg3) {
        super.field3931 = arg0;
        this.field1409 = arg0.field4576;
        this.field1410 = arg0.field4573;
        this.field1415 = arg0.field4572;
        this.field1411 = arg1;
        this.field1414 = arg2;
        this.field1417 = arg3;
        this.field1416 = 0;
        this.method580();
    }
}
