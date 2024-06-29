import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class294 extends class207 {

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    private int field5050;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    private int field5060;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Z")
    private boolean field5056;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    private int field5052;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    private int field5062;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    private int field5064;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    private int field5051;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    private int field5053;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    private int field5054;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    private int field5057;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    private int field5061;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    private int field5063;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "()I", line = 3)
    public final synchronized int method2020() {
        return this.field5055 == Integer.MIN_VALUE ? 0 : this.field5055;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()I", line = 7)
    public final int method1441() {
        int var1 = this.field5054 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field5053 == 0) {
            var2 -= this.field5064 * var2 / (((class286) this.field3521).field4900.length << 8);
        } else if (this.field5053 >= 0) {
            var2 -= this.field5050 * var2 / ((class286) this.field3521).field4900.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([B[IIIIIIIILug;)I", line = 19)
    private static final int method2021(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class294 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field5061 += (var14 - arg3) * arg9.field5057;
        arg9.field5051 += (var14 - arg3) * arg9.field5059;
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
        arg9.field5054 = var12 >> 2;
        arg9.field5064 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lbe;II)Lug;", line = 55)
    public static final class294 method2022(class286 arg0, int arg1, int arg2) {
        return arg0.field4900 == null || arg0.field4900.length == 0 ? null : new class294(arg0, (int) ((long) arg0.field4901 * 256L * (long) arg1 / (long) (class63.field1213 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 61)
    public final synchronized void method2023(int arg0) {
        this.field5053 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V", line = 65)
    public final synchronized void method2024(int arg0) {
        if (arg0 == 0) {
            this.method2050(0);
            this.method232(128);
        } else if (this.field5061 == 0 && this.field5051 == 0) {
            this.field5063 = 0;
            this.field5055 = 0;
            this.field5054 = 0;
            this.method232(128);
        } else {
            int var2 = -this.field5054;
            if (this.field5054 > var2) {
                var2 = this.field5054;
            }
            if (-this.field5061 > var2) {
                var2 = -this.field5061;
            }
            if (this.field5061 > var2) {
                var2 = this.field5061;
            }
            if (-this.field5051 > var2) {
                var2 = -this.field5051;
            }
            if (this.field5051 > var2) {
                var2 = this.field5051;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field5063 = arg0;
            this.field5055 = Integer.MIN_VALUE;
            this.field5058 = -this.field5054 / arg0;
            this.field5057 = -this.field5061 / arg0;
            this.field5059 = -this.field5051 / arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[B[IIIIIIIILug;II)I", line = 111)
    private static final int method2025(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
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
        arg11.field5064 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIII)I", line = 144)
    private final int method2026(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5063 > 0) {
                int var6 = this.field5063 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5063 += arg1;
                if (this.field5052 == 256 && (this.field5064 & 0xFF) == 0) {
                    if (class188.field3233) {
                        arg1 = method2046(0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, this.field5057, this.field5059, 0, var6, arg2, this);
                    } else {
                        arg1 = method2021(((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, this.field5058, 0, var6, arg2, this);
                    }
                } else if (class188.field3233) {
                    arg1 = method2029(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, this.field5057, this.field5059, 0, var6, arg2, this, this.field5052, arg4);
                } else {
                    arg1 = method2044(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, this.field5058, 0, var6, arg2, this, this.field5052, arg4);
                }
                this.field5063 -= arg1;
                if (this.field5063 != 0) {
                    return arg1;
                }
                if (!this.method2031()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5052 == 256 && (this.field5064 & 0xFF) == 0) {
                if (class188.field3233) {
                    return method2055(0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, 0, arg3, arg2, this);
                }
                return method2053(((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, 0, arg3, arg2, this);
            }
            if (class188.field3233) {
                return method2025(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, 0, arg3, arg2, this, this.field5052, arg4);
            }
            return method2049(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, 0, arg3, arg2, this, this.field5052, arg4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[B[IIIIIIILug;II)I", line = 199)
    private static final int method2027(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10, int arg11, int arg12) {
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
        arg10.field5064 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "([B[IIIIIIIILug;)I", line = 226)
    private static final int method2028(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class294 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field5061 += (var14 - arg3) * arg9.field5057;
        arg9.field5051 += (var14 - arg3) * arg9.field5059;
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
        arg9.field5054 = var12 >> 2;
        arg9.field5064 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[B[IIIIIIIIIILug;II)I", line = 262)
    private static final int method2029(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class294 arg13, int arg14, int arg15) {
        arg13.field5054 -= arg13.field5058 * arg5;
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
        arg13.field5054 += arg13.field5058 * var27;
        arg13.field5061 = arg6;
        arg13.field5051 = arg7;
        arg13.field5064 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V", line = 304)
    public final synchronized void method2030(int arg0) {
        this.method2040(arg0 << 6, this.method2039());
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "()Z", line = 308)
    private final boolean method2031() {
        int var1 = this.field5055;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2043(var1, this.field5062);
            var2 = method2035(var1, this.field5062);
        }
        if (this.field5054 != var1 || this.field5061 != var3 || this.field5051 != var2) {
            if (this.field5054 < var1) {
                this.field5058 = 1;
                this.field5063 = var1 - this.field5054;
            } else if (this.field5054 > var1) {
                this.field5058 = -1;
                this.field5063 = this.field5054 - var1;
            } else {
                this.field5058 = 0;
            }
            if (this.field5061 < var3) {
                this.field5057 = 1;
                if (this.field5063 == 0 || this.field5063 > var3 - this.field5061) {
                    this.field5063 = var3 - this.field5061;
                }
            } else if (this.field5061 > var3) {
                this.field5057 = -1;
                if (this.field5063 == 0 || this.field5063 > this.field5061 - var3) {
                    this.field5063 = this.field5061 - var3;
                }
            } else {
                this.field5057 = 0;
            }
            if (this.field5051 < var2) {
                this.field5059 = 1;
                if (this.field5063 == 0 || this.field5063 > var2 - this.field5051) {
                    this.field5063 = var2 - this.field5051;
                }
            } else if (this.field5051 > var2) {
                this.field5059 = -1;
                if (this.field5063 == 0 || this.field5063 > this.field5051 - var2) {
                    this.field5063 = this.field5051 - var2;
                }
            } else {
                this.field5059 = 0;
            }
            return false;
        } else if (this.field5055 == Integer.MIN_VALUE) {
            this.field5055 = 0;
            this.field5054 = this.field5061 = this.field5051 = 0;
            this.method232(128);
            return true;
        } else {
            this.method2033();
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([B[IIIIIIILug;)I", line = 395)
    private static final int method2032(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8) {
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
        arg8.field5064 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "()V", line = 420)
    private final void method2033() {
        this.field5054 = this.field5055;
        this.field5061 = method2043(this.field5055, this.field5062);
        this.field5051 = method2035(this.field5055, this.field5062);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "([IIIII)I", line = 425)
    private final int method2034(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field5063 > 0) {
                int var6 = this.field5063 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field5063 += arg1;
                if (this.field5052 == -256 && (this.field5064 & 0xFF) == 0) {
                    if (class188.field3233) {
                        arg1 = method2056(0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, this.field5057, this.field5059, 0, var6, arg2, this);
                    } else {
                        arg1 = method2028(((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, this.field5058, 0, var6, arg2, this);
                    }
                } else if (class188.field3233) {
                    arg1 = method2036(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, this.field5057, this.field5059, 0, var6, arg2, this, this.field5052, arg4);
                } else {
                    arg1 = method2047(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, this.field5058, 0, var6, arg2, this, this.field5052, arg4);
                }
                this.field5063 -= arg1;
                if (this.field5063 != 0) {
                    return arg1;
                }
                if (!this.method2031()) {
                    continue;
                }
                return arg3;
            }
            if (this.field5052 == -256 && (this.field5064 & 0xFF) == 0) {
                if (class188.field3233) {
                    return method2058(0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, 0, arg3, arg2, this);
                }
                return method2032(((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, 0, arg3, arg2, this);
            }
            if (class188.field3233) {
                return method2051(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5061, this.field5051, 0, arg3, arg2, this, this.field5052, arg4);
            }
            return method2027(0, 0, ((class286) this.field3521).field4900, arg0, this.field5064, arg1, this.field5054, 0, arg3, arg2, this, this.field5052, arg4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I", line = 480)
    private static final int method2035(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II[B[IIIIIIIIIILug;II)I", line = 483)
    private static final int method2036(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class294 arg13, int arg14, int arg15) {
        arg13.field5054 -= arg13.field5058 * arg5;
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
        arg13.field5054 += arg13.field5058 * var26;
        arg13.field5061 = arg6;
        arg13.field5051 = arg7;
        arg13.field5064 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V", line = 525)
    public final synchronized void method2037(int arg0) {
        if (this.field5052 < 0) {
            this.field5052 = -arg0;
        } else {
            this.field5052 = arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "()Z", line = 532)
    public final boolean method2038() {
        return this.field5064 < 0 || this.field5064 >= ((class286) this.field3521).field4900.length << 8;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()Lwj;", line = 535)
    public final class207 method477() {
        return null;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "()I", line = 539)
    public final synchronized int method2039() {
        return this.field5062 < 0 ? -1 : this.field5062;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V", line = 542)
    private final synchronized void method2040(int arg0, int arg1) {
        this.field5055 = arg0;
        this.field5062 = arg1;
        this.field5063 = 0;
        this.method2033();
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "()Z", line = 550)
    public final boolean method2041() {
        return this.field5063 != 0;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "([III)V", line = 553)
    public final synchronized void method479(int[] arg0, int arg1, int arg2) {
        if (this.field5055 == 0 && this.field5063 == 0) {
            this.method478(arg2);
            return;
        }
        class286 var4 = (class286) this.field3521;
        int var5 = this.field5050 << 8;
        int var6 = this.field5060 << 8;
        int var7 = var4.field4900.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field5053 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field5064 < 0) {
            if (this.field5052 <= 0) {
                this.method2052();
                this.method232(128);
                return;
            }
            this.field5064 = 0;
        }
        if (this.field5064 >= var7) {
            if (this.field5052 >= 0) {
                this.method2052();
                this.method232(128);
                return;
            }
            this.field5064 = var7 - 1;
        }
        if (this.field5053 >= 0) {
            if (this.field5053 > 0) {
                if (this.field5056) {
                    label131: {
                        if (this.field5052 < 0) {
                            var9 = this.method2034(arg0, arg1, var5, var10, var4.field4900[this.field5050]);
                            if (this.field5064 >= var5) {
                                return;
                            }
                            this.field5064 = var5 + var5 - this.field5064 - 1;
                            this.field5052 = -this.field5052;
                            if (--this.field5053 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2026(arg0, var9, var6, var10, var4.field4900[this.field5060 - 1]);
                            if (this.field5064 < var6) {
                                return;
                            }
                            this.field5064 = var6 + var6 - this.field5064 - 1;
                            this.field5052 = -this.field5052;
                            if (--this.field5053 == 0) {
                                break;
                            }
                            var9 = this.method2034(arg0, var9, var5, var10, var4.field4900[this.field5050]);
                            if (this.field5064 >= var5) {
                                return;
                            }
                            this.field5064 = var5 + var5 - this.field5064 - 1;
                            this.field5052 = -this.field5052;
                        } while (--this.field5053 != 0);
                    }
                } else if (this.field5052 < 0) {
                    while (true) {
                        var9 = this.method2034(arg0, var9, var5, var10, var4.field4900[this.field5060 - 1]);
                        if (this.field5064 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field5064 - 1) / var8;
                        if (var12 >= this.field5053) {
                            this.field5064 += this.field5053 * var8;
                            this.field5053 = 0;
                            break;
                        }
                        this.field5064 += var8 * var12;
                        this.field5053 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2026(arg0, var9, var6, var10, var4.field4900[this.field5050]);
                        if (this.field5064 < var6) {
                            return;
                        }
                        int var13 = (this.field5064 - var5) / var8;
                        if (var13 >= this.field5053) {
                            this.field5064 -= this.field5053 * var8;
                            this.field5053 = 0;
                            break;
                        }
                        this.field5064 -= var8 * var13;
                        this.field5053 -= var13;
                    }
                }
            }
            if (this.field5052 < 0) {
                this.method2034(arg0, var9, 0, var10, 0);
                if (this.field5064 < 0) {
                    this.field5064 = -1;
                    this.method2052();
                    this.method232(128);
                }
            } else {
                this.method2026(arg0, var9, var7, var10, 0);
                if (this.field5064 >= var7) {
                    this.field5064 = var7;
                    this.method2052();
                    this.method232(128);
                }
            }
        } else if (this.field5056) {
            if (this.field5052 < 0) {
                var9 = this.method2034(arg0, arg1, var5, var10, var4.field4900[this.field5050]);
                if (this.field5064 >= var5) {
                    return;
                }
                this.field5064 = var5 + var5 - this.field5064 - 1;
                this.field5052 = -this.field5052;
            }
            while (true) {
                int var11 = this.method2026(arg0, var9, var6, var10, var4.field4900[this.field5060 - 1]);
                if (this.field5064 < var6) {
                    return;
                }
                this.field5064 = var6 + var6 - this.field5064 - 1;
                this.field5052 = -this.field5052;
                var9 = this.method2034(arg0, var11, var5, var10, var4.field4900[this.field5050]);
                if (this.field5064 >= var5) {
                    return;
                }
                this.field5064 = var5 + var5 - this.field5064 - 1;
                this.field5052 = -this.field5052;
            }
        } else if (this.field5052 < 0) {
            while (true) {
                var9 = this.method2034(arg0, var9, var5, var10, var4.field4900[this.field5060 - 1]);
                if (this.field5064 >= var5) {
                    return;
                }
                this.field5064 = var6 - (var6 - 1 - this.field5064) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method2026(arg0, var9, var6, var10, var4.field4900[this.field5050]);
                if (this.field5064 < var6) {
                    return;
                }
                this.field5064 = (this.field5064 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 789)
    public final synchronized void method2042(boolean arg0) {
        this.field5052 = (this.field5052 >>> 31) + (this.field5052 ^ this.field5052 >> 31);
        if (arg0) {
            this.field5052 = -this.field5052;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)I", line = 795)
    private static final int method2043(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II[B[IIIIIIIILug;II)I", line = 798)
    private static final int method2044(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
        arg11.field5061 -= arg11.field5057 * arg5;
        arg11.field5051 -= arg11.field5059 * arg5;
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
        arg11.field5061 += arg11.field5057 * arg5;
        arg11.field5051 += arg11.field5059 * arg5;
        arg11.field5054 = arg6;
        arg11.field5064 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lbe;III)Lug;", line = 831)
    public static final class294 method2045(class286 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4900 == null || arg0.field4900.length == 0 ? null : new class294(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B[IIIIIIIIIILug;)I", line = 838)
    private static final int method2046(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class294 arg12) {
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
        arg12.field5054 += (var19 - arg4) * arg12.field5058;
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
        arg12.field5061 = var15 >> 2;
        arg12.field5051 = var16 >> 2;
        arg12.field5064 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II[B[IIIIIIIILug;II)I", line = 892)
    private static final int method2047(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
        arg11.field5061 -= arg11.field5057 * arg5;
        arg11.field5051 -= arg11.field5059 * arg5;
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
        arg11.field5061 += arg11.field5057 * arg5;
        arg11.field5051 += arg11.field5059 * arg5;
        arg11.field5054 = arg6;
        arg11.field5064 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "()I", line = 926)
    public final synchronized int method2048() {
        return this.field5052 < 0 ? -this.field5052 : this.field5052;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II[B[IIIIIIILug;II)I", line = 933)
    private static final int method2049(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10, int arg11, int arg12) {
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
        arg10.field5064 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V", line = 959)
    private final synchronized void method2050(int arg0) {
        this.method2040(arg0, this.method2039());
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II[B[IIIIIIIILug;II)I", line = 969)
    private static final int method2051(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class294 arg11, int arg12, int arg13) {
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
        arg11.field5064 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()I", line = 1001)
    public final int method482() {
        return this.field5055 == 0 && this.field5063 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 1007)
    public final synchronized void method478(int arg0) {
        if (this.field5063 > 0) {
            if (arg0 >= this.field5063) {
                if (this.field5055 == Integer.MIN_VALUE) {
                    this.field5055 = 0;
                    this.field5054 = this.field5061 = this.field5051 = 0;
                    this.method232(128);
                    arg0 = this.field5063;
                }
                this.field5063 = 0;
                this.method2033();
            } else {
                this.field5054 += this.field5058 * arg0;
                this.field5061 += this.field5057 * arg0;
                this.field5051 += this.field5059 * arg0;
                this.field5063 -= arg0;
            }
        }
        class286 var2 = (class286) this.field3521;
        int var3 = this.field5050 << 8;
        int var4 = this.field5060 << 8;
        int var5 = var2.field4900.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field5053 = 0;
        }
        if (this.field5064 < 0) {
            if (this.field5052 <= 0) {
                this.method2052();
                this.method232(128);
                return;
            }
            this.field5064 = 0;
        }
        if (this.field5064 >= var5) {
            if (this.field5052 >= 0) {
                this.method2052();
                this.method232(128);
                return;
            }
            this.field5064 = var5 - 1;
        }
        this.field5064 += this.field5052 * arg0;
        if (this.field5053 >= 0) {
            if (this.field5053 > 0) {
                if (this.field5056) {
                    label121: {
                        if (this.field5052 < 0) {
                            if (this.field5064 >= var3) {
                                return;
                            }
                            this.field5064 = var3 + var3 - this.field5064 - 1;
                            this.field5052 = -this.field5052;
                            if (--this.field5053 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field5064 < var4) {
                                return;
                            }
                            this.field5064 = var4 + var4 - this.field5064 - 1;
                            this.field5052 = -this.field5052;
                            if (--this.field5053 == 0) {
                                break;
                            }
                            if (this.field5064 >= var3) {
                                return;
                            }
                            this.field5064 = var3 + var3 - this.field5064 - 1;
                            this.field5052 = -this.field5052;
                        } while (--this.field5053 != 0);
                    }
                } else {
                    label153: {
                        if (this.field5052 < 0) {
                            if (this.field5064 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field5064 - 1) / var6;
                            if (var7 >= this.field5053) {
                                this.field5064 += this.field5053 * var6;
                                this.field5053 = 0;
                                break label153;
                            }
                            this.field5064 += var6 * var7;
                            this.field5053 -= var7;
                        } else if (this.field5064 >= var4) {
                            int var8 = (this.field5064 - var3) / var6;
                            if (var8 >= this.field5053) {
                                this.field5064 -= this.field5053 * var6;
                                this.field5053 = 0;
                                break label153;
                            }
                            this.field5064 -= var6 * var8;
                            this.field5053 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field5052 < 0) {
                if (this.field5064 < 0) {
                    this.field5064 = -1;
                    this.method2052();
                    this.method232(128);
                }
            } else if (this.field5064 >= var5) {
                this.field5064 = var5;
                this.method2052();
                this.method232(128);
            }
        } else if (this.field5056) {
            if (this.field5052 < 0) {
                if (this.field5064 >= var3) {
                    return;
                }
                this.field5064 = var3 + var3 - this.field5064 - 1;
                this.field5052 = -this.field5052;
            }
            while (this.field5064 >= var4) {
                this.field5064 = var4 + var4 - this.field5064 - 1;
                this.field5052 = -this.field5052;
                if (this.field5064 >= var3) {
                    return;
                }
                this.field5064 = var3 + var3 - this.field5064 - 1;
                this.field5052 = -this.field5052;
            }
        } else if (this.field5052 < 0) {
            if (this.field5064 >= var3) {
                return;
            }
            this.field5064 = var4 - (var4 - 1 - this.field5064) % var6 - 1;
        } else if (this.field5064 >= var4) {
            this.field5064 = (this.field5064 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "()V", line = 1226)
    private final void method2052() {
        if (this.field5063 == 0) {
            return;
        }
        if (this.field5055 == Integer.MIN_VALUE) {
            this.field5055 = 0;
        }
        this.field5063 = 0;
        this.method2033();
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "([B[IIIIIIILug;)I", line = 1237)
    private static final int method2053(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8) {
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
        arg8.field5064 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "(I)V", line = 1265)
    public final synchronized void method2054(int arg0) {
        int var2 = ((class286) this.field3521).field4900.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field5064 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B[IIIIIIIILug;)I", line = 1277)
    private static final int method2055(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
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
        arg10.field5064 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "()Lwj;", line = 1315)
    public final class207 method480() {
        return null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I[B[IIIIIIIIIILug;)I", line = 1318)
    private static final int method2056(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class294 arg12) {
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
        arg12.field5054 += (var19 - arg4) * arg12.field5058;
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
        arg12.field5061 = var15 >> 2;
        arg12.field5051 = var16 >> 2;
        arg12.field5064 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)V", line = 1371)
    public final synchronized void method2057(int arg0, int arg1) {
        this.method2059(arg0, arg1, this.method2039());
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I[B[IIIIIIIILug;)I", line = 1374)
    private static final int method2058(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
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
        arg10.field5064 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lbe;II)V", line = 1412)
    private class294(class286 arg0, int arg1, int arg2) {
        this.field3521 = arg0;
        this.field5050 = arg0.field4899;
        this.field5060 = arg0.field4902;
        this.field5056 = arg0.field4903;
        this.field5052 = arg1;
        this.field5055 = arg2;
        this.field5062 = 8192;
        this.field5064 = 0;
        this.method2033();
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lbe;III)V", line = 1423)
    private class294(class286 arg0, int arg1, int arg2, int arg3) {
        this.field3521 = arg0;
        this.field5050 = arg0.field4899;
        this.field5060 = arg0.field4902;
        this.field5056 = arg0.field4903;
        this.field5052 = arg1;
        this.field5055 = arg2;
        this.field5062 = arg3;
        this.field5064 = 0;
        this.method2033();
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V", line = 1435)
    public final synchronized void method2059(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2040(arg1, arg2);
            return;
        }
        int var4 = method2043(arg1, arg2);
        int var5 = method2035(arg1, arg2);
        if (this.field5061 == var4 && this.field5051 == var5) {
            this.field5063 = 0;
            return;
        }
        int var6 = arg1 - this.field5054;
        if (this.field5054 - arg1 > var6) {
            var6 = this.field5054 - arg1;
        }
        if (var4 - this.field5061 > var6) {
            var6 = var4 - this.field5061;
        }
        if (this.field5061 - var4 > var6) {
            var6 = this.field5061 - var4;
        }
        if (var5 - this.field5051 > var6) {
            var6 = var5 - this.field5051;
        }
        if (this.field5051 - var5 > var6) {
            var6 = this.field5051 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field5063 = arg0;
        this.field5055 = arg1;
        this.field5062 = arg2;
        this.field5058 = (arg1 - this.field5054) / arg0;
        this.field5057 = (var4 - this.field5061) / arg0;
        this.field5059 = (var5 - this.field5051) / arg0;
    }
}
