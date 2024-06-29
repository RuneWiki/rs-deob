import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class116 extends class202 {

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Z")
    private boolean field1912;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    private int field1910;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([IIIII)I")
    private final int method735(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1921 <= 0) {
                if (this.field1913 == -256 && (this.field1914 & 255) == 0) {
                    if (class85.field1399) {
                        return method742(0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, 0, arg3, arg2, this);
                    }
                    return method759(((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, 0, arg3, arg2, this);
                }
                if (class85.field1399) {
                    return method775(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, 0, arg3, arg2, this, this.field1913, arg4);
                }
                return method755(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, 0, arg3, arg2, this, this.field1913, arg4);
            }
            int var6 = this.field1921 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1921 += arg1;
            if (this.field1913 == -256 && (this.field1914 & 255) == 0) {
                if (class85.field1399) {
                    arg1 = method764(0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, this.field1918, this.field1916, 0, var6, arg2, this);
                } else {
                    arg1 = method773(((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, this.field1911, 0, var6, arg2, this);
                }
            } else if (class85.field1399) {
                arg1 = method765(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, this.field1918, this.field1916, 0, var6, arg2, this, this.field1913, arg4);
            } else {
                arg1 = method760(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, this.field1911, 0, var6, arg2, this, this.field1913, arg4);
            }
            this.field1921 -= arg1;
            if (this.field1921 != 0) {
                return arg1;
            }
        } while (!this.method758());
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    private final synchronized void method736(int arg0, int arg1) {
        this.field1923 = arg0;
        this.field1920 = arg1;
        this.field1921 = 0;
        this.method751();
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I")
    private static final int method737(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B[IIIIIIIILbb;)I")
    private static final int method738(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1914 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([IIIII)I")
    private final int method739(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1921 <= 0) {
                if (this.field1913 == 256 && (this.field1914 & 255) == 0) {
                    if (class85.field1399) {
                        return method738(0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, 0, arg3, arg2, this);
                    }
                    return method748(((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, 0, arg3, arg2, this);
                }
                if (class85.field1399) {
                    return method768(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, 0, arg3, arg2, this, this.field1913, arg4);
                }
                return method747(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, 0, arg3, arg2, this, this.field1913, arg4);
            }
            int var6 = this.field1921 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1921 += arg1;
            if (this.field1913 == 256 && (this.field1914 & 255) == 0) {
                if (class85.field1399) {
                    arg1 = method740(0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, this.field1918, this.field1916, 0, var6, arg2, this);
                } else {
                    arg1 = method752(((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, this.field1911, 0, var6, arg2, this);
                }
            } else if (class85.field1399) {
                arg1 = method766(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1910, this.field1915, this.field1918, this.field1916, 0, var6, arg2, this, this.field1913, arg4);
            } else {
                arg1 = method756(0, 0, ((class103) super.field3615).field1698, arg0, this.field1914, arg1, this.field1917, this.field1911, 0, var6, arg2, this, this.field1913, arg4);
            }
            this.field1921 -= arg1;
            if (this.field1921 != 0) {
                return arg1;
            }
        } while (!this.method758());
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([III)V")
    public final synchronized void method503(int[] arg0, int arg1, int arg2) {
        if (this.field1923 == 0 && this.field1921 == 0) {
            this.method510(arg2);
        } else {
            class103 var4 = (class103) super.field3615;
            int var5 = this.field1922 << 8;
            int var6 = this.field1924 << 8;
            int var7 = var4.field1698.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1919 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1914 < 0) {
                if (this.field1913 <= 0) {
                    this.method750();
                    this.method655(63);
                    return;
                }
                this.field1914 = 0;
            }
            if (this.field1914 >= var7) {
                if (this.field1913 >= 0) {
                    this.method750();
                    this.method655(63);
                    return;
                }
                this.field1914 = var7 - 1;
            }
            if (this.field1919 < 0) {
                if (this.field1912) {
                    if (this.field1913 < 0) {
                        var9 = this.method735(arg0, arg1, var5, var10, var4.field1698[this.field1922]);
                        if (this.field1914 >= var5) {
                            return;
                        }
                        this.field1914 = var5 + var5 - 1 - this.field1914;
                        this.field1913 = -this.field1913;
                    }
                    while (true) {
                        int var11 = this.method739(arg0, var9, var6, var10, var4.field1698[this.field1924 - 1]);
                        if (this.field1914 < var6) {
                            return;
                        }
                        this.field1914 = var6 + var6 - 1 - this.field1914;
                        this.field1913 = -this.field1913;
                        var9 = this.method735(arg0, var11, var5, var10, var4.field1698[this.field1922]);
                        if (this.field1914 >= var5) {
                            return;
                        }
                        this.field1914 = var5 + var5 - 1 - this.field1914;
                        this.field1913 = -this.field1913;
                    }
                } else if (this.field1913 < 0) {
                    while (true) {
                        var9 = this.method735(arg0, var9, var5, var10, var4.field1698[this.field1924 - 1]);
                        if (this.field1914 >= var5) {
                            return;
                        }
                        this.field1914 = var6 - 1 - (var6 - 1 - this.field1914) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method739(arg0, var9, var6, var10, var4.field1698[this.field1922]);
                        if (this.field1914 < var6) {
                            return;
                        }
                        this.field1914 = (this.field1914 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1919 > 0) {
                    if (this.field1912) {
                        label130: {
                            if (this.field1913 < 0) {
                                var9 = this.method735(arg0, arg1, var5, var10, var4.field1698[this.field1922]);
                                if (this.field1914 >= var5) {
                                    return;
                                }
                                this.field1914 = var5 + var5 - 1 - this.field1914;
                                this.field1913 = -this.field1913;
                                if (--this.field1919 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method739(arg0, var9, var6, var10, var4.field1698[this.field1924 - 1]);
                                if (this.field1914 < var6) {
                                    return;
                                }
                                this.field1914 = var6 + var6 - 1 - this.field1914;
                                this.field1913 = -this.field1913;
                                if (--this.field1919 == 0) {
                                    break;
                                }
                                var9 = this.method735(arg0, var9, var5, var10, var4.field1698[this.field1922]);
                                if (this.field1914 >= var5) {
                                    return;
                                }
                                this.field1914 = var5 + var5 - 1 - this.field1914;
                                this.field1913 = -this.field1913;
                            } while (--this.field1919 != 0);
                        }
                    } else if (this.field1913 < 0) {
                        while (true) {
                            var9 = this.method735(arg0, var9, var5, var10, var4.field1698[this.field1924 - 1]);
                            if (this.field1914 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1914) / var8;
                            if (var12 >= this.field1919) {
                                this.field1914 += this.field1919 * var8;
                                this.field1919 = 0;
                                break;
                            }
                            this.field1914 += var8 * var12;
                            this.field1919 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method739(arg0, var9, var6, var10, var4.field1698[this.field1922]);
                            if (this.field1914 < var6) {
                                return;
                            }
                            int var13 = (this.field1914 - var5) / var8;
                            if (var13 >= this.field1919) {
                                this.field1914 -= this.field1919 * var8;
                                this.field1919 = 0;
                                break;
                            }
                            this.field1914 -= var8 * var13;
                            this.field1919 -= var13;
                        }
                    }
                }
                if (this.field1913 < 0) {
                    this.method735(arg0, var9, 0, var10, 0);
                    if (this.field1914 < 0) {
                        this.field1914 = -1;
                        this.method750();
                        this.method655(63);
                        return;
                    }
                } else {
                    this.method739(arg0, var9, var7, var10, 0);
                    if (this.field1914 >= var7) {
                        this.field1914 = var7;
                        this.method750();
                        this.method655(63);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B[IIIIIIIIIILbb;)I")
    private static final int method740(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1917 += (var19 - arg4) * arg12.field1911;
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
        arg12.field1910 = var15 >> 2;
        arg12.field1915 = var16 >> 2;
        arg12.field1914 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public final synchronized void method741(int arg0) {
        if (arg0 == 0) {
            this.method762(0);
            this.method655(63);
        } else if (this.field1910 == 0 && this.field1915 == 0) {
            this.field1921 = 0;
            this.field1923 = 0;
            this.field1917 = 0;
            this.method655(63);
        } else {
            int var2 = -this.field1917;
            if (this.field1917 > var2) {
                var2 = this.field1917;
            }
            if (-this.field1910 > var2) {
                var2 = -this.field1910;
            }
            if (this.field1910 > var2) {
                var2 = this.field1910;
            }
            if (-this.field1915 > var2) {
                var2 = -this.field1915;
            }
            if (this.field1915 > var2) {
                var2 = this.field1915;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1921 = arg0;
            this.field1923 = Integer.MIN_VALUE;
            this.field1911 = -this.field1917 / arg0;
            this.field1918 = -this.field1910 / arg0;
            this.field1916 = -this.field1915 / arg0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I[B[IIIIIIIILbb;)I")
    private static final int method742(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1914 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
    public final synchronized void method743(int arg0) {
        int var2 = ((class103) super.field3615).field1698.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1914 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()Z")
    public final boolean method744() {
        return this.field1921 != 0;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "()I")
    public final synchronized int method745() {
        return this.field1913 < 0 ? -this.field1913 : this.field1913;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
    public final synchronized void method746(int arg0) {
        if (this.field1913 < 0) {
            this.field1913 = -arg0;
        } else {
            this.field1913 = arg0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[B[IIIIIIILbb;II)I")
    private static final int method747(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B[IIIIIIILbb;)I")
    private static final int method748(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1914 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "()I")
    public final synchronized int method749() {
        return this.field1920 < 0 ? -1 : this.field1920;
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "()V")
    private final void method750() {
        if (this.field1921 != 0) {
            if (this.field1923 == Integer.MIN_VALUE) {
                this.field1923 = 0;
            }
            this.field1921 = 0;
            this.method751();
        }
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "()V")
    private final void method751() {
        this.field1917 = this.field1923;
        this.field1910 = method772(this.field1923, this.field1920);
        this.field1915 = method737(this.field1923, this.field1920);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B[IIIIIIIILbb;)I")
    private static final int method752(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1910 += (var14 - arg3) * arg9.field1918;
        arg9.field1915 += (var14 - arg3) * arg9.field1916;
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
        arg9.field1917 = var12 >> 2;
        arg9.field1914 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
    public final int method501() {
        return this.field1923 == 0 && this.field1921 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
    public final synchronized void method753(int arg0) {
        this.method736(arg0 << 6, this.method749());
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ltf;II)Lbb;")
    public static final class116 method754(class103 arg0, int arg1, int arg2) {
        return arg0.field1698 != null && arg0.field1698.length != 0 ? new class116(arg0, (int) ((long) arg0.field1701 * 256L * (long) arg1 / (long) (class75.field1284 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II[B[IIIIIIILbb;II)I")
    private static final int method755(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[B[IIIIIIIILbb;II)I")
    private static final int method756(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1910 -= arg11.field1918 * arg5;
        arg11.field1915 -= arg11.field1916 * arg5;
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
        arg11.field1910 += arg11.field1918 * arg5;
        arg11.field1915 += arg11.field1916 * arg5;
        arg11.field1917 = arg6;
        arg11.field1914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
    public final int method757() {
        int var1 = this.field1917 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1919 == 0) {
            var2 -= this.field1914 * var2 / (((class103) super.field3615).field1698.length << 8);
        } else if (this.field1919 >= 0) {
            var2 -= this.field1922 * var2 / ((class103) super.field3615).field1698.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "()Z")
    private final boolean method758() {
        int var1 = this.field1923;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method772(var1, this.field1920);
            var2 = method737(var1, this.field1920);
        }
        if (this.field1917 == var1 && this.field1910 == var3 && this.field1915 == var2) {
            if (this.field1923 == Integer.MIN_VALUE) {
                this.field1923 = 0;
                this.field1917 = this.field1910 = this.field1915 = 0;
                this.method655(63);
                return true;
            } else {
                this.method751();
                return false;
            }
        } else {
            if (this.field1917 < var1) {
                this.field1911 = 1;
                this.field1921 = var1 - this.field1917;
            } else if (this.field1917 > var1) {
                this.field1911 = -1;
                this.field1921 = this.field1917 - var1;
            } else {
                this.field1911 = 0;
            }
            if (this.field1910 < var3) {
                this.field1918 = 1;
                if (this.field1921 == 0 || this.field1921 > var3 - this.field1910) {
                    this.field1921 = var3 - this.field1910;
                }
            } else if (this.field1910 > var3) {
                this.field1918 = -1;
                if (this.field1921 == 0 || this.field1921 > this.field1910 - var3) {
                    this.field1921 = this.field1910 - var3;
                }
            } else {
                this.field1918 = 0;
            }
            if (this.field1915 < var2) {
                this.field1916 = 1;
                if (this.field1921 == 0 || this.field1921 > var2 - this.field1915) {
                    this.field1921 = var2 - this.field1915;
                }
            } else if (this.field1915 > var2) {
                this.field1916 = -1;
                if (this.field1921 == 0 || this.field1921 > this.field1915 - var2) {
                    this.field1921 = this.field1915 - var2;
                }
            } else {
                this.field1916 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public final synchronized void method510(int arg0) {
        if (this.field1921 > 0) {
            if (arg0 >= this.field1921) {
                if (this.field1923 == Integer.MIN_VALUE) {
                    this.field1923 = 0;
                    this.field1917 = this.field1910 = this.field1915 = 0;
                    this.method655(63);
                    arg0 = this.field1921;
                }
                this.field1921 = 0;
                this.method751();
            } else {
                this.field1917 += this.field1911 * arg0;
                this.field1910 += this.field1918 * arg0;
                this.field1915 += this.field1916 * arg0;
                this.field1921 -= arg0;
            }
        }
        class103 var2 = (class103) super.field3615;
        int var3 = this.field1922 << 8;
        int var4 = this.field1924 << 8;
        int var5 = var2.field1698.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1919 = 0;
        }
        if (this.field1914 < 0) {
            if (this.field1913 <= 0) {
                this.method750();
                this.method655(63);
                return;
            }
            this.field1914 = 0;
        }
        if (this.field1914 >= var5) {
            if (this.field1913 >= 0) {
                this.method750();
                this.method655(63);
                return;
            }
            this.field1914 = var5 - 1;
        }
        this.field1914 += this.field1913 * arg0;
        if (this.field1919 < 0) {
            if (!this.field1912) {
                if (this.field1913 < 0) {
                    if (this.field1914 < var3) {
                        this.field1914 = var4 - 1 - (var4 - 1 - this.field1914) % var6;
                    }
                } else if (this.field1914 >= var4) {
                    this.field1914 = (this.field1914 - var3) % var6 + var3;
                }
            } else {
                if (this.field1913 < 0) {
                    if (this.field1914 >= var3) {
                        return;
                    }
                    this.field1914 = var3 + var3 - 1 - this.field1914;
                    this.field1913 = -this.field1913;
                }
                while (this.field1914 >= var4) {
                    this.field1914 = var4 + var4 - 1 - this.field1914;
                    this.field1913 = -this.field1913;
                    if (this.field1914 >= var3) {
                        return;
                    }
                    this.field1914 = var3 + var3 - 1 - this.field1914;
                    this.field1913 = -this.field1913;
                }
            }
        } else {
            if (this.field1919 > 0) {
                if (this.field1912) {
                    label125: {
                        if (this.field1913 < 0) {
                            if (this.field1914 >= var3) {
                                return;
                            }
                            this.field1914 = var3 + var3 - 1 - this.field1914;
                            this.field1913 = -this.field1913;
                            if (--this.field1919 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1914 < var4) {
                                return;
                            }
                            this.field1914 = var4 + var4 - 1 - this.field1914;
                            this.field1913 = -this.field1913;
                            if (--this.field1919 == 0) {
                                break;
                            }
                            if (this.field1914 >= var3) {
                                return;
                            }
                            this.field1914 = var3 + var3 - 1 - this.field1914;
                            this.field1913 = -this.field1913;
                        } while (--this.field1919 != 0);
                    }
                } else if (this.field1913 < 0) {
                    if (this.field1914 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1914) / var6;
                    if (var7 < this.field1919) {
                        this.field1914 += var6 * var7;
                        this.field1919 -= var7;
                        return;
                    }
                    this.field1914 += this.field1919 * var6;
                    this.field1919 = 0;
                } else {
                    if (this.field1914 < var4) {
                        return;
                    }
                    int var8 = (this.field1914 - var3) / var6;
                    if (var8 < this.field1919) {
                        this.field1914 -= var6 * var8;
                        this.field1919 -= var8;
                        return;
                    }
                    this.field1914 -= this.field1919 * var6;
                    this.field1919 = 0;
                }
            }
            if (this.field1913 < 0) {
                if (this.field1914 < 0) {
                    this.field1914 = -1;
                    this.method750();
                    this.method655(63);
                    return;
                }
            } else if (this.field1914 >= var5) {
                this.field1914 = var5;
                this.method750();
                this.method655(63);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([B[IIIIIIILbb;)I")
    private static final int method759(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1914 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II[B[IIIIIIIILbb;II)I")
    private static final int method760(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1910 -= arg11.field1918 * arg5;
        arg11.field1915 -= arg11.field1916 * arg5;
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
        arg11.field1910 += arg11.field1918 * arg5;
        arg11.field1915 += arg11.field1916 * arg5;
        arg11.field1917 = arg6;
        arg11.field1914 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final synchronized void method761(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method736(arg1, arg2);
        } else {
            int var4 = method772(arg1, arg2);
            int var5 = method737(arg1, arg2);
            if (this.field1910 == var4 && this.field1915 == var5) {
                this.field1921 = 0;
            } else {
                int var6 = arg1 - this.field1917;
                if (this.field1917 - arg1 > var6) {
                    var6 = this.field1917 - arg1;
                }
                if (var4 - this.field1910 > var6) {
                    var6 = var4 - this.field1910;
                }
                if (this.field1910 - var4 > var6) {
                    var6 = this.field1910 - var4;
                }
                if (var5 - this.field1915 > var6) {
                    var6 = var5 - this.field1915;
                }
                if (this.field1915 - var5 > var6) {
                    var6 = this.field1915 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1921 = arg0;
                this.field1923 = arg1;
                this.field1920 = arg2;
                this.field1911 = (arg1 - this.field1917) / arg0;
                this.field1918 = (var4 - this.field1910) / arg0;
                this.field1916 = (var5 - this.field1915) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)V")
    private final synchronized void method762(int arg0) {
        this.method736(arg0, this.method749());
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V")
    public final synchronized void method763(int arg0, int arg1) {
        this.method761(arg0, arg1, this.method749());
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lii;")
    public final class202 method511() {
        return null;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()Lii;")
    public final class202 method508() {
        return null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I[B[IIIIIIIIIILbb;)I")
    private static final int method764(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1917 += (var19 - arg4) * arg12.field1911;
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
        arg12.field1910 = var15 >> 2;
        arg12.field1915 = var16 >> 2;
        arg12.field1914 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[B[IIIIIIIIIILbb;II)I")
    private static final int method765(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1917 -= arg13.field1911 * arg5;
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
        arg13.field1917 += arg13.field1911 * var22;
        arg13.field1910 = arg6;
        arg13.field1915 = arg7;
        arg13.field1914 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II[B[IIIIIIIIIILbb;II)I")
    private static final int method766(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1917 -= arg13.field1911 * arg5;
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
        arg13.field1917 += arg13.field1911 * var22;
        arg13.field1910 = arg6;
        arg13.field1915 = arg7;
        arg13.field1914 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public final synchronized void method767(boolean arg0) {
        this.field1913 = (this.field1913 >>> 31) + (this.field1913 ^ this.field1913 >> 31);
        if (arg0) {
            this.field1913 = -this.field1913;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II[B[IIIIIIIILbb;II)I")
    private static final int method768(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1914 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "()I")
    public final synchronized int method769() {
        return this.field1923 == Integer.MIN_VALUE ? 0 : this.field1923;
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)V")
    public final synchronized void method770(int arg0) {
        this.field1919 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ltf;III)Lbb;")
    public static final class116 method771(class103 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1698 != null && arg0.field1698.length != 0 ? new class116(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)I")
    private static final int method772(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([B[IIIIIIIILbb;)I")
    private static final int method773(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1910 += (var14 - arg3) * arg9.field1918;
        arg9.field1915 += (var14 - arg3) * arg9.field1916;
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
        arg9.field1917 = var12 >> 2;
        arg9.field1914 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "()Z")
    public final boolean method774() {
        return this.field1914 < 0 || this.field1914 >= ((class103) super.field3615).field1698.length << 8;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II[B[IIIIIIIILbb;II)I")
    private static final int method775(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1914 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ltf;II)V")
    private class116(class103 arg0, int arg1, int arg2) {
        super.field3615 = arg0;
        this.field1922 = arg0.field1699;
        this.field1924 = arg0.field1702;
        this.field1912 = arg0.field1700;
        this.field1913 = arg1;
        this.field1923 = arg2;
        this.field1920 = 8192;
        this.field1914 = 0;
        this.method751();
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Ltf;III)V")
    private class116(class103 arg0, int arg1, int arg2, int arg3) {
        super.field3615 = arg0;
        this.field1922 = arg0.field1699;
        this.field1924 = arg0.field1702;
        this.field1912 = arg0.field1700;
        this.field1913 = arg1;
        this.field1923 = arg2;
        this.field1920 = arg3;
        this.field1914 = 0;
        this.method751();
    }
}
