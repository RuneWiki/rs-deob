package deob;

@ObfuscatedName("cv")
public class class101 {

    @ObfuscatedName("cv.f")
    public class250 field1381;

    @ObfuscatedName("cv.h")
    public class250 field1377;

    @ObfuscatedName("cv.e")
    public class205 field1376 = new class205(256);

    @ObfuscatedName("cv.b")
    public class205 field1379 = new class205(256);

    public class101(class250 arg0, class250 arg1) {
        this.field1381 = arg0;
        this.field1377 = arg1;
    }

    @ObfuscatedName("cv.f(II[IB)Lcb;")
    public class96 method2094(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class96 var8 = (class96) this.field1379.method3759(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class94 var9 = class94.method1971(this.field1381, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class96 var10 = var9.method1959();
            this.field1379.method3761(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1324.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cv.h(II[II)Lcb;")
    public class96 method2093(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class96 var8 = (class96) this.field1379.method3759(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var9 = (class95) this.field1376.method3759(var6);
            if (var9 == null) {
                var9 = class95.method1983(this.field1377, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1376.method3761(var9, var6);
            }
            class96 var10 = var9.method1975(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3812();
                this.field1379.method3761(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("cv.e(I[IB)Lcb;")
    public class96 method2096(int arg0, int[] arg1) {
        if (this.field1381.method4280() == 1) {
            return this.method2094(0, arg0, arg1);
        } else if (this.field1381.method4279(arg0) == 1) {
            return this.method2094(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cv.b(I[II)Lcb;")
    public class96 method2097(int arg0, int[] arg1) {
        if (this.field1377.method4280() == 1) {
            return this.method2093(0, arg0, arg1);
        } else if (this.field1377.method4279(arg0) == 1) {
            return this.method2093(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
