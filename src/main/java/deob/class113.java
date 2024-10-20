package deob;

@ObfuscatedName("du")
public class class113 {

    @ObfuscatedName("du.a")
    public class236 field1657;

    @ObfuscatedName("du.j")
    public class236 field1656;

    @ObfuscatedName("du.n")
    public class191 field1659 = new class191(256);

    @ObfuscatedName("du.r")
    public class191 field1658 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1657 = arg0;
        this.field1656 = arg1;
    }

    @ObfuscatedName("du.a(II[II)Ldm;")
    public class108 method1876(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1658.method3264(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1751(this.field1657, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1744();
            this.field1658.method3260(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1608.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("du.j(II[II)Ldm;")
    public class108 method1875(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1658.method3264(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1659.method3264(var6);
            if (var9 == null) {
                var9 = class107.method1762(this.field1656, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1659.method3260(var9, var6);
            }
            class108 var10 = var9.method1764(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3308();
                this.field1658.method3260(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("du.n(I[II)Ldm;")
    public class108 method1878(int arg0, int[] arg1) {
        if (this.field1657.method3833() == 1) {
            return this.method1876(0, arg0, arg1);
        } else if (this.field1657.method3793(arg0) == 1) {
            return this.method1876(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("du.r(I[II)Ldm;")
    public class108 method1879(int arg0, int[] arg1) {
        if (this.field1656.method3833() == 1) {
            return this.method1875(0, arg0, arg1);
        } else if (this.field1656.method3793(arg0) == 1) {
            return this.method1875(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
