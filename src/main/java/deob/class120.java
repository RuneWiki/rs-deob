package deob;

import java.util.zip.CRC32;

@ObfuscatedName("dy")
public class class120 extends class86 {

    @ObfuscatedName("dy.z")
    public class32 field1565;

    @ObfuscatedName("dy.o")
    public class32 field1564;

    @ObfuscatedName("dy.c")
    public int field1566;

    @ObfuscatedName("dy.y")
    public volatile boolean field1571 = false;

    @ObfuscatedName("dy.j")
    public boolean field1567 = false;

    @ObfuscatedName("dy.s")
    public volatile boolean[] field1568;

    @ObfuscatedName("dy.p")
    public static CRC32 field1569 = new CRC32();

    @ObfuscatedName("dy.ak")
    public int field1570;

    @ObfuscatedName("dy.ap")
    public int field1563;

    @ObfuscatedName("dy.ai")
    public int field1572 = -1;

    public class120(class32 arg0, class32 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1565 = arg0;
        this.field1564 = arg1;
        this.field1566 = arg2;
        this.field1567 = arg5;
        class87.method862(this, this.field1566);
    }

    @ObfuscatedName("dy.bm(B)I")
    public int method1449() {
        if (this.field1571) {
            return 100;
        } else if (this.field1157 == null) {
            int var1 = Statics.method10(255, this.field1566);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("dy.n(II)V")
    public void method1014(int arg0) {
        int var2 = this.field1566;
        long var3 = (long) ((var2 << 16) + arg0);
        class167 var5 = (class167) class87.field1185.method1259(var3);
        if (var5 != null) {
            class87.field1184.method1236(var5);
        }
    }

    @ObfuscatedName("dy.g(II)V")
    public void method1012(int arg0) {
        if (this.field1565 == null || this.field1568 == null || !this.field1568[arg0]) {
            class87.method539(this, this.field1566, arg0, this.field1160[arg0], (byte) 2, true);
        } else {
            class88.method1482(arg0, this.field1565, this);
        }
    }

    @ObfuscatedName("dy.cl(IIB)V")
    public void method1445(int arg0, int arg1) {
        this.field1570 = arg0;
        this.field1563 = arg1;
        if (this.field1564 == null) {
            class87.method539(this, 255, this.field1566, this.field1570, (byte) 0, true);
        } else {
            class88.method1482(this.field1566, this.field1564, this);
        }
    }

    @ObfuscatedName("dy.cp(I[BZZI)V")
    public void method1455(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field1161[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field1161[arg0];
            if (this.field1565 != null) {
                class32 var12 = this.field1565;
                class139 var13 = new class139();
                var13.field1764 = 0;
                var13.field1500 = (long) arg0;
                var13.field1763 = arg1;
                var13.field1762 = var12;
                class104 var14 = class88.field1201;
                synchronized (class88.field1201) {
                    class88.field1201.method1284(var13);
                }
                Object var16 = class88.field1198;
                synchronized (class88.field1198) {
                    if (class88.field1200 == 0) {
                        Statics.field1519.method420(new class88(), 5);
                    }
                    class88.field1200 = 600;
                }
                this.field1568[arg0] = true;
            }
            if (arg3) {
                this.field1157[arg0] = Statics.method1085(arg1, false);
            }
            return;
        }
        if (this.field1571) {
            throw new RuntimeException();
        }
        if (this.field1564 != null) {
            int var5 = this.field1566;
            class32 var6 = this.field1564;
            class139 var7 = new class139();
            var7.field1764 = 0;
            var7.field1500 = (long) var5;
            var7.field1763 = arg1;
            var7.field1762 = var6;
            class104 var8 = class88.field1201;
            synchronized (class88.field1201) {
                class88.field1201.method1284(var7);
            }
            Object var10 = class88.field1198;
            synchronized (class88.field1198) {
                if (class88.field1200 == 0) {
                    Statics.field1519.method420(new class88(), 5);
                }
                class88.field1200 = 600;
            }
        }
        this.method1044(arg1);
        this.method1446();
    }

    @ObfuscatedName("dy.cb(Lam;I[BZI)V")
    public void method1447(class32 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field1564 != arg0) {
            if (!arg3 && this.field1572 == arg1) {
                this.field1571 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field1568[arg1] = false;
                if (this.field1567 || arg3) {
                    class87.method539(this, this.field1566, arg1, this.field1160[arg1], (byte) 2, arg3);
                }
                return;
            }
            field1569.reset();
            field1569.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field1569.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field1160[arg1] != var9 || this.field1161[arg1] != var10) {
                this.field1568[arg1] = false;
                if (this.field1567 || arg3) {
                    class87.method539(this, this.field1566, arg1, this.field1160[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field1568[arg1] = true;
            if (arg3) {
                this.field1157[arg1] = Statics.method1085(arg2, false);
            }
            return;
        }
        if (this.field1571) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class87.method539(this, 255, this.field1566, this.field1570, (byte) 0, true);
            return;
        }
        field1569.reset();
        field1569.update(arg2, 0, arg2.length);
        int var5 = (int) field1569.getValue();
        class135 var6 = new class135(class86.method111(arg2));
        int var7 = var6.method1571();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method1616();
        }
        if (this.field1570 != var5 || this.field1563 != var8) {
            class87.method539(this, 255, this.field1566, this.field1570, (byte) 0, true);
            return;
        }
        this.method1044(arg2);
        this.method1446();
    }

    @ObfuscatedName("dy.cd(I)V")
    public void method1446() {
        this.field1568 = new boolean[this.field1157.length];
        for (int var1 = 0; var1 < this.field1568.length; var1++) {
            this.field1568[var1] = false;
        }
        if (this.field1565 == null) {
            this.field1571 = true;
            return;
        }
        this.field1572 = -1;
        for (int var2 = 0; var2 < this.field1568.length; var2++) {
            if (this.field1156[var2] > 0) {
                class32 var3 = this.field1565;
                class139 var5 = new class139();
                var5.field1764 = 1;
                var5.field1500 = (long) var2;
                var5.field1762 = var3;
                var5.field1765 = this;
                class104 var6 = class88.field1201;
                synchronized (class88.field1201) {
                    class88.field1201.method1284(var5);
                }
                Object var8 = class88.field1198;
                synchronized (class88.field1198) {
                    if (class88.field1200 == 0) {
                        Statics.field1519.method420(new class88(), 5);
                    }
                    class88.field1200 = 600;
                }
                this.field1572 = var2;
            }
        }
        if (this.field1572 == -1) {
            this.field1571 = true;
        }
    }

    @ObfuscatedName("dy.cj(II)I")
    public int method1454(int arg0) {
        if (this.field1157[arg0] == null) {
            return this.field1568[arg0] ? 100 : Statics.method10(this.field1566, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("dy.cz(I)I")
    public int method1448() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1157.length; var3++) {
            if (this.field1156[var3] > 0) {
                var1 += 100;
                var2 += this.method1454(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
