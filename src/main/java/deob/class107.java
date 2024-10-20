package deob;

import java.math.BigInteger;

@ObfuscatedName("dy")
public class class107 extends class187 {

    @ObfuscatedName("dy.k")
    public byte[] field1844;

    @ObfuscatedName("dy.y")
    public int field1838;

    @ObfuscatedName("dy.s")
    public static int[] field1839 = new int[256];

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
            field1839[var0] = var1;
        }
    }

    @ObfuscatedName("ac.k([BIIB)I")
    public static int method717(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1839[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("fa.y([BIS)I")
    public static int method3195(byte[] arg0, int arg1) {
        return method717(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1844 = class109.method2360(arg0);
        this.field1838 = 0;
    }

    public class107(byte[] arg0) {
        this.field1844 = arg0;
        this.field1838 = 0;
    }

    @ObfuscatedName("dy.s(II)V")
    public void method2124(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.g(II)V")
    public void method2132(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1838 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.h(II)V")
    public void method2126(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1838 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.l(II)V")
    public void method2127(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1838 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.e(J)V")
    public void method2128(long arg0) {
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1844[++this.field1838 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1844[++this.field1838 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("bw.u(Ljava/lang/String;I)I")
    public static int method1605(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dy.j(Ljava/lang/String;B)V")
    public void method2129(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1838 += class202.method570(arg0, 0, arg0.length(), this.field1844, this.field1838);
        this.field1844[++this.field1838 - 1] = 0;
    }

    @ObfuscatedName("dy.c(Ljava/lang/String;I)V")
    public void method2130(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1844[++this.field1838 - 1] = 0;
        this.field1838 += class202.method570(arg0, 0, arg0.length(), this.field1844, this.field1838);
        this.field1844[++this.field1838 - 1] = 0;
    }

    @ObfuscatedName("dy.d(Ljava/lang/CharSequence;I)V")
    public void method2131(CharSequence arg0) {
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
        this.field1844[++this.field1838 - 1] = 0;
        this.method2137(var3);
        this.field1838 += class188.method2061(this.field1844, this.field1838, arg0);
    }

    @ObfuscatedName("dy.v([BIIB)V")
    public void method2209(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1844[++this.field1838 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dy.n(IS)V")
    public void method2133(int arg0) {
        this.field1844[this.field1838 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1844[this.field1838 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1844[this.field1838 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1844[this.field1838 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.z(II)V")
    public void method2134(int arg0) {
        this.field1844[this.field1838 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1844[this.field1838 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.a(II)V")
    public void method2135(int arg0) {
        this.field1844[this.field1838 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dy.t(II)V")
    public void method2136(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2124(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2132(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dy.p(II)V")
    public void method2137(int arg0) {
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

    @ObfuscatedName("dy.i(B)I")
    public int method2138() {
        return this.field1844[++this.field1838 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.r(B)B")
    public byte method2139() {
        return this.field1844[++this.field1838 - 1];
    }

    @ObfuscatedName("dy.w(S)I")
    public int method2239() {
        this.field1838 += 2;
        return ((this.field1844[this.field1838 - 2] & 0xFF) << 8) + (this.field1844[this.field1838 - 1] & 0xFF);
    }

    @ObfuscatedName("dy.b(I)I")
    public int method2283() {
        this.field1838 += 2;
        int var1 = ((this.field1844[this.field1838 - 2] & 0xFF) << 8) + (this.field1844[this.field1838 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.x(I)I")
    public int method2142() {
        this.field1838 += 3;
        return (this.field1844[this.field1838 - 1] & 0xFF) + ((this.field1844[this.field1838 - 2] & 0xFF) << 8) + ((this.field1844[this.field1838 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.q(I)I")
    public int method2143() {
        this.field1838 += 4;
        return (this.field1844[this.field1838 - 1] & 0xFF) + ((this.field1844[this.field1838 - 2] & 0xFF) << 8) + ((this.field1844[this.field1838 - 3] & 0xFF) << 16) + ((this.field1844[this.field1838 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dy.o(I)J")
    public long method2144() {
        long var1 = (long) this.method2143() & 0xFFFFFFFFL;
        long var3 = (long) this.method2143() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dy.m(I)Ljava/lang/String;")
    public String method2271() {
        if (this.field1844[this.field1838] == 0) {
            this.field1838++;
            return null;
        } else {
            return this.method2146();
        }
    }

    @ObfuscatedName("dy.f(I)Ljava/lang/String;")
    public String method2146() {
        int var1 = this.field1838;
        while (this.field1844[++this.field1838 - 1] != 0) {
        }
        int var2 = this.field1838 - var1 - 1;
        return var2 == 0 ? "" : class202.method3004(this.field1844, var1, var2);
    }

    @ObfuscatedName("dy.ab(I)Ljava/lang/String;")
    public String method2147() {
        byte var1 = this.field1844[++this.field1838 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1838;
        while (this.field1844[++this.field1838 - 1] != 0) {
        }
        int var3 = this.field1838 - var2 - 1;
        return var3 == 0 ? "" : class202.method3004(this.field1844, var2, var3);
    }

    @ObfuscatedName("dy.al(I)Ljava/lang/String;")
    public String method2148() {
        byte var1 = this.field1844[++this.field1838 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2153();
        if (this.field1838 + var2 > this.field1844.length) {
            throw new IllegalStateException("");
        }
        String var3 = class188.method2842(this.field1844, this.field1838, var2);
        this.field1838 += var2;
        return var3;
    }

    @ObfuscatedName("dy.an([BIII)V")
    public void method2149(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1844[++this.field1838 - 1];
        }
    }

    @ObfuscatedName("dy.aw(I)I")
    public int method2307() {
        int var1 = this.field1844[this.field1838] & 0xFF;
        return var1 < 128 ? this.method2138() - 64 : this.method2239() - 49152;
    }

    @ObfuscatedName("dy.ar(I)I")
    public int method2151() {
        int var1 = this.field1844[this.field1838] & 0xFF;
        return var1 < 128 ? this.method2138() : this.method2239() - 32768;
    }

    @ObfuscatedName("dy.ai(I)I")
    public int method2152() {
        return this.field1844[this.field1838] < 0 ? this.method2143() & Integer.MAX_VALUE : this.method2239();
    }

    @ObfuscatedName("dy.aj(I)I")
    public int method2153() {
        byte var1 = this.field1844[++this.field1838 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1844[++this.field1838 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dy.ao([IIII)V")
    public void method2154(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1838;
        this.field1838 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2143();
            int var8 = this.method2143();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1838 -= 8;
            this.method2127(var7);
            this.method2127(var8);
        }
        this.field1838 = var4;
    }

    @ObfuscatedName("dy.ap([IIII)V")
    public void method2280(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1838;
        this.field1838 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2143();
            int var8 = this.method2143();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1838 -= 8;
            this.method2127(var7);
            this.method2127(var8);
        }
        this.field1838 = var4;
    }

    @ObfuscatedName("dy.as(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2287(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1838;
        this.field1838 = 0;
        byte[] var4 = new byte[var3];
        this.method2149(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1838 = 0;
        this.method2132(var7.length);
        this.method2209(var7, 0, var7.length);
    }

    @ObfuscatedName("dy.au(IB)I")
    public int method2157(int arg0) {
        int var2 = method717(this.field1844, arg0, this.field1838);
        this.method2127(var2);
        return var2;
    }

    @ObfuscatedName("dy.ac(I)Z")
    public boolean method2324() {
        this.field1838 -= 4;
        int var1 = method717(this.field1844, 0, this.field1838);
        int var2 = this.method2143();
        return var1 == var2;
    }

    @ObfuscatedName("dy.ay(II)V")
    public void method2270(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.av(IB)V")
    public void method2160(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dy.ak(II)V")
    public void method2256(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dy.ae(I)I")
    public int method2294() {
        return this.field1844[++this.field1838 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dy.at(I)I")
    public int method2238() {
        return -this.field1844[++this.field1838 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.az(I)I")
    public int method2305() {
        return 128 - this.field1844[++this.field1838 - 1] & 0xFF;
    }

    @ObfuscatedName("dy.ag(B)B")
    public byte method2165() {
        return (byte) (this.field1844[++this.field1838 - 1] - 128);
    }

    @ObfuscatedName("dy.af(B)B")
    public byte method2243() {
        return (byte) (-this.field1844[++this.field1838 - 1]);
    }

    @ObfuscatedName("dy.am(B)B")
    public byte method2167() {
        return (byte) (128 - this.field1844[++this.field1838 - 1]);
    }

    @ObfuscatedName("dy.ah(IB)V")
    public void method2168(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) arg0;
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.aq(IB)V")
    public void method2169(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dy.ax(II)V")
    public void method2170(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 + 128);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.ad(I)I")
    public int method2171() {
        this.field1838 += 2;
        return ((this.field1844[this.field1838 - 1] & 0xFF) << 8) + (this.field1844[this.field1838 - 2] & 0xFF);
    }

    @ObfuscatedName("dy.aa(I)I")
    public int method2172() {
        this.field1838 += 2;
        return ((this.field1844[this.field1838 - 2] & 0xFF) << 8) + (this.field1844[this.field1838 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.bm(I)I")
    public int method2140() {
        this.field1838 += 2;
        return ((this.field1844[this.field1838 - 1] & 0xFF) << 8) + (this.field1844[this.field1838 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dy.bg(B)I")
    public int method2174() {
        this.field1838 += 2;
        int var1 = ((this.field1844[this.field1838 - 1] & 0xFF) << 8) + (this.field1844[this.field1838 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.bf(I)I")
    public int method2175() {
        this.field1838 += 2;
        int var1 = ((this.field1844[this.field1838 - 1] & 0xFF) << 8) + (this.field1844[this.field1838 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dy.bo(IB)V")
    public void method2176(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1838 - 1] = (byte) arg0;
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.bk(I)I")
    public int method2304() {
        this.field1838 += 3;
        return (this.field1844[this.field1838 - 2] & 0xFF) + ((this.field1844[this.field1838 - 1] & 0xFF) << 8) + ((this.field1844[this.field1838 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.br(IB)V")
    public void method2222(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) arg0;
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dy.bd(IB)V")
    public void method2125(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1838 - 1] = (byte) arg0;
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dy.bl(IB)V")
    public void method2180(int arg0) {
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1838 - 1] = (byte) arg0;
        this.field1844[++this.field1838 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dy.bj(I)I")
    public int method2181() {
        this.field1838 += 4;
        return (this.field1844[this.field1838 - 4] & 0xFF) + ((this.field1844[this.field1838 - 3] & 0xFF) << 8) + ((this.field1844[this.field1838 - 2] & 0xFF) << 16) + ((this.field1844[this.field1838 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dy.bn(I)I")
    public int method2182() {
        this.field1838 += 4;
        return (this.field1844[this.field1838 - 3] & 0xFF) + ((this.field1844[this.field1838 - 4] & 0xFF) << 8) + ((this.field1844[this.field1838 - 2] & 0xFF) << 24) + ((this.field1844[this.field1838 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dy.bs(I)I")
    public int method2242() {
        this.field1838 += 4;
        return (this.field1844[this.field1838 - 2] & 0xFF) + ((this.field1844[this.field1838 - 1] & 0xFF) << 8) + ((this.field1844[this.field1838 - 4] & 0xFF) << 16) + ((this.field1844[this.field1838 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dy.be([BIII)V")
    public void method2235(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1844[++this.field1838 - 1] - 128);
        }
    }
}
