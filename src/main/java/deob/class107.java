package deob;

import java.math.BigInteger;

@ObfuscatedName("dg")
public class class107 extends class186 {

    @ObfuscatedName("dg.t")
    public byte[] field1826;

    @ObfuscatedName("dg.o")
    public int field1827;

    @ObfuscatedName("dg.i")
    public static int[] field1828 = new int[256];

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
            field1828[var0] = var1;
        }
    }

    @ObfuscatedName("bs.t([BIIS)I")
    public static int method1578(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1828[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class107(int arg0) {
        this.field1826 = class109.method2332(arg0);
        this.field1827 = 0;
    }

    public class107(byte[] arg0) {
        this.field1826 = arg0;
        this.field1827 = 0;
    }

    @ObfuscatedName("dg.o(II)V")
    public void method2168(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.i(II)V")
    public void method2185(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.p(IB)V")
    public void method2106(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 16);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.c(II)V")
    public void method2174(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 24);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 16);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.y(J)V")
    public void method2108(long arg0) {
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1826[++this.field1827 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1826[++this.field1827 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("aj.g(Ljava/lang/String;I)I")
    public static int method634(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dg.l(Ljava/lang/String;I)V")
    public void method2255(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1827 += class201.method692(arg0, 0, arg0.length(), this.field1826, this.field1827);
        this.field1826[++this.field1827 - 1] = 0;
    }

    @ObfuscatedName("dg.h(Ljava/lang/String;I)V")
    public void method2188(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1826[++this.field1827 - 1] = 0;
        this.field1827 += class201.method692(arg0, 0, arg0.length(), this.field1826, this.field1827);
        this.field1826[++this.field1827 - 1] = 0;
    }

    @ObfuscatedName("dg.n(Ljava/lang/CharSequence;B)V")
    public void method2111(CharSequence arg0) {
        int var2 = class187.method2806(arg0);
        this.field1826[++this.field1827 - 1] = 0;
        this.method2117(var2);
        this.field1827 += class187.method2415(this.field1826, this.field1827, arg0);
    }

    @ObfuscatedName("dg.w([BIIB)V")
    public void method2112(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1826[++this.field1827 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dg.m(II)V")
    public void method2113(int arg0) {
        this.field1826[this.field1827 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1826[this.field1827 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1826[this.field1827 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1826[this.field1827 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.x(II)V")
    public void method2114(int arg0) {
        this.field1826[this.field1827 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1826[this.field1827 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.b(II)V")
    public void method2115(int arg0) {
        this.field1826[this.field1827 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dg.u(IB)V")
    public void method2116(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2168(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2185(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dg.r(II)V")
    public void method2117(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2168(arg0 >>> 28 | 0x80);
                    }
                    this.method2168(arg0 >>> 21 | 0x80);
                }
                this.method2168(arg0 >>> 14 | 0x80);
            }
            this.method2168(arg0 >>> 7 | 0x80);
        }
        this.method2168(arg0 & 0x7F);
    }

    @ObfuscatedName("dg.z(B)I")
    public int method2118() {
        return this.field1826[++this.field1827 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.v(B)B")
    public byte method2253() {
        return this.field1826[++this.field1827 - 1];
    }

    @ObfuscatedName("dg.k(B)I")
    public int method2120() {
        this.field1827 += 2;
        return ((this.field1826[this.field1827 - 2] & 0xFF) << 8) + (this.field1826[this.field1827 - 1] & 0xFF);
    }

    @ObfuscatedName("dg.a(B)I")
    public int method2252() {
        this.field1827 += 2;
        int var1 = ((this.field1826[this.field1827 - 2] & 0xFF) << 8) + (this.field1826[this.field1827 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.d(I)I")
    public int method2122() {
        this.field1827 += 3;
        return (this.field1826[this.field1827 - 1] & 0xFF) + ((this.field1826[this.field1827 - 3] & 0xFF) << 16) + ((this.field1826[this.field1827 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dg.j(I)I")
    public int method2152() {
        this.field1827 += 4;
        return (this.field1826[this.field1827 - 1] & 0xFF) + ((this.field1826[this.field1827 - 2] & 0xFF) << 8) + ((this.field1826[this.field1827 - 3] & 0xFF) << 16) + ((this.field1826[this.field1827 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.s(B)J")
    public long method2124() {
        long var1 = (long) this.method2152() & 0xFFFFFFFFL;
        long var3 = (long) this.method2152() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dg.f(I)Ljava/lang/String;")
    public String method2125() {
        if (this.field1826[this.field1827] == 0) {
            this.field1827++;
            return null;
        } else {
            return this.method2126();
        }
    }

    @ObfuscatedName("dg.e(B)Ljava/lang/String;")
    public String method2126() {
        int var1 = this.field1827;
        while (this.field1826[++this.field1827 - 1] != 0) {
        }
        int var2 = this.field1827 - var1 - 1;
        return var2 == 0 ? "" : class201.method501(this.field1826, var1, var2);
    }

    @ObfuscatedName("dg.q(I)Ljava/lang/String;")
    public String method2128() {
        byte var1 = this.field1826[++this.field1827 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1827;
        while (this.field1826[++this.field1827 - 1] != 0) {
        }
        int var3 = this.field1827 - var2 - 1;
        return var3 == 0 ? "" : class201.method501(this.field1826, var2, var3);
    }

    @ObfuscatedName("dg.al(I)Ljava/lang/String;")
    public String method2194() {
        byte var1 = this.field1826[++this.field1827 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2133();
        if (this.field1827 + var2 > this.field1826.length) {
            throw new IllegalStateException("");
        }
        String var3 = class187.method2648(this.field1826, this.field1827, var2);
        this.field1827 += var2;
        return var3;
    }

    @ObfuscatedName("dg.ao([BIII)V")
    public void method2129(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1826[++this.field1827 - 1];
        }
    }

    @ObfuscatedName("dg.ap(I)I")
    public int method2127() {
        int var1 = this.field1826[this.field1827] & 0xFF;
        return var1 < 128 ? this.method2118() - 64 : this.method2120() - 49152;
    }

    @ObfuscatedName("dg.aa(I)I")
    public int method2198() {
        int var1 = this.field1826[this.field1827] & 0xFF;
        return var1 < 128 ? this.method2118() : this.method2120() - 32768;
    }

    @ObfuscatedName("dg.ak(I)I")
    public int method2132() {
        return this.field1826[this.field1827] < 0 ? this.method2152() & Integer.MAX_VALUE : this.method2120();
    }

    @ObfuscatedName("dg.ah(I)I")
    public int method2133() {
        byte var1 = this.field1826[++this.field1827 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1826[++this.field1827 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dg.as([IIII)V")
    public void method2134(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1827;
        this.field1827 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2152();
            int var8 = this.method2152();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1827 -= 8;
            this.method2174(var7);
            this.method2174(var8);
        }
        this.field1827 = var4;
    }

    @ObfuscatedName("dg.aw([IIII)V")
    public void method2135(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1827;
        this.field1827 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2152();
            int var8 = this.method2152();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1827 -= 8;
            this.method2174(var7);
            this.method2174(var8);
        }
        this.field1827 = var4;
    }

    @ObfuscatedName("dg.aj(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2136(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1827;
        this.field1827 = 0;
        byte[] var4 = new byte[var3];
        this.method2129(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1827 = 0;
        this.method2185(var7.length);
        this.method2112(var7, 0, var7.length);
    }

    @ObfuscatedName("dg.af(II)I")
    public int method2131(int arg0) {
        int var2 = method1578(this.field1826, arg0, this.field1827);
        this.method2174(var2);
        return var2;
    }

    @ObfuscatedName("dg.am(B)Z")
    public boolean method2138() {
        this.field1827 -= 4;
        int var1 = method1578(this.field1826, 0, this.field1827);
        int var2 = this.method2152();
        return var1 == var2;
    }

    @ObfuscatedName("dg.ab(IB)V")
    public void method2139(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.ai(IB)V")
    public void method2140(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dg.an(II)V")
    public void method2271(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dg.ac(S)I")
    public int method2142() {
        return this.field1826[++this.field1827 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dg.au(I)I")
    public int method2143() {
        return -this.field1826[++this.field1827 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.av(B)I")
    public int method2159() {
        return 128 - this.field1826[++this.field1827 - 1] & 0xFF;
    }

    @ObfuscatedName("dg.at(B)B")
    public byte method2238() {
        return (byte) (this.field1826[++this.field1827 - 1] - 128);
    }

    @ObfuscatedName("dg.ax(I)B")
    public byte method2146() {
        return (byte) (-this.field1826[++this.field1827 - 1]);
    }

    @ObfuscatedName("dg.ae(II)V")
    public void method2162(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) arg0;
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.az(IB)V")
    public void method2148(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dg.ar(II)V")
    public void method2149(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 + 128);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.aq(I)I")
    public int method2150() {
        this.field1827 += 2;
        return ((this.field1826[this.field1827 - 1] & 0xFF) << 8) + (this.field1826[this.field1827 - 2] & 0xFF);
    }

    @ObfuscatedName("dg.ag(I)I")
    public int method2151() {
        this.field1827 += 2;
        return ((this.field1826[this.field1827 - 2] & 0xFF) << 8) + (this.field1826[this.field1827 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.ay(I)I")
    public int method2262() {
        this.field1827 += 2;
        return ((this.field1826[this.field1827 - 1] & 0xFF) << 8) + (this.field1826[this.field1827 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dg.ad(I)I")
    public int method2153() {
        this.field1827 += 2;
        int var1 = ((this.field1826[this.field1827 - 1] & 0xFF) << 8) + (this.field1826[this.field1827 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.bd(S)I")
    public int method2154() {
        this.field1827 += 2;
        int var1 = ((this.field1826[this.field1827 - 2] & 0xFF) << 8) + (this.field1826[this.field1827 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dg.bl(IB)V")
    public void method2110(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) arg0;
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dg.bi(II)V")
    public void method2156(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) arg0;
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 16);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dg.bc(II)V")
    public void method2157(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
        this.field1826[++this.field1827 - 1] = (byte) arg0;
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 24);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dg.bn(IB)V")
    public void method2158(int arg0) {
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 16);
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 24);
        this.field1826[++this.field1827 - 1] = (byte) arg0;
        this.field1826[++this.field1827 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dg.bb(I)I")
    public int method2190() {
        this.field1827 += 4;
        return (this.field1826[this.field1827 - 4] & 0xFF) + ((this.field1826[this.field1827 - 3] & 0xFF) << 8) + ((this.field1826[this.field1827 - 2] & 0xFF) << 16) + ((this.field1826[this.field1827 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.bu(I)I")
    public int method2160() {
        this.field1827 += 4;
        return (this.field1826[this.field1827 - 3] & 0xFF) + ((this.field1826[this.field1827 - 4] & 0xFF) << 8) + ((this.field1826[this.field1827 - 1] & 0xFF) << 16) + ((this.field1826[this.field1827 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.bq(I)I")
    public int method2161() {
        this.field1827 += 4;
        return (this.field1826[this.field1827 - 2] & 0xFF) + ((this.field1826[this.field1827 - 1] & 0xFF) << 8) + ((this.field1826[this.field1827 - 4] & 0xFF) << 16) + ((this.field1826[this.field1827 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dg.bk([BIII)V")
    public void method2184(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1826[++this.field1827 - 1];
        }
    }
}
