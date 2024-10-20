package deob;

import java.math.BigInteger;

@ObfuscatedName("dq")
public class class107 extends class184 {

    @ObfuscatedName("dq.z")
    public byte[] field1823;

    @ObfuscatedName("dq.j")
    public int field1819;

    @ObfuscatedName("dq.a")
    public static int[] field1820 = new int[256];

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
            field1820[var0] = var1;
        }
    }

    @ObfuscatedName("az.z([BIIB)I")
    public static int method679(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1820[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cm.j([BIB)I")
    public static int method1872(byte[] arg0, int arg1) {
        return method679(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1823 = class109.method2357(arg0);
        this.field1819 = 0;
    }

    public class107(byte[] arg0) {
        this.field1823 = arg0;
        this.field1819 = 0;
    }

    @ObfuscatedName("dq.a(II)V")
    public void method2108(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.y(II)V")
    public void method2109(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.i(IB)V")
    public void method2276(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 16);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.b(IB)V")
    public void method2111(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 24);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 16);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.s(J)V")
    public void method2112(long arg0) {
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1823[++this.field1819 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1823[++this.field1819 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("aw.q(Ljava/lang/String;B)I")
    public static int method722(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dq.p(Ljava/lang/String;B)V")
    public void method2113(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1819 += class199.method3159(arg0, 0, arg0.length(), this.field1823, this.field1819);
        this.field1823[++this.field1819 - 1] = 0;
    }

    @ObfuscatedName("client.h(Ljava/lang/String;I)I")
    public static int method387(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dq.r(Ljava/lang/String;I)V")
    public void method2114(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1823[++this.field1819 - 1] = 0;
        this.field1819 += class199.method3159(arg0, 0, arg0.length(), this.field1823, this.field1819);
        this.field1823[++this.field1819 - 1] = 0;
    }

    @ObfuscatedName("dq.o(Ljava/lang/CharSequence;I)V")
    public void method2115(CharSequence arg0) {
        int var2 = class185.method2579(arg0);
        this.field1823[++this.field1819 - 1] = 0;
        this.method2121(var2);
        int var3 = this.field1819;
        byte[] var4 = this.field1823;
        int var5 = this.field1819;
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
        this.field1819 = var10 + var3;
    }

    @ObfuscatedName("dq.f([BIII)V")
    public void method2230(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1823[++this.field1819 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dq.u(II)V")
    public void method2117(int arg0) {
        this.field1823[this.field1819 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1823[this.field1819 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1823[this.field1819 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1823[this.field1819 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.c(II)V")
    public void method2232(int arg0) {
        this.field1823[this.field1819 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1823[this.field1819 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.l(II)V")
    public void method2119(int arg0) {
        this.field1823[this.field1819 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.w(II)V")
    public void method2120(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2108(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2109(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dq.x(II)V")
    public void method2121(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2108(arg0 >>> 28 | 0x80);
                    }
                    this.method2108(arg0 >>> 21 | 0x80);
                }
                this.method2108(arg0 >>> 14 | 0x80);
            }
            this.method2108(arg0 >>> 7 | 0x80);
        }
        this.method2108(arg0 & 0x7F);
    }

    @ObfuscatedName("dq.t(I)I")
    public int method2122() {
        return this.field1823[++this.field1819 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.k(I)B")
    public byte method2201() {
        return this.field1823[++this.field1819 - 1];
    }

    @ObfuscatedName("dq.e(I)I")
    public int method2239() {
        this.field1819 += 2;
        return ((this.field1823[this.field1819 - 2] & 0xFF) << 8) + (this.field1823[this.field1819 - 1] & 0xFF);
    }

    @ObfuscatedName("dq.v(I)I")
    public int method2125() {
        this.field1819 += 2;
        int var1 = ((this.field1823[this.field1819 - 2] & 0xFF) << 8) + (this.field1823[this.field1819 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.n(B)I")
    public int method2212() {
        this.field1819 += 3;
        return (this.field1823[this.field1819 - 1] & 0xFF) + ((this.field1823[this.field1819 - 3] & 0xFF) << 16) + ((this.field1823[this.field1819 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dq.d(B)I")
    public int method2127() {
        this.field1819 += 4;
        return (this.field1823[this.field1819 - 1] & 0xFF) + ((this.field1823[this.field1819 - 2] & 0xFF) << 8) + ((this.field1823[this.field1819 - 4] & 0xFF) << 24) + ((this.field1823[this.field1819 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.m(S)J")
    public long method2128() {
        long var1 = (long) this.method2127() & 0xFFFFFFFFL;
        long var3 = (long) this.method2127() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dq.g(B)Ljava/lang/String;")
    public String method2129() {
        if (this.field1823[this.field1819] == 0) {
            this.field1819++;
            return null;
        } else {
            return this.method2130();
        }
    }

    @ObfuscatedName("dq.aq(I)Ljava/lang/String;")
    public String method2130() {
        int var1 = this.field1819;
        while (this.field1823[++this.field1819 - 1] != 0) {
        }
        int var2 = this.field1819 - var1 - 1;
        return var2 == 0 ? "" : class199.method1593(this.field1823, var1, var2);
    }

    @ObfuscatedName("dq.ao(I)Ljava/lang/String;")
    public String method2131() {
        byte var1 = this.field1823[++this.field1819 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1819;
        while (this.field1823[++this.field1819 - 1] != 0) {
        }
        int var3 = this.field1819 - var2 - 1;
        return var3 == 0 ? "" : class199.method1593(this.field1823, var2, var3);
    }

    @ObfuscatedName("dq.af(I)Ljava/lang/String;")
    public String method2132() {
        byte var1 = this.field1823[++this.field1819 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2215();
        if (this.field1819 + var2 > this.field1823.length) {
            throw new IllegalStateException("");
        }
        String var3 = class185.method2881(this.field1823, this.field1819, var2);
        this.field1819 += var2;
        return var3;
    }

    @ObfuscatedName("dq.ag([BIIS)V")
    public void method2133(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1823[++this.field1819 - 1];
        }
    }

    @ObfuscatedName("dq.ad(I)I")
    public int method2134() {
        int var1 = this.field1823[this.field1819] & 0xFF;
        return var1 < 128 ? this.method2122() - 64 : this.method2239() - 49152;
    }

    @ObfuscatedName("dq.ak(I)I")
    public int method2197() {
        int var1 = this.field1823[this.field1819] & 0xFF;
        return var1 < 128 ? this.method2122() : this.method2239() - 32768;
    }

    @ObfuscatedName("dq.aj(B)I")
    public int method2136() {
        return this.field1823[this.field1819] < 0 ? this.method2127() & Integer.MAX_VALUE : this.method2239();
    }

    @ObfuscatedName("dq.as(B)I")
    public int method2215() {
        byte var1 = this.field1823[++this.field1819 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1823[++this.field1819 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dq.al([IIIB)V")
    public void method2204(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1819;
        this.field1819 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2127();
            int var8 = this.method2127();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1819 -= 8;
            this.method2111(var7);
            this.method2111(var8);
        }
        this.field1819 = var4;
    }

    @ObfuscatedName("dq.ai([IIIB)V")
    public void method2139(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1819;
        this.field1819 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2127();
            int var8 = this.method2127();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1819 -= 8;
            this.method2111(var7);
            this.method2111(var8);
        }
        this.field1819 = var4;
    }

    @ObfuscatedName("dq.az(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2140(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1819;
        this.field1819 = 0;
        byte[] var4 = new byte[var3];
        this.method2133(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1819 = 0;
        this.method2109(var7.length);
        this.method2230(var7, 0, var7.length);
    }

    @ObfuscatedName("dq.aw(IB)I")
    public int method2154(int arg0) {
        int var2 = method679(this.field1823, arg0, this.field1819);
        this.method2111(var2);
        return var2;
    }

    @ObfuscatedName("dq.ay(I)Z")
    public boolean method2141() {
        this.field1819 -= 4;
        int var1 = method679(this.field1823, 0, this.field1819);
        int var2 = this.method2127();
        return var1 == var2;
    }

    @ObfuscatedName("dq.au(IB)V")
    public void method2143(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.ar(II)V")
    public void method2144(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dq.ap(II)V")
    public void method2145(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dq.an(I)I")
    public int method2135() {
        return this.field1823[++this.field1819 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dq.ae(B)I")
    public int method2147() {
        return -this.field1823[++this.field1819 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.aa(S)I")
    public int method2148() {
        return 128 - this.field1823[++this.field1819 - 1] & 0xFF;
    }

    @ObfuscatedName("dq.ax(B)B")
    public byte method2149() {
        return (byte) (this.field1823[++this.field1819 - 1] - 128);
    }

    @ObfuscatedName("dq.am(I)B")
    public byte method2150() {
        return (byte) (128 - this.field1823[++this.field1819 - 1]);
    }

    @ObfuscatedName("dq.ab(IB)V")
    public void method2151(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) arg0;
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.at(II)V")
    public void method2152(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dq.ah(II)V")
    public void method2153(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 + 128);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.ac(I)I")
    public int method2186() {
        this.field1819 += 2;
        return ((this.field1823[this.field1819 - 1] & 0xFF) << 8) + (this.field1823[this.field1819 - 2] & 0xFF);
    }

    @ObfuscatedName("dq.av(I)I")
    public int method2155() {
        this.field1819 += 2;
        return ((this.field1823[this.field1819 - 2] & 0xFF) << 8) + (this.field1823[this.field1819 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bp(I)I")
    public int method2262() {
        this.field1819 += 2;
        return ((this.field1823[this.field1819 - 1] & 0xFF) << 8) + (this.field1823[this.field1819 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dq.bg(I)I")
    public int method2157() {
        this.field1819 += 2;
        int var1 = ((this.field1823[this.field1819 - 2] & 0xFF) << 8) + (this.field1823[this.field1819 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dq.by(II)V")
    public void method2158(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 16);
        this.field1823[++this.field1819 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dq.bi(I)I")
    public int method2159() {
        this.field1819 += 3;
        return (this.field1823[this.field1819 - 2] & 0xFF) + ((this.field1823[this.field1819 - 3] & 0xFF) << 16) + ((this.field1823[this.field1819 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dq.bz(II)V")
    public void method2259(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) arg0;
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 16);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dq.be(II)V")
    public void method2161(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
        this.field1823[++this.field1819 - 1] = (byte) arg0;
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 24);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dq.bm(II)V")
    public void method2162(int arg0) {
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 16);
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 24);
        this.field1823[++this.field1819 - 1] = (byte) arg0;
        this.field1823[++this.field1819 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dq.bq(I)I")
    public int method2163() {
        this.field1819 += 4;
        return (this.field1823[this.field1819 - 4] & 0xFF) + ((this.field1823[this.field1819 - 3] & 0xFF) << 8) + ((this.field1823[this.field1819 - 2] & 0xFF) << 16) + ((this.field1823[this.field1819 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.bu(I)I")
    public int method2164() {
        this.field1819 += 4;
        return (this.field1823[this.field1819 - 3] & 0xFF) + ((this.field1823[this.field1819 - 4] & 0xFF) << 8) + ((this.field1823[this.field1819 - 1] & 0xFF) << 16) + ((this.field1823[this.field1819 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dq.bo(I)I")
    public int method2165() {
        this.field1819 += 4;
        return (this.field1823[this.field1819 - 2] & 0xFF) + ((this.field1823[this.field1819 - 1] & 0xFF) << 8) + ((this.field1823[this.field1819 - 3] & 0xFF) << 24) + ((this.field1823[this.field1819 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dq.bh([BIIB)V")
    public void method2311(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1823[++this.field1819 - 1] - 128);
        }
    }
}
