import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class164 extends class156 {

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    private int field3357;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field3353;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Z")
    private boolean field3362;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    private int field3354;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    private int field3351;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    private int field3349;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    private int field3350;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    private int field3355;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    private int field3356;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    private int field3358;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    private int field3359;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    private int field3361;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "()Z")
    private final boolean method1062() {
        int var1 = this.field3354;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1073(var1, this.field3351);
            var2 = method1067(var1, this.field3351);
        }
        if (this.field3355 == var1 && this.field3359 == var3 && this.field3350 == var2) {
            if (this.field3354 == Integer.MIN_VALUE) {
                this.field3354 = 0;
                this.field3355 = this.field3359 = this.field3350 = 0;
                this.method630(31);
                return true;
            } else {
                this.method1096();
                return false;
            }
        } else {
            if (this.field3355 < var1) {
                this.field3361 = 1;
                this.field3363 = var1 - this.field3355;
            } else if (this.field3355 > var1) {
                this.field3361 = -1;
                this.field3363 = this.field3355 - var1;
            } else {
                this.field3361 = 0;
            }
            if (this.field3359 < var3) {
                this.field3356 = 1;
                if (this.field3363 == 0 || this.field3363 > var3 - this.field3359) {
                    this.field3363 = var3 - this.field3359;
                }
            } else if (this.field3359 > var3) {
                this.field3356 = -1;
                if (this.field3363 == 0 || this.field3363 > this.field3359 - var3) {
                    this.field3363 = this.field3359 - var3;
                }
            } else {
                this.field3356 = 0;
            }
            if (this.field3350 < var2) {
                this.field3349 = 1;
                if (this.field3363 == 0 || this.field3363 > var2 - this.field3350) {
                    this.field3363 = var2 - this.field3350;
                }
            } else if (this.field3350 > var2) {
                this.field3349 = -1;
                if (this.field3363 == 0 || this.field3363 > this.field3350 - var2) {
                    this.field3363 = this.field3350 - var2;
                }
            } else {
                this.field3349 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[B[IIIIIIIIIILrg;II)I")
    private static final int method1063(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class164 arg13, int arg14, int arg15) {
        arg13.field3355 -= arg13.field3361 * arg5;
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
        arg13.field3355 += arg13.field3361 * var22;
        arg13.field3359 = arg6;
        arg13.field3350 = arg7;
        arg13.field3360 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[B[IIIIIIIIIILrg;)I")
    private static final int method1064(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class164 arg12) {
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
        arg12.field3355 += (var19 - arg4) * arg12.field3361;
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
        arg12.field3359 = var15 >> 2;
        arg12.field3350 = var16 >> 2;
        arg12.field3360 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()Lqh;")
    public final class156 method276() {
        return null;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "()Z")
    public final boolean method1065() {
        return this.field3360 < 0 || this.field3360 >= ((class153) super.field3220).field3173.length << 8;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()I")
    public final int method998() {
        int var1 = this.field3355 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3358 == 0) {
            var2 -= this.field3360 * var2 / (((class153) super.field3220).field3173.length << 8);
        } else if (this.field3358 >= 0) {
            var2 -= this.field3357 * var2 / ((class153) super.field3220).field3173.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "()I")
    public final synchronized int method1066() {
        return this.field3351 < 0 ? -1 : this.field3351;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)I")
    private static final int method1067(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[B[IIIIIIIILrg;II)I")
    private static final int method1068(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class164 arg11, int arg12, int arg13) {
        arg11.field3359 -= arg11.field3356 * arg5;
        arg11.field3350 -= arg11.field3349 * arg5;
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
        arg11.field3359 += arg11.field3356 * arg5;
        arg11.field3350 += arg11.field3349 * arg5;
        arg11.field3355 = arg6;
        arg11.field3360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([B[IIIIIIILrg;)I")
    private static final int method1069(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164 arg8) {
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
        arg8.field3360 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "([III)V")
    public final synchronized void method277(int[] arg0, int arg1, int arg2) {
        if (this.field3354 == 0 && this.field3363 == 0) {
            this.method283(arg2);
        } else {
            class153 var4 = (class153) super.field3220;
            int var5 = this.field3357 << 8;
            int var6 = this.field3353 << 8;
            int var7 = var4.field3173.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3358 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3360 < 0) {
                if (this.field3352 <= 0) {
                    this.method1076();
                    this.method630(94);
                    return;
                }
                this.field3360 = 0;
            }
            if (this.field3360 >= var7) {
                if (this.field3352 >= 0) {
                    this.method1076();
                    this.method630(51);
                    return;
                }
                this.field3360 = var7 - 1;
            }
            if (this.field3358 < 0) {
                if (this.field3362) {
                    if (this.field3352 < 0) {
                        var9 = this.method1074(arg0, arg1, var5, var10, var4.field3173[this.field3357]);
                        if (this.field3360 >= var5) {
                            return;
                        }
                        this.field3360 = var5 + var5 - 1 - this.field3360;
                        this.field3352 = -this.field3352;
                    }
                    while (true) {
                        int var11 = this.method1100(arg0, var9, var6, var10, var4.field3173[this.field3353 - 1]);
                        if (this.field3360 < var6) {
                            return;
                        }
                        this.field3360 = var6 + var6 - 1 - this.field3360;
                        this.field3352 = -this.field3352;
                        var9 = this.method1074(arg0, var11, var5, var10, var4.field3173[this.field3357]);
                        if (this.field3360 >= var5) {
                            return;
                        }
                        this.field3360 = var5 + var5 - 1 - this.field3360;
                        this.field3352 = -this.field3352;
                    }
                } else if (this.field3352 < 0) {
                    while (true) {
                        var9 = this.method1074(arg0, var9, var5, var10, var4.field3173[this.field3353 - 1]);
                        if (this.field3360 >= var5) {
                            return;
                        }
                        this.field3360 = var6 - 1 - (var6 - 1 - this.field3360) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1100(arg0, var9, var6, var10, var4.field3173[this.field3357]);
                        if (this.field3360 < var6) {
                            return;
                        }
                        this.field3360 = (this.field3360 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3358 > 0) {
                    if (this.field3362) {
                        label130: {
                            if (this.field3352 < 0) {
                                var9 = this.method1074(arg0, arg1, var5, var10, var4.field3173[this.field3357]);
                                if (this.field3360 >= var5) {
                                    return;
                                }
                                this.field3360 = var5 + var5 - 1 - this.field3360;
                                this.field3352 = -this.field3352;
                                if (--this.field3358 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1100(arg0, var9, var6, var10, var4.field3173[this.field3353 - 1]);
                                if (this.field3360 < var6) {
                                    return;
                                }
                                this.field3360 = var6 + var6 - 1 - this.field3360;
                                this.field3352 = -this.field3352;
                                if (--this.field3358 == 0) {
                                    break;
                                }
                                var9 = this.method1074(arg0, var9, var5, var10, var4.field3173[this.field3357]);
                                if (this.field3360 >= var5) {
                                    return;
                                }
                                this.field3360 = var5 + var5 - 1 - this.field3360;
                                this.field3352 = -this.field3352;
                            } while (--this.field3358 != 0);
                        }
                    } else if (this.field3352 < 0) {
                        while (true) {
                            var9 = this.method1074(arg0, var9, var5, var10, var4.field3173[this.field3353 - 1]);
                            if (this.field3360 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3360) / var8;
                            if (var12 >= this.field3358) {
                                this.field3360 += this.field3358 * var8;
                                this.field3358 = 0;
                                break;
                            }
                            this.field3360 += var8 * var12;
                            this.field3358 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1100(arg0, var9, var6, var10, var4.field3173[this.field3357]);
                            if (this.field3360 < var6) {
                                return;
                            }
                            int var13 = (this.field3360 - var5) / var8;
                            if (var13 >= this.field3358) {
                                this.field3360 -= this.field3358 * var8;
                                this.field3358 = 0;
                                break;
                            }
                            this.field3360 -= var8 * var13;
                            this.field3358 -= var13;
                        }
                    }
                }
                if (this.field3352 < 0) {
                    this.method1074(arg0, var9, 0, var10, 0);
                    if (this.field3360 < 0) {
                        this.field3360 = -1;
                        this.method1076();
                        this.method630(44);
                        return;
                    }
                } else {
                    this.method1100(arg0, var9, var7, var10, 0);
                    if (this.field3360 >= var7) {
                        this.field3360 = var7;
                        this.method1076();
                        this.method630(23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[B[IIIIIIIILrg;)I")
    private static final int method1070(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class164 arg10) {
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
        arg10.field3360 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I[B[IIIIIIIIIILrg;)I")
    private static final int method1071(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class164 arg12) {
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
        arg12.field3355 += (var19 - arg4) * arg12.field3361;
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
        arg12.field3359 = var15 >> 2;
        arg12.field3350 = var16 >> 2;
        arg12.field3360 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I[B[IIIIIIIILrg;)I")
    private static final int method1072(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class164 arg10) {
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
        arg10.field3360 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)I")
    private static final int method1073(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
    public final int method284() {
        return this.field3354 == 0 && this.field3363 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([IIIII)I")
    private final int method1074(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3363 <= 0) {
                if (this.field3352 == -256 && (this.field3360 & 255) == 0) {
                    if (class10.field195) {
                        return method1072(0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, 0, arg3, arg2, this);
                    }
                    return method1095(((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, 0, arg3, arg2, this);
                }
                if (class10.field195) {
                    return method1075(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, 0, arg3, arg2, this, this.field3352, arg4);
                }
                return method1101(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, 0, arg3, arg2, this, this.field3352, arg4);
            }
            int var6 = this.field3363 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3363 += arg1;
            if (this.field3352 == -256 && (this.field3360 & 255) == 0) {
                if (class10.field195) {
                    arg1 = method1071(0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, this.field3356, this.field3349, 0, var6, arg2, this);
                } else {
                    arg1 = method1079(((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, this.field3361, 0, var6, arg2, this);
                }
            } else if (class10.field195) {
                arg1 = method1089(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, this.field3356, this.field3349, 0, var6, arg2, this, this.field3352, arg4);
            } else {
                arg1 = method1080(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, this.field3361, 0, var6, arg2, this, this.field3352, arg4);
            }
            this.field3363 -= arg1;
            if (this.field3363 != 0) {
                return arg1;
            }
        } while (!this.method1062());
        return arg3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II[B[IIIIIIIILrg;II)I")
    private static final int method1075(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class164 arg11, int arg12, int arg13) {
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
        arg11.field3360 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "()V")
    private final void method1076() {
        if (this.field3363 != 0) {
            if (this.field3354 == Integer.MIN_VALUE) {
                this.field3354 = 0;
            }
            this.field3363 = 0;
            this.method1096();
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
    public final synchronized void method1077(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1087(arg1, arg2);
        } else {
            int var4 = method1073(arg1, arg2);
            int var5 = method1067(arg1, arg2);
            if (this.field3359 == var4 && this.field3350 == var5) {
                this.field3363 = 0;
            } else {
                int var6 = arg1 - this.field3355;
                if (this.field3355 - arg1 > var6) {
                    var6 = this.field3355 - arg1;
                }
                if (var4 - this.field3359 > var6) {
                    var6 = var4 - this.field3359;
                }
                if (this.field3359 - var4 > var6) {
                    var6 = this.field3359 - var4;
                }
                if (var5 - this.field3350 > var6) {
                    var6 = var5 - this.field3350;
                }
                if (this.field3350 - var5 > var6) {
                    var6 = this.field3350 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3363 = arg0;
                this.field3354 = arg1;
                this.field3351 = arg2;
                this.field3361 = (arg1 - this.field3355) / arg0;
                this.field3356 = (var4 - this.field3359) / arg0;
                this.field3349 = (var5 - this.field3350) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public final synchronized void method1078(int arg0) {
        this.method1087(arg0 << 6, this.method1066());
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([B[IIIIIIIILrg;)I")
    private static final int method1079(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class164 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3359 += (var14 - arg3) * arg9.field3356;
        arg9.field3350 += (var14 - arg3) * arg9.field3349;
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
        arg9.field3355 = var12 >> 2;
        arg9.field3360 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II[B[IIIIIIIILrg;II)I")
    private static final int method1080(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class164 arg11, int arg12, int arg13) {
        arg11.field3359 -= arg11.field3356 * arg5;
        arg11.field3350 -= arg11.field3349 * arg5;
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
        arg11.field3359 += arg11.field3356 * arg5;
        arg11.field3350 += arg11.field3349 * arg5;
        arg11.field3355 = arg6;
        arg11.field3360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "([B[IIIIIIIILrg;)I")
    private static final int method1081(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class164 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3359 += (var14 - arg3) * arg9.field3356;
        arg9.field3350 += (var14 - arg3) * arg9.field3349;
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
        arg9.field3355 = var12 >> 2;
        arg9.field3360 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public final synchronized void method1082(int arg0) {
        int var2 = ((class153) super.field3220).field3173.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3360 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public final synchronized void method1083(boolean arg0) {
        this.field3352 = (this.field3352 >>> 31) + (this.field3352 ^ this.field3352 >> 31);
        if (arg0) {
            this.field3352 = -this.field3352;
        }
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "()I")
    public final synchronized int method1084() {
        return this.field3354 == Integer.MIN_VALUE ? 0 : this.field3354;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public final synchronized void method283(int arg0) {
        if (this.field3363 > 0) {
            if (arg0 >= this.field3363) {
                if (this.field3354 == Integer.MIN_VALUE) {
                    this.field3354 = 0;
                    this.field3355 = this.field3359 = this.field3350 = 0;
                    this.method630(61);
                    arg0 = this.field3363;
                }
                this.field3363 = 0;
                this.method1096();
            } else {
                this.field3355 += this.field3361 * arg0;
                this.field3359 += this.field3356 * arg0;
                this.field3350 += this.field3349 * arg0;
                this.field3363 -= arg0;
            }
        }
        class153 var2 = (class153) super.field3220;
        int var3 = this.field3357 << 8;
        int var4 = this.field3353 << 8;
        int var5 = var2.field3173.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3358 = 0;
        }
        if (this.field3360 < 0) {
            if (this.field3352 <= 0) {
                this.method1076();
                this.method630(107);
                return;
            }
            this.field3360 = 0;
        }
        if (this.field3360 >= var5) {
            if (this.field3352 >= 0) {
                this.method1076();
                this.method630(20);
                return;
            }
            this.field3360 = var5 - 1;
        }
        this.field3360 += this.field3352 * arg0;
        if (this.field3358 < 0) {
            if (!this.field3362) {
                if (this.field3352 < 0) {
                    if (this.field3360 < var3) {
                        this.field3360 = var4 - 1 - (var4 - 1 - this.field3360) % var6;
                    }
                } else if (this.field3360 >= var4) {
                    this.field3360 = (this.field3360 - var3) % var6 + var3;
                }
            } else {
                if (this.field3352 < 0) {
                    if (this.field3360 >= var3) {
                        return;
                    }
                    this.field3360 = var3 + var3 - 1 - this.field3360;
                    this.field3352 = -this.field3352;
                }
                while (this.field3360 >= var4) {
                    this.field3360 = var4 + var4 - 1 - this.field3360;
                    this.field3352 = -this.field3352;
                    if (this.field3360 >= var3) {
                        return;
                    }
                    this.field3360 = var3 + var3 - 1 - this.field3360;
                    this.field3352 = -this.field3352;
                }
            }
        } else {
            if (this.field3358 > 0) {
                if (this.field3362) {
                    label125: {
                        if (this.field3352 < 0) {
                            if (this.field3360 >= var3) {
                                return;
                            }
                            this.field3360 = var3 + var3 - 1 - this.field3360;
                            this.field3352 = -this.field3352;
                            if (--this.field3358 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3360 < var4) {
                                return;
                            }
                            this.field3360 = var4 + var4 - 1 - this.field3360;
                            this.field3352 = -this.field3352;
                            if (--this.field3358 == 0) {
                                break;
                            }
                            if (this.field3360 >= var3) {
                                return;
                            }
                            this.field3360 = var3 + var3 - 1 - this.field3360;
                            this.field3352 = -this.field3352;
                        } while (--this.field3358 != 0);
                    }
                } else if (this.field3352 < 0) {
                    if (this.field3360 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3360) / var6;
                    if (var7 < this.field3358) {
                        this.field3360 += var6 * var7;
                        this.field3358 -= var7;
                        return;
                    }
                    this.field3360 += this.field3358 * var6;
                    this.field3358 = 0;
                } else {
                    if (this.field3360 < var4) {
                        return;
                    }
                    int var8 = (this.field3360 - var3) / var6;
                    if (var8 < this.field3358) {
                        this.field3360 -= var6 * var8;
                        this.field3358 -= var8;
                        return;
                    }
                    this.field3360 -= this.field3358 * var6;
                    this.field3358 = 0;
                }
            }
            if (this.field3352 < 0) {
                if (this.field3360 < 0) {
                    this.field3360 = -1;
                    this.method1076();
                    this.method630(105);
                    return;
                }
            } else if (this.field3360 >= var5) {
                this.field3360 = var5;
                this.method1076();
                this.method630(117);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V")
    public final synchronized void method1085(int arg0, int arg1) {
        this.method1077(arg0, arg1, this.method1066());
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public final synchronized void method1086(int arg0) {
        this.field3358 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(II)V")
    private final synchronized void method1087(int arg0, int arg1) {
        this.field3354 = arg0;
        this.field3351 = arg1;
        this.field3363 = 0;
        this.method1096();
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(II[B[IIIIIIIILrg;II)I")
    private static final int method1088(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class164 arg11, int arg12, int arg13) {
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
        arg11.field3360 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II[B[IIIIIIIIIILrg;II)I")
    private static final int method1089(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class164 arg13, int arg14, int arg15) {
        arg13.field3355 -= arg13.field3361 * arg5;
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
        arg13.field3355 += arg13.field3361 * var22;
        arg13.field3359 = arg6;
        arg13.field3350 = arg7;
        arg13.field3360 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "()Z")
    public final boolean method1090() {
        return this.field3363 != 0;
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V")
    private final synchronized void method1091(int arg0) {
        this.method1087(arg0, this.method1066());
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()Lqh;")
    public final class156 method278() {
        return null;
    }

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "()I")
    public final synchronized int method1092() {
        return this.field3352 < 0 ? -this.field3352 : this.field3352;
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V")
    public final synchronized void method1093(int arg0) {
        if (this.field3352 < 0) {
            this.field3352 = -arg0;
        } else {
            this.field3352 = arg0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqe;III)Lrg;")
    public static final class164 method1094(class153 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3173 != null && arg0.field3173.length != 0 ? new class164(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "([B[IIIIIIILrg;)I")
    private static final int method1095(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164 arg8) {
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
        arg8.field3360 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "()V")
    private final void method1096() {
        this.field3355 = this.field3354;
        this.field3359 = method1073(this.field3354, this.field3351);
        this.field3350 = method1067(this.field3354, this.field3351);
    }

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "(I)V")
    public final synchronized void method1097(int arg0) {
        if (arg0 == 0) {
            this.method1091(0);
            this.method630(48);
        } else if (this.field3359 == 0 && this.field3350 == 0) {
            this.field3363 = 0;
            this.field3354 = 0;
            this.field3355 = 0;
            this.method630(87);
        } else {
            int var2 = -this.field3355;
            if (this.field3355 > var2) {
                var2 = this.field3355;
            }
            if (-this.field3359 > var2) {
                var2 = -this.field3359;
            }
            if (this.field3359 > var2) {
                var2 = this.field3359;
            }
            if (-this.field3350 > var2) {
                var2 = -this.field3350;
            }
            if (this.field3350 > var2) {
                var2 = this.field3350;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3363 = arg0;
            this.field3354 = Integer.MIN_VALUE;
            this.field3361 = -this.field3355 / arg0;
            this.field3356 = -this.field3359 / arg0;
            this.field3349 = -this.field3350 / arg0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lqe;II)V")
    private class164(class153 arg0, int arg1, int arg2) {
        super.field3220 = arg0;
        this.field3357 = arg0.field3174;
        this.field3353 = arg0.field3172;
        this.field3362 = arg0.field3175;
        this.field3352 = arg1;
        this.field3354 = arg2;
        this.field3351 = 8192;
        this.field3360 = 0;
        this.method1096();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[B[IIIIIIILrg;II)I")
    private static final int method1098(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class164 arg10, int arg11, int arg12) {
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
        arg10.field3360 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqe;II)Lrg;")
    public static final class164 method1099(class153 arg0, int arg1, int arg2) {
        return arg0.field3173 != null && arg0.field3173.length != 0 ? new class164(arg0, (int) ((long) arg0.field3176 * 256L * (long) arg1 / (long) (class188.field3736 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lqe;III)V")
    private class164(class153 arg0, int arg1, int arg2, int arg3) {
        super.field3220 = arg0;
        this.field3357 = arg0.field3174;
        this.field3353 = arg0.field3172;
        this.field3362 = arg0.field3175;
        this.field3352 = arg1;
        this.field3354 = arg2;
        this.field3351 = arg3;
        this.field3360 = 0;
        this.method1096();
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "([IIIII)I")
    private final int method1100(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3363 <= 0) {
                if (this.field3352 == 256 && (this.field3360 & 255) == 0) {
                    if (class10.field195) {
                        return method1070(0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, 0, arg3, arg2, this);
                    }
                    return method1069(((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, 0, arg3, arg2, this);
                }
                if (class10.field195) {
                    return method1088(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, 0, arg3, arg2, this, this.field3352, arg4);
                }
                return method1098(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, 0, arg3, arg2, this, this.field3352, arg4);
            }
            int var6 = this.field3363 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3363 += arg1;
            if (this.field3352 == 256 && (this.field3360 & 255) == 0) {
                if (class10.field195) {
                    arg1 = method1064(0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, this.field3356, this.field3349, 0, var6, arg2, this);
                } else {
                    arg1 = method1081(((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, this.field3361, 0, var6, arg2, this);
                }
            } else if (class10.field195) {
                arg1 = method1063(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3359, this.field3350, this.field3356, this.field3349, 0, var6, arg2, this, this.field3352, arg4);
            } else {
                arg1 = method1068(0, 0, ((class153) super.field3220).field3173, arg0, this.field3360, arg1, this.field3355, this.field3361, 0, var6, arg2, this, this.field3352, arg4);
            }
            this.field3363 -= arg1;
            if (this.field3363 != 0) {
                return arg1;
            }
        } while (!this.method1062());
        return arg3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II[B[IIIIIIILrg;II)I")
    private static final int method1101(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class164 arg10, int arg11, int arg12) {
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
        arg10.field3360 = arg4;
        return arg5;
    }
}
