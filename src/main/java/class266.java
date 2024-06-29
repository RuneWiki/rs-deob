import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class266 extends class174 {

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    private int field4702;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field4696;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Z")
    private boolean field4700;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    private int field4695;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    private int field4698;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    private int field4699;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    private int field4706;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    private int field4693;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    private int field4694;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    private int field4697;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    private int field4701;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    private int field4703;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    private int field4704;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    private int field4705;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIIII)I")
    private final int method1797(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4705 <= 0) {
                if (this.field4695 == 256 && (this.field4706 & 255) == 0) {
                    if (class24.field590) {
                        return method1825(0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, 0, arg3, arg2, this);
                    }
                    return method1835(((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, 0, arg3, arg2, this);
                }
                if (class24.field590) {
                    return method1803(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, 0, arg3, arg2, this, this.field4695, arg4);
                }
                return method1812(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, 0, arg3, arg2, this, this.field4695, arg4);
            }
            int var6 = this.field4705 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4705 += arg1;
            if (this.field4695 == 256 && (this.field4706 & 255) == 0) {
                if (class24.field590) {
                    arg1 = method1823(0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, this.field4694, this.field4697, 0, var6, arg2, this);
                } else {
                    arg1 = method1836(((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, this.field4704, 0, var6, arg2, this);
                }
            } else if (class24.field590) {
                arg1 = method1798(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, this.field4694, this.field4697, 0, var6, arg2, this, this.field4695, arg4);
            } else {
                arg1 = method1805(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, this.field4704, 0, var6, arg2, this, this.field4695, arg4);
            }
            this.field4705 -= arg1;
            if (this.field4705 != 0) {
                return arg1;
            }
        } while (!this.method1824());
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V")
    public final synchronized void method281(int[] arg0, int arg1, int arg2) {
        if (this.field4698 == 0 && this.field4705 == 0) {
            this.method277(arg2);
        } else {
            class19 var4 = (class19) super.field3181;
            int var5 = this.field4702 << 8;
            int var6 = this.field4696 << 8;
            int var7 = var4.field511.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4703 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4706 < 0) {
                if (this.field4695 <= 0) {
                    this.method1811();
                    this.method1477(1);
                    return;
                }
                this.field4706 = 0;
            }
            if (this.field4706 >= var7) {
                if (this.field4695 >= 0) {
                    this.method1811();
                    this.method1477(1);
                    return;
                }
                this.field4706 = var7 - 1;
            }
            if (this.field4703 < 0) {
                if (this.field4700) {
                    if (this.field4695 < 0) {
                        var9 = this.method1807(arg0, arg1, var5, var10, var4.field511[this.field4702]);
                        if (this.field4706 >= var5) {
                            return;
                        }
                        this.field4706 = var5 + var5 - 1 - this.field4706;
                        this.field4695 = -this.field4695;
                    }
                    while (true) {
                        int var11 = this.method1797(arg0, var9, var6, var10, var4.field511[this.field4696 - 1]);
                        if (this.field4706 < var6) {
                            return;
                        }
                        this.field4706 = var6 + var6 - 1 - this.field4706;
                        this.field4695 = -this.field4695;
                        var9 = this.method1807(arg0, var11, var5, var10, var4.field511[this.field4702]);
                        if (this.field4706 >= var5) {
                            return;
                        }
                        this.field4706 = var5 + var5 - 1 - this.field4706;
                        this.field4695 = -this.field4695;
                    }
                } else if (this.field4695 < 0) {
                    while (true) {
                        var9 = this.method1807(arg0, var9, var5, var10, var4.field511[this.field4696 - 1]);
                        if (this.field4706 >= var5) {
                            return;
                        }
                        this.field4706 = var6 - 1 - (var6 - 1 - this.field4706) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1797(arg0, var9, var6, var10, var4.field511[this.field4702]);
                        if (this.field4706 < var6) {
                            return;
                        }
                        this.field4706 = (this.field4706 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4703 > 0) {
                    if (this.field4700) {
                        label130: {
                            if (this.field4695 < 0) {
                                var9 = this.method1807(arg0, arg1, var5, var10, var4.field511[this.field4702]);
                                if (this.field4706 >= var5) {
                                    return;
                                }
                                this.field4706 = var5 + var5 - 1 - this.field4706;
                                this.field4695 = -this.field4695;
                                if (--this.field4703 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1797(arg0, var9, var6, var10, var4.field511[this.field4696 - 1]);
                                if (this.field4706 < var6) {
                                    return;
                                }
                                this.field4706 = var6 + var6 - 1 - this.field4706;
                                this.field4695 = -this.field4695;
                                if (--this.field4703 == 0) {
                                    break;
                                }
                                var9 = this.method1807(arg0, var9, var5, var10, var4.field511[this.field4702]);
                                if (this.field4706 >= var5) {
                                    return;
                                }
                                this.field4706 = var5 + var5 - 1 - this.field4706;
                                this.field4695 = -this.field4695;
                            } while (--this.field4703 != 0);
                        }
                    } else if (this.field4695 < 0) {
                        while (true) {
                            var9 = this.method1807(arg0, var9, var5, var10, var4.field511[this.field4696 - 1]);
                            if (this.field4706 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4706) / var8;
                            if (var12 >= this.field4703) {
                                this.field4706 += this.field4703 * var8;
                                this.field4703 = 0;
                                break;
                            }
                            this.field4706 += var8 * var12;
                            this.field4703 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1797(arg0, var9, var6, var10, var4.field511[this.field4702]);
                            if (this.field4706 < var6) {
                                return;
                            }
                            int var13 = (this.field4706 - var5) / var8;
                            if (var13 >= this.field4703) {
                                this.field4706 -= this.field4703 * var8;
                                this.field4703 = 0;
                                break;
                            }
                            this.field4706 -= var8 * var13;
                            this.field4703 -= var13;
                        }
                    }
                }
                if (this.field4695 < 0) {
                    this.method1807(arg0, var9, 0, var10, 0);
                    if (this.field4706 < 0) {
                        this.field4706 = -1;
                        this.method1811();
                        this.method1477(1);
                        return;
                    }
                } else {
                    this.method1797(arg0, var9, var7, var10, 0);
                    if (this.field4706 >= var7) {
                        this.field4706 = var7;
                        this.method1811();
                        this.method1477(1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B[IIIIIIIIIILkc;II)I")
    private static final int method1798(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class266 arg13, int arg14, int arg15) {
        arg13.field4692 -= arg13.field4704 * arg5;
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
        arg13.field4692 += arg13.field4704 * var22;
        arg13.field4693 = arg6;
        arg13.field4701 = arg7;
        arg13.field4706 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B[IIIIIIILkc;)I")
    private static final int method1799(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class266 arg8) {
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
        arg8.field4706 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B[IIIIIIIILkc;)I")
    private static final int method1800(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class266 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4693 += (var14 - arg3) * arg9.field4694;
        arg9.field4701 += (var14 - arg3) * arg9.field4697;
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
        arg9.field4692 = var12 >> 2;
        arg9.field4706 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
    public final int method302() {
        return this.field4698 == 0 && this.field4705 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    private final synchronized void method1801(int arg0) {
        this.method1816(arg0, this.method1808());
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
    public final synchronized void method1802(int arg0) {
        if (arg0 == 0) {
            this.method1801(0);
            this.method1477(1);
        } else if (this.field4693 == 0 && this.field4701 == 0) {
            this.field4705 = 0;
            this.field4698 = 0;
            this.field4692 = 0;
            this.method1477(1);
        } else {
            int var2 = -this.field4692;
            if (this.field4692 > var2) {
                var2 = this.field4692;
            }
            if (-this.field4693 > var2) {
                var2 = -this.field4693;
            }
            if (this.field4693 > var2) {
                var2 = this.field4693;
            }
            if (-this.field4701 > var2) {
                var2 = -this.field4701;
            }
            if (this.field4701 > var2) {
                var2 = this.field4701;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4705 = arg0;
            this.field4698 = Integer.MIN_VALUE;
            this.field4704 = -this.field4692 / arg0;
            this.field4694 = -this.field4693 / arg0;
            this.field4697 = -this.field4701 / arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method1803(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class266 arg11, int arg12, int arg13) {
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
        arg11.field4706 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method1804(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class266 arg11, int arg12, int arg13) {
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
        arg11.field4706 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method1805(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class266 arg11, int arg12, int arg13) {
        arg11.field4693 -= arg11.field4694 * arg5;
        arg11.field4701 -= arg11.field4697 * arg5;
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
        arg11.field4693 += arg11.field4694 * arg5;
        arg11.field4701 += arg11.field4697 * arg5;
        arg11.field4692 = arg6;
        arg11.field4706 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B[IIIIIIIILkc;)I")
    private static final int method1806(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class266 arg10) {
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
        arg10.field4706 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final synchronized void method277(int arg0) {
        if (this.field4705 > 0) {
            if (arg0 >= this.field4705) {
                if (this.field4698 == Integer.MIN_VALUE) {
                    this.field4698 = 0;
                    this.field4692 = this.field4693 = this.field4701 = 0;
                    this.method1477(1);
                    arg0 = this.field4705;
                }
                this.field4705 = 0;
                this.method1831();
            } else {
                this.field4692 += this.field4704 * arg0;
                this.field4693 += this.field4694 * arg0;
                this.field4701 += this.field4697 * arg0;
                this.field4705 -= arg0;
            }
        }
        class19 var2 = (class19) super.field3181;
        int var3 = this.field4702 << 8;
        int var4 = this.field4696 << 8;
        int var5 = var2.field511.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4703 = 0;
        }
        if (this.field4706 < 0) {
            if (this.field4695 <= 0) {
                this.method1811();
                this.method1477(1);
                return;
            }
            this.field4706 = 0;
        }
        if (this.field4706 >= var5) {
            if (this.field4695 >= 0) {
                this.method1811();
                this.method1477(1);
                return;
            }
            this.field4706 = var5 - 1;
        }
        this.field4706 += this.field4695 * arg0;
        if (this.field4703 < 0) {
            if (!this.field4700) {
                if (this.field4695 < 0) {
                    if (this.field4706 < var3) {
                        this.field4706 = var4 - 1 - (var4 - 1 - this.field4706) % var6;
                    }
                } else if (this.field4706 >= var4) {
                    this.field4706 = (this.field4706 - var3) % var6 + var3;
                }
            } else {
                if (this.field4695 < 0) {
                    if (this.field4706 >= var3) {
                        return;
                    }
                    this.field4706 = var3 + var3 - 1 - this.field4706;
                    this.field4695 = -this.field4695;
                }
                while (this.field4706 >= var4) {
                    this.field4706 = var4 + var4 - 1 - this.field4706;
                    this.field4695 = -this.field4695;
                    if (this.field4706 >= var3) {
                        return;
                    }
                    this.field4706 = var3 + var3 - 1 - this.field4706;
                    this.field4695 = -this.field4695;
                }
            }
        } else {
            if (this.field4703 > 0) {
                if (this.field4700) {
                    label125: {
                        if (this.field4695 < 0) {
                            if (this.field4706 >= var3) {
                                return;
                            }
                            this.field4706 = var3 + var3 - 1 - this.field4706;
                            this.field4695 = -this.field4695;
                            if (--this.field4703 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4706 < var4) {
                                return;
                            }
                            this.field4706 = var4 + var4 - 1 - this.field4706;
                            this.field4695 = -this.field4695;
                            if (--this.field4703 == 0) {
                                break;
                            }
                            if (this.field4706 >= var3) {
                                return;
                            }
                            this.field4706 = var3 + var3 - 1 - this.field4706;
                            this.field4695 = -this.field4695;
                        } while (--this.field4703 != 0);
                    }
                } else if (this.field4695 < 0) {
                    if (this.field4706 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4706) / var6;
                    if (var7 < this.field4703) {
                        this.field4706 += var6 * var7;
                        this.field4703 -= var7;
                        return;
                    }
                    this.field4706 += this.field4703 * var6;
                    this.field4703 = 0;
                } else {
                    if (this.field4706 < var4) {
                        return;
                    }
                    int var8 = (this.field4706 - var3) / var6;
                    if (var8 < this.field4703) {
                        this.field4706 -= var6 * var8;
                        this.field4703 -= var8;
                        return;
                    }
                    this.field4706 -= this.field4703 * var6;
                    this.field4703 = 0;
                }
            }
            if (this.field4695 < 0) {
                if (this.field4706 < 0) {
                    this.field4706 = -1;
                    this.method1811();
                    this.method1477(1);
                    return;
                }
            } else if (this.field4706 >= var5) {
                this.field4706 = var5;
                this.method1811();
                this.method1477(1);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([IIIII)I")
    private final int method1807(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4705 <= 0) {
                if (this.field4695 == -256 && (this.field4706 & 255) == 0) {
                    if (class24.field590) {
                        return method1806(0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, 0, arg3, arg2, this);
                    }
                    return method1799(((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, 0, arg3, arg2, this);
                }
                if (class24.field590) {
                    return method1804(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, 0, arg3, arg2, this, this.field4695, arg4);
                }
                return method1819(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, 0, arg3, arg2, this, this.field4695, arg4);
            }
            int var6 = this.field4705 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4705 += arg1;
            if (this.field4695 == -256 && (this.field4706 & 255) == 0) {
                if (class24.field590) {
                    arg1 = method1822(0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, this.field4694, this.field4697, 0, var6, arg2, this);
                } else {
                    arg1 = method1800(((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, this.field4704, 0, var6, arg2, this);
                }
            } else if (class24.field590) {
                arg1 = method1828(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4693, this.field4701, this.field4694, this.field4697, 0, var6, arg2, this, this.field4695, arg4);
            } else {
                arg1 = method1832(0, 0, ((class19) super.field3181).field511, arg0, this.field4706, arg1, this.field4692, this.field4704, 0, var6, arg2, this, this.field4695, arg4);
            }
            this.field4705 -= arg1;
            if (this.field4705 != 0) {
                return arg1;
            }
        } while (!this.method1824());
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()I")
    public final synchronized int method1808() {
        return this.field4699 < 0 ? -1 : this.field4699;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
    public final synchronized void method1809(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1816(arg1, arg2);
        } else {
            int var4 = method1820(arg1, arg2);
            int var5 = method1818(arg1, arg2);
            if (this.field4693 == var4 && this.field4701 == var5) {
                this.field4705 = 0;
            } else {
                int var6 = arg1 - this.field4692;
                if (this.field4692 - arg1 > var6) {
                    var6 = this.field4692 - arg1;
                }
                if (var4 - this.field4693 > var6) {
                    var6 = var4 - this.field4693;
                }
                if (this.field4693 - var4 > var6) {
                    var6 = this.field4693 - var4;
                }
                if (var5 - this.field4701 > var6) {
                    var6 = var5 - this.field4701;
                }
                if (this.field4701 - var5 > var6) {
                    var6 = this.field4701 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4705 = arg0;
                this.field4698 = arg1;
                this.field4699 = arg2;
                this.field4704 = (arg1 - this.field4692) / arg0;
                this.field4694 = (var4 - this.field4693) / arg0;
                this.field4697 = (var5 - this.field4701) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()I")
    public final int method1239() {
        int var1 = this.field4692 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4703 == 0) {
            var2 -= this.field4706 * var2 / (((class19) super.field3181).field511.length << 8);
        } else if (this.field4703 >= 0) {
            var2 -= this.field4702 * var2 / ((class19) super.field3181).field511.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()Lk;")
    public final class174 method276() {
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public final synchronized void method1810(int arg0, int arg1) {
        this.method1809(arg0, arg1, this.method1808());
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "()V")
    private final void method1811() {
        if (this.field4705 != 0) {
            if (this.field4698 == Integer.MIN_VALUE) {
                this.field4698 = 0;
            }
            this.field4705 = 0;
            this.method1831();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B[IIIIIIILkc;II)I")
    private static final int method1812(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class266 arg10, int arg11, int arg12) {
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
        arg10.field4706 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()I")
    public final synchronized int method1813() {
        return this.field4695 < 0 ? -this.field4695 : this.field4695;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "()Z")
    public final boolean method1814() {
        return this.field4706 < 0 || this.field4706 >= ((class19) super.field3181).field511.length << 8;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    public final synchronized void method1815(int arg0) {
        int var2 = ((class19) super.field3181).field511.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4706 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    private final synchronized void method1816(int arg0, int arg1) {
        this.field4698 = arg0;
        this.field4699 = arg1;
        this.field4705 = 0;
        this.method1831();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public final synchronized void method1817(boolean arg0) {
        this.field4695 = (this.field4695 >>> 31) + (this.field4695 ^ this.field4695 >> 31);
        if (arg0) {
            this.field4695 = -this.field4695;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)I")
    private static final int method1818(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II[B[IIIIIIILkc;II)I")
    private static final int method1819(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class266 arg10, int arg11, int arg12) {
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
        arg10.field4706 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)I")
    private static final int method1820(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "()Z")
    public final boolean method1821() {
        return this.field4705 != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B[IIIIIIIIIILkc;)I")
    private static final int method1822(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class266 arg12) {
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
        arg12.field4692 += (var19 - arg4) * arg12.field4704;
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
        arg12.field4693 = var15 >> 2;
        arg12.field4701 = var16 >> 2;
        arg12.field4706 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I[B[IIIIIIIIIILkc;)I")
    private static final int method1823(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class266 arg12) {
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
        arg12.field4692 += (var19 - arg4) * arg12.field4704;
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
        arg12.field4693 = var15 >> 2;
        arg12.field4701 = var16 >> 2;
        arg12.field4706 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "()Z")
    private final boolean method1824() {
        int var1 = this.field4698;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1820(var1, this.field4699);
            var2 = method1818(var1, this.field4699);
        }
        if (this.field4692 == var1 && this.field4693 == var3 && this.field4701 == var2) {
            if (this.field4698 == Integer.MIN_VALUE) {
                this.field4698 = 0;
                this.field4692 = this.field4693 = this.field4701 = 0;
                this.method1477(1);
                return true;
            } else {
                this.method1831();
                return false;
            }
        } else {
            if (this.field4692 < var1) {
                this.field4704 = 1;
                this.field4705 = var1 - this.field4692;
            } else if (this.field4692 > var1) {
                this.field4704 = -1;
                this.field4705 = this.field4692 - var1;
            } else {
                this.field4704 = 0;
            }
            if (this.field4693 < var3) {
                this.field4694 = 1;
                if (this.field4705 == 0 || this.field4705 > var3 - this.field4693) {
                    this.field4705 = var3 - this.field4693;
                }
            } else if (this.field4693 > var3) {
                this.field4694 = -1;
                if (this.field4705 == 0 || this.field4705 > this.field4693 - var3) {
                    this.field4705 = this.field4693 - var3;
                }
            } else {
                this.field4694 = 0;
            }
            if (this.field4701 < var2) {
                this.field4697 = 1;
                if (this.field4705 == 0 || this.field4705 > var2 - this.field4701) {
                    this.field4705 = var2 - this.field4701;
                }
            } else if (this.field4701 > var2) {
                this.field4697 = -1;
                if (this.field4705 == 0 || this.field4705 > this.field4701 - var2) {
                    this.field4705 = this.field4701 - var2;
                }
            } else {
                this.field4697 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I[B[IIIIIIIILkc;)I")
    private static final int method1825(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class266 arg10) {
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
        arg10.field4706 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lhe;III)Lkc;")
    public static final class266 method1826(class19 arg0, int arg1, int arg2, int arg3) {
        return arg0.field511 != null && arg0.field511.length != 0 ? new class266(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lhe;II)Lkc;")
    public static final class266 method1827(class19 arg0, int arg1, int arg2) {
        return arg0.field511 != null && arg0.field511.length != 0 ? new class266(arg0, (int) ((long) arg0.field514 * 256L * (long) arg1 / (long) (class65.field1277 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II[B[IIIIIIIIIILkc;II)I")
    private static final int method1828(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class266 arg13, int arg14, int arg15) {
        arg13.field4692 -= arg13.field4704 * arg5;
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
        arg13.field4692 += arg13.field4704 * var22;
        arg13.field4693 = arg6;
        arg13.field4701 = arg7;
        arg13.field4706 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    public final synchronized void method1829(int arg0) {
        this.method1816(arg0 << 6, this.method1808());
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
    public final synchronized void method1830(int arg0) {
        this.field4703 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "()V")
    private final void method1831() {
        this.field4692 = this.field4698;
        this.field4693 = method1820(this.field4698, this.field4699);
        this.field4701 = method1818(this.field4698, this.field4699);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II[B[IIIIIIIILkc;II)I")
    private static final int method1832(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class266 arg11, int arg12, int arg13) {
        arg11.field4693 -= arg11.field4694 * arg5;
        arg11.field4701 -= arg11.field4697 * arg5;
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
        arg11.field4693 += arg11.field4694 * arg5;
        arg11.field4701 += arg11.field4697 * arg5;
        arg11.field4692 = arg6;
        arg11.field4706 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "()I")
    public final synchronized int method1833() {
        return this.field4698 == Integer.MIN_VALUE ? 0 : this.field4698;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lhe;II)V")
    private class266(class19 arg0, int arg1, int arg2) {
        super.field3181 = arg0;
        this.field4702 = arg0.field513;
        this.field4696 = arg0.field515;
        this.field4700 = arg0.field512;
        this.field4695 = arg1;
        this.field4698 = arg2;
        this.field4699 = 8192;
        this.field4706 = 0;
        this.method1831();
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)V")
    public final synchronized void method1834(int arg0) {
        if (this.field4695 < 0) {
            this.field4695 = -arg0;
        } else {
            this.field4695 = arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lk;")
    public final class174 method283() {
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lhe;III)V")
    private class266(class19 arg0, int arg1, int arg2, int arg3) {
        super.field3181 = arg0;
        this.field4702 = arg0.field513;
        this.field4696 = arg0.field515;
        this.field4700 = arg0.field512;
        this.field4695 = arg1;
        this.field4698 = arg2;
        this.field4699 = arg3;
        this.field4706 = 0;
        this.method1831();
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([B[IIIIIIILkc;)I")
    private static final int method1835(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class266 arg8) {
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
        arg8.field4706 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "([B[IIIIIIIILkc;)I")
    private static final int method1836(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class266 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4693 += (var14 - arg3) * arg9.field4694;
        arg9.field4701 += (var14 - arg3) * arg9.field4697;
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
        arg9.field4692 = var12 >> 2;
        arg9.field4706 = var10 << 8;
        return arg3;
    }
}
