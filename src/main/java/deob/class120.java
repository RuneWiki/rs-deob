package deob;

@ObfuscatedName("dn")
public class class120 extends class122 {

    @ObfuscatedName("dn.d")
    public int field1681;

    @ObfuscatedName("dn.q")
    public int field1684;

    @ObfuscatedName("dn.x")
    public int field1682;

    @ObfuscatedName("dn.y")
    public int field1683;

    @ObfuscatedName("dn.e")
    public int field1680;

    @ObfuscatedName("dn.f")
    public int field1685;

    @ObfuscatedName("dn.v")
    public int field1686;

    @ObfuscatedName("dn.t")
    public int field1687;

    @ObfuscatedName("dn.i")
    public int field1688;

    @ObfuscatedName("dn.r")
    public int field1689;

    @ObfuscatedName("dn.g")
    public boolean field1690;

    @ObfuscatedName("dn.s")
    public int field1691;

    @ObfuscatedName("dn.o")
    public int field1694;

    @ObfuscatedName("dn.p")
    public int field1693;

    @ObfuscatedName("dn.u")
    public int field1692;

    @ObfuscatedName("dn.d(II)I")
    public static int method2105(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dn.q(II)I")
    public static int method2030(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dn.bi()I")
    public int method2003() {
        int var1 = this.field1680 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1687 == 0) {
            var2 -= this.field1681 * var2 / (((class110) this.field1707).field1599.length << 8);
        } else if (this.field1687 >= 0) {
            var2 -= this.field1688 * var2 / ((class110) this.field1707).field1599.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class120(class110 arg0, int arg1, int arg2) {
        this.field1707 = arg0;
        this.field1688 = arg0.field1598;
        this.field1689 = arg0.field1601;
        this.field1690 = arg0.field1602;
        this.field1684 = arg1;
        this.field1682 = arg2;
        this.field1683 = 8192;
        this.field1681 = 0;
        this.method2092();
    }

    public class120(class110 arg0, int arg1, int arg2, int arg3) {
        this.field1707 = arg0;
        this.field1688 = arg0.field1598;
        this.field1689 = arg0.field1601;
        this.field1690 = arg0.field1602;
        this.field1684 = arg1;
        this.field1682 = arg2;
        this.field1683 = arg3;
        this.field1681 = 0;
        this.method2092();
    }

    @ObfuscatedName("dn.x(Ldv;II)Ldn;")
    public static class120 method2004(class110 arg0, int arg1, int arg2) {
        return arg0.field1599 == null || arg0.field1599.length == 0 ? null : new class120(arg0, (int) ((long) arg0.field1600 * 256L * (long) arg1 / (long) (Statics.field1634 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dn.y(Ldv;III)Ldn;")
    public static class120 method2005(class110 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1599 == null || arg0.field1599.length == 0 ? null : new class120(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dn.e()V")
    public void method2092() {
        this.field1680 = this.field1682;
        this.field1685 = method2105(this.field1682, this.field1683);
        this.field1686 = method2030(this.field1682, this.field1683);
    }

    @ObfuscatedName("dn.r(I)V")
    public synchronized void method2007(int arg0) {
        this.field1687 = arg0;
    }

    @ObfuscatedName("dn.s(I)V")
    public synchronized void method2008(int arg0) {
        this.method2071(arg0 << 6, this.method2054());
    }

    @ObfuscatedName("dn.o(I)V")
    public synchronized void method2084(int arg0) {
        this.method2071(arg0, this.method2054());
    }

    @ObfuscatedName("dn.p(II)V")
    public synchronized void method2071(int arg0, int arg1) {
        this.field1682 = arg0;
        this.field1683 = arg1;
        this.field1691 = 0;
        this.method2092();
    }

    @ObfuscatedName("dn.u()I")
    public synchronized int method2002() {
        return this.field1682 == Integer.MIN_VALUE ? 0 : this.field1682;
    }

    @ObfuscatedName("dn.b()I")
    public synchronized int method2054() {
        return this.field1683 < 0 ? -1 : this.field1683;
    }

    @ObfuscatedName("dn.w(I)V")
    public synchronized void method2013(int arg0) {
        int var2 = ((class110) this.field1707).field1599.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1681 = arg0;
    }

    @ObfuscatedName("dn.k(Z)V")
    public synchronized void method2014(boolean arg0) {
        this.field1684 = (this.field1684 >>> 31) + (this.field1684 ^ this.field1684 >> 31);
        if (arg0) {
            this.field1684 = -this.field1684;
        }
    }

    @ObfuscatedName("dn.c()V")
    public void method2042() {
        if (this.field1691 == 0) {
            return;
        }
        if (this.field1682 == Integer.MIN_VALUE) {
            this.field1682 = 0;
        }
        this.field1691 = 0;
        this.method2092();
    }

    @ObfuscatedName("dn.h(II)V")
    public synchronized void method2010(int arg0, int arg1) {
        this.method2059(arg0, arg1, this.method2054());
    }

    @ObfuscatedName("dn.z(III)V")
    public synchronized void method2059(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2071(arg1, arg2);
            return;
        }
        int var4 = method2105(arg1, arg2);
        int var5 = method2030(arg1, arg2);
        if (this.field1685 == var4 && this.field1686 == var5) {
            this.field1691 = 0;
            return;
        }
        int var6 = arg1 - this.field1680;
        if (this.field1680 - arg1 > var6) {
            var6 = this.field1680 - arg1;
        }
        if (var4 - this.field1685 > var6) {
            var6 = var4 - this.field1685;
        }
        if (this.field1685 - var4 > var6) {
            var6 = this.field1685 - var4;
        }
        if (var5 - this.field1686 > var6) {
            var6 = var5 - this.field1686;
        }
        if (this.field1686 - var5 > var6) {
            var6 = this.field1686 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1691 = arg0;
        this.field1682 = arg1;
        this.field1683 = arg2;
        this.field1694 = (arg1 - this.field1680) / arg0;
        this.field1693 = (var4 - this.field1685) / arg0;
        this.field1692 = (var5 - this.field1686) / arg0;
    }

    @ObfuscatedName("dn.j(I)V")
    public synchronized void method2039(int arg0) {
        if (arg0 == 0) {
            this.method2084(0);
            this.method3312();
        } else if (this.field1685 == 0 && this.field1686 == 0) {
            this.field1691 = 0;
            this.field1682 = 0;
            this.field1680 = 0;
            this.method3312();
        } else {
            int var2 = -this.field1680;
            if (this.field1680 > var2) {
                var2 = this.field1680;
            }
            if (-this.field1685 > var2) {
                var2 = -this.field1685;
            }
            if (this.field1685 > var2) {
                var2 = this.field1685;
            }
            if (-this.field1686 > var2) {
                var2 = -this.field1686;
            }
            if (this.field1686 > var2) {
                var2 = this.field1686;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1691 = arg0;
            this.field1682 = Integer.MIN_VALUE;
            this.field1694 = -this.field1680 / arg0;
            this.field1693 = -this.field1685 / arg0;
            this.field1692 = -this.field1686 / arg0;
        }
    }

    @ObfuscatedName("dn.am(I)V")
    public synchronized void method2015(int arg0) {
        if (this.field1684 < 0) {
            this.field1684 = -arg0;
        } else {
            this.field1684 = arg0;
        }
    }

    @ObfuscatedName("dn.ac()I")
    public synchronized int method2019() {
        return this.field1684 < 0 ? -this.field1684 : this.field1684;
    }

    @ObfuscatedName("dn.ax()Z")
    public boolean method2020() {
        return this.field1681 < 0 || this.field1681 >= ((class110) this.field1707).field1599.length << 8;
    }

    @ObfuscatedName("dn.at()Z")
    public boolean method2021() {
        return this.field1691 != 0;
    }

    @ObfuscatedName("dn.f()Ldz;")
    public class122 method1779() {
        return null;
    }

    @ObfuscatedName("dn.v()Ldz;")
    public class122 method1780() {
        return null;
    }

    @ObfuscatedName("dn.t()I")
    public int method1781() {
        return this.field1682 == 0 && this.field1691 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dn.i([III)V")
    public synchronized void method1782(int[] arg0, int arg1, int arg2) {
        if (this.field1682 == 0 && this.field1691 == 0) {
            this.method1778(arg2);
            return;
        }
        class110 var4 = (class110) this.field1707;
        int var5 = this.field1688 << 8;
        int var6 = this.field1689 << 8;
        int var7 = var4.field1599.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1687 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1681 < 0) {
            if (this.field1684 <= 0) {
                this.method2042();
                this.method3312();
                return;
            }
            this.field1681 = 0;
        }
        if (this.field1681 >= var7) {
            if (this.field1684 >= 0) {
                this.method2042();
                this.method3312();
                return;
            }
            this.field1681 = var7 - 1;
        }
        if (this.field1687 >= 0) {
            if (this.field1687 > 0) {
                if (this.field1690) {
                    label131: {
                        if (this.field1684 < 0) {
                            var9 = this.method2024(arg0, arg1, var5, var10, var4.field1599[this.field1688]);
                            if (this.field1681 >= var5) {
                                return;
                            }
                            this.field1681 = var5 + var5 - 1 - this.field1681;
                            this.field1684 = -this.field1684;
                            if (--this.field1687 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2023(arg0, var9, var6, var10, var4.field1599[this.field1689 - 1]);
                            if (this.field1681 < var6) {
                                return;
                            }
                            this.field1681 = var6 + var6 - 1 - this.field1681;
                            this.field1684 = -this.field1684;
                            if (--this.field1687 == 0) {
                                break;
                            }
                            var9 = this.method2024(arg0, var9, var5, var10, var4.field1599[this.field1688]);
                            if (this.field1681 >= var5) {
                                return;
                            }
                            this.field1681 = var5 + var5 - 1 - this.field1681;
                            this.field1684 = -this.field1684;
                        } while (--this.field1687 != 0);
                    }
                } else if (this.field1684 < 0) {
                    while (true) {
                        var9 = this.method2024(arg0, var9, var5, var10, var4.field1599[this.field1689 - 1]);
                        if (this.field1681 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1681) / var8;
                        if (var12 >= this.field1687) {
                            this.field1681 += this.field1687 * var8;
                            this.field1687 = 0;
                            break;
                        }
                        this.field1681 += var8 * var12;
                        this.field1687 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2023(arg0, var9, var6, var10, var4.field1599[this.field1688]);
                        if (this.field1681 < var6) {
                            return;
                        }
                        int var13 = (this.field1681 - var5) / var8;
                        if (var13 >= this.field1687) {
                            this.field1681 -= this.field1687 * var8;
                            this.field1687 = 0;
                            break;
                        }
                        this.field1681 -= var8 * var13;
                        this.field1687 -= var13;
                    }
                }
            }
            if (this.field1684 < 0) {
                this.method2024(arg0, var9, 0, var10, 0);
                if (this.field1681 < 0) {
                    this.field1681 = -1;
                    this.method2042();
                    this.method3312();
                }
            } else {
                this.method2023(arg0, var9, var7, var10, 0);
                if (this.field1681 >= var7) {
                    this.field1681 = var7;
                    this.method2042();
                    this.method3312();
                }
            }
        } else if (this.field1690) {
            if (this.field1684 < 0) {
                var9 = this.method2024(arg0, arg1, var5, var10, var4.field1599[this.field1688]);
                if (this.field1681 >= var5) {
                    return;
                }
                this.field1681 = var5 + var5 - 1 - this.field1681;
                this.field1684 = -this.field1684;
            }
            while (true) {
                int var11 = this.method2023(arg0, var9, var6, var10, var4.field1599[this.field1689 - 1]);
                if (this.field1681 < var6) {
                    return;
                }
                this.field1681 = var6 + var6 - 1 - this.field1681;
                this.field1684 = -this.field1684;
                var9 = this.method2024(arg0, var11, var5, var10, var4.field1599[this.field1688]);
                if (this.field1681 >= var5) {
                    return;
                }
                this.field1681 = var5 + var5 - 1 - this.field1681;
                this.field1684 = -this.field1684;
            }
        } else if (this.field1684 < 0) {
            while (true) {
                var9 = this.method2024(arg0, var9, var5, var10, var4.field1599[this.field1689 - 1]);
                if (this.field1681 >= var5) {
                    return;
                }
                this.field1681 = var6 - 1 - (var6 - 1 - this.field1681) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2023(arg0, var9, var6, var10, var4.field1599[this.field1688]);
                if (this.field1681 < var6) {
                    return;
                }
                this.field1681 = (this.field1681 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dn.g(I)V")
    public synchronized void method1778(int arg0) {
        if (this.field1691 > 0) {
            if (arg0 >= this.field1691) {
                if (this.field1682 == Integer.MIN_VALUE) {
                    this.field1682 = 0;
                    this.field1686 = 0;
                    this.field1685 = 0;
                    this.field1680 = 0;
                    this.method3312();
                    arg0 = this.field1691;
                }
                this.field1691 = 0;
                this.method2092();
            } else {
                this.field1680 += this.field1694 * arg0;
                this.field1685 += this.field1693 * arg0;
                this.field1686 += this.field1692 * arg0;
                this.field1691 -= arg0;
            }
        }
        class110 var2 = (class110) this.field1707;
        int var3 = this.field1688 << 8;
        int var4 = this.field1689 << 8;
        int var5 = var2.field1599.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1687 = 0;
        }
        if (this.field1681 < 0) {
            if (this.field1684 <= 0) {
                this.method2042();
                this.method3312();
                return;
            }
            this.field1681 = 0;
        }
        if (this.field1681 >= var5) {
            if (this.field1684 >= 0) {
                this.method2042();
                this.method3312();
                return;
            }
            this.field1681 = var5 - 1;
        }
        this.field1681 += this.field1684 * arg0;
        if (this.field1687 >= 0) {
            if (this.field1687 > 0) {
                if (this.field1690) {
                    label121: {
                        if (this.field1684 < 0) {
                            if (this.field1681 >= var3) {
                                return;
                            }
                            this.field1681 = var3 + var3 - 1 - this.field1681;
                            this.field1684 = -this.field1684;
                            if (--this.field1687 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1681 < var4) {
                                return;
                            }
                            this.field1681 = var4 + var4 - 1 - this.field1681;
                            this.field1684 = -this.field1684;
                            if (--this.field1687 == 0) {
                                break;
                            }
                            if (this.field1681 >= var3) {
                                return;
                            }
                            this.field1681 = var3 + var3 - 1 - this.field1681;
                            this.field1684 = -this.field1684;
                        } while (--this.field1687 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1684 < 0) {
                            if (this.field1681 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1681) / var6;
                            if (var7 >= this.field1687) {
                                this.field1681 += this.field1687 * var6;
                                this.field1687 = 0;
                                break label153;
                            }
                            this.field1681 += var6 * var7;
                            this.field1687 -= var7;
                        } else if (this.field1681 >= var4) {
                            int var8 = (this.field1681 - var3) / var6;
                            if (var8 >= this.field1687) {
                                this.field1681 -= this.field1687 * var6;
                                this.field1687 = 0;
                                break label153;
                            }
                            this.field1681 -= var6 * var8;
                            this.field1687 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1684 < 0) {
                if (this.field1681 < 0) {
                    this.field1681 = -1;
                    this.method2042();
                    this.method3312();
                }
            } else if (this.field1681 >= var5) {
                this.field1681 = var5;
                this.method2042();
                this.method3312();
            }
        } else if (this.field1690) {
            if (this.field1684 < 0) {
                if (this.field1681 >= var3) {
                    return;
                }
                this.field1681 = var3 + var3 - 1 - this.field1681;
                this.field1684 = -this.field1684;
            }
            while (this.field1681 >= var4) {
                this.field1681 = var4 + var4 - 1 - this.field1681;
                this.field1684 = -this.field1684;
                if (this.field1681 >= var3) {
                    return;
                }
                this.field1681 = var3 + var3 - 1 - this.field1681;
                this.field1684 = -this.field1684;
            }
        } else if (this.field1684 < 0) {
            if (this.field1681 >= var3) {
                return;
            }
            this.field1681 = var4 - 1 - (var4 - 1 - this.field1681) % var6;
        } else if (this.field1681 >= var4) {
            this.field1681 = (this.field1681 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dn.ag([IIIII)I")
    public int method2023(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1691 > 0) {
                int var6 = this.field1691 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1691 += arg1;
                if (this.field1684 == 256 && (this.field1681 & 0xFF) == 0) {
                    if (Statics.field889) {
                        arg1 = method2033(0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, this.field1693, this.field1692, 0, var6, arg2, this);
                    } else {
                        arg1 = method2022(((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, this.field1694, 0, var6, arg2, this);
                    }
                } else if (Statics.field889) {
                    arg1 = method2094(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, this.field1693, this.field1692, 0, var6, arg2, this, this.field1684, arg4);
                } else {
                    arg1 = method2036(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, this.field1694, 0, var6, arg2, this, this.field1684, arg4);
                }
                this.field1691 -= arg1;
                if (this.field1691 != 0) {
                    return arg1;
                }
                if (!this.method2080()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1684 == 256 && (this.field1681 & 0xFF) == 0) {
                if (Statics.field889) {
                    return method2027(0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, 0, arg3, arg2, this);
                }
                return method2026(((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, 0, arg3, arg2, this);
            }
            if (Statics.field889) {
                return method2031(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, 0, arg3, arg2, this, this.field1684, arg4);
            }
            return method2121(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, 0, arg3, arg2, this, this.field1684, arg4);
        }
    }

    @ObfuscatedName("dn.ak([IIIII)I")
    public int method2024(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1691 > 0) {
                int var6 = this.field1691 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1691 += arg1;
                if (this.field1684 == -256 && (this.field1681 & 0xFF) == 0) {
                    if (Statics.field889) {
                        arg1 = method2117(0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, this.field1693, this.field1692, 0, var6, arg2, this);
                    } else {
                        arg1 = method2034(((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, this.field1694, 0, var6, arg2, this);
                    }
                } else if (Statics.field889) {
                    arg1 = method2001(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, this.field1693, this.field1692, 0, var6, arg2, this, this.field1684, arg4);
                } else {
                    arg1 = method2108(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, this.field1694, 0, var6, arg2, this, this.field1684, arg4);
                }
                this.field1691 -= arg1;
                if (this.field1691 != 0) {
                    return arg1;
                }
                if (!this.method2080()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1684 == -256 && (this.field1681 & 0xFF) == 0) {
                if (Statics.field889) {
                    return method2068(0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, 0, arg3, arg2, this);
                }
                return method2028(((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, 0, arg3, arg2, this);
            }
            if (Statics.field889) {
                return method2032(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1685, this.field1686, 0, arg3, arg2, this, this.field1684, arg4);
            }
            return method2017(0, 0, ((class110) this.field1707).field1599, arg0, this.field1681, arg1, this.field1680, 0, arg3, arg2, this, this.field1684, arg4);
        }
    }

    @ObfuscatedName("dn.as()Z")
    public boolean method2080() {
        int var1 = this.field1682;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2105(var1, this.field1683);
            var2 = method2030(var1, this.field1683);
        }
        if (this.field1680 != var1 || this.field1685 != var3 || this.field1686 != var2) {
            if (this.field1680 < var1) {
                this.field1694 = 1;
                this.field1691 = var1 - this.field1680;
            } else if (this.field1680 > var1) {
                this.field1694 = -1;
                this.field1691 = this.field1680 - var1;
            } else {
                this.field1694 = 0;
            }
            if (this.field1685 < var3) {
                this.field1693 = 1;
                if (this.field1691 == 0 || this.field1691 > var3 - this.field1685) {
                    this.field1691 = var3 - this.field1685;
                }
            } else if (this.field1685 > var3) {
                this.field1693 = -1;
                if (this.field1691 == 0 || this.field1691 > this.field1685 - var3) {
                    this.field1691 = this.field1685 - var3;
                }
            } else {
                this.field1693 = 0;
            }
            if (this.field1686 < var2) {
                this.field1692 = 1;
                if (this.field1691 == 0 || this.field1691 > var2 - this.field1686) {
                    this.field1691 = var2 - this.field1686;
                }
            } else if (this.field1686 > var2) {
                this.field1692 = -1;
                if (this.field1691 == 0 || this.field1691 > this.field1686 - var2) {
                    this.field1691 = this.field1686 - var2;
                }
            } else {
                this.field1692 = 0;
            }
            return false;
        } else if (this.field1682 == Integer.MIN_VALUE) {
            this.field1682 = 0;
            this.field1686 = 0;
            this.field1685 = 0;
            this.field1680 = 0;
            this.method3312();
            return true;
        } else {
            this.method2092();
            return false;
        }
    }

    @ObfuscatedName("dn.ap([B[IIIIIIILdn;)I")
    public static int method2026(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class120 arg8) {
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
        arg8.field1681 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.aj(I[B[IIIIIIIILdn;)I")
    public static int method2027(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class120 arg10) {
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
        arg10.field1681 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dn.bz([B[IIIIIIILdn;)I")
    public static int method2028(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class120 arg8) {
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
        arg8.field1681 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bu(I[B[IIIIIIIILdn;)I")
    public static int method2068(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class120 arg10) {
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
        arg10.field1681 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dn.bq(II[B[IIIIIIILdn;II)I")
    public static int method2121(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class120 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
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
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field1681 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bs(II[B[IIIIIIIILdn;II)I")
    public static int method2031(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class120 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
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
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
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
        arg11.field1681 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dn.bv(II[B[IIIIIIILdn;II)I")
    public static int method2017(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class120 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
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
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field1681 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bh(II[B[IIIIIIIILdn;II)I")
    public static int method2032(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class120 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
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
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
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
        arg11.field1681 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dn.bx([B[IIIIIIIILdn;)I")
    public static int method2022(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class120 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1685 += (var14 - arg3) * arg9.field1693;
        arg9.field1686 += (var14 - arg3) * arg9.field1692;
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
        arg9.field1680 = var12 >> 2;
        arg9.field1681 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bn(I[B[IIIIIIIIIILdn;)I")
    public static int method2033(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class120 arg12) {
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
        arg12.field1680 += (var19 - arg4) * arg12.field1694;
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
        arg12.field1685 = var15 >> 2;
        arg12.field1686 = var16 >> 2;
        arg12.field1681 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dn.bl([B[IIIIIIIILdn;)I")
    public static int method2034(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class120 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1685 += (var14 - arg3) * arg9.field1693;
        arg9.field1686 += (var14 - arg3) * arg9.field1692;
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
        arg9.field1680 = var12 >> 2;
        arg9.field1681 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bf(I[B[IIIIIIIIIILdn;)I")
    public static int method2117(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class120 arg12) {
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
        arg12.field1680 += (var19 - arg4) * arg12.field1694;
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
        arg12.field1685 = var15 >> 2;
        arg12.field1686 = var16 >> 2;
        arg12.field1681 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dn.bd(II[B[IIIIIIIILdn;II)I")
    public static int method2036(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class120 arg11, int arg12, int arg13) {
        arg11.field1685 -= arg11.field1693 * arg5;
        arg11.field1686 -= arg11.field1692 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
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
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
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
        arg11.field1685 += arg11.field1693 * arg5;
        arg11.field1686 += arg11.field1692 * arg5;
        arg11.field1680 = arg6;
        arg11.field1681 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bw(II[B[IIIIIIIIIILdn;II)I")
    public static int method2094(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class120 arg13, int arg14, int arg15) {
        arg13.field1680 -= arg13.field1694 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
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
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
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
        arg13.field1680 += arg13.field1694 * var27;
        arg13.field1685 = arg6;
        arg13.field1686 = arg7;
        arg13.field1681 = arg4;
        return var27;
    }

    @ObfuscatedName("dn.br(II[B[IIIIIIIILdn;II)I")
    public static int method2108(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class120 arg11, int arg12, int arg13) {
        arg11.field1685 -= arg11.field1693 * arg5;
        arg11.field1686 -= arg11.field1692 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
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
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
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
        arg11.field1685 += arg11.field1693 * arg5;
        arg11.field1686 += arg11.field1692 * arg5;
        arg11.field1680 = arg6;
        arg11.field1681 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bt(II[B[IIIIIIIIIILdn;II)I")
    public static int method2001(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class120 arg13, int arg14, int arg15) {
        arg13.field1680 -= arg13.field1694 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
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
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
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
        arg13.field1680 += arg13.field1694 * var26;
        arg13.field1685 = arg6;
        arg13.field1686 = arg7;
        arg13.field1681 = arg4;
        return var26;
    }
}
