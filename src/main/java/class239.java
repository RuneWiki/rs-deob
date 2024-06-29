import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class239 extends class117 {

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    private int field4260;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Z")
    private boolean field4251;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    private int field4256;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    private int field4250;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    private int field4248;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private int field4249;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[B[IIIIIIIILga;II)I")
    private static final int method1597(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
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
        arg11.field4258 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II[B[IIIIIIIILga;II)I")
    private static final int method1598(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        arg11.field4253 -= arg11.field4254 * arg5;
        arg11.field4249 -= arg11.field4247 * arg5;
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
        arg11.field4253 += arg11.field4254 * arg5;
        arg11.field4249 += arg11.field4247 * arg5;
        arg11.field4248 = arg6;
        arg11.field4258 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B[IIIIIIIIIILga;)I")
    private static final int method1599(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class239 arg12) {
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
        arg12.field4248 += (var19 - arg4) * arg12.field4259;
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
        arg12.field4253 = var15 >> 2;
        arg12.field4249 = var16 >> 2;
        arg12.field4258 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "()Z")
    public final boolean method1600() {
        return this.field4252 != 0;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "()I")
    public final synchronized int method1601() {
        return this.field4246 < 0 ? -this.field4246 : this.field4246;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final synchronized void method696(int arg0) {
        if (this.field4252 > 0) {
            if (arg0 >= this.field4252) {
                if (this.field4256 == Integer.MIN_VALUE) {
                    this.field4256 = 0;
                    this.field4248 = this.field4253 = this.field4249 = 0;
                    this.method797((byte) 106);
                    arg0 = this.field4252;
                }
                this.field4252 = 0;
                this.method1633();
            } else {
                this.field4248 += this.field4259 * arg0;
                this.field4253 += this.field4254 * arg0;
                this.field4249 += this.field4247 * arg0;
                this.field4252 -= arg0;
            }
        }
        class89 var2 = (class89) super.field1684;
        int var3 = this.field4260 << 8;
        int var4 = this.field4257 << 8;
        int var5 = var2.field1305.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4255 = 0;
        }
        if (this.field4258 < 0) {
            if (this.field4246 <= 0) {
                this.method1603();
                this.method797((byte) 99);
                return;
            }
            this.field4258 = 0;
        }
        if (this.field4258 >= var5) {
            if (this.field4246 >= 0) {
                this.method1603();
                this.method797((byte) 120);
                return;
            }
            this.field4258 = var5 - 1;
        }
        this.field4258 += this.field4246 * arg0;
        if (this.field4255 < 0) {
            if (!this.field4251) {
                if (this.field4246 < 0) {
                    if (this.field4258 < var3) {
                        this.field4258 = var4 - 1 - (var4 - 1 - this.field4258) % var6;
                    }
                } else if (this.field4258 >= var4) {
                    this.field4258 = (this.field4258 - var3) % var6 + var3;
                }
            } else {
                if (this.field4246 < 0) {
                    if (this.field4258 >= var3) {
                        return;
                    }
                    this.field4258 = var3 + var3 - 1 - this.field4258;
                    this.field4246 = -this.field4246;
                }
                while (this.field4258 >= var4) {
                    this.field4258 = var4 + var4 - 1 - this.field4258;
                    this.field4246 = -this.field4246;
                    if (this.field4258 >= var3) {
                        return;
                    }
                    this.field4258 = var3 + var3 - 1 - this.field4258;
                    this.field4246 = -this.field4246;
                }
            }
        } else {
            if (this.field4255 > 0) {
                if (this.field4251) {
                    label125: {
                        if (this.field4246 < 0) {
                            if (this.field4258 >= var3) {
                                return;
                            }
                            this.field4258 = var3 + var3 - 1 - this.field4258;
                            this.field4246 = -this.field4246;
                            if (--this.field4255 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4258 < var4) {
                                return;
                            }
                            this.field4258 = var4 + var4 - 1 - this.field4258;
                            this.field4246 = -this.field4246;
                            if (--this.field4255 == 0) {
                                break;
                            }
                            if (this.field4258 >= var3) {
                                return;
                            }
                            this.field4258 = var3 + var3 - 1 - this.field4258;
                            this.field4246 = -this.field4246;
                        } while (--this.field4255 != 0);
                    }
                } else if (this.field4246 < 0) {
                    if (this.field4258 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4258) / var6;
                    if (var7 < this.field4255) {
                        this.field4258 += var6 * var7;
                        this.field4255 -= var7;
                        return;
                    }
                    this.field4258 += this.field4255 * var6;
                    this.field4255 = 0;
                } else {
                    if (this.field4258 < var4) {
                        return;
                    }
                    int var8 = (this.field4258 - var3) / var6;
                    if (var8 < this.field4255) {
                        this.field4258 -= var6 * var8;
                        this.field4255 -= var8;
                        return;
                    }
                    this.field4258 -= this.field4255 * var6;
                    this.field4255 = 0;
                }
            }
            if (this.field4246 < 0) {
                if (this.field4258 < 0) {
                    this.field4258 = -1;
                    this.method1603();
                    this.method797((byte) 101);
                    return;
                }
            } else if (this.field4258 >= var5) {
                this.field4258 = var5;
                this.method1603();
                this.method797((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()I")
    public final int method689() {
        return this.field4256 == 0 && this.field4252 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
    private final synchronized void method1602(int arg0, int arg1) {
        this.field4256 = arg0;
        this.field4250 = arg1;
        this.field4252 = 0;
        this.method1633();
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "()V")
    private final void method1603() {
        if (this.field4252 != 0) {
            if (this.field4256 == Integer.MIN_VALUE) {
                this.field4256 = 0;
            }
            this.field4252 = 0;
            this.method1633();
        }
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "()Z")
    private final boolean method1604() {
        int var1 = this.field4256;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1605(var1, this.field4250);
            var2 = method1628(var1, this.field4250);
        }
        if (this.field4248 == var1 && this.field4253 == var3 && this.field4249 == var2) {
            if (this.field4256 == Integer.MIN_VALUE) {
                this.field4256 = 0;
                this.field4248 = this.field4253 = this.field4249 = 0;
                this.method797((byte) 121);
                return true;
            } else {
                this.method1633();
                return false;
            }
        } else {
            if (this.field4248 < var1) {
                this.field4259 = 1;
                this.field4252 = var1 - this.field4248;
            } else if (this.field4248 > var1) {
                this.field4259 = -1;
                this.field4252 = this.field4248 - var1;
            } else {
                this.field4259 = 0;
            }
            if (this.field4253 < var3) {
                this.field4254 = 1;
                if (this.field4252 == 0 || this.field4252 > var3 - this.field4253) {
                    this.field4252 = var3 - this.field4253;
                }
            } else if (this.field4253 > var3) {
                this.field4254 = -1;
                if (this.field4252 == 0 || this.field4252 > this.field4253 - var3) {
                    this.field4252 = this.field4253 - var3;
                }
            } else {
                this.field4254 = 0;
            }
            if (this.field4249 < var2) {
                this.field4247 = 1;
                if (this.field4252 == 0 || this.field4252 > var2 - this.field4249) {
                    this.field4252 = var2 - this.field4249;
                }
            } else if (this.field4249 > var2) {
                this.field4247 = -1;
                if (this.field4252 == 0 || this.field4252 > this.field4249 - var2) {
                    this.field4252 = this.field4249 - var2;
                }
            } else {
                this.field4247 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()Lbe;")
    public final class117 method699() {
        return null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)I")
    private static final int method1605(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[B[IIIIIIILga;II)I")
    private static final int method1606(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10, int arg11, int arg12) {
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
        arg10.field4258 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([B[IIIIIIILga;)I")
    private static final int method1607(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
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
        arg8.field4258 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "()I")
    public final synchronized int method1608() {
        return this.field4250 < 0 ? -1 : this.field4250;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[B[IIIIIIIIIILga;II)I")
    private static final int method1609(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class239 arg13, int arg14, int arg15) {
        arg13.field4248 -= arg13.field4259 * arg5;
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
        arg13.field4248 += arg13.field4259 * var22;
        arg13.field4253 = arg6;
        arg13.field4249 = arg7;
        arg13.field4258 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([III)V")
    public final synchronized void method688(int[] arg0, int arg1, int arg2) {
        if (this.field4256 == 0 && this.field4252 == 0) {
            this.method696(arg2);
        } else {
            class89 var4 = (class89) super.field1684;
            int var5 = this.field4260 << 8;
            int var6 = this.field4257 << 8;
            int var7 = var4.field1305.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4255 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4258 < 0) {
                if (this.field4246 <= 0) {
                    this.method1603();
                    this.method797((byte) 105);
                    return;
                }
                this.field4258 = 0;
            }
            if (this.field4258 >= var7) {
                if (this.field4246 >= 0) {
                    this.method1603();
                    this.method797((byte) 98);
                    return;
                }
                this.field4258 = var7 - 1;
            }
            if (this.field4255 < 0) {
                if (this.field4251) {
                    if (this.field4246 < 0) {
                        var9 = this.method1624(arg0, arg1, var5, var10, var4.field1305[this.field4260]);
                        if (this.field4258 >= var5) {
                            return;
                        }
                        this.field4258 = var5 + var5 - 1 - this.field4258;
                        this.field4246 = -this.field4246;
                    }
                    while (true) {
                        int var11 = this.method1618(arg0, var9, var6, var10, var4.field1305[this.field4257 - 1]);
                        if (this.field4258 < var6) {
                            return;
                        }
                        this.field4258 = var6 + var6 - 1 - this.field4258;
                        this.field4246 = -this.field4246;
                        var9 = this.method1624(arg0, var11, var5, var10, var4.field1305[this.field4260]);
                        if (this.field4258 >= var5) {
                            return;
                        }
                        this.field4258 = var5 + var5 - 1 - this.field4258;
                        this.field4246 = -this.field4246;
                    }
                } else if (this.field4246 < 0) {
                    while (true) {
                        var9 = this.method1624(arg0, var9, var5, var10, var4.field1305[this.field4257 - 1]);
                        if (this.field4258 >= var5) {
                            return;
                        }
                        this.field4258 = var6 - 1 - (var6 - 1 - this.field4258) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1618(arg0, var9, var6, var10, var4.field1305[this.field4260]);
                        if (this.field4258 < var6) {
                            return;
                        }
                        this.field4258 = (this.field4258 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4255 > 0) {
                    if (this.field4251) {
                        label130: {
                            if (this.field4246 < 0) {
                                var9 = this.method1624(arg0, arg1, var5, var10, var4.field1305[this.field4260]);
                                if (this.field4258 >= var5) {
                                    return;
                                }
                                this.field4258 = var5 + var5 - 1 - this.field4258;
                                this.field4246 = -this.field4246;
                                if (--this.field4255 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1618(arg0, var9, var6, var10, var4.field1305[this.field4257 - 1]);
                                if (this.field4258 < var6) {
                                    return;
                                }
                                this.field4258 = var6 + var6 - 1 - this.field4258;
                                this.field4246 = -this.field4246;
                                if (--this.field4255 == 0) {
                                    break;
                                }
                                var9 = this.method1624(arg0, var9, var5, var10, var4.field1305[this.field4260]);
                                if (this.field4258 >= var5) {
                                    return;
                                }
                                this.field4258 = var5 + var5 - 1 - this.field4258;
                                this.field4246 = -this.field4246;
                            } while (--this.field4255 != 0);
                        }
                    } else if (this.field4246 < 0) {
                        while (true) {
                            var9 = this.method1624(arg0, var9, var5, var10, var4.field1305[this.field4257 - 1]);
                            if (this.field4258 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4258) / var8;
                            if (var12 >= this.field4255) {
                                this.field4258 += this.field4255 * var8;
                                this.field4255 = 0;
                                break;
                            }
                            this.field4258 += var8 * var12;
                            this.field4255 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1618(arg0, var9, var6, var10, var4.field1305[this.field4260]);
                            if (this.field4258 < var6) {
                                return;
                            }
                            int var13 = (this.field4258 - var5) / var8;
                            if (var13 >= this.field4255) {
                                this.field4258 -= this.field4255 * var8;
                                this.field4255 = 0;
                                break;
                            }
                            this.field4258 -= var8 * var13;
                            this.field4255 -= var13;
                        }
                    }
                }
                if (this.field4246 < 0) {
                    this.method1624(arg0, var9, 0, var10, 0);
                    if (this.field4258 < 0) {
                        this.field4258 = -1;
                        this.method1603();
                        this.method797((byte) 99);
                        return;
                    }
                } else {
                    this.method1618(arg0, var9, var7, var10, 0);
                    if (this.field4258 >= var7) {
                        this.field4258 = var7;
                        this.method1603();
                        this.method797((byte) 126);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I[B[IIIIIIIIIILga;)I")
    private static final int method1610(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class239 arg12) {
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
        arg12.field4248 += (var19 - arg4) * arg12.field4259;
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
        arg12.field4253 = var15 >> 2;
        arg12.field4249 = var16 >> 2;
        arg12.field4258 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public final synchronized void method1611(int arg0) {
        this.field4255 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public final synchronized void method1612(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1602(arg1, arg2);
        } else {
            int var4 = method1605(arg1, arg2);
            int var5 = method1628(arg1, arg2);
            if (this.field4253 == var4 && this.field4249 == var5) {
                this.field4252 = 0;
            } else {
                int var6 = arg1 - this.field4248;
                if (this.field4248 - arg1 > var6) {
                    var6 = this.field4248 - arg1;
                }
                if (var4 - this.field4253 > var6) {
                    var6 = var4 - this.field4253;
                }
                if (this.field4253 - var4 > var6) {
                    var6 = this.field4253 - var4;
                }
                if (var5 - this.field4249 > var6) {
                    var6 = var5 - this.field4249;
                }
                if (this.field4249 - var5 > var6) {
                    var6 = this.field4249 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4252 = arg0;
                this.field4256 = arg1;
                this.field4250 = arg2;
                this.field4259 = (arg1 - this.field4248) / arg0;
                this.field4254 = (var4 - this.field4253) / arg0;
                this.field4247 = (var5 - this.field4249) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II[B[IIIIIIIILga;II)I")
    private static final int method1613(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
        arg11.field4253 -= arg11.field4254 * arg5;
        arg11.field4249 -= arg11.field4247 * arg5;
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
        arg11.field4253 += arg11.field4254 * arg5;
        arg11.field4249 += arg11.field4247 * arg5;
        arg11.field4248 = arg6;
        arg11.field4258 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public final synchronized void method1614(int arg0) {
        if (arg0 == 0) {
            this.method1622(0);
            this.method797((byte) 101);
        } else if (this.field4253 == 0 && this.field4249 == 0) {
            this.field4252 = 0;
            this.field4256 = 0;
            this.field4248 = 0;
            this.method797((byte) 106);
        } else {
            int var2 = -this.field4248;
            if (this.field4248 > var2) {
                var2 = this.field4248;
            }
            if (-this.field4253 > var2) {
                var2 = -this.field4253;
            }
            if (this.field4253 > var2) {
                var2 = this.field4253;
            }
            if (-this.field4249 > var2) {
                var2 = -this.field4249;
            }
            if (this.field4249 > var2) {
                var2 = this.field4249;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4252 = arg0;
            this.field4256 = Integer.MIN_VALUE;
            this.field4259 = -this.field4248 / arg0;
            this.field4254 = -this.field4253 / arg0;
            this.field4247 = -this.field4249 / arg0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lfj;II)Lga;")
    public static final class239 method1615(class89 arg0, int arg1, int arg2) {
        return arg0.field1305 != null && arg0.field1305.length != 0 ? new class239(arg0, (int) ((long) arg0.field1306 * 256L * (long) arg1 / (long) (class216.field3884 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([B[IIIIIIIILga;)I")
    private static final int method1616(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class239 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4253 += (var14 - arg3) * arg9.field4254;
        arg9.field4249 += (var14 - arg3) * arg9.field4247;
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
        arg9.field4248 = var12 >> 2;
        arg9.field4258 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
    public final synchronized void method1617(boolean arg0) {
        this.field4246 = (this.field4246 >>> 31) + (this.field4246 ^ this.field4246 >> 31);
        if (arg0) {
            this.field4246 = -this.field4246;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([IIIII)I")
    private final int method1618(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4252 <= 0) {
                if (this.field4246 == 256 && (this.field4258 & 255) == 0) {
                    if (class165.field2715) {
                        return method1630(0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, 0, arg3, arg2, this);
                    }
                    return method1636(((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, 0, arg3, arg2, this);
                }
                if (class165.field2715) {
                    return method1625(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, 0, arg3, arg2, this, this.field4246, arg4);
                }
                return method1606(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, 0, arg3, arg2, this, this.field4246, arg4);
            }
            int var6 = this.field4252 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4252 += arg1;
            if (this.field4246 == 256 && (this.field4258 & 255) == 0) {
                if (class165.field2715) {
                    arg1 = method1610(0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, this.field4254, this.field4247, 0, var6, arg2, this);
                } else {
                    arg1 = method1619(((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, this.field4259, 0, var6, arg2, this);
                }
            } else if (class165.field2715) {
                arg1 = method1609(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, this.field4254, this.field4247, 0, var6, arg2, this, this.field4246, arg4);
            } else {
                arg1 = method1598(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, this.field4259, 0, var6, arg2, this, this.field4246, arg4);
            }
            this.field4252 -= arg1;
            if (this.field4252 != 0) {
                return arg1;
            }
        } while (!this.method1604());
        return arg3;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([B[IIIIIIIILga;)I")
    private static final int method1619(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class239 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4253 += (var14 - arg3) * arg9.field4254;
        arg9.field4249 += (var14 - arg3) * arg9.field4247;
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
        arg9.field4248 = var12 >> 2;
        arg9.field4258 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II[B[IIIIIIIIIILga;II)I")
    private static final int method1620(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class239 arg13, int arg14, int arg15) {
        arg13.field4248 -= arg13.field4259 * arg5;
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
        arg13.field4248 += arg13.field4259 * var22;
        arg13.field4253 = arg6;
        arg13.field4249 = arg7;
        arg13.field4258 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lfj;III)Lga;")
    public static final class239 method1621(class89 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1305 != null && arg0.field1305.length != 0 ? new class239(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    private final synchronized void method1622(int arg0) {
        this.method1602(arg0, this.method1608());
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public final synchronized void method1623(int arg0) {
        int var2 = ((class89) super.field1684).field1305.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4258 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([IIIII)I")
    private final int method1624(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4252 <= 0) {
                if (this.field4246 == -256 && (this.field4258 & 255) == 0) {
                    if (class165.field2715) {
                        return method1629(0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, 0, arg3, arg2, this);
                    }
                    return method1607(((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, 0, arg3, arg2, this);
                }
                if (class165.field2715) {
                    return method1597(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, 0, arg3, arg2, this, this.field4246, arg4);
                }
                return method1626(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, 0, arg3, arg2, this, this.field4246, arg4);
            }
            int var6 = this.field4252 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4252 += arg1;
            if (this.field4246 == -256 && (this.field4258 & 255) == 0) {
                if (class165.field2715) {
                    arg1 = method1599(0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, this.field4254, this.field4247, 0, var6, arg2, this);
                } else {
                    arg1 = method1616(((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, this.field4259, 0, var6, arg2, this);
                }
            } else if (class165.field2715) {
                arg1 = method1620(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4253, this.field4249, this.field4254, this.field4247, 0, var6, arg2, this, this.field4246, arg4);
            } else {
                arg1 = method1613(0, 0, ((class89) super.field1684).field1305, arg0, this.field4258, arg1, this.field4248, this.field4259, 0, var6, arg2, this, this.field4246, arg4);
            }
            this.field4252 -= arg1;
            if (this.field4252 != 0) {
                return arg1;
            }
        } while (!this.method1604());
        return arg3;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II[B[IIIIIIIILga;II)I")
    private static final int method1625(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class239 arg11, int arg12, int arg13) {
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
        arg11.field4258 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II[B[IIIIIIILga;II)I")
    private static final int method1626(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10, int arg11, int arg12) {
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
        arg10.field4258 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    public final synchronized void method1627(int arg0) {
        if (this.field4246 < 0) {
            this.field4246 = -arg0;
        } else {
            this.field4246 = arg0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)I")
    private static final int method1628(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B[IIIIIIIILga;)I")
    private static final int method1629(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10) {
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
        arg10.field4258 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I[B[IIIIIIIILga;)I")
    private static final int method1630(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class239 arg10) {
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
        arg10.field4258 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "()I")
    public final synchronized int method1631() {
        return this.field4256 == Integer.MIN_VALUE ? 0 : this.field4256;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()Lbe;")
    public final class117 method695() {
        return null;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(II)V")
    public final synchronized void method1632(int arg0, int arg1) {
        this.method1612(arg0, arg1, this.method1608());
    }

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "()V")
    private final void method1633() {
        this.field4248 = this.field4256;
        this.field4253 = method1605(this.field4256, this.field4250);
        this.field4249 = method1628(this.field4256, this.field4250);
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public final synchronized void method1634(int arg0) {
        this.method1602(arg0 << 6, this.method1608());
    }

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "()Z")
    public final boolean method1635() {
        return this.field4258 < 0 || this.field4258 >= ((class89) super.field1684).field1305.length << 8;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lfj;II)V")
    private class239(class89 arg0, int arg1, int arg2) {
        super.field1684 = arg0;
        this.field4260 = arg0.field1304;
        this.field4257 = arg0.field1302;
        this.field4251 = arg0.field1303;
        this.field4246 = arg1;
        this.field4256 = arg2;
        this.field4250 = 8192;
        this.field4258 = 0;
        this.method1633();
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
    public final int method707() {
        int var1 = this.field4248 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4255 == 0) {
            var2 -= this.field4258 * var2 / (((class89) super.field1684).field1305.length << 8);
        } else if (this.field4255 >= 0) {
            var2 -= this.field4260 * var2 / ((class89) super.field1684).field1305.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lfj;III)V")
    private class239(class89 arg0, int arg1, int arg2, int arg3) {
        super.field1684 = arg0;
        this.field4260 = arg0.field1304;
        this.field4257 = arg0.field1302;
        this.field4251 = arg0.field1303;
        this.field4246 = arg1;
        this.field4256 = arg2;
        this.field4250 = arg3;
        this.field4258 = 0;
        this.method1633();
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([B[IIIIIIILga;)I")
    private static final int method1636(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class239 arg8) {
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
        arg8.field4258 = var9 << 8;
        return arg3;
    }
}
