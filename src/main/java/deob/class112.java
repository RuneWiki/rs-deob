package deob;

@ObfuscatedName("bx")
public class class112 {

    @ObfuscatedName("bx.b")
    public class3 field1772 = new class3(256);

    @ObfuscatedName("bx.c")
    public class87 field1762;

    @ObfuscatedName("bx.i")
    public class3 field1763 = new class3(256);

    @ObfuscatedName("bx.v")
    public class87 field1765;

    @ObfuscatedName("bx.v(II[II)Lbn;")
    public class117 method1956(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class117 var8 = (class117) this.field1763.method8(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class110 var9 = class110.method1932(this.field1765, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class117 var10 = var9.method1929();
            this.field1763.method9(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1828.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    public class112(class87 arg0, class87 arg1) {
        this.field1765 = arg0;
        this.field1762 = arg1;
    }

    @ObfuscatedName("bx.c(II[II)Lbn;")
    public class117 method1960(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class117 var8 = (class117) this.field1763.method8(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class162 var9 = (class162) this.field1772.method8(var6);
            if (var9 == null) {
                var9 = class162.method2888(this.field1762, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1772.method9(var9, var6);
            }
            class117 var10 = var9.method2891(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method76();
                this.field1763.method9(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bx.i(I[IB)Lbn;")
    public class117 method1964(int arg0, int[] arg1) {
        if (this.field1762.method1307() == 1) {
            return this.method1960(0, arg0, arg1);
        } else if (this.field1762.method1352(arg0) == 1) {
            return this.method1960(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bx.b(I[IB)Lbn;")
    public class117 method1970(int arg0, int[] arg1) {
        if (this.field1765.method1307() == 1) {
            return this.method1956(0, arg0, arg1);
        } else if (this.field1765.method1352(arg0) == 1) {
            return this.method1956(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
