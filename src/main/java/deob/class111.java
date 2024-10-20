package deob;

import java.math.BigInteger;

@ObfuscatedName("dw")
public class class111 extends class199 {

    @ObfuscatedName("dw.y")
    public byte[] field1897;

    @ObfuscatedName("dw.k")
    public int field1902;

    @ObfuscatedName("dw.g")
    public static int[] field1898 = new int[256];

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
            field1898[var0] = var1;
        }
    }

    @ObfuscatedName("ds.y([BIII)I")
    public static int method2096(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1898[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("co.k([BIB)I")
    public static int method1988(byte[] arg0, int arg1) {
        return method2096(arg0, 0, arg1);
    }

    public class111(int arg0) {
        this.field1897 = class113.method2409(arg0);
        this.field1902 = 0;
    }

    public class111(byte[] arg0) {
        this.field1897 = arg0;
        this.field1902 = 0;
    }

    @ObfuscatedName("dw.g(II)V")
    public void method2145(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.n(II)V")
    public void method2319(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1902 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.t(IB)V")
    public void method2147(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1902 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.e(II)V")
    public void method2148(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 24);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1902 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.q(J)V")
    public void method2149(long arg0) {
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1897[++this.field1902 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dw.z(J)V")
    public void method2150(long arg0) {
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1897[++this.field1902 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1897[++this.field1902 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("as.v(Ljava/lang/String;S)I")
    public static int method699(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dw.b(Ljava/lang/String;I)V")
    public void method2298(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1902 += class156.method2782(arg0, 0, arg0.length(), this.field1897, this.field1902);
        this.field1897[++this.field1902 - 1] = 0;
    }

    @ObfuscatedName("dw.f(Ljava/lang/String;I)V")
    public void method2290(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1897[++this.field1902 - 1] = 0;
        this.field1902 += class156.method2782(arg0, 0, arg0.length(), this.field1897, this.field1902);
        this.field1897[++this.field1902 - 1] = 0;
    }

    @ObfuscatedName("dw.i(Ljava/lang/CharSequence;I)V")
    public void method2153(CharSequence arg0) {
        int var2 = class200.method930(arg0);
        this.field1897[++this.field1902 - 1] = 0;
        this.method2356(var2);
        int var3 = this.field1902;
        byte[] var4 = this.field1897;
        int var5 = this.field1902;
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
        this.field1902 = var10 + var3;
    }

    @ObfuscatedName("dw.w([BIII)V")
    public void method2154(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1897[++this.field1902 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dw.l(IB)V")
    public void method2155(int arg0) {
        this.field1897[this.field1902 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1897[this.field1902 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1897[this.field1902 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1897[this.field1902 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.j(II)V")
    public void method2156(int arg0) {
        this.field1897[this.field1902 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1897[this.field1902 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.s(II)V")
    public void method2157(int arg0) {
        this.field1897[this.field1902 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dw.r(II)V")
    public void method2158(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2145(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2319(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dw.h(IB)V")
    public void method2356(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2145(arg0 >>> 28 | 0x80);
                    }
                    this.method2145(arg0 >>> 21 | 0x80);
                }
                this.method2145(arg0 >>> 14 | 0x80);
            }
            this.method2145(arg0 >>> 7 | 0x80);
        }
        this.method2145(arg0 & 0x7F);
    }

    @ObfuscatedName("dw.x(I)I")
    public int method2205() {
        return this.field1897[++this.field1902 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.m(I)B")
    public byte method2199() {
        return this.field1897[++this.field1902 - 1];
    }

    @ObfuscatedName("dw.a(I)I")
    public int method2339() {
        this.field1902 += 2;
        return ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + (this.field1897[this.field1902 - 1] & 0xFF);
    }

    @ObfuscatedName("dw.p(I)I")
    public int method2163() {
        this.field1902 += 2;
        int var1 = ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + (this.field1897[this.field1902 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.c(I)I")
    public int method2164() {
        this.field1902 += 3;
        return (this.field1897[this.field1902 - 1] & 0xFF) + ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + ((this.field1897[this.field1902 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dw.u(I)I")
    public int method2165() {
        this.field1902 += 4;
        return (this.field1897[this.field1902 - 1] & 0xFF) + ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + ((this.field1897[this.field1902 - 3] & 0xFF) << 16) + ((this.field1897[this.field1902 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.d(I)J")
    public long method2166() {
        long var1 = (long) this.method2165() & 0xFFFFFFFFL;
        long var3 = (long) this.method2165() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dw.o(B)Ljava/lang/String;")
    public String method2243() {
        if (this.field1897[this.field1902] == 0) {
            this.field1902++;
            return null;
        } else {
            return this.method2170();
        }
    }

    @ObfuscatedName("dw.aj(I)Ljava/lang/String;")
    public String method2170() {
        int var1 = this.field1902;
        while (this.field1897[++this.field1902 - 1] != 0) {
        }
        int var2 = this.field1902 - var1 - 1;
        return var2 == 0 ? "" : Statics.method29(this.field1897, var1, var2);
    }

    @ObfuscatedName("dw.au(B)Ljava/lang/String;")
    public String method2169() {
        byte var1 = this.field1897[++this.field1902 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1902;
        while (this.field1897[++this.field1902 - 1] != 0) {
        }
        int var3 = this.field1902 - var2 - 1;
        return var3 == 0 ? "" : Statics.method29(this.field1897, var2, var3);
    }

    @ObfuscatedName("dw.ah(I)Ljava/lang/String;")
    public String method2144() {
        byte var1 = this.field1897[++this.field1902 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2151();
        if (this.field1902 + var2 > this.field1897.length) {
            throw new IllegalStateException("");
        }
        String var3 = class200.method1896(this.field1897, this.field1902, var2);
        this.field1902 += var2;
        return var3;
    }

    @ObfuscatedName("dw.ab([BIII)V")
    public void method2171(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1897[++this.field1902 - 1];
        }
    }

    @ObfuscatedName("dw.am(I)I")
    public int method2172() {
        int var1 = this.field1897[this.field1902] & 0xFF;
        return var1 < 128 ? this.method2205() - 64 : this.method2339() - 49152;
    }

    @ObfuscatedName("dw.ar(I)I")
    public int method2173() {
        int var1 = this.field1897[this.field1902] & 0xFF;
        return var1 < 128 ? this.method2205() : this.method2339() - 32768;
    }

    @ObfuscatedName("dw.an(I)I")
    public int method2174() {
        return this.field1897[this.field1902] < 0 ? this.method2165() & Integer.MAX_VALUE : this.method2339();
    }

    @ObfuscatedName("dw.az(B)I")
    public int method2151() {
        byte var1 = this.field1897[++this.field1902 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1897[++this.field1902 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dw.at([II)V")
    public void method2361(int[] arg0) {
        int var2 = this.field1902 / 8;
        this.field1902 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2165();
            int var5 = this.method2165();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1902 -= 8;
            this.method2148(var4);
            this.method2148(var5);
        }
    }

    @ObfuscatedName("dw.ag([IB)V")
    public void method2177(int[] arg0) {
        int var2 = this.field1902 / 8;
        this.field1902 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2165();
            int var5 = this.method2165();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1902 -= 8;
            this.method2148(var4);
            this.method2148(var5);
        }
    }

    @ObfuscatedName("dw.as([IIII)V")
    public void method2178(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1902;
        this.field1902 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2165();
            int var8 = this.method2165();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1902 -= 8;
            this.method2148(var7);
            this.method2148(var8);
        }
        this.field1902 = var4;
    }

    @ObfuscatedName("dw.ao([IIIB)V")
    public void method2179(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1902;
        this.field1902 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2165();
            int var8 = this.method2165();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1902 -= 8;
            this.method2148(var7);
            this.method2148(var8);
        }
        this.field1902 = var4;
    }

    @ObfuscatedName("dw.af(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2263(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1902;
        this.field1902 = 0;
        byte[] var4 = new byte[var3];
        this.method2171(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1902 = 0;
        this.method2319(var7.length);
        this.method2154(var7, 0, var7.length);
    }

    @ObfuscatedName("dw.ay(II)I")
    public int method2185(int arg0) {
        int var2 = method2096(this.field1897, arg0, this.field1902);
        this.method2148(var2);
        return var2;
    }

    @ObfuscatedName("dw.aq(I)Z")
    public boolean method2313() {
        this.field1902 -= 4;
        int var1 = method2096(this.field1897, 0, this.field1902);
        int var2 = this.method2165();
        return var1 == var2;
    }

    @ObfuscatedName("dw.aw(II)V")
    public void method2183(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dw.al(II)V")
    public void method2184(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dw.ap(IB)V")
    public void method2281(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dw.ac(B)I")
    public int method2186() {
        return this.field1897[++this.field1902 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dw.av(I)I")
    public int method2187() {
        return -this.field1897[++this.field1902 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.ai(I)I")
    public int method2352() {
        return 128 - this.field1897[++this.field1902 - 1] & 0xFF;
    }

    @ObfuscatedName("dw.ax(I)B")
    public byte method2189() {
        return (byte) (this.field1897[++this.field1902 - 1] - 128);
    }

    @ObfuscatedName("dw.ae(I)B")
    public byte method2365() {
        return (byte) (-this.field1897[++this.field1902 - 1]);
    }

    @ObfuscatedName("dw.aa(IB)V")
    public void method2320(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) arg0;
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.ak(II)V")
    public void method2191(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dw.ad(II)V")
    public void method2228(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 + 128);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.bt(I)I")
    public int method2193() {
        this.field1902 += 2;
        return ((this.field1897[this.field1902 - 1] & 0xFF) << 8) + (this.field1897[this.field1902 - 2] & 0xFF);
    }

    @ObfuscatedName("dw.bf(B)I")
    public int method2194() {
        this.field1902 += 2;
        return ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + (this.field1897[this.field1902 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dw.bn(I)I")
    public int method2195() {
        this.field1902 += 2;
        return ((this.field1897[this.field1902 - 1] & 0xFF) << 8) + (this.field1897[this.field1902 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dw.ba(I)I")
    public int method2321() {
        this.field1902 += 2;
        int var1 = ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + (this.field1897[this.field1902 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.bj(I)I")
    public int method2334() {
        this.field1902 += 2;
        int var1 = ((this.field1897[this.field1902 - 1] & 0xFF) << 8) + (this.field1897[this.field1902 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dw.bc(I)I")
    public int method2213() {
        this.field1902 += 3;
        return (this.field1897[this.field1902 - 3] & 0xFF) + ((this.field1897[this.field1902 - 2] & 0xFF) << 8) + ((this.field1897[this.field1902 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dw.bh(II)V")
    public void method2354(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) arg0;
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dw.bd(II)V")
    public void method2200(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
        this.field1897[++this.field1902 - 1] = (byte) arg0;
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 24);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dw.by(II)V")
    public void method2201(int arg0) {
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 16);
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 24);
        this.field1897[++this.field1902 - 1] = (byte) arg0;
        this.field1897[++this.field1902 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dw.bk(B)I")
    public int method2202() {
        this.field1902 += 4;
        return (this.field1897[this.field1902 - 4] & 0xFF) + ((this.field1897[this.field1902 - 3] & 0xFF) << 8) + ((this.field1897[this.field1902 - 2] & 0xFF) << 16) + ((this.field1897[this.field1902 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.bo(I)I")
    public int method2215() {
        this.field1902 += 4;
        return (this.field1897[this.field1902 - 3] & 0xFF) + ((this.field1897[this.field1902 - 4] & 0xFF) << 8) + ((this.field1897[this.field1902 - 1] & 0xFF) << 16) + ((this.field1897[this.field1902 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.bi(I)I")
    public int method2204() {
        this.field1902 += 4;
        return (this.field1897[this.field1902 - 2] & 0xFF) + ((this.field1897[this.field1902 - 1] & 0xFF) << 8) + ((this.field1897[this.field1902 - 4] & 0xFF) << 16) + ((this.field1897[this.field1902 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dw.be([BIII)V")
    public void method2294(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1897[++this.field1902 - 1];
        }
    }

    @ObfuscatedName("dw.bq([BIII)V")
    public void method2336(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1897[++this.field1902 - 1] - 128);
        }
    }
}
