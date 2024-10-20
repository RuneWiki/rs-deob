package deob;

@ObfuscatedName("ew")
public class class123 {

    @ObfuscatedName("ew.af")
    public final int field1482;

    @ObfuscatedName("ew.an")
    public class123 field1479;

    @ObfuscatedName("ew.aw")
    public float[][] field1475;

    @ObfuscatedName("ew.ac")
    public final class426[] field1476;

    @ObfuscatedName("ew.au")
    public class426[] field1477;

    @ObfuscatedName("ew.ab")
    public class426[] field1478;

    @ObfuscatedName("ew.aq")
    public class426 field1486 = new class426();

    @ObfuscatedName("ew.al")
    public boolean field1480 = true;

    @ObfuscatedName("ew.at")
    public class426 field1481 = new class426();

    @ObfuscatedName("ew.aa")
    public boolean field1473 = true;

    @ObfuscatedName("ew.ay")
    public class426 field1483 = new class426();

    @ObfuscatedName("ew.ao")
    public float[][] field1484;

    @ObfuscatedName("ew.ax")
    public float[][] field1474;

    @ObfuscatedName("ew.ai")
    public float[][] field1485;

    public class123(int arg0, class489 arg1, boolean arg2) {
        this.field1482 = arg1.method8445();
        this.field1476 = new class426[arg0];
        this.field1477 = new class426[this.field1476.length];
        this.field1478 = new class426[this.field1476.length];
        this.field1475 = new float[this.field1476.length][3];
        for (int var4 = 0; var4 < this.field1476.length; var4++) {
            this.field1476[var4] = new class426(arg1, arg2);
            this.field1475[var4][0] = arg1.method8256();
            this.field1475[var4][1] = arg1.method8256();
            this.field1475[var4][2] = arg1.method8256();
        }
        this.method2847();
    }

    @ObfuscatedName("ew.af(I)V")
    public void method2847() {
        this.field1484 = new float[this.field1476.length][3];
        this.field1474 = new float[this.field1476.length][3];
        this.field1485 = new float[this.field1476.length][3];
        class426[] var1 = class426.field4666;
        class426 var2;
        synchronized (class426.field4666) {
            if (Statics.field4668 == 0) {
                var2 = new class426();
            } else {
                class426.field4666[--Statics.field4668].method7460();
                var2 = class426.field4666[Statics.field4668];
            }
        }
        class426 var4 = var2;
        for (int var5 = 0; var5 < this.field1476.length; var5++) {
            class426 var6 = this.method2848(var5);
            var4.method7462(var6);
            var4.method7480();
            this.field1484[var5] = var4.method7456();
            this.field1474[var5][0] = var6.field4671[12];
            this.field1474[var5][1] = var6.field4671[13];
            this.field1474[var5][2] = var6.field4671[14];
            this.field1485[var5] = var6.method7507();
        }
        var4.method7459();
    }

    @ObfuscatedName("ew.an(IB)Lqj;")
    public class426 method2848(int arg0) {
        return this.field1476[arg0];
    }

    @ObfuscatedName("ew.aw(IB)Lqj;")
    public class426 method2849(int arg0) {
        if (this.field1477[arg0] == null) {
            this.field1477[arg0] = new class426(this.method2848(arg0));
            if (this.field1479 == null) {
                this.field1477[arg0].method7466(class426.field4665);
            } else {
                this.field1477[arg0].method7466(this.field1479.method2849(arg0));
            }
        }
        return this.field1477[arg0];
    }

    @ObfuscatedName("ew.ac(II)Lqj;")
    public class426 method2861(int arg0) {
        if (this.field1478[arg0] == null) {
            this.field1478[arg0] = new class426(this.method2849(arg0));
            this.field1478[arg0].method7480();
        }
        return this.field1478[arg0];
    }

    @ObfuscatedName("ew.au(Lqj;I)V")
    public void method2863(class426 arg0) {
        this.field1486.method7462(arg0);
        this.field1480 = true;
        this.field1473 = true;
    }

    @ObfuscatedName("ew.ab(I)Lqj;")
    public class426 method2852() {
        return this.field1486;
    }

    @ObfuscatedName("ew.aq(B)Lqj;")
    public class426 method2873() {
        if (this.field1480) {
            this.field1481.method7462(this.method2852());
            if (this.field1479 != null) {
                this.field1481.method7466(this.field1479.method2873());
            }
            this.field1480 = false;
        }
        return this.field1481;
    }

    @ObfuscatedName("ew.al(II)Lqj;")
    public class426 method2851(int arg0) {
        if (this.field1473) {
            this.field1483.method7462(this.method2861(arg0));
            this.field1483.method7466(this.method2873());
            this.field1473 = false;
        }
        return this.field1483;
    }

    @ObfuscatedName("ew.at(II)[F")
    public float[] method2869(int arg0) {
        return this.field1484[arg0];
    }

    @ObfuscatedName("ew.aa(II)[F")
    public float[] method2855(int arg0) {
        return this.field1474[arg0];
    }

    @ObfuscatedName("ew.ay(II)[F")
    public float[] method2856(int arg0) {
        return this.field1485[arg0];
    }
}
