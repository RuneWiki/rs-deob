package deob;

@ObfuscatedName("dx")
public class class106 extends class108 {

    @ObfuscatedName("dx.y")
    public int field1412;

    @ObfuscatedName("dx.c")
    public int field1406;

    @ObfuscatedName("dx.n")
    public int field1407;

    @ObfuscatedName("dx.u")
    public int field1408;

    @ObfuscatedName("dx.i")
    public int field1409;

    @ObfuscatedName("dx.r")
    public int field1410;

    @ObfuscatedName("dx.j")
    public int field1411;

    @ObfuscatedName("dx.p")
    public int field1405;

    @ObfuscatedName("dx.e")
    public int field1413;

    @ObfuscatedName("dx.s")
    public int field1414;

    @ObfuscatedName("dx.v")
    public boolean field1416;

    @ObfuscatedName("dx.k")
    public int field1415;

    @ObfuscatedName("dx.o")
    public int field1417;

    @ObfuscatedName("dx.q")
    public int field1418;

    @ObfuscatedName("dx.l")
    public int field1419;

    @ObfuscatedName("dx.y(II)I")
    public static int method2139(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dx.c(II)I")
    public static int method2198(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dx.aq()I")
    public int method2125() {
        int var1 = this.field1409 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1405 == 0) {
            var2 -= this.field1412 * var2 / (((class96) this.field1432).field1334.length << 8);
        } else if (this.field1405 >= 0) {
            var2 -= this.field1413 * var2 / ((class96) this.field1432).field1334.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class106(class96 arg0, int arg1, int arg2) {
        this.field1432 = arg0;
        this.field1413 = arg0.field1336;
        this.field1414 = arg0.field1335;
        this.field1416 = arg0.field1332;
        this.field1406 = arg1;
        this.field1407 = arg2;
        this.field1408 = 8192;
        this.field1412 = 0;
        this.method2128();
    }

    public class106(class96 arg0, int arg1, int arg2, int arg3) {
        this.field1432 = arg0;
        this.field1413 = arg0.field1336;
        this.field1414 = arg0.field1335;
        this.field1416 = arg0.field1332;
        this.field1406 = arg1;
        this.field1407 = arg2;
        this.field1408 = arg3;
        this.field1412 = 0;
        this.method2128();
    }

    @ObfuscatedName("dx.n(Lcz;II)Ldx;")
    public static class106 method2126(class96 arg0, int arg1, int arg2) {
        return arg0.field1334 == null || arg0.field1334.length == 0 ? null : new class106(arg0, (int) ((long) arg0.field1333 * 256L * (long) arg1 / (long) (Statics.field56 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dx.u(Lcz;III)Ldx;")
    public static class106 method2127(class96 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1334 == null || arg0.field1334.length == 0 ? null : new class106(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dx.i()V")
    public void method2128() {
        this.field1409 = this.field1407;
        this.field1410 = method2139(this.field1407, this.field1408);
        this.field1411 = method2198(this.field1407, this.field1408);
    }

    @ObfuscatedName("dx.k(I)V")
    public synchronized void method2129(int arg0) {
        this.field1405 = arg0;
    }

    @ObfuscatedName("dx.q(I)V")
    public synchronized void method2130(int arg0) {
        this.method2216(arg0 << 6, this.method2161());
    }

    @ObfuscatedName("dx.l(I)V")
    public synchronized void method2212(int arg0) {
        this.method2216(arg0, this.method2161());
    }

    @ObfuscatedName("dx.f(II)V")
    public synchronized void method2216(int arg0, int arg1) {
        this.field1407 = arg0;
        this.field1408 = arg1;
        this.field1415 = 0;
        this.method2128();
    }

    @ObfuscatedName("dx.z()I")
    public synchronized int method2133() {
        return this.field1407 == Integer.MIN_VALUE ? 0 : this.field1407;
    }

    @ObfuscatedName("dx.a()I")
    public synchronized int method2161() {
        return this.field1408 < 0 ? -1 : this.field1408;
    }

    @ObfuscatedName("dx.x(I)V")
    public synchronized void method2135(int arg0) {
        int var2 = ((class96) this.field1432).field1334.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1412 = arg0;
    }

    @ObfuscatedName("dx.b(Z)V")
    public synchronized void method2136(boolean arg0) {
        this.field1406 = (this.field1406 >>> 31) + (this.field1406 ^ this.field1406 >> 31);
        if (arg0) {
            this.field1406 = -this.field1406;
        }
    }

    @ObfuscatedName("dx.w()V")
    public void method2181() {
        if (this.field1415 == 0) {
            return;
        }
        if (this.field1407 == Integer.MIN_VALUE) {
            this.field1407 = 0;
        }
        this.field1415 = 0;
        this.method2128();
    }

    @ObfuscatedName("dx.g(II)V")
    public synchronized void method2138(int arg0, int arg1) {
        this.method2252(arg0, arg1, this.method2161());
    }

    @ObfuscatedName("dx.d(III)V")
    public synchronized void method2252(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2216(arg1, arg2);
            return;
        }
        int var4 = method2139(arg1, arg2);
        int var5 = method2198(arg1, arg2);
        if (this.field1410 == var4 && this.field1411 == var5) {
            this.field1415 = 0;
            return;
        }
        int var6 = arg1 - this.field1409;
        if (this.field1409 - arg1 > var6) {
            var6 = this.field1409 - arg1;
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
        this.field1415 = arg0;
        this.field1407 = arg1;
        this.field1408 = arg2;
        this.field1417 = (arg1 - this.field1409) / arg0;
        this.field1418 = (var4 - this.field1410) / arg0;
        this.field1419 = (var5 - this.field1411) / arg0;
    }

    @ObfuscatedName("dx.am(I)V")
    public synchronized void method2140(int arg0) {
        if (arg0 == 0) {
            this.method2212(0);
            this.method3766();
        } else if (this.field1410 == 0 && this.field1411 == 0) {
            this.field1415 = 0;
            this.field1407 = 0;
            this.field1409 = 0;
            this.method3766();
        } else {
            int var2 = -this.field1409;
            if (this.field1409 > var2) {
                var2 = this.field1409;
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
            this.field1415 = arg0;
            this.field1407 = Integer.MIN_VALUE;
            this.field1417 = -this.field1409 / arg0;
            this.field1418 = -this.field1410 / arg0;
            this.field1419 = -this.field1411 / arg0;
        }
    }

    @ObfuscatedName("dx.ap(I)V")
    public synchronized void method2141(int arg0) {
        if (this.field1406 < 0) {
            this.field1406 = -arg0;
        } else {
            this.field1406 = arg0;
        }
    }

    @ObfuscatedName("dx.ai()I")
    public synchronized int method2142() {
        return this.field1406 < 0 ? -this.field1406 : this.field1406;
    }

    @ObfuscatedName("dx.ab()Z")
    public boolean method2143() {
        return this.field1412 < 0 || this.field1412 >= ((class96) this.field1432).field1334.length << 8;
    }

    @ObfuscatedName("dx.az()Z")
    public boolean method2172() {
        return this.field1415 != 0;
    }

    @ObfuscatedName("dx.p()Ldt;")
    public class108 method1928() {
        return null;
    }

    @ObfuscatedName("dx.e()Ldt;")
    public class108 method1929() {
        return null;
    }

    @ObfuscatedName("dx.s()I")
    public int method1936() {
        return this.field1407 == 0 && this.field1415 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dx.v([III)V")
    public synchronized void method1931(int[] arg0, int arg1, int arg2) {
        if (this.field1407 == 0 && this.field1415 == 0) {
            this.method1958(arg2);
            return;
        }
        class96 var4 = (class96) this.field1432;
        int var5 = this.field1413 << 8;
        int var6 = this.field1414 << 8;
        int var7 = var4.field1334.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1405 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1412 < 0) {
            if (this.field1406 <= 0) {
                this.method2181();
                this.method3766();
                return;
            }
            this.field1412 = 0;
        }
        if (this.field1412 >= var7) {
            if (this.field1406 >= 0) {
                this.method2181();
                this.method3766();
                return;
            }
            this.field1412 = var7 - 1;
        }
        if (this.field1405 >= 0) {
            if (this.field1405 > 0) {
                if (this.field1416) {
                    label131: {
                        if (this.field1406 < 0) {
                            var9 = this.method2149(arg0, arg1, var5, var10, var4.field1334[this.field1413]);
                            if (this.field1412 >= var5) {
                                return;
                            }
                            this.field1412 = var5 + var5 - 1 - this.field1412;
                            this.field1406 = -this.field1406;
                            if (--this.field1405 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2148(arg0, var9, var6, var10, var4.field1334[this.field1414 - 1]);
                            if (this.field1412 < var6) {
                                return;
                            }
                            this.field1412 = var6 + var6 - 1 - this.field1412;
                            this.field1406 = -this.field1406;
                            if (--this.field1405 == 0) {
                                break;
                            }
                            var9 = this.method2149(arg0, var9, var5, var10, var4.field1334[this.field1413]);
                            if (this.field1412 >= var5) {
                                return;
                            }
                            this.field1412 = var5 + var5 - 1 - this.field1412;
                            this.field1406 = -this.field1406;
                        } while (--this.field1405 != 0);
                    }
                } else if (this.field1406 < 0) {
                    while (true) {
                        var9 = this.method2149(arg0, var9, var5, var10, var4.field1334[this.field1414 - 1]);
                        if (this.field1412 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1412) / var8;
                        if (var12 >= this.field1405) {
                            this.field1412 += this.field1405 * var8;
                            this.field1405 = 0;
                            break;
                        }
                        this.field1412 += var8 * var12;
                        this.field1405 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2148(arg0, var9, var6, var10, var4.field1334[this.field1413]);
                        if (this.field1412 < var6) {
                            return;
                        }
                        int var13 = (this.field1412 - var5) / var8;
                        if (var13 >= this.field1405) {
                            this.field1412 -= this.field1405 * var8;
                            this.field1405 = 0;
                            break;
                        }
                        this.field1412 -= var8 * var13;
                        this.field1405 -= var13;
                    }
                }
            }
            if (this.field1406 < 0) {
                this.method2149(arg0, var9, 0, var10, 0);
                if (this.field1412 < 0) {
                    this.field1412 = -1;
                    this.method2181();
                    this.method3766();
                }
            } else {
                this.method2148(arg0, var9, var7, var10, 0);
                if (this.field1412 >= var7) {
                    this.field1412 = var7;
                    this.method2181();
                    this.method3766();
                }
            }
        } else if (this.field1416) {
            if (this.field1406 < 0) {
                var9 = this.method2149(arg0, arg1, var5, var10, var4.field1334[this.field1413]);
                if (this.field1412 >= var5) {
                    return;
                }
                this.field1412 = var5 + var5 - 1 - this.field1412;
                this.field1406 = -this.field1406;
            }
            while (true) {
                int var11 = this.method2148(arg0, var9, var6, var10, var4.field1334[this.field1414 - 1]);
                if (this.field1412 < var6) {
                    return;
                }
                this.field1412 = var6 + var6 - 1 - this.field1412;
                this.field1406 = -this.field1406;
                var9 = this.method2149(arg0, var11, var5, var10, var4.field1334[this.field1413]);
                if (this.field1412 >= var5) {
                    return;
                }
                this.field1412 = var5 + var5 - 1 - this.field1412;
                this.field1406 = -this.field1406;
            }
        } else if (this.field1406 < 0) {
            while (true) {
                var9 = this.method2149(arg0, var9, var5, var10, var4.field1334[this.field1414 - 1]);
                if (this.field1412 >= var5) {
                    return;
                }
                this.field1412 = var6 - 1 - (var6 - 1 - this.field1412) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2148(arg0, var9, var6, var10, var4.field1334[this.field1413]);
                if (this.field1412 < var6) {
                    return;
                }
                this.field1412 = (this.field1412 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dx.o(I)V")
    public synchronized void method1958(int arg0) {
        if (this.field1415 > 0) {
            if (arg0 >= this.field1415) {
                if (this.field1407 == Integer.MIN_VALUE) {
                    this.field1407 = 0;
                    this.field1411 = 0;
                    this.field1410 = 0;
                    this.field1409 = 0;
                    this.method3766();
                    arg0 = this.field1415;
                }
                this.field1415 = 0;
                this.method2128();
            } else {
                this.field1409 += this.field1417 * arg0;
                this.field1410 += this.field1418 * arg0;
                this.field1411 += this.field1419 * arg0;
                this.field1415 -= arg0;
            }
        }
        class96 var2 = (class96) this.field1432;
        int var3 = this.field1413 << 8;
        int var4 = this.field1414 << 8;
        int var5 = var2.field1334.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1405 = 0;
        }
        if (this.field1412 < 0) {
            if (this.field1406 <= 0) {
                this.method2181();
                this.method3766();
                return;
            }
            this.field1412 = 0;
        }
        if (this.field1412 >= var5) {
            if (this.field1406 >= 0) {
                this.method2181();
                this.method3766();
                return;
            }
            this.field1412 = var5 - 1;
        }
        this.field1412 += this.field1406 * arg0;
        if (this.field1405 >= 0) {
            if (this.field1405 > 0) {
                if (this.field1416) {
                    label121: {
                        if (this.field1406 < 0) {
                            if (this.field1412 >= var3) {
                                return;
                            }
                            this.field1412 = var3 + var3 - 1 - this.field1412;
                            this.field1406 = -this.field1406;
                            if (--this.field1405 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1412 < var4) {
                                return;
                            }
                            this.field1412 = var4 + var4 - 1 - this.field1412;
                            this.field1406 = -this.field1406;
                            if (--this.field1405 == 0) {
                                break;
                            }
                            if (this.field1412 >= var3) {
                                return;
                            }
                            this.field1412 = var3 + var3 - 1 - this.field1412;
                            this.field1406 = -this.field1406;
                        } while (--this.field1405 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1406 < 0) {
                            if (this.field1412 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1412) / var6;
                            if (var7 >= this.field1405) {
                                this.field1412 += this.field1405 * var6;
                                this.field1405 = 0;
                                break label153;
                            }
                            this.field1412 += var6 * var7;
                            this.field1405 -= var7;
                        } else if (this.field1412 >= var4) {
                            int var8 = (this.field1412 - var3) / var6;
                            if (var8 >= this.field1405) {
                                this.field1412 -= this.field1405 * var6;
                                this.field1405 = 0;
                                break label153;
                            }
                            this.field1412 -= var6 * var8;
                            this.field1405 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1406 < 0) {
                if (this.field1412 < 0) {
                    this.field1412 = -1;
                    this.method2181();
                    this.method3766();
                }
            } else if (this.field1412 >= var5) {
                this.field1412 = var5;
                this.method2181();
                this.method3766();
            }
        } else if (this.field1416) {
            if (this.field1406 < 0) {
                if (this.field1412 >= var3) {
                    return;
                }
                this.field1412 = var3 + var3 - 1 - this.field1412;
                this.field1406 = -this.field1406;
            }
            while (this.field1412 >= var4) {
                this.field1412 = var4 + var4 - 1 - this.field1412;
                this.field1406 = -this.field1406;
                if (this.field1412 >= var3) {
                    return;
                }
                this.field1412 = var3 + var3 - 1 - this.field1412;
                this.field1406 = -this.field1406;
            }
        } else if (this.field1406 < 0) {
            if (this.field1412 >= var3) {
                return;
            }
            this.field1412 = var4 - 1 - (var4 - 1 - this.field1412) % var6;
        } else if (this.field1412 >= var4) {
            this.field1412 = (this.field1412 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dx.ay([IIIII)I")
    public int method2148(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1415 > 0) {
                int var6 = this.field1415 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1415 += arg1;
                if (this.field1406 == 256 && (this.field1412 & 0xFF) == 0) {
                    if (Statics.field1359) {
                        arg1 = method2250(0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, this.field1418, this.field1419, 0, var6, arg2, this);
                    } else {
                        arg1 = method2159(((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, this.field1417, 0, var6, arg2, this);
                    }
                } else if (Statics.field1359) {
                    arg1 = method2164(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, this.field1418, this.field1419, 0, var6, arg2, this, this.field1406, arg4);
                } else {
                    arg1 = method2219(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, this.field1417, 0, var6, arg2, this, this.field1406, arg4);
                }
                this.field1415 -= arg1;
                if (this.field1415 != 0) {
                    return arg1;
                }
                if (!this.method2150()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1406 == 256 && (this.field1412 & 0xFF) == 0) {
                if (Statics.field1359) {
                    return method2160(0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, 0, arg3, arg2, this);
                }
                return method2151(((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, 0, arg3, arg2, this);
            }
            if (Statics.field1359) {
                return method2156(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, 0, arg3, arg2, this, this.field1406, arg4);
            }
            return method2155(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, 0, arg3, arg2, this, this.field1406, arg4);
        }
    }

    @ObfuscatedName("dx.ao([IIIII)I")
    public int method2149(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1415 > 0) {
                int var6 = this.field1415 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1415 += arg1;
                if (this.field1406 == -256 && (this.field1412 & 0xFF) == 0) {
                    if (Statics.field1359) {
                        arg1 = method2162(0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, this.field1418, this.field1419, 0, var6, arg2, this);
                    } else {
                        arg1 = method2237(((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, this.field1417, 0, var6, arg2, this);
                    }
                } else if (Statics.field1359) {
                    arg1 = method2171(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, this.field1418, this.field1419, 0, var6, arg2, this, this.field1406, arg4);
                } else {
                    arg1 = method2131(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, this.field1417, 0, var6, arg2, this, this.field1406, arg4);
                }
                this.field1415 -= arg1;
                if (this.field1415 != 0) {
                    return arg1;
                }
                if (!this.method2150()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1406 == -256 && (this.field1412 & 0xFF) == 0) {
                if (Statics.field1359) {
                    return method2154(0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, 0, arg3, arg2, this);
                }
                return method2153(((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, 0, arg3, arg2, this);
            }
            if (Statics.field1359) {
                return method2158(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1410, this.field1411, 0, arg3, arg2, this, this.field1406, arg4);
            }
            return method2157(0, 0, ((class96) this.field1432).field1334, arg0, this.field1412, arg1, this.field1409, 0, arg3, arg2, this, this.field1406, arg4);
        }
    }

    @ObfuscatedName("dx.ak()Z")
    public boolean method2150() {
        int var1 = this.field1407;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2139(var1, this.field1408);
            var2 = method2198(var1, this.field1408);
        }
        if (this.field1409 != var1 || this.field1410 != var3 || this.field1411 != var2) {
            if (this.field1409 < var1) {
                this.field1417 = 1;
                this.field1415 = var1 - this.field1409;
            } else if (this.field1409 > var1) {
                this.field1417 = -1;
                this.field1415 = this.field1409 - var1;
            } else {
                this.field1417 = 0;
            }
            if (this.field1410 < var3) {
                this.field1418 = 1;
                if (this.field1415 == 0 || this.field1415 > var3 - this.field1410) {
                    this.field1415 = var3 - this.field1410;
                }
            } else if (this.field1410 > var3) {
                this.field1418 = -1;
                if (this.field1415 == 0 || this.field1415 > this.field1410 - var3) {
                    this.field1415 = this.field1410 - var3;
                }
            } else {
                this.field1418 = 0;
            }
            if (this.field1411 < var2) {
                this.field1419 = 1;
                if (this.field1415 == 0 || this.field1415 > var2 - this.field1411) {
                    this.field1415 = var2 - this.field1411;
                }
            } else if (this.field1411 > var2) {
                this.field1419 = -1;
                if (this.field1415 == 0 || this.field1415 > this.field1411 - var2) {
                    this.field1415 = this.field1411 - var2;
                }
            } else {
                this.field1419 = 0;
            }
            return false;
        } else if (this.field1407 == Integer.MIN_VALUE) {
            this.field1407 = 0;
            this.field1411 = 0;
            this.field1410 = 0;
            this.field1409 = 0;
            this.method3766();
            return true;
        } else {
            this.method2128();
            return false;
        }
    }

    @ObfuscatedName("dx.af([B[IIIIIIILdx;)I")
    public static int method2151(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1412 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.ax(I[B[IIIIIIIILdx;)I")
    public static int method2160(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1412 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dx.ar([B[IIIIIIILdx;)I")
    public static int method2153(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1412 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.at(I[B[IIIIIIIILdx;)I")
    public static int method2154(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1412 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dx.aj(II[B[IIIIIIILdx;II)I")
    public static int method2155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1412 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.as(II[B[IIIIIIIILdx;II)I")
    public static int method2156(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1412 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dx.br(II[B[IIIIIIILdx;II)I")
    public static int method2157(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1412 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bd(II[B[IIIIIIIILdx;II)I")
    public static int method2158(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1412 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dx.bp([B[IIIIIIIILdx;)I")
    public static int method2159(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1410 += (var14 - arg3) * arg9.field1418;
        arg9.field1411 += (var14 - arg3) * arg9.field1419;
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
        arg9.field1409 = var12 >> 2;
        arg9.field1412 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bk(I[B[IIIIIIIIIILdx;)I")
    public static int method2250(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1409 += (var19 - arg4) * arg12.field1417;
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
        arg12.field1412 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dx.bm([B[IIIIIIIILdx;)I")
    public static int method2237(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1410 += (var14 - arg3) * arg9.field1418;
        arg9.field1411 += (var14 - arg3) * arg9.field1419;
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
        arg9.field1409 = var12 >> 2;
        arg9.field1412 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dx.bc(I[B[IIIIIIIIIILdx;)I")
    public static int method2162(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1409 += (var19 - arg4) * arg12.field1417;
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
        arg12.field1412 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dx.bi(II[B[IIIIIIIILdx;II)I")
    public static int method2219(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1410 -= arg11.field1418 * arg5;
        arg11.field1411 -= arg11.field1419 * arg5;
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
        arg11.field1410 += arg11.field1418 * arg5;
        arg11.field1411 += arg11.field1419 * arg5;
        arg11.field1409 = arg6;
        arg11.field1412 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bo(II[B[IIIIIIIIIILdx;II)I")
    public static int method2164(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1409 -= arg13.field1417 * arg5;
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
        arg13.field1409 += arg13.field1417 * var27;
        arg13.field1410 = arg6;
        arg13.field1411 = arg7;
        arg13.field1412 = arg4;
        return var27;
    }

    @ObfuscatedName("dx.bh(II[B[IIIIIIIILdx;II)I")
    public static int method2131(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1410 -= arg11.field1418 * arg5;
        arg11.field1411 -= arg11.field1419 * arg5;
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
        arg11.field1410 += arg11.field1418 * arg5;
        arg11.field1411 += arg11.field1419 * arg5;
        arg11.field1409 = arg6;
        arg11.field1412 = arg4;
        return arg5;
    }

    @ObfuscatedName("dx.bg(II[B[IIIIIIIIIILdx;II)I")
    public static int method2171(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1409 -= arg13.field1417 * arg5;
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
        arg13.field1409 += arg13.field1417 * var26;
        arg13.field1410 = arg6;
        arg13.field1411 = arg7;
        arg13.field1412 = arg4;
        return var26;
    }
}
