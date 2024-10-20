package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dl")
public class class110 {

    @ObfuscatedName("dl.l")
    public int[] field1650;

    @ObfuscatedName("dl.c")
    public class120 field1659;

    @ObfuscatedName("dl.m")
    public int field1652 = 32;

    @ObfuscatedName("dl.b")
    public long field1653 = class176.method2862();

    @ObfuscatedName("dl.f")
    public int field1654;

    @ObfuscatedName("dl.n")
    public int field1651;

    @ObfuscatedName("dl.u")
    public int field1647;

    @ObfuscatedName("dl.p")
    public long field1657 = 0L;

    @ObfuscatedName("dl.q")
    public int field1658 = 0;

    @ObfuscatedName("dl.d")
    public int field1655 = 0;

    @ObfuscatedName("dl.h")
    public int field1660 = 0;

    @ObfuscatedName("dl.g")
    public long field1667 = 0L;

    @ObfuscatedName("dl.x")
    public boolean field1662 = true;

    @ObfuscatedName("dl.au")
    public int field1656 = 0;

    @ObfuscatedName("dl.ar")
    public class120[] field1664 = new class120[8];

    @ObfuscatedName("dl.ay")
    public class120[] field1663 = new class120[8];

    @ObfuscatedName("x.q(Leo;III)Ldl;")
    public static final class110 method158(class155 arg0, int arg1, int arg2) {
        if (Statics.field3212 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field1661.method683();
                var3.field1650 = new int[256 * (Statics.field1665 ? 2 : 1)];
                var3.field1651 = arg2;
                var3.method709();
                var3.field1654 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1654 > 16384) {
                    var3.field1654 = 16384;
                }
                var3.method710(var3.field1654);
                if (Statics.field1648 > 0 && Statics.field2271 == null) {
                    Statics.field2271 = new class112();
                    Statics.field2357 = Executors.newScheduledThreadPool(1);
                    Statics.field2357.scheduleAtFixedRate(Statics.field2271, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2271 != null) {
                    if (Statics.field2271.field1679[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2271.field1679[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.d(Ldq;I)V")
    public final synchronized void method1861(class120 arg0) {
        this.field1659 = arg0;
    }

    @ObfuscatedName("dl.h(I)V")
    public final synchronized void method1862() {
        if (this.field1650 == null) {
            return;
        }
        long var1 = class176.method2862();
        try {
            if (this.field1657 != 0L) {
                if (var1 < this.field1657) {
                    return;
                }
                this.method710(this.field1654);
                this.field1657 = 0L;
                this.field1662 = true;
            }
            int var3 = this.method716();
            if (this.field1660 - var3 > this.field1658) {
                this.field1658 = this.field1660 - var3;
            }
            int var4 = this.field1651 + this.field1647;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1654) {
                this.field1654 += 1024;
                if (this.field1654 > 16384) {
                    this.field1654 = 16384;
                }
                this.method713();
                this.method710(this.field1654);
                var3 = 0;
                this.field1662 = true;
                if (var4 + 256 > this.field1654) {
                    var4 = this.field1654 - 256;
                    this.field1647 = var4 - this.field1651;
                }
            }
            while (var3 < var4) {
                this.method1881(this.field1650, 256);
                this.method712();
                var3 += 256;
            }
            if (var1 > this.field1667) {
                if (this.field1662) {
                    this.field1662 = false;
                } else if (this.field1658 == 0 && this.field1655 == 0) {
                    this.method713();
                    this.field1657 = var1 + 2000L;
                    return;
                } else {
                    this.field1647 = Math.min(this.field1655, this.field1658);
                    this.field1655 = this.field1658;
                }
                this.field1658 = 0;
                this.field1667 = var1 + 2000L;
            }
            this.field1660 = var3;
        } catch (Exception var8) {
            this.method713();
            this.field1657 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1653 + 500000L) {
                var1 = this.field1653;
            }
            while (var1 > this.field1653 + 5000L) {
                this.method1866(256);
                this.field1653 += (long) (256000 / Statics.field3212);
            }
        } catch (Exception var7) {
            this.field1653 = var1;
        }
    }

    @ObfuscatedName("dl.g(I)V")
    public final void method1883() {
        this.field1662 = true;
    }

    @ObfuscatedName("dl.x(I)V")
    public final synchronized void method1864() {
        this.field1662 = true;
        try {
            this.method714();
        } catch (Exception var2) {
            this.method713();
            this.field1657 = class176.method2862() + 2000L;
        }
    }

    @ObfuscatedName("dl.ai(S)V")
    public final synchronized void method1865() {
        if (Statics.field2271 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2271.field1679[var2] == this) {
                    Statics.field2271.field1679[var2] = null;
                }
                if (Statics.field2271.field1679[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2357.shutdownNow();
                Statics.field2357 = null;
                Statics.field2271 = null;
            }
        }
        this.method713();
        this.field1650 = null;
    }

    @ObfuscatedName("dl.an(II)V")
    public final void method1866(int arg0) {
        this.field1656 -= arg0;
        if (this.field1656 < 0) {
            this.field1656 = 0;
        }
        if (this.field1659 != null) {
            this.field1659.method1739(arg0);
        }
    }

    @ObfuscatedName("dl.au([II)V")
    public final void method1881(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1665) {
            var3 = arg1 << 1;
        }
        class184.method3160(arg0, 0, var3);
        this.field1656 -= arg1;
        if (this.field1659 != null && this.field1656 <= 0) {
            this.field1656 += Statics.field3212 >> 4;
            method482(this.field1659);
            this.method1884(this.field1659, this.field1659.method2031());
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
                        class120 var11 = this.field1664[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1727;
                                if (var12 == null || var12.field1760 <= var8) {
                                    var11.field1726 = true;
                                    int var13 = var11.method1748();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1760 += var13;
                                    }
                                    if (var4 >= this.field1652) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1734();
                                    if (var14 != null) {
                                        int var15 = var11.field1729;
                                        while (var14 != null) {
                                            this.method1884(var14, var15 * var14.method2031() >> 8);
                                            var14 = var11.method1742();
                                        }
                                    }
                                    class120 var16 = var11.field1728;
                                    var11.field1728 = null;
                                    if (var10 == null) {
                                        this.field1664[var7] = var16;
                                    } else {
                                        var10.field1728 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1663[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1728;
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
                class120 var18 = this.field1664[var17];
                class120[] var19 = this.field1664;
                this.field1663[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1728;
                    var18.field1728 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1656 < 0) {
            this.field1656 = 0;
        }
        if (this.field1659 != null) {
            this.field1659.method1737(arg0, 0, arg1);
        }
        this.field1653 = class176.method2862();
    }

    @ObfuscatedName("ax.ar(Ldq;I)V")
    public static final void method482(class120 arg0) {
        arg0.field1726 = false;
        if (arg0.field1727 != null) {
            arg0.field1727.field1760 = 0;
        }
        for (class120 var1 = arg0.method1734(); var1 != null; var1 = arg0.method1742()) {
            method482(var1);
        }
    }

    @ObfuscatedName("dl.ay(Ldq;II)V")
    public final void method1884(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1663[var3];
        if (var4 == null) {
            this.field1664[var3] = arg0;
        } else {
            var4.field1728 = arg0;
        }
        this.field1663[var3] = arg0;
        arg0.field1729 = arg1;
    }

    @ObfuscatedName("dl.i(I)V")
    public void method709() throws Exception {
    }

    @ObfuscatedName("dl.w(II)V")
    public void method710(int arg0) throws Exception {
    }

    @ObfuscatedName("dl.a(B)I")
    public int method716() throws Exception {
        return this.field1654;
    }

    @ObfuscatedName("dl.t()V")
    public void method712() throws Exception {
    }

    @ObfuscatedName("dl.s(B)V")
    public void method713() {
    }

    @ObfuscatedName("dl.r(I)V")
    public void method714() throws Exception {
    }
}
