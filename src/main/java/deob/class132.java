package deob;

@ObfuscatedName("fm")
public class class132 {

    @ObfuscatedName("fm.az")
    public boolean field1559;

    @ObfuscatedName("fm.ah")
    public boolean field1560;

    @ObfuscatedName("fm.af")
    public class130 field1574;

    @ObfuscatedName("fm.at")
    public class130 field1562;

    @ObfuscatedName("fm.an")
    public class127[] field1563;

    @ObfuscatedName("fm.ao")
    public boolean field1564;

    @ObfuscatedName("fm.ab")
    public float field1561;

    @ObfuscatedName("fm.aw")
    public float field1566;

    @ObfuscatedName("fm.ad")
    public float field1582;

    @ObfuscatedName("fm.al")
    public float field1581;

    @ObfuscatedName("fm.as")
    public float field1565;

    @ObfuscatedName("fm.ag")
    public float field1570;

    @ObfuscatedName("fm.ai")
    public float field1578;

    @ObfuscatedName("fm.ax")
    public float field1572;

    @ObfuscatedName("fm.ar")
    public float field1573;

    @ObfuscatedName("fm.aj")
    public float field1571;

    @ObfuscatedName("fm.au")
    public boolean field1575 = true;

    @ObfuscatedName("fm.ay")
    public int field1576 = 0;

    @ObfuscatedName("fm.ap")
    public float[] field1577;

    @ObfuscatedName("fm.av")
    public int field1580;

    @ObfuscatedName("fm.aa")
    public int field1579;

    @ObfuscatedName("fm.aq")
    public float field1568;

    @ObfuscatedName("fm.am")
    public float field1569;

    @ObfuscatedName("fm.az(Lur;IB)I")
    public int method2880(class535 arg0, int arg1) {
        int var3 = arg0.method8670();
        class140.method2931(arg0.method8462());
        int var4 = arg0.method8462();
        class130 var5 = (class130) class393.method3484(class130.method1070(), var4);
        if (var5 == null) {
            var5 = class130.field1549;
        }
        this.field1574 = var5;
        int var7 = arg0.method8462();
        class130 var8 = (class130) class393.method3484(class130.method1070(), var7);
        if (var8 == null) {
            var8 = class130.field1549;
        }
        this.field1562 = var8;
        this.field1559 = arg0.method8462() != 0;
        this.field1563 = new class127[var3];
        class127 var10 = null;
        for (int var11 = 0; var11 < var3; var11++) {
            class127 var12 = new class127();
            var12.method2811(arg0, arg1);
            this.field1563[var11] = var12;
            if (var10 != null) {
                var10.field1516 = var12;
            }
            var10 = var12;
        }
        return var3;
    }

    @ObfuscatedName("fm.ah(I)V")
    public void method2881() {
        this.field1580 = this.field1563[0].field1513;
        this.field1579 = this.field1563[this.method2883() - 1].field1513;
        this.field1577 = new float[this.method2885() + 1];
        for (int var1 = this.method2896(); var1 <= this.method2879(); var1++) {
            this.field1577[var1 - this.method2896()] = class128.method6807(this, (float) var1);
        }
        this.field1563 = null;
        this.field1568 = class128.method6807(this, (float) (this.method2896() - 1));
        this.field1569 = class128.method6807(this, (float) (this.method2879() + 1));
    }

    @ObfuscatedName("fm.af(II)F")
    public float method2888(int arg0) {
        if (arg0 < this.method2896()) {
            return this.field1568;
        } else if (arg0 > this.method2879()) {
            return this.field1569;
        } else {
            return this.field1577[arg0 - this.method2896()];
        }
    }

    @ObfuscatedName("fm.at(I)I")
    public int method2896() {
        return this.field1580;
    }

    @ObfuscatedName("fm.an(B)I")
    public int method2879() {
        return this.field1579;
    }

    @ObfuscatedName("fm.ao(I)I")
    public int method2885() {
        return this.method2879() - this.method2896();
    }

    @ObfuscatedName("fm.ab(FB)I")
    public int method2899(float arg0) {
        if (this.field1576 >= 0 && ((float) this.field1563[this.field1576].field1513 <= arg0) && this.field1563[this.field1576].field1516 == null || ((float) this.field1563[this.field1576].field1516.field1513 > arg0)) {
            return this.field1576;
        } else if ((arg0 < (float) this.method2896()) || (arg0 > (float) this.method2879())) {
            return -1;
        } else {
            int var2 = this.method2883();
            int var3 = this.field1576;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1563[var6].field1513) {
                        if (arg0 > (float) this.field1563[var6 - 1].field1513) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1563[var6].field1513)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1563[var6 + 1].field1513) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1576 != var3) {
                this.field1576 = var3;
                this.field1575 = true;
            }
            return this.field1576;
        }
    }

    @ObfuscatedName("fm.aw(FB)Leg;")
    public class127 method2898(float arg0) {
        int var2 = this.method2899(arg0);
        return var2 >= 0 && var2 < this.field1563.length ? this.field1563[var2] : null;
    }

    @ObfuscatedName("fm.ad(B)I")
    public int method2883() {
        return this.field1563 == null ? 0 : this.field1563.length;
    }
}
