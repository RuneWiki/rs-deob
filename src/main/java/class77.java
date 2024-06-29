import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class77 extends class452 {

    @OriginalMember(owner = "client!np", name = "x", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Z")
    private boolean field945;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([IIIII)I")
    private final int method458(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field947 <= 0) {
                if (this.field955 == -256 && (this.field944 & 255) == 0) {
                    if (class255.field3311) {
                        return method459(0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, 0, arg3, arg2, this);
                    }
                    return method490(((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, 0, arg3, arg2, this);
                }
                if (class255.field3311) {
                    return method484(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, 0, arg3, arg2, this, this.field955, arg4);
                }
                return method486(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, 0, arg3, arg2, this, this.field955, arg4);
            }
            int var6 = this.field947 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field947 += arg1;
            if (this.field955 == -256 && (this.field944 & 255) == 0) {
                if (class255.field3311) {
                    arg1 = method492(0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, this.field949, this.field946, 0, var6, arg2, this);
                } else {
                    arg1 = method471(((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, this.field957, 0, var6, arg2, this);
                }
            } else if (class255.field3311) {
                arg1 = method483(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, this.field949, this.field946, 0, var6, arg2, this, this.field955, arg4);
            } else {
                arg1 = method476(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, this.field957, 0, var6, arg2, this, this.field955, arg4);
            }
            this.field947 -= arg1;
            if (this.field947 != 0) {
                return arg1;
            }
        } while (!this.method472());
        return arg3;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[B[IIIIIIIILnp;)I")
    private static final int method459(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10) {
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
        arg10.field944 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "()Ltf;")
    public final class452 method109() {
        return null;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
    public final synchronized void method460(int arg0) {
        if (this.field955 < 0) {
            this.field955 = -arg0;
        } else {
            this.field955 = arg0;
        }
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "()I")
    public final synchronized int method461() {
        return this.field956 < 0 ? -1 : this.field956;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "()Ltf;")
    public final class452 method114() {
        return null;
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "()V")
    private final void method462() {
        this.field952 = this.field958;
        this.field954 = method474(this.field958, this.field956);
        this.field950 = method473(this.field958, this.field956);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([III)V")
    public final synchronized void method112(int[] arg0, int arg1, int arg2) {
        if (this.field958 == 0 && this.field947 == 0) {
            this.method108(arg2);
        } else {
            class159 var4 = (class159) super.field6310;
            int var5 = this.field953 << 8;
            int var6 = this.field948 << 8;
            int var7 = var4.field1859.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field951 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field944 < 0) {
                if (this.field955 <= 0) {
                    this.method480();
                    this.method263(false);
                    return;
                }
                this.field944 = 0;
            }
            if (this.field944 >= var7) {
                if (this.field955 >= 0) {
                    this.method480();
                    this.method263(false);
                    return;
                }
                this.field944 = var7 - 1;
            }
            if (this.field951 < 0) {
                if (this.field945) {
                    if (this.field955 < 0) {
                        var9 = this.method458(arg0, arg1, var5, var10, var4.field1859[this.field953]);
                        if (this.field944 >= var5) {
                            return;
                        }
                        this.field944 = var5 + var5 - 1 - this.field944;
                        this.field955 = -this.field955;
                    }
                    while (true) {
                        int var11 = this.method487(arg0, var9, var6, var10, var4.field1859[this.field948 - 1]);
                        if (this.field944 < var6) {
                            return;
                        }
                        this.field944 = var6 + var6 - 1 - this.field944;
                        this.field955 = -this.field955;
                        var9 = this.method458(arg0, var11, var5, var10, var4.field1859[this.field953]);
                        if (this.field944 >= var5) {
                            return;
                        }
                        this.field944 = var5 + var5 - 1 - this.field944;
                        this.field955 = -this.field955;
                    }
                } else if (this.field955 < 0) {
                    while (true) {
                        var9 = this.method458(arg0, var9, var5, var10, var4.field1859[this.field948 - 1]);
                        if (this.field944 >= var5) {
                            return;
                        }
                        this.field944 = var6 - 1 - (var6 - 1 - this.field944) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method487(arg0, var9, var6, var10, var4.field1859[this.field953]);
                        if (this.field944 < var6) {
                            return;
                        }
                        this.field944 = (this.field944 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field951 > 0) {
                    if (this.field945) {
                        label130: {
                            if (this.field955 < 0) {
                                var9 = this.method458(arg0, arg1, var5, var10, var4.field1859[this.field953]);
                                if (this.field944 >= var5) {
                                    return;
                                }
                                this.field944 = var5 + var5 - 1 - this.field944;
                                this.field955 = -this.field955;
                                if (--this.field951 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method487(arg0, var9, var6, var10, var4.field1859[this.field948 - 1]);
                                if (this.field944 < var6) {
                                    return;
                                }
                                this.field944 = var6 + var6 - 1 - this.field944;
                                this.field955 = -this.field955;
                                if (--this.field951 == 0) {
                                    break;
                                }
                                var9 = this.method458(arg0, var9, var5, var10, var4.field1859[this.field953]);
                                if (this.field944 >= var5) {
                                    return;
                                }
                                this.field944 = var5 + var5 - 1 - this.field944;
                                this.field955 = -this.field955;
                            } while (--this.field951 != 0);
                        }
                    } else if (this.field955 < 0) {
                        while (true) {
                            var9 = this.method458(arg0, var9, var5, var10, var4.field1859[this.field948 - 1]);
                            if (this.field944 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field944) / var8;
                            if (var12 >= this.field951) {
                                this.field944 += this.field951 * var8;
                                this.field951 = 0;
                                break;
                            }
                            this.field944 += var8 * var12;
                            this.field951 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method487(arg0, var9, var6, var10, var4.field1859[this.field953]);
                            if (this.field944 < var6) {
                                return;
                            }
                            int var13 = (this.field944 - var5) / var8;
                            if (var13 >= this.field951) {
                                this.field944 -= this.field951 * var8;
                                this.field951 = 0;
                                break;
                            }
                            this.field944 -= var8 * var13;
                            this.field951 -= var13;
                        }
                    }
                }
                if (this.field955 < 0) {
                    this.method458(arg0, var9, 0, var10, 0);
                    if (this.field944 < 0) {
                        this.field944 = -1;
                        this.method480();
                        this.method263(false);
                        return;
                    }
                } else {
                    this.method487(arg0, var9, var7, var10, 0);
                    if (this.field944 >= var7) {
                        this.field944 = var7;
                        this.method480();
                        this.method263(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[B[IIIIIIIILnp;II)I")
    private static final int method463(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
        arg11.field954 -= arg11.field949 * arg5;
        arg11.field950 -= arg11.field946 * arg5;
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
        arg11.field954 += arg11.field949 * arg5;
        arg11.field950 += arg11.field946 * arg5;
        arg11.field952 = arg6;
        arg11.field944 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "()Z")
    public final boolean method464() {
        return this.field947 != 0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[B[IIIIIIIIIILnp;II)I")
    private static final int method465(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class77 arg13, int arg14, int arg15) {
        arg13.field952 -= arg13.field957 * arg5;
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
        arg13.field952 += arg13.field957 * var22;
        arg13.field954 = arg6;
        arg13.field950 = arg7;
        arg13.field944 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[B[IIIIIIILnp;II)I")
    private static final int method466(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10, int arg11, int arg12) {
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
        arg10.field944 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
    public final synchronized void method467(int arg0, int arg1) {
        this.method481(arg0, arg1, this.method461());
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([B[IIIIIIIILnp;)I")
    private static final int method468(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class77 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field954 += (var14 - arg3) * arg9.field949;
        arg9.field950 += (var14 - arg3) * arg9.field946;
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
        arg9.field952 = var12 >> 2;
        arg9.field944 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
    private final synchronized void method469(int arg0) {
        this.method494(arg0, this.method461());
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)V")
    public final synchronized void method470(int arg0) {
        if (arg0 == 0) {
            this.method469(0);
            this.method263(false);
        } else if (this.field954 == 0 && this.field950 == 0) {
            this.field947 = 0;
            this.field958 = 0;
            this.field952 = 0;
            this.method263(false);
        } else {
            int var2 = -this.field952;
            if (this.field952 > var2) {
                var2 = this.field952;
            }
            if (-this.field954 > var2) {
                var2 = -this.field954;
            }
            if (this.field954 > var2) {
                var2 = this.field954;
            }
            if (-this.field950 > var2) {
                var2 = -this.field950;
            }
            if (this.field950 > var2) {
                var2 = this.field950;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field947 = arg0;
            this.field958 = Integer.MIN_VALUE;
            this.field957 = -this.field952 / arg0;
            this.field949 = -this.field954 / arg0;
            this.field946 = -this.field950 / arg0;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "([B[IIIIIIIILnp;)I")
    private static final int method471(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class77 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field954 += (var14 - arg3) * arg9.field949;
        arg9.field950 += (var14 - arg3) * arg9.field946;
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
        arg9.field952 = var12 >> 2;
        arg9.field944 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!np", name = "h", descriptor = "()Z")
    private final boolean method472() {
        int var1 = this.field958;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method474(var1, this.field956);
            var2 = method473(var1, this.field956);
        }
        if (this.field952 == var1 && this.field954 == var3 && this.field950 == var2) {
            if (this.field958 == Integer.MIN_VALUE) {
                this.field958 = 0;
                this.field952 = this.field954 = this.field950 = 0;
                this.method263(false);
                return true;
            } else {
                this.method462();
                return false;
            }
        } else {
            if (this.field952 < var1) {
                this.field957 = 1;
                this.field947 = var1 - this.field952;
            } else if (this.field952 > var1) {
                this.field957 = -1;
                this.field947 = this.field952 - var1;
            } else {
                this.field957 = 0;
            }
            if (this.field954 < var3) {
                this.field949 = 1;
                if (this.field947 == 0 || this.field947 > var3 - this.field954) {
                    this.field947 = var3 - this.field954;
                }
            } else if (this.field954 > var3) {
                this.field949 = -1;
                if (this.field947 == 0 || this.field947 > this.field954 - var3) {
                    this.field947 = this.field954 - var3;
                }
            } else {
                this.field949 = 0;
            }
            if (this.field950 < var2) {
                this.field946 = 1;
                if (this.field947 == 0 || this.field947 > var2 - this.field950) {
                    this.field947 = var2 - this.field950;
                }
            } else if (this.field950 > var2) {
                this.field946 = -1;
                if (this.field947 == 0 || this.field947 > this.field950 - var2) {
                    this.field947 = this.field950 - var2;
                }
            } else {
                this.field946 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
    public final synchronized void method108(int arg0) {
        if (this.field947 > 0) {
            if (arg0 >= this.field947) {
                if (this.field958 == Integer.MIN_VALUE) {
                    this.field958 = 0;
                    this.field952 = this.field954 = this.field950 = 0;
                    this.method263(false);
                    arg0 = this.field947;
                }
                this.field947 = 0;
                this.method462();
            } else {
                this.field952 += this.field957 * arg0;
                this.field954 += this.field949 * arg0;
                this.field950 += this.field946 * arg0;
                this.field947 -= arg0;
            }
        }
        class159 var2 = (class159) super.field6310;
        int var3 = this.field953 << 8;
        int var4 = this.field948 << 8;
        int var5 = var2.field1859.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field951 = 0;
        }
        if (this.field944 < 0) {
            if (this.field955 <= 0) {
                this.method480();
                this.method263(false);
                return;
            }
            this.field944 = 0;
        }
        if (this.field944 >= var5) {
            if (this.field955 >= 0) {
                this.method480();
                this.method263(false);
                return;
            }
            this.field944 = var5 - 1;
        }
        this.field944 += this.field955 * arg0;
        if (this.field951 < 0) {
            if (!this.field945) {
                if (this.field955 < 0) {
                    if (this.field944 < var3) {
                        this.field944 = var4 - 1 - (var4 - 1 - this.field944) % var6;
                    }
                } else if (this.field944 >= var4) {
                    this.field944 = (this.field944 - var3) % var6 + var3;
                }
            } else {
                if (this.field955 < 0) {
                    if (this.field944 >= var3) {
                        return;
                    }
                    this.field944 = var3 + var3 - 1 - this.field944;
                    this.field955 = -this.field955;
                }
                while (this.field944 >= var4) {
                    this.field944 = var4 + var4 - 1 - this.field944;
                    this.field955 = -this.field955;
                    if (this.field944 >= var3) {
                        return;
                    }
                    this.field944 = var3 + var3 - 1 - this.field944;
                    this.field955 = -this.field955;
                }
            }
        } else {
            if (this.field951 > 0) {
                if (this.field945) {
                    label125: {
                        if (this.field955 < 0) {
                            if (this.field944 >= var3) {
                                return;
                            }
                            this.field944 = var3 + var3 - 1 - this.field944;
                            this.field955 = -this.field955;
                            if (--this.field951 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field944 < var4) {
                                return;
                            }
                            this.field944 = var4 + var4 - 1 - this.field944;
                            this.field955 = -this.field955;
                            if (--this.field951 == 0) {
                                break;
                            }
                            if (this.field944 >= var3) {
                                return;
                            }
                            this.field944 = var3 + var3 - 1 - this.field944;
                            this.field955 = -this.field955;
                        } while (--this.field951 != 0);
                    }
                } else if (this.field955 < 0) {
                    if (this.field944 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field944) / var6;
                    if (var7 < this.field951) {
                        this.field944 += var6 * var7;
                        this.field951 -= var7;
                        return;
                    }
                    this.field944 += this.field951 * var6;
                    this.field951 = 0;
                } else {
                    if (this.field944 < var4) {
                        return;
                    }
                    int var8 = (this.field944 - var3) / var6;
                    if (var8 < this.field951) {
                        this.field944 -= var6 * var8;
                        this.field951 -= var8;
                        return;
                    }
                    this.field944 -= this.field951 * var6;
                    this.field951 = 0;
                }
            }
            if (this.field955 < 0) {
                if (this.field944 < 0) {
                    this.field944 = -1;
                    this.method480();
                    this.method263(false);
                    return;
                }
            } else if (this.field944 >= var5) {
                this.field944 = var5;
                this.method480();
                this.method263(false);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)I")
    private static final int method473(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(II)I")
    private static final int method474(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
    public final synchronized void method475(boolean arg0) {
        this.field955 = (this.field955 >>> 31) + (this.field955 ^ this.field955 >> 31);
        if (arg0) {
            this.field955 = -this.field955;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II[B[IIIIIIIILnp;II)I")
    private static final int method476(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
        arg11.field954 -= arg11.field949 * arg5;
        arg11.field950 -= arg11.field946 * arg5;
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
        arg11.field954 += arg11.field949 * arg5;
        arg11.field950 += arg11.field946 * arg5;
        arg11.field952 = arg6;
        arg11.field944 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lve;III)Lnp;")
    public static final class77 method477(class159 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1859 != null && arg0.field1859.length != 0 ? new class77(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[B[IIIIIIIIIILnp;)I")
    private static final int method478(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class77 arg12) {
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
        arg12.field952 += (var19 - arg4) * arg12.field957;
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
        arg12.field954 = var15 >> 2;
        arg12.field950 = var16 >> 2;
        arg12.field944 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(II[B[IIIIIIIILnp;II)I")
    private static final int method479(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
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
        arg11.field944 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!np", name = "i", descriptor = "()V")
    private final void method480() {
        if (this.field947 != 0) {
            if (this.field958 == Integer.MIN_VALUE) {
                this.field958 = 0;
            }
            this.field947 = 0;
            this.method462();
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)V")
    public final synchronized void method481(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method494(arg1, arg2);
        } else {
            int var4 = method474(arg1, arg2);
            int var5 = method473(arg1, arg2);
            if (this.field954 == var4 && this.field950 == var5) {
                this.field947 = 0;
            } else {
                int var6 = arg1 - this.field952;
                if (this.field952 - arg1 > var6) {
                    var6 = this.field952 - arg1;
                }
                if (var4 - this.field954 > var6) {
                    var6 = var4 - this.field954;
                }
                if (this.field954 - var4 > var6) {
                    var6 = this.field954 - var4;
                }
                if (var5 - this.field950 > var6) {
                    var6 = var5 - this.field950;
                }
                if (this.field950 - var5 > var6) {
                    var6 = this.field950 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field947 = arg0;
                this.field958 = arg1;
                this.field956 = arg2;
                this.field957 = (arg1 - this.field952) / arg0;
                this.field949 = (var4 - this.field954) / arg0;
                this.field946 = (var5 - this.field950) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "()I")
    public final int method482() {
        int var1 = this.field952 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field951 == 0) {
            var2 -= this.field944 * var2 / (((class159) super.field6310).field1859.length << 8);
        } else if (this.field951 >= 0) {
            var2 -= this.field953 * var2 / ((class159) super.field6310).field1859.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II[B[IIIIIIIIIILnp;II)I")
    private static final int method483(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class77 arg13, int arg14, int arg15) {
        arg13.field952 -= arg13.field957 * arg5;
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
        arg13.field952 += arg13.field957 * var22;
        arg13.field954 = arg6;
        arg13.field950 = arg7;
        arg13.field944 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(II[B[IIIIIIIILnp;II)I")
    private static final int method484(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
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
        arg11.field944 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I[B[IIIIIIIILnp;)I")
    private static final int method485(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10) {
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
        arg10.field944 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "()I")
    public final int method107() {
        return this.field958 == 0 && this.field947 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II[B[IIIIIIILnp;II)I")
    private static final int method486(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10, int arg11, int arg12) {
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
        arg10.field944 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "([IIIII)I")
    private final int method487(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field947 <= 0) {
                if (this.field955 == 256 && (this.field944 & 255) == 0) {
                    if (class255.field3311) {
                        return method485(0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, 0, arg3, arg2, this);
                    }
                    return method491(((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, 0, arg3, arg2, this);
                }
                if (class255.field3311) {
                    return method479(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, 0, arg3, arg2, this, this.field955, arg4);
                }
                return method466(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, 0, arg3, arg2, this, this.field955, arg4);
            }
            int var6 = this.field947 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field947 += arg1;
            if (this.field955 == 256 && (this.field944 & 255) == 0) {
                if (class255.field3311) {
                    arg1 = method478(0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, this.field949, this.field946, 0, var6, arg2, this);
                } else {
                    arg1 = method468(((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, this.field957, 0, var6, arg2, this);
                }
            } else if (class255.field3311) {
                arg1 = method465(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field954, this.field950, this.field949, this.field946, 0, var6, arg2, this, this.field955, arg4);
            } else {
                arg1 = method463(0, 0, ((class159) super.field6310).field1859, arg0, this.field944, arg1, this.field952, this.field957, 0, var6, arg2, this, this.field955, arg4);
            }
            this.field947 -= arg1;
            if (this.field947 != 0) {
                return arg1;
            }
        } while (!this.method472());
        return arg3;
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
    public final synchronized void method488(int arg0) {
        this.field951 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
    public final synchronized void method489(int arg0) {
        this.method494(arg0 << 6, this.method461());
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([B[IIIIIIILnp;)I")
    private static final int method490(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class77 arg8) {
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
        arg8.field944 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "([B[IIIIIIILnp;)I")
    private static final int method491(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class77 arg8) {
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
        arg8.field944 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I[B[IIIIIIIIIILnp;)I")
    private static final int method492(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class77 arg12) {
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
        arg12.field952 += (var19 - arg4) * arg12.field957;
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
        arg12.field954 = var15 >> 2;
        arg12.field950 = var16 >> 2;
        arg12.field944 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!np", name = "j", descriptor = "()Z")
    public final boolean method493() {
        return this.field944 < 0 || this.field944 >= ((class159) super.field6310).field1859.length << 8;
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(II)V")
    private final synchronized void method494(int arg0, int arg1) {
        this.field958 = arg0;
        this.field956 = arg1;
        this.field947 = 0;
        this.method462();
    }

    @OriginalMember(owner = "client!np", name = "k", descriptor = "()I")
    public final synchronized int method495() {
        return this.field955 < 0 ? -this.field955 : this.field955;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lve;II)Lnp;")
    public static final class77 method496(class159 arg0, int arg1, int arg2) {
        return arg0.field1859 != null && arg0.field1859.length != 0 ? new class77(arg0, (int) ((long) arg0.field1860 * 256L * (long) arg1 / (long) (class247.field3267 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!np", name = "l", descriptor = "()I")
    public final synchronized int method497() {
        return this.field958 == Integer.MIN_VALUE ? 0 : this.field958;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lve;II)V")
    private class77(class159 arg0, int arg1, int arg2) {
        super.field6310 = arg0;
        this.field953 = arg0.field1862;
        this.field948 = arg0.field1863;
        this.field945 = arg0.field1861;
        this.field955 = arg1;
        this.field958 = arg2;
        this.field956 = 8192;
        this.field944 = 0;
        this.method462();
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lve;III)V")
    private class77(class159 arg0, int arg1, int arg2, int arg3) {
        super.field6310 = arg0;
        this.field953 = arg0.field1862;
        this.field948 = arg0.field1863;
        this.field945 = arg0.field1861;
        this.field955 = arg1;
        this.field958 = arg2;
        this.field956 = arg3;
        this.field944 = 0;
        this.method462();
    }

    @OriginalMember(owner = "client!np", name = "h", descriptor = "(I)V")
    public final synchronized void method498(int arg0) {
        int var2 = ((class159) super.field6310).field1859.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field944 = arg0;
    }
}
