package deob;

@ObfuscatedName("dp")
public class class116 extends class118 {

    @ObfuscatedName("dp.d")
    public int field1614;

    @ObfuscatedName("dp.z")
    public int field1624;

    @ObfuscatedName("dp.n")
    public int field1620;

    @ObfuscatedName("dp.r")
    public int field1615;

    @ObfuscatedName("dp.e")
    public int field1616;

    @ObfuscatedName("dp.y")
    public int field1617;

    @ObfuscatedName("dp.k")
    public int field1612;

    @ObfuscatedName("dp.s")
    public int field1619;

    @ObfuscatedName("dp.p")
    public int field1618;

    @ObfuscatedName("dp.x")
    public int field1613;

    @ObfuscatedName("dp.m")
    public boolean field1622;

    @ObfuscatedName("dp.h")
    public int field1623;

    @ObfuscatedName("dp.t")
    public int field1626;

    @ObfuscatedName("dp.i")
    public int field1625;

    @ObfuscatedName("dp.u")
    public int field1621;

    @ObfuscatedName("dp.d(II)I")
    public static int method2186(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dp.z(II)I")
    public static int method2244(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dp.aj()I")
    public int method2172() {
        int var1 = this.field1616 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1619 == 0) {
            var2 -= this.field1614 * var2 / (((class106) this.field1642).field1533.length << 8);
        } else if (this.field1619 >= 0) {
            var2 -= this.field1618 * var2 / ((class106) this.field1642).field1533.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class116(class106 arg0, int arg1, int arg2) {
        this.field1642 = arg0;
        this.field1618 = arg0.field1534;
        this.field1613 = arg0.field1532;
        this.field1622 = arg0.field1536;
        this.field1624 = arg1;
        this.field1620 = arg2;
        this.field1615 = 8192;
        this.field1614 = 0;
        this.method2200();
    }

    public class116(class106 arg0, int arg1, int arg2, int arg3) {
        this.field1642 = arg0;
        this.field1618 = arg0.field1534;
        this.field1613 = arg0.field1532;
        this.field1622 = arg0.field1536;
        this.field1624 = arg1;
        this.field1620 = arg2;
        this.field1615 = arg3;
        this.field1614 = 0;
        this.method2200();
    }

    @ObfuscatedName("dp.n(Ldd;II)Ldp;")
    public static class116 method2174(class106 arg0, int arg1, int arg2) {
        return arg0.field1533 == null || arg0.field1533.length == 0 ? null : new class116(arg0, (int) ((long) arg0.field1535 * 256L * (long) arg1 / (long) (Statics.field646 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dp.r(Ldd;III)Ldp;")
    public static class116 method2256(class106 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1533 == null || arg0.field1533.length == 0 ? null : new class116(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dp.e()V")
    public void method2200() {
        this.field1616 = this.field1620;
        this.field1617 = method2186(this.field1620, this.field1615);
        this.field1612 = method2244(this.field1620, this.field1615);
    }

    @ObfuscatedName("dp.h(I)V")
    public synchronized void method2176(int arg0) {
        this.field1619 = arg0;
    }

    @ObfuscatedName("dp.i(I)V")
    public synchronized void method2177(int arg0) {
        this.method2212(arg0 << 6, this.method2237());
    }

    @ObfuscatedName("dp.u(I)V")
    public synchronized void method2182(int arg0) {
        this.method2212(arg0, this.method2237());
    }

    @ObfuscatedName("dp.q(II)V")
    public synchronized void method2212(int arg0, int arg1) {
        this.field1620 = arg0;
        this.field1615 = arg1;
        this.field1623 = 0;
        this.method2200();
    }

    @ObfuscatedName("dp.v()I")
    public synchronized int method2180() {
        return this.field1620 == Integer.MIN_VALUE ? 0 : this.field1620;
    }

    @ObfuscatedName("dp.f()I")
    public synchronized int method2237() {
        return this.field1615 < 0 ? -1 : this.field1615;
    }

    @ObfuscatedName("dp.b(I)V")
    public synchronized void method2273(int arg0) {
        int var2 = ((class106) this.field1642).field1533.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1614 = arg0;
    }

    @ObfuscatedName("dp.c(Z)V")
    public synchronized void method2210(boolean arg0) {
        this.field1624 = (this.field1624 >>> 31) + (this.field1624 ^ this.field1624 >> 31);
        if (arg0) {
            this.field1624 = -this.field1624;
        }
    }

    @ObfuscatedName("dp.w()V")
    public void method2183() {
        if (this.field1623 == 0) {
            return;
        }
        if (this.field1620 == Integer.MIN_VALUE) {
            this.field1620 = 0;
        }
        this.field1623 = 0;
        this.method2200();
    }

    @ObfuscatedName("dp.o(II)V")
    public synchronized void method2184(int arg0, int arg1) {
        this.method2185(arg0, arg1, this.method2237());
    }

    @ObfuscatedName("dp.a(III)V")
    public synchronized void method2185(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2212(arg1, arg2);
            return;
        }
        int var4 = method2186(arg1, arg2);
        int var5 = method2244(arg1, arg2);
        if (this.field1617 == var4 && this.field1612 == var5) {
            this.field1623 = 0;
            return;
        }
        int var6 = arg1 - this.field1616;
        if (this.field1616 - arg1 > var6) {
            var6 = this.field1616 - arg1;
        }
        if (var4 - this.field1617 > var6) {
            var6 = var4 - this.field1617;
        }
        if (this.field1617 - var4 > var6) {
            var6 = this.field1617 - var4;
        }
        if (var5 - this.field1612 > var6) {
            var6 = var5 - this.field1612;
        }
        if (this.field1612 - var5 > var6) {
            var6 = this.field1612 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1623 = arg0;
        this.field1620 = arg1;
        this.field1615 = arg2;
        this.field1626 = (arg1 - this.field1616) / arg0;
        this.field1625 = (var4 - this.field1617) / arg0;
        this.field1621 = (var5 - this.field1612) / arg0;
    }

    @ObfuscatedName("dp.ak(I)V")
    public synchronized void method2214(int arg0) {
        if (arg0 == 0) {
            this.method2182(0);
            this.method3785();
        } else if (this.field1617 == 0 && this.field1612 == 0) {
            this.field1623 = 0;
            this.field1620 = 0;
            this.field1616 = 0;
            this.method3785();
        } else {
            int var2 = -this.field1616;
            if (this.field1616 > var2) {
                var2 = this.field1616;
            }
            if (-this.field1617 > var2) {
                var2 = -this.field1617;
            }
            if (this.field1617 > var2) {
                var2 = this.field1617;
            }
            if (-this.field1612 > var2) {
                var2 = -this.field1612;
            }
            if (this.field1612 > var2) {
                var2 = this.field1612;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1623 = arg0;
            this.field1620 = Integer.MIN_VALUE;
            this.field1626 = -this.field1616 / arg0;
            this.field1625 = -this.field1617 / arg0;
            this.field1621 = -this.field1612 / arg0;
        }
    }

    @ObfuscatedName("dp.ap(I)V")
    public synchronized void method2187(int arg0) {
        if (this.field1624 < 0) {
            this.field1624 = -arg0;
        } else {
            this.field1624 = arg0;
        }
    }

    @ObfuscatedName("dp.ac()I")
    public synchronized int method2281() {
        return this.field1624 < 0 ? -this.field1624 : this.field1624;
    }

    @ObfuscatedName("dp.ao()Z")
    public boolean method2250() {
        return this.field1614 < 0 || this.field1614 >= ((class106) this.field1642).field1533.length << 8;
    }

    @ObfuscatedName("dp.at()Z")
    public boolean method2190() {
        return this.field1623 != 0;
    }

    @ObfuscatedName("dp.y()Ldt;")
    public class118 method1947() {
        return null;
    }

    @ObfuscatedName("dp.k()Ldt;")
    public class118 method1960() {
        return null;
    }

    @ObfuscatedName("dp.s()I")
    public int method1973() {
        return this.field1620 == 0 && this.field1623 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dp.x([III)V")
    public synchronized void method1949(int[] arg0, int arg1, int arg2) {
        if (this.field1620 == 0 && this.field1623 == 0) {
            this.method1952(arg2);
            return;
        }
        class106 var4 = (class106) this.field1642;
        int var5 = this.field1618 << 8;
        int var6 = this.field1613 << 8;
        int var7 = var4.field1533.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1619 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1614 < 0) {
            if (this.field1624 <= 0) {
                this.method2183();
                this.method3785();
                return;
            }
            this.field1614 = 0;
        }
        if (this.field1614 >= var7) {
            if (this.field1624 >= 0) {
                this.method2183();
                this.method3785();
                return;
            }
            this.field1614 = var7 - 1;
        }
        if (this.field1619 >= 0) {
            if (this.field1619 > 0) {
                if (this.field1622) {
                    label131: {
                        if (this.field1624 < 0) {
                            var9 = this.method2307(arg0, arg1, var5, var10, var4.field1533[this.field1618]);
                            if (this.field1614 >= var5) {
                                return;
                            }
                            this.field1614 = var5 + var5 - 1 - this.field1614;
                            this.field1624 = -this.field1624;
                            if (--this.field1619 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2171(arg0, var9, var6, var10, var4.field1533[this.field1613 - 1]);
                            if (this.field1614 < var6) {
                                return;
                            }
                            this.field1614 = var6 + var6 - 1 - this.field1614;
                            this.field1624 = -this.field1624;
                            if (--this.field1619 == 0) {
                                break;
                            }
                            var9 = this.method2307(arg0, var9, var5, var10, var4.field1533[this.field1618]);
                            if (this.field1614 >= var5) {
                                return;
                            }
                            this.field1614 = var5 + var5 - 1 - this.field1614;
                            this.field1624 = -this.field1624;
                        } while (--this.field1619 != 0);
                    }
                } else if (this.field1624 < 0) {
                    while (true) {
                        var9 = this.method2307(arg0, var9, var5, var10, var4.field1533[this.field1613 - 1]);
                        if (this.field1614 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1614) / var8;
                        if (var12 >= this.field1619) {
                            this.field1614 += this.field1619 * var8;
                            this.field1619 = 0;
                            break;
                        }
                        this.field1614 += var8 * var12;
                        this.field1619 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2171(arg0, var9, var6, var10, var4.field1533[this.field1618]);
                        if (this.field1614 < var6) {
                            return;
                        }
                        int var13 = (this.field1614 - var5) / var8;
                        if (var13 >= this.field1619) {
                            this.field1614 -= this.field1619 * var8;
                            this.field1619 = 0;
                            break;
                        }
                        this.field1614 -= var8 * var13;
                        this.field1619 -= var13;
                    }
                }
            }
            if (this.field1624 < 0) {
                this.method2307(arg0, var9, 0, var10, 0);
                if (this.field1614 < 0) {
                    this.field1614 = -1;
                    this.method2183();
                    this.method3785();
                }
            } else {
                this.method2171(arg0, var9, var7, var10, 0);
                if (this.field1614 >= var7) {
                    this.field1614 = var7;
                    this.method2183();
                    this.method3785();
                }
            }
        } else if (this.field1622) {
            if (this.field1624 < 0) {
                var9 = this.method2307(arg0, arg1, var5, var10, var4.field1533[this.field1618]);
                if (this.field1614 >= var5) {
                    return;
                }
                this.field1614 = var5 + var5 - 1 - this.field1614;
                this.field1624 = -this.field1624;
            }
            while (true) {
                int var11 = this.method2171(arg0, var9, var6, var10, var4.field1533[this.field1613 - 1]);
                if (this.field1614 < var6) {
                    return;
                }
                this.field1614 = var6 + var6 - 1 - this.field1614;
                this.field1624 = -this.field1624;
                var9 = this.method2307(arg0, var11, var5, var10, var4.field1533[this.field1618]);
                if (this.field1614 >= var5) {
                    return;
                }
                this.field1614 = var5 + var5 - 1 - this.field1614;
                this.field1624 = -this.field1624;
            }
        } else if (this.field1624 < 0) {
            while (true) {
                var9 = this.method2307(arg0, var9, var5, var10, var4.field1533[this.field1613 - 1]);
                if (this.field1614 >= var5) {
                    return;
                }
                this.field1614 = var6 - 1 - (var6 - 1 - this.field1614) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2171(arg0, var9, var6, var10, var4.field1533[this.field1618]);
                if (this.field1614 < var6) {
                    return;
                }
                this.field1614 = (this.field1614 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dp.t(I)V")
    public synchronized void method1952(int arg0) {
        if (this.field1623 > 0) {
            if (arg0 >= this.field1623) {
                if (this.field1620 == Integer.MIN_VALUE) {
                    this.field1620 = 0;
                    this.field1612 = 0;
                    this.field1617 = 0;
                    this.field1616 = 0;
                    this.method3785();
                    arg0 = this.field1623;
                }
                this.field1623 = 0;
                this.method2200();
            } else {
                this.field1616 += this.field1626 * arg0;
                this.field1617 += this.field1625 * arg0;
                this.field1612 += this.field1621 * arg0;
                this.field1623 -= arg0;
            }
        }
        class106 var2 = (class106) this.field1642;
        int var3 = this.field1618 << 8;
        int var4 = this.field1613 << 8;
        int var5 = var2.field1533.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1619 = 0;
        }
        if (this.field1614 < 0) {
            if (this.field1624 <= 0) {
                this.method2183();
                this.method3785();
                return;
            }
            this.field1614 = 0;
        }
        if (this.field1614 >= var5) {
            if (this.field1624 >= 0) {
                this.method2183();
                this.method3785();
                return;
            }
            this.field1614 = var5 - 1;
        }
        this.field1614 += this.field1624 * arg0;
        if (this.field1619 >= 0) {
            if (this.field1619 > 0) {
                if (this.field1622) {
                    label121: {
                        if (this.field1624 < 0) {
                            if (this.field1614 >= var3) {
                                return;
                            }
                            this.field1614 = var3 + var3 - 1 - this.field1614;
                            this.field1624 = -this.field1624;
                            if (--this.field1619 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1614 < var4) {
                                return;
                            }
                            this.field1614 = var4 + var4 - 1 - this.field1614;
                            this.field1624 = -this.field1624;
                            if (--this.field1619 == 0) {
                                break;
                            }
                            if (this.field1614 >= var3) {
                                return;
                            }
                            this.field1614 = var3 + var3 - 1 - this.field1614;
                            this.field1624 = -this.field1624;
                        } while (--this.field1619 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1624 < 0) {
                            if (this.field1614 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1614) / var6;
                            if (var7 >= this.field1619) {
                                this.field1614 += this.field1619 * var6;
                                this.field1619 = 0;
                                break label153;
                            }
                            this.field1614 += var6 * var7;
                            this.field1619 -= var7;
                        } else if (this.field1614 >= var4) {
                            int var8 = (this.field1614 - var3) / var6;
                            if (var8 >= this.field1619) {
                                this.field1614 -= this.field1619 * var6;
                                this.field1619 = 0;
                                break label153;
                            }
                            this.field1614 -= var6 * var8;
                            this.field1619 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1624 < 0) {
                if (this.field1614 < 0) {
                    this.field1614 = -1;
                    this.method2183();
                    this.method3785();
                }
            } else if (this.field1614 >= var5) {
                this.field1614 = var5;
                this.method2183();
                this.method3785();
            }
        } else if (this.field1622) {
            if (this.field1624 < 0) {
                if (this.field1614 >= var3) {
                    return;
                }
                this.field1614 = var3 + var3 - 1 - this.field1614;
                this.field1624 = -this.field1624;
            }
            while (this.field1614 >= var4) {
                this.field1614 = var4 + var4 - 1 - this.field1614;
                this.field1624 = -this.field1624;
                if (this.field1614 >= var3) {
                    return;
                }
                this.field1614 = var3 + var3 - 1 - this.field1614;
                this.field1624 = -this.field1624;
            }
        } else if (this.field1624 < 0) {
            if (this.field1614 >= var3) {
                return;
            }
            this.field1614 = var4 - 1 - (var4 - 1 - this.field1614) % var6;
        } else if (this.field1614 >= var4) {
            this.field1614 = (this.field1614 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dp.ag([IIIII)I")
    public int method2171(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1623 > 0) {
                int var6 = this.field1623 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1623 += arg1;
                if (this.field1624 == 256 && (this.field1614 & 0xFF) == 0) {
                    if (Statics.field1557) {
                        arg1 = method2204(0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, this.field1625, this.field1621, 0, var6, arg2, this);
                    } else {
                        arg1 = method2226(((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, this.field1626, 0, var6, arg2, this);
                    }
                } else if (Statics.field1557) {
                    arg1 = method2289(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, this.field1625, this.field1621, 0, var6, arg2, this, this.field1624, arg4);
                } else {
                    arg1 = method2206(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, this.field1626, 0, var6, arg2, this, this.field1624, arg4);
                }
                this.field1623 -= arg1;
                if (this.field1623 != 0) {
                    return arg1;
                }
                if (!this.method2195()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1624 == 256 && (this.field1614 & 0xFF) == 0) {
                if (Statics.field1557) {
                    return method2197(0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, 0, arg3, arg2, this);
                }
                return method2196(((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this);
            }
            if (Statics.field1557) {
                return method2201(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, 0, arg3, arg2, this, this.field1624, arg4);
            }
            return method2188(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this, this.field1624, arg4);
        }
    }

    @ObfuscatedName("dp.am([IIIII)I")
    public int method2307(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1623 > 0) {
                int var6 = this.field1623 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1623 += arg1;
                if (this.field1624 == -256 && (this.field1614 & 0xFF) == 0) {
                    if (Statics.field1557) {
                        arg1 = method2298(0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, this.field1625, this.field1621, 0, var6, arg2, this);
                    } else {
                        arg1 = method2205(((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, this.field1626, 0, var6, arg2, this);
                    }
                } else if (Statics.field1557) {
                    arg1 = method2209(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, this.field1625, this.field1621, 0, var6, arg2, this, this.field1624, arg4);
                } else {
                    arg1 = method2208(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, this.field1626, 0, var6, arg2, this, this.field1624, arg4);
                }
                this.field1623 -= arg1;
                if (this.field1623 != 0) {
                    return arg1;
                }
                if (!this.method2195()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1624 == -256 && (this.field1614 & 0xFF) == 0) {
                if (Statics.field1557) {
                    return method2306(0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, 0, arg3, arg2, this);
                }
                return method2198(((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this);
            }
            if (Statics.field1557) {
                return method2241(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1617, this.field1612, 0, arg3, arg2, this, this.field1624, arg4);
            }
            return method2202(0, 0, ((class106) this.field1642).field1533, arg0, this.field1614, arg1, this.field1616, 0, arg3, arg2, this, this.field1624, arg4);
        }
    }

    @ObfuscatedName("dp.ay()Z")
    public boolean method2195() {
        int var1 = this.field1620;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2186(var1, this.field1615);
            var2 = method2244(var1, this.field1615);
        }
        if (this.field1616 != var1 || this.field1617 != var3 || this.field1612 != var2) {
            if (this.field1616 < var1) {
                this.field1626 = 1;
                this.field1623 = var1 - this.field1616;
            } else if (this.field1616 > var1) {
                this.field1626 = -1;
                this.field1623 = this.field1616 - var1;
            } else {
                this.field1626 = 0;
            }
            if (this.field1617 < var3) {
                this.field1625 = 1;
                if (this.field1623 == 0 || this.field1623 > var3 - this.field1617) {
                    this.field1623 = var3 - this.field1617;
                }
            } else if (this.field1617 > var3) {
                this.field1625 = -1;
                if (this.field1623 == 0 || this.field1623 > this.field1617 - var3) {
                    this.field1623 = this.field1617 - var3;
                }
            } else {
                this.field1625 = 0;
            }
            if (this.field1612 < var2) {
                this.field1621 = 1;
                if (this.field1623 == 0 || this.field1623 > var2 - this.field1612) {
                    this.field1623 = var2 - this.field1612;
                }
            } else if (this.field1612 > var2) {
                this.field1621 = -1;
                if (this.field1623 == 0 || this.field1623 > this.field1612 - var2) {
                    this.field1623 = this.field1612 - var2;
                }
            } else {
                this.field1621 = 0;
            }
            return false;
        } else if (this.field1620 == Integer.MIN_VALUE) {
            this.field1620 = 0;
            this.field1612 = 0;
            this.field1617 = 0;
            this.field1616 = 0;
            this.method3785();
            return true;
        } else {
            this.method2200();
            return false;
        }
    }

    @ObfuscatedName("dp.aa([B[IIIIIIILdp;)I")
    public static int method2196(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1614 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.av(I[B[IIIIIIIILdp;)I")
    public static int method2197(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1614 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dp.bc([B[IIIIIIILdp;)I")
    public static int method2198(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1614 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.br(I[B[IIIIIIIILdp;)I")
    public static int method2306(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1614 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dp.by(II[B[IIIIIIILdp;II)I")
    public static int method2188(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1614 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bl(II[B[IIIIIIIILdp;II)I")
    public static int method2201(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1614 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dp.bs(II[B[IIIIIIILdp;II)I")
    public static int method2202(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1614 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bu(II[B[IIIIIIIILdp;II)I")
    public static int method2241(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1614 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dp.bz([B[IIIIIIIILdp;)I")
    public static int method2226(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1617 += (var14 - arg3) * arg9.field1625;
        arg9.field1612 += (var14 - arg3) * arg9.field1621;
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
        arg9.field1616 = var12 >> 2;
        arg9.field1614 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.bt(I[B[IIIIIIIIIILdp;)I")
    public static int method2204(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1616 += (var19 - arg4) * arg12.field1626;
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
        arg12.field1617 = var15 >> 2;
        arg12.field1612 = var16 >> 2;
        arg12.field1614 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dp.bm([B[IIIIIIIILdp;)I")
    public static int method2205(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1617 += (var14 - arg3) * arg9.field1625;
        arg9.field1612 += (var14 - arg3) * arg9.field1621;
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
        arg9.field1616 = var12 >> 2;
        arg9.field1614 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.bf(I[B[IIIIIIIIIILdp;)I")
    public static int method2298(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1616 += (var19 - arg4) * arg12.field1626;
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
        arg12.field1617 = var15 >> 2;
        arg12.field1612 = var16 >> 2;
        arg12.field1614 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dp.bj(II[B[IIIIIIIILdp;II)I")
    public static int method2206(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1617 -= arg11.field1625 * arg5;
        arg11.field1612 -= arg11.field1621 * arg5;
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
        arg11.field1617 += arg11.field1625 * arg5;
        arg11.field1612 += arg11.field1621 * arg5;
        arg11.field1616 = arg6;
        arg11.field1614 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bx(II[B[IIIIIIIIIILdp;II)I")
    public static int method2289(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1616 -= arg13.field1626 * arg5;
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
        arg13.field1616 += arg13.field1626 * var27;
        arg13.field1617 = arg6;
        arg13.field1612 = arg7;
        arg13.field1614 = arg4;
        return var27;
    }

    @ObfuscatedName("dp.be(II[B[IIIIIIIILdp;II)I")
    public static int method2208(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1617 -= arg11.field1625 * arg5;
        arg11.field1612 -= arg11.field1621 * arg5;
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
        arg11.field1617 += arg11.field1625 * arg5;
        arg11.field1612 += arg11.field1621 * arg5;
        arg11.field1616 = arg6;
        arg11.field1614 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bn(II[B[IIIIIIIIIILdp;II)I")
    public static int method2209(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1616 -= arg13.field1626 * arg5;
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
        arg13.field1616 += arg13.field1626 * var26;
        arg13.field1617 = arg6;
        arg13.field1612 = arg7;
        arg13.field1614 = arg4;
        return var26;
    }
}
