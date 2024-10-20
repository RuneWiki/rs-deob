package deob;

@ObfuscatedName("ds")
public class class114 extends class116 {

    @ObfuscatedName("ds.u")
    public int field1468;

    @ObfuscatedName("ds.f")
    public int field1458;

    @ObfuscatedName("ds.b")
    public int field1459;

    @ObfuscatedName("ds.g")
    public int field1460;

    @ObfuscatedName("ds.z")
    public int field1461;

    @ObfuscatedName("ds.p")
    public int field1471;

    @ObfuscatedName("ds.h")
    public int field1463;

    @ObfuscatedName("ds.y")
    public int field1464;

    @ObfuscatedName("ds.i")
    public int field1465;

    @ObfuscatedName("ds.k")
    public int field1462;

    @ObfuscatedName("ds.x")
    public boolean field1467;

    @ObfuscatedName("ds.o")
    public int field1466;

    @ObfuscatedName("ds.e")
    public int field1457;

    @ObfuscatedName("ds.n")
    public int field1470;

    @ObfuscatedName("ds.r")
    public int field1469;

    @ObfuscatedName("ds.u(II)I")
    public static int method2450(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.f(II)I")
    public static int method2336(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ds.at()I")
    public int method2366() {
        int var1 = this.field1461 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1464 == 0) {
            var2 -= this.field1468 * var2 / (((class104) this.field1486).field1376.length << 8);
        } else if (this.field1464 >= 0) {
            var2 -= this.field1465 * var2 / ((class104) this.field1486).field1376.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class114(class104 arg0, int arg1, int arg2) {
        this.field1486 = arg0;
        this.field1465 = arg0.field1377;
        this.field1462 = arg0.field1375;
        this.field1467 = arg0.field1379;
        this.field1458 = arg1;
        this.field1459 = arg2;
        this.field1460 = 8192;
        this.field1468 = 0;
        this.method2339();
    }

    public class114(class104 arg0, int arg1, int arg2, int arg3) {
        this.field1486 = arg0;
        this.field1465 = arg0.field1377;
        this.field1462 = arg0.field1375;
        this.field1467 = arg0.field1379;
        this.field1458 = arg1;
        this.field1459 = arg2;
        this.field1460 = arg3;
        this.field1468 = 0;
        this.method2339();
    }

    @ObfuscatedName("ds.b(Lcw;II)Lds;")
    public static class114 method2358(class104 arg0, int arg1, int arg2) {
        return arg0.field1376 == null || arg0.field1376.length == 0 ? null : new class114(arg0, (int) ((long) arg0.field1378 * 256L * (long) arg1 / (long) (Statics.field1275 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ds.g(Lcw;III)Lds;")
    public static class114 method2338(class104 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1376 == null || arg0.field1376.length == 0 ? null : new class114(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ds.z()V")
    public void method2339() {
        this.field1461 = this.field1459;
        this.field1471 = method2450(this.field1459, this.field1460);
        this.field1463 = method2336(this.field1459, this.field1460);
    }

    @ObfuscatedName("ds.i(I)V")
    public synchronized void method2341(int arg0) {
        this.field1464 = arg0;
    }

    @ObfuscatedName("ds.x(I)V")
    public synchronized void method2342(int arg0) {
        this.method2344(arg0 << 6, this.method2346());
    }

    @ObfuscatedName("ds.o(I)V")
    public synchronized void method2343(int arg0) {
        this.method2344(arg0, this.method2346());
    }

    @ObfuscatedName("ds.e(II)V")
    public synchronized void method2344(int arg0, int arg1) {
        this.field1459 = arg0;
        this.field1460 = arg1;
        this.field1466 = 0;
        this.method2339();
    }

    @ObfuscatedName("ds.n()I")
    public synchronized int method2345() {
        return this.field1459 == Integer.MIN_VALUE ? 0 : this.field1459;
    }

    @ObfuscatedName("ds.c()I")
    public synchronized int method2346() {
        return this.field1460 < 0 ? -1 : this.field1460;
    }

    @ObfuscatedName("ds.s(I)V")
    public synchronized void method2477(int arg0) {
        int var2 = ((class104) this.field1486).field1376.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1468 = arg0;
    }

    @ObfuscatedName("ds.t(Z)V")
    public synchronized void method2348(boolean arg0) {
        this.field1458 = (this.field1458 >>> 31) + (this.field1458 ^ this.field1458 >> 31);
        if (arg0) {
            this.field1458 = -this.field1458;
        }
    }

    @ObfuscatedName("ds.m()V")
    public void method2349() {
        if (this.field1466 == 0) {
            return;
        }
        if (this.field1459 == Integer.MIN_VALUE) {
            this.field1459 = 0;
        }
        this.field1466 = 0;
        this.method2339();
    }

    @ObfuscatedName("ds.v(II)V")
    public synchronized void method2350(int arg0, int arg1) {
        this.method2351(arg0, arg1, this.method2346());
    }

    @ObfuscatedName("ds.q(III)V")
    public synchronized void method2351(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2344(arg1, arg2);
            return;
        }
        int var4 = method2450(arg1, arg2);
        int var5 = method2336(arg1, arg2);
        if (this.field1471 == var4 && this.field1463 == var5) {
            this.field1466 = 0;
            return;
        }
        int var6 = arg1 - this.field1461;
        if (this.field1461 - arg1 > var6) {
            var6 = this.field1461 - arg1;
        }
        if (var4 - this.field1471 > var6) {
            var6 = var4 - this.field1471;
        }
        if (this.field1471 - var4 > var6) {
            var6 = this.field1471 - var4;
        }
        if (var5 - this.field1463 > var6) {
            var6 = var5 - this.field1463;
        }
        if (this.field1463 - var5 > var6) {
            var6 = this.field1463 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1466 = arg0;
        this.field1459 = arg1;
        this.field1460 = arg2;
        this.field1457 = (arg1 - this.field1461) / arg0;
        this.field1470 = (var4 - this.field1471) / arg0;
        this.field1469 = (var5 - this.field1463) / arg0;
    }

    @ObfuscatedName("ds.l(I)V")
    public synchronized void method2352(int arg0) {
        if (arg0 == 0) {
            this.method2343(0);
            this.method3332();
        } else if (this.field1471 == 0 && this.field1463 == 0) {
            this.field1466 = 0;
            this.field1459 = 0;
            this.field1461 = 0;
            this.method3332();
        } else {
            int var2 = -this.field1461;
            if (this.field1461 > var2) {
                var2 = this.field1461;
            }
            if (-this.field1471 > var2) {
                var2 = -this.field1471;
            }
            if (this.field1471 > var2) {
                var2 = this.field1471;
            }
            if (-this.field1463 > var2) {
                var2 = -this.field1463;
            }
            if (this.field1463 > var2) {
                var2 = this.field1463;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1466 = arg0;
            this.field1459 = Integer.MIN_VALUE;
            this.field1457 = -this.field1461 / arg0;
            this.field1470 = -this.field1471 / arg0;
            this.field1469 = -this.field1463 / arg0;
        }
    }

    @ObfuscatedName("ds.aa(I)V")
    public synchronized void method2437(int arg0) {
        if (this.field1458 < 0) {
            this.field1458 = -arg0;
        } else {
            this.field1458 = arg0;
        }
    }

    @ObfuscatedName("ds.ab()I")
    public synchronized int method2459() {
        return this.field1458 < 0 ? -this.field1458 : this.field1458;
    }

    @ObfuscatedName("ds.ar()Z")
    public boolean method2354() {
        return this.field1468 < 0 || this.field1468 >= ((class104) this.field1486).field1376.length << 8;
    }

    @ObfuscatedName("ds.ac()Z")
    public boolean method2444() {
        return this.field1466 != 0;
    }

    @ObfuscatedName("ds.p()Ldt;")
    public class116 method2116() {
        return null;
    }

    @ObfuscatedName("ds.h()Ldt;")
    public class116 method2117() {
        return null;
    }

    @ObfuscatedName("ds.y()I")
    public int method2110() {
        return this.field1459 == 0 && this.field1466 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ds.w([III)V")
    public synchronized void method2119(int[] arg0, int arg1, int arg2) {
        if (this.field1459 == 0 && this.field1466 == 0) {
            this.method2121(arg2);
            return;
        }
        class104 var4 = (class104) this.field1486;
        int var5 = this.field1465 << 8;
        int var6 = this.field1462 << 8;
        int var7 = var4.field1376.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1464 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1468 < 0) {
            if (this.field1458 <= 0) {
                this.method2349();
                this.method3332();
                return;
            }
            this.field1468 = 0;
        }
        if (this.field1468 >= var7) {
            if (this.field1458 >= 0) {
                this.method2349();
                this.method3332();
                return;
            }
            this.field1468 = var7 - 1;
        }
        if (this.field1464 >= 0) {
            if (this.field1464 > 0) {
                if (this.field1467) {
                    label131: {
                        if (this.field1458 < 0) {
                            var9 = this.method2363(arg0, arg1, var5, var10, var4.field1376[this.field1465]);
                            if (this.field1468 >= var5) {
                                return;
                            }
                            this.field1468 = var5 + var5 - 1 - this.field1468;
                            this.field1458 = -this.field1458;
                            if (--this.field1464 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2357(arg0, var9, var6, var10, var4.field1376[this.field1462 - 1]);
                            if (this.field1468 < var6) {
                                return;
                            }
                            this.field1468 = var6 + var6 - 1 - this.field1468;
                            this.field1458 = -this.field1458;
                            if (--this.field1464 == 0) {
                                break;
                            }
                            var9 = this.method2363(arg0, var9, var5, var10, var4.field1376[this.field1465]);
                            if (this.field1468 >= var5) {
                                return;
                            }
                            this.field1468 = var5 + var5 - 1 - this.field1468;
                            this.field1458 = -this.field1458;
                        } while (--this.field1464 != 0);
                    }
                } else if (this.field1458 < 0) {
                    while (true) {
                        var9 = this.method2363(arg0, var9, var5, var10, var4.field1376[this.field1462 - 1]);
                        if (this.field1468 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1468) / var8;
                        if (var12 >= this.field1464) {
                            this.field1468 += this.field1464 * var8;
                            this.field1464 = 0;
                            break;
                        }
                        this.field1468 += var8 * var12;
                        this.field1464 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2357(arg0, var9, var6, var10, var4.field1376[this.field1465]);
                        if (this.field1468 < var6) {
                            return;
                        }
                        int var13 = (this.field1468 - var5) / var8;
                        if (var13 >= this.field1464) {
                            this.field1468 -= this.field1464 * var8;
                            this.field1464 = 0;
                            break;
                        }
                        this.field1468 -= var8 * var13;
                        this.field1464 -= var13;
                    }
                }
            }
            if (this.field1458 < 0) {
                this.method2363(arg0, var9, 0, var10, 0);
                if (this.field1468 < 0) {
                    this.field1468 = -1;
                    this.method2349();
                    this.method3332();
                }
            } else {
                this.method2357(arg0, var9, var7, var10, 0);
                if (this.field1468 >= var7) {
                    this.field1468 = var7;
                    this.method2349();
                    this.method3332();
                }
            }
        } else if (this.field1467) {
            if (this.field1458 < 0) {
                var9 = this.method2363(arg0, arg1, var5, var10, var4.field1376[this.field1465]);
                if (this.field1468 >= var5) {
                    return;
                }
                this.field1468 = var5 + var5 - 1 - this.field1468;
                this.field1458 = -this.field1458;
            }
            while (true) {
                int var11 = this.method2357(arg0, var9, var6, var10, var4.field1376[this.field1462 - 1]);
                if (this.field1468 < var6) {
                    return;
                }
                this.field1468 = var6 + var6 - 1 - this.field1468;
                this.field1458 = -this.field1458;
                var9 = this.method2363(arg0, var11, var5, var10, var4.field1376[this.field1465]);
                if (this.field1468 >= var5) {
                    return;
                }
                this.field1468 = var5 + var5 - 1 - this.field1468;
                this.field1458 = -this.field1458;
            }
        } else if (this.field1458 < 0) {
            while (true) {
                var9 = this.method2363(arg0, var9, var5, var10, var4.field1376[this.field1462 - 1]);
                if (this.field1468 >= var5) {
                    return;
                }
                this.field1468 = var6 - 1 - (var6 - 1 - this.field1468) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2357(arg0, var9, var6, var10, var4.field1376[this.field1465]);
                if (this.field1468 < var6) {
                    return;
                }
                this.field1468 = (this.field1468 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ds.k(I)V")
    public synchronized void method2121(int arg0) {
        if (this.field1466 > 0) {
            if (arg0 >= this.field1466) {
                if (this.field1459 == Integer.MIN_VALUE) {
                    this.field1459 = 0;
                    this.field1463 = 0;
                    this.field1471 = 0;
                    this.field1461 = 0;
                    this.method3332();
                    arg0 = this.field1466;
                }
                this.field1466 = 0;
                this.method2339();
            } else {
                this.field1461 += this.field1457 * arg0;
                this.field1471 += this.field1470 * arg0;
                this.field1463 += this.field1469 * arg0;
                this.field1466 -= arg0;
            }
        }
        class104 var2 = (class104) this.field1486;
        int var3 = this.field1465 << 8;
        int var4 = this.field1462 << 8;
        int var5 = var2.field1376.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1464 = 0;
        }
        if (this.field1468 < 0) {
            if (this.field1458 <= 0) {
                this.method2349();
                this.method3332();
                return;
            }
            this.field1468 = 0;
        }
        if (this.field1468 >= var5) {
            if (this.field1458 >= 0) {
                this.method2349();
                this.method3332();
                return;
            }
            this.field1468 = var5 - 1;
        }
        this.field1468 += this.field1458 * arg0;
        if (this.field1464 >= 0) {
            if (this.field1464 > 0) {
                if (this.field1467) {
                    label121: {
                        if (this.field1458 < 0) {
                            if (this.field1468 >= var3) {
                                return;
                            }
                            this.field1468 = var3 + var3 - 1 - this.field1468;
                            this.field1458 = -this.field1458;
                            if (--this.field1464 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1468 < var4) {
                                return;
                            }
                            this.field1468 = var4 + var4 - 1 - this.field1468;
                            this.field1458 = -this.field1458;
                            if (--this.field1464 == 0) {
                                break;
                            }
                            if (this.field1468 >= var3) {
                                return;
                            }
                            this.field1468 = var3 + var3 - 1 - this.field1468;
                            this.field1458 = -this.field1458;
                        } while (--this.field1464 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1458 < 0) {
                            if (this.field1468 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1468) / var6;
                            if (var7 >= this.field1464) {
                                this.field1468 += this.field1464 * var6;
                                this.field1464 = 0;
                                break label153;
                            }
                            this.field1468 += var6 * var7;
                            this.field1464 -= var7;
                        } else if (this.field1468 >= var4) {
                            int var8 = (this.field1468 - var3) / var6;
                            if (var8 >= this.field1464) {
                                this.field1468 -= this.field1464 * var6;
                                this.field1464 = 0;
                                break label153;
                            }
                            this.field1468 -= var6 * var8;
                            this.field1464 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1458 < 0) {
                if (this.field1468 < 0) {
                    this.field1468 = -1;
                    this.method2349();
                    this.method3332();
                }
            } else if (this.field1468 >= var5) {
                this.field1468 = var5;
                this.method2349();
                this.method3332();
            }
        } else if (this.field1467) {
            if (this.field1458 < 0) {
                if (this.field1468 >= var3) {
                    return;
                }
                this.field1468 = var3 + var3 - 1 - this.field1468;
                this.field1458 = -this.field1458;
            }
            while (this.field1468 >= var4) {
                this.field1468 = var4 + var4 - 1 - this.field1468;
                this.field1458 = -this.field1458;
                if (this.field1468 >= var3) {
                    return;
                }
                this.field1468 = var3 + var3 - 1 - this.field1468;
                this.field1458 = -this.field1458;
            }
        } else if (this.field1458 < 0) {
            if (this.field1468 >= var3) {
                return;
            }
            this.field1468 = var4 - 1 - (var4 - 1 - this.field1468) % var6;
        } else if (this.field1468 >= var4) {
            this.field1468 = (this.field1468 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ds.az([IIIII)I")
    public int method2357(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1466 > 0) {
                int var6 = this.field1466 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1466 += arg1;
                if (this.field1458 == 256 && (this.field1468 & 0xFF) == 0) {
                    if (Statics.field1409) {
                        arg1 = method2431(0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, this.field1470, this.field1469, 0, var6, arg2, this);
                    } else {
                        arg1 = method2368(((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, this.field1457, 0, var6, arg2, this);
                    }
                } else if (Statics.field1409) {
                    arg1 = method2369(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, this.field1470, this.field1469, 0, var6, arg2, this, this.field1458, arg4);
                } else {
                    arg1 = method2372(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, this.field1457, 0, var6, arg2, this, this.field1458, arg4);
                }
                this.field1466 -= arg1;
                if (this.field1466 != 0) {
                    return arg1;
                }
                if (!this.method2359()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1458 == 256 && (this.field1468 & 0xFF) == 0) {
                if (Statics.field1409) {
                    return method2361(0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, 0, arg3, arg2, this);
                }
                return method2399(((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, 0, arg3, arg2, this);
            }
            if (Statics.field1409) {
                return method2365(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, 0, arg3, arg2, this, this.field1458, arg4);
            }
            return method2364(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, 0, arg3, arg2, this, this.field1458, arg4);
        }
    }

    @ObfuscatedName("ds.ae([IIIII)I")
    public int method2363(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1466 > 0) {
                int var6 = this.field1466 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1466 += arg1;
                if (this.field1458 == -256 && (this.field1468 & 0xFF) == 0) {
                    if (Statics.field1409) {
                        arg1 = method2371(0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, this.field1470, this.field1469, 0, var6, arg2, this);
                    } else {
                        arg1 = method2370(((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, this.field1457, 0, var6, arg2, this);
                    }
                } else if (Statics.field1409) {
                    arg1 = method2375(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, this.field1470, this.field1469, 0, var6, arg2, this, this.field1458, arg4);
                } else {
                    arg1 = method2461(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, this.field1457, 0, var6, arg2, this, this.field1458, arg4);
                }
                this.field1466 -= arg1;
                if (this.field1466 != 0) {
                    return arg1;
                }
                if (!this.method2359()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1458 == -256 && (this.field1468 & 0xFF) == 0) {
                if (Statics.field1409) {
                    return method2383(0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, 0, arg3, arg2, this);
                }
                return method2362(((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, 0, arg3, arg2, this);
            }
            if (Statics.field1409) {
                return method2409(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1471, this.field1463, 0, arg3, arg2, this, this.field1458, arg4);
            }
            return method2377(0, 0, ((class104) this.field1486).field1376, arg0, this.field1468, arg1, this.field1461, 0, arg3, arg2, this, this.field1458, arg4);
        }
    }

    @ObfuscatedName("ds.aj()Z")
    public boolean method2359() {
        int var1 = this.field1459;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2450(var1, this.field1460);
            var2 = method2336(var1, this.field1460);
        }
        if (this.field1461 != var1 || this.field1471 != var3 || this.field1463 != var2) {
            if (this.field1461 < var1) {
                this.field1457 = 1;
                this.field1466 = var1 - this.field1461;
            } else if (this.field1461 > var1) {
                this.field1457 = -1;
                this.field1466 = this.field1461 - var1;
            } else {
                this.field1457 = 0;
            }
            if (this.field1471 < var3) {
                this.field1470 = 1;
                if (this.field1466 == 0 || this.field1466 > var3 - this.field1471) {
                    this.field1466 = var3 - this.field1471;
                }
            } else if (this.field1471 > var3) {
                this.field1470 = -1;
                if (this.field1466 == 0 || this.field1466 > this.field1471 - var3) {
                    this.field1466 = this.field1471 - var3;
                }
            } else {
                this.field1470 = 0;
            }
            if (this.field1463 < var2) {
                this.field1469 = 1;
                if (this.field1466 == 0 || this.field1466 > var2 - this.field1463) {
                    this.field1466 = var2 - this.field1463;
                }
            } else if (this.field1463 > var2) {
                this.field1469 = -1;
                if (this.field1466 == 0 || this.field1466 > this.field1463 - var2) {
                    this.field1466 = this.field1463 - var2;
                }
            } else {
                this.field1469 = 0;
            }
            return false;
        } else if (this.field1459 == Integer.MIN_VALUE) {
            this.field1459 = 0;
            this.field1463 = 0;
            this.field1471 = 0;
            this.field1461 = 0;
            this.method3332();
            return true;
        } else {
            this.method2339();
            return false;
        }
    }

    @ObfuscatedName("ds.ap([B[IIIIIIILds;)I")
    public static int method2399(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1468 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.an(I[B[IIIIIIIILds;)I")
    public static int method2361(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1468 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ds.al([B[IIIIIIILds;)I")
    public static int method2362(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8) {
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
        arg8.field1468 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.ay(I[B[IIIIIIIILds;)I")
    public static int method2383(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10) {
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
        arg10.field1468 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ds.ax(II[B[IIIIIIILds;II)I")
    public static int method2364(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1468 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.au(II[B[IIIIIIIILds;II)I")
    public static int method2365(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1468 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ds.as(II[B[IIIIIIILds;II)I")
    public static int method2377(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class114 arg10, int arg11, int arg12) {
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
        arg10.field1468 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.ah(II[B[IIIIIIIILds;II)I")
    public static int method2409(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
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
        arg11.field1468 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ds.bi([B[IIIIIIIILds;)I")
    public static int method2368(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1471 += (var14 - arg3) * arg9.field1470;
        arg9.field1463 += (var14 - arg3) * arg9.field1469;
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
        arg9.field1461 = var12 >> 2;
        arg9.field1468 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bo(I[B[IIIIIIIIIILds;)I")
    public static int method2431(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1461 += (var19 - arg4) * arg12.field1457;
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
        arg12.field1471 = var15 >> 2;
        arg12.field1463 = var16 >> 2;
        arg12.field1468 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bx([B[IIIIIIIILds;)I")
    public static int method2370(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class114 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1471 += (var14 - arg3) * arg9.field1470;
        arg9.field1463 += (var14 - arg3) * arg9.field1469;
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
        arg9.field1461 = var12 >> 2;
        arg9.field1468 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ds.bu(I[B[IIIIIIIIIILds;)I")
    public static int method2371(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class114 arg12) {
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
        arg12.field1461 += (var19 - arg4) * arg12.field1457;
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
        arg12.field1471 = var15 >> 2;
        arg12.field1463 = var16 >> 2;
        arg12.field1468 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ds.bd(II[B[IIIIIIIILds;II)I")
    public static int method2372(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1471 -= arg11.field1470 * arg5;
        arg11.field1463 -= arg11.field1469 * arg5;
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
        arg11.field1471 += arg11.field1470 * arg5;
        arg11.field1463 += arg11.field1469 * arg5;
        arg11.field1461 = arg6;
        arg11.field1468 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bn(II[B[IIIIIIIIIILds;II)I")
    public static int method2369(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1461 -= arg13.field1457 * arg5;
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
        arg13.field1461 += arg13.field1457 * var27;
        arg13.field1471 = arg6;
        arg13.field1463 = arg7;
        arg13.field1468 = arg4;
        return var27;
    }

    @ObfuscatedName("ds.bj(II[B[IIIIIIIILds;II)I")
    public static int method2461(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class114 arg11, int arg12, int arg13) {
        arg11.field1471 -= arg11.field1470 * arg5;
        arg11.field1463 -= arg11.field1469 * arg5;
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
        arg11.field1471 += arg11.field1470 * arg5;
        arg11.field1463 += arg11.field1469 * arg5;
        arg11.field1461 = arg6;
        arg11.field1468 = arg4;
        return arg5;
    }

    @ObfuscatedName("ds.bm(II[B[IIIIIIIIIILds;II)I")
    public static int method2375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class114 arg13, int arg14, int arg15) {
        arg13.field1461 -= arg13.field1457 * arg5;
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
        arg13.field1461 += arg13.field1457 * var26;
        arg13.field1471 = arg6;
        arg13.field1463 = arg7;
        arg13.field1468 = arg4;
        return var26;
    }
}
