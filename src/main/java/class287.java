import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class287 extends class273 {

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    private int field4573;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Z")
    private boolean field4582;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    private int field4586;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    private int field4581;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    private int field4574;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private int field4578;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    private int field4585;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    private int field4587;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[B[IIIIIIIIIILva;)I")
    private static final int method1883(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class287 arg12) {
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
        arg12.field4578 += (var19 - arg4) * arg12.field4587;
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
        arg12.field4574 = var15 >> 2;
        arg12.field4585 = var16 >> 2;
        arg12.field4581 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B[IIIIIIIILva;II)I")
    private static final int method1884(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, int arg13) {
        arg11.field4574 -= arg11.field4577 * arg5;
        arg11.field4585 -= arg11.field4584 * arg5;
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
        arg11.field4574 += arg11.field4577 * arg5;
        arg11.field4585 += arg11.field4584 * arg5;
        arg11.field4578 = arg6;
        arg11.field4581 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([III)V")
    public final synchronized void method914(int[] arg0, int arg1, int arg2) {
        if (this.field4580 == 0 && this.field4576 == 0) {
            this.method918(arg2);
        } else {
            class173 var4 = (class173) super.field4351;
            int var5 = this.field4573 << 8;
            int var6 = this.field4575 << 8;
            int var7 = var4.field2451.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4579 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4581 < 0) {
                if (this.field4586 <= 0) {
                    this.method1918();
                    this.method962(128);
                    return;
                }
                this.field4581 = 0;
            }
            if (this.field4581 >= var7) {
                if (this.field4586 >= 0) {
                    this.method1918();
                    this.method962(128);
                    return;
                }
                this.field4581 = var7 - 1;
            }
            if (this.field4579 < 0) {
                if (this.field4582) {
                    if (this.field4586 < 0) {
                        var9 = this.method1906(arg0, arg1, var5, var10, var4.field2451[this.field4573]);
                        if (this.field4581 >= var5) {
                            return;
                        }
                        this.field4581 = var5 + var5 - 1 - this.field4581;
                        this.field4586 = -this.field4586;
                    }
                    while (true) {
                        int var11 = this.method1922(arg0, var9, var6, var10, var4.field2451[this.field4575 - 1]);
                        if (this.field4581 < var6) {
                            return;
                        }
                        this.field4581 = var6 + var6 - 1 - this.field4581;
                        this.field4586 = -this.field4586;
                        var9 = this.method1906(arg0, var11, var5, var10, var4.field2451[this.field4573]);
                        if (this.field4581 >= var5) {
                            return;
                        }
                        this.field4581 = var5 + var5 - 1 - this.field4581;
                        this.field4586 = -this.field4586;
                    }
                } else if (this.field4586 < 0) {
                    while (true) {
                        var9 = this.method1906(arg0, var9, var5, var10, var4.field2451[this.field4575 - 1]);
                        if (this.field4581 >= var5) {
                            return;
                        }
                        this.field4581 = var6 - 1 - (var6 - 1 - this.field4581) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1922(arg0, var9, var6, var10, var4.field2451[this.field4573]);
                        if (this.field4581 < var6) {
                            return;
                        }
                        this.field4581 = (this.field4581 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4579 > 0) {
                    if (this.field4582) {
                        label130: {
                            if (this.field4586 < 0) {
                                var9 = this.method1906(arg0, arg1, var5, var10, var4.field2451[this.field4573]);
                                if (this.field4581 >= var5) {
                                    return;
                                }
                                this.field4581 = var5 + var5 - 1 - this.field4581;
                                this.field4586 = -this.field4586;
                                if (--this.field4579 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1922(arg0, var9, var6, var10, var4.field2451[this.field4575 - 1]);
                                if (this.field4581 < var6) {
                                    return;
                                }
                                this.field4581 = var6 + var6 - 1 - this.field4581;
                                this.field4586 = -this.field4586;
                                if (--this.field4579 == 0) {
                                    break;
                                }
                                var9 = this.method1906(arg0, var9, var5, var10, var4.field2451[this.field4573]);
                                if (this.field4581 >= var5) {
                                    return;
                                }
                                this.field4581 = var5 + var5 - 1 - this.field4581;
                                this.field4586 = -this.field4586;
                            } while (--this.field4579 != 0);
                        }
                    } else if (this.field4586 < 0) {
                        while (true) {
                            var9 = this.method1906(arg0, var9, var5, var10, var4.field2451[this.field4575 - 1]);
                            if (this.field4581 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4581) / var8;
                            if (var12 >= this.field4579) {
                                this.field4581 += this.field4579 * var8;
                                this.field4579 = 0;
                                break;
                            }
                            this.field4581 += var8 * var12;
                            this.field4579 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1922(arg0, var9, var6, var10, var4.field2451[this.field4573]);
                            if (this.field4581 < var6) {
                                return;
                            }
                            int var13 = (this.field4581 - var5) / var8;
                            if (var13 >= this.field4579) {
                                this.field4581 -= this.field4579 * var8;
                                this.field4579 = 0;
                                break;
                            }
                            this.field4581 -= var8 * var13;
                            this.field4579 -= var13;
                        }
                    }
                }
                if (this.field4586 < 0) {
                    this.method1906(arg0, var9, 0, var10, 0);
                    if (this.field4581 < 0) {
                        this.field4581 = -1;
                        this.method1918();
                        this.method962(128);
                        return;
                    }
                } else {
                    this.method1922(arg0, var9, var7, var10, 0);
                    if (this.field4581 >= var7) {
                        this.field4581 = var7;
                        this.method1918();
                        this.method962(128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I")
    private static final int method1885(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()I")
    public final synchronized int method1886() {
        return this.field4586 < 0 ? -this.field4586 : this.field4586;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public final synchronized void method1887(int arg0) {
        int var2 = ((class173) super.field4351).field2451.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4581 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B[IIIIIIIIIILva;II)I")
    private static final int method1888(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class287 arg13, int arg14, int arg15) {
        arg13.field4578 -= arg13.field4587 * arg5;
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
        arg13.field4578 += arg13.field4587 * var22;
        arg13.field4574 = arg6;
        arg13.field4585 = arg7;
        arg13.field4581 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()Lrg;")
    public final class273 method917() {
        return null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
    public final synchronized void method1889(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1919(arg1, arg2);
        } else {
            int var4 = method1885(arg1, arg2);
            int var5 = method1920(arg1, arg2);
            if (this.field4574 == var4 && this.field4585 == var5) {
                this.field4576 = 0;
            } else {
                int var6 = arg1 - this.field4578;
                if (this.field4578 - arg1 > var6) {
                    var6 = this.field4578 - arg1;
                }
                if (var4 - this.field4574 > var6) {
                    var6 = var4 - this.field4574;
                }
                if (this.field4574 - var4 > var6) {
                    var6 = this.field4574 - var4;
                }
                if (var5 - this.field4585 > var6) {
                    var6 = var5 - this.field4585;
                }
                if (this.field4585 - var5 > var6) {
                    var6 = this.field4585 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4576 = arg0;
                this.field4580 = arg1;
                this.field4583 = arg2;
                this.field4587 = (arg1 - this.field4578) / arg0;
                this.field4577 = (var4 - this.field4574) / arg0;
                this.field4584 = (var5 - this.field4585) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[B[IIIIIIIILva;)I")
    private static final int method1890(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10) {
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
        arg10.field4581 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public final synchronized void method1891(int arg0) {
        if (this.field4586 < 0) {
            this.field4586 = -arg0;
        } else {
            this.field4586 = arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()Lrg;")
    public final class273 method912() {
        return null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B[IIIIIIIILva;)I")
    private static final int method1892(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class287 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4574 += (var14 - arg3) * arg9.field4577;
        arg9.field4585 += (var14 - arg3) * arg9.field4584;
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
        arg9.field4578 = var12 >> 2;
        arg9.field4581 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I[B[IIIIIIIIIILva;)I")
    private static final int method1893(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class287 arg12) {
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
        arg12.field4578 += (var19 - arg4) * arg12.field4587;
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
        arg12.field4574 = var15 >> 2;
        arg12.field4585 = var16 >> 2;
        arg12.field4581 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I[B[IIIIIIIILva;)I")
    private static final int method1894(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10) {
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
        arg10.field4581 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II[B[IIIIIIIIIILva;II)I")
    private static final int method1895(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class287 arg13, int arg14, int arg15) {
        arg13.field4578 -= arg13.field4587 * arg5;
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
        arg13.field4578 += arg13.field4587 * var22;
        arg13.field4574 = arg6;
        arg13.field4585 = arg7;
        arg13.field4581 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lqm;II)Lva;")
    public static final class287 method1896(class173 arg0, int arg1, int arg2) {
        return arg0.field2451 != null && arg0.field2451.length != 0 ? new class287(arg0, (int) ((long) arg0.field2454 * 256L * (long) arg1 / (long) (class175.field2476 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public final synchronized void method1897(boolean arg0) {
        this.field4586 = (this.field4586 >>> 31) + (this.field4586 ^ this.field4586 >> 31);
        if (arg0) {
            this.field4586 = -this.field4586;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([B[IIIIIIIILva;)I")
    private static final int method1898(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class287 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4574 += (var14 - arg3) * arg9.field4577;
        arg9.field4585 += (var14 - arg3) * arg9.field4584;
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
        arg9.field4578 = var12 >> 2;
        arg9.field4581 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II[B[IIIIIIIILva;II)I")
    private static final int method1899(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, int arg13) {
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
        arg11.field4581 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "()I")
    public final synchronized int method1900() {
        return this.field4583 < 0 ? -1 : this.field4583;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lqm;III)Lva;")
    public static final class287 method1901(class173 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2451 != null && arg0.field2451.length != 0 ? new class287(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()I")
    public final int method1778() {
        int var1 = this.field4578 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4579 == 0) {
            var2 -= this.field4581 * var2 / (((class173) super.field4351).field2451.length << 8);
        } else if (this.field4579 >= 0) {
            var2 -= this.field4573 * var2 / ((class173) super.field4351).field2451.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    private final synchronized void method1902(int arg0) {
        this.method1919(arg0, this.method1900());
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "()V")
    private final void method1903() {
        this.field4578 = this.field4580;
        this.field4574 = method1885(this.field4580, this.field4583);
        this.field4585 = method1920(this.field4580, this.field4583);
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "()I")
    public final synchronized int method1904() {
        return this.field4580 == Integer.MIN_VALUE ? 0 : this.field4580;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "()Z")
    private final boolean method1905() {
        int var1 = this.field4580;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1885(var1, this.field4583);
            var2 = method1920(var1, this.field4583);
        }
        if (this.field4578 == var1 && this.field4574 == var3 && this.field4585 == var2) {
            if (this.field4580 == Integer.MIN_VALUE) {
                this.field4580 = 0;
                this.field4578 = this.field4574 = this.field4585 = 0;
                this.method962(128);
                return true;
            } else {
                this.method1903();
                return false;
            }
        } else {
            if (this.field4578 < var1) {
                this.field4587 = 1;
                this.field4576 = var1 - this.field4578;
            } else if (this.field4578 > var1) {
                this.field4587 = -1;
                this.field4576 = this.field4578 - var1;
            } else {
                this.field4587 = 0;
            }
            if (this.field4574 < var3) {
                this.field4577 = 1;
                if (this.field4576 == 0 || this.field4576 > var3 - this.field4574) {
                    this.field4576 = var3 - this.field4574;
                }
            } else if (this.field4574 > var3) {
                this.field4577 = -1;
                if (this.field4576 == 0 || this.field4576 > this.field4574 - var3) {
                    this.field4576 = this.field4574 - var3;
                }
            } else {
                this.field4577 = 0;
            }
            if (this.field4585 < var2) {
                this.field4584 = 1;
                if (this.field4576 == 0 || this.field4576 > var2 - this.field4585) {
                    this.field4576 = var2 - this.field4585;
                }
            } else if (this.field4585 > var2) {
                this.field4584 = -1;
                if (this.field4576 == 0 || this.field4576 > this.field4585 - var2) {
                    this.field4576 = this.field4585 - var2;
                }
            } else {
                this.field4584 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIII)I")
    private final int method1906(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4576 <= 0) {
                if (this.field4586 == -256 && (this.field4581 & 255) == 0) {
                    if (class53.field760) {
                        return method1894(0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, 0, arg3, arg2, this);
                    }
                    return method1912(((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, 0, arg3, arg2, this);
                }
                if (class53.field760) {
                    return method1915(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, 0, arg3, arg2, this, this.field4586, arg4);
                }
                return method1916(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, 0, arg3, arg2, this, this.field4586, arg4);
            }
            int var6 = this.field4576 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4576 += arg1;
            if (this.field4586 == -256 && (this.field4581 & 255) == 0) {
                if (class53.field760) {
                    arg1 = method1893(0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, this.field4577, this.field4584, 0, var6, arg2, this);
                } else {
                    arg1 = method1892(((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, this.field4587, 0, var6, arg2, this);
                }
            } else if (class53.field760) {
                arg1 = method1888(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, this.field4577, this.field4584, 0, var6, arg2, this, this.field4586, arg4);
            } else {
                arg1 = method1911(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, this.field4587, 0, var6, arg2, this, this.field4586, arg4);
            }
            this.field4576 -= arg1;
            if (this.field4576 != 0) {
                return arg1;
            }
        } while (!this.method1905());
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "j", descriptor = "()Z")
    public final boolean method1907() {
        return this.field4576 != 0;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(II)V")
    public final synchronized void method1908(int arg0, int arg1) {
        this.method1889(arg0, arg1, this.method1900());
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V")
    public final synchronized void method1909(int arg0) {
        this.method1919(arg0 << 6, this.method1900());
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()I")
    public final int method911() {
        return this.field4580 == 0 && this.field4576 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[B[IIIIIIILva;II)I")
    private static final int method1910(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10, int arg11, int arg12) {
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
        arg10.field4581 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II[B[IIIIIIIILva;II)I")
    private static final int method1911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, int arg13) {
        arg11.field4574 -= arg11.field4577 * arg5;
        arg11.field4585 -= arg11.field4584 * arg5;
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
        arg11.field4574 += arg11.field4577 * arg5;
        arg11.field4585 += arg11.field4584 * arg5;
        arg11.field4578 = arg6;
        arg11.field4581 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B[IIIIIIILva;)I")
    private static final int method1912(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class287 arg8) {
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
        arg8.field4581 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public final synchronized void method918(int arg0) {
        if (this.field4576 > 0) {
            if (arg0 >= this.field4576) {
                if (this.field4580 == Integer.MIN_VALUE) {
                    this.field4580 = 0;
                    this.field4578 = this.field4574 = this.field4585 = 0;
                    this.method962(128);
                    arg0 = this.field4576;
                }
                this.field4576 = 0;
                this.method1903();
            } else {
                this.field4578 += this.field4587 * arg0;
                this.field4574 += this.field4577 * arg0;
                this.field4585 += this.field4584 * arg0;
                this.field4576 -= arg0;
            }
        }
        class173 var2 = (class173) super.field4351;
        int var3 = this.field4573 << 8;
        int var4 = this.field4575 << 8;
        int var5 = var2.field2451.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4579 = 0;
        }
        if (this.field4581 < 0) {
            if (this.field4586 <= 0) {
                this.method1918();
                this.method962(128);
                return;
            }
            this.field4581 = 0;
        }
        if (this.field4581 >= var5) {
            if (this.field4586 >= 0) {
                this.method1918();
                this.method962(128);
                return;
            }
            this.field4581 = var5 - 1;
        }
        this.field4581 += this.field4586 * arg0;
        if (this.field4579 < 0) {
            if (!this.field4582) {
                if (this.field4586 < 0) {
                    if (this.field4581 < var3) {
                        this.field4581 = var4 - 1 - (var4 - 1 - this.field4581) % var6;
                    }
                } else if (this.field4581 >= var4) {
                    this.field4581 = (this.field4581 - var3) % var6 + var3;
                }
            } else {
                if (this.field4586 < 0) {
                    if (this.field4581 >= var3) {
                        return;
                    }
                    this.field4581 = var3 + var3 - 1 - this.field4581;
                    this.field4586 = -this.field4586;
                }
                while (this.field4581 >= var4) {
                    this.field4581 = var4 + var4 - 1 - this.field4581;
                    this.field4586 = -this.field4586;
                    if (this.field4581 >= var3) {
                        return;
                    }
                    this.field4581 = var3 + var3 - 1 - this.field4581;
                    this.field4586 = -this.field4586;
                }
            }
        } else {
            if (this.field4579 > 0) {
                if (this.field4582) {
                    label125: {
                        if (this.field4586 < 0) {
                            if (this.field4581 >= var3) {
                                return;
                            }
                            this.field4581 = var3 + var3 - 1 - this.field4581;
                            this.field4586 = -this.field4586;
                            if (--this.field4579 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4581 < var4) {
                                return;
                            }
                            this.field4581 = var4 + var4 - 1 - this.field4581;
                            this.field4586 = -this.field4586;
                            if (--this.field4579 == 0) {
                                break;
                            }
                            if (this.field4581 >= var3) {
                                return;
                            }
                            this.field4581 = var3 + var3 - 1 - this.field4581;
                            this.field4586 = -this.field4586;
                        } while (--this.field4579 != 0);
                    }
                } else if (this.field4586 < 0) {
                    if (this.field4581 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4581) / var6;
                    if (var7 < this.field4579) {
                        this.field4581 += var6 * var7;
                        this.field4579 -= var7;
                        return;
                    }
                    this.field4581 += this.field4579 * var6;
                    this.field4579 = 0;
                } else {
                    if (this.field4581 < var4) {
                        return;
                    }
                    int var8 = (this.field4581 - var3) / var6;
                    if (var8 < this.field4579) {
                        this.field4581 -= var6 * var8;
                        this.field4579 -= var8;
                        return;
                    }
                    this.field4581 -= this.field4579 * var6;
                    this.field4579 = 0;
                }
            }
            if (this.field4586 < 0) {
                if (this.field4581 < 0) {
                    this.field4581 = -1;
                    this.method1918();
                    this.method962(128);
                    return;
                }
            } else if (this.field4581 >= var5) {
                this.field4581 = var5;
                this.method1918();
                this.method962(128);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(I)V")
    public final synchronized void method1913(int arg0) {
        if (arg0 == 0) {
            this.method1902(0);
            this.method962(128);
        } else if (this.field4574 == 0 && this.field4585 == 0) {
            this.field4576 = 0;
            this.field4580 = 0;
            this.field4578 = 0;
            this.method962(128);
        } else {
            int var2 = -this.field4578;
            if (this.field4578 > var2) {
                var2 = this.field4578;
            }
            if (-this.field4574 > var2) {
                var2 = -this.field4574;
            }
            if (this.field4574 > var2) {
                var2 = this.field4574;
            }
            if (-this.field4585 > var2) {
                var2 = -this.field4585;
            }
            if (this.field4585 > var2) {
                var2 = this.field4585;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4576 = arg0;
            this.field4580 = Integer.MIN_VALUE;
            this.field4587 = -this.field4578 / arg0;
            this.field4577 = -this.field4574 / arg0;
            this.field4584 = -this.field4585 / arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "j", descriptor = "(I)V")
    public final synchronized void method1914(int arg0) {
        this.field4579 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(II[B[IIIIIIIILva;II)I")
    private static final int method1915(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class287 arg11, int arg12, int arg13) {
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
        arg11.field4581 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II[B[IIIIIIILva;II)I")
    private static final int method1916(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class287 arg10, int arg11, int arg12) {
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
        arg10.field4581 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!va", name = "k", descriptor = "()Z")
    public final boolean method1917() {
        return this.field4581 < 0 || this.field4581 >= ((class173) super.field4351).field2451.length << 8;
    }

    @OriginalMember(owner = "client!va", name = "l", descriptor = "()V")
    private final void method1918() {
        if (this.field4576 != 0) {
            if (this.field4580 == Integer.MIN_VALUE) {
                this.field4580 = 0;
            }
            this.field4576 = 0;
            this.method1903();
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(II)V")
    private final synchronized void method1919(int arg0, int arg1) {
        this.field4580 = arg0;
        this.field4583 = arg1;
        this.field4576 = 0;
        this.method1903();
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(II)I")
    private static final int method1920(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([B[IIIIIIILva;)I")
    private static final int method1921(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class287 arg8) {
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
        arg8.field4581 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lqm;II)V")
    private class287(class173 arg0, int arg1, int arg2) {
        super.field4351 = arg0;
        this.field4573 = arg0.field2453;
        this.field4575 = arg0.field2455;
        this.field4582 = arg0.field2452;
        this.field4586 = arg1;
        this.field4580 = arg2;
        this.field4583 = 8192;
        this.field4581 = 0;
        this.method1903();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([IIIII)I")
    private final int method1922(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4576 <= 0) {
                if (this.field4586 == 256 && (this.field4581 & 255) == 0) {
                    if (class53.field760) {
                        return method1890(0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, 0, arg3, arg2, this);
                    }
                    return method1921(((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, 0, arg3, arg2, this);
                }
                if (class53.field760) {
                    return method1899(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, 0, arg3, arg2, this, this.field4586, arg4);
                }
                return method1910(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, 0, arg3, arg2, this, this.field4586, arg4);
            }
            int var6 = this.field4576 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4576 += arg1;
            if (this.field4586 == 256 && (this.field4581 & 255) == 0) {
                if (class53.field760) {
                    arg1 = method1883(0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, this.field4577, this.field4584, 0, var6, arg2, this);
                } else {
                    arg1 = method1898(((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, this.field4587, 0, var6, arg2, this);
                }
            } else if (class53.field760) {
                arg1 = method1895(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4574, this.field4585, this.field4577, this.field4584, 0, var6, arg2, this, this.field4586, arg4);
            } else {
                arg1 = method1884(0, 0, ((class173) super.field4351).field2451, arg0, this.field4581, arg1, this.field4578, this.field4587, 0, var6, arg2, this, this.field4586, arg4);
            }
            this.field4576 -= arg1;
            if (this.field4576 != 0) {
                return arg1;
            }
        } while (!this.method1905());
        return arg3;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lqm;III)V")
    private class287(class173 arg0, int arg1, int arg2, int arg3) {
        super.field4351 = arg0;
        this.field4573 = arg0.field2453;
        this.field4575 = arg0.field2455;
        this.field4582 = arg0.field2452;
        this.field4586 = arg1;
        this.field4580 = arg2;
        this.field4583 = arg3;
        this.field4581 = 0;
        this.method1903();
    }
}
