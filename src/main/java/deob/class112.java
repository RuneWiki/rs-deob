package deob;

@ObfuscatedName("dn")
public class class112 {

    @ObfuscatedName("dn.m")
    public class243 field1585;

    @ObfuscatedName("dn.p")
    public class243 field1584;

    @ObfuscatedName("dn.i")
    public class198 field1589 = new class198(256);

    @ObfuscatedName("dn.j")
    public class198 field1586 = new class198(256);

    public class112(class243 arg0, class243 arg1) {
        this.field1585 = arg0;
        this.field1584 = arg1;
    }

    @ObfuscatedName("dn.m(II[II)Lde;")
    public class107 method1980(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1586.method3444(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method1859(this.field1585, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method1866();
            this.field1586.method3431(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1528.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dn.p(II[IB)Lde;")
    public class107 method1981(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1586.method3444(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1589.method3444(var6);
            if (var9 == null) {
                var9 = class106.method1885(this.field1584, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1589.method3431(var9, var6);
            }
            class107 var10 = var9.method1886(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3476();
                this.field1586.method3431(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dn.i(I[II)Lde;")
    public class107 method1982(int arg0, int[] arg1) {
        if (this.field1585.method3942() == 1) {
            return this.method1980(0, arg0, arg1);
        } else if (this.field1585.method3941(arg0) == 1) {
            return this.method1980(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dn.j(I[IB)Lde;")
    public class107 method1983(int arg0, int[] arg1) {
        if (this.field1584.method3942() == 1) {
            return this.method1981(0, arg0, arg1);
        } else if (this.field1584.method3941(arg0) == 1) {
            return this.method1981(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
