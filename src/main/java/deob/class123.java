package deob;

@ObfuscatedName("dc")
public class class123 {

    @ObfuscatedName("dc.f")
    public final int field1492;

    @ObfuscatedName("dc.w")
    public class123 field1501;

    @ObfuscatedName("dc.v")
    public float[][] field1489;

    @ObfuscatedName("dc.s")
    public final class418[] field1490;

    @ObfuscatedName("dc.z")
    public class418[] field1491;

    @ObfuscatedName("dc.j")
    public class418[] field1496;

    @ObfuscatedName("dc.i")
    public class418 field1497 = new class418();

    @ObfuscatedName("dc.n")
    public boolean field1494 = true;

    @ObfuscatedName("dc.l")
    public class418 field1495 = new class418();

    @ObfuscatedName("dc.k")
    public boolean field1487 = true;

    @ObfuscatedName("dc.c")
    public class418 field1488 = new class418();

    @ObfuscatedName("dc.r")
    public float[][] field1498;

    @ObfuscatedName("dc.b")
    public float[][] field1499;

    @ObfuscatedName("dc.m")
    public float[][] field1493;

    public class123(int arg0, class474 arg1, boolean arg2) {
        this.field1492 = arg1.method7967();
        this.field1490 = new class418[arg0];
        this.field1491 = new class418[this.field1490.length];
        this.field1496 = new class418[this.field1490.length];
        this.field1489 = new float[this.field1490.length][3];
        for (int var4 = 0; var4 < this.field1490.length; var4++) {
            this.field1490[var4] = new class418(arg1, arg2);
            this.field1489[var4][0] = arg1.method8084();
            this.field1489[var4][1] = arg1.method8084();
            this.field1489[var4][2] = arg1.method8084();
        }
        this.method2873();
    }

    @ObfuscatedName("dc.f(I)V")
    public void method2873() {
        this.field1498 = new float[this.field1490.length][3];
        this.field1499 = new float[this.field1490.length][3];
        this.field1493 = new float[this.field1490.length][3];
        class418[] var1 = class418.field4642;
        class418 var2;
        synchronized (class418.field4642) {
            if (class418.field4644 == 0) {
                var2 = new class418();
            } else {
                class418.field4642[--class418.field4644].method7336();
                var2 = class418.field4642[class418.field4644];
            }
        }
        class418 var4 = var2;
        for (int var5 = 0; var5 < this.field1490.length; var5++) {
            class418 var6 = this.method2858(var5);
            var4.method7287(var6);
            var4.method7294();
            this.field1498[var5] = var4.method7284();
            this.field1499[var5][0] = var6.field4645[12];
            this.field1499[var5][1] = var6.field4645[13];
            this.field1499[var5][2] = var6.field4645[14];
            this.field1493[var5] = var6.method7296();
        }
        var4.method7280();
    }

    @ObfuscatedName("dc.w(II)Lpb;")
    public class418 method2858(int arg0) {
        return this.field1490[arg0];
    }

    @ObfuscatedName("dc.v(II)Lpb;")
    public class418 method2875(int arg0) {
        if (this.field1491[arg0] == null) {
            this.field1491[arg0] = new class418(this.method2858(arg0));
            if (this.field1501 == null) {
                this.field1491[arg0].method7286(class418.field4647);
            } else {
                this.field1491[arg0].method7286(this.field1501.method2875(arg0));
            }
        }
        return this.field1491[arg0];
    }

    @ObfuscatedName("dc.s(IB)Lpb;")
    public class418 method2877(int arg0) {
        if (this.field1496[arg0] == null) {
            this.field1496[arg0] = new class418(this.method2875(arg0));
            this.field1496[arg0].method7294();
        }
        return this.field1496[arg0];
    }

    @ObfuscatedName("dc.z(Lpb;I)V")
    public void method2860(class418 arg0) {
        this.field1497.method7287(arg0);
        this.field1494 = true;
        this.field1487 = true;
    }

    @ObfuscatedName("dc.j(I)Lpb;")
    public class418 method2861() {
        return this.field1497;
    }

    @ObfuscatedName("dc.i(I)Lpb;")
    public class418 method2865() {
        if (this.field1494) {
            this.field1495.method7287(this.method2861());
            if (this.field1501 != null) {
                this.field1495.method7286(this.field1501.method2865());
            }
            this.field1494 = false;
        }
        return this.field1495;
    }

    @ObfuscatedName("dc.n(IB)Lpb;")
    public class418 method2863(int arg0) {
        if (this.field1487) {
            this.field1488.method7287(this.method2877(arg0));
            this.field1488.method7286(this.method2865());
            this.field1487 = false;
        }
        return this.field1488;
    }

    @ObfuscatedName("dc.l(II)[F")
    public float[] method2864(int arg0) {
        return this.field1498[arg0];
    }

    @ObfuscatedName("dc.k(II)[F")
    public float[] method2872(int arg0) {
        return this.field1499[arg0];
    }

    @ObfuscatedName("dc.c(IB)[F")
    public float[] method2866(int arg0) {
        return this.field1493[arg0];
    }
}
