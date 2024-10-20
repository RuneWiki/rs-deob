package deob;

@ObfuscatedName("dm")
public class class115 extends class117 {

    @ObfuscatedName("dm.p")
    public int field1573;

    @ObfuscatedName("dm.i")
    public int field1582;

    @ObfuscatedName("dm.s")
    public int field1574;

    @ObfuscatedName("dm.j")
    public int field1575;

    @ObfuscatedName("dm.a")
    public int field1576;

    @ObfuscatedName("dm.t")
    public int field1577;

    @ObfuscatedName("dm.r")
    public int field1578;

    @ObfuscatedName("dm.m")
    public int field1579;

    @ObfuscatedName("dm.h")
    public int field1580;

    @ObfuscatedName("dm.o")
    public int field1581;

    @ObfuscatedName("dm.x")
    public boolean field1572;

    @ObfuscatedName("dm.q")
    public int field1583;

    @ObfuscatedName("dm.v")
    public int field1584;

    @ObfuscatedName("dm.n")
    public int field1585;

    @ObfuscatedName("dm.y")
    public int field1586;

    @ObfuscatedName("dm.p(II)I")
    public static int method2143(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.i(II)I")
    public static int method2122(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.aq()I")
    public int method2123() {
        int var1 = this.field1576 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1579 == 0) {
            var2 -= this.field1573 * var2 / (((class105) this.field1601).field1501.length << 8);
        } else if (this.field1579 >= 0) {
            var2 -= this.field1580 * var2 / ((class105) this.field1601).field1501.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class115(class105 arg0, int arg1, int arg2) {
        this.field1601 = arg0;
        this.field1580 = arg0.field1502;
        this.field1581 = arg0.field1500;
        this.field1572 = arg0.field1504;
        this.field1582 = arg1;
        this.field1574 = arg2;
        this.field1575 = 8192;
        this.field1573 = 0;
        this.method2125();
    }

    public class115(class105 arg0, int arg1, int arg2, int arg3) {
        this.field1601 = arg0;
        this.field1580 = arg0.field1502;
        this.field1581 = arg0.field1500;
        this.field1572 = arg0.field1504;
        this.field1582 = arg1;
        this.field1574 = arg2;
        this.field1575 = arg3;
        this.field1573 = 0;
        this.method2125();
    }

    @ObfuscatedName("dm.w(Ldp;II)Ldm;")
    public static class115 method2124(class105 arg0, int arg1, int arg2) {
        return arg0.field1501 == null || arg0.field1501.length == 0 ? null : new class115(arg0, (int) ((long) arg0.field1503 * 256L * (long) arg1 / (long) (Statics.field311 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dm.s(Ldp;III)Ldm;")
    public static class115 method2244(class105 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1501 == null || arg0.field1501.length == 0 ? null : new class115(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dm.j()V")
    public void method2125() {
        this.field1576 = this.field1574;
        this.field1577 = method2143(this.field1574, this.field1575);
        this.field1578 = method2122(this.field1574, this.field1575);
    }

    @ObfuscatedName("dm.h(I)V")
    public synchronized void method2126(int arg0) {
        this.field1579 = arg0;
    }

    @ObfuscatedName("dm.x(I)V")
    public synchronized void method2127(int arg0) {
        this.method2191(arg0 << 6, this.method2131());
    }

    @ObfuscatedName("dm.q(I)V")
    public synchronized void method2128(int arg0) {
        this.method2191(arg0, this.method2131());
    }

    @ObfuscatedName("dm.d(II)V")
    public synchronized void method2191(int arg0, int arg1) {
        this.field1574 = arg0;
        this.field1575 = arg1;
        this.field1583 = 0;
        this.method2125();
    }

    @ObfuscatedName("dm.l()I")
    public synchronized int method2238() {
        return this.field1574 == Integer.MIN_VALUE ? 0 : this.field1574;
    }

    @ObfuscatedName("dm.f()I")
    public synchronized int method2131() {
        return this.field1575 < 0 ? -1 : this.field1575;
    }

    @ObfuscatedName("dm.k(I)V")
    public synchronized void method2132(int arg0) {
        int var2 = ((class105) this.field1601).field1501.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1573 = arg0;
    }

    @ObfuscatedName("dm.e(Z)V")
    public synchronized void method2133(boolean arg0) {
        this.field1582 = (this.field1582 >>> 31) + (this.field1582 ^ this.field1582 >> 31);
        if (arg0) {
            this.field1582 = -this.field1582;
        }
    }

    @ObfuscatedName("dm.u()V")
    public void method2134() {
        if (this.field1583 == 0) {
            return;
        }
        if (this.field1574 == Integer.MIN_VALUE) {
            this.field1574 = 0;
        }
        this.field1583 = 0;
        this.method2125();
    }

    @ObfuscatedName("dm.z(II)V")
    public synchronized void method2135(int arg0, int arg1) {
        this.method2130(arg0, arg1, this.method2131());
    }

    @ObfuscatedName("dm.ae(III)V")
    public synchronized void method2130(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2191(arg1, arg2);
            return;
        }
        int var4 = method2143(arg1, arg2);
        int var5 = method2122(arg1, arg2);
        if (this.field1577 == var4 && this.field1578 == var5) {
            this.field1583 = 0;
            return;
        }
        int var6 = arg1 - this.field1576;
        if (this.field1576 - arg1 > var6) {
            var6 = this.field1576 - arg1;
        }
        if (var4 - this.field1577 > var6) {
            var6 = var4 - this.field1577;
        }
        if (this.field1577 - var4 > var6) {
            var6 = this.field1577 - var4;
        }
        if (var5 - this.field1578 > var6) {
            var6 = var5 - this.field1578;
        }
        if (this.field1578 - var5 > var6) {
            var6 = this.field1578 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1583 = arg0;
        this.field1574 = arg1;
        this.field1575 = arg2;
        this.field1584 = (arg1 - this.field1576) / arg0;
        this.field1585 = (var4 - this.field1577) / arg0;
        this.field1586 = (var5 - this.field1578) / arg0;
    }

    @ObfuscatedName("dm.ah(I)V")
    public synchronized void method2136(int arg0) {
        if (arg0 == 0) {
            this.method2128(0);
            this.method3561();
        } else if (this.field1577 == 0 && this.field1578 == 0) {
            this.field1583 = 0;
            this.field1574 = 0;
            this.field1576 = 0;
            this.method3561();
        } else {
            int var2 = -this.field1576;
            if (this.field1576 > var2) {
                var2 = this.field1576;
            }
            if (-this.field1577 > var2) {
                var2 = -this.field1577;
            }
            if (this.field1577 > var2) {
                var2 = this.field1577;
            }
            if (-this.field1578 > var2) {
                var2 = -this.field1578;
            }
            if (this.field1578 > var2) {
                var2 = this.field1578;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1583 = arg0;
            this.field1574 = Integer.MIN_VALUE;
            this.field1584 = -this.field1576 / arg0;
            this.field1585 = -this.field1577 / arg0;
            this.field1586 = -this.field1578 / arg0;
        }
    }

    @ObfuscatedName("dm.ai(I)V")
    public synchronized void method2137(int arg0) {
        if (this.field1582 < 0) {
            this.field1582 = -arg0;
        } else {
            this.field1582 = arg0;
        }
    }

    @ObfuscatedName("dm.au()I")
    public synchronized int method2138() {
        return this.field1582 < 0 ? -this.field1582 : this.field1582;
    }

    @ObfuscatedName("dm.am()Z")
    public boolean method2139() {
        return this.field1573 < 0 || this.field1573 >= ((class105) this.field1601).field1501.length << 8;
    }

    @ObfuscatedName("dm.af()Z")
    public boolean method2140() {
        return this.field1583 != 0;
    }

    @ObfuscatedName("dm.a()Ldj;")
    public class117 method1915() {
        return null;
    }

    @ObfuscatedName("dm.t()Ldj;")
    public class117 method1909() {
        return null;
    }

    @ObfuscatedName("dm.r()I")
    public int method1910() {
        return this.field1574 == 0 && this.field1583 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dm.m([III)V")
    public synchronized void method1923(int[] arg0, int arg1, int arg2) {
        if (this.field1574 == 0 && this.field1583 == 0) {
            this.method1913(arg2);
            return;
        }
        class105 var4 = (class105) this.field1601;
        int var5 = this.field1580 << 8;
        int var6 = this.field1581 << 8;
        int var7 = var4.field1501.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1579 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1573 < 0) {
            if (this.field1582 <= 0) {
                this.method2134();
                this.method3561();
                return;
            }
            this.field1573 = 0;
        }
        if (this.field1573 >= var7) {
            if (this.field1582 >= 0) {
                this.method2134();
                this.method3561();
                return;
            }
            this.field1573 = var7 - 1;
        }
        if (this.field1579 >= 0) {
            if (this.field1579 > 0) {
                if (this.field1572) {
                    label131: {
                        if (this.field1582 < 0) {
                            var9 = this.method2144(arg0, arg1, var5, var10, var4.field1501[this.field1580]);
                            if (this.field1573 >= var5) {
                                return;
                            }
                            this.field1573 = var5 + var5 - 1 - this.field1573;
                            this.field1582 = -this.field1582;
                            if (--this.field1579 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2189(arg0, var9, var6, var10, var4.field1501[this.field1581 - 1]);
                            if (this.field1573 < var6) {
                                return;
                            }
                            this.field1573 = var6 + var6 - 1 - this.field1573;
                            this.field1582 = -this.field1582;
                            if (--this.field1579 == 0) {
                                break;
                            }
                            var9 = this.method2144(arg0, var9, var5, var10, var4.field1501[this.field1580]);
                            if (this.field1573 >= var5) {
                                return;
                            }
                            this.field1573 = var5 + var5 - 1 - this.field1573;
                            this.field1582 = -this.field1582;
                        } while (--this.field1579 != 0);
                    }
                } else if (this.field1582 < 0) {
                    while (true) {
                        var9 = this.method2144(arg0, var9, var5, var10, var4.field1501[this.field1581 - 1]);
                        if (this.field1573 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1573) / var8;
                        if (var12 >= this.field1579) {
                            this.field1573 += this.field1579 * var8;
                            this.field1579 = 0;
                            break;
                        }
                        this.field1573 += var8 * var12;
                        this.field1579 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2189(arg0, var9, var6, var10, var4.field1501[this.field1580]);
                        if (this.field1573 < var6) {
                            return;
                        }
                        int var13 = (this.field1573 - var5) / var8;
                        if (var13 >= this.field1579) {
                            this.field1573 -= this.field1579 * var8;
                            this.field1579 = 0;
                            break;
                        }
                        this.field1573 -= var8 * var13;
                        this.field1579 -= var13;
                    }
                }
            }
            if (this.field1582 < 0) {
                this.method2144(arg0, var9, 0, var10, 0);
                if (this.field1573 < 0) {
                    this.field1573 = -1;
                    this.method2134();
                    this.method3561();
                }
            } else {
                this.method2189(arg0, var9, var7, var10, 0);
                if (this.field1573 >= var7) {
                    this.field1573 = var7;
                    this.method2134();
                    this.method3561();
                }
            }
        } else if (this.field1572) {
            if (this.field1582 < 0) {
                var9 = this.method2144(arg0, arg1, var5, var10, var4.field1501[this.field1580]);
                if (this.field1573 >= var5) {
                    return;
                }
                this.field1573 = var5 + var5 - 1 - this.field1573;
                this.field1582 = -this.field1582;
            }
            while (true) {
                int var11 = this.method2189(arg0, var9, var6, var10, var4.field1501[this.field1581 - 1]);
                if (this.field1573 < var6) {
                    return;
                }
                this.field1573 = var6 + var6 - 1 - this.field1573;
                this.field1582 = -this.field1582;
                var9 = this.method2144(arg0, var11, var5, var10, var4.field1501[this.field1580]);
                if (this.field1573 >= var5) {
                    return;
                }
                this.field1573 = var5 + var5 - 1 - this.field1573;
                this.field1582 = -this.field1582;
            }
        } else if (this.field1582 < 0) {
            while (true) {
                var9 = this.method2144(arg0, var9, var5, var10, var4.field1501[this.field1581 - 1]);
                if (this.field1573 >= var5) {
                    return;
                }
                this.field1573 = var6 - 1 - (var6 - 1 - this.field1573) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2189(arg0, var9, var6, var10, var4.field1501[this.field1580]);
                if (this.field1573 < var6) {
                    return;
                }
                this.field1573 = (this.field1573 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dm.o(I)V")
    public synchronized void method1913(int arg0) {
        if (this.field1583 > 0) {
            if (arg0 >= this.field1583) {
                if (this.field1574 == Integer.MIN_VALUE) {
                    this.field1574 = 0;
                    this.field1578 = 0;
                    this.field1577 = 0;
                    this.field1576 = 0;
                    this.method3561();
                    arg0 = this.field1583;
                }
                this.field1583 = 0;
                this.method2125();
            } else {
                this.field1576 += this.field1584 * arg0;
                this.field1577 += this.field1585 * arg0;
                this.field1578 += this.field1586 * arg0;
                this.field1583 -= arg0;
            }
        }
        class105 var2 = (class105) this.field1601;
        int var3 = this.field1580 << 8;
        int var4 = this.field1581 << 8;
        int var5 = var2.field1501.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1579 = 0;
        }
        if (this.field1573 < 0) {
            if (this.field1582 <= 0) {
                this.method2134();
                this.method3561();
                return;
            }
            this.field1573 = 0;
        }
        if (this.field1573 >= var5) {
            if (this.field1582 >= 0) {
                this.method2134();
                this.method3561();
                return;
            }
            this.field1573 = var5 - 1;
        }
        this.field1573 += this.field1582 * arg0;
        if (this.field1579 >= 0) {
            if (this.field1579 > 0) {
                if (this.field1572) {
                    label121: {
                        if (this.field1582 < 0) {
                            if (this.field1573 >= var3) {
                                return;
                            }
                            this.field1573 = var3 + var3 - 1 - this.field1573;
                            this.field1582 = -this.field1582;
                            if (--this.field1579 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1573 < var4) {
                                return;
                            }
                            this.field1573 = var4 + var4 - 1 - this.field1573;
                            this.field1582 = -this.field1582;
                            if (--this.field1579 == 0) {
                                break;
                            }
                            if (this.field1573 >= var3) {
                                return;
                            }
                            this.field1573 = var3 + var3 - 1 - this.field1573;
                            this.field1582 = -this.field1582;
                        } while (--this.field1579 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1582 < 0) {
                            if (this.field1573 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1573) / var6;
                            if (var7 >= this.field1579) {
                                this.field1573 += this.field1579 * var6;
                                this.field1579 = 0;
                                break label153;
                            }
                            this.field1573 += var6 * var7;
                            this.field1579 -= var7;
                        } else if (this.field1573 >= var4) {
                            int var8 = (this.field1573 - var3) / var6;
                            if (var8 >= this.field1579) {
                                this.field1573 -= this.field1579 * var6;
                                this.field1579 = 0;
                                break label153;
                            }
                            this.field1573 -= var6 * var8;
                            this.field1579 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1582 < 0) {
                if (this.field1573 < 0) {
                    this.field1573 = -1;
                    this.method2134();
                    this.method3561();
                }
            } else if (this.field1573 >= var5) {
                this.field1573 = var5;
                this.method2134();
                this.method3561();
            }
        } else if (this.field1572) {
            if (this.field1582 < 0) {
                if (this.field1573 >= var3) {
                    return;
                }
                this.field1573 = var3 + var3 - 1 - this.field1573;
                this.field1582 = -this.field1582;
            }
            while (this.field1573 >= var4) {
                this.field1573 = var4 + var4 - 1 - this.field1573;
                this.field1582 = -this.field1582;
                if (this.field1573 >= var3) {
                    return;
                }
                this.field1573 = var3 + var3 - 1 - this.field1573;
                this.field1582 = -this.field1582;
            }
        } else if (this.field1582 < 0) {
            if (this.field1573 >= var3) {
                return;
            }
            this.field1573 = var4 - 1 - (var4 - 1 - this.field1573) % var6;
        } else if (this.field1573 >= var4) {
            this.field1573 = (this.field1573 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dm.av([IIIII)I")
    public int method2189(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1583 > 0) {
                int var6 = this.field1583 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1583 += arg1;
                if (this.field1582 == 256 && (this.field1573 & 0xFF) == 0) {
                    if (Statics.field257) {
                        arg1 = method2155(0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, this.field1585, this.field1586, 0, var6, arg2, this);
                    } else {
                        arg1 = method2154(((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, this.field1584, 0, var6, arg2, this);
                    }
                } else if (Statics.field257) {
                    arg1 = method2159(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, this.field1585, this.field1586, 0, var6, arg2, this, this.field1582, arg4);
                } else {
                    arg1 = method2158(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, this.field1584, 0, var6, arg2, this, this.field1582, arg4);
                }
                this.field1583 -= arg1;
                if (this.field1583 != 0) {
                    return arg1;
                }
                if (!this.method2164()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1582 == 256 && (this.field1573 & 0xFF) == 0) {
                if (Statics.field257) {
                    return method2184(0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, 0, arg3, arg2, this);
                }
                return method2208(((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, 0, arg3, arg2, this);
            }
            if (Statics.field257) {
                return method2163(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, 0, arg3, arg2, this, this.field1582, arg4);
            }
            return method2150(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, 0, arg3, arg2, this, this.field1582, arg4);
        }
    }

    @ObfuscatedName("dm.aw([IIIII)I")
    public int method2144(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1583 > 0) {
                int var6 = this.field1583 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1583 += arg1;
                if (this.field1582 == -256 && (this.field1573 & 0xFF) == 0) {
                    if (Statics.field257) {
                        arg1 = method2157(0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, this.field1585, this.field1586, 0, var6, arg2, this);
                    } else {
                        arg1 = method2156(((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, this.field1584, 0, var6, arg2, this);
                    }
                } else if (Statics.field257) {
                    arg1 = method2209(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, this.field1585, this.field1586, 0, var6, arg2, this, this.field1582, arg4);
                } else {
                    arg1 = method2160(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, this.field1584, 0, var6, arg2, this, this.field1582, arg4);
                }
                this.field1583 -= arg1;
                if (this.field1583 != 0) {
                    return arg1;
                }
                if (!this.method2164()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1582 == -256 && (this.field1573 & 0xFF) == 0) {
                if (Statics.field257) {
                    return method2168(0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, 0, arg3, arg2, this);
                }
                return method2148(((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, 0, arg3, arg2, this);
            }
            if (Statics.field257) {
                return method2185(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1577, this.field1578, 0, arg3, arg2, this, this.field1582, arg4);
            }
            return method2152(0, 0, ((class105) this.field1601).field1501, arg0, this.field1573, arg1, this.field1576, 0, arg3, arg2, this, this.field1582, arg4);
        }
    }

    @ObfuscatedName("dm.ad()Z")
    public boolean method2164() {
        int var1 = this.field1574;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2143(var1, this.field1575);
            var2 = method2122(var1, this.field1575);
        }
        if (this.field1576 != var1 || this.field1577 != var3 || this.field1578 != var2) {
            if (this.field1576 < var1) {
                this.field1584 = 1;
                this.field1583 = var1 - this.field1576;
            } else if (this.field1576 > var1) {
                this.field1584 = -1;
                this.field1583 = this.field1576 - var1;
            } else {
                this.field1584 = 0;
            }
            if (this.field1577 < var3) {
                this.field1585 = 1;
                if (this.field1583 == 0 || this.field1583 > var3 - this.field1577) {
                    this.field1583 = var3 - this.field1577;
                }
            } else if (this.field1577 > var3) {
                this.field1585 = -1;
                if (this.field1583 == 0 || this.field1583 > this.field1577 - var3) {
                    this.field1583 = this.field1577 - var3;
                }
            } else {
                this.field1585 = 0;
            }
            if (this.field1578 < var2) {
                this.field1586 = 1;
                if (this.field1583 == 0 || this.field1583 > var2 - this.field1578) {
                    this.field1583 = var2 - this.field1578;
                }
            } else if (this.field1578 > var2) {
                this.field1586 = -1;
                if (this.field1583 == 0 || this.field1583 > this.field1578 - var2) {
                    this.field1583 = this.field1578 - var2;
                }
            } else {
                this.field1586 = 0;
            }
            return false;
        } else if (this.field1574 == Integer.MIN_VALUE) {
            this.field1574 = 0;
            this.field1578 = 0;
            this.field1577 = 0;
            this.field1576 = 0;
            this.method3561();
            return true;
        } else {
            this.method2125();
            return false;
        }
    }

    @ObfuscatedName("dm.ab([B[IIIIIIILdm;)I")
    public static int method2208(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class115 arg8) {
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
        arg8.field1573 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.ac(I[B[IIIIIIIILdm;)I")
    public static int method2184(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10) {
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
        arg10.field1573 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.ak([B[IIIIIIILdm;)I")
    public static int method2148(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class115 arg8) {
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
        arg8.field1573 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.az(I[B[IIIIIIIILdm;)I")
    public static int method2168(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10) {
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
        arg10.field1573 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.as(II[B[IIIIIIILdm;II)I")
    public static int method2150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10, int arg11, int arg12) {
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
        arg10.field1573 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.at(II[B[IIIIIIIILdm;II)I")
    public static int method2163(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
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
        arg11.field1573 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.aj(II[B[IIIIIIILdm;II)I")
    public static int method2152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class115 arg10, int arg11, int arg12) {
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
        arg10.field1573 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.al(II[B[IIIIIIIILdm;II)I")
    public static int method2185(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
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
        arg11.field1573 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.bw([B[IIIIIIIILdm;)I")
    public static int method2154(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class115 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1577 += (var14 - arg3) * arg9.field1585;
        arg9.field1578 += (var14 - arg3) * arg9.field1586;
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
        arg9.field1576 = var12 >> 2;
        arg9.field1573 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bt(I[B[IIIIIIIIIILdm;)I")
    public static int method2155(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class115 arg12) {
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
        arg12.field1576 += (var19 - arg4) * arg12.field1584;
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
        arg12.field1577 = var15 >> 2;
        arg12.field1578 = var16 >> 2;
        arg12.field1573 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.by([B[IIIIIIIILdm;)I")
    public static int method2156(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class115 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1577 += (var14 - arg3) * arg9.field1585;
        arg9.field1578 += (var14 - arg3) * arg9.field1586;
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
        arg9.field1576 = var12 >> 2;
        arg9.field1573 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bq(I[B[IIIIIIIIIILdm;)I")
    public static int method2157(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class115 arg12) {
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
        arg12.field1576 += (var19 - arg4) * arg12.field1584;
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
        arg12.field1577 = var15 >> 2;
        arg12.field1578 = var16 >> 2;
        arg12.field1573 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bf(II[B[IIIIIIIILdm;II)I")
    public static int method2158(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
        arg11.field1577 -= arg11.field1585 * arg5;
        arg11.field1578 -= arg11.field1586 * arg5;
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
        arg11.field1577 += arg11.field1585 * arg5;
        arg11.field1578 += arg11.field1586 * arg5;
        arg11.field1576 = arg6;
        arg11.field1573 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bp(II[B[IIIIIIIIIILdm;II)I")
    public static int method2159(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class115 arg13, int arg14, int arg15) {
        arg13.field1576 -= arg13.field1584 * arg5;
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
        arg13.field1576 += arg13.field1584 * var27;
        arg13.field1577 = arg6;
        arg13.field1578 = arg7;
        arg13.field1573 = arg4;
        return var27;
    }

    @ObfuscatedName("dm.bn(II[B[IIIIIIIILdm;II)I")
    public static int method2160(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class115 arg11, int arg12, int arg13) {
        arg11.field1577 -= arg11.field1585 * arg5;
        arg11.field1578 -= arg11.field1586 * arg5;
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
        arg11.field1577 += arg11.field1585 * arg5;
        arg11.field1578 += arg11.field1586 * arg5;
        arg11.field1576 = arg6;
        arg11.field1573 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bb(II[B[IIIIIIIIIILdm;II)I")
    public static int method2209(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class115 arg13, int arg14, int arg15) {
        arg13.field1576 -= arg13.field1584 * arg5;
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
        arg13.field1576 += arg13.field1584 * var26;
        arg13.field1577 = arg6;
        arg13.field1578 = arg7;
        arg13.field1573 = arg4;
        return var26;
    }
}
