package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dp")
public class class115 {

    @ObfuscatedName("dp.c")
    public int[] field1427;

    @ObfuscatedName("dp.i")
    public class125 field1424;

    @ObfuscatedName("dp.f")
    public int field1426 = 32;

    @ObfuscatedName("dp.a")
    public long field1430 = class308.method4891();

    @ObfuscatedName("dp.b")
    public int field1435;

    @ObfuscatedName("dp.y")
    public int field1432;

    @ObfuscatedName("dp.r")
    public int field1433;

    @ObfuscatedName("dp.q")
    public long field1434 = 0L;

    @ObfuscatedName("dp.g")
    public int field1428 = 0;

    @ObfuscatedName("dp.s")
    public int field1436 = 0;

    @ObfuscatedName("dp.o")
    public int field1437 = 0;

    @ObfuscatedName("dp.k")
    public long field1438 = 0L;

    @ObfuscatedName("dp.d")
    public boolean field1423 = true;

    @ObfuscatedName("dp.as")
    public int field1440 = 0;

    @ObfuscatedName("dp.ae")
    public class125[] field1441 = new class125[8];

    @ObfuscatedName("dp.ac")
    public class125[] field1429 = new class125[8];

    @ObfuscatedName("ef.aj(Ldw;I)V")
    public static final void method3106(class109 arg0) {
        Statics.field2544 = arg0;
    }

    @ObfuscatedName("aj.ax(IZII)V")
    public static final void method248(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1444 = arg0;
        Statics.field1422 = arg1;
        Statics.field1425 = arg2;
    }

    @ObfuscatedName("fx.ag(Lfa;IIB)Ldp;")
    public static final class115 method3251(class176 arg0, int arg1, int arg2) {
        if (Statics.field1444 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class115 var3 = Statics.field2544.method772();
                var3.field1427 = new int[256 * (Statics.field1422 ? 2 : 1)];
                var3.field1432 = arg2;
                var3.method798();
                var3.field1435 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1435 > 16384) {
                    var3.field1435 = 16384;
                }
                var3.method799(var3.field1435);
                if (Statics.field1425 > 0 && Statics.field1442 == null) {
                    Statics.field1442 = new class117();
                    Statics.field567 = Executors.newScheduledThreadPool(1);
                    Statics.field567.scheduleAtFixedRate(Statics.field1442, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1442 != null) {
                    if (Statics.field1442.field1456[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1442.field1456[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class115();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.au(Ldi;I)V")
    public final synchronized void method2316(class125 arg0) {
        this.field1424 = arg0;
    }

    @ObfuscatedName("dp.as(I)V")
    public final synchronized void method2337() {
        if (this.field1427 == null) {
            return;
        }
        long var1 = class308.method4891();
        try {
            if (this.field1434 != 0L) {
                if (var1 < this.field1434) {
                    return;
                }
                this.method799(this.field1435);
                this.field1434 = 0L;
                this.field1423 = true;
            }
            int var3 = this.method807();
            if (this.field1437 - var3 > this.field1428) {
                this.field1428 = this.field1437 - var3;
            }
            int var4 = this.field1433 + this.field1432;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1435) {
                this.field1435 += 1024;
                if (this.field1435 > 16384) {
                    this.field1435 = 16384;
                }
                this.method802();
                this.method799(this.field1435);
                var3 = 0;
                this.field1423 = true;
                if (var4 + 256 > this.field1435) {
                    var4 = this.field1435 - 256;
                    this.field1433 = var4 - this.field1432;
                }
            }
            while (var3 < var4) {
                this.method2321(this.field1427, 256);
                this.method801();
                var3 += 256;
            }
            if (var1 > this.field1438) {
                if (this.field1423) {
                    this.field1423 = false;
                } else if (this.field1428 == 0 && this.field1436 == 0) {
                    this.method802();
                    this.field1434 = var1 + 2000L;
                    return;
                } else {
                    this.field1433 = Math.min(this.field1436, this.field1428);
                    this.field1436 = this.field1428;
                }
                this.field1428 = 0;
                this.field1438 = var1 + 2000L;
            }
            this.field1437 = var3;
        } catch (Exception var8) {
            this.method802();
            this.field1434 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1430 + 500000L) {
                var1 = this.field1430;
            }
            while (var1 > this.field1430 + 5000L) {
                this.method2320(256);
                this.field1430 += (long) (256000 / Statics.field1444);
            }
        } catch (Exception var7) {
            this.field1430 = var1;
        }
    }

    @ObfuscatedName("dp.ae(I)V")
    public final void method2315() {
        this.field1423 = true;
    }

    @ObfuscatedName("dp.ac(I)V")
    public final synchronized void method2318() {
        this.field1423 = true;
        try {
            this.method804();
        } catch (Exception var2) {
            this.method802();
            this.field1434 = class308.method4891() + 2000L;
        }
    }

    @ObfuscatedName("dp.ak(I)V")
    public final synchronized void method2319() {
        if (Statics.field1442 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1442.field1456[var2] == this) {
                    Statics.field1442.field1456[var2] = null;
                }
                if (Statics.field1442.field1456[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field567.shutdownNow();
                Statics.field567 = null;
                Statics.field1442 = null;
            }
        }
        this.method802();
        this.field1427 = null;
    }

    @ObfuscatedName("dp.av(IB)V")
    public final void method2320(int arg0) {
        this.field1440 -= arg0;
        if (this.field1440 < 0) {
            this.field1440 = 0;
        }
        if (this.field1424 != null) {
            this.field1424.method2197(arg0);
        }
    }

    @ObfuscatedName("dp.aq([II)V")
    public final void method2321(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1422) {
            var3 = arg1 << 1;
        }
        class312.method5367(arg0, 0, var3);
        this.field1440 -= arg1;
        if (this.field1424 != null && this.field1440 <= 0) {
            this.field1440 += Statics.field1444 >> 4;
            method2076(this.field1424);
            this.method2322(this.field1424, this.field1424.method2502());
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
                        class125 var10 = null;
                        class125 var11 = this.field1441[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1507;
                                if (var12 == null || var12.field1541 <= var8) {
                                    var11.field1510 = true;
                                    int var13 = var11.method2215();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1541 += var13;
                                    }
                                    if (var4 >= this.field1426) {
                                        break label105;
                                    }
                                    class125 var14 = var11.method2189();
                                    if (var14 != null) {
                                        int var15 = var11.field1509;
                                        while (var14 != null) {
                                            this.method2322(var14, var15 * var14.method2502() >> 8);
                                            var14 = var11.method2188();
                                        }
                                    }
                                    class125 var16 = var11.field1508;
                                    var11.field1508 = null;
                                    if (var10 == null) {
                                        this.field1441[var7] = var16;
                                    } else {
                                        var10.field1508 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1429[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1508;
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
                class125 var18 = this.field1441[var17];
                class125[] var19 = this.field1441;
                this.field1429[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class125 var21 = var18.field1508;
                    var18.field1508 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1440 < 0) {
            this.field1440 = 0;
        }
        if (this.field1424 != null) {
            this.field1424.method2192(arg0, 0, arg1);
        }
        this.field1430 = class308.method4891();
    }

    @ObfuscatedName("cg.ah(Ldi;I)V")
    public static final void method2076(class125 arg0) {
        arg0.field1510 = false;
        if (arg0.field1507 != null) {
            arg0.field1507.field1541 = 0;
        }
        for (class125 var1 = arg0.method2189(); var1 != null; var1 = arg0.method2188()) {
            method2076(var1);
        }
    }

    @ObfuscatedName("dp.am(Ldi;IB)V")
    public final void method2322(class125 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class125 var4 = this.field1429[var3];
        if (var4 == null) {
            this.field1441[var3] = arg0;
        } else {
            var4.field1508 = arg0;
        }
        this.field1429[var3] = arg0;
        arg0.field1509 = arg1;
    }

    @ObfuscatedName("dp.h(B)V")
    public void method798() throws Exception {
    }

    @ObfuscatedName("dp.v(IS)V")
    public void method799(int arg0) throws Exception {
    }

    @ObfuscatedName("dp.x(B)I")
    public int method807() throws Exception {
        return this.field1435;
    }

    @ObfuscatedName("dp.w()V")
    public void method801() throws Exception {
    }

    @ObfuscatedName("dp.t(I)V")
    public void method802() {
    }

    @ObfuscatedName("dp.j(B)V")
    public void method804() throws Exception {
    }
}
