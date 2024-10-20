package deob;

@ObfuscatedName("dc")
public class class111 {

    @ObfuscatedName("dc.t")
    public class262 field1577;

    @ObfuscatedName("dc.q")
    public class262 field1576;

    @ObfuscatedName("dc.i")
    public class215 field1579 = new class215(256);

    @ObfuscatedName("dc.a")
    public class215 field1578 = new class215(256);

    public class111(class262 arg0, class262 arg1) {
        this.field1577 = arg0;
        this.field1576 = arg1;
    }

    @ObfuscatedName("dc.t(II[II)Ldp;")
    public class106 method2100(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1578.method3677(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method1994(this.field1577, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method1983();
            this.field1578.method3669(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1521.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dc.q(II[II)Ldp;")
    public class106 method2101(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1578.method3677(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1579.method3677(var6);
            if (var9 == null) {
                var9 = class105.method2003(this.field1576, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1579.method3669(var9, var6);
            }
            class106 var10 = var9.method2016(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3721();
                this.field1578.method3669(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dc.i(I[II)Ldp;")
    public class106 method2102(int arg0, int[] arg1) {
        if (this.field1577.method4205() == 1) {
            return this.method2100(0, arg0, arg1);
        } else if (this.field1577.method4204(arg0) == 1) {
            return this.method2100(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dc.a(I[II)Ldp;")
    public class106 method2103(int arg0, int[] arg1) {
        if (this.field1576.method4205() == 1) {
            return this.method2101(0, arg0, arg1);
        } else if (this.field1576.method4204(arg0) == 1) {
            return this.method2101(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
