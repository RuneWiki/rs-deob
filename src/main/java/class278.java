import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class278 extends class160 {

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    private int field4222;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field4224;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Z")
    private boolean field4216;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    private int field4219;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    private int field4215;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    private int field4225;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field4223;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    private int field4217;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    private int field4220;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    private int field4221;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    private int field4226;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    private int field4227;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    private int field4228;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public final synchronized void method1789(boolean arg0) {
        this.field4219 = (this.field4219 >>> 31) + (this.field4219 ^ this.field4219 >> 31);
        if (arg0) {
            this.field4219 = -this.field4219;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1790(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class278 arg11, int arg12, int arg13) {
        arg11.field4221 -= arg11.field4217 * arg5;
        arg11.field4214 -= arg11.field4226 * arg5;
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
        arg11.field4221 += arg11.field4217 * arg5;
        arg11.field4214 += arg11.field4226 * arg5;
        arg11.field4220 = arg6;
        arg11.field4223 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()Lic;")
    public final class160 method195() {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    private final synchronized void method1791(int arg0) {
        this.method1812(arg0, this.method1810());
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([III)V")
    public final synchronized void method188(int[] arg0, int arg1, int arg2) {
        if (this.field4215 == 0 && this.field4227 == 0) {
            this.method190(arg2);
        } else {
            class295 var4 = (class295) super.field2313;
            int var5 = this.field4222 << 8;
            int var6 = this.field4224 << 8;
            int var7 = var4.field4669.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4228 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4223 < 0) {
                if (this.field4219 <= 0) {
                    this.method1822();
                    this.method1935(115);
                    return;
                }
                this.field4223 = 0;
            }
            if (this.field4223 >= var7) {
                if (this.field4219 >= 0) {
                    this.method1822();
                    this.method1935(100);
                    return;
                }
                this.field4223 = var7 - 1;
            }
            if (this.field4228 < 0) {
                if (this.field4216) {
                    if (this.field4219 < 0) {
                        var9 = this.method1803(arg0, arg1, var5, var10, var4.field4669[this.field4222]);
                        if (this.field4223 >= var5) {
                            return;
                        }
                        this.field4223 = var5 + var5 - 1 - this.field4223;
                        this.field4219 = -this.field4219;
                    }
                    while (true) {
                        int var11 = this.method1815(arg0, var9, var6, var10, var4.field4669[this.field4224 - 1]);
                        if (this.field4223 < var6) {
                            return;
                        }
                        this.field4223 = var6 + var6 - 1 - this.field4223;
                        this.field4219 = -this.field4219;
                        var9 = this.method1803(arg0, var11, var5, var10, var4.field4669[this.field4222]);
                        if (this.field4223 >= var5) {
                            return;
                        }
                        this.field4223 = var5 + var5 - 1 - this.field4223;
                        this.field4219 = -this.field4219;
                    }
                } else if (this.field4219 < 0) {
                    while (true) {
                        var9 = this.method1803(arg0, var9, var5, var10, var4.field4669[this.field4224 - 1]);
                        if (this.field4223 >= var5) {
                            return;
                        }
                        this.field4223 = var6 - 1 - (var6 - 1 - this.field4223) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1815(arg0, var9, var6, var10, var4.field4669[this.field4222]);
                        if (this.field4223 < var6) {
                            return;
                        }
                        this.field4223 = (this.field4223 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4228 > 0) {
                    if (this.field4216) {
                        label130: {
                            if (this.field4219 < 0) {
                                var9 = this.method1803(arg0, arg1, var5, var10, var4.field4669[this.field4222]);
                                if (this.field4223 >= var5) {
                                    return;
                                }
                                this.field4223 = var5 + var5 - 1 - this.field4223;
                                this.field4219 = -this.field4219;
                                if (--this.field4228 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1815(arg0, var9, var6, var10, var4.field4669[this.field4224 - 1]);
                                if (this.field4223 < var6) {
                                    return;
                                }
                                this.field4223 = var6 + var6 - 1 - this.field4223;
                                this.field4219 = -this.field4219;
                                if (--this.field4228 == 0) {
                                    break;
                                }
                                var9 = this.method1803(arg0, var9, var5, var10, var4.field4669[this.field4222]);
                                if (this.field4223 >= var5) {
                                    return;
                                }
                                this.field4223 = var5 + var5 - 1 - this.field4223;
                                this.field4219 = -this.field4219;
                            } while (--this.field4228 != 0);
                        }
                    } else if (this.field4219 < 0) {
                        while (true) {
                            var9 = this.method1803(arg0, var9, var5, var10, var4.field4669[this.field4224 - 1]);
                            if (this.field4223 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4223) / var8;
                            if (var12 >= this.field4228) {
                                this.field4223 += this.field4228 * var8;
                                this.field4228 = 0;
                                break;
                            }
                            this.field4223 += var8 * var12;
                            this.field4228 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1815(arg0, var9, var6, var10, var4.field4669[this.field4222]);
                            if (this.field4223 < var6) {
                                return;
                            }
                            int var13 = (this.field4223 - var5) / var8;
                            if (var13 >= this.field4228) {
                                this.field4223 -= this.field4228 * var8;
                                this.field4228 = 0;
                                break;
                            }
                            this.field4223 -= var8 * var13;
                            this.field4228 -= var13;
                        }
                    }
                }
                if (this.field4219 < 0) {
                    this.method1803(arg0, var9, 0, var10, 0);
                    if (this.field4223 < 0) {
                        this.field4223 = -1;
                        this.method1822();
                        this.method1935(103);
                        return;
                    }
                } else {
                    this.method1815(arg0, var9, var7, var10, 0);
                    if (this.field4223 >= var7) {
                        this.field4223 = var7;
                        this.method1822();
                        this.method1935(107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
    private final void method1792() {
        this.field4220 = this.field4215;
        this.field4221 = method1809(this.field4215, this.field4225);
        this.field4214 = method1826(this.field4215, this.field4225);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final synchronized void method190(int arg0) {
        if (this.field4227 > 0) {
            if (arg0 >= this.field4227) {
                if (this.field4215 == Integer.MIN_VALUE) {
                    this.field4215 = 0;
                    this.field4220 = this.field4221 = this.field4214 = 0;
                    this.method1935(102);
                    arg0 = this.field4227;
                }
                this.field4227 = 0;
                this.method1792();
            } else {
                this.field4220 += this.field4218 * arg0;
                this.field4221 += this.field4217 * arg0;
                this.field4214 += this.field4226 * arg0;
                this.field4227 -= arg0;
            }
        }
        class295 var2 = (class295) super.field2313;
        int var3 = this.field4222 << 8;
        int var4 = this.field4224 << 8;
        int var5 = var2.field4669.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4228 = 0;
        }
        if (this.field4223 < 0) {
            if (this.field4219 <= 0) {
                this.method1822();
                this.method1935(119);
                return;
            }
            this.field4223 = 0;
        }
        if (this.field4223 >= var5) {
            if (this.field4219 >= 0) {
                this.method1822();
                this.method1935(101);
                return;
            }
            this.field4223 = var5 - 1;
        }
        this.field4223 += this.field4219 * arg0;
        if (this.field4228 < 0) {
            if (!this.field4216) {
                if (this.field4219 < 0) {
                    if (this.field4223 < var3) {
                        this.field4223 = var4 - 1 - (var4 - 1 - this.field4223) % var6;
                    }
                } else if (this.field4223 >= var4) {
                    this.field4223 = (this.field4223 - var3) % var6 + var3;
                }
            } else {
                if (this.field4219 < 0) {
                    if (this.field4223 >= var3) {
                        return;
                    }
                    this.field4223 = var3 + var3 - 1 - this.field4223;
                    this.field4219 = -this.field4219;
                }
                while (this.field4223 >= var4) {
                    this.field4223 = var4 + var4 - 1 - this.field4223;
                    this.field4219 = -this.field4219;
                    if (this.field4223 >= var3) {
                        return;
                    }
                    this.field4223 = var3 + var3 - 1 - this.field4223;
                    this.field4219 = -this.field4219;
                }
            }
        } else {
            if (this.field4228 > 0) {
                if (this.field4216) {
                    label125: {
                        if (this.field4219 < 0) {
                            if (this.field4223 >= var3) {
                                return;
                            }
                            this.field4223 = var3 + var3 - 1 - this.field4223;
                            this.field4219 = -this.field4219;
                            if (--this.field4228 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4223 < var4) {
                                return;
                            }
                            this.field4223 = var4 + var4 - 1 - this.field4223;
                            this.field4219 = -this.field4219;
                            if (--this.field4228 == 0) {
                                break;
                            }
                            if (this.field4223 >= var3) {
                                return;
                            }
                            this.field4223 = var3 + var3 - 1 - this.field4223;
                            this.field4219 = -this.field4219;
                        } while (--this.field4228 != 0);
                    }
                } else if (this.field4219 < 0) {
                    if (this.field4223 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4223) / var6;
                    if (var7 < this.field4228) {
                        this.field4223 += var6 * var7;
                        this.field4228 -= var7;
                        return;
                    }
                    this.field4223 += this.field4228 * var6;
                    this.field4228 = 0;
                } else {
                    if (this.field4223 < var4) {
                        return;
                    }
                    int var8 = (this.field4223 - var3) / var6;
                    if (var8 < this.field4228) {
                        this.field4223 -= var6 * var8;
                        this.field4228 -= var8;
                        return;
                    }
                    this.field4223 -= this.field4228 * var6;
                    this.field4228 = 0;
                }
            }
            if (this.field4219 < 0) {
                if (this.field4223 < 0) {
                    this.field4223 = -1;
                    this.method1822();
                    this.method1935(104);
                    return;
                }
            } else if (this.field4223 >= var5) {
                this.field4223 = var5;
                this.method1822();
                this.method1935(120);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B[IIIIIIIILqe;)I")
    private static final int method1793(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class278 arg10) {
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
        arg10.field4223 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1794(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class278 arg11, int arg12, int arg13) {
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
        arg11.field4223 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()Lic;")
    public final class160 method196() {
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "()I")
    public final synchronized int method1795() {
        return this.field4219 < 0 ? -this.field4219 : this.field4219;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([B[IIIIIIIILqe;)I")
    private static final int method1796(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class278 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4221 += (var14 - arg3) * arg9.field4217;
        arg9.field4214 += (var14 - arg3) * arg9.field4226;
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
        arg9.field4220 = var12 >> 2;
        arg9.field4223 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B[IIIIIIIIIILqe;)I")
    private static final int method1797(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class278 arg12) {
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
        arg12.field4220 += (var19 - arg4) * arg12.field4218;
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
        arg12.field4221 = var15 >> 2;
        arg12.field4214 = var16 >> 2;
        arg12.field4223 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([B[IIIIIIILqe;)I")
    private static final int method1798(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class278 arg8) {
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
        arg8.field4223 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[B[IIIIIIILqe;II)I")
    private static final int method1799(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class278 arg10, int arg11, int arg12) {
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
        arg10.field4223 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public final synchronized void method1800(int arg0) {
        int var2 = ((class295) super.field2313).field4669.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4223 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    public final synchronized void method1801(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1812(arg1, arg2);
        } else {
            int var4 = method1809(arg1, arg2);
            int var5 = method1826(arg1, arg2);
            if (this.field4221 == var4 && this.field4214 == var5) {
                this.field4227 = 0;
            } else {
                int var6 = arg1 - this.field4220;
                if (this.field4220 - arg1 > var6) {
                    var6 = this.field4220 - arg1;
                }
                if (var4 - this.field4221 > var6) {
                    var6 = var4 - this.field4221;
                }
                if (this.field4221 - var4 > var6) {
                    var6 = this.field4221 - var4;
                }
                if (var5 - this.field4214 > var6) {
                    var6 = var5 - this.field4214;
                }
                if (this.field4214 - var5 > var6) {
                    var6 = this.field4214 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4227 = arg0;
                this.field4215 = arg1;
                this.field4225 = arg2;
                this.field4218 = (arg1 - this.field4220) / arg0;
                this.field4217 = (var4 - this.field4221) / arg0;
                this.field4226 = (var5 - this.field4214) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public final synchronized void method1802(int arg0) {
        if (arg0 == 0) {
            this.method1791(0);
            this.method1935(103);
        } else if (this.field4221 == 0 && this.field4214 == 0) {
            this.field4227 = 0;
            this.field4215 = 0;
            this.field4220 = 0;
            this.method1935(110);
        } else {
            int var2 = -this.field4220;
            if (this.field4220 > var2) {
                var2 = this.field4220;
            }
            if (-this.field4221 > var2) {
                var2 = -this.field4221;
            }
            if (this.field4221 > var2) {
                var2 = this.field4221;
            }
            if (-this.field4214 > var2) {
                var2 = -this.field4214;
            }
            if (this.field4214 > var2) {
                var2 = this.field4214;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4227 = arg0;
            this.field4215 = Integer.MIN_VALUE;
            this.field4218 = -this.field4220 / arg0;
            this.field4217 = -this.field4221 / arg0;
            this.field4226 = -this.field4214 / arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([IIIII)I")
    private final int method1803(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4227 <= 0) {
                if (this.field4219 == -256 && (this.field4223 & 255) == 0) {
                    if (class152.field2211) {
                        return method1793(0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, 0, arg3, arg2, this);
                    }
                    return method1798(((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, 0, arg3, arg2, this);
                }
                if (class152.field2211) {
                    return method1794(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, 0, arg3, arg2, this, this.field4219, arg4);
                }
                return method1799(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, 0, arg3, arg2, this, this.field4219, arg4);
            }
            int var6 = this.field4227 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4227 += arg1;
            if (this.field4219 == -256 && (this.field4223 & 255) == 0) {
                if (class152.field2211) {
                    arg1 = method1806(0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, this.field4217, this.field4226, 0, var6, arg2, this);
                } else {
                    arg1 = method1796(((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, this.field4218, 0, var6, arg2, this);
                }
            } else if (class152.field2211) {
                arg1 = method1818(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, this.field4217, this.field4226, 0, var6, arg2, this, this.field4219, arg4);
            } else {
                arg1 = method1790(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, this.field4218, 0, var6, arg2, this, this.field4219, arg4);
            }
            this.field4227 -= arg1;
            if (this.field4227 != 0) {
                return arg1;
            }
        } while (!this.method1807());
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lik;III)Lqe;")
    public static final class278 method1804(class295 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4669 != null && arg0.field4669.length != 0 ? new class278(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[B[IIIIIIIIIILqe;II)I")
    private static final int method1805(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class278 arg13, int arg14, int arg15) {
        arg13.field4220 -= arg13.field4218 * arg5;
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
        arg13.field4220 += arg13.field4218 * var22;
        arg13.field4221 = arg6;
        arg13.field4214 = arg7;
        arg13.field4223 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I[B[IIIIIIIIIILqe;)I")
    private static final int method1806(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class278 arg12) {
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
        arg12.field4220 += (var19 - arg4) * arg12.field4218;
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
        arg12.field4221 = var15 >> 2;
        arg12.field4214 = var16 >> 2;
        arg12.field4223 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "()Z")
    private final boolean method1807() {
        int var1 = this.field4215;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1809(var1, this.field4225);
            var2 = method1826(var1, this.field4225);
        }
        if (this.field4220 == var1 && this.field4221 == var3 && this.field4214 == var2) {
            if (this.field4215 == Integer.MIN_VALUE) {
                this.field4215 = 0;
                this.field4220 = this.field4221 = this.field4214 = 0;
                this.method1935(105);
                return true;
            } else {
                this.method1792();
                return false;
            }
        } else {
            if (this.field4220 < var1) {
                this.field4218 = 1;
                this.field4227 = var1 - this.field4220;
            } else if (this.field4220 > var1) {
                this.field4218 = -1;
                this.field4227 = this.field4220 - var1;
            } else {
                this.field4218 = 0;
            }
            if (this.field4221 < var3) {
                this.field4217 = 1;
                if (this.field4227 == 0 || this.field4227 > var3 - this.field4221) {
                    this.field4227 = var3 - this.field4221;
                }
            } else if (this.field4221 > var3) {
                this.field4217 = -1;
                if (this.field4227 == 0 || this.field4227 > this.field4221 - var3) {
                    this.field4227 = this.field4221 - var3;
                }
            } else {
                this.field4217 = 0;
            }
            if (this.field4214 < var2) {
                this.field4226 = 1;
                if (this.field4227 == 0 || this.field4227 > var2 - this.field4214) {
                    this.field4227 = var2 - this.field4214;
                }
            } else if (this.field4214 > var2) {
                this.field4226 = -1;
                if (this.field4227 == 0 || this.field4227 > this.field4214 - var2) {
                    this.field4227 = this.field4214 - var2;
                }
            } else {
                this.field4226 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "()Z")
    public final boolean method1808() {
        return this.field4223 < 0 || this.field4223 >= ((class295) super.field2313).field4669.length << 8;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    private static final int method1809(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "()I")
    public final synchronized int method1810() {
        return this.field4225 < 0 ? -1 : this.field4225;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I[B[IIIIIIIILqe;)I")
    private static final int method1811(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class278 arg10) {
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
        arg10.field4223 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
    private final synchronized void method1812(int arg0, int arg1) {
        this.field4215 = arg0;
        this.field4225 = arg1;
        this.field4227 = 0;
        this.method1792();
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
    public final synchronized void method1813(int arg0) {
        this.field4228 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()I")
    public final int method1063() {
        int var1 = this.field4220 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4228 == 0) {
            var2 -= this.field4223 * var2 / (((class295) super.field2313).field4669.length << 8);
        } else if (this.field4228 >= 0) {
            var2 -= this.field4222 * var2 / ((class295) super.field2313).field4669.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([B[IIIIIIILqe;)I")
    private static final int method1814(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class278 arg8) {
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
        arg8.field4223 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([IIIII)I")
    private final int method1815(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4227 <= 0) {
                if (this.field4219 == 256 && (this.field4223 & 255) == 0) {
                    if (class152.field2211) {
                        return method1811(0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, 0, arg3, arg2, this);
                    }
                    return method1814(((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, 0, arg3, arg2, this);
                }
                if (class152.field2211) {
                    return method1819(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, 0, arg3, arg2, this, this.field4219, arg4);
                }
                return method1827(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, 0, arg3, arg2, this, this.field4219, arg4);
            }
            int var6 = this.field4227 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4227 += arg1;
            if (this.field4219 == 256 && (this.field4223 & 255) == 0) {
                if (class152.field2211) {
                    arg1 = method1797(0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, this.field4217, this.field4226, 0, var6, arg2, this);
                } else {
                    arg1 = method1823(((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, this.field4218, 0, var6, arg2, this);
                }
            } else if (class152.field2211) {
                arg1 = method1805(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4221, this.field4214, this.field4217, this.field4226, 0, var6, arg2, this, this.field4219, arg4);
            } else {
                arg1 = method1825(0, 0, ((class295) super.field2313).field4669, arg0, this.field4223, arg1, this.field4220, this.field4218, 0, var6, arg2, this, this.field4219, arg4);
            }
            this.field4227 -= arg1;
            if (this.field4227 != 0) {
                return arg1;
            }
        } while (!this.method1807());
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "()Z")
    public final boolean method1816() {
        return this.field4227 != 0;
    }

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "()I")
    public final synchronized int method1817() {
        return this.field4215 == Integer.MIN_VALUE ? 0 : this.field4215;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II[B[IIIIIIIIIILqe;II)I")
    private static final int method1818(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class278 arg13, int arg14, int arg15) {
        arg13.field4220 -= arg13.field4218 * arg5;
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
        arg13.field4220 += arg13.field4218 * var22;
        arg13.field4221 = arg6;
        arg13.field4214 = arg7;
        arg13.field4223 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1819(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class278 arg11, int arg12, int arg13) {
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
        arg11.field4223 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)V")
    public final synchronized void method1820(int arg0, int arg1) {
        this.method1801(arg0, arg1, this.method1810());
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lik;II)Lqe;")
    public static final class278 method1821(class295 arg0, int arg1, int arg2) {
        return arg0.field4669 != null && arg0.field4669.length != 0 ? new class278(arg0, (int) ((long) arg0.field4665 * 256L * (long) arg1 / (long) (class50.field571 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "()V")
    private final void method1822() {
        if (this.field4227 != 0) {
            if (this.field4215 == Integer.MIN_VALUE) {
                this.field4215 = 0;
            }
            this.field4227 = 0;
            this.method1792();
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
    public final int method193() {
        return this.field4215 == 0 && this.field4227 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([B[IIIIIIIILqe;)I")
    private static final int method1823(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class278 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4221 += (var14 - arg3) * arg9.field4217;
        arg9.field4214 += (var14 - arg3) * arg9.field4226;
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
        arg9.field4220 = var12 >> 2;
        arg9.field4223 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)V")
    public final synchronized void method1824(int arg0) {
        if (this.field4219 < 0) {
            this.field4219 = -arg0;
        } else {
            this.field4219 = arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II[B[IIIIIIIILqe;II)I")
    private static final int method1825(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class278 arg11, int arg12, int arg13) {
        arg11.field4221 -= arg11.field4217 * arg5;
        arg11.field4214 -= arg11.field4226 * arg5;
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
        arg11.field4221 += arg11.field4217 * arg5;
        arg11.field4214 += arg11.field4226 * arg5;
        arg11.field4220 = arg6;
        arg11.field4223 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lik;II)V")
    private class278(class295 arg0, int arg1, int arg2) {
        super.field2313 = arg0;
        this.field4222 = arg0.field4666;
        this.field4224 = arg0.field4667;
        this.field4216 = arg0.field4668;
        this.field4219 = arg1;
        this.field4215 = arg2;
        this.field4225 = 8192;
        this.field4223 = 0;
        this.method1792();
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lik;III)V")
    private class278(class295 arg0, int arg1, int arg2, int arg3) {
        super.field2313 = arg0;
        this.field4222 = arg0.field4666;
        this.field4224 = arg0.field4667;
        this.field4216 = arg0.field4668;
        this.field4219 = arg1;
        this.field4215 = arg2;
        this.field4225 = arg3;
        this.field4223 = 0;
        this.method1792();
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)I")
    private static final int method1826(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II[B[IIIIIIILqe;II)I")
    private static final int method1827(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class278 arg10, int arg11, int arg12) {
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
        arg10.field4223 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
    public final synchronized void method1828(int arg0) {
        this.method1812(arg0 << 6, this.method1810());
    }
}
