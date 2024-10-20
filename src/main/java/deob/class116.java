package deob;

@ObfuscatedName("da")
public class class116 {

    @ObfuscatedName("da.v")
    public final int field1396;

    @ObfuscatedName("da.c")
    public class116 field1389;

    @ObfuscatedName("da.i")
    public float[][] field1386;

    @ObfuscatedName("da.f")
    public final class388[] field1387;

    @ObfuscatedName("da.b")
    public class388[] field1388;

    @ObfuscatedName("da.n")
    public class388[] field1384;

    @ObfuscatedName("da.s")
    public class388 field1390 = new class388();

    @ObfuscatedName("da.l")
    public boolean field1393 = true;

    @ObfuscatedName("da.q")
    public class388 field1385 = new class388();

    @ObfuscatedName("da.o")
    public boolean field1392 = true;

    @ObfuscatedName("da.r")
    public class388 field1394 = new class388();

    @ObfuscatedName("da.p")
    public float[][] field1395;

    @ObfuscatedName("da.w")
    public float[][] field1391;

    @ObfuscatedName("da.k")
    public float[][] field1397;

    public class116(int arg0, class438 arg1, boolean arg2) {
        this.field1396 = arg1.method6974();
        this.field1387 = new class388[arg0];
        this.field1388 = new class388[this.field1387.length];
        this.field1384 = new class388[this.field1387.length];
        this.field1386 = new float[this.field1387.length][3];
        for (int var4 = 0; var4 < this.field1387.length; var4++) {
            this.field1387[var4] = new class388(arg1, arg2);
            this.field1386[var4][0] = arg1.method6978();
            this.field1386[var4][1] = arg1.method6978();
            this.field1386[var4][2] = arg1.method6978();
        }
        this.method2542();
    }

    @ObfuscatedName("da.v(B)V")
    public void method2542() {
        this.field1395 = new float[this.field1387.length][3];
        this.field1391 = new float[this.field1387.length][3];
        this.field1397 = new float[this.field1387.length][3];
        class388[] var1 = class388.field4347;
        class388 var2;
        synchronized (class388.field4347) {
            if (Statics.field4348 == 0) {
                var2 = new class388();
            } else {
                class388.field4347[--Statics.field4348].method6350();
                var2 = class388.field4347[Statics.field4348];
            }
        }
        class388 var4 = var2;
        for (int var5 = 0; var5 < this.field1387.length; var5++) {
            class388 var6 = this.method2543(var5);
            var4.method6371(var6);
            var4.method6360();
            this.field1395[var5] = var4.method6349();
            this.field1391[var5][0] = var6.field4349[12];
            this.field1391[var5][1] = var6.field4349[13];
            this.field1391[var5][2] = var6.field4349[14];
            this.field1397[var5] = var6.method6362();
        }
        var4.method6368();
    }

    @ObfuscatedName("da.c(II)Lnt;")
    public class388 method2543(int arg0) {
        return this.field1387[arg0];
    }

    @ObfuscatedName("da.i(IB)Lnt;")
    public class388 method2544(int arg0) {
        if (this.field1388[arg0] == null) {
            this.field1388[arg0] = new class388(this.method2543(arg0));
            if (this.field1389 == null) {
                this.field1388[arg0].method6356(class388.field4346);
            } else {
                this.field1388[arg0].method6356(this.field1389.method2544(arg0));
            }
        }
        return this.field1388[arg0];
    }

    @ObfuscatedName("da.f(II)Lnt;")
    public class388 method2545(int arg0) {
        if (this.field1384[arg0] == null) {
            this.field1384[arg0] = new class388(this.method2544(arg0));
            this.field1384[arg0].method6360();
        }
        return this.field1384[arg0];
    }

    @ObfuscatedName("da.b(Lnt;I)V")
    public void method2554(class388 arg0) {
        this.field1390.method6371(arg0);
        this.field1393 = true;
        this.field1392 = true;
    }

    @ObfuscatedName("da.n(B)Lnt;")
    public class388 method2556() {
        return this.field1390;
    }

    @ObfuscatedName("da.s(B)Lnt;")
    public class388 method2547() {
        if (this.field1393) {
            this.field1385.method6371(this.method2556());
            if (this.field1389 != null) {
                this.field1385.method6356(this.field1389.method2547());
            }
            this.field1393 = false;
        }
        return this.field1385;
    }

    @ObfuscatedName("da.l(IB)Lnt;")
    public class388 method2549(int arg0) {
        if (this.field1392) {
            this.field1394.method6371(this.method2545(arg0));
            this.field1394.method6356(this.method2547());
            this.field1392 = false;
        }
        return this.field1394;
    }

    @ObfuscatedName("da.q(II)[F")
    public float[] method2550(int arg0) {
        return this.field1395[arg0];
    }

    @ObfuscatedName("da.o(II)[F")
    public float[] method2551(int arg0) {
        return this.field1391[arg0];
    }

    @ObfuscatedName("da.r(IB)[F")
    public float[] method2552(int arg0) {
        return this.field1397[arg0];
    }
}
