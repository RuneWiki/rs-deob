package deob;

@ObfuscatedName("dq")
public class class109 {

    @ObfuscatedName("dq.z")
    public class234 field1419;

    @ObfuscatedName("dq.n")
    public class234 field1418;

    @ObfuscatedName("dq.v")
    public class318 field1420 = new class318(256);

    @ObfuscatedName("dq.u")
    public class318 field1417 = new class318(256);

    public class109(class234 arg0, class234 arg1) {
        this.field1419 = arg0;
        this.field1418 = arg1;
    }

    @ObfuscatedName("dq.z(II[II)Lch;")
    public class104 method2258(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1417.method5393(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2129(this.field1419, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2123();
            this.field1417.method5394(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1366.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dq.n(II[II)Lch;")
    public class104 method2246(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1417.method5393(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1420.method5393(var6);
            if (var9 == null) {
                var9 = class103.method2160(this.field1418, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1420.method5394(var9, var6);
            }
            class104 var10 = var9.method2158(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3249();
                this.field1417.method5394(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dq.v(I[II)Lch;")
    public class104 method2244(int arg0, int[] arg1) {
        if (this.field1419.method3739() == 1) {
            return this.method2258(0, arg0, arg1);
        } else if (this.field1419.method3738(arg0) == 1) {
            return this.method2258(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dq.u(I[II)Lch;")
    public class104 method2243(int arg0, int[] arg1) {
        if (this.field1418.method3739() == 1) {
            return this.method2246(0, arg0, arg1);
        } else if (this.field1418.method3738(arg0) == 1) {
            return this.method2246(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
