package deob;

import java.math.BigInteger;

@ObfuscatedName("de")
public class class107 extends class186 {

    @ObfuscatedName("de.k")
    public byte[] field1865;

    @ObfuscatedName("de.r")
    public int field1863;

    @ObfuscatedName("de.y")
    public static int[] field1864 = new int[256];

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
            field1864[var0] = var1;
        }
    }

    public class107(int arg0) {
        this.field1865 = class109.method2337(arg0);
        this.field1863 = 0;
    }

    public class107(byte[] arg0) {
        this.field1865 = arg0;
        this.field1863 = 0;
    }

    @ObfuscatedName("de.r(II)V")
    public void method2097(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.y(IS)V")
    public void method2098(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.w(II)V")
    public void method2182(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.m(II)V")
    public void method2100(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 24);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.j(J)V")
    public void method2101(long arg0) {
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1865[++this.field1863 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1865[++this.field1863 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("de.g(Ljava/lang/String;I)V")
    public void method2186(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1863 += class201.method1849(arg0, 0, arg0.length(), this.field1865, this.field1863);
        this.field1865[++this.field1863 - 1] = 0;
    }

    @ObfuscatedName("bb.p(Ljava/lang/String;B)I")
    public static int method1339(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("de.o(Ljava/lang/String;I)V")
    public void method2293(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1865[++this.field1863 - 1] = 0;
        this.field1863 += class201.method1849(arg0, 0, arg0.length(), this.field1865, this.field1863);
        this.field1865[++this.field1863 - 1] = 0;
    }

    @ObfuscatedName("de.b(Ljava/lang/CharSequence;I)V")
    public void method2104(CharSequence arg0) {
        int var2 = class187.method458(arg0);
        this.field1865[++this.field1863 - 1] = 0;
        this.method2110(var2);
        int var3 = this.field1863;
        byte[] var4 = this.field1865;
        int var5 = this.field1863;
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
        this.field1863 = var10 + var3;
    }

    @ObfuscatedName("de.x([BIII)V")
    public void method2105(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1865[++this.field1863 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("de.n(II)V")
    public void method2270(int arg0) {
        this.field1865[this.field1863 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1865[this.field1863 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1865[this.field1863 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1865[this.field1863 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.d(IB)V")
    public void method2233(int arg0) {
        this.field1865[this.field1863 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1865[this.field1863 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.s(II)V")
    public void method2108(int arg0) {
        this.field1865[this.field1863 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.v(II)V")
    public void method2109(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2097(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2098(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.t(II)V")
    public void method2110(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2097(arg0 >>> 28 | 0x80);
                    }
                    this.method2097(arg0 >>> 21 | 0x80);
                }
                this.method2097(arg0 >>> 14 | 0x80);
            }
            this.method2097(arg0 >>> 7 | 0x80);
        }
        this.method2097(arg0 & 0x7F);
    }

    @ObfuscatedName("de.u(I)I")
    public int method2111() {
        return this.field1865[++this.field1863 - 1] & 0xFF;
    }

    @ObfuscatedName("de.l(I)B")
    public byte method2112() {
        return this.field1865[++this.field1863 - 1];
    }

    @ObfuscatedName("de.i(I)I")
    public int method2232() {
        this.field1863 += 2;
        return ((this.field1865[this.field1863 - 2] & 0xFF) << 8) + (this.field1865[this.field1863 - 1] & 0xFF);
    }

    @ObfuscatedName("de.h(B)I")
    public int method2240() {
        this.field1863 += 2;
        int var1 = ((this.field1865[this.field1863 - 2] & 0xFF) << 8) + (this.field1865[this.field1863 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.e(B)I")
    public int method2262() {
        this.field1863 += 3;
        return (this.field1865[this.field1863 - 1] & 0xFF) + ((this.field1865[this.field1863 - 3] & 0xFF) << 16) + ((this.field1865[this.field1863 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("de.a(I)I")
    public int method2116() {
        this.field1863 += 4;
        return (this.field1865[this.field1863 - 1] & 0xFF) + ((this.field1865[this.field1863 - 2] & 0xFF) << 8) + ((this.field1865[this.field1863 - 4] & 0xFF) << 24) + ((this.field1865[this.field1863 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("de.c(B)J")
    public long method2172() {
        long var1 = (long) this.method2116() & 0xFFFFFFFFL;
        long var3 = (long) this.method2116() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("de.f(B)Ljava/lang/String;")
    public String method2201() {
        if (this.field1865[this.field1863] == 0) {
            this.field1863++;
            return null;
        } else {
            return this.method2119();
        }
    }

    @ObfuscatedName("de.q(I)Ljava/lang/String;")
    public String method2119() {
        int var1 = this.field1863;
        while (this.field1865[++this.field1863 - 1] != 0) {
        }
        int var2 = this.field1863 - var1 - 1;
        return var2 == 0 ? "" : class201.method487(this.field1865, var1, var2);
    }

    @ObfuscatedName("de.z(I)Ljava/lang/String;")
    public String method2120() {
        byte var1 = this.field1865[++this.field1863 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1863;
        while (this.field1865[++this.field1863 - 1] != 0) {
        }
        int var3 = this.field1863 - var2 - 1;
        return var3 == 0 ? "" : class201.method487(this.field1865, var2, var3);
    }

    @ObfuscatedName("de.aa(I)Ljava/lang/String;")
    public String method2121() {
        byte var1 = this.field1865[++this.field1863 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2126();
        if (this.field1863 + var2 > this.field1865.length) {
            throw new IllegalStateException("");
        }
        String var3 = class187.method2364(this.field1865, this.field1863, var2);
        this.field1863 += var2;
        return var3;
    }

    @ObfuscatedName("de.ak([BIII)V")
    public void method2122(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1865[++this.field1863 - 1];
        }
    }

    @ObfuscatedName("de.al(B)I")
    public int method2123() {
        int var1 = this.field1865[this.field1863] & 0xFF;
        return var1 < 128 ? this.method2111() - 64 : this.method2232() - 49152;
    }

    @ObfuscatedName("de.aw(B)I")
    public int method2124() {
        int var1 = this.field1865[this.field1863] & 0xFF;
        return var1 < 128 ? this.method2111() : this.method2232() - 32768;
    }

    @ObfuscatedName("de.ai(B)I")
    public int method2251() {
        return this.field1865[this.field1863] < 0 ? this.method2116() & Integer.MAX_VALUE : this.method2232();
    }

    @ObfuscatedName("de.av(I)I")
    public int method2126() {
        byte var1 = this.field1865[++this.field1863 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1865[++this.field1863 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("de.an([IIIB)V")
    public void method2127(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1863;
        this.field1863 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2116();
            int var8 = this.method2116();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1863 -= 8;
            this.method2100(var7);
            this.method2100(var8);
        }
        this.field1863 = var4;
    }

    @ObfuscatedName("de.aq([IIII)V")
    public void method2128(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1863;
        this.field1863 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2116();
            int var8 = this.method2116();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1863 -= 8;
            this.method2100(var7);
            this.method2100(var8);
        }
        this.field1863 = var4;
    }

    @ObfuscatedName("de.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2129(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1863;
        this.field1863 = 0;
        byte[] var4 = new byte[var3];
        this.method2122(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1863 = 0;
        this.method2098(var7.length);
        this.method2105(var7, 0, var7.length);
    }

    @ObfuscatedName("de.az(IB)I")
    public int method2139(int arg0) {
        byte[] var2 = this.field1865;
        int var3 = this.field1863;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1864[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2100(var6);
        return var6;
    }

    @ObfuscatedName("de.ax(I)Z")
    public boolean method2131() {
        this.field1863 -= 4;
        byte[] var1 = this.field1865;
        int var2 = this.field1863;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1864[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2116();
        return var5 == var8;
    }

    @ObfuscatedName("de.ap(II)V")
    public void method2132(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ar(IB)V")
    public void method2133(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("de.am(II)V")
    public void method2134(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("de.ae(I)I")
    public int method2135() {
        return this.field1865[++this.field1863 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("de.as(B)I")
    public int method2136() {
        return -this.field1865[++this.field1863 - 1] & 0xFF;
    }

    @ObfuscatedName("de.ad(I)I")
    public int method2102() {
        return 128 - this.field1865[++this.field1863 - 1] & 0xFF;
    }

    @ObfuscatedName("de.af(I)B")
    public byte method2138() {
        return (byte) (-this.field1865[++this.field1863 - 1]);
    }

    @ObfuscatedName("de.ab(B)B")
    public byte method2171() {
        return (byte) (128 - this.field1865[++this.field1863 - 1]);
    }

    @ObfuscatedName("de.at(IB)V")
    public void method2220(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) arg0;
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ag(IB)V")
    public void method2187(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("de.ah(II)V")
    public void method2236(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 + 128);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.ac(B)I")
    public int method2143() {
        this.field1863 += 2;
        return ((this.field1865[this.field1863 - 1] & 0xFF) << 8) + (this.field1865[this.field1863 - 2] & 0xFF);
    }

    @ObfuscatedName("de.ay(S)I")
    public int method2144() {
        this.field1863 += 2;
        return ((this.field1865[this.field1863 - 2] & 0xFF) << 8) + (this.field1865[this.field1863 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("de.au(I)I")
    public int method2145() {
        this.field1863 += 2;
        return ((this.field1865[this.field1863 - 1] & 0xFF) << 8) + (this.field1865[this.field1863 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("de.ao(I)I")
    public int method2146() {
        this.field1863 += 2;
        int var1 = ((this.field1865[this.field1863 - 2] & 0xFF) << 8) + (this.field1865[this.field1863 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("de.bh(II)V")
    public void method2147(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1863 - 1] = (byte) arg0;
    }

    @ObfuscatedName("de.bf(IS)V")
    public void method2152(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) arg0;
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("de.bn(II)V")
    public void method2149(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
        this.field1865[++this.field1863 - 1] = (byte) arg0;
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 24);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("de.bw(II)V")
    public void method2150(int arg0) {
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 16);
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 24);
        this.field1865[++this.field1863 - 1] = (byte) arg0;
        this.field1865[++this.field1863 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("de.be(B)I")
    public int method2151() {
        this.field1863 += 4;
        return (this.field1865[this.field1863 - 4] & 0xFF) + ((this.field1865[this.field1863 - 3] & 0xFF) << 8) + ((this.field1865[this.field1863 - 2] & 0xFF) << 16) + ((this.field1865[this.field1863 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("de.bd(I)I")
    public int method2175() {
        this.field1863 += 4;
        return (this.field1865[this.field1863 - 3] & 0xFF) + ((this.field1865[this.field1863 - 4] & 0xFF) << 8) + ((this.field1865[this.field1863 - 2] & 0xFF) << 24) + ((this.field1865[this.field1863 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("de.bo(I)I")
    public int method2153() {
        this.field1863 += 4;
        return (this.field1865[this.field1863 - 2] & 0xFF) + ((this.field1865[this.field1863 - 1] & 0xFF) << 8) + ((this.field1865[this.field1863 - 4] & 0xFF) << 16) + ((this.field1865[this.field1863 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("de.bz([BIII)V")
    public void method2154(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1865[++this.field1863 - 1] - 128);
        }
    }
}
