import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class71 extends class8 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Z")
    private boolean field1521;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lag;")
    public final class8 method51() {
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
    public final synchronized int method469() {
        return this.field1515 < 0 ? -this.field1515 : this.field1515;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[B[IIIIIIILha;II)I")
    private static final int method470(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
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
        arg10.field1509 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvf;II)Lha;")
    public static final class71 method471(class203 arg0, int arg1, int arg2) {
        return arg0.field3926 != null && arg0.field3926.length != 0 ? new class71(arg0, (int) ((long) arg0.field3927 * 256L * (long) arg1 / (long) (class175.field3378 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public final boolean method472() {
        return this.field1511 != 0;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()I")
    public final synchronized int method473() {
        return this.field1517 < 0 ? -1 : this.field1517;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([B[IIIIIIIILha;)I")
    private static final int method474(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1518 += (var14 - arg3) * arg9.field1522;
        arg9.field1519 += (var14 - arg3) * arg9.field1513;
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
        arg9.field1516 = var12 >> 2;
        arg9.field1509 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B[IIIIIIIILha;)I")
    private static final int method475(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
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
        arg10.field1509 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public final synchronized void method476(boolean arg0) {
        this.field1515 = (this.field1515 >>> 31) + (this.field1515 ^ this.field1515 >> 31);
        if (arg0) {
            this.field1515 = -this.field1515;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public final int method54() {
        return this.field1520 == 0 && this.field1511 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIII)I")
    private final int method477(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1511 <= 0) {
                if (this.field1515 == -256 && (this.field1509 & 255) == 0) {
                    if (class76.field1583) {
                        return method475(0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, 0, arg3, arg2, this);
                    }
                    return method484(((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, 0, arg3, arg2, this);
                }
                if (class76.field1583) {
                    return method489(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, 0, arg3, arg2, this, this.field1515, arg4);
                }
                return method470(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, 0, arg3, arg2, this, this.field1515, arg4);
            }
            int var6 = this.field1511 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1511 += arg1;
            if (this.field1515 == -256 && (this.field1509 & 255) == 0) {
                if (class76.field1583) {
                    arg1 = method482(0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, this.field1522, this.field1513, 0, var6, arg2, this);
                } else {
                    arg1 = method483(((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, this.field1508, 0, var6, arg2, this);
                }
            } else if (class76.field1583) {
                arg1 = method499(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, this.field1522, this.field1513, 0, var6, arg2, this, this.field1515, arg4);
            } else {
                arg1 = method497(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, this.field1508, 0, var6, arg2, this, this.field1515, arg4);
            }
            this.field1511 -= arg1;
            if (this.field1511 != 0) {
                return arg1;
            }
        } while (!this.method496());
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public final synchronized void method478(int arg0) {
        if (arg0 == 0) {
            this.method480(0);
            this.method1370(118);
        } else if (this.field1518 == 0 && this.field1519 == 0) {
            this.field1511 = 0;
            this.field1520 = 0;
            this.field1516 = 0;
            this.method1370(125);
        } else {
            int var2 = -this.field1516;
            if (this.field1516 > var2) {
                var2 = this.field1516;
            }
            if (-this.field1518 > var2) {
                var2 = -this.field1518;
            }
            if (this.field1518 > var2) {
                var2 = this.field1518;
            }
            if (-this.field1519 > var2) {
                var2 = -this.field1519;
            }
            if (this.field1519 > var2) {
                var2 = this.field1519;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1511 = arg0;
            this.field1520 = Integer.MIN_VALUE;
            this.field1508 = -this.field1516 / arg0;
            this.field1522 = -this.field1518 / arg0;
            this.field1513 = -this.field1519 / arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()I")
    public final synchronized int method479() {
        return this.field1520 == Integer.MIN_VALUE ? 0 : this.field1520;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    private final synchronized void method480(int arg0) {
        this.method504(arg0, this.method473());
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method481(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1518 -= arg11.field1522 * arg5;
        arg11.field1519 -= arg11.field1513 * arg5;
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
        arg11.field1518 += arg11.field1522 * arg5;
        arg11.field1519 += arg11.field1513 * arg5;
        arg11.field1516 = arg6;
        arg11.field1509 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B[IIIIIIIIIILha;)I")
    private static final int method482(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
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
        arg12.field1516 += (var19 - arg4) * arg12.field1508;
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
        arg12.field1518 = var15 >> 2;
        arg12.field1519 = var16 >> 2;
        arg12.field1509 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([B[IIIIIIIILha;)I")
    private static final int method483(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class71 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1518 += (var14 - arg3) * arg9.field1522;
        arg9.field1519 += (var14 - arg3) * arg9.field1513;
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
        arg9.field1516 = var12 >> 2;
        arg9.field1509 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([B[IIIIIIILha;)I")
    private static final int method484(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
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
        arg8.field1509 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I[B[IIIIIIIILha;)I")
    private static final int method485(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10) {
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
        arg10.field1509 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public final synchronized void method486(int arg0) {
        if (this.field1515 < 0) {
            this.field1515 = -arg0;
        } else {
            this.field1515 = arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public final synchronized void method487(int arg0) {
        int var2 = ((class203) super.field320).field3926.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1509 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method488(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
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
        arg11.field1509 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public final synchronized void method56(int arg0) {
        if (this.field1511 > 0) {
            if (arg0 >= this.field1511) {
                if (this.field1520 == Integer.MIN_VALUE) {
                    this.field1520 = 0;
                    this.field1516 = this.field1518 = this.field1519 = 0;
                    this.method1370(122);
                    arg0 = this.field1511;
                }
                this.field1511 = 0;
                this.method490();
            } else {
                this.field1516 += this.field1508 * arg0;
                this.field1518 += this.field1522 * arg0;
                this.field1519 += this.field1513 * arg0;
                this.field1511 -= arg0;
            }
        }
        class203 var2 = (class203) super.field320;
        int var3 = this.field1512 << 8;
        int var4 = this.field1514 << 8;
        int var5 = var2.field3926.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1510 = 0;
        }
        if (this.field1509 < 0) {
            if (this.field1515 <= 0) {
                this.method495();
                this.method1370(123);
                return;
            }
            this.field1509 = 0;
        }
        if (this.field1509 >= var5) {
            if (this.field1515 >= 0) {
                this.method495();
                this.method1370(120);
                return;
            }
            this.field1509 = var5 - 1;
        }
        this.field1509 += this.field1515 * arg0;
        if (this.field1510 < 0) {
            if (!this.field1521) {
                if (this.field1515 < 0) {
                    if (this.field1509 < var3) {
                        this.field1509 = var4 - 1 - (var4 - 1 - this.field1509) % var6;
                    }
                } else if (this.field1509 >= var4) {
                    this.field1509 = (this.field1509 - var3) % var6 + var3;
                }
            } else {
                if (this.field1515 < 0) {
                    if (this.field1509 >= var3) {
                        return;
                    }
                    this.field1509 = var3 + var3 - 1 - this.field1509;
                    this.field1515 = -this.field1515;
                }
                while (this.field1509 >= var4) {
                    this.field1509 = var4 + var4 - 1 - this.field1509;
                    this.field1515 = -this.field1515;
                    if (this.field1509 >= var3) {
                        return;
                    }
                    this.field1509 = var3 + var3 - 1 - this.field1509;
                    this.field1515 = -this.field1515;
                }
            }
        } else {
            if (this.field1510 > 0) {
                if (this.field1521) {
                    label125: {
                        if (this.field1515 < 0) {
                            if (this.field1509 >= var3) {
                                return;
                            }
                            this.field1509 = var3 + var3 - 1 - this.field1509;
                            this.field1515 = -this.field1515;
                            if (--this.field1510 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1509 < var4) {
                                return;
                            }
                            this.field1509 = var4 + var4 - 1 - this.field1509;
                            this.field1515 = -this.field1515;
                            if (--this.field1510 == 0) {
                                break;
                            }
                            if (this.field1509 >= var3) {
                                return;
                            }
                            this.field1509 = var3 + var3 - 1 - this.field1509;
                            this.field1515 = -this.field1515;
                        } while (--this.field1510 != 0);
                    }
                } else if (this.field1515 < 0) {
                    if (this.field1509 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1509) / var6;
                    if (var7 < this.field1510) {
                        this.field1509 += var6 * var7;
                        this.field1510 -= var7;
                        return;
                    }
                    this.field1509 += this.field1510 * var6;
                    this.field1510 = 0;
                } else {
                    if (this.field1509 < var4) {
                        return;
                    }
                    int var8 = (this.field1509 - var3) / var6;
                    if (var8 < this.field1510) {
                        this.field1509 -= var6 * var8;
                        this.field1510 -= var8;
                        return;
                    }
                    this.field1509 -= this.field1510 * var6;
                    this.field1510 = 0;
                }
            }
            if (this.field1515 < 0) {
                if (this.field1509 < 0) {
                    this.field1509 = -1;
                    this.method495();
                    this.method1370(118);
                    return;
                }
            } else if (this.field1509 >= var5) {
                this.field1509 = var5;
                this.method495();
                this.method1370(120);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method489(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
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
        arg11.field1509 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()V")
    private final void method490() {
        this.field1516 = this.field1520;
        this.field1518 = method505(this.field1520, this.field1517);
        this.field1519 = method506(this.field1520, this.field1517);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public final synchronized void method491(int arg0, int arg1) {
        this.method507(arg0, arg1, this.method473());
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[B[IIIIIIILha;II)I")
    private static final int method492(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class71 arg10, int arg11, int arg12) {
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
        arg10.field1509 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([IIIII)I")
    private final int method493(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1511 <= 0) {
                if (this.field1515 == 256 && (this.field1509 & 255) == 0) {
                    if (class76.field1583) {
                        return method485(0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, 0, arg3, arg2, this);
                    }
                    return method498(((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, 0, arg3, arg2, this);
                }
                if (class76.field1583) {
                    return method488(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, 0, arg3, arg2, this, this.field1515, arg4);
                }
                return method492(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, 0, arg3, arg2, this, this.field1515, arg4);
            }
            int var6 = this.field1511 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1511 += arg1;
            if (this.field1515 == 256 && (this.field1509 & 255) == 0) {
                if (class76.field1583) {
                    arg1 = method503(0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, this.field1522, this.field1513, 0, var6, arg2, this);
                } else {
                    arg1 = method474(((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, this.field1508, 0, var6, arg2, this);
                }
            } else if (class76.field1583) {
                arg1 = method501(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1518, this.field1519, this.field1522, this.field1513, 0, var6, arg2, this, this.field1515, arg4);
            } else {
                arg1 = method481(0, 0, ((class203) super.field320).field3926, arg0, this.field1509, arg1, this.field1516, this.field1508, 0, var6, arg2, this, this.field1515, arg4);
            }
            this.field1511 -= arg1;
            if (this.field1511 != 0) {
                return arg1;
            }
        } while (!this.method496());
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()I")
    public final int method53() {
        int var1 = this.field1516 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1510 == 0) {
            var2 -= this.field1509 * var2 / (((class203) super.field320).field3926.length << 8);
        } else if (this.field1510 >= 0) {
            var2 -= this.field1512 * var2 / ((class203) super.field320).field3926.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvf;III)Lha;")
    public static final class71 method494(class203 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3926 != null && arg0.field3926.length != 0 ? new class71(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
    private final void method495() {
        if (this.field1511 != 0) {
            if (this.field1520 == Integer.MIN_VALUE) {
                this.field1520 = 0;
            }
            this.field1511 = 0;
            this.method490();
        }
    }

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    private final boolean method496() {
        int var1 = this.field1520;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method505(var1, this.field1517);
            var2 = method506(var1, this.field1517);
        }
        if (this.field1516 == var1 && this.field1518 == var3 && this.field1519 == var2) {
            if (this.field1520 == Integer.MIN_VALUE) {
                this.field1520 = 0;
                this.field1516 = this.field1518 = this.field1519 = 0;
                this.method1370(-78);
                return true;
            } else {
                this.method490();
                return false;
            }
        } else {
            if (this.field1516 < var1) {
                this.field1508 = 1;
                this.field1511 = var1 - this.field1516;
            } else if (this.field1516 > var1) {
                this.field1508 = -1;
                this.field1511 = this.field1516 - var1;
            } else {
                this.field1508 = 0;
            }
            if (this.field1518 < var3) {
                this.field1522 = 1;
                if (this.field1511 == 0 || this.field1511 > var3 - this.field1518) {
                    this.field1511 = var3 - this.field1518;
                }
            } else if (this.field1518 > var3) {
                this.field1522 = -1;
                if (this.field1511 == 0 || this.field1511 > this.field1518 - var3) {
                    this.field1511 = this.field1518 - var3;
                }
            } else {
                this.field1522 = 0;
            }
            if (this.field1519 < var2) {
                this.field1513 = 1;
                if (this.field1511 == 0 || this.field1511 > var2 - this.field1519) {
                    this.field1511 = var2 - this.field1519;
                }
            } else if (this.field1519 > var2) {
                this.field1513 = -1;
                if (this.field1511 == 0 || this.field1511 > this.field1519 - var2) {
                    this.field1511 = this.field1519 - var2;
                }
            } else {
                this.field1513 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method497(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class71 arg11, int arg12, int arg13) {
        arg11.field1518 -= arg11.field1522 * arg5;
        arg11.field1519 -= arg11.field1513 * arg5;
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
        arg11.field1518 += arg11.field1522 * arg5;
        arg11.field1519 += arg11.field1513 * arg5;
        arg11.field1516 = arg6;
        arg11.field1509 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lag;")
    public final class8 method57() {
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([B[IIIIIIILha;)I")
    private static final int method498(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class71 arg8) {
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
        arg8.field1509 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
    public final synchronized void method52(int[] arg0, int arg1, int arg2) {
        if (this.field1520 == 0 && this.field1511 == 0) {
            this.method56(arg2);
        } else {
            class203 var4 = (class203) super.field320;
            int var5 = this.field1512 << 8;
            int var6 = this.field1514 << 8;
            int var7 = var4.field3926.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1510 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1509 < 0) {
                if (this.field1515 <= 0) {
                    this.method495();
                    this.method1370(121);
                    return;
                }
                this.field1509 = 0;
            }
            if (this.field1509 >= var7) {
                if (this.field1515 >= 0) {
                    this.method495();
                    this.method1370(125);
                    return;
                }
                this.field1509 = var7 - 1;
            }
            if (this.field1510 < 0) {
                if (this.field1521) {
                    if (this.field1515 < 0) {
                        var9 = this.method477(arg0, arg1, var5, var10, var4.field3926[this.field1512]);
                        if (this.field1509 >= var5) {
                            return;
                        }
                        this.field1509 = var5 + var5 - 1 - this.field1509;
                        this.field1515 = -this.field1515;
                    }
                    while (true) {
                        int var11 = this.method493(arg0, var9, var6, var10, var4.field3926[this.field1514 - 1]);
                        if (this.field1509 < var6) {
                            return;
                        }
                        this.field1509 = var6 + var6 - 1 - this.field1509;
                        this.field1515 = -this.field1515;
                        var9 = this.method477(arg0, var11, var5, var10, var4.field3926[this.field1512]);
                        if (this.field1509 >= var5) {
                            return;
                        }
                        this.field1509 = var5 + var5 - 1 - this.field1509;
                        this.field1515 = -this.field1515;
                    }
                } else if (this.field1515 < 0) {
                    while (true) {
                        var9 = this.method477(arg0, var9, var5, var10, var4.field3926[this.field1514 - 1]);
                        if (this.field1509 >= var5) {
                            return;
                        }
                        this.field1509 = var6 - 1 - (var6 - 1 - this.field1509) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method493(arg0, var9, var6, var10, var4.field3926[this.field1512]);
                        if (this.field1509 < var6) {
                            return;
                        }
                        this.field1509 = (this.field1509 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1510 > 0) {
                    if (this.field1521) {
                        label130: {
                            if (this.field1515 < 0) {
                                var9 = this.method477(arg0, arg1, var5, var10, var4.field3926[this.field1512]);
                                if (this.field1509 >= var5) {
                                    return;
                                }
                                this.field1509 = var5 + var5 - 1 - this.field1509;
                                this.field1515 = -this.field1515;
                                if (--this.field1510 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method493(arg0, var9, var6, var10, var4.field3926[this.field1514 - 1]);
                                if (this.field1509 < var6) {
                                    return;
                                }
                                this.field1509 = var6 + var6 - 1 - this.field1509;
                                this.field1515 = -this.field1515;
                                if (--this.field1510 == 0) {
                                    break;
                                }
                                var9 = this.method477(arg0, var9, var5, var10, var4.field3926[this.field1512]);
                                if (this.field1509 >= var5) {
                                    return;
                                }
                                this.field1509 = var5 + var5 - 1 - this.field1509;
                                this.field1515 = -this.field1515;
                            } while (--this.field1510 != 0);
                        }
                    } else if (this.field1515 < 0) {
                        while (true) {
                            var9 = this.method477(arg0, var9, var5, var10, var4.field3926[this.field1514 - 1]);
                            if (this.field1509 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1509) / var8;
                            if (var12 >= this.field1510) {
                                this.field1509 += this.field1510 * var8;
                                this.field1510 = 0;
                                break;
                            }
                            this.field1509 += var8 * var12;
                            this.field1510 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method493(arg0, var9, var6, var10, var4.field3926[this.field1512]);
                            if (this.field1509 < var6) {
                                return;
                            }
                            int var13 = (this.field1509 - var5) / var8;
                            if (var13 >= this.field1510) {
                                this.field1509 -= this.field1510 * var8;
                                this.field1510 = 0;
                                break;
                            }
                            this.field1509 -= var8 * var13;
                            this.field1510 -= var13;
                        }
                    }
                }
                if (this.field1515 < 0) {
                    this.method477(arg0, var9, 0, var10, 0);
                    if (this.field1509 < 0) {
                        this.field1509 = -1;
                        this.method495();
                        this.method1370(-27);
                        return;
                    }
                } else {
                    this.method493(arg0, var9, var7, var10, 0);
                    if (this.field1509 >= var7) {
                        this.field1509 = var7;
                        this.method495();
                        this.method1370(21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[B[IIIIIIIIIILha;II)I")
    private static final int method499(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1516 -= arg13.field1508 * arg5;
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
        arg13.field1516 += arg13.field1508 * var22;
        arg13.field1518 = arg6;
        arg13.field1519 = arg7;
        arg13.field1509 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public final synchronized void method500(int arg0) {
        this.field1510 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[B[IIIIIIIIIILha;II)I")
    private static final int method501(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class71 arg13, int arg14, int arg15) {
        arg13.field1516 -= arg13.field1508 * arg5;
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
        arg13.field1516 += arg13.field1508 * var22;
        arg13.field1518 = arg6;
        arg13.field1519 = arg7;
        arg13.field1509 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public final synchronized void method502(int arg0) {
        this.method504(arg0 << 6, this.method473());
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I[B[IIIIIIIIIILha;)I")
    private static final int method503(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class71 arg12) {
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
        arg12.field1516 += (var19 - arg4) * arg12.field1508;
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
        arg12.field1518 = var15 >> 2;
        arg12.field1519 = var16 >> 2;
        arg12.field1509 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    private final synchronized void method504(int arg0, int arg1) {
        this.field1520 = arg0;
        this.field1517 = arg1;
        this.field1511 = 0;
        this.method490();
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lvf;II)V")
    private class71(class203 arg0, int arg1, int arg2) {
        super.field320 = arg0;
        this.field1512 = arg0.field3924;
        this.field1514 = arg0.field3925;
        this.field1521 = arg0.field3928;
        this.field1515 = arg1;
        this.field1520 = arg2;
        this.field1517 = 8192;
        this.field1509 = 0;
        this.method490();
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    private static final int method505(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    private static final int method506(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public final synchronized void method507(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method504(arg1, arg2);
        } else {
            int var4 = method505(arg1, arg2);
            int var5 = method506(arg1, arg2);
            if (this.field1518 == var4 && this.field1519 == var5) {
                this.field1511 = 0;
            } else {
                int var6 = arg1 - this.field1516;
                if (this.field1516 - arg1 > var6) {
                    var6 = this.field1516 - arg1;
                }
                if (var4 - this.field1518 > var6) {
                    var6 = var4 - this.field1518;
                }
                if (this.field1518 - var4 > var6) {
                    var6 = this.field1518 - var4;
                }
                if (var5 - this.field1519 > var6) {
                    var6 = var5 - this.field1519;
                }
                if (this.field1519 - var5 > var6) {
                    var6 = this.field1519 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1511 = arg0;
                this.field1520 = arg1;
                this.field1517 = arg2;
                this.field1508 = (arg1 - this.field1516) / arg0;
                this.field1522 = (var4 - this.field1518) / arg0;
                this.field1513 = (var5 - this.field1519) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public final boolean method508() {
        return this.field1509 < 0 || this.field1509 >= ((class203) super.field320).field3926.length << 8;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lvf;III)V")
    private class71(class203 arg0, int arg1, int arg2, int arg3) {
        super.field320 = arg0;
        this.field1512 = arg0.field3924;
        this.field1514 = arg0.field3925;
        this.field1521 = arg0.field3928;
        this.field1515 = arg1;
        this.field1520 = arg2;
        this.field1517 = arg3;
        this.field1509 = 0;
        this.method490();
    }
}
