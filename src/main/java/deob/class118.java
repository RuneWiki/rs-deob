package deob;

@ObfuscatedName("dz")
public class class118 extends class120 {

    @ObfuscatedName("dz.o")
    public int field1699;

    @ObfuscatedName("dz.x")
    public int field1694;

    @ObfuscatedName("dz.k")
    public int field1695;

    @ObfuscatedName("dz.f")
    public int field1707;

    @ObfuscatedName("dz.i")
    public int field1697;

    @ObfuscatedName("dz.j")
    public int field1698;

    @ObfuscatedName("dz.m")
    public int field1706;

    @ObfuscatedName("dz.u")
    public int field1693;

    @ObfuscatedName("dz.r")
    public int field1701;

    @ObfuscatedName("dz.v")
    public int field1702;

    @ObfuscatedName("dz.h")
    public boolean field1700;

    @ObfuscatedName("dz.a")
    public int field1704;

    @ObfuscatedName("dz.p")
    public int field1705;

    @ObfuscatedName("dz.q")
    public int field1696;

    @ObfuscatedName("dz.l")
    public int field1703;

    @ObfuscatedName("dz.w(II)I")
    public static int method1938(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dz.o(II)I")
    public static int method2046(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dz.ah()I")
    public int method2036() {
        int var1 = this.field1697 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1693 == 0) {
            var2 -= this.field1699 * var2 / (((class108) this.field1722).field1619.length << 8);
        } else if (this.field1693 >= 0) {
            var2 -= this.field1701 * var2 / ((class108) this.field1722).field1619.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1722 = arg0;
        this.field1701 = arg0.field1622;
        this.field1702 = arg0.field1618;
        this.field1700 = arg0.field1621;
        this.field1694 = arg1;
        this.field1695 = arg2;
        this.field1707 = 8192;
        this.field1699 = 0;
        this.method2002();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1722 = arg0;
        this.field1701 = arg0.field1622;
        this.field1702 = arg0.field1618;
        this.field1700 = arg0.field1621;
        this.field1694 = arg1;
        this.field1695 = arg2;
        this.field1707 = arg3;
        this.field1699 = 0;
        this.method2002();
    }

    @ObfuscatedName("dz.x(Ldv;II)Ldz;")
    public static class118 method1915(class108 arg0, int arg1, int arg2) {
        return arg0.field1619 == null || arg0.field1619.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1620 * 256L * (long) arg1 / (long) (Statics.field3411 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dz.k(Ldv;III)Ldz;")
    public static class118 method2009(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1619 == null || arg0.field1619.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dz.f()V")
    public void method2002() {
        this.field1697 = this.field1695;
        this.field1698 = method1938(this.field1695, this.field1707);
        this.field1706 = method2046(this.field1695, this.field1707);
    }

    @ObfuscatedName("dz.h(I)V")
    public synchronized void method1918(int arg0) {
        this.field1693 = arg0;
    }

    @ObfuscatedName("dz.p(I)V")
    public synchronized void method1919(int arg0) {
        this.method1921(arg0 << 6, this.method1923());
    }

    @ObfuscatedName("dz.q(I)V")
    public synchronized void method1920(int arg0) {
        this.method1921(arg0, this.method1923());
    }

    @ObfuscatedName("dz.l(II)V")
    public synchronized void method1921(int arg0, int arg1) {
        this.field1695 = arg0;
        this.field1707 = arg1;
        this.field1704 = 0;
        this.method2002();
    }

    @ObfuscatedName("dz.c()I")
    public synchronized int method1922() {
        return this.field1695 == Integer.MIN_VALUE ? 0 : this.field1695;
    }

    @ObfuscatedName("dz.n()I")
    public synchronized int method1923() {
        return this.field1707 < 0 ? -1 : this.field1707;
    }

    @ObfuscatedName("dz.z(I)V")
    public synchronized void method1924(int arg0) {
        int var2 = ((class108) this.field1722).field1619.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1699 = arg0;
    }

    @ObfuscatedName("dz.e(Z)V")
    public synchronized void method1933(boolean arg0) {
        this.field1694 = (this.field1694 >>> 31) + (this.field1694 ^ this.field1694 >> 31);
        if (arg0) {
            this.field1694 = -this.field1694;
        }
    }

    @ObfuscatedName("dz.t()V")
    public void method1926() {
        if (this.field1704 == 0) {
            return;
        }
        if (this.field1695 == Integer.MIN_VALUE) {
            this.field1695 = 0;
        }
        this.field1704 = 0;
        this.method2002();
    }

    @ObfuscatedName("dz.b(II)V")
    public synchronized void method1927(int arg0, int arg1) {
        this.method1925(arg0, arg1, this.method1923());
    }

    @ObfuscatedName("dz.s(III)V")
    public synchronized void method1925(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1921(arg1, arg2);
            return;
        }
        int var4 = method1938(arg1, arg2);
        int var5 = method2046(arg1, arg2);
        if (this.field1698 == var4 && this.field1706 == var5) {
            this.field1704 = 0;
            return;
        }
        int var6 = arg1 - this.field1697;
        if (this.field1697 - arg1 > var6) {
            var6 = this.field1697 - arg1;
        }
        if (var4 - this.field1698 > var6) {
            var6 = var4 - this.field1698;
        }
        if (this.field1698 - var4 > var6) {
            var6 = this.field1698 - var4;
        }
        if (var5 - this.field1706 > var6) {
            var6 = var5 - this.field1706;
        }
        if (this.field1706 - var5 > var6) {
            var6 = this.field1706 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1704 = arg0;
        this.field1695 = arg1;
        this.field1707 = arg2;
        this.field1705 = (arg1 - this.field1697) / arg0;
        this.field1696 = (var4 - this.field1698) / arg0;
        this.field1703 = (var5 - this.field1706) / arg0;
    }

    @ObfuscatedName("dz.ap(I)V")
    public synchronized void method2027(int arg0) {
        if (arg0 == 0) {
            this.method1920(0);
            this.method3294();
        } else if (this.field1698 == 0 && this.field1706 == 0) {
            this.field1704 = 0;
            this.field1695 = 0;
            this.field1697 = 0;
            this.method3294();
        } else {
            int var2 = -this.field1697;
            if (this.field1697 > var2) {
                var2 = this.field1697;
            }
            if (-this.field1698 > var2) {
                var2 = -this.field1698;
            }
            if (this.field1698 > var2) {
                var2 = this.field1698;
            }
            if (-this.field1706 > var2) {
                var2 = -this.field1706;
            }
            if (this.field1706 > var2) {
                var2 = this.field1706;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1704 = arg0;
            this.field1695 = Integer.MIN_VALUE;
            this.field1705 = -this.field1697 / arg0;
            this.field1696 = -this.field1698 / arg0;
            this.field1703 = -this.field1706 / arg0;
        }
    }

    @ObfuscatedName("dz.ac(I)V")
    public synchronized void method1911(int arg0) {
        if (this.field1694 < 0) {
            this.field1694 = -arg0;
        } else {
            this.field1694 = arg0;
        }
    }

    @ObfuscatedName("dz.af()I")
    public synchronized int method1931() {
        return this.field1694 < 0 ? -this.field1694 : this.field1694;
    }

    @ObfuscatedName("dz.aw()Z")
    public boolean method1987() {
        return this.field1699 < 0 || this.field1699 >= ((class108) this.field1722).field1619.length << 8;
    }

    @ObfuscatedName("dz.at()Z")
    public boolean method1917() {
        return this.field1704 != 0;
    }

    @ObfuscatedName("dz.i()Ldj;")
    public class120 method1691() {
        return null;
    }

    @ObfuscatedName("dz.j()Ldj;")
    public class120 method1716() {
        return null;
    }

    @ObfuscatedName("dz.m()I")
    public int method1693() {
        return this.field1695 == 0 && this.field1704 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dz.u([III)V")
    public synchronized void method1726(int[] arg0, int arg1, int arg2) {
        if (this.field1695 == 0 && this.field1704 == 0) {
            this.method1696(arg2);
            return;
        }
        class108 var4 = (class108) this.field1722;
        int var5 = this.field1701 << 8;
        int var6 = this.field1702 << 8;
        int var7 = var4.field1619.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1693 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1699 < 0) {
            if (this.field1694 <= 0) {
                this.method1926();
                this.method3294();
                return;
            }
            this.field1699 = 0;
        }
        if (this.field1699 >= var7) {
            if (this.field1694 >= 0) {
                this.method1926();
                this.method3294();
                return;
            }
            this.field1699 = var7 - 1;
        }
        if (this.field1693 >= 0) {
            if (this.field1693 > 0) {
                if (this.field1700) {
                    label131: {
                        if (this.field1694 < 0) {
                            var9 = this.method1940(arg0, arg1, var5, var10, var4.field1619[this.field1701]);
                            if (this.field1699 >= var5) {
                                return;
                            }
                            this.field1699 = var5 + var5 - 1 - this.field1699;
                            this.field1694 = -this.field1694;
                            if (--this.field1693 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1936(arg0, var9, var6, var10, var4.field1619[this.field1702 - 1]);
                            if (this.field1699 < var6) {
                                return;
                            }
                            this.field1699 = var6 + var6 - 1 - this.field1699;
                            this.field1694 = -this.field1694;
                            if (--this.field1693 == 0) {
                                break;
                            }
                            var9 = this.method1940(arg0, var9, var5, var10, var4.field1619[this.field1701]);
                            if (this.field1699 >= var5) {
                                return;
                            }
                            this.field1699 = var5 + var5 - 1 - this.field1699;
                            this.field1694 = -this.field1694;
                        } while (--this.field1693 != 0);
                    }
                } else if (this.field1694 < 0) {
                    while (true) {
                        var9 = this.method1940(arg0, var9, var5, var10, var4.field1619[this.field1702 - 1]);
                        if (this.field1699 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1699) / var8;
                        if (var12 >= this.field1693) {
                            this.field1699 += this.field1693 * var8;
                            this.field1693 = 0;
                            break;
                        }
                        this.field1699 += var8 * var12;
                        this.field1693 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1936(arg0, var9, var6, var10, var4.field1619[this.field1701]);
                        if (this.field1699 < var6) {
                            return;
                        }
                        int var13 = (this.field1699 - var5) / var8;
                        if (var13 >= this.field1693) {
                            this.field1699 -= this.field1693 * var8;
                            this.field1693 = 0;
                            break;
                        }
                        this.field1699 -= var8 * var13;
                        this.field1693 -= var13;
                    }
                }
            }
            if (this.field1694 < 0) {
                this.method1940(arg0, var9, 0, var10, 0);
                if (this.field1699 < 0) {
                    this.field1699 = -1;
                    this.method1926();
                    this.method3294();
                }
            } else {
                this.method1936(arg0, var9, var7, var10, 0);
                if (this.field1699 >= var7) {
                    this.field1699 = var7;
                    this.method1926();
                    this.method3294();
                }
            }
        } else if (this.field1700) {
            if (this.field1694 < 0) {
                var9 = this.method1940(arg0, arg1, var5, var10, var4.field1619[this.field1701]);
                if (this.field1699 >= var5) {
                    return;
                }
                this.field1699 = var5 + var5 - 1 - this.field1699;
                this.field1694 = -this.field1694;
            }
            while (true) {
                int var11 = this.method1936(arg0, var9, var6, var10, var4.field1619[this.field1702 - 1]);
                if (this.field1699 < var6) {
                    return;
                }
                this.field1699 = var6 + var6 - 1 - this.field1699;
                this.field1694 = -this.field1694;
                var9 = this.method1940(arg0, var11, var5, var10, var4.field1619[this.field1701]);
                if (this.field1699 >= var5) {
                    return;
                }
                this.field1699 = var5 + var5 - 1 - this.field1699;
                this.field1694 = -this.field1694;
            }
        } else if (this.field1694 < 0) {
            while (true) {
                var9 = this.method1940(arg0, var9, var5, var10, var4.field1619[this.field1702 - 1]);
                if (this.field1699 >= var5) {
                    return;
                }
                this.field1699 = var6 - 1 - (var6 - 1 - this.field1699) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1936(arg0, var9, var6, var10, var4.field1619[this.field1701]);
                if (this.field1699 < var6) {
                    return;
                }
                this.field1699 = (this.field1699 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dz.a(I)V")
    public synchronized void method1696(int arg0) {
        if (this.field1704 > 0) {
            if (arg0 >= this.field1704) {
                if (this.field1695 == Integer.MIN_VALUE) {
                    this.field1695 = 0;
                    this.field1706 = 0;
                    this.field1698 = 0;
                    this.field1697 = 0;
                    this.method3294();
                    arg0 = this.field1704;
                }
                this.field1704 = 0;
                this.method2002();
            } else {
                this.field1697 += this.field1705 * arg0;
                this.field1698 += this.field1696 * arg0;
                this.field1706 += this.field1703 * arg0;
                this.field1704 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1722;
        int var3 = this.field1701 << 8;
        int var4 = this.field1702 << 8;
        int var5 = var2.field1619.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1693 = 0;
        }
        if (this.field1699 < 0) {
            if (this.field1694 <= 0) {
                this.method1926();
                this.method3294();
                return;
            }
            this.field1699 = 0;
        }
        if (this.field1699 >= var5) {
            if (this.field1694 >= 0) {
                this.method1926();
                this.method3294();
                return;
            }
            this.field1699 = var5 - 1;
        }
        this.field1699 += this.field1694 * arg0;
        if (this.field1693 >= 0) {
            if (this.field1693 > 0) {
                if (this.field1700) {
                    label121: {
                        if (this.field1694 < 0) {
                            if (this.field1699 >= var3) {
                                return;
                            }
                            this.field1699 = var3 + var3 - 1 - this.field1699;
                            this.field1694 = -this.field1694;
                            if (--this.field1693 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1699 < var4) {
                                return;
                            }
                            this.field1699 = var4 + var4 - 1 - this.field1699;
                            this.field1694 = -this.field1694;
                            if (--this.field1693 == 0) {
                                break;
                            }
                            if (this.field1699 >= var3) {
                                return;
                            }
                            this.field1699 = var3 + var3 - 1 - this.field1699;
                            this.field1694 = -this.field1694;
                        } while (--this.field1693 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1694 < 0) {
                            if (this.field1699 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1699) / var6;
                            if (var7 >= this.field1693) {
                                this.field1699 += this.field1693 * var6;
                                this.field1693 = 0;
                                break label153;
                            }
                            this.field1699 += var6 * var7;
                            this.field1693 -= var7;
                        } else if (this.field1699 >= var4) {
                            int var8 = (this.field1699 - var3) / var6;
                            if (var8 >= this.field1693) {
                                this.field1699 -= this.field1693 * var6;
                                this.field1693 = 0;
                                break label153;
                            }
                            this.field1699 -= var6 * var8;
                            this.field1693 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1694 < 0) {
                if (this.field1699 < 0) {
                    this.field1699 = -1;
                    this.method1926();
                    this.method3294();
                }
            } else if (this.field1699 >= var5) {
                this.field1699 = var5;
                this.method1926();
                this.method3294();
            }
        } else if (this.field1700) {
            if (this.field1694 < 0) {
                if (this.field1699 >= var3) {
                    return;
                }
                this.field1699 = var3 + var3 - 1 - this.field1699;
                this.field1694 = -this.field1694;
            }
            while (this.field1699 >= var4) {
                this.field1699 = var4 + var4 - 1 - this.field1699;
                this.field1694 = -this.field1694;
                if (this.field1699 >= var3) {
                    return;
                }
                this.field1699 = var3 + var3 - 1 - this.field1699;
                this.field1694 = -this.field1694;
            }
        } else if (this.field1694 < 0) {
            if (this.field1699 >= var3) {
                return;
            }
            this.field1699 = var4 - 1 - (var4 - 1 - this.field1699) % var6;
        } else if (this.field1699 >= var4) {
            this.field1699 = (this.field1699 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dz.aj([IIIII)I")
    public int method1936(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1704 > 0) {
                int var6 = this.field1704 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1704 += arg1;
                if (this.field1694 == 256 && (this.field1699 & 0xFF) == 0) {
                    if (Statics.field1638) {
                        arg1 = method1945(0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, this.field1696, this.field1703, 0, var6, arg2, this);
                    } else {
                        arg1 = method1944(((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, this.field1705, 0, var6, arg2, this);
                    }
                } else if (Statics.field1638) {
                    arg1 = method1949(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, this.field1696, this.field1703, 0, var6, arg2, this, this.field1694, arg4);
                } else {
                    arg1 = method1954(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, this.field1705, 0, var6, arg2, this, this.field1694, arg4);
                }
                this.field1704 -= arg1;
                if (this.field1704 != 0) {
                    return arg1;
                }
                if (!this.method2005()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1694 == 256 && (this.field1699 & 0xFF) == 0) {
                if (Statics.field1638) {
                    return method1991(0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, 0, arg3, arg2, this);
                }
                return method1966(((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, 0, arg3, arg2, this);
            }
            if (Statics.field1638) {
                return method1941(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, 0, arg3, arg2, this, this.field1694, arg4);
            }
            return method1932(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, 0, arg3, arg2, this, this.field1694, arg4);
        }
    }

    @ObfuscatedName("dz.al([IIIII)I")
    public int method1940(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1704 > 0) {
                int var6 = this.field1704 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1704 += arg1;
                if (this.field1694 == -256 && (this.field1699 & 0xFF) == 0) {
                    if (Statics.field1638) {
                        arg1 = method1947(0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, this.field1696, this.field1703, 0, var6, arg2, this);
                    } else {
                        arg1 = method1946(((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, this.field1705, 0, var6, arg2, this);
                    }
                } else if (Statics.field1638) {
                    arg1 = method1998(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, this.field1696, this.field1703, 0, var6, arg2, this, this.field1694, arg4);
                } else {
                    arg1 = method1950(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, this.field1705, 0, var6, arg2, this, this.field1694, arg4);
                }
                this.field1704 -= arg1;
                if (this.field1704 != 0) {
                    return arg1;
                }
                if (!this.method2005()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1694 == -256 && (this.field1699 & 0xFF) == 0) {
                if (Statics.field1638) {
                    return method1955(0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, 0, arg3, arg2, this);
                }
                return method1939(((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, 0, arg3, arg2, this);
            }
            if (Statics.field1638) {
                return method1912(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1698, this.field1706, 0, arg3, arg2, this, this.field1694, arg4);
            }
            return method1942(0, 0, ((class108) this.field1722).field1619, arg0, this.field1699, arg1, this.field1697, 0, arg3, arg2, this, this.field1694, arg4);
        }
    }

    @ObfuscatedName("dz.au()Z")
    public boolean method2005() {
        int var1 = this.field1695;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1938(var1, this.field1707);
            var2 = method2046(var1, this.field1707);
        }
        if (this.field1697 != var1 || this.field1698 != var3 || this.field1706 != var2) {
            if (this.field1697 < var1) {
                this.field1705 = 1;
                this.field1704 = var1 - this.field1697;
            } else if (this.field1697 > var1) {
                this.field1705 = -1;
                this.field1704 = this.field1697 - var1;
            } else {
                this.field1705 = 0;
            }
            if (this.field1698 < var3) {
                this.field1696 = 1;
                if (this.field1704 == 0 || this.field1704 > var3 - this.field1698) {
                    this.field1704 = var3 - this.field1698;
                }
            } else if (this.field1698 > var3) {
                this.field1696 = -1;
                if (this.field1704 == 0 || this.field1704 > this.field1698 - var3) {
                    this.field1704 = this.field1698 - var3;
                }
            } else {
                this.field1696 = 0;
            }
            if (this.field1706 < var2) {
                this.field1703 = 1;
                if (this.field1704 == 0 || this.field1704 > var2 - this.field1706) {
                    this.field1704 = var2 - this.field1706;
                }
            } else if (this.field1706 > var2) {
                this.field1703 = -1;
                if (this.field1704 == 0 || this.field1704 > this.field1706 - var2) {
                    this.field1704 = this.field1706 - var2;
                }
            } else {
                this.field1703 = 0;
            }
            return false;
        } else if (this.field1695 == Integer.MIN_VALUE) {
            this.field1695 = 0;
            this.field1706 = 0;
            this.field1698 = 0;
            this.field1697 = 0;
            this.method3294();
            return true;
        } else {
            this.method2002();
            return false;
        }
    }

    @ObfuscatedName("dz.aa([B[IIIIIIILdz;)I")
    public static int method1966(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1699 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dz.ao(I[B[IIIIIIIILdz;)I")
    public static int method1991(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1699 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dz.bm([B[IIIIIIILdz;)I")
    public static int method1939(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1699 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dz.bd(I[B[IIIIIIIILdz;)I")
    public static int method1955(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1699 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dz.bn(II[B[IIIIIIILdz;II)I")
    public static int method1932(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1699 = arg4;
        return arg5;
    }

    @ObfuscatedName("dz.by(II[B[IIIIIIIILdz;II)I")
    public static int method1941(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1699 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dz.bo(II[B[IIIIIIILdz;II)I")
    public static int method1942(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1699 = arg4;
        return arg5;
    }

    @ObfuscatedName("dz.ba(II[B[IIIIIIIILdz;II)I")
    public static int method1912(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1699 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dz.bv([B[IIIIIIIILdz;)I")
    public static int method1944(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1698 += (var14 - arg3) * arg9.field1696;
        arg9.field1706 += (var14 - arg3) * arg9.field1703;
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
        arg9.field1697 = var12 >> 2;
        arg9.field1699 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dz.bq(I[B[IIIIIIIIIILdz;)I")
    public static int method1945(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1697 += (var19 - arg4) * arg12.field1705;
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
        arg12.field1698 = var15 >> 2;
        arg12.field1706 = var16 >> 2;
        arg12.field1699 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dz.bt([B[IIIIIIIILdz;)I")
    public static int method1946(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1698 += (var14 - arg3) * arg9.field1696;
        arg9.field1706 += (var14 - arg3) * arg9.field1703;
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
        arg9.field1697 = var12 >> 2;
        arg9.field1699 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dz.bg(I[B[IIIIIIIIIILdz;)I")
    public static int method1947(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1697 += (var19 - arg4) * arg12.field1705;
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
        arg12.field1698 = var15 >> 2;
        arg12.field1706 = var16 >> 2;
        arg12.field1699 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dz.bl(II[B[IIIIIIIILdz;II)I")
    public static int method1954(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1698 -= arg11.field1696 * arg5;
        arg11.field1706 -= arg11.field1703 * arg5;
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
        arg11.field1698 += arg11.field1696 * arg5;
        arg11.field1706 += arg11.field1703 * arg5;
        arg11.field1697 = arg6;
        arg11.field1699 = arg4;
        return arg5;
    }

    @ObfuscatedName("dz.bb(II[B[IIIIIIIIIILdz;II)I")
    public static int method1949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1697 -= arg13.field1705 * arg5;
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
        arg13.field1697 += arg13.field1705 * var27;
        arg13.field1698 = arg6;
        arg13.field1706 = arg7;
        arg13.field1699 = arg4;
        return var27;
    }

    @ObfuscatedName("dz.bp(II[B[IIIIIIIILdz;II)I")
    public static int method1950(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1698 -= arg11.field1696 * arg5;
        arg11.field1706 -= arg11.field1703 * arg5;
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
        arg11.field1698 += arg11.field1696 * arg5;
        arg11.field1706 += arg11.field1703 * arg5;
        arg11.field1697 = arg6;
        arg11.field1699 = arg4;
        return arg5;
    }

    @ObfuscatedName("dz.bu(II[B[IIIIIIIIIILdz;II)I")
    public static int method1998(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1697 -= arg13.field1705 * arg5;
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
        arg13.field1697 += arg13.field1705 * var26;
        arg13.field1698 = arg6;
        arg13.field1706 = arg7;
        arg13.field1699 = arg4;
        return var26;
    }
}
