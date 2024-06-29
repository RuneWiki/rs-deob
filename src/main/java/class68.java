import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 extends class4 {

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "Z")
    private boolean field1535;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([III)V")
    public final synchronized void method17(int[] arg0, int arg1, int arg2) {
        if (this.field1523 == 0 && this.field1522 == 0) {
            this.method21(arg2);
        } else {
            class123 var4 = (class123) super.field60;
            int var5 = this.field1534 << 8;
            int var6 = this.field1529 << 8;
            int var7 = var4.field2696.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1528 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1530 < 0) {
                if (this.field1532 <= 0) {
                    this.method465();
                    this.method959(11835);
                    return;
                }
                this.field1530 = 0;
            }
            if (this.field1530 >= var7) {
                if (this.field1532 >= 0) {
                    this.method465();
                    this.method959(11835);
                    return;
                }
                this.field1530 = var7 - 1;
            }
            if (this.field1528 < 0) {
                if (this.field1535) {
                    if (this.field1532 < 0) {
                        var9 = this.method479(arg0, arg1, var5, var10, var4.field2696[this.field1534]);
                        if (this.field1530 >= var5) {
                            return;
                        }
                        this.field1530 = var5 + var5 - 1 - this.field1530;
                        this.field1532 = -this.field1532;
                    }
                    while (true) {
                        int var11 = this.method457(arg0, var9, var6, var10, var4.field2696[this.field1529 - 1]);
                        if (this.field1530 < var6) {
                            return;
                        }
                        this.field1530 = var6 + var6 - 1 - this.field1530;
                        this.field1532 = -this.field1532;
                        var9 = this.method479(arg0, var11, var5, var10, var4.field2696[this.field1534]);
                        if (this.field1530 >= var5) {
                            return;
                        }
                        this.field1530 = var5 + var5 - 1 - this.field1530;
                        this.field1532 = -this.field1532;
                    }
                } else if (this.field1532 < 0) {
                    while (true) {
                        var9 = this.method479(arg0, var9, var5, var10, var4.field2696[this.field1529 - 1]);
                        if (this.field1530 >= var5) {
                            return;
                        }
                        this.field1530 = var6 - 1 - (var6 - 1 - this.field1530) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method457(arg0, var9, var6, var10, var4.field2696[this.field1534]);
                        if (this.field1530 < var6) {
                            return;
                        }
                        this.field1530 = (this.field1530 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1528 > 0) {
                    if (this.field1535) {
                        label130: {
                            if (this.field1532 < 0) {
                                var9 = this.method479(arg0, arg1, var5, var10, var4.field2696[this.field1534]);
                                if (this.field1530 >= var5) {
                                    return;
                                }
                                this.field1530 = var5 + var5 - 1 - this.field1530;
                                this.field1532 = -this.field1532;
                                if (--this.field1528 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method457(arg0, var9, var6, var10, var4.field2696[this.field1529 - 1]);
                                if (this.field1530 < var6) {
                                    return;
                                }
                                this.field1530 = var6 + var6 - 1 - this.field1530;
                                this.field1532 = -this.field1532;
                                if (--this.field1528 == 0) {
                                    break;
                                }
                                var9 = this.method479(arg0, var9, var5, var10, var4.field2696[this.field1534]);
                                if (this.field1530 >= var5) {
                                    return;
                                }
                                this.field1530 = var5 + var5 - 1 - this.field1530;
                                this.field1532 = -this.field1532;
                            } while (--this.field1528 != 0);
                        }
                    } else if (this.field1532 < 0) {
                        while (true) {
                            var9 = this.method479(arg0, var9, var5, var10, var4.field2696[this.field1529 - 1]);
                            if (this.field1530 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1530) / var8;
                            if (var12 >= this.field1528) {
                                this.field1530 += this.field1528 * var8;
                                this.field1528 = 0;
                                break;
                            }
                            this.field1530 += var8 * var12;
                            this.field1528 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method457(arg0, var9, var6, var10, var4.field2696[this.field1534]);
                            if (this.field1530 < var6) {
                                return;
                            }
                            int var13 = (this.field1530 - var5) / var8;
                            if (var13 >= this.field1528) {
                                this.field1530 -= this.field1528 * var8;
                                this.field1528 = 0;
                                break;
                            }
                            this.field1530 -= var8 * var13;
                            this.field1528 -= var13;
                        }
                    }
                }
                if (this.field1532 < 0) {
                    this.method479(arg0, var9, 0, var10, 0);
                    if (this.field1530 < 0) {
                        this.field1530 = -1;
                        this.method465();
                        this.method959(11835);
                        return;
                    }
                } else {
                    this.method457(arg0, var9, var7, var10, 0);
                    if (this.field1530 >= var7) {
                        this.field1530 = var7;
                        this.method465();
                        this.method959(11835);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public final synchronized void method455(int arg0) {
        this.field1528 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()Z")
    public final boolean method456() {
        return this.field1530 < 0 || this.field1530 >= ((class123) super.field60).field2696.length << 8;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()I")
    public final int method20() {
        return this.field1523 == 0 && this.field1522 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIII)I")
    private final int method457(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1522 <= 0) {
                if (this.field1532 == 256 && (this.field1530 & 255) == 0) {
                    if (class7.field105) {
                        return method461(0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, 0, arg3, arg2, this);
                    }
                    return method466(((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, 0, arg3, arg2, this);
                }
                if (class7.field105) {
                    return method474(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, 0, arg3, arg2, this, this.field1532, arg4);
                }
                return method490(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, 0, arg3, arg2, this, this.field1532, arg4);
            }
            int var6 = this.field1522 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1522 += arg1;
            if (this.field1532 == 256 && (this.field1530 & 255) == 0) {
                if (class7.field105) {
                    arg1 = method472(0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, this.field1531, this.field1533, 0, var6, arg2, this);
                } else {
                    arg1 = method469(((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, this.field1526, 0, var6, arg2, this);
                }
            } else if (class7.field105) {
                arg1 = method478(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, this.field1531, this.field1533, 0, var6, arg2, this, this.field1532, arg4);
            } else {
                arg1 = method475(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, this.field1526, 0, var6, arg2, this, this.field1532, arg4);
            }
            this.field1522 -= arg1;
            if (this.field1522 != 0) {
                return arg1;
            }
        } while (!this.method473());
        return arg3;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()Z")
    public final boolean method458() {
        return this.field1522 != 0;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()I")
    public final synchronized int method459() {
        return this.field1536 < 0 ? -1 : this.field1536;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()Lac;")
    public final class4 method18() {
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lre;III)Ljf;")
    public static final class68 method460(class123 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2696 != null && arg0.field2696.length != 0 ? new class68(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[B[IIIIIIIILjf;)I")
    private static final int method461(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1530 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public final synchronized void method462(int arg0) {
        if (arg0 == 0) {
            this.method467(0);
            this.method959(11835);
        } else if (this.field1525 == 0 && this.field1524 == 0) {
            this.field1522 = 0;
            this.field1523 = 0;
            this.field1527 = 0;
            this.method959(11835);
        } else {
            int var2 = -this.field1527;
            if (this.field1527 > var2) {
                var2 = this.field1527;
            }
            if (-this.field1525 > var2) {
                var2 = -this.field1525;
            }
            if (this.field1525 > var2) {
                var2 = this.field1525;
            }
            if (-this.field1524 > var2) {
                var2 = -this.field1524;
            }
            if (this.field1524 > var2) {
                var2 = this.field1524;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1522 = arg0;
            this.field1523 = Integer.MIN_VALUE;
            this.field1526 = -this.field1527 / arg0;
            this.field1531 = -this.field1525 / arg0;
            this.field1533 = -this.field1524 / arg0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()Lac;")
    public final class4 method15() {
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
    private static final int method463(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
    private final synchronized void method464(int arg0, int arg1) {
        this.field1523 = arg0;
        this.field1536 = arg1;
        this.field1522 = 0;
        this.method471();
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "()V")
    private final void method465() {
        if (this.field1522 != 0) {
            if (this.field1523 == Integer.MIN_VALUE) {
                this.field1523 = 0;
            }
            this.field1522 = 0;
            this.method471();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([B[IIIIIIILjf;)I")
    private static final int method466(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1530 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    private final synchronized void method467(int arg0) {
        this.method464(arg0, this.method459());
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V")
    public final synchronized void method468(int arg0) {
        if (this.field1532 < 0) {
            this.field1532 = -arg0;
        } else {
            this.field1532 = arg0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([B[IIIIIIIILjf;)I")
    private static final int method469(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1525 += (var14 - arg3) * arg9.field1531;
        arg9.field1524 += (var14 - arg3) * arg9.field1533;
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
        arg9.field1527 = var12 >> 2;
        arg9.field1530 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)I")
    private static final int method470(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "()V")
    private final void method471() {
        this.field1527 = this.field1523;
        this.field1525 = method463(this.field1523, this.field1536);
        this.field1524 = method470(this.field1523, this.field1536);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[B[IIIIIIIIIILjf;)I")
    private static final int method472(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1527 += (var19 - arg4) * arg12.field1526;
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
        arg12.field1525 = var15 >> 2;
        arg12.field1524 = var16 >> 2;
        arg12.field1530 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "()Z")
    private final boolean method473() {
        int var1 = this.field1523;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method463(var1, this.field1536);
            var2 = method470(var1, this.field1536);
        }
        if (this.field1527 == var1 && this.field1525 == var3 && this.field1524 == var2) {
            if (this.field1523 == Integer.MIN_VALUE) {
                this.field1523 = 0;
                this.field1527 = this.field1525 = this.field1524 = 0;
                this.method959(11835);
                return true;
            } else {
                this.method471();
                return false;
            }
        } else {
            if (this.field1527 < var1) {
                this.field1526 = 1;
                this.field1522 = var1 - this.field1527;
            } else if (this.field1527 > var1) {
                this.field1526 = -1;
                this.field1522 = this.field1527 - var1;
            } else {
                this.field1526 = 0;
            }
            if (this.field1525 < var3) {
                this.field1531 = 1;
                if (this.field1522 == 0 || this.field1522 > var3 - this.field1525) {
                    this.field1522 = var3 - this.field1525;
                }
            } else if (this.field1525 > var3) {
                this.field1531 = -1;
                if (this.field1522 == 0 || this.field1522 > this.field1525 - var3) {
                    this.field1522 = this.field1525 - var3;
                }
            } else {
                this.field1531 = 0;
            }
            if (this.field1524 < var2) {
                this.field1533 = 1;
                if (this.field1522 == 0 || this.field1522 > var2 - this.field1524) {
                    this.field1522 = var2 - this.field1524;
                }
            } else if (this.field1524 > var2) {
                this.field1533 = -1;
                if (this.field1522 == 0 || this.field1522 > this.field1524 - var2) {
                    this.field1522 = this.field1524 - var2;
                }
            } else {
                this.field1533 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[B[IIIIIIIILjf;II)I")
    private static final int method474(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1530 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()I")
    public final int method16() {
        int var1 = this.field1527 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1528 == 0) {
            var2 -= this.field1530 * var2 / (((class123) super.field60).field2696.length << 8);
        } else if (this.field1528 >= 0) {
            var2 -= this.field1534 * var2 / ((class123) super.field60).field2696.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II[B[IIIIIIIILjf;II)I")
    private static final int method475(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1525 -= arg11.field1531 * arg5;
        arg11.field1524 -= arg11.field1533 * arg5;
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
        arg11.field1525 += arg11.field1531 * arg5;
        arg11.field1524 += arg11.field1533 * arg5;
        arg11.field1527 = arg6;
        arg11.field1530 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "([B[IIIIIIILjf;)I")
    private static final int method476(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1530 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[B[IIIIIIILjf;II)I")
    private static final int method477(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1530 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public final synchronized void method21(int arg0) {
        if (this.field1522 > 0) {
            if (arg0 >= this.field1522) {
                if (this.field1523 == Integer.MIN_VALUE) {
                    this.field1523 = 0;
                    this.field1527 = this.field1525 = this.field1524 = 0;
                    this.method959(11835);
                    arg0 = this.field1522;
                }
                this.field1522 = 0;
                this.method471();
            } else {
                this.field1527 += this.field1526 * arg0;
                this.field1525 += this.field1531 * arg0;
                this.field1524 += this.field1533 * arg0;
                this.field1522 -= arg0;
            }
        }
        class123 var2 = (class123) super.field60;
        int var3 = this.field1534 << 8;
        int var4 = this.field1529 << 8;
        int var5 = var2.field2696.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1528 = 0;
        }
        if (this.field1530 < 0) {
            if (this.field1532 <= 0) {
                this.method465();
                this.method959(11835);
                return;
            }
            this.field1530 = 0;
        }
        if (this.field1530 >= var5) {
            if (this.field1532 >= 0) {
                this.method465();
                this.method959(11835);
                return;
            }
            this.field1530 = var5 - 1;
        }
        this.field1530 += this.field1532 * arg0;
        if (this.field1528 < 0) {
            if (!this.field1535) {
                if (this.field1532 < 0) {
                    if (this.field1530 < var3) {
                        this.field1530 = var4 - 1 - (var4 - 1 - this.field1530) % var6;
                    }
                } else if (this.field1530 >= var4) {
                    this.field1530 = (this.field1530 - var3) % var6 + var3;
                }
            } else {
                if (this.field1532 < 0) {
                    if (this.field1530 >= var3) {
                        return;
                    }
                    this.field1530 = var3 + var3 - 1 - this.field1530;
                    this.field1532 = -this.field1532;
                }
                while (this.field1530 >= var4) {
                    this.field1530 = var4 + var4 - 1 - this.field1530;
                    this.field1532 = -this.field1532;
                    if (this.field1530 >= var3) {
                        return;
                    }
                    this.field1530 = var3 + var3 - 1 - this.field1530;
                    this.field1532 = -this.field1532;
                }
            }
        } else {
            if (this.field1528 > 0) {
                if (this.field1535) {
                    label125: {
                        if (this.field1532 < 0) {
                            if (this.field1530 >= var3) {
                                return;
                            }
                            this.field1530 = var3 + var3 - 1 - this.field1530;
                            this.field1532 = -this.field1532;
                            if (--this.field1528 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1530 < var4) {
                                return;
                            }
                            this.field1530 = var4 + var4 - 1 - this.field1530;
                            this.field1532 = -this.field1532;
                            if (--this.field1528 == 0) {
                                break;
                            }
                            if (this.field1530 >= var3) {
                                return;
                            }
                            this.field1530 = var3 + var3 - 1 - this.field1530;
                            this.field1532 = -this.field1532;
                        } while (--this.field1528 != 0);
                    }
                } else if (this.field1532 < 0) {
                    if (this.field1530 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1530) / var6;
                    if (var7 < this.field1528) {
                        this.field1530 += var6 * var7;
                        this.field1528 -= var7;
                        return;
                    }
                    this.field1530 += this.field1528 * var6;
                    this.field1528 = 0;
                } else {
                    if (this.field1530 < var4) {
                        return;
                    }
                    int var8 = (this.field1530 - var3) / var6;
                    if (var8 < this.field1528) {
                        this.field1530 -= var6 * var8;
                        this.field1528 -= var8;
                        return;
                    }
                    this.field1530 -= this.field1528 * var6;
                    this.field1528 = 0;
                }
            }
            if (this.field1532 < 0) {
                if (this.field1530 < 0) {
                    this.field1530 = -1;
                    this.method465();
                    this.method959(11835);
                    return;
                }
            } else if (this.field1530 >= var5) {
                this.field1530 = var5;
                this.method465();
                this.method959(11835);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[B[IIIIIIIIIILjf;II)I")
    private static final int method478(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1527 -= arg13.field1526 * arg5;
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
        arg13.field1527 += arg13.field1526 * var22;
        arg13.field1525 = arg6;
        arg13.field1524 = arg7;
        arg13.field1530 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "([IIIII)I")
    private final int method479(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1522 <= 0) {
                if (this.field1532 == -256 && (this.field1530 & 255) == 0) {
                    if (class7.field105) {
                        return method491(0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, 0, arg3, arg2, this);
                    }
                    return method476(((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, 0, arg3, arg2, this);
                }
                if (class7.field105) {
                    return method487(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, 0, arg3, arg2, this, this.field1532, arg4);
                }
                return method477(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, 0, arg3, arg2, this, this.field1532, arg4);
            }
            int var6 = this.field1522 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1522 += arg1;
            if (this.field1532 == -256 && (this.field1530 & 255) == 0) {
                if (class7.field105) {
                    arg1 = method483(0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, this.field1531, this.field1533, 0, var6, arg2, this);
                } else {
                    arg1 = method480(((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, this.field1526, 0, var6, arg2, this);
                }
            } else if (class7.field105) {
                arg1 = method486(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1525, this.field1524, this.field1531, this.field1533, 0, var6, arg2, this, this.field1532, arg4);
            } else {
                arg1 = method488(0, 0, ((class123) super.field60).field2696, arg0, this.field1530, arg1, this.field1527, this.field1526, 0, var6, arg2, this, this.field1532, arg4);
            }
            this.field1522 -= arg1;
            if (this.field1522 != 0) {
                return arg1;
            }
        } while (!this.method473());
        return arg3;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "([B[IIIIIIIILjf;)I")
    private static final int method480(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1525 += (var14 - arg3) * arg9.field1531;
        arg9.field1524 += (var14 - arg3) * arg9.field1533;
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
        arg9.field1527 = var12 >> 2;
        arg9.field1530 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "()I")
    public final synchronized int method481() {
        return this.field1523 == Integer.MIN_VALUE ? 0 : this.field1523;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)V")
    public final synchronized void method482(int arg0, int arg1) {
        this.method485(arg0, arg1, this.method459());
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I[B[IIIIIIIIIILjf;)I")
    private static final int method483(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1527 += (var19 - arg4) * arg12.field1526;
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
        arg12.field1525 = var15 >> 2;
        arg12.field1524 = var16 >> 2;
        arg12.field1530 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public final synchronized void method484(boolean arg0) {
        this.field1532 = (this.field1532 >>> 31) + (this.field1532 ^ this.field1532 >> 31);
        if (arg0) {
            this.field1532 = -this.field1532;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public final synchronized void method485(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method464(arg1, arg2);
        } else {
            int var4 = method463(arg1, arg2);
            int var5 = method470(arg1, arg2);
            if (this.field1525 == var4 && this.field1524 == var5) {
                this.field1522 = 0;
            } else {
                int var6 = arg1 - this.field1527;
                if (this.field1527 - arg1 > var6) {
                    var6 = this.field1527 - arg1;
                }
                if (var4 - this.field1525 > var6) {
                    var6 = var4 - this.field1525;
                }
                if (this.field1525 - var4 > var6) {
                    var6 = this.field1525 - var4;
                }
                if (var5 - this.field1524 > var6) {
                    var6 = var5 - this.field1524;
                }
                if (this.field1524 - var5 > var6) {
                    var6 = this.field1524 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1522 = arg0;
                this.field1523 = arg1;
                this.field1536 = arg2;
                this.field1526 = (arg1 - this.field1527) / arg0;
                this.field1531 = (var4 - this.field1525) / arg0;
                this.field1533 = (var5 - this.field1524) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II[B[IIIIIIIIIILjf;II)I")
    private static final int method486(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1527 -= arg13.field1526 * arg5;
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
        arg13.field1527 += arg13.field1526 * var22;
        arg13.field1525 = arg6;
        arg13.field1524 = arg7;
        arg13.field1530 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II[B[IIIIIIIILjf;II)I")
    private static final int method487(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1530 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II[B[IIIIIIIILjf;II)I")
    private static final int method488(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1525 -= arg11.field1531 * arg5;
        arg11.field1524 -= arg11.field1533 * arg5;
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
        arg11.field1525 += arg11.field1531 * arg5;
        arg11.field1524 += arg11.field1533 * arg5;
        arg11.field1527 = arg6;
        arg11.field1530 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "()I")
    public final synchronized int method489() {
        return this.field1532 < 0 ? -this.field1532 : this.field1532;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II[B[IIIIIIILjf;II)I")
    private static final int method490(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1530 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I[B[IIIIIIIILjf;)I")
    private static final int method491(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1530 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V")
    public final synchronized void method492(int arg0) {
        int var2 = ((class123) super.field60).field2696.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1530 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lre;II)Ljf;")
    public static final class68 method493(class123 arg0, int arg1, int arg2) {
        return arg0.field2696 != null && arg0.field2696.length != 0 ? new class68(arg0, (int) ((long) arg0.field2698 * 256L * (long) arg1 / (long) (class140.field3224 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lre;II)V")
    private class68(class123 arg0, int arg1, int arg2) {
        super.field60 = arg0;
        this.field1534 = arg0.field2700;
        this.field1529 = arg0.field2697;
        this.field1535 = arg0.field2699;
        this.field1532 = arg1;
        this.field1523 = arg2;
        this.field1536 = 8192;
        this.field1530 = 0;
        this.method471();
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lre;III)V")
    private class68(class123 arg0, int arg1, int arg2, int arg3) {
        super.field60 = arg0;
        this.field1534 = arg0.field2700;
        this.field1529 = arg0.field2697;
        this.field1535 = arg0.field2699;
        this.field1532 = arg1;
        this.field1523 = arg2;
        this.field1536 = arg3;
        this.field1530 = 0;
        this.method471();
    }

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "(I)V")
    public final synchronized void method494(int arg0) {
        this.method464(arg0 << 6, this.method459());
    }
}
