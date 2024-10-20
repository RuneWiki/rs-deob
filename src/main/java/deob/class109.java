package deob;

@ObfuscatedName("dk")
public class class109 {

    @ObfuscatedName("dk.u")
    public class234 field1432;

    @ObfuscatedName("dk.f")
    public class234 field1431;

    @ObfuscatedName("dk.b")
    public class318 field1430 = new class318(256);

    @ObfuscatedName("dk.g")
    public class318 field1433 = new class318(256);

    public class109(class234 arg0, class234 arg1) {
        this.field1432 = arg0;
        this.field1431 = arg1;
    }

    @ObfuscatedName("dk.u(II[II)Lcw;")
    public class104 method2315(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1433.method5549(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2165(this.field1432, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2163();
            this.field1433.method5550(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1376.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dk.f(II[IB)Lcw;")
    public class104 method2302(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1433.method5549(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1430.method5549(var6);
            if (var9 == null) {
                var9 = class103.method2185(this.field1431, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1430.method5550(var9, var6);
            }
            class104 var10 = var9.method2184(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3332();
                this.field1433.method5550(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dk.b(I[II)Lcw;")
    public class104 method2303(int arg0, int[] arg1) {
        if (this.field1432.method3856() == 1) {
            return this.method2315(0, arg0, arg1);
        } else if (this.field1432.method3878(arg0) == 1) {
            return this.method2315(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dk.g(I[IB)Lcw;")
    public class104 method2304(int arg0, int[] arg1) {
        if (this.field1431.method3856() == 1) {
            return this.method2302(0, arg0, arg1);
        } else if (this.field1431.method3878(arg0) == 1) {
            return this.method2302(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
