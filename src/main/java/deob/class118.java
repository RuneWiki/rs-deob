package deob;

@ObfuscatedName("dy")
public class class118 {

    @ObfuscatedName("dy.n")
    public class245 field1460;

    @ObfuscatedName("dy.v")
    public class245 field1462;

    @ObfuscatedName("dy.d")
    public class329 field1463 = new class329(256);

    @ObfuscatedName("dy.c")
    public class329 field1461 = new class329(256);

    public class118(class245 arg0, class245 arg1) {
        this.field1460 = arg0;
        this.field1462 = arg1;
    }

    @ObfuscatedName("dy.n(II[II)Ldm;")
    public class113 method2481(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class113 var8 = (class113) this.field1461.method5682(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class111 var9 = class111.method2351(this.field1460, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class113 var10 = var9.method2343();
            this.field1461.method5683(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1401.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.v(II[IS)Ldm;")
    public class113 method2473(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class113 var8 = (class113) this.field1461.method5682(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class112 var9 = (class112) this.field1463.method5682(var6);
            if (var9 == null) {
                var9 = class112.method2362(this.field1462, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1463.method5683(var9, var6);
            }
            class113 var10 = var9.method2363(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3486();
                this.field1461.method5683(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.d(I[IB)Ldm;")
    public class113 method2474(int arg0, int[] arg1) {
        if (this.field1460.method4039() == 1) {
            return this.method2481(0, arg0, arg1);
        } else if (this.field1460.method4008(arg0) == 1) {
            return this.method2481(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dy.c(I[II)Ldm;")
    public class113 method2475(int arg0, int[] arg1) {
        if (this.field1462.method4039() == 1) {
            return this.method2473(0, arg0, arg1);
        } else if (this.field1462.method4008(arg0) == 1) {
            return this.method2473(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
