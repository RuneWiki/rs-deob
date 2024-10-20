package deob;

@ObfuscatedName("ds")
public class class106 {

    @ObfuscatedName("ds.a")
    public class255 field1423;

    @ObfuscatedName("ds.s")
    public class255 field1421;

    @ObfuscatedName("ds.g")
    public class210 field1422 = new class210(256);

    @ObfuscatedName("ds.x")
    public class210 field1424 = new class210(256);

    public class106(class255 arg0, class255 arg1) {
        this.field1423 = arg0;
        this.field1421 = arg1;
    }

    @ObfuscatedName("ds.a(II[II)Lce;")
    public class101 method2312(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class101 var8 = (class101) this.field1424.method3911(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class99 var9 = class99.method2175(this.field1423, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class101 var10 = var9.method2188();
            this.field1424.method3920(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1371.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.s(II[II)Lce;")
    public class101 method2306(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class101 var8 = (class101) this.field1424.method3911(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class100 var9 = (class100) this.field1422.method3911(var6);
            if (var9 == null) {
                var9 = class100.method2197(this.field1421, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1422.method3920(var9, var6);
            }
            class101 var10 = var9.method2199(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3960();
                this.field1424.method3920(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ds.g(I[II)Lce;")
    public class101 method2307(int arg0, int[] arg1) {
        if (this.field1423.method4434() == 1) {
            return this.method2312(0, arg0, arg1);
        } else if (this.field1423.method4419(arg0) == 1) {
            return this.method2312(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ds.x(I[IB)Lce;")
    public class101 method2308(int arg0, int[] arg1) {
        if (this.field1421.method4434() == 1) {
            return this.method2306(0, arg0, arg1);
        } else if (this.field1421.method4419(arg0) == 1) {
            return this.method2306(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
