package deob;

@ObfuscatedName("dm")
public class class109 {

    @ObfuscatedName("dm.a")
    public class234 field1420;

    @ObfuscatedName("dm.t")
    public class234 field1417;

    @ObfuscatedName("dm.n")
    public class318 field1418 = new class318(256);

    @ObfuscatedName("dm.q")
    public class318 field1419 = new class318(256);

    public class109(class234 arg0, class234 arg1) {
        this.field1420 = arg0;
        this.field1417 = arg1;
    }

    @ObfuscatedName("dm.a(II[II)Lca;")
    public class104 method2405(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1419.method5528(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2280(this.field1420, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2270();
            this.field1419.method5529(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1365.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dm.t(II[II)Lca;")
    public class104 method2406(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1419.method5528(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1418.method5528(var6);
            if (var9 == null) {
                var9 = class103.method2316(this.field1417, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1418.method5529(var9, var6);
            }
            class104 var10 = var9.method2318(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3386();
                this.field1419.method5529(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dm.n(I[II)Lca;")
    public class104 method2407(int arg0, int[] arg1) {
        if (this.field1420.method3886() == 1) {
            return this.method2405(0, arg0, arg1);
        } else if (this.field1420.method3953(arg0) == 1) {
            return this.method2405(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dm.q(I[II)Lca;")
    public class104 method2408(int arg0, int[] arg1) {
        if (this.field1417.method3886() == 1) {
            return this.method2406(0, arg0, arg1);
        } else if (this.field1417.method3953(arg0) == 1) {
            return this.method2406(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
