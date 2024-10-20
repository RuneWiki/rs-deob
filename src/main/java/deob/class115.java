package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dh")
public class class115 {

    @ObfuscatedName("dh.w")
    public int[] field1423;

    @ObfuscatedName("dh.k")
    public class125 field1424;

    @ObfuscatedName("dh.i")
    public int field1425 = 32;

    @ObfuscatedName("dh.x")
    public long field1436 = class308.method1082();

    @ObfuscatedName("dh.f")
    public int field1427;

    @ObfuscatedName("dh.g")
    public int field1428;

    @ObfuscatedName("dh.u")
    public int field1431;

    @ObfuscatedName("dh.t")
    public long field1430 = 0L;

    @ObfuscatedName("dh.p")
    public int field1429 = 0;

    @ObfuscatedName("dh.m")
    public int field1440 = 0;

    @ObfuscatedName("dh.r")
    public int field1433 = 0;

    @ObfuscatedName("dh.o")
    public long field1426 = 0L;

    @ObfuscatedName("dh.j")
    public boolean field1434 = true;

    @ObfuscatedName("dh.aq")
    public int field1418 = 0;

    @ObfuscatedName("dh.at")
    public class125[] field1438 = new class125[8];

    @ObfuscatedName("dh.ak")
    public class125[] field1439 = new class125[8];

    @ObfuscatedName("g.ay(Lfu;III)Ldh;")
    public static final class115 method144(class176 arg0, int arg1, int arg2) {
        if (Statics.field3339 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class115 var3 = Statics.field16.method778();
                var3.field1423 = new int[256 * (Statics.field1432 ? 2 : 1)];
                var3.field1428 = arg2;
                var3.method824();
                var3.field1427 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1427 > 16384) {
                    var3.field1427 = 16384;
                }
                var3.method805(var3.field1427);
                if (Statics.field1420 > 0 && Statics.field1421 == null) {
                    Statics.field1421 = new class117();
                    Statics.field1419 = Executors.newScheduledThreadPool(1);
                    Statics.field1419.scheduleAtFixedRate(Statics.field1421, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1421 != null) {
                    if (Statics.field1421.field1459[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1421.field1459[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class115();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.am(Ldw;I)V")
    public final synchronized void method2425(class125 arg0) {
        this.field1424 = arg0;
    }

    @ObfuscatedName("dh.ag(I)V")
    public final synchronized void method2431() {
        if (this.field1423 == null) {
            return;
        }
        long var1 = class308.method1082();
        try {
            if (this.field1430 != 0L) {
                if (var1 < this.field1430) {
                    return;
                }
                this.method805(this.field1427);
                this.field1430 = 0L;
                this.field1434 = true;
            }
            int var3 = this.method806();
            if (this.field1433 - var3 > this.field1429) {
                this.field1429 = this.field1433 - var3;
            }
            int var4 = this.field1431 + this.field1428;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1427) {
                this.field1427 += 1024;
                if (this.field1427 > 16384) {
                    this.field1427 = 16384;
                }
                this.method808();
                this.method805(this.field1427);
                var3 = 0;
                this.field1434 = true;
                if (var4 + 256 > this.field1427) {
                    var4 = this.field1427 - 256;
                    this.field1431 = var4 - this.field1428;
                }
            }
            while (var3 < var4) {
                this.method2437(this.field1423, 256);
                this.method807();
                var3 += 256;
            }
            if (var1 > this.field1426) {
                if (this.field1434) {
                    this.field1434 = false;
                } else if (this.field1429 == 0 && this.field1440 == 0) {
                    this.method808();
                    this.field1430 = var1 + 2000L;
                    return;
                } else {
                    this.field1431 = Math.min(this.field1440, this.field1429);
                    this.field1440 = this.field1429;
                }
                this.field1429 = 0;
                this.field1426 = var1 + 2000L;
            }
            this.field1433 = var3;
        } catch (Exception var8) {
            this.method808();
            this.field1430 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1436 + 500000L) {
                var1 = this.field1436;
            }
            while (var1 > this.field1436 + 5000L) {
                this.method2430(256);
                this.field1436 += (long) (256000 / Statics.field3339);
            }
        } catch (Exception var7) {
            this.field1436 = var1;
        }
    }

    @ObfuscatedName("dh.ae(B)V")
    public final void method2427() {
        this.field1434 = true;
    }

    @ObfuscatedName("dh.ac(B)V")
    public final synchronized void method2428() {
        this.field1434 = true;
        try {
            this.method809();
        } catch (Exception var2) {
            this.method808();
            this.field1430 = class308.method1082() + 2000L;
        }
    }

    @ObfuscatedName("dh.aq(S)V")
    public final synchronized void method2429() {
        if (Statics.field1421 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1421.field1459[var2] == this) {
                    Statics.field1421.field1459[var2] = null;
                }
                if (Statics.field1421.field1459[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1419.shutdownNow();
                Statics.field1419 = null;
                Statics.field1421 = null;
            }
        }
        this.method808();
        this.field1423 = null;
    }

    @ObfuscatedName("dh.at(II)V")
    public final void method2430(int arg0) {
        this.field1418 -= arg0;
        if (this.field1418 < 0) {
            this.field1418 = 0;
        }
        if (this.field1424 != null) {
            this.field1424.method2305(arg0);
        }
    }

    @ObfuscatedName("dh.ak([II)V")
    public final void method2437(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1432) {
            var3 = arg1 << 1;
        }
        class312.method5498(arg0, 0, var3);
        this.field1418 -= arg1;
        if (this.field1424 != null && this.field1418 <= 0) {
            this.field1418 += Statics.field3339 >> 4;
            method2273(this.field1424);
            this.method2453(this.field1424, this.field1424.method2505());
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
                        class125 var11 = this.field1438[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1513;
                                if (var12 == null || var12.field1545 <= var8) {
                                    var11.field1514 = true;
                                    int var13 = var11.method2282();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1545 += var13;
                                    }
                                    if (var4 >= this.field1425) {
                                        break label105;
                                    }
                                    class125 var14 = var11.method2280();
                                    if (var14 != null) {
                                        int var15 = var11.field1512;
                                        while (var14 != null) {
                                            this.method2453(var14, var15 * var14.method2505() >> 8);
                                            var14 = var11.method2281();
                                        }
                                    }
                                    class125 var16 = var11.field1511;
                                    var11.field1511 = null;
                                    if (var10 == null) {
                                        this.field1438[var7] = var16;
                                    } else {
                                        var10.field1511 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1439[var7] = var10;
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
                class125 var18 = this.field1438[var17];
                class125[] var19 = this.field1438;
                this.field1439[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class125 var21 = var18.field1511;
                    var18.field1511 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1418 < 0) {
            this.field1418 = 0;
        }
        if (this.field1424 != null) {
            this.field1424.method2283(arg0, 0, arg1);
        }
        this.field1436 = class308.method1082();
    }

    @ObfuscatedName("du.ax(Ldw;I)V")
    public static final void method2273(class125 arg0) {
        arg0.field1514 = false;
        if (arg0.field1513 != null) {
            arg0.field1513.field1545 = 0;
        }
        for (class125 var1 = arg0.method2280(); var1 != null; var1 = arg0.method2281()) {
            method2273(var1);
        }
    }

    @ObfuscatedName("dh.ar(Ldw;IB)V")
    public final void method2453(class125 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class125 var4 = this.field1439[var3];
        if (var4 == null) {
            this.field1438[var3] = arg0;
        } else {
            var4.field1511 = arg0;
        }
        this.field1439[var3] = arg0;
        arg0.field1512 = arg1;
    }

    @ObfuscatedName("dh.n(B)V")
    public void method824() throws Exception {
    }

    @ObfuscatedName("dh.v(II)V")
    public void method805(int arg0) throws Exception {
    }

    @ObfuscatedName("dh.d(S)I")
    public int method806() throws Exception {
        return this.field1427;
    }

    @ObfuscatedName("dh.c()V")
    public void method807() throws Exception {
    }

    @ObfuscatedName("dh.y(B)V")
    public void method808() {
    }

    @ObfuscatedName("dh.h(I)V")
    public void method809() throws Exception {
    }
}
