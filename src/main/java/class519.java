import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class519 extends class69 {

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
    private int field7080;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    private int field7091;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "Z")
    private boolean field7089;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    private int field7078;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    private int field7087;

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
    private int field7090;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
    private int field7086;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    private int field7077;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    private int field7079;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    private int field7081;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    private int field7083;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    private int field7084;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
    private int field7085;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    private int field7088;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[B[IIIIIIIIIILhw;)I", line = 4)
    private static final int method2805(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class519 arg12) {
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
        arg12.field7077 += (var19 - arg4) * arg12.field7081;
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
        arg12.field7088 = var15 >> 2;
        arg12.field7083 = var16 >> 2;
        arg12.field7086 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[B[IIIIIIIIIILhw;II)I", line = 57)
    private static final int method2806(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class519 arg13, int arg14, int arg15) {
        arg13.field7077 -= arg13.field7081 * arg5;
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
        arg13.field7077 += arg13.field7081 * var22;
        arg13.field7088 = arg6;
        arg13.field7083 = arg7;
        arg13.field7086 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[B[IIIIIIILhw;II)I", line = 99)
    private static final int method2807(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class519 arg10, int arg11, int arg12) {
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
        arg10.field7086 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([B[IIIIIIIILhw;)I", line = 126)
    private static final int method2808(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class519 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7088 += (var14 - arg3) * arg9.field7084;
        arg9.field7083 += (var14 - arg3) * arg9.field7085;
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
        arg9.field7077 = var12 >> 2;
        arg9.field7086 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[B[IIIIIIIILhw;II)I", line = 160)
    private static final int method2809(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class519 arg11, int arg12, int arg13) {
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
        arg11.field7086 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V", line = 194)
    public final synchronized void method2810(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2844(arg1, arg2);
        } else {
            int var4 = method2818(arg1, arg2);
            int var5 = method2829(arg1, arg2);
            if (this.field7088 == var4 && this.field7083 == var5) {
                this.field7082 = 0;
            } else {
                int var6 = arg1 - this.field7077;
                if (this.field7077 - arg1 > var6) {
                    var6 = this.field7077 - arg1;
                }
                if (var4 - this.field7088 > var6) {
                    var6 = var4 - this.field7088;
                }
                if (this.field7088 - var4 > var6) {
                    var6 = this.field7088 - var4;
                }
                if (var5 - this.field7083 > var6) {
                    var6 = var5 - this.field7083;
                }
                if (this.field7083 - var5 > var6) {
                    var6 = this.field7083 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7082 = arg0;
                this.field7087 = arg1;
                this.field7090 = arg2;
                this.field7081 = (arg1 - this.field7077) / arg0;
                this.field7084 = (var4 - this.field7088) / arg0;
                this.field7085 = (var5 - this.field7083) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Loaa;II)Lhw;", line = 240)
    public static final class519 method2811(class555 arg0, int arg1, int arg2) {
        return arg0.field7722 != null && arg0.field7722.length != 0 ? new class519(arg0, (int) ((long) arg0.field7724 * 256L * (long) arg1 / (long) (class392.field4942 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "()Lpn;", line = 246)
    public final class69 method413() {
        return null;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II[B[IIIIIIIIIILhw;II)I", line = 250)
    private static final int method2812(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class519 arg13, int arg14, int arg15) {
        arg13.field7077 -= arg13.field7081 * arg5;
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
        arg13.field7077 += arg13.field7081 * var22;
        arg13.field7088 = arg6;
        arg13.field7083 = arg7;
        arg13.field7086 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V", line = 292)
    public final synchronized void method2813(int arg0, int arg1) {
        this.method2810(arg0, arg1, this.method2814());
    }

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "()I", line = 296)
    public final synchronized int method2814() {
        return this.field7090 < 0 ? -1 : this.field7090;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II[B[IIIIIIILhw;II)I", line = 302)
    private static final int method2815(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class519 arg10, int arg11, int arg12) {
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
        arg10.field7086 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "()Z", line = 328)
    public final boolean method2816() {
        return this.field7086 < 0 || this.field7086 >= ((class555) super.field941).field7722.length << 8;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V", line = 332)
    private final synchronized void method2817(int arg0) {
        this.method2844(arg0, this.method2814());
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)I", line = 335)
    private static final int method2818(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([B[IIIIIIILhw;)I", line = 338)
    private static final int method2819(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class519 arg8) {
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
        arg8.field7086 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "()I", line = 363)
    public final synchronized int method2820() {
        return this.field7078 < 0 ? -this.field7078 : this.field7078;
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V", line = 367)
    public final synchronized void method2821(int arg0) {
        if (this.field7078 < 0) {
            this.field7078 = -arg0;
        } else {
            this.field7078 = arg0;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "([IIIII)I", line = 378)
    private final int method2822(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7082 <= 0) {
                if (this.field7078 == -256 && (this.field7086 & 255) == 0) {
                    if (class382.field4824) {
                        return method2840(0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, 0, arg3, arg2, this);
                    }
                    return method2832(((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, 0, arg3, arg2, this);
                }
                if (class382.field4824) {
                    return method2839(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, 0, arg3, arg2, this, this.field7078, arg4);
                }
                return method2807(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, 0, arg3, arg2, this, this.field7078, arg4);
            }
            int var6 = this.field7082 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7082 += arg1;
            if (this.field7078 == -256 && (this.field7086 & 255) == 0) {
                if (class382.field4824) {
                    arg1 = method2831(0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, this.field7084, this.field7085, 0, var6, arg2, this);
                } else {
                    arg1 = method2833(((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, this.field7081, 0, var6, arg2, this);
                }
            } else if (class382.field4824) {
                arg1 = method2806(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, this.field7084, this.field7085, 0, var6, arg2, this, this.field7078, arg4);
            } else {
                arg1 = method2842(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, this.field7081, 0, var6, arg2, this, this.field7078, arg4);
            }
            this.field7082 -= arg1;
            if (this.field7082 != 0) {
                return arg1;
            }
        } while (!this.method2828());
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V", line = 434)
    public final synchronized void method2823(boolean arg0) {
        this.field7078 = (this.field7078 >>> 31) + (this.field7078 ^ this.field7078 >> 31);
        if (arg0) {
            this.field7078 = -this.field7078;
        }
    }

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "()V", line = 441)
    private final void method2824() {
        if (this.field7082 != 0) {
            if (this.field7087 == Integer.MIN_VALUE) {
                this.field7087 = 0;
            }
            this.field7082 = 0;
            this.method2838();
        }
    }

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "(I)V", line = 455)
    public final synchronized void method2825(int arg0) {
        int var2 = ((class555) super.field941).field7722.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7086 = arg0;
    }

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "()I", line = 466)
    public final synchronized int method2826() {
        return this.field7087 == Integer.MIN_VALUE ? 0 : this.field7087;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "([IIIII)I", line = 469)
    private final int method2827(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7082 <= 0) {
                if (this.field7078 == 256 && (this.field7086 & 255) == 0) {
                    if (class382.field4824) {
                        return method2835(0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, 0, arg3, arg2, this);
                    }
                    return method2819(((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, 0, arg3, arg2, this);
                }
                if (class382.field4824) {
                    return method2809(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, 0, arg3, arg2, this, this.field7078, arg4);
                }
                return method2815(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, 0, arg3, arg2, this, this.field7078, arg4);
            }
            int var6 = this.field7082 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7082 += arg1;
            if (this.field7078 == 256 && (this.field7086 & 255) == 0) {
                if (class382.field4824) {
                    arg1 = method2805(0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, this.field7084, this.field7085, 0, var6, arg2, this);
                } else {
                    arg1 = method2808(((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, this.field7081, 0, var6, arg2, this);
                }
            } else if (class382.field4824) {
                arg1 = method2812(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7088, this.field7083, this.field7084, this.field7085, 0, var6, arg2, this, this.field7078, arg4);
            } else {
                arg1 = method2834(0, 0, ((class555) super.field941).field7722, arg0, this.field7086, arg1, this.field7077, this.field7081, 0, var6, arg2, this, this.field7078, arg4);
            }
            this.field7082 -= arg1;
            if (this.field7082 != 0) {
                return arg1;
            }
        } while (!this.method2828());
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "()Z", line = 527)
    private final boolean method2828() {
        int var1 = this.field7087;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2818(var1, this.field7090);
            var2 = method2829(var1, this.field7090);
        }
        if (this.field7077 == var1 && this.field7088 == var3 && this.field7083 == var2) {
            if (this.field7087 == Integer.MIN_VALUE) {
                this.field7087 = 0;
                this.field7077 = this.field7088 = this.field7083 = 0;
                this.method1871(-41);
                return true;
            } else {
                this.method2838();
                return false;
            }
        } else {
            if (this.field7077 < var1) {
                this.field7081 = 1;
                this.field7082 = var1 - this.field7077;
            } else if (this.field7077 > var1) {
                this.field7081 = -1;
                this.field7082 = this.field7077 - var1;
            } else {
                this.field7081 = 0;
            }
            if (this.field7088 < var3) {
                this.field7084 = 1;
                if (this.field7082 == 0 || this.field7082 > var3 - this.field7088) {
                    this.field7082 = var3 - this.field7088;
                }
            } else if (this.field7088 > var3) {
                this.field7084 = -1;
                if (this.field7082 == 0 || this.field7082 > this.field7088 - var3) {
                    this.field7082 = this.field7088 - var3;
                }
            } else {
                this.field7084 = 0;
            }
            if (this.field7083 < var2) {
                this.field7085 = 1;
                if (this.field7082 == 0 || this.field7082 > var2 - this.field7083) {
                    this.field7082 = var2 - this.field7083;
                }
            } else if (this.field7083 > var2) {
                this.field7085 = -1;
                if (this.field7082 == 0 || this.field7082 > this.field7083 - var2) {
                    this.field7082 = this.field7083 - var2;
                }
            } else {
                this.field7085 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(II)I", line = 613)
    private static final int method2829(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "(I)V", line = 616)
    public final synchronized void method2830(int arg0) {
        this.method2844(arg0 << 6, this.method2814());
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I[B[IIIIIIIIIILhw;)I", line = 620)
    private static final int method2831(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class519 arg12) {
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
        arg12.field7077 += (var19 - arg4) * arg12.field7081;
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
        arg12.field7088 = var15 >> 2;
        arg12.field7083 = var16 >> 2;
        arg12.field7086 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "([B[IIIIIIILhw;)I", line = 674)
    private static final int method2832(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class519 arg8) {
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
        arg8.field7086 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "()Lpn;", line = 699)
    public final class69 method409() {
        return null;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "([III)V", line = 702)
    public final synchronized void method412(int[] arg0, int arg1, int arg2) {
        if (this.field7087 == 0 && this.field7082 == 0) {
            this.method410(arg2);
        } else {
            class555 var4 = (class555) super.field941;
            int var5 = this.field7080 << 8;
            int var6 = this.field7091 << 8;
            int var7 = var4.field7722.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7079 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7086 < 0) {
                if (this.field7078 <= 0) {
                    this.method2824();
                    this.method1871(-94);
                    return;
                }
                this.field7086 = 0;
            }
            if (this.field7086 >= var7) {
                if (this.field7078 >= 0) {
                    this.method2824();
                    this.method1871(-32);
                    return;
                }
                this.field7086 = var7 - 1;
            }
            if (this.field7079 < 0) {
                if (this.field7089) {
                    if (this.field7078 < 0) {
                        var9 = this.method2822(arg0, arg1, var5, var10, var4.field7722[this.field7080]);
                        if (this.field7086 >= var5) {
                            return;
                        }
                        this.field7086 = var5 + var5 - 1 - this.field7086;
                        this.field7078 = -this.field7078;
                    }
                    while (true) {
                        int var11 = this.method2827(arg0, var9, var6, var10, var4.field7722[this.field7091 - 1]);
                        if (this.field7086 < var6) {
                            return;
                        }
                        this.field7086 = var6 + var6 - 1 - this.field7086;
                        this.field7078 = -this.field7078;
                        var9 = this.method2822(arg0, var11, var5, var10, var4.field7722[this.field7080]);
                        if (this.field7086 >= var5) {
                            return;
                        }
                        this.field7086 = var5 + var5 - 1 - this.field7086;
                        this.field7078 = -this.field7078;
                    }
                } else if (this.field7078 < 0) {
                    while (true) {
                        var9 = this.method2822(arg0, var9, var5, var10, var4.field7722[this.field7091 - 1]);
                        if (this.field7086 >= var5) {
                            return;
                        }
                        this.field7086 = var6 - 1 - (var6 - 1 - this.field7086) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2827(arg0, var9, var6, var10, var4.field7722[this.field7080]);
                        if (this.field7086 < var6) {
                            return;
                        }
                        this.field7086 = (this.field7086 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7079 > 0) {
                    if (this.field7089) {
                        label130: {
                            if (this.field7078 < 0) {
                                var9 = this.method2822(arg0, arg1, var5, var10, var4.field7722[this.field7080]);
                                if (this.field7086 >= var5) {
                                    return;
                                }
                                this.field7086 = var5 + var5 - 1 - this.field7086;
                                this.field7078 = -this.field7078;
                                if (--this.field7079 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2827(arg0, var9, var6, var10, var4.field7722[this.field7091 - 1]);
                                if (this.field7086 < var6) {
                                    return;
                                }
                                this.field7086 = var6 + var6 - 1 - this.field7086;
                                this.field7078 = -this.field7078;
                                if (--this.field7079 == 0) {
                                    break;
                                }
                                var9 = this.method2822(arg0, var9, var5, var10, var4.field7722[this.field7080]);
                                if (this.field7086 >= var5) {
                                    return;
                                }
                                this.field7086 = var5 + var5 - 1 - this.field7086;
                                this.field7078 = -this.field7078;
                            } while (--this.field7079 != 0);
                        }
                    } else if (this.field7078 < 0) {
                        while (true) {
                            var9 = this.method2822(arg0, var9, var5, var10, var4.field7722[this.field7091 - 1]);
                            if (this.field7086 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7086) / var8;
                            if (var12 >= this.field7079) {
                                this.field7086 += this.field7079 * var8;
                                this.field7079 = 0;
                                break;
                            }
                            this.field7086 += var8 * var12;
                            this.field7079 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2827(arg0, var9, var6, var10, var4.field7722[this.field7080]);
                            if (this.field7086 < var6) {
                                return;
                            }
                            int var13 = (this.field7086 - var5) / var8;
                            if (var13 >= this.field7079) {
                                this.field7086 -= this.field7079 * var8;
                                this.field7079 = 0;
                                break;
                            }
                            this.field7086 -= var8 * var13;
                            this.field7079 -= var13;
                        }
                    }
                }
                if (this.field7078 < 0) {
                    this.method2822(arg0, var9, 0, var10, 0);
                    if (this.field7086 < 0) {
                        this.field7086 = -1;
                        this.method2824();
                        this.method1871(-70);
                        return;
                    }
                } else {
                    this.method2827(arg0, var9, var7, var10, 0);
                    if (this.field7086 >= var7) {
                        this.field7086 = var7;
                        this.method2824();
                        this.method1871(-67);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "()I", line = 937)
    public final int method415() {
        return this.field7087 == 0 && this.field7082 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "()I", line = 944)
    public final int method414() {
        int var1 = this.field7077 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7079 == 0) {
            var2 -= this.field7086 * var2 / (((class555) super.field941).field7722.length << 8);
        } else if (this.field7079 >= 0) {
            var2 -= this.field7080 * var2 / ((class555) super.field941).field7722.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 956)
    public final synchronized void method410(int arg0) {
        if (this.field7082 > 0) {
            if (arg0 >= this.field7082) {
                if (this.field7087 == Integer.MIN_VALUE) {
                    this.field7087 = 0;
                    this.field7077 = this.field7088 = this.field7083 = 0;
                    this.method1871(-92);
                    arg0 = this.field7082;
                }
                this.field7082 = 0;
                this.method2838();
            } else {
                this.field7077 += this.field7081 * arg0;
                this.field7088 += this.field7084 * arg0;
                this.field7083 += this.field7085 * arg0;
                this.field7082 -= arg0;
            }
        }
        class555 var2 = (class555) super.field941;
        int var3 = this.field7080 << 8;
        int var4 = this.field7091 << 8;
        int var5 = var2.field7722.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7079 = 0;
        }
        if (this.field7086 < 0) {
            if (this.field7078 <= 0) {
                this.method2824();
                this.method1871(-61);
                return;
            }
            this.field7086 = 0;
        }
        if (this.field7086 >= var5) {
            if (this.field7078 >= 0) {
                this.method2824();
                this.method1871(-79);
                return;
            }
            this.field7086 = var5 - 1;
        }
        this.field7086 += this.field7078 * arg0;
        if (this.field7079 < 0) {
            if (!this.field7089) {
                if (this.field7078 < 0) {
                    if (this.field7086 < var3) {
                        this.field7086 = var4 - 1 - (var4 - 1 - this.field7086) % var6;
                    }
                } else if (this.field7086 >= var4) {
                    this.field7086 = (this.field7086 - var3) % var6 + var3;
                }
            } else {
                if (this.field7078 < 0) {
                    if (this.field7086 >= var3) {
                        return;
                    }
                    this.field7086 = var3 + var3 - 1 - this.field7086;
                    this.field7078 = -this.field7078;
                }
                while (this.field7086 >= var4) {
                    this.field7086 = var4 + var4 - 1 - this.field7086;
                    this.field7078 = -this.field7078;
                    if (this.field7086 >= var3) {
                        return;
                    }
                    this.field7086 = var3 + var3 - 1 - this.field7086;
                    this.field7078 = -this.field7078;
                }
            }
        } else {
            if (this.field7079 > 0) {
                if (this.field7089) {
                    label125: {
                        if (this.field7078 < 0) {
                            if (this.field7086 >= var3) {
                                return;
                            }
                            this.field7086 = var3 + var3 - 1 - this.field7086;
                            this.field7078 = -this.field7078;
                            if (--this.field7079 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7086 < var4) {
                                return;
                            }
                            this.field7086 = var4 + var4 - 1 - this.field7086;
                            this.field7078 = -this.field7078;
                            if (--this.field7079 == 0) {
                                break;
                            }
                            if (this.field7086 >= var3) {
                                return;
                            }
                            this.field7086 = var3 + var3 - 1 - this.field7086;
                            this.field7078 = -this.field7078;
                        } while (--this.field7079 != 0);
                    }
                } else if (this.field7078 < 0) {
                    if (this.field7086 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7086) / var6;
                    if (var7 < this.field7079) {
                        this.field7086 += var6 * var7;
                        this.field7079 -= var7;
                        return;
                    }
                    this.field7086 += this.field7079 * var6;
                    this.field7079 = 0;
                } else {
                    if (this.field7086 < var4) {
                        return;
                    }
                    int var8 = (this.field7086 - var3) / var6;
                    if (var8 < this.field7079) {
                        this.field7086 -= var6 * var8;
                        this.field7079 -= var8;
                        return;
                    }
                    this.field7086 -= this.field7079 * var6;
                    this.field7079 = 0;
                }
            }
            if (this.field7078 < 0) {
                if (this.field7086 < 0) {
                    this.field7086 = -1;
                    this.method2824();
                    this.method1871(-22);
                    return;
                }
            } else if (this.field7086 >= var5) {
                this.field7086 = var5;
                this.method2824();
                this.method1871(-106);
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "([B[IIIIIIIILhw;)I", line = 1176)
    private static final int method2833(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class519 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7088 += (var14 - arg3) * arg9.field7084;
        arg9.field7083 += (var14 - arg3) * arg9.field7085;
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
        arg9.field7077 = var12 >> 2;
        arg9.field7086 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II[B[IIIIIIIILhw;II)I", line = 1210)
    private static final int method2834(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class519 arg11, int arg12, int arg13) {
        arg11.field7088 -= arg11.field7084 * arg5;
        arg11.field7083 -= arg11.field7085 * arg5;
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
        arg11.field7088 += arg11.field7084 * arg5;
        arg11.field7083 += arg11.field7085 * arg5;
        arg11.field7077 = arg6;
        arg11.field7086 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I[B[IIIIIIIILhw;)I", line = 1243)
    private static final int method2835(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class519 arg10) {
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
        arg10.field7086 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Loaa;III)Lhw;", line = 1281)
    public static final class519 method2836(class555 arg0, int arg1, int arg2, int arg3) {
        return arg0.field7722 != null && arg0.field7722.length != 0 ? new class519(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "(I)V", line = 1287)
    public final synchronized void method2837(int arg0) {
        if (arg0 == 0) {
            this.method2817(0);
            this.method1871(-74);
        } else if (this.field7088 == 0 && this.field7083 == 0) {
            this.field7082 = 0;
            this.field7087 = 0;
            this.field7077 = 0;
            this.method1871(-63);
        } else {
            int var2 = -this.field7077;
            if (this.field7077 > var2) {
                var2 = this.field7077;
            }
            if (-this.field7088 > var2) {
                var2 = -this.field7088;
            }
            if (this.field7088 > var2) {
                var2 = this.field7088;
            }
            if (-this.field7083 > var2) {
                var2 = -this.field7083;
            }
            if (this.field7083 > var2) {
                var2 = this.field7083;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7082 = arg0;
            this.field7087 = Integer.MIN_VALUE;
            this.field7081 = -this.field7077 / arg0;
            this.field7084 = -this.field7088 / arg0;
            this.field7085 = -this.field7083 / arg0;
        }
    }

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "()V", line = 1332)
    private final void method2838() {
        this.field7077 = this.field7087;
        this.field7088 = method2818(this.field7087, this.field7090);
        this.field7083 = method2829(this.field7087, this.field7090);
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(II[B[IIIIIIIILhw;II)I", line = 1339)
    private static final int method2839(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class519 arg11, int arg12, int arg13) {
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
        arg11.field7086 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I[B[IIIIIIIILhw;)I", line = 1371)
    private static final int method2840(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class519 arg10) {
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
        arg10.field7086 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "(I)V", line = 1410)
    public final synchronized void method2841(int arg0) {
        this.field7079 = arg0;
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(II[B[IIIIIIIILhw;II)I", line = 1414)
    private static final int method2842(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class519 arg11, int arg12, int arg13) {
        arg11.field7088 -= arg11.field7084 * arg5;
        arg11.field7083 -= arg11.field7085 * arg5;
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
        arg11.field7088 += arg11.field7084 * arg5;
        arg11.field7083 += arg11.field7085 * arg5;
        arg11.field7077 = arg6;
        arg11.field7086 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "()Z", line = 1448)
    public final boolean method2843() {
        return this.field7082 != 0;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Loaa;II)V", line = 1452)
    private class519(class555 arg0, int arg1, int arg2) {
        super.field941 = arg0;
        this.field7080 = arg0.field7723;
        this.field7091 = arg0.field7725;
        this.field7089 = arg0.field7726;
        this.field7078 = arg1;
        this.field7087 = arg2;
        this.field7090 = 8192;
        this.field7086 = 0;
        this.method2838();
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Loaa;III)V", line = 1463)
    private class519(class555 arg0, int arg1, int arg2, int arg3) {
        super.field941 = arg0;
        this.field7080 = arg0.field7723;
        this.field7091 = arg0.field7725;
        this.field7089 = arg0.field7726;
        this.field7078 = arg1;
        this.field7087 = arg2;
        this.field7090 = arg3;
        this.field7086 = 0;
        this.method2838();
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(II)V", line = 1475)
    private final synchronized void method2844(int arg0, int arg1) {
        this.field7087 = arg0;
        this.field7090 = arg1;
        this.field7082 = 0;
        this.method2838();
    }
}
