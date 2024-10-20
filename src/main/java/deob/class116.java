package deob;

@ObfuscatedName("da")
public class class116 extends class118 {

    @ObfuscatedName("da.o")
    public int field1639;

    @ObfuscatedName("da.k")
    public int field1632;

    @ObfuscatedName("da.t")
    public int field1631;

    @ObfuscatedName("da.d")
    public int field1634;

    @ObfuscatedName("da.h")
    public int field1635;

    @ObfuscatedName("da.m")
    public int field1636;

    @ObfuscatedName("da.z")
    public int field1642;

    @ObfuscatedName("da.i")
    public int field1638;

    @ObfuscatedName("da.u")
    public int field1643;

    @ObfuscatedName("da.x")
    public int field1633;

    @ObfuscatedName("da.y")
    public boolean field1641;

    @ObfuscatedName("da.a")
    public int field1640;

    @ObfuscatedName("da.n")
    public int field1637;

    @ObfuscatedName("da.l")
    public int field1644;

    @ObfuscatedName("da.s")
    public int field1645;

    @ObfuscatedName("da.o(II)I")
    public static int method2232(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.k(II)I")
    public static int method2119(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.ae()I")
    public int method2164() {
        int var1 = this.field1635 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1638 == 0) {
            var2 -= this.field1639 * var2 / (((class106) this.field1658).field1546.length << 8);
        } else if (this.field1638 >= 0) {
            var2 -= this.field1643 * var2 / ((class106) this.field1658).field1546.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class116(class106 arg0, int arg1, int arg2) {
        this.field1658 = arg0;
        this.field1643 = arg0.field1548;
        this.field1633 = arg0.field1545;
        this.field1641 = arg0.field1549;
        this.field1632 = arg1;
        this.field1631 = arg2;
        this.field1634 = 8192;
        this.field1639 = 0;
        this.method2124();
    }

    public class116(class106 arg0, int arg1, int arg2, int arg3) {
        this.field1658 = arg0;
        this.field1643 = arg0.field1548;
        this.field1633 = arg0.field1545;
        this.field1641 = arg0.field1549;
        this.field1632 = arg1;
        this.field1631 = arg2;
        this.field1634 = arg3;
        this.field1639 = 0;
        this.method2124();
    }

    @ObfuscatedName("da.t(Ldp;II)Lda;")
    public static class116 method2122(class106 arg0, int arg1, int arg2) {
        return arg0.field1546 == null || arg0.field1546.length == 0 ? null : new class116(arg0, (int) ((long) arg0.field1547 * 256L * (long) arg1 / (long) (Statics.field1582 * 100)), arg2 << 6);
    }

    @ObfuscatedName("da.d(Ldp;III)Lda;")
    public static class116 method2123(class106 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1546 == null || arg0.field1546.length == 0 ? null : new class116(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("da.h()V")
    public void method2124() {
        this.field1635 = this.field1631;
        this.field1636 = method2232(this.field1631, this.field1634);
        this.field1642 = method2119(this.field1631, this.field1634);
    }

    @ObfuscatedName("da.x(I)V")
    public synchronized void method2125(int arg0) {
        this.field1638 = arg0;
    }

    @ObfuscatedName("da.a(I)V")
    public synchronized void method2126(int arg0) {
        this.method2128(arg0 << 6, this.method2141());
    }

    @ObfuscatedName("da.v(I)V")
    public synchronized void method2127(int arg0) {
        this.method2128(arg0, this.method2141());
    }

    @ObfuscatedName("da.q(II)V")
    public synchronized void method2128(int arg0, int arg1) {
        this.field1631 = arg0;
        this.field1634 = arg1;
        this.field1640 = 0;
        this.method2124();
    }

    @ObfuscatedName("da.r()I")
    public synchronized int method2187() {
        return this.field1631 == Integer.MIN_VALUE ? 0 : this.field1631;
    }

    @ObfuscatedName("da.j()I")
    public synchronized int method2141() {
        return this.field1634 < 0 ? -1 : this.field1634;
    }

    @ObfuscatedName("da.b(I)V")
    public synchronized void method2120(int arg0) {
        int var2 = ((class106) this.field1658).field1546.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1639 = arg0;
    }

    @ObfuscatedName("da.g(Z)V")
    public synchronized void method2132(boolean arg0) {
        this.field1632 = (this.field1632 >>> 31) + (this.field1632 ^ this.field1632 >> 31);
        if (arg0) {
            this.field1632 = -this.field1632;
        }
    }

    @ObfuscatedName("da.f()V")
    public void method2133() {
        if (this.field1640 == 0) {
            return;
        }
        if (this.field1631 == Integer.MIN_VALUE) {
            this.field1631 = 0;
        }
        this.field1640 = 0;
        this.method2124();
    }

    @ObfuscatedName("da.p(II)V")
    public synchronized void method2156(int arg0, int arg1) {
        this.method2135(arg0, arg1, this.method2141());
    }

    @ObfuscatedName("da.e(III)V")
    public synchronized void method2135(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2128(arg1, arg2);
            return;
        }
        int var4 = method2232(arg1, arg2);
        int var5 = method2119(arg1, arg2);
        if (this.field1636 == var4 && this.field1642 == var5) {
            this.field1640 = 0;
            return;
        }
        int var6 = arg1 - this.field1635;
        if (this.field1635 - arg1 > var6) {
            var6 = this.field1635 - arg1;
        }
        if (var4 - this.field1636 > var6) {
            var6 = var4 - this.field1636;
        }
        if (this.field1636 - var4 > var6) {
            var6 = this.field1636 - var4;
        }
        if (var5 - this.field1642 > var6) {
            var6 = var5 - this.field1642;
        }
        if (this.field1642 - var5 > var6) {
            var6 = this.field1642 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1640 = arg0;
        this.field1631 = arg1;
        this.field1634 = arg2;
        this.field1637 = (arg1 - this.field1635) / arg0;
        this.field1644 = (var4 - this.field1636) / arg0;
        this.field1645 = (var5 - this.field1642) / arg0;
    }

    @ObfuscatedName("da.c(I)V")
    public synchronized void method2165(int arg0) {
        if (arg0 == 0) {
            this.method2127(0);
            this.method3681();
        } else if (this.field1636 == 0 && this.field1642 == 0) {
            this.field1640 = 0;
            this.field1631 = 0;
            this.field1635 = 0;
            this.method3681();
        } else {
            int var2 = -this.field1635;
            if (this.field1635 > var2) {
                var2 = this.field1635;
            }
            if (-this.field1636 > var2) {
                var2 = -this.field1636;
            }
            if (this.field1636 > var2) {
                var2 = this.field1636;
            }
            if (-this.field1642 > var2) {
                var2 = -this.field1642;
            }
            if (this.field1642 > var2) {
                var2 = this.field1642;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1640 = arg0;
            this.field1631 = Integer.MIN_VALUE;
            this.field1637 = -this.field1635 / arg0;
            this.field1644 = -this.field1636 / arg0;
            this.field1645 = -this.field1642 / arg0;
        }
    }

    @ObfuscatedName("da.ag(I)V")
    public synchronized void method2137(int arg0) {
        if (this.field1632 < 0) {
            this.field1632 = -arg0;
        } else {
            this.field1632 = arg0;
        }
    }

    @ObfuscatedName("da.at()I")
    public synchronized int method2172() {
        return this.field1632 < 0 ? -this.field1632 : this.field1632;
    }

    @ObfuscatedName("da.av()Z")
    public boolean method2194() {
        return this.field1639 < 0 || this.field1639 >= ((class106) this.field1658).field1546.length << 8;
    }

    @ObfuscatedName("da.am()Z")
    public boolean method2140() {
        return this.field1640 != 0;
    }

    @ObfuscatedName("da.m()Ldd;")
    public class118 method1894() {
        return null;
    }

    @ObfuscatedName("da.z()Ldd;")
    public class118 method1913() {
        return null;
    }

    @ObfuscatedName("da.i()I")
    public int method1927() {
        return this.field1631 == 0 && this.field1640 == 0 ? 0 : 1;
    }

    @ObfuscatedName("da.u([III)V")
    public synchronized void method1897(int[] arg0, int arg1, int arg2) {
        if (this.field1631 == 0 && this.field1640 == 0) {
            this.method1899(arg2);
            return;
        }
        class106 var4 = (class106) this.field1658;
        int var5 = this.field1643 << 8;
        int var6 = this.field1633 << 8;
        int var7 = var4.field1546.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1638 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1639 < 0) {
            if (this.field1632 <= 0) {
                this.method2133();
                this.method3681();
                return;
            }
            this.field1639 = 0;
        }
        if (this.field1639 >= var7) {
            if (this.field1632 >= 0) {
                this.method2133();
                this.method3681();
                return;
            }
            this.field1639 = var7 - 1;
        }
        if (this.field1638 >= 0) {
            if (this.field1638 > 0) {
                if (this.field1641) {
                    label131: {
                        if (this.field1632 < 0) {
                            var9 = this.method2201(arg0, arg1, var5, var10, var4.field1546[this.field1643]);
                            if (this.field1639 >= var5) {
                                return;
                            }
                            this.field1639 = var5 + var5 - 1 - this.field1639;
                            this.field1632 = -this.field1632;
                            if (--this.field1638 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2145(arg0, var9, var6, var10, var4.field1546[this.field1633 - 1]);
                            if (this.field1639 < var6) {
                                return;
                            }
                            this.field1639 = var6 + var6 - 1 - this.field1639;
                            this.field1632 = -this.field1632;
                            if (--this.field1638 == 0) {
                                break;
                            }
                            var9 = this.method2201(arg0, var9, var5, var10, var4.field1546[this.field1643]);
                            if (this.field1639 >= var5) {
                                return;
                            }
                            this.field1639 = var5 + var5 - 1 - this.field1639;
                            this.field1632 = -this.field1632;
                        } while (--this.field1638 != 0);
                    }
                } else if (this.field1632 < 0) {
                    while (true) {
                        var9 = this.method2201(arg0, var9, var5, var10, var4.field1546[this.field1633 - 1]);
                        if (this.field1639 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1639) / var8;
                        if (var12 >= this.field1638) {
                            this.field1639 += this.field1638 * var8;
                            this.field1638 = 0;
                            break;
                        }
                        this.field1639 += var8 * var12;
                        this.field1638 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2145(arg0, var9, var6, var10, var4.field1546[this.field1643]);
                        if (this.field1639 < var6) {
                            return;
                        }
                        int var13 = (this.field1639 - var5) / var8;
                        if (var13 >= this.field1638) {
                            this.field1639 -= this.field1638 * var8;
                            this.field1638 = 0;
                            break;
                        }
                        this.field1639 -= var8 * var13;
                        this.field1638 -= var13;
                    }
                }
            }
            if (this.field1632 < 0) {
                this.method2201(arg0, var9, 0, var10, 0);
                if (this.field1639 < 0) {
                    this.field1639 = -1;
                    this.method2133();
                    this.method3681();
                }
            } else {
                this.method2145(arg0, var9, var7, var10, 0);
                if (this.field1639 >= var7) {
                    this.field1639 = var7;
                    this.method2133();
                    this.method3681();
                }
            }
        } else if (this.field1641) {
            if (this.field1632 < 0) {
                var9 = this.method2201(arg0, arg1, var5, var10, var4.field1546[this.field1643]);
                if (this.field1639 >= var5) {
                    return;
                }
                this.field1639 = var5 + var5 - 1 - this.field1639;
                this.field1632 = -this.field1632;
            }
            while (true) {
                int var11 = this.method2145(arg0, var9, var6, var10, var4.field1546[this.field1633 - 1]);
                if (this.field1639 < var6) {
                    return;
                }
                this.field1639 = var6 + var6 - 1 - this.field1639;
                this.field1632 = -this.field1632;
                var9 = this.method2201(arg0, var11, var5, var10, var4.field1546[this.field1643]);
                if (this.field1639 >= var5) {
                    return;
                }
                this.field1639 = var5 + var5 - 1 - this.field1639;
                this.field1632 = -this.field1632;
            }
        } else if (this.field1632 < 0) {
            while (true) {
                var9 = this.method2201(arg0, var9, var5, var10, var4.field1546[this.field1633 - 1]);
                if (this.field1639 >= var5) {
                    return;
                }
                this.field1639 = var6 - 1 - (var6 - 1 - this.field1639) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2145(arg0, var9, var6, var10, var4.field1546[this.field1643]);
                if (this.field1639 < var6) {
                    return;
                }
                this.field1639 = (this.field1639 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("da.y(I)V")
    public synchronized void method1899(int arg0) {
        if (this.field1640 > 0) {
            if (arg0 >= this.field1640) {
                if (this.field1631 == Integer.MIN_VALUE) {
                    this.field1631 = 0;
                    this.field1642 = 0;
                    this.field1636 = 0;
                    this.field1635 = 0;
                    this.method3681();
                    arg0 = this.field1640;
                }
                this.field1640 = 0;
                this.method2124();
            } else {
                this.field1635 += this.field1637 * arg0;
                this.field1636 += this.field1644 * arg0;
                this.field1642 += this.field1645 * arg0;
                this.field1640 -= arg0;
            }
        }
        class106 var2 = (class106) this.field1658;
        int var3 = this.field1643 << 8;
        int var4 = this.field1633 << 8;
        int var5 = var2.field1546.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1638 = 0;
        }
        if (this.field1639 < 0) {
            if (this.field1632 <= 0) {
                this.method2133();
                this.method3681();
                return;
            }
            this.field1639 = 0;
        }
        if (this.field1639 >= var5) {
            if (this.field1632 >= 0) {
                this.method2133();
                this.method3681();
                return;
            }
            this.field1639 = var5 - 1;
        }
        this.field1639 += this.field1632 * arg0;
        if (this.field1638 >= 0) {
            if (this.field1638 > 0) {
                if (this.field1641) {
                    label121: {
                        if (this.field1632 < 0) {
                            if (this.field1639 >= var3) {
                                return;
                            }
                            this.field1639 = var3 + var3 - 1 - this.field1639;
                            this.field1632 = -this.field1632;
                            if (--this.field1638 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1639 < var4) {
                                return;
                            }
                            this.field1639 = var4 + var4 - 1 - this.field1639;
                            this.field1632 = -this.field1632;
                            if (--this.field1638 == 0) {
                                break;
                            }
                            if (this.field1639 >= var3) {
                                return;
                            }
                            this.field1639 = var3 + var3 - 1 - this.field1639;
                            this.field1632 = -this.field1632;
                        } while (--this.field1638 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1632 < 0) {
                            if (this.field1639 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1639) / var6;
                            if (var7 >= this.field1638) {
                                this.field1639 += this.field1638 * var6;
                                this.field1638 = 0;
                                break label153;
                            }
                            this.field1639 += var6 * var7;
                            this.field1638 -= var7;
                        } else if (this.field1639 >= var4) {
                            int var8 = (this.field1639 - var3) / var6;
                            if (var8 >= this.field1638) {
                                this.field1639 -= this.field1638 * var6;
                                this.field1638 = 0;
                                break label153;
                            }
                            this.field1639 -= var6 * var8;
                            this.field1638 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1632 < 0) {
                if (this.field1639 < 0) {
                    this.field1639 = -1;
                    this.method2133();
                    this.method3681();
                }
            } else if (this.field1639 >= var5) {
                this.field1639 = var5;
                this.method2133();
                this.method3681();
            }
        } else if (this.field1641) {
            if (this.field1632 < 0) {
                if (this.field1639 >= var3) {
                    return;
                }
                this.field1639 = var3 + var3 - 1 - this.field1639;
                this.field1632 = -this.field1632;
            }
            while (this.field1639 >= var4) {
                this.field1639 = var4 + var4 - 1 - this.field1639;
                this.field1632 = -this.field1632;
                if (this.field1639 >= var3) {
                    return;
                }
                this.field1639 = var3 + var3 - 1 - this.field1639;
                this.field1632 = -this.field1632;
            }
        } else if (this.field1632 < 0) {
            if (this.field1639 >= var3) {
                return;
            }
            this.field1639 = var4 - 1 - (var4 - 1 - this.field1639) % var6;
        } else if (this.field1639 >= var4) {
            this.field1639 = (this.field1639 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("da.ao([IIIII)I")
    public int method2145(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1640 > 0) {
                int var6 = this.field1640 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1640 += arg1;
                if (this.field1632 == 256 && (this.field1639 & 0xFF) == 0) {
                    if (Statics.field1567) {
                        arg1 = method2191(0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, this.field1644, this.field1645, 0, var6, arg2, this);
                    } else {
                        arg1 = method2174(((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, this.field1637, 0, var6, arg2, this);
                    }
                } else if (Statics.field1567) {
                    arg1 = method2160(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, this.field1644, this.field1645, 0, var6, arg2, this, this.field1632, arg4);
                } else {
                    arg1 = method2159(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, this.field1637, 0, var6, arg2, this, this.field1632, arg4);
                }
                this.field1640 -= arg1;
                if (this.field1640 != 0) {
                    return arg1;
                }
                if (!this.method2147()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1632 == 256 && (this.field1639 & 0xFF) == 0) {
                if (Statics.field1567) {
                    return method2136(0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, 0, arg3, arg2, this);
                }
                return method2148(((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, 0, arg3, arg2, this);
            }
            if (Statics.field1567) {
                return method2152(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, 0, arg3, arg2, this, this.field1632, arg4);
            }
            return method2151(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, 0, arg3, arg2, this, this.field1632, arg4);
        }
    }

    @ObfuscatedName("da.ax([IIIII)I")
    public int method2201(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1640 > 0) {
                int var6 = this.field1640 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1640 += arg1;
                if (this.field1632 == -256 && (this.field1639 & 0xFF) == 0) {
                    if (Statics.field1567) {
                        arg1 = method2158(0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, this.field1644, this.field1645, 0, var6, arg2, this);
                    } else {
                        arg1 = method2146(((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, this.field1637, 0, var6, arg2, this);
                    }
                } else if (Statics.field1567) {
                    arg1 = method2254(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, this.field1644, this.field1645, 0, var6, arg2, this, this.field1632, arg4);
                } else {
                    arg1 = method2161(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, this.field1637, 0, var6, arg2, this, this.field1632, arg4);
                }
                this.field1640 -= arg1;
                if (this.field1640 != 0) {
                    return arg1;
                }
                if (!this.method2147()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1632 == -256 && (this.field1639 & 0xFF) == 0) {
                if (Statics.field1567) {
                    return method2150(0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, 0, arg3, arg2, this);
                }
                return method2149(((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, 0, arg3, arg2, this);
            }
            if (Statics.field1567) {
                return method2154(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1636, this.field1642, 0, arg3, arg2, this, this.field1632, arg4);
            }
            return method2153(0, 0, ((class106) this.field1658).field1546, arg0, this.field1639, arg1, this.field1635, 0, arg3, arg2, this, this.field1632, arg4);
        }
    }

    @ObfuscatedName("da.au()Z")
    public boolean method2147() {
        int var1 = this.field1631;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2232(var1, this.field1634);
            var2 = method2119(var1, this.field1634);
        }
        if (this.field1635 != var1 || this.field1636 != var3 || this.field1642 != var2) {
            if (this.field1635 < var1) {
                this.field1637 = 1;
                this.field1640 = var1 - this.field1635;
            } else if (this.field1635 > var1) {
                this.field1637 = -1;
                this.field1640 = this.field1635 - var1;
            } else {
                this.field1637 = 0;
            }
            if (this.field1636 < var3) {
                this.field1644 = 1;
                if (this.field1640 == 0 || this.field1640 > var3 - this.field1636) {
                    this.field1640 = var3 - this.field1636;
                }
            } else if (this.field1636 > var3) {
                this.field1644 = -1;
                if (this.field1640 == 0 || this.field1640 > this.field1636 - var3) {
                    this.field1640 = this.field1636 - var3;
                }
            } else {
                this.field1644 = 0;
            }
            if (this.field1642 < var2) {
                this.field1645 = 1;
                if (this.field1640 == 0 || this.field1640 > var2 - this.field1642) {
                    this.field1640 = var2 - this.field1642;
                }
            } else if (this.field1642 > var2) {
                this.field1645 = -1;
                if (this.field1640 == 0 || this.field1640 > this.field1642 - var2) {
                    this.field1640 = this.field1642 - var2;
                }
            } else {
                this.field1645 = 0;
            }
            return false;
        } else if (this.field1631 == Integer.MIN_VALUE) {
            this.field1631 = 0;
            this.field1642 = 0;
            this.field1636 = 0;
            this.field1635 = 0;
            this.method3681();
            return true;
        } else {
            this.method2124();
            return false;
        }
    }

    @ObfuscatedName("da.ar([B[IIIIIIILda;)I")
    public static int method2148(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1639 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.an(I[B[IIIIIIIILda;)I")
    public static int method2136(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1639 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.aw([B[IIIIIIILda;)I")
    public static int method2149(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1639 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.ak(I[B[IIIIIIIILda;)I")
    public static int method2150(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1639 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.as(II[B[IIIIIIILda;II)I")
    public static int method2151(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1639 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.aj(II[B[IIIIIIIILda;II)I")
    public static int method2152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1639 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.ay(II[B[IIIIIIILda;II)I")
    public static int method2153(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1639 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bm(II[B[IIIIIIIILda;II)I")
    public static int method2154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1639 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.bx([B[IIIIIIIILda;)I")
    public static int method2174(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1636 += (var14 - arg3) * arg9.field1644;
        arg9.field1642 += (var14 - arg3) * arg9.field1645;
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
        arg9.field1635 = var12 >> 2;
        arg9.field1639 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bl(I[B[IIIIIIIIIILda;)I")
    public static int method2191(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1635 += (var19 - arg4) * arg12.field1637;
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
        arg12.field1636 = var15 >> 2;
        arg12.field1642 = var16 >> 2;
        arg12.field1639 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bf([B[IIIIIIIILda;)I")
    public static int method2146(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1636 += (var14 - arg3) * arg9.field1644;
        arg9.field1642 += (var14 - arg3) * arg9.field1645;
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
        arg9.field1635 = var12 >> 2;
        arg9.field1639 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bp(I[B[IIIIIIIIIILda;)I")
    public static int method2158(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1635 += (var19 - arg4) * arg12.field1637;
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
        arg12.field1636 = var15 >> 2;
        arg12.field1642 = var16 >> 2;
        arg12.field1639 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bs(II[B[IIIIIIIILda;II)I")
    public static int method2159(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1636 -= arg11.field1644 * arg5;
        arg11.field1642 -= arg11.field1645 * arg5;
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
        arg11.field1636 += arg11.field1644 * arg5;
        arg11.field1642 += arg11.field1645 * arg5;
        arg11.field1635 = arg6;
        arg11.field1639 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bu(II[B[IIIIIIIIIILda;II)I")
    public static int method2160(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1635 -= arg13.field1637 * arg5;
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
        arg13.field1635 += arg13.field1637 * var27;
        arg13.field1636 = arg6;
        arg13.field1642 = arg7;
        arg13.field1639 = arg4;
        return var27;
    }

    @ObfuscatedName("da.br(II[B[IIIIIIIILda;II)I")
    public static int method2161(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1636 -= arg11.field1644 * arg5;
        arg11.field1642 -= arg11.field1645 * arg5;
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
        arg11.field1636 += arg11.field1644 * arg5;
        arg11.field1642 += arg11.field1645 * arg5;
        arg11.field1635 = arg6;
        arg11.field1639 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bk(II[B[IIIIIIIIIILda;II)I")
    public static int method2254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1635 -= arg13.field1637 * arg5;
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
        arg13.field1635 += arg13.field1637 * var26;
        arg13.field1636 = arg6;
        arg13.field1642 = arg7;
        arg13.field1639 = arg4;
        return var26;
    }
}
