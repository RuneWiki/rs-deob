package deob;

@ObfuscatedName("fh")
public class class131 {

    @ObfuscatedName("fh.au")
    public boolean field1564;

    @ObfuscatedName("fh.ae")
    public boolean field1549;

    @ObfuscatedName("fh.ao")
    public class129 field1550;

    @ObfuscatedName("fh.at")
    public class129 field1572;

    @ObfuscatedName("fh.ac")
    public class126[] field1552;

    @ObfuscatedName("fh.ai")
    public boolean field1551;

    @ObfuscatedName("fh.az")
    public float field1554;

    @ObfuscatedName("fh.ap")
    public float field1555;

    @ObfuscatedName("fh.aa")
    public float field1556;

    @ObfuscatedName("fh.af")
    public float field1557;

    @ObfuscatedName("fh.ad")
    public float field1558;

    @ObfuscatedName("fh.aq")
    public float field1553;

    @ObfuscatedName("fh.al")
    public float field1573;

    @ObfuscatedName("fh.an")
    public float field1561;

    @ObfuscatedName("fh.ar")
    public float field1562;

    @ObfuscatedName("fh.ab")
    public float field1548;

    @ObfuscatedName("fh.ag")
    public boolean field1565 = true;

    @ObfuscatedName("fh.am")
    public int field1563 = 0;

    @ObfuscatedName("fh.ax")
    public float[] field1566;

    @ObfuscatedName("fh.ah")
    public int field1567;

    @ObfuscatedName("fh.as")
    public int field1568;

    @ObfuscatedName("fh.ay")
    public float field1569;

    @ObfuscatedName("fh.aj")
    public float field1559;

    @ObfuscatedName("fh.au(Ltm;IB)I")
    public int method2864(class515 arg0, int arg1) {
        int var3 = arg0.method8448();
        int var4 = arg0.method8300();
        class139[] var5 = new class139[] { class139.field1636, class139.field1634, class139.field1635, class139.field1639, class139.field1637, class139.field1638, class139.field1633, class139.field1640, class139.field1641 };
        class139 var6 = (class139) class373.method371(var5, var4);
        if (var6 == null) {
            class139 var7 = class139.field1641;
        }
        this.field1550 = class129.method2162(arg0.method8300());
        this.field1572 = class129.method2162(arg0.method8300());
        this.field1564 = arg0.method8300() != 0;
        this.field1552 = new class126[var3];
        class126 var8 = null;
        for (int var9 = 0; var9 < var3; var9++) {
            class126 var10 = new class126();
            var10.method2799(arg0, arg1);
            this.field1552[var9] = var10;
            if (var8 != null) {
                var8.field1499 = var10;
            }
            var8 = var10;
        }
        return var3;
    }

    @ObfuscatedName("fh.ae(S)V")
    public void method2865() {
        this.field1567 = this.field1552[0].field1493;
        this.field1568 = this.field1552[this.method2872() - 1].field1493;
        this.field1566 = new float[this.method2896() + 1];
        for (int var1 = this.method2867(); var1 <= this.method2863(); var1++) {
            this.field1566[var1 - this.method2867()] = class127.method4192(this, (float) var1);
        }
        this.field1552 = null;
        this.field1569 = class127.method4192(this, (float) (this.method2867() - 1));
        this.field1559 = class127.method4192(this, (float) (this.method2863() + 1));
    }

    @ObfuscatedName("fh.ao(IB)F")
    public float method2866(int arg0) {
        if (arg0 < this.method2867()) {
            return this.field1569;
        } else if (arg0 > this.method2863()) {
            return this.field1559;
        } else {
            return this.field1566[arg0 - this.method2867()];
        }
    }

    @ObfuscatedName("fh.at(I)I")
    public int method2867() {
        return this.field1567;
    }

    @ObfuscatedName("fh.ac(I)I")
    public int method2863() {
        return this.field1568;
    }

    @ObfuscatedName("fh.ai(I)I")
    public int method2896() {
        return this.method2863() - this.method2867();
    }

    @ObfuscatedName("fh.az(FB)I")
    public int method2891(float arg0) {
        if (this.field1563 >= 0 && ((float) this.field1552[this.field1563].field1493 <= arg0) && this.field1552[this.field1563].field1499 == null || ((float) this.field1552[this.field1563].field1499.field1493 > arg0)) {
            return this.field1563;
        } else if ((arg0 < (float) this.method2867()) || (arg0 > (float) this.method2863())) {
            return -1;
        } else {
            int var2 = this.method2872();
            int var3 = this.field1563;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1552[var6].field1493) {
                        if (arg0 > (float) this.field1552[var6 - 1].field1493) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1552[var6].field1493)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1552[var6 + 1].field1493) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1563 != var3) {
                this.field1563 = var3;
                this.field1565 = true;
            }
            return this.field1563;
        }
    }

    @ObfuscatedName("fh.ap(FI)Leg;")
    public class126 method2871(float arg0) {
        int var2 = this.method2891(arg0);
        return var2 >= 0 && var2 < this.field1552.length ? this.field1552[var2] : null;
    }

    @ObfuscatedName("fh.aa(I)I")
    public int method2872() {
        return this.field1552 == null ? 0 : this.field1552.length;
    }
}
