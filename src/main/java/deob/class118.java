package deob;

@ObfuscatedName("do")
public class class118 {

    @ObfuscatedName("do.m")
    public class244 field1475;

    @ObfuscatedName("do.o")
    public class244 field1470;

    @ObfuscatedName("do.q")
    public class328 field1471 = new class328(256);

    @ObfuscatedName("do.j")
    public class328 field1472 = new class328(256);

    public class118(class244 arg0, class244 arg1) {
        this.field1475 = arg0;
        this.field1470 = arg1;
    }

    @ObfuscatedName("do.m(II[II)Ldp;")
    public class113 method2392(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class113 var8 = (class113) this.field1472.method5641(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class111 var9 = class111.method2253(this.field1475, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class113 var10 = var9.method2248();
            this.field1472.method5643(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1423.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("do.o(II[II)Ldp;")
    public class113 method2380(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class113 var8 = (class113) this.field1472.method5641(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class112 var9 = (class112) this.field1471.method5641(var6);
            if (var9 == null) {
                var9 = class112.method2270(this.field1470, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1471.method5643(var9, var6);
            }
            class113 var10 = var9.method2272(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3388();
                this.field1472.method5643(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("do.q(I[IB)Ldp;")
    public class113 method2381(int arg0, int[] arg1) {
        if (this.field1475.method3945() == 1) {
            return this.method2392(0, arg0, arg1);
        } else if (this.field1475.method3903(arg0) == 1) {
            return this.method2392(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("do.j(I[II)Ldp;")
    public class113 method2382(int arg0, int[] arg1) {
        if (this.field1470.method3945() == 1) {
            return this.method2380(0, arg0, arg1);
        } else if (this.field1470.method3903(arg0) == 1) {
            return this.method2380(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
