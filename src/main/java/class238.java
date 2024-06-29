import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class238 extends class407 {

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    private int field3462;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "Z")
    private boolean field3461;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    private int field3467;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    private int field3465;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    private int field3456;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    private int field3464;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    private int field3466;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    private int field3468;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IIIII)I", line = 4)
    private final int method1464(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3468 <= 0) {
                if (this.field3460 == 256 && (this.field3465 & 255) == 0) {
                    if (class366.field5230) {
                        return method1484(0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, 0, arg3, arg2, this);
                    }
                    return method1474(((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, 0, arg3, arg2, this);
                }
                if (class366.field5230) {
                    return method1492(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, 0, arg3, arg2, this, this.field3460, arg4);
                }
                return method1489(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, 0, arg3, arg2, this, this.field3460, arg4);
            }
            int var6 = this.field3468 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3468 += arg1;
            if (this.field3460 == 256 && (this.field3465 & 255) == 0) {
                if (class366.field5230) {
                    arg1 = method1471(0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, this.field3458, this.field3464, 0, var6, arg2, this);
                } else {
                    arg1 = method1498(((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, this.field3466, 0, var6, arg2, this);
                }
            } else if (class366.field5230) {
                arg1 = method1467(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, this.field3458, this.field3464, 0, var6, arg2, this, this.field3460, arg4);
            } else {
                arg1 = method1503(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, this.field3466, 0, var6, arg2, this, this.field3460, arg4);
            }
            this.field3468 -= arg1;
            if (this.field3468 != 0) {
                return arg1;
            }
        } while (!this.method1486());
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V", line = 59)
    private final void method1465() {
        this.field3456 = this.field3459;
        this.field3455 = method1481(this.field3459, this.field3467);
        this.field3457 = method1485(this.field3459, this.field3467);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([B[IIIIIIIILtc;)I", line = 64)
    private static final int method1466(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class238 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3455 += (var14 - arg3) * arg9.field3458;
        arg9.field3457 += (var14 - arg3) * arg9.field3464;
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
        arg9.field3456 = var12 >> 2;
        arg9.field3465 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[B[IIIIIIIIIILtc;II)I", line = 100)
    private static final int method1467(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class238 arg13, int arg14, int arg15) {
        arg13.field3456 -= arg13.field3466 * arg5;
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
        arg13.field3456 += arg13.field3466 * var22;
        arg13.field3455 = arg6;
        arg13.field3457 = arg7;
        arg13.field3465 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()I", line = 142)
    public final synchronized int method1468() {
        return this.field3459 == Integer.MIN_VALUE ? 0 : this.field3459;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 145)
    public final synchronized void method519(int arg0) {
        if (this.field3468 > 0) {
            if (arg0 >= this.field3468) {
                if (this.field3459 == Integer.MIN_VALUE) {
                    this.field3459 = 0;
                    this.field3456 = this.field3455 = this.field3457 = 0;
                    this.method2891(26);
                    arg0 = this.field3468;
                }
                this.field3468 = 0;
                this.method1465();
            } else {
                this.field3456 += this.field3466 * arg0;
                this.field3455 += this.field3458 * arg0;
                this.field3457 += this.field3464 * arg0;
                this.field3468 -= arg0;
            }
        }
        class499 var2 = (class499) super.field5764;
        int var3 = this.field3463 << 8;
        int var4 = this.field3462 << 8;
        int var5 = var2.field7062.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3454 = 0;
        }
        if (this.field3465 < 0) {
            if (this.field3460 <= 0) {
                this.method1472();
                this.method2891(-121);
                return;
            }
            this.field3465 = 0;
        }
        if (this.field3465 >= var5) {
            if (this.field3460 >= 0) {
                this.method1472();
                this.method2891(-126);
                return;
            }
            this.field3465 = var5 - 1;
        }
        this.field3465 += this.field3460 * arg0;
        if (this.field3454 < 0) {
            if (!this.field3461) {
                if (this.field3460 < 0) {
                    if (this.field3465 < var3) {
                        this.field3465 = var4 - 1 - (var4 - 1 - this.field3465) % var6;
                    }
                } else if (this.field3465 >= var4) {
                    this.field3465 = (this.field3465 - var3) % var6 + var3;
                }
            } else {
                if (this.field3460 < 0) {
                    if (this.field3465 >= var3) {
                        return;
                    }
                    this.field3465 = var3 + var3 - 1 - this.field3465;
                    this.field3460 = -this.field3460;
                }
                while (this.field3465 >= var4) {
                    this.field3465 = var4 + var4 - 1 - this.field3465;
                    this.field3460 = -this.field3460;
                    if (this.field3465 >= var3) {
                        return;
                    }
                    this.field3465 = var3 + var3 - 1 - this.field3465;
                    this.field3460 = -this.field3460;
                }
            }
        } else {
            if (this.field3454 > 0) {
                if (this.field3461) {
                    label125: {
                        if (this.field3460 < 0) {
                            if (this.field3465 >= var3) {
                                return;
                            }
                            this.field3465 = var3 + var3 - 1 - this.field3465;
                            this.field3460 = -this.field3460;
                            if (--this.field3454 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3465 < var4) {
                                return;
                            }
                            this.field3465 = var4 + var4 - 1 - this.field3465;
                            this.field3460 = -this.field3460;
                            if (--this.field3454 == 0) {
                                break;
                            }
                            if (this.field3465 >= var3) {
                                return;
                            }
                            this.field3465 = var3 + var3 - 1 - this.field3465;
                            this.field3460 = -this.field3460;
                        } while (--this.field3454 != 0);
                    }
                } else if (this.field3460 < 0) {
                    if (this.field3465 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3465) / var6;
                    if (var7 < this.field3454) {
                        this.field3465 += var6 * var7;
                        this.field3454 -= var7;
                        return;
                    }
                    this.field3465 += this.field3454 * var6;
                    this.field3454 = 0;
                } else {
                    if (this.field3465 < var4) {
                        return;
                    }
                    int var8 = (this.field3465 - var3) / var6;
                    if (var8 < this.field3454) {
                        this.field3465 -= var6 * var8;
                        this.field3454 -= var8;
                        return;
                    }
                    this.field3465 -= this.field3454 * var6;
                    this.field3454 = 0;
                }
            }
            if (this.field3460 < 0) {
                if (this.field3465 < 0) {
                    this.field3465 = -1;
                    this.method1472();
                    this.method2891(-121);
                    return;
                }
            } else if (this.field3465 >= var5) {
                this.field3465 = var5;
                this.method1472();
                this.method2891(-124);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[B[IIIIIIIILtc;II)I", line = 363)
    private static final int method1469(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
        arg11.field3455 -= arg11.field3458 * arg5;
        arg11.field3457 -= arg11.field3464 * arg5;
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
        arg11.field3455 += arg11.field3458 * arg5;
        arg11.field3457 += arg11.field3464 * arg5;
        arg11.field3456 = arg6;
        arg11.field3465 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "()Z", line = 396)
    public final boolean method1470() {
        return this.field3468 != 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[B[IIIIIIIIIILtc;)I", line = 399)
    private static final int method1471(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class238 arg12) {
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
        arg12.field3456 += (var19 - arg4) * arg12.field3466;
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
        arg12.field3455 = var15 >> 2;
        arg12.field3457 = var16 >> 2;
        arg12.field3465 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()I", line = 452)
    public final int method518() {
        return this.field3459 == 0 && this.field3468 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "()V", line = 458)
    private final void method1472() {
        if (this.field3468 != 0) {
            if (this.field3459 == Integer.MIN_VALUE) {
                this.field3459 = 0;
            }
            this.field3468 = 0;
            this.method1465();
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I", line = 470)
    public final int method1473() {
        int var1 = this.field3456 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3454 == 0) {
            var2 -= this.field3465 * var2 / (((class499) super.field5764).field7062.length << 8);
        } else if (this.field3454 >= 0) {
            var2 -= this.field3463 * var2 / ((class499) super.field5764).field7062.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([B[IIIIIIILtc;)I", line = 484)
    private static final int method1474(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class238 arg8) {
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
        arg8.field3465 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[B[IIIIIIIIIILtc;)I", line = 509)
    private static final int method1475(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class238 arg12) {
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
        arg12.field3456 += (var19 - arg4) * arg12.field3466;
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
        arg12.field3455 = var15 >> 2;
        arg12.field3457 = var16 >> 2;
        arg12.field3465 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lcj;III)Ltc;", line = 562)
    public static final class238 method1476(class499 arg0, int arg1, int arg2, int arg3) {
        return arg0.field7062 != null && arg0.field7062.length != 0 ? new class238(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "()Z", line = 569)
    public final boolean method1477() {
        return this.field3465 < 0 || this.field3465 >= ((class499) super.field5764).field7062.length << 8;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lcv;", line = 573)
    public final class407 method520() {
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V", line = 576)
    public final synchronized void method1478(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1500(arg1, arg2);
        } else {
            int var4 = method1481(arg1, arg2);
            int var5 = method1485(arg1, arg2);
            if (this.field3455 == var4 && this.field3457 == var5) {
                this.field3468 = 0;
            } else {
                int var6 = arg1 - this.field3456;
                if (this.field3456 - arg1 > var6) {
                    var6 = this.field3456 - arg1;
                }
                if (var4 - this.field3455 > var6) {
                    var6 = var4 - this.field3455;
                }
                if (this.field3455 - var4 > var6) {
                    var6 = this.field3455 - var4;
                }
                if (var5 - this.field3457 > var6) {
                    var6 = var5 - this.field3457;
                }
                if (this.field3457 - var5 > var6) {
                    var6 = this.field3457 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3468 = arg0;
                this.field3459 = arg1;
                this.field3467 = arg2;
                this.field3466 = (arg1 - this.field3456) / arg0;
                this.field3458 = (var4 - this.field3455) / arg0;
                this.field3464 = (var5 - this.field3457) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 622)
    public final synchronized void method1479(boolean arg0) {
        this.field3460 = (this.field3460 >>> 31) + (this.field3460 ^ this.field3460 >> 31);
        if (arg0) {
            this.field3460 = -this.field3460;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([III)V", line = 628)
    public final synchronized void method512(int[] arg0, int arg1, int arg2) {
        if (this.field3459 == 0 && this.field3468 == 0) {
            this.method519(arg2);
        } else {
            class499 var4 = (class499) super.field5764;
            int var5 = this.field3463 << 8;
            int var6 = this.field3462 << 8;
            int var7 = var4.field7062.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3454 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3465 < 0) {
                if (this.field3460 <= 0) {
                    this.method1472();
                    this.method2891(-125);
                    return;
                }
                this.field3465 = 0;
            }
            if (this.field3465 >= var7) {
                if (this.field3460 >= 0) {
                    this.method1472();
                    this.method2891(-125);
                    return;
                }
                this.field3465 = var7 - 1;
            }
            if (this.field3454 < 0) {
                if (this.field3461) {
                    if (this.field3460 < 0) {
                        var9 = this.method1482(arg0, arg1, var5, var10, var4.field7062[this.field3463]);
                        if (this.field3465 >= var5) {
                            return;
                        }
                        this.field3465 = var5 + var5 - 1 - this.field3465;
                        this.field3460 = -this.field3460;
                    }
                    while (true) {
                        int var11 = this.method1464(arg0, var9, var6, var10, var4.field7062[this.field3462 - 1]);
                        if (this.field3465 < var6) {
                            return;
                        }
                        this.field3465 = var6 + var6 - 1 - this.field3465;
                        this.field3460 = -this.field3460;
                        var9 = this.method1482(arg0, var11, var5, var10, var4.field7062[this.field3463]);
                        if (this.field3465 >= var5) {
                            return;
                        }
                        this.field3465 = var5 + var5 - 1 - this.field3465;
                        this.field3460 = -this.field3460;
                    }
                } else if (this.field3460 < 0) {
                    while (true) {
                        var9 = this.method1482(arg0, var9, var5, var10, var4.field7062[this.field3462 - 1]);
                        if (this.field3465 >= var5) {
                            return;
                        }
                        this.field3465 = var6 - 1 - (var6 - 1 - this.field3465) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1464(arg0, var9, var6, var10, var4.field7062[this.field3463]);
                        if (this.field3465 < var6) {
                            return;
                        }
                        this.field3465 = (this.field3465 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3454 > 0) {
                    if (this.field3461) {
                        label130: {
                            if (this.field3460 < 0) {
                                var9 = this.method1482(arg0, arg1, var5, var10, var4.field7062[this.field3463]);
                                if (this.field3465 >= var5) {
                                    return;
                                }
                                this.field3465 = var5 + var5 - 1 - this.field3465;
                                this.field3460 = -this.field3460;
                                if (--this.field3454 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1464(arg0, var9, var6, var10, var4.field7062[this.field3462 - 1]);
                                if (this.field3465 < var6) {
                                    return;
                                }
                                this.field3465 = var6 + var6 - 1 - this.field3465;
                                this.field3460 = -this.field3460;
                                if (--this.field3454 == 0) {
                                    break;
                                }
                                var9 = this.method1482(arg0, var9, var5, var10, var4.field7062[this.field3463]);
                                if (this.field3465 >= var5) {
                                    return;
                                }
                                this.field3465 = var5 + var5 - 1 - this.field3465;
                                this.field3460 = -this.field3460;
                            } while (--this.field3454 != 0);
                        }
                    } else if (this.field3460 < 0) {
                        while (true) {
                            var9 = this.method1482(arg0, var9, var5, var10, var4.field7062[this.field3462 - 1]);
                            if (this.field3465 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3465) / var8;
                            if (var12 >= this.field3454) {
                                this.field3465 += this.field3454 * var8;
                                this.field3454 = 0;
                                break;
                            }
                            this.field3465 += var8 * var12;
                            this.field3454 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1464(arg0, var9, var6, var10, var4.field7062[this.field3463]);
                            if (this.field3465 < var6) {
                                return;
                            }
                            int var13 = (this.field3465 - var5) / var8;
                            if (var13 >= this.field3454) {
                                this.field3465 -= this.field3454 * var8;
                                this.field3454 = 0;
                                break;
                            }
                            this.field3465 -= var8 * var13;
                            this.field3454 -= var13;
                        }
                    }
                }
                if (this.field3460 < 0) {
                    this.method1482(arg0, var9, 0, var10, 0);
                    if (this.field3465 < 0) {
                        this.field3465 = -1;
                        this.method1472();
                        this.method2891(-123);
                        return;
                    }
                } else {
                    this.method1464(arg0, var9, var7, var10, 0);
                    if (this.field3465 >= var7) {
                        this.field3465 = var7;
                        this.method1472();
                        this.method2891(-127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([B[IIIIIIILtc;)I", line = 863)
    private static final int method1480(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class238 arg8) {
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
        arg8.field3465 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I", line = 889)
    private static final int method1481(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([IIIII)I", line = 892)
    private final int method1482(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3468 <= 0) {
                if (this.field3460 == -256 && (this.field3465 & 255) == 0) {
                    if (class366.field5230) {
                        return method1494(0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, 0, arg3, arg2, this);
                    }
                    return method1480(((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, 0, arg3, arg2, this);
                }
                if (class366.field5230) {
                    return method1497(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, 0, arg3, arg2, this, this.field3460, arg4);
                }
                return method1495(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, 0, arg3, arg2, this, this.field3460, arg4);
            }
            int var6 = this.field3468 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3468 += arg1;
            if (this.field3460 == -256 && (this.field3465 & 255) == 0) {
                if (class366.field5230) {
                    arg1 = method1475(0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, this.field3458, this.field3464, 0, var6, arg2, this);
                } else {
                    arg1 = method1466(((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, this.field3466, 0, var6, arg2, this);
                }
            } else if (class366.field5230) {
                arg1 = method1491(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3455, this.field3457, this.field3458, this.field3464, 0, var6, arg2, this, this.field3460, arg4);
            } else {
                arg1 = method1469(0, 0, ((class499) super.field5764).field7062, arg0, this.field3465, arg1, this.field3456, this.field3466, 0, var6, arg2, this, this.field3460, arg4);
            }
            this.field3468 -= arg1;
            if (this.field3468 != 0) {
                return arg1;
            }
        } while (!this.method1486());
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 953)
    private final synchronized void method1483(int arg0) {
        this.method1500(arg0, this.method1502());
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[B[IIIIIIIILtc;)I", line = 957)
    private static final int method1484(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10) {
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
        arg10.field3465 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I", line = 995)
    private static final int method1485(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "()Z", line = 1000)
    private final boolean method1486() {
        int var1 = this.field3459;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1481(var1, this.field3467);
            var2 = method1485(var1, this.field3467);
        }
        if (this.field3456 == var1 && this.field3455 == var3 && this.field3457 == var2) {
            if (this.field3459 == Integer.MIN_VALUE) {
                this.field3459 = 0;
                this.field3456 = this.field3455 = this.field3457 = 0;
                this.method2891(108);
                return true;
            } else {
                this.method1465();
                return false;
            }
        } else {
            if (this.field3456 < var1) {
                this.field3466 = 1;
                this.field3468 = var1 - this.field3456;
            } else if (this.field3456 > var1) {
                this.field3466 = -1;
                this.field3468 = this.field3456 - var1;
            } else {
                this.field3466 = 0;
            }
            if (this.field3455 < var3) {
                this.field3458 = 1;
                if (this.field3468 == 0 || this.field3468 > var3 - this.field3455) {
                    this.field3468 = var3 - this.field3455;
                }
            } else if (this.field3455 > var3) {
                this.field3458 = -1;
                if (this.field3468 == 0 || this.field3468 > this.field3455 - var3) {
                    this.field3468 = this.field3455 - var3;
                }
            } else {
                this.field3458 = 0;
            }
            if (this.field3457 < var2) {
                this.field3464 = 1;
                if (this.field3468 == 0 || this.field3468 > var2 - this.field3457) {
                    this.field3468 = var2 - this.field3457;
                }
            } else if (this.field3457 > var2) {
                this.field3464 = -1;
                if (this.field3468 == 0 || this.field3468 > this.field3457 - var2) {
                    this.field3468 = this.field3457 - var2;
                }
            } else {
                this.field3464 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V", line = 1087)
    public final synchronized void method1487(int arg0, int arg1) {
        this.method1478(arg0, arg1, this.method1502());
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 1090)
    public final synchronized void method1488(int arg0) {
        this.field3454 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()Lcv;", line = 1095)
    public final class407 method511() {
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II[B[IIIIIIILtc;II)I", line = 1098)
    private static final int method1489(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10, int arg11, int arg12) {
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
        arg10.field3465 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 1125)
    public final synchronized void method1490(int arg0) {
        if (this.field3460 < 0) {
            this.field3460 = -arg0;
        } else {
            this.field3460 = arg0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II[B[IIIIIIIIIILtc;II)I", line = 1133)
    private static final int method1491(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class238 arg13, int arg14, int arg15) {
        arg13.field3456 -= arg13.field3466 * arg5;
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
        arg13.field3456 += arg13.field3466 * var22;
        arg13.field3455 = arg6;
        arg13.field3457 = arg7;
        arg13.field3465 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II[B[IIIIIIIILtc;II)I", line = 1174)
    private static final int method1492(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
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
        arg11.field3465 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "(I)V", line = 1209)
    public final synchronized void method1493(int arg0) {
        if (arg0 == 0) {
            this.method1483(0);
            this.method2891(-124);
        } else if (this.field3455 == 0 && this.field3457 == 0) {
            this.field3468 = 0;
            this.field3459 = 0;
            this.field3456 = 0;
            this.method2891(-124);
        } else {
            int var2 = -this.field3456;
            if (this.field3456 > var2) {
                var2 = this.field3456;
            }
            if (-this.field3455 > var2) {
                var2 = -this.field3455;
            }
            if (this.field3455 > var2) {
                var2 = this.field3455;
            }
            if (-this.field3457 > var2) {
                var2 = -this.field3457;
            }
            if (this.field3457 > var2) {
                var2 = this.field3457;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3468 = arg0;
            this.field3459 = Integer.MIN_VALUE;
            this.field3466 = -this.field3456 / arg0;
            this.field3458 = -this.field3455 / arg0;
            this.field3464 = -this.field3457 / arg0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I[B[IIIIIIIILtc;)I", line = 1255)
    private static final int method1494(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10) {
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
        arg10.field3465 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II[B[IIIIIIILtc;II)I", line = 1293)
    private static final int method1495(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10, int arg11, int arg12) {
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
        arg10.field3465 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V", line = 1321)
    public final synchronized void method1496(int arg0) {
        int var2 = ((class499) super.field5764).field7062.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3465 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II[B[IIIIIIIILtc;II)I", line = 1332)
    private static final int method1497(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
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
        arg11.field3465 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "([B[IIIIIIIILtc;)I", line = 1366)
    private static final int method1498(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class238 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3455 += (var14 - arg3) * arg9.field3458;
        arg9.field3457 += (var14 - arg3) * arg9.field3464;
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
        arg9.field3456 = var12 >> 2;
        arg9.field3465 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lcj;II)Ltc;", line = 1400)
    public static final class238 method1499(class499 arg0, int arg1, int arg2) {
        return arg0.field7062 != null && arg0.field7062.length != 0 ? new class238(arg0, (int) ((long) arg0.field7064 * 256L * (long) arg1 / (long) (class289.field4225 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V", line = 1406)
    private final synchronized void method1500(int arg0, int arg1) {
        this.field3459 = arg0;
        this.field3467 = arg1;
        this.field3468 = 0;
        this.method1465();
    }

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "()I", line = 1412)
    public final synchronized int method1501() {
        return this.field3460 < 0 ? -this.field3460 : this.field3460;
    }

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "()I", line = 1416)
    public final synchronized int method1502() {
        return this.field3467 < 0 ? -1 : this.field3467;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lcj;II)V", line = 1419)
    private class238(class499 arg0, int arg1, int arg2) {
        super.field5764 = arg0;
        this.field3463 = arg0.field7061;
        this.field3462 = arg0.field7063;
        this.field3461 = arg0.field7065;
        this.field3460 = arg1;
        this.field3459 = arg2;
        this.field3467 = 8192;
        this.field3465 = 0;
        this.method1465();
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II[B[IIIIIIIILtc;II)I", line = 1431)
    private static final int method1503(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
        arg11.field3455 -= arg11.field3458 * arg5;
        arg11.field3457 -= arg11.field3464 * arg5;
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
        arg11.field3455 += arg11.field3458 * arg5;
        arg11.field3457 += arg11.field3464 * arg5;
        arg11.field3456 = arg6;
        arg11.field3465 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lcj;III)V", line = 1464)
    private class238(class499 arg0, int arg1, int arg2, int arg3) {
        super.field5764 = arg0;
        this.field3463 = arg0.field7061;
        this.field3462 = arg0.field7063;
        this.field3461 = arg0.field7065;
        this.field3460 = arg1;
        this.field3459 = arg2;
        this.field3467 = arg3;
        this.field3465 = 0;
        this.method1465();
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)V", line = 1477)
    public final synchronized void method1504(int arg0) {
        this.method1500(arg0 << 6, this.method1502());
    }
}
