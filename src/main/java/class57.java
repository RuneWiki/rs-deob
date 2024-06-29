import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class57 extends class33 {

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Z")
    private boolean field1466;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 4)
    public final synchronized void method420(int arg0) {
        this.field1464 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[B[IIIIIIILj;II)I", line = 7)
    private static final int method421(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10, int arg11, int arg12) {
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
        arg10.field1462 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Z", line = 38)
    public final boolean method422() {
        return this.method830(2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[B[IIIIIIIIILj;II)I", line = 42)
    private static final int method423(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12, int arg13, int arg14) {
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
        arg12.field1460 = arg6;
        arg12.field1462 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 71)
    public final synchronized void method176(int arg0) {
        if (this.field1463 > 0) {
            if (arg0 >= this.field1463) {
                if (this.field1459 == Integer.MIN_VALUE) {
                    this.method833(4);
                    arg0 = this.field1463;
                } else {
                    this.field1460 = this.field1459;
                }
                this.field1463 = 0;
            } else {
                this.field1460 += this.field1467 * arg0;
                this.field1463 -= arg0;
            }
        }
        this.field1462 += this.field1468 * arg0;
        class119 var2 = (class119) super.field850;
        int var3 = this.field1469 << 8;
        int var4 = this.field1461 << 8;
        int var5 = var2.field2808.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1464 = 0;
        }
        if (this.field1464 < 0) {
            if (!this.field1466) {
                if (this.field1468 < 0) {
                    if (this.field1462 < var3) {
                        this.field1462 = var4 - 1 - (var4 - 1 - this.field1462) % var6;
                    }
                } else if (this.field1462 >= var4) {
                    this.field1462 = (this.field1462 - var3) % var6 + var3;
                }
            } else {
                if (this.field1468 < 0) {
                    if (this.field1462 >= var3) {
                        return;
                    }
                    this.field1462 = var3 + var3 - 1 - this.field1462;
                    this.field1468 = -this.field1468;
                }
                while (this.field1462 >= var4) {
                    this.field1462 = var4 + var4 - 1 - this.field1462;
                    this.field1468 = -this.field1468;
                    if (this.field1462 >= var3) {
                        return;
                    }
                    this.field1462 = var3 + var3 - 1 - this.field1462;
                    this.field1468 = -this.field1468;
                }
            }
        } else {
            if (this.field1464 > 0) {
                if (this.field1466) {
                    label113: {
                        if (this.field1468 < 0) {
                            if (this.field1462 >= var3) {
                                return;
                            }
                            this.field1462 = var3 + var3 - 1 - this.field1462;
                            this.field1468 = -this.field1468;
                            if (--this.field1464 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field1462 < var4) {
                                return;
                            }
                            this.field1462 = var4 + var4 - 1 - this.field1462;
                            this.field1468 = -this.field1468;
                            if (--this.field1464 == 0) {
                                break;
                            }
                            if (this.field1462 >= var3) {
                                return;
                            }
                            this.field1462 = var3 + var3 - 1 - this.field1462;
                            this.field1468 = -this.field1468;
                        } while (--this.field1464 != 0);
                    }
                } else if (this.field1468 < 0) {
                    if (this.field1462 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1462) / var6;
                    if (var7 < this.field1464) {
                        this.field1462 += var6 * var7;
                        this.field1464 -= var7;
                        return;
                    }
                    this.field1462 += this.field1464 * var6;
                    this.field1464 = 0;
                } else {
                    if (this.field1462 < var4) {
                        return;
                    }
                    int var8 = (this.field1462 - var3) / var6;
                    if (var8 < this.field1464) {
                        this.field1462 -= var6 * var8;
                        this.field1464 -= var8;
                        return;
                    }
                    this.field1462 -= this.field1464 * var6;
                    this.field1464 = 0;
                }
            }
            if (this.field1468 < 0) {
                if (this.field1462 < 0) {
                    this.field1462 = 0;
                    this.method833(4);
                    return;
                }
            } else if (this.field1462 >= var5) {
                this.field1462 = var5 - 1;
                this.method833(4);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II[B[IIIIIIILj;II)I", line = 258)
    private static final int method424(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10, int arg11, int arg12) {
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
        arg10.field1462 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([III)I", line = 286)
    public final synchronized int method180(int[] arg0, int arg1, int arg2) {
        if (this.field1460 != 0 || this.field1463 != 0 && this.field1459 != 0 && this.field1459 != Integer.MIN_VALUE) {
            class119 var4 = (class119) super.field850;
            int var5 = this.field1469 << 8;
            int var6 = this.field1461 << 8;
            int var7 = var4.field2808.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1464 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1464 < 0) {
                if (this.field1466) {
                    if (this.field1468 < 0) {
                        var9 = this.method427(arg0, arg1, var5, var10, var4.field2808[this.field1469]);
                        if (this.field1462 >= var5) {
                            return 1;
                        }
                        this.field1462 = var5 + var5 - 1 - this.field1462;
                        this.field1468 = -this.field1468;
                    }
                    while (true) {
                        int var11 = this.method432(arg0, var9, var6, var10, var4.field2808[this.field1461 - 1]);
                        if (this.field1462 < var6) {
                            return 1;
                        }
                        this.field1462 = var6 + var6 - 1 - this.field1462;
                        this.field1468 = -this.field1468;
                        var9 = this.method427(arg0, var11, var5, var10, var4.field2808[this.field1469]);
                        if (this.field1462 >= var5) {
                            return 1;
                        }
                        this.field1462 = var5 + var5 - 1 - this.field1462;
                        this.field1468 = -this.field1468;
                    }
                } else if (this.field1468 < 0) {
                    while (true) {
                        var9 = this.method427(arg0, var9, var5, var10, var4.field2808[this.field1461 - 1]);
                        if (this.field1462 >= var5) {
                            return 1;
                        }
                        this.field1462 = var6 - 1 - (var6 - 1 - this.field1462) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method432(arg0, var9, var6, var10, var4.field2808[this.field1469]);
                        if (this.field1462 < var6) {
                            return 1;
                        }
                        this.field1462 = (this.field1462 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1464 > 0) {
                    if (this.field1466) {
                        label118: {
                            if (this.field1468 < 0) {
                                var9 = this.method427(arg0, arg1, var5, var10, var4.field2808[this.field1469]);
                                if (this.field1462 >= var5) {
                                    return 1;
                                }
                                this.field1462 = var5 + var5 - 1 - this.field1462;
                                this.field1468 = -this.field1468;
                                if (--this.field1464 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method432(arg0, var9, var6, var10, var4.field2808[this.field1461 - 1]);
                                if (this.field1462 < var6) {
                                    return 1;
                                }
                                this.field1462 = var6 + var6 - 1 - this.field1462;
                                this.field1468 = -this.field1468;
                                if (--this.field1464 == 0) {
                                    break;
                                }
                                var9 = this.method427(arg0, var9, var5, var10, var4.field2808[this.field1469]);
                                if (this.field1462 >= var5) {
                                    return 1;
                                }
                                this.field1462 = var5 + var5 - 1 - this.field1462;
                                this.field1468 = -this.field1468;
                            } while (--this.field1464 != 0);
                        }
                    } else if (this.field1468 < 0) {
                        while (true) {
                            var9 = this.method427(arg0, var9, var5, var10, var4.field2808[this.field1461 - 1]);
                            if (this.field1462 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field1462) / var8;
                            if (var12 >= this.field1464) {
                                this.field1462 += this.field1464 * var8;
                                this.field1464 = 0;
                                break;
                            }
                            this.field1462 += var8 * var12;
                            this.field1464 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method432(arg0, var9, var6, var10, var4.field2808[this.field1469]);
                            if (this.field1462 < var6) {
                                return 1;
                            }
                            int var13 = (this.field1462 - var5) / var8;
                            if (var13 >= this.field1464) {
                                this.field1462 -= this.field1464 * var8;
                                this.field1464 = 0;
                                break;
                            }
                            this.field1462 -= var8 * var13;
                            this.field1464 -= var13;
                        }
                    }
                }
                if (this.field1468 < 0) {
                    this.method427(arg0, var9, 0, var10, 0);
                    if (this.field1462 < 0) {
                        this.field1462 = 0;
                        this.method833(4);
                    }
                } else {
                    this.method432(arg0, var9, var7, var10, 0);
                    if (this.field1462 >= var7) {
                        this.field1462 = var7 - 1;
                        this.method833(4);
                    }
                }
                return 1;
            }
        } else {
            this.method176(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 494)
    public final synchronized void method425(int arg0) {
        this.field1460 = arg0;
        this.field1463 = 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 499)
    public final int method212() {
        int var1 = this.field1460 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1464 == 0) {
            var2 -= this.field1462 * var2 / (((class119) super.field850).field2808.length << 8);
        } else if (this.field1464 >= 0) {
            var2 -= this.field1469 * var2 / ((class119) super.field850).field2808.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lte;II)Lj;", line = 511)
    public static final class57 method426(class119 arg0, int arg1, int arg2) {
        return arg0.field2808 != null && arg0.field2808.length != 0 ? new class57(arg0, (int) ((long) arg0.field2811 * 256L * (long) arg1 / (long) (class131.field3171 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)I", line = 517)
    private final int method427(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1463 > 0) {
            int var6 = this.field1463 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1463 += arg1;
            if (this.field1468 == -256 && (this.field1462 & 255) == 0) {
                arg1 = method428(((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, this.field1465, this.field1467, 0, var6, arg2, this);
            } else {
                arg1 = method433(0, 0, ((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, this.field1465, this.field1467, 0, var6, arg2, this, this.field1468, arg4);
            }
            this.field1463 -= arg1;
            if (this.field1463 != 0) {
                return arg1;
            }
            if (this.field1459 == Integer.MIN_VALUE) {
                this.method833(4);
                return arg3;
            }
            this.field1460 = this.field1459;
        }
        return this.field1468 == -256 && (this.field1462 & 255) == 0 ? method429(((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, 0, arg3, arg2, this) : method421(0, 0, ((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, 0, arg3, arg2, this, this.field1468, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([B[IIIIIIIIILj;)I", line = 561)
    private static final int method428(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
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
        arg10.field1460 = var13 >> 8;
        arg10.field1462 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([B[IIIIIIILj;)I", line = 595)
    private static final int method429(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class57 arg8) {
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
        arg8.field1462 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([B[IIIIIIIIILj;)I", line = 626)
    private static final int method430(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class57 arg10) {
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
        arg10.field1460 = var13 >> 8;
        arg10.field1462 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([B[IIIIIIILj;)I", line = 661)
    private static final int method431(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class57 arg8) {
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
        arg8.field1462 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([IIIII)I", line = 686)
    private final int method432(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1463 > 0) {
            int var6 = this.field1463 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1463 += arg1;
            if (this.field1468 == 256 && (this.field1462 & 255) == 0) {
                arg1 = method430(((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, this.field1465, this.field1467, 0, var6, arg2, this);
            } else {
                arg1 = method423(0, 0, ((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, this.field1465, this.field1467, 0, var6, arg2, this, this.field1468, arg4);
            }
            this.field1463 -= arg1;
            if (this.field1463 != 0) {
                return arg1;
            }
            if (this.field1459 == Integer.MIN_VALUE) {
                this.method833(4);
                return arg3;
            }
            this.field1460 = this.field1459;
        }
        return this.field1468 == 256 && (this.field1462 & 255) == 0 ? method431(((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, 0, arg3, arg2, this) : method424(0, 0, ((class119) super.field850).field2808, arg0, this.field1462, arg1, this.field1460, 0, arg3, arg2, this, this.field1468, arg4);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II[B[IIIIIIIIILj;II)I", line = 729)
    private static final int method433(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class57 arg12, int arg13, int arg14) {
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
        arg12.field1460 = arg6;
        arg12.field1462 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lte;II)V", line = 759)
    private class57(class119 arg0, int arg1, int arg2) {
        super.field850 = arg0;
        this.field1469 = arg0.field2809;
        this.field1461 = arg0.field2810;
        this.field1466 = arg0.field2807;
        this.field1468 = arg1;
        this.field1460 = arg2;
        this.field1462 = 0;
    }
}
