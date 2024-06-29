import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class108 extends class79 {

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    private int field1980;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Z")
    private boolean field1969;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field1971;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()I")
    public final int method486() {
        return this.field1968 == 0 && this.field1978 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    private static final int method631(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[B[IIIIIIIIIILm;)I")
    private static final int method632(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class108 arg12) {
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
        arg12.field1971 += (var19 - arg4) * arg12.field1979;
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
        arg12.field1974 = var15 >> 2;
        arg12.field1977 = var16 >> 2;
        arg12.field1981 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "()I")
    public final synchronized int method633() {
        return this.field1972 < 0 ? -1 : this.field1972;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
    private static final int method634(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public final synchronized void method635(int arg0) {
        int var2 = ((class83) super.field1468).field1521.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1981 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljb;II)Lm;")
    public static final class108 method636(class83 arg0, int arg1, int arg2) {
        return arg0.field1521 != null && arg0.field1521.length != 0 ? new class108(arg0, (int) ((long) arg0.field1519 * 256L * (long) arg1 / (long) (class70.field1313 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "()I")
    public final synchronized int method637() {
        return this.field1975 < 0 ? -this.field1975 : this.field1975;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIIILm;)I")
    private static final int method638(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class108 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1974 += (var14 - arg3) * arg9.field1970;
        arg9.field1977 += (var14 - arg3) * arg9.field1976;
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
        arg9.field1971 = var12 >> 2;
        arg9.field1981 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()Lig;")
    public final class79 method481() {
        return null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lig;")
    public final class79 method480() {
        return null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method639(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
        arg11.field1974 -= arg11.field1970 * arg5;
        arg11.field1977 -= arg11.field1976 * arg5;
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
        arg11.field1974 += arg11.field1970 * arg5;
        arg11.field1977 += arg11.field1976 * arg5;
        arg11.field1971 = arg6;
        arg11.field1981 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "()I")
    public final int method483() {
        int var1 = this.field1971 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1967 == 0) {
            var2 -= this.field1981 * var2 / (((class83) super.field1468).field1521.length << 8);
        } else if (this.field1967 >= 0) {
            var2 -= this.field1973 * var2 / ((class83) super.field1468).field1521.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIILm;II)I")
    private static final int method640(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10, int arg11, int arg12) {
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
        arg10.field1981 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public final synchronized void method641(int arg0) {
        if (this.field1975 < 0) {
            this.field1975 = -arg0;
        } else {
            this.field1975 = arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)V")
    public final synchronized void method642(int arg0, int arg1) {
        this.method662(arg0, arg1, this.method633());
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method643(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
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
        arg11.field1981 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "()Z")
    public final boolean method644() {
        return this.field1978 != 0;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "()Z")
    public final boolean method645() {
        return this.field1981 < 0 || this.field1981 >= ((class83) super.field1468).field1521.length << 8;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIIIIILm;II)I")
    private static final int method646(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class108 arg13, int arg14, int arg15) {
        arg13.field1971 -= arg13.field1979 * arg5;
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
        arg13.field1971 += arg13.field1979 * var22;
        arg13.field1974 = arg6;
        arg13.field1977 = arg7;
        arg13.field1981 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public final synchronized void method647(int arg0) {
        if (arg0 == 0) {
            this.method656(0);
            this.method1213(9104);
        } else if (this.field1974 == 0 && this.field1977 == 0) {
            this.field1978 = 0;
            this.field1968 = 0;
            this.field1971 = 0;
            this.method1213(9104);
        } else {
            int var2 = -this.field1971;
            if (this.field1971 > var2) {
                var2 = this.field1971;
            }
            if (-this.field1974 > var2) {
                var2 = -this.field1974;
            }
            if (this.field1974 > var2) {
                var2 = this.field1974;
            }
            if (-this.field1977 > var2) {
                var2 = -this.field1977;
            }
            if (this.field1977 > var2) {
                var2 = this.field1977;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1978 = arg0;
            this.field1968 = Integer.MIN_VALUE;
            this.field1979 = -this.field1971 / arg0;
            this.field1970 = -this.field1974 / arg0;
            this.field1976 = -this.field1977 / arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public final synchronized void method648(boolean arg0) {
        this.field1975 = (this.field1975 >>> 31) + (this.field1975 ^ this.field1975 >> 31);
        if (arg0) {
            this.field1975 = -this.field1975;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[B[IIIIIIIILm;)I")
    private static final int method649(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10) {
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
        arg10.field1981 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([III)V")
    public final synchronized void method482(int[] arg0, int arg1, int arg2) {
        if (this.field1968 == 0 && this.field1978 == 0) {
            this.method485(arg2);
        } else {
            class83 var4 = (class83) super.field1468;
            int var5 = this.field1973 << 8;
            int var6 = this.field1980 << 8;
            int var7 = var4.field1521.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1967 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1981 < 0) {
                if (this.field1975 <= 0) {
                    this.method661();
                    this.method1213(9104);
                    return;
                }
                this.field1981 = 0;
            }
            if (this.field1981 >= var7) {
                if (this.field1975 >= 0) {
                    this.method661();
                    this.method1213(9104);
                    return;
                }
                this.field1981 = var7 - 1;
            }
            if (this.field1967 < 0) {
                if (this.field1969) {
                    if (this.field1975 < 0) {
                        var9 = this.method658(arg0, arg1, var5, var10, var4.field1521[this.field1973]);
                        if (this.field1981 >= var5) {
                            return;
                        }
                        this.field1981 = var5 + var5 - 1 - this.field1981;
                        this.field1975 = -this.field1975;
                    }
                    while (true) {
                        int var11 = this.method668(arg0, var9, var6, var10, var4.field1521[this.field1980 - 1]);
                        if (this.field1981 < var6) {
                            return;
                        }
                        this.field1981 = var6 + var6 - 1 - this.field1981;
                        this.field1975 = -this.field1975;
                        var9 = this.method658(arg0, var11, var5, var10, var4.field1521[this.field1973]);
                        if (this.field1981 >= var5) {
                            return;
                        }
                        this.field1981 = var5 + var5 - 1 - this.field1981;
                        this.field1975 = -this.field1975;
                    }
                } else if (this.field1975 < 0) {
                    while (true) {
                        var9 = this.method658(arg0, var9, var5, var10, var4.field1521[this.field1980 - 1]);
                        if (this.field1981 >= var5) {
                            return;
                        }
                        this.field1981 = var6 - 1 - (var6 - 1 - this.field1981) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method668(arg0, var9, var6, var10, var4.field1521[this.field1973]);
                        if (this.field1981 < var6) {
                            return;
                        }
                        this.field1981 = (this.field1981 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1967 > 0) {
                    if (this.field1969) {
                        label130: {
                            if (this.field1975 < 0) {
                                var9 = this.method658(arg0, arg1, var5, var10, var4.field1521[this.field1973]);
                                if (this.field1981 >= var5) {
                                    return;
                                }
                                this.field1981 = var5 + var5 - 1 - this.field1981;
                                this.field1975 = -this.field1975;
                                if (--this.field1967 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method668(arg0, var9, var6, var10, var4.field1521[this.field1980 - 1]);
                                if (this.field1981 < var6) {
                                    return;
                                }
                                this.field1981 = var6 + var6 - 1 - this.field1981;
                                this.field1975 = -this.field1975;
                                if (--this.field1967 == 0) {
                                    break;
                                }
                                var9 = this.method658(arg0, var9, var5, var10, var4.field1521[this.field1973]);
                                if (this.field1981 >= var5) {
                                    return;
                                }
                                this.field1981 = var5 + var5 - 1 - this.field1981;
                                this.field1975 = -this.field1975;
                            } while (--this.field1967 != 0);
                        }
                    } else if (this.field1975 < 0) {
                        while (true) {
                            var9 = this.method658(arg0, var9, var5, var10, var4.field1521[this.field1980 - 1]);
                            if (this.field1981 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1981) / var8;
                            if (var12 >= this.field1967) {
                                this.field1981 += this.field1967 * var8;
                                this.field1967 = 0;
                                break;
                            }
                            this.field1981 += var8 * var12;
                            this.field1967 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method668(arg0, var9, var6, var10, var4.field1521[this.field1973]);
                            if (this.field1981 < var6) {
                                return;
                            }
                            int var13 = (this.field1981 - var5) / var8;
                            if (var13 >= this.field1967) {
                                this.field1981 -= this.field1967 * var8;
                                this.field1967 = 0;
                                break;
                            }
                            this.field1981 -= var8 * var13;
                            this.field1967 -= var13;
                        }
                    }
                }
                if (this.field1975 < 0) {
                    this.method658(arg0, var9, 0, var10, 0);
                    if (this.field1981 < 0) {
                        this.field1981 = -1;
                        this.method661();
                        this.method1213(9104);
                        return;
                    }
                } else {
                    this.method668(arg0, var9, var7, var10, 0);
                    if (this.field1981 >= var7) {
                        this.field1981 = var7;
                        this.method661();
                        this.method1213(9104);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "()V")
    private final void method650() {
        this.field1971 = this.field1968;
        this.field1974 = method631(this.field1968, this.field1972);
        this.field1977 = method634(this.field1968, this.field1972);
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public final synchronized void method651(int arg0) {
        this.field1967 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIILm;II)I")
    private static final int method652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10, int arg11, int arg12) {
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
        arg10.field1981 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II)V")
    private final synchronized void method653(int arg0, int arg1) {
        this.field1968 = arg0;
        this.field1972 = arg1;
        this.field1978 = 0;
        this.method650();
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method654(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
        arg11.field1974 -= arg11.field1970 * arg5;
        arg11.field1977 -= arg11.field1976 * arg5;
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
        arg11.field1974 += arg11.field1970 * arg5;
        arg11.field1977 += arg11.field1976 * arg5;
        arg11.field1971 = arg6;
        arg11.field1981 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "()I")
    public final synchronized int method655() {
        return this.field1968 == Integer.MIN_VALUE ? 0 : this.field1968;
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
    private final synchronized void method656(int arg0) {
        this.method653(arg0, this.method633());
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIILm;)I")
    private static final int method657(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108 arg8) {
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
        arg8.field1981 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIII)I")
    private final int method658(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1978 <= 0) {
                if (this.field1975 == -256 && (this.field1981 & 255) == 0) {
                    if (class51.field931) {
                        return method659(0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, 0, arg3, arg2, this);
                    }
                    return method657(((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, 0, arg3, arg2, this);
                }
                if (class51.field931) {
                    return method643(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, 0, arg3, arg2, this, this.field1975, arg4);
                }
                return method652(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, 0, arg3, arg2, this, this.field1975, arg4);
            }
            int var6 = this.field1978 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1978 += arg1;
            if (this.field1975 == -256 && (this.field1981 & 255) == 0) {
                if (class51.field931) {
                    arg1 = method632(0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, this.field1970, this.field1976, 0, var6, arg2, this);
                } else {
                    arg1 = method665(((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, this.field1979, 0, var6, arg2, this);
                }
            } else if (class51.field931) {
                arg1 = method660(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, this.field1970, this.field1976, 0, var6, arg2, this, this.field1975, arg4);
            } else {
                arg1 = method654(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, this.field1979, 0, var6, arg2, this, this.field1975, arg4);
            }
            this.field1978 -= arg1;
            if (this.field1978 != 0) {
                return arg1;
            }
        } while (!this.method667());
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I[B[IIIIIIIILm;)I")
    private static final int method659(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class108 arg10) {
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
        arg10.field1981 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIIIIILm;II)I")
    private static final int method660(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class108 arg13, int arg14, int arg15) {
        arg13.field1971 -= arg13.field1979 * arg5;
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
        arg13.field1971 += arg13.field1979 * var22;
        arg13.field1974 = arg6;
        arg13.field1977 = arg7;
        arg13.field1981 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!m", name = "k", descriptor = "()V")
    private final void method661() {
        if (this.field1978 != 0) {
            if (this.field1968 == Integer.MIN_VALUE) {
                this.field1968 = 0;
            }
            this.field1978 = 0;
            this.method650();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public final synchronized void method662(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method653(arg1, arg2);
        } else {
            int var4 = method631(arg1, arg2);
            int var5 = method634(arg1, arg2);
            if (this.field1974 == var4 && this.field1977 == var5) {
                this.field1978 = 0;
            } else {
                int var6 = arg1 - this.field1971;
                if (this.field1971 - arg1 > var6) {
                    var6 = this.field1971 - arg1;
                }
                if (var4 - this.field1974 > var6) {
                    var6 = var4 - this.field1974;
                }
                if (this.field1974 - var4 > var6) {
                    var6 = this.field1974 - var4;
                }
                if (var5 - this.field1977 > var6) {
                    var6 = var5 - this.field1977;
                }
                if (this.field1977 - var5 > var6) {
                    var6 = this.field1977 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1978 = arg0;
                this.field1968 = arg1;
                this.field1972 = arg2;
                this.field1979 = (arg1 - this.field1971) / arg0;
                this.field1970 = (var4 - this.field1974) / arg0;
                this.field1976 = (var5 - this.field1977) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "(I)V")
    public final synchronized void method663(int arg0) {
        this.method653(arg0 << 6, this.method633());
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method664(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class108 arg11, int arg12, int arg13) {
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
        arg11.field1981 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIIILm;)I")
    private static final int method665(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class108 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1974 += (var14 - arg3) * arg9.field1970;
        arg9.field1977 += (var14 - arg3) * arg9.field1976;
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
        arg9.field1971 = var12 >> 2;
        arg9.field1981 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public final synchronized void method485(int arg0) {
        if (this.field1978 > 0) {
            if (arg0 >= this.field1978) {
                if (this.field1968 == Integer.MIN_VALUE) {
                    this.field1968 = 0;
                    this.field1971 = this.field1974 = this.field1977 = 0;
                    this.method1213(9104);
                    arg0 = this.field1978;
                }
                this.field1978 = 0;
                this.method650();
            } else {
                this.field1971 += this.field1979 * arg0;
                this.field1974 += this.field1970 * arg0;
                this.field1977 += this.field1976 * arg0;
                this.field1978 -= arg0;
            }
        }
        class83 var2 = (class83) super.field1468;
        int var3 = this.field1973 << 8;
        int var4 = this.field1980 << 8;
        int var5 = var2.field1521.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1967 = 0;
        }
        if (this.field1981 < 0) {
            if (this.field1975 <= 0) {
                this.method661();
                this.method1213(9104);
                return;
            }
            this.field1981 = 0;
        }
        if (this.field1981 >= var5) {
            if (this.field1975 >= 0) {
                this.method661();
                this.method1213(9104);
                return;
            }
            this.field1981 = var5 - 1;
        }
        this.field1981 += this.field1975 * arg0;
        if (this.field1967 < 0) {
            if (!this.field1969) {
                if (this.field1975 < 0) {
                    if (this.field1981 < var3) {
                        this.field1981 = var4 - 1 - (var4 - 1 - this.field1981) % var6;
                    }
                } else if (this.field1981 >= var4) {
                    this.field1981 = (this.field1981 - var3) % var6 + var3;
                }
            } else {
                if (this.field1975 < 0) {
                    if (this.field1981 >= var3) {
                        return;
                    }
                    this.field1981 = var3 + var3 - 1 - this.field1981;
                    this.field1975 = -this.field1975;
                }
                while (this.field1981 >= var4) {
                    this.field1981 = var4 + var4 - 1 - this.field1981;
                    this.field1975 = -this.field1975;
                    if (this.field1981 >= var3) {
                        return;
                    }
                    this.field1981 = var3 + var3 - 1 - this.field1981;
                    this.field1975 = -this.field1975;
                }
            }
        } else {
            if (this.field1967 > 0) {
                if (this.field1969) {
                    label125: {
                        if (this.field1975 < 0) {
                            if (this.field1981 >= var3) {
                                return;
                            }
                            this.field1981 = var3 + var3 - 1 - this.field1981;
                            this.field1975 = -this.field1975;
                            if (--this.field1967 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1981 < var4) {
                                return;
                            }
                            this.field1981 = var4 + var4 - 1 - this.field1981;
                            this.field1975 = -this.field1975;
                            if (--this.field1967 == 0) {
                                break;
                            }
                            if (this.field1981 >= var3) {
                                return;
                            }
                            this.field1981 = var3 + var3 - 1 - this.field1981;
                            this.field1975 = -this.field1975;
                        } while (--this.field1967 != 0);
                    }
                } else if (this.field1975 < 0) {
                    if (this.field1981 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1981) / var6;
                    if (var7 < this.field1967) {
                        this.field1981 += var6 * var7;
                        this.field1967 -= var7;
                        return;
                    }
                    this.field1981 += this.field1967 * var6;
                    this.field1967 = 0;
                } else {
                    if (this.field1981 < var4) {
                        return;
                    }
                    int var8 = (this.field1981 - var3) / var6;
                    if (var8 < this.field1967) {
                        this.field1981 -= var6 * var8;
                        this.field1967 -= var8;
                        return;
                    }
                    this.field1981 -= this.field1967 * var6;
                    this.field1967 = 0;
                }
            }
            if (this.field1975 < 0) {
                if (this.field1981 < 0) {
                    this.field1981 = -1;
                    this.method661();
                    this.method1213(9104);
                    return;
                }
            } else if (this.field1981 >= var5) {
                this.field1981 = var5;
                this.method661();
                this.method1213(9104);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljb;III)Lm;")
    public static final class108 method666(class83 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1521 != null && arg0.field1521.length != 0 ? new class108(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!m", name = "l", descriptor = "()Z")
    private final boolean method667() {
        int var1 = this.field1968;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method631(var1, this.field1972);
            var2 = method634(var1, this.field1972);
        }
        if (this.field1971 == var1 && this.field1974 == var3 && this.field1977 == var2) {
            if (this.field1968 == Integer.MIN_VALUE) {
                this.field1968 = 0;
                this.field1971 = this.field1974 = this.field1977 = 0;
                this.method1213(9104);
                return true;
            } else {
                this.method650();
                return false;
            }
        } else {
            if (this.field1971 < var1) {
                this.field1979 = 1;
                this.field1978 = var1 - this.field1971;
            } else if (this.field1971 > var1) {
                this.field1979 = -1;
                this.field1978 = this.field1971 - var1;
            } else {
                this.field1979 = 0;
            }
            if (this.field1974 < var3) {
                this.field1970 = 1;
                if (this.field1978 == 0 || this.field1978 > var3 - this.field1974) {
                    this.field1978 = var3 - this.field1974;
                }
            } else if (this.field1974 > var3) {
                this.field1970 = -1;
                if (this.field1978 == 0 || this.field1978 > this.field1974 - var3) {
                    this.field1978 = this.field1974 - var3;
                }
            } else {
                this.field1970 = 0;
            }
            if (this.field1977 < var2) {
                this.field1976 = 1;
                if (this.field1978 == 0 || this.field1978 > var2 - this.field1977) {
                    this.field1978 = var2 - this.field1977;
                }
            } else if (this.field1977 > var2) {
                this.field1976 = -1;
                if (this.field1978 == 0 || this.field1978 > this.field1977 - var2) {
                    this.field1978 = this.field1977 - var2;
                }
            } else {
                this.field1976 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([IIIII)I")
    private final int method668(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1978 <= 0) {
                if (this.field1975 == 256 && (this.field1981 & 255) == 0) {
                    if (class51.field931) {
                        return method649(0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, 0, arg3, arg2, this);
                    }
                    return method669(((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, 0, arg3, arg2, this);
                }
                if (class51.field931) {
                    return method664(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, 0, arg3, arg2, this, this.field1975, arg4);
                }
                return method640(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, 0, arg3, arg2, this, this.field1975, arg4);
            }
            int var6 = this.field1978 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1978 += arg1;
            if (this.field1975 == 256 && (this.field1981 & 255) == 0) {
                if (class51.field931) {
                    arg1 = method670(0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, this.field1970, this.field1976, 0, var6, arg2, this);
                } else {
                    arg1 = method638(((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, this.field1979, 0, var6, arg2, this);
                }
            } else if (class51.field931) {
                arg1 = method646(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1974, this.field1977, this.field1970, this.field1976, 0, var6, arg2, this, this.field1975, arg4);
            } else {
                arg1 = method639(0, 0, ((class83) super.field1468).field1521, arg0, this.field1981, arg1, this.field1971, this.field1979, 0, var6, arg2, this, this.field1975, arg4);
            }
            this.field1978 -= arg1;
            if (this.field1978 != 0) {
                return arg1;
            }
        } while (!this.method667());
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIILm;)I")
    private static final int method669(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108 arg8) {
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
        arg8.field1981 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljb;II)V")
    private class108(class83 arg0, int arg1, int arg2) {
        super.field1468 = arg0;
        this.field1973 = arg0.field1517;
        this.field1980 = arg0.field1520;
        this.field1969 = arg0.field1518;
        this.field1975 = arg1;
        this.field1968 = arg2;
        this.field1972 = 8192;
        this.field1981 = 0;
        this.method650();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I[B[IIIIIIIIIILm;)I")
    private static final int method670(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class108 arg12) {
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
        arg12.field1971 += (var19 - arg4) * arg12.field1979;
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
        arg12.field1974 = var15 >> 2;
        arg12.field1977 = var16 >> 2;
        arg12.field1981 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljb;III)V")
    private class108(class83 arg0, int arg1, int arg2, int arg3) {
        super.field1468 = arg0;
        this.field1973 = arg0.field1517;
        this.field1980 = arg0.field1520;
        this.field1969 = arg0.field1518;
        this.field1975 = arg1;
        this.field1968 = arg2;
        this.field1972 = arg3;
        this.field1981 = 0;
        this.method650();
    }
}
