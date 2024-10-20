package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.r")
    public int[] field1541;

    @ObfuscatedName("dk.p")
    public class118 field1544;

    @ObfuscatedName("dk.q")
    public int field1543 = 32;

    @ObfuscatedName("dk.f")
    public long field1545 = class197.method4873();

    @ObfuscatedName("dk.j")
    public int field1539;

    @ObfuscatedName("dk.v")
    public int field1546;

    @ObfuscatedName("dk.u")
    public int field1547;

    @ObfuscatedName("dk.k")
    public long field1548 = 0L;

    @ObfuscatedName("dk.w")
    public int field1549 = 0;

    @ObfuscatedName("dk.m")
    public int field1537 = 0;

    @ObfuscatedName("dk.a")
    public int field1551 = 0;

    @ObfuscatedName("dk.x")
    public long field1552 = 0L;

    @ObfuscatedName("dk.t")
    public boolean field1553 = true;

    @ObfuscatedName("dk.ay")
    public int field1554 = 0;

    @ObfuscatedName("dk.as")
    public class118[] field1555 = new class118[8];

    @ObfuscatedName("dk.av")
    public class118[] field1542 = new class118[8];

    @ObfuscatedName("ic.x(Lfl;III)Ldk;")
    public static final class108 method4246(class167 arg0, int arg1, int arg2) {
        if (Statics.field1550 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field798.method732();
                var3.field1541 = new int[256 * (Statics.field1536 ? 2 : 1)];
                var3.field1546 = arg2;
                var3.method761();
                var3.field1539 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1539 > 16384) {
                    var3.field1539 = 16384;
                }
                var3.method755(var3.field1539);
                if (Statics.field3551 > 0 && Statics.field310 == null) {
                    Statics.field310 = new class110();
                    Statics.field1556 = Executors.newScheduledThreadPool(1);
                    Statics.field1556.scheduleAtFixedRate(Statics.field310, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field310 != null) {
                    if (Statics.field310.field1568[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field310.field1568[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.t(Ldh;I)V")
    public final synchronized void method2157(class118 arg0) {
        this.field1544 = arg0;
    }

    @ObfuscatedName("dk.ax(B)V")
    public final synchronized void method2173() {
        if (this.field1541 == null) {
            return;
        }
        long var1 = class197.method4873();
        try {
            if (this.field1548 != 0L) {
                if (var1 < this.field1548) {
                    return;
                }
                this.method755(this.field1539);
                this.field1548 = 0L;
                this.field1553 = true;
            }
            int var3 = this.method763();
            if (this.field1551 - var3 > this.field1549) {
                this.field1549 = this.field1551 - var3;
            }
            int var4 = this.field1547 + this.field1546;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1539) {
                this.field1539 += 1024;
                if (this.field1539 > 16384) {
                    this.field1539 = 16384;
                }
                this.method757();
                this.method755(this.field1539);
                var3 = 0;
                this.field1553 = true;
                if (var4 + 256 > this.field1539) {
                    var4 = this.field1539 - 256;
                    this.field1547 = var4 - this.field1546;
                }
            }
            while (var3 < var4) {
                this.method2162(this.field1541, 256);
                this.method756();
                var3 += 256;
            }
            if (var1 > this.field1552) {
                if (this.field1553) {
                    this.field1553 = false;
                } else if (this.field1549 == 0 && this.field1537 == 0) {
                    this.method757();
                    this.field1548 = var1 + 2000L;
                    return;
                } else {
                    this.field1547 = Math.min(this.field1537, this.field1549);
                    this.field1537 = this.field1549;
                }
                this.field1549 = 0;
                this.field1552 = var1 + 2000L;
            }
            this.field1551 = var3;
        } catch (Exception var8) {
            this.method757();
            this.field1548 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1545 + 500000L) {
                var1 = this.field1545;
            }
            while (var1 > this.field1545 + 5000L) {
                this.method2161(256);
                this.field1545 += (long) (256000 / Statics.field1550);
            }
        } catch (Exception var7) {
            this.field1545 = var1;
        }
    }

    @ObfuscatedName("dk.ai(B)V")
    public final void method2158() {
        this.field1553 = true;
    }

    @ObfuscatedName("dk.aj(I)V")
    public final synchronized void method2159() {
        this.field1553 = true;
        try {
            this.method758();
        } catch (Exception var2) {
            this.method757();
            this.field1548 = class197.method4873() + 2000L;
        }
    }

    @ObfuscatedName("dk.ac(B)V")
    public final synchronized void method2168() {
        if (Statics.field310 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field310.field1568[var2] == this) {
                    Statics.field310.field1568[var2] = null;
                }
                if (Statics.field310.field1568[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1556.shutdownNow();
                Statics.field1556 = null;
                Statics.field310 = null;
            }
        }
        this.method757();
        this.field1541 = null;
    }

    @ObfuscatedName("dk.ag(II)V")
    public final void method2161(int arg0) {
        this.field1554 -= arg0;
        if (this.field1554 < 0) {
            this.field1554 = 0;
        }
        if (this.field1544 != null) {
            this.field1544.method2040(arg0);
        }
    }

    @ObfuscatedName("dk.ay([II)V")
    public final void method2162(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1536) {
            var3 = arg1 << 1;
        }
        class206.method3641(arg0, 0, var3);
        this.field1554 -= arg1;
        if (this.field1544 != null && this.field1554 <= 0) {
            this.field1554 += Statics.field1550 >> 4;
            method1644(this.field1544);
            this.method2167(this.field1544, this.field1544.method2237());
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
                        class118 var11 = this.field1555[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1624;
                                if (var12 == null || var12.field1656 <= var8) {
                                    var11.field1622 = true;
                                    int var13 = var11.method2061();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1656 += var13;
                                    }
                                    if (var4 >= this.field1543) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method2035();
                                    if (var14 != null) {
                                        int var15 = var11.field1623;
                                        while (var14 != null) {
                                            this.method2167(var14, var15 * var14.method2237() >> 8);
                                            var14 = var11.method2032();
                                        }
                                    }
                                    class118 var16 = var11.field1625;
                                    var11.field1625 = null;
                                    if (var10 == null) {
                                        this.field1555[var7] = var16;
                                    } else {
                                        var10.field1625 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1542[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1625;
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
                class118 var18 = this.field1555[var17];
                class118[] var19 = this.field1555;
                this.field1542[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1625;
                    var18.field1625 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1554 < 0) {
            this.field1554 = 0;
        }
        if (this.field1544 != null) {
            this.field1544.method2038(arg0, 0, arg1);
        }
        this.field1545 = class197.method4873();
    }

    @ObfuscatedName("bx.as(Ldh;I)V")
    public static final void method1644(class118 arg0) {
        arg0.field1622 = false;
        if (arg0.field1624 != null) {
            arg0.field1624.field1656 = 0;
        }
        for (class118 var1 = arg0.method2035(); var1 != null; var1 = arg0.method2032()) {
            method1644(var1);
        }
    }

    @ObfuscatedName("dk.av(Ldh;IS)V")
    public final void method2167(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1542[var3];
        if (var4 == null) {
            this.field1555[var3] = arg0;
        } else {
            var4.field1625 = arg0;
        }
        this.field1542[var3] = arg0;
        arg0.field1623 = arg1;
    }

    @ObfuscatedName("dk.g(B)V")
    public void method761() throws Exception {
    }

    @ObfuscatedName("dk.e(II)V")
    public void method755(int arg0) throws Exception {
    }

    @ObfuscatedName("dk.b(I)I")
    public int method763() throws Exception {
        return this.field1539;
    }

    @ObfuscatedName("dk.z()V")
    public void method756() throws Exception {
    }

    @ObfuscatedName("dk.n(I)V")
    public void method757() {
    }

    @ObfuscatedName("dk.l(I)V")
    public void method758() throws Exception {
    }
}
