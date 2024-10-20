package deob;

@ObfuscatedName("dy")
public class class113 {

    @ObfuscatedName("dy.e")
    public class236 field1669;

    @ObfuscatedName("dy.o")
    public class236 field1666;

    @ObfuscatedName("dy.m")
    public class191 field1671 = new class191(256);

    @ObfuscatedName("dy.g")
    public class191 field1667 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1669 = arg0;
        this.field1666 = arg1;
    }

    @ObfuscatedName("dy.e(II[II)Ldg;")
    public class108 method1897(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1667.method3268(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1766(this.field1669, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1774();
            this.field1667.method3259(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1609.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.o(II[IB)Ldg;")
    public class108 method1898(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1667.method3268(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1671.method3268(var6);
            if (var9 == null) {
                var9 = class107.method1785(this.field1666, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1671.method3259(var9, var6);
            }
            class108 var10 = var9.method1787(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3304();
                this.field1667.method3259(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dy.m(I[IB)Ldg;")
    public class108 method1899(int arg0, int[] arg1) {
        if (this.field1669.method3772() == 1) {
            return this.method1897(0, arg0, arg1);
        } else if (this.field1669.method3771(arg0) == 1) {
            return this.method1897(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dy.g(I[II)Ldg;")
    public class108 method1900(int arg0, int[] arg1) {
        if (this.field1666.method3772() == 1) {
            return this.method1898(0, arg0, arg1);
        } else if (this.field1666.method3771(arg0) == 1) {
            return this.method1898(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
