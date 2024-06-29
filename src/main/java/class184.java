import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class184 extends class15 {

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Z")
    private boolean field2757;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field2755;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    private int field2753;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    private int field2749;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    private int field2752;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    private int field2760;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([III)V")
    public final synchronized void method104(int[] arg0, int arg1, int arg2) {
        if (this.field2746 == 0 && this.field2754 == 0) {
            this.method103(arg2);
        } else {
            class105 var4 = (class105) super.field165;
            int var5 = this.field2758 << 8;
            int var6 = this.field2747 << 8;
            int var7 = var4.field1804.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2759 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2753 < 0) {
                if (this.field2751 <= 0) {
                    this.method1313();
                    this.method1781(5250);
                    return;
                }
                this.field2753 = 0;
            }
            if (this.field2753 >= var7) {
                if (this.field2751 >= 0) {
                    this.method1313();
                    this.method1781(5250);
                    return;
                }
                this.field2753 = var7 - 1;
            }
            if (this.field2759 < 0) {
                if (this.field2757) {
                    if (this.field2751 < 0) {
                        var9 = this.method1326(arg0, arg1, var5, var10, var4.field1804[this.field2758]);
                        if (this.field2753 >= var5) {
                            return;
                        }
                        this.field2753 = var5 + var5 - 1 - this.field2753;
                        this.field2751 = -this.field2751;
                    }
                    while (true) {
                        int var11 = this.method1321(arg0, var9, var6, var10, var4.field1804[this.field2747 - 1]);
                        if (this.field2753 < var6) {
                            return;
                        }
                        this.field2753 = var6 + var6 - 1 - this.field2753;
                        this.field2751 = -this.field2751;
                        var9 = this.method1326(arg0, var11, var5, var10, var4.field1804[this.field2758]);
                        if (this.field2753 >= var5) {
                            return;
                        }
                        this.field2753 = var5 + var5 - 1 - this.field2753;
                        this.field2751 = -this.field2751;
                    }
                } else if (this.field2751 < 0) {
                    while (true) {
                        var9 = this.method1326(arg0, var9, var5, var10, var4.field1804[this.field2747 - 1]);
                        if (this.field2753 >= var5) {
                            return;
                        }
                        this.field2753 = var6 - 1 - (var6 - 1 - this.field2753) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1321(arg0, var9, var6, var10, var4.field1804[this.field2758]);
                        if (this.field2753 < var6) {
                            return;
                        }
                        this.field2753 = (this.field2753 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2759 > 0) {
                    if (this.field2757) {
                        label130: {
                            if (this.field2751 < 0) {
                                var9 = this.method1326(arg0, arg1, var5, var10, var4.field1804[this.field2758]);
                                if (this.field2753 >= var5) {
                                    return;
                                }
                                this.field2753 = var5 + var5 - 1 - this.field2753;
                                this.field2751 = -this.field2751;
                                if (--this.field2759 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1321(arg0, var9, var6, var10, var4.field1804[this.field2747 - 1]);
                                if (this.field2753 < var6) {
                                    return;
                                }
                                this.field2753 = var6 + var6 - 1 - this.field2753;
                                this.field2751 = -this.field2751;
                                if (--this.field2759 == 0) {
                                    break;
                                }
                                var9 = this.method1326(arg0, var9, var5, var10, var4.field1804[this.field2758]);
                                if (this.field2753 >= var5) {
                                    return;
                                }
                                this.field2753 = var5 + var5 - 1 - this.field2753;
                                this.field2751 = -this.field2751;
                            } while (--this.field2759 != 0);
                        }
                    } else if (this.field2751 < 0) {
                        while (true) {
                            var9 = this.method1326(arg0, var9, var5, var10, var4.field1804[this.field2747 - 1]);
                            if (this.field2753 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2753) / var8;
                            if (var12 >= this.field2759) {
                                this.field2753 += this.field2759 * var8;
                                this.field2759 = 0;
                                break;
                            }
                            this.field2753 += var8 * var12;
                            this.field2759 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1321(arg0, var9, var6, var10, var4.field1804[this.field2758]);
                            if (this.field2753 < var6) {
                                return;
                            }
                            int var13 = (this.field2753 - var5) / var8;
                            if (var13 >= this.field2759) {
                                this.field2753 -= this.field2759 * var8;
                                this.field2759 = 0;
                                break;
                            }
                            this.field2753 -= var8 * var13;
                            this.field2759 -= var13;
                        }
                    }
                }
                if (this.field2751 < 0) {
                    this.method1326(arg0, var9, 0, var10, 0);
                    if (this.field2753 < 0) {
                        this.field2753 = -1;
                        this.method1313();
                        this.method1781(5250);
                        return;
                    }
                } else {
                    this.method1321(arg0, var9, var7, var10, 0);
                    if (this.field2753 >= var7) {
                        this.field2753 = var7;
                        this.method1313();
                        this.method1781(5250);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()I")
    public final synchronized int method1287() {
        return this.field2755 < 0 ? -1 : this.field2755;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    private static final int method1288(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
    private final void method1289() {
        this.field2748 = this.field2746;
        this.field2760 = method1288(this.field2746, this.field2755);
        this.field2749 = method1291(this.field2746, this.field2755);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B[IIIIIIIILtd;)I")
    private static final int method1290(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class184 arg10) {
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
        arg10.field2753 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)I")
    private static final int method1291(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final synchronized void method1292(boolean arg0) {
        this.field2751 = (this.field2751 >>> 31) + (this.field2751 ^ this.field2751 >> 31);
        if (arg0) {
            this.field2751 = -this.field2751;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B[IIIIIIILtd;)I")
    private static final int method1293(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class184 arg8) {
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
        arg8.field2753 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public final synchronized void method1294(int arg0) {
        this.method1305(arg0 << 6, this.method1287());
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public final synchronized void method103(int arg0) {
        if (this.field2754 > 0) {
            if (arg0 >= this.field2754) {
                if (this.field2746 == Integer.MIN_VALUE) {
                    this.field2746 = 0;
                    this.field2748 = this.field2760 = this.field2749 = 0;
                    this.method1781(5250);
                    arg0 = this.field2754;
                }
                this.field2754 = 0;
                this.method1289();
            } else {
                this.field2748 += this.field2756 * arg0;
                this.field2760 += this.field2752 * arg0;
                this.field2749 += this.field2750 * arg0;
                this.field2754 -= arg0;
            }
        }
        class105 var2 = (class105) super.field165;
        int var3 = this.field2758 << 8;
        int var4 = this.field2747 << 8;
        int var5 = var2.field1804.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2759 = 0;
        }
        if (this.field2753 < 0) {
            if (this.field2751 <= 0) {
                this.method1313();
                this.method1781(5250);
                return;
            }
            this.field2753 = 0;
        }
        if (this.field2753 >= var5) {
            if (this.field2751 >= 0) {
                this.method1313();
                this.method1781(5250);
                return;
            }
            this.field2753 = var5 - 1;
        }
        this.field2753 += this.field2751 * arg0;
        if (this.field2759 < 0) {
            if (!this.field2757) {
                if (this.field2751 < 0) {
                    if (this.field2753 < var3) {
                        this.field2753 = var4 - 1 - (var4 - 1 - this.field2753) % var6;
                    }
                } else if (this.field2753 >= var4) {
                    this.field2753 = (this.field2753 - var3) % var6 + var3;
                }
            } else {
                if (this.field2751 < 0) {
                    if (this.field2753 >= var3) {
                        return;
                    }
                    this.field2753 = var3 + var3 - 1 - this.field2753;
                    this.field2751 = -this.field2751;
                }
                while (this.field2753 >= var4) {
                    this.field2753 = var4 + var4 - 1 - this.field2753;
                    this.field2751 = -this.field2751;
                    if (this.field2753 >= var3) {
                        return;
                    }
                    this.field2753 = var3 + var3 - 1 - this.field2753;
                    this.field2751 = -this.field2751;
                }
            }
        } else {
            if (this.field2759 > 0) {
                if (this.field2757) {
                    label125: {
                        if (this.field2751 < 0) {
                            if (this.field2753 >= var3) {
                                return;
                            }
                            this.field2753 = var3 + var3 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                            if (--this.field2759 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2753 < var4) {
                                return;
                            }
                            this.field2753 = var4 + var4 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                            if (--this.field2759 == 0) {
                                break;
                            }
                            if (this.field2753 >= var3) {
                                return;
                            }
                            this.field2753 = var3 + var3 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                        } while (--this.field2759 != 0);
                    }
                } else if (this.field2751 < 0) {
                    if (this.field2753 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2753) / var6;
                    if (var7 < this.field2759) {
                        this.field2753 += var6 * var7;
                        this.field2759 -= var7;
                        return;
                    }
                    this.field2753 += this.field2759 * var6;
                    this.field2759 = 0;
                } else {
                    if (this.field2753 < var4) {
                        return;
                    }
                    int var8 = (this.field2753 - var3) / var6;
                    if (var8 < this.field2759) {
                        this.field2753 -= var6 * var8;
                        this.field2759 -= var8;
                        return;
                    }
                    this.field2753 -= this.field2759 * var6;
                    this.field2759 = 0;
                }
            }
            if (this.field2751 < 0) {
                if (this.field2753 < 0) {
                    this.field2753 = -1;
                    this.method1313();
                    this.method1781(5250);
                    return;
                }
            } else if (this.field2753 >= var5) {
                this.field2753 = var5;
                this.method1313();
                this.method1781(5250);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B[IIIIIIIILtd;)I")
    private static final int method1295(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class184 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2760 += (var14 - arg3) * arg9.field2752;
        arg9.field2749 += (var14 - arg3) * arg9.field2750;
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
        arg9.field2748 = var12 >> 2;
        arg9.field2753 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()Lrk;")
    public final class15 method101() {
        return null;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()Z")
    public final boolean method1296() {
        return this.field2754 != 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1297(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class184 arg11, int arg12, int arg13) {
        arg11.field2760 -= arg11.field2752 * arg5;
        arg11.field2749 -= arg11.field2750 * arg5;
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
        arg11.field2760 += arg11.field2752 * arg5;
        arg11.field2749 += arg11.field2750 * arg5;
        arg11.field2748 = arg6;
        arg11.field2753 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIILtd;II)I")
    private static final int method1298(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class184 arg10, int arg11, int arg12) {
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
        arg10.field2753 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B[IIIIIIIIIILtd;)I")
    private static final int method1299(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class184 arg12) {
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
        arg12.field2748 += (var19 - arg4) * arg12.field2756;
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
        arg12.field2760 = var15 >> 2;
        arg12.field2749 = var16 >> 2;
        arg12.field2753 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "()Z")
    private final boolean method1300() {
        int var1 = this.field2746;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1288(var1, this.field2755);
            var2 = method1291(var1, this.field2755);
        }
        if (this.field2748 == var1 && this.field2760 == var3 && this.field2749 == var2) {
            if (this.field2746 == Integer.MIN_VALUE) {
                this.field2746 = 0;
                this.field2748 = this.field2760 = this.field2749 = 0;
                this.method1781(5250);
                return true;
            } else {
                this.method1289();
                return false;
            }
        } else {
            if (this.field2748 < var1) {
                this.field2756 = 1;
                this.field2754 = var1 - this.field2748;
            } else if (this.field2748 > var1) {
                this.field2756 = -1;
                this.field2754 = this.field2748 - var1;
            } else {
                this.field2756 = 0;
            }
            if (this.field2760 < var3) {
                this.field2752 = 1;
                if (this.field2754 == 0 || this.field2754 > var3 - this.field2760) {
                    this.field2754 = var3 - this.field2760;
                }
            } else if (this.field2760 > var3) {
                this.field2752 = -1;
                if (this.field2754 == 0 || this.field2754 > this.field2760 - var3) {
                    this.field2754 = this.field2760 - var3;
                }
            } else {
                this.field2752 = 0;
            }
            if (this.field2749 < var2) {
                this.field2750 = 1;
                if (this.field2754 == 0 || this.field2754 > var2 - this.field2749) {
                    this.field2754 = var2 - this.field2749;
                }
            } else if (this.field2749 > var2) {
                this.field2750 = -1;
                if (this.field2754 == 0 || this.field2754 > this.field2749 - var2) {
                    this.field2754 = this.field2749 - var2;
                }
            } else {
                this.field2750 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIIIIILtd;II)I")
    private static final int method1301(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class184 arg13, int arg14, int arg15) {
        arg13.field2748 -= arg13.field2756 * arg5;
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
        arg13.field2748 += arg13.field2756 * var22;
        arg13.field2760 = arg6;
        arg13.field2749 = arg7;
        arg13.field2753 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1302(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class184 arg11, int arg12, int arg13) {
        arg11.field2760 -= arg11.field2752 * arg5;
        arg11.field2749 -= arg11.field2750 * arg5;
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
        arg11.field2760 += arg11.field2752 * arg5;
        arg11.field2749 += arg11.field2750 * arg5;
        arg11.field2748 = arg6;
        arg11.field2753 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public final synchronized void method1303(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1305(arg1, arg2);
        } else {
            int var4 = method1288(arg1, arg2);
            int var5 = method1291(arg1, arg2);
            if (this.field2760 == var4 && this.field2749 == var5) {
                this.field2754 = 0;
            } else {
                int var6 = arg1 - this.field2748;
                if (this.field2748 - arg1 > var6) {
                    var6 = this.field2748 - arg1;
                }
                if (var4 - this.field2760 > var6) {
                    var6 = var4 - this.field2760;
                }
                if (this.field2760 - var4 > var6) {
                    var6 = this.field2760 - var4;
                }
                if (var5 - this.field2749 > var6) {
                    var6 = var5 - this.field2749;
                }
                if (this.field2749 - var5 > var6) {
                    var6 = this.field2749 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2754 = arg0;
                this.field2746 = arg1;
                this.field2755 = arg2;
                this.field2756 = (arg1 - this.field2748) / arg0;
                this.field2752 = (var4 - this.field2760) / arg0;
                this.field2750 = (var5 - this.field2749) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B[IIIIIIILtd;)I")
    private static final int method1304(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class184 arg8) {
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
        arg8.field2753 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)V")
    private final synchronized void method1305(int arg0, int arg1) {
        this.field2746 = arg0;
        this.field2755 = arg1;
        this.field2754 = 0;
        this.method1289();
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public final synchronized void method1306(int arg0) {
        if (this.field2751 < 0) {
            this.field2751 = -arg0;
        } else {
            this.field2751 = arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "()I")
    public final synchronized int method1307() {
        return this.field2751 < 0 ? -this.field2751 : this.field2751;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public final int method102() {
        return this.field2746 == 0 && this.field2754 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Luk;II)Ltd;")
    public static final class184 method1308(class105 arg0, int arg1, int arg2) {
        return arg0.field1804 != null && arg0.field1804.length != 0 ? new class184(arg0, (int) ((long) arg0.field1807 * 256L * (long) arg1 / (long) (class91.field1459 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "()I")
    public final synchronized int method1309() {
        return this.field2746 == Integer.MIN_VALUE ? 0 : this.field2746;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B[IIIIIIIILtd;)I")
    private static final int method1310(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class184 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2760 += (var14 - arg3) * arg9.field2752;
        arg9.field2749 += (var14 - arg3) * arg9.field2750;
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
        arg9.field2748 = var12 >> 2;
        arg9.field2753 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIILtd;II)I")
    private static final int method1311(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class184 arg10, int arg11, int arg12) {
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
        arg10.field2753 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Luk;III)Ltd;")
    public static final class184 method1312(class105 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1804 != null && arg0.field1804.length != 0 ? new class184(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!td", name = "k", descriptor = "()V")
    private final void method1313() {
        if (this.field2754 != 0) {
            if (this.field2746 == Integer.MIN_VALUE) {
                this.field2746 = 0;
            }
            this.field2754 = 0;
            this.method1289();
        }
    }

    @OriginalMember(owner = "client!td", name = "l", descriptor = "()Z")
    public final boolean method1314() {
        return this.field2753 < 0 || this.field2753 >= ((class105) super.field165).field1804.length << 8;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()Lrk;")
    public final class15 method106() {
        return null;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    private final synchronized void method1315(int arg0) {
        this.method1305(arg0, this.method1287());
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
    public final int method105() {
        int var1 = this.field2748 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2759 == 0) {
            var2 -= this.field2753 * var2 / (((class105) super.field165).field1804.length << 8);
        } else if (this.field2759 >= 0) {
            var2 -= this.field2758 * var2 / ((class105) super.field165).field1804.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public final synchronized void method1316(int arg0) {
        int var2 = ((class105) super.field165).field1804.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2753 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1317(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class184 arg11, int arg12, int arg13) {
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
        arg11.field2753 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method1318(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class184 arg11, int arg12, int arg13) {
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
        arg11.field2753 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II)V")
    public final synchronized void method1319(int arg0, int arg1) {
        this.method1303(arg0, arg1, this.method1287());
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
    public final synchronized void method1320(int arg0) {
        this.field2759 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIII)I")
    private final int method1321(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2754 <= 0) {
                if (this.field2751 == 256 && (this.field2753 & 255) == 0) {
                    if (class11.field128) {
                        return method1290(0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, 0, arg3, arg2, this);
                    }
                    return method1293(((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, 0, arg3, arg2, this);
                }
                if (class11.field128) {
                    return method1317(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, 0, arg3, arg2, this, this.field2751, arg4);
                }
                return method1311(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, 0, arg3, arg2, this, this.field2751, arg4);
            }
            int var6 = this.field2754 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2754 += arg1;
            if (this.field2751 == 256 && (this.field2753 & 255) == 0) {
                if (class11.field128) {
                    arg1 = method1324(0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, this.field2752, this.field2750, 0, var6, arg2, this);
                } else {
                    arg1 = method1310(((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, this.field2756, 0, var6, arg2, this);
                }
            } else if (class11.field128) {
                arg1 = method1301(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, this.field2752, this.field2750, 0, var6, arg2, this, this.field2751, arg4);
            } else {
                arg1 = method1302(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, this.field2756, 0, var6, arg2, this, this.field2751, arg4);
            }
            this.field2754 -= arg1;
            if (this.field2754 != 0) {
                return arg1;
            }
        } while (!this.method1300());
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
    public final synchronized void method1322(int arg0) {
        if (arg0 == 0) {
            this.method1315(0);
            this.method1781(5250);
        } else if (this.field2760 == 0 && this.field2749 == 0) {
            this.field2754 = 0;
            this.field2746 = 0;
            this.field2748 = 0;
            this.method1781(5250);
        } else {
            int var2 = -this.field2748;
            if (this.field2748 > var2) {
                var2 = this.field2748;
            }
            if (-this.field2760 > var2) {
                var2 = -this.field2760;
            }
            if (this.field2760 > var2) {
                var2 = this.field2760;
            }
            if (-this.field2749 > var2) {
                var2 = -this.field2749;
            }
            if (this.field2749 > var2) {
                var2 = this.field2749;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2754 = arg0;
            this.field2746 = Integer.MIN_VALUE;
            this.field2756 = -this.field2748 / arg0;
            this.field2752 = -this.field2760 / arg0;
            this.field2750 = -this.field2749 / arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIIIIILtd;II)I")
    private static final int method1323(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class184 arg13, int arg14, int arg15) {
        arg13.field2748 -= arg13.field2756 * arg5;
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
        arg13.field2748 += arg13.field2756 * var22;
        arg13.field2760 = arg6;
        arg13.field2749 = arg7;
        arg13.field2753 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I[B[IIIIIIIIIILtd;)I")
    private static final int method1324(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class184 arg12) {
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
        arg12.field2748 += (var19 - arg4) * arg12.field2756;
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
        arg12.field2760 = var15 >> 2;
        arg12.field2749 = var16 >> 2;
        arg12.field2753 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I[B[IIIIIIIILtd;)I")
    private static final int method1325(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class184 arg10) {
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
        arg10.field2753 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([IIIII)I")
    private final int method1326(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2754 <= 0) {
                if (this.field2751 == -256 && (this.field2753 & 255) == 0) {
                    if (class11.field128) {
                        return method1325(0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, 0, arg3, arg2, this);
                    }
                    return method1304(((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, 0, arg3, arg2, this);
                }
                if (class11.field128) {
                    return method1318(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, 0, arg3, arg2, this, this.field2751, arg4);
                }
                return method1298(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, 0, arg3, arg2, this, this.field2751, arg4);
            }
            int var6 = this.field2754 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2754 += arg1;
            if (this.field2751 == -256 && (this.field2753 & 255) == 0) {
                if (class11.field128) {
                    arg1 = method1299(0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, this.field2752, this.field2750, 0, var6, arg2, this);
                } else {
                    arg1 = method1295(((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, this.field2756, 0, var6, arg2, this);
                }
            } else if (class11.field128) {
                arg1 = method1323(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2760, this.field2749, this.field2752, this.field2750, 0, var6, arg2, this, this.field2751, arg4);
            } else {
                arg1 = method1297(0, 0, ((class105) super.field165).field1804, arg0, this.field2753, arg1, this.field2748, this.field2756, 0, var6, arg2, this, this.field2751, arg4);
            }
            this.field2754 -= arg1;
            if (this.field2754 != 0) {
                return arg1;
            }
        } while (!this.method1300());
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Luk;II)V")
    private class184(class105 arg0, int arg1, int arg2) {
        super.field165 = arg0;
        this.field2758 = arg0.field1803;
        this.field2747 = arg0.field1805;
        this.field2757 = arg0.field1806;
        this.field2751 = arg1;
        this.field2746 = arg2;
        this.field2755 = 8192;
        this.field2753 = 0;
        this.method1289();
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Luk;III)V")
    private class184(class105 arg0, int arg1, int arg2, int arg3) {
        super.field165 = arg0;
        this.field2758 = arg0.field1803;
        this.field2747 = arg0.field1805;
        this.field2757 = arg0.field1806;
        this.field2751 = arg1;
        this.field2746 = arg2;
        this.field2755 = arg3;
        this.field2753 = 0;
        this.method1289();
    }
}
