package deob;

import java.math.BigInteger;

@ObfuscatedName("dp")
public class class123 extends class212 {

    @ObfuscatedName("dp.x")
    public byte[] field2056;

    @ObfuscatedName("dp.r")
    public int field2057;

    @ObfuscatedName("dp.j")
    public static int[] field2051 = new int[256];

    @ObfuscatedName("dp.i")
    public static long[] field2055;

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
            field2051[var0] = var1;
        }
        field2055 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2055[var3] = var4;
        }
    }

    @ObfuscatedName("q.x([BIIS)I")
    public static int method147(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ field2051[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("i.r([BIB)I")
    public static int method47(byte[] arg0, int arg1) {
        return method147(arg0, 0, arg1);
    }

    public class123(int arg0) {
        this.field2056 = class125.method2664(arg0);
        this.field2057 = 0;
    }

    public class123(byte[] arg0) {
        this.field2056 = arg0;
        this.field2057 = 0;
    }

    @ObfuscatedName("dp.j(II)V")
    public void method2567(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.z(II)V")
    public void method2394(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.i(II)V")
    public void method2594(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.b(II)V")
    public void method2396(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 24);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.l(J)V")
    public void method2397(long arg0) {
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2056[++this.field2057 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dp.m(J)V")
    public void method2398(long arg0) {
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2056[++this.field2057 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2056[++this.field2057 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("aw.p(Ljava/lang/String;I)I")
    public static int method826(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dp.f(Ljava/lang/String;I)V")
    public void method2468(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2057 += class169.method701(arg0, 0, arg0.length(), this.field2056, this.field2057);
        this.field2056[++this.field2057 - 1] = 0;
    }

    @ObfuscatedName("dp.d(Ljava/lang/String;B)V")
    public void method2510(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2056[++this.field2057 - 1] = 0;
        this.field2057 += class169.method701(arg0, 0, arg0.length(), this.field2056, this.field2057);
        this.field2056[++this.field2057 - 1] = 0;
    }

    @ObfuscatedName("dp.v(Ljava/lang/CharSequence;I)V")
    public void method2590(CharSequence arg0) {
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
        this.field2056[++this.field2057 - 1] = 0;
        this.method2512(var3);
        int var8 = this.field2057;
        byte[] var9 = this.field2056;
        int var10 = this.field2057;
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
        this.field2057 = var15 + var8;
    }

    @ObfuscatedName("dp.q([BIIS)V")
    public void method2402(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2056[++this.field2057 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dp.t(IS)V")
    public void method2447(int arg0) {
        this.field2056[this.field2057 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2056[this.field2057 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2056[this.field2057 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2056[this.field2057 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.g(II)V")
    public void method2404(int arg0) {
        this.field2056[this.field2057 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2056[this.field2057 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.s(II)V")
    public void method2405(int arg0) {
        this.field2056[this.field2057 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.h(IB)V")
    public void method2406(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2567(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2394(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dp.u(II)V")
    public void method2512(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2567(arg0 >>> 28 | 0x80);
                    }
                    this.method2567(arg0 >>> 21 | 0x80);
                }
                this.method2567(arg0 >>> 14 | 0x80);
            }
            this.method2567(arg0 >>> 7 | 0x80);
        }
        this.method2567(arg0 & 0x7F);
    }

    @ObfuscatedName("dp.a(I)I")
    public int method2408() {
        return this.field2056[++this.field2057 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.e(I)B")
    public byte method2409() {
        return this.field2056[++this.field2057 - 1];
    }

    @ObfuscatedName("dp.c(I)I")
    public int method2403() {
        this.field2057 += 2;
        return ((this.field2056[this.field2057 - 2] & 0xFF) << 8) + (this.field2056[this.field2057 - 1] & 0xFF);
    }

    @ObfuscatedName("dp.n(I)I")
    public int method2611() {
        this.field2057 += 2;
        int var1 = ((this.field2056[this.field2057 - 2] & 0xFF) << 8) + (this.field2056[this.field2057 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.y(S)I")
    public int method2412() {
        this.field2057 += 3;
        return (this.field2056[this.field2057 - 1] & 0xFF) + ((this.field2056[this.field2057 - 3] & 0xFF) << 16) + ((this.field2056[this.field2057 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dp.k(B)I")
    public int method2413() {
        this.field2057 += 4;
        return (this.field2056[this.field2057 - 1] & 0xFF) + ((this.field2056[this.field2057 - 2] & 0xFF) << 8) + ((this.field2056[this.field2057 - 3] & 0xFF) << 16) + ((this.field2056[this.field2057 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.w(I)J")
    public long method2414() {
        long var1 = (long) this.method2413() & 0xFFFFFFFFL;
        long var3 = (long) this.method2413() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dp.o(I)Ljava/lang/String;")
    public String method2415() {
        if (this.field2056[this.field2057] == 0) {
            this.field2057++;
            return null;
        } else {
            return this.method2626();
        }
    }

    @ObfuscatedName("dp.ah(B)Ljava/lang/String;")
    public String method2626() {
        int var1 = this.field2057;
        while (this.field2056[++this.field2057 - 1] != 0) {
        }
        int var2 = this.field2057 - var1 - 1;
        return var2 == 0 ? "" : class169.method162(this.field2056, var1, var2);
    }

    @ObfuscatedName("dp.an(I)Ljava/lang/String;")
    public String method2487() {
        byte var1 = this.field2056[++this.field2057 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2057;
        while (this.field2056[++this.field2057 - 1] != 0) {
        }
        int var3 = this.field2057 - var2 - 1;
        return var3 == 0 ? "" : class169.method162(this.field2056, var2, var3);
    }

    @ObfuscatedName("dp.ag(B)Ljava/lang/String;")
    public String method2407() {
        byte var1 = this.field2056[++this.field2057 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2589();
        if (this.field2057 + var2 > this.field2056.length) {
            throw new IllegalStateException("");
        }
        String var3 = class213.method3333(this.field2056, this.field2057, var2);
        this.field2057 += var2;
        return var3;
    }

    @ObfuscatedName("dp.as([BIII)V")
    public void method2419(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2056[++this.field2057 - 1];
        }
    }

    @ObfuscatedName("dp.aq(I)I")
    public int method2420() {
        int var1 = this.field2056[this.field2057] & 0xFF;
        return var1 < 128 ? this.method2408() - 64 : this.method2403() - 49152;
    }

    @ObfuscatedName("dp.ax(I)I")
    public int method2421() {
        int var1 = this.field2056[this.field2057] & 0xFF;
        return var1 < 128 ? this.method2408() : this.method2403() - 32768;
    }

    @ObfuscatedName("dp.az(I)I")
    public int method2416() {
        return this.field2056[this.field2057] < 0 ? this.method2413() & Integer.MAX_VALUE : this.method2403();
    }

    @ObfuscatedName("dp.ap(I)I")
    public int method2423() {
        if (this.field2056[this.field2057] < 0) {
            return this.method2413() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2403();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("dp.ao(I)I")
    public int method2589() {
        byte var1 = this.field2056[++this.field2057 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2056[++this.field2057 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dp.af([II)V")
    public void method2425(int[] arg0) {
        int var2 = this.field2057 / 8;
        this.field2057 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2413();
            int var5 = this.method2413();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2057 -= 8;
            this.method2396(var4);
            this.method2396(var5);
        }
    }

    @ObfuscatedName("dp.au([IB)V")
    public void method2426(int[] arg0) {
        int var2 = this.field2057 / 8;
        this.field2057 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2413();
            int var5 = this.method2413();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2057 -= 8;
            this.method2396(var4);
            this.method2396(var5);
        }
    }

    @ObfuscatedName("dp.ab([IIIB)V")
    public void method2411(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2057;
        this.field2057 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2413();
            int var8 = this.method2413();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2057 -= 8;
            this.method2396(var7);
            this.method2396(var8);
        }
        this.field2057 = var4;
    }

    @ObfuscatedName("dp.at([IIII)V")
    public void method2428(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2057;
        this.field2057 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2413();
            int var8 = this.method2413();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2057 -= 8;
            this.method2396(var7);
            this.method2396(var8);
        }
        this.field2057 = var4;
    }

    @ObfuscatedName("dp.ay(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method2429(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2057;
        this.field2057 = 0;
        byte[] var4 = new byte[var3];
        this.method2419(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2057 = 0;
        this.method2394(var7.length);
        this.method2402(var7, 0, var7.length);
    }

    @ObfuscatedName("dp.ad(II)I")
    public int method2430(int arg0) {
        int var2 = method147(this.field2056, arg0, this.field2057);
        this.method2396(var2);
        return var2;
    }

    @ObfuscatedName("dp.am(I)Z")
    public boolean method2431() {
        this.field2057 -= 4;
        int var1 = method147(this.field2056, 0, this.field2057);
        int var2 = this.method2413();
        return var1 == var2;
    }

    @ObfuscatedName("dp.ac(IB)V")
    public void method2432(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.aw(II)V")
    public void method2610(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dp.ak(II)V")
    public void method2434(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dp.ar(I)I")
    public int method2435() {
        return this.field2056[++this.field2057 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dp.aa(I)I")
    public int method2604() {
        return -this.field2056[++this.field2057 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.av(I)I")
    public int method2451() {
        return 128 - this.field2056[++this.field2057 - 1] & 0xFF;
    }

    @ObfuscatedName("dp.aj(B)B")
    public byte method2538() {
        return (byte) (this.field2056[++this.field2057 - 1] - 128);
    }

    @ObfuscatedName("dp.al(I)B")
    public byte method2438() {
        return (byte) (-this.field2056[++this.field2057 - 1]);
    }

    @ObfuscatedName("dp.ai(I)B")
    public byte method2439() {
        return (byte) (128 - this.field2056[++this.field2057 - 1]);
    }

    @ObfuscatedName("dp.ae(II)V")
    public void method2440(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) arg0;
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bf(IS)V")
    public void method2441(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dp.bx(II)V")
    public void method2513(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 + 128);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bh(B)I")
    public int method2443() {
        this.field2057 += 2;
        return ((this.field2056[this.field2057 - 1] & 0xFF) << 8) + (this.field2056[this.field2057 - 2] & 0xFF);
    }

    @ObfuscatedName("dp.bw(I)I")
    public int method2444() {
        this.field2057 += 2;
        return ((this.field2056[this.field2057 - 2] & 0xFF) << 8) + (this.field2056[this.field2057 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bg(B)I")
    public int method2445() {
        this.field2057 += 2;
        return ((this.field2056[this.field2057 - 1] & 0xFF) << 8) + (this.field2056[this.field2057 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dp.bu(S)I")
    public int method2446() {
        this.field2057 += 2;
        int var1 = ((this.field2056[this.field2057 - 2] & 0xFF) << 8) + (this.field2056[this.field2057 - 1] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bq(I)I")
    public int method2454() {
        this.field2057 += 2;
        int var1 = ((this.field2056[this.field2057 - 1] & 0xFF) << 8) + (this.field2056[this.field2057 - 2] - 128 & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dp.bb(II)V")
    public void method2448(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2057 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dp.bz(B)I")
    public int method2437() {
        this.field2057 += 3;
        return (this.field2056[this.field2057 - 2] & 0xFF) + ((this.field2056[this.field2057 - 1] & 0xFF) << 8) + ((this.field2056[this.field2057 - 3] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bk(IB)V")
    public void method2585(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) arg0;
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dp.bl(II)V")
    public void method2427(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
        this.field2056[++this.field2057 - 1] = (byte) arg0;
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 24);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dp.be(II)V")
    public void method2574(int arg0) {
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 16);
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 24);
        this.field2056[++this.field2057 - 1] = (byte) arg0;
        this.field2056[++this.field2057 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dp.bp(I)I")
    public int method2453() {
        this.field2057 += 4;
        return (this.field2056[this.field2057 - 4] & 0xFF) + ((this.field2056[this.field2057 - 3] & 0xFF) << 8) + ((this.field2056[this.field2057 - 1] & 0xFF) << 24) + ((this.field2056[this.field2057 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dp.bn(I)I")
    public int method2579() {
        this.field2057 += 4;
        return (this.field2056[this.field2057 - 3] & 0xFF) + ((this.field2056[this.field2057 - 4] & 0xFF) << 8) + ((this.field2056[this.field2057 - 1] & 0xFF) << 16) + ((this.field2056[this.field2057 - 2] & 0xFF) << 24);
    }

    @ObfuscatedName("dp.bc(I)I")
    public int method2455() {
        this.field2057 += 4;
        return (this.field2056[this.field2057 - 2] & 0xFF) + ((this.field2056[this.field2057 - 1] & 0xFF) << 8) + ((this.field2056[this.field2057 - 4] & 0xFF) << 16) + ((this.field2056[this.field2057 - 3] & 0xFF) << 24);
    }
}
