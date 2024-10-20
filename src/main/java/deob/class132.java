package deob;

@ObfuscatedName("fm")
public class class132 {

    @ObfuscatedName("fm.at")
    public boolean field1533;

    @ObfuscatedName("fm.ah")
    public boolean field1528;

    @ObfuscatedName("fm.ar")
    public class130 field1536;

    @ObfuscatedName("fm.ao")
    public class130 field1530;

    @ObfuscatedName("fm.ab")
    public class127[] field1531;

    @ObfuscatedName("fm.au")
    public boolean field1532;

    @ObfuscatedName("fm.aa")
    public float field1539;

    @ObfuscatedName("fm.ac")
    public float field1534;

    @ObfuscatedName("fm.al")
    public float field1535;

    @ObfuscatedName("fm.az")
    public float field1549;

    @ObfuscatedName("fm.ap")
    public float field1527;

    @ObfuscatedName("fm.av")
    public float field1538;

    @ObfuscatedName("fm.ax")
    public float field1547;

    @ObfuscatedName("fm.as")
    public float field1540;

    @ObfuscatedName("fm.ay")
    public float field1541;

    @ObfuscatedName("fm.ak")
    public float field1529;

    @ObfuscatedName("fm.aj")
    public boolean field1543 = true;

    @ObfuscatedName("fm.am")
    public int field1544 = 0;

    @ObfuscatedName("fm.aq")
    public float[] field1545;

    @ObfuscatedName("fm.ai")
    public int field1546;

    @ObfuscatedName("fm.aw")
    public int field1542;

    @ObfuscatedName("fm.ae")
    public float field1548;

    @ObfuscatedName("fm.an")
    public float field1537;

    @ObfuscatedName("fm.at(Luj;II)I")
    public int method2973(class527 arg0, int arg1) {
        int var3 = arg0.method8412();
        class141.method5339(arg0.method8410());
        this.field1536 = class130.method2029(arg0.method8410());
        this.field1530 = class130.method2029(arg0.method8410());
        this.field1533 = arg0.method8410() != 0;
        this.field1531 = new class127[var3];
        class127 var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class127 var6 = new class127();
            var6.method2870(arg0, arg1);
            this.field1531[var5] = var6;
            if (var4 != null) {
                var4.field1480 = var6;
            }
            var4 = var6;
        }
        return var3;
    }

    @ObfuscatedName("fm.ah(I)V")
    public void method2962() {
        this.field1546 = this.field1531[0].field1478;
        this.field1542 = this.field1531[this.method2951() - 1].field1478;
        this.field1545 = new float[this.method2948() + 1];
        for (int var1 = this.method2961(); var1 <= this.method2954(); var1++) {
            this.field1545[var1 - this.method2961()] = class128.method6828(this, (float) var1);
        }
        this.field1531 = null;
        this.field1548 = class128.method6828(this, (float) (this.method2961() - 1));
        this.field1537 = class128.method6828(this, (float) (this.method2954() + 1));
    }

    @ObfuscatedName("fm.ar(II)F")
    public float method2945(int arg0) {
        if (arg0 < this.method2961()) {
            return this.field1548;
        } else if (arg0 > this.method2954()) {
            return this.field1537;
        } else {
            return this.field1545[arg0 - this.method2961()];
        }
    }

    @ObfuscatedName("fm.ao(I)I")
    public int method2961() {
        return this.field1546;
    }

    @ObfuscatedName("fm.ab(B)I")
    public int method2954() {
        return this.field1542;
    }

    @ObfuscatedName("fm.au(B)I")
    public int method2948() {
        return this.method2954() - this.method2961();
    }

    @ObfuscatedName("fm.aa(FI)I")
    public int method2943(float arg0) {
        if (this.field1544 >= 0 && ((float) this.field1531[this.field1544].field1478 <= arg0) && this.field1531[this.field1544].field1480 == null || ((float) this.field1531[this.field1544].field1480.field1478 > arg0)) {
            return this.field1544;
        } else if ((arg0 < (float) this.method2961()) || (arg0 > (float) this.method2954())) {
            return -1;
        } else {
            int var2 = this.method2951();
            int var3 = this.field1544;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1531[var6].field1478) {
                        if (arg0 > (float) this.field1531[var6 - 1].field1478) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1531[var6].field1478)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1531[var6 + 1].field1478) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1544 != var3) {
                this.field1544 = var3;
                this.field1543 = true;
            }
            return this.field1544;
        }
    }

    @ObfuscatedName("fm.ac(FI)Leq;")
    public class127 method2950(float arg0) {
        int var2 = this.method2943(arg0);
        return var2 >= 0 && var2 < this.field1531.length ? this.field1531[var2] : null;
    }

    @ObfuscatedName("fm.al(I)I")
    public int method2951() {
        return this.field1531 == null ? 0 : this.field1531.length;
    }
}
