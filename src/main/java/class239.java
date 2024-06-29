import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class239 extends class77 {

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    private int field3823;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Z")
    private boolean field3833;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    private int field3829;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B[IIIIIIILoe;)I", line = 4)
    private static final int method1523(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
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
        arg8.field3826 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 30)
    public final synchronized void method468(int arg0) {
        if (this.field3825 > 0) {
            if (arg0 >= this.field3825) {
                if (this.field3824 == Integer.MIN_VALUE) {
                    this.field3824 = 0;
                    this.field3834 = this.field3836 = this.field3832 = 0;
                    this.method552((byte) 116);
                    arg0 = this.field3825;
                }
                this.field3825 = 0;
                this.method1555();
            } else {
                this.field3834 += this.field3830 * arg0;
                this.field3836 += this.field3829 * arg0;
                this.field3832 += this.field3835 * arg0;
                this.field3825 -= arg0;
            }
        }
        class34 var2 = (class34) this.field1192;
        int var3 = this.field3823 << 8;
        int var4 = this.field3827 << 8;
        int var5 = var2.field476.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3822 = 0;
        }
        if (this.field3826 < 0) {
            if (this.field3828 <= 0) {
                this.method1529();
                this.method552((byte) 64);
                return;
            }
            this.field3826 = 0;
        }
        if (this.field3826 >= var5) {
            if (this.field3828 >= 0) {
                this.method1529();
                this.method552((byte) 114);
                return;
            }
            this.field3826 = var5 - 1;
        }
        this.field3826 += this.field3828 * arg0;
        if (this.field3822 >= 0) {
            if (this.field3822 > 0) {
                if (this.field3833) {
                    label121: {
                        if (this.field3828 < 0) {
                            if (this.field3826 >= var3) {
                                return;
                            }
                            this.field3826 = var3 + var3 - this.field3826 - 1;
                            this.field3828 = -this.field3828;
                            if (--this.field3822 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3826 < var4) {
                                return;
                            }
                            this.field3826 = var4 + var4 - this.field3826 - 1;
                            this.field3828 = -this.field3828;
                            if (--this.field3822 == 0) {
                                break;
                            }
                            if (this.field3826 >= var3) {
                                return;
                            }
                            this.field3826 = var3 + var3 - this.field3826 - 1;
                            this.field3828 = -this.field3828;
                        } while (--this.field3822 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3828 < 0) {
                            if (this.field3826 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3826 - 1) / var6;
                            if (var7 >= this.field3822) {
                                this.field3826 += this.field3822 * var6;
                                this.field3822 = 0;
                                break label153;
                            }
                            this.field3826 += var6 * var7;
                            this.field3822 -= var7;
                        } else if (this.field3826 >= var4) {
                            int var8 = (this.field3826 - var3) / var6;
                            if (var8 >= this.field3822) {
                                this.field3826 -= this.field3822 * var6;
                                this.field3822 = 0;
                                break label153;
                            }
                            this.field3826 -= var6 * var8;
                            this.field3822 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3828 < 0) {
                if (this.field3826 < 0) {
                    this.field3826 = -1;
                    this.method1529();
                    this.method552((byte) -122);
                }
            } else if (this.field3826 >= var5) {
                this.field3826 = var5;
                this.method1529();
                this.method552((byte) 78);
            }
        } else if (this.field3833) {
            if (this.field3828 < 0) {
                if (this.field3826 >= var3) {
                    return;
                }
                this.field3826 = var3 + var3 - this.field3826 - 1;
                this.field3828 = -this.field3828;
            }
            while (this.field3826 >= var4) {
                this.field3826 = var4 + var4 - this.field3826 - 1;
                this.field3828 = -this.field3828;
                if (this.field3826 >= var3) {
                    return;
                }
                this.field3826 = var3 + var3 - this.field3826 - 1;
                this.field3828 = -this.field3828;
            }
        } else if (this.field3828 < 0) {
            if (this.field3826 >= var3) {
                return;
            }
            this.field3826 = var4 - (var4 - 1 - this.field3826) % var6 - 1;
        } else if (this.field3826 >= var4) {
            this.field3826 = (this.field3826 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B[IIIIIIIIIILoe;)I", line = 249)
    private static final int method1524(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class239 arg12) {
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
        arg12.field3834 += (var19 - arg4) * arg12.field3830;
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
        arg12.field3836 = var15 >> 2;
        arg12.field3832 = var16 >> 2;
        arg12.field3826 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[IIIIIIIIIILoe;II)I", line = 302)
    private static final int method1525(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class239 arg13, int arg14, int arg15) {
        arg13.field3834 -= arg13.field3830 * arg5;
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
        arg13.field3834 += arg13.field3830 * var27;
        arg13.field3836 = arg6;
        arg13.field3832 = arg7;
        arg13.field3826 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()Lfg;", line = 344)
    public final class77 method466() {
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 348)
    public final synchronized void method1526(int arg0, int arg1) {
        this.method1560(arg0, arg1, this.method1547());
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 353)
    public final synchronized void method1527(int arg0) {
        this.field3822 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[IIIIIIILoe;II)I", line = 356)
    private static final int method1528(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10, int arg11, int arg12) {
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
        arg10.field3826 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()V", line = 382)
    private final void method1529() {
        if (this.field3825 == 0) {
            return;
        }
        if (this.field3824 == Integer.MIN_VALUE) {
            this.field3824 = 0;
        }
        this.field3825 = 0;
        this.method1555();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lph;II)Loe;", line = 393)
    public static final class239 method1530(class34 arg0, int arg1, int arg2) {
        return arg0.field476 == null || arg0.field476.length == 0 ? null : new class239(arg0, (int) ((long) arg0.field478 * 256L * (long) arg1 / (long) (class230.field3728 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lph;III)Loe;", line = 399)
    public static final class239 method1531(class34 arg0, int arg1, int arg2, int arg3) {
        return arg0.field476 == null || arg0.field476.length == 0 ? null : new class239(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()Z", line = 406)
    private final boolean method1532() {
        int var1 = this.field3824;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1551(var1, this.field3831);
            var2 = method1533(var1, this.field3831);
        }
        if (this.field3834 != var1 || this.field3836 != var3 || this.field3832 != var2) {
            if (this.field3834 < var1) {
                this.field3830 = 1;
                this.field3825 = var1 - this.field3834;
            } else if (this.field3834 > var1) {
                this.field3830 = -1;
                this.field3825 = this.field3834 - var1;
            } else {
                this.field3830 = 0;
            }
            if (this.field3836 < var3) {
                this.field3829 = 1;
                if (this.field3825 == 0 || this.field3825 > var3 - this.field3836) {
                    this.field3825 = var3 - this.field3836;
                }
            } else if (this.field3836 > var3) {
                this.field3829 = -1;
                if (this.field3825 == 0 || this.field3825 > this.field3836 - var3) {
                    this.field3825 = this.field3836 - var3;
                }
            } else {
                this.field3829 = 0;
            }
            if (this.field3832 < var2) {
                this.field3835 = 1;
                if (this.field3825 == 0 || this.field3825 > var2 - this.field3832) {
                    this.field3825 = var2 - this.field3832;
                }
            } else if (this.field3832 > var2) {
                this.field3835 = -1;
                if (this.field3825 == 0 || this.field3825 > this.field3832 - var2) {
                    this.field3825 = this.field3832 - var2;
                }
            } else {
                this.field3835 = 0;
            }
            return false;
        } else if (this.field3824 == Integer.MIN_VALUE) {
            this.field3824 = 0;
            this.field3834 = this.field3836 = this.field3832 = 0;
            this.method552((byte) -125);
            return true;
        } else {
            this.method1555();
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()Lfg;", line = 491)
    public final class77 method462() {
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I", line = 495)
    private static final int method1533(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V", line = 498)
    private final synchronized void method1534(int arg0) {
        this.method1539(arg0, this.method1547());
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "()I", line = 501)
    public final synchronized int method1535() {
        return this.field3824 == Integer.MIN_VALUE ? 0 : this.field3824;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B[IIIIIIIILoe;)I", line = 504)
    private static final int method1536(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class239 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3836 += (var14 - arg3) * arg9.field3829;
        arg9.field3832 += (var14 - arg3) * arg9.field3835;
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
        arg9.field3834 = var12 >> 2;
        arg9.field3826 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 538)
    public final synchronized void method1537(int arg0) {
        if (this.field3828 < 0) {
            this.field3828 = -arg0;
        } else {
            this.field3828 = arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "()Z", line = 547)
    public final boolean method1538() {
        return this.field3826 < 0 || this.field3826 >= ((class34) this.field1192).field476.length << 8;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)V", line = 550)
    public final synchronized void method458(int[] arg0, int arg1, int arg2) {
        if (this.field3824 == 0 && this.field3825 == 0) {
            this.method468(arg2);
            return;
        }
        class34 var4 = (class34) this.field1192;
        int var5 = this.field3823 << 8;
        int var6 = this.field3827 << 8;
        int var7 = var4.field476.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3822 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3826 < 0) {
            if (this.field3828 <= 0) {
                this.method1529();
                this.method552((byte) 43);
                return;
            }
            this.field3826 = 0;
        }
        if (this.field3826 >= var7) {
            if (this.field3828 >= 0) {
                this.method1529();
                this.method552((byte) 118);
                return;
            }
            this.field3826 = var7 - 1;
        }
        if (this.field3822 >= 0) {
            if (this.field3822 > 0) {
                if (this.field3833) {
                    label131: {
                        if (this.field3828 < 0) {
                            var9 = this.method1544(arg0, arg1, var5, var10, var4.field476[this.field3823]);
                            if (this.field3826 >= var5) {
                                return;
                            }
                            this.field3826 = var5 + var5 - this.field3826 - 1;
                            this.field3828 = -this.field3828;
                            if (--this.field3822 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1540(arg0, var9, var6, var10, var4.field476[this.field3827 - 1]);
                            if (this.field3826 < var6) {
                                return;
                            }
                            this.field3826 = var6 + var6 - this.field3826 - 1;
                            this.field3828 = -this.field3828;
                            if (--this.field3822 == 0) {
                                break;
                            }
                            var9 = this.method1544(arg0, var9, var5, var10, var4.field476[this.field3823]);
                            if (this.field3826 >= var5) {
                                return;
                            }
                            this.field3826 = var5 + var5 - this.field3826 - 1;
                            this.field3828 = -this.field3828;
                        } while (--this.field3822 != 0);
                    }
                } else if (this.field3828 < 0) {
                    while (true) {
                        var9 = this.method1544(arg0, var9, var5, var10, var4.field476[this.field3827 - 1]);
                        if (this.field3826 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3826 - 1) / var8;
                        if (var12 >= this.field3822) {
                            this.field3826 += this.field3822 * var8;
                            this.field3822 = 0;
                            break;
                        }
                        this.field3826 += var8 * var12;
                        this.field3822 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1540(arg0, var9, var6, var10, var4.field476[this.field3823]);
                        if (this.field3826 < var6) {
                            return;
                        }
                        int var13 = (this.field3826 - var5) / var8;
                        if (var13 >= this.field3822) {
                            this.field3826 -= this.field3822 * var8;
                            this.field3822 = 0;
                            break;
                        }
                        this.field3826 -= var8 * var13;
                        this.field3822 -= var13;
                    }
                }
            }
            if (this.field3828 < 0) {
                this.method1544(arg0, var9, 0, var10, 0);
                if (this.field3826 < 0) {
                    this.field3826 = -1;
                    this.method1529();
                    this.method552((byte) -109);
                }
            } else {
                this.method1540(arg0, var9, var7, var10, 0);
                if (this.field3826 >= var7) {
                    this.field3826 = var7;
                    this.method1529();
                    this.method552((byte) -118);
                }
            }
        } else if (this.field3833) {
            if (this.field3828 < 0) {
                var9 = this.method1544(arg0, arg1, var5, var10, var4.field476[this.field3823]);
                if (this.field3826 >= var5) {
                    return;
                }
                this.field3826 = var5 + var5 - this.field3826 - 1;
                this.field3828 = -this.field3828;
            }
            while (true) {
                int var11 = this.method1540(arg0, var9, var6, var10, var4.field476[this.field3827 - 1]);
                if (this.field3826 < var6) {
                    return;
                }
                this.field3826 = var6 + var6 - this.field3826 - 1;
                this.field3828 = -this.field3828;
                var9 = this.method1544(arg0, var11, var5, var10, var4.field476[this.field3823]);
                if (this.field3826 >= var5) {
                    return;
                }
                this.field3826 = var5 + var5 - this.field3826 - 1;
                this.field3828 = -this.field3828;
            }
        } else if (this.field3828 < 0) {
            while (true) {
                var9 = this.method1544(arg0, var9, var5, var10, var4.field476[this.field3827 - 1]);
                if (this.field3826 >= var5) {
                    return;
                }
                this.field3826 = var6 - (var6 - 1 - this.field3826) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1540(arg0, var9, var6, var10, var4.field476[this.field3823]);
                if (this.field3826 < var6) {
                    return;
                }
                this.field3826 = (this.field3826 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V", line = 788)
    private final synchronized void method1539(int arg0, int arg1) {
        this.field3824 = arg0;
        this.field3831 = arg1;
        this.field3825 = 0;
        this.method1555();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([IIIII)I", line = 794)
    private final int method1540(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3825 > 0) {
                int var6 = this.field3825 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3825 += arg1;
                if (this.field3828 == 256 && (this.field3826 & 0xFF) == 0) {
                    if (class55.field887) {
                        arg1 = method1548(0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, this.field3829, this.field3835, 0, var6, arg2, this);
                    } else {
                        arg1 = method1553(((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, this.field3830, 0, var6, arg2, this);
                    }
                } else if (class55.field887) {
                    arg1 = method1525(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, this.field3829, this.field3835, 0, var6, arg2, this, this.field3828, arg4);
                } else {
                    arg1 = method1550(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, this.field3830, 0, var6, arg2, this, this.field3828, arg4);
                }
                this.field3825 -= arg1;
                if (this.field3825 != 0) {
                    return arg1;
                }
                if (!this.method1532()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3828 == 256 && (this.field3826 & 0xFF) == 0) {
                if (class55.field887) {
                    return method1561(0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, 0, arg3, arg2, this);
                }
                return method1546(((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, 0, arg3, arg2, this);
            }
            if (class55.field887) {
                return method1554(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, 0, arg3, arg2, this, this.field3828, arg4);
            }
            return method1528(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, 0, arg3, arg2, this, this.field3828, arg4);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 849)
    private static final int method1541(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
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
        arg11.field3826 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "()Z", line = 882)
    public final boolean method1542() {
        return this.field3825 != 0;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 891)
    public final synchronized void method1543(int arg0) {
        int var2 = ((class34) this.field1192).field476.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3826 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([IIIII)I", line = 901)
    private final int method1544(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3825 > 0) {
                int var6 = this.field3825 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3825 += arg1;
                if (this.field3828 == -256 && (this.field3826 & 0xFF) == 0) {
                    if (class55.field887) {
                        arg1 = method1524(0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, this.field3829, this.field3835, 0, var6, arg2, this);
                    } else {
                        arg1 = method1536(((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, this.field3830, 0, var6, arg2, this);
                    }
                } else if (class55.field887) {
                    arg1 = method1549(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, this.field3829, this.field3835, 0, var6, arg2, this, this.field3828, arg4);
                } else {
                    arg1 = method1558(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, this.field3830, 0, var6, arg2, this, this.field3828, arg4);
                }
                this.field3825 -= arg1;
                if (this.field3825 != 0) {
                    return arg1;
                }
                if (!this.method1532()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3828 == -256 && (this.field3826 & 0xFF) == 0) {
                if (class55.field887) {
                    return method1559(0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, 0, arg3, arg2, this);
                }
                return method1523(((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, 0, arg3, arg2, this);
            }
            if (class55.field887) {
                return method1541(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3836, this.field3832, 0, arg3, arg2, this, this.field3828, arg4);
            }
            return method1557(0, 0, ((class34) this.field1192).field476, arg0, this.field3826, arg1, this.field3834, 0, arg3, arg2, this, this.field3828, arg4);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V", line = 958)
    public final synchronized void method1545(boolean arg0) {
        this.field3828 = (this.field3828 >>> 31) + (this.field3828 ^ this.field3828 >> 31);
        if (arg0) {
            this.field3828 = -this.field3828;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B[IIIIIIILoe;)I", line = 964)
    private static final int method1546(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
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
        arg8.field3826 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "()I", line = 989)
    public final synchronized int method1547() {
        return this.field3831 < 0 ? -1 : this.field3831;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I[B[IIIIIIIIIILoe;)I", line = 994)
    private static final int method1548(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class239 arg12) {
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
        arg12.field3834 += (var19 - arg4) * arg12.field3830;
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
        arg12.field3836 = var15 >> 2;
        arg12.field3832 = var16 >> 2;
        arg12.field3826 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II[B[IIIIIIIIIILoe;II)I", line = 1051)
    private static final int method1549(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class239 arg13, int arg14, int arg15) {
        arg13.field3834 -= arg13.field3830 * arg5;
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
        arg13.field3834 += arg13.field3830 * var26;
        arg13.field3836 = arg6;
        arg13.field3832 = arg7;
        arg13.field3826 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 1092)
    private static final int method1550(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        arg11.field3836 -= arg11.field3829 * arg5;
        arg11.field3832 -= arg11.field3835 * arg5;
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
        arg11.field3836 += arg11.field3829 * arg5;
        arg11.field3832 += arg11.field3835 * arg5;
        arg11.field3834 = arg6;
        arg11.field3826 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(II)I", line = 1125)
    private static final int method1551(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "()I", line = 1128)
    public final synchronized int method1552() {
        return this.field3828 < 0 ? -this.field3828 : this.field3828;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B[IIIIIIIILoe;)I", line = 1131)
    private static final int method1553(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class239 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3836 += (var14 - arg3) * arg9.field3829;
        arg9.field3832 += (var14 - arg3) * arg9.field3835;
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
        arg9.field3834 = var12 >> 2;
        arg9.field3826 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()I", line = 1165)
    public final int method469() {
        return this.field3824 == 0 && this.field3825 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 1171)
    private static final int method1554(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
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
        arg11.field3826 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I", line = 1206)
    public final int method545() {
        int var1 = this.field3834 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3822 == 0) {
            var2 -= this.field3826 * var2 / (((class34) this.field1192).field476.length << 8);
        } else if (this.field3822 >= 0) {
            var2 -= this.field3823 * var2 / ((class34) this.field1192).field476.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "()V", line = 1218)
    private final void method1555() {
        this.field3834 = this.field3824;
        this.field3836 = method1551(this.field3824, this.field3831);
        this.field3832 = method1533(this.field3824, this.field3831);
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V", line = 1223)
    public final synchronized void method1556(int arg0) {
        this.method1539(arg0 << 6, this.method1547());
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II[B[IIIIIIILoe;II)I", line = 1226)
    private static final int method1557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10, int arg11, int arg12) {
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
        arg10.field3826 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(II[B[IIIIIIIILoe;II)I", line = 1255)
    private static final int method1558(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        arg11.field3836 -= arg11.field3829 * arg5;
        arg11.field3832 -= arg11.field3835 * arg5;
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
        arg11.field3836 += arg11.field3829 * arg5;
        arg11.field3832 += arg11.field3835 * arg5;
        arg11.field3834 = arg6;
        arg11.field3826 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B[IIIIIIIILoe;)I", line = 1289)
    private static final int method1559(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10) {
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
        arg10.field3826 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 1327)
    public final synchronized void method1560(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1539(arg1, arg2);
            return;
        }
        int var4 = method1551(arg1, arg2);
        int var5 = method1533(arg1, arg2);
        if (this.field3836 == var4 && this.field3832 == var5) {
            this.field3825 = 0;
            return;
        }
        int var6 = arg1 - this.field3834;
        if (this.field3834 - arg1 > var6) {
            var6 = this.field3834 - arg1;
        }
        if (var4 - this.field3836 > var6) {
            var6 = var4 - this.field3836;
        }
        if (this.field3836 - var4 > var6) {
            var6 = this.field3836 - var4;
        }
        if (var5 - this.field3832 > var6) {
            var6 = var5 - this.field3832;
        }
        if (this.field3832 - var5 > var6) {
            var6 = this.field3832 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3825 = arg0;
        this.field3824 = arg1;
        this.field3831 = arg2;
        this.field3830 = (arg1 - this.field3834) / arg0;
        this.field3829 = (var4 - this.field3836) / arg0;
        this.field3835 = (var5 - this.field3832) / arg0;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I[B[IIIIIIIILoe;)I", line = 1374)
    private static final int method1561(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10) {
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
        arg10.field3826 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V", line = 1412)
    public final synchronized void method1562(int arg0) {
        if (arg0 == 0) {
            this.method1534(0);
            this.method552((byte) -119);
        } else if (this.field3836 == 0 && this.field3832 == 0) {
            this.field3825 = 0;
            this.field3824 = 0;
            this.field3834 = 0;
            this.method552((byte) -128);
        } else {
            int var2 = -this.field3834;
            if (this.field3834 > var2) {
                var2 = this.field3834;
            }
            if (-this.field3836 > var2) {
                var2 = -this.field3836;
            }
            if (this.field3836 > var2) {
                var2 = this.field3836;
            }
            if (-this.field3832 > var2) {
                var2 = -this.field3832;
            }
            if (this.field3832 > var2) {
                var2 = this.field3832;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3825 = arg0;
            this.field3824 = Integer.MIN_VALUE;
            this.field3830 = -this.field3834 / arg0;
            this.field3829 = -this.field3836 / arg0;
            this.field3835 = -this.field3832 / arg0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lph;II)V", line = 1457)
    private class239(class34 arg0, int arg1, int arg2) {
        this.field1192 = arg0;
        this.field3823 = arg0.field479;
        this.field3827 = arg0.field477;
        this.field3833 = arg0.field475;
        this.field3828 = arg1;
        this.field3824 = arg2;
        this.field3831 = 8192;
        this.field3826 = 0;
        this.method1555();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lph;III)V", line = 1469)
    private class239(class34 arg0, int arg1, int arg2, int arg3) {
        this.field1192 = arg0;
        this.field3823 = arg0.field479;
        this.field3827 = arg0.field477;
        this.field3833 = arg0.field475;
        this.field3828 = arg1;
        this.field3824 = arg2;
        this.field3831 = arg3;
        this.field3826 = 0;
        this.method1555();
    }
}
