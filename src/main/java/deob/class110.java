package deob;

@ObfuscatedName("da")
public class class110 {

    @ObfuscatedName("da.q")
    public int[] field1642;

    @ObfuscatedName("da.j")
    public class120 field1643;

    @ObfuscatedName("da.k")
    public int field1644 = 32;

    @ObfuscatedName("da.r")
    public long field1645 = class176.method89();

    @ObfuscatedName("da.m")
    public int field1650;

    @ObfuscatedName("da.d")
    public int field1647;

    @ObfuscatedName("da.s")
    public int field1638;

    @ObfuscatedName("da.g")
    public long field1649 = 0L;

    @ObfuscatedName("da.w")
    public int field1648 = 0;

    @ObfuscatedName("da.p")
    public int field1651 = 0;

    @ObfuscatedName("da.l")
    public int field1652 = 0;

    @ObfuscatedName("da.u")
    public long field1653 = 0L;

    @ObfuscatedName("da.t")
    public boolean field1654 = true;

    @ObfuscatedName("da.ah")
    public int field1657 = 0;

    @ObfuscatedName("da.ai")
    public class120[] field1658 = new class120[8];

    @ObfuscatedName("da.aw")
    public class120[] field1659 = new class120[8];

    @ObfuscatedName("y.an(IZII)V")
    public static final void method11(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1641 = arg0;
        Statics.field3733 = arg1;
        Statics.field523 = arg2;
    }

    @ObfuscatedName("da.at(Ldy;B)V")
    public final synchronized void method1872(class120 arg0) {
        this.field1643 = arg0;
    }

    @ObfuscatedName("da.ah(B)V")
    public final synchronized void method1863() {
        if (this.field1642 == null) {
            return;
        }
        long var1 = class176.method89();
        try {
            if (this.field1649 != 0L) {
                if (var1 < this.field1649) {
                    return;
                }
                this.method673(this.field1650);
                this.field1649 = 0L;
                this.field1654 = true;
            }
            int var3 = this.method680();
            if (this.field1652 - var3 > this.field1648) {
                this.field1648 = this.field1652 - var3;
            }
            int var4 = this.field1647 + this.field1638;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1650) {
                this.field1650 += 1024;
                if (this.field1650 > 16384) {
                    this.field1650 = 16384;
                }
                this.method676();
                this.method673(this.field1650);
                var3 = 0;
                this.field1654 = true;
                if (var4 + 256 > this.field1650) {
                    var4 = this.field1650 - 256;
                    this.field1638 = var4 - this.field1647;
                }
            }
            while (var3 < var4) {
                this.method1868(this.field1642, 256);
                this.method671();
                var3 += 256;
            }
            if (var1 > this.field1653) {
                if (this.field1654) {
                    this.field1654 = false;
                } else if (this.field1648 == 0 && this.field1651 == 0) {
                    this.method676();
                    this.field1649 = var1 + 2000L;
                    return;
                } else {
                    this.field1638 = Math.min(this.field1651, this.field1648);
                    this.field1651 = this.field1648;
                }
                this.field1648 = 0;
                this.field1653 = var1 + 2000L;
            }
            this.field1652 = var3;
        } catch (Exception var8) {
            this.method676();
            this.field1649 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1645 + 500000L) {
                var1 = this.field1645;
            }
            while (var1 > this.field1645 + 5000L) {
                this.method1862(256);
                this.field1645 += (long) (256000 / Statics.field1641);
            }
        } catch (Exception var7) {
            this.field1645 = var1;
        }
    }

    @ObfuscatedName("da.ai(I)V")
    public final void method1889() {
        this.field1654 = true;
    }

    @ObfuscatedName("da.aw(I)V")
    public final synchronized void method1865() {
        this.field1654 = true;
        try {
            this.method687();
        } catch (Exception var2) {
            this.method676();
            this.field1649 = class176.method89() + 2000L;
        }
    }

    @ObfuscatedName("da.al(I)V")
    public final synchronized void method1873() {
        if (Statics.field1655 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1655.field1676[var2] == this) {
                    Statics.field1655.field1676[var2] = null;
                }
                if (Statics.field1655.field1676[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1640.shutdownNow();
                Statics.field1640 = null;
                Statics.field1655 = null;
            }
        }
        this.method676();
        this.field1642 = null;
    }

    @ObfuscatedName("da.ab(II)V")
    public final void method1862(int arg0) {
        this.field1657 -= arg0;
        if (this.field1657 < 0) {
            this.field1657 = 0;
        }
        if (this.field1643 != null) {
            this.field1643.method1725(arg0);
        }
    }

    @ObfuscatedName("da.aa([II)V")
    public final void method1868(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3733) {
            var3 = arg1 << 1;
        }
        class184.method3153(arg0, 0, var3);
        this.field1657 -= arg1;
        if (this.field1643 != null && this.field1657 <= 0) {
            this.field1657 += Statics.field1641 >> 4;
            method220(this.field1643);
            this.method1876(this.field1643, this.field1643.method2003());
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
                        class120 var11 = this.field1658[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1735;
                                if (var12 == null || var12.field1767 <= var8) {
                                    var11.field1733 = true;
                                    int var13 = var11.method1730();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1767 += var13;
                                    }
                                    if (var4 >= this.field1644) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1731();
                                    if (var14 != null) {
                                        int var15 = var11.field1736;
                                        while (var14 != null) {
                                            this.method1876(var14, var15 * var14.method2003() >> 8);
                                            var14 = var11.method1733();
                                        }
                                    }
                                    class120 var16 = var11.field1734;
                                    var11.field1734 = null;
                                    if (var10 == null) {
                                        this.field1658[var7] = var16;
                                    } else {
                                        var10.field1734 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1659[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1734;
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
                class120 var18 = this.field1658[var17];
                class120[] var19 = this.field1658;
                this.field1659[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1734;
                    var18.field1734 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1657 < 0) {
            this.field1657 = 0;
        }
        if (this.field1643 != null) {
            this.field1643.method1734(arg0, 0, arg1);
        }
        this.field1645 = class176.method89();
    }

    @ObfuscatedName("af.ap(Ldy;B)V")
    public static final void method220(class120 arg0) {
        arg0.field1733 = false;
        if (arg0.field1735 != null) {
            arg0.field1735.field1767 = 0;
        }
        for (class120 var1 = arg0.method1731(); var1 != null; var1 = arg0.method1733()) {
            method220(var1);
        }
    }

    @ObfuscatedName("da.ae(Ldy;II)V")
    public final void method1876(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1659[var3];
        if (var4 == null) {
            this.field1658[var3] = arg0;
        } else {
            var4.field1734 = arg0;
        }
        this.field1659[var3] = arg0;
        arg0.field1736 = arg1;
    }

    @ObfuscatedName("da.i(I)V")
    public void method675() throws Exception {
    }

    @ObfuscatedName("da.c(II)V")
    public void method673(int arg0) throws Exception {
    }

    @ObfuscatedName("da.e(I)I")
    public int method680() throws Exception {
        return this.field1650;
    }

    @ObfuscatedName("da.v()V")
    public void method671() throws Exception {
    }

    @ObfuscatedName("da.b(I)V")
    public void method676() {
    }

    @ObfuscatedName("da.y(B)V")
    public void method687() throws Exception {
    }
}
