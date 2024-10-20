package deob;

@ObfuscatedName("cc")
public class class101 {

    @ObfuscatedName("cc.v")
    public class250 field1382;

    @ObfuscatedName("cc.s")
    public class250 field1384;

    @ObfuscatedName("cc.o")
    public class205 field1383 = new class205(256);

    @ObfuscatedName("cc.k")
    public class205 field1381 = new class205(256);

    public class101(class250 arg0, class250 arg1) {
        this.field1382 = arg0;
        this.field1384 = arg1;
    }

    @ObfuscatedName("cc.v(II[II)Lcq;")
    public class96 method2101(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class96 var8 = (class96) this.field1381.method3735(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class94 var9 = class94.method1960(this.field1382, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class96 var10 = var9.method1961();
            this.field1381.method3733(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1330.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cc.s(II[II)Lcq;")
    public class96 method2089(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class96 var8 = (class96) this.field1381.method3735(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var9 = (class95) this.field1383.method3735(var6);
            if (var9 == null) {
                var9 = class95.method1982(this.field1384, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1383.method3733(var9, var6);
            }
            class96 var10 = var9.method2005(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3787();
                this.field1381.method3733(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("cc.o(I[II)Lcq;")
    public class96 method2092(int arg0, int[] arg1) {
        if (this.field1382.method4280() == 1) {
            return this.method2101(0, arg0, arg1);
        } else if (this.field1382.method4331(arg0) == 1) {
            return this.method2101(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cc.k(I[II)Lcq;")
    public class96 method2109(int arg0, int[] arg1) {
        if (this.field1384.method4280() == 1) {
            return this.method2089(0, arg0, arg1);
        } else if (this.field1384.method4331(arg0) == 1) {
            return this.method2089(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
