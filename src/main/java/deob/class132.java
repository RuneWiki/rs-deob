package deob;

@ObfuscatedName("fm")
public class class132 {

    @ObfuscatedName("fm.ab")
    public final int field1540;

    @ObfuscatedName("fm.ay")
    public class132 field1526;

    @ObfuscatedName("fm.an")
    public float[][] field1525;

    @ObfuscatedName("fm.au")
    public final class426[] field1528;

    @ObfuscatedName("fm.ax")
    public class426[] field1536;

    @ObfuscatedName("fm.ao")
    public class426[] field1530;

    @ObfuscatedName("fm.am")
    public class426 field1531 = new class426();

    @ObfuscatedName("fm.ac")
    public boolean field1527 = true;

    @ObfuscatedName("fm.ae")
    public class426 field1533 = new class426();

    @ObfuscatedName("fm.ad")
    public boolean field1534 = true;

    @ObfuscatedName("fm.aq")
    public class426 field1535 = new class426();

    @ObfuscatedName("fm.al")
    public float[][] field1532;

    @ObfuscatedName("fm.aj")
    public float[][] field1529;

    @ObfuscatedName("fm.as")
    public float[][] field1537;

    public class132(int arg0, class549 arg1, boolean arg2) {
        this.field1540 = arg1.method8919();
        this.field1528 = new class426[arg0];
        this.field1536 = new class426[this.field1528.length];
        this.field1530 = new class426[this.field1528.length];
        this.field1525 = new float[this.field1528.length][3];
        for (int var4 = 0; var4 < this.field1528.length; var4++) {
            this.field1528[var4] = new class426(arg1, arg2);
            this.field1525[var4][0] = arg1.method8805();
            this.field1525[var4][1] = arg1.method8805();
            this.field1525[var4][2] = arg1.method8805();
        }
        this.method2999();
    }

    @ObfuscatedName("fm.ab(I)V")
    public void method2999() {
        this.field1532 = new float[this.field1528.length][3];
        this.field1529 = new float[this.field1528.length][3];
        this.field1537 = new float[this.field1528.length][3];
        class426[] var1 = class426.field4685;
        class426 var2;
        synchronized (class426.field4685) {
            if (class426.field4684 == 0) {
                var2 = new class426();
            } else {
                class426.field4685[--class426.field4684].method7237();
                var2 = class426.field4685[class426.field4684];
            }
        }
        class426 var4 = var2;
        for (int var5 = 0; var5 < this.field1528.length; var5++) {
            class426 var6 = this.method3030(var5);
            var4.method7241(var6);
            var4.method7250();
            this.field1532[var5] = var4.method7269();
            this.field1529[var5][0] = var6.field4687[12];
            this.field1529[var5][1] = var6.field4687[13];
            this.field1529[var5][2] = var6.field4687[14];
            this.field1537[var5] = var6.method7256();
        }
        var4.method7275();
    }

    @ObfuscatedName("fm.ay(II)Lqy;")
    public class426 method3030(int arg0) {
        return this.field1528[arg0];
    }

    @ObfuscatedName("fm.an(II)Lqy;")
    public class426 method3020(int arg0) {
        if (this.field1536[arg0] == null) {
            this.field1536[arg0] = new class426(this.method3030(arg0));
            if (this.field1526 == null) {
                this.field1536[arg0].method7263(class426.field4688);
            } else {
                this.field1536[arg0].method7263(this.field1526.method3020(arg0));
            }
        }
        return this.field1536[arg0];
    }

    @ObfuscatedName("fm.au(II)Lqy;")
    public class426 method3002(int arg0) {
        if (this.field1530[arg0] == null) {
            this.field1530[arg0] = new class426(this.method3020(arg0));
            this.field1530[arg0].method7250();
        }
        return this.field1530[arg0];
    }

    @ObfuscatedName("fm.ax(Lqy;B)V")
    public void method3018(class426 arg0) {
        this.field1531.method7241(arg0);
        this.field1527 = true;
        this.field1534 = true;
    }

    @ObfuscatedName("fm.ao(I)Lqy;")
    public class426 method3034() {
        return this.field1531;
    }

    @ObfuscatedName("fm.am(I)Lqy;")
    public class426 method3005() {
        if (this.field1527) {
            this.field1533.method7241(this.method3034());
            if (this.field1526 != null) {
                this.field1533.method7263(this.field1526.method3005());
            }
            this.field1527 = false;
        }
        return this.field1533;
    }

    @ObfuscatedName("fm.ac(II)Lqy;")
    public class426 method3006(int arg0) {
        if (this.field1534) {
            this.field1535.method7241(this.method3002(arg0));
            this.field1535.method7263(this.method3005());
            this.field1534 = false;
        }
        return this.field1535;
    }

    @ObfuscatedName("fm.ae(II)[F")
    public float[] method3007(int arg0) {
        return this.field1532[arg0];
    }

    @ObfuscatedName("fm.ad(IB)[F")
    public float[] method3001(int arg0) {
        return this.field1529[arg0];
    }

    @ObfuscatedName("fm.aq(II)[F")
    public float[] method3009(int arg0) {
        return this.field1537[arg0];
    }
}
