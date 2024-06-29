import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class25 extends class118 {

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Z")
    private boolean field624;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[B[IIIIIIILea;II)I", line = 4)
    private static final int method198(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class25 arg10, int arg11, int arg12) {
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
        arg10.field625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqa;II)Lea;", line = 33)
    public static final class25 method199(class96 arg0, int arg1, int arg2) {
        return arg0.field2503 != null && arg0.field2503.length != 0 ? new class25(arg0, (int) ((long) arg0.field2502 * 256L * (long) arg1 / (long) (class66.field1776 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B[IIIIIIIIILea;)I", line = 39)
    private static final int method200(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class25 arg10) {
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
        arg10.field626 = var13 >> 8;
        arg10.field625 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B[IIIIIIILea;)I", line = 70)
    private static final int method201(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class25 arg8) {
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
        arg8.field625 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIII)I", line = 95)
    private final int method202(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field620 > 0) {
            int var6 = this.field620 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field620 += arg1;
            if (this.field618 == 256 && (this.field625 & 255) == 0) {
                arg1 = method208(((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, this.field627, this.field619, 0, var6, arg2, this);
            } else {
                arg1 = method207(0, 0, ((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, this.field627, this.field619, 0, var6, arg2, this, this.field618, arg4);
            }
            this.field620 -= arg1;
            if (this.field620 != 0) {
                return arg1;
            }
            if (this.field628 == Integer.MIN_VALUE) {
                this.method133(2);
                return arg3;
            }
            this.field626 = this.field628;
        }
        return this.field618 == 256 && (this.field625 & 255) == 0 ? method201(((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, 0, arg3, arg2, this) : method204(0, 0, ((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, 0, arg3, arg2, this, this.field618, arg4);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[B[IIIIIIIIILea;II)I", line = 137)
    private static final int method203(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class25 arg12, int arg13, int arg14) {
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
        arg12.field626 = arg6;
        arg12.field625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II[B[IIIIIIILea;II)I", line = 168)
    private static final int method204(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class25 arg10, int arg11, int arg12) {
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
        arg10.field625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 197)
    public final synchronized void method205(int arg0) {
        this.field626 = arg0;
        this.field620 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([B[IIIIIIILea;)I", line = 203)
    private static final int method206(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class25 arg8) {
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
        arg8.field625 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II[B[IIIIIIIIILea;II)I", line = 229)
    private static final int method207(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class25 arg12, int arg13, int arg14) {
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
        arg12.field626 = arg6;
        arg12.field625 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([B[IIIIIIIIILea;)I", line = 259)
    private static final int method208(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class25 arg10) {
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
        arg10.field626 = var13 >> 8;
        arg10.field625 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I", line = 291)
    public final int method209() {
        int var1 = this.field626 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field622 == 0) {
            var2 -= this.field625 * var2 / (((class96) super.field2946).field2503.length << 8);
        } else if (this.field622 >= 0) {
            var2 -= this.field621 * var2 / ((class96) super.field2946).field2503.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 303)
    public final synchronized void method210(int arg0) {
        this.field622 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "([IIIII)I", line = 308)
    private final int method211(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field620 > 0) {
            int var6 = this.field620 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field620 += arg1;
            if (this.field618 == -256 && (this.field625 & 255) == 0) {
                arg1 = method200(((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, this.field627, this.field619, 0, var6, arg2, this);
            } else {
                arg1 = method203(0, 0, ((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, this.field627, this.field619, 0, var6, arg2, this, this.field618, arg4);
            }
            this.field620 -= arg1;
            if (this.field620 != 0) {
                return arg1;
            }
            if (this.field628 == Integer.MIN_VALUE) {
                this.method133(2);
                return arg3;
            }
            this.field626 = this.field628;
        }
        return this.field618 == -256 && (this.field625 & 255) == 0 ? method206(((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, 0, arg3, arg2, this) : method198(0, 0, ((class96) super.field2946).field2503, arg0, this.field625, arg1, this.field626, 0, arg3, arg2, this, this.field618, arg4);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 350)
    public final synchronized void method212(int arg0) {
        if (this.field620 > 0) {
            if (arg0 >= this.field620) {
                if (this.field628 == Integer.MIN_VALUE) {
                    this.method133(2);
                    arg0 = this.field620;
                } else {
                    this.field626 = this.field628;
                }
                this.field620 = 0;
            } else {
                this.field626 += this.field619 * arg0;
                this.field620 -= arg0;
            }
        }
        this.field625 += this.field618 * arg0;
        class96 var2 = (class96) super.field2946;
        int var3 = this.field621 << 8;
        int var4 = this.field623 << 8;
        int var5 = var2.field2503.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field622 = 0;
        }
        if (this.field622 < 0) {
            if (!this.field624) {
                if (this.field618 < 0) {
                    if (this.field625 < var3) {
                        this.field625 = var4 - 1 - (var4 - 1 - this.field625) % var6;
                    }
                } else if (this.field625 >= var4) {
                    this.field625 = (this.field625 - var3) % var6 + var3;
                }
            } else {
                if (this.field618 < 0) {
                    if (this.field625 >= var3) {
                        return;
                    }
                    this.field625 = var3 + var3 - 1 - this.field625;
                    this.field618 = -this.field618;
                }
                while (this.field625 >= var4) {
                    this.field625 = var4 + var4 - 1 - this.field625;
                    this.field618 = -this.field618;
                    if (this.field625 >= var3) {
                        return;
                    }
                    this.field625 = var3 + var3 - 1 - this.field625;
                    this.field618 = -this.field618;
                }
            }
        } else {
            if (this.field622 > 0) {
                if (this.field624) {
                    label113: {
                        if (this.field618 < 0) {
                            if (this.field625 >= var3) {
                                return;
                            }
                            this.field625 = var3 + var3 - 1 - this.field625;
                            this.field618 = -this.field618;
                            if (--this.field622 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field625 < var4) {
                                return;
                            }
                            this.field625 = var4 + var4 - 1 - this.field625;
                            this.field618 = -this.field618;
                            if (--this.field622 == 0) {
                                break;
                            }
                            if (this.field625 >= var3) {
                                return;
                            }
                            this.field625 = var3 + var3 - 1 - this.field625;
                            this.field618 = -this.field618;
                        } while (--this.field622 != 0);
                    }
                } else if (this.field618 < 0) {
                    if (this.field625 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field625) / var6;
                    if (var7 < this.field622) {
                        this.field625 += var6 * var7;
                        this.field622 -= var7;
                        return;
                    }
                    this.field625 += this.field622 * var6;
                    this.field622 = 0;
                } else {
                    if (this.field625 < var4) {
                        return;
                    }
                    int var8 = (this.field625 - var3) / var6;
                    if (var8 < this.field622) {
                        this.field625 -= var6 * var8;
                        this.field622 -= var8;
                        return;
                    }
                    this.field625 -= this.field622 * var6;
                    this.field622 = 0;
                }
            }
            if (this.field618 < 0) {
                if (this.field625 < 0) {
                    this.field625 = 0;
                    this.method133(2);
                    return;
                }
            } else if (this.field625 >= var5) {
                this.field625 = var5 - 1;
                this.method133(2);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)I", line = 539)
    public final synchronized int method213(int[] arg0, int arg1, int arg2) {
        if (this.field626 != 0 || this.field620 != 0 && this.field628 != 0 && this.field628 != Integer.MIN_VALUE) {
            class96 var4 = (class96) super.field2946;
            int var5 = this.field621 << 8;
            int var6 = this.field623 << 8;
            int var7 = var4.field2503.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field622 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field622 < 0) {
                if (this.field624) {
                    if (this.field618 < 0) {
                        var9 = this.method211(arg0, arg1, var5, var10, var4.field2503[this.field621]);
                        if (this.field625 >= var5) {
                            return 1;
                        }
                        this.field625 = var5 + var5 - 1 - this.field625;
                        this.field618 = -this.field618;
                    }
                    while (true) {
                        int var11 = this.method202(arg0, var9, var6, var10, var4.field2503[this.field623 - 1]);
                        if (this.field625 < var6) {
                            return 1;
                        }
                        this.field625 = var6 + var6 - 1 - this.field625;
                        this.field618 = -this.field618;
                        var9 = this.method211(arg0, var11, var5, var10, var4.field2503[this.field621]);
                        if (this.field625 >= var5) {
                            return 1;
                        }
                        this.field625 = var5 + var5 - 1 - this.field625;
                        this.field618 = -this.field618;
                    }
                } else if (this.field618 < 0) {
                    while (true) {
                        var9 = this.method211(arg0, var9, var5, var10, var4.field2503[this.field623 - 1]);
                        if (this.field625 >= var5) {
                            return 1;
                        }
                        this.field625 = var6 - 1 - (var6 - 1 - this.field625) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method202(arg0, var9, var6, var10, var4.field2503[this.field621]);
                        if (this.field625 < var6) {
                            return 1;
                        }
                        this.field625 = (this.field625 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field622 > 0) {
                    if (this.field624) {
                        label118: {
                            if (this.field618 < 0) {
                                var9 = this.method211(arg0, arg1, var5, var10, var4.field2503[this.field621]);
                                if (this.field625 >= var5) {
                                    return 1;
                                }
                                this.field625 = var5 + var5 - 1 - this.field625;
                                this.field618 = -this.field618;
                                if (--this.field622 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method202(arg0, var9, var6, var10, var4.field2503[this.field623 - 1]);
                                if (this.field625 < var6) {
                                    return 1;
                                }
                                this.field625 = var6 + var6 - 1 - this.field625;
                                this.field618 = -this.field618;
                                if (--this.field622 == 0) {
                                    break;
                                }
                                var9 = this.method211(arg0, var9, var5, var10, var4.field2503[this.field621]);
                                if (this.field625 >= var5) {
                                    return 1;
                                }
                                this.field625 = var5 + var5 - 1 - this.field625;
                                this.field618 = -this.field618;
                            } while (--this.field622 != 0);
                        }
                    } else if (this.field618 < 0) {
                        while (true) {
                            var9 = this.method211(arg0, var9, var5, var10, var4.field2503[this.field623 - 1]);
                            if (this.field625 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field625) / var8;
                            if (var12 >= this.field622) {
                                this.field625 += this.field622 * var8;
                                this.field622 = 0;
                                break;
                            }
                            this.field625 += var8 * var12;
                            this.field622 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method202(arg0, var9, var6, var10, var4.field2503[this.field621]);
                            if (this.field625 < var6) {
                                return 1;
                            }
                            int var13 = (this.field625 - var5) / var8;
                            if (var13 >= this.field622) {
                                this.field625 -= this.field622 * var8;
                                this.field622 = 0;
                                break;
                            }
                            this.field625 -= var8 * var13;
                            this.field622 -= var13;
                        }
                    }
                }
                if (this.field618 < 0) {
                    this.method211(arg0, var9, 0, var10, 0);
                    if (this.field625 < 0) {
                        this.field625 = 0;
                        this.method133(2);
                    }
                } else {
                    this.method202(arg0, var9, var7, var10, 0);
                    if (this.field625 >= var7) {
                        this.field625 = var7 - 1;
                        this.method133(2);
                    }
                }
                return 1;
            }
        } else {
            this.method212(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()Z", line = 748)
    public final boolean method214() {
        return this.method134((byte) 97);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lqa;II)V", line = 750)
    private class25(class96 arg0, int arg1, int arg2) {
        super.field2946 = arg0;
        this.field621 = arg0.field2501;
        this.field623 = arg0.field2500;
        this.field618 = arg1;
        this.field626 = arg2;
        this.field625 = 0;
    }
}
