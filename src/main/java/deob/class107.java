package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("dw")
public class class107 {

    @ObfuscatedName("dw.v")
    public int[] field1514;

    @ObfuscatedName("dw.s")
    public class117 field1515;

    @ObfuscatedName("dw.t")
    public int field1516 = 32;

    @ObfuscatedName("dw.f")
    public long field1517 = class196.method3211();

    @ObfuscatedName("dw.m")
    public int field1511;

    @ObfuscatedName("dw.x")
    public int field1520;

    @ObfuscatedName("dw.w")
    public int field1521;

    @ObfuscatedName("dw.j")
    public long field1529 = 0L;

    @ObfuscatedName("dw.z")
    public int field1522 = 0;

    @ObfuscatedName("dw.e")
    public int field1530 = 0;

    @ObfuscatedName("dw.k")
    public int field1524 = 0;

    @ObfuscatedName("dw.n")
    public long field1512 = 0L;

    @ObfuscatedName("dw.i")
    public boolean field1526 = true;

    @ObfuscatedName("dw.af")
    public int field1527 = 0;

    @ObfuscatedName("dw.ai")
    public class117[] field1528 = new class117[8];

    @ObfuscatedName("dw.aq")
    public class117[] field1518 = new class117[8];

    @ObfuscatedName("iy.aj(IZIB)V")
    public static final void method4070(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1523 = arg0;
        Statics.field2013 = arg1;
        Statics.field240 = arg2;
    }

    @ObfuscatedName("cs.ah(Lff;IIB)Ldw;")
    public static final class107 method1869(class166 arg0, int arg1, int arg2) {
        if (Statics.field1523 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class107 var3 = Statics.field1513.method701();
                var3.field1514 = new int[(Statics.field2013 ? 2 : 1) * 256];
                var3.field1520 = arg2;
                var3.method730();
                var3.field1511 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1511 > 16384) {
                    var3.field1511 = 16384;
                }
                var3.method715(var3.field1511);
                if (Statics.field240 > 0 && Statics.field238 == null) {
                    Statics.field238 = new class109();
                    Statics.field506 = Executors.newScheduledThreadPool(1);
                    Statics.field506.scheduleAtFixedRate(Statics.field238, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field238 != null) {
                    if (Statics.field238.field1546[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field238.field1546[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class107();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.af(Ldn;I)V")
    public final synchronized void method2053(class117 arg0) {
        this.field1515 = arg0;
    }

    @ObfuscatedName("dw.ai(B)V")
    public final synchronized void method2054() {
        if (this.field1514 == null) {
            return;
        }
        long var1 = class196.method3211();
        try {
            if (this.field1529 != 0L) {
                if (var1 < this.field1529) {
                    return;
                }
                this.method715(this.field1511);
                this.field1529 = 0L;
                this.field1526 = true;
            }
            int var3 = this.method716();
            if (this.field1524 - var3 > this.field1522) {
                this.field1522 = this.field1524 - var3;
            }
            int var4 = this.field1521 + this.field1520;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1511) {
                this.field1511 += 1024;
                if (this.field1511 > 16384) {
                    this.field1511 = 16384;
                }
                this.method718();
                this.method715(this.field1511);
                var3 = 0;
                this.field1526 = true;
                if (var4 + 256 > this.field1511) {
                    var4 = this.field1511 - 256;
                    this.field1521 = var4 - this.field1520;
                }
            }
            while (var3 < var4) {
                this.method2063(this.field1514, 256);
                this.method735();
                var3 += 256;
            }
            if (var1 > this.field1512) {
                if (this.field1526) {
                    this.field1526 = false;
                } else if (this.field1522 == 0 && this.field1530 == 0) {
                    this.method718();
                    this.field1529 = var1 + 2000L;
                    return;
                } else {
                    this.field1521 = Math.min(this.field1530, this.field1522);
                    this.field1530 = this.field1522;
                }
                this.field1522 = 0;
                this.field1512 = var1 + 2000L;
            }
            this.field1524 = var3;
        } catch (Exception var8) {
            this.method718();
            this.field1529 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1517 + 500000L) {
                var1 = this.field1517;
            }
            while (var1 > this.field1517 + 5000L) {
                this.method2058(256);
                this.field1517 += (long) (256000 / Statics.field1523);
            }
        } catch (Exception var7) {
            this.field1517 = var1;
        }
    }

    @ObfuscatedName("dw.aq(B)V")
    public final void method2060() {
        this.field1526 = true;
    }

    @ObfuscatedName("dw.ak(I)V")
    public final synchronized void method2056() {
        this.field1526 = true;
        try {
            this.method719();
        } catch (Exception var2) {
            this.method718();
            this.field1529 = class196.method3211() + 2000L;
        }
    }

    @ObfuscatedName("dw.al(I)V")
    public final synchronized void method2057() {
        if (Statics.field238 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field238.field1546[var2] == this) {
                    Statics.field238.field1546[var2] = null;
                }
                if (Statics.field238.field1546[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field506.shutdownNow();
                Statics.field506 = null;
                Statics.field238 = null;
            }
        }
        this.method718();
        this.field1514 = null;
    }

    @ObfuscatedName("dw.as(II)V")
    public final void method2058(int arg0) {
        this.field1527 -= arg0;
        if (this.field1527 < 0) {
            this.field1527 = 0;
        }
        if (this.field1515 != null) {
            this.field1515.method1928(arg0);
        }
    }

    @ObfuscatedName("dw.az([II)V")
    public final void method2063(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2013) {
            var3 = arg1 << 1;
        }
        class204.method3594(arg0, 0, var3);
        this.field1527 -= arg1;
        if (this.field1515 != null && this.field1527 <= 0) {
            this.field1527 += Statics.field1523 >> 4;
            method4137(this.field1515);
            this.method2062(this.field1515, this.field1515.method2141());
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
                        class117 var11 = this.field1528[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class120 var12 = var11.field1602;
                                if (var12 == null || var12.field1635 <= var8) {
                                    var11.field1604 = true;
                                    int var13 = var11.method1925();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1635 += var13;
                                    }
                                    if (var4 >= this.field1516) {
                                        break label105;
                                    }
                                    class117 var14 = var11.method1949();
                                    if (var14 != null) {
                                        int var15 = var11.field1603;
                                        while (var14 != null) {
                                            this.method2062(var14, var15 * var14.method2141() >> 8);
                                            var14 = var11.method1922();
                                        }
                                    }
                                    class117 var16 = var11.field1601;
                                    var11.field1601 = null;
                                    if (var10 == null) {
                                        this.field1528[var7] = var16;
                                    } else {
                                        var10.field1601 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1518[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1601;
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
                class117 var18 = this.field1528[var17];
                class117[] var19 = this.field1528;
                this.field1518[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class117 var21 = var18.field1601;
                    var18.field1601 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1527 < 0) {
            this.field1527 = 0;
        }
        if (this.field1515 != null) {
            this.field1515.method1926(arg0, 0, arg1);
        }
        this.field1517 = class196.method3211();
    }

    @ObfuscatedName("iu.ax(Ldn;B)V")
    public static final void method4137(class117 arg0) {
        arg0.field1604 = false;
        if (arg0.field1602 != null) {
            arg0.field1602.field1635 = 0;
        }
        for (class117 var1 = arg0.method1949(); var1 != null; var1 = arg0.method1922()) {
            method4137(var1);
        }
    }

    @ObfuscatedName("dw.ad(Ldn;II)V")
    public final void method2062(class117 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class117 var4 = this.field1518[var3];
        if (var4 == null) {
            this.field1528[var3] = arg0;
        } else {
            var4.field1601 = arg0;
        }
        this.field1518[var3] = arg0;
        arg0.field1603 = arg1;
    }

    @ObfuscatedName("dw.b(I)V")
    public void method730() throws Exception {
    }

    @ObfuscatedName("dw.q(IB)V")
    public void method715(int arg0) throws Exception {
    }

    @ObfuscatedName("dw.o(I)I")
    public int method716() throws Exception {
        return this.field1511;
    }

    @ObfuscatedName("dw.p()V")
    public void method735() throws Exception {
    }

    @ObfuscatedName("dw.a(I)V")
    public void method718() {
    }

    @ObfuscatedName("dw.h(S)V")
    public void method719() throws Exception {
    }
}
