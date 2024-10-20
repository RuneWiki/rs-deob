package deob;

@ObfuscatedName("cd")
public class class104 extends class106 {

    @ObfuscatedName("cd.m")
    public int field1382;

    @ObfuscatedName("cd.q")
    public int field1381;

    @ObfuscatedName("cd.b")
    public int field1393;

    @ObfuscatedName("cd.f")
    public int field1383;

    @ObfuscatedName("cd.n")
    public int field1384;

    @ObfuscatedName("cd.h")
    public int field1385;

    @ObfuscatedName("cd.x")
    public int field1389;

    @ObfuscatedName("cd.j")
    public int field1387;

    @ObfuscatedName("cd.a")
    public int field1388;

    @ObfuscatedName("cd.l")
    public int field1386;

    @ObfuscatedName("cd.d")
    public boolean field1390;

    @ObfuscatedName("cd.s")
    public int field1380;

    @ObfuscatedName("cd.p")
    public int field1392;

    @ObfuscatedName("cd.g")
    public int field1394;

    @ObfuscatedName("cd.y")
    public int field1391;

    @ObfuscatedName("cd.w(II)I")
    public static int method2190(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("cd.m(II)I")
    public static int method2206(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("cd.ak()I")
    public int method2249() {
        int var1 = this.field1384 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1387 == 0) {
            var2 -= this.field1382 * var2 / (((class94) this.field1409).field1306.length << 8);
        } else if (this.field1387 >= 0) {
            var2 -= this.field1388 * var2 / ((class94) this.field1409).field1306.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class104(class94 arg0, int arg1, int arg2) {
        this.field1409 = arg0;
        this.field1388 = arg0.field1304;
        this.field1386 = arg0.field1307;
        this.field1390 = arg0.field1305;
        this.field1381 = arg1;
        this.field1393 = arg2;
        this.field1383 = 8192;
        this.field1382 = 0;
        this.method2175();
    }

    public class104(class94 arg0, int arg1, int arg2, int arg3) {
        this.field1409 = arg0;
        this.field1388 = arg0.field1304;
        this.field1386 = arg0.field1307;
        this.field1390 = arg0.field1305;
        this.field1381 = arg1;
        this.field1393 = arg2;
        this.field1383 = arg3;
        this.field1382 = 0;
        this.method2175();
    }

    @ObfuscatedName("cd.q(Lcg;II)Lcd;")
    public static class104 method2185(class94 arg0, int arg1, int arg2) {
        return arg0.field1306 == null || arg0.field1306.length == 0 ? null : new class104(arg0, (int) ((long) arg0.field1308 * 256L * (long) arg1 / (long) (Statics.field1331 * 100)), arg2 << 6);
    }

    @ObfuscatedName("cd.x(Lcg;III)Lcd;")
    public static class104 method2142(class94 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1306 == null || arg0.field1306.length == 0 ? null : new class104(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cd.j()V")
    public void method2175() {
        this.field1384 = this.field1393;
        this.field1385 = method2190(this.field1393, this.field1383);
        this.field1389 = method2206(this.field1393, this.field1383);
    }

    @ObfuscatedName("cd.p(I)V")
    public synchronized void method2144(int arg0) {
        this.field1387 = arg0;
    }

    @ObfuscatedName("cd.y(I)V")
    public synchronized void method2145(int arg0) {
        this.method2147(arg0 << 6, this.method2149());
    }

    @ObfuscatedName("cd.c(I)V")
    public synchronized void method2146(int arg0) {
        this.method2147(arg0, this.method2149());
    }

    @ObfuscatedName("cd.e(II)V")
    public synchronized void method2147(int arg0, int arg1) {
        this.field1393 = arg0;
        this.field1383 = arg1;
        this.field1380 = 0;
        this.method2175();
    }

    @ObfuscatedName("cd.t()I")
    public synchronized int method2148() {
        return this.field1393 == Integer.MIN_VALUE ? 0 : this.field1393;
    }

    @ObfuscatedName("cd.u()I")
    public synchronized int method2149() {
        return this.field1383 < 0 ? -1 : this.field1383;
    }

    @ObfuscatedName("cd.i(I)V")
    public synchronized void method2150(int arg0) {
        int var2 = ((class94) this.field1409).field1306.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1382 = arg0;
    }

    @ObfuscatedName("cd.r(Z)V")
    public synchronized void method2151(boolean arg0) {
        this.field1381 = (this.field1381 >>> 31) + (this.field1381 ^ this.field1381 >> 31);
        if (arg0) {
            this.field1381 = -this.field1381;
        }
    }

    @ObfuscatedName("cd.v()V")
    public void method2152() {
        if (this.field1380 == 0) {
            return;
        }
        if (this.field1393 == Integer.MIN_VALUE) {
            this.field1393 = 0;
        }
        this.field1380 = 0;
        this.method2175();
    }

    @ObfuscatedName("cd.o(II)V")
    public synchronized void method2153(int arg0, int arg1) {
        this.method2154(arg0, arg1, this.method2149());
    }

    @ObfuscatedName("cd.ai(III)V")
    public synchronized void method2154(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2147(arg1, arg2);
            return;
        }
        int var4 = method2190(arg1, arg2);
        int var5 = method2206(arg1, arg2);
        if (this.field1385 == var4 && this.field1389 == var5) {
            this.field1380 = 0;
            return;
        }
        int var6 = arg1 - this.field1384;
        if (this.field1384 - arg1 > var6) {
            var6 = this.field1384 - arg1;
        }
        if (var4 - this.field1385 > var6) {
            var6 = var4 - this.field1385;
        }
        if (this.field1385 - var4 > var6) {
            var6 = this.field1385 - var4;
        }
        if (var5 - this.field1389 > var6) {
            var6 = var5 - this.field1389;
        }
        if (this.field1389 - var5 > var6) {
            var6 = this.field1389 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1380 = arg0;
        this.field1393 = arg1;
        this.field1383 = arg2;
        this.field1392 = (arg1 - this.field1384) / arg0;
        this.field1394 = (var4 - this.field1385) / arg0;
        this.field1391 = (var5 - this.field1389) / arg0;
    }

    @ObfuscatedName("cd.at(I)V")
    public synchronized void method2155(int arg0) {
        if (arg0 == 0) {
            this.method2146(0);
            this.method3782();
        } else if (this.field1385 == 0 && this.field1389 == 0) {
            this.field1380 = 0;
            this.field1393 = 0;
            this.field1384 = 0;
            this.method3782();
        } else {
            int var2 = -this.field1384;
            if (this.field1384 > var2) {
                var2 = this.field1384;
            }
            if (-this.field1385 > var2) {
                var2 = -this.field1385;
            }
            if (this.field1385 > var2) {
                var2 = this.field1385;
            }
            if (-this.field1389 > var2) {
                var2 = -this.field1389;
            }
            if (this.field1389 > var2) {
                var2 = this.field1389;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1380 = arg0;
            this.field1393 = Integer.MIN_VALUE;
            this.field1392 = -this.field1384 / arg0;
            this.field1394 = -this.field1385 / arg0;
            this.field1391 = -this.field1389 / arg0;
        }
    }

    @ObfuscatedName("cd.ad(I)V")
    public synchronized void method2156(int arg0) {
        if (this.field1381 < 0) {
            this.field1381 = -arg0;
        } else {
            this.field1381 = arg0;
        }
    }

    @ObfuscatedName("cd.ac()I")
    public synchronized int method2157() {
        return this.field1381 < 0 ? -this.field1381 : this.field1381;
    }

    @ObfuscatedName("cd.ay()Z")
    public boolean method2251() {
        return this.field1382 < 0 || this.field1382 >= ((class94) this.field1409).field1306.length << 8;
    }

    @ObfuscatedName("cd.an()Z")
    public boolean method2159() {
        return this.field1380 != 0;
    }

    @ObfuscatedName("cd.a()Ldu;")
    public class106 method1908() {
        return null;
    }

    @ObfuscatedName("cd.l()Ldu;")
    public class106 method1909() {
        return null;
    }

    @ObfuscatedName("cd.d()I")
    public int method1910() {
        return this.field1393 == 0 && this.field1380 == 0 ? 0 : 1;
    }

    @ObfuscatedName("cd.s([III)V")
    public synchronized void method1945(int[] arg0, int arg1, int arg2) {
        if (this.field1393 == 0 && this.field1380 == 0) {
            this.method1917(arg2);
            return;
        }
        class94 var4 = (class94) this.field1409;
        int var5 = this.field1388 << 8;
        int var6 = this.field1386 << 8;
        int var7 = var4.field1306.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1387 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1382 < 0) {
            if (this.field1381 <= 0) {
                this.method2152();
                this.method3782();
                return;
            }
            this.field1382 = 0;
        }
        if (this.field1382 >= var7) {
            if (this.field1381 >= 0) {
                this.method2152();
                this.method3782();
                return;
            }
            this.field1382 = var7 - 1;
        }
        if (this.field1387 >= 0) {
            if (this.field1387 > 0) {
                if (this.field1390) {
                    label131: {
                        if (this.field1381 < 0) {
                            var9 = this.method2205(arg0, arg1, var5, var10, var4.field1306[this.field1388]);
                            if (this.field1382 >= var5) {
                                return;
                            }
                            this.field1382 = var5 + var5 - 1 - this.field1382;
                            this.field1381 = -this.field1381;
                            if (--this.field1387 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2162(arg0, var9, var6, var10, var4.field1306[this.field1386 - 1]);
                            if (this.field1382 < var6) {
                                return;
                            }
                            this.field1382 = var6 + var6 - 1 - this.field1382;
                            this.field1381 = -this.field1381;
                            if (--this.field1387 == 0) {
                                break;
                            }
                            var9 = this.method2205(arg0, var9, var5, var10, var4.field1306[this.field1388]);
                            if (this.field1382 >= var5) {
                                return;
                            }
                            this.field1382 = var5 + var5 - 1 - this.field1382;
                            this.field1381 = -this.field1381;
                        } while (--this.field1387 != 0);
                    }
                } else if (this.field1381 < 0) {
                    while (true) {
                        var9 = this.method2205(arg0, var9, var5, var10, var4.field1306[this.field1386 - 1]);
                        if (this.field1382 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1382) / var8;
                        if (var12 >= this.field1387) {
                            this.field1382 += this.field1387 * var8;
                            this.field1387 = 0;
                            break;
                        }
                        this.field1382 += var8 * var12;
                        this.field1387 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2162(arg0, var9, var6, var10, var4.field1306[this.field1388]);
                        if (this.field1382 < var6) {
                            return;
                        }
                        int var13 = (this.field1382 - var5) / var8;
                        if (var13 >= this.field1387) {
                            this.field1382 -= this.field1387 * var8;
                            this.field1387 = 0;
                            break;
                        }
                        this.field1382 -= var8 * var13;
                        this.field1387 -= var13;
                    }
                }
            }
            if (this.field1381 < 0) {
                this.method2205(arg0, var9, 0, var10, 0);
                if (this.field1382 < 0) {
                    this.field1382 = -1;
                    this.method2152();
                    this.method3782();
                }
            } else {
                this.method2162(arg0, var9, var7, var10, 0);
                if (this.field1382 >= var7) {
                    this.field1382 = var7;
                    this.method2152();
                    this.method3782();
                }
            }
        } else if (this.field1390) {
            if (this.field1381 < 0) {
                var9 = this.method2205(arg0, arg1, var5, var10, var4.field1306[this.field1388]);
                if (this.field1382 >= var5) {
                    return;
                }
                this.field1382 = var5 + var5 - 1 - this.field1382;
                this.field1381 = -this.field1381;
            }
            while (true) {
                int var11 = this.method2162(arg0, var9, var6, var10, var4.field1306[this.field1386 - 1]);
                if (this.field1382 < var6) {
                    return;
                }
                this.field1382 = var6 + var6 - 1 - this.field1382;
                this.field1381 = -this.field1381;
                var9 = this.method2205(arg0, var11, var5, var10, var4.field1306[this.field1388]);
                if (this.field1382 >= var5) {
                    return;
                }
                this.field1382 = var5 + var5 - 1 - this.field1382;
                this.field1381 = -this.field1381;
            }
        } else if (this.field1381 < 0) {
            while (true) {
                var9 = this.method2205(arg0, var9, var5, var10, var4.field1306[this.field1386 - 1]);
                if (this.field1382 >= var5) {
                    return;
                }
                this.field1382 = var6 - 1 - (var6 - 1 - this.field1382) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2162(arg0, var9, var6, var10, var4.field1306[this.field1388]);
                if (this.field1382 < var6) {
                    return;
                }
                this.field1382 = (this.field1382 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("cd.g(I)V")
    public synchronized void method1917(int arg0) {
        if (this.field1380 > 0) {
            if (arg0 >= this.field1380) {
                if (this.field1393 == Integer.MIN_VALUE) {
                    this.field1393 = 0;
                    this.field1389 = 0;
                    this.field1385 = 0;
                    this.field1384 = 0;
                    this.method3782();
                    arg0 = this.field1380;
                }
                this.field1380 = 0;
                this.method2175();
            } else {
                this.field1384 += this.field1392 * arg0;
                this.field1385 += this.field1394 * arg0;
                this.field1389 += this.field1391 * arg0;
                this.field1380 -= arg0;
            }
        }
        class94 var2 = (class94) this.field1409;
        int var3 = this.field1388 << 8;
        int var4 = this.field1386 << 8;
        int var5 = var2.field1306.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1387 = 0;
        }
        if (this.field1382 < 0) {
            if (this.field1381 <= 0) {
                this.method2152();
                this.method3782();
                return;
            }
            this.field1382 = 0;
        }
        if (this.field1382 >= var5) {
            if (this.field1381 >= 0) {
                this.method2152();
                this.method3782();
                return;
            }
            this.field1382 = var5 - 1;
        }
        this.field1382 += this.field1381 * arg0;
        if (this.field1387 >= 0) {
            if (this.field1387 > 0) {
                if (this.field1390) {
                    label121: {
                        if (this.field1381 < 0) {
                            if (this.field1382 >= var3) {
                                return;
                            }
                            this.field1382 = var3 + var3 - 1 - this.field1382;
                            this.field1381 = -this.field1381;
                            if (--this.field1387 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1382 < var4) {
                                return;
                            }
                            this.field1382 = var4 + var4 - 1 - this.field1382;
                            this.field1381 = -this.field1381;
                            if (--this.field1387 == 0) {
                                break;
                            }
                            if (this.field1382 >= var3) {
                                return;
                            }
                            this.field1382 = var3 + var3 - 1 - this.field1382;
                            this.field1381 = -this.field1381;
                        } while (--this.field1387 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1381 < 0) {
                            if (this.field1382 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1382) / var6;
                            if (var7 >= this.field1387) {
                                this.field1382 += this.field1387 * var6;
                                this.field1387 = 0;
                                break label153;
                            }
                            this.field1382 += var6 * var7;
                            this.field1387 -= var7;
                        } else if (this.field1382 >= var4) {
                            int var8 = (this.field1382 - var3) / var6;
                            if (var8 >= this.field1387) {
                                this.field1382 -= this.field1387 * var6;
                                this.field1387 = 0;
                                break label153;
                            }
                            this.field1382 -= var6 * var8;
                            this.field1387 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1381 < 0) {
                if (this.field1382 < 0) {
                    this.field1382 = -1;
                    this.method2152();
                    this.method3782();
                }
            } else if (this.field1382 >= var5) {
                this.field1382 = var5;
                this.method2152();
                this.method3782();
            }
        } else if (this.field1390) {
            if (this.field1381 < 0) {
                if (this.field1382 >= var3) {
                    return;
                }
                this.field1382 = var3 + var3 - 1 - this.field1382;
                this.field1381 = -this.field1381;
            }
            while (this.field1382 >= var4) {
                this.field1382 = var4 + var4 - 1 - this.field1382;
                this.field1381 = -this.field1381;
                if (this.field1382 >= var3) {
                    return;
                }
                this.field1382 = var3 + var3 - 1 - this.field1382;
                this.field1381 = -this.field1381;
            }
        } else if (this.field1381 < 0) {
            if (this.field1382 >= var3) {
                return;
            }
            this.field1382 = var4 - 1 - (var4 - 1 - this.field1382) % var6;
        } else if (this.field1382 >= var4) {
            this.field1382 = (this.field1382 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("cd.ae([IIIII)I")
    public int method2162(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1380 > 0) {
                int var6 = this.field1380 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1380 += arg1;
                if (this.field1381 == 256 && (this.field1382 & 0xFF) == 0) {
                    if (Statics.field1322) {
                        arg1 = method2173(0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, this.field1394, this.field1391, 0, var6, arg2, this);
                    } else {
                        arg1 = method2234(((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, this.field1392, 0, var6, arg2, this);
                    }
                } else if (Statics.field1322) {
                    arg1 = method2265(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, this.field1394, this.field1391, 0, var6, arg2, this, this.field1381, arg4);
                } else {
                    arg1 = method2256(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, this.field1392, 0, var6, arg2, this, this.field1381, arg4);
                }
                this.field1380 -= arg1;
                if (this.field1380 != 0) {
                    return arg1;
                }
                if (!this.method2237()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1381 == 256 && (this.field1382 & 0xFF) == 0) {
                if (Statics.field1322) {
                    return method2180(0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, 0, arg3, arg2, this);
                }
                return method2165(((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, 0, arg3, arg2, this);
            }
            if (Statics.field1322) {
                return method2170(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, 0, arg3, arg2, this, this.field1381, arg4);
            }
            return method2169(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, 0, arg3, arg2, this, this.field1381, arg4);
        }
    }

    @ObfuscatedName("cd.au([IIIII)I")
    public int method2205(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1380 > 0) {
                int var6 = this.field1380 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1380 += arg1;
                if (this.field1381 == -256 && (this.field1382 & 0xFF) == 0) {
                    if (Statics.field1322) {
                        arg1 = method2202(0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, this.field1394, this.field1391, 0, var6, arg2, this);
                    } else {
                        arg1 = method2271(((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, this.field1392, 0, var6, arg2, this);
                    }
                } else if (Statics.field1322) {
                    arg1 = method2178(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, this.field1394, this.field1391, 0, var6, arg2, this, this.field1381, arg4);
                } else {
                    arg1 = method2177(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, this.field1392, 0, var6, arg2, this, this.field1381, arg4);
                }
                this.field1380 -= arg1;
                if (this.field1380 != 0) {
                    return arg1;
                }
                if (!this.method2237()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1381 == -256 && (this.field1382 & 0xFF) == 0) {
                if (Statics.field1322) {
                    return method2168(0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, 0, arg3, arg2, this);
                }
                return method2167(((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, 0, arg3, arg2, this);
            }
            if (Statics.field1322) {
                return method2240(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1385, this.field1389, 0, arg3, arg2, this, this.field1381, arg4);
            }
            return method2171(0, 0, ((class94) this.field1409).field1306, arg0, this.field1382, arg1, this.field1384, 0, arg3, arg2, this, this.field1381, arg4);
        }
    }

    @ObfuscatedName("cd.av()Z")
    public boolean method2237() {
        int var1 = this.field1393;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2190(var1, this.field1383);
            var2 = method2206(var1, this.field1383);
        }
        if (this.field1384 != var1 || this.field1385 != var3 || this.field1389 != var2) {
            if (this.field1384 < var1) {
                this.field1392 = 1;
                this.field1380 = var1 - this.field1384;
            } else if (this.field1384 > var1) {
                this.field1392 = -1;
                this.field1380 = this.field1384 - var1;
            } else {
                this.field1392 = 0;
            }
            if (this.field1385 < var3) {
                this.field1394 = 1;
                if (this.field1380 == 0 || this.field1380 > var3 - this.field1385) {
                    this.field1380 = var3 - this.field1385;
                }
            } else if (this.field1385 > var3) {
                this.field1394 = -1;
                if (this.field1380 == 0 || this.field1380 > this.field1385 - var3) {
                    this.field1380 = this.field1385 - var3;
                }
            } else {
                this.field1394 = 0;
            }
            if (this.field1389 < var2) {
                this.field1391 = 1;
                if (this.field1380 == 0 || this.field1380 > var2 - this.field1389) {
                    this.field1380 = var2 - this.field1389;
                }
            } else if (this.field1389 > var2) {
                this.field1391 = -1;
                if (this.field1380 == 0 || this.field1380 > this.field1389 - var2) {
                    this.field1380 = this.field1389 - var2;
                }
            } else {
                this.field1391 = 0;
            }
            return false;
        } else if (this.field1393 == Integer.MIN_VALUE) {
            this.field1393 = 0;
            this.field1389 = 0;
            this.field1385 = 0;
            this.field1384 = 0;
            this.method3782();
            return true;
        } else {
            this.method2175();
            return false;
        }
    }

    @ObfuscatedName("cd.ab([B[IIIIIIILcd;)I")
    public static int method2165(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
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
        arg8.field1382 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("cd.aa(I[B[IIIIIIIILcd;)I")
    public static int method2180(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
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
        arg10.field1382 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("cd.al([B[IIIIIIILcd;)I")
    public static int method2167(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
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
        arg8.field1382 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("cd.bc(I[B[IIIIIIIILcd;)I")
    public static int method2168(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
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
        arg10.field1382 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("cd.bo(II[B[IIIIIIILcd;II)I")
    public static int method2169(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
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
        arg10.field1382 = arg4;
        return arg5;
    }

    @ObfuscatedName("cd.bx(II[B[IIIIIIIILcd;II)I")
    public static int method2170(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
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
        arg11.field1382 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("cd.be(II[B[IIIIIIILcd;II)I")
    public static int method2171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
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
        arg10.field1382 = arg4;
        return arg5;
    }

    @ObfuscatedName("cd.br(II[B[IIIIIIIILcd;II)I")
    public static int method2240(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
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
        arg11.field1382 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("cd.bk([B[IIIIIIIILcd;)I")
    public static int method2234(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1385 += (var14 - arg3) * arg9.field1394;
        arg9.field1389 += (var14 - arg3) * arg9.field1391;
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
        arg9.field1384 = var12 >> 2;
        arg9.field1382 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("cd.bn(I[B[IIIIIIIIIILcd;)I")
    public static int method2173(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
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
        arg12.field1384 += (var19 - arg4) * arg12.field1392;
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
        arg12.field1385 = var15 >> 2;
        arg12.field1389 = var16 >> 2;
        arg12.field1382 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("cd.bp([B[IIIIIIIILcd;)I")
    public static int method2271(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1385 += (var14 - arg3) * arg9.field1394;
        arg9.field1389 += (var14 - arg3) * arg9.field1391;
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
        arg9.field1384 = var12 >> 2;
        arg9.field1382 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("cd.bu(I[B[IIIIIIIIIILcd;)I")
    public static int method2202(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
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
        arg12.field1384 += (var19 - arg4) * arg12.field1392;
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
        arg12.field1385 = var15 >> 2;
        arg12.field1389 = var16 >> 2;
        arg12.field1382 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("cd.by(II[B[IIIIIIIILcd;II)I")
    public static int method2256(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
        arg11.field1385 -= arg11.field1394 * arg5;
        arg11.field1389 -= arg11.field1391 * arg5;
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
        arg11.field1385 += arg11.field1394 * arg5;
        arg11.field1389 += arg11.field1391 * arg5;
        arg11.field1384 = arg6;
        arg11.field1382 = arg4;
        return arg5;
    }

    @ObfuscatedName("cd.bl(II[B[IIIIIIIIIILcd;II)I")
    public static int method2265(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
        arg13.field1384 -= arg13.field1392 * arg5;
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
        arg13.field1384 += arg13.field1392 * var27;
        arg13.field1385 = arg6;
        arg13.field1389 = arg7;
        arg13.field1382 = arg4;
        return var27;
    }

    @ObfuscatedName("cd.bs(II[B[IIIIIIIILcd;II)I")
    public static int method2177(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
        arg11.field1385 -= arg11.field1394 * arg5;
        arg11.field1389 -= arg11.field1391 * arg5;
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
        arg11.field1385 += arg11.field1394 * arg5;
        arg11.field1389 += arg11.field1391 * arg5;
        arg11.field1384 = arg6;
        arg11.field1382 = arg4;
        return arg5;
    }

    @ObfuscatedName("cd.bi(II[B[IIIIIIIIIILcd;II)I")
    public static int method2178(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
        arg13.field1384 -= arg13.field1392 * arg5;
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
        arg13.field1384 += arg13.field1392 * var26;
        arg13.field1385 = arg6;
        arg13.field1389 = arg7;
        arg13.field1382 = arg4;
        return var26;
    }
}
