package deob;

@ObfuscatedName("bn")
public class class117 {

    @ObfuscatedName("bn.b")
    public class89 field1933;

    @ObfuscatedName("bn.k")
    public class3 field1931 = new class3(256);

    @ObfuscatedName("bn.h")
    public class89 field1930;

    @ObfuscatedName("bn.w")
    public class3 field1932 = new class3(256);

    @ObfuscatedName("bn.h(II[II)Lbq;")
    public class120 method2096(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class120 var8 = (class120) this.field1932.method20(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class121 var9 = (class121) this.field1931.method20(var6);
            if (var9 == null) {
                var9 = class121.method2153(this.field1930, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1931.method14(var9, var6);
            }
            class120 var10 = var9.method2164(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method234();
                this.field1932.method14(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.b(II[IB)Lbq;")
    public class120 method2097(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class120 var8 = (class120) this.field1932.method20(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class118 var9 = class118.method2123(this.field1933, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class120 var10 = var9.method2113();
            this.field1932.method14(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1942.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("bn.k(I[II)Lbq;")
    public class120 method2099(int arg0, int[] arg1) {
        if (this.field1933.method1277() == 1) {
            return this.method2097(0, arg0, arg1);
        } else if (this.field1933.method1276(arg0) == 1) {
            return this.method2097(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bn.w(I[II)Lbq;")
    public class120 method2100(int arg0, int[] arg1) {
        if (this.field1930.method1277() == 1) {
            return this.method2096(0, arg0, arg1);
        } else if (this.field1930.method1276(arg0) == 1) {
            return this.method2096(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    public class117(class89 arg0, class89 arg1) {
        this.field1933 = arg0;
        this.field1930 = arg1;
    }
}
