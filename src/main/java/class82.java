import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class82 extends class228 {

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Z")
    private boolean field1568;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 3)
    private static final int method681(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 6)
    private final synchronized void method682(int arg0) {
        this.method698(arg0, this.method721());
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B[IIIIIIIIIILwa;II)I", line = 9)
    private static final int method683(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class82 arg13, int arg14, int arg15) {
        arg13.field1564 -= arg13.field1570 * arg5;
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
        arg13.field1564 += arg13.field1570 * var26;
        arg13.field1573 = arg6;
        arg13.field1572 = arg7;
        arg13.field1575 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIII)I", line = 51)
    private final int method684(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1566 > 0) {
                int var6 = this.field1566 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1566 += arg1;
                if (this.field1574 == 256 && (this.field1575 & 0xFF) == 0) {
                    if (class287.field5132) {
                        arg1 = method686(0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, this.field1577, this.field1569, 0, var6, arg2, this);
                    } else {
                        arg1 = method700(((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, this.field1570, 0, var6, arg2, this);
                    }
                } else if (class287.field5132) {
                    arg1 = method703(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, this.field1577, this.field1569, 0, var6, arg2, this, this.field1574, arg4);
                } else {
                    arg1 = method691(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, this.field1570, 0, var6, arg2, this, this.field1574, arg4);
                }
                this.field1566 -= arg1;
                if (this.field1566 != 0) {
                    return arg1;
                }
                if (!this.method688()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1574 == 256 && (this.field1575 & 0xFF) == 0) {
                if (class287.field5132) {
                    return method708(0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, 0, arg3, arg2, this);
                }
                return method709(((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, 0, arg3, arg2, this);
            }
            if (class287.field5132) {
                return method719(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, 0, arg3, arg2, this, this.field1574, arg4);
            }
            return method697(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, 0, arg3, arg2, this, this.field1574, arg4);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltc;II)Lwa;", line = 106)
    public static final class82 method685(class40 arg0, int arg1, int arg2) {
        return arg0.field861 == null || arg0.field861.length == 0 ? null : new class82(arg0, (int) ((long) arg0.field864 * 256L * (long) arg1 / (long) (class312.field5524 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[B[IIIIIIIIIILwa;)I", line = 117)
    private static final int method686(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class82 arg12) {
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
        arg12.field1564 += (var19 - arg4) * arg12.field1570;
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
        arg12.field1573 = var15 >> 2;
        arg12.field1572 = var16 >> 2;
        arg12.field1575 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V", line = 171)
    public final synchronized void method687(int arg0) {
        int var2 = ((class40) this.field3978).field861.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1575 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "()Z", line = 182)
    private final boolean method688() {
        int var1 = this.field1567;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method681(var1, this.field1578);
            var2 = method694(var1, this.field1578);
        }
        if (this.field1564 != var1 || this.field1573 != var3 || this.field1572 != var2) {
            if (this.field1564 < var1) {
                this.field1570 = 1;
                this.field1566 = var1 - this.field1564;
            } else if (this.field1564 > var1) {
                this.field1570 = -1;
                this.field1566 = this.field1564 - var1;
            } else {
                this.field1570 = 0;
            }
            if (this.field1573 < var3) {
                this.field1577 = 1;
                if (this.field1566 == 0 || this.field1566 > var3 - this.field1573) {
                    this.field1566 = var3 - this.field1573;
                }
            } else if (this.field1573 > var3) {
                this.field1577 = -1;
                if (this.field1566 == 0 || this.field1566 > this.field1573 - var3) {
                    this.field1566 = this.field1573 - var3;
                }
            } else {
                this.field1577 = 0;
            }
            if (this.field1572 < var2) {
                this.field1569 = 1;
                if (this.field1566 == 0 || this.field1566 > var2 - this.field1572) {
                    this.field1566 = var2 - this.field1572;
                }
            } else if (this.field1572 > var2) {
                this.field1569 = -1;
                if (this.field1566 == 0 || this.field1566 > this.field1572 - var2) {
                    this.field1566 = this.field1572 - var2;
                }
            } else {
                this.field1569 = 0;
            }
            return false;
        } else if (this.field1567 == Integer.MIN_VALUE) {
            this.field1567 = 0;
            this.field1564 = this.field1573 = this.field1572 = 0;
            this.method2221(true);
            return true;
        } else {
            this.method711();
            return false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 267)
    public final synchronized void method689(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method698(arg1, arg2);
            return;
        }
        int var4 = method681(arg1, arg2);
        int var5 = method694(arg1, arg2);
        if (this.field1573 == var4 && this.field1572 == var5) {
            this.field1566 = 0;
            return;
        }
        int var6 = arg1 - this.field1564;
        if (this.field1564 - arg1 > var6) {
            var6 = this.field1564 - arg1;
        }
        if (var4 - this.field1573 > var6) {
            var6 = var4 - this.field1573;
        }
        if (this.field1573 - var4 > var6) {
            var6 = this.field1573 - var4;
        }
        if (var5 - this.field1572 > var6) {
            var6 = var5 - this.field1572;
        }
        if (this.field1572 - var5 > var6) {
            var6 = this.field1572 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1566 = arg0;
        this.field1567 = arg1;
        this.field1578 = arg2;
        this.field1570 = (arg1 - this.field1564) / arg0;
        this.field1577 = (var4 - this.field1573) / arg0;
        this.field1569 = (var5 - this.field1572) / arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 313)
    public final synchronized void method131(int arg0) {
        if (this.field1566 > 0) {
            if (arg0 >= this.field1566) {
                if (this.field1567 == Integer.MIN_VALUE) {
                    this.field1567 = 0;
                    this.field1564 = this.field1573 = this.field1572 = 0;
                    this.method2221(true);
                    arg0 = this.field1566;
                }
                this.field1566 = 0;
                this.method711();
            } else {
                this.field1564 += this.field1570 * arg0;
                this.field1573 += this.field1577 * arg0;
                this.field1572 += this.field1569 * arg0;
                this.field1566 -= arg0;
            }
        }
        class40 var2 = (class40) this.field3978;
        int var3 = this.field1571 << 8;
        int var4 = this.field1565 << 8;
        int var5 = var2.field861.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1576 = 0;
        }
        if (this.field1575 < 0) {
            if (this.field1574 <= 0) {
                this.method702();
                this.method2221(true);
                return;
            }
            this.field1575 = 0;
        }
        if (this.field1575 >= var5) {
            if (this.field1574 >= 0) {
                this.method702();
                this.method2221(true);
                return;
            }
            this.field1575 = var5 - 1;
        }
        this.field1575 += this.field1574 * arg0;
        if (this.field1576 >= 0) {
            if (this.field1576 > 0) {
                if (this.field1568) {
                    label121: {
                        if (this.field1574 < 0) {
                            if (this.field1575 >= var3) {
                                return;
                            }
                            this.field1575 = var3 + var3 - this.field1575 - 1;
                            this.field1574 = -this.field1574;
                            if (--this.field1576 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1575 < var4) {
                                return;
                            }
                            this.field1575 = var4 + var4 - this.field1575 - 1;
                            this.field1574 = -this.field1574;
                            if (--this.field1576 == 0) {
                                break;
                            }
                            if (this.field1575 >= var3) {
                                return;
                            }
                            this.field1575 = var3 + var3 - this.field1575 - 1;
                            this.field1574 = -this.field1574;
                        } while (--this.field1576 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1574 < 0) {
                            if (this.field1575 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1575 - 1) / var6;
                            if (var7 >= this.field1576) {
                                this.field1575 += this.field1576 * var6;
                                this.field1576 = 0;
                                break label153;
                            }
                            this.field1575 += var6 * var7;
                            this.field1576 -= var7;
                        } else if (this.field1575 >= var4) {
                            int var8 = (this.field1575 - var3) / var6;
                            if (var8 >= this.field1576) {
                                this.field1575 -= this.field1576 * var6;
                                this.field1576 = 0;
                                break label153;
                            }
                            this.field1575 -= var6 * var8;
                            this.field1576 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1574 < 0) {
                if (this.field1575 < 0) {
                    this.field1575 = -1;
                    this.method702();
                    this.method2221(true);
                }
            } else if (this.field1575 >= var5) {
                this.field1575 = var5;
                this.method702();
                this.method2221(true);
            }
        } else if (this.field1568) {
            if (this.field1574 < 0) {
                if (this.field1575 >= var3) {
                    return;
                }
                this.field1575 = var3 + var3 - this.field1575 - 1;
                this.field1574 = -this.field1574;
            }
            while (this.field1575 >= var4) {
                this.field1575 = var4 + var4 - this.field1575 - 1;
                this.field1574 = -this.field1574;
                if (this.field1575 >= var3) {
                    return;
                }
                this.field1575 = var3 + var3 - this.field1575 - 1;
                this.field1574 = -this.field1574;
            }
        } else if (this.field1574 < 0) {
            if (this.field1575 >= var3) {
                return;
            }
            this.field1575 = var4 - (var4 - 1 - this.field1575) % var6 - 1;
        } else if (this.field1575 >= var4) {
            this.field1575 = (this.field1575 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V", line = 533)
    public final synchronized void method690(int arg0, int arg1) {
        this.method689(arg0, arg1, this.method721());
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "()Lgj;", line = 536)
    public final class228 method133() {
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 541)
    private static final int method691(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        arg11.field1573 -= arg11.field1577 * arg5;
        arg11.field1572 -= arg11.field1569 * arg5;
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
        arg11.field1573 += arg11.field1577 * arg5;
        arg11.field1572 += arg11.field1569 * arg5;
        arg11.field1564 = arg6;
        arg11.field1575 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I[B[IIIIIIIIIILwa;)I", line = 575)
    private static final int method692(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class82 arg12) {
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
        arg12.field1564 += (var19 - arg4) * arg12.field1570;
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
        arg12.field1573 = var15 >> 2;
        arg12.field1572 = var16 >> 2;
        arg12.field1575 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ltc;III)Lwa;", line = 629)
    public static final class82 method693(class40 arg0, int arg1, int arg2, int arg3) {
        return arg0.field861 == null || arg0.field861.length == 0 ? null : new class82(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)I", line = 635)
    private static final int method694(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 639)
    private static final int method695(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
        arg11.field1573 -= arg11.field1577 * arg5;
        arg11.field1572 -= arg11.field1569 * arg5;
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
        arg11.field1573 += arg11.field1577 * arg5;
        arg11.field1572 += arg11.field1569 * arg5;
        arg11.field1564 = arg6;
        arg11.field1575 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()I", line = 673)
    public final int method696() {
        int var1 = this.field1564 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1576 == 0) {
            var2 -= this.field1575 * var2 / (((class40) this.field3978).field861.length << 8);
        } else if (this.field1576 >= 0) {
            var2 -= this.field1571 * var2 / ((class40) this.field3978).field861.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B[IIIIIIILwa;II)I", line = 685)
    private static final int method697(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10, int arg11, int arg12) {
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
        arg10.field1575 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)V", line = 711)
    private final synchronized void method698(int arg0, int arg1) {
        this.field1567 = arg0;
        this.field1578 = arg1;
        this.field1566 = 0;
        this.method711();
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V", line = 719)
    public final synchronized void method699(int arg0) {
        if (this.field1574 < 0) {
            this.field1574 = -arg0;
        } else {
            this.field1574 = arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([B[IIIIIIIILwa;)I", line = 727)
    private static final int method700(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1573 += (var14 - arg3) * arg9.field1577;
        arg9.field1572 += (var14 - arg3) * arg9.field1569;
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
        arg9.field1564 = var12 >> 2;
        arg9.field1575 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 766)
    private static final int method701(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
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
        arg11.field1575 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()Lgj;", line = 798)
    public final class228 method140() {
        return null;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "()V", line = 802)
    private final void method702() {
        if (this.field1566 == 0) {
            return;
        }
        if (this.field1567 == Integer.MIN_VALUE) {
            this.field1567 = 0;
        }
        this.field1566 = 0;
        this.method711();
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II[B[IIIIIIIIIILwa;II)I", line = 814)
    private static final int method703(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class82 arg13, int arg14, int arg15) {
        arg13.field1564 -= arg13.field1570 * arg5;
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
        arg13.field1564 += arg13.field1570 * var27;
        arg13.field1573 = arg6;
        arg13.field1572 = arg7;
        arg13.field1575 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 856)
    public final synchronized void method704(int arg0) {
        this.method698(arg0 << 6, this.method721());
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "()I", line = 860)
    public final synchronized int method705() {
        return this.field1567 == Integer.MIN_VALUE ? 0 : this.field1567;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()I", line = 863)
    public final int method102() {
        return this.field1567 == 0 && this.field1566 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([B[IIIIIIILwa;)I", line = 869)
    private static final int method706(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class82 arg8) {
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
        arg8.field1575 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[B[IIIIIIIILwa;)I", line = 894)
    private static final int method707(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10) {
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
        arg10.field1575 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I[B[IIIIIIIILwa;)I", line = 932)
    private static final int method708(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10) {
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
        arg10.field1575 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([B[IIIIIIILwa;)I", line = 970)
    private static final int method709(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class82 arg8) {
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
        arg8.field1575 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([IIIII)I", line = 995)
    private final int method710(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1566 > 0) {
                int var6 = this.field1566 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1566 += arg1;
                if (this.field1574 == -256 && (this.field1575 & 0xFF) == 0) {
                    if (class287.field5132) {
                        arg1 = method692(0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, this.field1577, this.field1569, 0, var6, arg2, this);
                    } else {
                        arg1 = method714(((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, this.field1570, 0, var6, arg2, this);
                    }
                } else if (class287.field5132) {
                    arg1 = method683(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, this.field1577, this.field1569, 0, var6, arg2, this, this.field1574, arg4);
                } else {
                    arg1 = method695(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, this.field1570, 0, var6, arg2, this, this.field1574, arg4);
                }
                this.field1566 -= arg1;
                if (this.field1566 != 0) {
                    return arg1;
                }
                if (!this.method688()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1574 == -256 && (this.field1575 & 0xFF) == 0) {
                if (class287.field5132) {
                    return method707(0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, 0, arg3, arg2, this);
                }
                return method706(((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, 0, arg3, arg2, this);
            }
            if (class287.field5132) {
                return method701(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1573, this.field1572, 0, arg3, arg2, this, this.field1574, arg4);
            }
            return method718(0, 0, ((class40) this.field3978).field861, arg0, this.field1575, arg1, this.field1564, 0, arg3, arg2, this, this.field1574, arg4);
        }
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "()V", line = 1052)
    private final void method711() {
        this.field1564 = this.field1567;
        this.field1573 = method681(this.field1567, this.field1578);
        this.field1572 = method694(this.field1567, this.field1578);
    }

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "()Z", line = 1057)
    public final boolean method712() {
        return this.field1575 < 0 || this.field1575 >= ((class40) this.field3978).field861.length << 8;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([III)V", line = 1064)
    public final synchronized void method117(int[] arg0, int arg1, int arg2) {
        if (this.field1567 == 0 && this.field1566 == 0) {
            this.method131(arg2);
            return;
        }
        class40 var4 = (class40) this.field3978;
        int var5 = this.field1571 << 8;
        int var6 = this.field1565 << 8;
        int var7 = var4.field861.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1576 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1575 < 0) {
            if (this.field1574 <= 0) {
                this.method702();
                this.method2221(true);
                return;
            }
            this.field1575 = 0;
        }
        if (this.field1575 >= var7) {
            if (this.field1574 >= 0) {
                this.method702();
                this.method2221(true);
                return;
            }
            this.field1575 = var7 - 1;
        }
        if (this.field1576 >= 0) {
            if (this.field1576 > 0) {
                if (this.field1568) {
                    label131: {
                        if (this.field1574 < 0) {
                            var9 = this.method710(arg0, arg1, var5, var10, var4.field861[this.field1571]);
                            if (this.field1575 >= var5) {
                                return;
                            }
                            this.field1575 = var5 + var5 - this.field1575 - 1;
                            this.field1574 = -this.field1574;
                            if (--this.field1576 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method684(arg0, var9, var6, var10, var4.field861[this.field1565 - 1]);
                            if (this.field1575 < var6) {
                                return;
                            }
                            this.field1575 = var6 + var6 - this.field1575 - 1;
                            this.field1574 = -this.field1574;
                            if (--this.field1576 == 0) {
                                break;
                            }
                            var9 = this.method710(arg0, var9, var5, var10, var4.field861[this.field1571]);
                            if (this.field1575 >= var5) {
                                return;
                            }
                            this.field1575 = var5 + var5 - this.field1575 - 1;
                            this.field1574 = -this.field1574;
                        } while (--this.field1576 != 0);
                    }
                } else if (this.field1574 < 0) {
                    while (true) {
                        var9 = this.method710(arg0, var9, var5, var10, var4.field861[this.field1565 - 1]);
                        if (this.field1575 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1575 - 1) / var8;
                        if (var12 >= this.field1576) {
                            this.field1575 += this.field1576 * var8;
                            this.field1576 = 0;
                            break;
                        }
                        this.field1575 += var8 * var12;
                        this.field1576 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method684(arg0, var9, var6, var10, var4.field861[this.field1571]);
                        if (this.field1575 < var6) {
                            return;
                        }
                        int var13 = (this.field1575 - var5) / var8;
                        if (var13 >= this.field1576) {
                            this.field1575 -= this.field1576 * var8;
                            this.field1576 = 0;
                            break;
                        }
                        this.field1575 -= var8 * var13;
                        this.field1576 -= var13;
                    }
                }
            }
            if (this.field1574 < 0) {
                this.method710(arg0, var9, 0, var10, 0);
                if (this.field1575 < 0) {
                    this.field1575 = -1;
                    this.method702();
                    this.method2221(true);
                }
            } else {
                this.method684(arg0, var9, var7, var10, 0);
                if (this.field1575 >= var7) {
                    this.field1575 = var7;
                    this.method702();
                    this.method2221(true);
                }
            }
        } else if (this.field1568) {
            if (this.field1574 < 0) {
                var9 = this.method710(arg0, arg1, var5, var10, var4.field861[this.field1571]);
                if (this.field1575 >= var5) {
                    return;
                }
                this.field1575 = var5 + var5 - this.field1575 - 1;
                this.field1574 = -this.field1574;
            }
            while (true) {
                int var11 = this.method684(arg0, var9, var6, var10, var4.field861[this.field1565 - 1]);
                if (this.field1575 < var6) {
                    return;
                }
                this.field1575 = var6 + var6 - this.field1575 - 1;
                this.field1574 = -this.field1574;
                var9 = this.method710(arg0, var11, var5, var10, var4.field861[this.field1571]);
                if (this.field1575 >= var5) {
                    return;
                }
                this.field1575 = var5 + var5 - this.field1575 - 1;
                this.field1574 = -this.field1574;
            }
        } else if (this.field1574 < 0) {
            while (true) {
                var9 = this.method710(arg0, var9, var5, var10, var4.field861[this.field1565 - 1]);
                if (this.field1575 >= var5) {
                    return;
                }
                this.field1575 = var6 - (var6 - 1 - this.field1575) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method684(arg0, var9, var6, var10, var4.field861[this.field1571]);
                if (this.field1575 < var6) {
                    return;
                }
                this.field1575 = (this.field1575 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V", line = 1300)
    public final synchronized void method713(boolean arg0) {
        this.field1574 = (this.field1574 >>> 31) + (this.field1574 ^ this.field1574 >> 31);
        if (arg0) {
            this.field1574 = -this.field1574;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "([B[IIIIIIIILwa;)I", line = 1306)
    private static final int method714(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class82 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1573 += (var14 - arg3) * arg9.field1577;
        arg9.field1572 += (var14 - arg3) * arg9.field1569;
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
        arg9.field1564 = var12 >> 2;
        arg9.field1575 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V", line = 1340)
    public final synchronized void method715(int arg0) {
        this.field1576 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)V", line = 1344)
    public final synchronized void method716(int arg0) {
        if (arg0 == 0) {
            this.method682(0);
            this.method2221(true);
        } else if (this.field1573 == 0 && this.field1572 == 0) {
            this.field1566 = 0;
            this.field1567 = 0;
            this.field1564 = 0;
            this.method2221(true);
        } else {
            int var2 = -this.field1564;
            if (this.field1564 > var2) {
                var2 = this.field1564;
            }
            if (-this.field1573 > var2) {
                var2 = -this.field1573;
            }
            if (this.field1573 > var2) {
                var2 = this.field1573;
            }
            if (-this.field1572 > var2) {
                var2 = -this.field1572;
            }
            if (this.field1572 > var2) {
                var2 = this.field1572;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1566 = arg0;
            this.field1567 = Integer.MIN_VALUE;
            this.field1570 = -this.field1564 / arg0;
            this.field1577 = -this.field1573 / arg0;
            this.field1569 = -this.field1572 / arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "()I", line = 1389)
    public final synchronized int method717() {
        return this.field1574 < 0 ? -this.field1574 : this.field1574;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II[B[IIIIIIILwa;II)I", line = 1393)
    private static final int method718(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class82 arg10, int arg11, int arg12) {
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
        arg10.field1575 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(II[B[IIIIIIIILwa;II)I", line = 1420)
    private static final int method719(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11, int arg12, int arg13) {
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
        arg11.field1575 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ltc;II)V", line = 1452)
    private class82(class40 arg0, int arg1, int arg2) {
        this.field3978 = arg0;
        this.field1571 = arg0.field863;
        this.field1565 = arg0.field862;
        this.field1568 = arg0.field865;
        this.field1574 = arg1;
        this.field1567 = arg2;
        this.field1578 = 8192;
        this.field1575 = 0;
        this.method711();
    }

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "()Z", line = 1464)
    public final boolean method720() {
        return this.field1566 != 0;
    }

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "()I", line = 1467)
    public final synchronized int method721() {
        return this.field1578 < 0 ? -1 : this.field1578;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ltc;III)V", line = 1469)
    private class82(class40 arg0, int arg1, int arg2, int arg3) {
        this.field3978 = arg0;
        this.field1571 = arg0.field863;
        this.field1565 = arg0.field862;
        this.field1568 = arg0.field865;
        this.field1574 = arg1;
        this.field1567 = arg2;
        this.field1578 = arg3;
        this.field1575 = 0;
        this.method711();
    }
}
