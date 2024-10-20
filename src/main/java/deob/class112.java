package deob;

@ObfuscatedName("de")
public class class112 {

    @ObfuscatedName("de.n")
    public class247 field1580;

    @ObfuscatedName("de.v")
    public class247 field1578;

    @ObfuscatedName("de.y")
    public class202 field1581 = new class202(256);

    @ObfuscatedName("de.r")
    public class202 field1579 = new class202(256);

    public class112(class247 arg0, class247 arg1) {
        this.field1580 = arg0;
        this.field1578 = arg1;
    }

    @ObfuscatedName("de.n(II[II)Ldp;")
    public class107 method1959(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1579.method3416(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method1831(this.field1580, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method1830();
            this.field1579.method3417(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1523.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.v(II[II)Ldp;")
    public class107 method1958(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1579.method3416(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1581.method3416(var6);
            if (var9 == null) {
                var9 = class106.method1872(this.field1578, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1581.method3417(var9, var6);
            }
            class107 var10 = var9.method1854(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3474();
                this.field1579.method3417(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.y(I[II)Ldp;")
    public class107 method1961(int arg0, int[] arg1) {
        if (this.field1580.method3929() == 1) {
            return this.method1959(0, arg0, arg1);
        } else if (this.field1580.method3921(arg0) == 1) {
            return this.method1959(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("de.r(I[II)Ldp;")
    public class107 method1960(int arg0, int[] arg1) {
        if (this.field1578.method3929() == 1) {
            return this.method1958(0, arg0, arg1);
        } else if (this.field1578.method3921(arg0) == 1) {
            return this.method1958(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
