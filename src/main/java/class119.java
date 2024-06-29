import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class119 extends class80 {

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Z")
    private boolean field1910;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[B[IIIIIIILel;II)I", line = 3)
    private static final int method877(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12) {
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
        arg10.field1918 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B[IIIIIIILel;)I", line = 29)
    private static final int method878(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8) {
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
        arg8.field1918 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()Z", line = 54)
    public final boolean method879() {
        return this.field1918 < 0 || this.field1918 >= ((class144) this.field1214).field2263.length << 8;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I", line = 57)
    private static final int method880(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 60)
    public final synchronized void method881(int arg0) {
        if (arg0 == 0) {
            this.method906(0);
            this.method1701(-120);
        } else if (this.field1909 == 0 && this.field1914 == 0) {
            this.field1908 = 0;
            this.field1913 = 0;
            this.field1911 = 0;
            this.method1701(-88);
        } else {
            int var2 = -this.field1911;
            if (this.field1911 > var2) {
                var2 = this.field1911;
            }
            if (-this.field1909 > var2) {
                var2 = -this.field1909;
            }
            if (this.field1909 > var2) {
                var2 = this.field1909;
            }
            if (-this.field1914 > var2) {
                var2 = -this.field1914;
            }
            if (this.field1914 > var2) {
                var2 = this.field1914;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1908 = arg0;
            this.field1913 = Integer.MIN_VALUE;
            this.field1916 = -this.field1911 / arg0;
            this.field1915 = -this.field1909 / arg0;
            this.field1917 = -this.field1914 / arg0;
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V", line = 105)
    public final synchronized void method882(int arg0) {
        this.field1922 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([B[IIIIIIILel;)I", line = 109)
    private static final int method883(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class119 arg8) {
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
        arg8.field1918 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "()Z", line = 137)
    public final boolean method884() {
        return this.field1908 != 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[B[IIIIIIIILel;II)I", line = 141)
    private static final int method885(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
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
        arg11.field1918 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([III)V", line = 175)
    public final synchronized void method275(int[] arg0, int arg1, int arg2) {
        if (this.field1913 == 0 && this.field1908 == 0) {
            this.method286(arg2);
            return;
        }
        class144 var4 = (class144) this.field1214;
        int var5 = this.field1920 << 8;
        int var6 = this.field1921 << 8;
        int var7 = var4.field2263.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1922 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1918 < 0) {
            if (this.field1919 <= 0) {
                this.method901();
                this.method1701(-82);
                return;
            }
            this.field1918 = 0;
        }
        if (this.field1918 >= var7) {
            if (this.field1919 >= 0) {
                this.method901();
                this.method1701(-100);
                return;
            }
            this.field1918 = var7 - 1;
        }
        if (this.field1922 >= 0) {
            if (this.field1922 > 0) {
                if (this.field1910) {
                    label131: {
                        if (this.field1919 < 0) {
                            var9 = this.method895(arg0, arg1, var5, var10, var4.field2263[this.field1920]);
                            if (this.field1918 >= var5) {
                                return;
                            }
                            this.field1918 = var5 + var5 - this.field1918 - 1;
                            this.field1919 = -this.field1919;
                            if (--this.field1922 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method891(arg0, var9, var6, var10, var4.field2263[this.field1921 - 1]);
                            if (this.field1918 < var6) {
                                return;
                            }
                            this.field1918 = var6 + var6 - this.field1918 - 1;
                            this.field1919 = -this.field1919;
                            if (--this.field1922 == 0) {
                                break;
                            }
                            var9 = this.method895(arg0, var9, var5, var10, var4.field2263[this.field1920]);
                            if (this.field1918 >= var5) {
                                return;
                            }
                            this.field1918 = var5 + var5 - this.field1918 - 1;
                            this.field1919 = -this.field1919;
                        } while (--this.field1922 != 0);
                    }
                } else if (this.field1919 < 0) {
                    while (true) {
                        var9 = this.method895(arg0, var9, var5, var10, var4.field2263[this.field1921 - 1]);
                        if (this.field1918 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1918 - 1) / var8;
                        if (var12 >= this.field1922) {
                            this.field1918 += this.field1922 * var8;
                            this.field1922 = 0;
                            break;
                        }
                        this.field1918 += var8 * var12;
                        this.field1922 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method891(arg0, var9, var6, var10, var4.field2263[this.field1920]);
                        if (this.field1918 < var6) {
                            return;
                        }
                        int var13 = (this.field1918 - var5) / var8;
                        if (var13 >= this.field1922) {
                            this.field1918 -= this.field1922 * var8;
                            this.field1922 = 0;
                            break;
                        }
                        this.field1918 -= var8 * var13;
                        this.field1922 -= var13;
                    }
                }
            }
            if (this.field1919 < 0) {
                this.method895(arg0, var9, 0, var10, 0);
                if (this.field1918 < 0) {
                    this.field1918 = -1;
                    this.method901();
                    this.method1701(-114);
                }
            } else {
                this.method891(arg0, var9, var7, var10, 0);
                if (this.field1918 >= var7) {
                    this.field1918 = var7;
                    this.method901();
                    this.method1701(-90);
                }
            }
        } else if (this.field1910) {
            if (this.field1919 < 0) {
                var9 = this.method895(arg0, arg1, var5, var10, var4.field2263[this.field1920]);
                if (this.field1918 >= var5) {
                    return;
                }
                this.field1918 = var5 + var5 - this.field1918 - 1;
                this.field1919 = -this.field1919;
            }
            while (true) {
                int var11 = this.method891(arg0, var9, var6, var10, var4.field2263[this.field1921 - 1]);
                if (this.field1918 < var6) {
                    return;
                }
                this.field1918 = var6 + var6 - this.field1918 - 1;
                this.field1919 = -this.field1919;
                var9 = this.method895(arg0, var11, var5, var10, var4.field2263[this.field1920]);
                if (this.field1918 >= var5) {
                    return;
                }
                this.field1918 = var5 + var5 - this.field1918 - 1;
                this.field1919 = -this.field1919;
            }
        } else if (this.field1919 < 0) {
            while (true) {
                var9 = this.method895(arg0, var9, var5, var10, var4.field2263[this.field1921 - 1]);
                if (this.field1918 >= var5) {
                    return;
                }
                this.field1918 = var6 - (var6 - 1 - this.field1918) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method891(arg0, var9, var6, var10, var4.field2263[this.field1920]);
                if (this.field1918 < var6) {
                    return;
                }
                this.field1918 = (this.field1918 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II[B[IIIIIIIILel;II)I", line = 410)
    private static final int method886(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
        arg11.field1909 -= arg11.field1915 * arg5;
        arg11.field1914 -= arg11.field1917 * arg5;
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
        arg11.field1909 += arg11.field1915 * arg5;
        arg11.field1914 += arg11.field1917 * arg5;
        arg11.field1911 = arg6;
        arg11.field1918 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "()V", line = 444)
    private final void method887() {
        this.field1911 = this.field1913;
        this.field1909 = method916(this.field1913, this.field1912);
        this.field1914 = method880(this.field1913, this.field1912);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Loc;III)Lel;", line = 449)
    public static final class119 method888(class144 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2263 == null || arg0.field2263.length == 0 ? null : new class119(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "()I", line = 456)
    public final synchronized int method889() {
        return this.field1913 == Integer.MIN_VALUE ? 0 : this.field1913;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[B[IIIIIIIILel;)I", line = 460)
    private static final int method890(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10) {
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
        arg10.field1918 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()I", line = 499)
    public final int method583() {
        int var1 = this.field1911 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1922 == 0) {
            var2 -= this.field1918 * var2 / (((class144) this.field1214).field2263.length << 8);
        } else if (this.field1922 >= 0) {
            var2 -= this.field1920 * var2 / ((class144) this.field1214).field2263.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()Lvl;", line = 511)
    public final class80 method295() {
        return null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([IIIII)I", line = 515)
    private final int method891(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1908 > 0) {
                int var6 = this.field1908 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1908 += arg1;
                if (this.field1919 == 256 && (this.field1918 & 0xFF) == 0) {
                    if (class141.field2238) {
                        arg1 = method894(0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, this.field1915, this.field1917, 0, var6, arg2, this);
                    } else {
                        arg1 = method900(((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, this.field1916, 0, var6, arg2, this);
                    }
                } else if (class141.field2238) {
                    arg1 = method913(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, this.field1915, this.field1917, 0, var6, arg2, this, this.field1919, arg4);
                } else {
                    arg1 = method886(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, this.field1916, 0, var6, arg2, this, this.field1919, arg4);
                }
                this.field1908 -= arg1;
                if (this.field1908 != 0) {
                    return arg1;
                }
                if (!this.method914()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1919 == 256 && (this.field1918 & 0xFF) == 0) {
                if (class141.field2238) {
                    return method903(0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, 0, arg3, arg2, this);
                }
                return method878(((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, 0, arg3, arg2, this);
            }
            if (class141.field2238) {
                return method908(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, 0, arg3, arg2, this, this.field1919, arg4);
            }
            return method907(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, 0, arg3, arg2, this, this.field1919, arg4);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 570)
    public final synchronized void method892(boolean arg0) {
        this.field1919 = (this.field1919 >>> 31) + (this.field1919 ^ this.field1919 >> 31);
        if (arg0) {
            this.field1919 = -this.field1919;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 576)
    private final synchronized void method893(int arg0, int arg1) {
        this.field1913 = arg0;
        this.field1912 = arg1;
        this.field1908 = 0;
        this.method887();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I[B[IIIIIIIIIILel;)I", line = 583)
    private static final int method894(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class119 arg12) {
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
        arg12.field1911 += (var19 - arg4) * arg12.field1916;
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
        arg12.field1909 = var15 >> 2;
        arg12.field1914 = var16 >> 2;
        arg12.field1918 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([IIIII)I", line = 636)
    private final int method895(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1908 > 0) {
                int var6 = this.field1908 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1908 += arg1;
                if (this.field1919 == -256 && (this.field1918 & 0xFF) == 0) {
                    if (class141.field2238) {
                        arg1 = method898(0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, this.field1915, this.field1917, 0, var6, arg2, this);
                    } else {
                        arg1 = method909(((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, this.field1916, 0, var6, arg2, this);
                    }
                } else if (class141.field2238) {
                    arg1 = method911(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, this.field1915, this.field1917, 0, var6, arg2, this, this.field1919, arg4);
                } else {
                    arg1 = method912(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, this.field1916, 0, var6, arg2, this, this.field1919, arg4);
                }
                this.field1908 -= arg1;
                if (this.field1908 != 0) {
                    return arg1;
                }
                if (!this.method914()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1919 == -256 && (this.field1918 & 0xFF) == 0) {
                if (class141.field2238) {
                    return method890(0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, 0, arg3, arg2, this);
                }
                return method883(((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, 0, arg3, arg2, this);
            }
            if (class141.field2238) {
                return method885(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1909, this.field1914, 0, arg3, arg2, this, this.field1919, arg4);
            }
            return method877(0, 0, ((class144) this.field1214).field2263, arg0, this.field1918, arg1, this.field1911, 0, arg3, arg2, this, this.field1919, arg4);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Loc;II)Lel;", line = 692)
    public static final class119 method896(class144 arg0, int arg1, int arg2) {
        return arg0.field2263 == null || arg0.field2263.length == 0 ? null : new class119(arg0, (int) ((long) arg0.field2266 * 256L * (long) arg1 / (long) (class213.field3404 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V", line = 699)
    public final synchronized void method897(int arg0) {
        if (this.field1919 < 0) {
            this.field1919 = -arg0;
        } else {
            this.field1919 = arg0;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I[B[IIIIIIIIIILel;)I", line = 710)
    private static final int method898(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class119 arg12) {
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
        arg12.field1911 += (var19 - arg4) * arg12.field1916;
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
        arg12.field1909 = var15 >> 2;
        arg12.field1914 = var16 >> 2;
        arg12.field1918 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()I", line = 765)
    public final int method293() {
        return this.field1913 == 0 && this.field1908 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "()I", line = 771)
    public final synchronized int method899() {
        return this.field1912 < 0 ? -1 : this.field1912;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B[IIIIIIIILel;)I", line = 774)
    private static final int method900(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class119 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1909 += (var14 - arg3) * arg9.field1915;
        arg9.field1914 += (var14 - arg3) * arg9.field1917;
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
        arg9.field1911 = var12 >> 2;
        arg9.field1918 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "()V", line = 809)
    private final void method901() {
        if (this.field1908 == 0) {
            return;
        }
        if (this.field1913 == Integer.MIN_VALUE) {
            this.field1913 = 0;
        }
        this.field1908 = 0;
        this.method887();
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V", line = 823)
    public final synchronized void method902(int arg0, int arg1) {
        this.method915(arg0, arg1, this.method899());
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I[B[IIIIIIIILel;)I", line = 826)
    private static final int method903(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10) {
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
        arg10.field1918 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V", line = 865)
    public final synchronized void method904(int arg0) {
        int var2 = ((class144) this.field1214).field2263.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1918 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "k", descriptor = "()I", line = 877)
    public final synchronized int method905() {
        return this.field1919 < 0 ? -this.field1919 : this.field1919;
    }

    @OriginalMember(owner = "client!el", name = "i", descriptor = "(I)V", line = 881)
    private final synchronized void method906(int arg0) {
        this.method893(arg0, this.method899());
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II[B[IIIIIIILel;II)I", line = 887)
    private static final int method907(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class119 arg10, int arg11, int arg12) {
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
        arg10.field1918 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II[B[IIIIIIIILel;II)I", line = 914)
    private static final int method908(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
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
        arg11.field1918 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([B[IIIIIIIILel;)I", line = 947)
    private static final int method909(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class119 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1909 += (var14 - arg3) * arg9.field1915;
        arg9.field1914 += (var14 - arg3) * arg9.field1917;
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
        arg9.field1911 = var12 >> 2;
        arg9.field1918 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "(I)V", line = 982)
    public final synchronized void method910(int arg0) {
        this.method893(arg0 << 6, this.method899());
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[B[IIIIIIIIIILel;II)I", line = 985)
    private static final int method911(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class119 arg13, int arg14, int arg15) {
        arg13.field1911 -= arg13.field1916 * arg5;
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
        arg13.field1911 += arg13.field1916 * var26;
        arg13.field1909 = arg6;
        arg13.field1914 = arg7;
        arg13.field1918 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(II[B[IIIIIIIILel;II)I", line = 1026)
    private static final int method912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class119 arg11, int arg12, int arg13) {
        arg11.field1909 -= arg11.field1915 * arg5;
        arg11.field1914 -= arg11.field1917 * arg5;
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
        arg11.field1909 += arg11.field1915 * arg5;
        arg11.field1914 += arg11.field1917 * arg5;
        arg11.field1911 = arg6;
        arg11.field1918 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V", line = 1059)
    public final synchronized void method286(int arg0) {
        if (this.field1908 > 0) {
            if (arg0 >= this.field1908) {
                if (this.field1913 == Integer.MIN_VALUE) {
                    this.field1913 = 0;
                    this.field1911 = this.field1909 = this.field1914 = 0;
                    this.method1701(-90);
                    arg0 = this.field1908;
                }
                this.field1908 = 0;
                this.method887();
            } else {
                this.field1911 += this.field1916 * arg0;
                this.field1909 += this.field1915 * arg0;
                this.field1914 += this.field1917 * arg0;
                this.field1908 -= arg0;
            }
        }
        class144 var2 = (class144) this.field1214;
        int var3 = this.field1920 << 8;
        int var4 = this.field1921 << 8;
        int var5 = var2.field2263.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1922 = 0;
        }
        if (this.field1918 < 0) {
            if (this.field1919 <= 0) {
                this.method901();
                this.method1701(-87);
                return;
            }
            this.field1918 = 0;
        }
        if (this.field1918 >= var5) {
            if (this.field1919 >= 0) {
                this.method901();
                this.method1701(-95);
                return;
            }
            this.field1918 = var5 - 1;
        }
        this.field1918 += this.field1919 * arg0;
        if (this.field1922 >= 0) {
            if (this.field1922 > 0) {
                if (this.field1910) {
                    label121: {
                        if (this.field1919 < 0) {
                            if (this.field1918 >= var3) {
                                return;
                            }
                            this.field1918 = var3 + var3 - this.field1918 - 1;
                            this.field1919 = -this.field1919;
                            if (--this.field1922 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1918 < var4) {
                                return;
                            }
                            this.field1918 = var4 + var4 - this.field1918 - 1;
                            this.field1919 = -this.field1919;
                            if (--this.field1922 == 0) {
                                break;
                            }
                            if (this.field1918 >= var3) {
                                return;
                            }
                            this.field1918 = var3 + var3 - this.field1918 - 1;
                            this.field1919 = -this.field1919;
                        } while (--this.field1922 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1919 < 0) {
                            if (this.field1918 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1918 - 1) / var6;
                            if (var7 >= this.field1922) {
                                this.field1918 += this.field1922 * var6;
                                this.field1922 = 0;
                                break label153;
                            }
                            this.field1918 += var6 * var7;
                            this.field1922 -= var7;
                        } else if (this.field1918 >= var4) {
                            int var8 = (this.field1918 - var3) / var6;
                            if (var8 >= this.field1922) {
                                this.field1918 -= this.field1922 * var6;
                                this.field1922 = 0;
                                break label153;
                            }
                            this.field1918 -= var6 * var8;
                            this.field1922 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1919 < 0) {
                if (this.field1918 < 0) {
                    this.field1918 = -1;
                    this.method901();
                    this.method1701(-79);
                }
            } else if (this.field1918 >= var5) {
                this.field1918 = var5;
                this.method901();
                this.method1701(-109);
            }
        } else if (this.field1910) {
            if (this.field1919 < 0) {
                if (this.field1918 >= var3) {
                    return;
                }
                this.field1918 = var3 + var3 - this.field1918 - 1;
                this.field1919 = -this.field1919;
            }
            while (this.field1918 >= var4) {
                this.field1918 = var4 + var4 - this.field1918 - 1;
                this.field1919 = -this.field1919;
                if (this.field1918 >= var3) {
                    return;
                }
                this.field1918 = var3 + var3 - this.field1918 - 1;
                this.field1919 = -this.field1919;
            }
        } else if (this.field1919 < 0) {
            if (this.field1918 >= var3) {
                return;
            }
            this.field1918 = var4 - (var4 - 1 - this.field1918) % var6 - 1;
        } else if (this.field1918 >= var4) {
            this.field1918 = (this.field1918 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II[B[IIIIIIIIIILel;II)I", line = 1278)
    private static final int method913(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class119 arg13, int arg14, int arg15) {
        arg13.field1911 -= arg13.field1916 * arg5;
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
        arg13.field1911 += arg13.field1916 * var27;
        arg13.field1909 = arg6;
        arg13.field1914 = arg7;
        arg13.field1918 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!el", name = "l", descriptor = "()Z", line = 1321)
    private final boolean method914() {
        int var1 = this.field1913;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method916(var1, this.field1912);
            var2 = method880(var1, this.field1912);
        }
        if (this.field1911 != var1 || this.field1909 != var3 || this.field1914 != var2) {
            if (this.field1911 < var1) {
                this.field1916 = 1;
                this.field1908 = var1 - this.field1911;
            } else if (this.field1911 > var1) {
                this.field1916 = -1;
                this.field1908 = this.field1911 - var1;
            } else {
                this.field1916 = 0;
            }
            if (this.field1909 < var3) {
                this.field1915 = 1;
                if (this.field1908 == 0 || this.field1908 > var3 - this.field1909) {
                    this.field1908 = var3 - this.field1909;
                }
            } else if (this.field1909 > var3) {
                this.field1915 = -1;
                if (this.field1908 == 0 || this.field1908 > this.field1909 - var3) {
                    this.field1908 = this.field1909 - var3;
                }
            } else {
                this.field1915 = 0;
            }
            if (this.field1914 < var2) {
                this.field1917 = 1;
                if (this.field1908 == 0 || this.field1908 > var2 - this.field1914) {
                    this.field1908 = var2 - this.field1914;
                }
            } else if (this.field1914 > var2) {
                this.field1917 = -1;
                if (this.field1908 == 0 || this.field1908 > this.field1914 - var2) {
                    this.field1908 = this.field1914 - var2;
                }
            } else {
                this.field1917 = 0;
            }
            return false;
        } else if (this.field1913 == Integer.MIN_VALUE) {
            this.field1913 = 0;
            this.field1911 = this.field1909 = this.field1914 = 0;
            this.method1701(-123);
            return true;
        } else {
            this.method887();
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V", line = 1406)
    public final synchronized void method915(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method893(arg1, arg2);
            return;
        }
        int var4 = method916(arg1, arg2);
        int var5 = method880(arg1, arg2);
        if (this.field1909 == var4 && this.field1914 == var5) {
            this.field1908 = 0;
            return;
        }
        int var6 = arg1 - this.field1911;
        if (this.field1911 - arg1 > var6) {
            var6 = this.field1911 - arg1;
        }
        if (var4 - this.field1909 > var6) {
            var6 = var4 - this.field1909;
        }
        if (this.field1909 - var4 > var6) {
            var6 = this.field1909 - var4;
        }
        if (var5 - this.field1914 > var6) {
            var6 = var5 - this.field1914;
        }
        if (this.field1914 - var5 > var6) {
            var6 = this.field1914 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1908 = arg0;
        this.field1913 = arg1;
        this.field1912 = arg2;
        this.field1916 = (arg1 - this.field1911) / arg0;
        this.field1915 = (var4 - this.field1909) / arg0;
        this.field1917 = (var5 - this.field1914) / arg0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()Lvl;", line = 1452)
    public final class80 method294() {
        return null;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(II)I", line = 1455)
    private static final int method916(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Loc;II)V", line = 1458)
    private class119(class144 arg0, int arg1, int arg2) {
        this.field1214 = arg0;
        this.field1920 = arg0.field2264;
        this.field1921 = arg0.field2262;
        this.field1910 = arg0.field2265;
        this.field1919 = arg1;
        this.field1913 = arg2;
        this.field1912 = 8192;
        this.field1918 = 0;
        this.method887();
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Loc;III)V", line = 1469)
    private class119(class144 arg0, int arg1, int arg2, int arg3) {
        this.field1214 = arg0;
        this.field1920 = arg0.field2264;
        this.field1921 = arg0.field2262;
        this.field1910 = arg0.field2265;
        this.field1919 = arg1;
        this.field1913 = arg2;
        this.field1912 = arg3;
        this.field1918 = 0;
        this.method887();
    }
}
