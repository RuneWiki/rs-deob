import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class199 extends class147 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    private int field3599;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    private int field3603;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Z")
    private boolean field3600;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    private int field3596;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    private int field3598;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()I")
    public final synchronized int method1348() {
        return this.field3594 < 0 ? -1 : this.field3594;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([B[IIIIIIILkd;)I")
    private static final int method1349(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class199 arg8) {
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
        arg8.field3596 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([B[IIIIIIIILkd;)I")
    private static final int method1350(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class199 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3598 += (var14 - arg3) * arg9.field3592;
        arg9.field3589 += (var14 - arg3) * arg9.field3591;
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
        arg9.field3602 = var12 >> 2;
        arg9.field3596 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B[IIIIIIIIIILkd;)I")
    private static final int method1351(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class199 arg12) {
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
        arg12.field3602 += (var19 - arg4) * arg12.field3593;
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
        arg12.field3598 = var15 >> 2;
        arg12.field3589 = var16 >> 2;
        arg12.field3596 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "()Z")
    public final boolean method1352() {
        return this.field3597 != 0;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    private final synchronized void method1353(int arg0) {
        this.method1386(arg0, this.method1348());
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
    public final synchronized void method1354(int arg0) {
        int var2 = ((class250) super.field2683).field4361.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3596 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[B[IIIIIIILkd;II)I")
    private static final int method1355(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10, int arg11, int arg12) {
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
        arg10.field3596 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final synchronized void method744(int arg0) {
        if (this.field3597 > 0) {
            if (arg0 >= this.field3597) {
                if (this.field3595 == Integer.MIN_VALUE) {
                    this.field3595 = 0;
                    this.field3602 = this.field3598 = this.field3589 = 0;
                    this.method1614(-1204826926);
                    arg0 = this.field3597;
                }
                this.field3597 = 0;
                this.method1374();
            } else {
                this.field3602 += this.field3593 * arg0;
                this.field3598 += this.field3592 * arg0;
                this.field3589 += this.field3591 * arg0;
                this.field3597 -= arg0;
            }
        }
        class250 var2 = (class250) super.field2683;
        int var3 = this.field3599 << 8;
        int var4 = this.field3603 << 8;
        int var5 = var2.field4361.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3601 = 0;
        }
        if (this.field3596 < 0) {
            if (this.field3590 <= 0) {
                this.method1385();
                this.method1614(-1204826926);
                return;
            }
            this.field3596 = 0;
        }
        if (this.field3596 >= var5) {
            if (this.field3590 >= 0) {
                this.method1385();
                this.method1614(-1204826926);
                return;
            }
            this.field3596 = var5 - 1;
        }
        this.field3596 += this.field3590 * arg0;
        if (this.field3601 < 0) {
            if (!this.field3600) {
                if (this.field3590 < 0) {
                    if (this.field3596 < var3) {
                        this.field3596 = var4 - 1 - (var4 - 1 - this.field3596) % var6;
                    }
                } else if (this.field3596 >= var4) {
                    this.field3596 = (this.field3596 - var3) % var6 + var3;
                }
            } else {
                if (this.field3590 < 0) {
                    if (this.field3596 >= var3) {
                        return;
                    }
                    this.field3596 = var3 + var3 - 1 - this.field3596;
                    this.field3590 = -this.field3590;
                }
                while (this.field3596 >= var4) {
                    this.field3596 = var4 + var4 - 1 - this.field3596;
                    this.field3590 = -this.field3590;
                    if (this.field3596 >= var3) {
                        return;
                    }
                    this.field3596 = var3 + var3 - 1 - this.field3596;
                    this.field3590 = -this.field3590;
                }
            }
        } else {
            if (this.field3601 > 0) {
                if (this.field3600) {
                    label125: {
                        if (this.field3590 < 0) {
                            if (this.field3596 >= var3) {
                                return;
                            }
                            this.field3596 = var3 + var3 - 1 - this.field3596;
                            this.field3590 = -this.field3590;
                            if (--this.field3601 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3596 < var4) {
                                return;
                            }
                            this.field3596 = var4 + var4 - 1 - this.field3596;
                            this.field3590 = -this.field3590;
                            if (--this.field3601 == 0) {
                                break;
                            }
                            if (this.field3596 >= var3) {
                                return;
                            }
                            this.field3596 = var3 + var3 - 1 - this.field3596;
                            this.field3590 = -this.field3590;
                        } while (--this.field3601 != 0);
                    }
                } else if (this.field3590 < 0) {
                    if (this.field3596 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3596) / var6;
                    if (var7 < this.field3601) {
                        this.field3596 += var6 * var7;
                        this.field3601 -= var7;
                        return;
                    }
                    this.field3596 += this.field3601 * var6;
                    this.field3601 = 0;
                } else {
                    if (this.field3596 < var4) {
                        return;
                    }
                    int var8 = (this.field3596 - var3) / var6;
                    if (var8 < this.field3601) {
                        this.field3596 -= var6 * var8;
                        this.field3601 -= var8;
                        return;
                    }
                    this.field3596 -= this.field3601 * var6;
                    this.field3601 = 0;
                }
            }
            if (this.field3590 < 0) {
                if (this.field3596 < 0) {
                    this.field3596 = -1;
                    this.method1385();
                    this.method1614(-1204826926);
                    return;
                }
            } else if (this.field3596 >= var5) {
                this.field3596 = var5;
                this.method1385();
                this.method1614(-1204826926);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public final synchronized void method1356(int arg0) {
        this.method1386(arg0 << 6, this.method1348());
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II[B[IIIIIIILkd;II)I")
    private static final int method1357(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10, int arg11, int arg12) {
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
        arg10.field3596 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B[IIIIIIIILkd;)I")
    private static final int method1358(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10) {
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
        arg10.field3596 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    private static final int method1359(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[B[IIIIIIIIIILkd;II)I")
    private static final int method1360(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class199 arg13, int arg14, int arg15) {
        arg13.field3602 -= arg13.field3593 * arg5;
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
        arg13.field3602 += arg13.field3593 * var22;
        arg13.field3598 = arg6;
        arg13.field3589 = arg7;
        arg13.field3596 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[B[IIIIIIIILkd;II)I")
    private static final int method1361(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
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
        arg11.field3596 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public final synchronized void method1362(int arg0, int arg1) {
        this.method1377(arg0, arg1, this.method1348());
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
    public final synchronized void method1363(boolean arg0) {
        this.field3590 = (this.field3590 >>> 31) + (this.field3590 ^ this.field3590 >> 31);
        if (arg0) {
            this.field3590 = -this.field3590;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "([B[IIIIIIIILkd;)I")
    private static final int method1364(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class199 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3598 += (var14 - arg3) * arg9.field3592;
        arg9.field3589 += (var14 - arg3) * arg9.field3591;
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
        arg9.field3602 = var12 >> 2;
        arg9.field3596 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "()Z")
    private final boolean method1365() {
        int var1 = this.field3595;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1367(var1, this.field3594);
            var2 = method1359(var1, this.field3594);
        }
        if (this.field3602 == var1 && this.field3598 == var3 && this.field3589 == var2) {
            if (this.field3595 == Integer.MIN_VALUE) {
                this.field3595 = 0;
                this.field3602 = this.field3598 = this.field3589 = 0;
                this.method1614(-1204826926);
                return true;
            } else {
                this.method1374();
                return false;
            }
        } else {
            if (this.field3602 < var1) {
                this.field3593 = 1;
                this.field3597 = var1 - this.field3602;
            } else if (this.field3602 > var1) {
                this.field3593 = -1;
                this.field3597 = this.field3602 - var1;
            } else {
                this.field3593 = 0;
            }
            if (this.field3598 < var3) {
                this.field3592 = 1;
                if (this.field3597 == 0 || this.field3597 > var3 - this.field3598) {
                    this.field3597 = var3 - this.field3598;
                }
            } else if (this.field3598 > var3) {
                this.field3592 = -1;
                if (this.field3597 == 0 || this.field3597 > this.field3598 - var3) {
                    this.field3597 = this.field3598 - var3;
                }
            } else {
                this.field3592 = 0;
            }
            if (this.field3589 < var2) {
                this.field3591 = 1;
                if (this.field3597 == 0 || this.field3597 > var2 - this.field3589) {
                    this.field3597 = var2 - this.field3589;
                }
            } else if (this.field3589 > var2) {
                this.field3591 = -1;
                if (this.field3597 == 0 || this.field3597 > this.field3589 - var2) {
                    this.field3597 = this.field3589 - var2;
                }
            } else {
                this.field3591 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "()I")
    public final synchronized int method1366() {
        return this.field3590 < 0 ? -this.field3590 : this.field3590;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I")
    private static final int method1367(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lik;II)Lkd;")
    public static final class199 method1368(class250 arg0, int arg1, int arg2) {
        return arg0.field4361 != null && arg0.field4361.length != 0 ? new class199(arg0, (int) ((long) arg0.field4357 * 256L * (long) arg1 / (long) (class198.field3580 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I[B[IIIIIIIIIILkd;)I")
    private static final int method1369(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class199 arg12) {
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
        arg12.field3602 += (var19 - arg4) * arg12.field3593;
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
        arg12.field3598 = var15 >> 2;
        arg12.field3589 = var16 >> 2;
        arg12.field3596 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public final synchronized void method1370(int arg0) {
        this.field3601 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II[B[IIIIIIIIIILkd;II)I")
    private static final int method1371(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class199 arg13, int arg14, int arg15) {
        arg13.field3602 -= arg13.field3593 * arg5;
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
        arg13.field3602 += arg13.field3593 * var22;
        arg13.field3598 = arg6;
        arg13.field3589 = arg7;
        arg13.field3596 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([III)V")
    public final synchronized void method748(int[] arg0, int arg1, int arg2) {
        if (this.field3595 == 0 && this.field3597 == 0) {
            this.method744(arg2);
        } else {
            class250 var4 = (class250) super.field2683;
            int var5 = this.field3599 << 8;
            int var6 = this.field3603 << 8;
            int var7 = var4.field4361.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3601 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3596 < 0) {
                if (this.field3590 <= 0) {
                    this.method1385();
                    this.method1614(-1204826926);
                    return;
                }
                this.field3596 = 0;
            }
            if (this.field3596 >= var7) {
                if (this.field3590 >= 0) {
                    this.method1385();
                    this.method1614(-1204826926);
                    return;
                }
                this.field3596 = var7 - 1;
            }
            if (this.field3601 < 0) {
                if (this.field3600) {
                    if (this.field3590 < 0) {
                        var9 = this.method1383(arg0, arg1, var5, var10, var4.field4361[this.field3599]);
                        if (this.field3596 >= var5) {
                            return;
                        }
                        this.field3596 = var5 + var5 - 1 - this.field3596;
                        this.field3590 = -this.field3590;
                    }
                    while (true) {
                        int var11 = this.method1376(arg0, var9, var6, var10, var4.field4361[this.field3603 - 1]);
                        if (this.field3596 < var6) {
                            return;
                        }
                        this.field3596 = var6 + var6 - 1 - this.field3596;
                        this.field3590 = -this.field3590;
                        var9 = this.method1383(arg0, var11, var5, var10, var4.field4361[this.field3599]);
                        if (this.field3596 >= var5) {
                            return;
                        }
                        this.field3596 = var5 + var5 - 1 - this.field3596;
                        this.field3590 = -this.field3590;
                    }
                } else if (this.field3590 < 0) {
                    while (true) {
                        var9 = this.method1383(arg0, var9, var5, var10, var4.field4361[this.field3603 - 1]);
                        if (this.field3596 >= var5) {
                            return;
                        }
                        this.field3596 = var6 - 1 - (var6 - 1 - this.field3596) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1376(arg0, var9, var6, var10, var4.field4361[this.field3599]);
                        if (this.field3596 < var6) {
                            return;
                        }
                        this.field3596 = (this.field3596 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3601 > 0) {
                    if (this.field3600) {
                        label130: {
                            if (this.field3590 < 0) {
                                var9 = this.method1383(arg0, arg1, var5, var10, var4.field4361[this.field3599]);
                                if (this.field3596 >= var5) {
                                    return;
                                }
                                this.field3596 = var5 + var5 - 1 - this.field3596;
                                this.field3590 = -this.field3590;
                                if (--this.field3601 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1376(arg0, var9, var6, var10, var4.field4361[this.field3603 - 1]);
                                if (this.field3596 < var6) {
                                    return;
                                }
                                this.field3596 = var6 + var6 - 1 - this.field3596;
                                this.field3590 = -this.field3590;
                                if (--this.field3601 == 0) {
                                    break;
                                }
                                var9 = this.method1383(arg0, var9, var5, var10, var4.field4361[this.field3599]);
                                if (this.field3596 >= var5) {
                                    return;
                                }
                                this.field3596 = var5 + var5 - 1 - this.field3596;
                                this.field3590 = -this.field3590;
                            } while (--this.field3601 != 0);
                        }
                    } else if (this.field3590 < 0) {
                        while (true) {
                            var9 = this.method1383(arg0, var9, var5, var10, var4.field4361[this.field3603 - 1]);
                            if (this.field3596 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3596) / var8;
                            if (var12 >= this.field3601) {
                                this.field3596 += this.field3601 * var8;
                                this.field3601 = 0;
                                break;
                            }
                            this.field3596 += var8 * var12;
                            this.field3601 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1376(arg0, var9, var6, var10, var4.field4361[this.field3599]);
                            if (this.field3596 < var6) {
                                return;
                            }
                            int var13 = (this.field3596 - var5) / var8;
                            if (var13 >= this.field3601) {
                                this.field3596 -= this.field3601 * var8;
                                this.field3601 = 0;
                                break;
                            }
                            this.field3596 -= var8 * var13;
                            this.field3601 -= var13;
                        }
                    }
                }
                if (this.field3590 < 0) {
                    this.method1383(arg0, var9, 0, var10, 0);
                    if (this.field3596 < 0) {
                        this.field3596 = -1;
                        this.method1385();
                        this.method1614(-1204826926);
                        return;
                    }
                } else {
                    this.method1376(arg0, var9, var7, var10, 0);
                    if (this.field3596 >= var7) {
                        this.field3596 = var7;
                        this.method1385();
                        this.method1614(-1204826926);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()I")
    public final int method964() {
        int var1 = this.field3602 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3601 == 0) {
            var2 -= this.field3596 * var2 / (((class250) super.field2683).field4361.length << 8);
        } else if (this.field3601 >= 0) {
            var2 -= this.field3599 * var2 / ((class250) super.field2683).field4361.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()I")
    public final int method741() {
        return this.field3595 == 0 && this.field3597 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
    public final synchronized void method1372(int arg0) {
        if (arg0 == 0) {
            this.method1353(0);
            this.method1614(-1204826926);
        } else if (this.field3598 == 0 && this.field3589 == 0) {
            this.field3597 = 0;
            this.field3595 = 0;
            this.field3602 = 0;
            this.method1614(-1204826926);
        } else {
            int var2 = -this.field3602;
            if (this.field3602 > var2) {
                var2 = this.field3602;
            }
            if (-this.field3598 > var2) {
                var2 = -this.field3598;
            }
            if (this.field3598 > var2) {
                var2 = this.field3598;
            }
            if (-this.field3589 > var2) {
                var2 = -this.field3589;
            }
            if (this.field3589 > var2) {
                var2 = this.field3589;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3597 = arg0;
            this.field3595 = Integer.MIN_VALUE;
            this.field3593 = -this.field3602 / arg0;
            this.field3592 = -this.field3598 / arg0;
            this.field3591 = -this.field3589 / arg0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "()I")
    public final synchronized int method1373() {
        return this.field3595 == Integer.MIN_VALUE ? 0 : this.field3595;
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "()V")
    private final void method1374() {
        this.field3602 = this.field3595;
        this.field3598 = method1367(this.field3595, this.field3594);
        this.field3589 = method1359(this.field3595, this.field3594);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II[B[IIIIIIIILkd;II)I")
    private static final int method1375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
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
        arg11.field3596 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)I")
    private final int method1376(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3597 <= 0) {
                if (this.field3590 == 256 && (this.field3596 & 255) == 0) {
                    if (class137.field2526) {
                        return method1358(0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, 0, arg3, arg2, this);
                    }
                    return method1349(((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, 0, arg3, arg2, this);
                }
                if (class137.field2526) {
                    return method1361(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, 0, arg3, arg2, this, this.field3590, arg4);
                }
                return method1355(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, 0, arg3, arg2, this, this.field3590, arg4);
            }
            int var6 = this.field3597 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3597 += arg1;
            if (this.field3590 == 256 && (this.field3596 & 255) == 0) {
                if (class137.field2526) {
                    arg1 = method1369(0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, this.field3592, this.field3591, 0, var6, arg2, this);
                } else {
                    arg1 = method1350(((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, this.field3593, 0, var6, arg2, this);
                }
            } else if (class137.field2526) {
                arg1 = method1371(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, this.field3592, this.field3591, 0, var6, arg2, this, this.field3590, arg4);
            } else {
                arg1 = method1381(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, this.field3593, 0, var6, arg2, this, this.field3590, arg4);
            }
            this.field3597 -= arg1;
            if (this.field3597 != 0) {
                return arg1;
            }
        } while (!this.method1365());
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public final synchronized void method1377(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1386(arg1, arg2);
        } else {
            int var4 = method1367(arg1, arg2);
            int var5 = method1359(arg1, arg2);
            if (this.field3598 == var4 && this.field3589 == var5) {
                this.field3597 = 0;
            } else {
                int var6 = arg1 - this.field3602;
                if (this.field3602 - arg1 > var6) {
                    var6 = this.field3602 - arg1;
                }
                if (var4 - this.field3598 > var6) {
                    var6 = var4 - this.field3598;
                }
                if (this.field3598 - var4 > var6) {
                    var6 = this.field3598 - var4;
                }
                if (var5 - this.field3589 > var6) {
                    var6 = var5 - this.field3589;
                }
                if (this.field3589 - var5 > var6) {
                    var6 = this.field3589 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3597 = arg0;
                this.field3595 = arg1;
                this.field3594 = arg2;
                this.field3593 = (arg1 - this.field3602) / arg0;
                this.field3592 = (var4 - this.field3598) / arg0;
                this.field3591 = (var5 - this.field3589) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
    public final synchronized void method1378(int arg0) {
        if (this.field3590 < 0) {
            this.field3590 = -arg0;
        } else {
            this.field3590 = arg0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "()Z")
    public final boolean method1379() {
        return this.field3596 < 0 || this.field3596 >= ((class250) super.field2683).field4361.length << 8;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "([B[IIIIIIILkd;)I")
    private static final int method1380(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class199 arg8) {
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
        arg8.field3596 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II[B[IIIIIIIILkd;II)I")
    private static final int method1381(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
        arg11.field3598 -= arg11.field3592 * arg5;
        arg11.field3589 -= arg11.field3591 * arg5;
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
        arg11.field3598 += arg11.field3592 * arg5;
        arg11.field3589 += arg11.field3591 * arg5;
        arg11.field3602 = arg6;
        arg11.field3596 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I[B[IIIIIIIILkd;)I")
    private static final int method1382(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class199 arg10) {
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
        arg10.field3596 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "([IIIII)I")
    private final int method1383(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3597 <= 0) {
                if (this.field3590 == -256 && (this.field3596 & 255) == 0) {
                    if (class137.field2526) {
                        return method1382(0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, 0, arg3, arg2, this);
                    }
                    return method1380(((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, 0, arg3, arg2, this);
                }
                if (class137.field2526) {
                    return method1375(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, 0, arg3, arg2, this, this.field3590, arg4);
                }
                return method1357(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, 0, arg3, arg2, this, this.field3590, arg4);
            }
            int var6 = this.field3597 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3597 += arg1;
            if (this.field3590 == -256 && (this.field3596 & 255) == 0) {
                if (class137.field2526) {
                    arg1 = method1351(0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, this.field3592, this.field3591, 0, var6, arg2, this);
                } else {
                    arg1 = method1364(((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, this.field3593, 0, var6, arg2, this);
                }
            } else if (class137.field2526) {
                arg1 = method1360(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3598, this.field3589, this.field3592, this.field3591, 0, var6, arg2, this, this.field3590, arg4);
            } else {
                arg1 = method1384(0, 0, ((class250) super.field2683).field4361, arg0, this.field3596, arg1, this.field3602, this.field3593, 0, var6, arg2, this, this.field3590, arg4);
            }
            this.field3597 -= arg1;
            if (this.field3597 != 0) {
                return arg1;
            }
        } while (!this.method1365());
        return arg3;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(II[B[IIIIIIIILkd;II)I")
    private static final int method1384(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class199 arg11, int arg12, int arg13) {
        arg11.field3598 -= arg11.field3592 * arg5;
        arg11.field3589 -= arg11.field3591 * arg5;
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
        arg11.field3598 += arg11.field3592 * arg5;
        arg11.field3589 += arg11.field3591 * arg5;
        arg11.field3602 = arg6;
        arg11.field3596 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()Lv;")
    public final class147 method747() {
        return null;
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "()V")
    private final void method1385() {
        if (this.field3597 != 0) {
            if (this.field3595 == Integer.MIN_VALUE) {
                this.field3595 = 0;
            }
            this.field3597 = 0;
            this.method1374();
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
    private final synchronized void method1386(int arg0, int arg1) {
        this.field3595 = arg0;
        this.field3594 = arg1;
        this.field3597 = 0;
        this.method1374();
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lik;II)V")
    private class199(class250 arg0, int arg1, int arg2) {
        super.field2683 = arg0;
        this.field3599 = arg0.field4359;
        this.field3603 = arg0.field4358;
        this.field3600 = arg0.field4360;
        this.field3590 = arg1;
        this.field3595 = arg2;
        this.field3594 = 8192;
        this.field3596 = 0;
        this.method1374();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lik;III)Lkd;")
    public static final class199 method1387(class250 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4361 != null && arg0.field4361.length != 0 ? new class199(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lik;III)V")
    private class199(class250 arg0, int arg1, int arg2, int arg3) {
        super.field2683 = arg0;
        this.field3599 = arg0.field4359;
        this.field3603 = arg0.field4358;
        this.field3600 = arg0.field4360;
        this.field3590 = arg1;
        this.field3595 = arg2;
        this.field3594 = arg3;
        this.field3596 = 0;
        this.method1374();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()Lv;")
    public final class147 method742() {
        return null;
    }
}
