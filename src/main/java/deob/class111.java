package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dc")
public class class111 {

    @ObfuscatedName("dc.s")
    public int[] field1635;

    @ObfuscatedName("dc.r")
    public class121 field1636;

    @ObfuscatedName("dc.e")
    public int field1637 = 32;

    @ObfuscatedName("dc.a")
    public long field1638 = class177.method1067();

    @ObfuscatedName("dc.v")
    public int field1639;

    @ObfuscatedName("dc.t")
    public int field1634;

    @ObfuscatedName("dc.y")
    public int field1632;

    @ObfuscatedName("dc.z")
    public long field1642 = 0L;

    @ObfuscatedName("dc.u")
    public int field1643 = 0;

    @ObfuscatedName("dc.k")
    public int field1644 = 0;

    @ObfuscatedName("dc.q")
    public int field1645 = 0;

    @ObfuscatedName("dc.n")
    public long field1646 = 0L;

    @ObfuscatedName("dc.d")
    public boolean field1647 = true;

    @ObfuscatedName("dc.av")
    public int field1640 = 0;

    @ObfuscatedName("dc.ab")
    public class121[] field1641 = new class121[8];

    @ObfuscatedName("dc.aj")
    public class121[] field1650 = new class121[8];

    @ObfuscatedName("jy.ax(Ldl;B)V")
    public static final void method4399(class105 arg0) {
        Statics.field3888 = arg0;
    }

    @ObfuscatedName("am.ao(IZII)V")
    public static final void method553(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1652 = arg0;
        Statics.field2004 = arg1;
        Statics.field1633 = arg2;
    }

    @ObfuscatedName("ay.an(Lep;III)Ldc;")
    public static final class111 method697(class156 arg0, int arg1, int arg2) {
        if (Statics.field1652 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class111 var3 = Statics.field3888.method698();
                var3.field1635 = new int[256 * (Statics.field2004 ? 2 : 1)];
                var3.field1634 = arg2;
                var3.method725();
                var3.field1639 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1639 > 16384) {
                    var3.field1639 = 16384;
                }
                var3.method726(var3.field1639);
                if (Statics.field1633 > 0 && Statics.field832 == null) {
                    Statics.field832 = new class113();
                    Statics.field843 = Executors.newScheduledThreadPool(1);
                    Statics.field843.scheduleAtFixedRate(Statics.field832, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field832 != null) {
                    if (Statics.field832.field1668[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field832.field1668[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class111();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.ar(Lda;I)V")
    public final synchronized void method1869(class121 arg0) {
        this.field1636 = arg0;
    }

    @ObfuscatedName("dc.ag(I)V")
    public final synchronized void method1870() {
        if (this.field1635 == null) {
            return;
        }
        long var1 = class177.method1067();
        try {
            if (this.field1642 != 0L) {
                if (var1 < this.field1642) {
                    return;
                }
                this.method726(this.field1639);
                this.field1642 = 0L;
                this.field1647 = true;
            }
            int var3 = this.method727();
            if (this.field1645 - var3 > this.field1643) {
                this.field1643 = this.field1645 - var3;
            }
            int var4 = this.field1634 + this.field1632;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1639) {
                this.field1639 += 1024;
                if (this.field1639 > 16384) {
                    this.field1639 = 16384;
                }
                this.method724();
                this.method726(this.field1639);
                var3 = 0;
                this.field1647 = true;
                if (var4 + 256 > this.field1639) {
                    var4 = this.field1639 - 256;
                    this.field1632 = var4 - this.field1634;
                }
            }
            while (var3 < var4) {
                this.method1906(this.field1635, 256);
                this.method728();
                var3 += 256;
            }
            if (var1 > this.field1646) {
                if (this.field1647) {
                    this.field1647 = false;
                } else if (this.field1643 == 0 && this.field1644 == 0) {
                    this.method724();
                    this.field1642 = var1 + 2000L;
                    return;
                } else {
                    this.field1632 = Math.min(this.field1644, this.field1643);
                    this.field1644 = this.field1643;
                }
                this.field1643 = 0;
                this.field1646 = var1 + 2000L;
            }
            this.field1645 = var3;
        } catch (Exception var8) {
            this.method724();
            this.field1642 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1638 + 500000L) {
                var1 = this.field1638;
            }
            while (var1 > this.field1638 + 5000L) {
                this.method1899(256);
                this.field1638 += (long) (256000 / Statics.field1652);
            }
        } catch (Exception var7) {
            this.field1638 = var1;
        }
    }

    @ObfuscatedName("dc.av(B)V")
    public final void method1871() {
        this.field1647 = true;
    }

    @ObfuscatedName("dc.ab(I)V")
    public final synchronized void method1872() {
        this.field1647 = true;
        try {
            this.method741();
        } catch (Exception var2) {
            this.method724();
            this.field1642 = class177.method1067() + 2000L;
        }
    }

    @ObfuscatedName("dc.aj(I)V")
    public final synchronized void method1873() {
        if (Statics.field832 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field832.field1668[var2] == this) {
                    Statics.field832.field1668[var2] = null;
                }
                if (Statics.field832.field1668[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field843.shutdownNow();
                Statics.field843 = null;
                Statics.field832 = null;
            }
        }
        this.method724();
        this.field1635 = null;
    }

    @ObfuscatedName("dc.ae(II)V")
    public final void method1899(int arg0) {
        this.field1640 -= arg0;
        if (this.field1640 < 0) {
            this.field1640 = 0;
        }
        if (this.field1636 != null) {
            this.field1636.method1747(arg0);
        }
    }

    @ObfuscatedName("dc.at([II)V")
    public final void method1906(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2004) {
            var3 = arg1 << 1;
        }
        class185.method3187(arg0, 0, var3);
        this.field1640 -= arg1;
        if (this.field1636 != null && this.field1640 <= 0) {
            this.field1640 += Statics.field1652 >> 4;
            method1704(this.field1636);
            this.method1875(this.field1636, this.field1636.method2084());
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
                        class121 var10 = null;
                        class121 var11 = this.field1641[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class124 var12 = var11.field1730;
                                if (var12 == null || var12.field1761 <= var8) {
                                    var11.field1728 = true;
                                    int var13 = var11.method1744();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1761 += var13;
                                    }
                                    if (var4 >= this.field1637) {
                                        break label105;
                                    }
                                    class121 var14 = var11.method1742();
                                    if (var14 != null) {
                                        int var15 = var11.field1727;
                                        while (var14 != null) {
                                            this.method1875(var14, var15 * var14.method2084() >> 8);
                                            var14 = var11.method1743();
                                        }
                                    }
                                    class121 var16 = var11.field1729;
                                    var11.field1729 = null;
                                    if (var10 == null) {
                                        this.field1641[var7] = var16;
                                    } else {
                                        var10.field1729 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1650[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1729;
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
                class121 var18 = this.field1641[var17];
                class121[] var19 = this.field1641;
                this.field1650[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class121 var21 = var18.field1729;
                    var18.field1729 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1640 < 0) {
            this.field1640 = 0;
        }
        if (this.field1636 != null) {
            this.field1636.method1745(arg0, 0, arg1);
        }
        this.field1638 = class177.method1067();
    }

    @ObfuscatedName("cl.as(Lda;I)V")
    public static final void method1704(class121 arg0) {
        arg0.field1728 = false;
        if (arg0.field1730 != null) {
            arg0.field1730.field1761 = 0;
        }
        for (class121 var1 = arg0.method1742(); var1 != null; var1 = arg0.method1743()) {
            method1704(var1);
        }
    }

    @ObfuscatedName("dc.af(Lda;II)V")
    public final void method1875(class121 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class121 var4 = this.field1650[var3];
        if (var4 == null) {
            this.field1641[var3] = arg0;
        } else {
            var4.field1729 = arg0;
        }
        this.field1650[var3] = arg0;
        arg0.field1727 = arg1;
    }

    @ObfuscatedName("dc.j(B)V")
    public void method725() throws Exception {
    }

    @ObfuscatedName("dc.h(II)V")
    public void method726(int arg0) throws Exception {
    }

    @ObfuscatedName("dc.f(I)I")
    public int method727() throws Exception {
        return this.field1639;
    }

    @ObfuscatedName("dc.p()V")
    public void method728() throws Exception {
    }

    @ObfuscatedName("dc.x(I)V")
    public void method724() {
    }

    @ObfuscatedName("dc.g(I)V")
    public void method741() throws Exception {
    }
}
