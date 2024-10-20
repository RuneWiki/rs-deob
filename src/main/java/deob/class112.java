package deob;

@ObfuscatedName("dr")
public class class112 {

    @ObfuscatedName("dr.i")
    public class237 field1676;

    @ObfuscatedName("dr.j")
    public class237 field1677;

    @ObfuscatedName("dr.a")
    public class192 field1673 = new class192(256);

    @ObfuscatedName("dr.r")
    public class192 field1675 = new class192(256);

    public class112(class237 arg0, class237 arg1) {
        this.field1676 = arg0;
        this.field1677 = arg1;
    }

    @ObfuscatedName("dr.i(II[II)Ldp;")
    public class107 method1918(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1675.method3358(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method1794(this.field1676, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method1787();
            this.field1675.method3359(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1617.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dr.j(II[IB)Ldp;")
    public class107 method1908(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1675.method3358(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1673.method3358(var6);
            if (var9 == null) {
                var9 = class106.method1821(this.field1677, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1673.method3359(var9, var6);
            }
            class107 var10 = var9.method1812(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3397();
                this.field1675.method3359(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dr.a(I[IS)Ldp;")
    public class107 method1909(int arg0, int[] arg1) {
        if (this.field1676.method3906() == 1) {
            return this.method1918(0, arg0, arg1);
        } else if (this.field1676.method3835(arg0) == 1) {
            return this.method1918(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dr.r(I[IB)Ldp;")
    public class107 method1923(int arg0, int[] arg1) {
        if (this.field1677.method3906() == 1) {
            return this.method1908(0, arg0, arg1);
        } else if (this.field1677.method3835(arg0) == 1) {
            return this.method1908(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
