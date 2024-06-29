import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class108 extends class148 {

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Z")
    private boolean field1610;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 3)
    public final synchronized void method678(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method691(arg1, arg2);
            return;
        }
        int var4 = method685(arg1, arg2);
        int var5 = method687(arg1, arg2);
        if (this.field1618 == var4 && this.field1609 == var5) {
            this.field1613 = 0;
            return;
        }
        int var6 = arg1 - this.field1620;
        if (this.field1620 - arg1 > var6) {
            var6 = this.field1620 - arg1;
        }
        if (var4 - this.field1618 > var6) {
            var6 = var4 - this.field1618;
        }
        if (this.field1618 - var4 > var6) {
            var6 = this.field1618 - var4;
        }
        if (var5 - this.field1609 > var6) {
            var6 = var5 - this.field1609;
        }
        if (this.field1609 - var5 > var6) {
            var6 = this.field1609 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1613 = arg0;
        this.field1615 = arg1;
        this.field1611 = arg2;
        this.field1607 = (arg1 - this.field1620) / arg0;
        this.field1617 = (var4 - this.field1618) / arg0;
        this.field1606 = (var5 - this.field1609) / arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B[IIIIIIIIIILwd;)I", line = 50)
    private static final int method679(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class108 arg12) {
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
        arg12.field1620 += (var19 - arg4) * arg12.field1607;
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
        arg12.field1618 = var15 >> 2;
        arg12.field1609 = var16 >> 2;
        arg12.field1608 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([B[IIIIIIILwd;)I", line = 103)
    private static final int method680(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108 arg8) {
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
        arg8.field1608 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([B[IIIIIIILwd;)I", line = 128)
    private static final int method681(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108 arg8) {
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
        arg8.field1608 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[B[IIIIIIIILwd;II)I", line = 154)
    private static final int method682(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
        arg11.field1618 -= arg11.field1617 * arg5;
        arg11.field1609 -= arg11.field1606 * arg5;
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
        arg11.field1618 += arg11.field1617 * arg5;
        arg11.field1609 += arg11.field1606 * arg5;
        arg11.field1620 = arg6;
        arg11.field1608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([III)V", line = 189)
    public final synchronized void method271(int[] arg0, int arg1, int arg2) {
        if (this.field1615 == 0 && this.field1613 == 0) {
            this.method274(arg2);
            return;
        }
        class26 var4 = (class26) this.field2144;
        int var5 = this.field1616 << 8;
        int var6 = this.field1614 << 8;
        int var7 = var4.field429.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1612 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1608 < 0) {
            if (this.field1619 <= 0) {
                this.method708();
                this.method1997(-27381);
                return;
            }
            this.field1608 = 0;
        }
        if (this.field1608 >= var7) {
            if (this.field1619 >= 0) {
                this.method708();
                this.method1997(-27381);
                return;
            }
            this.field1608 = var7 - 1;
        }
        if (this.field1612 >= 0) {
            if (this.field1612 > 0) {
                if (this.field1610) {
                    label131: {
                        if (this.field1619 < 0) {
                            var9 = this.method702(arg0, arg1, var5, var10, var4.field429[this.field1616]);
                            if (this.field1608 >= var5) {
                                return;
                            }
                            this.field1608 = var5 + var5 - this.field1608 - 1;
                            this.field1619 = -this.field1619;
                            if (--this.field1612 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method694(arg0, var9, var6, var10, var4.field429[this.field1614 - 1]);
                            if (this.field1608 < var6) {
                                return;
                            }
                            this.field1608 = var6 + var6 - this.field1608 - 1;
                            this.field1619 = -this.field1619;
                            if (--this.field1612 == 0) {
                                break;
                            }
                            var9 = this.method702(arg0, var9, var5, var10, var4.field429[this.field1616]);
                            if (this.field1608 >= var5) {
                                return;
                            }
                            this.field1608 = var5 + var5 - this.field1608 - 1;
                            this.field1619 = -this.field1619;
                        } while (--this.field1612 != 0);
                    }
                } else if (this.field1619 < 0) {
                    while (true) {
                        var9 = this.method702(arg0, var9, var5, var10, var4.field429[this.field1614 - 1]);
                        if (this.field1608 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1608 - 1) / var8;
                        if (var12 >= this.field1612) {
                            this.field1608 += this.field1612 * var8;
                            this.field1612 = 0;
                            break;
                        }
                        this.field1608 += var8 * var12;
                        this.field1612 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method694(arg0, var9, var6, var10, var4.field429[this.field1616]);
                        if (this.field1608 < var6) {
                            return;
                        }
                        int var13 = (this.field1608 - var5) / var8;
                        if (var13 >= this.field1612) {
                            this.field1608 -= this.field1612 * var8;
                            this.field1612 = 0;
                            break;
                        }
                        this.field1608 -= var8 * var13;
                        this.field1612 -= var13;
                    }
                }
            }
            if (this.field1619 < 0) {
                this.method702(arg0, var9, 0, var10, 0);
                if (this.field1608 < 0) {
                    this.field1608 = -1;
                    this.method708();
                    this.method1997(-27381);
                }
            } else {
                this.method694(arg0, var9, var7, var10, 0);
                if (this.field1608 >= var7) {
                    this.field1608 = var7;
                    this.method708();
                    this.method1997(-27381);
                }
            }
        } else if (this.field1610) {
            if (this.field1619 < 0) {
                var9 = this.method702(arg0, arg1, var5, var10, var4.field429[this.field1616]);
                if (this.field1608 >= var5) {
                    return;
                }
                this.field1608 = var5 + var5 - this.field1608 - 1;
                this.field1619 = -this.field1619;
            }
            while (true) {
                int var11 = this.method694(arg0, var9, var6, var10, var4.field429[this.field1614 - 1]);
                if (this.field1608 < var6) {
                    return;
                }
                this.field1608 = var6 + var6 - this.field1608 - 1;
                this.field1619 = -this.field1619;
                var9 = this.method702(arg0, var11, var5, var10, var4.field429[this.field1616]);
                if (this.field1608 >= var5) {
                    return;
                }
                this.field1608 = var5 + var5 - this.field1608 - 1;
                this.field1619 = -this.field1619;
            }
        } else if (this.field1619 < 0) {
            while (true) {
                var9 = this.method702(arg0, var9, var5, var10, var4.field429[this.field1614 - 1]);
                if (this.field1608 >= var5) {
                    return;
                }
                this.field1608 = var6 - (var6 - 1 - this.field1608) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method694(arg0, var9, var6, var10, var4.field429[this.field1616]);
                if (this.field1608 < var6) {
                    return;
                }
                this.field1608 = (this.field1608 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I", line = 424)
    public final int method272() {
        return this.field1615 == 0 && this.field1613 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[B[IIIIIIILwd;II)I", line = 431)
    private static final int method683(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10, int arg11, int arg12) {
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
        arg10.field1608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "()V", line = 457)
    private final void method684() {
        this.field1620 = this.field1615;
        this.field1618 = method685(this.field1615, this.field1611);
        this.field1609 = method687(this.field1615, this.field1611);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 462)
    private static final int method685(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()Loj;", line = 467)
    public final class148 method270() {
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I[B[IIIIIIIIIILwd;)I", line = 470)
    private static final int method686(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class108 arg12) {
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
        arg12.field1620 += (var19 - arg4) * arg12.field1607;
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
        arg12.field1618 = var15 >> 2;
        arg12.field1609 = var16 >> 2;
        arg12.field1608 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I", line = 524)
    private static final int method687(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "()Z", line = 527)
    public final boolean method688() {
        return this.field1613 != 0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II[B[IIIIIIIILwd;II)I", line = 531)
    private static final int method689(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
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
        arg11.field1608 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II[B[IIIIIIIILwd;II)I", line = 563)
    private static final int method690(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
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
        arg11.field1608 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V", line = 596)
    private final synchronized void method691(int arg0, int arg1) {
        this.field1615 = arg0;
        this.field1611 = arg1;
        this.field1613 = 0;
        this.method684();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lda;III)Lwd;", line = 604)
    public static final class108 method692(class26 arg0, int arg1, int arg2, int arg3) {
        return arg0.field429 == null || arg0.field429.length == 0 ? null : new class108(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[B[IIIIIIIIIILwd;II)I", line = 610)
    private static final int method693(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class108 arg13, int arg14, int arg15) {
        arg13.field1620 -= arg13.field1607 * arg5;
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
        arg13.field1620 += arg13.field1607 * var27;
        arg13.field1618 = arg6;
        arg13.field1609 = arg7;
        arg13.field1608 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([IIIII)I", line = 653)
    private final int method694(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1613 > 0) {
                int var6 = this.field1613 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1613 += arg1;
                if (this.field1619 == 256 && (this.field1608 & 0xFF) == 0) {
                    if (class37.field591) {
                        arg1 = method679(0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, this.field1617, this.field1606, 0, var6, arg2, this);
                    } else {
                        arg1 = method718(((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, this.field1607, 0, var6, arg2, this);
                    }
                } else if (class37.field591) {
                    arg1 = method693(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, this.field1617, this.field1606, 0, var6, arg2, this, this.field1619, arg4);
                } else {
                    arg1 = method682(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, this.field1607, 0, var6, arg2, this, this.field1619, arg4);
                }
                this.field1613 -= arg1;
                if (this.field1613 != 0) {
                    return arg1;
                }
                if (!this.method699()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1619 == 256 && (this.field1608 & 0xFF) == 0) {
                if (class37.field591) {
                    return method713(0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, 0, arg3, arg2, this);
                }
                return method681(((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, 0, arg3, arg2, this);
            }
            if (class37.field591) {
                return method690(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, 0, arg3, arg2, this, this.field1619, arg4);
            }
            return method683(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, 0, arg3, arg2, this, this.field1619, arg4);
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "()I", line = 710)
    public final synchronized int method695() {
        return this.field1611 < 0 ? -1 : this.field1611;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()I", line = 715)
    public final int method696() {
        int var1 = this.field1620 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1612 == 0) {
            var2 -= this.field1608 * var2 / (((class26) this.field2144).field429.length << 8);
        } else if (this.field1612 >= 0) {
            var2 -= this.field1616 * var2 / ((class26) this.field2144).field429.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "()Z", line = 728)
    public final boolean method697() {
        return this.field1608 < 0 || this.field1608 >= ((class26) this.field2144).field429.length << 8;
    }

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "()I", line = 734)
    public final synchronized int method698() {
        return this.field1619 < 0 ? -this.field1619 : this.field1619;
    }

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "()Z", line = 739)
    private final boolean method699() {
        int var1 = this.field1615;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method685(var1, this.field1611);
            var2 = method687(var1, this.field1611);
        }
        if (this.field1620 != var1 || this.field1618 != var3 || this.field1609 != var2) {
            if (this.field1620 < var1) {
                this.field1607 = 1;
                this.field1613 = var1 - this.field1620;
            } else if (this.field1620 > var1) {
                this.field1607 = -1;
                this.field1613 = this.field1620 - var1;
            } else {
                this.field1607 = 0;
            }
            if (this.field1618 < var3) {
                this.field1617 = 1;
                if (this.field1613 == 0 || this.field1613 > var3 - this.field1618) {
                    this.field1613 = var3 - this.field1618;
                }
            } else if (this.field1618 > var3) {
                this.field1617 = -1;
                if (this.field1613 == 0 || this.field1613 > this.field1618 - var3) {
                    this.field1613 = this.field1618 - var3;
                }
            } else {
                this.field1617 = 0;
            }
            if (this.field1609 < var2) {
                this.field1606 = 1;
                if (this.field1613 == 0 || this.field1613 > var2 - this.field1609) {
                    this.field1613 = var2 - this.field1609;
                }
            } else if (this.field1609 > var2) {
                this.field1606 = -1;
                if (this.field1613 == 0 || this.field1613 > this.field1609 - var2) {
                    this.field1613 = this.field1609 - var2;
                }
            } else {
                this.field1606 = 0;
            }
            return false;
        } else if (this.field1615 == Integer.MIN_VALUE) {
            this.field1615 = 0;
            this.field1620 = this.field1618 = this.field1609 = 0;
            this.method1997(-27381);
            return true;
        } else {
            this.method684();
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V", line = 824)
    public final synchronized void method700(int arg0) {
        this.field1612 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "()I", line = 827)
    public final synchronized int method701() {
        return this.field1615 == Integer.MIN_VALUE ? 0 : this.field1615;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([IIIII)I", line = 830)
    private final int method702(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1613 > 0) {
                int var6 = this.field1613 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1613 += arg1;
                if (this.field1619 == -256 && (this.field1608 & 0xFF) == 0) {
                    if (class37.field591) {
                        arg1 = method686(0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, this.field1617, this.field1606, 0, var6, arg2, this);
                    } else {
                        arg1 = method712(((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, this.field1607, 0, var6, arg2, this);
                    }
                } else if (class37.field591) {
                    arg1 = method717(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, this.field1617, this.field1606, 0, var6, arg2, this, this.field1619, arg4);
                } else {
                    arg1 = method710(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, this.field1607, 0, var6, arg2, this, this.field1619, arg4);
                }
                this.field1613 -= arg1;
                if (this.field1613 != 0) {
                    return arg1;
                }
                if (!this.method699()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1619 == -256 && (this.field1608 & 0xFF) == 0) {
                if (class37.field591) {
                    return method703(0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, 0, arg3, arg2, this);
                }
                return method680(((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, 0, arg3, arg2, this);
            }
            if (class37.field591) {
                return method689(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1618, this.field1609, 0, arg3, arg2, this, this.field1619, arg4);
            }
            return method714(0, 0, ((class26) this.field2144).field429, arg0, this.field1608, arg1, this.field1620, 0, arg3, arg2, this, this.field1619, arg4);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B[IIIIIIIILwd;)I", line = 886)
    private static final int method703(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10) {
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
        arg10.field1608 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V", line = 926)
    public final synchronized void method704(boolean arg0) {
        this.field1619 = (this.field1619 >>> 31) + (this.field1619 ^ this.field1619 >> 31);
        if (arg0) {
            this.field1619 = -this.field1619;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)V", line = 932)
    public final synchronized void method705(int arg0, int arg1) {
        this.method678(arg0, arg1, this.method695());
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V", line = 936)
    public final synchronized void method706(int arg0) {
        this.method691(arg0 << 6, this.method695());
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V", line = 940)
    public final synchronized void method707(int arg0) {
        if (arg0 == 0) {
            this.method716(0);
            this.method1997(-27381);
        } else if (this.field1618 == 0 && this.field1609 == 0) {
            this.field1613 = 0;
            this.field1615 = 0;
            this.field1620 = 0;
            this.method1997(-27381);
        } else {
            int var2 = -this.field1620;
            if (this.field1620 > var2) {
                var2 = this.field1620;
            }
            if (-this.field1618 > var2) {
                var2 = -this.field1618;
            }
            if (this.field1618 > var2) {
                var2 = this.field1618;
            }
            if (-this.field1609 > var2) {
                var2 = -this.field1609;
            }
            if (this.field1609 > var2) {
                var2 = this.field1609;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1613 = arg0;
            this.field1615 = Integer.MIN_VALUE;
            this.field1607 = -this.field1620 / arg0;
            this.field1617 = -this.field1618 / arg0;
            this.field1606 = -this.field1609 / arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()Loj;", line = 985)
    public final class148 method279() {
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "()V", line = 988)
    private final void method708() {
        if (this.field1613 == 0) {
            return;
        }
        if (this.field1615 == Integer.MIN_VALUE) {
            this.field1615 = 0;
        }
        this.field1613 = 0;
        this.method684();
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 1000)
    public final synchronized void method709(int arg0) {
        int var2 = ((class26) this.field2144).field429.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1608 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(II[B[IIIIIIIILwd;II)I", line = 1012)
    private static final int method710(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
        arg11.field1618 -= arg11.field1617 * arg5;
        arg11.field1609 -= arg11.field1606 * arg5;
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
        arg11.field1618 += arg11.field1617 * arg5;
        arg11.field1609 += arg11.field1606 * arg5;
        arg11.field1620 = arg6;
        arg11.field1608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)V", line = 1045)
    public final synchronized void method711(int arg0) {
        if (this.field1619 < 0) {
            this.field1619 = -arg0;
        } else {
            this.field1619 = arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([B[IIIIIIIILwd;)I", line = 1053)
    private static final int method712(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class108 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1618 += (var14 - arg3) * arg9.field1617;
        arg9.field1609 += (var14 - arg3) * arg9.field1606;
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
        arg9.field1620 = var12 >> 2;
        arg9.field1608 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I[B[IIIIIIIILwd;)I", line = 1087)
    private static final int method713(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10) {
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
        arg10.field1608 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II[B[IIIIIIILwd;II)I", line = 1125)
    private static final int method714(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10, int arg11, int arg12) {
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
        arg10.field1608 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lda;II)Lwd;", line = 1153)
    public static final class108 method715(class26 arg0, int arg1, int arg2) {
        return arg0.field429 == null || arg0.field429.length == 0 ? null : new class108(arg0, (int) ((long) arg0.field428 * 256L * (long) arg1 / (long) (class138.field2049 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)V", line = 1159)
    private final synchronized void method716(int arg0) {
        this.method691(arg0, this.method695());
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II[B[IIIIIIIIIILwd;II)I", line = 1166)
    private static final int method717(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class108 arg13, int arg14, int arg15) {
        arg13.field1620 -= arg13.field1607 * arg5;
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
        arg13.field1620 += arg13.field1607 * var26;
        arg13.field1618 = arg6;
        arg13.field1609 = arg7;
        arg13.field1608 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([B[IIIIIIIILwd;)I", line = 1207)
    private static final int method718(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class108 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1618 += (var14 - arg3) * arg9.field1617;
        arg9.field1609 += (var14 - arg3) * arg9.field1606;
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
        arg9.field1620 = var12 >> 2;
        arg9.field1608 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 1241)
    public final synchronized void method274(int arg0) {
        if (this.field1613 > 0) {
            if (arg0 >= this.field1613) {
                if (this.field1615 == Integer.MIN_VALUE) {
                    this.field1615 = 0;
                    this.field1620 = this.field1618 = this.field1609 = 0;
                    this.method1997(-27381);
                    arg0 = this.field1613;
                }
                this.field1613 = 0;
                this.method684();
            } else {
                this.field1620 += this.field1607 * arg0;
                this.field1618 += this.field1617 * arg0;
                this.field1609 += this.field1606 * arg0;
                this.field1613 -= arg0;
            }
        }
        class26 var2 = (class26) this.field2144;
        int var3 = this.field1616 << 8;
        int var4 = this.field1614 << 8;
        int var5 = var2.field429.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1612 = 0;
        }
        if (this.field1608 < 0) {
            if (this.field1619 <= 0) {
                this.method708();
                this.method1997(-27381);
                return;
            }
            this.field1608 = 0;
        }
        if (this.field1608 >= var5) {
            if (this.field1619 >= 0) {
                this.method708();
                this.method1997(-27381);
                return;
            }
            this.field1608 = var5 - 1;
        }
        this.field1608 += this.field1619 * arg0;
        if (this.field1612 >= 0) {
            if (this.field1612 > 0) {
                if (this.field1610) {
                    label121: {
                        if (this.field1619 < 0) {
                            if (this.field1608 >= var3) {
                                return;
                            }
                            this.field1608 = var3 + var3 - this.field1608 - 1;
                            this.field1619 = -this.field1619;
                            if (--this.field1612 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1608 < var4) {
                                return;
                            }
                            this.field1608 = var4 + var4 - this.field1608 - 1;
                            this.field1619 = -this.field1619;
                            if (--this.field1612 == 0) {
                                break;
                            }
                            if (this.field1608 >= var3) {
                                return;
                            }
                            this.field1608 = var3 + var3 - this.field1608 - 1;
                            this.field1619 = -this.field1619;
                        } while (--this.field1612 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1619 < 0) {
                            if (this.field1608 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1608 - 1) / var6;
                            if (var7 >= this.field1612) {
                                this.field1608 += this.field1612 * var6;
                                this.field1612 = 0;
                                break label153;
                            }
                            this.field1608 += var6 * var7;
                            this.field1612 -= var7;
                        } else if (this.field1608 >= var4) {
                            int var8 = (this.field1608 - var3) / var6;
                            if (var8 >= this.field1612) {
                                this.field1608 -= this.field1612 * var6;
                                this.field1612 = 0;
                                break label153;
                            }
                            this.field1608 -= var6 * var8;
                            this.field1612 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1619 < 0) {
                if (this.field1608 < 0) {
                    this.field1608 = -1;
                    this.method708();
                    this.method1997(-27381);
                }
            } else if (this.field1608 >= var5) {
                this.field1608 = var5;
                this.method708();
                this.method1997(-27381);
            }
        } else if (this.field1610) {
            if (this.field1619 < 0) {
                if (this.field1608 >= var3) {
                    return;
                }
                this.field1608 = var3 + var3 - this.field1608 - 1;
                this.field1619 = -this.field1619;
            }
            while (this.field1608 >= var4) {
                this.field1608 = var4 + var4 - this.field1608 - 1;
                this.field1619 = -this.field1619;
                if (this.field1608 >= var3) {
                    return;
                }
                this.field1608 = var3 + var3 - this.field1608 - 1;
                this.field1619 = -this.field1619;
            }
        } else if (this.field1619 < 0) {
            if (this.field1608 >= var3) {
                return;
            }
            this.field1608 = var4 - (var4 - 1 - this.field1608) % var6 - 1;
        } else if (this.field1608 >= var4) {
            this.field1608 = (this.field1608 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lda;II)V", line = 1458)
    private class108(class26 arg0, int arg1, int arg2) {
        this.field2144 = arg0;
        this.field1616 = arg0.field426;
        this.field1614 = arg0.field427;
        this.field1610 = arg0.field425;
        this.field1619 = arg1;
        this.field1615 = arg2;
        this.field1611 = 8192;
        this.field1608 = 0;
        this.method684();
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lda;III)V", line = 1469)
    private class108(class26 arg0, int arg1, int arg2, int arg3) {
        this.field2144 = arg0;
        this.field1616 = arg0.field426;
        this.field1614 = arg0.field427;
        this.field1610 = arg0.field425;
        this.field1619 = arg1;
        this.field1615 = arg2;
        this.field1611 = arg3;
        this.field1608 = 0;
        this.method684();
    }
}
