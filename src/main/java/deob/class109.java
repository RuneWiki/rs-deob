package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("df")
public class class109 {

    @ObfuscatedName("df.f")
    public int[] field1545;

    @ObfuscatedName("df.q")
    public class119 field1546;

    @ObfuscatedName("df.r")
    public int field1542 = 32;

    @ObfuscatedName("df.x")
    public long field1548 = class187.method2705();

    @ObfuscatedName("df.u")
    public int field1557;

    @ObfuscatedName("df.b")
    public int field1550;

    @ObfuscatedName("df.p")
    public int field1563;

    @ObfuscatedName("df.y")
    public long field1552 = 0L;

    @ObfuscatedName("df.n")
    public int field1553 = 0;

    @ObfuscatedName("df.j")
    public int field1551 = 0;

    @ObfuscatedName("df.e")
    public int field1555 = 0;

    @ObfuscatedName("df.v")
    public long field1556 = 0L;

    @ObfuscatedName("df.a")
    public boolean field1549 = true;

    @ObfuscatedName("df.af")
    public int field1559 = 0;

    @ObfuscatedName("df.as")
    public class119[] field1560 = new class119[8];

    @ObfuscatedName("df.ax")
    public class119[] field1561 = new class119[8];

    @ObfuscatedName("hn.ad(IZII)V")
    public static final void method4013(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1562 = arg0;
        Statics.field1179 = arg1;
        Statics.field1280 = arg2;
    }

    @ObfuscatedName("cn.al(Lfy;III)Ldf;")
    public static final class109 method1753(class157 arg0, int arg1, int arg2) {
        if (Statics.field1562 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class109 var3 = Statics.field376.method651();
                var3.field1545 = new int[256 * (Statics.field1179 ? 2 : 1)];
                var3.field1550 = arg2;
                var3.method664();
                var3.field1557 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1557 > 16384) {
                    var3.field1557 = 16384;
                }
                var3.method665(var3.field1557);
                if (Statics.field1280 > 0 && Statics.field1547 == null) {
                    Statics.field1547 = new class111();
                    Statics.field1575 = Executors.newScheduledThreadPool(1);
                    Statics.field1575.scheduleAtFixedRate(Statics.field1547, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1547 != null) {
                    if (Statics.field1547.field1576[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1547.field1576[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class109();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("df.aq(Ldb;S)V")
    public final synchronized void method2138(class119 arg0) {
        this.field1546 = arg0;
    }

    @ObfuscatedName("df.ar(B)V")
    public final synchronized void method2121() {
        if (this.field1545 == null) {
            return;
        }
        long var1 = class187.method2705();
        try {
            if (this.field1552 != 0L) {
                if (var1 < this.field1552) {
                    return;
                }
                this.method665(this.field1557);
                this.field1552 = 0L;
                this.field1549 = true;
            }
            int var3 = this.method666();
            if (this.field1555 - var3 > this.field1553) {
                this.field1553 = this.field1555 - var3;
            }
            int var4 = this.field1563 + this.field1550;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1557) {
                this.field1557 += 1024;
                if (this.field1557 > 16384) {
                    this.field1557 = 16384;
                }
                this.method668();
                this.method665(this.field1557);
                var3 = 0;
                this.field1549 = true;
                if (var4 + 256 > this.field1557) {
                    var4 = this.field1557 - 256;
                    this.field1563 = var4 - this.field1550;
                }
            }
            while (var3 < var4) {
                this.method2126(this.field1545, 256);
                this.method663();
                var3 += 256;
            }
            if (var1 > this.field1556) {
                if (this.field1549) {
                    this.field1549 = false;
                } else if (this.field1553 == 0 && this.field1551 == 0) {
                    this.method668();
                    this.field1552 = var1 + 2000L;
                    return;
                } else {
                    this.field1563 = Math.min(this.field1551, this.field1553);
                    this.field1551 = this.field1553;
                }
                this.field1553 = 0;
                this.field1556 = var1 + 2000L;
            }
            this.field1555 = var3;
        } catch (Exception var8) {
            this.method668();
            this.field1552 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1548 + 500000L) {
                var1 = this.field1548;
            }
            while (var1 > this.field1548 + 5000L) {
                this.method2125(256);
                this.field1548 += (long) (256000 / Statics.field1562);
            }
        } catch (Exception var7) {
            this.field1548 = var1;
        }
    }

    @ObfuscatedName("df.an(I)V")
    public final void method2122() {
        this.field1549 = true;
    }

    @ObfuscatedName("df.af(I)V")
    public final synchronized void method2127() {
        this.field1549 = true;
        try {
            this.method676();
        } catch (Exception var2) {
            this.method668();
            this.field1552 = class187.method2705() + 2000L;
        }
    }

    @ObfuscatedName("df.as(I)V")
    public final synchronized void method2124() {
        if (Statics.field1547 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1547.field1576[var2] == this) {
                    Statics.field1547.field1576[var2] = null;
                }
                if (Statics.field1547.field1576[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1575.shutdownNow();
                Statics.field1575 = null;
                Statics.field1547 = null;
            }
        }
        this.method668();
        this.field1545 = null;
    }

    @ObfuscatedName("df.ax(IB)V")
    public final void method2125(int arg0) {
        this.field1559 -= arg0;
        if (this.field1559 < 0) {
            this.field1559 = 0;
        }
        if (this.field1546 != null) {
            this.field1546.method1989(arg0);
        }
    }

    @ObfuscatedName("df.ak([II)V")
    public final void method2126(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1179) {
            var3 = arg1 << 1;
        }
        class195.method3603(arg0, 0, var3);
        this.field1559 -= arg1;
        if (this.field1546 != null && this.field1559 <= 0) {
            this.field1559 += Statics.field1562 >> 4;
            method179(this.field1546);
            this.method2123(this.field1546, this.field1546.method2223());
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
                        class119 var11 = this.field1560[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class122 var12 = var11.field1627;
                                if (var12 == null || var12.field1660 <= var8) {
                                    var11.field1629 = true;
                                    int var13 = var11.method1986();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1660 += var13;
                                    }
                                    if (var4 >= this.field1542) {
                                        break label105;
                                    }
                                    class119 var14 = var11.method1984();
                                    if (var14 != null) {
                                        int var15 = var11.field1626;
                                        while (var14 != null) {
                                            this.method2123(var14, var15 * var14.method2223() >> 8);
                                            var14 = var11.method1985();
                                        }
                                    }
                                    class119 var16 = var11.field1628;
                                    var11.field1628 = null;
                                    if (var10 == null) {
                                        this.field1560[var7] = var16;
                                    } else {
                                        var10.field1628 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1561[var7] = var10;
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
                class119 var18 = this.field1560[var17];
                class119[] var19 = this.field1560;
                this.field1561[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class119 var21 = var18.field1628;
                    var18.field1628 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1559 < 0) {
            this.field1559 = 0;
        }
        if (this.field1546 != null) {
            this.field1546.method1999(arg0, 0, arg1);
        }
        this.field1548 = class187.method2705();
    }

    @ObfuscatedName("a.aw(Ldb;I)V")
    public static final void method179(class119 arg0) {
        arg0.field1629 = false;
        if (arg0.field1627 != null) {
            arg0.field1627.field1660 = 0;
        }
        for (class119 var1 = arg0.method1984(); var1 != null; var1 = arg0.method1985()) {
            method179(var1);
        }
    }

    @ObfuscatedName("df.ai(Ldb;II)V")
    public final void method2123(class119 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class119 var4 = this.field1561[var3];
        if (var4 == null) {
            this.field1560[var3] = arg0;
        } else {
            var4.field1628 = arg0;
        }
        this.field1561[var3] = arg0;
        arg0.field1626 = arg1;
    }

    @ObfuscatedName("df.s(I)V")
    public void method664() throws Exception {
    }

    @ObfuscatedName("df.g(II)V")
    public void method665(int arg0) throws Exception {
    }

    @ObfuscatedName("df.m(I)I")
    public int method666() throws Exception {
        return this.field1557;
    }

    @ObfuscatedName("df.h()V")
    public void method663() throws Exception {
    }

    @ObfuscatedName("df.i(I)V")
    public void method668() {
    }

    @ObfuscatedName("df.w(I)V")
    public void method676() throws Exception {
    }
}
