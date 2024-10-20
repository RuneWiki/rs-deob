package deob;

@ObfuscatedName("dt")
public class class113 {

    @ObfuscatedName("dt.i")
    public class236 field1682;

    @ObfuscatedName("dt.w")
    public class236 field1680;

    @ObfuscatedName("dt.a")
    public class191 field1681 = new class191(256);

    @ObfuscatedName("dt.t")
    public class191 field1683 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1682 = arg0;
        this.field1680 = arg1;
    }

    @ObfuscatedName("dt.i(II[II)Ldx;")
    public class108 method1909(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1683.method3249(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1795(this.field1682, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1783();
            this.field1683.method3248(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1631.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.w(II[II)Ldx;")
    public class108 method1907(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1683.method3249(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1681.method3249(var6);
            if (var9 == null) {
                var9 = class107.method1805(this.field1680, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1681.method3248(var9, var6);
            }
            class108 var10 = var9.method1806(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3290();
                this.field1683.method3248(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.a(I[II)Ldx;")
    public class108 method1908(int arg0, int[] arg1) {
        if (this.field1682.method3790() == 1) {
            return this.method1909(0, arg0, arg1);
        } else if (this.field1682.method3787(arg0) == 1) {
            return this.method1909(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dt.t(I[II)Ldx;")
    public class108 method1906(int arg0, int[] arg1) {
        if (this.field1680.method3790() == 1) {
            return this.method1907(0, arg0, arg1);
        } else if (this.field1680.method3787(arg0) == 1) {
            return this.method1907(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
