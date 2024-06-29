import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class170 extends class126 {

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Z")
    private boolean field2840;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    private int field2850;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field2839;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field2837;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field2838;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    private int field2841;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    private int field2842;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    private int field2843;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIIIIILwb;II)I")
    private static final int method1046(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class170 arg13, int arg14, int arg15) {
        arg13.field2851 -= arg13.field2837 * arg5;
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
        arg13.field2851 += arg13.field2837 * var22;
        arg13.field2838 = arg6;
        arg13.field2843 = arg7;
        arg13.field2848 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B[IIIIIIIIIILwb;)I")
    private static final int method1047(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class170 arg12) {
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
        arg12.field2851 += (var19 - arg4) * arg12.field2837;
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
        arg12.field2838 = var15 >> 2;
        arg12.field2843 = var16 >> 2;
        arg12.field2848 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public final synchronized void method1048(int arg0) {
        int var2 = ((class150) super.field2251).field2616.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2848 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method1049(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class170 arg11, int arg12, int arg13) {
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
        arg11.field2848 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()Z")
    public final boolean method1050() {
        return this.field2848 < 0 || this.field2848 >= ((class150) super.field2251).field2616.length << 8;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIIIIILwb;II)I")
    private static final int method1051(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class170 arg13, int arg14, int arg15) {
        arg13.field2851 -= arg13.field2837 * arg5;
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
        arg13.field2851 += arg13.field2837 * var22;
        arg13.field2838 = arg6;
        arg13.field2843 = arg7;
        arg13.field2848 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lib;")
    public final class126 method477() {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B[IIIIIIIILwb;)I")
    private static final int method1052(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class170 arg10) {
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
        arg10.field2848 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public final synchronized void method1053(boolean arg0) {
        this.field2850 = (this.field2850 >>> 31) + (this.field2850 ^ this.field2850 >> 31);
        if (arg0) {
            this.field2850 = -this.field2850;
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()I")
    public final synchronized int method1054() {
        return this.field2850 < 0 ? -this.field2850 : this.field2850;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public final synchronized void method1055(int arg0, int arg1) {
        this.method1064(arg0, arg1, this.method1073());
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
    private final void method1056() {
        if (this.field2845 != 0) {
            if (this.field2846 == Integer.MIN_VALUE) {
                this.field2846 = 0;
            }
            this.field2845 = 0;
            this.method1077();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B[IIIIIIILwb;)I")
    private static final int method1057(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class170 arg8) {
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
        arg8.field2848 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    private final synchronized void method1058(int arg0) {
        this.method1071(arg0, this.method1073());
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B[IIIIIIILwb;)I")
    private static final int method1059(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class170 arg8) {
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
        arg8.field2848 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "()Z")
    private final boolean method1060() {
        int var1 = this.field2846;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1083(var1, this.field2839);
            var2 = method1074(var1, this.field2839);
        }
        if (this.field2851 == var1 && this.field2838 == var3 && this.field2843 == var2) {
            if (this.field2846 == Integer.MIN_VALUE) {
                this.field2846 = 0;
                this.field2851 = this.field2838 = this.field2843 = 0;
                this.method369(-100);
                return true;
            } else {
                this.method1077();
                return false;
            }
        } else {
            if (this.field2851 < var1) {
                this.field2837 = 1;
                this.field2845 = var1 - this.field2851;
            } else if (this.field2851 > var1) {
                this.field2837 = -1;
                this.field2845 = this.field2851 - var1;
            } else {
                this.field2837 = 0;
            }
            if (this.field2838 < var3) {
                this.field2842 = 1;
                if (this.field2845 == 0 || this.field2845 > var3 - this.field2838) {
                    this.field2845 = var3 - this.field2838;
                }
            } else if (this.field2838 > var3) {
                this.field2842 = -1;
                if (this.field2845 == 0 || this.field2845 > this.field2838 - var3) {
                    this.field2845 = this.field2838 - var3;
                }
            } else {
                this.field2842 = 0;
            }
            if (this.field2843 < var2) {
                this.field2841 = 1;
                if (this.field2845 == 0 || this.field2845 > var2 - this.field2843) {
                    this.field2845 = var2 - this.field2843;
                }
            } else if (this.field2843 > var2) {
                this.field2841 = -1;
                if (this.field2845 == 0 || this.field2845 > this.field2843 - var2) {
                    this.field2845 = this.field2843 - var2;
                }
            } else {
                this.field2841 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I[B[IIIIIIIIIILwb;)I")
    private static final int method1061(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class170 arg12) {
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
        arg12.field2851 += (var19 - arg4) * arg12.field2837;
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
        arg12.field2838 = var15 >> 2;
        arg12.field2843 = var16 >> 2;
        arg12.field2848 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I[B[IIIIIIIILwb;)I")
    private static final int method1062(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class170 arg10) {
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
        arg10.field2848 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lw;II)Lwb;")
    public static final class170 method1063(class150 arg0, int arg1, int arg2) {
        return arg0.field2616 != null && arg0.field2616.length != 0 ? new class170(arg0, (int) ((long) arg0.field2617 * 256L * (long) arg1 / (long) (class195.field3316 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final synchronized void method1064(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1071(arg1, arg2);
        } else {
            int var4 = method1083(arg1, arg2);
            int var5 = method1074(arg1, arg2);
            if (this.field2838 == var4 && this.field2843 == var5) {
                this.field2845 = 0;
            } else {
                int var6 = arg1 - this.field2851;
                if (this.field2851 - arg1 > var6) {
                    var6 = this.field2851 - arg1;
                }
                if (var4 - this.field2838 > var6) {
                    var6 = var4 - this.field2838;
                }
                if (this.field2838 - var4 > var6) {
                    var6 = this.field2838 - var4;
                }
                if (var5 - this.field2843 > var6) {
                    var6 = var5 - this.field2843;
                }
                if (this.field2843 - var5 > var6) {
                    var6 = this.field2843 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2845 = arg0;
                this.field2846 = arg1;
                this.field2839 = arg2;
                this.field2837 = (arg1 - this.field2851) / arg0;
                this.field2842 = (var4 - this.field2838) / arg0;
                this.field2841 = (var5 - this.field2843) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lw;III)Lwb;")
    public static final class170 method1065(class150 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2616 != null && arg0.field2616.length != 0 ? new class170(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final synchronized void method478(int arg0) {
        if (this.field2845 > 0) {
            if (arg0 >= this.field2845) {
                if (this.field2846 == Integer.MIN_VALUE) {
                    this.field2846 = 0;
                    this.field2851 = this.field2838 = this.field2843 = 0;
                    this.method369(127);
                    arg0 = this.field2845;
                }
                this.field2845 = 0;
                this.method1077();
            } else {
                this.field2851 += this.field2837 * arg0;
                this.field2838 += this.field2842 * arg0;
                this.field2843 += this.field2841 * arg0;
                this.field2845 -= arg0;
            }
        }
        class150 var2 = (class150) super.field2251;
        int var3 = this.field2847 << 8;
        int var4 = this.field2849 << 8;
        int var5 = var2.field2616.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2844 = 0;
        }
        if (this.field2848 < 0) {
            if (this.field2850 <= 0) {
                this.method1056();
                this.method369(127);
                return;
            }
            this.field2848 = 0;
        }
        if (this.field2848 >= var5) {
            if (this.field2850 >= 0) {
                this.method1056();
                this.method369(-11);
                return;
            }
            this.field2848 = var5 - 1;
        }
        this.field2848 += this.field2850 * arg0;
        if (this.field2844 < 0) {
            if (!this.field2840) {
                if (this.field2850 < 0) {
                    if (this.field2848 < var3) {
                        this.field2848 = var4 - 1 - (var4 - 1 - this.field2848) % var6;
                    }
                } else if (this.field2848 >= var4) {
                    this.field2848 = (this.field2848 - var3) % var6 + var3;
                }
            } else {
                if (this.field2850 < 0) {
                    if (this.field2848 >= var3) {
                        return;
                    }
                    this.field2848 = var3 + var3 - 1 - this.field2848;
                    this.field2850 = -this.field2850;
                }
                while (this.field2848 >= var4) {
                    this.field2848 = var4 + var4 - 1 - this.field2848;
                    this.field2850 = -this.field2850;
                    if (this.field2848 >= var3) {
                        return;
                    }
                    this.field2848 = var3 + var3 - 1 - this.field2848;
                    this.field2850 = -this.field2850;
                }
            }
        } else {
            if (this.field2844 > 0) {
                if (this.field2840) {
                    label125: {
                        if (this.field2850 < 0) {
                            if (this.field2848 >= var3) {
                                return;
                            }
                            this.field2848 = var3 + var3 - 1 - this.field2848;
                            this.field2850 = -this.field2850;
                            if (--this.field2844 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2848 < var4) {
                                return;
                            }
                            this.field2848 = var4 + var4 - 1 - this.field2848;
                            this.field2850 = -this.field2850;
                            if (--this.field2844 == 0) {
                                break;
                            }
                            if (this.field2848 >= var3) {
                                return;
                            }
                            this.field2848 = var3 + var3 - 1 - this.field2848;
                            this.field2850 = -this.field2850;
                        } while (--this.field2844 != 0);
                    }
                } else if (this.field2850 < 0) {
                    if (this.field2848 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2848) / var6;
                    if (var7 < this.field2844) {
                        this.field2848 += var6 * var7;
                        this.field2844 -= var7;
                        return;
                    }
                    this.field2848 += this.field2844 * var6;
                    this.field2844 = 0;
                } else {
                    if (this.field2848 < var4) {
                        return;
                    }
                    int var8 = (this.field2848 - var3) / var6;
                    if (var8 < this.field2844) {
                        this.field2848 -= var6 * var8;
                        this.field2844 -= var8;
                        return;
                    }
                    this.field2848 -= this.field2844 * var6;
                    this.field2844 = 0;
                }
            }
            if (this.field2850 < 0) {
                if (this.field2848 < 0) {
                    this.field2848 = -1;
                    this.method1056();
                    this.method369(125);
                    return;
                }
            } else if (this.field2848 >= var5) {
                this.field2848 = var5;
                this.method1056();
                this.method369(-78);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B[IIIIIIIILwb;)I")
    private static final int method1066(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class170 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2838 += (var14 - arg3) * arg9.field2842;
        arg9.field2843 += (var14 - arg3) * arg9.field2841;
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
        arg9.field2851 = var12 >> 2;
        arg9.field2848 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public final synchronized void method1067(int arg0) {
        if (arg0 == 0) {
            this.method1058(0);
            this.method369(-27);
        } else if (this.field2838 == 0 && this.field2843 == 0) {
            this.field2845 = 0;
            this.field2846 = 0;
            this.field2851 = 0;
            this.method369(-11);
        } else {
            int var2 = -this.field2851;
            if (this.field2851 > var2) {
                var2 = this.field2851;
            }
            if (-this.field2838 > var2) {
                var2 = -this.field2838;
            }
            if (this.field2838 > var2) {
                var2 = this.field2838;
            }
            if (-this.field2843 > var2) {
                var2 = -this.field2843;
            }
            if (this.field2843 > var2) {
                var2 = this.field2843;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2845 = arg0;
            this.field2846 = Integer.MIN_VALUE;
            this.field2837 = -this.field2851 / arg0;
            this.field2842 = -this.field2838 / arg0;
            this.field2841 = -this.field2843 / arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)I")
    private final int method1068(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2845 <= 0) {
                if (this.field2850 == -256 && (this.field2848 & 255) == 0) {
                    if (class216.field3641) {
                        return method1052(0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, 0, arg3, arg2, this);
                    }
                    return method1057(((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, 0, arg3, arg2, this);
                }
                if (class216.field3641) {
                    return method1085(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, 0, arg3, arg2, this, this.field2850, arg4);
                }
                return method1079(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, 0, arg3, arg2, this, this.field2850, arg4);
            }
            int var6 = this.field2845 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2845 += arg1;
            if (this.field2850 == -256 && (this.field2848 & 255) == 0) {
                if (class216.field3641) {
                    arg1 = method1047(0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, this.field2842, this.field2841, 0, var6, arg2, this);
                } else {
                    arg1 = method1080(((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, this.field2837, 0, var6, arg2, this);
                }
            } else if (class216.field3641) {
                arg1 = method1046(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, this.field2842, this.field2841, 0, var6, arg2, this, this.field2850, arg4);
            } else {
                arg1 = method1069(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, this.field2837, 0, var6, arg2, this, this.field2850, arg4);
            }
            this.field2845 -= arg1;
            if (this.field2845 != 0) {
                return arg1;
            }
        } while (!this.method1060());
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()I")
    public final int method486() {
        return this.field2846 == 0 && this.field2845 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method1069(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class170 arg11, int arg12, int arg13) {
        arg11.field2838 -= arg11.field2842 * arg5;
        arg11.field2843 -= arg11.field2841 * arg5;
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
        arg11.field2838 += arg11.field2842 * arg5;
        arg11.field2843 += arg11.field2841 * arg5;
        arg11.field2851 = arg6;
        arg11.field2848 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([IIIII)I")
    private final int method1070(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2845 <= 0) {
                if (this.field2850 == 256 && (this.field2848 & 255) == 0) {
                    if (class216.field3641) {
                        return method1062(0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, 0, arg3, arg2, this);
                    }
                    return method1059(((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, 0, arg3, arg2, this);
                }
                if (class216.field3641) {
                    return method1049(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, 0, arg3, arg2, this, this.field2850, arg4);
                }
                return method1072(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, 0, arg3, arg2, this, this.field2850, arg4);
            }
            int var6 = this.field2845 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2845 += arg1;
            if (this.field2850 == 256 && (this.field2848 & 255) == 0) {
                if (class216.field3641) {
                    arg1 = method1061(0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, this.field2842, this.field2841, 0, var6, arg2, this);
                } else {
                    arg1 = method1066(((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, this.field2837, 0, var6, arg2, this);
                }
            } else if (class216.field3641) {
                arg1 = method1051(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2838, this.field2843, this.field2842, this.field2841, 0, var6, arg2, this, this.field2850, arg4);
            } else {
                arg1 = method1078(0, 0, ((class150) super.field2251).field2616, arg0, this.field2848, arg1, this.field2851, this.field2837, 0, var6, arg2, this, this.field2850, arg4);
            }
            this.field2845 -= arg1;
            if (this.field2845 != 0) {
                return arg1;
            }
        } while (!this.method1060());
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
    private final synchronized void method1071(int arg0, int arg1) {
        this.field2846 = arg0;
        this.field2839 = arg1;
        this.field2845 = 0;
        this.method1077();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIILwb;II)I")
    private static final int method1072(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class170 arg10, int arg11, int arg12) {
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
        arg10.field2848 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "()I")
    public final synchronized int method1073() {
        return this.field2839 < 0 ? -1 : this.field2839;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
    private static final int method1074(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "()I")
    public final synchronized int method1075() {
        return this.field2846 == Integer.MIN_VALUE ? 0 : this.field2846;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public final synchronized void method1076(int arg0) {
        this.field2844 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
    public final synchronized void method485(int[] arg0, int arg1, int arg2) {
        if (this.field2846 == 0 && this.field2845 == 0) {
            this.method478(arg2);
        } else {
            class150 var4 = (class150) super.field2251;
            int var5 = this.field2847 << 8;
            int var6 = this.field2849 << 8;
            int var7 = var4.field2616.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2844 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2848 < 0) {
                if (this.field2850 <= 0) {
                    this.method1056();
                    this.method369(-51);
                    return;
                }
                this.field2848 = 0;
            }
            if (this.field2848 >= var7) {
                if (this.field2850 >= 0) {
                    this.method1056();
                    this.method369(125);
                    return;
                }
                this.field2848 = var7 - 1;
            }
            if (this.field2844 < 0) {
                if (this.field2840) {
                    if (this.field2850 < 0) {
                        var9 = this.method1068(arg0, arg1, var5, var10, var4.field2616[this.field2847]);
                        if (this.field2848 >= var5) {
                            return;
                        }
                        this.field2848 = var5 + var5 - 1 - this.field2848;
                        this.field2850 = -this.field2850;
                    }
                    while (true) {
                        int var11 = this.method1070(arg0, var9, var6, var10, var4.field2616[this.field2849 - 1]);
                        if (this.field2848 < var6) {
                            return;
                        }
                        this.field2848 = var6 + var6 - 1 - this.field2848;
                        this.field2850 = -this.field2850;
                        var9 = this.method1068(arg0, var11, var5, var10, var4.field2616[this.field2847]);
                        if (this.field2848 >= var5) {
                            return;
                        }
                        this.field2848 = var5 + var5 - 1 - this.field2848;
                        this.field2850 = -this.field2850;
                    }
                } else if (this.field2850 < 0) {
                    while (true) {
                        var9 = this.method1068(arg0, var9, var5, var10, var4.field2616[this.field2849 - 1]);
                        if (this.field2848 >= var5) {
                            return;
                        }
                        this.field2848 = var6 - 1 - (var6 - 1 - this.field2848) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1070(arg0, var9, var6, var10, var4.field2616[this.field2847]);
                        if (this.field2848 < var6) {
                            return;
                        }
                        this.field2848 = (this.field2848 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2844 > 0) {
                    if (this.field2840) {
                        label130: {
                            if (this.field2850 < 0) {
                                var9 = this.method1068(arg0, arg1, var5, var10, var4.field2616[this.field2847]);
                                if (this.field2848 >= var5) {
                                    return;
                                }
                                this.field2848 = var5 + var5 - 1 - this.field2848;
                                this.field2850 = -this.field2850;
                                if (--this.field2844 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1070(arg0, var9, var6, var10, var4.field2616[this.field2849 - 1]);
                                if (this.field2848 < var6) {
                                    return;
                                }
                                this.field2848 = var6 + var6 - 1 - this.field2848;
                                this.field2850 = -this.field2850;
                                if (--this.field2844 == 0) {
                                    break;
                                }
                                var9 = this.method1068(arg0, var9, var5, var10, var4.field2616[this.field2847]);
                                if (this.field2848 >= var5) {
                                    return;
                                }
                                this.field2848 = var5 + var5 - 1 - this.field2848;
                                this.field2850 = -this.field2850;
                            } while (--this.field2844 != 0);
                        }
                    } else if (this.field2850 < 0) {
                        while (true) {
                            var9 = this.method1068(arg0, var9, var5, var10, var4.field2616[this.field2849 - 1]);
                            if (this.field2848 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2848) / var8;
                            if (var12 >= this.field2844) {
                                this.field2848 += this.field2844 * var8;
                                this.field2844 = 0;
                                break;
                            }
                            this.field2848 += var8 * var12;
                            this.field2844 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1070(arg0, var9, var6, var10, var4.field2616[this.field2847]);
                            if (this.field2848 < var6) {
                                return;
                            }
                            int var13 = (this.field2848 - var5) / var8;
                            if (var13 >= this.field2844) {
                                this.field2848 -= this.field2844 * var8;
                                this.field2844 = 0;
                                break;
                            }
                            this.field2848 -= var8 * var13;
                            this.field2844 -= var13;
                        }
                    }
                }
                if (this.field2850 < 0) {
                    this.method1068(arg0, var9, 0, var10, 0);
                    if (this.field2848 < 0) {
                        this.field2848 = -1;
                        this.method1056();
                        this.method369(124);
                        return;
                    }
                } else {
                    this.method1070(arg0, var9, var7, var10, 0);
                    if (this.field2848 >= var7) {
                        this.field2848 = var7;
                        this.method1056();
                        this.method369(125);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "()V")
    private final void method1077() {
        this.field2851 = this.field2846;
        this.field2838 = method1083(this.field2846, this.field2839);
        this.field2843 = method1074(this.field2846, this.field2839);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method1078(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class170 arg11, int arg12, int arg13) {
        arg11.field2838 -= arg11.field2842 * arg5;
        arg11.field2843 -= arg11.field2841 * arg5;
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
        arg11.field2838 += arg11.field2842 * arg5;
        arg11.field2843 += arg11.field2841 * arg5;
        arg11.field2851 = arg6;
        arg11.field2848 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIILwb;II)I")
    private static final int method1079(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class170 arg10, int arg11, int arg12) {
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
        arg10.field2848 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B[IIIIIIIILwb;)I")
    private static final int method1080(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class170 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2838 += (var14 - arg3) * arg9.field2842;
        arg9.field2843 += (var14 - arg3) * arg9.field2841;
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
        arg9.field2851 = var12 >> 2;
        arg9.field2848 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public final synchronized void method1081(int arg0) {
        this.method1071(arg0 << 6, this.method1073());
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public final synchronized void method1082(int arg0) {
        if (this.field2850 < 0) {
            this.field2850 = -arg0;
        } else {
            this.field2850 = arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lib;")
    public final class126 method475() {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
    private static final int method1083(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "()Z")
    public final boolean method1084() {
        return this.field2845 != 0;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method1085(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class170 arg11, int arg12, int arg13) {
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
        arg11.field2848 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
    public final int method779() {
        int var1 = this.field2851 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2844 == 0) {
            var2 -= this.field2848 * var2 / (((class150) super.field2251).field2616.length << 8);
        } else if (this.field2844 >= 0) {
            var2 -= this.field2847 * var2 / ((class150) super.field2251).field2616.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lw;II)V")
    private class170(class150 arg0, int arg1, int arg2) {
        super.field2251 = arg0;
        this.field2847 = arg0.field2618;
        this.field2849 = arg0.field2619;
        this.field2840 = arg0.field2615;
        this.field2850 = arg1;
        this.field2846 = arg2;
        this.field2839 = 8192;
        this.field2848 = 0;
        this.method1077();
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lw;III)V")
    private class170(class150 arg0, int arg1, int arg2, int arg3) {
        super.field2251 = arg0;
        this.field2847 = arg0.field2618;
        this.field2849 = arg0.field2619;
        this.field2840 = arg0.field2615;
        this.field2850 = arg1;
        this.field2846 = arg2;
        this.field2839 = arg3;
        this.field2848 = 0;
        this.method1077();
    }
}
