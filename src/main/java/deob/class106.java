package deob;

@ObfuscatedName("da")
public class class106 extends class108 {

    @ObfuscatedName("da.c")
    public int field1429;

    @ObfuscatedName("da.q")
    public int field1421;

    @ObfuscatedName("da.m")
    public int field1424;

    @ObfuscatedName("da.j")
    public int field1423;

    @ObfuscatedName("da.g")
    public int field1420;

    @ObfuscatedName("da.i")
    public int field1425;

    @ObfuscatedName("da.h")
    public int field1426;

    @ObfuscatedName("da.l")
    public int field1427;

    @ObfuscatedName("da.d")
    public int field1428;

    @ObfuscatedName("da.o")
    public int field1430;

    @ObfuscatedName("da.s")
    public boolean field1422;

    @ObfuscatedName("da.k")
    public int field1431;

    @ObfuscatedName("da.v")
    public int field1432;

    @ObfuscatedName("da.p")
    public int field1433;

    @ObfuscatedName("da.n")
    public int field1434;

    @ObfuscatedName("da.c(II)I")
    public static int method2099(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.q(II)I")
    public static int method2207(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("da.ag()I")
    public int method2085() {
        int var1 = this.field1420 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1427 == 0) {
            var2 -= this.field1429 * var2 / (((class96) this.field1449).field1338.length << 8);
        } else if (this.field1427 >= 0) {
            var2 -= this.field1428 * var2 / ((class96) this.field1449).field1338.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class106(class96 arg0, int arg1, int arg2) {
        this.field1449 = arg0;
        this.field1428 = arg0.field1340;
        this.field1430 = arg0.field1337;
        this.field1422 = arg0.field1341;
        this.field1421 = arg1;
        this.field1424 = arg2;
        this.field1423 = 8192;
        this.field1429 = 0;
        this.method2090();
    }

    public class106(class96 arg0, int arg1, int arg2, int arg3) {
        this.field1449 = arg0;
        this.field1428 = arg0.field1340;
        this.field1430 = arg0.field1337;
        this.field1422 = arg0.field1341;
        this.field1421 = arg1;
        this.field1424 = arg2;
        this.field1423 = arg3;
        this.field1429 = 0;
        this.method2090();
    }

    @ObfuscatedName("da.m(Lcz;II)Lda;")
    public static class106 method2088(class96 arg0, int arg1, int arg2) {
        return arg0.field1338 == null || arg0.field1338.length == 0 ? null : new class106(arg0, (int) ((long) arg0.field1339 * 256L * (long) arg1 / (long) (Statics.field2434 * 100)), arg2 << 6);
    }

    @ObfuscatedName("da.j(Lcz;III)Lda;")
    public static class106 method2111(class96 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1338 == null || arg0.field1338.length == 0 ? null : new class106(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("da.g()V")
    public void method2090() {
        this.field1420 = this.field1424;
        this.field1425 = method2099(this.field1424, this.field1423);
        this.field1426 = method2207(this.field1424, this.field1423);
    }

    @ObfuscatedName("da.k(I)V")
    public synchronized void method2091(int arg0) {
        this.field1427 = arg0;
    }

    @ObfuscatedName("da.p(I)V")
    public synchronized void method2092(int arg0) {
        this.method2089(arg0 << 6, this.method2146());
    }

    @ObfuscatedName("da.n(I)V")
    public synchronized void method2094(int arg0) {
        this.method2089(arg0, this.method2146());
    }

    @ObfuscatedName("da.t(II)V")
    public synchronized void method2089(int arg0, int arg1) {
        this.field1424 = arg0;
        this.field1423 = arg1;
        this.field1431 = 0;
        this.method2090();
    }

    @ObfuscatedName("da.r()I")
    public synchronized int method2095() {
        return this.field1424 == Integer.MIN_VALUE ? 0 : this.field1424;
    }

    @ObfuscatedName("da.x()I")
    public synchronized int method2146() {
        return this.field1423 < 0 ? -1 : this.field1423;
    }

    @ObfuscatedName("da.b(I)V")
    public synchronized void method2208(int arg0) {
        int var2 = ((class96) this.field1449).field1338.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1429 = arg0;
    }

    @ObfuscatedName("da.w(Z)V")
    public synchronized void method2098(boolean arg0) {
        this.field1421 = (this.field1421 >>> 31) + (this.field1421 ^ this.field1421 >> 31);
        if (arg0) {
            this.field1421 = -this.field1421;
        }
    }

    @ObfuscatedName("da.a()V")
    public void method2093() {
        if (this.field1431 == 0) {
            return;
        }
        if (this.field1424 == Integer.MIN_VALUE) {
            this.field1424 = 0;
        }
        this.field1431 = 0;
        this.method2090();
    }

    @ObfuscatedName("da.z(II)V")
    public synchronized void method2100(int arg0, int arg1) {
        this.method2101(arg0, arg1, this.method2146());
    }

    @ObfuscatedName("da.aa(III)V")
    public synchronized void method2101(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2089(arg1, arg2);
            return;
        }
        int var4 = method2099(arg1, arg2);
        int var5 = method2207(arg1, arg2);
        if (this.field1425 == var4 && this.field1426 == var5) {
            this.field1431 = 0;
            return;
        }
        int var6 = arg1 - this.field1420;
        if (this.field1420 - arg1 > var6) {
            var6 = this.field1420 - arg1;
        }
        if (var4 - this.field1425 > var6) {
            var6 = var4 - this.field1425;
        }
        if (this.field1425 - var4 > var6) {
            var6 = this.field1425 - var4;
        }
        if (var5 - this.field1426 > var6) {
            var6 = var5 - this.field1426;
        }
        if (this.field1426 - var5 > var6) {
            var6 = this.field1426 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1431 = arg0;
        this.field1424 = arg1;
        this.field1423 = arg2;
        this.field1432 = (arg1 - this.field1420) / arg0;
        this.field1433 = (var4 - this.field1425) / arg0;
        this.field1434 = (var5 - this.field1426) / arg0;
    }

    @ObfuscatedName("da.ac(I)V")
    public synchronized void method2148(int arg0) {
        if (arg0 == 0) {
            this.method2094(0);
            this.method3733();
        } else if (this.field1425 == 0 && this.field1426 == 0) {
            this.field1431 = 0;
            this.field1424 = 0;
            this.field1420 = 0;
            this.method3733();
        } else {
            int var2 = -this.field1420;
            if (this.field1420 > var2) {
                var2 = this.field1420;
            }
            if (-this.field1425 > var2) {
                var2 = -this.field1425;
            }
            if (this.field1425 > var2) {
                var2 = this.field1425;
            }
            if (-this.field1426 > var2) {
                var2 = -this.field1426;
            }
            if (this.field1426 > var2) {
                var2 = this.field1426;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1431 = arg0;
            this.field1424 = Integer.MIN_VALUE;
            this.field1432 = -this.field1420 / arg0;
            this.field1433 = -this.field1425 / arg0;
            this.field1434 = -this.field1426 / arg0;
        }
    }

    @ObfuscatedName("da.ad(I)V")
    public synchronized void method2103(int arg0) {
        if (this.field1421 < 0) {
            this.field1421 = -arg0;
        } else {
            this.field1421 = arg0;
        }
    }

    @ObfuscatedName("da.aq()I")
    public synchronized int method2171() {
        return this.field1421 < 0 ? -this.field1421 : this.field1421;
    }

    @ObfuscatedName("da.ax()Z")
    public boolean method2105() {
        return this.field1429 < 0 || this.field1429 >= ((class96) this.field1449).field1338.length << 8;
    }

    @ObfuscatedName("da.ap()Z")
    public boolean method2106() {
        return this.field1431 != 0;
    }

    @ObfuscatedName("da.i()Ldd;")
    public class108 method1879() {
        return null;
    }

    @ObfuscatedName("da.h()Ldd;")
    public class108 method1874() {
        return null;
    }

    @ObfuscatedName("da.l()I")
    public int method1875() {
        return this.field1424 == 0 && this.field1431 == 0 ? 0 : 1;
    }

    @ObfuscatedName("da.o([III)V")
    public synchronized void method1893(int[] arg0, int arg1, int arg2) {
        if (this.field1424 == 0 && this.field1431 == 0) {
            this.method1872(arg2);
            return;
        }
        class96 var4 = (class96) this.field1449;
        int var5 = this.field1428 << 8;
        int var6 = this.field1430 << 8;
        int var7 = var4.field1338.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1427 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1429 < 0) {
            if (this.field1421 <= 0) {
                this.method2093();
                this.method3733();
                return;
            }
            this.field1429 = 0;
        }
        if (this.field1429 >= var7) {
            if (this.field1421 >= 0) {
                this.method2093();
                this.method3733();
                return;
            }
            this.field1429 = var7 - 1;
        }
        if (this.field1427 >= 0) {
            if (this.field1427 > 0) {
                if (this.field1422) {
                    label131: {
                        if (this.field1421 < 0) {
                            var9 = this.method2134(arg0, arg1, var5, var10, var4.field1338[this.field1428]);
                            if (this.field1429 >= var5) {
                                return;
                            }
                            this.field1429 = var5 + var5 - 1 - this.field1429;
                            this.field1421 = -this.field1421;
                            if (--this.field1427 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2110(arg0, var9, var6, var10, var4.field1338[this.field1430 - 1]);
                            if (this.field1429 < var6) {
                                return;
                            }
                            this.field1429 = var6 + var6 - 1 - this.field1429;
                            this.field1421 = -this.field1421;
                            if (--this.field1427 == 0) {
                                break;
                            }
                            var9 = this.method2134(arg0, var9, var5, var10, var4.field1338[this.field1428]);
                            if (this.field1429 >= var5) {
                                return;
                            }
                            this.field1429 = var5 + var5 - 1 - this.field1429;
                            this.field1421 = -this.field1421;
                        } while (--this.field1427 != 0);
                    }
                } else if (this.field1421 < 0) {
                    while (true) {
                        var9 = this.method2134(arg0, var9, var5, var10, var4.field1338[this.field1430 - 1]);
                        if (this.field1429 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1429) / var8;
                        if (var12 >= this.field1427) {
                            this.field1429 += this.field1427 * var8;
                            this.field1427 = 0;
                            break;
                        }
                        this.field1429 += var8 * var12;
                        this.field1427 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2110(arg0, var9, var6, var10, var4.field1338[this.field1428]);
                        if (this.field1429 < var6) {
                            return;
                        }
                        int var13 = (this.field1429 - var5) / var8;
                        if (var13 >= this.field1427) {
                            this.field1429 -= this.field1427 * var8;
                            this.field1427 = 0;
                            break;
                        }
                        this.field1429 -= var8 * var13;
                        this.field1427 -= var13;
                    }
                }
            }
            if (this.field1421 < 0) {
                this.method2134(arg0, var9, 0, var10, 0);
                if (this.field1429 < 0) {
                    this.field1429 = -1;
                    this.method2093();
                    this.method3733();
                }
            } else {
                this.method2110(arg0, var9, var7, var10, 0);
                if (this.field1429 >= var7) {
                    this.field1429 = var7;
                    this.method2093();
                    this.method3733();
                }
            }
        } else if (this.field1422) {
            if (this.field1421 < 0) {
                var9 = this.method2134(arg0, arg1, var5, var10, var4.field1338[this.field1428]);
                if (this.field1429 >= var5) {
                    return;
                }
                this.field1429 = var5 + var5 - 1 - this.field1429;
                this.field1421 = -this.field1421;
            }
            while (true) {
                int var11 = this.method2110(arg0, var9, var6, var10, var4.field1338[this.field1430 - 1]);
                if (this.field1429 < var6) {
                    return;
                }
                this.field1429 = var6 + var6 - 1 - this.field1429;
                this.field1421 = -this.field1421;
                var9 = this.method2134(arg0, var11, var5, var10, var4.field1338[this.field1428]);
                if (this.field1429 >= var5) {
                    return;
                }
                this.field1429 = var5 + var5 - 1 - this.field1429;
                this.field1421 = -this.field1421;
            }
        } else if (this.field1421 < 0) {
            while (true) {
                var9 = this.method2134(arg0, var9, var5, var10, var4.field1338[this.field1430 - 1]);
                if (this.field1429 >= var5) {
                    return;
                }
                this.field1429 = var6 - 1 - (var6 - 1 - this.field1429) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2110(arg0, var9, var6, var10, var4.field1338[this.field1428]);
                if (this.field1429 < var6) {
                    return;
                }
                this.field1429 = (this.field1429 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("da.v(I)V")
    public synchronized void method1872(int arg0) {
        if (this.field1431 > 0) {
            if (arg0 >= this.field1431) {
                if (this.field1424 == Integer.MIN_VALUE) {
                    this.field1424 = 0;
                    this.field1426 = 0;
                    this.field1425 = 0;
                    this.field1420 = 0;
                    this.method3733();
                    arg0 = this.field1431;
                }
                this.field1431 = 0;
                this.method2090();
            } else {
                this.field1420 += this.field1432 * arg0;
                this.field1425 += this.field1433 * arg0;
                this.field1426 += this.field1434 * arg0;
                this.field1431 -= arg0;
            }
        }
        class96 var2 = (class96) this.field1449;
        int var3 = this.field1428 << 8;
        int var4 = this.field1430 << 8;
        int var5 = var2.field1338.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1427 = 0;
        }
        if (this.field1429 < 0) {
            if (this.field1421 <= 0) {
                this.method2093();
                this.method3733();
                return;
            }
            this.field1429 = 0;
        }
        if (this.field1429 >= var5) {
            if (this.field1421 >= 0) {
                this.method2093();
                this.method3733();
                return;
            }
            this.field1429 = var5 - 1;
        }
        this.field1429 += this.field1421 * arg0;
        if (this.field1427 >= 0) {
            if (this.field1427 > 0) {
                if (this.field1422) {
                    label121: {
                        if (this.field1421 < 0) {
                            if (this.field1429 >= var3) {
                                return;
                            }
                            this.field1429 = var3 + var3 - 1 - this.field1429;
                            this.field1421 = -this.field1421;
                            if (--this.field1427 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1429 < var4) {
                                return;
                            }
                            this.field1429 = var4 + var4 - 1 - this.field1429;
                            this.field1421 = -this.field1421;
                            if (--this.field1427 == 0) {
                                break;
                            }
                            if (this.field1429 >= var3) {
                                return;
                            }
                            this.field1429 = var3 + var3 - 1 - this.field1429;
                            this.field1421 = -this.field1421;
                        } while (--this.field1427 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1421 < 0) {
                            if (this.field1429 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1429) / var6;
                            if (var7 >= this.field1427) {
                                this.field1429 += this.field1427 * var6;
                                this.field1427 = 0;
                                break label153;
                            }
                            this.field1429 += var6 * var7;
                            this.field1427 -= var7;
                        } else if (this.field1429 >= var4) {
                            int var8 = (this.field1429 - var3) / var6;
                            if (var8 >= this.field1427) {
                                this.field1429 -= this.field1427 * var6;
                                this.field1427 = 0;
                                break label153;
                            }
                            this.field1429 -= var6 * var8;
                            this.field1427 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1421 < 0) {
                if (this.field1429 < 0) {
                    this.field1429 = -1;
                    this.method2093();
                    this.method3733();
                }
            } else if (this.field1429 >= var5) {
                this.field1429 = var5;
                this.method2093();
                this.method3733();
            }
        } else if (this.field1422) {
            if (this.field1421 < 0) {
                if (this.field1429 >= var3) {
                    return;
                }
                this.field1429 = var3 + var3 - 1 - this.field1429;
                this.field1421 = -this.field1421;
            }
            while (this.field1429 >= var4) {
                this.field1429 = var4 + var4 - 1 - this.field1429;
                this.field1421 = -this.field1421;
                if (this.field1429 >= var3) {
                    return;
                }
                this.field1429 = var3 + var3 - 1 - this.field1429;
                this.field1421 = -this.field1421;
            }
        } else if (this.field1421 < 0) {
            if (this.field1429 >= var3) {
                return;
            }
            this.field1429 = var4 - 1 - (var4 - 1 - this.field1429) % var6;
        } else if (this.field1429 >= var4) {
            this.field1429 = (this.field1429 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("da.aw([IIIII)I")
    public int method2110(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1431 > 0) {
                int var6 = this.field1431 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1431 += arg1;
                if (this.field1421 == 256 && (this.field1429 & 0xFF) == 0) {
                    if (Statics.field1375) {
                        arg1 = method2120(0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, this.field1433, this.field1434, 0, var6, arg2, this);
                    } else {
                        arg1 = method2152(((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, this.field1432, 0, var6, arg2, this);
                    }
                } else if (Statics.field1375) {
                    arg1 = method2102(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, this.field1433, this.field1434, 0, var6, arg2, this, this.field1421, arg4);
                } else {
                    arg1 = method2172(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, this.field1432, 0, var6, arg2, this, this.field1421, arg4);
                }
                this.field1431 -= arg1;
                if (this.field1431 != 0) {
                    return arg1;
                }
                if (!this.method2108()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1421 == 256 && (this.field1429 & 0xFF) == 0) {
                if (Statics.field1375) {
                    return method2114(0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, 0, arg3, arg2, this);
                }
                return method2113(((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, 0, arg3, arg2, this);
            }
            if (Statics.field1375) {
                return method2084(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, 0, arg3, arg2, this, this.field1421, arg4);
            }
            return method2127(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, 0, arg3, arg2, this, this.field1421, arg4);
        }
    }

    @ObfuscatedName("da.al([IIIII)I")
    public int method2134(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1431 > 0) {
                int var6 = this.field1431 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1431 += arg1;
                if (this.field1421 == -256 && (this.field1429 & 0xFF) == 0) {
                    if (Statics.field1375) {
                        arg1 = method2112(0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, this.field1433, this.field1434, 0, var6, arg2, this);
                    } else {
                        arg1 = method2121(((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, this.field1432, 0, var6, arg2, this);
                    }
                } else if (Statics.field1375) {
                    arg1 = method2179(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, this.field1433, this.field1434, 0, var6, arg2, this, this.field1421, arg4);
                } else {
                    arg1 = method2125(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, this.field1432, 0, var6, arg2, this, this.field1421, arg4);
                }
                this.field1431 -= arg1;
                if (this.field1431 != 0) {
                    return arg1;
                }
                if (!this.method2108()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1421 == -256 && (this.field1429 & 0xFF) == 0) {
                if (Statics.field1375) {
                    return method2165(0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, 0, arg3, arg2, this);
                }
                return method2115(((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, 0, arg3, arg2, this);
            }
            if (Statics.field1375) {
                return method2086(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1425, this.field1426, 0, arg3, arg2, this, this.field1421, arg4);
            }
            return method2117(0, 0, ((class96) this.field1449).field1338, arg0, this.field1429, arg1, this.field1420, 0, arg3, arg2, this, this.field1421, arg4);
        }
    }

    @ObfuscatedName("da.ar()Z")
    public boolean method2108() {
        int var1 = this.field1424;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2099(var1, this.field1423);
            var2 = method2207(var1, this.field1423);
        }
        if (this.field1420 != var1 || this.field1425 != var3 || this.field1426 != var2) {
            if (this.field1420 < var1) {
                this.field1432 = 1;
                this.field1431 = var1 - this.field1420;
            } else if (this.field1420 > var1) {
                this.field1432 = -1;
                this.field1431 = this.field1420 - var1;
            } else {
                this.field1432 = 0;
            }
            if (this.field1425 < var3) {
                this.field1433 = 1;
                if (this.field1431 == 0 || this.field1431 > var3 - this.field1425) {
                    this.field1431 = var3 - this.field1425;
                }
            } else if (this.field1425 > var3) {
                this.field1433 = -1;
                if (this.field1431 == 0 || this.field1431 > this.field1425 - var3) {
                    this.field1431 = this.field1425 - var3;
                }
            } else {
                this.field1433 = 0;
            }
            if (this.field1426 < var2) {
                this.field1434 = 1;
                if (this.field1431 == 0 || this.field1431 > var2 - this.field1426) {
                    this.field1431 = var2 - this.field1426;
                }
            } else if (this.field1426 > var2) {
                this.field1434 = -1;
                if (this.field1431 == 0 || this.field1431 > this.field1426 - var2) {
                    this.field1431 = this.field1426 - var2;
                }
            } else {
                this.field1434 = 0;
            }
            return false;
        } else if (this.field1424 == Integer.MIN_VALUE) {
            this.field1424 = 0;
            this.field1426 = 0;
            this.field1425 = 0;
            this.field1420 = 0;
            this.method3733();
            return true;
        } else {
            this.method2090();
            return false;
        }
    }

    @ObfuscatedName("da.au([B[IIIIIIILda;)I")
    public static int method2113(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1429 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.av(I[B[IIIIIIIILda;)I")
    public static int method2114(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1429 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.am([B[IIIIIIILda;)I")
    public static int method2115(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class106 arg8) {
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
        arg8.field1429 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("da.ao(I[B[IIIIIIIILda;)I")
    public static int method2165(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10) {
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
        arg10.field1429 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("da.ai(II[B[IIIIIIILda;II)I")
    public static int method2127(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1429 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.ae(II[B[IIIIIIIILda;II)I")
    public static int method2084(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1429 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.as(II[B[IIIIIIILda;II)I")
    public static int method2117(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class106 arg10, int arg11, int arg12) {
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
        arg10.field1429 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bw(II[B[IIIIIIIILda;II)I")
    public static int method2086(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
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
        arg11.field1429 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("da.bg([B[IIIIIIIILda;)I")
    public static int method2152(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1425 += (var14 - arg3) * arg9.field1433;
        arg9.field1426 += (var14 - arg3) * arg9.field1434;
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
        arg9.field1420 = var12 >> 2;
        arg9.field1429 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.bu(I[B[IIIIIIIIIILda;)I")
    public static int method2120(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1420 += (var19 - arg4) * arg12.field1432;
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
        arg12.field1425 = var15 >> 2;
        arg12.field1426 = var16 >> 2;
        arg12.field1429 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bs([B[IIIIIIIILda;)I")
    public static int method2121(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class106 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1425 += (var14 - arg3) * arg9.field1433;
        arg9.field1426 += (var14 - arg3) * arg9.field1434;
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
        arg9.field1420 = var12 >> 2;
        arg9.field1429 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("da.ba(I[B[IIIIIIIIIILda;)I")
    public static int method2112(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class106 arg12) {
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
        arg12.field1420 += (var19 - arg4) * arg12.field1432;
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
        arg12.field1425 = var15 >> 2;
        arg12.field1426 = var16 >> 2;
        arg12.field1429 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("da.bt(II[B[IIIIIIIILda;II)I")
    public static int method2172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1425 -= arg11.field1433 * arg5;
        arg11.field1426 -= arg11.field1434 * arg5;
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
        arg11.field1425 += arg11.field1433 * arg5;
        arg11.field1426 += arg11.field1434 * arg5;
        arg11.field1420 = arg6;
        arg11.field1429 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.br(II[B[IIIIIIIIIILda;II)I")
    public static int method2102(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1420 -= arg13.field1432 * arg5;
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
        arg13.field1420 += arg13.field1432 * var27;
        arg13.field1425 = arg6;
        arg13.field1426 = arg7;
        arg13.field1429 = arg4;
        return var27;
    }

    @ObfuscatedName("da.bq(II[B[IIIIIIIILda;II)I")
    public static int method2125(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class106 arg11, int arg12, int arg13) {
        arg11.field1425 -= arg11.field1433 * arg5;
        arg11.field1426 -= arg11.field1434 * arg5;
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
        arg11.field1425 += arg11.field1433 * arg5;
        arg11.field1426 += arg11.field1434 * arg5;
        arg11.field1420 = arg6;
        arg11.field1429 = arg4;
        return arg5;
    }

    @ObfuscatedName("da.bp(II[B[IIIIIIIIIILda;II)I")
    public static int method2179(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14, int arg15) {
        arg13.field1420 -= arg13.field1432 * arg5;
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
        arg13.field1420 += arg13.field1432 * var26;
        arg13.field1425 = arg6;
        arg13.field1426 = arg7;
        arg13.field1429 = arg4;
        return var26;
    }
}
