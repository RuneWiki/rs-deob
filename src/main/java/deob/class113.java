package deob;

@ObfuscatedName("du")
public class class113 {

    @ObfuscatedName("du.i")
    public class236 field1658;

    @ObfuscatedName("du.h")
    public class236 field1655;

    @ObfuscatedName("du.u")
    public class191 field1656 = new class191(256);

    @ObfuscatedName("du.q")
    public class191 field1657 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1658 = arg0;
        this.field1655 = arg1;
    }

    @ObfuscatedName("du.i(II[II)Ldx;")
    public class108 method1938(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1657.method3331(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1813(this.field1658, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1809();
            this.field1657.method3333(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1603.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("du.h(II[IB)Ldx;")
    public class108 method1939(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1657.method3331(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1656.method3331(var6);
            if (var9 == null) {
                var9 = class107.method1826(this.field1655, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1656.method3333(var9, var6);
            }
            class108 var10 = var9.method1831(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3364();
                this.field1657.method3333(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("du.u(I[II)Ldx;")
    public class108 method1946(int arg0, int[] arg1) {
        if (this.field1658.method3885() == 1) {
            return this.method1938(0, arg0, arg1);
        } else if (this.field1658.method3846(arg0) == 1) {
            return this.method1938(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("du.q(I[II)Ldx;")
    public class108 method1941(int arg0, int[] arg1) {
        if (this.field1655.method3885() == 1) {
            return this.method1939(0, arg0, arg1);
        } else if (this.field1655.method3846(arg0) == 1) {
            return this.method1939(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
