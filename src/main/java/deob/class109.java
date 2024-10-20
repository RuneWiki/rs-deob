package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("do")
public class class109 {

    @ObfuscatedName("do.c")
    public int[] field1549;

    @ObfuscatedName("do.y")
    public class119 field1550;

    @ObfuscatedName("do.j")
    public int field1551 = 32;

    @ObfuscatedName("do.f")
    public long field1552 = class183.method2932();

    @ObfuscatedName("do.s")
    public int field1553;

    @ObfuscatedName("do.e")
    public int field1545;

    @ObfuscatedName("do.q")
    public int field1563;

    @ObfuscatedName("do.h")
    public long field1556 = 0L;

    @ObfuscatedName("do.i")
    public int field1557 = 0;

    @ObfuscatedName("do.o")
    public int field1558 = 0;

    @ObfuscatedName("do.w")
    public int field1559 = 0;

    @ObfuscatedName("do.g")
    public long field1560 = 0L;

    @ObfuscatedName("do.a")
    public boolean field1561 = true;

    @ObfuscatedName("do.au")
    public int field1564 = 0;

    @ObfuscatedName("do.al")
    public class119[] field1555 = new class119[8];

    @ObfuscatedName("do.ae")
    public class119[] field1567 = new class119[8];

    @ObfuscatedName("a.w(Lcf;I)V")
    public static final void method182(class103 arg0) {
        Statics.field21 = arg0;
    }

    @ObfuscatedName("bc.ah(IZII)V")
    public static final void method1018(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1546 = arg0;
        Statics.field1548 = arg1;
        Statics.field1547 = arg2;
    }

    @ObfuscatedName("ce.ak(Lel;III)Ldo;")
    public static final class109 method1761(class156 arg0, int arg1, int arg2) {
        if (Statics.field1546 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class109 var3 = Statics.field21.method683();
                var3.field1549 = new int[(Statics.field1548 ? 2 : 1) * 256];
                var3.field1545 = arg2;
                var3.method721();
                var3.field1553 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1553 > 16384) {
                    var3.field1553 = 16384;
                }
                var3.method708(var3.field1553);
                if (Statics.field1547 > 0 && Statics.field448 == null) {
                    Statics.field448 = new class111();
                    Statics.field348 = Executors.newScheduledThreadPool(1);
                    Statics.field348.scheduleAtFixedRate(Statics.field448, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field448 != null) {
                    if (Statics.field448.field1580[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field448.field1580[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class109();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.aa(Ldn;I)V")
    public final synchronized void method1943(class119 arg0) {
        this.field1550 = arg0;
    }

    @ObfuscatedName("do.ax(I)V")
    public final synchronized void method1944() {
        if (this.field1549 == null) {
            return;
        }
        long var1 = class183.method2932();
        try {
            if (this.field1556 != 0L) {
                if (var1 < this.field1556) {
                    return;
                }
                this.method708(this.field1553);
                this.field1556 = 0L;
                this.field1561 = true;
            }
            int var3 = this.method709();
            if (this.field1559 - var3 > this.field1557) {
                this.field1557 = this.field1559 - var3;
            }
            int var4 = this.field1563 + this.field1545;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1553) {
                this.field1553 += 1024;
                if (this.field1553 > 16384) {
                    this.field1553 = 16384;
                }
                this.method707();
                this.method708(this.field1553);
                var3 = 0;
                this.field1561 = true;
                if (var4 + 256 > this.field1553) {
                    var4 = this.field1553 - 256;
                    this.field1563 = var4 - this.field1545;
                }
            }
            while (var3 < var4) {
                this.method1962(this.field1549, 256);
                this.method710();
                var3 += 256;
            }
            if (var1 > this.field1560) {
                if (this.field1561) {
                    this.field1561 = false;
                } else if (this.field1557 == 0 && this.field1558 == 0) {
                    this.method707();
                    this.field1556 = var1 + 2000L;
                    return;
                } else {
                    this.field1563 = Math.min(this.field1558, this.field1557);
                    this.field1558 = this.field1557;
                }
                this.field1557 = 0;
                this.field1560 = var1 + 2000L;
            }
            this.field1559 = var3;
        } catch (Exception var8) {
            this.method707();
            this.field1556 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1552 + 500000L) {
                var1 = this.field1552;
            }
            while (var1 > this.field1552 + 5000L) {
                this.method1980(256);
                this.field1552 += (long) (256000 / Statics.field1546);
            }
        } catch (Exception var7) {
            this.field1552 = var1;
        }
    }

    @ObfuscatedName("do.aq(I)V")
    public final void method1945() {
        this.field1561 = true;
    }

    @ObfuscatedName("do.au(I)V")
    public final synchronized void method1969() {
        this.field1561 = true;
        try {
            this.method713();
        } catch (Exception var2) {
            this.method707();
            this.field1556 = class183.method2932() + 2000L;
        }
    }

    @ObfuscatedName("do.al(I)V")
    public final synchronized void method1946() {
        if (Statics.field448 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field448.field1580[var2] == this) {
                    Statics.field448.field1580[var2] = null;
                }
                if (Statics.field448.field1580[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field348.shutdownNow();
                Statics.field348 = null;
                Statics.field448 = null;
            }
        }
        this.method707();
        this.field1549 = null;
    }

    @ObfuscatedName("do.ae(II)V")
    public final void method1980(int arg0) {
        this.field1564 -= arg0;
        if (this.field1564 < 0) {
            this.field1564 = 0;
        }
        if (this.field1550 != null) {
            this.field1550.method1815(arg0);
        }
    }

    @ObfuscatedName("do.aj([II)V")
    public final void method1962(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1548) {
            var3 = arg1 << 1;
        }
        class191.method3348(arg0, 0, var3);
        this.field1564 -= arg1;
        if (this.field1550 != null && this.field1564 <= 0) {
            this.field1564 += Statics.field1546 >> 4;
            method3902(this.field1550);
            this.method1948(this.field1550, this.field1550.method2052());
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
                        class119 var11 = this.field1555[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1635;
                                if (var12 == null || var12.field1667 <= var8) {
                                    var11.field1636 = true;
                                    int var13 = var11.method1812();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1667 += var13;
                                    }
                                    if (var4 >= this.field1551) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1834();
                                    if (var14 != null) {
                                        int var15 = var11.field1633;
                                        while (var14 != null) {
                                            this.method1948(var14, var15 * var14.method2052() >> 8);
                                            var14 = var11.method1811();
                                        }
                                    }
                                    class119 var16 = var11.field1634;
                                    var11.field1634 = null;
                                    if (var10 == null) {
                                        this.field1555[var7] = var16;
                                    } else {
                                        var10.field1634 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1567[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1634;
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
                class119 var18 = this.field1555[var17];
                class119[] var19 = this.field1555;
                this.field1567[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1634;
                    var18.field1634 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1564 < 0) {
            this.field1564 = 0;
        }
        if (this.field1550 != null) {
            this.field1550.method1813(arg0, 0, arg1);
        }
        this.field1552 = class183.method2932();
    }

    @ObfuscatedName("ho.as(Ldn;I)V")
    public static final void method3902(class119 arg0) {
        arg0.field1636 = false;
        if (arg0.field1635 != null) {
            arg0.field1635.field1667 = 0;
        }
        for (class119 var1 = arg0.method1834(); var1 != null; var1 = arg0.method1811()) {
            method3902(var1);
        }
    }

    @ObfuscatedName("do.am(Ldn;II)V")
    public final void method1948(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1567[var3];
        if (var4 == null) {
            this.field1555[var3] = arg0;
        } else {
            var4.field1634 = arg0;
        }
        this.field1567[var3] = arg0;
        arg0.field1633 = arg1;
    }

    @ObfuscatedName("do.d(I)V")
    public void method721() throws Exception {
    }

    @ObfuscatedName("do.x(II)V")
    public void method708(int arg0) throws Exception {
    }

    @ObfuscatedName("do.k(I)I")
    public int method709() throws Exception {
        return this.field1553;
    }

    @ObfuscatedName("do.z()V")
    public void method710() throws Exception {
    }

    @ObfuscatedName("do.v(I)V")
    public void method707() {
    }

    @ObfuscatedName("do.m(B)V")
    public void method713() throws Exception {
    }
}
