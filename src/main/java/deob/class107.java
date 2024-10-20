package deob;

import java.math.BigInteger;

@ObfuscatedName("di")
public class class107 extends class187 {

    @ObfuscatedName("di.g")
    public byte[] field1839;

    @ObfuscatedName("di.s")
    public int field1835;

    @ObfuscatedName("di.h")
    public static int[] field1836 = new int[256];

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
            field1836[var0] = var1;
        }
    }

    @ObfuscatedName("aq.g([BIIB)I")
    public static int method570(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1836[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("h.s([BII)I")
    public static int method24(byte[] arg0, int arg1) {
        return method570(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1839 = Statics.method2318(arg0);
        this.field1835 = 0;
    }

    public class107(byte[] arg0) {
        this.field1839 = arg0;
        this.field1835 = 0;
    }

    @ObfuscatedName("di.h(II)V")
    public void method2087(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.m(IB)V")
    public void method2088(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1835 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.u(IB)V")
    public void method2089(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1835 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.j(IB)V")
    public void method2253(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 24);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1835 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.b(J)V")
    public void method2091(long arg0) {
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1839[++this.field1835 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1839[++this.field1835 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("di.v(Ljava/lang/String;B)V")
    public void method2092(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1835 += class202.method1942(arg0, 0, arg0.length(), this.field1839, this.field1835);
        this.field1839[++this.field1835 - 1] = 0;
    }

    @ObfuscatedName("di.y(Ljava/lang/String;I)V")
    public void method2093(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1839[++this.field1835 - 1] = 0;
        this.field1835 += class202.method1942(arg0, 0, arg0.length(), this.field1839, this.field1835);
        this.field1839[++this.field1835 - 1] = 0;
    }

    @ObfuscatedName("di.w(Ljava/lang/CharSequence;B)V")
    public void method2094(CharSequence arg0) {
        int var2 = class188.method1365(arg0);
        this.field1839[++this.field1835 - 1] = 0;
        this.method2100(var2);
        this.field1835 += class188.method2778(this.field1839, this.field1835, arg0);
    }

    @ObfuscatedName("di.x([BIII)V")
    public void method2208(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1839[++this.field1835 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("di.k(II)V")
    public void method2096(int arg0) {
        this.field1839[this.field1835 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1839[this.field1835 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1839[this.field1835 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1839[this.field1835 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.o(II)V")
    public void method2097(int arg0) {
        this.field1839[this.field1835 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1839[this.field1835 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.a(IB)V")
    public void method2170(int arg0) {
        this.field1839[this.field1835 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.f(II)V")
    public void method2099(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2087(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2088(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.r(II)V")
    public void method2100(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2087(arg0 >>> 28 | 0x80);
                    }
                    this.method2087(arg0 >>> 21 | 0x80);
                }
                this.method2087(arg0 >>> 14 | 0x80);
            }
            this.method2087(arg0 >>> 7 | 0x80);
        }
        this.method2087(arg0 & 0x7F);
    }

    @ObfuscatedName("di.e(I)I")
    public int method2101() {
        return this.field1839[++this.field1835 - 1] & 0xFF;
    }

    @ObfuscatedName("di.t(B)B")
    public byte method2263() {
        return this.field1839[++this.field1835 - 1];
    }

    @ObfuscatedName("di.c(B)I")
    public int method2166() {
        this.field1835 += 2;
        return ((this.field1839[this.field1835 - 2] & 0xFF) << 8) + (this.field1839[this.field1835 - 1] & 0xFF);
    }

    @ObfuscatedName("di.l(I)I")
    public int method2104() {
        this.field1835 += 2;
        int var1 = ((this.field1839[this.field1835 - 2] & 0xFF) << 8) + (this.field1839[this.field1835 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.n(I)I")
    public int method2105() {
        this.field1835 += 3;
        return (this.field1839[this.field1835 - 1] & 0xFF) + ((this.field1839[this.field1835 - 3] & 0xFF) << 16) + ((this.field1839[this.field1835 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("di.d(I)I")
    public int method2286() {
        this.field1835 += 4;
        return (this.field1839[this.field1835 - 1] & 0xFF) + ((this.field1839[this.field1835 - 2] & 0xFF) << 8) + ((this.field1839[this.field1835 - 3] & 0xFF) << 16) + ((this.field1839[this.field1835 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("di.p(I)J")
    public long method2107() {
        long var1 = (long) this.method2286() & 0xFFFFFFFFL;
        long var3 = (long) this.method2286() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("di.z(I)Ljava/lang/String;")
    public String method2145() {
        if (this.field1839[this.field1835] == 0) {
            this.field1835++;
            return null;
        } else {
            return this.method2137();
        }
    }

    @ObfuscatedName("di.q(I)Ljava/lang/String;")
    public String method2137() {
        int var1 = this.field1835;
        while (this.field1839[++this.field1835 - 1] != 0) {
        }
        int var2 = this.field1835 - var1 - 1;
        return var2 == 0 ? "" : class202.method2859(this.field1839, var1, var2);
    }

    @ObfuscatedName("di.i(I)Ljava/lang/String;")
    public String method2110() {
        byte var1 = this.field1839[++this.field1835 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1835;
        while (this.field1839[++this.field1835 - 1] != 0) {
        }
        int var3 = this.field1835 - var2 - 1;
        return var3 == 0 ? "" : class202.method2859(this.field1839, var2, var3);
    }

    @ObfuscatedName("di.ah(B)Ljava/lang/String;")
    public String method2111() {
        byte var1 = this.field1839[++this.field1835 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2221();
        if (this.field1835 + var2 > this.field1839.length) {
            throw new IllegalStateException("");
        }
        String var3 = class188.method3101(this.field1839, this.field1835, var2);
        this.field1835 += var2;
        return var3;
    }

    @ObfuscatedName("di.aj([BIIB)V")
    public void method2256(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1839[++this.field1835 - 1];
        }
    }

    @ObfuscatedName("di.aq(I)I")
    public int method2113() {
        int var1 = this.field1839[this.field1835] & 0xFF;
        return var1 < 128 ? this.method2101() - 64 : this.method2166() - 49152;
    }

    @ObfuscatedName("di.aa(I)I")
    public int method2114() {
        int var1 = this.field1839[this.field1835] & 0xFF;
        return var1 < 128 ? this.method2101() : this.method2166() - 32768;
    }

    @ObfuscatedName("di.ar(I)I")
    public int method2115() {
        return this.field1839[this.field1835] < 0 ? this.method2286() & Integer.MAX_VALUE : this.method2166();
    }

    @ObfuscatedName("di.at(I)I")
    public int method2221() {
        byte var1 = this.field1839[++this.field1835 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1839[++this.field1835 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("di.av([IIII)V")
    public void method2214(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1835;
        this.field1835 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2286();
            int var8 = this.method2286();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1835 -= 8;
            this.method2253(var7);
            this.method2253(var8);
        }
        this.field1835 = var4;
    }

    @ObfuscatedName("di.af([IIIS)V")
    public void method2118(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1835;
        this.field1835 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2286();
            int var8 = this.method2286();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1835 -= 8;
            this.method2253(var7);
            this.method2253(var8);
        }
        this.field1835 = var4;
    }

    @ObfuscatedName("di.ap(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2119(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1835;
        this.field1835 = 0;
        byte[] var4 = new byte[var3];
        this.method2256(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1835 = 0;
        this.method2088(var7.length);
        this.method2208(var7, 0, var7.length);
    }

    @ObfuscatedName("di.ao(IS)I")
    public int method2230(int arg0) {
        int var2 = method570(this.field1839, arg0, this.field1835);
        this.method2253(var2);
        return var2;
    }

    @ObfuscatedName("di.az(B)Z")
    public boolean method2216() {
        this.field1835 -= 4;
        int var1 = method570(this.field1839, 0, this.field1835);
        int var2 = this.method2286();
        return var1 == var2;
    }

    @ObfuscatedName("di.ac(II)V")
    public void method2122(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.ad(II)V")
    public void method2197(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("di.al(II)V")
    public void method2132(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("di.ay(I)I")
    public int method2125() {
        return this.field1839[++this.field1835 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("di.ag(I)I")
    public int method2126() {
        return -this.field1839[++this.field1835 - 1] & 0xFF;
    }

    @ObfuscatedName("di.ak(I)I")
    public int method2090() {
        return 128 - this.field1839[++this.field1835 - 1] & 0xFF;
    }

    @ObfuscatedName("di.an(I)B")
    public byte method2128() {
        return (byte) (this.field1839[++this.field1835 - 1] - 128);
    }

    @ObfuscatedName("di.ab(B)B")
    public byte method2129() {
        return (byte) (-this.field1839[++this.field1835 - 1]);
    }

    @ObfuscatedName("di.am(B)B")
    public byte method2130() {
        return (byte) (128 - this.field1839[++this.field1835 - 1]);
    }

    @ObfuscatedName("di.aw(II)V")
    public void method2209(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) arg0;
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.as(IS)V")
    public void method2284(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.au(II)V")
    public void method2133(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 + 128);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.ax(B)I")
    public int method2134() {
        this.field1835 += 2;
        return ((this.field1839[this.field1835 - 1] & 0xFF) << 8) + (this.field1839[this.field1835 - 2] & 0xFF);
    }

    @ObfuscatedName("di.ae(B)I")
    public int method2127() {
        this.field1835 += 2;
        return ((this.field1839[this.field1835 - 2] & 0xFF) << 8) + (this.field1839[this.field1835 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("di.ai(S)I")
    public int method2136() {
        this.field1835 += 2;
        return ((this.field1839[this.field1835 - 1] & 0xFF) << 8) + (this.field1839[this.field1835 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("di.bc(S)I")
    public int method2106() {
        this.field1835 += 2;
        int var1 = ((this.field1839[this.field1835 - 1] & 0xFF) << 8) + (this.field1839[this.field1835 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.bg(I)I")
    public int method2138() {
        this.field1835 += 3;
        return (this.field1839[this.field1835 - 3] & 0xFF) + ((this.field1839[this.field1835 - 2] & 0xFF) << 8) + ((this.field1839[this.field1835 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bb(IS)V")
    public void method2139(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) arg0;
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("di.bi(IB)V")
    public void method2140(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
        this.field1839[++this.field1835 - 1] = (byte) arg0;
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 24);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("di.by(II)V")
    public void method2141(int arg0) {
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 16);
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 24);
        this.field1839[++this.field1835 - 1] = (byte) arg0;
        this.field1839[++this.field1835 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.bf(I)I")
    public int method2142() {
        this.field1835 += 4;
        return (this.field1839[this.field1835 - 4] & 0xFF) + ((this.field1839[this.field1835 - 3] & 0xFF) << 8) + ((this.field1839[this.field1835 - 1] & 0xFF) << 24) + ((this.field1839[this.field1835 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bs(I)I")
    public int method2143() {
        this.field1835 += 4;
        return (this.field1839[this.field1835 - 3] & 0xFF) + ((this.field1839[this.field1835 - 4] & 0xFF) << 8) + ((this.field1839[this.field1835 - 1] & 0xFF) << 16) + ((this.field1839[this.field1835 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("di.bw(I)I")
    public int method2156() {
        this.field1835 += 4;
        return (this.field1839[this.field1835 - 2] & 0xFF) + ((this.field1839[this.field1835 - 1] & 0xFF) << 8) + ((this.field1839[this.field1835 - 3] & 0xFF) << 24) + ((this.field1839[this.field1835 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bo([BIII)V")
    public void method2144(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1839[++this.field1835 - 1] - 128);
        }
    }
}
