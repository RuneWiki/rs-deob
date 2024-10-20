package deob;

@ObfuscatedName("dx")
public class class116 extends class118 {

    @ObfuscatedName("dx.c")
    public int field1615;

    @ObfuscatedName("dx.i")
    public int field1613;

    @ObfuscatedName("dx.o")
    public int field1614;

    @ObfuscatedName("dx.j")
    public int field1622;

    @ObfuscatedName("dx.k")
    public int field1612;

    @ObfuscatedName("dx.x")
    public int field1617;

    @ObfuscatedName("dx.z")
    public int field1618;

    @ObfuscatedName("dx.p")
    public int field1619;

    @ObfuscatedName("dx.r")
    public int field1620;

    @ObfuscatedName("dx.d")
    public int field1616;

    @ObfuscatedName("dx.a")
    public boolean field1621;

    @ObfuscatedName("dx.e")
    public int field1623;

    @ObfuscatedName("dx.f")
    public int field1624;

    @ObfuscatedName("dx.l")
    public int field1625;

    @ObfuscatedName("dx.m")
    public int field1626;

    @ObfuscatedName("dx.c(II)I")
    public static int method2140(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dx.i(II)I")
    public static int method2206(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dx.ay()I")
    public int method2122() {
        int var1 = this.field1612 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1619 == 0) {
            var2 -= this.field1615 * var2 / (((class106) this.field1642).field1536.length << 8);
        } else if (this.field1619 >= 0) {
            var2 -= this.field1620 * var2 / ((class106) this.field1642).field1536.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class116(class106 arg0, int arg1, int arg2) {
        this.field1642 = arg0;
        this.field1620 = arg0.field1538;
        this.field1616 = arg0.field1539;
        this.field1621 = arg0.field1540;
        this.field1613 = arg1;
        this.field1614 = arg2;
        this.field1622 = 8192;
        this.field1615 = 0;
        this.method2126();
    }

    public class116(class106 arg0, int arg1, int arg2, int arg3) {
        this.field1642 = arg0;
        this.field1620 = arg0.field1538;
        this.field1616 = arg0.field1539;
        this.field1621 = arg0.field1540;
        this.field1613 = arg1;
        this.field1614 = arg2;
        this.field1622 = arg3;
        this.field1615 = 0;
        this.method2126();
    }

    @ObfuscatedName("dx.o(Lda;II)Ldx;")
    public static class116 method2124(class106 arg0, int arg1, int arg2) {
        return arg0.field1536 == null || arg0.field1536.length == 0 ? null : new class116(arg0, (int) ((long) arg0.field1537 * 256L * (long) arg1 / (long) (Statics.field3928 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dx.j(Lda;III)Ldx;")
    public static class116 method2254(class106 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1536 == null || arg0.field1536.length == 0 ? null : new class116(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dx.k()V")
    public void method2126() {
        this.field1612 = this.field1614;
        this.field1617 = method2140(this.field1614, this.field1622);
        this.field1618 = method2206(this.field1614, this.field1622);
    }

    @ObfuscatedName("dx.r(I)V")
    public synchronized void method2127(int arg0) {
        this.field1619 = arg0;
    }

    @ObfuscatedName("dx.a(I)V")
    public synchronized void method2128(int arg0) {
        this.method2130(arg0 << 6, this.method2245());
    }

    @ObfuscatedName("dx.b(I)V")
    public synchronized void method2165(int arg0) {
        this.method2130(arg0, this.method2245());
    }

    @ObfuscatedName("dx.h(II)V")
    public synchronized void method2130(int arg0, int arg1) {
        this.field1614 = arg0;
        this.field1622 = arg1;
        this.field1623 = 0;
        this.method2126();
    }

    @ObfuscatedName("dx.n()I")
    public synchronized int method2131() {
        return this.field1614 == Integer.MIN_VALUE ? 0 : this.field1614;
    }

    @ObfuscatedName("dx.u()I")
    public synchronized int method2245() {
        return this.field1622 < 0 ? -1 : this.field1622;
    }

    @ObfuscatedName("dx.q(I)V")
    public synchronized void method2145(int arg0) {
        int var2 = ((class106) this.field1642).field1536.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1615 = arg0;
    }

    @ObfuscatedName("dx.g(Z)V")
    public synchronized void method2134(boolean arg0) {
        this.field1613 = (this.field1613 >>> 31) + (this.field1613 ^ this.field1613 >> 31);
        if (arg0) {
            this.field1613 = -this.field1613;
        }
    }

    @ObfuscatedName("dx.y()V")
    public void method2135() {
        if (this.field1623 == 0) {
            return;
        }
        if (this.field1614 == Integer.MIN_VALUE) {
            this.field1614 = 0;
        }
        this.field1623 = 0;
        this.method2126();
    }

    @ObfuscatedName("dx.s(II)V")
    public synchronized void method2136(int arg0, int arg1) {
        this.method2137(arg0, arg1, this.method2245());
    }

    @ObfuscatedName("dx.ac(III)V")
    public synchronized void method2137(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2130(arg1, arg2);
            return;
        }
        int var4 = method2140(arg1, arg2);
        int var5 = method2206(arg1, arg2);
        if (this.field1617 == var4 && this.field1618 == var5) {
            this.field1623 = 0;
            return;
        }
        int var6 = arg1 - this.field1612;
        if (this.field1612 - arg1 > var6) {
            var6 = this.field1612 - arg1;
        }
        if (var4 - this.field1617 > var6) {
            var6 = var4 - this.field1617;
        }
        if (this.field1617 - var4 > var6) {
            var6 = this.field1617 - var4;
        }
        if (var5 - this.field1618 > var6) {
            var6 = var5 - this.field1618;
        }
        if (this.field1618 - var5 > var6) {
            var6 = this.field1618 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1623 = arg0;
        this.field1614 = arg1;
        this.field1622 = arg2;
        this.field1624 = (arg1 - this.field1612) / arg0;
        this.field1625 = (var4 - this.field1617) / arg0;
        this.field1626 = (var5 - this.field1618) / arg0;
    }

    @ObfuscatedName("dx.ah(I)V")
    public synchronized void method2138(int arg0) {
        if (arg0 == 0) {
            this.method2165(0);
            this.method3710();
        } else if (this.field1617 == 0 && this.field1618 == 0) {
            this.field1623 = 0;
            this.field1614 = 0;
            this.field1612 = 0;
            this.method3710();
        } else {
            int var2 = -this.field1612;
            if (this.field1612 > var2) {
                var2 = this.field1612;
            }
            if (-this.field1617 > var2) {
                var2 = -this.field1617;
            }
            if (this.field1617 > var2) {
                var2 = this.field1617;
            }
            if (-this.field1618 > var2) {
                var2 = -this.field1618;
            }
            if (this.field1618 > var2) {
                var2 = this.field1618;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1623 = arg0;
            this.field1614 = Integer.MIN_VALUE;
            this.field1624 = -this.field1612 / arg0;
            this.field1625 = -this.field1617 / arg0;
            this.field1626 = -this.field1618 / arg0;
        }
    }

    @ObfuscatedName("dx.af(I)V")
    public synchronized void method2139(int arg0) {
        if (this.field1613 < 0) {
            this.field1613 = -arg0;
        } else {
            this.field1613 = arg0;
        }
    }

    @ObfuscatedName("dx.aw()I")
    public synchronized int method2120() {
        return this.field1613 < 0 ? -this.field1613 : this.field1613;
    }

    @ObfuscatedName("dx.ax()Z")
    public boolean method2141() {
        return this.field1615 < 0 || this.field1615 >= ((class106) this.field1642).field1536.length << 8;
    }

    @ObfuscatedName("dx.ag()Z")
    public boolean method2142() {
        return this.field1623 != 0;
    }

    @ObfuscatedName("dx.x()Ldd;")
    public class118 method1915() {
        return null;
    }

    @ObfuscatedName("dx.z()Ldd;")
    public class118 method1913() {
        return null;
    }

    @ObfuscatedName("dx.p()I")
    public int method1914() {
        return this.field1614 == 0 && this.field1623 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dx.w([III)V")
    public synchronized void method1920(int[] arg0, int arg1, int arg2) {
        if (this.field1614 == 0 && this.field1623 == 0) {
            this.method1940(arg2);
            return;
        }
        class106 var4 = (class106) this.field1642;
        int var5 = this.field1620 << 8;
        int var6 = this.field1616 << 8;
        int var7 = var4.field1536.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1619 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1615 < 0) {
            if (this.field1613 <= 0) {
                this.method2135();
                this.method3710();
                return;
            }
            this.field1615 = 0;
        }
        if (this.field1615 >= var7) {
            if (this.field1613 >= 0) {
                this.method2135();
                this.method3710();
                return;
            }
            this.field1615 = var7 - 1;
        }
        if (this.field1619 >= 0) {
            if (this.field1619 > 0) {
                if (this.field1621) {
                    label131: {
                        if (this.field1613 < 0) {
                            var9 = this.method2212(arg0, arg1, var5, var10, var4.field1536[this.field1620]);
                            if (this.field1615 >= var5) {
                                return;
                            }
                            this.field1615 = var5 + var5 - 1 - this.field1615;
                            this.field1613 = -this.field1613;
                            if (--this.field1619 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2146(arg0, var9, var6, var10, var4.field1536[this.field1616 - 1]);
                            if (this.field1615 < var6) {
                                return;
                            }
                            this.field1615 = var6 + var6 - 1 - this.field1615;
                            this.field1613 = -this.field1613;
                            if (--this.field1619 == 0) {
                                break;
                            }
                            var9 = this.method2212(arg0, var9, var5, var10, var4.field1536[this.field1620]);
                            if (this.field1615 >= var5) {
                                return;
                            }
                            this.field1615 = var5 + var5 - 1 - this.field1615;
                            this.field1613 = -this.field1613;
                        } while (--this.field1619 != 0);
                    }
                } else if (this.field1613 < 0) {
                    while (true) {
                        var9 = this.method2212(arg0, var9, var5, var10, var4.field1536[this.field1616 - 1]);
                        if (this.field1615 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1615) / var8;
                        if (var12 >= this.field1619) {
                            this.field1615 += this.field1619 * var8;
                            this.field1619 = 0;
                            break;
                        }
                        this.field1615 += var8 * var12;
                        this.field1619 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2146(arg0, var9, var6, var10, var4.field1536[this.field1620]);
                        if (this.field1615 < var6) {
                            return;
                        }
                        int var13 = (this.field1615 - var5) / var8;
                        if (var13 >= this.field1619) {
                            this.field1615 -= this.field1619 * var8;
                            this.field1619 = 0;
                            break;
                        }
                        this.field1615 -= var8 * var13;
                        this.field1619 -= var13;
                    }
                }
            }
            if (this.field1613 < 0) {
                this.method2212(arg0, var9, 0, var10, 0);
                if (this.field1615 < 0) {
                    this.field1615 = -1;
                    this.method2135();
                    this.method3710();
                }
            } else {
                this.method2146(arg0, var9, var7, var10, 0);
                if (this.field1615 >= var7) {
                    this.field1615 = var7;
                    this.method2135();
                    this.method3710();
                }
            }
        } else if (this.field1621) {
            if (this.field1613 < 0) {
                var9 = this.method2212(arg0, arg1, var5, var10, var4.field1536[this.field1620]);
                if (this.field1615 >= var5) {
                    return;
                }
                this.field1615 = var5 + var5 - 1 - this.field1615;
                this.field1613 = -this.field1613;
            }
            while (true) {
                int var11 = this.method2146(arg0, var9, var6, var10, var4.field1536[this.field1616 - 1]);
                if (this.field1615 < var6) {
                    return;
                }
                this.field1615 = var6 + var6 - 1 - this.field1615;
                this.field1613 = -this.field1613;
                var9 = this.method2212(arg0, var11, var5, var10, var4.field1536[this.field1620]);
                if (this.field1615 >= var5) {
                    return;
                }
                this.field1615 = var5 + var5 - 1 - this.field1615;
                this.field1613 = -this.field1613;
            }
        } else if (this.field1613 < 0) {
            while (true) {
                var9 = this.method2212(arg0, var9, var5, var10, var4.field1536[this.field1616 - 1]);
                if (this.field1615 >= var5) {
                    return;
                }
                this.field1615 = var6 - 1 - (var6 - 1 - this.field1615) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2146(arg0, var9, var6, var10, var4.field1536[this.field1620]);
                if (this.field1615 < var6) {
                    return;
                }
                this.field1615 = (this.field1615 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dx.d(I)V")
    public synchronized void method1940(int arg0) {
        if (this.field1623 > 0) {
            if (arg0 >= this.field1623) {
                if (this.field1614 == Integer.MIN_VALUE) {
                    this.field1614 = 0;
                    this.field1618 = 0;
                    this.field1617 = 0;
                    this.field1612 = 0;
                    this.method3710();
                    arg0 = this.field1623;
                }
                this.field1623 = 0;
                this.method2126();
            } else {
                this.field1612 += this.field1624 * arg0;
                this.field1617 += this.field1625 * arg0;
                this.field1618 += this.field1626 * arg0;
                this.field1623 -= arg0;
            }
        }
        class106 var2 = (class106) this.field1642;
        int var3 = this.field1620 << 8;
        int var4 = this.field1616 << 8;
        int var5 = var2.field1536.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1619 = 0;
        }
        if (this.field1615 < 0) {
            if (this.field1613 <= 0) {
                this.method2135();
                this.method3710();
                return;
            }
            this.field1615 = 0;
        }
        if (this.field1615 >= var5) {
            if (this.field1613 >= 0) {
                this.method2135();
                this.method3710();
                return;
            }
            this.field1615 = var5 - 1;
        }
        this.field1615 += this.field1613 * arg0;
        if (this.field1619 >= 0) {
            if (this.field1619 > 0) {
                if (this.field1621) {
                    label121: {
                        if (this.field1613 < 0) {
                            if (this.field1615 >= var3) {
                                return;
                            }
                            this.field1615 = var3 + var3 - 1 - this.field1615;
                            this.field1613 = -this.field1613;
                            if (--this.field1619 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1615 < var4) {
                                return;
                            }
                            this.field1615 = var4 + var4 - 1 - this.field1615;
                            this.field1613 = -this.field1613;
                            if (--this.field1619 == 0) {
                                break;
                            }
                            if (this.field1615 >= var3) {
                                return;
                            }
                            this.field1615 = var3 + var3 - 1 - this.field1615;
                            this.field1613 = -this.field1613;
                        } while (--this.field1619 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1613 < 0) {
                            if (this.field1615 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1615) / var6;
                            if (var7 >= this.field1619) {
                                this.field1615 += this.field1619 * var6;
                                this.field1619 = 0;
                                break label153;
                            }
                            this.field1615 += var6 * var7;
                            this.field1619 -= var7;
                        } else if (this.field1615 >= var4) {
                            int var8 = (this.field1615 - var3) / var6;
                            if (var8 >= this.field1619) {
                                this.field1615 -= this.field1619 * var6;
                                this.field1619 = 0;
                                break label153;
                            }
                            this.field1615 -= var6 * var8;
                            this.field1619 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1613 < 0) {
                if (this.field1615 < 0) {
                    this.field1615 = -1;
                    this.method2135();
                    this.method3710();
                }
            } else if (this.field1615 >= var5) {
                this.field1615 = var5;
                this.method2135();
                this.method3710();
            }
        } else if (this.field1621) {
            if (this.field1613 < 0) {
                if (this.field1615 >= var3) {
                    return;
                }
                this.field1615 = var3 + var3 - 1 - this.field1615;
                this.field1613 = -this.field1613;
            }
            while (this.field1615 >= var4) {
                this.field1615 = var4 + var4 - 1 - this.field1615;
                this.field1613 = -this.field1613;
                if (this.field1615 >= var3) {
                    return;
                }
                this.field1615 = var3 + var3 - 1 - this.field1615;
                this.field1613 = -this.field1613;
            }
        } else if (this.field1613 < 0) {
            if (this.field1615 >= var3) {
                return;
            }
            this.field1615 = var4 - 1 - (var4 - 1 - this.field1615) % var6;
        } else if (this.field1615 >= var4) {
            this.field1615 = (this.field1615 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dx.ad([IIIII)I")
    public int method2146(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1623 > 0) {
                int var6 = this.field1623 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1623 += arg1;
                if (this.field1613 == 256 && (this.field1615 & 0xFF) == 0) {
                    if (Statics.field298) {
                        arg1 = method2158(0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, this.field1625, this.field1626, 0, var6, arg2, this);
                    } else {
                        arg1 = method2204(((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, this.field1624, 0, var6, arg2, this);
                    }
                } else if (Statics.field298) {
                    arg1 = method2178(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, this.field1625, this.field1626, 0, var6, arg2, this, this.field1613, arg4);
                } else {
                    arg1 = method2161(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, this.field1624, 0, var6, arg2, this, this.field1613, arg4);
                }
                this.field1623 -= arg1;
                if (this.field1623 != 0) {
                    return arg1;
                }
                if (!this.method2125()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1613 == 256 && (this.field1615 & 0xFF) == 0) {
                if (Statics.field298) {
                    return method2150(0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, 0, arg3, arg2, this);
                }
                return method2148(((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, 0, arg3, arg2, this);
            }
            if (Statics.field298) {
                return method2251(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, 0, arg3, arg2, this, this.field1613, arg4);
            }
            return method2123(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, 0, arg3, arg2, this, this.field1613, arg4);
        }
    }

    @ObfuscatedName("dx.at([IIIII)I")
    public int method2212(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1623 > 0) {
                int var6 = this.field1623 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1623 += arg1;
                if (this.field1613 == -256 && (this.field1615 & 0xFF) == 0) {
                    if (Statics.field298) {
                        arg1 = method2160(0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, this.field1625, this.field1626, 0, var6, arg2, this);
                    } else {
                        arg1 = method2159(((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, this.field1624, 0, var6, arg2, this);
                    }
                } else if (Statics.field298) {
                    arg1 = method2163(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, this.field1625, this.field1626, 0, var6, arg2, this, this.field1613, arg4);
                } else {
                    arg1 = method2247(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, this.field1624, 0, var6, arg2, this, this.field1613, arg4);
                }
                this.field1623 -= arg1;
                if (this.field1623 != 0) {
                    return arg1;
                }
                if (!this.method2125()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1613 == -256 && (this.field1615 & 0xFF) == 0) {
                if (Statics.field298) {
                    return method2152(0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, 0, arg3, arg2, this);
                }
                return method2162(((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, 0, arg3, arg2, this);
            }
            if (Statics.field298) {
                return method2156(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1617, this.field1618, 0, arg3, arg2, this, this.field1613, arg4);
            }
            return method2172(0, 0, ((class106) this.field1642).field1536, arg0, this.field1615, arg1, this.field1612, 0, arg3, arg2, this, this.field1613, arg4);
        }
    }

    @ObfuscatedName("dx.av()Z")
    public boolean method2125() {
        int var1 = this.field1614;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2140(var1, this.field1622);
            var2 = method2206(var1, this.field1622);
        }
        if (this.field1612 != var1 || this.field1617 != var3 || this.field1618 != var2) {
            if (this.field1612 < var1) {
                this.field1624 = 1;
                this.field1623 = var1 - this.field1612;
            } else if (this.field1612 > var1) {
                this.field1624 = -1;
                this.field1623 = this.field1612 - var1;
            } else {
                this.field1624 = 0;
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
            if (this.field1618 < var2) {
                this.field1626 = 1;
                if (this.field1623 == 0 || this.field1623 > var2 - this.field1618) {
                    this.field1623 = var2 - this.field1618;
                }
            } else if (this.field1618 > var2) {
                this.field1626 = -1;
                if (this.field1623 == 0 || this.field1623 > this.field1618 - var2) {
                    this.field1623 = this.field1618 - var2;
                }
            } else {
                this.field1626 = 0;
            }
            return false;
        } else if (this.field1614 == Integer.MIN_VALUE) {
            this.field1614 = 0;
            this.field1618 = 0;
            this.field1617 = 0;
            this.field1612 = 0;
            this.method3710();
            return true;
        } else {
            this.method2126();
            return false;
        }
    }

    @ObfuscatedName("dx.az([B[IIIIIIILdx;)I")
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
        arg8.field1615 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.aj(I[B[IIIIIIIILdx;)I")
    public static int method2150(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1615 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dx.ar([B[IIIIIIILdx;)I")
    public static int method2162(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1615 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.au(I[B[IIIIIIIILdx;)I")
    public static int method2152(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1615 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dx.an(II[B[IIIIIIILdx;II)I")
    public static int method2123(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1615 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bv(II[B[IIIIIIIILdx;II)I")
    public static int method2251(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1615 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dx.bw(II[B[IIIIIIILdx;II)I")
    public static int method2172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1615 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bj(II[B[IIIIIIIILdx;II)I")
    public static int method2156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1615 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dx.ba([B[IIIIIIIILdx;)I")
    public static int method2204(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1617 += (var14 - arg3) * arg9.field1625;
        arg9.field1618 += (var14 - arg3) * arg9.field1626;
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
        arg9.field1612 = var12 >> 2;
        arg9.field1615 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bl(I[B[IIIIIIIIIILdx;)I")
    public static int method2158(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1612 += (var19 - arg4) * arg12.field1624;
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
        arg12.field1618 = var16 >> 2;
        arg12.field1615 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dx.br([B[IIIIIIIILdx;)I")
    public static int method2159(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1617 += (var14 - arg3) * arg9.field1625;
        arg9.field1618 += (var14 - arg3) * arg9.field1626;
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
        arg9.field1612 = var12 >> 2;
        arg9.field1615 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bh(I[B[IIIIIIIIIILdx;)I")
    public static int method2160(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1612 += (var19 - arg4) * arg12.field1624;
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
        arg12.field1618 = var16 >> 2;
        arg12.field1615 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dx.bf(II[B[IIIIIIIILdx;II)I")
    public static int method2161(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1617 -= arg11.field1625 * arg5;
        arg11.field1618 -= arg11.field1626 * arg5;
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
        arg11.field1618 += arg11.field1626 * arg5;
        arg11.field1612 = arg6;
        arg11.field1615 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bu(II[B[IIIIIIIIIILdx;II)I")
    public static int method2178(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1612 -= arg13.field1624 * arg5;
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
        arg13.field1612 += arg13.field1624 * var27;
        arg13.field1617 = arg6;
        arg13.field1618 = arg7;
        arg13.field1615 = arg4;
        return var27;
    }

    @ObfuscatedName("dx.bp(II[B[IIIIIIIILdx;II)I")
    public static int method2247(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1617 -= arg11.field1625 * arg5;
        arg11.field1618 -= arg11.field1626 * arg5;
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
        arg11.field1618 += arg11.field1626 * arg5;
        arg11.field1612 = arg6;
        arg11.field1615 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bc(II[B[IIIIIIIIIILdx;II)I")
    public static int method2163(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1612 -= arg13.field1624 * arg5;
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
        arg13.field1612 += arg13.field1624 * var26;
        arg13.field1617 = arg6;
        arg13.field1618 = arg7;
        arg13.field1615 = arg4;
        return var26;
    }
}
