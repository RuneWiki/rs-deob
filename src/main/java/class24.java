import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 extends class126 {

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Z")
    private boolean field606;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIILde;II)I", line = 3)
    private static final int method188(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6;
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
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6;
            arg4 += arg11;
        }
        arg10.field602 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 32)
    public final synchronized void method189(int arg0) {
        this.field600 = arg0;
        this.field604 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([B[IIIIIIIIILde;)I", line = 38)
    private static final int method190(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11++] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field600 = var13 >> 8;
        arg10.field602 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIIIILde;II)I", line = 71)
    private static final int method191(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class24 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 + 256 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        int var18 = arg13;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += var18;
        }
        arg12.field600 = arg6;
        arg12.field602 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([B[IIIIIIILde;)I", line = 100)
    private static final int method192(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class24 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field602 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIIIILde;II)I", line = 129)
    private static final int method193(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class24 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 - arg4 + arg13 - 257) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13 - 1) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        arg12.field600 = arg6;
        arg12.field602 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([B[IIIIIIILde;)I", line = 159)
    private static final int method194(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class24 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field602 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([III)I", line = 184)
    public final synchronized int method195(int[] arg0, int arg1, int arg2) {
        if (this.field600 != 0 || this.field604 != 0 && this.field607 != 0 && this.field607 != Integer.MIN_VALUE) {
            class115 var4 = (class115) super.field3031;
            int var5 = this.field603 << 8;
            int var6 = this.field601 << 8;
            int var7 = var4.field2842.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field609 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field609 < 0) {
                if (this.field606) {
                    if (this.field608 < 0) {
                        var9 = this.method203(arg0, arg1, var5, var10, var4.field2842[this.field603]);
                        if (this.field602 >= var5) {
                            return 1;
                        }
                        this.field602 = var5 + var5 - 1 - this.field602;
                        this.field608 = -this.field608;
                    }
                    while (true) {
                        int var11 = this.method204(arg0, var9, var6, var10, var4.field2842[this.field601 - 1]);
                        if (this.field602 < var6) {
                            return 1;
                        }
                        this.field602 = var6 + var6 - 1 - this.field602;
                        this.field608 = -this.field608;
                        var9 = this.method203(arg0, var11, var5, var10, var4.field2842[this.field603]);
                        if (this.field602 >= var5) {
                            return 1;
                        }
                        this.field602 = var5 + var5 - 1 - this.field602;
                        this.field608 = -this.field608;
                    }
                } else if (this.field608 < 0) {
                    while (true) {
                        var9 = this.method203(arg0, var9, var5, var10, var4.field2842[this.field601 - 1]);
                        if (this.field602 >= var5) {
                            return 1;
                        }
                        this.field602 = var6 - 1 - (var6 - 1 - this.field602) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method204(arg0, var9, var6, var10, var4.field2842[this.field603]);
                        if (this.field602 < var6) {
                            return 1;
                        }
                        this.field602 = (this.field602 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field609 > 0) {
                    if (this.field606) {
                        label118: {
                            if (this.field608 < 0) {
                                var9 = this.method203(arg0, arg1, var5, var10, var4.field2842[this.field603]);
                                if (this.field602 >= var5) {
                                    return 1;
                                }
                                this.field602 = var5 + var5 - 1 - this.field602;
                                this.field608 = -this.field608;
                                if (--this.field609 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method204(arg0, var9, var6, var10, var4.field2842[this.field601 - 1]);
                                if (this.field602 < var6) {
                                    return 1;
                                }
                                this.field602 = var6 + var6 - 1 - this.field602;
                                this.field608 = -this.field608;
                                if (--this.field609 == 0) {
                                    break;
                                }
                                var9 = this.method203(arg0, var9, var5, var10, var4.field2842[this.field603]);
                                if (this.field602 >= var5) {
                                    return 1;
                                }
                                this.field602 = var5 + var5 - 1 - this.field602;
                                this.field608 = -this.field608;
                            } while (--this.field609 != 0);
                        }
                    } else if (this.field608 < 0) {
                        while (true) {
                            var9 = this.method203(arg0, var9, var5, var10, var4.field2842[this.field601 - 1]);
                            if (this.field602 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field602) / var8;
                            if (var12 >= this.field609) {
                                this.field602 += this.field609 * var8;
                                this.field609 = 0;
                                break;
                            }
                            this.field602 += var8 * var12;
                            this.field609 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method204(arg0, var9, var6, var10, var4.field2842[this.field603]);
                            if (this.field602 < var6) {
                                return 1;
                            }
                            int var13 = (this.field602 - var5) / var8;
                            if (var13 >= this.field609) {
                                this.field602 -= this.field609 * var8;
                                this.field609 = 0;
                                break;
                            }
                            this.field602 -= var8 * var13;
                            this.field609 -= var13;
                        }
                    }
                }
                if (this.field608 < 0) {
                    this.method203(arg0, var9, 0, var10, 0);
                    if (this.field602 < 0) {
                        this.field602 = 0;
                        this.method114(-3789);
                    }
                } else {
                    this.method204(arg0, var9, var7, var10, 0);
                    if (this.field602 >= var7) {
                        this.field602 = var7 - 1;
                        this.method114(-3789);
                    }
                }
                return 1;
            }
        } else {
            this.method201(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 392)
    public final synchronized void method196(int arg0) {
        this.field609 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIILde;II)I", line = 398)
    private static final int method197(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6;
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
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6;
            arg4 += var16;
        }
        arg10.field602 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lta;II)Lde;", line = 425)
    public static final class24 method198(class115 arg0, int arg1, int arg2) {
        return arg0.field2842 != null && arg0.field2842.length != 0 ? new class24(arg0, (int) ((long) arg0.field2844 * 256L * (long) arg1 / (long) (class102.field2503 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()I", line = 432)
    public final int method199() {
        int var1 = this.field600 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field609 == 0) {
            var2 -= this.field602 * var2 / (((class115) super.field3031).field2842.length << 8);
        } else if (this.field609 >= 0) {
            var2 -= this.field603 * var2 / ((class115) super.field3031).field2842.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([B[IIIIIIIIILde;)I", line = 444)
    private static final int method200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class24 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11--] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field600 = var13 >> 8;
        arg10.field602 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 477)
    public final synchronized void method201(int arg0) {
        if (this.field604 > 0) {
            if (arg0 >= this.field604) {
                if (this.field607 == Integer.MIN_VALUE) {
                    this.method114(-3789);
                    arg0 = this.field604;
                } else {
                    this.field600 = this.field607;
                }
                this.field604 = 0;
            } else {
                this.field600 += this.field605 * arg0;
                this.field604 -= arg0;
            }
        }
        this.field602 += this.field608 * arg0;
        class115 var2 = (class115) super.field3031;
        int var3 = this.field603 << 8;
        int var4 = this.field601 << 8;
        int var5 = var2.field2842.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field609 = 0;
        }
        if (this.field609 < 0) {
            if (!this.field606) {
                if (this.field608 < 0) {
                    if (this.field602 < var3) {
                        this.field602 = var4 - 1 - (var4 - 1 - this.field602) % var6;
                    }
                } else if (this.field602 >= var4) {
                    this.field602 = (this.field602 - var3) % var6 + var3;
                }
            } else {
                if (this.field608 < 0) {
                    if (this.field602 >= var3) {
                        return;
                    }
                    this.field602 = var3 + var3 - 1 - this.field602;
                    this.field608 = -this.field608;
                }
                while (this.field602 >= var4) {
                    this.field602 = var4 + var4 - 1 - this.field602;
                    this.field608 = -this.field608;
                    if (this.field602 >= var3) {
                        return;
                    }
                    this.field602 = var3 + var3 - 1 - this.field602;
                    this.field608 = -this.field608;
                }
            }
        } else {
            if (this.field609 > 0) {
                if (this.field606) {
                    label113: {
                        if (this.field608 < 0) {
                            if (this.field602 >= var3) {
                                return;
                            }
                            this.field602 = var3 + var3 - 1 - this.field602;
                            this.field608 = -this.field608;
                            if (--this.field609 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field602 < var4) {
                                return;
                            }
                            this.field602 = var4 + var4 - 1 - this.field602;
                            this.field608 = -this.field608;
                            if (--this.field609 == 0) {
                                break;
                            }
                            if (this.field602 >= var3) {
                                return;
                            }
                            this.field602 = var3 + var3 - 1 - this.field602;
                            this.field608 = -this.field608;
                        } while (--this.field609 != 0);
                    }
                } else if (this.field608 < 0) {
                    if (this.field602 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field602) / var6;
                    if (var7 < this.field609) {
                        this.field602 += var6 * var7;
                        this.field609 -= var7;
                        return;
                    }
                    this.field602 += this.field609 * var6;
                    this.field609 = 0;
                } else {
                    if (this.field602 < var4) {
                        return;
                    }
                    int var8 = (this.field602 - var3) / var6;
                    if (var8 < this.field609) {
                        this.field602 -= var6 * var8;
                        this.field609 -= var8;
                        return;
                    }
                    this.field602 -= this.field609 * var6;
                    this.field609 = 0;
                }
            }
            if (this.field608 < 0) {
                if (this.field602 < 0) {
                    this.field602 = 0;
                    this.method114(-3789);
                    return;
                }
            } else if (this.field602 >= var5) {
                this.field602 = var5 - 1;
                this.method114(-3789);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()Z", line = 667)
    public final boolean method202() {
        return this.method110(false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([IIIII)I", line = 671)
    private final int method203(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field604 > 0) {
            int var6 = this.field604 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field604 += arg1;
            if (this.field608 == -256 && (this.field602 & 255) == 0) {
                arg1 = method200(((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, this.field610, this.field605, 0, var6, arg2, this);
            } else {
                arg1 = method191(0, 0, ((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, this.field610, this.field605, 0, var6, arg2, this, this.field608, arg4);
            }
            this.field604 -= arg1;
            if (this.field604 != 0) {
                return arg1;
            }
            if (this.field607 == Integer.MIN_VALUE) {
                this.method114(-3789);
                return arg3;
            }
            this.field600 = this.field607;
        }
        return this.field608 == -256 && (this.field602 & 255) == 0 ? method192(((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, 0, arg3, arg2, this) : method197(0, 0, ((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, 0, arg3, arg2, this, this.field608, arg4);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "([IIIII)I", line = 715)
    private final int method204(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field604 > 0) {
            int var6 = this.field604 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field604 += arg1;
            if (this.field608 == 256 && (this.field602 & 255) == 0) {
                arg1 = method190(((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, this.field610, this.field605, 0, var6, arg2, this);
            } else {
                arg1 = method193(0, 0, ((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, this.field610, this.field605, 0, var6, arg2, this, this.field608, arg4);
            }
            this.field604 -= arg1;
            if (this.field604 != 0) {
                return arg1;
            }
            if (this.field607 == Integer.MIN_VALUE) {
                this.method114(-3789);
                return arg3;
            }
            this.field600 = this.field607;
        }
        return this.field608 == 256 && (this.field602 & 255) == 0 ? method194(((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, 0, arg3, arg2, this) : method188(0, 0, ((class115) super.field3031).field2842, arg0, this.field602, arg1, this.field600, 0, arg3, arg2, this, this.field608, arg4);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lta;II)V", line = 758)
    private class24(class115 arg0, int arg1, int arg2) {
        super.field3031 = arg0;
        this.field603 = arg0.field2843;
        this.field601 = arg0.field2841;
        this.field608 = arg1;
        this.field600 = arg2;
        this.field602 = 0;
    }
}
