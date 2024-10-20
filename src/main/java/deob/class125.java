package deob;

@ObfuscatedName("ek")
public class class125 {

    @ObfuscatedName("ek.aj")
    public final int field1466;

    @ObfuscatedName("ek.al")
    public class125 field1475;

    @ObfuscatedName("ek.ac")
    public float[][] field1482;

    @ObfuscatedName("ek.ab")
    public final class422[] field1468;

    @ObfuscatedName("ek.an")
    public class422[] field1469;

    @ObfuscatedName("ek.ao")
    public class422[] field1470;

    @ObfuscatedName("ek.av")
    public class422 field1471 = new class422();

    @ObfuscatedName("ek.aq")
    public boolean field1465 = true;

    @ObfuscatedName("ek.ap")
    public class422 field1473 = new class422();

    @ObfuscatedName("ek.ar")
    public boolean field1474 = true;

    @ObfuscatedName("ek.ak")
    public class422 field1467 = new class422();

    @ObfuscatedName("ek.ax")
    public float[][] field1476;

    @ObfuscatedName("ek.as")
    public float[][] field1477;

    @ObfuscatedName("ek.ay")
    public float[][] field1478;

    public class125(int arg0, class478 arg1, boolean arg2) {
        this.field1466 = arg1.method7882();
        this.field1468 = new class422[arg0];
        this.field1469 = new class422[this.field1468.length];
        this.field1470 = new class422[this.field1468.length];
        this.field1482 = new float[this.field1468.length][3];
        for (int var4 = 0; var4 < this.field1468.length; var4++) {
            this.field1468[var4] = new class422(arg1, arg2);
            this.field1482[var4][0] = arg1.method7910();
            this.field1482[var4][1] = arg1.method7910();
            this.field1482[var4][2] = arg1.method7910();
        }
        this.method2793();
    }

    @ObfuscatedName("ek.aj(I)V")
    public void method2793() {
        this.field1476 = new float[this.field1468.length][3];
        this.field1477 = new float[this.field1468.length][3];
        this.field1478 = new float[this.field1468.length][3];
        class422[] var1 = class422.field4612;
        class422 var2;
        synchronized (class422.field4612) {
            if (class422.field4611 == 0) {
                var2 = new class422();
            } else {
                class422.field4612[--class422.field4611].method7195();
                var2 = class422.field4612[class422.field4611];
            }
        }
        class422 var4 = var2;
        for (int var5 = 0; var5 < this.field1468.length; var5++) {
            class422 var6 = this.method2794(var5);
            var4.method7189(var6);
            var4.method7194();
            this.field1476[var5] = var4.method7197();
            this.field1477[var5][0] = var6.field4609[12];
            this.field1477[var5][1] = var6.field4609[13];
            this.field1477[var5][2] = var6.field4609[14];
            this.field1478[var5] = var6.method7196();
        }
        var4.method7227();
    }

    @ObfuscatedName("ek.al(IB)Lqt;")
    public class422 method2794(int arg0) {
        return this.field1468[arg0];
    }

    @ObfuscatedName("ek.ac(II)Lqt;")
    public class422 method2795(int arg0) {
        if (this.field1469[arg0] == null) {
            this.field1469[arg0] = new class422(this.method2794(arg0));
            if (this.field1475 == null) {
                this.field1469[arg0].method7190(class422.field4613);
            } else {
                this.field1469[arg0].method7190(this.field1475.method2795(arg0));
            }
        }
        return this.field1469[arg0];
    }

    @ObfuscatedName("ek.ab(IB)Lqt;")
    public class422 method2796(int arg0) {
        if (this.field1470[arg0] == null) {
            this.field1470[arg0] = new class422(this.method2795(arg0));
            this.field1470[arg0].method7194();
        }
        return this.field1470[arg0];
    }

    @ObfuscatedName("ek.an(Lqt;I)V")
    public void method2810(class422 arg0) {
        this.field1471.method7189(arg0);
        this.field1465 = true;
        this.field1474 = true;
    }

    @ObfuscatedName("ek.ao(B)Lqt;")
    public class422 method2792() {
        return this.field1471;
    }

    @ObfuscatedName("ek.av(I)Lqt;")
    public class422 method2799() {
        if (this.field1465) {
            this.field1473.method7189(this.method2792());
            if (this.field1475 != null) {
                this.field1473.method7190(this.field1475.method2799());
            }
            this.field1465 = false;
        }
        return this.field1473;
    }

    @ObfuscatedName("ek.aq(II)Lqt;")
    public class422 method2800(int arg0) {
        if (this.field1474) {
            this.field1467.method7189(this.method2796(arg0));
            this.field1467.method7190(this.method2799());
            this.field1474 = false;
        }
        return this.field1467;
    }

    @ObfuscatedName("ek.ap(II)[F")
    public float[] method2801(int arg0) {
        return this.field1476[arg0];
    }

    @ObfuscatedName("ek.ar(II)[F")
    public float[] method2802(int arg0) {
        return this.field1477[arg0];
    }

    @ObfuscatedName("ek.ak(IB)[F")
    public float[] method2803(int arg0) {
        return this.field1478[arg0];
    }
}
