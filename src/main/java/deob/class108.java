package deob;

import java.math.BigInteger;

@ObfuscatedName("du")
public class class108 extends class189 {

    @ObfuscatedName("du.f")
    public byte[] field1854;

    @ObfuscatedName("du.k")
    public int field1859;

    @ObfuscatedName("du.y")
    public static int[] field1850 = new int[256];

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
            field1850[var0] = var1;
        }
    }

    @ObfuscatedName("cd.f([BIII)I")
    public static int method2085(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1850[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class108(int arg0) {
        this.field1854 = class110.method2389(arg0);
        this.field1859 = 0;
    }

    public class108(byte[] arg0) {
        this.field1854 = arg0;
        this.field1859 = 0;
    }

    @ObfuscatedName("du.k(IB)V")
    public void method2144(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.y(II)V")
    public void method2145(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.e(IB)V")
    public void method2146(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.r(IB)V")
    public void method2147(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 24);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.a(J)V")
    public void method2148(long arg0) {
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1854[++this.field1859 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1854[++this.field1859 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("j.n(Ljava/lang/String;I)I")
    public static int method480(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("du.x(Ljava/lang/String;B)V")
    public void method2149(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1859 += class213.method4(arg0, 0, arg0.length(), this.field1854, this.field1859);
        this.field1854[++this.field1859 - 1] = 0;
    }

    @ObfuscatedName("du.g(Ljava/lang/String;I)V")
    public void method2150(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1854[++this.field1859 - 1] = 0;
        this.field1859 += class213.method4(arg0, 0, arg0.length(), this.field1854, this.field1859);
        this.field1854[++this.field1859 - 1] = 0;
    }

    @ObfuscatedName("du.o(Ljava/lang/CharSequence;I)V")
    public void method2151(CharSequence arg0) {
        int var2 = class190.method2996(arg0);
        this.field1854[++this.field1859 - 1] = 0;
        this.method2309(var2);
        int var3 = this.field1859;
        byte[] var4 = this.field1854;
        int var5 = this.field1859;
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
        this.field1859 = var10 + var3;
    }

    @ObfuscatedName("du.p([BIIB)V")
    public void method2190(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1854[++this.field1859 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("du.v(II)V")
    public void method2228(int arg0) {
        this.field1854[this.field1859 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1854[this.field1859 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1854[this.field1859 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1854[this.field1859 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.w(II)V")
    public void method2154(int arg0) {
        this.field1854[this.field1859 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1854[this.field1859 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.t(II)V")
    public void method2354(int arg0) {
        this.field1854[this.field1859 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.s(II)V")
    public void method2156(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2144(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2145(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.b(IB)V")
    public void method2309(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2144(arg0 >>> 28 | 0x80);
                    }
                    this.method2144(arg0 >>> 21 | 0x80);
                }
                this.method2144(arg0 >>> 14 | 0x80);
            }
            this.method2144(arg0 >>> 7 | 0x80);
        }
        this.method2144(arg0 & 0x7F);
    }

    @ObfuscatedName("du.u(I)I")
    public int method2158() {
        return this.field1854[++this.field1859 - 1] & 0xFF;
    }

    @ObfuscatedName("du.j(B)B")
    public byte method2159() {
        return this.field1854[++this.field1859 - 1];
    }

    @ObfuscatedName("du.d(B)I")
    public int method2160() {
        this.field1859 += 2;
        return ((this.field1854[this.field1859 - 2] & 0xFF) << 8) + (this.field1854[this.field1859 - 1] & 0xFF);
    }

    @ObfuscatedName("du.l(B)I")
    public int method2161() {
        this.field1859 += 2;
        int var1 = ((this.field1854[this.field1859 - 2] & 0xFF) << 8) + (this.field1854[this.field1859 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.m(I)I")
    public int method2314() {
        this.field1859 += 3;
        return (this.field1854[this.field1859 - 1] & 0xFF) + ((this.field1854[this.field1859 - 3] & 0xFF) << 16) + ((this.field1854[this.field1859 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("du.q(S)I")
    public int method2256() {
        this.field1859 += 4;
        return (this.field1854[this.field1859 - 1] & 0xFF) + ((this.field1854[this.field1859 - 2] & 0xFF) << 8) + ((this.field1854[this.field1859 - 3] & 0xFF) << 16) + ((this.field1854[this.field1859 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("du.h(I)J")
    public long method2201() {
        long var1 = (long) this.method2256() & 0xFFFFFFFFL;
        long var3 = (long) this.method2256() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("du.c(I)Ljava/lang/String;")
    public String method2165() {
        if (this.field1854[this.field1859] == 0) {
            this.field1859++;
            return null;
        } else {
            return this.method2275();
        }
    }

    @ObfuscatedName("du.z(B)Ljava/lang/String;")
    public String method2275() {
        int var1 = this.field1859;
        while (this.field1854[++this.field1859 - 1] != 0) {
        }
        int var2 = this.field1859 - var1 - 1;
        return var2 == 0 ? "" : class213.method567(this.field1854, var1, var2);
    }

    @ObfuscatedName("du.i(I)Ljava/lang/String;")
    public String method2167() {
        byte var1 = this.field1854[++this.field1859 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1859;
        while (this.field1854[++this.field1859 - 1] != 0) {
        }
        int var3 = this.field1859 - var2 - 1;
        return var3 == 0 ? "" : class213.method567(this.field1854, var2, var3);
    }

    @ObfuscatedName("du.ah(I)Ljava/lang/String;")
    public String method2168() {
        byte var1 = this.field1854[++this.field1859 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2356();
        if (this.field1859 + var2 > this.field1854.length) {
            throw new IllegalStateException("");
        }
        String var3 = Statics.method882(this.field1854, this.field1859, var2);
        this.field1859 += var2;
        return var3;
    }

    @ObfuscatedName("du.aj([BIIB)V")
    public void method2169(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1854[++this.field1859 - 1];
        }
    }

    @ObfuscatedName("du.ar(I)I")
    public int method2285() {
        int var1 = this.field1854[this.field1859] & 0xFF;
        return var1 < 128 ? this.method2158() - 64 : this.method2160() - 49152;
    }

    @ObfuscatedName("du.al(I)I")
    public int method2171() {
        int var1 = this.field1854[this.field1859] & 0xFF;
        return var1 < 128 ? this.method2158() : this.method2160() - 32768;
    }

    @ObfuscatedName("du.aw(B)I")
    public int method2172() {
        return this.field1854[this.field1859] < 0 ? this.method2256() & Integer.MAX_VALUE : this.method2160();
    }

    @ObfuscatedName("du.ao(I)I")
    public int method2356() {
        byte var1 = this.field1854[++this.field1859 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1854[++this.field1859 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("du.ax([IIIB)V")
    public void method2174(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1859;
        this.field1859 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2256();
            int var8 = this.method2256();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1859 -= 8;
            this.method2147(var7);
            this.method2147(var8);
        }
        this.field1859 = var4;
    }

    @ObfuscatedName("du.au([IIII)V")
    public void method2175(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1859;
        this.field1859 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2256();
            int var8 = this.method2256();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1859 -= 8;
            this.method2147(var7);
            this.method2147(var8);
        }
        this.field1859 = var4;
    }

    @ObfuscatedName("du.av(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2312(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1859;
        this.field1859 = 0;
        byte[] var4 = new byte[var3];
        this.method2169(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1859 = 0;
        this.method2145(var7.length);
        this.method2190(var7, 0, var7.length);
    }

    @ObfuscatedName("du.ae(II)I")
    public int method2177(int arg0) {
        int var2 = method2085(this.field1854, arg0, this.field1859);
        this.method2147(var2);
        return var2;
    }

    @ObfuscatedName("du.ak(I)Z")
    public boolean method2282() {
        this.field1859 -= 4;
        int var1 = method2085(this.field1854, 0, this.field1859);
        int var2 = this.method2256();
        return var1 == var2;
    }

    @ObfuscatedName("du.ay(IB)V")
    public void method2179(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("du.at(IS)V")
    public void method2180(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("du.ap(IB)V")
    public void method2181(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("du.an(B)I")
    public int method2316() {
        return this.field1854[++this.field1859 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("du.ad(I)I")
    public int method2236() {
        return -this.field1854[++this.field1859 - 1] & 0xFF;
    }

    @ObfuscatedName("du.ag(I)I")
    public int method2184() {
        return 128 - this.field1854[++this.field1859 - 1] & 0xFF;
    }

    @ObfuscatedName("du.am(B)B")
    public byte method2163() {
        return (byte) (this.field1854[++this.field1859 - 1] - 128);
    }

    @ObfuscatedName("du.ai(I)B")
    public byte method2186() {
        return (byte) (-this.field1854[++this.field1859 - 1]);
    }

    @ObfuscatedName("du.ab(II)V")
    public void method2257(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) arg0;
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.af(II)V")
    public void method2188(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("du.ac(II)V")
    public void method2291(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 + 128);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.aq(I)I")
    public int method2339() {
        this.field1859 += 2;
        return ((this.field1854[this.field1859 - 1] & 0xFF) << 8) + (this.field1854[this.field1859 - 2] & 0xFF);
    }

    @ObfuscatedName("du.as(B)I")
    public int method2340() {
        this.field1859 += 2;
        return ((this.field1854[this.field1859 - 2] & 0xFF) << 8) + (this.field1854[this.field1859 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("du.az(I)I")
    public int method2192() {
        this.field1859 += 2;
        return ((this.field1854[this.field1859 - 1] & 0xFF) << 8) + (this.field1854[this.field1859 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("du.aa(S)I")
    public int method2298() {
        this.field1859 += 2;
        int var1 = ((this.field1854[this.field1859 - 2] & 0xFF) << 8) + (this.field1854[this.field1859 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.ba(B)I")
    public int method2295() {
        this.field1859 += 2;
        int var1 = ((this.field1854[this.field1859 - 1] & 0xFF) << 8) + (this.field1854[this.field1859 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("du.br(IS)V")
    public void method2195(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1859 - 1] = (byte) arg0;
    }

    @ObfuscatedName("du.bp(II)V")
    public void method2322(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) arg0;
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("du.bf(II)V")
    public void method2197(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
        this.field1854[++this.field1859 - 1] = (byte) arg0;
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 24);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("du.bu(IB)V")
    public void method2198(int arg0) {
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 16);
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 24);
        this.field1854[++this.field1859 - 1] = (byte) arg0;
        this.field1854[++this.field1859 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("du.bo(I)I")
    public int method2348() {
        this.field1859 += 4;
        return (this.field1854[this.field1859 - 4] & 0xFF) + ((this.field1854[this.field1859 - 3] & 0xFF) << 8) + ((this.field1854[this.field1859 - 2] & 0xFF) << 16) + ((this.field1854[this.field1859 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("du.be(B)I")
    public int method2200() {
        this.field1859 += 4;
        return (this.field1854[this.field1859 - 3] & 0xFF) + ((this.field1854[this.field1859 - 4] & 0xFF) << 8) + ((this.field1854[this.field1859 - 2] & 0xFF) << 24) + ((this.field1854[this.field1859 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("du.bx(B)I")
    public int method2280() {
        this.field1859 += 4;
        return (this.field1854[this.field1859 - 2] & 0xFF) + ((this.field1854[this.field1859 - 1] & 0xFF) << 8) + ((this.field1854[this.field1859 - 3] & 0xFF) << 24) + ((this.field1854[this.field1859 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("du.bh([BIII)V")
    public void method2202(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1854[++this.field1859 - 1];
        }
    }
}
