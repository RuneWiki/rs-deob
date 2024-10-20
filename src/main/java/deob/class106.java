package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dd")
public class class106 {

    @ObfuscatedName("dd.y")
    public int[] field1391;

    @ObfuscatedName("dd.p")
    public class116 field1388;

    @ObfuscatedName("dd.b")
    public int field1385 = 32;

    @ObfuscatedName("dd.g")
    public long field1386 = class297.method4369();

    @ObfuscatedName("dd.e")
    public int field1393;

    @ObfuscatedName("dd.z")
    public int field1400;

    @ObfuscatedName("dd.a")
    public int field1389;

    @ObfuscatedName("dd.w")
    public long field1390 = 0L;

    @ObfuscatedName("dd.l")
    public int field1380 = 0;

    @ObfuscatedName("dd.h")
    public int field1392 = 0;

    @ObfuscatedName("dd.v")
    public int field1394 = 0;

    @ObfuscatedName("dd.m")
    public long field1387 = 0L;

    @ObfuscatedName("dd.o")
    public boolean field1395 = true;

    @ObfuscatedName("dd.aj")
    public int field1396 = 0;

    @ObfuscatedName("dd.an")
    public class116[] field1397 = new class116[8];

    @ObfuscatedName("dd.at")
    public class116[] field1398 = new class116[8];

    @ObfuscatedName("df.l(Lct;B)V")
    public static final void method2709(class100 arg0) {
        Statics.field502 = arg0;
    }

    @ObfuscatedName("hh.h(IZII)V")
    public static final void method3754(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1384 = arg0;
        Statics.field1381 = arg1;
        Statics.field1599 = arg2;
    }

    @ObfuscatedName("kv.v(Lfu;III)Ldd;")
    public static final class106 method5361(class167 arg0, int arg1, int arg2) {
        if (Statics.field1384 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field502.method667();
                var3.field1391 = new int[(Statics.field1381 ? 2 : 1) * 256];
                var3.field1400 = arg2;
                var3.method700();
                var3.field1393 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1393 > 16384) {
                    var3.field1393 = 16384;
                }
                var3.method706(var3.field1393);
                if (Statics.field1599 > 0 && Statics.field2314 == null) {
                    Statics.field2314 = new class108();
                    Statics.field36 = Executors.newScheduledThreadPool(1);
                    Statics.field36.scheduleAtFixedRate(Statics.field2314, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2314 != null) {
                    if (Statics.field2314.field1417[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2314.field1417[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.m(Ldz;I)V")
    public final synchronized void method2216(class116 arg0) {
        this.field1388 = arg0;
    }

    @ObfuscatedName("dd.o(I)V")
    public final synchronized void method2208() {
        if (this.field1391 == null) {
            return;
        }
        long var1 = class297.method4369();
        try {
            if (this.field1390 != 0L) {
                if (var1 < this.field1390) {
                    return;
                }
                this.method706(this.field1393);
                this.field1390 = 0L;
                this.field1395 = true;
            }
            int var3 = this.method692();
            if (this.field1394 - var3 > this.field1380) {
                this.field1380 = this.field1394 - var3;
            }
            int var4 = this.field1400 + this.field1389;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1393) {
                this.field1393 += 1024;
                if (this.field1393 > 16384) {
                    this.field1393 = 16384;
                }
                this.method694();
                this.method706(this.field1393);
                var3 = 0;
                this.field1395 = true;
                if (var4 + 256 > this.field1393) {
                    var4 = this.field1393 - 256;
                    this.field1389 = var4 - this.field1400;
                }
            }
            while (var3 < var4) {
                this.method2213(this.field1391, 256);
                this.method693();
                var3 += 256;
            }
            if (var1 > this.field1387) {
                if (this.field1395) {
                    this.field1395 = false;
                } else if (this.field1380 == 0 && this.field1392 == 0) {
                    this.method694();
                    this.field1390 = var1 + 2000L;
                    return;
                } else {
                    this.field1389 = Math.min(this.field1392, this.field1380);
                    this.field1392 = this.field1380;
                }
                this.field1380 = 0;
                this.field1387 = var1 + 2000L;
            }
            this.field1394 = var3;
        } catch (Exception var8) {
            this.method694();
            this.field1390 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1386 + 500000L) {
                var1 = this.field1386;
            }
            while (var1 > this.field1386 + 5000L) {
                this.method2212(256);
                this.field1386 += (long) (256000 / Statics.field1384);
            }
        } catch (Exception var7) {
            this.field1386 = var1;
        }
    }

    @ObfuscatedName("dd.av(I)V")
    public final void method2247() {
        this.field1395 = true;
    }

    @ObfuscatedName("dd.am(B)V")
    public final synchronized void method2238() {
        this.field1395 = true;
        try {
            this.method695();
        } catch (Exception var2) {
            this.method694();
            this.field1390 = class297.method4369() + 2000L;
        }
    }

    @ObfuscatedName("dd.ai(I)V")
    public final synchronized void method2211() {
        if (Statics.field2314 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2314.field1417[var2] == this) {
                    Statics.field2314.field1417[var2] = null;
                }
                if (Statics.field2314.field1417[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field36.shutdownNow();
                Statics.field36 = null;
                Statics.field2314 = null;
            }
        }
        this.method694();
        this.field1391 = null;
    }

    @ObfuscatedName("dd.af(II)V")
    public final void method2212(int arg0) {
        this.field1396 -= arg0;
        if (this.field1396 < 0) {
            this.field1396 = 0;
        }
        if (this.field1388 != null) {
            this.field1388.method2106(arg0);
        }
    }

    @ObfuscatedName("dd.az([II)V")
    public final void method2213(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1381) {
            var3 = arg1 << 1;
        }
        class301.method5283(arg0, 0, var3);
        this.field1396 -= arg1;
        if (this.field1388 != null && this.field1396 <= 0) {
            this.field1396 += Statics.field1384 >> 4;
            method341(this.field1388);
            this.method2214(this.field1388, this.field1388.method2330());
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
                        class116 var11 = this.field1397[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class119 var12 = var11.field1481;
                                if (var12 == null || var12.field1512 <= var8) {
                                    var11.field1478 = true;
                                    int var13 = var11.method2095();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1512 += var13;
                                    }
                                    if (var4 >= this.field1385) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2093();
                                    if (var14 != null) {
                                        int var15 = var11.field1479;
                                        while (var14 != null) {
                                            this.method2214(var14, var15 * var14.method2330() >> 8);
                                            var14 = var11.method2094();
                                        }
                                    }
                                    class116 var16 = var11.field1480;
                                    var11.field1480 = null;
                                    if (var10 == null) {
                                        this.field1397[var7] = var16;
                                    } else {
                                        var10.field1480 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1398[var7] = var10;
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
                class116 var18 = this.field1397[var17];
                class116[] var19 = this.field1397;
                this.field1398[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class116 var21 = var18.field1480;
                    var18.field1480 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1396 < 0) {
            this.field1396 = 0;
        }
        if (this.field1388 != null) {
            this.field1388.method2096(arg0, 0, arg1);
        }
        this.field1386 = class297.method4369();
    }

    @ObfuscatedName("av.aj(Ldz;S)V")
    public static final void method341(class116 arg0) {
        arg0.field1478 = false;
        if (arg0.field1481 != null) {
            arg0.field1481.field1512 = 0;
        }
        for (class116 var1 = arg0.method2093(); var1 != null; var1 = arg0.method2094()) {
            method341(var1);
        }
    }

    @ObfuscatedName("dd.an(Ldz;II)V")
    public final void method2214(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1398[var3];
        if (var4 == null) {
            this.field1397[var3] = arg0;
        } else {
            var4.field1480 = arg0;
        }
        this.field1398[var3] = arg0;
        arg0.field1479 = arg1;
    }

    @ObfuscatedName("dd.s(B)V")
    public void method700() throws Exception {
    }

    @ObfuscatedName("dd.j(II)V")
    public void method706(int arg0) throws Exception {
    }

    @ObfuscatedName("dd.i(I)I")
    public int method692() throws Exception {
        return this.field1393;
    }

    @ObfuscatedName("dd.k()V")
    public void method693() throws Exception {
    }

    @ObfuscatedName("dd.u(I)V")
    public void method694() {
    }

    @ObfuscatedName("dd.n(I)V")
    public void method695() throws Exception {
    }
}
