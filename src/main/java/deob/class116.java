package deob;

@ObfuscatedName("dn")
public class class116 extends class118 {

    @ObfuscatedName("dn.g")
    public int field1606;

    @ObfuscatedName("dn.e")
    public int field1596;

    @ObfuscatedName("dn.b")
    public int field1597;

    @ObfuscatedName("dn.z")
    public int field1598;

    @ObfuscatedName("dn.n")
    public int field1609;

    @ObfuscatedName("dn.l")
    public int field1600;

    @ObfuscatedName("dn.s")
    public int field1595;

    @ObfuscatedName("dn.y")
    public int field1601;

    @ObfuscatedName("dn.c")
    public int field1603;

    @ObfuscatedName("dn.h")
    public int field1604;

    @ObfuscatedName("dn.i")
    public boolean field1605;

    @ObfuscatedName("dn.o")
    public int field1602;

    @ObfuscatedName("dn.d")
    public int field1607;

    @ObfuscatedName("dn.r")
    public int field1608;

    @ObfuscatedName("dn.p")
    public int field1599;

    @ObfuscatedName("dn.g(II)I")
    public static int method2267(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dn.e(II)I")
    public static int method2280(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dn.bo()I")
    public int method2237() {
        int var1 = this.field1609 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1601 == 0) {
            var2 -= this.field1606 * var2 / (((class106) this.field1624).field1520.length << 8);
        } else if (this.field1601 >= 0) {
            var2 -= this.field1603 * var2 / ((class106) this.field1624).field1520.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class116(class106 arg0, int arg1, int arg2) {
        this.field1624 = arg0;
        this.field1603 = arg0.field1521;
        this.field1604 = arg0.field1522;
        this.field1605 = arg0.field1523;
        this.field1596 = arg1;
        this.field1597 = arg2;
        this.field1598 = 8192;
        this.field1606 = 0;
        this.method2240();
    }

    public class116(class106 arg0, int arg1, int arg2, int arg3) {
        this.field1624 = arg0;
        this.field1603 = arg0.field1521;
        this.field1604 = arg0.field1522;
        this.field1605 = arg0.field1523;
        this.field1596 = arg1;
        this.field1597 = arg2;
        this.field1598 = arg3;
        this.field1606 = 0;
        this.method2240();
    }

    @ObfuscatedName("dn.b(Ldt;II)Ldn;")
    public static class116 method2238(class106 arg0, int arg1, int arg2) {
        return arg0.field1520 == null || arg0.field1520.length == 0 ? null : new class116(arg0, (int) ((long) arg0.field1519 * 256L * (long) arg1 / (long) (Statics.field1550 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dn.z(Ldt;III)Ldn;")
    public static class116 method2300(class106 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1520 == null || arg0.field1520.length == 0 ? null : new class116(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dn.n()V")
    public void method2240() {
        this.field1609 = this.field1597;
        this.field1600 = method2267(this.field1597, this.field1598);
        this.field1595 = method2280(this.field1597, this.field1598);
    }

    @ObfuscatedName("dn.o(I)V")
    public synchronized void method2241(int arg0) {
        this.field1601 = arg0;
    }

    @ObfuscatedName("dn.r(I)V")
    public synchronized void method2351(int arg0) {
        this.method2324(arg0 << 6, this.method2246());
    }

    @ObfuscatedName("dn.p(I)V")
    public synchronized void method2264(int arg0) {
        this.method2324(arg0, this.method2246());
    }

    @ObfuscatedName("dn.q(II)V")
    public synchronized void method2324(int arg0, int arg1) {
        this.field1597 = arg0;
        this.field1598 = arg1;
        this.field1602 = 0;
        this.method2240();
    }

    @ObfuscatedName("dn.f()I")
    public synchronized int method2245() {
        return this.field1597 == Integer.MIN_VALUE ? 0 : this.field1597;
    }

    @ObfuscatedName("dn.j()I")
    public synchronized int method2246() {
        return this.field1598 < 0 ? -1 : this.field1598;
    }

    @ObfuscatedName("dn.v(I)V")
    public synchronized void method2247(int arg0) {
        int var2 = ((class106) this.field1624).field1520.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1606 = arg0;
    }

    @ObfuscatedName("dn.u(Z)V")
    public synchronized void method2326(boolean arg0) {
        this.field1596 = (this.field1596 >>> 31) + (this.field1596 ^ this.field1596 >> 31);
        if (arg0) {
            this.field1596 = -this.field1596;
        }
    }

    @ObfuscatedName("dn.k()V")
    public void method2249() {
        if (this.field1602 == 0) {
            return;
        }
        if (this.field1597 == Integer.MIN_VALUE) {
            this.field1597 = 0;
        }
        this.field1602 = 0;
        this.method2240();
    }

    @ObfuscatedName("dn.w(II)V")
    public synchronized void method2250(int arg0, int arg1) {
        this.method2354(arg0, arg1, this.method2246());
    }

    @ObfuscatedName("dn.x(III)V")
    public synchronized void method2354(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2324(arg1, arg2);
            return;
        }
        int var4 = method2267(arg1, arg2);
        int var5 = method2280(arg1, arg2);
        if (this.field1600 == var4 && this.field1595 == var5) {
            this.field1602 = 0;
            return;
        }
        int var6 = arg1 - this.field1609;
        if (this.field1609 - arg1 > var6) {
            var6 = this.field1609 - arg1;
        }
        if (var4 - this.field1600 > var6) {
            var6 = var4 - this.field1600;
        }
        if (this.field1600 - var4 > var6) {
            var6 = this.field1600 - var4;
        }
        if (var5 - this.field1595 > var6) {
            var6 = var5 - this.field1595;
        }
        if (this.field1595 - var5 > var6) {
            var6 = this.field1595 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1602 = arg0;
        this.field1597 = arg1;
        this.field1598 = arg2;
        this.field1607 = (arg1 - this.field1609) / arg0;
        this.field1608 = (var4 - this.field1600) / arg0;
        this.field1599 = (var5 - this.field1595) / arg0;
    }

    @ObfuscatedName("dn.t(I)V")
    public synchronized void method2252(int arg0) {
        if (arg0 == 0) {
            this.method2264(0);
            this.method3796();
        } else if (this.field1600 == 0 && this.field1595 == 0) {
            this.field1602 = 0;
            this.field1597 = 0;
            this.field1609 = 0;
            this.method3796();
        } else {
            int var2 = -this.field1609;
            if (this.field1609 > var2) {
                var2 = this.field1609;
            }
            if (-this.field1600 > var2) {
                var2 = -this.field1600;
            }
            if (this.field1600 > var2) {
                var2 = this.field1600;
            }
            if (-this.field1595 > var2) {
                var2 = -this.field1595;
            }
            if (this.field1595 > var2) {
                var2 = this.field1595;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1602 = arg0;
            this.field1597 = Integer.MIN_VALUE;
            this.field1607 = -this.field1609 / arg0;
            this.field1608 = -this.field1600 / arg0;
            this.field1599 = -this.field1595 / arg0;
        }
    }

    @ObfuscatedName("dn.ax(I)V")
    public synchronized void method2253(int arg0) {
        if (this.field1596 < 0) {
            this.field1596 = -arg0;
        } else {
            this.field1596 = arg0;
        }
    }

    @ObfuscatedName("dn.ai()I")
    public synchronized int method2254() {
        return this.field1596 < 0 ? -this.field1596 : this.field1596;
    }

    @ObfuscatedName("dn.ah()Z")
    public boolean method2255() {
        return this.field1606 < 0 || this.field1606 >= ((class106) this.field1624).field1520.length << 8;
    }

    @ObfuscatedName("dn.au()Z")
    public boolean method2261() {
        return this.field1602 != 0;
    }

    @ObfuscatedName("dn.l()Ldh;")
    public class118 method2035() {
        return null;
    }

    @ObfuscatedName("dn.s()Ldh;")
    public class118 method2032() {
        return null;
    }

    @ObfuscatedName("dn.y()I")
    public int method2061() {
        return this.field1597 == 0 && this.field1602 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dn.c([III)V")
    public synchronized void method2038(int[] arg0, int arg1, int arg2) {
        if (this.field1597 == 0 && this.field1602 == 0) {
            this.method2040(arg2);
            return;
        }
        class106 var4 = (class106) this.field1624;
        int var5 = this.field1603 << 8;
        int var6 = this.field1604 << 8;
        int var7 = var4.field1520.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1601 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1606 < 0) {
            if (this.field1596 <= 0) {
                this.method2249();
                this.method3796();
                return;
            }
            this.field1606 = 0;
        }
        if (this.field1606 >= var7) {
            if (this.field1596 >= 0) {
                this.method2249();
                this.method3796();
                return;
            }
            this.field1606 = var7 - 1;
        }
        if (this.field1601 >= 0) {
            if (this.field1601 > 0) {
                if (this.field1605) {
                    label131: {
                        if (this.field1596 < 0) {
                            var9 = this.method2367(arg0, arg1, var5, var10, var4.field1520[this.field1603]);
                            if (this.field1606 >= var5) {
                                return;
                            }
                            this.field1606 = var5 + var5 - 1 - this.field1606;
                            this.field1596 = -this.field1596;
                            if (--this.field1601 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2260(arg0, var9, var6, var10, var4.field1520[this.field1604 - 1]);
                            if (this.field1606 < var6) {
                                return;
                            }
                            this.field1606 = var6 + var6 - 1 - this.field1606;
                            this.field1596 = -this.field1596;
                            if (--this.field1601 == 0) {
                                break;
                            }
                            var9 = this.method2367(arg0, var9, var5, var10, var4.field1520[this.field1603]);
                            if (this.field1606 >= var5) {
                                return;
                            }
                            this.field1606 = var5 + var5 - 1 - this.field1606;
                            this.field1596 = -this.field1596;
                        } while (--this.field1601 != 0);
                    }
                } else if (this.field1596 < 0) {
                    while (true) {
                        var9 = this.method2367(arg0, var9, var5, var10, var4.field1520[this.field1604 - 1]);
                        if (this.field1606 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1606) / var8;
                        if (var12 >= this.field1601) {
                            this.field1606 += this.field1601 * var8;
                            this.field1601 = 0;
                            break;
                        }
                        this.field1606 += var8 * var12;
                        this.field1601 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2260(arg0, var9, var6, var10, var4.field1520[this.field1603]);
                        if (this.field1606 < var6) {
                            return;
                        }
                        int var13 = (this.field1606 - var5) / var8;
                        if (var13 >= this.field1601) {
                            this.field1606 -= this.field1601 * var8;
                            this.field1601 = 0;
                            break;
                        }
                        this.field1606 -= var8 * var13;
                        this.field1601 -= var13;
                    }
                }
            }
            if (this.field1596 < 0) {
                this.method2367(arg0, var9, 0, var10, 0);
                if (this.field1606 < 0) {
                    this.field1606 = -1;
                    this.method2249();
                    this.method3796();
                }
            } else {
                this.method2260(arg0, var9, var7, var10, 0);
                if (this.field1606 >= var7) {
                    this.field1606 = var7;
                    this.method2249();
                    this.method3796();
                }
            }
        } else if (this.field1605) {
            if (this.field1596 < 0) {
                var9 = this.method2367(arg0, arg1, var5, var10, var4.field1520[this.field1603]);
                if (this.field1606 >= var5) {
                    return;
                }
                this.field1606 = var5 + var5 - 1 - this.field1606;
                this.field1596 = -this.field1596;
            }
            while (true) {
                int var11 = this.method2260(arg0, var9, var6, var10, var4.field1520[this.field1604 - 1]);
                if (this.field1606 < var6) {
                    return;
                }
                this.field1606 = var6 + var6 - 1 - this.field1606;
                this.field1596 = -this.field1596;
                var9 = this.method2367(arg0, var11, var5, var10, var4.field1520[this.field1603]);
                if (this.field1606 >= var5) {
                    return;
                }
                this.field1606 = var5 + var5 - 1 - this.field1606;
                this.field1596 = -this.field1596;
            }
        } else if (this.field1596 < 0) {
            while (true) {
                var9 = this.method2367(arg0, var9, var5, var10, var4.field1520[this.field1604 - 1]);
                if (this.field1606 >= var5) {
                    return;
                }
                this.field1606 = var6 - 1 - (var6 - 1 - this.field1606) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2260(arg0, var9, var6, var10, var4.field1520[this.field1603]);
                if (this.field1606 < var6) {
                    return;
                }
                this.field1606 = (this.field1606 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dn.d(I)V")
    public synchronized void method2040(int arg0) {
        if (this.field1602 > 0) {
            if (arg0 >= this.field1602) {
                if (this.field1597 == Integer.MIN_VALUE) {
                    this.field1597 = 0;
                    this.field1595 = 0;
                    this.field1600 = 0;
                    this.field1609 = 0;
                    this.method3796();
                    arg0 = this.field1602;
                }
                this.field1602 = 0;
                this.method2240();
            } else {
                this.field1609 += this.field1607 * arg0;
                this.field1600 += this.field1608 * arg0;
                this.field1595 += this.field1599 * arg0;
                this.field1602 -= arg0;
            }
        }
        class106 var2 = (class106) this.field1624;
        int var3 = this.field1603 << 8;
        int var4 = this.field1604 << 8;
        int var5 = var2.field1520.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1601 = 0;
        }
        if (this.field1606 < 0) {
            if (this.field1596 <= 0) {
                this.method2249();
                this.method3796();
                return;
            }
            this.field1606 = 0;
        }
        if (this.field1606 >= var5) {
            if (this.field1596 >= 0) {
                this.method2249();
                this.method3796();
                return;
            }
            this.field1606 = var5 - 1;
        }
        this.field1606 += this.field1596 * arg0;
        if (this.field1601 >= 0) {
            if (this.field1601 > 0) {
                if (this.field1605) {
                    label121: {
                        if (this.field1596 < 0) {
                            if (this.field1606 >= var3) {
                                return;
                            }
                            this.field1606 = var3 + var3 - 1 - this.field1606;
                            this.field1596 = -this.field1596;
                            if (--this.field1601 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1606 < var4) {
                                return;
                            }
                            this.field1606 = var4 + var4 - 1 - this.field1606;
                            this.field1596 = -this.field1596;
                            if (--this.field1601 == 0) {
                                break;
                            }
                            if (this.field1606 >= var3) {
                                return;
                            }
                            this.field1606 = var3 + var3 - 1 - this.field1606;
                            this.field1596 = -this.field1596;
                        } while (--this.field1601 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1596 < 0) {
                            if (this.field1606 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1606) / var6;
                            if (var7 >= this.field1601) {
                                this.field1606 += this.field1601 * var6;
                                this.field1601 = 0;
                                break label153;
                            }
                            this.field1606 += var6 * var7;
                            this.field1601 -= var7;
                        } else if (this.field1606 >= var4) {
                            int var8 = (this.field1606 - var3) / var6;
                            if (var8 >= this.field1601) {
                                this.field1606 -= this.field1601 * var6;
                                this.field1601 = 0;
                                break label153;
                            }
                            this.field1606 -= var6 * var8;
                            this.field1601 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1596 < 0) {
                if (this.field1606 < 0) {
                    this.field1606 = -1;
                    this.method2249();
                    this.method3796();
                }
            } else if (this.field1606 >= var5) {
                this.field1606 = var5;
                this.method2249();
                this.method3796();
            }
        } else if (this.field1605) {
            if (this.field1596 < 0) {
                if (this.field1606 >= var3) {
                    return;
                }
                this.field1606 = var3 + var3 - 1 - this.field1606;
                this.field1596 = -this.field1596;
            }
            while (this.field1606 >= var4) {
                this.field1606 = var4 + var4 - 1 - this.field1606;
                this.field1596 = -this.field1596;
                if (this.field1606 >= var3) {
                    return;
                }
                this.field1606 = var3 + var3 - 1 - this.field1606;
                this.field1596 = -this.field1596;
            }
        } else if (this.field1596 < 0) {
            if (this.field1606 >= var3) {
                return;
            }
            this.field1606 = var4 - 1 - (var4 - 1 - this.field1606) % var6;
        } else if (this.field1606 >= var4) {
            this.field1606 = (this.field1606 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dn.ap([IIIII)I")
    public int method2260(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1602 > 0) {
                int var6 = this.field1602 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1602 += arg1;
                if (this.field1596 == 256 && (this.field1606 & 0xFF) == 0) {
                    if (Statics.field1536) {
                        arg1 = method2271(0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, this.field1608, this.field1599, 0, var6, arg2, this);
                    } else {
                        arg1 = method2364(((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, this.field1607, 0, var6, arg2, this);
                    }
                } else if (Statics.field1536) {
                    arg1 = method2272(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, this.field1608, this.field1599, 0, var6, arg2, this, this.field1596, arg4);
                } else {
                    arg1 = method2274(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, this.field1607, 0, var6, arg2, this, this.field1596, arg4);
                }
                this.field1602 -= arg1;
                if (this.field1602 != 0) {
                    return arg1;
                }
                if (!this.method2262()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1596 == 256 && (this.field1606 & 0xFF) == 0) {
                if (Statics.field1536) {
                    return method2301(0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, 0, arg3, arg2, this);
                }
                return method2263(((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, 0, arg3, arg2, this);
            }
            if (Statics.field1536) {
                return method2281(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, 0, arg3, arg2, this, this.field1596, arg4);
            }
            return method2278(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, 0, arg3, arg2, this, this.field1596, arg4);
        }
    }

    @ObfuscatedName("dn.at([IIIII)I")
    public int method2367(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1602 > 0) {
                int var6 = this.field1602 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1602 += arg1;
                if (this.field1596 == -256 && (this.field1606 & 0xFF) == 0) {
                    if (Statics.field1536) {
                        arg1 = method2273(0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, this.field1608, this.field1599, 0, var6, arg2, this);
                    } else {
                        arg1 = method2332(((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, this.field1607, 0, var6, arg2, this);
                    }
                } else if (Statics.field1536) {
                    arg1 = method2355(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, this.field1608, this.field1599, 0, var6, arg2, this, this.field1596, arg4);
                } else {
                    arg1 = method2316(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, this.field1607, 0, var6, arg2, this, this.field1596, arg4);
                }
                this.field1602 -= arg1;
                if (this.field1602 != 0) {
                    return arg1;
                }
                if (!this.method2262()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1596 == -256 && (this.field1606 & 0xFF) == 0) {
                if (Statics.field1536) {
                    return method2266(0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, 0, arg3, arg2, this);
                }
                return method2275(((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, 0, arg3, arg2, this);
            }
            if (Statics.field1536) {
                return method2333(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1600, this.field1595, 0, arg3, arg2, this, this.field1596, arg4);
            }
            return method2269(0, 0, ((class106) this.field1624).field1520, arg0, this.field1606, arg1, this.field1609, 0, arg3, arg2, this, this.field1596, arg4);
        }
    }

    @ObfuscatedName("dn.am()Z")
    public boolean method2262() {
        int var1 = this.field1597;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2267(var1, this.field1598);
            var2 = method2280(var1, this.field1598);
        }
        if (this.field1609 != var1 || this.field1600 != var3 || this.field1595 != var2) {
            if (this.field1609 < var1) {
                this.field1607 = 1;
                this.field1602 = var1 - this.field1609;
            } else if (this.field1609 > var1) {
                this.field1607 = -1;
                this.field1602 = this.field1609 - var1;
            } else {
                this.field1607 = 0;
            }
            if (this.field1600 < var3) {
                this.field1608 = 1;
                if (this.field1602 == 0 || this.field1602 > var3 - this.field1600) {
                    this.field1602 = var3 - this.field1600;
                }
            } else if (this.field1600 > var3) {
                this.field1608 = -1;
                if (this.field1602 == 0 || this.field1602 > this.field1600 - var3) {
                    this.field1602 = this.field1600 - var3;
                }
            } else {
                this.field1608 = 0;
            }
            if (this.field1595 < var2) {
                this.field1599 = 1;
                if (this.field1602 == 0 || this.field1602 > var2 - this.field1595) {
                    this.field1602 = var2 - this.field1595;
                }
            } else if (this.field1595 > var2) {
                this.field1599 = -1;
                if (this.field1602 == 0 || this.field1602 > this.field1595 - var2) {
                    this.field1602 = this.field1595 - var2;
                }
            } else {
                this.field1599 = 0;
            }
            return false;
        } else if (this.field1597 == Integer.MIN_VALUE) {
            this.field1597 = 0;
            this.field1595 = 0;
            this.field1600 = 0;
            this.field1609 = 0;
            this.method3796();
            return true;
        } else {
            this.method2240();
            return false;
        }
    }

    @ObfuscatedName("dn.aq([B[IIIIIIILdn;)I")
    public static int method2263(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1606 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bq(I[B[IIIIIIIILdn;)I")
    public static int method2301(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1606 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dn.bi([B[IIIIIIILdn;)I")
    public static int method2275(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class116 arg8) {
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
        arg8.field1606 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bj(I[B[IIIIIIIILdn;)I")
    public static int method2266(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10) {
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
        arg10.field1606 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dn.bw(II[B[IIIIIIILdn;II)I")
    public static int method2278(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1606 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bp(II[B[IIIIIIIILdn;II)I")
    public static int method2281(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1606 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dn.bh(II[B[IIIIIIILdn;II)I")
    public static int method2269(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class116 arg10, int arg11, int arg12) {
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
        arg10.field1606 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bz(II[B[IIIIIIIILdn;II)I")
    public static int method2333(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
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
        arg11.field1606 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dn.bl([B[IIIIIIIILdn;)I")
    public static int method2364(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1600 += (var14 - arg3) * arg9.field1608;
        arg9.field1595 += (var14 - arg3) * arg9.field1599;
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
        arg9.field1609 = var12 >> 2;
        arg9.field1606 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bb(I[B[IIIIIIIIIILdn;)I")
    public static int method2271(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1609 += (var19 - arg4) * arg12.field1607;
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
        arg12.field1600 = var15 >> 2;
        arg12.field1595 = var16 >> 2;
        arg12.field1606 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dn.ba([B[IIIIIIIILdn;)I")
    public static int method2332(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class116 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1600 += (var14 - arg3) * arg9.field1608;
        arg9.field1595 += (var14 - arg3) * arg9.field1599;
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
        arg9.field1609 = var12 >> 2;
        arg9.field1606 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dn.bk(I[B[IIIIIIIIIILdn;)I")
    public static int method2273(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class116 arg12) {
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
        arg12.field1609 += (var19 - arg4) * arg12.field1607;
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
        arg12.field1600 = var15 >> 2;
        arg12.field1595 = var16 >> 2;
        arg12.field1606 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dn.br(II[B[IIIIIIIILdn;II)I")
    public static int method2274(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1600 -= arg11.field1608 * arg5;
        arg11.field1595 -= arg11.field1599 * arg5;
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
        arg11.field1600 += arg11.field1608 * arg5;
        arg11.field1595 += arg11.field1599 * arg5;
        arg11.field1609 = arg6;
        arg11.field1606 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bc(II[B[IIIIIIIIIILdn;II)I")
    public static int method2272(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1609 -= arg13.field1607 * arg5;
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
        arg13.field1609 += arg13.field1607 * var27;
        arg13.field1600 = arg6;
        arg13.field1595 = arg7;
        arg13.field1606 = arg4;
        return var27;
    }

    @ObfuscatedName("dn.bf(II[B[IIIIIIIILdn;II)I")
    public static int method2316(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class116 arg11, int arg12, int arg13) {
        arg11.field1600 -= arg11.field1608 * arg5;
        arg11.field1595 -= arg11.field1599 * arg5;
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
        arg11.field1600 += arg11.field1608 * arg5;
        arg11.field1595 += arg11.field1599 * arg5;
        arg11.field1609 = arg6;
        arg11.field1606 = arg4;
        return arg5;
    }

    @ObfuscatedName("dn.bt(II[B[IIIIIIIIIILdn;II)I")
    public static int method2355(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class116 arg13, int arg14, int arg15) {
        arg13.field1609 -= arg13.field1607 * arg5;
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
        arg13.field1609 += arg13.field1607 * var26;
        arg13.field1600 = arg6;
        arg13.field1595 = arg7;
        arg13.field1606 = arg4;
        return var26;
    }
}
