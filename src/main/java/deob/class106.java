package deob;

@ObfuscatedName("da")
public class class106 extends class108 {

    @ObfuscatedName("da.g")
    public int field1424;

    @ObfuscatedName("da.r")
    public int field1416;

    @ObfuscatedName("da.e")
    public int field1418;

    @ObfuscatedName("da.q")
    public int field1419;

    @ObfuscatedName("da.c")
    public int field1417;

    @ObfuscatedName("da.l")
    public int field1421;

    @ObfuscatedName("da.b")
    public int field1422;

    @ObfuscatedName("da.n")
    public int field1423;

    @ObfuscatedName("da.i")
    public int field1426;

    @ObfuscatedName("da.p")
    public int field1425;

    @ObfuscatedName("da.m")
    public boolean field1420;

    @ObfuscatedName("da.d")
    public int field1427;

    @ObfuscatedName("da.j")
    public int field1428;

    @ObfuscatedName("da.x")
    public int field1429;

    @ObfuscatedName("da.v")
    public int field1430;

    @ObfuscatedName("da.g(II)I")
    public static int method2409(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.r(II)I")
    public static int method2367(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.av()I")
    public int method2306() {
        int var1 = this.field1417 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1423 == 0) {
            var2 -= this.field1424 * var2 / (((class96) this.field1443).field1346.length << 8);
        } else if (this.field1423 >= 0) {
            var2 -= this.field1426 * var2 / ((class96) this.field1443).field1346.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class106(class96 arg0, int arg1, int arg2) {
        this.field1443 = arg0;
        this.field1426 = arg0.field1347;
        this.field1425 = arg0.field1349;
        this.field1420 = arg0.field1345;
        this.field1416 = arg1;
        this.field1418 = arg2;
        this.field1419 = 8192;
        this.field1424 = 0;
        this.method2311();
    }

    public class106(class96 arg0, int arg1, int arg2, int arg3) {
        this.field1443 = arg0;
        this.field1426 = arg0.field1347;
        this.field1425 = arg0.field1349;
        this.field1420 = arg0.field1345;
        this.field1416 = arg1;
        this.field1418 = arg2;
        this.field1419 = arg3;
        this.field1424 = 0;
        this.method2311();
    }

    @ObfuscatedName("da.e(Lct;II)Lda;")
    public static class106 method2320(class96 arg0, int arg1, int arg2) {
        return arg0.field1346 == null || arg0.field1346.length == 0 ? null : new class106(arg0, (int) ((long) arg0.field1348 * 256L * (long) arg1 / (long) (Statics.field1378 * 100)), arg2 << 6);
    }

    @ObfuscatedName("da.q(Lct;III)Lda;")
    public static class106 method2310(class96 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1346 == null || arg0.field1346.length == 0 ? null : new class106(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("da.c()V")
    public void method2311() {
        this.field1417 = this.field1418;
        this.field1421 = method2409(this.field1418, this.field1419);
        this.field1422 = method2367(this.field1418, this.field1419);
    }

    @ObfuscatedName("da.j(I)V")
    public synchronized void method2312(int arg0) {
        this.field1423 = arg0;
    }

    @ObfuscatedName("da.v(I)V")
    public synchronized void method2313(int arg0) {
        this.method2435(arg0 << 6, this.method2317());
    }

    @ObfuscatedName("da.h(I)V")
    public synchronized void method2314(int arg0) {
        this.method2435(arg0, this.method2317());
    }

    @ObfuscatedName("da.f(II)V")
    public synchronized void method2435(int arg0, int arg1) {
        this.field1418 = arg0;
        this.field1419 = arg1;
        this.field1427 = 0;
        this.method2311();
    }

    @ObfuscatedName("da.a()I")
    public synchronized int method2316() {
        return this.field1418 == Integer.MIN_VALUE ? 0 : this.field1418;
    }

    @ObfuscatedName("da.t()I")
    public synchronized int method2317() {
        return this.field1419 < 0 ? -1 : this.field1419;
    }

    @ObfuscatedName("da.k(I)V")
    public synchronized void method2318(int arg0) {
        int var2 = ((class96) this.field1443).field1346.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1424 = arg0;
    }

    @ObfuscatedName("da.s(Z)V")
    public synchronized void method2319(boolean arg0) {
        this.field1416 = (this.field1416 >>> 31) + (this.field1416 ^ this.field1416 >> 31);
        if (arg0) {
            this.field1416 = -this.field1416;
        }
    }

    @ObfuscatedName("da.y()V")
    public void method2440() {
        if (this.field1427 == 0) {
            return;
        }
        if (this.field1418 == Integer.MIN_VALUE) {
            this.field1418 = 0;
        }
        this.field1427 = 0;
        this.method2311();
    }

    @ObfuscatedName("da.u(II)V")
    public synchronized void method2396(int arg0, int arg1) {
        this.method2322(arg0, arg1, this.method2317());
    }

    @ObfuscatedName("da.o(III)V")
    public synchronized void method2322(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2435(arg1, arg2);
            return;
        }
        int var4 = method2409(arg1, arg2);
        int var5 = method2367(arg1, arg2);
        if (this.field1421 == var4 && this.field1422 == var5) {
            this.field1427 = 0;
            return;
        }
        int var6 = arg1 - this.field1417;
        if (this.field1417 - arg1 > var6) {
            var6 = this.field1417 - arg1;
        }
        if (var4 - this.field1421 > var6) {
            var6 = var4 - this.field1421;
        }
        if (this.field1421 - var4 > var6) {
            var6 = this.field1421 - var4;
        }
        if (var5 - this.field1422 > var6) {
            var6 = var5 - this.field1422;
        }
        if (this.field1422 - var5 > var6) {
            var6 = this.field1422 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1427 = arg0;
        this.field1418 = arg1;
        this.field1419 = arg2;
        this.field1428 = (arg1 - this.field1417) / arg0;
        this.field1429 = (var4 - this.field1421) / arg0;
        this.field1430 = (var5 - this.field1422) / arg0;
    }

    @ObfuscatedName("da.af(I)V")
    public synchronized void method2323(int arg0) {
        if (arg0 == 0) {
            this.method2314(0);
            this.method3952();
        } else if (this.field1421 == 0 && this.field1422 == 0) {
            this.field1427 = 0;
            this.field1418 = 0;
            this.field1417 = 0;
            this.method3952();
        } else {
            int var2 = -this.field1417;
            if (this.field1417 > var2) {
                var2 = this.field1417;
            }
            if (-this.field1421 > var2) {
                var2 = -this.field1421;
            }
            if (this.field1421 > var2) {
                var2 = this.field1421;
            }
            if (-this.field1422 > var2) {
                var2 = -this.field1422;
            }
            if (this.field1422 > var2) {
                var2 = this.field1422;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1427 = arg0;
            this.field1418 = Integer.MIN_VALUE;
            this.field1428 = -this.field1417 / arg0;
            this.field1429 = -this.field1421 / arg0;
            this.field1430 = -this.field1422 / arg0;
        }
    }

    @ObfuscatedName("da.an(I)V")
    public synchronized void method2321(int arg0) {
        if (this.field1416 < 0) {
            this.field1416 = -arg0;
        } else {
            this.field1416 = arg0;
        }
    }

    @ObfuscatedName("da.ax()I")
    public synchronized int method2307() {
        return this.field1416 < 0 ? -this.field1416 : this.field1416;
    }

    @ObfuscatedName("da.ad()Z")
    public boolean method2326() {
        return this.field1424 < 0 || this.field1424 >= ((class96) this.field1443).field1346.length << 8;
    }

    @ObfuscatedName("da.al()Z")
    public boolean method2327() {
        return this.field1427 != 0;
    }

    @ObfuscatedName("da.i()Ldz;")
    public class108 method2084() {
        return null;
    }

    @ObfuscatedName("da.p()Ldz;")
    public class108 method2085() {
        return null;
    }

    @ObfuscatedName("da.m()I")
    public int method2086() {
        return this.field1418 == 0 && this.field1427 == 0 ? 0 : 1;
    }

    @ObfuscatedName("da.d([III)V")
    public synchronized void method2087(int[] arg0, int arg1, int arg2) {
        if (this.field1418 == 0 && this.field1427 == 0) {
            this.method2089(arg2);
            return;
        }
        class96 var4 = (class96) this.field1443;
        int var5 = this.field1426 << 8;
        int var6 = this.field1425 << 8;
        int var7 = var4.field1346.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1423 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1424 < 0) {
            if (this.field1416 <= 0) {
                this.method2440();
                this.method3952();
                return;
            }
            this.field1424 = 0;
        }
        if (this.field1424 >= var7) {
            if (this.field1416 >= 0) {
                this.method2440();
                this.method3952();
                return;
            }
            this.field1424 = var7 - 1;
        }
        if (this.field1423 >= 0) {
            if (this.field1423 > 0) {
                if (this.field1420) {
                    label131: {
                        if (this.field1416 < 0) {
                            var9 = this.method2330(arg0, arg1, var5, var10, var4.field1346[this.field1426]);
                            if (this.field1424 >= var5) {
                                return;
                            }
                            this.field1424 = var5 + var5 - 1 - this.field1424;
                            this.field1416 = -this.field1416;
                            if (--this.field1423 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2329(arg0, var9, var6, var10, var4.field1346[this.field1425 - 1]);
                            if (this.field1424 < var6) {
                                return;
                            }
                            this.field1424 = var6 + var6 - 1 - this.field1424;
                            this.field1416 = -this.field1416;
                            if (--this.field1423 == 0) {
                                break;
                            }
                            var9 = this.method2330(arg0, var9, var5, var10, var4.field1346[this.field1426]);
                            if (this.field1424 >= var5) {
                                return;
                            }
                            this.field1424 = var5 + var5 - 1 - this.field1424;
                            this.field1416 = -this.field1416;
                        } while (--this.field1423 != 0);
                    }
                } else if (this.field1416 < 0) {
                    while (true) {
                        var9 = this.method2330(arg0, var9, var5, var10, var4.field1346[this.field1425 - 1]);
                        if (this.field1424 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1424) / var8;
                        if (var12 >= this.field1423) {
                            this.field1424 += this.field1423 * var8;
                            this.field1423 = 0;
                            break;
                        }
                        this.field1424 += var8 * var12;
                        this.field1423 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2329(arg0, var9, var6, var10, var4.field1346[this.field1426]);
                        if (this.field1424 < var6) {
                            return;
                        }
                        int var13 = (this.field1424 - var5) / var8;
                        if (var13 >= this.field1423) {
                            this.field1424 -= this.field1423 * var8;
                            this.field1423 = 0;
                            break;
                        }
                        this.field1424 -= var8 * var13;
                        this.field1423 -= var13;
                    }
                }
            }
            if (this.field1416 < 0) {
                this.method2330(arg0, var9, 0, var10, 0);
                if (this.field1424 < 0) {
                    this.field1424 = -1;
                    this.method2440();
                    this.method3952();
                }
            } else {
                this.method2329(arg0, var9, var7, var10, 0);
                if (this.field1424 >= var7) {
                    this.field1424 = var7;
                    this.method2440();
                    this.method3952();
                }
            }
        } else if (this.field1420) {
            if (this.field1416 < 0) {
                var9 = this.method2330(arg0, arg1, var5, var10, var4.field1346[this.field1426]);
                if (this.field1424 >= var5) {
                    return;
                }
                this.field1424 = var5 + var5 - 1 - this.field1424;
                this.field1416 = -this.field1416;
            }
            while (true) {
                int var11 = this.method2329(arg0, var9, var6, var10, var4.field1346[this.field1425 - 1]);
                if (this.field1424 < var6) {
                    return;
                }
                this.field1424 = var6 + var6 - 1 - this.field1424;
                this.field1416 = -this.field1416;
                var9 = this.method2330(arg0, var11, var5, var10, var4.field1346[this.field1426]);
                if (this.field1424 >= var5) {
                    return;
                }
                this.field1424 = var5 + var5 - 1 - this.field1424;
                this.field1416 = -this.field1416;
            }
        } else if (this.field1416 < 0) {
            while (true) {
                var9 = this.method2330(arg0, var9, var5, var10, var4.field1346[this.field1425 - 1]);
                if (this.field1424 >= var5) {
                    return;
                }
                this.field1424 = var6 - 1 - (var6 - 1 - this.field1424) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2329(arg0, var9, var6, var10, var4.field1346[this.field1426]);
                if (this.field1424 < var6) {
                    return;
                }
                this.field1424 = (this.field1424 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("da.x(I)V")
    public synchronized void method2089(int arg0) {
        if (this.field1427 > 0) {
            if (arg0 >= this.field1427) {
                if (this.field1418 == Integer.MIN_VALUE) {
                    this.field1418 = 0;
                    this.field1422 = 0;
                    this.field1421 = 0;
                    this.field1417 = 0;
                    this.method3952();
                    arg0 = this.field1427;
                }
                this.field1427 = 0;
                this.method2311();
            } else {
                this.field1417 += this.field1428 * arg0;
                this.field1421 += this.field1429 * arg0;
                this.field1422 += this.field1430 * arg0;
                this.field1427 -= arg0;
            }
        }
        class96 var2 = (class96) this.field1443;
        int var3 = this.field1426 << 8;
        int var4 = this.field1425 << 8;
        int var5 = var2.field1346.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1423 = 0;
        }
        if (this.field1424 < 0) {
            if (this.field1416 <= 0) {
                this.method2440();
                this.method3952();
                return;
            }
            this.field1424 = 0;
        }
        if (this.field1424 >= var5) {
            if (this.field1416 >= 0) {
                this.method2440();
                this.method3952();
                return;
            }
            this.field1424 = var5 - 1;
        }
        this.field1424 += this.field1416 * arg0;
        if (this.field1423 >= 0) {
            if (this.field1423 > 0) {
                if (this.field1420) {
                    label121: {
                        if (this.field1416 < 0) {
                            if (this.field1424 >= var3) {
                                return;
                            }
                            this.field1424 = var3 + var3 - 1 - this.field1424;
                            this.field1416 = -this.field1416;
                            if (--this.field1423 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1424 < var4) {
                                return;
                            }
                            this.field1424 = var4 + var4 - 1 - this.field1424;
                            this.field1416 = -this.field1416;
                            if (--this.field1423 == 0) {
                                break;
                            }
                            if (this.field1424 >= var3) {
                                return;
                            }
                            this.field1424 = var3 + var3 - 1 - this.field1424;
                            this.field1416 = -this.field1416;
                        } while (--this.field1423 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1416 < 0) {
                            if (this.field1424 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1424) / var6;
                            if (var7 >= this.field1423) {
                                this.field1424 += this.field1423 * var6;
                                this.field1423 = 0;
                                break label153;
                            }
                            this.field1424 += var6 * var7;
                            this.field1423 -= var7;
                        } else if (this.field1424 >= var4) {
                            int var8 = (this.field1424 - var3) / var6;
                            if (var8 >= this.field1423) {
                                this.field1424 -= this.field1423 * var6;
                                this.field1423 = 0;
                                break label153;
                            }
                            this.field1424 -= var6 * var8;
                            this.field1423 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1416 < 0) {
                if (this.field1424 < 0) {
                    this.field1424 = -1;
                    this.method2440();
                    this.method3952();
                }
            } else if (this.field1424 >= var5) {
                this.field1424 = var5;
                this.method2440();
                this.method3952();
            }
        } else if (this.field1420) {
            if (this.field1416 < 0) {
                if (this.field1424 >= var3) {
                    return;
                }
                this.field1424 = var3 + var3 - 1 - this.field1424;
                this.field1416 = -this.field1416;
            }
            while (this.field1424 >= var4) {
                this.field1424 = var4 + var4 - 1 - this.field1424;
                this.field1416 = -this.field1416;
                if (this.field1424 >= var3) {
                    return;
                }
                this.field1424 = var3 + var3 - 1 - this.field1424;
                this.field1416 = -this.field1416;
            }
        } else if (this.field1416 < 0) {
            if (this.field1424 >= var3) {
                return;
            }
            this.field1424 = var4 - 1 - (var4 - 1 - this.field1424) % var6;
        } else if (this.field1424 >= var4) {
            this.field1424 = (this.field1424 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("da.ak([IIIII)I")
    public int method2329(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1427 > 0) {
                int var6 = this.field1427 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1427 += arg1;
                if (this.field1416 == 256 && (this.field1424 & 0xFF) == 0) {
                    if (Statics.field265) {
                        arg1 = method2345(0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, this.field1429, this.field1430, 0, var6, arg2, this);
                    } else {
                        arg1 = method2339(((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, this.field1428, 0, var6, arg2, this);
                    }
                } else if (Statics.field265) {
                    arg1 = method2344(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, this.field1429, this.field1430, 0, var6, arg2, this, this.field1416, arg4);
                } else {
                    arg1 = method2343(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, this.field1428, 0, var6, arg2, this, this.field1416, arg4);
                }
                this.field1427 -= arg1;
                if (this.field1427 != 0) {
                    return arg1;
                }
                if (!this.method2331()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1416 == 256 && (this.field1424 & 0xFF) == 0) {
                if (Statics.field265) {
                    return method2333(0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, 0, arg3, arg2, this);
                }
                return method2340(((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, 0, arg3, arg2, this);
            }
            if (Statics.field265) {
                return method2395(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, 0, arg3, arg2, this, this.field1416, arg4);
            }
            return method2336(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, 0, arg3, arg2, this, this.field1416, arg4);
        }
    }

    @ObfuscatedName("da.ah([IIIII)I")
    public int method2330(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1427 > 0) {
                int var6 = this.field1427 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1427 += arg1;
                if (this.field1416 == -256 && (this.field1424 & 0xFF) == 0) {
                    if (Statics.field265) {
                        arg1 = method2430(0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, this.field1429, this.field1430, 0, var6, arg2, this);
                    } else {
                        arg1 = method2383(((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, this.field1428, 0, var6, arg2, this);
                    }
                } else if (Statics.field265) {
                    arg1 = method2346(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, this.field1429, this.field1430, 0, var6, arg2, this, this.field1416, arg4);
                } else {
                    arg1 = method2386(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, this.field1428, 0, var6, arg2, this, this.field1416, arg4);
                }
                this.field1427 -= arg1;
                if (this.field1427 != 0) {
                    return arg1;
                }
                if (!this.method2331()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1416 == -256 && (this.field1424 & 0xFF) == 0) {
                if (Statics.field265) {
                    return method2335(0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, 0, arg3, arg2, this);
                }
                return method2334(((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, 0, arg3, arg2, this);
            }
            if (Statics.field265) {
                return method2351(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1421, this.field1422, 0, arg3, arg2, this, this.field1416, arg4);
            }
            return method2337(0, 0, ((class96) this.field1443).field1346, arg0, this.field1424, arg1, this.field1417, 0, arg3, arg2, this, this.field1416, arg4);
        }
    }

    @ObfuscatedName("da.ap()Z")
    public boolean method2331() {
        int var1 = this.field1418;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2409(var1, this.field1419);
            var2 = method2367(var1, this.field1419);
        }
        if (this.field1417 != var1 || this.field1421 != var3 || this.field1422 != var2) {
            if (this.field1417 < var1) {
                this.field1428 = 1;
                this.field1427 = var1 - this.field1417;
            } else if (this.field1417 > var1) {
                this.field1428 = -1;
                this.field1427 = this.field1417 - var1;
            } else {
                this.field1428 = 0;
            }
            if (this.field1421 < var3) {
                this.field1429 = 1;
                if (this.field1427 == 0 || this.field1427 > var3 - this.field1421) {
                    this.field1427 = var3 - this.field1421;
                }
            } else if (this.field1421 > var3) {
                this.field1429 = -1;
                if (this.field1427 == 0 || this.field1427 > this.field1421 - var3) {
                    this.field1427 = this.field1421 - var3;
                }
            } else {
                this.field1429 = 0;
            }
            if (this.field1422 < var2) {
                this.field1430 = 1;
                if (this.field1427 == 0 || this.field1427 > var2 - this.field1422) {
                    this.field1427 = var2 - this.field1422;
                }
            } else if (this.field1422 > var2) {
                this.field1430 = -1;
                if (this.field1427 == 0 || this.field1427 > this.field1422 - var2) {
                    this.field1427 = this.field1422 - var2;
                }
            } else {
                this.field1430 = 0;
            }
            return false;
        } else if (this.field1418 == Integer.MIN_VALUE) {
            this.field1418 = 0;
            this.field1422 = 0;
            this.field1421 = 0;
            this.field1417 = 0;
            this.method3952();
            return true;
        } else {
            this.method2311();
            return false;
        }
    }

    @ObfuscatedName("da.au([B[IIIIIIILda;)I")
    public static int method2340(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1424 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.aq(I[B[IIIIIIIILda;)I")
    public static int method2333(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1424 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.bs([B[IIIIIIILda;)I")
    public static int method2334(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1424 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bz(I[B[IIIIIIIILda;)I")
    public static int method2335(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1424 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.ba(II[B[IIIIIIILda;II)I")
    public static int method2336(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1424 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bi(II[B[IIIIIIIILda;II)I")
    public static int method2395(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1424 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.bp(II[B[IIIIIIILda;II)I")
    public static int method2337(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1424 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bv(II[B[IIIIIIIILda;II)I")
    public static int method2351(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1424 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.bq([B[IIIIIIIILda;)I")
    public static int method2339(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1421 += (var14 - arg3) * arg9.field1429;
        arg9.field1422 += (var14 - arg3) * arg9.field1430;
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
        arg9.field1417 = var12 >> 2;
        arg9.field1424 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bw(I[B[IIIIIIIIIILda;)I")
    public static int method2345(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1417 += (var19 - arg4) * arg12.field1428;
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
        arg12.field1421 = var15 >> 2;
        arg12.field1422 = var16 >> 2;
        arg12.field1424 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bf([B[IIIIIIIILda;)I")
    public static int method2383(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1421 += (var14 - arg3) * arg9.field1429;
        arg9.field1422 += (var14 - arg3) * arg9.field1430;
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
        arg9.field1417 = var12 >> 2;
        arg9.field1424 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bk(I[B[IIIIIIIIIILda;)I")
    public static int method2430(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1417 += (var19 - arg4) * arg12.field1428;
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
        arg12.field1421 = var15 >> 2;
        arg12.field1422 = var16 >> 2;
        arg12.field1424 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bb(II[B[IIIIIIIILda;II)I")
    public static int method2343(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1421 -= arg11.field1429 * arg5;
        arg11.field1422 -= arg11.field1430 * arg5;
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
        arg11.field1421 += arg11.field1429 * arg5;
        arg11.field1422 += arg11.field1430 * arg5;
        arg11.field1417 = arg6;
        arg11.field1424 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bl(II[B[IIIIIIIIIILda;II)I")
    public static int method2344(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1417 -= arg13.field1428 * arg5;
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
        arg13.field1417 += arg13.field1428 * var27;
        arg13.field1421 = arg6;
        arg13.field1422 = arg7;
        arg13.field1424 = arg4;
        return var27;
    }

    @ObfuscatedName("da.bc(II[B[IIIIIIIILda;II)I")
    public static int method2386(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1421 -= arg11.field1429 * arg5;
        arg11.field1422 -= arg11.field1430 * arg5;
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
        arg11.field1421 += arg11.field1429 * arg5;
        arg11.field1422 += arg11.field1430 * arg5;
        arg11.field1417 = arg6;
        arg11.field1424 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bg(II[B[IIIIIIIIIILda;II)I")
    public static int method2346(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1417 -= arg13.field1428 * arg5;
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
        arg13.field1417 += arg13.field1428 * var26;
        arg13.field1421 = arg6;
        arg13.field1422 = arg7;
        arg13.field1424 = arg4;
        return var26;
    }
}
