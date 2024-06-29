import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class59 extends class36 {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
    private boolean field1003;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()Lf;")
    public final class36 method215() {
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([B[IIIIIIILja;)I")
    private static final int method339(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1004 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()V")
    private final void method340() {
        this.field1006 = this.field1010;
        this.field998 = method378(this.field1010, this.field1009);
        this.field1011 = method358(this.field1010, this.field1009);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final synchronized void method341(int arg0) {
        if (this.field1001 < 0) {
            this.field1001 = -arg0;
        } else {
            this.field1001 = arg0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[B[IIIIIIIILja;II)I")
    private static final int method342(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1004 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "()Z")
    public final boolean method343() {
        return this.field1002 != 0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lcl;II)Lja;")
    public static final class59 method344(class194 arg0, int arg1, int arg2) {
        return arg0.field3547 != null && arg0.field3547.length != 0 ? new class59(arg0, (int) ((long) arg0.field3545 * 256L * (long) arg1 / (long) (class140.field2443 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()I")
    public final int method214() {
        return this.field1010 == 0 && this.field1002 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public final synchronized void method345(boolean arg0) {
        this.field1001 = (this.field1001 >>> 31) + (this.field1001 ^ this.field1001 >> 31);
        if (arg0) {
            this.field1001 = -this.field1001;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II[B[IIIIIIIILja;II)I")
    private static final int method346(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field998 -= arg11.field1008 * arg5;
        arg11.field1011 -= arg11.field1012 * arg5;
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
        arg11.field998 += arg11.field1008 * arg5;
        arg11.field1011 += arg11.field1012 * arg5;
        arg11.field1006 = arg6;
        arg11.field1004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[B[IIIIIIIILja;)I")
    private static final int method347(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1004 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([B[IIIIIIIILja;)I")
    private static final int method348(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field998 += (var14 - arg3) * arg9.field1008;
        arg9.field1011 += (var14 - arg3) * arg9.field1012;
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
        arg9.field1006 = var12 >> 2;
        arg9.field1004 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V")
    public final synchronized void method209(int[] arg0, int arg1, int arg2) {
        if (this.field1010 == 0 && this.field1002 == 0) {
            this.method213(arg2);
        } else {
            class194 var4 = (class194) super.field552;
            int var5 = this.field999 << 8;
            int var6 = this.field1005 << 8;
            int var7 = var4.field3547.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1000 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1004 < 0) {
                if (this.field1001 <= 0) {
                    this.method362();
                    this.method1544((byte) -60);
                    return;
                }
                this.field1004 = 0;
            }
            if (this.field1004 >= var7) {
                if (this.field1001 >= 0) {
                    this.method362();
                    this.method1544((byte) -97);
                    return;
                }
                this.field1004 = var7 - 1;
            }
            if (this.field1000 < 0) {
                if (this.field1003) {
                    if (this.field1001 < 0) {
                        var9 = this.method355(arg0, arg1, var5, var10, var4.field3547[this.field999]);
                        if (this.field1004 >= var5) {
                            return;
                        }
                        this.field1004 = var5 + var5 - 1 - this.field1004;
                        this.field1001 = -this.field1001;
                    }
                    while (true) {
                        int var11 = this.method365(arg0, var9, var6, var10, var4.field3547[this.field1005 - 1]);
                        if (this.field1004 < var6) {
                            return;
                        }
                        this.field1004 = var6 + var6 - 1 - this.field1004;
                        this.field1001 = -this.field1001;
                        var9 = this.method355(arg0, var11, var5, var10, var4.field3547[this.field999]);
                        if (this.field1004 >= var5) {
                            return;
                        }
                        this.field1004 = var5 + var5 - 1 - this.field1004;
                        this.field1001 = -this.field1001;
                    }
                } else if (this.field1001 < 0) {
                    while (true) {
                        var9 = this.method355(arg0, var9, var5, var10, var4.field3547[this.field1005 - 1]);
                        if (this.field1004 >= var5) {
                            return;
                        }
                        this.field1004 = var6 - 1 - (var6 - 1 - this.field1004) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method365(arg0, var9, var6, var10, var4.field3547[this.field999]);
                        if (this.field1004 < var6) {
                            return;
                        }
                        this.field1004 = (this.field1004 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1000 > 0) {
                    if (this.field1003) {
                        label130: {
                            if (this.field1001 < 0) {
                                var9 = this.method355(arg0, arg1, var5, var10, var4.field3547[this.field999]);
                                if (this.field1004 >= var5) {
                                    return;
                                }
                                this.field1004 = var5 + var5 - 1 - this.field1004;
                                this.field1001 = -this.field1001;
                                if (--this.field1000 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method365(arg0, var9, var6, var10, var4.field3547[this.field1005 - 1]);
                                if (this.field1004 < var6) {
                                    return;
                                }
                                this.field1004 = var6 + var6 - 1 - this.field1004;
                                this.field1001 = -this.field1001;
                                if (--this.field1000 == 0) {
                                    break;
                                }
                                var9 = this.method355(arg0, var9, var5, var10, var4.field3547[this.field999]);
                                if (this.field1004 >= var5) {
                                    return;
                                }
                                this.field1004 = var5 + var5 - 1 - this.field1004;
                                this.field1001 = -this.field1001;
                            } while (--this.field1000 != 0);
                        }
                    } else if (this.field1001 < 0) {
                        while (true) {
                            var9 = this.method355(arg0, var9, var5, var10, var4.field3547[this.field1005 - 1]);
                            if (this.field1004 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1004) / var8;
                            if (var12 >= this.field1000) {
                                this.field1004 += this.field1000 * var8;
                                this.field1000 = 0;
                                break;
                            }
                            this.field1004 += var8 * var12;
                            this.field1000 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method365(arg0, var9, var6, var10, var4.field3547[this.field999]);
                            if (this.field1004 < var6) {
                                return;
                            }
                            int var13 = (this.field1004 - var5) / var8;
                            if (var13 >= this.field1000) {
                                this.field1004 -= this.field1000 * var8;
                                this.field1000 = 0;
                                break;
                            }
                            this.field1004 -= var8 * var13;
                            this.field1000 -= var13;
                        }
                    }
                }
                if (this.field1001 < 0) {
                    this.method355(arg0, var9, 0, var10, 0);
                    if (this.field1004 < 0) {
                        this.field1004 = -1;
                        this.method362();
                        this.method1544((byte) -26);
                        return;
                    }
                } else {
                    this.method365(arg0, var9, var7, var10, 0);
                    if (this.field1004 >= var7) {
                        this.field1004 = var7;
                        this.method362();
                        this.method1544((byte) -102);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V")
    public final synchronized void method349(int arg0, int arg1) {
        this.method372(arg0, arg1, this.method350());
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "()I")
    public final synchronized int method350() {
        return this.field1009 < 0 ? -1 : this.field1009;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lf;")
    public final class36 method211() {
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[B[IIIIIIIIIILja;II)I")
    private static final int method351(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1006 -= arg13.field1007 * arg5;
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
        arg13.field1006 += arg13.field1007 * var22;
        arg13.field998 = arg6;
        arg13.field1011 = arg7;
        arg13.field1004 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[B[IIIIIIIIIILja;)I")
    private static final int method352(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1006 += (var19 - arg4) * arg12.field1007;
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
        arg12.field998 = var15 >> 2;
        arg12.field1011 = var16 >> 2;
        arg12.field1004 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final synchronized void method353(int arg0) {
        this.method369(arg0 << 6, this.method350());
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "()Z")
    public final boolean method354() {
        return this.field1004 < 0 || this.field1004 >= ((class194) super.field552).field3547.length << 8;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([IIIII)I")
    private final int method355(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1002 <= 0) {
                if (this.field1001 == -256 && (this.field1004 & 255) == 0) {
                    if (class204.field3687) {
                        return method356(0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, 0, arg3, arg2, this);
                    }
                    return method371(((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, 0, arg3, arg2, this);
                }
                if (class204.field3687) {
                    return method375(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, 0, arg3, arg2, this, this.field1001, arg4);
                }
                return method360(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, 0, arg3, arg2, this, this.field1001, arg4);
            }
            int var6 = this.field1002 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1002 += arg1;
            if (this.field1001 == -256 && (this.field1004 & 255) == 0) {
                if (class204.field3687) {
                    arg1 = method352(0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, this.field1008, this.field1012, 0, var6, arg2, this);
                } else {
                    arg1 = method357(((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, this.field1007, 0, var6, arg2, this);
                }
            } else if (class204.field3687) {
                arg1 = method351(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, this.field1008, this.field1012, 0, var6, arg2, this, this.field1001, arg4);
            } else {
                arg1 = method346(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, this.field1007, 0, var6, arg2, this, this.field1001, arg4);
            }
            this.field1002 -= arg1;
            if (this.field1002 != 0) {
                return arg1;
            }
        } while (!this.method376());
        return arg3;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I[B[IIIIIIIILja;)I")
    private static final int method356(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1004 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "([B[IIIIIIIILja;)I")
    private static final int method357(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field998 += (var14 - arg3) * arg9.field1008;
        arg9.field1011 += (var14 - arg3) * arg9.field1012;
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
        arg9.field1006 = var12 >> 2;
        arg9.field1004 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I")
    private static final int method358(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    private final synchronized void method359(int arg0) {
        this.method369(arg0, this.method350());
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[B[IIIIIIILja;II)I")
    private static final int method360(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final synchronized void method361(int arg0) {
        this.field1000 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "()V")
    private final void method362() {
        if (this.field1002 != 0) {
            if (this.field1010 == Integer.MIN_VALUE) {
                this.field1010 = 0;
            }
            this.field1002 = 0;
            this.method340();
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final synchronized void method363(int arg0) {
        if (arg0 == 0) {
            this.method359(0);
            this.method1544((byte) -40);
        } else if (this.field998 == 0 && this.field1011 == 0) {
            this.field1002 = 0;
            this.field1010 = 0;
            this.field1006 = 0;
            this.method1544((byte) -74);
        } else {
            int var2 = -this.field1006;
            if (this.field1006 > var2) {
                var2 = this.field1006;
            }
            if (-this.field998 > var2) {
                var2 = -this.field998;
            }
            if (this.field998 > var2) {
                var2 = this.field998;
            }
            if (-this.field1011 > var2) {
                var2 = -this.field1011;
            }
            if (this.field1011 > var2) {
                var2 = this.field1011;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1002 = arg0;
            this.field1010 = Integer.MIN_VALUE;
            this.field1007 = -this.field1006 / arg0;
            this.field1008 = -this.field998 / arg0;
            this.field1012 = -this.field1011 / arg0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lcl;III)Lja;")
    public static final class59 method364(class194 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3547 != null && arg0.field3547.length != 0 ? new class59(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "([IIIII)I")
    private final int method365(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1002 <= 0) {
                if (this.field1001 == 256 && (this.field1004 & 255) == 0) {
                    if (class204.field3687) {
                        return method347(0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, 0, arg3, arg2, this);
                    }
                    return method339(((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, 0, arg3, arg2, this);
                }
                if (class204.field3687) {
                    return method342(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, 0, arg3, arg2, this, this.field1001, arg4);
                }
                return method367(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, 0, arg3, arg2, this, this.field1001, arg4);
            }
            int var6 = this.field1002 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1002 += arg1;
            if (this.field1001 == 256 && (this.field1004 & 255) == 0) {
                if (class204.field3687) {
                    arg1 = method374(0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, this.field1008, this.field1012, 0, var6, arg2, this);
                } else {
                    arg1 = method348(((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, this.field1007, 0, var6, arg2, this);
                }
            } else if (class204.field3687) {
                arg1 = method368(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field998, this.field1011, this.field1008, this.field1012, 0, var6, arg2, this, this.field1001, arg4);
            } else {
                arg1 = method366(0, 0, ((class194) super.field552).field3547, arg0, this.field1004, arg1, this.field1006, this.field1007, 0, var6, arg2, this, this.field1001, arg4);
            }
            this.field1002 -= arg1;
            if (this.field1002 != 0) {
                return arg1;
            }
        } while (!this.method376());
        return arg3;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II[B[IIIIIIIILja;II)I")
    private static final int method366(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field998 -= arg11.field1008 * arg5;
        arg11.field1011 -= arg11.field1012 * arg5;
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
        arg11.field998 += arg11.field1008 * arg5;
        arg11.field1011 += arg11.field1012 * arg5;
        arg11.field1006 = arg6;
        arg11.field1004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II[B[IIIIIIILja;II)I")
    private static final int method367(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1004 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II[B[IIIIIIIIIILja;II)I")
    private static final int method368(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1006 -= arg13.field1007 * arg5;
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
        arg13.field1006 += arg13.field1007 * var22;
        arg13.field998 = arg6;
        arg13.field1011 = arg7;
        arg13.field1004 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)V")
    private final synchronized void method369(int arg0, int arg1) {
        this.field1010 = arg0;
        this.field1009 = arg1;
        this.field1002 = 0;
        this.method340();
    }

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "()I")
    public final synchronized int method370() {
        return this.field1001 < 0 ? -this.field1001 : this.field1001;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final int method210() {
        int var1 = this.field1006 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1000 == 0) {
            var2 -= this.field1004 * var2 / (((class194) super.field552).field3547.length << 8);
        } else if (this.field1000 >= 0) {
            var2 -= this.field999 * var2 / ((class194) super.field552).field3547.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "([B[IIIIIIILja;)I")
    private static final int method371(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1004 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final synchronized void method372(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method369(arg1, arg2);
        } else {
            int var4 = method378(arg1, arg2);
            int var5 = method358(arg1, arg2);
            if (this.field998 == var4 && this.field1011 == var5) {
                this.field1002 = 0;
            } else {
                int var6 = arg1 - this.field1006;
                if (this.field1006 - arg1 > var6) {
                    var6 = this.field1006 - arg1;
                }
                if (var4 - this.field998 > var6) {
                    var6 = var4 - this.field998;
                }
                if (this.field998 - var4 > var6) {
                    var6 = this.field998 - var4;
                }
                if (var5 - this.field1011 > var6) {
                    var6 = var5 - this.field1011;
                }
                if (this.field1011 - var5 > var6) {
                    var6 = this.field1011 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1002 = arg0;
                this.field1010 = arg1;
                this.field1009 = arg2;
                this.field1007 = (arg1 - this.field1006) / arg0;
                this.field1008 = (var4 - this.field998) / arg0;
                this.field1012 = (var5 - this.field1011) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final synchronized void method213(int arg0) {
        if (this.field1002 > 0) {
            if (arg0 >= this.field1002) {
                if (this.field1010 == Integer.MIN_VALUE) {
                    this.field1010 = 0;
                    this.field1006 = this.field998 = this.field1011 = 0;
                    this.method1544((byte) -91);
                    arg0 = this.field1002;
                }
                this.field1002 = 0;
                this.method340();
            } else {
                this.field1006 += this.field1007 * arg0;
                this.field998 += this.field1008 * arg0;
                this.field1011 += this.field1012 * arg0;
                this.field1002 -= arg0;
            }
        }
        class194 var2 = (class194) super.field552;
        int var3 = this.field999 << 8;
        int var4 = this.field1005 << 8;
        int var5 = var2.field3547.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1000 = 0;
        }
        if (this.field1004 < 0) {
            if (this.field1001 <= 0) {
                this.method362();
                this.method1544((byte) -71);
                return;
            }
            this.field1004 = 0;
        }
        if (this.field1004 >= var5) {
            if (this.field1001 >= 0) {
                this.method362();
                this.method1544((byte) -69);
                return;
            }
            this.field1004 = var5 - 1;
        }
        this.field1004 += this.field1001 * arg0;
        if (this.field1000 < 0) {
            if (!this.field1003) {
                if (this.field1001 < 0) {
                    if (this.field1004 < var3) {
                        this.field1004 = var4 - 1 - (var4 - 1 - this.field1004) % var6;
                    }
                } else if (this.field1004 >= var4) {
                    this.field1004 = (this.field1004 - var3) % var6 + var3;
                }
            } else {
                if (this.field1001 < 0) {
                    if (this.field1004 >= var3) {
                        return;
                    }
                    this.field1004 = var3 + var3 - 1 - this.field1004;
                    this.field1001 = -this.field1001;
                }
                while (this.field1004 >= var4) {
                    this.field1004 = var4 + var4 - 1 - this.field1004;
                    this.field1001 = -this.field1001;
                    if (this.field1004 >= var3) {
                        return;
                    }
                    this.field1004 = var3 + var3 - 1 - this.field1004;
                    this.field1001 = -this.field1001;
                }
            }
        } else {
            if (this.field1000 > 0) {
                if (this.field1003) {
                    label125: {
                        if (this.field1001 < 0) {
                            if (this.field1004 >= var3) {
                                return;
                            }
                            this.field1004 = var3 + var3 - 1 - this.field1004;
                            this.field1001 = -this.field1001;
                            if (--this.field1000 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1004 < var4) {
                                return;
                            }
                            this.field1004 = var4 + var4 - 1 - this.field1004;
                            this.field1001 = -this.field1001;
                            if (--this.field1000 == 0) {
                                break;
                            }
                            if (this.field1004 >= var3) {
                                return;
                            }
                            this.field1004 = var3 + var3 - 1 - this.field1004;
                            this.field1001 = -this.field1001;
                        } while (--this.field1000 != 0);
                    }
                } else if (this.field1001 < 0) {
                    if (this.field1004 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1004) / var6;
                    if (var7 < this.field1000) {
                        this.field1004 += var6 * var7;
                        this.field1000 -= var7;
                        return;
                    }
                    this.field1004 += this.field1000 * var6;
                    this.field1000 = 0;
                } else {
                    if (this.field1004 < var4) {
                        return;
                    }
                    int var8 = (this.field1004 - var3) / var6;
                    if (var8 < this.field1000) {
                        this.field1004 -= var6 * var8;
                        this.field1000 -= var8;
                        return;
                    }
                    this.field1004 -= this.field1000 * var6;
                    this.field1000 = 0;
                }
            }
            if (this.field1001 < 0) {
                if (this.field1004 < 0) {
                    this.field1004 = -1;
                    this.method362();
                    this.method1544((byte) -88);
                    return;
                }
            } else if (this.field1004 >= var5) {
                this.field1004 = var5;
                this.method362();
                this.method1544((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V")
    public final synchronized void method373(int arg0) {
        int var2 = ((class194) super.field552).field3547.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1004 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I[B[IIIIIIIIIILja;)I")
    private static final int method374(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1006 += (var19 - arg4) * arg12.field1007;
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
        arg12.field998 = var15 >> 2;
        arg12.field1011 = var16 >> 2;
        arg12.field1004 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(II[B[IIIIIIIILja;II)I")
    private static final int method375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1004 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "()Z")
    private final boolean method376() {
        int var1 = this.field1010;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method378(var1, this.field1009);
            var2 = method358(var1, this.field1009);
        }
        if (this.field1006 == var1 && this.field998 == var3 && this.field1011 == var2) {
            if (this.field1010 == Integer.MIN_VALUE) {
                this.field1010 = 0;
                this.field1006 = this.field998 = this.field1011 = 0;
                this.method1544((byte) -120);
                return true;
            } else {
                this.method340();
                return false;
            }
        } else {
            if (this.field1006 < var1) {
                this.field1007 = 1;
                this.field1002 = var1 - this.field1006;
            } else if (this.field1006 > var1) {
                this.field1007 = -1;
                this.field1002 = this.field1006 - var1;
            } else {
                this.field1007 = 0;
            }
            if (this.field998 < var3) {
                this.field1008 = 1;
                if (this.field1002 == 0 || this.field1002 > var3 - this.field998) {
                    this.field1002 = var3 - this.field998;
                }
            } else if (this.field998 > var3) {
                this.field1008 = -1;
                if (this.field1002 == 0 || this.field1002 > this.field998 - var3) {
                    this.field1002 = this.field998 - var3;
                }
            } else {
                this.field1008 = 0;
            }
            if (this.field1011 < var2) {
                this.field1012 = 1;
                if (this.field1002 == 0 || this.field1002 > var2 - this.field1011) {
                    this.field1002 = var2 - this.field1011;
                }
            } else if (this.field1011 > var2) {
                this.field1012 = -1;
                if (this.field1002 == 0 || this.field1002 > this.field1011 - var2) {
                    this.field1002 = this.field1011 - var2;
                }
            } else {
                this.field1012 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "()I")
    public final synchronized int method377() {
        return this.field1010 == Integer.MIN_VALUE ? 0 : this.field1010;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lcl;II)V")
    private class59(class194 arg0, int arg1, int arg2) {
        super.field552 = arg0;
        this.field999 = arg0.field3546;
        this.field1005 = arg0.field3544;
        this.field1003 = arg0.field3548;
        this.field1001 = arg1;
        this.field1010 = arg2;
        this.field1009 = 8192;
        this.field1004 = 0;
        this.method340();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lcl;III)V")
    private class59(class194 arg0, int arg1, int arg2, int arg3) {
        super.field552 = arg0;
        this.field999 = arg0.field3546;
        this.field1005 = arg0.field3544;
        this.field1003 = arg0.field3548;
        this.field1001 = arg1;
        this.field1010 = arg2;
        this.field1009 = arg3;
        this.field1004 = 0;
        this.method340();
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)I")
    private static final int method378(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }
}
