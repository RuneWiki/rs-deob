import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class444 extends class29 {

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    private int field6540;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Z")
    private boolean field6553;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    private int field6547;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    private int field6548;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    private int field6546;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    private int field6554;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private int field6541;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    private int field6542;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    private int field6543;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    private int field6544;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    private int field6545;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    private int field6550;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    private int field6551;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[B[IIIIIIILsj;II)I")
    private static final int method2710(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class444 arg10, int arg11, int arg12) {
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
        arg10.field6554 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[B[IIIIIIIILsj;II)I")
    private static final int method2711(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class444 arg11, int arg12, int arg13) {
        arg11.field6550 -= arg11.field6551 * arg5;
        arg11.field6544 -= arg11.field6549 * arg5;
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
        arg11.field6550 += arg11.field6551 * arg5;
        arg11.field6544 += arg11.field6549 * arg5;
        arg11.field6541 = arg6;
        arg11.field6554 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "()V")
    private final void method2712() {
        this.field6541 = this.field6548;
        this.field6550 = method2732(this.field6548, this.field6546);
        this.field6544 = method2742(this.field6548, this.field6546);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([III)V")
    public final synchronized void method167(int[] arg0, int arg1, int arg2) {
        if (this.field6548 == 0 && this.field6542 == 0) {
            this.method168(arg2);
        } else {
            class2 var4 = (class2) super.field369;
            int var5 = this.field6552 << 8;
            int var6 = this.field6540 << 8;
            int var7 = var4.field26.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6543 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6554 < 0) {
                if (this.field6547 <= 0) {
                    this.method2747();
                    this.method625((byte) -50);
                    return;
                }
                this.field6554 = 0;
            }
            if (this.field6554 >= var7) {
                if (this.field6547 >= 0) {
                    this.method2747();
                    this.method625((byte) -50);
                    return;
                }
                this.field6554 = var7 - 1;
            }
            if (this.field6543 < 0) {
                if (this.field6553) {
                    if (this.field6547 < 0) {
                        var9 = this.method2728(arg0, arg1, var5, var10, var4.field26[this.field6552]);
                        if (this.field6554 >= var5) {
                            return;
                        }
                        this.field6554 = var5 + var5 - 1 - this.field6554;
                        this.field6547 = -this.field6547;
                    }
                    while (true) {
                        int var11 = this.method2743(arg0, var9, var6, var10, var4.field26[this.field6540 - 1]);
                        if (this.field6554 < var6) {
                            return;
                        }
                        this.field6554 = var6 + var6 - 1 - this.field6554;
                        this.field6547 = -this.field6547;
                        var9 = this.method2728(arg0, var11, var5, var10, var4.field26[this.field6552]);
                        if (this.field6554 >= var5) {
                            return;
                        }
                        this.field6554 = var5 + var5 - 1 - this.field6554;
                        this.field6547 = -this.field6547;
                    }
                } else if (this.field6547 < 0) {
                    while (true) {
                        var9 = this.method2728(arg0, var9, var5, var10, var4.field26[this.field6540 - 1]);
                        if (this.field6554 >= var5) {
                            return;
                        }
                        this.field6554 = var6 - 1 - (var6 - 1 - this.field6554) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2743(arg0, var9, var6, var10, var4.field26[this.field6552]);
                        if (this.field6554 < var6) {
                            return;
                        }
                        this.field6554 = (this.field6554 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6543 > 0) {
                    if (this.field6553) {
                        label130: {
                            if (this.field6547 < 0) {
                                var9 = this.method2728(arg0, arg1, var5, var10, var4.field26[this.field6552]);
                                if (this.field6554 >= var5) {
                                    return;
                                }
                                this.field6554 = var5 + var5 - 1 - this.field6554;
                                this.field6547 = -this.field6547;
                                if (--this.field6543 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2743(arg0, var9, var6, var10, var4.field26[this.field6540 - 1]);
                                if (this.field6554 < var6) {
                                    return;
                                }
                                this.field6554 = var6 + var6 - 1 - this.field6554;
                                this.field6547 = -this.field6547;
                                if (--this.field6543 == 0) {
                                    break;
                                }
                                var9 = this.method2728(arg0, var9, var5, var10, var4.field26[this.field6552]);
                                if (this.field6554 >= var5) {
                                    return;
                                }
                                this.field6554 = var5 + var5 - 1 - this.field6554;
                                this.field6547 = -this.field6547;
                            } while (--this.field6543 != 0);
                        }
                    } else if (this.field6547 < 0) {
                        while (true) {
                            var9 = this.method2728(arg0, var9, var5, var10, var4.field26[this.field6540 - 1]);
                            if (this.field6554 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6554) / var8;
                            if (var12 >= this.field6543) {
                                this.field6554 += this.field6543 * var8;
                                this.field6543 = 0;
                                break;
                            }
                            this.field6554 += var8 * var12;
                            this.field6543 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2743(arg0, var9, var6, var10, var4.field26[this.field6552]);
                            if (this.field6554 < var6) {
                                return;
                            }
                            int var13 = (this.field6554 - var5) / var8;
                            if (var13 >= this.field6543) {
                                this.field6554 -= this.field6543 * var8;
                                this.field6543 = 0;
                                break;
                            }
                            this.field6554 -= var8 * var13;
                            this.field6543 -= var13;
                        }
                    }
                }
                if (this.field6547 < 0) {
                    this.method2728(arg0, var9, 0, var10, 0);
                    if (this.field6554 < 0) {
                        this.field6554 = -1;
                        this.method2747();
                        this.method625((byte) -50);
                        return;
                    }
                } else {
                    this.method2743(arg0, var9, var7, var10, 0);
                    if (this.field6554 >= var7) {
                        this.field6554 = var7;
                        this.method2747();
                        this.method625((byte) -50);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()Lwf;")
    public final class29 method170() {
        return null;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "()I")
    public final synchronized int method2713() {
        return this.field6546 < 0 ? -1 : this.field6546;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II[B[IIIIIIIILsj;II)I")
    private static final int method2714(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class444 arg11, int arg12, int arg13) {
        arg11.field6550 -= arg11.field6551 * arg5;
        arg11.field6544 -= arg11.field6549 * arg5;
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
        arg11.field6550 += arg11.field6551 * arg5;
        arg11.field6544 += arg11.field6549 * arg5;
        arg11.field6541 = arg6;
        arg11.field6554 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()I")
    public final int method165() {
        int var1 = this.field6541 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6543 == 0) {
            var2 -= this.field6554 * var2 / (((class2) super.field369).field26.length << 8);
        } else if (this.field6543 >= 0) {
            var2 -= this.field6552 * var2 / ((class2) super.field369).field26.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()I")
    public final int method166() {
        return this.field6548 == 0 && this.field6542 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public final synchronized void method2715(boolean arg0) {
        this.field6547 = (this.field6547 >>> 31) + (this.field6547 ^ this.field6547 >> 31);
        if (arg0) {
            this.field6547 = -this.field6547;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public final synchronized void method2716(int arg0) {
        int var2 = ((class2) super.field369).field26.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6554 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([B[IIIIIIILsj;)I")
    private static final int method2717(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class444 arg8) {
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
        arg8.field6554 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II[B[IIIIIIIILsj;II)I")
    private static final int method2718(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class444 arg11, int arg12, int arg13) {
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
        arg11.field6554 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(II[B[IIIIIIIILsj;II)I")
    private static final int method2719(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class444 arg11, int arg12, int arg13) {
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
        arg11.field6554 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    private final synchronized void method2720(int arg0) {
        this.method2729(arg0, this.method2713());
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public final synchronized void method2721(int arg0) {
        this.method2729(arg0 << 6, this.method2713());
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
    public final synchronized void method2722(int arg0) {
        if (arg0 == 0) {
            this.method2720(0);
            this.method625((byte) -50);
        } else if (this.field6550 == 0 && this.field6544 == 0) {
            this.field6542 = 0;
            this.field6548 = 0;
            this.field6541 = 0;
            this.method625((byte) -50);
        } else {
            int var2 = -this.field6541;
            if (this.field6541 > var2) {
                var2 = this.field6541;
            }
            if (-this.field6550 > var2) {
                var2 = -this.field6550;
            }
            if (this.field6550 > var2) {
                var2 = this.field6550;
            }
            if (-this.field6544 > var2) {
                var2 = -this.field6544;
            }
            if (this.field6544 > var2) {
                var2 = this.field6544;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6542 = arg0;
            this.field6548 = Integer.MIN_VALUE;
            this.field6545 = -this.field6541 / arg0;
            this.field6551 = -this.field6550 / arg0;
            this.field6549 = -this.field6544 / arg0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public final synchronized void method2723(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2729(arg1, arg2);
        } else {
            int var4 = method2732(arg1, arg2);
            int var5 = method2742(arg1, arg2);
            if (this.field6550 == var4 && this.field6544 == var5) {
                this.field6542 = 0;
            } else {
                int var6 = arg1 - this.field6541;
                if (this.field6541 - arg1 > var6) {
                    var6 = this.field6541 - arg1;
                }
                if (var4 - this.field6550 > var6) {
                    var6 = var4 - this.field6550;
                }
                if (this.field6550 - var4 > var6) {
                    var6 = this.field6550 - var4;
                }
                if (var5 - this.field6544 > var6) {
                    var6 = var5 - this.field6544;
                }
                if (this.field6544 - var5 > var6) {
                    var6 = this.field6544 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6542 = arg0;
                this.field6548 = arg1;
                this.field6546 = arg2;
                this.field6545 = (arg1 - this.field6541) / arg0;
                this.field6551 = (var4 - this.field6550) / arg0;
                this.field6549 = (var5 - this.field6544) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([B[IIIIIIIILsj;)I")
    private static final int method2724(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class444 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6550 += (var14 - arg3) * arg9.field6551;
        arg9.field6544 += (var14 - arg3) * arg9.field6549;
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
        arg9.field6541 = var12 >> 2;
        arg9.field6554 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "([B[IIIIIIILsj;)I")
    private static final int method2725(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class444 arg8) {
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
        arg8.field6554 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[B[IIIIIIIIIILsj;)I")
    private static final int method2726(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class444 arg12) {
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
        arg12.field6541 += (var19 - arg4) * arg12.field6545;
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
        arg12.field6550 = var15 >> 2;
        arg12.field6544 = var16 >> 2;
        arg12.field6554 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V")
    public final synchronized void method2727(int arg0) {
        if (this.field6547 < 0) {
            this.field6547 = -arg0;
        } else {
            this.field6547 = arg0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIIII)I")
    private final int method2728(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6542 <= 0) {
                if (this.field6547 == -256 && (this.field6554 & 255) == 0) {
                    if (class278.field4229) {
                        return method2735(0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, 0, arg3, arg2, this);
                    }
                    return method2717(((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, 0, arg3, arg2, this);
                }
                if (class278.field4229) {
                    return method2718(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, 0, arg3, arg2, this, this.field6547, arg4);
                }
                return method2730(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, 0, arg3, arg2, this, this.field6547, arg4);
            }
            int var6 = this.field6542 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6542 += arg1;
            if (this.field6547 == -256 && (this.field6554 & 255) == 0) {
                if (class278.field4229) {
                    arg1 = method2731(0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, this.field6551, this.field6549, 0, var6, arg2, this);
                } else {
                    arg1 = method2724(((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, this.field6545, 0, var6, arg2, this);
                }
            } else if (class278.field4229) {
                arg1 = method2741(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, this.field6551, this.field6549, 0, var6, arg2, this, this.field6547, arg4);
            } else {
                arg1 = method2711(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, this.field6545, 0, var6, arg2, this, this.field6547, arg4);
            }
            this.field6542 -= arg1;
            if (this.field6542 != 0) {
                return arg1;
            }
        } while (!this.method2749());
        return arg3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
    private final synchronized void method2729(int arg0, int arg1) {
        this.field6548 = arg0;
        this.field6546 = arg1;
        this.field6542 = 0;
        this.method2712();
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II[B[IIIIIIILsj;II)I")
    private static final int method2730(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class444 arg10, int arg11, int arg12) {
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
        arg10.field6554 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I[B[IIIIIIIIIILsj;)I")
    private static final int method2731(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class444 arg12) {
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
        arg12.field6541 += (var19 - arg4) * arg12.field6545;
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
        arg12.field6550 = var15 >> 2;
        arg12.field6544 = var16 >> 2;
        arg12.field6554 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)I")
    private static final int method2732(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V")
    public final synchronized void method2733(int arg0, int arg1) {
        this.method2723(arg0, arg1, this.method2713());
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[B[IIIIIIIILsj;)I")
    private static final int method2734(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class444 arg10) {
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
        arg10.field6554 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I[B[IIIIIIIILsj;)I")
    private static final int method2735(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class444 arg10) {
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
        arg10.field6554 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "([B[IIIIIIIILsj;)I")
    private static final int method2736(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class444 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6550 += (var14 - arg3) * arg9.field6551;
        arg9.field6544 += (var14 - arg3) * arg9.field6549;
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
        arg9.field6541 = var12 >> 2;
        arg9.field6554 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "(I)V")
    public final synchronized void method2737(int arg0) {
        this.field6543 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "()Z")
    public final boolean method2738() {
        return this.field6554 < 0 || this.field6554 >= ((class2) super.field369).field26.length << 8;
    }

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "()I")
    public final synchronized int method2739() {
        return this.field6547 < 0 ? -this.field6547 : this.field6547;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lar;II)Lsj;")
    public static final class444 method2740(class2 arg0, int arg1, int arg2) {
        return arg0.field26 != null && arg0.field26.length != 0 ? new class444(arg0, (int) ((long) arg0.field28 * 256L * (long) arg1 / (long) (class81.field1082 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[B[IIIIIIIIIILsj;II)I")
    private static final int method2741(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class444 arg13, int arg14, int arg15) {
        arg13.field6541 -= arg13.field6545 * arg5;
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
        arg13.field6541 += arg13.field6545 * var22;
        arg13.field6550 = arg6;
        arg13.field6544 = arg7;
        arg13.field6554 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(II)I")
    private static final int method2742(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public final synchronized void method168(int arg0) {
        if (this.field6542 > 0) {
            if (arg0 >= this.field6542) {
                if (this.field6548 == Integer.MIN_VALUE) {
                    this.field6548 = 0;
                    this.field6541 = this.field6550 = this.field6544 = 0;
                    this.method625((byte) -50);
                    arg0 = this.field6542;
                }
                this.field6542 = 0;
                this.method2712();
            } else {
                this.field6541 += this.field6545 * arg0;
                this.field6550 += this.field6551 * arg0;
                this.field6544 += this.field6549 * arg0;
                this.field6542 -= arg0;
            }
        }
        class2 var2 = (class2) super.field369;
        int var3 = this.field6552 << 8;
        int var4 = this.field6540 << 8;
        int var5 = var2.field26.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6543 = 0;
        }
        if (this.field6554 < 0) {
            if (this.field6547 <= 0) {
                this.method2747();
                this.method625((byte) -50);
                return;
            }
            this.field6554 = 0;
        }
        if (this.field6554 >= var5) {
            if (this.field6547 >= 0) {
                this.method2747();
                this.method625((byte) -50);
                return;
            }
            this.field6554 = var5 - 1;
        }
        this.field6554 += this.field6547 * arg0;
        if (this.field6543 < 0) {
            if (!this.field6553) {
                if (this.field6547 < 0) {
                    if (this.field6554 < var3) {
                        this.field6554 = var4 - 1 - (var4 - 1 - this.field6554) % var6;
                    }
                } else if (this.field6554 >= var4) {
                    this.field6554 = (this.field6554 - var3) % var6 + var3;
                }
            } else {
                if (this.field6547 < 0) {
                    if (this.field6554 >= var3) {
                        return;
                    }
                    this.field6554 = var3 + var3 - 1 - this.field6554;
                    this.field6547 = -this.field6547;
                }
                while (this.field6554 >= var4) {
                    this.field6554 = var4 + var4 - 1 - this.field6554;
                    this.field6547 = -this.field6547;
                    if (this.field6554 >= var3) {
                        return;
                    }
                    this.field6554 = var3 + var3 - 1 - this.field6554;
                    this.field6547 = -this.field6547;
                }
            }
        } else {
            if (this.field6543 > 0) {
                if (this.field6553) {
                    label125: {
                        if (this.field6547 < 0) {
                            if (this.field6554 >= var3) {
                                return;
                            }
                            this.field6554 = var3 + var3 - 1 - this.field6554;
                            this.field6547 = -this.field6547;
                            if (--this.field6543 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6554 < var4) {
                                return;
                            }
                            this.field6554 = var4 + var4 - 1 - this.field6554;
                            this.field6547 = -this.field6547;
                            if (--this.field6543 == 0) {
                                break;
                            }
                            if (this.field6554 >= var3) {
                                return;
                            }
                            this.field6554 = var3 + var3 - 1 - this.field6554;
                            this.field6547 = -this.field6547;
                        } while (--this.field6543 != 0);
                    }
                } else if (this.field6547 < 0) {
                    if (this.field6554 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6554) / var6;
                    if (var7 < this.field6543) {
                        this.field6554 += var6 * var7;
                        this.field6543 -= var7;
                        return;
                    }
                    this.field6554 += this.field6543 * var6;
                    this.field6543 = 0;
                } else {
                    if (this.field6554 < var4) {
                        return;
                    }
                    int var8 = (this.field6554 - var3) / var6;
                    if (var8 < this.field6543) {
                        this.field6554 -= var6 * var8;
                        this.field6543 -= var8;
                        return;
                    }
                    this.field6554 -= this.field6543 * var6;
                    this.field6543 = 0;
                }
            }
            if (this.field6547 < 0) {
                if (this.field6554 < 0) {
                    this.field6554 = -1;
                    this.method2747();
                    this.method625((byte) -50);
                    return;
                }
            } else if (this.field6554 >= var5) {
                this.field6554 = var5;
                this.method2747();
                this.method625((byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "([IIIII)I")
    private final int method2743(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6542 <= 0) {
                if (this.field6547 == 256 && (this.field6554 & 255) == 0) {
                    if (class278.field4229) {
                        return method2734(0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, 0, arg3, arg2, this);
                    }
                    return method2725(((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, 0, arg3, arg2, this);
                }
                if (class278.field4229) {
                    return method2719(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, 0, arg3, arg2, this, this.field6547, arg4);
                }
                return method2710(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, 0, arg3, arg2, this, this.field6547, arg4);
            }
            int var6 = this.field6542 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6542 += arg1;
            if (this.field6547 == 256 && (this.field6554 & 255) == 0) {
                if (class278.field4229) {
                    arg1 = method2726(0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, this.field6551, this.field6549, 0, var6, arg2, this);
                } else {
                    arg1 = method2736(((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, this.field6545, 0, var6, arg2, this);
                }
            } else if (class278.field4229) {
                arg1 = method2744(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6550, this.field6544, this.field6551, this.field6549, 0, var6, arg2, this, this.field6547, arg4);
            } else {
                arg1 = method2714(0, 0, ((class2) super.field369).field26, arg0, this.field6554, arg1, this.field6541, this.field6545, 0, var6, arg2, this, this.field6547, arg4);
            }
            this.field6542 -= arg1;
            if (this.field6542 != 0) {
                return arg1;
            }
        } while (!this.method2749());
        return arg3;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II[B[IIIIIIIIIILsj;II)I")
    private static final int method2744(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class444 arg13, int arg14, int arg15) {
        arg13.field6541 -= arg13.field6545 * arg5;
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
        arg13.field6541 += arg13.field6545 * var22;
        arg13.field6550 = arg6;
        arg13.field6544 = arg7;
        arg13.field6554 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lar;III)Lsj;")
    public static final class444 method2745(class2 arg0, int arg1, int arg2, int arg3) {
        return arg0.field26 != null && arg0.field26.length != 0 ? new class444(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "()I")
    public final synchronized int method2746() {
        return this.field6548 == Integer.MIN_VALUE ? 0 : this.field6548;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()Lwf;")
    public final class29 method169() {
        return null;
    }

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "()V")
    private final void method2747() {
        if (this.field6542 != 0) {
            if (this.field6548 == Integer.MIN_VALUE) {
                this.field6548 = 0;
            }
            this.field6542 = 0;
            this.method2712();
        }
    }

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "()Z")
    public final boolean method2748() {
        return this.field6542 != 0;
    }

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "()Z")
    private final boolean method2749() {
        int var1 = this.field6548;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2732(var1, this.field6546);
            var2 = method2742(var1, this.field6546);
        }
        if (this.field6541 == var1 && this.field6550 == var3 && this.field6544 == var2) {
            if (this.field6548 == Integer.MIN_VALUE) {
                this.field6548 = 0;
                this.field6541 = this.field6550 = this.field6544 = 0;
                this.method625((byte) -50);
                return true;
            } else {
                this.method2712();
                return false;
            }
        } else {
            if (this.field6541 < var1) {
                this.field6545 = 1;
                this.field6542 = var1 - this.field6541;
            } else if (this.field6541 > var1) {
                this.field6545 = -1;
                this.field6542 = this.field6541 - var1;
            } else {
                this.field6545 = 0;
            }
            if (this.field6550 < var3) {
                this.field6551 = 1;
                if (this.field6542 == 0 || this.field6542 > var3 - this.field6550) {
                    this.field6542 = var3 - this.field6550;
                }
            } else if (this.field6550 > var3) {
                this.field6551 = -1;
                if (this.field6542 == 0 || this.field6542 > this.field6550 - var3) {
                    this.field6542 = this.field6550 - var3;
                }
            } else {
                this.field6551 = 0;
            }
            if (this.field6544 < var2) {
                this.field6549 = 1;
                if (this.field6542 == 0 || this.field6542 > var2 - this.field6544) {
                    this.field6542 = var2 - this.field6544;
                }
            } else if (this.field6544 > var2) {
                this.field6549 = -1;
                if (this.field6542 == 0 || this.field6542 > this.field6544 - var2) {
                    this.field6542 = this.field6544 - var2;
                }
            } else {
                this.field6549 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lar;II)V")
    private class444(class2 arg0, int arg1, int arg2) {
        super.field369 = arg0;
        this.field6552 = arg0.field30;
        this.field6540 = arg0.field27;
        this.field6553 = arg0.field29;
        this.field6547 = arg1;
        this.field6548 = arg2;
        this.field6546 = 8192;
        this.field6554 = 0;
        this.method2712();
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lar;III)V")
    private class444(class2 arg0, int arg1, int arg2, int arg3) {
        super.field369 = arg0;
        this.field6552 = arg0.field30;
        this.field6540 = arg0.field27;
        this.field6553 = arg0.field29;
        this.field6547 = arg1;
        this.field6548 = arg2;
        this.field6546 = arg3;
        this.field6554 = 0;
        this.method2712();
    }
}
