package deob;

@ObfuscatedName("dp")
public class class115 {

    @ObfuscatedName("dp.d")
    public class236 field1656;

    @ObfuscatedName("dp.q")
    public class236 field1659;

    @ObfuscatedName("dp.x")
    public class191 field1657 = new class191(256);

    @ObfuscatedName("dp.y")
    public class191 field1658 = new class191(256);

    public class115(class236 arg0, class236 arg1) {
        this.field1656 = arg0;
        this.field1659 = arg1;
    }

    @ObfuscatedName("dp.d(II[II)Ldv;")
    public class110 method1961(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class110 var8 = (class110) this.field1658.method3263(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class108 var9 = class108.method1835(this.field1656, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class110 var10 = var9.method1833();
            this.field1658.method3269(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1599.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dp.q(II[II)Ldv;")
    public class110 method1968(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class110 var8 = (class110) this.field1658.method3263(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class109 var9 = (class109) this.field1657.method3263(var6);
            if (var9 == null) {
                var9 = class109.method1859(this.field1659, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1657.method3269(var9, var6);
            }
            class110 var10 = var9.method1858(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3312();
                this.field1658.method3269(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dp.x(I[IB)Ldv;")
    public class110 method1962(int arg0, int[] arg1) {
        if (this.field1656.method3762() == 1) {
            return this.method1961(0, arg0, arg1);
        } else if (this.field1656.method3761(arg0) == 1) {
            return this.method1961(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dp.y(I[II)Ldv;")
    public class110 method1960(int arg0, int[] arg1) {
        if (this.field1659.method3762() == 1) {
            return this.method1968(0, arg0, arg1);
        } else if (this.field1659.method3761(arg0) == 1) {
            return this.method1968(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
