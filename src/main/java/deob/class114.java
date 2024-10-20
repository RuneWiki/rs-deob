package deob;

@ObfuscatedName("dh")
public class class114 extends class116 {

    @ObfuscatedName("dh.q")
    public int field1472;

    @ObfuscatedName("dh.e")
    public int field1470;

    @ObfuscatedName("dh.p")
    public int field1471;

    @ObfuscatedName("dh.k")
    public int field1476;

    @ObfuscatedName("dh.l")
    public int field1473;

    @ObfuscatedName("dh.b")
    public int field1483;

    @ObfuscatedName("dh.i")
    public int field1475;

    @ObfuscatedName("dh.c")
    public int field1478;

    @ObfuscatedName("dh.f")
    public int field1477;

    @ObfuscatedName("dh.m")
    public int field1474;

    @ObfuscatedName("dh.u")
    public boolean field1479;

    @ObfuscatedName("dh.x")
    public int field1480;

    @ObfuscatedName("dh.r")
    public int field1481;

    @ObfuscatedName("dh.v")
    public int field1482;

    @ObfuscatedName("dh.y")
    public int field1469;

    @ObfuscatedName("dh.q(II)I")
    public static int method2306(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dh.w(II)I")
    public static int method2299(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dh.ay()I")
    public int method2300() {
        int var1 = this.field1473 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1478 == 0) {
            var2 -= this.field1472 * var2 / (((class104) this.field1498).field1391.length << 8);
        } else if (this.field1478 >= 0) {
            var2 -= this.field1477 * var2 / ((class104) this.field1498).field1391.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class114(class104 arg0, int arg1, int arg2) {
        this.field1498 = arg0;
        this.field1477 = arg0.field1392;
        this.field1474 = arg0.field1393;
        this.field1479 = arg0.field1394;
        this.field1470 = arg1;
        this.field1471 = arg2;
        this.field1476 = 8192;
        this.field1472 = 0;
        this.method2305();
    }

    public class114(class104 arg0, int arg1, int arg2, int arg3) {
        this.field1498 = arg0;
        this.field1477 = arg0.field1392;
        this.field1474 = arg0.field1393;
        this.field1479 = arg0.field1394;
        this.field1470 = arg1;
        this.field1471 = arg2;
        this.field1476 = arg3;
        this.field1472 = 0;
        this.method2305();
    }

    @ObfuscatedName("dh.e(Lcd;II)Ldh;")
    public static class114 method2309(class104 arg0, int arg1, int arg2) {
        return arg0.field1391 == null || arg0.field1391.length == 0 ? null : new class114(arg0, (int) ((long) arg0.field1390 * 256L * (long) arg1 / (long) (Statics.field2079 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dh.p(Lcd;III)Ldh;")
    public static class114 method2304(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1391 == null || arg0.field1391.length == 0 ? null : new class114(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dh.k()V")
    public void method2305() {
        this.field1473 = this.field1471;
        this.field1483 = method2306(this.field1471, this.field1476);
        this.field1475 = method2299(this.field1471, this.field1476);
    }

    @ObfuscatedName("dh.u(I)V")
    public synchronized void method2393(int arg0) {
        this.field1478 = arg0;
    }

    @ObfuscatedName("dh.r(I)V")
    public synchronized void method2307(int arg0) {
        this.method2367(arg0 << 6, this.method2320());
    }

    @ObfuscatedName("dh.v(I)V")
    public synchronized void method2374(int arg0) {
        this.method2367(arg0, this.method2320());
    }

    @ObfuscatedName("dh.y(II)V")
    public synchronized void method2367(int arg0, int arg1) {
        this.field1471 = arg0;
        this.field1476 = arg1;
        this.field1480 = 0;
        this.method2305();
    }

    @ObfuscatedName("dh.g()I")
    public synchronized int method2311() {
        return this.field1471 == Integer.MIN_VALUE ? 0 : this.field1471;
    }

    @ObfuscatedName("dh.a()I")
    public synchronized int method2320() {
        return this.field1476 < 0 ? -1 : this.field1476;
    }

    @ObfuscatedName("dh.j(I)V")
    public synchronized void method2363(int arg0) {
        int var2 = ((class104) this.field1498).field1391.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1472 = arg0;
    }

    @ObfuscatedName("dh.o(Z)V")
    public synchronized void method2381(boolean arg0) {
        this.field1470 = (this.field1470 >>> 31) + (this.field1470 ^ this.field1470 >> 31);
        if (arg0) {
            this.field1470 = -this.field1470;
        }
    }

    @ObfuscatedName("dh.d()V")
    public void method2413() {
        if (this.field1480 == 0) {
            return;
        }
        if (this.field1471 == Integer.MIN_VALUE) {
            this.field1471 = 0;
        }
        this.field1480 = 0;
        this.method2305();
    }

    @ObfuscatedName("dh.s(II)V")
    public synchronized void method2314(int arg0, int arg1) {
        this.method2315(arg0, arg1, this.method2320());
    }

    @ObfuscatedName("dh.z(III)V")
    public synchronized void method2315(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2367(arg1, arg2);
            return;
        }
        int var4 = method2306(arg1, arg2);
        int var5 = method2299(arg1, arg2);
        if (this.field1483 == var4 && this.field1475 == var5) {
            this.field1480 = 0;
            return;
        }
        int var6 = arg1 - this.field1473;
        if (this.field1473 - arg1 > var6) {
            var6 = this.field1473 - arg1;
        }
        if (var4 - this.field1483 > var6) {
            var6 = var4 - this.field1483;
        }
        if (this.field1483 - var4 > var6) {
            var6 = this.field1483 - var4;
        }
        if (var5 - this.field1475 > var6) {
            var6 = var5 - this.field1475;
        }
        if (this.field1475 - var5 > var6) {
            var6 = this.field1475 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1480 = arg0;
        this.field1471 = arg1;
        this.field1476 = arg2;
        this.field1481 = (arg1 - this.field1473) / arg0;
        this.field1482 = (var4 - this.field1483) / arg0;
        this.field1469 = (var5 - this.field1475) / arg0;
    }

    @ObfuscatedName("dh.al(I)V")
    public synchronized void method2319(int arg0) {
        if (arg0 == 0) {
            this.method2374(0);
            this.method3286();
        } else if (this.field1483 == 0 && this.field1475 == 0) {
            this.field1480 = 0;
            this.field1471 = 0;
            this.field1473 = 0;
            this.method3286();
        } else {
            int var2 = -this.field1473;
            if (this.field1473 > var2) {
                var2 = this.field1473;
            }
            if (-this.field1483 > var2) {
                var2 = -this.field1483;
            }
            if (this.field1483 > var2) {
                var2 = this.field1483;
            }
            if (-this.field1475 > var2) {
                var2 = -this.field1475;
            }
            if (this.field1475 > var2) {
                var2 = this.field1475;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1480 = arg0;
            this.field1471 = Integer.MIN_VALUE;
            this.field1481 = -this.field1473 / arg0;
            this.field1482 = -this.field1483 / arg0;
            this.field1469 = -this.field1475 / arg0;
        }
    }

    @ObfuscatedName("dh.av(I)V")
    public synchronized void method2317(int arg0) {
        if (this.field1470 < 0) {
            this.field1470 = -arg0;
        } else {
            this.field1470 = arg0;
        }
    }

    @ObfuscatedName("dh.as()I")
    public synchronized int method2318() {
        return this.field1470 < 0 ? -this.field1470 : this.field1470;
    }

    @ObfuscatedName("dh.aw()Z")
    public boolean method2333() {
        return this.field1472 < 0 || this.field1472 >= ((class104) this.field1498).field1391.length << 8;
    }

    @ObfuscatedName("dh.ad()Z")
    public boolean method2352() {
        return this.field1480 != 0;
    }

    @ObfuscatedName("dh.l()Ldx;")
    public class116 method2079() {
        return null;
    }

    @ObfuscatedName("dh.b()Ldx;")
    public class116 method2080() {
        return null;
    }

    @ObfuscatedName("dh.i()I")
    public int method2081() {
        return this.field1471 == 0 && this.field1480 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dh.c([III)V")
    public synchronized void method2082(int[] arg0, int arg1, int arg2) {
        if (this.field1471 == 0 && this.field1480 == 0) {
            this.method2084(arg2);
            return;
        }
        class104 var4 = (class104) this.field1498;
        int var5 = this.field1477 << 8;
        int var6 = this.field1474 << 8;
        int var7 = var4.field1391.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1478 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1472 < 0) {
            if (this.field1470 <= 0) {
                this.method2413();
                this.method3286();
                return;
            }
            this.field1472 = 0;
        }
        if (this.field1472 >= var7) {
            if (this.field1470 >= 0) {
                this.method2413();
                this.method3286();
                return;
            }
            this.field1472 = var7 - 1;
        }
        if (this.field1478 >= 0) {
            if (this.field1478 > 0) {
                if (this.field1479) {
                    label131: {
                        if (this.field1470 < 0) {
                            var9 = this.method2408(arg0, arg1, var5, var10, var4.field1391[this.field1477]);
                            if (this.field1472 >= var5) {
                                return;
                            }
                            this.field1472 = var5 + var5 - 1 - this.field1472;
                            this.field1470 = -this.field1470;
                            if (--this.field1478 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2321(arg0, var9, var6, var10, var4.field1391[this.field1474 - 1]);
                            if (this.field1472 < var6) {
                                return;
                            }
                            this.field1472 = var6 + var6 - 1 - this.field1472;
                            this.field1470 = -this.field1470;
                            if (--this.field1478 == 0) {
                                break;
                            }
                            var9 = this.method2408(arg0, var9, var5, var10, var4.field1391[this.field1477]);
                            if (this.field1472 >= var5) {
                                return;
                            }
                            this.field1472 = var5 + var5 - 1 - this.field1472;
                            this.field1470 = -this.field1470;
                        } while (--this.field1478 != 0);
                    }
                } else if (this.field1470 < 0) {
                    while (true) {
                        var9 = this.method2408(arg0, var9, var5, var10, var4.field1391[this.field1474 - 1]);
                        if (this.field1472 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1472) / var8;
                        if (var12 >= this.field1478) {
                            this.field1472 += this.field1478 * var8;
                            this.field1478 = 0;
                            break;
                        }
                        this.field1472 += var8 * var12;
                        this.field1478 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2321(arg0, var9, var6, var10, var4.field1391[this.field1477]);
                        if (this.field1472 < var6) {
                            return;
                        }
                        int var13 = (this.field1472 - var5) / var8;
                        if (var13 >= this.field1478) {
                            this.field1472 -= this.field1478 * var8;
                            this.field1478 = 0;
                            break;
                        }
                        this.field1472 -= var8 * var13;
                        this.field1478 -= var13;
                    }
                }
            }
            if (this.field1470 < 0) {
                this.method2408(arg0, var9, 0, var10, 0);
                if (this.field1472 < 0) {
                    this.field1472 = -1;
                    this.method2413();
                    this.method3286();
                }
            } else {
                this.method2321(arg0, var9, var7, var10, 0);
                if (this.field1472 >= var7) {
                    this.field1472 = var7;
                    this.method2413();
                    this.method3286();
                }
            }
        } else if (this.field1479) {
            if (this.field1470 < 0) {
                var9 = this.method2408(arg0, arg1, var5, var10, var4.field1391[this.field1477]);
                if (this.field1472 >= var5) {
                    return;
                }
                this.field1472 = var5 + var5 - 1 - this.field1472;
                this.field1470 = -this.field1470;
            }
            while (true) {
                int var11 = this.method2321(arg0, var9, var6, var10, var4.field1391[this.field1474 - 1]);
                if (this.field1472 < var6) {
                    return;
                }
                this.field1472 = var6 + var6 - 1 - this.field1472;
                this.field1470 = -this.field1470;
                var9 = this.method2408(arg0, var11, var5, var10, var4.field1391[this.field1477]);
                if (this.field1472 >= var5) {
                    return;
                }
                this.field1472 = var5 + var5 - 1 - this.field1472;
                this.field1470 = -this.field1470;
            }
        } else if (this.field1470 < 0) {
            while (true) {
                var9 = this.method2408(arg0, var9, var5, var10, var4.field1391[this.field1474 - 1]);
                if (this.field1472 >= var5) {
                    return;
                }
                this.field1472 = var6 - 1 - (var6 - 1 - this.field1472) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2321(arg0, var9, var6, var10, var4.field1391[this.field1477]);
                if (this.field1472 < var6) {
                    return;
                }
                this.field1472 = (this.field1472 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dh.x(I)V")
    public synchronized void method2084(int arg0) {
        if (this.field1480 > 0) {
            if (arg0 >= this.field1480) {
                if (this.field1471 == Integer.MIN_VALUE) {
                    this.field1471 = 0;
                    this.field1475 = 0;
                    this.field1483 = 0;
                    this.field1473 = 0;
                    this.method3286();
                    arg0 = this.field1480;
                }
                this.field1480 = 0;
                this.method2305();
            } else {
                this.field1473 += this.field1481 * arg0;
                this.field1483 += this.field1482 * arg0;
                this.field1475 += this.field1469 * arg0;
                this.field1480 -= arg0;
            }
        }
        class104 var2 = (class104) this.field1498;
        int var3 = this.field1477 << 8;
        int var4 = this.field1474 << 8;
        int var5 = var2.field1391.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1478 = 0;
        }
        if (this.field1472 < 0) {
            if (this.field1470 <= 0) {
                this.method2413();
                this.method3286();
                return;
            }
            this.field1472 = 0;
        }
        if (this.field1472 >= var5) {
            if (this.field1470 >= 0) {
                this.method2413();
                this.method3286();
                return;
            }
            this.field1472 = var5 - 1;
        }
        this.field1472 += this.field1470 * arg0;
        if (this.field1478 >= 0) {
            if (this.field1478 > 0) {
                if (this.field1479) {
                    label121: {
                        if (this.field1470 < 0) {
                            if (this.field1472 >= var3) {
                                return;
                            }
                            this.field1472 = var3 + var3 - 1 - this.field1472;
                            this.field1470 = -this.field1470;
                            if (--this.field1478 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1472 < var4) {
                                return;
                            }
                            this.field1472 = var4 + var4 - 1 - this.field1472;
                            this.field1470 = -this.field1470;
                            if (--this.field1478 == 0) {
                                break;
                            }
                            if (this.field1472 >= var3) {
                                return;
                            }
                            this.field1472 = var3 + var3 - 1 - this.field1472;
                            this.field1470 = -this.field1470;
                        } while (--this.field1478 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1470 < 0) {
                            if (this.field1472 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1472) / var6;
                            if (var7 >= this.field1478) {
                                this.field1472 += this.field1478 * var6;
                                this.field1478 = 0;
                                break label153;
                            }
                            this.field1472 += var6 * var7;
                            this.field1478 -= var7;
                        } else if (this.field1472 >= var4) {
                            int var8 = (this.field1472 - var3) / var6;
                            if (var8 >= this.field1478) {
                                this.field1472 -= this.field1478 * var6;
                                this.field1478 = 0;
                                break label153;
                            }
                            this.field1472 -= var6 * var8;
                            this.field1478 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1470 < 0) {
                if (this.field1472 < 0) {
                    this.field1472 = -1;
                    this.method2413();
                    this.method3286();
                }
            } else if (this.field1472 >= var5) {
                this.field1472 = var5;
                this.method2413();
                this.method3286();
            }
        } else if (this.field1479) {
            if (this.field1470 < 0) {
                if (this.field1472 >= var3) {
                    return;
                }
                this.field1472 = var3 + var3 - 1 - this.field1472;
                this.field1470 = -this.field1470;
            }
            while (this.field1472 >= var4) {
                this.field1472 = var4 + var4 - 1 - this.field1472;
                this.field1470 = -this.field1470;
                if (this.field1472 >= var3) {
                    return;
                }
                this.field1472 = var3 + var3 - 1 - this.field1472;
                this.field1470 = -this.field1470;
            }
        } else if (this.field1470 < 0) {
            if (this.field1472 >= var3) {
                return;
            }
            this.field1472 = var4 - 1 - (var4 - 1 - this.field1472) % var6;
        } else if (this.field1472 >= var4) {
            this.field1472 = (this.field1472 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dh.ag([IIIII)I")
    public int method2321(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1480 > 0) {
                int var6 = this.field1480 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1480 += arg1;
                if (this.field1470 == 256 && (this.field1472 & 0xFF) == 0) {
                    if (Statics.field2054) {
                        arg1 = method2334(0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, this.field1482, this.field1469, 0, var6, arg2, this);
                    } else {
                        arg1 = method2353(((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, this.field1481, 0, var6, arg2, this);
                    }
                } else if (Statics.field2054) {
                    arg1 = method2394(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, this.field1482, this.field1469, 0, var6, arg2, this, this.field1470, arg4);
                } else {
                    arg1 = method2400(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, this.field1481, 0, var6, arg2, this, this.field1470, arg4);
                }
                this.field1480 -= arg1;
                if (this.field1480 != 0) {
                    return arg1;
                }
                if (!this.method2310()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1470 == 256 && (this.field1472 & 0xFF) == 0) {
                if (Statics.field2054) {
                    return method2326(0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, 0, arg3, arg2, this);
                }
                return method2325(((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, 0, arg3, arg2, this);
            }
            if (Statics.field2054) {
                return method2330(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, 0, arg3, arg2, this, this.field1470, arg4);
            }
            return method2329(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, 0, arg3, arg2, this, this.field1470, arg4);
        }
    }

    @ObfuscatedName("dh.ar([IIIII)I")
    public int method2408(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1480 > 0) {
                int var6 = this.field1480 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1480 += arg1;
                if (this.field1470 == -256 && (this.field1472 & 0xFF) == 0) {
                    if (Statics.field2054) {
                        arg1 = method2336(0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, this.field1482, this.field1469, 0, var6, arg2, this);
                    } else {
                        arg1 = method2335(((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, this.field1481, 0, var6, arg2, this);
                    }
                } else if (Statics.field2054) {
                    arg1 = method2372(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, this.field1482, this.field1469, 0, var6, arg2, this, this.field1470, arg4);
                } else {
                    arg1 = method2341(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, this.field1481, 0, var6, arg2, this, this.field1470, arg4);
                }
                this.field1480 -= arg1;
                if (this.field1480 != 0) {
                    return arg1;
                }
                if (!this.method2310()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1470 == -256 && (this.field1472 & 0xFF) == 0) {
                if (Statics.field2054) {
                    return method2328(0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, 0, arg3, arg2, this);
                }
                return method2361(((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, 0, arg3, arg2, this);
            }
            if (Statics.field2054) {
                return method2332(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1483, this.field1475, 0, arg3, arg2, this, this.field1470, arg4);
            }
            return method2331(0, 0, ((class104) this.field1498).field1391, arg0, this.field1472, arg1, this.field1473, 0, arg3, arg2, this, this.field1470, arg4);
        }
    }

    @ObfuscatedName("dh.ax()Z")
    public boolean method2310() {
        int var1 = this.field1471;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2306(var1, this.field1476);
            var2 = method2299(var1, this.field1476);
        }
        if (this.field1473 != var1 || this.field1483 != var3 || this.field1475 != var2) {
            if (this.field1473 < var1) {
                this.field1481 = 1;
                this.field1480 = var1 - this.field1473;
            } else if (this.field1473 > var1) {
                this.field1481 = -1;
                this.field1480 = this.field1473 - var1;
            } else {
                this.field1481 = 0;
            }
            if (this.field1483 < var3) {
                this.field1482 = 1;
                if (this.field1480 == 0 || this.field1480 > var3 - this.field1483) {
                    this.field1480 = var3 - this.field1483;
                }
            } else if (this.field1483 > var3) {
                this.field1482 = -1;
                if (this.field1480 == 0 || this.field1480 > this.field1483 - var3) {
                    this.field1480 = this.field1483 - var3;
                }
            } else {
                this.field1482 = 0;
            }
            if (this.field1475 < var2) {
                this.field1469 = 1;
                if (this.field1480 == 0 || this.field1480 > var2 - this.field1475) {
                    this.field1480 = var2 - this.field1475;
                }
            } else if (this.field1475 > var2) {
                this.field1469 = -1;
                if (this.field1480 == 0 || this.field1480 > this.field1475 - var2) {
                    this.field1480 = this.field1475 - var2;
                }
            } else {
                this.field1469 = 0;
            }
            return false;
        } else if (this.field1471 == Integer.MIN_VALUE) {
            this.field1471 = 0;
            this.field1475 = 0;
            this.field1483 = 0;
            this.field1473 = 0;
            this.method3286();
            return true;
        } else {
            this.method2305();
            return false;
        }
    }

    @ObfuscatedName("dh.ai([B[IIIIIIILdh;)I")
    public static int method2325(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1472 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dh.ak(I[B[IIIIIIIILdh;)I")
    public static int method2326(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1472 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dh.ah([B[IIIIIIILdh;)I")
    public static int method2361(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1472 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dh.am(I[B[IIIIIIIILdh;)I")
    public static int method2328(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1472 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dh.af(II[B[IIIIIIILdh;II)I")
    public static int method2329(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1472 = arg4;
        return arg5;
    }

    @ObfuscatedName("dh.ab(II[B[IIIIIIIILdh;II)I")
    public static int method2330(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1472 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dh.bp(II[B[IIIIIIILdh;II)I")
    public static int method2331(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1472 = arg4;
        return arg5;
    }

    @ObfuscatedName("dh.bz(II[B[IIIIIIIILdh;II)I")
    public static int method2332(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1472 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dh.bi([B[IIIIIIIILdh;)I")
    public static int method2353(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1483 += (var14 - arg3) * arg9.field1482;
        arg9.field1475 += (var14 - arg3) * arg9.field1469;
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
        arg9.field1473 = var12 >> 2;
        arg9.field1472 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dh.bg(I[B[IIIIIIIIIILdh;)I")
    public static int method2334(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1473 += (var19 - arg4) * arg12.field1481;
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
        arg12.field1483 = var15 >> 2;
        arg12.field1475 = var16 >> 2;
        arg12.field1472 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dh.bh([B[IIIIIIIILdh;)I")
    public static int method2335(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1483 += (var14 - arg3) * arg9.field1482;
        arg9.field1475 += (var14 - arg3) * arg9.field1469;
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
        arg9.field1473 = var12 >> 2;
        arg9.field1472 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dh.bm(I[B[IIIIIIIIIILdh;)I")
    public static int method2336(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1473 += (var19 - arg4) * arg12.field1481;
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
        arg12.field1483 = var15 >> 2;
        arg12.field1475 = var16 >> 2;
        arg12.field1472 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dh.bn(II[B[IIIIIIIILdh;II)I")
    public static int method2400(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1483 -= arg11.field1482 * arg5;
        arg11.field1475 -= arg11.field1469 * arg5;
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
        arg11.field1483 += arg11.field1482 * arg5;
        arg11.field1475 += arg11.field1469 * arg5;
        arg11.field1473 = arg6;
        arg11.field1472 = arg4;
        return arg5;
    }

    @ObfuscatedName("dh.bc(II[B[IIIIIIIIIILdh;II)I")
    public static int method2394(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1473 -= arg13.field1481 * arg5;
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
        arg13.field1473 += arg13.field1481 * var27;
        arg13.field1483 = arg6;
        arg13.field1475 = arg7;
        arg13.field1472 = arg4;
        return var27;
    }

    @ObfuscatedName("dh.bx(II[B[IIIIIIIILdh;II)I")
    public static int method2341(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1483 -= arg11.field1482 * arg5;
        arg11.field1475 -= arg11.field1469 * arg5;
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
        arg11.field1483 += arg11.field1482 * arg5;
        arg11.field1475 += arg11.field1469 * arg5;
        arg11.field1473 = arg6;
        arg11.field1472 = arg4;
        return arg5;
    }

    @ObfuscatedName("dh.bo(II[B[IIIIIIIIIILdh;II)I")
    public static int method2372(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1473 -= arg13.field1481 * arg5;
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
        arg13.field1473 += arg13.field1481 * var26;
        arg13.field1483 = arg6;
        arg13.field1475 = arg7;
        arg13.field1472 = arg4;
        return var26;
    }
}
