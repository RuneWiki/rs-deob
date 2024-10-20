package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("co")
public class class104 {

    @ObfuscatedName("co.i")
    public int[] field1365;

    @ObfuscatedName("co.a")
    public class114 field1366;

    @ObfuscatedName("co.z")
    public int field1367 = 32;

    @ObfuscatedName("co.j")
    public long field1368 = class204.method3658();

    @ObfuscatedName("co.s")
    public int field1369;

    @ObfuscatedName("co.t")
    public int field1374;

    @ObfuscatedName("co.y")
    public int field1371;

    @ObfuscatedName("co.h")
    public long field1364 = 0L;

    @ObfuscatedName("co.b")
    public int field1373 = 0;

    @ObfuscatedName("co.c")
    public int field1376 = 0;

    @ObfuscatedName("co.r")
    public int field1375 = 0;

    @ObfuscatedName("co.p")
    public long field1372 = 0L;

    @ObfuscatedName("co.v")
    public boolean field1377 = true;

    @ObfuscatedName("co.ac")
    public int field1378 = 0;

    @ObfuscatedName("co.ay")
    public class114[] field1379 = new class114[8];

    @ObfuscatedName("co.ah")
    public class114[] field1380 = new class114[8];

    @ObfuscatedName("bq.aq(IZII)V")
    public static final void method959(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3803 = arg0;
        Statics.field1370 = arg1;
        Statics.field1154 = arg2;
    }

    @ObfuscatedName("cq.aj(Lfz;III)Lco;")
    public static final class104 method1932(class168 arg0, int arg1, int arg2) {
        if (Statics.field3803 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class104 var3 = Statics.field583.method704();
                var3.field1365 = new int[(Statics.field1370 ? 2 : 1) * 256];
                var3.field1374 = arg2;
                var3.method734();
                var3.field1369 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1369 > 16384) {
                    var3.field1369 = 16384;
                }
                var3.method735(var3.field1369);
                if (Statics.field1154 > 0 && Statics.field1254 == null) {
                    Statics.field1254 = new class106();
                    Statics.field3718 = Executors.newScheduledThreadPool(1);
                    Statics.field3718.scheduleAtFixedRate(Statics.field1254, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1254 != null) {
                    if (Statics.field1254.field1393[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1254.field1393[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class104();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("co.av(Ldc;I)V")
    public final synchronized void method2193(class114 arg0) {
        this.field1366 = arg0;
    }

    @ObfuscatedName("co.ar(I)V")
    public final synchronized void method2222() {
        if (this.field1365 == null) {
            return;
        }
        long var1 = class204.method3658();
        try {
            if (this.field1364 != 0L) {
                if (var1 < this.field1364) {
                    return;
                }
                this.method735(this.field1369);
                this.field1364 = 0L;
                this.field1377 = true;
            }
            int var3 = this.method747();
            if (this.field1375 - var3 > this.field1373) {
                this.field1373 = this.field1375 - var3;
            }
            int var4 = this.field1374 + this.field1371;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1369) {
                this.field1369 += 1024;
                if (this.field1369 > 16384) {
                    this.field1369 = 16384;
                }
                this.method733();
                this.method735(this.field1369);
                var3 = 0;
                this.field1377 = true;
                if (var4 + 256 > this.field1369) {
                    var4 = this.field1369 - 256;
                    this.field1371 = var4 - this.field1374;
                }
            }
            while (var3 < var4) {
                this.method2198(this.field1365, 256);
                this.method753();
                var3 += 256;
            }
            if (var1 > this.field1372) {
                if (this.field1377) {
                    this.field1377 = false;
                } else if (this.field1373 == 0 && this.field1376 == 0) {
                    this.method733();
                    this.field1364 = var1 + 2000L;
                    return;
                } else {
                    this.field1371 = Math.min(this.field1376, this.field1373);
                    this.field1376 = this.field1373;
                }
                this.field1373 = 0;
                this.field1372 = var1 + 2000L;
            }
            this.field1375 = var3;
        } catch (Exception var8) {
            this.method733();
            this.field1364 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1368 + 500000L) {
                var1 = this.field1368;
            }
            while (var1 > this.field1368 + 5000L) {
                this.method2197(256);
                this.field1368 += (long) (256000 / Statics.field3803);
            }
        } catch (Exception var7) {
            this.field1368 = var1;
        }
    }

    @ObfuscatedName("co.ac(I)V")
    public final void method2194() {
        this.field1377 = true;
    }

    @ObfuscatedName("co.ay(B)V")
    public final synchronized void method2195() {
        this.field1377 = true;
        try {
            this.method738();
        } catch (Exception var2) {
            this.method733();
            this.field1364 = class204.method3658() + 2000L;
        }
    }

    @ObfuscatedName("co.ah(I)V")
    public final synchronized void method2196() {
        if (Statics.field1254 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1254.field1393[var2] == this) {
                    Statics.field1254.field1393[var2] = null;
                }
                if (Statics.field1254.field1393[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3718.shutdownNow();
                Statics.field3718 = null;
                Statics.field1254 = null;
            }
        }
        this.method733();
        this.field1365 = null;
    }

    @ObfuscatedName("co.ak(II)V")
    public final void method2197(int arg0) {
        this.field1378 -= arg0;
        if (this.field1378 < 0) {
            this.field1378 = 0;
        }
        if (this.field1366 != null) {
            this.field1366.method2083(arg0);
        }
    }

    @ObfuscatedName("co.aw([II)V")
    public final void method2198(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1370) {
            var3 = arg1 << 1;
        }
        class213.method3760(arg0, 0, var3);
        this.field1378 -= arg1;
        if (this.field1366 != null && this.field1378 <= 0) {
            this.field1378 += Statics.field3803 >> 4;
            method3898(this.field1366);
            this.method2207(this.field1366, this.field1366.method2282());
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
                        class114 var10 = null;
                        class114 var11 = this.field1379[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class117 var12 = var11.field1451;
                                if (var12 == null || var12.field1483 <= var8) {
                                    var11.field1449 = true;
                                    int var13 = var11.method2080();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1483 += var13;
                                    }
                                    if (var4 >= this.field1367) {
                                        break label105;
                                    }
                                    class114 var14 = var11.method2078();
                                    if (var14 != null) {
                                        int var15 = var11.field1450;
                                        while (var14 != null) {
                                            this.method2207(var14, var15 * var14.method2282() >> 8);
                                            var14 = var11.method2104();
                                        }
                                    }
                                    class114 var16 = var11.field1452;
                                    var11.field1452 = null;
                                    if (var10 == null) {
                                        this.field1379[var7] = var16;
                                    } else {
                                        var10.field1452 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1380[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1452;
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
                class114 var18 = this.field1379[var17];
                class114[] var19 = this.field1379;
                this.field1380[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class114 var21 = var18.field1452;
                    var18.field1452 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1378 < 0) {
            this.field1378 = 0;
        }
        if (this.field1366 != null) {
            this.field1366.method2081(arg0, 0, arg1);
        }
        this.field1368 = class204.method3658();
    }

    @ObfuscatedName("hm.al(Ldc;B)V")
    public static final void method3898(class114 arg0) {
        arg0.field1449 = false;
        if (arg0.field1451 != null) {
            arg0.field1451.field1483 = 0;
        }
        for (class114 var1 = arg0.method2078(); var1 != null; var1 = arg0.method2104()) {
            method3898(var1);
        }
    }

    @ObfuscatedName("co.ab(Ldc;II)V")
    public final void method2207(class114 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class114 var4 = this.field1380[var3];
        if (var4 == null) {
            this.field1379[var3] = arg0;
        } else {
            var4.field1452 = arg0;
        }
        this.field1380[var3] = arg0;
        arg0.field1450 = arg1;
    }

    @ObfuscatedName("co.m(I)V")
    public void method734() throws Exception {
    }

    @ObfuscatedName("co.f(II)V")
    public void method735(int arg0) throws Exception {
    }

    @ObfuscatedName("co.q(B)I")
    public int method747() throws Exception {
        return this.field1369;
    }

    @ObfuscatedName("co.w()V")
    public void method753() throws Exception {
    }

    @ObfuscatedName("co.o(I)V")
    public void method733() {
    }

    @ObfuscatedName("co.u(I)V")
    public void method738() throws Exception {
    }
}
