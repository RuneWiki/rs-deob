package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cz")
public class class103 {

    @ObfuscatedName("cz.t")
    public int[] field1389;

    @ObfuscatedName("cz.l")
    public class113 field1390;

    @ObfuscatedName("cz.o")
    public int field1391 = 32;

    @ObfuscatedName("cz.u")
    public long field1392 = class192.method183();

    @ObfuscatedName("cz.y")
    public int field1396;

    @ObfuscatedName("cz.k")
    public int field1401;

    @ObfuscatedName("cz.v")
    public int field1395;

    @ObfuscatedName("cz.d")
    public long field1406 = 0L;

    @ObfuscatedName("cz.w")
    public int field1397 = 0;

    @ObfuscatedName("cz.i")
    public int field1398 = 0;

    @ObfuscatedName("cz.c")
    public int field1394 = 0;

    @ObfuscatedName("cz.j")
    public long field1400 = 0L;

    @ObfuscatedName("cz.z")
    public boolean field1403 = true;

    @ObfuscatedName("cz.ah")
    public int field1402 = 0;

    @ObfuscatedName("cz.aw")
    public class113[] field1388 = new class113[8];

    @ObfuscatedName("cz.an")
    public class113[] field1404 = new class113[8];

    @ObfuscatedName("eu.ab(Lcw;I)V")
    public static final void method3172(class97 arg0) {
        Statics.field1096 = arg0;
    }

    @ObfuscatedName("by.ah(IZII)V")
    public static final void method1610(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field367 = arg0;
        Statics.field1136 = arg1;
        Statics.field1405 = arg2;
    }

    @ObfuscatedName("at.aw(Lfo;IIB)Lcz;")
    public static final class103 method539(class162 arg0, int arg1, int arg2) {
        if (Statics.field367 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class103 var3 = Statics.field1096.method699();
                var3.field1389 = new int[256 * (Statics.field1136 ? 2 : 1)];
                var3.field1401 = arg2;
                var3.method738();
                var3.field1396 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1396 > 16384) {
                    var3.field1396 = 16384;
                }
                var3.method718(var3.field1396);
                if (Statics.field1405 > 0 && Statics.field1140 == null) {
                    Statics.field1140 = new class105();
                    Statics.field1387 = Executors.newScheduledThreadPool(1);
                    Statics.field1387.scheduleAtFixedRate(Statics.field1140, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1140 != null) {
                    if (Statics.field1140.field1420[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1140.field1420[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class103();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cz.an(Ldo;B)V")
    public final synchronized void method2251(class113 arg0) {
        this.field1390 = arg0;
    }

    @ObfuscatedName("cz.at(I)V")
    public final synchronized void method2252() {
        if (this.field1389 == null) {
            return;
        }
        long var1 = class192.method183();
        try {
            if (this.field1406 != 0L) {
                if (var1 < this.field1406) {
                    return;
                }
                this.method718(this.field1396);
                this.field1406 = 0L;
                this.field1403 = true;
            }
            int var3 = this.method721();
            if (this.field1394 - var3 > this.field1397) {
                this.field1397 = this.field1394 - var3;
            }
            int var4 = this.field1401 + this.field1395;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1396) {
                this.field1396 += 1024;
                if (this.field1396 > 16384) {
                    this.field1396 = 16384;
                }
                this.method723();
                this.method718(this.field1396);
                var3 = 0;
                this.field1403 = true;
                if (var4 + 256 > this.field1396) {
                    var4 = this.field1396 - 256;
                    this.field1395 = var4 - this.field1401;
                }
            }
            while (var3 < var4) {
                this.method2257(this.field1389, 256);
                this.method722();
                var3 += 256;
            }
            if (var1 > this.field1400) {
                if (this.field1403) {
                    this.field1403 = false;
                } else if (this.field1397 == 0 && this.field1398 == 0) {
                    this.method723();
                    this.field1406 = var1 + 2000L;
                    return;
                } else {
                    this.field1395 = Math.min(this.field1398, this.field1397);
                    this.field1398 = this.field1397;
                }
                this.field1397 = 0;
                this.field1400 = var1 + 2000L;
            }
            this.field1394 = var3;
        } catch (Exception var8) {
            this.method723();
            this.field1406 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1392 + 500000L) {
                var1 = this.field1392;
            }
            while (var1 > this.field1392 + 5000L) {
                this.method2256(256);
                this.field1392 += (long) (256000 / Statics.field367);
            }
        } catch (Exception var7) {
            this.field1392 = var1;
        }
    }

    @ObfuscatedName("cz.ae(I)V")
    public final void method2253() {
        this.field1403 = true;
    }

    @ObfuscatedName("cz.av(I)V")
    public final synchronized void method2254() {
        this.field1403 = true;
        try {
            this.method719();
        } catch (Exception var2) {
            this.method723();
            this.field1406 = class192.method183() + 2000L;
        }
    }

    @ObfuscatedName("cz.au(B)V")
    public final synchronized void method2255() {
        if (Statics.field1140 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1140.field1420[var2] == this) {
                    Statics.field1140.field1420[var2] = null;
                }
                if (Statics.field1140.field1420[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1387.shutdownNow();
                Statics.field1387 = null;
                Statics.field1140 = null;
            }
        }
        this.method723();
        this.field1389 = null;
    }

    @ObfuscatedName("cz.aj(II)V")
    public final void method2256(int arg0) {
        this.field1402 -= arg0;
        if (this.field1402 < 0) {
            this.field1402 = 0;
        }
        if (this.field1390 != null) {
            this.field1390.method2129(arg0);
        }
    }

    @ObfuscatedName("cz.as([II)V")
    public final void method2257(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1136) {
            var3 = arg1 << 1;
        }
        class201.method3811(arg0, 0, var3);
        this.field1402 -= arg1;
        if (this.field1390 != null && this.field1402 <= 0) {
            this.field1402 += Statics.field367 >> 4;
            method512(this.field1390);
            this.method2261(this.field1390, this.field1390.method2419());
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
                        class113 var11 = this.field1388[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class116 var12 = var11.field1472;
                                if (var12 == null || var12.field1504 <= var8) {
                                    var11.field1473 = true;
                                    int var13 = var11.method2156();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1504 += var13;
                                    }
                                    if (var4 >= this.field1391) {
                                        break label105;
                                    }
                                    class113 var14 = var11.method2139();
                                    if (var14 != null) {
                                        int var15 = var11.field1471;
                                        while (var14 != null) {
                                            this.method2261(var14, var15 * var14.method2419() >> 8);
                                            var14 = var11.method2125();
                                        }
                                    }
                                    class113 var16 = var11.field1470;
                                    var11.field1470 = null;
                                    if (var10 == null) {
                                        this.field1388[var7] = var16;
                                    } else {
                                        var10.field1470 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1404[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1470;
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
                class113 var18 = this.field1388[var17];
                class113[] var19 = this.field1388;
                this.field1404[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class113 var21 = var18.field1470;
                    var18.field1470 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1402 < 0) {
            this.field1402 = 0;
        }
        if (this.field1390 != null) {
            this.field1390.method2127(arg0, 0, arg1);
        }
        this.field1392 = class192.method183();
    }

    @ObfuscatedName("ab.ar(Ldo;I)V")
    public static final void method512(class113 arg0) {
        arg0.field1473 = false;
        if (arg0.field1472 != null) {
            arg0.field1472.field1504 = 0;
        }
        for (class113 var1 = arg0.method2139(); var1 != null; var1 = arg0.method2125()) {
            method512(var1);
        }
    }

    @ObfuscatedName("cz.ai(Ldo;II)V")
    public final void method2261(class113 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class113 var4 = this.field1404[var3];
        if (var4 == null) {
            this.field1388[var3] = arg0;
        } else {
            var4.field1470 = arg0;
        }
        this.field1404[var3] = arg0;
        arg0.field1471 = arg1;
    }

    @ObfuscatedName("cz.a(I)V")
    public void method738() throws Exception {
    }

    @ObfuscatedName("cz.s(II)V")
    public void method718(int arg0) throws Exception {
    }

    @ObfuscatedName("cz.g(I)I")
    public int method721() throws Exception {
        return this.field1396;
    }

    @ObfuscatedName("cz.x()V")
    public void method722() throws Exception {
    }

    @ObfuscatedName("cz.h(I)V")
    public void method723() {
    }

    @ObfuscatedName("cz.f(B)V")
    public void method719() throws Exception {
    }
}
