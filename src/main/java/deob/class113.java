package deob;

@ObfuscatedName("dz")
public class class113 {

    @ObfuscatedName("dz.s")
    public class239 field1659;

    @ObfuscatedName("dz.c")
    public class239 field1660;

    @ObfuscatedName("dz.f")
    public class194 field1663 = new class194(256);

    @ObfuscatedName("dz.m")
    public class194 field1662 = new class194(256);

    public class113(class239 arg0, class239 arg1) {
        this.field1659 = arg0;
        this.field1660 = arg1;
    }

    @ObfuscatedName("dz.s(II[II)Ldl;")
    public class108 method1941(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1662.method3339(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1822(this.field1659, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1821();
            this.field1662.method3330(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1603.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dz.c(II[II)Ldl;")
    public class108 method1942(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1662.method3339(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1663.method3339(var6);
            if (var9 == null) {
                var9 = class107.method1836(this.field1660, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1663.method3330(var9, var6);
            }
            class108 var10 = var9.method1841(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3372();
                this.field1662.method3330(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dz.f(I[II)Ldl;")
    public class108 method1943(int arg0, int[] arg1) {
        if (this.field1659.method3852() == 1) {
            return this.method1941(0, arg0, arg1);
        } else if (this.field1659.method3858(arg0) == 1) {
            return this.method1941(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dz.m(I[II)Ldl;")
    public class108 method1944(int arg0, int[] arg1) {
        if (this.field1660.method3852() == 1) {
            return this.method1942(0, arg0, arg1);
        } else if (this.field1660.method3858(arg0) == 1) {
            return this.method1942(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
