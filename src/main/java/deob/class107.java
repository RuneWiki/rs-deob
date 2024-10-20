package deob;

import java.math.BigInteger;

@ObfuscatedName("dh")
public class class107 extends class184 {

    @ObfuscatedName("dh.b")
    public byte[] field1844;

    @ObfuscatedName("dh.u")
    public int field1845;

    @ObfuscatedName("dh.x")
    public static int[] field1851 = new int[256];

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
            field1851[var0] = var1;
        }
    }

    @ObfuscatedName("cs.b([BIII)I")
    public static int method1788(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1851[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("ca.u([BII)I")
    public static int method2067(byte[] arg0, int arg1) {
        return method1788(arg0, 0, arg1);
    }

    public class107(int arg0) {
        this.field1844 = class109.method2382(arg0);
        this.field1845 = 0;
    }

    public class107(byte[] arg0) {
        this.field1844 = arg0;
        this.field1845 = 0;
    }

    @ObfuscatedName("dh.x(II)V")
    public void method2242(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.j(II)V")
    public void method2277(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.o(II)V")
    public void method2123(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.n(IB)V")
    public void method2124(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.y(J)V")
    public void method2125(long arg0) {
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1844[++this.field1845 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1844[++this.field1845 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ba.f(Ljava/lang/String;I)I")
    public static int method1611(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dh.p(Ljava/lang/String;B)V")
    public void method2126(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1845 += class199.method3101(arg0, 0, arg0.length(), this.field1844, this.field1845);
        this.field1844[++this.field1845 - 1] = 0;
    }

    @ObfuscatedName("ab.l(Ljava/lang/String;I)I")
    public static int method563(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dh.k(Ljava/lang/String;I)V")
    public void method2343(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1844[++this.field1845 - 1] = 0;
        this.field1845 += class199.method3101(arg0, 0, arg0.length(), this.field1844, this.field1845);
        this.field1844[++this.field1845 - 1] = 0;
    }

    @ObfuscatedName("dh.q(Ljava/lang/CharSequence;B)V")
    public void method2309(CharSequence arg0) {
        int var2 = class185.method1868(arg0);
        this.field1844[++this.field1845 - 1] = 0;
        this.method2329(var2);
        this.field1845 += class185.method502(this.field1844, this.field1845, arg0);
    }

    @ObfuscatedName("dh.e([BIII)V")
    public void method2129(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1844[++this.field1845 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dh.t(II)V")
    public void method2194(int arg0) {
        this.field1844[this.field1845 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1844[this.field1845 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1844[this.field1845 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1844[this.field1845 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.g(II)V")
    public void method2131(int arg0) {
        this.field1844[this.field1845 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1844[this.field1845 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.c(IB)V")
    public void method2132(int arg0) {
        this.field1844[this.field1845 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.m(II)V")
    public void method2156(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2242(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2277(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dh.i(IB)V")
    public void method2329(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2242(arg0 >>> 28 | 0x80);
                    }
                    this.method2242(arg0 >>> 21 | 0x80);
                }
                this.method2242(arg0 >>> 14 | 0x80);
            }
            this.method2242(arg0 >>> 7 | 0x80);
        }
        this.method2242(arg0 & 0x7F);
    }

    @ObfuscatedName("dh.h(I)I")
    public int method2134() {
        return this.field1844[++this.field1845 - 1] & 0xFF;
    }

    @ObfuscatedName("dh.a(S)B")
    public byte method2135() {
        return this.field1844[++this.field1845 - 1];
    }

    @ObfuscatedName("dh.w(I)I")
    public int method2136() {
        this.field1845 += 2;
        return ((this.field1844[this.field1845 - 2] & 0xFF) << 8) + (this.field1844[this.field1845 - 1] & 0xFF);
    }

    @ObfuscatedName("dh.z(I)I")
    public int method2153() {
        this.field1845 += 2;
        int var1 = ((this.field1844[this.field1845 - 2] & 0xFF) << 8) + (this.field1844[this.field1845 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dh.v(B)I")
    public int method2138() {
        this.field1845 += 3;
        return (this.field1844[this.field1845 - 1] & 0xFF) + ((this.field1844[this.field1845 - 3] & 0xFF) << 16) + ((this.field1844[this.field1845 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dh.s(B)I")
    public int method2139() {
        this.field1845 += 4;
        return (this.field1844[this.field1845 - 1] & 0xFF) + ((this.field1844[this.field1845 - 2] & 0xFF) << 8) + ((this.field1844[this.field1845 - 4] & 0xFF) << 24) + ((this.field1844[this.field1845 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.r(I)J")
    public long method2227() {
        long var1 = (long) this.method2139() & 0xFFFFFFFFL;
        long var3 = (long) this.method2139() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dh.d(B)Ljava/lang/String;")
    public String method2133() {
        if (this.field1844[this.field1845] == 0) {
            this.field1845++;
            return null;
        } else {
            return this.method2339();
        }
    }

    @ObfuscatedName("dh.al(I)Ljava/lang/String;")
    public String method2339() {
        int var1 = this.field1845;
        while (this.field1844[++this.field1845 - 1] != 0) {
        }
        int var2 = this.field1845 - var1 - 1;
        return var2 == 0 ? "" : class199.method2545(this.field1844, var1, var2);
    }

    @ObfuscatedName("dh.ab(I)Ljava/lang/String;")
    public String method2143() {
        byte var1 = this.field1844[++this.field1845 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1845;
        while (this.field1844[++this.field1845 - 1] != 0) {
        }
        int var3 = this.field1845 - var2 - 1;
        return var3 == 0 ? "" : class199.method2545(this.field1844, var2, var3);
    }

    @ObfuscatedName("dh.au(I)Ljava/lang/String;")
    public String method2144() {
        byte var1 = this.field1844[++this.field1845 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2287();
        if (this.field1845 + var2 > this.field1844.length) {
            throw new IllegalStateException("");
        }
        String var3 = class185.method3092(this.field1844, this.field1845, var2);
        this.field1845 += var2;
        return var3;
    }

    @ObfuscatedName("dh.az([BIII)V")
    public void method2145(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1844[++this.field1845 - 1];
        }
    }

    @ObfuscatedName("dh.ai(I)I")
    public int method2184() {
        int var1 = this.field1844[this.field1845] & 0xFF;
        return var1 < 128 ? this.method2134() - 64 : this.method2136() - 49152;
    }

    @ObfuscatedName("dh.ay(I)I")
    public int method2147() {
        int var1 = this.field1844[this.field1845] & 0xFF;
        return var1 < 128 ? this.method2134() : this.method2136() - 32768;
    }

    @ObfuscatedName("dh.ar(I)I")
    public int method2148() {
        return this.field1844[this.field1845] < 0 ? this.method2139() & Integer.MAX_VALUE : this.method2136();
    }

    @ObfuscatedName("dh.af(I)I")
    public int method2287() {
        byte var1 = this.field1844[++this.field1845 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1844[++this.field1845 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dh.as([IIII)V")
    public void method2149(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1845;
        this.field1845 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2139();
            int var8 = this.method2139();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1845 -= 8;
            this.method2124(var7);
            this.method2124(var8);
        }
        this.field1845 = var4;
    }

    @ObfuscatedName("dh.ap([IIIB)V")
    public void method2150(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1845;
        this.field1845 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2139();
            int var8 = this.method2139();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1845 -= 8;
            this.method2124(var7);
            this.method2124(var8);
        }
        this.field1845 = var4;
    }

    @ObfuscatedName("dh.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2151(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1845;
        this.field1845 = 0;
        byte[] var4 = new byte[var3];
        this.method2145(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1845 = 0;
        this.method2277(var7.length);
        this.method2129(var7, 0, var7.length);
    }

    @ObfuscatedName("dh.ac(II)I")
    public int method2152(int arg0) {
        int var2 = method1788(this.field1844, arg0, this.field1845);
        this.method2124(var2);
        return var2;
    }

    @ObfuscatedName("dh.aa(I)Z")
    public boolean method2177() {
        this.field1845 -= 4;
        int var1 = method1788(this.field1844, 0, this.field1845);
        int var2 = this.method2139();
        return var1 == var2;
    }

    @ObfuscatedName("dh.ag(IB)V")
    public void method2154(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dh.ae(II)V")
    public void method2155(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dh.ak(II)V")
    public void method2120(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dh.aw(B)I")
    public int method2157() {
        return this.field1844[++this.field1845 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dh.ao(B)I")
    public int method2158() {
        return -this.field1844[++this.field1845 - 1] & 0xFF;
    }

    @ObfuscatedName("dh.aq(B)I")
    public int method2159() {
        return 128 - this.field1844[++this.field1845 - 1] & 0xFF;
    }

    @ObfuscatedName("dh.av(I)B")
    public byte method2160() {
        return (byte) (-this.field1844[++this.field1845 - 1]);
    }

    @ObfuscatedName("dh.am(B)B")
    public byte method2161() {
        return (byte) (128 - this.field1844[++this.field1845 - 1]);
    }

    @ObfuscatedName("dh.at(II)V")
    public void method2162(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) arg0;
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dh.an(IB)V")
    public void method2163(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dh.ax(II)V")
    public void method2164(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 + 128);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dh.ah(I)I")
    public int method2174() {
        this.field1845 += 2;
        return ((this.field1844[this.field1845 - 1] & 0xFF) << 8) + (this.field1844[this.field1845 - 2] & 0xFF);
    }

    @ObfuscatedName("dh.ad(I)I")
    public int method2212() {
        this.field1845 += 2;
        return ((this.field1844[this.field1845 - 2] & 0xFF) << 8) + (this.field1844[this.field1845 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dh.bm(I)I")
    public int method2167() {
        this.field1845 += 2;
        return ((this.field1844[this.field1845 - 1] & 0xFF) << 8) + (this.field1844[this.field1845 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dh.bs(I)I")
    public int method2205() {
        this.field1845 += 2;
        int var1 = ((this.field1844[this.field1845 - 1] & 0xFF) << 8) + (this.field1844[this.field1845 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dh.bj(I)I")
    public int method2169() {
        this.field1845 += 2;
        int var1 = ((this.field1844[this.field1845 - 2] & 0xFF) << 8) + (this.field1844[this.field1845 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dh.bq(B)I")
    public int method2170() {
        this.field1845 += 2;
        int var1 = ((this.field1844[this.field1845 - 1] & 0xFF) << 8) + (this.field1844[this.field1845 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dh.bv(II)V")
    public void method2171(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1845 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dh.bi(IB)V")
    public void method2276(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) arg0;
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dh.bp(II)V")
    public void method2173(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
        this.field1844[++this.field1845 - 1] = (byte) arg0;
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dh.bl(II)V")
    public void method2210(int arg0) {
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 16);
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 24);
        this.field1844[++this.field1845 - 1] = (byte) arg0;
        this.field1844[++this.field1845 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dh.bz(B)I")
    public int method2175() {
        this.field1845 += 4;
        return (this.field1844[this.field1845 - 4] & 0xFF) + ((this.field1844[this.field1845 - 3] & 0xFF) << 8) + ((this.field1844[this.field1845 - 1] & 0xFF) << 24) + ((this.field1844[this.field1845 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.bx(I)I")
    public int method2176() {
        this.field1845 += 4;
        return (this.field1844[this.field1845 - 3] & 0xFF) + ((this.field1844[this.field1845 - 4] & 0xFF) << 8) + ((this.field1844[this.field1845 - 2] & 0xFF) << 24) + ((this.field1844[this.field1845 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dh.bb(I)I")
    public int method2235() {
        this.field1845 += 4;
        return (this.field1844[this.field1845 - 2] & 0xFF) + ((this.field1844[this.field1845 - 1] & 0xFF) << 8) + ((this.field1844[this.field1845 - 4] & 0xFF) << 16) + ((this.field1844[this.field1845 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dh.be([BIIS)V")
    public void method2288(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1844[++this.field1845 - 1];
        }
    }

    @ObfuscatedName("dh.bf([BIIB)V")
    public void method2179(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1844[++this.field1845 - 1] - 128);
        }
    }
}
