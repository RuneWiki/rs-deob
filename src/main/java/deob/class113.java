package deob;

@ObfuscatedName("dt")
public class class113 {

    @ObfuscatedName("dt.c")
    public class236 field1631;

    @ObfuscatedName("dt.o")
    public class236 field1627;

    @ObfuscatedName("dt.i")
    public class191 field1629 = new class191(256);

    @ObfuscatedName("dt.u")
    public class191 field1633 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1631 = arg0;
        this.field1627 = arg1;
    }

    @ObfuscatedName("dt.c(II[IB)Ldm;")
    public class108 method1854(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1633.method3251(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1735(this.field1631, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1728();
            this.field1633.method3239(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1577.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.o(II[II)Ldm;")
    public class108 method1868(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1633.method3251(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1629.method3251(var6);
            if (var9 == null) {
                var9 = class107.method1746(this.field1627, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1629.method3239(var9, var6);
            }
            class108 var10 = var9.method1763(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3287();
                this.field1633.method3239(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.i(I[II)Ldm;")
    public class108 method1859(int arg0, int[] arg1) {
        if (this.field1631.method3726() == 1) {
            return this.method1854(0, arg0, arg1);
        } else if (this.field1631.method3739(arg0) == 1) {
            return this.method1854(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dt.u(I[IB)Ldm;")
    public class108 method1858(int arg0, int[] arg1) {
        if (this.field1627.method3726() == 1) {
            return this.method1868(0, arg0, arg1);
        } else if (this.field1627.method3739(arg0) == 1) {
            return this.method1868(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
