package deob;

import java.util.zip.CRC32;

@ObfuscatedName("dc")
public class class121 extends class87 {

    @ObfuscatedName("dc.g")
    public class33 field1579;

    @ObfuscatedName("dc.p")
    public class33 field1583;

    @ObfuscatedName("dc.z")
    public int field1580;

    @ObfuscatedName("dc.n")
    public volatile boolean field1585 = false;

    @ObfuscatedName("dc.x")
    public boolean field1581 = false;

    @ObfuscatedName("dc.i")
    public volatile boolean[] field1582;

    @ObfuscatedName("dc.m")
    public static CRC32 field1578 = new CRC32();

    @ObfuscatedName("dc.ai")
    public int field1584;

    @ObfuscatedName("dc.aa")
    public int field1577;

    @ObfuscatedName("dc.af")
    public int field1586 = -1;

    public class121(class33 arg0, class33 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1579 = arg0;
        this.field1583 = arg1;
        this.field1580 = arg2;
        this.field1581 = arg5;
        int var8 = this.field1580;
        if (Statics.field219 == null) {
            class88.method242((class121) null, 255, 255, 0, (byte) 0, true);
            class88.field1205[var8] = this;
        } else {
            Statics.field219.field1722 = var8 * 8 + 5;
            int var9 = Statics.field219.method1607();
            int var10 = Statics.field219.method1607();
            this.method1456(var9, var10);
        }
    }

    @ObfuscatedName("dc.br(B)I")
    public int method1453() {
        if (this.field1585) {
            return 100;
        } else if (this.field1180 == null) {
            int var1 = Statics.method1476(255, this.field1580);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("dc.l(IB)V")
    public void method1068(int arg0) {
        int var2 = this.field1580;
        long var3 = (long) ((var2 << 16) + arg0);
        class168 var5 = (class168) class88.field1196.method1290(var3);
        if (var5 != null) {
            class88.field1195.method1262(var5);
        }
    }

    @ObfuscatedName("dc.v(II)V")
    public void method1080(int arg0) {
        if (this.field1579 == null || this.field1582 == null || !this.field1582[arg0]) {
            class88.method242(this, this.field1580, arg0, this.field1174[arg0], (byte) 2, true);
            return;
        }
        class33 var2 = this.field1579;
        byte[] var4 = null;
        class105 var5 = class89.field1213;
        synchronized (class89.field1213) {
            for (class140 var6 = (class140) class89.field1213.method1298(); var6 != null; var6 = (class140) class89.field1213.method1299()) {
                if ((long) arg0 == var6.field1513 && var6.field1762 == var2 && var6.field1764 == 0) {
                    var4 = var6.field1763;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method387(arg0);
            this.method1467(var2, arg0, var8, true);
        } else {
            this.method1467(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("dc.ba(III)V")
    public void method1456(int arg0, int arg1) {
        this.field1584 = arg0;
        this.field1577 = arg1;
        if (this.field1583 == null) {
            class88.method242(this, 255, this.field1580, this.field1584, (byte) 0, true);
            return;
        }
        int var3 = this.field1580;
        class33 var4 = this.field1583;
        byte[] var6 = null;
        class105 var7 = class89.field1213;
        synchronized (class89.field1213) {
            for (class140 var8 = (class140) class89.field1213.method1298(); var8 != null; var8 = (class140) class89.field1213.method1299()) {
                if ((long) var3 == var8.field1513 && var8.field1762 == var4 && var8.field1764 == 0) {
                    var6 = var8.field1763;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method387(var3);
            this.method1467(var4, var3, var10, true);
        } else {
            this.method1467(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("dc.bl(I[BZZI)V")
    public void method1459(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field1585) {
                throw new RuntimeException();
            }
            if (this.field1583 != null) {
                class89.method429(this.field1580, arg1, this.field1583);
            }
            this.method1018(arg1);
            this.method1457();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field1175[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field1175[arg0];
        if (this.field1579 != null) {
            class89.method429(arg0, arg1, this.field1579);
            this.field1582[arg0] = true;
        }
        if (arg3) {
            this.field1180[arg0] = class62.method698(arg1, false);
        }
    }

    @ObfuscatedName("dc.bo(Lar;I[BZB)V")
    public void method1467(class33 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field1583 != arg0) {
            if (!arg3 && this.field1586 == arg1) {
                this.field1585 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field1582[arg1] = false;
                if (this.field1581 || arg3) {
                    class88.method242(this, this.field1580, arg1, this.field1174[arg1], (byte) 2, arg3);
                }
                return;
            }
            field1578.reset();
            field1578.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field1578.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field1174[arg1] != var9 || this.field1175[arg1] != var10) {
                this.field1582[arg1] = false;
                if (this.field1581 || arg3) {
                    class88.method242(this, this.field1580, arg1, this.field1174[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field1582[arg1] = true;
            if (arg3) {
                this.field1180[arg1] = class62.method698(arg2, false);
            }
            return;
        }
        if (this.field1585) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class88.method242(this, 255, this.field1580, this.field1584, (byte) 0, true);
            return;
        }
        field1578.reset();
        field1578.update(arg2, 0, arg2.length);
        int var5 = (int) field1578.getValue();
        class136 var6 = new class136(class87.method1007(arg2));
        int var7 = var6.method1602();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method1607();
        }
        if (this.field1584 != var5 || this.field1577 != var8) {
            class88.method242(this, 255, this.field1580, this.field1584, (byte) 0, true);
            return;
        }
        this.method1018(arg2);
        this.method1457();
    }

    @ObfuscatedName("dc.bh(I)V")
    public void method1457() {
        this.field1582 = new boolean[this.field1180.length];
        for (int var1 = 0; var1 < this.field1582.length; var1++) {
            this.field1582[var1] = false;
        }
        if (this.field1579 == null) {
            this.field1585 = true;
            return;
        }
        this.field1586 = -1;
        for (int var2 = 0; var2 < this.field1582.length; var2++) {
            if (this.field1176[var2] > 0) {
                class89.method521(var2, this.field1579, this);
                this.field1586 = var2;
            }
        }
        if (this.field1586 == -1) {
            this.field1585 = true;
        }
    }

    @ObfuscatedName("dc.cr(II)I")
    public int method1458(int arg0) {
        if (this.field1180[arg0] == null) {
            return this.field1582[arg0] ? 100 : Statics.method1476(this.field1580, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("dc.ch(I)I")
    public int method1454() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1180.length; var3++) {
            if (this.field1176[var3] > 0) {
                var1 += 100;
                var2 += this.method1458(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
