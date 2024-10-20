package deob;

@ObfuscatedName("ds")
public class class118 {

    @ObfuscatedName("ds.f")
    public class245 field1475;

    @ObfuscatedName("ds.b")
    public class245 field1472;

    @ObfuscatedName("ds.l")
    public class329 field1474 = new class329(256);

    @ObfuscatedName("ds.m")
    public class329 field1476 = new class329(256);

    public class118(class245 arg0, class245 arg1) {
        this.field1475 = arg0;
        this.field1472 = arg1;
    }

    @ObfuscatedName("ds.f(II[II)Ldo;")
    public class113 method2406(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class113 var8 = (class113) this.field1476.method5597(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class111 var9 = class111.method2285(this.field1475, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class113 var10 = var9.method2279();
            this.field1476.method5596(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1416.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.b(II[II)Ldo;")
    public class113 method2407(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class113 var8 = (class113) this.field1476.method5597(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class112 var9 = (class112) this.field1474.method5597(var6);
            if (var9 == null) {
                var9 = class112.method2296(this.field1472, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1474.method5596(var9, var6);
            }
            class113 var10 = var9.method2295(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3407();
                this.field1476.method5596(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.l(I[II)Ldo;")
    public class113 method2408(int arg0, int[] arg1) {
        if (this.field1475.method3918() == 1) {
            return this.method2406(0, arg0, arg1);
        } else if (this.field1475.method3963(arg0) == 1) {
            return this.method2406(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ds.m(I[II)Ldo;")
    public class113 method2409(int arg0, int[] arg1) {
        if (this.field1472.method3918() == 1) {
            return this.method2407(0, arg0, arg1);
        } else if (this.field1472.method3963(arg0) == 1) {
            return this.method2407(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
