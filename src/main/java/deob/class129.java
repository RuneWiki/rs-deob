package deob;

@ObfuscatedName("ej")
public class class129 {

    @ObfuscatedName("ej.at")
    public final int field1508;

    @ObfuscatedName("ej.ah")
    public class129 field1498;

    @ObfuscatedName("ej.ar")
    public float[][] field1505;

    @ObfuscatedName("ej.ao")
    public final class463[] field1500;

    @ObfuscatedName("ej.ab")
    public class463[] field1501;

    @ObfuscatedName("ej.au")
    public class463[] field1502;

    @ObfuscatedName("ej.aa")
    public class463 field1503 = new class463();

    @ObfuscatedName("ej.ac")
    public boolean field1504 = true;

    @ObfuscatedName("ej.al")
    public class463 field1499 = new class463();

    @ObfuscatedName("ej.az")
    public boolean field1506 = true;

    @ObfuscatedName("ej.ap")
    public class463 field1509 = new class463();

    @ObfuscatedName("ej.av")
    public float[][] field1510;

    @ObfuscatedName("ej.ax")
    public float[][] field1507;

    @ObfuscatedName("ej.as")
    public float[][] field1497;

    public class129(int arg0, class527 arg1, boolean arg2) {
        this.field1508 = arg1.method8508();
        this.field1500 = new class463[arg0];
        this.field1501 = new class463[this.field1500.length];
        this.field1502 = new class463[this.field1500.length];
        this.field1505 = new float[this.field1500.length][3];
        for (int var4 = 0; var4 < this.field1500.length; var4++) {
            this.field1500[var4] = new class463(arg1, arg2);
            this.field1505[var4][0] = arg1.method8418();
            this.field1505[var4][1] = arg1.method8418();
            this.field1505[var4][2] = arg1.method8418();
        }
        this.method2887();
    }

    @ObfuscatedName("ej.at(B)V")
    public void method2887() {
        this.field1510 = new float[this.field1500.length][3];
        this.field1507 = new float[this.field1500.length][3];
        this.field1497 = new float[this.field1500.length][3];
        class463 var1 = class463.method4469();
        for (int var2 = 0; var2 < this.field1500.length; var2++) {
            class463 var3 = this.method2888(var2);
            var1.method7664(var3);
            var1.method7666();
            this.field1510[var2] = var1.method7667();
            this.field1507[var2][0] = var3.field4773[12];
            this.field1507[var2][1] = var3.field4773[13];
            this.field1507[var2][2] = var3.field4773[14];
            this.field1497[var2] = var3.method7679();
        }
        var1.method7688();
    }

    @ObfuscatedName("ej.ah(II)Lrz;")
    public class463 method2888(int arg0) {
        return this.field1500[arg0];
    }

    @ObfuscatedName("ej.ar(II)Lrz;")
    public class463 method2889(int arg0) {
        if (this.field1501[arg0] == null) {
            this.field1501[arg0] = new class463(this.method2888(arg0));
            if (this.field1498 == null) {
                this.field1501[arg0].method7674(class463.field4770);
            } else {
                this.field1501[arg0].method7674(this.field1498.method2889(arg0));
            }
        }
        return this.field1501[arg0];
    }

    @ObfuscatedName("ej.ao(IS)Lrz;")
    public class463 method2890(int arg0) {
        if (this.field1502[arg0] == null) {
            this.field1502[arg0] = new class463(this.method2889(arg0));
            this.field1502[arg0].method7666();
        }
        return this.field1502[arg0];
    }

    @ObfuscatedName("ej.ab(Lrz;I)V")
    public void method2891(class463 arg0) {
        this.field1503.method7664(arg0);
        this.field1504 = true;
        this.field1506 = true;
    }

    @ObfuscatedName("ej.au(B)Lrz;")
    public class463 method2892() {
        return this.field1503;
    }

    @ObfuscatedName("ej.aa(I)Lrz;")
    public class463 method2898() {
        if (this.field1504) {
            this.field1499.method7664(this.method2892());
            if (this.field1498 != null) {
                this.field1499.method7674(this.field1498.method2898());
            }
            this.field1504 = false;
        }
        return this.field1499;
    }

    @ObfuscatedName("ej.ac(IB)Lrz;")
    public class463 method2902(int arg0) {
        if (this.field1506) {
            this.field1509.method7664(this.method2890(arg0));
            this.field1509.method7674(this.method2898());
            this.field1506 = false;
        }
        return this.field1509;
    }

    @ObfuscatedName("ej.al(II)[F")
    public float[] method2894(int arg0) {
        return this.field1510[arg0];
    }

    @ObfuscatedName("ej.az(II)[F")
    public float[] method2896(int arg0) {
        return this.field1507[arg0];
    }

    @ObfuscatedName("ej.ap(IB)[F")
    public float[] method2897(int arg0) {
        return this.field1497[arg0];
    }
}
