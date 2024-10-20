package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dt")
public class class115 {

    @ObfuscatedName("dt.h")
    public int[] field1439;

    @ObfuscatedName("dt.k")
    public class125 field1446;

    @ObfuscatedName("dt.r")
    public int field1441 = 32;

    @ObfuscatedName("dt.s")
    public long field1442 = class307.method3253();

    @ObfuscatedName("dt.v")
    public int field1443;

    @ObfuscatedName("dt.d")
    public int field1444;

    @ObfuscatedName("dt.e")
    public int field1445;

    @ObfuscatedName("dt.l")
    public long field1440 = 0L;

    @ObfuscatedName("dt.t")
    public int field1447 = 0;

    @ObfuscatedName("dt.x")
    public int field1448 = 0;

    @ObfuscatedName("dt.b")
    public int field1437 = 0;

    @ObfuscatedName("dt.i")
    public long field1453 = 0L;

    @ObfuscatedName("dt.f")
    public boolean field1451 = true;

    @ObfuscatedName("dt.ag")
    public int field1449 = 0;

    @ObfuscatedName("dt.ab")
    public class125[] field1450 = new class125[8];

    @ObfuscatedName("dt.am")
    public class125[] field1454 = new class125[8];

    @ObfuscatedName("cv.ai(Ldh;I)V")
    public static final void method1943(class109 arg0) {
        Statics.field1027 = arg0;
    }

    @ObfuscatedName("gi.ao(IZII)V")
    public static final void method3450(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3114 = arg0;
        Statics.field1305 = arg1;
        Statics.field2010 = arg2;
    }

    @ObfuscatedName("ke.ae(Lfm;III)Ldt;")
    public static final class115 method5040(class176 arg0, int arg1, int arg2) {
        if (Statics.field3114 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class115 var3 = Statics.field1027.method747();
                var3.field1439 = new int[256 * (Statics.field1305 ? 2 : 1)];
                var3.field1444 = arg2;
                var3.method767();
                var3.field1443 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1443 > 16384) {
                    var3.field1443 = 16384;
                }
                var3.method768(var3.field1443);
                if (Statics.field2010 > 0 && Statics.field1452 == null) {
                    Statics.field1452 = new class117();
                    Statics.field2746 = Executors.newScheduledThreadPool(1);
                    Statics.field2746.scheduleAtFixedRate(Statics.field1452, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1452 != null) {
                    if (Statics.field1452.field1466[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1452.field1466[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class115();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dt.ax(Ldf;I)V")
    public final synchronized void method2329(class125 arg0) {
        this.field1446 = arg0;
    }

    @ObfuscatedName("dt.ag(I)V")
    public final synchronized void method2358() {
        if (this.field1439 == null) {
            return;
        }
        long var1 = class307.method3253();
        try {
            if (this.field1440 != 0L) {
                if (var1 < this.field1440) {
                    return;
                }
                this.method768(this.field1443);
                this.field1440 = 0L;
                this.field1451 = true;
            }
            int var3 = this.method786();
            if (this.field1437 - var3 > this.field1447) {
                this.field1447 = this.field1437 - var3;
            }
            int var4 = this.field1445 + this.field1444;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1443) {
                this.field1443 += 1024;
                if (this.field1443 > 16384) {
                    this.field1443 = 16384;
                }
                this.method781();
                this.method768(this.field1443);
                var3 = 0;
                this.field1451 = true;
                if (var4 + 256 > this.field1443) {
                    var4 = this.field1443 - 256;
                    this.field1445 = var4 - this.field1444;
                }
            }
            while (var3 < var4) {
                this.method2332(this.field1439, 256);
                this.method770();
                var3 += 256;
            }
            if (var1 > this.field1453) {
                if (this.field1451) {
                    this.field1451 = false;
                } else if (this.field1447 == 0 && this.field1448 == 0) {
                    this.method781();
                    this.field1440 = var1 + 2000L;
                    return;
                } else {
                    this.field1445 = Math.min(this.field1448, this.field1447);
                    this.field1448 = this.field1447;
                }
                this.field1447 = 0;
                this.field1453 = var1 + 2000L;
            }
            this.field1437 = var3;
        } catch (Exception var8) {
            this.method781();
            this.field1440 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1442 + 500000L) {
                var1 = this.field1442;
            }
            while (var1 > this.field1442 + 5000L) {
                this.method2331(256);
                this.field1442 += (long) (256000 / Statics.field3114);
            }
        } catch (Exception var7) {
            this.field1442 = var1;
        }
    }

    @ObfuscatedName("dt.ab(I)V")
    public final void method2328() {
        this.field1451 = true;
    }

    @ObfuscatedName("dt.am(I)V")
    public final synchronized void method2335() {
        this.field1451 = true;
        try {
            this.method766();
        } catch (Exception var2) {
            this.method781();
            this.field1440 = class307.method3253() + 2000L;
        }
    }

    @ObfuscatedName("dt.ak(I)V")
    public final synchronized void method2330() {
        if (Statics.field1452 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1452.field1466[var2] == this) {
                    Statics.field1452.field1466[var2] = null;
                }
                if (Statics.field1452.field1466[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2746.shutdownNow();
                Statics.field2746 = null;
                Statics.field1452 = null;
            }
        }
        this.method781();
        this.field1439 = null;
    }

    @ObfuscatedName("dt.ad(II)V")
    public final void method2331(int arg0) {
        this.field1449 -= arg0;
        if (this.field1449 < 0) {
            this.field1449 = 0;
        }
        if (this.field1446 != null) {
            this.field1446.method2203(arg0);
        }
    }

    @ObfuscatedName("dt.as([II)V")
    public final void method2332(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1305) {
            var3 = arg1 << 1;
        }
        class311.method5471(arg0, 0, var3);
        this.field1449 -= arg1;
        if (this.field1446 != null && this.field1449 <= 0) {
            this.field1449 += Statics.field3114 >> 4;
            method4143(this.field1446);
            this.method2333(this.field1446, this.field1446.method2435());
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
                        class125 var11 = this.field1450[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1520;
                                if (var12 == null || var12.field1552 <= var8) {
                                    var11.field1519 = true;
                                    int var13 = var11.method2200();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1552 += var13;
                                    }
                                    if (var4 >= this.field1441) {
                                        break label105;
                                    }
                                    class125 var14 = var11.method2198();
                                    if (var14 != null) {
                                        int var15 = var11.field1521;
                                        while (var14 != null) {
                                            this.method2333(var14, var15 * var14.method2435() >> 8);
                                            var14 = var11.method2199();
                                        }
                                    }
                                    class125 var16 = var11.field1518;
                                    var11.field1518 = null;
                                    if (var10 == null) {
                                        this.field1450[var7] = var16;
                                    } else {
                                        var10.field1518 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1454[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1518;
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
                class125 var18 = this.field1450[var17];
                class125[] var19 = this.field1450;
                this.field1454[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class125 var21 = var18.field1518;
                    var18.field1518 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1449 < 0) {
            this.field1449 = 0;
        }
        if (this.field1446 != null) {
            this.field1446.method2206(arg0, 0, arg1);
        }
        this.field1442 = class307.method3253();
    }

    @ObfuscatedName("iu.ar(Ldf;I)V")
    public static final void method4143(class125 arg0) {
        arg0.field1519 = false;
        if (arg0.field1520 != null) {
            arg0.field1520.field1552 = 0;
        }
        for (class125 var1 = arg0.method2198(); var1 != null; var1 = arg0.method2199()) {
            method4143(var1);
        }
    }

    @ObfuscatedName("dt.ap(Ldf;IB)V")
    public final void method2333(class125 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class125 var4 = this.field1454[var3];
        if (var4 == null) {
            this.field1450[var3] = arg0;
        } else {
            var4.field1518 = arg0;
        }
        this.field1454[var3] = arg0;
        arg0.field1521 = arg1;
    }

    @ObfuscatedName("dt.m(I)V")
    public void method767() throws Exception {
    }

    @ObfuscatedName("dt.o(IB)V")
    public void method768(int arg0) throws Exception {
    }

    @ObfuscatedName("dt.q(I)I")
    public int method786() throws Exception {
        return this.field1443;
    }

    @ObfuscatedName("dt.j()V")
    public void method770() throws Exception {
    }

    @ObfuscatedName("dt.p(I)V")
    public void method781() {
    }

    @ObfuscatedName("dt.g(I)V")
    public void method766() throws Exception {
    }
}
