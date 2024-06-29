import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class24 extends class203 {

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Z")
    private boolean field283;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
    public final synchronized void method120(int[] arg0, int arg1, int arg2) {
        if (this.field279 == 0 && this.field278 == 0) {
            this.method153(arg2);
        } else {
            class220 var4 = (class220) super.field3535;
            int var5 = this.field286 << 8;
            int var6 = this.field285 << 8;
            int var7 = var4.field3788.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field284 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field292 < 0) {
                if (this.field288 <= 0) {
                    this.method121();
                    this.method1234(17216);
                    return;
                }
                this.field292 = 0;
            }
            if (this.field292 >= var7) {
                if (this.field288 >= 0) {
                    this.method121();
                    this.method1234(17216);
                    return;
                }
                this.field292 = var7 - 1;
            }
            if (this.field284 < 0) {
                if (this.field283) {
                    if (this.field288 < 0) {
                        var9 = this.method159(arg0, arg1, var5, var10, var4.field3788[this.field286]);
                        if (this.field292 >= var5) {
                            return;
                        }
                        this.field292 = var5 + var5 - 1 - this.field292;
                        this.field288 = -this.field288;
                    }
                    while (true) {
                        int var11 = this.method158(arg0, var9, var6, var10, var4.field3788[this.field285 - 1]);
                        if (this.field292 < var6) {
                            return;
                        }
                        this.field292 = var6 + var6 - 1 - this.field292;
                        this.field288 = -this.field288;
                        var9 = this.method159(arg0, var11, var5, var10, var4.field3788[this.field286]);
                        if (this.field292 >= var5) {
                            return;
                        }
                        this.field292 = var5 + var5 - 1 - this.field292;
                        this.field288 = -this.field288;
                    }
                } else if (this.field288 < 0) {
                    while (true) {
                        var9 = this.method159(arg0, var9, var5, var10, var4.field3788[this.field285 - 1]);
                        if (this.field292 >= var5) {
                            return;
                        }
                        this.field292 = var6 - 1 - (var6 - 1 - this.field292) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method158(arg0, var9, var6, var10, var4.field3788[this.field286]);
                        if (this.field292 < var6) {
                            return;
                        }
                        this.field292 = (this.field292 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field284 > 0) {
                    if (this.field283) {
                        label130: {
                            if (this.field288 < 0) {
                                var9 = this.method159(arg0, arg1, var5, var10, var4.field3788[this.field286]);
                                if (this.field292 >= var5) {
                                    return;
                                }
                                this.field292 = var5 + var5 - 1 - this.field292;
                                this.field288 = -this.field288;
                                if (--this.field284 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method158(arg0, var9, var6, var10, var4.field3788[this.field285 - 1]);
                                if (this.field292 < var6) {
                                    return;
                                }
                                this.field292 = var6 + var6 - 1 - this.field292;
                                this.field288 = -this.field288;
                                if (--this.field284 == 0) {
                                    break;
                                }
                                var9 = this.method159(arg0, var9, var5, var10, var4.field3788[this.field286]);
                                if (this.field292 >= var5) {
                                    return;
                                }
                                this.field292 = var5 + var5 - 1 - this.field292;
                                this.field288 = -this.field288;
                            } while (--this.field284 != 0);
                        }
                    } else if (this.field288 < 0) {
                        while (true) {
                            var9 = this.method159(arg0, var9, var5, var10, var4.field3788[this.field285 - 1]);
                            if (this.field292 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field292) / var8;
                            if (var12 >= this.field284) {
                                this.field292 += this.field284 * var8;
                                this.field284 = 0;
                                break;
                            }
                            this.field292 += var8 * var12;
                            this.field284 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method158(arg0, var9, var6, var10, var4.field3788[this.field286]);
                            if (this.field292 < var6) {
                                return;
                            }
                            int var13 = (this.field292 - var5) / var8;
                            if (var13 >= this.field284) {
                                this.field292 -= this.field284 * var8;
                                this.field284 = 0;
                                break;
                            }
                            this.field292 -= var8 * var13;
                            this.field284 -= var13;
                        }
                    }
                }
                if (this.field288 < 0) {
                    this.method159(arg0, var9, 0, var10, 0);
                    if (this.field292 < 0) {
                        this.field292 = -1;
                        this.method121();
                        this.method1234(17216);
                        return;
                    }
                } else {
                    this.method158(arg0, var9, var7, var10, 0);
                    if (this.field292 >= var7) {
                        this.field292 = var7;
                        this.method121();
                        this.method1234(17216);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
    private final void method121() {
        if (this.field278 != 0) {
            if (this.field279 == Integer.MIN_VALUE) {
                this.field279 = 0;
            }
            this.field278 = 0;
            this.method144();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B[IIIIIIILwb;)I")
    private static final int method122(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class24 arg8) {
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
        arg8.field292 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    private final synchronized void method123(int arg0) {
        this.method151(arg0, this.method130());
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public final synchronized void method124(int arg0) {
        this.field284 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "()Z")
    private final boolean method125() {
        int var1 = this.field279;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method131(var1, this.field280);
            var2 = method126(var1, this.field280);
        }
        if (this.field289 == var1 && this.field287 == var3 && this.field291 == var2) {
            if (this.field279 == Integer.MIN_VALUE) {
                this.field279 = 0;
                this.field289 = this.field287 = this.field291 = 0;
                this.method1234(17216);
                return true;
            } else {
                this.method144();
                return false;
            }
        } else {
            if (this.field289 < var1) {
                this.field282 = 1;
                this.field278 = var1 - this.field289;
            } else if (this.field289 > var1) {
                this.field282 = -1;
                this.field278 = this.field289 - var1;
            } else {
                this.field282 = 0;
            }
            if (this.field287 < var3) {
                this.field290 = 1;
                if (this.field278 == 0 || this.field278 > var3 - this.field287) {
                    this.field278 = var3 - this.field287;
                }
            } else if (this.field287 > var3) {
                this.field290 = -1;
                if (this.field278 == 0 || this.field278 > this.field287 - var3) {
                    this.field278 = this.field287 - var3;
                }
            } else {
                this.field290 = 0;
            }
            if (this.field291 < var2) {
                this.field281 = 1;
                if (this.field278 == 0 || this.field278 > var2 - this.field291) {
                    this.field278 = var2 - this.field291;
                }
            } else if (this.field291 > var2) {
                this.field281 = -1;
                if (this.field278 == 0 || this.field278 > this.field291 - var2) {
                    this.field278 = this.field291 - var2;
                }
            } else {
                this.field281 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
    private static final int method126(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIILwb;II)I")
    private static final int method127(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10, int arg11, int arg12) {
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
        arg10.field292 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public final synchronized void method128(int arg0) {
        this.method151(arg0 << 6, this.method130());
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "()Z")
    public final boolean method129() {
        return this.field292 < 0 || this.field292 >= ((class220) super.field3535).field3788.length << 8;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "()I")
    public final synchronized int method130() {
        return this.field280 < 0 ? -1 : this.field280;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
    private static final int method131(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B[IIIIIIIIIILwb;)I")
    private static final int method132(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class24 arg12) {
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
        arg12.field289 += (var19 - arg4) * arg12.field282;
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
        arg12.field287 = var15 >> 2;
        arg12.field291 = var16 >> 2;
        arg12.field292 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
    public final int method133() {
        return this.field279 == 0 && this.field278 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public final synchronized void method134(boolean arg0) {
        this.field288 = (this.field288 >>> 31) + (this.field288 ^ this.field288 >> 31);
        if (arg0) {
            this.field288 = -this.field288;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Llc;")
    public final class203 method135() {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIIIIILwb;II)I")
    private static final int method136(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class24 arg13, int arg14, int arg15) {
        arg13.field289 -= arg13.field282 * arg5;
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
        arg13.field289 += arg13.field282 * var22;
        arg13.field287 = arg6;
        arg13.field291 = arg7;
        arg13.field292 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([B[IIIIIIIILwb;)I")
    private static final int method137(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class24 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field287 += (var14 - arg3) * arg9.field290;
        arg9.field291 += (var14 - arg3) * arg9.field281;
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
        arg9.field289 = var12 >> 2;
        arg9.field292 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "()I")
    public final synchronized int method138() {
        return this.field288 < 0 ? -this.field288 : this.field288;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkh;II)Lwb;")
    public static final class24 method139(class220 arg0, int arg1, int arg2) {
        return arg0.field3788 != null && arg0.field3788.length != 0 ? new class24(arg0, (int) ((long) arg0.field3790 * 256L * (long) arg1 / (long) (class87.field1357 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B[IIIIIIIILwb;)I")
    private static final int method140(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10) {
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
        arg10.field292 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "()I")
    public final synchronized int method141() {
        return this.field279 == Integer.MIN_VALUE ? 0 : this.field279;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public final synchronized void method142(int arg0) {
        int var2 = ((class220) super.field3535).field3788.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field292 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final synchronized void method143(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method151(arg1, arg2);
        } else {
            int var4 = method131(arg1, arg2);
            int var5 = method126(arg1, arg2);
            if (this.field287 == var4 && this.field291 == var5) {
                this.field278 = 0;
            } else {
                int var6 = arg1 - this.field289;
                if (this.field289 - arg1 > var6) {
                    var6 = this.field289 - arg1;
                }
                if (var4 - this.field287 > var6) {
                    var6 = var4 - this.field287;
                }
                if (this.field287 - var4 > var6) {
                    var6 = this.field287 - var4;
                }
                if (var5 - this.field291 > var6) {
                    var6 = var5 - this.field291;
                }
                if (this.field291 - var5 > var6) {
                    var6 = this.field291 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field278 = arg0;
                this.field279 = arg1;
                this.field280 = arg2;
                this.field282 = (arg1 - this.field289) / arg0;
                this.field290 = (var4 - this.field287) / arg0;
                this.field281 = (var5 - this.field291) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "()V")
    private final void method144() {
        this.field289 = this.field279;
        this.field287 = method131(this.field279, this.field280);
        this.field291 = method126(this.field279, this.field280);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method145(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
        arg11.field287 -= arg11.field290 * arg5;
        arg11.field291 -= arg11.field281 * arg5;
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
        arg11.field287 += arg11.field290 * arg5;
        arg11.field291 += arg11.field281 * arg5;
        arg11.field289 = arg6;
        arg11.field292 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIILwb;II)I")
    private static final int method146(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10, int arg11, int arg12) {
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
        arg10.field292 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method147(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
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
        arg11.field292 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I[B[IIIIIIIIIILwb;)I")
    private static final int method148(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class24 arg12) {
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
        arg12.field289 += (var19 - arg4) * arg12.field282;
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
        arg12.field287 = var15 >> 2;
        arg12.field291 = var16 >> 2;
        arg12.field292 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method149(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
        arg11.field287 -= arg11.field290 * arg5;
        arg11.field291 -= arg11.field281 * arg5;
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
        arg11.field287 += arg11.field290 * arg5;
        arg11.field291 += arg11.field281 * arg5;
        arg11.field289 = arg6;
        arg11.field292 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()Llc;")
    public final class203 method150() {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
    private final synchronized void method151(int arg0, int arg1) {
        this.field279 = arg0;
        this.field280 = arg1;
        this.field278 = 0;
        this.method144();
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I[B[IIIIIIIILwb;)I")
    private static final int method152(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10) {
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
        arg10.field292 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public final synchronized void method153(int arg0) {
        if (this.field278 > 0) {
            if (arg0 >= this.field278) {
                if (this.field279 == Integer.MIN_VALUE) {
                    this.field279 = 0;
                    this.field289 = this.field287 = this.field291 = 0;
                    this.method1234(17216);
                    arg0 = this.field278;
                }
                this.field278 = 0;
                this.method144();
            } else {
                this.field289 += this.field282 * arg0;
                this.field287 += this.field290 * arg0;
                this.field291 += this.field281 * arg0;
                this.field278 -= arg0;
            }
        }
        class220 var2 = (class220) super.field3535;
        int var3 = this.field286 << 8;
        int var4 = this.field285 << 8;
        int var5 = var2.field3788.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field284 = 0;
        }
        if (this.field292 < 0) {
            if (this.field288 <= 0) {
                this.method121();
                this.method1234(17216);
                return;
            }
            this.field292 = 0;
        }
        if (this.field292 >= var5) {
            if (this.field288 >= 0) {
                this.method121();
                this.method1234(17216);
                return;
            }
            this.field292 = var5 - 1;
        }
        this.field292 += this.field288 * arg0;
        if (this.field284 < 0) {
            if (!this.field283) {
                if (this.field288 < 0) {
                    if (this.field292 < var3) {
                        this.field292 = var4 - 1 - (var4 - 1 - this.field292) % var6;
                    }
                } else if (this.field292 >= var4) {
                    this.field292 = (this.field292 - var3) % var6 + var3;
                }
            } else {
                if (this.field288 < 0) {
                    if (this.field292 >= var3) {
                        return;
                    }
                    this.field292 = var3 + var3 - 1 - this.field292;
                    this.field288 = -this.field288;
                }
                while (this.field292 >= var4) {
                    this.field292 = var4 + var4 - 1 - this.field292;
                    this.field288 = -this.field288;
                    if (this.field292 >= var3) {
                        return;
                    }
                    this.field292 = var3 + var3 - 1 - this.field292;
                    this.field288 = -this.field288;
                }
            }
        } else {
            if (this.field284 > 0) {
                if (this.field283) {
                    label125: {
                        if (this.field288 < 0) {
                            if (this.field292 >= var3) {
                                return;
                            }
                            this.field292 = var3 + var3 - 1 - this.field292;
                            this.field288 = -this.field288;
                            if (--this.field284 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field292 < var4) {
                                return;
                            }
                            this.field292 = var4 + var4 - 1 - this.field292;
                            this.field288 = -this.field288;
                            if (--this.field284 == 0) {
                                break;
                            }
                            if (this.field292 >= var3) {
                                return;
                            }
                            this.field292 = var3 + var3 - 1 - this.field292;
                            this.field288 = -this.field288;
                        } while (--this.field284 != 0);
                    }
                } else if (this.field288 < 0) {
                    if (this.field292 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field292) / var6;
                    if (var7 < this.field284) {
                        this.field292 += var6 * var7;
                        this.field284 -= var7;
                        return;
                    }
                    this.field292 += this.field284 * var6;
                    this.field284 = 0;
                } else {
                    if (this.field292 < var4) {
                        return;
                    }
                    int var8 = (this.field292 - var3) / var6;
                    if (var8 < this.field284) {
                        this.field292 -= var6 * var8;
                        this.field284 -= var8;
                        return;
                    }
                    this.field292 -= this.field284 * var6;
                    this.field284 = 0;
                }
            }
            if (this.field288 < 0) {
                if (this.field292 < 0) {
                    this.field292 = -1;
                    this.method121();
                    this.method1234(17216);
                    return;
                }
            } else if (this.field292 >= var5) {
                this.field292 = var5;
                this.method121();
                this.method1234(17216);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B[IIIIIIILwb;)I")
    private static final int method154(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class24 arg8) {
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
        arg8.field292 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II[B[IIIIIIIILwb;II)I")
    private static final int method155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class24 arg11, int arg12, int arg13) {
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
        arg11.field292 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II[B[IIIIIIIIIILwb;II)I")
    private static final int method156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class24 arg13, int arg14, int arg15) {
        arg13.field289 -= arg13.field282 * arg5;
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
        arg13.field289 += arg13.field282 * var22;
        arg13.field287 = arg6;
        arg13.field291 = arg7;
        arg13.field292 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public final synchronized void method157(int arg0) {
        if (this.field288 < 0) {
            this.field288 = -arg0;
        } else {
            this.field288 = arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)I")
    private final int method158(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field278 <= 0) {
                if (this.field288 == 256 && (this.field292 & 255) == 0) {
                    if (class247.field4280) {
                        return method140(0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, 0, arg3, arg2, this);
                    }
                    return method154(((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, 0, arg3, arg2, this);
                }
                if (class247.field4280) {
                    return method155(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, 0, arg3, arg2, this, this.field288, arg4);
                }
                return method127(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, 0, arg3, arg2, this, this.field288, arg4);
            }
            int var6 = this.field278 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field278 += arg1;
            if (this.field288 == 256 && (this.field292 & 255) == 0) {
                if (class247.field4280) {
                    arg1 = method132(0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, this.field290, this.field281, 0, var6, arg2, this);
                } else {
                    arg1 = method137(((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, this.field282, 0, var6, arg2, this);
                }
            } else if (class247.field4280) {
                arg1 = method136(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, this.field290, this.field281, 0, var6, arg2, this, this.field288, arg4);
            } else {
                arg1 = method145(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, this.field282, 0, var6, arg2, this, this.field288, arg4);
            }
            this.field278 -= arg1;
            if (this.field278 != 0) {
                return arg1;
            }
        } while (!this.method125());
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([IIIII)I")
    private final int method159(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field278 <= 0) {
                if (this.field288 == -256 && (this.field292 & 255) == 0) {
                    if (class247.field4280) {
                        return method152(0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, 0, arg3, arg2, this);
                    }
                    return method122(((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, 0, arg3, arg2, this);
                }
                if (class247.field4280) {
                    return method147(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, 0, arg3, arg2, this, this.field288, arg4);
                }
                return method146(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, 0, arg3, arg2, this, this.field288, arg4);
            }
            int var6 = this.field278 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field278 += arg1;
            if (this.field288 == -256 && (this.field292 & 255) == 0) {
                if (class247.field4280) {
                    arg1 = method148(0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, this.field290, this.field281, 0, var6, arg2, this);
                } else {
                    arg1 = method161(((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, this.field282, 0, var6, arg2, this);
                }
            } else if (class247.field4280) {
                arg1 = method156(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field287, this.field291, this.field290, this.field281, 0, var6, arg2, this, this.field288, arg4);
            } else {
                arg1 = method149(0, 0, ((class220) super.field3535).field3788, arg0, this.field292, arg1, this.field289, this.field282, 0, var6, arg2, this, this.field288, arg4);
            }
            this.field278 -= arg1;
            if (this.field278 != 0) {
                return arg1;
            }
        } while (!this.method125());
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
    public final int method160() {
        int var1 = this.field289 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field284 == 0) {
            var2 -= this.field292 * var2 / (((class220) super.field3535).field3788.length << 8);
        } else if (this.field284 >= 0) {
            var2 -= this.field286 * var2 / ((class220) super.field3535).field3788.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([B[IIIIIIIILwb;)I")
    private static final int method161(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class24 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field287 += (var14 - arg3) * arg9.field290;
        arg9.field291 += (var14 - arg3) * arg9.field281;
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
        arg9.field289 = var12 >> 2;
        arg9.field292 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
    public final synchronized void method162(int arg0, int arg1) {
        this.method143(arg0, arg1, this.method130());
    }

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "()Z")
    public final boolean method163() {
        return this.field278 != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkh;III)Lwb;")
    public static final class24 method164(class220 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3788 != null && arg0.field3788.length != 0 ? new class24(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lkh;II)V")
    private class24(class220 arg0, int arg1, int arg2) {
        super.field3535 = arg0;
        this.field286 = arg0.field3791;
        this.field285 = arg0.field3787;
        this.field283 = arg0.field3789;
        this.field288 = arg1;
        this.field279 = arg2;
        this.field280 = 8192;
        this.field292 = 0;
        this.method144();
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
    public final synchronized void method165(int arg0) {
        if (arg0 == 0) {
            this.method123(0);
            this.method1234(17216);
        } else if (this.field287 == 0 && this.field291 == 0) {
            this.field278 = 0;
            this.field279 = 0;
            this.field289 = 0;
            this.method1234(17216);
        } else {
            int var2 = -this.field289;
            if (this.field289 > var2) {
                var2 = this.field289;
            }
            if (-this.field287 > var2) {
                var2 = -this.field287;
            }
            if (this.field287 > var2) {
                var2 = this.field287;
            }
            if (-this.field291 > var2) {
                var2 = -this.field291;
            }
            if (this.field291 > var2) {
                var2 = this.field291;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field278 = arg0;
            this.field279 = Integer.MIN_VALUE;
            this.field282 = -this.field289 / arg0;
            this.field290 = -this.field287 / arg0;
            this.field281 = -this.field291 / arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lkh;III)V")
    private class24(class220 arg0, int arg1, int arg2, int arg3) {
        super.field3535 = arg0;
        this.field286 = arg0.field3791;
        this.field285 = arg0.field3787;
        this.field283 = arg0.field3789;
        this.field288 = arg1;
        this.field279 = arg2;
        this.field280 = arg3;
        this.field292 = 0;
        this.method144();
    }
}
