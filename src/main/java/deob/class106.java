package deob;

@ObfuscatedName("dd")
public class class106 extends class108 {

    @ObfuscatedName("dd.v")
    public int field1414;

    @ObfuscatedName("dd.s")
    public int field1406;

    @ObfuscatedName("dd.o")
    public int field1407;

    @ObfuscatedName("dd.k")
    public int field1413;

    @ObfuscatedName("dd.u")
    public int field1408;

    @ObfuscatedName("dd.i")
    public int field1410;

    @ObfuscatedName("dd.t")
    public int field1411;

    @ObfuscatedName("dd.p")
    public int field1412;

    @ObfuscatedName("dd.l")
    public int field1419;

    @ObfuscatedName("dd.b")
    public int field1405;

    @ObfuscatedName("dd.c")
    public boolean field1415;

    @ObfuscatedName("dd.d")
    public int field1416;

    @ObfuscatedName("dd.a")
    public int field1417;

    @ObfuscatedName("dd.z")
    public int field1409;

    @ObfuscatedName("dd.e")
    public int field1418;

    @ObfuscatedName("dd.v(II)I")
    public static int method2267(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dd.s(II)I")
    public static int method2135(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dd.bx()I")
    public int method2143() {
        int var1 = this.field1408 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1412 == 0) {
            var2 -= this.field1414 * var2 / (((class96) this.field1434).field1330.length << 8);
        } else if (this.field1412 >= 0) {
            var2 -= this.field1419 * var2 / ((class96) this.field1434).field1330.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class106(class96 arg0, int arg1, int arg2) {
        this.field1434 = arg0;
        this.field1419 = arg0.field1329;
        this.field1405 = arg0.field1328;
        this.field1415 = arg0.field1331;
        this.field1406 = arg1;
        this.field1407 = arg2;
        this.field1413 = 8192;
        this.field1414 = 0;
        this.method2140();
    }

    public class106(class96 arg0, int arg1, int arg2, int arg3) {
        this.field1434 = arg0;
        this.field1419 = arg0.field1329;
        this.field1405 = arg0.field1328;
        this.field1415 = arg0.field1331;
        this.field1406 = arg1;
        this.field1407 = arg2;
        this.field1413 = arg3;
        this.field1414 = 0;
        this.method2140();
    }

    @ObfuscatedName("dd.o(Lcq;II)Ldd;")
    public static class106 method2138(class96 arg0, int arg1, int arg2) {
        return arg0.field1330 == null || arg0.field1330.length == 0 ? null : new class106(arg0, (int) ((long) arg0.field1327 * 256L * (long) arg1 / (long) (Statics.field66 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dd.k(Lcq;III)Ldd;")
    public static class106 method2139(class96 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1330 == null || arg0.field1330.length == 0 ? null : new class106(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dd.u()V")
    public void method2140() {
        this.field1408 = this.field1407;
        this.field1410 = method2267(this.field1407, this.field1413);
        this.field1411 = method2135(this.field1407, this.field1413);
    }

    @ObfuscatedName("dd.a(I)V")
    public synchronized void method2268(int arg0) {
        this.field1412 = arg0;
    }

    @ObfuscatedName("dd.e(I)V")
    public synchronized void method2142(int arg0) {
        this.method2144(arg0 << 6, this.method2146());
    }

    @ObfuscatedName("dd.q(I)V")
    public synchronized void method2250(int arg0) {
        this.method2144(arg0, this.method2146());
    }

    @ObfuscatedName("dd.j(II)V")
    public synchronized void method2144(int arg0, int arg1) {
        this.field1407 = arg0;
        this.field1413 = arg1;
        this.field1416 = 0;
        this.method2140();
    }

    @ObfuscatedName("dd.y()I")
    public synchronized int method2145() {
        return this.field1407 == Integer.MIN_VALUE ? 0 : this.field1407;
    }

    @ObfuscatedName("dd.m()I")
    public synchronized int method2146() {
        return this.field1413 < 0 ? -1 : this.field1413;
    }

    @ObfuscatedName("dd.h(I)V")
    public synchronized void method2147(int arg0) {
        int var2 = ((class96) this.field1434).field1330.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1414 = arg0;
    }

    @ObfuscatedName("dd.x(Z)V")
    public synchronized void method2257(boolean arg0) {
        this.field1406 = (this.field1406 >>> 31) + (this.field1406 ^ this.field1406 >> 31);
        if (arg0) {
            this.field1406 = -this.field1406;
        }
    }

    @ObfuscatedName("dd.f()V")
    public void method2149() {
        if (this.field1416 == 0) {
            return;
        }
        if (this.field1407 == Integer.MIN_VALUE) {
            this.field1407 = 0;
        }
        this.field1416 = 0;
        this.method2140();
    }

    @ObfuscatedName("dd.r(II)V")
    public synchronized void method2150(int arg0, int arg1) {
        this.method2151(arg0, arg1, this.method2146());
    }

    @ObfuscatedName("dd.n(III)V")
    public synchronized void method2151(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2144(arg1, arg2);
            return;
        }
        int var4 = method2267(arg1, arg2);
        int var5 = method2135(arg1, arg2);
        if (this.field1410 == var4 && this.field1411 == var5) {
            this.field1416 = 0;
            return;
        }
        int var6 = arg1 - this.field1408;
        if (this.field1408 - arg1 > var6) {
            var6 = this.field1408 - arg1;
        }
        if (var4 - this.field1410 > var6) {
            var6 = var4 - this.field1410;
        }
        if (this.field1410 - var4 > var6) {
            var6 = this.field1410 - var4;
        }
        if (var5 - this.field1411 > var6) {
            var6 = var5 - this.field1411;
        }
        if (this.field1411 - var5 > var6) {
            var6 = this.field1411 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1416 = arg0;
        this.field1407 = arg1;
        this.field1413 = arg2;
        this.field1417 = (arg1 - this.field1408) / arg0;
        this.field1409 = (var4 - this.field1410) / arg0;
        this.field1418 = (var5 - this.field1411) / arg0;
    }

    @ObfuscatedName("dd.g(I)V")
    public synchronized void method2253(int arg0) {
        if (arg0 == 0) {
            this.method2250(0);
            this.method3787();
        } else if (this.field1410 == 0 && this.field1411 == 0) {
            this.field1416 = 0;
            this.field1407 = 0;
            this.field1408 = 0;
            this.method3787();
        } else {
            int var2 = -this.field1408;
            if (this.field1408 > var2) {
                var2 = this.field1408;
            }
            if (-this.field1410 > var2) {
                var2 = -this.field1410;
            }
            if (this.field1410 > var2) {
                var2 = this.field1410;
            }
            if (-this.field1411 > var2) {
                var2 = -this.field1411;
            }
            if (this.field1411 > var2) {
                var2 = this.field1411;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1416 = arg0;
            this.field1407 = Integer.MIN_VALUE;
            this.field1417 = -this.field1408 / arg0;
            this.field1409 = -this.field1410 / arg0;
            this.field1418 = -this.field1411 / arg0;
        }
    }

    @ObfuscatedName("dd.ab(I)V")
    public synchronized void method2153(int arg0) {
        if (this.field1406 < 0) {
            this.field1406 = -arg0;
        } else {
            this.field1406 = arg0;
        }
    }

    @ObfuscatedName("dd.ao()I")
    public synchronized int method2238() {
        return this.field1406 < 0 ? -this.field1406 : this.field1406;
    }

    @ObfuscatedName("dd.an()Z")
    public boolean method2154() {
        return this.field1414 < 0 || this.field1414 >= ((class96) this.field1434).field1330.length << 8;
    }

    @ObfuscatedName("dd.ay()Z")
    public boolean method2155() {
        return this.field1416 != 0;
    }

    @ObfuscatedName("dd.i()Ldm;")
    public class108 method1899() {
        return null;
    }

    @ObfuscatedName("dd.t()Ldm;")
    public class108 method1900() {
        return null;
    }

    @ObfuscatedName("dd.c()I")
    public int method1901() {
        return this.field1407 == 0 && this.field1416 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dd.w([III)V")
    public synchronized void method1933(int[] arg0, int arg1, int arg2) {
        if (this.field1407 == 0 && this.field1416 == 0) {
            this.method1904(arg2);
            return;
        }
        class96 var4 = (class96) this.field1434;
        int var5 = this.field1419 << 8;
        int var6 = this.field1405 << 8;
        int var7 = var4.field1330.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1412 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1414 < 0) {
            if (this.field1406 <= 0) {
                this.method2149();
                this.method3787();
                return;
            }
            this.field1414 = 0;
        }
        if (this.field1414 >= var7) {
            if (this.field1406 >= 0) {
                this.method2149();
                this.method3787();
                return;
            }
            this.field1414 = var7 - 1;
        }
        if (this.field1412 >= 0) {
            if (this.field1412 > 0) {
                if (this.field1415) {
                    label131: {
                        if (this.field1406 < 0) {
                            var9 = this.method2160(arg0, arg1, var5, var10, var4.field1330[this.field1419]);
                            if (this.field1414 >= var5) {
                                return;
                            }
                            this.field1414 = var5 + var5 - 1 - this.field1414;
                            this.field1406 = -this.field1406;
                            if (--this.field1412 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2196(arg0, var9, var6, var10, var4.field1330[this.field1405 - 1]);
                            if (this.field1414 < var6) {
                                return;
                            }
                            this.field1414 = var6 + var6 - 1 - this.field1414;
                            this.field1406 = -this.field1406;
                            if (--this.field1412 == 0) {
                                break;
                            }
                            var9 = this.method2160(arg0, var9, var5, var10, var4.field1330[this.field1419]);
                            if (this.field1414 >= var5) {
                                return;
                            }
                            this.field1414 = var5 + var5 - 1 - this.field1414;
                            this.field1406 = -this.field1406;
                        } while (--this.field1412 != 0);
                    }
                } else if (this.field1406 < 0) {
                    while (true) {
                        var9 = this.method2160(arg0, var9, var5, var10, var4.field1330[this.field1405 - 1]);
                        if (this.field1414 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1414) / var8;
                        if (var12 >= this.field1412) {
                            this.field1414 += this.field1412 * var8;
                            this.field1412 = 0;
                            break;
                        }
                        this.field1414 += var8 * var12;
                        this.field1412 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2196(arg0, var9, var6, var10, var4.field1330[this.field1419]);
                        if (this.field1414 < var6) {
                            return;
                        }
                        int var13 = (this.field1414 - var5) / var8;
                        if (var13 >= this.field1412) {
                            this.field1414 -= this.field1412 * var8;
                            this.field1412 = 0;
                            break;
                        }
                        this.field1414 -= var8 * var13;
                        this.field1412 -= var13;
                    }
                }
            }
            if (this.field1406 < 0) {
                this.method2160(arg0, var9, 0, var10, 0);
                if (this.field1414 < 0) {
                    this.field1414 = -1;
                    this.method2149();
                    this.method3787();
                }
            } else {
                this.method2196(arg0, var9, var7, var10, 0);
                if (this.field1414 >= var7) {
                    this.field1414 = var7;
                    this.method2149();
                    this.method3787();
                }
            }
        } else if (this.field1415) {
            if (this.field1406 < 0) {
                var9 = this.method2160(arg0, arg1, var5, var10, var4.field1330[this.field1419]);
                if (this.field1414 >= var5) {
                    return;
                }
                this.field1414 = var5 + var5 - 1 - this.field1414;
                this.field1406 = -this.field1406;
            }
            while (true) {
                int var11 = this.method2196(arg0, var9, var6, var10, var4.field1330[this.field1405 - 1]);
                if (this.field1414 < var6) {
                    return;
                }
                this.field1414 = var6 + var6 - 1 - this.field1414;
                this.field1406 = -this.field1406;
                var9 = this.method2160(arg0, var11, var5, var10, var4.field1330[this.field1419]);
                if (this.field1414 >= var5) {
                    return;
                }
                this.field1414 = var5 + var5 - 1 - this.field1414;
                this.field1406 = -this.field1406;
            }
        } else if (this.field1406 < 0) {
            while (true) {
                var9 = this.method2160(arg0, var9, var5, var10, var4.field1330[this.field1405 - 1]);
                if (this.field1414 >= var5) {
                    return;
                }
                this.field1414 = var6 - 1 - (var6 - 1 - this.field1414) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2196(arg0, var9, var6, var10, var4.field1330[this.field1419]);
                if (this.field1414 < var6) {
                    return;
                }
                this.field1414 = (this.field1414 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dd.z(I)V")
    public synchronized void method1904(int arg0) {
        if (this.field1416 > 0) {
            if (arg0 >= this.field1416) {
                if (this.field1407 == Integer.MIN_VALUE) {
                    this.field1407 = 0;
                    this.field1411 = 0;
                    this.field1410 = 0;
                    this.field1408 = 0;
                    this.method3787();
                    arg0 = this.field1416;
                }
                this.field1416 = 0;
                this.method2140();
            } else {
                this.field1408 += this.field1417 * arg0;
                this.field1410 += this.field1409 * arg0;
                this.field1411 += this.field1418 * arg0;
                this.field1416 -= arg0;
            }
        }
        class96 var2 = (class96) this.field1434;
        int var3 = this.field1419 << 8;
        int var4 = this.field1405 << 8;
        int var5 = var2.field1330.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1412 = 0;
        }
        if (this.field1414 < 0) {
            if (this.field1406 <= 0) {
                this.method2149();
                this.method3787();
                return;
            }
            this.field1414 = 0;
        }
        if (this.field1414 >= var5) {
            if (this.field1406 >= 0) {
                this.method2149();
                this.method3787();
                return;
            }
            this.field1414 = var5 - 1;
        }
        this.field1414 += this.field1406 * arg0;
        if (this.field1412 >= 0) {
            if (this.field1412 > 0) {
                if (this.field1415) {
                    label121: {
                        if (this.field1406 < 0) {
                            if (this.field1414 >= var3) {
                                return;
                            }
                            this.field1414 = var3 + var3 - 1 - this.field1414;
                            this.field1406 = -this.field1406;
                            if (--this.field1412 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1414 < var4) {
                                return;
                            }
                            this.field1414 = var4 + var4 - 1 - this.field1414;
                            this.field1406 = -this.field1406;
                            if (--this.field1412 == 0) {
                                break;
                            }
                            if (this.field1414 >= var3) {
                                return;
                            }
                            this.field1414 = var3 + var3 - 1 - this.field1414;
                            this.field1406 = -this.field1406;
                        } while (--this.field1412 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1406 < 0) {
                            if (this.field1414 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1414) / var6;
                            if (var7 >= this.field1412) {
                                this.field1414 += this.field1412 * var6;
                                this.field1412 = 0;
                                break label153;
                            }
                            this.field1414 += var6 * var7;
                            this.field1412 -= var7;
                        } else if (this.field1414 >= var4) {
                            int var8 = (this.field1414 - var3) / var6;
                            if (var8 >= this.field1412) {
                                this.field1414 -= this.field1412 * var6;
                                this.field1412 = 0;
                                break label153;
                            }
                            this.field1414 -= var6 * var8;
                            this.field1412 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1406 < 0) {
                if (this.field1414 < 0) {
                    this.field1414 = -1;
                    this.method2149();
                    this.method3787();
                }
            } else if (this.field1414 >= var5) {
                this.field1414 = var5;
                this.method2149();
                this.method3787();
            }
        } else if (this.field1415) {
            if (this.field1406 < 0) {
                if (this.field1414 >= var3) {
                    return;
                }
                this.field1414 = var3 + var3 - 1 - this.field1414;
                this.field1406 = -this.field1406;
            }
            while (this.field1414 >= var4) {
                this.field1414 = var4 + var4 - 1 - this.field1414;
                this.field1406 = -this.field1406;
                if (this.field1414 >= var3) {
                    return;
                }
                this.field1414 = var3 + var3 - 1 - this.field1414;
                this.field1406 = -this.field1406;
            }
        } else if (this.field1406 < 0) {
            if (this.field1414 >= var3) {
                return;
            }
            this.field1414 = var4 - 1 - (var4 - 1 - this.field1414) % var6;
        } else if (this.field1414 >= var4) {
            this.field1414 = (this.field1414 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dd.ae([IIIII)I")
    public int method2196(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1416 > 0) {
                int var6 = this.field1416 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1416 += arg1;
                if (this.field1406 == 256 && (this.field1414 & 0xFF) == 0) {
                    if (Statics.field1365) {
                        arg1 = method2161(0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, this.field1409, this.field1418, 0, var6, arg2, this);
                    } else {
                        arg1 = method2241(((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, this.field1417, 0, var6, arg2, this);
                    }
                } else if (Statics.field1365) {
                    arg1 = method2172(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, this.field1409, this.field1418, 0, var6, arg2, this, this.field1406, arg4);
                } else {
                    arg1 = method2171(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, this.field1417, 0, var6, arg2, this, this.field1406, arg4);
                }
                this.field1416 -= arg1;
                if (this.field1416 != 0) {
                    return arg1;
                }
                if (!this.method2231()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1406 == 256 && (this.field1414 & 0xFF) == 0) {
                if (Statics.field1365) {
                    return method2259(0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, 0, arg3, arg2, this);
                }
                return method2247(((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, 0, arg3, arg2, this);
            }
            if (Statics.field1365) {
                return method2165(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, 0, arg3, arg2, this, this.field1406, arg4);
            }
            return method2164(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, 0, arg3, arg2, this, this.field1406, arg4);
        }
    }

    @ObfuscatedName("dd.ap([IIIII)I")
    public int method2160(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1416 > 0) {
                int var6 = this.field1416 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1416 += arg1;
                if (this.field1406 == -256 && (this.field1414 & 0xFF) == 0) {
                    if (Statics.field1365) {
                        arg1 = method2170(0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, this.field1409, this.field1418, 0, var6, arg2, this);
                    } else {
                        arg1 = method2169(((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, this.field1417, 0, var6, arg2, this);
                    }
                } else if (Statics.field1365) {
                    arg1 = method2187(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, this.field1409, this.field1418, 0, var6, arg2, this, this.field1406, arg4);
                } else {
                    arg1 = method2173(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, this.field1417, 0, var6, arg2, this, this.field1406, arg4);
                }
                this.field1416 -= arg1;
                if (this.field1416 != 0) {
                    return arg1;
                }
                if (!this.method2231()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1406 == -256 && (this.field1414 & 0xFF) == 0) {
                if (Statics.field1365) {
                    return method2163(0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, 0, arg3, arg2, this);
                }
                return method2162(((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, 0, arg3, arg2, this);
            }
            if (Statics.field1365) {
                return method2167(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1410, this.field1411, 0, arg3, arg2, this, this.field1406, arg4);
            }
            return method2166(0, 0, ((class96) this.field1434).field1330, arg0, this.field1414, arg1, this.field1408, 0, arg3, arg2, this, this.field1406, arg4);
        }
    }

    @ObfuscatedName("dd.ai()Z")
    public boolean method2231() {
        int var1 = this.field1407;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2267(var1, this.field1413);
            var2 = method2135(var1, this.field1413);
        }
        if (this.field1408 != var1 || this.field1410 != var3 || this.field1411 != var2) {
            if (this.field1408 < var1) {
                this.field1417 = 1;
                this.field1416 = var1 - this.field1408;
            } else if (this.field1408 > var1) {
                this.field1417 = -1;
                this.field1416 = this.field1408 - var1;
            } else {
                this.field1417 = 0;
            }
            if (this.field1410 < var3) {
                this.field1409 = 1;
                if (this.field1416 == 0 || this.field1416 > var3 - this.field1410) {
                    this.field1416 = var3 - this.field1410;
                }
            } else if (this.field1410 > var3) {
                this.field1409 = -1;
                if (this.field1416 == 0 || this.field1416 > this.field1410 - var3) {
                    this.field1416 = this.field1410 - var3;
                }
            } else {
                this.field1409 = 0;
            }
            if (this.field1411 < var2) {
                this.field1418 = 1;
                if (this.field1416 == 0 || this.field1416 > var2 - this.field1411) {
                    this.field1416 = var2 - this.field1411;
                }
            } else if (this.field1411 > var2) {
                this.field1418 = -1;
                if (this.field1416 == 0 || this.field1416 > this.field1411 - var2) {
                    this.field1416 = this.field1411 - var2;
                }
            } else {
                this.field1418 = 0;
            }
            return false;
        } else if (this.field1407 == Integer.MIN_VALUE) {
            this.field1407 = 0;
            this.field1411 = 0;
            this.field1410 = 0;
            this.field1408 = 0;
            this.method3787();
            return true;
        } else {
            this.method2140();
            return false;
        }
    }

    @ObfuscatedName("dd.aa([B[IIIIIIILdd;)I")
    public static int method2247(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1414 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dd.bg(I[B[IIIIIIIILdd;)I")
    public static int method2259(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1414 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dd.ba([B[IIIIIIILdd;)I")
    public static int method2162(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1414 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dd.bw(I[B[IIIIIIIILdd;)I")
    public static int method2163(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1414 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dd.bh(II[B[IIIIIIILdd;II)I")
    public static int method2164(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1414 = arg4;
        return arg5;
    }

    @ObfuscatedName("dd.bk(II[B[IIIIIIIILdd;II)I")
    public static int method2165(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1414 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dd.bp(II[B[IIIIIIILdd;II)I")
    public static int method2166(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1414 = arg4;
        return arg5;
    }

    @ObfuscatedName("dd.bf(II[B[IIIIIIIILdd;II)I")
    public static int method2167(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1414 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dd.bb([B[IIIIIIIILdd;)I")
    public static int method2241(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1410 += (var14 - arg3) * arg9.field1409;
        arg9.field1411 += (var14 - arg3) * arg9.field1418;
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
        arg9.field1408 = var12 >> 2;
        arg9.field1414 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dd.bj(I[B[IIIIIIIIIILdd;)I")
    public static int method2161(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1408 += (var19 - arg4) * arg12.field1417;
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
        arg12.field1410 = var15 >> 2;
        arg12.field1411 = var16 >> 2;
        arg12.field1414 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dd.by([B[IIIIIIIILdd;)I")
    public static int method2169(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1410 += (var14 - arg3) * arg9.field1409;
        arg9.field1411 += (var14 - arg3) * arg9.field1418;
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
        arg9.field1408 = var12 >> 2;
        arg9.field1414 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dd.bv(I[B[IIIIIIIIIILdd;)I")
    public static int method2170(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1408 += (var19 - arg4) * arg12.field1417;
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
        arg12.field1410 = var15 >> 2;
        arg12.field1411 = var16 >> 2;
        arg12.field1414 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dd.bn(II[B[IIIIIIIILdd;II)I")
    public static int method2171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1410 -= arg11.field1409 * arg5;
        arg11.field1411 -= arg11.field1418 * arg5;
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
        arg11.field1410 += arg11.field1409 * arg5;
        arg11.field1411 += arg11.field1418 * arg5;
        arg11.field1408 = arg6;
        arg11.field1414 = arg4;
        return arg5;
    }

    @ObfuscatedName("dd.bq(II[B[IIIIIIIIIILdd;II)I")
    public static int method2172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1408 -= arg13.field1417 * arg5;
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
        arg13.field1408 += arg13.field1417 * var27;
        arg13.field1410 = arg6;
        arg13.field1411 = arg7;
        arg13.field1414 = arg4;
        return var27;
    }

    @ObfuscatedName("dd.bt(II[B[IIIIIIIILdd;II)I")
    public static int method2173(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1410 -= arg11.field1409 * arg5;
        arg11.field1411 -= arg11.field1418 * arg5;
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
        arg11.field1410 += arg11.field1409 * arg5;
        arg11.field1411 += arg11.field1418 * arg5;
        arg11.field1408 = arg6;
        arg11.field1414 = arg4;
        return arg5;
    }

    @ObfuscatedName("dd.bm(II[B[IIIIIIIIIILdd;II)I")
    public static int method2187(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1408 -= arg13.field1417 * arg5;
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
        arg13.field1408 += arg13.field1417 * var26;
        arg13.field1410 = arg6;
        arg13.field1411 = arg7;
        arg13.field1414 = arg4;
        return var26;
    }
}
