package deob;

@ObfuscatedName("de")
public class class124 {

    public class124() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.x(III)I")
    public static int method174(int arg0, int arg1) {
        if (arg1 > arg0) {
            int var2 = arg0;
            arg0 = arg1;
            arg1 = var2;
        }
        while (arg1 != 0) {
            int var3 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var3;
        }
        return arg0;
    }

    @ObfuscatedName("j.p(II)I")
    public static int method32(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("fa.k(II)I")
    public static int method3101(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("f.a(IIB)I")
    public static int method206(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }
}
