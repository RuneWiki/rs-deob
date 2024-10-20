package deob;

@ObfuscatedName("ds")
public class class118 {

    @ObfuscatedName("ds.h")
    public class245 field1459;

    @ObfuscatedName("ds.v")
    public class245 field1458;

    @ObfuscatedName("ds.x")
    public class329 field1460 = new class329(256);

    @ObfuscatedName("ds.w")
    public class329 field1463 = new class329(256);

    public class118(class245 arg0, class245 arg1) {
        this.field1459 = arg0;
        this.field1458 = arg1;
    }

    @ObfuscatedName("ds.h(II[II)Ldf;")
    public class113 method2376(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class113 var8 = (class113) this.field1463.method5543(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class111 var9 = class111.method2243(this.field1459, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class113 var10 = var9.method2245();
            this.field1463.method5531(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1406.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.v(II[II)Ldf;")
    public class113 method2377(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class113 var8 = (class113) this.field1463.method5543(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class112 var9 = (class112) this.field1460.method5543(var6);
            if (var9 == null) {
                var9 = class112.method2254(this.field1458, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1460.method5531(var9, var6);
            }
            class113 var10 = var9.method2259(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3359();
                this.field1463.method5531(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.x(I[II)Ldf;")
    public class113 method2378(int arg0, int[] arg1) {
        if (this.field1459.method3847() == 1) {
            return this.method2376(0, arg0, arg1);
        } else if (this.field1459.method3846(arg0) == 1) {
            return this.method2376(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ds.w(I[II)Ldf;")
    public class113 method2381(int arg0, int[] arg1) {
        if (this.field1458.method3847() == 1) {
            return this.method2377(0, arg0, arg1);
        } else if (this.field1458.method3846(arg0) == 1) {
            return this.method2377(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
