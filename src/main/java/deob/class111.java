package deob;

@ObfuscatedName("dc")
public class class111 {

    @ObfuscatedName("dc.d")
    public class262 field1588;

    @ObfuscatedName("dc.z")
    public class262 field1589;

    @ObfuscatedName("dc.n")
    public class215 field1593 = new class215(256);

    @ObfuscatedName("dc.r")
    public class215 field1591 = new class215(256);

    public class111(class262 arg0, class262 arg1) {
        this.field1588 = arg0;
        this.field1589 = arg1;
    }

    @ObfuscatedName("dc.d(II[II)Ldd;")
    public class106 method2132(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1591.method3736(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method2011(this.field1588, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method2001();
            this.field1591.method3745(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1533.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dc.z(II[II)Ldd;")
    public class106 method2134(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1591.method3736(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1593.method3736(var6);
            if (var9 == null) {
                var9 = class105.method2017(this.field1589, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1593.method3745(var9, var6);
            }
            class106 var10 = var9.method2024(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3785();
                this.field1591.method3745(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dc.n(I[II)Ldd;")
    public class106 method2140(int arg0, int[] arg1) {
        if (this.field1588.method4311() == 1) {
            return this.method2132(0, arg0, arg1);
        } else if (this.field1588.method4285(arg0) == 1) {
            return this.method2132(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dc.r(I[II)Ldd;")
    public class106 method2138(int arg0, int[] arg1) {
        if (this.field1589.method4311() == 1) {
            return this.method2134(0, arg0, arg1);
        } else if (this.field1589.method4285(arg0) == 1) {
            return this.method2134(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
