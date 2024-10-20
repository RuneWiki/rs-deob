package deob;

@ObfuscatedName("fx")
public class class132 {

    @ObfuscatedName("fx.am")
    public boolean field1542;

    @ObfuscatedName("fx.ap")
    public boolean field1528;

    @ObfuscatedName("fx.af")
    public class130 field1540;

    @ObfuscatedName("fx.aj")
    public class130 field1531;

    @ObfuscatedName("fx.aq")
    public class127[] field1546;

    @ObfuscatedName("fx.ar")
    public boolean field1533;

    @ObfuscatedName("fx.ag")
    public float field1534;

    @ObfuscatedName("fx.ao")
    public float field1535;

    @ObfuscatedName("fx.ae")
    public float field1536;

    @ObfuscatedName("fx.aa")
    public float field1541;

    @ObfuscatedName("fx.au")
    public float field1547;

    @ObfuscatedName("fx.an")
    public float field1539;

    @ObfuscatedName("fx.ad")
    public float field1538;

    @ObfuscatedName("fx.ax")
    public float field1532;

    @ObfuscatedName("fx.aw")
    public float field1530;

    @ObfuscatedName("fx.az")
    public float field1543;

    @ObfuscatedName("fx.av")
    public boolean field1544 = true;

    @ObfuscatedName("fx.ak")
    public int field1545 = 0;

    @ObfuscatedName("fx.ay")
    public float[] field1529;

    @ObfuscatedName("fx.as")
    public int field1537;

    @ObfuscatedName("fx.ab")
    public int field1548;

    @ObfuscatedName("fx.ah")
    public float field1549;

    @ObfuscatedName("fx.ai")
    public float field1550;

    @ObfuscatedName("fx.am(Luk;II)I")
    public int method2956(class531 arg0, int arg1) {
        int var3 = arg0.method8775();
        int var4 = arg0.method8561();
        class140 var5 = (class140) class389.method6514(class140.method3235(), var4);
        if (var5 == null) {
            class140 var6 = class140.field1616;
        }
        this.field1540 = class130.method164(arg0.method8561());
        this.field1531 = class130.method164(arg0.method8561());
        this.field1542 = arg0.method8561() != 0;
        this.field1546 = new class127[var3];
        class127 var7 = null;
        for (int var8 = 0; var8 < var3; var8++) {
            class127 var9 = new class127();
            var9.method2885(arg0, arg1);
            this.field1546[var8] = var9;
            if (var7 != null) {
                var7.field1486 = var9;
            }
            var7 = var9;
        }
        return var3;
    }

    @ObfuscatedName("fx.ap(B)V")
    public void method2958() {
        this.field1537 = this.field1546[0].field1484;
        this.field1548 = this.field1546[this.method2961() - 1].field1484;
        this.field1529 = new float[this.method2962() + 1];
        for (int var1 = this.method2984(); var1 <= this.method2985(); var1++) {
            this.field1529[var1 - this.method2984()] = class128.method3188(this, (float) var1);
        }
        this.field1546 = null;
        this.field1549 = class128.method3188(this, (float) (this.method2984() - 1));
        this.field1550 = class128.method3188(this, (float) (this.method2985() + 1));
    }

    @ObfuscatedName("fx.af(II)F")
    public float method2959(int arg0) {
        if (arg0 < this.method2984()) {
            return this.field1549;
        } else if (arg0 > this.method2985()) {
            return this.field1550;
        } else {
            return this.field1529[arg0 - this.method2984()];
        }
    }

    @ObfuscatedName("fx.aj(I)I")
    public int method2984() {
        return this.field1537;
    }

    @ObfuscatedName("fx.aq(I)I")
    public int method2985() {
        return this.field1548;
    }

    @ObfuscatedName("fx.ar(I)I")
    public int method2962() {
        return this.method2985() - this.method2984();
    }

    @ObfuscatedName("fx.ag(FB)I")
    public int method2963(float arg0) {
        if (this.field1545 >= 0 && ((float) this.field1546[this.field1545].field1484 <= arg0) && this.field1546[this.field1545].field1486 == null || ((float) this.field1546[this.field1545].field1486.field1484 > arg0)) {
            return this.field1545;
        } else if ((arg0 < (float) this.method2984()) || (arg0 > (float) this.method2985())) {
            return -1;
        } else {
            int var2 = this.method2961();
            int var3 = this.field1545;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1546[var6].field1484) {
                        if (arg0 > (float) this.field1546[var6 - 1].field1484) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1546[var6].field1484)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1546[var6 + 1].field1484) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1545 != var3) {
                this.field1545 = var3;
                this.field1544 = true;
            }
            return this.field1545;
        }
    }

    @ObfuscatedName("fx.ao(FB)Lei;")
    public class127 method2964(float arg0) {
        int var2 = this.method2963(arg0);
        return var2 >= 0 && var2 < this.field1546.length ? this.field1546[var2] : null;
    }

    @ObfuscatedName("fx.ae(I)I")
    public int method2961() {
        return this.field1546 == null ? 0 : this.field1546.length;
    }
}
