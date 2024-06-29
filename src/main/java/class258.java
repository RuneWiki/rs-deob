import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class258 extends class221 {

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Z")
    private boolean field4535;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    private int field4532;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    private int field4528;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    private int field4529;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field4531;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field4534;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public final synchronized void method1727(int arg0) {
        this.field4528 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B[IIIIIIIILrb;)I")
    private static final int method1728(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class258 arg10) {
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
        arg10.field4532 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B[IIIIIIIIIILrb;)I")
    private static final int method1729(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class258 arg12) {
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
        arg12.field4531 += (var19 - arg4) * arg12.field4530;
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
        arg12.field4529 = var15 >> 2;
        arg12.field4536 = var16 >> 2;
        arg12.field4532 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[IIIIIIILrb;II)I")
    private static final int method1730(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class258 arg10, int arg11, int arg12) {
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
        arg10.field4532 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()Z")
    private final boolean method1731() {
        int var1 = this.field4525;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1762(var1, this.field4522);
            var2 = method1732(var1, this.field4522);
        }
        if (this.field4531 == var1 && this.field4529 == var3 && this.field4536 == var2) {
            if (this.field4525 == Integer.MIN_VALUE) {
                this.field4525 = 0;
                this.field4531 = this.field4529 = this.field4536 = 0;
                this.method560(-17554);
                return true;
            } else {
                this.method1736();
                return false;
            }
        } else {
            if (this.field4531 < var1) {
                this.field4530 = 1;
                this.field4533 = var1 - this.field4531;
            } else if (this.field4531 > var1) {
                this.field4530 = -1;
                this.field4533 = this.field4531 - var1;
            } else {
                this.field4530 = 0;
            }
            if (this.field4529 < var3) {
                this.field4534 = 1;
                if (this.field4533 == 0 || this.field4533 > var3 - this.field4529) {
                    this.field4533 = var3 - this.field4529;
                }
            } else if (this.field4529 > var3) {
                this.field4534 = -1;
                if (this.field4533 == 0 || this.field4533 > this.field4529 - var3) {
                    this.field4533 = this.field4529 - var3;
                }
            } else {
                this.field4534 = 0;
            }
            if (this.field4536 < var2) {
                this.field4523 = 1;
                if (this.field4533 == 0 || this.field4533 > var2 - this.field4536) {
                    this.field4533 = var2 - this.field4536;
                }
            } else if (this.field4536 > var2) {
                this.field4523 = -1;
                if (this.field4533 == 0 || this.field4533 > this.field4536 - var2) {
                    this.field4533 = this.field4536 - var2;
                }
            } else {
                this.field4523 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
    private static final int method1732(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "()Z")
    public final boolean method1733() {
        return this.field4533 != 0;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public final synchronized void method1734(int arg0) {
        this.method1752(arg0 << 6, this.method1739());
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)V")
    public final synchronized void method1735(int arg0, int arg1) {
        this.method1744(arg0, arg1, this.method1739());
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "()V")
    private final void method1736() {
        this.field4531 = this.field4525;
        this.field4529 = method1762(this.field4525, this.field4522);
        this.field4536 = method1732(this.field4525, this.field4522);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()I")
    public final int method1412() {
        int var1 = this.field4531 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4528 == 0) {
            var2 -= this.field4532 * var2 / (((class177) super.field3777).field3109.length << 8);
        } else if (this.field4528 >= 0) {
            var2 -= this.field4526 * var2 / ((class177) super.field3777).field3109.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([IIIII)I")
    private final int method1737(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4533 <= 0) {
                if (this.field4527 == 256 && (this.field4532 & 255) == 0) {
                    if (class162.field2909) {
                        return method1745(0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, 0, arg3, arg2, this);
                    }
                    return method1758(((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, 0, arg3, arg2, this);
                }
                if (class162.field2909) {
                    return method1740(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, 0, arg3, arg2, this, this.field4527, arg4);
                }
                return method1738(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, 0, arg3, arg2, this, this.field4527, arg4);
            }
            int var6 = this.field4533 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4533 += arg1;
            if (this.field4527 == 256 && (this.field4532 & 255) == 0) {
                if (class162.field2909) {
                    arg1 = method1756(0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, this.field4534, this.field4523, 0, var6, arg2, this);
                } else {
                    arg1 = method1757(((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, this.field4530, 0, var6, arg2, this);
                }
            } else if (class162.field2909) {
                arg1 = method1755(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, this.field4534, this.field4523, 0, var6, arg2, this, this.field4527, arg4);
            } else {
                arg1 = method1748(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, this.field4530, 0, var6, arg2, this, this.field4527, arg4);
            }
            this.field4533 -= arg1;
            if (this.field4533 != 0) {
                return arg1;
            }
        } while (!this.method1731());
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[B[IIIIIIILrb;II)I")
    private static final int method1738(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class258 arg10, int arg11, int arg12) {
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
        arg10.field4532 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "()I")
    public final synchronized int method1739() {
        return this.field4522 < 0 ? -1 : this.field4522;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public final synchronized void method302(int arg0) {
        if (this.field4533 > 0) {
            if (arg0 >= this.field4533) {
                if (this.field4525 == Integer.MIN_VALUE) {
                    this.field4525 = 0;
                    this.field4531 = this.field4529 = this.field4536 = 0;
                    this.method560(-17554);
                    arg0 = this.field4533;
                }
                this.field4533 = 0;
                this.method1736();
            } else {
                this.field4531 += this.field4530 * arg0;
                this.field4529 += this.field4534 * arg0;
                this.field4536 += this.field4523 * arg0;
                this.field4533 -= arg0;
            }
        }
        class177 var2 = (class177) super.field3777;
        int var3 = this.field4526 << 8;
        int var4 = this.field4524 << 8;
        int var5 = var2.field3109.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4528 = 0;
        }
        if (this.field4532 < 0) {
            if (this.field4527 <= 0) {
                this.method1765();
                this.method560(-17554);
                return;
            }
            this.field4532 = 0;
        }
        if (this.field4532 >= var5) {
            if (this.field4527 >= 0) {
                this.method1765();
                this.method560(-17554);
                return;
            }
            this.field4532 = var5 - 1;
        }
        this.field4532 += this.field4527 * arg0;
        if (this.field4528 < 0) {
            if (!this.field4535) {
                if (this.field4527 < 0) {
                    if (this.field4532 < var3) {
                        this.field4532 = var4 - 1 - (var4 - 1 - this.field4532) % var6;
                    }
                } else if (this.field4532 >= var4) {
                    this.field4532 = (this.field4532 - var3) % var6 + var3;
                }
            } else {
                if (this.field4527 < 0) {
                    if (this.field4532 >= var3) {
                        return;
                    }
                    this.field4532 = var3 + var3 - 1 - this.field4532;
                    this.field4527 = -this.field4527;
                }
                while (this.field4532 >= var4) {
                    this.field4532 = var4 + var4 - 1 - this.field4532;
                    this.field4527 = -this.field4527;
                    if (this.field4532 >= var3) {
                        return;
                    }
                    this.field4532 = var3 + var3 - 1 - this.field4532;
                    this.field4527 = -this.field4527;
                }
            }
        } else {
            if (this.field4528 > 0) {
                if (this.field4535) {
                    label125: {
                        if (this.field4527 < 0) {
                            if (this.field4532 >= var3) {
                                return;
                            }
                            this.field4532 = var3 + var3 - 1 - this.field4532;
                            this.field4527 = -this.field4527;
                            if (--this.field4528 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4532 < var4) {
                                return;
                            }
                            this.field4532 = var4 + var4 - 1 - this.field4532;
                            this.field4527 = -this.field4527;
                            if (--this.field4528 == 0) {
                                break;
                            }
                            if (this.field4532 >= var3) {
                                return;
                            }
                            this.field4532 = var3 + var3 - 1 - this.field4532;
                            this.field4527 = -this.field4527;
                        } while (--this.field4528 != 0);
                    }
                } else if (this.field4527 < 0) {
                    if (this.field4532 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4532) / var6;
                    if (var7 < this.field4528) {
                        this.field4532 += var6 * var7;
                        this.field4528 -= var7;
                        return;
                    }
                    this.field4532 += this.field4528 * var6;
                    this.field4528 = 0;
                } else {
                    if (this.field4532 < var4) {
                        return;
                    }
                    int var8 = (this.field4532 - var3) / var6;
                    if (var8 < this.field4528) {
                        this.field4532 -= var6 * var8;
                        this.field4528 -= var8;
                        return;
                    }
                    this.field4532 -= this.field4528 * var6;
                    this.field4528 = 0;
                }
            }
            if (this.field4527 < 0) {
                if (this.field4532 < 0) {
                    this.field4532 = -1;
                    this.method1765();
                    this.method560(-17554);
                    return;
                }
            } else if (this.field4532 >= var5) {
                this.field4532 = var5;
                this.method1765();
                this.method560(-17554);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1740(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class258 arg11, int arg12, int arg13) {
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
        arg11.field4532 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1741(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class258 arg11, int arg12, int arg13) {
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
        arg11.field4532 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()Lwd;")
    public final class221 method308() {
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lk;III)Lrb;")
    public static final class258 method1742(class177 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3109 != null && arg0.field3109.length != 0 ? new class258(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public final synchronized void method1743(int arg0) {
        if (arg0 == 0) {
            this.method1753(0);
            this.method560(-17554);
        } else if (this.field4529 == 0 && this.field4536 == 0) {
            this.field4533 = 0;
            this.field4525 = 0;
            this.field4531 = 0;
            this.method560(-17554);
        } else {
            int var2 = -this.field4531;
            if (this.field4531 > var2) {
                var2 = this.field4531;
            }
            if (-this.field4529 > var2) {
                var2 = -this.field4529;
            }
            if (this.field4529 > var2) {
                var2 = this.field4529;
            }
            if (-this.field4536 > var2) {
                var2 = -this.field4536;
            }
            if (this.field4536 > var2) {
                var2 = this.field4536;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4533 = arg0;
            this.field4525 = Integer.MIN_VALUE;
            this.field4530 = -this.field4531 / arg0;
            this.field4534 = -this.field4529 / arg0;
            this.field4523 = -this.field4536 / arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    public final synchronized void method1744(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1752(arg1, arg2);
        } else {
            int var4 = method1762(arg1, arg2);
            int var5 = method1732(arg1, arg2);
            if (this.field4529 == var4 && this.field4536 == var5) {
                this.field4533 = 0;
            } else {
                int var6 = arg1 - this.field4531;
                if (this.field4531 - arg1 > var6) {
                    var6 = this.field4531 - arg1;
                }
                if (var4 - this.field4529 > var6) {
                    var6 = var4 - this.field4529;
                }
                if (this.field4529 - var4 > var6) {
                    var6 = this.field4529 - var4;
                }
                if (var5 - this.field4536 > var6) {
                    var6 = var5 - this.field4536;
                }
                if (this.field4536 - var5 > var6) {
                    var6 = this.field4536 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4533 = arg0;
                this.field4525 = arg1;
                this.field4522 = arg2;
                this.field4530 = (arg1 - this.field4531) / arg0;
                this.field4534 = (var4 - this.field4529) / arg0;
                this.field4523 = (var5 - this.field4536) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I[B[IIIIIIIILrb;)I")
    private static final int method1745(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class258 arg10) {
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
        arg10.field4532 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
    public final int method285() {
        return this.field4525 == 0 && this.field4533 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "()I")
    public final synchronized int method1746() {
        return this.field4525 == Integer.MIN_VALUE ? 0 : this.field4525;
    }

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
    public final synchronized void method1747(int arg0) {
        int var2 = ((class177) super.field3777).field3109.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4532 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1748(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class258 arg11, int arg12, int arg13) {
        arg11.field4529 -= arg11.field4534 * arg5;
        arg11.field4536 -= arg11.field4523 * arg5;
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
        arg11.field4529 += arg11.field4534 * arg5;
        arg11.field4536 += arg11.field4523 * arg5;
        arg11.field4531 = arg6;
        arg11.field4532 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        if (this.field4525 == 0 && this.field4533 == 0) {
            this.method302(arg2);
        } else {
            class177 var4 = (class177) super.field3777;
            int var5 = this.field4526 << 8;
            int var6 = this.field4524 << 8;
            int var7 = var4.field3109.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4528 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4532 < 0) {
                if (this.field4527 <= 0) {
                    this.method1765();
                    this.method560(-17554);
                    return;
                }
                this.field4532 = 0;
            }
            if (this.field4532 >= var7) {
                if (this.field4527 >= 0) {
                    this.method1765();
                    this.method560(-17554);
                    return;
                }
                this.field4532 = var7 - 1;
            }
            if (this.field4528 < 0) {
                if (this.field4535) {
                    if (this.field4527 < 0) {
                        var9 = this.method1764(arg0, arg1, var5, var10, var4.field3109[this.field4526]);
                        if (this.field4532 >= var5) {
                            return;
                        }
                        this.field4532 = var5 + var5 - 1 - this.field4532;
                        this.field4527 = -this.field4527;
                    }
                    while (true) {
                        int var11 = this.method1737(arg0, var9, var6, var10, var4.field3109[this.field4524 - 1]);
                        if (this.field4532 < var6) {
                            return;
                        }
                        this.field4532 = var6 + var6 - 1 - this.field4532;
                        this.field4527 = -this.field4527;
                        var9 = this.method1764(arg0, var11, var5, var10, var4.field3109[this.field4526]);
                        if (this.field4532 >= var5) {
                            return;
                        }
                        this.field4532 = var5 + var5 - 1 - this.field4532;
                        this.field4527 = -this.field4527;
                    }
                } else if (this.field4527 < 0) {
                    while (true) {
                        var9 = this.method1764(arg0, var9, var5, var10, var4.field3109[this.field4524 - 1]);
                        if (this.field4532 >= var5) {
                            return;
                        }
                        this.field4532 = var6 - 1 - (var6 - 1 - this.field4532) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1737(arg0, var9, var6, var10, var4.field3109[this.field4526]);
                        if (this.field4532 < var6) {
                            return;
                        }
                        this.field4532 = (this.field4532 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4528 > 0) {
                    if (this.field4535) {
                        label130: {
                            if (this.field4527 < 0) {
                                var9 = this.method1764(arg0, arg1, var5, var10, var4.field3109[this.field4526]);
                                if (this.field4532 >= var5) {
                                    return;
                                }
                                this.field4532 = var5 + var5 - 1 - this.field4532;
                                this.field4527 = -this.field4527;
                                if (--this.field4528 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1737(arg0, var9, var6, var10, var4.field3109[this.field4524 - 1]);
                                if (this.field4532 < var6) {
                                    return;
                                }
                                this.field4532 = var6 + var6 - 1 - this.field4532;
                                this.field4527 = -this.field4527;
                                if (--this.field4528 == 0) {
                                    break;
                                }
                                var9 = this.method1764(arg0, var9, var5, var10, var4.field3109[this.field4526]);
                                if (this.field4532 >= var5) {
                                    return;
                                }
                                this.field4532 = var5 + var5 - 1 - this.field4532;
                                this.field4527 = -this.field4527;
                            } while (--this.field4528 != 0);
                        }
                    } else if (this.field4527 < 0) {
                        while (true) {
                            var9 = this.method1764(arg0, var9, var5, var10, var4.field3109[this.field4524 - 1]);
                            if (this.field4532 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4532) / var8;
                            if (var12 >= this.field4528) {
                                this.field4532 += this.field4528 * var8;
                                this.field4528 = 0;
                                break;
                            }
                            this.field4532 += var8 * var12;
                            this.field4528 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1737(arg0, var9, var6, var10, var4.field3109[this.field4526]);
                            if (this.field4532 < var6) {
                                return;
                            }
                            int var13 = (this.field4532 - var5) / var8;
                            if (var13 >= this.field4528) {
                                this.field4532 -= this.field4528 * var8;
                                this.field4528 = 0;
                                break;
                            }
                            this.field4532 -= var8 * var13;
                            this.field4528 -= var13;
                        }
                    }
                }
                if (this.field4527 < 0) {
                    this.method1764(arg0, var9, 0, var10, 0);
                    if (this.field4532 < 0) {
                        this.field4532 = -1;
                        this.method1765();
                        this.method560(-17554);
                        return;
                    }
                } else {
                    this.method1737(arg0, var9, var7, var10, 0);
                    if (this.field4532 >= var7) {
                        this.field4532 = var7;
                        this.method1765();
                        this.method560(-17554);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "()I")
    public final synchronized int method1749() {
        return this.field4527 < 0 ? -this.field4527 : this.field4527;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lwd;")
    public final class221 method278() {
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "()Z")
    public final boolean method1750() {
        return this.field4532 < 0 || this.field4532 >= ((class177) super.field3777).field3109.length << 8;
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)V")
    public final synchronized void method1751(int arg0) {
        if (this.field4527 < 0) {
            this.field4527 = -arg0;
        } else {
            this.field4527 = arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)V")
    private final synchronized void method1752(int arg0, int arg1) {
        this.field4525 = arg0;
        this.field4522 = arg1;
        this.field4533 = 0;
        this.method1736();
    }

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "(I)V")
    private final synchronized void method1753(int arg0) {
        this.method1752(arg0, this.method1739());
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lk;II)Lrb;")
    public static final class258 method1754(class177 arg0, int arg1, int arg2) {
        return arg0.field3109 != null && arg0.field3109.length != 0 ? new class258(arg0, (int) ((long) arg0.field3111 * 256L * (long) arg1 / (long) (class200.field3446 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[B[IIIIIIIIIILrb;II)I")
    private static final int method1755(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class258 arg13, int arg14, int arg15) {
        arg13.field4531 -= arg13.field4530 * arg5;
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
        arg13.field4531 += arg13.field4530 * var22;
        arg13.field4529 = arg6;
        arg13.field4536 = arg7;
        arg13.field4532 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I[B[IIIIIIIIIILrb;)I")
    private static final int method1756(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class258 arg12) {
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
        arg12.field4531 += (var19 - arg4) * arg12.field4530;
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
        arg12.field4529 = var15 >> 2;
        arg12.field4536 = var16 >> 2;
        arg12.field4532 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B[IIIIIIIILrb;)I")
    private static final int method1757(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class258 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4529 += (var14 - arg3) * arg9.field4534;
        arg9.field4536 += (var14 - arg3) * arg9.field4523;
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
        arg9.field4531 = var12 >> 2;
        arg9.field4532 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B[IIIIIIILrb;)I")
    private static final int method1758(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class258 arg8) {
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
        arg8.field4532 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lk;II)V")
    private class258(class177 arg0, int arg1, int arg2) {
        super.field3777 = arg0;
        this.field4526 = arg0.field3107;
        this.field4524 = arg0.field3108;
        this.field4535 = arg0.field3110;
        this.field4527 = arg1;
        this.field4525 = arg2;
        this.field4522 = 8192;
        this.field4532 = 0;
        this.method1736();
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II[B[IIIIIIIILrb;II)I")
    private static final int method1759(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class258 arg11, int arg12, int arg13) {
        arg11.field4529 -= arg11.field4534 * arg5;
        arg11.field4536 -= arg11.field4523 * arg5;
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
        arg11.field4529 += arg11.field4534 * arg5;
        arg11.field4536 += arg11.field4523 * arg5;
        arg11.field4531 = arg6;
        arg11.field4532 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final synchronized void method1760(boolean arg0) {
        this.field4527 = (this.field4527 >>> 31) + (this.field4527 ^ this.field4527 >> 31);
        if (arg0) {
            this.field4527 = -this.field4527;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B[IIIIIIILrb;)I")
    private static final int method1761(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class258 arg8) {
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
        arg8.field4532 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(II)I")
    private static final int method1762(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B[IIIIIIIILrb;)I")
    private static final int method1763(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class258 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4529 += (var14 - arg3) * arg9.field4534;
        arg9.field4536 += (var14 - arg3) * arg9.field4523;
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
        arg9.field4531 = var12 >> 2;
        arg9.field4532 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lk;III)V")
    private class258(class177 arg0, int arg1, int arg2, int arg3) {
        super.field3777 = arg0;
        this.field4526 = arg0.field3107;
        this.field4524 = arg0.field3108;
        this.field4535 = arg0.field3110;
        this.field4527 = arg1;
        this.field4525 = arg2;
        this.field4522 = arg3;
        this.field4532 = 0;
        this.method1736();
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([IIIII)I")
    private final int method1764(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4533 <= 0) {
                if (this.field4527 == -256 && (this.field4532 & 255) == 0) {
                    if (class162.field2909) {
                        return method1728(0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, 0, arg3, arg2, this);
                    }
                    return method1761(((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, 0, arg3, arg2, this);
                }
                if (class162.field2909) {
                    return method1741(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, 0, arg3, arg2, this, this.field4527, arg4);
                }
                return method1730(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, 0, arg3, arg2, this, this.field4527, arg4);
            }
            int var6 = this.field4533 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4533 += arg1;
            if (this.field4527 == -256 && (this.field4532 & 255) == 0) {
                if (class162.field2909) {
                    arg1 = method1729(0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, this.field4534, this.field4523, 0, var6, arg2, this);
                } else {
                    arg1 = method1763(((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, this.field4530, 0, var6, arg2, this);
                }
            } else if (class162.field2909) {
                arg1 = method1766(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4529, this.field4536, this.field4534, this.field4523, 0, var6, arg2, this, this.field4527, arg4);
            } else {
                arg1 = method1759(0, 0, ((class177) super.field3777).field3109, arg0, this.field4532, arg1, this.field4531, this.field4530, 0, var6, arg2, this, this.field4527, arg4);
            }
            this.field4533 -= arg1;
            if (this.field4533 != 0) {
                return arg1;
            }
        } while (!this.method1731());
        return arg3;
    }

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "()V")
    private final void method1765() {
        if (this.field4533 != 0) {
            if (this.field4525 == Integer.MIN_VALUE) {
                this.field4525 = 0;
            }
            this.field4533 = 0;
            this.method1736();
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[B[IIIIIIIIIILrb;II)I")
    private static final int method1766(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class258 arg13, int arg14, int arg15) {
        arg13.field4531 -= arg13.field4530 * arg5;
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
        arg13.field4531 += arg13.field4530 * var22;
        arg13.field4529 = arg6;
        arg13.field4536 = arg7;
        arg13.field4532 = arg4;
        return var22;
    }
}
