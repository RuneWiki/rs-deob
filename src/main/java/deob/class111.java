package deob;

import java.math.BigInteger;

@ObfuscatedName("dl")
public class class111 extends class199 {

    @ObfuscatedName("dl.n")
    public byte[] field1888;

    @ObfuscatedName("dl.d")
    public int field1889;

    @ObfuscatedName("dl.z")
    public static int[] field1890 = new int[256];

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
            field1890[var0] = var1;
        }
    }

    @ObfuscatedName("cq.n([BIS)I")
    public static int method1863(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1890[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class111(int arg0) {
        this.field1888 = class113.method2476(arg0);
        this.field1889 = 0;
    }

    public class111(byte[] arg0) {
        this.field1888 = arg0;
        this.field1889 = 0;
    }

    @ObfuscatedName("dl.d(IS)V")
    public void method2213(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.z(II)V")
    public void method2214(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.y(II)V")
    public void method2234(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 16);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.e(II)V")
    public void method2216(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 24);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 16);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.g(J)V")
    public void method2217(long arg0) {
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1888[++this.field1889 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dl.f(J)V")
    public void method2258(long arg0) {
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1888[++this.field1889 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1888[++this.field1889 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cl.m(Ljava/lang/String;B)I")
    public static int method2148(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dl.a(Ljava/lang/String;B)V")
    public void method2219(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1889 += class156.method2715(arg0, 0, arg0.length(), this.field1888, this.field1889);
        this.field1888[++this.field1889 - 1] = 0;
    }

    @ObfuscatedName("d.h(Ljava/lang/String;I)I")
    public static int method5(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dl.l(Ljava/lang/String;I)V")
    public void method2220(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1888[++this.field1889 - 1] = 0;
        this.field1889 += class156.method2715(arg0, 0, arg0.length(), this.field1888, this.field1889);
        this.field1888[++this.field1889 - 1] = 0;
    }

    @ObfuscatedName("dl.u(Ljava/lang/CharSequence;I)V")
    public void method2368(CharSequence arg0) {
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
        this.field1888[++this.field1889 - 1] = 0;
        this.method2227(var3);
        int var8 = this.field1889;
        byte[] var9 = this.field1888;
        int var10 = this.field1889;
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
        this.field1889 = var15 + var8;
    }

    @ObfuscatedName("dl.q([BIII)V")
    public void method2294(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1888[++this.field1889 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dl.k(II)V")
    public void method2223(int arg0) {
        this.field1888[this.field1889 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1888[this.field1889 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1888[this.field1889 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1888[this.field1889 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.x(II)V")
    public void method2321(int arg0) {
        this.field1888[this.field1889 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1888[this.field1889 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.r(IB)V")
    public void method2225(int arg0) {
        this.field1888[this.field1889 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.j(IB)V")
    public void method2397(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2213(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2214(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dl.s(IB)V")
    public void method2227(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2213(arg0 >>> 28 | 0x80);
                    }
                    this.method2213(arg0 >>> 21 | 0x80);
                }
                this.method2213(arg0 >>> 14 | 0x80);
            }
            this.method2213(arg0 >>> 7 | 0x80);
        }
        this.method2213(arg0 & 0x7F);
    }

    @ObfuscatedName("dl.v(I)I")
    public int method2228() {
        return this.field1888[++this.field1889 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.c(I)B")
    public byte method2409() {
        return this.field1888[++this.field1889 - 1];
    }

    @ObfuscatedName("dl.p(I)I")
    public int method2231() {
        this.field1889 += 2;
        return ((this.field1888[this.field1889 - 2] & 0xFF) << 8) + (this.field1888[this.field1889 - 1] & 0xFF);
    }

    @ObfuscatedName("dl.o(B)I")
    public int method2242() {
        this.field1889 += 2;
        int var1 = ((this.field1888[this.field1889 - 2] & 0xFF) << 8) + (this.field1888[this.field1889 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.b(I)I")
    public int method2232() {
        this.field1889 += 3;
        return (this.field1888[this.field1889 - 1] & 0xFF) + ((this.field1888[this.field1889 - 2] & 0xFF) << 8) + ((this.field1888[this.field1889 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.t(I)I")
    public int method2233() {
        this.field1889 += 4;
        return (this.field1888[this.field1889 - 1] & 0xFF) + ((this.field1888[this.field1889 - 2] & 0xFF) << 8) + ((this.field1888[this.field1889 - 4] & 0xFF) << 24) + ((this.field1888[this.field1889 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.w(I)J")
    public long method2412() {
        long var1 = (long) this.method2233() & 0xFFFFFFFFL;
        long var3 = (long) this.method2233() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dl.i(I)Ljava/lang/String;")
    public String method2235() {
        if (this.field1888[this.field1889] == 0) {
            this.field1889++;
            return null;
        } else {
            return this.method2290();
        }
    }

    @ObfuscatedName("dl.ad(B)Ljava/lang/String;")
    public String method2290() {
        int var1 = this.field1889;
        while (this.field1888[++this.field1889 - 1] != 0) {
        }
        int var2 = this.field1889 - var1 - 1;
        return var2 == 0 ? "" : class156.method647(this.field1888, var1, var2);
    }

    @ObfuscatedName("dl.ak(I)Ljava/lang/String;")
    public String method2237() {
        byte var1 = this.field1888[++this.field1889 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1889;
        while (this.field1888[++this.field1889 - 1] != 0) {
        }
        int var3 = this.field1889 - var2 - 1;
        return var3 == 0 ? "" : class156.method647(this.field1888, var2, var3);
    }

    @ObfuscatedName("dl.ae(B)Ljava/lang/String;")
    public String method2238() {
        byte var1 = this.field1888[++this.field1889 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2414();
        if (this.field1889 + var2 > this.field1888.length) {
            throw new IllegalStateException("");
        }
        String var3 = class200.method965(this.field1888, this.field1889, var2);
        this.field1889 += var2;
        return var3;
    }

    @ObfuscatedName("dl.ax([BIII)V")
    public void method2224(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1888[++this.field1889 - 1];
        }
    }

    @ObfuscatedName("dl.al(B)I")
    public int method2240() {
        int var1 = this.field1888[this.field1889] & 0xFF;
        return var1 < 128 ? this.method2228() - 64 : this.method2231() - 49152;
    }

    @ObfuscatedName("dl.ar(B)I")
    public int method2241() {
        int var1 = this.field1888[this.field1889] & 0xFF;
        return var1 < 128 ? this.method2228() : this.method2231() - 32768;
    }

    @ObfuscatedName("dl.as(I)I")
    public int method2272() {
        return this.field1888[this.field1889] < 0 ? this.method2233() & Integer.MAX_VALUE : this.method2231();
    }

    @ObfuscatedName("dl.ab(I)I")
    public int method2414() {
        byte var1 = this.field1888[++this.field1889 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1888[++this.field1889 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dl.ao([II)V")
    public void method2244(int[] arg0) {
        int var2 = this.field1889 / 8;
        this.field1889 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2233();
            int var5 = this.method2233();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1889 -= 8;
            this.method2216(var4);
            this.method2216(var5);
        }
    }

    @ObfuscatedName("dl.ac([IB)V")
    public void method2245(int[] arg0) {
        int var2 = this.field1889 / 8;
        this.field1889 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2233();
            int var5 = this.method2233();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1889 -= 8;
            this.method2216(var4);
            this.method2216(var5);
        }
    }

    @ObfuscatedName("dl.az([IIII)V")
    public void method2246(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1889;
        this.field1889 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2233();
            int var8 = this.method2233();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1889 -= 8;
            this.method2216(var7);
            this.method2216(var8);
        }
        this.field1889 = var4;
    }

    @ObfuscatedName("dl.at([IIIB)V")
    public void method2327(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1889;
        this.field1889 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2233();
            int var8 = this.method2233();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1889 -= 8;
            this.method2216(var7);
            this.method2216(var8);
        }
        this.field1889 = var4;
    }

    @ObfuscatedName("dl.aa(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2248(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1889;
        this.field1889 = 0;
        byte[] var4 = new byte[var3];
        this.method2224(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1889 = 0;
        this.method2214(var7.length);
        this.method2294(var7, 0, var7.length);
    }

    @ObfuscatedName("dl.an(IB)I")
    public int method2249(int arg0) {
        byte[] var2 = this.field1888;
        int var3 = this.field1889;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1890[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2216(var6);
        return var6;
    }

    @ObfuscatedName("dl.aw(B)Z")
    public boolean method2250() {
        this.field1889 -= 4;
        byte[] var1 = this.field1888;
        int var2 = this.field1889;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1890[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2233();
        return var5 == var8;
    }

    @ObfuscatedName("dl.ai(II)V")
    public void method2404(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.ah(II)V")
    public void method2252(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dl.aq(II)V")
    public void method2253(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dl.ay(I)I")
    public int method2254() {
        return this.field1888[++this.field1889 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dl.am(I)I")
    public int method2374() {
        return -this.field1888[++this.field1889 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.aj(B)I")
    public int method2256() {
        return 128 - this.field1888[++this.field1889 - 1] & 0xFF;
    }

    @ObfuscatedName("dl.ag(S)B")
    public byte method2307() {
        return (byte) (this.field1888[++this.field1889 - 1] - 128);
    }

    @ObfuscatedName("dl.ap(I)B")
    public byte method2437() {
        return (byte) (-this.field1888[++this.field1889 - 1]);
    }

    @ObfuscatedName("dl.af(S)B")
    public byte method2259() {
        return (byte) (128 - this.field1888[++this.field1889 - 1]);
    }

    @ObfuscatedName("dl.au(IB)V")
    public void method2280(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) arg0;
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.av(IB)V")
    public void method2261(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dl.bs(II)V")
    public void method2262(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 + 128);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bo(B)I")
    public int method2263() {
        this.field1889 += 2;
        return ((this.field1888[this.field1889 - 1] & 0xFF) << 8) + (this.field1888[this.field1889 - 2] & 0xFF);
    }

    @ObfuscatedName("dl.bw(I)I")
    public int method2221() {
        this.field1889 += 2;
        return ((this.field1888[this.field1889 - 2] & 0xFF) << 8) + (this.field1888[this.field1889 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bm(I)I")
    public int method2265() {
        this.field1889 += 2;
        return ((this.field1888[this.field1889 - 1] & 0xFF) << 8) + (this.field1888[this.field1889 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dl.bj(B)I")
    public int method2266() {
        this.field1889 += 2;
        int var1 = ((this.field1888[this.field1889 - 2] & 0xFF) << 8) + (this.field1888[this.field1889 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.ba(I)I")
    public int method2267() {
        this.field1889 += 2;
        int var1 = ((this.field1888[this.field1889 - 1] & 0xFF) << 8) + (this.field1888[this.field1889 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dl.br(II)V")
    public void method2268(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 16);
        this.field1888[++this.field1889 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dl.bd(IB)V")
    public void method2260(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) arg0;
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 16);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dl.bn(II)V")
    public void method2270(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
        this.field1888[++this.field1889 - 1] = (byte) arg0;
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 24);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dl.bu(II)V")
    public void method2271(int arg0) {
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 16);
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 24);
        this.field1888[++this.field1889 - 1] = (byte) arg0;
        this.field1888[++this.field1889 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dl.bq(B)I")
    public int method2413() {
        this.field1889 += 4;
        return (this.field1888[this.field1889 - 4] & 0xFF) + ((this.field1888[this.field1889 - 3] & 0xFF) << 8) + ((this.field1888[this.field1889 - 1] & 0xFF) << 24) + ((this.field1888[this.field1889 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.bp(B)I")
    public int method2273() {
        this.field1889 += 4;
        return (this.field1888[this.field1889 - 3] & 0xFF) + ((this.field1888[this.field1889 - 4] & 0xFF) << 8) + ((this.field1888[this.field1889 - 2] & 0xFF) << 24) + ((this.field1888[this.field1889 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dl.bt(B)I")
    public int method2405() {
        this.field1889 += 4;
        return (this.field1888[this.field1889 - 2] & 0xFF) + ((this.field1888[this.field1889 - 1] & 0xFF) << 8) + ((this.field1888[this.field1889 - 4] & 0xFF) << 16) + ((this.field1888[this.field1889 - 3] & 0xFF) << 24);
    }

    @ObfuscatedName("dl.bz([BIII)V")
    public void method2275(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = this.field1888[++this.field1889 - 1];
        }
    }

    @ObfuscatedName("dl.by([BIII)V")
    public void method2215(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
            arg0[var4] = (byte) (this.field1888[++this.field1889 - 1] - 128);
        }
    }
}
