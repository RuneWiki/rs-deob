package deob;

@ObfuscatedName("de")
public class class111 {

    @ObfuscatedName("de.o")
    public class262 field1604;

    @ObfuscatedName("de.k")
    public class262 field1603;

    @ObfuscatedName("de.t")
    public class215 field1605 = new class215(256);

    @ObfuscatedName("de.d")
    public class215 field1602 = new class215(256);

    public class111(class262 arg0, class262 arg1) {
        this.field1604 = arg0;
        this.field1603 = arg1;
    }

    @ObfuscatedName("de.o(II[II)Ldp;")
    public class106 method2078(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1602.method3637(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method1953(this.field1604, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method1952();
            this.field1602.method3638(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1546.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.k(II[II)Ldp;")
    public class106 method2079(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1602.method3637(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1605.method3637(var6);
            if (var9 == null) {
                var9 = class105.method1964(this.field1603, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1605.method3638(var9, var6);
            }
            class106 var10 = var9.method1966(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3681();
                this.field1602.method3638(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.t(I[IB)Ldp;")
    public class106 method2080(int arg0, int[] arg1) {
        if (this.field1604.method4191() == 1) {
            return this.method2078(0, arg0, arg1);
        } else if (this.field1604.method4207(arg0) == 1) {
            return this.method2078(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("de.d(I[II)Ldp;")
    public class106 method2081(int arg0, int[] arg1) {
        if (this.field1603.method4191() == 1) {
            return this.method2079(0, arg0, arg1);
        } else if (this.field1603.method4207(arg0) == 1) {
            return this.method2079(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
