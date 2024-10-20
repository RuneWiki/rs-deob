package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cg")
public class class103 {

    @ObfuscatedName("cg.m")
    public int[] field1369;

    @ObfuscatedName("cg.v")
    public class113 field1359;

    @ObfuscatedName("cg.r")
    public int field1360 = 32;

    @ObfuscatedName("cg.x")
    public long field1361 = class192.method81();

    @ObfuscatedName("cg.y")
    public int field1354;

    @ObfuscatedName("cg.p")
    public int field1363;

    @ObfuscatedName("cg.k")
    public int field1364;

    @ObfuscatedName("cg.o")
    public long field1365 = 0L;

    @ObfuscatedName("cg.s")
    public int field1366 = 0;

    @ObfuscatedName("cg.u")
    public int field1367 = 0;

    @ObfuscatedName("cg.e")
    public int field1370 = 0;

    @ObfuscatedName("cg.w")
    public long field1376 = 0L;

    @ObfuscatedName("cg.q")
    public boolean field1358 = true;

    @ObfuscatedName("cg.as")
    public int field1371 = 0;

    @ObfuscatedName("cg.ac")
    public class113[] field1372 = new class113[8];

    @ObfuscatedName("cg.an")
    public class113[] field1373 = new class113[8];

    @ObfuscatedName("js.s(Lcb;I)V")
    public static final void method4906(class97 arg0) {
        Statics.field119 = arg0;
    }

    @ObfuscatedName("dl.u(Lfi;III)Lcg;")
    public static final class103 method2288(class162 arg0, int arg1, int arg2) {
        if (Statics.field1374 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class103 var3 = Statics.field119.method683();
                var3.field1369 = new int[256 * (Statics.field1355 ? 2 : 1)];
                var3.field1363 = arg2;
                var3.method710();
                var3.field1354 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1354 > 16384) {
                    var3.field1354 = 16384;
                }
                var3.method711(var3.field1354);
                if (Statics.field3354 > 0 && Statics.field1368 == null) {
                    Statics.field1368 = new class105();
                    Statics.field176 = Executors.newScheduledThreadPool(1);
                    Statics.field176.scheduleAtFixedRate(Statics.field1368, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1368 != null) {
                    if (Statics.field1368.field1389[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1368.field1389[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class103();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cg.aa(Ldv;I)V")
    public final synchronized void method2227(class113 arg0) {
        this.field1359 = arg0;
    }

    @ObfuscatedName("cg.ai(I)V")
    public final synchronized void method2234() {
        if (this.field1369 == null) {
            return;
        }
        long var1 = class192.method81();
        try {
            if (this.field1365 != 0L) {
                if (var1 < this.field1365) {
                    return;
                }
                this.method711(this.field1354);
                this.field1365 = 0L;
                this.field1358 = true;
            }
            int var3 = this.method712();
            if (this.field1370 - var3 > this.field1366) {
                this.field1366 = this.field1370 - var3;
            }
            int var4 = this.field1364 + this.field1363;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1354) {
                this.field1354 += 1024;
                if (this.field1354 > 16384) {
                    this.field1354 = 16384;
                }
                this.method714();
                this.method711(this.field1354);
                var3 = 0;
                this.field1358 = true;
                if (var4 + 256 > this.field1354) {
                    var4 = this.field1354 - 256;
                    this.field1364 = var4 - this.field1363;
                }
            }
            while (var3 < var4) {
                this.method2233(this.field1369, 256);
                this.method713();
                var3 += 256;
            }
            if (var1 > this.field1376) {
                if (this.field1358) {
                    this.field1358 = false;
                } else if (this.field1366 == 0 && this.field1367 == 0) {
                    this.method714();
                    this.field1365 = var1 + 2000L;
                    return;
                } else {
                    this.field1364 = Math.min(this.field1367, this.field1366);
                    this.field1367 = this.field1366;
                }
                this.field1366 = 0;
                this.field1376 = var1 + 2000L;
            }
            this.field1370 = var3;
        } catch (Exception var8) {
            this.method714();
            this.field1365 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1361 + 500000L) {
                var1 = this.field1361;
            }
            while (var1 > this.field1361 + 5000L) {
                this.method2260(256);
                this.field1361 += (long) (256000 / Statics.field1374);
            }
        } catch (Exception var7) {
            this.field1361 = var1;
        }
    }

    @ObfuscatedName("cg.ag(I)V")
    public final void method2251() {
        this.field1358 = true;
    }

    @ObfuscatedName("cg.at(B)V")
    public final synchronized void method2230() {
        this.field1358 = true;
        try {
            this.method715();
        } catch (Exception var2) {
            this.method714();
            this.field1365 = class192.method81() + 2000L;
        }
    }

    @ObfuscatedName("cg.ad(I)V")
    public final synchronized void method2261() {
        if (Statics.field1368 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1368.field1389[var2] == this) {
                    Statics.field1368.field1389[var2] = null;
                }
                if (Statics.field1368.field1389[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field176.shutdownNow();
                Statics.field176 = null;
                Statics.field1368 = null;
            }
        }
        this.method714();
        this.field1369 = null;
    }

    @ObfuscatedName("cg.as(II)V")
    public final void method2260(int arg0) {
        this.field1371 -= arg0;
        if (this.field1371 < 0) {
            this.field1371 = 0;
        }
        if (this.field1359 != null) {
            this.field1359.method2100(arg0);
        }
    }

    @ObfuscatedName("cg.ac([II)V")
    public final void method2233(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1355) {
            var3 = arg1 << 1;
        }
        class201.method3828(arg0, 0, var3);
        this.field1371 -= arg1;
        if (this.field1359 != null && this.field1371 <= 0) {
            this.field1371 += Statics.field1374 >> 4;
            method5073(this.field1359);
            this.method2238(this.field1359, this.field1359.method2324());
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
                        class113 var10 = null;
                        class113 var11 = this.field1372[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class116 var12 = var11.field1449;
                                if (var12 == null || var12.field1481 <= var8) {
                                    var11.field1450 = true;
                                    int var13 = var11.method2122();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1481 += var13;
                                    }
                                    if (var4 >= this.field1360) {
                                        break label105;
                                    }
                                    class113 var14 = var11.method2128();
                                    if (var14 != null) {
                                        int var15 = var11.field1448;
                                        while (var14 != null) {
                                            this.method2238(var14, var15 * var14.method2324() >> 8);
                                            var14 = var11.method2093();
                                        }
                                    }
                                    class113 var16 = var11.field1447;
                                    var11.field1447 = null;
                                    if (var10 == null) {
                                        this.field1372[var7] = var16;
                                    } else {
                                        var10.field1447 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1373[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1447;
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
                class113 var18 = this.field1372[var17];
                class113[] var19 = this.field1372;
                this.field1373[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class113 var21 = var18.field1447;
                    var18.field1447 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1371 < 0) {
            this.field1371 = 0;
        }
        if (this.field1359 != null) {
            this.field1359.method2098(arg0, 0, arg1);
        }
        this.field1361 = class192.method81();
    }

    @ObfuscatedName("jd.an(Ldv;I)V")
    public static final void method5073(class113 arg0) {
        arg0.field1450 = false;
        if (arg0.field1449 != null) {
            arg0.field1449.field1481 = 0;
        }
        for (class113 var1 = arg0.method2128(); var1 != null; var1 = arg0.method2093()) {
            method5073(var1);
        }
    }

    @ObfuscatedName("cg.ak(Ldv;IS)V")
    public final void method2238(class113 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class113 var4 = this.field1373[var3];
        if (var4 == null) {
            this.field1372[var3] = arg0;
        } else {
            var4.field1447 = arg0;
        }
        this.field1373[var3] = arg0;
        arg0.field1448 = arg1;
    }

    @ObfuscatedName("cg.n(B)V")
    public void method710() throws Exception {
    }

    @ObfuscatedName("cg.h(II)V")
    public void method711(int arg0) throws Exception {
    }

    @ObfuscatedName("cg.l(I)I")
    public int method712() throws Exception {
        return this.field1354;
    }

    @ObfuscatedName("cg.g()V")
    public void method713() throws Exception {
    }

    @ObfuscatedName("cg.b(B)V")
    public void method714() {
    }

    @ObfuscatedName("cg.a(B)V")
    public void method715() throws Exception {
    }
}
