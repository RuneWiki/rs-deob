import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 extends class304 {

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "Z")
    private boolean field214;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([IIIII)I")
    private final int method135(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field217 <= 0) {
                if (this.field221 == -256 && (this.field211 & 255) == 0) {
                    if (class241.field3572) {
                        return method137(0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, 0, arg3, arg2, this);
                    }
                    return method141(((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, 0, arg3, arg2, this);
                }
                if (class241.field3572) {
                    return method156(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, 0, arg3, arg2, this, this.field221, arg4);
                }
                return method152(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, 0, arg3, arg2, this, this.field221, arg4);
            }
            int var6 = this.field217 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field217 += arg1;
            if (this.field221 == -256 && (this.field211 & 255) == 0) {
                if (class241.field3572) {
                    arg1 = method180(0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, this.field215, this.field209, 0, var6, arg2, this);
                } else {
                    arg1 = method140(((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, this.field220, 0, var6, arg2, this);
                }
            } else if (class241.field3572) {
                arg1 = method158(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, this.field215, this.field209, 0, var6, arg2, this, this.field221, arg4);
            } else {
                arg1 = method145(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, this.field220, 0, var6, arg2, this, this.field221, arg4);
            }
            this.field217 -= arg1;
            if (this.field217 != 0) {
                return arg1;
            }
        } while (!this.method144());
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public final synchronized void method136(int arg0) {
        if (this.field217 > 0) {
            if (arg0 >= this.field217) {
                if (this.field219 == Integer.MIN_VALUE) {
                    this.field219 = 0;
                    this.field212 = this.field222 = this.field223 = 0;
                    this.method1525((byte) -54);
                    arg0 = this.field217;
                }
                this.field217 = 0;
                this.method160();
            } else {
                this.field212 += this.field220 * arg0;
                this.field222 += this.field215 * arg0;
                this.field223 += this.field209 * arg0;
                this.field217 -= arg0;
            }
        }
        class217 var2 = (class217) super.field4329;
        int var3 = this.field210 << 8;
        int var4 = this.field218 << 8;
        int var5 = var2.field3136.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field213 = 0;
        }
        if (this.field211 < 0) {
            if (this.field221 <= 0) {
                this.method154();
                this.method1525((byte) -126);
                return;
            }
            this.field211 = 0;
        }
        if (this.field211 >= var5) {
            if (this.field221 >= 0) {
                this.method154();
                this.method1525((byte) -42);
                return;
            }
            this.field211 = var5 - 1;
        }
        this.field211 += this.field221 * arg0;
        if (this.field213 < 0) {
            if (!this.field214) {
                if (this.field221 < 0) {
                    if (this.field211 < var3) {
                        this.field211 = var4 - 1 - (var4 - 1 - this.field211) % var6;
                    }
                } else if (this.field211 >= var4) {
                    this.field211 = (this.field211 - var3) % var6 + var3;
                }
            } else {
                if (this.field221 < 0) {
                    if (this.field211 >= var3) {
                        return;
                    }
                    this.field211 = var3 + var3 - 1 - this.field211;
                    this.field221 = -this.field221;
                }
                while (this.field211 >= var4) {
                    this.field211 = var4 + var4 - 1 - this.field211;
                    this.field221 = -this.field221;
                    if (this.field211 >= var3) {
                        return;
                    }
                    this.field211 = var3 + var3 - 1 - this.field211;
                    this.field221 = -this.field221;
                }
            }
        } else {
            if (this.field213 > 0) {
                if (this.field214) {
                    label125: {
                        if (this.field221 < 0) {
                            if (this.field211 >= var3) {
                                return;
                            }
                            this.field211 = var3 + var3 - 1 - this.field211;
                            this.field221 = -this.field221;
                            if (--this.field213 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field211 < var4) {
                                return;
                            }
                            this.field211 = var4 + var4 - 1 - this.field211;
                            this.field221 = -this.field221;
                            if (--this.field213 == 0) {
                                break;
                            }
                            if (this.field211 >= var3) {
                                return;
                            }
                            this.field211 = var3 + var3 - 1 - this.field211;
                            this.field221 = -this.field221;
                        } while (--this.field213 != 0);
                    }
                } else if (this.field221 < 0) {
                    if (this.field211 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field211) / var6;
                    if (var7 < this.field213) {
                        this.field211 += var6 * var7;
                        this.field213 -= var7;
                        return;
                    }
                    this.field211 += this.field213 * var6;
                    this.field213 = 0;
                } else {
                    if (this.field211 < var4) {
                        return;
                    }
                    int var8 = (this.field211 - var3) / var6;
                    if (var8 < this.field213) {
                        this.field211 -= var6 * var8;
                        this.field213 -= var8;
                        return;
                    }
                    this.field211 -= this.field213 * var6;
                    this.field213 = 0;
                }
            }
            if (this.field221 < 0) {
                if (this.field211 < 0) {
                    this.field211 = -1;
                    this.method154();
                    this.method1525((byte) -120);
                    return;
                }
            } else if (this.field211 >= var5) {
                this.field211 = var5;
                this.method154();
                this.method1525((byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[B[IIIIIIIILqo;)I")
    private static final int method137(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class19 arg10) {
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
        arg10.field211 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    public final synchronized void method138(boolean arg0) {
        this.field221 = (this.field221 >>> 31) + (this.field221 ^ this.field221 >> 31);
        if (arg0) {
            this.field221 = -this.field221;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[B[IIIIIIIILqo;II)I")
    private static final int method139(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class19 arg11, int arg12, int arg13) {
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
        arg11.field211 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([B[IIIIIIIILqo;)I")
    private static final int method140(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class19 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field222 += (var14 - arg3) * arg9.field215;
        arg9.field223 += (var14 - arg3) * arg9.field209;
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
        arg9.field212 = var12 >> 2;
        arg9.field211 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([B[IIIIIIILqo;)I")
    private static final int method141(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class19 arg8) {
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
        arg8.field211 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)I")
    private static final int method142(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()I")
    public final int method143() {
        return this.field219 == 0 && this.field217 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "()Z")
    private final boolean method144() {
        int var1 = this.field219;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method142(var1, this.field216);
            var2 = method174(var1, this.field216);
        }
        if (this.field212 == var1 && this.field222 == var3 && this.field223 == var2) {
            if (this.field219 == Integer.MIN_VALUE) {
                this.field219 = 0;
                this.field212 = this.field222 = this.field223 = 0;
                this.method1525((byte) -79);
                return true;
            } else {
                this.method160();
                return false;
            }
        } else {
            if (this.field212 < var1) {
                this.field220 = 1;
                this.field217 = var1 - this.field212;
            } else if (this.field212 > var1) {
                this.field220 = -1;
                this.field217 = this.field212 - var1;
            } else {
                this.field220 = 0;
            }
            if (this.field222 < var3) {
                this.field215 = 1;
                if (this.field217 == 0 || this.field217 > var3 - this.field222) {
                    this.field217 = var3 - this.field222;
                }
            } else if (this.field222 > var3) {
                this.field215 = -1;
                if (this.field217 == 0 || this.field217 > this.field222 - var3) {
                    this.field217 = this.field222 - var3;
                }
            } else {
                this.field215 = 0;
            }
            if (this.field223 < var2) {
                this.field209 = 1;
                if (this.field217 == 0 || this.field217 > var2 - this.field223) {
                    this.field217 = var2 - this.field223;
                }
            } else if (this.field223 > var2) {
                this.field209 = -1;
                if (this.field217 == 0 || this.field217 > this.field223 - var2) {
                    this.field217 = this.field223 - var2;
                }
            } else {
                this.field209 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II[B[IIIIIIIILqo;II)I")
    private static final int method145(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class19 arg11, int arg12, int arg13) {
        arg11.field222 -= arg11.field215 * arg5;
        arg11.field223 -= arg11.field209 * arg5;
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
        arg11.field222 += arg11.field215 * arg5;
        arg11.field223 += arg11.field209 * arg5;
        arg11.field212 = arg6;
        arg11.field211 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public final synchronized void method146(int arg0) {
        this.field213 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([III)V")
    public final synchronized void method147(int[] arg0, int arg1, int arg2) {
        if (this.field219 == 0 && this.field217 == 0) {
            this.method136(arg2);
        } else {
            class217 var4 = (class217) super.field4329;
            int var5 = this.field210 << 8;
            int var6 = this.field218 << 8;
            int var7 = var4.field3136.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field213 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field211 < 0) {
                if (this.field221 <= 0) {
                    this.method154();
                    this.method1525((byte) -99);
                    return;
                }
                this.field211 = 0;
            }
            if (this.field211 >= var7) {
                if (this.field221 >= 0) {
                    this.method154();
                    this.method1525((byte) 103);
                    return;
                }
                this.field211 = var7 - 1;
            }
            if (this.field213 < 0) {
                if (this.field214) {
                    if (this.field221 < 0) {
                        var9 = this.method135(arg0, arg1, var5, var10, var4.field3136[this.field210]);
                        if (this.field211 >= var5) {
                            return;
                        }
                        this.field211 = var5 + var5 - 1 - this.field211;
                        this.field221 = -this.field221;
                    }
                    while (true) {
                        int var11 = this.method167(arg0, var9, var6, var10, var4.field3136[this.field218 - 1]);
                        if (this.field211 < var6) {
                            return;
                        }
                        this.field211 = var6 + var6 - 1 - this.field211;
                        this.field221 = -this.field221;
                        var9 = this.method135(arg0, var11, var5, var10, var4.field3136[this.field210]);
                        if (this.field211 >= var5) {
                            return;
                        }
                        this.field211 = var5 + var5 - 1 - this.field211;
                        this.field221 = -this.field221;
                    }
                } else if (this.field221 < 0) {
                    while (true) {
                        var9 = this.method135(arg0, var9, var5, var10, var4.field3136[this.field218 - 1]);
                        if (this.field211 >= var5) {
                            return;
                        }
                        this.field211 = var6 - 1 - (var6 - 1 - this.field211) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method167(arg0, var9, var6, var10, var4.field3136[this.field210]);
                        if (this.field211 < var6) {
                            return;
                        }
                        this.field211 = (this.field211 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field213 > 0) {
                    if (this.field214) {
                        label130: {
                            if (this.field221 < 0) {
                                var9 = this.method135(arg0, arg1, var5, var10, var4.field3136[this.field210]);
                                if (this.field211 >= var5) {
                                    return;
                                }
                                this.field211 = var5 + var5 - 1 - this.field211;
                                this.field221 = -this.field221;
                                if (--this.field213 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method167(arg0, var9, var6, var10, var4.field3136[this.field218 - 1]);
                                if (this.field211 < var6) {
                                    return;
                                }
                                this.field211 = var6 + var6 - 1 - this.field211;
                                this.field221 = -this.field221;
                                if (--this.field213 == 0) {
                                    break;
                                }
                                var9 = this.method135(arg0, var9, var5, var10, var4.field3136[this.field210]);
                                if (this.field211 >= var5) {
                                    return;
                                }
                                this.field211 = var5 + var5 - 1 - this.field211;
                                this.field221 = -this.field221;
                            } while (--this.field213 != 0);
                        }
                    } else if (this.field221 < 0) {
                        while (true) {
                            var9 = this.method135(arg0, var9, var5, var10, var4.field3136[this.field218 - 1]);
                            if (this.field211 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field211) / var8;
                            if (var12 >= this.field213) {
                                this.field211 += this.field213 * var8;
                                this.field213 = 0;
                                break;
                            }
                            this.field211 += var8 * var12;
                            this.field213 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method167(arg0, var9, var6, var10, var4.field3136[this.field210]);
                            if (this.field211 < var6) {
                                return;
                            }
                            int var13 = (this.field211 - var5) / var8;
                            if (var13 >= this.field213) {
                                this.field211 -= this.field213 * var8;
                                this.field213 = 0;
                                break;
                            }
                            this.field211 -= var8 * var13;
                            this.field213 -= var13;
                        }
                    }
                }
                if (this.field221 < 0) {
                    this.method135(arg0, var9, 0, var10, 0);
                    if (this.field211 < 0) {
                        this.field211 = -1;
                        this.method154();
                        this.method1525((byte) -120);
                        return;
                    }
                } else {
                    this.method167(arg0, var9, var7, var10, 0);
                    if (this.field211 >= var7) {
                        this.field211 = var7;
                        this.method154();
                        this.method1525((byte) -53);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "()Z")
    public final boolean method148() {
        return this.field211 < 0 || this.field211 >= ((class217) super.field4329).field3136.length << 8;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I[B[IIIIIIIILqo;)I")
    private static final int method149(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class19 arg10) {
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
        arg10.field211 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[B[IIIIIIIIIILqo;)I")
    private static final int method150(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class19 arg12) {
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
        arg12.field212 += (var19 - arg4) * arg12.field220;
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
        arg12.field222 = var15 >> 2;
        arg12.field223 = var16 >> 2;
        arg12.field211 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()Lti;")
    public final class304 method151() {
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[B[IIIIIIILqo;II)I")
    private static final int method152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class19 arg10, int arg11, int arg12) {
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
        arg10.field211 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()I")
    public final int method153() {
        int var1 = this.field212 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field213 == 0) {
            var2 -= this.field211 * var2 / (((class217) super.field4329).field3136.length << 8);
        } else if (this.field213 >= 0) {
            var2 -= this.field210 * var2 / ((class217) super.field4329).field3136.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "()V")
    private final void method154() {
        if (this.field217 != 0) {
            if (this.field219 == Integer.MIN_VALUE) {
                this.field219 = 0;
            }
            this.field217 = 0;
            this.method160();
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
    public final synchronized void method155(int arg0) {
        if (this.field221 < 0) {
            this.field221 = -arg0;
        } else {
            this.field221 = arg0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(II[B[IIIIIIIILqo;II)I")
    private static final int method156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class19 arg11, int arg12, int arg13) {
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
        arg11.field211 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "()I")
    public final synchronized int method157() {
        return this.field219 == Integer.MIN_VALUE ? 0 : this.field219;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[B[IIIIIIIIIILqo;II)I")
    private static final int method158(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class19 arg13, int arg14, int arg15) {
        arg13.field212 -= arg13.field220 * arg5;
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
        arg13.field212 += arg13.field220 * var22;
        arg13.field222 = arg6;
        arg13.field223 = arg7;
        arg13.field211 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II[B[IIIIIIIIIILqo;II)I")
    private static final int method159(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class19 arg13, int arg14, int arg15) {
        arg13.field212 -= arg13.field220 * arg5;
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
        arg13.field212 += arg13.field220 * var22;
        arg13.field222 = arg6;
        arg13.field223 = arg7;
        arg13.field211 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "()V")
    private final void method160() {
        this.field212 = this.field219;
        this.field222 = method142(this.field219, this.field216);
        this.field223 = method174(this.field219, this.field216);
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
    public final synchronized void method161(int arg0) {
        int var2 = ((class217) super.field4329).field3136.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field211 = arg0;
    }

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "()I")
    public final synchronized int method162() {
        return this.field216 < 0 ? -1 : this.field216;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
    private final synchronized void method163(int arg0, int arg1) {
        this.field219 = arg0;
        this.field216 = arg1;
        this.field217 = 0;
        this.method160();
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "([B[IIIIIIILqo;)I")
    private static final int method164(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class19 arg8) {
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
        arg8.field211 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II[B[IIIIIIILqo;II)I")
    private static final int method165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class19 arg10, int arg11, int arg12) {
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
        arg10.field211 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)V")
    public final synchronized void method166(int arg0) {
        this.method163(arg0 << 6, this.method162());
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "([IIIII)I")
    private final int method167(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field217 <= 0) {
                if (this.field221 == 256 && (this.field211 & 255) == 0) {
                    if (class241.field3572) {
                        return method149(0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, 0, arg3, arg2, this);
                    }
                    return method164(((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, 0, arg3, arg2, this);
                }
                if (class241.field3572) {
                    return method139(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, 0, arg3, arg2, this, this.field221, arg4);
                }
                return method165(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, 0, arg3, arg2, this, this.field221, arg4);
            }
            int var6 = this.field217 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field217 += arg1;
            if (this.field221 == 256 && (this.field211 & 255) == 0) {
                if (class241.field3572) {
                    arg1 = method150(0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, this.field215, this.field209, 0, var6, arg2, this);
                } else {
                    arg1 = method171(((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, this.field220, 0, var6, arg2, this);
                }
            } else if (class241.field3572) {
                arg1 = method159(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field222, this.field223, this.field215, this.field209, 0, var6, arg2, this, this.field221, arg4);
            } else {
                arg1 = method170(0, 0, ((class217) super.field4329).field3136, arg0, this.field211, arg1, this.field212, this.field220, 0, var6, arg2, this, this.field221, arg4);
            }
            this.field217 -= arg1;
            if (this.field217 != 0) {
                return arg1;
            }
        } while (!this.method144());
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public final synchronized void method168(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method163(arg1, arg2);
        } else {
            int var4 = method142(arg1, arg2);
            int var5 = method174(arg1, arg2);
            if (this.field222 == var4 && this.field223 == var5) {
                this.field217 = 0;
            } else {
                int var6 = arg1 - this.field212;
                if (this.field212 - arg1 > var6) {
                    var6 = this.field212 - arg1;
                }
                if (var4 - this.field222 > var6) {
                    var6 = var4 - this.field222;
                }
                if (this.field222 - var4 > var6) {
                    var6 = this.field222 - var4;
                }
                if (var5 - this.field223 > var6) {
                    var6 = var5 - this.field223;
                }
                if (this.field223 - var5 > var6) {
                    var6 = this.field223 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field217 = arg0;
                this.field219 = arg1;
                this.field216 = arg2;
                this.field220 = (arg1 - this.field212) / arg0;
                this.field215 = (var4 - this.field222) / arg0;
                this.field209 = (var5 - this.field223) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(II)V")
    public final synchronized void method169(int arg0, int arg1) {
        this.method168(arg0, arg1, this.method162());
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(II[B[IIIIIIIILqo;II)I")
    private static final int method170(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class19 arg11, int arg12, int arg13) {
        arg11.field222 -= arg11.field215 * arg5;
        arg11.field223 -= arg11.field209 * arg5;
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
        arg11.field222 += arg11.field215 * arg5;
        arg11.field223 += arg11.field209 * arg5;
        arg11.field212 = arg6;
        arg11.field211 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "([B[IIIIIIIILqo;)I")
    private static final int method171(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class19 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field222 += (var14 - arg3) * arg9.field215;
        arg9.field223 += (var14 - arg3) * arg9.field209;
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
        arg9.field212 = var12 >> 2;
        arg9.field211 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "()I")
    public final synchronized int method172() {
        return this.field221 < 0 ? -this.field221 : this.field221;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()Lti;")
    public final class304 method173() {
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(II)I")
    private static final int method174(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljs;III)Lqo;")
    public static final class19 method175(class217 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3136 != null && arg0.field3136.length != 0 ? new class19(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "()Z")
    public final boolean method176() {
        return this.field217 != 0;
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)V")
    private final synchronized void method177(int arg0) {
        this.method163(arg0, this.method162());
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljs;II)Lqo;")
    public static final class19 method178(class217 arg0, int arg1, int arg2) {
        return arg0.field3136 != null && arg0.field3136.length != 0 ? new class19(arg0, (int) ((long) arg0.field3138 * 256L * (long) arg1 / (long) (class405.field6017 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)V")
    public final synchronized void method179(int arg0) {
        if (arg0 == 0) {
            this.method177(0);
            this.method1525((byte) 112);
        } else if (this.field222 == 0 && this.field223 == 0) {
            this.field217 = 0;
            this.field219 = 0;
            this.field212 = 0;
            this.method1525((byte) 124);
        } else {
            int var2 = -this.field212;
            if (this.field212 > var2) {
                var2 = this.field212;
            }
            if (-this.field222 > var2) {
                var2 = -this.field222;
            }
            if (this.field222 > var2) {
                var2 = this.field222;
            }
            if (-this.field223 > var2) {
                var2 = -this.field223;
            }
            if (this.field223 > var2) {
                var2 = this.field223;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field217 = arg0;
            this.field219 = Integer.MIN_VALUE;
            this.field220 = -this.field212 / arg0;
            this.field215 = -this.field222 / arg0;
            this.field209 = -this.field223 / arg0;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ljs;II)V")
    private class19(class217 arg0, int arg1, int arg2) {
        super.field4329 = arg0;
        this.field210 = arg0.field3135;
        this.field218 = arg0.field3134;
        this.field214 = arg0.field3137;
        this.field221 = arg1;
        this.field219 = arg2;
        this.field216 = 8192;
        this.field211 = 0;
        this.method160();
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I[B[IIIIIIIIIILqo;)I")
    private static final int method180(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class19 arg12) {
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
        arg12.field212 += (var19 - arg4) * arg12.field220;
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
        arg12.field222 = var15 >> 2;
        arg12.field223 = var16 >> 2;
        arg12.field211 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ljs;III)V")
    private class19(class217 arg0, int arg1, int arg2, int arg3) {
        super.field4329 = arg0;
        this.field210 = arg0.field3135;
        this.field218 = arg0.field3134;
        this.field214 = arg0.field3137;
        this.field221 = arg1;
        this.field219 = arg2;
        this.field216 = arg3;
        this.field211 = 0;
        this.method160();
    }
}
