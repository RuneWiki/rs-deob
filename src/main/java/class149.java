import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class149 extends class247 {

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Z")
    private boolean field2530;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    private int field2527;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    private int field2539;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B[IIIIIIIILge;II)I", line = 3)
    private static final int method1144(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class149 arg11, int arg12, int arg13) {
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
        arg11.field2527 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()I", line = 36)
    public final synchronized int method1145() {
        return this.field2533 < 0 ? -1 : this.field2533;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)V", line = 39)
    private final synchronized void method1146(int arg0, int arg1) {
        this.field2538 = arg0;
        this.field2533 = arg1;
        this.field2534 = 0;
        this.method1163();
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()I", line = 46)
    public final int method1147() {
        int var1 = this.field2536 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2528 == 0) {
            var2 -= this.field2527 * var2 / (((class253) this.field4090).field4232.length << 8);
        } else if (this.field2528 >= 0) {
            var2 -= this.field2537 * var2 / ((class253) this.field4090).field4232.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V", line = 58)
    public final synchronized void method1148(int arg0) {
        this.method1146(arg0 << 6, this.method1145());
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B[IIIIIIIIIILge;)I", line = 61)
    private static final int method1149(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class149 arg12) {
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
        arg12.field2536 += (var19 - arg4) * arg12.field2539;
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
        arg12.field2529 = var15 >> 2;
        arg12.field2532 = var16 >> 2;
        arg12.field2527 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V", line = 115)
    public final synchronized void method1150(int arg0) {
        if (arg0 == 0) {
            this.method1155(0);
            this.method1325(-2935);
        } else if (this.field2529 == 0 && this.field2532 == 0) {
            this.field2534 = 0;
            this.field2538 = 0;
            this.field2536 = 0;
            this.method1325(-2935);
        } else {
            int var2 = -this.field2536;
            if (this.field2536 > var2) {
                var2 = this.field2536;
            }
            if (-this.field2529 > var2) {
                var2 = -this.field2529;
            }
            if (this.field2529 > var2) {
                var2 = this.field2529;
            }
            if (-this.field2532 > var2) {
                var2 = -this.field2532;
            }
            if (this.field2532 > var2) {
                var2 = this.field2532;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2534 = arg0;
            this.field2538 = Integer.MIN_VALUE;
            this.field2539 = -this.field2536 / arg0;
            this.field2526 = -this.field2529 / arg0;
            this.field2531 = -this.field2532 / arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V", line = 161)
    public final synchronized void method1151(int arg0) {
        if (this.field2535 < 0) {
            this.field2535 = -arg0;
        } else {
            this.field2535 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)I", line = 169)
    private static final int method1152(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V", line = 172)
    public final synchronized void method1153(int arg0) {
        this.field2528 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "()V", line = 179)
    private final void method1154() {
        if (this.field2534 == 0) {
            return;
        }
        if (this.field2538 == Integer.MIN_VALUE) {
            this.field2538 = 0;
        }
        this.field2534 = 0;
        this.method1163();
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V", line = 190)
    private final synchronized void method1155(int arg0) {
        this.method1146(arg0, this.method1145());
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Lt;", line = 194)
    public final class247 method301() {
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[B[IIIIIIIILge;II)I", line = 197)
    private static final int method1156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class149 arg11, int arg12, int arg13) {
        arg11.field2529 -= arg11.field2526 * arg5;
        arg11.field2532 -= arg11.field2531 * arg5;
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
        arg11.field2529 += arg11.field2526 * arg5;
        arg11.field2532 += arg11.field2531 * arg5;
        arg11.field2536 = arg6;
        arg11.field2527 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I[B[IIIIIIIIIILge;)I", line = 230)
    private static final int method1157(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class149 arg12) {
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
        arg12.field2536 += (var19 - arg4) * arg12.field2539;
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
        arg12.field2529 = var15 >> 2;
        arg12.field2532 = var16 >> 2;
        arg12.field2527 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "()Z", line = 283)
    public final boolean method1158() {
        return this.field2527 < 0 || this.field2527 >= ((class253) this.field4090).field4232.length << 8;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lid;II)Lge;", line = 288)
    public static final class149 method1159(class253 arg0, int arg1, int arg2) {
        return arg0.field4232 == null || arg0.field4232.length == 0 ? null : new class149(arg0, (int) ((long) arg0.field4230 * 256L * (long) arg1 / (long) (class218.field3594 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "()I", line = 297)
    public final synchronized int method1160() {
        return this.field2538 == Integer.MIN_VALUE ? 0 : this.field2538;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V", line = 302)
    public final synchronized void method1161(int arg0, int arg1) {
        this.method1173(arg0, arg1, this.method1145());
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B[IIIIIIIIIILge;II)I", line = 305)
    private static final int method1162(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class149 arg13, int arg14, int arg15) {
        arg13.field2536 -= arg13.field2539 * arg5;
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
        arg13.field2536 += arg13.field2539 * var27;
        arg13.field2529 = arg6;
        arg13.field2532 = arg7;
        arg13.field2527 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "()V", line = 348)
    private final void method1163() {
        this.field2536 = this.field2538;
        this.field2529 = method1179(this.field2538, this.field2533);
        this.field2532 = method1152(this.field2538, this.field2533);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B[IIIIIIILge;)I", line = 354)
    private static final int method1164(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class149 arg8) {
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
        arg8.field2527 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B[IIIIIIIILge;)I", line = 379)
    private static final int method1165(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class149 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2529 += (var14 - arg3) * arg9.field2526;
        arg9.field2532 += (var14 - arg3) * arg9.field2531;
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
        arg9.field2536 = var12 >> 2;
        arg9.field2527 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II[B[IIIIIIIILge;II)I", line = 413)
    private static final int method1166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class149 arg11, int arg12, int arg13) {
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
        arg11.field2527 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIIII)I", line = 446)
    private final int method1167(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2534 > 0) {
                int var6 = this.field2534 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2534 += arg1;
                if (this.field2535 == -256 && (this.field2527 & 0xFF) == 0) {
                    if (class159.field2694) {
                        arg1 = method1149(0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, this.field2526, this.field2531, 0, var6, arg2, this);
                    } else {
                        arg1 = method1172(((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, this.field2539, 0, var6, arg2, this);
                    }
                } else if (class159.field2694) {
                    arg1 = method1169(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, this.field2526, this.field2531, 0, var6, arg2, this, this.field2535, arg4);
                } else {
                    arg1 = method1156(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, this.field2539, 0, var6, arg2, this, this.field2535, arg4);
                }
                this.field2534 -= arg1;
                if (this.field2534 != 0) {
                    return arg1;
                }
                if (!this.method1181()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2535 == -256 && (this.field2527 & 0xFF) == 0) {
                if (class159.field2694) {
                    return method1183(0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, 0, arg3, arg2, this);
                }
                return method1182(((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, 0, arg3, arg2, this);
            }
            if (class159.field2694) {
                return method1166(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, 0, arg3, arg2, this, this.field2535, arg4);
            }
            return method1171(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, 0, arg3, arg2, this, this.field2535, arg4);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 507)
    public final synchronized void method303(int arg0) {
        if (this.field2534 > 0) {
            if (arg0 >= this.field2534) {
                if (this.field2538 == Integer.MIN_VALUE) {
                    this.field2538 = 0;
                    this.field2536 = this.field2529 = this.field2532 = 0;
                    this.method1325(-2935);
                    arg0 = this.field2534;
                }
                this.field2534 = 0;
                this.method1163();
            } else {
                this.field2536 += this.field2539 * arg0;
                this.field2529 += this.field2526 * arg0;
                this.field2532 += this.field2531 * arg0;
                this.field2534 -= arg0;
            }
        }
        class253 var2 = (class253) this.field4090;
        int var3 = this.field2537 << 8;
        int var4 = this.field2525 << 8;
        int var5 = var2.field4232.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2528 = 0;
        }
        if (this.field2527 < 0) {
            if (this.field2535 <= 0) {
                this.method1154();
                this.method1325(-2935);
                return;
            }
            this.field2527 = 0;
        }
        if (this.field2527 >= var5) {
            if (this.field2535 >= 0) {
                this.method1154();
                this.method1325(-2935);
                return;
            }
            this.field2527 = var5 - 1;
        }
        this.field2527 += this.field2535 * arg0;
        if (this.field2528 >= 0) {
            if (this.field2528 > 0) {
                if (this.field2530) {
                    label121: {
                        if (this.field2535 < 0) {
                            if (this.field2527 >= var3) {
                                return;
                            }
                            this.field2527 = var3 + var3 - this.field2527 - 1;
                            this.field2535 = -this.field2535;
                            if (--this.field2528 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2527 < var4) {
                                return;
                            }
                            this.field2527 = var4 + var4 - this.field2527 - 1;
                            this.field2535 = -this.field2535;
                            if (--this.field2528 == 0) {
                                break;
                            }
                            if (this.field2527 >= var3) {
                                return;
                            }
                            this.field2527 = var3 + var3 - this.field2527 - 1;
                            this.field2535 = -this.field2535;
                        } while (--this.field2528 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2535 < 0) {
                            if (this.field2527 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2527 - 1) / var6;
                            if (var7 >= this.field2528) {
                                this.field2527 += this.field2528 * var6;
                                this.field2528 = 0;
                                break label153;
                            }
                            this.field2527 += var6 * var7;
                            this.field2528 -= var7;
                        } else if (this.field2527 >= var4) {
                            int var8 = (this.field2527 - var3) / var6;
                            if (var8 >= this.field2528) {
                                this.field2527 -= this.field2528 * var6;
                                this.field2528 = 0;
                                break label153;
                            }
                            this.field2527 -= var6 * var8;
                            this.field2528 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2535 < 0) {
                if (this.field2527 < 0) {
                    this.field2527 = -1;
                    this.method1154();
                    this.method1325(-2935);
                }
            } else if (this.field2527 >= var5) {
                this.field2527 = var5;
                this.method1154();
                this.method1325(-2935);
            }
        } else if (this.field2530) {
            if (this.field2535 < 0) {
                if (this.field2527 >= var3) {
                    return;
                }
                this.field2527 = var3 + var3 - this.field2527 - 1;
                this.field2535 = -this.field2535;
            }
            while (this.field2527 >= var4) {
                this.field2527 = var4 + var4 - this.field2527 - 1;
                this.field2535 = -this.field2535;
                if (this.field2527 >= var3) {
                    return;
                }
                this.field2527 = var3 + var3 - this.field2527 - 1;
                this.field2535 = -this.field2535;
            }
        } else if (this.field2535 < 0) {
            if (this.field2527 >= var3) {
                return;
            }
            this.field2527 = var4 - (var4 - 1 - this.field2527) % var6 - 1;
        } else if (this.field2527 >= var4) {
            this.field2527 = (this.field2527 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([IIIII)I", line = 725)
    private final int method1168(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2534 > 0) {
                int var6 = this.field2534 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2534 += arg1;
                if (this.field2535 == 256 && (this.field2527 & 0xFF) == 0) {
                    if (class159.field2694) {
                        arg1 = method1157(0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, this.field2526, this.field2531, 0, var6, arg2, this);
                    } else {
                        arg1 = method1165(((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, this.field2539, 0, var6, arg2, this);
                    }
                } else if (class159.field2694) {
                    arg1 = method1162(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, this.field2526, this.field2531, 0, var6, arg2, this, this.field2535, arg4);
                } else {
                    arg1 = method1174(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, this.field2539, 0, var6, arg2, this, this.field2535, arg4);
                }
                this.field2534 -= arg1;
                if (this.field2534 != 0) {
                    return arg1;
                }
                if (!this.method1181()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2535 == 256 && (this.field2527 & 0xFF) == 0) {
                if (class159.field2694) {
                    return method1180(0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, 0, arg3, arg2, this);
                }
                return method1164(((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, 0, arg3, arg2, this);
            }
            if (class159.field2694) {
                return method1144(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2529, this.field2532, 0, arg3, arg2, this, this.field2535, arg4);
            }
            return method1178(0, 0, ((class253) this.field4090).field4232, arg0, this.field2527, arg1, this.field2536, 0, arg3, arg2, this, this.field2535, arg4);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[B[IIIIIIIIIILge;II)I", line = 780)
    private static final int method1169(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class149 arg13, int arg14, int arg15) {
        arg13.field2536 -= arg13.field2539 * arg5;
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
        arg13.field2536 += arg13.field2539 * var26;
        arg13.field2529 = arg6;
        arg13.field2532 = arg7;
        arg13.field2527 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lid;III)Lge;", line = 821)
    public static final class149 method1170(class253 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4232 == null || arg0.field4232.length == 0 ? null : new class149(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[B[IIIIIIILge;II)I", line = 827)
    private static final int method1171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class149 arg10, int arg11, int arg12) {
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
        arg10.field2527 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([B[IIIIIIIILge;)I", line = 854)
    private static final int method1172(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class149 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2529 += (var14 - arg3) * arg9.field2526;
        arg9.field2532 += (var14 - arg3) * arg9.field2531;
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
        arg9.field2536 = var12 >> 2;
        arg9.field2527 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V", line = 888)
    public final synchronized void method1173(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1146(arg1, arg2);
            return;
        }
        int var4 = method1179(arg1, arg2);
        int var5 = method1152(arg1, arg2);
        if (this.field2529 == var4 && this.field2532 == var5) {
            this.field2534 = 0;
            return;
        }
        int var6 = arg1 - this.field2536;
        if (this.field2536 - arg1 > var6) {
            var6 = this.field2536 - arg1;
        }
        if (var4 - this.field2529 > var6) {
            var6 = var4 - this.field2529;
        }
        if (this.field2529 - var4 > var6) {
            var6 = this.field2529 - var4;
        }
        if (var5 - this.field2532 > var6) {
            var6 = var5 - this.field2532;
        }
        if (this.field2532 - var5 > var6) {
            var6 = this.field2532 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2534 = arg0;
        this.field2538 = arg1;
        this.field2533 = arg2;
        this.field2539 = (arg1 - this.field2536) / arg0;
        this.field2526 = (var4 - this.field2529) / arg0;
        this.field2531 = (var5 - this.field2532) / arg0;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II[B[IIIIIIIILge;II)I", line = 934)
    private static final int method1174(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class149 arg11, int arg12, int arg13) {
        arg11.field2529 -= arg11.field2526 * arg5;
        arg11.field2532 -= arg11.field2531 * arg5;
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
        arg11.field2529 += arg11.field2526 * arg5;
        arg11.field2532 += arg11.field2531 * arg5;
        arg11.field2536 = arg6;
        arg11.field2527 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "()Z", line = 969)
    public final boolean method1175() {
        return this.field2534 != 0;
    }

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "()I", line = 972)
    public final synchronized int method1176() {
        return this.field2535 < 0 ? -this.field2535 : this.field2535;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([III)V", line = 975)
    public final synchronized void method307(int[] arg0, int arg1, int arg2) {
        if (this.field2538 == 0 && this.field2534 == 0) {
            this.method303(arg2);
            return;
        }
        class253 var4 = (class253) this.field4090;
        int var5 = this.field2537 << 8;
        int var6 = this.field2525 << 8;
        int var7 = var4.field4232.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2528 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2527 < 0) {
            if (this.field2535 <= 0) {
                this.method1154();
                this.method1325(-2935);
                return;
            }
            this.field2527 = 0;
        }
        if (this.field2527 >= var7) {
            if (this.field2535 >= 0) {
                this.method1154();
                this.method1325(-2935);
                return;
            }
            this.field2527 = var7 - 1;
        }
        if (this.field2528 >= 0) {
            if (this.field2528 > 0) {
                if (this.field2530) {
                    label131: {
                        if (this.field2535 < 0) {
                            var9 = this.method1167(arg0, arg1, var5, var10, var4.field4232[this.field2537]);
                            if (this.field2527 >= var5) {
                                return;
                            }
                            this.field2527 = var5 + var5 - this.field2527 - 1;
                            this.field2535 = -this.field2535;
                            if (--this.field2528 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1168(arg0, var9, var6, var10, var4.field4232[this.field2525 - 1]);
                            if (this.field2527 < var6) {
                                return;
                            }
                            this.field2527 = var6 + var6 - this.field2527 - 1;
                            this.field2535 = -this.field2535;
                            if (--this.field2528 == 0) {
                                break;
                            }
                            var9 = this.method1167(arg0, var9, var5, var10, var4.field4232[this.field2537]);
                            if (this.field2527 >= var5) {
                                return;
                            }
                            this.field2527 = var5 + var5 - this.field2527 - 1;
                            this.field2535 = -this.field2535;
                        } while (--this.field2528 != 0);
                    }
                } else if (this.field2535 < 0) {
                    while (true) {
                        var9 = this.method1167(arg0, var9, var5, var10, var4.field4232[this.field2525 - 1]);
                        if (this.field2527 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2527 - 1) / var8;
                        if (var12 >= this.field2528) {
                            this.field2527 += this.field2528 * var8;
                            this.field2528 = 0;
                            break;
                        }
                        this.field2527 += var8 * var12;
                        this.field2528 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1168(arg0, var9, var6, var10, var4.field4232[this.field2537]);
                        if (this.field2527 < var6) {
                            return;
                        }
                        int var13 = (this.field2527 - var5) / var8;
                        if (var13 >= this.field2528) {
                            this.field2527 -= this.field2528 * var8;
                            this.field2528 = 0;
                            break;
                        }
                        this.field2527 -= var8 * var13;
                        this.field2528 -= var13;
                    }
                }
            }
            if (this.field2535 < 0) {
                this.method1167(arg0, var9, 0, var10, 0);
                if (this.field2527 < 0) {
                    this.field2527 = -1;
                    this.method1154();
                    this.method1325(-2935);
                }
            } else {
                this.method1168(arg0, var9, var7, var10, 0);
                if (this.field2527 >= var7) {
                    this.field2527 = var7;
                    this.method1154();
                    this.method1325(-2935);
                }
            }
        } else if (this.field2530) {
            if (this.field2535 < 0) {
                var9 = this.method1167(arg0, arg1, var5, var10, var4.field4232[this.field2537]);
                if (this.field2527 >= var5) {
                    return;
                }
                this.field2527 = var5 + var5 - this.field2527 - 1;
                this.field2535 = -this.field2535;
            }
            while (true) {
                int var11 = this.method1168(arg0, var9, var6, var10, var4.field4232[this.field2525 - 1]);
                if (this.field2527 < var6) {
                    return;
                }
                this.field2527 = var6 + var6 - this.field2527 - 1;
                this.field2535 = -this.field2535;
                var9 = this.method1167(arg0, var11, var5, var10, var4.field4232[this.field2537]);
                if (this.field2527 >= var5) {
                    return;
                }
                this.field2527 = var5 + var5 - this.field2527 - 1;
                this.field2535 = -this.field2535;
            }
        } else if (this.field2535 < 0) {
            while (true) {
                var9 = this.method1167(arg0, var9, var5, var10, var4.field4232[this.field2525 - 1]);
                if (this.field2527 >= var5) {
                    return;
                }
                this.field2527 = var6 - (var6 - 1 - this.field2527) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1168(arg0, var9, var6, var10, var4.field4232[this.field2537]);
                if (this.field2527 < var6) {
                    return;
                }
                this.field2527 = (this.field2527 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 1212)
    public final synchronized void method1177(boolean arg0) {
        this.field2535 = (this.field2535 >>> 31) + (this.field2535 ^ this.field2535 >> 31);
        if (arg0) {
            this.field2535 = -this.field2535;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[B[IIIIIIILge;II)I", line = 1218)
    private static final int method1178(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class149 arg10, int arg11, int arg12) {
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
        arg10.field2527 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(II)I", line = 1244)
    private static final int method1179(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I", line = 1248)
    public final int method304() {
        return this.field2538 == 0 && this.field2534 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[B[IIIIIIIILge;)I", line = 1254)
    private static final int method1180(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class149 arg10) {
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
        arg10.field2527 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()Lt;", line = 1292)
    public final class247 method298() {
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "()Z", line = 1297)
    private final boolean method1181() {
        int var1 = this.field2538;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1179(var1, this.field2533);
            var2 = method1152(var1, this.field2533);
        }
        if (this.field2536 != var1 || this.field2529 != var3 || this.field2532 != var2) {
            if (this.field2536 < var1) {
                this.field2539 = 1;
                this.field2534 = var1 - this.field2536;
            } else if (this.field2536 > var1) {
                this.field2539 = -1;
                this.field2534 = this.field2536 - var1;
            } else {
                this.field2539 = 0;
            }
            if (this.field2529 < var3) {
                this.field2526 = 1;
                if (this.field2534 == 0 || this.field2534 > var3 - this.field2529) {
                    this.field2534 = var3 - this.field2529;
                }
            } else if (this.field2529 > var3) {
                this.field2526 = -1;
                if (this.field2534 == 0 || this.field2534 > this.field2529 - var3) {
                    this.field2534 = this.field2529 - var3;
                }
            } else {
                this.field2526 = 0;
            }
            if (this.field2532 < var2) {
                this.field2531 = 1;
                if (this.field2534 == 0 || this.field2534 > var2 - this.field2532) {
                    this.field2534 = var2 - this.field2532;
                }
            } else if (this.field2532 > var2) {
                this.field2531 = -1;
                if (this.field2534 == 0 || this.field2534 > this.field2532 - var2) {
                    this.field2534 = this.field2532 - var2;
                }
            } else {
                this.field2531 = 0;
            }
            return false;
        } else if (this.field2538 == Integer.MIN_VALUE) {
            this.field2538 = 0;
            this.field2536 = this.field2529 = this.field2532 = 0;
            this.method1325(-2935);
            return true;
        } else {
            this.method1163();
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([B[IIIIIIILge;)I", line = 1382)
    private static final int method1182(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class149 arg8) {
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
        arg8.field2527 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lid;II)V", line = 1407)
    private class149(class253 arg0, int arg1, int arg2) {
        this.field4090 = arg0;
        this.field2537 = arg0.field4228;
        this.field2525 = arg0.field4229;
        this.field2530 = arg0.field4231;
        this.field2535 = arg1;
        this.field2538 = arg2;
        this.field2533 = 8192;
        this.field2527 = 0;
        this.method1163();
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I[B[IIIIIIIILge;)I", line = 1419)
    private static final int method1183(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class149 arg10) {
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
        arg10.field2527 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "(I)V", line = 1460)
    public final synchronized void method1184(int arg0) {
        int var2 = ((class253) this.field4090).field4232.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2527 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lid;III)V", line = 1469)
    private class149(class253 arg0, int arg1, int arg2, int arg3) {
        this.field4090 = arg0;
        this.field2537 = arg0.field4228;
        this.field2525 = arg0.field4229;
        this.field2530 = arg0.field4231;
        this.field2535 = arg1;
        this.field2538 = arg2;
        this.field2533 = arg3;
        this.field2527 = 0;
        this.method1163();
    }
}
