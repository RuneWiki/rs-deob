package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class110 extends class191 {

    @ObfuscatedName("dc.b")
    public byte[] field1862;

    @ObfuscatedName("dc.e")
    public int field1855;

    @ObfuscatedName("dc.i")
    public static int[] field1857 = new int[256];

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
            field1857[var0] = var1;
        }
    }

    @ObfuscatedName("aa.b([BIII)I")
    public static int method578(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1857[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("d.e([BII)I")
    public static int method513(byte[] arg0, int arg1) {
        return method578(arg0, 0, arg1);
    }

    public class110(int arg0) {
        this.field1862 = class112.method2362(arg0);
        this.field1855 = 0;
    }

    public class110(byte[] arg0) {
        this.field1862 = arg0;
        this.field1855 = 0;
    }

    @ObfuscatedName("dc.i(II)V")
    public void method2203(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.k(II)V")
    public void method2267(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
        this.field1862[++this.field1855 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.h(IB)V")
    public void method2130(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 16);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
        this.field1862[++this.field1855 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.p(IB)V")
    public void method2131(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 24);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 16);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
        this.field1862[++this.field1855 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.n(J)V")
    public void method2132(long arg0) {
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1862[++this.field1855 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1862[++this.field1855 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cc.o(Ljava/lang/String;I)I")
    public static int method1954(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.g(Ljava/lang/String;I)V")
    public void method2133(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1855 += class215.method2601(arg0, 0, arg0.length(), this.field1862, this.field1855);
        this.field1862[++this.field1855 - 1] = 0;
    }

    @ObfuscatedName("fr.z(Ljava/lang/String;I)I")
    public static int method3207(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dc.t(Ljava/lang/String;I)V")
    public void method2134(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1862[++this.field1855 - 1] = 0;
        this.field1855 += class215.method2601(arg0, 0, arg0.length(), this.field1862, this.field1855);
        this.field1862[++this.field1855 - 1] = 0;
    }

    @ObfuscatedName("dc.y(Ljava/lang/CharSequence;I)V")
    public void method2220(CharSequence arg0) {
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
        this.field1862[++this.field1855 - 1] = 0;
        this.method2141(var3);
        this.field1855 += class192.method998(this.field1862, this.field1855, arg0);
    }

    @ObfuscatedName("dc.w([BIIB)V")
    public void method2136(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1862[++this.field1855 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.x(II)V")
    public void method2137(int arg0) {
        this.field1862[this.field1855 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1862[this.field1855 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1862[this.field1855 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1862[this.field1855 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.v(II)V")
    public void method2191(int arg0) {
        this.field1862[this.field1855 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1862[this.field1855 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.q(IB)V")
    public void method2139(int arg0) {
        this.field1862[this.field1855 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.f(IB)V")
    public void method2140(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2203(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2267(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.s(IB)V")
    public void method2141(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2203(arg0 >>> 28 | 0x80);
                    }
                    this.method2203(arg0 >>> 21 | 0x80);
                }
                this.method2203(arg0 >>> 14 | 0x80);
            }
            this.method2203(arg0 >>> 7 | 0x80);
        }
        this.method2203(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.a(I)I")
    public int method2142() {
        return this.field1862[++this.field1855 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.m(I)B")
    public byte method2294() {
        return this.field1862[++this.field1855 - 1];
    }

    @ObfuscatedName("dc.c(I)I")
    public int method2292() {
        this.field1855 += 2;
        return ((this.field1862[this.field1855 - 2] & 0xFF) << 8) + (this.field1862[this.field1855 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.j(I)I")
    public int method2256() {
        this.field1855 += 2;
        int var1 = ((this.field1862[this.field1855 - 2] & 0xFF) << 8) + (this.field1862[this.field1855 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.d(I)I")
    public int method2146() {
        this.field1855 += 3;
        return (this.field1862[this.field1855 - 1] & 0xFF) + ((this.field1862[this.field1855 - 3] & 0xFF) << 16) + ((this.field1862[this.field1855 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dc.l(B)I")
    public int method2195() {
        this.field1855 += 4;
        return (this.field1862[this.field1855 - 1] & 0xFF) + ((this.field1862[this.field1855 - 2] & 0xFF) << 8) + ((this.field1862[this.field1855 - 4] & 0xFF) << 24) + ((this.field1862[this.field1855 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.u(I)J")
    public long method2148() {
        long var1 = (long) this.method2195() & 0xFFFFFFFFL;
        long var3 = (long) this.method2195() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.r(I)Ljava/lang/String;")
    public String method2216() {
        if (this.field1862[this.field1855] == 0) {
            this.field1855++;
            return null;
        } else {
            return this.method2150();
        }
    }

    @ObfuscatedName("dc.an(I)Ljava/lang/String;")
    public String method2150() {
        int var1 = this.field1855;
        while (this.field1862[++this.field1855 - 1] != 0) {
        }
        int var2 = this.field1855 - var1 - 1;
        return var2 == 0 ? "" : class215.method98(this.field1862, var1, var2);
    }

    @ObfuscatedName("dc.ao(I)Ljava/lang/String;")
    public String method2247() {
        byte var1 = this.field1862[++this.field1855 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1855;
        while (this.field1862[++this.field1855 - 1] != 0) {
        }
        int var3 = this.field1855 - var2 - 1;
        return var3 == 0 ? "" : class215.method98(this.field1862, var2, var3);
    }

    @ObfuscatedName("dc.ah(I)Ljava/lang/String;")
    public String method2152() {
        byte var1 = this.field1862[++this.field1855 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2318();
        if (this.field1855 + var2 > this.field1862.length) {
            throw new IllegalStateException("");
        }
        String var3 = class192.method117(this.field1862, this.field1855, var2);
        this.field1855 += var2;
        return var3;
    }

    @ObfuscatedName("dc.ai([BIII)V")
    public void method2235(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1862[++this.field1855 - 1];
        }
    }

    @ObfuscatedName("dc.aa(I)I")
    public int method2154() {
        int var1 = this.field1862[this.field1855] & 0xFF;
        return var1 < 128 ? this.method2142() - 64 : this.method2292() - 49152;
    }

    @ObfuscatedName("dc.ag(B)I")
    public int method2155() {
        int var1 = this.field1862[this.field1855] & 0xFF;
        return var1 < 128 ? this.method2142() : this.method2292() - 32768;
    }

    @ObfuscatedName("dc.ar(B)I")
    public int method2218() {
        return this.field1862[this.field1855] < 0 ? this.method2195() & Integer.MAX_VALUE : this.method2292();
    }

    @ObfuscatedName("dc.al(I)I")
    public int method2318() {
        byte var1 = this.field1862[++this.field1855 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1862[++this.field1855 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.ae([IIIB)V")
    public void method2238(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1855;
        this.field1855 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2195();
            int var8 = this.method2195();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1855 -= 8;
            this.method2131(var7);
            this.method2131(var8);
        }
        this.field1855 = var4;
    }

    @ObfuscatedName("dc.ak([IIII)V")
    public void method2159(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1855;
        this.field1855 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2195();
            int var8 = this.method2195();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1855 -= 8;
            this.method2131(var7);
            this.method2131(var8);
        }
        this.field1855 = var4;
    }

    @ObfuscatedName("dc.at(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2160(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1855;
        this.field1855 = 0;
        byte[] var4 = new byte[var3];
        this.method2235(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1855 = 0;
        this.method2267(var7.length);
        this.method2136(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.am(IB)I")
    public int method2171(int arg0) {
        int var2 = method578(this.field1862, arg0, this.field1855);
        this.method2131(var2);
        return var2;
    }

    @ObfuscatedName("dc.aw(I)Z")
    public boolean method2259() {
        this.field1855 -= 4;
        int var1 = method578(this.field1862, 0, this.field1855);
        int var2 = this.method2195();
        return var1 == var2;
    }

    @ObfuscatedName("dc.as(II)V")
    public void method2163(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.aq(II)V")
    public void method2129(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.ac(II)V")
    public void method2165(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.aj(I)I")
    public int method2166() {
        return this.field1862[++this.field1855 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.av(I)I")
    public int method2181() {
        return -this.field1862[++this.field1855 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ax(I)I")
    public int method2207() {
        return 128 - this.field1862[++this.field1855 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.ap(I)B")
    public byte method2169() {
        return (byte) (-this.field1862[++this.field1855 - 1]);
    }

    @ObfuscatedName("dc.af(I)B")
    public byte method2170() {
        return (byte) (128 - this.field1862[++this.field1855 - 1]);
    }

    @ObfuscatedName("dc.az(II)V")
    public void method2301(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) arg0;
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.ay(II)V")
    public void method2172(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.au(II)V")
    public void method2173(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 + 128);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.ab(I)I")
    public int method2174() {
        this.field1855 += 2;
        return ((this.field1862[this.field1855 - 1] & 0xFF) << 8) + (this.field1862[this.field1855 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.ad(B)I")
    public int method2175() {
        this.field1855 += 2;
        return ((this.field1862[this.field1855 - 2] & 0xFF) << 8) + (this.field1862[this.field1855 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bq(B)I")
    public int method2176() {
        this.field1855 += 2;
        return ((this.field1862[this.field1855 - 1] & 0xFF) << 8) + (this.field1862[this.field1855 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bc(I)I")
    public int method2128() {
        this.field1855 += 2;
        int var1 = ((this.field1862[this.field1855 - 2] & 0xFF) << 8) + (this.field1862[this.field1855 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bj(II)V")
    public void method2178(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 16);
        this.field1862[++this.field1855 - 1] = (byte) arg0;
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bm(B)I")
    public int method2260() {
        this.field1855 += 3;
        return (this.field1862[this.field1855 - 2] & 0xFF) + ((this.field1862[this.field1855 - 1] & 0xFF) << 8) + ((this.field1862[this.field1855 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bx(IB)V")
    public void method2180(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) arg0;
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 16);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.bi(II)V")
    public void method2161(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
        this.field1862[++this.field1855 - 1] = (byte) arg0;
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 24);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bp(II)V")
    public void method2182(int arg0) {
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 16);
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 24);
        this.field1862[++this.field1855 - 1] = (byte) arg0;
        this.field1862[++this.field1855 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.ba(B)I")
    public int method2183() {
        this.field1855 += 4;
        return (this.field1862[this.field1855 - 4] & 0xFF) + ((this.field1862[this.field1855 - 3] & 0xFF) << 8) + ((this.field1862[this.field1855 - 1] & 0xFF) << 24) + ((this.field1862[this.field1855 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.be(I)I")
    public int method2184() {
        this.field1855 += 4;
        return (this.field1862[this.field1855 - 3] & 0xFF) + ((this.field1862[this.field1855 - 4] & 0xFF) << 8) + ((this.field1862[this.field1855 - 1] & 0xFF) << 16) + ((this.field1862[this.field1855 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bt(I)I")
    public int method2127() {
        this.field1855 += 4;
        return (this.field1862[this.field1855 - 2] & 0xFF) + ((this.field1862[this.field1855 - 1] & 0xFF) << 8) + ((this.field1862[this.field1855 - 3] & 0xFF) << 24) + ((this.field1862[this.field1855 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bo([BIII)V")
    public void method2323(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1862[++this.field1855 - 1];
        }
    }

    @ObfuscatedName("dc.bz([BIII)V")
    public void method2143(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1862[++this.field1855 - 1] - 128);
        }
    }
}
