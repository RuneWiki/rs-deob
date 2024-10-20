package deob;

@ObfuscatedName("ci")
public class class101 {

    @ObfuscatedName("ci.g")
    public class250 field1398;

    @ObfuscatedName("ci.r")
    public class250 field1395;

    @ObfuscatedName("ci.e")
    public class205 field1396 = new class205(256);

    @ObfuscatedName("ci.q")
    public class205 field1397 = new class205(256);

    public class101(class250 arg0, class250 arg1) {
        this.field1398 = arg0;
        this.field1395 = arg1;
    }

    @ObfuscatedName("ci.g(II[II)Lct;")
    public class96 method2269(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class96 var8 = (class96) this.field1397.method3905(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class94 var9 = class94.method2138(this.field1398, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class96 var10 = var9.method2144();
            this.field1397.method3907(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1346.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("ci.r(II[IB)Lct;")
    public class96 method2270(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class96 var8 = (class96) this.field1397.method3905(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var9 = (class95) this.field1396.method3905(var6);
            if (var9 == null) {
                var9 = class95.method2155(this.field1395, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1396.method3907(var9, var6);
            }
            class96 var10 = var9.method2156(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3952();
                this.field1397.method3907(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ci.e(I[II)Lct;")
    public class96 method2273(int arg0, int[] arg1) {
        if (this.field1398.method4448() == 1) {
            return this.method2269(0, arg0, arg1);
        } else if (this.field1398.method4496(arg0) == 1) {
            return this.method2269(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ci.q(I[II)Lct;")
    public class96 method2276(int arg0, int[] arg1) {
        if (this.field1395.method4448() == 1) {
            return this.method2270(0, arg0, arg1);
        } else if (this.field1395.method4496(arg0) == 1) {
            return this.method2270(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
