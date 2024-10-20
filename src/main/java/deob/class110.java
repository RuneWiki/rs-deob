package deob;

@ObfuscatedName("dn")
public class class110 {

    @ObfuscatedName("dn.n")
    public int[] field1630;

    @ObfuscatedName("dn.c")
    public class120 field1626;

    @ObfuscatedName("dn.v")
    public int field1632 = 32;

    @ObfuscatedName("dn.u")
    public long field1633 = class176.method218();

    @ObfuscatedName("dn.w")
    public int field1634;

    @ObfuscatedName("dn.z")
    public int field1627;

    @ObfuscatedName("dn.y")
    public int field1636;

    @ObfuscatedName("dn.p")
    public long field1648 = 0L;

    @ObfuscatedName("dn.l")
    public int field1638 = 0;

    @ObfuscatedName("dn.x")
    public int field1639 = 0;

    @ObfuscatedName("dn.r")
    public int field1640 = 0;

    @ObfuscatedName("dn.t")
    public long field1641 = 0L;

    @ObfuscatedName("dn.a")
    public boolean field1642 = true;

    @ObfuscatedName("dn.ar")
    public int field1647 = 0;

    @ObfuscatedName("dn.ai")
    public class120[] field1637 = new class120[8];

    @ObfuscatedName("dn.ap")
    public class120[] field1646 = new class120[8];

    @ObfuscatedName("an.x(Lct;I)V")
    public static final void method628(class104 arg0) {
        Statics.field915 = arg0;
    }

    @ObfuscatedName("ak.r(IZII)V")
    public static final void method463(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1644 = arg0;
        Statics.field2050 = arg1;
        Statics.field1628 = arg2;
    }

    @ObfuscatedName("dn.a(Ldx;I)V")
    public final synchronized void method1852(class120 arg0) {
        this.field1626 = arg0;
    }

    @ObfuscatedName("dn.ad(I)V")
    public final synchronized void method1877() {
        if (this.field1630 == null) {
            return;
        }
        long var1 = class176.method218();
        try {
            if (this.field1648 != 0L) {
                if (var1 < this.field1648) {
                    return;
                }
                this.method704(this.field1634);
                this.field1648 = 0L;
                this.field1642 = true;
            }
            int var3 = this.method690();
            if (this.field1640 - var3 > this.field1638) {
                this.field1638 = this.field1640 - var3;
            }
            int var4 = this.field1636 + this.field1627;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1634) {
                this.field1634 += 1024;
                if (this.field1634 > 16384) {
                    this.field1634 = 16384;
                }
                this.method692();
                this.method704(this.field1634);
                var3 = 0;
                this.field1642 = true;
                if (var4 + 256 > this.field1634) {
                    var4 = this.field1634 - 256;
                    this.field1636 = var4 - this.field1627;
                }
            }
            while (var3 < var4) {
                this.method1850(this.field1630, 256);
                this.method691();
                var3 += 256;
            }
            if (var1 > this.field1641) {
                if (this.field1642) {
                    this.field1642 = false;
                } else if (this.field1638 == 0 && this.field1639 == 0) {
                    this.method692();
                    this.field1648 = var1 + 2000L;
                    return;
                } else {
                    this.field1636 = Math.min(this.field1639, this.field1638);
                    this.field1639 = this.field1638;
                }
                this.field1638 = 0;
                this.field1641 = var1 + 2000L;
            }
            this.field1640 = var3;
        } catch (Exception var8) {
            this.method692();
            this.field1648 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1633 + 500000L) {
                var1 = this.field1633;
            }
            while (var1 > this.field1633 + 5000L) {
                this.method1868(256);
                this.field1633 += (long) (256000 / Statics.field1644);
            }
        } catch (Exception var7) {
            this.field1633 = var1;
        }
    }

    @ObfuscatedName("dn.ay(B)V")
    public final void method1847() {
        this.field1642 = true;
    }

    @ObfuscatedName("dn.am(I)V")
    public final synchronized void method1865() {
        this.field1642 = true;
        try {
            this.method693();
        } catch (Exception var2) {
            this.method692();
            this.field1648 = class176.method218() + 2000L;
        }
    }

    @ObfuscatedName("dn.ae(B)V")
    public final synchronized void method1848() {
        if (Statics.field1645 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1645.field1661[var2] == this) {
                    Statics.field1645.field1661[var2] = null;
                }
                if (Statics.field1645.field1661[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1625.shutdownNow();
                Statics.field1625 = null;
                Statics.field1645 = null;
            }
        }
        this.method692();
        this.field1630 = null;
    }

    @ObfuscatedName("dn.az(II)V")
    public final void method1868(int arg0) {
        this.field1647 -= arg0;
        if (this.field1647 < 0) {
            this.field1647 = 0;
        }
        if (this.field1626 != null) {
            this.field1626.method1713(arg0);
        }
    }

    @ObfuscatedName("dn.ar([II)V")
    public final void method1850(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2050) {
            var3 = arg1 << 1;
        }
        class184.method3192(arg0, 0, var3);
        this.field1647 -= arg1;
        if (this.field1626 != null && this.field1647 <= 0) {
            this.field1647 += Statics.field1644 >> 4;
            method998(this.field1626);
            this.method1859(this.field1626, this.field1626.method2060());
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
                                class123 var12 = var11.field1718;
                                if (var12 == null || var12.field1750 <= var8) {
                                    var11.field1719 = true;
                                    int var13 = var11.method1710();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1750 += var13;
                                    }
                                    if (var4 >= this.field1632) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1708();
                                    if (var14 != null) {
                                        int var15 = var11.field1717;
                                        while (var14 != null) {
                                            this.method1859(var14, var15 * var14.method2060() >> 8);
                                            var14 = var11.method1707();
                                        }
                                    }
                                    class120 var16 = var11.field1716;
                                    var11.field1716 = null;
                                    if (var10 == null) {
                                        this.field1637[var7] = var16;
                                    } else {
                                        var10.field1716 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1646[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1716;
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
                this.field1646[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1716;
                    var18.field1716 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1647 < 0) {
            this.field1647 = 0;
        }
        if (this.field1626 != null) {
            this.field1626.method1711(arg0, 0, arg1);
        }
        this.field1633 = class176.method218();
    }

    @ObfuscatedName("bg.ai(Ldx;I)V")
    public static final void method998(class120 arg0) {
        arg0.field1719 = false;
        if (arg0.field1718 != null) {
            arg0.field1718.field1750 = 0;
        }
        for (class120 var1 = arg0.method1708(); var1 != null; var1 = arg0.method1707()) {
            method998(var1);
        }
    }

    @ObfuscatedName("dn.ap(Ldx;II)V")
    public final void method1859(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1646[var3];
        if (var4 == null) {
            this.field1637[var3] = arg0;
        } else {
            var4.field1716 = arg0;
        }
        this.field1646[var3] = arg0;
        arg0.field1717 = arg1;
    }

    @ObfuscatedName("dn.e(I)V")
    public void method699() throws Exception {
    }

    @ObfuscatedName("dn.o(II)V")
    public void method704(int arg0) throws Exception {
    }

    @ObfuscatedName("dn.m(B)I")
    public int method690() throws Exception {
        return this.field1634;
    }

    @ObfuscatedName("dn.g()V")
    public void method691() throws Exception {
    }

    @ObfuscatedName("dn.d(I)V")
    public void method692() {
    }

    @ObfuscatedName("dn.b(I)V")
    public void method693() throws Exception {
    }
}
