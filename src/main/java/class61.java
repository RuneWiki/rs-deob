import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 extends class87 {

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "Z")
    private boolean field1542;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIII)I", line = 5)
    private final int method582(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1536 > 0) {
            int var6 = this.field1536 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1536 += arg1;
            if (this.field1537 == -256 && (this.field1543 & 255) == 0) {
                arg1 = method587(((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, this.field1533, this.field1534, 0, var6, arg2, this);
            } else {
                arg1 = method584(0, 0, ((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, this.field1533, this.field1534, 0, var6, arg2, this, this.field1537, arg4);
            }
            this.field1536 -= arg1;
            if (this.field1536 != 0) {
                return arg1;
            }
            if (this.field1538 == Integer.MIN_VALUE) {
                this.method742(-1);
                return arg3;
            }
            this.field1540 = this.field1538;
        }
        return this.field1537 == -256 && (this.field1543 & 255) == 0 ? method589(((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, 0, arg3, arg2, this) : method586(0, 0, ((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, 0, arg3, arg2, this, this.field1537, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([III)I", line = 51)
    public final synchronized int method135(int[] arg0, int arg1, int arg2) {
        if (this.field1540 != 0 || this.field1536 != 0 && this.field1538 != 0 && this.field1538 != Integer.MIN_VALUE) {
            class135 var4 = (class135) super.field2171;
            int var5 = this.field1535 << 8;
            int var6 = this.field1541 << 8;
            int var7 = var4.field3311.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1539 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1539 < 0) {
                if (this.field1542) {
                    if (this.field1537 < 0) {
                        var9 = this.method582(arg0, arg1, var5, var10, var4.field3311[this.field1535]);
                        if (this.field1543 >= var5) {
                            return 1;
                        }
                        this.field1543 = var5 + var5 - 1 - this.field1543;
                        this.field1537 = -this.field1537;
                    }
                    while (true) {
                        int var11 = this.method595(arg0, var9, var6, var10, var4.field3311[this.field1541 - 1]);
                        if (this.field1543 < var6) {
                            return 1;
                        }
                        this.field1543 = var6 + var6 - 1 - this.field1543;
                        this.field1537 = -this.field1537;
                        var9 = this.method582(arg0, var11, var5, var10, var4.field3311[this.field1535]);
                        if (this.field1543 >= var5) {
                            return 1;
                        }
                        this.field1543 = var5 + var5 - 1 - this.field1543;
                        this.field1537 = -this.field1537;
                    }
                } else if (this.field1537 < 0) {
                    while (true) {
                        var9 = this.method582(arg0, var9, var5, var10, var4.field3311[this.field1541 - 1]);
                        if (this.field1543 >= var5) {
                            return 1;
                        }
                        this.field1543 = var6 - 1 - (var6 - 1 - this.field1543) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method595(arg0, var9, var6, var10, var4.field3311[this.field1535]);
                        if (this.field1543 < var6) {
                            return 1;
                        }
                        this.field1543 = (this.field1543 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1539 > 0) {
                    if (this.field1542) {
                        label118: {
                            if (this.field1537 < 0) {
                                var9 = this.method582(arg0, arg1, var5, var10, var4.field3311[this.field1535]);
                                if (this.field1543 >= var5) {
                                    return 1;
                                }
                                this.field1543 = var5 + var5 - 1 - this.field1543;
                                this.field1537 = -this.field1537;
                                if (--this.field1539 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method595(arg0, var9, var6, var10, var4.field3311[this.field1541 - 1]);
                                if (this.field1543 < var6) {
                                    return 1;
                                }
                                this.field1543 = var6 + var6 - 1 - this.field1543;
                                this.field1537 = -this.field1537;
                                if (--this.field1539 == 0) {
                                    break;
                                }
                                var9 = this.method582(arg0, var9, var5, var10, var4.field3311[this.field1535]);
                                if (this.field1543 >= var5) {
                                    return 1;
                                }
                                this.field1543 = var5 + var5 - 1 - this.field1543;
                                this.field1537 = -this.field1537;
                            } while (--this.field1539 != 0);
                        }
                    } else if (this.field1537 < 0) {
                        while (true) {
                            var9 = this.method582(arg0, var9, var5, var10, var4.field3311[this.field1541 - 1]);
                            if (this.field1543 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field1543) / var8;
                            if (var12 >= this.field1539) {
                                this.field1543 += this.field1539 * var8;
                                this.field1539 = 0;
                                break;
                            }
                            this.field1543 += var8 * var12;
                            this.field1539 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method595(arg0, var9, var6, var10, var4.field3311[this.field1535]);
                            if (this.field1543 < var6) {
                                return 1;
                            }
                            int var13 = (this.field1543 - var5) / var8;
                            if (var13 >= this.field1539) {
                                this.field1543 -= this.field1539 * var8;
                                this.field1539 = 0;
                                break;
                            }
                            this.field1543 -= var8 * var13;
                            this.field1539 -= var13;
                        }
                    }
                }
                if (this.field1537 < 0) {
                    this.method582(arg0, var9, 0, var10, 0);
                    if (this.field1543 < 0) {
                        this.field1543 = 0;
                        this.method742(-1);
                    }
                } else {
                    this.method595(arg0, var9, var7, var10, 0);
                    if (this.field1543 >= var7) {
                        this.field1543 = var7 - 1;
                        this.method742(-1);
                    }
                }
                return 1;
            }
        } else {
            this.method128(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[B[IIIIIIIIILka;II)I", line = 259)
    private static final int method583(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class61 arg12, int arg13, int arg14) {
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
        arg12.field1540 = arg6;
        arg12.field1543 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II[B[IIIIIIIIILka;II)I", line = 288)
    private static final int method584(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class61 arg12, int arg13, int arg14) {
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
        arg12.field1540 = arg6;
        arg12.field1543 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V", line = 319)
    public final synchronized void method585(int arg0) {
        this.field1540 = arg0;
        this.field1536 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[B[IIIIIIILka;II)I", line = 324)
    private static final int method586(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10, int arg11, int arg12) {
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
        arg10.field1543 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([B[IIIIIIIIILka;)I", line = 350)
    private static final int method587(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10) {
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
        arg10.field1540 = var13 >> 8;
        arg10.field1543 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 386)
    public final synchronized void method588(int arg0) {
        this.field1539 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([B[IIIIIIILka;)I", line = 392)
    private static final int method589(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class61 arg8) {
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
        arg8.field1543 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([B[IIIIIIIIILka;)I", line = 417)
    private static final int method590(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10) {
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
        arg10.field1540 = var13 >> 8;
        arg10.field1543 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()I", line = 450)
    public final int method591() {
        int var1 = this.field1540 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1539 == 0) {
            var2 -= this.field1543 * var2 / (((class135) super.field2171).field3311.length << 8);
        } else if (this.field1539 >= 0) {
            var2 -= this.field1535 * var2 / ((class135) super.field2171).field3311.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z", line = 462)
    public final boolean method592() {
        return this.method739(false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwd;II)Lka;", line = 465)
    public static final class61 method593(class135 arg0, int arg1, int arg2) {
        return arg0.field3311 != null && arg0.field3311.length != 0 ? new class61(arg0, (int) ((long) arg0.field3314 * 256L * (long) arg1 / (long) (class5.field193 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II[B[IIIIIIILka;II)I", line = 476)
    private static final int method594(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class61 arg10, int arg11, int arg12) {
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
        arg10.field1543 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 503)
    public final synchronized void method128(int arg0) {
        if (this.field1536 > 0) {
            if (arg0 >= this.field1536) {
                if (this.field1538 == Integer.MIN_VALUE) {
                    this.method742(-1);
                    arg0 = this.field1536;
                } else {
                    this.field1540 = this.field1538;
                }
                this.field1536 = 0;
            } else {
                this.field1540 += this.field1534 * arg0;
                this.field1536 -= arg0;
            }
        }
        this.field1543 += this.field1537 * arg0;
        class135 var2 = (class135) super.field2171;
        int var3 = this.field1535 << 8;
        int var4 = this.field1541 << 8;
        int var5 = var2.field3311.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1539 = 0;
        }
        if (this.field1539 < 0) {
            if (!this.field1542) {
                if (this.field1537 < 0) {
                    if (this.field1543 < var3) {
                        this.field1543 = var4 - 1 - (var4 - 1 - this.field1543) % var6;
                    }
                } else if (this.field1543 >= var4) {
                    this.field1543 = (this.field1543 - var3) % var6 + var3;
                }
            } else {
                if (this.field1537 < 0) {
                    if (this.field1543 >= var3) {
                        return;
                    }
                    this.field1543 = var3 + var3 - 1 - this.field1543;
                    this.field1537 = -this.field1537;
                }
                while (this.field1543 >= var4) {
                    this.field1543 = var4 + var4 - 1 - this.field1543;
                    this.field1537 = -this.field1537;
                    if (this.field1543 >= var3) {
                        return;
                    }
                    this.field1543 = var3 + var3 - 1 - this.field1543;
                    this.field1537 = -this.field1537;
                }
            }
        } else {
            if (this.field1539 > 0) {
                if (this.field1542) {
                    label113: {
                        if (this.field1537 < 0) {
                            if (this.field1543 >= var3) {
                                return;
                            }
                            this.field1543 = var3 + var3 - 1 - this.field1543;
                            this.field1537 = -this.field1537;
                            if (--this.field1539 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field1543 < var4) {
                                return;
                            }
                            this.field1543 = var4 + var4 - 1 - this.field1543;
                            this.field1537 = -this.field1537;
                            if (--this.field1539 == 0) {
                                break;
                            }
                            if (this.field1543 >= var3) {
                                return;
                            }
                            this.field1543 = var3 + var3 - 1 - this.field1543;
                            this.field1537 = -this.field1537;
                        } while (--this.field1539 != 0);
                    }
                } else if (this.field1537 < 0) {
                    if (this.field1543 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1543) / var6;
                    if (var7 < this.field1539) {
                        this.field1543 += var6 * var7;
                        this.field1539 -= var7;
                        return;
                    }
                    this.field1543 += this.field1539 * var6;
                    this.field1539 = 0;
                } else {
                    if (this.field1543 < var4) {
                        return;
                    }
                    int var8 = (this.field1543 - var3) / var6;
                    if (var8 < this.field1539) {
                        this.field1543 -= var6 * var8;
                        this.field1539 -= var8;
                        return;
                    }
                    this.field1543 -= this.field1539 * var6;
                    this.field1539 = 0;
                }
            }
            if (this.field1537 < 0) {
                if (this.field1543 < 0) {
                    this.field1543 = 0;
                    this.method742(-1);
                    return;
                }
            } else if (this.field1543 >= var5) {
                this.field1543 = var5 - 1;
                this.method742(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([IIIII)I", line = 691)
    private final int method595(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1536 > 0) {
            int var6 = this.field1536 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1536 += arg1;
            if (this.field1537 == 256 && (this.field1543 & 255) == 0) {
                arg1 = method590(((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, this.field1533, this.field1534, 0, var6, arg2, this);
            } else {
                arg1 = method583(0, 0, ((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, this.field1533, this.field1534, 0, var6, arg2, this, this.field1537, arg4);
            }
            this.field1536 -= arg1;
            if (this.field1536 != 0) {
                return arg1;
            }
            if (this.field1538 == Integer.MIN_VALUE) {
                this.method742(-1);
                return arg3;
            }
            this.field1540 = this.field1538;
        }
        return this.field1537 == 256 && (this.field1543 & 255) == 0 ? method596(((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, 0, arg3, arg2, this) : method594(0, 0, ((class135) super.field2171).field3311, arg0, this.field1543, arg1, this.field1540, 0, arg3, arg2, this, this.field1537, arg4);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([B[IIIIIIILka;)I", line = 734)
    private static final int method596(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class61 arg8) {
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
        arg8.field1543 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lwd;II)V", line = 758)
    private class61(class135 arg0, int arg1, int arg2) {
        super.field2171 = arg0;
        this.field1535 = arg0.field3312;
        this.field1541 = arg0.field3313;
        this.field1537 = arg1;
        this.field1540 = arg2;
        this.field1543 = 0;
    }
}
