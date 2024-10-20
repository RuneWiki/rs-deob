package deob;

@ObfuscatedName("di")
public class class106 {

    @ObfuscatedName("di.n")
    public class254 field1397;

    @ObfuscatedName("di.h")
    public class254 field1401;

    @ObfuscatedName("di.l")
    public class210 field1396 = new class210(256);

    @ObfuscatedName("di.g")
    public class210 field1395 = new class210(256);

    public class106(class254 arg0, class254 arg1) {
        this.field1397 = arg0;
        this.field1401 = arg1;
    }

    @ObfuscatedName("di.n(II[II)Lcq;")
    public class101 method2304(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class101 var8 = (class101) this.field1395.method3934(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class99 var9 = class99.method2161(this.field1397, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class101 var10 = var9.method2158();
            this.field1395.method3935(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1337.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("di.h(II[II)Lcq;")
    public class101 method2292(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class101 var8 = (class101) this.field1395.method3934(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class100 var9 = (class100) this.field1396.method3934(var6);
            if (var9 == null) {
                var9 = class100.method2166(this.field1401, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1396.method3935(var9, var6);
            }
            class101 var10 = var9.method2176(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3973();
                this.field1395.method3935(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("di.l(I[II)Lcq;")
    public class101 method2293(int arg0, int[] arg1) {
        if (this.field1397.method4467() == 1) {
            return this.method2304(0, arg0, arg1);
        } else if (this.field1397.method4466(arg0) == 1) {
            return this.method2304(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("di.g(I[IB)Lcq;")
    public class101 method2294(int arg0, int[] arg1) {
        if (this.field1401.method4467() == 1) {
            return this.method2292(0, arg0, arg1);
        } else if (this.field1401.method4466(arg0) == 1) {
            return this.method2292(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
