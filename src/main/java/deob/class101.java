package deob;

@ObfuscatedName("ck")
public class class101 {

    @ObfuscatedName("ck.y")
    public class250 field1386;

    @ObfuscatedName("ck.c")
    public class250 field1385;

    @ObfuscatedName("ck.n")
    public class205 field1387 = new class205(256);

    @ObfuscatedName("ck.u")
    public class205 field1384 = new class205(256);

    public class101(class250 arg0, class250 arg1) {
        this.field1386 = arg0;
        this.field1385 = arg1;
    }

    @ObfuscatedName("ck.y(II[II)Lcz;")
    public class96 method2088(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class96 var8 = (class96) this.field1384.method3734(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class94 var9 = class94.method1974(this.field1386, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class96 var10 = var9.method1970();
            this.field1384.method3718(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1334.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ck.c(II[II)Lcz;")
    public class96 method2089(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class96 var8 = (class96) this.field1384.method3734(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var9 = (class95) this.field1387.method3734(var6);
            if (var9 == null) {
                var9 = class95.method2014(this.field1385, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1387.method3718(var9, var6);
            }
            class96 var10 = var9.method1988(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3766();
                this.field1384.method3718(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ck.n(I[II)Lcz;")
    public class96 method2098(int arg0, int[] arg1) {
        if (this.field1386.method4269() == 1) {
            return this.method2088(0, arg0, arg1);
        } else if (this.field1386.method4287(arg0) == 1) {
            return this.method2088(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ck.u(I[II)Lcz;")
    public class96 method2090(int arg0, int[] arg1) {
        if (this.field1385.method4269() == 1) {
            return this.method2089(0, arg0, arg1);
        } else if (this.field1385.method4287(arg0) == 1) {
            return this.method2089(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
