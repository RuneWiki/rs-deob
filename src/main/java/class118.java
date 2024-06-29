import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class118 extends class59 {

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    private int field2533;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "Z")
    private boolean field2539;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II[B[IIIIIIILuc;II)I")
    private static final int method859(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field2537 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([IIIII)I")
    private final int method860(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2530 > 0) {
            int var6 = this.field2530 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2530 += arg1;
            if (this.field2532 == -256 && (this.field2537 & 255) == 0) {
                arg1 = method866(((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, this.field2531, this.field2534, 0, var6, arg2, this);
            } else {
                arg1 = method863(0, 0, ((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, this.field2531, this.field2534, 0, var6, arg2, this, this.field2532, arg4);
            }
            this.field2530 -= arg1;
            if (this.field2530 != 0) {
                return arg1;
            }
            if (this.field2529 == Integer.MIN_VALUE) {
                this.method502(0);
                return arg3;
            }
            this.field2536 = this.field2529;
        }
        return this.field2532 == -256 && (this.field2537 & 255) == 0 ? method868(((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, 0, arg3, arg2, this) : method859(0, 0, ((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, 0, arg3, arg2, this, this.field2532, arg4);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public final synchronized void method861(int arg0) {
        this.field2535 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([III)I")
    public final synchronized int method196(int[] arg0, int arg1, int arg2) {
        if (this.field2536 != 0 || this.field2530 != 0 && this.field2529 != 0 && this.field2529 != Integer.MIN_VALUE) {
            class38 var4 = (class38) super.field1208;
            int var5 = this.field2533 << 8;
            int var6 = this.field2538 << 8;
            int var7 = var4.field748.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2535 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2535 < 0) {
                if (this.field2539) {
                    if (this.field2532 < 0) {
                        var9 = this.method860(arg0, arg1, var5, var10, var4.field748[this.field2533]);
                        if (this.field2537 >= var5) {
                            return 1;
                        }
                        this.field2537 = var5 + var5 - 1 - this.field2537;
                        this.field2532 = -this.field2532;
                    }
                    while (true) {
                        int var11 = this.method867(arg0, var9, var6, var10, var4.field748[this.field2538 - 1]);
                        if (this.field2537 < var6) {
                            return 1;
                        }
                        this.field2537 = var6 + var6 - 1 - this.field2537;
                        this.field2532 = -this.field2532;
                        var9 = this.method860(arg0, var11, var5, var10, var4.field748[this.field2533]);
                        if (this.field2537 >= var5) {
                            return 1;
                        }
                        this.field2537 = var5 + var5 - 1 - this.field2537;
                        this.field2532 = -this.field2532;
                    }
                } else if (this.field2532 < 0) {
                    while (true) {
                        var9 = this.method860(arg0, var9, var5, var10, var4.field748[this.field2538 - 1]);
                        if (this.field2537 >= var5) {
                            return 1;
                        }
                        this.field2537 = var6 - 1 - (var6 - 1 - this.field2537) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method867(arg0, var9, var6, var10, var4.field748[this.field2533]);
                        if (this.field2537 < var6) {
                            return 1;
                        }
                        this.field2537 = (this.field2537 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2535 > 0) {
                    if (this.field2539) {
                        label118: {
                            if (this.field2532 < 0) {
                                var9 = this.method860(arg0, arg1, var5, var10, var4.field748[this.field2533]);
                                if (this.field2537 >= var5) {
                                    return 1;
                                }
                                this.field2537 = var5 + var5 - 1 - this.field2537;
                                this.field2532 = -this.field2532;
                                if (--this.field2535 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method867(arg0, var9, var6, var10, var4.field748[this.field2538 - 1]);
                                if (this.field2537 < var6) {
                                    return 1;
                                }
                                this.field2537 = var6 + var6 - 1 - this.field2537;
                                this.field2532 = -this.field2532;
                                if (--this.field2535 == 0) {
                                    break;
                                }
                                var9 = this.method860(arg0, var9, var5, var10, var4.field748[this.field2533]);
                                if (this.field2537 >= var5) {
                                    return 1;
                                }
                                this.field2537 = var5 + var5 - 1 - this.field2537;
                                this.field2532 = -this.field2532;
                            } while (--this.field2535 != 0);
                        }
                    } else if (this.field2532 < 0) {
                        while (true) {
                            var9 = this.method860(arg0, var9, var5, var10, var4.field748[this.field2538 - 1]);
                            if (this.field2537 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field2537) / var8;
                            if (var12 >= this.field2535) {
                                this.field2537 += this.field2535 * var8;
                                this.field2535 = 0;
                                break;
                            }
                            this.field2537 += var8 * var12;
                            this.field2535 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method867(arg0, var9, var6, var10, var4.field748[this.field2533]);
                            if (this.field2537 < var6) {
                                return 1;
                            }
                            int var13 = (this.field2537 - var5) / var8;
                            if (var13 >= this.field2535) {
                                this.field2537 -= this.field2535 * var8;
                                this.field2535 = 0;
                                break;
                            }
                            this.field2537 -= var8 * var13;
                            this.field2535 -= var13;
                        }
                    }
                }
                if (this.field2532 < 0) {
                    this.method860(arg0, var9, 0, var10, 0);
                    if (this.field2537 < 0) {
                        this.field2537 = 0;
                        this.method502(0);
                    }
                } else {
                    this.method867(arg0, var9, var7, var10, 0);
                    if (this.field2537 >= var7) {
                        this.field2537 = var7 - 1;
                        this.method502(0);
                    }
                }
                return 1;
            }
        } else {
            this.method202(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([B[IIIIIIIIILuc;)I")
    private static final int method862(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field2536 = var13 >> 8;
        arg10.field2537 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II[B[IIIIIIIIILuc;II)I")
    private static final int method863(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12, int arg13, int arg14) {
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
        arg12.field2536 = arg6;
        arg12.field2537 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public final synchronized void method202(int arg0) {
        if (this.field2530 > 0) {
            if (arg0 >= this.field2530) {
                if (this.field2529 == Integer.MIN_VALUE) {
                    this.method502(0);
                    arg0 = this.field2530;
                } else {
                    this.field2536 = this.field2529;
                }
                this.field2530 = 0;
            } else {
                this.field2536 += this.field2534 * arg0;
                this.field2530 -= arg0;
            }
        }
        this.field2537 += this.field2532 * arg0;
        class38 var2 = (class38) super.field1208;
        int var3 = this.field2533 << 8;
        int var4 = this.field2538 << 8;
        int var5 = var2.field748.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2535 = 0;
        }
        if (this.field2535 < 0) {
            if (!this.field2539) {
                if (this.field2532 < 0) {
                    if (this.field2537 < var3) {
                        this.field2537 = var4 - 1 - (var4 - 1 - this.field2537) % var6;
                    }
                } else if (this.field2537 >= var4) {
                    this.field2537 = (this.field2537 - var3) % var6 + var3;
                }
            } else {
                if (this.field2532 < 0) {
                    if (this.field2537 >= var3) {
                        return;
                    }
                    this.field2537 = var3 + var3 - 1 - this.field2537;
                    this.field2532 = -this.field2532;
                }
                while (this.field2537 >= var4) {
                    this.field2537 = var4 + var4 - 1 - this.field2537;
                    this.field2532 = -this.field2532;
                    if (this.field2537 >= var3) {
                        return;
                    }
                    this.field2537 = var3 + var3 - 1 - this.field2537;
                    this.field2532 = -this.field2532;
                }
            }
        } else {
            if (this.field2535 > 0) {
                if (this.field2539) {
                    label113: {
                        if (this.field2532 < 0) {
                            if (this.field2537 >= var3) {
                                return;
                            }
                            this.field2537 = var3 + var3 - 1 - this.field2537;
                            this.field2532 = -this.field2532;
                            if (--this.field2535 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field2537 < var4) {
                                return;
                            }
                            this.field2537 = var4 + var4 - 1 - this.field2537;
                            this.field2532 = -this.field2532;
                            if (--this.field2535 == 0) {
                                break;
                            }
                            if (this.field2537 >= var3) {
                                return;
                            }
                            this.field2537 = var3 + var3 - 1 - this.field2537;
                            this.field2532 = -this.field2532;
                        } while (--this.field2535 != 0);
                    }
                } else if (this.field2532 < 0) {
                    if (this.field2537 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2537) / var6;
                    if (var7 < this.field2535) {
                        this.field2537 += var6 * var7;
                        this.field2535 -= var7;
                        return;
                    }
                    this.field2537 += this.field2535 * var6;
                    this.field2535 = 0;
                } else {
                    if (this.field2537 < var4) {
                        return;
                    }
                    int var8 = (this.field2537 - var3) / var6;
                    if (var8 < this.field2535) {
                        this.field2537 -= var6 * var8;
                        this.field2535 -= var8;
                        return;
                    }
                    this.field2537 -= this.field2535 * var6;
                    this.field2535 = 0;
                }
            }
            if (this.field2532 < 0) {
                if (this.field2537 < 0) {
                    this.field2537 = 0;
                    this.method502(0);
                    return;
                }
            } else if (this.field2537 >= var5) {
                this.field2537 = var5 - 1;
                this.method502(0);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lga;II)Luc;")
    public static final class118 method864(class38 arg0, int arg1, int arg2) {
        return arg0.field748 != null && arg0.field748.length != 0 ? new class118(arg0, (int) ((long) arg0.field747 * 256L * (long) arg1 / (long) (class35.field710 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([B[IIIIIIILuc;)I")
    private static final int method865(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field2537 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "([B[IIIIIIIIILuc;)I")
    private static final int method866(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field2536 = var13 >> 8;
        arg10.field2537 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
    public final int method360() {
        int var1 = this.field2536 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2535 == 0) {
            var2 -= this.field2537 * var2 / (((class38) super.field1208).field748.length << 8);
        } else if (this.field2535 >= 0) {
            var2 -= this.field2533 * var2 / ((class38) super.field1208).field748.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "([IIIII)I")
    private final int method867(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2530 > 0) {
            int var6 = this.field2530 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2530 += arg1;
            if (this.field2532 == 256 && (this.field2537 & 255) == 0) {
                arg1 = method862(((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, this.field2531, this.field2534, 0, var6, arg2, this);
            } else {
                arg1 = method869(0, 0, ((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, this.field2531, this.field2534, 0, var6, arg2, this, this.field2532, arg4);
            }
            this.field2530 -= arg1;
            if (this.field2530 != 0) {
                return arg1;
            }
            if (this.field2529 == Integer.MIN_VALUE) {
                this.method502(0);
                return arg3;
            }
            this.field2536 = this.field2529;
        }
        return this.field2532 == 256 && (this.field2537 & 255) == 0 ? method865(((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, 0, arg3, arg2, this) : method870(0, 0, ((class38) super.field1208).field748, arg0, this.field2537, arg1, this.field2536, 0, arg3, arg2, this, this.field2532, arg4);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "([B[IIIIIIILuc;)I")
    private static final int method868(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field2537 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lga;II)V")
    private class118(class38 arg0, int arg1, int arg2) {
        super.field1208 = arg0;
        this.field2533 = arg0.field749;
        this.field2538 = arg0.field750;
        this.field2532 = arg1;
        this.field2536 = arg2;
        this.field2537 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II[B[IIIIIIIIILuc;II)I")
    private static final int method869(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12, int arg13, int arg14) {
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
        arg12.field2536 = arg6;
        arg12.field2537 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II[B[IIIIIIILuc;II)I")
    private static final int method870(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field2537 = arg4;
        return arg5;
    }
}
