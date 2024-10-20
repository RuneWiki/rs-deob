package deob;

@ObfuscatedName("ez")
public class class129 {

    @ObfuscatedName("ez.am")
    public final int field1495;

    @ObfuscatedName("ez.ap")
    public class129 field1496;

    @ObfuscatedName("ez.af")
    public float[][] field1497;

    @ObfuscatedName("ez.aj")
    public final class467[] field1507;

    @ObfuscatedName("ez.aq")
    public class467[] field1499;

    @ObfuscatedName("ez.ar")
    public class467[] field1501;

    @ObfuscatedName("ez.ag")
    public class467 field1500 = new class467();

    @ObfuscatedName("ez.ao")
    public boolean field1502 = true;

    @ObfuscatedName("ez.ae")
    public class467 field1503 = new class467();

    @ObfuscatedName("ez.aa")
    public boolean field1498 = true;

    @ObfuscatedName("ez.au")
    public class467 field1505 = new class467();

    @ObfuscatedName("ez.an")
    public float[][] field1506;

    @ObfuscatedName("ez.ad")
    public float[][] field1504;

    @ObfuscatedName("ez.ax")
    public float[][] field1508;

    public class129(int arg0, class531 arg1, boolean arg2) {
        this.field1495 = arg1.method8564();
        this.field1507 = new class467[arg0];
        this.field1499 = new class467[this.field1507.length];
        this.field1501 = new class467[this.field1507.length];
        this.field1497 = new float[this.field1507.length][3];
        for (int var4 = 0; var4 < this.field1507.length; var4++) {
            this.field1507[var4] = new class467(arg1, arg2);
            this.field1497[var4][0] = arg1.method8568();
            this.field1497[var4][1] = arg1.method8568();
            this.field1497[var4][2] = arg1.method8568();
        }
        this.method2941();
    }

    @ObfuscatedName("ez.am(I)V")
    public void method2941() {
        this.field1506 = new float[this.field1507.length][3];
        this.field1504 = new float[this.field1507.length][3];
        this.field1508 = new float[this.field1507.length][3];
        class467 var1 = class467.method4584();
        for (int var2 = 0; var2 < this.field1507.length; var2++) {
            class467 var3 = this.method2908(var2);
            var1.method7805(var3);
            var1.method7813();
            this.field1506[var2] = var1.method7799();
            this.field1504[var2][0] = var3.field4810[12];
            this.field1504[var2][1] = var3.field4810[13];
            this.field1504[var2][2] = var3.field4810[14];
            this.field1508[var2] = var3.method7817();
        }
        var1.method7816();
    }

    @ObfuscatedName("ez.ap(II)Lrh;")
    public class467 method2908(int arg0) {
        return this.field1507[arg0];
    }

    @ObfuscatedName("ez.af(II)Lrh;")
    public class467 method2914(int arg0) {
        if (this.field1499[arg0] == null) {
            this.field1499[arg0] = new class467(this.method2908(arg0));
            if (this.field1496 == null) {
                this.field1499[arg0].method7809(class467.field4808);
            } else {
                this.field1499[arg0].method7809(this.field1496.method2914(arg0));
            }
        }
        return this.field1499[arg0];
    }

    @ObfuscatedName("ez.aj(II)Lrh;")
    public class467 method2906(int arg0) {
        if (this.field1501[arg0] == null) {
            this.field1501[arg0] = new class467(this.method2914(arg0));
            this.field1501[arg0].method7813();
        }
        return this.field1501[arg0];
    }

    @ObfuscatedName("ez.aq(Lrh;I)V")
    public void method2929(class467 arg0) {
        this.field1500.method7805(arg0);
        this.field1502 = true;
        this.field1498 = true;
    }

    @ObfuscatedName("ez.ar(I)Lrh;")
    public class467 method2938() {
        return this.field1500;
    }

    @ObfuscatedName("ez.ag(B)Lrh;")
    public class467 method2912() {
        if (this.field1502) {
            this.field1503.method7805(this.method2938());
            if (this.field1496 != null) {
                this.field1503.method7809(this.field1496.method2912());
            }
            this.field1502 = false;
        }
        return this.field1503;
    }

    @ObfuscatedName("ez.ao(II)Lrh;")
    public class467 method2913(int arg0) {
        if (this.field1498) {
            this.field1505.method7805(this.method2906(arg0));
            this.field1505.method7809(this.method2912());
            this.field1498 = false;
        }
        return this.field1505;
    }

    @ObfuscatedName("ez.ae(II)[F")
    public float[] method2927(int arg0) {
        return this.field1506[arg0];
    }

    @ObfuscatedName("ez.aa(IB)[F")
    public float[] method2930(int arg0) {
        return this.field1504[arg0];
    }

    @ObfuscatedName("ez.au(IB)[F")
    public float[] method2916(int arg0) {
        return this.field1508[arg0];
    }
}
