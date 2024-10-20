package deob;

@ObfuscatedName("dy")
public class class114 {

    @ObfuscatedName("dy.j")
    public class237 field1674;

    @ObfuscatedName("dy.h")
    public class237 field1678;

    @ObfuscatedName("dy.f")
    public class192 field1675 = new class192(256);

    @ObfuscatedName("dy.p")
    public class192 field1676 = new class192(256);

    public class114(class237 arg0, class237 arg1) {
        this.field1674 = arg0;
        this.field1678 = arg1;
    }

    @ObfuscatedName("dy.j(II[II)Lde;")
    public class109 method1925(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class109 var8 = (class109) this.field1676.method3281(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = class107.method1798(this.field1674, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class109 var10 = var9.method1801();
            this.field1676.method3274(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1619.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.h(II[IS)Lde;")
    public class109 method1937(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class109 var8 = (class109) this.field1676.method3281(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class108 var9 = (class108) this.field1675.method3281(var6);
            if (var9 == null) {
                var9 = class108.method1826(this.field1678, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1675.method3274(var9, var6);
            }
            class109 var10 = var9.method1814(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3314();
                this.field1676.method3274(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.f(I[II)Lde;")
    public class109 method1927(int arg0, int[] arg1) {
        if (this.field1674.method3785() == 1) {
            return this.method1925(0, arg0, arg1);
        } else if (this.field1674.method3784(arg0) == 1) {
            return this.method1925(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dy.p(I[II)Lde;")
    public class109 method1928(int arg0, int[] arg1) {
        if (this.field1678.method3785() == 1) {
            return this.method1937(0, arg0, arg1);
        } else if (this.field1678.method3784(arg0) == 1) {
            return this.method1937(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
