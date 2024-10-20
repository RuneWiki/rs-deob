package deob;

@ObfuscatedName("de")
public class class110 {

    @ObfuscatedName("de.p")
    public class247 field1551;

    @ObfuscatedName("de.i")
    public class247 field1554;

    @ObfuscatedName("de.w")
    public class202 field1553 = new class202(256);

    @ObfuscatedName("de.s")
    public class202 field1552 = new class202(256);

    public class110(class247 arg0, class247 arg1) {
        this.field1551 = arg0;
        this.field1554 = arg1;
    }

    @ObfuscatedName("de.p(II[II)Ldp;")
    public class105 method2084(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class105 var8 = (class105) this.field1552.method3517(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = class103.method1961(this.field1551, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class105 var10 = var9.method1965();
            this.field1552.method3518(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1501.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.i(II[II)Ldp;")
    public class105 method2087(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class105 var8 = (class105) this.field1552.method3517(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = (class104) this.field1553.method3517(var6);
            if (var9 == null) {
                var9 = class104.method1977(this.field1554, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1553.method3518(var9, var6);
            }
            class105 var10 = var9.method1969(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3561();
                this.field1552.method3518(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("de.w(I[II)Ldp;")
    public class105 method2085(int arg0, int[] arg1) {
        if (this.field1551.method4045() == 1) {
            return this.method2084(0, arg0, arg1);
        } else if (this.field1551.method4044(arg0) == 1) {
            return this.method2084(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("de.s(I[II)Ldp;")
    public class105 method2086(int arg0, int[] arg1) {
        if (this.field1554.method4045() == 1) {
            return this.method2087(0, arg0, arg1);
        } else if (this.field1554.method4044(arg0) == 1) {
            return this.method2087(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
