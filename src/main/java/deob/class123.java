package deob;

@ObfuscatedName("dk")
public class class123 extends class125 {

    @ObfuscatedName("dk.m")
    public int field1493;

    @ObfuscatedName("dk.o")
    public int field1492;

    @ObfuscatedName("dk.q")
    public int field1504;

    @ObfuscatedName("dk.j")
    public int field1494;

    @ObfuscatedName("dk.p")
    public int field1495;

    @ObfuscatedName("dk.g")
    public int field1496;

    @ObfuscatedName("dk.n")
    public int field1497;

    @ObfuscatedName("dk.u")
    public int field1500;

    @ObfuscatedName("dk.a")
    public int field1499;

    @ObfuscatedName("dk.z")
    public int field1501;

    @ObfuscatedName("dk.y")
    public boolean field1498;

    @ObfuscatedName("dk.c")
    public int field1502;

    @ObfuscatedName("dk.h")
    public int field1503;

    @ObfuscatedName("dk.k")
    public int field1491;

    @ObfuscatedName("dk.r")
    public int field1505;

    @ObfuscatedName("dk.m(II)I")
    public static int method2546(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dk.o(II)I")
    public static int method2536(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("dk.af()I")
    public int method2435() {
        int var1 = this.field1495 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1500 == 0) {
            var2 -= this.field1493 * var2 / (((class113) this.field1520).field1423.length << 8);
        } else if (this.field1500 >= 0) {
            var2 -= this.field1499 * var2 / ((class113) this.field1520).field1423.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class123(class113 arg0, int arg1, int arg2) {
        this.field1520 = arg0;
        this.field1499 = arg0.field1422;
        this.field1501 = arg0.field1421;
        this.field1498 = arg0.field1424;
        this.field1492 = arg1;
        this.field1504 = arg2;
        this.field1494 = 8192;
        this.field1493 = 0;
        this.method2421();
    }

    public class123(class113 arg0, int arg1, int arg2, int arg3) {
        this.field1520 = arg0;
        this.field1499 = arg0.field1422;
        this.field1501 = arg0.field1421;
        this.field1498 = arg0.field1424;
        this.field1492 = arg1;
        this.field1504 = arg2;
        this.field1494 = arg3;
        this.field1493 = 0;
        this.method2421();
    }

    @ObfuscatedName("dk.q(Ldp;II)Ldk;")
    public static class123 method2419(class113 arg0, int arg1, int arg2) {
        return arg0.field1423 == null || arg0.field1423.length == 0 ? null : new class123(arg0, (int) ((long) arg0.field1420 * 256L * (long) arg1 / (long) (Statics.field3114 * 100)), arg2 << 6);
    }

    @ObfuscatedName("dk.j(Ldp;III)Ldk;")
    public static class123 method2420(class113 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1423 == null || arg0.field1423.length == 0 ? null : new class123(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dk.p()V")
    public void method2421() {
        this.field1495 = this.field1504;
        this.field1496 = method2546(this.field1504, this.field1494);
        this.field1497 = method2536(this.field1504, this.field1494);
    }

    @ObfuscatedName("dk.z(I)V")
    public synchronized void method2422(int arg0) {
        this.field1500 = arg0;
    }

    @ObfuscatedName("dk.y(I)V")
    public synchronized void method2423(int arg0) {
        this.method2425(arg0 << 6, this.method2454());
    }

    @ObfuscatedName("dk.c(I)V")
    public synchronized void method2424(int arg0) {
        this.method2425(arg0, this.method2454());
    }

    @ObfuscatedName("dk.h(II)V")
    public synchronized void method2425(int arg0, int arg1) {
        this.field1504 = arg0;
        this.field1494 = arg1;
        this.field1502 = 0;
        this.method2421();
    }

    @ObfuscatedName("dk.k()I")
    public synchronized int method2426() {
        return this.field1504 == Integer.MIN_VALUE ? 0 : this.field1504;
    }

    @ObfuscatedName("dk.r()I")
    public synchronized int method2454() {
        return this.field1494 < 0 ? -1 : this.field1494;
    }

    @ObfuscatedName("dk.d(I)V")
    public synchronized void method2428(int arg0) {
        int var2 = ((class113) this.field1520).field1423.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1493 = arg0;
    }

    @ObfuscatedName("dk.e(Z)V")
    public synchronized void method2429(boolean arg0) {
        this.field1492 = (this.field1492 >>> 31) + (this.field1492 ^ this.field1492 >> 31);
        if (arg0) {
            this.field1492 = -this.field1492;
        }
    }

    @ObfuscatedName("dk.l()V")
    public void method2430() {
        if (this.field1502 == 0) {
            return;
        }
        if (this.field1504 == Integer.MIN_VALUE) {
            this.field1504 = 0;
        }
        this.field1502 = 0;
        this.method2421();
    }

    @ObfuscatedName("dk.t(II)V")
    public synchronized void method2431(int arg0, int arg1) {
        this.method2511(arg0, arg1, this.method2454());
    }

    @ObfuscatedName("dk.x(III)V")
    public synchronized void method2511(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2425(arg1, arg2);
            return;
        }
        int var4 = method2546(arg1, arg2);
        int var5 = method2536(arg1, arg2);
        if (this.field1496 == var4 && this.field1497 == var5) {
            this.field1502 = 0;
            return;
        }
        int var6 = arg1 - this.field1495;
        if (this.field1495 - arg1 > var6) {
            var6 = this.field1495 - arg1;
        }
        if (var4 - this.field1496 > var6) {
            var6 = var4 - this.field1496;
        }
        if (this.field1496 - var4 > var6) {
            var6 = this.field1496 - var4;
        }
        if (var5 - this.field1497 > var6) {
            var6 = var5 - this.field1497;
        }
        if (this.field1497 - var5 > var6) {
            var6 = this.field1497 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1502 = arg0;
        this.field1504 = arg1;
        this.field1494 = arg2;
        this.field1503 = (arg1 - this.field1495) / arg0;
        this.field1491 = (var4 - this.field1496) / arg0;
        this.field1505 = (var5 - this.field1497) / arg0;
    }

    @ObfuscatedName("dk.ah(I)V")
    public synchronized void method2470(int arg0) {
        if (arg0 == 0) {
            this.method2424(0);
            this.method3388();
        } else if (this.field1496 == 0 && this.field1497 == 0) {
            this.field1502 = 0;
            this.field1504 = 0;
            this.field1495 = 0;
            this.method3388();
        } else {
            int var2 = -this.field1495;
            if (this.field1495 > var2) {
                var2 = this.field1495;
            }
            if (-this.field1496 > var2) {
                var2 = -this.field1496;
            }
            if (this.field1496 > var2) {
                var2 = this.field1496;
            }
            if (-this.field1497 > var2) {
                var2 = -this.field1497;
            }
            if (this.field1497 > var2) {
                var2 = this.field1497;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1502 = arg0;
            this.field1504 = Integer.MIN_VALUE;
            this.field1503 = -this.field1495 / arg0;
            this.field1491 = -this.field1496 / arg0;
            this.field1505 = -this.field1497 / arg0;
        }
    }

    @ObfuscatedName("dk.ai(I)V")
    public synchronized void method2434(int arg0) {
        if (this.field1492 < 0) {
            this.field1492 = -arg0;
        } else {
            this.field1492 = arg0;
        }
    }

    @ObfuscatedName("dk.ao()I")
    public synchronized int method2484() {
        return this.field1492 < 0 ? -this.field1492 : this.field1492;
    }

    @ObfuscatedName("dk.ae()Z")
    public boolean method2436() {
        return this.field1493 < 0 || this.field1493 >= ((class113) this.field1520).field1423.length << 8;
    }

    @ObfuscatedName("dk.ax()Z")
    public boolean method2437() {
        return this.field1502 != 0;
    }

    @ObfuscatedName("dk.g()Ldf;")
    public class125 method2198() {
        return null;
    }

    @ObfuscatedName("dk.n()Ldf;")
    public class125 method2199() {
        return null;
    }

    @ObfuscatedName("dk.u()I")
    public int method2200() {
        return this.field1504 == 0 && this.field1502 == 0 ? 0 : 1;
    }

    @ObfuscatedName("dk.a([III)V")
    public synchronized void method2206(int[] arg0, int arg1, int arg2) {
        if (this.field1504 == 0 && this.field1502 == 0) {
            this.method2203(arg2);
            return;
        }
        class113 var4 = (class113) this.field1520;
        int var5 = this.field1499 << 8;
        int var6 = this.field1501 << 8;
        int var7 = var4.field1423.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1500 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1493 < 0) {
            if (this.field1492 <= 0) {
                this.method2430();
                this.method3388();
                return;
            }
            this.field1493 = 0;
        }
        if (this.field1493 >= var7) {
            if (this.field1492 >= 0) {
                this.method2430();
                this.method3388();
                return;
            }
            this.field1493 = var7 - 1;
        }
        if (this.field1500 >= 0) {
            if (this.field1500 > 0) {
                if (this.field1498) {
                    label131: {
                        if (this.field1492 < 0) {
                            var9 = this.method2442(arg0, arg1, var5, var10, var4.field1423[this.field1499]);
                            if (this.field1493 >= var5) {
                                return;
                            }
                            this.field1493 = var5 + var5 - 1 - this.field1493;
                            this.field1492 = -this.field1492;
                            if (--this.field1500 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2441(arg0, var9, var6, var10, var4.field1423[this.field1501 - 1]);
                            if (this.field1493 < var6) {
                                return;
                            }
                            this.field1493 = var6 + var6 - 1 - this.field1493;
                            this.field1492 = -this.field1492;
                            if (--this.field1500 == 0) {
                                break;
                            }
                            var9 = this.method2442(arg0, var9, var5, var10, var4.field1423[this.field1499]);
                            if (this.field1493 >= var5) {
                                return;
                            }
                            this.field1493 = var5 + var5 - 1 - this.field1493;
                            this.field1492 = -this.field1492;
                        } while (--this.field1500 != 0);
                    }
                } else if (this.field1492 < 0) {
                    while (true) {
                        var9 = this.method2442(arg0, var9, var5, var10, var4.field1423[this.field1501 - 1]);
                        if (this.field1493 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1493) / var8;
                        if (var12 >= this.field1500) {
                            this.field1493 += this.field1500 * var8;
                            this.field1500 = 0;
                            break;
                        }
                        this.field1493 += var8 * var12;
                        this.field1500 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2441(arg0, var9, var6, var10, var4.field1423[this.field1499]);
                        if (this.field1493 < var6) {
                            return;
                        }
                        int var13 = (this.field1493 - var5) / var8;
                        if (var13 >= this.field1500) {
                            this.field1493 -= this.field1500 * var8;
                            this.field1500 = 0;
                            break;
                        }
                        this.field1493 -= var8 * var13;
                        this.field1500 -= var13;
                    }
                }
            }
            if (this.field1492 < 0) {
                this.method2442(arg0, var9, 0, var10, 0);
                if (this.field1493 < 0) {
                    this.field1493 = -1;
                    this.method2430();
                    this.method3388();
                }
            } else {
                this.method2441(arg0, var9, var7, var10, 0);
                if (this.field1493 >= var7) {
                    this.field1493 = var7;
                    this.method2430();
                    this.method3388();
                }
            }
        } else if (this.field1498) {
            if (this.field1492 < 0) {
                var9 = this.method2442(arg0, arg1, var5, var10, var4.field1423[this.field1499]);
                if (this.field1493 >= var5) {
                    return;
                }
                this.field1493 = var5 + var5 - 1 - this.field1493;
                this.field1492 = -this.field1492;
            }
            while (true) {
                int var11 = this.method2441(arg0, var9, var6, var10, var4.field1423[this.field1501 - 1]);
                if (this.field1493 < var6) {
                    return;
                }
                this.field1493 = var6 + var6 - 1 - this.field1493;
                this.field1492 = -this.field1492;
                var9 = this.method2442(arg0, var11, var5, var10, var4.field1423[this.field1499]);
                if (this.field1493 >= var5) {
                    return;
                }
                this.field1493 = var5 + var5 - 1 - this.field1493;
                this.field1492 = -this.field1492;
            }
        } else if (this.field1492 < 0) {
            while (true) {
                var9 = this.method2442(arg0, var9, var5, var10, var4.field1423[this.field1501 - 1]);
                if (this.field1493 >= var5) {
                    return;
                }
                this.field1493 = var6 - 1 - (var6 - 1 - this.field1493) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2441(arg0, var9, var6, var10, var4.field1423[this.field1499]);
                if (this.field1493 < var6) {
                    return;
                }
                this.field1493 = (this.field1493 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("dk.w(I)V")
    public synchronized void method2203(int arg0) {
        if (this.field1502 > 0) {
            if (arg0 >= this.field1502) {
                if (this.field1504 == Integer.MIN_VALUE) {
                    this.field1504 = 0;
                    this.field1497 = 0;
                    this.field1496 = 0;
                    this.field1495 = 0;
                    this.method3388();
                    arg0 = this.field1502;
                }
                this.field1502 = 0;
                this.method2421();
            } else {
                this.field1495 += this.field1503 * arg0;
                this.field1496 += this.field1491 * arg0;
                this.field1497 += this.field1505 * arg0;
                this.field1502 -= arg0;
            }
        }
        class113 var2 = (class113) this.field1520;
        int var3 = this.field1499 << 8;
        int var4 = this.field1501 << 8;
        int var5 = var2.field1423.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1500 = 0;
        }
        if (this.field1493 < 0) {
            if (this.field1492 <= 0) {
                this.method2430();
                this.method3388();
                return;
            }
            this.field1493 = 0;
        }
        if (this.field1493 >= var5) {
            if (this.field1492 >= 0) {
                this.method2430();
                this.method3388();
                return;
            }
            this.field1493 = var5 - 1;
        }
        this.field1493 += this.field1492 * arg0;
        if (this.field1500 >= 0) {
            if (this.field1500 > 0) {
                if (this.field1498) {
                    label121: {
                        if (this.field1492 < 0) {
                            if (this.field1493 >= var3) {
                                return;
                            }
                            this.field1493 = var3 + var3 - 1 - this.field1493;
                            this.field1492 = -this.field1492;
                            if (--this.field1500 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1493 < var4) {
                                return;
                            }
                            this.field1493 = var4 + var4 - 1 - this.field1493;
                            this.field1492 = -this.field1492;
                            if (--this.field1500 == 0) {
                                break;
                            }
                            if (this.field1493 >= var3) {
                                return;
                            }
                            this.field1493 = var3 + var3 - 1 - this.field1493;
                            this.field1492 = -this.field1492;
                        } while (--this.field1500 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1492 < 0) {
                            if (this.field1493 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1493) / var6;
                            if (var7 >= this.field1500) {
                                this.field1493 += this.field1500 * var6;
                                this.field1500 = 0;
                                break label153;
                            }
                            this.field1493 += var6 * var7;
                            this.field1500 -= var7;
                        } else if (this.field1493 >= var4) {
                            int var8 = (this.field1493 - var3) / var6;
                            if (var8 >= this.field1500) {
                                this.field1493 -= this.field1500 * var6;
                                this.field1500 = 0;
                                break label153;
                            }
                            this.field1493 -= var6 * var8;
                            this.field1500 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1492 < 0) {
                if (this.field1493 < 0) {
                    this.field1493 = -1;
                    this.method2430();
                    this.method3388();
                }
            } else if (this.field1493 >= var5) {
                this.field1493 = var5;
                this.method2430();
                this.method3388();
            }
        } else if (this.field1498) {
            if (this.field1492 < 0) {
                if (this.field1493 >= var3) {
                    return;
                }
                this.field1493 = var3 + var3 - 1 - this.field1493;
                this.field1492 = -this.field1492;
            }
            while (this.field1493 >= var4) {
                this.field1493 = var4 + var4 - 1 - this.field1493;
                this.field1492 = -this.field1492;
                if (this.field1493 >= var3) {
                    return;
                }
                this.field1493 = var3 + var3 - 1 - this.field1493;
                this.field1492 = -this.field1492;
            }
        } else if (this.field1492 < 0) {
            if (this.field1493 >= var3) {
                return;
            }
            this.field1493 = var4 - 1 - (var4 - 1 - this.field1493) % var6;
        } else if (this.field1493 >= var4) {
            this.field1493 = (this.field1493 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("dk.an([IIIII)I")
    public int method2441(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1502 > 0) {
                int var6 = this.field1502 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1502 += arg1;
                if (this.field1492 == 256 && (this.field1493 & 0xFF) == 0) {
                    if (Statics.field1305) {
                        arg1 = method2516(0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, this.field1491, this.field1505, 0, var6, arg2, this);
                    } else {
                        arg1 = method2452(((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, this.field1503, 0, var6, arg2, this);
                    }
                } else if (Statics.field1305) {
                    arg1 = method2475(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, this.field1491, this.field1505, 0, var6, arg2, this, this.field1492, arg4);
                } else {
                    arg1 = method2456(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, this.field1503, 0, var6, arg2, this, this.field1492, arg4);
                }
                this.field1502 -= arg1;
                if (this.field1502 != 0) {
                    return arg1;
                }
                if (!this.method2443()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1492 == 256 && (this.field1493 & 0xFF) == 0) {
                if (Statics.field1305) {
                    return method2479(0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, 0, arg3, arg2, this);
                }
                return method2463(((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, 0, arg3, arg2, this);
            }
            if (Statics.field1305) {
                return method2449(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, 0, arg3, arg2, this, this.field1492, arg4);
            }
            return method2477(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, 0, arg3, arg2, this, this.field1492, arg4);
        }
    }

    @ObfuscatedName("dk.av([IIIII)I")
    public int method2442(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1502 > 0) {
                int var6 = this.field1502 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1502 += arg1;
                if (this.field1492 == -256 && (this.field1493 & 0xFF) == 0) {
                    if (Statics.field1305) {
                        arg1 = method2455(0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, this.field1491, this.field1505, 0, var6, arg2, this);
                    } else {
                        arg1 = method2439(((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, this.field1503, 0, var6, arg2, this);
                    }
                } else if (Statics.field1305) {
                    arg1 = method2418(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, this.field1491, this.field1505, 0, var6, arg2, this, this.field1492, arg4);
                } else {
                    arg1 = method2503(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, this.field1503, 0, var6, arg2, this, this.field1492, arg4);
                }
                this.field1502 -= arg1;
                if (this.field1502 != 0) {
                    return arg1;
                }
                if (!this.method2443()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1492 == -256 && (this.field1493 & 0xFF) == 0) {
                if (Statics.field1305) {
                    return method2517(0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, 0, arg3, arg2, this);
                }
                return method2446(((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, 0, arg3, arg2, this);
            }
            if (Statics.field1305) {
                return method2451(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1496, this.field1497, 0, arg3, arg2, this, this.field1492, arg4);
            }
            return method2450(0, 0, ((class113) this.field1520).field1423, arg0, this.field1493, arg1, this.field1495, 0, arg3, arg2, this, this.field1492, arg4);
        }
    }

    @ObfuscatedName("dk.at()Z")
    public boolean method2443() {
        int var1 = this.field1504;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2546(var1, this.field1494);
            var2 = method2536(var1, this.field1494);
        }
        if (this.field1495 != var1 || this.field1496 != var3 || this.field1497 != var2) {
            if (this.field1495 < var1) {
                this.field1503 = 1;
                this.field1502 = var1 - this.field1495;
            } else if (this.field1495 > var1) {
                this.field1503 = -1;
                this.field1502 = this.field1495 - var1;
            } else {
                this.field1503 = 0;
            }
            if (this.field1496 < var3) {
                this.field1491 = 1;
                if (this.field1502 == 0 || this.field1502 > var3 - this.field1496) {
                    this.field1502 = var3 - this.field1496;
                }
            } else if (this.field1496 > var3) {
                this.field1491 = -1;
                if (this.field1502 == 0 || this.field1502 > this.field1496 - var3) {
                    this.field1502 = this.field1496 - var3;
                }
            } else {
                this.field1491 = 0;
            }
            if (this.field1497 < var2) {
                this.field1505 = 1;
                if (this.field1502 == 0 || this.field1502 > var2 - this.field1497) {
                    this.field1502 = var2 - this.field1497;
                }
            } else if (this.field1497 > var2) {
                this.field1505 = -1;
                if (this.field1502 == 0 || this.field1502 > this.field1497 - var2) {
                    this.field1502 = this.field1497 - var2;
                }
            } else {
                this.field1505 = 0;
            }
            return false;
        } else if (this.field1504 == Integer.MIN_VALUE) {
            this.field1504 = 0;
            this.field1497 = 0;
            this.field1496 = 0;
            this.field1495 = 0;
            this.method3388();
            return true;
        } else {
            this.method2421();
            return false;
        }
    }

    @ObfuscatedName("dk.aa([B[IIIIIIILdk;)I")
    public static int method2463(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1493 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.aw(I[B[IIIIIIIILdk;)I")
    public static int method2479(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1493 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dk.az([B[IIIIIIILdk;)I")
    public static int method2446(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8) {
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
        arg8.field1493 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.aq(I[B[IIIIIIIILdk;)I")
    public static int method2517(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10) {
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
        arg10.field1493 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("dk.ay(II[B[IIIIIIILdk;II)I")
    public static int method2477(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1493 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.au(II[B[IIIIIIIILdk;II)I")
    public static int method2449(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1493 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dk.aj(II[B[IIIIIIILdk;II)I")
    public static int method2450(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class123 arg10, int arg11, int arg12) {
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
        arg10.field1493 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.bk(II[B[IIIIIIIILdk;II)I")
    public static int method2451(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
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
        arg11.field1493 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("dk.bh([B[IIIIIIIILdk;)I")
    public static int method2452(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1496 += (var14 - arg3) * arg9.field1491;
        arg9.field1497 += (var14 - arg3) * arg9.field1505;
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
        arg9.field1495 = var12 >> 2;
        arg9.field1493 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.bg(I[B[IIIIIIIIIILdk;)I")
    public static int method2516(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1495 += (var19 - arg4) * arg12.field1503;
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
        arg12.field1496 = var15 >> 2;
        arg12.field1497 = var16 >> 2;
        arg12.field1493 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dk.be([B[IIIIIIIILdk;)I")
    public static int method2439(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class123 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1496 += (var14 - arg3) * arg9.field1491;
        arg9.field1497 += (var14 - arg3) * arg9.field1505;
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
        arg9.field1495 = var12 >> 2;
        arg9.field1493 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("dk.bf(I[B[IIIIIIIIIILdk;)I")
    public static int method2455(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class123 arg12) {
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
        arg12.field1495 += (var19 - arg4) * arg12.field1503;
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
        arg12.field1496 = var15 >> 2;
        arg12.field1497 = var16 >> 2;
        arg12.field1493 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("dk.ba(II[B[IIIIIIIILdk;II)I")
    public static int method2456(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1496 -= arg11.field1491 * arg5;
        arg11.field1497 -= arg11.field1505 * arg5;
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
        arg11.field1496 += arg11.field1491 * arg5;
        arg11.field1497 += arg11.field1505 * arg5;
        arg11.field1495 = arg6;
        arg11.field1493 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.bd(II[B[IIIIIIIIIILdk;II)I")
    public static int method2475(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1495 -= arg13.field1503 * arg5;
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
        arg13.field1495 += arg13.field1503 * var27;
        arg13.field1496 = arg6;
        arg13.field1497 = arg7;
        arg13.field1493 = arg4;
        return var27;
    }

    @ObfuscatedName("dk.bb(II[B[IIIIIIIILdk;II)I")
    public static int method2503(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class123 arg11, int arg12, int arg13) {
        arg11.field1496 -= arg11.field1491 * arg5;
        arg11.field1497 -= arg11.field1505 * arg5;
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
        arg11.field1496 += arg11.field1491 * arg5;
        arg11.field1497 += arg11.field1505 * arg5;
        arg11.field1495 = arg6;
        arg11.field1493 = arg4;
        return arg5;
    }

    @ObfuscatedName("dk.bw(II[B[IIIIIIIIIILdk;II)I")
    public static int method2418(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class123 arg13, int arg14, int arg15) {
        arg13.field1495 -= arg13.field1503 * arg5;
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
        arg13.field1495 += arg13.field1503 * var26;
        arg13.field1496 = arg6;
        arg13.field1497 = arg7;
        arg13.field1493 = arg4;
        return var26;
    }
}
