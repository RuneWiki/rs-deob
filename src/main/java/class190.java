import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class190 extends class50 {

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    private int field2666;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    private int field2663;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
    private boolean field2655;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    private int field2660;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    private int field2657;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    private int field2665;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    private int field2664;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    private int field2653;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    private int field2658;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    private int field2667;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "()Z", line = 3)
    public final boolean method1294() {
        return this.field2664 < 0 || this.field2664 >= ((class179) super.field629).field2542.length << 8;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([B[IIIIIIIILhh;)I", line = 6)
    private static final int method1295(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class190 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2667 += (var14 - arg3) * arg9.field2661;
        arg9.field2659 += (var14 - arg3) * arg9.field2654;
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
        arg9.field2658 = var12 >> 2;
        arg9.field2664 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[B[IIIIIIILhh;II)I", line = 40)
    private static final int method1296(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class190 arg10, int arg11, int arg12) {
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
        arg10.field2664 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()I", line = 67)
    public final int method391() {
        int var1 = this.field2658 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2653 == 0) {
            var2 -= this.field2664 * var2 / (((class179) super.field629).field2542.length << 8);
        } else if (this.field2653 >= 0) {
            var2 -= this.field2666 * var2 / ((class179) super.field629).field2542.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "()Z", line = 83)
    private final boolean method1297() {
        int var1 = this.field2657;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1330(var1, this.field2665);
            var2 = method1310(var1, this.field2665);
        }
        if (this.field2658 == var1 && this.field2667 == var3 && this.field2659 == var2) {
            if (this.field2657 == Integer.MIN_VALUE) {
                this.field2657 = 0;
                this.field2658 = this.field2667 = this.field2659 = 0;
                this.method1820(-25246);
                return true;
            } else {
                this.method1305();
                return false;
            }
        } else {
            if (this.field2658 < var1) {
                this.field2656 = 1;
                this.field2662 = var1 - this.field2658;
            } else if (this.field2658 > var1) {
                this.field2656 = -1;
                this.field2662 = this.field2658 - var1;
            } else {
                this.field2656 = 0;
            }
            if (this.field2667 < var3) {
                this.field2661 = 1;
                if (this.field2662 == 0 || this.field2662 > var3 - this.field2667) {
                    this.field2662 = var3 - this.field2667;
                }
            } else if (this.field2667 > var3) {
                this.field2661 = -1;
                if (this.field2662 == 0 || this.field2662 > this.field2667 - var3) {
                    this.field2662 = this.field2667 - var3;
                }
            } else {
                this.field2661 = 0;
            }
            if (this.field2659 < var2) {
                this.field2654 = 1;
                if (this.field2662 == 0 || this.field2662 > var2 - this.field2659) {
                    this.field2662 = var2 - this.field2659;
                }
            } else if (this.field2659 > var2) {
                this.field2654 = -1;
                if (this.field2662 == 0 || this.field2662 > this.field2659 - var2) {
                    this.field2662 = this.field2659 - var2;
                }
            } else {
                this.field2654 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "()I", line = 171)
    public final int method284() {
        return this.field2657 == 0 && this.field2662 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 178)
    public final synchronized void method1298(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1323(arg1, arg2);
        } else {
            int var4 = method1330(arg1, arg2);
            int var5 = method1310(arg1, arg2);
            if (this.field2667 == var4 && this.field2659 == var5) {
                this.field2662 = 0;
            } else {
                int var6 = arg1 - this.field2658;
                if (this.field2658 - arg1 > var6) {
                    var6 = this.field2658 - arg1;
                }
                if (var4 - this.field2667 > var6) {
                    var6 = var4 - this.field2667;
                }
                if (this.field2667 - var4 > var6) {
                    var6 = this.field2667 - var4;
                }
                if (var5 - this.field2659 > var6) {
                    var6 = var5 - this.field2659;
                }
                if (this.field2659 - var5 > var6) {
                    var6 = this.field2659 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2662 = arg0;
                this.field2657 = arg1;
                this.field2665 = arg2;
                this.field2656 = (arg1 - this.field2658) / arg0;
                this.field2661 = (var4 - this.field2667) / arg0;
                this.field2654 = (var5 - this.field2659) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[B[IIIIIIIILhh;II)I", line = 224)
    private static final int method1299(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class190 arg11, int arg12, int arg13) {
        arg11.field2667 -= arg11.field2661 * arg5;
        arg11.field2659 -= arg11.field2654 * arg5;
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
        arg11.field2667 += arg11.field2661 * arg5;
        arg11.field2659 += arg11.field2654 * arg5;
        arg11.field2658 = arg6;
        arg11.field2664 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "()Z", line = 257)
    public final boolean method1300() {
        return this.field2662 != 0;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II[B[IIIIIIIILhh;II)I", line = 260)
    private static final int method1301(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class190 arg11, int arg12, int arg13) {
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
        arg11.field2664 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II[B[IIIIIIILhh;II)I", line = 293)
    private static final int method1302(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class190 arg10, int arg11, int arg12) {
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
        arg10.field2664 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([B[IIIIIIILhh;)I", line = 320)
    private static final int method1303(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class190 arg8) {
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
        arg8.field2664 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[B[IIIIIIIIIILhh;)I", line = 345)
    private static final int method1304(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class190 arg12) {
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
        arg12.field2658 += (var19 - arg4) * arg12.field2656;
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
        arg12.field2667 = var15 >> 2;
        arg12.field2659 = var16 >> 2;
        arg12.field2664 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "()V", line = 398)
    private final void method1305() {
        this.field2658 = this.field2657;
        this.field2667 = method1330(this.field2657, this.field2665);
        this.field2659 = method1310(this.field2657, this.field2665);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II[B[IIIIIIIILhh;II)I", line = 403)
    private static final int method1306(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class190 arg11, int arg12, int arg13) {
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
        arg11.field2664 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 435)
    public final synchronized void method286(int arg0) {
        if (this.field2662 > 0) {
            if (arg0 >= this.field2662) {
                if (this.field2657 == Integer.MIN_VALUE) {
                    this.field2657 = 0;
                    this.field2658 = this.field2667 = this.field2659 = 0;
                    this.method1820(-25246);
                    arg0 = this.field2662;
                }
                this.field2662 = 0;
                this.method1305();
            } else {
                this.field2658 += this.field2656 * arg0;
                this.field2667 += this.field2661 * arg0;
                this.field2659 += this.field2654 * arg0;
                this.field2662 -= arg0;
            }
        }
        class179 var2 = (class179) super.field629;
        int var3 = this.field2666 << 8;
        int var4 = this.field2663 << 8;
        int var5 = var2.field2542.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2653 = 0;
        }
        if (this.field2664 < 0) {
            if (this.field2660 <= 0) {
                this.method1316();
                this.method1820(-25246);
                return;
            }
            this.field2664 = 0;
        }
        if (this.field2664 >= var5) {
            if (this.field2660 >= 0) {
                this.method1316();
                this.method1820(-25246);
                return;
            }
            this.field2664 = var5 - 1;
        }
        this.field2664 += this.field2660 * arg0;
        if (this.field2653 < 0) {
            if (!this.field2655) {
                if (this.field2660 < 0) {
                    if (this.field2664 < var3) {
                        this.field2664 = var4 - 1 - (var4 - 1 - this.field2664) % var6;
                    }
                } else if (this.field2664 >= var4) {
                    this.field2664 = (this.field2664 - var3) % var6 + var3;
                }
            } else {
                if (this.field2660 < 0) {
                    if (this.field2664 >= var3) {
                        return;
                    }
                    this.field2664 = var3 + var3 - 1 - this.field2664;
                    this.field2660 = -this.field2660;
                }
                while (this.field2664 >= var4) {
                    this.field2664 = var4 + var4 - 1 - this.field2664;
                    this.field2660 = -this.field2660;
                    if (this.field2664 >= var3) {
                        return;
                    }
                    this.field2664 = var3 + var3 - 1 - this.field2664;
                    this.field2660 = -this.field2660;
                }
            }
        } else {
            if (this.field2653 > 0) {
                if (this.field2655) {
                    label125: {
                        if (this.field2660 < 0) {
                            if (this.field2664 >= var3) {
                                return;
                            }
                            this.field2664 = var3 + var3 - 1 - this.field2664;
                            this.field2660 = -this.field2660;
                            if (--this.field2653 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2664 < var4) {
                                return;
                            }
                            this.field2664 = var4 + var4 - 1 - this.field2664;
                            this.field2660 = -this.field2660;
                            if (--this.field2653 == 0) {
                                break;
                            }
                            if (this.field2664 >= var3) {
                                return;
                            }
                            this.field2664 = var3 + var3 - 1 - this.field2664;
                            this.field2660 = -this.field2660;
                        } while (--this.field2653 != 0);
                    }
                } else if (this.field2660 < 0) {
                    if (this.field2664 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2664) / var6;
                    if (var7 < this.field2653) {
                        this.field2664 += var6 * var7;
                        this.field2653 -= var7;
                        return;
                    }
                    this.field2664 += this.field2653 * var6;
                    this.field2653 = 0;
                } else {
                    if (this.field2664 < var4) {
                        return;
                    }
                    int var8 = (this.field2664 - var3) / var6;
                    if (var8 < this.field2653) {
                        this.field2664 -= var6 * var8;
                        this.field2653 -= var8;
                        return;
                    }
                    this.field2664 -= this.field2653 * var6;
                    this.field2653 = 0;
                }
            }
            if (this.field2660 < 0) {
                if (this.field2664 < 0) {
                    this.field2664 = -1;
                    this.method1316();
                    this.method1820(-25246);
                    return;
                }
            } else if (this.field2664 >= var5) {
                this.field2664 = var5;
                this.method1316();
                this.method1820(-25246);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[B[IIIIIIIILhh;)I", line = 653)
    private static final int method1307(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class190 arg10) {
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
        arg10.field2664 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I[B[IIIIIIIILhh;)I", line = 691)
    private static final int method1308(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class190 arg10) {
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
        arg10.field2664 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([IIIII)I", line = 731)
    private final int method1309(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2662 <= 0) {
                if (this.field2660 == -256 && (this.field2664 & 255) == 0) {
                    if (class263.field3896) {
                        return method1308(0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, 0, arg3, arg2, this);
                    }
                    return method1303(((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, 0, arg3, arg2, this);
                }
                if (class263.field3896) {
                    return method1306(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, 0, arg3, arg2, this, this.field2660, arg4);
                }
                return method1302(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, 0, arg3, arg2, this, this.field2660, arg4);
            }
            int var6 = this.field2662 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2662 += arg1;
            if (this.field2660 == -256 && (this.field2664 & 255) == 0) {
                if (class263.field3896) {
                    arg1 = method1304(0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, this.field2661, this.field2654, 0, var6, arg2, this);
                } else {
                    arg1 = method1295(((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, this.field2656, 0, var6, arg2, this);
                }
            } else if (class263.field3896) {
                arg1 = method1328(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, this.field2661, this.field2654, 0, var6, arg2, this, this.field2660, arg4);
            } else {
                arg1 = method1322(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, this.field2656, 0, var6, arg2, this, this.field2660, arg4);
            }
            this.field2662 -= arg1;
            if (this.field2662 != 0) {
                return arg1;
            }
        } while (!this.method1297());
        return arg3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I", line = 786)
    private static final int method1310(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 791)
    public final synchronized void method1311(int arg0) {
        int var2 = ((class179) super.field629).field2542.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2664 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lua;III)Lhh;", line = 801)
    public static final class190 method1312(class179 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2542 != null && arg0.field2542.length != 0 ? new class190(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[B[IIIIIIIIIILhh;II)I", line = 808)
    private static final int method1313(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class190 arg13, int arg14, int arg15) {
        arg13.field2658 -= arg13.field2656 * arg5;
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
        arg13.field2658 += arg13.field2656 * var22;
        arg13.field2667 = arg6;
        arg13.field2659 = arg7;
        arg13.field2664 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V", line = 851)
    private final synchronized void method1314(int arg0) {
        this.method1323(arg0, this.method1327());
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V", line = 861)
    public final synchronized void method1315(int arg0) {
        if (this.field2660 < 0) {
            this.field2660 = -arg0;
        } else {
            this.field2660 = arg0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "()V", line = 869)
    private final void method1316() {
        if (this.field2662 != 0) {
            if (this.field2657 == Integer.MIN_VALUE) {
                this.field2657 = 0;
            }
            this.field2662 = 0;
            this.method1305();
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "([IIIII)I", line = 880)
    private final int method1317(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2662 <= 0) {
                if (this.field2660 == 256 && (this.field2664 & 255) == 0) {
                    if (class263.field3896) {
                        return method1307(0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, 0, arg3, arg2, this);
                    }
                    return method1332(((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, 0, arg3, arg2, this);
                }
                if (class263.field3896) {
                    return method1301(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, 0, arg3, arg2, this, this.field2660, arg4);
                }
                return method1296(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, 0, arg3, arg2, this, this.field2660, arg4);
            }
            int var6 = this.field2662 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2662 += arg1;
            if (this.field2660 == 256 && (this.field2664 & 255) == 0) {
                if (class263.field3896) {
                    arg1 = method1326(0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, this.field2661, this.field2654, 0, var6, arg2, this);
                } else {
                    arg1 = method1319(((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, this.field2656, 0, var6, arg2, this);
                }
            } else if (class263.field3896) {
                arg1 = method1313(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2667, this.field2659, this.field2661, this.field2654, 0, var6, arg2, this, this.field2660, arg4);
            } else {
                arg1 = method1299(0, 0, ((class179) super.field629).field2542, arg0, this.field2664, arg1, this.field2658, this.field2656, 0, var6, arg2, this, this.field2660, arg4);
            }
            this.field2662 -= arg1;
            if (this.field2662 != 0) {
                return arg1;
            }
        } while (!this.method1297());
        return arg3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 936)
    public final synchronized void method1318(boolean arg0) {
        this.field2660 = (this.field2660 >>> 31) + (this.field2660 ^ this.field2660 >> 31);
        if (arg0) {
            this.field2660 = -this.field2660;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "([B[IIIIIIIILhh;)I", line = 942)
    private static final int method1319(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class190 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2667 += (var14 - arg3) * arg9.field2661;
        arg9.field2659 += (var14 - arg3) * arg9.field2654;
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
        arg9.field2658 = var12 >> 2;
        arg9.field2664 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "()I", line = 976)
    public final synchronized int method1320() {
        return this.field2660 < 0 ? -this.field2660 : this.field2660;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()Lar;", line = 980)
    public final class50 method283() {
        return null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V", line = 983)
    public final synchronized void method1321(int arg0, int arg1) {
        this.method1298(arg0, arg1, this.method1327());
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II[B[IIIIIIIILhh;II)I", line = 987)
    private static final int method1322(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class190 arg11, int arg12, int arg13) {
        arg11.field2667 -= arg11.field2661 * arg5;
        arg11.field2659 -= arg11.field2654 * arg5;
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
        arg11.field2667 += arg11.field2661 * arg5;
        arg11.field2659 += arg11.field2654 * arg5;
        arg11.field2658 = arg6;
        arg11.field2664 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V", line = 1022)
    private final synchronized void method1323(int arg0, int arg1) {
        this.field2657 = arg0;
        this.field2665 = arg1;
        this.field2662 = 0;
        this.method1305();
    }

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "()I", line = 1029)
    public final synchronized int method1324() {
        return this.field2657 == Integer.MIN_VALUE ? 0 : this.field2657;
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V", line = 1034)
    public final synchronized void method1325(int arg0) {
        this.method1323(arg0 << 6, this.method1327());
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I[B[IIIIIIIIIILhh;)I", line = 1037)
    private static final int method1326(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class190 arg12) {
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
        arg12.field2658 += (var19 - arg4) * arg12.field2656;
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
        arg12.field2667 = var15 >> 2;
        arg12.field2659 = var16 >> 2;
        arg12.field2664 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "()I", line = 1090)
    public final synchronized int method1327() {
        return this.field2665 < 0 ? -1 : this.field2665;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II[B[IIIIIIIIIILhh;II)I", line = 1094)
    private static final int method1328(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class190 arg13, int arg14, int arg15) {
        arg13.field2658 -= arg13.field2656 * arg5;
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
        arg13.field2658 += arg13.field2656 * var22;
        arg13.field2667 = arg6;
        arg13.field2659 = arg7;
        arg13.field2664 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "([III)V", line = 1135)
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        if (this.field2657 == 0 && this.field2662 == 0) {
            this.method286(arg2);
        } else {
            class179 var4 = (class179) super.field629;
            int var5 = this.field2666 << 8;
            int var6 = this.field2663 << 8;
            int var7 = var4.field2542.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2653 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2664 < 0) {
                if (this.field2660 <= 0) {
                    this.method1316();
                    this.method1820(-25246);
                    return;
                }
                this.field2664 = 0;
            }
            if (this.field2664 >= var7) {
                if (this.field2660 >= 0) {
                    this.method1316();
                    this.method1820(-25246);
                    return;
                }
                this.field2664 = var7 - 1;
            }
            if (this.field2653 < 0) {
                if (this.field2655) {
                    if (this.field2660 < 0) {
                        var9 = this.method1309(arg0, arg1, var5, var10, var4.field2542[this.field2666]);
                        if (this.field2664 >= var5) {
                            return;
                        }
                        this.field2664 = var5 + var5 - 1 - this.field2664;
                        this.field2660 = -this.field2660;
                    }
                    while (true) {
                        int var11 = this.method1317(arg0, var9, var6, var10, var4.field2542[this.field2663 - 1]);
                        if (this.field2664 < var6) {
                            return;
                        }
                        this.field2664 = var6 + var6 - 1 - this.field2664;
                        this.field2660 = -this.field2660;
                        var9 = this.method1309(arg0, var11, var5, var10, var4.field2542[this.field2666]);
                        if (this.field2664 >= var5) {
                            return;
                        }
                        this.field2664 = var5 + var5 - 1 - this.field2664;
                        this.field2660 = -this.field2660;
                    }
                } else if (this.field2660 < 0) {
                    while (true) {
                        var9 = this.method1309(arg0, var9, var5, var10, var4.field2542[this.field2663 - 1]);
                        if (this.field2664 >= var5) {
                            return;
                        }
                        this.field2664 = var6 - 1 - (var6 - 1 - this.field2664) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1317(arg0, var9, var6, var10, var4.field2542[this.field2666]);
                        if (this.field2664 < var6) {
                            return;
                        }
                        this.field2664 = (this.field2664 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2653 > 0) {
                    if (this.field2655) {
                        label130: {
                            if (this.field2660 < 0) {
                                var9 = this.method1309(arg0, arg1, var5, var10, var4.field2542[this.field2666]);
                                if (this.field2664 >= var5) {
                                    return;
                                }
                                this.field2664 = var5 + var5 - 1 - this.field2664;
                                this.field2660 = -this.field2660;
                                if (--this.field2653 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1317(arg0, var9, var6, var10, var4.field2542[this.field2663 - 1]);
                                if (this.field2664 < var6) {
                                    return;
                                }
                                this.field2664 = var6 + var6 - 1 - this.field2664;
                                this.field2660 = -this.field2660;
                                if (--this.field2653 == 0) {
                                    break;
                                }
                                var9 = this.method1309(arg0, var9, var5, var10, var4.field2542[this.field2666]);
                                if (this.field2664 >= var5) {
                                    return;
                                }
                                this.field2664 = var5 + var5 - 1 - this.field2664;
                                this.field2660 = -this.field2660;
                            } while (--this.field2653 != 0);
                        }
                    } else if (this.field2660 < 0) {
                        while (true) {
                            var9 = this.method1309(arg0, var9, var5, var10, var4.field2542[this.field2663 - 1]);
                            if (this.field2664 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2664) / var8;
                            if (var12 >= this.field2653) {
                                this.field2664 += this.field2653 * var8;
                                this.field2653 = 0;
                                break;
                            }
                            this.field2664 += var8 * var12;
                            this.field2653 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1317(arg0, var9, var6, var10, var4.field2542[this.field2666]);
                            if (this.field2664 < var6) {
                                return;
                            }
                            int var13 = (this.field2664 - var5) / var8;
                            if (var13 >= this.field2653) {
                                this.field2664 -= this.field2653 * var8;
                                this.field2653 = 0;
                                break;
                            }
                            this.field2664 -= var8 * var13;
                            this.field2653 -= var13;
                        }
                    }
                }
                if (this.field2660 < 0) {
                    this.method1309(arg0, var9, 0, var10, 0);
                    if (this.field2664 < 0) {
                        this.field2664 = -1;
                        this.method1316();
                        this.method1820(-25246);
                        return;
                    }
                } else {
                    this.method1317(arg0, var9, var7, var10, 0);
                    if (this.field2664 >= var7) {
                        this.field2664 = var7;
                        this.method1316();
                        this.method1820(-25246);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()Lar;", line = 1370)
    public final class50 method281() {
        return null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lua;II)Lhh;", line = 1375)
    public static final class190 method1329(class179 arg0, int arg1, int arg2) {
        return arg0.field2542 != null && arg0.field2542.length != 0 ? new class190(arg0, (int) ((long) arg0.field2543 * 256L * (long) arg1 / (long) (class298.field4331 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)I", line = 1381)
    private static final int method1330(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V", line = 1384)
    public final synchronized void method1331(int arg0) {
        if (arg0 == 0) {
            this.method1314(0);
            this.method1820(-25246);
        } else if (this.field2667 == 0 && this.field2659 == 0) {
            this.field2662 = 0;
            this.field2657 = 0;
            this.field2658 = 0;
            this.method1820(-25246);
        } else {
            int var2 = -this.field2658;
            if (this.field2658 > var2) {
                var2 = this.field2658;
            }
            if (-this.field2667 > var2) {
                var2 = -this.field2667;
            }
            if (this.field2667 > var2) {
                var2 = this.field2667;
            }
            if (-this.field2659 > var2) {
                var2 = -this.field2659;
            }
            if (this.field2659 > var2) {
                var2 = this.field2659;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2662 = arg0;
            this.field2657 = Integer.MIN_VALUE;
            this.field2656 = -this.field2658 / arg0;
            this.field2661 = -this.field2667 / arg0;
            this.field2654 = -this.field2659 / arg0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "([B[IIIIIIILhh;)I", line = 1429)
    private static final int method1332(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class190 arg8) {
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
        arg8.field2664 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V", line = 1454)
    public final synchronized void method1333(int arg0) {
        this.field2653 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lua;II)V", line = 1458)
    private class190(class179 arg0, int arg1, int arg2) {
        super.field629 = arg0;
        this.field2666 = arg0.field2544;
        this.field2663 = arg0.field2541;
        this.field2655 = arg0.field2540;
        this.field2660 = arg1;
        this.field2657 = arg2;
        this.field2665 = 8192;
        this.field2664 = 0;
        this.method1305();
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lua;III)V", line = 1469)
    private class190(class179 arg0, int arg1, int arg2, int arg3) {
        super.field629 = arg0;
        this.field2666 = arg0.field2544;
        this.field2663 = arg0.field2541;
        this.field2655 = arg0.field2540;
        this.field2660 = arg1;
        this.field2657 = arg2;
        this.field2665 = arg3;
        this.field2664 = 0;
        this.method1305();
    }
}
