import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class290 extends class102 {

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Z")
    private boolean field4198;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    private int field4193;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    private int field4199;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    private int field4194;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lok;II)Lhg;")
    public static final class290 method1825(class61 arg0, int arg1, int arg2) {
        return arg0.field875 != null && arg0.field875.length != 0 ? new class290(arg0, (int) ((long) arg0.field877 * 256L * (long) arg1 / (long) (class29.field505 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([B[IIIIIIILhg;)I")
    private static final int method1826(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class290 arg8) {
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
        arg8.field4199 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()I")
    public final int method164() {
        return this.field4197 == 0 && this.field4194 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()V")
    private final void method1827() {
        this.field4200 = this.field4197;
        this.field4191 = method1837(this.field4197, this.field4188);
        this.field4189 = method1835(this.field4197, this.field4188);
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "()Z")
    public final boolean method1828() {
        return this.field4194 != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIIIIILhg;II)I")
    private static final int method1829(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class290 arg13, int arg14, int arg15) {
        arg13.field4200 -= arg13.field4187 * arg5;
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
        arg13.field4200 += arg13.field4187 * var22;
        arg13.field4191 = arg6;
        arg13.field4189 = arg7;
        arg13.field4199 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method1830(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class290 arg11, int arg12, int arg13) {
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
        arg11.field4199 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([IIIII)I")
    private final int method1831(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4194 <= 0) {
                if (this.field4193 == -256 && (this.field4199 & 255) == 0) {
                    if (class215.field3079) {
                        return method1862(0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, 0, arg3, arg2, this);
                    }
                    return method1826(((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, 0, arg3, arg2, this);
                }
                if (class215.field3079) {
                    return method1839(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, 0, arg3, arg2, this, this.field4193, arg4);
                }
                return method1855(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, 0, arg3, arg2, this, this.field4193, arg4);
            }
            int var6 = this.field4194 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4194 += arg1;
            if (this.field4193 == -256 && (this.field4199 & 255) == 0) {
                if (class215.field3079) {
                    arg1 = method1864(0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, this.field4196, this.field4190, 0, var6, arg2, this);
                } else {
                    arg1 = method1836(((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, this.field4187, 0, var6, arg2, this);
                }
            } else if (class215.field3079) {
                arg1 = method1829(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, this.field4196, this.field4190, 0, var6, arg2, this, this.field4193, arg4);
            } else {
                arg1 = method1852(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, this.field4187, 0, var6, arg2, this, this.field4193, arg4);
            }
            this.field4194 -= arg1;
            if (this.field4194 != 0) {
                return arg1;
            }
        } while (!this.method1854());
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
    public final synchronized void method1832(boolean arg0) {
        this.field4193 = (this.field4193 >>> 31) + (this.field4193 ^ this.field4193 >> 31);
        if (arg0) {
            this.field4193 = -this.field4193;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()I")
    public final int method691() {
        int var1 = this.field4200 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field4195 == 0) {
            var2 -= this.field4199 * var2 / (((class61) super.field1372).field875.length << 8);
        } else if (this.field4195 >= 0) {
            var2 -= this.field4192 * var2 / ((class61) super.field1372).field875.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    private final synchronized void method1833(int arg0) {
        this.method1851(arg0, this.method1834());
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()I")
    public final synchronized int method1834() {
        return this.field4188 < 0 ? -1 : this.field4188;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I")
    private static final int method1835(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()Laf;")
    public final class102 method167() {
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([B[IIIIIIIILhg;)I")
    private static final int method1836(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class290 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field4191 += (var14 - arg3) * arg9.field4196;
        arg9.field4189 += (var14 - arg3) * arg9.field4190;
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
        arg9.field4200 = var12 >> 2;
        arg9.field4199 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([III)V")
    public final synchronized void method170(int[] arg0, int arg1, int arg2) {
        if (this.field4197 == 0 && this.field4194 == 0) {
            this.method172(arg2);
        } else {
            class61 var4 = (class61) super.field1372;
            int var5 = this.field4192 << 8;
            int var6 = this.field4201 << 8;
            int var7 = var4.field875.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field4195 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field4199 < 0) {
                if (this.field4193 <= 0) {
                    this.method1845();
                    this.method2574((byte) 120);
                    return;
                }
                this.field4199 = 0;
            }
            if (this.field4199 >= var7) {
                if (this.field4193 >= 0) {
                    this.method1845();
                    this.method2574((byte) 117);
                    return;
                }
                this.field4199 = var7 - 1;
            }
            if (this.field4195 < 0) {
                if (this.field4198) {
                    if (this.field4193 < 0) {
                        var9 = this.method1831(arg0, arg1, var5, var10, var4.field875[this.field4192]);
                        if (this.field4199 >= var5) {
                            return;
                        }
                        this.field4199 = var5 + var5 - 1 - this.field4199;
                        this.field4193 = -this.field4193;
                    }
                    while (true) {
                        int var11 = this.method1860(arg0, var9, var6, var10, var4.field875[this.field4201 - 1]);
                        if (this.field4199 < var6) {
                            return;
                        }
                        this.field4199 = var6 + var6 - 1 - this.field4199;
                        this.field4193 = -this.field4193;
                        var9 = this.method1831(arg0, var11, var5, var10, var4.field875[this.field4192]);
                        if (this.field4199 >= var5) {
                            return;
                        }
                        this.field4199 = var5 + var5 - 1 - this.field4199;
                        this.field4193 = -this.field4193;
                    }
                } else if (this.field4193 < 0) {
                    while (true) {
                        var9 = this.method1831(arg0, var9, var5, var10, var4.field875[this.field4201 - 1]);
                        if (this.field4199 >= var5) {
                            return;
                        }
                        this.field4199 = var6 - 1 - (var6 - 1 - this.field4199) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1860(arg0, var9, var6, var10, var4.field875[this.field4192]);
                        if (this.field4199 < var6) {
                            return;
                        }
                        this.field4199 = (this.field4199 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field4195 > 0) {
                    if (this.field4198) {
                        label130: {
                            if (this.field4193 < 0) {
                                var9 = this.method1831(arg0, arg1, var5, var10, var4.field875[this.field4192]);
                                if (this.field4199 >= var5) {
                                    return;
                                }
                                this.field4199 = var5 + var5 - 1 - this.field4199;
                                this.field4193 = -this.field4193;
                                if (--this.field4195 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1860(arg0, var9, var6, var10, var4.field875[this.field4201 - 1]);
                                if (this.field4199 < var6) {
                                    return;
                                }
                                this.field4199 = var6 + var6 - 1 - this.field4199;
                                this.field4193 = -this.field4193;
                                if (--this.field4195 == 0) {
                                    break;
                                }
                                var9 = this.method1831(arg0, var9, var5, var10, var4.field875[this.field4192]);
                                if (this.field4199 >= var5) {
                                    return;
                                }
                                this.field4199 = var5 + var5 - 1 - this.field4199;
                                this.field4193 = -this.field4193;
                            } while (--this.field4195 != 0);
                        }
                    } else if (this.field4193 < 0) {
                        while (true) {
                            var9 = this.method1831(arg0, var9, var5, var10, var4.field875[this.field4201 - 1]);
                            if (this.field4199 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field4199) / var8;
                            if (var12 >= this.field4195) {
                                this.field4199 += this.field4195 * var8;
                                this.field4195 = 0;
                                break;
                            }
                            this.field4199 += var8 * var12;
                            this.field4195 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1860(arg0, var9, var6, var10, var4.field875[this.field4192]);
                            if (this.field4199 < var6) {
                                return;
                            }
                            int var13 = (this.field4199 - var5) / var8;
                            if (var13 >= this.field4195) {
                                this.field4199 -= this.field4195 * var8;
                                this.field4195 = 0;
                                break;
                            }
                            this.field4199 -= var8 * var13;
                            this.field4195 -= var13;
                        }
                    }
                }
                if (this.field4193 < 0) {
                    this.method1831(arg0, var9, 0, var10, 0);
                    if (this.field4199 < 0) {
                        this.field4199 = -1;
                        this.method1845();
                        this.method2574((byte) 119);
                        return;
                    }
                } else {
                    this.method1860(arg0, var9, var7, var10, 0);
                    if (this.field4199 >= var7) {
                        this.field4199 = var7;
                        this.method1845();
                        this.method2574((byte) 123);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)I")
    private static final int method1837(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "()I")
    public final synchronized int method1838() {
        return this.field4193 < 0 ? -this.field4193 : this.field4193;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method1839(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class290 arg11, int arg12, int arg13) {
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
        arg11.field4199 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "()Z")
    public final boolean method1840() {
        return this.field4199 < 0 || this.field4199 >= ((class61) super.field1372).field875.length << 8;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method1841(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class290 arg11, int arg12, int arg13) {
        arg11.field4191 -= arg11.field4196 * arg5;
        arg11.field4189 -= arg11.field4190 * arg5;
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
        arg11.field4191 += arg11.field4196 * arg5;
        arg11.field4189 += arg11.field4190 * arg5;
        arg11.field4200 = arg6;
        arg11.field4199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public final synchronized void method1842(int arg0) {
        this.method1851(arg0 << 6, this.method1834());
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public final synchronized void method1843(int arg0) {
        if (this.field4193 < 0) {
            this.field4193 = -arg0;
        } else {
            this.field4193 = arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)V")
    public final synchronized void method1844(int arg0, int arg1) {
        this.method1850(arg0, arg1, this.method1834());
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "()V")
    private final void method1845() {
        if (this.field4194 != 0) {
            if (this.field4197 == Integer.MIN_VALUE) {
                this.field4197 = 0;
            }
            this.field4194 = 0;
            this.method1827();
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II[B[IIIIIIILhg;II)I")
    private static final int method1846(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class290 arg10, int arg11, int arg12) {
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
        arg10.field4199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lok;III)Lhg;")
    public static final class290 method1847(class61 arg0, int arg1, int arg2, int arg3) {
        return arg0.field875 != null && arg0.field875.length != 0 ? new class290(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
    public final synchronized void method1848(int arg0) {
        int var2 = ((class61) super.field1372).field875.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field4199 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B[IIIIIIIIIILhg;)I")
    private static final int method1849(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class290 arg12) {
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
        arg12.field4200 += (var19 - arg4) * arg12.field4187;
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
        arg12.field4191 = var15 >> 2;
        arg12.field4189 = var16 >> 2;
        arg12.field4199 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public final synchronized void method1850(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1851(arg1, arg2);
        } else {
            int var4 = method1837(arg1, arg2);
            int var5 = method1835(arg1, arg2);
            if (this.field4191 == var4 && this.field4189 == var5) {
                this.field4194 = 0;
            } else {
                int var6 = arg1 - this.field4200;
                if (this.field4200 - arg1 > var6) {
                    var6 = this.field4200 - arg1;
                }
                if (var4 - this.field4191 > var6) {
                    var6 = var4 - this.field4191;
                }
                if (this.field4191 - var4 > var6) {
                    var6 = this.field4191 - var4;
                }
                if (var5 - this.field4189 > var6) {
                    var6 = var5 - this.field4189;
                }
                if (this.field4189 - var5 > var6) {
                    var6 = this.field4189 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field4194 = arg0;
                this.field4197 = arg1;
                this.field4188 = arg2;
                this.field4187 = (arg1 - this.field4200) / arg0;
                this.field4196 = (var4 - this.field4191) / arg0;
                this.field4190 = (var5 - this.field4189) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(II)V")
    private final synchronized void method1851(int arg0, int arg1) {
        this.field4197 = arg0;
        this.field4188 = arg1;
        this.field4194 = 0;
        this.method1827();
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II[B[IIIIIIIILhg;II)I")
    private static final int method1852(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class290 arg11, int arg12, int arg13) {
        arg11.field4191 -= arg11.field4196 * arg5;
        arg11.field4189 -= arg11.field4190 * arg5;
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
        arg11.field4191 += arg11.field4196 * arg5;
        arg11.field4189 += arg11.field4190 * arg5;
        arg11.field4200 = arg6;
        arg11.field4199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()Laf;")
    public final class102 method165() {
        return null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[B[IIIIIIIILhg;)I")
    private static final int method1853(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class290 arg10) {
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
        arg10.field4199 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "()Z")
    private final boolean method1854() {
        int var1 = this.field4197;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1837(var1, this.field4188);
            var2 = method1835(var1, this.field4188);
        }
        if (this.field4200 == var1 && this.field4191 == var3 && this.field4189 == var2) {
            if (this.field4197 == Integer.MIN_VALUE) {
                this.field4197 = 0;
                this.field4200 = this.field4191 = this.field4189 = 0;
                this.method2574((byte) 115);
                return true;
            } else {
                this.method1827();
                return false;
            }
        } else {
            if (this.field4200 < var1) {
                this.field4187 = 1;
                this.field4194 = var1 - this.field4200;
            } else if (this.field4200 > var1) {
                this.field4187 = -1;
                this.field4194 = this.field4200 - var1;
            } else {
                this.field4187 = 0;
            }
            if (this.field4191 < var3) {
                this.field4196 = 1;
                if (this.field4194 == 0 || this.field4194 > var3 - this.field4191) {
                    this.field4194 = var3 - this.field4191;
                }
            } else if (this.field4191 > var3) {
                this.field4196 = -1;
                if (this.field4194 == 0 || this.field4194 > this.field4191 - var3) {
                    this.field4194 = this.field4191 - var3;
                }
            } else {
                this.field4196 = 0;
            }
            if (this.field4189 < var2) {
                this.field4190 = 1;
                if (this.field4194 == 0 || this.field4194 > var2 - this.field4189) {
                    this.field4194 = var2 - this.field4189;
                }
            } else if (this.field4189 > var2) {
                this.field4190 = -1;
                if (this.field4194 == 0 || this.field4194 > this.field4189 - var2) {
                    this.field4194 = this.field4189 - var2;
                }
            } else {
                this.field4190 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final synchronized void method172(int arg0) {
        if (this.field4194 > 0) {
            if (arg0 >= this.field4194) {
                if (this.field4197 == Integer.MIN_VALUE) {
                    this.field4197 = 0;
                    this.field4200 = this.field4191 = this.field4189 = 0;
                    this.method2574((byte) 126);
                    arg0 = this.field4194;
                }
                this.field4194 = 0;
                this.method1827();
            } else {
                this.field4200 += this.field4187 * arg0;
                this.field4191 += this.field4196 * arg0;
                this.field4189 += this.field4190 * arg0;
                this.field4194 -= arg0;
            }
        }
        class61 var2 = (class61) super.field1372;
        int var3 = this.field4192 << 8;
        int var4 = this.field4201 << 8;
        int var5 = var2.field875.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field4195 = 0;
        }
        if (this.field4199 < 0) {
            if (this.field4193 <= 0) {
                this.method1845();
                this.method2574((byte) 117);
                return;
            }
            this.field4199 = 0;
        }
        if (this.field4199 >= var5) {
            if (this.field4193 >= 0) {
                this.method1845();
                this.method2574((byte) 125);
                return;
            }
            this.field4199 = var5 - 1;
        }
        this.field4199 += this.field4193 * arg0;
        if (this.field4195 < 0) {
            if (!this.field4198) {
                if (this.field4193 < 0) {
                    if (this.field4199 < var3) {
                        this.field4199 = var4 - 1 - (var4 - 1 - this.field4199) % var6;
                    }
                } else if (this.field4199 >= var4) {
                    this.field4199 = (this.field4199 - var3) % var6 + var3;
                }
            } else {
                if (this.field4193 < 0) {
                    if (this.field4199 >= var3) {
                        return;
                    }
                    this.field4199 = var3 + var3 - 1 - this.field4199;
                    this.field4193 = -this.field4193;
                }
                while (this.field4199 >= var4) {
                    this.field4199 = var4 + var4 - 1 - this.field4199;
                    this.field4193 = -this.field4193;
                    if (this.field4199 >= var3) {
                        return;
                    }
                    this.field4199 = var3 + var3 - 1 - this.field4199;
                    this.field4193 = -this.field4193;
                }
            }
        } else {
            if (this.field4195 > 0) {
                if (this.field4198) {
                    label125: {
                        if (this.field4193 < 0) {
                            if (this.field4199 >= var3) {
                                return;
                            }
                            this.field4199 = var3 + var3 - 1 - this.field4199;
                            this.field4193 = -this.field4193;
                            if (--this.field4195 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field4199 < var4) {
                                return;
                            }
                            this.field4199 = var4 + var4 - 1 - this.field4199;
                            this.field4193 = -this.field4193;
                            if (--this.field4195 == 0) {
                                break;
                            }
                            if (this.field4199 >= var3) {
                                return;
                            }
                            this.field4199 = var3 + var3 - 1 - this.field4199;
                            this.field4193 = -this.field4193;
                        } while (--this.field4195 != 0);
                    }
                } else if (this.field4193 < 0) {
                    if (this.field4199 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field4199) / var6;
                    if (var7 < this.field4195) {
                        this.field4199 += var6 * var7;
                        this.field4195 -= var7;
                        return;
                    }
                    this.field4199 += this.field4195 * var6;
                    this.field4195 = 0;
                } else {
                    if (this.field4199 < var4) {
                        return;
                    }
                    int var8 = (this.field4199 - var3) / var6;
                    if (var8 < this.field4195) {
                        this.field4199 -= var6 * var8;
                        this.field4195 -= var8;
                        return;
                    }
                    this.field4199 -= this.field4195 * var6;
                    this.field4195 = 0;
                }
            }
            if (this.field4193 < 0) {
                if (this.field4199 < 0) {
                    this.field4199 = -1;
                    this.method1845();
                    this.method2574((byte) 124);
                    return;
                }
            } else if (this.field4199 >= var5) {
                this.field4199 = var5;
                this.method1845();
                this.method2574((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIILhg;II)I")
    private static final int method1855(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class290 arg10, int arg11, int arg12) {
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
        arg10.field4199 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public final synchronized void method1856(int arg0) {
        if (arg0 == 0) {
            this.method1833(0);
            this.method2574((byte) 118);
        } else if (this.field4191 == 0 && this.field4189 == 0) {
            this.field4194 = 0;
            this.field4197 = 0;
            this.field4200 = 0;
            this.method2574((byte) 124);
        } else {
            int var2 = -this.field4200;
            if (this.field4200 > var2) {
                var2 = this.field4200;
            }
            if (-this.field4191 > var2) {
                var2 = -this.field4191;
            }
            if (this.field4191 > var2) {
                var2 = this.field4191;
            }
            if (-this.field4189 > var2) {
                var2 = -this.field4189;
            }
            if (this.field4189 > var2) {
                var2 = this.field4189;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field4194 = arg0;
            this.field4197 = Integer.MIN_VALUE;
            this.field4187 = -this.field4200 / arg0;
            this.field4196 = -this.field4191 / arg0;
            this.field4190 = -this.field4189 / arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([B[IIIIIIIILhg;)I")
    private static final int method1857(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class290 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field4191 += (var14 - arg3) * arg9.field4196;
        arg9.field4189 += (var14 - arg3) * arg9.field4190;
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
        arg9.field4200 = var12 >> 2;
        arg9.field4199 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II[B[IIIIIIIIIILhg;II)I")
    private static final int method1858(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class290 arg13, int arg14, int arg15) {
        arg13.field4200 -= arg13.field4187 * arg5;
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
        arg13.field4200 += arg13.field4187 * var22;
        arg13.field4191 = arg6;
        arg13.field4189 = arg7;
        arg13.field4199 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
    public final synchronized void method1859(int arg0) {
        this.field4195 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([IIIII)I")
    private final int method1860(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field4194 <= 0) {
                if (this.field4193 == 256 && (this.field4199 & 255) == 0) {
                    if (class215.field3079) {
                        return method1853(0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, 0, arg3, arg2, this);
                    }
                    return method1863(((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, 0, arg3, arg2, this);
                }
                if (class215.field3079) {
                    return method1830(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, 0, arg3, arg2, this, this.field4193, arg4);
                }
                return method1846(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, 0, arg3, arg2, this, this.field4193, arg4);
            }
            int var6 = this.field4194 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field4194 += arg1;
            if (this.field4193 == 256 && (this.field4199 & 255) == 0) {
                if (class215.field3079) {
                    arg1 = method1849(0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, this.field4196, this.field4190, 0, var6, arg2, this);
                } else {
                    arg1 = method1857(((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, this.field4187, 0, var6, arg2, this);
                }
            } else if (class215.field3079) {
                arg1 = method1858(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4191, this.field4189, this.field4196, this.field4190, 0, var6, arg2, this, this.field4193, arg4);
            } else {
                arg1 = method1841(0, 0, ((class61) super.field1372).field875, arg0, this.field4199, arg1, this.field4200, this.field4187, 0, var6, arg2, this, this.field4193, arg4);
            }
            this.field4194 -= arg1;
            if (this.field4194 != 0) {
                return arg1;
            }
        } while (!this.method1854());
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "()I")
    public final synchronized int method1861() {
        return this.field4197 == Integer.MIN_VALUE ? 0 : this.field4197;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I[B[IIIIIIIILhg;)I")
    private static final int method1862(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class290 arg10) {
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
        arg10.field4199 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "([B[IIIIIIILhg;)I")
    private static final int method1863(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class290 arg8) {
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
        arg8.field4199 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I[B[IIIIIIIIIILhg;)I")
    private static final int method1864(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class290 arg12) {
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
        arg12.field4200 += (var19 - arg4) * arg12.field4187;
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
        arg12.field4191 = var15 >> 2;
        arg12.field4189 = var16 >> 2;
        arg12.field4199 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lok;II)V")
    private class290(class61 arg0, int arg1, int arg2) {
        super.field1372 = arg0;
        this.field4192 = arg0.field879;
        this.field4201 = arg0.field876;
        this.field4198 = arg0.field878;
        this.field4193 = arg1;
        this.field4197 = arg2;
        this.field4188 = 8192;
        this.field4199 = 0;
        this.method1827();
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lok;III)V")
    private class290(class61 arg0, int arg1, int arg2, int arg3) {
        super.field1372 = arg0;
        this.field4192 = arg0.field879;
        this.field4201 = arg0.field876;
        this.field4198 = arg0.field878;
        this.field4193 = arg1;
        this.field4197 = arg2;
        this.field4188 = arg3;
        this.field4199 = 0;
        this.method1827();
    }
}
