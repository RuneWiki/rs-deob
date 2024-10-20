package deob;

@ObfuscatedName("ds")
public class class114 extends class116 {

    @ObfuscatedName("ds.a")
    public int field1449;

    @ObfuscatedName("ds.t")
    public int field1442;

    @ObfuscatedName("ds.n")
    public int field1441;

    @ObfuscatedName("ds.q")
    public int field1443;

    @ObfuscatedName("ds.v")
    public int field1445;

    @ObfuscatedName("ds.l")
    public int field1446;

    @ObfuscatedName("ds.c")
    public int field1447;

    @ObfuscatedName("ds.o")
    public int field1448;

    @ObfuscatedName("ds.i")
    public int field1444;

    @ObfuscatedName("ds.d")
    public int field1450;

    @ObfuscatedName("ds.m")
    public boolean field1451;

    @ObfuscatedName("ds.p")
    public int field1452;

    @ObfuscatedName("ds.h")
    public int field1453;

    @ObfuscatedName("ds.k")
    public int field1455;

    @ObfuscatedName("ds.x")
    public int field1454;

    @ObfuscatedName("ds.a(II)I")
    public static int method2484(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.t(II)I")
    public static int method2531(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.as()I")
    public int method2441() {
        int var1 = this.field1445 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1448 == 0) {
            var2 -= this.field1449 * var2 / (((class104) this.field1470).field1365.length << 8);
        } else if (this.field1448 >= 0) {
            var2 -= this.field1444 * var2 / ((class104) this.field1470).field1365.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class114(class104 arg0, int arg1, int arg2) {
        this.field1470 = arg0;
        this.field1444 = arg0.field1366;
        this.field1450 = arg0.field1367;
        this.field1451 = arg0.field1364;
        this.field1442 = arg1;
        this.field1441 = arg2;
        this.field1443 = 8192;
        this.field1449 = 0;
        this.method2444();
    }

    public class114(class104 arg0, int arg1, int arg2, int arg3) {
        this.field1470 = arg0;
        this.field1444 = arg0.field1366;
        this.field1450 = arg0.field1367;
        this.field1451 = arg0.field1364;
        this.field1442 = arg1;
        this.field1441 = arg2;
        this.field1443 = arg3;
        this.field1449 = 0;
        this.method2444();
    }

    @ObfuscatedName("ds.n(Lca;II)Lds;")
    public static class114 method2511(class104 arg0, int arg1, int arg2) {
        return arg0.field1365 == null || arg0.field1365.length == 0 ? null : new class114(arg0, (int) ((long) arg0.field1368 * 256L * (long) arg1 / (long) (Statics.field1392 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ds.q(Lca;III)Lds;")
    public static class114 method2498(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1365 == null || arg0.field1365.length == 0 ? null : new class114(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ds.v()V")
    public void method2444() {
        this.field1445 = this.field1441;
        this.field1446 = method2484(this.field1441, this.field1443);
        this.field1447 = method2531(this.field1441, this.field1443);
    }

    @ObfuscatedName("ds.d(I)V")
    public synchronized void method2440(int arg0) {
        this.field1448 = arg0;
    }

    @ObfuscatedName("ds.p(I)V")
    public synchronized void method2446(int arg0) {
        this.method2448(arg0 << 6, this.method2570());
    }

    @ObfuscatedName("ds.h(I)V")
    public synchronized void method2567(int arg0) {
        this.method2448(arg0, this.method2570());
    }

    @ObfuscatedName("ds.k(II)V")
    public synchronized void method2448(int arg0, int arg1) {
        this.field1441 = arg0;
        this.field1443 = arg1;
        this.field1452 = 0;
        this.method2444();
    }

    @ObfuscatedName("ds.x()I")
    public synchronized int method2449() {
        return this.field1441 == Integer.MIN_VALUE ? 0 : this.field1441;
    }

    @ObfuscatedName("ds.j()I")
    public synchronized int method2570() {
        return this.field1443 < 0 ? -1 : this.field1443;
    }

    @ObfuscatedName("ds.r(I)V")
    public synchronized void method2451(int arg0) {
        int var2 = ((class104) this.field1470).field1365.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1449 = arg0;
    }

    @ObfuscatedName("ds.e(Z)V")
    public synchronized void method2452(boolean arg0) {
        this.field1442 = (this.field1442 >>> 31) + (this.field1442 ^ this.field1442 >> 31);
        if (arg0) {
            this.field1442 = -this.field1442;
        }
    }

    @ObfuscatedName("ds.s()V")
    public void method2439() {
        if (this.field1452 == 0) {
            return;
        }
        if (this.field1441 == Integer.MIN_VALUE) {
            this.field1441 = 0;
        }
        this.field1452 = 0;
        this.method2444();
    }

    @ObfuscatedName("ds.b(II)V")
    public synchronized void method2450(int arg0, int arg1) {
        this.method2455(arg0, arg1, this.method2570());
    }

    @ObfuscatedName("ds.w(III)V")
    public synchronized void method2455(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2448(arg1, arg2);
            return;
        }
        int var4 = method2484(arg1, arg2);
        int var5 = method2531(arg1, arg2);
        if (this.field1446 == var4 && this.field1447 == var5) {
            this.field1452 = 0;
            return;
        }
        int var6 = arg1 - this.field1445;
        if (this.field1445 - arg1 > var6) {
            var6 = this.field1445 - arg1;
        }
        if (var4 - this.field1446 > var6) {
            var6 = var4 - this.field1446;
        }
        if (this.field1446 - var4 > var6) {
            var6 = this.field1446 - var4;
        }
        if (var5 - this.field1447 > var6) {
            var6 = var5 - this.field1447;
        }
        if (this.field1447 - var5 > var6) {
            var6 = this.field1447 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1452 = arg0;
        this.field1441 = arg1;
        this.field1443 = arg2;
        this.field1453 = (arg1 - this.field1445) / arg0;
        this.field1455 = (var4 - this.field1446) / arg0;
        this.field1454 = (var5 - this.field1447) / arg0;
    }

    @ObfuscatedName("ds.u(I)V")
    public synchronized void method2463(int arg0) {
        if (arg0 == 0) {
            this.method2567(0);
            this.method3386();
        } else if (this.field1446 == 0 && this.field1447 == 0) {
            this.field1452 = 0;
            this.field1441 = 0;
            this.field1445 = 0;
            this.method3386();
        } else {
            int var2 = -this.field1445;
            if (this.field1445 > var2) {
                var2 = this.field1445;
            }
            if (-this.field1446 > var2) {
                var2 = -this.field1446;
            }
            if (this.field1446 > var2) {
                var2 = this.field1446;
            }
            if (-this.field1447 > var2) {
                var2 = -this.field1447;
            }
            if (this.field1447 > var2) {
                var2 = this.field1447;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1452 = arg0;
            this.field1441 = Integer.MIN_VALUE;
            this.field1453 = -this.field1445 / arg0;
            this.field1455 = -this.field1446 / arg0;
            this.field1454 = -this.field1447 / arg0;
        }
    }

    @ObfuscatedName("ds.ad(I)V")
    public synchronized void method2482(int arg0) {
        if (this.field1442 < 0) {
            this.field1442 = -arg0;
        } else {
            this.field1442 = arg0;
        }
    }

    @ObfuscatedName("ds.ah()I")
    public synchronized int method2458() {
        return this.field1442 < 0 ? -this.field1442 : this.field1442;
    }

    @ObfuscatedName("ds.an()Z")
    public boolean method2520() {
        return this.field1449 < 0 || this.field1449 >= ((class104) this.field1470).field1365.length << 8;
    }

    @ObfuscatedName("ds.af()Z")
    public boolean method2460() {
        return this.field1452 != 0;
    }

    @ObfuscatedName("ds.l()Ldj;")
    public class116 method2215() {
        return null;
    }

    @ObfuscatedName("ds.c()Ldj;")
    public class116 method2223() {
        return null;
    }

    @ObfuscatedName("ds.o()I")
    public int method2217() {
        return this.field1441 == 0 && this.field1452 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ds.i([III)V")
    public synchronized void method2218(int[] arg0, int arg1, int arg2) {
        if (this.field1441 == 0 && this.field1452 == 0) {
            this.method2224(arg2);
            return;
        }
        class104 var4 = (class104) this.field1470;
        int var5 = this.field1444 << 8;
        int var6 = this.field1450 << 8;
        int var7 = var4.field1365.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1448 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1449 < 0) {
            if (this.field1442 <= 0) {
                this.method2439();
                this.method3386();
                return;
            }
            this.field1449 = 0;
        }
        if (this.field1449 >= var7) {
            if (this.field1442 >= 0) {
                this.method2439();
                this.method3386();
                return;
            }
            this.field1449 = var7 - 1;
        }
        if (this.field1448 >= 0) {
            if (this.field1448 > 0) {
                if (this.field1451) {
                    label131: {
                        if (this.field1442 < 0) {
                            var9 = this.method2535(arg0, arg1, var5, var10, var4.field1365[this.field1444]);
                            if (this.field1449 >= var5) {
                                return;
                            }
                            this.field1449 = var5 + var5 - 1 - this.field1449;
                            this.field1442 = -this.field1442;
                            if (--this.field1448 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2576(arg0, var9, var6, var10, var4.field1365[this.field1450 - 1]);
                            if (this.field1449 < var6) {
                                return;
                            }
                            this.field1449 = var6 + var6 - 1 - this.field1449;
                            this.field1442 = -this.field1442;
                            if (--this.field1448 == 0) {
                                break;
                            }
                            var9 = this.method2535(arg0, var9, var5, var10, var4.field1365[this.field1444]);
                            if (this.field1449 >= var5) {
                                return;
                            }
                            this.field1449 = var5 + var5 - 1 - this.field1449;
                            this.field1442 = -this.field1442;
                        } while (--this.field1448 != 0);
                    }
                } else if (this.field1442 < 0) {
                    while (true) {
                        var9 = this.method2535(arg0, var9, var5, var10, var4.field1365[this.field1450 - 1]);
                        if (this.field1449 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1449) / var8;
                        if (var12 >= this.field1448) {
                            this.field1449 += this.field1448 * var8;
                            this.field1448 = 0;
                            break;
                        }
                        this.field1449 += var8 * var12;
                        this.field1448 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2576(arg0, var9, var6, var10, var4.field1365[this.field1444]);
                        if (this.field1449 < var6) {
                            return;
                        }
                        int var13 = (this.field1449 - var5) / var8;
                        if (var13 >= this.field1448) {
                            this.field1449 -= this.field1448 * var8;
                            this.field1448 = 0;
                            break;
                        }
                        this.field1449 -= var8 * var13;
                        this.field1448 -= var13;
                    }
                }
            }
            if (this.field1442 < 0) {
                this.method2535(arg0, var9, 0, var10, 0);
                if (this.field1449 < 0) {
                    this.field1449 = -1;
                    this.method2439();
                    this.method3386();
                }
            } else {
                this.method2576(arg0, var9, var7, var10, 0);
                if (this.field1449 >= var7) {
                    this.field1449 = var7;
                    this.method2439();
                    this.method3386();
                }
            }
        } else if (this.field1451) {
            if (this.field1442 < 0) {
                var9 = this.method2535(arg0, arg1, var5, var10, var4.field1365[this.field1444]);
                if (this.field1449 >= var5) {
                    return;
                }
                this.field1449 = var5 + var5 - 1 - this.field1449;
                this.field1442 = -this.field1442;
            }
            while (true) {
                int var11 = this.method2576(arg0, var9, var6, var10, var4.field1365[this.field1450 - 1]);
                if (this.field1449 < var6) {
                    return;
                }
                this.field1449 = var6 + var6 - 1 - this.field1449;
                this.field1442 = -this.field1442;
                var9 = this.method2535(arg0, var11, var5, var10, var4.field1365[this.field1444]);
                if (this.field1449 >= var5) {
                    return;
                }
                this.field1449 = var5 + var5 - 1 - this.field1449;
                this.field1442 = -this.field1442;
            }
        } else if (this.field1442 < 0) {
            while (true) {
                var9 = this.method2535(arg0, var9, var5, var10, var4.field1365[this.field1450 - 1]);
                if (this.field1449 >= var5) {
                    return;
                }
                this.field1449 = var6 - 1 - (var6 - 1 - this.field1449) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2576(arg0, var9, var6, var10, var4.field1365[this.field1444]);
                if (this.field1449 < var6) {
                    return;
                }
                this.field1449 = (this.field1449 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ds.m(I)V")
    public synchronized void method2224(int arg0) {
        if (this.field1452 > 0) {
            if (arg0 >= this.field1452) {
                if (this.field1441 == Integer.MIN_VALUE) {
                    this.field1441 = 0;
                    this.field1447 = 0;
                    this.field1446 = 0;
                    this.field1445 = 0;
                    this.method3386();
                    arg0 = this.field1452;
                }
                this.field1452 = 0;
                this.method2444();
            } else {
                this.field1445 += this.field1453 * arg0;
                this.field1446 += this.field1455 * arg0;
                this.field1447 += this.field1454 * arg0;
                this.field1452 -= arg0;
            }
        }
        class104 var2 = (class104) this.field1470;
        int var3 = this.field1444 << 8;
        int var4 = this.field1450 << 8;
        int var5 = var2.field1365.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1448 = 0;
        }
        if (this.field1449 < 0) {
            if (this.field1442 <= 0) {
                this.method2439();
                this.method3386();
                return;
            }
            this.field1449 = 0;
        }
        if (this.field1449 >= var5) {
            if (this.field1442 >= 0) {
                this.method2439();
                this.method3386();
                return;
            }
            this.field1449 = var5 - 1;
        }
        this.field1449 += this.field1442 * arg0;
        if (this.field1448 >= 0) {
            if (this.field1448 > 0) {
                if (this.field1451) {
                    label121: {
                        if (this.field1442 < 0) {
                            if (this.field1449 >= var3) {
                                return;
                            }
                            this.field1449 = var3 + var3 - 1 - this.field1449;
                            this.field1442 = -this.field1442;
                            if (--this.field1448 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1449 < var4) {
                                return;
                            }
                            this.field1449 = var4 + var4 - 1 - this.field1449;
                            this.field1442 = -this.field1442;
                            if (--this.field1448 == 0) {
                                break;
                            }
                            if (this.field1449 >= var3) {
                                return;
                            }
                            this.field1449 = var3 + var3 - 1 - this.field1449;
                            this.field1442 = -this.field1442;
                        } while (--this.field1448 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1442 < 0) {
                            if (this.field1449 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1449) / var6;
                            if (var7 >= this.field1448) {
                                this.field1449 += this.field1448 * var6;
                                this.field1448 = 0;
                                break label153;
                            }
                            this.field1449 += var6 * var7;
                            this.field1448 -= var7;
                        } else if (this.field1449 >= var4) {
                            int var8 = (this.field1449 - var3) / var6;
                            if (var8 >= this.field1448) {
                                this.field1449 -= this.field1448 * var6;
                                this.field1448 = 0;
                                break label153;
                            }
                            this.field1449 -= var6 * var8;
                            this.field1448 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1442 < 0) {
                if (this.field1449 < 0) {
                    this.field1449 = -1;
                    this.method2439();
                    this.method3386();
                }
            } else if (this.field1449 >= var5) {
                this.field1449 = var5;
                this.method2439();
                this.method3386();
            }
        } else if (this.field1451) {
            if (this.field1442 < 0) {
                if (this.field1449 >= var3) {
                    return;
                }
                this.field1449 = var3 + var3 - 1 - this.field1449;
                this.field1442 = -this.field1442;
            }
            while (this.field1449 >= var4) {
                this.field1449 = var4 + var4 - 1 - this.field1449;
                this.field1442 = -this.field1442;
                if (this.field1449 >= var3) {
                    return;
                }
                this.field1449 = var3 + var3 - 1 - this.field1449;
                this.field1442 = -this.field1442;
            }
        } else if (this.field1442 < 0) {
            if (this.field1449 >= var3) {
                return;
            }
            this.field1449 = var4 - 1 - (var4 - 1 - this.field1449) % var6;
        } else if (this.field1449 >= var4) {
            this.field1449 = (this.field1449 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ds.ai([IIIII)I")
    public int method2576(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1452 > 0) {
                int var6 = this.field1452 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1452 += arg1;
                if (this.field1442 == 256 && (this.field1449 & 0xFF) == 0) {
                    if (Statics.field544) {
                        arg1 = method2459(0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, this.field1455, this.field1454, 0, var6, arg2, this);
                    } else {
                        arg1 = method2474(((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, this.field1453, 0, var6, arg2, this);
                    }
                } else if (Statics.field544) {
                    arg1 = method2479(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, this.field1455, this.field1454, 0, var6, arg2, this, this.field1442, arg4);
                } else {
                    arg1 = method2492(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, this.field1453, 0, var6, arg2, this, this.field1442, arg4);
                }
                this.field1452 -= arg1;
                if (this.field1452 != 0) {
                    return arg1;
                }
                if (!this.method2467()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1442 == 256 && (this.field1449 & 0xFF) == 0) {
                if (Statics.field544) {
                    return method2480(0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, 0, arg3, arg2, this);
                }
                return method2534(((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, 0, arg3, arg2, this);
            }
            if (Statics.field544) {
                return method2471(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, 0, arg3, arg2, this, this.field1442, arg4);
            }
            return method2470(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, 0, arg3, arg2, this, this.field1442, arg4);
        }
    }

    @ObfuscatedName("ds.ac([IIIII)I")
    public int method2535(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1452 > 0) {
                int var6 = this.field1452 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1452 += arg1;
                if (this.field1442 == -256 && (this.field1449 & 0xFF) == 0) {
                    if (Statics.field544) {
                        arg1 = method2485(0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, this.field1455, this.field1454, 0, var6, arg2, this);
                    } else {
                        arg1 = method2568(((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, this.field1453, 0, var6, arg2, this);
                    }
                } else if (Statics.field544) {
                    arg1 = method2554(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, this.field1455, this.field1454, 0, var6, arg2, this, this.field1442, arg4);
                } else {
                    arg1 = method2445(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, this.field1453, 0, var6, arg2, this, this.field1442, arg4);
                }
                this.field1452 -= arg1;
                if (this.field1452 != 0) {
                    return arg1;
                }
                if (!this.method2467()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1442 == -256 && (this.field1449 & 0xFF) == 0) {
                if (Statics.field544) {
                    return method2469(0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, 0, arg3, arg2, this);
                }
                return method2468(((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, 0, arg3, arg2, this);
            }
            if (Statics.field544) {
                return method2526(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1446, this.field1447, 0, arg3, arg2, this, this.field1442, arg4);
            }
            return method2472(0, 0, ((class104) this.field1470).field1365, arg0, this.field1449, arg1, this.field1445, 0, arg3, arg2, this, this.field1442, arg4);
        }
    }

    @ObfuscatedName("ds.at()Z")
    public boolean method2467() {
        int var1 = this.field1441;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2484(var1, this.field1443);
            var2 = method2531(var1, this.field1443);
        }
        if (this.field1445 != var1 || this.field1446 != var3 || this.field1447 != var2) {
            if (this.field1445 < var1) {
                this.field1453 = 1;
                this.field1452 = var1 - this.field1445;
            } else if (this.field1445 > var1) {
                this.field1453 = -1;
                this.field1452 = this.field1445 - var1;
            } else {
                this.field1453 = 0;
            }
            if (this.field1446 < var3) {
                this.field1455 = 1;
                if (this.field1452 == 0 || this.field1452 > var3 - this.field1446) {
                    this.field1452 = var3 - this.field1446;
                }
            } else if (this.field1446 > var3) {
                this.field1455 = -1;
                if (this.field1452 == 0 || this.field1452 > this.field1446 - var3) {
                    this.field1452 = this.field1446 - var3;
                }
            } else {
                this.field1455 = 0;
            }
            if (this.field1447 < var2) {
                this.field1454 = 1;
                if (this.field1452 == 0 || this.field1452 > var2 - this.field1447) {
                    this.field1452 = var2 - this.field1447;
                }
            } else if (this.field1447 > var2) {
                this.field1454 = -1;
                if (this.field1452 == 0 || this.field1452 > this.field1447 - var2) {
                    this.field1452 = this.field1447 - var2;
                }
            } else {
                this.field1454 = 0;
            }
            return false;
        } else if (this.field1441 == Integer.MIN_VALUE) {
            this.field1441 = 0;
            this.field1447 = 0;
            this.field1446 = 0;
            this.field1445 = 0;
            this.method3386();
            return true;
        } else {
            this.method2444();
            return false;
        }
    }

    @ObfuscatedName("ds.ba([B[IIIIIIILds;)I")
    public static int method2534(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1449 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bg(I[B[IIIIIIIILds;)I")
    public static int method2480(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1449 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ds.bc([B[IIIIIIILds;)I")
    public static int method2468(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1449 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bd(I[B[IIIIIIIILds;)I")
    public static int method2469(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1449 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ds.bx(II[B[IIIIIIILds;II)I")
    public static int method2470(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1449 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bl(II[B[IIIIIIIILds;II)I")
    public static int method2471(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1449 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ds.bh(II[B[IIIIIIILds;II)I")
    public static int method2472(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1449 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bu(II[B[IIIIIIIILds;II)I")
    public static int method2526(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1449 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ds.br([B[IIIIIIIILds;)I")
    public static int method2474(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1446 += (var14 - arg3) * arg9.field1455;
        arg9.field1447 += (var14 - arg3) * arg9.field1454;
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
        arg9.field1445 = var12 >> 2;
        arg9.field1449 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bq(I[B[IIIIIIIIIILds;)I")
    public static int method2459(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1445 += (var19 - arg4) * arg12.field1453;
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
        arg12.field1446 = var15 >> 2;
        arg12.field1447 = var16 >> 2;
        arg12.field1449 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bi([B[IIIIIIIILds;)I")
    public static int method2568(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1446 += (var14 - arg3) * arg9.field1455;
        arg9.field1447 += (var14 - arg3) * arg9.field1454;
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
        arg9.field1445 = var12 >> 2;
        arg9.field1449 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.be(I[B[IIIIIIIIIILds;)I")
    public static int method2485(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1445 += (var19 - arg4) * arg12.field1453;
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
        arg12.field1446 = var15 >> 2;
        arg12.field1447 = var16 >> 2;
        arg12.field1449 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bt(II[B[IIIIIIIILds;II)I")
    public static int method2492(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1446 -= arg11.field1455 * arg5;
        arg11.field1447 -= arg11.field1454 * arg5;
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
        arg11.field1446 += arg11.field1455 * arg5;
        arg11.field1447 += arg11.field1454 * arg5;
        arg11.field1445 = arg6;
        arg11.field1449 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bs(II[B[IIIIIIIIIILds;II)I")
    public static int method2479(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1445 -= arg13.field1453 * arg5;
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
        arg13.field1445 += arg13.field1453 * var27;
        arg13.field1446 = arg6;
        arg13.field1447 = arg7;
        arg13.field1449 = arg4;
        return var27;
    }

    @ObfuscatedName("ds.bj(II[B[IIIIIIIILds;II)I")
    public static int method2445(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1446 -= arg11.field1455 * arg5;
        arg11.field1447 -= arg11.field1454 * arg5;
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
        arg11.field1446 += arg11.field1455 * arg5;
        arg11.field1447 += arg11.field1454 * arg5;
        arg11.field1445 = arg6;
        arg11.field1449 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bm(II[B[IIIIIIIIIILds;II)I")
    public static int method2554(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1445 -= arg13.field1453 * arg5;
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
        arg13.field1445 += arg13.field1453 * var26;
        arg13.field1446 = arg6;
        arg13.field1447 = arg7;
        arg13.field1449 = arg4;
        return var26;
    }
}
