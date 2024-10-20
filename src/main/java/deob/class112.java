package deob;

@ObfuscatedName("de")
public class class112 {

    @ObfuscatedName("de.a")
    public class247 field1561;

    @ObfuscatedName("de.w")
    public class247 field1558;

    @ObfuscatedName("de.e")
    public class202 field1560 = new class202(256);

    @ObfuscatedName("de.k")
    public class202 field1559 = new class202(256);

    public class112(class247 arg0, class247 arg1) {
        this.field1561 = arg0;
        this.field1558 = arg1;
    }

    @ObfuscatedName("de.a(II[IB)Ldx;")
    public class107 method1895(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1559.method3387(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method1775(this.field1561, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method1784();
            this.field1559.method3381(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1510.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.w(II[IB)Ldx;")
    public class107 method1896(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1559.method3387(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1560.method3387(var6);
            if (var9 == null) {
                var9 = class106.method1793(this.field1558, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1560.method3381(var9, var6);
            }
            class107 var10 = var9.method1794(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3427();
                this.field1559.method3381(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.e(I[II)Ldx;")
    public class107 method1897(int arg0, int[] arg1) {
        if (this.field1561.method3908() == 1) {
            return this.method1895(0, arg0, arg1);
        } else if (this.field1561.method3907(arg0) == 1) {
            return this.method1895(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("de.k(I[II)Ldx;")
    public class107 method1900(int arg0, int[] arg1) {
        if (this.field1558.method3908() == 1) {
            return this.method1896(0, arg0, arg1);
        } else if (this.field1558.method3907(arg0) == 1) {
            return this.method1896(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
