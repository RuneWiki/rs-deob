package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("di")
public class class110 {

    @ObfuscatedName("di.h")
    public int[] field1610;

    @ObfuscatedName("di.t")
    public class120 field1603;

    @ObfuscatedName("di.a")
    public int field1598 = 32;

    @ObfuscatedName("di.e")
    public long field1604 = class176.method2679();

    @ObfuscatedName("di.y")
    public int field1599;

    @ObfuscatedName("di.l")
    public int field1600;

    @ObfuscatedName("di.q")
    public int field1602;

    @ObfuscatedName("di.f")
    public long field1593 = 0L;

    @ObfuscatedName("di.j")
    public int field1608 = 0;

    @ObfuscatedName("di.n")
    public int field1605 = 0;

    @ObfuscatedName("di.z")
    public int field1606 = 0;

    @ObfuscatedName("di.b")
    public long field1607 = 0L;

    @ObfuscatedName("di.d")
    public boolean field1596 = true;

    @ObfuscatedName("di.al")
    public int field1601 = 0;

    @ObfuscatedName("di.ab")
    public class120[] field1611 = new class120[8];

    @ObfuscatedName("di.af")
    public class120[] field1597 = new class120[8];

    @ObfuscatedName("bq.am(Lcx;I)V")
    public static final void method964(class104 arg0) {
        Statics.field333 = arg0;
    }

    @ObfuscatedName("cg.ag(Lew;III)Ldi;")
    public static final class110 method1573(class155 arg0, int arg1, int arg2) {
        if (Statics.field1276 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field333.method649();
                var3.field1610 = new int[(Statics.field234 ? 2 : 1) * 256];
                var3.field1600 = arg2;
                var3.method675();
                var3.field1599 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1599 > 16384) {
                    var3.field1599 = 16384;
                }
                var3.method665(var3.field1599);
                if (Statics.field3608 > 0 && Statics.field3289 == null) {
                    Statics.field3289 = new class112();
                    Statics.field1594 = Executors.newScheduledThreadPool(1);
                    Statics.field1594.scheduleAtFixedRate(Statics.field3289, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3289 != null) {
                    if (Statics.field3289.field1625[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3289.field1625[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.av(Ldk;B)V")
    public final synchronized void method1801(class120 arg0) {
        this.field1603 = arg0;
    }

    @ObfuscatedName("di.al(B)V")
    public final synchronized void method1802() {
        if (this.field1610 == null) {
            return;
        }
        long var1 = class176.method2679();
        try {
            if (this.field1593 != 0L) {
                if (var1 < this.field1593) {
                    return;
                }
                this.method665(this.field1599);
                this.field1593 = 0L;
                this.field1596 = true;
            }
            int var3 = this.method664();
            if (this.field1606 - var3 > this.field1608) {
                this.field1608 = this.field1606 - var3;
            }
            int var4 = this.field1602 + this.field1600;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1599) {
                this.field1599 += 1024;
                if (this.field1599 > 16384) {
                    this.field1599 = 16384;
                }
                this.method667();
                this.method665(this.field1599);
                var3 = 0;
                this.field1596 = true;
                if (var4 + 256 > this.field1599) {
                    var4 = this.field1599 - 256;
                    this.field1602 = var4 - this.field1600;
                }
            }
            while (var3 < var4) {
                this.method1805(this.field1610, 256);
                this.method677();
                var3 += 256;
            }
            if (var1 > this.field1607) {
                if (this.field1596) {
                    this.field1596 = false;
                } else if (this.field1608 == 0 && this.field1605 == 0) {
                    this.method667();
                    this.field1593 = var1 + 2000L;
                    return;
                } else {
                    this.field1602 = Math.min(this.field1605, this.field1608);
                    this.field1605 = this.field1608;
                }
                this.field1608 = 0;
                this.field1607 = var1 + 2000L;
            }
            this.field1606 = var3;
        } catch (Exception var8) {
            this.method667();
            this.field1593 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1604 + 500000L) {
                var1 = this.field1604;
            }
            while (var1 > this.field1604 + 5000L) {
                this.method1804(256);
                this.field1604 += (long) (256000 / Statics.field1276);
            }
        } catch (Exception var7) {
            this.field1604 = var1;
        }
    }

    @ObfuscatedName("di.ab(I)V")
    public final void method1818() {
        this.field1596 = true;
    }

    @ObfuscatedName("di.af(I)V")
    public final synchronized void method1813() {
        this.field1596 = true;
        try {
            this.method672();
        } catch (Exception var2) {
            this.method667();
            this.field1593 = class176.method2679() + 2000L;
        }
    }

    @ObfuscatedName("di.ak(I)V")
    public final synchronized void method1803() {
        if (Statics.field3289 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3289.field1625[var2] == this) {
                    Statics.field3289.field1625[var2] = null;
                }
                if (Statics.field3289.field1625[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1594.shutdownNow();
                Statics.field1594 = null;
                Statics.field3289 = null;
            }
        }
        this.method667();
        this.field1610 = null;
    }

    @ObfuscatedName("di.ar(II)V")
    public final void method1804(int arg0) {
        this.field1601 -= arg0;
        if (this.field1601 < 0) {
            this.field1601 = 0;
        }
        if (this.field1603 != null) {
            this.field1603.method1683(arg0);
        }
    }

    @ObfuscatedName("di.an([II)V")
    public final void method1805(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field234) {
            var3 = arg1 << 1;
        }
        class184.method3150(arg0, 0, var3);
        this.field1601 -= arg1;
        if (this.field1603 != null && this.field1601 <= 0) {
            this.field1601 += Statics.field1276 >> 4;
            method1655(this.field1603);
            this.method1809(this.field1603, this.field1603.method1924());
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
                        class120 var11 = this.field1611[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1683;
                                if (var12 == null || var12.field1715 <= var8) {
                                    var11.field1682 = true;
                                    int var13 = var11.method1694();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1715 += var13;
                                    }
                                    if (var4 >= this.field1598) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1678();
                                    if (var14 != null) {
                                        int var15 = var11.field1681;
                                        while (var14 != null) {
                                            this.method1809(var14, var15 * var14.method1924() >> 8);
                                            var14 = var11.method1679();
                                        }
                                    }
                                    class120 var16 = var11.field1684;
                                    var11.field1684 = null;
                                    if (var10 == null) {
                                        this.field1611[var7] = var16;
                                    } else {
                                        var10.field1684 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1597[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1684;
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
                class120 var18 = this.field1611[var17];
                class120[] var19 = this.field1611;
                this.field1597[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1684;
                    var18.field1684 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1601 < 0) {
            this.field1601 = 0;
        }
        if (this.field1603 != null) {
            this.field1603.method1681(arg0, 0, arg1);
        }
        this.field1604 = class176.method2679();
    }

    @ObfuscatedName("ce.at(Ldk;I)V")
    public static final void method1655(class120 arg0) {
        arg0.field1682 = false;
        if (arg0.field1683 != null) {
            arg0.field1683.field1715 = 0;
        }
        for (class120 var1 = arg0.method1678(); var1 != null; var1 = arg0.method1679()) {
            method1655(var1);
        }
    }

    @ObfuscatedName("di.aw(Ldk;II)V")
    public final void method1809(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1597[var3];
        if (var4 == null) {
            this.field1611[var3] = arg0;
        } else {
            var4.field1684 = arg0;
        }
        this.field1597[var3] = arg0;
        arg0.field1681 = arg1;
    }

    @ObfuscatedName("di.c(I)V")
    public void method675() throws Exception {
    }

    @ObfuscatedName("di.o(IB)V")
    public void method665(int arg0) throws Exception {
    }

    @ObfuscatedName("di.i(I)I")
    public int method664() throws Exception {
        return this.field1599;
    }

    @ObfuscatedName("di.u()V")
    public void method677() throws Exception {
    }

    @ObfuscatedName("di.g(I)V")
    public void method667() {
    }

    @ObfuscatedName("di.m(B)V")
    public void method672() throws Exception {
    }
}
