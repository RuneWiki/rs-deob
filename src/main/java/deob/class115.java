package deob;

import java.io.IOException;

@ObfuscatedName("eq")
public class class115 {

    @ObfuscatedName("eq.ab")
    public class480 field1446;

    @ObfuscatedName("eq.ay")
    public class410 field1457 = new class410();

    @ObfuscatedName("eq.an")
    public int field1447 = 0;

    @ObfuscatedName("eq.au")
    public class549 field1448 = new class549(5000);

    @ObfuscatedName("eq.ax")
    public class566 field1458;

    @ObfuscatedName("eq.ao")
    public class548 field1450 = new class548(40000);

    @ObfuscatedName("eq.am")
    public class325 field1451 = null;

    @ObfuscatedName("eq.ac")
    public int field1452 = 0;

    @ObfuscatedName("eq.ae")
    public boolean field1453 = true;

    @ObfuscatedName("eq.ad")
    public int field1454 = 0;

    @ObfuscatedName("eq.aq")
    public int field1455 = 0;

    @ObfuscatedName("eq.al")
    public class325 field1456;

    @ObfuscatedName("eq.aj")
    public class325 field1449;

    @ObfuscatedName("eq.as")
    public class325 field1445;

    @ObfuscatedName("eq.ab(I)V")
    public final void method2846() {
        this.field1457.method6939();
        this.field1447 = 0;
    }

    @ObfuscatedName("eq.ay(I)V")
    public final void method2828() throws IOException {
        if (this.field1446 == null || this.field1447 <= 0) {
            return;
        }
        this.field1448.field5378 = 0;
        while (true) {
            class324 var1 = (class324) this.field1457.method6951();
            if (var1 == null || var1.field3377 > this.field1448.field5381.length - this.field1448.field5378) {
                this.field1446.method8068(this.field1448.field5381, 0, this.field1448.field5378);
                this.field1455 = 0;
                break;
            }
            this.field1448.method8790(var1.field3379.field5381, 0, var1.field3377);
            this.field1447 -= var1.field3377;
            var1.method8218();
            var1.field3379.method8780();
            var1.method5609();
        }
    }

    @ObfuscatedName("eq.an(Lmf;I)V")
    public final void method2829(class324 arg0) {
        this.field1457.method6940(arg0);
        arg0.field3377 = arg0.field3379.field5378;
        arg0.field3379.field5378 = 0;
        this.field1447 += arg0.field3377;
    }

    @ObfuscatedName("eq.au(Lsx;I)V")
    public void method2830(class480 arg0) {
        this.field1446 = arg0;
    }

    @ObfuscatedName("eq.ax(I)V")
    public void method2831() {
        if (this.field1446 != null) {
            this.field1446.method8069();
            this.field1446 = null;
        }
    }

    @ObfuscatedName("eq.ao(I)V")
    public void method2832() {
        this.field1446 = null;
    }

    @ObfuscatedName("eq.am(I)Lsx;")
    public class480 method2833() {
        return this.field1446;
    }
}
