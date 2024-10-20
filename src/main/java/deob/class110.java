package deob;

@ObfuscatedName("do")
public class class110 {

    @ObfuscatedName("do.b")
    public class256 field1552;

    @ObfuscatedName("do.q")
    public class256 field1548;

    @ObfuscatedName("do.o")
    public class211 field1547 = new class211(256);

    @ObfuscatedName("do.p")
    public class211 field1550 = new class211(256);

    public class110(class256 arg0, class256 arg1) {
        this.field1552 = arg0;
        this.field1548 = arg1;
    }

    @ObfuscatedName("do.b(II[IB)Ldb;")
    public class105 method2104(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class105 var8 = (class105) this.field1550.method3674(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class103 var9 = class103.method1985(this.field1552, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class105 var10 = var9.method1975();
            this.field1550.method3675(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1495.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("do.q(II[II)Ldb;")
    public class105 method2109(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class105 var8 = (class105) this.field1550.method3674(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = (class104) this.field1547.method3674(var6);
            if (var9 == null) {
                var9 = class104.method1997(this.field1548, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1547.method3675(var9, var6);
            }
            class105 var10 = var9.method1998(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3726();
                this.field1550.method3675(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("do.o(I[II)Ldb;")
    public class105 method2106(int arg0, int[] arg1) {
        if (this.field1552.method4173() == 1) {
            return this.method2104(0, arg0, arg1);
        } else if (this.field1552.method4172(arg0) == 1) {
            return this.method2104(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("do.p(I[II)Ldb;")
    public class105 method2107(int arg0, int[] arg1) {
        if (this.field1548.method4173() == 1) {
            return this.method2109(0, arg0, arg1);
        } else if (this.field1548.method4172(arg0) == 1) {
            return this.method2109(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
