package deob;

@ObfuscatedName("cs")
public class class101 {

    @ObfuscatedName("cs.c")
    public class250 field1396;

    @ObfuscatedName("cs.q")
    public class250 field1395;

    @ObfuscatedName("cs.m")
    public class205 field1397 = new class205(256);

    @ObfuscatedName("cs.j")
    public class205 field1394 = new class205(256);

    public class101(class250 arg0, class250 arg1) {
        this.field1396 = arg0;
        this.field1395 = arg1;
    }

    @ObfuscatedName("cs.c(II[IS)Lcz;")
    public class96 method2046(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class96 var8 = (class96) this.field1394.method3687(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class94 var9 = class94.method1919(this.field1396, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class96 var10 = var9.method1918();
            this.field1394.method3691(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1338.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cs.q(II[IB)Lcz;")
    public class96 method2045(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class96 var8 = (class96) this.field1394.method3687(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class95 var9 = (class95) this.field1397.method3687(var6);
            if (var9 == null) {
                var9 = class95.method1936(this.field1395, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1397.method3691(var9, var6);
            }
            class96 var10 = var9.method1937(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3733();
                this.field1394.method3691(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("cs.m(I[IB)Lcz;")
    public class96 method2048(int arg0, int[] arg1) {
        if (this.field1396.method4223() == 1) {
            return this.method2046(0, arg0, arg1);
        } else if (this.field1396.method4222(arg0) == 1) {
            return this.method2046(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cs.j(I[II)Lcz;")
    public class96 method2051(int arg0, int[] arg1) {
        if (this.field1395.method4223() == 1) {
            return this.method2045(0, arg0, arg1);
        } else if (this.field1395.method4222(arg0) == 1) {
            return this.method2045(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
