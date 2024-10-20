package deob;

@ObfuscatedName("ej")
public class class127 {

    @ObfuscatedName("ej.at")
    public final int field1478;

    @ObfuscatedName("ej.an")
    public class127 field1471;

    @ObfuscatedName("ej.av")
    public float[][] field1472;

    @ObfuscatedName("ej.as")
    public final class439[] field1480;

    @ObfuscatedName("ej.ax")
    public class439[] field1474;

    @ObfuscatedName("ej.ap")
    public class439[] field1475;

    @ObfuscatedName("ej.ab")
    public class439 field1476 = new class439();

    @ObfuscatedName("ej.ak")
    public boolean field1485 = true;

    @ObfuscatedName("ej.ae")
    public class439 field1483 = new class439();

    @ObfuscatedName("ej.af")
    public boolean field1479 = true;

    @ObfuscatedName("ej.ao")
    public class439 field1477 = new class439();

    @ObfuscatedName("ej.aa")
    public float[][] field1484;

    @ObfuscatedName("ej.aj")
    public float[][] field1482;

    @ObfuscatedName("ej.ad")
    public float[][] field1473;

    public class127(int arg0, class501 arg1, boolean arg2) {
        this.field1478 = arg1.method8268();
        this.field1480 = new class439[arg0];
        this.field1474 = new class439[this.field1480.length];
        this.field1475 = new class439[this.field1480.length];
        this.field1472 = new float[this.field1480.length][3];
        for (int var4 = 0; var4 < this.field1480.length; var4++) {
            this.field1480[var4] = new class439(arg1, arg2);
            this.field1472[var4][0] = arg1.method8136();
            this.field1472[var4][1] = arg1.method8136();
            this.field1472[var4][2] = arg1.method8136();
        }
        this.method2811();
    }

    @ObfuscatedName("ej.at(I)V")
    public void method2811() {
        this.field1484 = new float[this.field1480.length][3];
        this.field1482 = new float[this.field1480.length][3];
        this.field1473 = new float[this.field1480.length][3];
        class439 var1 = class439.method6899();
        for (int var2 = 0; var2 < this.field1480.length; var2++) {
            class439 var3 = this.method2778(var2);
            var1.method7398(var3);
            var1.method7441();
            this.field1484[var2] = var1.method7399();
            this.field1482[var2][0] = var3.field4686[12];
            this.field1482[var2][1] = var3.field4686[13];
            this.field1482[var2][2] = var3.field4686[14];
            this.field1473[var2] = var3.method7418();
        }
        var1.method7421();
    }

    @ObfuscatedName("ej.an(IB)Lqp;")
    public class439 method2778(int arg0) {
        return this.field1480[arg0];
    }

    @ObfuscatedName("ej.av(II)Lqp;")
    public class439 method2779(int arg0) {
        if (this.field1474[arg0] == null) {
            this.field1474[arg0] = new class439(this.method2778(arg0));
            if (this.field1471 == null) {
                this.field1474[arg0].method7406(class439.field4687);
            } else {
                this.field1474[arg0].method7406(this.field1471.method2779(arg0));
            }
        }
        return this.field1474[arg0];
    }

    @ObfuscatedName("ej.as(IB)Lqp;")
    public class439 method2780(int arg0) {
        if (this.field1475[arg0] == null) {
            this.field1475[arg0] = new class439(this.method2779(arg0));
            this.field1475[arg0].method7441();
        }
        return this.field1475[arg0];
    }

    @ObfuscatedName("ej.ax(Lqp;I)V")
    public void method2795(class439 arg0) {
        this.field1476.method7398(arg0);
        this.field1485 = true;
        this.field1479 = true;
    }

    @ObfuscatedName("ej.ap(I)Lqp;")
    public class439 method2801() {
        return this.field1476;
    }

    @ObfuscatedName("ej.ab(I)Lqp;")
    public class439 method2783() {
        if (this.field1485) {
            this.field1483.method7398(this.method2801());
            if (this.field1471 != null) {
                this.field1483.method7406(this.field1471.method2783());
            }
            this.field1485 = false;
        }
        return this.field1483;
    }

    @ObfuscatedName("ej.ak(II)Lqp;")
    public class439 method2784(int arg0) {
        if (this.field1479) {
            this.field1477.method7398(this.method2780(arg0));
            this.field1477.method7406(this.method2783());
            this.field1479 = false;
        }
        return this.field1477;
    }

    @ObfuscatedName("ej.ae(II)[F")
    public float[] method2785(int arg0) {
        return this.field1484[arg0];
    }

    @ObfuscatedName("ej.af(IB)[F")
    public float[] method2786(int arg0) {
        return this.field1482[arg0];
    }

    @ObfuscatedName("ej.ao(II)[F")
    public float[] method2787(int arg0) {
        return this.field1473[arg0];
    }
}
