import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class330 extends class24 {

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    private int field5124;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    private int field5128;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "Z")
    private boolean field5129;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    private int field5123;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    private int field5127;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    private int field5125;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    private int field5126;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    private int field5130;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    private int field5132;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    private int field5133;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    private int field5134;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    private int field5136;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "()V", line = 3)
    private final void method2254() {
        if (this.field5132 == 0) {
            return;
        }
        if (this.field5127 == Integer.MIN_VALUE) {
            this.field5127 = 0;
        }
        this.field5132 = 0;
        this.method2259();
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "()Z", line = 14)
    public final boolean method2255() {
        return this.field5132 != 0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "([III)V", line = 17)
    public final synchronized void method234(int[] arg0, int arg1, int arg2) {
        if (this.field5127 == 0 && this.field5132 == 0) {
            this.method235(arg2);
            return;
        }
        class340 var4 = (class340) this.field388;
        int var5 = this.field5124 << 8;
        int var6 = this.field5128 << 8;
        int var7 = var4.field5313.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field5130 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field5122 < 0) {
            if (this.field5123 <= 0) {
                this.method2254();
                this.method403(1);
                return;
            }
            this.field5122 = 0;
        }
        if (this.field5122 >= var7) {
            if (this.field5123 >= 0) {
                this.method2254();
                this.method403(1);
                return;
            }
            this.field5122 = var7 - 1;
        }
        if (this.field5130 >= 0) {
            if (this.field5130 > 0) {
                if (this.field5129) {
                    label131: {
                        if (this.field5123 < 0) {
                            var9 = this.method2260(arg0, arg1, var5, var10, var4.field5313[this.field5124]);
                            if (this.field5122 >= var5) {
                                return;
                            }
                            this.field5122 = var5 + var5 - this.field5122 - 1;
                            this.field5123 = -this.field5123;
                            if (--this.field5130 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2275(arg0, var9, var6, var10, var4.field5313[this.field5128 - 1]);
                            if (this.field5122 < var6) {
                                return;
                            }
                            this.field5122 = var6 + var6 - this.field5122 - 1;
                            this.field5123 = -this.field5123;
                            if (--this.field5130 == 0) {
                                break;
                            }
                            var9 = this.method2260(arg0, var9, var5, var10, var4.field5313[this.field5124]);
                            if (this.field5122 >= var5) {
                                return;
                            }
                            this.field5122 = var5 + var5 - this.field5122 - 1;
                            this.field5123 = -this.field5123;
                        } while (--this.field5130 != 0);
                    }
                } else if (this.field5123 < 0) {
                    while (true) {
                        var9 = this.method2260(arg0, var9, var5, var10, var4.field5313[this.field5128 - 1]);
                        if (this.field5122 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field5122 - 1) / var8;
                        if (var12 >= this.field5130) {
                            this.field5122 += this.field5130 * var8;
                            this.field5130 = 0;
                            break;
                        }
                        this.field5122 += var8 * var12;
                        this.field5130 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2275(arg0, var9, var6, var10, var4.field5313[this.field5124]);
                        if (this.field5122 < var6) {
                            return;
                        }
                        int var13 = (this.field5122 - var5) / var8;
                        if (var13 >= this.field5130) {
                            this.field5122 -= this.field5130 * var8;
                            this.field5130 = 0;
                            break;
                        }
                        this.field5122 -= var8 * var13;
                        this.field5130 -= var13;
                    }
                }
            }
            if (this.field5123 < 0) {
                this.method2260(arg0, var9, 0, var10, 0);
                if (this.field5122 < 0) {
                    this.field5122 = -1;
                    this.method2254();
                    this.method403(1);
                }
            } else {
                this.method2275(arg0, var9, var7, var10, 0);
                if (this.field5122 >= var7) {
                    this.field5122 = var7;
                    this.method2254();
                    this.method403(1);
                }
            }
        } else if (this.field5129) {
            if (this.field5123 < 0) {
                var9 = this.method2260(arg0, arg1, var5, var10, var4.field5313[this.field5124]);
                if (this.field5122 >= var5) {
                    return;
                }
                this.field5122 = var5 + var5 - this.field5122 - 1;
                this.field5123 = -this.field5123;
            }
            while (true) {
                int var11 = this.method2275(arg0, var9, var6, var10, var4.field5313[this.field5128 - 1]);
                if (this.field5122 < var6) {
                    return;
                }
                this.field5122 = var6 + var6 - this.field5122 - 1;
                this.field5123 = -this.field5123;
                var9 = this.method2260(arg0, var11, var5, var10, var4.field5313[this.field5124]);
                if (this.field5122 >= var5) {
                    return;
                }
                this.field5122 = var5 + var5 - this.field5122 - 1;
                this.field5123 = -this.field5123;
            }
        } else if (this.field5123 < 0) {
            while (true) {
                var9 = this.method2260(arg0, var9, var5, var10, var4.field5313[this.field5128 - 1]);
                if (this.field5122 >= var5) {
                    return;
                }
                this.field5122 = var6 - (var6 - 1 - this.field5122) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2275(arg0, var9, var6, var10, var4.field5313[this.field5124]);
                if (this.field5122 < var6) {
                    return;
                }
                this.field5122 = (this.field5122 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[B[IIIIIIIIIILak;II)I", line = 252)
    private static final int method2256(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class330 arg13, int arg14, int arg15) {
        arg13.field5126 -= arg13.field5131 * arg5;
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
        arg13.field5126 += arg13.field5131 * var26;
        arg13.field5134 = arg6;
        arg13.field5133 = arg7;
        arg13.field5122 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[B[IIIIIIILak;II)I", line = 295)
    private static final int method2257(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10, int arg11, int arg12) {
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
        arg10.field5122 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([B[IIIIIIILak;)I", line = 325)
    private static final int method2258(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class330 arg8) {
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
        arg8.field5122 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "()V", line = 351)
    private final void method2259() {
        this.field5126 = this.field5127;
        this.field5134 = method2290(this.field5127, this.field5125);
        this.field5133 = method2276(this.field5127, this.field5125);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIIII)I", line = 356)
    private final int method2260(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5132 > 0) {
                int var6 = this.field5132 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5132 += arg1;
                if (this.field5123 == -256 && (this.field5122 & 0xFF) == 0) {
                    if (class156.field2337) {
                        arg1 = method2277(0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, this.field5135, this.field5136, 0, var6, arg2, this);
                    } else {
                        arg1 = method2274(((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, this.field5131, 0, var6, arg2, this);
                    }
                } else if (class156.field2337) {
                    arg1 = method2256(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, this.field5135, this.field5136, 0, var6, arg2, this, this.field5123, arg4);
                } else {
                    arg1 = method2278(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, this.field5131, 0, var6, arg2, this, this.field5123, arg4);
                }
                this.field5132 -= arg1;
                if (this.field5132 != 0) {
                    return arg1;
                }
                if (!this.method2283()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5123 == -256 && (this.field5122 & 0xFF) == 0) {
                if (class156.field2337) {
                    return method2293(0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, 0, arg3, arg2, this);
                }
                return method2262(((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, 0, arg3, arg2, this);
            }
            if (class156.field2337) {
                return method2291(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, 0, arg3, arg2, this, this.field5123, arg4);
            }
            return method2257(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, 0, arg3, arg2, this, this.field5123, arg4);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V", line = 411)
    public final synchronized void method235(int arg0) {
        if (this.field5132 > 0) {
            if (arg0 >= this.field5132) {
                if (this.field5127 == Integer.MIN_VALUE) {
                    this.field5127 = 0;
                    this.field5126 = this.field5134 = this.field5133 = 0;
                    this.method403(1);
                    arg0 = this.field5132;
                }
                this.field5132 = 0;
                this.method2259();
            } else {
                this.field5126 += this.field5131 * arg0;
                this.field5134 += this.field5135 * arg0;
                this.field5133 += this.field5136 * arg0;
                this.field5132 -= arg0;
            }
        }
        class340 var2 = (class340) this.field388;
        int var3 = this.field5124 << 8;
        int var4 = this.field5128 << 8;
        int var5 = var2.field5313.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5130 = 0;
        }
        if (this.field5122 < 0) {
            if (this.field5123 <= 0) {
                this.method2254();
                this.method403(1);
                return;
            }
            this.field5122 = 0;
        }
        if (this.field5122 >= var5) {
            if (this.field5123 >= 0) {
                this.method2254();
                this.method403(1);
                return;
            }
            this.field5122 = var5 - 1;
        }
        this.field5122 += this.field5123 * arg0;
        if (this.field5130 >= 0) {
            if (this.field5130 > 0) {
                if (this.field5129) {
                    label121: {
                        if (this.field5123 < 0) {
                            if (this.field5122 >= var3) {
                                return;
                            }
                            this.field5122 = var3 + var3 - this.field5122 - 1;
                            this.field5123 = -this.field5123;
                            if (--this.field5130 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field5122 < var4) {
                                return;
                            }
                            this.field5122 = var4 + var4 - this.field5122 - 1;
                            this.field5123 = -this.field5123;
                            if (--this.field5130 == 0) {
                                break;
                            }
                            if (this.field5122 >= var3) {
                                return;
                            }
                            this.field5122 = var3 + var3 - this.field5122 - 1;
                            this.field5123 = -this.field5123;
                        } while (--this.field5130 != 0);
                    }
                } else {
                    label153: {
                        if (this.field5123 < 0) {
                            if (this.field5122 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field5122 - 1) / var6;
                            if (var7 >= this.field5130) {
                                this.field5122 += this.field5130 * var6;
                                this.field5130 = 0;
                                break label153;
                            }
                            this.field5122 += var6 * var7;
                            this.field5130 -= var7;
                        } else if (this.field5122 >= var4) {
                            int var8 = (this.field5122 - var3) / var6;
                            if (var8 >= this.field5130) {
                                this.field5122 -= this.field5130 * var6;
                                this.field5130 = 0;
                                break label153;
                            }
                            this.field5122 -= var6 * var8;
                            this.field5130 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field5123 < 0) {
                if (this.field5122 < 0) {
                    this.field5122 = -1;
                    this.method2254();
                    this.method403(1);
                }
            } else if (this.field5122 >= var5) {
                this.field5122 = var5;
                this.method2254();
                this.method403(1);
            }
        } else if (this.field5129) {
            if (this.field5123 < 0) {
                if (this.field5122 >= var3) {
                    return;
                }
                this.field5122 = var3 + var3 - this.field5122 - 1;
                this.field5123 = -this.field5123;
            }
            while (this.field5122 >= var4) {
                this.field5122 = var4 + var4 - this.field5122 - 1;
                this.field5123 = -this.field5123;
                if (this.field5122 >= var3) {
                    return;
                }
                this.field5122 = var3 + var3 - this.field5122 - 1;
                this.field5123 = -this.field5123;
            }
        } else if (this.field5123 < 0) {
            if (this.field5122 >= var3) {
                return;
            }
            this.field5122 = var4 - (var4 - 1 - this.field5122) % var6 - 1;
        } else if (this.field5122 >= var4) {
            this.field5122 = (this.field5122 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "()I", line = 629)
    public final synchronized int method2261() {
        return this.field5125 < 0 ? -1 : this.field5125;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()Lp;", line = 634)
    public final class24 method233() {
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "([B[IIIIIIILak;)I", line = 638)
    private static final int method2262(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class330 arg8) {
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
        arg8.field5122 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)V", line = 663)
    public final synchronized void method2263(boolean arg0) {
        this.field5123 = (this.field5123 >>> 31) + (this.field5123 ^ this.field5123 >> 31);
        if (arg0) {
            this.field5123 = -this.field5123;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([B[IIIIIIIILak;)I", line = 669)
    private static final int method2264(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class330 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5134 += (var14 - arg3) * arg9.field5135;
        arg9.field5133 += (var14 - arg3) * arg9.field5136;
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
        arg9.field5126 = var12 >> 2;
        arg9.field5122 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "()I", line = 703)
    public final synchronized int method2265() {
        return this.field5127 == Integer.MIN_VALUE ? 0 : this.field5127;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljf;II)Lak;", line = 706)
    public static final class330 method2266(class340 arg0, int arg1, int arg2) {
        return arg0.field5313 == null || arg0.field5313.length == 0 ? null : new class330(arg0, (int) ((long) arg0.field5312 * 256L * (long) arg1 / (long) (class220.field3413 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "()Z", line = 716)
    public final boolean method2267() {
        return this.field5122 < 0 || this.field5122 >= ((class340) this.field388).field5313.length << 8;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 719)
    public final synchronized void method2268(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2269(arg1, arg2);
            return;
        }
        int var4 = method2290(arg1, arg2);
        int var5 = method2276(arg1, arg2);
        if (this.field5134 == var4 && this.field5133 == var5) {
            this.field5132 = 0;
            return;
        }
        int var6 = arg1 - this.field5126;
        if (this.field5126 - arg1 > var6) {
            var6 = this.field5126 - arg1;
        }
        if (var4 - this.field5134 > var6) {
            var6 = var4 - this.field5134;
        }
        if (this.field5134 - var4 > var6) {
            var6 = this.field5134 - var4;
        }
        if (var5 - this.field5133 > var6) {
            var6 = var5 - this.field5133;
        }
        if (this.field5133 - var5 > var6) {
            var6 = this.field5133 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field5132 = arg0;
        this.field5127 = arg1;
        this.field5125 = arg2;
        this.field5131 = (arg1 - this.field5126) / arg0;
        this.field5135 = (var4 - this.field5134) / arg0;
        this.field5136 = (var5 - this.field5133) / arg0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V", line = 765)
    private final synchronized void method2269(int arg0, int arg1) {
        this.field5127 = arg0;
        this.field5125 = arg1;
        this.field5132 = 0;
        this.method2259();
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V", line = 772)
    public final synchronized void method2270(int arg0) {
        this.field5130 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V", line = 776)
    public final synchronized void method2271(int arg0) {
        int var2 = ((class340) this.field388).field5313.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5122 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)V", line = 786)
    public final synchronized void method2272(int arg0, int arg1) {
        this.method2268(arg0, arg1, this.method2261());
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V", line = 792)
    public final synchronized void method2273(int arg0) {
        if (this.field5123 < 0) {
            this.field5123 = -arg0;
        } else {
            this.field5123 = arg0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "([B[IIIIIIIILak;)I", line = 799)
    private static final int method2274(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class330 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5134 += (var14 - arg3) * arg9.field5135;
        arg9.field5133 += (var14 - arg3) * arg9.field5136;
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
        arg9.field5126 = var12 >> 2;
        arg9.field5122 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "([IIIII)I", line = 834)
    private final int method2275(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5132 > 0) {
                int var6 = this.field5132 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5132 += arg1;
                if (this.field5123 == 256 && (this.field5122 & 0xFF) == 0) {
                    if (class156.field2337) {
                        arg1 = method2279(0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, this.field5135, this.field5136, 0, var6, arg2, this);
                    } else {
                        arg1 = method2264(((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, this.field5131, 0, var6, arg2, this);
                    }
                } else if (class156.field2337) {
                    arg1 = method2285(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, this.field5135, this.field5136, 0, var6, arg2, this, this.field5123, arg4);
                } else {
                    arg1 = method2280(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, this.field5131, 0, var6, arg2, this, this.field5123, arg4);
                }
                this.field5132 -= arg1;
                if (this.field5132 != 0) {
                    return arg1;
                }
                if (!this.method2283()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5123 == 256 && (this.field5122 & 0xFF) == 0) {
                if (class156.field2337) {
                    return method2289(0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, 0, arg3, arg2, this);
                }
                return method2258(((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, 0, arg3, arg2, this);
            }
            if (class156.field2337) {
                return method2288(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5134, this.field5133, 0, arg3, arg2, this, this.field5123, arg4);
            }
            return method2281(0, 0, ((class340) this.field388).field5313, arg0, this.field5122, arg1, this.field5126, 0, arg3, arg2, this, this.field5123, arg4);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)I", line = 890)
    private static final int method2276(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[B[IIIIIIIIIILak;)I", line = 893)
    private static final int method2277(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class330 arg12) {
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
        arg12.field5126 += (var19 - arg4) * arg12.field5131;
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
        arg12.field5134 = var15 >> 2;
        arg12.field5133 = var16 >> 2;
        arg12.field5122 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[B[IIIIIIIILak;II)I", line = 948)
    private static final int method2278(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
        arg11.field5134 -= arg11.field5135 * arg5;
        arg11.field5133 -= arg11.field5136 * arg5;
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
        arg11.field5134 += arg11.field5135 * arg5;
        arg11.field5133 += arg11.field5136 * arg5;
        arg11.field5126 = arg6;
        arg11.field5122 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I[B[IIIIIIIIIILak;)I", line = 981)
    private static final int method2279(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class330 arg12) {
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
        arg12.field5126 += (var19 - arg4) * arg12.field5131;
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
        arg12.field5134 = var15 >> 2;
        arg12.field5133 = var16 >> 2;
        arg12.field5122 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II[B[IIIIIIIILak;II)I", line = 1034)
    private static final int method2280(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
        arg11.field5134 -= arg11.field5135 * arg5;
        arg11.field5133 -= arg11.field5136 * arg5;
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
        arg11.field5134 += arg11.field5135 * arg5;
        arg11.field5133 += arg11.field5136 * arg5;
        arg11.field5126 = arg6;
        arg11.field5122 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()Lp;", line = 1067)
    public final class24 method232() {
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "()I", line = 1071)
    public final int method236() {
        int var1 = this.field5126 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5130 == 0) {
            var2 -= this.field5122 * var2 / (((class340) this.field388).field5313.length << 8);
        } else if (this.field5130 >= 0) {
            var2 -= this.field5124 * var2 / ((class340) this.field388).field5313.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II[B[IIIIIIILak;II)I", line = 1084)
    private static final int method2281(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10, int arg11, int arg12) {
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
        arg10.field5122 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 1110)
    public final synchronized void method2282(int arg0) {
        this.method2269(arg0 << 6, this.method2261());
    }

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "()Z", line = 1115)
    private final boolean method2283() {
        int var1 = this.field5127;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2290(var1, this.field5125);
            var2 = method2276(var1, this.field5125);
        }
        if (this.field5126 != var1 || this.field5134 != var3 || this.field5133 != var2) {
            if (this.field5126 < var1) {
                this.field5131 = 1;
                this.field5132 = var1 - this.field5126;
            } else if (this.field5126 > var1) {
                this.field5131 = -1;
                this.field5132 = this.field5126 - var1;
            } else {
                this.field5131 = 0;
            }
            if (this.field5134 < var3) {
                this.field5135 = 1;
                if (this.field5132 == 0 || this.field5132 > var3 - this.field5134) {
                    this.field5132 = var3 - this.field5134;
                }
            } else if (this.field5134 > var3) {
                this.field5135 = -1;
                if (this.field5132 == 0 || this.field5132 > this.field5134 - var3) {
                    this.field5132 = this.field5134 - var3;
                }
            } else {
                this.field5135 = 0;
            }
            if (this.field5133 < var2) {
                this.field5136 = 1;
                if (this.field5132 == 0 || this.field5132 > var2 - this.field5133) {
                    this.field5132 = var2 - this.field5133;
                }
            } else if (this.field5133 > var2) {
                this.field5136 = -1;
                if (this.field5132 == 0 || this.field5132 > this.field5133 - var2) {
                    this.field5132 = this.field5133 - var2;
                }
            } else {
                this.field5136 = 0;
            }
            return false;
        } else if (this.field5127 == Integer.MIN_VALUE) {
            this.field5127 = 0;
            this.field5126 = this.field5134 = this.field5133 = 0;
            this.method403(1);
            return true;
        } else {
            this.method2259();
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljf;III)Lak;", line = 1200)
    public static final class330 method2284(class340 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5313 == null || arg0.field5313.length == 0 ? null : new class330(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II[B[IIIIIIIIIILak;II)I", line = 1208)
    private static final int method2285(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class330 arg13, int arg14, int arg15) {
        arg13.field5126 -= arg13.field5131 * arg5;
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
        arg13.field5126 += arg13.field5131 * var27;
        arg13.field5134 = arg6;
        arg13.field5133 = arg7;
        arg13.field5122 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V", line = 1250)
    private final synchronized void method2286(int arg0) {
        this.method2269(arg0, this.method2261());
    }

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "()I", line = 1255)
    public final synchronized int method2287() {
        return this.field5123 < 0 ? -this.field5123 : this.field5123;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II[B[IIIIIIIILak;II)I", line = 1258)
    private static final int method2288(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
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
        arg11.field5122 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "()I", line = 1291)
    public final int method237() {
        return this.field5127 == 0 && this.field5132 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[B[IIIIIIIILak;)I", line = 1297)
    private static final int method2289(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10) {
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
        arg10.field5122 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)I", line = 1335)
    private static final int method2290(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II[B[IIIIIIIILak;II)I", line = 1338)
    private static final int method2291(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class330 arg11, int arg12, int arg13) {
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
        arg11.field5122 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "(I)V", line = 1371)
    public final synchronized void method2292(int arg0) {
        if (arg0 == 0) {
            this.method2286(0);
            this.method403(1);
        } else if (this.field5134 == 0 && this.field5133 == 0) {
            this.field5132 = 0;
            this.field5127 = 0;
            this.field5126 = 0;
            this.method403(1);
        } else {
            int var2 = -this.field5126;
            if (this.field5126 > var2) {
                var2 = this.field5126;
            }
            if (-this.field5134 > var2) {
                var2 = -this.field5134;
            }
            if (this.field5134 > var2) {
                var2 = this.field5134;
            }
            if (-this.field5133 > var2) {
                var2 = -this.field5133;
            }
            if (this.field5133 > var2) {
                var2 = this.field5133;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5132 = arg0;
            this.field5127 = Integer.MIN_VALUE;
            this.field5131 = -this.field5126 / arg0;
            this.field5135 = -this.field5134 / arg0;
            this.field5136 = -this.field5133 / arg0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I[B[IIIIIIIILak;)I", line = 1418)
    private static final int method2293(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class330 arg10) {
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
        arg10.field5122 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljf;II)V", line = 1457)
    private class330(class340 arg0, int arg1, int arg2) {
        this.field388 = arg0;
        this.field5124 = arg0.field5311;
        this.field5128 = arg0.field5310;
        this.field5129 = arg0.field5314;
        this.field5123 = arg1;
        this.field5127 = arg2;
        this.field5125 = 8192;
        this.field5122 = 0;
        this.method2259();
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljf;III)V", line = 1468)
    private class330(class340 arg0, int arg1, int arg2, int arg3) {
        this.field388 = arg0;
        this.field5124 = arg0.field5311;
        this.field5128 = arg0.field5310;
        this.field5129 = arg0.field5314;
        this.field5123 = arg1;
        this.field5127 = arg2;
        this.field5125 = arg3;
        this.field5122 = 0;
        this.method2259();
    }
}
