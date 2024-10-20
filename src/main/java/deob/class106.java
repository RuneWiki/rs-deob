package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dw")
public class class106 {

    @ObfuscatedName("dw.n")
    public int[] field1393;

    @ObfuscatedName("dw.x")
    public class116 field1403;

    @ObfuscatedName("dw.w")
    public int field1398 = 32;

    @ObfuscatedName("dw.k")
    public long field1396 = Statics.method184();

    @ObfuscatedName("dw.q")
    public int field1401;

    @ObfuscatedName("dw.z")
    public int field1402;

    @ObfuscatedName("dw.y")
    public int field1404;

    @ObfuscatedName("dw.f")
    public long field1397 = 0L;

    @ObfuscatedName("dw.b")
    public int field1405 = 0;

    @ObfuscatedName("dw.r")
    public int field1406 = 0;

    @ObfuscatedName("dw.s")
    public int field1407 = 0;

    @ObfuscatedName("dw.a")
    public long field1408 = 0L;

    @ObfuscatedName("dw.u")
    public boolean field1409 = true;

    @ObfuscatedName("dw.au")
    public int field1410 = 0;

    @ObfuscatedName("dw.ay")
    public class116[] field1411 = new class116[8];

    @ObfuscatedName("dw.aa")
    public class116[] field1412 = new class116[8];

    @ObfuscatedName("eo.ae(Lcx;I)V")
    public static final void method3163(class100 arg0) {
        Statics.field1400 = arg0;
    }

    @ObfuscatedName("x.af(IZIB)V")
    public static final void method153(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1399 = arg0;
        Statics.field1394 = arg1;
        Statics.field46 = arg2;
    }

    @ObfuscatedName("aq.az(Lff;III)Ldw;")
    public static final class106 method529(class167 arg0, int arg1, int arg2) {
        if (Statics.field1399 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field1400.method707();
                var3.field1393 = new int[(Statics.field1394 ? 2 : 1) * 256];
                var3.field1402 = arg2;
                var3.method723();
                var3.field1401 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1401 > 16384) {
                    var3.field1401 = 16384;
                }
                var3.method741(var3.field1401);
                if (Statics.field46 > 0 && Statics.field3818 == null) {
                    Statics.field3818 = new class108();
                    Statics.field1888 = Executors.newScheduledThreadPool(1);
                    Statics.field1888.scheduleAtFixedRate(Statics.field3818, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3818 != null) {
                    if (Statics.field3818.field1425[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3818.field1425[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.ax(Ldn;I)V")
    public final synchronized void method2286(class116 arg0) {
        this.field1403 = arg0;
    }

    @ObfuscatedName("dw.aj(I)V")
    public final synchronized void method2290() {
        if (this.field1393 == null) {
            return;
        }
        long var1 = Statics.method184();
        try {
            if (this.field1397 != 0L) {
                if (var1 < this.field1397) {
                    return;
                }
                this.method741(this.field1401);
                this.field1397 = 0L;
                this.field1409 = true;
            }
            int var3 = this.method725();
            if (this.field1407 - var3 > this.field1405) {
                this.field1405 = this.field1407 - var3;
            }
            int var4 = this.field1404 + this.field1402;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1401) {
                this.field1401 += 1024;
                if (this.field1401 > 16384) {
                    this.field1401 = 16384;
                }
                this.method738();
                this.method741(this.field1401);
                var3 = 0;
                this.field1409 = true;
                if (var4 + 256 > this.field1401) {
                    var4 = this.field1401 - 256;
                    this.field1404 = var4 - this.field1402;
                }
            }
            while (var3 < var4) {
                this.method2313(this.field1393, 256);
                this.method726();
                var3 += 256;
            }
            if (var1 > this.field1408) {
                if (this.field1409) {
                    this.field1409 = false;
                } else if (this.field1405 == 0 && this.field1406 == 0) {
                    this.method738();
                    this.field1397 = var1 + 2000L;
                    return;
                } else {
                    this.field1404 = Math.min(this.field1406, this.field1405);
                    this.field1406 = this.field1405;
                }
                this.field1405 = 0;
                this.field1408 = var1 + 2000L;
            }
            this.field1407 = var3;
        } catch (Exception var8) {
            this.method738();
            this.field1397 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1396 + 500000L) {
                var1 = this.field1396;
            }
            while (var1 > this.field1396 + 5000L) {
                this.method2292(256);
                this.field1396 += (long) (256000 / Statics.field1399);
            }
        } catch (Exception var7) {
            this.field1396 = var1;
        }
    }

    @ObfuscatedName("dw.au(I)V")
    public final void method2287() {
        this.field1409 = true;
    }

    @ObfuscatedName("dw.ay(I)V")
    public final synchronized void method2296() {
        this.field1409 = true;
        try {
            this.method728();
        } catch (Exception var2) {
            this.method738();
            this.field1397 = Statics.method184() + 2000L;
        }
    }

    @ObfuscatedName("dw.aa(I)V")
    public final synchronized void method2289() {
        if (Statics.field3818 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3818.field1425[var2] == this) {
                    Statics.field3818.field1425[var2] = null;
                }
                if (Statics.field3818.field1425[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1888.shutdownNow();
                Statics.field1888 = null;
                Statics.field3818 = null;
            }
        }
        this.method738();
        this.field1393 = null;
    }

    @ObfuscatedName("dw.aq(IB)V")
    public final void method2292(int arg0) {
        this.field1410 -= arg0;
        if (this.field1410 < 0) {
            this.field1410 = 0;
        }
        if (this.field1403 != null) {
            this.field1403.method2180(arg0);
        }
    }

    @ObfuscatedName("dw.as([II)V")
    public final void method2313(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1394) {
            var3 = arg1 << 1;
        }
        class302.method5356(arg0, 0, var3);
        this.field1410 -= arg1;
        if (this.field1403 != null && this.field1410 <= 0) {
            this.field1410 += Statics.field1399 >> 4;
            method1103(this.field1403);
            this.method2291(this.field1403, this.field1403.method2382());
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
                        class116 var11 = this.field1411[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class119 var12 = var11.field1478;
                                if (var12 == null || var12.field1512 <= var8) {
                                    var11.field1481 = true;
                                    int var13 = var11.method2161();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1512 += var13;
                                    }
                                    if (var4 >= this.field1398) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2159();
                                    if (var14 != null) {
                                        int var15 = var11.field1479;
                                        while (var14 != null) {
                                            this.method2291(var14, var15 * var14.method2382() >> 8);
                                            var14 = var11.method2160();
                                        }
                                    }
                                    class116 var16 = var11.field1480;
                                    var11.field1480 = null;
                                    if (var10 == null) {
                                        this.field1411[var7] = var16;
                                    } else {
                                        var10.field1480 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1412[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1480;
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
                class116 var18 = this.field1411[var17];
                class116[] var19 = this.field1411;
                this.field1412[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class116 var21 = var18.field1480;
                    var18.field1480 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1410 < 0) {
            this.field1410 = 0;
        }
        if (this.field1403 != null) {
            this.field1403.method2162(arg0, 0, arg1);
        }
        this.field1396 = Statics.method184();
    }

    @ObfuscatedName("bm.ak(Ldn;B)V")
    public static final void method1103(class116 arg0) {
        arg0.field1481 = false;
        if (arg0.field1478 != null) {
            arg0.field1478.field1512 = 0;
        }
        for (class116 var1 = arg0.method2159(); var1 != null; var1 = arg0.method2160()) {
            method1103(var1);
        }
    }

    @ObfuscatedName("dw.ac(Ldn;II)V")
    public final void method2291(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1412[var3];
        if (var4 == null) {
            this.field1411[var3] = arg0;
        } else {
            var4.field1480 = arg0;
        }
        this.field1412[var3] = arg0;
        arg0.field1479 = arg1;
    }

    @ObfuscatedName("dw.c(B)V")
    public void method723() throws Exception {
    }

    @ObfuscatedName("dw.t(II)V")
    public void method741(int arg0) throws Exception {
    }

    @ObfuscatedName("dw.o(I)I")
    public int method725() throws Exception {
        return this.field1401;
    }

    @ObfuscatedName("dw.e()V")
    public void method726() throws Exception {
    }

    @ObfuscatedName("dw.i(I)V")
    public void method738() {
    }

    @ObfuscatedName("dw.g(I)V")
    public void method728() throws Exception {
    }
}
