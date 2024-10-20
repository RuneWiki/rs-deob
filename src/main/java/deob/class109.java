package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dd")
public class class109 {

    @ObfuscatedName("dd.w")
    public int[] field1551;

    @ObfuscatedName("dd.t")
    public class119 field1543;

    @ObfuscatedName("dd.o")
    public int field1544 = 32;

    @ObfuscatedName("dd.a")
    public long field1550 = class187.method938();

    @ObfuscatedName("dd.i")
    public int field1546;

    @ObfuscatedName("dd.m")
    public int field1547;

    @ObfuscatedName("dd.x")
    public int field1548;

    @ObfuscatedName("dd.l")
    public long field1549 = 0L;

    @ObfuscatedName("dd.j")
    public int field1545 = 0;

    @ObfuscatedName("dd.g")
    public int field1558 = 0;

    @ObfuscatedName("dd.c")
    public int field1552 = 0;

    @ObfuscatedName("dd.k")
    public long field1539 = 0L;

    @ObfuscatedName("dd.q")
    public boolean field1554 = true;

    @ObfuscatedName("dd.af")
    public int field1555 = 0;

    @ObfuscatedName("dd.az")
    public class119[] field1553 = new class119[8];

    @ObfuscatedName("dd.ae")
    public class119[] field1557 = new class119[8];

    @ObfuscatedName("aw.k(Lcw;I)V")
    public static final void method200(class103 arg0) {
        Statics.field2179 = arg0;
    }

    @ObfuscatedName("ce.q(Lff;IIB)Ldd;")
    public static final class109 method1735(class157 arg0, int arg1, int arg2) {
        if (Statics.field1542 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class109 var3 = Statics.field2179.method660();
                var3.field1551 = new int[(Statics.field13 ? 2 : 1) * 256];
                var3.field1547 = arg2;
                var3.method686();
                var3.field1546 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1546 > 16384) {
                    var3.field1546 = 16384;
                }
                var3.method696(var3.field1546);
                if (Statics.field1541 > 0 && Statics.field4 == null) {
                    Statics.field4 = new class111();
                    Statics.field476 = Executors.newScheduledThreadPool(1);
                    Statics.field476.scheduleAtFixedRate(Statics.field4, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4 != null) {
                    if (Statics.field4.field1573[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4.field1573[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class109();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dd.ac(Ldk;B)V")
    public final synchronized void method1906(class119 arg0) {
        this.field1543 = arg0;
    }

    @ObfuscatedName("dd.aw(I)V")
    public final synchronized void method1915() {
        if (this.field1551 == null) {
            return;
        }
        long var1 = class187.method938();
        try {
            if (this.field1549 != 0L) {
                if (var1 < this.field1549) {
                    return;
                }
                this.method696(this.field1546);
                this.field1549 = 0L;
                this.field1554 = true;
            }
            int var3 = this.method685();
            if (this.field1552 - var3 > this.field1545) {
                this.field1545 = this.field1552 - var3;
            }
            int var4 = this.field1548 + this.field1547;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1546) {
                this.field1546 += 1024;
                if (this.field1546 > 16384) {
                    this.field1546 = 16384;
                }
                this.method697();
                this.method696(this.field1546);
                var3 = 0;
                this.field1554 = true;
                if (var4 + 256 > this.field1546) {
                    var4 = this.field1546 - 256;
                    this.field1548 = var4 - this.field1547;
                }
            }
            while (var3 < var4) {
                this.method1928(this.field1551, 256);
                this.method687();
                var3 += 256;
            }
            if (var1 > this.field1539) {
                if (this.field1554) {
                    this.field1554 = false;
                } else if (this.field1545 == 0 && this.field1558 == 0) {
                    this.method697();
                    this.field1549 = var1 + 2000L;
                    return;
                } else {
                    this.field1548 = Math.min(this.field1558, this.field1545);
                    this.field1558 = this.field1545;
                }
                this.field1545 = 0;
                this.field1539 = var1 + 2000L;
            }
            this.field1552 = var3;
        } catch (Exception var8) {
            this.method697();
            this.field1549 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1550 + 500000L) {
                var1 = this.field1550;
            }
            while (var1 > this.field1550 + 5000L) {
                this.method1911(256);
                this.field1550 += (long) (256000 / Statics.field1542);
            }
        } catch (Exception var7) {
            this.field1550 = var1;
        }
    }

    @ObfuscatedName("dd.at(I)V")
    public final void method1908() {
        this.field1554 = true;
    }

    @ObfuscatedName("dd.ag(I)V")
    public final synchronized void method1909() {
        this.field1554 = true;
        try {
            this.method690();
        } catch (Exception var2) {
            this.method697();
            this.field1549 = class187.method938() + 2000L;
        }
    }

    @ObfuscatedName("dd.ad(B)V")
    public final synchronized void method1910() {
        if (Statics.field4 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4.field1573[var2] == this) {
                    Statics.field4.field1573[var2] = null;
                }
                if (Statics.field4.field1573[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field476.shutdownNow();
                Statics.field476 = null;
                Statics.field4 = null;
            }
        }
        this.method697();
        this.field1551 = null;
    }

    @ObfuscatedName("dd.af(IS)V")
    public final void method1911(int arg0) {
        this.field1555 -= arg0;
        if (this.field1555 < 0) {
            this.field1555 = 0;
        }
        if (this.field1543 != null) {
            this.field1543.method1799(arg0);
        }
    }

    @ObfuscatedName("dd.az([II)V")
    public final void method1928(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field13) {
            var3 = arg1 << 1;
        }
        class195.method3347(arg0, 0, var3);
        this.field1555 -= arg1;
        if (this.field1543 != null && this.field1555 <= 0) {
            this.field1555 += Statics.field1542 >> 4;
            method1770(this.field1543);
            this.method1914(this.field1543, this.field1543.method1998());
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
                        class119 var10 = null;
                        class119 var11 = this.field1553[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1632;
                                if (var12 == null || var12.field1663 <= var8) {
                                    var11.field1629 = true;
                                    int var13 = var11.method1815();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1663 += var13;
                                    }
                                    if (var4 >= this.field1544) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1779();
                                    if (var14 != null) {
                                        int var15 = var11.field1630;
                                        while (var14 != null) {
                                            this.method1914(var14, var15 * var14.method1998() >> 8);
                                            var14 = var11.method1778();
                                        }
                                    }
                                    class119 var16 = var11.field1631;
                                    var11.field1631 = null;
                                    if (var10 == null) {
                                        this.field1553[var7] = var16;
                                    } else {
                                        var10.field1631 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1557[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1631;
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
                class119 var18 = this.field1553[var17];
                class119[] var19 = this.field1553;
                this.field1557[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1631;
                    var18.field1631 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1555 < 0) {
            this.field1555 = 0;
        }
        if (this.field1543 != null) {
            this.field1543.method1780(arg0, 0, arg1);
        }
        this.field1550 = class187.method938();
    }

    @ObfuscatedName("cg.ae(Ldk;I)V")
    public static final void method1770(class119 arg0) {
        arg0.field1629 = false;
        if (arg0.field1632 != null) {
            arg0.field1632.field1663 = 0;
        }
        for (class119 var1 = arg0.method1779(); var1 != null; var1 = arg0.method1778()) {
            method1770(var1);
        }
    }

    @ObfuscatedName("dd.av(Ldk;II)V")
    public final void method1914(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1557[var3];
        if (var4 == null) {
            this.field1553[var3] = arg0;
        } else {
            var4.field1631 = arg0;
        }
        this.field1557[var3] = arg0;
        arg0.field1630 = arg1;
    }

    @ObfuscatedName("dd.n(I)V")
    public void method686() throws Exception {
    }

    @ObfuscatedName("dd.v(IS)V")
    public void method696(int arg0) throws Exception {
    }

    @ObfuscatedName("dd.y(I)I")
    public int method685() throws Exception {
        return this.field1546;
    }

    @ObfuscatedName("dd.r()V")
    public void method687() throws Exception {
    }

    @ObfuscatedName("dd.h(I)V")
    public void method697() {
    }

    @ObfuscatedName("dd.d(B)V")
    public void method690() throws Exception {
    }
}
