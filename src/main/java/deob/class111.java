package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class111 extends class198 {

    @ObfuscatedName("dx.q")
    public byte[] field1859;

    @ObfuscatedName("dx.s")
    public int field1852;

    @ObfuscatedName("dx.h")
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

    @ObfuscatedName("am.q([BIII)I")
    public static int method588(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1851[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cj.s([BIB)I")
    public static int method1982(byte[] arg0, int arg1) {
        return method588(arg0, 0, arg1);
    }

    public class111(int arg0) {
        this.field1859 = class113.method2370(arg0);
        this.field1852 = 0;
    }

    public class111(byte[] arg0) {
        this.field1859 = arg0;
        this.field1852 = 0;
    }

    @ObfuscatedName("dx.h(IS)V")
    public void method2133(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.e(IB)V")
    public void method2134(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
        this.field1859[++this.field1852 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.n(II)V")
    public void method2135(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 16);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
        this.field1859[++this.field1852 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.t(IB)V")
    public void method2136(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 24);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 16);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
        this.field1859[++this.field1852 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.l(J)V")
    public void method2146(long arg0) {
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1859[++this.field1852 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.m(J)V")
    public void method2244(long arg0) {
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1859[++this.field1852 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1859[++this.field1852 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ez.o(Ljava/lang/String;I)I")
    public static int method2719(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.k(Ljava/lang/String;I)V")
    public void method2139(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1852 += class156.method145(arg0, 0, arg0.length(), this.field1859, this.field1852);
        this.field1859[++this.field1852 - 1] = 0;
    }

    @ObfuscatedName("au.p(Ljava/lang/String;I)I")
    public static int method831(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dx.u(Ljava/lang/String;I)V")
    public void method2329(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1859[++this.field1852 - 1] = 0;
        this.field1852 += class156.method145(arg0, 0, arg0.length(), this.field1859, this.field1852);
        this.field1859[++this.field1852 - 1] = 0;
    }

    @ObfuscatedName("dx.g(Ljava/lang/CharSequence;B)V")
    public void method2141(CharSequence arg0) {
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
        this.field1859[++this.field1852 - 1] = 0;
        this.method2147(var3);
        this.field1852 += class199.method2708(this.field1859, this.field1852, arg0);
    }

    @ObfuscatedName("dx.a([BIII)V")
    public void method2142(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1859[++this.field1852 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.y(II)V")
    public void method2143(int arg0) {
        this.field1859[this.field1852 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1859[this.field1852 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1859[this.field1852 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1859[this.field1852 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.d(II)V")
    public void method2144(int arg0) {
        this.field1859[this.field1852 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1859[this.field1852 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.b(II)V")
    public void method2270(int arg0) {
        this.field1859[this.field1852 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.j(II)V")
    public void method2322(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2133(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2134(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.f(II)V")
    public void method2147(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2133(arg0 >>> 28 | 0x80);
                    }
                    this.method2133(arg0 >>> 21 | 0x80);
                }
                this.method2133(arg0 >>> 14 | 0x80);
            }
            this.method2133(arg0 >>> 7 | 0x80);
        }
        this.method2133(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.w(B)I")
    public int method2231() {
        return this.field1859[++this.field1852 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.z(I)B")
    public byte method2149() {
        return this.field1859[++this.field1852 - 1];
    }

    @ObfuscatedName("dx.x(I)I")
    public int method2307() {
        this.field1852 += 2;
        return ((this.field1859[this.field1852 - 2] & 0xFF) << 8) + (this.field1859[this.field1852 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.v(I)I")
    public int method2151() {
        this.field1852 += 2;
        int var1 = ((this.field1859[this.field1852 - 2] & 0xFF) << 8) + (this.field1859[this.field1852 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.i(B)I")
    public int method2150() {
        this.field1852 += 3;
        return (this.field1859[this.field1852 - 1] & 0xFF) + ((this.field1859[this.field1852 - 3] & 0xFF) << 16) + ((this.field1859[this.field1852 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.c(I)I")
    public int method2153() {
        this.field1852 += 4;
        return (this.field1859[this.field1852 - 1] & 0xFF) + ((this.field1859[this.field1852 - 2] & 0xFF) << 8) + ((this.field1859[this.field1852 - 3] & 0xFF) << 16) + ((this.field1859[this.field1852 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.r(B)J")
    public long method2195() {
        long var1 = (long) this.method2153() & 0xFFFFFFFFL;
        long var3 = (long) this.method2153() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.an(S)Ljava/lang/String;")
    public String method2155() {
        if (this.field1859[this.field1852] == 0) {
            this.field1852++;
            return null;
        } else {
            return this.method2156();
        }
    }

    @ObfuscatedName("dx.ad(I)Ljava/lang/String;")
    public String method2156() {
        int var1 = this.field1852;
        while (this.field1859[++this.field1852 - 1] != 0) {
        }
        int var2 = this.field1852 - var1 - 1;
        return var2 == 0 ? "" : Statics.method166(this.field1859, var1, var2);
    }

    @ObfuscatedName("dx.ai(I)Ljava/lang/String;")
    public String method2157() {
        byte var1 = this.field1859[++this.field1852 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1852;
        while (this.field1859[++this.field1852 - 1] != 0) {
        }
        int var3 = this.field1852 - var2 - 1;
        return var3 == 0 ? "" : Statics.method166(this.field1859, var2, var3);
    }

    @ObfuscatedName("dx.ae(I)Ljava/lang/String;")
    public String method2158() {
        byte var1 = this.field1859[++this.field1852 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2152();
        if (this.field1852 + var2 > this.field1859.length) {
            throw new IllegalStateException("");
        }
        String var3 = class199.method2070(this.field1859, this.field1852, var2);
        this.field1852 += var2;
        return var3;
    }

    @ObfuscatedName("dx.aq([BIIB)V")
    public void method2159(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1859[++this.field1852 - 1];
        }
    }

    @ObfuscatedName("dx.av(I)I")
    public int method2327() {
        int var1 = this.field1859[this.field1852] & 0xFF;
        return var1 < 128 ? this.method2231() - 64 : this.method2307() - 49152;
    }

    @ObfuscatedName("dx.am(I)I")
    public int method2279() {
        int var1 = this.field1859[this.field1852] & 0xFF;
        return var1 < 128 ? this.method2231() : this.method2307() - 32768;
    }

    @ObfuscatedName("dx.ac(B)I")
    public int method2258() {
        return this.field1859[this.field1852] < 0 ? this.method2153() & Integer.MAX_VALUE : this.method2307();
    }

    @ObfuscatedName("dx.ak(I)I")
    public int method2152() {
        byte var1 = this.field1859[++this.field1852 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1859[++this.field1852 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.aa([IB)V")
    public void method2164(int[] arg0) {
        int var2 = this.field1852 / 8;
        this.field1852 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2153();
            int var5 = this.method2153();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1852 -= 8;
            this.method2136(var4);
            this.method2136(var5);
        }
    }

    @ObfuscatedName("dx.al([II)V")
    public void method2165(int[] arg0) {
        int var2 = this.field1852 / 8;
        this.field1852 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2153();
            int var5 = this.method2153();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1852 -= 8;
            this.method2136(var4);
            this.method2136(var5);
        }
    }

    @ObfuscatedName("dx.ao([IIII)V")
    public void method2166(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1852;
        this.field1852 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2153();
            int var8 = this.method2153();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1852 -= 8;
            this.method2136(var7);
            this.method2136(var8);
        }
        this.field1852 = var4;
    }

    @ObfuscatedName("dx.af([IIII)V")
    public void method2212(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1852;
        this.field1852 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2153();
            int var8 = this.method2153();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1852 -= 8;
            this.method2136(var7);
            this.method2136(var8);
        }
        this.field1852 = var4;
    }

    @ObfuscatedName("dx.as(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2272(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1852;
        this.field1852 = 0;
        byte[] var4 = new byte[var3];
        this.method2159(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1852 = 0;
        this.method2134(var7.length);
        this.method2142(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ab(II)I")
    public int method2169(int arg0) {
        int var2 = method588(this.field1859, arg0, this.field1852);
        this.method2136(var2);
        return var2;
    }

    @ObfuscatedName("dx.ay(I)Z")
    public boolean method2170() {
        this.field1852 -= 4;
        int var1 = method588(this.field1859, 0, this.field1852);
        int var2 = this.method2153();
        return var1 == var2;
    }

    @ObfuscatedName("dx.ax(IB)V")
    public void method2171(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.au(IB)V")
    public void method2163(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.ap(II)V")
    public void method2173(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.aw(B)I")
    public int method2174() {
        return this.field1859[++this.field1852 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.ar(I)I")
    public int method2175() {
        return -this.field1859[++this.field1852 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.at(B)I")
    public int method2140() {
        return 128 - this.field1859[++this.field1852 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ah(B)B")
    public byte method2243() {
        return (byte) (-this.field1859[++this.field1852 - 1]);
    }

    @ObfuscatedName("dx.ag(I)B")
    public byte method2178() {
        return (byte) (128 - this.field1859[++this.field1852 - 1]);
    }

    @ObfuscatedName("dx.aj(II)V")
    public void method2179(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) arg0;
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.az(II)V")
    public void method2180(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.bu(IS)V")
    public void method2206(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 + 128);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bi(I)I")
    public int method2230() {
        this.field1852 += 2;
        return ((this.field1859[this.field1852 - 1] & 0xFF) << 8) + (this.field1859[this.field1852 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bb(I)I")
    public int method2289() {
        this.field1852 += 2;
        return ((this.field1859[this.field1852 - 2] & 0xFF) << 8) + (this.field1859[this.field1852 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bn(I)I")
    public int method2184() {
        this.field1852 += 2;
        return ((this.field1859[this.field1852 - 1] & 0xFF) << 8) + (this.field1859[this.field1852 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bz(B)I")
    public int method2185() {
        this.field1852 += 2;
        int var1 = ((this.field1859[this.field1852 - 1] & 0xFF) << 8) + (this.field1859[this.field1852 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bx(I)I")
    public int method2131() {
        this.field1852 += 2;
        int var1 = ((this.field1859[this.field1852 - 2] & 0xFF) << 8) + (this.field1859[this.field1852 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bs(B)I")
    public int method2255() {
        this.field1852 += 3;
        return (this.field1859[this.field1852 - 1] & 0xFF) + ((this.field1859[this.field1852 - 2] & 0xFF) << 16) + ((this.field1859[this.field1852 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.bt(IB)V")
    public void method2188(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) arg0;
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 16);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.by(II)V")
    public void method2189(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
        this.field1859[++this.field1852 - 1] = (byte) arg0;
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 24);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.ba(II)V")
    public void method2190(int arg0) {
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 16);
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 24);
        this.field1859[++this.field1852 - 1] = (byte) arg0;
        this.field1859[++this.field1852 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bv(I)I")
    public int method2172() {
        this.field1852 += 4;
        return (this.field1859[this.field1852 - 4] & 0xFF) + ((this.field1859[this.field1852 - 3] & 0xFF) << 8) + ((this.field1859[this.field1852 - 2] & 0xFF) << 16) + ((this.field1859[this.field1852 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.bc(I)I")
    public int method2192() {
        this.field1852 += 4;
        return (this.field1859[this.field1852 - 3] & 0xFF) + ((this.field1859[this.field1852 - 4] & 0xFF) << 8) + ((this.field1859[this.field1852 - 2] & 0xFF) << 24) + ((this.field1859[this.field1852 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bq(I)I")
    public int method2193() {
        this.field1852 += 4;
        return (this.field1859[this.field1852 - 2] & 0xFF) + ((this.field1859[this.field1852 - 1] & 0xFF) << 8) + ((this.field1859[this.field1852 - 4] & 0xFF) << 16) + ((this.field1859[this.field1852 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.bw([BIII)V")
    public void method2194(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1859[++this.field1852 - 1];
        }
    }
}
