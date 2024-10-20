package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cw")
public class class104 {

    @ObfuscatedName("cw.k")
    public int[] field1371;

    @ObfuscatedName("cw.s")
    public class114 field1380;

    @ObfuscatedName("cw.l")
    public int field1373 = 32;

    @ObfuscatedName("cw.t")
    public long field1369 = class297.method481();

    @ObfuscatedName("cw.j")
    public int field1375;

    @ObfuscatedName("cw.n")
    public int field1374;

    @ObfuscatedName("cw.u")
    public int field1377;

    @ObfuscatedName("cw.z")
    public long field1378 = 0L;

    @ObfuscatedName("cw.h")
    public int field1372 = 0;

    @ObfuscatedName("cw.m")
    public int field1383 = 0;

    @ObfuscatedName("cw.g")
    public int field1381 = 0;

    @ObfuscatedName("cw.r")
    public long field1382 = 0L;

    @ObfuscatedName("cw.q")
    public boolean field1379 = true;

    @ObfuscatedName("cw.au")
    public int field1376 = 0;

    @ObfuscatedName("cw.ah")
    public class114[] field1385 = new class114[8];

    @ObfuscatedName("cw.aq")
    public class114[] field1386 = new class114[8];

    @ObfuscatedName("jj.au(Lcz;I)V")
    public static final void method4872(class98 arg0) {
        Statics.field1287 = arg0;
    }

    @ObfuscatedName("al.ah(Lfl;IIS)Lcw;")
    public static final class104 method642(class167 arg0, int arg1, int arg2) {
        if (Statics.field2491 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class104 var3 = Statics.field1287.method696();
                var3.field1371 = new int[(Statics.field1409 ? 2 : 1) * 256];
                var3.field1374 = arg2;
                var3.method724();
                var3.field1375 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1375 > 16384) {
                    var3.field1375 = 16384;
                }
                var3.method731(var3.field1375);
                if (Statics.field1104 > 0 && Statics.field1101 == null) {
                    Statics.field1101 = new class106();
                    Statics.field1043 = Executors.newScheduledThreadPool(1);
                    Statics.field1043.scheduleAtFixedRate(Statics.field1101, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1101 != null) {
                    if (Statics.field1101.field1399[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1101.field1399[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class104();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cw.aq(Ldl;I)V")
    public final synchronized void method2232(class114 arg0) {
        this.field1380 = arg0;
    }

    @ObfuscatedName("cw.ao(B)V")
    public final synchronized void method2233() {
        if (this.field1371 == null) {
            return;
        }
        long var1 = class297.method481();
        try {
            if (this.field1378 != 0L) {
                if (var1 < this.field1378) {
                    return;
                }
                this.method731(this.field1375);
                this.field1378 = 0L;
                this.field1379 = true;
            }
            int var3 = this.method727();
            if (this.field1381 - var3 > this.field1372) {
                this.field1372 = this.field1381 - var3;
            }
            int var4 = this.field1377 + this.field1374;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1375) {
                this.field1375 += 1024;
                if (this.field1375 > 16384) {
                    this.field1375 = 16384;
                }
                this.method726();
                this.method731(this.field1375);
                var3 = 0;
                this.field1379 = true;
                if (var4 + 256 > this.field1375) {
                    var4 = this.field1375 - 256;
                    this.field1377 = var4 - this.field1374;
                }
            }
            while (var3 < var4) {
                this.method2234(this.field1371, 256);
                this.method728();
                var3 += 256;
            }
            if (var1 > this.field1382) {
                if (this.field1379) {
                    this.field1379 = false;
                } else if (this.field1372 == 0 && this.field1383 == 0) {
                    this.method726();
                    this.field1378 = var1 + 2000L;
                    return;
                } else {
                    this.field1377 = Math.min(this.field1383, this.field1372);
                    this.field1383 = this.field1372;
                }
                this.field1372 = 0;
                this.field1382 = var1 + 2000L;
            }
            this.field1381 = var3;
        } catch (Exception var8) {
            this.method726();
            this.field1378 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1369 + 500000L) {
                var1 = this.field1369;
            }
            while (var1 > this.field1369 + 5000L) {
                this.method2235(256);
                this.field1369 += (long) (256000 / Statics.field2491);
            }
        } catch (Exception var7) {
            this.field1369 = var1;
        }
    }

    @ObfuscatedName("cw.an(B)V")
    public final void method2258() {
        this.field1379 = true;
    }

    @ObfuscatedName("cw.ar(I)V")
    public final synchronized void method2270() {
        this.field1379 = true;
        try {
            this.method744();
        } catch (Exception var2) {
            this.method726();
            this.field1378 = class297.method481() + 2000L;
        }
    }

    @ObfuscatedName("cw.az(I)V")
    public final synchronized void method2267() {
        if (Statics.field1101 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1101.field1399[var2] == this) {
                    Statics.field1101.field1399[var2] = null;
                }
                if (Statics.field1101.field1399[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1043.shutdownNow();
                Statics.field1043 = null;
                Statics.field1101 = null;
            }
        }
        this.method726();
        this.field1371 = null;
    }

    @ObfuscatedName("cw.ay(II)V")
    public final void method2235(int arg0) {
        this.field1376 -= arg0;
        if (this.field1376 < 0) {
            this.field1376 = 0;
        }
        if (this.field1380 != null) {
            this.field1380.method2111(arg0);
        }
    }

    @ObfuscatedName("cw.ag([II)V")
    public final void method2234(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1409) {
            var3 = arg1 << 1;
        }
        class301.method5339(arg0, 0, var3);
        this.field1376 -= arg1;
        if (this.field1380 != null && this.field1376 <= 0) {
            this.field1376 += Statics.field2491 >> 4;
            method2078(this.field1380);
            this.method2236(this.field1380, this.field1380.method2427());
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
                        class114 var11 = this.field1385[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class117 var12 = var11.field1454;
                                if (var12 == null || var12.field1487 <= var8) {
                                    var11.field1456 = true;
                                    int var13 = var11.method2122();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1487 += var13;
                                    }
                                    if (var4 >= this.field1373) {
                                        break label105;
                                    }
                                    class114 var14 = var11.method2113();
                                    if (var14 != null) {
                                        int var15 = var11.field1455;
                                        while (var14 != null) {
                                            this.method2236(var14, var15 * var14.method2427() >> 8);
                                            var14 = var11.method2114();
                                        }
                                    }
                                    class114 var16 = var11.field1453;
                                    var11.field1453 = null;
                                    if (var10 == null) {
                                        this.field1385[var7] = var16;
                                    } else {
                                        var10.field1453 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1386[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1453;
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
                class114 var18 = this.field1385[var17];
                class114[] var19 = this.field1385;
                this.field1386[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class114 var21 = var18.field1453;
                    var18.field1453 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1376 < 0) {
            this.field1376 = 0;
        }
        if (this.field1380 != null) {
            this.field1380.method2134(arg0, 0, arg1);
        }
        this.field1369 = class297.method481();
    }

    @ObfuscatedName("ct.ac(Ldl;B)V")
    public static final void method2078(class114 arg0) {
        arg0.field1456 = false;
        if (arg0.field1454 != null) {
            arg0.field1454.field1487 = 0;
        }
        for (class114 var1 = arg0.method2113(); var1 != null; var1 = arg0.method2114()) {
            method2078(var1);
        }
    }

    @ObfuscatedName("cw.al(Ldl;II)V")
    public final void method2236(class114 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class114 var4 = this.field1386[var3];
        if (var4 == null) {
            this.field1385[var3] = arg0;
        } else {
            var4.field1453 = arg0;
        }
        this.field1386[var3] = arg0;
        arg0.field1455 = arg1;
    }

    @ObfuscatedName("cw.f(B)V")
    public void method724() throws Exception {
    }

    @ObfuscatedName("cw.i(II)V")
    public void method731(int arg0) throws Exception {
    }

    @ObfuscatedName("cw.y(I)I")
    public int method727() throws Exception {
        return this.field1375;
    }

    @ObfuscatedName("cw.w()V")
    public void method728() throws Exception {
    }

    @ObfuscatedName("cw.p(S)V")
    public void method726() {
    }

    @ObfuscatedName("cw.b(I)V")
    public void method744() throws Exception {
    }
}
