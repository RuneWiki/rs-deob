package deob;

@ObfuscatedName("ed")
public class class130 {

    @ObfuscatedName("ed.ac")
    public final int field1522;

    @ObfuscatedName("ed.al")
    public class130 field1507;

    @ObfuscatedName("ed.ak")
    public float[][] field1520;

    @ObfuscatedName("ed.ax")
    public final class466[] field1509;

    @ObfuscatedName("ed.ao")
    public class466[] field1510;

    @ObfuscatedName("ed.ah")
    public class466[] field1508;

    @ObfuscatedName("ed.ar")
    public class466 field1511 = new class466();

    @ObfuscatedName("ed.ab")
    public boolean field1506 = true;

    @ObfuscatedName("ed.am")
    public class466 field1514 = new class466();

    @ObfuscatedName("ed.av")
    public boolean field1515 = true;

    @ObfuscatedName("ed.ag")
    public class466 field1516 = new class466();

    @ObfuscatedName("ed.aa")
    public float[][] field1517;

    @ObfuscatedName("ed.ap")
    public float[][] field1518;

    @ObfuscatedName("ed.ay")
    public float[][] field1519;

    public class130(int arg0, class530 arg1, boolean arg2) {
        this.field1522 = arg1.method8368();
        this.field1509 = new class466[arg0];
        this.field1510 = new class466[this.field1509.length];
        this.field1508 = new class466[this.field1509.length];
        this.field1520 = new float[this.field1509.length][3];
        for (int var4 = 0; var4 < this.field1509.length; var4++) {
            this.field1509[var4] = new class466(arg1, arg2);
            this.field1520[var4][0] = arg1.method8373();
            this.field1520[var4][1] = arg1.method8373();
            this.field1520[var4][2] = arg1.method8373();
        }
        this.method2829();
    }

    @ObfuscatedName("ed.ac(B)V")
    public void method2829() {
        this.field1517 = new float[this.field1509.length][3];
        this.field1518 = new float[this.field1509.length][3];
        this.field1519 = new float[this.field1509.length][3];
        class466 var1 = class466.method3619();
        for (int var2 = 0; var2 < this.field1509.length; var2++) {
            class466 var3 = this.method2830(var2);
            var1.method7602(var3);
            var1.method7609();
            this.field1517[var2] = var1.method7599();
            this.field1518[var2][0] = var3.field4786[12];
            this.field1518[var2][1] = var3.field4786[13];
            this.field1518[var2][2] = var3.field4786[14];
            this.field1519[var2] = var3.method7594();
        }
        var1.method7645();
    }

    @ObfuscatedName("ed.al(II)Lrb;")
    public class466 method2830(int arg0) {
        return this.field1509[arg0];
    }

    @ObfuscatedName("ed.ak(II)Lrb;")
    public class466 method2831(int arg0) {
        if (this.field1510[arg0] == null) {
            this.field1510[arg0] = new class466(this.method2830(arg0));
            if (this.field1507 == null) {
                this.field1510[arg0].method7605(class466.field4783);
            } else {
                this.field1510[arg0].method7605(this.field1507.method2831(arg0));
            }
        }
        return this.field1510[arg0];
    }

    @ObfuscatedName("ed.ax(II)Lrb;")
    public class466 method2841(int arg0) {
        if (this.field1508[arg0] == null) {
            this.field1508[arg0] = new class466(this.method2831(arg0));
            this.field1508[arg0].method7609();
        }
        return this.field1508[arg0];
    }

    @ObfuscatedName("ed.ao(Lrb;I)V")
    public void method2853(class466 arg0) {
        this.field1511.method7602(arg0);
        this.field1506 = true;
        this.field1515 = true;
    }

    @ObfuscatedName("ed.ah(B)Lrb;")
    public class466 method2834() {
        return this.field1511;
    }

    @ObfuscatedName("ed.ar(I)Lrb;")
    public class466 method2835() {
        if (this.field1506) {
            this.field1514.method7602(this.method2834());
            if (this.field1507 != null) {
                this.field1514.method7605(this.field1507.method2835());
            }
            this.field1506 = false;
        }
        return this.field1514;
    }

    @ObfuscatedName("ed.ab(II)Lrb;")
    public class466 method2828(int arg0) {
        if (this.field1515) {
            this.field1516.method7602(this.method2841(arg0));
            this.field1516.method7605(this.method2835());
            this.field1515 = false;
        }
        return this.field1516;
    }

    @ObfuscatedName("ed.am(II)[F")
    public float[] method2837(int arg0) {
        return this.field1517[arg0];
    }

    @ObfuscatedName("ed.av(II)[F")
    public float[] method2846(int arg0) {
        return this.field1518[arg0];
    }

    @ObfuscatedName("ed.ag(II)[F")
    public float[] method2839(int arg0) {
        return this.field1519[arg0];
    }
}
