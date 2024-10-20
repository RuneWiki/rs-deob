package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class107 extends class184 {

    @ObfuscatedName("de.j")
    public byte[] field1849;

    @ObfuscatedName("de.z")
    public int field1847;

    @ObfuscatedName("de.y")
    public static int[] field1846 = new int[256];

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
            field1846[var0] = var1;
        }
    }

    @ObfuscatedName("k.j([BIIB)I")
    public static int method83(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1846[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class107(int arg0) {
        this.field1849 = class109.method2362(arg0);
        this.field1847 = 0;
    }

    public class107(byte[] arg0) {
        this.field1849 = arg0;
        this.field1847 = 0;
    }

    @ObfuscatedName("de.z(II)V")
    public void method2116(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.y(IB)V")
    public void method2270(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.h(II)V")
    public void method2118(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.r(II)V")
    public void method2119(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 24);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.e(J)V")
    public void method2173(long arg0) {
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1849[++this.field1847 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1849[++this.field1847 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ap.k(Ljava/lang/String;B)I")
    public static int method1004(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("de.b(Ljava/lang/String;S)V")
    public void method2121(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1847 += class199.method443(arg0, 0, arg0.length(), this.field1849, this.field1847);
        this.field1849[++this.field1847 - 1] = 0;
    }

    @ObfuscatedName("de.n(Ljava/lang/String;I)V")
    public void method2122(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1849[++this.field1847 - 1] = 0;
        this.field1847 += class199.method443(arg0, 0, arg0.length(), this.field1849, this.field1847);
        this.field1849[++this.field1847 - 1] = 0;
    }

    @ObfuscatedName("de.a(Ljava/lang/CharSequence;I)V")
    public void method2290(CharSequence arg0) {
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 <= 127) {
                var3++;
            } else if (var5 <= 2047) {
                var3 += 2;
            } else {
                var3 += 3;
            }
        }
        this.field1849[++this.field1847 - 1] = 0;
        this.method2126(var3);
        int var8 = this.field1847;
        byte[] var9 = this.field1849;
        int var10 = this.field1847;
        int var11 = arg0.length();
        int var12 = var10;
        for (int var13 = 0; var13 < var11; var13++) {
            char var14 = arg0.charAt(var13);
            if (var14 <= 127) {
                var9[var12++] = (byte) var14;
            } else if (var14 <= 2047) {
                var9[var12++] = (byte) (0xC0 | var14 >> 6);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            } else {
                var9[var12++] = (byte) (0xE0 | var14 >> 12);
                var9[var12++] = (byte) (0x80 | var14 >> 6 & 0x3F);
                var9[var12++] = (byte) (0x80 | var14 & 0x3F);
            }
        }
        int var15 = var12 - var10;
        this.field1847 = var15 + var8;
    }

    @ObfuscatedName("de.q([BIIB)V")
    public void method2124(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1849[++this.field1847 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.i(IB)V")
    public void method2125(int arg0) {
        this.field1849[this.field1847 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1849[this.field1847 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1849[this.field1847 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1849[this.field1847 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.f(IS)V")
    public void method2150(int arg0) {
        this.field1849[this.field1847 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1849[this.field1847 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.o(II)V")
    public void method2276(int arg0) {
        this.field1849[this.field1847 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.t(II)V")
    public void method2128(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2116(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2270(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.c(II)V")
    public void method2126(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2116(arg0 >>> 28 | 0x80);
                    }
                    this.method2116(arg0 >>> 21 | 0x80);
                }
                this.method2116(arg0 >>> 14 | 0x80);
            }
            this.method2116(arg0 >>> 7 | 0x80);
        }
        this.method2116(arg0 & 0x7F);
    }

    @ObfuscatedName("de.d(B)I")
    public int method2130() {
        return this.field1849[++this.field1847 - 1] & 0xFF;
    }

    @ObfuscatedName("de.g(B)B")
    public byte method2131() {
        return this.field1849[++this.field1847 - 1];
    }

    @ObfuscatedName("de.s(I)I")
    public int method2132() {
        this.field1847 += 2;
        return ((this.field1849[this.field1847 - 2] & 0xFF) << 8) + (this.field1849[this.field1847 - 1] & 0xFF);
    }

    @ObfuscatedName("de.m(S)I")
    public int method2133() {
        this.field1847 += 2;
        int var1 = ((this.field1849[this.field1847 - 2] & 0xFF) << 8) + (this.field1849[this.field1847 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.v(B)I")
    public int method2252() {
        this.field1847 += 3;
        return (this.field1849[this.field1847 - 1] & 0xFF) + ((this.field1849[this.field1847 - 3] & 0xFF) << 16) + ((this.field1849[this.field1847 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("de.u(B)I")
    public int method2135() {
        this.field1847 += 4;
        return (this.field1849[this.field1847 - 1] & 0xFF) + ((this.field1849[this.field1847 - 2] & 0xFF) << 8) + ((this.field1849[this.field1847 - 3] & 0xFF) << 16) + ((this.field1849[this.field1847 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("de.p(I)J")
    public long method2201() {
        long var1 = (long) this.method2135() & 0xFFFFFFFFL;
        long var3 = (long) this.method2135() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.l(I)Ljava/lang/String;")
    public String method2137() {
        if (this.field1849[this.field1847] == 0) {
            this.field1847++;
            return null;
        } else {
            return this.method2138();
        }
    }

    @ObfuscatedName("de.w(I)Ljava/lang/String;")
    public String method2138() {
        int var1 = this.field1847;
        while (this.field1849[++this.field1847 - 1] != 0) {
        }
        int var2 = this.field1847 - var1 - 1;
        return var2 == 0 ? "" : class199.method3323(this.field1849, var1, var2);
    }

    @ObfuscatedName("de.x(I)Ljava/lang/String;")
    public String method2139() {
        byte var1 = this.field1849[++this.field1847 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1847;
        while (this.field1849[++this.field1847 - 1] != 0) {
        }
        int var3 = this.field1847 - var2 - 1;
        return var3 == 0 ? "" : class199.method3323(this.field1849, var2, var3);
    }

    @ObfuscatedName("de.aj(I)Ljava/lang/String;")
    public String method2136() {
        byte var1 = this.field1849[++this.field1847 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2145();
        if (this.field1847 + var2 > this.field1849.length) {
            throw new IllegalStateException("");
        }
        String var3 = class185.method471(this.field1849, this.field1847, var2);
        this.field1847 += var2;
        return var3;
    }

    @ObfuscatedName("de.al([BIII)V")
    public void method2141(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1849[++this.field1847 - 1];
        }
    }

    @ObfuscatedName("de.af(I)I")
    public int method2142() {
        int var1 = this.field1849[this.field1847] & 0xFF;
        return var1 < 128 ? this.method2130() - 64 : this.method2132() - 49152;
    }

    @ObfuscatedName("de.ai(I)I")
    public int method2197() {
        int var1 = this.field1849[this.field1847] & 0xFF;
        return var1 < 128 ? this.method2130() : this.method2132() - 32768;
    }

    @ObfuscatedName("de.ak(I)I")
    public int method2264() {
        return this.field1849[this.field1847] < 0 ? this.method2135() & Integer.MAX_VALUE : this.method2132();
    }

    @ObfuscatedName("de.ae(B)I")
    public int method2145() {
        byte var1 = this.field1849[++this.field1847 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1849[++this.field1847 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.ag([IIIB)V")
    public void method2146(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1847;
        this.field1847 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2135();
            int var8 = this.method2135();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1847 -= 8;
            this.method2119(var7);
            this.method2119(var8);
        }
        this.field1847 = var4;
    }

    @ObfuscatedName("de.ar([IIII)V")
    public void method2147(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1847;
        this.field1847 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2135();
            int var8 = this.method2135();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1847 -= 8;
            this.method2119(var7);
            this.method2119(var8);
        }
        this.field1847 = var4;
    }

    @ObfuscatedName("de.an(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2148(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1847;
        this.field1847 = 0;
        byte[] var4 = new byte[var3];
        this.method2141(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1847 = 0;
        this.method2270(var7.length);
        this.method2124(var7, 0, var7.length);
    }

    @ObfuscatedName("de.av(IB)I")
    public int method2149(int arg0) {
        int var2 = method83(this.field1849, arg0, this.field1847);
        this.method2119(var2);
        return var2;
    }

    @ObfuscatedName("de.aw(B)Z")
    public boolean method2162() {
        this.field1847 -= 4;
        int var1 = method83(this.field1849, 0, this.field1847);
        int var2 = this.method2135();
        return var1 == var2;
    }

    @ObfuscatedName("de.aq(II)V")
    public void method2151(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ad(IB)V")
    public void method2204(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.at(IS)V")
    public void method2256(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.aa(B)I")
    public int method2154() {
        return this.field1849[++this.field1847 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.ay(I)I")
    public int method2155() {
        return -this.field1849[++this.field1847 - 1] & 0xFF;
    }

    @ObfuscatedName("de.am(I)I")
    public int method2156() {
        return 128 - this.field1849[++this.field1847 - 1] & 0xFF;
    }

    @ObfuscatedName("de.az(B)B")
    public byte method2157() {
        return (byte) (-this.field1849[++this.field1847 - 1]);
    }

    @ObfuscatedName("de.au(II)V")
    public void method2158(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) arg0;
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ac(II)V")
    public void method2159(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ab(II)V")
    public void method2160(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 + 128);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ao(I)I")
    public int method2161() {
        this.field1847 += 2;
        return ((this.field1849[this.field1847 - 1] & 0xFF) << 8) + (this.field1849[this.field1847 - 2] & 0xFF);
    }

    @ObfuscatedName("de.ah(B)I")
    public int method2228() {
        this.field1847 += 2;
        return ((this.field1849[this.field1847 - 2] & 0xFF) << 8) + (this.field1849[this.field1847 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.ap(B)I")
    public int method2163() {
        this.field1847 += 2;
        return ((this.field1849[this.field1847 - 1] & 0xFF) << 8) + (this.field1849[this.field1847 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.as(I)I")
    public int method2164() {
        this.field1847 += 2;
        int var1 = ((this.field1849[this.field1847 - 1] & 0xFF) << 8) + (this.field1849[this.field1847 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.ax(I)I")
    public int method2165() {
        this.field1847 += 2;
        int var1 = ((this.field1849[this.field1847 - 1] & 0xFF) << 8) + (this.field1849[this.field1847 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bg(B)I")
    public int method2166() {
        this.field1847 += 3;
        return (this.field1849[this.field1847 - 3] & 0xFF) + ((this.field1849[this.field1847 - 2] & 0xFF) << 8) + ((this.field1849[this.field1847 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bd(IB)V")
    public void method2167(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) arg0;
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bp(IB)V")
    public void method2231(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1849[++this.field1847 - 1] = (byte) arg0;
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 24);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bm(IB)V")
    public void method2169(int arg0) {
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 24);
        this.field1849[++this.field1847 - 1] = (byte) arg0;
        this.field1849[++this.field1847 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.bh(I)I")
    public int method2217() {
        this.field1847 += 4;
        return (this.field1849[this.field1847 - 4] & 0xFF) + ((this.field1849[this.field1847 - 3] & 0xFF) << 8) + ((this.field1849[this.field1847 - 1] & 0xFF) << 24) + ((this.field1849[this.field1847 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("de.be(B)I")
    public int method2305() {
        this.field1847 += 4;
        return (this.field1849[this.field1847 - 3] & 0xFF) + ((this.field1849[this.field1847 - 4] & 0xFF) << 8) + ((this.field1849[this.field1847 - 1] & 0xFF) << 16) + ((this.field1849[this.field1847 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("de.bt(B)I")
    public int method2172() {
        this.field1847 += 4;
        return (this.field1849[this.field1847 - 2] & 0xFF) + ((this.field1849[this.field1847 - 1] & 0xFF) << 8) + ((this.field1849[this.field1847 - 4] & 0xFF) << 16) + ((this.field1849[this.field1847 - 3] & 0xFF) << 24);
    }
}
