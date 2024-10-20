package deob;

@ObfuscatedName("dk")
public class class113 {

    @ObfuscatedName("dk.n")
    public class236 field1679;

    @ObfuscatedName("dk.p")
    public class236 field1673;

    @ObfuscatedName("dk.i")
    public class191 field1674 = new class191(256);

    @ObfuscatedName("dk.j")
    public class191 field1672 = new class191(256);

    public class113(class236 arg0, class236 arg1) {
        this.field1679 = arg0;
        this.field1673 = arg1;
    }

    @ObfuscatedName("dk.n(II[IB)Ldh;")
    public class108 method1917(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5;
        class108 var8 = (class108) this.field1672.method3295(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class106 var9 = class106.method1788(this.field1679, arg0, arg1);
            if (var9 == null) {
                return null;
            }
            class108 var10 = var9.method1786();
            this.field1672.method3296(var10, var6);
            if (arg2 != null) {
                arg2[0] -= var10.field1614.length;
            }
            return var10;
        } else {
            return null;
        }
    }

    @ObfuscatedName("dk.p(II[II)Ldh;")
    public class108 method1927(int arg0, int arg1, int[] arg2) {
        int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
        int var5 = var4 | arg0 << 16;
        long var6 = (long) var5 ^ 0x100000000L;
        class108 var8 = (class108) this.field1672.method3295(var6);
        if (var8 != null) {
            return var8;
        } else if (arg2 == null || arg2[0] > 0) {
            class107 var9 = (class107) this.field1674.method3295(var6);
            if (var9 == null) {
                var9 = class107.method1820(this.field1673, arg0, arg1);
                if (var9 == null) {
                    return null;
                }
                this.field1674.method3296(var9, var6);
            }
            class108 var10 = var9.method1808(arg2);
            if (var10 == null) {
                return null;
            } else {
                var9.method3347();
                this.field1672.method3296(var10, var6);
                return var10;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("dk.i(I[II)Ldh;")
    public class108 method1919(int arg0, int[] arg1) {
        if (this.field1679.method3920() == 1) {
            return this.method1917(0, arg0, arg1);
        } else if (this.field1679.method3879(arg0) == 1) {
            return this.method1917(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dk.j(I[IB)Ldh;")
    public class108 method1923(int arg0, int[] arg1) {
        if (this.field1673.method3920() == 1) {
            return this.method1927(0, arg0, arg1);
        } else if (this.field1673.method3879(arg0) == 1) {
            return this.method1927(arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
