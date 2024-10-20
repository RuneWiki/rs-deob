package deob;

@ObfuscatedName("dh")
public class class112 {

    @ObfuscatedName("dh.s")
    public class247 field1581;

    @ObfuscatedName("dh.g")
    public class247 field1580;

    @ObfuscatedName("dh.m")
    public class202 field1582 = new class202(256);

    @ObfuscatedName("dh.h")
    public class202 field1583 = new class202(256);

    public class112(class247 arg0, class247 arg1) {
        this.field1581 = arg0;
        this.field1580 = arg1;
    }

    @ObfuscatedName("dh.s(II[II)Ldz;")
    public class107 method2174(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class107 var8 = (class107) this.field1583.method3704(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = class105.method2043(this.field1581, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class107 var10 = var9.method2040();
            this.field1583.method3691(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1527.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dh.g(II[II)Ldz;")
    public class107 method2175(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class107 var8 = (class107) this.field1583.method3704(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = (class106) this.field1582.method3704(var6);
            if (var9 == null) {
                var9 = class106.method2062(this.field1580, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1582.method3691(var9, var6);
            }
            class107 var10 = var9.method2063(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3740();
                this.field1583.method3691(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dh.m(I[II)Ldz;")
    public class107 method2176(int arg0, int[] arg1) {
        if (this.field1581.method4197() == 1) {
            return this.method2174(0, arg0, arg1);
        } else if (this.field1581.method4209(arg0) == 1) {
            return this.method2174(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dh.h(I[II)Ldz;")
    public class107 method2186(int arg0, int[] arg1) {
        if (this.field1580.method4197() == 1) {
            return this.method2175(0, arg0, arg1);
        } else if (this.field1580.method4209(arg0) == 1) {
            return this.method2175(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
