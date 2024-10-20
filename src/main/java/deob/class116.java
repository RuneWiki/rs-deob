package deob;

@ObfuscatedName("db")
public class class116 {

    @ObfuscatedName("db.o")
    public final int field1456;

    @ObfuscatedName("db.q")
    public class116 field1448;

    @ObfuscatedName("db.l")
    public float[][] field1447;

    @ObfuscatedName("db.k")
    public final class389[] field1450;

    @ObfuscatedName("db.a")
    public class389[] field1453;

    @ObfuscatedName("db.m")
    public class389[] field1452;

    @ObfuscatedName("db.p")
    public class389 field1460 = new class389();

    @ObfuscatedName("db.s")
    public boolean field1451 = true;

    @ObfuscatedName("db.r")
    public class389 field1454 = new class389();

    @ObfuscatedName("db.v")
    public boolean field1455 = true;

    @ObfuscatedName("db.y")
    public class389 field1457 = new class389();

    @ObfuscatedName("db.c")
    public float[][] field1458;

    @ObfuscatedName("db.w")
    public float[][] field1459;

    @ObfuscatedName("db.b")
    public float[][] field1449;

    public class116(int arg0, class440 arg1, boolean arg2) {
        this.field1456 = arg1.method6896();
        this.field1450 = new class389[arg0];
        this.field1453 = new class389[this.field1450.length];
        this.field1452 = new class389[this.field1450.length];
        this.field1447 = new float[this.field1450.length][3];
        for (int var4 = 0; var4 < this.field1450.length; var4++) {
            this.field1450[var4] = new class389(arg1, arg2);
            this.field1447[var4][0] = arg1.method6948();
            this.field1447[var4][1] = arg1.method6948();
            this.field1447[var4][2] = arg1.method6948();
        }
        this.method2538();
    }

    @ObfuscatedName("db.o(B)V")
    public void method2538() {
        this.field1458 = new float[this.field1450.length][3];
        this.field1459 = new float[this.field1450.length][3];
        this.field1449 = new float[this.field1450.length][3];
        class389 var1 = class389.method3601();
        for (int var2 = 0; var2 < this.field1450.length; var2++) {
            class389 var3 = this.method2501(var2);
            var1.method6295(var3);
            var1.method6247();
            this.field1458[var2] = var1.method6237();
            this.field1459[var2][0] = var3.field4401[12];
            this.field1459[var2][1] = var3.field4401[13];
            this.field1459[var2][2] = var3.field4401[14];
            this.field1449[var2] = var3.method6248();
        }
        var1.method6292();
    }

    @ObfuscatedName("db.q(II)Lnw;")
    public class389 method2501(int arg0) {
        return this.field1450[arg0];
    }

    @ObfuscatedName("db.l(IB)Lnw;")
    public class389 method2502(int arg0) {
        if (this.field1453[arg0] == null) {
            this.field1453[arg0] = new class389(this.method2501(arg0));
            if (this.field1448 == null) {
                this.field1453[arg0].method6243(class389.field4404);
            } else {
                this.field1453[arg0].method6243(this.field1448.method2502(arg0));
            }
        }
        return this.field1453[arg0];
    }

    @ObfuscatedName("db.k(II)Lnw;")
    public class389 method2503(int arg0) {
        if (this.field1452[arg0] == null) {
            this.field1452[arg0] = new class389(this.method2502(arg0));
            this.field1452[arg0].method6247();
        }
        return this.field1452[arg0];
    }

    @ObfuscatedName("db.a(Lnw;I)V")
    public void method2506(class389 arg0) {
        this.field1460.method6295(arg0);
        this.field1451 = true;
        this.field1455 = true;
    }

    @ObfuscatedName("db.m(I)Lnw;")
    public class389 method2533() {
        return this.field1460;
    }

    @ObfuscatedName("db.p(I)Lnw;")
    public class389 method2513() {
        if (this.field1451) {
            this.field1454.method6295(this.method2533());
            if (this.field1448 != null) {
                this.field1454.method6243(this.field1448.method2513());
            }
            this.field1451 = false;
        }
        return this.field1454;
    }

    @ObfuscatedName("db.s(II)Lnw;")
    public class389 method2527(int arg0) {
        if (this.field1455) {
            this.field1457.method6295(this.method2503(arg0));
            this.field1457.method6243(this.method2513());
            this.field1455 = false;
        }
        return this.field1457;
    }

    @ObfuscatedName("db.r(IS)[F")
    public float[] method2508(int arg0) {
        return this.field1458[arg0];
    }

    @ObfuscatedName("db.v(II)[F")
    public float[] method2516(int arg0) {
        return this.field1459[arg0];
    }

    @ObfuscatedName("db.y(IB)[F")
    public float[] method2510(int arg0) {
        return this.field1449[arg0];
    }
}
