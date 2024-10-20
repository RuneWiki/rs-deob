package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("df")
public class class108 {

    @ObfuscatedName("df.n")
    public int[] field1566;

    @ObfuscatedName("df.l")
    public class118 field1587;

    @ObfuscatedName("df.s")
    public int field1568 = 32;

    @ObfuscatedName("df.v")
    public long field1569 = class197.method1005();

    @ObfuscatedName("df.q")
    public int field1563;

    @ObfuscatedName("df.r")
    public int field1571;

    @ObfuscatedName("df.j")
    public int field1562;

    @ObfuscatedName("df.b")
    public long field1573 = 0L;

    @ObfuscatedName("df.g")
    public int field1574 = 0;

    @ObfuscatedName("df.f")
    public int field1570 = 0;

    @ObfuscatedName("df.p")
    public int field1575 = 0;

    @ObfuscatedName("df.e")
    public long field1577 = 0L;

    @ObfuscatedName("df.c")
    public boolean field1578 = true;

    @ObfuscatedName("df.al")
    public int field1580 = 0;

    @ObfuscatedName("df.ah")
    public class118[] field1581 = new class118[8];

    @ObfuscatedName("df.af")
    public class118[] field1572 = new class118[8];

    @ObfuscatedName("bd.at(IZIB)V")
    public static final void method1532(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1582 = arg0;
        Statics.field1567 = arg1;
        Statics.field3539 = arg2;
    }

    @ObfuscatedName("kb.ac(Lfe;III)Ldf;")
    public static final class108 method4851(class167 arg0, int arg1, int arg2) {
        if (Statics.field1582 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field1565.method700();
                var3.field1566 = new int[(Statics.field1567 ? 2 : 1) * 256];
                var3.field1571 = arg2;
                var3.method726();
                var3.field1563 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1563 > 16384) {
                    var3.field1563 = 16384;
                }
                var3.method733(var3.field1563);
                if (Statics.field3539 > 0 && Statics.field793 == null) {
                    Statics.field793 = new class110();
                    Statics.field3926 = Executors.newScheduledThreadPool(1);
                    Statics.field3926.scheduleAtFixedRate(Statics.field793, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field793 != null) {
                    if (Statics.field793.field1599[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field793.field1599[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.al(Ldd;I)V")
    public final synchronized void method2031(class118 arg0) {
        this.field1587 = arg0;
    }

    @ObfuscatedName("df.ah(I)V")
    public final synchronized void method2024() {
        if (this.field1566 == null) {
            return;
        }
        long var1 = class197.method1005();
        try {
            if (this.field1573 != 0L) {
                if (var1 < this.field1573) {
                    return;
                }
                this.method733(this.field1563);
                this.field1573 = 0L;
                this.field1578 = true;
            }
            int var3 = this.method728();
            if (this.field1575 - var3 > this.field1574) {
                this.field1574 = this.field1575 - var3;
            }
            int var4 = this.field1571 + this.field1562;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1563) {
                this.field1563 += 1024;
                if (this.field1563 > 16384) {
                    this.field1563 = 16384;
                }
                this.method730();
                this.method733(this.field1563);
                var3 = 0;
                this.field1578 = true;
                if (var4 + 256 > this.field1563) {
                    var4 = this.field1563 - 256;
                    this.field1562 = var4 - this.field1571;
                }
            }
            while (var3 < var4) {
                this.method2036(this.field1566, 256);
                this.method729();
                var3 += 256;
            }
            if (var1 > this.field1577) {
                if (this.field1578) {
                    this.field1578 = false;
                } else if (this.field1574 == 0 && this.field1570 == 0) {
                    this.method730();
                    this.field1573 = var1 + 2000L;
                    return;
                } else {
                    this.field1562 = Math.min(this.field1570, this.field1574);
                    this.field1570 = this.field1574;
                }
                this.field1574 = 0;
                this.field1577 = var1 + 2000L;
            }
            this.field1575 = var3;
        } catch (Exception var8) {
            this.method730();
            this.field1573 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1569 + 500000L) {
                var1 = this.field1569;
            }
            while (var1 > this.field1569 + 5000L) {
                this.method2027(256);
                this.field1569 += (long) (256000 / Statics.field1582);
            }
        } catch (Exception var7) {
            this.field1569 = var1;
        }
    }

    @ObfuscatedName("df.af(B)V")
    public final void method2033() {
        this.field1578 = true;
    }

    @ObfuscatedName("df.aq(I)V")
    public final synchronized void method2025() {
        this.field1578 = true;
        try {
            this.method731();
        } catch (Exception var2) {
            this.method730();
            this.field1573 = class197.method1005() + 2000L;
        }
    }

    @ObfuscatedName("df.ai(I)V")
    public final synchronized void method2029() {
        if (Statics.field793 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field793.field1599[var2] == this) {
                    Statics.field793.field1599[var2] = null;
                }
                if (Statics.field793.field1599[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3926.shutdownNow();
                Statics.field3926 = null;
                Statics.field793 = null;
            }
        }
        this.method730();
        this.field1566 = null;
    }

    @ObfuscatedName("df.az(IB)V")
    public final void method2027(int arg0) {
        this.field1580 -= arg0;
        if (this.field1580 < 0) {
            this.field1580 = 0;
        }
        if (this.field1587 != null) {
            this.field1587.method1899(arg0);
        }
    }

    @ObfuscatedName("df.aa([II)V")
    public final void method2036(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1567) {
            var3 = arg1 << 1;
        }
        class206.method3529(arg0, 0, var3);
        this.field1580 -= arg1;
        if (this.field1587 != null && this.field1580 <= 0) {
            this.field1580 += Statics.field1582 >> 4;
            method724(this.field1587);
            this.method2046(this.field1587, this.field1587.method2164());
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
                        class118 var11 = this.field1581[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1658;
                                if (var12 == null || var12.field1692 <= var8) {
                                    var11.field1661 = true;
                                    int var13 = var11.method1927();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1692 += var13;
                                    }
                                    if (var4 >= this.field1568) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method1894();
                                    if (var14 != null) {
                                        int var15 = var11.field1660;
                                        while (var14 != null) {
                                            this.method2046(var14, var15 * var14.method2164() >> 8);
                                            var14 = var11.method1913();
                                        }
                                    }
                                    class118 var16 = var11.field1659;
                                    var11.field1659 = null;
                                    if (var10 == null) {
                                        this.field1581[var7] = var16;
                                    } else {
                                        var10.field1659 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1572[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1659;
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
                class118 var18 = this.field1581[var17];
                class118[] var19 = this.field1581;
                this.field1572[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1659;
                    var18.field1659 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1580 < 0) {
            this.field1580 = 0;
        }
        if (this.field1587 != null) {
            this.field1587.method1897(arg0, 0, arg1);
        }
        this.field1569 = class197.method1005();
    }

    @ObfuscatedName("bf.av(Ldd;I)V")
    public static final void method724(class118 arg0) {
        arg0.field1661 = false;
        if (arg0.field1658 != null) {
            arg0.field1658.field1692 = 0;
        }
        for (class118 var1 = arg0.method1894(); var1 != null; var1 = arg0.method1913()) {
            method724(var1);
        }
    }

    @ObfuscatedName("df.am(Ldd;II)V")
    public final void method2046(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1572[var3];
        if (var4 == null) {
            this.field1581[var3] = arg0;
        } else {
            var4.field1659 = arg0;
        }
        this.field1572[var3] = arg0;
        arg0.field1660 = arg1;
    }

    @ObfuscatedName("df.o(I)V")
    public void method726() throws Exception {
    }

    @ObfuscatedName("df.k(II)V")
    public void method733(int arg0) throws Exception {
    }

    @ObfuscatedName("df.t(I)I")
    public int method728() throws Exception {
        return this.field1563;
    }

    @ObfuscatedName("df.d()V")
    public void method729() throws Exception {
    }

    @ObfuscatedName("df.h(I)V")
    public void method730() {
    }

    @ObfuscatedName("df.m(B)V")
    public void method731() throws Exception {
    }
}
