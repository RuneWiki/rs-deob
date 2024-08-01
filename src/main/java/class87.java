import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jb")
public class class87 extends class97 {

    @OriginalMember(owner = "jb", name = "A", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "jb", name = "D", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "jb", name = "x", descriptor = "Z")
    private boolean field1815;

    @OriginalMember(owner = "jb", name = "F", descriptor = "I")
    private int field1823;

    @OriginalMember(owner = "jb", name = "y", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "jb", name = "v", descriptor = "I")
    private int field1813;

    @OriginalMember(owner = "jb", name = "s", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "jb", name = "r", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "jb", name = "t", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "jb", name = "u", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "jb", name = "w", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "jb", name = "z", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "jb", name = "B", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "jb", name = "C", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "jb", name = "E", descriptor = "I")
    private int field1822;

    @OriginalMember(owner = "jb", name = "a", descriptor = "(III)V")
    public final synchronized void method606(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method634(arg1, arg2);
        } else {
            int var4 = method637(arg1, arg2);
            int var5 = method610(arg1, arg2);
            if (this.field1812 == var4 && this.field1820 == var5) {
                this.field1817 = 0;
            } else {
                int var6 = arg1 - this.field1814;
                if (this.field1814 - arg1 > var6) {
                    var6 = this.field1814 - arg1;
                }
                if (var4 - this.field1812 > var6) {
                    var6 = var4 - this.field1812;
                }
                if (this.field1812 - var4 > var6) {
                    var6 = this.field1812 - var4;
                }
                if (var5 - this.field1820 > var6) {
                    var6 = var5 - this.field1820;
                }
                if (this.field1820 - var5 > var6) {
                    var6 = this.field1820 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1817 = arg0;
                this.field1816 = arg1;
                this.field1813 = arg2;
                this.field1811 = (arg1 - this.field1814) / arg0;
                this.field1819 = (var4 - this.field1812) / arg0;
                this.field1822 = (var5 - this.field1820) / arg0;
            }
        }
    }

    @OriginalMember(owner = "jb", name = "e", descriptor = "()I")
    public final synchronized int method607() {
        return this.field1823 < 0 ? -this.field1823 : this.field1823;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[B[IIIIIIILjb;II)I")
    private static final int method608(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class87 arg10, int arg11, int arg12) {
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
        arg10.field1810 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I)V")
    public final synchronized void method609(int arg0) {
        this.field1809 = arg0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II)I")
    private static final int method610(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[B[IIIIIIIILjb;)I")
    private static final int method611(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class87 arg10) {
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
        arg10.field1810 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(I)V")
    public final synchronized void method612(int arg0) {
        int var2 = ((class94) super.field1963).field1929.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1810 = arg0;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "()Lkc;")
    public final class97 method613() {
        return null;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([B[IIIIIIILjb;)I")
    private static final int method614(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class87 arg8) {
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
        arg8.field1810 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "jb", name = "f", descriptor = "()Z")
    public final boolean method615() {
        return this.field1810 < 0 || this.field1810 >= ((class94) super.field1963).field1929.length << 8;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(II)V")
    public final synchronized void method616(int arg0, int arg1) {
        this.method606(arg0, arg1, this.method631());
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(I)V")
    public final synchronized void method617(int arg0) {
        if (this.field1823 < 0) {
            this.field1823 = -arg0;
        } else {
            this.field1823 = arg0;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([B[IIIIIIIILjb;)I")
    private static final int method618(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class87 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1812 += (var14 - arg3) * arg9.field1819;
        arg9.field1820 += (var14 - arg3) * arg9.field1822;
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
        arg9.field1814 = var12 >> 2;
        arg9.field1810 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "jb", name = "e", descriptor = "(I)V")
    public final synchronized void method619(int arg0) {
        this.method634(arg0 << 6, this.method631());
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([III)V")
    public final synchronized void method620(int[] arg0, int arg1, int arg2) {
        if (this.field1816 == 0 && this.field1817 == 0) {
            this.method622(arg2);
        } else {
            class94 var4 = (class94) super.field1963;
            int var5 = this.field1818 << 8;
            int var6 = this.field1821 << 8;
            int var7 = var4.field1929.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1809 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1810 < 0) {
                if (this.field1823 <= 0) {
                    this.method626();
                    this.method452(true);
                    return;
                }
                this.field1810 = 0;
            }
            if (this.field1810 >= var7) {
                if (this.field1823 >= 0) {
                    this.method626();
                    this.method452(true);
                    return;
                }
                this.field1810 = var7 - 1;
            }
            if (this.field1809 < 0) {
                if (this.field1815) {
                    if (this.field1823 < 0) {
                        var9 = this.method641(arg0, arg1, var5, var10, var4.field1929[this.field1818]);
                        if (this.field1810 >= var5) {
                            return;
                        }
                        this.field1810 = var5 + var5 - 1 - this.field1810;
                        this.field1823 = -this.field1823;
                    }
                    while (true) {
                        int var11 = this.method642(arg0, var9, var6, var10, var4.field1929[this.field1821 - 1]);
                        if (this.field1810 < var6) {
                            return;
                        }
                        this.field1810 = var6 + var6 - 1 - this.field1810;
                        this.field1823 = -this.field1823;
                        var9 = this.method641(arg0, var11, var5, var10, var4.field1929[this.field1818]);
                        if (this.field1810 >= var5) {
                            return;
                        }
                        this.field1810 = var5 + var5 - 1 - this.field1810;
                        this.field1823 = -this.field1823;
                    }
                } else if (this.field1823 < 0) {
                    while (true) {
                        var9 = this.method641(arg0, var9, var5, var10, var4.field1929[this.field1821 - 1]);
                        if (this.field1810 >= var5) {
                            return;
                        }
                        this.field1810 = var6 - 1 - (var6 - 1 - this.field1810) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method642(arg0, var9, var6, var10, var4.field1929[this.field1818]);
                        if (this.field1810 < var6) {
                            return;
                        }
                        this.field1810 = (this.field1810 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1809 > 0) {
                    if (this.field1815) {
                        label130: {
                            if (this.field1823 < 0) {
                                var9 = this.method641(arg0, arg1, var5, var10, var4.field1929[this.field1818]);
                                if (this.field1810 >= var5) {
                                    return;
                                }
                                this.field1810 = var5 + var5 - 1 - this.field1810;
                                this.field1823 = -this.field1823;
                                if (--this.field1809 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method642(arg0, var9, var6, var10, var4.field1929[this.field1821 - 1]);
                                if (this.field1810 < var6) {
                                    return;
                                }
                                this.field1810 = var6 + var6 - 1 - this.field1810;
                                this.field1823 = -this.field1823;
                                if (--this.field1809 == 0) {
                                    break;
                                }
                                var9 = this.method641(arg0, var9, var5, var10, var4.field1929[this.field1818]);
                                if (this.field1810 >= var5) {
                                    return;
                                }
                                this.field1810 = var5 + var5 - 1 - this.field1810;
                                this.field1823 = -this.field1823;
                            } while (--this.field1809 != 0);
                        }
                    } else if (this.field1823 < 0) {
                        while (true) {
                            var9 = this.method641(arg0, var9, var5, var10, var4.field1929[this.field1821 - 1]);
                            if (this.field1810 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1810) / var8;
                            if (var12 >= this.field1809) {
                                this.field1810 += this.field1809 * var8;
                                this.field1809 = 0;
                                break;
                            }
                            this.field1810 += var8 * var12;
                            this.field1809 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method642(arg0, var9, var6, var10, var4.field1929[this.field1818]);
                            if (this.field1810 < var6) {
                                return;
                            }
                            int var13 = (this.field1810 - var5) / var8;
                            if (var13 >= this.field1809) {
                                this.field1810 -= this.field1809 * var8;
                                this.field1809 = 0;
                                break;
                            }
                            this.field1810 -= var8 * var13;
                            this.field1809 -= var13;
                        }
                    }
                }
                if (this.field1823 < 0) {
                    this.method641(arg0, var9, 0, var10, 0);
                    if (this.field1810 < 0) {
                        this.field1810 = -1;
                        this.method626();
                        this.method452(true);
                        return;
                    }
                } else {
                    this.method642(arg0, var9, var7, var10, 0);
                    if (this.field1810 >= var7) {
                        this.field1810 = var7;
                        this.method626();
                        this.method452(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I[B[IIIIIIIIIILjb;)I")
    private static final int method621(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class87 arg12) {
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
        arg12.field1814 += (var19 - arg4) * arg12.field1811;
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
        arg12.field1812 = var15 >> 2;
        arg12.field1820 = var16 >> 2;
        arg12.field1810 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(I)V")
    public final synchronized void method622(int arg0) {
        if (this.field1817 > 0) {
            if (arg0 >= this.field1817) {
                if (this.field1816 == Integer.MIN_VALUE) {
                    this.field1816 = 0;
                    this.field1814 = this.field1812 = this.field1820 = 0;
                    this.method452(true);
                    arg0 = this.field1817;
                }
                this.field1817 = 0;
                this.method643();
            } else {
                this.field1814 += this.field1811 * arg0;
                this.field1812 += this.field1819 * arg0;
                this.field1820 += this.field1822 * arg0;
                this.field1817 -= arg0;
            }
        }
        class94 var2 = (class94) super.field1963;
        int var3 = this.field1818 << 8;
        int var4 = this.field1821 << 8;
        int var5 = var2.field1929.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1809 = 0;
        }
        if (this.field1810 < 0) {
            if (this.field1823 <= 0) {
                this.method626();
                this.method452(true);
                return;
            }
            this.field1810 = 0;
        }
        if (this.field1810 >= var5) {
            if (this.field1823 >= 0) {
                this.method626();
                this.method452(true);
                return;
            }
            this.field1810 = var5 - 1;
        }
        this.field1810 += this.field1823 * arg0;
        if (this.field1809 < 0) {
            if (!this.field1815) {
                if (this.field1823 < 0) {
                    if (this.field1810 < var3) {
                        this.field1810 = var4 - 1 - (var4 - 1 - this.field1810) % var6;
                    }
                } else if (this.field1810 >= var4) {
                    this.field1810 = (this.field1810 - var3) % var6 + var3;
                }
            } else {
                if (this.field1823 < 0) {
                    if (this.field1810 >= var3) {
                        return;
                    }
                    this.field1810 = var3 + var3 - 1 - this.field1810;
                    this.field1823 = -this.field1823;
                }
                while (this.field1810 >= var4) {
                    this.field1810 = var4 + var4 - 1 - this.field1810;
                    this.field1823 = -this.field1823;
                    if (this.field1810 >= var3) {
                        return;
                    }
                    this.field1810 = var3 + var3 - 1 - this.field1810;
                    this.field1823 = -this.field1823;
                }
            }
        } else {
            if (this.field1809 > 0) {
                if (this.field1815) {
                    label125: {
                        if (this.field1823 < 0) {
                            if (this.field1810 >= var3) {
                                return;
                            }
                            this.field1810 = var3 + var3 - 1 - this.field1810;
                            this.field1823 = -this.field1823;
                            if (--this.field1809 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1810 < var4) {
                                return;
                            }
                            this.field1810 = var4 + var4 - 1 - this.field1810;
                            this.field1823 = -this.field1823;
                            if (--this.field1809 == 0) {
                                break;
                            }
                            if (this.field1810 >= var3) {
                                return;
                            }
                            this.field1810 = var3 + var3 - 1 - this.field1810;
                            this.field1823 = -this.field1823;
                        } while (--this.field1809 != 0);
                    }
                } else if (this.field1823 < 0) {
                    if (this.field1810 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1810) / var6;
                    if (var7 < this.field1809) {
                        this.field1810 += var6 * var7;
                        this.field1809 -= var7;
                        return;
                    }
                    this.field1810 += this.field1809 * var6;
                    this.field1809 = 0;
                } else {
                    if (this.field1810 < var4) {
                        return;
                    }
                    int var8 = (this.field1810 - var3) / var6;
                    if (var8 < this.field1809) {
                        this.field1810 -= var6 * var8;
                        this.field1809 -= var8;
                        return;
                    }
                    this.field1810 -= this.field1809 * var6;
                    this.field1809 = 0;
                }
            }
            if (this.field1823 < 0) {
                if (this.field1810 < 0) {
                    this.field1810 = -1;
                    this.method626();
                    this.method452(true);
                    return;
                }
            } else if (this.field1810 >= var5) {
                this.field1810 = var5;
                this.method626();
                this.method452(true);
            }
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "()I")
    public final int method623() {
        int var1 = this.field1814 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1809 == 0) {
            var2 -= this.field1810 * var2 / (((class94) super.field1963).field1929.length << 8);
        } else if (this.field1809 >= 0) {
            var2 -= this.field1818 * var2 / ((class94) super.field1963).field1929.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "jb", name = "g", descriptor = "()Z")
    public final boolean method624() {
        return this.field1817 != 0;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Lk;III)Ljb;")
    public static final class87 method625(class94 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1929 != null && arg0.field1929.length != 0 ? new class87(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "jb", name = "h", descriptor = "()V")
    private final void method626() {
        if (this.field1817 != 0) {
            if (this.field1816 == Integer.MIN_VALUE) {
                this.field1816 = 0;
            }
            this.field1817 = 0;
            this.method643();
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method627(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class87 arg11, int arg12, int arg13) {
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
        arg11.field1810 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "([B[IIIIIIIILjb;)I")
    private static final int method628(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class87 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1812 += (var14 - arg3) * arg9.field1819;
        arg9.field1820 += (var14 - arg3) * arg9.field1822;
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
        arg9.field1814 = var12 >> 2;
        arg9.field1810 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I[B[IIIIIIIILjb;)I")
    private static final int method629(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class87 arg10) {
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
        arg10.field1810 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "()Lkc;")
    public final class97 method630() {
        return null;
    }

    @OriginalMember(owner = "jb", name = "i", descriptor = "()I")
    public final synchronized int method631() {
        return this.field1813 < 0 ? -1 : this.field1813;
    }

    @OriginalMember(owner = "jb", name = "f", descriptor = "(I)V")
    private final synchronized void method632(int arg0) {
        this.method634(arg0, this.method631());
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "([B[IIIIIIILjb;)I")
    private static final int method633(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class87 arg8) {
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
        arg8.field1810 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(II)V")
    private final synchronized void method634(int arg0, int arg1) {
        this.field1816 = arg0;
        this.field1813 = arg1;
        this.field1817 = 0;
        this.method643();
    }

    @OriginalMember(owner = "jb", name = "j", descriptor = "()I")
    public final synchronized int method635() {
        return this.field1816 == Integer.MIN_VALUE ? 0 : this.field1816;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(II[B[IIIIIIILjb;II)I")
    private static final int method636(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class87 arg10, int arg11, int arg12) {
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
        arg10.field1810 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(II)I")
    private static final int method637(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(II[B[IIIIIIIIIILjb;II)I")
    private static final int method638(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class87 arg13, int arg14, int arg15) {
        arg13.field1814 -= arg13.field1811 * arg5;
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
        arg13.field1814 += arg13.field1811 * var22;
        arg13.field1812 = arg6;
        arg13.field1820 = arg7;
        arg13.field1810 = arg4;
        return var22;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method639(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class87 arg11, int arg12, int arg13) {
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
        arg11.field1810 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(Z)V")
    public final synchronized void method640(boolean arg0) {
        this.field1823 = (this.field1823 >>> 31) + (this.field1823 ^ this.field1823 >> 31);
        if (arg0) {
            this.field1823 = -this.field1823;
        }
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "([IIIII)I")
    private final int method641(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1817 <= 0) {
                if (this.field1823 == -256 && (this.field1810 & 255) == 0) {
                    if (class169.field3133) {
                        return method611(0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, 0, arg3, arg2, this);
                    }
                    return method614(((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, 0, arg3, arg2, this);
                }
                if (class169.field3133) {
                    return method639(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, 0, arg3, arg2, this, this.field1823, arg4);
                }
                return method608(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, 0, arg3, arg2, this, this.field1823, arg4);
            }
            int var6 = this.field1817 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1817 += arg1;
            if (this.field1823 == -256 && (this.field1810 & 255) == 0) {
                if (class169.field3133) {
                    arg1 = method649(0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, this.field1819, this.field1822, 0, var6, arg2, this);
                } else {
                    arg1 = method618(((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, this.field1811, 0, var6, arg2, this);
                }
            } else if (class169.field3133) {
                arg1 = method638(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, this.field1819, this.field1822, 0, var6, arg2, this, this.field1823, arg4);
            } else {
                arg1 = method644(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, this.field1811, 0, var6, arg2, this, this.field1823, arg4);
            }
            this.field1817 -= arg1;
            if (this.field1817 != 0) {
                return arg1;
            }
        } while (!this.method646());
        return arg3;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "([IIIII)I")
    private final int method642(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1817 <= 0) {
                if (this.field1823 == 256 && (this.field1810 & 255) == 0) {
                    if (class169.field3133) {
                        return method629(0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, 0, arg3, arg2, this);
                    }
                    return method633(((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, 0, arg3, arg2, this);
                }
                if (class169.field3133) {
                    return method627(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, 0, arg3, arg2, this, this.field1823, arg4);
                }
                return method636(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, 0, arg3, arg2, this, this.field1823, arg4);
            }
            int var6 = this.field1817 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1817 += arg1;
            if (this.field1823 == 256 && (this.field1810 & 255) == 0) {
                if (class169.field3133) {
                    arg1 = method621(0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, this.field1819, this.field1822, 0, var6, arg2, this);
                } else {
                    arg1 = method628(((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, this.field1811, 0, var6, arg2, this);
                }
            } else if (class169.field3133) {
                arg1 = method651(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1812, this.field1820, this.field1819, this.field1822, 0, var6, arg2, this, this.field1823, arg4);
            } else {
                arg1 = method648(0, 0, ((class94) super.field1963).field1929, arg0, this.field1810, arg1, this.field1814, this.field1811, 0, var6, arg2, this, this.field1823, arg4);
            }
            this.field1817 -= arg1;
            if (this.field1817 != 0) {
                return arg1;
            }
        } while (!this.method646());
        return arg3;
    }

    @OriginalMember(owner = "jb", name = "k", descriptor = "()V")
    private final void method643() {
        this.field1814 = this.field1816;
        this.field1812 = method637(this.field1816, this.field1813);
        this.field1820 = method610(this.field1816, this.field1813);
    }

    @OriginalMember(owner = "jb", name = "c", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method644(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class87 arg11, int arg12, int arg13) {
        arg11.field1812 -= arg11.field1819 * arg5;
        arg11.field1820 -= arg11.field1822 * arg5;
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
        arg11.field1812 += arg11.field1819 * arg5;
        arg11.field1820 += arg11.field1822 * arg5;
        arg11.field1814 = arg6;
        arg11.field1810 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "jb", name = "a", descriptor = "(Lk;II)Ljb;")
    public static final class87 method645(class94 arg0, int arg1, int arg2) {
        return arg0.field1929 != null && arg0.field1929.length != 0 ? new class87(arg0, (int) ((long) arg0.field1931 * 256L * (long) arg1 / (long) (class23.field519 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "jb", name = "l", descriptor = "()Z")
    private final boolean method646() {
        int var1 = this.field1816;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method637(var1, this.field1813);
            var2 = method610(var1, this.field1813);
        }
        if (this.field1814 == var1 && this.field1812 == var3 && this.field1820 == var2) {
            if (this.field1816 == Integer.MIN_VALUE) {
                this.field1816 = 0;
                this.field1814 = this.field1812 = this.field1820 = 0;
                this.method452(true);
                return true;
            } else {
                this.method643();
                return false;
            }
        } else {
            if (this.field1814 < var1) {
                this.field1811 = 1;
                this.field1817 = var1 - this.field1814;
            } else if (this.field1814 > var1) {
                this.field1811 = -1;
                this.field1817 = this.field1814 - var1;
            } else {
                this.field1811 = 0;
            }
            if (this.field1812 < var3) {
                this.field1819 = 1;
                if (this.field1817 == 0 || this.field1817 > var3 - this.field1812) {
                    this.field1817 = var3 - this.field1812;
                }
            } else if (this.field1812 > var3) {
                this.field1819 = -1;
                if (this.field1817 == 0 || this.field1817 > this.field1812 - var3) {
                    this.field1817 = this.field1812 - var3;
                }
            } else {
                this.field1819 = 0;
            }
            if (this.field1820 < var2) {
                this.field1822 = 1;
                if (this.field1817 == 0 || this.field1817 > var2 - this.field1820) {
                    this.field1817 = var2 - this.field1820;
                }
            } else if (this.field1820 > var2) {
                this.field1822 = -1;
                if (this.field1817 == 0 || this.field1817 > this.field1820 - var2) {
                    this.field1817 = this.field1820 - var2;
                }
            } else {
                this.field1822 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "jb", name = "g", descriptor = "(I)V")
    public final synchronized void method647(int arg0) {
        if (arg0 == 0) {
            this.method632(0);
            this.method452(true);
        } else if (this.field1812 == 0 && this.field1820 == 0) {
            this.field1817 = 0;
            this.field1816 = 0;
            this.field1814 = 0;
            this.method452(true);
        } else {
            int var2 = -this.field1814;
            if (this.field1814 > var2) {
                var2 = this.field1814;
            }
            if (-this.field1812 > var2) {
                var2 = -this.field1812;
            }
            if (this.field1812 > var2) {
                var2 = this.field1812;
            }
            if (-this.field1820 > var2) {
                var2 = -this.field1820;
            }
            if (this.field1820 > var2) {
                var2 = this.field1820;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1817 = arg0;
            this.field1816 = Integer.MIN_VALUE;
            this.field1811 = -this.field1814 / arg0;
            this.field1819 = -this.field1812 / arg0;
            this.field1822 = -this.field1820 / arg0;
        }
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "(II[B[IIIIIIIILjb;II)I")
    private static final int method648(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class87 arg11, int arg12, int arg13) {
        arg11.field1812 -= arg11.field1819 * arg5;
        arg11.field1820 -= arg11.field1822 * arg5;
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
        arg11.field1812 += arg11.field1819 * arg5;
        arg11.field1820 += arg11.field1822 * arg5;
        arg11.field1814 = arg6;
        arg11.field1810 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(I[B[IIIIIIIIIILjb;)I")
    private static final int method649(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class87 arg12) {
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
        arg12.field1814 += (var19 - arg4) * arg12.field1811;
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
        arg12.field1812 = var15 >> 2;
        arg12.field1820 = var16 >> 2;
        arg12.field1810 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "jb", name = "d", descriptor = "()I")
    public final int method650() {
        return this.field1816 == 0 && this.field1817 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "jb", name = "b", descriptor = "(II[B[IIIIIIIIIILjb;II)I")
    private static final int method651(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class87 arg13, int arg14, int arg15) {
        arg13.field1814 -= arg13.field1811 * arg5;
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
        arg13.field1814 += arg13.field1811 * var22;
        arg13.field1812 = arg6;
        arg13.field1820 = arg7;
        arg13.field1810 = arg4;
        return var22;
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lk;II)V")
    private class87(class94 arg0, int arg1, int arg2) {
        super.field1963 = arg0;
        this.field1818 = arg0.field1928;
        this.field1821 = arg0.field1930;
        this.field1815 = arg0.field1927;
        this.field1823 = arg1;
        this.field1816 = arg2;
        this.field1813 = 8192;
        this.field1810 = 0;
        this.method643();
    }

    @OriginalMember(owner = "jb", name = "<init>", descriptor = "(Lk;III)V")
    private class87(class94 arg0, int arg1, int arg2, int arg3) {
        super.field1963 = arg0;
        this.field1818 = arg0.field1928;
        this.field1821 = arg0.field1930;
        this.field1815 = arg0.field1927;
        this.field1823 = arg1;
        this.field1816 = arg2;
        this.field1813 = arg3;
        this.field1810 = 0;
        this.method643();
    }
}
