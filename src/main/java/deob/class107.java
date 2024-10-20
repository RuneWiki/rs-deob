package deob;

import java.math.BigInteger;

@ObfuscatedName("dm")
public class class107 extends class186 {

    @ObfuscatedName("dm.g")
    public byte[] field1840;

    @ObfuscatedName("dm.v")
    public int field1839;

    @ObfuscatedName("dm.z")
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
        this.field1840 = class109.method2343(arg0);
        this.field1839 = 0;
    }

    public class107(byte[] arg0) {
        this.field1840 = arg0;
        this.field1839 = 0;
    }

    @ObfuscatedName("dm.v(II)V")
    public void method2126(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.z(II)V")
    public void method2151(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.h(II)V")
    public void method2226(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.k(II)V")
    public void method2236(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 24);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.l(J)V")
    public void method2131(long arg0) {
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1840[++this.field1839 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1840[++this.field1839 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("ae.e(Ljava/lang/String;B)I")
    public static int method859(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dm.j(Ljava/lang/String;B)V")
    public void method2257(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1839 += class201.method1893(arg0, 0, arg0.length(), this.field1840, this.field1839);
        this.field1840[++this.field1839 - 1] = 0;
    }

    @ObfuscatedName("dm.n(Ljava/lang/String;I)V")
    public void method2274(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1840[++this.field1839 - 1] = 0;
        this.field1839 += class201.method1893(arg0, 0, arg0.length(), this.field1840, this.field1839);
        this.field1840[++this.field1839 - 1] = 0;
    }

    @ObfuscatedName("dm.f(Ljava/lang/CharSequence;B)V")
    public void method2261(CharSequence arg0) {
        int var2 = class187.method2800(arg0);
        this.field1840[++this.field1839 - 1] = 0;
        this.method2138(var2);
        this.field1839 += class187.method153(this.field1840, this.field1839, arg0);
    }

    @ObfuscatedName("dm.a([BIIB)V")
    public void method2302(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1840[++this.field1839 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dm.i(II)V")
    public void method2174(int arg0) {
        this.field1840[this.field1839 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1840[this.field1839 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1840[this.field1839 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1840[this.field1839 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.y(II)V")
    public void method2135(int arg0) {
        this.field1840[this.field1839 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1840[this.field1839 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.p(IS)V")
    public void method2136(int arg0) {
        this.field1840[this.field1839 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dm.q(II)V")
    public void method2129(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2126(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2151(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dm.t(II)V")
    public void method2138(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2126(arg0 >>> 28 | 0x80);
                    }
                    this.method2126(arg0 >>> 21 | 0x80);
                }
                this.method2126(arg0 >>> 14 | 0x80);
            }
            this.method2126(arg0 >>> 7 | 0x80);
        }
        this.method2126(arg0 & 0x7F);
    }

    @ObfuscatedName("dm.r(I)I")
    public int method2139() {
        return this.field1840[++this.field1839 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.x(B)B")
    public byte method2140() {
        return this.field1840[++this.field1839 - 1];
    }

    @ObfuscatedName("dm.s(I)I")
    public int method2141() {
        this.field1839 += 2;
        return ((this.field1840[this.field1839 - 2] & 0xFF) << 8) + (this.field1840[this.field1839 - 1] & 0xFF);
    }

    @ObfuscatedName("dm.d(I)I")
    public int method2142() {
        this.field1839 += 2;
        int var1 = ((this.field1840[this.field1839 - 2] & 0xFF) << 8) + (this.field1840[this.field1839 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.m(I)I")
    public int method2230() {
        this.field1839 += 3;
        return (this.field1840[this.field1839 - 1] & 0xFF) + ((this.field1840[this.field1839 - 2] & 0xFF) << 8) + ((this.field1840[this.field1839 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.o(I)I")
    public int method2144() {
        this.field1839 += 4;
        return (this.field1840[this.field1839 - 1] & 0xFF) + ((this.field1840[this.field1839 - 2] & 0xFF) << 8) + ((this.field1840[this.field1839 - 3] & 0xFF) << 16) + ((this.field1840[this.field1839 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.b(I)J")
    public long method2145() {
        long var1 = (long) this.method2144() & 0xFFFFFFFFL;
        long var3 = (long) this.method2144() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dm.c(I)Ljava/lang/String;")
    public String method2146() {
        if (this.field1840[this.field1839] == 0) {
            this.field1839++;
            return null;
        } else {
            return this.method2147();
        }
    }

    @ObfuscatedName("dm.w(B)Ljava/lang/String;")
    public String method2147() {
        int var1 = this.field1839;
        while (this.field1840[++this.field1839 - 1] != 0) {
        }
        int var2 = this.field1839 - var1 - 1;
        return var2 == 0 ? "" : class201.method466(this.field1840, var1, var2);
    }

    @ObfuscatedName("dm.u(B)Ljava/lang/String;")
    public String method2148() {
        byte var1 = this.field1840[++this.field1839 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1839;
        while (this.field1840[++this.field1839 - 1] != 0) {
        }
        int var3 = this.field1839 - var2 - 1;
        return var3 == 0 ? "" : class201.method466(this.field1840, var2, var3);
    }

    @ObfuscatedName("dm.ac(S)Ljava/lang/String;")
    public String method2258() {
        byte var1 = this.field1840[++this.field1839 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2154();
        if (this.field1839 + var2 > this.field1840.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1840;
        int var4 = this.field1839;
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
        this.field1839 += var2;
        return var12;
    }

    @ObfuscatedName("dm.ap([BIII)V")
    public void method2150(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1840[++this.field1839 - 1];
        }
    }

    @ObfuscatedName("dm.ai(I)I")
    public int method2167() {
        int var1 = this.field1840[this.field1839] & 0xFF;
        return var1 < 128 ? this.method2139() - 64 : this.method2141() - 49152;
    }

    @ObfuscatedName("dm.as(S)I")
    public int method2152() {
        int var1 = this.field1840[this.field1839] & 0xFF;
        return var1 < 128 ? this.method2139() : this.method2141() - 32768;
    }

    @ObfuscatedName("dm.aa(I)I")
    public int method2197() {
        return this.field1840[this.field1839] < 0 ? this.method2144() & Integer.MAX_VALUE : this.method2141();
    }

    @ObfuscatedName("dm.aq(I)I")
    public int method2154() {
        byte var1 = this.field1840[++this.field1839 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1840[++this.field1839 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dm.aw([IIIB)V")
    public void method2155(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1839;
        this.field1839 = arg1;
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
            this.field1839 -= 8;
            this.method2236(var7);
            this.method2236(var8);
        }
        this.field1839 = var4;
    }

    @ObfuscatedName("dm.am([IIIB)V")
    public void method2156(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1839;
        this.field1839 = arg1;
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
            this.field1839 -= 8;
            this.method2236(var7);
            this.method2236(var8);
        }
        this.field1839 = var4;
    }

    @ObfuscatedName("dm.av(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2157(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1839;
        this.field1839 = 0;
        byte[] var4 = new byte[var3];
        this.method2150(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1839 = 0;
        this.method2151(var7.length);
        this.method2302(var7, 0, var7.length);
    }

    @ObfuscatedName("dm.an(II)I")
    public int method2158(int arg0) {
        byte[] var2 = this.field1840;
        int var3 = this.field1839;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1838[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2236(var6);
        return var6;
    }

    @ObfuscatedName("dm.at(B)Z")
    public boolean method2159() {
        this.field1839 -= 4;
        byte[] var1 = this.field1840;
        int var2 = this.field1839;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1838[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2144();
        return var5 == var8;
    }

    @ObfuscatedName("dm.ao(IB)V")
    public void method2160(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.ag(IB)V")
    public void method2161(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dm.ax(II)V")
    public void method2162(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dm.ay(I)I")
    public int method2163() {
        return this.field1840[++this.field1839 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dm.ab(B)I")
    public int method2234() {
        return -this.field1840[++this.field1839 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.al(B)I")
    public int method2172() {
        return 128 - this.field1840[++this.field1839 - 1] & 0xFF;
    }

    @ObfuscatedName("dm.ae(I)B")
    public byte method2166() {
        return (byte) (this.field1840[++this.field1839 - 1] - 128);
    }

    @ObfuscatedName("dm.af(I)B")
    public byte method2180() {
        return (byte) (-this.field1840[++this.field1839 - 1]);
    }

    @ObfuscatedName("dm.aj(I)B")
    public byte method2207() {
        return (byte) (128 - this.field1840[++this.field1839 - 1]);
    }

    @ObfuscatedName("dm.ah(II)V")
    public void method2169(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) arg0;
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.au(II)V")
    public void method2170(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dm.ad(IB)V")
    public void method2216(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 + 128);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.az(I)I")
    public int method2127() {
        this.field1839 += 2;
        return ((this.field1840[this.field1839 - 1] & 0xFF) << 8) + (this.field1840[this.field1839 - 2] & 0xFF);
    }

    @ObfuscatedName("dm.ak(B)I")
    public int method2173() {
        this.field1839 += 2;
        return ((this.field1840[this.field1839 - 2] & 0xFF) << 8) + (this.field1840[this.field1839 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.ar(S)I")
    public int method2288() {
        this.field1839 += 2;
        return ((this.field1840[this.field1839 - 1] & 0xFF) << 8) + (this.field1840[this.field1839 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dm.bu(I)I")
    public int method2175() {
        this.field1839 += 2;
        int var1 = ((this.field1840[this.field1839 - 1] & 0xFF) << 8) + (this.field1840[this.field1839 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dm.bo(II)V")
    public void method2176(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) arg0;
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.be(II)V")
    public void method2177(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) arg0;
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dm.bq(IS)V")
    public void method2277(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
        this.field1840[++this.field1839 - 1] = (byte) arg0;
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 24);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dm.bh(II)V")
    public void method2267(int arg0) {
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 16);
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 24);
        this.field1840[++this.field1839 - 1] = (byte) arg0;
        this.field1840[++this.field1839 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dm.bc(I)I")
    public int method2178() {
        this.field1839 += 4;
        return (this.field1840[this.field1839 - 4] & 0xFF) + ((this.field1840[this.field1839 - 3] & 0xFF) << 8) + ((this.field1840[this.field1839 - 1] & 0xFF) << 24) + ((this.field1840[this.field1839 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.ba(I)I")
    public int method2133() {
        this.field1839 += 4;
        return (this.field1840[this.field1839 - 3] & 0xFF) + ((this.field1840[this.field1839 - 4] & 0xFF) << 8) + ((this.field1840[this.field1839 - 1] & 0xFF) << 16) + ((this.field1840[this.field1839 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dm.bn(I)I")
    public int method2182() {
        this.field1839 += 4;
        return (this.field1840[this.field1839 - 2] & 0xFF) + ((this.field1840[this.field1839 - 1] & 0xFF) << 8) + ((this.field1840[this.field1839 - 3] & 0xFF) << 24) + ((this.field1840[this.field1839 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("dm.bx([BIII)V")
    public void method2202(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1840[++this.field1839 - 1] - 128);
        }
    }
}
