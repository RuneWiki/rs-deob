package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dh")
public class class106 {

    @ObfuscatedName("dh.s")
    public int[] field1373;

    @ObfuscatedName("dh.p")
    public class116 field1390;

    @ObfuscatedName("dh.e")
    public int field1376 = 32;

    @ObfuscatedName("dh.i")
    public long field1372 = Statics.method2303();

    @ObfuscatedName("dh.q")
    public int field1377;

    @ObfuscatedName("dh.y")
    public int field1378;

    @ObfuscatedName("dh.r")
    public int field1381;

    @ObfuscatedName("dh.k")
    public long field1380 = 0L;

    @ObfuscatedName("dh.w")
    public int field1375 = 0;

    @ObfuscatedName("dh.m")
    public int field1382 = 0;

    @ObfuscatedName("dh.o")
    public int field1383 = 0;

    @ObfuscatedName("dh.a")
    public long field1384 = 0L;

    @ObfuscatedName("dh.b")
    public boolean field1391 = true;

    @ObfuscatedName("dh.al")
    public int field1388 = 0;

    @ObfuscatedName("dh.as")
    public class116[] field1389 = new class116[8];

    @ObfuscatedName("dh.ad")
    public class116[] field1374 = new class116[8];

    @ObfuscatedName("ca.ag(IZII)V")
    public static final void method1929(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field29 = arg0;
        Statics.field1385 = arg1;
        Statics.field41 = arg2;
    }

    @ObfuscatedName("cx.at(Lfq;IIB)Ldh;")
    public static final class106 method2095(class167 arg0, int arg1, int arg2) {
        if (Statics.field29 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field1088.method678();
                var3.field1373 = new int[256 * (Statics.field1385 ? 2 : 1)];
                var3.field1378 = arg2;
                var3.method705();
                var3.field1377 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1377 > 16384) {
                    var3.field1377 = 16384;
                }
                var3.method706(var3.field1377);
                if (Statics.field41 > 0 && Statics.field3643 == null) {
                    Statics.field3643 = new class108();
                    Statics.field1407 = Executors.newScheduledThreadPool(1);
                    Statics.field1407.scheduleAtFixedRate(Statics.field3643, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3643 != null) {
                    if (Statics.field3643.field1405[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3643.field1405[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.ao(Ldg;B)V")
    public final synchronized void method2233(class116 arg0) {
        this.field1390 = arg0;
    }

    @ObfuscatedName("dh.av(I)V")
    public final synchronized void method2266() {
        if (this.field1373 == null) {
            return;
        }
        long var1 = Statics.method2303();
        try {
            if (this.field1380 != 0L) {
                if (var1 < this.field1380) {
                    return;
                }
                this.method706(this.field1377);
                this.field1380 = 0L;
                this.field1391 = true;
            }
            int var3 = this.method707();
            if (this.field1383 - var3 > this.field1375) {
                this.field1375 = this.field1383 - var3;
            }
            int var4 = this.field1381 + this.field1378;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1377) {
                this.field1377 += 1024;
                if (this.field1377 > 16384) {
                    this.field1377 = 16384;
                }
                this.method709();
                this.method706(this.field1377);
                var3 = 0;
                this.field1391 = true;
                if (var4 + 256 > this.field1377) {
                    var4 = this.field1377 - 256;
                    this.field1381 = var4 - this.field1378;
                }
            }
            while (var3 < var4) {
                this.method2238(this.field1373, 256);
                this.method718();
                var3 += 256;
            }
            if (var1 > this.field1384) {
                if (this.field1391) {
                    this.field1391 = false;
                } else if (this.field1375 == 0 && this.field1382 == 0) {
                    this.method709();
                    this.field1380 = var1 + 2000L;
                    return;
                } else {
                    this.field1381 = Math.min(this.field1382, this.field1375);
                    this.field1382 = this.field1375;
                }
                this.field1375 = 0;
                this.field1384 = var1 + 2000L;
            }
            this.field1383 = var3;
        } catch (Exception var8) {
            this.method709();
            this.field1380 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1372 + 500000L) {
                var1 = this.field1372;
            }
            while (var1 > this.field1372 + 5000L) {
                this.method2265(256);
                this.field1372 += (long) (256000 / Statics.field29);
            }
        } catch (Exception var7) {
            this.field1372 = var1;
        }
    }

    @ObfuscatedName("dh.an(B)V")
    public final void method2234() {
        this.field1391 = true;
    }

    @ObfuscatedName("dh.al(B)V")
    public final synchronized void method2267() {
        this.field1391 = true;
        try {
            this.method710();
        } catch (Exception var2) {
            this.method709();
            this.field1380 = Statics.method2303() + 2000L;
        }
    }

    @ObfuscatedName("dh.as(B)V")
    public final synchronized void method2236() {
        if (Statics.field3643 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3643.field1405[var2] == this) {
                    Statics.field3643.field1405[var2] = null;
                }
                if (Statics.field3643.field1405[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1407.shutdownNow();
                Statics.field1407 = null;
                Statics.field3643 = null;
            }
        }
        this.method709();
        this.field1373 = null;
    }

    @ObfuscatedName("dh.ad(II)V")
    public final void method2265(int arg0) {
        this.field1388 -= arg0;
        if (this.field1388 < 0) {
            this.field1388 = 0;
        }
        if (this.field1390 != null) {
            this.field1390.method2139(arg0);
        }
    }

    @ObfuscatedName("dh.ap([II)V")
    public final void method2238(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1385) {
            var3 = arg1 << 1;
        }
        class301.method5352(arg0, 0, var3);
        this.field1388 -= arg1;
        if (this.field1390 != null && this.field1388 <= 0) {
            this.field1388 += Statics.field29 >> 4;
            method3805(this.field1390);
            this.method2239(this.field1390, this.field1390.method2332());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class116 var10 = null;
                        class116 var11 = this.field1389[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class119 var12 = var11.field1462;
                                if (var12 == null || var12.field1494 <= var8) {
                                    var11.field1463 = true;
                                    int var13 = var11.method2120();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1494 += var13;
                                    }
                                    if (var4 >= this.field1376) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2118();
                                    if (var14 != null) {
                                        int var15 = var11.field1460;
                                        while (var14 != null) {
                                            this.method2239(var14, var15 * var14.method2332() >> 8);
                                            var14 = var11.method2119();
                                        }
                                    }
                                    class116 var16 = var11.field1461;
                                    var11.field1461 = null;
                                    if (var10 == null) {
                                        this.field1389[var7] = var16;
                                    } else {
                                        var10.field1461 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1374[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1461;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class116 var18 = this.field1389[var17];
                class116[] var19 = this.field1389;
                this.field1374[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class116 var21 = var18.field1461;
                    var18.field1461 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1388 < 0) {
            this.field1388 = 0;
        }
        if (this.field1390 != null) {
            this.field1390.method2121(arg0, 0, arg1);
        }
        this.field1372 = Statics.method2303();
    }

    @ObfuscatedName("hn.ax(Ldg;I)V")
    public static final void method3805(class116 arg0) {
        arg0.field1463 = false;
        if (arg0.field1462 != null) {
            arg0.field1462.field1494 = 0;
        }
        for (class116 var1 = arg0.method2118(); var1 != null; var1 = arg0.method2119()) {
            method3805(var1);
        }
    }

    @ObfuscatedName("dh.aj(Ldg;IB)V")
    public final void method2239(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1374[var3];
        if (var4 == null) {
            this.field1389[var3] = arg0;
        } else {
            var4.field1461 = arg0;
        }
        this.field1374[var3] = arg0;
        arg0.field1460 = arg1;
    }

    @ObfuscatedName("dh.c(I)V")
    public void method705() throws Exception {
    }

    @ObfuscatedName("dh.x(IB)V")
    public void method706(int arg0) throws Exception {
    }

    @ObfuscatedName("dh.t(I)I")
    public int method707() throws Exception {
        return this.field1377;
    }

    @ObfuscatedName("dh.g()V")
    public void method718() throws Exception {
    }

    @ObfuscatedName("dh.l(I)V")
    public void method709() {
    }

    @ObfuscatedName("dh.u(I)V")
    public void method710() throws Exception {
    }
}
