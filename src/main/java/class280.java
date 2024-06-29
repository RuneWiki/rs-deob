import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class280 extends class37 {

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    private int field3778;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Z")
    private boolean field3771;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    private int field3775;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    private int field3772;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    private int field3779;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    private int field3780;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
    public final synchronized void method1575(int arg0) {
        this.field3783 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([B[IIIIIIIILwl;)I")
    private static final int method1576(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class280 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3772 += (var14 - arg3) * arg9.field3779;
        arg9.field3780 += (var14 - arg3) * arg9.field3782;
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
        arg9.field3784 = var12 >> 2;
        arg9.field3777 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I")
    private static final int method1577(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()I")
    public final int method241() {
        int var1 = this.field3784 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3783 == 0) {
            var2 -= this.field3777 * var2 / (((class286) super.field508).field3842.length << 8);
        } else if (this.field3783 >= 0) {
            var2 -= this.field3774 * var2 / ((class286) super.field508).field3842.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II[B[IIIIIIIILwl;II)I")
    private static final int method1578(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class280 arg11, int arg12, int arg13) {
        arg11.field3772 -= arg11.field3779 * arg5;
        arg11.field3780 -= arg11.field3782 * arg5;
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
        arg11.field3772 += arg11.field3779 * arg5;
        arg11.field3780 += arg11.field3782 * arg5;
        arg11.field3784 = arg6;
        arg11.field3777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V")
    public final synchronized void method1579(int arg0) {
        if (this.field3775 < 0) {
            this.field3775 = -arg0;
        } else {
            this.field3775 = arg0;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()Ldm;")
    public final class37 method242() {
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V")
    public final synchronized void method1580(int arg0) {
        if (arg0 == 0) {
            this.method1584(0);
            this.method2946(-114);
        } else if (this.field3772 == 0 && this.field3780 == 0) {
            this.field3785 = 0;
            this.field3773 = 0;
            this.field3784 = 0;
            this.method2946(-122);
        } else {
            int var2 = -this.field3784;
            if (this.field3784 > var2) {
                var2 = this.field3784;
            }
            if (-this.field3772 > var2) {
                var2 = -this.field3772;
            }
            if (this.field3772 > var2) {
                var2 = this.field3772;
            }
            if (-this.field3780 > var2) {
                var2 = -this.field3780;
            }
            if (this.field3780 > var2) {
                var2 = this.field3780;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3785 = arg0;
            this.field3773 = Integer.MIN_VALUE;
            this.field3781 = -this.field3784 / arg0;
            this.field3779 = -this.field3772 / arg0;
            this.field3782 = -this.field3780 / arg0;
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "()I")
    public final synchronized int method1581() {
        return this.field3775 < 0 ? -this.field3775 : this.field3775;
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V")
    public final synchronized void method1582(int arg0) {
        int var2 = ((class286) super.field508).field3842.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3777 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "()I")
    public final synchronized int method1583() {
        return this.field3776 < 0 ? -1 : this.field3776;
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)V")
    private final synchronized void method1584(int arg0) {
        this.method1606(arg0, this.method1583());
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final synchronized void method239(int arg0) {
        if (this.field3785 > 0) {
            if (arg0 >= this.field3785) {
                if (this.field3773 == Integer.MIN_VALUE) {
                    this.field3773 = 0;
                    this.field3784 = this.field3772 = this.field3780 = 0;
                    this.method2946(-104);
                    arg0 = this.field3785;
                }
                this.field3785 = 0;
                this.method1585();
            } else {
                this.field3784 += this.field3781 * arg0;
                this.field3772 += this.field3779 * arg0;
                this.field3780 += this.field3782 * arg0;
                this.field3785 -= arg0;
            }
        }
        class286 var2 = (class286) super.field508;
        int var3 = this.field3774 << 8;
        int var4 = this.field3778 << 8;
        int var5 = var2.field3842.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3783 = 0;
        }
        if (this.field3777 < 0) {
            if (this.field3775 <= 0) {
                this.method1614();
                this.method2946(-102);
                return;
            }
            this.field3777 = 0;
        }
        if (this.field3777 >= var5) {
            if (this.field3775 >= 0) {
                this.method1614();
                this.method2946(-99);
                return;
            }
            this.field3777 = var5 - 1;
        }
        this.field3777 += this.field3775 * arg0;
        if (this.field3783 < 0) {
            if (!this.field3771) {
                if (this.field3775 < 0) {
                    if (this.field3777 < var3) {
                        this.field3777 = var4 - 1 - (var4 - 1 - this.field3777) % var6;
                    }
                } else if (this.field3777 >= var4) {
                    this.field3777 = (this.field3777 - var3) % var6 + var3;
                }
            } else {
                if (this.field3775 < 0) {
                    if (this.field3777 >= var3) {
                        return;
                    }
                    this.field3777 = var3 + var3 - 1 - this.field3777;
                    this.field3775 = -this.field3775;
                }
                while (this.field3777 >= var4) {
                    this.field3777 = var4 + var4 - 1 - this.field3777;
                    this.field3775 = -this.field3775;
                    if (this.field3777 >= var3) {
                        return;
                    }
                    this.field3777 = var3 + var3 - 1 - this.field3777;
                    this.field3775 = -this.field3775;
                }
            }
        } else {
            if (this.field3783 > 0) {
                if (this.field3771) {
                    label125: {
                        if (this.field3775 < 0) {
                            if (this.field3777 >= var3) {
                                return;
                            }
                            this.field3777 = var3 + var3 - 1 - this.field3777;
                            this.field3775 = -this.field3775;
                            if (--this.field3783 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3777 < var4) {
                                return;
                            }
                            this.field3777 = var4 + var4 - 1 - this.field3777;
                            this.field3775 = -this.field3775;
                            if (--this.field3783 == 0) {
                                break;
                            }
                            if (this.field3777 >= var3) {
                                return;
                            }
                            this.field3777 = var3 + var3 - 1 - this.field3777;
                            this.field3775 = -this.field3775;
                        } while (--this.field3783 != 0);
                    }
                } else if (this.field3775 < 0) {
                    if (this.field3777 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3777) / var6;
                    if (var7 < this.field3783) {
                        this.field3777 += var6 * var7;
                        this.field3783 -= var7;
                        return;
                    }
                    this.field3777 += this.field3783 * var6;
                    this.field3783 = 0;
                } else {
                    if (this.field3777 < var4) {
                        return;
                    }
                    int var8 = (this.field3777 - var3) / var6;
                    if (var8 < this.field3783) {
                        this.field3777 -= var6 * var8;
                        this.field3783 -= var8;
                        return;
                    }
                    this.field3777 -= this.field3783 * var6;
                    this.field3783 = 0;
                }
            }
            if (this.field3775 < 0) {
                if (this.field3777 < 0) {
                    this.field3777 = -1;
                    this.method1614();
                    this.method2946(-109);
                    return;
                }
            } else if (this.field3777 >= var5) {
                this.field3777 = var5;
                this.method1614();
                this.method2946(-96);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "()V")
    private final void method1585() {
        this.field3784 = this.field3773;
        this.field3772 = method1577(this.field3773, this.field3776);
        this.field3780 = method1595(this.field3773, this.field3776);
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "()Z")
    public final boolean method1586() {
        return this.field3785 != 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lnv;II)Lwl;")
    public static final class280 method1587(class286 arg0, int arg1, int arg2) {
        return arg0.field3842 != null && arg0.field3842.length != 0 ? new class280(arg0, (int) ((long) arg0.field3841 * 256L * (long) arg1 / (long) (class12.field141 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "([B[IIIIIIIILwl;)I")
    private static final int method1588(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class280 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3772 += (var14 - arg3) * arg9.field3779;
        arg9.field3780 += (var14 - arg3) * arg9.field3782;
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
        arg9.field3784 = var12 >> 2;
        arg9.field3777 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II[B[IIIIIIIIIILwl;II)I")
    private static final int method1589(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class280 arg13, int arg14, int arg15) {
        arg13.field3784 -= arg13.field3781 * arg5;
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
        arg13.field3784 += arg13.field3781 * var22;
        arg13.field3772 = arg6;
        arg13.field3780 = arg7;
        arg13.field3777 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B[IIIIIIIILwl;)I")
    private static final int method1590(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class280 arg10) {
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
        arg10.field3777 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([B[IIIIIIILwl;)I")
    private static final int method1591(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class280 arg8) {
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
        arg8.field3777 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II[B[IIIIIIIILwl;II)I")
    private static final int method1592(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class280 arg11, int arg12, int arg13) {
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
        arg11.field3777 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "()I")
    public final synchronized int method1593() {
        return this.field3773 == Integer.MIN_VALUE ? 0 : this.field3773;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[B[IIIIIIIIIILwl;)I")
    private static final int method1594(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class280 arg12) {
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
        arg12.field3784 += (var19 - arg4) * arg12.field3781;
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
        arg12.field3772 = var15 >> 2;
        arg12.field3780 = var16 >> 2;
        arg12.field3777 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)I")
    private static final int method1595(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "()Ldm;")
    public final class37 method244() {
        return null;
    }

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "()Z")
    private final boolean method1596() {
        int var1 = this.field3773;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1577(var1, this.field3776);
            var2 = method1595(var1, this.field3776);
        }
        if (this.field3784 == var1 && this.field3772 == var3 && this.field3780 == var2) {
            if (this.field3773 == Integer.MIN_VALUE) {
                this.field3773 = 0;
                this.field3784 = this.field3772 = this.field3780 = 0;
                this.method2946(-119);
                return true;
            } else {
                this.method1585();
                return false;
            }
        } else {
            if (this.field3784 < var1) {
                this.field3781 = 1;
                this.field3785 = var1 - this.field3784;
            } else if (this.field3784 > var1) {
                this.field3781 = -1;
                this.field3785 = this.field3784 - var1;
            } else {
                this.field3781 = 0;
            }
            if (this.field3772 < var3) {
                this.field3779 = 1;
                if (this.field3785 == 0 || this.field3785 > var3 - this.field3772) {
                    this.field3785 = var3 - this.field3772;
                }
            } else if (this.field3772 > var3) {
                this.field3779 = -1;
                if (this.field3785 == 0 || this.field3785 > this.field3772 - var3) {
                    this.field3785 = this.field3772 - var3;
                }
            } else {
                this.field3779 = 0;
            }
            if (this.field3780 < var2) {
                this.field3782 = 1;
                if (this.field3785 == 0 || this.field3785 > var2 - this.field3780) {
                    this.field3785 = var2 - this.field3780;
                }
            } else if (this.field3780 > var2) {
                this.field3782 = -1;
                if (this.field3785 == 0 || this.field3785 > this.field3780 - var2) {
                    this.field3785 = this.field3780 - var2;
                }
            } else {
                this.field3782 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([IIIII)I")
    private final int method1597(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3785 <= 0) {
                if (this.field3775 == 256 && (this.field3777 & 255) == 0) {
                    if (class149.field2109) {
                        return method1613(0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, 0, arg3, arg2, this);
                    }
                    return method1591(((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, 0, arg3, arg2, this);
                }
                if (class149.field2109) {
                    return method1592(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, 0, arg3, arg2, this, this.field3775, arg4);
                }
                return method1608(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, 0, arg3, arg2, this, this.field3775, arg4);
            }
            int var6 = this.field3785 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3785 += arg1;
            if (this.field3775 == 256 && (this.field3777 & 255) == 0) {
                if (class149.field2109) {
                    arg1 = method1598(0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, this.field3779, this.field3782, 0, var6, arg2, this);
                } else {
                    arg1 = method1576(((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, this.field3781, 0, var6, arg2, this);
                }
            } else if (class149.field2109) {
                arg1 = method1589(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, this.field3779, this.field3782, 0, var6, arg2, this, this.field3775, arg4);
            } else {
                arg1 = method1612(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, this.field3781, 0, var6, arg2, this, this.field3775, arg4);
            }
            this.field3785 -= arg1;
            if (this.field3785 != 0) {
                return arg1;
            }
        } while (!this.method1596());
        return arg3;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I[B[IIIIIIIIIILwl;)I")
    private static final int method1598(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class280 arg12) {
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
        arg12.field3784 += (var19 - arg4) * arg12.field3781;
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
        arg12.field3772 = var15 >> 2;
        arg12.field3780 = var16 >> 2;
        arg12.field3777 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "(I)V")
    public final synchronized void method1599(int arg0) {
        this.method1606(arg0 << 6, this.method1583());
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()I")
    public final int method238() {
        return this.field3773 == 0 && this.field3785 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II[B[IIIIIIILwl;II)I")
    private static final int method1600(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class280 arg10, int arg11, int arg12) {
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
        arg10.field3777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
    public final synchronized void method1601(boolean arg0) {
        this.field3775 = (this.field3775 >>> 31) + (this.field3775 ^ this.field3775 >> 31);
        if (arg0) {
            this.field3775 = -this.field3775;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)V")
    public final synchronized void method1602(int arg0, int arg1) {
        this.method1610(arg0, arg1, this.method1583());
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lnv;III)Lwl;")
    public static final class280 method1603(class286 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3842 != null && arg0.field3842.length != 0 ? new class280(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II[B[IIIIIIIILwl;II)I")
    private static final int method1604(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class280 arg11, int arg12, int arg13) {
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
        arg11.field3777 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "([IIIII)I")
    private final int method1605(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3785 <= 0) {
                if (this.field3775 == -256 && (this.field3777 & 255) == 0) {
                    if (class149.field2109) {
                        return method1590(0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, 0, arg3, arg2, this);
                    }
                    return method1611(((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, 0, arg3, arg2, this);
                }
                if (class149.field2109) {
                    return method1604(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, 0, arg3, arg2, this, this.field3775, arg4);
                }
                return method1600(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, 0, arg3, arg2, this, this.field3775, arg4);
            }
            int var6 = this.field3785 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3785 += arg1;
            if (this.field3775 == -256 && (this.field3777 & 255) == 0) {
                if (class149.field2109) {
                    arg1 = method1594(0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, this.field3779, this.field3782, 0, var6, arg2, this);
                } else {
                    arg1 = method1588(((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, this.field3781, 0, var6, arg2, this);
                }
            } else if (class149.field2109) {
                arg1 = method1607(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3772, this.field3780, this.field3779, this.field3782, 0, var6, arg2, this, this.field3775, arg4);
            } else {
                arg1 = method1578(0, 0, ((class286) super.field508).field3842, arg0, this.field3777, arg1, this.field3784, this.field3781, 0, var6, arg2, this, this.field3775, arg4);
            }
            this.field3785 -= arg1;
            if (this.field3785 != 0) {
                return arg1;
            }
        } while (!this.method1596());
        return arg3;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(II)V")
    private final synchronized void method1606(int arg0, int arg1) {
        this.field3773 = arg0;
        this.field3776 = arg1;
        this.field3785 = 0;
        this.method1585();
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II[B[IIIIIIIIIILwl;II)I")
    private static final int method1607(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class280 arg13, int arg14, int arg15) {
        arg13.field3784 -= arg13.field3781 * arg5;
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
        arg13.field3784 += arg13.field3781 * var22;
        arg13.field3772 = arg6;
        arg13.field3780 = arg7;
        arg13.field3777 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II[B[IIIIIIILwl;II)I")
    private static final int method1608(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class280 arg10, int arg11, int arg12) {
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
        arg10.field3777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "()Z")
    public final boolean method1609() {
        return this.field3777 < 0 || this.field3777 >= ((class286) super.field508).field3842.length << 8;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
    public final synchronized void method1610(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1606(arg1, arg2);
        } else {
            int var4 = method1577(arg1, arg2);
            int var5 = method1595(arg1, arg2);
            if (this.field3772 == var4 && this.field3780 == var5) {
                this.field3785 = 0;
            } else {
                int var6 = arg1 - this.field3784;
                if (this.field3784 - arg1 > var6) {
                    var6 = this.field3784 - arg1;
                }
                if (var4 - this.field3772 > var6) {
                    var6 = var4 - this.field3772;
                }
                if (this.field3772 - var4 > var6) {
                    var6 = this.field3772 - var4;
                }
                if (var5 - this.field3780 > var6) {
                    var6 = var5 - this.field3780;
                }
                if (this.field3780 - var5 > var6) {
                    var6 = this.field3780 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3785 = arg0;
                this.field3773 = arg1;
                this.field3776 = arg2;
                this.field3781 = (arg1 - this.field3784) / arg0;
                this.field3779 = (var4 - this.field3772) / arg0;
                this.field3782 = (var5 - this.field3780) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "([B[IIIIIIILwl;)I")
    private static final int method1611(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class280 arg8) {
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
        arg8.field3777 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([III)V")
    public final synchronized void method240(int[] arg0, int arg1, int arg2) {
        if (this.field3773 == 0 && this.field3785 == 0) {
            this.method239(arg2);
        } else {
            class286 var4 = (class286) super.field508;
            int var5 = this.field3774 << 8;
            int var6 = this.field3778 << 8;
            int var7 = var4.field3842.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3783 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3777 < 0) {
                if (this.field3775 <= 0) {
                    this.method1614();
                    this.method2946(-119);
                    return;
                }
                this.field3777 = 0;
            }
            if (this.field3777 >= var7) {
                if (this.field3775 >= 0) {
                    this.method1614();
                    this.method2946(-103);
                    return;
                }
                this.field3777 = var7 - 1;
            }
            if (this.field3783 < 0) {
                if (this.field3771) {
                    if (this.field3775 < 0) {
                        var9 = this.method1605(arg0, arg1, var5, var10, var4.field3842[this.field3774]);
                        if (this.field3777 >= var5) {
                            return;
                        }
                        this.field3777 = var5 + var5 - 1 - this.field3777;
                        this.field3775 = -this.field3775;
                    }
                    while (true) {
                        int var11 = this.method1597(arg0, var9, var6, var10, var4.field3842[this.field3778 - 1]);
                        if (this.field3777 < var6) {
                            return;
                        }
                        this.field3777 = var6 + var6 - 1 - this.field3777;
                        this.field3775 = -this.field3775;
                        var9 = this.method1605(arg0, var11, var5, var10, var4.field3842[this.field3774]);
                        if (this.field3777 >= var5) {
                            return;
                        }
                        this.field3777 = var5 + var5 - 1 - this.field3777;
                        this.field3775 = -this.field3775;
                    }
                } else if (this.field3775 < 0) {
                    while (true) {
                        var9 = this.method1605(arg0, var9, var5, var10, var4.field3842[this.field3778 - 1]);
                        if (this.field3777 >= var5) {
                            return;
                        }
                        this.field3777 = var6 - 1 - (var6 - 1 - this.field3777) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1597(arg0, var9, var6, var10, var4.field3842[this.field3774]);
                        if (this.field3777 < var6) {
                            return;
                        }
                        this.field3777 = (this.field3777 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3783 > 0) {
                    if (this.field3771) {
                        label130: {
                            if (this.field3775 < 0) {
                                var9 = this.method1605(arg0, arg1, var5, var10, var4.field3842[this.field3774]);
                                if (this.field3777 >= var5) {
                                    return;
                                }
                                this.field3777 = var5 + var5 - 1 - this.field3777;
                                this.field3775 = -this.field3775;
                                if (--this.field3783 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1597(arg0, var9, var6, var10, var4.field3842[this.field3778 - 1]);
                                if (this.field3777 < var6) {
                                    return;
                                }
                                this.field3777 = var6 + var6 - 1 - this.field3777;
                                this.field3775 = -this.field3775;
                                if (--this.field3783 == 0) {
                                    break;
                                }
                                var9 = this.method1605(arg0, var9, var5, var10, var4.field3842[this.field3774]);
                                if (this.field3777 >= var5) {
                                    return;
                                }
                                this.field3777 = var5 + var5 - 1 - this.field3777;
                                this.field3775 = -this.field3775;
                            } while (--this.field3783 != 0);
                        }
                    } else if (this.field3775 < 0) {
                        while (true) {
                            var9 = this.method1605(arg0, var9, var5, var10, var4.field3842[this.field3778 - 1]);
                            if (this.field3777 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3777) / var8;
                            if (var12 >= this.field3783) {
                                this.field3777 += this.field3783 * var8;
                                this.field3783 = 0;
                                break;
                            }
                            this.field3777 += var8 * var12;
                            this.field3783 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1597(arg0, var9, var6, var10, var4.field3842[this.field3774]);
                            if (this.field3777 < var6) {
                                return;
                            }
                            int var13 = (this.field3777 - var5) / var8;
                            if (var13 >= this.field3783) {
                                this.field3777 -= this.field3783 * var8;
                                this.field3783 = 0;
                                break;
                            }
                            this.field3777 -= var8 * var13;
                            this.field3783 -= var13;
                        }
                    }
                }
                if (this.field3775 < 0) {
                    this.method1605(arg0, var9, 0, var10, 0);
                    if (this.field3777 < 0) {
                        this.field3777 = -1;
                        this.method1614();
                        this.method2946(-111);
                        return;
                    }
                } else {
                    this.method1597(arg0, var9, var7, var10, 0);
                    if (this.field3777 >= var7) {
                        this.field3777 = var7;
                        this.method1614();
                        this.method2946(-107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(II[B[IIIIIIIILwl;II)I")
    private static final int method1612(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class280 arg11, int arg12, int arg13) {
        arg11.field3772 -= arg11.field3779 * arg5;
        arg11.field3780 -= arg11.field3782 * arg5;
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
        arg11.field3772 += arg11.field3779 * arg5;
        arg11.field3780 += arg11.field3782 * arg5;
        arg11.field3784 = arg6;
        arg11.field3777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I[B[IIIIIIIILwl;)I")
    private static final int method1613(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class280 arg10) {
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
        arg10.field3777 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "()V")
    private final void method1614() {
        if (this.field3785 != 0) {
            if (this.field3773 == Integer.MIN_VALUE) {
                this.field3773 = 0;
            }
            this.field3785 = 0;
            this.method1585();
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lnv;II)V")
    private class280(class286 arg0, int arg1, int arg2) {
        super.field508 = arg0;
        this.field3774 = arg0.field3839;
        this.field3778 = arg0.field3838;
        this.field3771 = arg0.field3840;
        this.field3775 = arg1;
        this.field3773 = arg2;
        this.field3776 = 8192;
        this.field3777 = 0;
        this.method1585();
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lnv;III)V")
    private class280(class286 arg0, int arg1, int arg2, int arg3) {
        super.field508 = arg0;
        this.field3774 = arg0.field3839;
        this.field3778 = arg0.field3838;
        this.field3771 = arg0.field3840;
        this.field3775 = arg1;
        this.field3773 = arg2;
        this.field3776 = arg3;
        this.field3777 = 0;
        this.method1585();
    }
}
