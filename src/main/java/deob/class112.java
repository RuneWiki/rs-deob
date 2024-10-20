package deob;

@ObfuscatedName("ds")
public class class112 extends class114 {

    @ObfuscatedName("ds.m")
    public int field1426;

    @ObfuscatedName("ds.f")
    public int field1423;

    @ObfuscatedName("ds.q")
    public int field1422;

    @ObfuscatedName("ds.o")
    public int field1425;

    @ObfuscatedName("ds.u")
    public int field1435;

    @ObfuscatedName("ds.g")
    public int field1427;

    @ObfuscatedName("ds.l")
    public int field1428;

    @ObfuscatedName("ds.e")
    public int field1429;

    @ObfuscatedName("ds.x")
    public int field1430;

    @ObfuscatedName("ds.d")
    public int field1424;

    @ObfuscatedName("ds.k")
    public boolean field1432;

    @ObfuscatedName("ds.n")
    public int field1431;

    @ObfuscatedName("ds.i")
    public int field1434;

    @ObfuscatedName("ds.a")
    public int field1433;

    @ObfuscatedName("ds.z")
    public int field1436;

    @ObfuscatedName("ds.m(II)I")
    public static int method2373(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.f(II)I")
    public static int method2281(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.az()I")
    public int method2282() {
        int var1 = this.field1435 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1429 == 0) {
            var2 -= this.field1426 * var2 / (((class102) this.field1451).field1348.length << 8);
        } else if (this.field1429 >= 0) {
            var2 -= this.field1430 * var2 / ((class102) this.field1451).field1348.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class112(class102 arg0, int arg1, int arg2) {
        this.field1451 = arg0;
        this.field1430 = arg0.field1349;
        this.field1424 = arg0.field1347;
        this.field1432 = arg0.field1351;
        this.field1423 = arg1;
        this.field1422 = arg2;
        this.field1425 = 8192;
        this.field1426 = 0;
        this.method2286();
    }

    public class112(class102 arg0, int arg1, int arg2, int arg3) {
        this.field1451 = arg0;
        this.field1430 = arg0.field1349;
        this.field1424 = arg0.field1347;
        this.field1432 = arg0.field1351;
        this.field1423 = arg1;
        this.field1422 = arg2;
        this.field1425 = arg3;
        this.field1426 = 0;
        this.method2286();
    }

    @ObfuscatedName("ds.q(Lcx;II)Lds;")
    public static class112 method2284(class102 arg0, int arg1, int arg2) {
        return arg0.field1348 == null || arg0.field1348.length == 0 ? null : new class112(arg0, (int) ((long) arg0.field1350 * 256L * (long) arg1 / (long) (Statics.field3803 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ds.w(Lcx;III)Lds;")
    public static class112 method2305(class102 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1348 == null || arg0.field1348.length == 0 ? null : new class112(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ds.o()V")
    public void method2286() {
        this.field1435 = this.field1422;
        this.field1427 = method2373(this.field1422, this.field1425);
        this.field1428 = method2281(this.field1422, this.field1425);
    }

    @ObfuscatedName("ds.x(I)V")
    public synchronized void method2308(int arg0) {
        this.field1429 = arg0;
    }

    @ObfuscatedName("ds.a(I)V")
    public synchronized void method2333(int arg0) {
        this.method2288(arg0 << 6, this.method2290());
    }

    @ObfuscatedName("ds.z(I)V")
    public synchronized void method2285(int arg0) {
        this.method2288(arg0, this.method2290());
    }

    @ObfuscatedName("ds.j(II)V")
    public synchronized void method2288(int arg0, int arg1) {
        this.field1422 = arg0;
        this.field1425 = arg1;
        this.field1431 = 0;
        this.method2286();
    }

    @ObfuscatedName("ds.s()I")
    public synchronized int method2327() {
        return this.field1422 == Integer.MIN_VALUE ? 0 : this.field1422;
    }

    @ObfuscatedName("ds.t()I")
    public synchronized int method2290() {
        return this.field1425 < 0 ? -1 : this.field1425;
    }

    @ObfuscatedName("ds.y(I)V")
    public synchronized void method2316(int arg0) {
        int var2 = ((class102) this.field1451).field1348.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1426 = arg0;
    }

    @ObfuscatedName("ds.h(Z)V")
    public synchronized void method2292(boolean arg0) {
        this.field1423 = (this.field1423 >>> 31) + (this.field1423 ^ this.field1423 >> 31);
        if (arg0) {
            this.field1423 = -this.field1423;
        }
    }

    @ObfuscatedName("ds.b()V")
    public void method2301() {
        if (this.field1431 == 0) {
            return;
        }
        if (this.field1422 == Integer.MIN_VALUE) {
            this.field1422 = 0;
        }
        this.field1431 = 0;
        this.method2286();
    }

    @ObfuscatedName("ds.c(II)V")
    public synchronized void method2386(int arg0, int arg1) {
        this.method2362(arg0, arg1, this.method2290());
    }

    @ObfuscatedName("ds.p(III)V")
    public synchronized void method2362(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2288(arg1, arg2);
            return;
        }
        int var4 = method2373(arg1, arg2);
        int var5 = method2281(arg1, arg2);
        if (this.field1427 == var4 && this.field1428 == var5) {
            this.field1431 = 0;
            return;
        }
        int var6 = arg1 - this.field1435;
        if (this.field1435 - arg1 > var6) {
            var6 = this.field1435 - arg1;
        }
        if (var4 - this.field1427 > var6) {
            var6 = var4 - this.field1427;
        }
        if (this.field1427 - var4 > var6) {
            var6 = this.field1427 - var4;
        }
        if (var5 - this.field1428 > var6) {
            var6 = var5 - this.field1428;
        }
        if (this.field1428 - var5 > var6) {
            var6 = this.field1428 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1431 = arg0;
        this.field1422 = arg1;
        this.field1425 = arg2;
        this.field1434 = (arg1 - this.field1435) / arg0;
        this.field1433 = (var4 - this.field1427) / arg0;
        this.field1436 = (var5 - this.field1428) / arg0;
    }

    @ObfuscatedName("ds.v(I)V")
    public synchronized void method2296(int arg0) {
        if (arg0 == 0) {
            this.method2285(0);
            this.method3306();
        } else if (this.field1427 == 0 && this.field1428 == 0) {
            this.field1431 = 0;
            this.field1422 = 0;
            this.field1435 = 0;
            this.method3306();
        } else {
            int var2 = -this.field1435;
            if (this.field1435 > var2) {
                var2 = this.field1435;
            }
            if (-this.field1427 > var2) {
                var2 = -this.field1427;
            }
            if (this.field1427 > var2) {
                var2 = this.field1427;
            }
            if (-this.field1428 > var2) {
                var2 = -this.field1428;
            }
            if (this.field1428 > var2) {
                var2 = this.field1428;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1431 = arg0;
            this.field1422 = Integer.MIN_VALUE;
            this.field1434 = -this.field1435 / arg0;
            this.field1433 = -this.field1427 / arg0;
            this.field1436 = -this.field1428 / arg0;
        }
    }

    @ObfuscatedName("ds.ah(I)V")
    public synchronized void method2320(int arg0) {
        if (this.field1423 < 0) {
            this.field1423 = -arg0;
        } else {
            this.field1423 = arg0;
        }
    }

    @ObfuscatedName("ds.ab()I")
    public synchronized int method2372() {
        return this.field1423 < 0 ? -this.field1423 : this.field1423;
    }

    @ObfuscatedName("ds.ae()Z")
    public boolean method2299() {
        return this.field1426 < 0 || this.field1426 >= ((class102) this.field1451).field1348.length << 8;
    }

    @ObfuscatedName("ds.at()Z")
    public boolean method2300() {
        return this.field1431 != 0;
    }

    @ObfuscatedName("ds.u()Ldc;")
    public class114 method2078() {
        return null;
    }

    @ObfuscatedName("ds.g()Ldc;")
    public class114 method2104() {
        return null;
    }

    @ObfuscatedName("ds.l()I")
    public int method2080() {
        return this.field1422 == 0 && this.field1431 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ds.e([III)V")
    public synchronized void method2081(int[] arg0, int arg1, int arg2) {
        if (this.field1422 == 0 && this.field1431 == 0) {
            this.method2083(arg2);
            return;
        }
        class102 var4 = (class102) this.field1451;
        int var5 = this.field1430 << 8;
        int var6 = this.field1424 << 8;
        int var7 = var4.field1348.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1429 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1426 < 0) {
            if (this.field1423 <= 0) {
                this.method2301();
                this.method3306();
                return;
            }
            this.field1426 = 0;
        }
        if (this.field1426 >= var7) {
            if (this.field1423 >= 0) {
                this.method2301();
                this.method3306();
                return;
            }
            this.field1426 = var7 - 1;
        }
        if (this.field1429 >= 0) {
            if (this.field1429 > 0) {
                if (this.field1432) {
                    label131: {
                        if (this.field1423 < 0) {
                            var9 = this.method2321(arg0, arg1, var5, var10, var4.field1348[this.field1430]);
                            if (this.field1426 >= var5) {
                                return;
                            }
                            this.field1426 = var5 + var5 - 1 - this.field1426;
                            this.field1423 = -this.field1423;
                            if (--this.field1429 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2302(arg0, var9, var6, var10, var4.field1348[this.field1424 - 1]);
                            if (this.field1426 < var6) {
                                return;
                            }
                            this.field1426 = var6 + var6 - 1 - this.field1426;
                            this.field1423 = -this.field1423;
                            if (--this.field1429 == 0) {
                                break;
                            }
                            var9 = this.method2321(arg0, var9, var5, var10, var4.field1348[this.field1430]);
                            if (this.field1426 >= var5) {
                                return;
                            }
                            this.field1426 = var5 + var5 - 1 - this.field1426;
                            this.field1423 = -this.field1423;
                        } while (--this.field1429 != 0);
                    }
                } else if (this.field1423 < 0) {
                    while (true) {
                        var9 = this.method2321(arg0, var9, var5, var10, var4.field1348[this.field1424 - 1]);
                        if (this.field1426 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1426) / var8;
                        if (var12 >= this.field1429) {
                            this.field1426 += this.field1429 * var8;
                            this.field1429 = 0;
                            break;
                        }
                        this.field1426 += var8 * var12;
                        this.field1429 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2302(arg0, var9, var6, var10, var4.field1348[this.field1430]);
                        if (this.field1426 < var6) {
                            return;
                        }
                        int var13 = (this.field1426 - var5) / var8;
                        if (var13 >= this.field1429) {
                            this.field1426 -= this.field1429 * var8;
                            this.field1429 = 0;
                            break;
                        }
                        this.field1426 -= var8 * var13;
                        this.field1429 -= var13;
                    }
                }
            }
            if (this.field1423 < 0) {
                this.method2321(arg0, var9, 0, var10, 0);
                if (this.field1426 < 0) {
                    this.field1426 = -1;
                    this.method2301();
                    this.method3306();
                }
            } else {
                this.method2302(arg0, var9, var7, var10, 0);
                if (this.field1426 >= var7) {
                    this.field1426 = var7;
                    this.method2301();
                    this.method3306();
                }
            }
        } else if (this.field1432) {
            if (this.field1423 < 0) {
                var9 = this.method2321(arg0, arg1, var5, var10, var4.field1348[this.field1430]);
                if (this.field1426 >= var5) {
                    return;
                }
                this.field1426 = var5 + var5 - 1 - this.field1426;
                this.field1423 = -this.field1423;
            }
            while (true) {
                int var11 = this.method2302(arg0, var9, var6, var10, var4.field1348[this.field1424 - 1]);
                if (this.field1426 < var6) {
                    return;
                }
                this.field1426 = var6 + var6 - 1 - this.field1426;
                this.field1423 = -this.field1423;
                var9 = this.method2321(arg0, var11, var5, var10, var4.field1348[this.field1430]);
                if (this.field1426 >= var5) {
                    return;
                }
                this.field1426 = var5 + var5 - 1 - this.field1426;
                this.field1423 = -this.field1423;
            }
        } else if (this.field1423 < 0) {
            while (true) {
                var9 = this.method2321(arg0, var9, var5, var10, var4.field1348[this.field1424 - 1]);
                if (this.field1426 >= var5) {
                    return;
                }
                this.field1426 = var6 - 1 - (var6 - 1 - this.field1426) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2302(arg0, var9, var6, var10, var4.field1348[this.field1430]);
                if (this.field1426 < var6) {
                    return;
                }
                this.field1426 = (this.field1426 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ds.d(I)V")
    public synchronized void method2083(int arg0) {
        if (this.field1431 > 0) {
            if (arg0 >= this.field1431) {
                if (this.field1422 == Integer.MIN_VALUE) {
                    this.field1422 = 0;
                    this.field1428 = 0;
                    this.field1427 = 0;
                    this.field1435 = 0;
                    this.method3306();
                    arg0 = this.field1431;
                }
                this.field1431 = 0;
                this.method2286();
            } else {
                this.field1435 += this.field1434 * arg0;
                this.field1427 += this.field1433 * arg0;
                this.field1428 += this.field1436 * arg0;
                this.field1431 -= arg0;
            }
        }
        class102 var2 = (class102) this.field1451;
        int var3 = this.field1430 << 8;
        int var4 = this.field1424 << 8;
        int var5 = var2.field1348.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1429 = 0;
        }
        if (this.field1426 < 0) {
            if (this.field1423 <= 0) {
                this.method2301();
                this.method3306();
                return;
            }
            this.field1426 = 0;
        }
        if (this.field1426 >= var5) {
            if (this.field1423 >= 0) {
                this.method2301();
                this.method3306();
                return;
            }
            this.field1426 = var5 - 1;
        }
        this.field1426 += this.field1423 * arg0;
        if (this.field1429 >= 0) {
            if (this.field1429 > 0) {
                if (this.field1432) {
                    label121: {
                        if (this.field1423 < 0) {
                            if (this.field1426 >= var3) {
                                return;
                            }
                            this.field1426 = var3 + var3 - 1 - this.field1426;
                            this.field1423 = -this.field1423;
                            if (--this.field1429 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1426 < var4) {
                                return;
                            }
                            this.field1426 = var4 + var4 - 1 - this.field1426;
                            this.field1423 = -this.field1423;
                            if (--this.field1429 == 0) {
                                break;
                            }
                            if (this.field1426 >= var3) {
                                return;
                            }
                            this.field1426 = var3 + var3 - 1 - this.field1426;
                            this.field1423 = -this.field1423;
                        } while (--this.field1429 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1423 < 0) {
                            if (this.field1426 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1426) / var6;
                            if (var7 >= this.field1429) {
                                this.field1426 += this.field1429 * var6;
                                this.field1429 = 0;
                                break label153;
                            }
                            this.field1426 += var6 * var7;
                            this.field1429 -= var7;
                        } else if (this.field1426 >= var4) {
                            int var8 = (this.field1426 - var3) / var6;
                            if (var8 >= this.field1429) {
                                this.field1426 -= this.field1429 * var6;
                                this.field1429 = 0;
                                break label153;
                            }
                            this.field1426 -= var6 * var8;
                            this.field1429 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1423 < 0) {
                if (this.field1426 < 0) {
                    this.field1426 = -1;
                    this.method2301();
                    this.method3306();
                }
            } else if (this.field1426 >= var5) {
                this.field1426 = var5;
                this.method2301();
                this.method3306();
            }
        } else if (this.field1432) {
            if (this.field1423 < 0) {
                if (this.field1426 >= var3) {
                    return;
                }
                this.field1426 = var3 + var3 - 1 - this.field1426;
                this.field1423 = -this.field1423;
            }
            while (this.field1426 >= var4) {
                this.field1426 = var4 + var4 - 1 - this.field1426;
                this.field1423 = -this.field1423;
                if (this.field1426 >= var3) {
                    return;
                }
                this.field1426 = var3 + var3 - 1 - this.field1426;
                this.field1423 = -this.field1423;
            }
        } else if (this.field1423 < 0) {
            if (this.field1426 >= var3) {
                return;
            }
            this.field1426 = var4 - 1 - (var4 - 1 - this.field1426) % var6;
        } else if (this.field1426 >= var4) {
            this.field1426 = (this.field1426 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ds.ad([IIIII)I")
    public int method2302(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1431 > 0) {
                int var6 = this.field1431 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1431 += arg1;
                if (this.field1423 == 256 && (this.field1426 & 0xFF) == 0) {
                    if (Statics.field1370) {
                        arg1 = method2314(0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, this.field1433, this.field1436, 0, var6, arg2, this);
                    } else {
                        arg1 = method2313(((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, this.field1434, 0, var6, arg2, this);
                    }
                } else if (Statics.field1370) {
                    arg1 = method2289(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, this.field1433, this.field1436, 0, var6, arg2, this, this.field1423, arg4);
                } else {
                    arg1 = method2317(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, this.field1434, 0, var6, arg2, this, this.field1423, arg4);
                }
                this.field1431 -= arg1;
                if (this.field1431 != 0) {
                    return arg1;
                }
                if (!this.method2304()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1423 == 256 && (this.field1426 & 0xFF) == 0) {
                if (Statics.field1370) {
                    return method2306(0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, 0, arg3, arg2, this);
                }
                return method2338(((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, 0, arg3, arg2, this);
            }
            if (Statics.field1370) {
                return method2310(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, 0, arg3, arg2, this, this.field1423, arg4);
            }
            return method2309(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, 0, arg3, arg2, this, this.field1423, arg4);
        }
    }

    @ObfuscatedName("ds.ap([IIIII)I")
    public int method2321(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1431 > 0) {
                int var6 = this.field1431 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1431 += arg1;
                if (this.field1423 == -256 && (this.field1426 & 0xFF) == 0) {
                    if (Statics.field1370) {
                        arg1 = method2324(0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, this.field1433, this.field1436, 0, var6, arg2, this);
                    } else {
                        arg1 = method2315(((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, this.field1434, 0, var6, arg2, this);
                    }
                } else if (Statics.field1370) {
                    arg1 = method2394(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, this.field1433, this.field1436, 0, var6, arg2, this, this.field1423, arg4);
                } else {
                    arg1 = method2319(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, this.field1434, 0, var6, arg2, this, this.field1423, arg4);
                }
                this.field1431 -= arg1;
                if (this.field1431 != 0) {
                    return arg1;
                }
                if (!this.method2304()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1423 == -256 && (this.field1426 & 0xFF) == 0) {
                if (Statics.field1370) {
                    return method2283(0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, 0, arg3, arg2, this);
                }
                return method2405(((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, 0, arg3, arg2, this);
            }
            if (Statics.field1370) {
                return method2312(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1427, this.field1428, 0, arg3, arg2, this, this.field1423, arg4);
            }
            return method2294(0, 0, ((class102) this.field1451).field1348, arg0, this.field1426, arg1, this.field1435, 0, arg3, arg2, this, this.field1423, arg4);
        }
    }

    @ObfuscatedName("ds.au()Z")
    public boolean method2304() {
        int var1 = this.field1422;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2373(var1, this.field1425);
            var2 = method2281(var1, this.field1425);
        }
        if (this.field1435 != var1 || this.field1427 != var3 || this.field1428 != var2) {
            if (this.field1435 < var1) {
                this.field1434 = 1;
                this.field1431 = var1 - this.field1435;
            } else if (this.field1435 > var1) {
                this.field1434 = -1;
                this.field1431 = this.field1435 - var1;
            } else {
                this.field1434 = 0;
            }
            if (this.field1427 < var3) {
                this.field1433 = 1;
                if (this.field1431 == 0 || this.field1431 > var3 - this.field1427) {
                    this.field1431 = var3 - this.field1427;
                }
            } else if (this.field1427 > var3) {
                this.field1433 = -1;
                if (this.field1431 == 0 || this.field1431 > this.field1427 - var3) {
                    this.field1431 = this.field1427 - var3;
                }
            } else {
                this.field1433 = 0;
            }
            if (this.field1428 < var2) {
                this.field1436 = 1;
                if (this.field1431 == 0 || this.field1431 > var2 - this.field1428) {
                    this.field1431 = var2 - this.field1428;
                }
            } else if (this.field1428 > var2) {
                this.field1436 = -1;
                if (this.field1431 == 0 || this.field1431 > this.field1428 - var2) {
                    this.field1431 = this.field1428 - var2;
                }
            } else {
                this.field1436 = 0;
            }
            return false;
        } else if (this.field1422 == Integer.MIN_VALUE) {
            this.field1422 = 0;
            this.field1428 = 0;
            this.field1427 = 0;
            this.field1435 = 0;
            this.method3306();
            return true;
        } else {
            this.method2286();
            return false;
        }
    }

    @ObfuscatedName("ds.ao([B[IIIIIIILds;)I")
    public static int method2338(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112 arg8) {
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
        arg8.field1426 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.aa(I[B[IIIIIIIILds;)I")
    public static int method2306(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10) {
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
        arg10.field1426 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ds.ax([B[IIIIIIILds;)I")
    public static int method2405(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112 arg8) {
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
        arg8.field1426 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.af(I[B[IIIIIIIILds;)I")
    public static int method2283(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10) {
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
        arg10.field1426 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ds.ai(II[B[IIIIIIILds;II)I")
    public static int method2309(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10, int arg11, int arg12) {
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
        arg10.field1426 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.ba(II[B[IIIIIIIILds;II)I")
    public static int method2310(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
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
        arg11.field1426 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ds.bb(II[B[IIIIIIILds;II)I")
    public static int method2294(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class112 arg10, int arg11, int arg12) {
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
        arg10.field1426 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bs(II[B[IIIIIIIILds;II)I")
    public static int method2312(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
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
        arg11.field1426 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ds.bq([B[IIIIIIIILds;)I")
    public static int method2313(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class112 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1427 += (var14 - arg3) * arg9.field1433;
        arg9.field1428 += (var14 - arg3) * arg9.field1436;
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
        arg9.field1435 = var12 >> 2;
        arg9.field1426 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bn(I[B[IIIIIIIIIILds;)I")
    public static int method2314(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class112 arg12) {
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
        arg12.field1435 += (var19 - arg4) * arg12.field1434;
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
        arg12.field1427 = var15 >> 2;
        arg12.field1428 = var16 >> 2;
        arg12.field1426 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bk([B[IIIIIIIILds;)I")
    public static int method2315(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class112 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1427 += (var14 - arg3) * arg9.field1433;
        arg9.field1428 += (var14 - arg3) * arg9.field1436;
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
        arg9.field1435 = var12 >> 2;
        arg9.field1426 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bd(I[B[IIIIIIIIIILds;)I")
    public static int method2324(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class112 arg12) {
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
        arg12.field1435 += (var19 - arg4) * arg12.field1434;
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
        arg12.field1427 = var15 >> 2;
        arg12.field1428 = var16 >> 2;
        arg12.field1426 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bc(II[B[IIIIIIIILds;II)I")
    public static int method2317(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
        arg11.field1427 -= arg11.field1433 * arg5;
        arg11.field1428 -= arg11.field1436 * arg5;
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
        arg11.field1427 += arg11.field1433 * arg5;
        arg11.field1428 += arg11.field1436 * arg5;
        arg11.field1435 = arg6;
        arg11.field1426 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bo(II[B[IIIIIIIIIILds;II)I")
    public static int method2289(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class112 arg13, int arg14, int arg15) {
        arg13.field1435 -= arg13.field1434 * arg5;
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
        arg13.field1435 += arg13.field1434 * var27;
        arg13.field1427 = arg6;
        arg13.field1428 = arg7;
        arg13.field1426 = arg4;
        return var27;
    }

    @ObfuscatedName("ds.bx(II[B[IIIIIIIILds;II)I")
    public static int method2319(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class112 arg11, int arg12, int arg13) {
        arg11.field1427 -= arg11.field1433 * arg5;
        arg11.field1428 -= arg11.field1436 * arg5;
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
        arg11.field1427 += arg11.field1433 * arg5;
        arg11.field1428 += arg11.field1436 * arg5;
        arg11.field1435 = arg6;
        arg11.field1426 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.by(II[B[IIIIIIIIIILds;II)I")
    public static int method2394(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class112 arg13, int arg14, int arg15) {
        arg13.field1435 -= arg13.field1434 * arg5;
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
        arg13.field1435 += arg13.field1434 * var26;
        arg13.field1427 = arg6;
        arg13.field1428 = arg7;
        arg13.field1426 = arg4;
        return var26;
    }
}
