package deob;

@ObfuscatedName("ez")
public class class130 {

    @ObfuscatedName("ez.aq")
    public final int field1529;

    @ObfuscatedName("ez.aw")
    public class130 field1523;

    @ObfuscatedName("ez.al")
    public float[][] field1524;

    @ObfuscatedName("ez.ai")
    public final class470[] field1525;

    @ObfuscatedName("ez.ar")
    public class470[] field1526;

    @ObfuscatedName("ez.as")
    public class470[] field1527;

    @ObfuscatedName("ez.aa")
    public class470 field1528 = new class470();

    @ObfuscatedName("ez.az")
    public boolean field1534 = true;

    @ObfuscatedName("ez.ao")
    public class470 field1530 = new class470();

    @ObfuscatedName("ez.au")
    public boolean field1531 = true;

    @ObfuscatedName("ez.ak")
    public class470 field1532 = new class470();

    @ObfuscatedName("ez.ah")
    public float[][] field1536;

    @ObfuscatedName("ez.aj")
    public float[][] field1522;

    @ObfuscatedName("ez.af")
    public float[][] field1535;

    public class130(int arg0, class534 arg1, boolean arg2) {
        this.field1529 = arg1.method8594();
        this.field1525 = new class470[arg0];
        this.field1526 = new class470[this.field1525.length];
        this.field1527 = new class470[this.field1525.length];
        this.field1524 = new float[this.field1525.length][3];
        for (int var4 = 0; var4 < this.field1525.length; var4++) {
            this.field1525[var4] = new class470(arg1, arg2);
            this.field1524[var4][0] = arg1.method8599();
            this.field1524[var4][1] = arg1.method8599();
            this.field1524[var4][2] = arg1.method8599();
        }
        this.method2879();
    }

    @ObfuscatedName("ez.aq(S)V")
    public void method2879() {
        this.field1536 = new float[this.field1525.length][3];
        this.field1522 = new float[this.field1525.length][3];
        this.field1535 = new float[this.field1525.length][3];
        class470 var1 = class470.method2825();
        for (int var2 = 0; var2 < this.field1525.length; var2++) {
            class470 var3 = this.method2902(var2);
            var1.method7822(var3);
            var1.method7878();
            this.field1536[var2] = var1.method7827();
            this.field1522[var2][0] = var3.field4844[12];
            this.field1522[var2][1] = var3.field4844[13];
            this.field1522[var2][2] = var3.field4844[14];
            this.field1535[var2] = var3.method7816();
        }
        var1.method7841();
    }

    @ObfuscatedName("ez.aw(II)Lsr;")
    public class470 method2902(int arg0) {
        return this.field1525[arg0];
    }

    @ObfuscatedName("ez.al(II)Lsr;")
    public class470 method2880(int arg0) {
        if (this.field1526[arg0] == null) {
            this.field1526[arg0] = new class470(this.method2902(arg0));
            if (this.field1523 == null) {
                this.field1526[arg0].method7826(class470.field4845);
            } else {
                this.field1526[arg0].method7826(this.field1523.method2880(arg0));
            }
        }
        return this.field1526[arg0];
    }

    @ObfuscatedName("ez.ai(II)Lsr;")
    public class470 method2908(int arg0) {
        if (this.field1527[arg0] == null) {
            this.field1527[arg0] = new class470(this.method2880(arg0));
            this.field1527[arg0].method7878();
        }
        return this.field1527[arg0];
    }

    @ObfuscatedName("ez.ar(Lsr;I)V")
    public void method2883(class470 arg0) {
        this.field1528.method7822(arg0);
        this.field1534 = true;
        this.field1531 = true;
    }

    @ObfuscatedName("ez.as(B)Lsr;")
    public class470 method2912() {
        return this.field1528;
    }

    @ObfuscatedName("ez.aa(I)Lsr;")
    public class470 method2884() {
        if (this.field1534) {
            this.field1530.method7822(this.method2912());
            if (this.field1523 != null) {
                this.field1530.method7826(this.field1523.method2884());
            }
            this.field1534 = false;
        }
        return this.field1530;
    }

    @ObfuscatedName("ez.az(IB)Lsr;")
    public class470 method2916(int arg0) {
        if (this.field1531) {
            this.field1532.method7822(this.method2908(arg0));
            this.field1532.method7826(this.method2884());
            this.field1531 = false;
        }
        return this.field1532;
    }

    @ObfuscatedName("ez.ao(II)[F")
    public float[] method2917(int arg0) {
        return this.field1536[arg0];
    }

    @ObfuscatedName("ez.au(II)[F")
    public float[] method2887(int arg0) {
        return this.field1522[arg0];
    }

    @ObfuscatedName("ez.ak(IB)[F")
    public float[] method2919(int arg0) {
        return this.field1535[arg0];
    }
}
