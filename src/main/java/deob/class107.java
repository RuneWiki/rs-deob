package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class107 extends class186 {

    @ObfuscatedName("dl.e")
    public byte[] field1840;

    @ObfuscatedName("dl.o")
    public int field1841;

    @ObfuscatedName("dl.y")
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

    @ObfuscatedName("bb.e([BII)I")
    public static int method1296(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1849[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class107(int arg0) {
        this.field1840 = class109.method2291(arg0);
        this.field1841 = 0;
    }

    public class107(byte[] arg0) {
        this.field1840 = arg0;
        this.field1841 = 0;
    }

    @ObfuscatedName("dl.o(IB)V")
    public void method2051(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.y(II)V")
    public void method2052(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.b(IS)V")
    public void method2053(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.w(II)V")
    public void method2054(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1841 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.r(J)V")
    public void method2055(long arg0) {
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1840[++this.field1841 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1840[++this.field1841 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.s(Ljava/lang/String;B)V")
    public void method2056(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1841 += class201.method467(arg0, 0, arg0.length(), this.field1840, this.field1841);
        this.field1840[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("ae.f(Ljava/lang/String;I)I")
    public static int method571(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dl.x(Ljava/lang/String;I)V")
    public void method2240(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1840[++this.field1841 - 1] = 0;
        this.field1841 += class201.method467(arg0, 0, arg0.length(), this.field1840, this.field1841);
        this.field1840[++this.field1841 - 1] = 0;
    }

    @ObfuscatedName("dl.h(Ljava/lang/CharSequence;B)V")
    public void method2058(CharSequence arg0) {
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
        this.field1840[++this.field1841 - 1] = 0;
        this.method2064(var3);
        int var8 = this.field1841;
        byte[] var9 = this.field1840;
        int var10 = this.field1841;
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
        this.field1841 = var15 + var8;
    }

    @ObfuscatedName("dl.a([BIIB)V")
    public void method2059(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1840[++this.field1841 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.u(II)V")
    public void method2060(int arg0) {
        this.field1840[this.field1841 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1840[this.field1841 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1840[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1840[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.v(II)V")
    public void method2154(int arg0) {
        this.field1840[this.field1841 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1840[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.i(II)V")
    public void method2093(int arg0) {
        this.field1840[this.field1841 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.n(II)V")
    public void method2063(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2051(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2052(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.d(II)V")
    public void method2064(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2051(arg0 >>> 28 | 0x80);
                    }
                    this.method2051(arg0 >>> 21 | 0x80);
                }
                this.method2051(arg0 >>> 14 | 0x80);
            }
            this.method2051(arg0 >>> 7 | 0x80);
        }
        this.method2051(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.k(I)I")
    public int method2123() {
        return this.field1840[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.p(B)B")
    public byte method2066() {
        return this.field1840[++this.field1841 - 1];
    }

    @ObfuscatedName("dl.j(I)I")
    public int method2232() {
        this.field1841 += 2;
        return ((this.field1840[this.field1841 - 2] & 0xFF) << 8) + (this.field1840[this.field1841 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.z(I)I")
    public int method2068() {
        this.field1841 += 2;
        int var1 = ((this.field1840[this.field1841 - 2] & 0xFF) << 8) + (this.field1840[this.field1841 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.t(B)I")
    public int method2215() {
        this.field1841 += 3;
        return (this.field1840[this.field1841 - 1] & 0xFF) + ((this.field1840[this.field1841 - 3] & 0xFF) << 16) + ((this.field1840[this.field1841 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.c(B)I")
    public int method2207() {
        this.field1841 += 4;
        return (this.field1840[this.field1841 - 1] & 0xFF) + ((this.field1840[this.field1841 - 2] & 0xFF) << 8) + ((this.field1840[this.field1841 - 4] & 0xFF) << 24) + ((this.field1840[this.field1841 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.q(I)J")
    public long method2131() {
        long var1 = (long) this.method2207() & 0xFFFFFFFFL;
        long var3 = (long) this.method2207() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.g(B)Ljava/lang/String;")
    public String method2072() {
        if (this.field1840[this.field1841] == 0) {
            this.field1841++;
            return null;
        } else {
            return this.method2073();
        }
    }

    @ObfuscatedName("dl.m(I)Ljava/lang/String;")
    public String method2073() {
        int var1 = this.field1841;
        while (this.field1840[++this.field1841 - 1] != 0) {
        }
        int var2 = this.field1841 - var1 - 1;
        return var2 == 0 ? "" : class201.method2464(this.field1840, var1, var2);
    }

    @ObfuscatedName("dl.ay(I)Ljava/lang/String;")
    public String method2074() {
        byte var1 = this.field1840[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1841;
        while (this.field1840[++this.field1841 - 1] != 0) {
        }
        int var3 = this.field1841 - var2 - 1;
        return var3 == 0 ? "" : class201.method2464(this.field1840, var2, var3);
    }

    @ObfuscatedName("dl.ae(I)Ljava/lang/String;")
    public String method2075() {
        byte var1 = this.field1840[++this.field1841 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2112();
        if (this.field1841 + var2 > this.field1840.length) {
            throw new IllegalStateException("");
        }
        String var3 = class187.method505(this.field1840, this.field1841, var2);
        this.field1841 += var2;
        return var3;
    }

    @ObfuscatedName("dl.af([BIIB)V")
    public void method2076(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1840[++this.field1841 - 1];
        }
    }

    @ObfuscatedName("dl.ab(B)I")
    public int method2225() {
        int var1 = this.field1840[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2123() - 64 : this.method2232() - 49152;
    }

    @ObfuscatedName("dl.ao(B)I")
    public int method2078() {
        int var1 = this.field1840[this.field1841] & 0xFF;
        return var1 < 128 ? this.method2123() : this.method2232() - 32768;
    }

    @ObfuscatedName("dl.ak(I)I")
    public int method2118() {
        return this.field1840[this.field1841] < 0 ? this.method2207() & Integer.MAX_VALUE : this.method2232();
    }

    @ObfuscatedName("dl.ah(I)I")
    public int method2112() {
        byte var1 = this.field1840[++this.field1841 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1840[++this.field1841 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.ai([IIIB)V")
    public void method2081(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2207();
            int var8 = this.method2207();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2054(var7);
            this.method2054(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dl.al([IIII)V")
    public void method2082(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1841;
        this.field1841 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2207();
            int var8 = this.method2207();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1841 -= 8;
            this.method2054(var7);
            this.method2054(var8);
        }
        this.field1841 = var4;
    }

    @ObfuscatedName("dl.av(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2083(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1841;
        this.field1841 = 0;
        byte[] var4 = new byte[var3];
        this.method2076(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1841 = 0;
        this.method2052(var7.length);
        this.method2059(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.ap(IB)I")
    public int method2080(int arg0) {
        byte[] var2 = this.field1840;
        int var3 = this.field1841;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1849[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2054(var6);
        return var6;
    }

    @ObfuscatedName("dl.ar(I)Z")
    public boolean method2133() {
        this.field1841 -= 4;
        byte[] var1 = this.field1840;
        int var2 = this.field1841;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1849[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2207();
        return var5 == var8;
    }

    @ObfuscatedName("dl.au(II)V")
    public void method2220(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.aq(II)V")
    public void method2192(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dl.at(II)V")
    public void method2088(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.ag(B)I")
    public int method2089() {
        return this.field1840[++this.field1841 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.am(B)I")
    public int method2090() {
        return -this.field1840[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.aw(I)I")
    public int method2091() {
        return 128 - this.field1840[++this.field1841 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.ac(I)B")
    public byte method2092() {
        return (byte) (this.field1840[++this.field1841 - 1] - 128);
    }

    @ObfuscatedName("dl.as(B)B")
    public byte method2199() {
        return (byte) (-this.field1840[++this.field1841 - 1]);
    }

    @ObfuscatedName("dl.az(I)B")
    public byte method2094() {
        return (byte) (128 - this.field1840[++this.field1841 - 1]);
    }

    @ObfuscatedName("dl.ad(II)V")
    public void method2095(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) arg0;
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.ax(IB)V")
    public void method2212(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.aa(IB)V")
    public void method2097(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 + 128);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.aj(B)I")
    public int method2186() {
        this.field1841 += 2;
        return ((this.field1840[this.field1841 - 1] & 0xFF) << 8) + (this.field1840[this.field1841 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.an(B)I")
    public int method2099() {
        this.field1841 += 2;
        return ((this.field1840[this.field1841 - 2] & 0xFF) << 8) + (this.field1840[this.field1841 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bw(B)I")
    public int method2100() {
        this.field1841 += 2;
        return ((this.field1840[this.field1841 - 1] & 0xFF) << 8) + (this.field1840[this.field1841 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.br(B)I")
    public int method2101() {
        this.field1841 += 2;
        int var1 = ((this.field1840[this.field1841 - 1] & 0xFF) << 8) + (this.field1840[this.field1841 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.bl(IB)V")
    public void method2102(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1841 - 1] = (byte) arg0;
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bt(II)V")
    public void method2103(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) arg0;
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.bo(II)V")
    public void method2251(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1841 - 1] = (byte) arg0;
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.bu(II)V")
    public void method2221(int arg0) {
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 24);
        this.field1840[++this.field1841 - 1] = (byte) arg0;
        this.field1840[++this.field1841 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bh(I)I")
    public int method2106() {
        this.field1841 += 4;
        return (this.field1840[this.field1841 - 4] & 0xFF) + ((this.field1840[this.field1841 - 3] & 0xFF) << 8) + ((this.field1840[this.field1841 - 1] & 0xFF) << 24) + ((this.field1840[this.field1841 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.bc(I)I")
    public int method2107() {
        this.field1841 += 4;
        return (this.field1840[this.field1841 - 3] & 0xFF) + ((this.field1840[this.field1841 - 4] & 0xFF) << 8) + ((this.field1840[this.field1841 - 2] & 0xFF) << 24) + ((this.field1840[this.field1841 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.bn(B)I")
    public int method2108() {
        this.field1841 += 4;
        return (this.field1840[this.field1841 - 2] & 0xFF) + ((this.field1840[this.field1841 - 1] & 0xFF) << 8) + ((this.field1840[this.field1841 - 3] & 0xFF) << 24) + ((this.field1840[this.field1841 - 4] & 0xFF) << 16);
    }
}
