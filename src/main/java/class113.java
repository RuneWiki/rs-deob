import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class113 extends class162 {

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Z")
    private boolean field1464;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V", line = 3)
    public final synchronized void method799(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method834(arg1, arg2);
            return;
        }
        int var4 = method822(arg1, arg2);
        int var5 = method803(arg1, arg2);
        if (this.field1468 == var4 && this.field1461 == var5) {
            this.field1469 = 0;
            return;
        }
        int var6 = arg1 - this.field1459;
        if (this.field1459 - arg1 > var6) {
            var6 = this.field1459 - arg1;
        }
        if (var4 - this.field1468 > var6) {
            var6 = var4 - this.field1468;
        }
        if (this.field1468 - var4 > var6) {
            var6 = this.field1468 - var4;
        }
        if (var5 - this.field1461 > var6) {
            var6 = var5 - this.field1461;
        }
        if (this.field1461 - var5 > var6) {
            var6 = this.field1461 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1469 = arg0;
        this.field1465 = arg1;
        this.field1467 = arg2;
        this.field1460 = (arg1 - this.field1459) / arg0;
        this.field1466 = (var4 - this.field1468) / arg0;
        this.field1462 = (var5 - this.field1461) / arg0;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 49)
    public final synchronized void method800(int arg0) {
        if (this.field1458 < 0) {
            this.field1458 = -arg0;
        } else {
            this.field1458 = arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()I", line = 58)
    public final int method801() {
        int var1 = this.field1459 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1472 == 0) {
            var2 -= this.field1463 * var2 / (((class168) this.field2308).field2339.length << 8);
        } else if (this.field1472 >= 0) {
            var2 -= this.field1470 * var2 / ((class168) this.field2308).field2339.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "()V", line = 70)
    private final void method802() {
        if (this.field1469 == 0) {
            return;
        }
        if (this.field1465 == Integer.MIN_VALUE) {
            this.field1465 = 0;
        }
        this.field1469 = 0;
        this.method819();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I", line = 82)
    private static final int method803(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIILpc;II)I", line = 85)
    private static final int method804(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class113 arg11, int arg12, int arg13) {
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
        arg11.field1463 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIILpc;II)I", line = 118)
    private static final int method805(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class113 arg11, int arg12, int arg13) {
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
        arg11.field1463 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIIII)I", line = 152)
    private final int method806(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1469 > 0) {
                int var6 = this.field1469 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1469 += arg1;
                if (this.field1458 == -256 && (this.field1463 & 0xFF) == 0) {
                    if (class82.field1059) {
                        arg1 = method824(0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, this.field1466, this.field1462, 0, var6, arg2, this);
                    } else {
                        arg1 = method837(((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, this.field1460, 0, var6, arg2, this);
                    }
                } else if (class82.field1059) {
                    arg1 = method818(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, this.field1466, this.field1462, 0, var6, arg2, this, this.field1458, arg4);
                } else {
                    arg1 = method838(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, this.field1460, 0, var6, arg2, this, this.field1458, arg4);
                }
                this.field1469 -= arg1;
                if (this.field1469 != 0) {
                    return arg1;
                }
                if (!this.method815()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1458 == -256 && (this.field1463 & 0xFF) == 0) {
                if (class82.field1059) {
                    return method835(0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, 0, arg3, arg2, this);
                }
                return method828(((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, 0, arg3, arg2, this);
            }
            if (class82.field1059) {
                return method804(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, 0, arg3, arg2, this, this.field1458, arg4);
            }
            return method839(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, 0, arg3, arg2, this, this.field1458, arg4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 210)
    public final synchronized void method807(int arg0) {
        this.field1472 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 213)
    public final synchronized void method808(int arg0) {
        if (arg0 == 0) {
            this.method830(0);
            this.method179((byte) 51);
        } else if (this.field1468 == 0 && this.field1461 == 0) {
            this.field1469 = 0;
            this.field1465 = 0;
            this.field1459 = 0;
            this.method179((byte) 51);
        } else {
            int var2 = -this.field1459;
            if (this.field1459 > var2) {
                var2 = this.field1459;
            }
            if (-this.field1468 > var2) {
                var2 = -this.field1468;
            }
            if (this.field1468 > var2) {
                var2 = this.field1468;
            }
            if (-this.field1461 > var2) {
                var2 = -this.field1461;
            }
            if (this.field1461 > var2) {
                var2 = this.field1461;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1469 = arg0;
            this.field1465 = Integer.MIN_VALUE;
            this.field1460 = -this.field1459 / arg0;
            this.field1466 = -this.field1468 / arg0;
            this.field1462 = -this.field1461 / arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIILpc;)I", line = 258)
    private static final int method809(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class113 arg8) {
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
        arg8.field1463 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 283)
    public final synchronized void method282(int arg0) {
        if (this.field1469 > 0) {
            if (arg0 >= this.field1469) {
                if (this.field1465 == Integer.MIN_VALUE) {
                    this.field1465 = 0;
                    this.field1459 = this.field1468 = this.field1461 = 0;
                    this.method179((byte) 51);
                    arg0 = this.field1469;
                }
                this.field1469 = 0;
                this.method819();
            } else {
                this.field1459 += this.field1460 * arg0;
                this.field1468 += this.field1466 * arg0;
                this.field1461 += this.field1462 * arg0;
                this.field1469 -= arg0;
            }
        }
        class168 var2 = (class168) this.field2308;
        int var3 = this.field1470 << 8;
        int var4 = this.field1471 << 8;
        int var5 = var2.field2339.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1472 = 0;
        }
        if (this.field1463 < 0) {
            if (this.field1458 <= 0) {
                this.method802();
                this.method179((byte) 51);
                return;
            }
            this.field1463 = 0;
        }
        if (this.field1463 >= var5) {
            if (this.field1458 >= 0) {
                this.method802();
                this.method179((byte) 51);
                return;
            }
            this.field1463 = var5 - 1;
        }
        this.field1463 += this.field1458 * arg0;
        if (this.field1472 >= 0) {
            if (this.field1472 > 0) {
                if (this.field1464) {
                    label121: {
                        if (this.field1458 < 0) {
                            if (this.field1463 >= var3) {
                                return;
                            }
                            this.field1463 = var3 + var3 - this.field1463 - 1;
                            this.field1458 = -this.field1458;
                            if (--this.field1472 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1463 < var4) {
                                return;
                            }
                            this.field1463 = var4 + var4 - this.field1463 - 1;
                            this.field1458 = -this.field1458;
                            if (--this.field1472 == 0) {
                                break;
                            }
                            if (this.field1463 >= var3) {
                                return;
                            }
                            this.field1463 = var3 + var3 - this.field1463 - 1;
                            this.field1458 = -this.field1458;
                        } while (--this.field1472 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1458 < 0) {
                            if (this.field1463 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1463 - 1) / var6;
                            if (var7 >= this.field1472) {
                                this.field1463 += this.field1472 * var6;
                                this.field1472 = 0;
                                break label153;
                            }
                            this.field1463 += var6 * var7;
                            this.field1472 -= var7;
                        } else if (this.field1463 >= var4) {
                            int var8 = (this.field1463 - var3) / var6;
                            if (var8 >= this.field1472) {
                                this.field1463 -= this.field1472 * var6;
                                this.field1472 = 0;
                                break label153;
                            }
                            this.field1463 -= var6 * var8;
                            this.field1472 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1458 < 0) {
                if (this.field1463 < 0) {
                    this.field1463 = -1;
                    this.method802();
                    this.method179((byte) 51);
                }
            } else if (this.field1463 >= var5) {
                this.field1463 = var5;
                this.method802();
                this.method179((byte) 51);
            }
        } else if (this.field1464) {
            if (this.field1458 < 0) {
                if (this.field1463 >= var3) {
                    return;
                }
                this.field1463 = var3 + var3 - this.field1463 - 1;
                this.field1458 = -this.field1458;
            }
            while (this.field1463 >= var4) {
                this.field1463 = var4 + var4 - this.field1463 - 1;
                this.field1458 = -this.field1458;
                if (this.field1463 >= var3) {
                    return;
                }
                this.field1463 = var3 + var3 - this.field1463 - 1;
                this.field1458 = -this.field1458;
            }
        } else if (this.field1458 < 0) {
            if (this.field1463 >= var3) {
                return;
            }
            this.field1463 = var4 - (var4 - 1 - this.field1463) % var6 - 1;
        } else if (this.field1463 >= var4) {
            this.field1463 = (this.field1463 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIIIILpc;)I", line = 504)
    private static final int method810(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class113 arg12) {
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
        arg12.field1459 += (var19 - arg4) * arg12.field1460;
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
        arg12.field1468 = var15 >> 2;
        arg12.field1461 = var16 >> 2;
        arg12.field1463 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II[B[IIIIIIIILpc;II)I", line = 557)
    private static final int method811(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class113 arg11, int arg12, int arg13) {
        arg11.field1468 -= arg11.field1466 * arg5;
        arg11.field1461 -= arg11.field1462 * arg5;
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
        arg11.field1468 += arg11.field1466 * arg5;
        arg11.field1461 += arg11.field1462 * arg5;
        arg11.field1459 = arg6;
        arg11.field1463 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V", line = 590)
    public final synchronized void method812(boolean arg0) {
        this.field1458 = (this.field1458 >>> 31) + (this.field1458 ^ this.field1458 >> 31);
        if (arg0) {
            this.field1458 = -this.field1458;
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "()Z", line = 596)
    public final boolean method813() {
        return this.field1463 < 0 || this.field1463 >= ((class168) this.field2308).field2339.length << 8;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIIIIILpc;II)I", line = 599)
    private static final int method814(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class113 arg13, int arg14, int arg15) {
        arg13.field1459 -= arg13.field1460 * arg5;
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
        arg13.field1459 += arg13.field1460 * var27;
        arg13.field1468 = arg6;
        arg13.field1461 = arg7;
        arg13.field1463 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()Ltf;", line = 641)
    public final class162 method285() {
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "()Z", line = 646)
    private final boolean method815() {
        int var1 = this.field1465;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method822(var1, this.field1467);
            var2 = method803(var1, this.field1467);
        }
        if (this.field1459 != var1 || this.field1468 != var3 || this.field1461 != var2) {
            if (this.field1459 < var1) {
                this.field1460 = 1;
                this.field1469 = var1 - this.field1459;
            } else if (this.field1459 > var1) {
                this.field1460 = -1;
                this.field1469 = this.field1459 - var1;
            } else {
                this.field1460 = 0;
            }
            if (this.field1468 < var3) {
                this.field1466 = 1;
                if (this.field1469 == 0 || this.field1469 > var3 - this.field1468) {
                    this.field1469 = var3 - this.field1468;
                }
            } else if (this.field1468 > var3) {
                this.field1466 = -1;
                if (this.field1469 == 0 || this.field1469 > this.field1468 - var3) {
                    this.field1469 = this.field1468 - var3;
                }
            } else {
                this.field1466 = 0;
            }
            if (this.field1461 < var2) {
                this.field1462 = 1;
                if (this.field1469 == 0 || this.field1469 > var2 - this.field1461) {
                    this.field1469 = var2 - this.field1461;
                }
            } else if (this.field1461 > var2) {
                this.field1462 = -1;
                if (this.field1469 == 0 || this.field1469 > this.field1461 - var2) {
                    this.field1469 = this.field1461 - var2;
                }
            } else {
                this.field1462 = 0;
            }
            return false;
        } else if (this.field1465 == Integer.MIN_VALUE) {
            this.field1465 = 0;
            this.field1459 = this.field1468 = this.field1461 = 0;
            this.method179((byte) 51);
            return true;
        } else {
            this.method819();
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "()I", line = 732)
    public final synchronized int method816() {
        return this.field1458 < 0 ? -this.field1458 : this.field1458;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 736)
    public final synchronized void method817(int arg0) {
        int var2 = ((class168) this.field2308).field2339.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1463 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIIIIILpc;II)I", line = 747)
    private static final int method818(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class113 arg13, int arg14, int arg15) {
        arg13.field1459 -= arg13.field1460 * arg5;
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
        arg13.field1459 += arg13.field1460 * var26;
        arg13.field1468 = arg6;
        arg13.field1461 = arg7;
        arg13.field1463 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "()V", line = 792)
    private final void method819() {
        this.field1459 = this.field1465;
        this.field1468 = method822(this.field1465, this.field1467);
        this.field1461 = method803(this.field1465, this.field1467);
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "()Z", line = 798)
    public final boolean method820() {
        return this.field1469 != 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B[IIIIIIILpc;II)I", line = 801)
    private static final int method821(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class113 arg10, int arg11, int arg12) {
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
        arg10.field1463 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I", line = 827)
    private static final int method822(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B[IIIIIIIILpc;)I", line = 832)
    private static final int method823(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class113 arg10) {
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
        arg10.field1463 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIIIILpc;)I", line = 871)
    private static final int method824(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class113 arg12) {
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
        arg12.field1459 += (var19 - arg4) * arg12.field1460;
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
        arg12.field1468 = var15 >> 2;
        arg12.field1461 = var16 >> 2;
        arg12.field1463 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V", line = 924)
    public final synchronized void method825(int arg0) {
        this.method834(arg0 << 6, this.method836());
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[IIIIIIIILpc;)I", line = 928)
    private static final int method826(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class113 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1468 += (var14 - arg3) * arg9.field1466;
        arg9.field1461 += (var14 - arg3) * arg9.field1462;
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
        arg9.field1459 = var12 >> 2;
        arg9.field1463 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V", line = 962)
    public final synchronized void method827(int arg0, int arg1) {
        this.method799(arg0, arg1, this.method836());
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIILpc;)I", line = 966)
    private static final int method828(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class113 arg8) {
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
        arg8.field1463 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "()I", line = 992)
    public final synchronized int method829() {
        return this.field1465 == Integer.MIN_VALUE ? 0 : this.field1465;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V", line = 999)
    private final synchronized void method830(int arg0) {
        this.method834(arg0, this.method836());
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([IIIII)I", line = 1002)
    private final int method831(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1469 > 0) {
                int var6 = this.field1469 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1469 += arg1;
                if (this.field1458 == 256 && (this.field1463 & 0xFF) == 0) {
                    if (class82.field1059) {
                        arg1 = method810(0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, this.field1466, this.field1462, 0, var6, arg2, this);
                    } else {
                        arg1 = method826(((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, this.field1460, 0, var6, arg2, this);
                    }
                } else if (class82.field1059) {
                    arg1 = method814(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, this.field1466, this.field1462, 0, var6, arg2, this, this.field1458, arg4);
                } else {
                    arg1 = method811(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, this.field1460, 0, var6, arg2, this, this.field1458, arg4);
                }
                this.field1469 -= arg1;
                if (this.field1469 != 0) {
                    return arg1;
                }
                if (!this.method815()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1458 == 256 && (this.field1463 & 0xFF) == 0) {
                if (class82.field1059) {
                    return method823(0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, 0, arg3, arg2, this);
                }
                return method809(((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, 0, arg3, arg2, this);
            }
            if (class82.field1059) {
                return method805(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1468, this.field1461, 0, arg3, arg2, this, this.field1458, arg4);
            }
            return method821(0, 0, ((class168) this.field2308).field2339, arg0, this.field1463, arg1, this.field1459, 0, arg3, arg2, this, this.field1458, arg4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lpb;III)Lpc;", line = 1058)
    public static final class113 method832(class168 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2339 == null || arg0.field2339.length == 0 ? null : new class113(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lpb;II)Lpc;", line = 1064)
    public static final class113 method833(class168 arg0, int arg1, int arg2) {
        return arg0.field2339 == null || arg0.field2339.length == 0 ? null : new class113(arg0, (int) ((long) arg0.field2341 * 256L * (long) arg1 / (long) (class85.field1091 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V", line = 1070)
    private final synchronized void method834(int arg0, int arg1) {
        this.field1465 = arg0;
        this.field1467 = arg1;
        this.field1469 = 0;
        this.method819();
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I[B[IIIIIIIILpc;)I", line = 1077)
    private static final int method835(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class113 arg10) {
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
        arg10.field1463 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()Ltf;", line = 1115)
    public final class162 method284() {
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "()I", line = 1118)
    public final synchronized int method836() {
        return this.field1467 < 0 ? -1 : this.field1467;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([III)V", line = 1122)
    public final synchronized void method286(int[] arg0, int arg1, int arg2) {
        if (this.field1465 == 0 && this.field1469 == 0) {
            this.method282(arg2);
            return;
        }
        class168 var4 = (class168) this.field2308;
        int var5 = this.field1470 << 8;
        int var6 = this.field1471 << 8;
        int var7 = var4.field2339.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1472 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1463 < 0) {
            if (this.field1458 <= 0) {
                this.method802();
                this.method179((byte) 51);
                return;
            }
            this.field1463 = 0;
        }
        if (this.field1463 >= var7) {
            if (this.field1458 >= 0) {
                this.method802();
                this.method179((byte) 51);
                return;
            }
            this.field1463 = var7 - 1;
        }
        if (this.field1472 >= 0) {
            if (this.field1472 > 0) {
                if (this.field1464) {
                    label131: {
                        if (this.field1458 < 0) {
                            var9 = this.method806(arg0, arg1, var5, var10, var4.field2339[this.field1470]);
                            if (this.field1463 >= var5) {
                                return;
                            }
                            this.field1463 = var5 + var5 - this.field1463 - 1;
                            this.field1458 = -this.field1458;
                            if (--this.field1472 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method831(arg0, var9, var6, var10, var4.field2339[this.field1471 - 1]);
                            if (this.field1463 < var6) {
                                return;
                            }
                            this.field1463 = var6 + var6 - this.field1463 - 1;
                            this.field1458 = -this.field1458;
                            if (--this.field1472 == 0) {
                                break;
                            }
                            var9 = this.method806(arg0, var9, var5, var10, var4.field2339[this.field1470]);
                            if (this.field1463 >= var5) {
                                return;
                            }
                            this.field1463 = var5 + var5 - this.field1463 - 1;
                            this.field1458 = -this.field1458;
                        } while (--this.field1472 != 0);
                    }
                } else if (this.field1458 < 0) {
                    while (true) {
                        var9 = this.method806(arg0, var9, var5, var10, var4.field2339[this.field1471 - 1]);
                        if (this.field1463 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1463 - 1) / var8;
                        if (var12 >= this.field1472) {
                            this.field1463 += this.field1472 * var8;
                            this.field1472 = 0;
                            break;
                        }
                        this.field1463 += var8 * var12;
                        this.field1472 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method831(arg0, var9, var6, var10, var4.field2339[this.field1470]);
                        if (this.field1463 < var6) {
                            return;
                        }
                        int var13 = (this.field1463 - var5) / var8;
                        if (var13 >= this.field1472) {
                            this.field1463 -= this.field1472 * var8;
                            this.field1472 = 0;
                            break;
                        }
                        this.field1463 -= var8 * var13;
                        this.field1472 -= var13;
                    }
                }
            }
            if (this.field1458 < 0) {
                this.method806(arg0, var9, 0, var10, 0);
                if (this.field1463 < 0) {
                    this.field1463 = -1;
                    this.method802();
                    this.method179((byte) 51);
                }
            } else {
                this.method831(arg0, var9, var7, var10, 0);
                if (this.field1463 >= var7) {
                    this.field1463 = var7;
                    this.method802();
                    this.method179((byte) 51);
                }
            }
        } else if (this.field1464) {
            if (this.field1458 < 0) {
                var9 = this.method806(arg0, arg1, var5, var10, var4.field2339[this.field1470]);
                if (this.field1463 >= var5) {
                    return;
                }
                this.field1463 = var5 + var5 - this.field1463 - 1;
                this.field1458 = -this.field1458;
            }
            while (true) {
                int var11 = this.method831(arg0, var9, var6, var10, var4.field2339[this.field1471 - 1]);
                if (this.field1463 < var6) {
                    return;
                }
                this.field1463 = var6 + var6 - this.field1463 - 1;
                this.field1458 = -this.field1458;
                var9 = this.method806(arg0, var11, var5, var10, var4.field2339[this.field1470]);
                if (this.field1463 >= var5) {
                    return;
                }
                this.field1463 = var5 + var5 - this.field1463 - 1;
                this.field1458 = -this.field1458;
            }
        } else if (this.field1458 < 0) {
            while (true) {
                var9 = this.method806(arg0, var9, var5, var10, var4.field2339[this.field1471 - 1]);
                if (this.field1463 >= var5) {
                    return;
                }
                this.field1463 = var6 - (var6 - 1 - this.field1463) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method831(arg0, var9, var6, var10, var4.field2339[this.field1470]);
                if (this.field1463 < var6) {
                    return;
                }
                this.field1463 = (this.field1463 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()I", line = 1357)
    public final int method289() {
        return this.field1465 == 0 && this.field1469 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lpb;II)V", line = 1363)
    private class113(class168 arg0, int arg1, int arg2) {
        this.field2308 = arg0;
        this.field1470 = arg0.field2340;
        this.field1471 = arg0.field2343;
        this.field1464 = arg0.field2342;
        this.field1458 = arg1;
        this.field1465 = arg2;
        this.field1467 = 8192;
        this.field1463 = 0;
        this.method819();
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([B[IIIIIIIILpc;)I", line = 1375)
    private static final int method837(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class113 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1468 += (var14 - arg3) * arg9.field1466;
        arg9.field1461 += (var14 - arg3) * arg9.field1462;
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
        arg9.field1459 = var12 >> 2;
        arg9.field1463 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II[B[IIIIIIIILpc;II)I", line = 1409)
    private static final int method838(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class113 arg11, int arg12, int arg13) {
        arg11.field1468 -= arg11.field1466 * arg5;
        arg11.field1461 -= arg11.field1462 * arg5;
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
        arg11.field1468 += arg11.field1466 * arg5;
        arg11.field1461 += arg11.field1462 * arg5;
        arg11.field1459 = arg6;
        arg11.field1463 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II[B[IIIIIIILpc;II)I", line = 1442)
    private static final int method839(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class113 arg10, int arg11, int arg12) {
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
        arg10.field1463 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lpb;III)V", line = 1467)
    private class113(class168 arg0, int arg1, int arg2, int arg3) {
        this.field2308 = arg0;
        this.field1470 = arg0.field2340;
        this.field1471 = arg0.field2343;
        this.field1464 = arg0.field2342;
        this.field1458 = arg1;
        this.field1465 = arg2;
        this.field1467 = arg3;
        this.field1463 = 0;
        this.method819();
    }
}
