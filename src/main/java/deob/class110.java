package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class110 extends class191 {

    @ObfuscatedName("dp.v")
    public byte[] field1853;

    @ObfuscatedName("dp.t")
    public int field1847;

    @ObfuscatedName("dp.f")
    public static int[] field1849 = new int[256];

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
            field1849[var0] = var1;
        }
    }

    @ObfuscatedName("eu.v([BIII)I")
    public static int method2754(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1849[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("bs.t([BIB)I")
    public static int method1417(byte[] arg0, int arg1) {
        return method2754(arg0, 0, arg1);
    }

    public class110(int arg0) {
        this.field1853 = class112.method2393(arg0);
        this.field1847 = 0;
    }

    public class110(byte[] arg0) {
        this.field1853 = arg0;
        this.field1847 = 0;
    }

    @ObfuscatedName("dp.f(II)V")
    public void method2263(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.j(II)V")
    public void method2148(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1853[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.l(II)V")
    public void method2149(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1853[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.g(II)V")
    public void method2260(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 24);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1853[++this.field1847 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.k(J)V")
    public void method2186(long arg0) {
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1853[++this.field1847 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1853[++this.field1847 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dp.p(Ljava/lang/String;I)V")
    public void method2152(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1847 += class215.method167(arg0, 0, arg0.length(), this.field1853, this.field1847);
        this.field1853[++this.field1847 - 1] = 0;
    }

    @ObfuscatedName("dp.y(Ljava/lang/String;I)V")
    public void method2153(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1853[++this.field1847 - 1] = 0;
        this.field1847 += class215.method167(arg0, 0, arg0.length(), this.field1853, this.field1847);
        this.field1853[++this.field1847 - 1] = 0;
    }

    @ObfuscatedName("dp.m(Ljava/lang/CharSequence;B)V")
    public void method2150(CharSequence arg0) {
        int var2 = class192.method2080(arg0);
        this.field1853[++this.field1847 - 1] = 0;
        this.method2160(var2);
        int var3 = this.field1847;
        byte[] var4 = this.field1853;
        int var5 = this.field1847;
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
        this.field1847 = var10 + var3;
    }

    @ObfuscatedName("dp.o([BIII)V")
    public void method2248(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1853[++this.field1847 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.c(II)V")
    public void method2337(int arg0) {
        this.field1853[this.field1847 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1853[this.field1847 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1853[this.field1847 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1853[this.field1847 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.r(IB)V")
    public void method2157(int arg0) {
        this.field1853[this.field1847 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1853[this.field1847 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.s(II)V")
    public void method2158(int arg0) {
        this.field1853[this.field1847 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.n(IB)V")
    public void method2178(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2263(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2148(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.q(II)V")
    public void method2160(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2263(arg0 >>> 28 | 0x80);
                    }
                    this.method2263(arg0 >>> 21 | 0x80);
                }
                this.method2263(arg0 >>> 14 | 0x80);
            }
            this.method2263(arg0 >>> 7 | 0x80);
        }
        this.method2263(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.e(S)I")
    public int method2257() {
        return this.field1853[++this.field1847 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.d(B)B")
    public byte method2162() {
        return this.field1853[++this.field1847 - 1];
    }

    @ObfuscatedName("dp.b(I)I")
    public int method2194() {
        this.field1847 += 2;
        return ((this.field1853[this.field1847 - 2] & 0xFF) << 8) + (this.field1853[this.field1847 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.a(B)I")
    public int method2308() {
        this.field1847 += 2;
        int var1 = ((this.field1853[this.field1847 - 2] & 0xFF) << 8) + (this.field1853[this.field1847 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.i(B)I")
    public int method2267() {
        this.field1847 += 3;
        return (this.field1853[this.field1847 - 1] & 0xFF) + ((this.field1853[this.field1847 - 2] & 0xFF) << 8) + ((this.field1853[this.field1847 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.w(I)I")
    public int method2297() {
        this.field1847 += 4;
        return (this.field1853[this.field1847 - 1] & 0xFF) + ((this.field1853[this.field1847 - 2] & 0xFF) << 8) + ((this.field1853[this.field1847 - 3] & 0xFF) << 16) + ((this.field1853[this.field1847 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.x(B)J")
    public long method2167() {
        long var1 = (long) this.method2297() & 0xFFFFFFFFL;
        long var3 = (long) this.method2297() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.h(B)Ljava/lang/String;")
    public String method2168() {
        if (this.field1853[this.field1847] == 0) {
            this.field1847++;
            return null;
        } else {
            return this.method2159();
        }
    }

    @ObfuscatedName("dp.z(I)Ljava/lang/String;")
    public String method2159() {
        int var1 = this.field1847;
        while (this.field1853[++this.field1847 - 1] != 0) {
        }
        int var2 = this.field1847 - var1 - 1;
        return var2 == 0 ? "" : class215.method528(this.field1853, var1, var2);
    }

    @ObfuscatedName("dp.u(I)Ljava/lang/String;")
    public String method2170() {
        byte var1 = this.field1853[++this.field1847 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1847;
        while (this.field1853[++this.field1847 - 1] != 0) {
        }
        int var3 = this.field1847 - var2 - 1;
        return var3 == 0 ? "" : class215.method528(this.field1853, var2, var3);
    }

    @ObfuscatedName("dp.ad(I)Ljava/lang/String;")
    public String method2171() {
        byte var1 = this.field1853[++this.field1847 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2333();
        if (this.field1847 + var2 > this.field1853.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1853;
        int var4 = this.field1847;
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
        this.field1847 += var2;
        return var12;
    }

    @ObfuscatedName("dp.ah([BIII)V")
    public void method2172(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1853[++this.field1847 - 1];
        }
    }

    @ObfuscatedName("dp.ao(I)I")
    public int method2151() {
        int var1 = this.field1853[this.field1847] & 0xFF;
        return var1 < 128 ? this.method2257() - 64 : this.method2194() - 49152;
    }

    @ObfuscatedName("dp.as(I)I")
    public int method2174() {
        int var1 = this.field1853[this.field1847] & 0xFF;
        return var1 < 128 ? this.method2257() : this.method2194() - 32768;
    }

    @ObfuscatedName("dp.at(I)I")
    public int method2175() {
        return this.field1853[this.field1847] < 0 ? this.method2297() & Integer.MAX_VALUE : this.method2194();
    }

    @ObfuscatedName("dp.ai(I)I")
    public int method2333() {
        byte var1 = this.field1853[++this.field1847 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1853[++this.field1847 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.aj([IIII)V")
    public void method2232(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1847;
        this.field1847 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2297();
            int var8 = this.method2297();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1847 -= 8;
            this.method2260(var7);
            this.method2260(var8);
        }
        this.field1847 = var4;
    }

    @ObfuscatedName("dp.aq([IIIS)V")
    public void method2205(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1847;
        this.field1847 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2297();
            int var8 = this.method2297();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1847 -= 8;
            this.method2260(var7);
            this.method2260(var8);
        }
        this.field1847 = var4;
    }

    @ObfuscatedName("dp.an(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2179(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1847;
        this.field1847 = 0;
        byte[] var4 = new byte[var3];
        this.method2172(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1847 = 0;
        this.method2148(var7.length);
        this.method2248(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.ac(II)I")
    public int method2180(int arg0) {
        int var2 = method2754(this.field1853, arg0, this.field1847);
        this.method2260(var2);
        return var2;
    }

    @ObfuscatedName("dp.ap(I)Z")
    public boolean method2249() {
        this.field1847 -= 4;
        int var1 = method2754(this.field1853, 0, this.field1847);
        int var2 = this.method2297();
        return var1 == var2;
    }

    @ObfuscatedName("dp.az(IB)V")
    public void method2182(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.ax(II)V")
    public void method2294(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.al(II)V")
    public void method2184(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.am(B)I")
    public int method2340() {
        return this.field1853[++this.field1847 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.av(I)I")
    public int method2291() {
        return -this.field1853[++this.field1847 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.ar(I)I")
    public int method2187() {
        return 128 - this.field1853[++this.field1847 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.ak(I)B")
    public byte method2188() {
        return (byte) (this.field1853[++this.field1847 - 1] - 128);
    }

    @ObfuscatedName("dp.aw(B)B")
    public byte method2189() {
        return (byte) (128 - this.field1853[++this.field1847 - 1]);
    }

    @ObfuscatedName("dp.ag(II)V")
    public void method2190(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) arg0;
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.ay(IB)V")
    public void method2191(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.af(II)V")
    public void method2192(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 + 128);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.au(B)I")
    public int method2342() {
        this.field1847 += 2;
        return ((this.field1853[this.field1847 - 1] & 0xFF) << 8) + (this.field1853[this.field1847 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.aa(I)I")
    public int method2317() {
        this.field1847 += 2;
        return ((this.field1853[this.field1847 - 2] & 0xFF) << 8) + (this.field1853[this.field1847 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.ab(I)I")
    public int method2195() {
        this.field1847 += 2;
        return ((this.field1853[this.field1847 - 1] & 0xFF) << 8) + (this.field1853[this.field1847 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.ae(I)I")
    public int method2196() {
        this.field1847 += 2;
        int var1 = ((this.field1853[this.field1847 - 1] & 0xFF) << 8) + (this.field1853[this.field1847 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bx(B)I")
    public int method2197() {
        this.field1847 += 2;
        int var1 = ((this.field1853[this.field1847 - 1] & 0xFF) << 8) + (this.field1853[this.field1847 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bj(I)I")
    public int method2198() {
        this.field1847 += 3;
        return (this.field1853[this.field1847 - 2] & 0xFF) + ((this.field1853[this.field1847 - 1] & 0xFF) << 8) + ((this.field1853[this.field1847 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.ba(IB)V")
    public void method2199(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) arg0;
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.bi(II)V")
    public void method2200(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
        this.field1853[++this.field1847 - 1] = (byte) arg0;
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 24);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.bb(II)V")
    public void method2181(int arg0) {
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 16);
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 24);
        this.field1853[++this.field1847 - 1] = (byte) arg0;
        this.field1853[++this.field1847 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bk(I)I")
    public int method2202() {
        this.field1847 += 4;
        return (this.field1853[this.field1847 - 4] & 0xFF) + ((this.field1853[this.field1847 - 3] & 0xFF) << 8) + ((this.field1853[this.field1847 - 2] & 0xFF) << 16) + ((this.field1853[this.field1847 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bl(I)I")
    public int method2203() {
        this.field1847 += 4;
        return (this.field1853[this.field1847 - 3] & 0xFF) + ((this.field1853[this.field1847 - 4] & 0xFF) << 8) + ((this.field1853[this.field1847 - 1] & 0xFF) << 16) + ((this.field1853[this.field1847 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bt(B)I")
    public int method2306() {
        this.field1847 += 4;
        return (this.field1853[this.field1847 - 2] & 0xFF) + ((this.field1853[this.field1847 - 1] & 0xFF) << 8) + ((this.field1853[this.field1847 - 4] & 0xFF) << 16) + ((this.field1853[this.field1847 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bc([BIIB)V")
    public void method2347(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1853[++this.field1847 - 1] - 128);
        }
    }

    @ObfuscatedName("dp.bn([BIII)V")
    public void method2206(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1853[++this.field1847 - 1] - 128);
        }
    }
}
