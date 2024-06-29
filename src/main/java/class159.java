import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class159 extends class283 {

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    private int field1884;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Z")
    private boolean field1882;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    private int field1881;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "()I")
    public final synchronized int method917() {
        return this.field1881 < 0 ? -this.field1881 : this.field1881;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public final synchronized void method918(boolean arg0) {
        this.field1881 = (this.field1881 >>> 31) + (this.field1881 ^ this.field1881 >> 31);
        if (arg0) {
            this.field1881 = -this.field1881;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final synchronized void method639(int arg0) {
        if (this.field1883 > 0) {
            if (arg0 >= this.field1883) {
                if (this.field1880 == Integer.MIN_VALUE) {
                    this.field1880 = 0;
                    this.field1876 = this.field1879 = this.field1885 = 0;
                    this.method1519((byte) 121);
                    arg0 = this.field1883;
                }
                this.field1883 = 0;
                this.method944();
            } else {
                this.field1876 += this.field1890 * arg0;
                this.field1879 += this.field1889 * arg0;
                this.field1885 += this.field1878 * arg0;
                this.field1883 -= arg0;
            }
        }
        class298 var2 = (class298) super.field3597;
        int var3 = this.field1887 << 8;
        int var4 = this.field1884 << 8;
        int var5 = var2.field3910.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1888 = 0;
        }
        if (this.field1886 < 0) {
            if (this.field1881 <= 0) {
                this.method930();
                this.method1519((byte) 121);
                return;
            }
            this.field1886 = 0;
        }
        if (this.field1886 >= var5) {
            if (this.field1881 >= 0) {
                this.method930();
                this.method1519((byte) 121);
                return;
            }
            this.field1886 = var5 - 1;
        }
        this.field1886 += this.field1881 * arg0;
        if (this.field1888 < 0) {
            if (!this.field1882) {
                if (this.field1881 < 0) {
                    if (this.field1886 < var3) {
                        this.field1886 = var4 - 1 - (var4 - 1 - this.field1886) % var6;
                    }
                } else if (this.field1886 >= var4) {
                    this.field1886 = (this.field1886 - var3) % var6 + var3;
                }
            } else {
                if (this.field1881 < 0) {
                    if (this.field1886 >= var3) {
                        return;
                    }
                    this.field1886 = var3 + var3 - 1 - this.field1886;
                    this.field1881 = -this.field1881;
                }
                while (this.field1886 >= var4) {
                    this.field1886 = var4 + var4 - 1 - this.field1886;
                    this.field1881 = -this.field1881;
                    if (this.field1886 >= var3) {
                        return;
                    }
                    this.field1886 = var3 + var3 - 1 - this.field1886;
                    this.field1881 = -this.field1881;
                }
            }
        } else {
            if (this.field1888 > 0) {
                if (this.field1882) {
                    label125: {
                        if (this.field1881 < 0) {
                            if (this.field1886 >= var3) {
                                return;
                            }
                            this.field1886 = var3 + var3 - 1 - this.field1886;
                            this.field1881 = -this.field1881;
                            if (--this.field1888 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1886 < var4) {
                                return;
                            }
                            this.field1886 = var4 + var4 - 1 - this.field1886;
                            this.field1881 = -this.field1881;
                            if (--this.field1888 == 0) {
                                break;
                            }
                            if (this.field1886 >= var3) {
                                return;
                            }
                            this.field1886 = var3 + var3 - 1 - this.field1886;
                            this.field1881 = -this.field1881;
                        } while (--this.field1888 != 0);
                    }
                } else if (this.field1881 < 0) {
                    if (this.field1886 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1886) / var6;
                    if (var7 < this.field1888) {
                        this.field1886 += var6 * var7;
                        this.field1888 -= var7;
                        return;
                    }
                    this.field1886 += this.field1888 * var6;
                    this.field1888 = 0;
                } else {
                    if (this.field1886 < var4) {
                        return;
                    }
                    int var8 = (this.field1886 - var3) / var6;
                    if (var8 < this.field1888) {
                        this.field1886 -= var6 * var8;
                        this.field1888 -= var8;
                        return;
                    }
                    this.field1886 -= this.field1888 * var6;
                    this.field1888 = 0;
                }
            }
            if (this.field1881 < 0) {
                if (this.field1886 < 0) {
                    this.field1886 = -1;
                    this.method930();
                    this.method1519((byte) 121);
                    return;
                }
            } else if (this.field1886 >= var5) {
                this.field1886 = var5;
                this.method930();
                this.method1519((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "()I")
    public final synchronized int method919() {
        return this.field1880 == Integer.MIN_VALUE ? 0 : this.field1880;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
    private static final int method920(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public final int method671() {
        return this.field1880 == 0 && this.field1883 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIIII)I")
    private final int method921(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1883 <= 0) {
                if (this.field1881 == -256 && (this.field1886 & 255) == 0) {
                    if (class81.field856) {
                        return method956(0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, 0, arg3, arg2, this);
                    }
                    return method952(((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, 0, arg3, arg2, this);
                }
                if (class81.field856) {
                    return method943(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, 0, arg3, arg2, this, this.field1881, arg4);
                }
                return method931(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, 0, arg3, arg2, this, this.field1881, arg4);
            }
            int var6 = this.field1883 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1883 += arg1;
            if (this.field1881 == -256 && (this.field1886 & 255) == 0) {
                if (class81.field856) {
                    arg1 = method923(0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, this.field1889, this.field1878, 0, var6, arg2, this);
                } else {
                    arg1 = method932(((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, this.field1890, 0, var6, arg2, this);
                }
            } else if (class81.field856) {
                arg1 = method957(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, this.field1889, this.field1878, 0, var6, arg2, this, this.field1881, arg4);
            } else {
                arg1 = method954(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, this.field1890, 0, var6, arg2, this, this.field1881, arg4);
            }
            this.field1883 -= arg1;
            if (this.field1883 != 0) {
                return arg1;
            }
        } while (!this.method955());
        return arg3;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "([IIIII)I")
    private final int method922(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1883 <= 0) {
                if (this.field1881 == 256 && (this.field1886 & 255) == 0) {
                    if (class81.field856) {
                        return method933(0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, 0, arg3, arg2, this);
                    }
                    return method940(((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, 0, arg3, arg2, this);
                }
                if (class81.field856) {
                    return method950(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, 0, arg3, arg2, this, this.field1881, arg4);
                }
                return method936(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, 0, arg3, arg2, this, this.field1881, arg4);
            }
            int var6 = this.field1883 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1883 += arg1;
            if (this.field1881 == 256 && (this.field1886 & 255) == 0) {
                if (class81.field856) {
                    arg1 = method939(0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, this.field1889, this.field1878, 0, var6, arg2, this);
                } else {
                    arg1 = method949(((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, this.field1890, 0, var6, arg2, this);
                }
            } else if (class81.field856) {
                arg1 = method924(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1879, this.field1885, this.field1889, this.field1878, 0, var6, arg2, this, this.field1881, arg4);
            } else {
                arg1 = method938(0, 0, ((class298) super.field3597).field3910, arg0, this.field1886, arg1, this.field1876, this.field1890, 0, var6, arg2, this, this.field1881, arg4);
            }
            this.field1883 -= arg1;
            if (this.field1883 != 0) {
                return arg1;
            }
        } while (!this.method955());
        return arg3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[B[IIIIIIIIIILgg;)I")
    private static final int method923(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class159 arg12) {
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
        arg12.field1876 += (var19 - arg4) * arg12.field1890;
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
        arg12.field1879 = var15 >> 2;
        arg12.field1885 = var16 >> 2;
        arg12.field1886 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()Lcd;")
    public final class283 method651() {
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[B[IIIIIIIIIILgg;II)I")
    private static final int method924(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class159 arg13, int arg14, int arg15) {
        arg13.field1876 -= arg13.field1890 * arg5;
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
        arg13.field1876 += arg13.field1890 * var22;
        arg13.field1879 = arg6;
        arg13.field1885 = arg7;
        arg13.field1886 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "()Z")
    public final boolean method925() {
        return this.field1886 < 0 || this.field1886 >= ((class298) super.field3597).field3910.length << 8;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
    public final synchronized void method926(int arg0, int arg1) {
        this.method948(arg0, arg1, this.method953());
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "()Z")
    public final boolean method927() {
        return this.field1883 != 0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lwb;II)Lgg;")
    public static final class159 method928(class298 arg0, int arg1, int arg2) {
        return arg0.field3910 != null && arg0.field3910.length != 0 ? new class159(arg0, (int) ((long) arg0.field3912 * 256L * (long) arg1 / (long) (class519.field7413 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final synchronized void method929(int arg0) {
        int var2 = ((class298) super.field3597).field3910.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1886 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "()V")
    private final void method930() {
        if (this.field1883 != 0) {
            if (this.field1880 == Integer.MIN_VALUE) {
                this.field1880 = 0;
            }
            this.field1883 = 0;
            this.method944();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[B[IIIIIIILgg;II)I")
    private static final int method931(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class159 arg10, int arg11, int arg12) {
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
        arg10.field1886 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([B[IIIIIIIILgg;)I")
    private static final int method932(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class159 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1879 += (var14 - arg3) * arg9.field1889;
        arg9.field1885 += (var14 - arg3) * arg9.field1878;
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
        arg9.field1876 = var12 >> 2;
        arg9.field1886 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[B[IIIIIIIILgg;)I")
    private static final int method933(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class159 arg10) {
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
        arg10.field1886 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "([III)V")
    public final synchronized void method657(int[] arg0, int arg1, int arg2) {
        if (this.field1880 == 0 && this.field1883 == 0) {
            this.method639(arg2);
        } else {
            class298 var4 = (class298) super.field3597;
            int var5 = this.field1887 << 8;
            int var6 = this.field1884 << 8;
            int var7 = var4.field3910.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1888 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1886 < 0) {
                if (this.field1881 <= 0) {
                    this.method930();
                    this.method1519((byte) 121);
                    return;
                }
                this.field1886 = 0;
            }
            if (this.field1886 >= var7) {
                if (this.field1881 >= 0) {
                    this.method930();
                    this.method1519((byte) 121);
                    return;
                }
                this.field1886 = var7 - 1;
            }
            if (this.field1888 < 0) {
                if (this.field1882) {
                    if (this.field1881 < 0) {
                        var9 = this.method921(arg0, arg1, var5, var10, var4.field3910[this.field1887]);
                        if (this.field1886 >= var5) {
                            return;
                        }
                        this.field1886 = var5 + var5 - 1 - this.field1886;
                        this.field1881 = -this.field1881;
                    }
                    while (true) {
                        int var11 = this.method922(arg0, var9, var6, var10, var4.field3910[this.field1884 - 1]);
                        if (this.field1886 < var6) {
                            return;
                        }
                        this.field1886 = var6 + var6 - 1 - this.field1886;
                        this.field1881 = -this.field1881;
                        var9 = this.method921(arg0, var11, var5, var10, var4.field3910[this.field1887]);
                        if (this.field1886 >= var5) {
                            return;
                        }
                        this.field1886 = var5 + var5 - 1 - this.field1886;
                        this.field1881 = -this.field1881;
                    }
                } else if (this.field1881 < 0) {
                    while (true) {
                        var9 = this.method921(arg0, var9, var5, var10, var4.field3910[this.field1884 - 1]);
                        if (this.field1886 >= var5) {
                            return;
                        }
                        this.field1886 = var6 - 1 - (var6 - 1 - this.field1886) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method922(arg0, var9, var6, var10, var4.field3910[this.field1887]);
                        if (this.field1886 < var6) {
                            return;
                        }
                        this.field1886 = (this.field1886 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1888 > 0) {
                    if (this.field1882) {
                        label130: {
                            if (this.field1881 < 0) {
                                var9 = this.method921(arg0, arg1, var5, var10, var4.field3910[this.field1887]);
                                if (this.field1886 >= var5) {
                                    return;
                                }
                                this.field1886 = var5 + var5 - 1 - this.field1886;
                                this.field1881 = -this.field1881;
                                if (--this.field1888 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method922(arg0, var9, var6, var10, var4.field3910[this.field1884 - 1]);
                                if (this.field1886 < var6) {
                                    return;
                                }
                                this.field1886 = var6 + var6 - 1 - this.field1886;
                                this.field1881 = -this.field1881;
                                if (--this.field1888 == 0) {
                                    break;
                                }
                                var9 = this.method921(arg0, var9, var5, var10, var4.field3910[this.field1887]);
                                if (this.field1886 >= var5) {
                                    return;
                                }
                                this.field1886 = var5 + var5 - 1 - this.field1886;
                                this.field1881 = -this.field1881;
                            } while (--this.field1888 != 0);
                        }
                    } else if (this.field1881 < 0) {
                        while (true) {
                            var9 = this.method921(arg0, var9, var5, var10, var4.field3910[this.field1884 - 1]);
                            if (this.field1886 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1886) / var8;
                            if (var12 >= this.field1888) {
                                this.field1886 += this.field1888 * var8;
                                this.field1888 = 0;
                                break;
                            }
                            this.field1886 += var8 * var12;
                            this.field1888 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method922(arg0, var9, var6, var10, var4.field3910[this.field1887]);
                            if (this.field1886 < var6) {
                                return;
                            }
                            int var13 = (this.field1886 - var5) / var8;
                            if (var13 >= this.field1888) {
                                this.field1886 -= this.field1888 * var8;
                                this.field1888 = 0;
                                break;
                            }
                            this.field1886 -= var8 * var13;
                            this.field1888 -= var13;
                        }
                    }
                }
                if (this.field1881 < 0) {
                    this.method921(arg0, var9, 0, var10, 0);
                    if (this.field1886 < 0) {
                        this.field1886 = -1;
                        this.method930();
                        this.method1519((byte) 121);
                        return;
                    }
                } else {
                    this.method922(arg0, var9, var7, var10, 0);
                    if (this.field1886 >= var7) {
                        this.field1886 = var7;
                        this.method930();
                        this.method1519((byte) 121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public final synchronized void method934(int arg0) {
        if (arg0 == 0) {
            this.method947(0);
            this.method1519((byte) 121);
        } else if (this.field1879 == 0 && this.field1885 == 0) {
            this.field1883 = 0;
            this.field1880 = 0;
            this.field1876 = 0;
            this.method1519((byte) 121);
        } else {
            int var2 = -this.field1876;
            if (this.field1876 > var2) {
                var2 = this.field1876;
            }
            if (-this.field1879 > var2) {
                var2 = -this.field1879;
            }
            if (this.field1879 > var2) {
                var2 = this.field1879;
            }
            if (-this.field1885 > var2) {
                var2 = -this.field1885;
            }
            if (this.field1885 > var2) {
                var2 = this.field1885;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1883 = arg0;
            this.field1880 = Integer.MIN_VALUE;
            this.field1890 = -this.field1876 / arg0;
            this.field1889 = -this.field1879 / arg0;
            this.field1878 = -this.field1885 / arg0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()I")
    public final int method935() {
        int var1 = this.field1876 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1888 == 0) {
            var2 -= this.field1886 * var2 / (((class298) super.field3597).field3910.length << 8);
        } else if (this.field1888 >= 0) {
            var2 -= this.field1887 * var2 / ((class298) super.field3597).field3910.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II[B[IIIIIIILgg;II)I")
    private static final int method936(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class159 arg10, int arg11, int arg12) {
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
        arg10.field1886 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
    private final synchronized void method937(int arg0, int arg1) {
        this.field1880 = arg0;
        this.field1877 = arg1;
        this.field1883 = 0;
        this.method944();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[B[IIIIIIIILgg;II)I")
    private static final int method938(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class159 arg11, int arg12, int arg13) {
        arg11.field1879 -= arg11.field1889 * arg5;
        arg11.field1885 -= arg11.field1878 * arg5;
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
        arg11.field1879 += arg11.field1889 * arg5;
        arg11.field1885 += arg11.field1878 * arg5;
        arg11.field1876 = arg6;
        arg11.field1886 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I[B[IIIIIIIIIILgg;)I")
    private static final int method939(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class159 arg12) {
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
        arg12.field1876 += (var19 - arg4) * arg12.field1890;
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
        arg12.field1879 = var15 >> 2;
        arg12.field1885 = var16 >> 2;
        arg12.field1886 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([B[IIIIIIILgg;)I")
    private static final int method940(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class159 arg8) {
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
        arg8.field1886 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "()Lcd;")
    public final class283 method650() {
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
    public final synchronized void method941(int arg0) {
        this.field1888 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)V")
    public final synchronized void method942(int arg0) {
        this.method937(arg0 << 6, this.method953());
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II[B[IIIIIIIILgg;II)I")
    private static final int method943(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class159 arg11, int arg12, int arg13) {
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
        arg11.field1886 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "()V")
    private final void method944() {
        this.field1876 = this.field1880;
        this.field1879 = method920(this.field1880, this.field1877);
        this.field1885 = method946(this.field1880, this.field1877);
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
    public final synchronized void method945(int arg0) {
        if (this.field1881 < 0) {
            this.field1881 = -arg0;
        } else {
            this.field1881 = arg0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)I")
    private static final int method946(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "(I)V")
    private final synchronized void method947(int arg0) {
        this.method937(arg0, this.method953());
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
    public final synchronized void method948(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method937(arg1, arg2);
        } else {
            int var4 = method920(arg1, arg2);
            int var5 = method946(arg1, arg2);
            if (this.field1879 == var4 && this.field1885 == var5) {
                this.field1883 = 0;
            } else {
                int var6 = arg1 - this.field1876;
                if (this.field1876 - arg1 > var6) {
                    var6 = this.field1876 - arg1;
                }
                if (var4 - this.field1879 > var6) {
                    var6 = var4 - this.field1879;
                }
                if (this.field1879 - var4 > var6) {
                    var6 = this.field1879 - var4;
                }
                if (var5 - this.field1885 > var6) {
                    var6 = var5 - this.field1885;
                }
                if (this.field1885 - var5 > var6) {
                    var6 = this.field1885 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1883 = arg0;
                this.field1880 = arg1;
                this.field1877 = arg2;
                this.field1890 = (arg1 - this.field1876) / arg0;
                this.field1889 = (var4 - this.field1879) / arg0;
                this.field1878 = (var5 - this.field1885) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "([B[IIIIIIIILgg;)I")
    private static final int method949(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class159 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1879 += (var14 - arg3) * arg9.field1889;
        arg9.field1885 += (var14 - arg3) * arg9.field1878;
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
        arg9.field1876 = var12 >> 2;
        arg9.field1886 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(II[B[IIIIIIIILgg;II)I")
    private static final int method950(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class159 arg11, int arg12, int arg13) {
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
        arg11.field1886 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lwb;III)Lgg;")
    public static final class159 method951(class298 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3910 != null && arg0.field3910.length != 0 ? new class159(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "([B[IIIIIIILgg;)I")
    private static final int method952(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class159 arg8) {
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
        arg8.field1886 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "()I")
    public final synchronized int method953() {
        return this.field1877 < 0 ? -1 : this.field1877;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(II[B[IIIIIIIILgg;II)I")
    private static final int method954(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class159 arg11, int arg12, int arg13) {
        arg11.field1879 -= arg11.field1889 * arg5;
        arg11.field1885 -= arg11.field1878 * arg5;
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
        arg11.field1879 += arg11.field1889 * arg5;
        arg11.field1885 += arg11.field1878 * arg5;
        arg11.field1876 = arg6;
        arg11.field1886 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "()Z")
    private final boolean method955() {
        int var1 = this.field1880;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method920(var1, this.field1877);
            var2 = method946(var1, this.field1877);
        }
        if (this.field1876 == var1 && this.field1879 == var3 && this.field1885 == var2) {
            if (this.field1880 == Integer.MIN_VALUE) {
                this.field1880 = 0;
                this.field1876 = this.field1879 = this.field1885 = 0;
                this.method1519((byte) 121);
                return true;
            } else {
                this.method944();
                return false;
            }
        } else {
            if (this.field1876 < var1) {
                this.field1890 = 1;
                this.field1883 = var1 - this.field1876;
            } else if (this.field1876 > var1) {
                this.field1890 = -1;
                this.field1883 = this.field1876 - var1;
            } else {
                this.field1890 = 0;
            }
            if (this.field1879 < var3) {
                this.field1889 = 1;
                if (this.field1883 == 0 || this.field1883 > var3 - this.field1879) {
                    this.field1883 = var3 - this.field1879;
                }
            } else if (this.field1879 > var3) {
                this.field1889 = -1;
                if (this.field1883 == 0 || this.field1883 > this.field1879 - var3) {
                    this.field1883 = this.field1879 - var3;
                }
            } else {
                this.field1889 = 0;
            }
            if (this.field1885 < var2) {
                this.field1878 = 1;
                if (this.field1883 == 0 || this.field1883 > var2 - this.field1885) {
                    this.field1883 = var2 - this.field1885;
                }
            } else if (this.field1885 > var2) {
                this.field1878 = -1;
                if (this.field1883 == 0 || this.field1883 > this.field1885 - var2) {
                    this.field1883 = this.field1885 - var2;
                }
            } else {
                this.field1878 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I[B[IIIIIIIILgg;)I")
    private static final int method956(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class159 arg10) {
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
        arg10.field1886 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lwb;II)V")
    private class159(class298 arg0, int arg1, int arg2) {
        super.field3597 = arg0;
        this.field1887 = arg0.field3909;
        this.field1884 = arg0.field3913;
        this.field1882 = arg0.field3911;
        this.field1881 = arg1;
        this.field1880 = arg2;
        this.field1877 = 8192;
        this.field1886 = 0;
        this.method944();
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II[B[IIIIIIIIIILgg;II)I")
    private static final int method957(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class159 arg13, int arg14, int arg15) {
        arg13.field1876 -= arg13.field1890 * arg5;
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
        arg13.field1876 += arg13.field1890 * var22;
        arg13.field1879 = arg6;
        arg13.field1885 = arg7;
        arg13.field1886 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lwb;III)V")
    private class159(class298 arg0, int arg1, int arg2, int arg3) {
        super.field3597 = arg0;
        this.field1887 = arg0.field3909;
        this.field1884 = arg0.field3913;
        this.field1882 = arg0.field3911;
        this.field1881 = arg1;
        this.field1880 = arg2;
        this.field1877 = arg3;
        this.field1886 = 0;
        this.method944();
    }
}
