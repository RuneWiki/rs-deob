package deob;

@ObfuscatedName("dc")
public class class111 {

    @ObfuscatedName("dc.g")
    public class262 field1573;

    @ObfuscatedName("dc.e")
    public class262 field1572;

    @ObfuscatedName("dc.b")
    public class215 field1575 = new class215(256);

    @ObfuscatedName("dc.z")
    public class215 field1574 = new class215(256);

    public class111(class262 arg0, class262 arg1) {
        this.field1573 = arg0;
        this.field1572 = arg1;
    }

    @ObfuscatedName("dc.g(II[II)Ldt;")
    public class106 method2204(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1574.method3740(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method2094(this.field1573, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method2091();
            this.field1574.method3741(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1520.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dc.e(II[IS)Ldt;")
    public class106 method2205(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1574.method3740(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1575.method3740(var6);
            if (var9 == null) {
                var9 = class105.method2114(this.field1572, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1575.method3741(var9, var6);
            }
            class106 var10 = var9.method2110(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3796();
                this.field1574.method3741(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dc.b(I[IB)Ldt;")
    public class106 method2206(int arg0, int[] arg1) {
        if (this.field1573.method4280() == 1) {
            return this.method2204(0, arg0, arg1);
        } else if (this.field1573.method4279(arg0) == 1) {
            return this.method2204(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dc.z(I[II)Ldt;")
    public class106 method2207(int arg0, int[] arg1) {
        if (this.field1572.method4280() == 1) {
            return this.method2205(0, arg0, arg1);
        } else if (this.field1572.method4279(arg0) == 1) {
            return this.method2205(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
