package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dx")
public class class110 {

    @ObfuscatedName("dx.k")
    public int[] field1641;

    @ObfuscatedName("dx.e")
    public class120 field1621;

    @ObfuscatedName("dx.r")
    public int field1620 = 32;

    @ObfuscatedName("dx.l")
    public long field1630 = class179.method3585();

    @ObfuscatedName("dx.y")
    public int field1631;

    @ObfuscatedName("dx.w")
    public int field1632;

    @ObfuscatedName("dx.i")
    public int field1623;

    @ObfuscatedName("dx.g")
    public long field1633 = 0L;

    @ObfuscatedName("dx.a")
    public int field1622 = 0;

    @ObfuscatedName("dx.x")
    public int field1636 = 0;

    @ObfuscatedName("dx.b")
    public int field1637 = 0;

    @ObfuscatedName("dx.j")
    public long field1638 = 0L;

    @ObfuscatedName("dx.v")
    public boolean field1639 = true;

    @ObfuscatedName("dx.aa")
    public int field1640 = 0;

    @ObfuscatedName("dx.aq")
    public class120[] field1629 = new class120[8];

    @ObfuscatedName("dx.aj")
    public class120[] field1642 = new class120[8];

    @ObfuscatedName("aq.v(Lcv;I)V")
    public static final void method322(class104 arg0) {
        Statics.field876 = arg0;
    }

    @ObfuscatedName("cq.ap(IZIB)V")
    public static final void method1745(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1634 = arg0;
        Statics.field1627 = arg1;
        Statics.field1624 = arg2;
    }

    @ObfuscatedName("bw.ar(Lef;IIB)Ldx;")
    public static final class110 method953(class156 arg0, int arg1, int arg2) {
        if (Statics.field1634 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field876.method662();
                var3.field1641 = new int[256 * (Statics.field1627 ? 2 : 1)];
                var3.field1632 = arg2;
                var3.method684();
                var3.field1631 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1631 > 16384) {
                    var3.field1631 = 16384;
                }
                var3.method685(var3.field1631);
                if (Statics.field1624 > 0 && Statics.field1635 == null) {
                    Statics.field1635 = new class112();
                    Statics.field1628 = Executors.newScheduledThreadPool(1);
                    Statics.field1628.scheduleAtFixedRate(Statics.field1635, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1635 != null) {
                    if (Statics.field1635.field1658[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1635.field1658[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.am(Lds;I)V")
    public final synchronized void method1917(class120 arg0) {
        this.field1621 = arg0;
    }

    @ObfuscatedName("dx.ab(I)V")
    public final synchronized void method1888() {
        if (this.field1641 == null) {
            return;
        }
        long var1 = class179.method3585();
        try {
            if (this.field1633 != 0L) {
                if (var1 < this.field1633) {
                    return;
                }
                this.method685(this.field1631);
                this.field1633 = 0L;
                this.field1639 = true;
            }
            int var3 = this.method687();
            if (this.field1637 - var3 > this.field1622) {
                this.field1622 = this.field1637 - var3;
            }
            int var4 = this.field1632 + this.field1623;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1631) {
                this.field1631 += 1024;
                if (this.field1631 > 16384) {
                    this.field1631 = 16384;
                }
                this.method702();
                this.method685(this.field1631);
                var3 = 0;
                this.field1639 = true;
                if (var4 + 256 > this.field1631) {
                    var4 = this.field1631 - 256;
                    this.field1623 = var4 - this.field1632;
                }
            }
            while (var3 < var4) {
                this.method1892(this.field1641, 256);
                this.method697();
                var3 += 256;
            }
            if (var1 > this.field1638) {
                if (this.field1639) {
                    this.field1639 = false;
                } else if (this.field1622 == 0 && this.field1636 == 0) {
                    this.method702();
                    this.field1633 = var1 + 2000L;
                    return;
                } else {
                    this.field1623 = Math.min(this.field1636, this.field1622);
                    this.field1636 = this.field1622;
                }
                this.field1622 = 0;
                this.field1638 = var1 + 2000L;
            }
            this.field1637 = var3;
        } catch (Exception var8) {
            this.method702();
            this.field1633 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1630 + 500000L) {
                var1 = this.field1630;
            }
            while (var1 > this.field1630 + 5000L) {
                this.method1891(256);
                this.field1630 += (long) (256000 / Statics.field1634);
            }
        } catch (Exception var7) {
            this.field1630 = var1;
        }
    }

    @ObfuscatedName("dx.af(I)V")
    public final void method1920() {
        this.field1639 = true;
    }

    @ObfuscatedName("dx.aa(I)V")
    public final synchronized void method1896() {
        this.field1639 = true;
        try {
            this.method689();
        } catch (Exception var2) {
            this.method702();
            this.field1633 = class179.method3585() + 2000L;
        }
    }

    @ObfuscatedName("dx.aq(I)V")
    public final synchronized void method1890() {
        if (Statics.field1635 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1635.field1658[var2] == this) {
                    Statics.field1635.field1658[var2] = null;
                }
                if (Statics.field1635.field1658[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1628.shutdownNow();
                Statics.field1628 = null;
                Statics.field1635 = null;
            }
        }
        this.method702();
        this.field1641 = null;
    }

    @ObfuscatedName("dx.aj(II)V")
    public final void method1891(int arg0) {
        this.field1640 -= arg0;
        if (this.field1640 < 0) {
            this.field1640 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1775(arg0);
        }
    }

    @ObfuscatedName("dx.as([II)V")
    public final void method1892(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1627) {
            var3 = arg1 << 1;
        }
        class187.method3248(arg0, 0, var3);
        this.field1640 -= arg1;
        if (this.field1621 != null && this.field1640 <= 0) {
            this.field1640 += Statics.field1634 >> 4;
            method136(this.field1621);
            this.method1893(this.field1621, this.field1621.method1988());
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
                        class120 var11 = this.field1629[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1716;
                                if (var12 == null || var12.field1748 <= var8) {
                                    var11.field1717 = true;
                                    int var13 = var11.method1770();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1748 += var13;
                                    }
                                    if (var4 >= this.field1620) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1797();
                                    if (var14 != null) {
                                        int var15 = var11.field1714;
                                        while (var14 != null) {
                                            this.method1893(var14, var15 * var14.method1988() >> 8);
                                            var14 = var11.method1778();
                                        }
                                    }
                                    class120 var16 = var11.field1715;
                                    var11.field1715 = null;
                                    if (var10 == null) {
                                        this.field1629[var7] = var16;
                                    } else {
                                        var10.field1715 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1642[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1715;
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
                class120 var18 = this.field1629[var17];
                class120[] var19 = this.field1629;
                this.field1642[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1715;
                    var18.field1715 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1640 < 0) {
            this.field1640 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1773(arg0, 0, arg1);
        }
        this.field1630 = class179.method3585();
    }

    @ObfuscatedName("w.av(Lds;I)V")
    public static final void method136(class120 arg0) {
        arg0.field1717 = false;
        if (arg0.field1716 != null) {
            arg0.field1716.field1748 = 0;
        }
        for (class120 var1 = arg0.method1797(); var1 != null; var1 = arg0.method1778()) {
            method136(var1);
        }
    }

    @ObfuscatedName("dx.ao(Lds;II)V")
    public final void method1893(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1642[var3];
        if (var4 == null) {
            this.field1629[var3] = arg0;
        } else {
            var4.field1715 = arg0;
        }
        this.field1642[var3] = arg0;
        arg0.field1714 = arg1;
    }

    @ObfuscatedName("dx.s(I)V")
    public void method684() throws Exception {
    }

    @ObfuscatedName("dx.c(II)V")
    public void method685(int arg0) throws Exception {
    }

    @ObfuscatedName("dx.f(B)I")
    public int method687() throws Exception {
        return this.field1631;
    }

    @ObfuscatedName("dx.m()V")
    public void method697() throws Exception {
    }

    @ObfuscatedName("dx.h(B)V")
    public void method702() {
    }

    @ObfuscatedName("dx.t(B)V")
    public void method689() throws Exception {
    }
}
