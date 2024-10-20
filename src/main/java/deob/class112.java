package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("du")
public class class112 {

    @ObfuscatedName("du.p")
    public int[] field1615;

    @ObfuscatedName("du.u")
    public class122 field1620;

    @ObfuscatedName("du.b")
    public int field1619 = 32;

    @ObfuscatedName("du.w")
    public long field1622 = class176.method3746();

    @ObfuscatedName("du.k")
    public int field1635;

    @ObfuscatedName("du.n")
    public int field1624;

    @ObfuscatedName("du.c")
    public int field1625;

    @ObfuscatedName("du.l")
    public long field1626 = 0L;

    @ObfuscatedName("du.m")
    public int field1627 = 0;

    @ObfuscatedName("du.a")
    public int field1628 = 0;

    @ObfuscatedName("du.h")
    public int field1629 = 0;

    @ObfuscatedName("du.z")
    public long field1630 = 0L;

    @ObfuscatedName("du.j")
    public boolean field1631 = true;

    @ObfuscatedName("du.ar")
    public int field1632 = 0;

    @ObfuscatedName("du.ae")
    public class122[] field1633 = new class122[8];

    @ObfuscatedName("du.ai")
    public class122[] field1621 = new class122[8];

    @ObfuscatedName("fz.ac(Ldh;B)V")
    public static final void method2758(class106 arg0) {
        Statics.field1326 = arg0;
    }

    @ObfuscatedName("bp.ax(Leg;III)Ldu;")
    public static final class112 method995(class155 arg0, int arg1, int arg2) {
        if (Statics.field1634 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class112 var3 = Statics.field1326.method673();
                var3.field1615 = new int[256 * (Statics.field889 ? 2 : 1)];
                var3.field1624 = arg2;
                var3.method704();
                var3.field1635 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1635 > 16384) {
                    var3.field1635 = 16384;
                }
                var3.method692(var3.field1635);
                if (Statics.field2378 > 0 && Statics.field1617 == null) {
                    Statics.field1617 = new class114();
                    Statics.field1623 = Executors.newScheduledThreadPool(1);
                    Statics.field1623.scheduleAtFixedRate(Statics.field1617, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1617 != null) {
                    if (Statics.field1617.field1650[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1617.field1650[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class112();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.at(Ldz;B)V")
    public final synchronized void method1927(class122 arg0) {
        this.field1620 = arg0;
    }

    @ObfuscatedName("du.ag(I)V")
    public final synchronized void method1909() {
        if (this.field1615 == null) {
            return;
        }
        long var1 = class176.method3746();
        try {
            if (this.field1626 != 0L) {
                if (var1 < this.field1626) {
                    return;
                }
                this.method692(this.field1635);
                this.field1626 = 0L;
                this.field1631 = true;
            }
            int var3 = this.method693();
            if (this.field1629 - var3 > this.field1627) {
                this.field1627 = this.field1629 - var3;
            }
            int var4 = this.field1625 + this.field1624;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1635) {
                this.field1635 += 1024;
                if (this.field1635 > 16384) {
                    this.field1635 = 16384;
                }
                this.method695();
                this.method692(this.field1635);
                var3 = 0;
                this.field1631 = true;
                if (var4 + 256 > this.field1635) {
                    var4 = this.field1635 - 256;
                    this.field1625 = var4 - this.field1624;
                }
            }
            while (var3 < var4) {
                this.method1913(this.field1615, 256);
                this.method694();
                var3 += 256;
            }
            if (var1 > this.field1630) {
                if (this.field1631) {
                    this.field1631 = false;
                } else if (this.field1627 == 0 && this.field1628 == 0) {
                    this.method695();
                    this.field1626 = var1 + 2000L;
                    return;
                } else {
                    this.field1625 = Math.min(this.field1628, this.field1627);
                    this.field1628 = this.field1627;
                }
                this.field1627 = 0;
                this.field1630 = var1 + 2000L;
            }
            this.field1629 = var3;
        } catch (Exception var8) {
            this.method695();
            this.field1626 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1622 + 500000L) {
                var1 = this.field1622;
            }
            while (var1 > this.field1622 + 5000L) {
                this.method1920(256);
                this.field1622 += (long) (256000 / Statics.field1634);
            }
        } catch (Exception var7) {
            this.field1622 = var1;
        }
    }

    @ObfuscatedName("du.ar(I)V")
    public final void method1939() {
        this.field1631 = true;
    }

    @ObfuscatedName("du.ae(B)V")
    public final synchronized void method1911() {
        this.field1631 = true;
        try {
            this.method708();
        } catch (Exception var2) {
            this.method695();
            this.field1626 = class176.method3746() + 2000L;
        }
    }

    @ObfuscatedName("du.ai(I)V")
    public final synchronized void method1912() {
        if (Statics.field1617 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1617.field1650[var2] == this) {
                    Statics.field1617.field1650[var2] = null;
                }
                if (Statics.field1617.field1650[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1623.shutdownNow();
                Statics.field1623 = null;
                Statics.field1617 = null;
            }
        }
        this.method695();
        this.field1615 = null;
    }

    @ObfuscatedName("du.au(II)V")
    public final void method1920(int arg0) {
        this.field1632 -= arg0;
        if (this.field1632 < 0) {
            this.field1632 = 0;
        }
        if (this.field1620 != null) {
            this.field1620.method1778(arg0);
        }
    }

    @ObfuscatedName("du.ad([II)V")
    public final void method1913(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field889) {
            var3 = arg1 << 1;
        }
        class184.method3208(arg0, 0, var3);
        this.field1632 -= arg1;
        if (this.field1620 != null && this.field1632 <= 0) {
            this.field1632 += Statics.field1634 >> 4;
            method1674(this.field1620);
            this.method1914(this.field1620, this.field1620.method2003());
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
                        class122 var10 = null;
                        class122 var11 = this.field1633[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class125 var12 = var11.field1707;
                                if (var12 == null || var12.field1741 <= var8) {
                                    var11.field1709 = true;
                                    int var13 = var11.method1781();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1741 += var13;
                                    }
                                    if (var4 >= this.field1619) {
                                        break label105;
                                    }
                                    class122 var14 = var11.method1779();
                                    if (var14 != null) {
                                        int var15 = var11.field1708;
                                        while (var14 != null) {
                                            this.method1914(var14, var15 * var14.method2003() >> 8);
                                            var14 = var11.method1780();
                                        }
                                    }
                                    class122 var16 = var11.field1710;
                                    var11.field1710 = null;
                                    if (var10 == null) {
                                        this.field1633[var7] = var16;
                                    } else {
                                        var10.field1710 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1621[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1710;
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
                class122 var18 = this.field1633[var17];
                class122[] var19 = this.field1633;
                this.field1621[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class122 var21 = var18.field1710;
                    var18.field1710 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1632 < 0) {
            this.field1632 = 0;
        }
        if (this.field1620 != null) {
            this.field1620.method1782(arg0, 0, arg1);
        }
        this.field1622 = class176.method3746();
    }

    @ObfuscatedName("ck.ah(Ldz;I)V")
    public static final void method1674(class122 arg0) {
        arg0.field1709 = false;
        if (arg0.field1707 != null) {
            arg0.field1707.field1741 = 0;
        }
        for (class122 var1 = arg0.method1779(); var1 != null; var1 = arg0.method1780()) {
            method1674(var1);
        }
    }

    @ObfuscatedName("du.ao(Ldz;IB)V")
    public final void method1914(class122 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class122 var4 = this.field1621[var3];
        if (var4 == null) {
            this.field1633[var3] = arg0;
        } else {
            var4.field1710 = arg0;
        }
        this.field1621[var3] = arg0;
        arg0.field1708 = arg1;
    }

    @ObfuscatedName("du.d(I)V")
    public void method704() throws Exception {
    }

    @ObfuscatedName("du.q(IB)V")
    public void method692(int arg0) throws Exception {
    }

    @ObfuscatedName("du.x(B)I")
    public int method693() throws Exception {
        return this.field1635;
    }

    @ObfuscatedName("du.y()V")
    public void method694() throws Exception {
    }

    @ObfuscatedName("du.e(I)V")
    public void method695() {
    }

    @ObfuscatedName("du.f(I)V")
    public void method708() throws Exception {
    }
}
