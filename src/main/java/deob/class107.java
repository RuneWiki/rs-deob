package deob;

import java.math.BigInteger;

@ObfuscatedName("dw")
public class class107 extends class187 {

    @ObfuscatedName("dw.n")
    public byte[] field1829;

    @ObfuscatedName("dw.x")
    public int field1826;

    @ObfuscatedName("dw.k")
    public static int[] field1827 = new int[256];

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1827[var0] = var1;
        }
    }

    @ObfuscatedName("gv.n([BIIB)I")
    public static int method3383(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1827[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("h.x([BII)I")
    public static int method490(byte[] arg0, int arg1) {
        return method3383(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1829 = class109.method2343(arg0);
        this.field1826 = 0;
    }

    public class107(byte[] arg0) {
        this.field1829 = arg0;
        this.field1826 = 0;
    }

    @ObfuscatedName("dw.k(IB)V")
    public void method2124(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.i(II)V")
    public void method2125(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1829[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.d(II)V")
    public void method2126(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1829[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.q(IB)V")
    public void method2127(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 24);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1829[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.m(J)V")
    public void method2128(long arg0) {
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1829[++this.field1826 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1829[++this.field1826 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dw.a(Ljava/lang/String;B)V")
    public void method2176(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1826 += class202.method3107(arg0, 0, arg0.length(), this.field1829, this.field1826);
        this.field1829[++this.field1826 - 1] = 0;
    }

    @ObfuscatedName("dw.w(Ljava/lang/String;I)V")
    public void method2130(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1829[++this.field1826 - 1] = 0;
        this.field1826 += class202.method3107(arg0, 0, arg0.length(), this.field1829, this.field1826);
        this.field1829[++this.field1826 - 1] = 0;
    }

    @ObfuscatedName("dw.e(Ljava/lang/CharSequence;I)V")
    public void method2278(CharSequence arg0) {
        int var2 = class188.method2645(arg0);
        this.field1829[++this.field1826 - 1] = 0;
        this.method2168(var2);
        int var3 = this.field1826;
        byte[] var4 = this.field1829;
        int var5 = this.field1826;
        int var6 = arg0.length();
        int var7 = var5;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(var8);
            if (var9 <= 127) {
                var4[var7++] = (byte) var9;
            } else if (var9 <= 2047) {
                var4[var7++] = (byte) (0xC0 | var9 >> 6);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            } else {
                var4[var7++] = (byte) (0xE0 | var9 >> 12);
                var4[var7++] = (byte) (0x80 | var9 >> 6 & 0x3F);
                var4[var7++] = (byte) (0x80 | var9 & 0x3F);
            }
        }
        int var10 = var7 - var5;
        this.field1826 = var10 + var3;
    }

    @ObfuscatedName("dw.o([BIIB)V")
    public void method2132(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1829[++this.field1826 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dw.v(II)V")
    public void method2190(int arg0) {
        this.field1829[this.field1826 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1829[this.field1826 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1829[this.field1826 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1829[this.field1826 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.z(II)V")
    public void method2134(int arg0) {
        this.field1829[this.field1826 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1829[this.field1826 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.j(II)V")
    public void method2135(int arg0) {
        this.field1829[this.field1826 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.r(IB)V")
    public void method2277(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2124(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2125(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.c(IB)V")
    public void method2168(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2124(arg0 >>> 28 | 0x80);
                    }
                    this.method2124(arg0 >>> 21 | 0x80);
                }
                this.method2124(arg0 >>> 14 | 0x80);
            }
            this.method2124(arg0 >>> 7 | 0x80);
        }
        this.method2124(arg0 & 0x7F);
    }

    @ObfuscatedName("dw.u(I)I")
    public int method2148() {
        return this.field1829[++this.field1826 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.h(I)B")
    public byte method2175() {
        return this.field1829[++this.field1826 - 1];
    }

    @ObfuscatedName("dw.t(I)I")
    public int method2140() {
        this.field1826 += 2;
        return ((this.field1829[this.field1826 - 2] & 0xFF) << 8) + (this.field1829[this.field1826 - 1] & 0xFF);
    }

    @ObfuscatedName("dw.f(B)I")
    public int method2141() {
        this.field1826 += 2;
        int var1 = ((this.field1829[this.field1826 - 2] & 0xFF) << 8) + (this.field1829[this.field1826 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.g(I)I")
    public int method2142() {
        this.field1826 += 3;
        return (this.field1829[this.field1826 - 1] & 0xFF) + ((this.field1829[this.field1826 - 2] & 0xFF) << 8) + ((this.field1829[this.field1826 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dw.s(I)I")
    public int method2183() {
        this.field1826 += 4;
        return (this.field1829[this.field1826 - 1] & 0xFF) + ((this.field1829[this.field1826 - 2] & 0xFF) << 8) + ((this.field1829[this.field1826 - 4] & 0xFF) << 24) + ((this.field1829[this.field1826 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dw.y(B)J")
    public long method2173() {
        long var1 = (long) this.method2183() & 0xFFFFFFFFL;
        long var3 = (long) this.method2183() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dw.p(I)Ljava/lang/String;")
    public String method2146() {
        if (this.field1829[this.field1826] == 0) {
            this.field1826++;
            return null;
        } else {
            return this.method2182();
        }
    }

    @ObfuscatedName("dw.b(I)Ljava/lang/String;")
    public String method2182() {
        int var1 = this.field1826;
        while (this.field1829[++this.field1826 - 1] != 0) {
        }
        int var2 = this.field1826 - var1 - 1;
        return var2 == 0 ? "" : Statics.method2397(this.field1829, var1, var2);
    }

    @ObfuscatedName("dw.l(I)Ljava/lang/String;")
    public String method2303() {
        byte var1 = this.field1829[++this.field1826 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1826;
        while (this.field1829[++this.field1826 - 1] != 0) {
        }
        int var3 = this.field1826 - var2 - 1;
        return var3 == 0 ? "" : Statics.method2397(this.field1829, var2, var3);
    }

    @ObfuscatedName("dw.al(I)Ljava/lang/String;")
    public String method2207() {
        byte var1 = this.field1829[++this.field1826 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2153();
        if (this.field1826 + var2 > this.field1829.length) {
            throw new IllegalStateException("");
        }
        String var3 = class188.method1420(this.field1829, this.field1826, var2);
        this.field1826 += var2;
        return var3;
    }

    @ObfuscatedName("dw.aa([BIII)V")
    public void method2280(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1829[++this.field1826 - 1];
        }
    }

    @ObfuscatedName("dw.ar(B)I")
    public int method2150() {
        int var1 = this.field1829[this.field1826] & 0xFF;
        return var1 < 128 ? this.method2148() - 64 : this.method2140() - 49152;
    }

    @ObfuscatedName("dw.ak(I)I")
    public int method2131() {
        int var1 = this.field1829[this.field1826] & 0xFF;
        return var1 < 128 ? this.method2148() : this.method2140() - 32768;
    }

    @ObfuscatedName("dw.ay(I)I")
    public int method2143() {
        return this.field1829[this.field1826] < 0 ? this.method2183() & Integer.MAX_VALUE : this.method2140();
    }

    @ObfuscatedName("dw.aw(I)I")
    public int method2153() {
        byte var1 = this.field1829[++this.field1826 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1829[++this.field1826 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dw.av([IIIB)V")
    public void method2154(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1826;
        this.field1826 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2183();
            int var8 = this.method2183();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1826 -= 8;
            this.method2127(var7);
            this.method2127(var8);
        }
        this.field1826 = var4;
    }

    @ObfuscatedName("dw.at([IIII)V")
    public void method2155(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1826;
        this.field1826 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2183();
            int var8 = this.method2183();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1826 -= 8;
            this.method2127(var7);
            this.method2127(var8);
        }
        this.field1826 = var4;
    }

    @ObfuscatedName("dw.af(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2156(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1826;
        this.field1826 = 0;
        byte[] var4 = new byte[var3];
        this.method2280(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1826 = 0;
        this.method2125(var7.length);
        this.method2132(var7, 0, var7.length);
    }

    @ObfuscatedName("dw.ae(II)I")
    public int method2245(int arg0) {
        int var2 = method3383(this.field1829, arg0, this.field1826);
        this.method2127(var2);
        return var2;
    }

    @ObfuscatedName("dw.ai(I)Z")
    public boolean method2158() {
        this.field1826 -= 4;
        int var1 = method3383(this.field1829, 0, this.field1826);
        int var2 = this.method2183();
        return var1 == var2;
    }

    @ObfuscatedName("dw.as(II)V")
    public void method2159(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dw.aj(IB)V")
    public void method2160(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dw.au(II)V")
    public void method2161(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dw.az(I)I")
    public int method2295() {
        return this.field1829[++this.field1826 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dw.ao(S)I")
    public int method2166() {
        return -this.field1829[++this.field1826 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.ag(I)I")
    public int method2164() {
        return 128 - this.field1829[++this.field1826 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.aq(B)B")
    public byte method2139() {
        return (byte) (this.field1829[++this.field1826 - 1] - 128);
    }

    @ObfuscatedName("dw.an(I)B")
    public byte method2136() {
        return (byte) (-this.field1829[++this.field1826 - 1]);
    }

    @ObfuscatedName("dw.ax(II)V")
    public void method2167(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) arg0;
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.ap(IS)V")
    public void method2180(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dw.ac(II)V")
    public void method2169(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 + 128);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.ab(I)I")
    public int method2236() {
        this.field1826 += 2;
        return ((this.field1829[this.field1826 - 1] & 0xFF) << 8) + (this.field1829[this.field1826 - 2] & 0xFF);
    }

    @ObfuscatedName("dw.am(B)I")
    public int method2151() {
        this.field1826 += 2;
        return ((this.field1829[this.field1826 - 2] & 0xFF) << 8) + (this.field1829[this.field1826 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dw.ad(I)I")
    public int method2172() {
        this.field1826 += 2;
        return ((this.field1829[this.field1826 - 1] & 0xFF) << 8) + (this.field1829[this.field1826 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dw.ah(I)I")
    public int method2186() {
        this.field1826 += 2;
        int var1 = ((this.field1829[this.field1826 - 1] & 0xFF) << 8) + (this.field1829[this.field1826 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.bf(II)V")
    public void method2174(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1829[++this.field1826 - 1] = (byte) arg0;
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.bx(II)V")
    public void method2217(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) arg0;
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dw.bb(IB)V")
    public void method2292(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1829[++this.field1826 - 1] = (byte) arg0;
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 24);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dw.bv(II)V")
    public void method2177(int arg0) {
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 24);
        this.field1829[++this.field1826 - 1] = (byte) arg0;
        this.field1829[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.bi(I)I")
    public int method2178() {
        this.field1826 += 4;
        return (this.field1829[this.field1826 - 4] & 0xFF) + ((this.field1829[this.field1826 - 3] & 0xFF) << 8) + ((this.field1829[this.field1826 - 2] & 0xFF) << 16) + ((this.field1829[this.field1826 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.bd(I)I")
    public int method2179() {
        this.field1826 += 4;
        return (this.field1829[this.field1826 - 3] & 0xFF) + ((this.field1829[this.field1826 - 4] & 0xFF) << 8) + ((this.field1829[this.field1826 - 1] & 0xFF) << 16) + ((this.field1829[this.field1826 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.bh(I)I")
    public int method2302() {
        this.field1826 += 4;
        return (this.field1829[this.field1826 - 2] & 0xFF) + ((this.field1829[this.field1826 - 1] & 0xFF) << 8) + ((this.field1829[this.field1826 - 3] & 0xFF) << 24) + ((this.field1829[this.field1826 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dw.bn([BIII)V")
    public void method2181(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1829[++this.field1826 - 1];
        }
    }
}
