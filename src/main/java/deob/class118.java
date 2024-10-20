package deob;

@ObfuscatedName("de")
public class class118 extends class120 {

    @ObfuscatedName("de.c")
    public int field1655;

    @ObfuscatedName("de.o")
    public int field1657;

    @ObfuscatedName("de.i")
    public int field1660;

    @ObfuscatedName("de.u")
    public int field1663;

    @ObfuscatedName("de.g")
    public int field1658;

    @ObfuscatedName("de.m")
    public int field1659;

    @ObfuscatedName("de.s")
    public int field1667;

    @ObfuscatedName("de.x")
    public int field1661;

    @ObfuscatedName("de.p")
    public int field1662;

    @ObfuscatedName("de.k")
    public int field1668;

    @ObfuscatedName("de.r")
    public boolean field1664;

    @ObfuscatedName("de.v")
    public int field1665;

    @ObfuscatedName("de.h")
    public int field1654;

    @ObfuscatedName("de.t")
    public int field1666;

    @ObfuscatedName("de.a")
    public int field1656;

    @ObfuscatedName("de.c(II)I")
    public static int method1950(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("de.o(II)I")
    public static int method1890(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("de.aa()I")
    public int method1924() {
        int var1 = this.field1658 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1661 == 0) {
            var2 -= this.field1655 * var2 / (((class108) this.field1683).field1577.length << 8);
        } else if (this.field1661 >= 0) {
            var2 -= this.field1662 * var2 / ((class108) this.field1683).field1577.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1683 = arg0;
        this.field1662 = arg0.field1578;
        this.field1668 = arg0.field1579;
        this.field1664 = arg0.field1576;
        this.field1657 = arg1;
        this.field1660 = arg2;
        this.field1663 = 8192;
        this.field1655 = 0;
        this.method1939();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1683 = arg0;
        this.field1662 = arg0.field1578;
        this.field1668 = arg0.field1579;
        this.field1664 = arg0.field1576;
        this.field1657 = arg1;
        this.field1660 = arg2;
        this.field1663 = arg3;
        this.field1655 = 0;
        this.method1939();
    }

    @ObfuscatedName("de.i(Ldm;II)Lde;")
    public static class118 method1892(class108 arg0, int arg1, int arg2) {
        return arg0.field1577 == null || arg0.field1577.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1580 * 256L * (long) arg1 / (long) (Statics.field1276 * 100)), arg2 << 6);
    }

    @ObfuscatedName("de.u(Ldm;III)Lde;")
    public static class118 method1893(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1577 == null || arg0.field1577.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("de.g()V")
    public void method1939() {
        this.field1658 = this.field1660;
        this.field1659 = method1950(this.field1660, this.field1663);
        this.field1667 = method1890(this.field1660, this.field1663);
    }

    @ObfuscatedName("de.k(I)V")
    public synchronized void method1895(int arg0) {
        this.field1661 = arg0;
    }

    @ObfuscatedName("de.w(I)V")
    public synchronized void method1896(int arg0) {
        this.method1898(arg0 << 6, this.method1900());
    }

    @ObfuscatedName("de.v(I)V")
    public synchronized void method2016(int arg0) {
        this.method1898(arg0, this.method1900());
    }

    @ObfuscatedName("de.h(II)V")
    public synchronized void method1898(int arg0, int arg1) {
        this.field1660 = arg0;
        this.field1663 = arg1;
        this.field1665 = 0;
        this.method1939();
    }

    @ObfuscatedName("de.t()I")
    public synchronized int method1899() {
        return this.field1660 == Integer.MIN_VALUE ? 0 : this.field1660;
    }

    @ObfuscatedName("de.l()I")
    public synchronized int method1900() {
        return this.field1663 < 0 ? -1 : this.field1663;
    }

    @ObfuscatedName("de.q(I)V")
    public synchronized void method1901(int arg0) {
        int var2 = ((class108) this.field1683).field1577.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1655 = arg0;
    }

    @ObfuscatedName("de.f(Z)V")
    public synchronized void method1902(boolean arg0) {
        this.field1657 = (this.field1657 >>> 31) + (this.field1657 ^ this.field1657 >> 31);
        if (arg0) {
            this.field1657 = -this.field1657;
        }
    }

    @ObfuscatedName("de.j()V")
    public void method1903() {
        if (this.field1665 == 0) {
            return;
        }
        if (this.field1660 == Integer.MIN_VALUE) {
            this.field1660 = 0;
        }
        this.field1665 = 0;
        this.method1939();
    }

    @ObfuscatedName("de.n(II)V")
    public synchronized void method1904(int arg0, int arg1) {
        this.method1996(arg0, arg1, this.method1900());
    }

    @ObfuscatedName("de.z(III)V")
    public synchronized void method1996(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1898(arg1, arg2);
            return;
        }
        int var4 = method1950(arg1, arg2);
        int var5 = method1890(arg1, arg2);
        if (this.field1659 == var4 && this.field1667 == var5) {
            this.field1665 = 0;
            return;
        }
        int var6 = arg1 - this.field1658;
        if (this.field1658 - arg1 > var6) {
            var6 = this.field1658 - arg1;
        }
        if (var4 - this.field1659 > var6) {
            var6 = var4 - this.field1659;
        }
        if (this.field1659 - var4 > var6) {
            var6 = this.field1659 - var4;
        }
        if (var5 - this.field1667 > var6) {
            var6 = var5 - this.field1667;
        }
        if (this.field1667 - var5 > var6) {
            var6 = this.field1667 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1665 = arg0;
        this.field1660 = arg1;
        this.field1663 = arg2;
        this.field1654 = (arg1 - this.field1658) / arg0;
        this.field1666 = (var4 - this.field1659) / arg0;
        this.field1656 = (var5 - this.field1667) / arg0;
    }

    @ObfuscatedName("de.ap(I)V")
    public synchronized void method1905(int arg0) {
        if (arg0 == 0) {
            this.method2016(0);
            this.method3287();
        } else if (this.field1659 == 0 && this.field1667 == 0) {
            this.field1665 = 0;
            this.field1660 = 0;
            this.field1658 = 0;
            this.method3287();
        } else {
            int var2 = -this.field1658;
            if (this.field1658 > var2) {
                var2 = this.field1658;
            }
            if (-this.field1659 > var2) {
                var2 = -this.field1659;
            }
            if (this.field1659 > var2) {
                var2 = this.field1659;
            }
            if (-this.field1667 > var2) {
                var2 = -this.field1667;
            }
            if (this.field1667 > var2) {
                var2 = this.field1667;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1665 = arg0;
            this.field1660 = Integer.MIN_VALUE;
            this.field1654 = -this.field1658 / arg0;
            this.field1666 = -this.field1659 / arg0;
            this.field1656 = -this.field1667 / arg0;
        }
    }

    @ObfuscatedName("de.aj(I)V")
    public synchronized void method2008(int arg0) {
        if (this.field1657 < 0) {
            this.field1657 = -arg0;
        } else {
            this.field1657 = arg0;
        }
    }

    @ObfuscatedName("de.af()I")
    public synchronized int method1949() {
        return this.field1657 < 0 ? -this.field1657 : this.field1657;
    }

    @ObfuscatedName("de.ak()Z")
    public boolean method1908() {
        return this.field1655 < 0 || this.field1655 >= ((class108) this.field1683).field1577.length << 8;
    }

    @ObfuscatedName("de.ar()Z")
    public boolean method1909() {
        return this.field1665 != 0;
    }

    @ObfuscatedName("de.m()Ldk;")
    public class120 method1678() {
        return null;
    }

    @ObfuscatedName("de.s()Ldk;")
    public class120 method1679() {
        return null;
    }

    @ObfuscatedName("de.x()I")
    public int method1694() {
        return this.field1660 == 0 && this.field1665 == 0 ? 0 : 1;
    }

    @ObfuscatedName("de.p([III)V")
    public synchronized void method1681(int[] arg0, int arg1, int arg2) {
        if (this.field1660 == 0 && this.field1665 == 0) {
            this.method1683(arg2);
            return;
        }
        class108 var4 = (class108) this.field1683;
        int var5 = this.field1662 << 8;
        int var6 = this.field1668 << 8;
        int var7 = var4.field1577.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1661 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1655 < 0) {
            if (this.field1657 <= 0) {
                this.method1903();
                this.method3287();
                return;
            }
            this.field1655 = 0;
        }
        if (this.field1655 >= var7) {
            if (this.field1657 >= 0) {
                this.method1903();
                this.method3287();
                return;
            }
            this.field1655 = var7 - 1;
        }
        if (this.field1661 >= 0) {
            if (this.field1661 > 0) {
                if (this.field1664) {
                    label131: {
                        if (this.field1657 < 0) {
                            var9 = this.method1911(arg0, arg1, var5, var10, var4.field1577[this.field1662]);
                            if (this.field1655 >= var5) {
                                return;
                            }
                            this.field1655 = var5 + var5 - 1 - this.field1655;
                            this.field1657 = -this.field1657;
                            if (--this.field1661 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1910(arg0, var9, var6, var10, var4.field1577[this.field1668 - 1]);
                            if (this.field1655 < var6) {
                                return;
                            }
                            this.field1655 = var6 + var6 - 1 - this.field1655;
                            this.field1657 = -this.field1657;
                            if (--this.field1661 == 0) {
                                break;
                            }
                            var9 = this.method1911(arg0, var9, var5, var10, var4.field1577[this.field1662]);
                            if (this.field1655 >= var5) {
                                return;
                            }
                            this.field1655 = var5 + var5 - 1 - this.field1655;
                            this.field1657 = -this.field1657;
                        } while (--this.field1661 != 0);
                    }
                } else if (this.field1657 < 0) {
                    while (true) {
                        var9 = this.method1911(arg0, var9, var5, var10, var4.field1577[this.field1668 - 1]);
                        if (this.field1655 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1655) / var8;
                        if (var12 >= this.field1661) {
                            this.field1655 += this.field1661 * var8;
                            this.field1661 = 0;
                            break;
                        }
                        this.field1655 += var8 * var12;
                        this.field1661 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1910(arg0, var9, var6, var10, var4.field1577[this.field1662]);
                        if (this.field1655 < var6) {
                            return;
                        }
                        int var13 = (this.field1655 - var5) / var8;
                        if (var13 >= this.field1661) {
                            this.field1655 -= this.field1661 * var8;
                            this.field1661 = 0;
                            break;
                        }
                        this.field1655 -= var8 * var13;
                        this.field1661 -= var13;
                    }
                }
            }
            if (this.field1657 < 0) {
                this.method1911(arg0, var9, 0, var10, 0);
                if (this.field1655 < 0) {
                    this.field1655 = -1;
                    this.method1903();
                    this.method3287();
                }
            } else {
                this.method1910(arg0, var9, var7, var10, 0);
                if (this.field1655 >= var7) {
                    this.field1655 = var7;
                    this.method1903();
                    this.method3287();
                }
            }
        } else if (this.field1664) {
            if (this.field1657 < 0) {
                var9 = this.method1911(arg0, arg1, var5, var10, var4.field1577[this.field1662]);
                if (this.field1655 >= var5) {
                    return;
                }
                this.field1655 = var5 + var5 - 1 - this.field1655;
                this.field1657 = -this.field1657;
            }
            while (true) {
                int var11 = this.method1910(arg0, var9, var6, var10, var4.field1577[this.field1668 - 1]);
                if (this.field1655 < var6) {
                    return;
                }
                this.field1655 = var6 + var6 - 1 - this.field1655;
                this.field1657 = -this.field1657;
                var9 = this.method1911(arg0, var11, var5, var10, var4.field1577[this.field1662]);
                if (this.field1655 >= var5) {
                    return;
                }
                this.field1655 = var5 + var5 - 1 - this.field1655;
                this.field1657 = -this.field1657;
            }
        } else if (this.field1657 < 0) {
            while (true) {
                var9 = this.method1911(arg0, var9, var5, var10, var4.field1577[this.field1668 - 1]);
                if (this.field1655 >= var5) {
                    return;
                }
                this.field1655 = var6 - 1 - (var6 - 1 - this.field1655) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1910(arg0, var9, var6, var10, var4.field1577[this.field1662]);
                if (this.field1655 < var6) {
                    return;
                }
                this.field1655 = (this.field1655 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("de.r(I)V")
    public synchronized void method1683(int arg0) {
        if (this.field1665 > 0) {
            if (arg0 >= this.field1665) {
                if (this.field1660 == Integer.MIN_VALUE) {
                    this.field1660 = 0;
                    this.field1667 = 0;
                    this.field1659 = 0;
                    this.field1658 = 0;
                    this.method3287();
                    arg0 = this.field1665;
                }
                this.field1665 = 0;
                this.method1939();
            } else {
                this.field1658 += this.field1654 * arg0;
                this.field1659 += this.field1666 * arg0;
                this.field1667 += this.field1656 * arg0;
                this.field1665 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1683;
        int var3 = this.field1662 << 8;
        int var4 = this.field1668 << 8;
        int var5 = var2.field1577.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1661 = 0;
        }
        if (this.field1655 < 0) {
            if (this.field1657 <= 0) {
                this.method1903();
                this.method3287();
                return;
            }
            this.field1655 = 0;
        }
        if (this.field1655 >= var5) {
            if (this.field1657 >= 0) {
                this.method1903();
                this.method3287();
                return;
            }
            this.field1655 = var5 - 1;
        }
        this.field1655 += this.field1657 * arg0;
        if (this.field1661 >= 0) {
            if (this.field1661 > 0) {
                if (this.field1664) {
                    label121: {
                        if (this.field1657 < 0) {
                            if (this.field1655 >= var3) {
                                return;
                            }
                            this.field1655 = var3 + var3 - 1 - this.field1655;
                            this.field1657 = -this.field1657;
                            if (--this.field1661 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1655 < var4) {
                                return;
                            }
                            this.field1655 = var4 + var4 - 1 - this.field1655;
                            this.field1657 = -this.field1657;
                            if (--this.field1661 == 0) {
                                break;
                            }
                            if (this.field1655 >= var3) {
                                return;
                            }
                            this.field1655 = var3 + var3 - 1 - this.field1655;
                            this.field1657 = -this.field1657;
                        } while (--this.field1661 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1657 < 0) {
                            if (this.field1655 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1655) / var6;
                            if (var7 >= this.field1661) {
                                this.field1655 += this.field1661 * var6;
                                this.field1661 = 0;
                                break label153;
                            }
                            this.field1655 += var6 * var7;
                            this.field1661 -= var7;
                        } else if (this.field1655 >= var4) {
                            int var8 = (this.field1655 - var3) / var6;
                            if (var8 >= this.field1661) {
                                this.field1655 -= this.field1661 * var6;
                                this.field1661 = 0;
                                break label153;
                            }
                            this.field1655 -= var6 * var8;
                            this.field1661 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1657 < 0) {
                if (this.field1655 < 0) {
                    this.field1655 = -1;
                    this.method1903();
                    this.method3287();
                }
            } else if (this.field1655 >= var5) {
                this.field1655 = var5;
                this.method1903();
                this.method3287();
            }
        } else if (this.field1664) {
            if (this.field1657 < 0) {
                if (this.field1655 >= var3) {
                    return;
                }
                this.field1655 = var3 + var3 - 1 - this.field1655;
                this.field1657 = -this.field1657;
            }
            while (this.field1655 >= var4) {
                this.field1655 = var4 + var4 - 1 - this.field1655;
                this.field1657 = -this.field1657;
                if (this.field1655 >= var3) {
                    return;
                }
                this.field1655 = var3 + var3 - 1 - this.field1655;
                this.field1657 = -this.field1657;
            }
        } else if (this.field1657 < 0) {
            if (this.field1655 >= var3) {
                return;
            }
            this.field1655 = var4 - 1 - (var4 - 1 - this.field1655) % var6;
        } else if (this.field1655 >= var4) {
            this.field1655 = (this.field1655 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("de.an([IIIII)I")
    public int method1910(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1665 > 0) {
                int var6 = this.field1665 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1665 += arg1;
                if (this.field1657 == 256 && (this.field1655 & 0xFF) == 0) {
                    if (Statics.field234) {
                        arg1 = method1922(0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, this.field1666, this.field1656, 0, var6, arg2, this);
                    } else {
                        arg1 = method1921(((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, this.field1654, 0, var6, arg2, this);
                    }
                } else if (Statics.field234) {
                    arg1 = method1974(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, this.field1666, this.field1656, 0, var6, arg2, this, this.field1657, arg4);
                } else {
                    arg1 = method1925(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, this.field1654, 0, var6, arg2, this, this.field1657, arg4);
                }
                this.field1665 -= arg1;
                if (this.field1665 != 0) {
                    return arg1;
                }
                if (!this.method1912()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1657 == 256 && (this.field1655 & 0xFF) == 0) {
                if (Statics.field234) {
                    return method1914(0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, 0, arg3, arg2, this);
                }
                return method1913(((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, 0, arg3, arg2, this);
            }
            if (Statics.field234) {
                return method1918(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, 0, arg3, arg2, this, this.field1657, arg4);
            }
            return method1917(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, 0, arg3, arg2, this, this.field1657, arg4);
        }
    }

    @ObfuscatedName("de.ae([IIIII)I")
    public int method1911(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1665 > 0) {
                int var6 = this.field1665 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1665 += arg1;
                if (this.field1657 == -256 && (this.field1655 & 0xFF) == 0) {
                    if (Statics.field234) {
                        arg1 = method1983(0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, this.field1666, this.field1656, 0, var6, arg2, this);
                    } else {
                        arg1 = method1981(((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, this.field1654, 0, var6, arg2, this);
                    }
                } else if (Statics.field234) {
                    arg1 = method1928(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, this.field1666, this.field1656, 0, var6, arg2, this, this.field1657, arg4);
                } else {
                    arg1 = method1927(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, this.field1654, 0, var6, arg2, this, this.field1657, arg4);
                }
                this.field1665 -= arg1;
                if (this.field1665 != 0) {
                    return arg1;
                }
                if (!this.method1912()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1657 == -256 && (this.field1655 & 0xFF) == 0) {
                if (Statics.field234) {
                    return method1889(0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, 0, arg3, arg2, this);
                }
                return method1915(((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, 0, arg3, arg2, this);
            }
            if (Statics.field234) {
                return method1920(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1659, this.field1667, 0, arg3, arg2, this, this.field1657, arg4);
            }
            return method1963(0, 0, ((class108) this.field1683).field1577, arg0, this.field1655, arg1, this.field1658, 0, arg3, arg2, this, this.field1657, arg4);
        }
    }

    @ObfuscatedName("de.ah()Z")
    public boolean method1912() {
        int var1 = this.field1660;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1950(var1, this.field1663);
            var2 = method1890(var1, this.field1663);
        }
        if (this.field1658 != var1 || this.field1659 != var3 || this.field1667 != var2) {
            if (this.field1658 < var1) {
                this.field1654 = 1;
                this.field1665 = var1 - this.field1658;
            } else if (this.field1658 > var1) {
                this.field1654 = -1;
                this.field1665 = this.field1658 - var1;
            } else {
                this.field1654 = 0;
            }
            if (this.field1659 < var3) {
                this.field1666 = 1;
                if (this.field1665 == 0 || this.field1665 > var3 - this.field1659) {
                    this.field1665 = var3 - this.field1659;
                }
            } else if (this.field1659 > var3) {
                this.field1666 = -1;
                if (this.field1665 == 0 || this.field1665 > this.field1659 - var3) {
                    this.field1665 = this.field1659 - var3;
                }
            } else {
                this.field1666 = 0;
            }
            if (this.field1667 < var2) {
                this.field1656 = 1;
                if (this.field1665 == 0 || this.field1665 > var2 - this.field1667) {
                    this.field1665 = var2 - this.field1667;
                }
            } else if (this.field1667 > var2) {
                this.field1656 = -1;
                if (this.field1665 == 0 || this.field1665 > this.field1667 - var2) {
                    this.field1665 = this.field1667 - var2;
                }
            } else {
                this.field1656 = 0;
            }
            return false;
        } else if (this.field1660 == Integer.MIN_VALUE) {
            this.field1660 = 0;
            this.field1667 = 0;
            this.field1659 = 0;
            this.field1658 = 0;
            this.method3287();
            return true;
        } else {
            this.method1939();
            return false;
        }
    }

    @ObfuscatedName("de.ax([B[IIIIIIILde;)I")
    public static int method1913(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1655 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("de.ai(I[B[IIIIIIIILde;)I")
    public static int method1914(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1655 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("de.aq([B[IIIIIIILde;)I")
    public static int method1915(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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
        arg8.field1655 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("de.as(I[B[IIIIIIIILde;)I")
    public static int method1889(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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
        arg10.field1655 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("de.au(II[B[IIIIIIILde;II)I")
    public static int method1917(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1655 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.az(II[B[IIIIIIIILde;II)I")
    public static int method1918(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1655 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("de.ay(II[B[IIIIIIILde;II)I")
    public static int method1963(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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
        arg10.field1655 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.ao(II[B[IIIIIIIILde;II)I")
    public static int method1920(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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
        arg11.field1655 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("de.bz([B[IIIIIIIILde;)I")
    public static int method1921(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1659 += (var14 - arg3) * arg9.field1666;
        arg9.field1667 += (var14 - arg3) * arg9.field1656;
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
        arg9.field1658 = var12 >> 2;
        arg9.field1655 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("de.bd(I[B[IIIIIIIIIILde;)I")
    public static int method1922(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1658 += (var19 - arg4) * arg12.field1654;
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
        arg12.field1659 = var15 >> 2;
        arg12.field1667 = var16 >> 2;
        arg12.field1655 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("de.bu([B[IIIIIIIILde;)I")
    public static int method1981(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1659 += (var14 - arg3) * arg9.field1666;
        arg9.field1667 += (var14 - arg3) * arg9.field1656;
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
        arg9.field1658 = var12 >> 2;
        arg9.field1655 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("de.bh(I[B[IIIIIIIIIILde;)I")
    public static int method1983(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1658 += (var19 - arg4) * arg12.field1654;
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
        arg12.field1659 = var15 >> 2;
        arg12.field1667 = var16 >> 2;
        arg12.field1655 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("de.bg(II[B[IIIIIIIILde;II)I")
    public static int method1925(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1659 -= arg11.field1666 * arg5;
        arg11.field1667 -= arg11.field1656 * arg5;
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
        arg11.field1659 += arg11.field1666 * arg5;
        arg11.field1667 += arg11.field1656 * arg5;
        arg11.field1658 = arg6;
        arg11.field1655 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.bl(II[B[IIIIIIIIIILde;II)I")
    public static int method1974(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1658 -= arg13.field1654 * arg5;
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
        arg13.field1658 += arg13.field1654 * var27;
        arg13.field1659 = arg6;
        arg13.field1667 = arg7;
        arg13.field1655 = arg4;
        return var27;
    }

    @ObfuscatedName("de.bo(II[B[IIIIIIIILde;II)I")
    public static int method1927(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1659 -= arg11.field1666 * arg5;
        arg11.field1667 -= arg11.field1656 * arg5;
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
        arg11.field1659 += arg11.field1666 * arg5;
        arg11.field1667 += arg11.field1656 * arg5;
        arg11.field1658 = arg6;
        arg11.field1655 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.bi(II[B[IIIIIIIIIILde;II)I")
    public static int method1928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1658 -= arg13.field1654 * arg5;
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
        arg13.field1658 += arg13.field1654 * var26;
        arg13.field1659 = arg6;
        arg13.field1667 = arg7;
        arg13.field1655 = arg4;
        return var26;
    }
}
