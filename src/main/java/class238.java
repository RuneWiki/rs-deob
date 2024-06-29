import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class238 extends class136 {

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    private int field4113;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "Z")
    private boolean field4107;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    private int field4106;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    private int field4099;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    private int field4103;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    private int field4109;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    private int field4112;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([III)V")
    public final synchronized void method775(int[] arg0, int arg1, int arg2) {
        if (this.field4106 == 0 && this.field4103 == 0) {
            this.method795(arg2);
        } else {
            class126 var4 = (class126) super.field2375;
            int var5 = this.field4102 << 8;
            int var6 = this.field4113 << 8;
            int var7 = var4.field2211.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4108 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4100 < 0) {
                if (this.field4105 <= 0) {
                    this.method1597();
                    this.method1753(137);
                    return;
                }
                this.field4100 = 0;
            }
            if (this.field4100 >= var7) {
                if (this.field4105 >= 0) {
                    this.method1597();
                    this.method1753(137);
                    return;
                }
                this.field4100 = var7 - 1;
            }
            if (this.field4108 < 0) {
                if (this.field4107) {
                    if (this.field4105 < 0) {
                        var9 = this.method1606(arg0, arg1, var5, var10, var4.field2211[this.field4102]);
                        if (this.field4100 >= var5) {
                            return;
                        }
                        this.field4100 = var5 + var5 - 1 - this.field4100;
                        this.field4105 = -this.field4105;
                    }
                    while (true) {
                        int var11 = this.method1625(arg0, var9, var6, var10, var4.field2211[this.field4113 - 1]);
                        if (this.field4100 < var6) {
                            return;
                        }
                        this.field4100 = var6 + var6 - 1 - this.field4100;
                        this.field4105 = -this.field4105;
                        var9 = this.method1606(arg0, var11, var5, var10, var4.field2211[this.field4102]);
                        if (this.field4100 >= var5) {
                            return;
                        }
                        this.field4100 = var5 + var5 - 1 - this.field4100;
                        this.field4105 = -this.field4105;
                    }
                } else if (this.field4105 < 0) {
                    while (true) {
                        var9 = this.method1606(arg0, var9, var5, var10, var4.field2211[this.field4113 - 1]);
                        if (this.field4100 >= var5) {
                            return;
                        }
                        this.field4100 = var6 - 1 - (var6 - 1 - this.field4100) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1625(arg0, var9, var6, var10, var4.field2211[this.field4102]);
                        if (this.field4100 < var6) {
                            return;
                        }
                        this.field4100 = (this.field4100 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4108 > 0) {
                    if (this.field4107) {
                        label130: {
                            if (this.field4105 < 0) {
                                var9 = this.method1606(arg0, arg1, var5, var10, var4.field2211[this.field4102]);
                                if (this.field4100 >= var5) {
                                    return;
                                }
                                this.field4100 = var5 + var5 - 1 - this.field4100;
                                this.field4105 = -this.field4105;
                                if (--this.field4108 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1625(arg0, var9, var6, var10, var4.field2211[this.field4113 - 1]);
                                if (this.field4100 < var6) {
                                    return;
                                }
                                this.field4100 = var6 + var6 - 1 - this.field4100;
                                this.field4105 = -this.field4105;
                                if (--this.field4108 == 0) {
                                    break;
                                }
                                var9 = this.method1606(arg0, var9, var5, var10, var4.field2211[this.field4102]);
                                if (this.field4100 >= var5) {
                                    return;
                                }
                                this.field4100 = var5 + var5 - 1 - this.field4100;
                                this.field4105 = -this.field4105;
                            } while (--this.field4108 != 0);
                        }
                    } else if (this.field4105 < 0) {
                        while (true) {
                            var9 = this.method1606(arg0, var9, var5, var10, var4.field2211[this.field4113 - 1]);
                            if (this.field4100 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4100) / var8;
                            if (var12 >= this.field4108) {
                                this.field4100 += this.field4108 * var8;
                                this.field4108 = 0;
                                break;
                            }
                            this.field4100 += var8 * var12;
                            this.field4108 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1625(arg0, var9, var6, var10, var4.field2211[this.field4102]);
                            if (this.field4100 < var6) {
                                return;
                            }
                            int var13 = (this.field4100 - var5) / var8;
                            if (var13 >= this.field4108) {
                                this.field4100 -= this.field4108 * var8;
                                this.field4108 = 0;
                                break;
                            }
                            this.field4100 -= var8 * var13;
                            this.field4108 -= var13;
                        }
                    }
                }
                if (this.field4105 < 0) {
                    this.method1606(arg0, var9, 0, var10, 0);
                    if (this.field4100 < 0) {
                        this.field4100 = -1;
                        this.method1597();
                        this.method1753(137);
                        return;
                    }
                } else {
                    this.method1625(arg0, var9, var7, var10, 0);
                    if (this.field4100 >= var7) {
                        this.field4100 = var7;
                        this.method1597();
                        this.method1753(137);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public final synchronized void method1586(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1621(arg1, arg2);
        } else {
            int var4 = method1611(arg1, arg2);
            int var5 = method1614(arg1, arg2);
            if (this.field4101 == var4 && this.field4111 == var5) {
                this.field4103 = 0;
            } else {
                int var6 = arg1 - this.field4109;
                if (this.field4109 - arg1 > var6) {
                    var6 = this.field4109 - arg1;
                }
                if (var4 - this.field4101 > var6) {
                    var6 = var4 - this.field4101;
                }
                if (this.field4101 - var4 > var6) {
                    var6 = this.field4101 - var4;
                }
                if (var5 - this.field4111 > var6) {
                    var6 = var5 - this.field4111;
                }
                if (this.field4111 - var5 > var6) {
                    var6 = this.field4111 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4103 = arg0;
                this.field4106 = arg1;
                this.field4104 = arg2;
                this.field4112 = (arg1 - this.field4109) / arg0;
                this.field4099 = (var4 - this.field4101) / arg0;
                this.field4110 = (var5 - this.field4111) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[B[IIIIIIIILfj;II)I")
    private static final int method1587(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
        arg11.field4101 -= arg11.field4099 * arg5;
        arg11.field4111 -= arg11.field4110 * arg5;
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
        arg11.field4101 += arg11.field4099 * arg5;
        arg11.field4111 += arg11.field4110 * arg5;
        arg11.field4109 = arg6;
        arg11.field4100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[B[IIIIIIIILfj;)I")
    private static final int method1588(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10) {
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
        arg10.field4100 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II[B[IIIIIIIILfj;II)I")
    private static final int method1589(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
        arg11.field4101 -= arg11.field4099 * arg5;
        arg11.field4111 -= arg11.field4110 * arg5;
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
        arg11.field4101 += arg11.field4099 * arg5;
        arg11.field4111 += arg11.field4110 * arg5;
        arg11.field4109 = arg6;
        arg11.field4100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "()Z")
    public final boolean method1590() {
        return this.field4103 != 0;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "()I")
    public final synchronized int method1591() {
        return this.field4106 == Integer.MIN_VALUE ? 0 : this.field4106;
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "()V")
    private final void method1592() {
        this.field4109 = this.field4106;
        this.field4101 = method1611(this.field4106, this.field4104);
        this.field4111 = method1614(this.field4106, this.field4104);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([B[IIIIIIILfj;)I")
    private static final int method1593(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class238 arg8) {
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
        arg8.field4100 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "()Z")
    private final boolean method1594() {
        int var1 = this.field4106;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1611(var1, this.field4104);
            var2 = method1614(var1, this.field4104);
        }
        if (this.field4109 == var1 && this.field4101 == var3 && this.field4111 == var2) {
            if (this.field4106 == Integer.MIN_VALUE) {
                this.field4106 = 0;
                this.field4109 = this.field4101 = this.field4111 = 0;
                this.method1753(137);
                return true;
            } else {
                this.method1592();
                return false;
            }
        } else {
            if (this.field4109 < var1) {
                this.field4112 = 1;
                this.field4103 = var1 - this.field4109;
            } else if (this.field4109 > var1) {
                this.field4112 = -1;
                this.field4103 = this.field4109 - var1;
            } else {
                this.field4112 = 0;
            }
            if (this.field4101 < var3) {
                this.field4099 = 1;
                if (this.field4103 == 0 || this.field4103 > var3 - this.field4101) {
                    this.field4103 = var3 - this.field4101;
                }
            } else if (this.field4101 > var3) {
                this.field4099 = -1;
                if (this.field4103 == 0 || this.field4103 > this.field4101 - var3) {
                    this.field4103 = this.field4101 - var3;
                }
            } else {
                this.field4099 = 0;
            }
            if (this.field4111 < var2) {
                this.field4110 = 1;
                if (this.field4103 == 0 || this.field4103 > var2 - this.field4111) {
                    this.field4103 = var2 - this.field4111;
                }
            } else if (this.field4111 > var2) {
                this.field4110 = -1;
                if (this.field4103 == 0 || this.field4103 > this.field4111 - var2) {
                    this.field4103 = this.field4111 - var2;
                }
            } else {
                this.field4110 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public final synchronized void method1595(int arg0) {
        this.method1621(arg0 << 6, this.method1613());
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([B[IIIIIIIILfj;)I")
    private static final int method1596(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class238 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4101 += (var14 - arg3) * arg9.field4099;
        arg9.field4111 += (var14 - arg3) * arg9.field4110;
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
        arg9.field4109 = var12 >> 2;
        arg9.field4100 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "()V")
    private final void method1597() {
        if (this.field4103 != 0) {
            if (this.field4106 == Integer.MIN_VALUE) {
                this.field4106 = 0;
            }
            this.field4103 = 0;
            this.method1592();
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Llb;II)Lfj;")
    public static final class238 method1598(class126 arg0, int arg1, int arg2) {
        return arg0.field2211 != null && arg0.field2211.length != 0 ? new class238(arg0, (int) ((long) arg0.field2215 * 256L * (long) arg1 / (long) (class159.field2706 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "()I")
    public final int method764() {
        return this.field4106 == 0 && this.field4103 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public final synchronized void method1599(boolean arg0) {
        this.field4105 = (this.field4105 >>> 31) + (this.field4105 ^ this.field4105 >> 31);
        if (arg0) {
            this.field4105 = -this.field4105;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public final synchronized void method1600(int arg0, int arg1) {
        this.method1586(arg0, arg1, this.method1613());
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([B[IIIIIIIILfj;)I")
    private static final int method1601(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class238 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4101 += (var14 - arg3) * arg9.field4099;
        arg9.field4111 += (var14 - arg3) * arg9.field4110;
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
        arg9.field4109 = var12 >> 2;
        arg9.field4100 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    public final synchronized void method1602(int arg0) {
        this.field4108 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I[B[IIIIIIIILfj;)I")
    private static final int method1603(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10) {
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
        arg10.field4100 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
    public final synchronized void method1604(int arg0) {
        if (arg0 == 0) {
            this.method1617(0);
            this.method1753(137);
        } else if (this.field4101 == 0 && this.field4111 == 0) {
            this.field4103 = 0;
            this.field4106 = 0;
            this.field4109 = 0;
            this.method1753(137);
        } else {
            int var2 = -this.field4109;
            if (this.field4109 > var2) {
                var2 = this.field4109;
            }
            if (-this.field4101 > var2) {
                var2 = -this.field4101;
            }
            if (this.field4101 > var2) {
                var2 = this.field4101;
            }
            if (-this.field4111 > var2) {
                var2 = -this.field4111;
            }
            if (this.field4111 > var2) {
                var2 = this.field4111;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4103 = arg0;
            this.field4106 = Integer.MIN_VALUE;
            this.field4112 = -this.field4109 / arg0;
            this.field4099 = -this.field4101 / arg0;
            this.field4110 = -this.field4111 / arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "()I")
    public final synchronized int method1605() {
        return this.field4105 < 0 ? -this.field4105 : this.field4105;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([IIIII)I")
    private final int method1606(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4103 <= 0) {
                if (this.field4105 == -256 && (this.field4100 & 255) == 0) {
                    if (class256.field4568) {
                        return method1588(0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, 0, arg3, arg2, this);
                    }
                    return method1593(((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, 0, arg3, arg2, this);
                }
                if (class256.field4568) {
                    return method1623(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, 0, arg3, arg2, this, this.field4105, arg4);
                }
                return method1622(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, 0, arg3, arg2, this, this.field4105, arg4);
            }
            int var6 = this.field4103 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4103 += arg1;
            if (this.field4105 == -256 && (this.field4100 & 255) == 0) {
                if (class256.field4568) {
                    arg1 = method1610(0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, this.field4099, this.field4110, 0, var6, arg2, this);
                } else {
                    arg1 = method1601(((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, this.field4112, 0, var6, arg2, this);
                }
            } else if (class256.field4568) {
                arg1 = method1608(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, this.field4099, this.field4110, 0, var6, arg2, this, this.field4105, arg4);
            } else {
                arg1 = method1587(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, this.field4112, 0, var6, arg2, this, this.field4105, arg4);
            }
            this.field4103 -= arg1;
            if (this.field4103 != 0) {
                return arg1;
            }
        } while (!this.method1594());
        return arg3;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V")
    public final synchronized void method1607(int arg0) {
        if (this.field4105 < 0) {
            this.field4105 = -arg0;
        } else {
            this.field4105 = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[B[IIIIIIIIIILfj;II)I")
    private static final int method1608(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class238 arg13, int arg14, int arg15) {
        arg13.field4109 -= arg13.field4112 * arg5;
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
        arg13.field4109 += arg13.field4112 * var22;
        arg13.field4101 = arg6;
        arg13.field4111 = arg7;
        arg13.field4100 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "()I")
    public final int method905() {
        int var1 = this.field4109 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4108 == 0) {
            var2 -= this.field4100 * var2 / (((class126) super.field2375).field2211.length << 8);
        } else if (this.field4108 >= 0) {
            var2 -= this.field4102 * var2 / ((class126) super.field2375).field2211.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "(I)V")
    public final synchronized void method1609(int arg0) {
        int var2 = ((class126) super.field2375).field2211.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4100 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[B[IIIIIIIIIILfj;)I")
    private static final int method1610(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class238 arg12) {
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
        arg12.field4109 += (var19 - arg4) * arg12.field4112;
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
        arg12.field4101 = var15 >> 2;
        arg12.field4111 = var16 >> 2;
        arg12.field4100 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)I")
    private static final int method1611(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "()Z")
    public final boolean method1612() {
        return this.field4100 < 0 || this.field4100 >= ((class126) super.field2375).field2211.length << 8;
    }

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "()I")
    public final synchronized int method1613() {
        return this.field4104 < 0 ? -1 : this.field4104;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)I")
    private static final int method1614(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()Ldg;")
    public final class136 method791() {
        return null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[B[IIIIIIILfj;II)I")
    private static final int method1615(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10, int arg11, int arg12) {
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
        arg10.field4100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public final synchronized void method795(int arg0) {
        if (this.field4103 > 0) {
            if (arg0 >= this.field4103) {
                if (this.field4106 == Integer.MIN_VALUE) {
                    this.field4106 = 0;
                    this.field4109 = this.field4101 = this.field4111 = 0;
                    this.method1753(137);
                    arg0 = this.field4103;
                }
                this.field4103 = 0;
                this.method1592();
            } else {
                this.field4109 += this.field4112 * arg0;
                this.field4101 += this.field4099 * arg0;
                this.field4111 += this.field4110 * arg0;
                this.field4103 -= arg0;
            }
        }
        class126 var2 = (class126) super.field2375;
        int var3 = this.field4102 << 8;
        int var4 = this.field4113 << 8;
        int var5 = var2.field2211.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4108 = 0;
        }
        if (this.field4100 < 0) {
            if (this.field4105 <= 0) {
                this.method1597();
                this.method1753(137);
                return;
            }
            this.field4100 = 0;
        }
        if (this.field4100 >= var5) {
            if (this.field4105 >= 0) {
                this.method1597();
                this.method1753(137);
                return;
            }
            this.field4100 = var5 - 1;
        }
        this.field4100 += this.field4105 * arg0;
        if (this.field4108 < 0) {
            if (!this.field4107) {
                if (this.field4105 < 0) {
                    if (this.field4100 < var3) {
                        this.field4100 = var4 - 1 - (var4 - 1 - this.field4100) % var6;
                    }
                } else if (this.field4100 >= var4) {
                    this.field4100 = (this.field4100 - var3) % var6 + var3;
                }
            } else {
                if (this.field4105 < 0) {
                    if (this.field4100 >= var3) {
                        return;
                    }
                    this.field4100 = var3 + var3 - 1 - this.field4100;
                    this.field4105 = -this.field4105;
                }
                while (this.field4100 >= var4) {
                    this.field4100 = var4 + var4 - 1 - this.field4100;
                    this.field4105 = -this.field4105;
                    if (this.field4100 >= var3) {
                        return;
                    }
                    this.field4100 = var3 + var3 - 1 - this.field4100;
                    this.field4105 = -this.field4105;
                }
            }
        } else {
            if (this.field4108 > 0) {
                if (this.field4107) {
                    label125: {
                        if (this.field4105 < 0) {
                            if (this.field4100 >= var3) {
                                return;
                            }
                            this.field4100 = var3 + var3 - 1 - this.field4100;
                            this.field4105 = -this.field4105;
                            if (--this.field4108 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4100 < var4) {
                                return;
                            }
                            this.field4100 = var4 + var4 - 1 - this.field4100;
                            this.field4105 = -this.field4105;
                            if (--this.field4108 == 0) {
                                break;
                            }
                            if (this.field4100 >= var3) {
                                return;
                            }
                            this.field4100 = var3 + var3 - 1 - this.field4100;
                            this.field4105 = -this.field4105;
                        } while (--this.field4108 != 0);
                    }
                } else if (this.field4105 < 0) {
                    if (this.field4100 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4100) / var6;
                    if (var7 < this.field4108) {
                        this.field4100 += var6 * var7;
                        this.field4108 -= var7;
                        return;
                    }
                    this.field4100 += this.field4108 * var6;
                    this.field4108 = 0;
                } else {
                    if (this.field4100 < var4) {
                        return;
                    }
                    int var8 = (this.field4100 - var3) / var6;
                    if (var8 < this.field4108) {
                        this.field4100 -= var6 * var8;
                        this.field4108 -= var8;
                        return;
                    }
                    this.field4100 -= this.field4108 * var6;
                    this.field4108 = 0;
                }
            }
            if (this.field4105 < 0) {
                if (this.field4100 < 0) {
                    this.field4100 = -1;
                    this.method1597();
                    this.method1753(137);
                    return;
                }
            } else if (this.field4100 >= var5) {
                this.field4100 = var5;
                this.method1597();
                this.method1753(137);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([B[IIIIIIILfj;)I")
    private static final int method1616(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class238 arg8) {
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
        arg8.field4100 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "(I)V")
    private final synchronized void method1617(int arg0) {
        this.method1621(arg0, this.method1613());
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I[B[IIIIIIIIIILfj;)I")
    private static final int method1618(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class238 arg12) {
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
        arg12.field4109 += (var19 - arg4) * arg12.field4112;
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
        arg12.field4101 = var15 >> 2;
        arg12.field4111 = var16 >> 2;
        arg12.field4100 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Llb;III)Lfj;")
    public static final class238 method1619(class126 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2211 != null && arg0.field2211.length != 0 ? new class238(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II[B[IIIIIIIIIILfj;II)I")
    private static final int method1620(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class238 arg13, int arg14, int arg15) {
        arg13.field4109 -= arg13.field4112 * arg5;
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
        arg13.field4109 += arg13.field4112 * var22;
        arg13.field4101 = arg6;
        arg13.field4111 = arg7;
        arg13.field4100 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(II)V")
    private final synchronized void method1621(int arg0, int arg1) {
        this.field4106 = arg0;
        this.field4104 = arg1;
        this.field4103 = 0;
        this.method1592();
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II[B[IIIIIIILfj;II)I")
    private static final int method1622(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class238 arg10, int arg11, int arg12) {
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
        arg10.field4100 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II[B[IIIIIIIILfj;II)I")
    private static final int method1623(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
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
        arg11.field4100 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()Ldg;")
    public final class136 method780() {
        return null;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(II[B[IIIIIIIILfj;II)I")
    private static final int method1624(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class238 arg11, int arg12, int arg13) {
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
        arg11.field4100 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "([IIIII)I")
    private final int method1625(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4103 <= 0) {
                if (this.field4105 == 256 && (this.field4100 & 255) == 0) {
                    if (class256.field4568) {
                        return method1603(0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, 0, arg3, arg2, this);
                    }
                    return method1616(((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, 0, arg3, arg2, this);
                }
                if (class256.field4568) {
                    return method1624(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, 0, arg3, arg2, this, this.field4105, arg4);
                }
                return method1615(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, 0, arg3, arg2, this, this.field4105, arg4);
            }
            int var6 = this.field4103 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4103 += arg1;
            if (this.field4105 == 256 && (this.field4100 & 255) == 0) {
                if (class256.field4568) {
                    arg1 = method1618(0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, this.field4099, this.field4110, 0, var6, arg2, this);
                } else {
                    arg1 = method1596(((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, this.field4112, 0, var6, arg2, this);
                }
            } else if (class256.field4568) {
                arg1 = method1620(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4101, this.field4111, this.field4099, this.field4110, 0, var6, arg2, this, this.field4105, arg4);
            } else {
                arg1 = method1589(0, 0, ((class126) super.field2375).field2211, arg0, this.field4100, arg1, this.field4109, this.field4112, 0, var6, arg2, this, this.field4105, arg4);
            }
            this.field4103 -= arg1;
            if (this.field4103 != 0) {
                return arg1;
            }
        } while (!this.method1594());
        return arg3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Llb;II)V")
    private class238(class126 arg0, int arg1, int arg2) {
        super.field2375 = arg0;
        this.field4102 = arg0.field2212;
        this.field4113 = arg0.field2213;
        this.field4107 = arg0.field2214;
        this.field4105 = arg1;
        this.field4106 = arg2;
        this.field4104 = 8192;
        this.field4100 = 0;
        this.method1592();
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Llb;III)V")
    private class238(class126 arg0, int arg1, int arg2, int arg3) {
        super.field2375 = arg0;
        this.field4102 = arg0.field2212;
        this.field4113 = arg0.field2213;
        this.field4107 = arg0.field2214;
        this.field4105 = arg1;
        this.field4106 = arg2;
        this.field4104 = arg3;
        this.field4100 = 0;
        this.method1592();
    }
}
