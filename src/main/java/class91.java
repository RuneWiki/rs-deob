import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class91 extends class38 {

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    private int field2195;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    private int field2192;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    private int field2198;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    private int field2199;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    private int field2197;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    private int field2200;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    private int field2202;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Z")
    private boolean field2196;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 4)
    public final synchronized void method670(int arg0) {
        this.field2202 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([B[IIIIIIILpa;)I", line = 8)
    private static final int method671(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class91 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field2199 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[B[IIIIIIIIILpa;II)I", line = 33)
    private static final int method672(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class91 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 + 256 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        int var18 = arg13;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var17)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += var18;
        }
        arg12.field2198 = arg6;
        arg12.field2199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lnd;II)Lpa;", line = 62)
    public static final class91 method673(class82 arg0, int arg1, int arg2) {
        return arg0.field1946 != null && arg0.field1946.length != 0 ? new class91(arg0, (int) ((long) arg0.field1945 * 256L * (long) arg1 / (long) (class48.field1298 * 100)), arg2) : null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([B[IIIIIIIIILpa;)I", line = 68)
    private static final int method674(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class91 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11--] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11--] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11--] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11--] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field2198 = var13 >> 8;
        arg10.field2199 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[B[IIIIIIILpa;II)I", line = 102)
    private static final int method675(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class91 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6;
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
            arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6;
            arg4 += arg11;
        }
        arg10.field2199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()I", line = 129)
    public final int method381() {
        int var1 = this.field2198 * 3;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2202 == 0) {
            var2 -= this.field2199 * var2 / (((class82) super.field1097).field1946.length << 8);
        } else if (this.field2202 >= 0) {
            var2 -= this.field2195 * var2 / ((class82) super.field1097).field1946.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II[B[IIIIIIILpa;II)I", line = 141)
    private static final int method676(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class91 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6;
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
            arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6;
            arg4 += var16;
        }
        arg10.field2199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "([B[IIIIIIIIILpa;)I", line = 169)
    private static final int method677(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class91 arg10) {
        int var11 = arg2 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg4 << 8;
        int var14 = arg6 << 8;
        int var15;
        if ((var15 = arg3 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        var15 -= 3;
        int var10001;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            int var16 = var13 + var14;
            int var19 = arg3++;
            arg1[var19] += arg0[var11++] * var16 >> arg5;
            int var17 = var14 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var11++] * var17 >> arg5;
            int var18 = var14 + var17;
            int var21 = arg3++;
            arg1[var21] += arg0[var11++] * var18 >> arg5;
            var13 = var14 + var18;
        }
        var15 += 3;
        while (arg3 < var15) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var11++] * var13 >> arg5;
            var13 += var14;
        }
        arg10.field2198 = var13 >> 8;
        arg10.field2199 = var11 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()Z", line = 201)
    public final boolean method678() {
        return this.method715((byte) 125);
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V", line = 204)
    public final synchronized void method679(int arg0) {
        this.field2198 = arg0;
        this.field2194 = 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([III)I", line = 210)
    public final synchronized int method382(int[] arg0, int arg1, int arg2) {
        if (this.field2198 != 0 || this.field2194 != 0 && this.field2200 != 0 && this.field2200 != Integer.MIN_VALUE) {
            class82 var4 = (class82) super.field1097;
            int var5 = this.field2195 << 8;
            int var6 = this.field2192 << 8;
            int var7 = var4.field1946.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field2202 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field2202 < 0) {
                if (this.field2196) {
                    if (this.field2193 < 0) {
                        var9 = this.method680(arg0, arg1, var5, var10, var4.field1946[this.field2195]);
                        if (this.field2199 >= var5) {
                            return 1;
                        }
                        this.field2199 = var5 + var5 - 1 - this.field2199;
                        this.field2193 = -this.field2193;
                    }
                    while (true) {
                        int var11 = this.method681(arg0, var9, var6, var10, var4.field1946[this.field2192 - 1]);
                        if (this.field2199 < var6) {
                            return 1;
                        }
                        this.field2199 = var6 + var6 - 1 - this.field2199;
                        this.field2193 = -this.field2193;
                        var9 = this.method680(arg0, var11, var5, var10, var4.field1946[this.field2195]);
                        if (this.field2199 >= var5) {
                            return 1;
                        }
                        this.field2199 = var5 + var5 - 1 - this.field2199;
                        this.field2193 = -this.field2193;
                    }
                } else if (this.field2193 < 0) {
                    while (true) {
                        var9 = this.method680(arg0, var9, var5, var10, var4.field1946[this.field2192 - 1]);
                        if (this.field2199 >= var5) {
                            return 1;
                        }
                        this.field2199 = var6 - 1 - (var6 - 1 - this.field2199) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method681(arg0, var9, var6, var10, var4.field1946[this.field2195]);
                        if (this.field2199 < var6) {
                            return 1;
                        }
                        this.field2199 = (this.field2199 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field2202 > 0) {
                    if (this.field2196) {
                        label118: {
                            if (this.field2193 < 0) {
                                var9 = this.method680(arg0, arg1, var5, var10, var4.field1946[this.field2195]);
                                if (this.field2199 >= var5) {
                                    return 1;
                                }
                                this.field2199 = var5 + var5 - 1 - this.field2199;
                                this.field2193 = -this.field2193;
                                if (--this.field2202 == 0) {
                                    break label118;
                                }
                            }
                            do {
                                var9 = this.method681(arg0, var9, var6, var10, var4.field1946[this.field2192 - 1]);
                                if (this.field2199 < var6) {
                                    return 1;
                                }
                                this.field2199 = var6 + var6 - 1 - this.field2199;
                                this.field2193 = -this.field2193;
                                if (--this.field2202 == 0) {
                                    break;
                                }
                                var9 = this.method680(arg0, var9, var5, var10, var4.field1946[this.field2195]);
                                if (this.field2199 >= var5) {
                                    return 1;
                                }
                                this.field2199 = var5 + var5 - 1 - this.field2199;
                                this.field2193 = -this.field2193;
                            } while (--this.field2202 != 0);
                        }
                    } else if (this.field2193 < 0) {
                        while (true) {
                            var9 = this.method680(arg0, var9, var5, var10, var4.field1946[this.field2192 - 1]);
                            if (this.field2199 >= var5) {
                                return 1;
                            }
                            int var12 = (var6 - 1 - this.field2199) / var8;
                            if (var12 >= this.field2202) {
                                this.field2199 += this.field2202 * var8;
                                this.field2202 = 0;
                                break;
                            }
                            this.field2199 += var8 * var12;
                            this.field2202 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method681(arg0, var9, var6, var10, var4.field1946[this.field2195]);
                            if (this.field2199 < var6) {
                                return 1;
                            }
                            int var13 = (this.field2199 - var5) / var8;
                            if (var13 >= this.field2202) {
                                this.field2199 -= this.field2202 * var8;
                                this.field2202 = 0;
                                break;
                            }
                            this.field2199 -= var8 * var13;
                            this.field2202 -= var13;
                        }
                    }
                }
                if (this.field2193 < 0) {
                    this.method680(arg0, var9, 0, var10, 0);
                    if (this.field2199 < 0) {
                        this.field2199 = 0;
                        this.method714((byte) 59);
                    }
                } else {
                    this.method681(arg0, var9, var7, var10, 0);
                    if (this.field2199 >= var7) {
                        this.field2199 = var7 - 1;
                        this.method714((byte) 51);
                    }
                }
                return 1;
            }
        } else {
            this.method383(arg2);
            return 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([IIIII)I", line = 423)
    private final int method680(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2194 > 0) {
            int var6 = this.field2194 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2194 += arg1;
            if (this.field2193 == -256 && (this.field2199 & 255) == 0) {
                arg1 = method674(((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, this.field2201, this.field2197, 0, var6, arg2, this);
            } else {
                arg1 = method672(0, 0, ((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, this.field2201, this.field2197, 0, var6, arg2, this, this.field2193, arg4);
            }
            this.field2194 -= arg1;
            if (this.field2194 != 0) {
                return arg1;
            }
            if (this.field2200 == Integer.MIN_VALUE) {
                this.method714((byte) -94);
                return arg3;
            }
            this.field2198 = this.field2200;
        }
        return this.field2193 == -256 && (this.field2199 & 255) == 0 ? method682(((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, 0, arg3, arg2, this) : method676(0, 0, ((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, 0, arg3, arg2, this, this.field2193, arg4);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 468)
    public final synchronized void method383(int arg0) {
        if (this.field2194 > 0) {
            if (arg0 >= this.field2194) {
                if (this.field2200 == Integer.MIN_VALUE) {
                    this.method714((byte) -126);
                    arg0 = this.field2194;
                } else {
                    this.field2198 = this.field2200;
                }
                this.field2194 = 0;
            } else {
                this.field2198 += this.field2197 * arg0;
                this.field2194 -= arg0;
            }
        }
        this.field2199 += this.field2193 * arg0;
        class82 var2 = (class82) super.field1097;
        int var3 = this.field2195 << 8;
        int var4 = this.field2192 << 8;
        int var5 = var2.field1946.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2202 = 0;
        }
        if (this.field2202 < 0) {
            if (!this.field2196) {
                if (this.field2193 < 0) {
                    if (this.field2199 < var3) {
                        this.field2199 = var4 - 1 - (var4 - 1 - this.field2199) % var6;
                    }
                } else if (this.field2199 >= var4) {
                    this.field2199 = (this.field2199 - var3) % var6 + var3;
                }
            } else {
                if (this.field2193 < 0) {
                    if (this.field2199 >= var3) {
                        return;
                    }
                    this.field2199 = var3 + var3 - 1 - this.field2199;
                    this.field2193 = -this.field2193;
                }
                while (this.field2199 >= var4) {
                    this.field2199 = var4 + var4 - 1 - this.field2199;
                    this.field2193 = -this.field2193;
                    if (this.field2199 >= var3) {
                        return;
                    }
                    this.field2199 = var3 + var3 - 1 - this.field2199;
                    this.field2193 = -this.field2193;
                }
            }
        } else {
            if (this.field2202 > 0) {
                if (this.field2196) {
                    label113: {
                        if (this.field2193 < 0) {
                            if (this.field2199 >= var3) {
                                return;
                            }
                            this.field2199 = var3 + var3 - 1 - this.field2199;
                            this.field2193 = -this.field2193;
                            if (--this.field2202 == 0) {
                                break label113;
                            }
                        }
                        do {
                            if (this.field2199 < var4) {
                                return;
                            }
                            this.field2199 = var4 + var4 - 1 - this.field2199;
                            this.field2193 = -this.field2193;
                            if (--this.field2202 == 0) {
                                break;
                            }
                            if (this.field2199 >= var3) {
                                return;
                            }
                            this.field2199 = var3 + var3 - 1 - this.field2199;
                            this.field2193 = -this.field2193;
                        } while (--this.field2202 != 0);
                    }
                } else if (this.field2193 < 0) {
                    if (this.field2199 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field2199) / var6;
                    if (var7 < this.field2202) {
                        this.field2199 += var6 * var7;
                        this.field2202 -= var7;
                        return;
                    }
                    this.field2199 += this.field2202 * var6;
                    this.field2202 = 0;
                } else {
                    if (this.field2199 < var4) {
                        return;
                    }
                    int var8 = (this.field2199 - var3) / var6;
                    if (var8 < this.field2202) {
                        this.field2199 -= var6 * var8;
                        this.field2202 -= var8;
                        return;
                    }
                    this.field2199 -= this.field2202 * var6;
                    this.field2202 = 0;
                }
            }
            if (this.field2193 < 0) {
                if (this.field2199 < 0) {
                    this.field2199 = 0;
                    this.method714((byte) 76);
                    return;
                }
            } else if (this.field2199 >= var5) {
                this.field2199 = var5 - 1;
                this.method714((byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "([IIIII)I", line = 659)
    private final int method681(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2194 > 0) {
            int var6 = this.field2194 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field2194 += arg1;
            if (this.field2193 == 256 && (this.field2199 & 255) == 0) {
                arg1 = method677(((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, this.field2201, this.field2197, 0, var6, arg2, this);
            } else {
                arg1 = method683(0, 0, ((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, this.field2201, this.field2197, 0, var6, arg2, this, this.field2193, arg4);
            }
            this.field2194 -= arg1;
            if (this.field2194 != 0) {
                return arg1;
            }
            if (this.field2200 == Integer.MIN_VALUE) {
                this.method714((byte) 83);
                return arg3;
            }
            this.field2198 = this.field2200;
        }
        return this.field2193 == 256 && (this.field2199 & 255) == 0 ? method671(((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, 0, arg3, arg2, this) : method675(0, 0, ((class82) super.field1097).field1946, arg0, this.field2199, arg1, this.field2198, 0, arg3, arg2, this, this.field2193, arg4);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "([B[IIIIIIILpa;)I", line = 702)
    private static final int method682(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class91 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 8;
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
        arg8.field2199 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II[B[IIIIIIIIILpa;II)I", line = 727)
    private static final int method683(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class91 arg12, int arg13, int arg14) {
        int var15;
        if (arg13 == 0 || (var15 = (arg11 - arg4 + arg13 - 257) / arg13 + arg5) > arg10) {
            var15 = arg10;
        }
        int var10001;
        while (arg5 < var15) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            var10001 = arg5++;
            arg3[var10001] += ((var20 << 8) + (arg4 & 255) * (arg2[var19 + 1] - var20)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        int var16;
        if (arg13 == 0 || (var16 = (arg11 - arg4 + arg13 - 1) / arg13 + arg5) > arg10) {
            var16 = arg10;
        }
        int var17 = arg14;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (var17 - var18)) * arg6 >> arg7;
            arg6 += arg8;
            arg4 += arg13;
        }
        arg12.field2198 = arg6;
        arg12.field2199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lnd;II)V", line = 757)
    private class91(class82 arg0, int arg1, int arg2) {
        super.field1097 = arg0;
        this.field2195 = arg0.field1948;
        this.field2192 = arg0.field1947;
        this.field2193 = arg1;
        this.field2198 = arg2;
        this.field2199 = 0;
    }
}
