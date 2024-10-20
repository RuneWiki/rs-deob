package deob;

import java.math.BigInteger;

@ObfuscatedName("do")
public class class111 extends class199 {

    @ObfuscatedName("do.n")
    public byte[] field1886;

    @ObfuscatedName("do.w")
    public int field1888;

    @ObfuscatedName("do.i")
    public static int[] field1884 = new int[256];

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
            field1884[var0] = var1;
        }
    }

    @ObfuscatedName("gi.n([BII)I")
    public static int method3500(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1884[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class111(int arg0) {
        this.field1886 = class113.method2397(arg0);
        this.field1888 = 0;
    }

    public class111(byte[] arg0) {
        this.field1886 = arg0;
        this.field1888 = 0;
    }

    @ObfuscatedName("do.w(II)V")
    public void method2140(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.i(II)V")
    public void method2322(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
        this.field1886[++this.field1888 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.e(II)V")
    public void method2273(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 16);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
        this.field1886[++this.field1888 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.h(IB)V")
    public void method2143(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 24);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 16);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
        this.field1886[++this.field1888 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.q(J)V")
    public void method2144(long arg0) {
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1886[++this.field1888 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("do.l(J)V")
    public void method2145(long arg0) {
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1886[++this.field1888 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1886[++this.field1888 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("do.c(Ljava/lang/String;B)V")
    public void method2146(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1888 += class156.method1453(arg0, 0, arg0.length(), this.field1886, this.field1888);
        this.field1886[++this.field1888 - 1] = 0;
    }

    @ObfuscatedName("do.f(Ljava/lang/String;B)V")
    public void method2147(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1886[++this.field1888 - 1] = 0;
        this.field1888 += class156.method1453(arg0, 0, arg0.length(), this.field1886, this.field1888);
        this.field1886[++this.field1888 - 1] = 0;
    }

    @ObfuscatedName("do.s(Ljava/lang/CharSequence;I)V")
    public void method2148(CharSequence arg0) {
        int var2 = class200.method2096(arg0);
        this.field1886[++this.field1888 - 1] = 0;
        this.method2154(var2);
        int var3 = this.field1888;
        byte[] var4 = this.field1886;
        int var5 = this.field1888;
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
        this.field1888 = var10 + var3;
    }

    @ObfuscatedName("do.m([BIIB)V")
    public void method2318(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1886[++this.field1888 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("do.y(II)V")
    public void method2150(int arg0) {
        this.field1886[this.field1888 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1886[this.field1888 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1886[this.field1888 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1886[this.field1888 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.b(II)V")
    public void method2151(int arg0) {
        this.field1886[this.field1888 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1886[this.field1888 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.v(IB)V")
    public void method2205(int arg0) {
        this.field1886[this.field1888 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("do.z(II)V")
    public void method2153(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2140(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2322(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("do.u(II)V")
    public void method2154(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2140(arg0 >>> 28 | 0x80);
                    }
                    this.method2140(arg0 >>> 21 | 0x80);
                }
                this.method2140(arg0 >>> 14 | 0x80);
            }
            this.method2140(arg0 >>> 7 | 0x80);
        }
        this.method2140(arg0 & 0x7F);
    }

    @ObfuscatedName("do.g(B)I")
    public int method2155() {
        return this.field1886[++this.field1888 - 1] & 0xFF;
    }

    @ObfuscatedName("do.k(B)B")
    public byte method2173() {
        return this.field1886[++this.field1888 - 1];
    }

    @ObfuscatedName("do.o(I)I")
    public int method2157() {
        this.field1888 += 2;
        return ((this.field1886[this.field1888 - 2] & 0xFF) << 8) + (this.field1886[this.field1888 - 1] & 0xFF);
    }

    @ObfuscatedName("do.a(B)I")
    public int method2166() {
        this.field1888 += 2;
        int var1 = ((this.field1886[this.field1888 - 2] & 0xFF) << 8) + (this.field1886[this.field1888 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.p(I)I")
    public int method2315() {
        this.field1888 += 3;
        return (this.field1886[this.field1888 - 1] & 0xFF) + ((this.field1886[this.field1888 - 2] & 0xFF) << 8) + ((this.field1886[this.field1888 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("do.t(B)I")
    public int method2160() {
        this.field1888 += 4;
        return (this.field1886[this.field1888 - 1] & 0xFF) + ((this.field1886[this.field1888 - 2] & 0xFF) << 8) + ((this.field1886[this.field1888 - 4] & 0xFF) << 24) + ((this.field1886[this.field1888 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("do.x(I)J")
    public long method2161() {
        long var1 = (long) this.method2160() & 0xFFFFFFFFL;
        long var3 = (long) this.method2160() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("do.d(I)Ljava/lang/String;")
    public String method2291() {
        if (this.field1886[this.field1888] == 0) {
            this.field1888++;
            return null;
        } else {
            return this.method2163();
        }
    }

    @ObfuscatedName("do.j(I)Ljava/lang/String;")
    public String method2163() {
        int var1 = this.field1888;
        while (this.field1886[++this.field1888 - 1] != 0) {
        }
        int var2 = this.field1888 - var1 - 1;
        return var2 == 0 ? "" : class156.method505(this.field1886, var1, var2);
    }

    @ObfuscatedName("do.r(I)Ljava/lang/String;")
    public String method2164() {
        byte var1 = this.field1886[++this.field1888 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1888;
        while (this.field1886[++this.field1888 - 1] != 0) {
        }
        int var3 = this.field1888 - var2 - 1;
        return var3 == 0 ? "" : class156.method505(this.field1886, var2, var3);
    }

    @ObfuscatedName("do.at(B)Ljava/lang/String;")
    public String method2254() {
        byte var1 = this.field1886[++this.field1888 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2170();
        if (this.field1888 + var2 > this.field1886.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1886;
        int var4 = this.field1888;
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
        this.field1888 += var2;
        return var12;
    }

    @ObfuscatedName("do.av([BIIS)V")
    public void method2305(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1886[++this.field1888 - 1];
        }
    }

    @ObfuscatedName("do.ar(I)I")
    public int method2167() {
        int var1 = this.field1886[this.field1888] & 0xFF;
        return var1 < 128 ? this.method2155() - 64 : this.method2157() - 49152;
    }

    @ObfuscatedName("do.aq(B)I")
    public int method2168() {
        int var1 = this.field1886[this.field1888] & 0xFF;
        return var1 < 128 ? this.method2155() : this.method2157() - 32768;
    }

    @ObfuscatedName("do.as(B)I")
    public int method2169() {
        return this.field1886[this.field1888] < 0 ? this.method2160() & Integer.MAX_VALUE : this.method2157();
    }

    @ObfuscatedName("do.ad(I)I")
    public int method2170() {
        byte var1 = this.field1886[++this.field1888 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1886[++this.field1888 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("do.ap([II)V")
    public void method2171(int[] arg0) {
        int var2 = this.field1888 / 8;
        this.field1888 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2160();
            int var5 = this.method2160();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1888 -= 8;
            this.method2143(var4);
            this.method2143(var5);
        }
    }

    @ObfuscatedName("do.an([IB)V")
    public void method2172(int[] arg0) {
        int var2 = this.field1888 / 8;
        this.field1888 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2160();
            int var5 = this.method2160();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1888 -= 8;
            this.method2143(var4);
            this.method2143(var5);
        }
    }

    @ObfuscatedName("do.au([IIII)V")
    public void method2301(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1888;
        this.field1888 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2160();
            int var8 = this.method2160();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1888 -= 8;
            this.method2143(var7);
            this.method2143(var8);
        }
        this.field1888 = var4;
    }

    @ObfuscatedName("do.aw([IIII)V")
    public void method2174(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1888;
        this.field1888 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2160();
            int var8 = this.method2160();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1888 -= 8;
            this.method2143(var7);
            this.method2143(var8);
        }
        this.field1888 = var4;
    }

    @ObfuscatedName("do.ag(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2175(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1888;
        this.field1888 = 0;
        byte[] var4 = new byte[var3];
        this.method2305(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1888 = 0;
        this.method2322(var7.length);
        this.method2318(var7, 0, var7.length);
    }

    @ObfuscatedName("do.ah(IB)I")
    public int method2262(int arg0) {
        byte[] var2 = this.field1886;
        int var3 = this.field1888;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1884[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2143(var6);
        return var6;
    }

    @ObfuscatedName("do.ao(I)Z")
    public boolean method2177() {
        this.field1888 -= 4;
        byte[] var1 = this.field1886;
        int var2 = this.field1888;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1884[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2160();
        return var5 == var8;
    }

    @ObfuscatedName("do.ac(II)V")
    public void method2178(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.af(II)V")
    public void method2299(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("do.ab(II)V")
    public void method2180(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("do.ai(S)I")
    public int method2268() {
        return this.field1886[++this.field1888 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("do.ay(I)I")
    public int method2182() {
        return -this.field1886[++this.field1888 - 1] & 0xFF;
    }

    @ObfuscatedName("do.ak(I)I")
    public int method2183() {
        return 128 - this.field1886[++this.field1888 - 1] & 0xFF;
    }

    @ObfuscatedName("do.aj(B)B")
    public byte method2255() {
        return (byte) (this.field1886[++this.field1888 - 1] - 128);
    }

    @ObfuscatedName("do.az(I)B")
    public byte method2184() {
        return (byte) (-this.field1886[++this.field1888 - 1]);
    }

    @ObfuscatedName("do.am(IB)V")
    public void method2141(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) arg0;
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.ax(II)V")
    public void method2186(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("do.al(IB)V")
    public void method2187(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 + 128);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.aa(S)I")
    public int method2348() {
        this.field1888 += 2;
        return ((this.field1886[this.field1888 - 1] & 0xFF) << 8) + (this.field1886[this.field1888 - 2] & 0xFF);
    }

    @ObfuscatedName("do.ae(I)I")
    public int method2189() {
        this.field1888 += 2;
        return ((this.field1886[this.field1888 - 2] & 0xFF) << 8) + (this.field1886[this.field1888 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("do.bj(B)I")
    public int method2156() {
        this.field1888 += 2;
        return ((this.field1886[this.field1888 - 1] & 0xFF) << 8) + (this.field1886[this.field1888 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("do.bg(I)I")
    public int method2191() {
        this.field1888 += 2;
        int var1 = ((this.field1886[this.field1888 - 1] & 0xFF) << 8) + (this.field1886[this.field1888 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bw(I)I")
    public int method2192() {
        this.field1888 += 2;
        int var1 = ((this.field1886[this.field1888 - 2] & 0xFF) << 8) + (this.field1886[this.field1888 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("do.bi(IB)V")
    public void method2193(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 16);
        this.field1886[++this.field1888 - 1] = (byte) arg0;
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bh(II)V")
    public void method2194(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) arg0;
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 16);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("do.bb(II)V")
    public void method2234(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
        this.field1886[++this.field1888 - 1] = (byte) arg0;
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 24);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("do.bt(II)V")
    public void method2331(int arg0) {
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 16);
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 24);
        this.field1886[++this.field1888 - 1] = (byte) arg0;
        this.field1886[++this.field1888 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("do.bu(I)I")
    public int method2197() {
        this.field1888 += 4;
        return (this.field1886[this.field1888 - 4] & 0xFF) + ((this.field1886[this.field1888 - 3] & 0xFF) << 8) + ((this.field1886[this.field1888 - 1] & 0xFF) << 24) + ((this.field1886[this.field1888 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("do.bc(I)I")
    public int method2198() {
        this.field1888 += 4;
        return (this.field1886[this.field1888 - 3] & 0xFF) + ((this.field1886[this.field1888 - 4] & 0xFF) << 8) + ((this.field1886[this.field1888 - 2] & 0xFF) << 24) + ((this.field1886[this.field1888 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("do.ba(I)I")
    public int method2199() {
        this.field1888 += 4;
        return (this.field1886[this.field1888 - 2] & 0xFF) + ((this.field1886[this.field1888 - 1] & 0xFF) << 8) + ((this.field1886[this.field1888 - 4] & 0xFF) << 16) + ((this.field1886[this.field1888 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("do.bd([BIIB)V")
    public void method2353(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1886[++this.field1888 - 1] - 128);
        }
    }
}
