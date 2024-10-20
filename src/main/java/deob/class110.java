package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ds")
public class class110 {

    @ObfuscatedName("ds.x")
    public int[] field1626;

    @ObfuscatedName("ds.o")
    public class120 field1621;

    @ObfuscatedName("ds.j")
    public int field1622 = 32;

    @ObfuscatedName("ds.m")
    public long field1623 = class176.method3821();

    @ObfuscatedName("ds.d")
    public int field1624;

    @ObfuscatedName("ds.e")
    public int field1625;

    @ObfuscatedName("ds.s")
    public int field1639;

    @ObfuscatedName("ds.n")
    public long field1636 = 0L;

    @ObfuscatedName("ds.y")
    public int field1628 = 0;

    @ObfuscatedName("ds.w")
    public int field1619 = 0;

    @ObfuscatedName("ds.f")
    public int field1630 = 0;

    @ObfuscatedName("ds.c")
    public long field1631 = 0L;

    @ObfuscatedName("ds.z")
    public boolean field1627 = true;

    @ObfuscatedName("ds.af")
    public int field1634 = 0;

    @ObfuscatedName("ds.aj")
    public class120[] field1635 = new class120[8];

    @ObfuscatedName("ds.ax")
    public class120[] field1632 = new class120[8];

    @ObfuscatedName("q.ay(Lcq;I)V")
    public static final void method4(class104 arg0) {
        Statics.field2277 = arg0;
    }

    @ObfuscatedName("cj.ah(Lev;IIB)Lds;")
    public static final class110 method1648(class155 arg0, int arg1, int arg2) {
        if (Statics.field1629 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field2277.method679();
                var3.field1626 = new int[(Statics.field2316 ? 2 : 1) * 256];
                var3.field1625 = arg2;
                var3.method712();
                var3.field1624 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1624 > 16384) {
                    var3.field1624 = 16384;
                }
                var3.method702(var3.field1624);
                if (Statics.field3306 > 0 && Statics.field1309 == null) {
                    Statics.field1309 = new class112();
                    Statics.field738 = Executors.newScheduledThreadPool(1);
                    Statics.field738.scheduleAtFixedRate(Statics.field1309, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1309 != null) {
                    if (Statics.field1309.field1652[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1309.field1652[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ds.az(Ldw;I)V")
    public final synchronized void method1894(class120 arg0) {
        this.field1621 = arg0;
    }

    @ObfuscatedName("ds.ac(I)V")
    public final synchronized void method1888() {
        if (this.field1626 == null) {
            return;
        }
        long var1 = class176.method3821();
        try {
            if (this.field1636 != 0L) {
                if (var1 < this.field1636) {
                    return;
                }
                this.method702(this.field1624);
                this.field1636 = 0L;
                this.field1627 = true;
            }
            int var3 = this.method703();
            if (this.field1630 - var3 > this.field1628) {
                this.field1628 = this.field1630 - var3;
            }
            int var4 = this.field1639 + this.field1625;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1624) {
                this.field1624 += 1024;
                if (this.field1624 > 16384) {
                    this.field1624 = 16384;
                }
                this.method705();
                this.method702(this.field1624);
                var3 = 0;
                this.field1627 = true;
                if (var4 + 256 > this.field1624) {
                    var4 = this.field1624 - 256;
                    this.field1639 = var4 - this.field1625;
                }
            }
            while (var3 < var4) {
                this.method1891(this.field1626, 256);
                this.method708();
                var3 += 256;
            }
            if (var1 > this.field1631) {
                if (this.field1627) {
                    this.field1627 = false;
                } else if (this.field1628 == 0 && this.field1619 == 0) {
                    this.method705();
                    this.field1636 = var1 + 2000L;
                    return;
                } else {
                    this.field1639 = Math.min(this.field1619, this.field1628);
                    this.field1619 = this.field1628;
                }
                this.field1628 = 0;
                this.field1631 = var1 + 2000L;
            }
            this.field1630 = var3;
        } catch (Exception var8) {
            this.method705();
            this.field1636 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1623 + 500000L) {
                var1 = this.field1623;
            }
            while (var1 > this.field1623 + 5000L) {
                this.method1892(256);
                this.field1623 += (long) (256000 / Statics.field1629);
            }
        } catch (Exception var7) {
            this.field1623 = var1;
        }
    }

    @ObfuscatedName("ds.aq(I)V")
    public final void method1889() {
        this.field1627 = true;
    }

    @ObfuscatedName("ds.af(I)V")
    public final synchronized void method1913() {
        this.field1627 = true;
        try {
            this.method706();
        } catch (Exception var2) {
            this.method705();
            this.field1636 = class176.method3821() + 2000L;
        }
    }

    @ObfuscatedName("ds.aj(I)V")
    public final synchronized void method1890() {
        if (Statics.field1309 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1309.field1652[var2] == this) {
                    Statics.field1309.field1652[var2] = null;
                }
                if (Statics.field1309.field1652[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field738.shutdownNow();
                Statics.field738 = null;
                Statics.field1309 = null;
            }
        }
        this.method705();
        this.field1626 = null;
    }

    @ObfuscatedName("ds.ax(II)V")
    public final void method1892(int arg0) {
        this.field1634 -= arg0;
        if (this.field1634 < 0) {
            this.field1634 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1757(arg0);
        }
    }

    @ObfuscatedName("ds.ad([II)V")
    public final void method1891(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2316) {
            var3 = arg1 << 1;
        }
        class184.method3234(arg0, 0, var3);
        this.field1634 -= arg1;
        if (this.field1621 != null && this.field1634 <= 0) {
            this.field1634 += Statics.field1629 >> 4;
            method1704(this.field1621);
            this.method1897(this.field1621, this.field1621.method1975());
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
                        class120 var11 = this.field1635[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1706;
                                if (var12 == null || var12.field1738 <= var8) {
                                    var11.field1704 = true;
                                    int var13 = var11.method1761();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1738 += var13;
                                    }
                                    if (var4 >= this.field1622) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1784();
                                    if (var14 != null) {
                                        int var15 = var11.field1705;
                                        while (var14 != null) {
                                            this.method1897(var14, var15 * var14.method1975() >> 8);
                                            var14 = var11.method1760();
                                        }
                                    }
                                    class120 var16 = var11.field1707;
                                    var11.field1707 = null;
                                    if (var10 == null) {
                                        this.field1635[var7] = var16;
                                    } else {
                                        var10.field1707 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1632[var7] = var10;
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
                class120 var18 = this.field1635[var17];
                class120[] var19 = this.field1635;
                this.field1632[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1707;
                    var18.field1707 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1634 < 0) {
            this.field1634 = 0;
        }
        if (this.field1621 != null) {
            this.field1621.method1762(arg0, 0, arg1);
        }
        this.field1623 = class176.method3821();
    }

    @ObfuscatedName("ci.av(Ldw;S)V")
    public static final void method1704(class120 arg0) {
        arg0.field1704 = false;
        if (arg0.field1706 != null) {
            arg0.field1706.field1738 = 0;
        }
        for (class120 var1 = arg0.method1784(); var1 != null; var1 = arg0.method1760()) {
            method1704(var1);
        }
    }

    @ObfuscatedName("ds.ae(Ldw;IB)V")
    public final void method1897(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1632[var3];
        if (var4 == null) {
            this.field1635[var3] = arg0;
        } else {
            var4.field1707 = arg0;
        }
        this.field1632[var3] = arg0;
        arg0.field1705 = arg1;
    }

    @ObfuscatedName("ds.i(I)V")
    public void method712() throws Exception {
    }

    @ObfuscatedName("ds.h(II)V")
    public void method702(int arg0) throws Exception {
    }

    @ObfuscatedName("ds.u(B)I")
    public int method703() throws Exception {
        return this.field1624;
    }

    @ObfuscatedName("ds.q()V")
    public void method708() throws Exception {
    }

    @ObfuscatedName("ds.g(I)V")
    public void method705() {
    }

    @ObfuscatedName("ds.v(I)V")
    public void method706() throws Exception {
    }
}
