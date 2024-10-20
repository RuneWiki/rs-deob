package deob;

@ObfuscatedName("dc")
public class class116 {

    @ObfuscatedName("dc.c")
    public final int field1449;

    @ObfuscatedName("dc.v")
    public class116 field1441;

    @ObfuscatedName("dc.q")
    public float[][] field1436;

    @ObfuscatedName("dc.f")
    public final class388[] field1434;

    @ObfuscatedName("dc.j")
    public class388[] field1438;

    @ObfuscatedName("dc.e")
    public class388[] field1439;

    @ObfuscatedName("dc.g")
    public class388 field1450 = new class388();

    @ObfuscatedName("dc.w")
    public boolean field1442 = true;

    @ObfuscatedName("dc.y")
    public class388 field1435 = new class388();

    @ObfuscatedName("dc.i")
    public boolean field1443 = true;

    @ObfuscatedName("dc.s")
    public class388 field1444 = new class388();

    @ObfuscatedName("dc.t")
    public float[][] field1445;

    @ObfuscatedName("dc.z")
    public float[][] field1440;

    @ObfuscatedName("dc.r")
    public float[][] field1447;

    public class116(int arg0, class443 arg1, boolean arg2) {
        this.field1449 = arg1.method7216();
        this.field1434 = new class388[arg0];
        this.field1438 = new class388[this.field1434.length];
        this.field1439 = new class388[this.field1434.length];
        this.field1436 = new float[this.field1434.length][3];
        for (int var4 = 0; var4 < this.field1434.length; var4++) {
            this.field1434[var4] = new class388(arg1, arg2);
            this.field1436[var4][0] = arg1.method7054();
            this.field1436[var4][1] = arg1.method7054();
            this.field1436[var4][2] = arg1.method7054();
        }
        this.method2527();
    }

    @ObfuscatedName("dc.c(I)V")
    public void method2527() {
        this.field1445 = new float[this.field1434.length][3];
        this.field1440 = new float[this.field1434.length][3];
        this.field1447 = new float[this.field1434.length][3];
        class388 var1 = class388.method1795();
        for (int var2 = 0; var2 < this.field1434.length; var2++) {
            class388 var3 = this.method2528(var2);
            var1.method6345(var3);
            var1.method6342();
            this.field1445[var2] = var1.method6331();
            this.field1440[var2][0] = var3.field4395[12];
            this.field1440[var2][1] = var3.field4395[13];
            this.field1440[var2][2] = var3.field4395[14];
            this.field1447[var2] = var3.method6364();
        }
        var1.method6340();
    }

    @ObfuscatedName("dc.v(II)Lny;")
    public class388 method2528(int arg0) {
        return this.field1434[arg0];
    }

    @ObfuscatedName("dc.q(II)Lny;")
    public class388 method2533(int arg0) {
        if (this.field1438[arg0] == null) {
            this.field1438[arg0] = new class388(this.method2528(arg0));
            if (this.field1441 == null) {
                this.field1438[arg0].method6334(class388.field4398);
            } else {
                this.field1438[arg0].method6334(this.field1441.method2533(arg0));
            }
        }
        return this.field1438[arg0];
    }

    @ObfuscatedName("dc.f(IS)Lny;")
    public class388 method2530(int arg0) {
        if (this.field1439[arg0] == null) {
            this.field1439[arg0] = new class388(this.method2533(arg0));
            this.field1439[arg0].method6342();
        }
        return this.field1439[arg0];
    }

    @ObfuscatedName("dc.j(Lny;I)V")
    public void method2531(class388 arg0) {
        this.field1450.method6345(arg0);
        this.field1442 = true;
        this.field1443 = true;
    }

    @ObfuscatedName("dc.e(I)Lny;")
    public class388 method2532() {
        return this.field1450;
    }

    @ObfuscatedName("dc.g(I)Lny;")
    public class388 method2556() {
        if (this.field1442) {
            this.field1435.method6345(this.method2532());
            if (this.field1441 != null) {
                this.field1435.method6334(this.field1441.method2556());
            }
            this.field1442 = false;
        }
        return this.field1435;
    }

    @ObfuscatedName("dc.w(II)Lny;")
    public class388 method2526(int arg0) {
        if (this.field1443) {
            this.field1444.method6345(this.method2530(arg0));
            this.field1444.method6334(this.method2556());
            this.field1443 = false;
        }
        return this.field1444;
    }

    @ObfuscatedName("dc.y(IS)[F")
    public float[] method2535(int arg0) {
        return this.field1445[arg0];
    }

    @ObfuscatedName("dc.i(II)[F")
    public float[] method2536(int arg0) {
        return this.field1440[arg0];
    }

    @ObfuscatedName("dc.s(II)[F")
    public float[] method2554(int arg0) {
        return this.field1447[arg0];
    }
}
