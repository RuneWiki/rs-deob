package deob;

@ObfuscatedName("fm")
public class class131 {

    @ObfuscatedName("fm.aw")
    public boolean field1533;

    @ObfuscatedName("fm.ay")
    public boolean field1534;

    @ObfuscatedName("fm.ar")
    public class129 field1535;

    @ObfuscatedName("fm.am")
    public class129 field1548;

    @ObfuscatedName("fm.as")
    public class126[] field1537;

    @ObfuscatedName("fm.aj")
    public boolean field1544;

    @ObfuscatedName("fm.ag")
    public float field1539;

    @ObfuscatedName("fm.az")
    public float field1536;

    @ObfuscatedName("fm.av")
    public float field1541;

    @ObfuscatedName("fm.ap")
    public float field1542;

    @ObfuscatedName("fm.aq")
    public float field1543;

    @ObfuscatedName("fm.at")
    public float field1551;

    @ObfuscatedName("fm.ah")
    public float field1545;

    @ObfuscatedName("fm.ax")
    public float field1554;

    @ObfuscatedName("fm.aa")
    public float field1547;

    @ObfuscatedName("fm.au")
    public float field1538;

    @ObfuscatedName("fm.ae")
    public boolean field1549 = true;

    @ObfuscatedName("fm.ab")
    public int field1550 = 0;

    @ObfuscatedName("fm.ad")
    public float[] field1546;

    @ObfuscatedName("fm.ao")
    public int field1552;

    @ObfuscatedName("fm.ac")
    public int field1553;

    @ObfuscatedName("fm.ak")
    public float field1540;

    @ObfuscatedName("fm.an")
    public float field1555;

    @ObfuscatedName("fm.aw(Lty;IB)I")
    public int method2856(class514 arg0, int arg1) {
        int var3 = arg0.method8246();
        class139.method2546(arg0.method8244());
        this.field1535 = class129.method1995(arg0.method8244());
        this.field1548 = class129.method1995(arg0.method8244());
        this.field1533 = arg0.method8244() != 0;
        this.field1537 = new class126[var3];
        class126 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class126 var6 = new class126();
            var6.method2789(arg0, arg1);
            this.field1537[var5] = var6;
            if (var4 != null) {
                var4.field1486 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("fm.ay(I)V")
    public void method2857() {
        this.field1552 = this.field1537[0].field1484;
        this.field1553 = this.field1537[this.method2864() - 1].field1484;
        this.field1546 = new float[this.method2861() + 1];
        for (int var1 = this.method2874(); var1 <= this.method2860(); var1++) {
            this.field1546[var1 - this.method2874()] = class127.method1175(this, (float) var1);
        }
        this.field1537 = null;
        this.field1540 = class127.method1175(this, (float) (this.method2874() - 1));
        this.field1555 = class127.method1175(this, (float) (this.method2860() + 1));
    }

    @ObfuscatedName("fm.ar(II)F")
    public float method2858(int arg0) {
        if (arg0 < this.method2874()) {
            return this.field1540;
        } else if (arg0 > this.method2860()) {
            return this.field1555;
        } else {
            return this.field1546[arg0 - this.method2874()];
        }
    }

    @ObfuscatedName("fm.am(B)I")
    public int method2874() {
        return this.field1552;
    }

    @ObfuscatedName("fm.as(I)I")
    public int method2860() {
        return this.field1553;
    }

    @ObfuscatedName("fm.aj(I)I")
    public int method2861() {
        return this.method2860() - this.method2874();
    }

    @ObfuscatedName("fm.ag(FI)I")
    public int method2862(float arg0) {
        if (this.field1550 >= 0 && ((float) this.field1537[this.field1550].field1484 <= arg0) && this.field1537[this.field1550].field1486 == null || ((float) this.field1537[this.field1550].field1486.field1484 > arg0)) {
            return this.field1550;
        } else if ((arg0 < (float) this.method2874()) || (arg0 > (float) this.method2860())) {
            return -1;
        } else {
            int var2 = this.method2864();
            int var3 = this.field1550;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1537[var6].field1484) {
                        if (arg0 > (float) this.field1537[var6 - 1].field1484) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1537[var6].field1484)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1537[var6 + 1].field1484) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1550 != var3) {
                this.field1550 = var3;
                this.field1549 = true;
            }
            return this.field1550;
        }
    }

    @ObfuscatedName("fm.az(FI)Lev;")
    public class126 method2863(float arg0) {
        int var2 = this.method2862(arg0);
        return var2 >= 0 && var2 < this.field1537.length ? this.field1537[var2] : null;
    }

    @ObfuscatedName("fm.av(B)I")
    public int method2864() {
        return this.field1537 == null ? 0 : this.field1537.length;
    }
}
