import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class477 extends class31 {

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    private int field6891;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    private int field6899;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "Z")
    private boolean field6898;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    private int field6888;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    private int field6893;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "I")
    private int field6901;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    private int field6900;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    private int field6887;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    private int field6889;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    private int field6890;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    private int field6892;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    private int field6894;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    private int field6895;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    private int field6896;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    private int field6897;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
    public final synchronized void method2793(int arg0) {
        if (arg0 == 0) {
            this.method2809(0);
            this.method2791((byte) 112);
        } else if (this.field6894 == 0 && this.field6897 == 0) {
            this.field6889 = 0;
            this.field6893 = 0;
            this.field6890 = 0;
            this.method2791((byte) 112);
        } else {
            int var2 = -this.field6890;
            if (this.field6890 > var2) {
                var2 = this.field6890;
            }
            if (-this.field6894 > var2) {
                var2 = -this.field6894;
            }
            if (this.field6894 > var2) {
                var2 = this.field6894;
            }
            if (-this.field6897 > var2) {
                var2 = -this.field6897;
            }
            if (this.field6897 > var2) {
                var2 = this.field6897;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field6889 = arg0;
            this.field6893 = Integer.MIN_VALUE;
            this.field6887 = -this.field6890 / arg0;
            this.field6892 = -this.field6894 / arg0;
            this.field6895 = -this.field6897 / arg0;
        }
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "()Z")
    public final boolean method2794() {
        return this.field6889 != 0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([B[IIIIIIIILes;)I")
    private static final int method2795(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class477 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field6894 += (var14 - arg3) * arg9.field6892;
        arg9.field6897 += (var14 - arg3) * arg9.field6895;
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
        arg9.field6890 = var12 >> 2;
        arg9.field6900 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([IIIII)I")
    private final int method2796(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6889 <= 0) {
                if (this.field6888 == 256 && (this.field6900 & 255) == 0) {
                    if (class163.field2472) {
                        return method2816(0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, 0, arg3, arg2, this);
                    }
                    return method2803(((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, 0, arg3, arg2, this);
                }
                if (class163.field2472) {
                    return method2807(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, 0, arg3, arg2, this, this.field6888, arg4);
                }
                return method2801(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, 0, arg3, arg2, this, this.field6888, arg4);
            }
            int var6 = this.field6889 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6889 += arg1;
            if (this.field6888 == 256 && (this.field6900 & 255) == 0) {
                if (class163.field2472) {
                    arg1 = method2830(0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, this.field6892, this.field6895, 0, var6, arg2, this);
                } else {
                    arg1 = method2829(((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, this.field6887, 0, var6, arg2, this);
                }
            } else if (class163.field2472) {
                arg1 = method2813(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, this.field6892, this.field6895, 0, var6, arg2, this, this.field6888, arg4);
            } else {
                arg1 = method2831(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, this.field6887, 0, var6, arg2, this, this.field6888, arg4);
            }
            this.field6889 -= arg1;
            if (this.field6889 != 0) {
                return arg1;
            }
        } while (!this.method2804());
        return arg3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II[B[IIIIIIIILes;II)I")
    private static final int method2797(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class477 arg11, int arg12, int arg13) {
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
        arg11.field6900 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public final synchronized void method2798(boolean arg0) {
        this.field6888 = (this.field6888 >>> 31) + (this.field6888 ^ this.field6888 >> 31);
        if (arg0) {
            this.field6888 = -this.field6888;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "()Loo;")
    public final class31 method226() {
        return null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I[B[IIIIIIIIIILes;)I")
    private static final int method2799(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class477 arg12) {
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
        arg12.field6890 += (var19 - arg4) * arg12.field6887;
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
        arg12.field6894 = var15 >> 2;
        arg12.field6897 = var16 >> 2;
        arg12.field6900 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!es", name = "f", descriptor = "()Z")
    public final boolean method2800() {
        return this.field6900 < 0 || this.field6900 >= ((class174) super.field469).field2641.length << 8;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II[B[IIIIIIILes;II)I")
    private static final int method2801(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class477 arg10, int arg11, int arg12) {
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
        arg10.field6900 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
    public final synchronized void method230(int arg0) {
        if (this.field6889 > 0) {
            if (arg0 >= this.field6889) {
                if (this.field6893 == Integer.MIN_VALUE) {
                    this.field6893 = 0;
                    this.field6890 = this.field6894 = this.field6897 = 0;
                    this.method2791((byte) 112);
                    arg0 = this.field6889;
                }
                this.field6889 = 0;
                this.method2818();
            } else {
                this.field6890 += this.field6887 * arg0;
                this.field6894 += this.field6892 * arg0;
                this.field6897 += this.field6895 * arg0;
                this.field6889 -= arg0;
            }
        }
        class174 var2 = (class174) super.field469;
        int var3 = this.field6891 << 8;
        int var4 = this.field6899 << 8;
        int var5 = var2.field2641.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field6896 = 0;
        }
        if (this.field6900 < 0) {
            if (this.field6888 <= 0) {
                this.method2811();
                this.method2791((byte) 112);
                return;
            }
            this.field6900 = 0;
        }
        if (this.field6900 >= var5) {
            if (this.field6888 >= 0) {
                this.method2811();
                this.method2791((byte) 112);
                return;
            }
            this.field6900 = var5 - 1;
        }
        this.field6900 += this.field6888 * arg0;
        if (this.field6896 < 0) {
            if (!this.field6898) {
                if (this.field6888 < 0) {
                    if (this.field6900 < var3) {
                        this.field6900 = var4 - 1 - (var4 - 1 - this.field6900) % var6;
                    }
                } else if (this.field6900 >= var4) {
                    this.field6900 = (this.field6900 - var3) % var6 + var3;
                }
            } else {
                if (this.field6888 < 0) {
                    if (this.field6900 >= var3) {
                        return;
                    }
                    this.field6900 = var3 + var3 - 1 - this.field6900;
                    this.field6888 = -this.field6888;
                }
                while (this.field6900 >= var4) {
                    this.field6900 = var4 + var4 - 1 - this.field6900;
                    this.field6888 = -this.field6888;
                    if (this.field6900 >= var3) {
                        return;
                    }
                    this.field6900 = var3 + var3 - 1 - this.field6900;
                    this.field6888 = -this.field6888;
                }
            }
        } else {
            if (this.field6896 > 0) {
                if (this.field6898) {
                    label125: {
                        if (this.field6888 < 0) {
                            if (this.field6900 >= var3) {
                                return;
                            }
                            this.field6900 = var3 + var3 - 1 - this.field6900;
                            this.field6888 = -this.field6888;
                            if (--this.field6896 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field6900 < var4) {
                                return;
                            }
                            this.field6900 = var4 + var4 - 1 - this.field6900;
                            this.field6888 = -this.field6888;
                            if (--this.field6896 == 0) {
                                break;
                            }
                            if (this.field6900 >= var3) {
                                return;
                            }
                            this.field6900 = var3 + var3 - 1 - this.field6900;
                            this.field6888 = -this.field6888;
                        } while (--this.field6896 != 0);
                    }
                } else if (this.field6888 < 0) {
                    if (this.field6900 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field6900) / var6;
                    if (var7 < this.field6896) {
                        this.field6900 += var6 * var7;
                        this.field6896 -= var7;
                        return;
                    }
                    this.field6900 += this.field6896 * var6;
                    this.field6896 = 0;
                } else {
                    if (this.field6900 < var4) {
                        return;
                    }
                    int var8 = (this.field6900 - var3) / var6;
                    if (var8 < this.field6896) {
                        this.field6900 -= var6 * var8;
                        this.field6896 -= var8;
                        return;
                    }
                    this.field6900 -= this.field6896 * var6;
                    this.field6896 = 0;
                }
            }
            if (this.field6888 < 0) {
                if (this.field6900 < 0) {
                    this.field6900 = -1;
                    this.method2811();
                    this.method2791((byte) 112);
                    return;
                }
            } else if (this.field6900 >= var5) {
                this.field6900 = var5;
                this.method2811();
                this.method2791((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
    public final synchronized void method2802(int arg0) {
        int var2 = ((class174) super.field469).field2641.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field6900 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([B[IIIIIIILes;)I")
    private static final int method2803(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class477 arg8) {
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
        arg8.field6900 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!es", name = "g", descriptor = "()Z")
    private final boolean method2804() {
        int var1 = this.field6893;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2822(var1, this.field6901);
            var2 = method2826(var1, this.field6901);
        }
        if (this.field6890 == var1 && this.field6894 == var3 && this.field6897 == var2) {
            if (this.field6893 == Integer.MIN_VALUE) {
                this.field6893 = 0;
                this.field6890 = this.field6894 = this.field6897 = 0;
                this.method2791((byte) 112);
                return true;
            } else {
                this.method2818();
                return false;
            }
        } else {
            if (this.field6890 < var1) {
                this.field6887 = 1;
                this.field6889 = var1 - this.field6890;
            } else if (this.field6890 > var1) {
                this.field6887 = -1;
                this.field6889 = this.field6890 - var1;
            } else {
                this.field6887 = 0;
            }
            if (this.field6894 < var3) {
                this.field6892 = 1;
                if (this.field6889 == 0 || this.field6889 > var3 - this.field6894) {
                    this.field6889 = var3 - this.field6894;
                }
            } else if (this.field6894 > var3) {
                this.field6892 = -1;
                if (this.field6889 == 0 || this.field6889 > this.field6894 - var3) {
                    this.field6889 = this.field6894 - var3;
                }
            } else {
                this.field6892 = 0;
            }
            if (this.field6897 < var2) {
                this.field6895 = 1;
                if (this.field6889 == 0 || this.field6889 > var2 - this.field6897) {
                    this.field6889 = var2 - this.field6897;
                }
            } else if (this.field6897 > var2) {
                this.field6895 = -1;
                if (this.field6889 == 0 || this.field6889 > this.field6897 - var2) {
                    this.field6889 = this.field6897 - var2;
                }
            } else {
                this.field6895 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!es", name = "h", descriptor = "()I")
    public final synchronized int method2805() {
        return this.field6888 < 0 ? -this.field6888 : this.field6888;
    }

    @OriginalMember(owner = "client!es", name = "i", descriptor = "()I")
    public final synchronized int method2806() {
        return this.field6901 < 0 ? -1 : this.field6901;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II[B[IIIIIIIILes;II)I")
    private static final int method2807(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class477 arg11, int arg12, int arg13) {
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
        arg11.field6900 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lhe;III)Les;")
    public static final class477 method2808(class174 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2641 != null && arg0.field2641.length != 0 ? new class477(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
    private final synchronized void method2809(int arg0) {
        this.method2828(arg0, this.method2806());
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
    public final synchronized void method2810(int arg0, int arg1) {
        this.method2824(arg0, arg1, this.method2806());
    }

    @OriginalMember(owner = "client!es", name = "j", descriptor = "()V")
    private final void method2811() {
        if (this.field6889 != 0) {
            if (this.field6893 == Integer.MIN_VALUE) {
                this.field6893 = 0;
            }
            this.field6889 = 0;
            this.method2818();
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(II[B[IIIIIIIILes;II)I")
    private static final int method2812(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class477 arg11, int arg12, int arg13) {
        arg11.field6894 -= arg11.field6892 * arg5;
        arg11.field6897 -= arg11.field6895 * arg5;
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
        arg11.field6894 += arg11.field6892 * arg5;
        arg11.field6897 += arg11.field6895 * arg5;
        arg11.field6890 = arg6;
        arg11.field6900 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II[B[IIIIIIIIIILes;II)I")
    private static final int method2813(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class477 arg13, int arg14, int arg15) {
        arg13.field6890 -= arg13.field6887 * arg5;
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
        arg13.field6890 += arg13.field6887 * var22;
        arg13.field6894 = arg6;
        arg13.field6897 = arg7;
        arg13.field6900 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II[B[IIIIIIIIIILes;II)I")
    private static final int method2814(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class477 arg13, int arg14, int arg15) {
        arg13.field6890 -= arg13.field6887 * arg5;
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
        arg13.field6890 += arg13.field6887 * var22;
        arg13.field6894 = arg6;
        arg13.field6897 = arg7;
        arg13.field6900 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I[B[IIIIIIIILes;)I")
    private static final int method2815(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class477 arg10) {
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
        arg10.field6900 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I[B[IIIIIIIILes;)I")
    private static final int method2816(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class477 arg10) {
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
        arg10.field6900 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!es", name = "k", descriptor = "()I")
    public final synchronized int method2817() {
        return this.field6893 == Integer.MIN_VALUE ? 0 : this.field6893;
    }

    @OriginalMember(owner = "client!es", name = "l", descriptor = "()V")
    private final void method2818() {
        this.field6890 = this.field6893;
        this.field6894 = method2822(this.field6893, this.field6901);
        this.field6897 = method2826(this.field6893, this.field6901);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "([IIIII)I")
    private final int method2819(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field6889 <= 0) {
                if (this.field6888 == -256 && (this.field6900 & 255) == 0) {
                    if (class163.field2472) {
                        return method2815(0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, 0, arg3, arg2, this);
                    }
                    return method2823(((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, 0, arg3, arg2, this);
                }
                if (class163.field2472) {
                    return method2797(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, 0, arg3, arg2, this, this.field6888, arg4);
                }
                return method2827(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, 0, arg3, arg2, this, this.field6888, arg4);
            }
            int var6 = this.field6889 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field6889 += arg1;
            if (this.field6888 == -256 && (this.field6900 & 255) == 0) {
                if (class163.field2472) {
                    arg1 = method2799(0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, this.field6892, this.field6895, 0, var6, arg2, this);
                } else {
                    arg1 = method2795(((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, this.field6887, 0, var6, arg2, this);
                }
            } else if (class163.field2472) {
                arg1 = method2814(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6894, this.field6897, this.field6892, this.field6895, 0, var6, arg2, this, this.field6888, arg4);
            } else {
                arg1 = method2812(0, 0, ((class174) super.field469).field2641, arg0, this.field6900, arg1, this.field6890, this.field6887, 0, var6, arg2, this, this.field6888, arg4);
            }
            this.field6889 -= arg1;
            if (this.field6889 != 0) {
                return arg1;
            }
        } while (!this.method2804());
        return arg3;
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "()Loo;")
    public final class31 method228() {
        return null;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lhe;II)Les;")
    public static final class477 method2820(class174 arg0, int arg1, int arg2) {
        return arg0.field2641 != null && arg0.field2641.length != 0 ? new class477(arg0, (int) ((long) arg0.field2642 * 256L * (long) arg1 / (long) (class506.field7397 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
    public final synchronized void method2821(int arg0) {
        this.method2828(arg0 << 6, this.method2806());
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "()I")
    public final int method225() {
        return this.field6893 == 0 && this.field6889 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)I")
    private static final int method2822(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "([B[IIIIIIILes;)I")
    private static final int method2823(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class477 arg8) {
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
        arg8.field6900 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
    public final synchronized void method2824(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2828(arg1, arg2);
        } else {
            int var4 = method2822(arg1, arg2);
            int var5 = method2826(arg1, arg2);
            if (this.field6894 == var4 && this.field6897 == var5) {
                this.field6889 = 0;
            } else {
                int var6 = arg1 - this.field6890;
                if (this.field6890 - arg1 > var6) {
                    var6 = this.field6890 - arg1;
                }
                if (var4 - this.field6894 > var6) {
                    var6 = var4 - this.field6894;
                }
                if (this.field6894 - var4 > var6) {
                    var6 = this.field6894 - var4;
                }
                if (var5 - this.field6897 > var6) {
                    var6 = var5 - this.field6897;
                }
                if (this.field6897 - var5 > var6) {
                    var6 = this.field6897 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field6889 = arg0;
                this.field6893 = arg1;
                this.field6901 = arg2;
                this.field6887 = (arg1 - this.field6890) / arg0;
                this.field6892 = (var4 - this.field6894) / arg0;
                this.field6895 = (var5 - this.field6897) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "g", descriptor = "(I)V")
    public final synchronized void method2825(int arg0) {
        this.field6896 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(II)I")
    private static final int method2826(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II[B[IIIIIIILes;II)I")
    private static final int method2827(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class477 arg10, int arg11, int arg12) {
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
        arg10.field6900 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(II)V")
    private final synchronized void method2828(int arg0, int arg1) {
        this.field6893 = arg0;
        this.field6901 = arg1;
        this.field6889 = 0;
        this.method2818();
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "([B[IIIIIIIILes;)I")
    private static final int method2829(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class477 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field6894 += (var14 - arg3) * arg9.field6892;
        arg9.field6897 += (var14 - arg3) * arg9.field6895;
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
        arg9.field6890 = var12 >> 2;
        arg9.field6900 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I[B[IIIIIIIIIILes;)I")
    private static final int method2830(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class477 arg12) {
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
        arg12.field6890 += (var19 - arg4) * arg12.field6887;
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
        arg12.field6894 = var15 >> 2;
        arg12.field6897 = var16 >> 2;
        arg12.field6900 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "([III)V")
    public final synchronized void method231(int[] arg0, int arg1, int arg2) {
        if (this.field6893 == 0 && this.field6889 == 0) {
            this.method230(arg2);
        } else {
            class174 var4 = (class174) super.field469;
            int var5 = this.field6891 << 8;
            int var6 = this.field6899 << 8;
            int var7 = var4.field2641.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field6896 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field6900 < 0) {
                if (this.field6888 <= 0) {
                    this.method2811();
                    this.method2791((byte) 112);
                    return;
                }
                this.field6900 = 0;
            }
            if (this.field6900 >= var7) {
                if (this.field6888 >= 0) {
                    this.method2811();
                    this.method2791((byte) 112);
                    return;
                }
                this.field6900 = var7 - 1;
            }
            if (this.field6896 < 0) {
                if (this.field6898) {
                    if (this.field6888 < 0) {
                        var9 = this.method2819(arg0, arg1, var5, var10, var4.field2641[this.field6891]);
                        if (this.field6900 >= var5) {
                            return;
                        }
                        this.field6900 = var5 + var5 - 1 - this.field6900;
                        this.field6888 = -this.field6888;
                    }
                    while (true) {
                        int var11 = this.method2796(arg0, var9, var6, var10, var4.field2641[this.field6899 - 1]);
                        if (this.field6900 < var6) {
                            return;
                        }
                        this.field6900 = var6 + var6 - 1 - this.field6900;
                        this.field6888 = -this.field6888;
                        var9 = this.method2819(arg0, var11, var5, var10, var4.field2641[this.field6891]);
                        if (this.field6900 >= var5) {
                            return;
                        }
                        this.field6900 = var5 + var5 - 1 - this.field6900;
                        this.field6888 = -this.field6888;
                    }
                } else if (this.field6888 < 0) {
                    while (true) {
                        var9 = this.method2819(arg0, var9, var5, var10, var4.field2641[this.field6899 - 1]);
                        if (this.field6900 >= var5) {
                            return;
                        }
                        this.field6900 = var6 - 1 - (var6 - 1 - this.field6900) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method2796(arg0, var9, var6, var10, var4.field2641[this.field6891]);
                        if (this.field6900 < var6) {
                            return;
                        }
                        this.field6900 = (this.field6900 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field6896 > 0) {
                    if (this.field6898) {
                        label130: {
                            if (this.field6888 < 0) {
                                var9 = this.method2819(arg0, arg1, var5, var10, var4.field2641[this.field6891]);
                                if (this.field6900 >= var5) {
                                    return;
                                }
                                this.field6900 = var5 + var5 - 1 - this.field6900;
                                this.field6888 = -this.field6888;
                                if (--this.field6896 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method2796(arg0, var9, var6, var10, var4.field2641[this.field6899 - 1]);
                                if (this.field6900 < var6) {
                                    return;
                                }
                                this.field6900 = var6 + var6 - 1 - this.field6900;
                                this.field6888 = -this.field6888;
                                if (--this.field6896 == 0) {
                                    break;
                                }
                                var9 = this.method2819(arg0, var9, var5, var10, var4.field2641[this.field6891]);
                                if (this.field6900 >= var5) {
                                    return;
                                }
                                this.field6900 = var5 + var5 - 1 - this.field6900;
                                this.field6888 = -this.field6888;
                            } while (--this.field6896 != 0);
                        }
                    } else if (this.field6888 < 0) {
                        while (true) {
                            var9 = this.method2819(arg0, var9, var5, var10, var4.field2641[this.field6899 - 1]);
                            if (this.field6900 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field6900) / var8;
                            if (var12 >= this.field6896) {
                                this.field6900 += this.field6896 * var8;
                                this.field6896 = 0;
                                break;
                            }
                            this.field6900 += var8 * var12;
                            this.field6896 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method2796(arg0, var9, var6, var10, var4.field2641[this.field6891]);
                            if (this.field6900 < var6) {
                                return;
                            }
                            int var13 = (this.field6900 - var5) / var8;
                            if (var13 >= this.field6896) {
                                this.field6900 -= this.field6896 * var8;
                                this.field6896 = 0;
                                break;
                            }
                            this.field6900 -= var8 * var13;
                            this.field6896 -= var13;
                        }
                    }
                }
                if (this.field6888 < 0) {
                    this.method2819(arg0, var9, 0, var10, 0);
                    if (this.field6900 < 0) {
                        this.field6900 = -1;
                        this.method2811();
                        this.method2791((byte) 112);
                        return;
                    }
                } else {
                    this.method2796(arg0, var9, var7, var10, 0);
                    if (this.field6900 >= var7) {
                        this.field6900 = var7;
                        this.method2811();
                        this.method2791((byte) 112);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(II[B[IIIIIIIILes;II)I")
    private static final int method2831(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class477 arg11, int arg12, int arg13) {
        arg11.field6894 -= arg11.field6892 * arg5;
        arg11.field6897 -= arg11.field6895 * arg5;
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
        arg11.field6894 += arg11.field6892 * arg5;
        arg11.field6897 += arg11.field6895 * arg5;
        arg11.field6890 = arg6;
        arg11.field6900 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!es", name = "h", descriptor = "(I)V")
    public final synchronized void method2832(int arg0) {
        if (this.field6888 < 0) {
            this.field6888 = -arg0;
        } else {
            this.field6888 = arg0;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lhe;II)V")
    private class477(class174 arg0, int arg1, int arg2) {
        super.field469 = arg0;
        this.field6891 = arg0.field2643;
        this.field6899 = arg0.field2639;
        this.field6898 = arg0.field2640;
        this.field6888 = arg1;
        this.field6893 = arg2;
        this.field6901 = 8192;
        this.field6900 = 0;
        this.method2818();
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lhe;III)V")
    private class477(class174 arg0, int arg1, int arg2, int arg3) {
        super.field469 = arg0;
        this.field6891 = arg0.field2643;
        this.field6899 = arg0.field2639;
        this.field6898 = arg0.field2640;
        this.field6888 = arg1;
        this.field6893 = arg2;
        this.field6901 = arg3;
        this.field6900 = 0;
        this.method2818();
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "()I")
    public final int method227() {
        int var1 = this.field6890 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field6896 == 0) {
            var2 -= this.field6900 * var2 / (((class174) super.field469).field2641.length << 8);
        } else if (this.field6896 >= 0) {
            var2 -= this.field6891 * var2 / ((class174) super.field469).field2641.length;
        }
        return var2 > 255 ? 255 : var2;
    }
}
