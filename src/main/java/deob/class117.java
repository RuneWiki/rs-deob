package deob;

@ObfuscatedName("dg")
public class class117 extends class119 {

    @ObfuscatedName("dg.a")
    public int field1590;

    @ObfuscatedName("dg.e")
    public int field1586;

    @ObfuscatedName("dg.k")
    public int field1587;

    @ObfuscatedName("dg.u")
    public int field1598;

    @ObfuscatedName("dg.z")
    public int field1591;

    @ObfuscatedName("dg.t")
    public int field1589;

    @ObfuscatedName("dg.f")
    public int field1585;

    @ObfuscatedName("dg.g")
    public int field1592;

    @ObfuscatedName("dg.j")
    public int field1593;

    @ObfuscatedName("dg.x")
    public int field1594;

    @ObfuscatedName("dg.c")
    public boolean field1595;

    @ObfuscatedName("dg.s")
    public int field1599;

    @ObfuscatedName("dg.n")
    public int field1597;

    @ObfuscatedName("dg.y")
    public int field1596;

    @ObfuscatedName("dg.o")
    public int field1588;

    @ObfuscatedName("dg.a(II)I")
    public static int method2058(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dg.w(II)I")
    public static int method1999(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dg.aa()I")
    public int method1931() {
        int var1 = this.field1591 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1592 == 0) {
            var2 -= this.field1590 * var2 / (((class107) this.field1614).field1510.length << 8);
        } else if (this.field1592 >= 0) {
            var2 -= this.field1593 * var2 / ((class107) this.field1614).field1510.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class117(class107 arg0, int arg1, int arg2) {
        this.field1614 = arg0;
        this.field1593 = arg0.field1511;
        this.field1594 = arg0.field1509;
        this.field1595 = arg0.field1513;
        this.field1586 = arg1;
        this.field1587 = arg2;
        this.field1598 = 8192;
        this.field1590 = 0;
        this.method1935();
    }

    public class117(class107 arg0, int arg1, int arg2, int arg3) {
        this.field1614 = arg0;
        this.field1593 = arg0.field1511;
        this.field1594 = arg0.field1509;
        this.field1595 = arg0.field1513;
        this.field1586 = arg1;
        this.field1587 = arg2;
        this.field1598 = arg3;
        this.field1590 = 0;
        this.method1935();
    }

    @ObfuscatedName("dg.e(Ldx;II)Ldg;")
    public static class117 method1974(class107 arg0, int arg1, int arg2) {
        return arg0.field1510 == null || arg0.field1510.length == 0 ? null : new class117(arg0, (int) ((long) arg0.field1512 * 256L * (long) arg1 / (long) (Statics.field715 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dg.k(Ldx;III)Ldg;")
    public static class117 method1934(class107 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1510 == null || arg0.field1510.length == 0 ? null : new class117(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dg.u()V")
    public void method1935() {
        this.field1591 = this.field1587;
        this.field1589 = method2058(this.field1587, this.field1598);
        this.field1585 = method1999(this.field1587, this.field1598);
    }

    @ObfuscatedName("dg.x(I)V")
    public synchronized void method1936(int arg0) {
        this.field1592 = arg0;
    }

    @ObfuscatedName("dg.n(I)V")
    public synchronized void method1985(int arg0) {
        this.method1939(arg0 << 6, this.method1941());
    }

    @ObfuscatedName("dg.y(I)V")
    public synchronized void method1938(int arg0) {
        this.method1939(arg0, this.method1941());
    }

    @ObfuscatedName("dg.o(II)V")
    public synchronized void method1939(int arg0, int arg1) {
        this.field1587 = arg0;
        this.field1598 = arg1;
        this.field1599 = 0;
        this.method1935();
    }

    @ObfuscatedName("dg.r()I")
    public synchronized int method1940() {
        return this.field1587 == Integer.MIN_VALUE ? 0 : this.field1587;
    }

    @ObfuscatedName("dg.i()I")
    public synchronized int method1941() {
        return this.field1598 < 0 ? -1 : this.field1598;
    }

    @ObfuscatedName("dg.q(I)V")
    public synchronized void method2029(int arg0) {
        int var2 = ((class107) this.field1614).field1510.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1590 = arg0;
    }

    @ObfuscatedName("dg.b(Z)V")
    public synchronized void method2044(boolean arg0) {
        this.field1586 = (this.field1586 >>> 31) + (this.field1586 ^ this.field1586 >> 31);
        if (arg0) {
            this.field1586 = -this.field1586;
        }
    }

    @ObfuscatedName("dg.h()V")
    public void method1944() {
        if (this.field1599 == 0) {
            return;
        }
        if (this.field1587 == Integer.MIN_VALUE) {
            this.field1587 = 0;
        }
        this.field1599 = 0;
        this.method1935();
    }

    @ObfuscatedName("dg.d(II)V")
    public synchronized void method1945(int arg0, int arg1) {
        this.method1946(arg0, arg1, this.method1941());
    }

    @ObfuscatedName("dg.v(III)V")
    public synchronized void method1946(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1939(arg1, arg2);
            return;
        }
        int var4 = method2058(arg1, arg2);
        int var5 = method1999(arg1, arg2);
        if (this.field1589 == var4 && this.field1585 == var5) {
            this.field1599 = 0;
            return;
        }
        int var6 = arg1 - this.field1591;
        if (this.field1591 - arg1 > var6) {
            var6 = this.field1591 - arg1;
        }
        if (var4 - this.field1589 > var6) {
            var6 = var4 - this.field1589;
        }
        if (this.field1589 - var4 > var6) {
            var6 = this.field1589 - var4;
        }
        if (var5 - this.field1585 > var6) {
            var6 = var5 - this.field1585;
        }
        if (this.field1585 - var5 > var6) {
            var6 = this.field1585 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1599 = arg0;
        this.field1587 = arg1;
        this.field1598 = arg2;
        this.field1597 = (arg1 - this.field1591) / arg0;
        this.field1596 = (var4 - this.field1589) / arg0;
        this.field1588 = (var5 - this.field1585) / arg0;
    }

    @ObfuscatedName("dg.p(I)V")
    public synchronized void method1981(int arg0) {
        if (arg0 == 0) {
            this.method1938(0);
            this.method3427();
        } else if (this.field1589 == 0 && this.field1585 == 0) {
            this.field1599 = 0;
            this.field1587 = 0;
            this.field1591 = 0;
            this.method3427();
        } else {
            int var2 = -this.field1591;
            if (this.field1591 > var2) {
                var2 = this.field1591;
            }
            if (-this.field1589 > var2) {
                var2 = -this.field1589;
            }
            if (this.field1589 > var2) {
                var2 = this.field1589;
            }
            if (-this.field1585 > var2) {
                var2 = -this.field1585;
            }
            if (this.field1585 > var2) {
                var2 = this.field1585;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1599 = arg0;
            this.field1587 = Integer.MIN_VALUE;
            this.field1597 = -this.field1591 / arg0;
            this.field1596 = -this.field1589 / arg0;
            this.field1588 = -this.field1585 / arg0;
        }
    }

    @ObfuscatedName("dg.ab(I)V")
    public synchronized void method2018(int arg0) {
        if (this.field1586 < 0) {
            this.field1586 = -arg0;
        } else {
            this.field1586 = arg0;
        }
    }

    @ObfuscatedName("dg.ad()I")
    public synchronized int method1948() {
        return this.field1586 < 0 ? -this.field1586 : this.field1586;
    }

    @ObfuscatedName("dg.ag()Z")
    public boolean method2006() {
        return this.field1590 < 0 || this.field1590 >= ((class107) this.field1614).field1510.length << 8;
    }

    @ObfuscatedName("dg.ak()Z")
    public boolean method1950() {
        return this.field1599 != 0;
    }

    @ObfuscatedName("dg.z()Ldy;")
    public class119 method1730() {
        return null;
    }

    @ObfuscatedName("dg.t()Ldy;")
    public class119 method1758() {
        return null;
    }

    @ObfuscatedName("dg.f()I")
    public int method1732() {
        return this.field1587 == 0 && this.field1599 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dg.g([III)V")
    public synchronized void method1733(int[] arg0, int arg1, int arg2) {
        if (this.field1587 == 0 && this.field1599 == 0) {
            this.method1735(arg2);
            return;
        }
        class107 var4 = (class107) this.field1614;
        int var5 = this.field1593 << 8;
        int var6 = this.field1594 << 8;
        int var7 = var4.field1510.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1592 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1590 < 0) {
            if (this.field1586 <= 0) {
                this.method1944();
                this.method3427();
                return;
            }
            this.field1590 = 0;
        }
        if (this.field1590 >= var7) {
            if (this.field1586 >= 0) {
                this.method1944();
                this.method3427();
                return;
            }
            this.field1590 = var7 - 1;
        }
        if (this.field1592 >= 0) {
            if (this.field1592 > 0) {
                if (this.field1595) {
                    label131: {
                        if (this.field1586 < 0) {
                            var9 = this.method1955(arg0, arg1, var5, var10, var4.field1510[this.field1593]);
                            if (this.field1590 >= var5) {
                                return;
                            }
                            this.field1590 = var5 + var5 - 1 - this.field1590;
                            this.field1586 = -this.field1586;
                            if (--this.field1592 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1954(arg0, var9, var6, var10, var4.field1510[this.field1594 - 1]);
                            if (this.field1590 < var6) {
                                return;
                            }
                            this.field1590 = var6 + var6 - 1 - this.field1590;
                            this.field1586 = -this.field1586;
                            if (--this.field1592 == 0) {
                                break;
                            }
                            var9 = this.method1955(arg0, var9, var5, var10, var4.field1510[this.field1593]);
                            if (this.field1590 >= var5) {
                                return;
                            }
                            this.field1590 = var5 + var5 - 1 - this.field1590;
                            this.field1586 = -this.field1586;
                        } while (--this.field1592 != 0);
                    }
                } else if (this.field1586 < 0) {
                    while (true) {
                        var9 = this.method1955(arg0, var9, var5, var10, var4.field1510[this.field1594 - 1]);
                        if (this.field1590 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1590) / var8;
                        if (var12 >= this.field1592) {
                            this.field1590 += this.field1592 * var8;
                            this.field1592 = 0;
                            break;
                        }
                        this.field1590 += var8 * var12;
                        this.field1592 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1954(arg0, var9, var6, var10, var4.field1510[this.field1593]);
                        if (this.field1590 < var6) {
                            return;
                        }
                        int var13 = (this.field1590 - var5) / var8;
                        if (var13 >= this.field1592) {
                            this.field1590 -= this.field1592 * var8;
                            this.field1592 = 0;
                            break;
                        }
                        this.field1590 -= var8 * var13;
                        this.field1592 -= var13;
                    }
                }
            }
            if (this.field1586 < 0) {
                this.method1955(arg0, var9, 0, var10, 0);
                if (this.field1590 < 0) {
                    this.field1590 = -1;
                    this.method1944();
                    this.method3427();
                }
            } else {
                this.method1954(arg0, var9, var7, var10, 0);
                if (this.field1590 >= var7) {
                    this.field1590 = var7;
                    this.method1944();
                    this.method3427();
                }
            }
        } else if (this.field1595) {
            if (this.field1586 < 0) {
                var9 = this.method1955(arg0, arg1, var5, var10, var4.field1510[this.field1593]);
                if (this.field1590 >= var5) {
                    return;
                }
                this.field1590 = var5 + var5 - 1 - this.field1590;
                this.field1586 = -this.field1586;
            }
            while (true) {
                int var11 = this.method1954(arg0, var9, var6, var10, var4.field1510[this.field1594 - 1]);
                if (this.field1590 < var6) {
                    return;
                }
                this.field1590 = var6 + var6 - 1 - this.field1590;
                this.field1586 = -this.field1586;
                var9 = this.method1955(arg0, var11, var5, var10, var4.field1510[this.field1593]);
                if (this.field1590 >= var5) {
                    return;
                }
                this.field1590 = var5 + var5 - 1 - this.field1590;
                this.field1586 = -this.field1586;
            }
        } else if (this.field1586 < 0) {
            while (true) {
                var9 = this.method1955(arg0, var9, var5, var10, var4.field1510[this.field1594 - 1]);
                if (this.field1590 >= var5) {
                    return;
                }
                this.field1590 = var6 - 1 - (var6 - 1 - this.field1590) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1954(arg0, var9, var6, var10, var4.field1510[this.field1593]);
                if (this.field1590 < var6) {
                    return;
                }
                this.field1590 = (this.field1590 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dg.c(I)V")
    public synchronized void method1735(int arg0) {
        if (this.field1599 > 0) {
            if (arg0 >= this.field1599) {
                if (this.field1587 == Integer.MIN_VALUE) {
                    this.field1587 = 0;
                    this.field1585 = 0;
                    this.field1589 = 0;
                    this.field1591 = 0;
                    this.method3427();
                    arg0 = this.field1599;
                }
                this.field1599 = 0;
                this.method1935();
            } else {
                this.field1591 += this.field1597 * arg0;
                this.field1589 += this.field1596 * arg0;
                this.field1585 += this.field1588 * arg0;
                this.field1599 -= arg0;
            }
        }
        class107 var2 = (class107) this.field1614;
        int var3 = this.field1593 << 8;
        int var4 = this.field1594 << 8;
        int var5 = var2.field1510.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1592 = 0;
        }
        if (this.field1590 < 0) {
            if (this.field1586 <= 0) {
                this.method1944();
                this.method3427();
                return;
            }
            this.field1590 = 0;
        }
        if (this.field1590 >= var5) {
            if (this.field1586 >= 0) {
                this.method1944();
                this.method3427();
                return;
            }
            this.field1590 = var5 - 1;
        }
        this.field1590 += this.field1586 * arg0;
        if (this.field1592 >= 0) {
            if (this.field1592 > 0) {
                if (this.field1595) {
                    label121: {
                        if (this.field1586 < 0) {
                            if (this.field1590 >= var3) {
                                return;
                            }
                            this.field1590 = var3 + var3 - 1 - this.field1590;
                            this.field1586 = -this.field1586;
                            if (--this.field1592 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1590 < var4) {
                                return;
                            }
                            this.field1590 = var4 + var4 - 1 - this.field1590;
                            this.field1586 = -this.field1586;
                            if (--this.field1592 == 0) {
                                break;
                            }
                            if (this.field1590 >= var3) {
                                return;
                            }
                            this.field1590 = var3 + var3 - 1 - this.field1590;
                            this.field1586 = -this.field1586;
                        } while (--this.field1592 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1586 < 0) {
                            if (this.field1590 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1590) / var6;
                            if (var7 >= this.field1592) {
                                this.field1590 += this.field1592 * var6;
                                this.field1592 = 0;
                                break label153;
                            }
                            this.field1590 += var6 * var7;
                            this.field1592 -= var7;
                        } else if (this.field1590 >= var4) {
                            int var8 = (this.field1590 - var3) / var6;
                            if (var8 >= this.field1592) {
                                this.field1590 -= this.field1592 * var6;
                                this.field1592 = 0;
                                break label153;
                            }
                            this.field1590 -= var6 * var8;
                            this.field1592 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1586 < 0) {
                if (this.field1590 < 0) {
                    this.field1590 = -1;
                    this.method1944();
                    this.method3427();
                }
            } else if (this.field1590 >= var5) {
                this.field1590 = var5;
                this.method1944();
                this.method3427();
            }
        } else if (this.field1595) {
            if (this.field1586 < 0) {
                if (this.field1590 >= var3) {
                    return;
                }
                this.field1590 = var3 + var3 - 1 - this.field1590;
                this.field1586 = -this.field1586;
            }
            while (this.field1590 >= var4) {
                this.field1590 = var4 + var4 - 1 - this.field1590;
                this.field1586 = -this.field1586;
                if (this.field1590 >= var3) {
                    return;
                }
                this.field1590 = var3 + var3 - 1 - this.field1590;
                this.field1586 = -this.field1586;
            }
        } else if (this.field1586 < 0) {
            if (this.field1590 >= var3) {
                return;
            }
            this.field1590 = var4 - 1 - (var4 - 1 - this.field1590) % var6;
        } else if (this.field1590 >= var4) {
            this.field1590 = (this.field1590 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dg.as([IIIII)I")
    public int method1954(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1599 > 0) {
                int var6 = this.field1599 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1599 += arg1;
                if (this.field1586 == 256 && (this.field1590 & 0xFF) == 0) {
                    if (Statics.field1301) {
                        arg1 = method1966(0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, this.field1596, this.field1588, 0, var6, arg2, this);
                    } else {
                        arg1 = method1965(((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, this.field1597, 0, var6, arg2, this);
                    }
                } else if (Statics.field1301) {
                    arg1 = method1969(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, this.field1596, this.field1588, 0, var6, arg2, this, this.field1586, arg4);
                } else {
                    arg1 = method1953(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, this.field1597, 0, var6, arg2, this, this.field1586, arg4);
                }
                this.field1599 -= arg1;
                if (this.field1599 != 0) {
                    return arg1;
                }
                if (!this.method1956()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1586 == 256 && (this.field1590 & 0xFF) == 0) {
                if (Statics.field1301) {
                    return method1958(0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, 0, arg3, arg2, this);
                }
                return method1957(((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, 0, arg3, arg2, this);
            }
            if (Statics.field1301) {
                return method1962(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, 0, arg3, arg2, this, this.field1586, arg4);
            }
            return method1961(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, 0, arg3, arg2, this, this.field1586, arg4);
        }
    }

    @ObfuscatedName("dg.ai([IIIII)I")
    public int method1955(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1599 > 0) {
                int var6 = this.field1599 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1599 += arg1;
                if (this.field1586 == -256 && (this.field1590 & 0xFF) == 0) {
                    if (Statics.field1301) {
                        arg1 = method1949(0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, this.field1596, this.field1588, 0, var6, arg2, this);
                    } else {
                        arg1 = method1967(((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, this.field1597, 0, var6, arg2, this);
                    }
                } else if (Statics.field1301) {
                    arg1 = method1971(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, this.field1596, this.field1588, 0, var6, arg2, this, this.field1586, arg4);
                } else {
                    arg1 = method2040(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, this.field1597, 0, var6, arg2, this, this.field1586, arg4);
                }
                this.field1599 -= arg1;
                if (this.field1599 != 0) {
                    return arg1;
                }
                if (!this.method1956()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1586 == -256 && (this.field1590 & 0xFF) == 0) {
                if (Statics.field1301) {
                    return method1960(0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, 0, arg3, arg2, this);
                }
                return method2015(((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, 0, arg3, arg2, this);
            }
            if (Statics.field1301) {
                return method2075(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1589, this.field1585, 0, arg3, arg2, this, this.field1586, arg4);
            }
            return method2074(0, 0, ((class107) this.field1614).field1510, arg0, this.field1590, arg1, this.field1591, 0, arg3, arg2, this, this.field1586, arg4);
        }
    }

    @ObfuscatedName("dg.af()Z")
    public boolean method1956() {
        int var1 = this.field1587;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2058(var1, this.field1598);
            var2 = method1999(var1, this.field1598);
        }
        if (this.field1591 != var1 || this.field1589 != var3 || this.field1585 != var2) {
            if (this.field1591 < var1) {
                this.field1597 = 1;
                this.field1599 = var1 - this.field1591;
            } else if (this.field1591 > var1) {
                this.field1597 = -1;
                this.field1599 = this.field1591 - var1;
            } else {
                this.field1597 = 0;
            }
            if (this.field1589 < var3) {
                this.field1596 = 1;
                if (this.field1599 == 0 || this.field1599 > var3 - this.field1589) {
                    this.field1599 = var3 - this.field1589;
                }
            } else if (this.field1589 > var3) {
                this.field1596 = -1;
                if (this.field1599 == 0 || this.field1599 > this.field1589 - var3) {
                    this.field1599 = this.field1589 - var3;
                }
            } else {
                this.field1596 = 0;
            }
            if (this.field1585 < var2) {
                this.field1588 = 1;
                if (this.field1599 == 0 || this.field1599 > var2 - this.field1585) {
                    this.field1599 = var2 - this.field1585;
                }
            } else if (this.field1585 > var2) {
                this.field1588 = -1;
                if (this.field1599 == 0 || this.field1599 > this.field1585 - var2) {
                    this.field1599 = this.field1585 - var2;
                }
            } else {
                this.field1588 = 0;
            }
            return false;
        } else if (this.field1587 == Integer.MIN_VALUE) {
            this.field1587 = 0;
            this.field1585 = 0;
            this.field1589 = 0;
            this.field1591 = 0;
            this.method3427();
            return true;
        } else {
            this.method1935();
            return false;
        }
    }

    @ObfuscatedName("dg.ah([B[IIIIIIILdg;)I")
    public static int method1957(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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
        arg8.field1590 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dg.av(I[B[IIIIIIIILdg;)I")
    public static int method1958(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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
        arg10.field1590 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dg.ae([B[IIIIIIILdg;)I")
    public static int method2015(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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
        arg8.field1590 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dg.am(I[B[IIIIIIIILdg;)I")
    public static int method1960(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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
        arg10.field1590 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dg.aj(II[B[IIIIIIILdg;II)I")
    public static int method1961(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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
        arg10.field1590 = arg4;
        return arg5;
    }

    @ObfuscatedName("dg.ao(II[B[IIIIIIIILdg;II)I")
    public static int method1962(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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
        arg11.field1590 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dg.ar(II[B[IIIIIIILdg;II)I")
    public static int method2074(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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
        arg10.field1590 = arg4;
        return arg5;
    }

    @ObfuscatedName("dg.au(II[B[IIIIIIIILdg;II)I")
    public static int method2075(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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
        arg11.field1590 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dg.bb([B[IIIIIIIILdg;)I")
    public static int method1965(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1589 += (var14 - arg3) * arg9.field1596;
        arg9.field1585 += (var14 - arg3) * arg9.field1588;
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
        arg9.field1591 = var12 >> 2;
        arg9.field1590 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dg.bc(I[B[IIIIIIIIIILdg;)I")
    public static int method1966(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1591 += (var19 - arg4) * arg12.field1597;
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
        arg12.field1589 = var15 >> 2;
        arg12.field1585 = var16 >> 2;
        arg12.field1590 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dg.bp([B[IIIIIIIILdg;)I")
    public static int method1967(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1589 += (var14 - arg3) * arg9.field1596;
        arg9.field1585 += (var14 - arg3) * arg9.field1588;
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
        arg9.field1591 = var12 >> 2;
        arg9.field1590 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dg.bn(I[B[IIIIIIIIIILdg;)I")
    public static int method1949(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1591 += (var19 - arg4) * arg12.field1597;
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
        arg12.field1589 = var15 >> 2;
        arg12.field1585 = var16 >> 2;
        arg12.field1590 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dg.bg(II[B[IIIIIIIILdg;II)I")
    public static int method1953(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1589 -= arg11.field1596 * arg5;
        arg11.field1585 -= arg11.field1588 * arg5;
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
        arg11.field1589 += arg11.field1596 * arg5;
        arg11.field1585 += arg11.field1588 * arg5;
        arg11.field1591 = arg6;
        arg11.field1590 = arg4;
        return arg5;
    }

    @ObfuscatedName("dg.bq(II[B[IIIIIIIIIILdg;II)I")
    public static int method1969(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1591 -= arg13.field1597 * arg5;
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
        arg13.field1591 += arg13.field1597 * var27;
        arg13.field1589 = arg6;
        arg13.field1585 = arg7;
        arg13.field1590 = arg4;
        return var27;
    }

    @ObfuscatedName("dg.be(II[B[IIIIIIIILdg;II)I")
    public static int method2040(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1589 -= arg11.field1596 * arg5;
        arg11.field1585 -= arg11.field1588 * arg5;
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
        arg11.field1589 += arg11.field1596 * arg5;
        arg11.field1585 += arg11.field1588 * arg5;
        arg11.field1591 = arg6;
        arg11.field1590 = arg4;
        return arg5;
    }

    @ObfuscatedName("dg.bx(II[B[IIIIIIIIIILdg;II)I")
    public static int method1971(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1591 -= arg13.field1597 * arg5;
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
        arg13.field1591 += arg13.field1597 * var26;
        arg13.field1589 = arg6;
        arg13.field1585 = arg7;
        arg13.field1590 = arg4;
        return var26;
    }
}
