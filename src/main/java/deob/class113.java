package deob;

@ObfuscatedName("dl")
public class class113 {

    @ObfuscatedName("dl.i")
    public class236 field1683;

    @ObfuscatedName("dl.c")
    public class236 field1682;

    @ObfuscatedName("dl.e")
    public class191 field1681 = new class191(256);

    @ObfuscatedName("dl.v")
    public class191 field1684 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1683 = arg0;
        this.field1682 = arg1;
    }

    @ObfuscatedName("dl.i(II[II)Ldi;")
    public class108 method1908(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1684.method3238(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1796(this.field1683, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1785();
            this.field1684.method3234(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1621.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dl.c(II[IB)Ldi;")
    public class108 method1905(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1684.method3238(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1681.method3238(var6);
            if (var9 == null) {
                var9 = class107.method1832(this.field1682, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1681.method3234(var9, var6);
            }
            class108 var10 = var9.method1808(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3278();
                this.field1684.method3234(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dl.e(I[IB)Ldi;")
    public class108 method1903(int arg0, int[] arg1) {
        if (this.field1683.method3781() == 1) {
            return this.method1908(0, arg0, arg1);
        } else if (this.field1683.method3847(arg0) == 1) {
            return this.method1908(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dl.v(I[II)Ldi;")
    public class108 method1906(int arg0, int[] arg1) {
        if (this.field1682.method3781() == 1) {
            return this.method1905(0, arg0, arg1);
        } else if (this.field1682.method3847(arg0) == 1) {
            return this.method1905(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
