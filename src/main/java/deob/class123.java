package deob;

@ObfuscatedName("di")
public class class123 {

    @ObfuscatedName("di.a")
    public final int field1457;

    @ObfuscatedName("di.f")
    public class123 field1458;

    @ObfuscatedName("di.c")
    public float[][] field1470;

    @ObfuscatedName("di.x")
    public final class408[] field1459;

    @ObfuscatedName("di.h")
    public class408[] field1460;

    @ObfuscatedName("di.j")
    public class408[] field1461;

    @ObfuscatedName("di.y")
    public class408 field1468 = new class408();

    @ObfuscatedName("di.d")
    public boolean field1463 = true;

    @ObfuscatedName("di.n")
    public class408 field1464 = new class408();

    @ObfuscatedName("di.r")
    public boolean field1462 = true;

    @ObfuscatedName("di.l")
    public class408 field1465 = new class408();

    @ObfuscatedName("di.s")
    public float[][] field1467;

    @ObfuscatedName("di.p")
    public float[][] field1466;

    @ObfuscatedName("di.b")
    public float[][] field1469;

    public class123(int arg0, class464 arg1, boolean arg2) {
        this.field1457 = arg1.method7798();
        this.field1459 = new class408[arg0];
        this.field1460 = new class408[this.field1459.length];
        this.field1461 = new class408[this.field1459.length];
        this.field1470 = new float[this.field1459.length][3];
        for (int var4 = 0; var4 < this.field1459.length; var4++) {
            this.field1459[var4] = new class408(arg1, arg2);
            this.field1470[var4][0] = arg1.method7722();
            this.field1470[var4][1] = arg1.method7722();
            this.field1470[var4][2] = arg1.method7722();
        }
        this.method2706();
    }

    @ObfuscatedName("di.a(B)V")
    public void method2706() {
        this.field1467 = new float[this.field1459.length][3];
        this.field1466 = new float[this.field1459.length][3];
        this.field1469 = new float[this.field1459.length][3];
        class408 var1 = class408.method5163();
        for (int var2 = 0; var2 < this.field1459.length; var2++) {
            class408 var3 = this.method2744(var2);
            var1.method7008(var3);
            var1.method7038();
            this.field1467[var2] = var1.method7005();
            this.field1466[var2][0] = var3.field4567[12];
            this.field1466[var2][1] = var3.field4567[13];
            this.field1466[var2][2] = var3.field4567[14];
            this.field1469[var2] = var3.method7018();
        }
        var1.method7055();
    }

    @ObfuscatedName("di.f(II)Lov;")
    public class408 method2744(int arg0) {
        return this.field1459[arg0];
    }

    @ObfuscatedName("di.c(II)Lov;")
    public class408 method2724(int arg0) {
        if (this.field1460[arg0] == null) {
            this.field1460[arg0] = new class408(this.method2744(arg0));
            if (this.field1458 == null) {
                this.field1460[arg0].method7012(class408.field4568);
            } else {
                this.field1460[arg0].method7012(this.field1458.method2724(arg0));
            }
        }
        return this.field1460[arg0];
    }

    @ObfuscatedName("di.x(II)Lov;")
    public class408 method2709(int arg0) {
        if (this.field1461[arg0] == null) {
            this.field1461[arg0] = new class408(this.method2724(arg0));
            this.field1461[arg0].method7038();
        }
        return this.field1461[arg0];
    }

    @ObfuscatedName("di.h(Lov;B)V")
    public void method2728(class408 arg0) {
        this.field1468.method7008(arg0);
        this.field1463 = true;
        this.field1462 = true;
    }

    @ObfuscatedName("di.j(I)Lov;")
    public class408 method2711() {
        return this.field1468;
    }

    @ObfuscatedName("di.y(I)Lov;")
    public class408 method2712() {
        if (this.field1463) {
            this.field1464.method7008(this.method2711());
            if (this.field1458 != null) {
                this.field1464.method7012(this.field1458.method2712());
            }
            this.field1463 = false;
        }
        return this.field1464;
    }

    @ObfuscatedName("di.d(II)Lov;")
    public class408 method2713(int arg0) {
        if (this.field1462) {
            this.field1465.method7008(this.method2709(arg0));
            this.field1465.method7012(this.method2712());
            this.field1462 = false;
        }
        return this.field1465;
    }

    @ObfuscatedName("di.n(IB)[F")
    public float[] method2726(int arg0) {
        return this.field1467[arg0];
    }

    @ObfuscatedName("di.r(IB)[F")
    public float[] method2715(int arg0) {
        return this.field1466[arg0];
    }

    @ObfuscatedName("di.l(IB)[F")
    public float[] method2716(int arg0) {
        return this.field1469[arg0];
    }
}
