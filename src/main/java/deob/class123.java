package deob;

@ObfuscatedName("dm")
public class class123 extends class125 {

    @ObfuscatedName("dm.z")
    public int field1507;

    @ObfuscatedName("dm.k")
    public int field1493;

    @ObfuscatedName("dm.s")
    public int field1495;

    @ObfuscatedName("dm.t")
    public int field1504;

    @ObfuscatedName("dm.i")
    public int field1494;

    @ObfuscatedName("dm.o")
    public int field1498;

    @ObfuscatedName("dm.x")
    public int field1499;

    @ObfuscatedName("dm.g")
    public int field1500;

    @ObfuscatedName("dm.m")
    public int field1496;

    @ObfuscatedName("dm.n")
    public int field1502;

    @ObfuscatedName("dm.d")
    public boolean field1503;

    @ObfuscatedName("dm.h")
    public int field1497;

    @ObfuscatedName("dm.a")
    public int field1505;

    @ObfuscatedName("dm.q")
    public int field1506;

    @ObfuscatedName("dm.c")
    public int field1501;

    @ObfuscatedName("dm.z(II)I")
    public static int method2509(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.k(II)I")
    public static int method2542(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dm.aw()I")
    public int method2423() {
        int var1 = this.field1494 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1500 == 0) {
            var2 -= this.field1507 * var2 / (((class113) this.field1522).field1417.length << 8);
        } else if (this.field1500 >= 0) {
            var2 -= this.field1496 * var2 / ((class113) this.field1522).field1417.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class123(class113 arg0, int arg1, int arg2) {
        this.field1522 = arg0;
        this.field1496 = arg0.field1416;
        this.field1502 = arg0.field1415;
        this.field1503 = arg0.field1418;
        this.field1493 = arg1;
        this.field1495 = arg2;
        this.field1504 = 8192;
        this.field1507 = 0;
        this.method2433();
    }

    public class123(class113 arg0, int arg1, int arg2, int arg3) {
        this.field1522 = arg0;
        this.field1496 = arg0.field1416;
        this.field1502 = arg0.field1415;
        this.field1503 = arg0.field1418;
        this.field1493 = arg1;
        this.field1495 = arg2;
        this.field1504 = arg3;
        this.field1507 = 0;
        this.method2433();
    }

    @ObfuscatedName("dm.s(Lde;II)Ldm;")
    public static class123 method2450(class113 arg0, int arg1, int arg2) {
        return arg0.field1417 == null || arg0.field1417.length == 0 ? null : new class123(arg0, (int) ((long) arg0.field1414 * 256L * (long) arg1 / (long) (Statics.field1448 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dm.t(Lde;III)Ldm;")
    public static class123 method2425(class113 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1417 == null || arg0.field1417.length == 0 ? null : new class123(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dm.i()V")
    public void method2433() {
        this.field1494 = this.field1495;
        this.field1498 = method2509(this.field1495, this.field1504);
        this.field1499 = method2542(this.field1495, this.field1504);
    }

    @ObfuscatedName("dm.m(I)V")
    public synchronized void method2443(int arg0) {
        this.field1500 = arg0;
    }

    @ObfuscatedName("dm.d(I)V")
    public synchronized void method2427(int arg0) {
        this.method2565(arg0 << 6, this.method2458());
    }

    @ObfuscatedName("dm.h(I)V")
    public synchronized void method2428(int arg0) {
        this.method2565(arg0, this.method2458());
    }

    @ObfuscatedName("dm.a(II)V")
    public synchronized void method2565(int arg0, int arg1) {
        this.field1495 = arg0;
        this.field1504 = arg1;
        this.field1497 = 0;
        this.method2433();
    }

    @ObfuscatedName("dm.q()I")
    public synchronized int method2430() {
        return this.field1495 == Integer.MIN_VALUE ? 0 : this.field1495;
    }

    @ObfuscatedName("dm.c()I")
    public synchronized int method2458() {
        return this.field1504 < 0 ? -1 : this.field1504;
    }

    @ObfuscatedName("dm.j(I)V")
    public synchronized void method2432(int arg0) {
        int var2 = ((class113) this.field1522).field1417.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1507 = arg0;
    }

    @ObfuscatedName("dm.r(Z)V")
    public synchronized void method2551(boolean arg0) {
        this.field1493 = (this.field1493 >>> 31) + (this.field1493 ^ this.field1493 >> 31);
        if (arg0) {
            this.field1493 = -this.field1493;
        }
    }

    @ObfuscatedName("dm.u()V")
    public void method2434() {
        if (this.field1497 == 0) {
            return;
        }
        if (this.field1495 == Integer.MIN_VALUE) {
            this.field1495 = 0;
        }
        this.field1497 = 0;
        this.method2433();
    }

    @ObfuscatedName("dm.p(II)V")
    public synchronized void method2519(int arg0, int arg1) {
        this.method2436(arg0, arg1, this.method2458());
    }

    @ObfuscatedName("dm.b(III)V")
    public synchronized void method2436(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2565(arg1, arg2);
            return;
        }
        int var4 = method2509(arg1, arg2);
        int var5 = method2542(arg1, arg2);
        if (this.field1498 == var4 && this.field1499 == var5) {
            this.field1497 = 0;
            return;
        }
        int var6 = arg1 - this.field1494;
        if (this.field1494 - arg1 > var6) {
            var6 = this.field1494 - arg1;
        }
        if (var4 - this.field1498 > var6) {
            var6 = var4 - this.field1498;
        }
        if (this.field1498 - var4 > var6) {
            var6 = this.field1498 - var4;
        }
        if (var5 - this.field1499 > var6) {
            var6 = var5 - this.field1499;
        }
        if (this.field1499 - var5 > var6) {
            var6 = this.field1499 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1497 = arg0;
        this.field1495 = arg1;
        this.field1504 = arg2;
        this.field1505 = (arg1 - this.field1494) / arg0;
        this.field1506 = (var4 - this.field1498) / arg0;
        this.field1501 = (var5 - this.field1499) / arg0;
    }

    @ObfuscatedName("dm.l(I)V")
    public synchronized void method2463(int arg0) {
        if (arg0 == 0) {
            this.method2428(0);
            this.method3401();
        } else if (this.field1498 == 0 && this.field1499 == 0) {
            this.field1497 = 0;
            this.field1495 = 0;
            this.field1494 = 0;
            this.method3401();
        } else {
            int var2 = -this.field1494;
            if (this.field1494 > var2) {
                var2 = this.field1494;
            }
            if (-this.field1498 > var2) {
                var2 = -this.field1498;
            }
            if (this.field1498 > var2) {
                var2 = this.field1498;
            }
            if (-this.field1499 > var2) {
                var2 = -this.field1499;
            }
            if (this.field1499 > var2) {
                var2 = this.field1499;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1497 = arg0;
            this.field1495 = Integer.MIN_VALUE;
            this.field1505 = -this.field1494 / arg0;
            this.field1506 = -this.field1498 / arg0;
            this.field1501 = -this.field1499 / arg0;
        }
    }

    @ObfuscatedName("dm.e(I)V")
    public synchronized void method2438(int arg0) {
        if (this.field1493 < 0) {
            this.field1493 = -arg0;
        } else {
            this.field1493 = arg0;
        }
    }

    @ObfuscatedName("dm.ab()I")
    public synchronized int method2465() {
        return this.field1493 < 0 ? -this.field1493 : this.field1493;
    }

    @ObfuscatedName("dm.ag()Z")
    public boolean method2440() {
        return this.field1507 < 0 || this.field1507 >= ((class113) this.field1522).field1417.length << 8;
    }

    @ObfuscatedName("dm.ao()Z")
    public boolean method2441() {
        return this.field1497 != 0;
    }

    @ObfuscatedName("dm.o()Ldc;")
    public class125 method2199() {
        return null;
    }

    @ObfuscatedName("dm.x()Ldc;")
    public class125 method2201() {
        return null;
    }

    @ObfuscatedName("dm.w()I")
    public int method2202() {
        return this.field1495 == 0 && this.field1497 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dm.g([III)V")
    public synchronized void method2203(int[] arg0, int arg1, int arg2) {
        if (this.field1495 == 0 && this.field1497 == 0) {
            this.method2214(arg2);
            return;
        }
        class113 var4 = (class113) this.field1522;
        int var5 = this.field1496 << 8;
        int var6 = this.field1502 << 8;
        int var7 = var4.field1417.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1500 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1507 < 0) {
            if (this.field1493 <= 0) {
                this.method2434();
                this.method3401();
                return;
            }
            this.field1507 = 0;
        }
        if (this.field1507 >= var7) {
            if (this.field1493 >= 0) {
                this.method2434();
                this.method3401();
                return;
            }
            this.field1507 = var7 - 1;
        }
        if (this.field1500 >= 0) {
            if (this.field1500 > 0) {
                if (this.field1503) {
                    label131: {
                        if (this.field1493 < 0) {
                            var9 = this.method2448(arg0, arg1, var5, var10, var4.field1417[this.field1496]);
                            if (this.field1507 >= var5) {
                                return;
                            }
                            this.field1507 = var5 + var5 - 1 - this.field1507;
                            this.field1493 = -this.field1493;
                            if (--this.field1500 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2446(arg0, var9, var6, var10, var4.field1417[this.field1502 - 1]);
                            if (this.field1507 < var6) {
                                return;
                            }
                            this.field1507 = var6 + var6 - 1 - this.field1507;
                            this.field1493 = -this.field1493;
                            if (--this.field1500 == 0) {
                                break;
                            }
                            var9 = this.method2448(arg0, var9, var5, var10, var4.field1417[this.field1496]);
                            if (this.field1507 >= var5) {
                                return;
                            }
                            this.field1507 = var5 + var5 - 1 - this.field1507;
                            this.field1493 = -this.field1493;
                        } while (--this.field1500 != 0);
                    }
                } else if (this.field1493 < 0) {
                    while (true) {
                        var9 = this.method2448(arg0, var9, var5, var10, var4.field1417[this.field1502 - 1]);
                        if (this.field1507 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1507) / var8;
                        if (var12 >= this.field1500) {
                            this.field1507 += this.field1500 * var8;
                            this.field1500 = 0;
                            break;
                        }
                        this.field1507 += var8 * var12;
                        this.field1500 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2446(arg0, var9, var6, var10, var4.field1417[this.field1496]);
                        if (this.field1507 < var6) {
                            return;
                        }
                        int var13 = (this.field1507 - var5) / var8;
                        if (var13 >= this.field1500) {
                            this.field1507 -= this.field1500 * var8;
                            this.field1500 = 0;
                            break;
                        }
                        this.field1507 -= var8 * var13;
                        this.field1500 -= var13;
                    }
                }
            }
            if (this.field1493 < 0) {
                this.method2448(arg0, var9, 0, var10, 0);
                if (this.field1507 < 0) {
                    this.field1507 = -1;
                    this.method2434();
                    this.method3401();
                }
            } else {
                this.method2446(arg0, var9, var7, var10, 0);
                if (this.field1507 >= var7) {
                    this.field1507 = var7;
                    this.method2434();
                    this.method3401();
                }
            }
        } else if (this.field1503) {
            if (this.field1493 < 0) {
                var9 = this.method2448(arg0, arg1, var5, var10, var4.field1417[this.field1496]);
                if (this.field1507 >= var5) {
                    return;
                }
                this.field1507 = var5 + var5 - 1 - this.field1507;
                this.field1493 = -this.field1493;
            }
            while (true) {
                int var11 = this.method2446(arg0, var9, var6, var10, var4.field1417[this.field1502 - 1]);
                if (this.field1507 < var6) {
                    return;
                }
                this.field1507 = var6 + var6 - 1 - this.field1507;
                this.field1493 = -this.field1493;
                var9 = this.method2448(arg0, var11, var5, var10, var4.field1417[this.field1496]);
                if (this.field1507 >= var5) {
                    return;
                }
                this.field1507 = var5 + var5 - 1 - this.field1507;
                this.field1493 = -this.field1493;
            }
        } else if (this.field1493 < 0) {
            while (true) {
                var9 = this.method2448(arg0, var9, var5, var10, var4.field1417[this.field1502 - 1]);
                if (this.field1507 >= var5) {
                    return;
                }
                this.field1507 = var6 - 1 - (var6 - 1 - this.field1507) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2446(arg0, var9, var6, var10, var4.field1417[this.field1496]);
                if (this.field1507 < var6) {
                    return;
                }
                this.field1507 = (this.field1507 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dm.n(I)V")
    public synchronized void method2214(int arg0) {
        if (this.field1497 > 0) {
            if (arg0 >= this.field1497) {
                if (this.field1495 == Integer.MIN_VALUE) {
                    this.field1495 = 0;
                    this.field1499 = 0;
                    this.field1498 = 0;
                    this.field1494 = 0;
                    this.method3401();
                    arg0 = this.field1497;
                }
                this.field1497 = 0;
                this.method2433();
            } else {
                this.field1494 += this.field1505 * arg0;
                this.field1498 += this.field1506 * arg0;
                this.field1499 += this.field1501 * arg0;
                this.field1497 -= arg0;
            }
        }
        class113 var2 = (class113) this.field1522;
        int var3 = this.field1496 << 8;
        int var4 = this.field1502 << 8;
        int var5 = var2.field1417.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1500 = 0;
        }
        if (this.field1507 < 0) {
            if (this.field1493 <= 0) {
                this.method2434();
                this.method3401();
                return;
            }
            this.field1507 = 0;
        }
        if (this.field1507 >= var5) {
            if (this.field1493 >= 0) {
                this.method2434();
                this.method3401();
                return;
            }
            this.field1507 = var5 - 1;
        }
        this.field1507 += this.field1493 * arg0;
        if (this.field1500 >= 0) {
            if (this.field1500 > 0) {
                if (this.field1503) {
                    label121: {
                        if (this.field1493 < 0) {
                            if (this.field1507 >= var3) {
                                return;
                            }
                            this.field1507 = var3 + var3 - 1 - this.field1507;
                            this.field1493 = -this.field1493;
                            if (--this.field1500 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1507 < var4) {
                                return;
                            }
                            this.field1507 = var4 + var4 - 1 - this.field1507;
                            this.field1493 = -this.field1493;
                            if (--this.field1500 == 0) {
                                break;
                            }
                            if (this.field1507 >= var3) {
                                return;
                            }
                            this.field1507 = var3 + var3 - 1 - this.field1507;
                            this.field1493 = -this.field1493;
                        } while (--this.field1500 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1493 < 0) {
                            if (this.field1507 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1507) / var6;
                            if (var7 >= this.field1500) {
                                this.field1507 += this.field1500 * var6;
                                this.field1500 = 0;
                                break label153;
                            }
                            this.field1507 += var6 * var7;
                            this.field1500 -= var7;
                        } else if (this.field1507 >= var4) {
                            int var8 = (this.field1507 - var3) / var6;
                            if (var8 >= this.field1500) {
                                this.field1507 -= this.field1500 * var6;
                                this.field1500 = 0;
                                break label153;
                            }
                            this.field1507 -= var6 * var8;
                            this.field1500 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1493 < 0) {
                if (this.field1507 < 0) {
                    this.field1507 = -1;
                    this.method2434();
                    this.method3401();
                }
            } else if (this.field1507 >= var5) {
                this.field1507 = var5;
                this.method2434();
                this.method3401();
            }
        } else if (this.field1503) {
            if (this.field1493 < 0) {
                if (this.field1507 >= var3) {
                    return;
                }
                this.field1507 = var3 + var3 - 1 - this.field1507;
                this.field1493 = -this.field1493;
            }
            while (this.field1507 >= var4) {
                this.field1507 = var4 + var4 - 1 - this.field1507;
                this.field1493 = -this.field1493;
                if (this.field1507 >= var3) {
                    return;
                }
                this.field1507 = var3 + var3 - 1 - this.field1507;
                this.field1493 = -this.field1493;
            }
        } else if (this.field1493 < 0) {
            if (this.field1507 >= var3) {
                return;
            }
            this.field1507 = var4 - 1 - (var4 - 1 - this.field1507) % var6;
        } else if (this.field1507 >= var4) {
            this.field1507 = (this.field1507 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dm.ae([IIIII)I")
    public int method2446(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1497 > 0) {
                int var6 = this.field1497 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1497 += arg1;
                if (this.field1493 == 256 && (this.field1507 & 0xFF) == 0) {
                    if (Statics.field1432) {
                        arg1 = method2424(0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, this.field1506, this.field1501, 0, var6, arg2, this);
                    } else {
                        arg1 = method2455(((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, this.field1505, 0, var6, arg2, this);
                    }
                } else if (Statics.field1432) {
                    arg1 = method2533(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, this.field1506, this.field1501, 0, var6, arg2, this, this.field1493, arg4);
                } else {
                    arg1 = method2459(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, this.field1505, 0, var6, arg2, this, this.field1493, arg4);
                }
                this.field1497 -= arg1;
                if (this.field1497 != 0) {
                    return arg1;
                }
                if (!this.method2447()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1493 == 256 && (this.field1507 & 0xFF) == 0) {
                if (Statics.field1432) {
                    return method2464(0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, 0, arg3, arg2, this);
                }
                return method2498(((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, 0, arg3, arg2, this);
            }
            if (Statics.field1432) {
                return method2452(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, 0, arg3, arg2, this, this.field1493, arg4);
            }
            return method2451(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, 0, arg3, arg2, this, this.field1493, arg4);
        }
    }

    @ObfuscatedName("dm.ap([IIIII)I")
    public int method2448(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1497 > 0) {
                int var6 = this.field1497 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1497 += arg1;
                if (this.field1493 == -256 && (this.field1507 & 0xFF) == 0) {
                    if (Statics.field1432) {
                        arg1 = method2567(0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, this.field1506, this.field1501, 0, var6, arg2, this);
                    } else {
                        arg1 = method2457(((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, this.field1505, 0, var6, arg2, this);
                    }
                } else if (Statics.field1432) {
                    arg1 = method2462(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, this.field1506, this.field1501, 0, var6, arg2, this, this.field1493, arg4);
                } else {
                    arg1 = method2461(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, this.field1505, 0, var6, arg2, this, this.field1493, arg4);
                }
                this.field1497 -= arg1;
                if (this.field1497 != 0) {
                    return arg1;
                }
                if (!this.method2447()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1493 == -256 && (this.field1507 & 0xFF) == 0) {
                if (Statics.field1432) {
                    return method2563(0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, 0, arg3, arg2, this);
                }
                return method2449(((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, 0, arg3, arg2, this);
            }
            if (Statics.field1432) {
                return method2510(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1498, this.field1499, 0, arg3, arg2, this, this.field1493, arg4);
            }
            return method2527(0, 0, ((class113) this.field1522).field1417, arg0, this.field1507, arg1, this.field1494, 0, arg3, arg2, this, this.field1493, arg4);
        }
    }

    @ObfuscatedName("dm.au()Z")
    public boolean method2447() {
        int var1 = this.field1495;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2509(var1, this.field1504);
            var2 = method2542(var1, this.field1504);
        }
        if (this.field1494 != var1 || this.field1498 != var3 || this.field1499 != var2) {
            if (this.field1494 < var1) {
                this.field1505 = 1;
                this.field1497 = var1 - this.field1494;
            } else if (this.field1494 > var1) {
                this.field1505 = -1;
                this.field1497 = this.field1494 - var1;
            } else {
                this.field1505 = 0;
            }
            if (this.field1498 < var3) {
                this.field1506 = 1;
                if (this.field1497 == 0 || this.field1497 > var3 - this.field1498) {
                    this.field1497 = var3 - this.field1498;
                }
            } else if (this.field1498 > var3) {
                this.field1506 = -1;
                if (this.field1497 == 0 || this.field1497 > this.field1498 - var3) {
                    this.field1497 = this.field1498 - var3;
                }
            } else {
                this.field1506 = 0;
            }
            if (this.field1499 < var2) {
                this.field1501 = 1;
                if (this.field1497 == 0 || this.field1497 > var2 - this.field1499) {
                    this.field1497 = var2 - this.field1499;
                }
            } else if (this.field1499 > var2) {
                this.field1501 = -1;
                if (this.field1497 == 0 || this.field1497 > this.field1499 - var2) {
                    this.field1497 = this.field1499 - var2;
                }
            } else {
                this.field1501 = 0;
            }
            return false;
        } else if (this.field1495 == Integer.MIN_VALUE) {
            this.field1495 = 0;
            this.field1499 = 0;
            this.field1498 = 0;
            this.field1494 = 0;
            this.method3401();
            return true;
        } else {
            this.method2433();
            return false;
        }
    }

    @ObfuscatedName("dm.ax([B[IIIIIIILdm;)I")
    public static int method2498(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1507 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.ad(I[B[IIIIIIIILdm;)I")
    public static int method2464(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1507 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.ai([B[IIIIIIILdm;)I")
    public static int method2449(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1507 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.ay(I[B[IIIIIIIILdm;)I")
    public static int method2563(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1507 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dm.aj(II[B[IIIIIIILdm;II)I")
    public static int method2451(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1507 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.af(II[B[IIIIIIIILdm;II)I")
    public static int method2452(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1507 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.ak(II[B[IIIIIIILdm;II)I")
    public static int method2527(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1507 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.ac(II[B[IIIIIIIILdm;II)I")
    public static int method2510(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1507 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dm.bl([B[IIIIIIIILdm;)I")
    public static int method2455(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1498 += (var14 - arg3) * arg9.field1506;
        arg9.field1499 += (var14 - arg3) * arg9.field1501;
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
        arg9.field1494 = var12 >> 2;
        arg9.field1507 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bc(I[B[IIIIIIIIIILdm;)I")
    public static int method2424(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1494 += (var19 - arg4) * arg12.field1505;
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
        arg12.field1498 = var15 >> 2;
        arg12.field1499 = var16 >> 2;
        arg12.field1507 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bz([B[IIIIIIIILdm;)I")
    public static int method2457(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1498 += (var14 - arg3) * arg9.field1506;
        arg9.field1499 += (var14 - arg3) * arg9.field1501;
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
        arg9.field1494 = var12 >> 2;
        arg9.field1507 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dm.bj(I[B[IIIIIIIIIILdm;)I")
    public static int method2567(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1494 += (var19 - arg4) * arg12.field1505;
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
        arg12.field1498 = var15 >> 2;
        arg12.field1499 = var16 >> 2;
        arg12.field1507 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dm.bh(II[B[IIIIIIIILdm;II)I")
    public static int method2459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1498 -= arg11.field1506 * arg5;
        arg11.field1499 -= arg11.field1501 * arg5;
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
        arg11.field1498 += arg11.field1506 * arg5;
        arg11.field1499 += arg11.field1501 * arg5;
        arg11.field1494 = arg6;
        arg11.field1507 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.bi(II[B[IIIIIIIIIILdm;II)I")
    public static int method2533(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1494 -= arg13.field1505 * arg5;
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
        arg13.field1494 += arg13.field1505 * var27;
        arg13.field1498 = arg6;
        arg13.field1499 = arg7;
        arg13.field1507 = arg4;
        return var27;
    }

    @ObfuscatedName("dm.bg(II[B[IIIIIIIILdm;II)I")
    public static int method2461(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1498 -= arg11.field1506 * arg5;
        arg11.field1499 -= arg11.field1501 * arg5;
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
        arg11.field1498 += arg11.field1506 * arg5;
        arg11.field1499 += arg11.field1501 * arg5;
        arg11.field1494 = arg6;
        arg11.field1507 = arg4;
        return arg5;
    }

    @ObfuscatedName("dm.br(II[B[IIIIIIIIIILdm;II)I")
    public static int method2462(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1494 -= arg13.field1505 * arg5;
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
        arg13.field1494 += arg13.field1505 * var26;
        arg13.field1498 = arg6;
        arg13.field1499 = arg7;
        arg13.field1507 = arg4;
        return var26;
    }
}
