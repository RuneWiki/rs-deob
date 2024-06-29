import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class199 extends class105 {

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Z")
    private boolean field3865;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field3856;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    private int field3864;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    private int field3866;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    private int field3868;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([III)V")
    public final synchronized void method119(int[] arg0, int arg1, int arg2) {
        if (this.field3858 == 0 && this.field3866 == 0) {
            this.method116(arg2);
        } else {
            class202 var4 = (class202) super.field1928;
            int var5 = this.field3861 << 8;
            int var6 = this.field3867 << 8;
            int var7 = var4.field3910.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3863 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3864 < 0) {
                if (this.field3856 <= 0) {
                    this.method1279();
                    this.method235(false);
                    return;
                }
                this.field3864 = 0;
            }
            if (this.field3864 >= var7) {
                if (this.field3856 >= 0) {
                    this.method1279();
                    this.method235(false);
                    return;
                }
                this.field3864 = var7 - 1;
            }
            if (this.field3863 < 0) {
                if (this.field3865) {
                    if (this.field3856 < 0) {
                        var9 = this.method1287(arg0, arg1, var5, var10, var4.field3910[this.field3861]);
                        if (this.field3864 >= var5) {
                            return;
                        }
                        this.field3864 = var5 + var5 - 1 - this.field3864;
                        this.field3856 = -this.field3856;
                    }
                    while (true) {
                        int var11 = this.method1303(arg0, var9, var6, var10, var4.field3910[this.field3867 - 1]);
                        if (this.field3864 < var6) {
                            return;
                        }
                        this.field3864 = var6 + var6 - 1 - this.field3864;
                        this.field3856 = -this.field3856;
                        var9 = this.method1287(arg0, var11, var5, var10, var4.field3910[this.field3861]);
                        if (this.field3864 >= var5) {
                            return;
                        }
                        this.field3864 = var5 + var5 - 1 - this.field3864;
                        this.field3856 = -this.field3856;
                    }
                } else if (this.field3856 < 0) {
                    while (true) {
                        var9 = this.method1287(arg0, var9, var5, var10, var4.field3910[this.field3867 - 1]);
                        if (this.field3864 >= var5) {
                            return;
                        }
                        this.field3864 = var6 - 1 - (var6 - 1 - this.field3864) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1303(arg0, var9, var6, var10, var4.field3910[this.field3861]);
                        if (this.field3864 < var6) {
                            return;
                        }
                        this.field3864 = (this.field3864 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3863 > 0) {
                    if (this.field3865) {
                        label130: {
                            if (this.field3856 < 0) {
                                var9 = this.method1287(arg0, arg1, var5, var10, var4.field3910[this.field3861]);
                                if (this.field3864 >= var5) {
                                    return;
                                }
                                this.field3864 = var5 + var5 - 1 - this.field3864;
                                this.field3856 = -this.field3856;
                                if (--this.field3863 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1303(arg0, var9, var6, var10, var4.field3910[this.field3867 - 1]);
                                if (this.field3864 < var6) {
                                    return;
                                }
                                this.field3864 = var6 + var6 - 1 - this.field3864;
                                this.field3856 = -this.field3856;
                                if (--this.field3863 == 0) {
                                    break;
                                }
                                var9 = this.method1287(arg0, var9, var5, var10, var4.field3910[this.field3861]);
                                if (this.field3864 >= var5) {
                                    return;
                                }
                                this.field3864 = var5 + var5 - 1 - this.field3864;
                                this.field3856 = -this.field3856;
                            } while (--this.field3863 != 0);
                        }
                    } else if (this.field3856 < 0) {
                        while (true) {
                            var9 = this.method1287(arg0, var9, var5, var10, var4.field3910[this.field3867 - 1]);
                            if (this.field3864 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3864) / var8;
                            if (var12 >= this.field3863) {
                                this.field3864 += this.field3863 * var8;
                                this.field3863 = 0;
                                break;
                            }
                            this.field3864 += var8 * var12;
                            this.field3863 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1303(arg0, var9, var6, var10, var4.field3910[this.field3861]);
                            if (this.field3864 < var6) {
                                return;
                            }
                            int var13 = (this.field3864 - var5) / var8;
                            if (var13 >= this.field3863) {
                                this.field3864 -= this.field3863 * var8;
                                this.field3863 = 0;
                                break;
                            }
                            this.field3864 -= var8 * var13;
                            this.field3863 -= var13;
                        }
                    }
                }
                if (this.field3856 < 0) {
                    this.method1287(arg0, var9, 0, var10, 0);
                    if (this.field3864 < 0) {
                        this.field3864 = -1;
                        this.method1279();
                        this.method235(false);
                        return;
                    }
                } else {
                    this.method1303(arg0, var9, var7, var10, 0);
                    if (this.field3864 >= var7) {
                        this.field3864 = var7;
                        this.method1279();
                        this.method235(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public final synchronized void method1268(int arg0) {
        if (this.field3856 < 0) {
            this.field3856 = -arg0;
        } else {
            this.field3856 = arg0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B[IIIIIIIIIILw;)I")
    private static final int method1269(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class199 arg12) {
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
        arg12.field3860 += (var19 - arg4) * arg12.field3857;
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
        arg12.field3868 = var15 >> 2;
        arg12.field3862 = var16 >> 2;
        arg12.field3864 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[B[IIIIIIILw;II)I")
    private static final int method1270(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10, int arg11, int arg12) {
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
        arg10.field3864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[B[IIIIIIIILw;)I")
    private static final int method1271(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10) {
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
        arg10.field3864 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwc;II)Lw;")
    public static final class199 method1272(class202 arg0, int arg1, int arg2) {
        return arg0.field3910 != null && arg0.field3910.length != 0 ? new class199(arg0, (int) ((long) arg0.field3912 * 256L * (long) arg1 / (long) (class170.field3385 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[B[IIIIIIIILw;II)I")
    private static final int method1273(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
        arg11.field3868 -= arg11.field3859 * arg5;
        arg11.field3862 -= arg11.field3869 * arg5;
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
        arg11.field3868 += arg11.field3859 * arg5;
        arg11.field3862 += arg11.field3869 * arg5;
        arg11.field3860 = arg6;
        arg11.field3864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
    public final synchronized void method1274(boolean arg0) {
        this.field3856 = (this.field3856 >>> 31) + (this.field3856 ^ this.field3856 >> 31);
        if (arg0) {
            this.field3856 = -this.field3856;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
    public final int method580() {
        int var1 = this.field3860 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3863 == 0) {
            var2 -= this.field3864 * var2 / (((class202) super.field1928).field3910.length << 8);
        } else if (this.field3863 >= 0) {
            var2 -= this.field3861 * var2 / ((class202) super.field1928).field3910.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "()Z")
    public final boolean method1275() {
        return this.field3864 < 0 || this.field3864 >= ((class202) super.field1928).field3910.length << 8;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I")
    private static final int method1276(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public final synchronized void method1277(int arg0) {
        this.field3863 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([B[IIIIIIILw;)I")
    private static final int method1278(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class199 arg8) {
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
        arg8.field3864 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
    private final void method1279() {
        if (this.field3866 != 0) {
            if (this.field3858 == Integer.MIN_VALUE) {
                this.field3858 = 0;
            }
            this.field3866 = 0;
            this.method1305();
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "()I")
    public final synchronized int method1280() {
        return this.field3858 == Integer.MIN_VALUE ? 0 : this.field3858;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    private final synchronized void method1281(int arg0) {
        this.method1307(arg0, this.method1285());
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
    public final synchronized void method1282(int arg0) {
        if (arg0 == 0) {
            this.method1281(0);
            this.method235(false);
        } else if (this.field3868 == 0 && this.field3862 == 0) {
            this.field3866 = 0;
            this.field3858 = 0;
            this.field3860 = 0;
            this.method235(false);
        } else {
            int var2 = -this.field3860;
            if (this.field3860 > var2) {
                var2 = this.field3860;
            }
            if (-this.field3868 > var2) {
                var2 = -this.field3868;
            }
            if (this.field3868 > var2) {
                var2 = this.field3868;
            }
            if (-this.field3862 > var2) {
                var2 = -this.field3862;
            }
            if (this.field3862 > var2) {
                var2 = this.field3862;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3866 = arg0;
            this.field3858 = Integer.MIN_VALUE;
            this.field3857 = -this.field3860 / arg0;
            this.field3859 = -this.field3868 / arg0;
            this.field3869 = -this.field3862 / arg0;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II[B[IIIIIIILw;II)I")
    private static final int method1283(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10, int arg11, int arg12) {
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
        arg10.field3864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "()Lle;")
    public final class105 method109() {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
    public final int method113() {
        return this.field3858 == 0 && this.field3866 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public final synchronized void method116(int arg0) {
        if (this.field3866 > 0) {
            if (arg0 >= this.field3866) {
                if (this.field3858 == Integer.MIN_VALUE) {
                    this.field3858 = 0;
                    this.field3860 = this.field3868 = this.field3862 = 0;
                    this.method235(false);
                    arg0 = this.field3866;
                }
                this.field3866 = 0;
                this.method1305();
            } else {
                this.field3860 += this.field3857 * arg0;
                this.field3868 += this.field3859 * arg0;
                this.field3862 += this.field3869 * arg0;
                this.field3866 -= arg0;
            }
        }
        class202 var2 = (class202) super.field1928;
        int var3 = this.field3861 << 8;
        int var4 = this.field3867 << 8;
        int var5 = var2.field3910.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3863 = 0;
        }
        if (this.field3864 < 0) {
            if (this.field3856 <= 0) {
                this.method1279();
                this.method235(false);
                return;
            }
            this.field3864 = 0;
        }
        if (this.field3864 >= var5) {
            if (this.field3856 >= 0) {
                this.method1279();
                this.method235(false);
                return;
            }
            this.field3864 = var5 - 1;
        }
        this.field3864 += this.field3856 * arg0;
        if (this.field3863 < 0) {
            if (!this.field3865) {
                if (this.field3856 < 0) {
                    if (this.field3864 < var3) {
                        this.field3864 = var4 - 1 - (var4 - 1 - this.field3864) % var6;
                    }
                } else if (this.field3864 >= var4) {
                    this.field3864 = (this.field3864 - var3) % var6 + var3;
                }
            } else {
                if (this.field3856 < 0) {
                    if (this.field3864 >= var3) {
                        return;
                    }
                    this.field3864 = var3 + var3 - 1 - this.field3864;
                    this.field3856 = -this.field3856;
                }
                while (this.field3864 >= var4) {
                    this.field3864 = var4 + var4 - 1 - this.field3864;
                    this.field3856 = -this.field3856;
                    if (this.field3864 >= var3) {
                        return;
                    }
                    this.field3864 = var3 + var3 - 1 - this.field3864;
                    this.field3856 = -this.field3856;
                }
            }
        } else {
            if (this.field3863 > 0) {
                if (this.field3865) {
                    label125: {
                        if (this.field3856 < 0) {
                            if (this.field3864 >= var3) {
                                return;
                            }
                            this.field3864 = var3 + var3 - 1 - this.field3864;
                            this.field3856 = -this.field3856;
                            if (--this.field3863 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3864 < var4) {
                                return;
                            }
                            this.field3864 = var4 + var4 - 1 - this.field3864;
                            this.field3856 = -this.field3856;
                            if (--this.field3863 == 0) {
                                break;
                            }
                            if (this.field3864 >= var3) {
                                return;
                            }
                            this.field3864 = var3 + var3 - 1 - this.field3864;
                            this.field3856 = -this.field3856;
                        } while (--this.field3863 != 0);
                    }
                } else if (this.field3856 < 0) {
                    if (this.field3864 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3864) / var6;
                    if (var7 < this.field3863) {
                        this.field3864 += var6 * var7;
                        this.field3863 -= var7;
                        return;
                    }
                    this.field3864 += this.field3863 * var6;
                    this.field3863 = 0;
                } else {
                    if (this.field3864 < var4) {
                        return;
                    }
                    int var8 = (this.field3864 - var3) / var6;
                    if (var8 < this.field3863) {
                        this.field3864 -= var6 * var8;
                        this.field3863 -= var8;
                        return;
                    }
                    this.field3864 -= this.field3863 * var6;
                    this.field3863 = 0;
                }
            }
            if (this.field3856 < 0) {
                if (this.field3864 < 0) {
                    this.field3864 = -1;
                    this.method1279();
                    this.method235(false);
                    return;
                }
            } else if (this.field3864 >= var5) {
                this.field3864 = var5;
                this.method1279();
                this.method235(false);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "()Z")
    private final boolean method1284() {
        int var1 = this.field3858;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1291(var1, this.field3870);
            var2 = method1276(var1, this.field3870);
        }
        if (this.field3860 == var1 && this.field3868 == var3 && this.field3862 == var2) {
            if (this.field3858 == Integer.MIN_VALUE) {
                this.field3858 = 0;
                this.field3860 = this.field3868 = this.field3862 = 0;
                this.method235(false);
                return true;
            } else {
                this.method1305();
                return false;
            }
        } else {
            if (this.field3860 < var1) {
                this.field3857 = 1;
                this.field3866 = var1 - this.field3860;
            } else if (this.field3860 > var1) {
                this.field3857 = -1;
                this.field3866 = this.field3860 - var1;
            } else {
                this.field3857 = 0;
            }
            if (this.field3868 < var3) {
                this.field3859 = 1;
                if (this.field3866 == 0 || this.field3866 > var3 - this.field3868) {
                    this.field3866 = var3 - this.field3868;
                }
            } else if (this.field3868 > var3) {
                this.field3859 = -1;
                if (this.field3866 == 0 || this.field3866 > this.field3868 - var3) {
                    this.field3866 = this.field3868 - var3;
                }
            } else {
                this.field3859 = 0;
            }
            if (this.field3862 < var2) {
                this.field3869 = 1;
                if (this.field3866 == 0 || this.field3866 > var2 - this.field3862) {
                    this.field3866 = var2 - this.field3862;
                }
            } else if (this.field3862 > var2) {
                this.field3869 = -1;
                if (this.field3866 == 0 || this.field3866 > this.field3862 - var2) {
                    this.field3866 = this.field3862 - var2;
                }
            } else {
                this.field3869 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!w", name = "i", descriptor = "()I")
    public final synchronized int method1285() {
        return this.field3870 < 0 ? -1 : this.field3870;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lwc;III)Lw;")
    public static final class199 method1286(class202 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3910 != null && arg0.field3910.length != 0 ? new class199(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIII)I")
    private final int method1287(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3866 <= 0) {
                if (this.field3856 == -256 && (this.field3864 & 255) == 0) {
                    if (class3.field46) {
                        return method1304(0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, 0, arg3, arg2, this);
                    }
                    return method1278(((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, 0, arg3, arg2, this);
                }
                if (class3.field46) {
                    return method1295(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, 0, arg3, arg2, this, this.field3856, arg4);
                }
                return method1270(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, 0, arg3, arg2, this, this.field3856, arg4);
            }
            int var6 = this.field3866 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3866 += arg1;
            if (this.field3856 == -256 && (this.field3864 & 255) == 0) {
                if (class3.field46) {
                    arg1 = method1269(0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, this.field3859, this.field3869, 0, var6, arg2, this);
                } else {
                    arg1 = method1292(((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, this.field3857, 0, var6, arg2, this);
                }
            } else if (class3.field46) {
                arg1 = method1297(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, this.field3859, this.field3869, 0, var6, arg2, this, this.field3856, arg4);
            } else {
                arg1 = method1294(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, this.field3857, 0, var6, arg2, this, this.field3856, arg4);
            }
            this.field3866 -= arg1;
            if (this.field3866 != 0) {
                return arg1;
            }
        } while (!this.method1284());
        return arg3;
    }

    @OriginalMember(owner = "client!w", name = "j", descriptor = "()Z")
    public final boolean method1288() {
        return this.field3866 != 0;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([B[IIIIIIILw;)I")
    private static final int method1289(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class199 arg8) {
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
        arg8.field3864 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
    public final synchronized void method1290(int arg0) {
        int var2 = ((class202) super.field1928).field3910.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3864 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
    private static final int method1291(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([B[IIIIIIIILw;)I")
    private static final int method1292(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class199 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3868 += (var14 - arg3) * arg9.field3859;
        arg9.field3862 += (var14 - arg3) * arg9.field3869;
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
        arg9.field3860 = var12 >> 2;
        arg9.field3864 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
    public final synchronized void method1293(int arg0, int arg1) {
        this.method1302(arg0, arg1, this.method1285());
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II[B[IIIIIIIILw;II)I")
    private static final int method1294(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
        arg11.field3868 -= arg11.field3859 * arg5;
        arg11.field3862 -= arg11.field3869 * arg5;
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
        arg11.field3868 += arg11.field3859 * arg5;
        arg11.field3862 += arg11.field3869 * arg5;
        arg11.field3860 = arg6;
        arg11.field3864 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II[B[IIIIIIIILw;II)I")
    private static final int method1295(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
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
        arg11.field3864 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I[B[IIIIIIIIIILw;)I")
    private static final int method1296(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class199 arg12) {
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
        arg12.field3860 += (var19 - arg4) * arg12.field3857;
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
        arg12.field3868 = var15 >> 2;
        arg12.field3862 = var16 >> 2;
        arg12.field3864 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II[B[IIIIIIIIIILw;II)I")
    private static final int method1297(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class199 arg13, int arg14, int arg15) {
        arg13.field3860 -= arg13.field3857 * arg5;
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
        arg13.field3860 += arg13.field3857 * var22;
        arg13.field3868 = arg6;
        arg13.field3862 = arg7;
        arg13.field3864 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II[B[IIIIIIIIIILw;II)I")
    private static final int method1298(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class199 arg13, int arg14, int arg15) {
        arg13.field3860 -= arg13.field3857 * arg5;
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
        arg13.field3860 += arg13.field3857 * var22;
        arg13.field3868 = arg6;
        arg13.field3862 = arg7;
        arg13.field3864 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([B[IIIIIIIILw;)I")
    private static final int method1299(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class199 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3868 += (var14 - arg3) * arg9.field3859;
        arg9.field3862 += (var14 - arg3) * arg9.field3869;
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
        arg9.field3860 = var12 >> 2;
        arg9.field3864 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
    public final synchronized void method1300(int arg0) {
        this.method1307(arg0 << 6, this.method1285());
    }

    @OriginalMember(owner = "client!w", name = "k", descriptor = "()I")
    public final synchronized int method1301() {
        return this.field3856 < 0 ? -this.field3856 : this.field3856;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public final synchronized void method1302(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1307(arg1, arg2);
        } else {
            int var4 = method1291(arg1, arg2);
            int var5 = method1276(arg1, arg2);
            if (this.field3868 == var4 && this.field3862 == var5) {
                this.field3866 = 0;
            } else {
                int var6 = arg1 - this.field3860;
                if (this.field3860 - arg1 > var6) {
                    var6 = this.field3860 - arg1;
                }
                if (var4 - this.field3868 > var6) {
                    var6 = var4 - this.field3868;
                }
                if (this.field3868 - var4 > var6) {
                    var6 = this.field3868 - var4;
                }
                if (var5 - this.field3862 > var6) {
                    var6 = var5 - this.field3862;
                }
                if (this.field3862 - var5 > var6) {
                    var6 = this.field3862 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3866 = arg0;
                this.field3858 = arg1;
                this.field3870 = arg2;
                this.field3857 = (arg1 - this.field3860) / arg0;
                this.field3859 = (var4 - this.field3868) / arg0;
                this.field3869 = (var5 - this.field3862) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([IIIII)I")
    private final int method1303(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3866 <= 0) {
                if (this.field3856 == 256 && (this.field3864 & 255) == 0) {
                    if (class3.field46) {
                        return method1271(0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, 0, arg3, arg2, this);
                    }
                    return method1289(((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, 0, arg3, arg2, this);
                }
                if (class3.field46) {
                    return method1306(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, 0, arg3, arg2, this, this.field3856, arg4);
                }
                return method1283(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, 0, arg3, arg2, this, this.field3856, arg4);
            }
            int var6 = this.field3866 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3866 += arg1;
            if (this.field3856 == 256 && (this.field3864 & 255) == 0) {
                if (class3.field46) {
                    arg1 = method1296(0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, this.field3859, this.field3869, 0, var6, arg2, this);
                } else {
                    arg1 = method1299(((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, this.field3857, 0, var6, arg2, this);
                }
            } else if (class3.field46) {
                arg1 = method1298(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3868, this.field3862, this.field3859, this.field3869, 0, var6, arg2, this, this.field3856, arg4);
            } else {
                arg1 = method1273(0, 0, ((class202) super.field1928).field3910, arg0, this.field3864, arg1, this.field3860, this.field3857, 0, var6, arg2, this, this.field3856, arg4);
            }
            this.field3866 -= arg1;
            if (this.field3866 != 0) {
                return arg1;
            }
        } while (!this.method1284());
        return arg3;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I[B[IIIIIIIILw;)I")
    private static final int method1304(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10) {
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
        arg10.field3864 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!w", name = "l", descriptor = "()V")
    private final void method1305() {
        this.field3860 = this.field3858;
        this.field3868 = method1291(this.field3858, this.field3870);
        this.field3862 = method1276(this.field3858, this.field3870);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()Lle;")
    public final class105 method117() {
        return null;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II[B[IIIIIIIILw;II)I")
    private static final int method1306(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
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
        arg11.field3864 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lwc;II)V")
    private class199(class202 arg0, int arg1, int arg2) {
        super.field1928 = arg0;
        this.field3861 = arg0.field3908;
        this.field3867 = arg0.field3911;
        this.field3865 = arg0.field3909;
        this.field3856 = arg1;
        this.field3858 = arg2;
        this.field3870 = 8192;
        this.field3864 = 0;
        this.method1305();
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)V")
    private final synchronized void method1307(int arg0, int arg1) {
        this.field3858 = arg0;
        this.field3870 = arg1;
        this.field3866 = 0;
        this.method1305();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lwc;III)V")
    private class199(class202 arg0, int arg1, int arg2, int arg3) {
        super.field1928 = arg0;
        this.field3861 = arg0.field3908;
        this.field3867 = arg0.field3911;
        this.field3865 = arg0.field3909;
        this.field3856 = arg1;
        this.field3858 = arg2;
        this.field3870 = arg3;
        this.field3864 = 0;
        this.method1305();
    }
}
