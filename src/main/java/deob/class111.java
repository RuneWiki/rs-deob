package deob;

@ObfuscatedName("dt")
public class class111 extends class113 {

    @ObfuscatedName("dt.a")
    public int field1445;

    @ObfuscatedName("dt.s")
    public int field1444;

    @ObfuscatedName("dt.g")
    public int field1443;

    @ObfuscatedName("dt.x")
    public int field1457;

    @ObfuscatedName("dt.h")
    public int field1447;

    @ObfuscatedName("dt.f")
    public int field1448;

    @ObfuscatedName("dt.p")
    public int field1449;

    @ObfuscatedName("dt.m")
    public int field1450;

    @ObfuscatedName("dt.q")
    public int field1451;

    @ObfuscatedName("dt.b")
    public int field1452;

    @ObfuscatedName("dt.n")
    public boolean field1453;

    @ObfuscatedName("dt.e")
    public int field1454;

    @ObfuscatedName("dt.r")
    public int field1455;

    @ObfuscatedName("dt.t")
    public int field1456;

    @ObfuscatedName("dt.l")
    public int field1446;

    @ObfuscatedName("dt.a(II)I")
    public static int method2360(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dt.s(II)I")
    public static int method2340(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dt.ap()I")
    public int method2419() {
        int var1 = this.field1447 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1450 == 0) {
            var2 -= this.field1445 * var2 / (((class101) this.field1472).field1371.length << 8);
        } else if (this.field1450 >= 0) {
            var2 -= this.field1451 * var2 / ((class101) this.field1472).field1371.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class111(class101 arg0, int arg1, int arg2) {
        this.field1472 = arg0;
        this.field1451 = arg0.field1370;
        this.field1452 = arg0.field1372;
        this.field1453 = arg0.field1374;
        this.field1444 = arg1;
        this.field1443 = arg2;
        this.field1457 = 8192;
        this.field1445 = 0;
        this.method2343();
    }

    public class111(class101 arg0, int arg1, int arg2, int arg3) {
        this.field1472 = arg0;
        this.field1451 = arg0.field1370;
        this.field1452 = arg0.field1372;
        this.field1453 = arg0.field1374;
        this.field1444 = arg1;
        this.field1443 = arg2;
        this.field1457 = arg3;
        this.field1445 = 0;
        this.method2343();
    }

    @ObfuscatedName("dt.g(Lce;II)Ldt;")
    public static class111 method2341(class101 arg0, int arg1, int arg2) {
        return arg0.field1371 == null || arg0.field1371.length == 0 ? null : new class111(arg0, (int) ((long) arg0.field1373 * 256L * (long) arg1 / (long) (Statics.field367 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dt.x(Lce;III)Ldt;")
    public static class111 method2365(class101 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1371 == null || arg0.field1371.length == 0 ? null : new class111(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dt.h()V")
    public void method2343() {
        this.field1447 = this.field1443;
        this.field1448 = method2360(this.field1443, this.field1457);
        this.field1449 = method2340(this.field1443, this.field1457);
    }

    @ObfuscatedName("dt.b(I)V")
    public synchronized void method2344(int arg0) {
        this.field1450 = arg0;
    }

    @ObfuscatedName("dt.e(I)V")
    public synchronized void method2350(int arg0) {
        this.method2347(arg0 << 6, this.method2415());
    }

    @ObfuscatedName("dt.r(I)V")
    public synchronized void method2346(int arg0) {
        this.method2347(arg0, this.method2415());
    }

    @ObfuscatedName("dt.t(II)V")
    public synchronized void method2347(int arg0, int arg1) {
        this.field1443 = arg0;
        this.field1457 = arg1;
        this.field1454 = 0;
        this.method2343();
    }

    @ObfuscatedName("dt.l()I")
    public synchronized int method2348() {
        return this.field1443 == Integer.MIN_VALUE ? 0 : this.field1443;
    }

    @ObfuscatedName("dt.o()I")
    public synchronized int method2415() {
        return this.field1457 < 0 ? -1 : this.field1457;
    }

    @ObfuscatedName("dt.u(I)V")
    public synchronized void method2446(int arg0) {
        int var2 = ((class101) this.field1472).field1371.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1445 = arg0;
    }

    @ObfuscatedName("dt.y(Z)V")
    public synchronized void method2351(boolean arg0) {
        this.field1444 = (this.field1444 >>> 31) + (this.field1444 ^ this.field1444 >> 31);
        if (arg0) {
            this.field1444 = -this.field1444;
        }
    }

    @ObfuscatedName("dt.k()V")
    public void method2382() {
        if (this.field1454 == 0) {
            return;
        }
        if (this.field1443 == Integer.MIN_VALUE) {
            this.field1443 = 0;
        }
        this.field1454 = 0;
        this.method2343();
    }

    @ObfuscatedName("dt.v(II)V")
    public synchronized void method2353(int arg0, int arg1) {
        this.method2354(arg0, arg1, this.method2415());
    }

    @ObfuscatedName("dt.c(III)V")
    public synchronized void method2354(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2347(arg1, arg2);
            return;
        }
        int var4 = method2360(arg1, arg2);
        int var5 = method2340(arg1, arg2);
        if (this.field1448 == var4 && this.field1449 == var5) {
            this.field1454 = 0;
            return;
        }
        int var6 = arg1 - this.field1447;
        if (this.field1447 - arg1 > var6) {
            var6 = this.field1447 - arg1;
        }
        if (var4 - this.field1448 > var6) {
            var6 = var4 - this.field1448;
        }
        if (this.field1448 - var4 > var6) {
            var6 = this.field1448 - var4;
        }
        if (var5 - this.field1449 > var6) {
            var6 = var5 - this.field1449;
        }
        if (this.field1449 - var5 > var6) {
            var6 = this.field1449 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1454 = arg0;
        this.field1443 = arg1;
        this.field1457 = arg2;
        this.field1455 = (arg1 - this.field1447) / arg0;
        this.field1456 = (var4 - this.field1448) / arg0;
        this.field1446 = (var5 - this.field1449) / arg0;
    }

    @ObfuscatedName("dt.aa(I)V")
    public synchronized void method2355(int arg0) {
        if (arg0 == 0) {
            this.method2346(0);
            this.method3960();
        } else if (this.field1448 == 0 && this.field1449 == 0) {
            this.field1454 = 0;
            this.field1443 = 0;
            this.field1447 = 0;
            this.method3960();
        } else {
            int var2 = -this.field1447;
            if (this.field1447 > var2) {
                var2 = this.field1447;
            }
            if (-this.field1448 > var2) {
                var2 = -this.field1448;
            }
            if (this.field1448 > var2) {
                var2 = this.field1448;
            }
            if (-this.field1449 > var2) {
                var2 = -this.field1449;
            }
            if (this.field1449 > var2) {
                var2 = this.field1449;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1454 = arg0;
            this.field1443 = Integer.MIN_VALUE;
            this.field1455 = -this.field1447 / arg0;
            this.field1456 = -this.field1448 / arg0;
            this.field1446 = -this.field1449 / arg0;
        }
    }

    @ObfuscatedName("dt.ab(I)V")
    public synchronized void method2356(int arg0) {
        if (this.field1444 < 0) {
            this.field1444 = -arg0;
        } else {
            this.field1444 = arg0;
        }
    }

    @ObfuscatedName("dt.ah()I")
    public synchronized int method2357() {
        return this.field1444 < 0 ? -this.field1444 : this.field1444;
    }

    @ObfuscatedName("dt.aw()Z")
    public boolean method2358() {
        return this.field1445 < 0 || this.field1445 >= ((class101) this.field1472).field1371.length << 8;
    }

    @ObfuscatedName("dt.an()Z")
    public boolean method2359() {
        return this.field1454 != 0;
    }

    @ObfuscatedName("dt.f()Ldo;")
    public class113 method2139() {
        return null;
    }

    @ObfuscatedName("dt.p()Ldo;")
    public class113 method2125() {
        return null;
    }

    @ObfuscatedName("dt.m()I")
    public int method2156() {
        return this.field1443 == 0 && this.field1454 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dt.q([III)V")
    public synchronized void method2127(int[] arg0, int arg1, int arg2) {
        if (this.field1443 == 0 && this.field1454 == 0) {
            this.method2129(arg2);
            return;
        }
        class101 var4 = (class101) this.field1472;
        int var5 = this.field1451 << 8;
        int var6 = this.field1452 << 8;
        int var7 = var4.field1371.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1450 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1445 < 0) {
            if (this.field1444 <= 0) {
                this.method2382();
                this.method3960();
                return;
            }
            this.field1445 = 0;
        }
        if (this.field1445 >= var7) {
            if (this.field1444 >= 0) {
                this.method2382();
                this.method3960();
                return;
            }
            this.field1445 = var7 - 1;
        }
        if (this.field1450 >= 0) {
            if (this.field1450 > 0) {
                if (this.field1453) {
                    label131: {
                        if (this.field1444 < 0) {
                            var9 = this.method2390(arg0, arg1, var5, var10, var4.field1371[this.field1451]);
                            if (this.field1445 >= var5) {
                                return;
                            }
                            this.field1445 = var5 + var5 - 1 - this.field1445;
                            this.field1444 = -this.field1444;
                            if (--this.field1450 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2443(arg0, var9, var6, var10, var4.field1371[this.field1452 - 1]);
                            if (this.field1445 < var6) {
                                return;
                            }
                            this.field1445 = var6 + var6 - 1 - this.field1445;
                            this.field1444 = -this.field1444;
                            if (--this.field1450 == 0) {
                                break;
                            }
                            var9 = this.method2390(arg0, var9, var5, var10, var4.field1371[this.field1451]);
                            if (this.field1445 >= var5) {
                                return;
                            }
                            this.field1445 = var5 + var5 - 1 - this.field1445;
                            this.field1444 = -this.field1444;
                        } while (--this.field1450 != 0);
                    }
                } else if (this.field1444 < 0) {
                    while (true) {
                        var9 = this.method2390(arg0, var9, var5, var10, var4.field1371[this.field1452 - 1]);
                        if (this.field1445 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1445) / var8;
                        if (var12 >= this.field1450) {
                            this.field1445 += this.field1450 * var8;
                            this.field1450 = 0;
                            break;
                        }
                        this.field1445 += var8 * var12;
                        this.field1450 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2443(arg0, var9, var6, var10, var4.field1371[this.field1451]);
                        if (this.field1445 < var6) {
                            return;
                        }
                        int var13 = (this.field1445 - var5) / var8;
                        if (var13 >= this.field1450) {
                            this.field1445 -= this.field1450 * var8;
                            this.field1450 = 0;
                            break;
                        }
                        this.field1445 -= var8 * var13;
                        this.field1450 -= var13;
                    }
                }
            }
            if (this.field1444 < 0) {
                this.method2390(arg0, var9, 0, var10, 0);
                if (this.field1445 < 0) {
                    this.field1445 = -1;
                    this.method2382();
                    this.method3960();
                }
            } else {
                this.method2443(arg0, var9, var7, var10, 0);
                if (this.field1445 >= var7) {
                    this.field1445 = var7;
                    this.method2382();
                    this.method3960();
                }
            }
        } else if (this.field1453) {
            if (this.field1444 < 0) {
                var9 = this.method2390(arg0, arg1, var5, var10, var4.field1371[this.field1451]);
                if (this.field1445 >= var5) {
                    return;
                }
                this.field1445 = var5 + var5 - 1 - this.field1445;
                this.field1444 = -this.field1444;
            }
            while (true) {
                int var11 = this.method2443(arg0, var9, var6, var10, var4.field1371[this.field1452 - 1]);
                if (this.field1445 < var6) {
                    return;
                }
                this.field1445 = var6 + var6 - 1 - this.field1445;
                this.field1444 = -this.field1444;
                var9 = this.method2390(arg0, var11, var5, var10, var4.field1371[this.field1451]);
                if (this.field1445 >= var5) {
                    return;
                }
                this.field1445 = var5 + var5 - 1 - this.field1445;
                this.field1444 = -this.field1444;
            }
        } else if (this.field1444 < 0) {
            while (true) {
                var9 = this.method2390(arg0, var9, var5, var10, var4.field1371[this.field1452 - 1]);
                if (this.field1445 >= var5) {
                    return;
                }
                this.field1445 = var6 - 1 - (var6 - 1 - this.field1445) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2443(arg0, var9, var6, var10, var4.field1371[this.field1451]);
                if (this.field1445 < var6) {
                    return;
                }
                this.field1445 = (this.field1445 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dt.n(I)V")
    public synchronized void method2129(int arg0) {
        if (this.field1454 > 0) {
            if (arg0 >= this.field1454) {
                if (this.field1443 == Integer.MIN_VALUE) {
                    this.field1443 = 0;
                    this.field1449 = 0;
                    this.field1448 = 0;
                    this.field1447 = 0;
                    this.method3960();
                    arg0 = this.field1454;
                }
                this.field1454 = 0;
                this.method2343();
            } else {
                this.field1447 += this.field1455 * arg0;
                this.field1448 += this.field1456 * arg0;
                this.field1449 += this.field1446 * arg0;
                this.field1454 -= arg0;
            }
        }
        class101 var2 = (class101) this.field1472;
        int var3 = this.field1451 << 8;
        int var4 = this.field1452 << 8;
        int var5 = var2.field1371.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1450 = 0;
        }
        if (this.field1445 < 0) {
            if (this.field1444 <= 0) {
                this.method2382();
                this.method3960();
                return;
            }
            this.field1445 = 0;
        }
        if (this.field1445 >= var5) {
            if (this.field1444 >= 0) {
                this.method2382();
                this.method3960();
                return;
            }
            this.field1445 = var5 - 1;
        }
        this.field1445 += this.field1444 * arg0;
        if (this.field1450 >= 0) {
            if (this.field1450 > 0) {
                if (this.field1453) {
                    label121: {
                        if (this.field1444 < 0) {
                            if (this.field1445 >= var3) {
                                return;
                            }
                            this.field1445 = var3 + var3 - 1 - this.field1445;
                            this.field1444 = -this.field1444;
                            if (--this.field1450 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1445 < var4) {
                                return;
                            }
                            this.field1445 = var4 + var4 - 1 - this.field1445;
                            this.field1444 = -this.field1444;
                            if (--this.field1450 == 0) {
                                break;
                            }
                            if (this.field1445 >= var3) {
                                return;
                            }
                            this.field1445 = var3 + var3 - 1 - this.field1445;
                            this.field1444 = -this.field1444;
                        } while (--this.field1450 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1444 < 0) {
                            if (this.field1445 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1445) / var6;
                            if (var7 >= this.field1450) {
                                this.field1445 += this.field1450 * var6;
                                this.field1450 = 0;
                                break label153;
                            }
                            this.field1445 += var6 * var7;
                            this.field1450 -= var7;
                        } else if (this.field1445 >= var4) {
                            int var8 = (this.field1445 - var3) / var6;
                            if (var8 >= this.field1450) {
                                this.field1445 -= this.field1450 * var6;
                                this.field1450 = 0;
                                break label153;
                            }
                            this.field1445 -= var6 * var8;
                            this.field1450 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1444 < 0) {
                if (this.field1445 < 0) {
                    this.field1445 = -1;
                    this.method2382();
                    this.method3960();
                }
            } else if (this.field1445 >= var5) {
                this.field1445 = var5;
                this.method2382();
                this.method3960();
            }
        } else if (this.field1453) {
            if (this.field1444 < 0) {
                if (this.field1445 >= var3) {
                    return;
                }
                this.field1445 = var3 + var3 - 1 - this.field1445;
                this.field1444 = -this.field1444;
            }
            while (this.field1445 >= var4) {
                this.field1445 = var4 + var4 - 1 - this.field1445;
                this.field1444 = -this.field1444;
                if (this.field1445 >= var3) {
                    return;
                }
                this.field1445 = var3 + var3 - 1 - this.field1445;
                this.field1444 = -this.field1444;
            }
        } else if (this.field1444 < 0) {
            if (this.field1445 >= var3) {
                return;
            }
            this.field1445 = var4 - 1 - (var4 - 1 - this.field1445) % var6;
        } else if (this.field1445 >= var4) {
            this.field1445 = (this.field1445 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dt.at([IIIII)I")
    public int method2443(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1454 > 0) {
                int var6 = this.field1454 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1454 += arg1;
                if (this.field1444 == 256 && (this.field1445 & 0xFF) == 0) {
                    if (Statics.field1136) {
                        arg1 = method2376(0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, this.field1456, this.field1446, 0, var6, arg2, this);
                    } else {
                        arg1 = method2363(((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, this.field1455, 0, var6, arg2, this);
                    }
                } else if (Statics.field1136) {
                    arg1 = method2398(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, this.field1456, this.field1446, 0, var6, arg2, this, this.field1444, arg4);
                } else {
                    arg1 = method2384(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, this.field1455, 0, var6, arg2, this, this.field1444, arg4);
                }
                this.field1454 -= arg1;
                if (this.field1454 != 0) {
                    return arg1;
                }
                if (!this.method2366()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1444 == 256 && (this.field1445 & 0xFF) == 0) {
                if (Statics.field1136) {
                    return method2368(0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, 0, arg3, arg2, this);
                }
                return method2367(((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, 0, arg3, arg2, this);
            }
            if (Statics.field1136) {
                return method2372(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, 0, arg3, arg2, this, this.field1444, arg4);
            }
            return method2371(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, 0, arg3, arg2, this, this.field1444, arg4);
        }
    }

    @ObfuscatedName("dt.al([IIIII)I")
    public int method2390(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1454 > 0) {
                int var6 = this.field1454 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1454 += arg1;
                if (this.field1444 == -256 && (this.field1445 & 0xFF) == 0) {
                    if (Statics.field1136) {
                        arg1 = method2378(0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, this.field1456, this.field1446, 0, var6, arg2, this);
                    } else {
                        arg1 = method2377(((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, this.field1455, 0, var6, arg2, this);
                    }
                } else if (Statics.field1136) {
                    arg1 = method2381(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, this.field1456, this.field1446, 0, var6, arg2, this, this.field1444, arg4);
                } else {
                    arg1 = method2342(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, this.field1455, 0, var6, arg2, this, this.field1444, arg4);
                }
                this.field1454 -= arg1;
                if (this.field1454 != 0) {
                    return arg1;
                }
                if (!this.method2366()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1444 == -256 && (this.field1445 & 0xFF) == 0) {
                if (Statics.field1136) {
                    return method2370(0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, 0, arg3, arg2, this);
                }
                return method2369(((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, 0, arg3, arg2, this);
            }
            if (Statics.field1136) {
                return method2374(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1448, this.field1449, 0, arg3, arg2, this, this.field1444, arg4);
            }
            return method2383(0, 0, ((class101) this.field1472).field1371, arg0, this.field1445, arg1, this.field1447, 0, arg3, arg2, this, this.field1444, arg4);
        }
    }

    @ObfuscatedName("dt.ao()Z")
    public boolean method2366() {
        int var1 = this.field1443;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2360(var1, this.field1457);
            var2 = method2340(var1, this.field1457);
        }
        if (this.field1447 != var1 || this.field1448 != var3 || this.field1449 != var2) {
            if (this.field1447 < var1) {
                this.field1455 = 1;
                this.field1454 = var1 - this.field1447;
            } else if (this.field1447 > var1) {
                this.field1455 = -1;
                this.field1454 = this.field1447 - var1;
            } else {
                this.field1455 = 0;
            }
            if (this.field1448 < var3) {
                this.field1456 = 1;
                if (this.field1454 == 0 || this.field1454 > var3 - this.field1448) {
                    this.field1454 = var3 - this.field1448;
                }
            } else if (this.field1448 > var3) {
                this.field1456 = -1;
                if (this.field1454 == 0 || this.field1454 > this.field1448 - var3) {
                    this.field1454 = this.field1448 - var3;
                }
            } else {
                this.field1456 = 0;
            }
            if (this.field1449 < var2) {
                this.field1446 = 1;
                if (this.field1454 == 0 || this.field1454 > var2 - this.field1449) {
                    this.field1454 = var2 - this.field1449;
                }
            } else if (this.field1449 > var2) {
                this.field1446 = -1;
                if (this.field1454 == 0 || this.field1454 > this.field1449 - var2) {
                    this.field1454 = this.field1449 - var2;
                }
            } else {
                this.field1446 = 0;
            }
            return false;
        } else if (this.field1443 == Integer.MIN_VALUE) {
            this.field1443 = 0;
            this.field1449 = 0;
            this.field1448 = 0;
            this.field1447 = 0;
            this.method3960();
            return true;
        } else {
            this.method2343();
            return false;
        }
    }

    @ObfuscatedName("dt.ad([B[IIIIIIILdt;)I")
    public static int method2367(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class111 arg8) {
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
        arg8.field1445 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.ax(I[B[IIIIIIIILdt;)I")
    public static int method2368(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class111 arg10) {
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
        arg10.field1445 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dt.ak([B[IIIIIIILdt;)I")
    public static int method2369(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class111 arg8) {
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
        arg8.field1445 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.am(I[B[IIIIIIIILdt;)I")
    public static int method2370(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class111 arg10) {
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
        arg10.field1445 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dt.bf(II[B[IIIIIIILdt;II)I")
    public static int method2371(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class111 arg10, int arg11, int arg12) {
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
        arg10.field1445 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bo(II[B[IIIIIIIILdt;II)I")
    public static int method2372(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class111 arg11, int arg12, int arg13) {
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
        arg11.field1445 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dt.be(II[B[IIIIIIILdt;II)I")
    public static int method2383(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class111 arg10, int arg11, int arg12) {
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
        arg10.field1445 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bd(II[B[IIIIIIIILdt;II)I")
    public static int method2374(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class111 arg11, int arg12, int arg13) {
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
        arg11.field1445 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dt.bz([B[IIIIIIIILdt;)I")
    public static int method2363(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class111 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1448 += (var14 - arg3) * arg9.field1456;
        arg9.field1449 += (var14 - arg3) * arg9.field1446;
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
        arg9.field1447 = var12 >> 2;
        arg9.field1445 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.bi(I[B[IIIIIIIIIILdt;)I")
    public static int method2376(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class111 arg12) {
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
        arg12.field1447 += (var19 - arg4) * arg12.field1455;
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
        arg12.field1448 = var15 >> 2;
        arg12.field1449 = var16 >> 2;
        arg12.field1445 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dt.bp([B[IIIIIIIILdt;)I")
    public static int method2377(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class111 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1448 += (var14 - arg3) * arg9.field1456;
        arg9.field1449 += (var14 - arg3) * arg9.field1446;
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
        arg9.field1447 = var12 >> 2;
        arg9.field1445 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dt.bv(I[B[IIIIIIIIIILdt;)I")
    public static int method2378(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class111 arg12) {
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
        arg12.field1447 += (var19 - arg4) * arg12.field1455;
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
        arg12.field1448 = var15 >> 2;
        arg12.field1449 = var16 >> 2;
        arg12.field1445 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dt.bg(II[B[IIIIIIIILdt;II)I")
    public static int method2384(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class111 arg11, int arg12, int arg13) {
        arg11.field1448 -= arg11.field1456 * arg5;
        arg11.field1449 -= arg11.field1446 * arg5;
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
        arg11.field1448 += arg11.field1456 * arg5;
        arg11.field1449 += arg11.field1446 * arg5;
        arg11.field1447 = arg6;
        arg11.field1445 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bk(II[B[IIIIIIIIIILdt;II)I")
    public static int method2398(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class111 arg13, int arg14, int arg15) {
        arg13.field1447 -= arg13.field1455 * arg5;
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
        arg13.field1447 += arg13.field1455 * var27;
        arg13.field1448 = arg6;
        arg13.field1449 = arg7;
        arg13.field1445 = arg4;
        return var27;
    }

    @ObfuscatedName("dt.br(II[B[IIIIIIIILdt;II)I")
    public static int method2342(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class111 arg11, int arg12, int arg13) {
        arg11.field1448 -= arg11.field1456 * arg5;
        arg11.field1449 -= arg11.field1446 * arg5;
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
        arg11.field1448 += arg11.field1456 * arg5;
        arg11.field1449 += arg11.field1446 * arg5;
        arg11.field1447 = arg6;
        arg11.field1445 = arg4;
        return arg5;
    }

    @ObfuscatedName("dt.bn(II[B[IIIIIIIIIILdt;II)I")
    public static int method2381(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class111 arg13, int arg14, int arg15) {
        arg13.field1447 -= arg13.field1455 * arg5;
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
        arg13.field1447 += arg13.field1455 * var26;
        arg13.field1448 = arg6;
        arg13.field1449 = arg7;
        arg13.field1445 = arg4;
        return var26;
    }
}
