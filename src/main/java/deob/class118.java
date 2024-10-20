package deob;

@ObfuscatedName("dm")
public class class118 extends class120 {

    @ObfuscatedName("dm.p")
    public int field1696;

    @ObfuscatedName("dm.m")
    public int field1690;

    @ObfuscatedName("dm.e")
    public int field1691;

    @ObfuscatedName("dm.t")
    public int field1692;

    @ObfuscatedName("dm.z")
    public int field1703;

    @ObfuscatedName("dm.j")
    public int field1695;

    @ObfuscatedName("dm.i")
    public int field1693;

    @ObfuscatedName("dm.f")
    public int field1698;

    @ObfuscatedName("dm.c")
    public int field1697;

    @ObfuscatedName("dm.o")
    public int field1689;

    @ObfuscatedName("dm.q")
    public boolean field1699;

    @ObfuscatedName("dm.n")
    public int field1694;

    @ObfuscatedName("dm.a")
    public int field1701;

    @ObfuscatedName("dm.g")
    public int field1702;

    @ObfuscatedName("dm.v")
    public int field1700;

    @ObfuscatedName("dm.p(II)I")
    public static int method1973(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.m(II)I")
    public static int method1899(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.an()I")
    public int method1979() {
        int var1 = this.field1703 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1698 == 0) {
            var2 -= this.field1696 * var2 / (((class108) this.field1718).field1606.length << 8);
        } else if (this.field1698 >= 0) {
            var2 -= this.field1697 * var2 / ((class108) this.field1718).field1606.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1718 = arg0;
        this.field1697 = arg0.field1607;
        this.field1689 = arg0.field1608;
        this.field1699 = arg0.field1609;
        this.field1690 = arg1;
        this.field1691 = arg2;
        this.field1692 = 8192;
        this.field1696 = 0;
        this.method1905();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1718 = arg0;
        this.field1697 = arg0.field1607;
        this.field1689 = arg0.field1608;
        this.field1699 = arg0.field1609;
        this.field1690 = arg1;
        this.field1691 = arg2;
        this.field1692 = arg3;
        this.field1696 = 0;
        this.method1905();
    }

    @ObfuscatedName("dm.e(Ldc;II)Ldm;")
    public static class118 method1903(class108 arg0, int arg1, int arg2) {
        return arg0.field1606 == null || arg0.field1606.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1605 * 256L * (long) arg1 / (long) (Statics.field1636 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dm.t(Ldc;III)Ldm;")
    public static class118 method1904(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1606 == null || arg0.field1606.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dm.w()V")
    public void method1905() {
        this.field1703 = this.field1691;
        this.field1695 = method1973(this.field1691, this.field1692);
        this.field1693 = method1899(this.field1691, this.field1692);
    }

    @ObfuscatedName("dm.q(I)V")
    public synchronized void method1996(int arg0) {
        this.field1698 = arg0;
    }

    @ObfuscatedName("dm.a(I)V")
    public synchronized void method1907(int arg0) {
        this.method1909(arg0 << 6, this.method1910());
    }

    @ObfuscatedName("dm.g(I)V")
    public synchronized void method1908(int arg0) {
        this.method1909(arg0, this.method1910());
    }

    @ObfuscatedName("dm.v(II)V")
    public synchronized void method1909(int arg0, int arg1) {
        this.field1691 = arg0;
        this.field1692 = arg1;
        this.field1694 = 0;
        this.method1905();
    }

    @ObfuscatedName("dm.s()I")
    public synchronized int method1956() {
        return this.field1691 == Integer.MIN_VALUE ? 0 : this.field1691;
    }

    @ObfuscatedName("dm.k()I")
    public synchronized int method1910() {
        return this.field1692 < 0 ? -1 : this.field1692;
    }

    @ObfuscatedName("dm.r(I)V")
    public synchronized void method1911(int arg0) {
        int var2 = ((class108) this.field1718).field1606.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1696 = arg0;
    }

    @ObfuscatedName("dm.l(Z)V")
    public synchronized void method1912(boolean arg0) {
        this.field1690 = (this.field1690 >>> 31) + (this.field1690 ^ this.field1690 >> 31);
        if (arg0) {
            this.field1690 = -this.field1690;
        }
    }

    @ObfuscatedName("dm.d()V")
    public void method1913() {
        if (this.field1694 == 0) {
            return;
        }
        if (this.field1691 == Integer.MIN_VALUE) {
            this.field1691 = 0;
        }
        this.field1694 = 0;
        this.method1905();
    }

    @ObfuscatedName("dm.x(II)V")
    public synchronized void method1914(int arg0, int arg1) {
        this.method1915(arg0, arg1, this.method1910());
    }

    @ObfuscatedName("dm.b(III)V")
    public synchronized void method1915(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1909(arg1, arg2);
            return;
        }
        int var4 = method1973(arg1, arg2);
        int var5 = method1899(arg1, arg2);
        if (this.field1695 == var4 && this.field1693 == var5) {
            this.field1694 = 0;
            return;
        }
        int var6 = arg1 - this.field1703;
        if (this.field1703 - arg1 > var6) {
            var6 = this.field1703 - arg1;
        }
        if (var4 - this.field1695 > var6) {
            var6 = var4 - this.field1695;
        }
        if (this.field1695 - var4 > var6) {
            var6 = this.field1695 - var4;
        }
        if (var5 - this.field1693 > var6) {
            var6 = var5 - this.field1693;
        }
        if (this.field1693 - var5 > var6) {
            var6 = this.field1693 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1694 = arg0;
        this.field1691 = arg1;
        this.field1692 = arg2;
        this.field1701 = (arg1 - this.field1703) / arg0;
        this.field1702 = (var4 - this.field1695) / arg0;
        this.field1700 = (var5 - this.field1693) / arg0;
    }

    @ObfuscatedName("dm.y(I)V")
    public synchronized void method1916(int arg0) {
        if (arg0 == 0) {
            this.method1908(0);
            this.method3234();
        } else if (this.field1695 == 0 && this.field1693 == 0) {
            this.field1694 = 0;
            this.field1691 = 0;
            this.field1703 = 0;
            this.method3234();
        } else {
            int var2 = -this.field1703;
            if (this.field1703 > var2) {
                var2 = this.field1703;
            }
            if (-this.field1695 > var2) {
                var2 = -this.field1695;
            }
            if (this.field1695 > var2) {
                var2 = this.field1695;
            }
            if (-this.field1693 > var2) {
                var2 = -this.field1693;
            }
            if (this.field1693 > var2) {
                var2 = this.field1693;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1694 = arg0;
            this.field1691 = Integer.MIN_VALUE;
            this.field1701 = -this.field1703 / arg0;
            this.field1702 = -this.field1695 / arg0;
            this.field1700 = -this.field1693 / arg0;
        }
    }

    @ObfuscatedName("dm.u(I)V")
    public synchronized void method1993(int arg0) {
        if (this.field1690 < 0) {
            this.field1690 = -arg0;
        } else {
            this.field1690 = arg0;
        }
    }

    @ObfuscatedName("dm.am()I")
    public synchronized int method1972() {
        return this.field1690 < 0 ? -this.field1690 : this.field1690;
    }

    @ObfuscatedName("dm.ar()Z")
    public boolean method1918() {
        return this.field1696 < 0 || this.field1696 >= ((class108) this.field1718).field1606.length << 8;
    }

    @ObfuscatedName("dm.ao()Z")
    public boolean method1998() {
        return this.field1694 != 0;
    }

    @ObfuscatedName("dm.z()Ldb;")
    public class120 method1668() {
        return null;
    }

    @ObfuscatedName("dm.j()Ldb;")
    public class120 method1669() {
        return null;
    }

    @ObfuscatedName("dm.c()I")
    public int method1670() {
        return this.field1691 == 0 && this.field1694 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dm.o([III)V")
    public synchronized void method1671(int[] arg0, int arg1, int arg2) {
        if (this.field1691 == 0 && this.field1694 == 0) {
            this.method1673(arg2);
            return;
        }
        class108 var4 = (class108) this.field1718;
        int var5 = this.field1697 << 8;
        int var6 = this.field1689 << 8;
        int var7 = var4.field1606.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1698 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1696 < 0) {
            if (this.field1690 <= 0) {
                this.method1913();
                this.method3234();
                return;
            }
            this.field1696 = 0;
        }
        if (this.field1696 >= var7) {
            if (this.field1690 >= 0) {
                this.method1913();
                this.method3234();
                return;
            }
            this.field1696 = var7 - 1;
        }
        if (this.field1698 >= 0) {
            if (this.field1698 > 0) {
                if (this.field1699) {
                    label131: {
                        if (this.field1690 < 0) {
                            var9 = this.method1922(arg0, arg1, var5, var10, var4.field1606[this.field1697]);
                            if (this.field1696 >= var5) {
                                return;
                            }
                            this.field1696 = var5 + var5 - 1 - this.field1696;
                            this.field1690 = -this.field1690;
                            if (--this.field1698 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1921(arg0, var9, var6, var10, var4.field1606[this.field1689 - 1]);
                            if (this.field1696 < var6) {
                                return;
                            }
                            this.field1696 = var6 + var6 - 1 - this.field1696;
                            this.field1690 = -this.field1690;
                            if (--this.field1698 == 0) {
                                break;
                            }
                            var9 = this.method1922(arg0, var9, var5, var10, var4.field1606[this.field1697]);
                            if (this.field1696 >= var5) {
                                return;
                            }
                            this.field1696 = var5 + var5 - 1 - this.field1696;
                            this.field1690 = -this.field1690;
                        } while (--this.field1698 != 0);
                    }
                } else if (this.field1690 < 0) {
                    while (true) {
                        var9 = this.method1922(arg0, var9, var5, var10, var4.field1606[this.field1689 - 1]);
                        if (this.field1696 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1696) / var8;
                        if (var12 >= this.field1698) {
                            this.field1696 += this.field1698 * var8;
                            this.field1698 = 0;
                            break;
                        }
                        this.field1696 += var8 * var12;
                        this.field1698 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1921(arg0, var9, var6, var10, var4.field1606[this.field1697]);
                        if (this.field1696 < var6) {
                            return;
                        }
                        int var13 = (this.field1696 - var5) / var8;
                        if (var13 >= this.field1698) {
                            this.field1696 -= this.field1698 * var8;
                            this.field1698 = 0;
                            break;
                        }
                        this.field1696 -= var8 * var13;
                        this.field1698 -= var13;
                    }
                }
            }
            if (this.field1690 < 0) {
                this.method1922(arg0, var9, 0, var10, 0);
                if (this.field1696 < 0) {
                    this.field1696 = -1;
                    this.method1913();
                    this.method3234();
                }
            } else {
                this.method1921(arg0, var9, var7, var10, 0);
                if (this.field1696 >= var7) {
                    this.field1696 = var7;
                    this.method1913();
                    this.method3234();
                }
            }
        } else if (this.field1699) {
            if (this.field1690 < 0) {
                var9 = this.method1922(arg0, arg1, var5, var10, var4.field1606[this.field1697]);
                if (this.field1696 >= var5) {
                    return;
                }
                this.field1696 = var5 + var5 - 1 - this.field1696;
                this.field1690 = -this.field1690;
            }
            while (true) {
                int var11 = this.method1921(arg0, var9, var6, var10, var4.field1606[this.field1689 - 1]);
                if (this.field1696 < var6) {
                    return;
                }
                this.field1696 = var6 + var6 - 1 - this.field1696;
                this.field1690 = -this.field1690;
                var9 = this.method1922(arg0, var11, var5, var10, var4.field1606[this.field1697]);
                if (this.field1696 >= var5) {
                    return;
                }
                this.field1696 = var5 + var5 - 1 - this.field1696;
                this.field1690 = -this.field1690;
            }
        } else if (this.field1690 < 0) {
            while (true) {
                var9 = this.method1922(arg0, var9, var5, var10, var4.field1606[this.field1689 - 1]);
                if (this.field1696 >= var5) {
                    return;
                }
                this.field1696 = var6 - 1 - (var6 - 1 - this.field1696) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1921(arg0, var9, var6, var10, var4.field1606[this.field1697]);
                if (this.field1696 < var6) {
                    return;
                }
                this.field1696 = (this.field1696 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dm.n(I)V")
    public synchronized void method1673(int arg0) {
        if (this.field1694 > 0) {
            if (arg0 >= this.field1694) {
                if (this.field1691 == Integer.MIN_VALUE) {
                    this.field1691 = 0;
                    this.field1693 = 0;
                    this.field1695 = 0;
                    this.field1703 = 0;
                    this.method3234();
                    arg0 = this.field1694;
                }
                this.field1694 = 0;
                this.method1905();
            } else {
                this.field1703 += this.field1701 * arg0;
                this.field1695 += this.field1702 * arg0;
                this.field1693 += this.field1700 * arg0;
                this.field1694 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1718;
        int var3 = this.field1697 << 8;
        int var4 = this.field1689 << 8;
        int var5 = var2.field1606.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1698 = 0;
        }
        if (this.field1696 < 0) {
            if (this.field1690 <= 0) {
                this.method1913();
                this.method3234();
                return;
            }
            this.field1696 = 0;
        }
        if (this.field1696 >= var5) {
            if (this.field1690 >= 0) {
                this.method1913();
                this.method3234();
                return;
            }
            this.field1696 = var5 - 1;
        }
        this.field1696 += this.field1690 * arg0;
        if (this.field1698 >= 0) {
            if (this.field1698 > 0) {
                if (this.field1699) {
                    label121: {
                        if (this.field1690 < 0) {
                            if (this.field1696 >= var3) {
                                return;
                            }
                            this.field1696 = var3 + var3 - 1 - this.field1696;
                            this.field1690 = -this.field1690;
                            if (--this.field1698 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1696 < var4) {
                                return;
                            }
                            this.field1696 = var4 + var4 - 1 - this.field1696;
                            this.field1690 = -this.field1690;
                            if (--this.field1698 == 0) {
                                break;
                            }
                            if (this.field1696 >= var3) {
                                return;
                            }
                            this.field1696 = var3 + var3 - 1 - this.field1696;
                            this.field1690 = -this.field1690;
                        } while (--this.field1698 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1690 < 0) {
                            if (this.field1696 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1696) / var6;
                            if (var7 >= this.field1698) {
                                this.field1696 += this.field1698 * var6;
                                this.field1698 = 0;
                                break label153;
                            }
                            this.field1696 += var6 * var7;
                            this.field1698 -= var7;
                        } else if (this.field1696 >= var4) {
                            int var8 = (this.field1696 - var3) / var6;
                            if (var8 >= this.field1698) {
                                this.field1696 -= this.field1698 * var6;
                                this.field1698 = 0;
                                break label153;
                            }
                            this.field1696 -= var6 * var8;
                            this.field1698 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1690 < 0) {
                if (this.field1696 < 0) {
                    this.field1696 = -1;
                    this.method1913();
                    this.method3234();
                }
            } else if (this.field1696 >= var5) {
                this.field1696 = var5;
                this.method1913();
                this.method3234();
            }
        } else if (this.field1699) {
            if (this.field1690 < 0) {
                if (this.field1696 >= var3) {
                    return;
                }
                this.field1696 = var3 + var3 - 1 - this.field1696;
                this.field1690 = -this.field1690;
            }
            while (this.field1696 >= var4) {
                this.field1696 = var4 + var4 - 1 - this.field1696;
                this.field1690 = -this.field1690;
                if (this.field1696 >= var3) {
                    return;
                }
                this.field1696 = var3 + var3 - 1 - this.field1696;
                this.field1690 = -this.field1690;
            }
        } else if (this.field1690 < 0) {
            if (this.field1696 >= var3) {
                return;
            }
            this.field1696 = var4 - 1 - (var4 - 1 - this.field1696) % var6;
        } else if (this.field1696 >= var4) {
            this.field1696 = (this.field1696 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dm.ac([IIIII)I")
    public int method1921(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1694 > 0) {
                int var6 = this.field1694 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1694 += arg1;
                if (this.field1690 == 256 && (this.field1696 & 0xFF) == 0) {
                    if (Statics.field2850) {
                        arg1 = method1931(0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, this.field1702, this.field1700, 0, var6, arg2, this);
                    } else {
                        arg1 = method1949(((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, this.field1701, 0, var6, arg2, this);
                    }
                } else if (Statics.field2850) {
                    arg1 = method1935(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, this.field1702, this.field1700, 0, var6, arg2, this, this.field1690, arg4);
                } else {
                    arg1 = method1920(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, this.field1701, 0, var6, arg2, this, this.field1690, arg4);
                }
                this.field1694 -= arg1;
                if (this.field1694 != 0) {
                    return arg1;
                }
                if (!this.method1919()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1690 == 256 && (this.field1696 & 0xFF) == 0) {
                if (Statics.field2850) {
                    return method1941(0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, 0, arg3, arg2, this);
                }
                return method1924(((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, 0, arg3, arg2, this);
            }
            if (Statics.field2850) {
                return method2001(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, 0, arg3, arg2, this, this.field1690, arg4);
            }
            return method1923(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, 0, arg3, arg2, this, this.field1690, arg4);
        }
    }

    @ObfuscatedName("dm.as([IIIII)I")
    public int method1922(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1694 > 0) {
                int var6 = this.field1694 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1694 += arg1;
                if (this.field1690 == -256 && (this.field1696 & 0xFF) == 0) {
                    if (Statics.field2850) {
                        arg1 = method1933(0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, this.field1702, this.field1700, 0, var6, arg2, this);
                    } else {
                        arg1 = method1932(((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, this.field1701, 0, var6, arg2, this);
                    }
                } else if (Statics.field2850) {
                    arg1 = method1937(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, this.field1702, this.field1700, 0, var6, arg2, this, this.field1690, arg4);
                } else {
                    arg1 = method1936(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, this.field1701, 0, var6, arg2, this, this.field1690, arg4);
                }
                this.field1694 -= arg1;
                if (this.field1694 != 0) {
                    return arg1;
                }
                if (!this.method1919()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1690 == -256 && (this.field1696 & 0xFF) == 0) {
                if (Statics.field2850) {
                    return method2004(0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, 0, arg3, arg2, this);
                }
                return method1930(((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, 0, arg3, arg2, this);
            }
            if (Statics.field2850) {
                return method1929(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1695, this.field1693, 0, arg3, arg2, this, this.field1690, arg4);
            }
            return method1928(0, 0, ((class108) this.field1718).field1606, arg0, this.field1696, arg1, this.field1703, 0, arg3, arg2, this, this.field1690, arg4);
        }
    }

    @ObfuscatedName("dm.az()Z")
    public boolean method1919() {
        int var1 = this.field1691;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1973(var1, this.field1692);
            var2 = method1899(var1, this.field1692);
        }
        if (this.field1703 != var1 || this.field1695 != var3 || this.field1693 != var2) {
            if (this.field1703 < var1) {
                this.field1701 = 1;
                this.field1694 = var1 - this.field1703;
            } else if (this.field1703 > var1) {
                this.field1701 = -1;
                this.field1694 = this.field1703 - var1;
            } else {
                this.field1701 = 0;
            }
            if (this.field1695 < var3) {
                this.field1702 = 1;
                if (this.field1694 == 0 || this.field1694 > var3 - this.field1695) {
                    this.field1694 = var3 - this.field1695;
                }
            } else if (this.field1695 > var3) {
                this.field1702 = -1;
                if (this.field1694 == 0 || this.field1694 > this.field1695 - var3) {
                    this.field1694 = this.field1695 - var3;
                }
            } else {
                this.field1702 = 0;
            }
            if (this.field1693 < var2) {
                this.field1700 = 1;
                if (this.field1694 == 0 || this.field1694 > var2 - this.field1693) {
                    this.field1694 = var2 - this.field1693;
                }
            } else if (this.field1693 > var2) {
                this.field1700 = -1;
                if (this.field1694 == 0 || this.field1694 > this.field1693 - var2) {
                    this.field1694 = this.field1693 - var2;
                }
            } else {
                this.field1700 = 0;
            }
            return false;
        } else if (this.field1691 == Integer.MIN_VALUE) {
            this.field1691 = 0;
            this.field1693 = 0;
            this.field1695 = 0;
            this.field1703 = 0;
            this.method3234();
            return true;
        } else {
            this.method1905();
            return false;
        }
    }

    @ObfuscatedName("dm.ai([B[IIIIIIILdm;)I")
    public static int method1924(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1696 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.aw(I[B[IIIIIIIILdm;)I")
    public static int method1941(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1696 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.au([B[IIIIIIILdm;)I")
    public static int method1930(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1696 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.ah(I[B[IIIIIIIILdm;)I")
    public static int method2004(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1696 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.ad(II[B[IIIIIIILdm;II)I")
    public static int method1923(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1696 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.at(II[B[IIIIIIIILdm;II)I")
    public static int method2001(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1696 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.bg(II[B[IIIIIIILdm;II)I")
    public static int method1928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1696 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bf(II[B[IIIIIIIILdm;II)I")
    public static int method1929(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1696 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.bi([B[IIIIIIIILdm;)I")
    public static int method1949(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1695 += (var14 - arg3) * arg9.field1702;
        arg9.field1693 += (var14 - arg3) * arg9.field1700;
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
        arg9.field1703 = var12 >> 2;
        arg9.field1696 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bv(I[B[IIIIIIIIIILdm;)I")
    public static int method1931(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1703 += (var19 - arg4) * arg12.field1701;
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
        arg12.field1695 = var15 >> 2;
        arg12.field1693 = var16 >> 2;
        arg12.field1696 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bz([B[IIIIIIIILdm;)I")
    public static int method1932(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1695 += (var14 - arg3) * arg9.field1702;
        arg9.field1693 += (var14 - arg3) * arg9.field1700;
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
        arg9.field1703 = var12 >> 2;
        arg9.field1696 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.ba(I[B[IIIIIIIIIILdm;)I")
    public static int method1933(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1703 += (var19 - arg4) * arg12.field1701;
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
        arg12.field1695 = var15 >> 2;
        arg12.field1693 = var16 >> 2;
        arg12.field1696 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bp(II[B[IIIIIIIILdm;II)I")
    public static int method1920(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1695 -= arg11.field1702 * arg5;
        arg11.field1693 -= arg11.field1700 * arg5;
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
        arg11.field1695 += arg11.field1702 * arg5;
        arg11.field1693 += arg11.field1700 * arg5;
        arg11.field1703 = arg6;
        arg11.field1696 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bn(II[B[IIIIIIIIIILdm;II)I")
    public static int method1935(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1703 -= arg13.field1701 * arg5;
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
        arg13.field1703 += arg13.field1701 * var27;
        arg13.field1695 = arg6;
        arg13.field1693 = arg7;
        arg13.field1696 = arg4;
        return var27;
    }

    @ObfuscatedName("dm.br(II[B[IIIIIIIILdm;II)I")
    public static int method1936(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1695 -= arg11.field1702 * arg5;
        arg11.field1693 -= arg11.field1700 * arg5;
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
        arg11.field1695 += arg11.field1702 * arg5;
        arg11.field1693 += arg11.field1700 * arg5;
        arg11.field1703 = arg6;
        arg11.field1696 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bc(II[B[IIIIIIIIIILdm;II)I")
    public static int method1937(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1703 -= arg13.field1701 * arg5;
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
        arg13.field1703 += arg13.field1701 * var26;
        arg13.field1695 = arg6;
        arg13.field1693 = arg7;
        arg13.field1696 = arg4;
        return var26;
    }
}
