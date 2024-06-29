import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class245 extends class555 {

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Z")
    private boolean field3694;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    private int field3696;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    private int field3701;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    private int field3705;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    private int field3692;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    private int field3693;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    private final synchronized void method1621(int arg0) {
        this.method1635(arg0, this.method1651());
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public final synchronized void method1622(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1635(arg1, arg2);
        } else {
            int var4 = method1629(arg1, arg2);
            int var5 = method1627(arg1, arg2);
            if (this.field3695 == var4 && this.field3700 == var5) {
                this.field3693 = 0;
            } else {
                int var6 = arg1 - this.field3691;
                if (this.field3691 - arg1 > var6) {
                    var6 = this.field3691 - arg1;
                }
                if (var4 - this.field3695 > var6) {
                    var6 = var4 - this.field3695;
                }
                if (this.field3695 - var4 > var6) {
                    var6 = this.field3695 - var4;
                }
                if (var5 - this.field3700 > var6) {
                    var6 = var5 - this.field3700;
                }
                if (this.field3700 - var5 > var6) {
                    var6 = this.field3700 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3693 = arg0;
                this.field3701 = arg1;
                this.field3705 = arg2;
                this.field3698 = (arg1 - this.field3691) / arg0;
                this.field3703 = (var4 - this.field3695) / arg0;
                this.field3692 = (var5 - this.field3700) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
    public final int method193() {
        return this.field3701 == 0 && this.field3693 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()Loea;")
    public final class555 method227() {
        return null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I")
    public final int method1623() {
        int var1 = this.field3691 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3699 == 0) {
            var2 -= this.field3702 * var2 / (((class630) super.field7864).field9079.length << 8);
        } else if (this.field3699 >= 0) {
            var2 -= this.field3704 * var2 / ((class630) super.field7864).field9079.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B[IIIIIIIILcl;)I")
    private static final int method1624(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10) {
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
        arg10.field3702 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[B[IIIIIIIIIILcl;II)I")
    private static final int method1625(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class245 arg13, int arg14, int arg15) {
        arg13.field3691 -= arg13.field3698 * arg5;
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
        arg13.field3691 += arg13.field3698 * var22;
        arg13.field3695 = arg6;
        arg13.field3700 = arg7;
        arg13.field3702 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "()Z")
    public final boolean method1626() {
        return this.field3702 < 0 || this.field3702 >= ((class630) super.field7864).field9079.length << 8;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
    private static final int method1627(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lee;III)Lcl;")
    public static final class245 method1628(class630 arg0, int arg1, int arg2, int arg3) {
        return arg0.field9079 != null && arg0.field9079.length != 0 ? new class245(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)I")
    private static final int method1629(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()Loea;")
    public final class555 method233() {
        return null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([IIIII)I")
    private final int method1630(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3693 <= 0) {
                if (this.field3696 == 256 && (this.field3702 & 255) == 0) {
                    if (class238.field3527) {
                        return method1640(0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, 0, arg3, arg2, this);
                    }
                    return method1637(((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, 0, arg3, arg2, this);
                }
                if (class238.field3527) {
                    return method1639(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, 0, arg3, arg2, this, this.field3696, arg4);
                }
                return method1641(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, 0, arg3, arg2, this, this.field3696, arg4);
            }
            int var6 = this.field3693 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3693 += arg1;
            if (this.field3696 == 256 && (this.field3702 & 255) == 0) {
                if (class238.field3527) {
                    arg1 = method1645(0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, this.field3703, this.field3692, 0, var6, arg2, this);
                } else {
                    arg1 = method1660(((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, this.field3698, 0, var6, arg2, this);
                }
            } else if (class238.field3527) {
                arg1 = method1654(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, this.field3703, this.field3692, 0, var6, arg2, this, this.field3696, arg4);
            } else {
                arg1 = method1642(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, this.field3698, 0, var6, arg2, this, this.field3696, arg4);
            }
            this.field3693 -= arg1;
            if (this.field3693 != 0) {
                return arg1;
            }
        } while (!this.method1649());
        return arg3;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
    public final synchronized void method1631(int arg0) {
        if (arg0 == 0) {
            this.method1621(0);
            this.method2588(300);
        } else if (this.field3695 == 0 && this.field3700 == 0) {
            this.field3693 = 0;
            this.field3701 = 0;
            this.field3691 = 0;
            this.method2588(300);
        } else {
            int var2 = -this.field3691;
            if (this.field3691 > var2) {
                var2 = this.field3691;
            }
            if (-this.field3695 > var2) {
                var2 = -this.field3695;
            }
            if (this.field3695 > var2) {
                var2 = this.field3695;
            }
            if (-this.field3700 > var2) {
                var2 = -this.field3700;
            }
            if (this.field3700 > var2) {
                var2 = this.field3700;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3693 = arg0;
            this.field3701 = Integer.MIN_VALUE;
            this.field3698 = -this.field3691 / arg0;
            this.field3703 = -this.field3695 / arg0;
            this.field3692 = -this.field3700 / arg0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B[IIIIIIIIIILcl;)I")
    private static final int method1632(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class245 arg12) {
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
        arg12.field3691 += (var19 - arg4) * arg12.field3698;
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
        arg12.field3695 = var15 >> 2;
        arg12.field3700 = var16 >> 2;
        arg12.field3702 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([B[IIIIIIIILcl;)I")
    private static final int method1633(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class245 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3695 += (var14 - arg3) * arg9.field3703;
        arg9.field3700 += (var14 - arg3) * arg9.field3692;
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
        arg9.field3691 = var12 >> 2;
        arg9.field3702 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([III)V")
    public final synchronized void method224(int[] arg0, int arg1, int arg2) {
        if (this.field3701 == 0 && this.field3693 == 0) {
            this.method204(arg2);
        } else {
            class630 var4 = (class630) super.field7864;
            int var5 = this.field3704 << 8;
            int var6 = this.field3697 << 8;
            int var7 = var4.field9079.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3699 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3702 < 0) {
                if (this.field3696 <= 0) {
                    this.method1636();
                    this.method2588(300);
                    return;
                }
                this.field3702 = 0;
            }
            if (this.field3702 >= var7) {
                if (this.field3696 >= 0) {
                    this.method1636();
                    this.method2588(300);
                    return;
                }
                this.field3702 = var7 - 1;
            }
            if (this.field3699 < 0) {
                if (this.field3694) {
                    if (this.field3696 < 0) {
                        var9 = this.method1644(arg0, arg1, var5, var10, var4.field9079[this.field3704]);
                        if (this.field3702 >= var5) {
                            return;
                        }
                        this.field3702 = var5 + var5 - 1 - this.field3702;
                        this.field3696 = -this.field3696;
                    }
                    while (true) {
                        int var11 = this.method1630(arg0, var9, var6, var10, var4.field9079[this.field3697 - 1]);
                        if (this.field3702 < var6) {
                            return;
                        }
                        this.field3702 = var6 + var6 - 1 - this.field3702;
                        this.field3696 = -this.field3696;
                        var9 = this.method1644(arg0, var11, var5, var10, var4.field9079[this.field3704]);
                        if (this.field3702 >= var5) {
                            return;
                        }
                        this.field3702 = var5 + var5 - 1 - this.field3702;
                        this.field3696 = -this.field3696;
                    }
                } else if (this.field3696 < 0) {
                    while (true) {
                        var9 = this.method1644(arg0, var9, var5, var10, var4.field9079[this.field3697 - 1]);
                        if (this.field3702 >= var5) {
                            return;
                        }
                        this.field3702 = var6 - 1 - (var6 - 1 - this.field3702) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1630(arg0, var9, var6, var10, var4.field9079[this.field3704]);
                        if (this.field3702 < var6) {
                            return;
                        }
                        this.field3702 = (this.field3702 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3699 > 0) {
                    if (this.field3694) {
                        label130: {
                            if (this.field3696 < 0) {
                                var9 = this.method1644(arg0, arg1, var5, var10, var4.field9079[this.field3704]);
                                if (this.field3702 >= var5) {
                                    return;
                                }
                                this.field3702 = var5 + var5 - 1 - this.field3702;
                                this.field3696 = -this.field3696;
                                if (--this.field3699 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1630(arg0, var9, var6, var10, var4.field9079[this.field3697 - 1]);
                                if (this.field3702 < var6) {
                                    return;
                                }
                                this.field3702 = var6 + var6 - 1 - this.field3702;
                                this.field3696 = -this.field3696;
                                if (--this.field3699 == 0) {
                                    break;
                                }
                                var9 = this.method1644(arg0, var9, var5, var10, var4.field9079[this.field3704]);
                                if (this.field3702 >= var5) {
                                    return;
                                }
                                this.field3702 = var5 + var5 - 1 - this.field3702;
                                this.field3696 = -this.field3696;
                            } while (--this.field3699 != 0);
                        }
                    } else if (this.field3696 < 0) {
                        while (true) {
                            var9 = this.method1644(arg0, var9, var5, var10, var4.field9079[this.field3697 - 1]);
                            if (this.field3702 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3702) / var8;
                            if (var12 >= this.field3699) {
                                this.field3702 += this.field3699 * var8;
                                this.field3699 = 0;
                                break;
                            }
                            this.field3702 += var8 * var12;
                            this.field3699 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1630(arg0, var9, var6, var10, var4.field9079[this.field3704]);
                            if (this.field3702 < var6) {
                                return;
                            }
                            int var13 = (this.field3702 - var5) / var8;
                            if (var13 >= this.field3699) {
                                this.field3702 -= this.field3699 * var8;
                                this.field3699 = 0;
                                break;
                            }
                            this.field3702 -= var8 * var13;
                            this.field3699 -= var13;
                        }
                    }
                }
                if (this.field3696 < 0) {
                    this.method1644(arg0, var9, 0, var10, 0);
                    if (this.field3702 < 0) {
                        this.field3702 = -1;
                        this.method1636();
                        this.method2588(300);
                        return;
                    }
                } else {
                    this.method1630(arg0, var9, var7, var10, 0);
                    if (this.field3702 >= var7) {
                        this.field3702 = var7;
                        this.method1636();
                        this.method2588(300);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([B[IIIIIIILcl;)I")
    private static final int method1634(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class245 arg8) {
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
        arg8.field3702 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)V")
    private final synchronized void method1635(int arg0, int arg1) {
        this.field3701 = arg0;
        this.field3705 = arg1;
        this.field3693 = 0;
        this.method1646();
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "()V")
    private final void method1636() {
        if (this.field3693 != 0) {
            if (this.field3701 == Integer.MIN_VALUE) {
                this.field3701 = 0;
            }
            this.field3693 = 0;
            this.method1646();
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "([B[IIIIIIILcl;)I")
    private static final int method1637(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class245 arg8) {
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
        arg8.field3702 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "()I")
    public final synchronized int method1638() {
        return this.field3696 < 0 ? -this.field3696 : this.field3696;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[B[IIIIIIIILcl;II)I")
    private static final int method1639(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
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
        arg11.field3702 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I[B[IIIIIIIILcl;)I")
    private static final int method1640(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10) {
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
        arg10.field3702 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[B[IIIIIIILcl;II)I")
    private static final int method1641(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10, int arg11, int arg12) {
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
        arg10.field3702 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II[B[IIIIIIIILcl;II)I")
    private static final int method1642(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
        arg11.field3695 -= arg11.field3703 * arg5;
        arg11.field3700 -= arg11.field3692 * arg5;
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
        arg11.field3695 += arg11.field3703 * arg5;
        arg11.field3700 += arg11.field3692 * arg5;
        arg11.field3691 = arg6;
        arg11.field3702 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final synchronized void method204(int arg0) {
        if (this.field3693 > 0) {
            if (arg0 >= this.field3693) {
                if (this.field3701 == Integer.MIN_VALUE) {
                    this.field3701 = 0;
                    this.field3691 = this.field3695 = this.field3700 = 0;
                    this.method2588(300);
                    arg0 = this.field3693;
                }
                this.field3693 = 0;
                this.method1646();
            } else {
                this.field3691 += this.field3698 * arg0;
                this.field3695 += this.field3703 * arg0;
                this.field3700 += this.field3692 * arg0;
                this.field3693 -= arg0;
            }
        }
        class630 var2 = (class630) super.field7864;
        int var3 = this.field3704 << 8;
        int var4 = this.field3697 << 8;
        int var5 = var2.field9079.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3699 = 0;
        }
        if (this.field3702 < 0) {
            if (this.field3696 <= 0) {
                this.method1636();
                this.method2588(300);
                return;
            }
            this.field3702 = 0;
        }
        if (this.field3702 >= var5) {
            if (this.field3696 >= 0) {
                this.method1636();
                this.method2588(300);
                return;
            }
            this.field3702 = var5 - 1;
        }
        this.field3702 += this.field3696 * arg0;
        if (this.field3699 < 0) {
            if (!this.field3694) {
                if (this.field3696 < 0) {
                    if (this.field3702 < var3) {
                        this.field3702 = var4 - 1 - (var4 - 1 - this.field3702) % var6;
                    }
                } else if (this.field3702 >= var4) {
                    this.field3702 = (this.field3702 - var3) % var6 + var3;
                }
            } else {
                if (this.field3696 < 0) {
                    if (this.field3702 >= var3) {
                        return;
                    }
                    this.field3702 = var3 + var3 - 1 - this.field3702;
                    this.field3696 = -this.field3696;
                }
                while (this.field3702 >= var4) {
                    this.field3702 = var4 + var4 - 1 - this.field3702;
                    this.field3696 = -this.field3696;
                    if (this.field3702 >= var3) {
                        return;
                    }
                    this.field3702 = var3 + var3 - 1 - this.field3702;
                    this.field3696 = -this.field3696;
                }
            }
        } else {
            if (this.field3699 > 0) {
                if (this.field3694) {
                    label125: {
                        if (this.field3696 < 0) {
                            if (this.field3702 >= var3) {
                                return;
                            }
                            this.field3702 = var3 + var3 - 1 - this.field3702;
                            this.field3696 = -this.field3696;
                            if (--this.field3699 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3702 < var4) {
                                return;
                            }
                            this.field3702 = var4 + var4 - 1 - this.field3702;
                            this.field3696 = -this.field3696;
                            if (--this.field3699 == 0) {
                                break;
                            }
                            if (this.field3702 >= var3) {
                                return;
                            }
                            this.field3702 = var3 + var3 - 1 - this.field3702;
                            this.field3696 = -this.field3696;
                        } while (--this.field3699 != 0);
                    }
                } else if (this.field3696 < 0) {
                    if (this.field3702 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3702) / var6;
                    if (var7 < this.field3699) {
                        this.field3702 += var6 * var7;
                        this.field3699 -= var7;
                        return;
                    }
                    this.field3702 += this.field3699 * var6;
                    this.field3699 = 0;
                } else {
                    if (this.field3702 < var4) {
                        return;
                    }
                    int var8 = (this.field3702 - var3) / var6;
                    if (var8 < this.field3699) {
                        this.field3702 -= var6 * var8;
                        this.field3699 -= var8;
                        return;
                    }
                    this.field3702 -= this.field3699 * var6;
                    this.field3699 = 0;
                }
            }
            if (this.field3696 < 0) {
                if (this.field3702 < 0) {
                    this.field3702 = -1;
                    this.method1636();
                    this.method2588(300);
                    return;
                }
            } else if (this.field3702 >= var5) {
                this.field3702 = var5;
                this.method1636();
                this.method2588(300);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public final synchronized void method1643(int arg0) {
        int var2 = ((class630) super.field7864).field9079.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3702 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "([IIIII)I")
    private final int method1644(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3693 <= 0) {
                if (this.field3696 == -256 && (this.field3702 & 255) == 0) {
                    if (class238.field3527) {
                        return method1624(0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, 0, arg3, arg2, this);
                    }
                    return method1634(((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, 0, arg3, arg2, this);
                }
                if (class238.field3527) {
                    return method1655(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, 0, arg3, arg2, this, this.field3696, arg4);
                }
                return method1647(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, 0, arg3, arg2, this, this.field3696, arg4);
            }
            int var6 = this.field3693 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3693 += arg1;
            if (this.field3696 == -256 && (this.field3702 & 255) == 0) {
                if (class238.field3527) {
                    arg1 = method1632(0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, this.field3703, this.field3692, 0, var6, arg2, this);
                } else {
                    arg1 = method1633(((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, this.field3698, 0, var6, arg2, this);
                }
            } else if (class238.field3527) {
                arg1 = method1625(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3695, this.field3700, this.field3703, this.field3692, 0, var6, arg2, this, this.field3696, arg4);
            } else {
                arg1 = method1650(0, 0, ((class630) super.field7864).field9079, arg0, this.field3702, arg1, this.field3691, this.field3698, 0, var6, arg2, this, this.field3696, arg4);
            }
            this.field3693 -= arg1;
            if (this.field3693 != 0) {
                return arg1;
            }
        } while (!this.method1649());
        return arg3;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I[B[IIIIIIIIIILcl;)I")
    private static final int method1645(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class245 arg12) {
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
        arg12.field3691 += (var19 - arg4) * arg12.field3698;
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
        arg12.field3695 = var15 >> 2;
        arg12.field3700 = var16 >> 2;
        arg12.field3702 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "()V")
    private final void method1646() {
        this.field3691 = this.field3701;
        this.field3695 = method1629(this.field3701, this.field3705);
        this.field3700 = method1627(this.field3701, this.field3705);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II[B[IIIIIIILcl;II)I")
    private static final int method1647(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class245 arg10, int arg11, int arg12) {
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
        arg10.field3702 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "()Z")
    public final boolean method1648() {
        return this.field3693 != 0;
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "()Z")
    private final boolean method1649() {
        int var1 = this.field3701;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1629(var1, this.field3705);
            var2 = method1627(var1, this.field3705);
        }
        if (this.field3691 == var1 && this.field3695 == var3 && this.field3700 == var2) {
            if (this.field3701 == Integer.MIN_VALUE) {
                this.field3701 = 0;
                this.field3691 = this.field3695 = this.field3700 = 0;
                this.method2588(300);
                return true;
            } else {
                this.method1646();
                return false;
            }
        } else {
            if (this.field3691 < var1) {
                this.field3698 = 1;
                this.field3693 = var1 - this.field3691;
            } else if (this.field3691 > var1) {
                this.field3698 = -1;
                this.field3693 = this.field3691 - var1;
            } else {
                this.field3698 = 0;
            }
            if (this.field3695 < var3) {
                this.field3703 = 1;
                if (this.field3693 == 0 || this.field3693 > var3 - this.field3695) {
                    this.field3693 = var3 - this.field3695;
                }
            } else if (this.field3695 > var3) {
                this.field3703 = -1;
                if (this.field3693 == 0 || this.field3693 > this.field3695 - var3) {
                    this.field3693 = this.field3695 - var3;
                }
            } else {
                this.field3703 = 0;
            }
            if (this.field3700 < var2) {
                this.field3692 = 1;
                if (this.field3693 == 0 || this.field3693 > var2 - this.field3700) {
                    this.field3693 = var2 - this.field3700;
                }
            } else if (this.field3700 > var2) {
                this.field3692 = -1;
                if (this.field3693 == 0 || this.field3693 > this.field3700 - var2) {
                    this.field3693 = this.field3700 - var2;
                }
            } else {
                this.field3692 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II[B[IIIIIIIILcl;II)I")
    private static final int method1650(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
        arg11.field3695 -= arg11.field3703 * arg5;
        arg11.field3700 -= arg11.field3692 * arg5;
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
        arg11.field3695 += arg11.field3703 * arg5;
        arg11.field3700 += arg11.field3692 * arg5;
        arg11.field3691 = arg6;
        arg11.field3702 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "()I")
    public final synchronized int method1651() {
        return this.field3705 < 0 ? -1 : this.field3705;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public final synchronized void method1652(boolean arg0) {
        this.field3696 = (this.field3696 >>> 31) + (this.field3696 ^ this.field3696 >> 31);
        if (arg0) {
            this.field3696 = -this.field3696;
        }
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V")
    public final synchronized void method1653(int arg0) {
        this.field3699 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II[B[IIIIIIIIIILcl;II)I")
    private static final int method1654(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class245 arg13, int arg14, int arg15) {
        arg13.field3691 -= arg13.field3698 * arg5;
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
        arg13.field3691 += arg13.field3698 * var22;
        arg13.field3695 = arg6;
        arg13.field3700 = arg7;
        arg13.field3702 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(II[B[IIIIIIIILcl;II)I")
    private static final int method1655(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class245 arg11, int arg12, int arg13) {
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
        arg11.field3702 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)V")
    public final synchronized void method1656(int arg0) {
        if (this.field3696 < 0) {
            this.field3696 = -arg0;
        } else {
            this.field3696 = arg0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V")
    public final synchronized void method1657(int arg0) {
        this.method1635(arg0 << 6, this.method1651());
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lee;II)V")
    private class245(class630 arg0, int arg1, int arg2) {
        super.field7864 = arg0;
        this.field3704 = arg0.field9078;
        this.field3697 = arg0.field9080;
        this.field3694 = arg0.field9082;
        this.field3696 = arg1;
        this.field3701 = arg2;
        this.field3705 = 8192;
        this.field3702 = 0;
        this.method1646();
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)V")
    public final synchronized void method1658(int arg0, int arg1) {
        this.method1622(arg0, arg1, this.method1651());
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lee;II)Lcl;")
    public static final class245 method1659(class630 arg0, int arg1, int arg2) {
        return arg0.field9079 != null && arg0.field9079.length != 0 ? new class245(arg0, (int) ((long) arg0.field9081 * 256L * (long) arg1 / (long) (class195.field3068 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "([B[IIIIIIIILcl;)I")
    private static final int method1660(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class245 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3695 += (var14 - arg3) * arg9.field3703;
        arg9.field3700 += (var14 - arg3) * arg9.field3692;
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
        arg9.field3691 = var12 >> 2;
        arg9.field3702 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "()I")
    public final synchronized int method1661() {
        return this.field3701 == Integer.MIN_VALUE ? 0 : this.field3701;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lee;III)V")
    private class245(class630 arg0, int arg1, int arg2, int arg3) {
        super.field7864 = arg0;
        this.field3704 = arg0.field9078;
        this.field3697 = arg0.field9080;
        this.field3694 = arg0.field9082;
        this.field3696 = arg1;
        this.field3701 = arg2;
        this.field3705 = arg3;
        this.field3702 = 0;
        this.method1646();
    }
}
