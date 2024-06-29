import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class123 extends class89 {

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    private int field3021;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field3015;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    private int field3022;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Z")
    private boolean field3014;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()Z", line = 8)
    public final boolean method967() {
        return this.method590(1000);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 11)
    public final synchronized void method738(int arg0) {
        if (this.field3013 > 0) {
            if (arg0 >= this.field3013) {
                if (this.field3016 == Integer.MIN_VALUE) {
                    this.method589(true);
                    arg0 = this.field3013;
                } else {
                    this.field3017 = this.field3016;
                }
                this.field3013 = 0;
            } else {
                this.field3017 += this.field3022 * arg0;
                this.field3013 -= arg0;
            }
        }
        this.field3021 += this.field3020 * arg0;
        class77 var2 = (class77) super.field2179;
        int var3 = this.field3018 << 8;
        int var4 = this.field3023 << 8;
        int var5 = var2.field1950.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3015 = 0;
        }
        if (this.field3015 < 0) {
            if (!this.field3014) {
                if (this.field3020 < 0) {
                    if (this.field3021 < var3) {
                        this.field3021 = var4 - 1 - (var4 - 1 - this.field3021) % var6;
                    }
                } else if (this.field3021 >= var4) {
                    this.field3021 = (this.field3021 - var3) % var6 + var3;
                }
            } else {
                if (this.field3020 < 0) {
                    if (this.field3021 >= var3) {
                        return;
                    }
                    this.field3021 = var3 + var3 - 1 - this.field3021;
                    this.field3020 = -this.field3020;
                }
                while (this.field3021 >= var4) {
                    this.field3021 = var4 + var4 - 1 - this.field3021;
                    this.field3020 = -this.field3020;
                    if (this.field3021 >= var3) {
                        return;
                    }
                    this.field3021 = var3 + var3 - 1 - this.field3021;
                    this.field3020 = -this.field3020;
                }
            }
        } else {
            if (this.field3015 > 0) {
                if (this.field3014) {
                    label113: {
                        if (this.field3020 < 0) {
                            if (this.field3021 >= var3) {
                                return;
                            }
                            this.field3021 = var3 + var3 - 1 - this.field3021;
                            this.field3020 = -this.field3020;
                            if (--this.field3015 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field3021 < var4) {
                                return;
                            }
                            this.field3021 = var4 + var4 - 1 - this.field3021;
                            this.field3020 = -this.field3020;
                            if (--this.field3015 == 0) {
                                break;
                            }
                            if (this.field3021 >= var3) {
                                return;
                            }
                            this.field3021 = var3 + var3 - 1 - this.field3021;
                            this.field3020 = -this.field3020;
                        } while (--this.field3015 != 0);
                    }
                } else if (this.field3020 < 0) {
                    if (this.field3021 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3021) / var6;
                    if (var7 < this.field3015) {
                        this.field3021 += var6 * var7;
                        this.field3015 -= var7;
                        return;
                    }
                    this.field3021 += this.field3015 * var6;
                    this.field3015 = 0;
                } else {
                    if (this.field3021 < var4) {
                        return;
                    }
                    int var8 = (this.field3021 - var3) / var6;
                    if (var8 < this.field3015) {
                        this.field3021 -= var6 * var8;
                        this.field3015 -= var8;
                        return;
                    }
                    this.field3021 -= this.field3015 * var6;
                    this.field3015 = 0;
                }
            }
            if (this.field3020 < 0) {
                if (this.field3021 < 0) {
                    this.field3021 = 0;
                    this.method589(true);
                    return;
                }
            } else if (this.field3021 >= var5) {
                this.field3021 = var5 - 1;
                this.method589(true);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lme;II)Lva;", line = 198)
    public static final class123 method968(class77 arg0, int arg1, int arg2) {
        return arg0.field1950 != null && arg0.field1950.length != 0 ? new class123(arg0, (int) ((long) arg0.field1951 * 256L * (long) arg1 / (long) (class10.field221 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B[IIIIIIIIILva;)I", line = 204)
    private static final int method969(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field3017 = var13 >> 8;
        arg10.field3021 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B[IIIIIIIIILva;II)I", line = 237)
    private static final int method970(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12, int arg13, int arg14) {
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
        arg12.field3017 = arg6;
        arg12.field3021 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B[IIIIIIILva;II)I", line = 268)
    private static final int method971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field3021 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIII)I", line = 294)
    private final int method972(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3013 > 0) {
            int var6 = this.field3013 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3013 += arg1;
            if (this.field3020 == -256 && (this.field3021 & 255) == 0) {
                arg1 = method978(((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, this.field3019, this.field3022, 0, var6, arg2, this);
            } else {
                arg1 = method970(0, 0, ((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, this.field3019, this.field3022, 0, var6, arg2, this, this.field3020, arg4);
            }
            this.field3013 -= arg1;
            if (this.field3013 != 0) {
                return arg1;
            }
            if (this.field3016 == Integer.MIN_VALUE) {
                this.method589(true);
                return arg3;
            }
            this.field3017 = this.field3016;
        }
        return this.field3020 == -256 && (this.field3021 & 255) == 0 ? method977(((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, 0, arg3, arg2, this) : method971(0, 0, ((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, 0, arg3, arg2, this, this.field3020, arg4);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([IIIII)I", line = 338)
    private final int method973(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field3013 > 0) {
            int var6 = this.field3013 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3013 += arg1;
            if (this.field3020 == 256 && (this.field3021 & 255) == 0) {
                arg1 = method969(((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, this.field3019, this.field3022, 0, var6, arg2, this);
            } else {
                arg1 = method980(0, 0, ((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, this.field3019, this.field3022, 0, var6, arg2, this, this.field3020, arg4);
            }
            this.field3013 -= arg1;
            if (this.field3013 != 0) {
                return arg1;
            }
            if (this.field3016 == Integer.MIN_VALUE) {
                this.method589(true);
                return arg3;
            }
            this.field3017 = this.field3016;
        }
        return this.field3020 == 256 && (this.field3021 & 255) == 0 ? method979(((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, 0, arg3, arg2, this) : method974(0, 0, ((class77) super.field2179).field1950, arg0, this.field3021, arg1, this.field3017, 0, arg3, arg2, this, this.field3020, arg4);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II[B[IIIIIIILva;II)I", line = 379)
    private static final int method974(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field3021 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 405)
    public final synchronized void method975(int arg0) {
        this.field3017 = arg0;
        this.field3013 = 0;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 410)
    public final synchronized void method976(int arg0) {
        this.field3015 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B[IIIIIIILva;)I", line = 416)
    private static final int method977(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field3021 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([B[IIIIIIIIILva;)I", line = 443)
    private static final int method978(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field3017 = var13 >> 8;
        arg10.field3021 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([B[IIIIIIILva;)I", line = 474)
    private static final int method979(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field3021 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II[B[IIIIIIIIILva;II)I", line = 499)
    private static final int method980(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12, int arg13, int arg14) {
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
        arg12.field3017 = arg6;
        arg12.field3021 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([III)I", line = 530)
    public final synchronized int method739(int[] arg0, int arg1, int arg2) {
        if (this.field3017 != 0 || this.field3013 != 0 && this.field3016 != 0 && this.field3016 != Integer.MIN_VALUE) {
            class77 var4 = (class77) super.field2179;
            int var5 = this.field3018 << 8;
            int var6 = this.field3023 << 8;
            int var7 = var4.field1950.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3015 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3015 < 0) {
                if (this.field3014) {
                    if (this.field3020 < 0) {
                        var9 = this.method972(arg0, arg1, var5, var10, var4.field1950[this.field3018]);
                        if (this.field3021 >= var5) {
                            return 1;
                        }
                        this.field3021 = var5 + var5 - 1 - this.field3021;
                        this.field3020 = -this.field3020;
                    }
                    while (true) {
                        int var11 = this.method973(arg0, var9, var6, var10, var4.field1950[this.field3023 - 1]);
                        if (this.field3021 < var6) {
                            return 1;
                        }
                        this.field3021 = var6 + var6 - 1 - this.field3021;
                        this.field3020 = -this.field3020;
                        var9 = this.method972(arg0, var11, var5, var10, var4.field1950[this.field3018]);
                        if (this.field3021 >= var5) {
                            return 1;
                        }
                        this.field3021 = var5 + var5 - 1 - this.field3021;
                        this.field3020 = -this.field3020;
                    }
                } else if (this.field3020 < 0) {
                    while (true) {
                        var9 = this.method972(arg0, var9, var5, var10, var4.field1950[this.field3023 - 1]);
                        if (this.field3021 >= var5) {
                            return 1;
                        }
                        this.field3021 = var6 - 1 - (var6 - 1 - this.field3021) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method973(arg0, var9, var6, var10, var4.field1950[this.field3018]);
                        if (this.field3021 < var6) {
                            return 1;
                        }
                        this.field3021 = (this.field3021 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3015 > 0) {
                    if (this.field3014) {
                        label118: {
                            if (this.field3020 < 0) {
                                var9 = this.method972(arg0, arg1, var5, var10, var4.field1950[this.field3018]);
                                if (this.field3021 >= var5) {
                                    return 1;
                                }
                                this.field3021 = var5 + var5 - 1 - this.field3021;
                                this.field3020 = -this.field3020;
                                if (--this.field3015 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method973(arg0, var9, var6, var10, var4.field1950[this.field3023 - 1]);
                                if (this.field3021 < var6) {
                                    return 1;
                                }
                                this.field3021 = var6 + var6 - 1 - this.field3021;
                                this.field3020 = -this.field3020;
                                if (--this.field3015 == 0) {
                                    break;
                                }
                                var9 = this.method972(arg0, var9, var5, var10, var4.field1950[this.field3018]);
                                if (this.field3021 >= var5) {
                                    return 1;
                                }
                                this.field3021 = var5 + var5 - 1 - this.field3021;
                                this.field3020 = -this.field3020;
                            } while (--this.field3015 != 0);
                        }
                    } else if (this.field3020 < 0) {
                        while (true) {
                            var9 = this.method972(arg0, var9, var5, var10, var4.field1950[this.field3023 - 1]);
                            if (this.field3021 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field3021) / var8;
                            if (var12 >= this.field3015) {
                                this.field3021 += this.field3015 * var8;
                                this.field3015 = 0;
                                break;
                            }
                            this.field3021 += var8 * var12;
                            this.field3015 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method973(arg0, var9, var6, var10, var4.field1950[this.field3018]);
                            if (this.field3021 < var6) {
                                return 1;
                            }
                            int var13 = (this.field3021 - var5) / var8;
                            if (var13 >= this.field3015) {
                                this.field3021 -= this.field3015 * var8;
                                this.field3015 = 0;
                                break;
                            }
                            this.field3021 -= var8 * var13;
                            this.field3015 -= var13;
                        }
                    }
                }
                if (this.field3020 < 0) {
                    this.method972(arg0, var9, 0, var10, 0);
                    if (this.field3021 < 0) {
                        this.field3021 = 0;
                        this.method589(true);
                    }
                } else {
                    this.method973(arg0, var9, var7, var10, 0);
                    if (this.field3021 >= var7) {
                        this.field3021 = var7 - 1;
                        this.method589(true);
                    }
                }
                return 1;
            }
        } else {
            this.method738(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()I", line = 740)
    public final int method740() {
        int var1 = this.field3017 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3015 == 0) {
            var2 -= this.field3021 * var2 / (((class77) super.field2179).field1950.length << 8);
        } else if (this.field3015 >= 0) {
            var2 -= this.field3018 * var2 / ((class77) super.field2179).field1950.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lme;II)V", line = 751)
    private class123(class77 arg0, int arg1, int arg2) {
        super.field2179 = arg0;
        this.field3018 = arg0.field1952;
        this.field3023 = arg0.field1949;
        this.field3020 = arg1;
        this.field3017 = arg2;
        this.field3021 = 0;
    }
}
