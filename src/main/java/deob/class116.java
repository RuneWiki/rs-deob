package deob;

@ObfuscatedName("dp")
public class class116 {

    @ObfuscatedName("dp.s")
    public final int field1422;

    @ObfuscatedName("dp.h")
    public class116 field1414;

    @ObfuscatedName("dp.w")
    public float[][] field1415;

    @ObfuscatedName("dp.v")
    public final class389[] field1416;

    @ObfuscatedName("dp.c")
    public class389[] field1417;

    @ObfuscatedName("dp.q")
    public class389[] field1418;

    @ObfuscatedName("dp.i")
    public class389 field1413 = new class389();

    @ObfuscatedName("dp.k")
    public boolean field1424 = true;

    @ObfuscatedName("dp.o")
    public class389 field1421 = new class389();

    @ObfuscatedName("dp.n")
    public boolean field1425 = true;

    @ObfuscatedName("dp.d")
    public class389 field1423 = new class389();

    @ObfuscatedName("dp.a")
    public float[][] field1426;

    @ObfuscatedName("dp.m")
    public float[][] field1420;

    @ObfuscatedName("dp.u")
    public float[][] field1419;

    public class116(int arg0, class444 arg1, boolean arg2) {
        this.field1422 = arg1.method6932();
        this.field1416 = new class389[arg0];
        this.field1417 = new class389[this.field1416.length];
        this.field1418 = new class389[this.field1416.length];
        this.field1415 = new float[this.field1416.length][3];
        for (int var4 = 0; var4 < this.field1416.length; var4++) {
            this.field1416[var4] = new class389(arg1, arg2);
            this.field1415[var4][0] = arg1.method7117();
            this.field1415[var4][1] = arg1.method7117();
            this.field1415[var4][2] = arg1.method7117();
        }
        this.method2505();
    }

    @ObfuscatedName("dp.s(I)V")
    public void method2505() {
        this.field1426 = new float[this.field1416.length][3];
        this.field1420 = new float[this.field1416.length][3];
        this.field1419 = new float[this.field1416.length][3];
        class389 var1 = class389.method5400();
        for (int var2 = 0; var2 < this.field1416.length; var2++) {
            class389 var3 = this.method2506(var2);
            var1.method6255(var3);
            var1.method6262();
            this.field1426[var2] = var1.method6253();
            this.field1420[var2][0] = var3.field4399[12];
            this.field1420[var2][1] = var3.field4399[13];
            this.field1420[var2][2] = var3.field4399[14];
            this.field1419[var2] = var3.method6264();
        }
        var1.method6286();
    }

    @ObfuscatedName("dp.h(II)Lny;")
    public class389 method2506(int arg0) {
        return this.field1416[arg0];
    }

    @ObfuscatedName("dp.w(IB)Lny;")
    public class389 method2507(int arg0) {
        if (this.field1417[arg0] == null) {
            this.field1417[arg0] = new class389(this.method2506(arg0));
            if (this.field1414 == null) {
                this.field1417[arg0].method6294(class389.field4403);
            } else {
                this.field1417[arg0].method6294(this.field1414.method2507(arg0));
            }
        }
        return this.field1417[arg0];
    }

    @ObfuscatedName("dp.v(II)Lny;")
    public class389 method2508(int arg0) {
        if (this.field1418[arg0] == null) {
            this.field1418[arg0] = new class389(this.method2507(arg0));
            this.field1418[arg0].method6262();
        }
        return this.field1418[arg0];
    }

    @ObfuscatedName("dp.c(Lny;I)V")
    public void method2529(class389 arg0) {
        this.field1413.method6255(arg0);
        this.field1424 = true;
        this.field1425 = true;
    }

    @ObfuscatedName("dp.q(I)Lny;")
    public class389 method2510() {
        return this.field1413;
    }

    @ObfuscatedName("dp.i(B)Lny;")
    public class389 method2509() {
        if (this.field1424) {
            this.field1421.method6255(this.method2510());
            if (this.field1414 != null) {
                this.field1421.method6294(this.field1414.method2509());
            }
            this.field1424 = false;
        }
        return this.field1421;
    }

    @ObfuscatedName("dp.k(II)Lny;")
    public class389 method2540(int arg0) {
        if (this.field1425) {
            this.field1423.method6255(this.method2508(arg0));
            this.field1423.method6294(this.method2509());
            this.field1425 = false;
        }
        return this.field1423;
    }

    @ObfuscatedName("dp.o(II)[F")
    public float[] method2513(int arg0) {
        return this.field1426[arg0];
    }

    @ObfuscatedName("dp.n(II)[F")
    public float[] method2514(int arg0) {
        return this.field1420[arg0];
    }

    @ObfuscatedName("dp.d(II)[F")
    public float[] method2512(int arg0) {
        return this.field1419[arg0];
    }
}
