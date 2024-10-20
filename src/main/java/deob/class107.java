package deob;

@ObfuscatedName("dt")
public class class107 {

    @ObfuscatedName("dt.m")
    public class245 field1397;

    @ObfuscatedName("dt.f")
    public class245 field1398;

    @ObfuscatedName("dt.q")
    public class319 field1400 = new class319(256);

    @ObfuscatedName("dt.w")
    public class319 field1399 = new class319(256);

    public class107(class245 arg0, class245 arg1) {
        this.field1397 = arg0;
        this.field1398 = arg1;
    }

    @ObfuscatedName("dt.m(II[IS)Lcx;")
    public class102 method2250(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class102 var8 = (class102) this.field1399.method5416(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class100 var9 = class100.method2133(this.field1397, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class102 var10 = var9.method2128();
            this.field1399.method5412(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1348.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.f(II[II)Lcx;")
    public class102 method2246(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class102 var8 = (class102) this.field1399.method5416(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class101 var9 = (class101) this.field1400.method5416(var6);
            if (var9 == null) {
                var9 = class101.method2154(this.field1398, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1400.method5412(var9, var6);
            }
            class102 var10 = var9.method2156(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3306();
                this.field1399.method5412(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.q(I[IB)Lcx;")
    public class102 method2245(int arg0, int[] arg1) {
        if (this.field1397.method4205() == 1) {
            return this.method2250(0, arg0, arg1);
        } else if (this.field1397.method4168(arg0) == 1) {
            return this.method2250(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dt.w(I[II)Lcx;")
    public class102 method2247(int arg0, int[] arg1) {
        if (this.field1398.method4205() == 1) {
            return this.method2246(0, arg0, arg1);
        } else if (this.field1398.method4168(arg0) == 1) {
            return this.method2246(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
