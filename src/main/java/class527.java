import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class527 extends class581 {

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    private int field6990;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Z")
    private boolean field6987;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    private int field6984;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    private int field6991;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    private int field6983;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    private int field6982;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    private int field6985;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    private int field6986;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    private int field6988;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    private int field6989;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    private int field6992;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    private int field6993;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    private int field6995;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[B[IIIIIIIILhr;)I", line = 3)
    private static final int method2906(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class527 arg10) {
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
        arg10.field6982 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[B[IIIIIIIIIILhr;)I", line = 42)
    private static final int method2907(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class527 arg12) {
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
        arg12.field6995 += (var19 - arg4) * arg12.field6988;
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
        arg12.field6994 = var15 >> 2;
        arg12.field6989 = var16 >> 2;
        arg12.field6982 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 96)
    public final synchronized void method2908(int arg0) {
        this.method2918(this.method2939(), arg0);
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V", line = 100)
    public final synchronized void method2909(int arg0) {
        this.method2918(arg0 << 6, this.method2919());
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "()Lgu;", line = 105)
    public final class581 method33() {
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([B[IIIIIIIILhr;)I", line = 108)
    private static final int method2910(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class527 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6994 += (var14 - arg3) * arg9.field6985;
        arg9.field6989 += (var14 - arg3) * arg9.field6993;
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
        arg9.field6995 = var12 >> 2;
        arg9.field6982 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[B[IIIIIIIILhr;II)I", line = 142)
    private static final int method2911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class527 arg11, int arg12, int arg13) {
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
        arg11.field6982 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II[B[IIIIIIIILhr;II)I", line = 178)
    private static final int method2912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class527 arg11, int arg12, int arg13) {
        arg11.field6994 -= arg11.field6985 * arg5;
        arg11.field6989 -= arg11.field6993 * arg5;
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
        arg11.field6994 += arg11.field6985 * arg5;
        arg11.field6989 += arg11.field6993 * arg5;
        arg11.field6995 = arg6;
        arg11.field6982 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V", line = 211)
    public final synchronized void method2913(int arg0, int arg1) {
        this.method2924(arg0, arg1, this.method2919());
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([IIIII)I", line = 216)
    private final int method2914(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6992 <= 0) {
                if (this.field6984 == 256 && (this.field6982 & 255) == 0) {
                    if (class27.field430) {
                        return method2906(0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, 0, arg3, arg2, this);
                    }
                    return method2937(((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, 0, arg3, arg2, this);
                }
                if (class27.field430) {
                    return method2911(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, 0, arg3, arg2, this, this.field6984, arg4);
                }
                return method2930(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, 0, arg3, arg2, this, this.field6984, arg4);
            }
            int var6 = this.field6992 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6992 += arg1;
            if (this.field6984 == 256 && (this.field6982 & 255) == 0) {
                if (class27.field430) {
                    arg1 = method2907(0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, this.field6985, this.field6993, 0, var6, arg2, this);
                } else {
                    arg1 = method2910(((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, this.field6988, 0, var6, arg2, this);
                }
            } else if (class27.field430) {
                arg1 = method2938(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, this.field6985, this.field6993, 0, var6, arg2, this, this.field6984, arg4);
            } else {
                arg1 = method2920(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, this.field6988, 0, var6, arg2, this, this.field6984, arg4);
            }
            this.field6992 -= arg1;
            if (this.field6992 != 0) {
                return arg1;
            }
        } while (!this.method2942());
        return arg3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lct;III)Lhr;", line = 271)
    public static final class527 method2915(class147 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2322 != null && arg0.field2322.length != 0 ? new class527(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V", line = 278)
    public final synchronized void method2916(int arg0) {
        int var2 = ((class147) super.field7626).field2322.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6982 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V", line = 291)
    public final synchronized void method2917(int arg0) {
        if (this.field6984 < 0) {
            this.field6984 = -arg0;
        } else {
            this.field6984 = arg0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "()Lgu;", line = 298)
    public final class581 method53() {
        return null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V", line = 301)
    private final synchronized void method2918(int arg0, int arg1) {
        this.field6991 = arg0;
        this.field6983 = arg1;
        this.field6992 = 0;
        this.method2932();
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "()I", line = 307)
    public final synchronized int method2919() {
        return this.field6983 < 0 ? -1 : this.field6983;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II[B[IIIIIIIILhr;II)I", line = 311)
    private static final int method2920(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class527 arg11, int arg12, int arg13) {
        arg11.field6994 -= arg11.field6985 * arg5;
        arg11.field6989 -= arg11.field6993 * arg5;
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
        arg11.field6994 += arg11.field6985 * arg5;
        arg11.field6989 += arg11.field6993 * arg5;
        arg11.field6995 = arg6;
        arg11.field6982 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I[B[IIIIIIIIIILhr;)I", line = 344)
    private static final int method2921(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class527 arg12) {
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
        arg12.field6995 += (var19 - arg4) * arg12.field6988;
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
        arg12.field6994 = var15 >> 2;
        arg12.field6989 = var16 >> 2;
        arg12.field6982 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I[B[IIIIIIIILhr;)I", line = 397)
    private static final int method2922(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class527 arg10) {
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
        arg10.field6982 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([B[IIIIIIILhr;)I", line = 435)
    private static final int method2923(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class527 arg8) {
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
        arg8.field6982 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V", line = 461)
    public final synchronized void method2924(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2918(arg1, arg2);
        } else {
            int var4 = method2940(arg1, arg2);
            int var5 = method2946(arg1, arg2);
            if (this.field6994 == var4 && this.field6989 == var5) {
                this.field6992 = 0;
            } else {
                int var6 = arg1 - this.field6995;
                if (this.field6995 - arg1 > var6) {
                    var6 = this.field6995 - arg1;
                }
                if (var4 - this.field6994 > var6) {
                    var6 = var4 - this.field6994;
                }
                if (this.field6994 - var4 > var6) {
                    var6 = this.field6994 - var4;
                }
                if (var5 - this.field6989 > var6) {
                    var6 = var5 - this.field6989;
                }
                if (this.field6989 - var5 > var6) {
                    var6 = this.field6989 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6992 = arg0;
                this.field6991 = arg1;
                this.field6983 = arg2;
                this.field6988 = (arg1 - this.field6995) / arg0;
                this.field6985 = (var4 - this.field6994) / arg0;
                this.field6993 = (var5 - this.field6989) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "()I", line = 509)
    public final int method2925() {
        int var1 = this.field6995 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6986 == 0) {
            var2 -= this.field6982 * var2 / (((class147) super.field7626).field2322.length << 8);
        } else if (this.field6986 >= 0) {
            var2 -= this.field6990 * var2 / ((class147) super.field7626).field2322.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 525)
    public final synchronized void method60(int arg0) {
        if (this.field6992 > 0) {
            if (arg0 >= this.field6992) {
                if (this.field6991 == Integer.MIN_VALUE) {
                    this.field6991 = 0;
                    this.field6995 = this.field6994 = this.field6989 = 0;
                    this.method3564(true);
                    arg0 = this.field6992;
                }
                this.field6992 = 0;
                this.method2932();
            } else {
                this.field6995 += this.field6988 * arg0;
                this.field6994 += this.field6985 * arg0;
                this.field6989 += this.field6993 * arg0;
                this.field6992 -= arg0;
            }
        }
        class147 var2 = (class147) super.field7626;
        int var3 = this.field6990 << 8;
        int var4 = this.field6996 << 8;
        int var5 = var2.field2322.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6986 = 0;
        }
        if (this.field6982 < 0) {
            if (this.field6984 <= 0) {
                this.method2933();
                this.method3564(true);
                return;
            }
            this.field6982 = 0;
        }
        if (this.field6982 >= var5) {
            if (this.field6984 >= 0) {
                this.method2933();
                this.method3564(true);
                return;
            }
            this.field6982 = var5 - 1;
        }
        this.field6982 += this.field6984 * arg0;
        if (this.field6986 < 0) {
            if (!this.field6987) {
                if (this.field6984 < 0) {
                    if (this.field6982 < var3) {
                        this.field6982 = var4 - 1 - (var4 - 1 - this.field6982) % var6;
                    }
                } else if (this.field6982 >= var4) {
                    this.field6982 = (this.field6982 - var3) % var6 + var3;
                }
            } else {
                if (this.field6984 < 0) {
                    if (this.field6982 >= var3) {
                        return;
                    }
                    this.field6982 = var3 + var3 - 1 - this.field6982;
                    this.field6984 = -this.field6984;
                }
                while (this.field6982 >= var4) {
                    this.field6982 = var4 + var4 - 1 - this.field6982;
                    this.field6984 = -this.field6984;
                    if (this.field6982 >= var3) {
                        return;
                    }
                    this.field6982 = var3 + var3 - 1 - this.field6982;
                    this.field6984 = -this.field6984;
                }
            }
        } else {
            if (this.field6986 > 0) {
                if (this.field6987) {
                    label125: {
                        if (this.field6984 < 0) {
                            if (this.field6982 >= var3) {
                                return;
                            }
                            this.field6982 = var3 + var3 - 1 - this.field6982;
                            this.field6984 = -this.field6984;
                            if (--this.field6986 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6982 < var4) {
                                return;
                            }
                            this.field6982 = var4 + var4 - 1 - this.field6982;
                            this.field6984 = -this.field6984;
                            if (--this.field6986 == 0) {
                                break;
                            }
                            if (this.field6982 >= var3) {
                                return;
                            }
                            this.field6982 = var3 + var3 - 1 - this.field6982;
                            this.field6984 = -this.field6984;
                        } while (--this.field6986 != 0);
                    }
                } else if (this.field6984 < 0) {
                    if (this.field6982 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6982) / var6;
                    if (var7 < this.field6986) {
                        this.field6982 += var6 * var7;
                        this.field6986 -= var7;
                        return;
                    }
                    this.field6982 += this.field6986 * var6;
                    this.field6986 = 0;
                } else {
                    if (this.field6982 < var4) {
                        return;
                    }
                    int var8 = (this.field6982 - var3) / var6;
                    if (var8 < this.field6986) {
                        this.field6982 -= var6 * var8;
                        this.field6986 -= var8;
                        return;
                    }
                    this.field6982 -= this.field6986 * var6;
                    this.field6986 = 0;
                }
            }
            if (this.field6984 < 0) {
                if (this.field6982 < 0) {
                    this.field6982 = -1;
                    this.method2933();
                    this.method3564(true);
                    return;
                }
            } else if (this.field6982 >= var5) {
                this.field6982 = var5;
                this.method2933();
                this.method3564(true);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[B[IIIIIIIIIILhr;II)I", line = 745)
    private static final int method2926(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class527 arg13, int arg14, int arg15) {
        arg13.field6995 -= arg13.field6988 * arg5;
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
        arg13.field6995 += arg13.field6988 * var22;
        arg13.field6994 = arg6;
        arg13.field6989 = arg7;
        arg13.field6982 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V", line = 787)
    public final synchronized void method2927(int arg0) {
        this.field6986 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "()Z", line = 792)
    public final boolean method2928() {
        return this.field6992 != 0;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(Z)V", line = 795)
    public final synchronized void method2929(boolean arg0) {
        this.field6984 = (this.field6984 >>> 31) + (this.field6984 ^ this.field6984 >> 31);
        if (arg0) {
            this.field6984 = -this.field6984;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[B[IIIIIIILhr;II)I", line = 801)
    private static final int method2930(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class527 arg10, int arg11, int arg12) {
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
        arg10.field6982 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "()Z", line = 827)
    public final boolean method2931() {
        return this.field6982 < 0 || this.field6982 >= ((class147) super.field7626).field2322.length << 8;
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "()V", line = 830)
    private final void method2932() {
        this.field6995 = this.field6991;
        this.field6994 = method2940(this.field6991, this.field6983);
        this.field6989 = method2946(this.field6991, this.field6983);
    }

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "()V", line = 836)
    private final void method2933() {
        if (this.field6992 != 0) {
            if (this.field6991 == Integer.MIN_VALUE) {
                this.field6991 = 0;
            }
            this.field6992 = 0;
            this.method2932();
        }
    }

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "()I", line = 847)
    public final synchronized int method2934() {
        return this.field6984 < 0 ? -this.field6984 : this.field6984;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "([IIIII)I", line = 850)
    private final int method2935(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6992 <= 0) {
                if (this.field6984 == -256 && (this.field6982 & 255) == 0) {
                    if (class27.field430) {
                        return method2922(0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, 0, arg3, arg2, this);
                    }
                    return method2923(((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, 0, arg3, arg2, this);
                }
                if (class27.field430) {
                    return method2941(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, 0, arg3, arg2, this, this.field6984, arg4);
                }
                return method2936(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, 0, arg3, arg2, this, this.field6984, arg4);
            }
            int var6 = this.field6992 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6992 += arg1;
            if (this.field6984 == -256 && (this.field6982 & 255) == 0) {
                if (class27.field430) {
                    arg1 = method2921(0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, this.field6985, this.field6993, 0, var6, arg2, this);
                } else {
                    arg1 = method2945(((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, this.field6988, 0, var6, arg2, this);
                }
            } else if (class27.field430) {
                arg1 = method2926(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6994, this.field6989, this.field6985, this.field6993, 0, var6, arg2, this, this.field6984, arg4);
            } else {
                arg1 = method2912(0, 0, ((class147) super.field7626).field2322, arg0, this.field6982, arg1, this.field6995, this.field6988, 0, var6, arg2, this, this.field6984, arg4);
            }
            this.field6992 -= arg1;
            if (this.field6992 != 0) {
                return arg1;
            }
        } while (!this.method2942());
        return arg3;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II[B[IIIIIIILhr;II)I", line = 906)
    private static final int method2936(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class527 arg10, int arg11, int arg12) {
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
        arg10.field6982 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "([B[IIIIIIILhr;)I", line = 932)
    private static final int method2937(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class527 arg8) {
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
        arg8.field6982 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II[B[IIIIIIIIIILhr;II)I", line = 957)
    private static final int method2938(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class527 arg13, int arg14, int arg15) {
        arg13.field6995 -= arg13.field6988 * arg5;
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
        arg13.field6995 += arg13.field6988 * var22;
        arg13.field6994 = arg6;
        arg13.field6989 = arg7;
        arg13.field6982 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "()I", line = 1001)
    public final synchronized int method2939() {
        return this.field6991 == Integer.MIN_VALUE ? 0 : this.field6991;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)I", line = 1005)
    private static final int method2940(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(II[B[IIIIIIIILhr;II)I", line = 1008)
    private static final int method2941(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class527 arg11, int arg12, int arg13) {
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
        arg11.field6982 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "()I", line = 1040)
    public final int method49() {
        return this.field6991 == 0 && this.field6992 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "()Z", line = 1047)
    private final boolean method2942() {
        int var1 = this.field6991;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2940(var1, this.field6983);
            var2 = method2946(var1, this.field6983);
        }
        if (this.field6995 == var1 && this.field6994 == var3 && this.field6989 == var2) {
            if (this.field6991 == Integer.MIN_VALUE) {
                this.field6991 = 0;
                this.field6995 = this.field6994 = this.field6989 = 0;
                this.method3564(true);
                return true;
            } else {
                this.method2932();
                return false;
            }
        } else {
            if (this.field6995 < var1) {
                this.field6988 = 1;
                this.field6992 = var1 - this.field6995;
            } else if (this.field6995 > var1) {
                this.field6988 = -1;
                this.field6992 = this.field6995 - var1;
            } else {
                this.field6988 = 0;
            }
            if (this.field6994 < var3) {
                this.field6985 = 1;
                if (this.field6992 == 0 || this.field6992 > var3 - this.field6994) {
                    this.field6992 = var3 - this.field6994;
                }
            } else if (this.field6994 > var3) {
                this.field6985 = -1;
                if (this.field6992 == 0 || this.field6992 > this.field6994 - var3) {
                    this.field6992 = this.field6994 - var3;
                }
            } else {
                this.field6985 = 0;
            }
            if (this.field6989 < var2) {
                this.field6993 = 1;
                if (this.field6992 == 0 || this.field6992 > var2 - this.field6989) {
                    this.field6992 = var2 - this.field6989;
                }
            } else if (this.field6989 > var2) {
                this.field6993 = -1;
                if (this.field6992 == 0 || this.field6992 > this.field6989 - var2) {
                    this.field6992 = this.field6989 - var2;
                }
            } else {
                this.field6993 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V", line = 1133)
    private final synchronized void method2943(int arg0) {
        this.method2918(arg0, this.method2919());
    }

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)V", line = 1136)
    public final synchronized void method2944(int arg0) {
        if (arg0 == 0) {
            this.method2943(0);
            this.method3564(true);
        } else if (this.field6994 == 0 && this.field6989 == 0) {
            this.field6992 = 0;
            this.field6991 = 0;
            this.field6995 = 0;
            this.method3564(true);
        } else {
            int var2 = -this.field6995;
            if (this.field6995 > var2) {
                var2 = this.field6995;
            }
            if (-this.field6994 > var2) {
                var2 = -this.field6994;
            }
            if (this.field6994 > var2) {
                var2 = this.field6994;
            }
            if (-this.field6989 > var2) {
                var2 = -this.field6989;
            }
            if (this.field6989 > var2) {
                var2 = this.field6989;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6992 = arg0;
            this.field6991 = Integer.MIN_VALUE;
            this.field6988 = -this.field6995 / arg0;
            this.field6985 = -this.field6994 / arg0;
            this.field6993 = -this.field6989 / arg0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([III)V", line = 1181)
    public final synchronized void method26(int[] arg0, int arg1, int arg2) {
        if (this.field6991 == 0 && this.field6992 == 0) {
            this.method60(arg2);
        } else {
            class147 var4 = (class147) super.field7626;
            int var5 = this.field6990 << 8;
            int var6 = this.field6996 << 8;
            int var7 = var4.field2322.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6986 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6982 < 0) {
                if (this.field6984 <= 0) {
                    this.method2933();
                    this.method3564(true);
                    return;
                }
                this.field6982 = 0;
            }
            if (this.field6982 >= var7) {
                if (this.field6984 >= 0) {
                    this.method2933();
                    this.method3564(true);
                    return;
                }
                this.field6982 = var7 - 1;
            }
            if (this.field6986 < 0) {
                if (this.field6987) {
                    if (this.field6984 < 0) {
                        var9 = this.method2935(arg0, arg1, var5, var10, var4.field2322[this.field6990]);
                        if (this.field6982 >= var5) {
                            return;
                        }
                        this.field6982 = var5 + var5 - 1 - this.field6982;
                        this.field6984 = -this.field6984;
                    }
                    while (true) {
                        int var11 = this.method2914(arg0, var9, var6, var10, var4.field2322[this.field6996 - 1]);
                        if (this.field6982 < var6) {
                            return;
                        }
                        this.field6982 = var6 + var6 - 1 - this.field6982;
                        this.field6984 = -this.field6984;
                        var9 = this.method2935(arg0, var11, var5, var10, var4.field2322[this.field6990]);
                        if (this.field6982 >= var5) {
                            return;
                        }
                        this.field6982 = var5 + var5 - 1 - this.field6982;
                        this.field6984 = -this.field6984;
                    }
                } else if (this.field6984 < 0) {
                    while (true) {
                        var9 = this.method2935(arg0, var9, var5, var10, var4.field2322[this.field6996 - 1]);
                        if (this.field6982 >= var5) {
                            return;
                        }
                        this.field6982 = var6 - 1 - (var6 - 1 - this.field6982) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2914(arg0, var9, var6, var10, var4.field2322[this.field6990]);
                        if (this.field6982 < var6) {
                            return;
                        }
                        this.field6982 = (this.field6982 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6986 > 0) {
                    if (this.field6987) {
                        label130: {
                            if (this.field6984 < 0) {
                                var9 = this.method2935(arg0, arg1, var5, var10, var4.field2322[this.field6990]);
                                if (this.field6982 >= var5) {
                                    return;
                                }
                                this.field6982 = var5 + var5 - 1 - this.field6982;
                                this.field6984 = -this.field6984;
                                if (--this.field6986 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2914(arg0, var9, var6, var10, var4.field2322[this.field6996 - 1]);
                                if (this.field6982 < var6) {
                                    return;
                                }
                                this.field6982 = var6 + var6 - 1 - this.field6982;
                                this.field6984 = -this.field6984;
                                if (--this.field6986 == 0) {
                                    break;
                                }
                                var9 = this.method2935(arg0, var9, var5, var10, var4.field2322[this.field6990]);
                                if (this.field6982 >= var5) {
                                    return;
                                }
                                this.field6982 = var5 + var5 - 1 - this.field6982;
                                this.field6984 = -this.field6984;
                            } while (--this.field6986 != 0);
                        }
                    } else if (this.field6984 < 0) {
                        while (true) {
                            var9 = this.method2935(arg0, var9, var5, var10, var4.field2322[this.field6996 - 1]);
                            if (this.field6982 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6982) / var8;
                            if (var12 >= this.field6986) {
                                this.field6982 += this.field6986 * var8;
                                this.field6986 = 0;
                                break;
                            }
                            this.field6982 += var8 * var12;
                            this.field6986 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2914(arg0, var9, var6, var10, var4.field2322[this.field6990]);
                            if (this.field6982 < var6) {
                                return;
                            }
                            int var13 = (this.field6982 - var5) / var8;
                            if (var13 >= this.field6986) {
                                this.field6982 -= this.field6986 * var8;
                                this.field6986 = 0;
                                break;
                            }
                            this.field6982 -= var8 * var13;
                            this.field6986 -= var13;
                        }
                    }
                }
                if (this.field6984 < 0) {
                    this.method2935(arg0, var9, 0, var10, 0);
                    if (this.field6982 < 0) {
                        this.field6982 = -1;
                        this.method2933();
                        this.method3564(true);
                        return;
                    }
                } else {
                    this.method2914(arg0, var9, var7, var10, 0);
                    if (this.field6982 >= var7) {
                        this.field6982 = var7;
                        this.method2933();
                        this.method3564(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "([B[IIIIIIIILhr;)I", line = 1416)
    private static final int method2945(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class527 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6994 += (var14 - arg3) * arg9.field6985;
        arg9.field6989 += (var14 - arg3) * arg9.field6993;
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
        arg9.field6995 = var12 >> 2;
        arg9.field6982 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lct;III)V", line = 1453)
    private class527(class147 arg0, int arg1, int arg2, int arg3) {
        super.field7626 = arg0;
        this.field6990 = arg0.field2326;
        this.field6996 = arg0.field2325;
        this.field6987 = arg0.field2323;
        this.field6984 = arg1;
        this.field6991 = arg2;
        this.field6983 = arg3;
        this.field6982 = 0;
        this.method2932();
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(II)I", line = 1465)
    private static final int method2946(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }
}
