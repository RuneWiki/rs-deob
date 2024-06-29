import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class193 extends class186 {

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    private int field3711;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Z")
    private boolean field3713;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    private int field3712;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    private int field3723;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIII)I")
    private final int method1272(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3720 <= 0) {
                if (this.field3715 == -256 && (this.field3718 & 255) == 0) {
                    if (class16.field290) {
                        return method1284(0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, 0, arg3, arg2, this);
                    }
                    return method1287(((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, 0, arg3, arg2, this);
                }
                if (class16.field290) {
                    return method1280(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, 0, arg3, arg2, this, this.field3715, arg4);
                }
                return method1281(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, 0, arg3, arg2, this, this.field3715, arg4);
            }
            int var6 = this.field3720 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3720 += arg1;
            if (this.field3715 == -256 && (this.field3718 & 255) == 0) {
                if (class16.field290) {
                    arg1 = method1308(0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, this.field3714, this.field3719, 0, var6, arg2, this);
                } else {
                    arg1 = method1306(((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, this.field3709, 0, var6, arg2, this);
                }
            } else if (class16.field290) {
                arg1 = method1286(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, this.field3714, this.field3719, 0, var6, arg2, this, this.field3715, arg4);
            } else {
                arg1 = method1294(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, this.field3709, 0, var6, arg2, this, this.field3715, arg4);
            }
            this.field3720 -= arg1;
            if (this.field3720 != 0) {
                return arg1;
            }
        } while (!this.method1299());
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()I")
    public final synchronized int method1273() {
        return this.field3717 == Integer.MIN_VALUE ? 0 : this.field3717;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIILtd;II)I")
    private static final int method1274(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class193 arg10, int arg11, int arg12) {
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
        arg10.field3718 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B[IIIIIIIILtd;)I")
    private static final int method1275(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class193 arg10) {
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
        arg10.field3718 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1276(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class193 arg11, int arg12, int arg13) {
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
        arg11.field3718 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([IIIII)I")
    private final int method1277(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3720 <= 0) {
                if (this.field3715 == 256 && (this.field3718 & 255) == 0) {
                    if (class16.field290) {
                        return method1275(0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, 0, arg3, arg2, this);
                    }
                    return method1303(((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, 0, arg3, arg2, this);
                }
                if (class16.field290) {
                    return method1276(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, 0, arg3, arg2, this, this.field3715, arg4);
                }
                return method1274(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, 0, arg3, arg2, this, this.field3715, arg4);
            }
            int var6 = this.field3720 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3720 += arg1;
            if (this.field3715 == 256 && (this.field3718 & 255) == 0) {
                if (class16.field290) {
                    arg1 = method1300(0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, this.field3714, this.field3719, 0, var6, arg2, this);
                } else {
                    arg1 = method1298(((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, this.field3709, 0, var6, arg2, this);
                }
            } else if (class16.field290) {
                arg1 = method1279(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3723, this.field3712, this.field3714, this.field3719, 0, var6, arg2, this, this.field3715, arg4);
            } else {
                arg1 = method1292(0, 0, ((class140) super.field3613).field2683, arg0, this.field3718, arg1, this.field3716, this.field3709, 0, var6, arg2, this, this.field3715, arg4);
            }
            this.field3720 -= arg1;
            if (this.field3720 != 0) {
                return arg1;
            }
        } while (!this.method1299());
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
    private final void method1278() {
        this.field3716 = this.field3717;
        this.field3723 = method1305(this.field3717, this.field3721);
        this.field3712 = method1288(this.field3717, this.field3721);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIIIIILtd;II)I")
    private static final int method1279(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class193 arg13, int arg14, int arg15) {
        arg13.field3716 -= arg13.field3709 * arg5;
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
        arg13.field3716 += arg13.field3709 * var22;
        arg13.field3723 = arg6;
        arg13.field3712 = arg7;
        arg13.field3718 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1280(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class193 arg11, int arg12, int arg13) {
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
        arg11.field3718 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIILtd;II)I")
    private static final int method1281(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class193 arg10, int arg11, int arg12) {
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
        arg10.field3718 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()I")
    public final synchronized int method1282() {
        return this.field3721 < 0 ? -1 : this.field3721;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Loa;II)Ltd;")
    public static final class193 method1283(class140 arg0, int arg1, int arg2) {
        return arg0.field2683 != null && arg0.field2683.length != 0 ? new class193(arg0, (int) ((long) arg0.field2680 * 256L * (long) arg1 / (long) (class108.field2080 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I[B[IIIIIIIILtd;)I")
    private static final int method1284(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class193 arg10) {
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
        arg10.field3718 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public final synchronized void method1285(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1293(arg1, arg2);
        } else {
            int var4 = method1305(arg1, arg2);
            int var5 = method1288(arg1, arg2);
            if (this.field3723 == var4 && this.field3712 == var5) {
                this.field3720 = 0;
            } else {
                int var6 = arg1 - this.field3716;
                if (this.field3716 - arg1 > var6) {
                    var6 = this.field3716 - arg1;
                }
                if (var4 - this.field3723 > var6) {
                    var6 = var4 - this.field3723;
                }
                if (this.field3723 - var4 > var6) {
                    var6 = this.field3723 - var4;
                }
                if (var5 - this.field3712 > var6) {
                    var6 = var5 - this.field3712;
                }
                if (this.field3712 - var5 > var6) {
                    var6 = this.field3712 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3720 = arg0;
                this.field3717 = arg1;
                this.field3721 = arg2;
                this.field3709 = (arg1 - this.field3716) / arg0;
                this.field3714 = (var4 - this.field3723) / arg0;
                this.field3719 = (var5 - this.field3712) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIIIIILtd;II)I")
    private static final int method1286(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class193 arg13, int arg14, int arg15) {
        arg13.field3716 -= arg13.field3709 * arg5;
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
        arg13.field3716 += arg13.field3709 * var22;
        arg13.field3723 = arg6;
        arg13.field3712 = arg7;
        arg13.field3718 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([III)V")
    public final synchronized void method474(int[] arg0, int arg1, int arg2) {
        if (this.field3717 == 0 && this.field3720 == 0) {
            this.method468(arg2);
        } else {
            class140 var4 = (class140) super.field3613;
            int var5 = this.field3722 << 8;
            int var6 = this.field3711 << 8;
            int var7 = var4.field2683.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3710 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3718 < 0) {
                if (this.field3715 <= 0) {
                    this.method1311();
                    this.method1392(128);
                    return;
                }
                this.field3718 = 0;
            }
            if (this.field3718 >= var7) {
                if (this.field3715 >= 0) {
                    this.method1311();
                    this.method1392(128);
                    return;
                }
                this.field3718 = var7 - 1;
            }
            if (this.field3710 < 0) {
                if (this.field3713) {
                    if (this.field3715 < 0) {
                        var9 = this.method1272(arg0, arg1, var5, var10, var4.field2683[this.field3722]);
                        if (this.field3718 >= var5) {
                            return;
                        }
                        this.field3718 = var5 + var5 - 1 - this.field3718;
                        this.field3715 = -this.field3715;
                    }
                    while (true) {
                        int var11 = this.method1277(arg0, var9, var6, var10, var4.field2683[this.field3711 - 1]);
                        if (this.field3718 < var6) {
                            return;
                        }
                        this.field3718 = var6 + var6 - 1 - this.field3718;
                        this.field3715 = -this.field3715;
                        var9 = this.method1272(arg0, var11, var5, var10, var4.field2683[this.field3722]);
                        if (this.field3718 >= var5) {
                            return;
                        }
                        this.field3718 = var5 + var5 - 1 - this.field3718;
                        this.field3715 = -this.field3715;
                    }
                } else if (this.field3715 < 0) {
                    while (true) {
                        var9 = this.method1272(arg0, var9, var5, var10, var4.field2683[this.field3711 - 1]);
                        if (this.field3718 >= var5) {
                            return;
                        }
                        this.field3718 = var6 - 1 - (var6 - 1 - this.field3718) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1277(arg0, var9, var6, var10, var4.field2683[this.field3722]);
                        if (this.field3718 < var6) {
                            return;
                        }
                        this.field3718 = (this.field3718 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3710 > 0) {
                    if (this.field3713) {
                        label130: {
                            if (this.field3715 < 0) {
                                var9 = this.method1272(arg0, arg1, var5, var10, var4.field2683[this.field3722]);
                                if (this.field3718 >= var5) {
                                    return;
                                }
                                this.field3718 = var5 + var5 - 1 - this.field3718;
                                this.field3715 = -this.field3715;
                                if (--this.field3710 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1277(arg0, var9, var6, var10, var4.field2683[this.field3711 - 1]);
                                if (this.field3718 < var6) {
                                    return;
                                }
                                this.field3718 = var6 + var6 - 1 - this.field3718;
                                this.field3715 = -this.field3715;
                                if (--this.field3710 == 0) {
                                    break;
                                }
                                var9 = this.method1272(arg0, var9, var5, var10, var4.field2683[this.field3722]);
                                if (this.field3718 >= var5) {
                                    return;
                                }
                                this.field3718 = var5 + var5 - 1 - this.field3718;
                                this.field3715 = -this.field3715;
                            } while (--this.field3710 != 0);
                        }
                    } else if (this.field3715 < 0) {
                        while (true) {
                            var9 = this.method1272(arg0, var9, var5, var10, var4.field2683[this.field3711 - 1]);
                            if (this.field3718 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3718) / var8;
                            if (var12 >= this.field3710) {
                                this.field3718 += this.field3710 * var8;
                                this.field3710 = 0;
                                break;
                            }
                            this.field3718 += var8 * var12;
                            this.field3710 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1277(arg0, var9, var6, var10, var4.field2683[this.field3722]);
                            if (this.field3718 < var6) {
                                return;
                            }
                            int var13 = (this.field3718 - var5) / var8;
                            if (var13 >= this.field3710) {
                                this.field3718 -= this.field3710 * var8;
                                this.field3710 = 0;
                                break;
                            }
                            this.field3718 -= var8 * var13;
                            this.field3710 -= var13;
                        }
                    }
                }
                if (this.field3715 < 0) {
                    this.method1272(arg0, var9, 0, var10, 0);
                    if (this.field3718 < 0) {
                        this.field3718 = -1;
                        this.method1311();
                        this.method1392(128);
                        return;
                    }
                } else {
                    this.method1277(arg0, var9, var7, var10, 0);
                    if (this.field3718 >= var7) {
                        this.field3718 = var7;
                        this.method1311();
                        this.method1392(128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B[IIIIIIILtd;)I")
    private static final int method1287(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class193 arg8) {
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
        arg8.field3718 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
    public final int method1240() {
        int var1 = this.field3716 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3710 == 0) {
            var2 -= this.field3718 * var2 / (((class140) super.field3613).field2683.length << 8);
        } else if (this.field3710 >= 0) {
            var2 -= this.field3722 * var2 / ((class140) super.field3613).field2683.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)I")
    private static final int method1288(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
    public final synchronized void method1289(int arg0, int arg1) {
        this.method1285(arg0, arg1, this.method1282());
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public final synchronized void method1290(int arg0) {
        int var2 = ((class140) super.field3613).field2683.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3718 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    private final synchronized void method1291(int arg0) {
        this.method1293(arg0, this.method1282());
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1292(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class193 arg11, int arg12, int arg13) {
        arg11.field3723 -= arg11.field3714 * arg5;
        arg11.field3712 -= arg11.field3719 * arg5;
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
        arg11.field3723 += arg11.field3714 * arg5;
        arg11.field3712 += arg11.field3719 * arg5;
        arg11.field3716 = arg6;
        arg11.field3718 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public final int method485() {
        return this.field3717 == 0 && this.field3720 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II)V")
    private final synchronized void method1293(int arg0, int arg1) {
        this.field3717 = arg0;
        this.field3721 = arg1;
        this.field3720 = 0;
        this.method1278();
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1294(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class193 arg11, int arg12, int arg13) {
        arg11.field3723 -= arg11.field3714 * arg5;
        arg11.field3712 -= arg11.field3719 * arg5;
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
        arg11.field3723 += arg11.field3714 * arg5;
        arg11.field3712 += arg11.field3719 * arg5;
        arg11.field3716 = arg6;
        arg11.field3718 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()Lsg;")
    public final class186 method492() {
        return null;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "()Z")
    public final boolean method1295() {
        return this.field3718 < 0 || this.field3718 >= ((class140) super.field3613).field2683.length << 8;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public final synchronized void method1296(int arg0) {
        this.field3710 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Loa;III)Ltd;")
    public static final class193 method1297(class140 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2683 != null && arg0.field2683.length != 0 ? new class193(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B[IIIIIIIILtd;)I")
    private static final int method1298(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class193 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3723 += (var14 - arg3) * arg9.field3714;
        arg9.field3712 += (var14 - arg3) * arg9.field3719;
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
        arg9.field3716 = var12 >> 2;
        arg9.field3718 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "()Z")
    private final boolean method1299() {
        int var1 = this.field3717;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1305(var1, this.field3721);
            var2 = method1288(var1, this.field3721);
        }
        if (this.field3716 == var1 && this.field3723 == var3 && this.field3712 == var2) {
            if (this.field3717 == Integer.MIN_VALUE) {
                this.field3717 = 0;
                this.field3716 = this.field3723 = this.field3712 = 0;
                this.method1392(128);
                return true;
            } else {
                this.method1278();
                return false;
            }
        } else {
            if (this.field3716 < var1) {
                this.field3709 = 1;
                this.field3720 = var1 - this.field3716;
            } else if (this.field3716 > var1) {
                this.field3709 = -1;
                this.field3720 = this.field3716 - var1;
            } else {
                this.field3709 = 0;
            }
            if (this.field3723 < var3) {
                this.field3714 = 1;
                if (this.field3720 == 0 || this.field3720 > var3 - this.field3723) {
                    this.field3720 = var3 - this.field3723;
                }
            } else if (this.field3723 > var3) {
                this.field3714 = -1;
                if (this.field3720 == 0 || this.field3720 > this.field3723 - var3) {
                    this.field3720 = this.field3723 - var3;
                }
            } else {
                this.field3714 = 0;
            }
            if (this.field3712 < var2) {
                this.field3719 = 1;
                if (this.field3720 == 0 || this.field3720 > var2 - this.field3712) {
                    this.field3720 = var2 - this.field3712;
                }
            } else if (this.field3712 > var2) {
                this.field3719 = -1;
                if (this.field3720 == 0 || this.field3720 > this.field3712 - var2) {
                    this.field3720 = this.field3712 - var2;
                }
            } else {
                this.field3719 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B[IIIIIIIIIILtd;)I")
    private static final int method1300(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class193 arg12) {
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
        arg12.field3716 += (var19 - arg4) * arg12.field3709;
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
        arg12.field3723 = var15 >> 2;
        arg12.field3712 = var16 >> 2;
        arg12.field3718 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "()I")
    public final synchronized int method1301() {
        return this.field3715 < 0 ? -this.field3715 : this.field3715;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public final synchronized void method1302(int arg0) {
        this.method1293(arg0 << 6, this.method1282());
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B[IIIIIIILtd;)I")
    private static final int method1303(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class193 arg8) {
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
        arg8.field3718 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "k", descriptor = "()Z")
    public final boolean method1304() {
        return this.field3720 != 0;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(II)I")
    private static final int method1305(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B[IIIIIIIILtd;)I")
    private static final int method1306(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class193 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3723 += (var14 - arg3) * arg9.field3714;
        arg9.field3712 += (var14 - arg3) * arg9.field3719;
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
        arg9.field3716 = var12 >> 2;
        arg9.field3718 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public final synchronized void method468(int arg0) {
        if (this.field3720 > 0) {
            if (arg0 >= this.field3720) {
                if (this.field3717 == Integer.MIN_VALUE) {
                    this.field3717 = 0;
                    this.field3716 = this.field3723 = this.field3712 = 0;
                    this.method1392(128);
                    arg0 = this.field3720;
                }
                this.field3720 = 0;
                this.method1278();
            } else {
                this.field3716 += this.field3709 * arg0;
                this.field3723 += this.field3714 * arg0;
                this.field3712 += this.field3719 * arg0;
                this.field3720 -= arg0;
            }
        }
        class140 var2 = (class140) super.field3613;
        int var3 = this.field3722 << 8;
        int var4 = this.field3711 << 8;
        int var5 = var2.field2683.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3710 = 0;
        }
        if (this.field3718 < 0) {
            if (this.field3715 <= 0) {
                this.method1311();
                this.method1392(128);
                return;
            }
            this.field3718 = 0;
        }
        if (this.field3718 >= var5) {
            if (this.field3715 >= 0) {
                this.method1311();
                this.method1392(128);
                return;
            }
            this.field3718 = var5 - 1;
        }
        this.field3718 += this.field3715 * arg0;
        if (this.field3710 < 0) {
            if (!this.field3713) {
                if (this.field3715 < 0) {
                    if (this.field3718 < var3) {
                        this.field3718 = var4 - 1 - (var4 - 1 - this.field3718) % var6;
                    }
                } else if (this.field3718 >= var4) {
                    this.field3718 = (this.field3718 - var3) % var6 + var3;
                }
            } else {
                if (this.field3715 < 0) {
                    if (this.field3718 >= var3) {
                        return;
                    }
                    this.field3718 = var3 + var3 - 1 - this.field3718;
                    this.field3715 = -this.field3715;
                }
                while (this.field3718 >= var4) {
                    this.field3718 = var4 + var4 - 1 - this.field3718;
                    this.field3715 = -this.field3715;
                    if (this.field3718 >= var3) {
                        return;
                    }
                    this.field3718 = var3 + var3 - 1 - this.field3718;
                    this.field3715 = -this.field3715;
                }
            }
        } else {
            if (this.field3710 > 0) {
                if (this.field3713) {
                    label125: {
                        if (this.field3715 < 0) {
                            if (this.field3718 >= var3) {
                                return;
                            }
                            this.field3718 = var3 + var3 - 1 - this.field3718;
                            this.field3715 = -this.field3715;
                            if (--this.field3710 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3718 < var4) {
                                return;
                            }
                            this.field3718 = var4 + var4 - 1 - this.field3718;
                            this.field3715 = -this.field3715;
                            if (--this.field3710 == 0) {
                                break;
                            }
                            if (this.field3718 >= var3) {
                                return;
                            }
                            this.field3718 = var3 + var3 - 1 - this.field3718;
                            this.field3715 = -this.field3715;
                        } while (--this.field3710 != 0);
                    }
                } else if (this.field3715 < 0) {
                    if (this.field3718 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3718) / var6;
                    if (var7 < this.field3710) {
                        this.field3718 += var6 * var7;
                        this.field3710 -= var7;
                        return;
                    }
                    this.field3718 += this.field3710 * var6;
                    this.field3710 = 0;
                } else {
                    if (this.field3718 < var4) {
                        return;
                    }
                    int var8 = (this.field3718 - var3) / var6;
                    if (var8 < this.field3710) {
                        this.field3718 -= var6 * var8;
                        this.field3710 -= var8;
                        return;
                    }
                    this.field3718 -= this.field3710 * var6;
                    this.field3710 = 0;
                }
            }
            if (this.field3715 < 0) {
                if (this.field3718 < 0) {
                    this.field3718 = -1;
                    this.method1311();
                    this.method1392(128);
                    return;
                }
            } else if (this.field3718 >= var5) {
                this.field3718 = var5;
                this.method1311();
                this.method1392(128);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
    public final synchronized void method1307(int arg0) {
        if (arg0 == 0) {
            this.method1291(0);
            this.method1392(128);
        } else if (this.field3723 == 0 && this.field3712 == 0) {
            this.field3720 = 0;
            this.field3717 = 0;
            this.field3716 = 0;
            this.method1392(128);
        } else {
            int var2 = -this.field3716;
            if (this.field3716 > var2) {
                var2 = this.field3716;
            }
            if (-this.field3723 > var2) {
                var2 = -this.field3723;
            }
            if (this.field3723 > var2) {
                var2 = this.field3723;
            }
            if (-this.field3712 > var2) {
                var2 = -this.field3712;
            }
            if (this.field3712 > var2) {
                var2 = this.field3712;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3720 = arg0;
            this.field3717 = Integer.MIN_VALUE;
            this.field3709 = -this.field3716 / arg0;
            this.field3714 = -this.field3723 / arg0;
            this.field3719 = -this.field3712 / arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I[B[IIIIIIIIIILtd;)I")
    private static final int method1308(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class193 arg12) {
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
        arg12.field3716 += (var19 - arg4) * arg12.field3709;
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
        arg12.field3723 = var15 >> 2;
        arg12.field3712 = var16 >> 2;
        arg12.field3718 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
    public final synchronized void method1309(int arg0) {
        if (this.field3715 < 0) {
            this.field3715 = -arg0;
        } else {
            this.field3715 = arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Loa;II)V")
    private class193(class140 arg0, int arg1, int arg2) {
        super.field3613 = arg0;
        this.field3722 = arg0.field2679;
        this.field3711 = arg0.field2682;
        this.field3713 = arg0.field2681;
        this.field3715 = arg1;
        this.field3717 = arg2;
        this.field3721 = 8192;
        this.field3718 = 0;
        this.method1278();
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Loa;III)V")
    private class193(class140 arg0, int arg1, int arg2, int arg3) {
        super.field3613 = arg0;
        this.field3722 = arg0.field2679;
        this.field3711 = arg0.field2682;
        this.field3713 = arg0.field2681;
        this.field3715 = arg1;
        this.field3717 = arg2;
        this.field3721 = arg3;
        this.field3718 = 0;
        this.method1278();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final synchronized void method1310(boolean arg0) {
        this.field3715 = (this.field3715 >>> 31) + (this.field3715 ^ this.field3715 >> 31);
        if (arg0) {
            this.field3715 = -this.field3715;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()Lsg;")
    public final class186 method476() {
        return null;
    }

    @OriginalMember(owner = "client!td", name = "l", descriptor = "()V")
    private final void method1311() {
        if (this.field3720 != 0) {
            if (this.field3717 == Integer.MIN_VALUE) {
                this.field3717 = 0;
            }
            this.field3720 = 0;
            this.method1278();
        }
    }
}
