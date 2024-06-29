import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class161 extends class123 {

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    private int field2586;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    private int field2588;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
    private boolean field2584;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    private int field2582;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    private int field2589;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    private int field2583;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    private int field2576;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    private int field2585;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    private int field2590;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[B[IIIIIIILho;II)I")
    private static final int method1229(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class161 arg10, int arg11, int arg12) {
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
        arg10.field2583 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "()Z")
    private final boolean method1230() {
        int var1 = this.field2577;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1252(var1, this.field2589);
            var2 = method1242(var1, this.field2589);
        }
        if (this.field2581 == var1 && this.field2578 == var3 && this.field2576 == var2) {
            if (this.field2577 == Integer.MIN_VALUE) {
                this.field2577 = 0;
                this.field2581 = this.field2578 = this.field2576 = 0;
                this.method1207(87);
                return true;
            } else {
                this.method1249();
                return false;
            }
        } else {
            if (this.field2581 < var1) {
                this.field2585 = 1;
                this.field2587 = var1 - this.field2581;
            } else if (this.field2581 > var1) {
                this.field2585 = -1;
                this.field2587 = this.field2581 - var1;
            } else {
                this.field2585 = 0;
            }
            if (this.field2578 < var3) {
                this.field2580 = 1;
                if (this.field2587 == 0 || this.field2587 > var3 - this.field2578) {
                    this.field2587 = var3 - this.field2578;
                }
            } else if (this.field2578 > var3) {
                this.field2580 = -1;
                if (this.field2587 == 0 || this.field2587 > this.field2578 - var3) {
                    this.field2587 = this.field2578 - var3;
                }
            } else {
                this.field2580 = 0;
            }
            if (this.field2576 < var2) {
                this.field2579 = 1;
                if (this.field2587 == 0 || this.field2587 > var2 - this.field2576) {
                    this.field2587 = var2 - this.field2576;
                }
            } else if (this.field2576 > var2) {
                this.field2579 = -1;
                if (this.field2587 == 0 || this.field2587 > this.field2576 - var2) {
                    this.field2587 = this.field2576 - var2;
                }
            } else {
                this.field2579 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([B[IIIIIIIILho;)I")
    private static final int method1231(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class161 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2578 += (var14 - arg3) * arg9.field2580;
        arg9.field2576 += (var14 - arg3) * arg9.field2579;
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
        arg9.field2581 = var12 >> 2;
        arg9.field2583 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public final synchronized void method351(int arg0) {
        if (this.field2587 > 0) {
            if (arg0 >= this.field2587) {
                if (this.field2577 == Integer.MIN_VALUE) {
                    this.field2577 = 0;
                    this.field2581 = this.field2578 = this.field2576 = 0;
                    this.method1207(85);
                    arg0 = this.field2587;
                }
                this.field2587 = 0;
                this.method1249();
            } else {
                this.field2581 += this.field2585 * arg0;
                this.field2578 += this.field2580 * arg0;
                this.field2576 += this.field2579 * arg0;
                this.field2587 -= arg0;
            }
        }
        class221 var2 = (class221) super.field2200;
        int var3 = this.field2586 << 8;
        int var4 = this.field2588 << 8;
        int var5 = var2.field3235.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2590 = 0;
        }
        if (this.field2583 < 0) {
            if (this.field2582 <= 0) {
                this.method1239();
                this.method1207(88);
                return;
            }
            this.field2583 = 0;
        }
        if (this.field2583 >= var5) {
            if (this.field2582 >= 0) {
                this.method1239();
                this.method1207(103);
                return;
            }
            this.field2583 = var5 - 1;
        }
        this.field2583 += this.field2582 * arg0;
        if (this.field2590 < 0) {
            if (!this.field2584) {
                if (this.field2582 < 0) {
                    if (this.field2583 < var3) {
                        this.field2583 = var4 - 1 - (var4 - 1 - this.field2583) % var6;
                    }
                } else if (this.field2583 >= var4) {
                    this.field2583 = (this.field2583 - var3) % var6 + var3;
                }
            } else {
                if (this.field2582 < 0) {
                    if (this.field2583 >= var3) {
                        return;
                    }
                    this.field2583 = var3 + var3 - 1 - this.field2583;
                    this.field2582 = -this.field2582;
                }
                while (this.field2583 >= var4) {
                    this.field2583 = var4 + var4 - 1 - this.field2583;
                    this.field2582 = -this.field2582;
                    if (this.field2583 >= var3) {
                        return;
                    }
                    this.field2583 = var3 + var3 - 1 - this.field2583;
                    this.field2582 = -this.field2582;
                }
            }
        } else {
            if (this.field2590 > 0) {
                if (this.field2584) {
                    label125: {
                        if (this.field2582 < 0) {
                            if (this.field2583 >= var3) {
                                return;
                            }
                            this.field2583 = var3 + var3 - 1 - this.field2583;
                            this.field2582 = -this.field2582;
                            if (--this.field2590 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field2583 < var4) {
                                return;
                            }
                            this.field2583 = var4 + var4 - 1 - this.field2583;
                            this.field2582 = -this.field2582;
                            if (--this.field2590 == 0) {
                                break;
                            }
                            if (this.field2583 >= var3) {
                                return;
                            }
                            this.field2583 = var3 + var3 - 1 - this.field2583;
                            this.field2582 = -this.field2582;
                        } while (--this.field2590 != 0);
                    }
                } else if (this.field2582 < 0) {
                    if (this.field2583 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2583) / var6;
                    if (var7 < this.field2590) {
                        this.field2583 += var6 * var7;
                        this.field2590 -= var7;
                        return;
                    }
                    this.field2583 += this.field2590 * var6;
                    this.field2590 = 0;
                } else {
                    if (this.field2583 < var4) {
                        return;
                    }
                    int var8 = (this.field2583 - var3) / var6;
                    if (var8 < this.field2590) {
                        this.field2583 -= var6 * var8;
                        this.field2590 -= var8;
                        return;
                    }
                    this.field2583 -= this.field2590 * var6;
                    this.field2590 = 0;
                }
            }
            if (this.field2582 < 0) {
                if (this.field2583 < 0) {
                    this.field2583 = -1;
                    this.method1239();
                    this.method1207(83);
                    return;
                }
            } else if (this.field2583 >= var5) {
                this.field2583 = var5;
                this.method1239();
                this.method1207(104);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()I")
    public final int method1070() {
        int var1 = this.field2581 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2590 == 0) {
            var2 -= this.field2583 * var2 / (((class221) super.field2200).field3235.length << 8);
        } else if (this.field2590 >= 0) {
            var2 -= this.field2586 * var2 / ((class221) super.field2200).field3235.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[B[IIIIIIIILho;)I")
    private static final int method1232(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class161 arg10) {
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
        arg10.field2583 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[B[IIIIIIIILho;II)I")
    private static final int method1233(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class161 arg11, int arg12, int arg13) {
        arg11.field2578 -= arg11.field2580 * arg5;
        arg11.field2576 -= arg11.field2579 * arg5;
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
        arg11.field2578 += arg11.field2580 * arg5;
        arg11.field2576 += arg11.field2579 * arg5;
        arg11.field2581 = arg6;
        arg11.field2583 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lrea;III)Lho;")
    public static final class161 method1234(class221 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3235 != null && arg0.field3235.length != 0 ? new class161(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()Lri;")
    public final class123 method355() {
        return null;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
    public final synchronized void method1235(int arg0) {
        this.method1238(arg0 << 6, this.method1259());
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "([B[IIIIIIIILho;)I")
    private static final int method1236(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class161 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2578 += (var14 - arg3) * arg9.field2580;
        arg9.field2576 += (var14 - arg3) * arg9.field2579;
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
        arg9.field2581 = var12 >> 2;
        arg9.field2583 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
    public final synchronized void method1237(int arg0) {
        this.field2590 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V")
    private final synchronized void method1238(int arg0, int arg1) {
        this.field2577 = arg0;
        this.field2589 = arg1;
        this.field2587 = 0;
        this.method1249();
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "()V")
    private final void method1239() {
        if (this.field2587 != 0) {
            if (this.field2577 == Integer.MIN_VALUE) {
                this.field2577 = 0;
            }
            this.field2587 = 0;
            this.method1249();
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
    public final synchronized void method1240(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1238(arg1, arg2);
        } else {
            int var4 = method1252(arg1, arg2);
            int var5 = method1242(arg1, arg2);
            if (this.field2578 == var4 && this.field2576 == var5) {
                this.field2587 = 0;
            } else {
                int var6 = arg1 - this.field2581;
                if (this.field2581 - arg1 > var6) {
                    var6 = this.field2581 - arg1;
                }
                if (var4 - this.field2578 > var6) {
                    var6 = var4 - this.field2578;
                }
                if (this.field2578 - var4 > var6) {
                    var6 = this.field2578 - var4;
                }
                if (var5 - this.field2576 > var6) {
                    var6 = var5 - this.field2576;
                }
                if (this.field2576 - var5 > var6) {
                    var6 = this.field2576 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field2587 = arg0;
                this.field2577 = arg1;
                this.field2589 = arg2;
                this.field2585 = (arg1 - this.field2581) / arg0;
                this.field2580 = (var4 - this.field2578) / arg0;
                this.field2579 = (var5 - this.field2576) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[B[IIIIIIIIIILho;)I")
    private static final int method1241(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class161 arg12) {
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
        arg12.field2581 += (var19 - arg4) * arg12.field2585;
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
        arg12.field2578 = var15 >> 2;
        arg12.field2576 = var16 >> 2;
        arg12.field2583 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)I")
    private static final int method1242(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([B[IIIIIIILho;)I")
    private static final int method1243(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class161 arg8) {
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
        arg8.field2583 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I[B[IIIIIIIILho;)I")
    private static final int method1244(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class161 arg10) {
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
        arg10.field2583 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II[B[IIIIIIIILho;II)I")
    private static final int method1245(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class161 arg11, int arg12, int arg13) {
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
        arg11.field2583 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
    public final synchronized void method1246(int arg0) {
        this.method1238(this.method1261(), arg0);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[B[IIIIIIIIIILho;II)I")
    private static final int method1247(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class161 arg13, int arg14, int arg15) {
        arg13.field2581 -= arg13.field2585 * arg5;
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
        arg13.field2581 += arg13.field2585 * var22;
        arg13.field2578 = arg6;
        arg13.field2576 = arg7;
        arg13.field2583 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V")
    private final synchronized void method1248(int arg0) {
        this.method1238(arg0, this.method1259());
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "()V")
    private final void method1249() {
        this.field2581 = this.field2577;
        this.field2578 = method1252(this.field2577, this.field2589);
        this.field2576 = method1242(this.field2577, this.field2589);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([IIIII)I")
    private final int method1250(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2587 <= 0) {
                if (this.field2582 == 256 && (this.field2583 & 255) == 0) {
                    if (class137.field2352) {
                        return method1232(0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, 0, arg3, arg2, this);
                    }
                    return method1243(((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, 0, arg3, arg2, this);
                }
                if (class137.field2352) {
                    return method1245(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, 0, arg3, arg2, this, this.field2582, arg4);
                }
                return method1229(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, 0, arg3, arg2, this, this.field2582, arg4);
            }
            int var6 = this.field2587 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2587 += arg1;
            if (this.field2582 == 256 && (this.field2583 & 255) == 0) {
                if (class137.field2352) {
                    arg1 = method1241(0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, this.field2580, this.field2579, 0, var6, arg2, this);
                } else {
                    arg1 = method1231(((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, this.field2585, 0, var6, arg2, this);
                }
            } else if (class137.field2352) {
                arg1 = method1247(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, this.field2580, this.field2579, 0, var6, arg2, this, this.field2582, arg4);
            } else {
                arg1 = method1233(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, this.field2585, 0, var6, arg2, this, this.field2582, arg4);
            }
            this.field2587 -= arg1;
            if (this.field2587 != 0) {
                return arg1;
            }
        } while (!this.method1230());
        return arg3;
    }

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)V")
    public final synchronized void method1251(int arg0) {
        if (this.field2582 < 0) {
            this.field2582 = -arg0;
        } else {
            this.field2582 = arg0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "([III)V")
    public final synchronized void method356(int[] arg0, int arg1, int arg2) {
        if (this.field2577 == 0 && this.field2587 == 0) {
            this.method351(arg2);
        } else {
            class221 var4 = (class221) super.field2200;
            int var5 = this.field2586 << 8;
            int var6 = this.field2588 << 8;
            int var7 = var4.field3235.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2590 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2583 < 0) {
                if (this.field2582 <= 0) {
                    this.method1239();
                    this.method1207(86);
                    return;
                }
                this.field2583 = 0;
            }
            if (this.field2583 >= var7) {
                if (this.field2582 >= 0) {
                    this.method1239();
                    this.method1207(109);
                    return;
                }
                this.field2583 = var7 - 1;
            }
            if (this.field2590 < 0) {
                if (this.field2584) {
                    if (this.field2582 < 0) {
                        var9 = this.method1268(arg0, arg1, var5, var10, var4.field3235[this.field2586]);
                        if (this.field2583 >= var5) {
                            return;
                        }
                        this.field2583 = var5 + var5 - 1 - this.field2583;
                        this.field2582 = -this.field2582;
                    }
                    while (true) {
                        int var11 = this.method1250(arg0, var9, var6, var10, var4.field3235[this.field2588 - 1]);
                        if (this.field2583 < var6) {
                            return;
                        }
                        this.field2583 = var6 + var6 - 1 - this.field2583;
                        this.field2582 = -this.field2582;
                        var9 = this.method1268(arg0, var11, var5, var10, var4.field3235[this.field2586]);
                        if (this.field2583 >= var5) {
                            return;
                        }
                        this.field2583 = var5 + var5 - 1 - this.field2583;
                        this.field2582 = -this.field2582;
                    }
                } else if (this.field2582 < 0) {
                    while (true) {
                        var9 = this.method1268(arg0, var9, var5, var10, var4.field3235[this.field2588 - 1]);
                        if (this.field2583 >= var5) {
                            return;
                        }
                        this.field2583 = var6 - 1 - (var6 - 1 - this.field2583) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1250(arg0, var9, var6, var10, var4.field3235[this.field2586]);
                        if (this.field2583 < var6) {
                            return;
                        }
                        this.field2583 = (this.field2583 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2590 > 0) {
                    if (this.field2584) {
                        label130: {
                            if (this.field2582 < 0) {
                                var9 = this.method1268(arg0, arg1, var5, var10, var4.field3235[this.field2586]);
                                if (this.field2583 >= var5) {
                                    return;
                                }
                                this.field2583 = var5 + var5 - 1 - this.field2583;
                                this.field2582 = -this.field2582;
                                if (--this.field2590 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1250(arg0, var9, var6, var10, var4.field3235[this.field2588 - 1]);
                                if (this.field2583 < var6) {
                                    return;
                                }
                                this.field2583 = var6 + var6 - 1 - this.field2583;
                                this.field2582 = -this.field2582;
                                if (--this.field2590 == 0) {
                                    break;
                                }
                                var9 = this.method1268(arg0, var9, var5, var10, var4.field3235[this.field2586]);
                                if (this.field2583 >= var5) {
                                    return;
                                }
                                this.field2583 = var5 + var5 - 1 - this.field2583;
                                this.field2582 = -this.field2582;
                            } while (--this.field2590 != 0);
                        }
                    } else if (this.field2582 < 0) {
                        while (true) {
                            var9 = this.method1268(arg0, var9, var5, var10, var4.field3235[this.field2588 - 1]);
                            if (this.field2583 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field2583) / var8;
                            if (var12 >= this.field2590) {
                                this.field2583 += this.field2590 * var8;
                                this.field2590 = 0;
                                break;
                            }
                            this.field2583 += var8 * var12;
                            this.field2590 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1250(arg0, var9, var6, var10, var4.field3235[this.field2586]);
                            if (this.field2583 < var6) {
                                return;
                            }
                            int var13 = (this.field2583 - var5) / var8;
                            if (var13 >= this.field2590) {
                                this.field2583 -= this.field2590 * var8;
                                this.field2590 = 0;
                                break;
                            }
                            this.field2583 -= var8 * var13;
                            this.field2590 -= var13;
                        }
                    }
                }
                if (this.field2582 < 0) {
                    this.method1268(arg0, var9, 0, var10, 0);
                    if (this.field2583 < 0) {
                        this.field2583 = -1;
                        this.method1239();
                        this.method1207(111);
                        return;
                    }
                } else {
                    this.method1250(arg0, var9, var7, var10, 0);
                    if (this.field2583 >= var7) {
                        this.field2583 = var7;
                        this.method1239();
                        this.method1207(110);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)I")
    private static final int method1252(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "()Z")
    public final boolean method1253() {
        return this.field2583 < 0 || this.field2583 >= ((class221) super.field2200).field3235.length << 8;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II[B[IIIIIIIIIILho;II)I")
    private static final int method1254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class161 arg13, int arg14, int arg15) {
        arg13.field2581 -= arg13.field2585 * arg5;
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
        arg13.field2581 += arg13.field2585 * var22;
        arg13.field2578 = arg6;
        arg13.field2576 = arg7;
        arg13.field2583 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "([B[IIIIIIILho;)I")
    private static final int method1255(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class161 arg8) {
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
        arg8.field2583 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "(I)V")
    public final synchronized void method1256(int arg0) {
        int var2 = ((class221) super.field2200).field3235.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2583 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
    public final synchronized void method1257(boolean arg0) {
        this.field2582 = (this.field2582 >>> 31) + (this.field2582 ^ this.field2582 >> 31);
        if (arg0) {
            this.field2582 = -this.field2582;
        }
    }

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "()I")
    public final synchronized int method1258() {
        return this.field2582 < 0 ? -this.field2582 : this.field2582;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "()Lri;")
    public final class123 method362() {
        return null;
    }

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "()I")
    public final synchronized int method1259() {
        return this.field2589 < 0 ? -1 : this.field2589;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "()I")
    public final int method354() {
        return this.field2577 == 0 && this.field2587 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(II)V")
    public final synchronized void method1260(int arg0, int arg1) {
        this.method1240(arg0, arg1, this.method1259());
    }

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "()I")
    public final synchronized int method1261() {
        return this.field2577 == Integer.MIN_VALUE ? 0 : this.field2577;
    }

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "()Z")
    public final boolean method1262() {
        return this.field2587 != 0;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(II[B[IIIIIIIILho;II)I")
    private static final int method1263(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class161 arg11, int arg12, int arg13) {
        arg11.field2578 -= arg11.field2580 * arg5;
        arg11.field2576 -= arg11.field2579 * arg5;
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
        arg11.field2578 += arg11.field2580 * arg5;
        arg11.field2576 += arg11.field2579 * arg5;
        arg11.field2581 = arg6;
        arg11.field2583 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "(I)V")
    public final synchronized void method1264(int arg0) {
        if (arg0 == 0) {
            this.method1248(0);
            this.method1207(81);
        } else if (this.field2578 == 0 && this.field2576 == 0) {
            this.field2587 = 0;
            this.field2577 = 0;
            this.field2581 = 0;
            this.method1207(95);
        } else {
            int var2 = -this.field2581;
            if (this.field2581 > var2) {
                var2 = this.field2581;
            }
            if (-this.field2578 > var2) {
                var2 = -this.field2578;
            }
            if (this.field2578 > var2) {
                var2 = this.field2578;
            }
            if (-this.field2576 > var2) {
                var2 = -this.field2576;
            }
            if (this.field2576 > var2) {
                var2 = this.field2576;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2587 = arg0;
            this.field2577 = Integer.MIN_VALUE;
            this.field2585 = -this.field2581 / arg0;
            this.field2580 = -this.field2578 / arg0;
            this.field2579 = -this.field2576 / arg0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lrea;III)V")
    private class161(class221 arg0, int arg1, int arg2, int arg3) {
        super.field2200 = arg0;
        this.field2586 = arg0.field3239;
        this.field2588 = arg0.field3236;
        this.field2584 = arg0.field3237;
        this.field2582 = arg1;
        this.field2577 = arg2;
        this.field2589 = arg3;
        this.field2583 = 0;
        this.method1249();
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I[B[IIIIIIIIIILho;)I")
    private static final int method1265(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class161 arg12) {
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
        arg12.field2581 += (var19 - arg4) * arg12.field2585;
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
        arg12.field2578 = var15 >> 2;
        arg12.field2576 = var16 >> 2;
        arg12.field2583 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(II[B[IIIIIIIILho;II)I")
    private static final int method1266(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class161 arg11, int arg12, int arg13) {
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
        arg11.field2583 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II[B[IIIIIIILho;II)I")
    private static final int method1267(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class161 arg10, int arg11, int arg12) {
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
        arg10.field2583 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "([IIIII)I")
    private final int method1268(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field2587 <= 0) {
                if (this.field2582 == -256 && (this.field2583 & 255) == 0) {
                    if (class137.field2352) {
                        return method1244(0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, 0, arg3, arg2, this);
                    }
                    return method1255(((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, 0, arg3, arg2, this);
                }
                if (class137.field2352) {
                    return method1266(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, 0, arg3, arg2, this, this.field2582, arg4);
                }
                return method1267(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, 0, arg3, arg2, this, this.field2582, arg4);
            }
            int var6 = this.field2587 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2587 += arg1;
            if (this.field2582 == -256 && (this.field2583 & 255) == 0) {
                if (class137.field2352) {
                    arg1 = method1265(0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, this.field2580, this.field2579, 0, var6, arg2, this);
                } else {
                    arg1 = method1236(((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, this.field2585, 0, var6, arg2, this);
                }
            } else if (class137.field2352) {
                arg1 = method1254(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2578, this.field2576, this.field2580, this.field2579, 0, var6, arg2, this, this.field2582, arg4);
            } else {
                arg1 = method1263(0, 0, ((class221) super.field2200).field3235, arg0, this.field2583, arg1, this.field2581, this.field2585, 0, var6, arg2, this, this.field2582, arg4);
            }
            this.field2587 -= arg1;
            if (this.field2587 != 0) {
                return arg1;
            }
        } while (!this.method1230());
        return arg3;
    }
}
