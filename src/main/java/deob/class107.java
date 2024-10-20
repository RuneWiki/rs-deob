package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class107 extends class183 {

    @ObfuscatedName("dp.e")
    public byte[] field1845;

    @ObfuscatedName("dp.p")
    public int field1841;

    @ObfuscatedName("dp.a")
    public static int[] field1842 = new int[256];

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
            field1842[var0] = var1;
        }
    }

    @ObfuscatedName("ak.p([BIB)I")
    public static int method535(byte[] arg0, int arg1) {
        return Statics.method129(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1845 = class109.method2368(arg0);
        this.field1841 = 0;
    }

    public class107(byte[] arg0) {
        this.field1845 = arg0;
        this.field1841 = 0;
    }

    @ObfuscatedName("dp.a(IB)V")
    public void method2249(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.g(IB)V")
    public void method2128(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1845[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.u(IB)V")
    public void method2129(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1845[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.k(II)V")
    public void method2130(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1845[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.m(J)V")
    public void method2131(long arg0) {
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1845[++this.field1841 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1845[++this.field1841 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("e.t(Ljava/lang/String;I)I")
    public static int method4(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dp.l(Ljava/lang/String;I)V")
    public void method2132(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1841 += class198.method937(arg0, 0, arg0.length(), this.field1845, this.field1841);
        this.field1845[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("dp.f(Ljava/lang/String;I)V")
    public void method2133(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1845[++this.field1841 - 1] = 0;
        this.field1841 += class198.method937(arg0, 0, arg0.length(), this.field1845, this.field1841);
        this.field1845[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("dp.c(Ljava/lang/CharSequence;I)V")
    public void method2171(CharSequence arg0) {
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
        this.field1845[++this.field1841 - 1] = 0;
        this.method2140(var3);
        int var8 = this.field1841;
        byte[] var9 = this.field1845;
        int var10 = this.field1841;
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
        this.field1841 = var15 + var8;
    }

    @ObfuscatedName("dp.i([BIII)V")
    public void method2135(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1845[++this.field1841 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.o(II)V")
    public void method2136(int arg0) {
        this.field1845[this.field1841 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1845[this.field1841 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1845[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1845[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.d(II)V")
    public void method2137(int arg0) {
        this.field1845[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1845[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.b(II)V")
    public void method2225(int arg0) {
        this.field1845[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.v(IB)V")
    public void method2139(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2249(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2128(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.n(IB)V")
    public void method2140(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2249(arg0 >>> 28 | 0x80);
                    }
                    this.method2249(arg0 >>> 21 | 0x80);
                }
                this.method2249(arg0 >>> 14 | 0x80);
            }
            this.method2249(arg0 >>> 7 | 0x80);
        }
        this.method2249(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.w(S)I")
    public int method2125() {
        return this.field1845[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.z(I)B")
    public byte method2201() {
        return this.field1845[++this.field1841 - 1];
    }

    @ObfuscatedName("dp.x(I)I")
    public int method2182() {
        this.field1841 += 2;
        return ((this.field1845[this.field1841 - 2] & 0xFF) << 8) + (this.field1845[this.field1841 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.q(B)I")
    public int method2144() {
        this.field1841 += 2;
        int var1 = ((this.field1845[this.field1841 - 2] & 0xFF) << 8) + (this.field1845[this.field1841 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.s(B)I")
    public int method2145() {
        this.field1841 += 3;
        return (this.field1845[this.field1841 - 1] & 0xFF) + ((this.field1845[this.field1841 - 2] & 0xFF) << 8) + ((this.field1845[this.field1841 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.j(I)I")
    public int method2146() {
        this.field1841 += 4;
        return (this.field1845[this.field1841 - 1] & 0xFF) + ((this.field1845[this.field1841 - 2] & 0xFF) << 8) + ((this.field1845[this.field1841 - 3] & 0xFF) << 16) + ((this.field1845[this.field1841 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.y(I)J")
    public long method2147() {
        long var1 = (long) this.method2146() & 0xFFFFFFFFL;
        long var3 = (long) this.method2146() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.r(I)Ljava/lang/String;")
    public String method2281() {
        if (this.field1845[this.field1841] == 0) {
            this.field1841++;
            return null;
        } else {
            return this.method2149();
        }
    }

    @ObfuscatedName("dp.h(I)Ljava/lang/String;")
    public String method2149() {
        int var1 = this.field1841;
        while (this.field1845[++this.field1841 - 1] != 0) {
        }
        int var2 = this.field1841 - var1 - 1;
        return var2 == 0 ? "" : class198.method1868(this.field1845, var1, var2);
    }

    @ObfuscatedName("dp.ak(I)Ljava/lang/String;")
    public String method2300() {
        byte var1 = this.field1845[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1841;
        while (this.field1845[++this.field1841 - 1] != 0) {
        }
        int var3 = this.field1841 - var2 - 1;
        return var3 == 0 ? "" : class198.method1868(this.field1845, var2, var3);
    }

    @ObfuscatedName("dp.ab(I)Ljava/lang/String;")
    public String method2282() {
        byte var1 = this.field1845[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2156();
        if (this.field1841 + var2 > this.field1845.length) {
            throw new IllegalStateException("");
        }
        String var3 = class184.method501(this.field1845, this.field1841, var2);
        this.field1841 += var2;
        return var3;
    }

    @ObfuscatedName("dp.as([BIII)V")
    public void method2321(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1845[++this.field1841 - 1];
        }
    }

    @ObfuscatedName("dp.aq(I)I")
    public int method2153() {
        int var1 = this.field1845[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2125() - 64 : this.method2182() - 49152;
    }

    @ObfuscatedName("dp.ai(I)I")
    public int method2167() {
        int var1 = this.field1845[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2125() : this.method2182() - 32768;
    }

    @ObfuscatedName("dp.aw(I)I")
    public int method2155() {
        return this.field1845[this.field1841] < 0 ? this.method2146() & Integer.MAX_VALUE : this.method2182();
    }

    @ObfuscatedName("dp.aj(I)I")
    public int method2156() {
        byte var1 = this.field1845[++this.field1841 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1845[++this.field1841 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.ax([IIII)V")
    public void method2157(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2146();
            int var8 = this.method2146();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2130(var7);
            this.method2130(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dp.ar([IIII)V")
    public void method2271(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2146();
            int var8 = this.method2146();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2130(var7);
            this.method2130(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dp.ac(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2159(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1841;
        this.field1841 = 0;
        byte[] var4 = new byte[var3];
        this.method2321(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1841 = 0;
        this.method2128(var7.length);
        this.method2135(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.ap(II)I")
    public int method2160(int arg0) {
        int var2 = Statics.method129(this.field1845, arg0, this.field1841);
        this.method2130(var2);
        return var2;
    }

    @ObfuscatedName("dp.az(I)Z")
    public boolean method2161() {
        this.field1841 -= 4;
        int var1 = Statics.method129(this.field1845, 0, this.field1841);
        int var2 = this.method2146();
        return var1 == var2;
    }

    @ObfuscatedName("dp.ae(IB)V")
    public void method2162(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.ah(IB)V")
    public void method2163(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.ad(II)V")
    public void method2164(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.ay(I)I")
    public int method2165() {
        return this.field1845[++this.field1841 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.at(I)I")
    public int method2230() {
        return -this.field1845[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.au(I)I")
    public int method2291() {
        return 128 - this.field1845[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.an(B)B")
    public byte method2168() {
        return (byte) (this.field1845[++this.field1841 - 1] - 128);
    }

    @ObfuscatedName("dp.al(B)B")
    public byte method2169() {
        return (byte) (128 - this.field1845[++this.field1841 - 1]);
    }

    @ObfuscatedName("dp.am(II)V")
    public void method2170(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) arg0;
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.av(II)V")
    public void method2265(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.ag(IB)V")
    public void method2172(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 + 128);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.af(B)I")
    public int method2173() {
        this.field1841 += 2;
        return ((this.field1845[this.field1841 - 1] & 0xFF) << 8) + (this.field1845[this.field1841 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.ao(I)I")
    public int method2188() {
        this.field1841 += 2;
        return ((this.field1845[this.field1841 - 2] & 0xFF) << 8) + (this.field1845[this.field1841 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.aa(I)I")
    public int method2175() {
        this.field1841 += 2;
        return ((this.field1845[this.field1841 - 1] & 0xFF) << 8) + (this.field1845[this.field1841 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bv(I)I")
    public int method2176() {
        this.field1841 += 2;
        int var1 = ((this.field1845[this.field1841 - 1] & 0xFF) << 8) + (this.field1845[this.field1841 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bl(II)V")
    public void method2177(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) arg0;
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.be(IB)V")
    public void method2178(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1845[++this.field1841 - 1] = (byte) arg0;
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.bo(IB)V")
    public void method2179(int arg0) {
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1845[++this.field1841 - 1] = (byte) arg0;
        this.field1845[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bg(I)I")
    public int method2319() {
        this.field1841 += 4;
        return (this.field1845[this.field1841 - 4] & 0xFF) + ((this.field1845[this.field1841 - 3] & 0xFF) << 8) + ((this.field1845[this.field1841 - 2] & 0xFF) << 16) + ((this.field1845[this.field1841 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bh(I)I")
    public int method2181() {
        this.field1841 += 4;
        return (this.field1845[this.field1841 - 3] & 0xFF) + ((this.field1845[this.field1841 - 4] & 0xFF) << 8) + ((this.field1845[this.field1841 - 1] & 0xFF) << 16) + ((this.field1845[this.field1841 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bi(I)I")
    public int method2150() {
        this.field1841 += 4;
        return (this.field1845[this.field1841 - 2] & 0xFF) + ((this.field1845[this.field1841 - 1] & 0xFF) << 8) + ((this.field1845[this.field1841 - 3] & 0xFF) << 24) + ((this.field1845[this.field1841 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bc([BIIB)V")
    public void method2276(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1845[++this.field1841 - 1];
        }
    }
}
