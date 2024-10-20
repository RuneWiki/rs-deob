package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("do")
public class class109 {

    @ObfuscatedName("do.q")
    public int[] field1542;

    @ObfuscatedName("do.j")
    public class119 field1543;

    @ObfuscatedName("do.m")
    public int field1544 = 32;

    @ObfuscatedName("do.h")
    public long field1545 = class183.method1711();

    @ObfuscatedName("do.c")
    public int field1550;

    @ObfuscatedName("do.y")
    public int field1547;

    @ObfuscatedName("do.p")
    public int field1555;

    @ObfuscatedName("do.i")
    public long field1537 = 0L;

    @ObfuscatedName("do.l")
    public int field1536 = 0;

    @ObfuscatedName("do.z")
    public int field1551 = 0;

    @ObfuscatedName("do.e")
    public int field1553 = 0;

    @ObfuscatedName("do.v")
    public long field1548 = 0L;

    @ObfuscatedName("do.w")
    public boolean field1554 = true;

    @ObfuscatedName("do.an")
    public int field1549 = 0;

    @ObfuscatedName("do.am")
    public class119[] field1552 = new class119[8];

    @ObfuscatedName("do.ar")
    public class119[] field1557 = new class119[8];

    @ObfuscatedName("br.v(IZII)V")
    public static final void method916(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1556 = arg0;
        Statics.field1546 = arg1;
        Statics.field1538 = arg2;
    }

    @ObfuscatedName("df.w(Leq;III)Ldo;")
    public static final class109 method2295(class156 arg0, int arg1, int arg2) {
        if (Statics.field1556 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class109 var3 = Statics.field1541.method634();
                var3.field1542 = new int[256 * (Statics.field1546 ? 2 : 1)];
                var3.field1547 = arg2;
                var3.method663();
                var3.field1550 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1550 > 16384) {
                    var3.field1550 = 16384;
                }
                var3.method679(var3.field1550);
                if (Statics.field1538 > 0 && Statics.field1539 == null) {
                    Statics.field1539 = new class111();
                    Statics.field2036 = Executors.newScheduledThreadPool(1);
                    Statics.field2036.scheduleAtFixedRate(Statics.field1539, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1539 != null) {
                    if (Statics.field1539.field1571[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1539.field1571[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class109();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.av(Ldk;B)V")
    public final synchronized void method1876(class119 arg0) {
        this.field1543 = arg0;
    }

    @ObfuscatedName("do.au(I)V")
    public final synchronized void method1907() {
        if (this.field1542 == null) {
            return;
        }
        long var1 = class183.method1711();
        try {
            if (this.field1537 != 0L) {
                if (var1 < this.field1537) {
                    return;
                }
                this.method679(this.field1550);
                this.field1537 = 0L;
                this.field1554 = true;
            }
            int var3 = this.method665();
            if (this.field1553 - var3 > this.field1536) {
                this.field1536 = this.field1553 - var3;
            }
            int var4 = this.field1555 + this.field1547;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1550) {
                this.field1550 += 1024;
                if (this.field1550 > 16384) {
                    this.field1550 = 16384;
                }
                this.method681();
                this.method679(this.field1550);
                var3 = 0;
                this.field1554 = true;
                if (var4 + 256 > this.field1550) {
                    var4 = this.field1550 - 256;
                    this.field1555 = var4 - this.field1547;
                }
            }
            while (var3 < var4) {
                this.method1886(this.field1542, 256);
                this.method669();
                var3 += 256;
            }
            if (var1 > this.field1548) {
                if (this.field1554) {
                    this.field1554 = false;
                } else if (this.field1536 == 0 && this.field1551 == 0) {
                    this.method681();
                    this.field1537 = var1 + 2000L;
                    return;
                } else {
                    this.field1555 = Math.min(this.field1551, this.field1536);
                    this.field1551 = this.field1536;
                }
                this.field1536 = 0;
                this.field1548 = var1 + 2000L;
            }
            this.field1553 = var3;
        } catch (Exception var8) {
            this.method681();
            this.field1537 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1545 + 500000L) {
                var1 = this.field1545;
            }
            while (var1 > this.field1545 + 5000L) {
                this.method1881(256);
                this.field1545 += (long) (256000 / Statics.field1556);
            }
        } catch (Exception var7) {
            this.field1545 = var1;
        }
    }

    @ObfuscatedName("do.ae(I)V")
    public final void method1878() {
        this.field1554 = true;
    }

    @ObfuscatedName("do.ak(B)V")
    public final synchronized void method1879() {
        this.field1554 = true;
        try {
            this.method668();
        } catch (Exception var2) {
            this.method681();
            this.field1537 = class183.method1711() + 2000L;
        }
    }

    @ObfuscatedName("do.aq(I)V")
    public final synchronized void method1889() {
        if (Statics.field1539 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1539.field1571[var2] == this) {
                    Statics.field1539.field1571[var2] = null;
                }
                if (Statics.field1539.field1571[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2036.shutdownNow();
                Statics.field2036 = null;
                Statics.field1539 = null;
            }
        }
        this.method681();
        this.field1542 = null;
    }

    @ObfuscatedName("do.an(IB)V")
    public final void method1881(int arg0) {
        this.field1549 -= arg0;
        if (this.field1549 < 0) {
            this.field1549 = 0;
        }
        if (this.field1543 != null) {
            this.field1543.method1748(arg0);
        }
    }

    @ObfuscatedName("do.am([II)V")
    public final void method1886(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1546) {
            var3 = arg1 << 1;
        }
        class191.method3266(arg0, 0, var3);
        this.field1549 -= arg1;
        if (this.field1543 != null && this.field1549 <= 0) {
            this.field1549 += Statics.field1556 >> 4;
            method1387(this.field1543);
            this.method1883(this.field1543, this.field1543.method1964());
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
                        class119 var11 = this.field1552[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1631;
                                if (var12 == null || var12.field1663 <= var8) {
                                    var11.field1629 = true;
                                    int var13 = var11.method1739();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1663 += var13;
                                    }
                                    if (var4 >= this.field1544) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1761();
                                    if (var14 != null) {
                                        int var15 = var11.field1630;
                                        while (var14 != null) {
                                            this.method1883(var14, var15 * var14.method1964() >> 8);
                                            var14 = var11.method1745();
                                        }
                                    }
                                    class119 var16 = var11.field1632;
                                    var11.field1632 = null;
                                    if (var10 == null) {
                                        this.field1552[var7] = var16;
                                    } else {
                                        var10.field1632 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1557[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1632;
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
                class119 var18 = this.field1552[var17];
                class119[] var19 = this.field1552;
                this.field1557[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1632;
                    var18.field1632 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1549 < 0) {
            this.field1549 = 0;
        }
        if (this.field1543 != null) {
            this.field1543.method1744(arg0, 0, arg1);
        }
        this.field1545 = class183.method1711();
    }

    @ObfuscatedName("bw.ar(Ldk;I)V")
    public static final void method1387(class119 arg0) {
        arg0.field1629 = false;
        if (arg0.field1631 != null) {
            arg0.field1631.field1663 = 0;
        }
        for (class119 var1 = arg0.method1761(); var1 != null; var1 = arg0.method1745()) {
            method1387(var1);
        }
    }

    @ObfuscatedName("do.ao(Ldk;II)V")
    public final void method1883(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1557[var3];
        if (var4 == null) {
            this.field1552[var3] = arg0;
        } else {
            var4.field1632 = arg0;
        }
        this.field1557[var3] = arg0;
        arg0.field1630 = arg1;
    }

    @ObfuscatedName("do.b(I)V")
    public void method663() throws Exception {
    }

    @ObfuscatedName("do.s(IS)V")
    public void method679(int arg0) throws Exception {
    }

    @ObfuscatedName("do.r(I)I")
    public int method665() throws Exception {
        return this.field1550;
    }

    @ObfuscatedName("do.g()V")
    public void method669() throws Exception {
    }

    @ObfuscatedName("do.x(B)V")
    public void method681() {
    }

    @ObfuscatedName("do.f(I)V")
    public void method668() throws Exception {
    }
}
