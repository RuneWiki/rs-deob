package deob;

@ObfuscatedName("dy")
public class class123 extends class125 {

    @ObfuscatedName("dy.x")
    public int field1491;

    @ObfuscatedName("dy.m")
    public int field1482;

    @ObfuscatedName("dy.k")
    public int field1483;

    @ObfuscatedName("dy.d")
    public int field1484;

    @ObfuscatedName("dy.v")
    public int field1485;

    @ObfuscatedName("dy.q")
    public int field1490;

    @ObfuscatedName("dy.z")
    public int field1487;

    @ObfuscatedName("dy.t")
    public int field1488;

    @ObfuscatedName("dy.e")
    public int field1489;

    @ObfuscatedName("dy.s")
    public int field1481;

    @ObfuscatedName("dy.p")
    public boolean field1494;

    @ObfuscatedName("dy.n")
    public int field1492;

    @ObfuscatedName("dy.u")
    public int field1486;

    @ObfuscatedName("dy.h")
    public int field1493;

    @ObfuscatedName("dy.g")
    public int field1495;

    @ObfuscatedName("dy.x(II)I")
    public static int method2477(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dy.m(II)I")
    public static int method2422(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dy.ac()I")
    public int method2461() {
        int var1 = this.field1485 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1488 == 0) {
            var2 -= this.field1491 * var2 / (((class113) this.field1510).field1405.length << 8);
        } else if (this.field1488 >= 0) {
            var2 -= this.field1489 * var2 / ((class113) this.field1510).field1405.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class123(class113 arg0, int arg1, int arg2) {
        this.field1510 = arg0;
        this.field1489 = arg0.field1406;
        this.field1481 = arg0.field1404;
        this.field1494 = arg0.field1408;
        this.field1482 = arg1;
        this.field1483 = arg2;
        this.field1484 = 8192;
        this.field1491 = 0;
        this.method2428();
    }

    public class123(class113 arg0, int arg1, int arg2, int arg3) {
        this.field1510 = arg0;
        this.field1489 = arg0.field1406;
        this.field1481 = arg0.field1404;
        this.field1494 = arg0.field1408;
        this.field1482 = arg1;
        this.field1483 = arg2;
        this.field1484 = arg3;
        this.field1491 = 0;
        this.method2428();
    }

    @ObfuscatedName("dy.k(Ldm;II)Ldy;")
    public static class123 method2424(class113 arg0, int arg1, int arg2) {
        return arg0.field1405 == null || arg0.field1405.length == 0 ? null : new class123(arg0, (int) ((long) arg0.field1407 * 256L * (long) arg1 / (long) (Statics.field1422 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dy.d(Ldm;III)Ldy;")
    public static class123 method2450(class113 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1405 == null || arg0.field1405.length == 0 ? null : new class123(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dy.w()V")
    public void method2428() {
        this.field1485 = this.field1483;
        this.field1490 = method2477(this.field1483, this.field1484);
        this.field1487 = method2422(this.field1483, this.field1484);
    }

    @ObfuscatedName("dy.e(I)V")
    public synchronized void method2454(int arg0) {
        this.field1488 = arg0;
    }

    @ObfuscatedName("dy.p(I)V")
    public synchronized void method2429(int arg0) {
        this.method2431(arg0 << 6, this.method2433());
    }

    @ObfuscatedName("dy.n(I)V")
    public synchronized void method2447(int arg0) {
        this.method2431(arg0, this.method2433());
    }

    @ObfuscatedName("dy.u(II)V")
    public synchronized void method2431(int arg0, int arg1) {
        this.field1483 = arg0;
        this.field1484 = arg1;
        this.field1492 = 0;
        this.method2428();
    }

    @ObfuscatedName("dy.h()I")
    public synchronized int method2432() {
        return this.field1483 == Integer.MIN_VALUE ? 0 : this.field1483;
    }

    @ObfuscatedName("dy.g()I")
    public synchronized int method2433() {
        return this.field1484 < 0 ? -1 : this.field1484;
    }

    @ObfuscatedName("dy.i(I)V")
    public synchronized void method2434(int arg0) {
        int var2 = ((class113) this.field1510).field1405.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1491 = arg0;
    }

    @ObfuscatedName("dy.a(Z)V")
    public synchronized void method2425(boolean arg0) {
        this.field1482 = (this.field1482 >>> 31) + (this.field1482 ^ this.field1482 >> 31);
        if (arg0) {
            this.field1482 = -this.field1482;
        }
    }

    @ObfuscatedName("dy.o()V")
    public void method2549() {
        if (this.field1492 == 0) {
            return;
        }
        if (this.field1483 == Integer.MIN_VALUE) {
            this.field1483 = 0;
        }
        this.field1492 = 0;
        this.method2428();
    }

    @ObfuscatedName("dy.c(II)V")
    public synchronized void method2436(int arg0, int arg1) {
        this.method2462(arg0, arg1, this.method2433());
    }

    @ObfuscatedName("dy.f(III)V")
    public synchronized void method2462(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2431(arg1, arg2);
            return;
        }
        int var4 = method2477(arg1, arg2);
        int var5 = method2422(arg1, arg2);
        if (this.field1490 == var4 && this.field1487 == var5) {
            this.field1492 = 0;
            return;
        }
        int var6 = arg1 - this.field1485;
        if (this.field1485 - arg1 > var6) {
            var6 = this.field1485 - arg1;
        }
        if (var4 - this.field1490 > var6) {
            var6 = var4 - this.field1490;
        }
        if (this.field1490 - var4 > var6) {
            var6 = this.field1490 - var4;
        }
        if (var5 - this.field1487 > var6) {
            var6 = var5 - this.field1487;
        }
        if (this.field1487 - var5 > var6) {
            var6 = this.field1487 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1492 = arg0;
        this.field1483 = arg1;
        this.field1484 = arg2;
        this.field1486 = (arg1 - this.field1485) / arg0;
        this.field1493 = (var4 - this.field1490) / arg0;
        this.field1495 = (var5 - this.field1487) / arg0;
    }

    @ObfuscatedName("dy.ae(I)V")
    public synchronized void method2463(int arg0) {
        if (arg0 == 0) {
            this.method2447(0);
            this.method3355();
        } else if (this.field1490 == 0 && this.field1487 == 0) {
            this.field1492 = 0;
            this.field1483 = 0;
            this.field1485 = 0;
            this.method3355();
        } else {
            int var2 = -this.field1485;
            if (this.field1485 > var2) {
                var2 = this.field1485;
            }
            if (-this.field1490 > var2) {
                var2 = -this.field1490;
            }
            if (this.field1490 > var2) {
                var2 = this.field1490;
            }
            if (-this.field1487 > var2) {
                var2 = -this.field1487;
            }
            if (this.field1487 > var2) {
                var2 = this.field1487;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1492 = arg0;
            this.field1483 = Integer.MIN_VALUE;
            this.field1486 = -this.field1485 / arg0;
            this.field1493 = -this.field1490 / arg0;
            this.field1495 = -this.field1487 / arg0;
        }
    }

    @ObfuscatedName("dy.an(I)V")
    public synchronized void method2439(int arg0) {
        if (this.field1482 < 0) {
            this.field1482 = -arg0;
        } else {
            this.field1482 = arg0;
        }
    }

    @ObfuscatedName("dy.ai()I")
    public synchronized int method2440() {
        return this.field1482 < 0 ? -this.field1482 : this.field1482;
    }

    @ObfuscatedName("dy.ap()Z")
    public boolean method2441() {
        return this.field1491 < 0 || this.field1491 >= ((class113) this.field1510).field1405.length << 8;
    }

    @ObfuscatedName("dy.av()Z")
    public boolean method2442() {
        return this.field1492 != 0;
    }

    @ObfuscatedName("dy.v()Lds;")
    public class125 method2200() {
        return null;
    }

    @ObfuscatedName("dy.q()Lds;")
    public class125 method2201() {
        return null;
    }

    @ObfuscatedName("dy.z()I")
    public int method2202() {
        return this.field1483 == 0 && this.field1492 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dy.t([III)V")
    public synchronized void method2203(int[] arg0, int arg1, int arg2) {
        if (this.field1483 == 0 && this.field1492 == 0) {
            this.method2205(arg2);
            return;
        }
        class113 var4 = (class113) this.field1510;
        int var5 = this.field1489 << 8;
        int var6 = this.field1481 << 8;
        int var7 = var4.field1405.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1488 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1491 < 0) {
            if (this.field1482 <= 0) {
                this.method2549();
                this.method3355();
                return;
            }
            this.field1491 = 0;
        }
        if (this.field1491 >= var7) {
            if (this.field1482 >= 0) {
                this.method2549();
                this.method3355();
                return;
            }
            this.field1491 = var7 - 1;
        }
        if (this.field1488 >= 0) {
            if (this.field1488 > 0) {
                if (this.field1494) {
                    label131: {
                        if (this.field1482 < 0) {
                            var9 = this.method2444(arg0, arg1, var5, var10, var4.field1405[this.field1489]);
                            if (this.field1491 >= var5) {
                                return;
                            }
                            this.field1491 = var5 + var5 - 1 - this.field1491;
                            this.field1482 = -this.field1482;
                            if (--this.field1488 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2443(arg0, var9, var6, var10, var4.field1405[this.field1481 - 1]);
                            if (this.field1491 < var6) {
                                return;
                            }
                            this.field1491 = var6 + var6 - 1 - this.field1491;
                            this.field1482 = -this.field1482;
                            if (--this.field1488 == 0) {
                                break;
                            }
                            var9 = this.method2444(arg0, var9, var5, var10, var4.field1405[this.field1489]);
                            if (this.field1491 >= var5) {
                                return;
                            }
                            this.field1491 = var5 + var5 - 1 - this.field1491;
                            this.field1482 = -this.field1482;
                        } while (--this.field1488 != 0);
                    }
                } else if (this.field1482 < 0) {
                    while (true) {
                        var9 = this.method2444(arg0, var9, var5, var10, var4.field1405[this.field1481 - 1]);
                        if (this.field1491 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1491) / var8;
                        if (var12 >= this.field1488) {
                            this.field1491 += this.field1488 * var8;
                            this.field1488 = 0;
                            break;
                        }
                        this.field1491 += var8 * var12;
                        this.field1488 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2443(arg0, var9, var6, var10, var4.field1405[this.field1489]);
                        if (this.field1491 < var6) {
                            return;
                        }
                        int var13 = (this.field1491 - var5) / var8;
                        if (var13 >= this.field1488) {
                            this.field1491 -= this.field1488 * var8;
                            this.field1488 = 0;
                            break;
                        }
                        this.field1491 -= var8 * var13;
                        this.field1488 -= var13;
                    }
                }
            }
            if (this.field1482 < 0) {
                this.method2444(arg0, var9, 0, var10, 0);
                if (this.field1491 < 0) {
                    this.field1491 = -1;
                    this.method2549();
                    this.method3355();
                }
            } else {
                this.method2443(arg0, var9, var7, var10, 0);
                if (this.field1491 >= var7) {
                    this.field1491 = var7;
                    this.method2549();
                    this.method3355();
                }
            }
        } else if (this.field1494) {
            if (this.field1482 < 0) {
                var9 = this.method2444(arg0, arg1, var5, var10, var4.field1405[this.field1489]);
                if (this.field1491 >= var5) {
                    return;
                }
                this.field1491 = var5 + var5 - 1 - this.field1491;
                this.field1482 = -this.field1482;
            }
            while (true) {
                int var11 = this.method2443(arg0, var9, var6, var10, var4.field1405[this.field1481 - 1]);
                if (this.field1491 < var6) {
                    return;
                }
                this.field1491 = var6 + var6 - 1 - this.field1491;
                this.field1482 = -this.field1482;
                var9 = this.method2444(arg0, var11, var5, var10, var4.field1405[this.field1489]);
                if (this.field1491 >= var5) {
                    return;
                }
                this.field1491 = var5 + var5 - 1 - this.field1491;
                this.field1482 = -this.field1482;
            }
        } else if (this.field1482 < 0) {
            while (true) {
                var9 = this.method2444(arg0, var9, var5, var10, var4.field1405[this.field1481 - 1]);
                if (this.field1491 >= var5) {
                    return;
                }
                this.field1491 = var6 - 1 - (var6 - 1 - this.field1491) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2443(arg0, var9, var6, var10, var4.field1405[this.field1489]);
                if (this.field1491 < var6) {
                    return;
                }
                this.field1491 = (this.field1491 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dy.s(I)V")
    public synchronized void method2205(int arg0) {
        if (this.field1492 > 0) {
            if (arg0 >= this.field1492) {
                if (this.field1483 == Integer.MIN_VALUE) {
                    this.field1483 = 0;
                    this.field1487 = 0;
                    this.field1490 = 0;
                    this.field1485 = 0;
                    this.method3355();
                    arg0 = this.field1492;
                }
                this.field1492 = 0;
                this.method2428();
            } else {
                this.field1485 += this.field1486 * arg0;
                this.field1490 += this.field1493 * arg0;
                this.field1487 += this.field1495 * arg0;
                this.field1492 -= arg0;
            }
        }
        class113 var2 = (class113) this.field1510;
        int var3 = this.field1489 << 8;
        int var4 = this.field1481 << 8;
        int var5 = var2.field1405.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1488 = 0;
        }
        if (this.field1491 < 0) {
            if (this.field1482 <= 0) {
                this.method2549();
                this.method3355();
                return;
            }
            this.field1491 = 0;
        }
        if (this.field1491 >= var5) {
            if (this.field1482 >= 0) {
                this.method2549();
                this.method3355();
                return;
            }
            this.field1491 = var5 - 1;
        }
        this.field1491 += this.field1482 * arg0;
        if (this.field1488 >= 0) {
            if (this.field1488 > 0) {
                if (this.field1494) {
                    label121: {
                        if (this.field1482 < 0) {
                            if (this.field1491 >= var3) {
                                return;
                            }
                            this.field1491 = var3 + var3 - 1 - this.field1491;
                            this.field1482 = -this.field1482;
                            if (--this.field1488 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1491 < var4) {
                                return;
                            }
                            this.field1491 = var4 + var4 - 1 - this.field1491;
                            this.field1482 = -this.field1482;
                            if (--this.field1488 == 0) {
                                break;
                            }
                            if (this.field1491 >= var3) {
                                return;
                            }
                            this.field1491 = var3 + var3 - 1 - this.field1491;
                            this.field1482 = -this.field1482;
                        } while (--this.field1488 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1482 < 0) {
                            if (this.field1491 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1491) / var6;
                            if (var7 >= this.field1488) {
                                this.field1491 += this.field1488 * var6;
                                this.field1488 = 0;
                                break label153;
                            }
                            this.field1491 += var6 * var7;
                            this.field1488 -= var7;
                        } else if (this.field1491 >= var4) {
                            int var8 = (this.field1491 - var3) / var6;
                            if (var8 >= this.field1488) {
                                this.field1491 -= this.field1488 * var6;
                                this.field1488 = 0;
                                break label153;
                            }
                            this.field1491 -= var6 * var8;
                            this.field1488 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1482 < 0) {
                if (this.field1491 < 0) {
                    this.field1491 = -1;
                    this.method2549();
                    this.method3355();
                }
            } else if (this.field1491 >= var5) {
                this.field1491 = var5;
                this.method2549();
                this.method3355();
            }
        } else if (this.field1494) {
            if (this.field1482 < 0) {
                if (this.field1491 >= var3) {
                    return;
                }
                this.field1491 = var3 + var3 - 1 - this.field1491;
                this.field1482 = -this.field1482;
            }
            while (this.field1491 >= var4) {
                this.field1491 = var4 + var4 - 1 - this.field1491;
                this.field1482 = -this.field1482;
                if (this.field1491 >= var3) {
                    return;
                }
                this.field1491 = var3 + var3 - 1 - this.field1491;
                this.field1482 = -this.field1482;
            }
        } else if (this.field1482 < 0) {
            if (this.field1491 >= var3) {
                return;
            }
            this.field1491 = var4 - 1 - (var4 - 1 - this.field1491) % var6;
        } else if (this.field1491 >= var4) {
            this.field1491 = (this.field1491 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dy.ak([IIIII)I")
    public int method2443(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1492 > 0) {
                int var6 = this.field1492 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1492 += arg1;
                if (this.field1482 == 256 && (this.field1491 & 0xFF) == 0) {
                    if (Statics.field1438) {
                        arg1 = method2509(0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, this.field1493, this.field1495, 0, var6, arg2, this);
                    } else {
                        arg1 = method2467(((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, this.field1486, 0, var6, arg2, this);
                    }
                } else if (Statics.field1438) {
                    arg1 = method2459(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, this.field1493, this.field1495, 0, var6, arg2, this, this.field1482, arg4);
                } else {
                    arg1 = method2458(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, this.field1486, 0, var6, arg2, this, this.field1482, arg4);
                }
                this.field1492 -= arg1;
                if (this.field1492 != 0) {
                    return arg1;
                }
                if (!this.method2541()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1482 == 256 && (this.field1491 & 0xFF) == 0) {
                if (Statics.field1438) {
                    return method2474(0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, 0, arg3, arg2, this);
                }
                return method2455(((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, 0, arg3, arg2, this);
            }
            if (Statics.field1438) {
                return method2451(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, 0, arg3, arg2, this, this.field1482, arg4);
            }
            return method2456(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, 0, arg3, arg2, this, this.field1482, arg4);
        }
    }

    @ObfuscatedName("dy.aa([IIIII)I")
    public int method2444(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1492 > 0) {
                int var6 = this.field1492 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1492 += arg1;
                if (this.field1482 == -256 && (this.field1491 & 0xFF) == 0) {
                    if (Statics.field1438) {
                        arg1 = method2475(0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, this.field1493, this.field1495, 0, var6, arg2, this);
                    } else {
                        arg1 = method2448(((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, this.field1486, 0, var6, arg2, this);
                    }
                } else if (Statics.field1438) {
                    arg1 = method2536(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, this.field1493, this.field1495, 0, var6, arg2, this, this.field1482, arg4);
                } else {
                    arg1 = method2494(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, this.field1486, 0, var6, arg2, this, this.field1482, arg4);
                }
                this.field1492 -= arg1;
                if (this.field1492 != 0) {
                    return arg1;
                }
                if (!this.method2541()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1482 == -256 && (this.field1491 & 0xFF) == 0) {
                if (Statics.field1438) {
                    return method2504(0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, 0, arg3, arg2, this);
                }
                return method2446(((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, 0, arg3, arg2, this);
            }
            if (Statics.field1438) {
                return method2453(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1490, this.field1487, 0, arg3, arg2, this, this.field1482, arg4);
            }
            return method2452(0, 0, ((class113) this.field1510).field1405, arg0, this.field1491, arg1, this.field1485, 0, arg3, arg2, this, this.field1482, arg4);
        }
    }

    @ObfuscatedName("dy.ax()Z")
    public boolean method2541() {
        int var1 = this.field1483;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2477(var1, this.field1484);
            var2 = method2422(var1, this.field1484);
        }
        if (this.field1485 != var1 || this.field1490 != var3 || this.field1487 != var2) {
            if (this.field1485 < var1) {
                this.field1486 = 1;
                this.field1492 = var1 - this.field1485;
            } else if (this.field1485 > var1) {
                this.field1486 = -1;
                this.field1492 = this.field1485 - var1;
            } else {
                this.field1486 = 0;
            }
            if (this.field1490 < var3) {
                this.field1493 = 1;
                if (this.field1492 == 0 || this.field1492 > var3 - this.field1490) {
                    this.field1492 = var3 - this.field1490;
                }
            } else if (this.field1490 > var3) {
                this.field1493 = -1;
                if (this.field1492 == 0 || this.field1492 > this.field1490 - var3) {
                    this.field1492 = this.field1490 - var3;
                }
            } else {
                this.field1493 = 0;
            }
            if (this.field1487 < var2) {
                this.field1495 = 1;
                if (this.field1492 == 0 || this.field1492 > var2 - this.field1487) {
                    this.field1492 = var2 - this.field1487;
                }
            } else if (this.field1487 > var2) {
                this.field1495 = -1;
                if (this.field1492 == 0 || this.field1492 > this.field1487 - var2) {
                    this.field1492 = this.field1487 - var2;
                }
            } else {
                this.field1495 = 0;
            }
            return false;
        } else if (this.field1483 == Integer.MIN_VALUE) {
            this.field1483 = 0;
            this.field1487 = 0;
            this.field1490 = 0;
            this.field1485 = 0;
            this.method3355();
            return true;
        } else {
            this.method2428();
            return false;
        }
    }

    @ObfuscatedName("dy.az([B[IIIIIIILdy;)I")
    public static int method2455(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1491 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dy.ay(I[B[IIIIIIIILdy;)I")
    public static int method2474(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1491 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dy.ad([B[IIIIIIILdy;)I")
    public static int method2446(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1491 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dy.ah(I[B[IIIIIIIILdy;)I")
    public static int method2504(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1491 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dy.ag(II[B[IIIIIIILdy;II)I")
    public static int method2456(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1491 = arg4;
        return arg5;
    }

    @ObfuscatedName("dy.aw(II[B[IIIIIIIILdy;II)I")
    public static int method2451(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1491 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dy.bf(II[B[IIIIIIILdy;II)I")
    public static int method2452(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1491 = arg4;
        return arg5;
    }

    @ObfuscatedName("dy.bc(II[B[IIIIIIIILdy;II)I")
    public static int method2453(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1491 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dy.bo([B[IIIIIIIILdy;)I")
    public static int method2467(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1490 += (var14 - arg3) * arg9.field1493;
        arg9.field1487 += (var14 - arg3) * arg9.field1495;
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
        arg9.field1485 = var12 >> 2;
        arg9.field1491 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dy.bd(I[B[IIIIIIIIIILdy;)I")
    public static int method2509(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1485 += (var19 - arg4) * arg12.field1486;
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
        arg12.field1490 = var15 >> 2;
        arg12.field1487 = var16 >> 2;
        arg12.field1491 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dy.bk([B[IIIIIIIILdy;)I")
    public static int method2448(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1490 += (var14 - arg3) * arg9.field1493;
        arg9.field1487 += (var14 - arg3) * arg9.field1495;
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
        arg9.field1485 = var12 >> 2;
        arg9.field1491 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dy.bu(I[B[IIIIIIIIIILdy;)I")
    public static int method2475(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1485 += (var19 - arg4) * arg12.field1486;
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
        arg12.field1490 = var15 >> 2;
        arg12.field1487 = var16 >> 2;
        arg12.field1491 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dy.be(II[B[IIIIIIIILdy;II)I")
    public static int method2458(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1490 -= arg11.field1493 * arg5;
        arg11.field1487 -= arg11.field1495 * arg5;
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
        arg11.field1490 += arg11.field1493 * arg5;
        arg11.field1487 += arg11.field1495 * arg5;
        arg11.field1485 = arg6;
        arg11.field1491 = arg4;
        return arg5;
    }

    @ObfuscatedName("dy.bg(II[B[IIIIIIIIIILdy;II)I")
    public static int method2459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1485 -= arg13.field1486 * arg5;
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
        arg13.field1485 += arg13.field1486 * var27;
        arg13.field1490 = arg6;
        arg13.field1487 = arg7;
        arg13.field1491 = arg4;
        return var27;
    }

    @ObfuscatedName("dy.bt(II[B[IIIIIIIILdy;II)I")
    public static int method2494(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1490 -= arg11.field1493 * arg5;
        arg11.field1487 -= arg11.field1495 * arg5;
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
        arg11.field1490 += arg11.field1493 * arg5;
        arg11.field1487 += arg11.field1495 * arg5;
        arg11.field1485 = arg6;
        arg11.field1491 = arg4;
        return arg5;
    }

    @ObfuscatedName("dy.bh(II[B[IIIIIIIIIILdy;II)I")
    public static int method2536(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1485 -= arg13.field1486 * arg5;
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
        arg13.field1485 += arg13.field1486 * var26;
        arg13.field1490 = arg6;
        arg13.field1487 = arg7;
        arg13.field1491 = arg4;
        return var26;
    }
}
