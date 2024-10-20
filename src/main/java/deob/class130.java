package deob;

@ObfuscatedName("eq")
public class class130 {

    @ObfuscatedName("eq.at")
    public boolean field1517;

    @ObfuscatedName("eq.an")
    public boolean field1506;

    @ObfuscatedName("eq.av")
    public class128 field1507;

    @ObfuscatedName("eq.as")
    public class128 field1508;

    @ObfuscatedName("eq.ax")
    public class125[] field1511;

    @ObfuscatedName("eq.ap")
    public boolean field1509;

    @ObfuscatedName("eq.ab")
    public float field1520;

    @ObfuscatedName("eq.ak")
    public float field1512;

    @ObfuscatedName("eq.ae")
    public float field1523;

    @ObfuscatedName("eq.af")
    public float field1505;

    @ObfuscatedName("eq.ao")
    public float field1515;

    @ObfuscatedName("eq.aa")
    public float field1516;

    @ObfuscatedName("eq.aj")
    public float field1510;

    @ObfuscatedName("eq.ad")
    public float field1513;

    @ObfuscatedName("eq.ac")
    public float field1519;

    @ObfuscatedName("eq.ag")
    public float field1528;

    @ObfuscatedName("eq.ar")
    public boolean field1521 = true;

    @ObfuscatedName("eq.ah")
    public int field1522 = 0;

    @ObfuscatedName("eq.az")
    public float[] field1518;

    @ObfuscatedName("eq.au")
    public int field1524;

    @ObfuscatedName("eq.ai")
    public int field1525;

    @ObfuscatedName("eq.aq")
    public float field1526;

    @ObfuscatedName("eq.aw")
    public float field1527;

    @ObfuscatedName("eq.at(Ltz;II)I")
    public int method2826(class501 arg0, int arg1) {
        int var3 = arg0.method8195();
        class138.method2721(arg0.method8129());
        this.field1507 = class128.method2170(arg0.method8129());
        this.field1508 = class128.method2170(arg0.method8129());
        this.field1517 = arg0.method8129() != 0;
        this.field1511 = new class125[var3];
        class125 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class125 var6 = new class125();
            var6.method2757(arg0, arg1);
            this.field1511[var5] = var6;
            if (var4 != null) {
                var4.field1461 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("eq.an(I)V")
    public void method2836() {
        this.field1524 = this.field1511[0].field1458;
        this.field1525 = this.field1511[this.method2831() - 1].field1458;
        this.field1518 = new float[this.method2835() + 1];
        for (int var1 = this.method2824(); var1 <= this.method2850(); var1++) {
            this.field1518[var1 - this.method2824()] = class126.method2852(this, (float) var1);
        }
        this.field1511 = null;
        this.field1526 = class126.method2852(this, (float) (this.method2824() - 1));
        this.field1527 = class126.method2852(this, (float) (this.method2850() + 1));
    }

    @ObfuscatedName("eq.av(II)F")
    public float method2825(int arg0) {
        if (arg0 < this.method2824()) {
            return this.field1526;
        } else if (arg0 > this.method2850()) {
            return this.field1527;
        } else {
            return this.field1518[arg0 - this.method2824()];
        }
    }

    @ObfuscatedName("eq.as(B)I")
    public int method2824() {
        return this.field1524;
    }

    @ObfuscatedName("eq.ax(I)I")
    public int method2850() {
        return this.field1525;
    }

    @ObfuscatedName("eq.ap(B)I")
    public int method2835() {
        return this.method2850() - this.method2824();
    }

    @ObfuscatedName("eq.ab(FI)I")
    public int method2829(float arg0) {
        if (this.field1522 >= 0 && ((float) this.field1511[this.field1522].field1458 <= arg0) && this.field1511[this.field1522].field1461 == null || ((float) this.field1511[this.field1522].field1461.field1458 > arg0)) {
            return this.field1522;
        } else if ((arg0 < (float) this.method2824()) || (arg0 > (float) this.method2850())) {
            return -1;
        } else {
            int var2 = this.method2831();
            int var3 = this.field1522;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1511[var6].field1458) {
                        if (arg0 > (float) this.field1511[var6 - 1].field1458) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1511[var6].field1458)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1511[var6 + 1].field1458) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1522 != var3) {
                this.field1522 = var3;
                this.field1521 = true;
            }
            return this.field1522;
        }
    }

    @ObfuscatedName("eq.ak(FB)Lex;")
    public class125 method2830(float arg0) {
        int var2 = this.method2829(arg0);
        return var2 >= 0 && var2 < this.field1511.length ? this.field1511[var2] : null;
    }

    @ObfuscatedName("eq.ae(I)I")
    public int method2831() {
        return this.field1511 == null ? 0 : this.field1511.length;
    }
}
