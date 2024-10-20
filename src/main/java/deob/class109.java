package deob;

@ObfuscatedName("df")
public class class109 {

    @ObfuscatedName("df.q")
    public class234 field1447;

    @ObfuscatedName("df.w")
    public class234 field1450;

    @ObfuscatedName("df.e")
    public class319 field1444 = new class319(256);

    @ObfuscatedName("df.p")
    public class319 field1442 = new class319(256);

    public class109(class234 arg0, class234 arg1) {
        this.field1447 = arg0;
        this.field1450 = arg1;
    }

    @ObfuscatedName("df.q(II[IB)Lcd;")
    public class104 method2262(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1442.method5479(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2135(this.field1447, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2131();
            this.field1442.method5478(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1391.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("df.w(II[II)Lcd;")
    public class104 method2267(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1442.method5479(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1444.method5479(var6);
            if (var9 == null) {
                var9 = class103.method2156(this.field1450, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1444.method5478(var9, var6);
            }
            class104 var10 = var9.method2171(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3286();
                this.field1442.method5478(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("df.e(I[IB)Lcd;")
    public class104 method2264(int arg0, int[] arg1) {
        if (this.field1447.method3863() == 1) {
            return this.method2262(0, arg0, arg1);
        } else if (this.field1447.method3785(arg0) == 1) {
            return this.method2262(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("df.p(I[II)Lcd;")
    public class104 method2265(int arg0, int[] arg1) {
        if (this.field1450.method3863() == 1) {
            return this.method2267(0, arg0, arg1);
        } else if (this.field1450.method3785(arg0) == 1) {
            return this.method2267(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
