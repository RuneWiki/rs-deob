package deob;

import java.math.BigInteger;

@ObfuscatedName("cb")
public class class104 extends class176 {

    @ObfuscatedName("cb.m")
    public byte[] field1808;

    @ObfuscatedName("cb.k")
    public int field1806;

    @ObfuscatedName("cb.y")
    public static int[] field1807 = new int[256];

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
            field1807[var0] = var1;
        }
    }

    @ObfuscatedName("be.m([BIIB)I")
    public static int method1322(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1807[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("q.k([BIB)I")
    public static int method147(byte[] arg0, int arg1) {
        return method1322(arg0, 0, arg1);
    }

    public class104(int arg0) {
        this.field1808 = class106.method2369(arg0);
        this.field1806 = 0;
    }

    public class104(byte[] arg0) {
        this.field1808 = arg0;
        this.field1806 = 0;
    }

    @ObfuscatedName("cb.y(II)V")
    public void method2133(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.g(IS)V")
    public void method2117(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.r(IS)V")
    public void method2118(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 16);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.i(IB)V")
    public void method2131(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 24);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 16);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.f(J)V")
    public void method2120(long arg0) {
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1808[++this.field1806 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1808[++this.field1806 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cb.a(Ljava/lang/String;B)V")
    public void method2116(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1806 += class191.method2422(arg0, 0, arg0.length(), this.field1808, this.field1806);
        this.field1808[++this.field1806 - 1] = 0;
    }

    @ObfuscatedName("cb.w(Ljava/lang/String;I)V")
    public void method2122(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1808[++this.field1806 - 1] = 0;
        this.field1806 += class191.method2422(arg0, 0, arg0.length(), this.field1808, this.field1806);
        this.field1808[++this.field1806 - 1] = 0;
    }

    @ObfuscatedName("cb.u(Ljava/lang/CharSequence;B)V")
    public void method2260(CharSequence arg0) {
        int var2 = class177.method2863(arg0);
        this.field1808[++this.field1806 - 1] = 0;
        this.method2129(var2);
        int var3 = this.field1806;
        byte[] var4 = this.field1808;
        int var5 = this.field1806;
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
        this.field1806 = var10 + var3;
    }

    @ObfuscatedName("cb.d([BIIB)V")
    public void method2124(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1808[++this.field1806 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("cb.t(II)V")
    public void method2119(int arg0) {
        this.field1808[this.field1806 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1808[this.field1806 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1808[this.field1806 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1808[this.field1806 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.j(II)V")
    public void method2126(int arg0) {
        this.field1808[this.field1806 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1808[this.field1806 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.q(II)V")
    public void method2127(int arg0) {
        this.field1808[this.field1806 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("cb.p(II)V")
    public void method2209(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2133(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2117(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cb.v(II)V")
    public void method2129(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2133(arg0 >>> 28 | 0x80);
                    }
                    this.method2133(arg0 >>> 21 | 0x80);
                }
                this.method2133(arg0 >>> 14 | 0x80);
            }
            this.method2133(arg0 >>> 7 | 0x80);
        }
        this.method2133(arg0 & 0x7F);
    }

    @ObfuscatedName("cb.n(I)I")
    public int method2190() {
        return this.field1808[++this.field1806 - 1] & 0xFF;
    }

    @ObfuscatedName("cb.l(B)B")
    public byte method2159() {
        return this.field1808[++this.field1806 - 1];
    }

    @ObfuscatedName("cb.c(B)I")
    public int method2132() {
        this.field1806 += 2;
        return ((this.field1808[this.field1806 - 2] & 0xFF) << 8) + (this.field1808[this.field1806 - 1] & 0xFF);
    }

    @ObfuscatedName("cb.b(I)I")
    public int method2154() {
        this.field1806 += 2;
        int var1 = ((this.field1808[this.field1806 - 2] & 0xFF) << 8) + (this.field1808[this.field1806 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("cb.s(I)I")
    public int method2134() {
        this.field1806 += 3;
        return (this.field1808[this.field1806 - 1] & 0xFF) + ((this.field1808[this.field1806 - 3] & 0xFF) << 16) + ((this.field1808[this.field1806 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("cb.o(S)I")
    public int method2135() {
        this.field1806 += 4;
        return (this.field1808[this.field1806 - 1] & 0xFF) + ((this.field1808[this.field1806 - 2] & 0xFF) << 8) + ((this.field1808[this.field1806 - 4] & 0xFF) << 24) + ((this.field1808[this.field1806 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("cb.h(B)J")
    public long method2136() {
        long var1 = (long) this.method2135() & 0xFFFFFFFFL;
        long var3 = (long) this.method2135() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("cb.x(B)Ljava/lang/String;")
    public String method2137() {
        if (this.field1808[this.field1806] == 0) {
            this.field1806++;
            return null;
        } else {
            return this.method2138();
        }
    }

    @ObfuscatedName("cb.e(B)Ljava/lang/String;")
    public String method2138() {
        int var1 = this.field1806;
        while (this.field1808[++this.field1806 - 1] != 0) {
        }
        int var2 = this.field1806 - var1 - 1;
        return var2 == 0 ? "" : Statics.method1356(this.field1808, var1, var2);
    }

    @ObfuscatedName("cb.z(S)Ljava/lang/String;")
    public String method2157() {
        byte var1 = this.field1808[++this.field1806 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1806;
        while (this.field1808[++this.field1806 - 1] != 0) {
        }
        int var3 = this.field1806 - var2 - 1;
        return var3 == 0 ? "" : Statics.method1356(this.field1808, var2, var3);
    }

    @ObfuscatedName("cb.az(B)Ljava/lang/String;")
    public String method2140() {
        byte var1 = this.field1808[++this.field1806 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2229();
        if (this.field1806 + var2 > this.field1808.length) {
            throw new IllegalStateException("");
        }
        byte[] var3 = this.field1808;
        int var4 = this.field1806;
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
        this.field1806 += var2;
        return var12;
    }

    @ObfuscatedName("cb.av([BIIB)V")
    public void method2291(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1808[++this.field1806 - 1];
        }
    }

    @ObfuscatedName("cb.ay(I)I")
    public int method2142() {
        int var1 = this.field1808[this.field1806] & 0xFF;
        return var1 < 128 ? this.method2190() - 64 : this.method2132() - 49152;
    }

    @ObfuscatedName("cb.ah(S)I")
    public int method2143() {
        int var1 = this.field1808[this.field1806] & 0xFF;
        return var1 < 128 ? this.method2190() : this.method2132() - 32768;
    }

    @ObfuscatedName("cb.ao(B)I")
    public int method2144() {
        return this.field1808[this.field1806] < 0 ? this.method2135() & Integer.MAX_VALUE : this.method2132();
    }

    @ObfuscatedName("cb.aj(I)I")
    public int method2229() {
        byte var1 = this.field1808[++this.field1806 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1808[++this.field1806 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("cb.ad([IIIB)V")
    public void method2146(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1806;
        this.field1806 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2135();
            int var8 = this.method2135();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1806 -= 8;
            this.method2131(var7);
            this.method2131(var8);
        }
        this.field1806 = var4;
    }

    @ObfuscatedName("cb.ai([IIII)V")
    public void method2147(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1806;
        this.field1806 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2135();
            int var8 = this.method2135();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1806 -= 8;
            this.method2131(var7);
            this.method2131(var8);
        }
        this.field1806 = var4;
    }

    @ObfuscatedName("cb.af(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2148(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1806;
        this.field1806 = 0;
        byte[] var4 = new byte[var3];
        this.method2291(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1806 = 0;
        this.method2117(var7.length);
        this.method2124(var7, 0, var7.length);
    }

    @ObfuscatedName("cb.am(IB)I")
    public int method2149(int arg0) {
        int var2 = method1322(this.field1808, arg0, this.field1806);
        this.method2131(var2);
        return var2;
    }

    @ObfuscatedName("cb.aq(B)Z")
    public boolean method2125() {
        this.field1806 -= 4;
        int var1 = method1322(this.field1808, 0, this.field1806);
        int var2 = this.method2135();
        return var1 == var2;
    }

    @ObfuscatedName("cb.ar(IB)V")
    public void method2246(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("cb.an(II)V")
    public void method2237(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("cb.au(IB)V")
    public void method2130(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("cb.aa(I)I")
    public int method2153() {
        return this.field1808[++this.field1806 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("cb.ag(B)I")
    public int method2197() {
        return -this.field1808[++this.field1806 - 1] & 0xFF;
    }

    @ObfuscatedName("cb.al(B)I")
    public int method2155() {
        return 128 - this.field1808[++this.field1806 - 1] & 0xFF;
    }

    @ObfuscatedName("cb.ap(I)B")
    public byte method2156() {
        return (byte) (-this.field1808[++this.field1806 - 1]);
    }

    @ObfuscatedName("cb.ac(I)B")
    public byte method2277() {
        return (byte) (128 - this.field1808[++this.field1806 - 1]);
    }

    @ObfuscatedName("cb.ak(II)V")
    public void method2231(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) arg0;
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cb.ax(IB)V")
    public void method2151(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("cb.ab(IB)V")
    public void method2160(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 + 128);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cb.aw(I)I")
    public int method2161() {
        this.field1806 += 2;
        return ((this.field1808[this.field1806 - 1] & 0xFF) << 8) + (this.field1808[this.field1806 - 2] & 0xFF);
    }

    @ObfuscatedName("cb.at(B)I")
    public int method2162() {
        this.field1806 += 2;
        return ((this.field1808[this.field1806 - 2] & 0xFF) << 8) + (this.field1808[this.field1806 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("cb.as(B)I")
    public int method2261() {
        this.field1806 += 2;
        return ((this.field1808[this.field1806 - 1] & 0xFF) << 8) + (this.field1808[this.field1806 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("cb.ae(I)I")
    public int method2320() {
        this.field1806 += 2;
        int var1 = ((this.field1808[this.field1806 - 1] & 0xFF) << 8) + (this.field1808[this.field1806 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("cb.bw(II)V")
    public void method2193(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) arg0;
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("cb.ba(I)I")
    public int method2166() {
        this.field1806 += 3;
        return (this.field1808[this.field1806 - 1] & 0xFF) + ((this.field1808[this.field1806 - 3] & 0xFF) << 8) + ((this.field1808[this.field1806 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("cb.bk(IB)V")
    public void method2167(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) arg0;
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 16);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("cb.bv(II)V")
    public void method2313(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
        this.field1808[++this.field1806 - 1] = (byte) arg0;
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 24);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("cb.bm(IB)V")
    public void method2292(int arg0) {
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 16);
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 24);
        this.field1808[++this.field1806 - 1] = (byte) arg0;
        this.field1808[++this.field1806 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("cb.bi(I)I")
    public int method2170() {
        this.field1806 += 4;
        return (this.field1808[this.field1806 - 4] & 0xFF) + ((this.field1808[this.field1806 - 3] & 0xFF) << 8) + ((this.field1808[this.field1806 - 2] & 0xFF) << 16) + ((this.field1808[this.field1806 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("cb.bd(B)I")
    public int method2171() {
        this.field1806 += 4;
        return (this.field1808[this.field1806 - 3] & 0xFF) + ((this.field1808[this.field1806 - 4] & 0xFF) << 8) + ((this.field1808[this.field1806 - 2] & 0xFF) << 24) + ((this.field1808[this.field1806 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("cb.bt(I)I")
    public int method2172() {
        this.field1806 += 4;
        return (this.field1808[this.field1806 - 2] & 0xFF) + ((this.field1808[this.field1806 - 1] & 0xFF) << 8) + ((this.field1808[this.field1806 - 3] & 0xFF) << 24) + ((this.field1808[this.field1806 - 4] & 0xFF) << 16);
    }

    @ObfuscatedName("cb.br([BIII)V")
    public void method2145(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1808[++this.field1806 - 1] - 128);
        }
    }
}
