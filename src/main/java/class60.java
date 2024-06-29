import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class60 extends class102 {

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
    private boolean field973;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    private int field967;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([III)V", line = 3)
    public final synchronized void method427(int[] arg0, int arg1, int arg2) {
        if (this.field967 == 0 && this.field976 == 0) {
            this.method443(arg2);
            return;
        }
        class176 var4 = (class176) this.field1642;
        int var5 = this.field969 << 8;
        int var6 = this.field978 << 8;
        int var7 = var4.field2776.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field975 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field970 < 0) {
            if (this.field966 <= 0) {
                this.method455();
                this.method1006(-1024);
                return;
            }
            this.field970 = 0;
        }
        if (this.field970 >= var7) {
            if (this.field966 >= 0) {
                this.method455();
                this.method1006(-1024);
                return;
            }
            this.field970 = var7 - 1;
        }
        if (this.field975 >= 0) {
            if (this.field975 > 0) {
                if (this.field973) {
                    label131: {
                        if (this.field966 < 0) {
                            var9 = this.method452(arg0, arg1, var5, var10, var4.field2776[this.field969]);
                            if (this.field970 >= var5) {
                                return;
                            }
                            this.field970 = var5 + var5 - this.field970 - 1;
                            this.field966 = -this.field966;
                            if (--this.field975 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method430(arg0, var9, var6, var10, var4.field2776[this.field978 - 1]);
                            if (this.field970 < var6) {
                                return;
                            }
                            this.field970 = var6 + var6 - this.field970 - 1;
                            this.field966 = -this.field966;
                            if (--this.field975 == 0) {
                                break;
                            }
                            var9 = this.method452(arg0, var9, var5, var10, var4.field2776[this.field969]);
                            if (this.field970 >= var5) {
                                return;
                            }
                            this.field970 = var5 + var5 - this.field970 - 1;
                            this.field966 = -this.field966;
                        } while (--this.field975 != 0);
                    }
                } else if (this.field966 < 0) {
                    while (true) {
                        var9 = this.method452(arg0, var9, var5, var10, var4.field2776[this.field978 - 1]);
                        if (this.field970 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field970 - 1) / var8;
                        if (var12 >= this.field975) {
                            this.field970 += this.field975 * var8;
                            this.field975 = 0;
                            break;
                        }
                        this.field970 += var8 * var12;
                        this.field975 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method430(arg0, var9, var6, var10, var4.field2776[this.field969]);
                        if (this.field970 < var6) {
                            return;
                        }
                        int var13 = (this.field970 - var5) / var8;
                        if (var13 >= this.field975) {
                            this.field970 -= this.field975 * var8;
                            this.field975 = 0;
                            break;
                        }
                        this.field970 -= var8 * var13;
                        this.field975 -= var13;
                    }
                }
            }
            if (this.field966 < 0) {
                this.method452(arg0, var9, 0, var10, 0);
                if (this.field970 < 0) {
                    this.field970 = -1;
                    this.method455();
                    this.method1006(-1024);
                }
            } else {
                this.method430(arg0, var9, var7, var10, 0);
                if (this.field970 >= var7) {
                    this.field970 = var7;
                    this.method455();
                    this.method1006(-1024);
                }
            }
        } else if (this.field973) {
            if (this.field966 < 0) {
                var9 = this.method452(arg0, arg1, var5, var10, var4.field2776[this.field969]);
                if (this.field970 >= var5) {
                    return;
                }
                this.field970 = var5 + var5 - this.field970 - 1;
                this.field966 = -this.field966;
            }
            while (true) {
                int var11 = this.method430(arg0, var9, var6, var10, var4.field2776[this.field978 - 1]);
                if (this.field970 < var6) {
                    return;
                }
                this.field970 = var6 + var6 - this.field970 - 1;
                this.field966 = -this.field966;
                var9 = this.method452(arg0, var11, var5, var10, var4.field2776[this.field969]);
                if (this.field970 >= var5) {
                    return;
                }
                this.field970 = var5 + var5 - this.field970 - 1;
                this.field966 = -this.field966;
            }
        } else if (this.field966 < 0) {
            while (true) {
                var9 = this.method452(arg0, var9, var5, var10, var4.field2776[this.field978 - 1]);
                if (this.field970 >= var5) {
                    return;
                }
                this.field970 = var6 - (var6 - 1 - this.field970) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method430(arg0, var9, var6, var10, var4.field2776[this.field969]);
                if (this.field970 < var6) {
                    return;
                }
                this.field970 = (this.field970 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "()Z", line = 240)
    private final boolean method428() {
        int var1 = this.field967;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method468(var1, this.field974);
            var2 = method471(var1, this.field974);
        }
        if (this.field972 != var1 || this.field980 != var3 || this.field977 != var2) {
            if (this.field972 < var1) {
                this.field968 = 1;
                this.field976 = var1 - this.field972;
            } else if (this.field972 > var1) {
                this.field968 = -1;
                this.field976 = this.field972 - var1;
            } else {
                this.field968 = 0;
            }
            if (this.field980 < var3) {
                this.field971 = 1;
                if (this.field976 == 0 || this.field976 > var3 - this.field980) {
                    this.field976 = var3 - this.field980;
                }
            } else if (this.field980 > var3) {
                this.field971 = -1;
                if (this.field976 == 0 || this.field976 > this.field980 - var3) {
                    this.field976 = this.field980 - var3;
                }
            } else {
                this.field971 = 0;
            }
            if (this.field977 < var2) {
                this.field979 = 1;
                if (this.field976 == 0 || this.field976 > var2 - this.field977) {
                    this.field976 = var2 - this.field977;
                }
            } else if (this.field977 > var2) {
                this.field979 = -1;
                if (this.field976 == 0 || this.field976 > this.field977 - var2) {
                    this.field976 = this.field977 - var2;
                }
            } else {
                this.field979 = 0;
            }
            return false;
        } else if (this.field967 == Integer.MIN_VALUE) {
            this.field967 = 0;
            this.field972 = this.field980 = this.field977 = 0;
            this.method1006(-1024);
            return true;
        } else {
            this.method465();
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 325)
    public final synchronized void method429(int arg0) {
        if (arg0 == 0) {
            this.method445(0);
            this.method1006(-1024);
        } else if (this.field980 == 0 && this.field977 == 0) {
            this.field976 = 0;
            this.field967 = 0;
            this.field972 = 0;
            this.method1006(-1024);
        } else {
            int var2 = -this.field972;
            if (this.field972 > var2) {
                var2 = this.field972;
            }
            if (-this.field980 > var2) {
                var2 = -this.field980;
            }
            if (this.field980 > var2) {
                var2 = this.field980;
            }
            if (-this.field977 > var2) {
                var2 = -this.field977;
            }
            if (this.field977 > var2) {
                var2 = this.field977;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field976 = arg0;
            this.field967 = Integer.MIN_VALUE;
            this.field968 = -this.field972 / arg0;
            this.field971 = -this.field980 / arg0;
            this.field979 = -this.field977 / arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIII)I", line = 370)
    private final int method430(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field976 > 0) {
                int var6 = this.field976 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field976 += arg1;
                if (this.field966 == 256 && (this.field970 & 0xFF) == 0) {
                    if (class26.field395) {
                        arg1 = method440(0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, this.field971, this.field979, 0, var6, arg2, this);
                    } else {
                        arg1 = method442(((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, this.field968, 0, var6, arg2, this);
                    }
                } else if (class26.field395) {
                    arg1 = method434(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, this.field971, this.field979, 0, var6, arg2, this, this.field966, arg4);
                } else {
                    arg1 = method436(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, this.field968, 0, var6, arg2, this, this.field966, arg4);
                }
                this.field976 -= arg1;
                if (this.field976 != 0) {
                    return arg1;
                }
                if (!this.method428()) {
                    continue;
                }
                return arg3;
            }
            if (this.field966 == 256 && (this.field970 & 0xFF) == 0) {
                if (class26.field395) {
                    return method433(0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, 0, arg3, arg2, this);
                }
                return method438(((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, 0, arg3, arg2, this);
            }
            if (class26.field395) {
                return method449(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, 0, arg3, arg2, this, this.field966, arg4);
            }
            return method472(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, 0, arg3, arg2, this, this.field966, arg4);
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V", line = 425)
    public final synchronized void method431(int arg0) {
        this.method457(arg0 << 6, this.method467());
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()I", line = 432)
    public final int method432() {
        int var1 = this.field972 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field975 == 0) {
            var2 -= this.field970 * var2 / (((class176) this.field1642).field2776.length << 8);
        } else if (this.field975 >= 0) {
            var2 -= this.field969 * var2 / ((class176) this.field1642).field2776.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[IIIIIIIILb;)I", line = 444)
    private static final int method433(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field970 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B[IIIIIIIIIILb;II)I", line = 483)
    private static final int method434(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field972 -= arg13.field968 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field972 += arg13.field968 * var27;
        arg13.field980 = arg6;
        arg13.field977 = arg7;
        arg13.field970 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I", line = 526)
    public final int method435() {
        return this.field967 == 0 && this.field976 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B[IIIIIIIILb;II)I", line = 534)
    private static final int method436(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field980 -= arg11.field971 * arg5;
        arg11.field977 -= arg11.field979 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field980 += arg11.field971 * arg5;
        arg11.field977 += arg11.field979 * arg5;
        arg11.field972 = arg6;
        arg11.field970 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[B[IIIIIIILb;II)I", line = 567)
    private static final int method437(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field970 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([B[IIIIIIILb;)I", line = 595)
    private static final int method438(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field970 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "()I", line = 622)
    public final synchronized int method439() {
        return this.field967 == Integer.MIN_VALUE ? 0 : this.field967;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[IIIIIIIIIILb;)I", line = 626)
    private static final int method440(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field972 += (var19 - arg4) * arg12.field968;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field980 = var15 >> 2;
        arg12.field977 = var16 >> 2;
        arg12.field970 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([B[IIIIIIIILb;)I", line = 679)
    private static final int method441(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field980 += (var14 - arg3) * arg9.field971;
        arg9.field977 += (var14 - arg3) * arg9.field979;
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
        arg9.field972 = var12 >> 2;
        arg9.field970 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([B[IIIIIIIILb;)I", line = 713)
    private static final int method442(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class60 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field980 += (var14 - arg3) * arg9.field971;
        arg9.field977 += (var14 - arg3) * arg9.field979;
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
        arg9.field972 = var12 >> 2;
        arg9.field970 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 747)
    public final synchronized void method443(int arg0) {
        if (this.field976 > 0) {
            if (arg0 >= this.field976) {
                if (this.field967 == Integer.MIN_VALUE) {
                    this.field967 = 0;
                    this.field972 = this.field980 = this.field977 = 0;
                    this.method1006(-1024);
                    arg0 = this.field976;
                }
                this.field976 = 0;
                this.method465();
            } else {
                this.field972 += this.field968 * arg0;
                this.field980 += this.field971 * arg0;
                this.field977 += this.field979 * arg0;
                this.field976 -= arg0;
            }
        }
        class176 var2 = (class176) this.field1642;
        int var3 = this.field969 << 8;
        int var4 = this.field978 << 8;
        int var5 = var2.field2776.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field975 = 0;
        }
        if (this.field970 < 0) {
            if (this.field966 <= 0) {
                this.method455();
                this.method1006(-1024);
                return;
            }
            this.field970 = 0;
        }
        if (this.field970 >= var5) {
            if (this.field966 >= 0) {
                this.method455();
                this.method1006(-1024);
                return;
            }
            this.field970 = var5 - 1;
        }
        this.field970 += this.field966 * arg0;
        if (this.field975 >= 0) {
            if (this.field975 > 0) {
                if (this.field973) {
                    label121: {
                        if (this.field966 < 0) {
                            if (this.field970 >= var3) {
                                return;
                            }
                            this.field970 = var3 + var3 - this.field970 - 1;
                            this.field966 = -this.field966;
                            if (--this.field975 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field970 < var4) {
                                return;
                            }
                            this.field970 = var4 + var4 - this.field970 - 1;
                            this.field966 = -this.field966;
                            if (--this.field975 == 0) {
                                break;
                            }
                            if (this.field970 >= var3) {
                                return;
                            }
                            this.field970 = var3 + var3 - this.field970 - 1;
                            this.field966 = -this.field966;
                        } while (--this.field975 != 0);
                    }
                } else {
                    label153: {
                        if (this.field966 < 0) {
                            if (this.field970 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field970 - 1) / var6;
                            if (var7 >= this.field975) {
                                this.field970 += this.field975 * var6;
                                this.field975 = 0;
                                break label153;
                            }
                            this.field970 += var6 * var7;
                            this.field975 -= var7;
                        } else if (this.field970 >= var4) {
                            int var8 = (this.field970 - var3) / var6;
                            if (var8 >= this.field975) {
                                this.field970 -= this.field975 * var6;
                                this.field975 = 0;
                                break label153;
                            }
                            this.field970 -= var6 * var8;
                            this.field975 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field966 < 0) {
                if (this.field970 < 0) {
                    this.field970 = -1;
                    this.method455();
                    this.method1006(-1024);
                }
            } else if (this.field970 >= var5) {
                this.field970 = var5;
                this.method455();
                this.method1006(-1024);
            }
        } else if (this.field973) {
            if (this.field966 < 0) {
                if (this.field970 >= var3) {
                    return;
                }
                this.field970 = var3 + var3 - this.field970 - 1;
                this.field966 = -this.field966;
            }
            while (this.field970 >= var4) {
                this.field970 = var4 + var4 - this.field970 - 1;
                this.field966 = -this.field966;
                if (this.field970 >= var3) {
                    return;
                }
                this.field970 = var3 + var3 - this.field970 - 1;
                this.field966 = -this.field966;
            }
        } else if (this.field966 < 0) {
            if (this.field970 >= var3) {
                return;
            }
            this.field970 = var4 - (var4 - 1 - this.field970) % var6 - 1;
        } else if (this.field970 >= var4) {
            this.field970 = (this.field970 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V", line = 965)
    public final synchronized void method444(int arg0) {
        this.field975 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V", line = 968)
    private final synchronized void method445(int arg0) {
        this.method457(arg0, this.method467());
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V", line = 971)
    public final synchronized void method446(int arg0, int arg1) {
        this.method466(arg0, arg1, this.method467());
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lkj;III)Lb;", line = 976)
    public static final class60 method447(class176 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2776 == null || arg0.field2776.length == 0 ? null : new class60(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()Lqb;", line = 982)
    public final class102 method448() {
        return null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II[B[IIIIIIIILb;II)I", line = 985)
    private static final int method449(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field970 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V", line = 1020)
    public final synchronized void method450(int arg0) {
        int var2 = ((class176) this.field1642).field2776.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field970 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I[B[IIIIIIIIIILb;)I", line = 1030)
    private static final int method451(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class60 arg12) {
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
        arg12.field972 += (var19 - arg4) * arg12.field968;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field980 = var15 >> 2;
        arg12.field977 = var16 >> 2;
        arg12.field970 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([IIIII)I", line = 1084)
    private final int method452(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field976 > 0) {
                int var6 = this.field976 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field976 += arg1;
                if (this.field966 == -256 && (this.field970 & 0xFF) == 0) {
                    if (class26.field395) {
                        arg1 = method451(0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, this.field971, this.field979, 0, var6, arg2, this);
                    } else {
                        arg1 = method441(((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, this.field968, 0, var6, arg2, this);
                    }
                } else if (class26.field395) {
                    arg1 = method456(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, this.field971, this.field979, 0, var6, arg2, this, this.field966, arg4);
                } else {
                    arg1 = method464(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, this.field968, 0, var6, arg2, this, this.field966, arg4);
                }
                this.field976 -= arg1;
                if (this.field976 != 0) {
                    return arg1;
                }
                if (!this.method428()) {
                    continue;
                }
                return arg3;
            }
            if (this.field966 == -256 && (this.field970 & 0xFF) == 0) {
                if (class26.field395) {
                    return method463(0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, 0, arg3, arg2, this);
                }
                return method462(((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, 0, arg3, arg2, this);
            }
            if (class26.field395) {
                return method469(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field980, this.field977, 0, arg3, arg2, this, this.field966, arg4);
            }
            return method437(0, 0, ((class176) this.field1642).field2776, arg0, this.field970, arg1, this.field972, 0, arg3, arg2, this, this.field966, arg4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lkj;II)Lb;", line = 1139)
    public static final class60 method453(class176 arg0, int arg1, int arg2) {
        return arg0.field2776 == null || arg0.field2776.length == 0 ? null : new class60(arg0, (int) ((long) arg0.field2780 * 256L * (long) arg1 / (long) (class168.field2603 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "()I", line = 1145)
    public final synchronized int method454() {
        return this.field966 < 0 ? -this.field966 : this.field966;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "()V", line = 1149)
    private final void method455() {
        if (this.field976 == 0) {
            return;
        }
        if (this.field967 == Integer.MIN_VALUE) {
            this.field967 = 0;
        }
        this.field976 = 0;
        this.method465();
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II[B[IIIIIIIIIILb;II)I", line = 1160)
    private static final int method456(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class60 arg13, int arg14, int arg15) {
        arg13.field972 -= arg13.field968 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field972 += arg13.field968 * var26;
        arg13.field980 = arg6;
        arg13.field977 = arg7;
        arg13.field970 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V", line = 1202)
    private final synchronized void method457(int arg0, int arg1) {
        this.field967 = arg0;
        this.field974 = arg1;
        this.field976 = 0;
        this.method465();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 1208)
    public final synchronized void method458(boolean arg0) {
        this.field966 = (this.field966 >>> 31) + (this.field966 ^ this.field966 >> 31);
        if (arg0) {
            this.field966 = -this.field966;
        }
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(I)V", line = 1216)
    public final synchronized void method459(int arg0) {
        if (this.field966 < 0) {
            this.field966 = -arg0;
        } else {
            this.field966 = arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "()Z", line = 1226)
    public final boolean method460() {
        return this.field970 < 0 || this.field970 >= ((class176) this.field1642).field2776.length << 8;
    }

    @OriginalMember(owner = "client!b", name = "j", descriptor = "()Z", line = 1229)
    public final boolean method461() {
        return this.field976 != 0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "([B[IIIIIIILb;)I", line = 1237)
    private static final int method462(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8) {
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
        arg8.field970 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I[B[IIIIIIIILb;)I", line = 1265)
    private static final int method463(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field970 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II[B[IIIIIIIILb;II)I", line = 1303)
    private static final int method464(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        arg11.field980 -= arg11.field971 * arg5;
        arg11.field977 -= arg11.field979 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field980 += arg11.field971 * arg5;
        arg11.field977 += arg11.field979 * arg5;
        arg11.field972 = arg6;
        arg11.field970 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!b", name = "k", descriptor = "()V", line = 1337)
    private final void method465() {
        this.field972 = this.field967;
        this.field980 = method468(this.field967, this.field974);
        this.field977 = method471(this.field967, this.field974);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V", line = 1342)
    public final synchronized void method466(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method457(arg1, arg2);
            return;
        }
        int var4 = method468(arg1, arg2);
        int var5 = method471(arg1, arg2);
        if (this.field980 == var4 && this.field977 == var5) {
            this.field976 = 0;
            return;
        }
        int var6 = arg1 - this.field972;
        if (this.field972 - arg1 > var6) {
            var6 = this.field972 - arg1;
        }
        if (var4 - this.field980 > var6) {
            var6 = var4 - this.field980;
        }
        if (this.field980 - var4 > var6) {
            var6 = this.field980 - var4;
        }
        if (var5 - this.field977 > var6) {
            var6 = var5 - this.field977;
        }
        if (this.field977 - var5 > var6) {
            var6 = this.field977 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field976 = arg0;
        this.field967 = arg1;
        this.field974 = arg2;
        this.field968 = (arg1 - this.field972) / arg0;
        this.field971 = (var4 - this.field980) / arg0;
        this.field979 = (var5 - this.field977) / arg0;
    }

    @OriginalMember(owner = "client!b", name = "l", descriptor = "()I", line = 1388)
    public final synchronized int method467() {
        return this.field974 < 0 ? -1 : this.field974;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II)I", line = 1391)
    private static final int method468(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(II[B[IIIIIIIILb;II)I", line = 1395)
    private static final int method469(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class60 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field970 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkj;II)V", line = 1426)
    private class60(class176 arg0, int arg1, int arg2) {
        this.field1642 = arg0;
        this.field969 = arg0.field2779;
        this.field978 = arg0.field2778;
        this.field973 = arg0.field2777;
        this.field966 = arg1;
        this.field967 = arg2;
        this.field974 = 8192;
        this.field970 = 0;
        this.method465();
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()Lqb;", line = 1438)
    public final class102 method470() {
        return null;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(II)I", line = 1441)
    private static final int method471(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkj;III)V", line = 1443)
    private class60(class176 arg0, int arg1, int arg2, int arg3) {
        this.field1642 = arg0;
        this.field969 = arg0.field2779;
        this.field978 = arg0.field2778;
        this.field973 = arg0.field2777;
        this.field966 = arg1;
        this.field967 = arg2;
        this.field974 = arg3;
        this.field970 = 0;
        this.method465();
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II[B[IIIIIIILb;II)I", line = 1455)
    private static final int method472(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field970 = arg4;
        return arg5;
    }
}
