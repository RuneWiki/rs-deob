import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class557 extends class582 {

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    private int field7863;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    private int field7873;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Z")
    private boolean field7868;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    private int field7875;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    private int field7865;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    private int field7876;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    private int field7869;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    private int field7862;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    private int field7864;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    private int field7866;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    private int field7867;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    private int field7870;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    private int field7871;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    private int field7872;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    private int field7874;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public final synchronized void method3152(int arg0) {
        this.method3153(arg0 << 6, this.method3179());
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    private final synchronized void method3153(int arg0, int arg1) {
        this.field7865 = arg0;
        this.field7876 = arg1;
        this.field7870 = 0;
        this.method3157();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[B[IIIIIIIILre;II)I")
    private static final int method3154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
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
        arg11.field7869 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public final synchronized void method3155(int arg0) {
        if (arg0 == 0) {
            this.method3186(0);
            this.method3678(-1);
        } else if (this.field7872 == 0 && this.field7862 == 0) {
            this.field7870 = 0;
            this.field7865 = 0;
            this.field7871 = 0;
            this.method3678(-1);
        } else {
            int var2 = -this.field7871;
            if (this.field7871 > var2) {
                var2 = this.field7871;
            }
            if (-this.field7872 > var2) {
                var2 = -this.field7872;
            }
            if (this.field7872 > var2) {
                var2 = this.field7872;
            }
            if (-this.field7862 > var2) {
                var2 = -this.field7862;
            }
            if (this.field7862 > var2) {
                var2 = this.field7862;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field7870 = arg0;
            this.field7865 = Integer.MIN_VALUE;
            this.field7874 = -this.field7871 / arg0;
            this.field7867 = -this.field7872 / arg0;
            this.field7864 = -this.field7862 / arg0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lmm;III)Lre;")
    public static final class557 method3156(class250 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3871 != null && arg0.field3871.length != 0 ? new class557(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "()V")
    private final void method3157() {
        this.field7871 = this.field7865;
        this.field7872 = method3159(this.field7865, this.field7876);
        this.field7862 = method3167(this.field7865, this.field7876);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "()I")
    public final synchronized int method3158() {
        return this.field7875 < 0 ? -this.field7875 : this.field7875;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)I")
    private static final int method3159(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
    public final int method3160() {
        int var1 = this.field7871 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field7866 == 0) {
            var2 -= this.field7869 * var2 / (((class250) super.field8193).field3871.length << 8);
        } else if (this.field7866 >= 0) {
            var2 -= this.field7863 * var2 / ((class250) super.field8193).field3871.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II[B[IIIIIIIILre;II)I")
    private static final int method3161(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
        arg11.field7872 -= arg11.field7867 * arg5;
        arg11.field7862 -= arg11.field7864 * arg5;
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
        arg11.field7872 += arg11.field7867 * arg5;
        arg11.field7862 += arg11.field7864 * arg5;
        arg11.field7871 = arg6;
        arg11.field7869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "()Z")
    private final boolean method3162() {
        int var1 = this.field7865;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3159(var1, this.field7876);
            var2 = method3167(var1, this.field7876);
        }
        if (this.field7871 == var1 && this.field7872 == var3 && this.field7862 == var2) {
            if (this.field7865 == Integer.MIN_VALUE) {
                this.field7865 = 0;
                this.field7871 = this.field7872 = this.field7862 = 0;
                this.method3678(-1);
                return true;
            } else {
                this.method3157();
                return false;
            }
        } else {
            if (this.field7871 < var1) {
                this.field7874 = 1;
                this.field7870 = var1 - this.field7871;
            } else if (this.field7871 > var1) {
                this.field7874 = -1;
                this.field7870 = this.field7871 - var1;
            } else {
                this.field7874 = 0;
            }
            if (this.field7872 < var3) {
                this.field7867 = 1;
                if (this.field7870 == 0 || this.field7870 > var3 - this.field7872) {
                    this.field7870 = var3 - this.field7872;
                }
            } else if (this.field7872 > var3) {
                this.field7867 = -1;
                if (this.field7870 == 0 || this.field7870 > this.field7872 - var3) {
                    this.field7870 = this.field7872 - var3;
                }
            } else {
                this.field7867 = 0;
            }
            if (this.field7862 < var2) {
                this.field7864 = 1;
                if (this.field7870 == 0 || this.field7870 > var2 - this.field7862) {
                    this.field7870 = var2 - this.field7862;
                }
            } else if (this.field7862 > var2) {
                this.field7864 = -1;
                if (this.field7870 == 0 || this.field7870 > this.field7862 - var2) {
                    this.field7870 = this.field7862 - var2;
                }
            } else {
                this.field7864 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
    public final synchronized void method3163(boolean arg0) {
        this.field7875 = (this.field7875 >>> 31) + (this.field7875 ^ this.field7875 >> 31);
        if (arg0) {
            this.field7875 = -this.field7875;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([B[IIIIIIIILre;)I")
    private static final int method3164(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class557 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field7872 += (var14 - arg3) * arg9.field7867;
        arg9.field7862 += (var14 - arg3) * arg9.field7864;
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
        arg9.field7871 = var12 >> 2;
        arg9.field7869 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[B[IIIIIIILre;II)I")
    private static final int method3165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10, int arg11, int arg12) {
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
        arg10.field7869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[B[IIIIIIIIIILre;II)I")
    private static final int method3166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class557 arg13, int arg14, int arg15) {
        arg13.field7871 -= arg13.field7874 * arg5;
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
        arg13.field7871 += arg13.field7874 * var22;
        arg13.field7872 = arg6;
        arg13.field7862 = arg7;
        arg13.field7869 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()Lpda;")
    public final class582 method403() {
        return null;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)I")
    private static final int method3167(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final synchronized void method386(int arg0) {
        if (this.field7870 > 0) {
            if (arg0 >= this.field7870) {
                if (this.field7865 == Integer.MIN_VALUE) {
                    this.field7865 = 0;
                    this.field7871 = this.field7872 = this.field7862 = 0;
                    this.method3678(-1);
                    arg0 = this.field7870;
                }
                this.field7870 = 0;
                this.method3157();
            } else {
                this.field7871 += this.field7874 * arg0;
                this.field7872 += this.field7867 * arg0;
                this.field7862 += this.field7864 * arg0;
                this.field7870 -= arg0;
            }
        }
        class250 var2 = (class250) super.field8193;
        int var3 = this.field7863 << 8;
        int var4 = this.field7873 << 8;
        int var5 = var2.field3871.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field7866 = 0;
        }
        if (this.field7869 < 0) {
            if (this.field7875 <= 0) {
                this.method3183();
                this.method3678(-1);
                return;
            }
            this.field7869 = 0;
        }
        if (this.field7869 >= var5) {
            if (this.field7875 >= 0) {
                this.method3183();
                this.method3678(-1);
                return;
            }
            this.field7869 = var5 - 1;
        }
        this.field7869 += this.field7875 * arg0;
        if (this.field7866 < 0) {
            if (!this.field7868) {
                if (this.field7875 < 0) {
                    if (this.field7869 < var3) {
                        this.field7869 = var4 - 1 - (var4 - 1 - this.field7869) % var6;
                    }
                } else if (this.field7869 >= var4) {
                    this.field7869 = (this.field7869 - var3) % var6 + var3;
                }
            } else {
                if (this.field7875 < 0) {
                    if (this.field7869 >= var3) {
                        return;
                    }
                    this.field7869 = var3 + var3 - 1 - this.field7869;
                    this.field7875 = -this.field7875;
                }
                while (this.field7869 >= var4) {
                    this.field7869 = var4 + var4 - 1 - this.field7869;
                    this.field7875 = -this.field7875;
                    if (this.field7869 >= var3) {
                        return;
                    }
                    this.field7869 = var3 + var3 - 1 - this.field7869;
                    this.field7875 = -this.field7875;
                }
            }
        } else {
            if (this.field7866 > 0) {
                if (this.field7868) {
                    label125: {
                        if (this.field7875 < 0) {
                            if (this.field7869 >= var3) {
                                return;
                            }
                            this.field7869 = var3 + var3 - 1 - this.field7869;
                            this.field7875 = -this.field7875;
                            if (--this.field7866 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field7869 < var4) {
                                return;
                            }
                            this.field7869 = var4 + var4 - 1 - this.field7869;
                            this.field7875 = -this.field7875;
                            if (--this.field7866 == 0) {
                                break;
                            }
                            if (this.field7869 >= var3) {
                                return;
                            }
                            this.field7869 = var3 + var3 - 1 - this.field7869;
                            this.field7875 = -this.field7875;
                        } while (--this.field7866 != 0);
                    }
                } else if (this.field7875 < 0) {
                    if (this.field7869 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field7869) / var6;
                    if (var7 < this.field7866) {
                        this.field7869 += var6 * var7;
                        this.field7866 -= var7;
                        return;
                    }
                    this.field7869 += this.field7866 * var6;
                    this.field7866 = 0;
                } else {
                    if (this.field7869 < var4) {
                        return;
                    }
                    int var8 = (this.field7869 - var3) / var6;
                    if (var8 < this.field7866) {
                        this.field7869 -= var6 * var8;
                        this.field7866 -= var8;
                        return;
                    }
                    this.field7869 -= this.field7866 * var6;
                    this.field7866 = 0;
                }
            }
            if (this.field7875 < 0) {
                if (this.field7869 < 0) {
                    this.field7869 = -1;
                    this.method3183();
                    this.method3678(-1);
                    return;
                }
            } else if (this.field7869 >= var5) {
                this.field7869 = var5;
                this.method3183();
                this.method3678(-1);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public final synchronized void method3168(int arg0) {
        if (this.field7875 < 0) {
            this.field7875 = -arg0;
        } else {
            this.field7875 = arg0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([IIIII)I")
    private final int method3169(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7870 <= 0) {
                if (this.field7875 == -256 && (this.field7869 & 255) == 0) {
                    if (class22.field297) {
                        return method3173(0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, 0, arg3, arg2, this);
                    }
                    return method3178(((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, 0, arg3, arg2, this);
                }
                if (class22.field297) {
                    return method3154(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, 0, arg3, arg2, this, this.field7875, arg4);
                }
                return method3175(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, 0, arg3, arg2, this, this.field7875, arg4);
            }
            int var6 = this.field7870 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7870 += arg1;
            if (this.field7875 == -256 && (this.field7869 & 255) == 0) {
                if (class22.field297) {
                    arg1 = method3177(0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, this.field7867, this.field7864, 0, var6, arg2, this);
                } else {
                    arg1 = method3184(((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, this.field7874, 0, var6, arg2, this);
                }
            } else if (class22.field297) {
                arg1 = method3171(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, this.field7867, this.field7864, 0, var6, arg2, this, this.field7875, arg4);
            } else {
                arg1 = method3191(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, this.field7874, 0, var6, arg2, this, this.field7875, arg4);
            }
            this.field7870 -= arg1;
            if (this.field7870 != 0) {
                return arg1;
            }
        } while (!this.method3162());
        return arg3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public final synchronized void method3170(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3153(arg1, arg2);
        } else {
            int var4 = method3159(arg1, arg2);
            int var5 = method3167(arg1, arg2);
            if (this.field7872 == var4 && this.field7862 == var5) {
                this.field7870 = 0;
            } else {
                int var6 = arg1 - this.field7871;
                if (this.field7871 - arg1 > var6) {
                    var6 = this.field7871 - arg1;
                }
                if (var4 - this.field7872 > var6) {
                    var6 = var4 - this.field7872;
                }
                if (this.field7872 - var4 > var6) {
                    var6 = this.field7872 - var4;
                }
                if (var5 - this.field7862 > var6) {
                    var6 = var5 - this.field7862;
                }
                if (this.field7862 - var5 > var6) {
                    var6 = this.field7862 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field7870 = arg0;
                this.field7865 = arg1;
                this.field7876 = arg2;
                this.field7874 = (arg1 - this.field7871) / arg0;
                this.field7867 = (var4 - this.field7872) / arg0;
                this.field7864 = (var5 - this.field7862) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II[B[IIIIIIIIIILre;II)I")
    private static final int method3171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class557 arg13, int arg14, int arg15) {
        arg13.field7871 -= arg13.field7874 * arg5;
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
        arg13.field7871 += arg13.field7874 * var22;
        arg13.field7872 = arg6;
        arg13.field7862 = arg7;
        arg13.field7869 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B[IIIIIIIILre;)I")
    private static final int method3172(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10) {
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
        arg10.field7869 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I[B[IIIIIIIILre;)I")
    private static final int method3173(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10) {
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
        arg10.field7869 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[B[IIIIIIIIIILre;)I")
    private static final int method3174(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class557 arg12) {
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
        arg12.field7871 += (var19 - arg4) * arg12.field7874;
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
        arg12.field7872 = var15 >> 2;
        arg12.field7862 = var16 >> 2;
        arg12.field7869 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II[B[IIIIIIILre;II)I")
    private static final int method3175(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class557 arg10, int arg11, int arg12) {
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
        arg10.field7869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "()Z")
    public final boolean method3176() {
        return this.field7869 < 0 || this.field7869 >= ((class250) super.field8193).field3871.length << 8;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I[B[IIIIIIIIIILre;)I")
    private static final int method3177(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class557 arg12) {
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
        arg12.field7871 += (var19 - arg4) * arg12.field7874;
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
        arg12.field7872 = var15 >> 2;
        arg12.field7862 = var16 >> 2;
        arg12.field7869 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([B[IIIIIIILre;)I")
    private static final int method3178(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class557 arg8) {
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
        arg8.field7869 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!re", name = "i", descriptor = "()I")
    public final synchronized int method3179() {
        return this.field7876 < 0 ? -1 : this.field7876;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
    public final synchronized void method3180(int arg0, int arg1) {
        this.method3170(arg0, arg1, this.method3179());
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "([IIIII)I")
    private final int method3181(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field7870 <= 0) {
                if (this.field7875 == 256 && (this.field7869 & 255) == 0) {
                    if (class22.field297) {
                        return method3172(0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, 0, arg3, arg2, this);
                    }
                    return method3187(((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, 0, arg3, arg2, this);
                }
                if (class22.field297) {
                    return method3190(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, 0, arg3, arg2, this, this.field7875, arg4);
                }
                return method3165(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, 0, arg3, arg2, this, this.field7875, arg4);
            }
            int var6 = this.field7870 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field7870 += arg1;
            if (this.field7875 == 256 && (this.field7869 & 255) == 0) {
                if (class22.field297) {
                    arg1 = method3174(0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, this.field7867, this.field7864, 0, var6, arg2, this);
                } else {
                    arg1 = method3164(((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, this.field7874, 0, var6, arg2, this);
                }
            } else if (class22.field297) {
                arg1 = method3166(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7872, this.field7862, this.field7867, this.field7864, 0, var6, arg2, this, this.field7875, arg4);
            } else {
                arg1 = method3161(0, 0, ((class250) super.field8193).field3871, arg0, this.field7869, arg1, this.field7871, this.field7874, 0, var6, arg2, this, this.field7875, arg4);
            }
            this.field7870 -= arg1;
            if (this.field7870 != 0) {
                return arg1;
            }
        } while (!this.method3162());
        return arg3;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()I")
    public final int method406() {
        return this.field7865 == 0 && this.field7870 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lmm;II)Lre;")
    public static final class557 method3182(class250 arg0, int arg1, int arg2) {
        return arg0.field3871 != null && arg0.field3871.length != 0 ? new class557(arg0, (int) ((long) arg0.field3872 * 256L * (long) arg1 / (long) (class465.field6683 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!re", name = "j", descriptor = "()V")
    private final void method3183() {
        if (this.field7870 != 0) {
            if (this.field7865 == Integer.MIN_VALUE) {
                this.field7865 = 0;
            }
            this.field7870 = 0;
            this.method3157();
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "([B[IIIIIIIILre;)I")
    private static final int method3184(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class557 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field7872 += (var14 - arg3) * arg9.field7867;
        arg9.field7862 += (var14 - arg3) * arg9.field7864;
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
        arg9.field7871 = var12 >> 2;
        arg9.field7869 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public final synchronized void method3185(int arg0) {
        int var2 = ((class250) super.field8193).field3871.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field7869 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
    private final synchronized void method3186(int arg0) {
        this.method3153(arg0, this.method3179());
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "([B[IIIIIIILre;)I")
    private static final int method3187(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class557 arg8) {
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
        arg8.field7869 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!re", name = "k", descriptor = "()I")
    public final synchronized int method3188() {
        return this.field7865 == Integer.MIN_VALUE ? 0 : this.field7865;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()Lpda;")
    public final class582 method397() {
        return null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
    public final synchronized void method373(int[] arg0, int arg1, int arg2) {
        if (this.field7865 == 0 && this.field7870 == 0) {
            this.method386(arg2);
        } else {
            class250 var4 = (class250) super.field8193;
            int var5 = this.field7863 << 8;
            int var6 = this.field7873 << 8;
            int var7 = var4.field3871.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field7866 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field7869 < 0) {
                if (this.field7875 <= 0) {
                    this.method3183();
                    this.method3678(-1);
                    return;
                }
                this.field7869 = 0;
            }
            if (this.field7869 >= var7) {
                if (this.field7875 >= 0) {
                    this.method3183();
                    this.method3678(-1);
                    return;
                }
                this.field7869 = var7 - 1;
            }
            if (this.field7866 < 0) {
                if (this.field7868) {
                    if (this.field7875 < 0) {
                        var9 = this.method3169(arg0, arg1, var5, var10, var4.field3871[this.field7863]);
                        if (this.field7869 >= var5) {
                            return;
                        }
                        this.field7869 = var5 + var5 - 1 - this.field7869;
                        this.field7875 = -this.field7875;
                    }
                    while (true) {
                        int var11 = this.method3181(arg0, var9, var6, var10, var4.field3871[this.field7873 - 1]);
                        if (this.field7869 < var6) {
                            return;
                        }
                        this.field7869 = var6 + var6 - 1 - this.field7869;
                        this.field7875 = -this.field7875;
                        var9 = this.method3169(arg0, var11, var5, var10, var4.field3871[this.field7863]);
                        if (this.field7869 >= var5) {
                            return;
                        }
                        this.field7869 = var5 + var5 - 1 - this.field7869;
                        this.field7875 = -this.field7875;
                    }
                } else if (this.field7875 < 0) {
                    while (true) {
                        var9 = this.method3169(arg0, var9, var5, var10, var4.field3871[this.field7873 - 1]);
                        if (this.field7869 >= var5) {
                            return;
                        }
                        this.field7869 = var6 - 1 - (var6 - 1 - this.field7869) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method3181(arg0, var9, var6, var10, var4.field3871[this.field7863]);
                        if (this.field7869 < var6) {
                            return;
                        }
                        this.field7869 = (this.field7869 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field7866 > 0) {
                    if (this.field7868) {
                        label130: {
                            if (this.field7875 < 0) {
                                var9 = this.method3169(arg0, arg1, var5, var10, var4.field3871[this.field7863]);
                                if (this.field7869 >= var5) {
                                    return;
                                }
                                this.field7869 = var5 + var5 - 1 - this.field7869;
                                this.field7875 = -this.field7875;
                                if (--this.field7866 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method3181(arg0, var9, var6, var10, var4.field3871[this.field7873 - 1]);
                                if (this.field7869 < var6) {
                                    return;
                                }
                                this.field7869 = var6 + var6 - 1 - this.field7869;
                                this.field7875 = -this.field7875;
                                if (--this.field7866 == 0) {
                                    break;
                                }
                                var9 = this.method3169(arg0, var9, var5, var10, var4.field3871[this.field7863]);
                                if (this.field7869 >= var5) {
                                    return;
                                }
                                this.field7869 = var5 + var5 - 1 - this.field7869;
                                this.field7875 = -this.field7875;
                            } while (--this.field7866 != 0);
                        }
                    } else if (this.field7875 < 0) {
                        while (true) {
                            var9 = this.method3169(arg0, var9, var5, var10, var4.field3871[this.field7873 - 1]);
                            if (this.field7869 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field7869) / var8;
                            if (var12 >= this.field7866) {
                                this.field7869 += this.field7866 * var8;
                                this.field7866 = 0;
                                break;
                            }
                            this.field7869 += var8 * var12;
                            this.field7866 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method3181(arg0, var9, var6, var10, var4.field3871[this.field7863]);
                            if (this.field7869 < var6) {
                                return;
                            }
                            int var13 = (this.field7869 - var5) / var8;
                            if (var13 >= this.field7866) {
                                this.field7869 -= this.field7866 * var8;
                                this.field7866 = 0;
                                break;
                            }
                            this.field7869 -= var8 * var13;
                            this.field7866 -= var13;
                        }
                    }
                }
                if (this.field7875 < 0) {
                    this.method3169(arg0, var9, 0, var10, 0);
                    if (this.field7869 < 0) {
                        this.field7869 = -1;
                        this.method3183();
                        this.method3678(-1);
                        return;
                    }
                } else {
                    this.method3181(arg0, var9, var7, var10, 0);
                    if (this.field7869 >= var7) {
                        this.field7869 = var7;
                        this.method3183();
                        this.method3678(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "l", descriptor = "()Z")
    public final boolean method3189() {
        return this.field7870 != 0;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II[B[IIIIIIIILre;II)I")
    private static final int method3190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
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
        arg11.field7869 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II[B[IIIIIIIILre;II)I")
    private static final int method3191(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class557 arg11, int arg12, int arg13) {
        arg11.field7872 -= arg11.field7867 * arg5;
        arg11.field7862 -= arg11.field7864 * arg5;
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
        arg11.field7872 += arg11.field7867 * arg5;
        arg11.field7862 += arg11.field7864 * arg5;
        arg11.field7871 = arg6;
        arg11.field7869 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V")
    public final synchronized void method3192(int arg0) {
        this.field7866 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lmm;II)V")
    private class557(class250 arg0, int arg1, int arg2) {
        super.field8193 = arg0;
        this.field7863 = arg0.field3873;
        this.field7873 = arg0.field3874;
        this.field7868 = arg0.field3875;
        this.field7875 = arg1;
        this.field7865 = arg2;
        this.field7876 = 8192;
        this.field7869 = 0;
        this.method3157();
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lmm;III)V")
    private class557(class250 arg0, int arg1, int arg2, int arg3) {
        super.field8193 = arg0;
        this.field7863 = arg0.field3873;
        this.field7873 = arg0.field3874;
        this.field7868 = arg0.field3875;
        this.field7875 = arg1;
        this.field7865 = arg2;
        this.field7876 = arg3;
        this.field7869 = 0;
        this.method3157();
    }
}
