import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class652 extends class19 {

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    private int field9209;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    private int field9211;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Z")
    private boolean field9204;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    private int field9207;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    private int field9214;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field9215;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field9208;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    private int field9203;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field9205;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    private int field9206;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    private int field9210;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private int field9212;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    private int field9213;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field9216;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    private int field9217;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 3)
    public final synchronized void method3640(int arg0) {
        if (arg0 == 0) {
            this.method3645(0);
            this.method2549((byte) -101);
        } else if (this.field9210 == 0 && this.field9205 == 0) {
            this.field9203 = 0;
            this.field9214 = 0;
            this.field9217 = 0;
            this.method2549((byte) 26);
        } else {
            int var2 = -this.field9217;
            if (this.field9217 > var2) {
                var2 = this.field9217;
            }
            if (-this.field9210 > var2) {
                var2 = -this.field9210;
            }
            if (this.field9210 > var2) {
                var2 = this.field9210;
            }
            if (-this.field9205 > var2) {
                var2 = -this.field9205;
            }
            if (this.field9205 > var2) {
                var2 = this.field9205;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field9203 = arg0;
            this.field9214 = Integer.MIN_VALUE;
            this.field9206 = -this.field9217 / arg0;
            this.field9213 = -this.field9210 / arg0;
            this.field9216 = -this.field9205 / arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()I", line = 49)
    public final int method205() {
        return this.field9214 == 0 && this.field9203 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 55)
    public final synchronized void method201(int arg0) {
        if (this.field9203 > 0) {
            if (arg0 >= this.field9203) {
                if (this.field9214 == Integer.MIN_VALUE) {
                    this.field9214 = 0;
                    this.field9217 = this.field9210 = this.field9205 = 0;
                    this.method2549((byte) 91);
                    arg0 = this.field9203;
                }
                this.field9203 = 0;
                this.method3642();
            } else {
                this.field9217 += this.field9206 * arg0;
                this.field9210 += this.field9213 * arg0;
                this.field9205 += this.field9216 * arg0;
                this.field9203 -= arg0;
            }
        }
        class95 var2 = (class95) super.field273;
        int var3 = this.field9209 << 8;
        int var4 = this.field9211 << 8;
        int var5 = var2.field1407.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field9212 = 0;
        }
        if (this.field9208 < 0) {
            if (this.field9207 <= 0) {
                this.method3679();
                this.method2549((byte) 75);
                return;
            }
            this.field9208 = 0;
        }
        if (this.field9208 >= var5) {
            if (this.field9207 >= 0) {
                this.method3679();
                this.method2549((byte) -102);
                return;
            }
            this.field9208 = var5 - 1;
        }
        this.field9208 += this.field9207 * arg0;
        if (this.field9212 < 0) {
            if (!this.field9204) {
                if (this.field9207 < 0) {
                    if (this.field9208 < var3) {
                        this.field9208 = var4 - 1 - (var4 - 1 - this.field9208) % var6;
                    }
                } else if (this.field9208 >= var4) {
                    this.field9208 = (this.field9208 - var3) % var6 + var3;
                }
            } else {
                if (this.field9207 < 0) {
                    if (this.field9208 >= var3) {
                        return;
                    }
                    this.field9208 = var3 + var3 - 1 - this.field9208;
                    this.field9207 = -this.field9207;
                }
                while (this.field9208 >= var4) {
                    this.field9208 = var4 + var4 - 1 - this.field9208;
                    this.field9207 = -this.field9207;
                    if (this.field9208 >= var3) {
                        return;
                    }
                    this.field9208 = var3 + var3 - 1 - this.field9208;
                    this.field9207 = -this.field9207;
                }
            }
        } else {
            if (this.field9212 > 0) {
                if (this.field9204) {
                    label125: {
                        if (this.field9207 < 0) {
                            if (this.field9208 >= var3) {
                                return;
                            }
                            this.field9208 = var3 + var3 - 1 - this.field9208;
                            this.field9207 = -this.field9207;
                            if (--this.field9212 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field9208 < var4) {
                                return;
                            }
                            this.field9208 = var4 + var4 - 1 - this.field9208;
                            this.field9207 = -this.field9207;
                            if (--this.field9212 == 0) {
                                break;
                            }
                            if (this.field9208 >= var3) {
                                return;
                            }
                            this.field9208 = var3 + var3 - 1 - this.field9208;
                            this.field9207 = -this.field9207;
                        } while (--this.field9212 != 0);
                    }
                } else if (this.field9207 < 0) {
                    if (this.field9208 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field9208) / var6;
                    if (var7 < this.field9212) {
                        this.field9208 += var6 * var7;
                        this.field9212 -= var7;
                        return;
                    }
                    this.field9208 += this.field9212 * var6;
                    this.field9212 = 0;
                } else {
                    if (this.field9208 < var4) {
                        return;
                    }
                    int var8 = (this.field9208 - var3) / var6;
                    if (var8 < this.field9212) {
                        this.field9208 -= var6 * var8;
                        this.field9212 -= var8;
                        return;
                    }
                    this.field9208 -= this.field9212 * var6;
                    this.field9212 = 0;
                }
            }
            if (this.field9207 < 0) {
                if (this.field9208 < 0) {
                    this.field9208 = -1;
                    this.method3679();
                    this.method2549((byte) -70);
                    return;
                }
            } else if (this.field9208 >= var5) {
                this.field9208 = var5;
                this.method3679();
                this.method2549((byte) 58);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "()I", line = 273)
    public final synchronized int method3641() {
        return this.field9207 < 0 ? -this.field9207 : this.field9207;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "()V", line = 277)
    private final void method3642() {
        this.field9217 = this.field9214;
        this.field9210 = method3660(this.field9214, this.field9215);
        this.field9205 = method3667(this.field9214, this.field9215);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIIILlc;II)I", line = 282)
    private static final int method3643(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class652 arg11, int arg12, int arg13) {
        arg11.field9210 -= arg11.field9213 * arg5;
        arg11.field9205 -= arg11.field9216 * arg5;
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
        arg11.field9210 += arg11.field9213 * arg5;
        arg11.field9205 += arg11.field9216 * arg5;
        arg11.field9217 = arg6;
        arg11.field9208 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()I", line = 317)
    public final int method206() {
        int var1 = this.field9217 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field9212 == 0) {
            var2 -= this.field9208 * var2 / (((class95) super.field273).field1407.length << 8);
        } else if (this.field9212 >= 0) {
            var2 -= this.field9209 * var2 / ((class95) super.field273).field1407.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V", line = 330)
    public final synchronized void method3644(int arg0) {
        this.field9212 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V", line = 333)
    private final synchronized void method3645(int arg0) {
        this.method3654(arg0, this.method3668());
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 336)
    public final synchronized void method3646(int arg0) {
        if (this.field9207 < 0) {
            this.field9207 = -arg0;
        } else {
            this.field9207 = arg0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)I", line = 345)
    private final int method3647(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9203 <= 0) {
                if (this.field9207 == -256 && (this.field9208 & 255) == 0) {
                    if (class525.field7704) {
                        return method3655(0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, 0, arg3, arg2, this);
                    }
                    return method3662(((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, 0, arg3, arg2, this);
                }
                if (class525.field7704) {
                    return method3676(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, 0, arg3, arg2, this, this.field9207, arg4);
                }
                return method3674(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, 0, arg3, arg2, this, this.field9207, arg4);
            }
            int var6 = this.field9203 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9203 += arg1;
            if (this.field9207 == -256 && (this.field9208 & 255) == 0) {
                if (class525.field7704) {
                    arg1 = method3666(0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, this.field9213, this.field9216, 0, var6, arg2, this);
                } else {
                    arg1 = method3648(((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, this.field9206, 0, var6, arg2, this);
                }
            } else if (class525.field7704) {
                arg1 = method3649(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, this.field9213, this.field9216, 0, var6, arg2, this, this.field9207, arg4);
            } else {
                arg1 = method3643(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, this.field9206, 0, var6, arg2, this, this.field9207, arg4);
            }
            this.field9203 -= arg1;
            if (this.field9203 != 0) {
                return arg1;
            }
        } while (!this.method3675());
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V", line = 400)
    public final synchronized void method203(int[] arg0, int arg1, int arg2) {
        if (this.field9214 == 0 && this.field9203 == 0) {
            this.method201(arg2);
        } else {
            class95 var4 = (class95) super.field273;
            int var5 = this.field9209 << 8;
            int var6 = this.field9211 << 8;
            int var7 = var4.field1407.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field9212 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field9208 < 0) {
                if (this.field9207 <= 0) {
                    this.method3679();
                    this.method2549((byte) 57);
                    return;
                }
                this.field9208 = 0;
            }
            if (this.field9208 >= var7) {
                if (this.field9207 >= 0) {
                    this.method3679();
                    this.method2549((byte) 28);
                    return;
                }
                this.field9208 = var7 - 1;
            }
            if (this.field9212 < 0) {
                if (this.field9204) {
                    if (this.field9207 < 0) {
                        var9 = this.method3647(arg0, arg1, var5, var10, var4.field1407[this.field9209]);
                        if (this.field9208 >= var5) {
                            return;
                        }
                        this.field9208 = var5 + var5 - 1 - this.field9208;
                        this.field9207 = -this.field9207;
                    }
                    while (true) {
                        int var11 = this.method3656(arg0, var9, var6, var10, var4.field1407[this.field9211 - 1]);
                        if (this.field9208 < var6) {
                            return;
                        }
                        this.field9208 = var6 + var6 - 1 - this.field9208;
                        this.field9207 = -this.field9207;
                        var9 = this.method3647(arg0, var11, var5, var10, var4.field1407[this.field9209]);
                        if (this.field9208 >= var5) {
                            return;
                        }
                        this.field9208 = var5 + var5 - 1 - this.field9208;
                        this.field9207 = -this.field9207;
                    }
                } else if (this.field9207 < 0) {
                    while (true) {
                        var9 = this.method3647(arg0, var9, var5, var10, var4.field1407[this.field9211 - 1]);
                        if (this.field9208 >= var5) {
                            return;
                        }
                        this.field9208 = var6 - 1 - (var6 - 1 - this.field9208) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3656(arg0, var9, var6, var10, var4.field1407[this.field9209]);
                        if (this.field9208 < var6) {
                            return;
                        }
                        this.field9208 = (this.field9208 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field9212 > 0) {
                    if (this.field9204) {
                        label130: {
                            if (this.field9207 < 0) {
                                var9 = this.method3647(arg0, arg1, var5, var10, var4.field1407[this.field9209]);
                                if (this.field9208 >= var5) {
                                    return;
                                }
                                this.field9208 = var5 + var5 - 1 - this.field9208;
                                this.field9207 = -this.field9207;
                                if (--this.field9212 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3656(arg0, var9, var6, var10, var4.field1407[this.field9211 - 1]);
                                if (this.field9208 < var6) {
                                    return;
                                }
                                this.field9208 = var6 + var6 - 1 - this.field9208;
                                this.field9207 = -this.field9207;
                                if (--this.field9212 == 0) {
                                    break;
                                }
                                var9 = this.method3647(arg0, var9, var5, var10, var4.field1407[this.field9209]);
                                if (this.field9208 >= var5) {
                                    return;
                                }
                                this.field9208 = var5 + var5 - 1 - this.field9208;
                                this.field9207 = -this.field9207;
                            } while (--this.field9212 != 0);
                        }
                    } else if (this.field9207 < 0) {
                        while (true) {
                            var9 = this.method3647(arg0, var9, var5, var10, var4.field1407[this.field9211 - 1]);
                            if (this.field9208 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field9208) / var8;
                            if (var12 >= this.field9212) {
                                this.field9208 += this.field9212 * var8;
                                this.field9212 = 0;
                                break;
                            }
                            this.field9208 += var8 * var12;
                            this.field9212 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3656(arg0, var9, var6, var10, var4.field1407[this.field9209]);
                            if (this.field9208 < var6) {
                                return;
                            }
                            int var13 = (this.field9208 - var5) / var8;
                            if (var13 >= this.field9212) {
                                this.field9208 -= this.field9212 * var8;
                                this.field9212 = 0;
                                break;
                            }
                            this.field9208 -= var8 * var13;
                            this.field9212 -= var13;
                        }
                    }
                }
                if (this.field9207 < 0) {
                    this.method3647(arg0, var9, 0, var10, 0);
                    if (this.field9208 < 0) {
                        this.field9208 = -1;
                        this.method3679();
                        this.method2549((byte) -92);
                        return;
                    }
                } else {
                    this.method3656(arg0, var9, var7, var10, 0);
                    if (this.field9208 >= var7) {
                        this.field9208 = var7;
                        this.method3679();
                        this.method2549((byte) -50);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B[IIIIIIIILlc;)I", line = 635)
    private static final int method3648(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class652 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field9210 += (var14 - arg3) * arg9.field9213;
        arg9.field9205 += (var14 - arg3) * arg9.field9216;
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
        arg9.field9217 = var12 >> 2;
        arg9.field9208 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIIIIILlc;II)I", line = 669)
    private static final int method3649(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class652 arg13, int arg14, int arg15) {
        arg13.field9217 -= arg13.field9206 * arg5;
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
        arg13.field9217 += arg13.field9206 * var22;
        arg13.field9210 = arg6;
        arg13.field9205 = arg7;
        arg13.field9208 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V", line = 710)
    public final synchronized void method3650(int arg0) {
        this.method3654(arg0 << 6, this.method3668());
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "()Z", line = 713)
    public final boolean method3651() {
        return this.field9208 < 0 || this.field9208 >= ((class95) super.field273).field1407.length << 8;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "()Lnr;", line = 716)
    public final class19 method207() {
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIIILlc;II)I", line = 722)
    private static final int method3652(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class652 arg11, int arg12, int arg13) {
        arg11.field9210 -= arg11.field9213 * arg5;
        arg11.field9205 -= arg11.field9216 * arg5;
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
        arg11.field9210 += arg11.field9213 * arg5;
        arg11.field9205 += arg11.field9216 * arg5;
        arg11.field9217 = arg6;
        arg11.field9208 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[B[IIIIIIILlc;II)I", line = 757)
    private static final int method3653(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class652 arg10, int arg11, int arg12) {
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
        arg10.field9208 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 783)
    private final synchronized void method3654(int arg0, int arg1) {
        this.field9214 = arg0;
        this.field9215 = arg1;
        this.field9203 = 0;
        this.method3642();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B[IIIIIIIILlc;)I", line = 789)
    private static final int method3655(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class652 arg10) {
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
        arg10.field9208 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([IIIII)I", line = 829)
    private final int method3656(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field9203 <= 0) {
                if (this.field9207 == 256 && (this.field9208 & 255) == 0) {
                    if (class525.field7704) {
                        return method3677(0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, 0, arg3, arg2, this);
                    }
                    return method3665(((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, 0, arg3, arg2, this);
                }
                if (class525.field7704) {
                    return method3671(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, 0, arg3, arg2, this, this.field9207, arg4);
                }
                return method3653(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, 0, arg3, arg2, this, this.field9207, arg4);
            }
            int var6 = this.field9203 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field9203 += arg1;
            if (this.field9207 == 256 && (this.field9208 & 255) == 0) {
                if (class525.field7704) {
                    arg1 = method3669(0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, this.field9213, this.field9216, 0, var6, arg2, this);
                } else {
                    arg1 = method3659(((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, this.field9206, 0, var6, arg2, this);
                }
            } else if (class525.field7704) {
                arg1 = method3678(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9210, this.field9205, this.field9213, this.field9216, 0, var6, arg2, this, this.field9207, arg4);
            } else {
                arg1 = method3652(0, 0, ((class95) super.field273).field1407, arg0, this.field9208, arg1, this.field9217, this.field9206, 0, var6, arg2, this, this.field9207, arg4);
            }
            this.field9203 -= arg1;
            if (this.field9203 != 0) {
                return arg1;
            }
        } while (!this.method3675());
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V", line = 885)
    public final synchronized void method3657(int arg0, int arg1) {
        this.method3673(arg0, arg1, this.method3668());
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V", line = 888)
    public final synchronized void method3658(int arg0) {
        this.method3654(this.method3672(), arg0);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B[IIIIIIIILlc;)I", line = 892)
    private static final int method3659(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class652 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field9210 += (var14 - arg3) * arg9.field9213;
        arg9.field9205 += (var14 - arg3) * arg9.field9216;
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
        arg9.field9217 = var12 >> 2;
        arg9.field9208 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)I", line = 926)
    private static final int method3660(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V", line = 931)
    public final synchronized void method3661(int arg0) {
        int var2 = ((class95) super.field273).field1407.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field9208 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([B[IIIIIIILlc;)I", line = 941)
    private static final int method3662(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class652 arg8) {
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
        arg8.field9208 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ltk;III)Llc;", line = 970)
    public static final class652 method3663(class95 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1407 != null && arg0.field1407.length != 0 ? new class652(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "()Z", line = 976)
    public final boolean method3664() {
        return this.field9203 != 0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([B[IIIIIIILlc;)I", line = 979)
    private static final int method3665(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class652 arg8) {
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
        arg8.field9208 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[B[IIIIIIIIIILlc;)I", line = 1007)
    private static final int method3666(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class652 arg12) {
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
        arg12.field9217 += (var19 - arg4) * arg12.field9206;
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
        arg12.field9210 = var15 >> 2;
        arg12.field9205 = var16 >> 2;
        arg12.field9208 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)I", line = 1060)
    private static final int method3667(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "()I", line = 1064)
    public final synchronized int method3668() {
        return this.field9215 < 0 ? -1 : this.field9215;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I[B[IIIIIIIIIILlc;)I", line = 1070)
    private static final int method3669(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class652 arg12) {
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
        arg12.field9217 += (var19 - arg4) * arg12.field9206;
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
        arg12.field9210 = var15 >> 2;
        arg12.field9205 = var16 >> 2;
        arg12.field9208 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 1123)
    public final synchronized void method3670(boolean arg0) {
        this.field9207 = (this.field9207 >>> 31) + (this.field9207 ^ this.field9207 >> 31);
        if (arg0) {
            this.field9207 = -this.field9207;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(II[B[IIIIIIIILlc;II)I", line = 1130)
    private static final int method3671(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class652 arg11, int arg12, int arg13) {
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
        arg11.field9208 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "()I", line = 1163)
    public final synchronized int method3672() {
        return this.field9214 == Integer.MIN_VALUE ? 0 : this.field9214;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V", line = 1166)
    public final synchronized void method3673(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3654(arg1, arg2);
        } else {
            int var4 = method3660(arg1, arg2);
            int var5 = method3667(arg1, arg2);
            if (this.field9210 == var4 && this.field9205 == var5) {
                this.field9203 = 0;
            } else {
                int var6 = arg1 - this.field9217;
                if (this.field9217 - arg1 > var6) {
                    var6 = this.field9217 - arg1;
                }
                if (var4 - this.field9210 > var6) {
                    var6 = var4 - this.field9210;
                }
                if (this.field9210 - var4 > var6) {
                    var6 = this.field9210 - var4;
                }
                if (var5 - this.field9205 > var6) {
                    var6 = var5 - this.field9205;
                }
                if (this.field9205 - var5 > var6) {
                    var6 = this.field9205 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field9203 = arg0;
                this.field9214 = arg1;
                this.field9215 = arg2;
                this.field9206 = (arg1 - this.field9217) / arg0;
                this.field9213 = (var4 - this.field9210) / arg0;
                this.field9216 = (var5 - this.field9205) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIILlc;II)I", line = 1215)
    private static final int method3674(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class652 arg10, int arg11, int arg12) {
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
        arg10.field9208 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "()Z", line = 1242)
    private final boolean method3675() {
        int var1 = this.field9214;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3660(var1, this.field9215);
            var2 = method3667(var1, this.field9215);
        }
        if (this.field9217 == var1 && this.field9210 == var3 && this.field9205 == var2) {
            if (this.field9214 == Integer.MIN_VALUE) {
                this.field9214 = 0;
                this.field9217 = this.field9210 = this.field9205 = 0;
                this.method2549((byte) 27);
                return true;
            } else {
                this.method3642();
                return false;
            }
        } else {
            if (this.field9217 < var1) {
                this.field9206 = 1;
                this.field9203 = var1 - this.field9217;
            } else if (this.field9217 > var1) {
                this.field9206 = -1;
                this.field9203 = this.field9217 - var1;
            } else {
                this.field9206 = 0;
            }
            if (this.field9210 < var3) {
                this.field9213 = 1;
                if (this.field9203 == 0 || this.field9203 > var3 - this.field9210) {
                    this.field9203 = var3 - this.field9210;
                }
            } else if (this.field9210 > var3) {
                this.field9213 = -1;
                if (this.field9203 == 0 || this.field9203 > this.field9210 - var3) {
                    this.field9203 = this.field9210 - var3;
                }
            } else {
                this.field9213 = 0;
            }
            if (this.field9205 < var2) {
                this.field9216 = 1;
                if (this.field9203 == 0 || this.field9203 > var2 - this.field9205) {
                    this.field9203 = var2 - this.field9205;
                }
            } else if (this.field9205 > var2) {
                this.field9216 = -1;
                if (this.field9203 == 0 || this.field9203 > this.field9205 - var2) {
                    this.field9203 = this.field9205 - var2;
                }
            } else {
                this.field9216 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(II[B[IIIIIIIILlc;II)I", line = 1328)
    private static final int method3676(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class652 arg11, int arg12, int arg13) {
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
        arg11.field9208 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lnr;", line = 1362)
    public final class19 method202() {
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I[B[IIIIIIIILlc;)I", line = 1365)
    private static final int method3677(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class652 arg10) {
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
        arg10.field9208 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II[B[IIIIIIIIIILlc;II)I", line = 1403)
    private static final int method3678(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class652 arg13, int arg14, int arg15) {
        arg13.field9217 -= arg13.field9206 * arg5;
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
        arg13.field9217 += arg13.field9206 * var22;
        arg13.field9210 = arg6;
        arg13.field9205 = arg7;
        arg13.field9208 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ltk;III)V", line = 1445)
    private class652(class95 arg0, int arg1, int arg2, int arg3) {
        super.field273 = arg0;
        this.field9209 = arg0.field1409;
        this.field9211 = arg0.field1408;
        this.field9204 = arg0.field1405;
        this.field9207 = arg1;
        this.field9214 = arg2;
        this.field9215 = arg3;
        this.field9208 = 0;
        this.method3642();
    }

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "()V", line = 1457)
    private final void method3679() {
        if (this.field9203 != 0) {
            if (this.field9214 == Integer.MIN_VALUE) {
                this.field9214 = 0;
            }
            this.field9203 = 0;
            this.method3642();
        }
    }
}
