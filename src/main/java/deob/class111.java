package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dw")
public class class111 {

    @ObfuscatedName("dw.h")
    public int[] field1631;

    @ObfuscatedName("dw.s")
    public class121 field1621;

    @ObfuscatedName("dw.c")
    public int field1620 = 32;

    @ObfuscatedName("dw.m")
    public long field1622 = class177.method2903();

    @ObfuscatedName("dw.a")
    public int field1623;

    @ObfuscatedName("dw.t")
    public int field1634;

    @ObfuscatedName("dw.p")
    public int field1625;

    @ObfuscatedName("dw.f")
    public long field1626 = 0L;

    @ObfuscatedName("dw.b")
    public int field1627 = 0;

    @ObfuscatedName("dw.x")
    public int field1617 = 0;

    @ObfuscatedName("dw.i")
    public int field1629 = 0;

    @ObfuscatedName("dw.j")
    public long field1630 = 0L;

    @ObfuscatedName("dw.q")
    public boolean field1628 = true;

    @ObfuscatedName("dw.al")
    public int field1633 = 0;

    @ObfuscatedName("dw.ae")
    public class121[] field1619 = new class121[8];

    @ObfuscatedName("dw.ax")
    public class121[] field1636 = new class121[8];

    @ObfuscatedName("gy.ag(Leb;IIB)Ldw;")
    public static final class111 method3184(class156 arg0, int arg1, int arg2) {
        if (Statics.field1618 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class111 var3 = Statics.field2045.method683();
                var3.field1631 = new int[256 * (Statics.field375 ? 2 : 1)];
                var3.field1634 = arg2;
                var3.method708();
                var3.field1623 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1623 > 16384) {
                    var3.field1623 = 16384;
                }
                var3.method698(var3.field1623);
                if (Statics.field250 > 0 && Statics.field2297 == null) {
                    Statics.field2297 = new class113();
                    Statics.field2259 = Executors.newScheduledThreadPool(1);
                    Statics.field2259.scheduleAtFixedRate(Statics.field2297, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2297 != null) {
                    if (Statics.field2297.field1649[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2297.field1649[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class111();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.ay(Ldl;I)V")
    public final synchronized void method1891(class121 arg0) {
        this.field1621 = arg0;
    }

    @ObfuscatedName("dw.au(I)V")
    public final synchronized void method1892() {
        if (this.field1631 == null) {
            return;
        }
        long var1 = class177.method2903();
        try {
            if (this.field1626 != 0L) {
                if (var1 < this.field1626) {
                    return;
                }
                this.method698(this.field1623);
                this.field1626 = 0L;
                this.field1628 = true;
            }
            int var3 = this.method699();
            if (this.field1629 - var3 > this.field1627) {
                this.field1627 = this.field1629 - var3;
            }
            int var4 = this.field1634 + this.field1625;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1623) {
                this.field1623 += 1024;
                if (this.field1623 > 16384) {
                    this.field1623 = 16384;
                }
                this.method701();
                this.method698(this.field1623);
                var3 = 0;
                this.field1628 = true;
                if (var4 + 256 > this.field1623) {
                    var4 = this.field1623 - 256;
                    this.field1625 = var4 - this.field1634;
                }
            }
            while (var3 < var4) {
                this.method1897(this.field1631, 256);
                this.method704();
                var3 += 256;
            }
            if (var1 > this.field1630) {
                if (this.field1628) {
                    this.field1628 = false;
                } else if (this.field1627 == 0 && this.field1617 == 0) {
                    this.method701();
                    this.field1626 = var1 + 2000L;
                    return;
                } else {
                    this.field1625 = Math.min(this.field1617, this.field1627);
                    this.field1617 = this.field1627;
                }
                this.field1627 = 0;
                this.field1630 = var1 + 2000L;
            }
            this.field1629 = var3;
        } catch (Exception var8) {
            this.method701();
            this.field1626 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1622 + 500000L) {
                var1 = this.field1622;
            }
            while (var1 > this.field1622 + 5000L) {
                this.method1896(256);
                this.field1622 += (long) (256000 / Statics.field1618);
            }
        } catch (Exception var7) {
            this.field1622 = var1;
        }
    }

    @ObfuscatedName("dw.ah(B)V")
    public final void method1893() {
        this.field1628 = true;
    }

    @ObfuscatedName("dw.ao(B)V")
    public final synchronized void method1894() {
        this.field1628 = true;
        try {
            this.method697();
        } catch (Exception var2) {
            this.method701();
            this.field1626 = class177.method2903() + 2000L;
        }
    }

    @ObfuscatedName("dw.al(B)V")
    public final synchronized void method1895() {
        if (Statics.field2297 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2297.field1649[var2] == this) {
                    Statics.field2297.field1649[var2] = null;
                }
                if (Statics.field2297.field1649[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2259.shutdownNow();
                Statics.field2259 = null;
                Statics.field2297 = null;
            }
        }
        this.method701();
        this.field1631 = null;
    }

    @ObfuscatedName("dw.ae(II)V")
    public final void method1896(int arg0) {
        this.field1633 -= arg0;
        if (this.field1633 < 0) {
            this.field1633 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1791(arg0);
        }
    }

    @ObfuscatedName("dw.ax([II)V")
    public final void method1897(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field375) {
            var3 = arg1 << 1;
        }
        class185.method3200(arg0, 0, var3);
        this.field1633 -= arg1;
        if (this.field1621 != null && this.field1633 <= 0) {
            this.field1633 += Statics.field1618 >> 4;
            method1655(this.field1621);
            this.method1898(this.field1621, this.field1621.method1977());
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
                        class121 var10 = null;
                        class121 var11 = this.field1619[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class124 var12 = var11.field1705;
                                if (var12 == null || var12.field1739 <= var8) {
                                    var11.field1708 = true;
                                    int var13 = var11.method1776();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1739 += var13;
                                    }
                                    if (var4 >= this.field1620) {
                                        break label105;
                                    }
                                    class121 var14 = var11.method1774();
                                    if (var14 != null) {
                                        int var15 = var11.field1706;
                                        while (var14 != null) {
                                            this.method1898(var14, var15 * var14.method1977() >> 8);
                                            var14 = var11.method1775();
                                        }
                                    }
                                    class121 var16 = var11.field1707;
                                    var11.field1707 = null;
                                    if (var10 == null) {
                                        this.field1619[var7] = var16;
                                    } else {
                                        var10.field1707 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1636[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1707;
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
                class121 var18 = this.field1619[var17];
                class121[] var19 = this.field1619;
                this.field1636[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class121 var21 = var18.field1707;
                    var18.field1707 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1633 < 0) {
            this.field1633 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1777(arg0, 0, arg1);
        }
        this.field1622 = class177.method2903();
    }

    @ObfuscatedName("ck.az(Ldl;B)V")
    public static final void method1655(class121 arg0) {
        arg0.field1708 = false;
        if (arg0.field1705 != null) {
            arg0.field1705.field1739 = 0;
        }
        for (class121 var1 = arg0.method1774(); var1 != null; var1 = arg0.method1775()) {
            method1655(var1);
        }
    }

    @ObfuscatedName("dw.aw(Ldl;IS)V")
    public final void method1898(class121 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class121 var4 = this.field1636[var3];
        if (var4 == null) {
            this.field1619[var3] = arg0;
        } else {
            var4.field1707 = arg0;
        }
        this.field1636[var3] = arg0;
        arg0.field1706 = arg1;
    }

    @ObfuscatedName("dw.e(B)V")
    public void method708() throws Exception {
    }

    @ObfuscatedName("dw.n(II)V")
    public void method698(int arg0) throws Exception {
    }

    @ObfuscatedName("dw.g(B)I")
    public int method699() throws Exception {
        return this.field1623;
    }

    @ObfuscatedName("dw.y()V")
    public void method704() throws Exception {
    }

    @ObfuscatedName("dw.w(B)V")
    public void method701() {
    }

    @ObfuscatedName("dw.k(I)V")
    public void method697() throws Exception {
    }
}
