package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ds")
public class class110 {

    @ObfuscatedName("ds.k")
    public int[] field1623;

    @ObfuscatedName("ds.t")
    public class120 field1621;

    @ObfuscatedName("ds.c")
    public int field1625 = 32;

    @ObfuscatedName("ds.o")
    public long field1624 = class176.method584();

    @ObfuscatedName("ds.x")
    public int field1626;

    @ObfuscatedName("ds.f")
    public int field1632;

    @ObfuscatedName("ds.h")
    public int field1629;

    @ObfuscatedName("ds.z")
    public long field1630 = 0L;

    @ObfuscatedName("ds.i")
    public int field1631 = 0;

    @ObfuscatedName("ds.d")
    public int field1639 = 0;

    @ObfuscatedName("ds.b")
    public int field1633 = 0;

    @ObfuscatedName("ds.q")
    public long field1634 = 0L;

    @ObfuscatedName("ds.y")
    public boolean field1635 = true;

    @ObfuscatedName("ds.ar")
    public int field1636 = 0;

    @ObfuscatedName("ds.am")
    public class120[] field1637 = new class120[8];

    @ObfuscatedName("ds.aw")
    public class120[] field1638 = new class120[8];

    @ObfuscatedName("da.au(Len;IIB)Lds;")
    public static final class110 method2158(class155 arg0, int arg1, int arg2) {
        if (Statics.field1552 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field3667.method666();
                var3.field1623 = new int[256 * (Statics.field1628 ? 2 : 1)];
                var3.field1632 = arg2;
                var3.method687();
                var3.field1626 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1626 > 16384) {
                    var3.field1626 = 16384;
                }
                var3.method686(var3.field1626);
                if (Statics.field272 > 0 && Statics.field353 == null) {
                    Statics.field353 = new class112();
                    Statics.field3755 = Executors.newScheduledThreadPool(1);
                    Statics.field3755.scheduleAtFixedRate(Statics.field353, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field353 != null) {
                    if (Statics.field353.field1654[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field353.field1654[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.ak(Ldf;B)V")
    public final synchronized void method1822(class120 arg0) {
        this.field1621 = arg0;
    }

    @ObfuscatedName("ds.ap(I)V")
    public final synchronized void method1823() {
        if (this.field1623 == null) {
            return;
        }
        long var1 = class176.method584();
        try {
            if (this.field1630 != 0L) {
                if (var1 < this.field1630) {
                    return;
                }
                this.method686(this.field1626);
                this.field1630 = 0L;
                this.field1635 = true;
            }
            int var3 = this.method689();
            if (this.field1633 - var3 > this.field1631) {
                this.field1631 = this.field1633 - var3;
            }
            int var4 = this.field1632 + this.field1629;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1626) {
                this.field1626 += 1024;
                if (this.field1626 > 16384) {
                    this.field1626 = 16384;
                }
                this.method684();
                this.method686(this.field1626);
                var3 = 0;
                this.field1635 = true;
                if (var4 + 256 > this.field1626) {
                    var4 = this.field1626 - 256;
                    this.field1629 = var4 - this.field1632;
                }
            }
            while (var3 < var4) {
                this.method1828(this.field1623, 256);
                this.method688();
                var3 += 256;
            }
            if (var1 > this.field1634) {
                if (this.field1635) {
                    this.field1635 = false;
                } else if (this.field1631 == 0 && this.field1639 == 0) {
                    this.method684();
                    this.field1630 = var1 + 2000L;
                    return;
                } else {
                    this.field1629 = Math.min(this.field1639, this.field1631);
                    this.field1639 = this.field1631;
                }
                this.field1631 = 0;
                this.field1634 = var1 + 2000L;
            }
            this.field1633 = var3;
        } catch (Exception var8) {
            this.method684();
            this.field1630 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1624 + 500000L) {
                var1 = this.field1624;
            }
            while (var1 > this.field1624 + 5000L) {
                this.method1827(256);
                this.field1624 += (long) (256000 / Statics.field1552);
            }
        } catch (Exception var7) {
            this.field1624 = var1;
        }
    }

    @ObfuscatedName("ds.ar(I)V")
    public final void method1849() {
        this.field1635 = true;
    }

    @ObfuscatedName("ds.am(I)V")
    public final synchronized void method1825() {
        this.field1635 = true;
        try {
            this.method690();
        } catch (Exception var2) {
            this.method684();
            this.field1630 = class176.method584() + 2000L;
        }
    }

    @ObfuscatedName("ds.aw(I)V")
    public final synchronized void method1826() {
        if (Statics.field353 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field353.field1654[var2] == this) {
                    Statics.field353.field1654[var2] = null;
                }
                if (Statics.field353.field1654[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3755.shutdownNow();
                Statics.field3755 = null;
                Statics.field353 = null;
            }
        }
        this.method684();
        this.field1623 = null;
    }

    @ObfuscatedName("ds.aq(IB)V")
    public final void method1827(int arg0) {
        this.field1636 -= arg0;
        if (this.field1636 < 0) {
            this.field1636 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1703(arg0);
        }
    }

    @ObfuscatedName("ds.aa([II)V")
    public final void method1828(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1628) {
            var3 = arg1 << 1;
        }
        class184.method3162(arg0, 0, var3);
        this.field1636 -= arg1;
        if (this.field1621 != null && this.field1636 <= 0) {
            this.field1636 += Statics.field1552 >> 4;
            Statics.method960(this.field1621);
            this.method1841(this.field1621, this.field1621.method1922());
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
                        class120 var11 = this.field1637[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1707;
                                if (var12 == null || var12.field1739 <= var8) {
                                    var11.field1708 = true;
                                    int var13 = var11.method1700();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1739 += var13;
                                    }
                                    if (var4 >= this.field1625) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1698();
                                    if (var14 != null) {
                                        int var15 = var11.field1705;
                                        while (var14 != null) {
                                            this.method1841(var14, var15 * var14.method1922() >> 8);
                                            var14 = var11.method1719();
                                        }
                                    }
                                    class120 var16 = var11.field1706;
                                    var11.field1706 = null;
                                    if (var10 == null) {
                                        this.field1637[var7] = var16;
                                    } else {
                                        var10.field1706 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1638[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1706;
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
                class120 var18 = this.field1637[var17];
                class120[] var19 = this.field1637;
                this.field1638[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1706;
                    var18.field1706 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1636 < 0) {
            this.field1636 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1721(arg0, 0, arg1);
        }
        this.field1624 = class176.method584();
    }

    @ObfuscatedName("ds.aj(Ldf;II)V")
    public final void method1841(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1638[var3];
        if (var4 == null) {
            this.field1637[var3] = arg0;
        } else {
            var4.field1706 = arg0;
        }
        this.field1638[var3] = arg0;
        arg0.field1705 = arg1;
    }

    @ObfuscatedName("ds.a(B)V")
    public void method687() throws Exception {
    }

    @ObfuscatedName("ds.j(II)V")
    public void method686(int arg0) throws Exception {
    }

    @ObfuscatedName("ds.n(B)I")
    public int method689() throws Exception {
        return this.field1626;
    }

    @ObfuscatedName("ds.r()V")
    public void method688() throws Exception {
    }

    @ObfuscatedName("ds.v(B)V")
    public void method684() {
    }

    @ObfuscatedName("ds.e(I)V")
    public void method690() throws Exception {
    }
}
