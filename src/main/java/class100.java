import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class100 extends class185 {

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    private int field1838;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    private int field1825;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
    private boolean field1837;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    private int field1827;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    private int field1828;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    private int field1829;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    private int field1832;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    private int field1833;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    private int field1834;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
    public final synchronized void method708(int arg0, int arg1) {
        this.method738(arg0, arg1, this.method736());
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[B[IIIIIIILjb;II)I")
    private static final int method709(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class100 arg10, int arg11, int arg12) {
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
        arg10.field1831 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([B[IIIIIIIILjb;)I")
    private static final int method710(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class100 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1827 += (var14 - arg3) * arg9.field1835;
        arg9.field1832 += (var14 - arg3) * arg9.field1833;
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
        arg9.field1828 = var12 >> 2;
        arg9.field1831 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([III)V")
    public final synchronized void method100(int[] arg0, int arg1, int arg2) {
        if (this.field1824 == 0 && this.field1829 == 0) {
            this.method99(arg2);
        } else {
            class209 var4 = (class209) super.field3204;
            int var5 = this.field1838 << 8;
            int var6 = this.field1825 << 8;
            int var7 = var4.field3741.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1826 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1831 < 0) {
                if (this.field1836 <= 0) {
                    this.method731();
                    this.method1148(-13215);
                    return;
                }
                this.field1831 = 0;
            }
            if (this.field1831 >= var7) {
                if (this.field1836 >= 0) {
                    this.method731();
                    this.method1148(-13215);
                    return;
                }
                this.field1831 = var7 - 1;
            }
            if (this.field1826 < 0) {
                if (this.field1837) {
                    if (this.field1836 < 0) {
                        var9 = this.method733(arg0, arg1, var5, var10, var4.field3741[this.field1838]);
                        if (this.field1831 >= var5) {
                            return;
                        }
                        this.field1831 = var5 + var5 - 1 - this.field1831;
                        this.field1836 = -this.field1836;
                    }
                    while (true) {
                        int var11 = this.method713(arg0, var9, var6, var10, var4.field3741[this.field1825 - 1]);
                        if (this.field1831 < var6) {
                            return;
                        }
                        this.field1831 = var6 + var6 - 1 - this.field1831;
                        this.field1836 = -this.field1836;
                        var9 = this.method733(arg0, var11, var5, var10, var4.field3741[this.field1838]);
                        if (this.field1831 >= var5) {
                            return;
                        }
                        this.field1831 = var5 + var5 - 1 - this.field1831;
                        this.field1836 = -this.field1836;
                    }
                } else if (this.field1836 < 0) {
                    while (true) {
                        var9 = this.method733(arg0, var9, var5, var10, var4.field3741[this.field1825 - 1]);
                        if (this.field1831 >= var5) {
                            return;
                        }
                        this.field1831 = var6 - 1 - (var6 - 1 - this.field1831) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method713(arg0, var9, var6, var10, var4.field3741[this.field1838]);
                        if (this.field1831 < var6) {
                            return;
                        }
                        this.field1831 = (this.field1831 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1826 > 0) {
                    if (this.field1837) {
                        label130: {
                            if (this.field1836 < 0) {
                                var9 = this.method733(arg0, arg1, var5, var10, var4.field3741[this.field1838]);
                                if (this.field1831 >= var5) {
                                    return;
                                }
                                this.field1831 = var5 + var5 - 1 - this.field1831;
                                this.field1836 = -this.field1836;
                                if (--this.field1826 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method713(arg0, var9, var6, var10, var4.field3741[this.field1825 - 1]);
                                if (this.field1831 < var6) {
                                    return;
                                }
                                this.field1831 = var6 + var6 - 1 - this.field1831;
                                this.field1836 = -this.field1836;
                                if (--this.field1826 == 0) {
                                    break;
                                }
                                var9 = this.method733(arg0, var9, var5, var10, var4.field3741[this.field1838]);
                                if (this.field1831 >= var5) {
                                    return;
                                }
                                this.field1831 = var5 + var5 - 1 - this.field1831;
                                this.field1836 = -this.field1836;
                            } while (--this.field1826 != 0);
                        }
                    } else if (this.field1836 < 0) {
                        while (true) {
                            var9 = this.method733(arg0, var9, var5, var10, var4.field3741[this.field1825 - 1]);
                            if (this.field1831 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1831) / var8;
                            if (var12 >= this.field1826) {
                                this.field1831 += this.field1826 * var8;
                                this.field1826 = 0;
                                break;
                            }
                            this.field1831 += var8 * var12;
                            this.field1826 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method713(arg0, var9, var6, var10, var4.field3741[this.field1838]);
                            if (this.field1831 < var6) {
                                return;
                            }
                            int var13 = (this.field1831 - var5) / var8;
                            if (var13 >= this.field1826) {
                                this.field1831 -= this.field1826 * var8;
                                this.field1826 = 0;
                                break;
                            }
                            this.field1831 -= var8 * var13;
                            this.field1826 -= var13;
                        }
                    }
                }
                if (this.field1836 < 0) {
                    this.method733(arg0, var9, 0, var10, 0);
                    if (this.field1831 < 0) {
                        this.field1831 = -1;
                        this.method731();
                        this.method1148(-13215);
                        return;
                    }
                } else {
                    this.method713(arg0, var9, var7, var10, 0);
                    if (this.field1831 >= var7) {
                        this.field1831 = var7;
                        this.method731();
                        this.method1148(-13215);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)V")
    private final synchronized void method711(int arg0, int arg1) {
        this.field1824 = arg0;
        this.field1830 = arg1;
        this.field1829 = 0;
        this.method747();
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "()I")
    public final synchronized int method712() {
        return this.field1824 == Integer.MIN_VALUE ? 0 : this.field1824;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIII)I")
    private final int method713(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1829 <= 0) {
                if (this.field1836 == 256 && (this.field1831 & 255) == 0) {
                    if (class158.field2748) {
                        return method743(0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, 0, arg3, arg2, this);
                    }
                    return method729(((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, 0, arg3, arg2, this);
                }
                if (class158.field2748) {
                    return method723(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, 0, arg3, arg2, this, this.field1836, arg4);
                }
                return method709(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, 0, arg3, arg2, this, this.field1836, arg4);
            }
            int var6 = this.field1829 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1829 += arg1;
            if (this.field1836 == 256 && (this.field1831 & 255) == 0) {
                if (class158.field2748) {
                    arg1 = method740(0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, this.field1835, this.field1833, 0, var6, arg2, this);
                } else {
                    arg1 = method710(((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, this.field1834, 0, var6, arg2, this);
                }
            } else if (class158.field2748) {
                arg1 = method727(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, this.field1835, this.field1833, 0, var6, arg2, this, this.field1836, arg4);
            } else {
                arg1 = method742(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, this.field1834, 0, var6, arg2, this, this.field1836, arg4);
            }
            this.field1829 -= arg1;
            if (this.field1829 != 0) {
                return arg1;
            }
        } while (!this.method724());
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)I")
    private static final int method714(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()Lrd;")
    public final class185 method105() {
        return null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[B[IIIIIIIIIILjb;)I")
    private static final int method715(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class100 arg12) {
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
        arg12.field1828 += (var19 - arg4) * arg12.field1834;
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
        arg12.field1827 = var15 >> 2;
        arg12.field1832 = var16 >> 2;
        arg12.field1831 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public final synchronized void method716(int arg0) {
        this.field1826 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()I")
    public final int method110() {
        return this.field1824 == 0 && this.field1829 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(II)I")
    private static final int method717(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "()Z")
    public final boolean method718() {
        return this.field1829 != 0;
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    private final synchronized void method719(int arg0) {
        this.method711(arg0, this.method736());
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public final synchronized void method720(int arg0) {
        if (arg0 == 0) {
            this.method719(0);
            this.method1148(-13215);
        } else if (this.field1827 == 0 && this.field1832 == 0) {
            this.field1829 = 0;
            this.field1824 = 0;
            this.field1828 = 0;
            this.method1148(-13215);
        } else {
            int var2 = -this.field1828;
            if (this.field1828 > var2) {
                var2 = this.field1828;
            }
            if (-this.field1827 > var2) {
                var2 = -this.field1827;
            }
            if (this.field1827 > var2) {
                var2 = this.field1827;
            }
            if (-this.field1832 > var2) {
                var2 = -this.field1832;
            }
            if (this.field1832 > var2) {
                var2 = this.field1832;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1829 = arg0;
            this.field1824 = Integer.MIN_VALUE;
            this.field1834 = -this.field1828 / arg0;
            this.field1835 = -this.field1827 / arg0;
            this.field1833 = -this.field1832 / arg0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lti;II)Ljb;")
    public static final class100 method721(class209 arg0, int arg1, int arg2) {
        return arg0.field3741 != null && arg0.field3741.length != 0 ? new class100(arg0, (int) ((long) arg0.field3743 * 256L * (long) arg1 / (long) (class170.field2935 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public final synchronized void method722(boolean arg0) {
        this.field1836 = (this.field1836 >>> 31) + (this.field1836 ^ this.field1836 >> 31);
        if (arg0) {
            this.field1836 = -this.field1836;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method723(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class100 arg11, int arg12, int arg13) {
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
        arg11.field1831 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "()Z")
    private final boolean method724() {
        int var1 = this.field1824;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method717(var1, this.field1830);
            var2 = method714(var1, this.field1830);
        }
        if (this.field1828 == var1 && this.field1827 == var3 && this.field1832 == var2) {
            if (this.field1824 == Integer.MIN_VALUE) {
                this.field1824 = 0;
                this.field1828 = this.field1827 = this.field1832 = 0;
                this.method1148(-13215);
                return true;
            } else {
                this.method747();
                return false;
            }
        } else {
            if (this.field1828 < var1) {
                this.field1834 = 1;
                this.field1829 = var1 - this.field1828;
            } else if (this.field1828 > var1) {
                this.field1834 = -1;
                this.field1829 = this.field1828 - var1;
            } else {
                this.field1834 = 0;
            }
            if (this.field1827 < var3) {
                this.field1835 = 1;
                if (this.field1829 == 0 || this.field1829 > var3 - this.field1827) {
                    this.field1829 = var3 - this.field1827;
                }
            } else if (this.field1827 > var3) {
                this.field1835 = -1;
                if (this.field1829 == 0 || this.field1829 > this.field1827 - var3) {
                    this.field1829 = this.field1827 - var3;
                }
            } else {
                this.field1835 = 0;
            }
            if (this.field1832 < var2) {
                this.field1833 = 1;
                if (this.field1829 == 0 || this.field1829 > var2 - this.field1832) {
                    this.field1829 = var2 - this.field1832;
                }
            } else if (this.field1832 > var2) {
                this.field1833 = -1;
                if (this.field1829 == 0 || this.field1829 > this.field1832 - var2) {
                    this.field1829 = this.field1832 - var2;
                }
            } else {
                this.field1833 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "()Z")
    public final boolean method725() {
        return this.field1831 < 0 || this.field1831 >= ((class209) super.field3204).field3741.length << 8;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
    public final synchronized void method726(int arg0) {
        int var2 = ((class209) super.field3204).field3741.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1831 = arg0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[B[IIIIIIIIIILjb;II)I")
    private static final int method727(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class100 arg13, int arg14, int arg15) {
        arg13.field1828 -= arg13.field1834 * arg5;
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
        arg13.field1828 += arg13.field1834 * var22;
        arg13.field1827 = arg6;
        arg13.field1832 = arg7;
        arg13.field1831 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
    public final synchronized void method728(int arg0) {
        if (this.field1836 < 0) {
            this.field1836 = -arg0;
        } else {
            this.field1836 = arg0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([B[IIIIIIILjb;)I")
    private static final int method729(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class100 arg8) {
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
        arg8.field1831 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "([B[IIIIIIILjb;)I")
    private static final int method730(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class100 arg8) {
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
        arg8.field1831 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "()V")
    private final void method731() {
        if (this.field1829 != 0) {
            if (this.field1824 == Integer.MIN_VALUE) {
                this.field1824 = 0;
            }
            this.field1829 = 0;
            this.method747();
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public final synchronized void method99(int arg0) {
        if (this.field1829 > 0) {
            if (arg0 >= this.field1829) {
                if (this.field1824 == Integer.MIN_VALUE) {
                    this.field1824 = 0;
                    this.field1828 = this.field1827 = this.field1832 = 0;
                    this.method1148(-13215);
                    arg0 = this.field1829;
                }
                this.field1829 = 0;
                this.method747();
            } else {
                this.field1828 += this.field1834 * arg0;
                this.field1827 += this.field1835 * arg0;
                this.field1832 += this.field1833 * arg0;
                this.field1829 -= arg0;
            }
        }
        class209 var2 = (class209) super.field3204;
        int var3 = this.field1838 << 8;
        int var4 = this.field1825 << 8;
        int var5 = var2.field3741.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1826 = 0;
        }
        if (this.field1831 < 0) {
            if (this.field1836 <= 0) {
                this.method731();
                this.method1148(-13215);
                return;
            }
            this.field1831 = 0;
        }
        if (this.field1831 >= var5) {
            if (this.field1836 >= 0) {
                this.method731();
                this.method1148(-13215);
                return;
            }
            this.field1831 = var5 - 1;
        }
        this.field1831 += this.field1836 * arg0;
        if (this.field1826 < 0) {
            if (!this.field1837) {
                if (this.field1836 < 0) {
                    if (this.field1831 < var3) {
                        this.field1831 = var4 - 1 - (var4 - 1 - this.field1831) % var6;
                    }
                } else if (this.field1831 >= var4) {
                    this.field1831 = (this.field1831 - var3) % var6 + var3;
                }
            } else {
                if (this.field1836 < 0) {
                    if (this.field1831 >= var3) {
                        return;
                    }
                    this.field1831 = var3 + var3 - 1 - this.field1831;
                    this.field1836 = -this.field1836;
                }
                while (this.field1831 >= var4) {
                    this.field1831 = var4 + var4 - 1 - this.field1831;
                    this.field1836 = -this.field1836;
                    if (this.field1831 >= var3) {
                        return;
                    }
                    this.field1831 = var3 + var3 - 1 - this.field1831;
                    this.field1836 = -this.field1836;
                }
            }
        } else {
            if (this.field1826 > 0) {
                if (this.field1837) {
                    label125: {
                        if (this.field1836 < 0) {
                            if (this.field1831 >= var3) {
                                return;
                            }
                            this.field1831 = var3 + var3 - 1 - this.field1831;
                            this.field1836 = -this.field1836;
                            if (--this.field1826 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1831 < var4) {
                                return;
                            }
                            this.field1831 = var4 + var4 - 1 - this.field1831;
                            this.field1836 = -this.field1836;
                            if (--this.field1826 == 0) {
                                break;
                            }
                            if (this.field1831 >= var3) {
                                return;
                            }
                            this.field1831 = var3 + var3 - 1 - this.field1831;
                            this.field1836 = -this.field1836;
                        } while (--this.field1826 != 0);
                    }
                } else if (this.field1836 < 0) {
                    if (this.field1831 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1831) / var6;
                    if (var7 < this.field1826) {
                        this.field1831 += var6 * var7;
                        this.field1826 -= var7;
                        return;
                    }
                    this.field1831 += this.field1826 * var6;
                    this.field1826 = 0;
                } else {
                    if (this.field1831 < var4) {
                        return;
                    }
                    int var8 = (this.field1831 - var3) / var6;
                    if (var8 < this.field1826) {
                        this.field1831 -= var6 * var8;
                        this.field1826 -= var8;
                        return;
                    }
                    this.field1831 -= this.field1826 * var6;
                    this.field1826 = 0;
                }
            }
            if (this.field1836 < 0) {
                if (this.field1831 < 0) {
                    this.field1831 = -1;
                    this.method731();
                    this.method1148(-13215);
                    return;
                }
            } else if (this.field1831 >= var5) {
                this.field1831 = var5;
                this.method731();
                this.method1148(-13215);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II[B[IIIIIIIIIILjb;II)I")
    private static final int method732(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class100 arg13, int arg14, int arg15) {
        arg13.field1828 -= arg13.field1834 * arg5;
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
        arg13.field1828 += arg13.field1834 * var22;
        arg13.field1827 = arg6;
        arg13.field1832 = arg7;
        arg13.field1831 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "([IIIII)I")
    private final int method733(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1829 <= 0) {
                if (this.field1836 == -256 && (this.field1831 & 255) == 0) {
                    if (class158.field2748) {
                        return method741(0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, 0, arg3, arg2, this);
                    }
                    return method730(((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, 0, arg3, arg2, this);
                }
                if (class158.field2748) {
                    return method748(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, 0, arg3, arg2, this, this.field1836, arg4);
                }
                return method737(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, 0, arg3, arg2, this, this.field1836, arg4);
            }
            int var6 = this.field1829 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1829 += arg1;
            if (this.field1836 == -256 && (this.field1831 & 255) == 0) {
                if (class158.field2748) {
                    arg1 = method715(0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, this.field1835, this.field1833, 0, var6, arg2, this);
                } else {
                    arg1 = method734(((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, this.field1834, 0, var6, arg2, this);
                }
            } else if (class158.field2748) {
                arg1 = method732(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1827, this.field1832, this.field1835, this.field1833, 0, var6, arg2, this, this.field1836, arg4);
            } else {
                arg1 = method746(0, 0, ((class209) super.field3204).field3741, arg0, this.field1831, arg1, this.field1828, this.field1834, 0, var6, arg2, this, this.field1836, arg4);
            }
            this.field1829 -= arg1;
            if (this.field1829 != 0) {
                return arg1;
            }
        } while (!this.method724());
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "([B[IIIIIIIILjb;)I")
    private static final int method734(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class100 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1827 += (var14 - arg3) * arg9.field1835;
        arg9.field1832 += (var14 - arg3) * arg9.field1833;
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
        arg9.field1828 = var12 >> 2;
        arg9.field1831 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
    public final synchronized void method735(int arg0) {
        this.method711(arg0 << 6, this.method736());
    }

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "()I")
    public final synchronized int method736() {
        return this.field1830 < 0 ? -1 : this.field1830;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II[B[IIIIIIILjb;II)I")
    private static final int method737(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class100 arg10, int arg11, int arg12) {
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
        arg10.field1831 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public final synchronized void method738(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method711(arg1, arg2);
        } else {
            int var4 = method717(arg1, arg2);
            int var5 = method714(arg1, arg2);
            if (this.field1827 == var4 && this.field1832 == var5) {
                this.field1829 = 0;
            } else {
                int var6 = arg1 - this.field1828;
                if (this.field1828 - arg1 > var6) {
                    var6 = this.field1828 - arg1;
                }
                if (var4 - this.field1827 > var6) {
                    var6 = var4 - this.field1827;
                }
                if (this.field1827 - var4 > var6) {
                    var6 = this.field1827 - var4;
                }
                if (var5 - this.field1832 > var6) {
                    var6 = var5 - this.field1832;
                }
                if (this.field1832 - var5 > var6) {
                    var6 = this.field1832 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1829 = arg0;
                this.field1824 = arg1;
                this.field1830 = arg2;
                this.field1834 = (arg1 - this.field1828) / arg0;
                this.field1835 = (var4 - this.field1827) / arg0;
                this.field1833 = (var5 - this.field1832) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
    public final int method739() {
        int var1 = this.field1828 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1826 == 0) {
            var2 -= this.field1831 * var2 / (((class209) super.field3204).field3741.length << 8);
        } else if (this.field1826 >= 0) {
            var2 -= this.field1838 * var2 / ((class209) super.field3204).field3741.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I[B[IIIIIIIIIILjb;)I")
    private static final int method740(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class100 arg12) {
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
        arg12.field1828 += (var19 - arg4) * arg12.field1834;
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
        arg12.field1827 = var15 >> 2;
        arg12.field1832 = var16 >> 2;
        arg12.field1831 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[B[IIIIIIIILjb;)I")
    private static final int method741(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class100 arg10) {
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
        arg10.field1831 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method742(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class100 arg11, int arg12, int arg13) {
        arg11.field1827 -= arg11.field1835 * arg5;
        arg11.field1832 -= arg11.field1833 * arg5;
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
        arg11.field1827 += arg11.field1835 * arg5;
        arg11.field1832 += arg11.field1833 * arg5;
        arg11.field1828 = arg6;
        arg11.field1831 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I[B[IIIIIIIILjb;)I")
    private static final int method743(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class100 arg10) {
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
        arg10.field1831 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "()I")
    public final synchronized int method744() {
        return this.field1836 < 0 ? -this.field1836 : this.field1836;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lti;III)Ljb;")
    public static final class100 method745(class209 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3741 != null && arg0.field3741.length != 0 ? new class100(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lti;II)V")
    private class100(class209 arg0, int arg1, int arg2) {
        super.field3204 = arg0;
        this.field1838 = arg0.field3745;
        this.field1825 = arg0.field3744;
        this.field1837 = arg0.field3742;
        this.field1836 = arg1;
        this.field1824 = arg2;
        this.field1830 = 8192;
        this.field1831 = 0;
        this.method747();
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method746(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class100 arg11, int arg12, int arg13) {
        arg11.field1827 -= arg11.field1835 * arg5;
        arg11.field1832 -= arg11.field1833 * arg5;
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
        arg11.field1827 += arg11.field1835 * arg5;
        arg11.field1832 += arg11.field1833 * arg5;
        arg11.field1828 = arg6;
        arg11.field1831 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()Lrd;")
    public final class185 method107() {
        return null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lti;III)V")
    private class100(class209 arg0, int arg1, int arg2, int arg3) {
        super.field3204 = arg0;
        this.field1838 = arg0.field3745;
        this.field1825 = arg0.field3744;
        this.field1837 = arg0.field3742;
        this.field1836 = arg1;
        this.field1824 = arg2;
        this.field1830 = arg3;
        this.field1831 = 0;
        this.method747();
    }

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "()V")
    private final void method747() {
        this.field1828 = this.field1824;
        this.field1827 = method717(this.field1824, this.field1830);
        this.field1832 = method714(this.field1824, this.field1830);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method748(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class100 arg11, int arg12, int arg13) {
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
        arg11.field1831 = arg4;
        return var15 >> 1;
    }
}
