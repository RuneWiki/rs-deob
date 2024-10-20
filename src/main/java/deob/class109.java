package deob;

@ObfuscatedName("dy")
public class class109 {

    @ObfuscatedName("dy.c")
    public class234 field1415;

    @ObfuscatedName("dy.x")
    public class234 field1408;

    @ObfuscatedName("dy.t")
    public class318 field1409 = new class318(256);

    @ObfuscatedName("dy.g")
    public class318 field1410 = new class318(256);

    public class109(class234 arg0, class234 arg1) {
        this.field1415 = arg0;
        this.field1408 = arg1;
    }

    @ObfuscatedName("dy.c(II[II)Lcg;")
    public class104 method2291(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1410.method5524(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2179(this.field1415, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2170();
            this.field1410.method5517(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1357.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.x(II[II)Lcg;")
    public class104 method2297(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1410.method5524(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1409.method5524(var6);
            if (var9 == null) {
                var9 = class103.method2189(this.field1408, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1409.method5517(var9, var6);
            }
            class104 var10 = var9.method2191(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3326();
                this.field1410.method5517(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.t(I[II)Lcg;")
    public class104 method2304(int arg0, int[] arg1) {
        if (this.field1415.method3826() == 1) {
            return this.method2291(0, arg0, arg1);
        } else if (this.field1415.method3837(arg0) == 1) {
            return this.method2291(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dy.g(I[II)Lcg;")
    public class104 method2292(int arg0, int[] arg1) {
        if (this.field1408.method3826() == 1) {
            return this.method2297(0, arg0, arg1);
        } else if (this.field1408.method3837(arg0) == 1) {
            return this.method2297(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
