package deob;

@ObfuscatedName("dx")
public class class107 {

    @ObfuscatedName("dx.f")
    public class234 field1403;

    @ObfuscatedName("dx.i")
    public class234 field1404;

    @ObfuscatedName("dx.y")
    public class318 field1406 = new class318(256);

    @ObfuscatedName("dx.w")
    public class318 field1405 = new class318(256);

    public class107(class234 arg0, class234 arg1) {
        this.field1403 = arg0;
        this.field1404 = arg1;
    }

    @ObfuscatedName("dx.f(II[II)Lcc;")
    public class102 method2299(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class102 var8 = (class102) this.field1405.method5499(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class100 var9 = class100.method2166(this.field1403, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class102 var10 = var9.method2158();
            this.field1405.method5502(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1352.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dx.i(II[II)Lcc;")
    public class102 method2302(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class102 var8 = (class102) this.field1405.method5499(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class101 var9 = (class101) this.field1406.method5499(var6);
            if (var9 == null) {
                var9 = class101.method2180(this.field1404, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1406.method5502(var9, var6);
            }
            class102 var10 = var9.method2181(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3292();
                this.field1405.method5502(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dx.y(I[IB)Lcc;")
    public class102 method2292(int arg0, int[] arg1) {
        if (this.field1403.method3765() == 1) {
            return this.method2299(0, arg0, arg1);
        } else if (this.field1403.method3764(arg0) == 1) {
            return this.method2299(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dx.w(I[IB)Lcc;")
    public class102 method2293(int arg0, int[] arg1) {
        if (this.field1404.method3765() == 1) {
            return this.method2302(0, arg0, arg1);
        } else if (this.field1404.method3764(arg0) == 1) {
            return this.method2302(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
