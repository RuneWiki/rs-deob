package deob;

@ObfuscatedName("dh")
public class class109 {

    @ObfuscatedName("dh.s")
    public class234 field1421;

    @ObfuscatedName("dh.j")
    public class234 field1428;

    @ObfuscatedName("dh.i")
    public class318 field1423 = new class318(256);

    @ObfuscatedName("dh.k")
    public class318 field1422 = new class318(256);

    public class109(class234 arg0, class234 arg1) {
        this.field1421 = arg0;
        this.field1428 = arg1;
    }

    @ObfuscatedName("dh.s(II[II)Lco;")
    public class104 method2270(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1422.method5434(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2146(this.field1421, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2137();
            this.field1422.method5429(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1364.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dh.j(II[II)Lco;")
    public class104 method2271(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1422.method5434(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1423.method5434(var6);
            if (var9 == null) {
                var9 = class103.method2159(this.field1428, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1423.method5429(var9, var6);
            }
            class104 var10 = var9.method2160(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3304();
                this.field1422.method5429(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dh.i(I[II)Lco;")
    public class104 method2274(int arg0, int[] arg1) {
        if (this.field1421.method3777() == 1) {
            return this.method2270(0, arg0, arg1);
        } else if (this.field1421.method3776(arg0) == 1) {
            return this.method2270(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dh.k(I[IB)Lco;")
    public class104 method2273(int arg0, int[] arg1) {
        if (this.field1428.method3777() == 1) {
            return this.method2271(0, arg0, arg1);
        } else if (this.field1428.method3776(arg0) == 1) {
            return this.method2271(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
