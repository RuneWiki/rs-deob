package deob;

@ObfuscatedName("ds")
public class class118 extends class120 {

    @ObfuscatedName("ds.n")
    public int field1699;

    @ObfuscatedName("ds.p")
    public int field1709;

    @ObfuscatedName("ds.i")
    public int field1705;

    @ObfuscatedName("ds.j")
    public int field1700;

    @ObfuscatedName("ds.f")
    public int field1698;

    @ObfuscatedName("ds.m")
    public int field1702;

    @ObfuscatedName("ds.c")
    public int field1703;

    @ObfuscatedName("ds.z")
    public int field1704;

    @ObfuscatedName("ds.h")
    public int field1708;

    @ObfuscatedName("ds.g")
    public int field1706;

    @ObfuscatedName("ds.e")
    public boolean field1707;

    @ObfuscatedName("ds.o")
    public int field1697;

    @ObfuscatedName("ds.x")
    public int field1701;

    @ObfuscatedName("ds.a")
    public int field1710;

    @ObfuscatedName("ds.y")
    public int field1711;

    @ObfuscatedName("ds.n(II)I")
    public static int method2084(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.p(II)I")
    public static int method1960(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.ag()I")
    public int method1961() {
        int var1 = this.field1698 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1704 == 0) {
            var2 -= this.field1699 * var2 / (((class108) this.field1724).field1614.length << 8);
        } else if (this.field1704 >= 0) {
            var2 -= this.field1708 * var2 / ((class108) this.field1724).field1614.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class118(class108 arg0, int arg1, int arg2) {
        this.field1724 = arg0;
        this.field1708 = arg0.field1615;
        this.field1706 = arg0.field1613;
        this.field1707 = arg0.field1617;
        this.field1709 = arg1;
        this.field1705 = arg2;
        this.field1700 = 8192;
        this.field1699 = 0;
        this.method1965();
    }

    public class118(class108 arg0, int arg1, int arg2, int arg3) {
        this.field1724 = arg0;
        this.field1708 = arg0.field1615;
        this.field1706 = arg0.field1613;
        this.field1707 = arg0.field1617;
        this.field1709 = arg1;
        this.field1705 = arg2;
        this.field1700 = arg3;
        this.field1699 = 0;
        this.method1965();
    }

    @ObfuscatedName("ds.i(Ldh;II)Lds;")
    public static class118 method1999(class108 arg0, int arg1, int arg2) {
        return arg0.field1614 == null || arg0.field1614.length == 0 ? null : new class118(arg0, (int) ((long) arg0.field1616 * 256L * (long) arg1 / (long) (Statics.field1634 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ds.j(Ldh;III)Lds;")
    public static class118 method1964(class108 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1614 == null || arg0.field1614.length == 0 ? null : new class118(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ds.f()V")
    public void method1965() {
        this.field1698 = this.field1705;
        this.field1702 = method2084(this.field1705, this.field1700);
        this.field1703 = method1960(this.field1705, this.field1700);
    }

    @ObfuscatedName("ds.g(I)V")
    public synchronized void method1966(int arg0) {
        this.field1704 = arg0;
    }

    @ObfuscatedName("ds.o(I)V")
    public synchronized void method1967(int arg0) {
        this.method2073(arg0 << 6, this.method1982());
    }

    @ObfuscatedName("ds.x(I)V")
    public synchronized void method1968(int arg0) {
        this.method2073(arg0, this.method1982());
    }

    @ObfuscatedName("ds.a(II)V")
    public synchronized void method2073(int arg0, int arg1) {
        this.field1705 = arg0;
        this.field1700 = arg1;
        this.field1697 = 0;
        this.method1965();
    }

    @ObfuscatedName("ds.y()I")
    public synchronized int method1959() {
        return this.field1705 == Integer.MIN_VALUE ? 0 : this.field1705;
    }

    @ObfuscatedName("ds.r()I")
    public synchronized int method1982() {
        return this.field1700 < 0 ? -1 : this.field1700;
    }

    @ObfuscatedName("ds.b(I)V")
    public synchronized void method1972(int arg0) {
        int var2 = ((class108) this.field1724).field1614.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1699 = arg0;
    }

    @ObfuscatedName("ds.s(Z)V")
    public synchronized void method2092(boolean arg0) {
        this.field1709 = (this.field1709 >>> 31) + (this.field1709 ^ this.field1709 >> 31);
        if (arg0) {
            this.field1709 = -this.field1709;
        }
    }

    @ObfuscatedName("ds.v()V")
    public void method1973() {
        if (this.field1697 == 0) {
            return;
        }
        if (this.field1705 == Integer.MIN_VALUE) {
            this.field1705 = 0;
        }
        this.field1697 = 0;
        this.method1965();
    }

    @ObfuscatedName("ds.t(II)V")
    public synchronized void method1975(int arg0, int arg1) {
        this.method1976(arg0, arg1, this.method1982());
    }

    @ObfuscatedName("ds.w(III)V")
    public synchronized void method1976(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2073(arg1, arg2);
            return;
        }
        int var4 = method2084(arg1, arg2);
        int var5 = method1960(arg1, arg2);
        if (this.field1702 == var4 && this.field1703 == var5) {
            this.field1697 = 0;
            return;
        }
        int var6 = arg1 - this.field1698;
        if (this.field1698 - arg1 > var6) {
            var6 = this.field1698 - arg1;
        }
        if (var4 - this.field1702 > var6) {
            var6 = var4 - this.field1702;
        }
        if (this.field1702 - var4 > var6) {
            var6 = this.field1702 - var4;
        }
        if (var5 - this.field1703 > var6) {
            var6 = var5 - this.field1703;
        }
        if (this.field1703 - var5 > var6) {
            var6 = this.field1703 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1697 = arg0;
        this.field1705 = arg1;
        this.field1700 = arg2;
        this.field1701 = (arg1 - this.field1698) / arg0;
        this.field1710 = (var4 - this.field1702) / arg0;
        this.field1711 = (var5 - this.field1703) / arg0;
    }

    @ObfuscatedName("ds.u(I)V")
    public synchronized void method1977(int arg0) {
        if (arg0 == 0) {
            this.method1968(0);
            this.method3347();
        } else if (this.field1702 == 0 && this.field1703 == 0) {
            this.field1697 = 0;
            this.field1705 = 0;
            this.field1698 = 0;
            this.method3347();
        } else {
            int var2 = -this.field1698;
            if (this.field1698 > var2) {
                var2 = this.field1698;
            }
            if (-this.field1702 > var2) {
                var2 = -this.field1702;
            }
            if (this.field1702 > var2) {
                var2 = this.field1702;
            }
            if (-this.field1703 > var2) {
                var2 = -this.field1703;
            }
            if (this.field1703 > var2) {
                var2 = this.field1703;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1697 = arg0;
            this.field1705 = Integer.MIN_VALUE;
            this.field1701 = -this.field1698 / arg0;
            this.field1710 = -this.field1702 / arg0;
            this.field1711 = -this.field1703 / arg0;
        }
    }

    @ObfuscatedName("ds.aa(I)V")
    public synchronized void method2094(int arg0) {
        if (this.field1709 < 0) {
            this.field1709 = -arg0;
        } else {
            this.field1709 = arg0;
        }
    }

    @ObfuscatedName("ds.aw()I")
    public synchronized int method2024() {
        return this.field1709 < 0 ? -this.field1709 : this.field1709;
    }

    @ObfuscatedName("ds.am()Z")
    public boolean method2067() {
        return this.field1699 < 0 || this.field1699 >= ((class108) this.field1724).field1614.length << 8;
    }

    @ObfuscatedName("ds.ac()Z")
    public boolean method1974() {
        return this.field1697 != 0;
    }

    @ObfuscatedName("ds.m()Ldp;")
    public class120 method1757() {
        return null;
    }

    @ObfuscatedName("ds.c()Ldp;")
    public class120 method1737() {
        return null;
    }

    @ObfuscatedName("ds.z()I")
    public int method1736() {
        return this.field1705 == 0 && this.field1697 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ds.h([III)V")
    public synchronized void method1752(int[] arg0, int arg1, int arg2) {
        if (this.field1705 == 0 && this.field1697 == 0) {
            this.method1741(arg2);
            return;
        }
        class108 var4 = (class108) this.field1724;
        int var5 = this.field1708 << 8;
        int var6 = this.field1706 << 8;
        int var7 = var4.field1614.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1704 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1699 < 0) {
            if (this.field1709 <= 0) {
                this.method1973();
                this.method3347();
                return;
            }
            this.field1699 = 0;
        }
        if (this.field1699 >= var7) {
            if (this.field1709 >= 0) {
                this.method1973();
                this.method3347();
                return;
            }
            this.field1699 = var7 - 1;
        }
        if (this.field1704 >= 0) {
            if (this.field1704 > 0) {
                if (this.field1707) {
                    label131: {
                        if (this.field1709 < 0) {
                            var9 = this.method1984(arg0, arg1, var5, var10, var4.field1614[this.field1708]);
                            if (this.field1699 >= var5) {
                                return;
                            }
                            this.field1699 = var5 + var5 - 1 - this.field1699;
                            this.field1709 = -this.field1709;
                            if (--this.field1704 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1983(arg0, var9, var6, var10, var4.field1614[this.field1706 - 1]);
                            if (this.field1699 < var6) {
                                return;
                            }
                            this.field1699 = var6 + var6 - 1 - this.field1699;
                            this.field1709 = -this.field1709;
                            if (--this.field1704 == 0) {
                                break;
                            }
                            var9 = this.method1984(arg0, var9, var5, var10, var4.field1614[this.field1708]);
                            if (this.field1699 >= var5) {
                                return;
                            }
                            this.field1699 = var5 + var5 - 1 - this.field1699;
                            this.field1709 = -this.field1709;
                        } while (--this.field1704 != 0);
                    }
                } else if (this.field1709 < 0) {
                    while (true) {
                        var9 = this.method1984(arg0, var9, var5, var10, var4.field1614[this.field1706 - 1]);
                        if (this.field1699 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1699) / var8;
                        if (var12 >= this.field1704) {
                            this.field1699 += this.field1704 * var8;
                            this.field1704 = 0;
                            break;
                        }
                        this.field1699 += var8 * var12;
                        this.field1704 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1983(arg0, var9, var6, var10, var4.field1614[this.field1708]);
                        if (this.field1699 < var6) {
                            return;
                        }
                        int var13 = (this.field1699 - var5) / var8;
                        if (var13 >= this.field1704) {
                            this.field1699 -= this.field1704 * var8;
                            this.field1704 = 0;
                            break;
                        }
                        this.field1699 -= var8 * var13;
                        this.field1704 -= var13;
                    }
                }
            }
            if (this.field1709 < 0) {
                this.method1984(arg0, var9, 0, var10, 0);
                if (this.field1699 < 0) {
                    this.field1699 = -1;
                    this.method1973();
                    this.method3347();
                }
            } else {
                this.method1983(arg0, var9, var7, var10, 0);
                if (this.field1699 >= var7) {
                    this.field1699 = var7;
                    this.method1973();
                    this.method3347();
                }
            }
        } else if (this.field1707) {
            if (this.field1709 < 0) {
                var9 = this.method1984(arg0, arg1, var5, var10, var4.field1614[this.field1708]);
                if (this.field1699 >= var5) {
                    return;
                }
                this.field1699 = var5 + var5 - 1 - this.field1699;
                this.field1709 = -this.field1709;
            }
            while (true) {
                int var11 = this.method1983(arg0, var9, var6, var10, var4.field1614[this.field1706 - 1]);
                if (this.field1699 < var6) {
                    return;
                }
                this.field1699 = var6 + var6 - 1 - this.field1699;
                this.field1709 = -this.field1709;
                var9 = this.method1984(arg0, var11, var5, var10, var4.field1614[this.field1708]);
                if (this.field1699 >= var5) {
                    return;
                }
                this.field1699 = var5 + var5 - 1 - this.field1699;
                this.field1709 = -this.field1709;
            }
        } else if (this.field1709 < 0) {
            while (true) {
                var9 = this.method1984(arg0, var9, var5, var10, var4.field1614[this.field1706 - 1]);
                if (this.field1699 >= var5) {
                    return;
                }
                this.field1699 = var6 - 1 - (var6 - 1 - this.field1699) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1983(arg0, var9, var6, var10, var4.field1614[this.field1708]);
                if (this.field1699 < var6) {
                    return;
                }
                this.field1699 = (this.field1699 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ds.e(I)V")
    public synchronized void method1741(int arg0) {
        if (this.field1697 > 0) {
            if (arg0 >= this.field1697) {
                if (this.field1705 == Integer.MIN_VALUE) {
                    this.field1705 = 0;
                    this.field1703 = 0;
                    this.field1702 = 0;
                    this.field1698 = 0;
                    this.method3347();
                    arg0 = this.field1697;
                }
                this.field1697 = 0;
                this.method1965();
            } else {
                this.field1698 += this.field1701 * arg0;
                this.field1702 += this.field1710 * arg0;
                this.field1703 += this.field1711 * arg0;
                this.field1697 -= arg0;
            }
        }
        class108 var2 = (class108) this.field1724;
        int var3 = this.field1708 << 8;
        int var4 = this.field1706 << 8;
        int var5 = var2.field1614.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1704 = 0;
        }
        if (this.field1699 < 0) {
            if (this.field1709 <= 0) {
                this.method1973();
                this.method3347();
                return;
            }
            this.field1699 = 0;
        }
        if (this.field1699 >= var5) {
            if (this.field1709 >= 0) {
                this.method1973();
                this.method3347();
                return;
            }
            this.field1699 = var5 - 1;
        }
        this.field1699 += this.field1709 * arg0;
        if (this.field1704 >= 0) {
            if (this.field1704 > 0) {
                if (this.field1707) {
                    label121: {
                        if (this.field1709 < 0) {
                            if (this.field1699 >= var3) {
                                return;
                            }
                            this.field1699 = var3 + var3 - 1 - this.field1699;
                            this.field1709 = -this.field1709;
                            if (--this.field1704 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1699 < var4) {
                                return;
                            }
                            this.field1699 = var4 + var4 - 1 - this.field1699;
                            this.field1709 = -this.field1709;
                            if (--this.field1704 == 0) {
                                break;
                            }
                            if (this.field1699 >= var3) {
                                return;
                            }
                            this.field1699 = var3 + var3 - 1 - this.field1699;
                            this.field1709 = -this.field1709;
                        } while (--this.field1704 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1709 < 0) {
                            if (this.field1699 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1699) / var6;
                            if (var7 >= this.field1704) {
                                this.field1699 += this.field1704 * var6;
                                this.field1704 = 0;
                                break label153;
                            }
                            this.field1699 += var6 * var7;
                            this.field1704 -= var7;
                        } else if (this.field1699 >= var4) {
                            int var8 = (this.field1699 - var3) / var6;
                            if (var8 >= this.field1704) {
                                this.field1699 -= this.field1704 * var6;
                                this.field1704 = 0;
                                break label153;
                            }
                            this.field1699 -= var6 * var8;
                            this.field1704 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1709 < 0) {
                if (this.field1699 < 0) {
                    this.field1699 = -1;
                    this.method1973();
                    this.method3347();
                }
            } else if (this.field1699 >= var5) {
                this.field1699 = var5;
                this.method1973();
                this.method3347();
            }
        } else if (this.field1707) {
            if (this.field1709 < 0) {
                if (this.field1699 >= var3) {
                    return;
                }
                this.field1699 = var3 + var3 - 1 - this.field1699;
                this.field1709 = -this.field1709;
            }
            while (this.field1699 >= var4) {
                this.field1699 = var4 + var4 - 1 - this.field1699;
                this.field1709 = -this.field1709;
                if (this.field1699 >= var3) {
                    return;
                }
                this.field1699 = var3 + var3 - 1 - this.field1699;
                this.field1709 = -this.field1709;
            }
        } else if (this.field1709 < 0) {
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

    @ObfuscatedName("ds.aq([IIIII)I")
    public int method1983(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1697 > 0) {
                int var6 = this.field1697 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1697 += arg1;
                if (this.field1709 == 256 && (this.field1699 & 0xFF) == 0) {
                    if (Statics.field1631) {
                        arg1 = method1994(0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, this.field1710, this.field1711, 0, var6, arg2, this);
                    } else {
                        arg1 = method1993(((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, this.field1701, 0, var6, arg2, this);
                    }
                } else if (Statics.field1631) {
                    arg1 = method1998(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, this.field1710, this.field1711, 0, var6, arg2, this, this.field1709, arg4);
                } else {
                    arg1 = method2070(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, this.field1701, 0, var6, arg2, this, this.field1709, arg4);
                }
                this.field1697 -= arg1;
                if (this.field1697 != 0) {
                    return arg1;
                }
                if (!this.method1985()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1709 == 256 && (this.field1699 & 0xFF) == 0) {
                if (Statics.field1631) {
                    return method1997(0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, 0, arg3, arg2, this);
                }
                return method1995(((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, 0, arg3, arg2, this);
            }
            if (Statics.field1631) {
                return method1970(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, 0, arg3, arg2, this, this.field1709, arg4);
            }
            return method2068(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, 0, arg3, arg2, this, this.field1709, arg4);
        }
    }

    @ObfuscatedName("ds.af([IIIII)I")
    public int method1984(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1697 > 0) {
                int var6 = this.field1697 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1697 += arg1;
                if (this.field1709 == -256 && (this.field1699 & 0xFF) == 0) {
                    if (Statics.field1631) {
                        arg1 = method2026(0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, this.field1710, this.field1711, 0, var6, arg2, this);
                    } else {
                        arg1 = method2007(((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, this.field1701, 0, var6, arg2, this);
                    }
                } else if (Statics.field1631) {
                    arg1 = method2053(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, this.field1710, this.field1711, 0, var6, arg2, this, this.field1709, arg4);
                } else {
                    arg1 = method2028(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, this.field1701, 0, var6, arg2, this, this.field1709, arg4);
                }
                this.field1697 -= arg1;
                if (this.field1697 != 0) {
                    return arg1;
                }
                if (!this.method1985()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1709 == -256 && (this.field1699 & 0xFF) == 0) {
                if (Statics.field1631) {
                    return method1989(0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, 0, arg3, arg2, this);
                }
                return method1988(((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, 0, arg3, arg2, this);
            }
            if (Statics.field1631) {
                return method1992(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1702, this.field1703, 0, arg3, arg2, this, this.field1709, arg4);
            }
            return method1991(0, 0, ((class108) this.field1724).field1614, arg0, this.field1699, arg1, this.field1698, 0, arg3, arg2, this, this.field1709, arg4);
        }
    }

    @ObfuscatedName("ds.ar()Z")
    public boolean method1985() {
        int var1 = this.field1705;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2084(var1, this.field1700);
            var2 = method1960(var1, this.field1700);
        }
        if (this.field1698 != var1 || this.field1702 != var3 || this.field1703 != var2) {
            if (this.field1698 < var1) {
                this.field1701 = 1;
                this.field1697 = var1 - this.field1698;
            } else if (this.field1698 > var1) {
                this.field1701 = -1;
                this.field1697 = this.field1698 - var1;
            } else {
                this.field1701 = 0;
            }
            if (this.field1702 < var3) {
                this.field1710 = 1;
                if (this.field1697 == 0 || this.field1697 > var3 - this.field1702) {
                    this.field1697 = var3 - this.field1702;
                }
            } else if (this.field1702 > var3) {
                this.field1710 = -1;
                if (this.field1697 == 0 || this.field1697 > this.field1702 - var3) {
                    this.field1697 = this.field1702 - var3;
                }
            } else {
                this.field1710 = 0;
            }
            if (this.field1703 < var2) {
                this.field1711 = 1;
                if (this.field1697 == 0 || this.field1697 > var2 - this.field1703) {
                    this.field1697 = var2 - this.field1703;
                }
            } else if (this.field1703 > var2) {
                this.field1711 = -1;
                if (this.field1697 == 0 || this.field1697 > this.field1703 - var2) {
                    this.field1697 = this.field1703 - var2;
                }
            } else {
                this.field1711 = 0;
            }
            return false;
        } else if (this.field1705 == Integer.MIN_VALUE) {
            this.field1705 = 0;
            this.field1703 = 0;
            this.field1702 = 0;
            this.field1698 = 0;
            this.method3347();
            return true;
        } else {
            this.method1965();
            return false;
        }
    }

    @ObfuscatedName("ds.aj([B[IIIIIIILds;)I")
    public static int method1995(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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

    @ObfuscatedName("ds.ay(I[B[IIIIIIIILds;)I")
    public static int method1997(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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

    @ObfuscatedName("ds.ap([B[IIIIIIILds;)I")
    public static int method1988(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class118 arg8) {
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

    @ObfuscatedName("ds.ai(I[B[IIIIIIIILds;)I")
    public static int method1989(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10) {
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

    @ObfuscatedName("ds.az(II[B[IIIIIIILds;II)I")
    public static int method2068(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("ds.bv(II[B[IIIIIIIILds;II)I")
    public static int method1970(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("ds.bd(II[B[IIIIIIILds;II)I")
    public static int method1991(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class118 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("ds.bc(II[B[IIIIIIIILds;II)I")
    public static int method1992(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("ds.bj([B[IIIIIIIILds;)I")
    public static int method1993(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1702 += (var14 - arg3) * arg9.field1710;
        arg9.field1703 += (var14 - arg3) * arg9.field1711;
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
        arg9.field1698 = var12 >> 2;
        arg9.field1699 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bx(I[B[IIIIIIIIIILds;)I")
    public static int method1994(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1698 += (var19 - arg4) * arg12.field1701;
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
        arg12.field1702 = var15 >> 2;
        arg12.field1703 = var16 >> 2;
        arg12.field1699 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bf([B[IIIIIIIILds;)I")
    public static int method2007(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class118 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1702 += (var14 - arg3) * arg9.field1710;
        arg9.field1703 += (var14 - arg3) * arg9.field1711;
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
        arg9.field1698 = var12 >> 2;
        arg9.field1699 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bn(I[B[IIIIIIIIIILds;)I")
    public static int method2026(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class118 arg12) {
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
        arg12.field1698 += (var19 - arg4) * arg12.field1701;
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
        arg12.field1702 = var15 >> 2;
        arg12.field1703 = var16 >> 2;
        arg12.field1699 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bh(II[B[IIIIIIIILds;II)I")
    public static int method2070(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1702 -= arg11.field1710 * arg5;
        arg11.field1703 -= arg11.field1711 * arg5;
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
        arg11.field1702 += arg11.field1710 * arg5;
        arg11.field1703 += arg11.field1711 * arg5;
        arg11.field1698 = arg6;
        arg11.field1699 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bm(II[B[IIIIIIIIIILds;II)I")
    public static int method1998(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1698 -= arg13.field1701 * arg5;
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
        arg13.field1698 += arg13.field1701 * var27;
        arg13.field1702 = arg6;
        arg13.field1703 = arg7;
        arg13.field1699 = arg4;
        return var27;
    }

    @ObfuscatedName("ds.bs(II[B[IIIIIIIILds;II)I")
    public static int method2028(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class118 arg11, int arg12, int arg13) {
        arg11.field1702 -= arg11.field1710 * arg5;
        arg11.field1703 -= arg11.field1711 * arg5;
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
        arg11.field1702 += arg11.field1710 * arg5;
        arg11.field1703 += arg11.field1711 * arg5;
        arg11.field1698 = arg6;
        arg11.field1699 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bo(II[B[IIIIIIIIIILds;II)I")
    public static int method2053(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class118 arg13, int arg14, int arg15) {
        arg13.field1698 -= arg13.field1701 * arg5;
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
        arg13.field1698 += arg13.field1701 * var26;
        arg13.field1702 = arg6;
        arg13.field1703 = arg7;
        arg13.field1699 = arg4;
        return var26;
    }
}
