package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class111 extends class199 {

    @ObfuscatedName("dl.n")
    public byte[] field1889;

    @ObfuscatedName("dl.o")
    public int field1890;

    @ObfuscatedName("dl.a")
    public static int[] field1895 = new int[256];

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
            field1895[var0] = var1;
        }
    }

    @ObfuscatedName("an.n([BIII)I")
    public static int method599(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1895[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class111(int arg0) {
        this.field1889 = class113.method2487(arg0);
        this.field1890 = 0;
    }

    public class111(byte[] arg0) {
        this.field1889 = arg0;
        this.field1890 = 0;
    }

    @ObfuscatedName("dl.o(II)V")
    public void method2219(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.a(II)V")
    public void method2220(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.w(II)V")
    public void method2221(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.m(II)V")
    public void method2222(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 24);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.h(J)V")
    public void method2223(long arg0) {
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1889[++this.field1890 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.i(J)V")
    public void method2224(long arg0) {
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1889[++this.field1890 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1889[++this.field1890 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.l(Ljava/lang/String;B)V")
    public void method2225(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1890 += class156.method2831(arg0, 0, arg0.length(), this.field1889, this.field1890);
        this.field1889[++this.field1890 - 1] = 0;
    }

    @ObfuscatedName("dl.f(Ljava/lang/String;B)V")
    public void method2226(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1889[++this.field1890 - 1] = 0;
        this.field1890 += class156.method2831(arg0, 0, arg0.length(), this.field1889, this.field1890);
        this.field1889[++this.field1890 - 1] = 0;
    }

    @ObfuscatedName("dl.e(Ljava/lang/CharSequence;I)V")
    public void method2361(CharSequence arg0) {
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
        this.field1889[++this.field1890 - 1] = 0;
        this.method2384(var3);
        int var8 = this.field1890;
        byte[] var9 = this.field1889;
        int var10 = this.field1890;
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
        this.field1890 = var15 + var8;
    }

    @ObfuscatedName("dl.z([BIII)V")
    public void method2285(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1889[++this.field1890 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.v(II)V")
    public void method2229(int arg0) {
        this.field1889[this.field1890 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1889[this.field1890 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1889[this.field1890 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1889[this.field1890 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.x(IB)V")
    public void method2433(int arg0) {
        this.field1889[this.field1890 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1889[this.field1890 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.q(II)V")
    public void method2231(int arg0) {
        this.field1889[this.field1890 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.b(IB)V")
    public void method2232(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2219(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2220(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.u(II)V")
    public void method2384(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2219(arg0 >>> 28 | 0x80);
                    }
                    this.method2219(arg0 >>> 21 | 0x80);
                }
                this.method2219(arg0 >>> 14 | 0x80);
            }
            this.method2219(arg0 >>> 7 | 0x80);
        }
        this.method2219(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.t(I)I")
    public int method2234() {
        return this.field1889[++this.field1890 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.s(I)B")
    public byte method2235() {
        return this.field1889[++this.field1890 - 1];
    }

    @ObfuscatedName("dl.p(I)I")
    public int method2236() {
        this.field1890 += 2;
        return ((this.field1889[this.field1890 - 2] & 0xFF) << 8) + (this.field1889[this.field1890 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.d(I)I")
    public int method2237() {
        this.field1890 += 2;
        int var1 = ((this.field1889[this.field1890 - 2] & 0xFF) << 8) + (this.field1889[this.field1890 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.j(I)I")
    public int method2238() {
        this.field1890 += 3;
        return (this.field1889[this.field1890 - 1] & 0xFF) + ((this.field1889[this.field1890 - 3] & 0xFF) << 16) + ((this.field1889[this.field1890 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.k(I)I")
    public int method2239() {
        this.field1890 += 4;
        return (this.field1889[this.field1890 - 1] & 0xFF) + ((this.field1889[this.field1890 - 2] & 0xFF) << 8) + ((this.field1889[this.field1890 - 4] & 0xFF) << 24) + ((this.field1889[this.field1890 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.y(I)J")
    public long method2240() {
        long var1 = (long) this.method2239() & 0xFFFFFFFFL;
        long var3 = (long) this.method2239() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.c(I)Ljava/lang/String;")
    public String method2241() {
        if (this.field1889[this.field1890] == 0) {
            this.field1890++;
            return null;
        } else {
            return this.method2242();
        }
    }

    @ObfuscatedName("dl.g(I)Ljava/lang/String;")
    public String method2242() {
        int var1 = this.field1890;
        while (this.field1889[++this.field1890 - 1] != 0) {
        }
        int var2 = this.field1890 - var1 - 1;
        return var2 == 0 ? "" : class156.method2553(this.field1889, var1, var2);
    }

    @ObfuscatedName("dl.av(I)Ljava/lang/String;")
    public String method2243() {
        byte var1 = this.field1889[++this.field1890 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1890;
        while (this.field1889[++this.field1890 - 1] != 0) {
        }
        int var3 = this.field1890 - var2 - 1;
        return var3 == 0 ? "" : class156.method2553(this.field1889, var2, var3);
    }

    @ObfuscatedName("dl.ag(B)Ljava/lang/String;")
    public String method2386() {
        byte var1 = this.field1889[++this.field1890 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2440();
        if (this.field1890 + var2 > this.field1889.length) {
            throw new IllegalStateException("");
        }
        String var3 = class200.method3365(this.field1889, this.field1890, var2);
        this.field1890 += var2;
        return var3;
    }

    @ObfuscatedName("dl.aq([BIII)V")
    public void method2245(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1889[++this.field1890 - 1];
        }
    }

    @ObfuscatedName("dl.an(I)I")
    public int method2246() {
        int var1 = this.field1889[this.field1890] & 0xFF;
        return var1 < 128 ? this.method2234() - 64 : this.method2236() - 49152;
    }

    @ObfuscatedName("dl.ao(B)I")
    public int method2247() {
        int var1 = this.field1889[this.field1890] & 0xFF;
        return var1 < 128 ? this.method2234() : this.method2236() - 32768;
    }

    @ObfuscatedName("dl.aj(I)I")
    public int method2248() {
        return this.field1889[this.field1890] < 0 ? this.method2239() & Integer.MAX_VALUE : this.method2236();
    }

    @ObfuscatedName("dl.ax(I)I")
    public int method2440() {
        byte var1 = this.field1889[++this.field1890 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1889[++this.field1890 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.ac([II)V")
    public void method2250(int[] arg0) {
        int var2 = this.field1890 / 8;
        this.field1890 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2239();
            int var5 = this.method2239();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1890 -= 8;
            this.method2222(var4);
            this.method2222(var5);
        }
    }

    @ObfuscatedName("dl.al([IB)V")
    public void method2431(int[] arg0) {
        int var2 = this.field1890 / 8;
        this.field1890 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2239();
            int var5 = this.method2239();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1890 -= 8;
            this.method2222(var4);
            this.method2222(var5);
        }
    }

    @ObfuscatedName("dl.au([IIIB)V")
    public void method2252(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1890;
        this.field1890 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2239();
            int var8 = this.method2239();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1890 -= 8;
            this.method2222(var7);
            this.method2222(var8);
        }
        this.field1890 = var4;
    }

    @ObfuscatedName("dl.ap([IIIB)V")
    public void method2253(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1890;
        this.field1890 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2239();
            int var8 = this.method2239();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1890 -= 8;
            this.method2222(var7);
            this.method2222(var8);
        }
        this.field1890 = var4;
    }

    @ObfuscatedName("dl.ar(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2339(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1890;
        this.field1890 = 0;
        byte[] var4 = new byte[var3];
        this.method2245(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1890 = 0;
        this.method2220(var7.length);
        this.method2285(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.ah(IB)I")
    public int method2255(int arg0) {
        int var2 = method599(this.field1889, arg0, this.field1890);
        this.method2222(var2);
        return var2;
    }

    @ObfuscatedName("dl.ae(B)Z")
    public boolean method2451() {
        this.field1890 -= 4;
        int var1 = method599(this.field1889, 0, this.field1890);
        int var2 = this.method2239();
        return var1 == var2;
    }

    @ObfuscatedName("dl.ay(II)V")
    public void method2302(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.ab(IB)V")
    public void method2383(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dl.at(II)V")
    public void method2434(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.as(S)I")
    public int method2260() {
        return this.field1889[++this.field1890 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.af(I)I")
    public int method2261() {
        return -this.field1889[++this.field1890 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.aa(S)I")
    public int method2262() {
        return 128 - this.field1889[++this.field1890 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.ad(I)B")
    public byte method2263() {
        return (byte) (this.field1889[++this.field1890 - 1] - 128);
    }

    @ObfuscatedName("dl.ai(B)B")
    public byte method2409() {
        return (byte) (-this.field1889[++this.field1890 - 1]);
    }

    @ObfuscatedName("dl.aw(I)B")
    public byte method2265() {
        return (byte) (128 - this.field1889[++this.field1890 - 1]);
    }

    @ObfuscatedName("dl.ak(IB)V")
    public void method2266(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) arg0;
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.az(II)V")
    public void method2244(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.am(II)V")
    public void method2314(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 + 128);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bj(I)I")
    public int method2256() {
        this.field1890 += 2;
        return ((this.field1889[this.field1890 - 1] & 0xFF) << 8) + (this.field1889[this.field1890 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.bf(B)I")
    public int method2270() {
        this.field1890 += 2;
        return ((this.field1889[this.field1890 - 2] & 0xFF) << 8) + (this.field1889[this.field1890 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bb(B)I")
    public int method2380() {
        this.field1890 += 2;
        return ((this.field1889[this.field1890 - 1] & 0xFF) << 8) + (this.field1889[this.field1890 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bv(I)I")
    public int method2272() {
        this.field1890 += 2;
        int var1 = ((this.field1889[this.field1890 - 2] & 0xFF) << 8) + (this.field1889[this.field1890 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.bl(I)I")
    public int method2273() {
        this.field1890 += 2;
        int var1 = ((this.field1889[this.field1890 - 1] & 0xFF) << 8) + (this.field1889[this.field1890 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.bu(IS)V")
    public void method2321(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1890 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.bm(I)I")
    public int method2275() {
        this.field1890 += 3;
        return (this.field1889[this.field1890 - 2] & 0xFF) + ((this.field1889[this.field1890 - 3] & 0xFF) << 16) + ((this.field1889[this.field1890 - 1] & 0xFF) << 8);
    }

    @ObfuscatedName("dl.bo(IB)V")
    public void method2230(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) arg0;
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.ba(IB)V")
    public void method2416(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
        this.field1889[++this.field1890 - 1] = (byte) arg0;
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 24);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.by(II)V")
    public void method2278(int arg0) {
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 16);
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 24);
        this.field1889[++this.field1890 - 1] = (byte) arg0;
        this.field1889[++this.field1890 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bt(I)I")
    public int method2363() {
        this.field1890 += 4;
        return (this.field1889[this.field1890 - 4] & 0xFF) + ((this.field1889[this.field1890 - 3] & 0xFF) << 8) + ((this.field1889[this.field1890 - 1] & 0xFF) << 24) + ((this.field1889[this.field1890 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.bp(I)I")
    public int method2280() {
        this.field1890 += 4;
        return (this.field1889[this.field1890 - 3] & 0xFF) + ((this.field1889[this.field1890 - 4] & 0xFF) << 8) + ((this.field1889[this.field1890 - 1] & 0xFF) << 16) + ((this.field1889[this.field1890 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.bs(B)I")
    public int method2281() {
        this.field1890 += 4;
        return (this.field1889[this.field1890 - 2] & 0xFF) + ((this.field1889[this.field1890 - 1] & 0xFF) << 8) + ((this.field1889[this.field1890 - 4] & 0xFF) << 16) + ((this.field1889[this.field1890 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.bg([BIII)V")
    public void method2282(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = (byte) (this.field1889[++this.field1890 - 1] - 128);
        }
    }
}
