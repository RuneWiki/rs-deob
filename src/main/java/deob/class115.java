package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dh")
public class class115 {

    @ObfuscatedName("dh.x")
    public int[] field1435;

    @ObfuscatedName("dh.p")
    public class125 field1438;

    @ObfuscatedName("dh.r")
    public int field1439 = 32;

    @ObfuscatedName("dh.y")
    public long field1440 = class308.method4786();

    @ObfuscatedName("dh.s")
    public int field1441;

    @ObfuscatedName("dh.j")
    public int field1442;

    @ObfuscatedName("dh.w")
    public int field1455;

    @ObfuscatedName("dh.v")
    public long field1433 = 0L;

    @ObfuscatedName("dh.d")
    public int field1445 = 0;

    @ObfuscatedName("dh.a")
    public int field1446 = 0;

    @ObfuscatedName("dh.g")
    public int field1436 = 0;

    @ObfuscatedName("dh.h")
    public long field1457 = 0L;

    @ObfuscatedName("dh.i")
    public boolean field1449 = true;

    @ObfuscatedName("dh.ar")
    public int field1451 = 0;

    @ObfuscatedName("dh.ay")
    public class125[] field1452 = new class125[8];

    @ObfuscatedName("dh.ah")
    public class125[] field1453 = new class125[8];

    @ObfuscatedName("x.y(Lfl;III)Ldh;")
    public static final class115 method114(class176 arg0, int arg1, int arg2) {
        if (Statics.field1443 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class115 var3 = Statics.field592.method778();
                var3.field1435 = new int[(Statics.field1434 ? 2 : 1) * 256];
                var3.field1442 = arg2;
                var3.method807();
                var3.field1441 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1441 > 16384) {
                    var3.field1441 = 16384;
                }
                var3.method802(var3.field1441);
                if (Statics.field3695 > 0 && Statics.field235 == null) {
                    Statics.field235 = new class117();
                    Statics.field4084 = Executors.newScheduledThreadPool(1);
                    Statics.field4084.scheduleAtFixedRate(Statics.field235, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field235 != null) {
                    if (Statics.field235.field1471[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field235.field1471[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class115();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.s(Lde;I)V")
    public final synchronized void method2347(class125 arg0) {
        this.field1438 = arg0;
    }

    @ObfuscatedName("dh.j(B)V")
    public final synchronized void method2367() {
        if (this.field1435 == null) {
            return;
        }
        long var1 = class308.method4786();
        try {
            if (this.field1433 != 0L) {
                if (var1 < this.field1433) {
                    return;
                }
                this.method802(this.field1441);
                this.field1433 = 0L;
                this.field1449 = true;
            }
            int var3 = this.method801();
            if (this.field1436 - var3 > this.field1445) {
                this.field1445 = this.field1436 - var3;
            }
            int var4 = this.field1455 + this.field1442;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1441) {
                this.field1441 += 1024;
                if (this.field1441 > 16384) {
                    this.field1441 = 16384;
                }
                this.method804();
                this.method802(this.field1441);
                var3 = 0;
                this.field1449 = true;
                if (var4 + 256 > this.field1441) {
                    var4 = this.field1441 - 256;
                    this.field1455 = var4 - this.field1442;
                }
            }
            while (var3 < var4) {
                this.method2353(this.field1435, 256);
                this.method806();
                var3 += 256;
            }
            if (var1 > this.field1457) {
                if (this.field1449) {
                    this.field1449 = false;
                } else if (this.field1445 == 0 && this.field1446 == 0) {
                    this.method804();
                    this.field1433 = var1 + 2000L;
                    return;
                } else {
                    this.field1455 = Math.min(this.field1446, this.field1445);
                    this.field1446 = this.field1445;
                }
                this.field1445 = 0;
                this.field1457 = var1 + 2000L;
            }
            this.field1436 = var3;
        } catch (Exception var8) {
            this.method804();
            this.field1433 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1440 + 500000L) {
                var1 = this.field1440;
            }
            while (var1 > this.field1440 + 5000L) {
                this.method2374(256);
                this.field1440 += (long) (256000 / Statics.field1443);
            }
        } catch (Exception var7) {
            this.field1440 = var1;
        }
    }

    @ObfuscatedName("dh.d(I)V")
    public final void method2349() {
        this.field1449 = true;
    }

    @ObfuscatedName("dh.a(I)V")
    public final synchronized void method2350() {
        this.field1449 = true;
        try {
            this.method805();
        } catch (Exception var2) {
            this.method804();
            this.field1433 = class308.method4786() + 2000L;
        }
    }

    @ObfuscatedName("dh.g(B)V")
    public final synchronized void method2351() {
        if (Statics.field235 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field235.field1471[var2] == this) {
                    Statics.field235.field1471[var2] = null;
                }
                if (Statics.field235.field1471[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field4084.shutdownNow();
                Statics.field4084 = null;
                Statics.field235 = null;
            }
        }
        this.method804();
        this.field1435 = null;
    }

    @ObfuscatedName("dh.h(IB)V")
    public final void method2374(int arg0) {
        this.field1451 -= arg0;
        if (this.field1451 < 0) {
            this.field1451 = 0;
        }
        if (this.field1438 != null) {
            this.field1438.method2231(arg0);
        }
    }

    @ObfuscatedName("dh.ab([II)V")
    public final void method2353(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1434) {
            var3 = arg1 << 1;
        }
        class312.method5427(arg0, 0, var3);
        this.field1451 -= arg1;
        if (this.field1438 != null && this.field1451 <= 0) {
            this.field1451 += Statics.field1443 >> 4;
            method1658(this.field1438);
            this.method2378(this.field1438, this.field1438.method2444());
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
                        class125 var11 = this.field1452[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1523;
                                if (var12 == null || var12.field1554 <= var8) {
                                    var11.field1522 = true;
                                    int var13 = var11.method2237();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1554 += var13;
                                    }
                                    if (var4 >= this.field1439) {
                                        break label105;
                                    }
                                    class125 var14 = var11.method2226();
                                    if (var14 != null) {
                                        int var15 = var11.field1521;
                                        while (var14 != null) {
                                            this.method2378(var14, var15 * var14.method2444() >> 8);
                                            var14 = var11.method2227();
                                        }
                                    }
                                    class125 var16 = var11.field1520;
                                    var11.field1520 = null;
                                    if (var10 == null) {
                                        this.field1452[var7] = var16;
                                    } else {
                                        var10.field1520 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1453[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1520;
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
                class125 var18 = this.field1452[var17];
                class125[] var19 = this.field1452;
                this.field1453[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class125 var21 = var18.field1520;
                    var18.field1520 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1451 < 0) {
            this.field1451 = 0;
        }
        if (this.field1438 != null) {
            this.field1438.method2229(arg0, 0, arg1);
        }
        this.field1440 = class308.method4786();
    }

    @ObfuscatedName("client.ac(Lde;I)V")
    public static final void method1658(class125 arg0) {
        arg0.field1522 = false;
        if (arg0.field1523 != null) {
            arg0.field1523.field1554 = 0;
        }
        for (class125 var1 = arg0.method2226(); var1 != null; var1 = arg0.method2227()) {
            method1658(var1);
        }
    }

    @ObfuscatedName("dh.ao(Lde;II)V")
    public final void method2378(class125 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class125 var4 = this.field1453[var3];
        if (var4 == null) {
            this.field1452[var3] = arg0;
        } else {
            var4.field1520 = arg0;
        }
        this.field1453[var3] = arg0;
        arg0.field1521 = arg1;
    }

    @ObfuscatedName("dh.f(I)V")
    public void method807() throws Exception {
    }

    @ObfuscatedName("dh.b(IB)V")
    public void method802(int arg0) throws Exception {
    }

    @ObfuscatedName("dh.l(I)I")
    public int method801() throws Exception {
        return this.field1441;
    }

    @ObfuscatedName("dh.m()V")
    public void method806() throws Exception {
    }

    @ObfuscatedName("dh.z(B)V")
    public void method804() {
    }

    @ObfuscatedName("dh.q(I)V")
    public void method805() throws Exception {
    }
}
