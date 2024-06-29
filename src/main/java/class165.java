import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class165 extends class203 {

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    private int field2968;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    private int field2973;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Z")
    private boolean field2976;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field2966;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    private int field2972;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    private int field2964;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    private int field2965;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    private int field2970;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    private int field2978;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B[IIIIIIIILrf;)I")
    private static final int method985(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class165 arg10) {
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
        arg10.field2972 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    private static final int method986(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()I")
    public final int method987() {
        int var1 = this.field2970 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2977 == 0) {
            var2 -= this.field2972 * var2 / (((class33) super.field3917).field569.length << 8);
        } else if (this.field2977 >= 0) {
            var2 -= this.field2968 * var2 / ((class33) super.field3917).field569.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[B[IIIIIIIILrf;II)I")
    private static final int method988(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class165 arg11, int arg12, int arg13) {
        arg11.field2978 -= arg11.field2975 * arg5;
        arg11.field2967 -= arg11.field2965 * arg5;
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
        arg11.field2978 += arg11.field2975 * arg5;
        arg11.field2967 += arg11.field2965 * arg5;
        arg11.field2970 = arg6;
        arg11.field2972 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[B[IIIIIIIIIILrf;II)I")
    private static final int method989(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class165 arg13, int arg14, int arg15) {
        arg13.field2970 -= arg13.field2964 * arg5;
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
        arg13.field2970 += arg13.field2964 * var22;
        arg13.field2978 = arg6;
        arg13.field2967 = arg7;
        arg13.field2972 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public final synchronized void method990(int arg0) {
        int var2 = ((class33) super.field3917).field569.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2972 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "()V")
    private final void method991() {
        if (this.field2971 != 0) {
            if (this.field2974 == Integer.MIN_VALUE) {
                this.field2974 = 0;
            }
            this.field2971 = 0;
            this.method1015();
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I[B[IIIIIIIILrf;)I")
    private static final int method992(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class165 arg10) {
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
        arg10.field2972 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    private final synchronized void method993(int arg0) {
        this.method1002(arg0, this.method1010());
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B[IIIIIIIIIILrf;)I")
    private static final int method994(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class165 arg12) {
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
        arg12.field2970 += (var19 - arg4) * arg12.field2964;
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
        arg12.field2978 = var15 >> 2;
        arg12.field2967 = var16 >> 2;
        arg12.field2972 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([IIIII)I")
    private final int method995(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2971 <= 0) {
                if (this.field2966 == -256 && (this.field2972 & 255) == 0) {
                    if (class120.field2167) {
                        return method985(0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, 0, arg3, arg2, this);
                    }
                    return method1001(((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, 0, arg3, arg2, this);
                }
                if (class120.field2167) {
                    return method1018(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, 0, arg3, arg2, this, this.field2966, arg4);
                }
                return method1019(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, 0, arg3, arg2, this, this.field2966, arg4);
            }
            int var6 = this.field2971 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2971 += arg1;
            if (this.field2966 == -256 && (this.field2972 & 255) == 0) {
                if (class120.field2167) {
                    arg1 = method994(0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, this.field2975, this.field2965, 0, var6, arg2, this);
                } else {
                    arg1 = method1012(((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, this.field2964, 0, var6, arg2, this);
                }
            } else if (class120.field2167) {
                arg1 = method989(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, this.field2975, this.field2965, 0, var6, arg2, this, this.field2966, arg4);
            } else {
                arg1 = method988(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, this.field2964, 0, var6, arg2, this, this.field2966, arg4);
            }
            this.field2971 -= arg1;
            if (this.field2971 != 0) {
                return arg1;
            }
        } while (!this.method1006());
        return arg3;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public final synchronized void method996(int arg0) {
        this.method1002(arg0 << 6, this.method1010());
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
    public final synchronized void method997(boolean arg0) {
        this.field2966 = (this.field2966 >>> 31) + (this.field2966 ^ this.field2966 >> 31);
        if (arg0) {
            this.field2966 = -this.field2966;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ldc;III)Lrf;")
    public static final class165 method998(class33 arg0, int arg1, int arg2, int arg3) {
        return arg0.field569 != null && arg0.field569.length != 0 ? new class165(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B[IIIIIIILrf;)I")
    private static final int method999(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class165 arg8) {
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
        arg8.field2972 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
    public final synchronized void method1000(int arg0, int arg1) {
        this.method1020(arg0, arg1, this.method1010());
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([B[IIIIIIILrf;)I")
    private static final int method1001(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class165 arg8) {
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
        arg8.field2972 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)V")
    private final synchronized void method1002(int arg0, int arg1) {
        this.field2974 = arg0;
        this.field2969 = arg1;
        this.field2971 = 0;
        this.method1015();
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "()Z")
    public final boolean method1003() {
        return this.field2972 < 0 || this.field2972 >= ((class33) super.field3917).field569.length << 8;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public final synchronized void method1004(int arg0) {
        this.field2977 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II[B[IIIIIIIILrf;II)I")
    private static final int method1005(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class165 arg11, int arg12, int arg13) {
        arg11.field2978 -= arg11.field2975 * arg5;
        arg11.field2967 -= arg11.field2965 * arg5;
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
        arg11.field2978 += arg11.field2975 * arg5;
        arg11.field2967 += arg11.field2965 * arg5;
        arg11.field2970 = arg6;
        arg11.field2972 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "()Z")
    private final boolean method1006() {
        int var1 = this.field2974;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1009(var1, this.field2969);
            var2 = method986(var1, this.field2969);
        }
        if (this.field2970 == var1 && this.field2978 == var3 && this.field2967 == var2) {
            if (this.field2974 == Integer.MIN_VALUE) {
                this.field2974 = 0;
                this.field2970 = this.field2978 = this.field2967 = 0;
                this.method797((byte) -103);
                return true;
            } else {
                this.method1015();
                return false;
            }
        } else {
            if (this.field2970 < var1) {
                this.field2964 = 1;
                this.field2971 = var1 - this.field2970;
            } else if (this.field2970 > var1) {
                this.field2964 = -1;
                this.field2971 = this.field2970 - var1;
            } else {
                this.field2964 = 0;
            }
            if (this.field2978 < var3) {
                this.field2975 = 1;
                if (this.field2971 == 0 || this.field2971 > var3 - this.field2978) {
                    this.field2971 = var3 - this.field2978;
                }
            } else if (this.field2978 > var3) {
                this.field2975 = -1;
                if (this.field2971 == 0 || this.field2971 > this.field2978 - var3) {
                    this.field2971 = this.field2978 - var3;
                }
            } else {
                this.field2975 = 0;
            }
            if (this.field2967 < var2) {
                this.field2965 = 1;
                if (this.field2971 == 0 || this.field2971 > var2 - this.field2967) {
                    this.field2971 = var2 - this.field2967;
                }
            } else if (this.field2967 > var2) {
                this.field2965 = -1;
                if (this.field2971 == 0 || this.field2971 > this.field2967 - var2) {
                    this.field2971 = this.field2967 - var2;
                }
            } else {
                this.field2965 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II[B[IIIIIIIILrf;II)I")
    private static final int method1007(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class165 arg11, int arg12, int arg13) {
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
        arg11.field2972 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([III)V")
    public final synchronized void method138(int[] arg0, int arg1, int arg2) {
        if (this.field2974 == 0 && this.field2971 == 0) {
            this.method134(arg2);
        } else {
            class33 var4 = (class33) super.field3917;
            int var5 = this.field2968 << 8;
            int var6 = this.field2973 << 8;
            int var7 = var4.field569.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2977 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2972 < 0) {
                if (this.field2966 <= 0) {
                    this.method991();
                    this.method797((byte) -127);
                    return;
                }
                this.field2972 = 0;
            }
            if (this.field2972 >= var7) {
                if (this.field2966 >= 0) {
                    this.method991();
                    this.method797((byte) -114);
                    return;
                }
                this.field2972 = var7 - 1;
            }
            if (this.field2977 < 0) {
                if (this.field2976) {
                    if (this.field2966 < 0) {
                        var9 = this.method995(arg0, arg1, var5, var10, var4.field569[this.field2968]);
                        if (this.field2972 >= var5) {
                            return;
                        }
                        this.field2972 = var5 + var5 - 1 - this.field2972;
                        this.field2966 = -this.field2966;
                    }
                    while (true) {
                        int var11 = this.method1023(arg0, var9, var6, var10, var4.field569[this.field2973 - 1]);
                        if (this.field2972 < var6) {
                            return;
                        }
                        this.field2972 = var6 + var6 - 1 - this.field2972;
                        this.field2966 = -this.field2966;
                        var9 = this.method995(arg0, var11, var5, var10, var4.field569[this.field2968]);
                        if (this.field2972 >= var5) {
                            return;
                        }
                        this.field2972 = var5 + var5 - 1 - this.field2972;
                        this.field2966 = -this.field2966;
                    }
                } else if (this.field2966 < 0) {
                    while (true) {
                        var9 = this.method995(arg0, var9, var5, var10, var4.field569[this.field2973 - 1]);
                        if (this.field2972 >= var5) {
                            return;
                        }
                        this.field2972 = var6 - 1 - (var6 - 1 - this.field2972) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1023(arg0, var9, var6, var10, var4.field569[this.field2968]);
                        if (this.field2972 < var6) {
                            return;
                        }
                        this.field2972 = (this.field2972 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2977 > 0) {
                    if (this.field2976) {
                        label130: {
                            if (this.field2966 < 0) {
                                var9 = this.method995(arg0, arg1, var5, var10, var4.field569[this.field2968]);
                                if (this.field2972 >= var5) {
                                    return;
                                }
                                this.field2972 = var5 + var5 - 1 - this.field2972;
                                this.field2966 = -this.field2966;
                                if (--this.field2977 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1023(arg0, var9, var6, var10, var4.field569[this.field2973 - 1]);
                                if (this.field2972 < var6) {
                                    return;
                                }
                                this.field2972 = var6 + var6 - 1 - this.field2972;
                                this.field2966 = -this.field2966;
                                if (--this.field2977 == 0) {
                                    break;
                                }
                                var9 = this.method995(arg0, var9, var5, var10, var4.field569[this.field2968]);
                                if (this.field2972 >= var5) {
                                    return;
                                }
                                this.field2972 = var5 + var5 - 1 - this.field2972;
                                this.field2966 = -this.field2966;
                            } while (--this.field2977 != 0);
                        }
                    } else if (this.field2966 < 0) {
                        while (true) {
                            var9 = this.method995(arg0, var9, var5, var10, var4.field569[this.field2973 - 1]);
                            if (this.field2972 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2972) / var8;
                            if (var12 >= this.field2977) {
                                this.field2972 += this.field2977 * var8;
                                this.field2977 = 0;
                                break;
                            }
                            this.field2972 += var8 * var12;
                            this.field2977 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1023(arg0, var9, var6, var10, var4.field569[this.field2968]);
                            if (this.field2972 < var6) {
                                return;
                            }
                            int var13 = (this.field2972 - var5) / var8;
                            if (var13 >= this.field2977) {
                                this.field2972 -= this.field2977 * var8;
                                this.field2977 = 0;
                                break;
                            }
                            this.field2972 -= var8 * var13;
                            this.field2977 -= var13;
                        }
                    }
                }
                if (this.field2966 < 0) {
                    this.method995(arg0, var9, 0, var10, 0);
                    if (this.field2972 < 0) {
                        this.field2972 = -1;
                        this.method991();
                        this.method797((byte) -105);
                        return;
                    }
                } else {
                    this.method1023(arg0, var9, var7, var10, 0);
                    if (this.field2972 >= var7) {
                        this.field2972 = var7;
                        this.method991();
                        this.method797((byte) -119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()Lvh;")
    public final class203 method145() {
        return null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I[B[IIIIIIIIIILrf;)I")
    private static final int method1008(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class165 arg12) {
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
        arg12.field2970 += (var19 - arg4) * arg12.field2964;
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
        arg12.field2978 = var15 >> 2;
        arg12.field2967 = var16 >> 2;
        arg12.field2972 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(II)I")
    private static final int method1009(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "()I")
    public final synchronized int method1010() {
        return this.field2969 < 0 ? -1 : this.field2969;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B[IIIIIIIILrf;)I")
    private static final int method1011(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class165 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2978 += (var14 - arg3) * arg9.field2975;
        arg9.field2967 += (var14 - arg3) * arg9.field2965;
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
        arg9.field2970 = var12 >> 2;
        arg9.field2972 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([B[IIIIIIIILrf;)I")
    private static final int method1012(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class165 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2978 += (var14 - arg3) * arg9.field2975;
        arg9.field2967 += (var14 - arg3) * arg9.field2965;
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
        arg9.field2970 = var12 >> 2;
        arg9.field2972 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "()I")
    public final synchronized int method1013() {
        return this.field2974 == Integer.MIN_VALUE ? 0 : this.field2974;
    }

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "()Z")
    public final boolean method1014() {
        return this.field2971 != 0;
    }

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "()V")
    private final void method1015() {
        this.field2970 = this.field2974;
        this.field2978 = method1009(this.field2974, this.field2969);
        this.field2967 = method986(this.field2974, this.field2969);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[B[IIIIIIILrf;II)I")
    private static final int method1016(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class165 arg10, int arg11, int arg12) {
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
        arg10.field2972 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final synchronized void method134(int arg0) {
        if (this.field2971 > 0) {
            if (arg0 >= this.field2971) {
                if (this.field2974 == Integer.MIN_VALUE) {
                    this.field2974 = 0;
                    this.field2970 = this.field2978 = this.field2967 = 0;
                    this.method797((byte) -115);
                    arg0 = this.field2971;
                }
                this.field2971 = 0;
                this.method1015();
            } else {
                this.field2970 += this.field2964 * arg0;
                this.field2978 += this.field2975 * arg0;
                this.field2967 += this.field2965 * arg0;
                this.field2971 -= arg0;
            }
        }
        class33 var2 = (class33) super.field3917;
        int var3 = this.field2968 << 8;
        int var4 = this.field2973 << 8;
        int var5 = var2.field569.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2977 = 0;
        }
        if (this.field2972 < 0) {
            if (this.field2966 <= 0) {
                this.method991();
                this.method797((byte) -123);
                return;
            }
            this.field2972 = 0;
        }
        if (this.field2972 >= var5) {
            if (this.field2966 >= 0) {
                this.method991();
                this.method797((byte) -118);
                return;
            }
            this.field2972 = var5 - 1;
        }
        this.field2972 += this.field2966 * arg0;
        if (this.field2977 < 0) {
            if (!this.field2976) {
                if (this.field2966 < 0) {
                    if (this.field2972 < var3) {
                        this.field2972 = var4 - 1 - (var4 - 1 - this.field2972) % var6;
                    }
                } else if (this.field2972 >= var4) {
                    this.field2972 = (this.field2972 - var3) % var6 + var3;
                }
            } else {
                if (this.field2966 < 0) {
                    if (this.field2972 >= var3) {
                        return;
                    }
                    this.field2972 = var3 + var3 - 1 - this.field2972;
                    this.field2966 = -this.field2966;
                }
                while (this.field2972 >= var4) {
                    this.field2972 = var4 + var4 - 1 - this.field2972;
                    this.field2966 = -this.field2966;
                    if (this.field2972 >= var3) {
                        return;
                    }
                    this.field2972 = var3 + var3 - 1 - this.field2972;
                    this.field2966 = -this.field2966;
                }
            }
        } else {
            if (this.field2977 > 0) {
                if (this.field2976) {
                    label125: {
                        if (this.field2966 < 0) {
                            if (this.field2972 >= var3) {
                                return;
                            }
                            this.field2972 = var3 + var3 - 1 - this.field2972;
                            this.field2966 = -this.field2966;
                            if (--this.field2977 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2972 < var4) {
                                return;
                            }
                            this.field2972 = var4 + var4 - 1 - this.field2972;
                            this.field2966 = -this.field2966;
                            if (--this.field2977 == 0) {
                                break;
                            }
                            if (this.field2972 >= var3) {
                                return;
                            }
                            this.field2972 = var3 + var3 - 1 - this.field2972;
                            this.field2966 = -this.field2966;
                        } while (--this.field2977 != 0);
                    }
                } else if (this.field2966 < 0) {
                    if (this.field2972 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2972) / var6;
                    if (var7 < this.field2977) {
                        this.field2972 += var6 * var7;
                        this.field2977 -= var7;
                        return;
                    }
                    this.field2972 += this.field2977 * var6;
                    this.field2977 = 0;
                } else {
                    if (this.field2972 < var4) {
                        return;
                    }
                    int var8 = (this.field2972 - var3) / var6;
                    if (var8 < this.field2977) {
                        this.field2972 -= var6 * var8;
                        this.field2977 -= var8;
                        return;
                    }
                    this.field2972 -= this.field2977 * var6;
                    this.field2977 = 0;
                }
            }
            if (this.field2966 < 0) {
                if (this.field2972 < 0) {
                    this.field2972 = -1;
                    this.method991();
                    this.method797((byte) -126);
                    return;
                }
            } else if (this.field2972 >= var5) {
                this.field2972 = var5;
                this.method991();
                this.method797((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "()I")
    public final synchronized int method1017() {
        return this.field2966 < 0 ? -this.field2966 : this.field2966;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(II[B[IIIIIIIILrf;II)I")
    private static final int method1018(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class165 arg11, int arg12, int arg13) {
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
        arg11.field2972 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()Lvh;")
    public final class203 method137() {
        return null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II[B[IIIIIIILrf;II)I")
    private static final int method1019(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class165 arg10, int arg11, int arg12) {
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
        arg10.field2972 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V")
    public final synchronized void method1020(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1002(arg1, arg2);
        } else {
            int var4 = method1009(arg1, arg2);
            int var5 = method986(arg1, arg2);
            if (this.field2978 == var4 && this.field2967 == var5) {
                this.field2971 = 0;
            } else {
                int var6 = arg1 - this.field2970;
                if (this.field2970 - arg1 > var6) {
                    var6 = this.field2970 - arg1;
                }
                if (var4 - this.field2978 > var6) {
                    var6 = var4 - this.field2978;
                }
                if (this.field2978 - var4 > var6) {
                    var6 = this.field2978 - var4;
                }
                if (var5 - this.field2967 > var6) {
                    var6 = var5 - this.field2967;
                }
                if (this.field2967 - var5 > var6) {
                    var6 = this.field2967 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2971 = arg0;
                this.field2974 = arg1;
                this.field2969 = arg2;
                this.field2964 = (arg1 - this.field2970) / arg0;
                this.field2975 = (var4 - this.field2978) / arg0;
                this.field2965 = (var5 - this.field2967) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
    public final synchronized void method1021(int arg0) {
        if (this.field2966 < 0) {
            this.field2966 = -arg0;
        } else {
            this.field2966 = arg0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ldc;II)Lrf;")
    public static final class165 method1022(class33 arg0, int arg1, int arg2) {
        return arg0.field569 != null && arg0.field569.length != 0 ? new class165(arg0, (int) ((long) arg0.field570 * 256L * (long) arg1 / (long) (class210.field4018 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([IIIII)I")
    private final int method1023(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2971 <= 0) {
                if (this.field2966 == 256 && (this.field2972 & 255) == 0) {
                    if (class120.field2167) {
                        return method992(0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, 0, arg3, arg2, this);
                    }
                    return method999(((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, 0, arg3, arg2, this);
                }
                if (class120.field2167) {
                    return method1007(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, 0, arg3, arg2, this, this.field2966, arg4);
                }
                return method1016(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, 0, arg3, arg2, this, this.field2966, arg4);
            }
            int var6 = this.field2971 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2971 += arg1;
            if (this.field2966 == 256 && (this.field2972 & 255) == 0) {
                if (class120.field2167) {
                    arg1 = method1008(0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, this.field2975, this.field2965, 0, var6, arg2, this);
                } else {
                    arg1 = method1011(((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, this.field2964, 0, var6, arg2, this);
                }
            } else if (class120.field2167) {
                arg1 = method1024(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2978, this.field2967, this.field2975, this.field2965, 0, var6, arg2, this, this.field2966, arg4);
            } else {
                arg1 = method1005(0, 0, ((class33) super.field3917).field569, arg0, this.field2972, arg1, this.field2970, this.field2964, 0, var6, arg2, this, this.field2966, arg4);
            }
            this.field2971 -= arg1;
            if (this.field2971 != 0) {
                return arg1;
            }
        } while (!this.method1006());
        return arg3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
    public final int method136() {
        return this.field2974 == 0 && this.field2971 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II[B[IIIIIIIIIILrf;II)I")
    private static final int method1024(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class165 arg13, int arg14, int arg15) {
        arg13.field2970 -= arg13.field2964 * arg5;
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
        arg13.field2970 += arg13.field2964 * var22;
        arg13.field2978 = arg6;
        arg13.field2967 = arg7;
        arg13.field2972 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ldc;II)V")
    private class165(class33 arg0, int arg1, int arg2) {
        super.field3917 = arg0;
        this.field2968 = arg0.field572;
        this.field2973 = arg0.field571;
        this.field2976 = arg0.field573;
        this.field2966 = arg1;
        this.field2974 = arg2;
        this.field2969 = 8192;
        this.field2972 = 0;
        this.method1015();
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
    public final synchronized void method1025(int arg0) {
        if (arg0 == 0) {
            this.method993(0);
            this.method797((byte) -100);
        } else if (this.field2978 == 0 && this.field2967 == 0) {
            this.field2971 = 0;
            this.field2974 = 0;
            this.field2970 = 0;
            this.method797((byte) -101);
        } else {
            int var2 = -this.field2970;
            if (this.field2970 > var2) {
                var2 = this.field2970;
            }
            if (-this.field2978 > var2) {
                var2 = -this.field2978;
            }
            if (this.field2978 > var2) {
                var2 = this.field2978;
            }
            if (-this.field2967 > var2) {
                var2 = -this.field2967;
            }
            if (this.field2967 > var2) {
                var2 = this.field2967;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2971 = arg0;
            this.field2974 = Integer.MIN_VALUE;
            this.field2964 = -this.field2970 / arg0;
            this.field2975 = -this.field2978 / arg0;
            this.field2965 = -this.field2967 / arg0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ldc;III)V")
    private class165(class33 arg0, int arg1, int arg2, int arg3) {
        super.field3917 = arg0;
        this.field2968 = arg0.field572;
        this.field2973 = arg0.field571;
        this.field2976 = arg0.field573;
        this.field2966 = arg1;
        this.field2974 = arg2;
        this.field2969 = arg3;
        this.field2972 = 0;
        this.method1015();
    }
}
