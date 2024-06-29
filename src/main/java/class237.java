import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class237 extends class1 {

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    private int field3744;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Z")
    private boolean field3749;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    private int field3748;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    private int field3757;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    private int field3755;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    private int field3747;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    private int field3750;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    private int field3754;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    private int field3756;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V", line = 4)
    public final synchronized void method1627(int arg0) {
        int var2 = ((class321) this.field4).field5282.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3755 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "()Z", line = 15)
    private final boolean method1628() {
        int var1 = this.field3757;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1650(var1, this.field3743);
            var2 = method1645(var1, this.field3743);
        }
        if (this.field3745 != var1 || this.field3746 != var3 || this.field3754 != var2) {
            if (this.field3745 < var1) {
                this.field3747 = 1;
                this.field3750 = var1 - this.field3745;
            } else if (this.field3745 > var1) {
                this.field3747 = -1;
                this.field3750 = this.field3745 - var1;
            } else {
                this.field3747 = 0;
            }
            if (this.field3746 < var3) {
                this.field3756 = 1;
                if (this.field3750 == 0 || this.field3750 > var3 - this.field3746) {
                    this.field3750 = var3 - this.field3746;
                }
            } else if (this.field3746 > var3) {
                this.field3756 = -1;
                if (this.field3750 == 0 || this.field3750 > this.field3746 - var3) {
                    this.field3750 = this.field3746 - var3;
                }
            } else {
                this.field3756 = 0;
            }
            if (this.field3754 < var2) {
                this.field3751 = 1;
                if (this.field3750 == 0 || this.field3750 > var2 - this.field3754) {
                    this.field3750 = var2 - this.field3754;
                }
            } else if (this.field3754 > var2) {
                this.field3751 = -1;
                if (this.field3750 == 0 || this.field3750 > this.field3754 - var2) {
                    this.field3750 = this.field3754 - var2;
                }
            } else {
                this.field3751 = 0;
            }
            return false;
        } else if (this.field3757 == Integer.MIN_VALUE) {
            this.field3757 = 0;
            this.field3745 = this.field3746 = this.field3754 = 0;
            this.method1131(8);
            return true;
        } else {
            this.method1666();
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(III)V", line = 100)
    public final synchronized void method1629(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1662(arg1, arg2);
            return;
        }
        int var4 = method1650(arg1, arg2);
        int var5 = method1645(arg1, arg2);
        if (this.field3746 == var4 && this.field3754 == var5) {
            this.field3750 = 0;
            return;
        }
        int var6 = arg1 - this.field3745;
        if (this.field3745 - arg1 > var6) {
            var6 = this.field3745 - arg1;
        }
        if (var4 - this.field3746 > var6) {
            var6 = var4 - this.field3746;
        }
        if (this.field3746 - var4 > var6) {
            var6 = this.field3746 - var4;
        }
        if (var5 - this.field3754 > var6) {
            var6 = var5 - this.field3754;
        }
        if (this.field3754 - var5 > var6) {
            var6 = this.field3754 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field3750 = arg0;
        this.field3757 = arg1;
        this.field3743 = arg2;
        this.field3747 = (arg1 - this.field3745) / arg0;
        this.field3756 = (var4 - this.field3746) / arg0;
        this.field3751 = (var5 - this.field3754) / arg0;
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "()I", line = 146)
    public final synchronized int method1630() {
        return this.field3743 < 0 ? -1 : this.field3743;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V", line = 149)
    public final synchronized void method5(int arg0) {
        if (this.field3750 > 0) {
            if (arg0 >= this.field3750) {
                if (this.field3757 == Integer.MIN_VALUE) {
                    this.field3757 = 0;
                    this.field3745 = this.field3746 = this.field3754 = 0;
                    this.method1131(8);
                    arg0 = this.field3750;
                }
                this.field3750 = 0;
                this.method1666();
            } else {
                this.field3745 += this.field3747 * arg0;
                this.field3746 += this.field3756 * arg0;
                this.field3754 += this.field3751 * arg0;
                this.field3750 -= arg0;
            }
        }
        class321 var2 = (class321) this.field4;
        int var3 = this.field3744 << 8;
        int var4 = this.field3753 << 8;
        int var5 = var2.field5282.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3752 = 0;
        }
        if (this.field3755 < 0) {
            if (this.field3748 <= 0) {
                this.method1653();
                this.method1131(8);
                return;
            }
            this.field3755 = 0;
        }
        if (this.field3755 >= var5) {
            if (this.field3748 >= 0) {
                this.method1653();
                this.method1131(8);
                return;
            }
            this.field3755 = var5 - 1;
        }
        this.field3755 += this.field3748 * arg0;
        if (this.field3752 >= 0) {
            if (this.field3752 > 0) {
                if (this.field3749) {
                    label121: {
                        if (this.field3748 < 0) {
                            if (this.field3755 >= var3) {
                                return;
                            }
                            this.field3755 = var3 + var3 - this.field3755 - 1;
                            this.field3748 = -this.field3748;
                            if (--this.field3752 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field3755 < var4) {
                                return;
                            }
                            this.field3755 = var4 + var4 - this.field3755 - 1;
                            this.field3748 = -this.field3748;
                            if (--this.field3752 == 0) {
                                break;
                            }
                            if (this.field3755 >= var3) {
                                return;
                            }
                            this.field3755 = var3 + var3 - this.field3755 - 1;
                            this.field3748 = -this.field3748;
                        } while (--this.field3752 != 0);
                    }
                } else {
                    label153: {
                        if (this.field3748 < 0) {
                            if (this.field3755 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field3755 - 1) / var6;
                            if (var7 >= this.field3752) {
                                this.field3755 += this.field3752 * var6;
                                this.field3752 = 0;
                                break label153;
                            }
                            this.field3755 += var6 * var7;
                            this.field3752 -= var7;
                        } else if (this.field3755 >= var4) {
                            int var8 = (this.field3755 - var3) / var6;
                            if (var8 >= this.field3752) {
                                this.field3755 -= this.field3752 * var6;
                                this.field3752 = 0;
                                break label153;
                            }
                            this.field3755 -= var6 * var8;
                            this.field3752 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field3748 < 0) {
                if (this.field3755 < 0) {
                    this.field3755 = -1;
                    this.method1653();
                    this.method1131(8);
                }
            } else if (this.field3755 >= var5) {
                this.field3755 = var5;
                this.method1653();
                this.method1131(8);
            }
        } else if (this.field3749) {
            if (this.field3748 < 0) {
                if (this.field3755 >= var3) {
                    return;
                }
                this.field3755 = var3 + var3 - this.field3755 - 1;
                this.field3748 = -this.field3748;
            }
            while (this.field3755 >= var4) {
                this.field3755 = var4 + var4 - this.field3755 - 1;
                this.field3748 = -this.field3748;
                if (this.field3755 >= var3) {
                    return;
                }
                this.field3755 = var3 + var3 - this.field3755 - 1;
                this.field3748 = -this.field3748;
            }
        } else if (this.field3748 < 0) {
            if (this.field3755 >= var3) {
                return;
            }
            this.field3755 = var4 - (var4 - 1 - this.field3755) % var6 - 1;
        } else if (this.field3755 >= var4) {
            this.field3755 = (this.field3755 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[B[IIIIIIIIIILcn;II)I", line = 367)
    private static final int method1631(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class237 arg13, int arg14, int arg15) {
        arg13.field3745 -= arg13.field3747 * arg5;
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
        arg13.field3745 += arg13.field3747 * var27;
        arg13.field3746 = arg6;
        arg13.field3754 = arg7;
        arg13.field3755 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lpc;II)Lcn;", line = 409)
    public static final class237 method1632(class321 arg0, int arg1, int arg2) {
        return arg0.field5282 == null || arg0.field5282.length == 0 ? null : new class237(arg0, (int) ((long) arg0.field5280 * 256L * (long) arg1 / (long) (class322.field5294 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V", line = 417)
    public final synchronized void method1633(int arg0) {
        if (this.field3748 < 0) {
            this.field3748 = -arg0;
        } else {
            this.field3748 = arg0;
        }
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "()Z", line = 424)
    public final boolean method1634() {
        return this.field3750 != 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[B[IIIIIIIIIILcn;)I", line = 427)
    private static final int method1635(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class237 arg12) {
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
        arg12.field3745 += (var19 - arg4) * arg12.field3747;
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
        arg12.field3746 = var15 >> 2;
        arg12.field3754 = var16 >> 2;
        arg12.field3755 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([B[IIIIIIILcn;)I", line = 481)
    private static final int method1636(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class237 arg8) {
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
        arg8.field3755 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V", line = 509)
    public final synchronized void method1637(int arg0) {
        this.method1662(arg0 << 6, this.method1630());
    }

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V", line = 513)
    public final synchronized void method1638(int arg0) {
        if (arg0 == 0) {
            this.method1639(0);
            this.method1131(8);
        } else if (this.field3746 == 0 && this.field3754 == 0) {
            this.field3750 = 0;
            this.field3757 = 0;
            this.field3745 = 0;
            this.method1131(8);
        } else {
            int var2 = -this.field3745;
            if (this.field3745 > var2) {
                var2 = this.field3745;
            }
            if (-this.field3746 > var2) {
                var2 = -this.field3746;
            }
            if (this.field3746 > var2) {
                var2 = this.field3746;
            }
            if (-this.field3754 > var2) {
                var2 = -this.field3754;
            }
            if (this.field3754 > var2) {
                var2 = this.field3754;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3750 = arg0;
            this.field3757 = Integer.MIN_VALUE;
            this.field3747 = -this.field3745 / arg0;
            this.field3756 = -this.field3746 / arg0;
            this.field3751 = -this.field3754 / arg0;
        }
    }

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "(I)V", line = 558)
    private final synchronized void method1639(int arg0) {
        this.method1662(arg0, this.method1630());
    }

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "(I)V", line = 562)
    public final synchronized void method1640(int arg0) {
        this.field3752 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[B[IIIIIIILcn;II)I", line = 565)
    private static final int method1641(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class237 arg10, int arg11, int arg12) {
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
        arg10.field3755 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II[B[IIIIIIILcn;II)I", line = 592)
    private static final int method1642(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class237 arg10, int arg11, int arg12) {
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
        arg10.field3755 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[B[IIIIIIIILcn;II)I", line = 618)
    private static final int method1643(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class237 arg11, int arg12, int arg13) {
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
        arg11.field3755 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([B[IIIIIIIILcn;)I", line = 651)
    private static final int method1644(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class237 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3746 += (var14 - arg3) * arg9.field3756;
        arg9.field3754 += (var14 - arg3) * arg9.field3751;
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
        arg9.field3745 = var12 >> 2;
        arg9.field3755 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 688)
    private static final int method1645(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lpc;III)Lcn;", line = 691)
    public static final class237 method1646(class321 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5282 == null || arg0.field5282.length == 0 ? null : new class237(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II[B[IIIIIIIIIILcn;II)I", line = 699)
    private static final int method1647(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class237 arg13, int arg14, int arg15) {
        arg13.field3745 -= arg13.field3747 * arg5;
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
        arg13.field3745 += arg13.field3747 * var26;
        arg13.field3746 = arg6;
        arg13.field3754 = arg7;
        arg13.field3755 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I[B[IIIIIIIIIILcn;)I", line = 740)
    private static final int method1648(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class237 arg12) {
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
        arg12.field3745 += (var19 - arg4) * arg12.field3747;
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
        arg12.field3746 = var15 >> 2;
        arg12.field3754 = var16 >> 2;
        arg12.field3755 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "()Z", line = 793)
    public final boolean method1649() {
        return this.field3755 < 0 || this.field3755 >= ((class321) this.field4).field5282.length << 8;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)I", line = 796)
    private static final int method1650(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "()I", line = 802)
    public final int method7() {
        return this.field3757 == 0 && this.field3750 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "()I", line = 808)
    public final synchronized int method1651() {
        return this.field3757 == Integer.MIN_VALUE ? 0 : this.field3757;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "([B[IIIIIIIILcn;)I", line = 811)
    private static final int method1652(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class237 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3746 += (var14 - arg3) * arg9.field3756;
        arg9.field3754 += (var14 - arg3) * arg9.field3751;
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
        arg9.field3745 = var12 >> 2;
        arg9.field3755 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "()Lro;", line = 845)
    public final class1 method1() {
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "()V", line = 851)
    private final void method1653() {
        if (this.field3750 == 0) {
            return;
        }
        if (this.field3757 == Integer.MIN_VALUE) {
            this.field3757 = 0;
        }
        this.field3750 = 0;
        this.method1666();
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "()Lro;", line = 865)
    public final class1 method3() {
        return null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "()I", line = 870)
    public final int method2() {
        int var1 = this.field3745 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3752 == 0) {
            var2 -= this.field3755 * var2 / (((class321) this.field4).field5282.length << 8);
        } else if (this.field3752 >= 0) {
            var2 -= this.field3744 * var2 / ((class321) this.field4).field5282.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II[B[IIIIIIIILcn;II)I", line = 883)
    private static final int method1654(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class237 arg11, int arg12, int arg13) {
        arg11.field3746 -= arg11.field3756 * arg5;
        arg11.field3754 -= arg11.field3751 * arg5;
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
        arg11.field3746 += arg11.field3756 * arg5;
        arg11.field3754 += arg11.field3751 * arg5;
        arg11.field3745 = arg6;
        arg11.field3755 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([IIIII)I", line = 916)
    private final int method1655(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3750 > 0) {
                int var6 = this.field3750 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3750 += arg1;
                if (this.field3748 == -256 && (this.field3755 & 0xFF) == 0) {
                    if (class228.field3587) {
                        arg1 = method1648(0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, this.field3756, this.field3751, 0, var6, arg2, this);
                    } else {
                        arg1 = method1644(((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, this.field3747, 0, var6, arg2, this);
                    }
                } else if (class228.field3587) {
                    arg1 = method1647(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, this.field3756, this.field3751, 0, var6, arg2, this, this.field3748, arg4);
                } else {
                    arg1 = method1654(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, this.field3747, 0, var6, arg2, this, this.field3748, arg4);
                }
                this.field3750 -= arg1;
                if (this.field3750 != 0) {
                    return arg1;
                }
                if (!this.method1628()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3748 == -256 && (this.field3755 & 0xFF) == 0) {
                if (class228.field3587) {
                    return method1665(0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, 0, arg3, arg2, this);
                }
                return method1656(((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, 0, arg3, arg2, this);
            }
            if (class228.field3587) {
                return method1664(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, 0, arg3, arg2, this, this.field3748, arg4);
            }
            return method1642(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, 0, arg3, arg2, this, this.field3748, arg4);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "([B[IIIIIIILcn;)I", line = 971)
    private static final int method1656(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class237 arg8) {
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
        arg8.field3755 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V", line = 997)
    public final synchronized void method1657(int arg0, int arg1) {
        this.method1629(arg0, arg1, this.method1630());
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II[B[IIIIIIIILcn;II)I", line = 1002)
    private static final int method1658(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class237 arg11, int arg12, int arg13) {
        arg11.field3746 -= arg11.field3756 * arg5;
        arg11.field3754 -= arg11.field3751 * arg5;
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
        arg11.field3746 += arg11.field3756 * arg5;
        arg11.field3754 += arg11.field3751 * arg5;
        arg11.field3745 = arg6;
        arg11.field3755 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "([IIIII)I", line = 1035)
    private final int method1659(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field3750 > 0) {
                int var6 = this.field3750 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field3750 += arg1;
                if (this.field3748 == 256 && (this.field3755 & 0xFF) == 0) {
                    if (class228.field3587) {
                        arg1 = method1635(0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, this.field3756, this.field3751, 0, var6, arg2, this);
                    } else {
                        arg1 = method1652(((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, this.field3747, 0, var6, arg2, this);
                    }
                } else if (class228.field3587) {
                    arg1 = method1631(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, this.field3756, this.field3751, 0, var6, arg2, this, this.field3748, arg4);
                } else {
                    arg1 = method1658(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, this.field3747, 0, var6, arg2, this, this.field3748, arg4);
                }
                this.field3750 -= arg1;
                if (this.field3750 != 0) {
                    return arg1;
                }
                if (!this.method1628()) {
                    continue;
                }
                return arg3;
            }
            if (this.field3748 == 256 && (this.field3755 & 0xFF) == 0) {
                if (class228.field3587) {
                    return method1660(0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, 0, arg3, arg2, this);
                }
                return method1636(((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, 0, arg3, arg2, this);
            }
            if (class228.field3587) {
                return method1643(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3746, this.field3754, 0, arg3, arg2, this, this.field3748, arg4);
            }
            return method1641(0, 0, ((class321) this.field4).field5282, arg0, this.field3755, arg1, this.field3745, 0, arg3, arg2, this, this.field3748, arg4);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[B[IIIIIIIILcn;)I", line = 1090)
    private static final int method1660(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class237 arg10) {
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
        arg10.field3755 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 1129)
    public final synchronized void method1661(boolean arg0) {
        this.field3748 = (this.field3748 >>> 31) + (this.field3748 ^ this.field3748 >> 31);
        if (arg0) {
            this.field3748 = -this.field3748;
        }
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(II)V", line = 1138)
    private final synchronized void method1662(int arg0, int arg1) {
        this.field3757 = arg0;
        this.field3743 = arg1;
        this.field3750 = 0;
        this.method1666();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([III)V", line = 1145)
    public final synchronized void method4(int[] arg0, int arg1, int arg2) {
        if (this.field3757 == 0 && this.field3750 == 0) {
            this.method5(arg2);
            return;
        }
        class321 var4 = (class321) this.field4;
        int var5 = this.field3744 << 8;
        int var6 = this.field3753 << 8;
        int var7 = var4.field5282.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field3752 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field3755 < 0) {
            if (this.field3748 <= 0) {
                this.method1653();
                this.method1131(8);
                return;
            }
            this.field3755 = 0;
        }
        if (this.field3755 >= var7) {
            if (this.field3748 >= 0) {
                this.method1653();
                this.method1131(8);
                return;
            }
            this.field3755 = var7 - 1;
        }
        if (this.field3752 >= 0) {
            if (this.field3752 > 0) {
                if (this.field3749) {
                    label131: {
                        if (this.field3748 < 0) {
                            var9 = this.method1655(arg0, arg1, var5, var10, var4.field5282[this.field3744]);
                            if (this.field3755 >= var5) {
                                return;
                            }
                            this.field3755 = var5 + var5 - this.field3755 - 1;
                            this.field3748 = -this.field3748;
                            if (--this.field3752 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1659(arg0, var9, var6, var10, var4.field5282[this.field3753 - 1]);
                            if (this.field3755 < var6) {
                                return;
                            }
                            this.field3755 = var6 + var6 - this.field3755 - 1;
                            this.field3748 = -this.field3748;
                            if (--this.field3752 == 0) {
                                break;
                            }
                            var9 = this.method1655(arg0, var9, var5, var10, var4.field5282[this.field3744]);
                            if (this.field3755 >= var5) {
                                return;
                            }
                            this.field3755 = var5 + var5 - this.field3755 - 1;
                            this.field3748 = -this.field3748;
                        } while (--this.field3752 != 0);
                    }
                } else if (this.field3748 < 0) {
                    while (true) {
                        var9 = this.method1655(arg0, var9, var5, var10, var4.field5282[this.field3753 - 1]);
                        if (this.field3755 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field3755 - 1) / var8;
                        if (var12 >= this.field3752) {
                            this.field3755 += this.field3752 * var8;
                            this.field3752 = 0;
                            break;
                        }
                        this.field3755 += var8 * var12;
                        this.field3752 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1659(arg0, var9, var6, var10, var4.field5282[this.field3744]);
                        if (this.field3755 < var6) {
                            return;
                        }
                        int var13 = (this.field3755 - var5) / var8;
                        if (var13 >= this.field3752) {
                            this.field3755 -= this.field3752 * var8;
                            this.field3752 = 0;
                            break;
                        }
                        this.field3755 -= var8 * var13;
                        this.field3752 -= var13;
                    }
                }
            }
            if (this.field3748 < 0) {
                this.method1655(arg0, var9, 0, var10, 0);
                if (this.field3755 < 0) {
                    this.field3755 = -1;
                    this.method1653();
                    this.method1131(8);
                }
            } else {
                this.method1659(arg0, var9, var7, var10, 0);
                if (this.field3755 >= var7) {
                    this.field3755 = var7;
                    this.method1653();
                    this.method1131(8);
                }
            }
        } else if (this.field3749) {
            if (this.field3748 < 0) {
                var9 = this.method1655(arg0, arg1, var5, var10, var4.field5282[this.field3744]);
                if (this.field3755 >= var5) {
                    return;
                }
                this.field3755 = var5 + var5 - this.field3755 - 1;
                this.field3748 = -this.field3748;
            }
            while (true) {
                int var11 = this.method1659(arg0, var9, var6, var10, var4.field5282[this.field3753 - 1]);
                if (this.field3755 < var6) {
                    return;
                }
                this.field3755 = var6 + var6 - this.field3755 - 1;
                this.field3748 = -this.field3748;
                var9 = this.method1655(arg0, var11, var5, var10, var4.field5282[this.field3744]);
                if (this.field3755 >= var5) {
                    return;
                }
                this.field3755 = var5 + var5 - this.field3755 - 1;
                this.field3748 = -this.field3748;
            }
        } else if (this.field3748 < 0) {
            while (true) {
                var9 = this.method1655(arg0, var9, var5, var10, var4.field5282[this.field3753 - 1]);
                if (this.field3755 >= var5) {
                    return;
                }
                this.field3755 = var6 - (var6 - 1 - this.field3755) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1659(arg0, var9, var6, var10, var4.field5282[this.field3744]);
                if (this.field3755 < var6) {
                    return;
                }
                this.field3755 = (this.field3755 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "()I", line = 1380)
    public final synchronized int method1663() {
        return this.field3748 < 0 ? -this.field3748 : this.field3748;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(II[B[IIIIIIIILcn;II)I", line = 1383)
    private static final int method1664(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class237 arg11, int arg12, int arg13) {
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
        arg11.field3755 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I[B[IIIIIIIILcn;)I", line = 1415)
    private static final int method1665(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class237 arg10) {
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
        arg10.field3755 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "()V", line = 1454)
    private final void method1666() {
        this.field3745 = this.field3757;
        this.field3746 = method1650(this.field3757, this.field3743);
        this.field3754 = method1645(this.field3757, this.field3743);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpc;II)V", line = 1458)
    private class237(class321 arg0, int arg1, int arg2) {
        this.field4 = arg0;
        this.field3744 = arg0.field5283;
        this.field3753 = arg0.field5279;
        this.field3749 = arg0.field5281;
        this.field3748 = arg1;
        this.field3757 = arg2;
        this.field3743 = 8192;
        this.field3755 = 0;
        this.method1666();
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lpc;III)V", line = 1469)
    private class237(class321 arg0, int arg1, int arg2, int arg3) {
        this.field4 = arg0;
        this.field3744 = arg0.field5283;
        this.field3753 = arg0.field5279;
        this.field3749 = arg0.field5281;
        this.field3748 = arg1;
        this.field3757 = arg2;
        this.field3743 = arg3;
        this.field3755 = 0;
        this.method1666();
    }
}
