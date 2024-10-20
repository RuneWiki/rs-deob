package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dn")
public class class110 {

    @ObfuscatedName("dn.a")
    public int[] field1637;

    @ObfuscatedName("dn.y")
    public class120 field1630;

    @ObfuscatedName("dn.r")
    public int field1639 = 32;

    @ObfuscatedName("dn.b")
    public long field1648 = class176.method2396();

    @ObfuscatedName("dn.s")
    public int field1641;

    @ObfuscatedName("dn.v")
    public int field1642;

    @ObfuscatedName("dn.t")
    public int field1643;

    @ObfuscatedName("dn.w")
    public long field1644 = 0L;

    @ObfuscatedName("dn.l")
    public int field1635 = 0;

    @ObfuscatedName("dn.q")
    public int field1650 = 0;

    @ObfuscatedName("dn.k")
    public int field1647 = 0;

    @ObfuscatedName("dn.d")
    public long field1655 = 0L;

    @ObfuscatedName("dn.u")
    public boolean field1649 = true;

    @ObfuscatedName("dn.an")
    public int field1646 = 0;

    @ObfuscatedName("dn.al")
    public class120[] field1651 = new class120[8];

    @ObfuscatedName("dn.at")
    public class120[] field1652 = new class120[8];

    @ObfuscatedName("bi.an(Lcj;B)V")
    public static final void method982(class104 arg0) {
        Statics.field1636 = arg0;
    }

    @ObfuscatedName("ew.al(Lew;III)Ldn;")
    public static final class110 method2735(class155 arg0, int arg1, int arg2) {
        if (Statics.field1634 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field1636.method659();
                var3.field1637 = new int[(Statics.field1631 ? 2 : 1) * 256];
                var3.field1642 = arg2;
                var3.method708();
                var3.field1641 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1641 > 16384) {
                    var3.field1641 = 16384;
                }
                var3.method691(var3.field1641);
                if (Statics.field853 > 0 && Statics.field1633 == null) {
                    Statics.field1633 = new class112();
                    Statics.field645 = Executors.newScheduledThreadPool(1);
                    Statics.field645.scheduleAtFixedRate(Statics.field1633, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1633 != null) {
                    if (Statics.field1633.field1667[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1633.field1667[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dn.at(Ldp;B)V")
    public final synchronized void method1861(class120 arg0) {
        this.field1630 = arg0;
    }

    @ObfuscatedName("dn.au(I)V")
    public final synchronized void method1867() {
        if (this.field1637 == null) {
            return;
        }
        long var1 = class176.method2396();
        try {
            if (this.field1644 != 0L) {
                if (var1 < this.field1644) {
                    return;
                }
                this.method691(this.field1641);
                this.field1644 = 0L;
                this.field1649 = true;
            }
            int var3 = this.method689();
            if (this.field1647 - var3 > this.field1635) {
                this.field1635 = this.field1647 - var3;
            }
            int var4 = this.field1643 + this.field1642;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1641) {
                this.field1641 += 1024;
                if (this.field1641 > 16384) {
                    this.field1641 = 16384;
                }
                this.method694();
                this.method691(this.field1641);
                var3 = 0;
                this.field1649 = true;
                if (var4 + 256 > this.field1641) {
                    var4 = this.field1641 - 256;
                    this.field1643 = var4 - this.field1642;
                }
            }
            while (var3 < var4) {
                this.method1863(this.field1637, 256);
                this.method690();
                var3 += 256;
            }
            if (var1 > this.field1655) {
                if (this.field1649) {
                    this.field1649 = false;
                } else if (this.field1635 == 0 && this.field1650 == 0) {
                    this.method694();
                    this.field1644 = var1 + 2000L;
                    return;
                } else {
                    this.field1643 = Math.min(this.field1650, this.field1635);
                    this.field1650 = this.field1635;
                }
                this.field1635 = 0;
                this.field1655 = var1 + 2000L;
            }
            this.field1647 = var3;
        } catch (Exception var8) {
            this.method694();
            this.field1644 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1648 + 500000L) {
                var1 = this.field1648;
            }
            while (var1 > this.field1648 + 5000L) {
                this.method1862(256);
                this.field1648 += (long) (256000 / Statics.field1634);
            }
        } catch (Exception var7) {
            this.field1648 = var1;
        }
    }

    @ObfuscatedName("dn.ak(I)V")
    public final void method1898() {
        this.field1649 = true;
    }

    @ObfuscatedName("dn.as(I)V")
    public final synchronized void method1860() {
        this.field1649 = true;
        try {
            this.method695();
        } catch (Exception var2) {
            this.method694();
            this.field1644 = class176.method2396() + 2000L;
        }
    }

    @ObfuscatedName("dn.ah(B)V")
    public final synchronized void method1894() {
        if (Statics.field1633 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1633.field1667[var2] == this) {
                    Statics.field1633.field1667[var2] = null;
                }
                if (Statics.field1633.field1667[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field645.shutdownNow();
                Statics.field645 = null;
                Statics.field1633 = null;
            }
        }
        this.method694();
        this.field1637 = null;
    }

    @ObfuscatedName("dn.ab(II)V")
    public final void method1862(int arg0) {
        this.field1646 -= arg0;
        if (this.field1646 < 0) {
            this.field1646 = 0;
        }
        if (this.field1630 != null) {
            this.field1630.method1741(arg0);
        }
    }

    @ObfuscatedName("dn.am([II)V")
    public final void method1863(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1631) {
            var3 = arg1 << 1;
        }
        class184.method3192(arg0, 0, var3);
        this.field1646 -= arg1;
        if (this.field1630 != null && this.field1646 <= 0) {
            this.field1646 += Statics.field1634 >> 4;
            method2844(this.field1630);
            this.method1885(this.field1630, this.field1630.method1961());
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
                        class120 var10 = null;
                        class120 var11 = this.field1651[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1724;
                                if (var12 == null || var12.field1758 <= var8) {
                                    var11.field1727 = true;
                                    int var13 = var11.method1736();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1758 += var13;
                                    }
                                    if (var4 >= this.field1639) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1757();
                                    if (var14 != null) {
                                        int var15 = var11.field1725;
                                        while (var14 != null) {
                                            this.method1885(var14, var15 * var14.method1961() >> 8);
                                            var14 = var11.method1737();
                                        }
                                    }
                                    class120 var16 = var11.field1726;
                                    var11.field1726 = null;
                                    if (var10 == null) {
                                        this.field1651[var7] = var16;
                                    } else {
                                        var10.field1726 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1652[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1726;
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
                class120 var18 = this.field1651[var17];
                class120[] var19 = this.field1651;
                this.field1652[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1726;
                    var18.field1726 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1646 < 0) {
            this.field1646 = 0;
        }
        if (this.field1630 != null) {
            this.field1630.method1752(arg0, 0, arg1);
        }
        this.field1648 = class176.method2396();
    }

    @ObfuscatedName("fg.ac(Ldp;I)V")
    public static final void method2844(class120 arg0) {
        arg0.field1727 = false;
        if (arg0.field1724 != null) {
            arg0.field1724.field1758 = 0;
        }
        for (class120 var1 = arg0.method1757(); var1 != null; var1 = arg0.method1737()) {
            method2844(var1);
        }
    }

    @ObfuscatedName("dn.ax(Ldp;II)V")
    public final void method1885(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1652[var3];
        if (var4 == null) {
            this.field1651[var3] = arg0;
        } else {
            var4.field1726 = arg0;
        }
        this.field1652[var3] = arg0;
        arg0.field1725 = arg1;
    }

    @ObfuscatedName("dn.n(I)V")
    public void method708() throws Exception {
    }

    @ObfuscatedName("dn.p(II)V")
    public void method691(int arg0) throws Exception {
    }

    @ObfuscatedName("dn.i(B)I")
    public int method689() throws Exception {
        return this.field1641;
    }

    @ObfuscatedName("dn.j()V")
    public void method690() throws Exception {
    }

    @ObfuscatedName("dn.f(I)V")
    public void method694() {
    }

    @ObfuscatedName("dn.m(I)V")
    public void method695() throws Exception {
    }
}
