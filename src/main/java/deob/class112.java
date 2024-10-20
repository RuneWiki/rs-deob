package deob;

@ObfuscatedName("dg")
public class class112 {

    @ObfuscatedName("dg.b")
    public class243 field1580;

    @ObfuscatedName("dg.s")
    public class243 field1578;

    @ObfuscatedName("dg.r")
    public class198 field1577 = new class198(256);

    @ObfuscatedName("dg.g")
    public class198 field1582 = new class198(256);

    public class112(class243 arg0, class243 arg1) {
        this.field1580 = arg0;
        this.field1578 = arg1;
    }

    @ObfuscatedName("dg.b(II[II)Ldn;")
    public class107 method1934(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1582.method3340(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method1805(this.field1580, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method1791();
            this.field1582.method3352(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1520.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dg.s(II[IS)Ldn;")
    public class107 method1932(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1582.method3340(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1577.method3340(var6);
            if (var9 == null) {
                var9 = class106.method1815(this.field1578, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1577.method3352(var9, var6);
            }
            class107 var10 = var9.method1823(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3392();
                this.field1582.method3352(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dg.r(I[IS)Ldn;")
    public class107 method1940(int arg0, int[] arg1) {
        if (this.field1580.method3828() == 1) {
            return this.method1934(0, arg0, arg1);
        } else if (this.field1580.method3883(arg0) == 1) {
            return this.method1934(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dg.g(I[II)Ldn;")
    public class107 method1935(int arg0, int[] arg1) {
        if (this.field1578.method3828() == 1) {
            return this.method1932(0, arg0, arg1);
        } else if (this.field1578.method3883(arg0) == 1) {
            return this.method1932(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
