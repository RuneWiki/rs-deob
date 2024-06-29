import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class132 extends class18 {

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    private int field2147;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Z")
    private boolean field2140;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    private int field2153;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    private int field2144;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    private int field2148;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    private int field2149;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    private int field2151;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    private int field2152;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIILac;II)I", line = 3)
    private static final int method966(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class132 arg11, int arg12, int arg13) {
        arg11.field2144 -= arg11.field2143 * arg5;
        arg11.field2145 -= arg11.field2151 * arg5;
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
        arg11.field2144 += arg11.field2143 * arg5;
        arg11.field2145 += arg11.field2151 * arg5;
        arg11.field2152 = arg6;
        arg11.field2150 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIILac;II)I", line = 36)
    private static final int method967(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class132 arg11, int arg12, int arg13) {
        arg11.field2144 -= arg11.field2143 * arg5;
        arg11.field2145 -= arg11.field2151 * arg5;
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
        arg11.field2144 += arg11.field2143 * arg5;
        arg11.field2145 += arg11.field2151 * arg5;
        arg11.field2152 = arg6;
        arg11.field2150 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIILac;II)I", line = 69)
    private static final int method968(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class132 arg10, int arg11, int arg12) {
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
        arg10.field2150 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()Z", line = 95)
    public final boolean method969() {
        return this.field2148 != 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B[IIIIIIIIIILac;)I", line = 98)
    private static final int method970(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class132 arg12) {
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
        arg12.field2152 += (var19 - arg4) * arg12.field2149;
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
        arg12.field2144 = var15 >> 2;
        arg12.field2145 = var16 >> 2;
        arg12.field2150 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[B[IIIIIIIIIILac;II)I", line = 153)
    private static final int method971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class132 arg13, int arg14, int arg15) {
        arg13.field2152 -= arg13.field2149 * arg5;
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
        arg13.field2152 += arg13.field2149 * var26;
        arg13.field2144 = arg6;
        arg13.field2145 = arg7;
        arg13.field2150 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIII)I", line = 195)
    private final int method972(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2148 > 0) {
                int var6 = this.field2148 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2148 += arg1;
                if (this.field2153 == 256 && (this.field2150 & 0xFF) == 0) {
                    if (class75.field1219) {
                        arg1 = method970(0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, this.field2143, this.field2151, 0, var6, arg2, this);
                    } else {
                        arg1 = method984(((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, this.field2149, 0, var6, arg2, this);
                    }
                } else if (class75.field1219) {
                    arg1 = method994(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, this.field2143, this.field2151, 0, var6, arg2, this, this.field2153, arg4);
                } else {
                    arg1 = method967(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, this.field2149, 0, var6, arg2, this, this.field2153, arg4);
                }
                this.field2148 -= arg1;
                if (this.field2148 != 0) {
                    return arg1;
                }
                if (!this.method985()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2153 == 256 && (this.field2150 & 0xFF) == 0) {
                if (class75.field1219) {
                    return method976(0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, 0, arg3, arg2, this);
                }
                return method1004(((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, 0, arg3, arg2, this);
            }
            if (class75.field1219) {
                return method989(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, 0, arg3, arg2, this, this.field2153, arg4);
            }
            return method968(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, 0, arg3, arg2, this, this.field2153, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIILac;II)I", line = 250)
    private static final int method973(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class132 arg10, int arg11, int arg12) {
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
        arg10.field2150 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 276)
    private final synchronized void method974(int arg0, int arg1) {
        this.field2141 = arg0;
        this.field2154 = arg1;
        this.field2148 = 0;
        this.method978();
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "()I", line = 283)
    public final synchronized int method975() {
        return this.field2141 == Integer.MIN_VALUE ? 0 : this.field2141;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B[IIIIIIIILac;)I", line = 286)
    private static final int method976(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class132 arg10) {
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
        arg10.field2150 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([B[IIIIIIIILac;)I", line = 324)
    private static final int method977(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class132 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2144 += (var14 - arg3) * arg9.field2143;
        arg9.field2145 += (var14 - arg3) * arg9.field2151;
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
        arg9.field2152 = var12 >> 2;
        arg9.field2150 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "()V", line = 358)
    private final void method978() {
        this.field2152 = this.field2141;
        this.field2144 = method986(this.field2141, this.field2154);
        this.field2145 = method990(this.field2141, this.field2154);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I[B[IIIIIIIIIILac;)I", line = 363)
    private static final int method979(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class132 arg12) {
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
        arg12.field2152 += (var19 - arg4) * arg12.field2149;
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
        arg12.field2144 = var15 >> 2;
        arg12.field2145 = var16 >> 2;
        arg12.field2150 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V", line = 418)
    public final synchronized void method980(int arg0, int arg1) {
        this.method982(arg0, arg1, this.method991());
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V", line = 421)
    public final synchronized void method65(int[] arg0, int arg1, int arg2) {
        if (this.field2141 == 0 && this.field2148 == 0) {
            this.method69(arg2);
            return;
        }
        class9 var4 = (class9) this.field177;
        int var5 = this.field2142 << 8;
        int var6 = this.field2147 << 8;
        int var7 = var4.field95.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2146 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2150 < 0) {
            if (this.field2153 <= 0) {
                this.method987();
                this.method1444((byte) 89);
                return;
            }
            this.field2150 = 0;
        }
        if (this.field2150 >= var7) {
            if (this.field2153 >= 0) {
                this.method987();
                this.method1444((byte) 89);
                return;
            }
            this.field2150 = var7 - 1;
        }
        if (this.field2146 >= 0) {
            if (this.field2146 > 0) {
                if (this.field2140) {
                    label131: {
                        if (this.field2153 < 0) {
                            var9 = this.method1003(arg0, arg1, var5, var10, var4.field95[this.field2142]);
                            if (this.field2150 >= var5) {
                                return;
                            }
                            this.field2150 = var5 + var5 - this.field2150 - 1;
                            this.field2153 = -this.field2153;
                            if (--this.field2146 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method972(arg0, var9, var6, var10, var4.field95[this.field2147 - 1]);
                            if (this.field2150 < var6) {
                                return;
                            }
                            this.field2150 = var6 + var6 - this.field2150 - 1;
                            this.field2153 = -this.field2153;
                            if (--this.field2146 == 0) {
                                break;
                            }
                            var9 = this.method1003(arg0, var9, var5, var10, var4.field95[this.field2142]);
                            if (this.field2150 >= var5) {
                                return;
                            }
                            this.field2150 = var5 + var5 - this.field2150 - 1;
                            this.field2153 = -this.field2153;
                        } while (--this.field2146 != 0);
                    }
                } else if (this.field2153 < 0) {
                    while (true) {
                        var9 = this.method1003(arg0, var9, var5, var10, var4.field95[this.field2147 - 1]);
                        if (this.field2150 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field2150 - 1) / var8;
                        if (var12 >= this.field2146) {
                            this.field2150 += this.field2146 * var8;
                            this.field2146 = 0;
                            break;
                        }
                        this.field2150 += var8 * var12;
                        this.field2146 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method972(arg0, var9, var6, var10, var4.field95[this.field2142]);
                        if (this.field2150 < var6) {
                            return;
                        }
                        int var13 = (this.field2150 - var5) / var8;
                        if (var13 >= this.field2146) {
                            this.field2150 -= this.field2146 * var8;
                            this.field2146 = 0;
                            break;
                        }
                        this.field2150 -= var8 * var13;
                        this.field2146 -= var13;
                    }
                }
            }
            if (this.field2153 < 0) {
                this.method1003(arg0, var9, 0, var10, 0);
                if (this.field2150 < 0) {
                    this.field2150 = -1;
                    this.method987();
                    this.method1444((byte) 89);
                }
            } else {
                this.method972(arg0, var9, var7, var10, 0);
                if (this.field2150 >= var7) {
                    this.field2150 = var7;
                    this.method987();
                    this.method1444((byte) 89);
                }
            }
        } else if (this.field2140) {
            if (this.field2153 < 0) {
                var9 = this.method1003(arg0, arg1, var5, var10, var4.field95[this.field2142]);
                if (this.field2150 >= var5) {
                    return;
                }
                this.field2150 = var5 + var5 - this.field2150 - 1;
                this.field2153 = -this.field2153;
            }
            while (true) {
                int var11 = this.method972(arg0, var9, var6, var10, var4.field95[this.field2147 - 1]);
                if (this.field2150 < var6) {
                    return;
                }
                this.field2150 = var6 + var6 - this.field2150 - 1;
                this.field2153 = -this.field2153;
                var9 = this.method1003(arg0, var11, var5, var10, var4.field95[this.field2142]);
                if (this.field2150 >= var5) {
                    return;
                }
                this.field2150 = var5 + var5 - this.field2150 - 1;
                this.field2153 = -this.field2153;
            }
        } else if (this.field2153 < 0) {
            while (true) {
                var9 = this.method1003(arg0, var9, var5, var10, var4.field95[this.field2147 - 1]);
                if (this.field2150 >= var5) {
                    return;
                }
                this.field2150 = var6 - (var6 - 1 - this.field2150) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method972(arg0, var9, var6, var10, var4.field95[this.field2142]);
                if (this.field2150 < var6) {
                    return;
                }
                this.field2150 = (this.field2150 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 656)
    public final synchronized void method981(boolean arg0) {
        this.field2153 = (this.field2153 >>> 31) + (this.field2153 ^ this.field2153 >> 31);
        if (arg0) {
            this.field2153 = -this.field2153;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 668)
    public final synchronized void method982(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method974(arg1, arg2);
            return;
        }
        int var4 = method986(arg1, arg2);
        int var5 = method990(arg1, arg2);
        if (this.field2144 == var4 && this.field2145 == var5) {
            this.field2148 = 0;
            return;
        }
        int var6 = arg1 - this.field2152;
        if (this.field2152 - arg1 > var6) {
            var6 = this.field2152 - arg1;
        }
        if (var4 - this.field2144 > var6) {
            var6 = var4 - this.field2144;
        }
        if (this.field2144 - var4 > var6) {
            var6 = this.field2144 - var4;
        }
        if (var5 - this.field2145 > var6) {
            var6 = var5 - this.field2145;
        }
        if (this.field2145 - var5 > var6) {
            var6 = this.field2145 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2148 = arg0;
        this.field2141 = arg1;
        this.field2154 = arg2;
        this.field2149 = (arg1 - this.field2152) / arg0;
        this.field2143 = (var4 - this.field2144) / arg0;
        this.field2151 = (var5 - this.field2145) / arg0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 714)
    private final synchronized void method983(int arg0) {
        this.method974(arg0, this.method991());
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([B[IIIIIIIILac;)I", line = 717)
    private static final int method984(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class132 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2144 += (var14 - arg3) * arg9.field2143;
        arg9.field2145 += (var14 - arg3) * arg9.field2151;
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
        arg9.field2152 = var12 >> 2;
        arg9.field2150 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lwf;", line = 751)
    public final class18 method74() {
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "()Z", line = 758)
    private final boolean method985() {
        int var1 = this.field2141;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method986(var1, this.field2154);
            var2 = method990(var1, this.field2154);
        }
        if (this.field2152 != var1 || this.field2144 != var3 || this.field2145 != var2) {
            if (this.field2152 < var1) {
                this.field2149 = 1;
                this.field2148 = var1 - this.field2152;
            } else if (this.field2152 > var1) {
                this.field2149 = -1;
                this.field2148 = this.field2152 - var1;
            } else {
                this.field2149 = 0;
            }
            if (this.field2144 < var3) {
                this.field2143 = 1;
                if (this.field2148 == 0 || this.field2148 > var3 - this.field2144) {
                    this.field2148 = var3 - this.field2144;
                }
            } else if (this.field2144 > var3) {
                this.field2143 = -1;
                if (this.field2148 == 0 || this.field2148 > this.field2144 - var3) {
                    this.field2148 = this.field2144 - var3;
                }
            } else {
                this.field2143 = 0;
            }
            if (this.field2145 < var2) {
                this.field2151 = 1;
                if (this.field2148 == 0 || this.field2148 > var2 - this.field2145) {
                    this.field2148 = var2 - this.field2145;
                }
            } else if (this.field2145 > var2) {
                this.field2151 = -1;
                if (this.field2148 == 0 || this.field2148 > this.field2145 - var2) {
                    this.field2148 = this.field2145 - var2;
                }
            } else {
                this.field2151 = 0;
            }
            return false;
        } else if (this.field2141 == Integer.MIN_VALUE) {
            this.field2141 = 0;
            this.field2152 = this.field2144 = this.field2145 = 0;
            this.method1444((byte) 89);
            return true;
        } else {
            this.method978();
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I", line = 843)
    private static final int method986(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "()V", line = 848)
    private final void method987() {
        if (this.field2148 == 0) {
            return;
        }
        if (this.field2141 == Integer.MIN_VALUE) {
            this.field2141 = 0;
        }
        this.field2148 = 0;
        this.method978();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljf;III)Lac;", line = 861)
    public static final class132 method988(class9 arg0, int arg1, int arg2, int arg3) {
        return arg0.field95 == null || arg0.field95.length == 0 ? null : new class132(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II[B[IIIIIIIILac;II)I", line = 867)
    private static final int method989(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class132 arg11, int arg12, int arg13) {
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
        arg11.field2150 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I", line = 901)
    public final int method77() {
        int var1 = this.field2152 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2146 == 0) {
            var2 -= this.field2150 * var2 / (((class9) this.field177).field95.length << 8);
        } else if (this.field2146 >= 0) {
            var2 -= this.field2142 * var2 / ((class9) this.field177).field95.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)I", line = 913)
    private static final int method990(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I", line = 916)
    public final int method71() {
        return this.field2141 == 0 && this.field2148 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "()I", line = 923)
    public final synchronized int method991() {
        return this.field2154 < 0 ? -1 : this.field2154;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljf;II)Lac;", line = 929)
    public static final class132 method992(class9 arg0, int arg1, int arg2) {
        return arg0.field95 == null || arg0.field95.length == 0 ? null : new class132(arg0, (int) ((long) arg0.field93 * 256L * (long) arg1 / (long) (class151.field2393 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 936)
    public final synchronized void method993(int arg0) {
        int var2 = ((class9) this.field177).field95.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2150 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II[B[IIIIIIIIIILac;II)I", line = 949)
    private static final int method994(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class132 arg13, int arg14, int arg15) {
        arg13.field2152 -= arg13.field2149 * arg5;
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
        arg13.field2152 += arg13.field2149 * var27;
        arg13.field2144 = arg6;
        arg13.field2145 = arg7;
        arg13.field2150 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 991)
    public final synchronized void method995(int arg0) {
        this.method974(arg0 << 6, this.method991());
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II[B[IIIIIIIILac;II)I", line = 994)
    private static final int method996(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class132 arg11, int arg12, int arg13) {
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
        arg11.field2150 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "()I", line = 1026)
    public final synchronized int method997() {
        return this.field2153 < 0 ? -this.field2153 : this.field2153;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I[B[IIIIIIIILac;)I", line = 1030)
    private static final int method998(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class132 arg10) {
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
        arg10.field2150 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 1068)
    public final synchronized void method69(int arg0) {
        if (this.field2148 > 0) {
            if (arg0 >= this.field2148) {
                if (this.field2141 == Integer.MIN_VALUE) {
                    this.field2141 = 0;
                    this.field2152 = this.field2144 = this.field2145 = 0;
                    this.method1444((byte) 89);
                    arg0 = this.field2148;
                }
                this.field2148 = 0;
                this.method978();
            } else {
                this.field2152 += this.field2149 * arg0;
                this.field2144 += this.field2143 * arg0;
                this.field2145 += this.field2151 * arg0;
                this.field2148 -= arg0;
            }
        }
        class9 var2 = (class9) this.field177;
        int var3 = this.field2142 << 8;
        int var4 = this.field2147 << 8;
        int var5 = var2.field95.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2146 = 0;
        }
        if (this.field2150 < 0) {
            if (this.field2153 <= 0) {
                this.method987();
                this.method1444((byte) 89);
                return;
            }
            this.field2150 = 0;
        }
        if (this.field2150 >= var5) {
            if (this.field2153 >= 0) {
                this.method987();
                this.method1444((byte) 89);
                return;
            }
            this.field2150 = var5 - 1;
        }
        this.field2150 += this.field2153 * arg0;
        if (this.field2146 >= 0) {
            if (this.field2146 > 0) {
                if (this.field2140) {
                    label121: {
                        if (this.field2153 < 0) {
                            if (this.field2150 >= var3) {
                                return;
                            }
                            this.field2150 = var3 + var3 - this.field2150 - 1;
                            this.field2153 = -this.field2153;
                            if (--this.field2146 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2150 < var4) {
                                return;
                            }
                            this.field2150 = var4 + var4 - this.field2150 - 1;
                            this.field2153 = -this.field2153;
                            if (--this.field2146 == 0) {
                                break;
                            }
                            if (this.field2150 >= var3) {
                                return;
                            }
                            this.field2150 = var3 + var3 - this.field2150 - 1;
                            this.field2153 = -this.field2153;
                        } while (--this.field2146 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2153 < 0) {
                            if (this.field2150 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field2150 - 1) / var6;
                            if (var7 >= this.field2146) {
                                this.field2150 += this.field2146 * var6;
                                this.field2146 = 0;
                                break label153;
                            }
                            this.field2150 += var6 * var7;
                            this.field2146 -= var7;
                        } else if (this.field2150 >= var4) {
                            int var8 = (this.field2150 - var3) / var6;
                            if (var8 >= this.field2146) {
                                this.field2150 -= this.field2146 * var6;
                                this.field2146 = 0;
                                break label153;
                            }
                            this.field2150 -= var6 * var8;
                            this.field2146 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2153 < 0) {
                if (this.field2150 < 0) {
                    this.field2150 = -1;
                    this.method987();
                    this.method1444((byte) 89);
                }
            } else if (this.field2150 >= var5) {
                this.field2150 = var5;
                this.method987();
                this.method1444((byte) 89);
            }
        } else if (this.field2140) {
            if (this.field2153 < 0) {
                if (this.field2150 >= var3) {
                    return;
                }
                this.field2150 = var3 + var3 - this.field2150 - 1;
                this.field2153 = -this.field2153;
            }
            while (this.field2150 >= var4) {
                this.field2150 = var4 + var4 - this.field2150 - 1;
                this.field2153 = -this.field2153;
                if (this.field2150 >= var3) {
                    return;
                }
                this.field2150 = var3 + var3 - this.field2150 - 1;
                this.field2153 = -this.field2153;
            }
        } else if (this.field2153 < 0) {
            if (this.field2150 >= var3) {
                return;
            }
            this.field2150 = var4 - (var4 - 1 - this.field2150) % var6 - 1;
        } else if (this.field2150 >= var4) {
            this.field2150 = (this.field2150 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lwf;", line = 1286)
    public final class18 method68() {
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "()Z", line = 1290)
    public final boolean method999() {
        return this.field2150 < 0 || this.field2150 >= ((class9) this.field177).field95.length << 8;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V", line = 1293)
    public final synchronized void method1000(int arg0) {
        if (this.field2153 < 0) {
            this.field2153 = -arg0;
        } else {
            this.field2153 = arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 1301)
    public final synchronized void method1001(int arg0) {
        if (arg0 == 0) {
            this.method983(0);
            this.method1444((byte) 89);
        } else if (this.field2144 == 0 && this.field2145 == 0) {
            this.field2148 = 0;
            this.field2141 = 0;
            this.field2152 = 0;
            this.method1444((byte) 89);
        } else {
            int var2 = -this.field2152;
            if (this.field2152 > var2) {
                var2 = this.field2152;
            }
            if (-this.field2144 > var2) {
                var2 = -this.field2144;
            }
            if (this.field2144 > var2) {
                var2 = this.field2144;
            }
            if (-this.field2145 > var2) {
                var2 = -this.field2145;
            }
            if (this.field2145 > var2) {
                var2 = this.field2145;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2148 = arg0;
            this.field2141 = Integer.MIN_VALUE;
            this.field2149 = -this.field2152 / arg0;
            this.field2143 = -this.field2144 / arg0;
            this.field2151 = -this.field2145 / arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([B[IIIIIIILac;)I", line = 1346)
    private static final int method1002(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class132 arg8) {
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
        arg8.field2150 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([IIIII)I", line = 1373)
    private final int method1003(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2148 > 0) {
                int var6 = this.field2148 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2148 += arg1;
                if (this.field2153 == -256 && (this.field2150 & 0xFF) == 0) {
                    if (class75.field1219) {
                        arg1 = method979(0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, this.field2143, this.field2151, 0, var6, arg2, this);
                    } else {
                        arg1 = method977(((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, this.field2149, 0, var6, arg2, this);
                    }
                } else if (class75.field1219) {
                    arg1 = method971(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, this.field2143, this.field2151, 0, var6, arg2, this, this.field2153, arg4);
                } else {
                    arg1 = method966(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, this.field2149, 0, var6, arg2, this, this.field2153, arg4);
                }
                this.field2148 -= arg1;
                if (this.field2148 != 0) {
                    return arg1;
                }
                if (!this.method985()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2153 == -256 && (this.field2150 & 0xFF) == 0) {
                if (class75.field1219) {
                    return method998(0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, 0, arg3, arg2, this);
                }
                return method1002(((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, 0, arg3, arg2, this);
            }
            if (class75.field1219) {
                return method996(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2144, this.field2145, 0, arg3, arg2, this, this.field2153, arg4);
            }
            return method973(0, 0, ((class9) this.field177).field95, arg0, this.field2150, arg1, this.field2152, 0, arg3, arg2, this, this.field2153, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([B[IIIIIIILac;)I", line = 1430)
    private static final int method1004(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class132 arg8) {
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
        arg8.field2150 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V", line = 1456)
    public final synchronized void method1005(int arg0) {
        this.field2146 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljf;II)V", line = 1458)
    private class132(class9 arg0, int arg1, int arg2) {
        this.field177 = arg0;
        this.field2142 = arg0.field94;
        this.field2147 = arg0.field91;
        this.field2140 = arg0.field92;
        this.field2153 = arg1;
        this.field2141 = arg2;
        this.field2154 = 8192;
        this.field2150 = 0;
        this.method978();
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljf;III)V", line = 1469)
    private class132(class9 arg0, int arg1, int arg2, int arg3) {
        this.field177 = arg0;
        this.field2142 = arg0.field94;
        this.field2147 = arg0.field91;
        this.field2140 = arg0.field92;
        this.field2153 = arg1;
        this.field2141 = arg2;
        this.field2154 = arg3;
        this.field2150 = 0;
        this.method978();
    }
}
