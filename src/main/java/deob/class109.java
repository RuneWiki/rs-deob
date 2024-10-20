package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dz")
public class class109 {

    @ObfuscatedName("dz.y")
    public int[] field1647;

    @ObfuscatedName("dz.v")
    public class119 field1633;

    @ObfuscatedName("dz.c")
    public int field1637 = 32;

    @ObfuscatedName("dz.z")
    public long field1638 = class177.method608();

    @ObfuscatedName("dz.u")
    public int field1650;

    @ObfuscatedName("dz.e")
    public int field1640;

    @ObfuscatedName("dz.p")
    public int field1636;

    @ObfuscatedName("dz.m")
    public long field1642 = 0L;

    @ObfuscatedName("dz.x")
    public int field1643 = 0;

    @ObfuscatedName("dz.h")
    public int field1635 = 0;

    @ObfuscatedName("dz.f")
    public int field1645 = 0;

    @ObfuscatedName("dz.g")
    public long field1646 = 0L;

    @ObfuscatedName("dz.w")
    public boolean field1652 = true;

    @ObfuscatedName("dz.ab")
    public int field1649 = 0;

    @ObfuscatedName("dz.am")
    public class119[] field1641 = new class119[8];

    @ObfuscatedName("dz.aq")
    public class119[] field1639 = new class119[8];

    @ObfuscatedName("ff.w(IZIS)V")
    public static final void method2832(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field899 = arg0;
        Statics.field1644 = arg1;
        Statics.field1634 = arg2;
    }

    @ObfuscatedName("hy.ar(Leo;IIB)Ldz;")
    public static final class109 method3810(class156 arg0, int arg1, int arg2) {
        if (Statics.field899 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class109 var3 = Statics.field587.method701();
                var3.field1647 = new int[256 * (Statics.field1644 ? 2 : 1)];
                var3.field1640 = arg2;
                var3.method738();
                var3.field1650 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1650 > 16384) {
                    var3.field1650 = 16384;
                }
                var3.method724(var3.field1650);
                if (Statics.field1634 > 0 && Statics.field474 == null) {
                    Statics.field474 = new class111();
                    Statics.field3670 = Executors.newScheduledThreadPool(1);
                    Statics.field3670.scheduleAtFixedRate(Statics.field474, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field474 != null) {
                    if (Statics.field474.field1667[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field474.field1667[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class109();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dz.ax(Lds;I)V")
    public final synchronized void method1852(class119 arg0) {
        this.field1633 = arg0;
    }

    @ObfuscatedName("dz.al(I)V")
    public final synchronized void method1881() {
        if (this.field1647 == null) {
            return;
        }
        long var1 = class177.method608();
        try {
            if (this.field1642 != 0L) {
                if (var1 < this.field1642) {
                    return;
                }
                this.method724(this.field1650);
                this.field1642 = 0L;
                this.field1652 = true;
            }
            int var3 = this.method725();
            if (this.field1645 - var3 > this.field1643) {
                this.field1643 = this.field1645 - var3;
            }
            int var4 = this.field1640 + this.field1636;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1650) {
                this.field1650 += 1024;
                if (this.field1650 > 16384) {
                    this.field1650 = 16384;
                }
                this.method727();
                this.method724(this.field1650);
                var3 = 0;
                this.field1652 = true;
                if (var4 + 256 > this.field1650) {
                    var4 = this.field1650 - 256;
                    this.field1636 = var4 - this.field1640;
                }
            }
            while (var3 < var4) {
                this.method1856(this.field1647, 256);
                this.method722();
                var3 += 256;
            }
            if (var1 > this.field1646) {
                if (this.field1652) {
                    this.field1652 = false;
                } else if (this.field1643 == 0 && this.field1635 == 0) {
                    this.method727();
                    this.field1642 = var1 + 2000L;
                    return;
                } else {
                    this.field1636 = Math.min(this.field1635, this.field1643);
                    this.field1635 = this.field1643;
                }
                this.field1643 = 0;
                this.field1646 = var1 + 2000L;
            }
            this.field1645 = var3;
        } catch (Exception var8) {
            this.method727();
            this.field1642 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1638 + 500000L) {
                var1 = this.field1638;
            }
            while (var1 > this.field1638 + 5000L) {
                this.method1867(256);
                this.field1638 += (long) (256000 / Statics.field899);
            }
        } catch (Exception var7) {
            this.field1638 = var1;
        }
    }

    @ObfuscatedName("dz.ag(I)V")
    public final void method1853() {
        this.field1652 = true;
    }

    @ObfuscatedName("dz.ad(I)V")
    public final synchronized void method1854() {
        this.field1652 = true;
        try {
            this.method736();
        } catch (Exception var2) {
            this.method727();
            this.field1642 = class177.method608() + 2000L;
        }
    }

    @ObfuscatedName("dz.ab(I)V")
    public final synchronized void method1862() {
        if (Statics.field474 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field474.field1667[var2] == this) {
                    Statics.field474.field1667[var2] = null;
                }
                if (Statics.field474.field1667[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3670.shutdownNow();
                Statics.field3670 = null;
                Statics.field474 = null;
            }
        }
        this.method727();
        this.field1647 = null;
    }

    @ObfuscatedName("dz.am(II)V")
    public final void method1867(int arg0) {
        this.field1649 -= arg0;
        if (this.field1649 < 0) {
            this.field1649 = 0;
        }
        if (this.field1633 != null) {
            this.field1633.method1742(arg0);
        }
    }

    @ObfuscatedName("dz.aq([II)V")
    public final void method1856(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1644) {
            var3 = arg1 << 1;
        }
        class185.method3297(arg0, 0, var3);
        this.field1649 -= arg1;
        if (this.field1633 != null && this.field1649 <= 0) {
            this.field1649 += Statics.field899 >> 4;
            method1536(this.field1633);
            this.method1857(this.field1633, this.field1633.method2031());
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
                        class119 var11 = this.field1641[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1729;
                                if (var12 == null || var12.field1761 <= var8) {
                                    var11.field1730 = true;
                                    int var13 = var11.method1732();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1761 += var13;
                                    }
                                    if (var4 >= this.field1637) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1753();
                                    if (var14 != null) {
                                        int var15 = var11.field1728;
                                        while (var14 != null) {
                                            this.method1857(var14, var15 * var14.method2031() >> 8);
                                            var14 = var11.method1731();
                                        }
                                    }
                                    class119 var16 = var11.field1727;
                                    var11.field1727 = null;
                                    if (var10 == null) {
                                        this.field1641[var7] = var16;
                                    } else {
                                        var10.field1727 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1639[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1727;
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
                class119 var18 = this.field1641[var17];
                class119[] var19 = this.field1641;
                this.field1639[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1727;
                    var18.field1727 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1649 < 0) {
            this.field1649 = 0;
        }
        if (this.field1633 != null) {
            this.field1633.method1733(arg0, 0, arg1);
        }
        this.field1638 = class177.method608();
    }

    @ObfuscatedName("cc.at(Lds;I)V")
    public static final void method1536(class119 arg0) {
        arg0.field1730 = false;
        if (arg0.field1729 != null) {
            arg0.field1729.field1761 = 0;
        }
        for (class119 var1 = arg0.method1753(); var1 != null; var1 = arg0.method1731()) {
            method1536(var1);
        }
    }

    @ObfuscatedName("dz.az(Lds;IB)V")
    public final void method1857(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1639[var3];
        if (var4 == null) {
            this.field1641[var3] = arg0;
        } else {
            var4.field1727 = arg0;
        }
        this.field1639[var3] = arg0;
        arg0.field1728 = arg1;
    }

    @ObfuscatedName("dz.i(I)V")
    public void method738() throws Exception {
    }

    @ObfuscatedName("dz.j(II)V")
    public void method724(int arg0) throws Exception {
    }

    @ObfuscatedName("dz.a(I)I")
    public int method725() throws Exception {
        return this.field1650;
    }

    @ObfuscatedName("dz.r()V")
    public void method722() throws Exception {
    }

    @ObfuscatedName("dz.o(I)V")
    public void method727() {
    }

    @ObfuscatedName("dz.n(I)V")
    public void method736() throws Exception {
    }
}
