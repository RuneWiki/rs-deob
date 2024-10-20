package deob;

@ObfuscatedName("ds")
public class class112 {

    @ObfuscatedName("ds.d")
    public class243 field1587;

    @ObfuscatedName("ds.x")
    public class243 field1585;

    @ObfuscatedName("ds.k")
    public class198 field1586 = new class198(256);

    @ObfuscatedName("ds.z")
    public class198 field1588 = new class198(256);

    public class112(class243 arg0, class243 arg1) {
        this.field1587 = arg0;
        this.field1585 = arg1;
    }

    @ObfuscatedName("ds.d(II[II)Lda;")
    public class107 method2008(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1588.method3438(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method1863(this.field1587, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method1862();
            this.field1588.method3431(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1528.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.x(II[II)Lda;")
    public class107 method2009(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1588.method3438(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1586.method3438(var6);
            if (var9 == null) {
                var9 = class106.method1886(this.field1585, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1586.method3431(var9, var6);
            }
            class107 var10 = var9.method1903(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3475();
                this.field1588.method3431(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.k(I[II)Lda;")
    public class107 method2010(int arg0, int[] arg1) {
        if (this.field1587.method3947() == 1) {
            return this.method2008(0, arg0, arg1);
        } else if (this.field1587.method3946(arg0) == 1) {
            return this.method2008(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ds.z(I[II)Lda;")
    public class107 method2013(int arg0, int[] arg1) {
        if (this.field1585.method3947() == 1) {
            return this.method2009(0, arg0, arg1);
        } else if (this.field1585.method3946(arg0) == 1) {
            return this.method2009(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
