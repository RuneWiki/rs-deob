import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class250 extends class461 {

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "Z")
    private boolean field3520;

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    private int field3507;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    private int field3519;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    private int field3510;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    private int field3512;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    private int field3515;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    private int field3517;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([IIIII)I")
    private final int method1514(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3515 <= 0) {
                if (this.field3518 == 256 && (this.field3513 & 255) == 0) {
                    if (class137.field1664) {
                        return method1519(0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, 0, arg3, arg2, this);
                    }
                    return method1515(((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, 0, arg3, arg2, this);
                }
                if (class137.field1664) {
                    return method1542(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, 0, arg3, arg2, this, this.field3518, arg4);
                }
                return method1544(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, 0, arg3, arg2, this, this.field3518, arg4);
            }
            int var6 = this.field3515 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3515 += arg1;
            if (this.field3518 == 256 && (this.field3513 & 255) == 0) {
                if (class137.field1664) {
                    arg1 = method1529(0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, this.field3517, this.field3510, 0, var6, arg2, this);
                } else {
                    arg1 = method1548(((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, this.field3516, 0, var6, arg2, this);
                }
            } else if (class137.field1664) {
                arg1 = method1545(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, this.field3517, this.field3510, 0, var6, arg2, this, this.field3518, arg4);
            } else {
                arg1 = method1534(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, this.field3516, 0, var6, arg2, this, this.field3518, arg4);
            }
            this.field3515 -= arg1;
            if (this.field3515 != 0) {
                return arg1;
            }
        } while (!this.method1516());
        return arg3;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([B[IIIIIIILjr;)I")
    private static final int method1515(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class250 arg8) {
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
        arg8.field3513 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "()Z")
    private final boolean method1516() {
        int var1 = this.field3507;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1547(var1, this.field3519);
            var2 = method1521(var1, this.field3519);
        }
        if (this.field3512 == var1 && this.field3511 == var3 && this.field3508 == var2) {
            if (this.field3507 == Integer.MIN_VALUE) {
                this.field3507 = 0;
                this.field3512 = this.field3511 = this.field3508 = 0;
                this.method702((byte) -114);
                return true;
            } else {
                this.method1541();
                return false;
            }
        } else {
            if (this.field3512 < var1) {
                this.field3516 = 1;
                this.field3515 = var1 - this.field3512;
            } else if (this.field3512 > var1) {
                this.field3516 = -1;
                this.field3515 = this.field3512 - var1;
            } else {
                this.field3516 = 0;
            }
            if (this.field3511 < var3) {
                this.field3517 = 1;
                if (this.field3515 == 0 || this.field3515 > var3 - this.field3511) {
                    this.field3515 = var3 - this.field3511;
                }
            } else if (this.field3511 > var3) {
                this.field3517 = -1;
                if (this.field3515 == 0 || this.field3515 > this.field3511 - var3) {
                    this.field3515 = this.field3511 - var3;
                }
            } else {
                this.field3517 = 0;
            }
            if (this.field3508 < var2) {
                this.field3510 = 1;
                if (this.field3515 == 0 || this.field3515 > var2 - this.field3508) {
                    this.field3515 = var2 - this.field3508;
                }
            } else if (this.field3508 > var2) {
                this.field3510 = -1;
                if (this.field3515 == 0 || this.field3515 > this.field3508 - var2) {
                    this.field3515 = this.field3508 - var2;
                }
            } else {
                this.field3510 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
    public final synchronized void method1517(int arg0) {
        int var2 = ((class436) super.field6502).field6268.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3513 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "()V")
    private final void method1518() {
        if (this.field3515 != 0) {
            if (this.field3507 == Integer.MIN_VALUE) {
                this.field3507 = 0;
            }
            this.field3515 = 0;
            this.method1541();
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[B[IIIIIIIILjr;)I")
    private static final int method1519(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class250 arg10) {
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
        arg10.field3513 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
    public final synchronized void method1520(int arg0, int arg1) {
        this.method1523(arg0, arg1, this.method1526());
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
    private static final int method1521(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
    public final synchronized void method1522(boolean arg0) {
        this.field3518 = (this.field3518 >>> 31) + (this.field3518 ^ this.field3518 >> 31);
        if (arg0) {
            this.field3518 = -this.field3518;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
    public final synchronized void method1523(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1537(arg1, arg2);
        } else {
            int var4 = method1547(arg1, arg2);
            int var5 = method1521(arg1, arg2);
            if (this.field3511 == var4 && this.field3508 == var5) {
                this.field3515 = 0;
            } else {
                int var6 = arg1 - this.field3512;
                if (this.field3512 - arg1 > var6) {
                    var6 = this.field3512 - arg1;
                }
                if (var4 - this.field3511 > var6) {
                    var6 = var4 - this.field3511;
                }
                if (this.field3511 - var4 > var6) {
                    var6 = this.field3511 - var4;
                }
                if (var5 - this.field3508 > var6) {
                    var6 = var5 - this.field3508;
                }
                if (this.field3508 - var5 > var6) {
                    var6 = this.field3508 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3515 = arg0;
                this.field3507 = arg1;
                this.field3519 = arg2;
                this.field3516 = (arg1 - this.field3512) / arg0;
                this.field3517 = (var4 - this.field3511) / arg0;
                this.field3510 = (var5 - this.field3508) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V")
    public final synchronized void method1524(int arg0) {
        this.field3514 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljk;III)Ljr;")
    public static final class250 method1525(class436 arg0, int arg1, int arg2, int arg3) {
        return arg0.field6268 != null && arg0.field6268.length != 0 ? new class250(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "()I")
    public final synchronized int method1526() {
        return this.field3519 < 0 ? -1 : this.field3519;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[B[IIIIIIIILjr;II)I")
    private static final int method1527(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class250 arg11, int arg12, int arg13) {
        arg11.field3511 -= arg11.field3517 * arg5;
        arg11.field3508 -= arg11.field3510 * arg5;
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
        arg11.field3511 += arg11.field3517 * arg5;
        arg11.field3508 += arg11.field3510 * arg5;
        arg11.field3512 = arg6;
        arg11.field3513 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[B[IIIIIIIIIILjr;II)I")
    private static final int method1528(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class250 arg13, int arg14, int arg15) {
        arg13.field3512 -= arg13.field3516 * arg5;
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
        arg13.field3512 += arg13.field3516 * var22;
        arg13.field3511 = arg6;
        arg13.field3508 = arg7;
        arg13.field3513 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[B[IIIIIIIIIILjr;)I")
    private static final int method1529(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class250 arg12) {
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
        arg12.field3512 += (var19 - arg4) * arg12.field3516;
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
        arg12.field3511 = var15 >> 2;
        arg12.field3508 = var16 >> 2;
        arg12.field3513 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljk;II)Ljr;")
    public static final class250 method1530(class436 arg0, int arg1, int arg2) {
        return arg0.field6268 != null && arg0.field6268.length != 0 ? new class250(arg0, (int) ((long) arg0.field6267 * 256L * (long) arg1 / (long) (class345.field4936 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)V")
    public final synchronized void method1531(int arg0) {
        if (this.field3518 < 0) {
            this.field3518 = -arg0;
        } else {
            this.field3518 = arg0;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I[B[IIIIIIIILjr;)I")
    private static final int method1532(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class250 arg10) {
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
        arg10.field3513 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II[B[IIIIIIILjr;II)I")
    private static final int method1533(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class250 arg10, int arg11, int arg12) {
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
        arg10.field3513 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II[B[IIIIIIIILjr;II)I")
    private static final int method1534(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class250 arg11, int arg12, int arg13) {
        arg11.field3511 -= arg11.field3517 * arg5;
        arg11.field3508 -= arg11.field3510 * arg5;
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
        arg11.field3511 += arg11.field3517 * arg5;
        arg11.field3508 += arg11.field3510 * arg5;
        arg11.field3512 = arg6;
        arg11.field3513 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "([IIIII)I")
    private final int method1535(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3515 <= 0) {
                if (this.field3518 == -256 && (this.field3513 & 255) == 0) {
                    if (class137.field1664) {
                        return method1532(0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, 0, arg3, arg2, this);
                    }
                    return method1539(((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, 0, arg3, arg2, this);
                }
                if (class137.field1664) {
                    return method1551(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, 0, arg3, arg2, this, this.field3518, arg4);
                }
                return method1533(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, 0, arg3, arg2, this, this.field3518, arg4);
            }
            int var6 = this.field3515 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3515 += arg1;
            if (this.field3518 == -256 && (this.field3513 & 255) == 0) {
                if (class137.field1664) {
                    arg1 = method1540(0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, this.field3517, this.field3510, 0, var6, arg2, this);
                } else {
                    arg1 = method1554(((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, this.field3516, 0, var6, arg2, this);
                }
            } else if (class137.field1664) {
                arg1 = method1528(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3511, this.field3508, this.field3517, this.field3510, 0, var6, arg2, this, this.field3518, arg4);
            } else {
                arg1 = method1527(0, 0, ((class436) super.field6502).field6268, arg0, this.field3513, arg1, this.field3512, this.field3516, 0, var6, arg2, this, this.field3518, arg4);
            }
            this.field3515 -= arg1;
            if (this.field3515 != 0) {
                return arg1;
            }
        } while (!this.method1516());
        return arg3;
    }

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "()Z")
    public final boolean method1536() {
        return this.field3513 < 0 || this.field3513 >= ((class436) super.field6502).field6268.length << 8;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(II)V")
    private final synchronized void method1537(int arg0, int arg1) {
        this.field3507 = arg0;
        this.field3519 = arg1;
        this.field3515 = 0;
        this.method1541();
    }

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "()I")
    public final synchronized int method1538() {
        return this.field3518 < 0 ? -this.field3518 : this.field3518;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "()Lrk;")
    public final class461 method517() {
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "([B[IIIIIIILjr;)I")
    private static final int method1539(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class250 arg8) {
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
        arg8.field3513 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I[B[IIIIIIIIIILjr;)I")
    private static final int method1540(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class250 arg12) {
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
        arg12.field3512 += (var19 - arg4) * arg12.field3516;
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
        arg12.field3511 = var15 >> 2;
        arg12.field3508 = var16 >> 2;
        arg12.field3513 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "()V")
    private final void method1541() {
        this.field3512 = this.field3507;
        this.field3511 = method1547(this.field3507, this.field3519);
        this.field3508 = method1521(this.field3507, this.field3519);
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(II[B[IIIIIIIILjr;II)I")
    private static final int method1542(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class250 arg11, int arg12, int arg13) {
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
        arg11.field3513 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
    private final synchronized void method1543(int arg0) {
        this.method1537(arg0, this.method1526());
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "()I")
    public final int method511() {
        return this.field3507 == 0 && this.field3515 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II[B[IIIIIIILjr;II)I")
    private static final int method1544(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class250 arg10, int arg11, int arg12) {
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
        arg10.field3513 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II[B[IIIIIIIIIILjr;II)I")
    private static final int method1545(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class250 arg13, int arg14, int arg15) {
        arg13.field3512 -= arg13.field3516 * arg5;
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
        arg13.field3512 += arg13.field3516 * var22;
        arg13.field3511 = arg6;
        arg13.field3508 = arg7;
        arg13.field3513 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
    public final synchronized void method1546(int arg0) {
        this.method1537(arg0 << 6, this.method1526());
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public final synchronized void method512(int arg0) {
        if (this.field3515 > 0) {
            if (arg0 >= this.field3515) {
                if (this.field3507 == Integer.MIN_VALUE) {
                    this.field3507 = 0;
                    this.field3512 = this.field3511 = this.field3508 = 0;
                    this.method702((byte) -114);
                    arg0 = this.field3515;
                }
                this.field3515 = 0;
                this.method1541();
            } else {
                this.field3512 += this.field3516 * arg0;
                this.field3511 += this.field3517 * arg0;
                this.field3508 += this.field3510 * arg0;
                this.field3515 -= arg0;
            }
        }
        class436 var2 = (class436) super.field6502;
        int var3 = this.field3509 << 8;
        int var4 = this.field3506 << 8;
        int var5 = var2.field6268.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3514 = 0;
        }
        if (this.field3513 < 0) {
            if (this.field3518 <= 0) {
                this.method1518();
                this.method702((byte) -114);
                return;
            }
            this.field3513 = 0;
        }
        if (this.field3513 >= var5) {
            if (this.field3518 >= 0) {
                this.method1518();
                this.method702((byte) -114);
                return;
            }
            this.field3513 = var5 - 1;
        }
        this.field3513 += this.field3518 * arg0;
        if (this.field3514 < 0) {
            if (!this.field3520) {
                if (this.field3518 < 0) {
                    if (this.field3513 < var3) {
                        this.field3513 = var4 - 1 - (var4 - 1 - this.field3513) % var6;
                    }
                } else if (this.field3513 >= var4) {
                    this.field3513 = (this.field3513 - var3) % var6 + var3;
                }
            } else {
                if (this.field3518 < 0) {
                    if (this.field3513 >= var3) {
                        return;
                    }
                    this.field3513 = var3 + var3 - 1 - this.field3513;
                    this.field3518 = -this.field3518;
                }
                while (this.field3513 >= var4) {
                    this.field3513 = var4 + var4 - 1 - this.field3513;
                    this.field3518 = -this.field3518;
                    if (this.field3513 >= var3) {
                        return;
                    }
                    this.field3513 = var3 + var3 - 1 - this.field3513;
                    this.field3518 = -this.field3518;
                }
            }
        } else {
            if (this.field3514 > 0) {
                if (this.field3520) {
                    label125: {
                        if (this.field3518 < 0) {
                            if (this.field3513 >= var3) {
                                return;
                            }
                            this.field3513 = var3 + var3 - 1 - this.field3513;
                            this.field3518 = -this.field3518;
                            if (--this.field3514 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3513 < var4) {
                                return;
                            }
                            this.field3513 = var4 + var4 - 1 - this.field3513;
                            this.field3518 = -this.field3518;
                            if (--this.field3514 == 0) {
                                break;
                            }
                            if (this.field3513 >= var3) {
                                return;
                            }
                            this.field3513 = var3 + var3 - 1 - this.field3513;
                            this.field3518 = -this.field3518;
                        } while (--this.field3514 != 0);
                    }
                } else if (this.field3518 < 0) {
                    if (this.field3513 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3513) / var6;
                    if (var7 < this.field3514) {
                        this.field3513 += var6 * var7;
                        this.field3514 -= var7;
                        return;
                    }
                    this.field3513 += this.field3514 * var6;
                    this.field3514 = 0;
                } else {
                    if (this.field3513 < var4) {
                        return;
                    }
                    int var8 = (this.field3513 - var3) / var6;
                    if (var8 < this.field3514) {
                        this.field3513 -= var6 * var8;
                        this.field3514 -= var8;
                        return;
                    }
                    this.field3513 -= this.field3514 * var6;
                    this.field3514 = 0;
                }
            }
            if (this.field3518 < 0) {
                if (this.field3513 < 0) {
                    this.field3513 = -1;
                    this.method1518();
                    this.method702((byte) -114);
                    return;
                }
            } else if (this.field3513 >= var5) {
                this.field3513 = var5;
                this.method1518();
                this.method702((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(II)I")
    private static final int method1547(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([B[IIIIIIIILjr;)I")
    private static final int method1548(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class250 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3511 += (var14 - arg3) * arg9.field3517;
        arg9.field3508 += (var14 - arg3) * arg9.field3510;
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
        arg9.field3512 = var12 >> 2;
        arg9.field3513 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "([III)V")
    public final synchronized void method513(int[] arg0, int arg1, int arg2) {
        if (this.field3507 == 0 && this.field3515 == 0) {
            this.method512(arg2);
        } else {
            class436 var4 = (class436) super.field6502;
            int var5 = this.field3509 << 8;
            int var6 = this.field3506 << 8;
            int var7 = var4.field6268.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3514 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3513 < 0) {
                if (this.field3518 <= 0) {
                    this.method1518();
                    this.method702((byte) -114);
                    return;
                }
                this.field3513 = 0;
            }
            if (this.field3513 >= var7) {
                if (this.field3518 >= 0) {
                    this.method1518();
                    this.method702((byte) -114);
                    return;
                }
                this.field3513 = var7 - 1;
            }
            if (this.field3514 < 0) {
                if (this.field3520) {
                    if (this.field3518 < 0) {
                        var9 = this.method1535(arg0, arg1, var5, var10, var4.field6268[this.field3509]);
                        if (this.field3513 >= var5) {
                            return;
                        }
                        this.field3513 = var5 + var5 - 1 - this.field3513;
                        this.field3518 = -this.field3518;
                    }
                    while (true) {
                        int var11 = this.method1514(arg0, var9, var6, var10, var4.field6268[this.field3506 - 1]);
                        if (this.field3513 < var6) {
                            return;
                        }
                        this.field3513 = var6 + var6 - 1 - this.field3513;
                        this.field3518 = -this.field3518;
                        var9 = this.method1535(arg0, var11, var5, var10, var4.field6268[this.field3509]);
                        if (this.field3513 >= var5) {
                            return;
                        }
                        this.field3513 = var5 + var5 - 1 - this.field3513;
                        this.field3518 = -this.field3518;
                    }
                } else if (this.field3518 < 0) {
                    while (true) {
                        var9 = this.method1535(arg0, var9, var5, var10, var4.field6268[this.field3506 - 1]);
                        if (this.field3513 >= var5) {
                            return;
                        }
                        this.field3513 = var6 - 1 - (var6 - 1 - this.field3513) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1514(arg0, var9, var6, var10, var4.field6268[this.field3509]);
                        if (this.field3513 < var6) {
                            return;
                        }
                        this.field3513 = (this.field3513 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3514 > 0) {
                    if (this.field3520) {
                        label130: {
                            if (this.field3518 < 0) {
                                var9 = this.method1535(arg0, arg1, var5, var10, var4.field6268[this.field3509]);
                                if (this.field3513 >= var5) {
                                    return;
                                }
                                this.field3513 = var5 + var5 - 1 - this.field3513;
                                this.field3518 = -this.field3518;
                                if (--this.field3514 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1514(arg0, var9, var6, var10, var4.field6268[this.field3506 - 1]);
                                if (this.field3513 < var6) {
                                    return;
                                }
                                this.field3513 = var6 + var6 - 1 - this.field3513;
                                this.field3518 = -this.field3518;
                                if (--this.field3514 == 0) {
                                    break;
                                }
                                var9 = this.method1535(arg0, var9, var5, var10, var4.field6268[this.field3509]);
                                if (this.field3513 >= var5) {
                                    return;
                                }
                                this.field3513 = var5 + var5 - 1 - this.field3513;
                                this.field3518 = -this.field3518;
                            } while (--this.field3514 != 0);
                        }
                    } else if (this.field3518 < 0) {
                        while (true) {
                            var9 = this.method1535(arg0, var9, var5, var10, var4.field6268[this.field3506 - 1]);
                            if (this.field3513 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3513) / var8;
                            if (var12 >= this.field3514) {
                                this.field3513 += this.field3514 * var8;
                                this.field3514 = 0;
                                break;
                            }
                            this.field3513 += var8 * var12;
                            this.field3514 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1514(arg0, var9, var6, var10, var4.field6268[this.field3509]);
                            if (this.field3513 < var6) {
                                return;
                            }
                            int var13 = (this.field3513 - var5) / var8;
                            if (var13 >= this.field3514) {
                                this.field3513 -= this.field3514 * var8;
                                this.field3514 = 0;
                                break;
                            }
                            this.field3513 -= var8 * var13;
                            this.field3514 -= var13;
                        }
                    }
                }
                if (this.field3518 < 0) {
                    this.method1535(arg0, var9, 0, var10, 0);
                    if (this.field3513 < 0) {
                        this.field3513 = -1;
                        this.method1518();
                        this.method702((byte) -114);
                        return;
                    }
                } else {
                    this.method1514(arg0, var9, var7, var10, 0);
                    if (this.field3513 >= var7) {
                        this.field3513 = var7;
                        this.method1518();
                        this.method702((byte) -114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "()I")
    public final int method1549() {
        int var1 = this.field3512 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3514 == 0) {
            var2 -= this.field3513 * var2 / (((class436) super.field6502).field6268.length << 8);
        } else if (this.field3514 >= 0) {
            var2 -= this.field3509 * var2 / ((class436) super.field6502).field6268.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "()I")
    public final synchronized int method1550() {
        return this.field3507 == Integer.MIN_VALUE ? 0 : this.field3507;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(II[B[IIIIIIIILjr;II)I")
    private static final int method1551(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class250 arg11, int arg12, int arg13) {
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
        arg11.field3513 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)V")
    public final synchronized void method1552(int arg0) {
        if (arg0 == 0) {
            this.method1543(0);
            this.method702((byte) -114);
        } else if (this.field3511 == 0 && this.field3508 == 0) {
            this.field3515 = 0;
            this.field3507 = 0;
            this.field3512 = 0;
            this.method702((byte) -114);
        } else {
            int var2 = -this.field3512;
            if (this.field3512 > var2) {
                var2 = this.field3512;
            }
            if (-this.field3511 > var2) {
                var2 = -this.field3511;
            }
            if (this.field3511 > var2) {
                var2 = this.field3511;
            }
            if (-this.field3508 > var2) {
                var2 = -this.field3508;
            }
            if (this.field3508 > var2) {
                var2 = this.field3508;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3515 = arg0;
            this.field3507 = Integer.MIN_VALUE;
            this.field3516 = -this.field3512 / arg0;
            this.field3517 = -this.field3511 / arg0;
            this.field3510 = -this.field3508 / arg0;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()Lrk;")
    public final class461 method516() {
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "()Z")
    public final boolean method1553() {
        return this.field3515 != 0;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "([B[IIIIIIIILjr;)I")
    private static final int method1554(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class250 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3511 += (var14 - arg3) * arg9.field3517;
        arg9.field3508 += (var14 - arg3) * arg9.field3510;
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
        arg9.field3512 = var12 >> 2;
        arg9.field3513 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljk;II)V")
    private class250(class436 arg0, int arg1, int arg2) {
        super.field6502 = arg0;
        this.field3509 = arg0.field6271;
        this.field3506 = arg0.field6270;
        this.field3520 = arg0.field6269;
        this.field3518 = arg1;
        this.field3507 = arg2;
        this.field3519 = 8192;
        this.field3513 = 0;
        this.method1541();
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljk;III)V")
    private class250(class436 arg0, int arg1, int arg2, int arg3) {
        super.field6502 = arg0;
        this.field3509 = arg0.field6271;
        this.field3506 = arg0.field6270;
        this.field3520 = arg0.field6269;
        this.field3518 = arg1;
        this.field3507 = arg2;
        this.field3519 = arg3;
        this.field3513 = 0;
        this.method1541();
    }
}
