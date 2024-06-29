import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 extends class13 {

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Z")
    private boolean field1535;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[B[IIIIIIILlb;II)I", line = 4)
    private static final int method566(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1539 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()I", line = 32)
    public final int method153() {
        int var1 = this.field1536 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1541 == 0) {
            var2 -= this.field1539 * var2 / (((class20) super.field255).field504.length << 8);
        } else if (this.field1541 >= 0) {
            var2 -= this.field1538 * var2 / ((class20) super.field255).field504.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II[B[IIIIIIILlb;II)I", line = 45)
    private static final int method567(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1539 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[B[IIIIIIIIILlb;II)I", line = 71)
    private static final int method568(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12, int arg13, int arg14) {
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
        arg12.field1536 = arg6;
        arg12.field1539 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIII)I", line = 100)
    private final int method569(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1544 > 0) {
            int var6 = this.field1544 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1544 += arg1;
            if (this.field1545 == -256 && (this.field1539 & 255) == 0) {
                arg1 = method578(((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, this.field1543, this.field1540, 0, var6, arg2, this);
            } else {
                arg1 = method568(0, 0, ((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, this.field1543, this.field1540, 0, var6, arg2, this, this.field1545, arg4);
            }
            this.field1544 -= arg1;
            if (this.field1544 != 0) {
                return arg1;
            }
            if (this.field1542 == Integer.MIN_VALUE) {
                this.method551(-108);
                return arg3;
            }
            this.field1536 = this.field1542;
        }
        return this.field1545 == -256 && (this.field1539 & 255) == 0 ? method577(((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, 0, arg3, arg2, this) : method566(0, 0, ((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, 0, arg3, arg2, this, this.field1545, arg4);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 145)
    public final synchronized void method570(int arg0) {
        this.field1541 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B[IIIIIIILlb;)I", line = 149)
    private static final int method571(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1539 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 174)
    public final synchronized void method155(int arg0) {
        if (this.field1544 > 0) {
            if (arg0 >= this.field1544) {
                if (this.field1542 == Integer.MIN_VALUE) {
                    this.method551(65);
                    arg0 = this.field1544;
                } else {
                    this.field1536 = this.field1542;
                }
                this.field1544 = 0;
            } else {
                this.field1536 += this.field1540 * arg0;
                this.field1544 -= arg0;
            }
        }
        this.field1539 += this.field1545 * arg0;
        class20 var2 = (class20) super.field255;
        int var3 = this.field1538 << 8;
        int var4 = this.field1537 << 8;
        int var5 = var2.field504.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1541 = 0;
        }
        if (this.field1541 < 0) {
            if (!this.field1535) {
                if (this.field1545 < 0) {
                    if (this.field1539 < var3) {
                        this.field1539 = var4 - 1 - (var4 - 1 - this.field1539) % var6;
                    }
                } else if (this.field1539 >= var4) {
                    this.field1539 = (this.field1539 - var3) % var6 + var3;
                }
            } else {
                if (this.field1545 < 0) {
                    if (this.field1539 >= var3) {
                        return;
                    }
                    this.field1539 = var3 + var3 - 1 - this.field1539;
                    this.field1545 = -this.field1545;
                }
                while (this.field1539 >= var4) {
                    this.field1539 = var4 + var4 - 1 - this.field1539;
                    this.field1545 = -this.field1545;
                    if (this.field1539 >= var3) {
                        return;
                    }
                    this.field1539 = var3 + var3 - 1 - this.field1539;
                    this.field1545 = -this.field1545;
                }
            }
        } else {
            if (this.field1541 > 0) {
                if (this.field1535) {
                    label113: {
                        if (this.field1545 < 0) {
                            if (this.field1539 >= var3) {
                                return;
                            }
                            this.field1539 = var3 + var3 - 1 - this.field1539;
                            this.field1545 = -this.field1545;
                            if (--this.field1541 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field1539 < var4) {
                                return;
                            }
                            this.field1539 = var4 + var4 - 1 - this.field1539;
                            this.field1545 = -this.field1545;
                            if (--this.field1541 == 0) {
                                break;
                            }
                            if (this.field1539 >= var3) {
                                return;
                            }
                            this.field1539 = var3 + var3 - 1 - this.field1539;
                            this.field1545 = -this.field1545;
                        } while (--this.field1541 != 0);
                    }
                } else if (this.field1545 < 0) {
                    if (this.field1539 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1539) / var6;
                    if (var7 < this.field1541) {
                        this.field1539 += var6 * var7;
                        this.field1541 -= var7;
                        return;
                    }
                    this.field1539 += this.field1541 * var6;
                    this.field1541 = 0;
                } else {
                    if (this.field1539 < var4) {
                        return;
                    }
                    int var8 = (this.field1539 - var3) / var6;
                    if (var8 < this.field1541) {
                        this.field1539 -= var6 * var8;
                        this.field1541 -= var8;
                        return;
                    }
                    this.field1539 -= this.field1541 * var6;
                    this.field1541 = 0;
                }
            }
            if (this.field1545 < 0) {
                if (this.field1539 < 0) {
                    this.field1539 = 0;
                    this.method551(48);
                    return;
                }
            } else if (this.field1539 >= var5) {
                this.field1539 = var5 - 1;
                this.method551(62);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([IIIII)I", line = 361)
    private final int method572(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1544 > 0) {
            int var6 = this.field1544 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1544 += arg1;
            if (this.field1545 == 256 && (this.field1539 & 255) == 0) {
                arg1 = method575(((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, this.field1543, this.field1540, 0, var6, arg2, this);
            } else {
                arg1 = method574(0, 0, ((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, this.field1543, this.field1540, 0, var6, arg2, this, this.field1545, arg4);
            }
            this.field1544 -= arg1;
            if (this.field1544 != 0) {
                return arg1;
            }
            if (this.field1542 == Integer.MIN_VALUE) {
                this.method551(63);
                return arg3;
            }
            this.field1536 = this.field1542;
        }
        return this.field1545 == 256 && (this.field1539 & 255) == 0 ? method571(((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, 0, arg3, arg2, this) : method567(0, 0, ((class20) super.field255).field504, arg0, this.field1539, arg1, this.field1536, 0, arg3, arg2, this, this.field1545, arg4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([III)I", line = 404)
    public final synchronized int method154(int[] arg0, int arg1, int arg2) {
        if (this.field1536 != 0 || this.field1544 != 0 && this.field1542 != 0 && this.field1542 != Integer.MIN_VALUE) {
            class20 var4 = (class20) super.field255;
            int var5 = this.field1538 << 8;
            int var6 = this.field1537 << 8;
            int var7 = var4.field504.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1541 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1541 < 0) {
                if (this.field1535) {
                    if (this.field1545 < 0) {
                        var9 = this.method569(arg0, arg1, var5, var10, var4.field504[this.field1538]);
                        if (this.field1539 >= var5) {
                            return 1;
                        }
                        this.field1539 = var5 + var5 - 1 - this.field1539;
                        this.field1545 = -this.field1545;
                    }
                    while (true) {
                        int var11 = this.method572(arg0, var9, var6, var10, var4.field504[this.field1537 - 1]);
                        if (this.field1539 < var6) {
                            return 1;
                        }
                        this.field1539 = var6 + var6 - 1 - this.field1539;
                        this.field1545 = -this.field1545;
                        var9 = this.method569(arg0, var11, var5, var10, var4.field504[this.field1538]);
                        if (this.field1539 >= var5) {
                            return 1;
                        }
                        this.field1539 = var5 + var5 - 1 - this.field1539;
                        this.field1545 = -this.field1545;
                    }
                } else if (this.field1545 < 0) {
                    while (true) {
                        var9 = this.method569(arg0, var9, var5, var10, var4.field504[this.field1537 - 1]);
                        if (this.field1539 >= var5) {
                            return 1;
                        }
                        this.field1539 = var6 - 1 - (var6 - 1 - this.field1539) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method572(arg0, var9, var6, var10, var4.field504[this.field1538]);
                        if (this.field1539 < var6) {
                            return 1;
                        }
                        this.field1539 = (this.field1539 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1541 > 0) {
                    if (this.field1535) {
                        label118: {
                            if (this.field1545 < 0) {
                                var9 = this.method569(arg0, arg1, var5, var10, var4.field504[this.field1538]);
                                if (this.field1539 >= var5) {
                                    return 1;
                                }
                                this.field1539 = var5 + var5 - 1 - this.field1539;
                                this.field1545 = -this.field1545;
                                if (--this.field1541 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method572(arg0, var9, var6, var10, var4.field504[this.field1537 - 1]);
                                if (this.field1539 < var6) {
                                    return 1;
                                }
                                this.field1539 = var6 + var6 - 1 - this.field1539;
                                this.field1545 = -this.field1545;
                                if (--this.field1541 == 0) {
                                    break;
                                }
                                var9 = this.method569(arg0, var9, var5, var10, var4.field504[this.field1538]);
                                if (this.field1539 >= var5) {
                                    return 1;
                                }
                                this.field1539 = var5 + var5 - 1 - this.field1539;
                                this.field1545 = -this.field1545;
                            } while (--this.field1541 != 0);
                        }
                    } else if (this.field1545 < 0) {
                        while (true) {
                            var9 = this.method569(arg0, var9, var5, var10, var4.field504[this.field1537 - 1]);
                            if (this.field1539 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field1539) / var8;
                            if (var12 >= this.field1541) {
                                this.field1539 += this.field1541 * var8;
                                this.field1541 = 0;
                                break;
                            }
                            this.field1539 += var8 * var12;
                            this.field1541 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method572(arg0, var9, var6, var10, var4.field504[this.field1538]);
                            if (this.field1539 < var6) {
                                return 1;
                            }
                            int var13 = (this.field1539 - var5) / var8;
                            if (var13 >= this.field1541) {
                                this.field1539 -= this.field1541 * var8;
                                this.field1541 = 0;
                                break;
                            }
                            this.field1539 -= var8 * var13;
                            this.field1541 -= var13;
                        }
                    }
                }
                if (this.field1545 < 0) {
                    this.method569(arg0, var9, 0, var10, 0);
                    if (this.field1539 < 0) {
                        this.field1539 = 0;
                        this.method551(51);
                    }
                } else {
                    this.method572(arg0, var9, var7, var10, 0);
                    if (this.field1539 >= var7) {
                        this.field1539 = var7 - 1;
                        this.method551(85);
                    }
                }
                return 1;
            }
        } else {
            this.method155(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lda;II)Llb;", line = 612)
    public static final class68 method573(class20 arg0, int arg1, int arg2) {
        return arg0.field504 != null && arg0.field504.length != 0 ? new class68(arg0, (int) ((long) arg0.field506 * 256L * (long) arg1 / (long) (class76.field1698 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II[B[IIIIIIIIILlb;II)I", line = 620)
    private static final int method574(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12, int arg13, int arg14) {
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
        arg12.field1536 = arg6;
        arg12.field1539 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B[IIIIIIIIILlb;)I", line = 651)
    private static final int method575(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1536 = var13 >> 8;
        arg10.field1539 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()Z", line = 687)
    public final boolean method576() {
        return this.method554((byte) -115);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([B[IIIIIIILlb;)I", line = 695)
    private static final int method577(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1539 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([B[IIIIIIIIILlb;)I", line = 723)
    private static final int method578(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1536 = var13 >> 8;
        arg10.field1539 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lda;II)V", line = 755)
    private class68(class20 arg0, int arg1, int arg2) {
        super.field255 = arg0;
        this.field1538 = arg0.field505;
        this.field1537 = arg0.field502;
        this.field1535 = arg0.field503;
        this.field1545 = arg1;
        this.field1536 = arg2;
        this.field1539 = 0;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V", line = 765)
    public final synchronized void method579(int arg0) {
        this.field1536 = arg0;
        this.field1544 = 0;
    }
}
