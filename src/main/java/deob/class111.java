package deob;

@ObfuscatedName("dt")
public class class111 {

    @ObfuscatedName("dt.w")
    public class236 field1656;

    @ObfuscatedName("dt.s")
    public class236 field1652;

    @ObfuscatedName("dt.q")
    public class191 field1654 = new class191(256);

    @ObfuscatedName("dt.o")
    public class191 field1655 = new class191(256);

    public class111(class236 arg0, class236 arg1) {
        this.field1656 = arg0;
        this.field1652 = arg1;
    }

    @ObfuscatedName("dt.w(II[II)Ldi;")
    public class106 method1967(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class106 var8 = (class106) this.field1655.method3387(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class104 var9 = class104.method1846(this.field1656, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class106 var10 = var9.method1834();
            this.field1655.method3374(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1601.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.s(II[II)Ldi;")
    public class106 method1974(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class106 var8 = (class106) this.field1655.method3387(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var9 = (class105) this.field1654.method3387(var6);
            if (var9 == null) {
                var9 = class105.method1856(this.field1652, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1654.method3374(var9, var6);
            }
            class106 var10 = var9.method1857(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3425();
                this.field1655.method3374(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dt.q(I[IB)Ldi;")
    public class106 method1966(int arg0, int[] arg1) {
        if (this.field1656.method3918() == 1) {
            return this.method1967(0, arg0, arg1);
        } else if (this.field1656.method3908(arg0) == 1) {
            return this.method1967(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dt.o(I[IB)Ldi;")
    public class106 method1969(int arg0, int[] arg1) {
        if (this.field1652.method3918() == 1) {
            return this.method1974(0, arg0, arg1);
        } else if (this.field1652.method3908(arg0) == 1) {
            return this.method1974(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
