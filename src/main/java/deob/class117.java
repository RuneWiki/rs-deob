package deob;

@ObfuscatedName("dm")
public class class117 extends class119 {

    @ObfuscatedName("dm.i")
    public int field1712;

    @ObfuscatedName("dm.j")
    public int field1701;

    @ObfuscatedName("dm.a")
    public int field1702;

    @ObfuscatedName("dm.r")
    public int field1706;

    @ObfuscatedName("dm.o")
    public int field1710;

    @ObfuscatedName("dm.n")
    public int field1705;

    @ObfuscatedName("dm.q")
    public int field1700;

    @ObfuscatedName("dm.b")
    public int field1707;

    @ObfuscatedName("dm.k")
    public int field1708;

    @ObfuscatedName("dm.s")
    public int field1713;

    @ObfuscatedName("dm.d")
    public boolean field1703;

    @ObfuscatedName("dm.l")
    public int field1711;

    @ObfuscatedName("dm.t")
    public int field1704;

    @ObfuscatedName("dm.y")
    public int field1709;

    @ObfuscatedName("dm.v")
    public int field1714;

    @ObfuscatedName("dm.i(II)I")
    public static int method2080(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.j(II)I")
    public static int method2010(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.bd()I")
    public int method2031() {
        int var1 = this.field1710 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1707 == 0) {
            var2 -= this.field1712 * var2 / (((class107) this.field1729).field1617.length << 8);
        } else if (this.field1707 >= 0) {
            var2 -= this.field1708 * var2 / ((class107) this.field1729).field1617.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class117(class107 arg0, int arg1, int arg2) {
        this.field1729 = arg0;
        this.field1708 = arg0.field1618;
        this.field1713 = arg0.field1616;
        this.field1703 = arg0.field1620;
        this.field1701 = arg1;
        this.field1702 = arg2;
        this.field1706 = 8192;
        this.field1712 = 0;
        this.method1953();
    }

    public class117(class107 arg0, int arg1, int arg2, int arg3) {
        this.field1729 = arg0;
        this.field1708 = arg0.field1618;
        this.field1713 = arg0.field1616;
        this.field1703 = arg0.field1620;
        this.field1701 = arg1;
        this.field1702 = arg2;
        this.field1706 = arg3;
        this.field1712 = 0;
        this.method1953();
    }

    @ObfuscatedName("dm.a(Ldp;II)Ldm;")
    public static class117 method1955(class107 arg0, int arg1, int arg2) {
        return arg0.field1617 == null || arg0.field1617.length == 0 ? null : new class117(arg0, (int) ((long) arg0.field1619 * 256L * (long) arg1 / (long) (Statics.field899 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dm.r(Ldp;III)Ldm;")
    public static class117 method1977(class107 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1617 == null || arg0.field1617.length == 0 ? null : new class117(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dm.o()V")
    public void method1953() {
        this.field1710 = this.field1702;
        this.field1705 = method2080(this.field1702, this.field1706);
        this.field1700 = method2010(this.field1702, this.field1706);
    }

    @ObfuscatedName("dm.s(I)V")
    public synchronized void method1958(int arg0) {
        this.field1707 = arg0;
    }

    @ObfuscatedName("dm.l(I)V")
    public synchronized void method1959(int arg0) {
        this.method1961(arg0 << 6, this.method2032());
    }

    @ObfuscatedName("dm.c(I)V")
    public synchronized void method2052(int arg0) {
        this.method1961(arg0, this.method2032());
    }

    @ObfuscatedName("dm.u(II)V")
    public synchronized void method1961(int arg0, int arg1) {
        this.field1702 = arg0;
        this.field1706 = arg1;
        this.field1711 = 0;
        this.method1953();
    }

    @ObfuscatedName("dm.e()I")
    public synchronized int method2044() {
        return this.field1702 == Integer.MIN_VALUE ? 0 : this.field1702;
    }

    @ObfuscatedName("dm.p()I")
    public synchronized int method2032() {
        return this.field1706 < 0 ? -1 : this.field1706;
    }

    @ObfuscatedName("dm.m(I)V")
    public synchronized void method1964(int arg0) {
        int var2 = ((class107) this.field1729).field1617.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1712 = arg0;
    }

    @ObfuscatedName("dm.x(Z)V")
    public synchronized void method1965(boolean arg0) {
        this.field1701 = (this.field1701 >>> 31) + (this.field1701 ^ this.field1701 >> 31);
        if (arg0) {
            this.field1701 = -this.field1701;
        }
    }

    @ObfuscatedName("dm.g()V")
    public void method1966() {
        if (this.field1711 == 0) {
            return;
        }
        if (this.field1702 == Integer.MIN_VALUE) {
            this.field1702 = 0;
        }
        this.field1711 = 0;
        this.method1953();
    }

    @ObfuscatedName("dm.w(II)V")
    public synchronized void method1967(int arg0, int arg1) {
        this.method1968(arg0, arg1, this.method2032());
    }

    @ObfuscatedName("dm.ar(III)V")
    public synchronized void method1968(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1961(arg1, arg2);
            return;
        }
        int var4 = method2080(arg1, arg2);
        int var5 = method2010(arg1, arg2);
        if (this.field1705 == var4 && this.field1700 == var5) {
            this.field1711 = 0;
            return;
        }
        int var6 = arg1 - this.field1710;
        if (this.field1710 - arg1 > var6) {
            var6 = this.field1710 - arg1;
        }
        if (var4 - this.field1705 > var6) {
            var6 = var4 - this.field1705;
        }
        if (this.field1705 - var4 > var6) {
            var6 = this.field1705 - var4;
        }
        if (var5 - this.field1700 > var6) {
            var6 = var5 - this.field1700;
        }
        if (this.field1700 - var5 > var6) {
            var6 = this.field1700 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1711 = arg0;
        this.field1702 = arg1;
        this.field1706 = arg2;
        this.field1704 = (arg1 - this.field1710) / arg0;
        this.field1709 = (var4 - this.field1705) / arg0;
        this.field1714 = (var5 - this.field1700) / arg0;
    }

    @ObfuscatedName("dm.ax(I)V")
    public synchronized void method1978(int arg0) {
        if (arg0 == 0) {
            this.method2052(0);
            this.method3397();
        } else if (this.field1705 == 0 && this.field1700 == 0) {
            this.field1711 = 0;
            this.field1702 = 0;
            this.field1710 = 0;
            this.method3397();
        } else {
            int var2 = -this.field1710;
            if (this.field1710 > var2) {
                var2 = this.field1710;
            }
            if (-this.field1705 > var2) {
                var2 = -this.field1705;
            }
            if (this.field1705 > var2) {
                var2 = this.field1705;
            }
            if (-this.field1700 > var2) {
                var2 = -this.field1700;
            }
            if (this.field1700 > var2) {
                var2 = this.field1700;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1711 = arg0;
            this.field1702 = Integer.MIN_VALUE;
            this.field1704 = -this.field1710 / arg0;
            this.field1709 = -this.field1705 / arg0;
            this.field1714 = -this.field1700 / arg0;
        }
    }

    @ObfuscatedName("dm.al(I)V")
    public synchronized void method1983(int arg0) {
        if (this.field1701 < 0) {
            this.field1701 = -arg0;
        } else {
            this.field1701 = arg0;
        }
    }

    @ObfuscatedName("dm.ag()I")
    public synchronized int method1971() {
        return this.field1701 < 0 ? -this.field1701 : this.field1701;
    }

    @ObfuscatedName("dm.ad()Z")
    public boolean method1972() {
        return this.field1712 < 0 || this.field1712 >= ((class107) this.field1729).field1617.length << 8;
    }

    @ObfuscatedName("dm.ab()Z")
    public boolean method1973() {
        return this.field1711 != 0;
    }

    @ObfuscatedName("dm.n()Lds;")
    public class119 method1753() {
        return null;
    }

    @ObfuscatedName("dm.q()Lds;")
    public class119 method1731() {
        return null;
    }

    @ObfuscatedName("dm.b()I")
    public int method1732() {
        return this.field1702 == 0 && this.field1711 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dm.k([III)V")
    public synchronized void method1733(int[] arg0, int arg1, int arg2) {
        if (this.field1702 == 0 && this.field1711 == 0) {
            this.method1742(arg2);
            return;
        }
        class107 var4 = (class107) this.field1729;
        int var5 = this.field1708 << 8;
        int var6 = this.field1713 << 8;
        int var7 = var4.field1617.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1707 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1712 < 0) {
            if (this.field1701 <= 0) {
                this.method1966();
                this.method3397();
                return;
            }
            this.field1712 = 0;
        }
        if (this.field1712 >= var7) {
            if (this.field1701 >= 0) {
                this.method1966();
                this.method3397();
                return;
            }
            this.field1712 = var7 - 1;
        }
        if (this.field1707 >= 0) {
            if (this.field1707 > 0) {
                if (this.field1703) {
                    label131: {
                        if (this.field1701 < 0) {
                            var9 = this.method1976(arg0, arg1, var5, var10, var4.field1617[this.field1708]);
                            if (this.field1712 >= var5) {
                                return;
                            }
                            this.field1712 = var5 + var5 - 1 - this.field1712;
                            this.field1701 = -this.field1701;
                            if (--this.field1707 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2006(arg0, var9, var6, var10, var4.field1617[this.field1713 - 1]);
                            if (this.field1712 < var6) {
                                return;
                            }
                            this.field1712 = var6 + var6 - 1 - this.field1712;
                            this.field1701 = -this.field1701;
                            if (--this.field1707 == 0) {
                                break;
                            }
                            var9 = this.method1976(arg0, var9, var5, var10, var4.field1617[this.field1708]);
                            if (this.field1712 >= var5) {
                                return;
                            }
                            this.field1712 = var5 + var5 - 1 - this.field1712;
                            this.field1701 = -this.field1701;
                        } while (--this.field1707 != 0);
                    }
                } else if (this.field1701 < 0) {
                    while (true) {
                        var9 = this.method1976(arg0, var9, var5, var10, var4.field1617[this.field1713 - 1]);
                        if (this.field1712 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1712) / var8;
                        if (var12 >= this.field1707) {
                            this.field1712 += this.field1707 * var8;
                            this.field1707 = 0;
                            break;
                        }
                        this.field1712 += var8 * var12;
                        this.field1707 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2006(arg0, var9, var6, var10, var4.field1617[this.field1708]);
                        if (this.field1712 < var6) {
                            return;
                        }
                        int var13 = (this.field1712 - var5) / var8;
                        if (var13 >= this.field1707) {
                            this.field1712 -= this.field1707 * var8;
                            this.field1707 = 0;
                            break;
                        }
                        this.field1712 -= var8 * var13;
                        this.field1707 -= var13;
                    }
                }
            }
            if (this.field1701 < 0) {
                this.method1976(arg0, var9, 0, var10, 0);
                if (this.field1712 < 0) {
                    this.field1712 = -1;
                    this.method1966();
                    this.method3397();
                }
            } else {
                this.method2006(arg0, var9, var7, var10, 0);
                if (this.field1712 >= var7) {
                    this.field1712 = var7;
                    this.method1966();
                    this.method3397();
                }
            }
        } else if (this.field1703) {
            if (this.field1701 < 0) {
                var9 = this.method1976(arg0, arg1, var5, var10, var4.field1617[this.field1708]);
                if (this.field1712 >= var5) {
                    return;
                }
                this.field1712 = var5 + var5 - 1 - this.field1712;
                this.field1701 = -this.field1701;
            }
            while (true) {
                int var11 = this.method2006(arg0, var9, var6, var10, var4.field1617[this.field1713 - 1]);
                if (this.field1712 < var6) {
                    return;
                }
                this.field1712 = var6 + var6 - 1 - this.field1712;
                this.field1701 = -this.field1701;
                var9 = this.method1976(arg0, var11, var5, var10, var4.field1617[this.field1708]);
                if (this.field1712 >= var5) {
                    return;
                }
                this.field1712 = var5 + var5 - 1 - this.field1712;
                this.field1701 = -this.field1701;
            }
        } else if (this.field1701 < 0) {
            while (true) {
                var9 = this.method1976(arg0, var9, var5, var10, var4.field1617[this.field1713 - 1]);
                if (this.field1712 >= var5) {
                    return;
                }
                this.field1712 = var6 - 1 - (var6 - 1 - this.field1712) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2006(arg0, var9, var6, var10, var4.field1617[this.field1708]);
                if (this.field1712 < var6) {
                    return;
                }
                this.field1712 = (this.field1712 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dm.d(I)V")
    public synchronized void method1742(int arg0) {
        if (this.field1711 > 0) {
            if (arg0 >= this.field1711) {
                if (this.field1702 == Integer.MIN_VALUE) {
                    this.field1702 = 0;
                    this.field1700 = 0;
                    this.field1705 = 0;
                    this.field1710 = 0;
                    this.method3397();
                    arg0 = this.field1711;
                }
                this.field1711 = 0;
                this.method1953();
            } else {
                this.field1710 += this.field1704 * arg0;
                this.field1705 += this.field1709 * arg0;
                this.field1700 += this.field1714 * arg0;
                this.field1711 -= arg0;
            }
        }
        class107 var2 = (class107) this.field1729;
        int var3 = this.field1708 << 8;
        int var4 = this.field1713 << 8;
        int var5 = var2.field1617.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1707 = 0;
        }
        if (this.field1712 < 0) {
            if (this.field1701 <= 0) {
                this.method1966();
                this.method3397();
                return;
            }
            this.field1712 = 0;
        }
        if (this.field1712 >= var5) {
            if (this.field1701 >= 0) {
                this.method1966();
                this.method3397();
                return;
            }
            this.field1712 = var5 - 1;
        }
        this.field1712 += this.field1701 * arg0;
        if (this.field1707 >= 0) {
            if (this.field1707 > 0) {
                if (this.field1703) {
                    label121: {
                        if (this.field1701 < 0) {
                            if (this.field1712 >= var3) {
                                return;
                            }
                            this.field1712 = var3 + var3 - 1 - this.field1712;
                            this.field1701 = -this.field1701;
                            if (--this.field1707 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1712 < var4) {
                                return;
                            }
                            this.field1712 = var4 + var4 - 1 - this.field1712;
                            this.field1701 = -this.field1701;
                            if (--this.field1707 == 0) {
                                break;
                            }
                            if (this.field1712 >= var3) {
                                return;
                            }
                            this.field1712 = var3 + var3 - 1 - this.field1712;
                            this.field1701 = -this.field1701;
                        } while (--this.field1707 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1701 < 0) {
                            if (this.field1712 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1712) / var6;
                            if (var7 >= this.field1707) {
                                this.field1712 += this.field1707 * var6;
                                this.field1707 = 0;
                                break label153;
                            }
                            this.field1712 += var6 * var7;
                            this.field1707 -= var7;
                        } else if (this.field1712 >= var4) {
                            int var8 = (this.field1712 - var3) / var6;
                            if (var8 >= this.field1707) {
                                this.field1712 -= this.field1707 * var6;
                                this.field1707 = 0;
                                break label153;
                            }
                            this.field1712 -= var6 * var8;
                            this.field1707 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1701 < 0) {
                if (this.field1712 < 0) {
                    this.field1712 = -1;
                    this.method1966();
                    this.method3397();
                }
            } else if (this.field1712 >= var5) {
                this.field1712 = var5;
                this.method1966();
                this.method3397();
            }
        } else if (this.field1703) {
            if (this.field1701 < 0) {
                if (this.field1712 >= var3) {
                    return;
                }
                this.field1712 = var3 + var3 - 1 - this.field1712;
                this.field1701 = -this.field1701;
            }
            while (this.field1712 >= var4) {
                this.field1712 = var4 + var4 - 1 - this.field1712;
                this.field1701 = -this.field1701;
                if (this.field1712 >= var3) {
                    return;
                }
                this.field1712 = var3 + var3 - 1 - this.field1712;
                this.field1701 = -this.field1701;
            }
        } else if (this.field1701 < 0) {
            if (this.field1712 >= var3) {
                return;
            }
            this.field1712 = var4 - 1 - (var4 - 1 - this.field1712) % var6;
        } else if (this.field1712 >= var4) {
            this.field1712 = (this.field1712 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dm.am([IIIII)I")
    public int method2006(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1711 > 0) {
                int var6 = this.field1711 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1711 += arg1;
                if (this.field1701 == 256 && (this.field1712 & 0xFF) == 0) {
                    if (Statics.field1644) {
                        arg1 = method1995(0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, this.field1709, this.field1714, 0, var6, arg2, this);
                    } else {
                        arg1 = method1986(((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, this.field1704, 0, var6, arg2, this);
                    }
                } else if (Statics.field1644) {
                    arg1 = method1991(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, this.field1709, this.field1714, 0, var6, arg2, this, this.field1701, arg4);
                } else {
                    arg1 = method2016(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, this.field1704, 0, var6, arg2, this, this.field1701, arg4);
                }
                this.field1711 -= arg1;
                if (this.field1711 != 0) {
                    return arg1;
                }
                if (!this.method2001()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1701 == 256 && (this.field1712 & 0xFF) == 0) {
                if (Statics.field1644) {
                    return method2084(0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, 0, arg3, arg2, this);
                }
                return method1963(((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, 0, arg3, arg2, this);
            }
            if (Statics.field1644) {
                return method2040(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, 0, arg3, arg2, this, this.field1701, arg4);
            }
            return method2034(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, 0, arg3, arg2, this, this.field1701, arg4);
        }
    }

    @ObfuscatedName("dm.aq([IIIII)I")
    public int method1976(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1711 > 0) {
                int var6 = this.field1711 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1711 += arg1;
                if (this.field1701 == -256 && (this.field1712 & 0xFF) == 0) {
                    if (Statics.field1644) {
                        arg1 = method1979(0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, this.field1709, this.field1714, 0, var6, arg2, this);
                    } else {
                        arg1 = method1988(((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, this.field1704, 0, var6, arg2, this);
                    }
                } else if (Statics.field1644) {
                    arg1 = method1993(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, this.field1709, this.field1714, 0, var6, arg2, this, this.field1701, arg4);
                } else {
                    arg1 = method1992(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, this.field1704, 0, var6, arg2, this, this.field1701, arg4);
                }
                this.field1711 -= arg1;
                if (this.field1711 != 0) {
                    return arg1;
                }
                if (!this.method2001()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1701 == -256 && (this.field1712 & 0xFF) == 0) {
                if (Statics.field1644) {
                    return method2088(0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, 0, arg3, arg2, this);
                }
                return method1980(((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, 0, arg3, arg2, this);
            }
            if (Statics.field1644) {
                return method1985(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1705, this.field1700, 0, arg3, arg2, this, this.field1701, arg4);
            }
            return method1984(0, 0, ((class107) this.field1729).field1617, arg0, this.field1712, arg1, this.field1710, 0, arg3, arg2, this, this.field1701, arg4);
        }
    }

    @ObfuscatedName("dm.at()Z")
    public boolean method2001() {
        int var1 = this.field1702;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2080(var1, this.field1706);
            var2 = method2010(var1, this.field1706);
        }
        if (this.field1710 != var1 || this.field1705 != var3 || this.field1700 != var2) {
            if (this.field1710 < var1) {
                this.field1704 = 1;
                this.field1711 = var1 - this.field1710;
            } else if (this.field1710 > var1) {
                this.field1704 = -1;
                this.field1711 = this.field1710 - var1;
            } else {
                this.field1704 = 0;
            }
            if (this.field1705 < var3) {
                this.field1709 = 1;
                if (this.field1711 == 0 || this.field1711 > var3 - this.field1705) {
                    this.field1711 = var3 - this.field1705;
                }
            } else if (this.field1705 > var3) {
                this.field1709 = -1;
                if (this.field1711 == 0 || this.field1711 > this.field1705 - var3) {
                    this.field1711 = this.field1705 - var3;
                }
            } else {
                this.field1709 = 0;
            }
            if (this.field1700 < var2) {
                this.field1714 = 1;
                if (this.field1711 == 0 || this.field1711 > var2 - this.field1700) {
                    this.field1711 = var2 - this.field1700;
                }
            } else if (this.field1700 > var2) {
                this.field1714 = -1;
                if (this.field1711 == 0 || this.field1711 > this.field1700 - var2) {
                    this.field1711 = this.field1700 - var2;
                }
            } else {
                this.field1714 = 0;
            }
            return false;
        } else if (this.field1702 == Integer.MIN_VALUE) {
            this.field1702 = 0;
            this.field1700 = 0;
            this.field1705 = 0;
            this.field1710 = 0;
            this.method3397();
            return true;
        } else {
            this.method1953();
            return false;
        }
    }

    @ObfuscatedName("dm.az([B[IIIIIIILdm;)I")
    public static int method1963(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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
        arg8.field1712 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.ah(I[B[IIIIIIIILdm;)I")
    public static int method2084(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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
        arg10.field1712 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.an([B[IIIIIIILdm;)I")
    public static int method1980(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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
        arg8.field1712 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.af(I[B[IIIIIIIILdm;)I")
    public static int method2088(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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
        arg10.field1712 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.ak(II[B[IIIIIIILdm;II)I")
    public static int method2034(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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
        arg10.field1712 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.as(II[B[IIIIIIIILdm;II)I")
    public static int method2040(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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
        arg11.field1712 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.ai(II[B[IIIIIIILdm;II)I")
    public static int method1984(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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
        arg10.field1712 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.au(II[B[IIIIIIIILdm;II)I")
    public static int method1985(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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
        arg11.field1712 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.bp([B[IIIIIIIILdm;)I")
    public static int method1986(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1705 += (var14 - arg3) * arg9.field1709;
        arg9.field1700 += (var14 - arg3) * arg9.field1714;
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
        arg9.field1710 = var12 >> 2;
        arg9.field1712 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bs(I[B[IIIIIIIIIILdm;)I")
    public static int method1995(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1710 += (var19 - arg4) * arg12.field1704;
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
        arg12.field1705 = var15 >> 2;
        arg12.field1700 = var16 >> 2;
        arg12.field1712 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bc([B[IIIIIIIILdm;)I")
    public static int method1988(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1705 += (var14 - arg3) * arg9.field1709;
        arg9.field1700 += (var14 - arg3) * arg9.field1714;
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
        arg9.field1710 = var12 >> 2;
        arg9.field1712 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bv(I[B[IIIIIIIIIILdm;)I")
    public static int method1979(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1710 += (var19 - arg4) * arg12.field1704;
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
        arg12.field1705 = var15 >> 2;
        arg12.field1700 = var16 >> 2;
        arg12.field1712 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bw(II[B[IIIIIIIILdm;II)I")
    public static int method2016(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1705 -= arg11.field1709 * arg5;
        arg11.field1700 -= arg11.field1714 * arg5;
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
        arg11.field1705 += arg11.field1709 * arg5;
        arg11.field1700 += arg11.field1714 * arg5;
        arg11.field1710 = arg6;
        arg11.field1712 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bx(II[B[IIIIIIIIIILdm;II)I")
    public static int method1991(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1710 -= arg13.field1704 * arg5;
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
        arg13.field1710 += arg13.field1704 * var27;
        arg13.field1705 = arg6;
        arg13.field1700 = arg7;
        arg13.field1712 = arg4;
        return var27;
    }

    @ObfuscatedName("dm.br(II[B[IIIIIIIILdm;II)I")
    public static int method1992(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1705 -= arg11.field1709 * arg5;
        arg11.field1700 -= arg11.field1714 * arg5;
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
        arg11.field1705 += arg11.field1709 * arg5;
        arg11.field1700 += arg11.field1714 * arg5;
        arg11.field1710 = arg6;
        arg11.field1712 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.by(II[B[IIIIIIIIIILdm;II)I")
    public static int method1993(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1710 -= arg13.field1704 * arg5;
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
        arg13.field1710 += arg13.field1704 * var26;
        arg13.field1705 = arg6;
        arg13.field1700 = arg7;
        arg13.field1712 = arg4;
        return var26;
    }
}
