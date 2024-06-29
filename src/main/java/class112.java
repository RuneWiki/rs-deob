import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class112 extends class262 {

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "Z")
    private boolean field1629;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIIIIILfi;II)I")
    private static final int method729(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class112 arg13, int arg14, int arg15) {
        arg13.field1621 -= arg13.field1633 * arg5;
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
        arg13.field1621 += arg13.field1633 * var22;
        arg13.field1627 = arg6;
        arg13.field1634 = arg7;
        arg13.field1625 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public final synchronized void method730(int arg0) {
        if (arg0 == 0) {
            this.method757(0);
            this.method1115(-122);
        } else if (this.field1627 == 0 && this.field1634 == 0) {
            this.field1623 = 0;
            this.field1630 = 0;
            this.field1621 = 0;
            this.method1115(-120);
        } else {
            int var2 = -this.field1621;
            if (this.field1621 > var2) {
                var2 = this.field1621;
            }
            if (-this.field1627 > var2) {
                var2 = -this.field1627;
            }
            if (this.field1627 > var2) {
                var2 = this.field1627;
            }
            if (-this.field1634 > var2) {
                var2 = -this.field1634;
            }
            if (this.field1634 > var2) {
                var2 = this.field1634;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1623 = arg0;
            this.field1630 = Integer.MIN_VALUE;
            this.field1633 = -this.field1621 / arg0;
            this.field1632 = -this.field1627 / arg0;
            this.field1622 = -this.field1634 / arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "()V")
    private final void method731() {
        this.field1621 = this.field1630;
        this.field1627 = method740(this.field1630, this.field1628);
        this.field1634 = method764(this.field1630, this.field1628);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIILfi;II)I")
    private static final int method732(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10, int arg11, int arg12) {
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
        arg10.field1625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "()I")
    public final synchronized int method733() {
        return this.field1628 < 0 ? -1 : this.field1628;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[B[IIIIIIIILfi;)I")
    private static final int method734(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10) {
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
        arg10.field1625 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "()Z")
    private final boolean method735() {
        int var1 = this.field1630;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method740(var1, this.field1628);
            var2 = method764(var1, this.field1628);
        }
        if (this.field1621 == var1 && this.field1627 == var3 && this.field1634 == var2) {
            if (this.field1630 == Integer.MIN_VALUE) {
                this.field1630 = 0;
                this.field1621 = this.field1627 = this.field1634 = 0;
                this.method1115(-122);
                return true;
            } else {
                this.method731();
                return false;
            }
        } else {
            if (this.field1621 < var1) {
                this.field1633 = 1;
                this.field1623 = var1 - this.field1621;
            } else if (this.field1621 > var1) {
                this.field1633 = -1;
                this.field1623 = this.field1621 - var1;
            } else {
                this.field1633 = 0;
            }
            if (this.field1627 < var3) {
                this.field1632 = 1;
                if (this.field1623 == 0 || this.field1623 > var3 - this.field1627) {
                    this.field1623 = var3 - this.field1627;
                }
            } else if (this.field1627 > var3) {
                this.field1632 = -1;
                if (this.field1623 == 0 || this.field1623 > this.field1627 - var3) {
                    this.field1623 = this.field1627 - var3;
                }
            } else {
                this.field1632 = 0;
            }
            if (this.field1634 < var2) {
                this.field1622 = 1;
                if (this.field1623 == 0 || this.field1623 > var2 - this.field1634) {
                    this.field1623 = var2 - this.field1634;
                }
            } else if (this.field1634 > var2) {
                this.field1622 = -1;
                if (this.field1623 == 0 || this.field1623 > this.field1634 - var2) {
                    this.field1623 = this.field1634 - var2;
                }
            } else {
                this.field1622 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "()V")
    private final void method736() {
        if (this.field1623 != 0) {
            if (this.field1630 == Integer.MIN_VALUE) {
                this.field1630 = 0;
            }
            this.field1623 = 0;
            this.method731();
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V")
    public final synchronized void method361(int[] arg0, int arg1, int arg2) {
        if (this.field1630 == 0 && this.field1623 == 0) {
            this.method356(arg2);
        } else {
            class24 var4 = (class24) super.field3958;
            int var5 = this.field1624 << 8;
            int var6 = this.field1626 << 8;
            int var7 = var4.field332.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1620 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1625 < 0) {
                if (this.field1631 <= 0) {
                    this.method736();
                    this.method1115(-121);
                    return;
                }
                this.field1625 = 0;
            }
            if (this.field1625 >= var7) {
                if (this.field1631 >= 0) {
                    this.method736();
                    this.method1115(-125);
                    return;
                }
                this.field1625 = var7 - 1;
            }
            if (this.field1620 < 0) {
                if (this.field1629) {
                    if (this.field1631 < 0) {
                        var9 = this.method759(arg0, arg1, var5, var10, var4.field332[this.field1624]);
                        if (this.field1625 >= var5) {
                            return;
                        }
                        this.field1625 = var5 + var5 - 1 - this.field1625;
                        this.field1631 = -this.field1631;
                    }
                    while (true) {
                        int var11 = this.method763(arg0, var9, var6, var10, var4.field332[this.field1626 - 1]);
                        if (this.field1625 < var6) {
                            return;
                        }
                        this.field1625 = var6 + var6 - 1 - this.field1625;
                        this.field1631 = -this.field1631;
                        var9 = this.method759(arg0, var11, var5, var10, var4.field332[this.field1624]);
                        if (this.field1625 >= var5) {
                            return;
                        }
                        this.field1625 = var5 + var5 - 1 - this.field1625;
                        this.field1631 = -this.field1631;
                    }
                } else if (this.field1631 < 0) {
                    while (true) {
                        var9 = this.method759(arg0, var9, var5, var10, var4.field332[this.field1626 - 1]);
                        if (this.field1625 >= var5) {
                            return;
                        }
                        this.field1625 = var6 - 1 - (var6 - 1 - this.field1625) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method763(arg0, var9, var6, var10, var4.field332[this.field1624]);
                        if (this.field1625 < var6) {
                            return;
                        }
                        this.field1625 = (this.field1625 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1620 > 0) {
                    if (this.field1629) {
                        label130: {
                            if (this.field1631 < 0) {
                                var9 = this.method759(arg0, arg1, var5, var10, var4.field332[this.field1624]);
                                if (this.field1625 >= var5) {
                                    return;
                                }
                                this.field1625 = var5 + var5 - 1 - this.field1625;
                                this.field1631 = -this.field1631;
                                if (--this.field1620 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method763(arg0, var9, var6, var10, var4.field332[this.field1626 - 1]);
                                if (this.field1625 < var6) {
                                    return;
                                }
                                this.field1625 = var6 + var6 - 1 - this.field1625;
                                this.field1631 = -this.field1631;
                                if (--this.field1620 == 0) {
                                    break;
                                }
                                var9 = this.method759(arg0, var9, var5, var10, var4.field332[this.field1624]);
                                if (this.field1625 >= var5) {
                                    return;
                                }
                                this.field1625 = var5 + var5 - 1 - this.field1625;
                                this.field1631 = -this.field1631;
                            } while (--this.field1620 != 0);
                        }
                    } else if (this.field1631 < 0) {
                        while (true) {
                            var9 = this.method759(arg0, var9, var5, var10, var4.field332[this.field1626 - 1]);
                            if (this.field1625 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1625) / var8;
                            if (var12 >= this.field1620) {
                                this.field1625 += this.field1620 * var8;
                                this.field1620 = 0;
                                break;
                            }
                            this.field1625 += var8 * var12;
                            this.field1620 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method763(arg0, var9, var6, var10, var4.field332[this.field1624]);
                            if (this.field1625 < var6) {
                                return;
                            }
                            int var13 = (this.field1625 - var5) / var8;
                            if (var13 >= this.field1620) {
                                this.field1625 -= this.field1620 * var8;
                                this.field1620 = 0;
                                break;
                            }
                            this.field1625 -= var8 * var13;
                            this.field1620 -= var13;
                        }
                    }
                }
                if (this.field1631 < 0) {
                    this.method759(arg0, var9, 0, var10, 0);
                    if (this.field1625 < 0) {
                        this.field1625 = -1;
                        this.method736();
                        this.method1115(-120);
                        return;
                    }
                } else {
                    this.method763(arg0, var9, var7, var10, 0);
                    if (this.field1625 >= var7) {
                        this.field1625 = var7;
                        this.method736();
                        this.method1115(103);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "()I")
    public final synchronized int method737() {
        return this.field1631 < 0 ? -this.field1631 : this.field1631;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method738(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
        arg11.field1627 -= arg11.field1632 * arg5;
        arg11.field1634 -= arg11.field1622 * arg5;
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
        arg11.field1627 += arg11.field1632 * arg5;
        arg11.field1634 += arg11.field1622 * arg5;
        arg11.field1621 = arg6;
        arg11.field1625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[B[IIIIIIIIIILfi;)I")
    private static final int method739(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class112 arg12) {
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
        arg12.field1621 += (var19 - arg4) * arg12.field1633;
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
        arg12.field1627 = var15 >> 2;
        arg12.field1634 = var16 >> 2;
        arg12.field1625 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public final synchronized void method356(int arg0) {
        if (this.field1623 > 0) {
            if (arg0 >= this.field1623) {
                if (this.field1630 == Integer.MIN_VALUE) {
                    this.field1630 = 0;
                    this.field1621 = this.field1627 = this.field1634 = 0;
                    this.method1115(-125);
                    arg0 = this.field1623;
                }
                this.field1623 = 0;
                this.method731();
            } else {
                this.field1621 += this.field1633 * arg0;
                this.field1627 += this.field1632 * arg0;
                this.field1634 += this.field1622 * arg0;
                this.field1623 -= arg0;
            }
        }
        class24 var2 = (class24) super.field3958;
        int var3 = this.field1624 << 8;
        int var4 = this.field1626 << 8;
        int var5 = var2.field332.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1620 = 0;
        }
        if (this.field1625 < 0) {
            if (this.field1631 <= 0) {
                this.method736();
                this.method1115(-41);
                return;
            }
            this.field1625 = 0;
        }
        if (this.field1625 >= var5) {
            if (this.field1631 >= 0) {
                this.method736();
                this.method1115(69);
                return;
            }
            this.field1625 = var5 - 1;
        }
        this.field1625 += this.field1631 * arg0;
        if (this.field1620 < 0) {
            if (!this.field1629) {
                if (this.field1631 < 0) {
                    if (this.field1625 < var3) {
                        this.field1625 = var4 - 1 - (var4 - 1 - this.field1625) % var6;
                    }
                } else if (this.field1625 >= var4) {
                    this.field1625 = (this.field1625 - var3) % var6 + var3;
                }
            } else {
                if (this.field1631 < 0) {
                    if (this.field1625 >= var3) {
                        return;
                    }
                    this.field1625 = var3 + var3 - 1 - this.field1625;
                    this.field1631 = -this.field1631;
                }
                while (this.field1625 >= var4) {
                    this.field1625 = var4 + var4 - 1 - this.field1625;
                    this.field1631 = -this.field1631;
                    if (this.field1625 >= var3) {
                        return;
                    }
                    this.field1625 = var3 + var3 - 1 - this.field1625;
                    this.field1631 = -this.field1631;
                }
            }
        } else {
            if (this.field1620 > 0) {
                if (this.field1629) {
                    label125: {
                        if (this.field1631 < 0) {
                            if (this.field1625 >= var3) {
                                return;
                            }
                            this.field1625 = var3 + var3 - 1 - this.field1625;
                            this.field1631 = -this.field1631;
                            if (--this.field1620 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1625 < var4) {
                                return;
                            }
                            this.field1625 = var4 + var4 - 1 - this.field1625;
                            this.field1631 = -this.field1631;
                            if (--this.field1620 == 0) {
                                break;
                            }
                            if (this.field1625 >= var3) {
                                return;
                            }
                            this.field1625 = var3 + var3 - 1 - this.field1625;
                            this.field1631 = -this.field1631;
                        } while (--this.field1620 != 0);
                    }
                } else if (this.field1631 < 0) {
                    if (this.field1625 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1625) / var6;
                    if (var7 < this.field1620) {
                        this.field1625 += var6 * var7;
                        this.field1620 -= var7;
                        return;
                    }
                    this.field1625 += this.field1620 * var6;
                    this.field1620 = 0;
                } else {
                    if (this.field1625 < var4) {
                        return;
                    }
                    int var8 = (this.field1625 - var3) / var6;
                    if (var8 < this.field1620) {
                        this.field1625 -= var6 * var8;
                        this.field1620 -= var8;
                        return;
                    }
                    this.field1625 -= this.field1620 * var6;
                    this.field1620 = 0;
                }
            }
            if (this.field1631 < 0) {
                if (this.field1625 < 0) {
                    this.field1625 = -1;
                    this.method736();
                    this.method1115(-124);
                    return;
                }
            } else if (this.field1625 >= var5) {
                this.field1625 = var5;
                this.method736();
                this.method1115(-2);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
    private static final int method740(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B[IIIIIIILfi;)I")
    private static final int method741(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112 arg8) {
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
        arg8.field1625 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([B[IIIIIIIILfi;)I")
    private static final int method742(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class112 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1627 += (var14 - arg3) * arg9.field1632;
        arg9.field1634 += (var14 - arg3) * arg9.field1622;
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
        arg9.field1621 = var12 >> 2;
        arg9.field1625 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()Lta;")
    public final class262 method358() {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([B[IIIIIIIILfi;)I")
    private static final int method743(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class112 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1627 += (var14 - arg3) * arg9.field1632;
        arg9.field1634 += (var14 - arg3) * arg9.field1622;
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
        arg9.field1621 = var12 >> 2;
        arg9.field1625 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "()I")
    public final synchronized int method744() {
        return this.field1630 == Integer.MIN_VALUE ? 0 : this.field1630;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public final synchronized void method745(int arg0) {
        int var2 = ((class24) super.field3958).field332.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1625 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
    public final int method746() {
        int var1 = this.field1621 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1620 == 0) {
            var2 -= this.field1625 * var2 / (((class24) super.field3958).field332.length << 8);
        } else if (this.field1620 >= 0) {
            var2 -= this.field1624 * var2 / ((class24) super.field3958).field332.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    public final synchronized void method747(int arg0) {
        if (this.field1631 < 0) {
            this.field1631 = -arg0;
        } else {
            this.field1631 = arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method748(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
        arg11.field1627 -= arg11.field1632 * arg5;
        arg11.field1634 -= arg11.field1622 * arg5;
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
        arg11.field1627 += arg11.field1632 * arg5;
        arg11.field1634 += arg11.field1622 * arg5;
        arg11.field1621 = arg6;
        arg11.field1625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[B[IIIIIIIIIILfi;)I")
    private static final int method749(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class112 arg12) {
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
        arg12.field1621 += (var19 - arg4) * arg12.field1633;
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
        arg12.field1627 = var15 >> 2;
        arg12.field1634 = var16 >> 2;
        arg12.field1625 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method750(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
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
        arg11.field1625 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
    public final synchronized void method751(int arg0, int arg1) {
        this.method768(arg0, arg1, this.method733());
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([B[IIIIIIILfi;)I")
    private static final int method752(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112 arg8) {
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
        arg8.field1625 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lec;II)Lfi;")
    public static final class112 method753(class24 arg0, int arg1, int arg2) {
        return arg0.field332 != null && arg0.field332.length != 0 ? new class112(arg0, (int) ((long) arg0.field333 * 256L * (long) arg1 / (long) (class60.field845 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "()Z")
    public final boolean method754() {
        return this.field1625 < 0 || this.field1625 >= ((class24) super.field3958).field332.length << 8;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final synchronized void method755(boolean arg0) {
        this.field1631 = (this.field1631 >>> 31) + (this.field1631 ^ this.field1631 >> 31);
        if (arg0) {
            this.field1631 = -this.field1631;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V")
    private final synchronized void method756(int arg0, int arg1) {
        this.field1630 = arg0;
        this.field1628 = arg1;
        this.field1623 = 0;
        this.method731();
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "()I")
    public final int method362() {
        return this.field1630 == 0 && this.field1623 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
    private final synchronized void method757(int arg0) {
        this.method756(arg0, this.method733());
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "()Z")
    public final boolean method758() {
        return this.field1623 != 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIIII)I")
    private final int method759(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1623 <= 0) {
                if (this.field1631 == -256 && (this.field1625 & 255) == 0) {
                    if (class286.field4477) {
                        return method734(0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, 0, arg3, arg2, this);
                    }
                    return method741(((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, 0, arg3, arg2, this);
                }
                if (class286.field4477) {
                    return method760(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, 0, arg3, arg2, this, this.field1631, arg4);
                }
                return method732(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, 0, arg3, arg2, this, this.field1631, arg4);
            }
            int var6 = this.field1623 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1623 += arg1;
            if (this.field1631 == -256 && (this.field1625 & 255) == 0) {
                if (class286.field4477) {
                    arg1 = method739(0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, this.field1632, this.field1622, 0, var6, arg2, this);
                } else {
                    arg1 = method743(((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, this.field1633, 0, var6, arg2, this);
                }
            } else if (class286.field4477) {
                arg1 = method761(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, this.field1632, this.field1622, 0, var6, arg2, this, this.field1631, arg4);
            } else {
                arg1 = method748(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, this.field1633, 0, var6, arg2, this, this.field1631, arg4);
            }
            this.field1623 -= arg1;
            if (this.field1623 != 0) {
                return arg1;
            }
        } while (!this.method735());
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II[B[IIIIIIIILfi;II)I")
    private static final int method760(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
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
        arg11.field1625 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIIIIILfi;II)I")
    private static final int method761(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class112 arg13, int arg14, int arg15) {
        arg13.field1621 -= arg13.field1633 * arg5;
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
        arg13.field1621 += arg13.field1633 * var22;
        arg13.field1627 = arg6;
        arg13.field1634 = arg7;
        arg13.field1625 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I[B[IIIIIIIILfi;)I")
    private static final int method762(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10) {
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
        arg10.field1625 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([IIIII)I")
    private final int method763(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1623 <= 0) {
                if (this.field1631 == 256 && (this.field1625 & 255) == 0) {
                    if (class286.field4477) {
                        return method762(0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, 0, arg3, arg2, this);
                    }
                    return method752(((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, 0, arg3, arg2, this);
                }
                if (class286.field4477) {
                    return method750(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, 0, arg3, arg2, this, this.field1631, arg4);
                }
                return method769(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, 0, arg3, arg2, this, this.field1631, arg4);
            }
            int var6 = this.field1623 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1623 += arg1;
            if (this.field1631 == 256 && (this.field1625 & 255) == 0) {
                if (class286.field4477) {
                    arg1 = method749(0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, this.field1632, this.field1622, 0, var6, arg2, this);
                } else {
                    arg1 = method742(((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, this.field1633, 0, var6, arg2, this);
                }
            } else if (class286.field4477) {
                arg1 = method729(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1627, this.field1634, this.field1632, this.field1622, 0, var6, arg2, this, this.field1631, arg4);
            } else {
                arg1 = method738(0, 0, ((class24) super.field3958).field332, arg0, this.field1625, arg1, this.field1621, this.field1633, 0, var6, arg2, this, this.field1631, arg4);
            }
            this.field1623 -= arg1;
            if (this.field1623 != 0) {
                return arg1;
            }
        } while (!this.method735());
        return arg3;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)I")
    private static final int method764(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lta;")
    public final class262 method355() {
        return null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lec;III)Lfi;")
    public static final class112 method765(class24 arg0, int arg1, int arg2, int arg3) {
        return arg0.field332 != null && arg0.field332.length != 0 ? new class112(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V")
    public final synchronized void method766(int arg0) {
        this.method756(arg0 << 6, this.method733());
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
    public final synchronized void method767(int arg0) {
        this.field1620 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public final synchronized void method768(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method756(arg1, arg2);
        } else {
            int var4 = method740(arg1, arg2);
            int var5 = method764(arg1, arg2);
            if (this.field1627 == var4 && this.field1634 == var5) {
                this.field1623 = 0;
            } else {
                int var6 = arg1 - this.field1621;
                if (this.field1621 - arg1 > var6) {
                    var6 = this.field1621 - arg1;
                }
                if (var4 - this.field1627 > var6) {
                    var6 = var4 - this.field1627;
                }
                if (this.field1627 - var4 > var6) {
                    var6 = this.field1627 - var4;
                }
                if (var5 - this.field1634 > var6) {
                    var6 = var5 - this.field1634;
                }
                if (this.field1634 - var5 > var6) {
                    var6 = this.field1634 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1623 = arg0;
                this.field1630 = arg1;
                this.field1628 = arg2;
                this.field1633 = (arg1 - this.field1621) / arg0;
                this.field1632 = (var4 - this.field1627) / arg0;
                this.field1622 = (var5 - this.field1634) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II[B[IIIIIIILfi;II)I")
    private static final int method769(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10, int arg11, int arg12) {
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
        arg10.field1625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lec;II)V")
    private class112(class24 arg0, int arg1, int arg2) {
        super.field3958 = arg0;
        this.field1624 = arg0.field330;
        this.field1626 = arg0.field334;
        this.field1629 = arg0.field331;
        this.field1631 = arg1;
        this.field1630 = arg2;
        this.field1628 = 8192;
        this.field1625 = 0;
        this.method731();
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lec;III)V")
    private class112(class24 arg0, int arg1, int arg2, int arg3) {
        super.field3958 = arg0;
        this.field1624 = arg0.field330;
        this.field1626 = arg0.field334;
        this.field1629 = arg0.field331;
        this.field1631 = arg1;
        this.field1630 = arg2;
        this.field1628 = arg3;
        this.field1625 = 0;
        this.method731();
    }
}
