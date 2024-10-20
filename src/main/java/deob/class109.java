package deob;

@ObfuscatedName("dv")
public class class109 {

    @ObfuscatedName("dv.c")
    public class235 field1434;

    @ObfuscatedName("dv.t")
    public class235 field1429;

    @ObfuscatedName("dv.o")
    public class319 field1428 = new class319(256);

    @ObfuscatedName("dv.e")
    public class319 field1431 = new class319(256);

    public class109(class235 arg0, class235 arg1) {
        this.field1434 = arg0;
        this.field1429 = arg1;
    }

    @ObfuscatedName("dv.c(II[II)Lcv;")
    public class104 method2353(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class104 var8 = (class104) this.field1431.method5527(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class102 var9 = class102.method2212(this.field1434, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class104 var10 = var9.method2210();
            this.field1431.method5535(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1379.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dv.t(II[II)Lcv;")
    public class104 method2345(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class104 var8 = (class104) this.field1431.method5527(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = (class103) this.field1428.method5527(var6);
            if (var9 == null) {
                var9 = class103.method2219(this.field1429, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1428.method5535(var9, var6);
            }
            class104 var10 = var9.method2227(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3351();
                this.field1431.method5535(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dv.o(I[II)Lcv;")
    public class104 method2346(int arg0, int[] arg1) {
        if (this.field1434.method3849() == 1) {
            return this.method2353(0, arg0, arg1);
        } else if (this.field1434.method3848(arg0) == 1) {
            return this.method2353(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dv.e(I[II)Lcv;")
    public class104 method2349(int arg0, int[] arg1) {
        if (this.field1429.method3849() == 1) {
            return this.method2345(0, arg0, arg1);
        } else if (this.field1429.method3848(arg0) == 1) {
            return this.method2345(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
