package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dv")
public class class106 {

    @ObfuscatedName("dv.a")
    public int[] field1387;

    @ObfuscatedName("dv.e")
    public class116 field1388;

    @ObfuscatedName("dv.w")
    public int field1389 = 32;

    @ObfuscatedName("dv.t")
    public long field1390 = class297.method502();

    @ObfuscatedName("dv.g")
    public int field1391;

    @ObfuscatedName("dv.x")
    public int field1392;

    @ObfuscatedName("dv.h")
    public int field1393;

    @ObfuscatedName("dv.s")
    public long field1394 = 0L;

    @ObfuscatedName("dv.f")
    public int field1384 = 0;

    @ObfuscatedName("dv.j")
    public int field1398 = 0;

    @ObfuscatedName("dv.d")
    public int field1397 = 0;

    @ObfuscatedName("dv.l")
    public long field1383 = 0L;

    @ObfuscatedName("dv.k")
    public boolean field1395 = true;

    @ObfuscatedName("dv.ar")
    public int field1400 = 0;

    @ObfuscatedName("dv.ab")
    public class116[] field1401 = new class116[8];

    @ObfuscatedName("dv.ax")
    public class116[] field1402 = new class116[8];

    @ObfuscatedName("k.l(Lcf;B)V")
    public static final void method281(class100 arg0) {
        Statics.field1399 = arg0;
    }

    @ObfuscatedName("b.k(Lfm;III)Ldv;")
    public static final class106 method137(class167 arg0, int arg1, int arg2) {
        if (Statics.field1930 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field1399.method720();
                var3.field1387 = new int[256 * (Statics.field1385 ? 2 : 1)];
                var3.field1392 = arg2;
                var3.method739();
                var3.field1391 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1391 > 16384) {
                    var3.field1391 = 16384;
                }
                var3.method740(var3.field1391);
                if (Statics.field1144 > 0 && Statics.field4042 == null) {
                    Statics.field4042 = new class108();
                    Statics.field1386 = Executors.newScheduledThreadPool(1);
                    Statics.field1386.scheduleAtFixedRate(Statics.field4042, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4042 != null) {
                    if (Statics.field4042.field1416[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4042.field1416[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dv.ac(Ldc;I)V")
    public final synchronized void method2190(class116 arg0) {
        this.field1388 = arg0;
    }

    @ObfuscatedName("dv.aa(B)V")
    public final synchronized void method2221() {
        if (this.field1387 == null) {
            return;
        }
        long var1 = class297.method502();
        try {
            if (this.field1394 != 0L) {
                if (var1 < this.field1394) {
                    return;
                }
                this.method740(this.field1391);
                this.field1394 = 0L;
                this.field1395 = true;
            }
            int var3 = this.method749();
            if (this.field1397 - var3 > this.field1384) {
                this.field1384 = this.field1397 - var3;
            }
            int var4 = this.field1393 + this.field1392;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1391) {
                this.field1391 += 1024;
                if (this.field1391 > 16384) {
                    this.field1391 = 16384;
                }
                this.method743();
                this.method740(this.field1391);
                var3 = 0;
                this.field1395 = true;
                if (var4 + 256 > this.field1391) {
                    var4 = this.field1391 - 256;
                    this.field1393 = var4 - this.field1392;
                }
            }
            while (var3 < var4) {
                this.method2213(this.field1387, 256);
                this.method742();
                var3 += 256;
            }
            if (var1 > this.field1383) {
                if (this.field1395) {
                    this.field1395 = false;
                } else if (this.field1384 == 0 && this.field1398 == 0) {
                    this.method743();
                    this.field1394 = var1 + 2000L;
                    return;
                } else {
                    this.field1393 = Math.min(this.field1398, this.field1384);
                    this.field1398 = this.field1384;
                }
                this.field1384 = 0;
                this.field1383 = var1 + 2000L;
            }
            this.field1397 = var3;
        } catch (Exception var8) {
            this.method743();
            this.field1394 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1390 + 500000L) {
                var1 = this.field1390;
            }
            while (var1 > this.field1390 + 5000L) {
                this.method2208(256);
                this.field1390 += (long) (256000 / Statics.field1930);
            }
        } catch (Exception var7) {
            this.field1390 = var1;
        }
    }

    @ObfuscatedName("dv.ap(I)V")
    public final void method2191() {
        this.field1395 = true;
    }

    @ObfuscatedName("dv.ar(I)V")
    public final synchronized void method2194() {
        this.field1395 = true;
        try {
            this.method744();
        } catch (Exception var2) {
            this.method743();
            this.field1394 = class297.method502() + 2000L;
        }
    }

    @ObfuscatedName("dv.ab(I)V")
    public final synchronized void method2193() {
        if (Statics.field4042 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4042.field1416[var2] == this) {
                    Statics.field4042.field1416[var2] = null;
                }
                if (Statics.field4042.field1416[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1386.shutdownNow();
                Statics.field1386 = null;
                Statics.field4042 = null;
            }
        }
        this.method743();
        this.field1387 = null;
    }

    @ObfuscatedName("dv.ax(II)V")
    public final void method2208(int arg0) {
        this.field1400 -= arg0;
        if (this.field1400 < 0) {
            this.field1400 = 0;
        }
        if (this.field1388 != null) {
            this.field1388.method2101(arg0);
        }
    }

    @ObfuscatedName("dv.as([II)V")
    public final void method2213(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1385) {
            var3 = arg1 << 1;
        }
        class301.method5218(arg0, 0, var3);
        this.field1400 -= arg1;
        if (this.field1388 != null && this.field1400 <= 0) {
            this.field1400 += Statics.field1930 >> 4;
            method2023(this.field1388);
            this.method2196(this.field1388, this.field1388.method2287());
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
                        class116 var11 = this.field1401[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class119 var12 = var11.field1465;
                                if (var12 == null || var12.field1496 <= var8) {
                                    var11.field1462 = true;
                                    int var13 = var11.method2074();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1496 += var13;
                                    }
                                    if (var4 >= this.field1389) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2075();
                                    if (var14 != null) {
                                        int var15 = var11.field1463;
                                        while (var14 != null) {
                                            this.method2196(var14, var15 * var14.method2287() >> 8);
                                            var14 = var11.method2076();
                                        }
                                    }
                                    class116 var16 = var11.field1464;
                                    var11.field1464 = null;
                                    if (var10 == null) {
                                        this.field1401[var7] = var16;
                                    } else {
                                        var10.field1464 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1402[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1464;
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
                class116 var18 = this.field1401[var17];
                class116[] var19 = this.field1401;
                this.field1402[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class116 var21 = var18.field1464;
                    var18.field1464 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1400 < 0) {
            this.field1400 = 0;
        }
        if (this.field1388 != null) {
            this.field1388.method2078(arg0, 0, arg1);
        }
        this.field1390 = class297.method502();
    }

    @ObfuscatedName("ce.ao(Ldc;I)V")
    public static final void method2023(class116 arg0) {
        arg0.field1462 = false;
        if (arg0.field1465 != null) {
            arg0.field1465.field1496 = 0;
        }
        for (class116 var1 = arg0.method2075(); var1 != null; var1 = arg0.method2076()) {
            method2023(var1);
        }
    }

    @ObfuscatedName("dv.al(Ldc;II)V")
    public final void method2196(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1402[var3];
        if (var4 == null) {
            this.field1401[var3] = arg0;
        } else {
            var4.field1464 = arg0;
        }
        this.field1402[var3] = arg0;
        arg0.field1463 = arg1;
    }

    @ObfuscatedName("dv.z(B)V")
    public void method739() throws Exception {
    }

    @ObfuscatedName("dv.n(IS)V")
    public void method740(int arg0) throws Exception {
    }

    @ObfuscatedName("dv.v(B)I")
    public int method749() throws Exception {
        return this.field1391;
    }

    @ObfuscatedName("dv.u()V")
    public void method742() throws Exception {
    }

    @ObfuscatedName("dv.r(I)V")
    public void method743() {
    }

    @ObfuscatedName("dv.p(I)V")
    public void method744() throws Exception {
    }
}
