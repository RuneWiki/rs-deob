package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dg")
public class class108 {

    @ObfuscatedName("dg.i")
    public int[] field1553;

    @ObfuscatedName("dg.u")
    public class118 field1549;

    @ObfuscatedName("dg.q")
    public int field1555 = 32;

    @ObfuscatedName("dg.v")
    public long field1556 = class197.method1501();

    @ObfuscatedName("dg.f")
    public int field1571;

    @ObfuscatedName("dg.b")
    public int field1550;

    @ObfuscatedName("dg.c")
    public int field1559;

    @ObfuscatedName("dg.j")
    public long field1560 = 0L;

    @ObfuscatedName("dg.l")
    public int field1561 = 0;

    @ObfuscatedName("dg.g")
    public int field1562 = 0;

    @ObfuscatedName("dg.w")
    public int field1563 = 0;

    @ObfuscatedName("dg.o")
    public long field1564 = 0L;

    @ObfuscatedName("dg.a")
    public boolean field1565 = true;

    @ObfuscatedName("dg.au")
    public int field1567 = 0;

    @ObfuscatedName("dg.al")
    public class118[] field1572 = new class118[8];

    @ObfuscatedName("dg.af")
    public class118[] field1569 = new class118[8];

    @ObfuscatedName("ao.ap(Lfv;IIB)Ldg;")
    public static final class108 method499(class167 arg0, int arg1, int arg2) {
        if (Statics.field646 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field1566.method673();
                var3.field1553 = new int[256 * (Statics.field1557 ? 2 : 1)];
                var3.field1550 = arg2;
                var3.method701();
                var3.field1571 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1571 > 16384) {
                    var3.field1571 = 16384;
                }
                var3.method706(var3.field1571);
                if (Statics.field310 > 0 && Statics.field1551 == null) {
                    Statics.field1551 = new class110();
                    Statics.field3016 = Executors.newScheduledThreadPool(1);
                    Statics.field3016.scheduleAtFixedRate(Statics.field1551, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1551 != null) {
                    if (Statics.field1551.field1587[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1551.field1587[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dg.ac(Ldt;B)V")
    public final synchronized void method2081(class118 arg0) {
        this.field1549 = arg0;
    }

    @ObfuscatedName("dg.aw(B)V")
    public final synchronized void method2082() {
        if (this.field1553 == null) {
            return;
        }
        long var1 = class197.method1501();
        try {
            if (this.field1560 != 0L) {
                if (var1 < this.field1560) {
                    return;
                }
                this.method706(this.field1571);
                this.field1560 = 0L;
                this.field1565 = true;
            }
            int var3 = this.method702();
            if (this.field1563 - var3 > this.field1561) {
                this.field1561 = this.field1563 - var3;
            }
            int var4 = this.field1559 + this.field1550;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1571) {
                this.field1571 += 1024;
                if (this.field1571 > 16384) {
                    this.field1571 = 16384;
                }
                this.method704();
                this.method706(this.field1571);
                var3 = 0;
                this.field1565 = true;
                if (var4 + 256 > this.field1571) {
                    var4 = this.field1571 - 256;
                    this.field1559 = var4 - this.field1550;
                }
            }
            while (var3 < var4) {
                this.method2083(this.field1553, 256);
                this.method717();
                var3 += 256;
            }
            if (var1 > this.field1564) {
                if (this.field1565) {
                    this.field1565 = false;
                } else if (this.field1561 == 0 && this.field1562 == 0) {
                    this.method704();
                    this.field1560 = var1 + 2000L;
                    return;
                } else {
                    this.field1559 = Math.min(this.field1562, this.field1561);
                    this.field1562 = this.field1561;
                }
                this.field1561 = 0;
                this.field1564 = var1 + 2000L;
            }
            this.field1563 = var3;
        } catch (Exception var8) {
            this.method704();
            this.field1560 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1556 + 500000L) {
                var1 = this.field1556;
            }
            while (var1 > this.field1556 + 5000L) {
                this.method2091(256);
                this.field1556 += (long) (256000 / Statics.field646);
            }
        } catch (Exception var7) {
            this.field1556 = var1;
        }
    }

    @ObfuscatedName("dg.as(I)V")
    public final void method2088() {
        this.field1565 = true;
    }

    @ObfuscatedName("dg.au(I)V")
    public final synchronized void method2084() {
        this.field1565 = true;
        try {
            this.method713();
        } catch (Exception var2) {
            this.method704();
            this.field1560 = class197.method1501() + 2000L;
        }
    }

    @ObfuscatedName("dg.al(B)V")
    public final synchronized void method2085() {
        if (Statics.field1551 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1551.field1587[var2] == this) {
                    Statics.field1551.field1587[var2] = null;
                }
                if (Statics.field1551.field1587[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3016.shutdownNow();
                Statics.field3016 = null;
                Statics.field1551 = null;
            }
        }
        this.method704();
        this.field1553 = null;
    }

    @ObfuscatedName("dg.af(IB)V")
    public final void method2091(int arg0) {
        this.field1567 -= arg0;
        if (this.field1567 < 0) {
            this.field1567 = 0;
        }
        if (this.field1549 != null) {
            this.field1549.method1952(arg0);
        }
    }

    @ObfuscatedName("dg.ai([II)V")
    public final void method2083(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1557) {
            var3 = arg1 << 1;
        }
        class206.method3629(arg0, 0, var3);
        this.field1567 -= arg1;
        if (this.field1549 != null && this.field1567 <= 0) {
            this.field1567 += Statics.field646 >> 4;
            method1569(this.field1549);
            this.method2086(this.field1549, this.field1549.method2172());
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
                        class118 var10 = null;
                        class118 var11 = this.field1572[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1642;
                                if (var12 == null || var12.field1673 <= var8) {
                                    var11.field1640 = true;
                                    int var13 = var11.method1973();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1673 += var13;
                                    }
                                    if (var4 >= this.field1555) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method1947();
                                    if (var14 != null) {
                                        int var15 = var11.field1639;
                                        while (var14 != null) {
                                            this.method2086(var14, var15 * var14.method2172() >> 8);
                                            var14 = var11.method1960();
                                        }
                                    }
                                    class118 var16 = var11.field1641;
                                    var11.field1641 = null;
                                    if (var10 == null) {
                                        this.field1572[var7] = var16;
                                    } else {
                                        var10.field1641 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1569[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1641;
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
                class118 var18 = this.field1572[var17];
                class118[] var19 = this.field1572;
                this.field1569[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1641;
                    var18.field1641 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1567 < 0) {
            this.field1567 = 0;
        }
        if (this.field1549 != null) {
            this.field1549.method1949(arg0, 0, arg1);
        }
        this.field1556 = class197.method1501();
    }

    @ObfuscatedName("cg.az(Ldt;B)V")
    public static final void method1569(class118 arg0) {
        arg0.field1640 = false;
        if (arg0.field1642 != null) {
            arg0.field1642.field1673 = 0;
        }
        for (class118 var1 = arg0.method1947(); var1 != null; var1 = arg0.method1960()) {
            method1569(var1);
        }
    }

    @ObfuscatedName("dg.aq(Ldt;II)V")
    public final void method2086(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1569[var3];
        if (var4 == null) {
            this.field1572[var3] = arg0;
        } else {
            var4.field1641 = arg0;
        }
        this.field1569[var3] = arg0;
        arg0.field1639 = arg1;
    }

    @ObfuscatedName("dg.d(B)V")
    public void method701() throws Exception {
    }

    @ObfuscatedName("dg.z(IB)V")
    public void method706(int arg0) throws Exception {
    }

    @ObfuscatedName("dg.n(I)I")
    public int method702() throws Exception {
        return this.field1571;
    }

    @ObfuscatedName("dg.r()V")
    public void method717() throws Exception {
    }

    @ObfuscatedName("dg.e(I)V")
    public void method704() {
    }

    @ObfuscatedName("dg.y(I)V")
    public void method713() throws Exception {
    }
}
