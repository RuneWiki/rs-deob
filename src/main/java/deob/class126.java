package deob;

@ObfuscatedName("bg")
public class class126 {

    @ObfuscatedName("bg.o")
    public class2 field1904 = new class2(256);

    @ObfuscatedName("bg.j")
    public class81 field1906;

    @ObfuscatedName("bg.t")
    public class2 field1905 = new class2(256);

    @ObfuscatedName("bg.p")
    public class81 field1903;

    @ObfuscatedName("bg.p(II[II)Lbx;")
    public class112 method2126(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class112 var8 = (class112) this.field1905.method20(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class127 var9 = (class127) this.field1904.method20(var6);
            if (var9 == null) {
                var9 = class127.method2146(this.field1903, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1904.method22(var9, var6);
            }
            class112 var10 = var9.method2148(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method44();
                this.field1905.method22(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("bg.o(I[II)Lbx;")
    public class112 method2127(int arg0, int[] arg1) {
        if (this.field1906.method1094() == 1) {
            return this.method2136(0, arg0, arg1);
        } else if (this.field1906.method1093(arg0) == 1) {
            return this.method2136(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bg.t(I[IB)Lbx;")
    public class112 method2128(int arg0, int[] arg1) {
        if (this.field1903.method1094() == 1) {
            return this.method2126(0, arg0, arg1);
        } else if (this.field1903.method1093(arg0) == 1) {
            return this.method2126(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    public class126(class81 arg0, class81 arg1) {
        this.field1906 = arg0;
        this.field1903 = arg1;
    }

    @ObfuscatedName("bg.j(II[II)Lbx;")
    public class112 method2136(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class112 var8 = (class112) this.field1905.method20(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class125 var9 = class125.method2123(this.field1906, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class112 var10 = var9.method2112();
            this.field1905.method22(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1779.length;
            }
            return var10;
        } else {
            return null;
        }
    }
}
