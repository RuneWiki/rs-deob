import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 extends class22 {

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
    private boolean field2116;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    private int field2118;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    private int field2123;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public final synchronized void method691(int arg0) {
        this.method719(arg0 << 6, this.method724());
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B[IIIIIIIILnd;)I")
    private static final int method692(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class94 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2110 += (var14 - arg3) * arg9.field2117;
        arg9.field2114 += (var14 - arg3) * arg9.field2121;
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
        arg9.field2109 = var12 >> 2;
        arg9.field2111 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public final synchronized void method158(int arg0) {
        if (this.field2122 > 0) {
            if (arg0 >= this.field2122) {
                if (this.field2115 == Integer.MIN_VALUE) {
                    this.field2115 = 0;
                    this.field2109 = this.field2110 = this.field2114 = 0;
                    this.method115(26851);
                    arg0 = this.field2122;
                }
                this.field2122 = 0;
                this.method710();
            } else {
                this.field2109 += this.field2119 * arg0;
                this.field2110 += this.field2117 * arg0;
                this.field2114 += this.field2121 * arg0;
                this.field2122 -= arg0;
            }
        }
        class125 var2 = (class125) super.field407;
        int var3 = this.field2112 << 8;
        int var4 = this.field2120 << 8;
        int var5 = var2.field2757.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2123 = 0;
        }
        if (this.field2111 < 0) {
            if (this.field2113 <= 0) {
                this.method712();
                this.method115(26851);
                return;
            }
            this.field2111 = 0;
        }
        if (this.field2111 >= var5) {
            if (this.field2113 >= 0) {
                this.method712();
                this.method115(26851);
                return;
            }
            this.field2111 = var5 - 1;
        }
        this.field2111 += this.field2113 * arg0;
        if (this.field2123 < 0) {
            if (!this.field2116) {
                if (this.field2113 < 0) {
                    if (this.field2111 < var3) {
                        this.field2111 = var4 - 1 - (var4 - 1 - this.field2111) % var6;
                    }
                } else if (this.field2111 >= var4) {
                    this.field2111 = (this.field2111 - var3) % var6 + var3;
                }
            } else {
                if (this.field2113 < 0) {
                    if (this.field2111 >= var3) {
                        return;
                    }
                    this.field2111 = var3 + var3 - 1 - this.field2111;
                    this.field2113 = -this.field2113;
                }
                while (this.field2111 >= var4) {
                    this.field2111 = var4 + var4 - 1 - this.field2111;
                    this.field2113 = -this.field2113;
                    if (this.field2111 >= var3) {
                        return;
                    }
                    this.field2111 = var3 + var3 - 1 - this.field2111;
                    this.field2113 = -this.field2113;
                }
            }
        } else {
            if (this.field2123 > 0) {
                if (this.field2116) {
                    label125: {
                        if (this.field2113 < 0) {
                            if (this.field2111 >= var3) {
                                return;
                            }
                            this.field2111 = var3 + var3 - 1 - this.field2111;
                            this.field2113 = -this.field2113;
                            if (--this.field2123 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2111 < var4) {
                                return;
                            }
                            this.field2111 = var4 + var4 - 1 - this.field2111;
                            this.field2113 = -this.field2113;
                            if (--this.field2123 == 0) {
                                break;
                            }
                            if (this.field2111 >= var3) {
                                return;
                            }
                            this.field2111 = var3 + var3 - 1 - this.field2111;
                            this.field2113 = -this.field2113;
                        } while (--this.field2123 != 0);
                    }
                } else if (this.field2113 < 0) {
                    if (this.field2111 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2111) / var6;
                    if (var7 < this.field2123) {
                        this.field2111 += var6 * var7;
                        this.field2123 -= var7;
                        return;
                    }
                    this.field2111 += this.field2123 * var6;
                    this.field2123 = 0;
                } else {
                    if (this.field2111 < var4) {
                        return;
                    }
                    int var8 = (this.field2111 - var3) / var6;
                    if (var8 < this.field2123) {
                        this.field2111 -= var6 * var8;
                        this.field2123 -= var8;
                        return;
                    }
                    this.field2111 -= this.field2123 * var6;
                    this.field2123 = 0;
                }
            }
            if (this.field2113 < 0) {
                if (this.field2111 < 0) {
                    this.field2111 = -1;
                    this.method712();
                    this.method115(26851);
                    return;
                }
            } else if (this.field2111 >= var5) {
                this.field2111 = var5;
                this.method712();
                this.method115(26851);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[IIIIIIIIIILnd;II)I")
    private static final int method693(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        arg13.field2109 -= arg13.field2119 * arg5;
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
        arg13.field2109 += arg13.field2119 * var22;
        arg13.field2110 = arg6;
        arg13.field2114 = arg7;
        arg13.field2111 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()Ld;")
    public final class22 method153() {
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[IIIIIIIILnd;II)I")
    private static final int method694(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
        arg11.field2110 -= arg11.field2117 * arg5;
        arg11.field2114 -= arg11.field2121 * arg5;
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
        arg11.field2110 += arg11.field2117 * arg5;
        arg11.field2114 += arg11.field2121 * arg5;
        arg11.field2109 = arg6;
        arg11.field2111 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B[IIIIIIIIIILnd;)I")
    private static final int method695(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class94 arg12) {
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
        arg12.field2109 += (var19 - arg4) * arg12.field2119;
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
        arg12.field2110 = var15 >> 2;
        arg12.field2114 = var16 >> 2;
        arg12.field2111 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public final synchronized void method696(boolean arg0) {
        this.field2113 = (this.field2113 >>> 31) + (this.field2113 ^ this.field2113 >> 31);
        if (arg0) {
            this.field2113 = -this.field2113;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B[IIIIIIIILnd;)I")
    private static final int method697(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10) {
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
        arg10.field2111 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()I")
    public final int method157() {
        int var1 = this.field2109 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2123 == 0) {
            var2 -= this.field2111 * var2 / (((class125) super.field407).field2757.length << 8);
        } else if (this.field2123 >= 0) {
            var2 -= this.field2112 * var2 / ((class125) super.field407).field2757.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()Ld;")
    public final class22 method159() {
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ls;III)Lnd;")
    public static final class94 method698(class125 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2757 != null && arg0.field2757.length != 0 ? new class94(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B[IIIIIIILnd;)I")
    private static final int method699(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8) {
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
        arg8.field2111 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()Z")
    public final boolean method700() {
        return this.field2122 != 0;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([B[IIIIIIIILnd;)I")
    private static final int method701(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class94 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2110 += (var14 - arg3) * arg9.field2117;
        arg9.field2114 += (var14 - arg3) * arg9.field2121;
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
        arg9.field2109 = var12 >> 2;
        arg9.field2111 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()I")
    public final synchronized int method702() {
        return this.field2113 < 0 ? -this.field2113 : this.field2113;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public final synchronized void method703(int arg0) {
        int var2 = ((class125) super.field407).field2757.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2111 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
    public final synchronized void method704(int arg0) {
        if (arg0 == 0) {
            this.method726(0);
            this.method115(26851);
        } else if (this.field2110 == 0 && this.field2114 == 0) {
            this.field2122 = 0;
            this.field2115 = 0;
            this.field2109 = 0;
            this.method115(26851);
        } else {
            int var2 = -this.field2109;
            if (this.field2109 > var2) {
                var2 = this.field2109;
            }
            if (-this.field2110 > var2) {
                var2 = -this.field2110;
            }
            if (this.field2110 > var2) {
                var2 = this.field2110;
            }
            if (-this.field2114 > var2) {
                var2 = -this.field2114;
            }
            if (this.field2114 > var2) {
                var2 = this.field2114;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2122 = arg0;
            this.field2115 = Integer.MIN_VALUE;
            this.field2119 = -this.field2109 / arg0;
            this.field2117 = -this.field2110 / arg0;
            this.field2121 = -this.field2114 / arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
    private static final int method705(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[B[IIIIIIIIIILnd;)I")
    private static final int method706(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class94 arg12) {
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
        arg12.field2109 += (var19 - arg4) * arg12.field2119;
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
        arg12.field2110 = var15 >> 2;
        arg12.field2114 = var16 >> 2;
        arg12.field2111 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([B[IIIIIIILnd;)I")
    private static final int method707(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8) {
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
        arg8.field2111 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II[B[IIIIIIIILnd;II)I")
    private static final int method708(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
        arg11.field2110 -= arg11.field2117 * arg5;
        arg11.field2114 -= arg11.field2121 * arg5;
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
        arg11.field2110 += arg11.field2117 * arg5;
        arg11.field2114 += arg11.field2121 * arg5;
        arg11.field2109 = arg6;
        arg11.field2111 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[IIIIIIILnd;II)I")
    private static final int method709(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, int arg11, int arg12) {
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
        arg10.field2111 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()V")
    private final void method710() {
        this.field2109 = this.field2115;
        this.field2110 = method705(this.field2115, this.field2118);
        this.field2114 = method727(this.field2115, this.field2118);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
    public final synchronized void method711(int arg0, int arg1) {
        this.method725(arg0, arg1, this.method724());
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([III)V")
    public final synchronized void method156(int[] arg0, int arg1, int arg2) {
        if (this.field2115 == 0 && this.field2122 == 0) {
            this.method158(arg2);
        } else {
            class125 var4 = (class125) super.field407;
            int var5 = this.field2112 << 8;
            int var6 = this.field2120 << 8;
            int var7 = var4.field2757.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2123 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2111 < 0) {
                if (this.field2113 <= 0) {
                    this.method712();
                    this.method115(26851);
                    return;
                }
                this.field2111 = 0;
            }
            if (this.field2111 >= var7) {
                if (this.field2113 >= 0) {
                    this.method712();
                    this.method115(26851);
                    return;
                }
                this.field2111 = var7 - 1;
            }
            if (this.field2123 < 0) {
                if (this.field2116) {
                    if (this.field2113 < 0) {
                        var9 = this.method715(arg0, arg1, var5, var10, var4.field2757[this.field2112]);
                        if (this.field2111 >= var5) {
                            return;
                        }
                        this.field2111 = var5 + var5 - 1 - this.field2111;
                        this.field2113 = -this.field2113;
                    }
                    while (true) {
                        int var11 = this.method714(arg0, var9, var6, var10, var4.field2757[this.field2120 - 1]);
                        if (this.field2111 < var6) {
                            return;
                        }
                        this.field2111 = var6 + var6 - 1 - this.field2111;
                        this.field2113 = -this.field2113;
                        var9 = this.method715(arg0, var11, var5, var10, var4.field2757[this.field2112]);
                        if (this.field2111 >= var5) {
                            return;
                        }
                        this.field2111 = var5 + var5 - 1 - this.field2111;
                        this.field2113 = -this.field2113;
                    }
                } else if (this.field2113 < 0) {
                    while (true) {
                        var9 = this.method715(arg0, var9, var5, var10, var4.field2757[this.field2120 - 1]);
                        if (this.field2111 >= var5) {
                            return;
                        }
                        this.field2111 = var6 - 1 - (var6 - 1 - this.field2111) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method714(arg0, var9, var6, var10, var4.field2757[this.field2112]);
                        if (this.field2111 < var6) {
                            return;
                        }
                        this.field2111 = (this.field2111 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2123 > 0) {
                    if (this.field2116) {
                        label130: {
                            if (this.field2113 < 0) {
                                var9 = this.method715(arg0, arg1, var5, var10, var4.field2757[this.field2112]);
                                if (this.field2111 >= var5) {
                                    return;
                                }
                                this.field2111 = var5 + var5 - 1 - this.field2111;
                                this.field2113 = -this.field2113;
                                if (--this.field2123 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method714(arg0, var9, var6, var10, var4.field2757[this.field2120 - 1]);
                                if (this.field2111 < var6) {
                                    return;
                                }
                                this.field2111 = var6 + var6 - 1 - this.field2111;
                                this.field2113 = -this.field2113;
                                if (--this.field2123 == 0) {
                                    break;
                                }
                                var9 = this.method715(arg0, var9, var5, var10, var4.field2757[this.field2112]);
                                if (this.field2111 >= var5) {
                                    return;
                                }
                                this.field2111 = var5 + var5 - 1 - this.field2111;
                                this.field2113 = -this.field2113;
                            } while (--this.field2123 != 0);
                        }
                    } else if (this.field2113 < 0) {
                        while (true) {
                            var9 = this.method715(arg0, var9, var5, var10, var4.field2757[this.field2120 - 1]);
                            if (this.field2111 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2111) / var8;
                            if (var12 >= this.field2123) {
                                this.field2111 += this.field2123 * var8;
                                this.field2123 = 0;
                                break;
                            }
                            this.field2111 += var8 * var12;
                            this.field2123 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method714(arg0, var9, var6, var10, var4.field2757[this.field2112]);
                            if (this.field2111 < var6) {
                                return;
                            }
                            int var13 = (this.field2111 - var5) / var8;
                            if (var13 >= this.field2123) {
                                this.field2111 -= this.field2123 * var8;
                                this.field2123 = 0;
                                break;
                            }
                            this.field2111 -= var8 * var13;
                            this.field2123 -= var13;
                        }
                    }
                }
                if (this.field2113 < 0) {
                    this.method715(arg0, var9, 0, var10, 0);
                    if (this.field2111 < 0) {
                        this.field2111 = -1;
                        this.method712();
                        this.method115(26851);
                        return;
                    }
                } else {
                    this.method714(arg0, var9, var7, var10, 0);
                    if (this.field2111 >= var7) {
                        this.field2111 = var7;
                        this.method712();
                        this.method115(26851);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "()V")
    private final void method712() {
        if (this.field2122 != 0) {
            if (this.field2115 == Integer.MIN_VALUE) {
                this.field2115 = 0;
            }
            this.field2122 = 0;
            this.method710();
        }
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "()Z")
    public final boolean method713() {
        return this.field2111 < 0 || this.field2111 >= ((class125) super.field407).field2757.length << 8;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII)I")
    private final int method714(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2122 <= 0) {
                if (this.field2113 == 256 && (this.field2111 & 255) == 0) {
                    if (class41.field765) {
                        return method718(0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, 0, arg3, arg2, this);
                    }
                    return method699(((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, 0, arg3, arg2, this);
                }
                if (class41.field765) {
                    return method722(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, 0, arg3, arg2, this, this.field2113, arg4);
                }
                return method716(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, 0, arg3, arg2, this, this.field2113, arg4);
            }
            int var6 = this.field2122 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2122 += arg1;
            if (this.field2113 == 256 && (this.field2111 & 255) == 0) {
                if (class41.field765) {
                    arg1 = method695(0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, this.field2117, this.field2121, 0, var6, arg2, this);
                } else {
                    arg1 = method701(((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, this.field2119, 0, var6, arg2, this);
                }
            } else if (class41.field765) {
                arg1 = method693(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, this.field2117, this.field2121, 0, var6, arg2, this, this.field2113, arg4);
            } else {
                arg1 = method694(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, this.field2119, 0, var6, arg2, this, this.field2113, arg4);
            }
            this.field2122 -= arg1;
            if (this.field2122 != 0) {
                return arg1;
            }
        } while (!this.method729());
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([IIIII)I")
    private final int method715(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2122 <= 0) {
                if (this.field2113 == -256 && (this.field2111 & 255) == 0) {
                    if (class41.field765) {
                        return method697(0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, 0, arg3, arg2, this);
                    }
                    return method707(((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, 0, arg3, arg2, this);
                }
                if (class41.field765) {
                    return method728(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, 0, arg3, arg2, this, this.field2113, arg4);
                }
                return method709(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, 0, arg3, arg2, this, this.field2113, arg4);
            }
            int var6 = this.field2122 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2122 += arg1;
            if (this.field2113 == -256 && (this.field2111 & 255) == 0) {
                if (class41.field765) {
                    arg1 = method706(0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, this.field2117, this.field2121, 0, var6, arg2, this);
                } else {
                    arg1 = method692(((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, this.field2119, 0, var6, arg2, this);
                }
            } else if (class41.field765) {
                arg1 = method721(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2110, this.field2114, this.field2117, this.field2121, 0, var6, arg2, this, this.field2113, arg4);
            } else {
                arg1 = method708(0, 0, ((class125) super.field407).field2757, arg0, this.field2111, arg1, this.field2109, this.field2119, 0, var6, arg2, this, this.field2113, arg4);
            }
            this.field2122 -= arg1;
            if (this.field2122 != 0) {
                return arg1;
            }
        } while (!this.method729());
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()I")
    public final int method154() {
        return this.field2115 == 0 && this.field2122 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II[B[IIIIIIILnd;II)I")
    private static final int method716(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10, int arg11, int arg12) {
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
        arg10.field2111 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ls;II)Lnd;")
    public static final class94 method717(class125 arg0, int arg1, int arg2) {
        return arg0.field2757 != null && arg0.field2757.length != 0 ? new class94(arg0, (int) ((long) arg0.field2753 * 256L * (long) arg1 / (long) (class84.field1873 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[B[IIIIIIIILnd;)I")
    private static final int method718(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class94 arg10) {
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
        arg10.field2111 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)V")
    private final synchronized void method719(int arg0, int arg1) {
        this.field2115 = arg0;
        this.field2118 = arg1;
        this.field2122 = 0;
        this.method710();
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V")
    public final synchronized void method720(int arg0) {
        if (this.field2113 < 0) {
            this.field2113 = -arg0;
        } else {
            this.field2113 = arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II[B[IIIIIIIIIILnd;II)I")
    private static final int method721(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13, int arg14, int arg15) {
        arg13.field2109 -= arg13.field2119 * arg5;
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
        arg13.field2109 += arg13.field2119 * var22;
        arg13.field2110 = arg6;
        arg13.field2114 = arg7;
        arg13.field2111 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II[B[IIIIIIIILnd;II)I")
    private static final int method722(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
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
        arg11.field2111 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "()I")
    public final synchronized int method723() {
        return this.field2115 == Integer.MIN_VALUE ? 0 : this.field2115;
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "()I")
    public final synchronized int method724() {
        return this.field2118 < 0 ? -1 : this.field2118;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
    public final synchronized void method725(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method719(arg1, arg2);
        } else {
            int var4 = method705(arg1, arg2);
            int var5 = method727(arg1, arg2);
            if (this.field2110 == var4 && this.field2114 == var5) {
                this.field2122 = 0;
            } else {
                int var6 = arg1 - this.field2109;
                if (this.field2109 - arg1 > var6) {
                    var6 = this.field2109 - arg1;
                }
                if (var4 - this.field2110 > var6) {
                    var6 = var4 - this.field2110;
                }
                if (this.field2110 - var4 > var6) {
                    var6 = this.field2110 - var4;
                }
                if (var5 - this.field2114 > var6) {
                    var6 = var5 - this.field2114;
                }
                if (this.field2114 - var5 > var6) {
                    var6 = this.field2114 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2122 = arg0;
                this.field2115 = arg1;
                this.field2118 = arg2;
                this.field2119 = (arg1 - this.field2109) / arg0;
                this.field2117 = (var4 - this.field2110) / arg0;
                this.field2121 = (var5 - this.field2114) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
    private final synchronized void method726(int arg0) {
        this.method719(arg0, this.method724());
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)I")
    private static final int method727(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II[B[IIIIIIIILnd;II)I")
    private static final int method728(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class94 arg11, int arg12, int arg13) {
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
        arg11.field2111 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "()Z")
    private final boolean method729() {
        int var1 = this.field2115;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method705(var1, this.field2118);
            var2 = method727(var1, this.field2118);
        }
        if (this.field2109 == var1 && this.field2110 == var3 && this.field2114 == var2) {
            if (this.field2115 == Integer.MIN_VALUE) {
                this.field2115 = 0;
                this.field2109 = this.field2110 = this.field2114 = 0;
                this.method115(26851);
                return true;
            } else {
                this.method710();
                return false;
            }
        } else {
            if (this.field2109 < var1) {
                this.field2119 = 1;
                this.field2122 = var1 - this.field2109;
            } else if (this.field2109 > var1) {
                this.field2119 = -1;
                this.field2122 = this.field2109 - var1;
            } else {
                this.field2119 = 0;
            }
            if (this.field2110 < var3) {
                this.field2117 = 1;
                if (this.field2122 == 0 || this.field2122 > var3 - this.field2110) {
                    this.field2122 = var3 - this.field2110;
                }
            } else if (this.field2110 > var3) {
                this.field2117 = -1;
                if (this.field2122 == 0 || this.field2122 > this.field2110 - var3) {
                    this.field2122 = this.field2110 - var3;
                }
            } else {
                this.field2117 = 0;
            }
            if (this.field2114 < var2) {
                this.field2121 = 1;
                if (this.field2122 == 0 || this.field2122 > var2 - this.field2114) {
                    this.field2122 = var2 - this.field2114;
                }
            } else if (this.field2114 > var2) {
                this.field2121 = -1;
                if (this.field2122 == 0 || this.field2122 > this.field2114 - var2) {
                    this.field2122 = this.field2114 - var2;
                }
            } else {
                this.field2121 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)V")
    public final synchronized void method730(int arg0) {
        this.field2123 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ls;II)V")
    private class94(class125 arg0, int arg1, int arg2) {
        super.field407 = arg0;
        this.field2112 = arg0.field2754;
        this.field2120 = arg0.field2756;
        this.field2116 = arg0.field2755;
        this.field2113 = arg1;
        this.field2115 = arg2;
        this.field2118 = 8192;
        this.field2111 = 0;
        this.method710();
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ls;III)V")
    private class94(class125 arg0, int arg1, int arg2, int arg3) {
        super.field407 = arg0;
        this.field2112 = arg0.field2754;
        this.field2120 = arg0.field2756;
        this.field2116 = arg0.field2755;
        this.field2113 = arg1;
        this.field2115 = arg2;
        this.field2118 = arg3;
        this.field2111 = 0;
        this.method710();
    }
}
