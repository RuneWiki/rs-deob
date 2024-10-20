package deob;

@ObfuscatedName("dg")
public class class113 {

    @ObfuscatedName("dg.p")
    public class236 field1669;

    @ObfuscatedName("dg.m")
    public class236 field1662;

    @ObfuscatedName("dg.e")
    public class191 field1671 = new class191(256);

    @ObfuscatedName("dg.t")
    public class191 field1664 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1669 = arg0;
        this.field1662 = arg1;
    }

    @ObfuscatedName("dg.p(II[II)Ldc;")
    public class108 method1864(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1664.method3190(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1725(this.field1669, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1721();
            this.field1664.method3191(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1606.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dg.m(II[II)Ldc;")
    public class108 method1861(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1664.method3190(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1671.method3190(var6);
            if (var9 == null) {
                var9 = class107.method1737(this.field1662, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1671.method3191(var9, var6);
            }
            class108 var10 = var9.method1738(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3234();
                this.field1664.method3191(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dg.e(I[IB)Ldc;")
    public class108 method1858(int arg0, int[] arg1) {
        if (this.field1669.method3716() == 1) {
            return this.method1864(0, arg0, arg1);
        } else if (this.field1669.method3784(arg0) == 1) {
            return this.method1864(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dg.t(I[IS)Ldc;")
    public class108 method1859(int arg0, int[] arg1) {
        if (this.field1662.method3716() == 1) {
            return this.method1861(0, arg0, arg1);
        } else if (this.field1662.method3784(arg0) == 1) {
            return this.method1861(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
