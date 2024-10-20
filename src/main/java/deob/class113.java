package deob;

@ObfuscatedName("da")
public class class113 {

    @ObfuscatedName("da.w")
    public class239 field1671;

    @ObfuscatedName("da.o")
    public class239 field1672;

    @ObfuscatedName("da.x")
    public class194 field1670 = new class194(256);

    @ObfuscatedName("da.k")
    public class194 field1673 = new class194(256);

    public class113(class239 arg0, class239 arg1) {
        this.field1671 = arg0;
        this.field1672 = arg1;
    }

    @ObfuscatedName("da.w(II[II)Ldv;")
    public class108 method1871(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1673.method3252(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1749(this.field1671, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1756();
            this.field1673.method3253(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1619.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("da.o(II[II)Ldv;")
    public class108 method1872(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1673.method3252(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1670.method3252(var6);
            if (var9 == null) {
                var9 = class107.method1768(this.field1672, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1670.method3253(var9, var6);
            }
            class108 var10 = var9.method1769(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3294();
                this.field1673.method3253(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("da.x(I[IB)Ldv;")
    public class108 method1873(int arg0, int[] arg1) {
        if (this.field1671.method3783() == 1) {
            return this.method1871(0, arg0, arg1);
        } else if (this.field1671.method3798(arg0) == 1) {
            return this.method1871(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("da.k(I[IB)Ldv;")
    public class108 method1884(int arg0, int[] arg1) {
        if (this.field1672.method3783() == 1) {
            return this.method1872(0, arg0, arg1);
        } else if (this.field1672.method3798(arg0) == 1) {
            return this.method1872(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
