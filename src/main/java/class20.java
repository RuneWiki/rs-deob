import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 extends class48 {

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Z")
    private boolean field519;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z", line = 3)
    public final boolean method199() {
        return this.method255(-83);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([B[IIIIIIIIILda;)I", line = 8)
    private static final int method200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class20 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14;
        if ((var14 = arg3 + var12 - var11) > arg8) {
            var14 = arg8;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var15 = arg6 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var11++] * var15 >> arg5;
            int var16 = arg6 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = arg6 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            var13 = arg6 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += arg6;
        }
        arg10.field527 = var13 >> 8;
        arg10.field521 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[B[IIIIIIILda;II)I", line = 39)
    private static final int method201(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class20 arg10, int arg11, int arg12) {
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
        arg10.field521 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 67)
    public final synchronized void method202(int arg0) {
        this.field527 = arg0;
        this.field523 = 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lfd;II)Lda;", line = 74)
    public static final class20 method203(class35 arg0, int arg1, int arg2) {
        return arg0.field872 != null && arg0.field872.length != 0 ? new class20(arg0, (int) ((long) arg0.field870 * 256L * (long) arg1 / (long) (client.field447 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([B[IIIIIIILda;)I", line = 80)
    private static final int method204(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class20 arg8) {
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
        arg8.field521 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([III)I", line = 105)
    public final synchronized int method205(int[] arg0, int arg1, int arg2) {
        if (this.field527 != 0 || this.field523 != 0 && this.field518 != 0 && this.field518 != Integer.MIN_VALUE) {
            class35 var4 = (class35) super.field1228;
            int var5 = this.field517 << 8;
            int var6 = this.field525 << 8;
            int var7 = var4.field872.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field522 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field522 < 0) {
                if (this.field519) {
                    if (this.field526 < 0) {
                        var9 = this.method214(arg0, arg1, var5, var10, var4.field872[this.field517]);
                        if (this.field521 >= var5) {
                            return 1;
                        }
                        this.field521 = var5 + var5 - 1 - this.field521;
                        this.field526 = -this.field526;
                    }
                    while (true) {
                        int var11 = this.method212(arg0, var9, var6, var10, var4.field872[this.field525 - 1]);
                        if (this.field521 < var6) {
                            return 1;
                        }
                        this.field521 = var6 + var6 - 1 - this.field521;
                        this.field526 = -this.field526;
                        var9 = this.method214(arg0, var11, var5, var10, var4.field872[this.field517]);
                        if (this.field521 >= var5) {
                            return 1;
                        }
                        this.field521 = var5 + var5 - 1 - this.field521;
                        this.field526 = -this.field526;
                    }
                } else if (this.field526 < 0) {
                    while (true) {
                        var9 = this.method214(arg0, var9, var5, var10, var4.field872[this.field525 - 1]);
                        if (this.field521 >= var5) {
                            return 1;
                        }
                        this.field521 = var6 - 1 - (var6 - 1 - this.field521) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method212(arg0, var9, var6, var10, var4.field872[this.field517]);
                        if (this.field521 < var6) {
                            return 1;
                        }
                        this.field521 = (this.field521 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field522 > 0) {
                    if (this.field519) {
                        label118: {
                            if (this.field526 < 0) {
                                var9 = this.method214(arg0, arg1, var5, var10, var4.field872[this.field517]);
                                if (this.field521 >= var5) {
                                    return 1;
                                }
                                this.field521 = var5 + var5 - 1 - this.field521;
                                this.field526 = -this.field526;
                                if (--this.field522 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method212(arg0, var9, var6, var10, var4.field872[this.field525 - 1]);
                                if (this.field521 < var6) {
                                    return 1;
                                }
                                this.field521 = var6 + var6 - 1 - this.field521;
                                this.field526 = -this.field526;
                                if (--this.field522 == 0) {
                                    break;
                                }
                                var9 = this.method214(arg0, var9, var5, var10, var4.field872[this.field517]);
                                if (this.field521 >= var5) {
                                    return 1;
                                }
                                this.field521 = var5 + var5 - 1 - this.field521;
                                this.field526 = -this.field526;
                            } while (--this.field522 != 0);
                        }
                    } else if (this.field526 < 0) {
                        while (true) {
                            var9 = this.method214(arg0, var9, var5, var10, var4.field872[this.field525 - 1]);
                            if (this.field521 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field521) / var8;
                            if (var12 >= this.field522) {
                                this.field521 += this.field522 * var8;
                                this.field522 = 0;
                                break;
                            }
                            this.field521 += var8 * var12;
                            this.field522 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method212(arg0, var9, var6, var10, var4.field872[this.field517]);
                            if (this.field521 < var6) {
                                return 1;
                            }
                            int var13 = (this.field521 - var5) / var8;
                            if (var13 >= this.field522) {
                                this.field521 -= this.field522 * var8;
                                this.field522 = 0;
                                break;
                            }
                            this.field521 -= var8 * var13;
                            this.field522 -= var13;
                        }
                    }
                }
                if (this.field526 < 0) {
                    this.method214(arg0, var9, 0, var10, 0);
                    if (this.field521 < 0) {
                        this.field521 = 0;
                        this.method249(0);
                    }
                } else {
                    this.method212(arg0, var9, var7, var10, 0);
                    if (this.field521 >= var7) {
                        this.field521 = var7 - 1;
                        this.method249(0);
                    }
                }
                return 1;
            }
        } else {
            this.method209(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[B[IIIIIIIIILda;II)I", line = 313)
    private static final int method206(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class20 arg12, int arg13, int arg14) {
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
        arg12.field527 = arg6;
        arg12.field521 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V", line = 344)
    public final synchronized void method207(int arg0) {
        this.field522 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "([B[IIIIIIIIILda;)I", line = 348)
    private static final int method208(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class20 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14;
        if ((var14 = arg3 + var11 - (var12 - 1)) > arg8) {
            var14 = arg8;
        }
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var15 = arg6 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var11--] * var15 >> arg5;
            int var16 = arg6 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = arg6 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            var13 = arg6 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += arg6;
        }
        arg10.field527 = var13 >> 8;
        arg10.field521 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V", line = 381)
    public final synchronized void method209(int arg0) {
        if (this.field523 > 0) {
            if (arg0 >= this.field523) {
                if (this.field518 == Integer.MIN_VALUE) {
                    this.method249(0);
                    arg0 = this.field523;
                } else {
                    this.field527 = this.field518;
                }
                this.field523 = 0;
            } else {
                this.field527 += this.field520 * arg0;
                this.field523 -= arg0;
            }
        }
        this.field521 += this.field526 * arg0;
        class35 var2 = (class35) super.field1228;
        int var3 = this.field517 << 8;
        int var4 = this.field525 << 8;
        int var5 = var2.field872.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field522 = 0;
        }
        if (this.field522 < 0) {
            if (!this.field519) {
                if (this.field526 < 0) {
                    if (this.field521 < var3) {
                        this.field521 = var4 - 1 - (var4 - 1 - this.field521) % var6;
                    }
                } else if (this.field521 >= var4) {
                    this.field521 = (this.field521 - var3) % var6 + var3;
                }
            } else {
                if (this.field526 < 0) {
                    if (this.field521 >= var3) {
                        return;
                    }
                    this.field521 = var3 + var3 - 1 - this.field521;
                    this.field526 = -this.field526;
                }
                while (this.field521 >= var4) {
                    this.field521 = var4 + var4 - 1 - this.field521;
                    this.field526 = -this.field526;
                    if (this.field521 >= var3) {
                        return;
                    }
                    this.field521 = var3 + var3 - 1 - this.field521;
                    this.field526 = -this.field526;
                }
            }
        } else {
            if (this.field522 > 0) {
                if (this.field519) {
                    label113: {
                        if (this.field526 < 0) {
                            if (this.field521 >= var3) {
                                return;
                            }
                            this.field521 = var3 + var3 - 1 - this.field521;
                            this.field526 = -this.field526;
                            if (--this.field522 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field521 < var4) {
                                return;
                            }
                            this.field521 = var4 + var4 - 1 - this.field521;
                            this.field526 = -this.field526;
                            if (--this.field522 == 0) {
                                break;
                            }
                            if (this.field521 >= var3) {
                                return;
                            }
                            this.field521 = var3 + var3 - 1 - this.field521;
                            this.field526 = -this.field526;
                        } while (--this.field522 != 0);
                    }
                } else if (this.field526 < 0) {
                    if (this.field521 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field521) / var6;
                    if (var7 < this.field522) {
                        this.field521 += var6 * var7;
                        this.field522 -= var7;
                        return;
                    }
                    this.field521 += this.field522 * var6;
                    this.field522 = 0;
                } else {
                    if (this.field521 < var4) {
                        return;
                    }
                    int var8 = (this.field521 - var3) / var6;
                    if (var8 < this.field522) {
                        this.field521 -= var6 * var8;
                        this.field522 -= var8;
                        return;
                    }
                    this.field521 -= this.field522 * var6;
                    this.field522 = 0;
                }
            }
            if (this.field526 < 0) {
                if (this.field521 < 0) {
                    this.field521 = 0;
                    this.method249(0);
                    return;
                }
            } else if (this.field521 >= var5) {
                this.field521 = var5 - 1;
                this.method249(0);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II[B[IIIIIIIIILda;II)I", line = 568)
    private static final int method210(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class20 arg12, int arg13, int arg14) {
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
        arg12.field527 = arg6;
        arg12.field521 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()I", line = 599)
    public final int method211() {
        int var1 = this.field527 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field522 == 0) {
            var2 -= this.field521 * var2 / (((class35) super.field1228).field872.length << 8);
        } else if (this.field522 >= 0) {
            var2 -= this.field517 * var2 / ((class35) super.field1228).field872.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIII)I", line = 617)
    private final int method212(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field523 > 0) {
            int var6 = this.field523 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field523 += arg1;
            if (this.field526 == 256 && (this.field521 & 255) == 0) {
                arg1 = method200(((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, this.field524, this.field520, 0, var6, arg2, this);
            } else {
                arg1 = method206(0, 0, ((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, this.field524, this.field520, 0, var6, arg2, this, this.field526, arg4);
            }
            this.field523 -= arg1;
            if (this.field523 != 0) {
                return arg1;
            }
            if (this.field518 == Integer.MIN_VALUE) {
                this.method249(0);
                return arg3;
            }
            this.field527 = this.field518;
        }
        return this.field526 == 256 && (this.field521 & 255) == 0 ? method215(((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, 0, arg3, arg2, this) : method201(0, 0, ((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, 0, arg3, arg2, this, this.field526, arg4);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II[B[IIIIIIILda;II)I", line = 658)
    private static final int method213(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class20 arg10, int arg11, int arg12) {
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
        arg10.field521 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "([IIIII)I", line = 684)
    private final int method214(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field523 > 0) {
            int var6 = this.field523 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field523 += arg1;
            if (this.field526 == -256 && (this.field521 & 255) == 0) {
                arg1 = method208(((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, this.field524, this.field520, 0, var6, arg2, this);
            } else {
                arg1 = method210(0, 0, ((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, this.field524, this.field520, 0, var6, arg2, this, this.field526, arg4);
            }
            this.field523 -= arg1;
            if (this.field523 != 0) {
                return arg1;
            }
            if (this.field518 == Integer.MIN_VALUE) {
                this.method249(0);
                return arg3;
            }
            this.field527 = this.field518;
        }
        return this.field526 == -256 && (this.field521 & 255) == 0 ? method204(((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, 0, arg3, arg2, this) : method213(0, 0, ((class35) super.field1228).field872, arg0, this.field521, arg1, this.field527, 0, arg3, arg2, this, this.field526, arg4);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "([B[IIIIIIILda;)I", line = 727)
    private static final int method215(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class20 arg8) {
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
        arg8.field521 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lfd;II)V", line = 751)
    private class20(class35 arg0, int arg1, int arg2) {
        super.field1228 = arg0;
        this.field517 = arg0.field871;
        this.field525 = arg0.field873;
        this.field526 = arg1;
        this.field527 = arg2;
        this.field521 = 0;
    }
}
