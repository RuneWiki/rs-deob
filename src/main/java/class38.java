import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class38 extends class240 {

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "Z")
    private boolean field924;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIII)I")
    private final int method366(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field916 <= 0) {
                if (this.field913 == 256 && (this.field923 & 255) == 0) {
                    if (class134.field2618) {
                        return method382(0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, 0, arg3, arg2, this);
                    }
                    return method370(((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, 0, arg3, arg2, this);
                }
                if (class134.field2618) {
                    return method375(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, 0, arg3, arg2, this, this.field913, arg4);
                }
                return method393(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, 0, arg3, arg2, this, this.field913, arg4);
            }
            int var6 = this.field916 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field916 += arg1;
            if (this.field913 == 256 && (this.field923 & 255) == 0) {
                if (class134.field2618) {
                    arg1 = method371(0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, this.field926, this.field925, 0, var6, arg2, this);
                } else {
                    arg1 = method390(((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, this.field915, 0, var6, arg2, this);
                }
            } else if (class134.field2618) {
                arg1 = method405(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, this.field926, this.field925, 0, var6, arg2, this, this.field913, arg4);
            } else {
                arg1 = method383(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, this.field915, 0, var6, arg2, this, this.field913, arg4);
            }
            this.field916 -= arg1;
            if (this.field916 != 0) {
                return arg1;
            }
        } while (!this.method385());
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[B[IIIIIIIILm;)I")
    private static final int method367(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class38 arg10) {
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
        arg10.field923 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "()I")
    public final synchronized int method368() {
        return this.field917 == Integer.MIN_VALUE ? 0 : this.field917;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIILm;II)I")
    private static final int method369(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class38 arg10, int arg11, int arg12) {
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
        arg10.field923 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIILm;)I")
    private static final int method370(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class38 arg8) {
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
        arg8.field923 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[B[IIIIIIIIIILm;)I")
    private static final int method371(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class38 arg12) {
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
        arg12.field920 += (var19 - arg4) * arg12.field915;
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
        arg12.field919 = var15 >> 2;
        arg12.field914 = var16 >> 2;
        arg12.field923 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([III)V")
    public final synchronized void method183(int[] arg0, int arg1, int arg2) {
        if (this.field917 == 0 && this.field916 == 0) {
            this.method187(arg2);
        } else {
            class258 var4 = (class258) super.field4259;
            int var5 = this.field922 << 8;
            int var6 = this.field918 << 8;
            int var7 = var4.field4566.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field927 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field923 < 0) {
                if (this.field913 <= 0) {
                    this.method403();
                    this.method1681(false);
                    return;
                }
                this.field923 = 0;
            }
            if (this.field923 >= var7) {
                if (this.field913 >= 0) {
                    this.method403();
                    this.method1681(false);
                    return;
                }
                this.field923 = var7 - 1;
            }
            if (this.field927 < 0) {
                if (this.field924) {
                    if (this.field913 < 0) {
                        var9 = this.method389(arg0, arg1, var5, var10, var4.field4566[this.field922]);
                        if (this.field923 >= var5) {
                            return;
                        }
                        this.field923 = var5 + var5 - 1 - this.field923;
                        this.field913 = -this.field913;
                    }
                    while (true) {
                        int var11 = this.method366(arg0, var9, var6, var10, var4.field4566[this.field918 - 1]);
                        if (this.field923 < var6) {
                            return;
                        }
                        this.field923 = var6 + var6 - 1 - this.field923;
                        this.field913 = -this.field913;
                        var9 = this.method389(arg0, var11, var5, var10, var4.field4566[this.field922]);
                        if (this.field923 >= var5) {
                            return;
                        }
                        this.field923 = var5 + var5 - 1 - this.field923;
                        this.field913 = -this.field913;
                    }
                } else if (this.field913 < 0) {
                    while (true) {
                        var9 = this.method389(arg0, var9, var5, var10, var4.field4566[this.field918 - 1]);
                        if (this.field923 >= var5) {
                            return;
                        }
                        this.field923 = var6 - 1 - (var6 - 1 - this.field923) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method366(arg0, var9, var6, var10, var4.field4566[this.field922]);
                        if (this.field923 < var6) {
                            return;
                        }
                        this.field923 = (this.field923 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field927 > 0) {
                    if (this.field924) {
                        label130: {
                            if (this.field913 < 0) {
                                var9 = this.method389(arg0, arg1, var5, var10, var4.field4566[this.field922]);
                                if (this.field923 >= var5) {
                                    return;
                                }
                                this.field923 = var5 + var5 - 1 - this.field923;
                                this.field913 = -this.field913;
                                if (--this.field927 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method366(arg0, var9, var6, var10, var4.field4566[this.field918 - 1]);
                                if (this.field923 < var6) {
                                    return;
                                }
                                this.field923 = var6 + var6 - 1 - this.field923;
                                this.field913 = -this.field913;
                                if (--this.field927 == 0) {
                                    break;
                                }
                                var9 = this.method389(arg0, var9, var5, var10, var4.field4566[this.field922]);
                                if (this.field923 >= var5) {
                                    return;
                                }
                                this.field923 = var5 + var5 - 1 - this.field923;
                                this.field913 = -this.field913;
                            } while (--this.field927 != 0);
                        }
                    } else if (this.field913 < 0) {
                        while (true) {
                            var9 = this.method389(arg0, var9, var5, var10, var4.field4566[this.field918 - 1]);
                            if (this.field923 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field923) / var8;
                            if (var12 >= this.field927) {
                                this.field923 += this.field927 * var8;
                                this.field927 = 0;
                                break;
                            }
                            this.field923 += var8 * var12;
                            this.field927 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method366(arg0, var9, var6, var10, var4.field4566[this.field922]);
                            if (this.field923 < var6) {
                                return;
                            }
                            int var13 = (this.field923 - var5) / var8;
                            if (var13 >= this.field927) {
                                this.field923 -= this.field927 * var8;
                                this.field927 = 0;
                                break;
                            }
                            this.field923 -= var8 * var13;
                            this.field927 -= var13;
                        }
                    }
                }
                if (this.field913 < 0) {
                    this.method389(arg0, var9, 0, var10, 0);
                    if (this.field923 < 0) {
                        this.field923 = -1;
                        this.method403();
                        this.method1681(false);
                        return;
                    }
                } else {
                    this.method366(arg0, var9, var7, var10, 0);
                    if (this.field923 >= var7) {
                        this.field923 = var7;
                        this.method403();
                        this.method1681(false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "()I")
    public final synchronized int method372() {
        return this.field913 < 0 ? -this.field913 : this.field913;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)V")
    public final synchronized void method373(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method391(arg1, arg2);
        } else {
            int var4 = method380(arg1, arg2);
            int var5 = method404(arg1, arg2);
            if (this.field919 == var4 && this.field914 == var5) {
                this.field916 = 0;
            } else {
                int var6 = arg1 - this.field920;
                if (this.field920 - arg1 > var6) {
                    var6 = this.field920 - arg1;
                }
                if (var4 - this.field919 > var6) {
                    var6 = var4 - this.field919;
                }
                if (this.field919 - var4 > var6) {
                    var6 = this.field919 - var4;
                }
                if (var5 - this.field914 > var6) {
                    var6 = var5 - this.field914;
                }
                if (this.field914 - var5 > var6) {
                    var6 = this.field914 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field916 = arg0;
                this.field917 = arg1;
                this.field921 = arg2;
                this.field915 = (arg1 - this.field920) / arg0;
                this.field926 = (var4 - this.field919) / arg0;
                this.field925 = (var5 - this.field914) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
    public final synchronized void method374(int arg0, int arg1) {
        this.method373(arg0, arg1, this.method379());
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class38 arg11, int arg12, int arg13) {
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
        arg11.field923 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIILm;)I")
    private static final int method376(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class38 arg8) {
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
        arg8.field923 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public final synchronized void method377(int arg0) {
        if (this.field913 < 0) {
            this.field913 = -arg0;
        } else {
            this.field913 = arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIIIIILm;II)I")
    private static final int method378(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class38 arg13, int arg14, int arg15) {
        arg13.field920 -= arg13.field915 * arg5;
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
        arg13.field920 += arg13.field915 * var22;
        arg13.field919 = arg6;
        arg13.field914 = arg7;
        arg13.field923 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "()I")
    public final synchronized int method379() {
        return this.field921 < 0 ? -1 : this.field921;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)I")
    private static final int method380(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lbd;II)Lm;")
    public static final class38 method381(class258 arg0, int arg1, int arg2) {
        return arg0.field4566 != null && arg0.field4566.length != 0 ? new class38(arg0, (int) ((long) arg0.field4565 * 256L * (long) arg1 / (long) (class121.field2389 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I[B[IIIIIIIILm;)I")
    private static final int method382(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class38 arg10) {
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
        arg10.field923 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method383(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class38 arg11, int arg12, int arg13) {
        arg11.field919 -= arg11.field926 * arg5;
        arg11.field914 -= arg11.field925 * arg5;
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
        arg11.field919 += arg11.field926 * arg5;
        arg11.field914 += arg11.field925 * arg5;
        arg11.field920 = arg6;
        arg11.field923 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "()Loa;")
    public final class240 method179() {
        return null;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public final synchronized void method384(int arg0) {
        if (arg0 == 0) {
            this.method395(0);
            this.method1681(false);
        } else if (this.field919 == 0 && this.field914 == 0) {
            this.field916 = 0;
            this.field917 = 0;
            this.field920 = 0;
            this.method1681(false);
        } else {
            int var2 = -this.field920;
            if (this.field920 > var2) {
                var2 = this.field920;
            }
            if (-this.field919 > var2) {
                var2 = -this.field919;
            }
            if (this.field919 > var2) {
                var2 = this.field919;
            }
            if (-this.field914 > var2) {
                var2 = -this.field914;
            }
            if (this.field914 > var2) {
                var2 = this.field914;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field916 = arg0;
            this.field917 = Integer.MIN_VALUE;
            this.field915 = -this.field920 / arg0;
            this.field926 = -this.field919 / arg0;
            this.field925 = -this.field914 / arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
    public final int method185() {
        return this.field917 == 0 && this.field916 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "()Z")
    private final boolean method385() {
        int var1 = this.field917;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method380(var1, this.field921);
            var2 = method404(var1, this.field921);
        }
        if (this.field920 == var1 && this.field919 == var3 && this.field914 == var2) {
            if (this.field917 == Integer.MIN_VALUE) {
                this.field917 = 0;
                this.field920 = this.field919 = this.field914 = 0;
                this.method1681(false);
                return true;
            } else {
                this.method406();
                return false;
            }
        } else {
            if (this.field920 < var1) {
                this.field915 = 1;
                this.field916 = var1 - this.field920;
            } else if (this.field920 > var1) {
                this.field915 = -1;
                this.field916 = this.field920 - var1;
            } else {
                this.field915 = 0;
            }
            if (this.field919 < var3) {
                this.field926 = 1;
                if (this.field916 == 0 || this.field916 > var3 - this.field919) {
                    this.field916 = var3 - this.field919;
                }
            } else if (this.field919 > var3) {
                this.field926 = -1;
                if (this.field916 == 0 || this.field916 > this.field919 - var3) {
                    this.field916 = this.field919 - var3;
                }
            } else {
                this.field926 = 0;
            }
            if (this.field914 < var2) {
                this.field925 = 1;
                if (this.field916 == 0 || this.field916 > var2 - this.field914) {
                    this.field916 = var2 - this.field914;
                }
            } else if (this.field914 > var2) {
                this.field925 = -1;
                if (this.field916 == 0 || this.field916 > this.field914 - var2) {
                    this.field916 = this.field914 - var2;
                }
            } else {
                this.field925 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public final synchronized void method187(int arg0) {
        if (this.field916 > 0) {
            if (arg0 >= this.field916) {
                if (this.field917 == Integer.MIN_VALUE) {
                    this.field917 = 0;
                    this.field920 = this.field919 = this.field914 = 0;
                    this.method1681(false);
                    arg0 = this.field916;
                }
                this.field916 = 0;
                this.method406();
            } else {
                this.field920 += this.field915 * arg0;
                this.field919 += this.field926 * arg0;
                this.field914 += this.field925 * arg0;
                this.field916 -= arg0;
            }
        }
        class258 var2 = (class258) super.field4259;
        int var3 = this.field922 << 8;
        int var4 = this.field918 << 8;
        int var5 = var2.field4566.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field927 = 0;
        }
        if (this.field923 < 0) {
            if (this.field913 <= 0) {
                this.method403();
                this.method1681(false);
                return;
            }
            this.field923 = 0;
        }
        if (this.field923 >= var5) {
            if (this.field913 >= 0) {
                this.method403();
                this.method1681(false);
                return;
            }
            this.field923 = var5 - 1;
        }
        this.field923 += this.field913 * arg0;
        if (this.field927 < 0) {
            if (!this.field924) {
                if (this.field913 < 0) {
                    if (this.field923 < var3) {
                        this.field923 = var4 - 1 - (var4 - 1 - this.field923) % var6;
                    }
                } else if (this.field923 >= var4) {
                    this.field923 = (this.field923 - var3) % var6 + var3;
                }
            } else {
                if (this.field913 < 0) {
                    if (this.field923 >= var3) {
                        return;
                    }
                    this.field923 = var3 + var3 - 1 - this.field923;
                    this.field913 = -this.field913;
                }
                while (this.field923 >= var4) {
                    this.field923 = var4 + var4 - 1 - this.field923;
                    this.field913 = -this.field913;
                    if (this.field923 >= var3) {
                        return;
                    }
                    this.field923 = var3 + var3 - 1 - this.field923;
                    this.field913 = -this.field913;
                }
            }
        } else {
            if (this.field927 > 0) {
                if (this.field924) {
                    label125: {
                        if (this.field913 < 0) {
                            if (this.field923 >= var3) {
                                return;
                            }
                            this.field923 = var3 + var3 - 1 - this.field923;
                            this.field913 = -this.field913;
                            if (--this.field927 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field923 < var4) {
                                return;
                            }
                            this.field923 = var4 + var4 - 1 - this.field923;
                            this.field913 = -this.field913;
                            if (--this.field927 == 0) {
                                break;
                            }
                            if (this.field923 >= var3) {
                                return;
                            }
                            this.field923 = var3 + var3 - 1 - this.field923;
                            this.field913 = -this.field913;
                        } while (--this.field927 != 0);
                    }
                } else if (this.field913 < 0) {
                    if (this.field923 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field923) / var6;
                    if (var7 < this.field927) {
                        this.field923 += var6 * var7;
                        this.field927 -= var7;
                        return;
                    }
                    this.field923 += this.field927 * var6;
                    this.field927 = 0;
                } else {
                    if (this.field923 < var4) {
                        return;
                    }
                    int var8 = (this.field923 - var3) / var6;
                    if (var8 < this.field927) {
                        this.field923 -= var6 * var8;
                        this.field927 -= var8;
                        return;
                    }
                    this.field923 -= this.field927 * var6;
                    this.field927 = 0;
                }
            }
            if (this.field913 < 0) {
                if (this.field923 < 0) {
                    this.field923 = -1;
                    this.method403();
                    this.method1681(false);
                    return;
                }
            } else if (this.field923 >= var5) {
                this.field923 = var5;
                this.method403();
                this.method1681(false);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method386(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class38 arg11, int arg12, int arg13) {
        arg11.field919 -= arg11.field926 * arg5;
        arg11.field914 -= arg11.field925 * arg5;
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
        arg11.field919 += arg11.field926 * arg5;
        arg11.field914 += arg11.field925 * arg5;
        arg11.field920 = arg6;
        arg11.field923 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public final synchronized void method387(int arg0) {
        int var2 = ((class258) super.field4259).field4566.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field923 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public final synchronized void method388(boolean arg0) {
        this.field913 = (this.field913 >>> 31) + (this.field913 ^ this.field913 >> 31);
        if (arg0) {
            this.field913 = -this.field913;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([IIIII)I")
    private final int method389(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field916 <= 0) {
                if (this.field913 == -256 && (this.field923 & 255) == 0) {
                    if (class134.field2618) {
                        return method367(0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, 0, arg3, arg2, this);
                    }
                    return method376(((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, 0, arg3, arg2, this);
                }
                if (class134.field2618) {
                    return method396(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, 0, arg3, arg2, this, this.field913, arg4);
                }
                return method369(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, 0, arg3, arg2, this, this.field913, arg4);
            }
            int var6 = this.field916 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field916 += arg1;
            if (this.field913 == -256 && (this.field923 & 255) == 0) {
                if (class134.field2618) {
                    arg1 = method399(0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, this.field926, this.field925, 0, var6, arg2, this);
                } else {
                    arg1 = method401(((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, this.field915, 0, var6, arg2, this);
                }
            } else if (class134.field2618) {
                arg1 = method378(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field919, this.field914, this.field926, this.field925, 0, var6, arg2, this, this.field913, arg4);
            } else {
                arg1 = method386(0, 0, ((class258) super.field4259).field4566, arg0, this.field923, arg1, this.field920, this.field915, 0, var6, arg2, this, this.field913, arg4);
            }
            this.field916 -= arg1;
            if (this.field916 != 0) {
                return arg1;
            }
        } while (!this.method385());
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIIILm;)I")
    private static final int method390(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class38 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field919 += (var14 - arg3) * arg9.field926;
        arg9.field914 += (var14 - arg3) * arg9.field925;
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
        arg9.field920 = var12 >> 2;
        arg9.field923 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II)V")
    private final synchronized void method391(int arg0, int arg1) {
        this.field917 = arg0;
        this.field921 = arg1;
        this.field916 = 0;
        this.method406();
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public final synchronized void method392(int arg0) {
        this.field927 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIILm;II)I")
    private static final int method393(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class38 arg10, int arg11, int arg12) {
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
        arg10.field923 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lbd;III)Lm;")
    public static final class38 method394(class258 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4566 != null && arg0.field4566.length != 0 ? new class38(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
    private final synchronized void method395(int arg0) {
        this.method391(arg0, this.method379());
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II[B[IIIIIIIILm;II)I")
    private static final int method396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class38 arg11, int arg12, int arg13) {
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
        arg11.field923 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()I")
    public final int method397() {
        int var1 = this.field920 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field927 == 0) {
            var2 -= this.field923 * var2 / (((class258) super.field4259).field4566.length << 8);
        } else if (this.field927 >= 0) {
            var2 -= this.field922 * var2 / ((class258) super.field4259).field4566.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "()Z")
    public final boolean method398() {
        return this.field916 != 0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I[B[IIIIIIIIIILm;)I")
    private static final int method399(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class38 arg12) {
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
        arg12.field920 += (var19 - arg4) * arg12.field915;
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
        arg12.field919 = var15 >> 2;
        arg12.field914 = var16 >> 2;
        arg12.field923 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "(I)V")
    public final synchronized void method400(int arg0) {
        this.method391(arg0 << 6, this.method379());
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIIILm;)I")
    private static final int method401(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class38 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field919 += (var14 - arg3) * arg9.field926;
        arg9.field914 += (var14 - arg3) * arg9.field925;
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
        arg9.field920 = var12 >> 2;
        arg9.field923 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "()Z")
    public final boolean method402() {
        return this.field923 < 0 || this.field923 >= ((class258) super.field4259).field4566.length << 8;
    }

    @OriginalMember(owner = "client!m", name = "k", descriptor = "()V")
    private final void method403() {
        if (this.field916 != 0) {
            if (this.field917 == Integer.MIN_VALUE) {
                this.field917 = 0;
            }
            this.field916 = 0;
            this.method406();
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(II)I")
    private static final int method404(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Loa;")
    public final class240 method182() {
        return null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIIIIILm;II)I")
    private static final int method405(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class38 arg13, int arg14, int arg15) {
        arg13.field920 -= arg13.field915 * arg5;
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
        arg13.field920 += arg13.field915 * var22;
        arg13.field919 = arg6;
        arg13.field914 = arg7;
        arg13.field923 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lbd;II)V")
    private class38(class258 arg0, int arg1, int arg2) {
        super.field4259 = arg0;
        this.field922 = arg0.field4564;
        this.field918 = arg0.field4563;
        this.field924 = arg0.field4567;
        this.field913 = arg1;
        this.field917 = arg2;
        this.field921 = 8192;
        this.field923 = 0;
        this.method406();
    }

    @OriginalMember(owner = "client!m", name = "l", descriptor = "()V")
    private final void method406() {
        this.field920 = this.field917;
        this.field919 = method380(this.field917, this.field921);
        this.field914 = method404(this.field917, this.field921);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lbd;III)V")
    private class38(class258 arg0, int arg1, int arg2, int arg3) {
        super.field4259 = arg0;
        this.field922 = arg0.field4564;
        this.field918 = arg0.field4563;
        this.field924 = arg0.field4567;
        this.field913 = arg1;
        this.field917 = arg2;
        this.field921 = arg3;
        this.field923 = 0;
        this.method406();
    }
}
