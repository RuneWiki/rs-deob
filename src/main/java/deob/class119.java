package deob;

import java.math.BigInteger;

@ObfuscatedName("da")
public class class119 extends class208 {

    @ObfuscatedName("da.z")
    public byte[] field1987;

    @ObfuscatedName("da.q")
    public int field1986;

    @ObfuscatedName("da.k")
    public static int[] field1985 = new int[256];

    @ObfuscatedName("da.d")
    public static long[] field1988;

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
            field1985[var0] = var1;
        }
        field1988 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1988[var3] = var4;
        }
    }

    @ObfuscatedName("cb.z([BII)I")
    public static int method1715(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ field1985[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    public class119(int arg0) {
        this.field1987 = class121.method2539(arg0);
        this.field1986 = 0;
    }

    public class119(byte[] arg0) {
        this.field1987 = arg0;
        this.field1986 = 0;
    }

    @ObfuscatedName("da.q(IB)V")
    public void method2285(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.k(II)V")
    public void method2287(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1986 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.f(IB)V")
    public void method2288(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1986 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.d(IB)V")
    public void method2289(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 24);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1986 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.l(J)V")
    public void method2290(long arg0) {
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1987[++this.field1986 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("da.r(J)V")
    public void method2351(long arg0) {
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1987[++this.field1986 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1987[++this.field1986 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dz.g(Ljava/lang/String;I)I")
    public static int method2618(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("da.h(Ljava/lang/String;I)V")
    public void method2393(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1986 += class165.method3(arg0, 0, arg0.length(), this.field1987, this.field1986);
        this.field1987[++this.field1986 - 1] = 0;
    }

    @ObfuscatedName("af.n(Ljava/lang/String;B)I")
    public static int method987(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("da.j(Ljava/lang/String;I)V")
    public void method2418(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1987[++this.field1986 - 1] = 0;
        this.field1986 += class165.method3(arg0, 0, arg0.length(), this.field1987, this.field1986);
        this.field1987[++this.field1986 - 1] = 0;
    }

    @ObfuscatedName("da.a(Ljava/lang/CharSequence;I)V")
    public void method2294(CharSequence arg0) {
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
        this.field1987[++this.field1986 - 1] = 0;
        this.method2300(var3);
        int var8 = this.field1986;
        byte[] var9 = this.field1987;
        int var10 = this.field1986;
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
        this.field1986 = var15 + var8;
    }

    @ObfuscatedName("da.b([BIII)V")
    public void method2295(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1987[++this.field1986 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("da.c(II)V")
    public void method2296(int arg0) {
        this.field1987[this.field1986 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1987[this.field1986 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1987[this.field1986 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1987[this.field1986 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.v(IB)V")
    public void method2453(int arg0) {
        this.field1987[this.field1986 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1987[this.field1986 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.p(II)V")
    public void method2298(int arg0) {
        this.field1987[this.field1986 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("da.i(II)V")
    public void method2292(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2285(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2287(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("da.t(II)V")
    public void method2300(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2285(arg0 >>> 28 | 0x80);
                    }
                    this.method2285(arg0 >>> 21 | 0x80);
                }
                this.method2285(arg0 >>> 14 | 0x80);
            }
            this.method2285(arg0 >>> 7 | 0x80);
        }
        this.method2285(arg0 & 0x7F);
    }

    @ObfuscatedName("da.u(B)I")
    public int method2457() {
        return this.field1987[++this.field1986 - 1] & 0xFF;
    }

    @ObfuscatedName("da.e(B)B")
    public byte method2423() {
        return this.field1987[++this.field1986 - 1];
    }

    @ObfuscatedName("da.m(I)I")
    public int method2415() {
        this.field1986 += 2;
        return ((this.field1987[this.field1986 - 2] & 0xFF) << 8) + (this.field1987[this.field1986 - 1] & 0xFF);
    }

    @ObfuscatedName("da.s(I)I")
    public int method2494() {
        this.field1986 += 2;
        int var1 = ((this.field1987[this.field1986 - 2] & 0xFF) << 8) + (this.field1987[this.field1986 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.x(I)I")
    public int method2305() {
        this.field1986 += 3;
        return (this.field1987[this.field1986 - 1] & 0xFF) + ((this.field1987[this.field1986 - 3] & 0xFF) << 16) + ((this.field1987[this.field1986 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("da.y(B)I")
    public int method2306() {
        this.field1986 += 4;
        return (this.field1987[this.field1986 - 1] & 0xFF) + ((this.field1987[this.field1986 - 2] & 0xFF) << 8) + ((this.field1987[this.field1986 - 3] & 0xFF) << 16) + ((this.field1987[this.field1986 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("da.w(I)J")
    public long method2307() {
        long var1 = (long) this.method2306() & 0xFFFFFFFFL;
        long var3 = (long) this.method2306() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("da.o(I)Ljava/lang/String;")
    public String method2481() {
        if (this.field1987[this.field1986] == 0) {
            this.field1986++;
            return null;
        } else {
            return this.method2309();
        }
    }

    @ObfuscatedName("da.aw(S)Ljava/lang/String;")
    public String method2309() {
        int var1 = this.field1986;
        while (this.field1987[++this.field1986 - 1] != 0) {
        }
        int var2 = this.field1986 - var1 - 1;
        return var2 == 0 ? "" : class165.method1882(this.field1987, var1, var2);
    }

    @ObfuscatedName("da.an(I)Ljava/lang/String;")
    public String method2310() {
        byte var1 = this.field1987[++this.field1986 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1986;
        while (this.field1987[++this.field1986 - 1] != 0) {
        }
        int var3 = this.field1986 - var2 - 1;
        return var3 == 0 ? "" : class165.method1882(this.field1987, var2, var3);
    }

    @ObfuscatedName("da.ab(I)Ljava/lang/String;")
    public String method2311() {
        byte var1 = this.field1987[++this.field1986 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2499();
        if (this.field1986 + var2 > this.field1987.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method2225(this.field1987, this.field1986, var2);
        this.field1986 += var2;
        return var3;
    }

    @ObfuscatedName("da.al([BIIB)V")
    public void method2312(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1987[++this.field1986 - 1];
        }
    }

    @ObfuscatedName("da.ay(B)I")
    public int method2390() {
        int var1 = this.field1987[this.field1986] & 0xFF;
        return var1 < 128 ? this.method2457() - 64 : this.method2415() - 49152;
    }

    @ObfuscatedName("da.aq(I)I")
    public int method2301() {
        int var1 = this.field1987[this.field1986] & 0xFF;
        return var1 < 128 ? this.method2457() : this.method2415() - 32768;
    }

    @ObfuscatedName("da.ac(I)I")
    public int method2315() {
        return this.field1987[this.field1986] < 0 ? this.method2306() & Integer.MAX_VALUE : this.method2415();
    }

    @ObfuscatedName("da.ak(B)I")
    public int method2499() {
        byte var1 = this.field1987[++this.field1986 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1987[++this.field1986 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("da.am([II)V")
    public void method2317(int[] arg0) {
        int var2 = this.field1986 / 8;
        this.field1986 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2306();
            int var5 = this.method2306();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1986 -= 8;
            this.method2289(var4);
            this.method2289(var5);
        }
    }

    @ObfuscatedName("da.aj([II)V")
    public void method2319(int[] arg0) {
        int var2 = this.field1986 / 8;
        this.field1986 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2306();
            int var5 = this.method2306();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1986 -= 8;
            this.method2289(var4);
            this.method2289(var5);
        }
    }

    @ObfuscatedName("da.au([IIII)V")
    public void method2421(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1986;
        this.field1986 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2306();
            int var8 = this.method2306();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1986 -= 8;
            this.method2289(var7);
            this.method2289(var8);
        }
        this.field1986 = var4;
    }

    @ObfuscatedName("da.av([IIIB)V")
    public void method2320(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1986;
        this.field1986 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2306();
            int var8 = this.method2306();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1986 -= 8;
            this.method2289(var7);
            this.method2289(var8);
        }
        this.field1986 = var4;
    }

    @ObfuscatedName("da.ad(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2321(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1986;
        this.field1986 = 0;
        byte[] var4 = new byte[var3];
        this.method2312(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1986 = 0;
        this.method2287(var7.length);
        this.method2295(var7, 0, var7.length);
    }

    @ObfuscatedName("da.ae(II)I")
    public int method2318(int arg0) {
        byte[] var2 = this.field1987;
        int var3 = this.field1986;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field1985[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2289(var6);
        return var6;
    }

    @ObfuscatedName("da.ai(I)Z")
    public boolean method2323() {
        this.field1986 -= 4;
        byte[] var1 = this.field1987;
        int var2 = this.field1986;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field1985[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2306();
        return var5 == var8;
    }

    @ObfuscatedName("da.at(II)V")
    public void method2454(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("da.ah(II)V")
    public void method2362(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("da.ao(II)V")
    public void method2326(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("da.aa(B)I")
    public int method2327() {
        return this.field1987[++this.field1986 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("da.ax(B)I")
    public int method2328() {
        return -this.field1987[++this.field1986 - 1] & 0xFF;
    }

    @ObfuscatedName("da.as(I)I")
    public int method2329() {
        return 128 - this.field1987[++this.field1986 - 1] & 0xFF;
    }

    @ObfuscatedName("da.ar(I)B")
    public byte method2330() {
        return (byte) (this.field1987[++this.field1986 - 1] - 128);
    }

    @ObfuscatedName("da.ap(II)V")
    public void method2373(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) arg0;
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("da.ag(II)V")
    public void method2332(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("da.af(IB)V")
    public void method2333(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 + 128);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("da.az(B)I")
    public int method2334() {
        this.field1986 += 2;
        return ((this.field1987[this.field1986 - 1] & 0xFF) << 8) + (this.field1987[this.field1986 - 2] & 0xFF);
    }

    @ObfuscatedName("da.bo(I)I")
    public int method2335() {
        this.field1986 += 2;
        return ((this.field1987[this.field1986 - 2] & 0xFF) << 8) + (this.field1987[this.field1986 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("da.bu(I)I")
    public int method2336() {
        this.field1986 += 2;
        return ((this.field1987[this.field1986 - 1] & 0xFF) << 8) + (this.field1987[this.field1986 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("da.bw(I)I")
    public int method2337() {
        this.field1986 += 2;
        int var1 = ((this.field1987[this.field1986 - 1] & 0xFF) << 8) + (this.field1987[this.field1986 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.bk(I)I")
    public int method2338() {
        this.field1986 += 2;
        int var1 = ((this.field1987[this.field1986 - 2] & 0xFF) << 8) + (this.field1987[this.field1986 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.bj(B)I")
    public int method2430() {
        this.field1986 += 2;
        int var1 = ((this.field1987[this.field1986 - 1] & 0xFF) << 8) + (this.field1987[this.field1986 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("da.bd(II)V")
    public void method2340(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) arg0;
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("da.bc(II)V")
    public void method2460(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
        this.field1987[++this.field1986 - 1] = (byte) arg0;
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 24);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("da.bb(II)V")
    public void method2342(int arg0) {
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 16);
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 24);
        this.field1987[++this.field1986 - 1] = (byte) arg0;
        this.field1987[++this.field1986 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("da.bl(I)I")
    public int method2343() {
        this.field1986 += 4;
        return (this.field1987[this.field1986 - 4] & 0xFF) + ((this.field1987[this.field1986 - 3] & 0xFF) << 8) + ((this.field1987[this.field1986 - 2] & 0xFF) << 16) + ((this.field1987[this.field1986 - 1] & 0xFF) << 24);
    }

    @ObfuscatedName("da.bp(I)I")
    public int method2344() {
        this.field1986 += 4;
        return (this.field1987[this.field1986 - 3] & 0xFF) + ((this.field1987[this.field1986 - 4] & 0xFF) << 8) + ((this.field1987[this.field1986 - 1] & 0xFF) << 16) + ((this.field1987[this.field1986 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("da.ba(B)I")
    public int method2379() {
        this.field1986 += 4;
        return (this.field1987[this.field1986 - 2] & 0xFF) + ((this.field1987[this.field1986 - 1] & 0xFF) << 8) + ((this.field1987[this.field1986 - 4] & 0xFF) << 16) + ((this.field1987[this.field1986 - 3] & 0xFF) << 24);
    }
}
