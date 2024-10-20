package deob;

@ObfuscatedName("ct")
public class class101 {

    @ObfuscatedName("ct.f")
    public class250 field1395;

    @ObfuscatedName("ct.l")
    public class250 field1390;

    @ObfuscatedName("ct.w")
    public class205 field1394 = new class205(256);

    @ObfuscatedName("ct.s")
    public class205 field1392 = new class205(256);

    public class101(class250 arg0, class250 arg1) {
        this.field1395 = arg0;
        this.field1390 = arg1;
    }

    @ObfuscatedName("ct.f(II[II)Lcr;")
    public class96 method2141(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class96 var8 = (class96) this.field1392.method3774(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class94 var9 = class94.method2024(this.field1395, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class96 var10 = var9.method2034();
            this.field1392.method3773(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1340.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ct.l(II[II)Lcr;")
    public class96 method2142(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class96 var8 = (class96) this.field1392.method3774(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var9 = (class95) this.field1394.method3774(var6);
            if (var9 == null) {
                var9 = class95.method2045(this.field1390, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1394.method3773(var9, var6);
            }
            class96 var10 = var9.method2046(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3818();
                this.field1392.method3773(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ct.w(I[II)Lcr;")
    public class96 method2150(int arg0, int[] arg1) {
        if (this.field1395.method4302() == 1) {
            return this.method2141(0, arg0, arg1);
        } else if (this.field1395.method4326(arg0) == 1) {
            return this.method2141(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ct.s(I[IB)Lcr;")
    public class96 method2153(int arg0, int[] arg1) {
        if (this.field1390.method4302() == 1) {
            return this.method2142(0, arg0, arg1);
        } else if (this.field1390.method4326(arg0) == 1) {
            return this.method2142(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
