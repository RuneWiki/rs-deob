package deob;

import java.math.BigInteger;

@ObfuscatedName("dc")
public class class119 extends class208 {

    @ObfuscatedName("dc.j")
    public byte[] field1981;

    @ObfuscatedName("dc.m")
    public int field1982;

    @ObfuscatedName("dc.f")
    public static int[] field1979 = new int[256];

    @ObfuscatedName("dc.u")
    public static long[] field1983;

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
            field1979[var0] = var1;
        }
        field1983 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field1983[var3] = var4;
        }
    }

    @ObfuscatedName("t.j([BIIB)I")
    public static int method135(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field1979[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    public class119(int arg0) {
        this.field1981 = class121.method2614(arg0);
        this.field1982 = 0;
    }

    public class119(byte[] arg0) {
        this.field1981 = arg0;
        this.field1982 = 0;
    }

    @ObfuscatedName("dc.m(IB)V")
    public void method2357(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.f(IB)V")
    public void method2358(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.l(IB)V")
    public void method2359(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.u(IB)V")
    public void method2360(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.a(J)V")
    public void method2495(long arg0) {
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1982 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dc.h(J)V")
    public void method2526(long arg0) {
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 56));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 48));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 40));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 32));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 24));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 16));
        this.field1981[++this.field1982 - 1] = (byte) ((int) (arg0 >> 8));
        this.field1981[++this.field1982 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("cv.i(Ljava/lang/String;I)I")
    public static int method2163(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.t(Ljava/lang/String;I)V")
    public void method2363(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1982 += class165.method715(arg0, 0, arg0.length(), this.field1981, this.field1982);
        this.field1981[++this.field1982 - 1] = 0;
    }

    @ObfuscatedName("dc.k(Ljava/lang/String;B)V")
    public void method2364(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field1981[++this.field1982 - 1] = 0;
        this.field1982 += class165.method715(arg0, 0, arg0.length(), this.field1981, this.field1982);
        this.field1981[++this.field1982 - 1] = 0;
    }

    @ObfuscatedName("dc.s(Ljava/lang/CharSequence;S)V")
    public void method2365(CharSequence arg0) {
        int var2 = class209.method125(arg0);
        this.field1981[++this.field1982 - 1] = 0;
        this.method2371(var2);
        this.field1982 += class209.method2971(this.field1981, this.field1982, arg0);
    }

    @ObfuscatedName("dc.w([BIIB)V")
    public void method2366(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field1981[++this.field1982 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dc.e(II)V")
    public void method2524(int arg0) {
        this.field1981[this.field1982 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field1981[this.field1982 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1981[this.field1982 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1982 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.z(II)V")
    public void method2555(int arg0) {
        this.field1981[this.field1982 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1981[this.field1982 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.p(II)V")
    public void method2369(int arg0) {
        this.field1981[this.field1982 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.r(II)V")
    public void method2370(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2357(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2358(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dc.g(IB)V")
    public void method2371(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2357(arg0 >>> 28 | 0x80);
                    }
                    this.method2357(arg0 >>> 21 | 0x80);
                }
                this.method2357(arg0 >>> 14 | 0x80);
            }
            this.method2357(arg0 >>> 7 | 0x80);
        }
        this.method2357(arg0 & 0x7F);
    }

    @ObfuscatedName("dc.n(I)I")
    public int method2372() {
        return this.field1981[++this.field1982 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.y(I)B")
    public byte method2373() {
        return this.field1981[++this.field1982 - 1];
    }

    @ObfuscatedName("dc.v(I)I")
    public int method2374() {
        this.field1982 += 2;
        return ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + (this.field1981[this.field1982 - 1] & 0xFF);
    }

    @ObfuscatedName("dc.q(B)I")
    public int method2375() {
        this.field1982 += 2;
        int var1 = ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + (this.field1981[this.field1982 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.x(S)I")
    public int method2376() {
        this.field1982 += 3;
        return (this.field1981[this.field1982 - 1] & 0xFF) + ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + ((this.field1981[this.field1982 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.d(B)I")
    public int method2377() {
        this.field1982 += 4;
        return (this.field1981[this.field1982 - 1] & 0xFF) + ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + ((this.field1981[this.field1982 - 3] & 0xFF) << 16) + ((this.field1981[this.field1982 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.o(S)J")
    public long method2570() {
        long var1 = (long) this.method2377() & 0xFFFFFFFFL;
        long var3 = (long) this.method2377() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dc.c(I)Ljava/lang/String;")
    public String method2379() {
        if (this.field1981[this.field1982] == 0) {
            this.field1982++;
            return null;
        } else {
            return this.method2380();
        }
    }

    @ObfuscatedName("dc.b(B)Ljava/lang/String;")
    public String method2380() {
        int var1 = this.field1982;
        while (this.field1981[++this.field1982 - 1] != 0) {
        }
        int var2 = this.field1982 - var1 - 1;
        return var2 == 0 ? "" : class165.method3042(this.field1981, var1, var2);
    }

    @ObfuscatedName("dc.aa(S)Ljava/lang/String;")
    public String method2398() {
        byte var1 = this.field1981[++this.field1982 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field1982;
        while (this.field1981[++this.field1982 - 1] != 0) {
        }
        int var3 = this.field1982 - var2 - 1;
        return var3 == 0 ? "" : class165.method3042(this.field1981, var2, var3);
    }

    @ObfuscatedName("dc.ao(I)Ljava/lang/String;")
    public String method2551() {
        byte var1 = this.field1981[++this.field1982 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2492();
        if (this.field1982 + var2 > this.field1981.length) {
            throw new IllegalStateException("");
        }
        String var3 = class209.method1004(this.field1981, this.field1982, var2);
        this.field1982 += var2;
        return var3;
    }

    @ObfuscatedName("dc.as([BIII)V")
    public void method2382(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field1981[++this.field1982 - 1];
        }
    }

    @ObfuscatedName("dc.ae(B)I")
    public int method2502() {
        int var1 = this.field1981[this.field1982] & 0xFF;
        return var1 < 128 ? this.method2372() - 64 : this.method2374() - 49152;
    }

    @ObfuscatedName("dc.ai(I)I")
    public int method2384() {
        int var1 = this.field1981[this.field1982] & 0xFF;
        return var1 < 128 ? this.method2372() : this.method2374() - 32768;
    }

    @ObfuscatedName("dc.am(I)I")
    public int method2429() {
        return this.field1981[this.field1982] < 0 ? this.method2377() & Integer.MAX_VALUE : this.method2374();
    }

    @ObfuscatedName("dc.ax(I)I")
    public int method2492() {
        byte var1 = this.field1981[++this.field1982 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field1981[++this.field1982 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dc.ay([II)V")
    public void method2387(int[] arg0) {
        int var2 = this.field1982 / 8;
        this.field1982 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2377();
            int var5 = this.method2377();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field1982 -= 8;
            this.method2360(var4);
            this.method2360(var5);
        }
    }

    @ObfuscatedName("dc.az([II)V")
    public void method2428(int[] arg0) {
        int var2 = this.field1982 / 8;
        this.field1982 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2377();
            int var5 = this.method2377();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field1982 -= 8;
            this.method2360(var4);
            this.method2360(var5);
        }
    }

    @ObfuscatedName("dc.av([IIII)V")
    public void method2525(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1982;
        this.field1982 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2377();
            int var8 = this.method2377();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field1982 -= 8;
            this.method2360(var7);
            this.method2360(var8);
        }
        this.field1982 = var4;
    }

    @ObfuscatedName("dc.ap([IIII)V")
    public void method2390(int[] arg0, int arg1, int arg2) {
        int var4 = this.field1982;
        this.field1982 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2377();
            int var8 = this.method2377();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field1982 -= 8;
            this.method2360(var7);
            this.method2360(var8);
        }
        this.field1982 = var4;
    }

    @ObfuscatedName("dc.at(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2391(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field1982;
        this.field1982 = 0;
        byte[] var4 = new byte[var3];
        this.method2382(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field1982 = 0;
        this.method2358(var7.length);
        this.method2366(var7, 0, var7.length);
    }

    @ObfuscatedName("dc.al(II)I")
    public int method2392(int arg0) {
        int var2 = method135(this.field1981, arg0, this.field1982);
        this.method2360(var2);
        return var2;
    }

    @ObfuscatedName("dc.ac(I)Z")
    public boolean method2393() {
        this.field1982 -= 4;
        int var1 = method135(this.field1981, 0, this.field1982);
        int var2 = this.method2377();
        return var1 == var2;
    }

    @ObfuscatedName("dc.ar(II)V")
    public void method2394(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.ah(II)V")
    public void method2503(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dc.ak(II)V")
    public void method2468(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dc.ag(I)I")
    public int method2397() {
        return this.field1981[++this.field1982 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dc.aq(I)I")
    public int method2395() {
        return -this.field1981[++this.field1982 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.au(I)I")
    public int method2399() {
        return 128 - this.field1981[++this.field1982 - 1] & 0xFF;
    }

    @ObfuscatedName("dc.aw(I)B")
    public byte method2400() {
        return (byte) (this.field1981[++this.field1982 - 1] - 128);
    }

    @ObfuscatedName("dc.ad(I)B")
    public byte method2573() {
        return (byte) (-this.field1981[++this.field1982 - 1]);
    }

    @ObfuscatedName("dc.af(I)B")
    public byte method2402() {
        return (byte) (128 - this.field1981[++this.field1982 - 1]);
    }

    @ObfuscatedName("dc.aj(II)V")
    public void method2403(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) arg0;
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.ab(IS)V")
    public void method2383(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dc.an(II)V")
    public void method2566(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 + 128);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.bj(I)I")
    public int method2406() {
        this.field1982 += 2;
        return ((this.field1981[this.field1982 - 1] & 0xFF) << 8) + (this.field1981[this.field1982 - 2] & 0xFF);
    }

    @ObfuscatedName("dc.bn(I)I")
    public int method2407() {
        this.field1982 += 2;
        return ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + (this.field1981[this.field1982 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bf(I)I")
    public int method2408() {
        this.field1982 += 2;
        return ((this.field1981[this.field1982 - 1] & 0xFF) << 8) + (this.field1981[this.field1982 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dc.bm(B)I")
    public int method2409() {
        this.field1982 += 2;
        int var1 = ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + (this.field1981[this.field1982 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bc(I)I")
    public int method2410() {
        this.field1982 += 2;
        int var1 = ((this.field1981[this.field1982 - 1] & 0xFF) << 8) + (this.field1981[this.field1982 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dc.bu(II)V")
    public void method2411(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1982 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dc.ba(I)I")
    public int method2412() {
        this.field1982 += 3;
        return (this.field1981[this.field1982 - 3] & 0xFF) + ((this.field1981[this.field1982 - 2] & 0xFF) << 8) + ((this.field1981[this.field1982 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bi(II)V")
    public void method2413(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) arg0;
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dc.bq(IB)V")
    public void method2414(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
        this.field1981[++this.field1982 - 1] = (byte) arg0;
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dc.bk(IB)V")
    public void method2465(int arg0) {
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 16);
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 24);
        this.field1981[++this.field1982 - 1] = (byte) arg0;
        this.field1981[++this.field1982 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dc.be(B)I")
    public int method2416() {
        this.field1982 += 4;
        return (this.field1981[this.field1982 - 4] & 0xFF) + ((this.field1981[this.field1982 - 3] & 0xFF) << 8) + ((this.field1981[this.field1982 - 1] & 0xFF) << 24) + ((this.field1981[this.field1982 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dc.bl(B)I")
    public int method2417() {
        this.field1982 += 4;
        return (this.field1981[this.field1982 - 3] & 0xFF) + ((this.field1981[this.field1982 - 4] & 0xFF) << 8) + ((this.field1981[this.field1982 - 1] & 0xFF) << 16) + ((this.field1981[this.field1982 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dc.bg(B)I")
    public int method2499() {
        this.field1982 += 4;
        return (this.field1981[this.field1982 - 2] & 0xFF) + ((this.field1981[this.field1982 - 1] & 0xFF) << 8) + ((this.field1981[this.field1982 - 3] & 0xFF) << 24) + ((this.field1981[this.field1982 - 4] & 0xFF) << 16);
    }
}
