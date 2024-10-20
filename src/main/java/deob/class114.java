package deob;

@ObfuscatedName("dm")
public class class114 {

    @ObfuscatedName("dm.c")
    public final int field1398;

    @ObfuscatedName("dm.l")
    public class114 field1395;

    @ObfuscatedName("dm.s")
    public float[][] field1396;

    @ObfuscatedName("dm.e")
    public final class372[] field1397;

    @ObfuscatedName("dm.r")
    public class372[] field1406;

    @ObfuscatedName("dm.o")
    public class372[] field1399;

    @ObfuscatedName("dm.i")
    public class372 field1400 = new class372();

    @ObfuscatedName("dm.w")
    public boolean field1401 = true;

    @ObfuscatedName("dm.v")
    public class372 field1402 = new class372();

    @ObfuscatedName("dm.a")
    public boolean field1403 = true;

    @ObfuscatedName("dm.y")
    public class372 field1404 = new class372();

    @ObfuscatedName("dm.u")
    public float[][] field1405;

    @ObfuscatedName("dm.h")
    public float[][] field1408;

    @ObfuscatedName("dm.q")
    public float[][] field1407;

    public class114(int arg0, class421 arg1, boolean arg2) {
        this.field1398 = arg1.method6830();
        this.field1397 = new class372[arg0];
        this.field1406 = new class372[this.field1397.length];
        this.field1399 = new class372[this.field1397.length];
        this.field1396 = new float[this.field1397.length][3];
        for (int var4 = 0; var4 < this.field1397.length; var4++) {
            this.field1397[var4] = new class372(arg1, arg2);
            this.field1396[var4][0] = arg1.method6671();
            this.field1396[var4][1] = arg1.method6671();
            this.field1396[var4][2] = arg1.method6671();
        }
        this.method2437();
    }

    @ObfuscatedName("dm.c(I)V")
    public void method2437() {
        this.field1405 = new float[this.field1397.length][3];
        this.field1408 = new float[this.field1397.length][3];
        this.field1407 = new float[this.field1397.length][3];
        class372 var1 = class372.method4307();
        for (int var2 = 0; var2 < this.field1397.length; var2++) {
            class372 var3 = this.method2438(var2);
            var1.method6039(var3);
            var1.method6045();
            this.field1405[var2] = var1.method6072();
            this.field1408[var2][0] = var3.field4242[12];
            this.field1408[var2][1] = var3.field4242[13];
            this.field1408[var2][2] = var3.field4242[14];
            this.field1407[var2] = var3.method6028();
        }
        var1.method6043();
    }

    @ObfuscatedName("dm.l(II)Lni;")
    public class372 method2438(int arg0) {
        return this.field1397[arg0];
    }

    @ObfuscatedName("dm.s(II)Lni;")
    public class372 method2439(int arg0) {
        if (this.field1406[arg0] == null) {
            this.field1406[arg0] = new class372(this.method2438(arg0));
            if (this.field1395 == null) {
                this.field1406[arg0].method6022(class372.field4240);
            } else {
                this.field1406[arg0].method6022(this.field1395.method2439(arg0));
            }
        }
        return this.field1406[arg0];
    }

    @ObfuscatedName("dm.e(II)Lni;")
    public class372 method2440(int arg0) {
        if (this.field1399[arg0] == null) {
            this.field1399[arg0] = new class372(this.method2439(arg0));
            this.field1399[arg0].method6045();
        }
        return this.field1399[arg0];
    }

    @ObfuscatedName("dm.r(Lni;I)V")
    public void method2441(class372 arg0) {
        this.field1400.method6039(arg0);
        this.field1401 = true;
        this.field1403 = true;
    }

    @ObfuscatedName("dm.o(B)Lni;")
    public class372 method2442() {
        return this.field1400;
    }

    @ObfuscatedName("dm.i(I)Lni;")
    public class372 method2453() {
        if (this.field1401) {
            this.field1402.method6039(this.method2442());
            if (this.field1395 != null) {
                this.field1402.method6022(this.field1395.method2453());
            }
            this.field1401 = false;
        }
        return this.field1402;
    }

    @ObfuscatedName("dm.w(IB)Lni;")
    public class372 method2469(int arg0) {
        if (this.field1403) {
            this.field1404.method6039(this.method2440(arg0));
            this.field1404.method6022(this.method2453());
            this.field1403 = false;
        }
        return this.field1404;
    }

    @ObfuscatedName("dm.v(II)[F")
    public float[] method2445(int arg0) {
        return this.field1405[arg0];
    }

    @ObfuscatedName("dm.a(IB)[F")
    public float[] method2465(int arg0) {
        return this.field1408[arg0];
    }

    @ObfuscatedName("dm.y(IS)[F")
    public float[] method2446(int arg0) {
        return this.field1407[arg0];
    }
}
