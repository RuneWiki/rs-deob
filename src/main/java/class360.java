import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class360 extends class461 {

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    private int field4794;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    private int field4789;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "Z")
    private boolean field4799;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    private int field4800;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    private int field4797;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    private int field4788;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    private int field4790;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    private int field4796;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[B[IIIIIIIILpp;)I", line = 3)
    private static final int method2019(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class360 arg10) {
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
        arg10.field4797 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "()I", line = 45)
    public final synchronized int method2020() {
        return this.field4800 < 0 ? -this.field4800 : this.field4800;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 48)
    public final synchronized void method2021(int arg0) {
        if (arg0 == 0) {
            this.method2049(0);
            this.method3045(true);
        } else if (this.field4791 == 0 && this.field4798 == 0) {
            this.field4796 = 0;
            this.field4793 = 0;
            this.field4790 = 0;
            this.method3045(true);
        } else {
            int var2 = -this.field4790;
            if (this.field4790 > var2) {
                var2 = this.field4790;
            }
            if (-this.field4791 > var2) {
                var2 = -this.field4791;
            }
            if (this.field4791 > var2) {
                var2 = this.field4791;
            }
            if (-this.field4798 > var2) {
                var2 = -this.field4798;
            }
            if (this.field4798 > var2) {
                var2 = this.field4798;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4796 = arg0;
            this.field4793 = Integer.MIN_VALUE;
            this.field4795 = -this.field4790 / arg0;
            this.field4792 = -this.field4791 / arg0;
            this.field4788 = -this.field4798 / arg0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([B[IIIIIIIILpp;)I", line = 93)
    private static final int method2022(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class360 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4791 += (var14 - arg3) * arg9.field4792;
        arg9.field4798 += (var14 - arg3) * arg9.field4788;
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
        arg9.field4790 = var12 >> 2;
        arg9.field4797 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([III)V", line = 128)
    public final synchronized void method1228(int[] arg0, int arg1, int arg2) {
        if (this.field4793 == 0 && this.field4796 == 0) {
            this.method1225(arg2);
        } else {
            class387 var4 = (class387) super.field6464;
            int var5 = this.field4794 << 8;
            int var6 = this.field4789 << 8;
            int var7 = var4.field5150.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4801 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4797 < 0) {
                if (this.field4800 <= 0) {
                    this.method2028();
                    this.method3045(true);
                    return;
                }
                this.field4797 = 0;
            }
            if (this.field4797 >= var7) {
                if (this.field4800 >= 0) {
                    this.method2028();
                    this.method3045(true);
                    return;
                }
                this.field4797 = var7 - 1;
            }
            if (this.field4801 < 0) {
                if (this.field4799) {
                    if (this.field4800 < 0) {
                        var9 = this.method2030(arg0, arg1, var5, var10, var4.field5150[this.field4794]);
                        if (this.field4797 >= var5) {
                            return;
                        }
                        this.field4797 = var5 + var5 - 1 - this.field4797;
                        this.field4800 = -this.field4800;
                    }
                    while (true) {
                        int var11 = this.method2059(arg0, var9, var6, var10, var4.field5150[this.field4789 - 1]);
                        if (this.field4797 < var6) {
                            return;
                        }
                        this.field4797 = var6 + var6 - 1 - this.field4797;
                        this.field4800 = -this.field4800;
                        var9 = this.method2030(arg0, var11, var5, var10, var4.field5150[this.field4794]);
                        if (this.field4797 >= var5) {
                            return;
                        }
                        this.field4797 = var5 + var5 - 1 - this.field4797;
                        this.field4800 = -this.field4800;
                    }
                } else if (this.field4800 < 0) {
                    while (true) {
                        var9 = this.method2030(arg0, var9, var5, var10, var4.field5150[this.field4789 - 1]);
                        if (this.field4797 >= var5) {
                            return;
                        }
                        this.field4797 = var6 - 1 - (var6 - 1 - this.field4797) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2059(arg0, var9, var6, var10, var4.field5150[this.field4794]);
                        if (this.field4797 < var6) {
                            return;
                        }
                        this.field4797 = (this.field4797 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4801 > 0) {
                    if (this.field4799) {
                        label130: {
                            if (this.field4800 < 0) {
                                var9 = this.method2030(arg0, arg1, var5, var10, var4.field5150[this.field4794]);
                                if (this.field4797 >= var5) {
                                    return;
                                }
                                this.field4797 = var5 + var5 - 1 - this.field4797;
                                this.field4800 = -this.field4800;
                                if (--this.field4801 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2059(arg0, var9, var6, var10, var4.field5150[this.field4789 - 1]);
                                if (this.field4797 < var6) {
                                    return;
                                }
                                this.field4797 = var6 + var6 - 1 - this.field4797;
                                this.field4800 = -this.field4800;
                                if (--this.field4801 == 0) {
                                    break;
                                }
                                var9 = this.method2030(arg0, var9, var5, var10, var4.field5150[this.field4794]);
                                if (this.field4797 >= var5) {
                                    return;
                                }
                                this.field4797 = var5 + var5 - 1 - this.field4797;
                                this.field4800 = -this.field4800;
                            } while (--this.field4801 != 0);
                        }
                    } else if (this.field4800 < 0) {
                        while (true) {
                            var9 = this.method2030(arg0, var9, var5, var10, var4.field5150[this.field4789 - 1]);
                            if (this.field4797 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4797) / var8;
                            if (var12 >= this.field4801) {
                                this.field4797 += this.field4801 * var8;
                                this.field4801 = 0;
                                break;
                            }
                            this.field4797 += var8 * var12;
                            this.field4801 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2059(arg0, var9, var6, var10, var4.field5150[this.field4794]);
                            if (this.field4797 < var6) {
                                return;
                            }
                            int var13 = (this.field4797 - var5) / var8;
                            if (var13 >= this.field4801) {
                                this.field4797 -= this.field4801 * var8;
                                this.field4801 = 0;
                                break;
                            }
                            this.field4797 -= var8 * var13;
                            this.field4801 -= var13;
                        }
                    }
                }
                if (this.field4800 < 0) {
                    this.method2030(arg0, var9, 0, var10, 0);
                    if (this.field4797 < 0) {
                        this.field4797 = -1;
                        this.method2028();
                        this.method3045(true);
                        return;
                    }
                } else {
                    this.method2059(arg0, var9, var7, var10, 0);
                    if (this.field4797 >= var7) {
                        this.field4797 = var7;
                        this.method2028();
                        this.method3045(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V", line = 364)
    public final synchronized void method2023(int arg0) {
        this.method2031(this.method2040(), arg0);
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V", line = 371)
    public final synchronized void method2024(int arg0) {
        if (this.field4800 < 0) {
            this.field4800 = -arg0;
        } else {
            this.field4800 = arg0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)V", line = 379)
    public final synchronized void method2025(int arg0) {
        int var2 = ((class387) super.field6464).field5150.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4797 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "()I", line = 392)
    public final int method2026() {
        int var1 = this.field4790 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4801 == 0) {
            var2 -= this.field4797 * var2 / (((class387) super.field6464).field5150.length << 8);
        } else if (this.field4801 >= 0) {
            var2 -= this.field4794 * var2 / ((class387) super.field6464).field5150.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "()Z", line = 404)
    public final boolean method2027() {
        return this.field4796 != 0;
    }

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "()V", line = 409)
    private final void method2028() {
        if (this.field4796 != 0) {
            if (this.field4793 == Integer.MIN_VALUE) {
                this.field4793 = 0;
            }
            this.field4796 = 0;
            this.method2046();
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([B[IIIIIIILpp;)I", line = 423)
    private static final int method2029(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class360 arg8) {
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
        arg8.field4797 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([IIIII)I", line = 448)
    private final int method2030(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4796 <= 0) {
                if (this.field4800 == -256 && (this.field4797 & 255) == 0) {
                    if (class658.field9343) {
                        return method2039(0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, 0, arg3, arg2, this);
                    }
                    return method2032(((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, 0, arg3, arg2, this);
                }
                if (class658.field9343) {
                    return method2034(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, 0, arg3, arg2, this, this.field4800, arg4);
                }
                return method2035(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, 0, arg3, arg2, this, this.field4800, arg4);
            }
            int var6 = this.field4796 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4796 += arg1;
            if (this.field4800 == -256 && (this.field4797 & 255) == 0) {
                if (class658.field9343) {
                    arg1 = method2055(0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, this.field4792, this.field4788, 0, var6, arg2, this);
                } else {
                    arg1 = method2022(((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, this.field4795, 0, var6, arg2, this);
                }
            } else if (class658.field9343) {
                arg1 = method2056(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, this.field4792, this.field4788, 0, var6, arg2, this, this.field4800, arg4);
            } else {
                arg1 = method2042(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, this.field4795, 0, var6, arg2, this, this.field4800, arg4);
            }
            this.field4796 -= arg1;
            if (this.field4796 != 0) {
                return arg1;
            }
        } while (!this.method2052());
        return arg3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V", line = 503)
    private final synchronized void method2031(int arg0, int arg1) {
        this.field4793 = arg0;
        this.field4802 = arg1;
        this.field4796 = 0;
        this.method2046();
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "([B[IIIIIIILpp;)I", line = 509)
    private static final int method2032(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class360 arg8) {
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
        arg8.field4797 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)I", line = 535)
    private static final int method2033(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 539)
    public final synchronized void method1225(int arg0) {
        if (this.field4796 > 0) {
            if (arg0 >= this.field4796) {
                if (this.field4793 == Integer.MIN_VALUE) {
                    this.field4793 = 0;
                    this.field4790 = this.field4791 = this.field4798 = 0;
                    this.method3045(true);
                    arg0 = this.field4796;
                }
                this.field4796 = 0;
                this.method2046();
            } else {
                this.field4790 += this.field4795 * arg0;
                this.field4791 += this.field4792 * arg0;
                this.field4798 += this.field4788 * arg0;
                this.field4796 -= arg0;
            }
        }
        class387 var2 = (class387) super.field6464;
        int var3 = this.field4794 << 8;
        int var4 = this.field4789 << 8;
        int var5 = var2.field5150.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4801 = 0;
        }
        if (this.field4797 < 0) {
            if (this.field4800 <= 0) {
                this.method2028();
                this.method3045(true);
                return;
            }
            this.field4797 = 0;
        }
        if (this.field4797 >= var5) {
            if (this.field4800 >= 0) {
                this.method2028();
                this.method3045(true);
                return;
            }
            this.field4797 = var5 - 1;
        }
        this.field4797 += this.field4800 * arg0;
        if (this.field4801 < 0) {
            if (!this.field4799) {
                if (this.field4800 < 0) {
                    if (this.field4797 < var3) {
                        this.field4797 = var4 - 1 - (var4 - 1 - this.field4797) % var6;
                    }
                } else if (this.field4797 >= var4) {
                    this.field4797 = (this.field4797 - var3) % var6 + var3;
                }
            } else {
                if (this.field4800 < 0) {
                    if (this.field4797 >= var3) {
                        return;
                    }
                    this.field4797 = var3 + var3 - 1 - this.field4797;
                    this.field4800 = -this.field4800;
                }
                while (this.field4797 >= var4) {
                    this.field4797 = var4 + var4 - 1 - this.field4797;
                    this.field4800 = -this.field4800;
                    if (this.field4797 >= var3) {
                        return;
                    }
                    this.field4797 = var3 + var3 - 1 - this.field4797;
                    this.field4800 = -this.field4800;
                }
            }
        } else {
            if (this.field4801 > 0) {
                if (this.field4799) {
                    label125: {
                        if (this.field4800 < 0) {
                            if (this.field4797 >= var3) {
                                return;
                            }
                            this.field4797 = var3 + var3 - 1 - this.field4797;
                            this.field4800 = -this.field4800;
                            if (--this.field4801 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4797 < var4) {
                                return;
                            }
                            this.field4797 = var4 + var4 - 1 - this.field4797;
                            this.field4800 = -this.field4800;
                            if (--this.field4801 == 0) {
                                break;
                            }
                            if (this.field4797 >= var3) {
                                return;
                            }
                            this.field4797 = var3 + var3 - 1 - this.field4797;
                            this.field4800 = -this.field4800;
                        } while (--this.field4801 != 0);
                    }
                } else if (this.field4800 < 0) {
                    if (this.field4797 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4797) / var6;
                    if (var7 < this.field4801) {
                        this.field4797 += var6 * var7;
                        this.field4801 -= var7;
                        return;
                    }
                    this.field4797 += this.field4801 * var6;
                    this.field4801 = 0;
                } else {
                    if (this.field4797 < var4) {
                        return;
                    }
                    int var8 = (this.field4797 - var3) / var6;
                    if (var8 < this.field4801) {
                        this.field4797 -= var6 * var8;
                        this.field4801 -= var8;
                        return;
                    }
                    this.field4797 -= this.field4801 * var6;
                    this.field4801 = 0;
                }
            }
            if (this.field4800 < 0) {
                if (this.field4797 < 0) {
                    this.field4797 = -1;
                    this.method2028();
                    this.method3045(true);
                    return;
                }
            } else if (this.field4797 >= var5) {
                this.field4797 = var5;
                this.method2028();
                this.method3045(true);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[B[IIIIIIIILpp;II)I", line = 757)
    private static final int method2034(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class360 arg11, int arg12, int arg13) {
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
        arg11.field4797 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[B[IIIIIIILpp;II)I", line = 789)
    private static final int method2035(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class360 arg10, int arg11, int arg12) {
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
        arg10.field4797 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "(I)V", line = 816)
    public final synchronized void method2036(int arg0) {
        this.field4801 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "([B[IIIIIIIILpp;)I", line = 819)
    private static final int method2037(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class360 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4791 += (var14 - arg3) * arg9.field4792;
        arg9.field4798 += (var14 - arg3) * arg9.field4788;
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
        arg9.field4790 = var12 >> 2;
        arg9.field4797 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[B[IIIIIIIIIILpp;II)I", line = 853)
    private static final int method2038(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class360 arg13, int arg14, int arg15) {
        arg13.field4790 -= arg13.field4795 * arg5;
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
        arg13.field4790 += arg13.field4795 * var22;
        arg13.field4791 = arg6;
        arg13.field4798 = arg7;
        arg13.field4797 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I[B[IIIIIIIILpp;)I", line = 895)
    private static final int method2039(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class360 arg10) {
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
        arg10.field4797 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "()I", line = 933)
    public final synchronized int method2040() {
        return this.field4793 == Integer.MIN_VALUE ? 0 : this.field4793;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V", line = 936)
    public final synchronized void method2041(boolean arg0) {
        this.field4800 = (this.field4800 >>> 31) + (this.field4800 ^ this.field4800 >> 31);
        if (arg0) {
            this.field4800 = -this.field4800;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II[B[IIIIIIIILpp;II)I", line = 942)
    private static final int method2042(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class360 arg11, int arg12, int arg13) {
        arg11.field4791 -= arg11.field4792 * arg5;
        arg11.field4798 -= arg11.field4788 * arg5;
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
        arg11.field4791 += arg11.field4792 * arg5;
        arg11.field4798 += arg11.field4788 * arg5;
        arg11.field4790 = arg6;
        arg11.field4797 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II[B[IIIIIIILpp;II)I", line = 976)
    private static final int method2043(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class360 arg10, int arg11, int arg12) {
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
        arg10.field4797 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lep;III)Lpp;", line = 1002)
    public static final class360 method2044(class387 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5150 != null && arg0.field5150.length != 0 ? new class360(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "()I", line = 1008)
    public final synchronized int method2045() {
        return this.field4802 < 0 ? -1 : this.field4802;
    }

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "()V", line = 1011)
    private final void method2046() {
        this.field4790 = this.field4793;
        this.field4791 = method2033(this.field4793, this.field4802);
        this.field4798 = method2050(this.field4793, this.field4802);
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "()I", line = 1016)
    public final int method1223() {
        return this.field4793 == 0 && this.field4796 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "()Lmi;", line = 1022)
    public final class461 method1229() {
        return null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[B[IIIIIIIIIILpp;)I", line = 1025)
    private static final int method2047(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class360 arg12) {
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
        arg12.field4790 += (var19 - arg4) * arg12.field4795;
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
        arg12.field4791 = var15 >> 2;
        arg12.field4798 = var16 >> 2;
        arg12.field4797 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(II)V", line = 1079)
    public final synchronized void method2048(int arg0, int arg1) {
        this.method2057(arg0, arg1, this.method2045());
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "()Lmi;", line = 1082)
    public final class461 method1221() {
        return null;
    }

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "(I)V", line = 1086)
    private final synchronized void method2049(int arg0) {
        this.method2031(arg0, this.method2045());
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(II)I", line = 1090)
    private static final int method2050(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(II[B[IIIIIIIILpp;II)I", line = 1093)
    private static final int method2051(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class360 arg11, int arg12, int arg13) {
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
        arg11.field4797 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "()Z", line = 1127)
    private final boolean method2052() {
        int var1 = this.field4793;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2033(var1, this.field4802);
            var2 = method2050(var1, this.field4802);
        }
        if (this.field4790 == var1 && this.field4791 == var3 && this.field4798 == var2) {
            if (this.field4793 == Integer.MIN_VALUE) {
                this.field4793 = 0;
                this.field4790 = this.field4791 = this.field4798 = 0;
                this.method3045(true);
                return true;
            } else {
                this.method2046();
                return false;
            }
        } else {
            if (this.field4790 < var1) {
                this.field4795 = 1;
                this.field4796 = var1 - this.field4790;
            } else if (this.field4790 > var1) {
                this.field4795 = -1;
                this.field4796 = this.field4790 - var1;
            } else {
                this.field4795 = 0;
            }
            if (this.field4791 < var3) {
                this.field4792 = 1;
                if (this.field4796 == 0 || this.field4796 > var3 - this.field4791) {
                    this.field4796 = var3 - this.field4791;
                }
            } else if (this.field4791 > var3) {
                this.field4792 = -1;
                if (this.field4796 == 0 || this.field4796 > this.field4791 - var3) {
                    this.field4796 = this.field4791 - var3;
                }
            } else {
                this.field4792 = 0;
            }
            if (this.field4798 < var2) {
                this.field4788 = 1;
                if (this.field4796 == 0 || this.field4796 > var2 - this.field4798) {
                    this.field4796 = var2 - this.field4798;
                }
            } else if (this.field4798 > var2) {
                this.field4788 = -1;
                if (this.field4796 == 0 || this.field4796 > this.field4798 - var2) {
                    this.field4796 = this.field4798 - var2;
                }
            } else {
                this.field4788 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "()Z", line = 1212)
    public final boolean method2053() {
        return this.field4797 < 0 || this.field4797 >= ((class387) super.field6464).field5150.length << 8;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(II[B[IIIIIIIILpp;II)I", line = 1215)
    private static final int method2054(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class360 arg11, int arg12, int arg13) {
        arg11.field4791 -= arg11.field4792 * arg5;
        arg11.field4798 -= arg11.field4788 * arg5;
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
        arg11.field4791 += arg11.field4792 * arg5;
        arg11.field4798 += arg11.field4788 * arg5;
        arg11.field4790 = arg6;
        arg11.field4797 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I[B[IIIIIIIIIILpp;)I", line = 1248)
    private static final int method2055(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class360 arg12) {
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
        arg12.field4790 += (var19 - arg4) * arg12.field4795;
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
        arg12.field4791 = var15 >> 2;
        arg12.field4798 = var16 >> 2;
        arg12.field4797 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II[B[IIIIIIIIIILpp;II)I", line = 1306)
    private static final int method2056(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class360 arg13, int arg14, int arg15) {
        arg13.field4790 -= arg13.field4795 * arg5;
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
        arg13.field4790 += arg13.field4795 * var22;
        arg13.field4791 = arg6;
        arg13.field4798 = arg7;
        arg13.field4797 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V", line = 1347)
    public final synchronized void method2057(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2031(arg1, arg2);
        } else {
            int var4 = method2033(arg1, arg2);
            int var5 = method2050(arg1, arg2);
            if (this.field4791 == var4 && this.field4798 == var5) {
                this.field4796 = 0;
            } else {
                int var6 = arg1 - this.field4790;
                if (this.field4790 - arg1 > var6) {
                    var6 = this.field4790 - arg1;
                }
                if (var4 - this.field4791 > var6) {
                    var6 = var4 - this.field4791;
                }
                if (this.field4791 - var4 > var6) {
                    var6 = this.field4791 - var4;
                }
                if (var5 - this.field4798 > var6) {
                    var6 = var5 - this.field4798;
                }
                if (this.field4798 - var5 > var6) {
                    var6 = this.field4798 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4796 = arg0;
                this.field4793 = arg1;
                this.field4802 = arg2;
                this.field4795 = (arg1 - this.field4790) / arg0;
                this.field4792 = (var4 - this.field4791) / arg0;
                this.field4788 = (var5 - this.field4798) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "(I)V", line = 1396)
    public final synchronized void method2058(int arg0) {
        this.method2031(arg0 << 6, this.method2045());
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "([IIIII)I", line = 1399)
    private final int method2059(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4796 <= 0) {
                if (this.field4800 == 256 && (this.field4797 & 255) == 0) {
                    if (class658.field9343) {
                        return method2019(0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, 0, arg3, arg2, this);
                    }
                    return method2029(((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, 0, arg3, arg2, this);
                }
                if (class658.field9343) {
                    return method2051(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, 0, arg3, arg2, this, this.field4800, arg4);
                }
                return method2043(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, 0, arg3, arg2, this, this.field4800, arg4);
            }
            int var6 = this.field4796 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4796 += arg1;
            if (this.field4800 == 256 && (this.field4797 & 255) == 0) {
                if (class658.field9343) {
                    arg1 = method2047(0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, this.field4792, this.field4788, 0, var6, arg2, this);
                } else {
                    arg1 = method2037(((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, this.field4795, 0, var6, arg2, this);
                }
            } else if (class658.field9343) {
                arg1 = method2038(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4791, this.field4798, this.field4792, this.field4788, 0, var6, arg2, this, this.field4800, arg4);
            } else {
                arg1 = method2054(0, 0, ((class387) super.field6464).field5150, arg0, this.field4797, arg1, this.field4790, this.field4795, 0, var6, arg2, this, this.field4800, arg4);
            }
            this.field4796 -= arg1;
            if (this.field4796 != 0) {
                return arg1;
            }
        } while (!this.method2052());
        return arg3;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lep;III)V", line = 1456)
    private class360(class387 arg0, int arg1, int arg2, int arg3) {
        super.field6464 = arg0;
        this.field4794 = arg0.field5153;
        this.field4789 = arg0.field5154;
        this.field4799 = arg0.field5152;
        this.field4800 = arg1;
        this.field4793 = arg2;
        this.field4802 = arg3;
        this.field4797 = 0;
        this.method2046();
    }
}
