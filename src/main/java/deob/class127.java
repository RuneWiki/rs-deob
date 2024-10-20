package deob;

@ObfuscatedName("da")
public class class127 {

    public class127() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.s(III)I")
    public static int method614(int arg0, int arg1) {
        int var2 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var2 = arg0 * var2;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var2;
        } else {
            return var2;
        }
    }

    @ObfuscatedName("fs.j(II)I")
    public static int method3201(int arg0) {
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
}
