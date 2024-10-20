package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("do")
public class class107 {

    @ObfuscatedName("do.v")
    public int[] field1523;

    @ObfuscatedName("do.n")
    public class117 field1520;

    @ObfuscatedName("do.y")
    public int field1521 = 32;

    @ObfuscatedName("do.d")
    public long field1522 = class187.method35();

    @ObfuscatedName("do.l")
    public int field1524;

    @ObfuscatedName("do.f")
    public int field1532;

    @ObfuscatedName("do.k")
    public int field1525;

    @ObfuscatedName("do.e")
    public long field1534 = 0L;

    @ObfuscatedName("do.u")
    public int field1526 = 0;

    @ObfuscatedName("do.g")
    public int field1528 = 0;

    @ObfuscatedName("do.z")
    public int field1529 = 0;

    @ObfuscatedName("do.b")
    public long field1530 = 0L;

    @ObfuscatedName("do.c")
    public boolean field1531 = true;

    @ObfuscatedName("do.ax")
    public int field1517 = 0;

    @ObfuscatedName("do.ae")
    public class117[] field1533 = new class117[8];

    @ObfuscatedName("do.ah")
    public class117[] field1519 = new class117[8];

    @ObfuscatedName("be.e(IZIB)V")
    public static final void method983(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field311 = arg0;
        Statics.field257 = arg1;
        Statics.field1535 = arg2;
    }

    @ObfuscatedName("client.u(Lfw;IIB)Ldo;")
    public static final class107 method1354(class157 arg0, int arg1, int arg2) {
        if (Statics.field311 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class107 var3 = Statics.field2049.method671();
                var3.field1523 = new int[(Statics.field257 ? 2 : 1) * 256];
                var3.field1532 = arg2;
                var3.method700();
                var3.field1524 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1524 > 16384) {
                    var3.field1524 = 16384;
                }
                var3.method688(var3.field1524);
                if (Statics.field1535 > 0 && Statics.field2509 == null) {
                    Statics.field2509 = new class109();
                    Statics.field296 = Executors.newScheduledThreadPool(1);
                    Statics.field296.scheduleAtFixedRate(Statics.field2509, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2509 != null) {
                    if (Statics.field2509.field1549[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2509.field1549[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class107();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.z(Ldj;I)V")
    public final synchronized void method2059(class117 arg0) {
        this.field1520 = arg0;
    }

    @ObfuscatedName("do.b(I)V")
    public final synchronized void method2040() {
        if (this.field1523 == null) {
            return;
        }
        long var1 = class187.method35();
        try {
            if (this.field1534 != 0L) {
                if (var1 < this.field1534) {
                    return;
                }
                this.method688(this.field1524);
                this.field1534 = 0L;
                this.field1531 = true;
            }
            int var3 = this.method686();
            if (this.field1529 - var3 > this.field1526) {
                this.field1526 = this.field1529 - var3;
            }
            int var4 = this.field1532 + this.field1525;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1524) {
                this.field1524 += 1024;
                if (this.field1524 > 16384) {
                    this.field1524 = 16384;
                }
                this.method691();
                this.method688(this.field1524);
                var3 = 0;
                this.field1531 = true;
                if (var4 + 256 > this.field1524) {
                    var4 = this.field1524 - 256;
                    this.field1525 = var4 - this.field1532;
                }
            }
            while (var3 < var4) {
                this.method2044(this.field1523, 256);
                this.method697();
                var3 += 256;
            }
            if (var1 > this.field1530) {
                if (this.field1531) {
                    this.field1531 = false;
                } else if (this.field1526 == 0 && this.field1528 == 0) {
                    this.method691();
                    this.field1534 = var1 + 2000L;
                    return;
                } else {
                    this.field1525 = Math.min(this.field1528, this.field1526);
                    this.field1528 = this.field1526;
                }
                this.field1526 = 0;
                this.field1530 = var1 + 2000L;
            }
            this.field1529 = var3;
        } catch (Exception var8) {
            this.method691();
            this.field1534 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1522 + 500000L) {
                var1 = this.field1522;
            }
            while (var1 > this.field1522 + 5000L) {
                this.method2043(256);
                this.field1522 += (long) (256000 / Statics.field311);
            }
        } catch (Exception var7) {
            this.field1522 = var1;
        }
    }

    @ObfuscatedName("do.c(I)V")
    public final void method2055() {
        this.field1531 = true;
    }

    @ObfuscatedName("do.aa(I)V")
    public final synchronized void method2038() {
        this.field1531 = true;
        try {
            this.method692();
        } catch (Exception var2) {
            this.method691();
            this.field1534 = class187.method35() + 2000L;
        }
    }

    @ObfuscatedName("do.ap(I)V")
    public final synchronized void method2042() {
        if (Statics.field2509 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2509.field1549[var2] == this) {
                    Statics.field2509.field1549[var2] = null;
                }
                if (Statics.field2509.field1549[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field296.shutdownNow();
                Statics.field296 = null;
                Statics.field2509 = null;
            }
        }
        this.method691();
        this.field1523 = null;
    }

    @ObfuscatedName("do.ao(II)V")
    public final void method2043(int arg0) {
        this.field1517 -= arg0;
        if (this.field1517 < 0) {
            this.field1517 = 0;
        }
        if (this.field1520 != null) {
            this.field1520.method1913(arg0);
        }
    }

    @ObfuscatedName("do.ar([II)V")
    public final void method2044(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field257) {
            var3 = arg1 << 1;
        }
        class195.method3424(arg0, 0, var3);
        this.field1517 -= arg1;
        if (this.field1520 != null && this.field1517 <= 0) {
            this.field1517 += Statics.field311 >> 4;
            method3018(this.field1520);
            this.method2045(this.field1520, this.field1520.method2123());
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
                        class117 var10 = null;
                        class117 var11 = this.field1533[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class120 var12 = var11.field1601;
                                if (var12 == null || var12.field1633 <= var8) {
                                    var11.field1599 = true;
                                    int var13 = var11.method1910();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1633 += var13;
                                    }
                                    if (var4 >= this.field1521) {
                                        break label105;
                                    }
                                    class117 var14 = var11.method1915();
                                    if (var14 != null) {
                                        int var15 = var11.field1602;
                                        while (var14 != null) {
                                            this.method2045(var14, var15 * var14.method2123() >> 8);
                                            var14 = var11.method1909();
                                        }
                                    }
                                    class117 var16 = var11.field1600;
                                    var11.field1600 = null;
                                    if (var10 == null) {
                                        this.field1533[var7] = var16;
                                    } else {
                                        var10.field1600 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1519[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1600;
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
                class117 var18 = this.field1533[var17];
                class117[] var19 = this.field1533;
                this.field1519[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class117 var21 = var18.field1600;
                    var18.field1600 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1517 < 0) {
            this.field1517 = 0;
        }
        if (this.field1520 != null) {
            this.field1520.method1923(arg0, 0, arg1);
        }
        this.field1522 = class187.method35();
    }

    @ObfuscatedName("fh.ay(Ldj;B)V")
    public static final void method3018(class117 arg0) {
        arg0.field1599 = false;
        if (arg0.field1601 != null) {
            arg0.field1601.field1633 = 0;
        }
        for (class117 var1 = arg0.method1915(); var1 != null; var1 = arg0.method1909()) {
            method3018(var1);
        }
    }

    @ObfuscatedName("do.ax(Ldj;II)V")
    public final void method2045(class117 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class117 var4 = this.field1519[var3];
        if (var4 == null) {
            this.field1533[var3] = arg0;
        } else {
            var4.field1600 = arg0;
        }
        this.field1519[var3] = arg0;
        arg0.field1602 = arg1;
    }

    @ObfuscatedName("do.p(I)V")
    public void method700() throws Exception {
    }

    @ObfuscatedName("do.i(II)V")
    public void method688(int arg0) throws Exception {
    }

    @ObfuscatedName("do.w(I)I")
    public int method686() throws Exception {
        return this.field1524;
    }

    @ObfuscatedName("do.s()V")
    public void method697() throws Exception {
    }

    @ObfuscatedName("do.j(I)V")
    public void method691() {
    }

    @ObfuscatedName("do.a(I)V")
    public void method692() throws Exception {
    }
}
