package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.u")
    public int[] field1625;

    @ObfuscatedName("dk.b")
    public class118 field1617;

    @ObfuscatedName("dk.f")
    public int field1627 = 32;

    @ObfuscatedName("dk.j")
    public long field1619 = class176.method2725();

    @ObfuscatedName("dk.x")
    public int field1622;

    @ObfuscatedName("dk.c")
    public int field1621;

    @ObfuscatedName("dk.h")
    public int field1614;

    @ObfuscatedName("dk.a")
    public long field1623 = 0L;

    @ObfuscatedName("dk.z")
    public int field1624 = 0;

    @ObfuscatedName("dk.l")
    public int field1616 = 0;

    @ObfuscatedName("dk.w")
    public int field1626 = 0;

    @ObfuscatedName("dk.n")
    public long field1620 = 0L;

    @ObfuscatedName("dk.m")
    public boolean field1628 = true;

    @ObfuscatedName("dk.ag")
    public int field1629 = 0;

    @ObfuscatedName("dk.as")
    public class118[] field1630 = new class118[8];

    @ObfuscatedName("dk.af")
    public class118[] field1631 = new class118[8];

    @ObfuscatedName("fm.ah(Lez;III)Ldk;")
    public static final class108 method2867(class155 arg0, int arg1, int arg2) {
        if (Statics.field463 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field1615.method690();
                var3.field1625 = new int[(Statics.field491 ? 2 : 1) * 256];
                var3.field1621 = arg2;
                var3.method724();
                var3.field1622 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1622 > 16384) {
                    var3.field1622 = 16384;
                }
                var3.method715(var3.field1622);
                if (Statics.field321 > 0 && Statics.field1400 == null) {
                    Statics.field1400 = new class110();
                    Statics.field1634 = Executors.newScheduledThreadPool(1);
                    Statics.field1634.scheduleAtFixedRate(Statics.field1400, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1400 != null) {
                    if (Statics.field1400.field1650[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1400.field1650[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.ab(Ldd;I)V")
    public final synchronized void method1933(class118 arg0) {
        this.field1617 = arg0;
    }

    @ObfuscatedName("dk.ad(B)V")
    public final synchronized void method1924() {
        if (this.field1625 == null) {
            return;
        }
        long var1 = class176.method2725();
        try {
            if (this.field1623 != 0L) {
                if (var1 < this.field1623) {
                    return;
                }
                this.method715(this.field1622);
                this.field1623 = 0L;
                this.field1628 = true;
            }
            int var3 = this.method716();
            if (this.field1626 - var3 > this.field1624) {
                this.field1624 = this.field1626 - var3;
            }
            int var4 = this.field1621 + this.field1614;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1622) {
                this.field1622 += 1024;
                if (this.field1622 > 16384) {
                    this.field1622 = 16384;
                }
                this.method718();
                this.method715(this.field1622);
                var3 = 0;
                this.field1628 = true;
                if (var4 + 256 > this.field1622) {
                    var4 = this.field1622 - 256;
                    this.field1614 = var4 - this.field1621;
                }
            }
            while (var3 < var4) {
                this.method1942(this.field1625, 256);
                this.method726();
                var3 += 256;
            }
            if (var1 > this.field1620) {
                if (this.field1628) {
                    this.field1628 = false;
                } else if (this.field1624 == 0 && this.field1616 == 0) {
                    this.method718();
                    this.field1623 = var1 + 2000L;
                    return;
                } else {
                    this.field1614 = Math.min(this.field1616, this.field1624);
                    this.field1616 = this.field1624;
                }
                this.field1624 = 0;
                this.field1620 = var1 + 2000L;
            }
            this.field1626 = var3;
        } catch (Exception var8) {
            this.method718();
            this.field1623 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1619 + 500000L) {
                var1 = this.field1619;
            }
            while (var1 > this.field1619 + 5000L) {
                this.method1927(256);
                this.field1619 += (long) (256000 / Statics.field463);
            }
        } catch (Exception var7) {
            this.field1619 = var1;
        }
    }

    @ObfuscatedName("dk.ag(I)V")
    public final void method1937() {
        this.field1628 = true;
    }

    @ObfuscatedName("dk.as(I)V")
    public final synchronized void method1925() {
        this.field1628 = true;
        try {
            this.method719();
        } catch (Exception var2) {
            this.method718();
            this.field1623 = class176.method2725() + 2000L;
        }
    }

    @ObfuscatedName("dk.af(I)V")
    public final synchronized void method1938() {
        if (Statics.field1400 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1400.field1650[var2] == this) {
                    Statics.field1400.field1650[var2] = null;
                }
                if (Statics.field1400.field1650[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1634.shutdownNow();
                Statics.field1634 = null;
                Statics.field1400 = null;
            }
        }
        this.method718();
        this.field1625 = null;
    }

    @ObfuscatedName("dk.aq(IS)V")
    public final void method1927(int arg0) {
        this.field1629 -= arg0;
        if (this.field1629 < 0) {
            this.field1629 = 0;
        }
        if (this.field1617 != null) {
            this.field1617.method1790(arg0);
        }
    }

    @ObfuscatedName("dk.am([II)V")
    public final void method1942(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field491) {
            var3 = arg1 << 1;
        }
        class184.method3266(arg0, 0, var3);
        this.field1629 -= arg1;
        if (this.field1617 != null && this.field1629 <= 0) {
            this.field1629 += Statics.field463 >> 4;
            method71(this.field1617);
            this.method1928(this.field1617, this.field1617.method2016());
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
                        class118 var11 = this.field1630[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1706;
                                if (var12 == null || var12.field1738 <= var8) {
                                    var11.field1704 = true;
                                    int var13 = var11.method1815();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1738 += var13;
                                    }
                                    if (var4 >= this.field1627) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method1795();
                                    if (var14 != null) {
                                        int var15 = var11.field1705;
                                        while (var14 != null) {
                                            this.method1928(var14, var15 * var14.method2016() >> 8);
                                            var14 = var11.method1796();
                                        }
                                    }
                                    class118 var16 = var11.field1707;
                                    var11.field1707 = null;
                                    if (var10 == null) {
                                        this.field1630[var7] = var16;
                                    } else {
                                        var10.field1707 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1631[var7] = var10;
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
                class118 var18 = this.field1630[var17];
                class118[] var19 = this.field1630;
                this.field1631[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1707;
                    var18.field1707 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1629 < 0) {
            this.field1629 = 0;
        }
        if (this.field1617 != null) {
            this.field1617.method1810(arg0, 0, arg1);
        }
        this.field1619 = class176.method2725();
    }

    @ObfuscatedName("u.az(Ldd;B)V")
    public static final void method71(class118 arg0) {
        arg0.field1704 = false;
        if (arg0.field1706 != null) {
            arg0.field1706.field1738 = 0;
        }
        for (class118 var1 = arg0.method1795(); var1 != null; var1 = arg0.method1796()) {
            method71(var1);
        }
    }

    @ObfuscatedName("dk.av(Ldd;II)V")
    public final void method1928(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1631[var3];
        if (var4 == null) {
            this.field1630[var3] = arg0;
        } else {
            var4.field1707 = arg0;
        }
        this.field1631[var3] = arg0;
        arg0.field1705 = arg1;
    }

    @ObfuscatedName("dk.d(B)V")
    public void method724() throws Exception {
    }

    @ObfuscatedName("dk.k(II)V")
    public void method715(int arg0) throws Exception {
    }

    @ObfuscatedName("dk.e(B)I")
    public int method716() throws Exception {
        return this.field1622;
    }

    @ObfuscatedName("dk.p()V")
    public void method726() throws Exception {
    }

    @ObfuscatedName("dk.q(I)V")
    public void method718() {
    }

    @ObfuscatedName("dk.s(I)V")
    public void method719() throws Exception {
    }
}
