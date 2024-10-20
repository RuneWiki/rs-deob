package deob;

@ObfuscatedName("dn")
public class class109 {

    @ObfuscatedName("dn.n")
    public int[] field1526;

    @ObfuscatedName("dn.y")
    public class119 field1538;

    @ObfuscatedName("dn.o")
    public int field1530 = 32;

    @ObfuscatedName("dn.r")
    public long field1531 = class187.method1411();

    @ObfuscatedName("dn.i")
    public int field1541;

    @ObfuscatedName("dn.l")
    public int field1528;

    @ObfuscatedName("dn.m")
    public int field1534;

    @ObfuscatedName("dn.q")
    public long field1535 = 0L;

    @ObfuscatedName("dn.b")
    public int field1539 = 0;

    @ObfuscatedName("dn.h")
    public int field1537 = 0;

    @ObfuscatedName("dn.d")
    public int field1533 = 0;

    @ObfuscatedName("dn.v")
    public long field1529 = 0L;

    @ObfuscatedName("dn.p")
    public boolean field1540 = true;

    @ObfuscatedName("dn.aq")
    public int field1542 = 0;

    @ObfuscatedName("dn.ax")
    public class119[] field1543 = new class119[8];

    @ObfuscatedName("dn.at")
    public class119[] field1544 = new class119[8];

    @ObfuscatedName("ct.d(Lca;B)V")
    public static final void method1702(class103 arg0) {
        Statics.field1527 = arg0;
    }

    @ObfuscatedName("gd.v(IZII)V")
    public static final void method3219(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field715 = arg0;
        Statics.field1301 = arg1;
        Statics.field2706 = arg2;
    }

    @ObfuscatedName("dn.ab(Ldy;I)V")
    public final synchronized void method1843(class119 arg0) {
        this.field1538 = arg0;
    }

    @ObfuscatedName("dn.ad(I)V")
    public final synchronized void method1844() {
        if (this.field1526 == null) {
            return;
        }
        long var1 = class187.method1411();
        try {
            if (this.field1535 != 0L) {
                if (var1 < this.field1535) {
                    return;
                }
                this.method670(this.field1541);
                this.field1535 = 0L;
                this.field1540 = true;
            }
            int var3 = this.method673();
            if (this.field1533 - var3 > this.field1539) {
                this.field1539 = this.field1533 - var3;
            }
            int var4 = this.field1534 + this.field1528;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1541) {
                this.field1541 += 1024;
                if (this.field1541 > 16384) {
                    this.field1541 = 16384;
                }
                this.method684();
                this.method670(this.field1541);
                var3 = 0;
                this.field1540 = true;
                if (var4 + 256 > this.field1541) {
                    var4 = this.field1541 - 256;
                    this.field1534 = var4 - this.field1528;
                }
            }
            while (var3 < var4) {
                this.method1849(this.field1526, 256);
                this.method675();
                var3 += 256;
            }
            if (var1 > this.field1529) {
                if (this.field1540) {
                    this.field1540 = false;
                } else if (this.field1539 == 0 && this.field1537 == 0) {
                    this.method684();
                    this.field1535 = var1 + 2000L;
                    return;
                } else {
                    this.field1534 = Math.min(this.field1537, this.field1539);
                    this.field1537 = this.field1539;
                }
                this.field1539 = 0;
                this.field1529 = var1 + 2000L;
            }
            this.field1533 = var3;
        } catch (Exception var8) {
            this.method684();
            this.field1535 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1531 + 500000L) {
                var1 = this.field1531;
            }
            while (var1 > this.field1531 + 5000L) {
                this.method1848(256);
                this.field1531 += (long) (256000 / Statics.field715);
            }
        } catch (Exception var7) {
            this.field1531 = var1;
        }
    }

    @ObfuscatedName("dn.ag(I)V")
    public final void method1845() {
        this.field1540 = true;
    }

    @ObfuscatedName("dn.ak(I)V")
    public final synchronized void method1846() {
        this.field1540 = true;
        try {
            this.method674();
        } catch (Exception var2) {
            this.method684();
            this.field1535 = class187.method1411() + 2000L;
        }
    }

    @ObfuscatedName("dn.as(I)V")
    public final synchronized void method1847() {
        if (Statics.field1761 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1761.field1556[var2] == this) {
                    Statics.field1761.field1556[var2] = null;
                }
                if (Statics.field1761.field1556[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1536.shutdownNow();
                Statics.field1536 = null;
                Statics.field1761 = null;
            }
        }
        this.method684();
        this.field1526 = null;
    }

    @ObfuscatedName("dn.aq(IS)V")
    public final void method1848(int arg0) {
        this.field1542 -= arg0;
        if (this.field1542 < 0) {
            this.field1542 = 0;
        }
        if (this.field1538 != null) {
            this.field1538.method1735(arg0);
        }
    }

    @ObfuscatedName("dn.ax([II)V")
    public final void method1849(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1301) {
            var3 = arg1 << 1;
        }
        class195.method3302(arg0, 0, var3);
        this.field1542 -= arg1;
        if (this.field1538 != null && this.field1542 <= 0) {
            this.field1542 += Statics.field715 >> 4;
            method979(this.field1538);
            this.method1853(this.field1538, this.field1538.method1931());
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
                        class119 var11 = this.field1543[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1614;
                                if (var12 == null || var12.field1646 <= var8) {
                                    var11.field1615 = true;
                                    int var13 = var11.method1732();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1646 += var13;
                                    }
                                    if (var4 >= this.field1530) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1730();
                                    if (var14 != null) {
                                        int var15 = var11.field1612;
                                        while (var14 != null) {
                                            this.method1853(var14, var15 * var14.method1931() >> 8);
                                            var14 = var11.method1758();
                                        }
                                    }
                                    class119 var16 = var11.field1613;
                                    var11.field1613 = null;
                                    if (var10 == null) {
                                        this.field1543[var7] = var16;
                                    } else {
                                        var10.field1613 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1544[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1613;
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
                class119 var18 = this.field1543[var17];
                class119[] var19 = this.field1543;
                this.field1544[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1613;
                    var18.field1613 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1542 < 0) {
            this.field1542 = 0;
        }
        if (this.field1538 != null) {
            this.field1538.method1733(arg0, 0, arg1);
        }
        this.field1531 = class187.method1411();
    }

    @ObfuscatedName("bj.at(Ldy;B)V")
    public static final void method979(class119 arg0) {
        arg0.field1615 = false;
        if (arg0.field1614 != null) {
            arg0.field1614.field1646 = 0;
        }
        for (class119 var1 = arg0.method1730(); var1 != null; var1 = arg0.method1758()) {
            method979(var1);
        }
    }

    @ObfuscatedName("dn.ap(Ldy;IB)V")
    public final void method1853(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1544[var3];
        if (var4 == null) {
            this.field1543[var3] = arg0;
        } else {
            var4.field1613 = arg0;
        }
        this.field1544[var3] = arg0;
        arg0.field1612 = arg1;
    }

    @ObfuscatedName("dn.a(I)V")
    public void method669() throws Exception {
    }

    @ObfuscatedName("dn.w(II)V")
    public void method670(int arg0) throws Exception {
    }

    @ObfuscatedName("dn.e(I)I")
    public int method673() throws Exception {
        return this.field1541;
    }

    @ObfuscatedName("dn.k()V")
    public void method675() throws Exception {
    }

    @ObfuscatedName("dn.u(I)V")
    public void method684() {
    }

    @ObfuscatedName("dn.z(I)V")
    public void method674() throws Exception {
    }
}
