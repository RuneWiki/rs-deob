package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dw")
public class class115 {

    @ObfuscatedName("dw.u")
    public int[] field1427;

    @ObfuscatedName("dw.h")
    public class125 field1428;

    @ObfuscatedName("dw.g")
    public int field1434 = 32;

    @ObfuscatedName("dw.i")
    public long field1430 = Statics.method3668();

    @ObfuscatedName("dw.a")
    public int field1443;

    @ObfuscatedName("dw.b")
    public int field1432;

    @ObfuscatedName("dw.l")
    public int field1433;

    @ObfuscatedName("dw.r")
    public long field1442 = 0L;

    @ObfuscatedName("dw.o")
    public int field1437 = 0;

    @ObfuscatedName("dw.c")
    public int field1436 = 0;

    @ObfuscatedName("dw.j")
    public int field1429 = 0;

    @ObfuscatedName("dw.y")
    public long field1425 = 0L;

    @ObfuscatedName("dw.f")
    public boolean field1439 = true;

    @ObfuscatedName("dw.ar")
    public int field1440 = 0;

    @ObfuscatedName("dw.af")
    public class125[] field1441 = new class125[8];

    @ObfuscatedName("dw.at")
    public class125[] field1435 = new class125[8];

    @ObfuscatedName("du.an(Ldg;S)V")
    public static final void method2193(class109 arg0) {
        Statics.field1426 = arg0;
    }

    @ObfuscatedName("ag.ai(IZII)V")
    public static final void method734(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1422 = arg0;
        Statics.field1438 = arg1;
        Statics.field1424 = arg2;
    }

    @ObfuscatedName("em.ap(Lfs;III)Ldw;")
    public static final class115 method3115(class176 arg0, int arg1, int arg2) {
        if (Statics.field1422 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class115 var3 = Statics.field1426.method786();
                var3.field1427 = new int[(Statics.field1438 ? 2 : 1) * 256];
                var3.field1432 = arg2;
                var3.method814();
                var3.field1443 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1443 > 16384) {
                    var3.field1443 = 16384;
                }
                var3.method815(var3.field1443);
                if (Statics.field1424 > 0 && Statics.field3879 == null) {
                    Statics.field3879 = new class117();
                    Statics.field1421 = Executors.newScheduledThreadPool(1);
                    Statics.field1421.scheduleAtFixedRate(Statics.field3879, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3879 != null) {
                    if (Statics.field3879.field1457[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3879.field1457[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class115();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.ab(Lds;I)V")
    public final synchronized void method2327(class125 arg0) {
        this.field1428 = arg0;
    }

    @ObfuscatedName("dw.ar(B)V")
    public final synchronized void method2328() {
        if (this.field1427 == null) {
            return;
        }
        long var1 = Statics.method3668();
        try {
            if (this.field1442 != 0L) {
                if (var1 < this.field1442) {
                    return;
                }
                this.method815(this.field1443);
                this.field1442 = 0L;
                this.field1439 = true;
            }
            int var3 = this.method816();
            if (this.field1429 - var3 > this.field1437) {
                this.field1437 = this.field1429 - var3;
            }
            int var4 = this.field1433 + this.field1432;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1443) {
                this.field1443 += 1024;
                if (this.field1443 > 16384) {
                    this.field1443 = 16384;
                }
                this.method818();
                this.method815(this.field1443);
                var3 = 0;
                this.field1439 = true;
                if (var4 + 256 > this.field1443) {
                    var4 = this.field1443 - 256;
                    this.field1433 = var4 - this.field1432;
                }
            }
            while (var3 < var4) {
                this.method2333(this.field1427, 256);
                this.method817();
                var3 += 256;
            }
            if (var1 > this.field1425) {
                if (this.field1439) {
                    this.field1439 = false;
                } else if (this.field1437 == 0 && this.field1436 == 0) {
                    this.method818();
                    this.field1442 = var1 + 2000L;
                    return;
                } else {
                    this.field1433 = Math.min(this.field1436, this.field1437);
                    this.field1436 = this.field1437;
                }
                this.field1437 = 0;
                this.field1425 = var1 + 2000L;
            }
            this.field1429 = var3;
        } catch (Exception var8) {
            this.method818();
            this.field1442 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1430 + 500000L) {
                var1 = this.field1430;
            }
            while (var1 > this.field1430 + 5000L) {
                this.method2332(256);
                this.field1430 += (long) (256000 / Statics.field1422);
            }
        } catch (Exception var7) {
            this.field1430 = var1;
        }
    }

    @ObfuscatedName("dw.af(I)V")
    public final void method2329() {
        this.field1439 = true;
    }

    @ObfuscatedName("dw.at(S)V")
    public final synchronized void method2345() {
        this.field1439 = true;
        try {
            this.method819();
        } catch (Exception var2) {
            this.method818();
            this.field1442 = Statics.method3668() + 2000L;
        }
    }

    @ObfuscatedName("dw.as(I)V")
    public final synchronized void method2331() {
        if (Statics.field3879 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3879.field1457[var2] == this) {
                    Statics.field3879.field1457[var2] = null;
                }
                if (Statics.field3879.field1457[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1421.shutdownNow();
                Statics.field1421 = null;
                Statics.field3879 = null;
            }
        }
        this.method818();
        this.field1427 = null;
    }

    @ObfuscatedName("dw.am(II)V")
    public final void method2332(int arg0) {
        this.field1440 -= arg0;
        if (this.field1440 < 0) {
            this.field1440 = 0;
        }
        if (this.field1428 != null) {
            this.field1428.method2205(arg0);
        }
    }

    @ObfuscatedName("dw.au([II)V")
    public final void method2333(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1438) {
            var3 = arg1 << 1;
        }
        class311.method5365(arg0, 0, var3);
        this.field1440 -= arg1;
        if (this.field1428 != null && this.field1440 <= 0) {
            this.field1440 += Statics.field1422 >> 4;
            method3279(this.field1428);
            this.method2342(this.field1428, this.field1428.method2461());
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
                                class128 var12 = var11.field1510;
                                if (var12 == null || var12.field1542 <= var8) {
                                    var11.field1509 = true;
                                    int var13 = var11.method2202();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1542 += var13;
                                    }
                                    if (var4 >= this.field1434) {
                                        break label105;
                                    }
                                    class125 var14 = var11.method2200();
                                    if (var14 != null) {
                                        int var15 = var11.field1508;
                                        while (var14 != null) {
                                            this.method2342(var14, var15 * var14.method2461() >> 8);
                                            var14 = var11.method2201();
                                        }
                                    }
                                    class125 var16 = var11.field1511;
                                    var11.field1511 = null;
                                    if (var10 == null) {
                                        this.field1441[var7] = var16;
                                    } else {
                                        var10.field1511 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1435[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1511;
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
                this.field1435[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class125 var21 = var18.field1511;
                    var18.field1511 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1440 < 0) {
            this.field1440 = 0;
        }
        if (this.field1428 != null) {
            this.field1428.method2203(arg0, 0, arg1);
        }
        this.field1430 = Statics.method3668();
    }

    @ObfuscatedName("fe.ao(Lds;S)V")
    public static final void method3279(class125 arg0) {
        arg0.field1509 = false;
        if (arg0.field1510 != null) {
            arg0.field1510.field1542 = 0;
        }
        for (class125 var1 = arg0.method2200(); var1 != null; var1 = arg0.method2201()) {
            method3279(var1);
        }
    }

    @ObfuscatedName("dw.aq(Lds;II)V")
    public final void method2342(class125 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class125 var4 = this.field1435[var3];
        if (var4 == null) {
            this.field1441[var3] = arg0;
        } else {
            var4.field1511 = arg0;
        }
        this.field1435[var3] = arg0;
        arg0.field1508 = arg1;
    }

    @ObfuscatedName("dw.x(I)V")
    public void method814() throws Exception {
    }

    @ObfuscatedName("dw.m(II)V")
    public void method815(int arg0) throws Exception {
    }

    @ObfuscatedName("dw.k(I)I")
    public int method816() throws Exception {
        return this.field1443;
    }

    @ObfuscatedName("dw.d()V")
    public void method817() throws Exception {
    }

    @ObfuscatedName("dw.w(B)V")
    public void method818() {
    }

    @ObfuscatedName("dw.v(I)V")
    public void method819() throws Exception {
    }
}
