package deob;

import java.math.BigInteger;

@ObfuscatedName("di")
public class class107 extends class186 {

    @ObfuscatedName("di.k")
    public byte[] field1857;

    @ObfuscatedName("di.b")
    public int field1862;

    @ObfuscatedName("di.e")
    public static int[] field1858 = new int[256];

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
            field1858[var0] = var1;
        }
    }

    public class107(int arg0) {
        this.field1857 = class109.method2346(arg0);
        this.field1862 = 0;
    }

    public class107(byte[] arg0) {
        this.field1857 = arg0;
        this.field1862 = 0;
    }

    @ObfuscatedName("di.k(II)V")
    public void method2102(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.b(IB)V")
    public void method2275(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
        this.field1857[++this.field1862 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.e(IB)V")
    public void method2104(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 16);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
        this.field1857[++this.field1862 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.i(IB)V")
    public void method2303(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 24);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 16);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
        this.field1857[++this.field1862 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.t(J)V")
    public void method2264(long arg0) {
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1857[++this.field1862 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1857[++this.field1862 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("an.z(Ljava/lang/String;I)I")
    public static int method598(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("di.g(Ljava/lang/String;I)V")
    public void method2107(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1862 += class201.method3147(arg0, 0, arg0.length(), this.field1857, this.field1862);
        this.field1857[++this.field1862 - 1] = 0;
    }

    @ObfuscatedName("di.c(Ljava/lang/String;I)V")
    public void method2108(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1857[++this.field1862 - 1] = 0;
        this.field1862 += class201.method3147(arg0, 0, arg0.length(), this.field1857, this.field1862);
        this.field1857[++this.field1862 - 1] = 0;
    }

    @ObfuscatedName("di.o(Ljava/lang/CharSequence;I)V")
    public void method2109(CharSequence arg0) {
        int var2 = class187.method3149(arg0);
        this.field1857[++this.field1862 - 1] = 0;
        this.method2114(var2);
        this.field1862 += class187.method510(this.field1857, this.field1862, arg0);
    }

    @ObfuscatedName("di.q([BIII)V")
    public void method2110(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1857[++this.field1862 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("di.w(II)V")
    public void method2268(int arg0) {
        this.field1857[this.field1862 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1857[this.field1862 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1857[this.field1862 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1857[this.field1862 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.y(II)V")
    public void method2262(int arg0) {
        this.field1857[this.field1862 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1857[this.field1862 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.p(II)V")
    public void method2143(int arg0) {
        this.field1857[this.field1862 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("di.m(II)V")
    public void method2229(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2102(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2275(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("di.a(IB)V")
    public void method2114(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2102(arg0 >>> 28 | 0x80);
                    }
                    this.method2102(arg0 >>> 21 | 0x80);
                }
                this.method2102(arg0 >>> 14 | 0x80);
            }
            this.method2102(arg0 >>> 7 | 0x80);
        }
        this.method2102(arg0 & 0x7F);
    }

    @ObfuscatedName("di.u(I)I")
    public int method2115() {
        return this.field1857[++this.field1862 - 1] & 0xFF;
    }

    @ObfuscatedName("di.n(B)B")
    public byte method2116() {
        return this.field1857[++this.field1862 - 1];
    }

    @ObfuscatedName("di.x(I)I")
    public int method2117() {
        this.field1862 += 2;
        return ((this.field1857[this.field1862 - 2] & 0xFF) << 8) + (this.field1857[this.field1862 - 1] & 0xFF);
    }

    @ObfuscatedName("di.f(B)I")
    public int method2118() {
        this.field1862 += 2;
        int var1 = ((this.field1857[this.field1862 - 2] & 0xFF) << 8) + (this.field1857[this.field1862 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("di.v(B)I")
    public int method2119() {
        this.field1862 += 3;
        return (this.field1857[this.field1862 - 1] & 0xFF) + ((this.field1857[this.field1862 - 3] & 0xFF) << 16) + ((this.field1857[this.field1862 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("di.s(I)I")
    public int method2120() {
        this.field1862 += 4;
        return (this.field1857[this.field1862 - 1] & 0xFF) + ((this.field1857[this.field1862 - 2] & 0xFF) << 8) + ((this.field1857[this.field1862 - 4] & 0xFF) << 24) + ((this.field1857[this.field1862 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("di.r(I)J")
    public long method2132() {
        long var1 = (long) this.method2120() & 0xFFFFFFFFL;
        long var3 = (long) this.method2120() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("di.j(I)Ljava/lang/String;")
    public String method2177() {
        if (this.field1857[this.field1862] == 0) {
            this.field1862++;
            return null;
        } else {
            return this.method2123();
        }
    }

    @ObfuscatedName("di.h(B)Ljava/lang/String;")
    public String method2123() {
        int var1 = this.field1862;
        while (this.field1857[++this.field1862 - 1] != 0) {
        }
        int var2 = this.field1862 - var1 - 1;
        return var2 == 0 ? "" : class201.method3028(this.field1857, var1, var2);
    }

    @ObfuscatedName("di.d(I)Ljava/lang/String;")
    public String method2228() {
        byte var1 = this.field1857[++this.field1862 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1862;
        while (this.field1857[++this.field1862 - 1] != 0) {
        }
        int var3 = this.field1862 - var2 - 1;
        return var3 == 0 ? "" : class201.method3028(this.field1857, var2, var3);
    }

    @ObfuscatedName("di.l(I)Ljava/lang/String;")
    public String method2134() {
        byte var1 = this.field1857[++this.field1862 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2241();
        if (this.field1862 + var2 > this.field1857.length) {
            throw new IllegalStateException("");
        }
        String var3 = class187.method2679(this.field1857, this.field1862, var2);
        this.field1862 += var2;
        return var3;
    }

    @ObfuscatedName("di.ag([BIII)V")
    public void method2300(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1857[++this.field1862 - 1];
        }
    }

    @ObfuscatedName("di.au(I)I")
    public int method2127() {
        int var1 = this.field1857[this.field1862] & 0xFF;
        return var1 < 128 ? this.method2115() - 64 : this.method2117() - 49152;
    }

    @ObfuscatedName("di.ak(I)I")
    public int method2128() {
        int var1 = this.field1857[this.field1862] & 0xFF;
        return var1 < 128 ? this.method2115() : this.method2117() - 32768;
    }

    @ObfuscatedName("di.aw(B)I")
    public int method2129() {
        return this.field1857[this.field1862] < 0 ? this.method2120() & Integer.MAX_VALUE : this.method2117();
    }

    @ObfuscatedName("di.at(I)I")
    public int method2241() {
        byte var1 = this.field1857[++this.field1862 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1857[++this.field1862 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("di.ah([IIII)V")
    public void method2131(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1862;
        this.field1862 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2120();
            int var8 = this.method2120();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1862 -= 8;
            this.method2303(var7);
            this.method2303(var8);
        }
        this.field1862 = var4;
    }

    @ObfuscatedName("di.aj([IIII)V")
    public void method2159(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1862;
        this.field1862 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2120();
            int var8 = this.method2120();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1862 -= 8;
            this.method2303(var7);
            this.method2303(var8);
        }
        this.field1862 = var4;
    }

    @ObfuscatedName("di.an(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2202(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1862;
        this.field1862 = 0;
        byte[] var4 = new byte[var3];
        this.method2300(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1862 = 0;
        this.method2275(var7.length);
        this.method2110(var7, 0, var7.length);
    }

    @ObfuscatedName("di.as(IB)I")
    public int method2125(int arg0) {
        byte[] var2 = this.field1857;
        int var3 = this.field1862;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1858[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2303(var6);
        return var6;
    }

    @ObfuscatedName("di.ap(I)Z")
    public boolean method2175() {
        this.field1862 -= 4;
        byte[] var1 = this.field1857;
        int var2 = this.field1862;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1858[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2120();
        return var5 == var8;
    }

    @ObfuscatedName("di.ai(II)V")
    public void method2292(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.av(II)V")
    public void method2137(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("di.ae(IS)V")
    public void method2138(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("di.ay(I)I")
    public int method2204() {
        return this.field1857[++this.field1862 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("di.ab(I)I")
    public int method2140() {
        return -this.field1857[++this.field1862 - 1] & 0xFF;
    }

    @ObfuscatedName("di.az(I)I")
    public int method2141() {
        return 128 - this.field1857[++this.field1862 - 1] & 0xFF;
    }

    @ObfuscatedName("di.ad(I)B")
    public byte method2299() {
        return (byte) (this.field1857[++this.field1862 - 1] - 128);
    }

    @ObfuscatedName("di.ao(I)B")
    public byte method2215() {
        return (byte) (-this.field1857[++this.field1862 - 1]);
    }

    @ObfuscatedName("di.am(I)B")
    public byte method2144() {
        return (byte) (128 - this.field1857[++this.field1862 - 1]);
    }

    @ObfuscatedName("di.al(II)V")
    public void method2145(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) arg0;
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.ac(IS)V")
    public void method2146(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("di.ax(IB)V")
    public void method2147(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 + 128);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.aa(B)I")
    public int method2148() {
        this.field1862 += 2;
        return ((this.field1857[this.field1862 - 1] & 0xFF) << 8) + (this.field1857[this.field1862 - 2] & 0xFF);
    }

    @ObfuscatedName("di.aq(S)I")
    public int method2149() {
        this.field1862 += 2;
        return ((this.field1857[this.field1862 - 2] & 0xFF) << 8) + (this.field1857[this.field1862 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("di.af(I)I")
    public int method2301() {
        this.field1862 += 2;
        return ((this.field1857[this.field1862 - 1] & 0xFF) << 8) + (this.field1857[this.field1862 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("di.ar(S)I")
    public int method2160() {
        this.field1862 += 3;
        return (this.field1857[this.field1862 - 3] & 0xFF) + ((this.field1857[this.field1862 - 2] & 0xFF) << 8) + ((this.field1857[this.field1862 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bl(IB)V")
    public void method2235(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) arg0;
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 16);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("di.bb(II)V")
    public void method2153(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
        this.field1857[++this.field1862 - 1] = (byte) arg0;
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 24);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("di.bm(II)V")
    public void method2158(int arg0) {
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 16);
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 24);
        this.field1857[++this.field1862 - 1] = (byte) arg0;
        this.field1857[++this.field1862 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("di.bf(B)I")
    public int method2236() {
        this.field1862 += 4;
        return (this.field1857[this.field1862 - 4] & 0xFF) + ((this.field1857[this.field1862 - 3] & 0xFF) << 8) + ((this.field1857[this.field1862 - 1] & 0xFF) << 24) + ((this.field1857[this.field1862 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("di.bn(I)I")
    public int method2156() {
        this.field1862 += 4;
        return (this.field1857[this.field1862 - 3] & 0xFF) + ((this.field1857[this.field1862 - 4] & 0xFF) << 8) + ((this.field1857[this.field1862 - 1] & 0xFF) << 16) + ((this.field1857[this.field1862 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("di.bi(I)I")
    public int method2106() {
        this.field1862 += 4;
        return (this.field1857[this.field1862 - 2] & 0xFF) + ((this.field1857[this.field1862 - 1] & 0xFF) << 8) + ((this.field1857[this.field1862 - 4] & 0xFF) << 16) + ((this.field1857[this.field1862 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("di.bp([BIII)V")
    public void method2201(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1857[++this.field1862 - 1];
        }
    }
}
