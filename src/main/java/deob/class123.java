package deob;

@ObfuscatedName("dj")
public class class123 extends class125 {

    @ObfuscatedName("dj.h")
    public int field1480;

    @ObfuscatedName("dj.v")
    public int field1489;

    @ObfuscatedName("dj.x")
    public int field1481;

    @ObfuscatedName("dj.t")
    public int field1483;

    @ObfuscatedName("dj.j")
    public int field1484;

    @ObfuscatedName("dj.n")
    public int field1485;

    @ObfuscatedName("dj.p")
    public int field1486;

    @ObfuscatedName("dj.l")
    public int field1487;

    @ObfuscatedName("dj.z")
    public int field1488;

    @ObfuscatedName("dj.u")
    public int field1482;

    @ObfuscatedName("dj.e")
    public boolean field1490;

    @ObfuscatedName("dj.m")
    public int field1491;

    @ObfuscatedName("dj.c")
    public int field1492;

    @ObfuscatedName("dj.i")
    public int field1493;

    @ObfuscatedName("dj.f")
    public int field1494;

    @ObfuscatedName("dj.h(II)I")
    public static int method2465(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dj.v(II)I")
    public static int method2411(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dj.ay()I")
    public int method2502() {
        int var1 = this.field1484 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1487 == 0) {
            var2 -= this.field1480 * var2 / (((class113) this.field1507).field1406.length << 8);
        } else if (this.field1487 >= 0) {
            var2 -= this.field1488 * var2 / ((class113) this.field1507).field1406.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class123(class113 arg0, int arg1, int arg2) {
        this.field1507 = arg0;
        this.field1488 = arg0.field1405;
        this.field1482 = arg0.field1407;
        this.field1490 = arg0.field1409;
        this.field1489 = arg1;
        this.field1481 = arg2;
        this.field1483 = 8192;
        this.field1480 = 0;
        this.method2416();
    }

    public class123(class113 arg0, int arg1, int arg2, int arg3) {
        this.field1507 = arg0;
        this.field1488 = arg0.field1405;
        this.field1482 = arg0.field1407;
        this.field1490 = arg0.field1409;
        this.field1489 = arg1;
        this.field1481 = arg2;
        this.field1483 = arg3;
        this.field1480 = 0;
        this.method2416();
    }

    @ObfuscatedName("dj.x(Ldf;II)Ldj;")
    public static class123 method2414(class113 arg0, int arg1, int arg2) {
        return arg0.field1406 == null || arg0.field1406.length == 0 ? null : new class123(arg0, (int) ((long) arg0.field1408 * 256L * (long) arg1 / (long) (Statics.field1444 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dj.w(Ldf;III)Ldj;")
    public static class123 method2435(class113 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1406 == null || arg0.field1406.length == 0 ? null : new class123(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dj.t()V")
    public void method2416() {
        this.field1484 = this.field1481;
        this.field1485 = method2465(this.field1481, this.field1483);
        this.field1486 = method2411(this.field1481, this.field1483);
    }

    @ObfuscatedName("dj.z(I)V")
    public synchronized void method2417(int arg0) {
        this.field1487 = arg0;
    }

    @ObfuscatedName("dj.e(I)V")
    public synchronized void method2418(int arg0) {
        this.method2451(arg0 << 6, this.method2422());
    }

    @ObfuscatedName("dj.m(I)V")
    public synchronized void method2419(int arg0) {
        this.method2451(arg0, this.method2422());
    }

    @ObfuscatedName("dj.c(II)V")
    public synchronized void method2451(int arg0, int arg1) {
        this.field1481 = arg0;
        this.field1483 = arg1;
        this.field1491 = 0;
        this.method2416();
    }

    @ObfuscatedName("dj.i()I")
    public synchronized int method2421() {
        return this.field1481 == Integer.MIN_VALUE ? 0 : this.field1481;
    }

    @ObfuscatedName("dj.f()I")
    public synchronized int method2422() {
        return this.field1483 < 0 ? -1 : this.field1483;
    }

    @ObfuscatedName("dj.y(I)V")
    public synchronized void method2423(int arg0) {
        int var2 = ((class113) this.field1507).field1406.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1480 = arg0;
    }

    @ObfuscatedName("dj.r(Z)V")
    public synchronized void method2424(boolean arg0) {
        this.field1489 = (this.field1489 >>> 31) + (this.field1489 ^ this.field1489 >> 31);
        if (arg0) {
            this.field1489 = -this.field1489;
        }
    }

    @ObfuscatedName("dj.q()V")
    public void method2425() {
        if (this.field1491 == 0) {
            return;
        }
        if (this.field1481 == Integer.MIN_VALUE) {
            this.field1481 = 0;
        }
        this.field1491 = 0;
        this.method2416();
    }

    @ObfuscatedName("dj.g(II)V")
    public synchronized void method2498(int arg0, int arg1) {
        this.method2535(arg0, arg1, this.method2422());
    }

    @ObfuscatedName("dj.o(III)V")
    public synchronized void method2535(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2451(arg1, arg2);
            return;
        }
        int var4 = method2465(arg1, arg2);
        int var5 = method2411(arg1, arg2);
        if (this.field1485 == var4 && this.field1486 == var5) {
            this.field1491 = 0;
            return;
        }
        int var6 = arg1 - this.field1484;
        if (this.field1484 - arg1 > var6) {
            var6 = this.field1484 - arg1;
        }
        if (var4 - this.field1485 > var6) {
            var6 = var4 - this.field1485;
        }
        if (this.field1485 - var4 > var6) {
            var6 = this.field1485 - var4;
        }
        if (var5 - this.field1486 > var6) {
            var6 = var5 - this.field1486;
        }
        if (this.field1486 - var5 > var6) {
            var6 = this.field1486 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1491 = arg0;
        this.field1481 = arg1;
        this.field1483 = arg2;
        this.field1492 = (arg1 - this.field1484) / arg0;
        this.field1493 = (var4 - this.field1485) / arg0;
        this.field1494 = (var5 - this.field1486) / arg0;
    }

    @ObfuscatedName("dj.an(I)V")
    public synchronized void method2428(int arg0) {
        if (arg0 == 0) {
            this.method2419(0);
            this.method3359();
        } else if (this.field1485 == 0 && this.field1486 == 0) {
            this.field1491 = 0;
            this.field1481 = 0;
            this.field1484 = 0;
            this.method3359();
        } else {
            int var2 = -this.field1484;
            if (this.field1484 > var2) {
                var2 = this.field1484;
            }
            if (-this.field1485 > var2) {
                var2 = -this.field1485;
            }
            if (this.field1485 > var2) {
                var2 = this.field1485;
            }
            if (-this.field1486 > var2) {
                var2 = -this.field1486;
            }
            if (this.field1486 > var2) {
                var2 = this.field1486;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1491 = arg0;
            this.field1481 = Integer.MIN_VALUE;
            this.field1492 = -this.field1484 / arg0;
            this.field1493 = -this.field1485 / arg0;
            this.field1494 = -this.field1486 / arg0;
        }
    }

    @ObfuscatedName("dj.aj(I)V")
    public synchronized void method2429(int arg0) {
        if (this.field1489 < 0) {
            this.field1489 = -arg0;
        } else {
            this.field1489 = arg0;
        }
    }

    @ObfuscatedName("dj.aq()I")
    public synchronized int method2430() {
        return this.field1489 < 0 ? -this.field1489 : this.field1489;
    }

    @ObfuscatedName("dj.ah()Z")
    public boolean method2431() {
        return this.field1480 < 0 || this.field1480 >= ((class113) this.field1507).field1406.length << 8;
    }

    @ObfuscatedName("dj.am()Z")
    public boolean method2432() {
        return this.field1491 != 0;
    }

    @ObfuscatedName("dj.j()Ldi;")
    public class125 method2189() {
        return null;
    }

    @ObfuscatedName("dj.n()Ldi;")
    public class125 method2188() {
        return null;
    }

    @ObfuscatedName("dj.p()I")
    public int method2215() {
        return this.field1481 == 0 && this.field1491 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dj.l([III)V")
    public synchronized void method2192(int[] arg0, int arg1, int arg2) {
        if (this.field1481 == 0 && this.field1491 == 0) {
            this.method2197(arg2);
            return;
        }
        class113 var4 = (class113) this.field1507;
        int var5 = this.field1488 << 8;
        int var6 = this.field1482 << 8;
        int var7 = var4.field1406.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1487 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1480 < 0) {
            if (this.field1489 <= 0) {
                this.method2425();
                this.method3359();
                return;
            }
            this.field1480 = 0;
        }
        if (this.field1480 >= var7) {
            if (this.field1489 >= 0) {
                this.method2425();
                this.method3359();
                return;
            }
            this.field1480 = var7 - 1;
        }
        if (this.field1487 >= 0) {
            if (this.field1487 > 0) {
                if (this.field1490) {
                    label131: {
                        if (this.field1489 < 0) {
                            var9 = this.method2436(arg0, arg1, var5, var10, var4.field1406[this.field1488]);
                            if (this.field1480 >= var5) {
                                return;
                            }
                            this.field1480 = var5 + var5 - 1 - this.field1480;
                            this.field1489 = -this.field1489;
                            if (--this.field1487 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2415(arg0, var9, var6, var10, var4.field1406[this.field1482 - 1]);
                            if (this.field1480 < var6) {
                                return;
                            }
                            this.field1480 = var6 + var6 - 1 - this.field1480;
                            this.field1489 = -this.field1489;
                            if (--this.field1487 == 0) {
                                break;
                            }
                            var9 = this.method2436(arg0, var9, var5, var10, var4.field1406[this.field1488]);
                            if (this.field1480 >= var5) {
                                return;
                            }
                            this.field1480 = var5 + var5 - 1 - this.field1480;
                            this.field1489 = -this.field1489;
                        } while (--this.field1487 != 0);
                    }
                } else if (this.field1489 < 0) {
                    while (true) {
                        var9 = this.method2436(arg0, var9, var5, var10, var4.field1406[this.field1482 - 1]);
                        if (this.field1480 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1480) / var8;
                        if (var12 >= this.field1487) {
                            this.field1480 += this.field1487 * var8;
                            this.field1487 = 0;
                            break;
                        }
                        this.field1480 += var8 * var12;
                        this.field1487 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2415(arg0, var9, var6, var10, var4.field1406[this.field1488]);
                        if (this.field1480 < var6) {
                            return;
                        }
                        int var13 = (this.field1480 - var5) / var8;
                        if (var13 >= this.field1487) {
                            this.field1480 -= this.field1487 * var8;
                            this.field1487 = 0;
                            break;
                        }
                        this.field1480 -= var8 * var13;
                        this.field1487 -= var13;
                    }
                }
            }
            if (this.field1489 < 0) {
                this.method2436(arg0, var9, 0, var10, 0);
                if (this.field1480 < 0) {
                    this.field1480 = -1;
                    this.method2425();
                    this.method3359();
                }
            } else {
                this.method2415(arg0, var9, var7, var10, 0);
                if (this.field1480 >= var7) {
                    this.field1480 = var7;
                    this.method2425();
                    this.method3359();
                }
            }
        } else if (this.field1490) {
            if (this.field1489 < 0) {
                var9 = this.method2436(arg0, arg1, var5, var10, var4.field1406[this.field1488]);
                if (this.field1480 >= var5) {
                    return;
                }
                this.field1480 = var5 + var5 - 1 - this.field1480;
                this.field1489 = -this.field1489;
            }
            while (true) {
                int var11 = this.method2415(arg0, var9, var6, var10, var4.field1406[this.field1482 - 1]);
                if (this.field1480 < var6) {
                    return;
                }
                this.field1480 = var6 + var6 - 1 - this.field1480;
                this.field1489 = -this.field1489;
                var9 = this.method2436(arg0, var11, var5, var10, var4.field1406[this.field1488]);
                if (this.field1480 >= var5) {
                    return;
                }
                this.field1480 = var5 + var5 - 1 - this.field1480;
                this.field1489 = -this.field1489;
            }
        } else if (this.field1489 < 0) {
            while (true) {
                var9 = this.method2436(arg0, var9, var5, var10, var4.field1406[this.field1482 - 1]);
                if (this.field1480 >= var5) {
                    return;
                }
                this.field1480 = var6 - 1 - (var6 - 1 - this.field1480) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2415(arg0, var9, var6, var10, var4.field1406[this.field1488]);
                if (this.field1480 < var6) {
                    return;
                }
                this.field1480 = (this.field1480 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dj.u(I)V")
    public synchronized void method2197(int arg0) {
        if (this.field1491 > 0) {
            if (arg0 >= this.field1491) {
                if (this.field1481 == Integer.MIN_VALUE) {
                    this.field1481 = 0;
                    this.field1486 = 0;
                    this.field1485 = 0;
                    this.field1484 = 0;
                    this.method3359();
                    arg0 = this.field1491;
                }
                this.field1491 = 0;
                this.method2416();
            } else {
                this.field1484 += this.field1492 * arg0;
                this.field1485 += this.field1493 * arg0;
                this.field1486 += this.field1494 * arg0;
                this.field1491 -= arg0;
            }
        }
        class113 var2 = (class113) this.field1507;
        int var3 = this.field1488 << 8;
        int var4 = this.field1482 << 8;
        int var5 = var2.field1406.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1487 = 0;
        }
        if (this.field1480 < 0) {
            if (this.field1489 <= 0) {
                this.method2425();
                this.method3359();
                return;
            }
            this.field1480 = 0;
        }
        if (this.field1480 >= var5) {
            if (this.field1489 >= 0) {
                this.method2425();
                this.method3359();
                return;
            }
            this.field1480 = var5 - 1;
        }
        this.field1480 += this.field1489 * arg0;
        if (this.field1487 >= 0) {
            if (this.field1487 > 0) {
                if (this.field1490) {
                    label121: {
                        if (this.field1489 < 0) {
                            if (this.field1480 >= var3) {
                                return;
                            }
                            this.field1480 = var3 + var3 - 1 - this.field1480;
                            this.field1489 = -this.field1489;
                            if (--this.field1487 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1480 < var4) {
                                return;
                            }
                            this.field1480 = var4 + var4 - 1 - this.field1480;
                            this.field1489 = -this.field1489;
                            if (--this.field1487 == 0) {
                                break;
                            }
                            if (this.field1480 >= var3) {
                                return;
                            }
                            this.field1480 = var3 + var3 - 1 - this.field1480;
                            this.field1489 = -this.field1489;
                        } while (--this.field1487 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1489 < 0) {
                            if (this.field1480 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1480) / var6;
                            if (var7 >= this.field1487) {
                                this.field1480 += this.field1487 * var6;
                                this.field1487 = 0;
                                break label153;
                            }
                            this.field1480 += var6 * var7;
                            this.field1487 -= var7;
                        } else if (this.field1480 >= var4) {
                            int var8 = (this.field1480 - var3) / var6;
                            if (var8 >= this.field1487) {
                                this.field1480 -= this.field1487 * var6;
                                this.field1487 = 0;
                                break label153;
                            }
                            this.field1480 -= var6 * var8;
                            this.field1487 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1489 < 0) {
                if (this.field1480 < 0) {
                    this.field1480 = -1;
                    this.method2425();
                    this.method3359();
                }
            } else if (this.field1480 >= var5) {
                this.field1480 = var5;
                this.method2425();
                this.method3359();
            }
        } else if (this.field1490) {
            if (this.field1489 < 0) {
                if (this.field1480 >= var3) {
                    return;
                }
                this.field1480 = var3 + var3 - 1 - this.field1480;
                this.field1489 = -this.field1489;
            }
            while (this.field1480 >= var4) {
                this.field1480 = var4 + var4 - 1 - this.field1480;
                this.field1489 = -this.field1489;
                if (this.field1480 >= var3) {
                    return;
                }
                this.field1480 = var3 + var3 - 1 - this.field1480;
                this.field1489 = -this.field1489;
            }
        } else if (this.field1489 < 0) {
            if (this.field1480 >= var3) {
                return;
            }
            this.field1480 = var4 - 1 - (var4 - 1 - this.field1480) % var6;
        } else if (this.field1480 >= var4) {
            this.field1480 = (this.field1480 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dj.ad([IIIII)I")
    public int method2415(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1491 > 0) {
                int var6 = this.field1491 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1491 += arg1;
                if (this.field1489 == 256 && (this.field1480 & 0xFF) == 0) {
                    if (Statics.field1422) {
                        arg1 = method2446(0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, this.field1493, this.field1494, 0, var6, arg2, this);
                    } else {
                        arg1 = method2445(((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, this.field1492, 0, var6, arg2, this);
                    }
                } else if (Statics.field1422) {
                    arg1 = method2450(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, this.field1493, this.field1494, 0, var6, arg2, this, this.field1489, arg4);
                } else {
                    arg1 = method2452(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, this.field1492, 0, var6, arg2, this, this.field1489, arg4);
                }
                this.field1491 -= arg1;
                if (this.field1491 != 0) {
                    return arg1;
                }
                if (!this.method2437()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1489 == 256 && (this.field1480 & 0xFF) == 0) {
                if (Statics.field1422) {
                    return method2555(0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, 0, arg3, arg2, this);
                }
                return method2434(((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, 0, arg3, arg2, this);
            }
            if (Statics.field1422) {
                return method2442(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, 0, arg3, arg2, this, this.field1489, arg4);
            }
            return method2530(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, 0, arg3, arg2, this, this.field1489, arg4);
        }
    }

    @ObfuscatedName("dj.ai([IIIII)I")
    public int method2436(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1491 > 0) {
                int var6 = this.field1491 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1491 += arg1;
                if (this.field1489 == -256 && (this.field1480 & 0xFF) == 0) {
                    if (Statics.field1422) {
                        arg1 = method2448(0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, this.field1493, this.field1494, 0, var6, arg2, this);
                    } else {
                        arg1 = method2447(((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, this.field1492, 0, var6, arg2, this);
                    }
                } else if (Statics.field1422) {
                    arg1 = method2459(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, this.field1493, this.field1494, 0, var6, arg2, this, this.field1489, arg4);
                } else {
                    arg1 = method2427(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, this.field1492, 0, var6, arg2, this, this.field1489, arg4);
                }
                this.field1491 -= arg1;
                if (this.field1491 != 0) {
                    return arg1;
                }
                if (!this.method2437()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1489 == -256 && (this.field1480 & 0xFF) == 0) {
                if (Statics.field1422) {
                    return method2440(0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, 0, arg3, arg2, this);
                }
                return method2413(((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, 0, arg3, arg2, this);
            }
            if (Statics.field1422) {
                return method2444(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1485, this.field1486, 0, arg3, arg2, this, this.field1489, arg4);
            }
            return method2443(0, 0, ((class113) this.field1507).field1406, arg0, this.field1480, arg1, this.field1484, 0, arg3, arg2, this, this.field1489, arg4);
        }
    }

    @ObfuscatedName("dj.al()Z")
    public boolean method2437() {
        int var1 = this.field1481;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2465(var1, this.field1483);
            var2 = method2411(var1, this.field1483);
        }
        if (this.field1484 != var1 || this.field1485 != var3 || this.field1486 != var2) {
            if (this.field1484 < var1) {
                this.field1492 = 1;
                this.field1491 = var1 - this.field1484;
            } else if (this.field1484 > var1) {
                this.field1492 = -1;
                this.field1491 = this.field1484 - var1;
            } else {
                this.field1492 = 0;
            }
            if (this.field1485 < var3) {
                this.field1493 = 1;
                if (this.field1491 == 0 || this.field1491 > var3 - this.field1485) {
                    this.field1491 = var3 - this.field1485;
                }
            } else if (this.field1485 > var3) {
                this.field1493 = -1;
                if (this.field1491 == 0 || this.field1491 > this.field1485 - var3) {
                    this.field1491 = this.field1485 - var3;
                }
            } else {
                this.field1493 = 0;
            }
            if (this.field1486 < var2) {
                this.field1494 = 1;
                if (this.field1491 == 0 || this.field1491 > var2 - this.field1486) {
                    this.field1491 = var2 - this.field1486;
                }
            } else if (this.field1486 > var2) {
                this.field1494 = -1;
                if (this.field1491 == 0 || this.field1491 > this.field1486 - var2) {
                    this.field1491 = this.field1486 - var2;
                }
            } else {
                this.field1494 = 0;
            }
            return false;
        } else if (this.field1481 == Integer.MIN_VALUE) {
            this.field1481 = 0;
            this.field1486 = 0;
            this.field1485 = 0;
            this.field1484 = 0;
            this.method3359();
            return true;
        } else {
            this.method2416();
            return false;
        }
    }

    @ObfuscatedName("dj.af([B[IIIIIIILdj;)I")
    public static int method2434(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1480 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dj.ar(I[B[IIIIIIIILdj;)I")
    public static int method2555(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1480 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dj.az([B[IIIIIIILdj;)I")
    public static int method2413(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1480 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dj.at(I[B[IIIIIIIILdj;)I")
    public static int method2440(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1480 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dj.bh(II[B[IIIIIIILdj;II)I")
    public static int method2530(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1480 = arg4;
        return arg5;
    }

    @ObfuscatedName("dj.by(II[B[IIIIIIIILdj;II)I")
    public static int method2442(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1480 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dj.bs(II[B[IIIIIIILdj;II)I")
    public static int method2443(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1480 = arg4;
        return arg5;
    }

    @ObfuscatedName("dj.br(II[B[IIIIIIIILdj;II)I")
    public static int method2444(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1480 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dj.bl([B[IIIIIIIILdj;)I")
    public static int method2445(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1485 += (var14 - arg3) * arg9.field1493;
        arg9.field1486 += (var14 - arg3) * arg9.field1494;
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
        arg9.field1484 = var12 >> 2;
        arg9.field1480 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dj.bx(I[B[IIIIIIIIIILdj;)I")
    public static int method2446(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1484 += (var19 - arg4) * arg12.field1492;
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
        arg12.field1485 = var15 >> 2;
        arg12.field1486 = var16 >> 2;
        arg12.field1480 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dj.bf([B[IIIIIIIILdj;)I")
    public static int method2447(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1485 += (var14 - arg3) * arg9.field1493;
        arg9.field1486 += (var14 - arg3) * arg9.field1494;
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
        arg9.field1484 = var12 >> 2;
        arg9.field1480 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dj.bz(I[B[IIIIIIIIIILdj;)I")
    public static int method2448(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1484 += (var19 - arg4) * arg12.field1492;
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
        arg12.field1485 = var15 >> 2;
        arg12.field1486 = var16 >> 2;
        arg12.field1480 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dj.bm(II[B[IIIIIIIILdj;II)I")
    public static int method2452(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1485 -= arg11.field1493 * arg5;
        arg11.field1486 -= arg11.field1494 * arg5;
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
        arg11.field1485 += arg11.field1493 * arg5;
        arg11.field1486 += arg11.field1494 * arg5;
        arg11.field1484 = arg6;
        arg11.field1480 = arg4;
        return arg5;
    }

    @ObfuscatedName("dj.bn(II[B[IIIIIIIIIILdj;II)I")
    public static int method2450(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1484 -= arg13.field1492 * arg5;
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
        arg13.field1484 += arg13.field1492 * var27;
        arg13.field1485 = arg6;
        arg13.field1486 = arg7;
        arg13.field1480 = arg4;
        return var27;
    }

    @ObfuscatedName("dj.bd(II[B[IIIIIIIILdj;II)I")
    public static int method2427(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1485 -= arg11.field1493 * arg5;
        arg11.field1486 -= arg11.field1494 * arg5;
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
        arg11.field1485 += arg11.field1493 * arg5;
        arg11.field1486 += arg11.field1494 * arg5;
        arg11.field1484 = arg6;
        arg11.field1480 = arg4;
        return arg5;
    }

    @ObfuscatedName("dj.bc(II[B[IIIIIIIIIILdj;II)I")
    public static int method2459(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1484 -= arg13.field1492 * arg5;
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
        arg13.field1484 += arg13.field1492 * var26;
        arg13.field1485 = arg6;
        arg13.field1486 = arg7;
        arg13.field1480 = arg4;
        return var26;
    }
}
