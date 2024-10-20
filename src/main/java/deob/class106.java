package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dn")
public class class106 {

    @ObfuscatedName("dn.r")
    public int[] field1416;

    @ObfuscatedName("dn.v")
    public class116 field1411;

    @ObfuscatedName("dn.y")
    public int field1407 = 32;

    @ObfuscatedName("dn.g")
    public long field1413 = class298.method3576();

    @ObfuscatedName("dn.a")
    public int field1425;

    @ObfuscatedName("dn.j")
    public int field1415;

    @ObfuscatedName("dn.t")
    public int field1414;

    @ObfuscatedName("dn.h")
    public long field1417 = 0L;

    @ObfuscatedName("dn.o")
    public int field1418 = 0;

    @ObfuscatedName("dn.n")
    public int field1419 = 0;

    @ObfuscatedName("dn.d")
    public int field1420 = 0;

    @ObfuscatedName("dn.s")
    public long field1421 = 0L;

    @ObfuscatedName("dn.z")
    public boolean field1422 = true;

    @ObfuscatedName("dn.ag")
    public int field1424 = 0;

    @ObfuscatedName("dn.ar")
    public class116[] field1427 = new class116[8];

    @ObfuscatedName("dn.ax")
    public class116[] field1426 = new class116[8];

    @ObfuscatedName("dv.z(IZII)V")
    public static final void method2596(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2079 = arg0;
        Statics.field2054 = arg1;
        Statics.field1408 = arg2;
    }

    @ObfuscatedName("ir.al(Lfs;III)Ldn;")
    public static final class106 method3887(class167 arg0, int arg1, int arg2) {
        if (Statics.field2079 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field278.method665();
                var3.field1416 = new int[256 * (Statics.field2054 ? 2 : 1)];
                var3.field1415 = arg2;
                var3.method685();
                var3.field1425 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1425 > 16384) {
                    var3.field1425 = 16384;
                }
                var3.method686(var3.field1425);
                if (Statics.field1408 > 0 && Statics.field1247 == null) {
                    Statics.field1247 = new class108();
                    Statics.field98 = Executors.newScheduledThreadPool(1);
                    Statics.field98.scheduleAtFixedRate(Statics.field1247, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1247 != null) {
                    if (Statics.field1247.field1439[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1247.field1439[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.av(Ldx;I)V")
    public final synchronized void method2217(class116 arg0) {
        this.field1411 = arg0;
    }

    @ObfuscatedName("dn.as(I)V")
    public final synchronized void method2225() {
        if (this.field1416 == null) {
            return;
        }
        long var1 = class298.method3576();
        try {
            if (this.field1417 != 0L) {
                if (var1 < this.field1417) {
                    return;
                }
                this.method686(this.field1425);
                this.field1417 = 0L;
                this.field1422 = true;
            }
            int var3 = this.method687();
            if (this.field1420 - var3 > this.field1418) {
                this.field1418 = this.field1420 - var3;
            }
            int var4 = this.field1415 + this.field1414;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1425) {
                this.field1425 += 1024;
                if (this.field1425 > 16384) {
                    this.field1425 = 16384;
                }
                this.method689();
                this.method686(this.field1425);
                var3 = 0;
                this.field1422 = true;
                if (var4 + 256 > this.field1425) {
                    var4 = this.field1425 - 256;
                    this.field1414 = var4 - this.field1415;
                }
            }
            while (var3 < var4) {
                this.method2211(this.field1416, 256);
                this.method688();
                var3 += 256;
            }
            if (var1 > this.field1421) {
                if (this.field1422) {
                    this.field1422 = false;
                } else if (this.field1418 == 0 && this.field1419 == 0) {
                    this.method689();
                    this.field1417 = var1 + 2000L;
                    return;
                } else {
                    this.field1414 = Math.min(this.field1419, this.field1418);
                    this.field1419 = this.field1418;
                }
                this.field1418 = 0;
                this.field1421 = var1 + 2000L;
            }
            this.field1420 = var3;
        } catch (Exception var8) {
            this.method689();
            this.field1417 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1413 + 500000L) {
                var1 = this.field1413;
            }
            while (var1 > this.field1413 + 5000L) {
                this.method2210(256);
                this.field1413 += (long) (256000 / Statics.field2079);
            }
        } catch (Exception var7) {
            this.field1413 = var1;
        }
    }

    @ObfuscatedName("dn.aw(B)V")
    public final void method2207() {
        this.field1422 = true;
    }

    @ObfuscatedName("dn.ad(I)V")
    public final synchronized void method2208() {
        this.field1422 = true;
        try {
            this.method693();
        } catch (Exception var2) {
            this.method689();
            this.field1417 = class298.method3576() + 2000L;
        }
    }

    @ObfuscatedName("dn.ag(B)V")
    public final synchronized void method2219() {
        if (Statics.field1247 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1247.field1439[var2] == this) {
                    Statics.field1247.field1439[var2] = null;
                }
                if (Statics.field1247.field1439[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field98.shutdownNow();
                Statics.field98 = null;
                Statics.field1247 = null;
            }
        }
        this.method689();
        this.field1416 = null;
    }

    @ObfuscatedName("dn.ar(II)V")
    public final void method2210(int arg0) {
        this.field1424 -= arg0;
        if (this.field1424 < 0) {
            this.field1424 = 0;
        }
        if (this.field1411 != null) {
            this.field1411.method2084(arg0);
        }
    }

    @ObfuscatedName("dn.ax([II)V")
    public final void method2211(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2054) {
            var3 = arg1 << 1;
        }
        class302.method5306(arg0, 0, var3);
        this.field1424 -= arg1;
        if (this.field1411 != null && this.field1424 <= 0) {
            this.field1424 += Statics.field2079 >> 4;
            method1777(this.field1411);
            this.method2237(this.field1411, this.field1411.method2300());
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
                        class116 var10 = null;
                        class116 var11 = this.field1427[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class119 var12 = var11.field1498;
                                if (var12 == null || var12.field1530 <= var8) {
                                    var11.field1499 = true;
                                    int var13 = var11.method2081();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1530 += var13;
                                    }
                                    if (var4 >= this.field1407) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2079();
                                    if (var14 != null) {
                                        int var15 = var11.field1497;
                                        while (var14 != null) {
                                            this.method2237(var14, var15 * var14.method2300() >> 8);
                                            var14 = var11.method2080();
                                        }
                                    }
                                    class116 var16 = var11.field1496;
                                    var11.field1496 = null;
                                    if (var10 == null) {
                                        this.field1427[var7] = var16;
                                    } else {
                                        var10.field1496 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1426[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1496;
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
                class116 var18 = this.field1427[var17];
                class116[] var19 = this.field1427;
                this.field1426[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class116 var21 = var18.field1496;
                    var18.field1496 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1424 < 0) {
            this.field1424 = 0;
        }
        if (this.field1411 != null) {
            this.field1411.method2082(arg0, 0, arg1);
        }
        this.field1413 = class298.method3576();
    }

    @ObfuscatedName("ba.az(Ldx;I)V")
    public static final void method1777(class116 arg0) {
        arg0.field1499 = false;
        if (arg0.field1498 != null) {
            arg0.field1498.field1530 = 0;
        }
        for (class116 var1 = arg0.method2079(); var1 != null; var1 = arg0.method2080()) {
            method1777(var1);
        }
    }

    @ObfuscatedName("dn.ae(Ldx;II)V")
    public final void method2237(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1426[var3];
        if (var4 == null) {
            this.field1427[var3] = arg0;
        } else {
            var4.field1496 = arg0;
        }
        this.field1426[var3] = arg0;
        arg0.field1497 = arg1;
    }

    @ObfuscatedName("dn.q(I)V")
    public void method685() throws Exception {
    }

    @ObfuscatedName("dn.w(IB)V")
    public void method686(int arg0) throws Exception {
    }

    @ObfuscatedName("dn.e(B)I")
    public int method687() throws Exception {
        return this.field1425;
    }

    @ObfuscatedName("dn.p()V")
    public void method688() throws Exception {
    }

    @ObfuscatedName("dn.k(B)V")
    public void method689() {
    }

    @ObfuscatedName("dn.l(I)V")
    public void method693() throws Exception {
    }
}
