import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class563 extends class400 {

    @OriginalMember(owner = "client!via", name = "y", descriptor = "I")
    private int field7769;

    @OriginalMember(owner = "client!via", name = "F", descriptor = "I")
    private int field7776;

    @OriginalMember(owner = "client!via", name = "E", descriptor = "Z")
    private boolean field7775;

    @OriginalMember(owner = "client!via", name = "C", descriptor = "I")
    private int field7773;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    private int field7763;

    @OriginalMember(owner = "client!via", name = "A", descriptor = "I")
    private int field7771;

    @OriginalMember(owner = "client!via", name = "G", descriptor = "I")
    private int field7777;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    private int field7764;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "I")
    private int field7765;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "I")
    private int field7766;

    @OriginalMember(owner = "client!via", name = "w", descriptor = "I")
    private int field7767;

    @OriginalMember(owner = "client!via", name = "x", descriptor = "I")
    private int field7768;

    @OriginalMember(owner = "client!via", name = "z", descriptor = "I")
    private int field7770;

    @OriginalMember(owner = "client!via", name = "B", descriptor = "I")
    private int field7772;

    @OriginalMember(owner = "client!via", name = "D", descriptor = "I")
    private int field7774;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(III)V", line = 3)
    public final synchronized void method3230(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3268(arg1, arg2);
        } else {
            int var4 = method3246(arg1, arg2);
            int var5 = method3231(arg1, arg2);
            if (this.field7764 == var4 && this.field7768 == var5) {
                this.field7766 = 0;
            } else {
                int var6 = arg1 - this.field7770;
                if (this.field7770 - arg1 > var6) {
                    var6 = this.field7770 - arg1;
                }
                if (var4 - this.field7764 > var6) {
                    var6 = var4 - this.field7764;
                }
                if (this.field7764 - var4 > var6) {
                    var6 = this.field7764 - var4;
                }
                if (var5 - this.field7768 > var6) {
                    var6 = var5 - this.field7768;
                }
                if (this.field7768 - var5 > var6) {
                    var6 = this.field7768 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7766 = arg0;
                this.field7763 = arg1;
                this.field7771 = arg2;
                this.field7767 = (arg1 - this.field7770) / arg0;
                this.field7765 = (var4 - this.field7764) / arg0;
                this.field7772 = (var5 - this.field7768) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(II)I", line = 51)
    private static final int method3231(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "()Z", line = 54)
    public final boolean method3232() {
        return this.field7777 < 0 || this.field7777 >= ((class735) super.field5906).field9908.length << 8;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V", line = 58)
    public final synchronized void method3233(boolean arg0) {
        this.field7773 = (this.field7773 >>> 31) + (this.field7773 ^ this.field7773 >> 31);
        if (arg0) {
            this.field7773 = -this.field7773;
        }
    }

    @OriginalMember(owner = "client!via", name = "f", descriptor = "()I", line = 64)
    public final synchronized int method3234() {
        return this.field7771 < 0 ? -1 : this.field7771;
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "()I", line = 68)
    public final int method2502() {
        int var1 = this.field7770 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7774 == 0) {
            var2 -= this.field7777 * var2 / (((class735) super.field5906).field9908.length << 8);
        } else if (this.field7774 >= 0) {
            var2 -= this.field7769 * var2 / ((class735) super.field5906).field9908.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I[B[IIIIIIIIIILvia;)I", line = 82)
    private static final int method3235(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class563 arg12) {
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
        arg12.field7770 += (var19 - arg4) * arg12.field7767;
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
        arg12.field7764 = var15 >> 2;
        arg12.field7768 = var16 >> 2;
        arg12.field7777 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II[B[IIIIIIIILvia;II)I", line = 135)
    private static final int method3236(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class563 arg11, int arg12, int arg13) {
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
        arg11.field7777 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!via", name = "g", descriptor = "()Z", line = 168)
    public final boolean method3237() {
        return this.field7766 != 0;
    }

    @OriginalMember(owner = "client!via", name = "h", descriptor = "()V", line = 172)
    private final void method3238() {
        if (this.field7766 != 0) {
            if (this.field7763 == Integer.MIN_VALUE) {
                this.field7763 = 0;
            }
            this.field7766 = 0;
            this.method3260();
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I[B[IIIIIIIILvia;)I", line = 183)
    private static final int method3239(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class563 arg10) {
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
        arg10.field7777 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!via", name = "i", descriptor = "()Z", line = 222)
    private final boolean method3240() {
        int var1 = this.field7763;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3246(var1, this.field7771);
            var2 = method3231(var1, this.field7771);
        }
        if (this.field7770 == var1 && this.field7764 == var3 && this.field7768 == var2) {
            if (this.field7763 == Integer.MIN_VALUE) {
                this.field7763 = 0;
                this.field7770 = this.field7764 = this.field7768 = 0;
                this.method2314((byte) 79);
                return true;
            } else {
                this.method3260();
                return false;
            }
        } else {
            if (this.field7770 < var1) {
                this.field7767 = 1;
                this.field7766 = var1 - this.field7770;
            } else if (this.field7770 > var1) {
                this.field7767 = -1;
                this.field7766 = this.field7770 - var1;
            } else {
                this.field7767 = 0;
            }
            if (this.field7764 < var3) {
                this.field7765 = 1;
                if (this.field7766 == 0 || this.field7766 > var3 - this.field7764) {
                    this.field7766 = var3 - this.field7764;
                }
            } else if (this.field7764 > var3) {
                this.field7765 = -1;
                if (this.field7766 == 0 || this.field7766 > this.field7764 - var3) {
                    this.field7766 = this.field7764 - var3;
                }
            } else {
                this.field7765 = 0;
            }
            if (this.field7768 < var2) {
                this.field7772 = 1;
                if (this.field7766 == 0 || this.field7766 > var2 - this.field7768) {
                    this.field7766 = var2 - this.field7768;
                }
            } else if (this.field7768 > var2) {
                this.field7772 = -1;
                if (this.field7766 == 0 || this.field7766 > this.field7768 - var2) {
                    this.field7766 = this.field7768 - var2;
                }
            } else {
                this.field7772 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II[B[IIIIIIIIIILvia;II)I", line = 307)
    private static final int method3241(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class563 arg13, int arg14, int arg15) {
        arg13.field7770 -= arg13.field7767 * arg5;
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
        arg13.field7770 += arg13.field7767 * var22;
        arg13.field7764 = arg6;
        arg13.field7768 = arg7;
        arg13.field7777 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I[B[IIIIIIIIIILvia;)I", line = 349)
    private static final int method3242(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class563 arg12) {
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
        arg12.field7770 += (var19 - arg4) * arg12.field7767;
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
        arg12.field7764 = var15 >> 2;
        arg12.field7768 = var16 >> 2;
        arg12.field7777 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V", line = 403)
    public final synchronized void method3243(int arg0) {
        if (this.field7773 < 0) {
            this.field7773 = -arg0;
        } else {
            this.field7773 = arg0;
        }
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(I)V", line = 410)
    public final synchronized void method3244(int arg0) {
        if (arg0 == 0) {
            this.method3265(0);
            this.method2314((byte) 93);
        } else if (this.field7764 == 0 && this.field7768 == 0) {
            this.field7766 = 0;
            this.field7763 = 0;
            this.field7770 = 0;
            this.method2314((byte) 113);
        } else {
            int var2 = -this.field7770;
            if (this.field7770 > var2) {
                var2 = this.field7770;
            }
            if (-this.field7764 > var2) {
                var2 = -this.field7764;
            }
            if (this.field7764 > var2) {
                var2 = this.field7764;
            }
            if (-this.field7768 > var2) {
                var2 = -this.field7768;
            }
            if (this.field7768 > var2) {
                var2 = this.field7768;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7766 = arg0;
            this.field7763 = Integer.MIN_VALUE;
            this.field7767 = -this.field7770 / arg0;
            this.field7765 = -this.field7764 / arg0;
            this.field7772 = -this.field7768 / arg0;
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(II[B[IIIIIIIILvia;II)I", line = 456)
    private static final int method3245(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class563 arg11, int arg12, int arg13) {
        arg11.field7764 -= arg11.field7765 * arg5;
        arg11.field7768 -= arg11.field7772 * arg5;
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
        arg11.field7764 += arg11.field7765 * arg5;
        arg11.field7768 += arg11.field7772 * arg5;
        arg11.field7770 = arg6;
        arg11.field7777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "()I", line = 490)
    public final int method111() {
        return this.field7763 == 0 && this.field7766 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(II)I", line = 496)
    private static final int method3246(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "([B[IIIIIIILvia;)I", line = 499)
    private static final int method3247(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class563 arg8) {
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
        arg8.field7777 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!via", name = "j", descriptor = "()I", line = 525)
    public final synchronized int method3248() {
        return this.field7763 == Integer.MIN_VALUE ? 0 : this.field7763;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II[B[IIIIIIILvia;II)I", line = 528)
    private static final int method3249(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class563 arg10, int arg11, int arg12) {
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
        arg10.field7777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "([B[IIIIIIIILvia;)I", line = 554)
    private static final int method3250(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class563 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7764 += (var14 - arg3) * arg9.field7765;
        arg9.field7768 += (var14 - arg3) * arg9.field7772;
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
        arg9.field7770 = var12 >> 2;
        arg9.field7777 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V", line = 588)
    public final synchronized void method3251(int arg0) {
        this.method3268(this.method3248(), arg0);
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I[B[IIIIIIIILvia;)I", line = 593)
    private static final int method3252(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class563 arg10) {
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
        arg10.field7777 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lob;III)Lvia;", line = 631)
    public static final class563 method3253(class735 arg0, int arg1, int arg2, int arg3) {
        return arg0.field9908 != null && arg0.field9908.length != 0 ? new class563(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(II[B[IIIIIIIILvia;II)I", line = 638)
    private static final int method3254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class563 arg11, int arg12, int arg13) {
        arg11.field7764 -= arg11.field7765 * arg5;
        arg11.field7768 -= arg11.field7772 * arg5;
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
        arg11.field7764 += arg11.field7765 * arg5;
        arg11.field7768 += arg11.field7772 * arg5;
        arg11.field7770 = arg6;
        arg11.field7777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "([B[IIIIIIIILvia;)I", line = 671)
    private static final int method3255(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class563 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7764 += (var14 - arg3) * arg9.field7765;
        arg9.field7768 += (var14 - arg3) * arg9.field7772;
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
        arg9.field7770 = var12 >> 2;
        arg9.field7777 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!via", name = "k", descriptor = "()I", line = 708)
    public final synchronized int method3256() {
        return this.field7773 < 0 ? -this.field7773 : this.field7773;
    }

    @OriginalMember(owner = "client!via", name = "f", descriptor = "(I)V", line = 711)
    public final synchronized void method3257(int arg0) {
        this.method3268(arg0 << 6, this.method3234());
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "()Ljba;", line = 714)
    public final class400 method69() {
        return null;
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(II)V", line = 718)
    public final synchronized void method3258(int arg0, int arg1) {
        this.method3230(arg0, arg1, this.method3234());
    }

    @OriginalMember(owner = "client!via", name = "g", descriptor = "(I)V", line = 721)
    public final synchronized void method3259(int arg0) {
        this.field7774 = arg0;
    }

    @OriginalMember(owner = "client!via", name = "l", descriptor = "()V", line = 728)
    private final void method3260() {
        this.field7770 = this.field7763;
        this.field7764 = method3246(this.field7763, this.field7771);
        this.field7768 = method3231(this.field7763, this.field7771);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "([IIIII)I", line = 733)
    private final int method3261(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7766 <= 0) {
                if (this.field7773 == 256 && (this.field7777 & 255) == 0) {
                    if (class86.field1544) {
                        return method3252(0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, 0, arg3, arg2, this);
                    }
                    return method3247(((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, 0, arg3, arg2, this);
                }
                if (class86.field1544) {
                    return method3264(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, 0, arg3, arg2, this, this.field7773, arg4);
                }
                return method3267(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, 0, arg3, arg2, this, this.field7773, arg4);
            }
            int var6 = this.field7766 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7766 += arg1;
            if (this.field7773 == 256 && (this.field7777 & 255) == 0) {
                if (class86.field1544) {
                    arg1 = method3235(0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, this.field7765, this.field7772, 0, var6, arg2, this);
                } else {
                    arg1 = method3255(((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, this.field7767, 0, var6, arg2, this);
                }
            } else if (class86.field1544) {
                arg1 = method3241(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, this.field7765, this.field7772, 0, var6, arg2, this, this.field7773, arg4);
            } else {
                arg1 = method3245(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, this.field7767, 0, var6, arg2, this, this.field7773, arg4);
            }
            this.field7766 -= arg1;
            if (this.field7766 != 0) {
                return arg1;
            }
        } while (!this.method3240());
        return arg3;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(II[B[IIIIIIIIIILvia;II)I", line = 796)
    private static final int method3262(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class563 arg13, int arg14, int arg15) {
        arg13.field7770 -= arg13.field7767 * arg5;
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
        arg13.field7770 += arg13.field7767 * var22;
        arg13.field7764 = arg6;
        arg13.field7768 = arg7;
        arg13.field7777 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "([B[IIIIIIILvia;)I", line = 837)
    private static final int method3263(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class563 arg8) {
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
        arg8.field7777 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(II[B[IIIIIIIILvia;II)I", line = 862)
    private static final int method3264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class563 arg11, int arg12, int arg13) {
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
        arg11.field7777 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!via", name = "h", descriptor = "(I)V", line = 895)
    private final synchronized void method3265(int arg0) {
        this.method3268(arg0, this.method3234());
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "([III)V", line = 898)
    public final synchronized void method92(int[] arg0, int arg1, int arg2) {
        if (this.field7763 == 0 && this.field7766 == 0) {
            this.method89(arg2);
        } else {
            class735 var4 = (class735) super.field5906;
            int var5 = this.field7769 << 8;
            int var6 = this.field7776 << 8;
            int var7 = var4.field9908.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7774 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7777 < 0) {
                if (this.field7773 <= 0) {
                    this.method3238();
                    this.method2314((byte) 83);
                    return;
                }
                this.field7777 = 0;
            }
            if (this.field7777 >= var7) {
                if (this.field7773 >= 0) {
                    this.method3238();
                    this.method2314((byte) 81);
                    return;
                }
                this.field7777 = var7 - 1;
            }
            if (this.field7774 < 0) {
                if (this.field7775) {
                    if (this.field7773 < 0) {
                        var9 = this.method3269(arg0, arg1, var5, var10, var4.field9908[this.field7769]);
                        if (this.field7777 >= var5) {
                            return;
                        }
                        this.field7777 = var5 + var5 - 1 - this.field7777;
                        this.field7773 = -this.field7773;
                    }
                    while (true) {
                        int var11 = this.method3261(arg0, var9, var6, var10, var4.field9908[this.field7776 - 1]);
                        if (this.field7777 < var6) {
                            return;
                        }
                        this.field7777 = var6 + var6 - 1 - this.field7777;
                        this.field7773 = -this.field7773;
                        var9 = this.method3269(arg0, var11, var5, var10, var4.field9908[this.field7769]);
                        if (this.field7777 >= var5) {
                            return;
                        }
                        this.field7777 = var5 + var5 - 1 - this.field7777;
                        this.field7773 = -this.field7773;
                    }
                } else if (this.field7773 < 0) {
                    while (true) {
                        var9 = this.method3269(arg0, var9, var5, var10, var4.field9908[this.field7776 - 1]);
                        if (this.field7777 >= var5) {
                            return;
                        }
                        this.field7777 = var6 - 1 - (var6 - 1 - this.field7777) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3261(arg0, var9, var6, var10, var4.field9908[this.field7769]);
                        if (this.field7777 < var6) {
                            return;
                        }
                        this.field7777 = (this.field7777 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7774 > 0) {
                    if (this.field7775) {
                        label130: {
                            if (this.field7773 < 0) {
                                var9 = this.method3269(arg0, arg1, var5, var10, var4.field9908[this.field7769]);
                                if (this.field7777 >= var5) {
                                    return;
                                }
                                this.field7777 = var5 + var5 - 1 - this.field7777;
                                this.field7773 = -this.field7773;
                                if (--this.field7774 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3261(arg0, var9, var6, var10, var4.field9908[this.field7776 - 1]);
                                if (this.field7777 < var6) {
                                    return;
                                }
                                this.field7777 = var6 + var6 - 1 - this.field7777;
                                this.field7773 = -this.field7773;
                                if (--this.field7774 == 0) {
                                    break;
                                }
                                var9 = this.method3269(arg0, var9, var5, var10, var4.field9908[this.field7769]);
                                if (this.field7777 >= var5) {
                                    return;
                                }
                                this.field7777 = var5 + var5 - 1 - this.field7777;
                                this.field7773 = -this.field7773;
                            } while (--this.field7774 != 0);
                        }
                    } else if (this.field7773 < 0) {
                        while (true) {
                            var9 = this.method3269(arg0, var9, var5, var10, var4.field9908[this.field7776 - 1]);
                            if (this.field7777 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7777) / var8;
                            if (var12 >= this.field7774) {
                                this.field7777 += this.field7774 * var8;
                                this.field7774 = 0;
                                break;
                            }
                            this.field7777 += var8 * var12;
                            this.field7774 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3261(arg0, var9, var6, var10, var4.field9908[this.field7769]);
                            if (this.field7777 < var6) {
                                return;
                            }
                            int var13 = (this.field7777 - var5) / var8;
                            if (var13 >= this.field7774) {
                                this.field7777 -= this.field7774 * var8;
                                this.field7774 = 0;
                                break;
                            }
                            this.field7777 -= var8 * var13;
                            this.field7774 -= var13;
                        }
                    }
                }
                if (this.field7773 < 0) {
                    this.method3269(arg0, var9, 0, var10, 0);
                    if (this.field7777 < 0) {
                        this.field7777 = -1;
                        this.method3238();
                        this.method2314((byte) 24);
                        return;
                    }
                } else {
                    this.method3261(arg0, var9, var7, var10, 0);
                    if (this.field7777 >= var7) {
                        this.field7777 = var7;
                        this.method3238();
                        this.method2314((byte) 93);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "i", descriptor = "(I)V", line = 1135)
    public final synchronized void method3266(int arg0) {
        int var2 = ((class735) super.field5906).field9908.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7777 = arg0;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "()Ljba;", line = 1146)
    public final class400 method103() {
        return null;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(II[B[IIIIIIILvia;II)I", line = 1149)
    private static final int method3267(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class563 arg10, int arg11, int arg12) {
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
        arg10.field7777 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!via", name = "f", descriptor = "(II)V", line = 1175)
    private final synchronized void method3268(int arg0, int arg1) {
        this.field7763 = arg0;
        this.field7771 = arg1;
        this.field7766 = 0;
        this.method3260();
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V", line = 1181)
    public final synchronized void method89(int arg0) {
        if (this.field7766 > 0) {
            if (arg0 >= this.field7766) {
                if (this.field7763 == Integer.MIN_VALUE) {
                    this.field7763 = 0;
                    this.field7770 = this.field7764 = this.field7768 = 0;
                    this.method2314((byte) 52);
                    arg0 = this.field7766;
                }
                this.field7766 = 0;
                this.method3260();
            } else {
                this.field7770 += this.field7767 * arg0;
                this.field7764 += this.field7765 * arg0;
                this.field7768 += this.field7772 * arg0;
                this.field7766 -= arg0;
            }
        }
        class735 var2 = (class735) super.field5906;
        int var3 = this.field7769 << 8;
        int var4 = this.field7776 << 8;
        int var5 = var2.field9908.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7774 = 0;
        }
        if (this.field7777 < 0) {
            if (this.field7773 <= 0) {
                this.method3238();
                this.method2314((byte) 60);
                return;
            }
            this.field7777 = 0;
        }
        if (this.field7777 >= var5) {
            if (this.field7773 >= 0) {
                this.method3238();
                this.method2314((byte) 93);
                return;
            }
            this.field7777 = var5 - 1;
        }
        this.field7777 += this.field7773 * arg0;
        if (this.field7774 < 0) {
            if (!this.field7775) {
                if (this.field7773 < 0) {
                    if (this.field7777 < var3) {
                        this.field7777 = var4 - 1 - (var4 - 1 - this.field7777) % var6;
                    }
                } else if (this.field7777 >= var4) {
                    this.field7777 = (this.field7777 - var3) % var6 + var3;
                }
            } else {
                if (this.field7773 < 0) {
                    if (this.field7777 >= var3) {
                        return;
                    }
                    this.field7777 = var3 + var3 - 1 - this.field7777;
                    this.field7773 = -this.field7773;
                }
                while (this.field7777 >= var4) {
                    this.field7777 = var4 + var4 - 1 - this.field7777;
                    this.field7773 = -this.field7773;
                    if (this.field7777 >= var3) {
                        return;
                    }
                    this.field7777 = var3 + var3 - 1 - this.field7777;
                    this.field7773 = -this.field7773;
                }
            }
        } else {
            if (this.field7774 > 0) {
                if (this.field7775) {
                    label125: {
                        if (this.field7773 < 0) {
                            if (this.field7777 >= var3) {
                                return;
                            }
                            this.field7777 = var3 + var3 - 1 - this.field7777;
                            this.field7773 = -this.field7773;
                            if (--this.field7774 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7777 < var4) {
                                return;
                            }
                            this.field7777 = var4 + var4 - 1 - this.field7777;
                            this.field7773 = -this.field7773;
                            if (--this.field7774 == 0) {
                                break;
                            }
                            if (this.field7777 >= var3) {
                                return;
                            }
                            this.field7777 = var3 + var3 - 1 - this.field7777;
                            this.field7773 = -this.field7773;
                        } while (--this.field7774 != 0);
                    }
                } else if (this.field7773 < 0) {
                    if (this.field7777 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7777) / var6;
                    if (var7 < this.field7774) {
                        this.field7777 += var6 * var7;
                        this.field7774 -= var7;
                        return;
                    }
                    this.field7777 += this.field7774 * var6;
                    this.field7774 = 0;
                } else {
                    if (this.field7777 < var4) {
                        return;
                    }
                    int var8 = (this.field7777 - var3) / var6;
                    if (var8 < this.field7774) {
                        this.field7777 -= var6 * var8;
                        this.field7774 -= var8;
                        return;
                    }
                    this.field7777 -= this.field7774 * var6;
                    this.field7774 = 0;
                }
            }
            if (this.field7773 < 0) {
                if (this.field7777 < 0) {
                    this.field7777 = -1;
                    this.method3238();
                    this.method2314((byte) 126);
                    return;
                }
            } else if (this.field7777 >= var5) {
                this.field7777 = var5;
                this.method3238();
                this.method2314((byte) 55);
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lob;III)V", line = 1399)
    private class563(class735 arg0, int arg1, int arg2, int arg3) {
        super.field5906 = arg0;
        this.field7769 = arg0.field9910;
        this.field7776 = arg0.field9909;
        this.field7775 = arg0.field9911;
        this.field7773 = arg1;
        this.field7763 = arg2;
        this.field7771 = arg3;
        this.field7777 = 0;
        this.method3260();
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "([IIIII)I", line = 1412)
    private final int method3269(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7766 <= 0) {
                if (this.field7773 == -256 && (this.field7777 & 255) == 0) {
                    if (class86.field1544) {
                        return method3239(0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, 0, arg3, arg2, this);
                    }
                    return method3263(((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, 0, arg3, arg2, this);
                }
                if (class86.field1544) {
                    return method3236(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, 0, arg3, arg2, this, this.field7773, arg4);
                }
                return method3249(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, 0, arg3, arg2, this, this.field7773, arg4);
            }
            int var6 = this.field7766 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7766 += arg1;
            if (this.field7773 == -256 && (this.field7777 & 255) == 0) {
                if (class86.field1544) {
                    arg1 = method3242(0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, this.field7765, this.field7772, 0, var6, arg2, this);
                } else {
                    arg1 = method3250(((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, this.field7767, 0, var6, arg2, this);
                }
            } else if (class86.field1544) {
                arg1 = method3262(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7764, this.field7768, this.field7765, this.field7772, 0, var6, arg2, this, this.field7773, arg4);
            } else {
                arg1 = method3254(0, 0, ((class735) super.field5906).field9908, arg0, this.field7777, arg1, this.field7770, this.field7767, 0, var6, arg2, this, this.field7773, arg4);
            }
            this.field7766 -= arg1;
            if (this.field7766 != 0) {
                return arg1;
            }
        } while (!this.method3240());
        return arg3;
    }
}
