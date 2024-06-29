import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 extends class101 {

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
    private boolean field322;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[B[IIIIIIILqk;II)I")
    private static final int method165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10, int arg11, int arg12) {
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
        arg10.field321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[B[IIIIIIIILqk;II)I")
    private static final int method166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
        arg11.field333 -= arg11.field327 * arg5;
        arg11.field329 -= arg11.field325 * arg5;
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
        arg11.field333 += arg11.field327 * arg5;
        arg11.field329 += arg11.field325 * arg5;
        arg11.field323 = arg6;
        arg11.field321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()I")
    public final int method167() {
        int var1 = this.field323 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field334 == 0) {
            var2 -= this.field321 * var2 / (((class218) super.field1179).field3377.length << 8);
        } else if (this.field334 >= 0) {
            var2 -= this.field328 * var2 / ((class218) super.field1179).field3377.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[B[IIIIIIIIIILqk;)I")
    private static final int method168(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class18 arg12) {
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
        arg12.field323 += (var19 - arg4) * arg12.field330;
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
        arg12.field333 = var15 >> 2;
        arg12.field329 = var16 >> 2;
        arg12.field321 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
    public final synchronized void method169(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method206(arg1, arg2);
        } else {
            int var4 = method183(arg1, arg2);
            int var5 = method198(arg1, arg2);
            if (this.field333 == var4 && this.field329 == var5) {
                this.field331 = 0;
            } else {
                int var6 = arg1 - this.field323;
                if (this.field323 - arg1 > var6) {
                    var6 = this.field323 - arg1;
                }
                if (var4 - this.field333 > var6) {
                    var6 = var4 - this.field333;
                }
                if (this.field333 - var4 > var6) {
                    var6 = this.field333 - var4;
                }
                if (var5 - this.field329 > var6) {
                    var6 = var5 - this.field329;
                }
                if (this.field329 - var5 > var6) {
                    var6 = this.field329 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field331 = arg0;
                this.field320 = arg1;
                this.field332 = arg2;
                this.field330 = (arg1 - this.field323) / arg0;
                this.field327 = (var4 - this.field333) / arg0;
                this.field325 = (var5 - this.field329) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I[B[IIIIIIIIIILqk;)I")
    private static final int method170(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class18 arg12) {
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
        arg12.field323 += (var19 - arg4) * arg12.field330;
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
        arg12.field333 = var15 >> 2;
        arg12.field329 = var16 >> 2;
        arg12.field321 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([IIIII)I")
    private final int method171(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field331 <= 0) {
                if (this.field324 == 256 && (this.field321 & 255) == 0) {
                    if (class488.field6898) {
                        return method190(0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, 0, arg3, arg2, this);
                    }
                    return method185(((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, 0, arg3, arg2, this);
                }
                if (class488.field6898) {
                    return method177(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, 0, arg3, arg2, this, this.field324, arg4);
                }
                return method205(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, 0, arg3, arg2, this, this.field324, arg4);
            }
            int var6 = this.field331 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field331 += arg1;
            if (this.field324 == 256 && (this.field321 & 255) == 0) {
                if (class488.field6898) {
                    arg1 = method168(0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, this.field327, this.field325, 0, var6, arg2, this);
                } else {
                    arg1 = method181(((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, this.field330, 0, var6, arg2, this);
                }
            } else if (class488.field6898) {
                arg1 = method173(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, this.field327, this.field325, 0, var6, arg2, this, this.field324, arg4);
            } else {
                arg1 = method166(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, this.field330, 0, var6, arg2, this, this.field324, arg4);
            }
            this.field331 -= arg1;
            if (this.field331 != 0) {
                return arg1;
            }
        } while (!this.method200());
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "()I")
    public final synchronized int method172() {
        return this.field332 < 0 ? -1 : this.field332;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[B[IIIIIIIIIILqk;II)I")
    private static final int method173(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class18 arg13, int arg14, int arg15) {
        arg13.field323 -= arg13.field330 * arg5;
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
        arg13.field323 += arg13.field330 * var22;
        arg13.field333 = arg6;
        arg13.field329 = arg7;
        arg13.field321 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public final synchronized void method174(int arg0) {
        if (arg0 == 0) {
            this.method188(0);
            this.method3387((byte) 108);
        } else if (this.field333 == 0 && this.field329 == 0) {
            this.field331 = 0;
            this.field320 = 0;
            this.field323 = 0;
            this.method3387((byte) -101);
        } else {
            int var2 = -this.field323;
            if (this.field323 > var2) {
                var2 = this.field323;
            }
            if (-this.field333 > var2) {
                var2 = -this.field333;
            }
            if (this.field333 > var2) {
                var2 = this.field333;
            }
            if (-this.field329 > var2) {
                var2 = -this.field329;
            }
            if (this.field329 > var2) {
                var2 = this.field329;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field331 = arg0;
            this.field320 = Integer.MIN_VALUE;
            this.field330 = -this.field323 / arg0;
            this.field327 = -this.field333 / arg0;
            this.field325 = -this.field329 / arg0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public final synchronized void method175(int arg0) {
        this.method206(arg0 << 6, this.method172());
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "()Lsd;")
    public final class101 method176() {
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II[B[IIIIIIIILqk;II)I")
    private static final int method177(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
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
        arg11.field321 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    public final synchronized void method178(int arg0, int arg1) {
        this.method169(arg0, arg1, this.method172());
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public final synchronized void method179(int arg0) {
        this.field334 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II[B[IIIIIIIIIILqk;II)I")
    private static final int method180(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class18 arg13, int arg14, int arg15) {
        arg13.field323 -= arg13.field330 * arg5;
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
        arg13.field323 += arg13.field330 * var22;
        arg13.field333 = arg6;
        arg13.field329 = arg7;
        arg13.field321 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([B[IIIIIIIILqk;)I")
    private static final int method181(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class18 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field333 += (var14 - arg3) * arg9.field327;
        arg9.field329 += (var14 - arg3) * arg9.field325;
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
        arg9.field323 = var12 >> 2;
        arg9.field321 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public final synchronized void method182(int arg0) {
        if (this.field331 > 0) {
            if (arg0 >= this.field331) {
                if (this.field320 == Integer.MIN_VALUE) {
                    this.field320 = 0;
                    this.field323 = this.field333 = this.field329 = 0;
                    this.method3387((byte) -27);
                    arg0 = this.field331;
                }
                this.field331 = 0;
                this.method204();
            } else {
                this.field323 += this.field330 * arg0;
                this.field333 += this.field327 * arg0;
                this.field329 += this.field325 * arg0;
                this.field331 -= arg0;
            }
        }
        class218 var2 = (class218) super.field1179;
        int var3 = this.field328 << 8;
        int var4 = this.field326 << 8;
        int var5 = var2.field3377.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field334 = 0;
        }
        if (this.field321 < 0) {
            if (this.field324 <= 0) {
                this.method201();
                this.method3387((byte) -17);
                return;
            }
            this.field321 = 0;
        }
        if (this.field321 >= var5) {
            if (this.field324 >= 0) {
                this.method201();
                this.method3387((byte) 123);
                return;
            }
            this.field321 = var5 - 1;
        }
        this.field321 += this.field324 * arg0;
        if (this.field334 < 0) {
            if (!this.field322) {
                if (this.field324 < 0) {
                    if (this.field321 < var3) {
                        this.field321 = var4 - 1 - (var4 - 1 - this.field321) % var6;
                    }
                } else if (this.field321 >= var4) {
                    this.field321 = (this.field321 - var3) % var6 + var3;
                }
            } else {
                if (this.field324 < 0) {
                    if (this.field321 >= var3) {
                        return;
                    }
                    this.field321 = var3 + var3 - 1 - this.field321;
                    this.field324 = -this.field324;
                }
                while (this.field321 >= var4) {
                    this.field321 = var4 + var4 - 1 - this.field321;
                    this.field324 = -this.field324;
                    if (this.field321 >= var3) {
                        return;
                    }
                    this.field321 = var3 + var3 - 1 - this.field321;
                    this.field324 = -this.field324;
                }
            }
        } else {
            if (this.field334 > 0) {
                if (this.field322) {
                    label125: {
                        if (this.field324 < 0) {
                            if (this.field321 >= var3) {
                                return;
                            }
                            this.field321 = var3 + var3 - 1 - this.field321;
                            this.field324 = -this.field324;
                            if (--this.field334 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field321 < var4) {
                                return;
                            }
                            this.field321 = var4 + var4 - 1 - this.field321;
                            this.field324 = -this.field324;
                            if (--this.field334 == 0) {
                                break;
                            }
                            if (this.field321 >= var3) {
                                return;
                            }
                            this.field321 = var3 + var3 - 1 - this.field321;
                            this.field324 = -this.field324;
                        } while (--this.field334 != 0);
                    }
                } else if (this.field324 < 0) {
                    if (this.field321 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field321) / var6;
                    if (var7 < this.field334) {
                        this.field321 += var6 * var7;
                        this.field334 -= var7;
                        return;
                    }
                    this.field321 += this.field334 * var6;
                    this.field334 = 0;
                } else {
                    if (this.field321 < var4) {
                        return;
                    }
                    int var8 = (this.field321 - var3) / var6;
                    if (var8 < this.field334) {
                        this.field321 -= var6 * var8;
                        this.field334 -= var8;
                        return;
                    }
                    this.field321 -= this.field334 * var6;
                    this.field334 = 0;
                }
            }
            if (this.field324 < 0) {
                if (this.field321 < 0) {
                    this.field321 = -1;
                    this.method201();
                    this.method3387((byte) -73);
                    return;
                }
            } else if (this.field321 >= var5) {
                this.field321 = var5;
                this.method201();
                this.method3387((byte) -70);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)I")
    private static final int method183(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public final synchronized void method184(boolean arg0) {
        this.field324 = (this.field324 >>> 31) + (this.field324 ^ this.field324 >> 31);
        if (arg0) {
            this.field324 = -this.field324;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([B[IIIIIIILqk;)I")
    private static final int method185(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class18 arg8) {
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
        arg8.field321 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
    public final synchronized void method186(int arg0) {
        int var2 = ((class218) super.field1179).field3377.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field321 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[B[IIIIIIIILqk;)I")
    private static final int method187(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10) {
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
        arg10.field321 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
    private final synchronized void method188(int arg0) {
        this.method206(arg0, this.method172());
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "([B[IIIIIIIILqk;)I")
    private static final int method189(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class18 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field333 += (var14 - arg3) * arg9.field327;
        arg9.field329 += (var14 - arg3) * arg9.field325;
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
        arg9.field323 = var12 >> 2;
        arg9.field321 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I[B[IIIIIIIILqk;)I")
    private static final int method190(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10) {
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
        arg10.field321 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "()Lsd;")
    public final class101 method191() {
        return null;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
    public final synchronized void method192(int arg0) {
        this.method206(this.method208(), arg0);
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "()Z")
    public final boolean method193() {
        return this.field321 < 0 || this.field321 >= ((class218) super.field1179).field3377.length << 8;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ldga;III)Lqk;")
    public static final class18 method194(class218 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3377 != null && arg0.field3377.length != 0 ? new class18(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "([B[IIIIIIILqk;)I")
    private static final int method195(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class18 arg8) {
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
        arg8.field321 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "()Z")
    public final boolean method196() {
        return this.field331 != 0;
    }

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "()I")
    public final synchronized int method197() {
        return this.field324 < 0 ? -this.field324 : this.field324;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(II)I")
    private static final int method198(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)V")
    public final synchronized void method199(int arg0) {
        if (this.field324 < 0) {
            this.field324 = -arg0;
        } else {
            this.field324 = arg0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "()Z")
    private final boolean method200() {
        int var1 = this.field320;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method183(var1, this.field332);
            var2 = method198(var1, this.field332);
        }
        if (this.field323 == var1 && this.field333 == var3 && this.field329 == var2) {
            if (this.field320 == Integer.MIN_VALUE) {
                this.field320 = 0;
                this.field323 = this.field333 = this.field329 = 0;
                this.method3387((byte) 119);
                return true;
            } else {
                this.method204();
                return false;
            }
        } else {
            if (this.field323 < var1) {
                this.field330 = 1;
                this.field331 = var1 - this.field323;
            } else if (this.field323 > var1) {
                this.field330 = -1;
                this.field331 = this.field323 - var1;
            } else {
                this.field330 = 0;
            }
            if (this.field333 < var3) {
                this.field327 = 1;
                if (this.field331 == 0 || this.field331 > var3 - this.field333) {
                    this.field331 = var3 - this.field333;
                }
            } else if (this.field333 > var3) {
                this.field327 = -1;
                if (this.field331 == 0 || this.field331 > this.field333 - var3) {
                    this.field331 = this.field333 - var3;
                }
            } else {
                this.field327 = 0;
            }
            if (this.field329 < var2) {
                this.field325 = 1;
                if (this.field331 == 0 || this.field331 > var2 - this.field329) {
                    this.field331 = var2 - this.field329;
                }
            } else if (this.field329 > var2) {
                this.field325 = -1;
                if (this.field331 == 0 || this.field331 > this.field329 - var2) {
                    this.field331 = this.field329 - var2;
                }
            } else {
                this.field325 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "()V")
    private final void method201() {
        if (this.field331 != 0) {
            if (this.field320 == Integer.MIN_VALUE) {
                this.field320 = 0;
            }
            this.field331 = 0;
            this.method204();
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II[B[IIIIIIIILqk;II)I")
    private static final int method202(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
        arg11.field333 -= arg11.field327 * arg5;
        arg11.field329 -= arg11.field325 * arg5;
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
        arg11.field333 += arg11.field327 * arg5;
        arg11.field329 += arg11.field325 * arg5;
        arg11.field323 = arg6;
        arg11.field321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "([III)V")
    public final synchronized void method203(int[] arg0, int arg1, int arg2) {
        if (this.field320 == 0 && this.field331 == 0) {
            this.method182(arg2);
        } else {
            class218 var4 = (class218) super.field1179;
            int var5 = this.field328 << 8;
            int var6 = this.field326 << 8;
            int var7 = var4.field3377.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field334 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field321 < 0) {
                if (this.field324 <= 0) {
                    this.method201();
                    this.method3387((byte) -74);
                    return;
                }
                this.field321 = 0;
            }
            if (this.field321 >= var7) {
                if (this.field324 >= 0) {
                    this.method201();
                    this.method3387((byte) 117);
                    return;
                }
                this.field321 = var7 - 1;
            }
            if (this.field334 < 0) {
                if (this.field322) {
                    if (this.field324 < 0) {
                        var9 = this.method209(arg0, arg1, var5, var10, var4.field3377[this.field328]);
                        if (this.field321 >= var5) {
                            return;
                        }
                        this.field321 = var5 + var5 - 1 - this.field321;
                        this.field324 = -this.field324;
                    }
                    while (true) {
                        int var11 = this.method171(arg0, var9, var6, var10, var4.field3377[this.field326 - 1]);
                        if (this.field321 < var6) {
                            return;
                        }
                        this.field321 = var6 + var6 - 1 - this.field321;
                        this.field324 = -this.field324;
                        var9 = this.method209(arg0, var11, var5, var10, var4.field3377[this.field328]);
                        if (this.field321 >= var5) {
                            return;
                        }
                        this.field321 = var5 + var5 - 1 - this.field321;
                        this.field324 = -this.field324;
                    }
                } else if (this.field324 < 0) {
                    while (true) {
                        var9 = this.method209(arg0, var9, var5, var10, var4.field3377[this.field326 - 1]);
                        if (this.field321 >= var5) {
                            return;
                        }
                        this.field321 = var6 - 1 - (var6 - 1 - this.field321) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method171(arg0, var9, var6, var10, var4.field3377[this.field328]);
                        if (this.field321 < var6) {
                            return;
                        }
                        this.field321 = (this.field321 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field334 > 0) {
                    if (this.field322) {
                        label130: {
                            if (this.field324 < 0) {
                                var9 = this.method209(arg0, arg1, var5, var10, var4.field3377[this.field328]);
                                if (this.field321 >= var5) {
                                    return;
                                }
                                this.field321 = var5 + var5 - 1 - this.field321;
                                this.field324 = -this.field324;
                                if (--this.field334 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method171(arg0, var9, var6, var10, var4.field3377[this.field326 - 1]);
                                if (this.field321 < var6) {
                                    return;
                                }
                                this.field321 = var6 + var6 - 1 - this.field321;
                                this.field324 = -this.field324;
                                if (--this.field334 == 0) {
                                    break;
                                }
                                var9 = this.method209(arg0, var9, var5, var10, var4.field3377[this.field328]);
                                if (this.field321 >= var5) {
                                    return;
                                }
                                this.field321 = var5 + var5 - 1 - this.field321;
                                this.field324 = -this.field324;
                            } while (--this.field334 != 0);
                        }
                    } else if (this.field324 < 0) {
                        while (true) {
                            var9 = this.method209(arg0, var9, var5, var10, var4.field3377[this.field326 - 1]);
                            if (this.field321 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field321) / var8;
                            if (var12 >= this.field334) {
                                this.field321 += this.field334 * var8;
                                this.field334 = 0;
                                break;
                            }
                            this.field321 += var8 * var12;
                            this.field334 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method171(arg0, var9, var6, var10, var4.field3377[this.field328]);
                            if (this.field321 < var6) {
                                return;
                            }
                            int var13 = (this.field321 - var5) / var8;
                            if (var13 >= this.field334) {
                                this.field321 -= this.field334 * var8;
                                this.field334 = 0;
                                break;
                            }
                            this.field321 -= var8 * var13;
                            this.field334 -= var13;
                        }
                    }
                }
                if (this.field324 < 0) {
                    this.method209(arg0, var9, 0, var10, 0);
                    if (this.field321 < 0) {
                        this.field321 = -1;
                        this.method201();
                        this.method3387((byte) 117);
                        return;
                    }
                } else {
                    this.method171(arg0, var9, var7, var10, 0);
                    if (this.field321 >= var7) {
                        this.field321 = var7;
                        this.method201();
                        this.method3387((byte) 107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "()V")
    private final void method204() {
        this.field323 = this.field320;
        this.field333 = method183(this.field320, this.field332);
        this.field329 = method198(this.field320, this.field332);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II[B[IIIIIIILqk;II)I")
    private static final int method205(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class18 arg10, int arg11, int arg12) {
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
        arg10.field321 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(II)V")
    private final synchronized void method206(int arg0, int arg1) {
        this.field320 = arg0;
        this.field332 = arg1;
        this.field331 = 0;
        this.method204();
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(II[B[IIIIIIIILqk;II)I")
    private static final int method207(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11, int arg12, int arg13) {
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
        arg11.field321 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "()I")
    public final synchronized int method208() {
        return this.field320 == Integer.MIN_VALUE ? 0 : this.field320;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "([IIIII)I")
    private final int method209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field331 <= 0) {
                if (this.field324 == -256 && (this.field321 & 255) == 0) {
                    if (class488.field6898) {
                        return method187(0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, 0, arg3, arg2, this);
                    }
                    return method195(((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, 0, arg3, arg2, this);
                }
                if (class488.field6898) {
                    return method207(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, 0, arg3, arg2, this, this.field324, arg4);
                }
                return method165(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, 0, arg3, arg2, this, this.field324, arg4);
            }
            int var6 = this.field331 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field331 += arg1;
            if (this.field324 == -256 && (this.field321 & 255) == 0) {
                if (class488.field6898) {
                    arg1 = method170(0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, this.field327, this.field325, 0, var6, arg2, this);
                } else {
                    arg1 = method189(((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, this.field330, 0, var6, arg2, this);
                }
            } else if (class488.field6898) {
                arg1 = method180(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field333, this.field329, this.field327, this.field325, 0, var6, arg2, this, this.field324, arg4);
            } else {
                arg1 = method202(0, 0, ((class218) super.field1179).field3377, arg0, this.field321, arg1, this.field323, this.field330, 0, var6, arg2, this, this.field324, arg4);
            }
            this.field331 -= arg1;
            if (this.field331 != 0) {
                return arg1;
            }
        } while (!this.method200());
        return arg3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()I")
    public final int method210() {
        return this.field320 == 0 && this.field331 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ldga;III)V")
    private class18(class218 arg0, int arg1, int arg2, int arg3) {
        super.field1179 = arg0;
        this.field328 = arg0.field3376;
        this.field326 = arg0.field3373;
        this.field322 = arg0.field3375;
        this.field324 = arg1;
        this.field320 = arg2;
        this.field332 = arg3;
        this.field321 = 0;
        this.method204();
    }
}
