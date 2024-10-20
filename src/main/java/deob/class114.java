package deob;

@ObfuscatedName("de")
public class class114 extends class116 {

    @ObfuscatedName("de.c")
    public int field1463;

    @ObfuscatedName("de.t")
    public int field1464;

    @ObfuscatedName("de.o")
    public int field1453;

    @ObfuscatedName("de.e")
    public int field1465;

    @ObfuscatedName("de.i")
    public int field1455;

    @ObfuscatedName("de.g")
    public int field1456;

    @ObfuscatedName("de.d")
    public int field1457;

    @ObfuscatedName("de.l")
    public int field1458;

    @ObfuscatedName("de.j")
    public int field1459;

    @ObfuscatedName("de.m")
    public int field1460;

    @ObfuscatedName("de.p")
    public boolean field1451;

    @ObfuscatedName("de.h")
    public int field1462;

    @ObfuscatedName("de.v")
    public int field1461;

    @ObfuscatedName("de.n")
    public int field1454;

    @ObfuscatedName("de.x")
    public int field1452;

    @ObfuscatedName("de.c(II)I")
    public static int method2488(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("de.t(II)I")
    public static int method2381(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("de.ag()I")
    public int method2382() {
        int var1 = this.field1455 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1458 == 0) {
            var2 -= this.field1463 * var2 / (((class104) this.field1478).field1379.length << 8);
        } else if (this.field1458 >= 0) {
            var2 -= this.field1459 * var2 / ((class104) this.field1478).field1379.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class114(class104 arg0, int arg1, int arg2) {
        this.field1478 = arg0;
        this.field1459 = arg0.field1378;
        this.field1460 = arg0.field1376;
        this.field1451 = arg0.field1380;
        this.field1464 = arg1;
        this.field1453 = arg2;
        this.field1465 = 8192;
        this.field1463 = 0;
        this.method2385();
    }

    public class114(class104 arg0, int arg1, int arg2, int arg3) {
        this.field1478 = arg0;
        this.field1459 = arg0.field1378;
        this.field1460 = arg0.field1376;
        this.field1451 = arg0.field1380;
        this.field1464 = arg1;
        this.field1453 = arg2;
        this.field1465 = arg3;
        this.field1463 = 0;
        this.method2385();
    }

    @ObfuscatedName("de.o(Lcv;II)Lde;")
    public static class114 method2383(class104 arg0, int arg1, int arg2) {
        return arg0.field1379 == null || arg0.field1379.length == 0 ? null : new class114(arg0, (int) ((long) arg0.field1377 * 256L * (long) arg1 / (long) (Statics.field1399 * 100)), arg2 << 6);
    }

    @ObfuscatedName("de.e(Lcv;III)Lde;")
    public static class114 method2434(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1379 == null || arg0.field1379.length == 0 ? null : new class114(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("de.i()V")
    public void method2385() {
        this.field1455 = this.field1453;
        this.field1456 = method2488(this.field1453, this.field1465);
        this.field1457 = method2381(this.field1453, this.field1465);
    }

    @ObfuscatedName("de.m(I)V")
    public synchronized void method2423(int arg0) {
        this.field1458 = arg0;
    }

    @ObfuscatedName("de.h(I)V")
    public synchronized void method2427(int arg0) {
        this.method2404(arg0 << 6, this.method2391());
    }

    @ObfuscatedName("de.v(I)V")
    public synchronized void method2388(int arg0) {
        this.method2404(arg0, this.method2391());
    }

    @ObfuscatedName("de.n(II)V")
    public synchronized void method2404(int arg0, int arg1) {
        this.field1453 = arg0;
        this.field1465 = arg1;
        this.field1462 = 0;
        this.method2385();
    }

    @ObfuscatedName("de.x()I")
    public synchronized int method2390() {
        return this.field1453 == Integer.MIN_VALUE ? 0 : this.field1453;
    }

    @ObfuscatedName("de.w()I")
    public synchronized int method2391() {
        return this.field1465 < 0 ? -1 : this.field1465;
    }

    @ObfuscatedName("de.q(I)V")
    public synchronized void method2399(int arg0) {
        int var2 = ((class104) this.field1478).field1379.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1463 = arg0;
    }

    @ObfuscatedName("de.z(Z)V")
    public synchronized void method2470(boolean arg0) {
        this.field1464 = (this.field1464 >>> 31) + (this.field1464 ^ this.field1464 >> 31);
        if (arg0) {
            this.field1464 = -this.field1464;
        }
    }

    @ObfuscatedName("de.y()V")
    public void method2394() {
        if (this.field1462 == 0) {
            return;
        }
        if (this.field1453 == Integer.MIN_VALUE) {
            this.field1453 = 0;
        }
        this.field1462 = 0;
        this.method2385();
    }

    @ObfuscatedName("de.f(II)V")
    public synchronized void method2392(int arg0, int arg1) {
        this.method2396(arg0, arg1, this.method2391());
    }

    @ObfuscatedName("de.a(III)V")
    public synchronized void method2396(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2404(arg1, arg2);
            return;
        }
        int var4 = method2488(arg1, arg2);
        int var5 = method2381(arg1, arg2);
        if (this.field1456 == var4 && this.field1457 == var5) {
            this.field1462 = 0;
            return;
        }
        int var6 = arg1 - this.field1455;
        if (this.field1455 - arg1 > var6) {
            var6 = this.field1455 - arg1;
        }
        if (var4 - this.field1456 > var6) {
            var6 = var4 - this.field1456;
        }
        if (this.field1456 - var4 > var6) {
            var6 = this.field1456 - var4;
        }
        if (var5 - this.field1457 > var6) {
            var6 = var5 - this.field1457;
        }
        if (this.field1457 - var5 > var6) {
            var6 = this.field1457 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1462 = arg0;
        this.field1453 = arg1;
        this.field1465 = arg2;
        this.field1461 = (arg1 - this.field1455) / arg0;
        this.field1454 = (var4 - this.field1456) / arg0;
        this.field1452 = (var5 - this.field1457) / arg0;
    }

    @ObfuscatedName("de.u(I)V")
    public synchronized void method2397(int arg0) {
        if (arg0 == 0) {
            this.method2388(0);
            this.method3351();
        } else if (this.field1456 == 0 && this.field1457 == 0) {
            this.field1462 = 0;
            this.field1453 = 0;
            this.field1455 = 0;
            this.method3351();
        } else {
            int var2 = -this.field1455;
            if (this.field1455 > var2) {
                var2 = this.field1455;
            }
            if (-this.field1456 > var2) {
                var2 = -this.field1456;
            }
            if (this.field1456 > var2) {
                var2 = this.field1456;
            }
            if (-this.field1457 > var2) {
                var2 = -this.field1457;
            }
            if (this.field1457 > var2) {
                var2 = this.field1457;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1462 = arg0;
            this.field1453 = Integer.MIN_VALUE;
            this.field1461 = -this.field1455 / arg0;
            this.field1454 = -this.field1456 / arg0;
            this.field1452 = -this.field1457 / arg0;
        }
    }

    @ObfuscatedName("de.ae(I)V")
    public synchronized void method2424(int arg0) {
        if (this.field1464 < 0) {
            this.field1464 = -arg0;
        } else {
            this.field1464 = arg0;
        }
    }

    @ObfuscatedName("de.af()I")
    public synchronized int method2398() {
        return this.field1464 < 0 ? -this.field1464 : this.field1464;
    }

    @ObfuscatedName("de.av()Z")
    public boolean method2435() {
        return this.field1463 < 0 || this.field1463 >= ((class104) this.field1478).field1379.length << 8;
    }

    @ObfuscatedName("de.al()Z")
    public boolean method2472() {
        return this.field1462 != 0;
    }

    @ObfuscatedName("de.g()Ldn;")
    public class116 method2159() {
        return null;
    }

    @ObfuscatedName("de.d()Ldn;")
    public class116 method2160() {
        return null;
    }

    @ObfuscatedName("de.l()I")
    public int method2161() {
        return this.field1453 == 0 && this.field1462 == 0 ? 0 : 1;
    }

    @ObfuscatedName("de.j([III)V")
    public synchronized void method2162(int[] arg0, int arg1, int arg2) {
        if (this.field1453 == 0 && this.field1462 == 0) {
            this.method2180(arg2);
            return;
        }
        class104 var4 = (class104) this.field1478;
        int var5 = this.field1459 << 8;
        int var6 = this.field1460 << 8;
        int var7 = var4.field1379.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1458 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1463 < 0) {
            if (this.field1464 <= 0) {
                this.method2394();
                this.method3351();
                return;
            }
            this.field1463 = 0;
        }
        if (this.field1463 >= var7) {
            if (this.field1464 >= 0) {
                this.method2394();
                this.method3351();
                return;
            }
            this.field1463 = var7 - 1;
        }
        if (this.field1458 >= 0) {
            if (this.field1458 > 0) {
                if (this.field1451) {
                    label131: {
                        if (this.field1464 < 0) {
                            var9 = this.method2405(arg0, arg1, var5, var10, var4.field1379[this.field1459]);
                            if (this.field1463 >= var5) {
                                return;
                            }
                            this.field1463 = var5 + var5 - 1 - this.field1463;
                            this.field1464 = -this.field1464;
                            if (--this.field1458 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2386(arg0, var9, var6, var10, var4.field1379[this.field1460 - 1]);
                            if (this.field1463 < var6) {
                                return;
                            }
                            this.field1463 = var6 + var6 - 1 - this.field1463;
                            this.field1464 = -this.field1464;
                            if (--this.field1458 == 0) {
                                break;
                            }
                            var9 = this.method2405(arg0, var9, var5, var10, var4.field1379[this.field1459]);
                            if (this.field1463 >= var5) {
                                return;
                            }
                            this.field1463 = var5 + var5 - 1 - this.field1463;
                            this.field1464 = -this.field1464;
                        } while (--this.field1458 != 0);
                    }
                } else if (this.field1464 < 0) {
                    while (true) {
                        var9 = this.method2405(arg0, var9, var5, var10, var4.field1379[this.field1460 - 1]);
                        if (this.field1463 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1463) / var8;
                        if (var12 >= this.field1458) {
                            this.field1463 += this.field1458 * var8;
                            this.field1458 = 0;
                            break;
                        }
                        this.field1463 += var8 * var12;
                        this.field1458 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2386(arg0, var9, var6, var10, var4.field1379[this.field1459]);
                        if (this.field1463 < var6) {
                            return;
                        }
                        int var13 = (this.field1463 - var5) / var8;
                        if (var13 >= this.field1458) {
                            this.field1463 -= this.field1458 * var8;
                            this.field1458 = 0;
                            break;
                        }
                        this.field1463 -= var8 * var13;
                        this.field1458 -= var13;
                    }
                }
            }
            if (this.field1464 < 0) {
                this.method2405(arg0, var9, 0, var10, 0);
                if (this.field1463 < 0) {
                    this.field1463 = -1;
                    this.method2394();
                    this.method3351();
                }
            } else {
                this.method2386(arg0, var9, var7, var10, 0);
                if (this.field1463 >= var7) {
                    this.field1463 = var7;
                    this.method2394();
                    this.method3351();
                }
            }
        } else if (this.field1451) {
            if (this.field1464 < 0) {
                var9 = this.method2405(arg0, arg1, var5, var10, var4.field1379[this.field1459]);
                if (this.field1463 >= var5) {
                    return;
                }
                this.field1463 = var5 + var5 - 1 - this.field1463;
                this.field1464 = -this.field1464;
            }
            while (true) {
                int var11 = this.method2386(arg0, var9, var6, var10, var4.field1379[this.field1460 - 1]);
                if (this.field1463 < var6) {
                    return;
                }
                this.field1463 = var6 + var6 - 1 - this.field1463;
                this.field1464 = -this.field1464;
                var9 = this.method2405(arg0, var11, var5, var10, var4.field1379[this.field1459]);
                if (this.field1463 >= var5) {
                    return;
                }
                this.field1463 = var5 + var5 - 1 - this.field1463;
                this.field1464 = -this.field1464;
            }
        } else if (this.field1464 < 0) {
            while (true) {
                var9 = this.method2405(arg0, var9, var5, var10, var4.field1379[this.field1460 - 1]);
                if (this.field1463 >= var5) {
                    return;
                }
                this.field1463 = var6 - 1 - (var6 - 1 - this.field1463) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2386(arg0, var9, var6, var10, var4.field1379[this.field1459]);
                if (this.field1463 < var6) {
                    return;
                }
                this.field1463 = (this.field1463 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("de.p(I)V")
    public synchronized void method2180(int arg0) {
        if (this.field1462 > 0) {
            if (arg0 >= this.field1462) {
                if (this.field1453 == Integer.MIN_VALUE) {
                    this.field1453 = 0;
                    this.field1457 = 0;
                    this.field1456 = 0;
                    this.field1455 = 0;
                    this.method3351();
                    arg0 = this.field1462;
                }
                this.field1462 = 0;
                this.method2385();
            } else {
                this.field1455 += this.field1461 * arg0;
                this.field1456 += this.field1454 * arg0;
                this.field1457 += this.field1452 * arg0;
                this.field1462 -= arg0;
            }
        }
        class104 var2 = (class104) this.field1478;
        int var3 = this.field1459 << 8;
        int var4 = this.field1460 << 8;
        int var5 = var2.field1379.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1458 = 0;
        }
        if (this.field1463 < 0) {
            if (this.field1464 <= 0) {
                this.method2394();
                this.method3351();
                return;
            }
            this.field1463 = 0;
        }
        if (this.field1463 >= var5) {
            if (this.field1464 >= 0) {
                this.method2394();
                this.method3351();
                return;
            }
            this.field1463 = var5 - 1;
        }
        this.field1463 += this.field1464 * arg0;
        if (this.field1458 >= 0) {
            if (this.field1458 > 0) {
                if (this.field1451) {
                    label121: {
                        if (this.field1464 < 0) {
                            if (this.field1463 >= var3) {
                                return;
                            }
                            this.field1463 = var3 + var3 - 1 - this.field1463;
                            this.field1464 = -this.field1464;
                            if (--this.field1458 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1463 < var4) {
                                return;
                            }
                            this.field1463 = var4 + var4 - 1 - this.field1463;
                            this.field1464 = -this.field1464;
                            if (--this.field1458 == 0) {
                                break;
                            }
                            if (this.field1463 >= var3) {
                                return;
                            }
                            this.field1463 = var3 + var3 - 1 - this.field1463;
                            this.field1464 = -this.field1464;
                        } while (--this.field1458 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1464 < 0) {
                            if (this.field1463 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1463) / var6;
                            if (var7 >= this.field1458) {
                                this.field1463 += this.field1458 * var6;
                                this.field1458 = 0;
                                break label153;
                            }
                            this.field1463 += var6 * var7;
                            this.field1458 -= var7;
                        } else if (this.field1463 >= var4) {
                            int var8 = (this.field1463 - var3) / var6;
                            if (var8 >= this.field1458) {
                                this.field1463 -= this.field1458 * var6;
                                this.field1458 = 0;
                                break label153;
                            }
                            this.field1463 -= var6 * var8;
                            this.field1458 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1464 < 0) {
                if (this.field1463 < 0) {
                    this.field1463 = -1;
                    this.method2394();
                    this.method3351();
                }
            } else if (this.field1463 >= var5) {
                this.field1463 = var5;
                this.method2394();
                this.method3351();
            }
        } else if (this.field1451) {
            if (this.field1464 < 0) {
                if (this.field1463 >= var3) {
                    return;
                }
                this.field1463 = var3 + var3 - 1 - this.field1463;
                this.field1464 = -this.field1464;
            }
            while (this.field1463 >= var4) {
                this.field1463 = var4 + var4 - 1 - this.field1463;
                this.field1464 = -this.field1464;
                if (this.field1463 >= var3) {
                    return;
                }
                this.field1463 = var3 + var3 - 1 - this.field1463;
                this.field1464 = -this.field1464;
            }
        } else if (this.field1464 < 0) {
            if (this.field1463 >= var3) {
                return;
            }
            this.field1463 = var4 - 1 - (var4 - 1 - this.field1463) % var6;
        } else if (this.field1463 >= var4) {
            this.field1463 = (this.field1463 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("de.at([IIIII)I")
    public int method2386(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1462 > 0) {
                int var6 = this.field1462 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1462 += arg1;
                if (this.field1464 == 256 && (this.field1463 & 0xFF) == 0) {
                    if (Statics.field1394) {
                        arg1 = method2415(0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, this.field1454, this.field1452, 0, var6, arg2, this);
                    } else {
                        arg1 = method2414(((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, this.field1461, 0, var6, arg2, this);
                    }
                } else if (Statics.field1394) {
                    arg1 = method2497(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, this.field1454, this.field1452, 0, var6, arg2, this, this.field1464, arg4);
                } else {
                    arg1 = method2418(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, this.field1461, 0, var6, arg2, this, this.field1464, arg4);
                }
                this.field1462 -= arg1;
                if (this.field1462 != 0) {
                    return arg1;
                }
                if (!this.method2406()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1464 == 256 && (this.field1463 & 0xFF) == 0) {
                if (Statics.field1394) {
                    return method2412(0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, 0, arg3, arg2, this);
                }
                return method2442(((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, 0, arg3, arg2, this);
            }
            if (Statics.field1394) {
                return method2449(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, 0, arg3, arg2, this, this.field1464, arg4);
            }
            return method2410(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, 0, arg3, arg2, this, this.field1464, arg4);
        }
    }

    @ObfuscatedName("de.an([IIIII)I")
    public int method2405(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1462 > 0) {
                int var6 = this.field1462 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1462 += arg1;
                if (this.field1464 == -256 && (this.field1463 & 0xFF) == 0) {
                    if (Statics.field1394) {
                        arg1 = method2505(0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, this.field1454, this.field1452, 0, var6, arg2, this);
                    } else {
                        arg1 = method2416(((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, this.field1461, 0, var6, arg2, this);
                    }
                } else if (Statics.field1394) {
                    arg1 = method2420(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, this.field1454, this.field1452, 0, var6, arg2, this, this.field1464, arg4);
                } else {
                    arg1 = method2419(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, this.field1461, 0, var6, arg2, this, this.field1464, arg4);
                }
                this.field1462 -= arg1;
                if (this.field1462 != 0) {
                    return arg1;
                }
                if (!this.method2406()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1464 == -256 && (this.field1463 & 0xFF) == 0) {
                if (Statics.field1394) {
                    return method2409(0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, 0, arg3, arg2, this);
                }
                return method2501(((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, 0, arg3, arg2, this);
            }
            if (Statics.field1394) {
                return method2413(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1456, this.field1457, 0, arg3, arg2, this, this.field1464, arg4);
            }
            return method2468(0, 0, ((class104) this.field1478).field1379, arg0, this.field1463, arg1, this.field1455, 0, arg3, arg2, this, this.field1464, arg4);
        }
    }

    @ObfuscatedName("de.ai()Z")
    public boolean method2406() {
        int var1 = this.field1453;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2488(var1, this.field1465);
            var2 = method2381(var1, this.field1465);
        }
        if (this.field1455 != var1 || this.field1456 != var3 || this.field1457 != var2) {
            if (this.field1455 < var1) {
                this.field1461 = 1;
                this.field1462 = var1 - this.field1455;
            } else if (this.field1455 > var1) {
                this.field1461 = -1;
                this.field1462 = this.field1455 - var1;
            } else {
                this.field1461 = 0;
            }
            if (this.field1456 < var3) {
                this.field1454 = 1;
                if (this.field1462 == 0 || this.field1462 > var3 - this.field1456) {
                    this.field1462 = var3 - this.field1456;
                }
            } else if (this.field1456 > var3) {
                this.field1454 = -1;
                if (this.field1462 == 0 || this.field1462 > this.field1456 - var3) {
                    this.field1462 = this.field1456 - var3;
                }
            } else {
                this.field1454 = 0;
            }
            if (this.field1457 < var2) {
                this.field1452 = 1;
                if (this.field1462 == 0 || this.field1462 > var2 - this.field1457) {
                    this.field1462 = var2 - this.field1457;
                }
            } else if (this.field1457 > var2) {
                this.field1452 = -1;
                if (this.field1462 == 0 || this.field1462 > this.field1457 - var2) {
                    this.field1462 = this.field1457 - var2;
                }
            } else {
                this.field1452 = 0;
            }
            return false;
        } else if (this.field1453 == Integer.MIN_VALUE) {
            this.field1453 = 0;
            this.field1457 = 0;
            this.field1456 = 0;
            this.field1455 = 0;
            this.method3351();
            return true;
        } else {
            this.method2385();
            return false;
        }
    }

    @ObfuscatedName("de.ab([B[IIIIIIILde;)I")
    public static int method2442(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1463 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("de.ap(I[B[IIIIIIIILde;)I")
    public static int method2412(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1463 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("de.ah([B[IIIIIIILde;)I")
    public static int method2501(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1463 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("de.bq(I[B[IIIIIIIILde;)I")
    public static int method2409(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1463 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("de.bf(II[B[IIIIIIILde;II)I")
    public static int method2410(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1463 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.bc(II[B[IIIIIIIILde;II)I")
    public static int method2449(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1463 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("de.bk(II[B[IIIIIIILde;II)I")
    public static int method2468(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1463 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.bb(II[B[IIIIIIIILde;II)I")
    public static int method2413(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1463 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("de.bi([B[IIIIIIIILde;)I")
    public static int method2414(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1456 += (var14 - arg3) * arg9.field1454;
        arg9.field1457 += (var14 - arg3) * arg9.field1452;
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
        arg9.field1455 = var12 >> 2;
        arg9.field1463 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("de.bp(I[B[IIIIIIIIIILde;)I")
    public static int method2415(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1455 += (var19 - arg4) * arg12.field1461;
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
        arg12.field1456 = var15 >> 2;
        arg12.field1457 = var16 >> 2;
        arg12.field1463 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("de.bl([B[IIIIIIIILde;)I")
    public static int method2416(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1456 += (var14 - arg3) * arg9.field1454;
        arg9.field1457 += (var14 - arg3) * arg9.field1452;
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
        arg9.field1455 = var12 >> 2;
        arg9.field1463 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("de.by(I[B[IIIIIIIIIILde;)I")
    public static int method2505(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1455 += (var19 - arg4) * arg12.field1461;
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
        arg12.field1456 = var15 >> 2;
        arg12.field1457 = var16 >> 2;
        arg12.field1463 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("de.be(II[B[IIIIIIIILde;II)I")
    public static int method2418(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1456 -= arg11.field1454 * arg5;
        arg11.field1457 -= arg11.field1452 * arg5;
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
        arg11.field1456 += arg11.field1454 * arg5;
        arg11.field1457 += arg11.field1452 * arg5;
        arg11.field1455 = arg6;
        arg11.field1463 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.bw(II[B[IIIIIIIIIILde;II)I")
    public static int method2497(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1455 -= arg13.field1461 * arg5;
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
        arg13.field1455 += arg13.field1461 * var27;
        arg13.field1456 = arg6;
        arg13.field1457 = arg7;
        arg13.field1463 = arg4;
        return var27;
    }

    @ObfuscatedName("de.bt(II[B[IIIIIIIILde;II)I")
    public static int method2419(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1456 -= arg11.field1454 * arg5;
        arg11.field1457 -= arg11.field1452 * arg5;
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
        arg11.field1456 += arg11.field1454 * arg5;
        arg11.field1457 += arg11.field1452 * arg5;
        arg11.field1455 = arg6;
        arg11.field1463 = arg4;
        return arg5;
    }

    @ObfuscatedName("de.bn(II[B[IIIIIIIIIILde;II)I")
    public static int method2420(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1455 -= arg13.field1461 * arg5;
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
        arg13.field1455 += arg13.field1461 * var26;
        arg13.field1456 = arg6;
        arg13.field1457 = arg7;
        arg13.field1463 = arg4;
        return var26;
    }
}
