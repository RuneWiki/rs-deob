import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class162 extends class51 {

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    private int field3121;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Z")
    private boolean field3124;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    private int field3129;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field3119;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    private int field3116;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    private int field3122;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    private int field3123;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    private int field3128;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public final synchronized void method1088(int arg0) {
        if (arg0 == 0) {
            this.method1093(0);
            this.method460(true);
        } else if (this.field3130 == 0 && this.field3116 == 0) {
            this.field3128 = 0;
            this.field3126 = 0;
            this.field3123 = 0;
            this.method460(true);
        } else {
            int var2 = -this.field3123;
            if (this.field3123 > var2) {
                var2 = this.field3123;
            }
            if (-this.field3130 > var2) {
                var2 = -this.field3130;
            }
            if (this.field3130 > var2) {
                var2 = this.field3130;
            }
            if (-this.field3116 > var2) {
                var2 = -this.field3116;
            }
            if (this.field3116 > var2) {
                var2 = this.field3116;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3128 = arg0;
            this.field3126 = Integer.MIN_VALUE;
            this.field3122 = -this.field3123 / arg0;
            this.field3120 = -this.field3130 / arg0;
            this.field3127 = -this.field3116 / arg0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[B[IIIIIIIILoj;II)I")
    private static final int method1089(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class162 arg11, int arg12, int arg13) {
        arg11.field3130 -= arg11.field3120 * arg5;
        arg11.field3116 -= arg11.field3127 * arg5;
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
        arg11.field3130 += arg11.field3120 * arg5;
        arg11.field3116 += arg11.field3127 * arg5;
        arg11.field3123 = arg6;
        arg11.field3119 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()I")
    public final int method383() {
        return this.field3126 == 0 && this.field3128 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "()Z")
    private final boolean method1090() {
        int var1 = this.field3126;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1108(var1, this.field3129);
            var2 = method1104(var1, this.field3129);
        }
        if (this.field3123 == var1 && this.field3130 == var3 && this.field3116 == var2) {
            if (this.field3126 == Integer.MIN_VALUE) {
                this.field3126 = 0;
                this.field3123 = this.field3130 = this.field3116 = 0;
                this.method460(true);
                return true;
            } else {
                this.method1116();
                return false;
            }
        } else {
            if (this.field3123 < var1) {
                this.field3122 = 1;
                this.field3128 = var1 - this.field3123;
            } else if (this.field3123 > var1) {
                this.field3122 = -1;
                this.field3128 = this.field3123 - var1;
            } else {
                this.field3122 = 0;
            }
            if (this.field3130 < var3) {
                this.field3120 = 1;
                if (this.field3128 == 0 || this.field3128 > var3 - this.field3130) {
                    this.field3128 = var3 - this.field3130;
                }
            } else if (this.field3130 > var3) {
                this.field3120 = -1;
                if (this.field3128 == 0 || this.field3128 > this.field3130 - var3) {
                    this.field3128 = this.field3130 - var3;
                }
            } else {
                this.field3120 = 0;
            }
            if (this.field3116 < var2) {
                this.field3127 = 1;
                if (this.field3128 == 0 || this.field3128 > var2 - this.field3116) {
                    this.field3128 = var2 - this.field3116;
                }
            } else if (this.field3116 > var2) {
                this.field3127 = -1;
                if (this.field3128 == 0 || this.field3128 > this.field3116 - var2) {
                    this.field3128 = this.field3116 - var2;
                }
            } else {
                this.field3127 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([B[IIIIIIILoj;)I")
    private static final int method1091(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
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
        arg8.field3119 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[B[IIIIIIIIIILoj;II)I")
    private static final int method1092(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class162 arg13, int arg14, int arg15) {
        arg13.field3123 -= arg13.field3122 * arg5;
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
        arg13.field3123 += arg13.field3122 * var22;
        arg13.field3130 = arg6;
        arg13.field3116 = arg7;
        arg13.field3119 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    private final synchronized void method1093(int arg0) {
        this.method1117(arg0, this.method1105());
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()I")
    public final int method382() {
        int var1 = this.field3123 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3118 == 0) {
            var2 -= this.field3119 * var2 / (((class213) super.field935).field4033.length << 8);
        } else if (this.field3118 >= 0) {
            var2 -= this.field3121 * var2 / ((class213) super.field935).field4033.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public final synchronized void method1094(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1117(arg1, arg2);
        } else {
            int var4 = method1108(arg1, arg2);
            int var5 = method1104(arg1, arg2);
            if (this.field3130 == var4 && this.field3116 == var5) {
                this.field3128 = 0;
            } else {
                int var6 = arg1 - this.field3123;
                if (this.field3123 - arg1 > var6) {
                    var6 = this.field3123 - arg1;
                }
                if (var4 - this.field3130 > var6) {
                    var6 = var4 - this.field3130;
                }
                if (this.field3130 - var4 > var6) {
                    var6 = this.field3130 - var4;
                }
                if (var5 - this.field3116 > var6) {
                    var6 = var5 - this.field3116;
                }
                if (this.field3116 - var5 > var6) {
                    var6 = this.field3116 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3128 = arg0;
                this.field3126 = arg1;
                this.field3129 = arg2;
                this.field3122 = (arg1 - this.field3123) / arg0;
                this.field3120 = (var4 - this.field3130) / arg0;
                this.field3127 = (var5 - this.field3116) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "()I")
    public final synchronized int method1095() {
        return this.field3126 == Integer.MIN_VALUE ? 0 : this.field3126;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B[IIIIIIIILoj;)I")
    private static final int method1096(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10) {
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
        arg10.field3119 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([B[IIIIIIIILoj;)I")
    private static final int method1097(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class162 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3130 += (var14 - arg3) * arg9.field3120;
        arg9.field3116 += (var14 - arg3) * arg9.field3127;
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
        arg9.field3123 = var12 >> 2;
        arg9.field3119 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I[B[IIIIIIIILoj;)I")
    private static final int method1098(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10) {
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
        arg10.field3119 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[B[IIIIIIIIIILoj;)I")
    private static final int method1099(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class162 arg12) {
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
        arg12.field3123 += (var19 - arg4) * arg12.field3122;
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
        arg12.field3130 = var15 >> 2;
        arg12.field3116 = var16 >> 2;
        arg12.field3119 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ltf;III)Loj;")
    public static final class162 method1100(class213 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4033 != null && arg0.field4033.length != 0 ? new class162(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I[B[IIIIIIIIIILoj;)I")
    private static final int method1101(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class162 arg12) {
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
        arg12.field3123 += (var19 - arg4) * arg12.field3122;
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
        arg12.field3130 = var15 >> 2;
        arg12.field3116 = var16 >> 2;
        arg12.field3119 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([IIIII)I")
    private final int method1102(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3128 <= 0) {
                if (this.field3117 == 256 && (this.field3119 & 255) == 0) {
                    if (class7.field99) {
                        return method1098(0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, 0, arg3, arg2, this);
                    }
                    return method1103(((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, 0, arg3, arg2, this);
                }
                if (class7.field99) {
                    return method1127(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, 0, arg3, arg2, this, this.field3117, arg4);
                }
                return method1125(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, 0, arg3, arg2, this, this.field3117, arg4);
            }
            int var6 = this.field3128 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3128 += arg1;
            if (this.field3117 == 256 && (this.field3119 & 255) == 0) {
                if (class7.field99) {
                    arg1 = method1101(0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, this.field3120, this.field3127, 0, var6, arg2, this);
                } else {
                    arg1 = method1124(((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, this.field3122, 0, var6, arg2, this);
                }
            } else if (class7.field99) {
                arg1 = method1092(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, this.field3120, this.field3127, 0, var6, arg2, this, this.field3117, arg4);
            } else {
                arg1 = method1089(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, this.field3122, 0, var6, arg2, this, this.field3117, arg4);
            }
            this.field3128 -= arg1;
            if (this.field3128 != 0) {
                return arg1;
            }
        } while (!this.method1090());
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([B[IIIIIIILoj;)I")
    private static final int method1103(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162 arg8) {
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
        arg8.field3119 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)I")
    private static final int method1104(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "()I")
    public final synchronized int method1105() {
        return this.field3129 < 0 ? -1 : this.field3129;
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "()I")
    public final synchronized int method1106() {
        return this.field3117 < 0 ? -this.field3117 : this.field3117;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    public final synchronized void method1107(int arg0) {
        if (this.field3117 < 0) {
            this.field3117 = -arg0;
        } else {
            this.field3117 = arg0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)I")
    private static final int method1108(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[B[IIIIIIILoj;II)I")
    private static final int method1109(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10, int arg11, int arg12) {
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
        arg10.field3119 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
    public final synchronized void method1110(int arg0) {
        int var2 = ((class213) super.field935).field4033.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3119 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II[B[IIIIIIIIIILoj;II)I")
    private static final int method1111(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class162 arg13, int arg14, int arg15) {
        arg13.field3123 -= arg13.field3122 * arg5;
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
        arg13.field3123 += arg13.field3122 * var22;
        arg13.field3130 = arg6;
        arg13.field3116 = arg7;
        arg13.field3119 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()Lef;")
    public final class51 method380() {
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()Lef;")
    public final class51 method385() {
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II[B[IIIIIIIILoj;II)I")
    private static final int method1112(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class162 arg11, int arg12, int arg13) {
        arg11.field3130 -= arg11.field3120 * arg5;
        arg11.field3116 -= arg11.field3127 * arg5;
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
        arg11.field3130 += arg11.field3120 * arg5;
        arg11.field3116 += arg11.field3127 * arg5;
        arg11.field3123 = arg6;
        arg11.field3119 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
    public final synchronized void method1113(boolean arg0) {
        this.field3117 = (this.field3117 >>> 31) + (this.field3117 ^ this.field3117 >> 31);
        if (arg0) {
            this.field3117 = -this.field3117;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II[B[IIIIIIIILoj;II)I")
    private static final int method1114(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class162 arg11, int arg12, int arg13) {
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
        arg11.field3119 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "()V")
    private final void method1115() {
        if (this.field3128 != 0) {
            if (this.field3126 == Integer.MIN_VALUE) {
                this.field3126 = 0;
            }
            this.field3128 = 0;
            this.method1116();
        }
    }

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "()V")
    private final void method1116() {
        this.field3123 = this.field3126;
        this.field3130 = method1108(this.field3126, this.field3129);
        this.field3116 = method1104(this.field3126, this.field3129);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(II)V")
    private final synchronized void method1117(int arg0, int arg1) {
        this.field3126 = arg0;
        this.field3129 = arg1;
        this.field3128 = 0;
        this.method1116();
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(II)V")
    public final synchronized void method1118(int arg0, int arg1) {
        this.method1094(arg0, arg1, this.method1105());
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)V")
    public final synchronized void method379(int[] arg0, int arg1, int arg2) {
        if (this.field3126 == 0 && this.field3128 == 0) {
            this.method384(arg2);
        } else {
            class213 var4 = (class213) super.field935;
            int var5 = this.field3121 << 8;
            int var6 = this.field3125 << 8;
            int var7 = var4.field4033.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3118 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3119 < 0) {
                if (this.field3117 <= 0) {
                    this.method1115();
                    this.method460(true);
                    return;
                }
                this.field3119 = 0;
            }
            if (this.field3119 >= var7) {
                if (this.field3117 >= 0) {
                    this.method1115();
                    this.method460(true);
                    return;
                }
                this.field3119 = var7 - 1;
            }
            if (this.field3118 < 0) {
                if (this.field3124) {
                    if (this.field3117 < 0) {
                        var9 = this.method1120(arg0, arg1, var5, var10, var4.field4033[this.field3121]);
                        if (this.field3119 >= var5) {
                            return;
                        }
                        this.field3119 = var5 + var5 - 1 - this.field3119;
                        this.field3117 = -this.field3117;
                    }
                    while (true) {
                        int var11 = this.method1102(arg0, var9, var6, var10, var4.field4033[this.field3125 - 1]);
                        if (this.field3119 < var6) {
                            return;
                        }
                        this.field3119 = var6 + var6 - 1 - this.field3119;
                        this.field3117 = -this.field3117;
                        var9 = this.method1120(arg0, var11, var5, var10, var4.field4033[this.field3121]);
                        if (this.field3119 >= var5) {
                            return;
                        }
                        this.field3119 = var5 + var5 - 1 - this.field3119;
                        this.field3117 = -this.field3117;
                    }
                } else if (this.field3117 < 0) {
                    while (true) {
                        var9 = this.method1120(arg0, var9, var5, var10, var4.field4033[this.field3125 - 1]);
                        if (this.field3119 >= var5) {
                            return;
                        }
                        this.field3119 = var6 - 1 - (var6 - 1 - this.field3119) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1102(arg0, var9, var6, var10, var4.field4033[this.field3121]);
                        if (this.field3119 < var6) {
                            return;
                        }
                        this.field3119 = (this.field3119 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3118 > 0) {
                    if (this.field3124) {
                        label130: {
                            if (this.field3117 < 0) {
                                var9 = this.method1120(arg0, arg1, var5, var10, var4.field4033[this.field3121]);
                                if (this.field3119 >= var5) {
                                    return;
                                }
                                this.field3119 = var5 + var5 - 1 - this.field3119;
                                this.field3117 = -this.field3117;
                                if (--this.field3118 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1102(arg0, var9, var6, var10, var4.field4033[this.field3125 - 1]);
                                if (this.field3119 < var6) {
                                    return;
                                }
                                this.field3119 = var6 + var6 - 1 - this.field3119;
                                this.field3117 = -this.field3117;
                                if (--this.field3118 == 0) {
                                    break;
                                }
                                var9 = this.method1120(arg0, var9, var5, var10, var4.field4033[this.field3121]);
                                if (this.field3119 >= var5) {
                                    return;
                                }
                                this.field3119 = var5 + var5 - 1 - this.field3119;
                                this.field3117 = -this.field3117;
                            } while (--this.field3118 != 0);
                        }
                    } else if (this.field3117 < 0) {
                        while (true) {
                            var9 = this.method1120(arg0, var9, var5, var10, var4.field4033[this.field3125 - 1]);
                            if (this.field3119 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3119) / var8;
                            if (var12 >= this.field3118) {
                                this.field3119 += this.field3118 * var8;
                                this.field3118 = 0;
                                break;
                            }
                            this.field3119 += var8 * var12;
                            this.field3118 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1102(arg0, var9, var6, var10, var4.field4033[this.field3121]);
                            if (this.field3119 < var6) {
                                return;
                            }
                            int var13 = (this.field3119 - var5) / var8;
                            if (var13 >= this.field3118) {
                                this.field3119 -= this.field3118 * var8;
                                this.field3118 = 0;
                                break;
                            }
                            this.field3119 -= var8 * var13;
                            this.field3118 -= var13;
                        }
                    }
                }
                if (this.field3117 < 0) {
                    this.method1120(arg0, var9, 0, var10, 0);
                    if (this.field3119 < 0) {
                        this.field3119 = -1;
                        this.method1115();
                        this.method460(true);
                        return;
                    }
                } else {
                    this.method1102(arg0, var9, var7, var10, 0);
                    if (this.field3119 >= var7) {
                        this.field3119 = var7;
                        this.method1115();
                        this.method460(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
    public final synchronized void method1119(int arg0) {
        this.method1117(arg0 << 6, this.method1105());
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([IIIII)I")
    private final int method1120(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3128 <= 0) {
                if (this.field3117 == -256 && (this.field3119 & 255) == 0) {
                    if (class7.field99) {
                        return method1096(0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, 0, arg3, arg2, this);
                    }
                    return method1091(((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, 0, arg3, arg2, this);
                }
                if (class7.field99) {
                    return method1114(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, 0, arg3, arg2, this, this.field3117, arg4);
                }
                return method1109(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, 0, arg3, arg2, this, this.field3117, arg4);
            }
            int var6 = this.field3128 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3128 += arg1;
            if (this.field3117 == -256 && (this.field3119 & 255) == 0) {
                if (class7.field99) {
                    arg1 = method1099(0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, this.field3120, this.field3127, 0, var6, arg2, this);
                } else {
                    arg1 = method1097(((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, this.field3122, 0, var6, arg2, this);
                }
            } else if (class7.field99) {
                arg1 = method1111(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3130, this.field3116, this.field3120, this.field3127, 0, var6, arg2, this, this.field3117, arg4);
            } else {
                arg1 = method1112(0, 0, ((class213) super.field935).field4033, arg0, this.field3119, arg1, this.field3123, this.field3122, 0, var6, arg2, this, this.field3117, arg4);
            }
            this.field3128 -= arg1;
            if (this.field3128 != 0) {
                return arg1;
            }
        } while (!this.method1090());
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
    public final synchronized void method1121(int arg0) {
        this.field3118 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "()Z")
    public final boolean method1122() {
        return this.field3119 < 0 || this.field3119 >= ((class213) super.field935).field4033.length << 8;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final synchronized void method384(int arg0) {
        if (this.field3128 > 0) {
            if (arg0 >= this.field3128) {
                if (this.field3126 == Integer.MIN_VALUE) {
                    this.field3126 = 0;
                    this.field3123 = this.field3130 = this.field3116 = 0;
                    this.method460(true);
                    arg0 = this.field3128;
                }
                this.field3128 = 0;
                this.method1116();
            } else {
                this.field3123 += this.field3122 * arg0;
                this.field3130 += this.field3120 * arg0;
                this.field3116 += this.field3127 * arg0;
                this.field3128 -= arg0;
            }
        }
        class213 var2 = (class213) super.field935;
        int var3 = this.field3121 << 8;
        int var4 = this.field3125 << 8;
        int var5 = var2.field4033.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3118 = 0;
        }
        if (this.field3119 < 0) {
            if (this.field3117 <= 0) {
                this.method1115();
                this.method460(true);
                return;
            }
            this.field3119 = 0;
        }
        if (this.field3119 >= var5) {
            if (this.field3117 >= 0) {
                this.method1115();
                this.method460(true);
                return;
            }
            this.field3119 = var5 - 1;
        }
        this.field3119 += this.field3117 * arg0;
        if (this.field3118 < 0) {
            if (!this.field3124) {
                if (this.field3117 < 0) {
                    if (this.field3119 < var3) {
                        this.field3119 = var4 - 1 - (var4 - 1 - this.field3119) % var6;
                    }
                } else if (this.field3119 >= var4) {
                    this.field3119 = (this.field3119 - var3) % var6 + var3;
                }
            } else {
                if (this.field3117 < 0) {
                    if (this.field3119 >= var3) {
                        return;
                    }
                    this.field3119 = var3 + var3 - 1 - this.field3119;
                    this.field3117 = -this.field3117;
                }
                while (this.field3119 >= var4) {
                    this.field3119 = var4 + var4 - 1 - this.field3119;
                    this.field3117 = -this.field3117;
                    if (this.field3119 >= var3) {
                        return;
                    }
                    this.field3119 = var3 + var3 - 1 - this.field3119;
                    this.field3117 = -this.field3117;
                }
            }
        } else {
            if (this.field3118 > 0) {
                if (this.field3124) {
                    label125: {
                        if (this.field3117 < 0) {
                            if (this.field3119 >= var3) {
                                return;
                            }
                            this.field3119 = var3 + var3 - 1 - this.field3119;
                            this.field3117 = -this.field3117;
                            if (--this.field3118 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3119 < var4) {
                                return;
                            }
                            this.field3119 = var4 + var4 - 1 - this.field3119;
                            this.field3117 = -this.field3117;
                            if (--this.field3118 == 0) {
                                break;
                            }
                            if (this.field3119 >= var3) {
                                return;
                            }
                            this.field3119 = var3 + var3 - 1 - this.field3119;
                            this.field3117 = -this.field3117;
                        } while (--this.field3118 != 0);
                    }
                } else if (this.field3117 < 0) {
                    if (this.field3119 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3119) / var6;
                    if (var7 < this.field3118) {
                        this.field3119 += var6 * var7;
                        this.field3118 -= var7;
                        return;
                    }
                    this.field3119 += this.field3118 * var6;
                    this.field3118 = 0;
                } else {
                    if (this.field3119 < var4) {
                        return;
                    }
                    int var8 = (this.field3119 - var3) / var6;
                    if (var8 < this.field3118) {
                        this.field3119 -= var6 * var8;
                        this.field3118 -= var8;
                        return;
                    }
                    this.field3119 -= this.field3118 * var6;
                    this.field3118 = 0;
                }
            }
            if (this.field3117 < 0) {
                if (this.field3119 < 0) {
                    this.field3119 = -1;
                    this.method1115();
                    this.method460(true);
                    return;
                }
            } else if (this.field3119 >= var5) {
                this.field3119 = var5;
                this.method1115();
                this.method460(true);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "()Z")
    public final boolean method1123() {
        return this.field3128 != 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([B[IIIIIIIILoj;)I")
    private static final int method1124(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class162 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3130 += (var14 - arg3) * arg9.field3120;
        arg9.field3116 += (var14 - arg3) * arg9.field3127;
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
        arg9.field3123 = var12 >> 2;
        arg9.field3119 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II[B[IIIIIIILoj;II)I")
    private static final int method1125(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class162 arg10, int arg11, int arg12) {
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
        arg10.field3119 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ltf;II)Loj;")
    public static final class162 method1126(class213 arg0, int arg1, int arg2) {
        return arg0.field4033 != null && arg0.field4033.length != 0 ? new class162(arg0, (int) ((long) arg0.field4030 * 256L * (long) arg1 / (long) (class11.field161 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(II[B[IIIIIIIILoj;II)I")
    private static final int method1127(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class162 arg11, int arg12, int arg13) {
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
        arg11.field3119 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ltf;II)V")
    private class162(class213 arg0, int arg1, int arg2) {
        super.field935 = arg0;
        this.field3121 = arg0.field4034;
        this.field3125 = arg0.field4031;
        this.field3124 = arg0.field4032;
        this.field3117 = arg1;
        this.field3126 = arg2;
        this.field3129 = 8192;
        this.field3119 = 0;
        this.method1116();
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ltf;III)V")
    private class162(class213 arg0, int arg1, int arg2, int arg3) {
        super.field935 = arg0;
        this.field3121 = arg0.field4034;
        this.field3125 = arg0.field4031;
        this.field3124 = arg0.field4032;
        this.field3117 = arg1;
        this.field3126 = arg2;
        this.field3129 = arg3;
        this.field3119 = 0;
        this.method1116();
    }
}
