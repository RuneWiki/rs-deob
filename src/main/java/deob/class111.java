package deob;

import java.math.BigInteger;

@ObfuscatedName("dj")
public class class111 extends class199 {

    @ObfuscatedName("dj.b")
    public byte[] field1897;

    @ObfuscatedName("dj.e")
    public int field1894;

    @ObfuscatedName("dj.a")
    public static int[] field1891 = new int[256];

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
            field1891[var0] = var1;
        }
    }

    @ObfuscatedName("k.b([BIB)I")
    public static int method35(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1891[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class111(int arg0) {
        this.field1897 = class113.method2371(arg0);
        this.field1894 = 0;
    }

    public class111(byte[] arg0) {
        this.field1897 = arg0;
        this.field1894 = 0;
    }

    @ObfuscatedName("dj.e(IB)V")
    public void method2112(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.a(II)V")
    public void method2201(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.k(II)V")
    public void method2114(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.p(II)V")
    public void method2115(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 24);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1894 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.l(J)V")
    public void method2116(long arg0) {
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1897[++this.field1894 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dj.u(J)V")
    public void method2187(long arg0) {
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1897[++this.field1894 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1897[++this.field1894 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("co.o(Ljava/lang/String;S)I")
    public static int method1876(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dj.m(Ljava/lang/String;I)V")
    public void method2247(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1894 += class156.method6(arg0, 0, arg0.length(), this.field1897, this.field1894);
        this.field1897[++this.field1894 - 1] = 0;
    }

    @ObfuscatedName("m.q(Ljava/lang/String;B)I")
    public static int method111(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dj.v(Ljava/lang/String;B)V")
    public void method2299(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1897[++this.field1894 - 1] = 0;
        this.field1894 += class156.method6(arg0, 0, arg0.length(), this.field1897, this.field1894);
        this.field1897[++this.field1894 - 1] = 0;
    }

    @ObfuscatedName("dj.n(Ljava/lang/CharSequence;I)V")
    public void method2120(CharSequence arg0) {
        int var2 = class200.method3445(arg0);
        this.field1897[++this.field1894 - 1] = 0;
        this.method2126(var2);
        int var3 = this.field1894;
        byte[] var4 = this.field1897;
        int var5 = this.field1894;
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
        this.field1894 = var10 + var3;
    }

    @ObfuscatedName("dj.z([BIIB)V")
    public void method2121(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1897[++this.field1894 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dj.r(II)V")
    public void method2122(int arg0) {
        this.field1897[this.field1894 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1897[this.field1894 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1897[this.field1894 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1897[this.field1894 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.i(II)V")
    public void method2123(int arg0) {
        this.field1897[this.field1894 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1897[this.field1894 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.s(II)V")
    public void method2137(int arg0) {
        this.field1897[this.field1894 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dj.c(IB)V")
    public void method2125(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2112(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2201(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dj.t(II)V")
    public void method2126(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2112(arg0 >>> 28 | 0x80);
                    }
                    this.method2112(arg0 >>> 21 | 0x80);
                }
                this.method2112(arg0 >>> 14 | 0x80);
            }
            this.method2112(arg0 >>> 7 | 0x80);
        }
        this.method2112(arg0 & 0x7F);
    }

    @ObfuscatedName("dj.h(I)I")
    public int method2127() {
        return this.field1897[++this.field1894 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.w(B)B")
    public byte method2267() {
        return this.field1897[++this.field1894 - 1];
    }

    @ObfuscatedName("dj.g(I)I")
    public int method2129() {
        this.field1894 += 2;
        return ((this.field1897[this.field1894 - 2] & 0xFF) << 8) + (this.field1897[this.field1894 - 1] & 0xFF);
    }

    @ObfuscatedName("dj.f(I)I")
    public int method2130() {
        this.field1894 += 2;
        int var1 = ((this.field1897[this.field1894 - 2] & 0xFF) << 8) + (this.field1897[this.field1894 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.y(S)I")
    public int method2131() {
        this.field1894 += 3;
        return (this.field1897[this.field1894 - 1] & 0xFF) + ((this.field1897[this.field1894 - 3] & 0xFF) << 16) + ((this.field1897[this.field1894 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dj.j(I)I")
    public int method2194() {
        this.field1894 += 4;
        return (this.field1897[this.field1894 - 1] & 0xFF) + ((this.field1897[this.field1894 - 2] & 0xFF) << 8) + ((this.field1897[this.field1894 - 4] & 0xFF) << 24) + ((this.field1897[this.field1894 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.x(I)J")
    public long method2133() {
        long var1 = (long) this.method2194() & 0xFFFFFFFFL;
        long var3 = (long) this.method2194() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dj.d(B)Ljava/lang/String;")
    public String method2335() {
        if (this.field1897[this.field1894] == 0) {
            this.field1894++;
            return null;
        } else {
            return this.method2166();
        }
    }

    @ObfuscatedName("dj.ax(I)Ljava/lang/String;")
    public String method2166() {
        int var1 = this.field1894;
        while (this.field1897[++this.field1894 - 1] != 0) {
        }
        int var2 = this.field1894 - var1 - 1;
        return var2 == 0 ? "" : class156.method1862(this.field1897, var1, var2);
    }

    @ObfuscatedName("dj.ag(I)Ljava/lang/String;")
    public String method2136() {
        byte var1 = this.field1897[++this.field1894 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1894;
        while (this.field1897[++this.field1894 - 1] != 0) {
        }
        int var3 = this.field1894 - var2 - 1;
        return var3 == 0 ? "" : class156.method1862(this.field1897, var2, var3);
    }

    @ObfuscatedName("dj.ai(I)Ljava/lang/String;")
    public String method2154() {
        byte var1 = this.field1897[++this.field1894 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2143();
        if (this.field1894 + var2 > this.field1897.length) {
            throw new IllegalStateException("");
        }
        String var3 = class200.method1767(this.field1897, this.field1894, var2);
        this.field1894 += var2;
        return var3;
    }

    @ObfuscatedName("dj.ar([BIII)V")
    public void method2212(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1897[++this.field1894 - 1];
        }
    }

    @ObfuscatedName("dj.aw(I)I")
    public int method2139() {
        int var1 = this.field1897[this.field1894] & 0xFF;
        return var1 < 128 ? this.method2127() - 64 : this.method2129() - 49152;
    }

    @ObfuscatedName("dj.ac(I)I")
    public int method2140() {
        int var1 = this.field1897[this.field1894] & 0xFF;
        return var1 < 128 ? this.method2127() : this.method2129() - 32768;
    }

    @ObfuscatedName("dj.ap(I)I")
    public int method2141() {
        return this.field1897[this.field1894] < 0 ? this.method2194() & Integer.MAX_VALUE : this.method2129();
    }

    @ObfuscatedName("dj.al(B)I")
    public int method2143() {
        byte var1 = this.field1897[++this.field1894 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1897[++this.field1894 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dj.ak([IB)V")
    public void method2227(int[] arg0) {
        int var2 = this.field1894 / 8;
        this.field1894 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2194();
            int var5 = this.method2194();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1894 -= 8;
            this.method2115(var4);
            this.method2115(var5);
        }
    }

    @ObfuscatedName("dj.at([II)V")
    public void method2117(int[] arg0) {
        int var2 = this.field1894 / 8;
        this.field1894 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2194();
            int var5 = this.method2194();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1894 -= 8;
            this.method2115(var4);
            this.method2115(var5);
        }
    }

    @ObfuscatedName("dj.au([IIII)V")
    public void method2191(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1894;
        this.field1894 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2194();
            int var8 = this.method2194();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1894 -= 8;
            this.method2115(var7);
            this.method2115(var8);
        }
        this.field1894 = var4;
    }

    @ObfuscatedName("dj.am([IIIB)V")
    public void method2119(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1894;
        this.field1894 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2194();
            int var8 = this.method2194();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1894 -= 8;
            this.method2115(var7);
            this.method2115(var8);
        }
        this.field1894 = var4;
    }

    @ObfuscatedName("dj.aa(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2147(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1894;
        this.field1894 = 0;
        byte[] var4 = new byte[var3];
        this.method2212(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1894 = 0;
        this.method2201(var7.length);
        this.method2121(var7, 0, var7.length);
    }

    @ObfuscatedName("dj.az(II)I")
    public int method2148(int arg0) {
        byte[] var2 = this.field1897;
        int var3 = this.field1894;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1891[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2115(var6);
        return var6;
    }

    @ObfuscatedName("dj.ae(I)Z")
    public boolean method2149() {
        this.field1894 -= 4;
        byte[] var1 = this.field1897;
        int var2 = this.field1894;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1891[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2194();
        return var5 == var8;
    }

    @ObfuscatedName("dj.ah(IS)V")
    public void method2150(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.an(II)V")
    public void method2151(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dj.aq(II)V")
    public void method2319(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dj.as(I)I")
    public int method2153() {
        return this.field1897[++this.field1894 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dj.ay(B)I")
    public int method2209() {
        return -this.field1897[++this.field1894 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.ad(B)I")
    public int method2132() {
        return 128 - this.field1897[++this.field1894 - 1] & 0xFF;
    }

    @ObfuscatedName("dj.af(B)B")
    public byte method2156() {
        return (byte) (this.field1897[++this.field1894 - 1] - 128);
    }

    @ObfuscatedName("dj.ab(I)B")
    public byte method2157() {
        return (byte) (-this.field1897[++this.field1894 - 1]);
    }

    @ObfuscatedName("dj.av(II)V")
    public void method2289(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) arg0;
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.ao(II)V")
    public void method2159(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dj.aj(II)V")
    public void method2160(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 + 128);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bj(I)I")
    public int method2161() {
        this.field1894 += 2;
        return ((this.field1897[this.field1894 - 1] & 0xFF) << 8) + (this.field1897[this.field1894 - 2] & 0xFF);
    }

    @ObfuscatedName("dj.bv(I)I")
    public int method2214() {
        this.field1894 += 2;
        return ((this.field1897[this.field1894 - 2] & 0xFF) << 8) + (this.field1897[this.field1894 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bw(I)I")
    public int method2163() {
        this.field1894 += 2;
        return ((this.field1897[this.field1894 - 1] & 0xFF) << 8) + (this.field1897[this.field1894 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dj.bi(B)I")
    public int method2164() {
        this.field1894 += 2;
        int var1 = ((this.field1897[this.field1894 - 1] & 0xFF) << 8) + (this.field1897[this.field1894 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.bh(I)I")
    public int method2236() {
        this.field1894 += 2;
        int var1 = ((this.field1897[this.field1894 - 2] & 0xFF) << 8) + (this.field1897[this.field1894 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dj.be(I)I")
    public int method2128() {
        this.field1894 += 3;
        return (this.field1897[this.field1894 - 3] & 0xFF) + ((this.field1897[this.field1894 - 2] & 0xFF) << 8) + ((this.field1897[this.field1894 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dj.br(IB)V")
    public void method2167(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) arg0;
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dj.bb(IS)V")
    public void method2168(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1894 - 1] = (byte) arg0;
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 24);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dj.bq(II)V")
    public void method2169(int arg0) {
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 24);
        this.field1897[++this.field1894 - 1] = (byte) arg0;
        this.field1897[++this.field1894 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dj.bk(I)I")
    public int method2170() {
        this.field1894 += 4;
        return (this.field1897[this.field1894 - 4] & 0xFF) + ((this.field1897[this.field1894 - 3] & 0xFF) << 8) + ((this.field1897[this.field1894 - 2] & 0xFF) << 16) + ((this.field1897[this.field1894 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.bs(I)I")
    public int method2171() {
        this.field1894 += 4;
        return (this.field1897[this.field1894 - 3] & 0xFF) + ((this.field1897[this.field1894 - 4] & 0xFF) << 8) + ((this.field1897[this.field1894 - 1] & 0xFF) << 16) + ((this.field1897[this.field1894 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.bo(B)I")
    public int method2302() {
        this.field1894 += 4;
        return (this.field1897[this.field1894 - 2] & 0xFF) + ((this.field1897[this.field1894 - 1] & 0xFF) << 8) + ((this.field1897[this.field1894 - 4] & 0xFF) << 16) + ((this.field1897[this.field1894 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dj.bp([BIIB)V")
    public void method2329(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1897[++this.field1894 - 1] - 128);
        }
    }

    @ObfuscatedName("dj.by([BIII)V")
    public void method2312(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1897[++this.field1894 - 1] - 128);
        }
    }
}
