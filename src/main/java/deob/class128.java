package deob;

@ObfuscatedName("ew")
public class class128 {

    @ObfuscatedName("ew.aj")
    public boolean field1509;

    @ObfuscatedName("ew.al")
    public boolean field1499;

    @ObfuscatedName("ew.ac")
    public class126 field1500;

    @ObfuscatedName("ew.ab")
    public class126 field1513;

    @ObfuscatedName("ew.an")
    public class123[] field1502;

    @ObfuscatedName("ew.ao")
    public boolean field1520;

    @ObfuscatedName("ew.av")
    public float field1506;

    @ObfuscatedName("ew.aq")
    public float field1505;

    @ObfuscatedName("ew.ap")
    public float field1522;

    @ObfuscatedName("ew.ar")
    public float field1507;

    @ObfuscatedName("ew.ak")
    public float field1508;

    @ObfuscatedName("ew.ax")
    public float field1501;

    @ObfuscatedName("ew.as")
    public float field1510;

    @ObfuscatedName("ew.ay")
    public float field1511;

    @ObfuscatedName("ew.am")
    public float field1512;

    @ObfuscatedName("ew.az")
    public float field1521;

    @ObfuscatedName("ew.ae")
    public boolean field1514 = true;

    @ObfuscatedName("ew.au")
    public int field1504 = 0;

    @ObfuscatedName("ew.ag")
    public float[] field1516;

    @ObfuscatedName("ew.at")
    public int field1517;

    @ObfuscatedName("ew.af")
    public int field1518;

    @ObfuscatedName("ew.ai")
    public float field1519;

    @ObfuscatedName("ew.aw")
    public float field1515;

    @ObfuscatedName("ew.aj(Lsy;IB)I")
    public int method2835(class478 arg0, int arg1) {
        int var3 = arg0.method7905();
        class136.method3047(arg0.method7909());
        this.field1500 = class126.method1130(arg0.method7909());
        this.field1513 = class126.method1130(arg0.method7909());
        this.field1509 = arg0.method7909() != 0;
        this.field1502 = new class123[var3];
        class123 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class123 var6 = new class123();
            var6.method2758(arg0, arg1);
            this.field1502[var5] = var6;
            if (var4 != null) {
                var4.field1452 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("ew.al(B)V")
    public void method2858() {
        this.field1517 = this.field1502[0].field1456;
        this.field1518 = this.field1502[this.method2843() - 1].field1456;
        this.field1516 = new float[this.method2840() + 1];
        for (int var1 = this.method2846(); var1 <= this.method2839(); var1++) {
            this.field1516[var1 - this.method2846()] = class124.method2522(this, (float) var1);
        }
        this.field1502 = null;
        this.field1519 = class124.method2522(this, (float) (this.method2846() - 1));
        this.field1515 = class124.method2522(this, (float) (this.method2839() + 1));
    }

    @ObfuscatedName("ew.ac(II)F")
    public float method2837(int arg0) {
        if (arg0 < this.method2846()) {
            return this.field1519;
        } else if (arg0 > this.method2839()) {
            return this.field1515;
        } else {
            return this.field1516[arg0 - this.method2846()];
        }
    }

    @ObfuscatedName("ew.ab(B)I")
    public int method2846() {
        return this.field1517;
    }

    @ObfuscatedName("ew.an(I)I")
    public int method2839() {
        return this.field1518;
    }

    @ObfuscatedName("ew.ao(I)I")
    public int method2840() {
        return this.method2839() - this.method2846();
    }

    @ObfuscatedName("ew.av(FI)I")
    public int method2860(float arg0) {
        if (this.field1504 >= 0 && ((float) this.field1502[this.field1504].field1456 <= arg0) && this.field1502[this.field1504].field1452 == null || ((float) this.field1502[this.field1504].field1452.field1456 > arg0)) {
            return this.field1504;
        } else if ((arg0 < (float) this.method2846()) || (arg0 > (float) this.method2839())) {
            return -1;
        } else {
            int var2 = this.method2843();
            int var3 = this.field1504;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1502[var6].field1456) {
                        if (arg0 > (float) this.field1502[var6 - 1].field1456) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1502[var6].field1456)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1502[var6 + 1].field1456) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1504 != var3) {
                this.field1504 = var3;
                this.field1514 = true;
            }
            return this.field1504;
        }
    }

    @ObfuscatedName("ew.aq(FI)Leq;")
    public class123 method2841(float arg0) {
        int var2 = this.method2860(arg0);
        return var2 >= 0 && var2 < this.field1502.length ? this.field1502[var2] : null;
    }

    @ObfuscatedName("ew.ap(B)I")
    public int method2843() {
        return this.field1502 == null ? 0 : this.field1502.length;
    }
}
