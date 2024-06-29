import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class94 extends class189 {

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Z")
    private boolean field1611;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 3)
    public final synchronized void method699(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method728(arg1, arg2);
            return;
        }
        int var4 = method738(arg1, arg2);
        int var5 = method719(arg1, arg2);
        if (this.field1618 == var4 && this.field1614 == var5) {
            this.field1609 = 0;
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
        if (var5 - this.field1614 > var6) {
            var6 = var5 - this.field1614;
        }
        if (this.field1614 - var5 > var6) {
            var6 = this.field1614 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1609 = arg0;
        this.field1613 = arg1;
        this.field1619 = arg2;
        this.field1612 = (arg1 - this.field1620) / arg0;
        this.field1615 = (var4 - this.field1618) / arg0;
        this.field1608 = (var5 - this.field1614) / arg0;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()Lci;", line = 49)
    public final class189 method365() {
        return null;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 52)
    public final synchronized void method700(int arg0) {
        this.field1616 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([B[IIIIIIILqb;)I", line = 56)
    private static final int method701(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8) {
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
        arg8.field1617 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lmi;III)Lqb;", line = 81)
    public static final class94 method702(class257 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4383 == null || arg0.field4383.length == 0 ? null : new class94(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V", line = 90)
    public final synchronized void method703(int arg0) {
        if (arg0 == 0) {
            this.method706(0);
            this.method1502((byte) -82);
        } else if (this.field1618 == 0 && this.field1614 == 0) {
            this.field1609 = 0;
            this.field1613 = 0;
            this.field1620 = 0;
            this.method1502((byte) -82);
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
            if (-this.field1614 > var2) {
                var2 = -this.field1614;
            }
            if (this.field1614 > var2) {
                var2 = this.field1614;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1609 = arg0;
            this.field1613 = Integer.MIN_VALUE;
            this.field1612 = -this.field1620 / arg0;
            this.field1615 = -this.field1618 / arg0;
            this.field1608 = -this.field1614 / arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B[IIIIIIIILqb;)I", line = 139)
    private static final int method704(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10) {
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
        arg10.field1617 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()V", line = 177)
    private final void method705() {
        this.field1620 = this.field1613;
        this.field1618 = method738(this.field1613, this.field1619);
        this.field1614 = method719(this.field1613, this.field1619);
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V", line = 185)
    private final synchronized void method706(int arg0) {
        this.method728(arg0, this.method715());
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 189)
    public final synchronized void method369(int arg0) {
        if (this.field1609 > 0) {
            if (arg0 >= this.field1609) {
                if (this.field1613 == Integer.MIN_VALUE) {
                    this.field1613 = 0;
                    this.field1620 = this.field1618 = this.field1614 = 0;
                    this.method1502((byte) -82);
                    arg0 = this.field1609;
                }
                this.field1609 = 0;
                this.method705();
            } else {
                this.field1620 += this.field1612 * arg0;
                this.field1618 += this.field1615 * arg0;
                this.field1614 += this.field1608 * arg0;
                this.field1609 -= arg0;
            }
        }
        class257 var2 = (class257) this.field3032;
        int var3 = this.field1610 << 8;
        int var4 = this.field1606 << 8;
        int var5 = var2.field4383.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1616 = 0;
        }
        if (this.field1617 < 0) {
            if (this.field1607 <= 0) {
                this.method737();
                this.method1502((byte) -82);
                return;
            }
            this.field1617 = 0;
        }
        if (this.field1617 >= var5) {
            if (this.field1607 >= 0) {
                this.method737();
                this.method1502((byte) -82);
                return;
            }
            this.field1617 = var5 - 1;
        }
        this.field1617 += this.field1607 * arg0;
        if (this.field1616 >= 0) {
            if (this.field1616 > 0) {
                if (this.field1611) {
                    label121: {
                        if (this.field1607 < 0) {
                            if (this.field1617 >= var3) {
                                return;
                            }
                            this.field1617 = var3 + var3 - this.field1617 - 1;
                            this.field1607 = -this.field1607;
                            if (--this.field1616 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1617 < var4) {
                                return;
                            }
                            this.field1617 = var4 + var4 - this.field1617 - 1;
                            this.field1607 = -this.field1607;
                            if (--this.field1616 == 0) {
                                break;
                            }
                            if (this.field1617 >= var3) {
                                return;
                            }
                            this.field1617 = var3 + var3 - this.field1617 - 1;
                            this.field1607 = -this.field1607;
                        } while (--this.field1616 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1607 < 0) {
                            if (this.field1617 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1617 - 1) / var6;
                            if (var7 >= this.field1616) {
                                this.field1617 += this.field1616 * var6;
                                this.field1616 = 0;
                                break label153;
                            }
                            this.field1617 += var6 * var7;
                            this.field1616 -= var7;
                        } else if (this.field1617 >= var4) {
                            int var8 = (this.field1617 - var3) / var6;
                            if (var8 >= this.field1616) {
                                this.field1617 -= this.field1616 * var6;
                                this.field1616 = 0;
                                break label153;
                            }
                            this.field1617 -= var6 * var8;
                            this.field1616 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1607 < 0) {
                if (this.field1617 < 0) {
                    this.field1617 = -1;
                    this.method737();
                    this.method1502((byte) -82);
                }
            } else if (this.field1617 >= var5) {
                this.field1617 = var5;
                this.method737();
                this.method1502((byte) -82);
            }
        } else if (this.field1611) {
            if (this.field1607 < 0) {
                if (this.field1617 >= var3) {
                    return;
                }
                this.field1617 = var3 + var3 - this.field1617 - 1;
                this.field1607 = -this.field1607;
            }
            while (this.field1617 >= var4) {
                this.field1617 = var4 + var4 - this.field1617 - 1;
                this.field1607 = -this.field1607;
                if (this.field1617 >= var3) {
                    return;
                }
                this.field1617 = var3 + var3 - this.field1617 - 1;
                this.field1607 = -this.field1607;
            }
        } else if (this.field1607 < 0) {
            if (this.field1617 >= var3) {
                return;
            }
            this.field1617 = var4 - (var4 - 1 - this.field1617) % var6 - 1;
        } else if (this.field1617 >= var4) {
            this.field1617 = (this.field1617 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[B[IIIIIIIILqb;II)I", line = 407)
    private static final int method707(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
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
        arg11.field1617 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II[B[IIIIIIIILqb;II)I", line = 440)
    private static final int method708(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
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
        arg11.field1617 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B[IIIIIIIIIILqb;)I", line = 472)
    private static final int method709(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class94 arg12) {
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
        arg12.field1620 += (var19 - arg4) * arg12.field1612;
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
        arg12.field1614 = var16 >> 2;
        arg12.field1617 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V", line = 525)
    public final synchronized void method710(int arg0) {
        this.method728(arg0 << 6, this.method715());
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "()Z", line = 529)
    public final boolean method711() {
        return this.field1617 < 0 || this.field1617 >= ((class257) this.field3032).field4383.length << 8;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 533)
    public final synchronized void method712(boolean arg0) {
        this.field1607 = (this.field1607 >>> 31) + (this.field1607 ^ this.field1607 >> 31);
        if (arg0) {
            this.field1607 = -this.field1607;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II[B[IIIIIIIILqb;II)I", line = 541)
    private static final int method713(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
        arg11.field1618 -= arg11.field1615 * arg5;
        arg11.field1614 -= arg11.field1608 * arg5;
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
        arg11.field1618 += arg11.field1615 * arg5;
        arg11.field1614 += arg11.field1608 * arg5;
        arg11.field1620 = arg6;
        arg11.field1617 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lci;", line = 574)
    public final class189 method374() {
        return null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([IIIII)I", line = 579)
    private final int method714(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1609 > 0) {
                int var6 = this.field1609 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1609 += arg1;
                if (this.field1607 == 256 && (this.field1617 & 0xFF) == 0) {
                    if (class88.field1462) {
                        arg1 = method709(0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, this.field1615, this.field1608, 0, var6, arg2, this);
                    } else {
                        arg1 = method718(((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, this.field1612, 0, var6, arg2, this);
                    }
                } else if (class88.field1462) {
                    arg1 = method726(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, this.field1615, this.field1608, 0, var6, arg2, this, this.field1607, arg4);
                } else {
                    arg1 = method713(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, this.field1612, 0, var6, arg2, this, this.field1607, arg4);
                }
                this.field1609 -= arg1;
                if (this.field1609 != 0) {
                    return arg1;
                }
                if (!this.method723()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1607 == 256 && (this.field1617 & 0xFF) == 0) {
                if (class88.field1462) {
                    return method717(0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, 0, arg3, arg2, this);
                }
                return method732(((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, 0, arg3, arg2, this);
            }
            if (class88.field1462) {
                return method707(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, 0, arg3, arg2, this, this.field1607, arg4);
            }
            return method730(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, 0, arg3, arg2, this, this.field1607, arg4);
        }
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "()I", line = 634)
    public final synchronized int method715() {
        return this.field1619 < 0 ? -1 : this.field1619;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lmi;II)Lqb;", line = 637)
    public static final class94 method716(class257 arg0, int arg1, int arg2) {
        return arg0.field4383 == null || arg0.field4383.length == 0 ? null : new class94(arg0, (int) ((long) arg0.field4382 * 256L * (long) arg1 / (long) (class92.field1584 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I[B[IIIIIIIILqb;)I", line = 643)
    private static final int method717(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10) {
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
        arg10.field1617 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([B[IIIIIIIILqb;)I", line = 683)
    private static final int method718(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class94 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1618 += (var14 - arg3) * arg9.field1615;
        arg9.field1614 += (var14 - arg3) * arg9.field1608;
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
        arg9.field1617 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)I", line = 717)
    private static final int method719(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(II[B[IIIIIIIILqb;II)I", line = 721)
    private static final int method720(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
        arg11.field1618 -= arg11.field1615 * arg5;
        arg11.field1614 -= arg11.field1608 * arg5;
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
        arg11.field1618 += arg11.field1615 * arg5;
        arg11.field1614 += arg11.field1608 * arg5;
        arg11.field1620 = arg6;
        arg11.field1617 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I[B[IIIIIIIIIILqb;)I", line = 754)
    private static final int method721(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class94 arg12) {
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
        arg12.field1620 += (var19 - arg4) * arg12.field1612;
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
        arg12.field1614 = var16 >> 2;
        arg12.field1617 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 808)
    public final synchronized void method722(int arg0, int arg1) {
        this.method699(arg0, arg1, this.method715());
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "()Z", line = 813)
    private final boolean method723() {
        int var1 = this.field1613;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method738(var1, this.field1619);
            var2 = method719(var1, this.field1619);
        }
        if (this.field1620 != var1 || this.field1618 != var3 || this.field1614 != var2) {
            if (this.field1620 < var1) {
                this.field1612 = 1;
                this.field1609 = var1 - this.field1620;
            } else if (this.field1620 > var1) {
                this.field1612 = -1;
                this.field1609 = this.field1620 - var1;
            } else {
                this.field1612 = 0;
            }
            if (this.field1618 < var3) {
                this.field1615 = 1;
                if (this.field1609 == 0 || this.field1609 > var3 - this.field1618) {
                    this.field1609 = var3 - this.field1618;
                }
            } else if (this.field1618 > var3) {
                this.field1615 = -1;
                if (this.field1609 == 0 || this.field1609 > this.field1618 - var3) {
                    this.field1609 = this.field1618 - var3;
                }
            } else {
                this.field1615 = 0;
            }
            if (this.field1614 < var2) {
                this.field1608 = 1;
                if (this.field1609 == 0 || this.field1609 > var2 - this.field1614) {
                    this.field1609 = var2 - this.field1614;
                }
            } else if (this.field1614 > var2) {
                this.field1608 = -1;
                if (this.field1609 == 0 || this.field1609 > this.field1614 - var2) {
                    this.field1609 = this.field1614 - var2;
                }
            } else {
                this.field1608 = 0;
            }
            return false;
        } else if (this.field1613 == Integer.MIN_VALUE) {
            this.field1613 = 0;
            this.field1620 = this.field1618 = this.field1614 = 0;
            this.method1502((byte) -82);
            return true;
        } else {
            this.method705();
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[B[IIIIIIIIIILqb;II)I", line = 898)
    private static final int method724(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        arg13.field1620 -= arg13.field1612 * arg5;
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
        arg13.field1620 += arg13.field1612 * var26;
        arg13.field1618 = arg6;
        arg13.field1614 = arg7;
        arg13.field1617 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "()I", line = 939)
    public final synchronized int method725() {
        return this.field1613 == Integer.MIN_VALUE ? 0 : this.field1613;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II[B[IIIIIIIIIILqb;II)I", line = 942)
    private static final int method726(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        arg13.field1620 -= arg13.field1612 * arg5;
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
        arg13.field1620 += arg13.field1612 * var27;
        arg13.field1618 = arg6;
        arg13.field1614 = arg7;
        arg13.field1617 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "()I", line = 984)
    public final synchronized int method727() {
        return this.field1607 < 0 ? -this.field1607 : this.field1607;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)V", line = 987)
    private final synchronized void method728(int arg0, int arg1) {
        this.field1613 = arg0;
        this.field1619 = arg1;
        this.field1609 = 0;
        this.method705();
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V", line = 995)
    public final synchronized void method729(int arg0) {
        if (this.field1607 < 0) {
            this.field1607 = -arg0;
        } else {
            this.field1607 = arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[B[IIIIIIILqb;II)I", line = 1002)
    private static final int method730(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, int arg11, int arg12) {
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
        arg10.field1617 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "(I)V", line = 1030)
    public final synchronized void method731(int arg0) {
        int var2 = ((class257) this.field3032).field4383.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1617 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([B[IIIIIIILqb;)I", line = 1041)
    private static final int method732(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8) {
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
        arg8.field1617 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([B[IIIIIIIILqb;)I", line = 1069)
    private static final int method733(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class94 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1618 += (var14 - arg3) * arg9.field1615;
        arg9.field1614 += (var14 - arg3) * arg9.field1608;
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
        arg9.field1617 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II[B[IIIIIIILqb;II)I", line = 1104)
    private static final int method734(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, int arg11, int arg12) {
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
        arg10.field1617 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()I", line = 1131)
    public final int method735() {
        int var1 = this.field1620 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1616 == 0) {
            var2 -= this.field1617 * var2 / (((class257) this.field3032).field4383.length << 8);
        } else if (this.field1616 >= 0) {
            var2 -= this.field1610 * var2 / ((class257) this.field3032).field4383.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([IIIII)I", line = 1144)
    private final int method736(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1609 > 0) {
                int var6 = this.field1609 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1609 += arg1;
                if (this.field1607 == -256 && (this.field1617 & 0xFF) == 0) {
                    if (class88.field1462) {
                        arg1 = method721(0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, this.field1615, this.field1608, 0, var6, arg2, this);
                    } else {
                        arg1 = method733(((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, this.field1612, 0, var6, arg2, this);
                    }
                } else if (class88.field1462) {
                    arg1 = method724(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, this.field1615, this.field1608, 0, var6, arg2, this, this.field1607, arg4);
                } else {
                    arg1 = method720(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, this.field1612, 0, var6, arg2, this, this.field1607, arg4);
                }
                this.field1609 -= arg1;
                if (this.field1609 != 0) {
                    return arg1;
                }
                if (!this.method723()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1607 == -256 && (this.field1617 & 0xFF) == 0) {
                if (class88.field1462) {
                    return method704(0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, 0, arg3, arg2, this);
                }
                return method701(((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, 0, arg3, arg2, this);
            }
            if (class88.field1462) {
                return method708(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1618, this.field1614, 0, arg3, arg2, this, this.field1607, arg4);
            }
            return method734(0, 0, ((class257) this.field3032).field4383, arg0, this.field1617, arg1, this.field1620, 0, arg3, arg2, this, this.field1607, arg4);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()I", line = 1199)
    public final int method368() {
        return this.field1613 == 0 && this.field1609 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "()V", line = 1206)
    private final void method737() {
        if (this.field1609 == 0) {
            return;
        }
        if (this.field1613 == Integer.MIN_VALUE) {
            this.field1613 = 0;
        }
        this.field1609 = 0;
        this.method705();
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lmi;II)V", line = 1217)
    private class94(class257 arg0, int arg1, int arg2) {
        this.field3032 = arg0;
        this.field1610 = arg0.field4379;
        this.field1606 = arg0.field4381;
        this.field1611 = arg0.field4380;
        this.field1607 = arg1;
        this.field1613 = arg2;
        this.field1619 = 8192;
        this.field1617 = 0;
        this.method705();
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(II)I", line = 1229)
    private static final int method738(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lmi;III)V", line = 1231)
    private class94(class257 arg0, int arg1, int arg2, int arg3) {
        this.field3032 = arg0;
        this.field1610 = arg0.field4379;
        this.field1606 = arg0.field4381;
        this.field1611 = arg0.field4380;
        this.field1607 = arg1;
        this.field1613 = arg2;
        this.field1619 = arg3;
        this.field1617 = 0;
        this.method705();
    }

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "()Z", line = 1243)
    public final boolean method739() {
        return this.field1609 != 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)V", line = 1246)
    public final synchronized void method364(int[] arg0, int arg1, int arg2) {
        if (this.field1613 == 0 && this.field1609 == 0) {
            this.method369(arg2);
            return;
        }
        class257 var4 = (class257) this.field3032;
        int var5 = this.field1610 << 8;
        int var6 = this.field1606 << 8;
        int var7 = var4.field4383.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1616 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1617 < 0) {
            if (this.field1607 <= 0) {
                this.method737();
                this.method1502((byte) -82);
                return;
            }
            this.field1617 = 0;
        }
        if (this.field1617 >= var7) {
            if (this.field1607 >= 0) {
                this.method737();
                this.method1502((byte) -82);
                return;
            }
            this.field1617 = var7 - 1;
        }
        if (this.field1616 >= 0) {
            if (this.field1616 > 0) {
                if (this.field1611) {
                    label131: {
                        if (this.field1607 < 0) {
                            var9 = this.method736(arg0, arg1, var5, var10, var4.field4383[this.field1610]);
                            if (this.field1617 >= var5) {
                                return;
                            }
                            this.field1617 = var5 + var5 - this.field1617 - 1;
                            this.field1607 = -this.field1607;
                            if (--this.field1616 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method714(arg0, var9, var6, var10, var4.field4383[this.field1606 - 1]);
                            if (this.field1617 < var6) {
                                return;
                            }
                            this.field1617 = var6 + var6 - this.field1617 - 1;
                            this.field1607 = -this.field1607;
                            if (--this.field1616 == 0) {
                                break;
                            }
                            var9 = this.method736(arg0, var9, var5, var10, var4.field4383[this.field1610]);
                            if (this.field1617 >= var5) {
                                return;
                            }
                            this.field1617 = var5 + var5 - this.field1617 - 1;
                            this.field1607 = -this.field1607;
                        } while (--this.field1616 != 0);
                    }
                } else if (this.field1607 < 0) {
                    while (true) {
                        var9 = this.method736(arg0, var9, var5, var10, var4.field4383[this.field1606 - 1]);
                        if (this.field1617 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1617 - 1) / var8;
                        if (var12 >= this.field1616) {
                            this.field1617 += this.field1616 * var8;
                            this.field1616 = 0;
                            break;
                        }
                        this.field1617 += var8 * var12;
                        this.field1616 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method714(arg0, var9, var6, var10, var4.field4383[this.field1610]);
                        if (this.field1617 < var6) {
                            return;
                        }
                        int var13 = (this.field1617 - var5) / var8;
                        if (var13 >= this.field1616) {
                            this.field1617 -= this.field1616 * var8;
                            this.field1616 = 0;
                            break;
                        }
                        this.field1617 -= var8 * var13;
                        this.field1616 -= var13;
                    }
                }
            }
            if (this.field1607 < 0) {
                this.method736(arg0, var9, 0, var10, 0);
                if (this.field1617 < 0) {
                    this.field1617 = -1;
                    this.method737();
                    this.method1502((byte) -82);
                }
            } else {
                this.method714(arg0, var9, var7, var10, 0);
                if (this.field1617 >= var7) {
                    this.field1617 = var7;
                    this.method737();
                    this.method1502((byte) -82);
                }
            }
        } else if (this.field1611) {
            if (this.field1607 < 0) {
                var9 = this.method736(arg0, arg1, var5, var10, var4.field4383[this.field1610]);
                if (this.field1617 >= var5) {
                    return;
                }
                this.field1617 = var5 + var5 - this.field1617 - 1;
                this.field1607 = -this.field1607;
            }
            while (true) {
                int var11 = this.method714(arg0, var9, var6, var10, var4.field4383[this.field1606 - 1]);
                if (this.field1617 < var6) {
                    return;
                }
                this.field1617 = var6 + var6 - this.field1617 - 1;
                this.field1607 = -this.field1607;
                var9 = this.method736(arg0, var11, var5, var10, var4.field4383[this.field1610]);
                if (this.field1617 >= var5) {
                    return;
                }
                this.field1617 = var5 + var5 - this.field1617 - 1;
                this.field1607 = -this.field1607;
            }
        } else if (this.field1607 < 0) {
            while (true) {
                var9 = this.method736(arg0, var9, var5, var10, var4.field4383[this.field1606 - 1]);
                if (this.field1617 >= var5) {
                    return;
                }
                this.field1617 = var6 - (var6 - 1 - this.field1617) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method714(arg0, var9, var6, var10, var4.field4383[this.field1610]);
                if (this.field1617 < var6) {
                    return;
                }
                this.field1617 = (this.field1617 - var5) % var8 + var5;
            }
        }
    }
}
