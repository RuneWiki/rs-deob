package deob;

@ObfuscatedName("di")
public class class111 {

    @ObfuscatedName("di.d")
    public class236 field1655;

    @ObfuscatedName("di.k")
    public class236 field1652;

    @ObfuscatedName("di.e")
    public class191 field1653 = new class191(256);

    @ObfuscatedName("di.p")
    public class191 field1659 = new class191(256);

    public class111(class236 arg0, class236 arg1) {
        this.field1655 = arg0;
        this.field1652 = arg1;
    }

    @ObfuscatedName("di.d(II[II)Ldo;")
    public class106 method1974(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1659.method3352(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method1850(this.field1655, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method1851();
            this.field1659.method3358(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1597.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("di.k(II[IB)Ldo;")
    public class106 method1975(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1659.method3352(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1653.method3352(var6);
            if (var9 == null) {
                var9 = class105.method1867(this.field1652, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1653.method3358(var9, var6);
            }
            class106 var10 = var9.method1877(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3407();
                this.field1659.method3358(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("di.e(I[II)Ldo;")
    public class106 method1982(int arg0, int[] arg1) {
        if (this.field1655.method3887() == 1) {
            return this.method1974(0, arg0, arg1);
        } else if (this.field1655.method3889(arg0) == 1) {
            return this.method1974(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("di.p(I[II)Ldo;")
    public class106 method1977(int arg0, int[] arg1) {
        if (this.field1652.method3887() == 1) {
            return this.method1975(0, arg0, arg1);
        } else if (this.field1652.method3889(arg0) == 1) {
            return this.method1975(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
