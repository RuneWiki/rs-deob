import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class99 extends class87 {

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "Z")
    private boolean field2307;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    private int field2302;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    private int field2304;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    private int field2303;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    private int field2308;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public final synchronized void method762(int arg0) {
        if (arg0 == 0) {
            this.method773(0);
            this.method1176((byte) 73);
        } else if (this.field2305 == 0 && this.field2303 == 0) {
            this.field2309 = 0;
            this.field2302 = 0;
            this.field2313 = 0;
            this.method1176((byte) 41);
        } else {
            int var2 = -this.field2313;
            if (this.field2313 > var2) {
                var2 = this.field2313;
            }
            if (-this.field2305 > var2) {
                var2 = -this.field2305;
            }
            if (this.field2305 > var2) {
                var2 = this.field2305;
            }
            if (-this.field2303 > var2) {
                var2 = -this.field2303;
            }
            if (this.field2303 > var2) {
                var2 = this.field2303;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2309 = arg0;
            this.field2302 = Integer.MIN_VALUE;
            this.field2314 = -this.field2313 / arg0;
            this.field2312 = -this.field2305 / arg0;
            this.field2308 = -this.field2303 / arg0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[B[IIIIIIIIIILoc;)I")
    private static final int method763(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class99 arg12) {
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
        arg12.field2313 += (var19 - arg4) * arg12.field2314;
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
        arg12.field2305 = var15 >> 2;
        arg12.field2303 = var16 >> 2;
        arg12.field2304 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[B[IIIIIIILoc;II)I")
    private static final int method764(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class99 arg10, int arg11, int arg12) {
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
        arg10.field2304 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)V")
    private final synchronized void method765(int arg0, int arg1) {
        this.field2302 = arg0;
        this.field2311 = arg1;
        this.field2309 = 0;
        this.method785();
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "()I")
    public final synchronized int method766() {
        return this.field2311 < 0 ? -1 : this.field2311;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
    public final int method42() {
        return this.field2302 == 0 && this.field2309 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([B[IIIIIIIILoc;)I")
    private static final int method767(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class99 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2305 += (var14 - arg3) * arg9.field2312;
        arg9.field2303 += (var14 - arg3) * arg9.field2308;
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
        arg9.field2313 = var12 >> 2;
        arg9.field2304 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([B[IIIIIIILoc;)I")
    private static final int method768(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class99 arg8) {
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
        arg8.field2304 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lke;III)Loc;")
    public static final class99 method769(class74 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1855 != null && arg0.field1855.length != 0 ? new class99(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[B[IIIIIIIILoc;)I")
    private static final int method770(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class99 arg10) {
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
        arg10.field2304 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[B[IIIIIIIIIILoc;II)I")
    private static final int method771(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class99 arg13, int arg14, int arg15) {
        arg13.field2313 -= arg13.field2314 * arg5;
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
        arg13.field2313 += arg13.field2314 * var22;
        arg13.field2305 = arg6;
        arg13.field2303 = arg7;
        arg13.field2304 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)V")
    public final synchronized void method772(int arg0, int arg1) {
        this.method786(arg0, arg1, this.method766());
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    private final synchronized void method773(int arg0) {
        this.method765(arg0, this.method766());
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()Lmd;")
    public final class87 method30() {
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "()I")
    public final synchronized int method774() {
        return this.field2301 < 0 ? -this.field2301 : this.field2301;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[B[IIIIIIIILoc;II)I")
    private static final int method775(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class99 arg11, int arg12, int arg13) {
        arg11.field2305 -= arg11.field2312 * arg5;
        arg11.field2303 -= arg11.field2308 * arg5;
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
        arg11.field2305 += arg11.field2312 * arg5;
        arg11.field2303 += arg11.field2308 * arg5;
        arg11.field2313 = arg6;
        arg11.field2304 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "()Z")
    public final boolean method776() {
        return this.field2304 < 0 || this.field2304 >= ((class74) super.field2076).field1855.length << 8;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public final synchronized void method777(boolean arg0) {
        this.field2301 = (this.field2301 >>> 31) + (this.field2301 ^ this.field2301 >> 31);
        if (arg0) {
            this.field2301 = -this.field2301;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "()V")
    private final void method778() {
        if (this.field2309 != 0) {
            if (this.field2302 == Integer.MIN_VALUE) {
                this.field2302 = 0;
            }
            this.field2309 = 0;
            this.method785();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lke;II)Loc;")
    public static final class99 method779(class74 arg0, int arg1, int arg2) {
        return arg0.field1855 != null && arg0.field1855.length != 0 ? new class99(arg0, (int) ((long) arg0.field1858 * 256L * (long) arg1 / (long) (class144.field3371 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "([B[IIIIIIIILoc;)I")
    private static final int method780(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class99 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2305 += (var14 - arg3) * arg9.field2312;
        arg9.field2303 += (var14 - arg3) * arg9.field2308;
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
        arg9.field2313 = var12 >> 2;
        arg9.field2304 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public final synchronized void method781(int arg0) {
        this.field2315 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II[B[IIIIIIIILoc;II)I")
    private static final int method782(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class99 arg11, int arg12, int arg13) {
        arg11.field2305 -= arg11.field2312 * arg5;
        arg11.field2303 -= arg11.field2308 * arg5;
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
        arg11.field2305 += arg11.field2312 * arg5;
        arg11.field2303 += arg11.field2308 * arg5;
        arg11.field2313 = arg6;
        arg11.field2304 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([IIIII)I")
    private final int method783(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2309 <= 0) {
                if (this.field2301 == 256 && (this.field2304 & 255) == 0) {
                    if (class8.field231) {
                        return method770(0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, 0, arg3, arg2, this);
                    }
                    return method794(((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, 0, arg3, arg2, this);
                }
                if (class8.field231) {
                    return method788(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, 0, arg3, arg2, this, this.field2301, arg4);
                }
                return method764(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, 0, arg3, arg2, this, this.field2301, arg4);
            }
            int var6 = this.field2309 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2309 += arg1;
            if (this.field2301 == 256 && (this.field2304 & 255) == 0) {
                if (class8.field231) {
                    arg1 = method763(0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, this.field2312, this.field2308, 0, var6, arg2, this);
                } else {
                    arg1 = method767(((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, this.field2314, 0, var6, arg2, this);
                }
            } else if (class8.field231) {
                arg1 = method771(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, this.field2312, this.field2308, 0, var6, arg2, this, this.field2301, arg4);
            } else {
                arg1 = method775(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, this.field2314, 0, var6, arg2, this, this.field2301, arg4);
            }
            this.field2309 -= arg1;
            if (this.field2309 != 0) {
                return arg1;
            }
        } while (!this.method800());
        return arg3;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I[B[IIIIIIIIIILoc;)I")
    private static final int method784(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class99 arg12) {
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
        arg12.field2313 += (var19 - arg4) * arg12.field2314;
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
        arg12.field2305 = var15 >> 2;
        arg12.field2303 = var16 >> 2;
        arg12.field2304 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "()V")
    private final void method785() {
        this.field2313 = this.field2302;
        this.field2305 = method796(this.field2302, this.field2311);
        this.field2303 = method795(this.field2302, this.field2311);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public final synchronized void method786(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method765(arg1, arg2);
        } else {
            int var4 = method796(arg1, arg2);
            int var5 = method795(arg1, arg2);
            if (this.field2305 == var4 && this.field2303 == var5) {
                this.field2309 = 0;
            } else {
                int var6 = arg1 - this.field2313;
                if (this.field2313 - arg1 > var6) {
                    var6 = this.field2313 - arg1;
                }
                if (var4 - this.field2305 > var6) {
                    var6 = var4 - this.field2305;
                }
                if (this.field2305 - var4 > var6) {
                    var6 = this.field2305 - var4;
                }
                if (var5 - this.field2303 > var6) {
                    var6 = var5 - this.field2303;
                }
                if (this.field2303 - var5 > var6) {
                    var6 = this.field2303 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2309 = arg0;
                this.field2302 = arg1;
                this.field2311 = arg2;
                this.field2314 = (arg1 - this.field2313) / arg0;
                this.field2312 = (var4 - this.field2305) / arg0;
                this.field2308 = (var5 - this.field2303) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public final synchronized void method787(int arg0) {
        this.method765(arg0 << 6, this.method766());
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II[B[IIIIIIIILoc;II)I")
    private static final int method788(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class99 arg11, int arg12, int arg13) {
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
        arg11.field2304 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public final synchronized void method789(int arg0) {
        int var2 = ((class74) super.field2076).field1855.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2304 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public final synchronized void method41(int arg0) {
        if (this.field2309 > 0) {
            if (arg0 >= this.field2309) {
                if (this.field2302 == Integer.MIN_VALUE) {
                    this.field2302 = 0;
                    this.field2313 = this.field2305 = this.field2303 = 0;
                    this.method1176((byte) 16);
                    arg0 = this.field2309;
                }
                this.field2309 = 0;
                this.method785();
            } else {
                this.field2313 += this.field2314 * arg0;
                this.field2305 += this.field2312 * arg0;
                this.field2303 += this.field2308 * arg0;
                this.field2309 -= arg0;
            }
        }
        class74 var2 = (class74) super.field2076;
        int var3 = this.field2306 << 8;
        int var4 = this.field2310 << 8;
        int var5 = var2.field1855.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2315 = 0;
        }
        if (this.field2304 < 0) {
            if (this.field2301 <= 0) {
                this.method778();
                this.method1176((byte) -125);
                return;
            }
            this.field2304 = 0;
        }
        if (this.field2304 >= var5) {
            if (this.field2301 >= 0) {
                this.method778();
                this.method1176((byte) -127);
                return;
            }
            this.field2304 = var5 - 1;
        }
        this.field2304 += this.field2301 * arg0;
        if (this.field2315 < 0) {
            if (!this.field2307) {
                if (this.field2301 < 0) {
                    if (this.field2304 < var3) {
                        this.field2304 = var4 - 1 - (var4 - 1 - this.field2304) % var6;
                    }
                } else if (this.field2304 >= var4) {
                    this.field2304 = (this.field2304 - var3) % var6 + var3;
                }
            } else {
                if (this.field2301 < 0) {
                    if (this.field2304 >= var3) {
                        return;
                    }
                    this.field2304 = var3 + var3 - 1 - this.field2304;
                    this.field2301 = -this.field2301;
                }
                while (this.field2304 >= var4) {
                    this.field2304 = var4 + var4 - 1 - this.field2304;
                    this.field2301 = -this.field2301;
                    if (this.field2304 >= var3) {
                        return;
                    }
                    this.field2304 = var3 + var3 - 1 - this.field2304;
                    this.field2301 = -this.field2301;
                }
            }
        } else {
            if (this.field2315 > 0) {
                if (this.field2307) {
                    label125: {
                        if (this.field2301 < 0) {
                            if (this.field2304 >= var3) {
                                return;
                            }
                            this.field2304 = var3 + var3 - 1 - this.field2304;
                            this.field2301 = -this.field2301;
                            if (--this.field2315 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2304 < var4) {
                                return;
                            }
                            this.field2304 = var4 + var4 - 1 - this.field2304;
                            this.field2301 = -this.field2301;
                            if (--this.field2315 == 0) {
                                break;
                            }
                            if (this.field2304 >= var3) {
                                return;
                            }
                            this.field2304 = var3 + var3 - 1 - this.field2304;
                            this.field2301 = -this.field2301;
                        } while (--this.field2315 != 0);
                    }
                } else if (this.field2301 < 0) {
                    if (this.field2304 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2304) / var6;
                    if (var7 < this.field2315) {
                        this.field2304 += var6 * var7;
                        this.field2315 -= var7;
                        return;
                    }
                    this.field2304 += this.field2315 * var6;
                    this.field2315 = 0;
                } else {
                    if (this.field2304 < var4) {
                        return;
                    }
                    int var8 = (this.field2304 - var3) / var6;
                    if (var8 < this.field2315) {
                        this.field2304 -= var6 * var8;
                        this.field2315 -= var8;
                        return;
                    }
                    this.field2304 -= this.field2315 * var6;
                    this.field2315 = 0;
                }
            }
            if (this.field2301 < 0) {
                if (this.field2304 < 0) {
                    this.field2304 = -1;
                    this.method778();
                    this.method1176((byte) 14);
                    return;
                }
            } else if (this.field2304 >= var5) {
                this.field2304 = var5;
                this.method778();
                this.method1176((byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II[B[IIIIIIIIIILoc;II)I")
    private static final int method790(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class99 arg13, int arg14, int arg15) {
        arg13.field2313 -= arg13.field2314 * arg5;
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
        arg13.field2313 += arg13.field2314 * var22;
        arg13.field2305 = arg6;
        arg13.field2303 = arg7;
        arg13.field2304 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I[B[IIIIIIIILoc;)I")
    private static final int method791(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class99 arg10) {
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
        arg10.field2304 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "()I")
    public final synchronized int method792() {
        return this.field2302 == Integer.MIN_VALUE ? 0 : this.field2302;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II[B[IIIIIIILoc;II)I")
    private static final int method793(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class99 arg10, int arg11, int arg12) {
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
        arg10.field2304 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "([B[IIIIIIILoc;)I")
    private static final int method794(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class99 arg8) {
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
        arg8.field2304 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(II)I")
    private static final int method795(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lmd;")
    public final class87 method35() {
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
    public final int method673() {
        int var1 = this.field2313 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2315 == 0) {
            var2 -= this.field2304 * var2 / (((class74) super.field2076).field1855.length << 8);
        } else if (this.field2315 >= 0) {
            var2 -= this.field2306 * var2 / ((class74) super.field2076).field1855.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(II)I")
    private static final int method796(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(II[B[IIIIIIIILoc;II)I")
    private static final int method797(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class99 arg11, int arg12, int arg13) {
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
        arg11.field2304 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
    public final synchronized void method798(int arg0) {
        if (this.field2301 < 0) {
            this.field2301 = -arg0;
        } else {
            this.field2301 = arg0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "([IIIII)I")
    private final int method799(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2309 <= 0) {
                if (this.field2301 == -256 && (this.field2304 & 255) == 0) {
                    if (class8.field231) {
                        return method791(0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, 0, arg3, arg2, this);
                    }
                    return method768(((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, 0, arg3, arg2, this);
                }
                if (class8.field231) {
                    return method797(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, 0, arg3, arg2, this, this.field2301, arg4);
                }
                return method793(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, 0, arg3, arg2, this, this.field2301, arg4);
            }
            int var6 = this.field2309 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2309 += arg1;
            if (this.field2301 == -256 && (this.field2304 & 255) == 0) {
                if (class8.field231) {
                    arg1 = method784(0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, this.field2312, this.field2308, 0, var6, arg2, this);
                } else {
                    arg1 = method780(((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, this.field2314, 0, var6, arg2, this);
                }
            } else if (class8.field231) {
                arg1 = method790(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2305, this.field2303, this.field2312, this.field2308, 0, var6, arg2, this, this.field2301, arg4);
            } else {
                arg1 = method782(0, 0, ((class74) super.field2076).field1855, arg0, this.field2304, arg1, this.field2313, this.field2314, 0, var6, arg2, this, this.field2301, arg4);
            }
            this.field2309 -= arg1;
            if (this.field2309 != 0) {
                return arg1;
            }
        } while (!this.method800());
        return arg3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)V")
    public final synchronized void method44(int[] arg0, int arg1, int arg2) {
        if (this.field2302 == 0 && this.field2309 == 0) {
            this.method41(arg2);
        } else {
            class74 var4 = (class74) super.field2076;
            int var5 = this.field2306 << 8;
            int var6 = this.field2310 << 8;
            int var7 = var4.field1855.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2315 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2304 < 0) {
                if (this.field2301 <= 0) {
                    this.method778();
                    this.method1176((byte) -127);
                    return;
                }
                this.field2304 = 0;
            }
            if (this.field2304 >= var7) {
                if (this.field2301 >= 0) {
                    this.method778();
                    this.method1176((byte) -128);
                    return;
                }
                this.field2304 = var7 - 1;
            }
            if (this.field2315 < 0) {
                if (this.field2307) {
                    if (this.field2301 < 0) {
                        var9 = this.method799(arg0, arg1, var5, var10, var4.field1855[this.field2306]);
                        if (this.field2304 >= var5) {
                            return;
                        }
                        this.field2304 = var5 + var5 - 1 - this.field2304;
                        this.field2301 = -this.field2301;
                    }
                    while (true) {
                        int var11 = this.method783(arg0, var9, var6, var10, var4.field1855[this.field2310 - 1]);
                        if (this.field2304 < var6) {
                            return;
                        }
                        this.field2304 = var6 + var6 - 1 - this.field2304;
                        this.field2301 = -this.field2301;
                        var9 = this.method799(arg0, var11, var5, var10, var4.field1855[this.field2306]);
                        if (this.field2304 >= var5) {
                            return;
                        }
                        this.field2304 = var5 + var5 - 1 - this.field2304;
                        this.field2301 = -this.field2301;
                    }
                } else if (this.field2301 < 0) {
                    while (true) {
                        var9 = this.method799(arg0, var9, var5, var10, var4.field1855[this.field2310 - 1]);
                        if (this.field2304 >= var5) {
                            return;
                        }
                        this.field2304 = var6 - 1 - (var6 - 1 - this.field2304) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method783(arg0, var9, var6, var10, var4.field1855[this.field2306]);
                        if (this.field2304 < var6) {
                            return;
                        }
                        this.field2304 = (this.field2304 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2315 > 0) {
                    if (this.field2307) {
                        label130: {
                            if (this.field2301 < 0) {
                                var9 = this.method799(arg0, arg1, var5, var10, var4.field1855[this.field2306]);
                                if (this.field2304 >= var5) {
                                    return;
                                }
                                this.field2304 = var5 + var5 - 1 - this.field2304;
                                this.field2301 = -this.field2301;
                                if (--this.field2315 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method783(arg0, var9, var6, var10, var4.field1855[this.field2310 - 1]);
                                if (this.field2304 < var6) {
                                    return;
                                }
                                this.field2304 = var6 + var6 - 1 - this.field2304;
                                this.field2301 = -this.field2301;
                                if (--this.field2315 == 0) {
                                    break;
                                }
                                var9 = this.method799(arg0, var9, var5, var10, var4.field1855[this.field2306]);
                                if (this.field2304 >= var5) {
                                    return;
                                }
                                this.field2304 = var5 + var5 - 1 - this.field2304;
                                this.field2301 = -this.field2301;
                            } while (--this.field2315 != 0);
                        }
                    } else if (this.field2301 < 0) {
                        while (true) {
                            var9 = this.method799(arg0, var9, var5, var10, var4.field1855[this.field2310 - 1]);
                            if (this.field2304 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2304) / var8;
                            if (var12 >= this.field2315) {
                                this.field2304 += this.field2315 * var8;
                                this.field2315 = 0;
                                break;
                            }
                            this.field2304 += var8 * var12;
                            this.field2315 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method783(arg0, var9, var6, var10, var4.field1855[this.field2306]);
                            if (this.field2304 < var6) {
                                return;
                            }
                            int var13 = (this.field2304 - var5) / var8;
                            if (var13 >= this.field2315) {
                                this.field2304 -= this.field2315 * var8;
                                this.field2315 = 0;
                                break;
                            }
                            this.field2304 -= var8 * var13;
                            this.field2315 -= var13;
                        }
                    }
                }
                if (this.field2301 < 0) {
                    this.method799(arg0, var9, 0, var10, 0);
                    if (this.field2304 < 0) {
                        this.field2304 = -1;
                        this.method778();
                        this.method1176((byte) 30);
                        return;
                    }
                } else {
                    this.method783(arg0, var9, var7, var10, 0);
                    if (this.field2304 >= var7) {
                        this.field2304 = var7;
                        this.method778();
                        this.method1176((byte) -124);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "()Z")
    private final boolean method800() {
        int var1 = this.field2302;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method796(var1, this.field2311);
            var2 = method795(var1, this.field2311);
        }
        if (this.field2313 == var1 && this.field2305 == var3 && this.field2303 == var2) {
            if (this.field2302 == Integer.MIN_VALUE) {
                this.field2302 = 0;
                this.field2313 = this.field2305 = this.field2303 = 0;
                this.method1176((byte) -128);
                return true;
            } else {
                this.method785();
                return false;
            }
        } else {
            if (this.field2313 < var1) {
                this.field2314 = 1;
                this.field2309 = var1 - this.field2313;
            } else if (this.field2313 > var1) {
                this.field2314 = -1;
                this.field2309 = this.field2313 - var1;
            } else {
                this.field2314 = 0;
            }
            if (this.field2305 < var3) {
                this.field2312 = 1;
                if (this.field2309 == 0 || this.field2309 > var3 - this.field2305) {
                    this.field2309 = var3 - this.field2305;
                }
            } else if (this.field2305 > var3) {
                this.field2312 = -1;
                if (this.field2309 == 0 || this.field2309 > this.field2305 - var3) {
                    this.field2309 = this.field2305 - var3;
                }
            } else {
                this.field2312 = 0;
            }
            if (this.field2303 < var2) {
                this.field2308 = 1;
                if (this.field2309 == 0 || this.field2309 > var2 - this.field2303) {
                    this.field2309 = var2 - this.field2303;
                }
            } else if (this.field2303 > var2) {
                this.field2308 = -1;
                if (this.field2309 == 0 || this.field2309 > this.field2303 - var2) {
                    this.field2309 = this.field2303 - var2;
                }
            } else {
                this.field2308 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "()Z")
    public final boolean method801() {
        return this.field2309 != 0;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lke;II)V")
    private class99(class74 arg0, int arg1, int arg2) {
        super.field2076 = arg0;
        this.field2306 = arg0.field1857;
        this.field2310 = arg0.field1856;
        this.field2307 = arg0.field1859;
        this.field2301 = arg1;
        this.field2302 = arg2;
        this.field2311 = 8192;
        this.field2304 = 0;
        this.method785();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lke;III)V")
    private class99(class74 arg0, int arg1, int arg2, int arg3) {
        super.field2076 = arg0;
        this.field2306 = arg0.field1857;
        this.field2310 = arg0.field1856;
        this.field2307 = arg0.field1859;
        this.field2301 = arg1;
        this.field2302 = arg2;
        this.field2311 = arg3;
        this.field2304 = 0;
        this.method785();
    }
}
