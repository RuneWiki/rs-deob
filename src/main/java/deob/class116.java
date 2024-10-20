package deob;

@ObfuscatedName("dn")
public class class116 {

    @ObfuscatedName("dn.c")
    public boolean field1398;

    @ObfuscatedName("dn.b")
    public boolean field1409;

    @ObfuscatedName("dn.p")
    public class115 field1411;

    @ObfuscatedName("dn.m")
    public class115 field1397;

    @ObfuscatedName("dn.t")
    public class112[] field1394;

    @ObfuscatedName("dn.s")
    public boolean field1399;

    @ObfuscatedName("dn.j")
    public float field1407;

    @ObfuscatedName("dn.w")
    public float field1395;

    @ObfuscatedName("dn.n")
    public float[] field1402 = new float[4];

    @ObfuscatedName("dn.r")
    public float[] field1403 = new float[4];

    @ObfuscatedName("dn.o")
    public boolean field1404 = true;

    @ObfuscatedName("dn.v")
    public int field1405 = 0;

    @ObfuscatedName("dn.d")
    public float[] field1406;

    @ObfuscatedName("dn.h")
    public int field1396;

    @ObfuscatedName("dn.g")
    public int field1408;

    @ObfuscatedName("dn.e")
    public float field1400;

    @ObfuscatedName("dn.a")
    public float field1410;

    @ObfuscatedName("dn.c(Lpi;II)I")
    public int method2510(class419 arg0, int arg1) {
        int var3 = arg0.method6672();
        int var4 = arg0.method6781();
        class122 var5 = (class122) class316.method2616(class122.method2176(), var4);
        if (var5 == null) {
            class122 var6 = class122.field1468;
        }
        this.field1411 = class115.method2057(arg0.method6781());
        this.field1397 = class115.method2057(arg0.method6781());
        this.field1398 = arg0.method6781() != 0;
        this.field1394 = new class112[var3];
        class112 var7 = null;
        for (int var8 = 0; var8 < var3; var8++) {
            class112 var9 = new class112();
            var9.method2435(arg0, arg1);
            this.field1394[var8] = var9;
            if (var7 != null) {
                var7.field1355 = var9;
            }
            var7 = var9;
        }
        this.field1396 = this.field1394[0].field1360;
        this.field1408 = this.field1394[this.method2509() - 1].field1360;
        this.field1406 = new float[this.method2514() + 1];
        for (int var10 = this.method2505(); var10 <= this.method2530(); var10++) {
            this.field1406[var10 - this.method2505()] = class113.method202(this, (float) var10);
        }
        this.field1394 = null;
        this.field1400 = class113.method202(this, (float) (this.method2505() - 1));
        this.field1410 = class113.method202(this, (float) (this.method2530() + 1));
        return var3;
    }

    @ObfuscatedName("dn.b(II)F")
    public float method2504(int arg0) {
        if (arg0 < this.method2505()) {
            return this.field1400;
        } else if (arg0 > this.method2530()) {
            return this.field1410;
        } else {
            return this.field1406[arg0 - this.method2505()];
        }
    }

    @ObfuscatedName("dn.p(I)I")
    public int method2505() {
        return this.field1396;
    }

    @ObfuscatedName("dn.m(I)I")
    public int method2530() {
        return this.field1408;
    }

    @ObfuscatedName("dn.t(B)I")
    public int method2514() {
        return this.method2530() - this.method2505();
    }

    @ObfuscatedName("dn.s(FB)I")
    public int method2502(float arg0) {
        if (this.field1405 >= 0 && ((float) this.field1394[this.field1405].field1360 <= arg0) && this.field1394[this.field1405].field1355 == null || ((float) this.field1394[this.field1405].field1355.field1360 > arg0)) {
            return this.field1405;
        } else if ((arg0 < (float) this.method2505()) || (arg0 > (float) this.method2530())) {
            return -1;
        } else {
            int var2 = this.method2509();
            int var3 = this.field1405;
            if (var2 > 0) {
                int var4 = 0;
                int var5 = var2 - 1;
                do {
                    int var6 = var4 + var5 >> 1;
                    if (arg0 < (float) this.field1394[var6].field1360) {
                        if (arg0 > (float) this.field1394[var6 - 1].field1360) {
                            var3 = var6 - 1;
                            break;
                        }
                        var5 = var6 - 1;
                    } else {
                        if (!(arg0 > (float) this.field1394[var6].field1360)) {
                            var3 = var6;
                            break;
                        }
                        if (arg0 < (float) this.field1394[var6 + 1].field1360) {
                            var3 = var6;
                            break;
                        }
                        var4 = var6 + 1;
                    }
                } while (var4 <= var5);
            }
            if (this.field1405 != var3) {
                this.field1405 = var3;
                this.field1404 = true;
            }
            return this.field1405;
        }
    }

    @ObfuscatedName("dn.j(FB)Ldk;")
    public class112 method2503(float arg0) {
        int var2 = this.method2502(arg0);
        return var2 >= 0 && var2 < this.field1394.length ? this.field1394[var2] : null;
    }

    @ObfuscatedName("dn.w(I)I")
    public int method2509() {
        return this.field1394 == null ? 0 : this.field1394.length;
    }
}
