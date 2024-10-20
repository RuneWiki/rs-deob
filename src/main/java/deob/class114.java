package deob;

@ObfuscatedName("dp")
public class class114 {

    @ObfuscatedName("dp.e")
    public class237 field1651;

    @ObfuscatedName("dp.n")
    public class237 field1657;

    @ObfuscatedName("dp.g")
    public class192 field1656 = new class192(256);

    @ObfuscatedName("dp.y")
    public class192 field1652 = new class192(256);

    public class114(class237 arg0, class237 arg1) {
        this.field1651 = arg0;
        this.field1657 = arg1;
    }

    @ObfuscatedName("dp.e(II[IB)Ldb;")
    public class109 method1940(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class109 var8 = (class109) this.field1652.method3294(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = class107.method1820(this.field1651, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class109 var10 = var9.method1818();
            this.field1652.method3293(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1601.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dp.n(II[IB)Ldb;")
    public class109 method1941(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class109 var8 = (class109) this.field1652.method3294(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class108 var9 = (class108) this.field1656.method3294(var6);
            if (var9 == null) {
                var9 = class108.method1836(this.field1657, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1656.method3293(var9, var6);
            }
            class109 var10 = var9.method1858(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3333();
                this.field1652.method3293(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dp.g(I[II)Ldb;")
    public class109 method1942(int arg0, int[] arg1) {
        if (this.field1651.method3896() == 1) {
            return this.method1940(0, arg0, arg1);
        } else if (this.field1651.method3828(arg0) == 1) {
            return this.method1940(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dp.y(I[IB)Ldb;")
    public class109 method1945(int arg0, int[] arg1) {
        if (this.field1657.method3896() == 1) {
            return this.method1941(0, arg0, arg1);
        } else if (this.field1657.method3828(arg0) == 1) {
            return this.method1941(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
