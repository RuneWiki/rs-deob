package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dr")
public class class108 {

    @ObfuscatedName("dr.v")
    public int[] field1545;

    @ObfuscatedName("dr.u")
    public class118 field1543;

    @ObfuscatedName("dr.j")
    public int field1544 = 32;

    @ObfuscatedName("dr.k")
    public long field1547 = Statics.method426();

    @ObfuscatedName("dr.z")
    public int field1546;

    @ObfuscatedName("dr.w")
    public int field1536;

    @ObfuscatedName("dr.s")
    public int field1542;

    @ObfuscatedName("dr.d")
    public long field1549 = 0L;

    @ObfuscatedName("dr.f")
    public int field1548 = 0;

    @ObfuscatedName("dr.r")
    public int field1551 = 0;

    @ObfuscatedName("dr.y")
    public int field1552 = 0;

    @ObfuscatedName("dr.h")
    public long field1553 = 0L;

    @ObfuscatedName("dr.m")
    public boolean field1556 = true;

    @ObfuscatedName("dr.am")
    public int field1555 = 0;

    @ObfuscatedName("dr.az")
    public class118[] field1554 = new class118[8];

    @ObfuscatedName("dr.ap")
    public class118[] field1550 = new class118[8];

    @ObfuscatedName("bd.ae(Lcf;I)V")
    public static final void method1566(class102 arg0) {
        Statics.field1541 = arg0;
    }

    @ObfuscatedName("al.am(Lfd;III)Ldr;")
    public static final class108 method527(class167 arg0, int arg1, int arg2) {
        if (Statics.field1558 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class108 var3 = Statics.field1541.method721();
                var3.field1545 = new int[256 * (Statics.field1537 ? 2 : 1)];
                var3.field1536 = arg2;
                var3.method748();
                var3.field1546 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1546 > 16384) {
                    var3.field1546 = 16384;
                }
                var3.method750(var3.field1546);
                if (Statics.field2497 > 0 && Statics.field1539 == null) {
                    Statics.field1539 = new class110();
                    Statics.field1204 = Executors.newScheduledThreadPool(1);
                    Statics.field1204.scheduleAtFixedRate(Statics.field1539, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1539 != null) {
                    if (Statics.field1539.field1573[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1539.field1573[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class108();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.az(Ldo;I)V")
    public final synchronized void method2048(class118 arg0) {
        this.field1543 = arg0;
    }

    @ObfuscatedName("dr.ap(I)V")
    public final synchronized void method2049() {
        if (this.field1545 == null) {
            return;
        }
        long var1 = Statics.method426();
        try {
            if (this.field1549 != 0L) {
                if (var1 < this.field1549) {
                    return;
                }
                this.method750(this.field1546);
                this.field1549 = 0L;
                this.field1556 = true;
            }
            int var3 = this.method751();
            if (this.field1552 - var3 > this.field1548) {
                this.field1548 = this.field1552 - var3;
            }
            int var4 = this.field1542 + this.field1536;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1546) {
                this.field1546 += 1024;
                if (this.field1546 > 16384) {
                    this.field1546 = 16384;
                }
                this.method753();
                this.method750(this.field1546);
                var3 = 0;
                this.field1556 = true;
                if (var4 + 256 > this.field1546) {
                    var4 = this.field1546 - 256;
                    this.field1542 = var4 - this.field1536;
                }
            }
            while (var3 < var4) {
                this.method2054(this.field1545, 256);
                this.method759();
                var3 += 256;
            }
            if (var1 > this.field1553) {
                if (this.field1556) {
                    this.field1556 = false;
                } else if (this.field1548 == 0 && this.field1551 == 0) {
                    this.method753();
                    this.field1549 = var1 + 2000L;
                    return;
                } else {
                    this.field1542 = Math.min(this.field1551, this.field1548);
                    this.field1551 = this.field1548;
                }
                this.field1548 = 0;
                this.field1553 = var1 + 2000L;
            }
            this.field1552 = var3;
        } catch (Exception var8) {
            this.method753();
            this.field1549 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1547 + 500000L) {
                var1 = this.field1547;
            }
            while (var1 > this.field1547 + 5000L) {
                this.method2053(256);
                this.field1547 += (long) (256000 / Statics.field1558);
            }
        } catch (Exception var7) {
            this.field1547 = var1;
        }
    }

    @ObfuscatedName("dr.ah(S)V")
    public final void method2050() {
        this.field1556 = true;
    }

    @ObfuscatedName("dr.au(I)V")
    public final synchronized void method2051() {
        this.field1556 = true;
        try {
            this.method754();
        } catch (Exception var2) {
            this.method753();
            this.field1549 = Statics.method426() + 2000L;
        }
    }

    @ObfuscatedName("dr.ax(B)V")
    public final synchronized void method2052() {
        if (Statics.field1539 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1539.field1573[var2] == this) {
                    Statics.field1539.field1573[var2] = null;
                }
                if (Statics.field1539.field1573[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1204.shutdownNow();
                Statics.field1204 = null;
                Statics.field1539 = null;
            }
        }
        this.method753();
        this.field1545 = null;
    }

    @ObfuscatedName("dr.ar(II)V")
    public final void method2053(int arg0) {
        this.field1555 -= arg0;
        if (this.field1555 < 0) {
            this.field1555 = 0;
        }
        if (this.field1543 != null) {
            this.field1543.method1928(arg0);
        }
    }

    @ObfuscatedName("dr.an([II)V")
    public final void method2054(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1537) {
            var3 = arg1 << 1;
        }
        class206.method3559(arg0, 0, var3);
        this.field1555 -= arg1;
        if (this.field1543 != null && this.field1555 <= 0) {
            this.field1555 += Statics.field1558 >> 4;
            method1927(this.field1543);
            this.method2063(this.field1543, this.field1543.method2131());
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
                        class118 var11 = this.field1554[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class121 var12 = var11.field1626;
                                if (var12 == null || var12.field1660 <= var8) {
                                    var11.field1629 = true;
                                    int var13 = var11.method1961();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1660 += var13;
                                    }
                                    if (var4 >= this.field1544) {
                                        break label105;
                                    }
                                    class118 var14 = var11.method1934();
                                    if (var14 != null) {
                                        int var15 = var11.field1627;
                                        while (var14 != null) {
                                            this.method2063(var14, var15 * var14.method2131() >> 8);
                                            var14 = var11.method1935();
                                        }
                                    }
                                    class118 var16 = var11.field1628;
                                    var11.field1628 = null;
                                    if (var10 == null) {
                                        this.field1554[var7] = var16;
                                    } else {
                                        var10.field1628 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1550[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1628;
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
                class118 var18 = this.field1554[var17];
                class118[] var19 = this.field1554;
                this.field1550[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class118 var21 = var18.field1628;
                    var18.field1628 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1555 < 0) {
            this.field1555 = 0;
        }
        if (this.field1543 != null) {
            this.field1543.method1937(arg0, 0, arg1);
        }
        this.field1547 = Statics.method426();
    }

    @ObfuscatedName("cn.ai(Ldo;I)V")
    public static final void method1927(class118 arg0) {
        arg0.field1629 = false;
        if (arg0.field1626 != null) {
            arg0.field1626.field1660 = 0;
        }
        for (class118 var1 = arg0.method1934(); var1 != null; var1 = arg0.method1935()) {
            method1927(var1);
        }
    }

    @ObfuscatedName("dr.al(Ldo;II)V")
    public final void method2063(class118 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class118 var4 = this.field1550[var3];
        if (var4 == null) {
            this.field1554[var3] = arg0;
        } else {
            var4.field1628 = arg0;
        }
        this.field1550[var3] = arg0;
        arg0.field1627 = arg1;
    }

    @ObfuscatedName("dr.t(I)V")
    public void method748() throws Exception {
    }

    @ObfuscatedName("dr.q(IB)V")
    public void method750(int arg0) throws Exception {
    }

    @ObfuscatedName("dr.i(I)I")
    public int method751() throws Exception {
        return this.field1546;
    }

    @ObfuscatedName("dr.a()V")
    public void method759() throws Exception {
    }

    @ObfuscatedName("dr.l(B)V")
    public void method753() {
    }

    @ObfuscatedName("dr.b(I)V")
    public void method754() throws Exception {
    }
}
