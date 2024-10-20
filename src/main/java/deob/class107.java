package deob;

import java.math.BigInteger;

@ObfuscatedName("dm")
public class class107 extends class186 {

    @ObfuscatedName("dm.i")
    public byte[] field1841;

    @ObfuscatedName("dm.c")
    public int field1837;

    @ObfuscatedName("dm.h")
    public static int[] field1838 = new int[256];

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
            field1838[var0] = var1;
        }
    }

    public class107(int arg0) {
        this.field1841 = class109.method2378(arg0);
        this.field1837 = 0;
    }

    public class107(byte[] arg0) {
        this.field1841 = arg0;
        this.field1837 = 0;
    }

    @ObfuscatedName("dm.i(II)V")
    public void method2137(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.c(II)V")
    public void method2235(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.h(II)V")
    public void method2283(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.v(II)V")
    public void method2140(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 24);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.q(J)V")
    public void method2141(long arg0) {
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1841[++this.field1837 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1841[++this.field1837 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dm.g(Ljava/lang/String;B)V")
    public void method2148(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1837 += class201.method1069(arg0, 0, arg0.length(), this.field1841, this.field1837);
        this.field1841[++this.field1837 - 1] = 0;
    }

    @ObfuscatedName("dm.u(Ljava/lang/String;I)V")
    public void method2270(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1841[++this.field1837 - 1] = 0;
        this.field1837 += class201.method1069(arg0, 0, arg0.length(), this.field1841, this.field1837);
        this.field1841[++this.field1837 - 1] = 0;
    }

    @ObfuscatedName("dm.d(Ljava/lang/CharSequence;I)V")
    public void method2144(CharSequence arg0) {
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
        this.field1841[++this.field1837 - 1] = 0;
        this.method2300(var3);
        int var8 = this.field1837;
        byte[] var9 = this.field1841;
        int var10 = this.field1837;
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
        this.field1837 = var15 + var8;
    }

    @ObfuscatedName("dm.y([BIII)V")
    public void method2145(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1841[++this.field1837 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dm.e(II)V")
    public void method2146(int arg0) {
        this.field1841[this.field1837 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1841[this.field1837 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1841[this.field1837 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1841[this.field1837 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.l(II)V")
    public void method2147(int arg0) {
        this.field1841[this.field1837 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1841[this.field1837 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.o(II)V")
    public void method2275(int arg0) {
        this.field1841[this.field1837 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.w(II)V")
    public void method2149(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2137(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2235(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.t(II)V")
    public void method2300(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2137(arg0 >>> 28 | 0x80);
                    }
                    this.method2137(arg0 >>> 21 | 0x80);
                }
                this.method2137(arg0 >>> 14 | 0x80);
            }
            this.method2137(arg0 >>> 7 | 0x80);
        }
        this.method2137(arg0 & 0x7F);
    }

    @ObfuscatedName("dm.z(I)I")
    public int method2151() {
        return this.field1841[++this.field1837 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.b(I)B")
    public byte method2152() {
        return this.field1841[++this.field1837 - 1];
    }

    @ObfuscatedName("dm.a(B)I")
    public int method2313() {
        this.field1837 += 2;
        return ((this.field1841[this.field1837 - 2] & 0xFF) << 8) + (this.field1841[this.field1837 - 1] & 0xFF);
    }

    @ObfuscatedName("dm.r(I)I")
    public int method2221() {
        this.field1837 += 2;
        int var1 = ((this.field1841[this.field1837 - 2] & 0xFF) << 8) + (this.field1841[this.field1837 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.m(I)I")
    public int method2336() {
        this.field1837 += 3;
        return (this.field1841[this.field1837 - 1] & 0xFF) + ((this.field1841[this.field1837 - 3] & 0xFF) << 16) + ((this.field1841[this.field1837 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dm.f(I)I")
    public int method2156() {
        this.field1837 += 4;
        return (this.field1841[this.field1837 - 1] & 0xFF) + ((this.field1841[this.field1837 - 2] & 0xFF) << 8) + ((this.field1841[this.field1837 - 4] & 0xFF) << 24) + ((this.field1841[this.field1837 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.k(I)J")
    public long method2157() {
        long var1 = (long) this.method2156() & 0xFFFFFFFFL;
        long var3 = (long) this.method2156() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dm.p(I)Ljava/lang/String;")
    public String method2158() {
        if (this.field1841[this.field1837] == 0) {
            this.field1837++;
            return null;
        } else {
            return this.method2159();
        }
    }

    @ObfuscatedName("dm.n(I)Ljava/lang/String;")
    public String method2159() {
        int var1 = this.field1837;
        while (this.field1841[++this.field1837 - 1] != 0) {
        }
        int var2 = this.field1837 - var1 - 1;
        return var2 == 0 ? "" : class201.method3467(this.field1841, var1, var2);
    }

    @ObfuscatedName("dm.j(I)Ljava/lang/String;")
    public String method2297() {
        byte var1 = this.field1841[++this.field1837 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1837;
        while (this.field1841[++this.field1837 - 1] != 0) {
        }
        int var3 = this.field1837 - var2 - 1;
        return var3 == 0 ? "" : class201.method3467(this.field1841, var2, var3);
    }

    @ObfuscatedName("dm.x(I)Ljava/lang/String;")
    public String method2161() {
        byte var1 = this.field1841[++this.field1837 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2217();
        if (this.field1837 + var2 > this.field1841.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1841;
        int var4 = this.field1837;
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
        this.field1837 += var2;
        return var12;
    }

    @ObfuscatedName("dm.al([BIIB)V")
    public void method2162(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1841[++this.field1837 - 1];
        }
    }

    @ObfuscatedName("dm.au(I)I")
    public int method2163() {
        int var1 = this.field1841[this.field1837] & 0xFF;
        return var1 < 128 ? this.method2151() - 64 : this.method2313() - 49152;
    }

    @ObfuscatedName("dm.az(S)I")
    public int method2164() {
        int var1 = this.field1841[this.field1837] & 0xFF;
        return var1 < 128 ? this.method2151() : this.method2313() - 32768;
    }

    @ObfuscatedName("dm.ag(I)I")
    public int method2165() {
        return this.field1841[this.field1837] < 0 ? this.method2156() & Integer.MAX_VALUE : this.method2313();
    }

    @ObfuscatedName("dm.aj(B)I")
    public int method2217() {
        byte var1 = this.field1841[++this.field1837 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1841[++this.field1837 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dm.af([IIII)V")
    public void method2167(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1837;
        this.field1837 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2156();
            int var8 = this.method2156();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1837 -= 8;
            this.method2140(var7);
            this.method2140(var8);
        }
        this.field1837 = var4;
    }

    @ObfuscatedName("dm.am([IIII)V")
    public void method2168(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1837;
        this.field1837 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2156();
            int var8 = this.method2156();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1837 -= 8;
            this.method2140(var7);
            this.method2140(var8);
        }
        this.field1837 = var4;
    }

    @ObfuscatedName("dm.aa(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2169(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1837;
        this.field1837 = 0;
        byte[] var4 = new byte[var3];
        this.method2162(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1837 = 0;
        this.method2235(var7.length);
        this.method2145(var7, 0, var7.length);
    }

    @ObfuscatedName("dm.ab(II)I")
    public int method2225(int arg0) {
        byte[] var2 = this.field1841;
        int var3 = this.field1837;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1838[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2140(var6);
        return var6;
    }

    @ObfuscatedName("dm.ai(I)Z")
    public boolean method2171() {
        this.field1837 -= 4;
        byte[] var1 = this.field1841;
        int var2 = this.field1837;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1838[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2156();
        return var5 == var8;
    }

    @ObfuscatedName("dm.ak(IB)V")
    public void method2142(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.ao(II)V")
    public void method2173(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dm.ar(II)V")
    public void method2328(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dm.aq(I)I")
    public int method2286() {
        return this.field1841[++this.field1837 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dm.an(I)I")
    public int method2176() {
        return -this.field1841[++this.field1837 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.av(I)I")
    public int method2177() {
        return 128 - this.field1841[++this.field1837 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ac(B)B")
    public byte method2178() {
        return (byte) (this.field1841[++this.field1837 - 1] - 128);
    }

    @ObfuscatedName("dm.ay(I)B")
    public byte method2197() {
        return (byte) (-this.field1841[++this.field1837 - 1]);
    }

    @ObfuscatedName("dm.ae(IB)V")
    public void method2180(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) arg0;
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.ah(II)V")
    public void method2181(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.aw(IB)V")
    public void method2209(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 + 128);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.ax(S)I")
    public int method2183() {
        this.field1837 += 2;
        return ((this.field1841[this.field1837 - 1] & 0xFF) << 8) + (this.field1841[this.field1837 - 2] & 0xFF);
    }

    @ObfuscatedName("dm.at(I)I")
    public int method2184() {
        this.field1837 += 2;
        return ((this.field1841[this.field1837 - 2] & 0xFF) << 8) + (this.field1841[this.field1837 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.ad(I)I")
    public int method2138() {
        this.field1837 += 2;
        return ((this.field1841[this.field1837 - 1] & 0xFF) << 8) + (this.field1841[this.field1837 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.as(I)I")
    public int method2186() {
        this.field1837 += 2;
        int var1 = ((this.field1841[this.field1837 - 2] & 0xFF) << 8) + (this.field1841[this.field1837 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.ap(II)V")
    public void method2227(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) arg0;
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.ba(I)I")
    public int method2188() {
        this.field1837 += 3;
        return (this.field1841[this.field1837 - 1] & 0xFF) + ((this.field1841[this.field1837 - 2] & 0xFF) << 16) + ((this.field1841[this.field1837 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dm.bw(II)V")
    public void method2189(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) arg0;
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dm.bm(II)V")
    public void method2190(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1841[++this.field1837 - 1] = (byte) arg0;
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 24);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.bg(II)V")
    public void method2154(int arg0) {
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 24);
        this.field1841[++this.field1837 - 1] = (byte) arg0;
        this.field1841[++this.field1837 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bv(I)I")
    public int method2192() {
        this.field1837 += 4;
        return (this.field1841[this.field1837 - 4] & 0xFF) + ((this.field1841[this.field1837 - 3] & 0xFF) << 8) + ((this.field1841[this.field1837 - 1] & 0xFF) << 24) + ((this.field1841[this.field1837 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.bf(I)I")
    public int method2193() {
        this.field1837 += 4;
        return (this.field1841[this.field1837 - 3] & 0xFF) + ((this.field1841[this.field1837 - 4] & 0xFF) << 8) + ((this.field1841[this.field1837 - 2] & 0xFF) << 24) + ((this.field1841[this.field1837 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.bq(I)I")
    public int method2194() {
        this.field1837 += 4;
        return (this.field1841[this.field1837 - 2] & 0xFF) + ((this.field1841[this.field1837 - 1] & 0xFF) << 8) + ((this.field1841[this.field1837 - 4] & 0xFF) << 16) + ((this.field1841[this.field1837 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bk([BIII)V")
    public void method2195(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1841[++this.field1837 - 1] - 128);
        }
    }

    @ObfuscatedName("dm.bu([BIIB)V")
    public void method2298(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1841[++this.field1837 - 1] - 128);
        }
    }
}
