package deob;

@ObfuscatedName("cm")
public class class104 extends class106 {

    @ObfuscatedName("cm.z")
    public int field1358;

    @ObfuscatedName("cm.s")
    public int field1365;

    @ObfuscatedName("cm.l")
    public int field1357;

    @ObfuscatedName("cm.u")
    public int field1367;

    @ObfuscatedName("cm.q")
    public int field1360;

    @ObfuscatedName("cm.k")
    public int field1361;

    @ObfuscatedName("cm.i")
    public int field1362;

    @ObfuscatedName("cm.x")
    public int field1363;

    @ObfuscatedName("cm.e")
    public int field1364;

    @ObfuscatedName("cm.p")
    public int field1368;

    @ObfuscatedName("cm.b")
    public boolean field1366;

    @ObfuscatedName("cm.n")
    public int field1356;

    @ObfuscatedName("cm.f")
    public int field1359;

    @ObfuscatedName("cm.g")
    public int field1369;

    @ObfuscatedName("cm.m")
    public int field1370;

    @ObfuscatedName("cm.z(II)I")
    public static int method2169(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("cm.w(II)I")
    public static int method2094(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("cm.ax()I")
    public int method2106() {
        int var1 = this.field1360 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1363 == 0) {
            var2 -= this.field1358 * var2 / (((class94) this.field1384).field1279.length << 8);
        } else if (this.field1363 >= 0) {
            var2 -= this.field1364 * var2 / ((class94) this.field1384).field1279.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class104(class94 arg0, int arg1, int arg2) {
        this.field1384 = arg0;
        this.field1364 = arg0.field1278;
        this.field1368 = arg0.field1281;
        this.field1366 = arg0.field1282;
        this.field1365 = arg1;
        this.field1357 = arg2;
        this.field1367 = 8192;
        this.field1358 = 0;
        this.method2153();
    }

    public class104(class94 arg0, int arg1, int arg2, int arg3) {
        this.field1384 = arg0;
        this.field1364 = arg0.field1278;
        this.field1368 = arg0.field1281;
        this.field1366 = arg0.field1282;
        this.field1365 = arg1;
        this.field1357 = arg2;
        this.field1367 = arg3;
        this.field1358 = 0;
        this.method2153();
    }

    @ObfuscatedName("cm.s(Lct;II)Lcm;")
    public static class104 method2125(class94 arg0, int arg1, int arg2) {
        return arg0.field1279 == null || arg0.field1279.length == 0 ? null : new class104(arg0, (int) ((long) arg0.field1280 * 256L * (long) arg1 / (long) (Statics.field1301 * 100)), arg2 << 6);
    }

    @ObfuscatedName("cm.l(Lct;III)Lcm;")
    public static class104 method2097(class94 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1279 == null || arg0.field1279.length == 0 ? null : new class104(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cm.u()V")
    public void method2153() {
        this.field1360 = this.field1357;
        this.field1361 = method2169(this.field1357, this.field1367);
        this.field1362 = method2094(this.field1357, this.field1367);
    }

    @ObfuscatedName("cm.p(I)V")
    public synchronized void method2099(int arg0) {
        this.field1363 = arg0;
    }

    @ObfuscatedName("cm.n(I)V")
    public synchronized void method2108(int arg0) {
        this.method2102(arg0 << 6, this.method2104());
    }

    @ObfuscatedName("cm.f(I)V")
    public synchronized void method2101(int arg0) {
        this.method2102(arg0, this.method2104());
    }

    @ObfuscatedName("cm.g(II)V")
    public synchronized void method2102(int arg0, int arg1) {
        this.field1357 = arg0;
        this.field1367 = arg1;
        this.field1356 = 0;
        this.method2153();
    }

    @ObfuscatedName("cm.m()I")
    public synchronized int method2103() {
        return this.field1357 == Integer.MIN_VALUE ? 0 : this.field1357;
    }

    @ObfuscatedName("cm.r()I")
    public synchronized int method2104() {
        return this.field1367 < 0 ? -1 : this.field1367;
    }

    @ObfuscatedName("cm.t(I)V")
    public synchronized void method2105(int arg0) {
        int var2 = ((class94) this.field1384).field1279.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1358 = arg0;
    }

    @ObfuscatedName("cm.o(Z)V")
    public synchronized void method2138(boolean arg0) {
        this.field1365 = (this.field1365 >>> 31) + (this.field1365 ^ this.field1365 >> 31);
        if (arg0) {
            this.field1365 = -this.field1365;
        }
    }

    @ObfuscatedName("cm.y()V")
    public void method2107() {
        if (this.field1356 == 0) {
            return;
        }
        if (this.field1357 == Integer.MIN_VALUE) {
            this.field1357 = 0;
        }
        this.field1356 = 0;
        this.method2153();
    }

    @ObfuscatedName("cm.a(II)V")
    public synchronized void method2232(int arg0, int arg1) {
        this.method2109(arg0, arg1, this.method2104());
    }

    @ObfuscatedName("cm.c(III)V")
    public synchronized void method2109(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2102(arg1, arg2);
            return;
        }
        int var4 = method2169(arg1, arg2);
        int var5 = method2094(arg1, arg2);
        if (this.field1361 == var4 && this.field1362 == var5) {
            this.field1356 = 0;
            return;
        }
        int var6 = arg1 - this.field1360;
        if (this.field1360 - arg1 > var6) {
            var6 = this.field1360 - arg1;
        }
        if (var4 - this.field1361 > var6) {
            var6 = var4 - this.field1361;
        }
        if (this.field1361 - var4 > var6) {
            var6 = this.field1361 - var4;
        }
        if (var5 - this.field1362 > var6) {
            var6 = var5 - this.field1362;
        }
        if (this.field1362 - var5 > var6) {
            var6 = this.field1362 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1356 = arg0;
        this.field1357 = arg1;
        this.field1367 = arg2;
        this.field1359 = (arg1 - this.field1360) / arg0;
        this.field1369 = (var4 - this.field1361) / arg0;
        this.field1370 = (var5 - this.field1362) / arg0;
    }

    @ObfuscatedName("cm.v(I)V")
    public synchronized void method2110(int arg0) {
        if (arg0 == 0) {
            this.method2101(0);
            this.method3756();
        } else if (this.field1361 == 0 && this.field1362 == 0) {
            this.field1356 = 0;
            this.field1357 = 0;
            this.field1360 = 0;
            this.method3756();
        } else {
            int var2 = -this.field1360;
            if (this.field1360 > var2) {
                var2 = this.field1360;
            }
            if (-this.field1361 > var2) {
                var2 = -this.field1361;
            }
            if (this.field1361 > var2) {
                var2 = this.field1361;
            }
            if (-this.field1362 > var2) {
                var2 = -this.field1362;
            }
            if (this.field1362 > var2) {
                var2 = this.field1362;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1356 = arg0;
            this.field1357 = Integer.MIN_VALUE;
            this.field1359 = -this.field1360 / arg0;
            this.field1369 = -this.field1361 / arg0;
            this.field1370 = -this.field1362 / arg0;
        }
    }

    @ObfuscatedName("cm.ai(I)V")
    public synchronized void method2111(int arg0) {
        if (this.field1365 < 0) {
            this.field1365 = -arg0;
        } else {
            this.field1365 = arg0;
        }
    }

    @ObfuscatedName("cm.ac()I")
    public synchronized int method2177() {
        return this.field1365 < 0 ? -this.field1365 : this.field1365;
    }

    @ObfuscatedName("cm.ap()Z")
    public boolean method2113() {
        return this.field1358 < 0 || this.field1358 >= ((class94) this.field1384).field1279.length << 8;
    }

    @ObfuscatedName("cm.aa()Z")
    public boolean method2114() {
        return this.field1356 != 0;
    }

    @ObfuscatedName("cm.q()Ldo;")
    public class106 method1880() {
        return null;
    }

    @ObfuscatedName("cm.i()Ldo;")
    public class106 method1881() {
        return null;
    }

    @ObfuscatedName("cm.x()I")
    public int method1903() {
        return this.field1357 == 0 && this.field1356 == 0 ? 0 : 1;
    }

    @ObfuscatedName("cm.e([III)V")
    public synchronized void method1883(int[] arg0, int arg1, int arg2) {
        if (this.field1357 == 0 && this.field1356 == 0) {
            this.method1885(arg2);
            return;
        }
        class94 var4 = (class94) this.field1384;
        int var5 = this.field1364 << 8;
        int var6 = this.field1368 << 8;
        int var7 = var4.field1279.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1363 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1358 < 0) {
            if (this.field1365 <= 0) {
                this.method2107();
                this.method3756();
                return;
            }
            this.field1358 = 0;
        }
        if (this.field1358 >= var7) {
            if (this.field1365 >= 0) {
                this.method2107();
                this.method3756();
                return;
            }
            this.field1358 = var7 - 1;
        }
        if (this.field1363 >= 0) {
            if (this.field1363 > 0) {
                if (this.field1366) {
                    label131: {
                        if (this.field1365 < 0) {
                            var9 = this.method2119(arg0, arg1, var5, var10, var4.field1279[this.field1364]);
                            if (this.field1358 >= var5) {
                                return;
                            }
                            this.field1358 = var5 + var5 - 1 - this.field1358;
                            this.field1365 = -this.field1365;
                            if (--this.field1363 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2226(arg0, var9, var6, var10, var4.field1279[this.field1368 - 1]);
                            if (this.field1358 < var6) {
                                return;
                            }
                            this.field1358 = var6 + var6 - 1 - this.field1358;
                            this.field1365 = -this.field1365;
                            if (--this.field1363 == 0) {
                                break;
                            }
                            var9 = this.method2119(arg0, var9, var5, var10, var4.field1279[this.field1364]);
                            if (this.field1358 >= var5) {
                                return;
                            }
                            this.field1358 = var5 + var5 - 1 - this.field1358;
                            this.field1365 = -this.field1365;
                        } while (--this.field1363 != 0);
                    }
                } else if (this.field1365 < 0) {
                    while (true) {
                        var9 = this.method2119(arg0, var9, var5, var10, var4.field1279[this.field1368 - 1]);
                        if (this.field1358 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1358) / var8;
                        if (var12 >= this.field1363) {
                            this.field1358 += this.field1363 * var8;
                            this.field1363 = 0;
                            break;
                        }
                        this.field1358 += var8 * var12;
                        this.field1363 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2226(arg0, var9, var6, var10, var4.field1279[this.field1364]);
                        if (this.field1358 < var6) {
                            return;
                        }
                        int var13 = (this.field1358 - var5) / var8;
                        if (var13 >= this.field1363) {
                            this.field1358 -= this.field1363 * var8;
                            this.field1363 = 0;
                            break;
                        }
                        this.field1358 -= var8 * var13;
                        this.field1363 -= var13;
                    }
                }
            }
            if (this.field1365 < 0) {
                this.method2119(arg0, var9, 0, var10, 0);
                if (this.field1358 < 0) {
                    this.field1358 = -1;
                    this.method2107();
                    this.method3756();
                }
            } else {
                this.method2226(arg0, var9, var7, var10, 0);
                if (this.field1358 >= var7) {
                    this.field1358 = var7;
                    this.method2107();
                    this.method3756();
                }
            }
        } else if (this.field1366) {
            if (this.field1365 < 0) {
                var9 = this.method2119(arg0, arg1, var5, var10, var4.field1279[this.field1364]);
                if (this.field1358 >= var5) {
                    return;
                }
                this.field1358 = var5 + var5 - 1 - this.field1358;
                this.field1365 = -this.field1365;
            }
            while (true) {
                int var11 = this.method2226(arg0, var9, var6, var10, var4.field1279[this.field1368 - 1]);
                if (this.field1358 < var6) {
                    return;
                }
                this.field1358 = var6 + var6 - 1 - this.field1358;
                this.field1365 = -this.field1365;
                var9 = this.method2119(arg0, var11, var5, var10, var4.field1279[this.field1364]);
                if (this.field1358 >= var5) {
                    return;
                }
                this.field1358 = var5 + var5 - 1 - this.field1358;
                this.field1365 = -this.field1365;
            }
        } else if (this.field1365 < 0) {
            while (true) {
                var9 = this.method2119(arg0, var9, var5, var10, var4.field1279[this.field1368 - 1]);
                if (this.field1358 >= var5) {
                    return;
                }
                this.field1358 = var6 - 1 - (var6 - 1 - this.field1358) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2226(arg0, var9, var6, var10, var4.field1279[this.field1364]);
                if (this.field1358 < var6) {
                    return;
                }
                this.field1358 = (this.field1358 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("cm.b(I)V")
    public synchronized void method1885(int arg0) {
        if (this.field1356 > 0) {
            if (arg0 >= this.field1356) {
                if (this.field1357 == Integer.MIN_VALUE) {
                    this.field1357 = 0;
                    this.field1362 = 0;
                    this.field1361 = 0;
                    this.field1360 = 0;
                    this.method3756();
                    arg0 = this.field1356;
                }
                this.field1356 = 0;
                this.method2153();
            } else {
                this.field1360 += this.field1359 * arg0;
                this.field1361 += this.field1369 * arg0;
                this.field1362 += this.field1370 * arg0;
                this.field1356 -= arg0;
            }
        }
        class94 var2 = (class94) this.field1384;
        int var3 = this.field1364 << 8;
        int var4 = this.field1368 << 8;
        int var5 = var2.field1279.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1363 = 0;
        }
        if (this.field1358 < 0) {
            if (this.field1365 <= 0) {
                this.method2107();
                this.method3756();
                return;
            }
            this.field1358 = 0;
        }
        if (this.field1358 >= var5) {
            if (this.field1365 >= 0) {
                this.method2107();
                this.method3756();
                return;
            }
            this.field1358 = var5 - 1;
        }
        this.field1358 += this.field1365 * arg0;
        if (this.field1363 >= 0) {
            if (this.field1363 > 0) {
                if (this.field1366) {
                    label121: {
                        if (this.field1365 < 0) {
                            if (this.field1358 >= var3) {
                                return;
                            }
                            this.field1358 = var3 + var3 - 1 - this.field1358;
                            this.field1365 = -this.field1365;
                            if (--this.field1363 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1358 < var4) {
                                return;
                            }
                            this.field1358 = var4 + var4 - 1 - this.field1358;
                            this.field1365 = -this.field1365;
                            if (--this.field1363 == 0) {
                                break;
                            }
                            if (this.field1358 >= var3) {
                                return;
                            }
                            this.field1358 = var3 + var3 - 1 - this.field1358;
                            this.field1365 = -this.field1365;
                        } while (--this.field1363 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1365 < 0) {
                            if (this.field1358 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1358) / var6;
                            if (var7 >= this.field1363) {
                                this.field1358 += this.field1363 * var6;
                                this.field1363 = 0;
                                break label153;
                            }
                            this.field1358 += var6 * var7;
                            this.field1363 -= var7;
                        } else if (this.field1358 >= var4) {
                            int var8 = (this.field1358 - var3) / var6;
                            if (var8 >= this.field1363) {
                                this.field1358 -= this.field1363 * var6;
                                this.field1363 = 0;
                                break label153;
                            }
                            this.field1358 -= var6 * var8;
                            this.field1363 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1365 < 0) {
                if (this.field1358 < 0) {
                    this.field1358 = -1;
                    this.method2107();
                    this.method3756();
                }
            } else if (this.field1358 >= var5) {
                this.field1358 = var5;
                this.method2107();
                this.method3756();
            }
        } else if (this.field1366) {
            if (this.field1365 < 0) {
                if (this.field1358 >= var3) {
                    return;
                }
                this.field1358 = var3 + var3 - 1 - this.field1358;
                this.field1365 = -this.field1365;
            }
            while (this.field1358 >= var4) {
                this.field1358 = var4 + var4 - 1 - this.field1358;
                this.field1365 = -this.field1365;
                if (this.field1358 >= var3) {
                    return;
                }
                this.field1358 = var3 + var3 - 1 - this.field1358;
                this.field1365 = -this.field1365;
            }
        } else if (this.field1365 < 0) {
            if (this.field1358 >= var3) {
                return;
            }
            this.field1358 = var4 - 1 - (var4 - 1 - this.field1358) % var6;
        } else if (this.field1358 >= var4) {
            this.field1358 = (this.field1358 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("cm.al([IIIII)I")
    public int method2226(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1356 > 0) {
                int var6 = this.field1356 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1356 += arg1;
                if (this.field1365 == 256 && (this.field1358 & 0xFF) == 0) {
                    if (Statics.field1296) {
                        arg1 = method2126(0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, this.field1369, this.field1370, 0, var6, arg2, this);
                    } else {
                        arg1 = method2240(((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, this.field1359, 0, var6, arg2, this);
                    }
                } else if (Statics.field1296) {
                    arg1 = method2133(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, this.field1369, this.field1370, 0, var6, arg2, this, this.field1365, arg4);
                } else {
                    arg1 = method2132(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, this.field1359, 0, var6, arg2, this, this.field1365, arg4);
                }
                this.field1356 -= arg1;
                if (this.field1356 != 0) {
                    return arg1;
                }
                if (!this.method2120()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1365 == 256 && (this.field1358 & 0xFF) == 0) {
                if (Statics.field1296) {
                    return method2122(0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, 0, arg3, arg2, this);
                }
                return method2116(((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, 0, arg3, arg2, this);
            }
            if (Statics.field1296) {
                return method2135(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, 0, arg3, arg2, this, this.field1365, arg4);
            }
            return method2124(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, 0, arg3, arg2, this, this.field1365, arg4);
        }
    }

    @ObfuscatedName("cm.ae([IIIII)I")
    public int method2119(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1356 > 0) {
                int var6 = this.field1356 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1356 += arg1;
                if (this.field1365 == -256 && (this.field1358 & 0xFF) == 0) {
                    if (Statics.field1296) {
                        arg1 = method2131(0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, this.field1369, this.field1370, 0, var6, arg2, this);
                    } else {
                        arg1 = method2157(((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, this.field1359, 0, var6, arg2, this);
                    }
                } else if (Statics.field1296) {
                    arg1 = method2186(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, this.field1369, this.field1370, 0, var6, arg2, this, this.field1365, arg4);
                } else {
                    arg1 = method2112(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, this.field1359, 0, var6, arg2, this, this.field1365, arg4);
                }
                this.field1356 -= arg1;
                if (this.field1356 != 0) {
                    return arg1;
                }
                if (!this.method2120()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1365 == -256 && (this.field1358 & 0xFF) == 0) {
                if (Statics.field1296) {
                    return method2115(0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, 0, arg3, arg2, this);
                }
                return method2198(((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, 0, arg3, arg2, this);
            }
            if (Statics.field1296) {
                return method2127(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1361, this.field1362, 0, arg3, arg2, this, this.field1365, arg4);
            }
            return method2188(0, 0, ((class94) this.field1384).field1279, arg0, this.field1358, arg1, this.field1360, 0, arg3, arg2, this, this.field1365, arg4);
        }
    }

    @ObfuscatedName("cm.am()Z")
    public boolean method2120() {
        int var1 = this.field1357;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2169(var1, this.field1367);
            var2 = method2094(var1, this.field1367);
        }
        if (this.field1360 != var1 || this.field1361 != var3 || this.field1362 != var2) {
            if (this.field1360 < var1) {
                this.field1359 = 1;
                this.field1356 = var1 - this.field1360;
            } else if (this.field1360 > var1) {
                this.field1359 = -1;
                this.field1356 = this.field1360 - var1;
            } else {
                this.field1359 = 0;
            }
            if (this.field1361 < var3) {
                this.field1369 = 1;
                if (this.field1356 == 0 || this.field1356 > var3 - this.field1361) {
                    this.field1356 = var3 - this.field1361;
                }
            } else if (this.field1361 > var3) {
                this.field1369 = -1;
                if (this.field1356 == 0 || this.field1356 > this.field1361 - var3) {
                    this.field1356 = this.field1361 - var3;
                }
            } else {
                this.field1369 = 0;
            }
            if (this.field1362 < var2) {
                this.field1370 = 1;
                if (this.field1356 == 0 || this.field1356 > var2 - this.field1362) {
                    this.field1356 = var2 - this.field1362;
                }
            } else if (this.field1362 > var2) {
                this.field1370 = -1;
                if (this.field1356 == 0 || this.field1356 > this.field1362 - var2) {
                    this.field1356 = this.field1362 - var2;
                }
            } else {
                this.field1370 = 0;
            }
            return false;
        } else if (this.field1357 == Integer.MIN_VALUE) {
            this.field1357 = 0;
            this.field1362 = 0;
            this.field1361 = 0;
            this.field1360 = 0;
            this.method3756();
            return true;
        } else {
            this.method2153();
            return false;
        }
    }

    @ObfuscatedName("cm.ay([B[IIIIIIILcm;)I")
    public static int method2116(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
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
        arg8.field1358 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("cm.ag(I[B[IIIIIIIILcm;)I")
    public static int method2122(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
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
        arg10.field1358 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("cm.bk([B[IIIIIIILcm;)I")
    public static int method2198(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
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
        arg8.field1358 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("cm.bp(I[B[IIIIIIIILcm;)I")
    public static int method2115(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
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
        arg10.field1358 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("cm.bi(II[B[IIIIIIILcm;II)I")
    public static int method2124(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
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
        arg10.field1358 = arg4;
        return arg5;
    }

    @ObfuscatedName("cm.bj(II[B[IIIIIIIILcm;II)I")
    public static int method2135(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
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
        arg11.field1358 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("cm.bo(II[B[IIIIIIILcm;II)I")
    public static int method2188(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
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
        arg10.field1358 = arg4;
        return arg5;
    }

    @ObfuscatedName("cm.bq(II[B[IIIIIIIILcm;II)I")
    public static int method2127(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
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
        arg11.field1358 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("cm.bh([B[IIIIIIIILcm;)I")
    public static int method2240(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1361 += (var14 - arg3) * arg9.field1369;
        arg9.field1362 += (var14 - arg3) * arg9.field1370;
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
        arg9.field1360 = var12 >> 2;
        arg9.field1358 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("cm.bz(I[B[IIIIIIIIIILcm;)I")
    public static int method2126(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
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
        arg12.field1360 += (var19 - arg4) * arg12.field1359;
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
        arg12.field1361 = var15 >> 2;
        arg12.field1362 = var16 >> 2;
        arg12.field1358 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("cm.bu([B[IIIIIIIILcm;)I")
    public static int method2157(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1361 += (var14 - arg3) * arg9.field1369;
        arg9.field1362 += (var14 - arg3) * arg9.field1370;
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
        arg9.field1360 = var12 >> 2;
        arg9.field1358 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("cm.bg(I[B[IIIIIIIIIILcm;)I")
    public static int method2131(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
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
        arg12.field1360 += (var19 - arg4) * arg12.field1359;
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
        arg12.field1361 = var15 >> 2;
        arg12.field1362 = var16 >> 2;
        arg12.field1358 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("cm.bl(II[B[IIIIIIIILcm;II)I")
    public static int method2132(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
        arg11.field1361 -= arg11.field1369 * arg5;
        arg11.field1362 -= arg11.field1370 * arg5;
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
        arg11.field1361 += arg11.field1369 * arg5;
        arg11.field1362 += arg11.field1370 * arg5;
        arg11.field1360 = arg6;
        arg11.field1358 = arg4;
        return arg5;
    }

    @ObfuscatedName("cm.ba(II[B[IIIIIIIIIILcm;II)I")
    public static int method2133(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
        arg13.field1360 -= arg13.field1359 * arg5;
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
        arg13.field1360 += arg13.field1359 * var27;
        arg13.field1361 = arg6;
        arg13.field1362 = arg7;
        arg13.field1358 = arg4;
        return var27;
    }

    @ObfuscatedName("cm.bn(II[B[IIIIIIIILcm;II)I")
    public static int method2112(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
        arg11.field1361 -= arg11.field1369 * arg5;
        arg11.field1362 -= arg11.field1370 * arg5;
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
        arg11.field1361 += arg11.field1369 * arg5;
        arg11.field1362 += arg11.field1370 * arg5;
        arg11.field1360 = arg6;
        arg11.field1358 = arg4;
        return arg5;
    }

    @ObfuscatedName("cm.bb(II[B[IIIIIIIIIILcm;II)I")
    public static int method2186(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
        arg13.field1360 -= arg13.field1359 * arg5;
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
        arg13.field1360 += arg13.field1359 * var26;
        arg13.field1361 = arg6;
        arg13.field1362 = arg7;
        arg13.field1358 = arg4;
        return var26;
    }
}
