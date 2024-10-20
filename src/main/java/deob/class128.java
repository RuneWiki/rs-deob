package deob;

@ObfuscatedName("eo")
public class class128 {

    @ObfuscatedName("eo.au")
    public final int field1516;

    @ObfuscatedName("eo.ae")
    public class128 field1526;

    @ObfuscatedName("eo.ao")
    public float[][] field1517;

    @ObfuscatedName("eo.at")
    public final class451[] field1518;

    @ObfuscatedName("eo.ac")
    public class451[] field1519;

    @ObfuscatedName("eo.ai")
    public class451[] field1520;

    @ObfuscatedName("eo.az")
    public class451 field1521 = new class451();

    @ObfuscatedName("eo.ap")
    public boolean field1524 = true;

    @ObfuscatedName("eo.aa")
    public class451 field1523 = new class451();

    @ObfuscatedName("eo.af")
    public boolean field1528 = true;

    @ObfuscatedName("eo.ad")
    public class451 field1515 = new class451();

    @ObfuscatedName("eo.aq")
    public float[][] field1525;

    @ObfuscatedName("eo.al")
    public float[][] field1522;

    @ObfuscatedName("eo.an")
    public float[][] field1527;

    public class128(int arg0, class515 arg1, boolean arg2) {
        this.field1516 = arg1.method8303();
        this.field1518 = new class451[arg0];
        this.field1519 = new class451[this.field1518.length];
        this.field1520 = new class451[this.field1518.length];
        this.field1517 = new float[this.field1518.length][3];
        for (int var4 = 0; var4 < this.field1518.length; var4++) {
            this.field1518[var4] = new class451(arg1, arg2);
            this.field1517[var4][0] = arg1.method8308();
            this.field1517[var4][1] = arg1.method8308();
            this.field1517[var4][2] = arg1.method8308();
        }
        this.method2819();
    }

    @ObfuscatedName("eo.au(I)V")
    public void method2819() {
        this.field1525 = new float[this.field1518.length][3];
        this.field1522 = new float[this.field1518.length][3];
        this.field1527 = new float[this.field1518.length][3];
        class451[] var1 = class451.field4738;
        class451 var2;
        synchronized (class451.field4738) {
            if (Statics.field4779 == 0) {
                var2 = new class451();
            } else {
                class451.field4738[--Statics.field4779].method7522();
                var2 = class451.field4738[Statics.field4779];
            }
        }
        class451 var4 = var2;
        for (int var5 = 0; var5 < this.field1518.length; var5++) {
            class451 var6 = this.method2850(var5);
            var4.method7549(var6);
            var4.method7582();
            this.field1525[var5] = var4.method7521();
            this.field1522[var5][0] = var6.field4740[12];
            this.field1522[var5][1] = var6.field4740[13];
            this.field1522[var5][2] = var6.field4740[14];
            this.field1527[var5] = var6.method7533();
        }
        var4.method7563();
    }

    @ObfuscatedName("eo.ae(IB)Lrz;")
    public class451 method2850(int arg0) {
        return this.field1518[arg0];
    }

    @ObfuscatedName("eo.ao(IS)Lrz;")
    public class451 method2821(int arg0) {
        if (this.field1519[arg0] == null) {
            this.field1519[arg0] = new class451(this.method2850(arg0));
            if (this.field1526 == null) {
                this.field1519[arg0].method7565(class451.field4741);
            } else {
                this.field1519[arg0].method7565(this.field1526.method2821(arg0));
            }
        }
        return this.field1519[arg0];
    }

    @ObfuscatedName("eo.at(II)Lrz;")
    public class451 method2840(int arg0) {
        if (this.field1520[arg0] == null) {
            this.field1520[arg0] = new class451(this.method2821(arg0));
            this.field1520[arg0].method7582();
        }
        return this.field1520[arg0];
    }

    @ObfuscatedName("eo.ac(Lrz;I)V")
    public void method2822(class451 arg0) {
        this.field1521.method7549(arg0);
        this.field1524 = true;
        this.field1528 = true;
    }

    @ObfuscatedName("eo.ai(B)Lrz;")
    public class451 method2824() {
        return this.field1521;
    }

    @ObfuscatedName("eo.az(I)Lrz;")
    public class451 method2825() {
        if (this.field1524) {
            this.field1523.method7549(this.method2824());
            if (this.field1526 != null) {
                this.field1523.method7565(this.field1526.method2825());
            }
            this.field1524 = false;
        }
        return this.field1523;
    }

    @ObfuscatedName("eo.ap(II)Lrz;")
    public class451 method2820(int arg0) {
        if (this.field1528) {
            this.field1515.method7549(this.method2840(arg0));
            this.field1515.method7565(this.method2825());
            this.field1528 = false;
        }
        return this.field1515;
    }

    @ObfuscatedName("eo.aa(II)[F")
    public float[] method2827(int arg0) {
        return this.field1525[arg0];
    }

    @ObfuscatedName("eo.af(IB)[F")
    public float[] method2828(int arg0) {
        return this.field1522[arg0];
    }

    @ObfuscatedName("eo.ad(II)[F")
    public float[] method2829(int arg0) {
        return this.field1527[arg0];
    }
}
