package deob;

@ObfuscatedName("dr")
public class class118 extends class120 {

    @ObfuscatedName("dr.a")
    public int field1691;

    @ObfuscatedName("dr.j")
    public int field1679;

    @ObfuscatedName("dr.n")
    public int field1692;

    @ObfuscatedName("dr.r")
    public int field1681;

    @ObfuscatedName("dr.v")
    public int field1678;

    @ObfuscatedName("dr.e")
    public int field1683;

    @ObfuscatedName("dr.l")
    public int field1684;

    @ObfuscatedName("dr.s")
    public int field1682;

    @ObfuscatedName("dr.p")
    public int field1686;

    @ObfuscatedName("dr.m")
    public int field1687;

    @ObfuscatedName("dr.u")
    public boolean field1688;

    @ObfuscatedName("dr.g")
    public int field1689;

    @ObfuscatedName("dr.k")
    public int field1690;

    @ObfuscatedName("dr.t")
    public int field1685;

    @ObfuscatedName("dr.c")
    public int field1680;

    @ObfuscatedName("dr.a(II)I")
    public static int method1946(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dr.j(II)I")
    public static int method1921(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dr.al()I")
    public int method1922() {
        int var1 = this.field1678 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1682 == 0) {
            var2 -= this.field1691 * var2 / (((class108) this.field1707).field1608.length << 8);
        } else if (this.field1682 >= 0) {
            var2 -= this.field1686 * var2 / ((class108) this.field1707).field1608.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1707 = arg0;
        this.field1686 = arg0.field1606;
        this.field1687 = arg0.field1607;
        this.field1688 = arg0.field1605;
        this.field1679 = arg1;
        this.field1692 = arg2;
        this.field1681 = 8192;
        this.field1691 = 0;
        this.method1965();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1707 = arg0;
        this.field1686 = arg0.field1606;
        this.field1687 = arg0.field1607;
        this.field1688 = arg0.field1605;
        this.field1679 = arg1;
        this.field1692 = arg2;
        this.field1681 = arg3;
        this.field1691 = 0;
        this.method1965();
    }

    @ObfuscatedName("dr.n(Ldm;II)Ldr;")
    public static class118 method1996(class108 arg0, int arg1, int arg2) {
        return arg0.field1608 == null || arg0.field1608.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1604 * 256L * (long) arg1 / (long) (Statics.field1552 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dr.r(Ldm;III)Ldr;")
    public static class118 method1980(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1608 == null || arg0.field1608.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dr.v()V")
    public void method1965() {
        this.field1678 = this.field1692;
        this.field1683 = method1946(this.field1692, this.field1681);
        this.field1684 = method1921(this.field1692, this.field1681);
    }

    @ObfuscatedName("dr.p(I)V")
    public synchronized void method2011(int arg0) {
        this.field1682 = arg0;
    }

    @ObfuscatedName("dr.u(I)V")
    public synchronized void method1931(int arg0) {
        this.method1929(arg0 << 6, this.method1947());
    }

    @ObfuscatedName("dr.g(I)V")
    public synchronized void method2053(int arg0) {
        this.method1929(arg0, this.method1947());
    }

    @ObfuscatedName("dr.k(II)V")
    public synchronized void method1929(int arg0, int arg1) {
        this.field1692 = arg0;
        this.field1681 = arg1;
        this.field1689 = 0;
        this.method1965();
    }

    @ObfuscatedName("dr.c()I")
    public synchronized int method1930() {
        return this.field1692 == Integer.MIN_VALUE ? 0 : this.field1692;
    }

    @ObfuscatedName("dr.o()I")
    public synchronized int method1947() {
        return this.field1681 < 0 ? -1 : this.field1681;
    }

    @ObfuscatedName("dr.x(I)V")
    public synchronized void method1967(int arg0) {
        int var2 = ((class108) this.field1707).field1608.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1691 = arg0;
    }

    @ObfuscatedName("dr.h(Z)V")
    public synchronized void method1933(boolean arg0) {
        this.field1679 = (this.field1679 >>> 31) + (this.field1679 ^ this.field1679 >> 31);
        if (arg0) {
            this.field1679 = -this.field1679;
        }
    }

    @ObfuscatedName("dr.z()V")
    public void method1934() {
        if (this.field1689 == 0) {
            return;
        }
        if (this.field1692 == Integer.MIN_VALUE) {
            this.field1692 = 0;
        }
        this.field1689 = 0;
        this.method1965();
    }

    @ObfuscatedName("dr.i(II)V")
    public synchronized void method1924(int arg0, int arg1) {
        this.method1927(arg0, arg1, this.method1947());
    }

    @ObfuscatedName("dr.d(III)V")
    public synchronized void method1927(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1929(arg1, arg2);
            return;
        }
        int var4 = method1946(arg1, arg2);
        int var5 = method1921(arg1, arg2);
        if (this.field1683 == var4 && this.field1684 == var5) {
            this.field1689 = 0;
            return;
        }
        int var6 = arg1 - this.field1678;
        if (this.field1678 - arg1 > var6) {
            var6 = this.field1678 - arg1;
        }
        if (var4 - this.field1683 > var6) {
            var6 = var4 - this.field1683;
        }
        if (this.field1683 - var4 > var6) {
            var6 = this.field1683 - var4;
        }
        if (var5 - this.field1684 > var6) {
            var6 = var5 - this.field1684;
        }
        if (this.field1684 - var5 > var6) {
            var6 = this.field1684 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1689 = arg0;
        this.field1692 = arg1;
        this.field1681 = arg2;
        this.field1690 = (arg1 - this.field1678) / arg0;
        this.field1685 = (var4 - this.field1683) / arg0;
        this.field1680 = (var5 - this.field1684) / arg0;
    }

    @ObfuscatedName("dr.aa(I)V")
    public synchronized void method1937(int arg0) {
        if (arg0 == 0) {
            this.method2053(0);
            this.method3308();
        } else if (this.field1683 == 0 && this.field1684 == 0) {
            this.field1689 = 0;
            this.field1692 = 0;
            this.field1678 = 0;
            this.method3308();
        } else {
            int var2 = -this.field1678;
            if (this.field1678 > var2) {
                var2 = this.field1678;
            }
            if (-this.field1683 > var2) {
                var2 = -this.field1683;
            }
            if (this.field1683 > var2) {
                var2 = this.field1683;
            }
            if (-this.field1684 > var2) {
                var2 = -this.field1684;
            }
            if (this.field1684 > var2) {
                var2 = this.field1684;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1689 = arg0;
            this.field1692 = Integer.MIN_VALUE;
            this.field1690 = -this.field1678 / arg0;
            this.field1685 = -this.field1683 / arg0;
            this.field1680 = -this.field1684 / arg0;
        }
    }

    @ObfuscatedName("dr.ag(I)V")
    public synchronized void method1938(int arg0) {
        if (this.field1679 < 0) {
            this.field1679 = -arg0;
        } else {
            this.field1679 = arg0;
        }
    }

    @ObfuscatedName("dr.aj()I")
    public synchronized int method1942() {
        return this.field1679 < 0 ? -this.field1679 : this.field1679;
    }

    @ObfuscatedName("dr.as()Z")
    public boolean method1940() {
        return this.field1691 < 0 || this.field1691 >= ((class108) this.field1707).field1608.length << 8;
    }

    @ObfuscatedName("dr.av()Z")
    public boolean method1941() {
        return this.field1689 != 0;
    }

    @ObfuscatedName("dr.e()Ldf;")
    public class120 method1698() {
        return null;
    }

    @ObfuscatedName("dr.l()Ldf;")
    public class120 method1719() {
        return null;
    }

    @ObfuscatedName("dr.s()I")
    public int method1700() {
        return this.field1692 == 0 && this.field1689 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dr.w([III)V")
    public synchronized void method1721(int[] arg0, int arg1, int arg2) {
        if (this.field1692 == 0 && this.field1689 == 0) {
            this.method1703(arg2);
            return;
        }
        class108 var4 = (class108) this.field1707;
        int var5 = this.field1686 << 8;
        int var6 = this.field1687 << 8;
        int var7 = var4.field1608.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1682 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1691 < 0) {
            if (this.field1679 <= 0) {
                this.method1934();
                this.method3308();
                return;
            }
            this.field1691 = 0;
        }
        if (this.field1691 >= var7) {
            if (this.field1679 >= 0) {
                this.method1934();
                this.method3308();
                return;
            }
            this.field1691 = var7 - 1;
        }
        if (this.field1682 >= 0) {
            if (this.field1682 > 0) {
                if (this.field1688) {
                    label131: {
                        if (this.field1679 < 0) {
                            var9 = this.method1993(arg0, arg1, var5, var10, var4.field1608[this.field1686]);
                            if (this.field1691 >= var5) {
                                return;
                            }
                            this.field1691 = var5 + var5 - 1 - this.field1691;
                            this.field1679 = -this.field1679;
                            if (--this.field1682 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1945(arg0, var9, var6, var10, var4.field1608[this.field1687 - 1]);
                            if (this.field1691 < var6) {
                                return;
                            }
                            this.field1691 = var6 + var6 - 1 - this.field1691;
                            this.field1679 = -this.field1679;
                            if (--this.field1682 == 0) {
                                break;
                            }
                            var9 = this.method1993(arg0, var9, var5, var10, var4.field1608[this.field1686]);
                            if (this.field1691 >= var5) {
                                return;
                            }
                            this.field1691 = var5 + var5 - 1 - this.field1691;
                            this.field1679 = -this.field1679;
                        } while (--this.field1682 != 0);
                    }
                } else if (this.field1679 < 0) {
                    while (true) {
                        var9 = this.method1993(arg0, var9, var5, var10, var4.field1608[this.field1687 - 1]);
                        if (this.field1691 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1691) / var8;
                        if (var12 >= this.field1682) {
                            this.field1691 += this.field1682 * var8;
                            this.field1682 = 0;
                            break;
                        }
                        this.field1691 += var8 * var12;
                        this.field1682 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1945(arg0, var9, var6, var10, var4.field1608[this.field1686]);
                        if (this.field1691 < var6) {
                            return;
                        }
                        int var13 = (this.field1691 - var5) / var8;
                        if (var13 >= this.field1682) {
                            this.field1691 -= this.field1682 * var8;
                            this.field1682 = 0;
                            break;
                        }
                        this.field1691 -= var8 * var13;
                        this.field1682 -= var13;
                    }
                }
            }
            if (this.field1679 < 0) {
                this.method1993(arg0, var9, 0, var10, 0);
                if (this.field1691 < 0) {
                    this.field1691 = -1;
                    this.method1934();
                    this.method3308();
                }
            } else {
                this.method1945(arg0, var9, var7, var10, 0);
                if (this.field1691 >= var7) {
                    this.field1691 = var7;
                    this.method1934();
                    this.method3308();
                }
            }
        } else if (this.field1688) {
            if (this.field1679 < 0) {
                var9 = this.method1993(arg0, arg1, var5, var10, var4.field1608[this.field1686]);
                if (this.field1691 >= var5) {
                    return;
                }
                this.field1691 = var5 + var5 - 1 - this.field1691;
                this.field1679 = -this.field1679;
            }
            while (true) {
                int var11 = this.method1945(arg0, var9, var6, var10, var4.field1608[this.field1687 - 1]);
                if (this.field1691 < var6) {
                    return;
                }
                this.field1691 = var6 + var6 - 1 - this.field1691;
                this.field1679 = -this.field1679;
                var9 = this.method1993(arg0, var11, var5, var10, var4.field1608[this.field1686]);
                if (this.field1691 >= var5) {
                    return;
                }
                this.field1691 = var5 + var5 - 1 - this.field1691;
                this.field1679 = -this.field1679;
            }
        } else if (this.field1679 < 0) {
            while (true) {
                var9 = this.method1993(arg0, var9, var5, var10, var4.field1608[this.field1687 - 1]);
                if (this.field1691 >= var5) {
                    return;
                }
                this.field1691 = var6 - 1 - (var6 - 1 - this.field1691) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1945(arg0, var9, var6, var10, var4.field1608[this.field1686]);
                if (this.field1691 < var6) {
                    return;
                }
                this.field1691 = (this.field1691 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dr.m(I)V")
    public synchronized void method1703(int arg0) {
        if (this.field1689 > 0) {
            if (arg0 >= this.field1689) {
                if (this.field1692 == Integer.MIN_VALUE) {
                    this.field1692 = 0;
                    this.field1684 = 0;
                    this.field1683 = 0;
                    this.field1678 = 0;
                    this.method3308();
                    arg0 = this.field1689;
                }
                this.field1689 = 0;
                this.method1965();
            } else {
                this.field1678 += this.field1690 * arg0;
                this.field1683 += this.field1685 * arg0;
                this.field1684 += this.field1680 * arg0;
                this.field1689 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1707;
        int var3 = this.field1686 << 8;
        int var4 = this.field1687 << 8;
        int var5 = var2.field1608.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1682 = 0;
        }
        if (this.field1691 < 0) {
            if (this.field1679 <= 0) {
                this.method1934();
                this.method3308();
                return;
            }
            this.field1691 = 0;
        }
        if (this.field1691 >= var5) {
            if (this.field1679 >= 0) {
                this.method1934();
                this.method3308();
                return;
            }
            this.field1691 = var5 - 1;
        }
        this.field1691 += this.field1679 * arg0;
        if (this.field1682 >= 0) {
            if (this.field1682 > 0) {
                if (this.field1688) {
                    label121: {
                        if (this.field1679 < 0) {
                            if (this.field1691 >= var3) {
                                return;
                            }
                            this.field1691 = var3 + var3 - 1 - this.field1691;
                            this.field1679 = -this.field1679;
                            if (--this.field1682 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1691 < var4) {
                                return;
                            }
                            this.field1691 = var4 + var4 - 1 - this.field1691;
                            this.field1679 = -this.field1679;
                            if (--this.field1682 == 0) {
                                break;
                            }
                            if (this.field1691 >= var3) {
                                return;
                            }
                            this.field1691 = var3 + var3 - 1 - this.field1691;
                            this.field1679 = -this.field1679;
                        } while (--this.field1682 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1679 < 0) {
                            if (this.field1691 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1691) / var6;
                            if (var7 >= this.field1682) {
                                this.field1691 += this.field1682 * var6;
                                this.field1682 = 0;
                                break label153;
                            }
                            this.field1691 += var6 * var7;
                            this.field1682 -= var7;
                        } else if (this.field1691 >= var4) {
                            int var8 = (this.field1691 - var3) / var6;
                            if (var8 >= this.field1682) {
                                this.field1691 -= this.field1682 * var6;
                                this.field1682 = 0;
                                break label153;
                            }
                            this.field1691 -= var6 * var8;
                            this.field1682 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1679 < 0) {
                if (this.field1691 < 0) {
                    this.field1691 = -1;
                    this.method1934();
                    this.method3308();
                }
            } else if (this.field1691 >= var5) {
                this.field1691 = var5;
                this.method1934();
                this.method3308();
            }
        } else if (this.field1688) {
            if (this.field1679 < 0) {
                if (this.field1691 >= var3) {
                    return;
                }
                this.field1691 = var3 + var3 - 1 - this.field1691;
                this.field1679 = -this.field1679;
            }
            while (this.field1691 >= var4) {
                this.field1691 = var4 + var4 - 1 - this.field1691;
                this.field1679 = -this.field1679;
                if (this.field1691 >= var3) {
                    return;
                }
                this.field1691 = var3 + var3 - 1 - this.field1691;
                this.field1679 = -this.field1679;
            }
        } else if (this.field1679 < 0) {
            if (this.field1691 >= var3) {
                return;
            }
            this.field1691 = var4 - 1 - (var4 - 1 - this.field1691) % var6;
        } else if (this.field1691 >= var4) {
            this.field1691 = (this.field1691 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dr.ab([IIIII)I")
    public int method1945(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1689 > 0) {
                int var6 = this.field1689 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1689 += arg1;
                if (this.field1679 == 256 && (this.field1691 & 0xFF) == 0) {
                    if (Statics.field1628) {
                        arg1 = method1957(0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, this.field1685, this.field1680, 0, var6, arg2, this);
                    } else {
                        arg1 = method1973(((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, this.field1690, 0, var6, arg2, this);
                    }
                } else if (Statics.field1628) {
                    arg1 = method1935(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, this.field1685, this.field1680, 0, var6, arg2, this, this.field1679, arg4);
                } else {
                    arg1 = method1960(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, this.field1690, 0, var6, arg2, this, this.field1679, arg4);
                }
                this.field1689 -= arg1;
                if (this.field1689 != 0) {
                    return arg1;
                }
                if (!this.method1936()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1679 == 256 && (this.field1691 & 0xFF) == 0) {
                if (Statics.field1628) {
                    return method1949(0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, 0, arg3, arg2, this);
                }
                return method2010(((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, 0, arg3, arg2, this);
            }
            if (Statics.field1628) {
                return method1971(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, 0, arg3, arg2, this, this.field1679, arg4);
            }
            return method1952(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, 0, arg3, arg2, this, this.field1679, arg4);
        }
    }

    @ObfuscatedName("dr.at([IIIII)I")
    public int method1993(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1689 > 0) {
                int var6 = this.field1689 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1689 += arg1;
                if (this.field1679 == -256 && (this.field1691 & 0xFF) == 0) {
                    if (Statics.field1628) {
                        arg1 = method1959(0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, this.field1685, this.field1680, 0, var6, arg2, this);
                    } else {
                        arg1 = method1958(((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, this.field1690, 0, var6, arg2, this);
                    }
                } else if (Statics.field1628) {
                    arg1 = method1963(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, this.field1685, this.field1680, 0, var6, arg2, this, this.field1679, arg4);
                } else {
                    arg1 = method1962(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, this.field1690, 0, var6, arg2, this, this.field1679, arg4);
                }
                this.field1689 -= arg1;
                if (this.field1689 != 0) {
                    return arg1;
                }
                if (!this.method1936()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1679 == -256 && (this.field1691 & 0xFF) == 0) {
                if (Statics.field1628) {
                    return method1951(0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, 0, arg3, arg2, this);
                }
                return method1950(((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, 0, arg3, arg2, this);
            }
            if (Statics.field1628) {
                return method1955(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1683, this.field1684, 0, arg3, arg2, this, this.field1679, arg4);
            }
            return method1954(0, 0, ((class108) this.field1707).field1608, arg0, this.field1691, arg1, this.field1678, 0, arg3, arg2, this, this.field1679, arg4);
        }
    }

    @ObfuscatedName("dr.ah()Z")
    public boolean method1936() {
        int var1 = this.field1692;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1946(var1, this.field1681);
            var2 = method1921(var1, this.field1681);
        }
        if (this.field1678 != var1 || this.field1683 != var3 || this.field1684 != var2) {
            if (this.field1678 < var1) {
                this.field1690 = 1;
                this.field1689 = var1 - this.field1678;
            } else if (this.field1678 > var1) {
                this.field1690 = -1;
                this.field1689 = this.field1678 - var1;
            } else {
                this.field1690 = 0;
            }
            if (this.field1683 < var3) {
                this.field1685 = 1;
                if (this.field1689 == 0 || this.field1689 > var3 - this.field1683) {
                    this.field1689 = var3 - this.field1683;
                }
            } else if (this.field1683 > var3) {
                this.field1685 = -1;
                if (this.field1689 == 0 || this.field1689 > this.field1683 - var3) {
                    this.field1689 = this.field1683 - var3;
                }
            } else {
                this.field1685 = 0;
            }
            if (this.field1684 < var2) {
                this.field1680 = 1;
                if (this.field1689 == 0 || this.field1689 > var2 - this.field1684) {
                    this.field1689 = var2 - this.field1684;
                }
            } else if (this.field1684 > var2) {
                this.field1680 = -1;
                if (this.field1689 == 0 || this.field1689 > this.field1684 - var2) {
                    this.field1689 = this.field1684 - var2;
                }
            } else {
                this.field1680 = 0;
            }
            return false;
        } else if (this.field1692 == Integer.MIN_VALUE) {
            this.field1692 = 0;
            this.field1684 = 0;
            this.field1683 = 0;
            this.field1678 = 0;
            this.method3308();
            return true;
        } else {
            this.method1965();
            return false;
        }
    }

    @ObfuscatedName("dr.an([B[IIIIIIILdr;)I")
    public static int method2010(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1691 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dr.ay(I[B[IIIIIIIILdr;)I")
    public static int method1949(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1691 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dr.ao([B[IIIIIIILdr;)I")
    public static int method1950(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1691 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dr.ac(I[B[IIIIIIIILdr;)I")
    public static int method1951(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1691 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dr.af(II[B[IIIIIIILdr;II)I")
    public static int method1952(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1691 = arg4;
        return arg5;
    }

    @ObfuscatedName("dr.bp(II[B[IIIIIIIILdr;II)I")
    public static int method1971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1691 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dr.bi(II[B[IIIIIIILdr;II)I")
    public static int method1954(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1691 = arg4;
        return arg5;
    }

    @ObfuscatedName("dr.ba(II[B[IIIIIIIILdr;II)I")
    public static int method1955(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1691 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dr.bd([B[IIIIIIIILdr;)I")
    public static int method1973(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1683 += (var14 - arg3) * arg9.field1685;
        arg9.field1684 += (var14 - arg3) * arg9.field1680;
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
        arg9.field1678 = var12 >> 2;
        arg9.field1691 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dr.bl(I[B[IIIIIIIIIILdr;)I")
    public static int method1957(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1678 += (var19 - arg4) * arg12.field1690;
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
        arg12.field1683 = var15 >> 2;
        arg12.field1684 = var16 >> 2;
        arg12.field1691 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dr.bc([B[IIIIIIIILdr;)I")
    public static int method1958(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1683 += (var14 - arg3) * arg9.field1685;
        arg9.field1684 += (var14 - arg3) * arg9.field1680;
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
        arg9.field1678 = var12 >> 2;
        arg9.field1691 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dr.bb(I[B[IIIIIIIIIILdr;)I")
    public static int method1959(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1678 += (var19 - arg4) * arg12.field1690;
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
        arg12.field1683 = var15 >> 2;
        arg12.field1684 = var16 >> 2;
        arg12.field1691 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dr.bn(II[B[IIIIIIIILdr;II)I")
    public static int method1960(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1683 -= arg11.field1685 * arg5;
        arg11.field1684 -= arg11.field1680 * arg5;
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
        arg11.field1683 += arg11.field1685 * arg5;
        arg11.field1684 += arg11.field1680 * arg5;
        arg11.field1678 = arg6;
        arg11.field1691 = arg4;
        return arg5;
    }

    @ObfuscatedName("dr.bs(II[B[IIIIIIIIIILdr;II)I")
    public static int method1935(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1678 -= arg13.field1690 * arg5;
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
        arg13.field1678 += arg13.field1690 * var27;
        arg13.field1683 = arg6;
        arg13.field1684 = arg7;
        arg13.field1691 = arg4;
        return var27;
    }

    @ObfuscatedName("dr.bh(II[B[IIIIIIIILdr;II)I")
    public static int method1962(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1683 -= arg11.field1685 * arg5;
        arg11.field1684 -= arg11.field1680 * arg5;
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
        arg11.field1683 += arg11.field1685 * arg5;
        arg11.field1684 += arg11.field1680 * arg5;
        arg11.field1678 = arg6;
        arg11.field1691 = arg4;
        return arg5;
    }

    @ObfuscatedName("dr.bo(II[B[IIIIIIIIIILdr;II)I")
    public static int method1963(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1678 -= arg13.field1690 * arg5;
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
        arg13.field1678 += arg13.field1690 * var26;
        arg13.field1683 = arg6;
        arg13.field1684 = arg7;
        arg13.field1691 = arg4;
        return var26;
    }
}
