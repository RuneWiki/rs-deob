package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dr")
public class class115 {

    @ObfuscatedName("dr.a")
    public int[] field1434;

    @ObfuscatedName("dr.q")
    public class125 field1435;

    @ObfuscatedName("dr.c")
    public int field1436 = 32;

    @ObfuscatedName("dr.f")
    public long field1437 = class307.method2184();

    @ObfuscatedName("dr.y")
    public int field1438;

    @ObfuscatedName("dr.v")
    public int field1439;

    @ObfuscatedName("dr.j")
    public int field1452;

    @ObfuscatedName("dr.r")
    public long field1441 = 0L;

    @ObfuscatedName("dr.u")
    public int field1447 = 0;

    @ObfuscatedName("dr.p")
    public int field1443 = 0;

    @ObfuscatedName("dr.b")
    public int field1444 = 0;

    @ObfuscatedName("dr.l")
    public long field1445 = 0L;

    @ObfuscatedName("dr.e")
    public boolean field1446 = true;

    @ObfuscatedName("dr.am")
    public int field1442 = 0;

    @ObfuscatedName("dr.ap")
    public class125[] field1449 = new class125[8];

    @ObfuscatedName("dr.au")
    public class125[] field1450 = new class125[8];

    @ObfuscatedName("s.b(IZII)V")
    public static final void method20(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1448 = arg0;
        Statics.field1432 = arg1;
        Statics.field1492 = arg2;
    }

    @ObfuscatedName("ch.l(Lfo;III)Ldr;")
    public static final class115 method2019(class176 arg0, int arg1, int arg2) {
        if (Statics.field1448 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class115 var3 = Statics.field3679.method749();
                var3.field1434 = new int[256 * (Statics.field1432 ? 2 : 1)];
                var3.field1439 = arg2;
                var3.method773();
                var3.field1438 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1438 > 16384) {
                    var3.field1438 = 16384;
                }
                var3.method776(var3.field1438);
                if (Statics.field1492 > 0 && Statics.field7 == null) {
                    Statics.field7 = new class117();
                    Statics.field1433 = Executors.newScheduledThreadPool(1);
                    Statics.field1433.scheduleAtFixedRate(Statics.field7, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field7 != null) {
                    if (Statics.field7.field1466[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field7.field1466[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class115();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.e(Ldc;I)V")
    public final synchronized void method2323(class125 arg0) {
        this.field1435 = arg0;
    }

    @ObfuscatedName("dr.ab(I)V")
    public final synchronized void method2324() {
        if (this.field1434 == null) {
            return;
        }
        long var1 = class307.method2184();
        try {
            if (this.field1441 != 0L) {
                if (var1 < this.field1441) {
                    return;
                }
                this.method776(this.field1438);
                this.field1441 = 0L;
                this.field1446 = true;
            }
            int var3 = this.method775();
            if (this.field1444 - var3 > this.field1447) {
                this.field1447 = this.field1444 - var3;
            }
            int var4 = this.field1452 + this.field1439;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1438) {
                this.field1438 += 1024;
                if (this.field1438 > 16384) {
                    this.field1438 = 16384;
                }
                this.method777();
                this.method776(this.field1438);
                var3 = 0;
                this.field1446 = true;
                if (var4 + 256 > this.field1438) {
                    var4 = this.field1438 - 256;
                    this.field1452 = var4 - this.field1439;
                }
            }
            while (var3 < var4) {
                this.method2329(this.field1434, 256);
                this.method791();
                var3 += 256;
            }
            if (var1 > this.field1445) {
                if (this.field1446) {
                    this.field1446 = false;
                } else if (this.field1447 == 0 && this.field1443 == 0) {
                    this.method777();
                    this.field1441 = var1 + 2000L;
                    return;
                } else {
                    this.field1452 = Math.min(this.field1443, this.field1447);
                    this.field1443 = this.field1447;
                }
                this.field1447 = 0;
                this.field1445 = var1 + 2000L;
            }
            this.field1444 = var3;
        } catch (Exception var8) {
            this.method777();
            this.field1441 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1437 + 500000L) {
                var1 = this.field1437;
            }
            while (var1 > this.field1437 + 5000L) {
                this.method2332(256);
                this.field1437 += (long) (256000 / Statics.field1448);
            }
        } catch (Exception var7) {
            this.field1437 = var1;
        }
    }

    @ObfuscatedName("dr.ag(I)V")
    public final void method2325() {
        this.field1446 = true;
    }

    @ObfuscatedName("dr.ao(I)V")
    public final synchronized void method2326() {
        this.field1446 = true;
        try {
            this.method774();
        } catch (Exception var2) {
            this.method777();
            this.field1441 = class307.method2184() + 2000L;
        }
    }

    @ObfuscatedName("dr.ae(I)V")
    public final synchronized void method2327() {
        if (Statics.field7 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field7.field1466[var2] == this) {
                    Statics.field7.field1466[var2] = null;
                }
                if (Statics.field7.field1466[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1433.shutdownNow();
                Statics.field1433 = null;
                Statics.field7 = null;
            }
        }
        this.method777();
        this.field1434 = null;
    }

    @ObfuscatedName("dr.ap(II)V")
    public final void method2332(int arg0) {
        this.field1442 -= arg0;
        if (this.field1442 < 0) {
            this.field1442 = 0;
        }
        if (this.field1435 != null) {
            this.field1435.method2214(arg0);
        }
    }

    @ObfuscatedName("dr.au([II)V")
    public final void method2329(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1432) {
            var3 = arg1 << 1;
        }
        class311.method5439(arg0, 0, var3);
        this.field1442 -= arg1;
        if (this.field1435 != null && this.field1442 <= 0) {
            this.field1442 += Statics.field1448 >> 4;
            method3426(this.field1435);
            this.method2330(this.field1435, this.field1435.method2423());
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
                        class125 var11 = this.field1449[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1522;
                                if (var12 == null || var12.field1554 <= var8) {
                                    var11.field1521 = true;
                                    int var13 = var11.method2202();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1554 += var13;
                                    }
                                    if (var4 >= this.field1436) {
                                        break label105;
                                    }
                                    class125 var14 = var11.method2199();
                                    if (var14 != null) {
                                        int var15 = var11.field1520;
                                        while (var14 != null) {
                                            this.method2330(var14, var15 * var14.method2423() >> 8);
                                            var14 = var11.method2201();
                                        }
                                    }
                                    class125 var16 = var11.field1523;
                                    var11.field1523 = null;
                                    if (var10 == null) {
                                        this.field1449[var7] = var16;
                                    } else {
                                        var10.field1523 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1450[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1523;
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
                class125 var18 = this.field1449[var17];
                class125[] var19 = this.field1449;
                this.field1450[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class125 var21 = var18.field1523;
                    var18.field1523 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1442 < 0) {
            this.field1442 = 0;
        }
        if (this.field1435 != null) {
            this.field1435.method2203(arg0, 0, arg1);
        }
        this.field1437 = class307.method2184();
    }

    @ObfuscatedName("gb.aa(Ldc;B)V")
    public static final void method3426(class125 arg0) {
        arg0.field1521 = false;
        if (arg0.field1522 != null) {
            arg0.field1522.field1554 = 0;
        }
        for (class125 var1 = arg0.method2199(); var1 != null; var1 = arg0.method2201()) {
            method3426(var1);
        }
    }

    @ObfuscatedName("dr.ar(Ldc;II)V")
    public final void method2330(class125 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class125 var4 = this.field1450[var3];
        if (var4 == null) {
            this.field1449[var3] = arg0;
        } else {
            var4.field1523 = arg0;
        }
        this.field1450[var3] = arg0;
        arg0.field1520 = arg1;
    }

    @ObfuscatedName("dr.z(I)V")
    public void method773() throws Exception {
    }

    @ObfuscatedName("dr.k(IB)V")
    public void method776(int arg0) throws Exception {
    }

    @ObfuscatedName("dr.s(B)I")
    public int method775() throws Exception {
        return this.field1438;
    }

    @ObfuscatedName("dr.t()V")
    public void method791() throws Exception {
    }

    @ObfuscatedName("dr.i(I)V")
    public void method777() {
    }

    @ObfuscatedName("dr.o(I)V")
    public void method774() throws Exception {
    }
}
