package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dz")
public class class108 {

    @ObfuscatedName("dz.f")
    public int[] field1562;

    @ObfuscatedName("dz.l")
    public class118 field1559;

    @ObfuscatedName("dz.m")
    public int field1555 = 32;

    @ObfuscatedName("dz.b")
    public long field1553 = class197.method26();

    @ObfuscatedName("dz.h")
    public int field1557;

    @ObfuscatedName("dz.t")
    public int field1558;

    @ObfuscatedName("dz.v")
    public int field1569;

    @ObfuscatedName("dz.n")
    public long field1560 = 0L;

    @ObfuscatedName("dz.u")
    public int field1561 = 0;

    @ObfuscatedName("dz.q")
    public int field1556 = 0;

    @ObfuscatedName("dz.g")
    public int field1554 = 0;

    @ObfuscatedName("dz.y")
    public long field1563 = 0L;

    @ObfuscatedName("dz.s")
    public boolean field1565 = true;

    @ObfuscatedName("dz.ak")
    public int field1566 = 0;

    @ObfuscatedName("dz.as")
    public class118[] field1567 = new class118[8];

    @ObfuscatedName("dz.aa")
    public class118[] field1568 = new class118[8];

    @ObfuscatedName("cw.ac(Lfl;IIB)Ldz;")
    public static final class108 method1870(class167 arg0, int arg1, int arg2) {
        if (Statics.field3928 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field323.method704();
                var3.field1562 = new int[256 * (Statics.field298 ? 2 : 1)];
                var3.field1558 = arg2;
                var3.method726();
                var3.field1557 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1557 > 16384) {
                    var3.field1557 = 16384;
                }
                var3.method729(var3.field1557);
                if (Statics.field2778 > 0 && Statics.field383 == null) {
                    Statics.field383 = new class110();
                    Statics.field655 = Executors.newScheduledThreadPool(1);
                    Statics.field655.scheduleAtFixedRate(Statics.field383, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field383 != null) {
                    if (Statics.field383.field1584[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field383.field1584[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dz.ap(Ldd;I)V")
    public final synchronized void method2033(class118 arg0) {
        this.field1559 = arg0;
    }

    @ObfuscatedName("dz.al(I)V")
    public final synchronized void method2050() {
        if (this.field1562 == null) {
            return;
        }
        long var1 = class197.method26();
        try {
            if (this.field1560 != 0L) {
                if (var1 < this.field1560) {
                    return;
                }
                this.method729(this.field1557);
                this.field1560 = 0L;
                this.field1565 = true;
            }
            int var3 = this.method737();
            if (this.field1554 - var3 > this.field1561) {
                this.field1561 = this.field1554 - var3;
            }
            int var4 = this.field1569 + this.field1558;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1557) {
                this.field1557 += 1024;
                if (this.field1557 > 16384) {
                    this.field1557 = 16384;
                }
                this.method730();
                this.method729(this.field1557);
                var3 = 0;
                this.field1565 = true;
                if (var4 + 256 > this.field1557) {
                    var4 = this.field1557 - 256;
                    this.field1569 = var4 - this.field1558;
                }
            }
            while (var3 < var4) {
                this.method2060(this.field1562, 256);
                this.method743();
                var3 += 256;
            }
            if (var1 > this.field1563) {
                if (this.field1565) {
                    this.field1565 = false;
                } else if (this.field1561 == 0 && this.field1556 == 0) {
                    this.method730();
                    this.field1560 = var1 + 2000L;
                    return;
                } else {
                    this.field1569 = Math.min(this.field1556, this.field1561);
                    this.field1556 = this.field1561;
                }
                this.field1561 = 0;
                this.field1563 = var1 + 2000L;
            }
            this.field1554 = var3;
        } catch (Exception var8) {
            this.method730();
            this.field1560 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1553 + 500000L) {
                var1 = this.field1553;
            }
            while (var1 > this.field1553 + 5000L) {
                this.method2038(256);
                this.field1553 += (long) (256000 / Statics.field3928);
            }
        } catch (Exception var7) {
            this.field1553 = var1;
        }
    }

    @ObfuscatedName("dz.ai(I)V")
    public final void method2035() {
        this.field1565 = true;
    }

    @ObfuscatedName("dz.ab(I)V")
    public final synchronized void method2036() {
        this.field1565 = true;
        try {
            this.method728();
        } catch (Exception var2) {
            this.method730();
            this.field1560 = class197.method26() + 2000L;
        }
    }

    @ObfuscatedName("dz.ak(I)V")
    public final synchronized void method2048() {
        if (Statics.field383 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field383.field1584[var2] == this) {
                    Statics.field383.field1584[var2] = null;
                }
                if (Statics.field383.field1584[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field655.shutdownNow();
                Statics.field655 = null;
                Statics.field383 = null;
            }
        }
        this.method730();
        this.field1562 = null;
    }

    @ObfuscatedName("dz.as(IB)V")
    public final void method2038(int arg0) {
        this.field1566 -= arg0;
        if (this.field1566 < 0) {
            this.field1566 = 0;
        }
        if (this.field1559 != null) {
            this.field1559.method1940(arg0);
        }
    }

    @ObfuscatedName("dz.aa([II)V")
    public final void method2060(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field298) {
            var3 = arg1 << 1;
        }
        class206.method3550(arg0, 0, var3);
        this.field1566 -= arg1;
        if (this.field1559 != null && this.field1566 <= 0) {
            this.field1566 += Statics.field3928 >> 4;
            method1699(this.field1559);
            this.method2040(this.field1559, this.field1559.method2122());
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
                        class118 var11 = this.field1567[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1642;
                                if (var12 == null || var12.field1673 <= var8) {
                                    var11.field1639 = true;
                                    int var13 = var11.method1914();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1673 += var13;
                                    }
                                    if (var4 >= this.field1555) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method1915();
                                    if (var14 != null) {
                                        int var15 = var11.field1641;
                                        while (var14 != null) {
                                            this.method2040(var14, var15 * var14.method2122() >> 8);
                                            var14 = var11.method1913();
                                        }
                                    }
                                    class118 var16 = var11.field1640;
                                    var11.field1640 = null;
                                    if (var10 == null) {
                                        this.field1567[var7] = var16;
                                    } else {
                                        var10.field1640 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1568[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1640;
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
                class118 var18 = this.field1567[var17];
                class118[] var19 = this.field1567;
                this.field1568[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1640;
                    var18.field1640 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1566 < 0) {
            this.field1566 = 0;
        }
        if (this.field1559 != null) {
            this.field1559.method1920(arg0, 0, arg1);
        }
        this.field1553 = class197.method26();
    }

    @ObfuscatedName("cj.ah(Ldd;I)V")
    public static final void method1699(class118 arg0) {
        arg0.field1639 = false;
        if (arg0.field1642 != null) {
            arg0.field1642.field1673 = 0;
        }
        for (class118 var1 = arg0.method1915(); var1 != null; var1 = arg0.method1913()) {
            method1699(var1);
        }
    }

    @ObfuscatedName("dz.ao(Ldd;II)V")
    public final void method2040(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1568[var3];
        if (var4 == null) {
            this.field1567[var3] = arg0;
        } else {
            var4.field1640 = arg0;
        }
        this.field1568[var3] = arg0;
        arg0.field1641 = arg1;
    }

    @ObfuscatedName("dz.c(I)V")
    public void method726() throws Exception {
    }

    @ObfuscatedName("dz.i(II)V")
    public void method729(int arg0) throws Exception {
    }

    @ObfuscatedName("dz.o(I)I")
    public int method737() throws Exception {
        return this.field1557;
    }

    @ObfuscatedName("dz.j()V")
    public void method743() throws Exception {
    }

    @ObfuscatedName("dz.k(I)V")
    public void method730() {
    }

    @ObfuscatedName("dz.x(S)V")
    public void method728() throws Exception {
    }
}
