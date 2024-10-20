package deob;

@ObfuscatedName("dp")
public class class106 extends class108 {

    @ObfuscatedName("dp.f")
    public int field1410;

    @ObfuscatedName("dp.h")
    public int field1415;

    @ObfuscatedName("dp.e")
    public int field1408;

    @ObfuscatedName("dp.b")
    public int field1404;

    @ObfuscatedName("dp.l")
    public int field1403;

    @ObfuscatedName("dp.d")
    public int field1406;

    @ObfuscatedName("dp.n")
    public int field1407;

    @ObfuscatedName("dp.s")
    public int field1409;

    @ObfuscatedName("dp.g")
    public int field1401;

    @ObfuscatedName("dp.a")
    public int field1405;

    @ObfuscatedName("dp.r")
    public boolean field1411;

    @ObfuscatedName("dp.k")
    public int field1412;

    @ObfuscatedName("dp.m")
    public int field1413;

    @ObfuscatedName("dp.q")
    public int field1414;

    @ObfuscatedName("dp.x")
    public int field1402;

    @ObfuscatedName("dp.f(II)I")
    public static int method2204(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dp.h(II)I")
    public static int method2167(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dp.af()I")
    public int method2131() {
        int var1 = this.field1403 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1409 == 0) {
            var2 -= this.field1410 * var2 / (((class96) this.field1430).field1324.length << 8);
        } else if (this.field1409 >= 0) {
            var2 -= this.field1401 * var2 / ((class96) this.field1430).field1324.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class106(class96 arg0, int arg1, int arg2) {
        this.field1430 = arg0;
        this.field1401 = arg0.field1325;
        this.field1405 = arg0.field1326;
        this.field1411 = arg0.field1327;
        this.field1415 = arg1;
        this.field1408 = arg2;
        this.field1404 = 8192;
        this.field1410 = 0;
        this.method2136();
    }

    public class106(class96 arg0, int arg1, int arg2, int arg3) {
        this.field1430 = arg0;
        this.field1401 = arg0.field1325;
        this.field1405 = arg0.field1326;
        this.field1411 = arg0.field1327;
        this.field1415 = arg1;
        this.field1408 = arg2;
        this.field1404 = arg3;
        this.field1410 = 0;
        this.method2136();
    }

    @ObfuscatedName("dp.e(Lcb;II)Ldp;")
    public static class106 method2134(class96 arg0, int arg1, int arg2) {
        return arg0.field1324 == null || arg0.field1324.length == 0 ? null : new class106(arg0, (int) ((long) arg0.field1323 * 256L * (long) arg1 / (long) (Statics.field3801 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dp.b(Lcb;III)Ldp;")
    public static class106 method2135(class96 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1324 == null || arg0.field1324.length == 0 ? null : new class106(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dp.l()V")
    public void method2136() {
        this.field1403 = this.field1408;
        this.field1406 = method2204(this.field1408, this.field1404);
        this.field1407 = method2167(this.field1408, this.field1404);
    }

    @ObfuscatedName("dp.g(I)V")
    public synchronized void method2252(int arg0) {
        this.field1409 = arg0;
    }

    @ObfuscatedName("dp.m(I)V")
    public synchronized void method2133(int arg0) {
        this.method2138(arg0 << 6, this.method2141());
    }

    @ObfuscatedName("dp.q(I)V")
    public synchronized void method2237(int arg0) {
        this.method2138(arg0, this.method2141());
    }

    @ObfuscatedName("dp.x(II)V")
    public synchronized void method2138(int arg0, int arg1) {
        this.field1408 = arg0;
        this.field1404 = arg1;
        this.field1412 = 0;
        this.method2136();
    }

    @ObfuscatedName("dp.u()I")
    public synchronized int method2140() {
        return this.field1408 == Integer.MIN_VALUE ? 0 : this.field1408;
    }

    @ObfuscatedName("dp.o()I")
    public synchronized int method2141() {
        return this.field1404 < 0 ? -1 : this.field1404;
    }

    @ObfuscatedName("dp.t(I)V")
    public synchronized void method2142(int arg0) {
        int var2 = ((class96) this.field1430).field1324.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1410 = arg0;
    }

    @ObfuscatedName("dp.v(Z)V")
    public synchronized void method2143(boolean arg0) {
        this.field1415 = (this.field1415 >>> 31) + (this.field1415 ^ this.field1415 >> 31);
        if (arg0) {
            this.field1415 = -this.field1415;
        }
    }

    @ObfuscatedName("dp.p()V")
    public void method2144() {
        if (this.field1412 == 0) {
            return;
        }
        if (this.field1408 == Integer.MIN_VALUE) {
            this.field1408 = 0;
        }
        this.field1412 = 0;
        this.method2136();
    }

    @ObfuscatedName("dp.z(II)V")
    public synchronized void method2145(int arg0, int arg1) {
        this.method2146(arg0, arg1, this.method2141());
    }

    @ObfuscatedName("dp.j(III)V")
    public synchronized void method2146(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2138(arg1, arg2);
            return;
        }
        int var4 = method2204(arg1, arg2);
        int var5 = method2167(arg1, arg2);
        if (this.field1406 == var4 && this.field1407 == var5) {
            this.field1412 = 0;
            return;
        }
        int var6 = arg1 - this.field1403;
        if (this.field1403 - arg1 > var6) {
            var6 = this.field1403 - arg1;
        }
        if (var4 - this.field1406 > var6) {
            var6 = var4 - this.field1406;
        }
        if (this.field1406 - var4 > var6) {
            var6 = this.field1406 - var4;
        }
        if (var5 - this.field1407 > var6) {
            var6 = var5 - this.field1407;
        }
        if (this.field1407 - var5 > var6) {
            var6 = this.field1407 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1412 = arg0;
        this.field1408 = arg1;
        this.field1404 = arg2;
        this.field1413 = (arg1 - this.field1403) / arg0;
        this.field1414 = (var4 - this.field1406) / arg0;
        this.field1402 = (var5 - this.field1407) / arg0;
    }

    @ObfuscatedName("dp.c(I)V")
    public synchronized void method2216(int arg0) {
        if (arg0 == 0) {
            this.method2237(0);
            this.method3812();
        } else if (this.field1406 == 0 && this.field1407 == 0) {
            this.field1412 = 0;
            this.field1408 = 0;
            this.field1403 = 0;
            this.method3812();
        } else {
            int var2 = -this.field1403;
            if (this.field1403 > var2) {
                var2 = this.field1403;
            }
            if (-this.field1406 > var2) {
                var2 = -this.field1406;
            }
            if (this.field1406 > var2) {
                var2 = this.field1406;
            }
            if (-this.field1407 > var2) {
                var2 = -this.field1407;
            }
            if (this.field1407 > var2) {
                var2 = this.field1407;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1412 = arg0;
            this.field1408 = Integer.MIN_VALUE;
            this.field1413 = -this.field1403 / arg0;
            this.field1414 = -this.field1406 / arg0;
            this.field1402 = -this.field1407 / arg0;
        }
    }

    @ObfuscatedName("dp.am(I)V")
    public synchronized void method2189(int arg0) {
        if (this.field1415 < 0) {
            this.field1415 = -arg0;
        } else {
            this.field1415 = arg0;
        }
    }

    @ObfuscatedName("dp.ae()I")
    public synchronized int method2149() {
        return this.field1415 < 0 ? -this.field1415 : this.field1415;
    }

    @ObfuscatedName("dp.ah()Z")
    public boolean method2150() {
        return this.field1410 < 0 || this.field1410 >= ((class96) this.field1430).field1324.length << 8;
    }

    @ObfuscatedName("dp.aq()Z")
    public boolean method2151() {
        return this.field1412 != 0;
    }

    @ObfuscatedName("dp.w()Lde;")
    public class108 method1914() {
        return null;
    }

    @ObfuscatedName("dp.d()Lde;")
    public class108 method1915() {
        return null;
    }

    @ObfuscatedName("dp.n()I")
    public int method1908() {
        return this.field1408 == 0 && this.field1412 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dp.s([III)V")
    public synchronized void method1917(int[] arg0, int arg1, int arg2) {
        if (this.field1408 == 0 && this.field1412 == 0) {
            this.method1919(arg2);
            return;
        }
        class96 var4 = (class96) this.field1430;
        int var5 = this.field1401 << 8;
        int var6 = this.field1405 << 8;
        int var7 = var4.field1324.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1409 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1410 < 0) {
            if (this.field1415 <= 0) {
                this.method2144();
                this.method3812();
                return;
            }
            this.field1410 = 0;
        }
        if (this.field1410 >= var7) {
            if (this.field1415 >= 0) {
                this.method2144();
                this.method3812();
                return;
            }
            this.field1410 = var7 - 1;
        }
        if (this.field1409 >= 0) {
            if (this.field1409 > 0) {
                if (this.field1411) {
                    label131: {
                        if (this.field1415 < 0) {
                            var9 = this.method2247(arg0, arg1, var5, var10, var4.field1324[this.field1401]);
                            if (this.field1410 >= var5) {
                                return;
                            }
                            this.field1410 = var5 + var5 - 1 - this.field1410;
                            this.field1415 = -this.field1415;
                            if (--this.field1409 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2180(arg0, var9, var6, var10, var4.field1324[this.field1405 - 1]);
                            if (this.field1410 < var6) {
                                return;
                            }
                            this.field1410 = var6 + var6 - 1 - this.field1410;
                            this.field1415 = -this.field1415;
                            if (--this.field1409 == 0) {
                                break;
                            }
                            var9 = this.method2247(arg0, var9, var5, var10, var4.field1324[this.field1401]);
                            if (this.field1410 >= var5) {
                                return;
                            }
                            this.field1410 = var5 + var5 - 1 - this.field1410;
                            this.field1415 = -this.field1415;
                        } while (--this.field1409 != 0);
                    }
                } else if (this.field1415 < 0) {
                    while (true) {
                        var9 = this.method2247(arg0, var9, var5, var10, var4.field1324[this.field1405 - 1]);
                        if (this.field1410 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1410) / var8;
                        if (var12 >= this.field1409) {
                            this.field1410 += this.field1409 * var8;
                            this.field1409 = 0;
                            break;
                        }
                        this.field1410 += var8 * var12;
                        this.field1409 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2180(arg0, var9, var6, var10, var4.field1324[this.field1401]);
                        if (this.field1410 < var6) {
                            return;
                        }
                        int var13 = (this.field1410 - var5) / var8;
                        if (var13 >= this.field1409) {
                            this.field1410 -= this.field1409 * var8;
                            this.field1409 = 0;
                            break;
                        }
                        this.field1410 -= var8 * var13;
                        this.field1409 -= var13;
                    }
                }
            }
            if (this.field1415 < 0) {
                this.method2247(arg0, var9, 0, var10, 0);
                if (this.field1410 < 0) {
                    this.field1410 = -1;
                    this.method2144();
                    this.method3812();
                }
            } else {
                this.method2180(arg0, var9, var7, var10, 0);
                if (this.field1410 >= var7) {
                    this.field1410 = var7;
                    this.method2144();
                    this.method3812();
                }
            }
        } else if (this.field1411) {
            if (this.field1415 < 0) {
                var9 = this.method2247(arg0, arg1, var5, var10, var4.field1324[this.field1401]);
                if (this.field1410 >= var5) {
                    return;
                }
                this.field1410 = var5 + var5 - 1 - this.field1410;
                this.field1415 = -this.field1415;
            }
            while (true) {
                int var11 = this.method2180(arg0, var9, var6, var10, var4.field1324[this.field1405 - 1]);
                if (this.field1410 < var6) {
                    return;
                }
                this.field1410 = var6 + var6 - 1 - this.field1410;
                this.field1415 = -this.field1415;
                var9 = this.method2247(arg0, var11, var5, var10, var4.field1324[this.field1401]);
                if (this.field1410 >= var5) {
                    return;
                }
                this.field1410 = var5 + var5 - 1 - this.field1410;
                this.field1415 = -this.field1415;
            }
        } else if (this.field1415 < 0) {
            while (true) {
                var9 = this.method2247(arg0, var9, var5, var10, var4.field1324[this.field1405 - 1]);
                if (this.field1410 >= var5) {
                    return;
                }
                this.field1410 = var6 - 1 - (var6 - 1 - this.field1410) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2180(arg0, var9, var6, var10, var4.field1324[this.field1401]);
                if (this.field1410 < var6) {
                    return;
                }
                this.field1410 = (this.field1410 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dp.k(I)V")
    public synchronized void method1919(int arg0) {
        if (this.field1412 > 0) {
            if (arg0 >= this.field1412) {
                if (this.field1408 == Integer.MIN_VALUE) {
                    this.field1408 = 0;
                    this.field1407 = 0;
                    this.field1406 = 0;
                    this.field1403 = 0;
                    this.method3812();
                    arg0 = this.field1412;
                }
                this.field1412 = 0;
                this.method2136();
            } else {
                this.field1403 += this.field1413 * arg0;
                this.field1406 += this.field1414 * arg0;
                this.field1407 += this.field1402 * arg0;
                this.field1412 -= arg0;
            }
        }
        class96 var2 = (class96) this.field1430;
        int var3 = this.field1401 << 8;
        int var4 = this.field1405 << 8;
        int var5 = var2.field1324.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1409 = 0;
        }
        if (this.field1410 < 0) {
            if (this.field1415 <= 0) {
                this.method2144();
                this.method3812();
                return;
            }
            this.field1410 = 0;
        }
        if (this.field1410 >= var5) {
            if (this.field1415 >= 0) {
                this.method2144();
                this.method3812();
                return;
            }
            this.field1410 = var5 - 1;
        }
        this.field1410 += this.field1415 * arg0;
        if (this.field1409 >= 0) {
            if (this.field1409 > 0) {
                if (this.field1411) {
                    label121: {
                        if (this.field1415 < 0) {
                            if (this.field1410 >= var3) {
                                return;
                            }
                            this.field1410 = var3 + var3 - 1 - this.field1410;
                            this.field1415 = -this.field1415;
                            if (--this.field1409 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1410 < var4) {
                                return;
                            }
                            this.field1410 = var4 + var4 - 1 - this.field1410;
                            this.field1415 = -this.field1415;
                            if (--this.field1409 == 0) {
                                break;
                            }
                            if (this.field1410 >= var3) {
                                return;
                            }
                            this.field1410 = var3 + var3 - 1 - this.field1410;
                            this.field1415 = -this.field1415;
                        } while (--this.field1409 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1415 < 0) {
                            if (this.field1410 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1410) / var6;
                            if (var7 >= this.field1409) {
                                this.field1410 += this.field1409 * var6;
                                this.field1409 = 0;
                                break label153;
                            }
                            this.field1410 += var6 * var7;
                            this.field1409 -= var7;
                        } else if (this.field1410 >= var4) {
                            int var8 = (this.field1410 - var3) / var6;
                            if (var8 >= this.field1409) {
                                this.field1410 -= this.field1409 * var6;
                                this.field1409 = 0;
                                break label153;
                            }
                            this.field1410 -= var6 * var8;
                            this.field1409 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1415 < 0) {
                if (this.field1410 < 0) {
                    this.field1410 = -1;
                    this.method2144();
                    this.method3812();
                }
            } else if (this.field1410 >= var5) {
                this.field1410 = var5;
                this.method2144();
                this.method3812();
            }
        } else if (this.field1411) {
            if (this.field1415 < 0) {
                if (this.field1410 >= var3) {
                    return;
                }
                this.field1410 = var3 + var3 - 1 - this.field1410;
                this.field1415 = -this.field1415;
            }
            while (this.field1410 >= var4) {
                this.field1410 = var4 + var4 - 1 - this.field1410;
                this.field1415 = -this.field1415;
                if (this.field1410 >= var3) {
                    return;
                }
                this.field1410 = var3 + var3 - 1 - this.field1410;
                this.field1415 = -this.field1415;
            }
        } else if (this.field1415 < 0) {
            if (this.field1410 >= var3) {
                return;
            }
            this.field1410 = var4 - 1 - (var4 - 1 - this.field1410) % var6;
        } else if (this.field1410 >= var4) {
            this.field1410 = (this.field1410 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dp.ab([IIIII)I")
    public int method2180(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1412 > 0) {
                int var6 = this.field1412 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1412 += arg1;
                if (this.field1415 == 256 && (this.field1410 & 0xFF) == 0) {
                    if (Statics.field1350) {
                        arg1 = method2165(0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, this.field1414, this.field1402, 0, var6, arg2, this);
                    } else {
                        arg1 = method2164(((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, this.field1413, 0, var6, arg2, this);
                    }
                } else if (Statics.field1350) {
                    arg1 = method2169(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, this.field1414, this.field1402, 0, var6, arg2, this, this.field1415, arg4);
                } else {
                    arg1 = method2168(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, this.field1413, 0, var6, arg2, this, this.field1415, arg4);
                }
                this.field1412 -= arg1;
                if (this.field1412 != 0) {
                    return arg1;
                }
                if (!this.method2156()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1415 == 256 && (this.field1410 & 0xFF) == 0) {
                if (Statics.field1350) {
                    return method2158(0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, 0, arg3, arg2, this);
                }
                return method2157(((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, 0, arg3, arg2, this);
            }
            if (Statics.field1350) {
                return method2130(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, 0, arg3, arg2, this, this.field1415, arg4);
            }
            return method2219(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, 0, arg3, arg2, this, this.field1415, arg4);
        }
    }

    @ObfuscatedName("dp.ar([IIIII)I")
    public int method2247(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1412 > 0) {
                int var6 = this.field1412 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1412 += arg1;
                if (this.field1415 == -256 && (this.field1410 & 0xFF) == 0) {
                    if (Statics.field1350) {
                        arg1 = method2244(0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, this.field1414, this.field1402, 0, var6, arg2, this);
                    } else {
                        arg1 = method2166(((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, this.field1413, 0, var6, arg2, this);
                    }
                } else if (Statics.field1350) {
                    arg1 = method2171(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, this.field1414, this.field1402, 0, var6, arg2, this, this.field1415, arg4);
                } else {
                    arg1 = method2170(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, this.field1413, 0, var6, arg2, this, this.field1415, arg4);
                }
                this.field1412 -= arg1;
                if (this.field1412 != 0) {
                    return arg1;
                }
                if (!this.method2156()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1415 == -256 && (this.field1410 & 0xFF) == 0) {
                if (Statics.field1350) {
                    return method2160(0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, 0, arg3, arg2, this);
                }
                return method2185(((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, 0, arg3, arg2, this);
            }
            if (Statics.field1350) {
                return method2153(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1406, this.field1407, 0, arg3, arg2, this, this.field1415, arg4);
            }
            return method2155(0, 0, ((class96) this.field1430).field1324, arg0, this.field1410, arg1, this.field1403, 0, arg3, arg2, this, this.field1415, arg4);
        }
    }

    @ObfuscatedName("dp.ao()Z")
    public boolean method2156() {
        int var1 = this.field1408;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2204(var1, this.field1404);
            var2 = method2167(var1, this.field1404);
        }
        if (this.field1403 != var1 || this.field1406 != var3 || this.field1407 != var2) {
            if (this.field1403 < var1) {
                this.field1413 = 1;
                this.field1412 = var1 - this.field1403;
            } else if (this.field1403 > var1) {
                this.field1413 = -1;
                this.field1412 = this.field1403 - var1;
            } else {
                this.field1413 = 0;
            }
            if (this.field1406 < var3) {
                this.field1414 = 1;
                if (this.field1412 == 0 || this.field1412 > var3 - this.field1406) {
                    this.field1412 = var3 - this.field1406;
                }
            } else if (this.field1406 > var3) {
                this.field1414 = -1;
                if (this.field1412 == 0 || this.field1412 > this.field1406 - var3) {
                    this.field1412 = this.field1406 - var3;
                }
            } else {
                this.field1414 = 0;
            }
            if (this.field1407 < var2) {
                this.field1402 = 1;
                if (this.field1412 == 0 || this.field1412 > var2 - this.field1407) {
                    this.field1412 = var2 - this.field1407;
                }
            } else if (this.field1407 > var2) {
                this.field1402 = -1;
                if (this.field1412 == 0 || this.field1412 > this.field1407 - var2) {
                    this.field1412 = this.field1407 - var2;
                }
            } else {
                this.field1402 = 0;
            }
            return false;
        } else if (this.field1408 == Integer.MIN_VALUE) {
            this.field1408 = 0;
            this.field1407 = 0;
            this.field1406 = 0;
            this.field1403 = 0;
            this.method3812();
            return true;
        } else {
            this.method2136();
            return false;
        }
    }

    @ObfuscatedName("dp.at([B[IIIIIIILdp;)I")
    public static int method2157(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1410 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.ad(I[B[IIIIIIIILdp;)I")
    public static int method2158(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1410 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dp.ai([B[IIIIIIILdp;)I")
    public static int method2185(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1410 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.ak(I[B[IIIIIIIILdp;)I")
    public static int method2160(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1410 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dp.au(II[B[IIIIIIILdp;II)I")
    public static int method2219(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1410 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.az(II[B[IIIIIIIILdp;II)I")
    public static int method2130(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1410 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dp.aw(II[B[IIIIIIILdp;II)I")
    public static int method2155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1410 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bv(II[B[IIIIIIIILdp;II)I")
    public static int method2153(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1410 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dp.bh([B[IIIIIIIILdp;)I")
    public static int method2164(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1406 += (var14 - arg3) * arg9.field1414;
        arg9.field1407 += (var14 - arg3) * arg9.field1402;
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
        arg9.field1403 = var12 >> 2;
        arg9.field1410 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.bq(I[B[IIIIIIIIIILdp;)I")
    public static int method2165(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1403 += (var19 - arg4) * arg12.field1413;
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
        arg12.field1406 = var15 >> 2;
        arg12.field1407 = var16 >> 2;
        arg12.field1410 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dp.bm([B[IIIIIIIILdp;)I")
    public static int method2166(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1406 += (var14 - arg3) * arg9.field1414;
        arg9.field1407 += (var14 - arg3) * arg9.field1402;
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
        arg9.field1403 = var12 >> 2;
        arg9.field1410 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dp.bw(I[B[IIIIIIIIIILdp;)I")
    public static int method2244(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1403 += (var19 - arg4) * arg12.field1413;
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
        arg12.field1406 = var15 >> 2;
        arg12.field1407 = var16 >> 2;
        arg12.field1410 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dp.bi(II[B[IIIIIIIILdp;II)I")
    public static int method2168(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1406 -= arg11.field1414 * arg5;
        arg11.field1407 -= arg11.field1402 * arg5;
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
        arg11.field1406 += arg11.field1414 * arg5;
        arg11.field1407 += arg11.field1402 * arg5;
        arg11.field1403 = arg6;
        arg11.field1410 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bb(II[B[IIIIIIIIIILdp;II)I")
    public static int method2169(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1403 -= arg13.field1413 * arg5;
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
        arg13.field1403 += arg13.field1413 * var27;
        arg13.field1406 = arg6;
        arg13.field1407 = arg7;
        arg13.field1410 = arg4;
        return var27;
    }

    @ObfuscatedName("dp.bd(II[B[IIIIIIIILdp;II)I")
    public static int method2170(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1406 -= arg11.field1414 * arg5;
        arg11.field1407 -= arg11.field1402 * arg5;
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
        arg11.field1406 += arg11.field1414 * arg5;
        arg11.field1407 += arg11.field1402 * arg5;
        arg11.field1403 = arg6;
        arg11.field1410 = arg4;
        return arg5;
    }

    @ObfuscatedName("dp.bu(II[B[IIIIIIIIIILdp;II)I")
    public static int method2171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1403 -= arg13.field1413 * arg5;
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
        arg13.field1403 += arg13.field1413 * var26;
        arg13.field1406 = arg6;
        arg13.field1407 = arg7;
        arg13.field1410 = arg4;
        return var26;
    }
}
