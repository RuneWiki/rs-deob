package deob;

@ObfuscatedName("dk")
public class class118 {

    @ObfuscatedName("dk.x")
    public class244 field1459;

    @ObfuscatedName("dk.m")
    public class244 field1461;

    @ObfuscatedName("dk.k")
    public class328 field1460 = new class328(256);

    @ObfuscatedName("dk.d")
    public class328 field1464 = new class328(256);

    public class118(class244 arg0, class244 arg1) {
        this.field1459 = arg0;
        this.field1461 = arg1;
    }

    @ObfuscatedName("dk.x(II[II)Ldm;")
    public class113 method2380(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class113 var8 = (class113) this.field1464.method5561(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class111 var9 = class111.method2261(this.field1459, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class113 var10 = var9.method2258();
            this.field1464.method5548(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1405.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dk.m(II[II)Ldm;")
    public class113 method2388(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class113 var8 = (class113) this.field1464.method5561(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class112 var9 = (class112) this.field1460.method5561(var6);
            if (var9 == null) {
                var9 = class112.method2295(this.field1461, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1460.method5548(var9, var6);
            }
            class113 var10 = var9.method2273(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3355();
                this.field1464.method5548(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dk.k(I[II)Ldm;")
    public class113 method2382(int arg0, int[] arg1) {
        if (this.field1459.method3880() == 1) {
            return this.method2380(0, arg0, arg1);
        } else if (this.field1459.method3891(arg0) == 1) {
            return this.method2380(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dk.d(I[II)Ldm;")
    public class113 method2383(int arg0, int[] arg1) {
        if (this.field1461.method3880() == 1) {
            return this.method2388(0, arg0, arg1);
        } else if (this.field1461.method3891(arg0) == 1) {
            return this.method2388(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
