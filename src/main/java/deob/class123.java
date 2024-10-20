package deob;

import java.math.BigInteger;

@ObfuscatedName("dx")
public class class123 extends class212 {

    @ObfuscatedName("dx.f")
    public byte[] field2053;

    @ObfuscatedName("dx.e")
    public int field2052;

    @ObfuscatedName("dx.n")
    public static int[] field2056 = new int[256];

    @ObfuscatedName("dx.v")
    public static long[] field2054;

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
            field2056[var0] = var1;
        }
        field2054 = new long[256];
        for (int var3 = 0; var3 < 256; var3++) {
            long var4 = (long) var3;
            for (int var6 = 0; var6 < 8; var6++) {
                if ((var4 & 0x1L) == 1L) {
                    var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var4 >>>= 0x1;
                }
            }
            field2054[var3] = var4;
        }
    }

    public class123(int arg0) {
        this.field2053 = class125.method2629(arg0);
        this.field2052 = 0;
    }

    public class123(byte[] arg0) {
        this.field2053 = arg0;
        this.field2052 = 0;
    }

    @ObfuscatedName("dx.f(II)V")
    public void method2384(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.e(II)V")
    public void method2385(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2053[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.n(IB)V")
    public void method2386(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2053[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.t(II)V")
    public void method2387(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 24);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2053[++this.field2052 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.v(J)V")
    public void method2388(long arg0) {
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2053[++this.field2052 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("dx.b(J)V")
    public void method2389(long arg0) {
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 56));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 48));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 40));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 32));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 24));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 16));
        this.field2053[++this.field2052 - 1] = (byte) ((int) (arg0 >> 8));
        this.field2053[++this.field2052 - 1] = (byte) ((int) arg0);
    }

    @ObfuscatedName("be.m(Ljava/lang/String;B)I")
    public static int method1542(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dx.k(Ljava/lang/String;B)V")
    public void method2390(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2052 += class169.method79(arg0, 0, arg0.length(), this.field2053, this.field2052);
        this.field2053[++this.field2052 - 1] = 0;
    }

    @ObfuscatedName("ah.c(Ljava/lang/String;B)I")
    public static int method648(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("dx.w(Ljava/lang/String;B)V")
    public void method2391(String arg0) {
        int var2 = arg0.indexOf(0);
        if (var2 >= 0) {
            throw new IllegalArgumentException("");
        }
        this.field2053[++this.field2052 - 1] = 0;
        this.field2052 += class169.method79(arg0, 0, arg0.length(), this.field2053, this.field2052);
        this.field2053[++this.field2052 - 1] = 0;
    }

    @ObfuscatedName("dx.l(Ljava/lang/CharSequence;B)V")
    public void method2418(CharSequence arg0) {
        int var2 = class213.method4(arg0);
        this.field2053[++this.field2052 - 1] = 0;
        this.method2398(var2);
        int var3 = this.field2052;
        byte[] var4 = this.field2053;
        int var5 = this.field2052;
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
        this.field2052 = var10 + var3;
    }

    @ObfuscatedName("dx.h([BIIS)V")
    public void method2393(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            this.field2053[++this.field2052 - 1] = arg0[var4];
        }
    }

    @ObfuscatedName("dx.i(II)V")
    public void method2512(int arg0) {
        this.field2053[this.field2052 - arg0 - 4] = (byte) (arg0 >> 24);
        this.field2053[this.field2052 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field2053[this.field2052 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2053[this.field2052 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.u(IB)V")
    public void method2395(int arg0) {
        this.field2053[this.field2052 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field2053[this.field2052 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.x(II)V")
    public void method2396(int arg0) {
        this.field2053[this.field2052 - arg0 - 1] = (byte) arg0;
    }

    @ObfuscatedName("dx.d(IS)V")
    public void method2578(int arg0) {
        if (arg0 >= 0 && arg0 < 128) {
            this.method2384(arg0);
        } else if (arg0 >= 0 && arg0 < 32768) {
            this.method2385(arg0 + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dx.o(II)V")
    public void method2398(int arg0) {
        if ((arg0 & 0xFFFFFF80) != 0) {
            if ((arg0 & 0xFFFFC000) != 0) {
                if ((arg0 & 0xFFE00000) != 0) {
                    if ((arg0 & 0xF0000000) != 0) {
                        this.method2384(arg0 >>> 28 | 0x80);
                    }
                    this.method2384(arg0 >>> 21 | 0x80);
                }
                this.method2384(arg0 >>> 14 | 0x80);
            }
            this.method2384(arg0 >>> 7 | 0x80);
        }
        this.method2384(arg0 & 0x7F);
    }

    @ObfuscatedName("dx.j(I)I")
    public int method2522() {
        return this.field2053[++this.field2052 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.q(I)B")
    public byte method2400() {
        return this.field2053[++this.field2052 - 1];
    }

    @ObfuscatedName("dx.r(I)I")
    public int method2401() {
        this.field2052 += 2;
        return ((this.field2053[this.field2052 - 2] & 0xFF) << 8) + (this.field2053[this.field2052 - 1] & 0xFF);
    }

    @ObfuscatedName("dx.a(B)I")
    public int method2499() {
        this.field2052 += 2;
        int var1 = ((this.field2053[this.field2052 - 2] & 0xFF) << 8) + (this.field2053[this.field2052 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.z(B)I")
    public int method2403() {
        this.field2052 += 3;
        return (this.field2053[this.field2052 - 1] & 0xFF) + ((this.field2053[this.field2052 - 3] & 0xFF) << 16) + ((this.field2053[this.field2052 - 2] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.p(I)I")
    public int method2404() {
        this.field2052 += 4;
        return (this.field2053[this.field2052 - 1] & 0xFF) + ((this.field2053[this.field2052 - 2] & 0xFF) << 8) + ((this.field2053[this.field2052 - 3] & 0xFF) << 16) + ((this.field2053[this.field2052 - 4] & 0xFF) << 24);
    }

    @ObfuscatedName("dx.y(B)J")
    public long method2405() {
        long var1 = (long) this.method2404() & 0xFFFFFFFFL;
        long var3 = (long) this.method2404() & 0xFFFFFFFFL;
        return (var1 << 32) + var3;
    }

    @ObfuscatedName("dx.s(I)Ljava/lang/String;")
    public String method2406() {
        if (this.field2053[this.field2052] == 0) {
            this.field2052++;
            return null;
        } else {
            return this.method2407();
        }
    }

    @ObfuscatedName("dx.g(I)Ljava/lang/String;")
    public String method2407() {
        int var1 = this.field2052;
        while (this.field2053[++this.field2052 - 1] != 0) {
        }
        int var2 = this.field2052 - var1 - 1;
        return var2 == 0 ? "" : class169.method159(this.field2053, var1, var2);
    }

    @ObfuscatedName("dx.aj(I)Ljava/lang/String;")
    public String method2383() {
        byte var1 = this.field2053[++this.field2052 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.field2052;
        while (this.field2053[++this.field2052 - 1] != 0) {
        }
        int var3 = this.field2052 - var2 - 1;
        return var3 == 0 ? "" : class169.method159(this.field2053, var2, var3);
    }

    @ObfuscatedName("dx.ay(B)Ljava/lang/String;")
    public String method2478() {
        byte var1 = this.field2053[++this.field2052 - 1];
        if (var1 != 0) {
            throw new IllegalStateException("");
        }
        int var2 = this.method2562();
        if (this.field2052 + var2 > this.field2053.length) {
            throw new IllegalStateException("");
        }
        String var3 = class213.method3077(this.field2053, this.field2052, var2);
        this.field2052 += var2;
        return var3;
    }

    @ObfuscatedName("dx.ah([BIIB)V")
    public void method2564(byte[] arg0, int arg1, int arg2) {
        for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
            arg0[var4] = this.field2053[++this.field2052 - 1];
        }
    }

    @ObfuscatedName("dx.ax(I)I")
    public int method2415() {
        int var1 = this.field2053[this.field2052] & 0xFF;
        return var1 < 128 ? this.method2522() - 64 : this.method2401() - 49152;
    }

    @ObfuscatedName("dx.ar(B)I")
    public int method2412() {
        int var1 = this.field2053[this.field2052] & 0xFF;
        return var1 < 128 ? this.method2522() : this.method2401() - 32768;
    }

    @ObfuscatedName("dx.ae(I)I")
    public int method2413() {
        return this.field2053[this.field2052] < 0 ? this.method2404() & Integer.MAX_VALUE : this.method2401();
    }

    @ObfuscatedName("dx.ac(I)I")
    public int method2502() {
        if (this.field2053[this.field2052] < 0) {
            return this.method2404() & Integer.MAX_VALUE;
        } else {
            int var1 = this.method2401();
            return var1 == 32767 ? -1 : var1;
        }
    }

    @ObfuscatedName("dx.aw(B)I")
    public int method2562() {
        byte var1 = this.field2053[++this.field2052 - 1];
        int var2 = 0;
        while (var1 < 0) {
            var2 = (var2 | var1 & 0x7F) << 7;
            var1 = this.field2053[++this.field2052 - 1];
        }
        return var2 | var1;
    }

    @ObfuscatedName("dx.am([II)V")
    public void method2416(int[] arg0) {
        int var2 = this.field2052 / 8;
        this.field2052 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2404();
            int var5 = this.method2404();
            int var6 = 0;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
                var6 += var7;
                var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
            }
            this.field2052 -= 8;
            this.method2387(var4);
            this.method2387(var5);
        }
    }

    @ObfuscatedName("dx.aq([II)V")
    public void method2417(int[] arg0) {
        int var2 = this.field2052 / 8;
        this.field2052 = 0;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.method2404();
            int var5 = this.method2404();
            int var6 = -957401312;
            int var7 = -1640531527;
            int var8 = 32;
            while (var8-- > 0) {
                var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
                var6 -= var7;
                var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
            }
            this.field2052 -= 8;
            this.method2387(var4);
            this.method2387(var5);
        }
    }

    @ObfuscatedName("dx.at([IIII)V")
    public void method2411(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2052;
        this.field2052 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2404();
            int var8 = this.method2404();
            int var9 = 0;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
                var9 += var10;
                var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
            }
            this.field2052 -= 8;
            this.method2387(var7);
            this.method2387(var8);
        }
        this.field2052 = var4;
    }

    @ObfuscatedName("dx.aa([IIIB)V")
    public void method2419(int[] arg0, int arg1, int arg2) {
        int var4 = this.field2052;
        this.field2052 = arg1;
        int var5 = (arg2 - arg1) / 8;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.method2404();
            int var8 = this.method2404();
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;
            while (var11-- > 0) {
                var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
                var9 -= var10;
                var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
            }
            this.field2052 -= 8;
            this.method2387(var7);
            this.method2387(var8);
        }
        this.field2052 = var4;
    }

    @ObfuscatedName("dx.as(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method2420(BigInteger arg0, BigInteger arg1) {
        int var3 = this.field2052;
        this.field2052 = 0;
        byte[] var4 = new byte[var3];
        this.method2564(var4, 0, var3);
        BigInteger var5 = new BigInteger(var4);
        BigInteger var6 = var5.modPow(arg0, arg1);
        byte[] var7 = var6.toByteArray();
        this.field2052 = 0;
        this.method2385(var7.length);
        this.method2393(var7, 0, var7.length);
    }

    @ObfuscatedName("dx.ao(II)I")
    public int method2421(int arg0) {
        byte[] var2 = this.field2053;
        int var3 = this.field2052;
        int var4 = -1;
        for (int var5 = arg0; var5 < var3; var5++) {
            var4 = var4 >>> 8 ^ field2056[(var4 ^ var2[var5]) & 0xFF];
        }
        int var6 = ~var4;
        this.method2387(var6);
        return var6;
    }

    @ObfuscatedName("dx.ai(I)Z")
    public boolean method2422() {
        this.field2052 -= 4;
        byte[] var1 = this.field2053;
        int var2 = this.field2052;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ field2056[(var3 ^ var1[var4]) & 0xFF];
        }
        int var5 = ~var3;
        int var8 = this.method2404();
        return var5 == var8;
    }

    @ObfuscatedName("dx.ap(II)V")
    public void method2423(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ak(IB)V")
    public void method2424(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (-arg0);
    }

    @ObfuscatedName("dx.ag(II)V")
    public void method2425(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (128 - arg0);
    }

    @ObfuscatedName("dx.az(B)I")
    public int method2543() {
        return this.field2053[++this.field2052 - 1] - 128 & 0xFF;
    }

    @ObfuscatedName("dx.au(I)I")
    public int method2427() {
        return -this.field2053[++this.field2052 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.af(I)I")
    public int method2428() {
        return 128 - this.field2053[++this.field2052 - 1] & 0xFF;
    }

    @ObfuscatedName("dx.al(I)B")
    public byte method2592() {
        return (byte) (-this.field2053[++this.field2052 - 1]);
    }

    @ObfuscatedName("dx.av(I)B")
    public byte method2430() {
        return (byte) (128 - this.field2053[++this.field2052 - 1]);
    }

    @ObfuscatedName("dx.ad(IB)V")
    public void method2493(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) arg0;
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.an(II)V")
    public void method2382(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 + 128);
    }

    @ObfuscatedName("dx.ab(IB)V")
    public void method2433(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 + 128);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bc(I)I")
    public int method2434() {
        this.field2052 += 2;
        return ((this.field2053[this.field2052 - 1] & 0xFF) << 8) + (this.field2053[this.field2052 - 2] & 0xFF);
    }

    @ObfuscatedName("dx.bk(B)I")
    public int method2435() {
        this.field2052 += 2;
        return ((this.field2053[this.field2052 - 2] & 0xFF) << 8) + (this.field2053[this.field2052 - 1] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bs(I)I")
    public int method2436() {
        this.field2052 += 2;
        return ((this.field2053[this.field2052 - 1] & 0xFF) << 8) + (this.field2053[this.field2052 - 2] - 128 & 0xFF);
    }

    @ObfuscatedName("dx.bv(I)I")
    public int method2516() {
        this.field2052 += 2;
        int var1 = ((this.field2053[this.field2052 - 1] & 0xFF) << 8) + (this.field2053[this.field2052 - 2] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @ObfuscatedName("dx.ba(IB)V")
    public void method2438(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2053[++this.field2052 - 1] = (byte) arg0;
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bb(I)I")
    public int method2445() {
        this.field2052 += 3;
        return (this.field2053[this.field2052 - 1] & 0xFF) + ((this.field2053[this.field2052 - 2] & 0xFF) << 16) + ((this.field2053[this.field2052 - 3] & 0xFF) << 8);
    }

    @ObfuscatedName("dx.bn(II)V")
    public void method2440(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) arg0;
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 24);
    }

    @ObfuscatedName("dx.bo(IB)V")
    public void method2441(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
        this.field2053[++this.field2052 - 1] = (byte) arg0;
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 24);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 16);
    }

    @ObfuscatedName("dx.bt(II)V")
    public void method2442(int arg0) {
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 16);
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 24);
        this.field2053[++this.field2052 - 1] = (byte) arg0;
        this.field2053[++this.field2052 - 1] = (byte) (arg0 >> 8);
    }

    @ObfuscatedName("dx.bw(I)I")
    public int method2443() {
        this.field2052 += 4;
        return (this.field2053[this.field2052 - 4] & 0xFF) + ((this.field2053[this.field2052 - 3] & 0xFF) << 8) + ((this.field2053[this.field2052 - 1] & 0xFF) << 24) + ((this.field2053[this.field2052 - 2] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bi(I)I")
    public int method2444() {
        this.field2052 += 4;
        return (this.field2053[this.field2052 - 3] & 0xFF) + ((this.field2053[this.field2052 - 4] & 0xFF) << 8) + ((this.field2053[this.field2052 - 2] & 0xFF) << 24) + ((this.field2053[this.field2052 - 1] & 0xFF) << 16);
    }

    @ObfuscatedName("dx.bh(I)I")
    public int method2431() {
        this.field2052 += 4;
        return (this.field2053[this.field2052 - 2] & 0xFF) + ((this.field2053[this.field2052 - 1] & 0xFF) << 8) + ((this.field2053[this.field2052 - 3] & 0xFF) << 24) + ((this.field2053[this.field2052 - 4] & 0xFF) << 16);
    }
}
