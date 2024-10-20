package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class108 extends class189 {

    @ObfuscatedName("dx.c")
    public byte[] field1830;

    @ObfuscatedName("dx.j")
    public int field1826;

    @ObfuscatedName("dx.y")
    public static int[] field1827 = new int[256];

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
            field1827[var0] = var1;
        }
    }

    @ObfuscatedName("at.c([BIIB)I")
    public static int method532(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1827[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class108(int arg0) {
        this.field1830 = Statics.method2373(arg0);
        this.field1826 = 0;
    }

    public class108(byte[] arg0) {
        this.field1830 = arg0;
        this.field1826 = 0;
    }

    @ObfuscatedName("dx.j(II)V")
    public void method2120(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.y(II)V")
    public void method2121(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1830[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.r(II)V")
    public void method2152(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1830[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.f(II)V")
    public void method2123(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 24);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1830[++this.field1826 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.l(J)V")
    public void method2176(long arg0) {
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1830[++this.field1826 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1830[++this.field1826 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("g.b(Ljava/lang/String;B)I")
    public static int method97(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.k(Ljava/lang/String;I)V")
    public void method2125(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1826 += class213.method522(arg0, 0, arg0.length(), this.field1830, this.field1826);
        this.field1830[++this.field1826 - 1] = 0;
    }

    @ObfuscatedName("dx.g(Ljava/lang/String;I)V")
    public void method2126(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1830[++this.field1826 - 1] = 0;
        this.field1826 += class213.method522(arg0, 0, arg0.length(), this.field1830, this.field1826);
        this.field1830[++this.field1826 - 1] = 0;
    }

    @ObfuscatedName("dx.v(Ljava/lang/CharSequence;I)V")
    public void method2127(CharSequence arg0) {
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
        this.field1830[++this.field1826 - 1] = 0;
        this.method2133(var3);
        int var8 = this.field1826;
        byte[] var9 = this.field1830;
        int var10 = this.field1826;
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
        this.field1826 = var15 + var8;
    }

    @ObfuscatedName("dx.i([BIIB)V")
    public void method2128(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1830[++this.field1826 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.x(II)V")
    public void method2284(int arg0) {
        this.field1830[this.field1826 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1830[this.field1826 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1830[this.field1826 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1830[this.field1826 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.h(II)V")
    public void method2129(int arg0) {
        this.field1830[this.field1826 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1830[this.field1826 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.w(II)V")
    public void method2255(int arg0) {
        this.field1830[this.field1826 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.s(IB)V")
    public void method2132(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2120(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2121(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.p(II)V")
    public void method2133(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2120(arg0 >>> 28 | 0x80);
                    }
                    this.method2120(arg0 >>> 21 | 0x80);
                }
                this.method2120(arg0 >>> 14 | 0x80);
            }
            this.method2120(arg0 >>> 7 | 0x80);
        }
        this.method2120(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.z(B)I")
    public int method2134() {
        return this.field1830[++this.field1826 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.n(I)B")
    public byte method2229() {
        return this.field1830[++this.field1826 - 1];
    }

    @ObfuscatedName("dx.u(I)I")
    public int method2136() {
        this.field1826 += 2;
        return ((this.field1830[this.field1826 - 2] & 0xFF) << 8) + (this.field1830[this.field1826 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.a(B)I")
    public int method2137() {
        this.field1826 += 2;
        int var1 = ((this.field1830[this.field1826 - 2] & 0xFF) << 8) + (this.field1830[this.field1826 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.d(B)I")
    public int method2138() {
        this.field1826 += 3;
        return (this.field1830[this.field1826 - 1] & 0xFF) + ((this.field1830[this.field1826 - 2] & 0xFF) << 8) + ((this.field1830[this.field1826 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.m(I)I")
    public int method2144() {
        this.field1826 += 4;
        return (this.field1830[this.field1826 - 1] & 0xFF) + ((this.field1830[this.field1826 - 2] & 0xFF) << 8) + ((this.field1830[this.field1826 - 3] & 0xFF) << 16) + ((this.field1830[this.field1826 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.q(B)J")
    public long method2140() {
        long var1 = (long) this.method2144() & 0xFFFFFFFFL;
        long var3 = (long) this.method2144() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.e(B)Ljava/lang/String;")
    public String method2141() {
        if (this.field1830[this.field1826] == 0) {
            this.field1826++;
            return null;
        } else {
            return this.method2216();
        }
    }

    @ObfuscatedName("dx.t(I)Ljava/lang/String;")
    public String method2216() {
        int var1 = this.field1826;
        while (this.field1830[++this.field1826 - 1] != 0) {
        }
        int var2 = this.field1826 - var1 - 1;
        return var2 == 0 ? "" : class213.method125(this.field1830, var1, var2);
    }

    @ObfuscatedName("dx.o(B)Ljava/lang/String;")
    public String method2143() {
        byte var1 = this.field1830[++this.field1826 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1826;
        while (this.field1830[++this.field1826 - 1] != 0) {
        }
        int var3 = this.field1826 - var2 - 1;
        return var3 == 0 ? "" : class213.method125(this.field1830, var2, var3);
    }

    @ObfuscatedName("dx.at(S)Ljava/lang/String;")
    public String method2154() {
        byte var1 = this.field1830[++this.field1826 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2182();
        if (this.field1826 + var2 > this.field1830.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1830;
        int var4 = this.field1826;
        char[] var5 = new char[var2];
        int var6 = 0;
        int var7 = var4;
        int var8 = var2 + var4;
        while (var7 < var8) {
            int var9 = var3[var7++] & 0xFF;
            int var10;
            if (var9 < 128) {
                if (var9 == 0) {
                    var10 = 65533;
                } else {
                    var10 = var9;
                }
            } else if (var9 < 192) {
                var10 = 65533;
            } else if (var9 < 224) {
                if (var7 < var8 && (var3[var7] & 0xC0) == 128) {
                    var10 = (var9 & 0x1F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 < 240) {
                if (var7 + 1 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128) {
                    var10 = (var9 & 0xF) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                    if (var10 < 2048) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var9 >= 248) {
                var10 = 65533;
            } else if (var7 + 2 < var8 && (var3[var7] & 0xC0) == 128 && (var3[var7 + 1] & 0xC0) == 128 && (var3[var7 + 2] & 0xC0) == 128) {
                int var11 = (var9 & 0x7) << 18 | (var3[var7++] & 0x3F) << 12 | (var3[var7++] & 0x3F) << 6 | var3[var7++] & 0x3F;
                if (var11 >= 65536 && var11 <= 1114111) {
                    var10 = 65533;
                } else {
                    var10 = 65533;
                }
            } else {
                var10 = 65533;
            }
            var5[var6++] = (char) var10;
        }
        String var12 = new String(var5, 0, var6);
        this.field1826 += var2;
        return var12;
    }

    @ObfuscatedName("dx.ag([BIII)V")
    public void method2145(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1830[++this.field1826 - 1];
        }
    }

    @ObfuscatedName("dx.ae(I)I")
    public int method2146() {
        int var1 = this.field1830[this.field1826] & 0xFF;
        return var1 < 128 ? this.method2134() - 64 : this.method2136() - 49152;
    }

    @ObfuscatedName("dx.ak(I)I")
    public int method2227() {
        int var1 = this.field1830[this.field1826] & 0xFF;
        return var1 < 128 ? this.method2134() : this.method2136() - 32768;
    }

    @ObfuscatedName("dx.ap(I)I")
    public int method2323() {
        return this.field1830[this.field1826] < 0 ? this.method2144() & Integer.MAX_VALUE : this.method2136();
    }

    @ObfuscatedName("dx.ao(I)I")
    public int method2182() {
        byte var1 = this.field1830[++this.field1826 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1830[++this.field1826 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.ac([IIII)V")
    public void method2327(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1826;
        this.field1826 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2144();
            int var8 = this.method2144();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1826 -= 8;
            this.method2123(var7);
            this.method2123(var8);
        }
        this.field1826 = var4;
    }

    @ObfuscatedName("dx.as([IIII)V")
    public void method2151(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1826;
        this.field1826 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2144();
            int var8 = this.method2144();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1826 -= 8;
            this.method2123(var7);
            this.method2123(var8);
        }
        this.field1826 = var4;
    }

    @ObfuscatedName("dx.ai(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2301(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1826;
        this.field1826 = 0;
        byte[] var4 = new byte[var3];
        this.method2145(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1826 = 0;
        this.method2121(var7.length);
        this.method2128(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ab(II)I")
    public int method2153(int arg0) {
        int var2 = method532(this.field1830, arg0, this.field1826);
        this.method2123(var2);
        return var2;
    }

    @ObfuscatedName("dx.an(I)Z")
    public boolean method2186() {
        this.field1826 -= 4;
        int var1 = method532(this.field1830, 0, this.field1826);
        int var2 = this.method2144();
        return var1 == var2;
    }

    @ObfuscatedName("dx.ah(II)V")
    public void method2306(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ad(IB)V")
    public void method2156(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.af(II)V")
    public void method2157(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.aj(B)I")
    public int method2158() {
        return this.field1830[++this.field1826 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.am(S)I")
    public int method2159() {
        return -this.field1830[++this.field1826 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.ay(I)I")
    public int method2160() {
        return 128 - this.field1830[++this.field1826 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.au(S)B")
    public byte method2221() {
        return (byte) (this.field1830[++this.field1826 - 1] - 128);
    }

    @ObfuscatedName("dx.aa(I)B")
    public byte method2162() {
        return (byte) (-this.field1830[++this.field1826 - 1]);
    }

    @ObfuscatedName("dx.aq(II)V")
    public void method2172(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) arg0;
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.av(II)V")
    public void method2311(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.aw(IB)V")
    public void method2165(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 + 128);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.az(B)I")
    public int method2166() {
        this.field1826 += 2;
        return ((this.field1830[this.field1826 - 1] & 0xFF) << 8) + (this.field1830[this.field1826 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.al(I)I")
    public int method2280() {
        this.field1826 += 2;
        return ((this.field1830[this.field1826 - 2] & 0xFF) << 8) + (this.field1830[this.field1826 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.ar(B)I")
    public int method2168() {
        this.field1826 += 2;
        return ((this.field1830[this.field1826 - 1] & 0xFF) << 8) + (this.field1830[this.field1826 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.ax(I)I")
    public int method2169() {
        this.field1826 += 2;
        int var1 = ((this.field1830[this.field1826 - 1] & 0xFF) << 8) + (this.field1830[this.field1826 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.be(I)I")
    public int method2288() {
        this.field1826 += 2;
        int var1 = ((this.field1830[this.field1826 - 1] & 0xFF) << 8) + (this.field1830[this.field1826 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.bh(I)I")
    public int method2171() {
        this.field1826 += 3;
        return (this.field1830[this.field1826 - 3] & 0xFF) + ((this.field1830[this.field1826 - 1] & 0xFF) << 16) + ((this.field1830[this.field1826 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.bn(IB)V")
    public void method2287(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) arg0;
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.by(II)V")
    public void method2194(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
        this.field1830[++this.field1826 - 1] = (byte) arg0;
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 24);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.bg(II)V")
    public void method2174(int arg0) {
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 16);
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 24);
        this.field1830[++this.field1826 - 1] = (byte) arg0;
        this.field1830[++this.field1826 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bb(I)I")
    public int method2193() {
        this.field1826 += 4;
        return (this.field1830[this.field1826 - 4] & 0xFF) + ((this.field1830[this.field1826 - 3] & 0xFF) << 8) + ((this.field1830[this.field1826 - 2] & 0xFF) << 16) + ((this.field1830[this.field1826 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.bm(B)I")
    public int method2331() {
        this.field1826 += 4;
        return (this.field1830[this.field1826 - 3] & 0xFF) + ((this.field1830[this.field1826 - 4] & 0xFF) << 8) + ((this.field1830[this.field1826 - 2] & 0xFF) << 24) + ((this.field1830[this.field1826 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bq(B)I")
    public int method2238() {
        this.field1826 += 4;
        return (this.field1830[this.field1826 - 2] & 0xFF) + ((this.field1830[this.field1826 - 1] & 0xFF) << 8) + ((this.field1830[this.field1826 - 4] & 0xFF) << 16) + ((this.field1830[this.field1826 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.br([BIII)V")
    public void method2178(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1830[++this.field1826 - 1];
        }
    }

    @ObfuscatedName("dx.bw([BIII)V")
    public void method2179(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1830[++this.field1826 - 1] - 128);
        }
    }
}
