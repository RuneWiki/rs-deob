package deob;

@ObfuscatedName("ek")
public class class126 {

    @ObfuscatedName("ek.af")
    public boolean field1524;

    @ObfuscatedName("ek.an")
    public boolean field1509;

    @ObfuscatedName("ek.aw")
    public class124 field1513;

    @ObfuscatedName("ek.ac")
    public class124 field1529;

    @ObfuscatedName("ek.au")
    public class121[] field1512;

    @ObfuscatedName("ek.ab")
    public boolean field1510;

    @ObfuscatedName("ek.aq")
    public float field1514;

    @ObfuscatedName("ek.al")
    public float field1522;

    @ObfuscatedName("ek.at")
    public float field1516;

    @ObfuscatedName("ek.aa")
    public float field1517;

    @ObfuscatedName("ek.ay")
    public float field1530;

    @ObfuscatedName("ek.ao")
    public float field1519;

    @ObfuscatedName("ek.ax")
    public float field1520;

    @ObfuscatedName("ek.ai")
    public float field1521;

    @ObfuscatedName("ek.ag")
    public float field1518;

    @ObfuscatedName("ek.ah")
    public float field1523;

    @ObfuscatedName("ek.av")
    public boolean field1525 = true;

    @ObfuscatedName("ek.ar")
    public int field1515 = 0;

    @ObfuscatedName("ek.am")
    public float[] field1526;

    @ObfuscatedName("ek.as")
    public int field1527;

    @ObfuscatedName("ek.aj")
    public int field1528;

    @ObfuscatedName("ek.ak")
    public float field1508;

    @ObfuscatedName("ek.az")
    public float field1511;

    @ObfuscatedName("ek.af(Lsg;IB)I")
    public int method2908(class489 arg0, int arg1) {
        int var3 = arg0.method8250();
        class135.method3179(arg0.method8248());
        this.field1513 = Statics.method2302(arg0.method8248());
        this.field1529 = Statics.method2302(arg0.method8248());
        this.field1524 = arg0.method8248() != 0;
        this.field1512 = new class121[var3];
        class121 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class121 var6 = new class121();
            var6.method2826(arg0, arg1);
            this.field1512[var5] = var6;
            if (var4 != null) {
                var4.field1455 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("ek.an(I)V")
    public void method2931() {
        this.field1527 = this.field1512[0].field1453;
        this.field1528 = this.field1512[this.method2916() - 1].field1453;
        this.field1526 = new float[this.method2920() + 1];
        for (int var1 = this.method2911(); var1 <= this.method2933(); var1++) {
            this.field1526[var1 - this.method2911()] = Statics.method6228(this, (float) var1);
        }
        this.field1512 = null;
        this.field1508 = Statics.method6228(this, (float) (this.method2911() - 1));
        this.field1511 = Statics.method6228(this, (float) (this.method2933() + 1));
    }

    @ObfuscatedName("ek.aw(II)F")
    public float method2910(int arg0) {
        if (arg0 < this.method2911()) {
            return this.field1508;
        } else if (arg0 > this.method2933()) {
            return this.field1511;
        } else {
            return this.field1526[arg0 - this.method2911()];
        }
    }

    @ObfuscatedName("ek.ac(I)I")
    public int method2911() {
        return this.field1527;
    }

    @ObfuscatedName("ek.au(I)I")
    public int method2933() {
        return this.field1528;
    }

    @ObfuscatedName("ek.ab(I)I")
    public int method2920() {
        return this.method2933() - this.method2911();
    }

    @ObfuscatedName("ek.aq(FI)I")
    public int method2914(float arg0) {
        if (this.field1515 >= 0 && ((float) this.field1512[this.field1515].field1453 <= arg0) && this.field1512[this.field1515].field1455 == null || ((float) this.field1512[this.field1515].field1455.field1453 > arg0)) {
            return this.field1515;
        } else if ((arg0 < (float) this.method2911()) || (arg0 > (float) this.method2933())) {
            return -1;
        } else {
            int var2 = this.method2916();
            int var3 = this.field1515;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1512[var6].field1453) {
                        if (arg0 > (float) this.field1512[var6 - 1].field1453) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1512[var6].field1453)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1512[var6 + 1].field1453) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1515 != var3) {
                this.field1515 = var3;
                this.field1525 = true;
            }
            return this.field1515;
        }
    }

    @ObfuscatedName("ek.al(FI)Lev;")
    public class121 method2915(float arg0) {
        int var2 = this.method2914(arg0);
        return var2 >= 0 && var2 < this.field1512.length ? this.field1512[var2] : null;
    }

    @ObfuscatedName("ek.at(S)I")
    public int method2916() {
        return this.field1512 == null ? 0 : this.field1512.length;
    }
}
