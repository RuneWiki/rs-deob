package deob;

@ObfuscatedName("df")
public class class114 {

    @ObfuscatedName("df.c")
    public final int field1378;

    @ObfuscatedName("df.b")
    public class114 field1367;

    @ObfuscatedName("df.p")
    public float[][] field1380;

    @ObfuscatedName("df.m")
    public final class367[] field1369;

    @ObfuscatedName("df.t")
    public class367[] field1370;

    @ObfuscatedName("df.s")
    public class367[] field1366;

    @ObfuscatedName("df.j")
    public class367 field1372 = new class367();

    @ObfuscatedName("df.w")
    public boolean field1379 = true;

    @ObfuscatedName("df.n")
    public class367 field1374 = new class367();

    @ObfuscatedName("df.r")
    public boolean field1375 = true;

    @ObfuscatedName("df.o")
    public class367 field1373 = new class367();

    @ObfuscatedName("df.v")
    public float[][] field1377;

    @ObfuscatedName("df.d")
    public float[][] field1368;

    @ObfuscatedName("df.h")
    public float[][] field1376;

    public class114(int arg0, class419 arg1, boolean arg2) {
        this.field1378 = arg1.method6673();
        this.field1369 = new class367[arg0];
        this.field1370 = new class367[this.field1369.length];
        this.field1366 = new class367[this.field1369.length];
        this.field1380 = new float[this.field1369.length][3];
        for (int var4 = 0; var4 < this.field1369.length; var4++) {
            this.field1369[var4] = new class367(arg1, arg2);
            this.field1380[var4][0] = arg1.method6677();
            this.field1380[var4][1] = arg1.method6677();
            this.field1380[var4][2] = arg1.method6677();
        }
        this.method2461();
    }

    @ObfuscatedName("df.c(B)V")
    public void method2461() {
        this.field1377 = new float[this.field1369.length][3];
        this.field1368 = new float[this.field1369.length][3];
        this.field1376 = new float[this.field1369.length][3];
        class367[] var1 = class367.field4192;
        class367 var2;
        synchronized (class367.field4192) {
            if (Statics.field1664 == 0) {
                var2 = new class367();
            } else {
                class367.field4192[--Statics.field1664].method6009();
                var2 = class367.field4192[Statics.field1664];
            }
        }
        class367 var4 = var2;
        for (int var5 = 0; var5 < this.field1369.length; var5++) {
            class367 var6 = this.method2477(var5);
            var4.method6011(var6);
            var4.method6035();
            this.field1377[var5] = var4.method6008();
            this.field1368[var5][0] = var6.field4197[12];
            this.field1368[var5][1] = var6.field4197[13];
            this.field1368[var5][2] = var6.field4197[14];
            this.field1376[var5] = var6.method6020();
        }
        var4.method6013();
    }

    @ObfuscatedName("df.b(IB)Lno;")
    public class367 method2477(int arg0) {
        return this.field1369[arg0];
    }

    @ObfuscatedName("df.p(IS)Lno;")
    public class367 method2464(int arg0) {
        if (this.field1370[arg0] == null) {
            this.field1370[arg0] = new class367(this.method2477(arg0));
            if (this.field1367 == null) {
                this.field1370[arg0].method6027(class367.field4195);
            } else {
                this.field1370[arg0].method6027(this.field1367.method2464(arg0));
            }
        }
        return this.field1370[arg0];
    }

    @ObfuscatedName("df.m(II)Lno;")
    public class367 method2463(int arg0) {
        if (this.field1366[arg0] == null) {
            this.field1366[arg0] = new class367(this.method2464(arg0));
            this.field1366[arg0].method6035();
        }
        return this.field1366[arg0];
    }

    @ObfuscatedName("df.t(Lno;I)V")
    public void method2453(class367 arg0) {
        this.field1372.method6011(arg0);
        this.field1379 = true;
        this.field1375 = true;
    }

    @ObfuscatedName("df.s(I)Lno;")
    public class367 method2481() {
        return this.field1372;
    }

    @ObfuscatedName("df.j(B)Lno;")
    public class367 method2458() {
        if (this.field1379) {
            this.field1374.method6011(this.method2481());
            if (this.field1367 != null) {
                this.field1374.method6027(this.field1367.method2458());
            }
            this.field1379 = false;
        }
        return this.field1374;
    }

    @ObfuscatedName("df.w(II)Lno;")
    public class367 method2459(int arg0) {
        if (this.field1375) {
            this.field1373.method6011(this.method2463(arg0));
            this.field1373.method6027(this.method2458());
            this.field1375 = false;
        }
        return this.field1373;
    }

    @ObfuscatedName("df.n(II)[F")
    public float[] method2460(int arg0) {
        return this.field1377[arg0];
    }

    @ObfuscatedName("df.r(IB)[F")
    public float[] method2454(int arg0) {
        return this.field1368[arg0];
    }

    @ObfuscatedName("df.o(II)[F")
    public float[] method2462(int arg0) {
        return this.field1376[arg0];
    }
}
