import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class380 extends class160 {

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    private int field5723;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    private int field5717;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Z")
    private boolean field5719;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    private int field5715;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    private int field5713;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    private int field5725;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field5724;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    private int field5714;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field5716;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private int field5720;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    private int field5721;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    private int field5722;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    private int field5726;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    private int field5727;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([III)V")
    public final synchronized void method1136(int[] arg0, int arg1, int arg2) {
        if (this.field5713 == 0 && this.field5718 == 0) {
            this.method1135(arg2);
        } else {
            class528 var4 = (class528) super.field2400;
            int var5 = this.field5723 << 8;
            int var6 = this.field5717 << 8;
            int var7 = var4.field7782.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field5720 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field5724 < 0) {
                if (this.field5715 <= 0) {
                    this.method2258();
                    this.method876((byte) -96);
                    return;
                }
                this.field5724 = 0;
            }
            if (this.field5724 >= var7) {
                if (this.field5715 >= 0) {
                    this.method2258();
                    this.method876((byte) -96);
                    return;
                }
                this.field5724 = var7 - 1;
            }
            if (this.field5720 < 0) {
                if (this.field5719) {
                    if (this.field5715 < 0) {
                        var9 = this.method2246(arg0, arg1, var5, var10, var4.field7782[this.field5723]);
                        if (this.field5724 >= var5) {
                            return;
                        }
                        this.field5724 = var5 + var5 - 1 - this.field5724;
                        this.field5715 = -this.field5715;
                    }
                    while (true) {
                        int var11 = this.method2278(arg0, var9, var6, var10, var4.field7782[this.field5717 - 1]);
                        if (this.field5724 < var6) {
                            return;
                        }
                        this.field5724 = var6 + var6 - 1 - this.field5724;
                        this.field5715 = -this.field5715;
                        var9 = this.method2246(arg0, var11, var5, var10, var4.field7782[this.field5723]);
                        if (this.field5724 >= var5) {
                            return;
                        }
                        this.field5724 = var5 + var5 - 1 - this.field5724;
                        this.field5715 = -this.field5715;
                    }
                } else if (this.field5715 < 0) {
                    while (true) {
                        var9 = this.method2246(arg0, var9, var5, var10, var4.field7782[this.field5717 - 1]);
                        if (this.field5724 >= var5) {
                            return;
                        }
                        this.field5724 = var6 - 1 - (var6 - 1 - this.field5724) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2278(arg0, var9, var6, var10, var4.field7782[this.field5723]);
                        if (this.field5724 < var6) {
                            return;
                        }
                        this.field5724 = (this.field5724 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field5720 > 0) {
                    if (this.field5719) {
                        label130: {
                            if (this.field5715 < 0) {
                                var9 = this.method2246(arg0, arg1, var5, var10, var4.field7782[this.field5723]);
                                if (this.field5724 >= var5) {
                                    return;
                                }
                                this.field5724 = var5 + var5 - 1 - this.field5724;
                                this.field5715 = -this.field5715;
                                if (--this.field5720 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2278(arg0, var9, var6, var10, var4.field7782[this.field5717 - 1]);
                                if (this.field5724 < var6) {
                                    return;
                                }
                                this.field5724 = var6 + var6 - 1 - this.field5724;
                                this.field5715 = -this.field5715;
                                if (--this.field5720 == 0) {
                                    break;
                                }
                                var9 = this.method2246(arg0, var9, var5, var10, var4.field7782[this.field5723]);
                                if (this.field5724 >= var5) {
                                    return;
                                }
                                this.field5724 = var5 + var5 - 1 - this.field5724;
                                this.field5715 = -this.field5715;
                            } while (--this.field5720 != 0);
                        }
                    } else if (this.field5715 < 0) {
                        while (true) {
                            var9 = this.method2246(arg0, var9, var5, var10, var4.field7782[this.field5717 - 1]);
                            if (this.field5724 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field5724) / var8;
                            if (var12 >= this.field5720) {
                                this.field5724 += this.field5720 * var8;
                                this.field5720 = 0;
                                break;
                            }
                            this.field5724 += var8 * var12;
                            this.field5720 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2278(arg0, var9, var6, var10, var4.field7782[this.field5723]);
                            if (this.field5724 < var6) {
                                return;
                            }
                            int var13 = (this.field5724 - var5) / var8;
                            if (var13 >= this.field5720) {
                                this.field5724 -= this.field5720 * var8;
                                this.field5720 = 0;
                                break;
                            }
                            this.field5724 -= var8 * var13;
                            this.field5720 -= var13;
                        }
                    }
                }
                if (this.field5715 < 0) {
                    this.method2246(arg0, var9, 0, var10, 0);
                    if (this.field5724 < 0) {
                        this.field5724 = -1;
                        this.method2258();
                        this.method876((byte) -96);
                        return;
                    }
                } else {
                    this.method2278(arg0, var9, var7, var10, 0);
                    if (this.field5724 >= var7) {
                        this.field5724 = var7;
                        this.method2258();
                        this.method876((byte) -96);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()Z")
    private final boolean method2241() {
        int var1 = this.field5713;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2260(var1, this.field5725);
            var2 = method2275(var1, this.field5725);
        }
        if (this.field5716 == var1 && this.field5727 == var3 && this.field5722 == var2) {
            if (this.field5713 == Integer.MIN_VALUE) {
                this.field5713 = 0;
                this.field5716 = this.field5727 = this.field5722 = 0;
                this.method876((byte) -96);
                return true;
            } else {
                this.method2256();
                return false;
            }
        } else {
            if (this.field5716 < var1) {
                this.field5714 = 1;
                this.field5718 = var1 - this.field5716;
            } else if (this.field5716 > var1) {
                this.field5714 = -1;
                this.field5718 = this.field5716 - var1;
            } else {
                this.field5714 = 0;
            }
            if (this.field5727 < var3) {
                this.field5726 = 1;
                if (this.field5718 == 0 || this.field5718 > var3 - this.field5727) {
                    this.field5718 = var3 - this.field5727;
                }
            } else if (this.field5727 > var3) {
                this.field5726 = -1;
                if (this.field5718 == 0 || this.field5718 > this.field5727 - var3) {
                    this.field5718 = this.field5727 - var3;
                }
            } else {
                this.field5726 = 0;
            }
            if (this.field5722 < var2) {
                this.field5721 = 1;
                if (this.field5718 == 0 || this.field5718 > var2 - this.field5722) {
                    this.field5718 = var2 - this.field5722;
                }
            } else if (this.field5722 > var2) {
                this.field5721 = -1;
                if (this.field5718 == 0 || this.field5718 > this.field5722 - var2) {
                    this.field5718 = this.field5722 - var2;
                }
            } else {
                this.field5721 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public final synchronized void method2242(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2272(arg1, arg2);
        } else {
            int var4 = method2260(arg1, arg2);
            int var5 = method2275(arg1, arg2);
            if (this.field5727 == var4 && this.field5722 == var5) {
                this.field5718 = 0;
            } else {
                int var6 = arg1 - this.field5716;
                if (this.field5716 - arg1 > var6) {
                    var6 = this.field5716 - arg1;
                }
                if (var4 - this.field5727 > var6) {
                    var6 = var4 - this.field5727;
                }
                if (this.field5727 - var4 > var6) {
                    var6 = this.field5727 - var4;
                }
                if (var5 - this.field5722 > var6) {
                    var6 = var5 - this.field5722;
                }
                if (this.field5722 - var5 > var6) {
                    var6 = this.field5722 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field5718 = arg0;
                this.field5713 = arg1;
                this.field5725 = arg2;
                this.field5714 = (arg1 - this.field5716) / arg0;
                this.field5726 = (var4 - this.field5727) / arg0;
                this.field5721 = (var5 - this.field5722) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llv;II)Ltd;")
    public static final class380 method2243(class528 arg0, int arg1, int arg2) {
        return arg0.field7782 != null && arg0.field7782.length != 0 ? new class380(arg0, (int) ((long) arg0.field7783 * 256L * (long) arg1 / (long) (class208.field3009 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final synchronized void method2244(boolean arg0) {
        this.field5715 = (this.field5715 >>> 31) + (this.field5715 ^ this.field5715 >> 31);
        if (arg0) {
            this.field5715 = -this.field5715;
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()I")
    public final synchronized int method2245() {
        return this.field5725 < 0 ? -1 : this.field5725;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()Lbs;")
    public final class160 method1137() {
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIII)I")
    private final int method2246(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5718 <= 0) {
                if (this.field5715 == -256 && (this.field5724 & 255) == 0) {
                    if (class116.field1749) {
                        return method2271(0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, 0, arg3, arg2, this);
                    }
                    return method2279(((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, 0, arg3, arg2, this);
                }
                if (class116.field1749) {
                    return method2254(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, 0, arg3, arg2, this, this.field5715, arg4);
                }
                return method2266(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, 0, arg3, arg2, this, this.field5715, arg4);
            }
            int var6 = this.field5718 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5718 += arg1;
            if (this.field5715 == -256 && (this.field5724 & 255) == 0) {
                if (class116.field1749) {
                    arg1 = method2262(0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, this.field5726, this.field5721, 0, var6, arg2, this);
                } else {
                    arg1 = method2267(((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, this.field5714, 0, var6, arg2, this);
                }
            } else if (class116.field1749) {
                arg1 = method2265(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, this.field5726, this.field5721, 0, var6, arg2, this, this.field5715, arg4);
            } else {
                arg1 = method2261(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, this.field5714, 0, var6, arg2, this, this.field5715, arg4);
            }
            this.field5718 -= arg1;
            if (this.field5718 != 0) {
                return arg1;
            }
        } while (!this.method2241());
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    private final synchronized void method2247(int arg0) {
        this.method2272(arg0, this.method2245());
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public final synchronized void method2248(int arg0) {
        this.method2272(arg0 << 6, this.method2245());
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B[IIIIIIIILtd;)I")
    private static final int method2249(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class380 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5727 += (var14 - arg3) * arg9.field5726;
        arg9.field5722 += (var14 - arg3) * arg9.field5721;
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
        arg9.field5716 = var12 >> 2;
        arg9.field5724 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()Lbs;")
    public final class160 method1131() {
        return null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llv;III)Ltd;")
    public static final class380 method2250(class528 arg0, int arg1, int arg2, int arg3) {
        return arg0.field7782 != null && arg0.field7782.length != 0 ? new class380(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public final synchronized void method2251(int arg0) {
        this.field5720 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B[IIIIIIIILtd;)I")
    private static final int method2252(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10) {
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
        arg10.field5724 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public final synchronized void method2253(int arg0) {
        if (arg0 == 0) {
            this.method2247(0);
            this.method876((byte) -96);
        } else if (this.field5727 == 0 && this.field5722 == 0) {
            this.field5718 = 0;
            this.field5713 = 0;
            this.field5716 = 0;
            this.method876((byte) -96);
        } else {
            int var2 = -this.field5716;
            if (this.field5716 > var2) {
                var2 = this.field5716;
            }
            if (-this.field5727 > var2) {
                var2 = -this.field5727;
            }
            if (this.field5727 > var2) {
                var2 = this.field5727;
            }
            if (-this.field5722 > var2) {
                var2 = -this.field5722;
            }
            if (this.field5722 > var2) {
                var2 = this.field5722;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5718 = arg0;
            this.field5713 = Integer.MIN_VALUE;
            this.field5714 = -this.field5716 / arg0;
            this.field5726 = -this.field5727 / arg0;
            this.field5721 = -this.field5722 / arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method2254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
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
        arg11.field5724 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method2255(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
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
        arg11.field5724 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
    private final void method2256() {
        this.field5716 = this.field5713;
        this.field5727 = method2260(this.field5713, this.field5725);
        this.field5722 = method2275(this.field5713, this.field5725);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method2257(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
        arg11.field5727 -= arg11.field5726 * arg5;
        arg11.field5722 -= arg11.field5721 * arg5;
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
        arg11.field5727 += arg11.field5726 * arg5;
        arg11.field5722 += arg11.field5721 * arg5;
        arg11.field5716 = arg6;
        arg11.field5724 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final synchronized void method1135(int arg0) {
        if (this.field5718 > 0) {
            if (arg0 >= this.field5718) {
                if (this.field5713 == Integer.MIN_VALUE) {
                    this.field5713 = 0;
                    this.field5716 = this.field5727 = this.field5722 = 0;
                    this.method876((byte) -96);
                    arg0 = this.field5718;
                }
                this.field5718 = 0;
                this.method2256();
            } else {
                this.field5716 += this.field5714 * arg0;
                this.field5727 += this.field5726 * arg0;
                this.field5722 += this.field5721 * arg0;
                this.field5718 -= arg0;
            }
        }
        class528 var2 = (class528) super.field2400;
        int var3 = this.field5723 << 8;
        int var4 = this.field5717 << 8;
        int var5 = var2.field7782.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5720 = 0;
        }
        if (this.field5724 < 0) {
            if (this.field5715 <= 0) {
                this.method2258();
                this.method876((byte) -96);
                return;
            }
            this.field5724 = 0;
        }
        if (this.field5724 >= var5) {
            if (this.field5715 >= 0) {
                this.method2258();
                this.method876((byte) -96);
                return;
            }
            this.field5724 = var5 - 1;
        }
        this.field5724 += this.field5715 * arg0;
        if (this.field5720 < 0) {
            if (!this.field5719) {
                if (this.field5715 < 0) {
                    if (this.field5724 < var3) {
                        this.field5724 = var4 - 1 - (var4 - 1 - this.field5724) % var6;
                    }
                } else if (this.field5724 >= var4) {
                    this.field5724 = (this.field5724 - var3) % var6 + var3;
                }
            } else {
                if (this.field5715 < 0) {
                    if (this.field5724 >= var3) {
                        return;
                    }
                    this.field5724 = var3 + var3 - 1 - this.field5724;
                    this.field5715 = -this.field5715;
                }
                while (this.field5724 >= var4) {
                    this.field5724 = var4 + var4 - 1 - this.field5724;
                    this.field5715 = -this.field5715;
                    if (this.field5724 >= var3) {
                        return;
                    }
                    this.field5724 = var3 + var3 - 1 - this.field5724;
                    this.field5715 = -this.field5715;
                }
            }
        } else {
            if (this.field5720 > 0) {
                if (this.field5719) {
                    label125: {
                        if (this.field5715 < 0) {
                            if (this.field5724 >= var3) {
                                return;
                            }
                            this.field5724 = var3 + var3 - 1 - this.field5724;
                            this.field5715 = -this.field5715;
                            if (--this.field5720 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field5724 < var4) {
                                return;
                            }
                            this.field5724 = var4 + var4 - 1 - this.field5724;
                            this.field5715 = -this.field5715;
                            if (--this.field5720 == 0) {
                                break;
                            }
                            if (this.field5724 >= var3) {
                                return;
                            }
                            this.field5724 = var3 + var3 - 1 - this.field5724;
                            this.field5715 = -this.field5715;
                        } while (--this.field5720 != 0);
                    }
                } else if (this.field5715 < 0) {
                    if (this.field5724 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field5724) / var6;
                    if (var7 < this.field5720) {
                        this.field5724 += var6 * var7;
                        this.field5720 -= var7;
                        return;
                    }
                    this.field5724 += this.field5720 * var6;
                    this.field5720 = 0;
                } else {
                    if (this.field5724 < var4) {
                        return;
                    }
                    int var8 = (this.field5724 - var3) / var6;
                    if (var8 < this.field5720) {
                        this.field5724 -= var6 * var8;
                        this.field5720 -= var8;
                        return;
                    }
                    this.field5724 -= this.field5720 * var6;
                    this.field5720 = 0;
                }
            }
            if (this.field5715 < 0) {
                if (this.field5724 < 0) {
                    this.field5724 = -1;
                    this.method2258();
                    this.method876((byte) -96);
                    return;
                }
            } else if (this.field5724 >= var5) {
                this.field5724 = var5;
                this.method2258();
                this.method876((byte) -96);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "()V")
    private final void method2258() {
        if (this.field5718 != 0) {
            if (this.field5713 == Integer.MIN_VALUE) {
                this.field5713 = 0;
            }
            this.field5718 = 0;
            this.method2256();
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public final synchronized void method2259(int arg0) {
        int var2 = ((class528) super.field2400).field7782.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5724 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    private static final int method2260(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II[B[IIIIIIIILtd;II)I")
    private static final int method2261(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class380 arg11, int arg12, int arg13) {
        arg11.field5727 -= arg11.field5726 * arg5;
        arg11.field5722 -= arg11.field5721 * arg5;
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
        arg11.field5727 += arg11.field5726 * arg5;
        arg11.field5722 += arg11.field5721 * arg5;
        arg11.field5716 = arg6;
        arg11.field5724 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B[IIIIIIIIIILtd;)I")
    private static final int method2262(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class380 arg12) {
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
        arg12.field5716 += (var19 - arg4) * arg12.field5714;
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
        arg12.field5727 = var15 >> 2;
        arg12.field5722 = var16 >> 2;
        arg12.field5724 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIILtd;II)I")
    private static final int method2263(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10, int arg11, int arg12) {
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
        arg10.field5724 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "()I")
    public final synchronized int method2264() {
        return this.field5715 < 0 ? -this.field5715 : this.field5715;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public final int method1132() {
        int var1 = this.field5716 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5720 == 0) {
            var2 -= this.field5724 * var2 / (((class528) super.field2400).field7782.length << 8);
        } else if (this.field5720 >= 0) {
            var2 -= this.field5723 * var2 / ((class528) super.field2400).field7782.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[B[IIIIIIIIIILtd;II)I")
    private static final int method2265(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class380 arg13, int arg14, int arg15) {
        arg13.field5716 -= arg13.field5714 * arg5;
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
        arg13.field5716 += arg13.field5714 * var22;
        arg13.field5727 = arg6;
        arg13.field5722 = arg7;
        arg13.field5724 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIILtd;II)I")
    private static final int method2266(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10, int arg11, int arg12) {
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
        arg10.field5724 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B[IIIIIIIILtd;)I")
    private static final int method2267(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class380 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5727 += (var14 - arg3) * arg9.field5726;
        arg9.field5722 += (var14 - arg3) * arg9.field5721;
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
        arg9.field5716 = var12 >> 2;
        arg9.field5724 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I[B[IIIIIIIIIILtd;)I")
    private static final int method2268(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class380 arg12) {
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
        arg12.field5716 += (var19 - arg4) * arg12.field5714;
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
        arg12.field5727 = var15 >> 2;
        arg12.field5722 = var16 >> 2;
        arg12.field5724 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "()Z")
    public final boolean method2269() {
        return this.field5724 < 0 || this.field5724 >= ((class528) super.field2400).field7782.length << 8;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II[B[IIIIIIIIIILtd;II)I")
    private static final int method2270(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class380 arg13, int arg14, int arg15) {
        arg13.field5716 -= arg13.field5714 * arg5;
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
        arg13.field5716 += arg13.field5714 * var22;
        arg13.field5727 = arg6;
        arg13.field5722 = arg7;
        arg13.field5724 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I[B[IIIIIIIILtd;)I")
    private static final int method2271(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class380 arg10) {
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
        arg10.field5724 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V")
    private final synchronized void method2272(int arg0, int arg1) {
        this.field5713 = arg0;
        this.field5725 = arg1;
        this.field5718 = 0;
        this.method2256();
    }

    @OriginalMember(owner = "client!td", name = "k", descriptor = "()I")
    public final synchronized int method2273() {
        return this.field5713 == Integer.MIN_VALUE ? 0 : this.field5713;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B[IIIIIIILtd;)I")
    private static final int method2274(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class380 arg8) {
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
        arg8.field5724 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)I")
    private static final int method2275(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II)V")
    public final synchronized void method2276(int arg0, int arg1) {
        this.method2242(arg0, arg1, this.method2245());
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    public final synchronized void method2277(int arg0) {
        if (this.field5715 < 0) {
            this.field5715 = -arg0;
        } else {
            this.field5715 = arg0;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([IIIII)I")
    private final int method2278(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field5718 <= 0) {
                if (this.field5715 == 256 && (this.field5724 & 255) == 0) {
                    if (class116.field1749) {
                        return method2252(0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, 0, arg3, arg2, this);
                    }
                    return method2274(((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, 0, arg3, arg2, this);
                }
                if (class116.field1749) {
                    return method2255(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, 0, arg3, arg2, this, this.field5715, arg4);
                }
                return method2263(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, 0, arg3, arg2, this, this.field5715, arg4);
            }
            int var6 = this.field5718 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field5718 += arg1;
            if (this.field5715 == 256 && (this.field5724 & 255) == 0) {
                if (class116.field1749) {
                    arg1 = method2268(0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, this.field5726, this.field5721, 0, var6, arg2, this);
                } else {
                    arg1 = method2249(((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, this.field5714, 0, var6, arg2, this);
                }
            } else if (class116.field1749) {
                arg1 = method2270(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5727, this.field5722, this.field5726, this.field5721, 0, var6, arg2, this, this.field5715, arg4);
            } else {
                arg1 = method2257(0, 0, ((class528) super.field2400).field7782, arg0, this.field5724, arg1, this.field5716, this.field5714, 0, var6, arg2, this, this.field5715, arg4);
            }
            this.field5718 -= arg1;
            if (this.field5718 != 0) {
                return arg1;
            }
        } while (!this.method2241());
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "([B[IIIIIIILtd;)I")
    private static final int method2279(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class380 arg8) {
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
        arg8.field5724 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!td", name = "l", descriptor = "()Z")
    public final boolean method2280() {
        return this.field5718 != 0;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Llv;II)V")
    private class380(class528 arg0, int arg1, int arg2) {
        super.field2400 = arg0;
        this.field5723 = arg0.field7781;
        this.field5717 = arg0.field7784;
        this.field5719 = arg0.field7785;
        this.field5715 = arg1;
        this.field5713 = arg2;
        this.field5725 = 8192;
        this.field5724 = 0;
        this.method2256();
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
    public final int method1134() {
        return this.field5713 == 0 && this.field5718 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Llv;III)V")
    private class380(class528 arg0, int arg1, int arg2, int arg3) {
        super.field2400 = arg0;
        this.field5723 = arg0.field7781;
        this.field5717 = arg0.field7784;
        this.field5719 = arg0.field7785;
        this.field5715 = arg1;
        this.field5713 = arg2;
        this.field5725 = arg3;
        this.field5724 = 0;
        this.method2256();
    }
}
