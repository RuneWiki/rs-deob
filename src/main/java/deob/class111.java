package deob;

@ObfuscatedName("dl")
public class class111 {

    @ObfuscatedName("dl.c")
    public class262 field1587;

    @ObfuscatedName("dl.i")
    public class262 field1586;

    @ObfuscatedName("dl.o")
    public class215 field1588 = new class215(256);

    @ObfuscatedName("dl.j")
    public class215 field1589 = new class215(256);

    public class111(class262 arg0, class262 arg1) {
        this.field1587 = arg0;
        this.field1586 = arg1;
    }

    @ObfuscatedName("dl.c(II[II)Lda;")
    public class106 method2085(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1589.method3677(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method1965(this.field1587, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method1959();
            this.field1589.method3668(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1536.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dl.i(II[II)Lda;")
    public class106 method2087(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1589.method3677(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1588.method3677(var6);
            if (var9 == null) {
                var9 = class105.method1979(this.field1586, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1588.method3668(var9, var6);
            }
            class106 var10 = var9.method1996(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3710();
                this.field1589.method3668(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dl.o(I[II)Lda;")
    public class106 method2088(int arg0, int[] arg1) {
        if (this.field1587.method4204() == 1) {
            return this.method2085(0, arg0, arg1);
        } else if (this.field1587.method4202(arg0) == 1) {
            return this.method2085(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dl.j(I[II)Lda;")
    public class106 method2092(int arg0, int[] arg1) {
        if (this.field1586.method4204() == 1) {
            return this.method2087(0, arg0, arg1);
        } else if (this.field1586.method4202(arg0) == 1) {
            return this.method2087(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
