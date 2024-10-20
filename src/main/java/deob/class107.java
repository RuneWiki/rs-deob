package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class107 extends class187 {

    @ObfuscatedName("dp.p")
    public byte[] field1838;

    @ObfuscatedName("dp.g")
    public int field1837;

    @ObfuscatedName("dp.x")
    public static int[] field1836 = new int[256];

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
            field1836[var0] = var1;
        }
    }

    public class107(int arg0) {
        this.field1838 = class109.method2403(arg0);
        this.field1837 = 0;
    }

    public class107(byte[] arg0) {
        this.field1838 = arg0;
        this.field1837 = 0;
    }

    @ObfuscatedName("dp.g(II)V")
    public void method2159(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.x(IB)V")
    public void method2364(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.c(II)V")
    public void method2161(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.n(IS)V")
    public void method2162(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 24);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.s(J)V")
    public void method2163(long arg0) {
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1838[++this.field1837 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1838[++this.field1837 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dp.r(Ljava/lang/String;I)V")
    public void method2199(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1837 += class202.method152(arg0, 0, arg0.length(), this.field1838, this.field1837);
        this.field1838[++this.field1837 - 1] = 0;
    }

    @ObfuscatedName("ba.w(Ljava/lang/String;I)I")
    public static int method1464(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dp.u(Ljava/lang/String;S)V")
    public void method2165(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1838[++this.field1837 - 1] = 0;
        this.field1837 += class202.method152(arg0, 0, arg0.length(), this.field1838, this.field1837);
        this.field1838[++this.field1837 - 1] = 0;
    }

    @ObfuscatedName("dp.d(Ljava/lang/CharSequence;B)V")
    public void method2166(CharSequence arg0) {
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
        this.field1838[++this.field1837 - 1] = 0;
        this.method2349(var3);
        int var8 = this.field1837;
        byte[] var9 = this.field1838;
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

    @ObfuscatedName("dp.h([BIIB)V")
    public void method2160(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1838[++this.field1837 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.a(II)V")
    public void method2168(int arg0) {
        this.field1838[this.field1837 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1838[this.field1837 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1838[this.field1837 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1838[this.field1837 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.y(II)V")
    public void method2169(int arg0) {
        this.field1838[this.field1837 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1838[this.field1837 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.v(II)V")
    public void method2206(int arg0) {
        this.field1838[this.field1837 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.e(II)V")
    public void method2171(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2159(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2364(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.b(II)V")
    public void method2349(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2159(arg0 >>> 28 | 0x80);
                    }
                    this.method2159(arg0 >>> 21 | 0x80);
                }
                this.method2159(arg0 >>> 14 | 0x80);
            }
            this.method2159(arg0 >>> 7 | 0x80);
        }
        this.method2159(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.z(I)I")
    public int method2173() {
        return this.field1838[++this.field1837 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.l(I)B")
    public byte method2174() {
        return this.field1838[++this.field1837 - 1];
    }

    @ObfuscatedName("dp.t(I)I")
    public int method2175() {
        this.field1837 += 2;
        return ((this.field1838[this.field1837 - 2] & 0xFF) << 8) + (this.field1838[this.field1837 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.q(B)I")
    public int method2176() {
        this.field1837 += 2;
        int var1 = ((this.field1838[this.field1837 - 2] & 0xFF) << 8) + (this.field1838[this.field1837 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.j(I)I")
    public int method2329() {
        this.field1837 += 3;
        return (this.field1838[this.field1837 - 1] & 0xFF) + ((this.field1838[this.field1837 - 2] & 0xFF) << 8) + ((this.field1838[this.field1837 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.o(I)I")
    public int method2305() {
        this.field1837 += 4;
        return (this.field1838[this.field1837 - 1] & 0xFF) + ((this.field1838[this.field1837 - 2] & 0xFF) << 8) + ((this.field1838[this.field1837 - 4] & 0xFF) << 24) + ((this.field1838[this.field1837 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.i(I)J")
    public long method2179() {
        long var1 = (long) this.method2305() & 0xFFFFFFFFL;
        long var3 = (long) this.method2305() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.m(I)Ljava/lang/String;")
    public String method2180() {
        if (this.field1838[this.field1837] == 0) {
            this.field1837++;
            return null;
        } else {
            return this.method2351();
        }
    }

    @ObfuscatedName("dp.f(I)Ljava/lang/String;")
    public String method2351() {
        int var1 = this.field1837;
        while (this.field1838[++this.field1837 - 1] != 0) {
        }
        int var2 = this.field1837 - var1 - 1;
        return var2 == 0 ? "" : class202.method3084(this.field1838, var1, var2);
    }

    @ObfuscatedName("dp.k(S)Ljava/lang/String;")
    public String method2328() {
        byte var1 = this.field1838[++this.field1837 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1837;
        while (this.field1838[++this.field1837 - 1] != 0) {
        }
        int var3 = this.field1837 - var2 - 1;
        return var3 == 0 ? "" : class202.method3084(this.field1838, var2, var3);
    }

    @ObfuscatedName("dp.an(I)Ljava/lang/String;")
    public String method2183() {
        byte var1 = this.field1838[++this.field1837 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2188();
        if (this.field1837 + var2 > this.field1838.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1838;
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

    @ObfuscatedName("dp.aw([BIII)V")
    public void method2184(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1838[++this.field1837 - 1];
        }
    }

    @ObfuscatedName("dp.at(B)I")
    public int method2197() {
        int var1 = this.field1838[this.field1837] & 0xFF;
        return var1 < 128 ? this.method2173() - 64 : this.method2175() - 49152;
    }

    @ObfuscatedName("dp.al(S)I")
    public int method2186() {
        int var1 = this.field1838[this.field1837] & 0xFF;
        return var1 < 128 ? this.method2173() : this.method2175() - 32768;
    }

    @ObfuscatedName("dp.as(I)I")
    public int method2360() {
        return this.field1838[this.field1837] < 0 ? this.method2305() & Integer.MAX_VALUE : this.method2175();
    }

    @ObfuscatedName("dp.ak(B)I")
    public int method2188() {
        byte var1 = this.field1838[++this.field1837 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1838[++this.field1837 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.aa([IIII)V")
    public void method2189(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1837;
        this.field1837 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2305();
            int var8 = this.method2305();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1837 -= 8;
            this.method2162(var7);
            this.method2162(var8);
        }
        this.field1837 = var4;
    }

    @ObfuscatedName("dp.ao([IIII)V")
    public void method2190(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1837;
        this.field1837 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2305();
            int var8 = this.method2305();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1837 -= 8;
            this.method2162(var7);
            this.method2162(var8);
        }
        this.field1837 = var4;
    }

    @ObfuscatedName("dp.af(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2303(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1837;
        this.field1837 = 0;
        byte[] var4 = new byte[var3];
        this.method2184(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1837 = 0;
        this.method2364(var7.length);
        this.method2160(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.aj(IB)I")
    public int method2192(int arg0) {
        byte[] var2 = this.field1838;
        int var3 = this.field1837;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1836[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2162(var6);
        return var6;
    }

    @ObfuscatedName("dp.az(B)Z")
    public boolean method2221() {
        this.field1837 -= 4;
        byte[] var1 = this.field1838;
        int var2 = this.field1837;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1836[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2305();
        return var5 == var8;
    }

    @ObfuscatedName("dp.ae(IS)V")
    public void method2194(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.av(II)V")
    public void method2195(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.ax(II)V")
    public void method2342(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.ai(I)I")
    public int method2220() {
        return this.field1838[++this.field1837 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.aq(I)I")
    public int method2272() {
        return -this.field1838[++this.field1837 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.ad(I)I")
    public int method2187() {
        return 128 - this.field1838[++this.field1837 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.au(I)B")
    public byte method2283() {
        return (byte) (this.field1838[++this.field1837 - 1] - 128);
    }

    @ObfuscatedName("dp.ag(II)V")
    public void method2201(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) arg0;
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.ar(II)V")
    public void method2198(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.am(IB)V")
    public void method2203(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 + 128);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.ab(I)I")
    public int method2204() {
        this.field1837 += 2;
        return ((this.field1838[this.field1837 - 1] & 0xFF) << 8) + (this.field1838[this.field1837 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.ac(I)I")
    public int method2205() {
        this.field1837 += 2;
        return ((this.field1838[this.field1837 - 2] & 0xFF) << 8) + (this.field1838[this.field1837 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.ah(B)I")
    public int method2298() {
        this.field1837 += 2;
        return ((this.field1838[this.field1837 - 1] & 0xFF) << 8) + (this.field1838[this.field1837 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.ay(B)I")
    public int method2207() {
        this.field1837 += 2;
        int var1 = ((this.field1838[this.field1837 - 1] & 0xFF) << 8) + (this.field1838[this.field1837 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.ap(B)I")
    public int method2208() {
        this.field1837 += 2;
        int var1 = ((this.field1838[this.field1837 - 2] & 0xFF) << 8) + (this.field1838[this.field1837 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bj(II)V")
    public void method2243(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) arg0;
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.bm(II)V")
    public void method2341(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) arg0;
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.by(IB)V")
    public void method2336(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
        this.field1838[++this.field1837 - 1] = (byte) arg0;
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 24);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.bp(IB)V")
    public void method2212(int arg0) {
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 16);
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 24);
        this.field1838[++this.field1837 - 1] = (byte) arg0;
        this.field1838[++this.field1837 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bc(I)I")
    public int method2213() {
        this.field1837 += 4;
        return (this.field1838[this.field1837 - 4] & 0xFF) + ((this.field1838[this.field1837 - 3] & 0xFF) << 8) + ((this.field1838[this.field1837 - 1] & 0xFF) << 24) + ((this.field1838[this.field1837 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bd(I)I")
    public int method2214() {
        this.field1837 += 4;
        return (this.field1838[this.field1837 - 3] & 0xFF) + ((this.field1838[this.field1837 - 4] & 0xFF) << 8) + ((this.field1838[this.field1837 - 1] & 0xFF) << 16) + ((this.field1838[this.field1837 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bk(I)I")
    public int method2196() {
        this.field1837 += 4;
        return (this.field1838[this.field1837 - 2] & 0xFF) + ((this.field1838[this.field1837 - 1] & 0xFF) << 8) + ((this.field1838[this.field1837 - 4] & 0xFF) << 16) + ((this.field1838[this.field1837 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bn([BIII)V")
    public void method2216(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1838[++this.field1837 - 1] - 128);
        }
    }

    @ObfuscatedName("dp.bt([BIII)V")
    public void method2217(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1838[++this.field1837 - 1] - 128);
        }
    }
}
