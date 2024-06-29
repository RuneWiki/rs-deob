import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class260 extends class16 {

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "Z")
    private boolean field4412;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    private int field4401;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    private int field4408;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    private int field4399;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    private int field4400;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    private int field4402;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    private int field4403;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    private int field4404;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    private int field4406;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    private int field4407;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    private int field4410;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([III)V", line = 3)
    public final synchronized void method73(int[] arg0, int arg1, int arg2) {
        if (this.field4409 == 0 && this.field4402 == 0) {
            this.method68(arg2);
            return;
        }
        class11 var4 = (class11) this.field182;
        int var5 = this.field4411 << 8;
        int var6 = this.field4413 << 8;
        int var7 = var4.field123.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field4410 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field4405 < 0) {
            if (this.field4401 <= 0) {
                this.method1806();
                this.method124((byte) 119);
                return;
            }
            this.field4405 = 0;
        }
        if (this.field4405 >= var7) {
            if (this.field4401 >= 0) {
                this.method1806();
                this.method124((byte) 68);
                return;
            }
            this.field4405 = var7 - 1;
        }
        if (this.field4410 >= 0) {
            if (this.field4410 > 0) {
                if (this.field4412) {
                    label131: {
                        if (this.field4401 < 0) {
                            var9 = this.method1782(arg0, arg1, var5, var10, var4.field123[this.field4411]);
                            if (this.field4405 >= var5) {
                                return;
                            }
                            this.field4405 = var5 + var5 - this.field4405 - 1;
                            this.field4401 = -this.field4401;
                            if (--this.field4410 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1796(arg0, var9, var6, var10, var4.field123[this.field4413 - 1]);
                            if (this.field4405 < var6) {
                                return;
                            }
                            this.field4405 = var6 + var6 - this.field4405 - 1;
                            this.field4401 = -this.field4401;
                            if (--this.field4410 == 0) {
                                break;
                            }
                            var9 = this.method1782(arg0, var9, var5, var10, var4.field123[this.field4411]);
                            if (this.field4405 >= var5) {
                                return;
                            }
                            this.field4405 = var5 + var5 - this.field4405 - 1;
                            this.field4401 = -this.field4401;
                        } while (--this.field4410 != 0);
                    }
                } else if (this.field4401 < 0) {
                    while (true) {
                        var9 = this.method1782(arg0, var9, var5, var10, var4.field123[this.field4413 - 1]);
                        if (this.field4405 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field4405 - 1) / var8;
                        if (var12 >= this.field4410) {
                            this.field4405 += this.field4410 * var8;
                            this.field4410 = 0;
                            break;
                        }
                        this.field4405 += var8 * var12;
                        this.field4410 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1796(arg0, var9, var6, var10, var4.field123[this.field4411]);
                        if (this.field4405 < var6) {
                            return;
                        }
                        int var13 = (this.field4405 - var5) / var8;
                        if (var13 >= this.field4410) {
                            this.field4405 -= this.field4410 * var8;
                            this.field4410 = 0;
                            break;
                        }
                        this.field4405 -= var8 * var13;
                        this.field4410 -= var13;
                    }
                }
            }
            if (this.field4401 < 0) {
                this.method1782(arg0, var9, 0, var10, 0);
                if (this.field4405 < 0) {
                    this.field4405 = -1;
                    this.method1806();
                    this.method124((byte) 13);
                }
            } else {
                this.method1796(arg0, var9, var7, var10, 0);
                if (this.field4405 >= var7) {
                    this.field4405 = var7;
                    this.method1806();
                    this.method124((byte) 84);
                }
            }
        } else if (this.field4412) {
            if (this.field4401 < 0) {
                var9 = this.method1782(arg0, arg1, var5, var10, var4.field123[this.field4411]);
                if (this.field4405 >= var5) {
                    return;
                }
                this.field4405 = var5 + var5 - this.field4405 - 1;
                this.field4401 = -this.field4401;
            }
            while (true) {
                int var11 = this.method1796(arg0, var9, var6, var10, var4.field123[this.field4413 - 1]);
                if (this.field4405 < var6) {
                    return;
                }
                this.field4405 = var6 + var6 - this.field4405 - 1;
                this.field4401 = -this.field4401;
                var9 = this.method1782(arg0, var11, var5, var10, var4.field123[this.field4411]);
                if (this.field4405 >= var5) {
                    return;
                }
                this.field4405 = var5 + var5 - this.field4405 - 1;
                this.field4401 = -this.field4401;
            }
        } else if (this.field4401 < 0) {
            while (true) {
                var9 = this.method1782(arg0, var9, var5, var10, var4.field123[this.field4413 - 1]);
                if (this.field4405 >= var5) {
                    return;
                }
                this.field4405 = var6 - (var6 - 1 - this.field4405) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method1796(arg0, var9, var6, var10, var4.field123[this.field4411]);
                if (this.field4405 < var6) {
                    return;
                }
                this.field4405 = (this.field4405 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[B[IIIIIIIIIILv;II)I", line = 238)
    private static final int method1780(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class260 arg13, int arg14, int arg15) {
        arg13.field4400 -= arg13.field4404 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field4400 += arg13.field4404 * var27;
        arg13.field4403 = arg6;
        arg13.field4407 = arg7;
        arg13.field4405 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()Lrh;", line = 283)
    public final class16 method71() {
        return null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II[B[IIIIIIIIIILv;II)I", line = 286)
    private static final int method1781(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class260 arg13, int arg14, int arg15) {
        arg13.field4400 -= arg13.field4404 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field4400 += arg13.field4404 * var26;
        arg13.field4403 = arg6;
        arg13.field4407 = arg7;
        arg13.field4405 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([IIIII)I", line = 330)
    private final int method1782(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4402 > 0) {
                int var6 = this.field4402 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4402 += arg1;
                if (this.field4401 == -256 && (this.field4405 & 0xFF) == 0) {
                    if (class218.field3549) {
                        arg1 = method1784(0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, this.field4406, this.field4399, 0, var6, arg2, this);
                    } else {
                        arg1 = method1816(((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, this.field4404, 0, var6, arg2, this);
                    }
                } else if (class218.field3549) {
                    arg1 = method1781(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, this.field4406, this.field4399, 0, var6, arg2, this, this.field4401, arg4);
                } else {
                    arg1 = method1814(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, this.field4404, 0, var6, arg2, this, this.field4401, arg4);
                }
                this.field4402 -= arg1;
                if (this.field4402 != 0) {
                    return arg1;
                }
                if (!this.method1815()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4401 == -256 && (this.field4405 & 0xFF) == 0) {
                if (class218.field3549) {
                    return method1818(0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, 0, arg3, arg2, this);
                }
                return method1804(((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, 0, arg3, arg2, this);
            }
            if (class218.field3549) {
                return method1795(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, 0, arg3, arg2, this, this.field4401, arg4);
            }
            return method1791(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, 0, arg3, arg2, this, this.field4401, arg4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()I", line = 386)
    public final int method67() {
        return this.field4409 == 0 && this.field4402 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([B[IIIIIIILv;)I", line = 393)
    private static final int method1783(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class260 arg8) {
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
        arg8.field4405 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[B[IIIIIIIIIILv;)I", line = 418)
    private static final int method1784(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class260 arg12) {
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
        arg12.field4400 += (var19 - arg4) * arg12.field4404;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field4403 = var15 >> 2;
        arg12.field4407 = var16 >> 2;
        arg12.field4405 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 471)
    public final synchronized void method68(int arg0) {
        if (this.field4402 > 0) {
            if (arg0 >= this.field4402) {
                if (this.field4409 == Integer.MIN_VALUE) {
                    this.field4409 = 0;
                    this.field4400 = this.field4403 = this.field4407 = 0;
                    this.method124((byte) 14);
                    arg0 = this.field4402;
                }
                this.field4402 = 0;
                this.method1801();
            } else {
                this.field4400 += this.field4404 * arg0;
                this.field4403 += this.field4406 * arg0;
                this.field4407 += this.field4399 * arg0;
                this.field4402 -= arg0;
            }
        }
        class11 var2 = (class11) this.field182;
        int var3 = this.field4411 << 8;
        int var4 = this.field4413 << 8;
        int var5 = var2.field123.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4410 = 0;
        }
        if (this.field4405 < 0) {
            if (this.field4401 <= 0) {
                this.method1806();
                this.method124((byte) 70);
                return;
            }
            this.field4405 = 0;
        }
        if (this.field4405 >= var5) {
            if (this.field4401 >= 0) {
                this.method1806();
                this.method124((byte) 16);
                return;
            }
            this.field4405 = var5 - 1;
        }
        this.field4405 += this.field4401 * arg0;
        if (this.field4410 >= 0) {
            if (this.field4410 > 0) {
                if (this.field4412) {
                    label121: {
                        if (this.field4401 < 0) {
                            if (this.field4405 >= var3) {
                                return;
                            }
                            this.field4405 = var3 + var3 - this.field4405 - 1;
                            this.field4401 = -this.field4401;
                            if (--this.field4410 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field4405 < var4) {
                                return;
                            }
                            this.field4405 = var4 + var4 - this.field4405 - 1;
                            this.field4401 = -this.field4401;
                            if (--this.field4410 == 0) {
                                break;
                            }
                            if (this.field4405 >= var3) {
                                return;
                            }
                            this.field4405 = var3 + var3 - this.field4405 - 1;
                            this.field4401 = -this.field4401;
                        } while (--this.field4410 != 0);
                    }
                } else {
                    label153: {
                        if (this.field4401 < 0) {
                            if (this.field4405 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field4405 - 1) / var6;
                            if (var7 >= this.field4410) {
                                this.field4405 += this.field4410 * var6;
                                this.field4410 = 0;
                                break label153;
                            }
                            this.field4405 += var6 * var7;
                            this.field4410 -= var7;
                        } else if (this.field4405 >= var4) {
                            int var8 = (this.field4405 - var3) / var6;
                            if (var8 >= this.field4410) {
                                this.field4405 -= this.field4410 * var6;
                                this.field4410 = 0;
                                break label153;
                            }
                            this.field4405 -= var6 * var8;
                            this.field4410 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field4401 < 0) {
                if (this.field4405 < 0) {
                    this.field4405 = -1;
                    this.method1806();
                    this.method124((byte) 65);
                }
            } else if (this.field4405 >= var5) {
                this.field4405 = var5;
                this.method1806();
                this.method124((byte) 42);
            }
        } else if (this.field4412) {
            if (this.field4401 < 0) {
                if (this.field4405 >= var3) {
                    return;
                }
                this.field4405 = var3 + var3 - this.field4405 - 1;
                this.field4401 = -this.field4401;
            }
            while (this.field4405 >= var4) {
                this.field4405 = var4 + var4 - this.field4405 - 1;
                this.field4401 = -this.field4401;
                if (this.field4405 >= var3) {
                    return;
                }
                this.field4405 = var3 + var3 - this.field4405 - 1;
                this.field4401 = -this.field4401;
            }
        } else if (this.field4401 < 0) {
            if (this.field4405 >= var3) {
                return;
            }
            this.field4405 = var4 - (var4 - 1 - this.field4405) % var6 - 1;
        } else if (this.field4405 >= var4) {
            this.field4405 = (this.field4405 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 692)
    private static final int method1785(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()I", line = 695)
    public final synchronized int method1786() {
        return this.field4408 < 0 ? -1 : this.field4408;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 702)
    public final synchronized void method1787(int arg0) {
        this.field4410 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()Z", line = 705)
    public final boolean method1788() {
        return this.field4402 != 0;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 708)
    public final synchronized void method1789(int arg0) {
        if (arg0 == 0) {
            this.method1807(0);
            this.method124((byte) 44);
        } else if (this.field4403 == 0 && this.field4407 == 0) {
            this.field4402 = 0;
            this.field4409 = 0;
            this.field4400 = 0;
            this.method124((byte) 75);
        } else {
            int var2 = -this.field4400;
            if (this.field4400 > var2) {
                var2 = this.field4400;
            }
            if (-this.field4403 > var2) {
                var2 = -this.field4403;
            }
            if (this.field4403 > var2) {
                var2 = this.field4403;
            }
            if (-this.field4407 > var2) {
                var2 = -this.field4407;
            }
            if (this.field4407 > var2) {
                var2 = this.field4407;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4402 = arg0;
            this.field4409 = Integer.MIN_VALUE;
            this.field4404 = -this.field4400 / arg0;
            this.field4406 = -this.field4403 / arg0;
            this.field4399 = -this.field4407 / arg0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Llg;II)Lv;", line = 753)
    public static final class260 method1790(class11 arg0, int arg1, int arg2) {
        return arg0.field123 == null || arg0.field123.length == 0 ? null : new class260(arg0, (int) ((long) arg0.field126 * 256L * (long) arg1 / (long) (class62.field820 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[B[IIIIIIILv;II)I", line = 759)
    private static final int method1791(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field4405 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()I", line = 785)
    public final synchronized int method1792() {
        return this.field4409 == Integer.MIN_VALUE ? 0 : this.field4409;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Llg;III)Lv;", line = 788)
    public static final class260 method1793(class11 arg0, int arg1, int arg2, int arg3) {
        return arg0.field123 == null || arg0.field123.length == 0 ? null : new class260(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([B[IIIIIIIILv;)I", line = 794)
    private static final int method1794(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class260 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4403 += (var14 - arg3) * arg9.field4406;
        arg9.field4407 += (var14 - arg3) * arg9.field4399;
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
        arg9.field4400 = var12 >> 2;
        arg9.field4405 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[B[IIIIIIIILv;II)I", line = 830)
    private static final int method1795(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field4405 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([IIIII)I", line = 862)
    private final int method1796(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field4402 > 0) {
                int var6 = this.field4402 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field4402 += arg1;
                if (this.field4401 == 256 && (this.field4405 & 0xFF) == 0) {
                    if (class218.field3549) {
                        arg1 = method1819(0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, this.field4406, this.field4399, 0, var6, arg2, this);
                    } else {
                        arg1 = method1794(((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, this.field4404, 0, var6, arg2, this);
                    }
                } else if (class218.field3549) {
                    arg1 = method1780(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, this.field4406, this.field4399, 0, var6, arg2, this, this.field4401, arg4);
                } else {
                    arg1 = method1808(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, this.field4404, 0, var6, arg2, this, this.field4401, arg4);
                }
                this.field4402 -= arg1;
                if (this.field4402 != 0) {
                    return arg1;
                }
                if (!this.method1815()) {
                    continue;
                }
                return arg3;
            }
            if (this.field4401 == 256 && (this.field4405 & 0xFF) == 0) {
                if (class218.field3549) {
                    return method1813(0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, 0, arg3, arg2, this);
                }
                return method1783(((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, 0, arg3, arg2, this);
            }
            if (class218.field3549) {
                return method1798(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4403, this.field4407, 0, arg3, arg2, this, this.field4401, arg4);
            }
            return method1803(0, 0, ((class11) this.field182).field123, arg0, this.field4405, arg1, this.field4400, 0, arg3, arg2, this, this.field4401, arg4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 917)
    public final synchronized void method1797(boolean arg0) {
        this.field4401 = (this.field4401 >>> 31) + (this.field4401 ^ this.field4401 >> 31);
        if (arg0) {
            this.field4401 = -this.field4401;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II[B[IIIIIIIILv;II)I", line = 924)
    private static final int method1798(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field4405 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I", line = 957)
    private static final int method1799(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V", line = 961)
    public final synchronized void method1800(int arg0) {
        int var2 = ((class11) this.field182).field123.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4405 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "()V", line = 971)
    private final void method1801() {
        this.field4400 = this.field4409;
        this.field4403 = method1785(this.field4409, this.field4408);
        this.field4407 = method1799(this.field4409, this.field4408);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V", line = 976)
    public final synchronized void method1802(int arg0, int arg1) {
        this.method1812(arg0, arg1, this.method1786());
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II[B[IIIIIIILv;II)I", line = 979)
    private static final int method1803(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field4405 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([B[IIIIIIILv;)I", line = 1006)
    private static final int method1804(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class260 arg8) {
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
        arg8.field4405 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()I", line = 1032)
    public final int method69() {
        int var1 = this.field4400 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4410 == 0) {
            var2 -= this.field4405 * var2 / (((class11) this.field182).field123.length << 8);
        } else if (this.field4410 >= 0) {
            var2 -= this.field4411 * var2 / ((class11) this.field182).field123.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "()Z", line = 1045)
    public final boolean method1805() {
        return this.field4405 < 0 || this.field4405 >= ((class11) this.field182).field123.length << 8;
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "()V", line = 1048)
    private final void method1806() {
        if (this.field4402 == 0) {
            return;
        }
        if (this.field4409 == Integer.MIN_VALUE) {
            this.field4409 = 0;
        }
        this.field4402 = 0;
        this.method1801();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 1063)
    private final synchronized void method1807(int arg0) {
        this.method1810(arg0, this.method1786());
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II[B[IIIIIIIILv;II)I", line = 1067)
    private static final int method1808(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
        arg11.field4403 -= arg11.field4406 * arg5;
        arg11.field4407 -= arg11.field4399 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field4403 += arg11.field4406 * arg5;
        arg11.field4407 += arg11.field4399 * arg5;
        arg11.field4400 = arg6;
        arg11.field4405 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!v", name = "k", descriptor = "()I", line = 1101)
    public final synchronized int method1809() {
        return this.field4401 < 0 ? -this.field4401 : this.field4401;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)V", line = 1106)
    private final synchronized void method1810(int arg0, int arg1) {
        this.field4409 = arg0;
        this.field4408 = arg1;
        this.field4402 = 0;
        this.method1801();
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V", line = 1112)
    public final synchronized void method1811(int arg0) {
        this.method1810(arg0 << 6, this.method1786());
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V", line = 1115)
    public final synchronized void method1812(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1810(arg1, arg2);
            return;
        }
        int var4 = method1785(arg1, arg2);
        int var5 = method1799(arg1, arg2);
        if (this.field4403 == var4 && this.field4407 == var5) {
            this.field4402 = 0;
            return;
        }
        int var6 = arg1 - this.field4400;
        if (this.field4400 - arg1 > var6) {
            var6 = this.field4400 - arg1;
        }
        if (var4 - this.field4403 > var6) {
            var6 = var4 - this.field4403;
        }
        if (this.field4403 - var4 > var6) {
            var6 = this.field4403 - var4;
        }
        if (var5 - this.field4407 > var6) {
            var6 = var5 - this.field4407;
        }
        if (this.field4407 - var5 > var6) {
            var6 = this.field4407 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field4402 = arg0;
        this.field4409 = arg1;
        this.field4408 = arg2;
        this.field4404 = (arg1 - this.field4400) / arg0;
        this.field4406 = (var4 - this.field4403) / arg0;
        this.field4399 = (var5 - this.field4407) / arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[B[IIIIIIIILv;)I", line = 1164)
    private static final int method1813(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field4405 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II[B[IIIIIIIILv;II)I", line = 1202)
    private static final int method1814(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class260 arg11, int arg12, int arg13) {
        arg11.field4403 -= arg11.field4406 * arg5;
        arg11.field4407 -= arg11.field4399 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field4403 += arg11.field4406 * arg5;
        arg11.field4407 += arg11.field4399 * arg5;
        arg11.field4400 = arg6;
        arg11.field4405 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()Z", line = 1236)
    private final boolean method1815() {
        int var1 = this.field4409;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1785(var1, this.field4408);
            var2 = method1799(var1, this.field4408);
        }
        if (this.field4400 != var1 || this.field4403 != var3 || this.field4407 != var2) {
            if (this.field4400 < var1) {
                this.field4404 = 1;
                this.field4402 = var1 - this.field4400;
            } else if (this.field4400 > var1) {
                this.field4404 = -1;
                this.field4402 = this.field4400 - var1;
            } else {
                this.field4404 = 0;
            }
            if (this.field4403 < var3) {
                this.field4406 = 1;
                if (this.field4402 == 0 || this.field4402 > var3 - this.field4403) {
                    this.field4402 = var3 - this.field4403;
                }
            } else if (this.field4403 > var3) {
                this.field4406 = -1;
                if (this.field4402 == 0 || this.field4402 > this.field4403 - var3) {
                    this.field4402 = this.field4403 - var3;
                }
            } else {
                this.field4406 = 0;
            }
            if (this.field4407 < var2) {
                this.field4399 = 1;
                if (this.field4402 == 0 || this.field4402 > var2 - this.field4407) {
                    this.field4402 = var2 - this.field4407;
                }
            } else if (this.field4407 > var2) {
                this.field4399 = -1;
                if (this.field4402 == 0 || this.field4402 > this.field4407 - var2) {
                    this.field4402 = this.field4407 - var2;
                }
            } else {
                this.field4399 = 0;
            }
            return false;
        } else if (this.field4409 == Integer.MIN_VALUE) {
            this.field4409 = 0;
            this.field4400 = this.field4403 = this.field4407 = 0;
            this.method124((byte) 65);
            return true;
        } else {
            this.method1801();
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "([B[IIIIIIIILv;)I", line = 1322)
    private static final int method1816(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class260 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4403 += (var14 - arg3) * arg9.field4406;
        arg9.field4407 += (var14 - arg3) * arg9.field4399;
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
        arg9.field4400 = var12 >> 2;
        arg9.field4405 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 1356)
    public final synchronized void method1817(int arg0) {
        if (this.field4401 < 0) {
            this.field4401 = -arg0;
        } else {
            this.field4401 = arg0;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I[B[IIIIIIIILv;)I", line = 1363)
    private static final int method1818(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class260 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field4405 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()Lrh;", line = 1401)
    public final class16 method72() {
        return null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I[B[IIIIIIIIIILv;)I", line = 1404)
    private static final int method1819(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class260 arg12) {
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
        arg12.field4400 += (var19 - arg4) * arg12.field4404;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field4403 = var15 >> 2;
        arg12.field4407 = var16 >> 2;
        arg12.field4405 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Llg;II)V", line = 1458)
    private class260(class11 arg0, int arg1, int arg2) {
        this.field182 = arg0;
        this.field4411 = arg0.field122;
        this.field4413 = arg0.field124;
        this.field4412 = arg0.field125;
        this.field4401 = arg1;
        this.field4409 = arg2;
        this.field4408 = 8192;
        this.field4405 = 0;
        this.method1801();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Llg;III)V", line = 1469)
    private class260(class11 arg0, int arg1, int arg2, int arg3) {
        this.field182 = arg0;
        this.field4411 = arg0.field122;
        this.field4413 = arg0.field124;
        this.field4412 = arg0.field125;
        this.field4401 = arg1;
        this.field4409 = arg2;
        this.field4408 = arg3;
        this.field4405 = 0;
        this.method1801();
    }
}
