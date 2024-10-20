package deob;

@ObfuscatedName("dv")
public class class117 extends class119 {

    @ObfuscatedName("dv.d")
    public int field1614;

    @ObfuscatedName("dv.x")
    public int field1607;

    @ObfuscatedName("dv.k")
    public int field1608;

    @ObfuscatedName("dv.z")
    public int field1609;

    @ObfuscatedName("dv.v")
    public int field1619;

    @ObfuscatedName("dv.m")
    public int field1616;

    @ObfuscatedName("dv.b")
    public int field1612;

    @ObfuscatedName("dv.t")
    public int field1613;

    @ObfuscatedName("dv.p")
    public int field1611;

    @ObfuscatedName("dv.r")
    public int field1615;

    @ObfuscatedName("dv.l")
    public boolean field1620;

    @ObfuscatedName("dv.u")
    public int field1617;

    @ObfuscatedName("dv.n")
    public int field1618;

    @ObfuscatedName("dv.c")
    public int field1610;

    @ObfuscatedName("dv.y")
    public int field1606;

    @ObfuscatedName("dv.d(II)I")
    public static int method2070(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dv.x(II)I")
    public static int method2082(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dv.av()I")
    public int method2052() {
        int var1 = this.field1619 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1613 == 0) {
            var2 -= this.field1614 * var2 / (((class107) this.field1635).field1528.length << 8);
        } else if (this.field1613 >= 0) {
            var2 -= this.field1611 * var2 / ((class107) this.field1635).field1528.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class117(class107 arg0, int arg1, int arg2) {
        this.field1635 = arg0;
        this.field1611 = arg0.field1530;
        this.field1615 = arg0.field1529;
        this.field1620 = arg0.field1531;
        this.field1607 = arg1;
        this.field1608 = arg2;
        this.field1609 = 8192;
        this.field1614 = 0;
        this.method2137();
    }

    public class117(class107 arg0, int arg1, int arg2, int arg3) {
        this.field1635 = arg0;
        this.field1611 = arg0.field1530;
        this.field1615 = arg0.field1529;
        this.field1620 = arg0.field1531;
        this.field1607 = arg1;
        this.field1608 = arg2;
        this.field1609 = arg3;
        this.field1614 = 0;
        this.method2137();
    }

    @ObfuscatedName("dv.k(Lda;II)Ldv;")
    public static class117 method2054(class107 arg0, int arg1, int arg2) {
        return arg0.field1528 == null || arg0.field1528.length == 0 ? null : new class117(arg0, (int) ((long) arg0.field1532 * 256L * (long) arg1 / (long) (Statics.field1546 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dv.z(Lda;III)Ldv;")
    public static class117 method2055(class107 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1528 == null || arg0.field1528.length == 0 ? null : new class117(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dv.v()V")
    public void method2137() {
        this.field1619 = this.field1608;
        this.field1616 = method2070(this.field1608, this.field1609);
        this.field1612 = method2082(this.field1608, this.field1609);
    }

    @ObfuscatedName("dv.r(I)V")
    public synchronized void method2057(int arg0) {
        this.field1613 = arg0;
    }

    @ObfuscatedName("dv.u(I)V")
    public synchronized void method2058(int arg0) {
        this.method2060(arg0 << 6, this.method2062());
    }

    @ObfuscatedName("dv.c(I)V")
    public synchronized void method2059(int arg0) {
        this.method2060(arg0, this.method2062());
    }

    @ObfuscatedName("dv.j(II)V")
    public synchronized void method2060(int arg0, int arg1) {
        this.field1608 = arg0;
        this.field1609 = arg1;
        this.field1617 = 0;
        this.method2137();
    }

    @ObfuscatedName("dv.f()I")
    public synchronized int method2061() {
        return this.field1608 == Integer.MIN_VALUE ? 0 : this.field1608;
    }

    @ObfuscatedName("dv.s()I")
    public synchronized int method2062() {
        return this.field1609 < 0 ? -1 : this.field1609;
    }

    @ObfuscatedName("dv.e(I)V")
    public synchronized void method2063(int arg0) {
        int var2 = ((class107) this.field1635).field1528.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1614 = arg0;
    }

    @ObfuscatedName("dv.q(Z)V")
    public synchronized void method2064(boolean arg0) {
        this.field1607 = (this.field1607 >>> 31) + (this.field1607 ^ this.field1607 >> 31);
        if (arg0) {
            this.field1607 = -this.field1607;
        }
    }

    @ObfuscatedName("dv.h()V")
    public void method2065() {
        if (this.field1617 == 0) {
            return;
        }
        if (this.field1608 == Integer.MIN_VALUE) {
            this.field1608 = 0;
        }
        this.field1617 = 0;
        this.method2137();
    }

    @ObfuscatedName("dv.i(II)V")
    public synchronized void method2066(int arg0, int arg1) {
        this.method2124(arg0, arg1, this.method2062());
    }

    @ObfuscatedName("dv.o(III)V")
    public synchronized void method2124(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2060(arg1, arg2);
            return;
        }
        int var4 = method2070(arg1, arg2);
        int var5 = method2082(arg1, arg2);
        if (this.field1616 == var4 && this.field1612 == var5) {
            this.field1617 = 0;
            return;
        }
        int var6 = arg1 - this.field1619;
        if (this.field1619 - arg1 > var6) {
            var6 = this.field1619 - arg1;
        }
        if (var4 - this.field1616 > var6) {
            var6 = var4 - this.field1616;
        }
        if (this.field1616 - var4 > var6) {
            var6 = this.field1616 - var4;
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
        this.field1617 = arg0;
        this.field1608 = arg1;
        this.field1609 = arg2;
        this.field1618 = (arg1 - this.field1619) / arg0;
        this.field1610 = (var4 - this.field1616) / arg0;
        this.field1606 = (var5 - this.field1612) / arg0;
    }

    @ObfuscatedName("dv.w(I)V")
    public synchronized void method2056(int arg0) {
        if (arg0 == 0) {
            this.method2059(0);
            this.method3475();
        } else if (this.field1616 == 0 && this.field1612 == 0) {
            this.field1617 = 0;
            this.field1608 = 0;
            this.field1619 = 0;
            this.method3475();
        } else {
            int var2 = -this.field1619;
            if (this.field1619 > var2) {
                var2 = this.field1619;
            }
            if (-this.field1616 > var2) {
                var2 = -this.field1616;
            }
            if (this.field1616 > var2) {
                var2 = this.field1616;
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
            this.field1617 = arg0;
            this.field1608 = Integer.MIN_VALUE;
            this.field1618 = -this.field1619 / arg0;
            this.field1610 = -this.field1616 / arg0;
            this.field1606 = -this.field1612 / arg0;
        }
    }

    @ObfuscatedName("dv.ah(I)V")
    public synchronized void method2069(int arg0) {
        if (this.field1607 < 0) {
            this.field1607 = -arg0;
        } else {
            this.field1607 = arg0;
        }
    }

    @ObfuscatedName("dv.an()I")
    public synchronized int method2096() {
        return this.field1607 < 0 ? -this.field1607 : this.field1607;
    }

    @ObfuscatedName("dv.ai()Z")
    public boolean method2071() {
        return this.field1614 < 0 || this.field1614 >= ((class107) this.field1635).field1528.length << 8;
    }

    @ObfuscatedName("dv.ar()Z")
    public boolean method2110() {
        return this.field1617 != 0;
    }

    @ObfuscatedName("dv.m()Ldn;")
    public class119 method1834() {
        return null;
    }

    @ObfuscatedName("dv.b()Ldn;")
    public class119 method1811() {
        return null;
    }

    @ObfuscatedName("dv.t()I")
    public int method1812() {
        return this.field1608 == 0 && this.field1617 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dv.p([III)V")
    public synchronized void method1813(int[] arg0, int arg1, int arg2) {
        if (this.field1608 == 0 && this.field1617 == 0) {
            this.method1815(arg2);
            return;
        }
        class107 var4 = (class107) this.field1635;
        int var5 = this.field1611 << 8;
        int var6 = this.field1615 << 8;
        int var7 = var4.field1528.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1613 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1614 < 0) {
            if (this.field1607 <= 0) {
                this.method2065();
                this.method3475();
                return;
            }
            this.field1614 = 0;
        }
        if (this.field1614 >= var7) {
            if (this.field1607 >= 0) {
                this.method2065();
                this.method3475();
                return;
            }
            this.field1614 = var7 - 1;
        }
        if (this.field1613 >= 0) {
            if (this.field1613 > 0) {
                if (this.field1620) {
                    label131: {
                        if (this.field1607 < 0) {
                            var9 = this.method2074(arg0, arg1, var5, var10, var4.field1528[this.field1611]);
                            if (this.field1614 >= var5) {
                                return;
                            }
                            this.field1614 = var5 + var5 - 1 - this.field1614;
                            this.field1607 = -this.field1607;
                            if (--this.field1613 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2073(arg0, var9, var6, var10, var4.field1528[this.field1615 - 1]);
                            if (this.field1614 < var6) {
                                return;
                            }
                            this.field1614 = var6 + var6 - 1 - this.field1614;
                            this.field1607 = -this.field1607;
                            if (--this.field1613 == 0) {
                                break;
                            }
                            var9 = this.method2074(arg0, var9, var5, var10, var4.field1528[this.field1611]);
                            if (this.field1614 >= var5) {
                                return;
                            }
                            this.field1614 = var5 + var5 - 1 - this.field1614;
                            this.field1607 = -this.field1607;
                        } while (--this.field1613 != 0);
                    }
                } else if (this.field1607 < 0) {
                    while (true) {
                        var9 = this.method2074(arg0, var9, var5, var10, var4.field1528[this.field1615 - 1]);
                        if (this.field1614 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1614) / var8;
                        if (var12 >= this.field1613) {
                            this.field1614 += this.field1613 * var8;
                            this.field1613 = 0;
                            break;
                        }
                        this.field1614 += var8 * var12;
                        this.field1613 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2073(arg0, var9, var6, var10, var4.field1528[this.field1611]);
                        if (this.field1614 < var6) {
                            return;
                        }
                        int var13 = (this.field1614 - var5) / var8;
                        if (var13 >= this.field1613) {
                            this.field1614 -= this.field1613 * var8;
                            this.field1613 = 0;
                            break;
                        }
                        this.field1614 -= var8 * var13;
                        this.field1613 -= var13;
                    }
                }
            }
            if (this.field1607 < 0) {
                this.method2074(arg0, var9, 0, var10, 0);
                if (this.field1614 < 0) {
                    this.field1614 = -1;
                    this.method2065();
                    this.method3475();
                }
            } else {
                this.method2073(arg0, var9, var7, var10, 0);
                if (this.field1614 >= var7) {
                    this.field1614 = var7;
                    this.method2065();
                    this.method3475();
                }
            }
        } else if (this.field1620) {
            if (this.field1607 < 0) {
                var9 = this.method2074(arg0, arg1, var5, var10, var4.field1528[this.field1611]);
                if (this.field1614 >= var5) {
                    return;
                }
                this.field1614 = var5 + var5 - 1 - this.field1614;
                this.field1607 = -this.field1607;
            }
            while (true) {
                int var11 = this.method2073(arg0, var9, var6, var10, var4.field1528[this.field1615 - 1]);
                if (this.field1614 < var6) {
                    return;
                }
                this.field1614 = var6 + var6 - 1 - this.field1614;
                this.field1607 = -this.field1607;
                var9 = this.method2074(arg0, var11, var5, var10, var4.field1528[this.field1611]);
                if (this.field1614 >= var5) {
                    return;
                }
                this.field1614 = var5 + var5 - 1 - this.field1614;
                this.field1607 = -this.field1607;
            }
        } else if (this.field1607 < 0) {
            while (true) {
                var9 = this.method2074(arg0, var9, var5, var10, var4.field1528[this.field1615 - 1]);
                if (this.field1614 >= var5) {
                    return;
                }
                this.field1614 = var6 - 1 - (var6 - 1 - this.field1614) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2073(arg0, var9, var6, var10, var4.field1528[this.field1611]);
                if (this.field1614 < var6) {
                    return;
                }
                this.field1614 = (this.field1614 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dv.l(I)V")
    public synchronized void method1815(int arg0) {
        if (this.field1617 > 0) {
            if (arg0 >= this.field1617) {
                if (this.field1608 == Integer.MIN_VALUE) {
                    this.field1608 = 0;
                    this.field1612 = 0;
                    this.field1616 = 0;
                    this.field1619 = 0;
                    this.method3475();
                    arg0 = this.field1617;
                }
                this.field1617 = 0;
                this.method2137();
            } else {
                this.field1619 += this.field1618 * arg0;
                this.field1616 += this.field1610 * arg0;
                this.field1612 += this.field1606 * arg0;
                this.field1617 -= arg0;
            }
        }
        class107 var2 = (class107) this.field1635;
        int var3 = this.field1611 << 8;
        int var4 = this.field1615 << 8;
        int var5 = var2.field1528.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1613 = 0;
        }
        if (this.field1614 < 0) {
            if (this.field1607 <= 0) {
                this.method2065();
                this.method3475();
                return;
            }
            this.field1614 = 0;
        }
        if (this.field1614 >= var5) {
            if (this.field1607 >= 0) {
                this.method2065();
                this.method3475();
                return;
            }
            this.field1614 = var5 - 1;
        }
        this.field1614 += this.field1607 * arg0;
        if (this.field1613 >= 0) {
            if (this.field1613 > 0) {
                if (this.field1620) {
                    label121: {
                        if (this.field1607 < 0) {
                            if (this.field1614 >= var3) {
                                return;
                            }
                            this.field1614 = var3 + var3 - 1 - this.field1614;
                            this.field1607 = -this.field1607;
                            if (--this.field1613 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1614 < var4) {
                                return;
                            }
                            this.field1614 = var4 + var4 - 1 - this.field1614;
                            this.field1607 = -this.field1607;
                            if (--this.field1613 == 0) {
                                break;
                            }
                            if (this.field1614 >= var3) {
                                return;
                            }
                            this.field1614 = var3 + var3 - 1 - this.field1614;
                            this.field1607 = -this.field1607;
                        } while (--this.field1613 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1607 < 0) {
                            if (this.field1614 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1614) / var6;
                            if (var7 >= this.field1613) {
                                this.field1614 += this.field1613 * var6;
                                this.field1613 = 0;
                                break label153;
                            }
                            this.field1614 += var6 * var7;
                            this.field1613 -= var7;
                        } else if (this.field1614 >= var4) {
                            int var8 = (this.field1614 - var3) / var6;
                            if (var8 >= this.field1613) {
                                this.field1614 -= this.field1613 * var6;
                                this.field1613 = 0;
                                break label153;
                            }
                            this.field1614 -= var6 * var8;
                            this.field1613 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1607 < 0) {
                if (this.field1614 < 0) {
                    this.field1614 = -1;
                    this.method2065();
                    this.method3475();
                }
            } else if (this.field1614 >= var5) {
                this.field1614 = var5;
                this.method2065();
                this.method3475();
            }
        } else if (this.field1620) {
            if (this.field1607 < 0) {
                if (this.field1614 >= var3) {
                    return;
                }
                this.field1614 = var3 + var3 - 1 - this.field1614;
                this.field1607 = -this.field1607;
            }
            while (this.field1614 >= var4) {
                this.field1614 = var4 + var4 - 1 - this.field1614;
                this.field1607 = -this.field1607;
                if (this.field1614 >= var3) {
                    return;
                }
                this.field1614 = var3 + var3 - 1 - this.field1614;
                this.field1607 = -this.field1607;
            }
        } else if (this.field1607 < 0) {
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

    @ObfuscatedName("dv.ac([IIIII)I")
    public int method2073(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1617 > 0) {
                int var6 = this.field1617 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1617 += arg1;
                if (this.field1607 == 256 && (this.field1614 & 0xFF) == 0) {
                    if (Statics.field1548) {
                        arg1 = method2154(0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, this.field1610, this.field1606, 0, var6, arg2, this);
                    } else {
                        arg1 = method2084(((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, this.field1618, 0, var6, arg2, this);
                    }
                } else if (Statics.field1548) {
                    arg1 = method2092(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, this.field1610, this.field1606, 0, var6, arg2, this, this.field1607, arg4);
                } else {
                    arg1 = method2088(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, this.field1618, 0, var6, arg2, this, this.field1607, arg4);
                }
                this.field1617 -= arg1;
                if (this.field1617 != 0) {
                    return arg1;
                }
                if (!this.method2132()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1607 == 256 && (this.field1614 & 0xFF) == 0) {
                if (Statics.field1548) {
                    return method2077(0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, 0, arg3, arg2, this);
                }
                return method2076(((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, 0, arg3, arg2, this);
            }
            if (Statics.field1548) {
                return method2085(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, 0, arg3, arg2, this, this.field1607, arg4);
            }
            return method2080(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, 0, arg3, arg2, this, this.field1607, arg4);
        }
    }

    @ObfuscatedName("dv.af([IIIII)I")
    public int method2074(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1617 > 0) {
                int var6 = this.field1617 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1617 += arg1;
                if (this.field1607 == -256 && (this.field1614 & 0xFF) == 0) {
                    if (Statics.field1548) {
                        arg1 = method2087(0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, this.field1610, this.field1606, 0, var6, arg2, this);
                    } else {
                        arg1 = method2127(((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, this.field1618, 0, var6, arg2, this);
                    }
                } else if (Statics.field1548) {
                    arg1 = method2075(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, this.field1610, this.field1606, 0, var6, arg2, this, this.field1607, arg4);
                } else {
                    arg1 = method2090(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, this.field1618, 0, var6, arg2, this, this.field1607, arg4);
                }
                this.field1617 -= arg1;
                if (this.field1617 != 0) {
                    return arg1;
                }
                if (!this.method2132()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1607 == -256 && (this.field1614 & 0xFF) == 0) {
                if (Statics.field1548) {
                    return method2051(0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, 0, arg3, arg2, this);
                }
                return method2078(((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, 0, arg3, arg2, this);
            }
            if (Statics.field1548) {
                return method2122(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1616, this.field1612, 0, arg3, arg2, this, this.field1607, arg4);
            }
            return method2143(0, 0, ((class107) this.field1635).field1528, arg0, this.field1614, arg1, this.field1619, 0, arg3, arg2, this, this.field1607, arg4);
        }
    }

    @ObfuscatedName("dv.ao()Z")
    public boolean method2132() {
        int var1 = this.field1608;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2070(var1, this.field1609);
            var2 = method2082(var1, this.field1609);
        }
        if (this.field1619 != var1 || this.field1616 != var3 || this.field1612 != var2) {
            if (this.field1619 < var1) {
                this.field1618 = 1;
                this.field1617 = var1 - this.field1619;
            } else if (this.field1619 > var1) {
                this.field1618 = -1;
                this.field1617 = this.field1619 - var1;
            } else {
                this.field1618 = 0;
            }
            if (this.field1616 < var3) {
                this.field1610 = 1;
                if (this.field1617 == 0 || this.field1617 > var3 - this.field1616) {
                    this.field1617 = var3 - this.field1616;
                }
            } else if (this.field1616 > var3) {
                this.field1610 = -1;
                if (this.field1617 == 0 || this.field1617 > this.field1616 - var3) {
                    this.field1617 = this.field1616 - var3;
                }
            } else {
                this.field1610 = 0;
            }
            if (this.field1612 < var2) {
                this.field1606 = 1;
                if (this.field1617 == 0 || this.field1617 > var2 - this.field1612) {
                    this.field1617 = var2 - this.field1612;
                }
            } else if (this.field1612 > var2) {
                this.field1606 = -1;
                if (this.field1617 == 0 || this.field1617 > this.field1612 - var2) {
                    this.field1617 = this.field1612 - var2;
                }
            } else {
                this.field1606 = 0;
            }
            return false;
        } else if (this.field1608 == Integer.MIN_VALUE) {
            this.field1608 = 0;
            this.field1612 = 0;
            this.field1616 = 0;
            this.field1619 = 0;
            this.method3475();
            return true;
        } else {
            this.method2137();
            return false;
        }
    }

    @ObfuscatedName("dv.ab([B[IIIIIIILdv;)I")
    public static int method2076(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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

    @ObfuscatedName("dv.az(I[B[IIIIIIIILdv;)I")
    public static int method2077(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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

    @ObfuscatedName("dv.at([B[IIIIIIILdv;)I")
    public static int method2078(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class117 arg8) {
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

    @ObfuscatedName("dv.bj(I[B[IIIIIIIILdv;)I")
    public static int method2051(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10) {
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

    @ObfuscatedName("dv.bq(II[B[IIIIIIILdv;II)I")
    public static int method2080(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("dv.bo(II[B[IIIIIIIILdv;II)I")
    public static int method2085(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("dv.bk(II[B[IIIIIIILdv;II)I")
    public static int method2143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class117 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("dv.bv(II[B[IIIIIIIILdv;II)I")
    public static int method2122(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("dv.ba([B[IIIIIIIILdv;)I")
    public static int method2084(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1616 += (var14 - arg3) * arg9.field1610;
        arg9.field1612 += (var14 - arg3) * arg9.field1606;
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
        arg9.field1619 = var12 >> 2;
        arg9.field1614 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dv.bs(I[B[IIIIIIIIIILdv;)I")
    public static int method2154(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1619 += (var19 - arg4) * arg12.field1618;
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
        arg12.field1616 = var15 >> 2;
        arg12.field1612 = var16 >> 2;
        arg12.field1614 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dv.bg([B[IIIIIIIILdv;)I")
    public static int method2127(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class117 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1616 += (var14 - arg3) * arg9.field1610;
        arg9.field1612 += (var14 - arg3) * arg9.field1606;
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
        arg9.field1619 = var12 >> 2;
        arg9.field1614 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dv.bn(I[B[IIIIIIIIIILdv;)I")
    public static int method2087(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class117 arg12) {
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
        arg12.field1619 += (var19 - arg4) * arg12.field1618;
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
        arg12.field1616 = var15 >> 2;
        arg12.field1612 = var16 >> 2;
        arg12.field1614 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dv.bz(II[B[IIIIIIIILdv;II)I")
    public static int method2088(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1616 -= arg11.field1610 * arg5;
        arg11.field1612 -= arg11.field1606 * arg5;
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
        arg11.field1616 += arg11.field1610 * arg5;
        arg11.field1612 += arg11.field1606 * arg5;
        arg11.field1619 = arg6;
        arg11.field1614 = arg4;
        return arg5;
    }

    @ObfuscatedName("dv.bl(II[B[IIIIIIIIIILdv;II)I")
    public static int method2092(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1619 -= arg13.field1618 * arg5;
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
        arg13.field1619 += arg13.field1618 * var27;
        arg13.field1616 = arg6;
        arg13.field1612 = arg7;
        arg13.field1614 = arg4;
        return var27;
    }

    @ObfuscatedName("dv.bm(II[B[IIIIIIIILdv;II)I")
    public static int method2090(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class117 arg11, int arg12, int arg13) {
        arg11.field1616 -= arg11.field1610 * arg5;
        arg11.field1612 -= arg11.field1606 * arg5;
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
        arg11.field1616 += arg11.field1610 * arg5;
        arg11.field1612 += arg11.field1606 * arg5;
        arg11.field1619 = arg6;
        arg11.field1614 = arg4;
        return arg5;
    }

    @ObfuscatedName("dv.bb(II[B[IIIIIIIIIILdv;II)I")
    public static int method2075(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class117 arg13, int arg14, int arg15) {
        arg13.field1619 -= arg13.field1618 * arg5;
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
        arg13.field1619 += arg13.field1618 * var26;
        arg13.field1616 = arg6;
        arg13.field1612 = arg7;
        arg13.field1614 = arg4;
        return var26;
    }
}
