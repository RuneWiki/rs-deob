package deob;

@ObfuscatedName("ds")
public class class118 {

    @ObfuscatedName("ds.z")
    public class244 field1472;

    @ObfuscatedName("ds.k")
    public class244 field1475;

    @ObfuscatedName("ds.s")
    public class328 field1469 = new class328(256);

    @ObfuscatedName("ds.t")
    public class328 field1470 = new class328(256);

    public class118(class244 arg0, class244 arg1) {
        this.field1472 = arg0;
        this.field1475 = arg1;
    }

    @ObfuscatedName("ds.z(II[II)Lde;")
    public class113 method2383(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class113 var8 = (class113) this.field1470.method5611(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class111 var9 = class111.method2267(this.field1472, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class113 var10 = var9.method2253();
            this.field1470.method5606(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1417.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.k(II[IS)Lde;")
    public class113 method2385(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class113 var8 = (class113) this.field1470.method5611(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class112 var9 = (class112) this.field1469.method5611(var6);
            if (var9 == null) {
                var9 = class112.method2284(this.field1475, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1469.method5606(var9, var6);
            }
            class113 var10 = var9.method2294(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3401();
                this.field1470.method5606(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.s(I[IB)Lde;")
    public class113 method2384(int arg0, int[] arg1) {
        if (this.field1472.method3885() == 1) {
            return this.method2383(0, arg0, arg1);
        } else if (this.field1472.method3884(arg0) == 1) {
            return this.method2383(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ds.t(I[II)Lde;")
    public class113 method2387(int arg0, int[] arg1) {
        if (this.field1475.method3885() == 1) {
            return this.method2385(0, arg0, arg1);
        } else if (this.field1475.method3884(arg0) == 1) {
            return this.method2385(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
