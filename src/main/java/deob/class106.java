package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("de")
public class class106 {

    @ObfuscatedName("de.e")
    public int[] field1392;

    @ObfuscatedName("de.n")
    public class116 field1398;

    @ObfuscatedName("de.r")
    public int field1397 = 32;

    @ObfuscatedName("de.c")
    public long field1400 = class297.method3217();

    @ObfuscatedName("de.a")
    public int field1401;

    @ObfuscatedName("de.d")
    public int field1402;

    @ObfuscatedName("de.s")
    public int field1403;

    @ObfuscatedName("de.t")
    public long field1406 = 0L;

    @ObfuscatedName("de.m")
    public int field1407 = 0;

    @ObfuscatedName("de.v")
    public int field1405 = 0;

    @ObfuscatedName("de.q")
    public int field1394 = 0;

    @ObfuscatedName("de.l")
    public long field1408 = 0L;

    @ObfuscatedName("de.j")
    public boolean field1399 = true;

    @ObfuscatedName("de.ao")
    public int field1410 = 0;

    @ObfuscatedName("de.aw")
    public class116[] field1411 = new class116[8];

    @ObfuscatedName("de.ak")
    public class116[] field1412 = new class116[8];

    @ObfuscatedName("am.l(Lcf;I)V")
    public static final void method369(class100 arg0) {
        Statics.field1099 = arg0;
    }

    @ObfuscatedName("o.j(IZII)V")
    public static final void method150(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1275 = arg0;
        Statics.field1409 = arg1;
        Statics.field2115 = arg2;
    }

    @ObfuscatedName("bl.ad(Lfu;III)Lde;")
    public static final class106 method1596(class167 arg0, int arg1, int arg2) {
        if (Statics.field1275 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field1099.method709();
                var3.field1392 = new int[256 * (Statics.field1409 ? 2 : 1)];
                var3.field1402 = arg2;
                var3.method732();
                var3.field1401 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1401 > 16384) {
                    var3.field1401 = 16384;
                }
                var3.method740(var3.field1401);
                if (Statics.field2115 > 0 && Statics.field1395 == null) {
                    Statics.field1395 = new class108();
                    Statics.field1404 = Executors.newScheduledThreadPool(1);
                    Statics.field1404.scheduleAtFixedRate(Statics.field1395, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1395 != null) {
                    if (Statics.field1395.field1427[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1395.field1427[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.am(Ldt;B)V")
    public final synchronized void method2235(class116 arg0) {
        this.field1398 = arg0;
    }

    @ObfuscatedName("de.ai(I)V")
    public final synchronized void method2236() {
        if (this.field1392 == null) {
            return;
        }
        long var1 = class297.method3217();
        try {
            if (this.field1406 != 0L) {
                if (var1 < this.field1406) {
                    return;
                }
                this.method740(this.field1401);
                this.field1406 = 0L;
                this.field1399 = true;
            }
            int var3 = this.method734();
            if (this.field1394 - var3 > this.field1407) {
                this.field1407 = this.field1394 - var3;
            }
            int var4 = this.field1403 + this.field1402;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1401) {
                this.field1401 += 1024;
                if (this.field1401 > 16384) {
                    this.field1401 = 16384;
                }
                this.method744();
                this.method740(this.field1401);
                var3 = 0;
                this.field1399 = true;
                if (var4 + 256 > this.field1401) {
                    var4 = this.field1401 - 256;
                    this.field1403 = var4 - this.field1402;
                }
            }
            while (var3 < var4) {
                this.method2241(this.field1392, 256);
                this.method738();
                var3 += 256;
            }
            if (var1 > this.field1408) {
                if (this.field1399) {
                    this.field1399 = false;
                } else if (this.field1407 == 0 && this.field1405 == 0) {
                    this.method744();
                    this.field1406 = var1 + 2000L;
                    return;
                } else {
                    this.field1403 = Math.min(this.field1405, this.field1407);
                    this.field1405 = this.field1407;
                }
                this.field1407 = 0;
                this.field1408 = var1 + 2000L;
            }
            this.field1394 = var3;
        } catch (Exception var8) {
            this.method744();
            this.field1406 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1400 + 500000L) {
                var1 = this.field1400;
            }
            while (var1 > this.field1400 + 5000L) {
                this.method2240(256);
                this.field1400 += (long) (256000 / Statics.field1275);
            }
        } catch (Exception var7) {
            this.field1400 = var1;
        }
    }

    @ObfuscatedName("de.ag(S)V")
    public final void method2243() {
        this.field1399 = true;
    }

    @ObfuscatedName("de.ao(B)V")
    public final synchronized void method2238() {
        this.field1399 = true;
        try {
            this.method736();
        } catch (Exception var2) {
            this.method744();
            this.field1406 = class297.method3217() + 2000L;
        }
    }

    @ObfuscatedName("de.aw(I)V")
    public final synchronized void method2239() {
        if (Statics.field1395 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1395.field1427[var2] == this) {
                    Statics.field1395.field1427[var2] = null;
                }
                if (Statics.field1395.field1427[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1404.shutdownNow();
                Statics.field1404 = null;
                Statics.field1395 = null;
            }
        }
        this.method744();
        this.field1392 = null;
    }

    @ObfuscatedName("de.ak(IB)V")
    public final void method2240(int arg0) {
        this.field1410 -= arg0;
        if (this.field1410 < 0) {
            this.field1410 = 0;
        }
        if (this.field1398 != null) {
            this.field1398.method2121(arg0);
        }
    }

    @ObfuscatedName("de.aa([II)V")
    public final void method2241(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1409) {
            var3 = arg1 << 1;
        }
        class301.method5367(arg0, 0, var3);
        this.field1410 -= arg1;
        if (this.field1398 != null && this.field1410 <= 0) {
            this.field1410 += Statics.field1275 >> 4;
            method9(this.field1398);
            this.method2242(this.field1398, this.field1398.method2366());
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
                                class119 var12 = var11.field1486;
                                if (var12 == null || var12.field1518 <= var8) {
                                    var11.field1487 = true;
                                    int var13 = var11.method2110();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1518 += var13;
                                    }
                                    if (var4 >= this.field1397) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2116();
                                    if (var14 != null) {
                                        int var15 = var11.field1484;
                                        while (var14 != null) {
                                            this.method2242(var14, var15 * var14.method2366() >> 8);
                                            var14 = var11.method2117();
                                        }
                                    }
                                    class116 var16 = var11.field1485;
                                    var11.field1485 = null;
                                    if (var10 == null) {
                                        this.field1411[var7] = var16;
                                    } else {
                                        var10.field1485 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1412[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1485;
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
                    class116 var21 = var18.field1485;
                    var18.field1485 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1410 < 0) {
            this.field1410 = 0;
        }
        if (this.field1398 != null) {
            this.field1398.method2119(arg0, 0, arg1);
        }
        this.field1400 = class297.method3217();
    }

    @ObfuscatedName("f.ab(Ldt;B)V")
    public static final void method9(class116 arg0) {
        arg0.field1487 = false;
        if (arg0.field1486 != null) {
            arg0.field1486.field1518 = 0;
        }
        for (class116 var1 = arg0.method2116(); var1 != null; var1 = arg0.method2117()) {
            method9(var1);
        }
    }

    @ObfuscatedName("de.ar(Ldt;II)V")
    public final void method2242(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1412[var3];
        if (var4 == null) {
            this.field1411[var3] = arg0;
        } else {
            var4.field1485 = arg0;
        }
        this.field1412[var3] = arg0;
        arg0.field1484 = arg1;
    }

    @ObfuscatedName("de.u(I)V")
    public void method732() throws Exception {
    }

    @ObfuscatedName("de.f(IB)V")
    public void method740(int arg0) throws Exception {
    }

    @ObfuscatedName("de.b(B)I")
    public int method734() throws Exception {
        return this.field1401;
    }

    @ObfuscatedName("de.g()V")
    public void method738() throws Exception {
    }

    @ObfuscatedName("de.z(I)V")
    public void method744() {
    }

    @ObfuscatedName("de.p(B)V")
    public void method736() throws Exception {
    }
}
