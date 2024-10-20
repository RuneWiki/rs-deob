package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dq")
public class class106 {

    @ObfuscatedName("dq.k")
    public int[] field1386;

    @ObfuscatedName("dq.x")
    public class116 field1384;

    @ObfuscatedName("dq.j")
    public int field1395 = 32;

    @ObfuscatedName("dq.r")
    public long field1387 = class297.method3777();

    @ObfuscatedName("dq.e")
    public int field1388;

    @ObfuscatedName("dq.s")
    public int field1389;

    @ObfuscatedName("dq.b")
    public int field1390;

    @ObfuscatedName("dq.z")
    public long field1391 = 0L;

    @ObfuscatedName("dq.f")
    public int field1385 = 0;

    @ObfuscatedName("dq.g")
    public int field1381 = 0;

    @ObfuscatedName("dq.w")
    public int field1394 = 0;

    @ObfuscatedName("dq.u")
    public long field1397 = 0L;

    @ObfuscatedName("dq.y")
    public boolean field1396 = true;

    @ObfuscatedName("dq.ag")
    public int field1393 = 0;

    @ObfuscatedName("dq.ak")
    public class116[] field1398 = new class116[8];

    @ObfuscatedName("dq.av")
    public class116[] field1399 = new class116[8];

    @ObfuscatedName("kj.ag(Lcc;B)V")
    public static final void method5064(class100 arg0) {
        Statics.field2315 = arg0;
    }

    @ObfuscatedName("bn.ak(Lff;IIB)Ldq;")
    public static final class106 method1651(class167 arg0, int arg1, int arg2) {
        if (Statics.field1392 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class106 var3 = Statics.field2315.method741();
                var3.field1386 = new int[256 * (Statics.field544 ? 2 : 1)];
                var3.field1389 = arg2;
                var3.method766();
                var3.field1388 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1388 > 16384) {
                    var3.field1388 = 16384;
                }
                var3.method767(var3.field1388);
                if (Statics.field3297 > 0 && Statics.field3182 == null) {
                    Statics.field3182 = new class108();
                    Statics.field512 = Executors.newScheduledThreadPool(1);
                    Statics.field512.scheduleAtFixedRate(Statics.field3182, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3182 != null) {
                    if (Statics.field3182.field1414[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3182.field1414[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class106();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.av(Ldj;S)V")
    public final synchronized void method2346(class116 arg0) {
        this.field1384 = arg0;
    }

    @ObfuscatedName("dq.am(I)V")
    public final synchronized void method2347() {
        if (this.field1386 == null) {
            return;
        }
        long var1 = class297.method3777();
        try {
            if (this.field1391 != 0L) {
                if (var1 < this.field1391) {
                    return;
                }
                this.method767(this.field1388);
                this.field1391 = 0L;
                this.field1396 = true;
            }
            int var3 = this.method770();
            if (this.field1394 - var3 > this.field1385) {
                this.field1385 = this.field1394 - var3;
            }
            int var4 = this.field1390 + this.field1389;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1388) {
                this.field1388 += 1024;
                if (this.field1388 > 16384) {
                    this.field1388 = 16384;
                }
                this.method786();
                this.method767(this.field1388);
                var3 = 0;
                this.field1396 = true;
                if (var4 + 256 > this.field1388) {
                    var4 = this.field1388 - 256;
                    this.field1390 = var4 - this.field1389;
                }
            }
            while (var3 < var4) {
                this.method2352(this.field1386, 256);
                this.method787();
                var3 += 256;
            }
            if (var1 > this.field1397) {
                if (this.field1396) {
                    this.field1396 = false;
                } else if (this.field1385 == 0 && this.field1381 == 0) {
                    this.method786();
                    this.field1391 = var1 + 2000L;
                    return;
                } else {
                    this.field1390 = Math.min(this.field1381, this.field1385);
                    this.field1381 = this.field1385;
                }
                this.field1385 = 0;
                this.field1397 = var1 + 2000L;
            }
            this.field1394 = var3;
        } catch (Exception var8) {
            this.method786();
            this.field1391 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1387 + 500000L) {
                var1 = this.field1387;
            }
            while (var1 > this.field1387 + 5000L) {
                this.method2351(256);
                this.field1387 += (long) (256000 / Statics.field1392);
            }
        } catch (Exception var7) {
            this.field1387 = var1;
        }
    }

    @ObfuscatedName("dq.ab(I)V")
    public final void method2348() {
        this.field1396 = true;
    }

    @ObfuscatedName("dq.ax(I)V")
    public final synchronized void method2349() {
        this.field1396 = true;
        try {
            this.method771();
        } catch (Exception var2) {
            this.method786();
            this.field1391 = class297.method3777() + 2000L;
        }
    }

    @ObfuscatedName("dq.al(I)V")
    public final synchronized void method2377() {
        if (Statics.field3182 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3182.field1414[var2] == this) {
                    Statics.field3182.field1414[var2] = null;
                }
                if (Statics.field3182.field1414[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field512.shutdownNow();
                Statics.field512 = null;
                Statics.field3182 = null;
            }
        }
        this.method786();
        this.field1386 = null;
    }

    @ObfuscatedName("dq.ap(II)V")
    public final void method2351(int arg0) {
        this.field1393 -= arg0;
        if (this.field1393 < 0) {
            this.field1393 = 0;
        }
        if (this.field1384 != null) {
            this.field1384.method2224(arg0);
        }
    }

    @ObfuscatedName("dq.aj([II)V")
    public final void method2352(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field544) {
            var3 = arg1 << 1;
        }
        class301.method5360(arg0, 0, var3);
        this.field1393 -= arg1;
        if (this.field1384 != null && this.field1393 <= 0) {
            this.field1393 += Statics.field1392 >> 4;
            Statics.method3775(this.field1384);
            this.method2353(this.field1384, this.field1384.method2441());
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
                        class116 var11 = this.field1398[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class119 var12 = var11.field1470;
                                if (var12 == null || var12.field1502 <= var8) {
                                    var11.field1469 = true;
                                    int var13 = var11.method2217();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1502 += var13;
                                    }
                                    if (var4 >= this.field1395) {
                                        break label105;
                                    }
                                    class116 var14 = var11.method2215();
                                    if (var14 != null) {
                                        int var15 = var11.field1468;
                                        while (var14 != null) {
                                            this.method2353(var14, var15 * var14.method2441() >> 8);
                                            var14 = var11.method2223();
                                        }
                                    }
                                    class116 var16 = var11.field1471;
                                    var11.field1471 = null;
                                    if (var10 == null) {
                                        this.field1398[var7] = var16;
                                    } else {
                                        var10.field1471 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1399[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1471;
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
                class116 var18 = this.field1398[var17];
                class116[] var19 = this.field1398;
                this.field1399[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class116 var21 = var18.field1471;
                    var18.field1471 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1393 < 0) {
            this.field1393 = 0;
        }
        if (this.field1384 != null) {
            this.field1384.method2218(arg0, 0, arg1);
        }
        this.field1387 = class297.method3777();
    }

    @ObfuscatedName("dq.au(Ldj;IB)V")
    public final void method2353(class116 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class116 var4 = this.field1399[var3];
        if (var4 == null) {
            this.field1398[var3] = arg0;
        } else {
            var4.field1471 = arg0;
        }
        this.field1399[var3] = arg0;
        arg0.field1468 = arg1;
    }

    @ObfuscatedName("dq.a(B)V")
    public void method766() throws Exception {
    }

    @ObfuscatedName("dq.t(II)V")
    public void method767(int arg0) throws Exception {
    }

    @ObfuscatedName("dq.n(I)I")
    public int method770() throws Exception {
        return this.field1388;
    }

    @ObfuscatedName("dq.q()V")
    public void method787() throws Exception {
    }

    @ObfuscatedName("dq.v(I)V")
    public void method786() {
    }

    @ObfuscatedName("dq.l(I)V")
    public void method771() throws Exception {
    }
}
