package deob;

@ObfuscatedName("da")
public class class114 extends class116 {

    @ObfuscatedName("da.c")
    public int field1436;

    @ObfuscatedName("da.x")
    public int field1434;

    @ObfuscatedName("da.t")
    public int field1435;

    @ObfuscatedName("da.g")
    public int field1439;

    @ObfuscatedName("da.l")
    public int field1437;

    @ObfuscatedName("da.u")
    public int field1438;

    @ObfuscatedName("da.j")
    public int field1433;

    @ObfuscatedName("da.v")
    public int field1440;

    @ObfuscatedName("da.d")
    public int field1441;

    @ObfuscatedName("da.z")
    public int field1442;

    @ObfuscatedName("da.n")
    public boolean field1443;

    @ObfuscatedName("da.h")
    public int field1444;

    @ObfuscatedName("da.f")
    public int field1445;

    @ObfuscatedName("da.s")
    public int field1446;

    @ObfuscatedName("da.p")
    public int field1447;

    @ObfuscatedName("da.c(II)I")
    public static int method2457(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.x(II)I")
    public static int method2331(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.ah()I")
    public int method2332() {
        int var1 = this.field1437 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1440 == 0) {
            var2 -= this.field1436 * var2 / (((class104) this.field1462).field1357.length << 8);
        } else if (this.field1440 >= 0) {
            var2 -= this.field1441 * var2 / ((class104) this.field1462).field1357.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class114(class104 arg0, int arg1, int arg2) {
        this.field1462 = arg0;
        this.field1441 = arg0.field1355;
        this.field1442 = arg0.field1358;
        this.field1443 = arg0.field1359;
        this.field1434 = arg1;
        this.field1435 = arg2;
        this.field1439 = 8192;
        this.field1436 = 0;
        this.method2335();
    }

    public class114(class104 arg0, int arg1, int arg2, int arg3) {
        this.field1462 = arg0;
        this.field1441 = arg0.field1355;
        this.field1442 = arg0.field1358;
        this.field1443 = arg0.field1359;
        this.field1434 = arg1;
        this.field1435 = arg2;
        this.field1439 = arg3;
        this.field1436 = 0;
        this.method2335();
    }

    @ObfuscatedName("da.t(Lcg;II)Lda;")
    public static class114 method2333(class104 arg0, int arg1, int arg2) {
        return arg0.field1357 == null || arg0.field1357.length == 0 ? null : new class114(arg0, (int) ((long) arg0.field1356 * 256L * (long) arg1 / (long) (Statics.field29 * 100)), arg2 << 6);
    }

    @ObfuscatedName("da.g(Lcg;III)Lda;")
    public static class114 method2334(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1357 == null || arg0.field1357.length == 0 ? null : new class114(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("da.l()V")
    public void method2335() {
        this.field1437 = this.field1435;
        this.field1438 = method2457(this.field1435, this.field1439);
        this.field1433 = method2331(this.field1435, this.field1439);
    }

    @ObfuscatedName("da.z(I)V")
    public synchronized void method2336(int arg0) {
        this.field1440 = arg0;
    }

    @ObfuscatedName("da.p(I)V")
    public synchronized void method2337(int arg0) {
        this.method2352(arg0 << 6, this.method2341());
    }

    @ObfuscatedName("da.e(I)V")
    public synchronized void method2338(int arg0) {
        this.method2352(arg0, this.method2341());
    }

    @ObfuscatedName("da.i(II)V")
    public synchronized void method2352(int arg0, int arg1) {
        this.field1435 = arg0;
        this.field1439 = arg1;
        this.field1444 = 0;
        this.method2335();
    }

    @ObfuscatedName("da.q()I")
    public synchronized int method2340() {
        return this.field1435 == Integer.MIN_VALUE ? 0 : this.field1435;
    }

    @ObfuscatedName("da.r()I")
    public synchronized int method2341() {
        return this.field1439 < 0 ? -1 : this.field1439;
    }

    @ObfuscatedName("da.k(I)V")
    public synchronized void method2382(int arg0) {
        int var2 = ((class104) this.field1462).field1357.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1436 = arg0;
    }

    @ObfuscatedName("da.w(Z)V")
    public synchronized void method2366(boolean arg0) {
        this.field1434 = (this.field1434 >>> 31) + (this.field1434 ^ this.field1434 >> 31);
        if (arg0) {
            this.field1434 = -this.field1434;
        }
    }

    @ObfuscatedName("da.m()V")
    public void method2343() {
        if (this.field1444 == 0) {
            return;
        }
        if (this.field1435 == Integer.MIN_VALUE) {
            this.field1435 = 0;
        }
        this.field1444 = 0;
        this.method2335();
    }

    @ObfuscatedName("da.o(II)V")
    public synchronized void method2344(int arg0, int arg1) {
        this.method2345(arg0, arg1, this.method2341());
    }

    @ObfuscatedName("da.a(III)V")
    public synchronized void method2345(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2352(arg1, arg2);
            return;
        }
        int var4 = method2457(arg1, arg2);
        int var5 = method2331(arg1, arg2);
        if (this.field1438 == var4 && this.field1433 == var5) {
            this.field1444 = 0;
            return;
        }
        int var6 = arg1 - this.field1437;
        if (this.field1437 - arg1 > var6) {
            var6 = this.field1437 - arg1;
        }
        if (var4 - this.field1438 > var6) {
            var6 = var4 - this.field1438;
        }
        if (this.field1438 - var4 > var6) {
            var6 = this.field1438 - var4;
        }
        if (var5 - this.field1433 > var6) {
            var6 = var5 - this.field1433;
        }
        if (this.field1433 - var5 > var6) {
            var6 = this.field1433 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1444 = arg0;
        this.field1435 = arg1;
        this.field1439 = arg2;
        this.field1445 = (arg1 - this.field1437) / arg0;
        this.field1446 = (var4 - this.field1438) / arg0;
        this.field1447 = (var5 - this.field1433) / arg0;
    }

    @ObfuscatedName("da.b(I)V")
    public synchronized void method2359(int arg0) {
        if (arg0 == 0) {
            this.method2338(0);
            this.method3326();
        } else if (this.field1438 == 0 && this.field1433 == 0) {
            this.field1444 = 0;
            this.field1435 = 0;
            this.field1437 = 0;
            this.method3326();
        } else {
            int var2 = -this.field1437;
            if (this.field1437 > var2) {
                var2 = this.field1437;
            }
            if (-this.field1438 > var2) {
                var2 = -this.field1438;
            }
            if (this.field1438 > var2) {
                var2 = this.field1438;
            }
            if (-this.field1433 > var2) {
                var2 = -this.field1433;
            }
            if (this.field1433 > var2) {
                var2 = this.field1433;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1444 = arg0;
            this.field1435 = Integer.MIN_VALUE;
            this.field1445 = -this.field1437 / arg0;
            this.field1446 = -this.field1438 / arg0;
            this.field1447 = -this.field1433 / arg0;
        }
    }

    @ObfuscatedName("da.ag(I)V")
    public synchronized void method2347(int arg0) {
        if (this.field1434 < 0) {
            this.field1434 = -arg0;
        } else {
            this.field1434 = arg0;
        }
    }

    @ObfuscatedName("da.at()I")
    public synchronized int method2415() {
        return this.field1434 < 0 ? -this.field1434 : this.field1434;
    }

    @ObfuscatedName("da.ax()Z")
    public boolean method2395() {
        return this.field1436 < 0 || this.field1436 >= ((class104) this.field1462).field1357.length << 8;
    }

    @ObfuscatedName("da.aj()Z")
    public boolean method2417() {
        return this.field1444 != 0;
    }

    @ObfuscatedName("da.u()Ldg;")
    public class116 method2118() {
        return null;
    }

    @ObfuscatedName("da.j()Ldg;")
    public class116 method2119() {
        return null;
    }

    @ObfuscatedName("da.v()I")
    public int method2120() {
        return this.field1435 == 0 && this.field1444 == 0 ? 0 : 1;
    }

    @ObfuscatedName("da.d([III)V")
    public synchronized void method2121(int[] arg0, int arg1, int arg2) {
        if (this.field1435 == 0 && this.field1444 == 0) {
            this.method2139(arg2);
            return;
        }
        class104 var4 = (class104) this.field1462;
        int var5 = this.field1441 << 8;
        int var6 = this.field1442 << 8;
        int var7 = var4.field1357.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1440 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1436 < 0) {
            if (this.field1434 <= 0) {
                this.method2343();
                this.method3326();
                return;
            }
            this.field1436 = 0;
        }
        if (this.field1436 >= var7) {
            if (this.field1434 >= 0) {
                this.method2343();
                this.method3326();
                return;
            }
            this.field1436 = var7 - 1;
        }
        if (this.field1440 >= 0) {
            if (this.field1440 > 0) {
                if (this.field1443) {
                    label131: {
                        if (this.field1434 < 0) {
                            var9 = this.method2362(arg0, arg1, var5, var10, var4.field1357[this.field1441]);
                            if (this.field1436 >= var5) {
                                return;
                            }
                            this.field1436 = var5 + var5 - 1 - this.field1436;
                            this.field1434 = -this.field1434;
                            if (--this.field1440 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2381(arg0, var9, var6, var10, var4.field1357[this.field1442 - 1]);
                            if (this.field1436 < var6) {
                                return;
                            }
                            this.field1436 = var6 + var6 - 1 - this.field1436;
                            this.field1434 = -this.field1434;
                            if (--this.field1440 == 0) {
                                break;
                            }
                            var9 = this.method2362(arg0, var9, var5, var10, var4.field1357[this.field1441]);
                            if (this.field1436 >= var5) {
                                return;
                            }
                            this.field1436 = var5 + var5 - 1 - this.field1436;
                            this.field1434 = -this.field1434;
                        } while (--this.field1440 != 0);
                    }
                } else if (this.field1434 < 0) {
                    while (true) {
                        var9 = this.method2362(arg0, var9, var5, var10, var4.field1357[this.field1442 - 1]);
                        if (this.field1436 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1436) / var8;
                        if (var12 >= this.field1440) {
                            this.field1436 += this.field1440 * var8;
                            this.field1440 = 0;
                            break;
                        }
                        this.field1436 += var8 * var12;
                        this.field1440 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2381(arg0, var9, var6, var10, var4.field1357[this.field1441]);
                        if (this.field1436 < var6) {
                            return;
                        }
                        int var13 = (this.field1436 - var5) / var8;
                        if (var13 >= this.field1440) {
                            this.field1436 -= this.field1440 * var8;
                            this.field1440 = 0;
                            break;
                        }
                        this.field1436 -= var8 * var13;
                        this.field1440 -= var13;
                    }
                }
            }
            if (this.field1434 < 0) {
                this.method2362(arg0, var9, 0, var10, 0);
                if (this.field1436 < 0) {
                    this.field1436 = -1;
                    this.method2343();
                    this.method3326();
                }
            } else {
                this.method2381(arg0, var9, var7, var10, 0);
                if (this.field1436 >= var7) {
                    this.field1436 = var7;
                    this.method2343();
                    this.method3326();
                }
            }
        } else if (this.field1443) {
            if (this.field1434 < 0) {
                var9 = this.method2362(arg0, arg1, var5, var10, var4.field1357[this.field1441]);
                if (this.field1436 >= var5) {
                    return;
                }
                this.field1436 = var5 + var5 - 1 - this.field1436;
                this.field1434 = -this.field1434;
            }
            while (true) {
                int var11 = this.method2381(arg0, var9, var6, var10, var4.field1357[this.field1442 - 1]);
                if (this.field1436 < var6) {
                    return;
                }
                this.field1436 = var6 + var6 - 1 - this.field1436;
                this.field1434 = -this.field1434;
                var9 = this.method2362(arg0, var11, var5, var10, var4.field1357[this.field1441]);
                if (this.field1436 >= var5) {
                    return;
                }
                this.field1436 = var5 + var5 - 1 - this.field1436;
                this.field1434 = -this.field1434;
            }
        } else if (this.field1434 < 0) {
            while (true) {
                var9 = this.method2362(arg0, var9, var5, var10, var4.field1357[this.field1442 - 1]);
                if (this.field1436 >= var5) {
                    return;
                }
                this.field1436 = var6 - 1 - (var6 - 1 - this.field1436) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2381(arg0, var9, var6, var10, var4.field1357[this.field1441]);
                if (this.field1436 < var6) {
                    return;
                }
                this.field1436 = (this.field1436 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("da.s(I)V")
    public synchronized void method2139(int arg0) {
        if (this.field1444 > 0) {
            if (arg0 >= this.field1444) {
                if (this.field1435 == Integer.MIN_VALUE) {
                    this.field1435 = 0;
                    this.field1433 = 0;
                    this.field1438 = 0;
                    this.field1437 = 0;
                    this.method3326();
                    arg0 = this.field1444;
                }
                this.field1444 = 0;
                this.method2335();
            } else {
                this.field1437 += this.field1445 * arg0;
                this.field1438 += this.field1446 * arg0;
                this.field1433 += this.field1447 * arg0;
                this.field1444 -= arg0;
            }
        }
        class104 var2 = (class104) this.field1462;
        int var3 = this.field1441 << 8;
        int var4 = this.field1442 << 8;
        int var5 = var2.field1357.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1440 = 0;
        }
        if (this.field1436 < 0) {
            if (this.field1434 <= 0) {
                this.method2343();
                this.method3326();
                return;
            }
            this.field1436 = 0;
        }
        if (this.field1436 >= var5) {
            if (this.field1434 >= 0) {
                this.method2343();
                this.method3326();
                return;
            }
            this.field1436 = var5 - 1;
        }
        this.field1436 += this.field1434 * arg0;
        if (this.field1440 >= 0) {
            if (this.field1440 > 0) {
                if (this.field1443) {
                    label121: {
                        if (this.field1434 < 0) {
                            if (this.field1436 >= var3) {
                                return;
                            }
                            this.field1436 = var3 + var3 - 1 - this.field1436;
                            this.field1434 = -this.field1434;
                            if (--this.field1440 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1436 < var4) {
                                return;
                            }
                            this.field1436 = var4 + var4 - 1 - this.field1436;
                            this.field1434 = -this.field1434;
                            if (--this.field1440 == 0) {
                                break;
                            }
                            if (this.field1436 >= var3) {
                                return;
                            }
                            this.field1436 = var3 + var3 - 1 - this.field1436;
                            this.field1434 = -this.field1434;
                        } while (--this.field1440 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1434 < 0) {
                            if (this.field1436 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1436) / var6;
                            if (var7 >= this.field1440) {
                                this.field1436 += this.field1440 * var6;
                                this.field1440 = 0;
                                break label153;
                            }
                            this.field1436 += var6 * var7;
                            this.field1440 -= var7;
                        } else if (this.field1436 >= var4) {
                            int var8 = (this.field1436 - var3) / var6;
                            if (var8 >= this.field1440) {
                                this.field1436 -= this.field1440 * var6;
                                this.field1440 = 0;
                                break label153;
                            }
                            this.field1436 -= var6 * var8;
                            this.field1440 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1434 < 0) {
                if (this.field1436 < 0) {
                    this.field1436 = -1;
                    this.method2343();
                    this.method3326();
                }
            } else if (this.field1436 >= var5) {
                this.field1436 = var5;
                this.method2343();
                this.method3326();
            }
        } else if (this.field1443) {
            if (this.field1434 < 0) {
                if (this.field1436 >= var3) {
                    return;
                }
                this.field1436 = var3 + var3 - 1 - this.field1436;
                this.field1434 = -this.field1434;
            }
            while (this.field1436 >= var4) {
                this.field1436 = var4 + var4 - 1 - this.field1436;
                this.field1434 = -this.field1434;
                if (this.field1436 >= var3) {
                    return;
                }
                this.field1436 = var3 + var3 - 1 - this.field1436;
                this.field1434 = -this.field1434;
            }
        } else if (this.field1434 < 0) {
            if (this.field1436 >= var3) {
                return;
            }
            this.field1436 = var4 - 1 - (var4 - 1 - this.field1436) % var6;
        } else if (this.field1436 >= var4) {
            this.field1436 = (this.field1436 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("da.ab([IIIII)I")
    public int method2381(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1444 > 0) {
                int var6 = this.field1444 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1444 += arg1;
                if (this.field1434 == 256 && (this.field1436 & 0xFF) == 0) {
                    if (Statics.field1385) {
                        arg1 = method2364(0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, this.field1446, this.field1447, 0, var6, arg2, this);
                    } else {
                        arg1 = method2363(((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, this.field1445, 0, var6, arg2, this);
                    }
                } else if (Statics.field1385) {
                    arg1 = method2368(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, this.field1446, this.field1447, 0, var6, arg2, this, this.field1434, arg4);
                } else {
                    arg1 = method2455(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, this.field1445, 0, var6, arg2, this, this.field1434, arg4);
                }
                this.field1444 -= arg1;
                if (this.field1444 != 0) {
                    return arg1;
                }
                if (!this.method2348()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1434 == 256 && (this.field1436 & 0xFF) == 0) {
                if (Statics.field1385) {
                    return method2356(0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, 0, arg3, arg2, this);
                }
                return method2355(((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, 0, arg3, arg2, this);
            }
            if (Statics.field1385) {
                return method2433(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, 0, arg3, arg2, this, this.field1434, arg4);
            }
            return method2441(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, 0, arg3, arg2, this, this.field1434, arg4);
        }
    }

    @ObfuscatedName("da.ak([IIIII)I")
    public int method2362(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1444 > 0) {
                int var6 = this.field1444 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1444 += arg1;
                if (this.field1434 == -256 && (this.field1436 & 0xFF) == 0) {
                    if (Statics.field1385) {
                        arg1 = method2353(0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, this.field1446, this.field1447, 0, var6, arg2, this);
                    } else {
                        arg1 = method2365(((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, this.field1445, 0, var6, arg2, this);
                    }
                } else if (Statics.field1385) {
                    arg1 = method2370(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, this.field1446, this.field1447, 0, var6, arg2, this, this.field1434, arg4);
                } else {
                    arg1 = method2369(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, this.field1445, 0, var6, arg2, this, this.field1434, arg4);
                }
                this.field1444 -= arg1;
                if (this.field1444 != 0) {
                    return arg1;
                }
                if (!this.method2348()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1434 == -256 && (this.field1436 & 0xFF) == 0) {
                if (Statics.field1385) {
                    return method2358(0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, 0, arg3, arg2, this);
                }
                return method2357(((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, 0, arg3, arg2, this);
            }
            if (Statics.field1385) {
                return method2377(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1438, this.field1433, 0, arg3, arg2, this, this.field1434, arg4);
            }
            return method2361(0, 0, ((class104) this.field1462).field1357, arg0, this.field1436, arg1, this.field1437, 0, arg3, arg2, this, this.field1434, arg4);
        }
    }

    @ObfuscatedName("da.ay()Z")
    public boolean method2348() {
        int var1 = this.field1435;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2457(var1, this.field1439);
            var2 = method2331(var1, this.field1439);
        }
        if (this.field1437 != var1 || this.field1438 != var3 || this.field1433 != var2) {
            if (this.field1437 < var1) {
                this.field1445 = 1;
                this.field1444 = var1 - this.field1437;
            } else if (this.field1437 > var1) {
                this.field1445 = -1;
                this.field1444 = this.field1437 - var1;
            } else {
                this.field1445 = 0;
            }
            if (this.field1438 < var3) {
                this.field1446 = 1;
                if (this.field1444 == 0 || this.field1444 > var3 - this.field1438) {
                    this.field1444 = var3 - this.field1438;
                }
            } else if (this.field1438 > var3) {
                this.field1446 = -1;
                if (this.field1444 == 0 || this.field1444 > this.field1438 - var3) {
                    this.field1444 = this.field1438 - var3;
                }
            } else {
                this.field1446 = 0;
            }
            if (this.field1433 < var2) {
                this.field1447 = 1;
                if (this.field1444 == 0 || this.field1444 > var2 - this.field1433) {
                    this.field1444 = var2 - this.field1433;
                }
            } else if (this.field1433 > var2) {
                this.field1447 = -1;
                if (this.field1444 == 0 || this.field1444 > this.field1433 - var2) {
                    this.field1444 = this.field1433 - var2;
                }
            } else {
                this.field1447 = 0;
            }
            return false;
        } else if (this.field1435 == Integer.MIN_VALUE) {
            this.field1435 = 0;
            this.field1433 = 0;
            this.field1438 = 0;
            this.field1437 = 0;
            this.method3326();
            return true;
        } else {
            this.method2335();
            return false;
        }
    }

    @ObfuscatedName("da.ae([B[IIIIIIILda;)I")
    public static int method2355(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1436 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.aa(I[B[IIIIIIIILda;)I")
    public static int method2356(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1436 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.aq([B[IIIIIIILda;)I")
    public static int method2357(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1436 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.ar(I[B[IIIIIIIILda;)I")
    public static int method2358(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1436 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.ac(II[B[IIIIIIILda;II)I")
    public static int method2441(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1436 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.az(II[B[IIIIIIIILda;II)I")
    public static int method2433(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1436 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.ai(II[B[IIIIIIILda;II)I")
    public static int method2361(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1436 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.am(II[B[IIIIIIIILda;II)I")
    public static int method2377(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1436 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.aw([B[IIIIIIIILda;)I")
    public static int method2363(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1438 += (var14 - arg3) * arg9.field1446;
        arg9.field1433 += (var14 - arg3) * arg9.field1447;
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
        arg9.field1437 = var12 >> 2;
        arg9.field1436 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.au(I[B[IIIIIIIIIILda;)I")
    public static int method2364(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1437 += (var19 - arg4) * arg12.field1445;
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
        arg12.field1438 = var15 >> 2;
        arg12.field1433 = var16 >> 2;
        arg12.field1436 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bg([B[IIIIIIIILda;)I")
    public static int method2365(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1438 += (var14 - arg3) * arg9.field1446;
        arg9.field1433 += (var14 - arg3) * arg9.field1447;
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
        arg9.field1437 = var12 >> 2;
        arg9.field1436 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bn(I[B[IIIIIIIIIILda;)I")
    public static int method2353(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1437 += (var19 - arg4) * arg12.field1445;
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
        arg12.field1438 = var15 >> 2;
        arg12.field1433 = var16 >> 2;
        arg12.field1436 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bk(II[B[IIIIIIIILda;II)I")
    public static int method2455(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1438 -= arg11.field1446 * arg5;
        arg11.field1433 -= arg11.field1447 * arg5;
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
        arg11.field1438 += arg11.field1446 * arg5;
        arg11.field1433 += arg11.field1447 * arg5;
        arg11.field1437 = arg6;
        arg11.field1436 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bp(II[B[IIIIIIIIIILda;II)I")
    public static int method2368(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1437 -= arg13.field1445 * arg5;
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
        arg13.field1437 += arg13.field1445 * var27;
        arg13.field1438 = arg6;
        arg13.field1433 = arg7;
        arg13.field1436 = arg4;
        return var27;
    }

    @ObfuscatedName("da.bu(II[B[IIIIIIIILda;II)I")
    public static int method2369(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1438 -= arg11.field1446 * arg5;
        arg11.field1433 -= arg11.field1447 * arg5;
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
        arg11.field1438 += arg11.field1446 * arg5;
        arg11.field1433 += arg11.field1447 * arg5;
        arg11.field1437 = arg6;
        arg11.field1436 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bi(II[B[IIIIIIIIIILda;II)I")
    public static int method2370(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1437 -= arg13.field1445 * arg5;
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
        arg13.field1437 += arg13.field1445 * var26;
        arg13.field1438 = arg6;
        arg13.field1433 = arg7;
        arg13.field1436 = arg4;
        return var26;
    }
}
