package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("di")
public class class109 {

    @ObfuscatedName("di.w")
    public int[] field1552;

    @ObfuscatedName("di.k")
    public class119 field1553;

    @ObfuscatedName("di.t")
    public int field1548 = 32;

    @ObfuscatedName("di.h")
    public long field1555 = class183.method4541();

    @ObfuscatedName("di.u")
    public int field1556;

    @ObfuscatedName("di.r")
    public int field1545;

    @ObfuscatedName("di.g")
    public int field1566;

    @ObfuscatedName("di.z")
    public long field1559 = 0L;

    @ObfuscatedName("di.o")
    public int field1560 = 0;

    @ObfuscatedName("di.d")
    public int field1567 = 0;

    @ObfuscatedName("di.s")
    public int field1562 = 0;

    @ObfuscatedName("di.f")
    public long field1563 = 0L;

    @ObfuscatedName("di.q")
    public boolean field1551 = true;

    @ObfuscatedName("di.ag")
    public int field1565 = 0;

    @ObfuscatedName("di.ap")
    public class119[] field1557 = new class119[8];

    @ObfuscatedName("di.av")
    public class119[] field1550 = new class119[8];

    @ObfuscatedName("t.o(IZII)V")
    public static final void method99(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1554 = arg0;
        Statics.field1546 = arg1;
        Statics.field1561 = arg2;
    }

    @ObfuscatedName("ej.q(Ler;IIB)Ldi;")
    public static final class109 method2548(class156 arg0, int arg1, int arg2) {
        if (Statics.field1554 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class109 var3 = Statics.field1568.method719();
                var3.field1552 = new int[(Statics.field1546 ? 2 : 1) * 256];
                var3.field1545 = arg2;
                var3.method746();
                var3.field1556 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1556 > 16384) {
                    var3.field1556 = 16384;
                }
                var3.method747(var3.field1556);
                if (Statics.field1561 > 0 && Statics.field1549 == null) {
                    Statics.field1549 = new class111();
                    Statics.field1547 = Executors.newScheduledThreadPool(1);
                    Statics.field1547.scheduleAtFixedRate(Statics.field1549, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1549 != null) {
                    if (Statics.field1549.field1581[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1549.field1581[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class109();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.al(Ldq;I)V")
    public final synchronized void method1932(class119 arg0) {
        this.field1553 = arg0;
    }

    @ObfuscatedName("di.ao(I)V")
    public final synchronized void method1933() {
        if (this.field1552 == null) {
            return;
        }
        long var1 = class183.method4541();
        try {
            if (this.field1559 != 0L) {
                if (var1 < this.field1559) {
                    return;
                }
                this.method747(this.field1556);
                this.field1559 = 0L;
                this.field1551 = true;
            }
            int var3 = this.method754();
            if (this.field1562 - var3 > this.field1560) {
                this.field1560 = this.field1562 - var3;
            }
            int var4 = this.field1566 + this.field1545;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1556) {
                this.field1556 += 1024;
                if (this.field1556 > 16384) {
                    this.field1556 = 16384;
                }
                this.method751();
                this.method747(this.field1556);
                var3 = 0;
                this.field1551 = true;
                if (var4 + 256 > this.field1556) {
                    var4 = this.field1556 - 256;
                    this.field1566 = var4 - this.field1545;
                }
            }
            while (var3 < var4) {
                this.method1936(this.field1552, 256);
                this.method749();
                var3 += 256;
            }
            if (var1 > this.field1563) {
                if (this.field1551) {
                    this.field1551 = false;
                } else if (this.field1560 == 0 && this.field1567 == 0) {
                    this.method751();
                    this.field1559 = var1 + 2000L;
                    return;
                } else {
                    this.field1566 = Math.min(this.field1567, this.field1560);
                    this.field1567 = this.field1560;
                }
                this.field1560 = 0;
                this.field1563 = var1 + 2000L;
            }
            this.field1562 = var3;
        } catch (Exception var8) {
            this.method751();
            this.field1559 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1555 + 500000L) {
                var1 = this.field1555;
            }
            while (var1 > this.field1555 + 5000L) {
                this.method1940(256);
                this.field1555 += (long) (256000 / Statics.field1554);
            }
        } catch (Exception var7) {
            this.field1555 = var1;
        }
    }

    @ObfuscatedName("di.aq(I)V")
    public final void method1938() {
        this.field1551 = true;
    }

    @ObfuscatedName("di.ab(I)V")
    public final synchronized void method1934() {
        this.field1551 = true;
        try {
            this.method758();
        } catch (Exception var2) {
            this.method751();
            this.field1559 = class183.method4541() + 2000L;
        }
    }

    @ObfuscatedName("di.as(I)V")
    public final synchronized void method1937() {
        if (Statics.field1549 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1549.field1581[var2] == this) {
                    Statics.field1549.field1581[var2] = null;
                }
                if (Statics.field1549.field1581[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1547.shutdownNow();
                Statics.field1547 = null;
                Statics.field1549 = null;
            }
        }
        this.method751();
        this.field1552 = null;
    }

    @ObfuscatedName("di.ag(II)V")
    public final void method1940(int arg0) {
        this.field1565 -= arg0;
        if (this.field1565 < 0) {
            this.field1565 = 0;
        }
        if (this.field1553 != null) {
            this.field1553.method1814(arg0);
        }
    }

    @ObfuscatedName("di.ap([II)V")
    public final void method1936(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1546) {
            var3 = arg1 << 1;
        }
        class191.method3335(arg0, 0, var3);
        this.field1565 -= arg1;
        if (this.field1553 != null && this.field1565 <= 0) {
            this.field1565 += Statics.field1554 >> 4;
            method1553(this.field1553);
            this.method1941(this.field1553, this.field1553.method2023());
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
                        class119 var11 = this.field1557[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1636;
                                if (var12 == null || var12.field1668 <= var8) {
                                    var11.field1637 = true;
                                    int var13 = var11.method1811();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1668 += var13;
                                    }
                                    if (var4 >= this.field1548) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1809();
                                    if (var14 != null) {
                                        int var15 = var11.field1635;
                                        while (var14 != null) {
                                            this.method1941(var14, var15 * var14.method2023() >> 8);
                                            var14 = var11.method1810();
                                        }
                                    }
                                    class119 var16 = var11.field1634;
                                    var11.field1634 = null;
                                    if (var10 == null) {
                                        this.field1557[var7] = var16;
                                    } else {
                                        var10.field1634 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1550[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1634;
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
                class119 var18 = this.field1557[var17];
                class119[] var19 = this.field1557;
                this.field1550[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1634;
                    var18.field1634 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1565 < 0) {
            this.field1565 = 0;
        }
        if (this.field1553 != null) {
            this.field1553.method1812(arg0, 0, arg1);
        }
        this.field1555 = class183.method4541();
    }

    @ObfuscatedName("ce.av(Ldq;I)V")
    public static final void method1553(class119 arg0) {
        arg0.field1637 = false;
        if (arg0.field1636 != null) {
            arg0.field1636.field1668 = 0;
        }
        for (class119 var1 = arg0.method1809(); var1 != null; var1 = arg0.method1810()) {
            method1553(var1);
        }
    }

    @ObfuscatedName("di.ak(Ldq;IB)V")
    public final void method1941(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1550[var3];
        if (var4 == null) {
            this.field1557[var3] = arg0;
        } else {
            var4.field1634 = arg0;
        }
        this.field1550[var3] = arg0;
        arg0.field1635 = arg1;
    }

    @ObfuscatedName("di.m(I)V")
    public void method746() throws Exception {
    }

    @ObfuscatedName("di.p(II)V")
    public void method747(int arg0) throws Exception {
    }

    @ObfuscatedName("di.i(I)I")
    public int method754() throws Exception {
        return this.field1556;
    }

    @ObfuscatedName("di.j()V")
    public void method749() throws Exception {
    }

    @ObfuscatedName("di.v(I)V")
    public void method751() {
    }

    @ObfuscatedName("di.x(B)V")
    public void method758() throws Exception {
    }
}
