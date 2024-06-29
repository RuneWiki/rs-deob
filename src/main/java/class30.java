import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 extends class5 {

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    private int field680;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Z")
    private boolean field666;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[B[IIIIIIILea;II)I")
    private static final int method281(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10, int arg11, int arg12) {
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
        arg10.field676 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B[IIIIIIIILea;)I")
    private static final int method282(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class30 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field669 += (var14 - arg3) * arg9.field677;
        arg9.field674 += (var14 - arg3) * arg9.field679;
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
        arg9.field678 = var12 >> 2;
        arg9.field676 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[B[IIIIIIIILea;II)I")
    private static final int method283(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
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
        arg11.field676 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[B[IIIIIIIIIILea;II)I")
    private static final int method284(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class30 arg13, int arg14, int arg15) {
        arg13.field678 -= arg13.field673 * arg5;
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
        arg13.field678 += arg13.field673 * var22;
        arg13.field669 = arg6;
        arg13.field674 = arg7;
        arg13.field676 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[B[IIIIIIIIIILea;)I")
    private static final int method285(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class30 arg12) {
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
        arg12.field678 += (var19 - arg4) * arg12.field673;
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
        arg12.field669 = var15 >> 2;
        arg12.field674 = var16 >> 2;
        arg12.field676 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
    public final synchronized void method286(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method308(arg1, arg2);
        } else {
            int var4 = method291(arg1, arg2);
            int var5 = method289(arg1, arg2);
            if (this.field669 == var4 && this.field674 == var5) {
                this.field675 = 0;
            } else {
                int var6 = arg1 - this.field678;
                if (this.field678 - arg1 > var6) {
                    var6 = this.field678 - arg1;
                }
                if (var4 - this.field669 > var6) {
                    var6 = var4 - this.field669;
                }
                if (this.field669 - var4 > var6) {
                    var6 = this.field669 - var4;
                }
                if (var5 - this.field674 > var6) {
                    var6 = var5 - this.field674;
                }
                if (this.field674 - var5 > var6) {
                    var6 = this.field674 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field675 = arg0;
                this.field671 = arg1;
                this.field672 = arg2;
                this.field673 = (arg1 - this.field678) / arg0;
                this.field677 = (var4 - this.field669) / arg0;
                this.field679 = (var5 - this.field674) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B[IIIIIIILea;)I")
    private static final int method287(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class30 arg8) {
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
        arg8.field676 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II[B[IIIIIIIIIILea;II)I")
    private static final int method288(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class30 arg13, int arg14, int arg15) {
        arg13.field678 -= arg13.field673 * arg5;
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
        arg13.field678 += arg13.field673 * var22;
        arg13.field669 = arg6;
        arg13.field674 = arg7;
        arg13.field676 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    private static final int method289(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final synchronized void method290(int arg0) {
        if (this.field668 < 0) {
            this.field668 = -arg0;
        } else {
            this.field668 = arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
    private static final int method291(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[B[IIIIIIIILea;)I")
    private static final int method292(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10) {
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
        arg10.field676 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II[B[IIIIIIIILea;II)I")
    private static final int method293(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
        arg11.field669 -= arg11.field677 * arg5;
        arg11.field674 -= arg11.field679 * arg5;
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
        arg11.field669 += arg11.field677 * arg5;
        arg11.field674 += arg11.field679 * arg5;
        arg11.field678 = arg6;
        arg11.field676 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
    public final int method51() {
        int var1 = this.field678 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field670 == 0) {
            var2 -= this.field676 * var2 / (((class51) super.field130).field1064.length << 8);
        } else if (this.field670 >= 0) {
            var2 -= this.field680 * var2 / ((class51) super.field130).field1064.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "()I")
    public final synchronized int method294() {
        return this.field672 < 0 ? -1 : this.field672;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I[B[IIIIIIIIIILea;)I")
    private static final int method295(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class30 arg12) {
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
        arg12.field678 += (var19 - arg4) * arg12.field673;
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
        arg12.field669 = var15 >> 2;
        arg12.field674 = var16 >> 2;
        arg12.field676 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([B[IIIIIIILea;)I")
    private static final int method296(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class30 arg8) {
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
        arg8.field676 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
    public final int method47() {
        return this.field671 == 0 && this.field675 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([B[IIIIIIIILea;)I")
    private static final int method297(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class30 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field669 += (var14 - arg3) * arg9.field677;
        arg9.field674 += (var14 - arg3) * arg9.field679;
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
        arg9.field678 = var12 >> 2;
        arg9.field676 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "()V")
    private final void method298() {
        if (this.field675 != 0) {
            if (this.field671 == Integer.MIN_VALUE) {
                this.field671 = 0;
            }
            this.field675 = 0;
            this.method316();
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()Lad;")
    public final class5 method50() {
        return null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lhb;III)Lea;")
    public static final class30 method299(class51 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1064 != null && arg0.field1064.length != 0 ? new class30(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II[B[IIIIIIILea;II)I")
    private static final int method300(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10, int arg11, int arg12) {
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
        arg10.field676 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "()I")
    public final synchronized int method301() {
        return this.field671 == Integer.MIN_VALUE ? 0 : this.field671;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public final synchronized void method49(int arg0) {
        if (this.field675 > 0) {
            if (arg0 >= this.field675) {
                if (this.field671 == Integer.MIN_VALUE) {
                    this.field671 = 0;
                    this.field678 = this.field669 = this.field674 = 0;
                    this.method101((byte) 109);
                    arg0 = this.field675;
                }
                this.field675 = 0;
                this.method316();
            } else {
                this.field678 += this.field673 * arg0;
                this.field669 += this.field677 * arg0;
                this.field674 += this.field679 * arg0;
                this.field675 -= arg0;
            }
        }
        class51 var2 = (class51) super.field130;
        int var3 = this.field680 << 8;
        int var4 = this.field667 << 8;
        int var5 = var2.field1064.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field670 = 0;
        }
        if (this.field676 < 0) {
            if (this.field668 <= 0) {
                this.method298();
                this.method101((byte) 79);
                return;
            }
            this.field676 = 0;
        }
        if (this.field676 >= var5) {
            if (this.field668 >= 0) {
                this.method298();
                this.method101((byte) 91);
                return;
            }
            this.field676 = var5 - 1;
        }
        this.field676 += this.field668 * arg0;
        if (this.field670 < 0) {
            if (!this.field666) {
                if (this.field668 < 0) {
                    if (this.field676 < var3) {
                        this.field676 = var4 - 1 - (var4 - 1 - this.field676) % var6;
                    }
                } else if (this.field676 >= var4) {
                    this.field676 = (this.field676 - var3) % var6 + var3;
                }
            } else {
                if (this.field668 < 0) {
                    if (this.field676 >= var3) {
                        return;
                    }
                    this.field676 = var3 + var3 - 1 - this.field676;
                    this.field668 = -this.field668;
                }
                while (this.field676 >= var4) {
                    this.field676 = var4 + var4 - 1 - this.field676;
                    this.field668 = -this.field668;
                    if (this.field676 >= var3) {
                        return;
                    }
                    this.field676 = var3 + var3 - 1 - this.field676;
                    this.field668 = -this.field668;
                }
            }
        } else {
            if (this.field670 > 0) {
                if (this.field666) {
                    label125: {
                        if (this.field668 < 0) {
                            if (this.field676 >= var3) {
                                return;
                            }
                            this.field676 = var3 + var3 - 1 - this.field676;
                            this.field668 = -this.field668;
                            if (--this.field670 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field676 < var4) {
                                return;
                            }
                            this.field676 = var4 + var4 - 1 - this.field676;
                            this.field668 = -this.field668;
                            if (--this.field670 == 0) {
                                break;
                            }
                            if (this.field676 >= var3) {
                                return;
                            }
                            this.field676 = var3 + var3 - 1 - this.field676;
                            this.field668 = -this.field668;
                        } while (--this.field670 != 0);
                    }
                } else if (this.field668 < 0) {
                    if (this.field676 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field676) / var6;
                    if (var7 < this.field670) {
                        this.field676 += var6 * var7;
                        this.field670 -= var7;
                        return;
                    }
                    this.field676 += this.field670 * var6;
                    this.field670 = 0;
                } else {
                    if (this.field676 < var4) {
                        return;
                    }
                    int var8 = (this.field676 - var3) / var6;
                    if (var8 < this.field670) {
                        this.field676 -= var6 * var8;
                        this.field670 -= var8;
                        return;
                    }
                    this.field676 -= this.field670 * var6;
                    this.field670 = 0;
                }
            }
            if (this.field668 < 0) {
                if (this.field676 < 0) {
                    this.field676 = -1;
                    this.method298();
                    this.method101((byte) 88);
                    return;
                }
            } else if (this.field676 >= var5) {
                this.field676 = var5;
                this.method298();
                this.method101((byte) 79);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II[B[IIIIIIIILea;II)I")
    private static final int method302(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
        arg11.field669 -= arg11.field677 * arg5;
        arg11.field674 -= arg11.field679 * arg5;
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
        arg11.field669 += arg11.field677 * arg5;
        arg11.field674 += arg11.field679 * arg5;
        arg11.field678 = arg6;
        arg11.field676 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I[B[IIIIIIIILea;)I")
    private static final int method303(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10) {
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
        arg10.field676 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "()Z")
    private final boolean method304() {
        int var1 = this.field671;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method291(var1, this.field672);
            var2 = method289(var1, this.field672);
        }
        if (this.field678 == var1 && this.field669 == var3 && this.field674 == var2) {
            if (this.field671 == Integer.MIN_VALUE) {
                this.field671 = 0;
                this.field678 = this.field669 = this.field674 = 0;
                this.method101((byte) 84);
                return true;
            } else {
                this.method316();
                return false;
            }
        } else {
            if (this.field678 < var1) {
                this.field673 = 1;
                this.field675 = var1 - this.field678;
            } else if (this.field678 > var1) {
                this.field673 = -1;
                this.field675 = this.field678 - var1;
            } else {
                this.field673 = 0;
            }
            if (this.field669 < var3) {
                this.field677 = 1;
                if (this.field675 == 0 || this.field675 > var3 - this.field669) {
                    this.field675 = var3 - this.field669;
                }
            } else if (this.field669 > var3) {
                this.field677 = -1;
                if (this.field675 == 0 || this.field675 > this.field669 - var3) {
                    this.field675 = this.field669 - var3;
                }
            } else {
                this.field677 = 0;
            }
            if (this.field674 < var2) {
                this.field679 = 1;
                if (this.field675 == 0 || this.field675 > var2 - this.field674) {
                    this.field675 = var2 - this.field674;
                }
            } else if (this.field674 > var2) {
                this.field679 = -1;
                if (this.field675 == 0 || this.field675 > this.field674 - var2) {
                    this.field675 = this.field674 - var2;
                }
            } else {
                this.field679 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()Lad;")
    public final class5 method53() {
        return null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIII)I")
    private final int method305(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field675 <= 0) {
                if (this.field668 == -256 && (this.field676 & 255) == 0) {
                    if (class35.field772) {
                        return method292(0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, 0, arg3, arg2, this);
                    }
                    return method296(((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, 0, arg3, arg2, this);
                }
                if (class35.field772) {
                    return method283(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, 0, arg3, arg2, this, this.field668, arg4);
                }
                return method300(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, 0, arg3, arg2, this, this.field668, arg4);
            }
            int var6 = this.field675 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field675 += arg1;
            if (this.field668 == -256 && (this.field676 & 255) == 0) {
                if (class35.field772) {
                    arg1 = method295(0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, this.field677, this.field679, 0, var6, arg2, this);
                } else {
                    arg1 = method297(((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, this.field673, 0, var6, arg2, this);
                }
            } else if (class35.field772) {
                arg1 = method284(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, this.field677, this.field679, 0, var6, arg2, this, this.field668, arg4);
            } else {
                arg1 = method293(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, this.field673, 0, var6, arg2, this, this.field668, arg4);
            }
            this.field675 -= arg1;
            if (this.field675 != 0) {
                return arg1;
            }
        } while (!this.method304());
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "()I")
    public final synchronized int method306() {
        return this.field668 < 0 ? -this.field668 : this.field668;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public final synchronized void method307(int arg0) {
        if (arg0 == 0) {
            this.method320(0);
            this.method101((byte) 112);
        } else if (this.field669 == 0 && this.field674 == 0) {
            this.field675 = 0;
            this.field671 = 0;
            this.field678 = 0;
            this.method101((byte) 82);
        } else {
            int var2 = -this.field678;
            if (this.field678 > var2) {
                var2 = this.field678;
            }
            if (-this.field669 > var2) {
                var2 = -this.field669;
            }
            if (this.field669 > var2) {
                var2 = this.field669;
            }
            if (-this.field674 > var2) {
                var2 = -this.field674;
            }
            if (this.field674 > var2) {
                var2 = this.field674;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field675 = arg0;
            this.field671 = Integer.MIN_VALUE;
            this.field673 = -this.field678 / arg0;
            this.field677 = -this.field669 / arg0;
            this.field679 = -this.field674 / arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
    private final synchronized void method308(int arg0, int arg1) {
        this.field671 = arg0;
        this.field672 = arg1;
        this.field675 = 0;
        this.method316();
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([IIIII)I")
    private final int method309(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field675 <= 0) {
                if (this.field668 == 256 && (this.field676 & 255) == 0) {
                    if (class35.field772) {
                        return method303(0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, 0, arg3, arg2, this);
                    }
                    return method287(((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, 0, arg3, arg2, this);
                }
                if (class35.field772) {
                    return method312(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, 0, arg3, arg2, this, this.field668, arg4);
                }
                return method281(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, 0, arg3, arg2, this, this.field668, arg4);
            }
            int var6 = this.field675 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field675 += arg1;
            if (this.field668 == 256 && (this.field676 & 255) == 0) {
                if (class35.field772) {
                    arg1 = method285(0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, this.field677, this.field679, 0, var6, arg2, this);
                } else {
                    arg1 = method282(((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, this.field673, 0, var6, arg2, this);
                }
            } else if (class35.field772) {
                arg1 = method288(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field669, this.field674, this.field677, this.field679, 0, var6, arg2, this, this.field668, arg4);
            } else {
                arg1 = method302(0, 0, ((class51) super.field130).field1064, arg0, this.field676, arg1, this.field678, this.field673, 0, var6, arg2, this, this.field668, arg4);
            }
            this.field675 -= arg1;
            if (this.field675 != 0) {
                return arg1;
            }
        } while (!this.method304());
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public final synchronized void method310(boolean arg0) {
        this.field668 = (this.field668 >>> 31) + (this.field668 ^ this.field668 >> 31);
        if (arg0) {
            this.field668 = -this.field668;
        }
    }

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "()Z")
    public final boolean method311() {
        return this.field676 < 0 || this.field676 >= ((class51) super.field130).field1064.length << 8;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II[B[IIIIIIIILea;II)I")
    private static final int method312(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class30 arg11, int arg12, int arg13) {
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
        arg11.field676 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "()Z")
    public final boolean method313() {
        return this.field675 != 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lhb;II)Lea;")
    public static final class30 method314(class51 arg0, int arg1, int arg2) {
        return arg0.field1064 != null && arg0.field1064.length != 0 ? new class30(arg0, (int) ((long) arg0.field1065 * 256L * (long) arg1 / (long) (class127.field2816 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)V")
    public final synchronized void method48(int[] arg0, int arg1, int arg2) {
        if (this.field671 == 0 && this.field675 == 0) {
            this.method49(arg2);
        } else {
            class51 var4 = (class51) super.field130;
            int var5 = this.field680 << 8;
            int var6 = this.field667 << 8;
            int var7 = var4.field1064.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field670 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field676 < 0) {
                if (this.field668 <= 0) {
                    this.method298();
                    this.method101((byte) 85);
                    return;
                }
                this.field676 = 0;
            }
            if (this.field676 >= var7) {
                if (this.field668 >= 0) {
                    this.method298();
                    this.method101((byte) 121);
                    return;
                }
                this.field676 = var7 - 1;
            }
            if (this.field670 < 0) {
                if (this.field666) {
                    if (this.field668 < 0) {
                        var9 = this.method305(arg0, arg1, var5, var10, var4.field1064[this.field680]);
                        if (this.field676 >= var5) {
                            return;
                        }
                        this.field676 = var5 + var5 - 1 - this.field676;
                        this.field668 = -this.field668;
                    }
                    while (true) {
                        int var11 = this.method309(arg0, var9, var6, var10, var4.field1064[this.field667 - 1]);
                        if (this.field676 < var6) {
                            return;
                        }
                        this.field676 = var6 + var6 - 1 - this.field676;
                        this.field668 = -this.field668;
                        var9 = this.method305(arg0, var11, var5, var10, var4.field1064[this.field680]);
                        if (this.field676 >= var5) {
                            return;
                        }
                        this.field676 = var5 + var5 - 1 - this.field676;
                        this.field668 = -this.field668;
                    }
                } else if (this.field668 < 0) {
                    while (true) {
                        var9 = this.method305(arg0, var9, var5, var10, var4.field1064[this.field667 - 1]);
                        if (this.field676 >= var5) {
                            return;
                        }
                        this.field676 = var6 - 1 - (var6 - 1 - this.field676) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method309(arg0, var9, var6, var10, var4.field1064[this.field680]);
                        if (this.field676 < var6) {
                            return;
                        }
                        this.field676 = (this.field676 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field670 > 0) {
                    if (this.field666) {
                        label130: {
                            if (this.field668 < 0) {
                                var9 = this.method305(arg0, arg1, var5, var10, var4.field1064[this.field680]);
                                if (this.field676 >= var5) {
                                    return;
                                }
                                this.field676 = var5 + var5 - 1 - this.field676;
                                this.field668 = -this.field668;
                                if (--this.field670 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method309(arg0, var9, var6, var10, var4.field1064[this.field667 - 1]);
                                if (this.field676 < var6) {
                                    return;
                                }
                                this.field676 = var6 + var6 - 1 - this.field676;
                                this.field668 = -this.field668;
                                if (--this.field670 == 0) {
                                    break;
                                }
                                var9 = this.method305(arg0, var9, var5, var10, var4.field1064[this.field680]);
                                if (this.field676 >= var5) {
                                    return;
                                }
                                this.field676 = var5 + var5 - 1 - this.field676;
                                this.field668 = -this.field668;
                            } while (--this.field670 != 0);
                        }
                    } else if (this.field668 < 0) {
                        while (true) {
                            var9 = this.method305(arg0, var9, var5, var10, var4.field1064[this.field667 - 1]);
                            if (this.field676 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field676) / var8;
                            if (var12 >= this.field670) {
                                this.field676 += this.field670 * var8;
                                this.field670 = 0;
                                break;
                            }
                            this.field676 += var8 * var12;
                            this.field670 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method309(arg0, var9, var6, var10, var4.field1064[this.field680]);
                            if (this.field676 < var6) {
                                return;
                            }
                            int var13 = (this.field676 - var5) / var8;
                            if (var13 >= this.field670) {
                                this.field676 -= this.field670 * var8;
                                this.field670 = 0;
                                break;
                            }
                            this.field676 -= var8 * var13;
                            this.field670 -= var13;
                        }
                    }
                }
                if (this.field668 < 0) {
                    this.method305(arg0, var9, 0, var10, 0);
                    if (this.field676 < 0) {
                        this.field676 = -1;
                        this.method298();
                        this.method101((byte) 98);
                        return;
                    }
                } else {
                    this.method309(arg0, var9, var7, var10, 0);
                    if (this.field676 >= var7) {
                        this.field676 = var7;
                        this.method298();
                        this.method101((byte) 112);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)V")
    public final synchronized void method315(int arg0, int arg1) {
        this.method286(arg0, arg1, this.method294());
    }

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "()V")
    private final void method316() {
        this.field678 = this.field671;
        this.field669 = method291(this.field671, this.field672);
        this.field674 = method289(this.field671, this.field672);
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public final synchronized void method317(int arg0) {
        this.field670 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public final synchronized void method318(int arg0) {
        int var2 = ((class51) super.field130).field1064.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field676 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
    public final synchronized void method319(int arg0) {
        this.method308(arg0 << 6, this.method294());
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)V")
    private final synchronized void method320(int arg0) {
        this.method308(arg0, this.method294());
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lhb;II)V")
    private class30(class51 arg0, int arg1, int arg2) {
        super.field130 = arg0;
        this.field680 = arg0.field1062;
        this.field667 = arg0.field1061;
        this.field666 = arg0.field1063;
        this.field668 = arg1;
        this.field671 = arg2;
        this.field672 = 8192;
        this.field676 = 0;
        this.method316();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lhb;III)V")
    private class30(class51 arg0, int arg1, int arg2, int arg3) {
        super.field130 = arg0;
        this.field680 = arg0.field1062;
        this.field667 = arg0.field1061;
        this.field666 = arg0.field1063;
        this.field668 = arg1;
        this.field671 = arg2;
        this.field672 = arg3;
        this.field676 = 0;
        this.method316();
    }
}
