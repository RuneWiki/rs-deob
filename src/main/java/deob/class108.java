package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dk")
public class class108 {

    @ObfuscatedName("dk.t")
    public int[] field1620;

    @ObfuscatedName("dk.a")
    public class118 field1632;

    @ObfuscatedName("dk.i")
    public int field1630 = 32;

    @ObfuscatedName("dk.h")
    public long field1623 = class176.method3200();

    @ObfuscatedName("dk.b")
    public int field1624;

    @ObfuscatedName("dk.j")
    public int field1629;

    @ObfuscatedName("dk.y")
    public int field1625;

    @ObfuscatedName("dk.k")
    public long field1627 = 0L;

    @ObfuscatedName("dk.c")
    public int field1628 = 0;

    @ObfuscatedName("dk.r")
    public int field1622 = 0;

    @ObfuscatedName("dk.m")
    public int field1634 = 0;

    @ObfuscatedName("dk.l")
    public long field1631 = 0L;

    @ObfuscatedName("dk.f")
    public boolean field1635 = true;

    @ObfuscatedName("dk.az")
    public int field1617 = 0;

    @ObfuscatedName("dk.at")
    public class118[] field1626 = new class118[8];

    @ObfuscatedName("dk.ao")
    public class118[] field1633 = new class118[8];

    @ObfuscatedName("ct.l(Lcs;B)V")
    public static final void method1759(class102 arg0) {
        Statics.field1619 = arg0;
    }

    @ObfuscatedName("cp.f(Lem;III)Ldk;")
    public static final class108 method1489(class155 arg0, int arg1, int arg2) {
        if (Statics.field1621 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field1619.method671();
                var3.field1620 = new int[256 * (Statics.field1618 ? 2 : 1)];
                var3.field1629 = arg2;
                var3.method695();
                var3.field1624 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1624 > 16384) {
                    var3.field1624 = 16384;
                }
                var3.method696(var3.field1624);
                if (Statics.field2118 > 0 && Statics.field1510 == null) {
                    Statics.field1510 = new class110();
                    Statics.field683 = Executors.newScheduledThreadPool(1);
                    Statics.field683.scheduleAtFixedRate(Statics.field1510, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1510 != null) {
                    if (Statics.field1510.field1649[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1510.field1649[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dk.ap(Ldm;B)V")
    public final synchronized void method1922(class118 arg0) {
        this.field1632 = arg0;
    }

    @ObfuscatedName("dk.af(I)V")
    public final synchronized void method1914() {
        if (this.field1620 == null) {
            return;
        }
        long var1 = class176.method3200();
        try {
            if (this.field1627 != 0L) {
                if (var1 < this.field1627) {
                    return;
                }
                this.method696(this.field1624);
                this.field1627 = 0L;
                this.field1635 = true;
            }
            int var3 = this.method702();
            if (this.field1634 - var3 > this.field1628) {
                this.field1628 = this.field1634 - var3;
            }
            int var4 = this.field1629 + this.field1625;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1624) {
                this.field1624 += 1024;
                if (this.field1624 > 16384) {
                    this.field1624 = 16384;
                }
                this.method699();
                this.method696(this.field1624);
                var3 = 0;
                this.field1635 = true;
                if (var4 + 256 > this.field1624) {
                    var4 = this.field1624 - 256;
                    this.field1625 = var4 - this.field1629;
                }
            }
            while (var3 < var4) {
                this.method1927(this.field1620, 256);
                this.method698();
                var3 += 256;
            }
            if (var1 > this.field1631) {
                if (this.field1635) {
                    this.field1635 = false;
                } else if (this.field1628 == 0 && this.field1622 == 0) {
                    this.method699();
                    this.field1627 = var1 + 2000L;
                    return;
                } else {
                    this.field1625 = Math.min(this.field1622, this.field1628);
                    this.field1622 = this.field1628;
                }
                this.field1628 = 0;
                this.field1631 = var1 + 2000L;
            }
            this.field1634 = var3;
        } catch (Exception var8) {
            this.method699();
            this.field1627 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1623 + 500000L) {
                var1 = this.field1623;
            }
            while (var1 > this.field1623 + 5000L) {
                this.method1918(256);
                this.field1623 += (long) (256000 / Statics.field1621);
            }
        } catch (Exception var7) {
            this.field1623 = var1;
        }
    }

    @ObfuscatedName("dk.aa(B)V")
    public final void method1932() {
        this.field1635 = true;
    }

    @ObfuscatedName("dk.ay(B)V")
    public final synchronized void method1916() {
        this.field1635 = true;
        try {
            this.method700();
        } catch (Exception var2) {
            this.method699();
            this.field1627 = class176.method3200() + 2000L;
        }
    }

    @ObfuscatedName("dk.aw(B)V")
    public final synchronized void method1917() {
        if (Statics.field1510 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1510.field1649[var2] == this) {
                    Statics.field1510.field1649[var2] = null;
                }
                if (Statics.field1510.field1649[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field683.shutdownNow();
                Statics.field683 = null;
                Statics.field1510 = null;
            }
        }
        this.method699();
        this.field1620 = null;
    }

    @ObfuscatedName("dk.az(II)V")
    public final void method1918(int arg0) {
        this.field1617 -= arg0;
        if (this.field1617 < 0) {
            this.field1617 = 0;
        }
        if (this.field1632 != null) {
            this.field1632.method1815(arg0);
        }
    }

    @ObfuscatedName("dk.at([II)V")
    public final void method1927(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1618) {
            var3 = arg1 << 1;
        }
        class184.method3284(arg0, 0, var3);
        this.field1617 -= arg1;
        if (this.field1632 != null && this.field1617 <= 0) {
            this.field1617 += Statics.field1621 >> 4;
            method46(this.field1632);
            this.method1919(this.field1632, this.field1632.method2008());
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
                        class118 var11 = this.field1626[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1706;
                                if (var12 == null || var12.field1738 <= var8) {
                                    var11.field1705 = true;
                                    int var13 = var11.method1785();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1738 += var13;
                                    }
                                    if (var4 >= this.field1630) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method1817();
                                    if (var14 != null) {
                                        int var15 = var11.field1707;
                                        while (var14 != null) {
                                            this.method1919(var14, var15 * var14.method2008() >> 8);
                                            var14 = var11.method1784();
                                        }
                                    }
                                    class118 var16 = var11.field1704;
                                    var11.field1704 = null;
                                    if (var10 == null) {
                                        this.field1626[var7] = var16;
                                    } else {
                                        var10.field1704 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1633[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1704;
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
                class118 var18 = this.field1626[var17];
                class118[] var19 = this.field1626;
                this.field1633[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1704;
                    var18.field1704 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1617 < 0) {
            this.field1617 = 0;
        }
        if (this.field1632 != null) {
            this.field1632.method1786(arg0, 0, arg1);
        }
        this.field1623 = class176.method3200();
    }

    @ObfuscatedName("x.ao(Ldm;B)V")
    public static final void method46(class118 arg0) {
        arg0.field1705 = false;
        if (arg0.field1706 != null) {
            arg0.field1706.field1738 = 0;
        }
        for (class118 var1 = arg0.method1817(); var1 != null; var1 = arg0.method1784()) {
            method46(var1);
        }
    }

    @ObfuscatedName("dk.aq(Ldm;II)V")
    public final void method1919(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1633[var3];
        if (var4 == null) {
            this.field1626[var3] = arg0;
        } else {
            var4.field1704 = arg0;
        }
        this.field1633[var3] = arg0;
        arg0.field1707 = arg1;
    }

    @ObfuscatedName("dk.w(B)V")
    public void method695() throws Exception {
    }

    @ObfuscatedName("dk.s(IB)V")
    public void method696(int arg0) throws Exception {
    }

    @ObfuscatedName("dk.q(B)I")
    public int method702() throws Exception {
        return this.field1624;
    }

    @ObfuscatedName("dk.o()V")
    public void method698() throws Exception {
    }

    @ObfuscatedName("dk.g(I)V")
    public void method699() {
    }

    @ObfuscatedName("dk.v(B)V")
    public void method700() throws Exception {
    }
}
