import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class117 {

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Z")
    private boolean field139;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II[B[IIIIIIIILds;II)I")
    private static final int method47(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class12 arg11, int arg12, int arg13) {
        arg11.field132 -= arg11.field137 * arg5;
        arg11.field142 -= arg11.field133 * arg5;
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
        arg11.field132 += arg11.field137 * arg5;
        arg11.field142 += arg11.field133 * arg5;
        arg11.field141 = arg6;
        arg11.field144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "()Lme;")
    public final class117 method48() {
        return null;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public final synchronized void method49(int arg0) {
        this.method58(arg0 << 6, this.method87());
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II[B[IIIIIIIILds;II)I")
    private static final int method50(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class12 arg11, int arg12, int arg13) {
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
        arg11.field144 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II[B[IIIIIIILds;II)I")
    private static final int method51(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class12 arg10, int arg11, int arg12) {
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
        arg10.field144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "([III)V")
    public final synchronized void method52(int[] arg0, int arg1, int arg2) {
        if (this.field130 == 0 && this.field136 == 0) {
            this.method67(arg2);
        } else {
            class352 var4 = (class352) super.field1486;
            int var5 = this.field134 << 8;
            int var6 = this.field131 << 8;
            int var7 = var4.field5088.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field140 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field144 < 0) {
                if (this.field138 <= 0) {
                    this.method80();
                    this.method1510((byte) -13);
                    return;
                }
                this.field144 = 0;
            }
            if (this.field144 >= var7) {
                if (this.field138 >= 0) {
                    this.method80();
                    this.method1510((byte) -13);
                    return;
                }
                this.field144 = var7 - 1;
            }
            if (this.field140 < 0) {
                if (this.field139) {
                    if (this.field138 < 0) {
                        var9 = this.method59(arg0, arg1, var5, var10, var4.field5088[this.field134]);
                        if (this.field144 >= var5) {
                            return;
                        }
                        this.field144 = var5 + var5 - 1 - this.field144;
                        this.field138 = -this.field138;
                    }
                    while (true) {
                        int var11 = this.method86(arg0, var9, var6, var10, var4.field5088[this.field131 - 1]);
                        if (this.field144 < var6) {
                            return;
                        }
                        this.field144 = var6 + var6 - 1 - this.field144;
                        this.field138 = -this.field138;
                        var9 = this.method59(arg0, var11, var5, var10, var4.field5088[this.field134]);
                        if (this.field144 >= var5) {
                            return;
                        }
                        this.field144 = var5 + var5 - 1 - this.field144;
                        this.field138 = -this.field138;
                    }
                } else if (this.field138 < 0) {
                    while (true) {
                        var9 = this.method59(arg0, var9, var5, var10, var4.field5088[this.field131 - 1]);
                        if (this.field144 >= var5) {
                            return;
                        }
                        this.field144 = var6 - 1 - (var6 - 1 - this.field144) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method86(arg0, var9, var6, var10, var4.field5088[this.field134]);
                        if (this.field144 < var6) {
                            return;
                        }
                        this.field144 = (this.field144 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field140 > 0) {
                    if (this.field139) {
                        label130: {
                            if (this.field138 < 0) {
                                var9 = this.method59(arg0, arg1, var5, var10, var4.field5088[this.field134]);
                                if (this.field144 >= var5) {
                                    return;
                                }
                                this.field144 = var5 + var5 - 1 - this.field144;
                                this.field138 = -this.field138;
                                if (--this.field140 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method86(arg0, var9, var6, var10, var4.field5088[this.field131 - 1]);
                                if (this.field144 < var6) {
                                    return;
                                }
                                this.field144 = var6 + var6 - 1 - this.field144;
                                this.field138 = -this.field138;
                                if (--this.field140 == 0) {
                                    break;
                                }
                                var9 = this.method59(arg0, var9, var5, var10, var4.field5088[this.field134]);
                                if (this.field144 >= var5) {
                                    return;
                                }
                                this.field144 = var5 + var5 - 1 - this.field144;
                                this.field138 = -this.field138;
                            } while (--this.field140 != 0);
                        }
                    } else if (this.field138 < 0) {
                        while (true) {
                            var9 = this.method59(arg0, var9, var5, var10, var4.field5088[this.field131 - 1]);
                            if (this.field144 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field144) / var8;
                            if (var12 >= this.field140) {
                                this.field144 += this.field140 * var8;
                                this.field140 = 0;
                                break;
                            }
                            this.field144 += var8 * var12;
                            this.field140 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method86(arg0, var9, var6, var10, var4.field5088[this.field134]);
                            if (this.field144 < var6) {
                                return;
                            }
                            int var13 = (this.field144 - var5) / var8;
                            if (var13 >= this.field140) {
                                this.field144 -= this.field140 * var8;
                                this.field140 = 0;
                                break;
                            }
                            this.field144 -= var8 * var13;
                            this.field140 -= var13;
                        }
                    }
                }
                if (this.field138 < 0) {
                    this.method59(arg0, var9, 0, var10, 0);
                    if (this.field144 < 0) {
                        this.field144 = -1;
                        this.method80();
                        this.method1510((byte) -13);
                        return;
                    }
                } else {
                    this.method86(arg0, var9, var7, var10, 0);
                    if (this.field144 >= var7) {
                        this.field144 = var7;
                        this.method80();
                        this.method1510((byte) -13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "()I")
    public final int method53() {
        int var1 = this.field141 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field140 == 0) {
            var2 -= this.field144 * var2 / (((class352) super.field1486).field5088.length << 8);
        } else if (this.field140 >= 0) {
            var2 -= this.field134 * var2 / ((class352) super.field1486).field5088.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lnd;II)Lds;")
    public static final class12 method54(class352 arg0, int arg1, int arg2) {
        return arg0.field5088 != null && arg0.field5088.length != 0 ? new class12(arg0, (int) ((long) arg0.field5085 * 256L * (long) arg1 / (long) (class31.field409 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "()I")
    public final synchronized int method55() {
        return this.field138 < 0 ? -this.field138 : this.field138;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
    public final synchronized void method56(int arg0) {
        if (this.field138 < 0) {
            this.field138 = -arg0;
        } else {
            this.field138 = arg0;
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public final synchronized void method57(int arg0) {
        this.field140 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
    private final synchronized void method58(int arg0, int arg1) {
        this.field130 = arg0;
        this.field143 = arg1;
        this.field136 = 0;
        this.method91();
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([IIIII)I")
    private final int method59(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field136 <= 0) {
                if (this.field138 == -256 && (this.field144 & 255) == 0) {
                    if (class410.field5752) {
                        return method82(0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, 0, arg3, arg2, this);
                    }
                    return method65(((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, 0, arg3, arg2, this);
                }
                if (class410.field5752) {
                    return method66(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, 0, arg3, arg2, this, this.field138, arg4);
                }
                return method51(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, 0, arg3, arg2, this, this.field138, arg4);
            }
            int var6 = this.field136 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field136 += arg1;
            if (this.field138 == -256 && (this.field144 & 255) == 0) {
                if (class410.field5752) {
                    arg1 = method89(0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, this.field137, this.field133, 0, var6, arg2, this);
                } else {
                    arg1 = method60(((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, this.field135, 0, var6, arg2, this);
                }
            } else if (class410.field5752) {
                arg1 = method84(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, this.field137, this.field133, 0, var6, arg2, this, this.field138, arg4);
            } else {
                arg1 = method63(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, this.field135, 0, var6, arg2, this, this.field138, arg4);
            }
            this.field136 -= arg1;
            if (this.field136 != 0) {
                return arg1;
            }
        } while (!this.method78());
        return arg3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([B[IIIIIIIILds;)I")
    private static final int method60(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class12 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field132 += (var14 - arg3) * arg9.field137;
        arg9.field142 += (var14 - arg3) * arg9.field133;
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
        arg9.field141 = var12 >> 2;
        arg9.field144 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([B[IIIIIIILds;)I")
    private static final int method61(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class12 arg8) {
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
        arg8.field144 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)V")
    public final synchronized void method62(int arg0) {
        if (arg0 == 0) {
            this.method81(0);
            this.method1510((byte) -13);
        } else if (this.field132 == 0 && this.field142 == 0) {
            this.field136 = 0;
            this.field130 = 0;
            this.field141 = 0;
            this.method1510((byte) -13);
        } else {
            int var2 = -this.field141;
            if (this.field141 > var2) {
                var2 = this.field141;
            }
            if (-this.field132 > var2) {
                var2 = -this.field132;
            }
            if (this.field132 > var2) {
                var2 = this.field132;
            }
            if (-this.field142 > var2) {
                var2 = -this.field142;
            }
            if (this.field142 > var2) {
                var2 = this.field142;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field136 = arg0;
            this.field130 = Integer.MIN_VALUE;
            this.field135 = -this.field141 / arg0;
            this.field137 = -this.field132 / arg0;
            this.field133 = -this.field142 / arg0;
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(II[B[IIIIIIIILds;II)I")
    private static final int method63(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class12 arg11, int arg12, int arg13) {
        arg11.field132 -= arg11.field137 * arg5;
        arg11.field142 -= arg11.field133 * arg5;
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
        arg11.field132 += arg11.field137 * arg5;
        arg11.field142 += arg11.field133 * arg5;
        arg11.field141 = arg6;
        arg11.field144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
    public final synchronized void method64(boolean arg0) {
        this.field138 = (this.field138 >>> 31) + (this.field138 ^ this.field138 >> 31);
        if (arg0) {
            this.field138 = -this.field138;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "([B[IIIIIIILds;)I")
    private static final int method65(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class12 arg8) {
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
        arg8.field144 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(II[B[IIIIIIIILds;II)I")
    private static final int method66(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class12 arg11, int arg12, int arg13) {
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
        arg11.field144 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public final synchronized void method67(int arg0) {
        if (this.field136 > 0) {
            if (arg0 >= this.field136) {
                if (this.field130 == Integer.MIN_VALUE) {
                    this.field130 = 0;
                    this.field141 = this.field132 = this.field142 = 0;
                    this.method1510((byte) -13);
                    arg0 = this.field136;
                }
                this.field136 = 0;
                this.method91();
            } else {
                this.field141 += this.field135 * arg0;
                this.field132 += this.field137 * arg0;
                this.field142 += this.field133 * arg0;
                this.field136 -= arg0;
            }
        }
        class352 var2 = (class352) super.field1486;
        int var3 = this.field134 << 8;
        int var4 = this.field131 << 8;
        int var5 = var2.field5088.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field140 = 0;
        }
        if (this.field144 < 0) {
            if (this.field138 <= 0) {
                this.method80();
                this.method1510((byte) -13);
                return;
            }
            this.field144 = 0;
        }
        if (this.field144 >= var5) {
            if (this.field138 >= 0) {
                this.method80();
                this.method1510((byte) -13);
                return;
            }
            this.field144 = var5 - 1;
        }
        this.field144 += this.field138 * arg0;
        if (this.field140 < 0) {
            if (!this.field139) {
                if (this.field138 < 0) {
                    if (this.field144 < var3) {
                        this.field144 = var4 - 1 - (var4 - 1 - this.field144) % var6;
                    }
                } else if (this.field144 >= var4) {
                    this.field144 = (this.field144 - var3) % var6 + var3;
                }
            } else {
                if (this.field138 < 0) {
                    if (this.field144 >= var3) {
                        return;
                    }
                    this.field144 = var3 + var3 - 1 - this.field144;
                    this.field138 = -this.field138;
                }
                while (this.field144 >= var4) {
                    this.field144 = var4 + var4 - 1 - this.field144;
                    this.field138 = -this.field138;
                    if (this.field144 >= var3) {
                        return;
                    }
                    this.field144 = var3 + var3 - 1 - this.field144;
                    this.field138 = -this.field138;
                }
            }
        } else {
            if (this.field140 > 0) {
                if (this.field139) {
                    label125: {
                        if (this.field138 < 0) {
                            if (this.field144 >= var3) {
                                return;
                            }
                            this.field144 = var3 + var3 - 1 - this.field144;
                            this.field138 = -this.field138;
                            if (--this.field140 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field144 < var4) {
                                return;
                            }
                            this.field144 = var4 + var4 - 1 - this.field144;
                            this.field138 = -this.field138;
                            if (--this.field140 == 0) {
                                break;
                            }
                            if (this.field144 >= var3) {
                                return;
                            }
                            this.field144 = var3 + var3 - 1 - this.field144;
                            this.field138 = -this.field138;
                        } while (--this.field140 != 0);
                    }
                } else if (this.field138 < 0) {
                    if (this.field144 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field144) / var6;
                    if (var7 < this.field140) {
                        this.field144 += var6 * var7;
                        this.field140 -= var7;
                        return;
                    }
                    this.field144 += this.field140 * var6;
                    this.field140 = 0;
                } else {
                    if (this.field144 < var4) {
                        return;
                    }
                    int var8 = (this.field144 - var3) / var6;
                    if (var8 < this.field140) {
                        this.field144 -= var6 * var8;
                        this.field140 -= var8;
                        return;
                    }
                    this.field144 -= this.field140 * var6;
                    this.field140 = 0;
                }
            }
            if (this.field138 < 0) {
                if (this.field144 < 0) {
                    this.field144 = -1;
                    this.method80();
                    this.method1510((byte) -13);
                    return;
                }
            } else if (this.field144 >= var5) {
                this.field144 = var5;
                this.method80();
                this.method1510((byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lnd;III)Lds;")
    public static final class12 method68(class352 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5088 != null && arg0.field5088.length != 0 ? new class12(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II[B[IIIIIIIIIILds;II)I")
    private static final int method69(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class12 arg13, int arg14, int arg15) {
        arg13.field141 -= arg13.field135 * arg5;
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
        arg13.field141 += arg13.field135 * var22;
        arg13.field132 = arg6;
        arg13.field142 = arg7;
        arg13.field144 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)V")
    public final synchronized void method70(int arg0) {
        int var2 = ((class352) super.field1486).field5088.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field144 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)I")
    private static final int method71(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "()Lme;")
    public final class117 method72() {
        return null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()I")
    public final int method73() {
        return this.field130 == 0 && this.field136 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II[B[IIIIIIILds;II)I")
    private static final int method74(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class12 arg10, int arg11, int arg12) {
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
        arg10.field144 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "()I")
    public final synchronized int method75() {
        return this.field130 == Integer.MIN_VALUE ? 0 : this.field130;
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "()Z")
    public final boolean method76() {
        return this.field136 != 0;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "([B[IIIIIIIILds;)I")
    private static final int method77(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class12 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field132 += (var14 - arg3) * arg9.field137;
        arg9.field142 += (var14 - arg3) * arg9.field133;
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
        arg9.field141 = var12 >> 2;
        arg9.field144 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "()Z")
    private final boolean method78() {
        int var1 = this.field130;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method83(var1, this.field143);
            var2 = method71(var1, this.field143);
        }
        if (this.field141 == var1 && this.field132 == var3 && this.field142 == var2) {
            if (this.field130 == Integer.MIN_VALUE) {
                this.field130 = 0;
                this.field141 = this.field132 = this.field142 = 0;
                this.method1510((byte) -13);
                return true;
            } else {
                this.method91();
                return false;
            }
        } else {
            if (this.field141 < var1) {
                this.field135 = 1;
                this.field136 = var1 - this.field141;
            } else if (this.field141 > var1) {
                this.field135 = -1;
                this.field136 = this.field141 - var1;
            } else {
                this.field135 = 0;
            }
            if (this.field132 < var3) {
                this.field137 = 1;
                if (this.field136 == 0 || this.field136 > var3 - this.field132) {
                    this.field136 = var3 - this.field132;
                }
            } else if (this.field132 > var3) {
                this.field137 = -1;
                if (this.field136 == 0 || this.field136 > this.field132 - var3) {
                    this.field136 = this.field132 - var3;
                }
            } else {
                this.field137 = 0;
            }
            if (this.field142 < var2) {
                this.field133 = 1;
                if (this.field136 == 0 || this.field136 > var2 - this.field142) {
                    this.field136 = var2 - this.field142;
                }
            } else if (this.field142 > var2) {
                this.field133 = -1;
                if (this.field136 == 0 || this.field136 > this.field142 - var2) {
                    this.field136 = this.field142 - var2;
                }
            } else {
                this.field133 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)V")
    public final synchronized void method79(int arg0, int arg1) {
        this.method88(arg0, arg1, this.method87());
    }

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "()V")
    private final void method80() {
        if (this.field136 != 0) {
            if (this.field130 == Integer.MIN_VALUE) {
                this.field130 = 0;
            }
            this.field136 = 0;
            this.method91();
        }
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(I)V")
    private final synchronized void method81(int arg0) {
        this.method58(arg0, this.method87());
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[B[IIIIIIIILds;)I")
    private static final int method82(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class12 arg10) {
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
        arg10.field144 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(II)I")
    private static final int method83(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II[B[IIIIIIIIIILds;II)I")
    private static final int method84(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class12 arg13, int arg14, int arg15) {
        arg13.field141 -= arg13.field135 * arg5;
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
        arg13.field141 += arg13.field135 * var22;
        arg13.field132 = arg6;
        arg13.field142 = arg7;
        arg13.field144 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[B[IIIIIIIIIILds;)I")
    private static final int method85(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class12 arg12) {
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
        arg12.field141 += (var19 - arg4) * arg12.field135;
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
        arg12.field132 = var15 >> 2;
        arg12.field142 = var16 >> 2;
        arg12.field144 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "([IIIII)I")
    private final int method86(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field136 <= 0) {
                if (this.field138 == 256 && (this.field144 & 255) == 0) {
                    if (class410.field5752) {
                        return method90(0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, 0, arg3, arg2, this);
                    }
                    return method61(((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, 0, arg3, arg2, this);
                }
                if (class410.field5752) {
                    return method50(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, 0, arg3, arg2, this, this.field138, arg4);
                }
                return method74(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, 0, arg3, arg2, this, this.field138, arg4);
            }
            int var6 = this.field136 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field136 += arg1;
            if (this.field138 == 256 && (this.field144 & 255) == 0) {
                if (class410.field5752) {
                    arg1 = method85(0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, this.field137, this.field133, 0, var6, arg2, this);
                } else {
                    arg1 = method77(((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, this.field135, 0, var6, arg2, this);
                }
            } else if (class410.field5752) {
                arg1 = method69(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field132, this.field142, this.field137, this.field133, 0, var6, arg2, this, this.field138, arg4);
            } else {
                arg1 = method47(0, 0, ((class352) super.field1486).field5088, arg0, this.field144, arg1, this.field141, this.field135, 0, var6, arg2, this, this.field138, arg4);
            }
            this.field136 -= arg1;
            if (this.field136 != 0) {
                return arg1;
            }
        } while (!this.method78());
        return arg3;
    }

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "()I")
    public final synchronized int method87() {
        return this.field143 < 0 ? -1 : this.field143;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
    public final synchronized void method88(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method58(arg1, arg2);
        } else {
            int var4 = method83(arg1, arg2);
            int var5 = method71(arg1, arg2);
            if (this.field132 == var4 && this.field142 == var5) {
                this.field136 = 0;
            } else {
                int var6 = arg1 - this.field141;
                if (this.field141 - arg1 > var6) {
                    var6 = this.field141 - arg1;
                }
                if (var4 - this.field132 > var6) {
                    var6 = var4 - this.field132;
                }
                if (this.field132 - var4 > var6) {
                    var6 = this.field132 - var4;
                }
                if (var5 - this.field142 > var6) {
                    var6 = var5 - this.field142;
                }
                if (this.field142 - var5 > var6) {
                    var6 = this.field142 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field136 = arg0;
                this.field130 = arg1;
                this.field143 = arg2;
                this.field135 = (arg1 - this.field141) / arg0;
                this.field137 = (var4 - this.field132) / arg0;
                this.field133 = (var5 - this.field142) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I[B[IIIIIIIIIILds;)I")
    private static final int method89(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class12 arg12) {
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
        arg12.field141 += (var19 - arg4) * arg12.field135;
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
        arg12.field132 = var15 >> 2;
        arg12.field142 = var16 >> 2;
        arg12.field144 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I[B[IIIIIIIILds;)I")
    private static final int method90(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class12 arg10) {
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
        arg10.field144 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "()V")
    private final void method91() {
        this.field141 = this.field130;
        this.field132 = method83(this.field130, this.field143);
        this.field142 = method71(this.field130, this.field143);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lnd;II)V")
    private class12(class352 arg0, int arg1, int arg2) {
        super.field1486 = arg0;
        this.field134 = arg0.field5089;
        this.field131 = arg0.field5087;
        this.field139 = arg0.field5086;
        this.field138 = arg1;
        this.field130 = arg2;
        this.field143 = 8192;
        this.field144 = 0;
        this.method91();
    }

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "()Z")
    public final boolean method92() {
        return this.field144 < 0 || this.field144 >= ((class352) super.field1486).field5088.length << 8;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lnd;III)V")
    private class12(class352 arg0, int arg1, int arg2, int arg3) {
        super.field1486 = arg0;
        this.field134 = arg0.field5089;
        this.field131 = arg0.field5087;
        this.field139 = arg0.field5086;
        this.field138 = arg1;
        this.field130 = arg2;
        this.field143 = arg3;
        this.field144 = 0;
        this.method91();
    }
}
