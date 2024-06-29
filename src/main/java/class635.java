import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class635 extends class476 {

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "I")
    private int field8074;

    @OriginalMember(owner = "client!iha", name = "t", descriptor = "I")
    private int field8073;

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "Z")
    private boolean field8070;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
    private int field8077;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
    private int field8071;

    @OriginalMember(owner = "client!iha", name = "C", descriptor = "I")
    private int field8082;

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
    private int field8072;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    private int field8069;

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
    private int field8075;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
    private int field8076;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "I")
    private int field8078;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "I")
    private int field8079;

    @OriginalMember(owner = "client!iha", name = "A", descriptor = "I")
    private int field8080;

    @OriginalMember(owner = "client!iha", name = "B", descriptor = "I")
    private int field8081;

    @OriginalMember(owner = "client!iha", name = "D", descriptor = "I")
    private int field8083;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "([IIIII)I", line = 3)
    private final int method3391(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field8081 <= 0) {
                if (this.field8077 == -256 && (this.field8072 & 255) == 0) {
                    if (class654.field8426) {
                        return method3430(0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, 0, arg3, arg2, this);
                    }
                    return method3410(((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, 0, arg3, arg2, this);
                }
                if (class654.field8426) {
                    return method3419(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, 0, arg3, arg2, this, this.field8077, arg4);
                }
                return method3416(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, 0, arg3, arg2, this, this.field8077, arg4);
            }
            int var6 = this.field8081 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field8081 += arg1;
            if (this.field8077 == -256 && (this.field8072 & 255) == 0) {
                if (class654.field8426) {
                    arg1 = method3407(0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, this.field8069, this.field8078, 0, var6, arg2, this);
                } else {
                    arg1 = method3427(((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, this.field8079, 0, var6, arg2, this);
                }
            } else if (class654.field8426) {
                arg1 = method3395(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, this.field8069, this.field8078, 0, var6, arg2, this, this.field8077, arg4);
            } else {
                arg1 = method3421(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, this.field8079, 0, var6, arg2, this, this.field8077, arg4);
            }
            this.field8081 -= arg1;
            if (this.field8081 != 0) {
                return arg1;
            }
        } while (!this.method3399());
        return arg3;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[B[IIIIIIIILiha;)I", line = 58)
    private static final int method3392(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class635 arg10) {
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
        arg10.field8072 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V", line = 99)
    public final synchronized void method3393(int arg0) {
        int var2 = ((class701) super.field6183).field9284.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field8072 = arg0;
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "()Lkm;", line = 110)
    public final class476 method40() {
        return null;
    }

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "()V", line = 116)
    private final void method3394() {
        if (this.field8081 != 0) {
            if (this.field8071 == Integer.MIN_VALUE) {
                this.field8071 = 0;
            }
            this.field8081 = 0;
            this.method3415();
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "()I", line = 127)
    public final int method31() {
        return this.field8071 == 0 && this.field8081 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II[B[IIIIIIIIIILiha;II)I", line = 133)
    private static final int method3395(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class635 arg13, int arg14, int arg15) {
        arg13.field8075 -= arg13.field8079 * arg5;
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
        arg13.field8075 += arg13.field8079 * var22;
        arg13.field8076 = arg6;
        arg13.field8083 = arg7;
        arg13.field8072 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(II[B[IIIIIIIIIILiha;II)I", line = 175)
    private static final int method3396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class635 arg13, int arg14, int arg15) {
        arg13.field8075 -= arg13.field8079 * arg5;
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
        arg13.field8075 += arg13.field8079 * var22;
        arg13.field8076 = arg6;
        arg13.field8083 = arg7;
        arg13.field8072 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)V", line = 217)
    public final synchronized void method3397(int arg0) {
        if (arg0 == 0) {
            this.method3402(0);
            this.method1946(-10364);
        } else if (this.field8076 == 0 && this.field8083 == 0) {
            this.field8081 = 0;
            this.field8071 = 0;
            this.field8075 = 0;
            this.method1946(-10364);
        } else {
            int var2 = -this.field8075;
            if (this.field8075 > var2) {
                var2 = this.field8075;
            }
            if (-this.field8076 > var2) {
                var2 = -this.field8076;
            }
            if (this.field8076 > var2) {
                var2 = this.field8076;
            }
            if (-this.field8083 > var2) {
                var2 = -this.field8083;
            }
            if (this.field8083 > var2) {
                var2 = this.field8083;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field8081 = arg0;
            this.field8071 = Integer.MIN_VALUE;
            this.field8079 = -this.field8075 / arg0;
            this.field8069 = -this.field8076 / arg0;
            this.field8078 = -this.field8083 / arg0;
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "([IIIII)I", line = 263)
    private final int method3398(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field8081 <= 0) {
                if (this.field8077 == 256 && (this.field8072 & 255) == 0) {
                    if (class654.field8426) {
                        return method3392(0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, 0, arg3, arg2, this);
                    }
                    return method3408(((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, 0, arg3, arg2, this);
                }
                if (class654.field8426) {
                    return method3414(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, 0, arg3, arg2, this, this.field8077, arg4);
                }
                return method3423(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, 0, arg3, arg2, this, this.field8077, arg4);
            }
            int var6 = this.field8081 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field8081 += arg1;
            if (this.field8077 == 256 && (this.field8072 & 255) == 0) {
                if (class654.field8426) {
                    arg1 = method3400(0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, this.field8069, this.field8078, 0, var6, arg2, this);
                } else {
                    arg1 = method3401(((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, this.field8079, 0, var6, arg2, this);
                }
            } else if (class654.field8426) {
                arg1 = method3396(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8076, this.field8083, this.field8069, this.field8078, 0, var6, arg2, this, this.field8077, arg4);
            } else {
                arg1 = method3404(0, 0, ((class701) super.field6183).field9284, arg0, this.field8072, arg1, this.field8075, this.field8079, 0, var6, arg2, this, this.field8077, arg4);
            }
            this.field8081 -= arg1;
            if (this.field8081 != 0) {
                return arg1;
            }
        } while (!this.method3399());
        return arg3;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "([III)V", line = 319)
    public final synchronized void method33(int[] arg0, int arg1, int arg2) {
        if (this.field8071 == 0 && this.field8081 == 0) {
            this.method36(arg2);
        } else {
            class701 var4 = (class701) super.field6183;
            int var5 = this.field8074 << 8;
            int var6 = this.field8073 << 8;
            int var7 = var4.field9284.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field8080 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field8072 < 0) {
                if (this.field8077 <= 0) {
                    this.method3394();
                    this.method1946(-10364);
                    return;
                }
                this.field8072 = 0;
            }
            if (this.field8072 >= var7) {
                if (this.field8077 >= 0) {
                    this.method3394();
                    this.method1946(-10364);
                    return;
                }
                this.field8072 = var7 - 1;
            }
            if (this.field8080 < 0) {
                if (this.field8070) {
                    if (this.field8077 < 0) {
                        var9 = this.method3391(arg0, arg1, var5, var10, var4.field9284[this.field8074]);
                        if (this.field8072 >= var5) {
                            return;
                        }
                        this.field8072 = var5 + var5 - 1 - this.field8072;
                        this.field8077 = -this.field8077;
                    }
                    while (true) {
                        int var11 = this.method3398(arg0, var9, var6, var10, var4.field9284[this.field8073 - 1]);
                        if (this.field8072 < var6) {
                            return;
                        }
                        this.field8072 = var6 + var6 - 1 - this.field8072;
                        this.field8077 = -this.field8077;
                        var9 = this.method3391(arg0, var11, var5, var10, var4.field9284[this.field8074]);
                        if (this.field8072 >= var5) {
                            return;
                        }
                        this.field8072 = var5 + var5 - 1 - this.field8072;
                        this.field8077 = -this.field8077;
                    }
                } else if (this.field8077 < 0) {
                    while (true) {
                        var9 = this.method3391(arg0, var9, var5, var10, var4.field9284[this.field8073 - 1]);
                        if (this.field8072 >= var5) {
                            return;
                        }
                        this.field8072 = var6 - 1 - (var6 - 1 - this.field8072) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3398(arg0, var9, var6, var10, var4.field9284[this.field8074]);
                        if (this.field8072 < var6) {
                            return;
                        }
                        this.field8072 = (this.field8072 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field8080 > 0) {
                    if (this.field8070) {
                        label130: {
                            if (this.field8077 < 0) {
                                var9 = this.method3391(arg0, arg1, var5, var10, var4.field9284[this.field8074]);
                                if (this.field8072 >= var5) {
                                    return;
                                }
                                this.field8072 = var5 + var5 - 1 - this.field8072;
                                this.field8077 = -this.field8077;
                                if (--this.field8080 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3398(arg0, var9, var6, var10, var4.field9284[this.field8073 - 1]);
                                if (this.field8072 < var6) {
                                    return;
                                }
                                this.field8072 = var6 + var6 - 1 - this.field8072;
                                this.field8077 = -this.field8077;
                                if (--this.field8080 == 0) {
                                    break;
                                }
                                var9 = this.method3391(arg0, var9, var5, var10, var4.field9284[this.field8074]);
                                if (this.field8072 >= var5) {
                                    return;
                                }
                                this.field8072 = var5 + var5 - 1 - this.field8072;
                                this.field8077 = -this.field8077;
                            } while (--this.field8080 != 0);
                        }
                    } else if (this.field8077 < 0) {
                        while (true) {
                            var9 = this.method3391(arg0, var9, var5, var10, var4.field9284[this.field8073 - 1]);
                            if (this.field8072 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field8072) / var8;
                            if (var12 >= this.field8080) {
                                this.field8072 += this.field8080 * var8;
                                this.field8080 = 0;
                                break;
                            }
                            this.field8072 += var8 * var12;
                            this.field8080 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3398(arg0, var9, var6, var10, var4.field9284[this.field8074]);
                            if (this.field8072 < var6) {
                                return;
                            }
                            int var13 = (this.field8072 - var5) / var8;
                            if (var13 >= this.field8080) {
                                this.field8072 -= this.field8080 * var8;
                                this.field8080 = 0;
                                break;
                            }
                            this.field8072 -= var8 * var13;
                            this.field8080 -= var13;
                        }
                    }
                }
                if (this.field8077 < 0) {
                    this.method3391(arg0, var9, 0, var10, 0);
                    if (this.field8072 < 0) {
                        this.field8072 = -1;
                        this.method3394();
                        this.method1946(-10364);
                        return;
                    }
                } else {
                    this.method3398(arg0, var9, var7, var10, 0);
                    if (this.field8072 >= var7) {
                        this.field8072 = var7;
                        this.method3394();
                        this.method1946(-10364);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "()Z", line = 555)
    private final boolean method3399() {
        int var1 = this.field8071;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3406(var1, this.field8082);
            var2 = method3403(var1, this.field8082);
        }
        if (this.field8075 == var1 && this.field8076 == var3 && this.field8083 == var2) {
            if (this.field8071 == Integer.MIN_VALUE) {
                this.field8071 = 0;
                this.field8075 = this.field8076 = this.field8083 = 0;
                this.method1946(-10364);
                return true;
            } else {
                this.method3415();
                return false;
            }
        } else {
            if (this.field8075 < var1) {
                this.field8079 = 1;
                this.field8081 = var1 - this.field8075;
            } else if (this.field8075 > var1) {
                this.field8079 = -1;
                this.field8081 = this.field8075 - var1;
            } else {
                this.field8079 = 0;
            }
            if (this.field8076 < var3) {
                this.field8069 = 1;
                if (this.field8081 == 0 || this.field8081 > var3 - this.field8076) {
                    this.field8081 = var3 - this.field8076;
                }
            } else if (this.field8076 > var3) {
                this.field8069 = -1;
                if (this.field8081 == 0 || this.field8081 > this.field8076 - var3) {
                    this.field8081 = this.field8076 - var3;
                }
            } else {
                this.field8069 = 0;
            }
            if (this.field8083 < var2) {
                this.field8078 = 1;
                if (this.field8081 == 0 || this.field8081 > var2 - this.field8083) {
                    this.field8081 = var2 - this.field8083;
                }
            } else if (this.field8083 > var2) {
                this.field8078 = -1;
                if (this.field8081 == 0 || this.field8081 > this.field8083 - var2) {
                    this.field8081 = this.field8083 - var2;
                }
            } else {
                this.field8078 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I[B[IIIIIIIIIILiha;)I", line = 644)
    private static final int method3400(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class635 arg12) {
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
        arg12.field8075 += (var19 - arg4) * arg12.field8079;
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
        arg12.field8076 = var15 >> 2;
        arg12.field8083 = var16 >> 2;
        arg12.field8072 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "([B[IIIIIIIILiha;)I", line = 697)
    private static final int method3401(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class635 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field8076 += (var14 - arg3) * arg9.field8069;
        arg9.field8083 += (var14 - arg3) * arg9.field8078;
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
        arg9.field8075 = var12 >> 2;
        arg9.field8072 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)V", line = 732)
    private final synchronized void method3402(int arg0) {
        this.method3413(arg0, this.method3425());
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(II)I", line = 735)
    private static final int method3403(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II[B[IIIIIIIILiha;II)I", line = 738)
    private static final int method3404(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class635 arg11, int arg12, int arg13) {
        arg11.field8076 -= arg11.field8069 * arg5;
        arg11.field8083 -= arg11.field8078 * arg5;
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
        arg11.field8076 += arg11.field8069 * arg5;
        arg11.field8083 += arg11.field8078 * arg5;
        arg11.field8075 = arg6;
        arg11.field8072 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "()Z", line = 771)
    public final boolean method3405() {
        return this.field8072 < 0 || this.field8072 >= ((class701) super.field6183).field9284.length << 8;
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(II)I", line = 774)
    private static final int method3406(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I[B[IIIIIIIIIILiha;)I", line = 777)
    private static final int method3407(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class635 arg12) {
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
        arg12.field8075 += (var19 - arg4) * arg12.field8079;
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
        arg12.field8076 = var15 >> 2;
        arg12.field8083 = var16 >> 2;
        arg12.field8072 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "([B[IIIIIIILiha;)I", line = 831)
    private static final int method3408(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class635 arg8) {
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
        arg8.field8072 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "()Z", line = 856)
    public final boolean method3409() {
        return this.field8081 != 0;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "([B[IIIIIIILiha;)I", line = 859)
    private static final int method3410(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class635 arg8) {
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
        arg8.field8072 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lnga;III)Liha;", line = 884)
    public static final class635 method3411(class701 arg0, int arg1, int arg2, int arg3) {
        return arg0.field9284 != null && arg0.field9284.length != 0 ? new class635(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "()Lkm;", line = 890)
    public final class476 method42() {
        return null;
    }

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)V", line = 895)
    public final synchronized void method3412(int arg0) {
        this.method3413(arg0 << 6, this.method3425());
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(II)V", line = 898)
    private final synchronized void method3413(int arg0, int arg1) {
        this.field8071 = arg0;
        this.field8082 = arg1;
        this.field8081 = 0;
        this.method3415();
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(II[B[IIIIIIIILiha;II)I", line = 907)
    private static final int method3414(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class635 arg11, int arg12, int arg13) {
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
        arg11.field8072 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "()V", line = 943)
    private final void method3415() {
        this.field8075 = this.field8071;
        this.field8076 = method3406(this.field8071, this.field8082);
        this.field8083 = method3403(this.field8071, this.field8082);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II[B[IIIIIIILiha;II)I", line = 949)
    private static final int method3416(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class635 arg10, int arg11, int arg12) {
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
        arg10.field8072 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "(I)V", line = 975)
    public final synchronized void method3417(int arg0) {
        if (this.field8077 < 0) {
            this.field8077 = -arg0;
        } else {
            this.field8077 = arg0;
        }
    }

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "(I)V", line = 985)
    public final synchronized void method3418(int arg0) {
        this.method3413(this.method3426(), arg0);
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(II[B[IIIIIIIILiha;II)I", line = 991)
    private static final int method3419(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class635 arg11, int arg12, int arg13) {
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
        arg11.field8072 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V", line = 1023)
    public final synchronized void method3420(boolean arg0) {
        this.field8077 = (this.field8077 >>> 31) + (this.field8077 ^ this.field8077 >> 31);
        if (arg0) {
            this.field8077 = -this.field8077;
        }
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(II[B[IIIIIIIILiha;II)I", line = 1029)
    private static final int method3421(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class635 arg11, int arg12, int arg13) {
        arg11.field8076 -= arg11.field8069 * arg5;
        arg11.field8083 -= arg11.field8078 * arg5;
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
        arg11.field8076 += arg11.field8069 * arg5;
        arg11.field8083 += arg11.field8078 * arg5;
        arg11.field8075 = arg6;
        arg11.field8072 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "()I", line = 1062)
    public final synchronized int method3422() {
        return this.field8077 < 0 ? -this.field8077 : this.field8077;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(II[B[IIIIIIILiha;II)I", line = 1065)
    private static final int method3423(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class635 arg10, int arg11, int arg12) {
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
        arg10.field8072 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "(II)V", line = 1091)
    public final synchronized void method3424(int arg0, int arg1) {
        this.method3429(arg0, arg1, this.method3425());
    }

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "()I", line = 1094)
    public final synchronized int method3425() {
        return this.field8082 < 0 ? -1 : this.field8082;
    }

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "()I", line = 1097)
    public final synchronized int method3426() {
        return this.field8071 == Integer.MIN_VALUE ? 0 : this.field8071;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V", line = 1101)
    public final synchronized void method36(int arg0) {
        if (this.field8081 > 0) {
            if (arg0 >= this.field8081) {
                if (this.field8071 == Integer.MIN_VALUE) {
                    this.field8071 = 0;
                    this.field8075 = this.field8076 = this.field8083 = 0;
                    this.method1946(-10364);
                    arg0 = this.field8081;
                }
                this.field8081 = 0;
                this.method3415();
            } else {
                this.field8075 += this.field8079 * arg0;
                this.field8076 += this.field8069 * arg0;
                this.field8083 += this.field8078 * arg0;
                this.field8081 -= arg0;
            }
        }
        class701 var2 = (class701) super.field6183;
        int var3 = this.field8074 << 8;
        int var4 = this.field8073 << 8;
        int var5 = var2.field9284.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field8080 = 0;
        }
        if (this.field8072 < 0) {
            if (this.field8077 <= 0) {
                this.method3394();
                this.method1946(-10364);
                return;
            }
            this.field8072 = 0;
        }
        if (this.field8072 >= var5) {
            if (this.field8077 >= 0) {
                this.method3394();
                this.method1946(-10364);
                return;
            }
            this.field8072 = var5 - 1;
        }
        this.field8072 += this.field8077 * arg0;
        if (this.field8080 < 0) {
            if (!this.field8070) {
                if (this.field8077 < 0) {
                    if (this.field8072 < var3) {
                        this.field8072 = var4 - 1 - (var4 - 1 - this.field8072) % var6;
                    }
                } else if (this.field8072 >= var4) {
                    this.field8072 = (this.field8072 - var3) % var6 + var3;
                }
            } else {
                if (this.field8077 < 0) {
                    if (this.field8072 >= var3) {
                        return;
                    }
                    this.field8072 = var3 + var3 - 1 - this.field8072;
                    this.field8077 = -this.field8077;
                }
                while (this.field8072 >= var4) {
                    this.field8072 = var4 + var4 - 1 - this.field8072;
                    this.field8077 = -this.field8077;
                    if (this.field8072 >= var3) {
                        return;
                    }
                    this.field8072 = var3 + var3 - 1 - this.field8072;
                    this.field8077 = -this.field8077;
                }
            }
        } else {
            if (this.field8080 > 0) {
                if (this.field8070) {
                    label125: {
                        if (this.field8077 < 0) {
                            if (this.field8072 >= var3) {
                                return;
                            }
                            this.field8072 = var3 + var3 - 1 - this.field8072;
                            this.field8077 = -this.field8077;
                            if (--this.field8080 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field8072 < var4) {
                                return;
                            }
                            this.field8072 = var4 + var4 - 1 - this.field8072;
                            this.field8077 = -this.field8077;
                            if (--this.field8080 == 0) {
                                break;
                            }
                            if (this.field8072 >= var3) {
                                return;
                            }
                            this.field8072 = var3 + var3 - 1 - this.field8072;
                            this.field8077 = -this.field8077;
                        } while (--this.field8080 != 0);
                    }
                } else if (this.field8077 < 0) {
                    if (this.field8072 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field8072) / var6;
                    if (var7 < this.field8080) {
                        this.field8072 += var6 * var7;
                        this.field8080 -= var7;
                        return;
                    }
                    this.field8072 += this.field8080 * var6;
                    this.field8080 = 0;
                } else {
                    if (this.field8072 < var4) {
                        return;
                    }
                    int var8 = (this.field8072 - var3) / var6;
                    if (var8 < this.field8080) {
                        this.field8072 -= var6 * var8;
                        this.field8080 -= var8;
                        return;
                    }
                    this.field8072 -= this.field8080 * var6;
                    this.field8080 = 0;
                }
            }
            if (this.field8077 < 0) {
                if (this.field8072 < 0) {
                    this.field8072 = -1;
                    this.method3394();
                    this.method1946(-10364);
                    return;
                }
            } else if (this.field8072 >= var5) {
                this.field8072 = var5;
                this.method3394();
                this.method1946(-10364);
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "([B[IIIIIIIILiha;)I", line = 1319)
    private static final int method3427(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class635 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field8076 += (var14 - arg3) * arg9.field8069;
        arg9.field8083 += (var14 - arg3) * arg9.field8078;
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
        arg9.field8075 = var12 >> 2;
        arg9.field8072 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "(I)V", line = 1353)
    public final synchronized void method3428(int arg0) {
        this.field8080 = arg0;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)V", line = 1357)
    public final synchronized void method3429(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3413(arg1, arg2);
        } else {
            int var4 = method3406(arg1, arg2);
            int var5 = method3403(arg1, arg2);
            if (this.field8076 == var4 && this.field8083 == var5) {
                this.field8081 = 0;
            } else {
                int var6 = arg1 - this.field8075;
                if (this.field8075 - arg1 > var6) {
                    var6 = this.field8075 - arg1;
                }
                if (var4 - this.field8076 > var6) {
                    var6 = var4 - this.field8076;
                }
                if (this.field8076 - var4 > var6) {
                    var6 = this.field8076 - var4;
                }
                if (var5 - this.field8083 > var6) {
                    var6 = var5 - this.field8083;
                }
                if (this.field8083 - var5 > var6) {
                    var6 = this.field8083 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field8081 = arg0;
                this.field8071 = arg1;
                this.field8082 = arg2;
                this.field8079 = (arg1 - this.field8075) / arg0;
                this.field8069 = (var4 - this.field8076) / arg0;
                this.field8078 = (var5 - this.field8083) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lnga;III)V", line = 1405)
    private class635(class701 arg0, int arg1, int arg2, int arg3) {
        super.field6183 = arg0;
        this.field8074 = arg0.field9282;
        this.field8073 = arg0.field9281;
        this.field8070 = arg0.field9283;
        this.field8077 = arg1;
        this.field8071 = arg2;
        this.field8082 = arg3;
        this.field8072 = 0;
        this.method3415();
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "()I", line = 1418)
    public final int method2680() {
        int var1 = this.field8075 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field8080 == 0) {
            var2 -= this.field8072 * var2 / (((class701) super.field6183).field9284.length << 8);
        } else if (this.field8080 >= 0) {
            var2 -= this.field8074 * var2 / ((class701) super.field6183).field9284.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I[B[IIIIIIIILiha;)I", line = 1430)
    private static final int method3430(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class635 arg10) {
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
        arg10.field8072 = var11 << 8;
        return var16 >> 1;
    }
}
