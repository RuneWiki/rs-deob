package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dy")
public class class110 {

    @ObfuscatedName("dy.p")
    public int[] field1646;

    @ObfuscatedName("dy.q")
    public class120 field1635;

    @ObfuscatedName("dy.l")
    public int field1639 = 32;

    @ObfuscatedName("dy.c")
    public long field1640 = class179.method1665();

    @ObfuscatedName("dy.n")
    public int field1641;

    @ObfuscatedName("dy.z")
    public int field1642;

    @ObfuscatedName("dy.e")
    public int field1643;

    @ObfuscatedName("dy.g")
    public long field1644 = 0L;

    @ObfuscatedName("dy.d")
    public int field1645 = 0;

    @ObfuscatedName("dy.y")
    public int field1648 = 0;

    @ObfuscatedName("dy.t")
    public int field1647 = 0;

    @ObfuscatedName("dy.b")
    public long field1637 = 0L;

    @ObfuscatedName("dy.s")
    public boolean field1649 = true;

    @ObfuscatedName("dy.ar")
    public int field1651 = 0;

    @ObfuscatedName("dy.aq")
    public class120[] field1652 = new class120[8];

    @ObfuscatedName("dy.ag")
    public class120[] field1653 = new class120[8];

    @ObfuscatedName("ab.ap(Lew;III)Ldy;")
    public static final class110 method582(class156 arg0, int arg1, int arg2) {
        if (Statics.field3411 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field2599.method657();
                var3.field1646 = new int[256 * (Statics.field1638 ? 2 : 1)];
                var3.field1642 = arg2;
                var3.method681();
                var3.field1641 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1641 > 16384) {
                    var3.field1641 = 16384;
                }
                var3.method677(var3.field1641);
                if (Statics.field381 > 0 && Statics.field13 == null) {
                    Statics.field13 = new class112();
                    Statics.field1636 = Executors.newScheduledThreadPool(1);
                    Statics.field1636.scheduleAtFixedRate(Statics.field13, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field13 != null) {
                    if (Statics.field13.field1668[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field13.field1668[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dy.ac(Ldj;B)V")
    public final synchronized void method1832(class120 arg0) {
        this.field1635 = arg0;
    }

    @ObfuscatedName("dy.af(I)V")
    public final synchronized void method1818() {
        if (this.field1646 == null) {
            return;
        }
        long var1 = class179.method1665();
        try {
            if (this.field1644 != 0L) {
                if (var1 < this.field1644) {
                    return;
                }
                this.method677(this.field1641);
                this.field1644 = 0L;
                this.field1649 = true;
            }
            int var3 = this.method678();
            if (this.field1647 - var3 > this.field1645) {
                this.field1645 = this.field1647 - var3;
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
                this.method680();
                this.method677(this.field1641);
                var3 = 0;
                this.field1649 = true;
                if (var4 + 256 > this.field1641) {
                    var4 = this.field1641 - 256;
                    this.field1643 = var4 - this.field1642;
                }
            }
            while (var3 < var4) {
                this.method1823(this.field1646, 256);
                this.method687();
                var3 += 256;
            }
            if (var1 > this.field1637) {
                if (this.field1649) {
                    this.field1649 = false;
                } else if (this.field1645 == 0 && this.field1648 == 0) {
                    this.method680();
                    this.field1644 = var1 + 2000L;
                    return;
                } else {
                    this.field1643 = Math.min(this.field1648, this.field1645);
                    this.field1648 = this.field1645;
                }
                this.field1645 = 0;
                this.field1637 = var1 + 2000L;
            }
            this.field1647 = var3;
        } catch (Exception var8) {
            this.method680();
            this.field1644 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1640 + 500000L) {
                var1 = this.field1640;
            }
            while (var1 > this.field1640 + 5000L) {
                this.method1822(256);
                this.field1640 += (long) (256000 / Statics.field3411);
            }
        } catch (Exception var7) {
            this.field1640 = var1;
        }
    }

    @ObfuscatedName("dy.ai(I)V")
    public final void method1848() {
        this.field1649 = true;
    }

    @ObfuscatedName("dy.ad(B)V")
    public final synchronized void method1825() {
        this.field1649 = true;
        try {
            this.method683();
        } catch (Exception var2) {
            this.method680();
            this.field1644 = class179.method1665() + 2000L;
        }
    }

    @ObfuscatedName("dy.ar(B)V")
    public final synchronized void method1821() {
        if (Statics.field13 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field13.field1668[var2] == this) {
                    Statics.field13.field1668[var2] = null;
                }
                if (Statics.field13.field1668[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1636.shutdownNow();
                Statics.field1636 = null;
                Statics.field13 = null;
            }
        }
        this.method680();
        this.field1646 = null;
    }

    @ObfuscatedName("dy.aq(II)V")
    public final void method1822(int arg0) {
        this.field1651 -= arg0;
        if (this.field1651 < 0) {
            this.field1651 = 0;
        }
        if (this.field1635 != null) {
            this.field1635.method1696(arg0);
        }
    }

    @ObfuscatedName("dy.ag([II)V")
    public final void method1823(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1638) {
            var3 = arg1 << 1;
        }
        class187.method3170(arg0, 0, var3);
        this.field1651 -= arg1;
        if (this.field1635 != null && this.field1651 <= 0) {
            this.field1651 += Statics.field3411 >> 4;
            method1592(this.field1635);
            this.method1824(this.field1635, this.field1635.method2036());
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
                        class120 var11 = this.field1652[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1722;
                                if (var12 == null || var12.field1754 <= var8) {
                                    var11.field1723 = true;
                                    int var13 = var11.method1693();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1754 += var13;
                                    }
                                    if (var4 >= this.field1639) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1691();
                                    if (var14 != null) {
                                        int var15 = var11.field1720;
                                        while (var14 != null) {
                                            this.method1824(var14, var15 * var14.method2036() >> 8);
                                            var14 = var11.method1716();
                                        }
                                    }
                                    class120 var16 = var11.field1721;
                                    var11.field1721 = null;
                                    if (var10 == null) {
                                        this.field1652[var7] = var16;
                                    } else {
                                        var10.field1721 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1653[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1721;
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
                class120 var18 = this.field1652[var17];
                class120[] var19 = this.field1652;
                this.field1653[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1721;
                    var18.field1721 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1651 < 0) {
            this.field1651 = 0;
        }
        if (this.field1635 != null) {
            this.field1635.method1726(arg0, 0, arg1);
        }
        this.field1640 = class179.method1665();
    }

    @ObfuscatedName("cw.ak(Ldj;I)V")
    public static final void method1592(class120 arg0) {
        arg0.field1723 = false;
        if (arg0.field1722 != null) {
            arg0.field1722.field1754 = 0;
        }
        for (class120 var1 = arg0.method1691(); var1 != null; var1 = arg0.method1716()) {
            method1592(var1);
        }
    }

    @ObfuscatedName("dy.ae(Ldj;IS)V")
    public final void method1824(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1653[var3];
        if (var4 == null) {
            this.field1652[var3] = arg0;
        } else {
            var4.field1721 = arg0;
        }
        this.field1653[var3] = arg0;
        arg0.field1720 = arg1;
    }

    @ObfuscatedName("dy.w(I)V")
    public void method681() throws Exception {
    }

    @ObfuscatedName("dy.o(IB)V")
    public void method677(int arg0) throws Exception {
    }

    @ObfuscatedName("dy.x(I)I")
    public int method678() throws Exception {
        return this.field1641;
    }

    @ObfuscatedName("dy.k()V")
    public void method687() throws Exception {
    }

    @ObfuscatedName("dy.f(B)V")
    public void method680() {
    }

    @ObfuscatedName("dy.i(I)V")
    public void method683() throws Exception {
    }
}
