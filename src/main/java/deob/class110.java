package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("df")
public class class110 {

    @ObfuscatedName("df.a")
    public int[] field1640;

    @ObfuscatedName("df.g")
    public class120 field1646;

    @ObfuscatedName("df.v")
    public int field1628 = 32;

    @ObfuscatedName("df.s")
    public long field1629 = class176.method2747();

    @ObfuscatedName("df.k")
    public int field1630;

    @ObfuscatedName("df.r")
    public int field1631;

    @ObfuscatedName("df.l")
    public int field1632;

    @ObfuscatedName("df.h")
    public long field1633 = 0L;

    @ObfuscatedName("df.d")
    public int field1634 = 0;

    @ObfuscatedName("df.x")
    public int field1635 = 0;

    @ObfuscatedName("df.b")
    public int field1626 = 0;

    @ObfuscatedName("df.y")
    public long field1623 = 0L;

    @ObfuscatedName("df.u")
    public boolean field1645 = true;

    @ObfuscatedName("df.ak")
    public int field1647 = 0;

    @ObfuscatedName("df.al")
    public class120[] field1641 = new class120[8];

    @ObfuscatedName("df.ab")
    public class120[] field1637 = new class120[8];

    @ObfuscatedName("i.l(Lcf;I)V")
    public static final void method34(class104 arg0) {
        Statics.field1396 = arg0;
    }

    @ObfuscatedName("cl.d(IZIB)V")
    public static final void method1515(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1636 = arg0;
        Statics.field2850 = arg1;
        Statics.field1624 = arg2;
    }

    @ObfuscatedName("ag.x(Lew;III)Ldf;")
    public static final class110 method532(class155 arg0, int arg1, int arg2) {
        if (Statics.field1636 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class110 var3 = Statics.field1396.method660();
                var3.field1640 = new int[(Statics.field2850 ? 2 : 1) * 256];
                var3.field1631 = arg2;
                var3.method681();
                var3.field1630 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1630 > 16384) {
                    var3.field1630 = 16384;
                }
                var3.method683(var3.field1630);
                if (Statics.field1624 > 0 && Statics.field1625 == null) {
                    Statics.field1625 = new class112();
                    Statics.field1622 = Executors.newScheduledThreadPool(1);
                    Statics.field1622.scheduleAtFixedRate(Statics.field1625, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1625 != null) {
                    if (Statics.field1625.field1660[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1625.field1660[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class110();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.b(Ldb;I)V")
    public final synchronized void method1805(class120 arg0) {
        this.field1646 = arg0;
    }

    @ObfuscatedName("df.y(I)V")
    public final synchronized void method1794() {
        if (this.field1640 == null) {
            return;
        }
        long var1 = class176.method2747();
        try {
            if (this.field1633 != 0L) {
                if (var1 < this.field1633) {
                    return;
                }
                this.method683(this.field1630);
                this.field1633 = 0L;
                this.field1645 = true;
            }
            int var3 = this.method682();
            if (this.field1626 - var3 > this.field1634) {
                this.field1634 = this.field1626 - var3;
            }
            int var4 = this.field1632 + this.field1631;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1630) {
                this.field1630 += 1024;
                if (this.field1630 > 16384) {
                    this.field1630 = 16384;
                }
                this.method685();
                this.method683(this.field1630);
                var3 = 0;
                this.field1645 = true;
                if (var4 + 256 > this.field1630) {
                    var4 = this.field1630 - 256;
                    this.field1632 = var4 - this.field1631;
                }
            }
            while (var3 < var4) {
                this.method1799(this.field1640, 256);
                this.method694();
                var3 += 256;
            }
            if (var1 > this.field1623) {
                if (this.field1645) {
                    this.field1645 = false;
                } else if (this.field1634 == 0 && this.field1635 == 0) {
                    this.method685();
                    this.field1633 = var1 + 2000L;
                    return;
                } else {
                    this.field1632 = Math.min(this.field1635, this.field1634);
                    this.field1635 = this.field1634;
                }
                this.field1634 = 0;
                this.field1623 = var1 + 2000L;
            }
            this.field1626 = var3;
        } catch (Exception var8) {
            this.method685();
            this.field1633 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1629 + 500000L) {
                var1 = this.field1629;
            }
            while (var1 > this.field1629 + 5000L) {
                this.method1798(256);
                this.field1629 += (long) (256000 / Statics.field1636);
            }
        } catch (Exception var7) {
            this.field1629 = var1;
        }
    }

    @ObfuscatedName("df.u(I)V")
    public final void method1795() {
        this.field1645 = true;
    }

    @ObfuscatedName("df.av(I)V")
    public final synchronized void method1826() {
        this.field1645 = true;
        try {
            this.method686();
        } catch (Exception var2) {
            this.method685();
            this.field1633 = class176.method2747() + 2000L;
        }
    }

    @ObfuscatedName("df.ax(B)V")
    public final synchronized void method1816() {
        if (Statics.field1625 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1625.field1660[var2] == this) {
                    Statics.field1625.field1660[var2] = null;
                }
                if (Statics.field1625.field1660[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1622.shutdownNow();
                Statics.field1622 = null;
                Statics.field1625 = null;
            }
        }
        this.method685();
        this.field1640 = null;
    }

    @ObfuscatedName("df.af(II)V")
    public final void method1798(int arg0) {
        this.field1647 -= arg0;
        if (this.field1647 < 0) {
            this.field1647 = 0;
        }
        if (this.field1646 != null) {
            this.field1646.method1673(arg0);
        }
    }

    @ObfuscatedName("df.ae([II)V")
    public final void method1799(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2850) {
            var3 = arg1 << 1;
        }
        class184.method3109(arg0, 0, var3);
        this.field1647 -= arg1;
        if (this.field1646 != null && this.field1647 <= 0) {
            this.field1647 += Statics.field1636 >> 4;
            method952(this.field1646);
            this.method1811(this.field1646, this.field1646.method1979());
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
                        class120 var11 = this.field1641[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class123 var12 = var11.field1718;
                                if (var12 == null || var12.field1750 <= var8) {
                                    var11.field1717 = true;
                                    int var13 = var11.method1670();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1750 += var13;
                                    }
                                    if (var4 >= this.field1628) {
                                        break label105;
                                    }
                                    class120 var14 = var11.method1668();
                                    if (var14 != null) {
                                        int var15 = var11.field1716;
                                        while (var14 != null) {
                                            this.method1811(var14, var15 * var14.method1979() >> 8);
                                            var14 = var11.method1669();
                                        }
                                    }
                                    class120 var16 = var11.field1719;
                                    var11.field1719 = null;
                                    if (var10 == null) {
                                        this.field1641[var7] = var16;
                                    } else {
                                        var10.field1719 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1637[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1719;
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
                class120 var18 = this.field1641[var17];
                class120[] var19 = this.field1641;
                this.field1637[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class120 var21 = var18.field1719;
                    var18.field1719 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1647 < 0) {
            this.field1647 = 0;
        }
        if (this.field1646 != null) {
            this.field1646.method1671(arg0, 0, arg1);
        }
        this.field1629 = class176.method2747();
    }

    @ObfuscatedName("bq.ap(Ldb;I)V")
    public static final void method952(class120 arg0) {
        arg0.field1717 = false;
        if (arg0.field1718 != null) {
            arg0.field1718.field1750 = 0;
        }
        for (class120 var1 = arg0.method1668(); var1 != null; var1 = arg0.method1669()) {
            method952(var1);
        }
    }

    @ObfuscatedName("df.ak(Ldb;II)V")
    public final void method1811(class120 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class120 var4 = this.field1637[var3];
        if (var4 == null) {
            this.field1641[var3] = arg0;
        } else {
            var4.field1719 = arg0;
        }
        this.field1637[var3] = arg0;
        arg0.field1716 = arg1;
    }

    @ObfuscatedName("df.p(I)V")
    public void method681() throws Exception {
    }

    @ObfuscatedName("df.m(II)V")
    public void method683(int arg0) throws Exception {
    }

    @ObfuscatedName("df.e(I)I")
    public int method682() throws Exception {
        return this.field1630;
    }

    @ObfuscatedName("df.t()V")
    public void method694() throws Exception {
    }

    @ObfuscatedName("df.w(I)V")
    public void method685() {
    }

    @ObfuscatedName("df.z(B)V")
    public void method686() throws Exception {
    }
}
